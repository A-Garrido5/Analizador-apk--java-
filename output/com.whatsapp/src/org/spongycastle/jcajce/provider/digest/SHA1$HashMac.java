// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

public class SHA1$HashMac extends BaseMac
{
    public SHA1$HashMac() {
        super(new HMac(new SHA1Digest()));
    }
}
