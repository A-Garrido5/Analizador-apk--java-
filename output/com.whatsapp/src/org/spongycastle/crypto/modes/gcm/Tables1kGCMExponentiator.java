// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto.modes.gcm;

import org.spongycastle.util.Arrays;
import java.util.Vector;

public class Tables1kGCMExponentiator implements GCMExponentiator
{
    private Vector lookupPowX2;
    
    private void ensureAvailable(final int n) {
        int size = this.lookupPowX2.size();
        if (size <= n) {
            int[] clone = this.lookupPowX2.elementAt(size - 1);
            do {
                clone = Arrays.clone(clone);
                GCMUtil.multiply(clone, clone);
                this.lookupPowX2.addElement(clone);
            } while (++size <= n);
        }
    }
    
    @Override
    public void exponentiateX(long n, final byte[] array) {
        final int a = Tables8kGCMMultiplier.a;
        final int[] oneAsInts = GCMUtil.oneAsInts();
        int n2 = 0;
        while (n > 0L) {
            if ((0x1L & n) != 0x0L) {
                this.ensureAvailable(n2);
                GCMUtil.multiply(oneAsInts, (int[])this.lookupPowX2.elementAt(n2));
            }
            final int n3 = n2 + 1;
            n >>>= 1;
            if (a != 0) {
                break;
            }
            n2 = n3;
        }
        GCMUtil.asBytes(oneAsInts, array);
    }
    
    @Override
    public void init(final byte[] array) {
        final int[] ints = GCMUtil.asInts(array);
        if (this.lookupPowX2 != null && Arrays.areEqual(ints, this.lookupPowX2.elementAt(0))) {
            return;
        }
        (this.lookupPowX2 = new Vector(8)).addElement(ints);
    }
}
