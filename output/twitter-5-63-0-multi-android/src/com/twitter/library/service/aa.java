// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.service;

import com.twitter.internal.network.l;
import com.twitter.library.network.ae;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.api.RateLimit;
import android.os.Bundle;

public class aa
{
    private int a;
    private boolean b;
    public final Bundle c;
    private Exception d;
    private String e;
    private RateLimit f;
    private HttpOperation g;
    private x h;
    
    public aa() {
        this.c = new Bundle();
    }
    
    public void a(final int n) {
        this.a(n, null, null);
    }
    
    public void a(final int n, final Exception ex) {
        this.a(n, ex.getMessage(), ex);
    }
    
    public void a(final int n, final String s) {
        this.a(n, s, null);
    }
    
    public void a(final int a, final String e, final Exception d) {
        this.b = false;
        this.a = a;
        this.e = e;
        this.d = d;
    }
    
    public void a(final HttpOperation g) {
        this.b = g.k();
        final l l = g.l();
        this.a = l.a;
        this.d = l.c;
        this.e = l.b;
        this.f = ae.a(g);
        this.g = g;
    }
    
    public void a(final aa aa) {
        this.b = aa.b;
        this.a = aa.a;
        this.e = aa.e;
        this.d = aa.d;
        this.f = aa.f;
        this.g = aa.g;
        this.c.putAll(aa.c);
        this.h = aa.h;
    }
    
    public void a(final x h) {
        this.h = h;
    }
    
    public void a(final boolean b) {
        this.b = b;
    }
    
    public boolean a() {
        return this.b;
    }
    
    public Exception b() {
        return this.d;
    }
    
    public int c() {
        return this.a;
    }
    
    public String d() {
        return this.e;
    }
    
    public HttpOperation e() {
        return this.g;
    }
    
    public l f() {
        if (this.g != null) {
            return this.g.l();
        }
        return null;
    }
    
    public RateLimit g() {
        return this.f;
    }
    
    public x h() {
        return this.h;
    }
}
