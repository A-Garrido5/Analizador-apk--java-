// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.network;

import java.net.URI;

public abstract class f
{
    protected final g a;
    
    public f(g a) {
        if (a == null) {
            a = new g();
        }
        this.a = a;
    }
    
    public abstract HttpOperation a(final HttpOperation$RequestMethod p0, final URI p1, final j p2);
    
    public abstract void a();
}
