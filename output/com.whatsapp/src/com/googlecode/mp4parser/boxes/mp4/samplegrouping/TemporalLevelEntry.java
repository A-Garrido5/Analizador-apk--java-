// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import java.nio.ByteBuffer;

public class TemporalLevelEntry extends GroupEntry
{
    public static final String TYPE = "tele";
    private boolean levelIndependentlyDecodable;
    private short reserved;
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final TemporalLevelEntry temporalLevelEntry = (TemporalLevelEntry)o;
            if (this.levelIndependentlyDecodable != temporalLevelEntry.levelIndependentlyDecodable) {
                return false;
            }
            if (this.reserved != temporalLevelEntry.reserved) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public ByteBuffer get() {
        final ByteBuffer allocate = ByteBuffer.allocate(1);
        int n;
        if (this.levelIndependentlyDecodable) {
            n = 128;
        }
        else {
            n = 0;
        }
        allocate.put((byte)n);
        allocate.rewind();
        return allocate;
    }
    
    @Override
    public int hashCode() {
        int n;
        if (this.levelIndependentlyDecodable) {
            n = 1;
        }
        else {
            n = 0;
        }
        return n * 31 + this.reserved;
    }
    
    public boolean isLevelIndependentlyDecodable() {
        return this.levelIndependentlyDecodable;
    }
    
    @Override
    public void parse(final ByteBuffer byteBuffer) {
        this.levelIndependentlyDecodable = ((0x80 & byteBuffer.get()) == 0x80);
    }
    
    public void setLevelIndependentlyDecodable(final boolean levelIndependentlyDecodable) {
        this.levelIndependentlyDecodable = levelIndependentlyDecodable;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("TemporalLevelEntry");
        sb.append("{levelIndependentlyDecodable=").append(this.levelIndependentlyDecodable);
        sb.append('}');
        return sb.toString();
    }
}
