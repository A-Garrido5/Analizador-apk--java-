// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events.sports;

import com.twitter.library.api.TimelineScribeContent;

public class f extends gz
{
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final byte[] g;
    public final String h;
    public final String i;
    public final String j;
    public final TimelineScribeContent k;
    public final String l;
    public final int m;
    
    f(final g g) {
        super(g.a, g.b);
        if (g.c == null || g.f == null || g.g == null || g.i == null || g.j == null || g.l == null) {
            throw new IllegalArgumentException();
        }
        this.a = g.c;
        this.b = g.d;
        this.c = g.e;
        this.d = g.f;
        this.e = g.g;
        this.f = g.h;
        this.g = g.i;
        this.h = g.j;
        this.i = g.k;
        this.j = g.l;
        this.k = g.m;
        this.l = g.n;
        this.m = g.o;
    }
}
