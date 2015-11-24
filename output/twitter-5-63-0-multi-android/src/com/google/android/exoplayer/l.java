// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.exoplayer;

import android.os.SystemClock;

class l
{
    private boolean a;
    private long b;
    private long c;
    
    private long b(final long n) {
        return 1000L * SystemClock.elapsedRealtime() - n;
    }
    
    public void a() {
        if (!this.a) {
            this.a = true;
            this.c = this.b(this.b);
        }
    }
    
    public void a(final long b) {
        this.b = b;
        this.c = this.b(b);
    }
    
    public void b() {
        if (this.a) {
            this.b = this.b(this.c);
            this.a = false;
        }
    }
    
    public long c() {
        if (this.a) {
            return this.b(this.c);
        }
        return this.b;
    }
}
