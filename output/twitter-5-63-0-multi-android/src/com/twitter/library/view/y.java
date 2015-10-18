// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.view;

import android.view.View;

class y implements Runnable
{
    final /* synthetic */ TweetHeaderView a;
    
    y(final TweetHeaderView a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.a.onClick((View)this.a);
    }
}
