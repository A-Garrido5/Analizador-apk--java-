// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.network;

import java.net.URI;

public abstract class h
{
    public final HttpOperation a(final HttpOperation$RequestMethod httpOperation$RequestMethod, final URI uri, final j j) {
        return this.a(httpOperation$RequestMethod, uri).a(httpOperation$RequestMethod, uri, j);
    }
    
    public abstract f a(final HttpOperation$RequestMethod p0, final URI p1);
    
    public abstract void a();
}
