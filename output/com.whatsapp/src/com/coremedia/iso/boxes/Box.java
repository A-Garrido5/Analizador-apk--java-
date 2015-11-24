// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import com.coremedia.iso.BoxParser;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.io.IOException;
import java.nio.channels.WritableByteChannel;

public interface Box
{
    void getBox(final WritableByteChannel p0) throws IOException;
    
    long getOffset();
    
    Container getParent();
    
    long getSize();
    
    String getType();
    
    void parse(final FileChannel p0, final ByteBuffer p1, final long p2, final BoxParser p3) throws IOException;
    
    void setParent(final Container p0);
}
