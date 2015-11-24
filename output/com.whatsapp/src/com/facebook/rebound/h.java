// 
// Decompiled by Procyon v0.5.30
// 

package com.facebook.rebound;

import android.os.SystemClock;
import android.view.Choreographer$FrameCallback;

class h implements Choreographer$FrameCallback
{
    final f a;
    
    h(final f a) {
        this.a = a;
    }
    
    public void doFrame(final long n) {
        if (!f.c(this.a) || this.a.b == null) {
            return;
        }
        final long uptimeMillis = SystemClock.uptimeMillis();
        this.a.b.b(uptimeMillis - f.a(this.a));
        f.a(this.a, uptimeMillis);
        f.b(this.a).postFrameCallback(f.d(this.a));
    }
}
