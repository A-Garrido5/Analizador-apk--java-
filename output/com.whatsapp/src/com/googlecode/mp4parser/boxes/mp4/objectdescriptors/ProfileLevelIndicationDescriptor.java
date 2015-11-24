// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.io.IOException;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;

@Descriptor(tags = { 20 })
public class ProfileLevelIndicationDescriptor extends BaseDescriptor
{
    int profileLevelIndicationIndex;
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            if (this.profileLevelIndicationIndex != ((ProfileLevelIndicationDescriptor)o).profileLevelIndicationIndex) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return this.profileLevelIndicationIndex;
    }
    
    @Override
    public void parseDetail(final ByteBuffer byteBuffer) throws IOException {
        this.profileLevelIndicationIndex = IsoTypeReader.readUInt8(byteBuffer);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ProfileLevelIndicationDescriptor");
        sb.append("{profileLevelIndicationIndex=").append(Integer.toHexString(this.profileLevelIndicationIndex));
        sb.append('}');
        return sb.toString();
    }
}
