// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

class ar implements Runnable
{
    final /* synthetic */ Runnable a;
    final /* synthetic */ long b;
    final /* synthetic */ aq c;
    
    ar(final aq c, final Runnable a, final long b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        this.a.run();
        this.c.b(this.b);
    }
}
