// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.MD5Digest;

public class MD5$Digest extends BCMessageDigest implements Cloneable
{
    public MD5$Digest() {
        super(new MD5Digest());
    }
    
    @Override
    public Object clone() {
        final MD5$Digest md5$Digest = (MD5$Digest)super.clone();
        md5$Digest.digest = new MD5Digest((MD5Digest)this.digest);
        return md5$Digest;
    }
}
