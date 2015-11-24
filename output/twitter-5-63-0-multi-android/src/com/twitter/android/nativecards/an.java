// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import android.content.Context;
import com.twitter.library.media.widget.AdaptiveTweetMediaView;
import com.twitter.library.widget.AspectRatioFrameLayout;
import com.twitter.android.av.t;
import com.twitter.library.experiments.b;
import android.view.ViewGroup;
import android.app.Activity;

public class an
{
    public ViewGroup a(final Activity activity) {
        final AspectRatioFrameLayout c = this.c(activity);
        if (!b.a() && !t.a()) {
            c.setAspectRatio(1.7777778f);
            c.setScaleMode(2);
        }
        return (ViewGroup)c;
    }
    
    public AdaptiveTweetMediaView b(final Activity activity) {
        return new AdaptiveTweetMediaView((Context)activity);
    }
    
    AspectRatioFrameLayout c(final Activity activity) {
        return new AspectRatioFrameLayout((Context)activity);
    }
}
