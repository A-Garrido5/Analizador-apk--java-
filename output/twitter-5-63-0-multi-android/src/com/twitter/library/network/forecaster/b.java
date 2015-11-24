// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network.forecaster;

import com.twitter.util.n;
import android.content.Context;
import com.twitter.util.m;

public class b extends m
{
    private static b a;
    private final c b;
    private final a c;
    
    b(final Context context) {
        this(new c(), new a(context));
    }
    
    b(final c b, final a c) {
        this.b = b;
        this.c = c;
    }
    
    public static b a() {
        synchronized (b.class) {
            if (b.a == null) {
                throw new IllegalStateException("Network class has not been initialized.");
            }
        }
        // monitorexit(b.class)
        return b.a;
    }
    
    public static void a(final Context context) {
        synchronized (b.class) {
            if (b.a != null) {
                throw new IllegalStateException("Network class has already been initialized.");
            }
        }
        b.a = new b(context);
    }
    // monitorexit(b.class)
    
    @Override
    public boolean a(final n n) {
        return this.b.a(n);
    }
    
    public NetworkQuality b() {
        return this.b.a();
    }
    
    @Override
    public boolean b(final n n) {
        return this.b.b(n);
    }
}
