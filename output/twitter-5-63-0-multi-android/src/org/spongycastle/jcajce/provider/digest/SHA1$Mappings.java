// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.digest;

public class SHA1$Mappings extends a
{
    private static final String a;
    
    static {
        a = SHA1.class.getName();
    }
    
    @Override
    public void a(final org.spongycastle.jcajce.provider.config.a a) {
        a.a("MessageDigest.SHA-1", SHA1$Mappings.a + "$Digest");
        a.a("Alg.Alias.MessageDigest.SHA1", "SHA-1");
        a.a("Alg.Alias.MessageDigest.SHA", "SHA-1");
        a.a("Alg.Alias.MessageDigest." + zg.i, "SHA-1");
        this.a(a, "SHA1", SHA1$Mappings.a + "$HashMac", SHA1$Mappings.a + "$KeyGenerator");
        this.a(a, "SHA1", zh.H);
        this.a(a, "SHA1", zf.c);
    }
}
