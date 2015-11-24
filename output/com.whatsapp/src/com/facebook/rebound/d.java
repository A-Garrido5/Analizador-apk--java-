// 
// Decompiled by Procyon v0.5.30
// 

package com.facebook.rebound;

import android.os.SystemClock;

class d implements Runnable
{
    final g a;
    
    d(final g a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (!g.a(this.a) || this.a.b == null) {
            return;
        }
        this.a.b.b(SystemClock.uptimeMillis() - g.c(this.a));
        g.d(this.a).post(g.b(this.a));
    }
}
