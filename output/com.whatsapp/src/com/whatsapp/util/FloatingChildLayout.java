// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.view.MotionEvent;
import android.view.animation.AlphaAnimation;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.ViewPropertyAnimator;
import android.animation.Animator;
import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.Interpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.view.animation.AnimationUtils;
import android.view.ViewAnimationUtils;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.ViewTreeObserver$OnDrawListener;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Build$VERSION;
import android.graphics.Rect;
import android.view.View;
import android.view.View$OnTouchListener;
import android.animation.ValueAnimator;
import android.widget.FrameLayout;

public class FloatingChildLayout extends FrameLayout
{
    private static boolean f;
    private static final String z;
    private ValueAnimator a;
    private int b;
    private View$OnTouchListener c;
    private View d;
    private int e;
    private int g;
    private Rect h;
    private int i;
    private boolean j;
    
    static {
        char f = '\u0001';
        final char[] charArray = "U.o(d\u00112d{RP\"jhb^4ok8\u0018m!fd\u0011(r/}P/`huUahadT3on|]8".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0010';
                    break;
                }
                case 0: {
                    c2 = '1';
                    break;
                }
                case 1: {
                    c2 = 'A';
                    break;
                }
                case 2: {
                    c2 = f;
                    break;
                }
                case 3: {
                    c2 = '\u000f';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
        if (Build$VERSION.SDK_INT < 12) {
            f = '\0';
        }
        FloatingChildLayout.f = (f != '\0');
    }
    
    public FloatingChildLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.h = new Rect();
        this.b = 0;
        this.a = null;
        this.i = 0;
        final Resources resources = this.getResources();
        this.e = resources.getDimensionPixelOffset(2131361946);
        this.g = resources.getInteger(17694720);
        if (FloatingChildLayout.f) {
            (this.a = ValueAnimator.ofInt(new int[] { 0, 127 })).addUpdateListener((ValueAnimator$AnimatorUpdateListener)new z(this));
        }
        super.setBackgroundDrawable((Drawable)new ColorDrawable(0));
    }
    
    private static int a(final int n, final int n2, final int n3) {
        if (n2 > n3) {
            return (n3 - n2) / 2;
        }
        return Math.min(Math.max(n, 0), n3 - n2);
    }
    
    static int a(final FloatingChildLayout floatingChildLayout, final int i) {
        return floatingChildLayout.i = i;
    }
    
    static ValueAnimator a(final FloatingChildLayout floatingChildLayout) {
        return floatingChildLayout.a;
    }
    
    private Rect a() {
        final Rect rect = new Rect();
        this.getWindowVisibleDisplayFrame(rect);
        final Rect rect2 = new Rect(this.h);
        rect2.offset(-rect.left, -rect.top);
        return rect2;
    }
    
    private static void a(final View view, final int n, final int n2) {
        view.layout(n, n2, n + view.getMeasuredWidth(), n2 + view.getMeasuredHeight());
    }
    
    public static void a(final View view, final Runnable runnable) {
        if (Build$VERSION.SDK_INT >= 16) {
            view.getViewTreeObserver().addOnDrawListener((ViewTreeObserver$OnDrawListener)new s(view, runnable));
            if (!Log.l) {
                return;
            }
        }
        view.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new g(view, runnable));
    }
    
    private void a(final boolean b, final Runnable runnable) {
        float n = 1.0f;
        float n2;
        if (b) {
            n2 = this.h.width() / this.d.getWidth();
        }
        else {
            n2 = n;
        }
        float n3;
        if (b) {
            n3 = n;
        }
        else {
            n3 = this.h.width() / this.d.getWidth();
        }
        if (FloatingChildLayout.f) {
            int n4;
            if (b) {
                n4 = 17563652;
            }
            else {
                n4 = 17563653;
            }
            if (this.j && Build$VERSION.SDK_INT >= 21) {
                int n5 = (int)Math.sqrt(this.d.getWidth() * this.d.getWidth() + this.d.getHeight() * this.d.getHeight());
                int n6 = (int)Math.sqrt(this.h.width() * this.h.width() + this.h.height() * this.h.height());
                if (!b) {
                    final int n7 = n6;
                    n6 = n5;
                    n5 = n7;
                }
                final Animator circularReveal = ViewAnimationUtils.createCircularReveal(this.d, this.d.getWidth() / 2, this.d.getHeight() / 2, (float)n5, (float)n6);
                circularReveal.setDuration((long)this.g);
                circularReveal.start();
            }
            if (!b) {
                this.d.setScaleX(n3);
                this.d.setScaleY(n3);
                this.d.setAlpha(0.0f);
            }
            this.d.setPivotX((float)(this.h.left - this.d.getLeft()));
            this.d.setPivotY((float)(this.h.top - this.d.getTop()));
            final ViewPropertyAnimator scaleY = this.d.animate().setDuration((long)this.g).setInterpolator((TimeInterpolator)AnimationUtils.loadInterpolator(this.getContext(), n4)).scaleX(n2).scaleY(n2);
            if (b) {
                n = 0.0f;
            }
            scaleY.alpha(n).setListener((Animator$AnimatorListener)new c8(this, b, runnable));
            if (!Log.l) {
                return;
            }
        }
        final ScaleAnimation scaleAnimation = new ScaleAnimation(n3, n2, n3, n2, 0, (float)(this.h.centerX() - this.d.getLeft()), 0, (float)(this.h.centerY() - this.d.getTop()));
        ((Animation)scaleAnimation).setDuration((long)this.g);
        ((Animation)scaleAnimation).setFillAfter(true);
        Object interpolator;
        if (b) {
            interpolator = new AccelerateInterpolator();
        }
        else {
            interpolator = new DecelerateInterpolator();
        }
        ((Animation)scaleAnimation).setInterpolator((Interpolator)interpolator);
        ((Animation)scaleAnimation).setAnimationListener((Animation$AnimationListener)new f(this, b, runnable));
        this.d.startAnimation((Animation)scaleAnimation);
    }
    
    static int b(final FloatingChildLayout floatingChildLayout) {
        return floatingChildLayout.i;
    }
    
    public static void b(final View view, final Runnable runnable) {
        view.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new ct(view, runnable));
    }
    
    static View c(final FloatingChildLayout floatingChildLayout) {
        return floatingChildLayout.d;
    }
    
    static boolean c() {
        return FloatingChildLayout.f;
    }
    
    static int d(final FloatingChildLayout floatingChildLayout) {
        return floatingChildLayout.g;
    }
    
    private void e() {
        this.d.invalidate();
    }
    
    public void a(final Runnable runnable) {
        if (this.i == 0) {
            this.i = 1;
            this.a(false, runnable);
        }
    }
    
    public void b() {
        final boolean l = Log.l;
        if (this.b == 1) {
            this.b = 3;
            if (FloatingChildLayout.f) {
                if (this.a.isRunning()) {
                    this.a.reverse();
                    if (!l) {
                        return;
                    }
                }
                final ValueAnimator ofInt = ValueAnimator.ofInt(new int[] { 127, 0 });
                ofInt.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new b5(this));
                ofInt.setDuration((long)this.g).start();
                if (!l) {
                    return;
                }
            }
            final AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            ((Animation)alphaAnimation).setDuration((long)this.g);
            ((Animation)alphaAnimation).setFillAfter(true);
            this.startAnimation((Animation)alphaAnimation);
        }
    }
    
    public boolean b(final Runnable runnable) {
        if (this.i == 1 || this.i == 2) {
            this.i = 3;
            this.e();
            this.a(true, runnable);
            return true;
        }
        return false;
    }
    
    public boolean d() {
        return this.i == 2;
    }
    
    public void f() {
        if (this.b == 0) {
            this.b = 1;
            this.e();
            a((View)this, new r(this));
        }
    }
    
    protected void onFinishInflate() {
        (this.d = this.findViewById(16908290)).setDuplicateParentStateEnabled(true);
        if (FloatingChildLayout.f) {
            this.d.setScaleX(0.5f);
            this.d.setScaleY(0.5f);
            this.d.setAlpha(0.0f);
        }
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final View d = this.d;
        final Rect a = this.a();
        final int measuredWidth = d.getMeasuredWidth();
        final int measuredHeight = d.getMeasuredHeight();
        if (this.e != -1) {
            a(d, a((this.getWidth() - measuredWidth) / 2, measuredWidth, this.getWidth()), a(this.e, measuredHeight, this.getHeight()));
            if (!Log.l) {
                return;
            }
        }
        a(d, a(a.centerX() - measuredWidth / 2, measuredWidth, this.getWidth()), a(a.centerY() - Math.round(0.75f * measuredHeight), measuredHeight, this.getHeight()));
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        return this.c != null && this.c.onTouch((View)this, motionEvent);
    }
    
    public void setBackground(final Drawable drawable) {
        Log.e(FloatingChildLayout.z);
    }
    
    public void setBackgroundColorAlpha(final int n) {
        this.setBackgroundColor(n << 24);
    }
    
    public void setChildTargetScreen(final Rect h) {
        this.h = h;
        this.requestLayout();
    }
    
    public void setCircularReveal(final boolean j) {
        this.j = j;
        if (Build$VERSION.SDK_INT >= 21) {
            this.g = this.getResources().getInteger(17694721);
        }
    }
    
    public void setOnOutsideTouchListener(final View$OnTouchListener c) {
        this.c = c;
    }
}
