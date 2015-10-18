// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.io.IOException;
import java.io.InputStream;
import com.twitter.util.f;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.io.Closeable;

public class ac implements Closeable, Iterable, Iterator
{
    private ae a;
    private RandomAccessFile b;
    private long c;
    private long d;
    private long e;
    private final int f;
    private String g;
    
    public ac(final RandomAccessFile b, final long c, final long d) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = 0L;
        this.f = (int)((this.c + this.d - 1L) / this.d);
    }
    
    private void f() {
        yh.a((Closeable)this.a);
        this.a = null;
    }
    
    public int a() {
        return this.f;
    }
    
    public bd b() {
        if (!this.hasNext()) {
            return null;
        }
        final long e = this.e;
        if (e + this.d >= this.c) {
            this.d = this.c - e;
        }
        this.e += this.d;
        try {
            this.f();
            this.a = new ae(this.b, e, this.d, null);
            this.g = com.twitter.util.f.a(this.a);
            this.c();
            return this.a;
        }
        catch (IOException ex) {
            this.a = null;
            return this.a;
        }
    }
    
    public bd c() {
        this.a.a();
        return this.a;
    }
    
    @Override
    public void close() {
        this.f();
    }
    
    public long d() {
        return this.d;
    }
    
    public String e() {
        if (this.a == null) {
            return null;
        }
        return this.g;
    }
    
    @Override
    public boolean hasNext() {
        return this.e < this.c;
    }
    
    @Override
    public Iterator iterator() {
        return this;
    }
    
    @Override
    public void remove() {
    }
}
