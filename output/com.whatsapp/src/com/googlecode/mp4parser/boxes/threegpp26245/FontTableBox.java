// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.threegpp26245;

import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.util.Iterator;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractBox;

public class FontTableBox extends AbstractBox
{
    public static final String TYPE = "ftab";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    List<FontRecord> entries;
    
    static {
        ajc$preClinit();
    }
    
    public FontTableBox() {
        super("ftab");
        this.entries = new LinkedList<FontRecord>();
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("FontTableBox.java", FontTableBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getEntries", "com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox", "", "", "", "java.util.List"), 52);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setEntries", "com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox", "java.util.List", "entries", "", "void"), 56);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        for (int uInt16 = IsoTypeReader.readUInt16(byteBuffer), i = 0; i < uInt16; ++i) {
            final FontRecord fontRecord = new FontRecord();
            fontRecord.parse(byteBuffer);
            this.entries.add(fontRecord);
        }
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        IsoTypeWriter.writeUInt16(byteBuffer, this.entries.size());
        final Iterator<FontRecord> iterator = this.entries.iterator();
        while (iterator.hasNext()) {
            iterator.next().getContent(byteBuffer);
        }
    }
    
    @Override
    protected long getContentSize() {
        int n = 2;
        final Iterator<FontRecord> iterator = this.entries.iterator();
        while (iterator.hasNext()) {
            n += iterator.next().getSize();
        }
        return n;
    }
    
    public List<FontRecord> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(FontTableBox.ajc$tjp_0, this, this));
        return this.entries;
    }
    
    public void setEntries(final List<FontRecord> entries) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(FontTableBox.ajc$tjp_1, this, this, entries));
        this.entries = entries;
    }
    
    public static class FontRecord
    {
        int fontId;
        String fontname;
        
        public FontRecord() {
        }
        
        public FontRecord(final int fontId, final String fontname) {
            this.fontId = fontId;
            this.fontname = fontname;
        }
        
        public void getContent(final ByteBuffer byteBuffer) {
            IsoTypeWriter.writeUInt16(byteBuffer, this.fontId);
            IsoTypeWriter.writeUInt8(byteBuffer, this.fontname.length());
            byteBuffer.put(Utf8.convert(this.fontname));
        }
        
        public int getSize() {
            return 3 + Utf8.utf8StringLengthInBytes(this.fontname);
        }
        
        public void parse(final ByteBuffer byteBuffer) {
            this.fontId = IsoTypeReader.readUInt16(byteBuffer);
            this.fontname = IsoTypeReader.readString(byteBuffer, IsoTypeReader.readUInt8(byteBuffer));
        }
        
        @Override
        public String toString() {
            return "FontRecord{fontId=" + this.fontId + ", fontname='" + this.fontname + '\'' + '}';
        }
    }
}
