// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.util.t;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import com.twitter.internal.android.widget.RectLayoutParams;
import android.view.MotionEvent;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.view.animation.OvershootInterpolator;
import com.twitter.util.g;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;

class bo implements ValueAnimator$AnimatorUpdateListener
{
    final /* synthetic */ DraggableHeaderLayout a;
    
    bo(final DraggableHeaderLayout a) {
        this.a = a;
    }
    
    public void onAnimationUpdate(final ValueAnimator valueAnimator) {
        this.a.i = (int)valueAnimator.getAnimatedValue();
        this.a.requestLayout();
    }
}
