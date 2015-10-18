// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.manager;

import com.twitter.internal.network.l;

public class ResourceResponse
{
    private final Object a;
    private final Object b;
    private final ResourceResponse$ResourceSource c;
    private final l d;
    
    public ResourceResponse(final Object a, final Object b, final ResourceResponse$ResourceSource c, final l d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public Object b() {
        return this.a;
    }
    
    public Object c() {
        return this.b;
    }
    
    public ResourceResponse$ResourceSource d() {
        return this.c;
    }
}
