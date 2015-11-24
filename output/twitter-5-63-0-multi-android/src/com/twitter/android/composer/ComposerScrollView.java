// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import android.animation.Animator;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.animation.ObjectAnimator;
import android.view.View$MeasureSpec;
import android.content.res.TypedArray;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.support.annotation.IdRes;
import com.twitter.library.widget.ObservableScrollView;

public class ComposerScrollView extends ObservableScrollView
{
    boolean a;
    @IdRes
    private final int b;
    private final int c;
    private View d;
    
    public ComposerScrollView(final Context context) {
        this(context, null);
    }
    
    public ComposerScrollView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ComposerScrollView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = true;
        this.c = this.getResources().getDimensionPixelSize(2131558597);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, pa.ComposerScrollView, n, 0);
        this.b = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        this.setFillViewport(true);
    }
    
    private void d() {
        final int measuredWidth = this.getMeasuredWidth();
        final int measuredHeight = this.getMeasuredHeight();
        int measuredHeight2;
        if (this.d != null && this.d.getVisibility() == 0) {
            if (this.d.getMeasuredHeight() == 0) {
                this.d.measure(View$MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View$MeasureSpec.makeMeasureSpec(0, 0));
            }
            measuredHeight2 = this.d.getMeasuredHeight();
        }
        else {
            measuredHeight2 = 0;
        }
        final int minimumHeight = measuredHeight2 + measuredHeight;
        final View child = this.getChildAt(0);
        child.setMinimumHeight(minimumHeight);
        child.measure(View$MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View$MeasureSpec.makeMeasureSpec(0, 0));
        child.layout(0, 0, measuredWidth, child.getMeasuredHeight());
    }
    
    @Override
    protected void a() {
        super.a();
        this.a = false;
    }
    
    @Override
    protected void b() {
        super.b();
        if (this.d != null) {
            int measuredHeight;
            if (this.d.getVisibility() == 0) {
                measuredHeight = this.d.getMeasuredHeight();
            }
            else {
                measuredHeight = 0;
            }
            if (this.getScrollY() >= measuredHeight) {
                this.a = true;
                return;
            }
            final ObjectAnimator setDuration = ObjectAnimator.ofInt((Object)this, "scrollY", new int[] { this.getScrollY(), measuredHeight }).setDuration(250L);
            ((Animator)setDuration).setInterpolator((TimeInterpolator)new AccelerateInterpolator(2.0f));
            ((Animator)setDuration).addListener((Animator$AnimatorListener)new ax(this));
            ((Animator)setDuration).start();
        }
    }
    
    public boolean c() {
        return this.d != null && this.d.getVisibility() == 0 && this.getScrollY() < this.d.getHeight() - this.c;
    }
    
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (this.b != 0) {
            final View viewById = this.findViewById(this.b);
            this.d = viewById;
            this.d();
            this.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new aw(this, viewById));
        }
    }
    
    @Override
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.d();
    }
    
    public void setHeaderVisible(final boolean b) {
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        if (this.d != null && this.d.getVisibility() != visibility) {
            this.d.setVisibility(visibility);
            this.d();
            int measuredHeight = this.d.getMeasuredHeight();
            if (measuredHeight != 0) {
                if (!b) {
                    measuredHeight = -measuredHeight;
                }
                this.scrollBy(0, measuredHeight);
                this.smoothScrollBy(0, 0);
            }
        }
    }
}
