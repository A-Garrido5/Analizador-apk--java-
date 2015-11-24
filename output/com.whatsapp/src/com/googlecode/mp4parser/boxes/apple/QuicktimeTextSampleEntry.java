// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.apple;

import java.util.List;
import com.coremedia.iso.IsoTypeReader;
import com.googlecode.mp4parser.util.CastUtils;
import com.coremedia.iso.BoxParser;
import java.nio.channels.FileChannel;
import java.io.IOException;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;

public class QuicktimeTextSampleEntry extends AbstractSampleEntry
{
    public static final String TYPE = "text";
    int backgroundB;
    int backgroundG;
    int backgroundR;
    int dataReferenceIndex;
    long defaultTextBox;
    int displayFlags;
    short fontFace;
    String fontName;
    short fontNumber;
    int foregroundB;
    int foregroundG;
    int foregroundR;
    long reserved1;
    byte reserved2;
    short reserved3;
    int textJustification;
    
    public QuicktimeTextSampleEntry() {
        super("text");
        this.foregroundR = 65535;
        this.foregroundG = 65535;
        this.foregroundB = 65535;
        this.fontName = "";
    }
    
    @Override
    public void addBox(final Box box) {
        throw new RuntimeException("QuicktimeTextSampleEntries may not have child boxes");
    }
    
    public int getBackgroundB() {
        return this.backgroundB;
    }
    
    public int getBackgroundG() {
        return this.backgroundG;
    }
    
    public int getBackgroundR() {
        return this.backgroundR;
    }
    
    @Override
    public void getBox(final WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(this.getHeader());
        int length;
        if (this.fontName != null) {
            length = this.fontName.length();
        }
        else {
            length = 0;
        }
        final ByteBuffer allocate = ByteBuffer.allocate(length + 52);
        allocate.position(6);
        IsoTypeWriter.writeUInt16(allocate, this.dataReferenceIndex);
        allocate.putInt(this.displayFlags);
        allocate.putInt(this.textJustification);
        IsoTypeWriter.writeUInt16(allocate, this.backgroundR);
        IsoTypeWriter.writeUInt16(allocate, this.backgroundG);
        IsoTypeWriter.writeUInt16(allocate, this.backgroundB);
        IsoTypeWriter.writeUInt64(allocate, this.defaultTextBox);
        IsoTypeWriter.writeUInt64(allocate, this.reserved1);
        allocate.putShort(this.fontNumber);
        allocate.putShort(this.fontFace);
        allocate.put(this.reserved2);
        allocate.putShort(this.reserved3);
        IsoTypeWriter.writeUInt16(allocate, this.foregroundR);
        IsoTypeWriter.writeUInt16(allocate, this.foregroundG);
        IsoTypeWriter.writeUInt16(allocate, this.foregroundB);
        if (this.fontName != null) {
            IsoTypeWriter.writeUInt8(allocate, this.fontName.length());
            allocate.put(this.fontName.getBytes());
        }
        writableByteChannel.write((ByteBuffer)allocate.rewind());
    }
    
    public long getDefaultTextBox() {
        return this.defaultTextBox;
    }
    
    public int getDisplayFlags() {
        return this.displayFlags;
    }
    
    public short getFontFace() {
        return this.fontFace;
    }
    
    public String getFontName() {
        return this.fontName;
    }
    
    public short getFontNumber() {
        return this.fontNumber;
    }
    
    public int getForegroundB() {
        return this.foregroundB;
    }
    
    public int getForegroundG() {
        return this.foregroundG;
    }
    
    public int getForegroundR() {
        return this.foregroundR;
    }
    
    public long getReserved1() {
        return this.reserved1;
    }
    
    public byte getReserved2() {
        return this.reserved2;
    }
    
    public short getReserved3() {
        return this.reserved3;
    }
    
    @Override
    public long getSize() {
        final long n = 52L + this.getContainerSize();
        int length;
        if (this.fontName != null) {
            length = this.fontName.length();
        }
        else {
            length = 0;
        }
        final long n2 = n + length;
        int n3;
        if (this.largeBox || 8L + n2 >= 4294967296L) {
            n3 = 16;
        }
        else {
            n3 = 8;
        }
        return n2 + n3;
    }
    
    public int getTextJustification() {
        return this.textJustification;
    }
    
    @Override
    public void parse(final FileChannel fileChannel, final ByteBuffer byteBuffer, final long n, final BoxParser boxParser) throws IOException {
        final ByteBuffer allocate = ByteBuffer.allocate(CastUtils.l2i(n));
        fileChannel.read(allocate);
        allocate.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(allocate);
        this.displayFlags = allocate.getInt();
        this.textJustification = allocate.getInt();
        this.backgroundR = IsoTypeReader.readUInt16(allocate);
        this.backgroundG = IsoTypeReader.readUInt16(allocate);
        this.backgroundB = IsoTypeReader.readUInt16(allocate);
        this.defaultTextBox = IsoTypeReader.readUInt64(allocate);
        this.reserved1 = IsoTypeReader.readUInt64(allocate);
        this.fontNumber = allocate.getShort();
        this.fontFace = allocate.getShort();
        this.reserved2 = allocate.get();
        this.reserved3 = allocate.getShort();
        this.foregroundR = IsoTypeReader.readUInt16(allocate);
        this.foregroundG = IsoTypeReader.readUInt16(allocate);
        this.foregroundB = IsoTypeReader.readUInt16(allocate);
        if (allocate.remaining() > 0) {
            final byte[] array = new byte[IsoTypeReader.readUInt8(allocate)];
            allocate.get(array);
            this.fontName = new String(array);
            return;
        }
        this.fontName = null;
    }
    
    public void setBackgroundB(final int backgroundB) {
        this.backgroundB = backgroundB;
    }
    
    public void setBackgroundG(final int backgroundG) {
        this.backgroundG = backgroundG;
    }
    
    public void setBackgroundR(final int backgroundR) {
        this.backgroundR = backgroundR;
    }
    
    @Override
    public void setBoxes(final List<Box> list) {
        throw new RuntimeException("QuicktimeTextSampleEntries may not have child boxes");
    }
    
    public void setDefaultTextBox(final long defaultTextBox) {
        this.defaultTextBox = defaultTextBox;
    }
    
    public void setDisplayFlags(final int displayFlags) {
        this.displayFlags = displayFlags;
    }
    
    public void setFontFace(final short fontFace) {
        this.fontFace = fontFace;
    }
    
    public void setFontName(final String fontName) {
        this.fontName = fontName;
    }
    
    public void setFontNumber(final short fontNumber) {
        this.fontNumber = fontNumber;
    }
    
    public void setForegroundB(final int foregroundB) {
        this.foregroundB = foregroundB;
    }
    
    public void setForegroundG(final int foregroundG) {
        this.foregroundG = foregroundG;
    }
    
    public void setForegroundR(final int foregroundR) {
        this.foregroundR = foregroundR;
    }
    
    public void setReserved1(final long reserved1) {
        this.reserved1 = reserved1;
    }
    
    public void setReserved2(final byte reserved2) {
        this.reserved2 = reserved2;
    }
    
    public void setReserved3(final short reserved3) {
        this.reserved3 = reserved3;
    }
    
    public void setTextJustification(final int textJustification) {
        this.textJustification = textJustification;
    }
}
