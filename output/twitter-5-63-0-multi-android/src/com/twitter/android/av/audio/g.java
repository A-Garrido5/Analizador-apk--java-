// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av.audio;

class g implements Runnable
{
    final /* synthetic */ f a;
    
    g(final f a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.b.finish();
        this.a.b.overridePendingTransition(0, 2131034144);
    }
}
