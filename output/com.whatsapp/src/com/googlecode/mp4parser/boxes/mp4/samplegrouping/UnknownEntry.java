// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.coremedia.iso.Hex;
import java.nio.ByteBuffer;

public class UnknownEntry extends GroupEntry
{
    private ByteBuffer content;
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final UnknownEntry unknownEntry = (UnknownEntry)o;
            if (this.content != null) {
                if (this.content.equals(unknownEntry.content)) {
                    return true;
                }
            }
            else if (unknownEntry.content == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public ByteBuffer get() {
        return this.content.duplicate();
    }
    
    public ByteBuffer getContent() {
        return this.content;
    }
    
    @Override
    public int hashCode() {
        if (this.content != null) {
            return this.content.hashCode();
        }
        return 0;
    }
    
    @Override
    public void parse(final ByteBuffer byteBuffer) {
        this.content = (ByteBuffer)byteBuffer.duplicate().rewind();
    }
    
    public void setContent(final ByteBuffer byteBuffer) {
        this.content = (ByteBuffer)byteBuffer.duplicate().rewind();
    }
    
    @Override
    public String toString() {
        final ByteBuffer duplicate = this.content.duplicate();
        duplicate.rewind();
        final byte[] array = new byte[duplicate.limit()];
        duplicate.get(array);
        return "UnknownEntry{content=" + Hex.encodeHex(array) + '}';
    }
}
