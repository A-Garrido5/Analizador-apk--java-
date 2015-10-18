// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.curve25519;

public class w
{
    public static void a(final byte[] array, final Q q) {
        final int[] array2 = new int[10];
        final int[] array3 = new int[10];
        final int[] array4 = new int[10];
        ar.a(array2, q.d);
        C.a(array3, q.a, array2);
        C.a(array4, q.e, array2);
        X.a(array, array4);
        array[31] ^= (byte)(n.a(array3) << 7);
    }
}
