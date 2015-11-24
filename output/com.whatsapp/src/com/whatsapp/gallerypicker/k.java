// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;
import android.content.ContentResolver;
import android.net.Uri;

public abstract class k implements bj
{
    private String a;
    private final long b;
    protected Uri c;
    protected long d;
    protected ba e;
    private int f;
    private int g;
    protected final int h;
    protected ContentResolver i;
    protected String j;
    protected String k;
    
    protected k(final ba e, final ContentResolver i, final long d, final int h, final Uri c, final String k, final String j, final long b, final String a) {
        this.f = -1;
        this.g = -1;
        this.e = e;
        this.i = i;
        this.d = d;
        this.h = h;
        this.c = c;
        this.k = k;
        this.j = j;
        this.b = b;
        this.a = a;
    }
    
    public int a() {
        return 0;
    }
    
    public Bitmap a(final int n, final int n2) {
        final Uri a = this.e.a(this.d);
        Bitmap a2;
        if (a == null) {
            a2 = null;
        }
        else {
            a2 = bq.a(n, n2, a, this.i);
            if (a2 != null) {
                return bq.a(a2, this.a());
            }
        }
        return a2;
    }
    
    @Override
    public Uri a() {
        return this.c;
    }
    
    @Override
    public String b() {
        return this.k;
    }
    
    @Override
    public long c() {
        return this.b;
    }
    
    @Override
    public long d() {
        return 0L;
    }
    
    @Override
    public String e() {
        return this.j;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o != null && o instanceof k && this.c.equals((Object)((k)o).c);
    }
    
    @Override
    public int hashCode() {
        return this.c.hashCode();
    }
    
    @Override
    public String toString() {
        return this.c.toString();
    }
}
