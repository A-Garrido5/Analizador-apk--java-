// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import java.net.URLConnection;
import java.net.CacheRequest;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.util.Collections;
import java.net.SecureCacheResponse;
import com.squareup.okhttp.ResponseSource;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.net.CacheResponse;
import java.io.InputStream;
import java.net.ResponseCache;
import com.squareup.okhttp.l;

public class am implements l
{
    private final ResponseCache a;
    
    public am(final ResponseCache a) {
        this.a = a;
    }
    
    private static aj a(final f f, final InputStream inputStream) {
        return new an(f, inputStream);
    }
    
    private static f a(final CacheResponse cacheResponse) {
        final Map<String, List<String>> headers = cacheResponse.getHeaders();
        final h h = new h();
        for (final Map.Entry<String, List<String>> entry : headers.entrySet()) {
            final String s = entry.getKey();
            if (s != null) {
                final Iterator<String> iterator2 = entry.getValue().iterator();
                while (iterator2.hasNext()) {
                    h.a(s, iterator2.next());
                }
            }
        }
        return h.a();
    }
    
    private static String b(final CacheResponse cacheResponse) {
        final List<String> list = cacheResponse.getHeaders().get(null);
        if (list == null || list.size() == 0) {
            return null;
        }
        return list.get(0);
    }
    
    private static HttpURLConnection b(final ah ah) {
        if (ah.a().k()) {
            return new ap(new ao(ah));
        }
        return new ao(ah);
    }
    
    private CacheResponse c(final ab ab) {
        return this.a.get(ab.b(), ab.c(), d(ab));
    }
    
    private static Map d(final ab ab) {
        return y.a(ab.d(), null);
    }
    
    private static RuntimeException f() {
        throw new UnsupportedOperationException("ResponseCache cannot modify the request.");
    }
    
    private static RuntimeException g() {
        throw new UnsupportedOperationException("ResponseCache cannot access request headers");
    }
    
    private static RuntimeException h() {
        throw new UnsupportedOperationException("ResponseCache cannot access SSL internals");
    }
    
    private static RuntimeException i() {
        throw new UnsupportedOperationException("ResponseCache cannot access the response body.");
    }
    
    @Override
    public ah a(final ab ab) {
        final CacheResponse c = this.c(ab);
        if (c == null) {
            return null;
        }
        final ak ak = new ak();
        ak.a(ab);
        ak.a(b(c));
        final f a = a(c);
        ak.a(a);
        ak.a(ResponseSource.a);
        ak.a(a(a, c.getBody()));
        Label_0128: {
            if (!(c instanceof SecureCacheResponse)) {
                break Label_0128;
            }
            final SecureCacheResponse secureCacheResponse = (SecureCacheResponse)c;
            while (true) {
                try {
                    final Object o = secureCacheResponse.getServerCertificateChain();
                    Object o2 = secureCacheResponse.getLocalCertificateChain();
                    if (o2 == null) {
                        o2 = Collections.emptyList();
                    }
                    ak.a(com.squareup.okhttp.f.a(secureCacheResponse.getCipherSuite(), (List)o, (List)o2));
                    return ak.a();
                }
                catch (SSLPeerUnverifiedException ex) {
                    final Object o = Collections.emptyList();
                    continue;
                }
                break;
            }
        }
    }
    
    @Override
    public CacheRequest a(final ah ah) {
        return this.a.put(ah.a().b(), b(ah));
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public void a(final ResponseSource responseSource) {
    }
    
    @Override
    public void a(final ah ah, final ah ah2) {
    }
    
    @Override
    public boolean b(final ab ab) {
        return false;
    }
}
