// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.EnumMap;
import java.util.Map;

public final class aU
{
    private final d3 a;
    private final long b;
    private final String c;
    private Map d;
    private final byte[] e;
    private cs[] f;
    
    public aU(final String s, final byte[] array, final cs[] array2, final d3 d3) {
        this(s, array, array2, d3, System.currentTimeMillis());
    }
    
    public aU(final String c, final byte[] e, final cs[] f, final d3 a, final long b) {
        this.c = c;
        this.e = e;
        this.f = f;
        this.a = a;
        this.d = null;
        this.b = b;
    }
    
    public String a() {
        return this.c;
    }
    
    public void a(final A a, final Object o) {
        if (this.d == null) {
            this.d = new EnumMap(A.class);
        }
        this.d.put(a, o);
    }
    
    public void a(final Map d) {
        if (d != null) {
            if (this.d == null) {
                this.d = d;
                if (cs.c == 0) {
                    return;
                }
            }
            this.d.putAll(d);
        }
    }
    
    public void a(final cs[] f) {
        final cs[] f2 = this.f;
        if (f2 == null) {
            this.f = f;
            if (cs.c == 0) {
                return;
            }
        }
        if (f != null && f.length > 0) {
            final cs[] f3 = new cs[f2.length + f.length];
            System.arraycopy(f2, 0, f3, 0, f2.length);
            System.arraycopy(f, 0, f3, f2.length, f.length);
            this.f = f3;
        }
    }
    
    public byte[] b() {
        return this.e;
    }
    
    public cs[] c() {
        return this.f;
    }
    
    public Map d() {
        return this.d;
    }
    
    public d3 e() {
        return this.a;
    }
    
    @Override
    public String toString() {
        return this.c;
    }
}
