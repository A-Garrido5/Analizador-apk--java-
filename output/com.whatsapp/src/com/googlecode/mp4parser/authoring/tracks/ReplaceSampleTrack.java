// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.authoring.tracks;

import java.util.AbstractList;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import java.nio.ByteBuffer;
import java.util.List;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.AbstractTrack;

public class ReplaceSampleTrack extends AbstractTrack
{
    Track origTrack;
    private Sample sampleContent;
    private long sampleNumber;
    private List<Sample> samples;
    
    public ReplaceSampleTrack(final Track origTrack, final long sampleNumber, final ByteBuffer byteBuffer) {
        this.origTrack = origTrack;
        this.sampleNumber = sampleNumber;
        this.sampleContent = new SampleImpl(byteBuffer);
        this.samples = new ReplaceASingleEntryList((ReplaceASingleEntryList)null);
    }
    
    @Override
    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
        return this.origTrack.getCompositionTimeEntries();
    }
    
    @Override
    public List<TimeToSampleBox.Entry> getDecodingTimeEntries() {
        return this.origTrack.getDecodingTimeEntries();
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
        return this.origTrack.getSampleDependencies();
    }
    
    @Override
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.origTrack.getSampleDescriptionBox();
    }
    
    @Override
    public List<Sample> getSamples() {
        return this.samples;
    }
    
    @Override
    public SubSampleInformationBox getSubsampleInformationBox() {
        return this.origTrack.getSubsampleInformationBox();
    }
    
    @Override
    public long[] getSyncSamples() {
        synchronized (this) {
            return this.origTrack.getSyncSamples();
        }
    }
    
    @Override
    public TrackMetaData getTrackMetaData() {
        return this.origTrack.getTrackMetaData();
    }
    
    private class ReplaceASingleEntryList extends AbstractList<Sample>
    {
        @Override
        public Sample get(final int n) {
            if (ReplaceSampleTrack.this.sampleNumber == n) {
                return ReplaceSampleTrack.this.sampleContent;
            }
            return ReplaceSampleTrack.this.origTrack.getSamples().get(n);
        }
        
        @Override
        public int size() {
            return ReplaceSampleTrack.this.origTrack.getSamples().size();
        }
    }
}
