// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

class ao implements Runnable
{
    final /* synthetic */ AVPlayer$PlayerStartType a;
    final /* synthetic */ ab b;
    
    ao(final ab b, final AVPlayer$PlayerStartType a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.b.b.a(this.a);
    }
}
