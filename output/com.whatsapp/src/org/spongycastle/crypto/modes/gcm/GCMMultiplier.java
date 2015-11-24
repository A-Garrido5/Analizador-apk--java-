// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto.modes.gcm;

public interface GCMMultiplier
{
    void init(final byte[] p0);
    
    void multiplyH(final byte[] p0);
}
