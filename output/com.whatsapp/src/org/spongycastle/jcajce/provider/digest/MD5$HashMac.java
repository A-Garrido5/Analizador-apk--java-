// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.crypto.digests.MD5Digest;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

public class MD5$HashMac extends BaseMac
{
    public MD5$HashMac() {
        super(new HMac(new MD5Digest()));
    }
}
