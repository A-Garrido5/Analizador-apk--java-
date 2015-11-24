// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

class bj implements Runnable
{
    final /* synthetic */ TweetView a;
    
    public bj(final TweetView a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.l();
    }
}
