// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.curve25519;

public class R
{
    static final byte[] a;
    
    static {
        a = new byte[32];
    }
    
    public static int a(final int[] array) {
        final byte[] array2 = new byte[32];
        X.a(array2, array);
        return m.a(array2, R.a);
    }
}
