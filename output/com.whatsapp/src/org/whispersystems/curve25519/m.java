// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.curve25519;

public class m
{
    public static int a(final byte[] array, final byte[] array2) {
        byte b = 0;
        final int a = U.a;
        int i = 0;
        while (i < 32) {
            b |= (byte)(array[i] ^ array2[i]);
            ++i;
            if (a != 0) {
                break;
            }
        }
        return b;
    }
}
