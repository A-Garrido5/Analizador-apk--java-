// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp;

import java.net.URL;
import com.squareup.okhttp.internal.http.ae;
import com.squareup.okhttp.internal.http.ab;

public final class o
{
    final String a;
    final int b;
    final String c;
    final String d;
    
    public o(final String a, final int b, final String c, final String d) {
        if (a == null) {
            throw new NullPointerException("host == null");
        }
        if (c == null) {
            throw new NullPointerException("userAgent == null");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    String a() {
        return "CONNECT " + this.a + ":" + this.b + " HTTP/1.1";
    }
    
    ab b() {
        final ae a = new ae().a(new URL("https", this.a, this.b, "/"));
        String s;
        if (this.b == bf.a("https")) {
            s = this.a;
        }
        else {
            s = this.a + ":" + this.b;
        }
        a.a("Host", s);
        a.a("User-Agent", this.c);
        if (this.d != null) {
            a.a("Proxy-Authorization", this.d);
        }
        a.a("Proxy-Connection", "Keep-Alive");
        return a.a();
    }
}
