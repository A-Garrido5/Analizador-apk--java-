// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.curve25519;

public class B
{
    static int a(final byte b) {
        return b >>> 63;
    }
    
    static int a(final byte b, final byte b2) {
        return -1 + (b ^ b2) >>> 31;
    }
    
    public static void a(final Q q, final byte[] array) {
        final int a = U.a;
        final byte[] array2 = new byte[64];
        final aT at = new aT();
        final g g = new g();
        final U u = new U();
        int i = 0;
        while (i < 32) {
            array2[0 + i * 2] = (byte)(0xF & array[i] >>> 0);
            array2[1 + i * 2] = (byte)(0xF & array[i] >>> 4);
            ++i;
            if (a != 0) {
                break;
            }
        }
        int j = 0;
        byte b = 0;
        while (j < 63) {
            array2[j] += b;
            b = (byte)((byte)(8 + array2[j]) >> 4);
            array2[j] -= (byte)(b << 4);
            ++j;
            if (a != 0) {
                break;
            }
        }
        array2[63] += b;
        O.a(q);
        int k = 1;
        while (k < 64) {
            a(u, k / 2, array2[k]);
            r.a(at, q, u);
            D.a(q, at);
            k += 2;
            if (a != 0) {
                break;
            }
        }
        y.a(at, q);
        I.a(g, at);
        z.a(at, g);
        I.a(g, at);
        z.a(at, g);
        I.a(g, at);
        z.a(at, g);
        D.a(q, at);
        int l = 0;
        while (l < 64) {
            a(u, l / 2, array2[l]);
            r.a(at, q, u);
            D.a(q, at);
            l += 2;
            if (a != 0) {
                break;
            }
        }
    }
    
    static void a(final U u, final int n, final byte b) {
        U[][] array;
        if (n <= 7) {
            array = H.a;
        }
        else if (n <= 15) {
            array = d.a;
        }
        else if (n <= 23) {
            array = M.a;
        }
        else {
            array = a.a;
        }
        final U u2 = new U();
        final int a = a(b);
        final int n2 = b - ((b & -a) << 1);
        J.a(u);
        a(u, array[n][0], a((byte)n2, (byte)1));
        a(u, array[n][1], a((byte)n2, (byte)2));
        a(u, array[n][2], a((byte)n2, (byte)3));
        a(u, array[n][3], a((byte)n2, (byte)4));
        a(u, array[n][4], a((byte)n2, (byte)5));
        a(u, array[n][5], a((byte)n2, (byte)6));
        a(u, array[n][6], a((byte)n2, (byte)7));
        a(u, array[n][7], a((byte)n2, (byte)8));
        s.a(u2.d, u.b);
        s.a(u2.b, u.d);
        f.a(u2.c, u.c);
        a(u, u2, a);
    }
    
    static void a(final U u, final U u2, final int n) {
        k.a(u.d, u2.d, n);
        k.a(u.b, u2.b, n);
        k.a(u.c, u2.c, n);
    }
}
