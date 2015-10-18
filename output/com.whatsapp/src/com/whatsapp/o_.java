// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.transition.TransitionValues;
import android.view.ViewGroup;
import android.util.Property;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.util.FloatMath;
import android.animation.AnimatorSet;
import android.animation.Animator$AnimatorListener;
import android.view.ViewAnimationUtils;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.view.View;
import android.graphics.Rect;
import android.transition.Visibility;

public class o_ extends Visibility
{
    private static long a;
    public static int c;
    private final Rect b;
    
    static {
        o_.a = 1L;
    }
    
    public o_(final View view) {
        final int c = o_.c;
        this.b = new Rect();
        final int[] array = new int[2];
        view.getLocationInWindow(array);
        this.b.set(array[0], array[1], array[0] + view.getWidth(), array[1] + view.getHeight());
        if (c != 0) {
            final boolean h = DialogToastActivity.h;
            boolean h2 = false;
            if (!h) {
                h2 = true;
            }
            DialogToastActivity.h = h2;
        }
    }
    
    private Animator a(final View view, final float translationX, final float translationY, final float n, final float n2, final boolean b) {
        final int c = o_.c;
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        if (translationX != n || translationY != n2) {
            final int measuredWidth = view.getMeasuredWidth();
            final int measuredHeight = view.getMeasuredHeight();
            float max = Math.max(this.b.width() / measuredWidth, this.b.height() / measuredHeight);
            final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)view, View.TRANSLATION_X, View.TRANSLATION_Y, this.getPathMotion().getPath(translationX, translationY, n, n2));
            final Property scale_X = View.SCALE_X;
            final float[] array = new float[2];
            float n3;
            if (b) {
                n3 = max;
            }
            else {
                n3 = 1.0f;
            }
            array[0] = n3;
            float n4;
            if (b) {
                n4 = 1.0f;
            }
            else {
                n4 = max;
            }
            array[1] = n4;
            final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)view, scale_X, array);
            final Property scale_Y = View.SCALE_Y;
            final float[] array2 = new float[2];
            float n5;
            if (b) {
                n5 = max;
            }
            else {
                n5 = 1.0f;
            }
            array2[0] = n5;
            if (b) {
                max = 1.0f;
            }
            array2[1] = max;
            final ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((Object)view, scale_Y, array2);
            final oo oo = new oo(ViewAnimationUtils.createCircularReveal(view, measuredWidth / 2, measuredHeight / 2, (float)(measuredHeight / 2), (float)(measuredHeight / 2)));
            view.setAlpha(0.0f);
            oo.addListener((Animator$AnimatorListener)new ats(this, view, b));
            final AnimatorSet set = new AnimatorSet();
            set.playTogether(new Animator[] { ofFloat, oo, ofFloat2, ofFloat3 });
            set.setInterpolator(this.getInterpolator());
            set.setDuration(200L * o_.a);
            float n6 = 0.0f;
            float n7 = 0.0f;
            Label_0401: {
                if (b) {
                    n6 = measuredHeight / 2;
                    n7 = FloatMath.sqrt((float)(measuredWidth * measuredWidth + measuredHeight * measuredHeight)) / 2.0f;
                    set.setInterpolator((TimeInterpolator)new AccelerateInterpolator());
                    if (c == 0) {
                        break Label_0401;
                    }
                }
                n6 = FloatMath.sqrt((float)(measuredWidth * measuredWidth + measuredHeight * measuredHeight)) / 2.0f;
                n7 = measuredHeight / 2;
                set.setInterpolator((TimeInterpolator)new DecelerateInterpolator());
            }
            final oo oo2 = new oo(ViewAnimationUtils.createCircularReveal(view, measuredWidth / 2, measuredHeight / 2, n6, n7));
            oo2.addListener((Animator$AnimatorListener)new vm(this, view, b));
            oo2.setDuration(100L * o_.a);
            final AnimatorSet set2 = new AnimatorSet();
            if (b) {
                oo2.setInterpolator((TimeInterpolator)new DecelerateInterpolator());
                set2.play((Animator)set);
                set2.play((Animator)oo2).after((Animator)set);
                if (c == 0) {
                    return (Animator)set2;
                }
            }
            oo2.setInterpolator((TimeInterpolator)new AccelerateInterpolator());
            set2.play((Animator)oo2);
            set2.play((Animator)set).after((Animator)oo2);
            return (Animator)set2;
        }
        final AnimatorSet set2 = null;
        return (Animator)set2;
    }
    
    public Animator onAppear(final ViewGroup viewGroup, final View view, final TransitionValues transitionValues, final TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        final int[] array = new int[2];
        view.getLocationInWindow(array);
        final Rect rect = new Rect();
        rect.set(array[0], array[1], array[0] + view.getWidth(), array[1] + view.getHeight());
        return this.a(view, this.b.centerX() - rect.centerX(), this.b.centerY() - rect.centerY(), view.getTranslationX(), view.getTranslationY(), true);
    }
    
    public Animator onDisappear(final ViewGroup viewGroup, final View view, final TransitionValues transitionValues, final TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        final int[] array = new int[2];
        view.getLocationInWindow(array);
        final Rect rect = new Rect();
        rect.set(array[0], array[1], array[0] + view.getWidth(), array[1] + view.getHeight());
        return this.a(view, view.getTranslationX(), view.getTranslationY(), this.b.centerX() - rect.centerX(), this.b.centerY() - rect.centerY(), false);
    }
}
