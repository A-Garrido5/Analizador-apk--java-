// 
// Decompiled by Procyon v0.5.30
// 

package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.util.d;
import com.fasterxml.jackson.core.util.a;
import com.fasterxml.jackson.core.JsonEncoding;

public class b
{
    protected final Object a;
    protected JsonEncoding b;
    protected final boolean c;
    protected final a d;
    protected byte[] e;
    protected byte[] f;
    protected byte[] g;
    protected char[] h;
    protected char[] i;
    protected char[] j;
    
    public b(final a d, final Object a, final boolean c) {
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.d = d;
        this.a = a;
        this.c = c;
    }
    
    private IllegalArgumentException i() {
        return new IllegalArgumentException("Trying to release buffer not owned by the context");
    }
    
    public Object a() {
        return this.a;
    }
    
    public void a(final JsonEncoding b) {
        this.b = b;
    }
    
    protected final void a(final Object o) {
        if (o != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }
    
    public void a(final byte[] array) {
        if (array != null) {
            this.a(array, this.e);
            this.e = null;
            this.d.a(0, array);
        }
    }
    
    protected final void a(final byte[] array, final byte[] array2) {
        if (array != array2 && array.length <= array2.length) {
            throw this.i();
        }
    }
    
    public void a(final char[] array) {
        if (array != null) {
            this.a(array, this.h);
            this.h = null;
            this.d.a(0, array);
        }
    }
    
    protected final void a(final char[] array, final char[] array2) {
        if (array != array2 && array.length <= array2.length) {
            throw this.i();
        }
    }
    
    public char[] a(final int n) {
        this.a((Object)this.h);
        return this.h = this.d.b(0, n);
    }
    
    public JsonEncoding b() {
        return this.b;
    }
    
    public void b(final byte[] array) {
        if (array != null) {
            this.a(array, this.f);
            this.f = null;
            this.d.a(1, array);
        }
    }
    
    public void b(final char[] array) {
        if (array != null) {
            this.a(array, this.i);
            this.i = null;
            this.d.a(1, array);
        }
    }
    
    public void c(final char[] array) {
        if (array != null) {
            this.a(array, this.j);
            this.j = null;
            this.d.a(3, array);
        }
    }
    
    public boolean c() {
        return this.c;
    }
    
    public d d() {
        return new d(this.d);
    }
    
    public byte[] e() {
        this.a((Object)this.e);
        return this.e = this.d.a(0);
    }
    
    public byte[] f() {
        this.a((Object)this.f);
        return this.f = this.d.a(1);
    }
    
    public char[] g() {
        this.a((Object)this.h);
        return this.h = this.d.b(0);
    }
    
    public char[] h() {
        this.a((Object)this.i);
        return this.i = this.d.b(1);
    }
}
