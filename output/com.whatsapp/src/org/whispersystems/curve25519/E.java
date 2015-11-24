// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.curve25519;

public class E
{
    static int a(final V v, final byte[] array, final byte[] array2, final long n, final byte[] array3, final byte[] array4, final byte[] array5) {
        final int a = U.a;
        final byte[] array6 = new byte[64];
        final byte[] array7 = new byte[64];
        final Q q = new Q();
        System.arraycopy(array2, 0, array, 64, (int)n);
        System.arraycopy(array3, 0, array, 32, 32);
        array[0] = -2;
        int i = 1;
        while (i < 32) {
            array[i] = -1;
            ++i;
            if (a != 0) {
                break;
            }
        }
        System.arraycopy(array5, 0, array, (int)(64L + n), 64);
        v.a(array6, array, 128L + n);
        System.arraycopy(array4, 0, array, 32, 32);
        x.a(array6);
        B.a(q, array6);
        w.a(array, q);
        v.a(array7, array, 64L + n);
        x.a(array7);
        final byte[] array8 = new byte[32];
        c.a(array8, array7, array3, array6);
        System.arraycopy(array8, 0, array, 32, 32);
        return 0;
    }
}
