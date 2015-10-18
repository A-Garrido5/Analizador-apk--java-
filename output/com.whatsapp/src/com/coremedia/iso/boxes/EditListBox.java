// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.util.Iterator;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.util.CastUtils;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class EditListBox extends AbstractFullBox
{
    public static final String TYPE = "elst";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private List<Entry> entries;
    
    static {
        ajc$preClinit();
    }
    
    public EditListBox() {
        super("elst");
        this.entries = new LinkedList<Entry>();
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("EditListBox.java", EditListBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getEntries", "com.coremedia.iso.boxes.EditListBox", "", "", "", "java.util.List"), 68);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setEntries", "com.coremedia.iso.boxes.EditListBox", "java.util.List", "entries", "", "void"), 72);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.EditListBox", "", "", "", "java.lang.String"), 108);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        final int l2i = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
        this.entries = new LinkedList<Entry>();
        for (int i = 0; i < l2i; ++i) {
            this.entries.add(new Entry(this, byteBuffer));
        }
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.entries.size());
        final Iterator<Entry> iterator = this.entries.iterator();
        while (iterator.hasNext()) {
            iterator.next().getContent(byteBuffer);
        }
    }
    
    @Override
    protected long getContentSize() {
        if (this.getVersion() == 1) {
            return 8L + 20 * this.entries.size();
        }
        return 8L + 12 * this.entries.size();
    }
    
    public List<Entry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(EditListBox.ajc$tjp_0, this, this));
        return this.entries;
    }
    
    public void setEntries(final List<Entry> entries) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(EditListBox.ajc$tjp_1, this, this, entries));
        this.entries = entries;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(EditListBox.ajc$tjp_2, this, this));
        return "EditListBox{entries=" + this.entries + '}';
    }
    
    public static class Entry
    {
        EditListBox editListBox;
        private double mediaRate;
        private long mediaTime;
        private long segmentDuration;
        
        public Entry(final EditListBox editListBox, final long segmentDuration, final long mediaTime, final double mediaRate) {
            this.segmentDuration = segmentDuration;
            this.mediaTime = mediaTime;
            this.mediaRate = mediaRate;
            this.editListBox = editListBox;
        }
        
        public Entry(final EditListBox editListBox, final ByteBuffer byteBuffer) {
            if (editListBox.getVersion() == 1) {
                this.segmentDuration = IsoTypeReader.readUInt64(byteBuffer);
                this.mediaTime = byteBuffer.getLong();
                this.mediaRate = IsoTypeReader.readFixedPoint1616(byteBuffer);
            }
            else {
                this.segmentDuration = IsoTypeReader.readUInt32(byteBuffer);
                this.mediaTime = byteBuffer.getInt();
                this.mediaRate = IsoTypeReader.readFixedPoint1616(byteBuffer);
            }
            this.editListBox = editListBox;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this != o) {
                if (o == null || this.getClass() != o.getClass()) {
                    return false;
                }
                final Entry entry = (Entry)o;
                if (this.mediaTime != entry.mediaTime) {
                    return false;
                }
                if (this.segmentDuration != entry.segmentDuration) {
                    return false;
                }
            }
            return true;
        }
        
        public void getContent(final ByteBuffer byteBuffer) {
            if (this.editListBox.getVersion() == 1) {
                IsoTypeWriter.writeUInt64(byteBuffer, this.segmentDuration);
                IsoTypeWriter.writeUInt64(byteBuffer, this.mediaTime);
            }
            else {
                IsoTypeWriter.writeUInt32(byteBuffer, CastUtils.l2i(this.segmentDuration));
                byteBuffer.putInt(CastUtils.l2i(this.mediaTime));
            }
            IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.mediaRate);
        }
        
        public double getMediaRate() {
            return this.mediaRate;
        }
        
        public long getMediaTime() {
            return this.mediaTime;
        }
        
        public long getSegmentDuration() {
            return this.segmentDuration;
        }
        
        @Override
        public int hashCode() {
            return 31 * (int)(this.segmentDuration ^ this.segmentDuration >>> 32) + (int)(this.mediaTime ^ this.mediaTime >>> 32);
        }
        
        public void setMediaRate(final double mediaRate) {
            this.mediaRate = mediaRate;
        }
        
        public void setMediaTime(final long mediaTime) {
            this.mediaTime = mediaTime;
        }
        
        public void setSegmentDuration(final long segmentDuration) {
            this.segmentDuration = segmentDuration;
        }
        
        @Override
        public String toString() {
            return "Entry{segmentDuration=" + this.segmentDuration + ", mediaTime=" + this.mediaTime + ", mediaRate=" + this.mediaRate + '}';
        }
    }
}
