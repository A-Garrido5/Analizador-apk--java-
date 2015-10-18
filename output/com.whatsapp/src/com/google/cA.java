// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.EnumMap;
import java.util.Map;

final class cA
{
    private static final int[] a;
    private static final String[] z;
    private final StringBuilder b;
    private final int[] c;
    
    static {
        final String[] z2 = new String[5];
        String s = "]\u0007.s.";
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
                        c2 = '\u001e';
                        break;
                    }
                    case 0: {
                        c2 = 'd';
                        break;
                    }
                    case 1: {
                        c2 = '>';
                        break;
                    }
                    case 2: {
                        c2 = '\u0017';
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
                    s = "]\u0007.s/";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "]\u000e'z.";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "T\u0010'z";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "1Mr.";
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
        a = new int[] { 24, 20, 18, 17, 12, 6, 3, 10, 9, 5 };
    }
    
    cA() {
        this.c = new int[4];
        this.b = new StringBuilder();
    }
    
    private static int a(final int n) {
        final boolean a = gj.a;
        int i = 0;
        while (i < 10) {
            if (n == cA.a[i]) {
                return i;
            }
            ++i;
            if (a) {
                break;
            }
        }
        throw fv.a();
    }
    
    private static int a(final CharSequence charSequence) {
        final boolean a = gj.a;
        final int length = charSequence.length();
        final int n = length - 2;
        int n2 = 0;
        int i = n;
        while (i >= 0) {
            n2 += -48 + charSequence.charAt(i);
            i -= 2;
            if (a) {
                break;
            }
        }
        final int n3 = n2 * 3;
        final int n4 = length - 1;
        int n5 = n3;
        int j = n4;
        while (j >= 0) {
            n5 += -48 + charSequence.charAt(j);
            j -= 2;
            if (a) {
                break;
            }
        }
        return n5 * 3 % 10;
    }
    
    private static String a(final String s) {
        final boolean a = gj.a;
        String s2 = null;
        Label_0047: {
            Label_0144: {
                switch (s.charAt(0)) {
                    case '0': {
                        s2 = "£";
                        if (a) {
                            break Label_0144;
                        }
                        break Label_0047;
                    }
                    case '5': {
                        s2 = "$";
                        if (a) {
                            break Label_0144;
                        }
                        break Label_0047;
                    }
                    case '9': {
                        if (cA.z[2].equals(s)) {
                            return null;
                        }
                        if (cA.z[1].equals(s)) {
                            return cA.z[3];
                        }
                        if (cA.z[0].equals(s)) {
                            return cA.z[4];
                        }
                        s2 = "";
                        if (a) {
                            break;
                        }
                        break Label_0047;
                    }
                }
            }
            s2 = "";
        }
        final int int1 = Integer.parseInt(s.substring(1));
        final String value = String.valueOf(int1 / 100);
        final int n = int1 % 100;
        String s3;
        if (n < 10) {
            s3 = "0" + n;
        }
        else {
            s3 = String.valueOf(n);
        }
        return s2 + value + '.' + s3;
    }
    
    private static Map b(final String s) {
        if (s.length() == 5) {
            final String a = a(s);
            if (a != null) {
                final EnumMap<A, String> enumMap = new EnumMap<A, String>(A.class);
                enumMap.put(A.SUGGESTED_PRICE, a);
                return enumMap;
            }
        }
        return null;
    }
    
    int a(final hN hn, final int[] array, final StringBuilder sb) {
        final boolean a = gj.a;
        final int[] c = this.c;
        c[1] = (c[0] = 0);
        c[3] = (c[2] = 0);
        final int b = hn.b();
        final int n = array[1];
        int n2 = 0;
        int n3 = 0;
        int b2;
        int n4;
        for (b2 = n; n2 < 5 && b2 < b; n2 = n4) {
            final int a2 = gP.a(hn, c, b2, gP.e);
            sb.append((char)(48 + a2 % 10));
            final int length = c.length;
            int i = 0;
            while (i < length) {
                b2 += c[i];
                ++i;
                if (a) {
                    break;
                }
            }
            if (a2 >= 10) {
                n3 |= 1 << 4 - n2;
            }
            if (n2 != 4) {
                b2 = hn.b(hn.d(b2));
            }
            n4 = n2 + 1;
            if (a) {
                break;
            }
        }
        if (sb.length() != 5) {
            throw fv.a();
        }
        if (a((CharSequence)sb.toString()) != a(n3)) {
            throw fv.a();
        }
        return b2;
    }
    
    aU a(final int n, final hN hn, final int[] array) {
        final StringBuilder b = this.b;
        b.setLength(0);
        final int a = this.a(hn, array, b);
        final String string = b.toString();
        final Map b2 = b(string);
        final aU au = new aU(string, null, new cs[] { new cs((array[0] + array[1]) / 2.0f, n), new cs(a, n) }, d3.UPC_EAN_EXTENSION);
        if (b2 != null) {
            au.a(b2);
        }
        return au;
    }
}
