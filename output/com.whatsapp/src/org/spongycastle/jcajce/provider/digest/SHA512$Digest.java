// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.SHA512Digest;

public class SHA512$Digest extends BCMessageDigest implements Cloneable
{
    public SHA512$Digest() {
        super(new SHA512Digest());
    }
    
    @Override
    public Object clone() {
        final SHA512$Digest sha512$Digest = (SHA512$Digest)super.clone();
        sha512$Digest.digest = new SHA512Digest((SHA512Digest)this.digest);
        return sha512$Digest;
    }
}
