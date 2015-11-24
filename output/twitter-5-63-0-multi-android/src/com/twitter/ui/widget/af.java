// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.ui.widget;

import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.support.v4.view.ViewCompat;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Style;
import java.util.Iterator;
import android.view.animation.LinearInterpolator;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.HashMap;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Map;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Paint;
import android.view.View;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class af extends AnimatorListenerAdapter
{
    final /* synthetic */ TwitterIndeterminateProgressSpinner a;
    
    af(final TwitterIndeterminateProgressSpinner a) {
        this.a = a;
    }
    
    public void onAnimationEnd(final Animator animator) {
        if (this.a.l) {
            this.a.d.get(2).start();
        }
    }
}
