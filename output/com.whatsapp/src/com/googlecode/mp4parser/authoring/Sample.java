// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.authoring;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import java.nio.ByteBuffer;

public interface Sample
{
    ByteBuffer asByteBuffer();
    
    long remaining();
    
    void writeTo(final WritableByteChannel p0) throws IOException;
}
