// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

public class AES$ECB extends BaseBlockCipher
{
    public AES$ECB() {
        super(new AES$ECB$1());
    }
}
