// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.authoring.tracks;

import com.googlecode.mp4parser.authoring.TrackMetaData;
import java.util.Arrays;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.googlecode.mp4parser.authoring.Sample;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.Box;
import java.util.LinkedList;
import com.coremedia.iso.boxes.TimeToSampleBox;
import java.util.ListIterator;
import java.util.ArrayList;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import java.util.List;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.AbstractTrack;

public class CroppedTrack extends AbstractTrack
{
    private int fromSample;
    Track origTrack;
    private long[] syncSampleArray;
    private int toSample;
    
    public CroppedTrack(final Track origTrack, final long n, final long n2) {
        this.origTrack = origTrack;
        assert n <= 2147483647L;
        assert n2 <= 2147483647L;
        this.fromSample = (int)n;
        this.toSample = (int)n2;
    }
    
    static List<CompositionTimeToSample.Entry> getCompositionTimeEntries(final List<CompositionTimeToSample.Entry> list, final long n, final long n2) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        long n3 = 0L;
        final ListIterator<CompositionTimeToSample.Entry> listIterator = list.listIterator();
        final ArrayList<CompositionTimeToSample.Entry> list2 = new ArrayList<CompositionTimeToSample.Entry>();
        CompositionTimeToSample.Entry entry;
        while (true) {
            entry = listIterator.next();
            if (n3 + entry.getCount() > n) {
                break;
            }
            n3 += entry.getCount();
        }
        if (n3 + entry.getCount() >= n2) {
            list2.add(new CompositionTimeToSample.Entry((int)(n2 - n), entry.getOffset()));
            return list2;
        }
        list2.add(new CompositionTimeToSample.Entry((int)(n3 + entry.getCount() - n), entry.getOffset()));
        long n4 = n3 + entry.getCount();
        while (listIterator.hasNext()) {
            entry = listIterator.next();
            if (n4 + entry.getCount() >= n2) {
                break;
            }
            list2.add(entry);
            n4 += entry.getCount();
        }
        list2.add(new CompositionTimeToSample.Entry((int)(n2 - n4), entry.getOffset()));
        return list2;
    }
    
    static List<TimeToSampleBox.Entry> getDecodingTimeEntries(final List<TimeToSampleBox.Entry> list, final long n, final long n2) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        long n3 = 0L;
        final ListIterator<TimeToSampleBox.Entry> listIterator = list.listIterator();
        final LinkedList<TimeToSampleBox.Entry> list2 = new LinkedList<TimeToSampleBox.Entry>();
        TimeToSampleBox.Entry entry;
        while (true) {
            entry = listIterator.next();
            if (n3 + entry.getCount() > n) {
                break;
            }
            n3 += entry.getCount();
        }
        if (n3 + entry.getCount() >= n2) {
            list2.add(new TimeToSampleBox.Entry(n2 - n, entry.getDelta()));
            return list2;
        }
        list2.add(new TimeToSampleBox.Entry(n3 + entry.getCount() - n, entry.getDelta()));
        long n4 = n3 + entry.getCount();
        while (listIterator.hasNext()) {
            entry = listIterator.next();
            if (n4 + entry.getCount() >= n2) {
                break;
            }
            list2.add(entry);
            n4 += entry.getCount();
        }
        list2.add(new TimeToSampleBox.Entry(n2 - n4, entry.getDelta()));
        return list2;
    }
    
    @Override
    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
        return getCompositionTimeEntries(this.origTrack.getCompositionTimeEntries(), this.fromSample, this.toSample);
    }
    
    @Override
    public List<TimeToSampleBox.Entry> getDecodingTimeEntries() {
        return getDecodingTimeEntries(this.origTrack.getDecodingTimeEntries(), this.fromSample, this.toSample);
    }
    
    @Override
    public String getHandler() {
        return this.origTrack.getHandler();
    }
    
    @Override
    public Box getMediaHeaderBox() {
        return this.origTrack.getMediaHeaderBox();
    }
    
    @Override
    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        if (this.origTrack.getSampleDependencies() != null && !this.origTrack.getSampleDependencies().isEmpty()) {
            return this.origTrack.getSampleDependencies().subList(this.fromSample, this.toSample);
        }
        return null;
    }
    
    @Override
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.origTrack.getSampleDescriptionBox();
    }
    
    @Override
    public List<Sample> getSamples() {
        return this.origTrack.getSamples().subList(this.fromSample, this.toSample);
    }
    
    @Override
    public SubSampleInformationBox getSubsampleInformationBox() {
        return this.origTrack.getSubsampleInformationBox();
    }
    
    @Override
    public long[] getSyncSamples() {
        synchronized (this) {
            long[] syncSampleArray2;
            if (this.origTrack.getSyncSamples() != null) {
                final long[] syncSamples = this.origTrack.getSyncSamples();
                int n = 0;
                int length = syncSamples.length;
                while (n < syncSamples.length && syncSamples[n] < this.fromSample) {
                    ++n;
                }
                while (length > 0 && this.toSample < syncSamples[length - 1]) {
                    --length;
                }
                this.syncSampleArray = Arrays.copyOfRange(this.origTrack.getSyncSamples(), n, length);
                for (int i = 0; i < this.syncSampleArray.length; ++i) {
                    final long[] syncSampleArray = this.syncSampleArray;
                    syncSampleArray[i] -= this.fromSample;
                }
                syncSampleArray2 = this.syncSampleArray;
            }
            else {
                syncSampleArray2 = null;
            }
            return syncSampleArray2;
        }
    }
    
    @Override
    public TrackMetaData getTrackMetaData() {
        return this.origTrack.getTrackMetaData();
    }
}
