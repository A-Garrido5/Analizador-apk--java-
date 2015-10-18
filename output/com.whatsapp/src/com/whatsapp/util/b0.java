// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.os.SystemClock;

public class b0
{
    private static final String[] z;
    private boolean a;
    private long b;
    private String c;
    private final boolean d;
    
    static {
        final String[] z2 = new String[2];
        String s = "i&\b]m4}\u0012Dg6hA";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\b';
                        break;
                    }
                    case 0: {
                        c2 = 'F';
                        break;
                    }
                    case 1: {
                        c2 = 'R';
                        break;
                    }
                    case 2: {
                        c2 = 'a';
                        break;
                    }
                    case 3: {
                        c2 = '0';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "2;\fUzi!\u0015_x|r";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public b0() {
        this(false);
    }
    
    public b0(final String s) {
        this(false);
        this.b(s);
    }
    
    public b0(final boolean d) {
        this.a = false;
        this.c = null;
        this.b = 0L;
        this.d = d;
    }
    
    private long b() {
        if (this.d) {
            return SystemClock.elapsedRealtime();
        }
        return SystemClock.uptimeMillis();
    }
    
    public long a(final String s) {
        final long c = this.c();
        this.b(s);
        return c;
    }
    
    public void a() {
        if (!this.a || this.c != null) {}
        this.b = this.b();
    }
    
    public void b(final String c) {
        this.c = c;
        this.a = true;
        this.a();
    }
    
    public long c() {
        if (this.b == 0L) {
            return 0L;
        }
        final long n = this.b() - this.b;
        Label_0098: {
            if (this.a) {
                if (this.c != null) {
                    Log.i(this.c + b0.z[0] + n);
                    if (!Log.l) {
                        break Label_0098;
                    }
                }
                Log.i(b0.z[1] + n);
            }
        }
        this.b = 0L;
        this.a = false;
        this.c = null;
        return n;
    }
}
