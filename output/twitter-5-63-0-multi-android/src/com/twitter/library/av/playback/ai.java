// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

class ai implements Runnable
{
    final /* synthetic */ aw a;
    final /* synthetic */ int b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ab d;
    
    ai(final ab d, final aw a, final int b, final boolean c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void run() {
        this.d.b.a(this.a, this.b, this.c);
    }
}
