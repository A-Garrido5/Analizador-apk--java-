// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Arrays;
import java.math.BigInteger;

final class cD
{
    private static final BigInteger[] a;
    private static final char[] b;
    private static final char[] c;
    
    static {
        c = new char[] { ';', '<', '>', '@', '[', '\\', ']', '_', '`', '~', '!', '\r', '\t', ',', ':', '\n', '-', '.', '$', '/', '\"', '|', '*', '(', ')', '?', '{', '}', '\'' };
        b = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '&', '\r', '\t', ',', ':', '#', '-', '.', '$', '/', '+', '%', '*', '=', '^' };
        (a = new BigInteger[16])[0] = BigInteger.ONE;
        final BigInteger value = BigInteger.valueOf(900L);
        cD.a[1] = value;
        for (int i = 2; i < cD.a.length; ++i) {
            cD.a[i] = cD.a[i - 1].multiply(value);
        }
    }
    
    private static int a(final int n, final int[] array, final int n2, final StringBuilder sb) {
        final boolean b = fG.b;
        int n12;
        if (n == 901) {
            int n3 = 0;
            long n4 = 0L;
            final char[] array2 = new char[6];
            final int[] array3 = new int[6];
            int n5 = 0;
            final int n6 = n2 + 1;
            int n7 = array[n2];
            int n8 = n6;
            while (n8 < array[0] && n5 == 0) {
                final int n9 = n3 + 1;
                array3[n3] = n7;
                n4 = n4 * 900L + n7;
                int n10 = n8 + 1;
                n7 = array[n8];
                if (n7 == 900 || n7 == 901 || n7 == 902 || n7 == 924 || n7 == 928 || n7 == 923 || n7 == 922) {
                    --n10;
                    n5 = 1;
                    if (!b) {
                        n8 = n10;
                        n3 = n9;
                        continue;
                    }
                }
                n8 = n10;
                if (n9 % 5 == 0 && n9 > 0) {
                    int i = 0;
                    while (i < 6) {
                        array2[5 - i] = (char)(n4 % 256L);
                        n4 >>= 8;
                        ++i;
                        if (b) {
                            break;
                        }
                    }
                    sb.append(array2);
                    n3 = 0;
                    if (b) {
                        break;
                    }
                    continue;
                }
                else {
                    n3 = n9;
                }
            }
            if (n8 == array[0] && n7 < 900) {
                final int n11 = n3 + 1;
                array3[n3] = n7;
                n3 = n11;
            }
            int j = 0;
            while (j < n3) {
                sb.append((char)array3[j]);
                ++j;
                if (b) {
                    break;
                }
            }
            if (!b) {
                return n8;
            }
            n12 = n8;
        }
        else {
            n12 = n2;
        }
        if (n == 924) {
            int n13 = 0;
            long n14 = 0L;
            int n15 = 0;
        Label_0440_Outer:
            while (n12 < array[0] && n15 == 0) {
                final int n16 = n12 + 1;
                final int n17 = array[n12];
                while (true) {
                    Label_0516: {
                        if (n17 < 900) {
                            ++n13;
                            n14 = n14 * 900L + n17;
                            if (!b) {
                                break Label_0516;
                            }
                        }
                        if (n17 != 900 && n17 != 901 && n17 != 902 && n17 != 924 && n17 != 928 && n17 != 923 && n17 != 922) {
                            break Label_0516;
                        }
                        n12 = n16 - 1;
                        n15 = 1;
                        if (n13 % 5 == 0 && n13 > 0) {
                            final char[] array4 = new char[6];
                            int k = 0;
                            while (k < 6) {
                                array4[5 - k] = (char)(0xFFL & n14);
                                n14 >>= 8;
                                ++k;
                                if (b) {
                                    break;
                                }
                            }
                            sb.append(array4);
                            n13 = 0;
                        }
                        if (b) {
                            break;
                        }
                        continue Label_0440_Outer;
                    }
                    n12 = n16;
                    continue;
                }
            }
        }
        return n12;
    }
    
    private static int a(final int[] array, final int n, final h6 h6) {
        final boolean b = fG.b;
        if (n + 2 > array[0]) {
            throw fD.a();
        }
        final int[] array2 = new int[2];
        int i = 0;
        int n2 = n;
        while (i < 2) {
            array2[i] = array[n2];
            ++i;
            ++n2;
            if (b) {
                break;
            }
        }
        h6.a(Integer.parseInt(a(array2, 2)));
        final StringBuilder sb = new StringBuilder();
        int a = a(array, n2, sb);
        h6.a(sb.toString());
        if (array[a] == 923) {
            final int n3 = a + 1;
            final int[] array3 = new int[array[0] - n3];
            int n4 = 0;
            a = n3;
            int n5 = 0;
            while (a < array[0] && n5 == 0) {
                final int n6 = a + 1;
                final int n7 = array[a];
                Label_0226: {
                    if (n7 < 900) {
                        final int n8 = n4 + 1;
                        array3[n4] = n7;
                        if (!b) {
                            n4 = n8;
                            a = n6;
                            break Label_0226;
                        }
                        n4 = n8;
                    }
                    switch (n7) {
                        case 922: {
                            h6.a(true);
                            a = n6 + 1;
                            if (!b) {
                                n5 = 1;
                                break Label_0226;
                            }
                            break;
                        }
                    }
                    throw fD.a();
                }
                if (b) {
                    break;
                }
            }
            h6.a(Arrays.copyOf(array3, n4));
            if (!b) {
                return a;
            }
        }
        if (array[a] == 922) {
            h6.a(true);
            ++a;
        }
        return a;
    }
    
    private static int a(final int[] array, int n, final StringBuilder sb) {
        final boolean b = fG.b;
        final int[] array2 = new int[2 * (array[0] - n)];
        final int[] array3 = new int[2 * (array[0] - n)];
        int n2 = 0;
        int n3 = 0;
        while (n < array[0] && n2 == 0) {
            int n4 = n + 1;
            final int n5 = array[n];
            Label_0171: {
                Label_0168: {
                    if (n5 < 900) {
                        array2[n3] = n5 / 30;
                        array2[n3 + 1] = n5 % 30;
                        n3 += 2;
                        if (!b) {
                            break Label_0168;
                        }
                    }
                    Label_0219: {
                        switch (n5) {
                            case 900: {
                                final int n6 = n3 + 1;
                                array2[n3] = 900;
                                if (b) {
                                    n3 = n6;
                                    break Label_0219;
                                }
                                n3 = n6;
                                n = n4;
                                break Label_0171;
                            }
                            case 901:
                            case 902:
                            case 922:
                            case 923:
                            case 924:
                            case 928: {
                                --n4;
                                n2 = 1;
                                if (b) {
                                    break Label_0219;
                                }
                                break;
                            }
                            case 913: {
                                array2[n3] = 913;
                                n = n4 + 1;
                                array3[n3] = array[n4];
                                ++n3;
                                break Label_0171;
                            }
                        }
                    }
                }
                n = n4;
            }
            if (b) {
                break;
            }
        }
        a(array2, array3, n3, sb);
        return n;
    }
    
    static aS a(final int[] array, final String s) {
        final boolean b = fG.b;
        final StringBuilder sb = new StringBuilder(2 * array.length);
        int i = 2;
        int n = array[1];
        final h6 h6 = new h6();
    Label_0127_Outer:
        while (i < array[0]) {
            while (true) {
                Label_0250: {
                    final int a;
                    Label_0195: {
                        switch (n) {
                            default: {
                                a = a(array, i - 1, sb);
                                break;
                            }
                            case 900: {
                                i = a(array, i, sb);
                                if (b) {
                                    break Label_0195;
                                }
                                break Label_0250;
                            }
                            case 901:
                            case 913:
                            case 924: {
                                i = a(n, array, i, sb);
                                if (b) {
                                    break Label_0195;
                                }
                                break Label_0250;
                            }
                            case 902: {
                                i = b(array, i, sb);
                                if (b) {
                                    break Label_0195;
                                }
                                break Label_0250;
                            }
                            case 928: {
                                i = a(array, i, h6);
                                if (b) {
                                    throw fD.a();
                                }
                                break Label_0250;
                            }
                            case 922:
                            case 923: {
                                throw fD.a();
                            }
                        }
                    }
                    if (a < array.length) {
                        i = a + 1;
                        n = array[a];
                        if (!b) {
                            continue Label_0127_Outer;
                        }
                    }
                    throw fD.a();
                }
                int a = i;
                continue;
            }
        }
        if (sb.length() == 0) {
            throw fD.a();
        }
        final aS as = new aS(null, sb.toString(), null, s);
        as.a(h6);
        return as;
    }
    
    private static String a(final int[] array, final int n) {
        final boolean b = fG.b;
        BigInteger bigInteger = BigInteger.ZERO;
        int i = 0;
        while (i < n) {
            bigInteger = bigInteger.add(cD.a[-1 + (n - i)].multiply(BigInteger.valueOf(array[i])));
            ++i;
            if (b) {
                break;
            }
        }
        final String string = bigInteger.toString();
        if (string.charAt(0) != '1') {
            throw fD.a();
        }
        return string.substring(1);
    }
    
    private static void a(final int[] array, final int[] array2, final int n, final StringBuilder sb) {
        final boolean b = fG.b;
        cC cc = cC.ALPHA;
        cC alpha = cC.ALPHA;
        int i = 0;
    Label_0084_Outer:
        while (i < n) {
            final int n2 = array[i];
            final int n3 = e1.a[cc.ordinal()];
            char c = '\0';
            while (true) {
                cC cc2 = null;
                Label_0789: {
                    Label_0782: {
                        Label_0692: {
                            switch (n3) {
                                case 1: {
                                    c = '\0';
                                    if (n2 < 26) {
                                        c = (char)(n2 + 65);
                                        if (!b) {
                                            break;
                                        }
                                    }
                                    if (n2 == 26) {
                                        c = ' ';
                                        if (!b) {
                                            break;
                                        }
                                    }
                                    if (n2 == 27) {
                                        cc = cC.LOWER;
                                        if (!b) {
                                            break;
                                        }
                                    }
                                    if (n2 == 28) {
                                        cc = cC.MIXED;
                                        if (!b) {
                                            break;
                                        }
                                    }
                                    if (n2 == 29) {
                                        cc2 = cC.PUNCT_SHIFT;
                                        if (!b) {
                                            break Label_0789;
                                        }
                                        final cC cc3 = cc;
                                        cc = cc2;
                                        alpha = cc3;
                                    }
                                    if (n2 == 913) {
                                        sb.append((char)array2[i]);
                                        if (!b) {
                                            break;
                                        }
                                    }
                                    if (n2 != 900) {
                                        break;
                                    }
                                    cc = cC.ALPHA;
                                    if (b) {
                                        break Label_0692;
                                    }
                                    break;
                                }
                                case 2: {
                                    if (n2 < 26) {
                                        c = (char)(n2 + 97);
                                        if (!b) {
                                            break;
                                        }
                                    }
                                    if (n2 == 26) {
                                        c = ' ';
                                        if (!b) {
                                            break;
                                        }
                                    }
                                    if (n2 == 27) {
                                        cc2 = cC.ALPHA_SHIFT;
                                        if (!b) {
                                            break Label_0789;
                                        }
                                        final cC cc4 = cc;
                                        cc = cc2;
                                        alpha = cc4;
                                    }
                                    if (n2 == 28) {
                                        cc = cC.MIXED;
                                        if (!b) {
                                            break;
                                        }
                                    }
                                    if (n2 == 29) {
                                        cc2 = cC.PUNCT_SHIFT;
                                        if (!b) {
                                            break Label_0789;
                                        }
                                        final cC cc5 = cc;
                                        cc = cc2;
                                        alpha = cc5;
                                    }
                                    if (n2 == 913) {
                                        sb.append((char)array2[i]);
                                        if (!b) {
                                            break;
                                        }
                                    }
                                    if (n2 != 900) {
                                        break;
                                    }
                                    cc = cC.ALPHA;
                                    if (b) {
                                        break Label_0692;
                                    }
                                    break;
                                }
                                case 3: {
                                    if (n2 < 25) {
                                        c = cD.b[n2];
                                        if (!b) {
                                            break;
                                        }
                                    }
                                    if (n2 == 25) {
                                        cc = cC.PUNCT;
                                        if (!b) {
                                            break;
                                        }
                                    }
                                    if (n2 == 26) {
                                        c = ' ';
                                        if (!b) {
                                            break;
                                        }
                                    }
                                    if (n2 == 27) {
                                        cc = cC.LOWER;
                                        if (!b) {
                                            break;
                                        }
                                    }
                                    if (n2 == 28) {
                                        cc = cC.ALPHA;
                                        if (!b) {
                                            break;
                                        }
                                    }
                                    if (n2 == 29) {
                                        cc2 = cC.PUNCT_SHIFT;
                                        if (!b) {
                                            break Label_0789;
                                        }
                                        final cC cc6 = cc;
                                        cc = cc2;
                                        alpha = cc6;
                                    }
                                    if (n2 == 913) {
                                        sb.append((char)array2[i]);
                                        if (!b) {
                                            break;
                                        }
                                    }
                                    if (n2 != 900) {
                                        break;
                                    }
                                    cc = cC.ALPHA;
                                    if (b) {
                                        break Label_0692;
                                    }
                                    break;
                                }
                                case 4: {
                                    if (n2 < 29) {
                                        c = cD.c[n2];
                                        if (!b) {
                                            break;
                                        }
                                    }
                                    if (n2 == 29) {
                                        cc = cC.ALPHA;
                                        if (!b) {
                                            break;
                                        }
                                    }
                                    if (n2 == 913) {
                                        sb.append((char)array2[i]);
                                        if (!b) {
                                            break;
                                        }
                                    }
                                    if (n2 != 900) {
                                        break;
                                    }
                                    cc = cC.ALPHA;
                                    if (b) {
                                        break Label_0692;
                                    }
                                    break;
                                }
                                case 5: {
                                    if (n2 < 26) {
                                        c = (char)(n2 + 65);
                                        if (!b) {
                                            break Label_0782;
                                        }
                                    }
                                    if (n2 == 26) {
                                        c = ' ';
                                        if (!b) {
                                            break Label_0782;
                                        }
                                    }
                                    if (n2 != 900) {
                                        break Label_0782;
                                    }
                                    cc = cC.ALPHA;
                                    if (b) {
                                        break Label_0692;
                                    }
                                    break;
                                }
                                case 6: {
                                    if (n2 < 29) {
                                        c = cD.c[n2];
                                        if (!b) {
                                            break Label_0782;
                                        }
                                    }
                                    if (n2 == 29) {
                                        cc = cC.ALPHA;
                                        if (!b) {
                                            break;
                                        }
                                    }
                                    else {
                                        cc = alpha;
                                    }
                                    if (n2 == 913) {
                                        sb.append((char)array2[i]);
                                        if (!b) {
                                            break;
                                        }
                                    }
                                    if (n2 == 900) {
                                        cc = cC.ALPHA;
                                        break;
                                    }
                                    break;
                                }
                            }
                        }
                        if (c != '\0') {
                            sb.append(c);
                        }
                        final int n4 = i + 1;
                        if (b) {
                            break;
                        }
                        i = n4;
                        continue Label_0084_Outer;
                    }
                    cc = alpha;
                    continue;
                }
                final cC cc7 = cc;
                cc = cc2;
                alpha = cc7;
                continue;
            }
        }
    }
    
    private static int b(final int[] array, int n, final StringBuilder sb) {
        final boolean b = fG.b;
        final int[] array2 = new int[15];
        int n2 = 0;
        int n3 = 0;
    Label_0127_Outer:
        while (n < array[0] && n2 == 0) {
            final int n4 = n + 1;
            final int n5 = array[n];
            if (n4 == array[0]) {
                n2 = 1;
            }
            while (true) {
                Label_0169: {
                    if (n5 < 900) {
                        array2[n3] = n5;
                        ++n3;
                        if (!b) {
                            break Label_0169;
                        }
                    }
                    if (n5 != 900 && n5 != 901 && n5 != 924 && n5 != 928 && n5 != 923 && n5 != 922) {
                        break Label_0169;
                    }
                    n = n4 - 1;
                    n2 = 1;
                    if (n3 % 15 == 0 || n5 == 902 || n2 != 0) {
                        sb.append(a(array2, n3));
                        n3 = 0;
                    }
                    if (b) {
                        break;
                    }
                    continue Label_0127_Outer;
                }
                n = n4;
                continue;
            }
        }
        return n;
    }
}
