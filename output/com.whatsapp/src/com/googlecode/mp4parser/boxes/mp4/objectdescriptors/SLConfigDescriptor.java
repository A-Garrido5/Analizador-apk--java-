// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.IsoTypeWriter;
import java.io.IOException;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;

@Descriptor(tags = { 6 })
public class SLConfigDescriptor extends BaseDescriptor
{
    int predefined;
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            if (this.predefined != ((SLConfigDescriptor)o).predefined) {
                return false;
            }
        }
        return true;
    }
    
    public int getPredefined() {
        return this.predefined;
    }
    
    @Override
    public int hashCode() {
        return this.predefined;
    }
    
    @Override
    public void parseDetail(final ByteBuffer byteBuffer) throws IOException {
        this.predefined = IsoTypeReader.readUInt8(byteBuffer);
    }
    
    public ByteBuffer serialize() {
        final ByteBuffer allocate = ByteBuffer.allocate(3);
        IsoTypeWriter.writeUInt8(allocate, 6);
        IsoTypeWriter.writeUInt8(allocate, 1);
        IsoTypeWriter.writeUInt8(allocate, this.predefined);
        return allocate;
    }
    
    public int serializedSize() {
        return 3;
    }
    
    public void setPredefined(final int predefined) {
        this.predefined = predefined;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SLConfigDescriptor");
        sb.append("{predefined=").append(this.predefined);
        sb.append('}');
        return sb.toString();
    }
}
