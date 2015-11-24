// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.library.util.f;

class p extends f
{
    final /* synthetic */ MediaImageView a;
    final /* synthetic */ ImageView b;
    final /* synthetic */ FilterFilmstripView c;
    
    p(final FilterFilmstripView c, final MediaImageView a, final ImageView b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void onAnimationEnd(final Animation animation) {
        this.a.removeView((View)this.b);
    }
}
