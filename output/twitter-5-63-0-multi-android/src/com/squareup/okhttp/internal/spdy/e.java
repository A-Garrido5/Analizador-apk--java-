// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.spdy;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

final class e
{
    private static final d[] a;
    private static final Map b;
    
    static {
        a = new d[] { new d(d.e, ""), new d(d.b, "GET"), new d(d.b, "POST"), new d(d.c, "/"), new d(d.c, "/index.html"), new d(d.d, "http"), new d(d.d, "https"), new d(d.a, "200"), new d(d.a, "500"), new d(d.a, "404"), new d(d.a, "403"), new d(d.a, "400"), new d(d.a, "401"), new d("accept-charset", ""), new d("accept-encoding", ""), new d("accept-language", ""), new d("accept-ranges", ""), new d("accept", ""), new d("access-control-allow-origin", ""), new d("age", ""), new d("allow", ""), new d("authorization", ""), new d("cache-control", ""), new d("content-disposition", ""), new d("content-encoding", ""), new d("content-language", ""), new d("content-length", ""), new d("content-location", ""), new d("content-range", ""), new d("content-type", ""), new d("cookie", ""), new d("date", ""), new d("etag", ""), new d("expect", ""), new d("expires", ""), new d("from", ""), new d("host", ""), new d("if-match", ""), new d("if-modified-since", ""), new d("if-none-match", ""), new d("if-range", ""), new d("if-unmodified-since", ""), new d("last-modified", ""), new d("link", ""), new d("location", ""), new d("max-forwards", ""), new d("proxy-authenticate", ""), new d("proxy-authorization", ""), new d("range", ""), new d("referer", ""), new d("refresh", ""), new d("retry-after", ""), new d("server", ""), new d("set-cookie", ""), new d("strict-transport-security", ""), new d("transfer-encoding", ""), new d("user-agent", ""), new d("vary", ""), new d("via", ""), new d("www-authenticate", "") };
        b = c();
    }
    
    private static Map c() {
        final LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(e.a.length);
        for (int i = 0; i < e.a.length; ++i) {
            if (!linkedHashMap.containsKey(e.a[i].h)) {
                linkedHashMap.put(e.a[i].h, i);
            }
        }
        return Collections.unmodifiableMap((Map<?, ?>)linkedHashMap);
    }
}
