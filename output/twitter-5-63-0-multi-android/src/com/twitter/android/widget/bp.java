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
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.view.animation.OvershootInterpolator;
import android.animation.ValueAnimator;
import com.twitter.util.g;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class bp extends AnimatorListenerAdapter
{
    final /* synthetic */ DraggableHeaderLayout a;
    
    bp(final DraggableHeaderLayout a) {
        this.a = a;
    }
    
    public void onAnimationEnd(final Animator animator) {
        this.a.r = false;
    }
}
