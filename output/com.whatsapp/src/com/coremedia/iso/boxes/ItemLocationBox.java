// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeWriterVariable;
import com.coremedia.iso.IsoTypeReaderVariable;
import java.util.Iterator;
import com.coremedia.iso.IsoTypeWriter;
import org.aspectj.runtime.internal.Conversions;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class ItemLocationBox extends AbstractFullBox
{
    public static final String TYPE = "iloc";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_10;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_11;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9;
    public int baseOffsetSize;
    public int indexSize;
    public List<Item> items;
    public int lengthSize;
    public int offsetSize;
    
    static {
        ajc$preClinit();
    }
    
    public ItemLocationBox() {
        super("iloc");
        this.offsetSize = 8;
        this.lengthSize = 8;
        this.baseOffsetSize = 8;
        this.indexSize = 0;
        this.items = new LinkedList<Item>();
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("ItemLocationBox.java", ItemLocationBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), 119);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "offsetSize", "", "void"), 123);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "createItem", "com.coremedia.iso.boxes.ItemLocationBox", "int:int:int:long:java.util.List", "itemId:constructionMethod:dataReferenceIndex:baseOffset:extents", "", "com.coremedia.iso.boxes.ItemLocationBox$Item"), 160);
        ajc$tjp_11 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "createExtent", "com.coremedia.iso.boxes.ItemLocationBox", "long:long:long", "extentOffset:extentLength:extentIndex", "", "com.coremedia.iso.boxes.ItemLocationBox$Extent"), 285);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLengthSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), 127);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLengthSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "lengthSize", "", "void"), 131);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getBaseOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), 135);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setBaseOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "baseOffsetSize", "", "void"), 139);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getIndexSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), 143);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setIndexSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "indexSize", "", "void"), 147);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getItems", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "java.util.List"), 151);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setItems", "com.coremedia.iso.boxes.ItemLocationBox", "java.util.List", "items", "", "void"), 155);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        final int uInt8 = IsoTypeReader.readUInt8(byteBuffer);
        this.offsetSize = uInt8 >>> 4;
        this.lengthSize = (uInt8 & 0xF);
        final int uInt9 = IsoTypeReader.readUInt8(byteBuffer);
        this.baseOffsetSize = uInt9 >>> 4;
        if (this.getVersion() == 1) {
            this.indexSize = (uInt9 & 0xF);
        }
        for (int uInt10 = IsoTypeReader.readUInt16(byteBuffer), i = 0; i < uInt10; ++i) {
            this.items.add(new Item(byteBuffer));
        }
    }
    
    public Extent createExtent(final long n, final long n2, final long n3) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ItemLocationBox.ajc$tjp_11, this, this, new Object[] { Conversions.longObject(n), Conversions.longObject(n2), Conversions.longObject(n3) }));
        return new Extent(n, n2, n3);
    }
    
    Extent createExtent(final ByteBuffer byteBuffer) {
        return new Extent(byteBuffer);
    }
    
    public Item createItem(final int n, final int n2, final int n3, final long n4, final List<Extent> list) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ItemLocationBox.ajc$tjp_10, this, this, new Object[] { Conversions.intObject(n), Conversions.intObject(n2), Conversions.intObject(n3), Conversions.longObject(n4), list }));
        return new Item(n, n2, n3, n4, list);
    }
    
    Item createItem(final ByteBuffer byteBuffer) {
        return new Item(byteBuffer);
    }
    
    public int getBaseOffsetSize() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ItemLocationBox.ajc$tjp_4, this, this));
        return this.baseOffsetSize;
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt8(byteBuffer, this.offsetSize << 4 | this.lengthSize);
        if (this.getVersion() == 1) {
            IsoTypeWriter.writeUInt8(byteBuffer, this.baseOffsetSize << 4 | this.indexSize);
        }
        else {
            IsoTypeWriter.writeUInt8(byteBuffer, this.baseOffsetSize << 4);
        }
        IsoTypeWriter.writeUInt16(byteBuffer, this.items.size());
        final Iterator<Item> iterator = this.items.iterator();
        while (iterator.hasNext()) {
            iterator.next().getContent(byteBuffer);
        }
    }
    
    @Override
    protected long getContentSize() {
        long n = 8L;
        final Iterator<Item> iterator = this.items.iterator();
        while (iterator.hasNext()) {
            n += iterator.next().getSize();
        }
        return n;
    }
    
    public int getIndexSize() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ItemLocationBox.ajc$tjp_6, this, this));
        return this.indexSize;
    }
    
    public List<Item> getItems() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ItemLocationBox.ajc$tjp_8, this, this));
        return this.items;
    }
    
    public int getLengthSize() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ItemLocationBox.ajc$tjp_2, this, this));
        return this.lengthSize;
    }
    
    public int getOffsetSize() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ItemLocationBox.ajc$tjp_0, this, this));
        return this.offsetSize;
    }
    
    public void setBaseOffsetSize(final int baseOffsetSize) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ItemLocationBox.ajc$tjp_5, this, this, Conversions.intObject(baseOffsetSize)));
        this.baseOffsetSize = baseOffsetSize;
    }
    
    public void setIndexSize(final int indexSize) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ItemLocationBox.ajc$tjp_7, this, this, Conversions.intObject(indexSize)));
        this.indexSize = indexSize;
    }
    
    public void setItems(final List<Item> items) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ItemLocationBox.ajc$tjp_9, this, this, items));
        this.items = items;
    }
    
    public void setLengthSize(final int lengthSize) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ItemLocationBox.ajc$tjp_3, this, this, Conversions.intObject(lengthSize)));
        this.lengthSize = lengthSize;
    }
    
    public void setOffsetSize(final int offsetSize) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ItemLocationBox.ajc$tjp_1, this, this, Conversions.intObject(offsetSize)));
        this.offsetSize = offsetSize;
    }
    
    public class Extent
    {
        public long extentIndex;
        public long extentLength;
        public long extentOffset;
        
        public Extent(final long extentOffset, final long extentLength, final long extentIndex) {
            this.extentOffset = extentOffset;
            this.extentLength = extentLength;
            this.extentIndex = extentIndex;
        }
        
        public Extent(final ByteBuffer byteBuffer) {
            if (ItemLocationBox.this.getVersion() == 1 && ItemLocationBox.this.indexSize > 0) {
                this.extentIndex = IsoTypeReaderVariable.read(byteBuffer, ItemLocationBox.this.indexSize);
            }
            this.extentOffset = IsoTypeReaderVariable.read(byteBuffer, ItemLocationBox.this.offsetSize);
            this.extentLength = IsoTypeReaderVariable.read(byteBuffer, ItemLocationBox.this.lengthSize);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this != o) {
                if (o == null || this.getClass() != o.getClass()) {
                    return false;
                }
                final Extent extent = (Extent)o;
                if (this.extentIndex != extent.extentIndex) {
                    return false;
                }
                if (this.extentLength != extent.extentLength) {
                    return false;
                }
                if (this.extentOffset != extent.extentOffset) {
                    return false;
                }
            }
            return true;
        }
        
        public void getContent(final ByteBuffer byteBuffer) {
            if (ItemLocationBox.this.getVersion() == 1 && ItemLocationBox.this.indexSize > 0) {
                IsoTypeWriterVariable.write(this.extentIndex, byteBuffer, ItemLocationBox.this.indexSize);
            }
            IsoTypeWriterVariable.write(this.extentOffset, byteBuffer, ItemLocationBox.this.offsetSize);
            IsoTypeWriterVariable.write(this.extentLength, byteBuffer, ItemLocationBox.this.lengthSize);
        }
        
        public int getSize() {
            int indexSize;
            if (ItemLocationBox.this.indexSize > 0) {
                indexSize = ItemLocationBox.this.indexSize;
            }
            else {
                indexSize = 0;
            }
            return indexSize + ItemLocationBox.this.offsetSize + ItemLocationBox.this.lengthSize;
        }
        
        @Override
        public int hashCode() {
            return 31 * (31 * (int)(this.extentOffset ^ this.extentOffset >>> 32) + (int)(this.extentLength ^ this.extentLength >>> 32)) + (int)(this.extentIndex ^ this.extentIndex >>> 32);
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Extent");
            sb.append("{extentOffset=").append(this.extentOffset);
            sb.append(", extentLength=").append(this.extentLength);
            sb.append(", extentIndex=").append(this.extentIndex);
            sb.append('}');
            return sb.toString();
        }
    }
    
    public class Item
    {
        public long baseOffset;
        public int constructionMethod;
        public int dataReferenceIndex;
        public List<Extent> extents;
        public int itemId;
        
        public Item(final int itemId, final int constructionMethod, final int dataReferenceIndex, final long baseOffset, final List<Extent> extents) {
            this.extents = new LinkedList<Extent>();
            this.itemId = itemId;
            this.constructionMethod = constructionMethod;
            this.dataReferenceIndex = dataReferenceIndex;
            this.baseOffset = baseOffset;
            this.extents = extents;
        }
        
        public Item(final ByteBuffer byteBuffer) {
            this.extents = new LinkedList<Extent>();
            this.itemId = IsoTypeReader.readUInt16(byteBuffer);
            if (ItemLocationBox.this.getVersion() == 1) {
                this.constructionMethod = (0xF & IsoTypeReader.readUInt16(byteBuffer));
            }
            this.dataReferenceIndex = IsoTypeReader.readUInt16(byteBuffer);
            if (ItemLocationBox.this.baseOffsetSize > 0) {
                this.baseOffset = IsoTypeReaderVariable.read(byteBuffer, ItemLocationBox.this.baseOffsetSize);
            }
            else {
                this.baseOffset = 0L;
            }
            for (int uInt16 = IsoTypeReader.readUInt16(byteBuffer), i = 0; i < uInt16; ++i) {
                this.extents.add(new Extent(byteBuffer));
            }
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this != o) {
                if (o == null || this.getClass() != o.getClass()) {
                    return false;
                }
                final Item item = (Item)o;
                if (this.baseOffset != item.baseOffset) {
                    return false;
                }
                if (this.constructionMethod != item.constructionMethod) {
                    return false;
                }
                if (this.dataReferenceIndex != item.dataReferenceIndex) {
                    return false;
                }
                if (this.itemId != item.itemId) {
                    return false;
                }
                if (this.extents != null) {
                    if (this.extents.equals(item.extents)) {
                        return true;
                    }
                }
                else if (item.extents == null) {
                    return true;
                }
                return false;
            }
            return true;
        }
        
        public void getContent(final ByteBuffer byteBuffer) {
            IsoTypeWriter.writeUInt16(byteBuffer, this.itemId);
            if (ItemLocationBox.this.getVersion() == 1) {
                IsoTypeWriter.writeUInt16(byteBuffer, this.constructionMethod);
            }
            IsoTypeWriter.writeUInt16(byteBuffer, this.dataReferenceIndex);
            if (ItemLocationBox.this.baseOffsetSize > 0) {
                IsoTypeWriterVariable.write(this.baseOffset, byteBuffer, ItemLocationBox.this.baseOffsetSize);
            }
            IsoTypeWriter.writeUInt16(byteBuffer, this.extents.size());
            final Iterator<Extent> iterator = this.extents.iterator();
            while (iterator.hasNext()) {
                iterator.next().getContent(byteBuffer);
            }
        }
        
        public int getSize() {
            int n = 2;
            if (ItemLocationBox.this.getVersion() == 1) {
                n += 2;
            }
            int n2 = 2 + (n + 2 + ItemLocationBox.this.baseOffsetSize);
            final Iterator<Extent> iterator = this.extents.iterator();
            while (iterator.hasNext()) {
                n2 += iterator.next().getSize();
            }
            return n2;
        }
        
        @Override
        public int hashCode() {
            final int n = 31 * (31 * (31 * (31 * this.itemId + this.constructionMethod) + this.dataReferenceIndex) + (int)(this.baseOffset ^ this.baseOffset >>> 32));
            int hashCode;
            if (this.extents != null) {
                hashCode = this.extents.hashCode();
            }
            else {
                hashCode = 0;
            }
            return n + hashCode;
        }
        
        public void setBaseOffset(final long baseOffset) {
            this.baseOffset = baseOffset;
        }
        
        @Override
        public String toString() {
            return "Item{baseOffset=" + this.baseOffset + ", itemId=" + this.itemId + ", constructionMethod=" + this.constructionMethod + ", dataReferenceIndex=" + this.dataReferenceIndex + ", extents=" + this.extents + '}';
        }
    }
}
