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

public final class gu extends gj
{
    private static final char[] c;
    static final int[] e;
    static final char[] g;
    private int[] b;
    private final StringBuilder d;
    private int f;
    
    static {
        final char[] charArray = "-D\u0004uW(C\u0001~Z0Q\fiM64t\u0005'".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c2 = charArray[n];
            char c3 = '\0';
            switch (n % 5) {
                default: {
                    c3 = 'c';
                    break;
                }
                case 0: {
                    c3 = '\u001d';
                    break;
                }
                case 1: {
                    c3 = 'u';
                    break;
                }
                case 2: {
                    c3 = '6';
                    break;
                }
                case 3: {
                    c3 = 'F';
                    break;
                }
            }
            charArray[n] = (char)(c3 ^ c2);
        }
        g = new String(charArray).intern().toCharArray();
        e = new int[] { 3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14 };
        c = new char[] { 'A', 'B', 'C', 'D' };
    }
    
    public gu() {
        this.d = new StringBuilder(20);
        this.b = new int[80];
        this.f = 0;
    }
    
    private int a() {
        final boolean a = gj.a;
        int i = 1;
        while (i < this.f) {
            final int a2 = this.a(i);
            if (a2 != -1 && a(gu.c, gu.g[a2])) {
                int n = 0;
                int j = i;
                while (j < i + 7) {
                    n += this.b[j];
                    ++j;
                    if (a) {
                        break;
                    }
                }
                if (i == 1 || this.b[i - 1] >= n / 2) {
                    return i;
                }
            }
            i += 2;
            if (a) {
                break;
            }
        }
        throw fv.a();
    }
    
    private int a(final int n) {
        final boolean a = gj.a;
        final int n2 = n + 7;
        if (n2 < this.f) {
            final int[] b = this.b;
            int i = n;
            int n3 = Integer.MAX_VALUE;
            int n4 = 0;
            while (i < n2) {
                final int n5 = b[i];
                if (n5 < n3) {
                    n3 = n5;
                }
                if (n5 > n4) {
                    n4 = n5;
                }
                final int n6 = i + 2;
                if (a) {
                    break;
                }
                i = n6;
            }
            final int n7 = (n3 + n4) / 2;
            int j = n + 1;
            int n8 = 0;
            int n9 = Integer.MAX_VALUE;
            while (j < n2) {
                final int n10 = b[j];
                if (n10 < n9) {
                    n9 = n10;
                }
                if (n10 > n8) {
                    n8 = n10;
                }
                final int n11 = j + 2;
                if (a) {
                    break;
                }
                j = n11;
            }
            final int n12 = (n9 + n8) / 2;
            int k = 0;
            int n13 = 0;
            int n14 = 128;
            while (true) {
                while (k < 7) {
                    int n15;
                    if ((k & 0x1) == 0x0) {
                        n15 = n7;
                    }
                    else {
                        n15 = n12;
                    }
                    n14 >>= 1;
                    int n16;
                    if (b[n + k] > n15) {
                        n16 = (n13 | n14);
                    }
                    else {
                        n16 = n13;
                    }
                    final int n17 = k + 1;
                    if (a) {
                        int l = 0;
                        while (l < gu.e.length) {
                            if (gu.e[l] == n16) {
                                return l;
                            }
                            ++l;
                            if (a) {
                                break;
                            }
                        }
                        return -1;
                    }
                    k = n17;
                    n13 = n16;
                }
                int n16 = n13;
                continue;
            }
        }
        return -1;
    }
    
    private void a(final hN hn) {
        final boolean a = gj.a;
        this.f = 0;
        final int b = hn.b(0);
        final int b2 = hn.b();
        if (b >= b2) {
            throw fv.a();
        }
        boolean b3 = true;
        int i = b;
        int n = 0;
        while (i < b2) {
            Label_0087: {
                if (b3 ^ hn.a(i)) {
                    ++n;
                    if (!a) {
                        break Label_0087;
                    }
                }
                this.b(n);
                b3 = !b3;
                n = 1;
            }
            ++i;
            if (a) {
                break;
            }
        }
        this.b(n);
    }
    
    static boolean a(final char[] array, final char c) {
        final boolean a = gj.a;
        boolean b = false;
        if (array != null) {
            final int length = array.length;
            int n = 0;
            do {
                b = false;
                if (n >= length) {
                    return b;
                }
                if (array[n] == c) {
                    b = true;
                    return b;
                }
                ++n;
            } while (!a);
            return false;
        }
        return b;
    }
    
    private void b(final int n) {
        this.b[this.f] = n;
        ++this.f;
        if (this.f >= this.b.length) {
            final int[] b = new int[2 * this.f];
            System.arraycopy(this.b, 0, b, 0, this.f);
            this.b = b;
        }
    }
    
    @Override
    public aU a(final int n, final hN hn, final Map map) {
        final boolean a = gj.a;
        Arrays.fill(this.b, 0);
        this.a(hn);
        final int a2 = this.a();
        this.d.setLength(0);
        int n2 = a2;
        int a3;
        do {
            a3 = this.a(n2);
            if (a3 == -1) {
                throw fv.a();
            }
            this.d.append((char)a3);
            n2 += 8;
        } while ((this.d.length() <= 1 || !a(gu.c, gu.g[a3]) || a) && n2 < this.f);
        final int n3 = this.b[n2 - 1];
        int i = -8;
        int n4 = 0;
        while (i < -1) {
            n4 += this.b[n2 + i];
            ++i;
            if (a) {
                break;
            }
        }
        if (n2 < this.f && n3 < n4 / 2) {
            throw fv.a();
        }
        this.c(a2);
        int j = 0;
        while (j < this.d.length()) {
            this.d.setCharAt(j, gu.g[this.d.charAt(j)]);
            ++j;
            if (a) {
                break;
            }
        }
        if (!a(gu.c, this.d.charAt(0))) {
            throw fv.a();
        }
        if (!a(gu.c, this.d.charAt(-1 + this.d.length()))) {
            throw fv.a();
        }
        if (this.d.length() <= 3) {
            throw fv.a();
        }
        if (map == null || !map.containsKey(bj.RETURN_CODABAR_START_END)) {
            this.d.deleteCharAt(-1 + this.d.length());
            this.d.deleteCharAt(0);
        }
        int k = 0;
        int n5 = 0;
        while (k < a2) {
            n5 += this.b[k];
            ++k;
            if (a) {
                break;
            }
        }
        final float n6 = n5;
        int n7 = n5;
        int l = a2;
        while (l < n2 - 1) {
            n7 += this.b[l];
            ++l;
            if (a) {
                break;
            }
        }
        final aU au = new aU(this.d.toString(), null, new cs[] { new cs(n6, n), new cs(n7, n) }, d3.CODABAR);
        if (fN.a != 0) {
            boolean a4 = false;
            if (!a) {
                a4 = true;
            }
            gj.a = a4;
        }
        return au;
    }
    
    void c(int n) {
        final boolean a = gj.a;
        final int[] array = { 0, 0, 0, 0 };
        final int[] array2 = { 0, 0, 0, 0 };
        final int n2 = -1 + this.d.length();
        int n3 = 0;
        int n4 = n;
        do {
            int n5 = gu.e[this.d.charAt(n3)];
            int i = 6;
            while (i >= 0) {
                final int n6 = (i & 0x1) + 2 * (n5 & 0x1);
                array[n6] += this.b[n4 + i];
                ++array2[n6];
                n5 >>= 1;
                --i;
                if (a) {
                    break;
                }
            }
            if (n3 >= n2 && !a) {
                break;
            }
            n4 += 8;
            ++n3;
        } while (!a);
        final float[] array3 = new float[4];
        final float[] array4 = new float[4];
        int j = 0;
        while (j < 2) {
            array4[j] = 0.0f;
            array3[j] = (array4[j + 2] = (array[j] / array2[j] + array[j + 2] / array2[j + 2]) / 2.0f);
            array3[j + 2] = (1.5f + 2.0f * array[j + 2]) / array2[j + 2];
            ++j;
            if (a) {
                break;
            }
        }
        int n7 = 0;
        do {
            int n8 = gu.e[this.d.charAt(n7)];
            int k = 6;
            while (k >= 0) {
                final int n9 = (k & 0x1) + 2 * (n8 & 0x1);
                final int n10 = this.b[n + k];
                if (n10 < array4[n9] || n10 > array3[n9]) {
                    throw fv.a();
                }
                n8 >>= 1;
                --k;
                if (a) {
                    break;
                }
            }
            if (n7 >= n2 && !a) {
                break;
            }
            n += 8;
            ++n7;
        } while (!a);
    }
}
