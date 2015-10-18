// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.manager;

class w implements Runnable
{
    final /* synthetic */ al a;
    final /* synthetic */ ResourceResponse b;
    final /* synthetic */ v c;
    
    w(final v c, final al a, final ResourceResponse b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        this.a.a(this.b);
    }
}
