// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto;

public interface Mac
{
    int doFinal(final byte[] p0, final int p1);
    
    String getAlgorithmName();
    
    int getMacSize();
    
    void init(final CipherParameters p0);
    
    void reset();
    
    void update(final byte p0);
    
    void update(final byte[] p0, final int p1, final int p2);
}
