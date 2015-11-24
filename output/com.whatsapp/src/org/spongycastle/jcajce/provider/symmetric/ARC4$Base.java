// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.engines.RC4Engine;
import org.spongycastle.jcajce.provider.symmetric.util.BaseStreamCipher;

public class ARC4$Base extends BaseStreamCipher
{
    public ARC4$Base() {
        super(new RC4Engine(), 0);
    }
}
