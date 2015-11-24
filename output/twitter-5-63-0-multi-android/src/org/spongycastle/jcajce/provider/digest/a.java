// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.asn1.l;

abstract class a extends aad
{
    protected void a(final org.spongycastle.jcajce.provider.config.a a, final String s, final String s2, final String s3) {
        final String string = "HMAC" + s;
        a.a("Mac." + string, s2);
        a.a("Alg.Alias.Mac.HMAC-" + s, string);
        a.a("Alg.Alias.Mac.HMAC/" + s, string);
        a.a("KeyGenerator." + string, s3);
        a.a("Alg.Alias.KeyGenerator.HMAC-" + s, string);
        a.a("Alg.Alias.KeyGenerator.HMAC/" + s, string);
    }
    
    protected void a(final org.spongycastle.jcajce.provider.config.a a, final String s, final l l) {
        final String string = "HMAC" + s;
        a.a("Alg.Alias.Mac." + l, string);
        a.a("Alg.Alias.KeyGenerator." + l, string);
    }
}
