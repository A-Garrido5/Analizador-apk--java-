// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import android.graphics.drawable.TransitionDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.annotation.TargetApi;
import android.animation.Animator$AnimatorListener;
import android.os.Build$VERSION;
import com.twitter.util.j;
import android.graphics.RectF;
import android.graphics.Rect;
import android.view.ViewPropertyAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ArgbEvaluator;
import android.graphics.Color;
import android.animation.ObjectAnimator;
import android.view.animation.Interpolator;
import android.view.View;

public class b
{
    public static ObjectAnimator a(final View view, final int n, final int n2, final int n3, final int n4, final Interpolator interpolator) {
        final ObjectAnimator ofInt = ObjectAnimator.ofInt((Object)view, "backgroundColor", new int[] { n, Color.argb(n2, Color.red(n), Color.green(n), Color.blue(n)) });
        ofInt.setEvaluator((TypeEvaluator)new ArgbEvaluator());
        ofInt.setDuration((long)n3);
        ofInt.setInterpolator((TimeInterpolator)interpolator);
        if (n4 != 0) {
            ofInt.setStartDelay((long)n4);
        }
        ofInt.start();
        return ofInt;
    }
    
    public static ObjectAnimator a(final View view, final int n, final int n2, final int n3, final Interpolator interpolator) {
        return a(view, n, n2, n3, 0, interpolator);
    }
    
    public static ViewPropertyAnimator a(final View view, final float n, final float pivotX, final float pivotY, final int n2, final Interpolator interpolator) {
        view.setPivotX(pivotX);
        view.setPivotY(pivotY);
        final ViewPropertyAnimator setInterpolator = view.animate().rotation(n).setDuration((long)n2).setInterpolator((TimeInterpolator)interpolator);
        setInterpolator.start();
        return setInterpolator;
    }
    
    public static ViewPropertyAnimator a(final View view, final float n, final float n2, final int n3, final Interpolator interpolator) {
        final ViewPropertyAnimator setInterpolator = view.animate().scaleX(n).scaleY(n2).setDuration((long)n3).setInterpolator((TimeInterpolator)interpolator);
        setInterpolator.start();
        return setInterpolator;
    }
    
    public static ViewPropertyAnimator a(final View view, final float n, final int n2, final Interpolator interpolator) {
        return a(view, n, view.getWidth() / 2, view.getHeight() / 2, n2, interpolator);
    }
    
    public static ViewPropertyAnimator a(final View view, final Rect rect, final Rect rect2, final int n, final Interpolator interpolator) {
        final float a = j.a(new RectF(rect), new RectF(rect2), true);
        return view.animate().setDuration((long)n).translationX((float)(rect2.centerX() - rect.centerX())).translationY((float)(rect2.centerY() - rect.centerY())).scaleX(a).scaleY(a).setInterpolator((TimeInterpolator)interpolator);
    }
    
    public static void a(final View view) {
        a(view, 150);
    }
    
    @TargetApi(16)
    public static void a(final View view, final int n) {
        if (view.getVisibility() == 0) {
            view.clearAnimation();
            final ViewPropertyAnimator animate = view.animate();
            if (Build$VERSION.SDK_INT >= 16) {
                animate.withLayer();
            }
            animate.alpha(0.0f).setDuration((long)n).setListener((Animator$AnimatorListener)new c(view));
        }
    }
    
    public static void a(final View view, final View view2) {
        a(view, view2, 150);
    }
    
    public static void a(final View view, final View view2, final int n) {
        a(view, n);
        b(view2, n);
    }
    
    public static void a(final ImageView imageView, final Bitmap bitmap) {
        if (bitmap != null) {
            a(imageView, (Drawable)new BitmapDrawable(imageView.getResources(), bitmap));
        }
    }
    
    public static void a(final ImageView imageView, final Drawable drawable) {
        a(imageView, drawable, 150);
    }
    
    public static void a(final ImageView imageView, final Drawable imageDrawable, final int n) {
        final Drawable drawable = imageView.getDrawable();
        if (drawable != null && imageDrawable != null && !drawable.getConstantState().equals(imageDrawable.getConstantState())) {
            final TransitionDrawable imageDrawable2 = new TransitionDrawable(new Drawable[] { drawable, imageDrawable });
            imageDrawable2.setCrossFadeEnabled(true);
            imageView.setImageDrawable((Drawable)imageDrawable2);
            imageDrawable2.startTransition(n);
            return;
        }
        imageView.setImageDrawable(imageDrawable);
    }
    
    public static ObjectAnimator[] a(final View view, final Rect rect, final int n, final Interpolator interpolator) {
        int i;
        ObjectAnimator[] array;
        ObjectAnimator objectAnimator;
        for (i = 0, array = new ObjectAnimator[] { ObjectAnimator.ofInt((Object)view, "left", new int[] { view.getLeft(), rect.left }).setDuration((long)n), ObjectAnimator.ofInt((Object)view, "top", new int[] { view.getTop(), rect.top }).setDuration((long)n), ObjectAnimator.ofInt((Object)view, "right", new int[] { view.getRight(), rect.right }).setDuration((long)n), ObjectAnimator.ofInt((Object)view, "bottom", new int[] { view.getBottom(), rect.bottom }).setDuration((long)n) }; i < array.length; ++i) {
            objectAnimator = array[i];
            objectAnimator.setInterpolator((TimeInterpolator)interpolator);
            objectAnimator.start();
        }
        return array;
    }
    
    public static ViewPropertyAnimator b(final View view, final float n, final float n2, final int n3, final Interpolator interpolator) {
        final ViewPropertyAnimator setInterpolator = view.animate().translationX(n).translationY(n2).setDuration((long)n3).setInterpolator((TimeInterpolator)interpolator);
        setInterpolator.start();
        return setInterpolator;
    }
    
    @TargetApi(16)
    public static ViewPropertyAnimator b(final View view, final float n, final int n2, final Interpolator interpolator) {
        final ViewPropertyAnimator animate = view.animate();
        if (Build$VERSION.SDK_INT >= 16) {
            animate.withLayer();
        }
        animate.alpha(n).setDuration((long)n2).setInterpolator((TimeInterpolator)interpolator);
        animate.start();
        return animate;
    }
    
    public static void b(final View view) {
        b(view, 150);
    }
    
    @TargetApi(16)
    public static void b(final View view, final int n) {
        if (view.getVisibility() != 0) {
            view.clearAnimation();
            view.setAlpha(0.0f);
            view.setVisibility(0);
            final ViewPropertyAnimator animate = view.animate();
            if (Build$VERSION.SDK_INT >= 16) {
                animate.withLayer();
            }
            animate.alpha(1.0f).setDuration((long)n).setListener((Animator$AnimatorListener)null);
        }
    }
}
