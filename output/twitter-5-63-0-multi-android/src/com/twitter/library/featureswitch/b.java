// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.featureswitch;

import android.os.Looper;
import android.os.Handler;

public abstract class b
{
    private static final Handler a;
    
    static {
        a = new Handler(Looper.getMainLooper());
    }
    
    public static void a(final long n) {
        d.b(n);
    }
    
    public static void a(final long n, final long n2) {
        if (n2 == 0L) {
            a(n);
            return;
        }
        b.a.postDelayed((Runnable)new c(n), n2);
    }
}
