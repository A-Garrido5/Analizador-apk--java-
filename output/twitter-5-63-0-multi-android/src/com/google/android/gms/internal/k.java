// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.util.Log;
import android.os.Looper;

public final class k
{
    public static void a(final Object o) {
        if (o == null) {
            throw new IllegalArgumentException("null reference");
        }
    }
    
    public static void a(final String s) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            Log.e("Asserts", "checkMainThread: current thread " + Thread.currentThread() + " IS NOT the main thread " + Looper.getMainLooper().getThread() + "!");
            throw new IllegalStateException(s);
        }
    }
    
    public static void b(final String s) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            Log.e("Asserts", "checkNotMainThread: current thread " + Thread.currentThread() + " IS the main thread " + Looper.getMainLooper().getThread() + "!");
            throw new IllegalStateException(s);
        }
    }
}
