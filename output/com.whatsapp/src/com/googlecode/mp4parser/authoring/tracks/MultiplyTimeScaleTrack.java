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
import java.util.LinkedList;
import com.coremedia.iso.boxes.TimeToSampleBox;
import java.util.Iterator;
import java.util.ArrayList;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import java.util.List;
import com.googlecode.mp4parser.authoring.Track;

public class MultiplyTimeScaleTrack implements Track
{
    Track source;
    private int timeScaleFactor;
    
    public MultiplyTimeScaleTrack(final Track source, final int timeScaleFactor) {
        this.source = source;
        this.timeScaleFactor = timeScaleFactor;
    }
    
    static List<CompositionTimeToSample.Entry> adjustCtts(final List<CompositionTimeToSample.Entry> list, final int n) {
        if (list != null) {
            final ArrayList<CompositionTimeToSample.Entry> list2 = new ArrayList<CompositionTimeToSample.Entry>(list.size());
            for (final CompositionTimeToSample.Entry entry : list) {
                list2.add(new CompositionTimeToSample.Entry(entry.getCount(), n * entry.getOffset()));
            }
            return list2;
        }
        return null;
    }
    
    static List<TimeToSampleBox.Entry> adjustTts(final List<TimeToSampleBox.Entry> list, final int n) {
        final LinkedList<TimeToSampleBox.Entry> list2 = new LinkedList<TimeToSampleBox.Entry>();
        for (final TimeToSampleBox.Entry entry : list) {
            list2.add(new TimeToSampleBox.Entry(entry.getCount(), n * entry.getDelta()));
        }
        return list2;
    }
    
    @Override
    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
        return adjustCtts(this.source.getCompositionTimeEntries(), this.timeScaleFactor);
    }
    
    @Override
    public List<TimeToSampleBox.Entry> getDecodingTimeEntries() {
        return adjustTts(this.source.getDecodingTimeEntries(), this.timeScaleFactor);
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
        trackMetaData.setTimescale(this.source.getTrackMetaData().getTimescale() * this.timeScaleFactor);
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
        return "MultiplyTimeScaleTrack{source=" + this.source + '}';
    }
}
