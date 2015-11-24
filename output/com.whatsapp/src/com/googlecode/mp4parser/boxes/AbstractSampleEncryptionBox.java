// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes;

import com.coremedia.iso.Hex;
import java.math.BigInteger;
import org.aspectj.runtime.internal.Conversions;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import java.util.ArrayList;
import com.coremedia.iso.IsoTypeWriter;
import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.util.Iterator;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.Box;
import com.googlecode.mp4parser.util.Path;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public abstract class AbstractSampleEncryptionBox extends AbstractFullBox
{
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_10;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_11;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_12;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_13;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9;
    int algorithmId;
    List<Entry> entries;
    int ivSize;
    byte[] kid;
    
    static {
        ajc$preClinit();
    }
    
    protected AbstractSampleEncryptionBox(final String s) {
        super(s);
        this.algorithmId = -1;
        this.ivSize = -1;
        this.kid = new byte[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
        this.entries = new LinkedList<Entry>();
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("AbstractSampleEncryptionBox.java", AbstractSampleEncryptionBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getOffsetToFirstIV", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "int"), 33);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSampleCount", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "int"), 81);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "createEntry", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox$Entry"), 194);
        ajc$tjp_11 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "equals", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "java.lang.Object", "o", "", "boolean"), 307);
        ajc$tjp_12 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "hashCode", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "int"), 334);
        ajc$tjp_13 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getEntrySizes", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "java.util.List"), 342);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getEntries", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "java.util.List"), 85);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setEntries", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "java.util.List", "entries", "", "void"), 89);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getAlgorithmId", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "int"), 93);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setAlgorithmId", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "int", "algorithmId", "", "void"), 97);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getIvSize", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "int"), 101);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setIvSize", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "int", "ivSize", "", "void"), 105);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getKid", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "[B"), 109);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setKid", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "[B", "kid", "", "void"), 113);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        int n = -1;
        if ((0x1 & this.getFlags()) > 0) {
            this.algorithmId = IsoTypeReader.readUInt24(byteBuffer);
            this.ivSize = IsoTypeReader.readUInt8(byteBuffer);
            n = this.ivSize;
            byteBuffer.get(this.kid = new byte[16]);
        }
        else {
            for (final Box box : Path.getPaths(this, "/moov[0]/trak/tkhd")) {
                if (((TrackHeaderBox)box).getTrackId() == this.getParent().getBoxes(TrackFragmentHeaderBox.class).get(0).getTrackId()) {
                    AbstractTrackEncryptionBox abstractTrackEncryptionBox = (AbstractTrackEncryptionBox)Path.getPath(box, "../mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schi[0]/tenc[0]");
                    if (abstractTrackEncryptionBox == null) {
                        abstractTrackEncryptionBox = (AbstractTrackEncryptionBox)Path.getPath(box, "../mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schi[0]/uuid[0]");
                    }
                    n = abstractTrackEncryptionBox.getDefaultIvSize();
                }
            }
        }
        long uInt32 = IsoTypeReader.readUInt32(byteBuffer);
        while (true) {
            final long n2 = uInt32 - 1L;
            if (uInt32 <= 0L) {
                break;
            }
            final Entry entry = new Entry();
            int n3;
            if (n < 0) {
                n3 = 8;
            }
            else {
                n3 = n;
            }
            byteBuffer.get(entry.iv = new byte[n3]);
            if ((0x2 & this.getFlags()) > 0) {
                final int uInt33 = IsoTypeReader.readUInt16(byteBuffer);
                entry.pairs = new LinkedList<Pair>();
                int n4 = uInt33;
                while (true) {
                    final int n5 = n4 - 1;
                    if (n4 <= 0) {
                        break;
                    }
                    entry.pairs.add(entry.createPair(IsoTypeReader.readUInt16(byteBuffer), IsoTypeReader.readUInt32(byteBuffer)));
                    n4 = n5;
                }
            }
            this.entries.add(entry);
            uInt32 = n2;
        }
    }
    
    public Entry createEntry() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AbstractSampleEncryptionBox.ajc$tjp_10, this, this));
        return new Entry();
    }
    
    @Override
    public boolean equals(final Object o) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AbstractSampleEncryptionBox.ajc$tjp_11, this, this, o));
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final AbstractSampleEncryptionBox abstractSampleEncryptionBox = (AbstractSampleEncryptionBox)o;
            if (this.algorithmId != abstractSampleEncryptionBox.algorithmId) {
                return false;
            }
            if (this.ivSize != abstractSampleEncryptionBox.ivSize) {
                return false;
            }
            Label_0104: {
                if (this.entries != null) {
                    if (this.entries.equals(abstractSampleEncryptionBox.entries)) {
                        break Label_0104;
                    }
                }
                else if (abstractSampleEncryptionBox.entries == null) {
                    break Label_0104;
                }
                return false;
            }
            if (!Arrays.equals(this.kid, abstractSampleEncryptionBox.kid)) {
                return false;
            }
        }
        return true;
    }
    
    public int getAlgorithmId() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AbstractSampleEncryptionBox.ajc$tjp_4, this, this));
        return this.algorithmId;
    }
    
    @Override
    public void getBox(final WritableByteChannel writableByteChannel) throws IOException {
        super.getBox(writableByteChannel);
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        if (this.isOverrideTrackEncryptionBoxParameters()) {
            IsoTypeWriter.writeUInt24(byteBuffer, this.algorithmId);
            IsoTypeWriter.writeUInt8(byteBuffer, this.ivSize);
            byteBuffer.put(this.kid);
        }
        IsoTypeWriter.writeUInt32(byteBuffer, this.entries.size());
        for (final Entry entry : this.entries) {
            if (this.isOverrideTrackEncryptionBoxParameters()) {
                final byte[] array = new byte[this.ivSize];
                System.arraycopy(entry.iv, 0, array, this.ivSize - entry.iv.length, entry.iv.length);
                byteBuffer.put(array);
            }
            else {
                byteBuffer.put(entry.iv);
            }
            if (this.isSubSampleEncryption()) {
                IsoTypeWriter.writeUInt16(byteBuffer, entry.pairs.size());
                for (final Pair pair : entry.pairs) {
                    IsoTypeWriter.writeUInt16(byteBuffer, pair.clear);
                    IsoTypeWriter.writeUInt32(byteBuffer, pair.encrypted);
                }
            }
        }
    }
    
    @Override
    protected long getContentSize() {
        long n = 4L;
        if (this.isOverrideTrackEncryptionBoxParameters()) {
            n = n + 4L + this.kid.length;
        }
        long n2 = n + 4L;
        final Iterator<Entry> iterator = this.entries.iterator();
        while (iterator.hasNext()) {
            n2 += iterator.next().getSize();
        }
        return n2;
    }
    
    public List<Entry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AbstractSampleEncryptionBox.ajc$tjp_2, this, this));
        return this.entries;
    }
    
    public List<Short> getEntrySizes() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AbstractSampleEncryptionBox.ajc$tjp_13, this, this));
        final ArrayList<Short> list = new ArrayList<Short>(this.entries.size());
        for (final Entry entry : this.entries) {
            short n = (short)entry.iv.length;
            if (this.isSubSampleEncryption()) {
                n = (short)((short)(n + 2) + 6 * entry.pairs.size());
            }
            list.add(n);
        }
        return list;
    }
    
    public int getIvSize() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AbstractSampleEncryptionBox.ajc$tjp_6, this, this));
        return this.ivSize;
    }
    
    public byte[] getKid() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AbstractSampleEncryptionBox.ajc$tjp_8, this, this));
        return this.kid;
    }
    
    public int getOffsetToFirstIV() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AbstractSampleEncryptionBox.ajc$tjp_0, this, this));
        int n;
        if (this.getSize() > 4294967296L) {
            n = 16;
        }
        else {
            n = 8;
        }
        int n2;
        if (this.isOverrideTrackEncryptionBoxParameters()) {
            n2 = 20;
        }
        else {
            n2 = 0;
        }
        return 4 + (n + n2);
    }
    
    public int getSampleCount() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AbstractSampleEncryptionBox.ajc$tjp_1, this, this));
        return this.entries.size();
    }
    
    @Override
    public int hashCode() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AbstractSampleEncryptionBox.ajc$tjp_12, this, this));
        final int n = 31 * (31 * this.algorithmId + this.ivSize);
        int hashCode;
        if (this.kid != null) {
            hashCode = Arrays.hashCode(this.kid);
        }
        else {
            hashCode = 0;
        }
        final int n2 = 31 * (n + hashCode);
        final List<Entry> entries = this.entries;
        int hashCode2 = 0;
        if (entries != null) {
            hashCode2 = this.entries.hashCode();
        }
        return n2 + hashCode2;
    }
    
    @DoNotParseDetail
    public boolean isOverrideTrackEncryptionBoxParameters() {
        return (0x1 & this.getFlags()) > 0;
    }
    
    @DoNotParseDetail
    public boolean isSubSampleEncryption() {
        return (0x2 & this.getFlags()) > 0;
    }
    
    public void setAlgorithmId(final int algorithmId) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AbstractSampleEncryptionBox.ajc$tjp_5, this, this, Conversions.intObject(algorithmId)));
        this.algorithmId = algorithmId;
    }
    
    public void setEntries(final List<Entry> entries) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AbstractSampleEncryptionBox.ajc$tjp_3, this, this, entries));
        this.entries = entries;
    }
    
    public void setIvSize(final int ivSize) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AbstractSampleEncryptionBox.ajc$tjp_7, this, this, Conversions.intObject(ivSize)));
        this.ivSize = ivSize;
    }
    
    public void setKid(final byte[] kid) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AbstractSampleEncryptionBox.ajc$tjp_9, this, this, kid));
        this.kid = kid;
    }
    
    @DoNotParseDetail
    public void setOverrideTrackEncryptionBoxParameters(final boolean b) {
        if (b) {
            this.setFlags(0x1 | this.getFlags());
            return;
        }
        this.setFlags(0xFFFFFE & this.getFlags());
    }
    
    @DoNotParseDetail
    public void setSubSampleEncryption(final boolean b) {
        if (b) {
            this.setFlags(0x2 | this.getFlags());
            return;
        }
        this.setFlags(0xFFFFFD & this.getFlags());
    }
    
    public class Entry
    {
        public byte[] iv;
        public List<Pair> pairs;
        
        public Entry() {
            this.pairs = new LinkedList<Pair>();
        }
        
        public Pair createPair(final int n, final long n2) {
            return new Pair(n, n2);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this != o) {
                if (o == null || this.getClass() != o.getClass()) {
                    return false;
                }
                final Entry entry = (Entry)o;
                if (!new BigInteger(this.iv).equals(new BigInteger(entry.iv))) {
                    return false;
                }
                if (this.pairs != null) {
                    if (this.pairs.equals(entry.pairs)) {
                        return true;
                    }
                }
                else if (entry.pairs == null) {
                    return true;
                }
                return false;
            }
            return true;
        }
        
        public int getSize() {
            int n;
            if (AbstractSampleEncryptionBox.this.isOverrideTrackEncryptionBoxParameters()) {
                n = AbstractSampleEncryptionBox.this.ivSize;
            }
            else {
                n = this.iv.length;
            }
            if (AbstractSampleEncryptionBox.this.isSubSampleEncryption()) {
                n += 2;
                for (final Pair pair : this.pairs) {
                    n += 6;
                }
            }
            return n;
        }
        
        @Override
        public int hashCode() {
            int hashCode;
            if (this.iv != null) {
                hashCode = Arrays.hashCode(this.iv);
            }
            else {
                hashCode = 0;
            }
            final int n = hashCode * 31;
            final List<Pair> pairs = this.pairs;
            int hashCode2 = 0;
            if (pairs != null) {
                hashCode2 = this.pairs.hashCode();
            }
            return n + hashCode2;
        }
        
        @Override
        public String toString() {
            return "Entry{iv=" + Hex.encodeHex(this.iv) + ", pairs=" + this.pairs + '}';
        }
        
        public class Pair
        {
            public int clear;
            public long encrypted;
            
            public Pair(final int clear, final long encrypted) {
                this.clear = clear;
                this.encrypted = encrypted;
            }
            
            @Override
            public boolean equals(final Object o) {
                if (this != o) {
                    if (o == null || this.getClass() != o.getClass()) {
                        return false;
                    }
                    final Pair pair = (Pair)o;
                    if (this.clear != pair.clear) {
                        return false;
                    }
                    if (this.encrypted != pair.encrypted) {
                        return false;
                    }
                }
                return true;
            }
            
            @Override
            public int hashCode() {
                return 31 * this.clear + (int)(this.encrypted ^ this.encrypted >>> 32);
            }
            
            @Override
            public String toString() {
                return "clr:" + this.clear + " enc:" + this.encrypted;
            }
        }
    }
}
