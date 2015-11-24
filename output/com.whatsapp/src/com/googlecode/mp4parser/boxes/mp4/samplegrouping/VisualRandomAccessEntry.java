// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import java.nio.ByteBuffer;

public class VisualRandomAccessEntry extends GroupEntry
{
    public static final String TYPE = "rap ";
    private short numLeadingSamples;
    private boolean numLeadingSamplesKnown;
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final VisualRandomAccessEntry visualRandomAccessEntry = (VisualRandomAccessEntry)o;
            if (this.numLeadingSamples != visualRandomAccessEntry.numLeadingSamples) {
                return false;
            }
            if (this.numLeadingSamplesKnown != visualRandomAccessEntry.numLeadingSamplesKnown) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public ByteBuffer get() {
        final ByteBuffer allocate = ByteBuffer.allocate(1);
        short n;
        if (this.numLeadingSamplesKnown) {
            n = 128;
        }
        else {
            n = 0;
        }
        allocate.put((byte)(n | (0x7F & this.numLeadingSamples)));
        allocate.rewind();
        return allocate;
    }
    
    public short getNumLeadingSamples() {
        return this.numLeadingSamples;
    }
    
    @Override
    public int hashCode() {
        int n;
        if (this.numLeadingSamplesKnown) {
            n = 1;
        }
        else {
            n = 0;
        }
        return n * 31 + this.numLeadingSamples;
    }
    
    public boolean isNumLeadingSamplesKnown() {
        return this.numLeadingSamplesKnown;
    }
    
    @Override
    public void parse(final ByteBuffer byteBuffer) {
        final byte value = byteBuffer.get();
        this.numLeadingSamplesKnown = ((value & 0x80) == 0x80);
        this.numLeadingSamples = (short)(value & 0x7F);
    }
    
    public void setNumLeadingSamples(final short numLeadingSamples) {
        this.numLeadingSamples = numLeadingSamples;
    }
    
    public void setNumLeadingSamplesKnown(final boolean numLeadingSamplesKnown) {
        this.numLeadingSamplesKnown = numLeadingSamplesKnown;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("VisualRandomAccessEntry");
        sb.append("{numLeadingSamplesKnown=").append(this.numLeadingSamplesKnown);
        sb.append(", numLeadingSamples=").append(this.numLeadingSamples);
        sb.append('}');
        return sb.toString();
    }
}
