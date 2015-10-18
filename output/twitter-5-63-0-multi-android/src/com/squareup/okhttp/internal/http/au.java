// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import java.net.ProtocolException;

public final class au
{
    private final String a;
    private final int b;
    private final int c;
    private final String d;
    
    public au(final String a) {
        int n = 9;
        int b;
        if (a.startsWith("HTTP/1.")) {
            if (a.length() < n || a.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + a);
            }
            b = -48 + a.charAt(7);
            if (b < 0 || b > n) {
                throw new ProtocolException("Unexpected status line: " + a);
            }
        }
        else {
            if (!a.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: " + a);
            }
            b = 0;
            n = 4;
        }
        if (a.length() < n + 3) {
            throw new ProtocolException("Unexpected status line: " + a);
        }
        final int n2 = n + 3;
        while (true) {
            Label_0312: {
                int int1;
                try {
                    int1 = Integer.parseInt(a.substring(n, n2));
                    if (a.length() <= n + 3) {
                        break Label_0312;
                    }
                    if (a.charAt(n + 3) != ' ') {
                        throw new ProtocolException("Unexpected status line: " + a);
                    }
                }
                catch (NumberFormatException ex) {
                    throw new ProtocolException("Unexpected status line: " + a);
                }
                final String substring = a.substring(n + 4);
                this.d = substring;
                this.c = int1;
                this.a = a;
                this.b = b;
                return;
            }
            final String substring = "";
            continue;
        }
    }
    
    public String a() {
        return this.a;
    }
    
    public int b() {
        if (this.b != -1) {
            return this.b;
        }
        return 1;
    }
    
    public int c() {
        return this.c;
    }
    
    public String d() {
        return this.d;
    }
}
