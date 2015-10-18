// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.SubSampleInformationBox;
import java.io.IOException;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.ByteArrayOutputStream;
import com.googlecode.mp4parser.authoring.SampleImpl;
import java.nio.ByteBuffer;
import com.googlecode.mp4parser.authoring.Sample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.NullMediaHeaderBox;
import com.coremedia.iso.boxes.AbstractMediaHeaderBox;
import java.util.Iterator;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import java.util.Date;
import java.util.Collections;
import com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.sampleentry.TextSampleEntry;
import java.util.LinkedList;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import java.util.List;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.googlecode.mp4parser.authoring.AbstractTrack;

public class TextTrackImpl extends AbstractTrack
{
    SampleDescriptionBox sampleDescriptionBox;
    List<Line> subs;
    TrackMetaData trackMetaData;
    
    public TextTrackImpl() {
        this.trackMetaData = new TrackMetaData();
        this.subs = new LinkedList<Line>();
        this.sampleDescriptionBox = new SampleDescriptionBox();
        final TextSampleEntry textSampleEntry = new TextSampleEntry("tx3g");
        textSampleEntry.setDataReferenceIndex(1);
        textSampleEntry.setStyleRecord(new TextSampleEntry.StyleRecord());
        textSampleEntry.setBoxRecord(new TextSampleEntry.BoxRecord());
        this.sampleDescriptionBox.addBox(textSampleEntry);
        final FontTableBox fontTableBox = new FontTableBox();
        fontTableBox.setEntries(Collections.singletonList(new FontTableBox.FontRecord(1, "Serif")));
        textSampleEntry.addBox(fontTableBox);
        this.trackMetaData.setCreationTime(new Date());
        this.trackMetaData.setModificationTime(new Date());
        this.trackMetaData.setTimescale(1000L);
    }
    
    @Override
    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
        return null;
    }
    
    @Override
    public List<TimeToSampleBox.Entry> getDecodingTimeEntries() {
        final LinkedList<TimeToSampleBox.Entry> list = new LinkedList<TimeToSampleBox.Entry>();
        long to = 0L;
        for (final Line line : this.subs) {
            final long n = line.from - to;
            if (n > 0L) {
                list.add(new TimeToSampleBox.Entry(1L, n));
            }
            else if (n < 0L) {
                throw new Error("Subtitle display times may not intersect");
            }
            list.add(new TimeToSampleBox.Entry(1L, line.to - line.from));
            to = line.to;
        }
        return list;
    }
    
    @Override
    public String getHandler() {
        return "sbtl";
    }
    
    @Override
    public AbstractMediaHeaderBox getMediaHeaderBox() {
        return new NullMediaHeaderBox();
    }
    
    @Override
    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return null;
    }
    
    @Override
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.sampleDescriptionBox;
    }
    
    @Override
    public List<Sample> getSamples() {
        final LinkedList<SampleImpl> list = (LinkedList<SampleImpl>)new LinkedList<Sample>();
        long to = 0L;
        for (final Line line : this.subs) {
            final long n = line.from - to;
            Label_0168: {
                if (n <= 0L) {
                    break Label_0168;
                }
                list.add(new SampleImpl(ByteBuffer.wrap(new byte[2])));
            Label_0081:
                while (true) {
                    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    final DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    try {
                        dataOutputStream.writeShort(line.text.getBytes("UTF-8").length);
                        dataOutputStream.write(line.text.getBytes("UTF-8"));
                        dataOutputStream.close();
                        list.add(new SampleImpl(ByteBuffer.wrap(byteArrayOutputStream.toByteArray())));
                        to = line.to;
                        break;
                        // iftrue(Label_0081:, n >= 0L)
                        throw new Error("Subtitle display times may not intersect");
                    }
                    catch (IOException ex) {
                        throw new Error("VM is broken. Does not support UTF-8");
                    }
                }
            }
        }
        return (List<Sample>)list;
    }
    
    public List<Line> getSubs() {
        return this.subs;
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
    
    public static class Line
    {
        long from;
        String text;
        long to;
        
        public Line(final long from, final long to, final String text) {
            this.from = from;
            this.to = to;
            this.text = text;
        }
        
        public long getFrom() {
            return this.from;
        }
        
        public String getText() {
            return this.text;
        }
        
        public long getTo() {
            return this.to;
        }
    }
}
