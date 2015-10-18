// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

class uc implements Runnable
{
    final /* synthetic */ TimelineFragment a;
    
    uc(final TimelineFragment a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.a(true);
    }
}
