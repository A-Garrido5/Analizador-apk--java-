// 
// Decompiled by Procyon v0.5.30
// 

package com.facebook.rebound;

import android.os.SystemClock;
import android.view.Choreographer$FrameCallback;
import android.view.Choreographer;
import android.annotation.TargetApi;

@TargetApi(16)
class f extends e
{
    private final Choreographer c;
    private final Choreographer$FrameCallback d;
    private boolean e;
    private long f;
    
    public f(final Choreographer c) {
        this.c = c;
        this.d = (Choreographer$FrameCallback)new h(this);
    }
    
    static long a(final f f) {
        return f.f;
    }
    
    static long a(final f f, final long f2) {
        return f.f = f2;
    }
    
    public static f a() {
        return new f(Choreographer.getInstance());
    }
    
    static Choreographer b(final f f) {
        return f.c;
    }
    
    static boolean c(final f f) {
        return f.e;
    }
    
    static Choreographer$FrameCallback d(final f f) {
        return f.d;
    }
    
    @Override
    public void a() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.f = SystemClock.uptimeMillis();
        this.c.removeFrameCallback(this.d);
        this.c.postFrameCallback(this.d);
    }
    
    @Override
    public void b() {
        this.e = false;
        this.c.removeFrameCallback(this.d);
    }
}
