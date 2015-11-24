// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp;

import java.net.SocketTimeoutException;
import java.net.Proxy;
import com.squareup.okhttp.internal.http.w;
import com.squareup.okhttp.internal.http.as;
import com.squareup.okhttp.internal.http.u;
import com.squareup.okhttp.internal.http.ah;
import com.squareup.okhttp.internal.http.ab;
import com.squareup.okhttp.internal.http.i;
import com.squareup.okhttp.internal.spdy.ag;
import java.io.IOException;
import javax.net.ssl.SSLSocket;
import com.squareup.okhttp.internal.spdy.y;
import com.squareup.okhttp.internal.http.k;
import java.io.OutputStream;
import java.io.InputStream;
import java.net.Socket;
import java.io.Closeable;

public final class c implements Closeable
{
    private final d a;
    private final m b;
    private Socket c;
    private InputStream d;
    private OutputStream e;
    private bj f;
    private bi g;
    private boolean h;
    private k i;
    private y j;
    private int k;
    private long l;
    private f m;
    private int n;
    
    public c(final d a, final m b) {
        this.h = false;
        this.k = 1;
        this.a = a;
        this.b = b;
    }
    
    private void a(final o o) {
        final ba a = ba.a();
        if (this.l()) {
            this.b(o);
        }
        this.c = this.b.a.d.createSocket(this.c, this.b.a.b, this.b.a.c, true);
        final SSLSocket sslSocket = (SSLSocket)this.c;
        if (this.b.d) {
            a.a(sslSocket, this.b.a.b);
        }
        else {
            a.a(sslSocket);
        }
        final boolean contains = this.b.a.g.contains(Protocol.b);
        sslSocket.startHandshake();
        if (!this.b.a.e.verify(this.b.a.b, sslSocket.getSession())) {
            throw new IOException("Hostname '" + this.b.a.b + "' was not verified");
        }
        this.e = sslSocket.getOutputStream();
        this.d = sslSocket.getInputStream();
        this.m = com.squareup.okhttp.f.a(sslSocket.getSession());
        this.o();
        Protocol protocol = Protocol.c;
        if (contains) {
            protocol = Protocol.b;
        }
        if (protocol.spdyVariant) {
            sslSocket.setSoTimeout(0);
            (this.j = new ag(this.b.a.a(), true, this.f, this.g).a(protocol).a()).e();
            return;
        }
        this.i = new k(this.a, this, this.f, this.g);
    }
    
    private void b(final o o) {
        final bj a = bt.a(bt.a(this.d));
        final k k = new k(this.a, this, a, bt.a(bt.a(this.e)));
        ab ab = o.b();
        final String a2 = o.a();
        do {
            k.a(ab.d(), a2);
            k.d();
            final ah a3 = k.e().a(ab).a();
            k.g();
            switch (a3.c()) {
                default: {
                    throw new IOException("Unexpected response code for CONNECT: " + a3.c());
                }
                case 200: {
                    if (a.b().l() > 0L) {
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    }
                    return;
                }
                case 407: {
                    ab = com.squareup.okhttp.internal.http.i.a(this.b.a.f, a3, this.b.b);
                    continue;
                }
            }
        } while (ab != null);
        throw new IOException("Failed to authenticate with proxy");
    }
    
    private void o() {
        this.f = bt.a(bt.a(this.d));
        this.g = bt.a(bt.a(this.e));
    }
    
    public Object a(final u u) {
        if (this.j != null) {
            return new as(u, this.j);
        }
        return new w(u, this.i);
    }
    
    public void a(final int k) {
        this.k = k;
    }
    
    public void a(final int n, final int soTimeout, final o o) {
        if (this.h) {
            throw new IllegalStateException("already connected");
        }
        Socket c;
        if (this.b.b.type() != Proxy.Type.HTTP) {
            c = new Socket(this.b.b);
        }
        else {
            c = new Socket();
        }
        this.c = c;
        ba.a().a(this.c, this.b.c, n);
        this.c.setSoTimeout(soTimeout);
        this.d = this.c.getInputStream();
        this.e = this.c.getOutputStream();
        if (this.b.a.d != null) {
            this.a(o);
        }
        else {
            this.o();
            this.i = new k(this.a, this, this.f, this.g);
        }
        this.h = true;
    }
    
    public boolean a() {
        return this.h;
    }
    
    public boolean a(final long n) {
        return this.h() < System.nanoTime() - n;
    }
    
    public m b() {
        return this.b;
    }
    
    public void b(final int soTimeout) {
        if (!this.h) {
            throw new IllegalStateException("updateReadTimeout - not connected");
        }
        this.c.setSoTimeout(soTimeout);
    }
    
    public Socket c() {
        return this.c;
    }
    
    @Override
    public void close() {
        this.c.close();
    }
    
    public boolean d() {
        return !this.c.isClosed() && !this.c.isInputShutdown() && !this.c.isOutputShutdown() && (!this.j() || !this.j.f());
    }
    
    public boolean e() {
        if (this.f == null || this.j()) {
            return true;
        }
        try {
            final int soTimeout = this.c.getSoTimeout();
            try {
                this.c.setSoTimeout(1);
                return !this.f.e();
            }
            finally {
                this.c.setSoTimeout(soTimeout);
            }
        }
        catch (IOException ex) {
            return false;
        }
        catch (SocketTimeoutException ex2) {
            return true;
        }
    }
    
    public void f() {
        if (this.j != null) {
            throw new IllegalStateException("spdyConnection != null");
        }
        this.l = System.nanoTime();
    }
    
    public boolean g() {
        return this.j == null || this.j.b();
    }
    
    public long h() {
        if (this.j == null) {
            return this.l;
        }
        return this.j.c();
    }
    
    public f i() {
        return this.m;
    }
    
    public boolean j() {
        return this.j != null;
    }
    
    public int k() {
        return this.k;
    }
    
    public boolean l() {
        return this.b.a.d != null && this.b.b.type() == Proxy.Type.HTTP;
    }
    
    public void m() {
        ++this.n;
    }
    
    public int n() {
        return this.n;
    }
}
