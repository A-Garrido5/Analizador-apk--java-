// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

class m implements Runnable
{
    final /* synthetic */ l a;
    
    m(final l a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (!this.a.b.o() || this.a.f.get()) {
            return;
        }
        this.a.a.a(this.a.b.u());
    }
}
