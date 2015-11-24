// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.http.e;
import com.squareup.okhttp.internal.http.f;

public final class b
{
    private final boolean a;
    private final boolean b;
    private final int c;
    private final int d;
    private final boolean e;
    private final boolean f;
    private final int g;
    private final int h;
    private final boolean i;
    
    private b(final boolean a, final boolean b, final int c, final int d, final boolean e, final boolean f, final int g, final int h, final boolean i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public static b a(final f f) {
        boolean b = false;
        boolean b2 = false;
        int a = -1;
        int a2 = -1;
        boolean b3 = false;
        boolean b4 = false;
        int a3 = -1;
        int a4 = -1;
        boolean b5 = false;
        for (int i = 0; i < f.a(); ++i) {
            if (f.a(i).equalsIgnoreCase("Cache-Control") || f.a(i).equalsIgnoreCase("Pragma")) {
                final String b6 = f.b(i);
                boolean b7 = b;
                int j = 0;
                while (j < b6.length()) {
                    final int a5 = e.a(b6, j, "=,;");
                    final String trim = b6.substring(j, a5).trim();
                    String s;
                    if (a5 == b6.length() || b6.charAt(a5) == ',' || b6.charAt(a5) == ';') {
                        j = a5 + 1;
                        s = null;
                    }
                    else {
                        final int a6 = e.a(b6, a5 + 1);
                        if (a6 < b6.length() && b6.charAt(a6) == '\"') {
                            final int n = a6 + 1;
                            final int a7 = e.a(b6, n, "\"");
                            final String substring = b6.substring(n, a7);
                            j = a7 + 1;
                            s = substring;
                        }
                        else {
                            final int a8 = e.a(b6, a6, ",;");
                            final String trim2 = b6.substring(a6, a8).trim();
                            j = a8;
                            s = trim2;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(trim)) {
                        b7 = true;
                    }
                    else if ("no-store".equalsIgnoreCase(trim)) {
                        b2 = true;
                    }
                    else if ("max-age".equalsIgnoreCase(trim)) {
                        a = e.a(s);
                    }
                    else if ("s-maxage".equalsIgnoreCase(trim)) {
                        a2 = e.a(s);
                    }
                    else if ("public".equalsIgnoreCase(trim)) {
                        b3 = true;
                    }
                    else if ("must-revalidate".equalsIgnoreCase(trim)) {
                        b4 = true;
                    }
                    else if ("max-stale".equalsIgnoreCase(trim)) {
                        a3 = e.a(s);
                    }
                    else if ("min-fresh".equalsIgnoreCase(trim)) {
                        a4 = e.a(s);
                    }
                    else {
                        if (!"only-if-cached".equalsIgnoreCase(trim)) {
                            continue;
                        }
                        b5 = true;
                    }
                }
                b = b7;
            }
        }
        return new b(b, b2, a, a2, b3, b4, a3, a4, b5);
    }
    
    public boolean a() {
        return this.a;
    }
    
    public boolean b() {
        return this.b;
    }
    
    public int c() {
        return this.c;
    }
    
    public int d() {
        return this.d;
    }
    
    public boolean e() {
        return this.e;
    }
    
    public boolean f() {
        return this.f;
    }
    
    public int g() {
        return this.g;
    }
    
    public int h() {
        return this.h;
    }
    
    public boolean i() {
        return this.i;
    }
}
