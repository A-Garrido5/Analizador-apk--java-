// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

class ag implements Runnable
{
    final /* synthetic */ boolean a;
    final /* synthetic */ ab b;
    
    ag(final ab b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.b.b.b(this.a);
    }
}
