// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.content.Context;

public class bk
{
    private final Context a;
    private final String b;
    private final cg c;
    private final String d;
    private bl e;
    
    private bk(final Context a, final String b, final String d, final cg c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = null;
        this.d = d;
    }
    
    public static bk a(final Context context, final String s, final String s2, final cg cg) {
        return new bk(context, s, s2, cg);
    }
}
