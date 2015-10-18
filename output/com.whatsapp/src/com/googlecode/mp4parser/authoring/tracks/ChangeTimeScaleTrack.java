// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.authoring.tracks;

import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.googlecode.mp4parser.authoring.Sample;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.Box;
import java.util.Collection;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ArrayList;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import java.util.List;
import java.util.logging.Logger;
import com.googlecode.mp4parser.authoring.Track;

public class ChangeTimeScaleTrack implements Track
{
    private static final Logger LOG;
    List<CompositionTimeToSample.Entry> ctts;
    Track source;
    long timeScale;
    List<TimeToSampleBox.Entry> tts;
    
    static {
        LOG = Logger.getLogger(ChangeTimeScaleTrack.class.getName());
    }
    
    public ChangeTimeScaleTrack(final Track source, final long timeScale, final long[] array) {
        this.source = source;
        this.timeScale = timeScale;
        final double n = timeScale / source.getTrackMetaData().getTimescale();
        this.ctts = adjustCtts(source.getCompositionTimeEntries(), n);
        this.tts = adjustTts(source.getDecodingTimeEntries(), n, array, getTimes(source, array, timeScale));
    }
    
    static List<CompositionTimeToSample.Entry> adjustCtts(final List<CompositionTimeToSample.Entry> list, final double n) {
        if (list != null) {
            final ArrayList<CompositionTimeToSample.Entry> list2 = new ArrayList<CompositionTimeToSample.Entry>(list.size());
            for (final CompositionTimeToSample.Entry entry : list) {
                list2.add(new CompositionTimeToSample.Entry(entry.getCount(), (int)Math.round(n * entry.getOffset())));
            }
            return list2;
        }
        return null;
    }
    
    static List<TimeToSampleBox.Entry> adjustTts(final List<TimeToSampleBox.Entry> list, final double n, final long[] array, final long[] array2) {
        final long[] blowupTimeToSamples = TimeToSampleBox.blowupTimeToSamples(list);
        long n2 = 0L;
        final LinkedList<TimeToSampleBox.Entry> list2 = new LinkedList<TimeToSampleBox.Entry>();
        for (int i = 1; i <= blowupTimeToSamples.length; ++i) {
            long round = Math.round(n * blowupTimeToSamples[i - 1]);
            final TimeToSampleBox.Entry entry = list2.peekLast();
            final int binarySearch = Arrays.binarySearch(array, i + 1);
            if (binarySearch >= 0 && array2[binarySearch] != n2) {
                final long n3 = array2[binarySearch] - (n2 + round);
                ChangeTimeScaleTrack.LOG.finest(String.format("Sample %d %d / %d - correct by %d", i, n2, array2[binarySearch], n3));
                round += n3;
            }
            n2 += round;
            if (entry == null) {
                list2.add(new TimeToSampleBox.Entry(1L, round));
            }
            else if (entry.getDelta() != round) {
                list2.add(new TimeToSampleBox.Entry(1L, round));
            }
            else {
                entry.setCount(1L + entry.getCount());
            }
        }
        return list2;
    }
    
    private static long[] getTimes(final Track track, final long[] array, final long n) {
        final long[] array2 = new long[array.length];
        final LinkedList<Object> list = new LinkedList<Object>(track.getDecodingTimeEntries());
        int n2 = 1;
        long n3 = 0L;
        long delta = 0L;
        int n4 = 0;
        long n5 = 0L;
        while (n2 <= array[-1 + array.length]) {
            final int n6 = n2 + 1;
            if (n2 == array[n4]) {
                final int n7 = n4 + 1;
                array2[n4] = n3 * n / track.getTrackMetaData().getTimescale();
                n4 = n7;
            }
            final long n8 = n5 - 1L;
            if (n5 == 0L) {
                final TimeToSampleBox.Entry entry = list.poll();
                n5 = entry.getCount() - 1L;
                delta = entry.getDelta();
            }
            else {
                n5 = n8;
            }
            n3 += delta;
            n2 = n6;
        }
        return array2;
    }
    
    @Override
    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
        return this.ctts;
    }
    
    @Override
    public List<TimeToSampleBox.Entry> getDecodingTimeEntries() {
        return this.tts;
    }
    
    @Override
    public String getHandler() {
        return this.source.getHandler();
    }
    
    @Override
    public Box getMediaHeaderBox() {
        return this.source.getMediaHeaderBox();
    }
    
    @Override
    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return this.source.getSampleDependencies();
    }
    
    @Override
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.source.getSampleDescriptionBox();
    }
    
    @Override
    public List<Sample> getSamples() {
        return this.source.getSamples();
    }
    
    @Override
    public SubSampleInformationBox getSubsampleInformationBox() {
        return this.source.getSubsampleInformationBox();
    }
    
    @Override
    public long[] getSyncSamples() {
        return this.source.getSyncSamples();
    }
    
    @Override
    public TrackMetaData getTrackMetaData() {
        final TrackMetaData trackMetaData = (TrackMetaData)this.source.getTrackMetaData().clone();
        trackMetaData.setTimescale(this.timeScale);
        return trackMetaData;
    }
    
    @Override
    public boolean isEnabled() {
        return this.source.isEnabled();
    }
    
    @Override
    public boolean isInMovie() {
        return this.source.isInMovie();
    }
    
    @Override
    public boolean isInPoster() {
        return this.source.isInPoster();
    }
    
    @Override
    public boolean isInPreview() {
        return this.source.isInPreview();
    }
    
    @Override
    public String toString() {
        return "ChangeTimeScaleTrack{source=" + this.source + '}';
    }
}
