// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

import com.twitter.library.av.l;

class s implements Runnable
{
    final /* synthetic */ l a;
    final /* synthetic */ int b;
    final /* synthetic */ AVPlayer c;
    
    s(final AVPlayer c, final l a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        if (this.a != null) {
            this.a.a(this.b);
        }
    }
}
