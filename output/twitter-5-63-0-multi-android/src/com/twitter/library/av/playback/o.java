// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

class o implements Runnable
{
    final /* synthetic */ AVPlayer$PlayerStartType a;
    final /* synthetic */ l b;
    
    o(final l b, final AVPlayer$PlayerStartType a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.b.a.a(this.a);
    }
}
