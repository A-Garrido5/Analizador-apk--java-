// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.platform;

import android.annotation.TargetApi;
import android.os.Build$VERSION;
import android.os.SystemClock;

class d implements p
{
    @Override
    public long a() {
        return System.currentTimeMillis();
    }
    
    @Override
    public long b() {
        return SystemClock.elapsedRealtime();
    }
    
    @TargetApi(17)
    @Override
    public long c() {
        if (Build$VERSION.SDK_INT >= 17) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return System.nanoTime();
    }
}
