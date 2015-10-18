// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes;

import org.aspectj.runtime.internal.Conversions;
import java.util.Iterator;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractBox;

public class EC3SpecificBox extends AbstractBox
{
    public static final String TYPE = "dec3";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    int dataRate;
    List<Entry> entries;
    int numIndSub;
    
    static {
        ajc$preClinit();
    }
    
    public EC3SpecificBox() {
        super("dec3");
        this.entries = new LinkedList<Entry>();
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("EC3SpecificBox.java", EC3SpecificBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getContentSize", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", "long"), 25);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getContent", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 65);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getEntries", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", "java.util.List"), 86);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setEntries", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "java.util.List", "entries", "", "void"), 90);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "addEntry", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "com.googlecode.mp4parser.boxes.EC3SpecificBox$Entry", "entry", "", "void"), 94);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDataRate", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", "int"), 98);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDataRate", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "int", "dataRate", "", "void"), 102);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getNumIndSub", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", "int"), 106);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setNumIndSub", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "int", "numIndSub", "", "void"), 110);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        final BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(byteBuffer);
        this.dataRate = bitReaderBuffer.readBits(13);
        this.numIndSub = 1 + bitReaderBuffer.readBits(3);
        for (int i = 0; i < this.numIndSub; ++i) {
            final Entry entry = new Entry();
            entry.fscod = bitReaderBuffer.readBits(2);
            entry.bsid = bitReaderBuffer.readBits(5);
            entry.bsmod = bitReaderBuffer.readBits(5);
            entry.acmod = bitReaderBuffer.readBits(3);
            entry.lfeon = bitReaderBuffer.readBits(1);
            entry.reserved = bitReaderBuffer.readBits(3);
            entry.num_dep_sub = bitReaderBuffer.readBits(4);
            if (entry.num_dep_sub > 0) {
                entry.chan_loc = bitReaderBuffer.readBits(9);
            }
            else {
                entry.reserved2 = bitReaderBuffer.readBits(1);
            }
            this.entries.add(entry);
        }
    }
    
    public void addEntry(final Entry entry) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(EC3SpecificBox.ajc$tjp_4, this, this, entry));
        this.entries.add(entry);
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(EC3SpecificBox.ajc$tjp_1, this, this, byteBuffer));
        final BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(byteBuffer);
        bitWriterBuffer.writeBits(this.dataRate, 13);
        bitWriterBuffer.writeBits(-1 + this.entries.size(), 3);
        for (final Entry entry : this.entries) {
            bitWriterBuffer.writeBits(entry.fscod, 2);
            bitWriterBuffer.writeBits(entry.bsid, 5);
            bitWriterBuffer.writeBits(entry.bsmod, 5);
            bitWriterBuffer.writeBits(entry.acmod, 3);
            bitWriterBuffer.writeBits(entry.lfeon, 1);
            bitWriterBuffer.writeBits(entry.reserved, 3);
            bitWriterBuffer.writeBits(entry.num_dep_sub, 4);
            if (entry.num_dep_sub > 0) {
                bitWriterBuffer.writeBits(entry.chan_loc, 9);
            }
            else {
                bitWriterBuffer.writeBits(entry.reserved2, 1);
            }
        }
    }
    
    public long getContentSize() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(EC3SpecificBox.ajc$tjp_0, this, this));
        long n = 2L;
        final Iterator<Entry> iterator = this.entries.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().num_dep_sub > 0) {
                n += 4L;
            }
            else {
                n += 3L;
            }
        }
        return n;
    }
    
    public int getDataRate() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(EC3SpecificBox.ajc$tjp_5, this, this));
        return this.dataRate;
    }
    
    public List<Entry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(EC3SpecificBox.ajc$tjp_2, this, this));
        return this.entries;
    }
    
    public int getNumIndSub() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(EC3SpecificBox.ajc$tjp_7, this, this));
        return this.numIndSub;
    }
    
    public void setDataRate(final int dataRate) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(EC3SpecificBox.ajc$tjp_6, this, this, Conversions.intObject(dataRate)));
        this.dataRate = dataRate;
    }
    
    public void setEntries(final List<Entry> entries) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(EC3SpecificBox.ajc$tjp_3, this, this, entries));
        this.entries = entries;
    }
    
    public void setNumIndSub(final int numIndSub) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(EC3SpecificBox.ajc$tjp_8, this, this, Conversions.intObject(numIndSub)));
        this.numIndSub = numIndSub;
    }
    
    public static class Entry
    {
        public int acmod;
        public int bsid;
        public int bsmod;
        public int chan_loc;
        public int fscod;
        public int lfeon;
        public int num_dep_sub;
        public int reserved;
        public int reserved2;
        
        @Override
        public String toString() {
            return "Entry{fscod=" + this.fscod + ", bsid=" + this.bsid + ", bsmod=" + this.bsmod + ", acmod=" + this.acmod + ", lfeon=" + this.lfeon + ", reserved=" + this.reserved + ", num_dep_sub=" + this.num_dep_sub + ", chan_loc=" + this.chan_loc + ", reserved2=" + this.reserved2 + '}';
        }
    }
}
