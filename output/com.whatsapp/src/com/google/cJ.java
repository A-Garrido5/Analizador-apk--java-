// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public class cJ extends cG
{
    private static final byte[] c;
    private final int[] b;
    private byte[] d;
    
    static {
        c = new byte[0];
    }
    
    public cJ(final b5 b5) {
        super(b5);
        this.d = cJ.c;
        this.b = new int[32];
    }
    
    private static int a(final int[] array) {
        int i = 0;
        final int b = hN.b;
        final int length = array.length;
        int j = 0;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        while (j < length) {
            if (array[j] > n) {
                n = array[j];
                n2 = j;
            }
            if (array[j] > n3) {
                n3 = array[j];
            }
            ++j;
            if (b != 0) {
                break;
            }
        }
        final int n4 = n3;
        int n5 = 0;
        int n6 = 0;
        while (i < length) {
            final int n7 = i - n2;
            int n8 = n7 * (n7 * array[i]);
            if (n8 > n5) {
                n6 = i;
            }
            else {
                n8 = n5;
            }
            ++i;
            if (b != 0) {
                break;
            }
            n5 = n8;
        }
        if (n2 <= n6) {
            final int n9 = n6;
            n6 = n2;
            n2 = n9;
        }
        if (n2 - n6 <= length / 16) {
            throw fv.a();
        }
        int n10 = n2 - 1;
        int n11 = -1;
        int k = n2 - 1;
        while (k > n6) {
            final int n12 = k - n6;
            int n13 = n12 * n12 * (n2 - k) * (n4 - array[k]);
            if (n13 > n11) {
                n10 = k;
            }
            else {
                n13 = n11;
            }
            --k;
            if (b != 0) {
                break;
            }
            n11 = n13;
        }
        return n10 << 3;
    }
    
    private void a(final int n) {
        final int b = hN.b;
        if (this.d.length < n) {
            this.d = new byte[n];
        }
        int i = 0;
        while (i < 32) {
            this.b[i] = 0;
            ++i;
            if (b != 0) {
                break;
            }
        }
    }
    
    @Override
    public cG a(final b5 b5) {
        return new cJ(b5);
    }
    
    @Override
    public hN a(final int n, hN hn) {
        int i = 1;
        final int b = hN.b;
        final b5 b2 = this.b();
        final int c = b2.c();
        Label_0052: {
            if (hn == null || hn.b() < c) {
                hn = new hN(c);
                if (b == 0) {
                    break Label_0052;
                }
            }
            hn.c();
        }
        this.a(c);
        final byte[] a = b2.a(n, this.d);
        final int[] b3 = this.b;
        int j = 0;
        while (j < c) {
            final int n2 = (0xFF & a[j]) >> 3;
            ++b3[n2];
            ++j;
            if (b != 0) {
                break;
            }
        }
        final int a2 = a(b3);
        final int n3 = 0xFF & a[0];
        int n4 = 0xFF & a[i];
        int n5 = n3;
        while (i < c - 1) {
            final int n6 = 0xFF & a[i + 1];
            if ((n4 * 4 - n5 - n6) / 2 < a2) {
                hn.e(i);
            }
            ++i;
            if (b != 0) {
                break;
            }
            n5 = n4;
            n4 = n6;
        }
        return hn;
    }
    
    @Override
    public L d() {
        final int b = hN.b;
        final b5 b2 = this.b();
        final int c = b2.c();
        final int e = b2.e();
        final L l = new L(c, e);
        this.a(c);
        final int[] b3 = this.b;
        int n3;
        for (int i = 1; i < 5; i = n3) {
            final byte[] a = b2.a(e * i / 5, this.d);
            final int n = c * 4 / 5;
            int j = c / 5;
            while (j < n) {
                final int n2 = (0xFF & a[j]) >> 3;
                ++b3[n2];
                ++j;
                if (b != 0) {
                    break;
                }
            }
            n3 = i + 1;
            if (b != 0) {
                break;
            }
        }
        final int a2 = a(b3);
        final byte[] b4 = b2.b();
        int n6;
        for (int k = 0; k < e; k = n6) {
            final int n4 = k * c;
            int n5 = 0;
            while (n5 < c) {
                if ((0xFF & b4[n4 + n5]) < a2) {
                    l.b(n5, k);
                }
                ++n5;
                if (b != 0) {
                    break;
                }
            }
            n6 = k + 1;
            if (b != 0) {
                break;
            }
        }
        return l;
    }
}
