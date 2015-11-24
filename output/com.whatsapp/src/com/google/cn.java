// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Map;

class cn implements Entry, Comparable
{
    final gh a;
    private Object b;
    private final Comparable c;
    
    cn(final gh a, final Comparable c, final Object b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    cn(final gh gh, final Entry entry) {
        this(gh, entry.getKey(), entry.getValue());
    }
    
    private boolean a(final Object o, final Object o2) {
        if (o == null) {
            return o2 == null;
        }
        return o.equals(o2);
    }
    
    public int a(final cn cn) {
        return this.a().compareTo(cn.a());
    }
    
    public Comparable a() {
        return this.c;
    }
    
    @Override
    public int compareTo(final Object o) {
        return this.a((cn)o);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o != this) {
            if (!(o instanceof Entry)) {
                return false;
            }
            final Entry entry = (Entry)o;
            if (!this.a(this.c, entry.getKey()) || !this.a(this.b, entry.getValue())) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public Object getKey() {
        return this.a();
    }
    
    @Override
    public Object getValue() {
        return this.b;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.c == null) {
            hashCode = 0;
        }
        else {
            hashCode = this.c.hashCode();
        }
        final Object b = this.b;
        int hashCode2 = 0;
        if (b != null) {
            hashCode2 = this.b.hashCode();
        }
        return hashCode ^ hashCode2;
    }
    
    @Override
    public Object setValue(final Object b) {
        gh.c(this.a);
        final Object b2 = this.b;
        this.b = b;
        return b2;
    }
    
    @Override
    public String toString() {
        return this.c + "=" + this.b;
    }
}
