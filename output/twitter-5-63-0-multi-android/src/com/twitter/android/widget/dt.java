// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.text.TextUtils;
import android.support.annotation.StringRes;
import android.view.View$OnClickListener;
import com.twitter.library.util.bk;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;
import android.view.View;
import android.widget.LinearLayout;
import android.view.animation.Animation;
import com.twitter.library.util.f;

class dt extends f
{
    final /* synthetic */ NewTweetBannerView a;
    private final boolean b;
    
    dt(final NewTweetBannerView a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void onAnimationEnd(final Animation animation) {
        if (this.b) {
            this.a.setVisibility(0);
            if (this.a.a == null) {
                this.a.a = new du(this.a);
            }
            this.a.postDelayed(this.a.a, this.a.c);
            return;
        }
        this.a.removeCallbacks(this.a.a);
        this.a.setVisibility(8);
    }
}
