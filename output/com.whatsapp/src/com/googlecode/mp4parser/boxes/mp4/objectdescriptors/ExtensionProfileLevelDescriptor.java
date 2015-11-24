// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.Hex;
import java.io.IOException;
import java.nio.ByteBuffer;

@Descriptor(tags = { 19 })
public class ExtensionProfileLevelDescriptor extends BaseDescriptor
{
    byte[] bytes;
    
    @Override
    public void parseDetail(final ByteBuffer byteBuffer) throws IOException {
        if (this.getSize() > 0) {
            byteBuffer.get(this.bytes = new byte[this.getSize()]);
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ExtensionDescriptor");
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
