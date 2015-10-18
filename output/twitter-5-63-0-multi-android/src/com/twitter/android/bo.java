// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

class bo implements Runnable
{
    final /* synthetic */ bl a;
    
    bo(final bl a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.clear();
    }
}
