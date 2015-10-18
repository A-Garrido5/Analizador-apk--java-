// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.curve25519;

public class aq
{
    public static int a(final byte[] array, final byte[] array2, final byte[] array3) {
        final int a = U.a;
        final byte[] array4 = new byte[32];
        final int[] array5 = new int[10];
        final int[] array6 = new int[10];
        final int[] array7 = new int[10];
        final int[] array8 = new int[10];
        final int[] array9 = new int[10];
        final int[] array10 = new int[10];
        final int[] array11 = new int[10];
        int i = 0;
        while (i < 32) {
            array4[i] = array2[i];
            ++i;
            if (a != 0) {
                break;
            }
        }
        P.a(array5, array3);
        h.a(array6);
        p.a(array7);
        s.a(array8, array5);
        h.a(array9);
        int n = 0;
        while (true) {
            int n2;
            int n4;
            for (int j = 254; j >= 0; j = n4, n = n2) {
                n2 = (0x1 & array4[j / 8] >>> (j & 0x7));
                final int n3 = n ^ n2;
                K.a(array6, array8, n3);
                K.a(array7, array9, n3);
                org.whispersystems.curve25519.i.a(array10, array8, array9);
                org.whispersystems.curve25519.i.a(array11, array6, array7);
                S.a(array6, array6, array7);
                S.a(array7, array8, array9);
                C.a(array9, array10, array6);
                C.a(array7, array7, array11);
                A.a(array10, array11);
                A.a(array11, array6);
                S.a(array8, array9, array7);
                org.whispersystems.curve25519.i.a(array7, array9, array7);
                C.a(array6, array11, array10);
                org.whispersystems.curve25519.i.a(array11, array11, array10);
                A.a(array7, array7);
                T.a(array9, array11);
                A.a(array8, array8);
                S.a(array10, array10, array9);
                C.a(array9, array5, array7);
                C.a(array7, array11, array10);
                n4 = j - 1;
                if (a != 0) {
                    K.a(array6, array8, n2);
                    K.a(array7, array9, n2);
                    ar.a(array7, array7);
                    C.a(array6, array6, array7);
                    X.a(array, array6);
                    return 0;
                }
            }
            n2 = n;
            continue;
        }
    }
}
