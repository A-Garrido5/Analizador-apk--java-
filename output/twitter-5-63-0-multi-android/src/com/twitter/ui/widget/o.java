// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.ui.widget;

import android.content.res.Resources;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.Button;
import android.text.format.Time;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout;
import android.view.View;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class o extends AnimatorListenerAdapter
{
    final /* synthetic */ PromptView a;
    
    o(final PromptView a) {
        this.a = a;
    }
    
    public void onAnimationEnd(final Animator animator) {
        this.a.b();
        this.a.setAlpha(1.0f);
        this.a.getLayoutParams().height = this.a.h;
        this.a.a((View)this.a.getPromptHeader());
        this.a.a((View)this.a.getPromptSubtitle());
        this.a.a((View)this.a.getPromptButton());
    }
}
