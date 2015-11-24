// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.service;

import android.os.Binder;

public class h extends Binder
{
    final /* synthetic */ AuthTokenService a;
    
    public h(final AuthTokenService a) {
        this.a = a;
    }
    
    public AuthTokenService a() {
        return this.a;
    }
}
