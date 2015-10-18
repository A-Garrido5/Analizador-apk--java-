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
import android.animation.Animator$AnimatorListener;
import com.twitter.ui.widget.ag;
import com.twitter.util.t;
import android.content.res.TypedArray;
import com.twitter.util.a;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Point;
import android.text.StaticLayout;
import android.graphics.Typeface;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;

class ax implements ValueAnimator$AnimatorUpdateListener
{
    final /* synthetic */ ToolBarHomeView a;
    
    ax(final ToolBarHomeView a) {
        this.a = a;
    }
    
    public void onAnimationUpdate(final ValueAnimator valueAnimator) {
        this.a.P = (int)valueAnimator.getAnimatedValue();
        this.a.invalidate();
    }
}
