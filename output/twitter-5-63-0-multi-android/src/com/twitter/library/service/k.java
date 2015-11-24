// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.service;

import com.twitter.library.network.OAuthToken;

class k implements Runnable
{
    private final j a;
    private final OAuthToken b;
    private final int c;
    private final String d;
    private final long e;
    
    public k(final j a, final int c, final OAuthToken b, final String d, final long e) {
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public void run() {
        this.a.a(this.c, this.b, this.d, this.e);
    }
}
