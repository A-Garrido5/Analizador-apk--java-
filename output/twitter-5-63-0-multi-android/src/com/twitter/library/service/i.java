// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.service;

class i implements Runnable
{
    final /* synthetic */ AuthTokenService a;
    private final String b;
    private final String c;
    private final j d;
    private final String e;
    
    public i(final AuthTokenService a, final j d, final String c, final String b, final String e) {
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
        this.e = e;
    }
    
    @Override
    public void run() {
        this.a.b(this.d, this.c, this.b, this.e);
    }
}
