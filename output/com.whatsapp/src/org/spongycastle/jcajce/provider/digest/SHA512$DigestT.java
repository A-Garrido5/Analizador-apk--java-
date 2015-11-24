// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.SHA512tDigest;

public class SHA512$DigestT extends BCMessageDigest implements Cloneable
{
    public SHA512$DigestT(final int n) {
        super(new SHA512tDigest(n));
    }
    
    @Override
    public Object clone() {
        final SHA512$DigestT sha512$DigestT = (SHA512$DigestT)super.clone();
        sha512$DigestT.digest = new SHA512tDigest((SHA512tDigest)this.digest);
        return sha512$DigestT;
    }
}
