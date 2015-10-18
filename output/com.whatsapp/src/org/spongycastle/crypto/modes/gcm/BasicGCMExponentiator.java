// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto.modes.gcm;

import org.spongycastle.util.Arrays;

public class BasicGCMExponentiator implements GCMExponentiator
{
    private int[] x;
    
    @Override
    public void exponentiateX(long n, final byte[] array) {
        final int[] oneAsInts = GCMUtil.oneAsInts();
        if (n > 0L) {
            final int[] clone = Arrays.clone(this.x);
            do {
                if ((0x1L & n) != 0x0L) {
                    GCMUtil.multiply(oneAsInts, clone);
                }
                GCMUtil.multiply(clone, clone);
                n >>>= 1;
            } while (n > 0L);
        }
        GCMUtil.asBytes(oneAsInts, array);
    }
    
    @Override
    public void init(final byte[] array) {
        this.x = GCMUtil.asInts(array);
    }
}
