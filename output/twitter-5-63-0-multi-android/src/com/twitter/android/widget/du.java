// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import java.lang.ref.WeakReference;

class du implements Runnable
{
    private final WeakReference a;
    
    public du(final NewTweetBannerView newTweetBannerView) {
        this.a = new WeakReference((T)newTweetBannerView);
    }
    
    @Override
    public void run() {
        final NewTweetBannerView newTweetBannerView = (NewTweetBannerView)this.a.get();
        if (newTweetBannerView != null) {
            newTweetBannerView.a(false);
        }
    }
}
