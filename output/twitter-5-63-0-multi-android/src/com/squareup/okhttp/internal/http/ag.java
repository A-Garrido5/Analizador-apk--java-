// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import java.net.URL;
import java.net.Proxy;

public final class ag
{
    public static String a(final int n) {
        if (n == 1) {
            return "HTTP/1.1";
        }
        return "HTTP/1.0";
    }
    
    static String a(final ab ab, final Proxy.Type type, final int n) {
        final StringBuilder sb = new StringBuilder();
        sb.append(ab.c());
        sb.append(" ");
        if (a(ab, type)) {
            sb.append(ab.a());
        }
        else {
            sb.append(a(ab.a()));
        }
        sb.append(" ");
        sb.append(a(n));
        return sb.toString();
    }
    
    public static String a(final URL url) {
        String file = url.getFile();
        if (file == null) {
            file = "/";
        }
        else if (!file.startsWith("/")) {
            return "/" + file;
        }
        return file;
    }
    
    private static boolean a(final ab ab, final Proxy.Type type) {
        return !ab.k() && type == Proxy.Type.HTTP;
    }
}
