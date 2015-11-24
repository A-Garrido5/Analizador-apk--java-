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
import android.animation.Animator;
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

public class TwitterIndeterminateProgressSpinner extends View
{
    private final Paint a;
    private final Path b;
    private final RectF c;
    private final Map d;
    private Drawable e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private boolean l;
    
    public TwitterIndeterminateProgressSpinner(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new Paint(1);
        this.b = new Path();
        this.c = new RectF();
        this.d = new HashMap(2);
        this.a(context, set, 0);
    }
    
    public TwitterIndeterminateProgressSpinner(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = new Paint(1);
        this.b = new Path();
        this.c = new RectF();
        this.d = new HashMap(2);
        this.a(context, set, n);
    }
    
    private void a() {
        if (!this.l) {
            this.l = true;
            if (this.d.isEmpty()) {
                final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)this, "sweepEnd", new float[] { 0.0f, 360.0f });
                final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)this, "sweepStart", new float[] { 0.0f, 360.0f });
                final AnimatorSet set = new AnimatorSet();
                set.playSequentially(new Animator[] { ofFloat, ofFloat2 });
                set.setDuration(1000L);
                set.setInterpolator((TimeInterpolator)new AccelerateDecelerateInterpolator());
                set.addListener((Animator$AnimatorListener)new af(this));
                final ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((Object)this, "rotate", new float[] { 0.0f, 360.0f });
                ofFloat3.setDuration(3000L);
                ofFloat3.setInterpolator((TimeInterpolator)new LinearInterpolator());
                ofFloat3.setRepeatCount(-1);
                this.d.put(2, set);
                this.d.put(3, ofFloat3);
            }
            final Iterator<Animator> iterator = this.d.values().iterator();
            while (iterator.hasNext()) {
                iterator.next().start();
            }
        }
    }
    
    private void a(final Context context, final AttributeSet set, final int n) {
        boolean boolean1 = false;
        if (set != null) {
            final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(set, jt.TwitterIndeterminateProgressSpinner, n, 0);
            this.g = obtainStyledAttributes.getDimension(jt.TwitterIndeterminateProgressSpinner_logoSize, 0.0f);
            this.f = obtainStyledAttributes.getDimension(jt.TwitterIndeterminateProgressSpinner_ringSize, 0.0f);
            this.h = obtainStyledAttributes.getDimension(jt.TwitterIndeterminateProgressSpinner_ringThickness, 0.0f);
            boolean1 = obtainStyledAttributes.getBoolean(jt.TwitterIndeterminateProgressSpinner_whiteForeground, false);
            obtainStyledAttributes.recycle();
        }
        final Paint a = this.a;
        int color;
        if (boolean1) {
            color = -1;
        }
        else {
            color = this.getResources().getColor(jl.twitter_blue);
        }
        a.setColor(color);
        this.a.setStyle(Paint$Style.STROKE);
        this.a.setStrokeCap(Paint$Cap.ROUND);
        this.a.setStrokeWidth(this.h);
        final Resources resources = this.getResources();
        int n2;
        if (boolean1) {
            n2 = jn.twitter_logo_white;
        }
        else {
            n2 = jn.twitter_logo;
        }
        this.e = resources.getDrawable(n2);
    }
    
    private void b() {
        if (this.l) {
            this.l = false;
            final Iterator<Animator> iterator = this.d.values().iterator();
            while (iterator.hasNext()) {
                iterator.next().cancel();
            }
        }
    }
    
    private float getRotate() {
        return this.k;
    }
    
    private float getSweepEnd() {
        return this.j;
    }
    
    private float getSweepStart() {
        return this.i;
    }
    
    private void setRotate(final float k) {
        this.k = k;
        ViewCompat.postInvalidateOnAnimation(this);
    }
    
    private void setSweepEnd(final float j) {
        this.i = 0.0f;
        this.j = j;
        ViewCompat.postInvalidateOnAnimation(this);
    }
    
    private void setSweepStart(final float i) {
        this.i = i;
        this.j = 360.0f;
        ViewCompat.postInvalidateOnAnimation(this);
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a();
    }
    
    protected void onDetachedFromWindow() {
        this.b();
        super.onDetachedFromWindow();
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        this.e.draw(canvas);
        this.b.rewind();
        this.b.addArc(this.c, this.i + this.k, this.j - this.i);
        canvas.drawPath(this.b, this.a);
    }
    
    protected void onMeasure(final int n, final int n2) {
        int min = (int)Math.ceil(this.f + this.h);
        int n3 = View$MeasureSpec.getSize(n);
        final int size = View$MeasureSpec.getSize(n2);
        switch (View$MeasureSpec.getMode(n)) {
            case Integer.MIN_VALUE: {
                n3 = Math.min(min, n3);
            }
            default: {
                n3 = min;
            }
            case 1073741824: {
                switch (View$MeasureSpec.getMode(n2)) {
                    case 1073741824: {
                        min = size;
                        break;
                    }
                    case Integer.MIN_VALUE: {
                        min = Math.min(min, size);
                        break;
                    }
                }
                this.setMeasuredDimension(n3, min);
            }
        }
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.c.set((n - this.f) / 2.0f, (n2 - this.f) / 2.0f, (n + this.f) / 2.0f, (n2 + this.f) / 2.0f);
        final float n5 = this.e.getIntrinsicHeight() / this.e.getIntrinsicWidth();
        this.e.setBounds((int)((n - this.g) / 2.0f), (int)((n2 - n5 * this.g) / 2.0f), (int)((n + this.g) / 2.0f), (int)((n2 + n5 * this.g) / 2.0f));
    }
    
    protected void onVisibilityChanged(final View view, final int n) {
        super.onVisibilityChanged(view, n);
        if (n == 8 || n == 4) {
            this.b();
            return;
        }
        this.a();
    }
    
    public void setVisibility(final int visibility) {
        if (this.getVisibility() != visibility) {
            super.setVisibility(visibility);
            if (visibility != 8 && visibility != 4) {
                this.a();
                return;
            }
            this.b();
        }
    }
}
