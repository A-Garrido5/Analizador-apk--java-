// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.h;
import java.util.ArrayList;
import java.util.List;
import java.net.Proxy;
import com.squareup.okhttp.g;

public final class i
{
    public static final g a;
    
    static {
        a = new j();
    }
    
    public static ab a(final g g, final ah ah, final Proxy proxy) {
        String s;
        String s2;
        if (ah.c() == 401) {
            s = "WWW-Authenticate";
            s2 = "Authorization";
        }
        else {
            if (ah.c() != 407) {
                throw new IllegalArgumentException();
            }
            s = "Proxy-Authenticate";
            s2 = "Proxy-Authorization";
        }
        final List a = a(ah.g(), s);
        if (a.isEmpty()) {
            return null;
        }
        final ab a2 = ah.a();
        com.squareup.okhttp.i i;
        if (ah.c() == 407) {
            i = g.b(proxy, a2.a(), a);
        }
        else {
            i = g.a(proxy, a2.a(), a);
        }
        if (i == null) {
            return null;
        }
        return a2.f().a(s2, i.a()).a();
    }
    
    private static List a(final f f, final String s) {
        final ArrayList<h> list = new ArrayList<h>();
        for (int i = 0; i < f.a(); ++i) {
            if (s.equalsIgnoreCase(f.a(i))) {
                final String b = f.b(i);
                int j = 0;
                while (j < b.length()) {
                    final int a = e.a(b, j, " ");
                    final String trim = b.substring(j, a).trim();
                    final int a2 = e.a(b, a);
                    if (!b.regionMatches(true, a2, "realm=\"", 0, "realm=\"".length())) {
                        break;
                    }
                    final int n = a2 + "realm=\"".length();
                    final int a3 = e.a(b, n, "\"");
                    final String substring = b.substring(n, a3);
                    j = e.a(b, 1 + e.a(b, a3 + 1, ","));
                    list.add(new h(trim, substring));
                }
            }
        }
        return list;
    }
}
