// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.util.Iterator;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import java.util.ArrayList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class SampleDependencyTypeBox extends AbstractFullBox
{
    public static final String TYPE = "sdtp";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private List<Entry> entries;
    
    static {
        ajc$preClinit();
    }
    
    public SampleDependencyTypeBox() {
        super("sdtp");
        this.entries = new ArrayList<Entry>();
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("SampleDependencyTypeBox.java", SampleDependencyTypeBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getEntries", "com.coremedia.iso.boxes.SampleDependencyTypeBox", "", "", "", "java.util.List"), 139);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setEntries", "com.coremedia.iso.boxes.SampleDependencyTypeBox", "java.util.List", "entries", "", "void"), 143);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.SampleDependencyTypeBox", "", "", "", "java.lang.String"), 148);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        while (byteBuffer.remaining() > 0) {
            this.entries.add(new Entry(IsoTypeReader.readUInt8(byteBuffer)));
        }
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        final Iterator<Entry> iterator = this.entries.iterator();
        while (iterator.hasNext()) {
            IsoTypeWriter.writeUInt8(byteBuffer, iterator.next().value);
        }
    }
    
    @Override
    protected long getContentSize() {
        return 4 + this.entries.size();
    }
    
    public List<Entry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleDependencyTypeBox.ajc$tjp_0, this, this));
        return this.entries;
    }
    
    public void setEntries(final List<Entry> entries) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleDependencyTypeBox.ajc$tjp_1, this, this, entries));
        this.entries = entries;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleDependencyTypeBox.ajc$tjp_2, this, this));
        final StringBuilder sb = new StringBuilder();
        sb.append("SampleDependencyTypeBox");
        sb.append("{entries=").append(this.entries);
        sb.append('}');
        return sb.toString();
    }
    
    public static class Entry
    {
        private int value;
        
        public Entry(final int value) {
            this.value = value;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this != o) {
                if (o == null || this.getClass() != o.getClass()) {
                    return false;
                }
                if (this.value != ((Entry)o).value) {
                    return false;
                }
            }
            return true;
        }
        
        public int getReserved() {
            return 0x3 & this.value >> 6;
        }
        
        public int getSampleDependsOn() {
            return 0x3 & this.value >> 4;
        }
        
        public int getSampleHasRedundancy() {
            return 0x3 & this.value;
        }
        
        public int getSampleIsDependentOn() {
            return 0x3 & this.value >> 2;
        }
        
        @Override
        public int hashCode() {
            return this.value;
        }
        
        public void setReserved(final int n) {
            this.value = ((n & 0x3) << 6 | (0x3F & this.value));
        }
        
        public void setSampleDependsOn(final int n) {
            this.value = ((n & 0x3) << 4 | (0xCF & this.value));
        }
        
        public void setSampleHasRedundancy(final int n) {
            this.value = ((n & 0x3) | (0xFC & this.value));
        }
        
        public void setSampleIsDependentOn(final int n) {
            this.value = ((n & 0x3) << 2 | (0xF3 & this.value));
        }
        
        @Override
        public String toString() {
            return "Entry{reserved=" + this.getReserved() + ", sampleDependsOn=" + this.getSampleDependsOn() + ", sampleIsDependentOn=" + this.getSampleIsDependentOn() + ", sampleHasRedundancy=" + this.getSampleHasRedundancy() + '}';
        }
    }
}
