// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import java.io.IOException;
import com.squareup.okhttp.ResponseSource;

public final class a
{
    private static final aj d;
    private static final au e;
    public final ab a;
    public final ah b;
    public final ResponseSource c;
    
    static {
        d = new b();
        try {
            e = new au("HTTP/1.1 504 Gateway Timeout");
        }
        catch (IOException ex) {
            throw new AssertionError();
        }
    }
    
    private a(final ab a, final ah b, final ResponseSource c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static boolean a(final ah ah, final ab ab) {
        final int c = ah.c();
        if (c == 200 || c == 203 || c == 300 || c == 301 || c == 410) {
            final com.squareup.okhttp.b j = ah.j();
            if ((ab.a("Authorization") == null || j.e() || j.f() || j.d() != -1) && !j.b()) {
                return true;
            }
        }
        return false;
    }
}
