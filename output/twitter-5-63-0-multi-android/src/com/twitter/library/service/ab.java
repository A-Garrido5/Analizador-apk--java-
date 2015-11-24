// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.service;

import com.twitter.library.client.Session;
import com.twitter.library.network.OAuthToken;

public final class ab
{
    public final String a;
    public final boolean b;
    public final long c;
    public final OAuthToken d;
    public final String e;
    
    public ab(final long c, final String e, final OAuthToken d, final boolean b) {
        this.a = null;
        this.c = c;
        this.e = e;
        this.d = d;
        this.b = b;
    }
    
    public ab(final Session session) {
        this.a = session.c();
        this.c = session.g();
        this.d = session.h();
        this.e = session.e();
        this.b = session.d();
    }
    
    public boolean a(final Session session) {
        return session.c().equals(this.a);
    }
}
