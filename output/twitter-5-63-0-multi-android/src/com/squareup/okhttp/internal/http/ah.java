// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import java.io.IOException;
import com.squareup.okhttp.ResponseSource;
import com.squareup.okhttp.b;
import com.squareup.okhttp.f;

public final class ah
{
    private final ab a;
    private final au b;
    private final f c;
    private final com.squareup.okhttp.internal.http.f d;
    private final aj e;
    private final ah f;
    private volatile al g;
    private volatile b h;
    
    private ah(final ak ak) {
        this.a = ak.a;
        this.b = ak.b;
        this.c = ak.c;
        this.d = ak.d.a();
        this.e = ak.e;
        this.f = ak.f;
    }
    
    private al k() {
        final al g = this.g;
        if (g != null) {
            return g;
        }
        return this.g = new al(this.d, null);
    }
    
    public ab a() {
        return this.a;
    }
    
    public String a(final String s) {
        return this.a(s, null);
    }
    
    public String a(final String s, String s2) {
        final String a = this.d.a(s);
        if (a != null) {
            s2 = a;
        }
        return s2;
    }
    
    public boolean a(final ah ah) {
        if (ah.c() != 304) {
            final al k = ah.k();
            if (this.k().a == null || k.a == null || k.a.getTime() >= this.k().a.getTime()) {
                return false;
            }
        }
        return true;
    }
    
    public String b() {
        return this.b.a();
    }
    
    public int c() {
        return this.b.c();
    }
    
    public String d() {
        return this.b.d();
    }
    
    public int e() {
        return this.b.b();
    }
    
    public f f() {
        return this.c;
    }
    
    public com.squareup.okhttp.internal.http.f g() {
        return this.d;
    }
    
    public aj h() {
        return this.e;
    }
    
    public ak i() {
        return new ak(this, null);
    }
    
    public b j() {
        final b h = this.h;
        if (h != null) {
            return h;
        }
        return this.h = com.squareup.okhttp.b.a(this.d);
    }
}
