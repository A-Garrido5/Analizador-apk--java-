// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.ui.widget;

import android.graphics.Point;
import com.twitter.util.t;
import android.graphics.Canvas;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.ViewParent;
import android.view.View$MeasureSpec;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.content.res.TypedArray;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorInflater;
import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Build$VERSION;
import android.view.animation.Animation;
import android.view.WindowManager;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;
import android.app.Activity;
import android.view.animation.Animation$AnimationListener;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.widget.FrameLayout;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class aa extends AnimatorListenerAdapter
{
    private z a;
    
    private aa(final z a) {
        this.a = a;
    }
    
    public void onAnimationEnd(final Animator animator) {
        this.a.B = false;
        if (animator == this.a.z) {
            this.a.b();
        }
        else if (animator == this.a.A) {
            f(this.a);
        }
    }
    
    public void onAnimationStart(final Animator animator) {
        this.a.B = true;
        this.a.setVisibility(0);
    }
}
