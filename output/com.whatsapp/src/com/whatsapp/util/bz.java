// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.io.File;
import java.util.Arrays;
import java.io.IOException;

final class bz
{
    private static final String[] z;
    private final long[] a;
    private bj b;
    private final String c;
    private boolean d;
    final n e;
    private long f;
    
    static {
        final String[] z2 = new String[2];
        String s = ">yD~";
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
                        c2 = '[';
                        break;
                    }
                    case 0: {
                        c2 = '\u0010';
                        break;
                    }
                    case 1: {
                        c2 = '\r';
                        break;
                    }
                    case 2: {
                        c2 = ')';
                        break;
                    }
                    case 3: {
                        c2 = '\u000e';
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
                    s = "ecLv+un]k?0gF{)~lE.7ycL4{";
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
    
    private bz(final n e, final String c) {
        this.e = e;
        this.c = c;
        this.a = new long[n.f(e)];
    }
    
    bz(final n n, final String s, final y y) {
        this(n, s);
    }
    
    static long a(final bz bz, final long f) {
        return bz.f = f;
    }
    
    static bj a(final bz bz) {
        return bz.b;
    }
    
    static bj a(final bz bz, final bj b) {
        return bz.b = b;
    }
    
    private IOException a(final String[] array) {
        throw new IOException(bz.z[1] + Arrays.toString(array));
    }
    
    static void a(final bz bz, final String[] array) {
        bz.b(array);
    }
    
    static boolean a(final bz bz, final boolean d) {
        return bz.d = d;
    }
    
    private void b(final String[] array) {
        final boolean l = Log.l;
        try {
            if (array.length != n.f(this.e)) {
                throw this.a(array);
            }
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
        int i = 0;
        try {
            while (i < array.length) {
                this.a[i] = Long.parseLong(array[i]);
                ++i;
                if (l) {
                    break;
                }
            }
        }
        catch (NumberFormatException ex2) {
            throw this.a(array);
        }
    }
    
    static long[] b(final bz bz) {
        return bz.a;
    }
    
    static boolean c(final bz bz) {
        return bz.d;
    }
    
    static long d(final bz bz) {
        return bz.f;
    }
    
    static String e(final bz bz) {
        return bz.c;
    }
    
    public File a(final int n) {
        return new File(n.e(this.e), this.c + "." + n + bz.z[0]);
    }
    
    public String a() {
        final boolean l = Log.l;
        final StringBuilder sb = new StringBuilder();
        final long[] a = this.a;
        final int length = a.length;
        int i = 0;
        while (i < length) {
            sb.append(' ').append(a[i]);
            ++i;
            if (l) {
                break;
            }
        }
        return sb.toString();
    }
    
    public File b(final int n) {
        return new File(n.e(this.e), this.c + "." + n);
    }
}
