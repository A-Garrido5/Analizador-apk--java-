// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.util.Iterator;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.util.CastUtils;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class SampleToGroupBox extends AbstractFullBox
{
    public static final String TYPE = "sbgp";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    List<Entry> entries;
    private String groupingType;
    private String groupingTypeParameter;
    
    static {
        ajc$preClinit();
    }
    
    public SampleToGroupBox() {
        super("sbgp");
        this.entries = new LinkedList<Entry>();
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("SampleToGroupBox.java", SampleToGroupBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getGroupingType", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "", "", "", "java.lang.String"), 150);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setGroupingType", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "java.lang.String", "groupingType", "", "void"), 154);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getGroupingTypeParameter", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "", "", "", "java.lang.String"), 158);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setGroupingTypeParameter", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "java.lang.String", "groupingTypeParameter", "", "void"), 162);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "", "", "", "java.util.List"), 166);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "java.util.List", "entries", "", "void"), 170);
    }
    
    @Override
    protected void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.groupingType = IsoTypeReader.read4cc(byteBuffer);
        if (this.getVersion() == 1) {
            this.groupingTypeParameter = IsoTypeReader.read4cc(byteBuffer);
        }
        long uInt32 = IsoTypeReader.readUInt32(byteBuffer);
        while (true) {
            final long n = uInt32 - 1L;
            if (uInt32 <= 0L) {
                break;
            }
            this.entries.add(new Entry(CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer)), CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer))));
            uInt32 = n;
        }
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.put(this.groupingType.getBytes());
        if (this.getVersion() == 1) {
            byteBuffer.put(this.groupingTypeParameter.getBytes());
        }
        IsoTypeWriter.writeUInt32(byteBuffer, this.entries.size());
        for (final Entry entry : this.entries) {
            IsoTypeWriter.writeUInt32(byteBuffer, entry.getSampleCount());
            IsoTypeWriter.writeUInt32(byteBuffer, entry.getGroupDescriptionIndex());
        }
    }
    
    @Override
    protected long getContentSize() {
        int n;
        if (this.getVersion() == 1) {
            n = 16 + 8 * this.entries.size();
        }
        else {
            n = 12 + 8 * this.entries.size();
        }
        return n;
    }
    
    public List<Entry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleToGroupBox.ajc$tjp_4, this, this));
        return this.entries;
    }
    
    public String getGroupingType() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleToGroupBox.ajc$tjp_0, this, this));
        return this.groupingType;
    }
    
    public String getGroupingTypeParameter() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleToGroupBox.ajc$tjp_2, this, this));
        return this.groupingTypeParameter;
    }
    
    public void setEntries(final List<Entry> entries) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleToGroupBox.ajc$tjp_5, this, this, entries));
        this.entries = entries;
    }
    
    public void setGroupingType(final String groupingType) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleToGroupBox.ajc$tjp_1, this, this, groupingType));
        this.groupingType = groupingType;
    }
    
    public void setGroupingTypeParameter(final String groupingTypeParameter) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleToGroupBox.ajc$tjp_3, this, this, groupingTypeParameter));
        this.groupingTypeParameter = groupingTypeParameter;
    }
    
    public static class Entry
    {
        private int groupDescriptionIndex;
        private long sampleCount;
        
        public Entry(final long sampleCount, final int groupDescriptionIndex) {
            this.sampleCount = sampleCount;
            this.groupDescriptionIndex = groupDescriptionIndex;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this != o) {
                if (o == null || this.getClass() != o.getClass()) {
                    return false;
                }
                final Entry entry = (Entry)o;
                if (this.groupDescriptionIndex != entry.groupDescriptionIndex) {
                    return false;
                }
                if (this.sampleCount != entry.sampleCount) {
                    return false;
                }
            }
            return true;
        }
        
        public int getGroupDescriptionIndex() {
            return this.groupDescriptionIndex;
        }
        
        public long getSampleCount() {
            return this.sampleCount;
        }
        
        @Override
        public int hashCode() {
            return 31 * (int)(this.sampleCount ^ this.sampleCount >>> 32) + this.groupDescriptionIndex;
        }
        
        public void setGroupDescriptionIndex(final int groupDescriptionIndex) {
            this.groupDescriptionIndex = groupDescriptionIndex;
        }
        
        public void setSampleCount(final long sampleCount) {
            this.sampleCount = sampleCount;
        }
        
        @Override
        public String toString() {
            return "Entry{sampleCount=" + this.sampleCount + ", groupDescriptionIndex=" + this.groupDescriptionIndex + '}';
        }
    }
}
