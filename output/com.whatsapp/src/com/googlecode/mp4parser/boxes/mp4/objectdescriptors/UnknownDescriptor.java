// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

public class UnknownDescriptor extends BaseDescriptor
{
    private static Logger log;
    private ByteBuffer data;
    
    static {
        UnknownDescriptor.log = Logger.getLogger(UnknownDescriptor.class.getName());
    }
    
    @Override
    public void parseDetail(final ByteBuffer byteBuffer) throws IOException {
        this.data = (ByteBuffer)byteBuffer.slice().limit(this.getSizeOfInstance());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("UnknownDescriptor");
        sb.append("{tag=").append(this.tag);
        sb.append(", sizeOfInstance=").append(this.sizeOfInstance);
        sb.append(", data=").append(this.data);
        sb.append('}');
        return sb.toString();
    }
}
