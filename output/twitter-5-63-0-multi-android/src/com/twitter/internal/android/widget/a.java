// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.view.animation.OvershootInterpolator;
import android.view.animation.AnticipateInterpolator;
import com.twitter.util.t;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.Animator$AnimatorListener;
import android.view.animation.Interpolator;
import android.content.res.TypedArray;
import android.content.Context;
import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.view.View;

class a
{
    private final View a;
    private final int b;
    private final int c;
    private final float d;
    private final int e;
    private final int f;
    private final int g;
    private final Drawable h;
    private int i;
    private int j;
    private ah k;
    private float l;
    private Animator m;
    
    public a(final View a, final Context context, final int n) {
        this.l = 1.0f;
        this.a = a;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(n, li.BadgeIndicator);
        this.b = obtainStyledAttributes.getResourceId(li.BadgeIndicator_numberBackground, 0);
        this.c = obtainStyledAttributes.getColor(li.BadgeIndicator_numberColor, -1);
        this.d = obtainStyledAttributes.getDimension(li.BadgeIndicator_numberTextSize, 0.0f);
        this.f = obtainStyledAttributes.getDimensionPixelSize(li.BadgeIndicator_numberMinHeight, 0);
        this.e = obtainStyledAttributes.getDimensionPixelSize(li.BadgeIndicator_numberMinWidth, 0);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(li.BadgeIndicator_indicatorMarginBottom, -1);
        this.h = obtainStyledAttributes.getDrawable(li.BadgeIndicator_indicatorDrawable);
        this.i = obtainStyledAttributes.getInt(li.BadgeIndicator_badgeMode, 0);
        obtainStyledAttributes.recycle();
    }
    
    private Animator a(final float n, final float n2, final long duration, final Interpolator interpolator, final Animator$AnimatorListener animator$AnimatorListener) {
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { n, n2 });
        ofFloat.setInterpolator((TimeInterpolator)interpolator);
        ofFloat.setDuration(duration);
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new b(this));
        ofFloat.addListener(animator$AnimatorListener);
        return (Animator)ofFloat;
    }
    
    private void d() {
        if (this.m != null && this.m.isRunning()) {
            this.m.cancel();
        }
    }
    
    void a(final float l) {
        this.l = l;
        this.a.invalidate();
    }
    
    public void a(final int i) {
        this.i = i;
    }
    
    public void a(final Canvas canvas) {
        if (this.i == 2 || this.i == 3) {
            if (this.k != null) {
                if (this.m != null && !this.m.isRunning()) {
                    this.m.start();
                }
                final Rect bounds = this.k.getBounds();
                final float l = this.l;
                final int save = canvas.save(1);
                canvas.scale(l, l, bounds.exactCenterX(), bounds.exactCenterY());
                this.k.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        else if (this.i == 1 && this.h != null && this.j > 0) {
            this.h.draw(canvas);
        }
    }
    
    public void a(final boolean b, final int n, final int n2, final int n3, final int n4, final Rect rect, final int n5) {
        if (this.i == 2 || this.i == 3) {
            final ah k = this.k;
            if (k != null) {
                final int max = Math.max(k.getIntrinsicWidth(), this.e);
                final int max2 = Math.max(k.getIntrinsicHeight(), this.f);
                int min;
                if (lk.a() == lh.SeamfulToolbarEnabledStyle) {
                    min = n3 - n - max - this.e / 4;
                }
                else {
                    min = n3 - n - max;
                }
                int top;
                if (rect != null) {
                    top = rect.top;
                    min = Math.min(rect.right - max / 2, min);
                }
                else {
                    top = 0;
                }
                k.setBounds(min, top, max + min, max2 + top);
            }
        }
        else if (this.i == 1) {
            final Drawable h = this.h;
            if (h != null) {
                final int intrinsicWidth = h.getIntrinsicWidth();
                final int intrinsicHeight = h.getIntrinsicHeight();
                final int a = t.a(n3 - n, intrinsicWidth);
                int n6;
                if (this.g != -1) {
                    n6 = n4 - n2 - this.a.getPaddingBottom() - this.g - intrinsicHeight;
                }
                else {
                    n6 = n5 + t.a(n4 - n5 - this.a.getPaddingBottom(), intrinsicHeight);
                }
                h.setBounds(a, n6, intrinsicWidth + a, intrinsicHeight + n6);
            }
        }
    }
    
    boolean a() {
        return this.j > 0 || this.i == 3;
    }
    
    protected boolean a(final Drawable drawable) {
        return drawable == this.k || drawable == this.h;
    }
    
    protected void b() {
        if (this.h != null && this.h.isStateful()) {
            this.h.setState(this.a.getDrawableState());
        }
    }
    
    public void b(final int n) {
        if (this.j != n) {
            if (this.i == 2 || this.i == 3) {
                final int j = this.j;
                this.j = n;
                if (!this.a()) {
                    this.d();
                    this.m = this.a(1.0f, 0.0f, 200L, (Interpolator)new AnticipateInterpolator(), (Animator$AnimatorListener)new c(this));
                }
                else {
                    final Context context = this.a.getContext();
                    if (this.k == null) {
                        (this.k = new ah(context)).a(this.c);
                        this.k.a(this.d);
                        if (this.b != 0) {
                            this.k.a(context.getResources().getDrawable(this.b));
                        }
                    }
                    if (this.i == 3) {
                        this.k.a(context, "\u2605");
                    }
                    else if (n <= 20) {
                        this.k.a(context, String.valueOf(n));
                    }
                    else {
                        this.k.a(context, "20+");
                    }
                    if (j == 0) {
                        this.d();
                        this.m = this.a(0.0f, 1.0f, 250L, (Interpolator)new OvershootInterpolator(), (Animator$AnimatorListener)new d(this));
                    }
                }
                this.a.requestLayout();
                this.a.refreshDrawableState();
                this.a.invalidate();
            }
            else if (this.i == 1) {
                this.j = n;
                if (this.h != null) {
                    this.a.invalidateDrawable(this.h);
                    return;
                }
                this.a.invalidate();
            }
        }
    }
    
    void c() {
        this.m = null;
    }
}
