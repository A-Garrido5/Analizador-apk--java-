// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.view.animation.OvershootInterpolator;
import android.view.animation.AnticipateInterpolator;
import com.twitter.util.t;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
import android.content.res.TypedArray;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;

class c implements Animator$AnimatorListener
{
    final /* synthetic */ a a;
    
    public c(final a a) {
        this.a = a;
    }
    
    public void onAnimationCancel(final Animator animator) {
        this.a.a(1.0f);
        this.a.k = null;
        this.a.m = null;
    }
    
    public void onAnimationEnd(final Animator animator) {
        this.a.a(1.0f);
        this.a.k = null;
        this.a.m = null;
    }
    
    public void onAnimationRepeat(final Animator animator) {
    }
    
    public void onAnimationStart(final Animator animator) {
    }
}
