// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.Serializable;

final class br
{
    private static final String[] z;
    private final e0 a;
    private final bk b;
    private final boolean c;
    private final e0 d;
    
    static {
        final String[] z2 = new String[5];
        String s = "UL";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'A';
                        break;
                    }
                    case 0: {
                        c2 = 'u';
                        break;
                    }
                    case 1: {
                        c2 = '\u0011';
                        break;
                    }
                    case 2: {
                        c2 = 'l';
                        break;
                    }
                    case 3: {
                        c2 = 'J';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "U+L";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "U=L";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = ".1";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "\u001bd\u0000&";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    br(final e0 d, final e0 a, final bk b, final boolean c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private static int a(final Object o) {
        if (o == null) {
            return 0;
        }
        return o.hashCode();
    }
    
    private static boolean a(final Object o, final Object o2) {
        if (o == null) {
            return o2 == null;
        }
        return o.equals(o2);
    }
    
    e0 a() {
        return this.a;
    }
    
    public boolean b() {
        return this.a == null;
    }
    
    bk c() {
        return this.b;
    }
    
    e0 d() {
        return this.d;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof br) {
            final br br = (br)o;
            if (a(this.d, br.d) && a(this.a, br.a) && a(this.b, br.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return a(this.d) ^ a(this.a) ^ a(this.b);
    }
    
    @Override
    public String toString() {
        final StringBuilder append = new StringBuilder().append(br.z[3]).append(this.d).append(br.z[2]).append(this.a).append(br.z[1]);
        Serializable value;
        if (this.b == null) {
            value = br.z[4];
        }
        else {
            value = this.b.b();
        }
        return append.append(value).append(br.z[0]).toString();
    }
}
