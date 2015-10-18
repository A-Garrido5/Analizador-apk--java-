// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

class ac implements Runnable
{
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ ab c;
    
    ac(final ab c, final int a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        this.c.b.a(this.a, this.b);
    }
}
