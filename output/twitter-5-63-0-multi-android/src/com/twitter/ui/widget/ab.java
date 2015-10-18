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
import android.view.WindowManager;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;
import android.app.Activity;
import android.animation.Animator;
import android.view.animation.Animation$AnimationListener;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.widget.FrameLayout;
import android.view.animation.Animation;
import java.lang.ref.WeakReference;

class ab implements Runnable
{
    private WeakReference a;
    
    private ab(final z z) {
        this.a = new WeakReference((T)z);
    }
    
    @Override
    public void run() {
        final z z = (z)this.a.get();
        if (z != null) {
            if (!com.twitter.ui.widget.z.a) {
                z.x = (Animation)z.b(true);
                z.startAnimation(z.x);
                z.setVisibility(0);
                return;
            }
            z.z.start();
        }
    }
}
