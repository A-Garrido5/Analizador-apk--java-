// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Map;

final class h implements Entry
{
    final Object a;
    int b;
    h c;
    h d;
    Object e;
    h f;
    h g;
    h h;
    
    h() {
        this.a = null;
        this.c = this;
        this.d = this;
    }
    
    h(final h f, final Object a, final h d, final h c) {
        this.f = f;
        this.a = a;
        this.b = 1;
        this.d = d;
        this.c = c;
        c.d = this;
        d.c = this;
    }
    
    public h a() {
        final int e = n.e;
        h g = this.g;
        h h = this;
        while (g != null) {
            final h g2 = g.g;
            if (e != 0) {
                return g;
            }
            h = g;
            g = g2;
        }
        return h;
    }
    
    public h b() {
        final int e = n.e;
        h h = this.h;
        h h2 = this;
        while (h != null) {
            final h h3 = h.h;
            if (e != 0) {
                return h;
            }
            h2 = h;
            h = h3;
        }
        return h2;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof Entry;
        boolean b2 = false;
        if (b) {
            final Entry entry = (Entry)o;
            if (this.a == null) {
                final K key = (K)entry.getKey();
                b2 = false;
                if (key != null) {
                    return b2;
                }
            }
            else {
                final boolean equals = this.a.equals(entry.getKey());
                b2 = false;
                if (!equals) {
                    return b2;
                }
            }
            if (this.e == null) {
                final Object value = entry.getValue();
                b2 = false;
                if (value != null) {
                    return b2;
                }
            }
            else {
                final boolean equals2 = this.e.equals(entry.getValue());
                b2 = false;
                if (!equals2) {
                    return b2;
                }
            }
            b2 = true;
        }
        return b2;
    }
    
    @Override
    public Object getKey() {
        return this.a;
    }
    
    @Override
    public Object getValue() {
        return this.e;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.a == null) {
            hashCode = 0;
        }
        else {
            hashCode = this.a.hashCode();
        }
        final Object e = this.e;
        int hashCode2 = 0;
        if (e != null) {
            hashCode2 = this.e.hashCode();
        }
        return hashCode ^ hashCode2;
    }
    
    @Override
    public Object setValue(final Object e) {
        final Object e2 = this.e;
        this.e = e;
        return e2;
    }
    
    @Override
    public String toString() {
        return this.a + "=" + this.e;
    }
}
