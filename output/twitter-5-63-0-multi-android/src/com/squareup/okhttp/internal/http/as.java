// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import java.net.CacheRequest;
import java.util.Locale;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.net.ProtocolException;
import com.squareup.okhttp.internal.spdy.d;
import com.squareup.okhttp.Protocol;
import java.util.List;
import com.squareup.okhttp.internal.spdy.ak;
import com.squareup.okhttp.internal.spdy.y;

public final class as implements av
{
    private final u a;
    private final y b;
    private ak c;
    
    public as(final u a, final y b) {
        this.a = a;
        this.b = b;
    }
    
    public static com.squareup.okhttp.internal.http.ak a(final List list, final Protocol protocol) {
        String s = null;
        String s2 = "HTTP/1.1";
        final h h = new h();
        h.b(com.squareup.okhttp.internal.http.y.e, protocol.name.a());
        String s3;
        for (int i = 0; i < list.size(); ++i, s2 = s3) {
            final bk h2 = list.get(i).h;
            final String a = list.get(i).i.a();
            s3 = s2;
            int n2;
            for (int j = 0; j < a.length(); j = n2) {
                int n = a.indexOf(0, j);
                if (n == -1) {
                    n = a.length();
                }
                String substring = a.substring(j, n);
                if (!h2.equals(d.a)) {
                    if (h2.equals(d.g)) {
                        s3 = substring;
                        substring = s;
                    }
                    else {
                        if (!a(protocol, h2)) {
                            h.a(h2.a(), substring);
                        }
                        substring = s;
                    }
                }
                n2 = n + 1;
                s = substring;
            }
        }
        if (s == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        if (s2 == null) {
            throw new ProtocolException("Expected ':version' header not present");
        }
        return new com.squareup.okhttp.internal.http.ak().a(new au(s2 + " " + s)).a(h.a());
    }
    
    private static String a(final String s, final String s2) {
        return s + '\0' + s2;
    }
    
    public static List a(final ab ab, final Protocol protocol, final String s) {
        final f d = ab.d();
        final ArrayList list = new ArrayList<Object>(10 + d.a());
        list.add(new d(com.squareup.okhttp.internal.spdy.d.b, ab.c()));
        list.add(new d(com.squareup.okhttp.internal.spdy.d.c, ag.a(ab.a())));
        final String a = u.a(ab.a());
        if (Protocol.b == protocol) {
            list.add(new d(com.squareup.okhttp.internal.spdy.d.g, s));
            list.add(new d(com.squareup.okhttp.internal.spdy.d.f, a));
        }
        else {
            if (Protocol.a != protocol) {
                throw new AssertionError();
            }
            list.add(new d(com.squareup.okhttp.internal.spdy.d.e, a));
        }
        list.add(new d(com.squareup.okhttp.internal.spdy.d.d, ab.a().getProtocol()));
        final LinkedHashSet<bk> set = new LinkedHashSet<bk>();
        for (int i = 0; i < d.a(); ++i) {
            final bk a2 = bk.a(d.a(i).toLowerCase(Locale.US));
            final String b = d.b(i);
            if (!a(protocol, a2) && !a2.equals(com.squareup.okhttp.internal.spdy.d.b) && !a2.equals(com.squareup.okhttp.internal.spdy.d.c) && !a2.equals(com.squareup.okhttp.internal.spdy.d.d) && !a2.equals(com.squareup.okhttp.internal.spdy.d.e) && !a2.equals(com.squareup.okhttp.internal.spdy.d.f) && !a2.equals(com.squareup.okhttp.internal.spdy.d.g)) {
                if (set.add(a2)) {
                    list.add(new d(a2, b));
                }
                else {
                    for (int j = 0; j < list.size(); ++j) {
                        if (((d)list.get(j)).h.equals(a2)) {
                            list.set(j, new d(a2, a(((d)list.get(j)).i.a(), b)));
                            break;
                        }
                    }
                }
            }
        }
        return list;
    }
    
    private static boolean a(final Protocol protocol, final bk bk) {
        boolean b2;
        if (protocol == Protocol.b) {
            if (!bk.b("connection") && !bk.b("host") && !bk.b("keep-alive") && !bk.b("proxy-connection")) {
                final boolean b = bk.b("transfer-encoding");
                b2 = false;
                if (!b) {
                    return b2;
                }
            }
            b2 = true;
        }
        else {
            if (protocol == Protocol.a) {
                if (!bk.b("connection") && !bk.b("host") && !bk.b("keep-alive") && !bk.b("proxy-connection") && !bk.b("te") && !bk.b("transfer-encoding") && !bk.b("encoding")) {
                    final boolean b3 = bk.b("upgrade");
                    b2 = false;
                    if (!b3) {
                        return b2;
                    }
                }
                return true;
            }
            throw new AssertionError(protocol);
        }
        return b2;
    }
    
    @Override
    public cc a(final ab ab) {
        this.b(ab);
        return this.c.f();
    }
    
    @Override
    public cd a(final CacheRequest cacheRequest) {
        return new at(this.c, cacheRequest);
    }
    
    @Override
    public void a() {
        this.c.f().close();
    }
    
    @Override
    public void a(final aq aq) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public com.squareup.okhttp.internal.http.ak b() {
        return a(this.c.c(), this.b.a());
    }
    
    @Override
    public void b(final ab ab) {
        if (this.c != null) {
            return;
        }
        this.a.b();
        (this.c = this.b.a(a(ab, this.b.a(), ag.a(this.a.k().k())), this.a.c(), true)).a(this.a.a.b());
    }
    
    @Override
    public void c() {
    }
    
    @Override
    public boolean d() {
        return true;
    }
    
    @Override
    public void e() {
    }
}
