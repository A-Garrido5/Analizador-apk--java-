// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

class aj implements Runnable
{
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ ab e;
    
    aj(final ab e, final int a, final int b, final boolean c, final boolean d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public void run() {
        this.e.b.a(this.a, this.b, this.c, this.d);
    }
}
