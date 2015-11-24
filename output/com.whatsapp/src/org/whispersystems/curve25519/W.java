// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.curve25519;

public class W
{
    public static int a(final V v, final byte[] array, final long n, final byte[] array2, final long n2, final byte[] array3) {
        final byte[] array4 = new byte[32];
        final byte[] array5 = new byte[32];
        final byte[] array6 = new byte[32];
        final byte[] array7 = new byte[64];
        final byte[] array8 = new byte[32];
        final Q q = new Q();
        final g g = new g();
        if (n2 < 64L) {
            return -1;
        }
        if ((0xE0 & array2[63]) != 0x0) {
            return -1;
        }
        if (N.a(q, array3) != 0) {
            return -1;
        }
        v.a(new byte[64], array3, 32L);
        System.arraycopy(array3, 0, array4, 0, 32);
        System.arraycopy(array2, 0, array5, 0, 32);
        System.arraycopy(array2, 32, array6, 0, 32);
        System.arraycopy(array2, 0, array, 0, (int)n2);
        System.arraycopy(array4, 0, array, 32, 32);
        v.a(array7, array, n2);
        x.a(array7);
        aQ.a(g, array7, q, array6);
        u.a(array8, g);
        if (m.a(array8, array5) == 0) {
            System.arraycopy(array, 64, array, 0, (int)(n2 - 64L));
            return 0;
        }
        return -1;
    }
}
