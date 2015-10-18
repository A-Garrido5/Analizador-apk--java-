// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.curve25519;

public class o
{
    public static int a(final V v, final byte[] array, final byte[] array2, final byte[] array3, final int n) {
        final int[] array4 = new int[10];
        final int[] array5 = new int[10];
        final int[] array6 = new int[10];
        final int[] array7 = new int[10];
        final int[] array8 = new int[10];
        final int[] array9 = new int[10];
        final byte[] array10 = new byte[32];
        final byte[] array11 = new byte[n + 64];
        final byte[] array12 = new byte[n + 64];
        P.a(array4, array2);
        h.a(array8);
        i.a(array5, array4, array8);
        S.a(array6, array4, array8);
        ar.a(array7, array6);
        C.a(array9, array5, array7);
        X.a(array10, array9);
        array10[31] &= 0x7F;
        array10[31] |= (byte)(0x80 & array[63]);
        System.arraycopy(array, 0, array11, 0, 64);
        array11[63] &= 0x7F;
        System.arraycopy(array3, 0, array11, 64, n);
        return W.a(v, array12, 0L, array11, n + 64, array10);
    }
    
    public static int a(final V v, final byte[] array, final byte[] array2, final byte[] array3, final int n, final byte[] array4) {
        final Q q = new Q();
        final byte[] array5 = new byte[32];
        final byte[] array6 = new byte[n + 128];
        B.a(q, array2);
        w.a(array5, q);
        final byte b = (byte)(0x80 & array5[31]);
        E.a(v, array6, array3, n, array2, array5, array4);
        System.arraycopy(array6, 0, array, 0, 64);
        array[63] &= 0x7F;
        array[63] |= b;
        return 0;
    }
    
    public static void a(final byte[] array, final byte[] array2) {
        final Q q = new Q();
        final int[] array3 = new int[10];
        final int[] array4 = new int[10];
        final int[] array5 = new int[10];
        final int[] array6 = new int[10];
        final int[] array7 = new int[10];
        B.a(q, array2);
        S.a(array4, q.e, q.d);
        i.a(array5, q.d, q.e);
        ar.a(array6, array5);
        C.a(array7, array4, array6);
        X.a(array, array7);
    }
}
