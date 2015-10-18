// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

public final class gV extends gj
{
    static final int[] d;
    private static final char[] g;
    private static final int h;
    private static final String z;
    private final boolean b;
    private final boolean c;
    private final int[] e;
    private final StringBuilder f;
    
    static {
        String s = "8#hO!=$mD,IP\u00198PNU\u00125_C^\u00172ZXC\b/A]D\r$LR?t\\?,=qY";
        int n = -1;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n2 = 0; i > n2; ++n2) {
                final char c = charArray[n2];
                char c2 = '\0';
                switch (n2 % 5) {
                    default: {
                        c2 = '\u0015';
                        break;
                    }
                    case 0: {
                        c2 = '\b';
                        break;
                    }
                    case 1: {
                        c2 = '\u0012';
                        break;
                    }
                    case 2: {
                        c2 = 'Z';
                        break;
                    }
                    case 3: {
                        c2 = '|';
                        break;
                    }
                }
                charArray[n2] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    z = intern;
                    s = "8#hO!=$mD,IP\u00198PNU\u00125_C^\u00172ZXC\b/A]D\r$LR?t\\?,=qY";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0156;
                }
            }
        }
        g = intern.toCharArray();
        d = new int[] { 52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 148, 168, 162, 138, 42 };
        h = gV.d[39];
    }
    
    public gV() {
        this(false);
    }
    
    public gV(final boolean b) {
        this(b, false);
    }
    
    public gV(final boolean b, final boolean c) {
        this.b = b;
        this.c = c;
        this.f = new StringBuilder(20);
        this.e = new int[9];
    }
    
    private static char a(final int n) {
        final boolean a = gj.a;
        int i = 0;
        while (i < gV.d.length) {
            if (gV.d[i] == n) {
                return gV.g[i];
            }
            ++i;
            if (a) {
                break;
            }
        }
        throw fv.a();
    }
    
    private static int a(final int[] array) {
        final boolean a = gj.a;
        final int length = array.length;
        int n = 0;
        while (true) {
            int n2 = Integer.MAX_VALUE;
            int n4;
            for (int length2 = array.length, i = 0; i < length2; i = n4) {
                final int n3 = array[i];
                if (n3 < n2 && n3 > n) {
                    n2 = n3;
                }
                n4 = i + 1;
                if (a) {
                    break;
                }
            }
            n = n2;
            int j = 0;
            int n5 = 0;
            int n6 = 0;
            int n7 = 0;
            while (j < length) {
                final int n8 = array[j];
                if (n8 > n) {
                    n5 |= 1 << length - 1 - j;
                    ++n7;
                    n6 += n8;
                }
                ++j;
                if (a) {
                    break;
                }
            }
            final int n9 = n6;
            final int n10 = n7;
            if (n10 == 3) {
                int n11 = n10;
                int n12 = 0;
                while (n12 < length && n11 > 0) {
                    final int n13 = array[n12];
                    if (n13 > n) {
                        --n11;
                        if (n13 * 2 >= n9) {
                            return -1;
                        }
                    }
                    ++n12;
                    if (a) {
                        break;
                    }
                }
                return n5;
            }
            if (n10 <= 3) {
                return -1;
            }
        }
    }
    
    private static String a(final CharSequence charSequence) {
        final boolean a = gj.a;
        final int length = charSequence.length();
        final StringBuilder sb = new StringBuilder(length);
        int i = 0;
        while (i < length) {
            final char char1 = charSequence.charAt(i);
            int n = 0;
            Label_0151: {
                if (char1 == '+' || char1 == '$' || char1 == '%' || char1 == '/') {
                    final char char2 = charSequence.charAt(i + 1);
                    char c = '\0';
                    switch (char1) {
                        default: {
                            c = '\0';
                            break;
                        }
                        case 43: {
                            if (char2 >= 'A' && char2 <= 'Z') {
                                c = (char)(char2 + ' ');
                                if (!a) {
                                    break;
                                }
                            }
                            throw fD.a();
                        }
                        case 36: {
                            if (char2 >= 'A' && char2 <= 'Z') {
                                c = (char)(char2 - '@');
                                if (!a) {
                                    break;
                                }
                            }
                            throw fD.a();
                        }
                        case 37: {
                            if (char2 >= 'A' && char2 <= 'E') {
                                c = (char)(char2 - '&');
                                if (!a) {
                                    break;
                                }
                            }
                            if (char2 >= 'F' && char2 <= 'W') {
                                c = (char)(char2 - '\u000b');
                                if (!a) {
                                    break;
                                }
                            }
                            throw fD.a();
                        }
                        case 47: {
                            if (char2 >= 'A' && char2 <= 'O') {
                                c = (char)(char2 - ' ');
                                if (!a) {
                                    break;
                                }
                            }
                            if (char2 == 'Z') {
                                c = ':';
                                if (!a) {
                                    break;
                                }
                            }
                            throw fD.a();
                        }
                    }
                    sb.append(c);
                    n = i + 1;
                    if (!a) {
                        break Label_0151;
                    }
                }
                else {
                    n = i;
                }
                sb.append(char1);
            }
            i = n + 1;
            if (a) {
                break;
            }
        }
        return sb.toString();
    }
    
    private static int[] a(final hN hn, final int[] array) {
        final boolean a = gj.a;
        final int b = hn.b();
        int d = hn.d(0);
        final int length = array.length;
        int i = d;
        boolean b2 = false;
        int n = 0;
        while (i < b) {
            Label_0179: {
                if (b2 ^ hn.a(i)) {
                    ++array[n];
                    if (!a) {
                        break Label_0179;
                    }
                }
                Label_0166: {
                    if (n == length - 1) {
                        if (a(array) == gV.h && hn.a(Math.max(0, d - (i - d) / 2), d, false)) {
                            return new int[] { d, i };
                        }
                        d += array[0] + array[1];
                        System.arraycopy(array, 2, array, 0, length - 2);
                        array[length - 1] = (array[length - 2] = 0);
                        --n;
                        if (!a) {
                            break Label_0166;
                        }
                    }
                    ++n;
                }
                array[n] = 1;
                b2 = !b2;
            }
            ++i;
            if (a) {
                break;
            }
        }
        throw fv.a();
    }
    
    @Override
    public aU a(final int n, final hN hn, final Map map) {
        final boolean a = gj.a;
        final int[] e = this.e;
        Arrays.fill(e, 0);
        final StringBuilder f = this.f;
        f.setLength(0);
        final int[] a2 = a(hn, e);
        int d = hn.d(a2[1]);
        final int b = hn.b();
        while (true) {
            gj.b(hn, d, e);
            final int a3 = a(e);
            if (a3 < 0) {
                throw fv.a();
            }
            final char a4 = a(a3);
            f.append(a4);
            final int length = e.length;
            int i = 0;
            int n2 = d;
            while (i < length) {
                n2 += e[i];
                ++i;
                if (a) {
                    break;
                }
            }
            final int d2 = hn.d(n2);
            if (a4 == '*') {
                f.setLength(-1 + f.length());
                final int length2 = e.length;
                int n3 = 0;
                int j = 0;
                while (j < length2) {
                    n3 += e[j];
                    ++j;
                    if (a) {
                        break;
                    }
                }
                final int n4 = n3;
                final int n5 = d2 - d - n4;
                if (d2 != b && n5 * 2 < n4) {
                    throw fv.a();
                }
                if (this.b) {
                    final int length3 = -1 + f.length();
                    int n6 = 0;
                    int k = 0;
                    while (k < length3) {
                        n6 += gV.z.indexOf(this.f.charAt(k));
                        ++k;
                        if (a) {
                            break;
                        }
                    }
                    if (f.charAt(length3) != gV.g[n6 % 43]) {
                        throw fh.a();
                    }
                    f.setLength(length3);
                }
                if (f.length() == 0) {
                    throw fv.a();
                }
                String s;
                if (this.c) {
                    s = a(f);
                }
                else {
                    s = f.toString();
                }
                return new aU(s, null, new cs[] { new cs((a2[1] + a2[0]) / 2.0f, n), new cs(d + n4 / 2.0f, n) }, d3.CODE_39);
            }
            else {
                d = d2;
            }
        }
    }
}
