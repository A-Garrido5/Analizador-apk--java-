// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.curve25519;

public class N
{
    static int[] a;
    static int[] b;
    
    static {
        N.b = new int[] { -10913610, 13857413, -15372611, 6949391, 114729, -8787816, -6275908, -3247719, -18696448, -12055116 };
        N.a = new int[] { -32595792, -7943725, 9377950, 3500415, 12389472, -272473, -25146209, -2005654, 326686, 11406482 };
    }
    
    static int a(final Q q, final byte[] array) {
        final int[] array2 = new int[10];
        final int[] array3 = new int[10];
        final int[] array4 = new int[10];
        final int[] array5 = new int[10];
        final int[] array6 = new int[10];
        P.a(q.e, array);
        h.a(q.d);
        A.a(array2, q.e);
        C.a(array3, array2, N.b);
        i.a(array2, array2, q.d);
        S.a(array3, array3, q.d);
        A.a(array4, array3);
        C.a(array4, array4, array3);
        A.a(q.a, array4);
        C.a(q.a, q.a, array3);
        C.a(q.a, q.a, array2);
        org.whispersystems.curve25519.b.a(q.a, q.a);
        C.a(q.a, q.a, array4);
        C.a(q.a, q.a, array2);
        A.a(array5, q.a);
        C.a(array5, array5, array3);
        i.a(array6, array5, array2);
        if (R.a(array6) != 0) {
            S.a(array6, array5, array2);
            if (R.a(array6) != 0) {
                return -1;
            }
            C.a(q.a, q.a, N.a);
        }
        if (n.a(q.a) == (0x1 & array[31] >>> 7)) {
            f.a(q.a, q.a);
        }
        C.a(q.c, q.a, q.e);
        return 0;
    }
}
