// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto.modes.gcm;

import org.spongycastle.util.Arrays;

public class BasicGCMMultiplier implements GCMMultiplier
{
    private byte[] H;
    
    @Override
    public void init(final byte[] array) {
        this.H = Arrays.clone(array);
    }
    
    @Override
    public void multiplyH(final byte[] array) {
        GCMUtil.multiply(array, this.H);
    }
}
