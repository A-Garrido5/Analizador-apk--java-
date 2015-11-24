// 
// Decompiled by Procyon v0.5.30
// 

package com.fasterxml.jackson.core;

import java.io.Closeable;

public abstract class JsonParser implements Closeable
{
    protected int a;
    
    public double a(final double n) {
        return n;
    }
    
    public int a(final int n) {
        return n;
    }
    
    public long a(final long n) {
        return n;
    }
    
    public abstract JsonToken a();
    
    public abstract String a(final String p0);
    
    public boolean a(final JsonParser$Feature jsonParser$Feature) {
        return jsonParser$Feature.a(this.a);
    }
    
    public boolean a(final d d) {
        return this.a() == JsonToken.f && d.a().equals(this.e());
    }
    
    public boolean a(final boolean b) {
        return b;
    }
    
    protected JsonParseException b(final String s) {
        return new JsonParseException(s, this.f());
    }
    
    public String b() {
        if (this.a() == JsonToken.h) {
            return this.g();
        }
        return null;
    }
    
    public abstract JsonParser c();
    
    @Override
    public abstract void close();
    
    public abstract JsonToken d();
    
    public abstract String e();
    
    public abstract JsonLocation f();
    
    public abstract String g();
    
    public abstract int h();
    
    public abstract long i();
    
    public abstract float j();
    
    public abstract double k();
    
    public boolean l() {
        final JsonToken d = this.d();
        if (d == JsonToken.k) {
            return true;
        }
        if (d == JsonToken.l) {
            return false;
        }
        throw new JsonParseException("Current token (" + d + ") not of boolean type", this.f());
    }
    
    public abstract Object m();
    
    public int n() {
        return this.a(0);
    }
    
    public long o() {
        return this.a(0L);
    }
    
    public double p() {
        return this.a(0.0);
    }
    
    public boolean q() {
        return this.a(false);
    }
    
    public String r() {
        return this.a((String)null);
    }
}
