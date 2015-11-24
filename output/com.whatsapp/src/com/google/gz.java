// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Map;

final class gz implements Entry
{
    final int a;
    gz b;
    Object c;
    int d;
    gz e;
    gz f;
    final Object g;
    gz h;
    gz i;
    
    gz() {
        this.g = null;
        this.a = -1;
        this.h = this;
        this.i = this;
    }
    
    gz(final gz e, final Object g, final int a, final gz i, final gz h) {
        this.e = e;
        this.g = g;
        this.a = a;
        this.d = 1;
        this.i = i;
        this.h = h;
        h.i = this;
        i.h = this;
    }
    
    public gz a() {
        final int e = n.e;
        gz b = this.b;
        gz gz = this;
        while (b != null) {
            final gz b2 = b.b;
            if (e != 0) {
                return b;
            }
            gz = b;
            b = b2;
        }
        return gz;
    }
    
    public gz b() {
        final int e = n.e;
        gz f = this.f;
        gz gz = this;
        while (f != null) {
            final gz f2 = f.f;
            if (e != 0) {
                return f;
            }
            gz = f;
            f = f2;
        }
        return gz;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof Entry;
        boolean b2 = false;
        if (b) {
            final Entry entry = (Entry)o;
            if (this.g == null) {
                final K key = (K)entry.getKey();
                b2 = false;
                if (key != null) {
                    return b2;
                }
            }
            else {
                final boolean equals = this.g.equals(entry.getKey());
                b2 = false;
                if (!equals) {
                    return b2;
                }
            }
            if (this.c == null) {
                final Object value = entry.getValue();
                b2 = false;
                if (value != null) {
                    return b2;
                }
            }
            else {
                final boolean equals2 = this.c.equals(entry.getValue());
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
        return this.g;
    }
    
    @Override
    public Object getValue() {
        return this.c;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.g == null) {
            hashCode = 0;
        }
        else {
            hashCode = this.g.hashCode();
        }
        final Object c = this.c;
        int hashCode2 = 0;
        if (c != null) {
            hashCode2 = this.c.hashCode();
        }
        return hashCode ^ hashCode2;
    }
    
    @Override
    public Object setValue(final Object c) {
        final Object c2 = this.c;
        this.c = c;
        return c2;
    }
    
    @Override
    public String toString() {
        return this.g + "=" + this.c;
    }
}
