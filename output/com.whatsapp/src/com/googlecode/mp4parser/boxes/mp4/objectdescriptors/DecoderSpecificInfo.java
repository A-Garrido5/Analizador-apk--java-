// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.Hex;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

@Descriptor(tags = { 5 })
public class DecoderSpecificInfo extends BaseDescriptor
{
    byte[] bytes;
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            if (!Arrays.equals(this.bytes, ((DecoderSpecificInfo)o).bytes)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        if (this.bytes != null) {
            return Arrays.hashCode(this.bytes);
        }
        return 0;
    }
    
    @Override
    public void parseDetail(final ByteBuffer byteBuffer) throws IOException {
        if (this.sizeOfInstance > 0) {
            byteBuffer.get(this.bytes = new byte[this.sizeOfInstance]);
        }
    }
    
    public ByteBuffer serialize() {
        return ByteBuffer.wrap(this.bytes);
    }
    
    public int serializedSize() {
        return this.bytes.length;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DecoderSpecificInfo");
        final StringBuilder append = sb.append("{bytes=");
        String encodeHex;
        if (this.bytes == null) {
            encodeHex = "null";
        }
        else {
            encodeHex = Hex.encodeHex(this.bytes);
        }
        append.append(encodeHex);
        sb.append('}');
        return sb.toString();
    }
}
