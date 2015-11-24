// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.card.i;

class bn implements Runnable
{
    final /* synthetic */ i a;
    final /* synthetic */ bl b;
    
    bn(final bl b, final i a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.b.add((Object)this.a);
    }
}
