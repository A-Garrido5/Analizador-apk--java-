// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.googlecode.mp4parser.util.CastUtils;
import com.coremedia.iso.IsoTypeReader;
import java.util.Iterator;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

public class RateShareEntry extends GroupEntry
{
    public static final String TYPE = "rash";
    private short discardPriority;
    private List<Entry> entries;
    private int maximumBitrate;
    private int minimumBitrate;
    private short operationPointCut;
    private short targetRateShare;
    
    public RateShareEntry() {
        this.entries = new LinkedList<Entry>();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final RateShareEntry rateShareEntry = (RateShareEntry)o;
            if (this.discardPriority != rateShareEntry.discardPriority) {
                return false;
            }
            if (this.maximumBitrate != rateShareEntry.maximumBitrate) {
                return false;
            }
            if (this.minimumBitrate != rateShareEntry.minimumBitrate) {
                return false;
            }
            if (this.operationPointCut != rateShareEntry.operationPointCut) {
                return false;
            }
            if (this.targetRateShare != rateShareEntry.targetRateShare) {
                return false;
            }
            if (this.entries != null) {
                if (this.entries.equals(rateShareEntry.entries)) {
                    return true;
                }
            }
            else if (rateShareEntry.entries == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public ByteBuffer get() {
        int n;
        if (this.operationPointCut == 1) {
            n = 13;
        }
        else {
            n = 11 + 6 * this.operationPointCut;
        }
        final ByteBuffer allocate = ByteBuffer.allocate(n);
        allocate.putShort(this.operationPointCut);
        if (this.operationPointCut == 1) {
            allocate.putShort(this.targetRateShare);
        }
        else {
            for (final Entry entry : this.entries) {
                allocate.putInt(entry.getAvailableBitrate());
                allocate.putShort(entry.getTargetRateShare());
            }
        }
        allocate.putInt(this.maximumBitrate);
        allocate.putInt(this.minimumBitrate);
        IsoTypeWriter.writeUInt8(allocate, this.discardPriority);
        allocate.rewind();
        return allocate;
    }
    
    public short getDiscardPriority() {
        return this.discardPriority;
    }
    
    public List<Entry> getEntries() {
        return this.entries;
    }
    
    public int getMaximumBitrate() {
        return this.maximumBitrate;
    }
    
    public int getMinimumBitrate() {
        return this.minimumBitrate;
    }
    
    public short getOperationPointCut() {
        return this.operationPointCut;
    }
    
    public short getTargetRateShare() {
        return this.targetRateShare;
    }
    
    @Override
    public int hashCode() {
        final short n = (short)(31 * (31 * this.operationPointCut + this.targetRateShare));
        int hashCode;
        if (this.entries != null) {
            hashCode = this.entries.hashCode();
        }
        else {
            hashCode = 0;
        }
        return 31 * (31 * (31 * (n + hashCode) + this.maximumBitrate) + this.minimumBitrate) + this.discardPriority;
    }
    
    @Override
    public void parse(final ByteBuffer byteBuffer) {
        this.operationPointCut = byteBuffer.getShort();
        if (this.operationPointCut == 1) {
            this.targetRateShare = byteBuffer.getShort();
        }
        else {
            int operationPointCut = this.operationPointCut;
            while (true) {
                final int n = operationPointCut - 1;
                if (operationPointCut <= 0) {
                    break;
                }
                this.entries.add(new Entry(CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer)), byteBuffer.getShort()));
                operationPointCut = n;
            }
        }
        this.maximumBitrate = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
        this.minimumBitrate = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
        this.discardPriority = (short)IsoTypeReader.readUInt8(byteBuffer);
    }
    
    public void setDiscardPriority(final short discardPriority) {
        this.discardPriority = discardPriority;
    }
    
    public void setEntries(final List<Entry> entries) {
        this.entries = entries;
    }
    
    public void setMaximumBitrate(final int maximumBitrate) {
        this.maximumBitrate = maximumBitrate;
    }
    
    public void setMinimumBitrate(final int minimumBitrate) {
        this.minimumBitrate = minimumBitrate;
    }
    
    public void setOperationPointCut(final short operationPointCut) {
        this.operationPointCut = operationPointCut;
    }
    
    public void setTargetRateShare(final short targetRateShare) {
        this.targetRateShare = targetRateShare;
    }
    
    public static class Entry
    {
        int availableBitrate;
        short targetRateShare;
        
        public Entry(final int availableBitrate, final short targetRateShare) {
            this.availableBitrate = availableBitrate;
            this.targetRateShare = targetRateShare;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this != o) {
                if (o == null || this.getClass() != o.getClass()) {
                    return false;
                }
                final Entry entry = (Entry)o;
                if (this.availableBitrate != entry.availableBitrate) {
                    return false;
                }
                if (this.targetRateShare != entry.targetRateShare) {
                    return false;
                }
            }
            return true;
        }
        
        public int getAvailableBitrate() {
            return this.availableBitrate;
        }
        
        public short getTargetRateShare() {
            return this.targetRateShare;
        }
        
        @Override
        public int hashCode() {
            return 31 * this.availableBitrate + this.targetRateShare;
        }
        
        public void setAvailableBitrate(final int availableBitrate) {
            this.availableBitrate = availableBitrate;
        }
        
        public void setTargetRateShare(final short targetRateShare) {
            this.targetRateShare = targetRateShare;
        }
        
        @Override
        public String toString() {
            return "{availableBitrate=" + this.availableBitrate + ", targetRateShare=" + this.targetRateShare + '}';
        }
    }
}
