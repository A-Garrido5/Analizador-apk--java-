// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class X extends W
{
    @Override
    public L a(final L l, final int n, final int n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, final float n9, final float n10, final float n11, final float n12, final float n13, final float n14, final float n15, final float n16, final float n17, final float n18) {
        return this.a(l, n, n2, ca.a(n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18));
    }
    
    @Override
    public L a(final L l, final int n, final int n2, final ca ca) {
        final int b = hN.b;
        Label_0022: {
            if (n > 0) {
                if (n2 > 0) {
                    break Label_0022;
                }
            }
            try {
                throw fv.a();
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                throw ex;
            }
        }
        final L i = new L(n, n2);
        final float[] array = new float[n * 2];
        int n3 = 0;
        while (true) {
            if (n3 >= n2) {
                return i;
            }
            final int length = array.length;
            final float n4 = 0.5f + n3;
            int j = 0;
            while (j < length) {
                array[j] = 0.5f + j / 2;
                array[j + 1] = n4;
                j += 2;
                if (b != 0) {
                    break;
                }
            }
            ca.a(array);
            W.a(l, array);
            int n5 = 0;
            int n6 = 0;
            while (true) {
                Label_0165: {
                    if (n5 >= length) {
                        break Label_0165;
                    }
                    try {
                        if (l.a((int)array[n5], (int)array[n5 + 1])) {
                            i.b(n5 / 2, n3);
                        }
                        n5 += 2;
                        if (b == 0) {
                            continue;
                        }
                        n6 = n3 + 1;
                        if (b != 0) {
                            return i;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException ex2) {
                        try {
                            throw ex2;
                        }
                        catch (ArrayIndexOutOfBoundsException ex3) {
                            throw fv.a();
                        }
                    }
                }
                break;
            }
            n3 = n6;
        }
    }
}
