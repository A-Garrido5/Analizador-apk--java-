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
import android.animation.Animator;
import android.view.animation.Animation$AnimationListener;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.widget.FrameLayout;

class z extends FrameLayout implements ViewTreeObserver$OnPreDrawListener, Animation$AnimationListener
{
    private static final boolean a;
    private Animator A;
    private boolean B;
    private Activity C;
    private Runnable D;
    private final TextView b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private long k;
    private boolean l;
    private boolean m;
    private View n;
    private ViewGroup o;
    private int[] p;
    private int[] q;
    private int[] r;
    private Path s;
    private Paint t;
    private RectF u;
    private int v;
    private WindowManager w;
    private Animation x;
    private Animation y;
    private Animator z;
    
    static {
        a = (Build$VERSION.SDK_INT >= 18);
    }
    
    private z(final Activity c, final View n, final ViewGroup o, final CharSequence text, final int j, final int n2) {
        super(a((Context)c, n2), (AttributeSet)null);
        this.p = new int[2];
        this.q = new int[2];
        this.r = new int[2];
        this.s = new Path();
        this.t = new Paint();
        this.C = c;
        this.n = n;
        this.o = o;
        final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(n2, jt.TooltipView);
        this.h = obtainStyledAttributes.getDimensionPixelOffset(jt.TooltipView_arrowWidth, 0);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(jt.TooltipView_arrowHeight, 0);
        this.c = obtainStyledAttributes.getDimensionPixelOffset(jt.TooltipView_xOffset, 0);
        this.d = obtainStyledAttributes.getDimensionPixelOffset(jt.TooltipView_yOffset, 0);
        this.e = obtainStyledAttributes.getDimensionPixelOffset(jt.TooltipView_screenEdgePadding, 0);
        this.i = obtainStyledAttributes.getDimensionPixelOffset(jt.TooltipView_cornerRadius, 0);
        this.k = obtainStyledAttributes.getInteger(jt.TooltipView_transitionAnimationDelayMs, 0);
        this.t.setColor(obtainStyledAttributes.getColor(jt.TooltipView_tooltipColor, 0));
        (this.b = new TextView((Context)c)).setTextAppearance((Context)c, obtainStyledAttributes.getResourceId(jt.TooltipView_textAppearance, 0));
        this.addView((View)this.b, new ViewGroup$LayoutParams(-2, -2));
        this.b.setText(text);
        obtainStyledAttributes.recycle();
        this.j = j;
        this.t.setAntiAlias(true);
        if (this.c()) {
            this.setPadding(this.getPaddingLeft(), this.getPaddingTop() + this.g, this.getPaddingRight(), this.getPaddingBottom() + this.g);
        }
        else {
            this.setPadding(this.getPaddingLeft() + this.g, this.getPaddingTop(), this.getPaddingRight() + this.g, this.getPaddingBottom());
        }
        this.setWillNotDraw(false);
        this.w = this.C.getWindowManager();
        this.v = this.C.getResources().getConfiguration().orientation;
        if (com.twitter.ui.widget.z.a) {
            final Animator loadAnimator = AnimatorInflater.loadAnimator((Context)c, jj.tooltip_transition_in);
            loadAnimator.setTarget((Object)this);
            loadAnimator.addListener((Animator$AnimatorListener)new aa(this, null));
            this.z = loadAnimator;
            final Animator loadAnimator2 = AnimatorInflater.loadAnimator((Context)c, jj.tooltip_transition_out);
            loadAnimator2.setTarget((Object)this);
            loadAnimator2.addListener((Animator$AnimatorListener)new aa(this, null));
            this.A = loadAnimator2;
        }
    }
    
    private static Context a(final Context context, final int n) {
        if (n != 0) {
            return (Context)new ContextThemeWrapper(context, n);
        }
        final TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(jk.tooltipStyle, typedValue, true);
        return (Context)new ContextThemeWrapper(context, typedValue.resourceId);
    }
    
    private void a(final boolean b) {
        this.n.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        this.measure(View$MeasureSpec.makeMeasureSpec(0, 0), View$MeasureSpec.makeMeasureSpec(0, 0));
        this.b();
        if (b) {
            this.setVisibility(4);
            this.postDelayed((Runnable)new ab(this, null), this.k);
        }
    }
    
    private void a(final boolean b, final Runnable d) {
        if (!this.m) {
            this.n.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
            this.D = d;
            if (b) {
                if (com.twitter.ui.widget.z.a) {
                    this.A.start();
                }
                else {
                    this.startAnimation(this.y = (Animation)this.b(false));
                }
            }
            else {
                d.run();
            }
            this.m = true;
        }
    }
    
    private void a(final int[] array) {
        final int left = this.n.getLeft();
        final int top = this.n.getTop();
        ViewParent viewParent = this.n.getParent();
        int n = left;
        int n2 = top;
        while (viewParent instanceof View) {
            final View view = (View)viewParent;
            n += view.getLeft();
            final int n3 = n2 + view.getTop();
            viewParent = viewParent.getParent();
            n2 = n3;
        }
        array[0] = n;
        array[1] = n2;
    }
    
    private ScaleAnimation b(final boolean b) {
        this.a(this.q);
        this.getLocationInWindow(this.p);
        int height = 0;
        int f = 0;
        switch (this.j) {
            default: {
                height = 0;
                f = 0;
                break;
            }
            case 1: {
                f = this.f;
                height = 0;
                break;
            }
            case 0: {
                final int f2 = this.f;
                height = this.getHeight();
                f = f2;
                break;
            }
            case 2: {
                height = this.getHeight() / 2;
                f = 0;
                break;
            }
            case 3: {
                final int width = this.getWidth();
                height = this.getHeight() / 2;
                f = width;
                break;
            }
        }
        ScaleAnimation scaleAnimation;
        if (b) {
            scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 0, (float)f, 0, (float)height);
            scaleAnimation.setInterpolator((Interpolator)new DecelerateInterpolator(3.0f));
        }
        else {
            scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 0, (float)f, 0, (float)height);
            scaleAnimation.setInterpolator((Interpolator)new AccelerateInterpolator(3.0f));
        }
        scaleAnimation.setDuration((long)this.getResources().getInteger(jp.tooltip_transition_duration_ms));
        scaleAnimation.setAnimationListener((Animation$AnimationListener)this);
        return scaleAnimation;
    }
    
    private void b() {
        if (this.B) {
            return;
        }
        if (!this.l && this.n.getLeft() == 0 && this.n.getRight() == 0 && this.n.getTop() == 0 && this.n.getBottom() == 0) {
            this.requestLayout();
            return;
        }
        this.l = true;
        final ViewGroup o = this.o;
        this.a(this.q);
        final int measuredHeight = this.getMeasuredHeight();
        final int measuredWidth = this.getMeasuredWidth();
        final int n = this.q[0] + this.n.getWidth() / 2;
        int n5;
        int n6;
        if (this.c()) {
            final int n2 = n - measuredWidth / 2;
            final int n3 = n + measuredWidth / 2;
            int max = Math.max(o.getPaddingLeft(), this.e);
            final int n4 = o.getWidth() - Math.max(o.getPaddingRight(), this.e);
            if (n2 >= max) {
                if (n3 > n4) {
                    max = n2 - (n3 - n4);
                }
                else {
                    max = n2;
                }
            }
            n5 = max + this.c;
            if (this.j == 1) {
                n6 = this.q[1] + this.n.getHeight() - this.d;
            }
            else {
                n6 = this.q[1] + this.d - measuredHeight;
            }
        }
        else {
            n6 = this.q[1] + this.n.getHeight() / 2 - measuredHeight / 2 + this.d;
            if (this.j == 2) {
                n5 = this.q[0] + this.n.getWidth() - this.c;
            }
            else {
                n5 = this.q[0] + this.c - measuredWidth;
            }
        }
        this.getLocationInWindow(this.p);
        final int n7 = n5 - this.p[0];
        final int n8 = n6 - this.p[1];
        if (com.twitter.ui.widget.z.a) {
            this.setX(this.getX() + n7);
            this.setY(this.getY() + n8);
        }
        else {
            this.offsetLeftAndRight(n7);
            this.offsetTopAndBottom(n8);
        }
        this.getLocationInWindow(this.p);
        final int f = n - this.p[0];
        if (Math.abs(f - this.f) > 0.5f) {
            this.f = f;
            this.invalidate();
        }
        if (com.twitter.ui.widget.z.a) {
            switch (this.j) {
                case 0: {
                    this.setPivotX((float)this.f);
                    this.setPivotY((float)this.getMeasuredHeight());
                    break;
                }
                case 1: {
                    this.setPivotX((float)this.f);
                    this.setPivotY(0.0f);
                    break;
                }
                case 2: {
                    this.setPivotX(0.0f);
                    this.setPivotY((float)(this.getMeasuredHeight() / 2));
                    break;
                }
                case 3: {
                    this.setPivotX((float)this.getMeasuredWidth());
                    this.setPivotY((float)(this.getMeasuredHeight() / 2));
                    break;
                }
            }
        }
        this.r[0] = this.q[0];
        this.r[1] = this.q[1];
    }
    
    private boolean c() {
        return this.j == 1 || this.j == 0;
    }
    
    private static void f(final z z) {
        if (z.D != null) {
            z.D.run();
        }
    }
    
    public void a(final CharSequence text) {
        this.b.setText(text);
        this.u = null;
        this.b();
    }
    
    public void onAnimationEnd(final Animation animation) {
        if (animation == this.y) {
            f(this);
        }
        else if (animation == this.x) {
            this.b();
        }
    }
    
    public void onAnimationRepeat(final Animation animation) {
    }
    
    public void onAnimationStart(final Animation animation) {
        this.setVisibility(0);
    }
    
    protected void onDraw(final Canvas canvas) {
        if (!this.l) {
            return;
        }
        final int h = this.h;
        final int g = this.g;
        final int width = this.getWidth();
        final int height = this.getHeight();
        final Paint t = this.t;
        RectF u;
        if (this.u == null) {
            u = new RectF();
            if (this.c()) {
                u.set(0.0f, (float)g, (float)width, (float)(height - g));
            }
            else {
                u.set((float)g, 0.0f, (float)(width - g), (float)height);
            }
            this.u = u;
        }
        else {
            u = this.u;
        }
        final int i = this.i;
        canvas.drawRoundRect(u, (float)i, (float)i, t);
        final Path s = this.s;
        s.rewind();
        if (this.c()) {
            final int f = this.f;
            final int n = f - h / 2;
            final int n2 = f + h / 2;
            if (this.j == 1) {
                s.moveTo((float)n, (float)g);
                s.lineTo((float)f, 0.0f);
                s.lineTo((float)n2, (float)g);
            }
            else {
                final int n3 = (int)u.bottom;
                s.moveTo((float)n, (float)n3);
                s.lineTo((float)f, (float)height);
                s.lineTo((float)n2, (float)n3);
            }
        }
        else {
            final int n4 = (height - h) / 2;
            final int n5 = n4 + h;
            final int n6 = n4 + h / 2;
            if (this.j == 2) {
                s.moveTo((float)g, (float)n4);
                s.lineTo((float)g, (float)n5);
                s.lineTo(0.0f, (float)n6);
            }
            else {
                final int n7 = (int)u.right;
                s.moveTo((float)n7, (float)n4);
                s.lineTo((float)width, (float)n6);
                s.lineTo((float)n7, (float)n5);
            }
        }
        s.close();
        canvas.drawPath(this.s, t);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (!this.l || b) {
            this.b();
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        final Point a = com.twitter.util.t.a(this.w);
        int n3 = 0;
        switch (this.v) {
            default: {
                n3 = (int)(0.9f * Math.min(a.x, a.y));
                break;
            }
            case 2: {
                n3 = (int)(0.9f * Math.max(a.x, a.y));
                break;
            }
        }
        final int mode = View$MeasureSpec.getMode(n);
        int min;
        int n4;
        if (mode == 0) {
            min = n3;
            n4 = Integer.MIN_VALUE;
        }
        else {
            min = Math.min(View$MeasureSpec.getSize(n), n3);
            n4 = mode;
        }
        super.onMeasure(View$MeasureSpec.makeMeasureSpec(min, n4), n2);
    }
    
    public boolean onPreDraw() {
        this.a(this.q);
        if (this.q[0] != this.r[0] || this.q[1] != this.r[1]) {
            this.b();
        }
        return true;
    }
}
