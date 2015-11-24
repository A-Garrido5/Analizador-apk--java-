// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.SystemClock;

public final class i_
{
    private final long a;
    
    public i_() {
        this(System.currentTimeMillis() - SystemClock.elapsedRealtime());
    }
    
    public i_(final long a) {
        this.a = a;
    }
    
    public long a() {
        return SystemClock.elapsedRealtime() + this.a;
    }
}
