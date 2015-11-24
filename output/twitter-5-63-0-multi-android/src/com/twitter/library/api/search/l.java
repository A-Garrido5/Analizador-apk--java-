// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.search;

import java.util.ArrayList;

public class l
{
    public final ArrayList a;
    public final String b;
    public final boolean c;
    public boolean d;
    public int e;
    public long f;
    public final String g;
    public final String h;
    public final String i;
    public ArrayList j;
    
    public l(final ArrayList a, final String b, final int n, final boolean c, final int e, final ArrayList j, final String g, final String h, final String i, final boolean d) {
        this.a = a;
        this.b = b;
        long f;
        if (n > 0) {
            f = 1000L * n;
        }
        else {
            f = -1L;
        }
        this.f = f;
        this.c = c;
        this.e = e;
        this.j = j;
        this.g = g;
        this.h = h;
        this.i = i;
        this.d = d;
    }
}
