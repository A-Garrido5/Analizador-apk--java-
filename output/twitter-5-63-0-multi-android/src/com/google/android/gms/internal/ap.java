// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Looper;
import android.text.TextUtils;

public final class ap
{
    public static Object a(final Object o) {
        if (o == null) {
            throw new NullPointerException("null reference");
        }
        return o;
    }
    
    public static Object a(final Object o, final Object o2) {
        if (o == null) {
            throw new NullPointerException(String.valueOf(o2));
        }
        return o;
    }
    
    public static String a(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return s;
    }
    
    public static String a(final String s, final Object o) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            throw new IllegalArgumentException(String.valueOf(o));
        }
        return s;
    }
    
    public static void a(final boolean b) {
        if (!b) {
            throw new IllegalStateException();
        }
    }
    
    public static void a(final boolean b, final Object o) {
        if (!b) {
            throw new IllegalStateException(String.valueOf(o));
        }
    }
    
    public static void a(final boolean b, final String s, final Object... array) {
        if (!b) {
            throw new IllegalStateException(String.format(s, array));
        }
    }
    
    public static void b(final String s) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException(s);
        }
    }
    
    public static void b(final boolean b) {
        if (!b) {
            throw new IllegalArgumentException();
        }
    }
    
    public static void b(final boolean b, final Object o) {
        if (!b) {
            throw new IllegalArgumentException(String.valueOf(o));
        }
    }
    
    public static void b(final boolean b, final String s, final Object... array) {
        if (!b) {
            throw new IllegalArgumentException(String.format(s, array));
        }
    }
    
    public static void c(final String s) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException(s);
        }
    }
}
