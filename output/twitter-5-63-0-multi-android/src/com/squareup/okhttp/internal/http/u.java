// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import java.io.Closeable;
import com.squareup.okhttp.o;
import java.net.CookieHandler;
import java.util.List;
import java.util.Map;
import com.squareup.okhttp.l;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import com.squareup.okhttp.Protocol;
import java.net.UnknownHostException;
import com.squareup.okhttp.a;
import java.net.ProtocolException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import java.io.IOException;
import java.net.URL;
import java.net.CacheRequest;
import java.io.InputStream;
import com.squareup.okhttp.ResponseSource;
import com.squareup.okhttp.m;
import com.squareup.okhttp.c;
import com.squareup.okhttp.j;

public class u
{
    final j a;
    long b;
    public final boolean c;
    private c d;
    private ar e;
    private m f;
    private av g;
    private boolean h;
    private ab i;
    private ab j;
    private cc k;
    private bi l;
    private ResponseSource m;
    private ah n;
    private cd o;
    private cd p;
    private InputStream q;
    private ah r;
    private CacheRequest s;
    
    public u(final j a, final ab ab, final boolean c, final c d, final ar e, final aq k) {
        this.b = -1L;
        this.a = a;
        this.i = ab;
        this.j = ab;
        this.c = c;
        this.d = d;
        this.e = e;
        m b;
        if (d != null) {
            b = d.b();
        }
        else {
            b = null;
        }
        this.f = b;
        this.k = k;
    }
    
    private c a(final ar ar) {
        final c a = ar.a(this.j.c());
        if (!a.a()) {
            a.a(this.a.a(), this.a.b(), this.w());
            if (a.j()) {
                this.a.j().b(a);
            }
            this.a.l().b(a.b());
        }
        else if (!a.j()) {
            a.b(this.a.b());
            return a;
        }
        return a;
    }
    
    private static ah a(final ah ah, final ah ah2) {
        int i = 0;
        final h h = new h();
        final f g = ah.g();
        for (int j = 0; j < g.a(); ++j) {
            final String a = g.a(j);
            final String b = g.b(j);
            if ((!"Warning".equals(a) || !b.startsWith("1")) && (!a(a) || ah2.a(a) == null)) {
                h.a(a, b);
            }
        }
        for (f g2 = ah2.g(); i < g2.a(); ++i) {
            final String a2 = g2.a(i);
            if (a(a2)) {
                h.a(a2, g2.b(i));
            }
        }
        return ah.i().a(h.a()).a();
    }
    
    public static String a(final URL url) {
        if (bf.a(url) != bf.a(url.getProtocol())) {
            return url.getHost() + ":" + url.getPort();
        }
        return url.getHost();
    }
    
    private void a(final cd cd) {
        this.o = cd;
        if (this.h && "gzip".equalsIgnoreCase(this.n.a("Content-Encoding"))) {
            this.n = this.n.i().b("Content-Encoding").b("Content-Length").a();
            this.p = new bo(cd);
            return;
        }
        this.p = cd;
    }
    
    private static boolean a(final String s) {
        return !"Connection".equalsIgnoreCase(s) && !"Keep-Alive".equalsIgnoreCase(s) && !"Proxy-Authenticate".equalsIgnoreCase(s) && !"Proxy-Authorization".equalsIgnoreCase(s) && !"TE".equalsIgnoreCase(s) && !"Trailers".equalsIgnoreCase(s) && !"Transfer-Encoding".equalsIgnoreCase(s) && !"Upgrade".equalsIgnoreCase(s);
    }
    
    private boolean b(final IOException ex) {
        boolean b;
        if (ex instanceof SSLHandshakeException && ex.getCause() instanceof CertificateException) {
            b = true;
        }
        else {
            b = false;
        }
        final boolean b2 = ex instanceof ProtocolException;
        return !b && !b2;
    }
    
    public static String p() {
        final String property = System.getProperty("http.agent");
        if (property != null) {
            return property;
        }
        return "Java" + System.getProperty("java.version");
    }
    
    private ah r() {
        return this.n.i().a((aj)null).a();
    }
    
    private void s() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/squareup/okhttp/internal/http/u.d:Lcom/squareup/okhttp/c;
        //     4: ifnull          15
        //     7: new             Ljava/lang/IllegalStateException;
        //    10: dup            
        //    11: invokespecial   java/lang/IllegalStateException.<init>:()V
        //    14: athrow         
        //    15: aload_0        
        //    16: getfield        com/squareup/okhttp/internal/http/u.e:Lcom/squareup/okhttp/internal/http/ar;
        //    19: ifnonnull       130
        //    22: aload_0        
        //    23: invokespecial   com/squareup/okhttp/internal/http/u.t:()Lcom/squareup/okhttp/a;
        //    26: astore_1       
        //    27: aload_0        
        //    28: new             Lcom/squareup/okhttp/internal/http/ar;
        //    31: dup            
        //    32: aload_1        
        //    33: aload_0        
        //    34: getfield        com/squareup/okhttp/internal/http/u.j:Lcom/squareup/okhttp/internal/http/ab;
        //    37: invokevirtual   com/squareup/okhttp/internal/http/ab.b:()Ljava/net/URI;
        //    40: aload_0        
        //    41: getfield        com/squareup/okhttp/internal/http/u.a:Lcom/squareup/okhttp/j;
        //    44: invokevirtual   com/squareup/okhttp/j.d:()Ljava/net/ProxySelector;
        //    47: aload_0        
        //    48: getfield        com/squareup/okhttp/internal/http/u.a:Lcom/squareup/okhttp/j;
        //    51: invokevirtual   com/squareup/okhttp/j.j:()Lcom/squareup/okhttp/d;
        //    54: getstatic       ax.a:Lax;
        //    57: aload_0        
        //    58: getfield        com/squareup/okhttp/internal/http/u.a:Lcom/squareup/okhttp/j;
        //    61: invokevirtual   com/squareup/okhttp/j.l:()Lcom/squareup/okhttp/n;
        //    64: invokespecial   com/squareup/okhttp/internal/http/ar.<init>:(Lcom/squareup/okhttp/a;Ljava/net/URI;Ljava/net/ProxySelector;Lcom/squareup/okhttp/d;Lax;Lcom/squareup/okhttp/n;)V
        //    67: putfield        com/squareup/okhttp/internal/http/u.e:Lcom/squareup/okhttp/internal/http/ar;
        //    70: aload_1        
        //    71: invokevirtual   com/squareup/okhttp/a.d:()Ljava/util/List;
        //    74: getstatic       com/squareup/okhttp/Protocol.b:Lcom/squareup/okhttp/Protocol;
        //    77: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //    82: ifeq            159
        //    85: aload_0        
        //    86: getfield        com/squareup/okhttp/internal/http/u.a:Lcom/squareup/okhttp/j;
        //    89: aload_1        
        //    90: invokevirtual   com/squareup/okhttp/j.a:(Lcom/squareup/okhttp/a;)Ljava/lang/Object;
        //    93: astore_2       
        //    94: aload_2        
        //    95: monitorenter   
        //    96: aload_0        
        //    97: aload_0        
        //    98: aload_0        
        //    99: getfield        com/squareup/okhttp/internal/http/u.e:Lcom/squareup/okhttp/internal/http/ar;
        //   102: invokespecial   com/squareup/okhttp/internal/http/u.a:(Lcom/squareup/okhttp/internal/http/ar;)Lcom/squareup/okhttp/c;
        //   105: putfield        com/squareup/okhttp/internal/http/u.d:Lcom/squareup/okhttp/c;
        //   108: aload_0        
        //   109: getfield        com/squareup/okhttp/internal/http/u.a:Lcom/squareup/okhttp/j;
        //   112: aload_1        
        //   113: invokevirtual   com/squareup/okhttp/j.b:(Lcom/squareup/okhttp/a;)V
        //   116: aload_2        
        //   117: monitorexit    
        //   118: aload_0        
        //   119: aload_0        
        //   120: getfield        com/squareup/okhttp/internal/http/u.d:Lcom/squareup/okhttp/c;
        //   123: invokevirtual   com/squareup/okhttp/c.b:()Lcom/squareup/okhttp/m;
        //   126: putfield        com/squareup/okhttp/internal/http/u.f:Lcom/squareup/okhttp/m;
        //   129: return         
        //   130: aload_0        
        //   131: getfield        com/squareup/okhttp/internal/http/u.e:Lcom/squareup/okhttp/internal/http/ar;
        //   134: invokevirtual   com/squareup/okhttp/internal/http/ar.a:()Lcom/squareup/okhttp/a;
        //   137: astore_1       
        //   138: goto            70
        //   141: astore_3       
        //   142: aload_0        
        //   143: getfield        com/squareup/okhttp/internal/http/u.a:Lcom/squareup/okhttp/j;
        //   146: aload_1        
        //   147: invokevirtual   com/squareup/okhttp/j.b:(Lcom/squareup/okhttp/a;)V
        //   150: aload_3        
        //   151: athrow         
        //   152: astore          4
        //   154: aload_2        
        //   155: monitorexit    
        //   156: aload           4
        //   158: athrow         
        //   159: aload_0        
        //   160: aload_0        
        //   161: aload_0        
        //   162: getfield        com/squareup/okhttp/internal/http/u.e:Lcom/squareup/okhttp/internal/http/ar;
        //   165: invokespecial   com/squareup/okhttp/internal/http/u.a:(Lcom/squareup/okhttp/internal/http/ar;)Lcom/squareup/okhttp/c;
        //   168: putfield        com/squareup/okhttp/internal/http/u.d:Lcom/squareup/okhttp/c;
        //   171: goto            118
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  96     108    141    152    Any
        //  108    118    152    159    Any
        //  142    152    152    159    Any
        //  154    156    152    159    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0118:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private a t() {
        final String protocol = this.j.a().getProtocol();
        String s = this.j.a().getHost();
        if (s == null || s.length() == 0) {
            throw new UnknownHostException(this.j.a().toString());
        }
        SSLSocketFactory g;
        HostnameVerifier h;
        if (this.j.k()) {
            g = this.a.g();
            h = this.a.h();
        }
        else {
            g = null;
            h = null;
        }
        int n = bf.a(this.j.a());
        if (this.a.m().contains(Protocol.b)) {
            final aa a = this.a.a(new aa(protocol, s, n));
            if (a != null) {
                s = a.a();
                n = a.b();
            }
        }
        return new a(s, n, g, h, this.a.i(), this.a.c(), this.a.m());
    }
    
    private void u() {
        final l f = this.a.f();
        if (f == null) {
            return;
        }
        if (!com.squareup.okhttp.internal.http.a.a(this.n, this.j)) {
            f.b(this.j);
            return;
        }
        this.s = f.a(this.r());
    }
    
    private void v() {
        final ae f = this.j.f();
        if (this.j.h() == null) {
            f.a(p());
        }
        if (this.j.a("Host") == null) {
            f.a("Host", a(this.j.a()));
        }
        if ((this.d == null || this.d.k() != 0) && this.j.a("Connection") == null) {
            f.a("Connection", "Keep-Alive");
        }
        if (this.j.a("Accept-Encoding") == null) {
            this.h = true;
            f.a("Accept-Encoding", "gzip");
        }
        if (this.c() && this.j.a("Content-Type") == null) {
            f.a("Content-Type", "application/x-www-form-urlencoded");
        }
        final CookieHandler e = this.a.e();
        if (e != null) {
            y.a(f, e.get(this.j.b(), y.a(f.a().d(), null)));
        }
        this.j = f.a();
    }
    
    private o w() {
        if (!this.j.k()) {
            return null;
        }
        String s = this.j.h();
        if (s == null) {
            s = p();
        }
        final URL a = this.j.a();
        if (this.a.m().contains(Protocol.b)) {
            final aa a2 = this.a.a(new aa(a.getProtocol(), a.getHost(), bf.a(a)));
            if (a2 != null) {
                return new o(a2.a(), a2.b(), s, this.j.i());
            }
        }
        return new o(a.getHost(), bf.a(a), s, this.j.i());
    }
    
    public u a(final IOException ex) {
        if (this.e != null && this.d != null) {
            this.e.a(this.d, ex);
        }
        boolean b;
        if (this.k == null || this.k instanceof aq) {
            b = true;
        }
        else {
            b = false;
        }
        if ((this.e == null && this.d == null) || (this.e != null && !this.e.b()) || !this.b(ex) || !b) {
            return null;
        }
        return new u(this.a, this.i, this.c, this.n(), this.e, (aq)this.k);
    }
    
    public final void a() {
        if (this.m == null) {
            if (this.g != null) {
                throw new IllegalStateException();
            }
            this.v();
            final l f = this.a.f();
            ah a;
            if (f != null) {
                a = f.a(this.j);
            }
            else {
                a = null;
            }
            final com.squareup.okhttp.internal.http.a a2 = new com.squareup.okhttp.internal.http.c(System.currentTimeMillis(), this.j, a).a();
            this.m = a2.c;
            this.j = a2.a;
            if (f != null) {
                f.a(this.m);
            }
            if (this.m != ResponseSource.c) {
                this.r = a2.b;
            }
            if (a != null && !this.m.b()) {
                bf.a(a.h());
            }
            if (this.m.a()) {
                if (this.d == null) {
                    this.s();
                }
                this.g = (av)this.d.a(this);
                if (this.c() && this.k == null) {
                    this.k = this.g.a(this.j);
                }
            }
            else {
                if (this.d != null) {
                    this.a.j().a(this.d);
                    this.d = null;
                }
                this.n = this.r;
                if (this.r.h() != null) {
                    this.a(this.r.h().b());
                }
            }
        }
    }
    
    public void a(final f f) {
        final CookieHandler e = this.a.e();
        if (e != null) {
            e.put(this.j.b(), y.a(f, null));
        }
    }
    
    public void b() {
        if (this.b != -1L) {
            throw new IllegalStateException();
        }
        this.b = System.currentTimeMillis();
    }
    
    boolean c() {
        return v.a(this.j.c());
    }
    
    public final cc d() {
        if (this.m == null) {
            throw new IllegalStateException();
        }
        return this.k;
    }
    
    public final bi e() {
        final bi l = this.l;
        if (l != null) {
            return l;
        }
        final cc d = this.d();
        if (d != null) {
            return this.l = bt.a(d);
        }
        return null;
    }
    
    public final boolean f() {
        return this.n != null;
    }
    
    public final ab g() {
        return this.j;
    }
    
    public final ah h() {
        if (this.n == null) {
            throw new IllegalStateException();
        }
        return this.n;
    }
    
    public final cd i() {
        if (this.n == null) {
            throw new IllegalStateException();
        }
        return this.p;
    }
    
    public final InputStream j() {
        final InputStream q = this.q;
        if (q != null) {
            return q;
        }
        return this.q = bt.a(this.i()).k();
    }
    
    public final c k() {
        return this.d;
    }
    
    public m l() {
        return this.f;
    }
    
    public final void m() {
        if (this.g != null && this.d != null) {
            this.g.c();
        }
        this.d = null;
    }
    
    public final c n() {
        if (this.l != null) {
            bf.a(this.l);
        }
        else if (this.k != null) {
            bf.a(this.k);
        }
        if (this.p == null) {
            bf.a(this.d);
            return this.d = null;
        }
        bf.a(this.p);
        bf.a(this.q);
        if (this.g != null && !this.g.d()) {
            bf.a(this.d);
            return this.d = null;
        }
        final c d = this.d;
        this.d = null;
        return d;
    }
    
    public final boolean o() {
        if (!this.j.c().equals("HEAD")) {
            final int c = this.n.c();
            if ((c < 100 || c >= 200) && c != 204 && c != 304) {
                return true;
            }
            if (y.a(this.n) != -1L || "chunked".equalsIgnoreCase(this.n.a("Transfer-Encoding"))) {
                return true;
            }
        }
        return false;
    }
    
    public final void q() {
        if (this.n == null) {
            if (this.m == null) {
                throw new IllegalStateException("call sendRequest() first!");
            }
            if (this.m.a()) {
                if (this.l != null && this.l.b().l() > 0L) {
                    this.l.a();
                }
                if (this.b == -1L) {
                    if (y.a(this.j) == -1L && this.k instanceof aq) {
                        this.j = this.j.f().a("Content-Length", Long.toString(((aq)this.k).b())).a();
                    }
                    this.g.b(this.j);
                }
                if (this.k != null) {
                    if (this.l != null) {
                        this.l.close();
                    }
                    else {
                        this.k.close();
                    }
                    if (this.k instanceof aq) {
                        this.g.a((aq)this.k);
                    }
                }
                this.g.a();
                this.n = this.g.b().a(this.j).a(this.d.i()).a(y.b, Long.toString(this.b)).a(y.c, Long.toString(System.currentTimeMillis())).a(this.m).a();
                this.d.a(this.n.e());
                this.a(this.n.g());
                if (this.m == ResponseSource.b) {
                    if (this.r.a(this.n)) {
                        this.g.e();
                        this.m();
                        this.n = a(this.r, this.n);
                        final l f = this.a.f();
                        f.a();
                        f.a(this.r, this.r());
                        if (this.r.h() != null) {
                            this.a(this.r.h().b());
                        }
                        return;
                    }
                    else {
                        bf.a(this.r.h());
                    }
                }
                if (!this.o()) {
                    this.o = this.g.a(this.s);
                    this.p = this.o;
                    return;
                }
                this.u();
                this.a(this.g.a(this.s));
            }
        }
    }
}
