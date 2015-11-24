// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av;

class ah implements Runnable
{
    final /* synthetic */ VideoPlayerView a;
    
    ah(final VideoPlayerView a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.d();
    }
}
