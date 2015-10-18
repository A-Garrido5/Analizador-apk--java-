// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.piff;

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

public class TfrfBox extends AbstractFullBox
{
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    public List<Entry> entries;
    
    static {
        ajc$preClinit();
    }
    
    public TfrfBox() {
        super("uuid");
        this.entries = new ArrayList<Entry>();
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("TfrfBox.java", TfrfBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getFragmentCount", "com.googlecode.mp4parser.boxes.piff.TfrfBox", "", "", "", "long"), 91);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getEntries", "com.googlecode.mp4parser.boxes.piff.TfrfBox", "", "", "", "java.util.List"), 95);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.googlecode.mp4parser.boxes.piff.TfrfBox", "", "", "", "java.lang.String"), 100);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        for (int uInt8 = IsoTypeReader.readUInt8(byteBuffer), i = 0; i < uInt8; ++i) {
            final Entry entry = new Entry();
            if (this.getVersion() == 1) {
                entry.fragmentAbsoluteTime = IsoTypeReader.readUInt64(byteBuffer);
                entry.fragmentAbsoluteDuration = IsoTypeReader.readUInt64(byteBuffer);
            }
            else {
                entry.fragmentAbsoluteTime = IsoTypeReader.readUInt32(byteBuffer);
                entry.fragmentAbsoluteDuration = IsoTypeReader.readUInt32(byteBuffer);
            }
            this.entries.add(entry);
        }
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt8(byteBuffer, this.entries.size());
        for (final Entry entry : this.entries) {
            if (this.getVersion() == 1) {
                IsoTypeWriter.writeUInt64(byteBuffer, entry.fragmentAbsoluteTime);
                IsoTypeWriter.writeUInt64(byteBuffer, entry.fragmentAbsoluteDuration);
            }
            else {
                IsoTypeWriter.writeUInt32(byteBuffer, entry.fragmentAbsoluteTime);
                IsoTypeWriter.writeUInt32(byteBuffer, entry.fragmentAbsoluteDuration);
            }
        }
    }
    
    @Override
    protected long getContentSize() {
        final int size = this.entries.size();
        int n;
        if (this.getVersion() == 1) {
            n = 16;
        }
        else {
            n = 8;
        }
        return 5 + n * size;
    }
    
    public List<Entry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TfrfBox.ajc$tjp_1, this, this));
        return this.entries;
    }
    
    public long getFragmentCount() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TfrfBox.ajc$tjp_0, this, this));
        return this.entries.size();
    }
    
    @Override
    public byte[] getUserType() {
        return new byte[] { -44, -128, 126, -14, -54, 57, 70, -107, -114, 84, 38, -53, -98, 70, -89, -97 };
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TfrfBox.ajc$tjp_2, this, this));
        final StringBuilder sb = new StringBuilder();
        sb.append("TfrfBox");
        sb.append("{entries=").append(this.entries);
        sb.append('}');
        return sb.toString();
    }
    
    public class Entry
    {
        long fragmentAbsoluteDuration;
        long fragmentAbsoluteTime;
        
        public long getFragmentAbsoluteDuration() {
            return this.fragmentAbsoluteDuration;
        }
        
        public long getFragmentAbsoluteTime() {
            return this.fragmentAbsoluteTime;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Entry");
            sb.append("{fragmentAbsoluteTime=").append(this.fragmentAbsoluteTime);
            sb.append(", fragmentAbsoluteDuration=").append(this.fragmentAbsoluteDuration);
            sb.append('}');
            return sb.toString();
        }
    }
}
