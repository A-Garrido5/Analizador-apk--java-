// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.io.IOException;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;

@Descriptor(tags = { 0 })
public abstract class BaseDescriptor
{
    int sizeBytes;
    int sizeOfInstance;
    int tag;
    
    public int getSize() {
        return 1 + this.sizeOfInstance + this.sizeBytes;
    }
    
    public int getSizeBytes() {
        return this.sizeBytes;
    }
    
    public int getSizeOfInstance() {
        return this.sizeOfInstance;
    }
    
    public int getTag() {
        return this.tag;
    }
    
    public final void parse(final int tag, final ByteBuffer byteBuffer) throws IOException {
        this.tag = tag;
        int n = IsoTypeReader.readUInt8(byteBuffer);
        int sizeBytes = 0 + 1;
        this.sizeOfInstance = (n & 0x7F);
        while (n >>> 7 == 1) {
            n = IsoTypeReader.readUInt8(byteBuffer);
            ++sizeBytes;
            this.sizeOfInstance = (this.sizeOfInstance << 7 | (n & 0x7F));
        }
        this.sizeBytes = sizeBytes;
        final ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.sizeOfInstance);
        this.parseDetail(slice);
        assert slice.remaining() == 0 : String.valueOf(this.getClass().getSimpleName()) + " has not been fully parsed";
        byteBuffer.position(byteBuffer.position() + this.sizeOfInstance);
    }
    
    public abstract void parseDetail(final ByteBuffer p0) throws IOException;
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BaseDescriptor");
        sb.append("{tag=").append(this.tag);
        sb.append(", sizeOfInstance=").append(this.sizeOfInstance);
        sb.append('}');
        return sb.toString();
    }
}
