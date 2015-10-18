// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto.paddings;

import java.security.SecureRandom;

public interface BlockCipherPadding
{
    int addPadding(final byte[] p0, final int p1);
    
    String getPaddingName();
    
    void init(final SecureRandom p0);
    
    int padCount(final byte[] p0);
}
