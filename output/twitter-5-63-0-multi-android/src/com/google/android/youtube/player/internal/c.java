// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player.internal;

import android.text.TextUtils;

public final class c
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
}
