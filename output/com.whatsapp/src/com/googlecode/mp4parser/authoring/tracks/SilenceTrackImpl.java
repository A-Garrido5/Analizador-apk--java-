// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.authoring.tracks;

import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.Box;
import java.util.Collections;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import com.googlecode.mp4parser.authoring.Sample;
import java.util.List;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.googlecode.mp4parser.authoring.Track;

public class SilenceTrackImpl implements Track
{
    TimeToSampleBox.Entry entry;
    List<Sample> samples;
    Track source;
    
    public SilenceTrackImpl(final Track source, final long n) {
        this.samples = new LinkedList<Sample>();
        this.source = source;
        if ("mp4a".equals(source.getSampleDescriptionBox().getSampleEntry().getType())) {
            final long n2 = n * this.getTrackMetaData().getTimescale() / 1000L / 1024L;
            this.entry = new TimeToSampleBox.Entry(n2, n * this.getTrackMetaData().getTimescale() / n2 / 1000L);
            long n3 = n2;
            while (true) {
                final long n4 = n3 - 1L;
                if (n3 <= 0L) {
                    break;
                }
                this.samples.add(new SampleImpl((ByteBuffer)ByteBuffer.wrap(new byte[] { 33, 16, 4, 96, -116, 28 }).rewind()));
                n3 = n4;
            }
            return;
        }
        throw new RuntimeException("Tracks of type " + source.getClass().getSimpleName() + " are not supported");
    }
    
    @Override
    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
        return null;
    }
    
    @Override
    public List<TimeToSampleBox.Entry> getDecodingTimeEntries() {
        return Collections.singletonList(this.entry);
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
        return null;
    }
    
    @Override
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.source.getSampleDescriptionBox();
    }
    
    @Override
    public List<Sample> getSamples() {
        return this.samples;
    }
    
    @Override
    public SubSampleInformationBox getSubsampleInformationBox() {
        return null;
    }
    
    @Override
    public long[] getSyncSamples() {
        return null;
    }
    
    @Override
    public TrackMetaData getTrackMetaData() {
        return this.source.getTrackMetaData();
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
}
