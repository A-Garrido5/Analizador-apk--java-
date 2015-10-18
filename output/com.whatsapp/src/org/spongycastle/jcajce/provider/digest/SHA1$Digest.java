// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.SHA1Digest;

public class SHA1$Digest extends BCMessageDigest implements Cloneable
{
    public SHA1$Digest() {
        super(new SHA1Digest());
    }
    
    @Override
    public Object clone() {
        final SHA1$Digest sha1$Digest = (SHA1$Digest)super.clone();
        sha1$Digest.digest = new SHA1Digest((SHA1Digest)this.digest);
        return sha1$Digest;
    }
}
