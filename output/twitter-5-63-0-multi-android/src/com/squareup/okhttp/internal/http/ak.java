// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.b;
import java.io.IOException;
import com.squareup.okhttp.ResponseSource;
import com.squareup.okhttp.f;

public class ak
{
    private ab a;
    private au b;
    private f c;
    private h d;
    private aj e;
    private ah f;
    
    public ak() {
        this.d = new h();
    }
    
    private ak(final ah ah) {
        this.a = ah.a;
        this.b = ah.b;
        this.c = ah.c;
        this.d = ah.d.b();
        this.e = ah.e;
        this.f = ah.f;
    }
    
    public ah a() {
        if (this.a == null) {
            throw new IllegalStateException("request == null");
        }
        if (this.b == null) {
            throw new IllegalStateException("statusLine == null");
        }
        return new ah(this, null);
    }
    
    public ak a(final ResponseSource responseSource) {
        return this.a(y.d, responseSource + " " + this.b.c());
    }
    
    public ak a(final f c) {
        this.c = c;
        return this;
    }
    
    public ak a(final ab a) {
        this.a = a;
        return this;
    }
    
    public ak a(final aj e) {
        this.e = e;
        return this;
    }
    
    public ak a(final au b) {
        if (b == null) {
            throw new IllegalArgumentException("statusLine == null");
        }
        this.b = b;
        return this;
    }
    
    public ak a(final com.squareup.okhttp.internal.http.f f) {
        this.d = f.b();
        return this;
    }
    
    public ak a(final String s) {
        try {
            return this.a(new au(s));
        }
        catch (IOException ex) {
            throw new IllegalArgumentException(ex);
        }
    }
    
    public ak a(final String s, final String s2) {
        this.d.b(s, s2);
        return this;
    }
    
    public ak b(final String s) {
        this.d.b(s);
        return this;
    }
    
    public ak b(final String s, final String s2) {
        this.d.a(s, s2);
        return this;
    }
}
