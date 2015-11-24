// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.view.ViewGroup$LayoutParams;
import com.twitter.internal.android.widget.TypefacesTextView;
import android.widget.RelativeLayout$LayoutParams;
import android.view.View;
import android.os.Handler;
import android.content.res.TypedArray;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.RelativeLayout;
import android.view.animation.Animation;
import com.twitter.library.util.f;

class r extends f
{
    final /* synthetic */ FadeInTextView a;
    
    r(final FadeInTextView a) {
        this.a = a;
    }
    
    @Override
    public void onAnimationEnd(final Animation animation) {
        if (this.a.c) {
            this.a.c();
        }
    }
    
    @Override
    public void onAnimationStart(final Animation animation) {
        this.a.getChildAt(this.a.b).setVisibility(0);
    }
}
