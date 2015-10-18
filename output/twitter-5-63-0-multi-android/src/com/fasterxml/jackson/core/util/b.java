// 
// Decompiled by Procyon v0.5.30
// 

package com.fasterxml.jackson.core.util;

import java.util.Iterator;
import java.util.LinkedList;
import java.io.OutputStream;

public final class b extends OutputStream
{
    public static final byte[] a;
    private final a b;
    private final LinkedList c;
    private int d;
    private byte[] e;
    private int f;
    
    static {
        a = new byte[0];
    }
    
    public b() {
        this(null);
    }
    
    public b(final a a) {
        this(a, 500);
    }
    
    public b(final a b, final int n) {
        this.c = new LinkedList();
        this.b = b;
        byte[] a;
        if (b == null) {
            a = new byte[n];
        }
        else {
            a = b.a(2);
        }
        this.e = a;
    }
    
    private void g() {
        int n = 262144;
        this.d += this.e.length;
        final int max = Math.max(this.d >> 1, 1000);
        if (max <= n) {
            n = max;
        }
        this.c.add(this.e);
        this.e = new byte[n];
        this.f = 0;
    }
    
    public void a() {
        this.d = 0;
        this.f = 0;
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
    }
    
    public void a(final int n) {
        if (this.f >= this.e.length) {
            this.g();
        }
        this.e[this.f++] = (byte)n;
    }
    
    public byte[] b() {
        final int n = this.d + this.f;
        if (n == 0) {
            return com.fasterxml.jackson.core.util.b.a;
        }
        final byte[] array = new byte[n];
        final Iterator iterator = this.c.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            final byte[] array2 = iterator.next();
            final int length = array2.length;
            System.arraycopy(array2, 0, array, n2, length);
            n2 += length;
        }
        System.arraycopy(this.e, 0, array, n2, this.f);
        final int n3 = n2 + this.f;
        if (n3 != n) {
            throw new RuntimeException("Internal error: total len assumed to be " + n + ", copied " + n3 + " bytes");
        }
        if (!this.c.isEmpty()) {
            this.a();
        }
        return array;
    }
    
    public byte[] b(final int f) {
        this.f = f;
        return this.b();
    }
    
    public void c(final int f) {
        this.f = f;
    }
    
    public byte[] c() {
        this.a();
        return this.e;
    }
    
    @Override
    public void close() {
    }
    
    public byte[] d() {
        this.g();
        return this.e;
    }
    
    public byte[] e() {
        return this.e;
    }
    
    public int f() {
        return this.f;
    }
    
    @Override
    public void flush() {
    }
    
    @Override
    public void write(final int n) {
        this.a(n);
    }
    
    @Override
    public void write(final byte[] array) {
        this.write(array, 0, array.length);
    }
    
    @Override
    public void write(final byte[] array, int n, int n2) {
        while (true) {
            final int min = Math.min(this.e.length - this.f, n2);
            if (min > 0) {
                System.arraycopy(array, n, this.e, this.f, min);
                n += min;
                this.f += min;
                n2 -= min;
            }
            if (n2 <= 0) {
                break;
            }
            this.g();
        }
    }
}
