// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

class ur implements Runnable
{
    final /* synthetic */ uq a;
    
    ur(final uq a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.a.getLayoutParams().height = this.a.g;
        this.a.a.setHasTransientState(false);
    }
}
