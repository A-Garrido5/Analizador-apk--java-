// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.support.v4.view.ViewCompat;
import android.view.animation.AnimationUtils;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Paint;
import android.view.animation.Interpolator;
import android.view.View;

public class SwipeProgressBarView extends View
{
    private static final Interpolator a;
    private final Paint b;
    private final RectF c;
    private float d;
    private long e;
    private long f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private Rect m;
    
    static {
        a = (Interpolator)p.a();
    }
    
    public SwipeProgressBarView(final Context context) {
        super(context);
        this.b = new Paint();
        this.c = new RectF();
        this.m = new Rect();
        this.a(context);
    }
    
    public SwipeProgressBarView(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = new Paint();
        this.c = new RectF();
        this.m = new Rect();
        this.a(context);
    }
    
    public SwipeProgressBarView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b = new Paint();
        this.c = new RectF();
        this.m = new Rect();
        this.a(context);
    }
    
    private void a(final Context context) {
        this.i = -1291845632;
        this.j = Integer.MIN_VALUE;
        this.k = 1291845632;
        this.l = 436207616;
        this.h = context.getResources().getDimensionPixelSize(2131558905);
    }
    
    private void a(final Canvas canvas, final float n, final float n2, final int color, final float n3) {
        this.b.setColor(color);
        canvas.save();
        canvas.translate(n, n2);
        final float interpolation = SwipeProgressBarView.a.getInterpolation(n3);
        canvas.scale(interpolation, interpolation);
        canvas.drawCircle(0.0f, 0.0f, n, this.b);
        canvas.restore();
    }
    
    private void a(final Canvas canvas, final int n, final int n2) {
        this.b.setColor(this.i);
        canvas.drawCircle((float)n, (float)n2, n * this.d, this.b);
    }
    
    public void a() {
        if (!this.g) {
            this.d = 0.0f;
            this.e = AnimationUtils.currentAnimationTimeMillis();
            this.g = true;
            this.postInvalidate();
        }
    }
    
    public void a(final int i, final int j, final int k, final int l) {
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    public void b() {
        if (this.g) {
            this.d = 0.0f;
            this.f = AnimationUtils.currentAnimationTimeMillis();
            this.g = false;
            this.postInvalidate();
        }
    }
    
    public void draw(final Canvas canvas) {
        final int width = this.m.width();
        final int height = this.m.height();
        final int n = width / 2;
        final int n2 = height / 2;
        int save = canvas.save();
        canvas.clipRect(this.m);
        if (this.g || this.f > 0L) {
            final long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            final long n3 = (currentAnimationTimeMillis - this.e) % 2000L;
            final long n4 = (currentAnimationTimeMillis - this.e) / 2000L;
            final float n5 = n3 / 20.0f;
            boolean b;
            if (!this.g) {
                if (currentAnimationTimeMillis - this.f >= 1000L) {
                    this.f = 0L;
                    return;
                }
                final float n6 = width / 2 * SwipeProgressBarView.a.getInterpolation((currentAnimationTimeMillis - this.f) % 1000L / 10.0f / 100.0f);
                this.c.set(n - n6, 0.0f, n6 + n, (float)height);
                canvas.saveLayerAlpha(this.c, 0, 0);
                b = true;
            }
            else {
                b = false;
            }
            if (n4 == 0L) {
                canvas.drawColor(this.i);
            }
            else if (n5 >= 0.0f && n5 < 25.0f) {
                canvas.drawColor(this.l);
            }
            else if (n5 >= 25.0f && n5 < 50.0f) {
                canvas.drawColor(this.i);
            }
            else if (n5 >= 50.0f && n5 < 75.0f) {
                canvas.drawColor(this.j);
            }
            else {
                canvas.drawColor(this.k);
            }
            if (n5 >= 0.0f && n5 <= 25.0f) {
                this.a(canvas, n, n2, this.i, 2.0f * (25.0f + n5) / 100.0f);
            }
            if (n5 >= 0.0f && n5 <= 50.0f) {
                this.a(canvas, n, n2, this.j, 2.0f * n5 / 100.0f);
            }
            if (n5 >= 25.0f && n5 <= 75.0f) {
                this.a(canvas, n, n2, this.k, 2.0f * (n5 - 25.0f) / 100.0f);
            }
            if (n5 >= 50.0f && n5 <= 100.0f) {
                this.a(canvas, n, n2, this.l, 2.0f * (n5 - 50.0f) / 100.0f);
            }
            if (n5 >= 75.0f && n5 <= 100.0f) {
                this.a(canvas, n, n2, this.i, 2.0f * (n5 - 75.0f) / 100.0f);
            }
            int save2;
            if (this.d > 0.0f && b) {
                canvas.restoreToCount(save);
                save2 = canvas.save();
                canvas.clipRect(this.m);
                this.a(canvas, n, n2);
            }
            else {
                save2 = save;
            }
            ViewCompat.postInvalidateOnAnimation(this);
            save = save2;
        }
        else if (this.d > 0.0f && this.d <= 1.0) {
            this.a(canvas, n, n2);
        }
        canvas.restoreToCount(save);
    }
    
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        this.m.right = this.getMeasuredWidth();
        if (this.m.bottom == 0 && this.m.top == 0) {
            this.m.bottom = this.h;
        }
    }
    
    public void setColorScheme(final int[] array) {
        if (array.length == 4) {
            this.a(array[0], array[1], array[2], array[3]);
        }
    }
    
    public void setProgressTop(final int top) {
        this.m.top = top;
        this.m.bottom = top + this.h;
        this.invalidate();
    }
}
