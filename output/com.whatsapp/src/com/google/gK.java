// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class gK extends gP
{
    private static final int[][] j;
    private static final int[] k;
    private static final String[] z;
    private final int[] i;
    
    static {
        final String[] z2 = new String[4];
        String s = "@H\u0000\u0014";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'U';
                        break;
                    }
                    case 0: {
                        c2 = 'p';
                        break;
                    }
                    case 1: {
                        c2 = 'x';
                        break;
                    }
                    case 2: {
                        c2 = '0';
                        break;
                    }
                    case 3: {
                        c2 = '$';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "@H\u0000\u0014e";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "@H\u0000\u0014";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "@H\u0000\u0014e";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        k = new int[] { 1, 1, 1, 1, 1, 1 };
        j = new int[][] { { 56, 52, 50, 49, 44, 38, 35, 42, 41, 37 }, { 7, 11, 13, 14, 19, 25, 28, 21, 22, 26 } };
    }
    
    public gK() {
        this.i = new int[4];
    }
    
    public static String a(final String s) {
        final boolean a = gj.a;
        final char[] array = new char[6];
        s.getChars(1, 7, array, 0);
        final StringBuilder sb = new StringBuilder(12);
        sb.append(s.charAt(0));
        final char c = array[5];
        Label_0105: {
            Label_0188: {
                switch (c) {
                    case 48:
                    case 49:
                    case 50: {
                        sb.append(array, 0, 2);
                        sb.append(c);
                        sb.append(gK.z[0]);
                        sb.append(array, 2, 3);
                        if (a) {
                            break Label_0188;
                        }
                        break Label_0105;
                    }
                    case 51: {
                        sb.append(array, 0, 3);
                        sb.append(gK.z[1]);
                        sb.append(array, 3, 2);
                        if (a) {
                            break Label_0188;
                        }
                        break Label_0105;
                    }
                    case 52: {
                        sb.append(array, 0, 4);
                        sb.append(gK.z[3]);
                        sb.append(array[4]);
                        if (a) {
                            break;
                        }
                        break Label_0105;
                    }
                }
            }
            sb.append(array, 0, 5);
            sb.append(gK.z[2]);
            sb.append(c);
        }
        sb.append(s.charAt(7));
        return sb.toString();
    }
    
    private static void a(final StringBuilder sb, final int n) {
        final boolean a = gj.a;
        int n2;
        for (int i = 0; i <= 1; i = n2) {
            int j = 0;
            while (j < 10) {
                if (n == gK.j[i][j]) {
                    sb.insert(0, (char)(i + 48));
                    sb.append((char)(j + 48));
                    return;
                }
                ++j;
                if (a) {
                    break;
                }
            }
            n2 = i + 1;
            if (a) {
                break;
            }
        }
        throw fv.a();
    }
    
    @Override
    protected int a(final hN hn, final int[] array, final StringBuilder sb) {
        final boolean a = gj.a;
        final int[] i = this.i;
        i[1] = (i[0] = 0);
        i[3] = (i[2] = 0);
        final int b = hn.b();
        int n = array[1];
        int n2 = 0;
        int n3 = 0;
        while (n2 < 6 && n < b) {
            final int a2 = gP.a(hn, i, n, gK.e);
            sb.append((char)(48 + a2 % 10));
            final int length = i.length;
            int j = 0;
            while (j < length) {
                n += i[j];
                ++j;
                if (a) {
                    break;
                }
            }
            if (a2 >= 10) {
                n3 |= 1 << 5 - n2;
            }
            final int n4 = n2 + 1;
            if (a) {
                break;
            }
            n2 = n4;
        }
        a(sb, n3);
        return n;
    }
    
    @Override
    d3 a() {
        return d3.UPC_E;
    }
    
    protected boolean a(final String s) {
        return super.a(a(s));
    }
    
    protected int[] a(final hN hn, final int n) {
        return gP.a(hn, n, true, gK.k);
    }
}
