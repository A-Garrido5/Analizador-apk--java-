// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.nio.ByteBuffer;

public class VideoFrameConverter
{
    private int a;
    
    public VideoFrameConverter() {
        this.a = create();
    }
    
    private static native void configure(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7, final int p8, final int p9, final int p10);
    
    private static native void convertFrame(final int p0, final ByteBuffer p1, final ByteBuffer p2);
    
    private static native int create();
    
    private static native void release(final int p0);
    
    public static native void setLogFilePath(final String p0);
    
    public void a() {
        release(this.a);
    }
    
    public void a(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10) {
        configure(this.a, n, n2, n3, n4, n5, n6, n7, n8, n9, n10);
    }
    
    public void a(final ByteBuffer byteBuffer, final ByteBuffer byteBuffer2) {
        convertFrame(this.a, byteBuffer, byteBuffer2);
    }
}
