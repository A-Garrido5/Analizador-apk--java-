// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jce.provider;

import org.spongycastle.asn1.l;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Map;
import org.spongycastle.jcajce.provider.config.b;
import java.security.Provider;
import java.security.PrivilegedAction;

class a implements PrivilegedAction
{
    final /* synthetic */ BouncyCastleProvider a;
    
    a(final BouncyCastleProvider a) {
        this.a = a;
    }
    
    @Override
    public Object run() {
        this.a.a();
        return null;
    }
}
