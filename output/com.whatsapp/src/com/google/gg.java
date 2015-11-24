// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.Arrays;

public final class gg extends gj
{
    private static final char[] b;
    private static final int c;
    private static final int[] e;
    private static final String z;
    private final StringBuilder d;
    private final int[] f;
    
    static {
        String s = "hhZ*?mo_!2\u0019\u001b+]N\u001e\u001e PA\u0013\u0015%WD\b\b:J_\r\u000f?AR\u0002tF9/wrMxi;=B";
        int n = -1;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n2 = 0; i > n2; ++n2) {
                final char c2 = charArray[n2];
                char c3 = '\0';
                switch (n2 % 5) {
                    default: {
                        c3 = '\u000b';
                        break;
                    }
                    case 0: {
                        c3 = 'X';
                        break;
                    }
                    case 1: {
                        c3 = 'Y';
                        break;
                    }
                    case 2: {
                        c3 = 'h';
                        break;
                    }
                    case 3: {
                        c3 = '\u0019';
                        break;
                    }
                }
                charArray[n2] = (char)(c3 ^ c2);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    z = intern;
                    s = "hhZ*?mo_!2\u0019\u001b+]N\u001e\u001e PA\u0013\u0015%WD\b\b:J_\r\u000f?AR\u0002tF9/wrMxi;=B";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0156;
                }
            }
        }
        b = intern.toCharArray();
        e = new int[] { 276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350 };
        c = gg.e[47];
    }
    
    public gg() {
        this.d = new StringBuilder(20);
        this.f = new int[6];
    }
    
    private static char a(final int n) {
        final boolean a = gj.a;
        int i = 0;
        while (i < gg.e.length) {
            if (gg.e[i] == n) {
                return gg.b[i];
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
        final int length2 = array.length;
        int i = 0;
        int n = 0;
        while (i < length2) {
            n += array[i];
            ++i;
            if (a) {
                break;
            }
        }
        int j = 0;
        int n2 = 0;
        while (j < length) {
            final int round = Math.round(9.0f * array[j] / n);
            if (round < 1 || round > 4) {
                n2 = -1;
                break;
            }
            Label_0128: {
                if ((j & 0x1) == 0x0) {
                    int k = 0;
                    while (k < round) {
                        n2 = (0x1 | n2 << 1);
                        ++k;
                        if (a) {
                            break;
                        }
                    }
                    if (!a) {
                        break Label_0128;
                    }
                }
                n2 <<= round;
            }
            final int n3 = j + 1;
            if (a) {
                break;
            }
            j = n3;
        }
        return n2;
    }
    
    private static void a(final CharSequence charSequence) {
        final int length = charSequence.length();
        a(charSequence, length - 2, 20);
        a(charSequence, length - 1, 15);
    }
    
    private static void a(final CharSequence charSequence, final int n, final int n2) {
        final boolean a = gj.a;
        int i = n - 1;
        int n3 = 0;
        int n4 = 1;
        while (i >= 0) {
            n3 += n4 * gg.z.indexOf(charSequence.charAt(i));
            if (++n4 > n2) {
                n4 = 1;
            }
            --i;
            if (a) {
                break;
            }
        }
        if (charSequence.charAt(n) != gg.b[n3 % 47]) {
            throw fh.a();
        }
    }
    
    private int[] a(final hN hn) {
        final boolean a = gj.a;
        final int b = hn.b();
        final int d = hn.d(0);
        Arrays.fill(this.f, 0);
        final int[] f = this.f;
        final int length = f.length;
        int i = d;
        boolean b2 = false;
        int n = d;
        int n2 = 0;
        while (i < b) {
            Label_0184: {
                if (b2 ^ hn.a(i)) {
                    ++f[n2];
                    if (!a) {
                        break Label_0184;
                    }
                }
                Label_0170: {
                    if (n2 == length - 1) {
                        if (a(f) == gg.c) {
                            return new int[] { n, i };
                        }
                        n += f[0] + f[1];
                        System.arraycopy(f, 2, f, 0, length - 2);
                        f[length - 1] = (f[length - 2] = 0);
                        --n2;
                        if (!a) {
                            break Label_0170;
                        }
                    }
                    ++n2;
                }
                f[n2] = 1;
                b2 = !b2;
            }
            ++i;
            if (a) {
                break;
            }
        }
        throw fv.a();
    }
    
    private static String b(final CharSequence charSequence) {
        final boolean a = gj.a;
        final int length = charSequence.length();
        final StringBuilder sb = new StringBuilder(length);
        int i = 0;
        while (i < length) {
            final char char1 = charSequence.charAt(i);
            int n = 0;
            Label_0135: {
                if (char1 >= 'a' && char1 <= 'd') {
                    if (i >= length - 1) {
                        throw fD.a();
                    }
                    final char char2 = charSequence.charAt(i + 1);
                    char c = '\0';
                    switch (char1) {
                        default: {
                            c = '\0';
                            break;
                        }
                        case 100: {
                            if (char2 >= 'A' && char2 <= 'Z') {
                                c = (char)(char2 + ' ');
                                if (!a) {
                                    break;
                                }
                            }
                            throw fD.a();
                        }
                        case 97: {
                            if (char2 >= 'A' && char2 <= 'Z') {
                                c = (char)(char2 - '@');
                                if (!a) {
                                    break;
                                }
                            }
                            throw fD.a();
                        }
                        case 98: {
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
                        case 99: {
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
                        break Label_0135;
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
    
    @Override
    public aU a(final int n, final hN hn, final Map map) {
        final boolean a = gj.a;
        final int[] a2 = this.a(hn);
        int d = hn.d(a2[1]);
        final int b = hn.b();
        final int[] f = this.f;
        Arrays.fill(f, 0);
        final StringBuilder d2 = this.d;
        d2.setLength(0);
        while (true) {
            gj.b(hn, d, f);
            final int a3 = a(f);
            if (a3 < 0) {
                throw fv.a();
            }
            final char a4 = a(a3);
            d2.append(a4);
            final int length = f.length;
            int i = 0;
            int n2 = d;
            while (i < length) {
                n2 += f[i];
                ++i;
                if (a) {
                    break;
                }
            }
            final int d3 = hn.d(n2);
            if (a4 == '*') {
                d2.deleteCharAt(-1 + d2.length());
                final int length2 = f.length;
                int n3 = 0;
                int j = 0;
                while (j < length2) {
                    n3 += f[j];
                    ++j;
                    if (a) {
                        break;
                    }
                }
                if (d3 == b || !hn.a(d3)) {
                    throw fv.a();
                }
                if (d2.length() < 2) {
                    throw fv.a();
                }
                a(d2);
                d2.setLength(-2 + d2.length());
                return new aU(b(d2), null, new cs[] { new cs((a2[1] + a2[0]) / 2.0f, n), new cs(d + n3 / 2.0f, n) }, com.google.d3.CODE_93);
            }
            else {
                d = d3;
            }
        }
    }
}
