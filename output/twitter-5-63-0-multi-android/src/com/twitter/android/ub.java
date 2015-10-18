// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

class ub implements Runnable
{
    final /* synthetic */ TimelineFragment a;
    
    ub(final TimelineFragment a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.a(true);
    }
}
