// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeWriter;
import java.util.Iterator;
import java.util.Collection;
import java.util.LinkedList;
import org.aspectj.runtime.internal.Conversions;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.util.ArrayList;
import com.googlecode.mp4parser.util.CastUtils;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import java.util.Collections;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class SampleToChunkBox extends AbstractFullBox
{
    public static final String TYPE = "stsc";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    List<Entry> entries;
    
    static {
        ajc$preClinit();
    }
    
    public SampleToChunkBox() {
        super("stsc");
        this.entries = Collections.emptyList();
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("SampleToChunkBox.java", SampleToChunkBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "", "java.util.List"), 47);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", "entries", "", "void"), 51);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "", "java.lang.String"), 84);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "blowup", "com.coremedia.iso.boxes.SampleToChunkBox", "int", "chunkCount", "", "[J"), 95);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        final int l2i = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
        this.entries = new ArrayList<Entry>(l2i);
        for (int i = 0; i < l2i; ++i) {
            this.entries.add(new Entry(IsoTypeReader.readUInt32(byteBuffer), IsoTypeReader.readUInt32(byteBuffer), IsoTypeReader.readUInt32(byteBuffer)));
        }
    }
    
    public long[] blowup(final int n) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleToChunkBox.ajc$tjp_3, this, this, Conversions.intObject(n)));
        final long[] array = new long[n];
        final LinkedList<Entry> list = new LinkedList<Entry>(this.entries);
        Collections.reverse(list);
        final Iterator<Object> iterator = list.iterator();
        Entry entry = iterator.next();
        for (int i = array.length; i > 1; --i) {
            array[i - 1] = entry.getSamplesPerChunk();
            if (i == entry.getFirstChunk()) {
                entry = iterator.next();
            }
        }
        array[0] = entry.getSamplesPerChunk();
        return array;
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.entries.size());
        for (final Entry entry : this.entries) {
            IsoTypeWriter.writeUInt32(byteBuffer, entry.getFirstChunk());
            IsoTypeWriter.writeUInt32(byteBuffer, entry.getSamplesPerChunk());
            IsoTypeWriter.writeUInt32(byteBuffer, entry.getSampleDescriptionIndex());
        }
    }
    
    @Override
    protected long getContentSize() {
        return 8 + 12 * this.entries.size();
    }
    
    public List<Entry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleToChunkBox.ajc$tjp_0, this, this));
        return this.entries;
    }
    
    public void setEntries(final List<Entry> entries) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleToChunkBox.ajc$tjp_1, this, this, entries));
        this.entries = entries;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleToChunkBox.ajc$tjp_2, this, this));
        return "SampleToChunkBox[entryCount=" + this.entries.size() + "]";
    }
    
    public static class Entry
    {
        long firstChunk;
        long sampleDescriptionIndex;
        long samplesPerChunk;
        
        public Entry(final long firstChunk, final long samplesPerChunk, final long sampleDescriptionIndex) {
            this.firstChunk = firstChunk;
            this.samplesPerChunk = samplesPerChunk;
            this.sampleDescriptionIndex = sampleDescriptionIndex;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this != o) {
                if (o == null || this.getClass() != o.getClass()) {
                    return false;
                }
                final Entry entry = (Entry)o;
                if (this.firstChunk != entry.firstChunk) {
                    return false;
                }
                if (this.sampleDescriptionIndex != entry.sampleDescriptionIndex) {
                    return false;
                }
                if (this.samplesPerChunk != entry.samplesPerChunk) {
                    return false;
                }
            }
            return true;
        }
        
        public long getFirstChunk() {
            return this.firstChunk;
        }
        
        public long getSampleDescriptionIndex() {
            return this.sampleDescriptionIndex;
        }
        
        public long getSamplesPerChunk() {
            return this.samplesPerChunk;
        }
        
        @Override
        public int hashCode() {
            return 31 * (31 * (int)(this.firstChunk ^ this.firstChunk >>> 32) + (int)(this.samplesPerChunk ^ this.samplesPerChunk >>> 32)) + (int)(this.sampleDescriptionIndex ^ this.sampleDescriptionIndex >>> 32);
        }
        
        public void setFirstChunk(final long firstChunk) {
            this.firstChunk = firstChunk;
        }
        
        public void setSampleDescriptionIndex(final long sampleDescriptionIndex) {
            this.sampleDescriptionIndex = sampleDescriptionIndex;
        }
        
        public void setSamplesPerChunk(final long samplesPerChunk) {
            this.samplesPerChunk = samplesPerChunk;
        }
        
        @Override
        public String toString() {
            return "Entry{firstChunk=" + this.firstChunk + ", samplesPerChunk=" + this.samplesPerChunk + ", sampleDescriptionIndex=" + this.sampleDescriptionIndex + '}';
        }
    }
}
