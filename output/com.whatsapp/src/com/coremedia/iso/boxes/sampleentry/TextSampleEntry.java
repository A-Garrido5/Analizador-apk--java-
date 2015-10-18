// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes.sampleentry;

import java.util.Arrays;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.BoxParser;
import java.nio.channels.FileChannel;
import java.io.IOException;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public class TextSampleEntry extends AbstractSampleEntry
{
    public static final String TYPE1 = "tx3g";
    public static final String TYPE_ENCRYPTED = "enct";
    private int[] backgroundColorRgba;
    private BoxRecord boxRecord;
    private long displayFlags;
    private int horizontalJustification;
    private StyleRecord styleRecord;
    private int verticalJustification;
    
    public TextSampleEntry() {
        super("tx3g");
        this.backgroundColorRgba = new int[4];
        this.boxRecord = new BoxRecord();
        this.styleRecord = new StyleRecord();
    }
    
    public TextSampleEntry(final String s) {
        super(s);
        this.backgroundColorRgba = new int[4];
        this.boxRecord = new BoxRecord();
        this.styleRecord = new StyleRecord();
    }
    
    public int[] getBackgroundColorRgba() {
        return this.backgroundColorRgba;
    }
    
    @Override
    public void getBox(final WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(this.getHeader());
        final ByteBuffer allocate = ByteBuffer.allocate(38);
        allocate.position(6);
        IsoTypeWriter.writeUInt16(allocate, this.dataReferenceIndex);
        IsoTypeWriter.writeUInt32(allocate, this.displayFlags);
        IsoTypeWriter.writeUInt8(allocate, this.horizontalJustification);
        IsoTypeWriter.writeUInt8(allocate, this.verticalJustification);
        IsoTypeWriter.writeUInt8(allocate, this.backgroundColorRgba[0]);
        IsoTypeWriter.writeUInt8(allocate, this.backgroundColorRgba[1]);
        IsoTypeWriter.writeUInt8(allocate, this.backgroundColorRgba[2]);
        IsoTypeWriter.writeUInt8(allocate, this.backgroundColorRgba[3]);
        this.boxRecord.getContent(allocate);
        this.styleRecord.getContent(allocate);
        writableByteChannel.write((ByteBuffer)allocate.rewind());
        this.writeContainer(writableByteChannel);
    }
    
    public BoxRecord getBoxRecord() {
        return this.boxRecord;
    }
    
    public int getHorizontalJustification() {
        return this.horizontalJustification;
    }
    
    @Override
    public long getSize() {
        final long containerSize = this.getContainerSize();
        final long n = containerSize + 38L;
        int n2;
        if (this.largeBox || containerSize + 38L >= 4294967296L) {
            n2 = 16;
        }
        else {
            n2 = 8;
        }
        return n + n2;
    }
    
    public StyleRecord getStyleRecord() {
        return this.styleRecord;
    }
    
    public int getVerticalJustification() {
        return this.verticalJustification;
    }
    
    public boolean isContinuousKaraoke() {
        return (0x800L & this.displayFlags) == 0x800L;
    }
    
    public boolean isFillTextRegion() {
        return (0x40000L & this.displayFlags) == 0x40000L;
    }
    
    public boolean isScrollDirection() {
        return (0x180L & this.displayFlags) == 0x180L;
    }
    
    public boolean isScrollIn() {
        return (0x20L & this.displayFlags) == 0x20L;
    }
    
    public boolean isScrollOut() {
        return (0x40L & this.displayFlags) == 0x40L;
    }
    
    public boolean isWriteTextVertically() {
        return (0x20000L & this.displayFlags) == 0x20000L;
    }
    
    @Override
    public void parse(final FileChannel fileChannel, final ByteBuffer byteBuffer, final long n, final BoxParser boxParser) throws IOException {
        final ByteBuffer allocate = ByteBuffer.allocate(38);
        fileChannel.read(allocate);
        allocate.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(allocate);
        this.displayFlags = IsoTypeReader.readUInt32(allocate);
        this.horizontalJustification = IsoTypeReader.readUInt8(allocate);
        this.verticalJustification = IsoTypeReader.readUInt8(allocate);
        (this.backgroundColorRgba = new int[4])[0] = IsoTypeReader.readUInt8(allocate);
        this.backgroundColorRgba[1] = IsoTypeReader.readUInt8(allocate);
        this.backgroundColorRgba[2] = IsoTypeReader.readUInt8(allocate);
        this.backgroundColorRgba[3] = IsoTypeReader.readUInt8(allocate);
        (this.boxRecord = new BoxRecord()).parse(allocate);
        (this.styleRecord = new StyleRecord()).parse(allocate);
        this.parseContainer(fileChannel, n - 38L, boxParser);
    }
    
    public void setBackgroundColorRgba(final int[] backgroundColorRgba) {
        this.backgroundColorRgba = backgroundColorRgba;
    }
    
    public void setBoxRecord(final BoxRecord boxRecord) {
        this.boxRecord = boxRecord;
    }
    
    public void setContinuousKaraoke(final boolean b) {
        if (b) {
            this.displayFlags |= 0x800L;
            return;
        }
        this.displayFlags &= 0xFFFFFFFFFFFFF7FFL;
    }
    
    public void setFillTextRegion(final boolean b) {
        if (b) {
            this.displayFlags |= 0x40000L;
            return;
        }
        this.displayFlags &= 0xFFFFFFFFFFFBFFFFL;
    }
    
    public void setHorizontalJustification(final int horizontalJustification) {
        this.horizontalJustification = horizontalJustification;
    }
    
    public void setScrollDirection(final boolean b) {
        if (b) {
            this.displayFlags |= 0x180L;
            return;
        }
        this.displayFlags &= 0xFFFFFFFFFFFFFE7FL;
    }
    
    public void setScrollIn(final boolean b) {
        if (b) {
            this.displayFlags |= 0x20L;
            return;
        }
        this.displayFlags &= 0xFFFFFFFFFFFFFFDFL;
    }
    
    public void setScrollOut(final boolean b) {
        if (b) {
            this.displayFlags |= 0x40L;
            return;
        }
        this.displayFlags &= 0xFFFFFFFFFFFFFFBFL;
    }
    
    public void setStyleRecord(final StyleRecord styleRecord) {
        this.styleRecord = styleRecord;
    }
    
    public void setVerticalJustification(final int verticalJustification) {
        this.verticalJustification = verticalJustification;
    }
    
    public void setWriteTextVertically(final boolean b) {
        if (b) {
            this.displayFlags |= 0x20000L;
            return;
        }
        this.displayFlags &= 0xFFFFFFFFFFFDFFFFL;
    }
    
    @Override
    public String toString() {
        return "TextSampleEntry";
    }
    
    public static class BoxRecord
    {
        int bottom;
        int left;
        int right;
        int top;
        
        public BoxRecord() {
        }
        
        public BoxRecord(final int top, final int left, final int bottom, final int right) {
            this.top = top;
            this.left = left;
            this.bottom = bottom;
            this.right = right;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this != o) {
                if (o == null || this.getClass() != o.getClass()) {
                    return false;
                }
                final BoxRecord boxRecord = (BoxRecord)o;
                if (this.bottom != boxRecord.bottom) {
                    return false;
                }
                if (this.left != boxRecord.left) {
                    return false;
                }
                if (this.right != boxRecord.right) {
                    return false;
                }
                if (this.top != boxRecord.top) {
                    return false;
                }
            }
            return true;
        }
        
        public void getContent(final ByteBuffer byteBuffer) {
            IsoTypeWriter.writeUInt16(byteBuffer, this.top);
            IsoTypeWriter.writeUInt16(byteBuffer, this.left);
            IsoTypeWriter.writeUInt16(byteBuffer, this.bottom);
            IsoTypeWriter.writeUInt16(byteBuffer, this.right);
        }
        
        public int getSize() {
            return 8;
        }
        
        @Override
        public int hashCode() {
            return 31 * (31 * (31 * this.top + this.left) + this.bottom) + this.right;
        }
        
        public void parse(final ByteBuffer byteBuffer) {
            this.top = IsoTypeReader.readUInt16(byteBuffer);
            this.left = IsoTypeReader.readUInt16(byteBuffer);
            this.bottom = IsoTypeReader.readUInt16(byteBuffer);
            this.right = IsoTypeReader.readUInt16(byteBuffer);
        }
    }
    
    public static class StyleRecord
    {
        int endChar;
        int faceStyleFlags;
        int fontId;
        int fontSize;
        int startChar;
        int[] textColor;
        
        public StyleRecord() {
            this.textColor = new int[] { 255, 255, 255, 255 };
        }
        
        public StyleRecord(final int startChar, final int endChar, final int fontId, final int faceStyleFlags, final int fontSize, final int[] textColor) {
            this.textColor = new int[] { 255, 255, 255, 255 };
            this.startChar = startChar;
            this.endChar = endChar;
            this.fontId = fontId;
            this.faceStyleFlags = faceStyleFlags;
            this.fontSize = fontSize;
            this.textColor = textColor;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this != o) {
                if (o == null || this.getClass() != o.getClass()) {
                    return false;
                }
                final StyleRecord styleRecord = (StyleRecord)o;
                if (this.endChar != styleRecord.endChar) {
                    return false;
                }
                if (this.faceStyleFlags != styleRecord.faceStyleFlags) {
                    return false;
                }
                if (this.fontId != styleRecord.fontId) {
                    return false;
                }
                if (this.fontSize != styleRecord.fontSize) {
                    return false;
                }
                if (this.startChar != styleRecord.startChar) {
                    return false;
                }
                if (!Arrays.equals(this.textColor, styleRecord.textColor)) {
                    return false;
                }
            }
            return true;
        }
        
        public void getContent(final ByteBuffer byteBuffer) {
            IsoTypeWriter.writeUInt16(byteBuffer, this.startChar);
            IsoTypeWriter.writeUInt16(byteBuffer, this.endChar);
            IsoTypeWriter.writeUInt16(byteBuffer, this.fontId);
            IsoTypeWriter.writeUInt8(byteBuffer, this.faceStyleFlags);
            IsoTypeWriter.writeUInt8(byteBuffer, this.fontSize);
            IsoTypeWriter.writeUInt8(byteBuffer, this.textColor[0]);
            IsoTypeWriter.writeUInt8(byteBuffer, this.textColor[1]);
            IsoTypeWriter.writeUInt8(byteBuffer, this.textColor[2]);
            IsoTypeWriter.writeUInt8(byteBuffer, this.textColor[3]);
        }
        
        public int getSize() {
            return 12;
        }
        
        @Override
        public int hashCode() {
            final int n = 31 * (31 * (31 * (31 * (31 * this.startChar + this.endChar) + this.fontId) + this.faceStyleFlags) + this.fontSize);
            int hashCode;
            if (this.textColor != null) {
                hashCode = Arrays.hashCode(this.textColor);
            }
            else {
                hashCode = 0;
            }
            return n + hashCode;
        }
        
        public void parse(final ByteBuffer byteBuffer) {
            this.startChar = IsoTypeReader.readUInt16(byteBuffer);
            this.endChar = IsoTypeReader.readUInt16(byteBuffer);
            this.fontId = IsoTypeReader.readUInt16(byteBuffer);
            this.faceStyleFlags = IsoTypeReader.readUInt8(byteBuffer);
            this.fontSize = IsoTypeReader.readUInt8(byteBuffer);
            (this.textColor = new int[4])[0] = IsoTypeReader.readUInt8(byteBuffer);
            this.textColor[1] = IsoTypeReader.readUInt8(byteBuffer);
            this.textColor[2] = IsoTypeReader.readUInt8(byteBuffer);
            this.textColor[3] = IsoTypeReader.readUInt8(byteBuffer);
        }
    }
}
