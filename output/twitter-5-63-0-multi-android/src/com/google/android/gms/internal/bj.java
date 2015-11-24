// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Build$VERSION;

public final class bj
{
    public static boolean a() {
        return a(11);
    }
    
    private static boolean a(final int n) {
        return Build$VERSION.SDK_INT >= n;
    }
    
    public static boolean b() {
        return a(13);
    }
    
    public static boolean c() {
        return a(14);
    }
}
