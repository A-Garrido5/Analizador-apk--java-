// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.googlecode.mp4parser.authoring.SampleImpl;
import java.nio.ByteBuffer;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.boxes.adobe.ActionMessageFormat0SampleEntryBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.NullMediaHeaderBox;
import com.coremedia.iso.boxes.Box;
import java.util.Iterator;
import java.util.Collections;
import java.util.Collection;
import java.util.LinkedList;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import java.util.List;
import java.util.Date;
import java.util.TreeMap;
import java.util.Map;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import java.util.SortedMap;
import com.googlecode.mp4parser.authoring.AbstractTrack;

public class Amf0Track extends AbstractTrack
{
    SortedMap<Long, byte[]> rawSamples;
    private TrackMetaData trackMetaData;
    
    public Amf0Track(final Map<Long, byte[]> map) {
        this.rawSamples = new TreeMap<Long, byte[]>() {};
        this.trackMetaData = new TrackMetaData();
        this.rawSamples = new TreeMap<Long, byte[]>(map);
        this.trackMetaData.setCreationTime(new Date());
        this.trackMetaData.setModificationTime(new Date());
        this.trackMetaData.setTimescale(1000L);
        this.trackMetaData.setLanguage("eng");
    }
    
    @Override
    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
        return null;
    }
    
    @Override
    public List<TimeToSampleBox.Entry> getDecodingTimeEntries() {
        final LinkedList<TimeToSampleBox.Entry> list = new LinkedList<TimeToSampleBox.Entry>();
        final LinkedList<Long> list2 = new LinkedList<Long>(this.rawSamples.keySet());
        Collections.sort((List<Comparable>)list2);
        long longValue = 0L;
        for (final Long n : list2) {
            final long n2 = n - longValue;
            if (list.size() > 0 && list.peek().getDelta() == n2) {
                list.peek().setCount(1L + list.peek().getCount());
            }
            else {
                list.add(new TimeToSampleBox.Entry(1L, n2));
            }
            longValue = n;
        }
        return list;
    }
    
    @Override
    public String getHandler() {
        return "data";
    }
    
    @Override
    public Box getMediaHeaderBox() {
        return new NullMediaHeaderBox();
    }
    
    @Override
    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return null;
    }
    
    @Override
    public SampleDescriptionBox getSampleDescriptionBox() {
        final SampleDescriptionBox sampleDescriptionBox = new SampleDescriptionBox();
        final ActionMessageFormat0SampleEntryBox actionMessageFormat0SampleEntryBox = new ActionMessageFormat0SampleEntryBox();
        actionMessageFormat0SampleEntryBox.setDataReferenceIndex(1);
        sampleDescriptionBox.addBox(actionMessageFormat0SampleEntryBox);
        return sampleDescriptionBox;
    }
    
    @Override
    public List<Sample> getSamples() {
        final LinkedList<SampleImpl> list = (LinkedList<SampleImpl>)new LinkedList<Sample>();
        final Iterator<byte[]> iterator = this.rawSamples.values().iterator();
        while (iterator.hasNext()) {
            list.add(new SampleImpl(ByteBuffer.wrap(iterator.next())));
        }
        return (List<Sample>)list;
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
        return this.trackMetaData;
    }
}
