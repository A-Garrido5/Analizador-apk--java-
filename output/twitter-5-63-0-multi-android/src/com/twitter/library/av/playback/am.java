// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

class am implements Runnable
{
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ ab c;
    
    am(final ab c, final int a, final String b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        this.c.b.a(this.a, this.b);
    }
}
