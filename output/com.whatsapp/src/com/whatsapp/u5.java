// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.SystemClock;

final class u5
{
    public final kp a;
    public final String b;
    private final long c;
    
    public u5(final kp kp) {
        this(kp, null, -1L);
    }
    
    public u5(final kp a, final String b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public long a() {
        long n = 0L;
        if (this.c >= n) {
            n = SystemClock.elapsedRealtime() - this.c;
        }
        return n;
    }
    
    public boolean b() {
        return this.a == kp.SUCCESS;
    }
    
    @Override
    public String toString() {
        return this.a.toString();
    }
}
