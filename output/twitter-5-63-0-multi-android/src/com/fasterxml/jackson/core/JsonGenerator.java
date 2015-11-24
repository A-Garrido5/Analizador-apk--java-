// 
// Decompiled by Procyon v0.5.30
// 

package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.e;
import java.math.BigDecimal;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import java.io.Flushable;
import java.io.Closeable;

public abstract class JsonGenerator implements Closeable, Flushable
{
    protected c a;
    
    public JsonGenerator a(final int n) {
        return this;
    }
    
    public JsonGenerator a(final d d) {
        throw new UnsupportedOperationException();
    }
    
    public JsonGenerator a(final CharacterEscapes characterEscapes) {
        return this;
    }
    
    public abstract void a();
    
    public abstract void a(final char p0);
    
    public abstract void a(final double p0);
    
    public abstract void a(final float p0);
    
    public abstract void a(final long p0);
    
    public abstract void a(final String p0);
    
    public final void a(final String s, final double n) {
        this.a(s);
        this.a(n);
    }
    
    public final void a(final String s, final float n) {
        this.a(s);
        this.a(n);
    }
    
    public final void a(final String s, final int n) {
        this.a(s);
        this.b(n);
    }
    
    public final void a(final String s, final long n) {
        this.a(s);
        this.a(n);
    }
    
    public void a(final String s, final String s2) {
        this.a(s);
        this.b(s2);
    }
    
    public final void a(final String s, final BigDecimal bigDecimal) {
        this.a(s);
        this.a(bigDecimal);
    }
    
    public final void a(final String s, final boolean b) {
        this.a(s);
        this.a(b);
    }
    
    public abstract void a(final BigDecimal p0);
    
    public abstract void a(final boolean p0);
    
    public abstract void b();
    
    public abstract void b(final int p0);
    
    public void b(final d d) {
        this.c(d.a());
    }
    
    public abstract void b(final String p0);
    
    public abstract void c();
    
    public abstract void c(final String p0);
    
    @Override
    public abstract void close();
    
    public abstract void d();
    
    public final void d(final String s) {
        this.a(s);
        this.a();
    }
    
    public abstract void e();
    
    public final void e(final String s) {
        this.a(s);
        this.c();
    }
    
    protected final void f() {
        e.a();
    }
    
    protected void f(final String s) {
        throw new JsonGenerationException(s);
    }
    
    @Override
    public abstract void flush();
}
