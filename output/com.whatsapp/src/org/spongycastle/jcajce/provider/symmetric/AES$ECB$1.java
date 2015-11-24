// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.AESFastEngine;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.jcajce.provider.symmetric.util.BlockCipherProvider;

class AES$ECB$1 implements BlockCipherProvider
{
    @Override
    public BlockCipher get() {
        return new AESFastEngine();
    }
}
