// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

import java.util.concurrent.atomic.AtomicInteger;

class q
{
    public final AVPlayer a;
    public final AtomicInteger b;
    
    q(final AVPlayer a, final int n) {
        this.a = a;
        this.b = new AtomicInteger(n);
    }
}
