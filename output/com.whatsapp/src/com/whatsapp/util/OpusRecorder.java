// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.io.Closeable;

public class OpusRecorder implements Closeable
{
    private long a;
    
    public OpusRecorder(final String s) {
        this.allocateNative(s);
    }
    
    private native void allocateNative(final String p0);
    
    private native void freeNative();
    
    @Override
    public void close() {
        this.freeNative();
    }
    
    @Override
    protected void finalize() {
        super.finalize();
        if (this.a != 0L) {
            this.freeNative();
        }
    }
    
    public native void prepare();
    
    public native void start();
    
    public native void stop();
}
