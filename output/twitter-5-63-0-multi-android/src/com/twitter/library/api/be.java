// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

@Deprecated
public class be implements ab
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final TwitterUser h;
    public final int i;
    private final long j;
    private volatile int k;
    
    public be(final long j, final String a, final String b, final String c, final String d, final int e, final int f, final int g, final TwitterUser h, final int i) {
        this.j = j;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public long a() {
        return this.j;
    }
    
    @Override
    public String b() {
        return String.valueOf(this.j);
    }
    
    @Override
    public int hashCode() {
        if (this.k != 0) {
            return this.k;
        }
        final int n = 31 * (527 + (int)(this.j ^ this.j >>> 32));
        int hashCode;
        if (this.a != null) {
            hashCode = this.a.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n2 = 31 * (hashCode + n);
        int hashCode2;
        if (this.b != null) {
            hashCode2 = this.b.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n3 = 31 * (hashCode2 + n2);
        final String c = this.c;
        int hashCode3 = 0;
        if (c != null) {
            hashCode3 = this.c.hashCode();
        }
        return this.k = 31 * (31 * (31 * (31 * (31 * (n3 + hashCode3) + this.i) + this.e) + this.f) + this.e) + this.g;
    }
}
