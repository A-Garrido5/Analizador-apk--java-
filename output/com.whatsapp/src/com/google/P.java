// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Formatter;

class P
{
    private static final String[] z;
    private final N[] a;
    private final g3 b;
    
    static {
        final String[] z2 = new String[2];
        String s = "at1\u001cmdguZmdgpH";
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
                        c2 = 'M';
                        break;
                    }
                    case 0: {
                        c2 = 'D';
                        break;
                    }
                    case 1: {
                        c2 = 'G';
                        break;
                    }
                    case 2: {
                        c2 = 'U';
                        break;
                    }
                    case 3: {
                        c2 = '&';
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
                    s = "at1\u001cmat1Zhw#pH";
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
    
    P(final g3 g3) {
        this.b = new g3(g3);
        this.a = new N[1 + (g3.g() - g3.b())];
    }
    
    final N a(final int n) {
        return this.a[this.c(n)];
    }
    
    final void a(final int n, final N n2) {
        this.a[this.c(n)] = n2;
    }
    
    final N[] a() {
        return this.a;
    }
    
    final N b(final int n) {
        final boolean b = fG.b;
        N a = this.a(n);
        if (a == null) {
            int n4;
            for (int i = 1; i < 5; i = n4) {
                final int n2 = this.c(n) - i;
                if (n2 >= 0) {
                    a = this.a[n2];
                    if (a != null) {
                        return a;
                    }
                }
                final int n3 = i + this.c(n);
                if (n3 < this.a.length) {
                    a = this.a[n3];
                    if (a != null) {
                        return a;
                    }
                }
                n4 = i + 1;
                if (b) {
                    break;
                }
            }
            return null;
        }
        return a;
    }
    
    final g3 b() {
        return this.b;
    }
    
    final int c(final int n) {
        return n - this.b.b();
    }
    
    @Override
    public String toString() {
        final boolean b = fG.b;
        final Formatter formatter = new Formatter();
        final N[] a = this.a;
        final int length = a.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final N n2 = a[i];
            int n3 = 0;
            Label_0151: {
                if (n2 == null) {
                    final String s = P.z[0];
                    final Object[] array = { null };
                    n3 = n + 1;
                    array[0] = n;
                    formatter.format(s, array);
                    if (!b) {
                        break Label_0151;
                    }
                }
                else {
                    n3 = n;
                }
                final String s2 = P.z[1];
                final Object[] array2 = new Object[3];
                final int n4 = n3 + 1;
                array2[0] = n3;
                array2[1] = n2.h();
                array2[2] = n2.c();
                formatter.format(s2, array2);
                n3 = n4;
            }
            final int n5 = i + 1;
            if (b) {
                break;
            }
            i = n5;
            n = n3;
        }
        final String string = formatter.toString();
        formatter.close();
        return string;
    }
}
