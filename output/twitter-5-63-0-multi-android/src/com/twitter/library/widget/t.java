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

class t extends f
{
    final /* synthetic */ FadeInTextView a;
    
    t(final FadeInTextView a) {
        this.a = a;
    }
    
    @Override
    public void onAnimationEnd(final Animation animation) {
        if (this.a.b == -1 + this.a.a.length && this.a.h != null) {
            this.a.h.a();
        }
        if (this.a.c) {
            this.a.getChildAt(this.a.b).setVisibility(4);
            this.a.b++;
            this.a.c = false;
            this.a.a();
        }
    }
}
