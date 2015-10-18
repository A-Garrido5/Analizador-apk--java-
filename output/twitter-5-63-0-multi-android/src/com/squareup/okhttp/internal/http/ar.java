// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLHandshakeException;
import java.io.IOException;
import java.util.NoSuchElementException;
import com.squareup.okhttp.c;
import com.squareup.okhttp.m;
import java.net.SocketAddress;
import java.util.LinkedList;
import java.util.List;
import java.net.InetAddress;
import java.util.Iterator;
import java.net.InetSocketAddress;
import java.net.Proxy;
import com.squareup.okhttp.n;
import com.squareup.okhttp.d;
import java.net.ProxySelector;
import java.net.URI;
import com.squareup.okhttp.a;

public final class ar
{
    private final a a;
    private final URI b;
    private final ProxySelector c;
    private final d d;
    private final ax e;
    private final n f;
    private Proxy g;
    private InetSocketAddress h;
    private boolean i;
    private Proxy j;
    private Iterator k;
    private InetAddress[] l;
    private int m;
    private int n;
    private int o;
    private final List p;
    
    public ar(final a a, final URI b, final ProxySelector c, final d d, final ax e, final n f) {
        this.o = -1;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.p = new LinkedList();
        this.a(b, a.e());
    }
    
    private void a(final Proxy proxy) {
        this.l = null;
        String a;
        if (proxy.type() == Proxy.Type.DIRECT) {
            a = this.a.a();
            this.n = this.a.b();
        }
        else {
            final SocketAddress address = proxy.address();
            if (!(address instanceof InetSocketAddress)) {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + ((InetSocketAddress)address).getClass());
            }
            final InetSocketAddress inetSocketAddress = (InetSocketAddress)address;
            final String hostName = inetSocketAddress.getHostName();
            this.n = inetSocketAddress.getPort();
            a = hostName;
        }
        this.l = this.e.a(a);
        this.m = 0;
    }
    
    private void a(final URI uri, final Proxy j) {
        this.i = true;
        if (j != null) {
            this.j = j;
        }
        else {
            final List<Proxy> select = this.c.select(uri);
            if (select != null) {
                this.k = select.iterator();
            }
        }
    }
    
    private boolean c() {
        return this.i;
    }
    
    private Proxy d() {
        if (this.j != null) {
            this.i = false;
            return this.j;
        }
        if (this.k != null) {
            while (this.k.hasNext()) {
                final Proxy proxy = this.k.next();
                if (proxy.type() != Proxy.Type.DIRECT) {
                    return proxy;
                }
            }
        }
        this.i = false;
        return Proxy.NO_PROXY;
    }
    
    private boolean e() {
        return this.l != null;
    }
    
    private InetSocketAddress f() {
        final InetSocketAddress inetSocketAddress = new InetSocketAddress(this.l[this.m++], this.n);
        if (this.m == this.l.length) {
            this.l = null;
            this.m = 0;
        }
        return inetSocketAddress;
    }
    
    private void g() {
        int o;
        if (this.a.c() != null) {
            o = 1;
        }
        else {
            o = 0;
        }
        this.o = o;
    }
    
    private boolean h() {
        return this.o != -1;
    }
    
    private int i() {
        if (this.o == 1) {
            this.o = 0;
            return 1;
        }
        if (this.o == 0) {
            this.o = -1;
            return 0;
        }
        throw new AssertionError();
    }
    
    private boolean j() {
        return !this.p.isEmpty();
    }
    
    private m k() {
        return this.p.remove(0);
    }
    
    public a a() {
        return this.a;
    }
    
    public c a(final String s) {
        boolean b = true;
        while (true) {
            final c a = this.d.a(this.a);
            if (a != null) {
                if (s.equals("GET") || a.e()) {
                    return a;
                }
                a.close();
            }
            else {
                if (!this.h()) {
                    if (!this.e()) {
                        if (!this.c()) {
                            if (!this.j()) {
                                throw new NoSuchElementException();
                            }
                            return new c(this.d, this.k());
                        }
                        else {
                            this.a(this.g = this.d());
                        }
                    }
                    this.h = this.f();
                    this.g();
                }
                if (this.i() != (b ? 1 : 0)) {
                    b = false;
                }
                final m m = new m(this.a, this.g, this.h, b);
                if (this.f.c(m)) {
                    this.p.add(m);
                    return this.a(s);
                }
                return new c(this.d, m);
            }
        }
    }
    
    public void a(final c c, final IOException ex) {
        boolean b = true;
        if (c.n() <= 0) {
            final m b2 = c.b();
            if (b2.b().type() != Proxy.Type.DIRECT && this.c != null) {
                this.c.connectFailed(this.b, b2.b().address(), ex);
            }
            this.f.a(b2);
            if (this.h() && !(ex instanceof SSLHandshakeException) && !(ex instanceof SSLProtocolException)) {
                if (this.i() != (b ? 1 : 0)) {
                    b = false;
                }
                this.f.a(new m(this.a, this.g, this.h, b));
            }
        }
    }
    
    public boolean b() {
        return this.h() || this.e() || this.c() || this.j();
    }
}
