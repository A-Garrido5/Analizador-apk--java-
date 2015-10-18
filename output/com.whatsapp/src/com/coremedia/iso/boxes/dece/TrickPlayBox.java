// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes.dece;

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

public class TrickPlayBox extends AbstractFullBox
{
    public static final String TYPE = "trik";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private List<Entry> entries;
    
    static {
        ajc$preClinit();
    }
    
    public TrickPlayBox() {
        super("trik");
        this.entries = new ArrayList<Entry>();
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("TrickPlayBox.java", TrickPlayBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setEntries", "com.coremedia.iso.boxes.dece.TrickPlayBox", "java.util.List", "entries", "", "void"), 32);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getEntries", "com.coremedia.iso.boxes.dece.TrickPlayBox", "", "", "", "java.util.List"), 36);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.dece.TrickPlayBox", "", "", "", "java.lang.String"), 103);
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
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrickPlayBox.ajc$tjp_1, this, this));
        return this.entries;
    }
    
    public void setEntries(final List<Entry> entries) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrickPlayBox.ajc$tjp_0, this, this, entries));
        this.entries = entries;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrickPlayBox.ajc$tjp_2, this, this));
        final StringBuilder sb = new StringBuilder();
        sb.append("TrickPlayBox");
        sb.append("{entries=").append(this.entries);
        sb.append('}');
        return sb.toString();
    }
    
    public static class Entry
    {
        private int value;
        
        public Entry() {
        }
        
        public Entry(final int value) {
            this.value = value;
        }
        
        public int getDependencyLevel() {
            return 0x3F & this.value;
        }
        
        public int getPicType() {
            return 0x3 & this.value >> 6;
        }
        
        public void setDependencyLevel(final int n) {
            this.value |= (n & 0x3F);
        }
        
        public void setPicType(final int n) {
            this.value &= 0x1F;
            this.value |= (n & 0x3) << 6;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Entry");
            sb.append("{picType=").append(this.getPicType());
            sb.append(",dependencyLevel=").append(this.getDependencyLevel());
            sb.append('}');
            return sb.toString();
        }
    }
}
