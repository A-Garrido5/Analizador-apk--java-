// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class gL extends gP
{
    private final int[] i;
    
    public gL() {
        this.i = new int[4];
    }
    
    @Override
    protected int a(final hN hn, final int[] array, final StringBuilder sb) {
        final boolean a = gj.a;
        final int[] i = this.i;
        i[1] = (i[0] = 0);
        i[3] = (i[2] = 0);
        final int b = hn.b();
        int n = array[1];
        int n3;
        for (int n2 = 0; n2 < 4 && n < b; n2 = n3) {
            sb.append((char)(48 + gP.a(hn, i, n, gL.b)));
            final int length = i.length;
            int j = 0;
            while (j < length) {
                n += i[j];
                ++j;
                if (a) {
                    break;
                }
            }
            n3 = n2 + 1;
            if (a) {
                break;
            }
        }
        int n4 = gP.a(hn, n, true, gL.d)[1];
        int n6;
        for (int n5 = 0; n5 < 4 && n4 < b; n5 = n6) {
            sb.append((char)(48 + gP.a(hn, i, n4, gL.b)));
            final int length2 = i.length;
            int k = 0;
            while (k < length2) {
                n4 += i[k];
                ++k;
                if (a) {
                    break;
                }
            }
            n6 = n5 + 1;
            if (a) {
                break;
            }
        }
        return n4;
    }
    
    @Override
    d3 a() {
        return d3.EAN_8;
    }
}
