// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class g9 extends gP
{
    static final int[] i;
    private final int[] j;
    
    static {
        i = new int[] { 0, 11, 13, 14, 19, 25, 28, 21, 22, 26 };
    }
    
    public g9() {
        this.j = new int[4];
    }
    
    private static void a(final StringBuilder sb, final int n) {
        final boolean a = gj.a;
        int i = 0;
        while (i < 10) {
            if (n == g9.i[i]) {
                sb.insert(0, (char)(i + 48));
                return;
            }
            ++i;
            if (a) {
                break;
            }
        }
        throw fv.a();
    }
    
    @Override
    protected int a(final hN hn, final int[] array, final StringBuilder sb) {
        final boolean a = gj.a;
        final int[] j = this.j;
        j[1] = (j[0] = 0);
        j[3] = (j[2] = 0);
        final int b = hn.b();
        final int n = array[1];
        int n2 = 0;
        int n3 = 0;
        int n4;
        int n5;
        for (n4 = n; n2 < 6 && n4 < b; n2 = n5) {
            final int a2 = gP.a(hn, j, n4, g9.e);
            sb.append((char)(48 + a2 % 10));
            final int length = j.length;
            int i = 0;
            while (i < length) {
                n4 += j[i];
                ++i;
                if (a) {
                    break;
                }
            }
            if (a2 >= 10) {
                n3 |= 1 << 5 - n2;
            }
            n5 = n2 + 1;
            if (a) {
                break;
            }
        }
        a(sb, n3);
        final int n6 = gP.a(hn, n4, true, g9.d)[1];
        int n7;
        int n8;
        int n9;
        for (n7 = 0, n8 = n6; n7 < 6 && n8 < b; n7 = n9) {
            sb.append((char)(48 + gP.a(hn, j, n8, g9.b)));
            final int length2 = j.length;
            int k = 0;
            while (k < length2) {
                n8 += j[k];
                ++k;
                if (a) {
                    break;
                }
            }
            n9 = n7 + 1;
            if (a) {
                break;
            }
        }
        return n8;
    }
    
    @Override
    d3 a() {
        return d3.EAN_13;
    }
}
