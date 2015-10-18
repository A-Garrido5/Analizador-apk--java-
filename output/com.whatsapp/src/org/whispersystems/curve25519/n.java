// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.curve25519;

public class n
{
    public static int a(final int[] array) {
        final byte[] array2 = new byte[32];
        X.a(array2, array);
        return 0x1 & array2[0];
    }
}
