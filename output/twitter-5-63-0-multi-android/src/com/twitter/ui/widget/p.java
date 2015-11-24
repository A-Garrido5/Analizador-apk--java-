// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.ui.widget;

import android.content.res.Resources;
import android.animation.Animator$AnimatorListener;
import android.text.TextUtils;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.text.format.Time;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;

class p implements ValueAnimator$AnimatorUpdateListener
{
    final /* synthetic */ PromptView a;
    
    p(final PromptView a) {
        this.a = a;
    }
    
    public void onAnimationUpdate(final ValueAnimator valueAnimator) {
        final float floatValue = (float)valueAnimator.getAnimatedValue();
        this.a.getLayoutParams().height = (int)(floatValue * this.a.h);
        this.a.setAlpha(floatValue);
        this.a.requestLayout();
    }
}
