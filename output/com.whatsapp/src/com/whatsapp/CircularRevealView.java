// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Paint$Style;
import android.util.FloatMath;
import android.graphics.Canvas;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.Animation;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Build$VERSION;
import android.graphics.RectF;
import android.graphics.Paint;
import android.widget.FrameLayout;

public class CircularRevealView extends FrameLayout
{
    private static boolean b;
    private int a;
    private int c;
    private int d;
    private int e;
    private Paint f;
    private aov g;
    private float h;
    private RectF i;
    
    static {
        CircularRevealView.b = (Build$VERSION.SDK_INT < 21);
    }
    
    public CircularRevealView(final Context context) {
        super(context);
        this.e = 300;
        this.d = -1;
        this.f = new Paint(1);
        this.i = new RectF();
    }
    
    public CircularRevealView(final Context context, final AttributeSet set) {
        super(context, set);
        this.e = 300;
        this.d = -1;
        this.f = new Paint(1);
        this.i = new RectF();
    }
    
    public CircularRevealView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.e = 300;
        this.d = -1;
        this.f = new Paint(1);
        this.i = new RectF();
    }
    
    public CircularRevealView(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.e = 300;
        this.d = -1;
        this.f = new Paint(1);
        this.i = new RectF();
    }
    
    static float a(final CircularRevealView circularRevealView, final float h) {
        return circularRevealView.h = h;
    }
    
    public void a() {
        if (CircularRevealView.b) {
            this.clearAnimation();
            (this.g = new aov(this, true)).setDuration((long)this.e);
            this.startAnimation((Animation)this.g);
            if (!App.I) {
                return;
            }
        }
        final Animator circularReveal = ViewAnimationUtils.createCircularReveal((View)this, this.c, this.a, (float)Math.max(this.getWidth(), this.getHeight()), 0.0f);
        circularReveal.setDuration((long)this.e);
        circularReveal.addListener((Animator$AnimatorListener)new uz(this));
        circularReveal.start();
    }
    
    public void b() {
        if (CircularRevealView.b) {
            this.clearAnimation();
            this.setWillNotDraw(false);
            this.setBackgroundColor(0);
            (this.g = new aov(this, false)).setDuration((long)this.e);
            this.startAnimation((Animation)this.g);
            if (!App.I) {
                return;
            }
        }
        this.setVisibility(0);
        final Animator circularReveal = ViewAnimationUtils.createCircularReveal((View)this, this.c, this.a, 0.0f, (float)Math.max(this.getWidth(), this.getHeight()));
        circularReveal.setDuration((long)this.e);
        circularReveal.start();
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (CircularRevealView.b) {
            this.clearAnimation();
        }
    }
    
    public void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (CircularRevealView.b) {
            final float n = FloatMath.sqrt((float)(this.getWidth() * this.getWidth() + this.getHeight() * this.getHeight())) * this.h;
            this.i.set(-n, -n, n, n);
            this.i.offset((float)this.c, (float)this.a);
            this.f.setColor(this.d);
            this.f.setStyle(Paint$Style.FILL);
            canvas.drawArc(this.i, 0.0f, 360.0f, true, this.f);
            if (this.h == 1.0f) {
                this.f.setColor(855638016);
                this.f.setStyle(Paint$Style.STROKE);
                this.f.setStrokeWidth(vc.b().b);
                canvas.drawLine(0.0f, (float)this.getHeight(), (float)this.getWidth(), (float)this.getHeight(), this.f);
            }
        }
    }
    
    public void setAnchor(final int c, final int a) {
        this.c = c;
        this.a = a;
    }
    
    public void setColor(final int d) {
        this.d = d;
    }
    
    public void setDuration(final int e) {
        this.e = e;
    }
}
