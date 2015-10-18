// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

class an implements Runnable
{
    final /* synthetic */ int a;
    final /* synthetic */ ab b;
    
    an(final ab b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.b.b.a(this.a);
    }
}
