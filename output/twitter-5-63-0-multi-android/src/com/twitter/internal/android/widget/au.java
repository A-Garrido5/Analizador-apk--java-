// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.graphics.Canvas;
import android.text.TextUtils;
import java.util.Locale;
import android.graphics.Color;
import android.text.TextUtils$TruncateAt;
import android.text.Layout$Alignment;
import com.twitter.android.util.p;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.twitter.ui.widget.ag;
import com.twitter.util.t;
import android.content.res.TypedArray;
import com.twitter.util.a;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Typeface;
import android.content.res.ColorStateList;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.text.StaticLayout;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;

class au implements Animator$AnimatorListener
{
    final /* synthetic */ ToolBarHomeView a;
    
    au(final ToolBarHomeView a) {
        this.a = a;
    }
    
    public void onAnimationCancel(final Animator animator) {
        this.a.I = false;
    }
    
    public void onAnimationEnd(final Animator animator) {
        this.a.J = false;
        if (this.a.I) {
            this.a.l = null;
            this.a.m = null;
            this.a.requestLayout();
            this.a.setContentDescription((CharSequence)null);
        }
    }
    
    public void onAnimationRepeat(final Animator animator) {
    }
    
    public void onAnimationStart(final Animator animator) {
    }
}
