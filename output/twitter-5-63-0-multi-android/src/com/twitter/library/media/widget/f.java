// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.widget;

import com.twitter.library.client.App;
import com.twitter.errorreporter.ErrorReporter;
import android.view.MotionEvent;
import android.graphics.Canvas;
import com.twitter.util.j;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.graphics.Rect;
import com.twitter.library.media.util.m;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Bitmap;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.animation.ValueAnimator;
import java.lang.ref.WeakReference;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.AnimatorListenerAdapter;

abstract class f extends AnimatorListenerAdapter implements ValueAnimator$AnimatorUpdateListener
{
    private final WeakReference a;
    private ValueAnimator b;
    
    public f(final CroppableImageView croppableImageView) {
        this.a = new WeakReference((T)croppableImageView);
    }
    
    public void a() {
        this.b.start();
    }
    
    protected void a(final ValueAnimator b) {
        b.setInterpolator((TimeInterpolator)new DecelerateInterpolator());
        b.addUpdateListener((ValueAnimator$AnimatorUpdateListener)this);
        b.addListener((Animator$AnimatorListener)this);
        this.b = b;
    }
    
    protected CroppableImageView b() {
        final CroppableImageView croppableImageView = (CroppableImageView)this.a.get();
        if (croppableImageView == null) {
            this.b.cancel();
        }
        return croppableImageView;
    }
    
    public void onAnimationEnd(final Animator animator) {
        final CroppableImageView croppableImageView = (CroppableImageView)this.a.get();
        if (croppableImageView == null) {
            this.b.cancel();
            return;
        }
        croppableImageView.setAnimating(false);
    }
    
    public void onAnimationStart(final Animator animator) {
        final CroppableImageView croppableImageView = (CroppableImageView)this.a.get();
        if (croppableImageView == null) {
            this.b.cancel();
            return;
        }
        croppableImageView.setAnimating(true);
    }
}
