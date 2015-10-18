// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.animation.ObjectAnimator;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.webkit.WebChromeClient;

public class b extends WebChromeClient
{
    private final ProgressBar a;
    
    public b(final ProgressBar a) {
        this.a = a;
    }
    
    public final void onProgressChanged(final WebView webView, final int n) {
        final ObjectAnimator setDuration = ObjectAnimator.ofInt((Object)this.a, "progress", new int[] { this.a.getProgress() % 100, n }).setDuration(250L);
        setDuration.setInterpolator((TimeInterpolator)new DecelerateInterpolator());
        setDuration.start();
    }
}
