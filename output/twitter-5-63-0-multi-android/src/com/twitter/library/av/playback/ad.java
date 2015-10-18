// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

class ad implements Runnable
{
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ ab c;
    
    ad(final ab c, final int a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        this.c.b.b(this.a, this.b);
        if (701 == this.a) {
            this.c.c.a("buffer");
        }
    }
}
