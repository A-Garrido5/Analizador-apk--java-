// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

class bm implements Runnable
{
    final /* synthetic */ bl a;
    
    bm(final bl a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.b();
    }
}
