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

public class DivideTimeScaleTrack implements Track
{
    Track source;
    private int timeScaleDivisor;
    
    public DivideTimeScaleTrack(final Track source, final int timeScaleDivisor) {
        this.source = source;
        this.timeScaleDivisor = timeScaleDivisor;
    }
    
    List<CompositionTimeToSample.Entry> adjustCtts() {
        final List<CompositionTimeToSample.Entry> compositionTimeEntries = this.source.getCompositionTimeEntries();
        if (compositionTimeEntries != null) {
            final ArrayList list = new ArrayList<CompositionTimeToSample.Entry>(compositionTimeEntries.size());
            for (final CompositionTimeToSample.Entry entry : compositionTimeEntries) {
                list.add(new CompositionTimeToSample.Entry(entry.getCount(), entry.getOffset() / this.timeScaleDivisor));
            }
            return (List<CompositionTimeToSample.Entry>)list;
        }
        return null;
    }
    
    List<TimeToSampleBox.Entry> adjustTts() {
        final List<TimeToSampleBox.Entry> decodingTimeEntries = this.source.getDecodingTimeEntries();
        final LinkedList<TimeToSampleBox.Entry> list = new LinkedList<TimeToSampleBox.Entry>();
        for (final TimeToSampleBox.Entry entry : decodingTimeEntries) {
            list.add(new TimeToSampleBox.Entry(entry.getCount(), entry.getDelta() / this.timeScaleDivisor));
        }
        return list;
    }
    
    @Override
    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
        return this.adjustCtts();
    }
    
    @Override
    public List<TimeToSampleBox.Entry> getDecodingTimeEntries() {
        return this.adjustTts();
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
        trackMetaData.setTimescale(this.source.getTrackMetaData().getTimescale() / this.timeScaleDivisor);
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
