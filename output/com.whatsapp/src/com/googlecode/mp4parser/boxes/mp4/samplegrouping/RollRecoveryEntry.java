// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import java.nio.ByteBuffer;

public class RollRecoveryEntry extends GroupEntry
{
    public static final String TYPE = "roll";
    private short rollDistance;
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            if (this.rollDistance != ((RollRecoveryEntry)o).rollDistance) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public ByteBuffer get() {
        final ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort(this.rollDistance);
        allocate.rewind();
        return allocate;
    }
    
    public short getRollDistance() {
        return this.rollDistance;
    }
    
    @Override
    public int hashCode() {
        return this.rollDistance;
    }
    
    @Override
    public void parse(final ByteBuffer byteBuffer) {
        this.rollDistance = byteBuffer.getShort();
    }
    
    public void setRollDistance(final short rollDistance) {
        this.rollDistance = rollDistance;
    }
}
