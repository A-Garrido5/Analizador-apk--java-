// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import java.nio.ByteBuffer;

public abstract class GroupEntry
{
    public abstract ByteBuffer get();
    
    public abstract void parse(final ByteBuffer p0);
    
    public int size() {
        return this.get().limit();
    }
}
