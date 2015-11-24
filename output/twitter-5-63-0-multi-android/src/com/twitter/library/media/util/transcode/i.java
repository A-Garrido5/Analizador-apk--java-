// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util.transcode;

import android.media.MediaCodec$BufferInfo;

abstract class i
{
    final MediaCodec$BufferInfo a;
    boolean b;
    int c;
    
    private i() {
        this.a = new MediaCodec$BufferInfo();
        this.c = 10000;
    }
    
    public int a() {
        return this.c(0);
    }
    
    public abstract int c(final int p0);
    
    public boolean c() {
        return this.b;
    }
    
    public i d(final int c) {
        this.c = c;
        return this;
    }
}
