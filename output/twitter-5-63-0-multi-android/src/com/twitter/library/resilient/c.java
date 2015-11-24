// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.resilient;

import com.twitter.errorreporter.ErrorReporter;
import org.json.JSONException;
import org.json.JSONObject;

public class c
{
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    private long e;
    private final JSONObject f;
    private long g;
    
    public c(final String a, final String b, final int c, final long d, final long e, final long g, final String s) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.g = g;
        if (s == null || s.trim().isEmpty()) {
            this.f = new JSONObject();
            return;
        }
        this.f = new JSONObject(s);
    }
    
    public long a(final String s, final long n) {
        try {
            return this.f.getLong(s);
        }
        catch (JSONException ex) {
            return n;
        }
    }
    
    public String a() {
        return this.f.toString();
    }
    
    public long b() {
        return this.e;
    }
    
    public void b(final String s, final long n) {
        try {
            this.f.put(s, n);
        }
        catch (JSONException ex) {
            ErrorReporter.a((Throwable)ex);
        }
    }
    
    public long c() {
        return this.g;
    }
    
    public void d() {
        this.g = System.currentTimeMillis();
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof c && ((c)o).a.equals(this.a);
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
}
