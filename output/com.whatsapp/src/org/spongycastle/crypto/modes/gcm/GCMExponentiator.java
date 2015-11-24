// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto.modes.gcm;

public interface GCMExponentiator
{
    void exponentiateX(final long p0, final byte[] p1);
    
    void init(final byte[] p0);
}
