// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.SHA256Digest;

public class SHA256$Digest extends BCMessageDigest implements Cloneable
{
    public SHA256$Digest() {
        super(new SHA256Digest());
    }
    
    @Override
    public Object clone() {
        final SHA256$Digest sha256$Digest = (SHA256$Digest)super.clone();
        sha256$Digest.digest = new SHA256Digest((SHA256Digest)this.digest);
        return sha256$Digest;
    }
}
