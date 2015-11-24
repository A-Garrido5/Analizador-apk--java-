// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jce.provider;

import org.spongycastle.jcajce.provider.config.ProviderConfigurationPermission;
import java.security.Permission;

class b implements org.spongycastle.jcajce.provider.config.b
{
    private static Permission a;
    private static Permission b;
    private static Permission c;
    private static Permission d;
    private ThreadLocal e;
    private ThreadLocal f;
    
    static {
        org.spongycastle.jce.provider.b.a = new ProviderConfigurationPermission(BouncyCastleProvider.a, "threadLocalEcImplicitlyCa");
        org.spongycastle.jce.provider.b.b = new ProviderConfigurationPermission(BouncyCastleProvider.a, "ecImplicitlyCa");
        org.spongycastle.jce.provider.b.c = new ProviderConfigurationPermission(BouncyCastleProvider.a, "threadLocalDhDefaultParams");
        org.spongycastle.jce.provider.b.d = new ProviderConfigurationPermission(BouncyCastleProvider.a, "DhDefaultParams");
    }
    
    b() {
        this.e = new ThreadLocal();
        this.f = new ThreadLocal();
    }
}
