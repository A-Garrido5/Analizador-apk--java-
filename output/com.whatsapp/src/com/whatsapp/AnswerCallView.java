// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.annotation.TargetApi;
import android.graphics.Paint$Style;
import android.graphics.Path$FillType;
import android.graphics.Canvas;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;
import android.graphics.Path;
import android.graphics.Paint;
import android.view.View;

public class AnswerCallView extends View
{
    private static final int a;
    private static final int d;
    private static final int t;
    private static final int u;
    private static final boolean x;
    private static final int[] y;
    private float b;
    private Paint c;
    private int e;
    private boolean f;
    private Path g;
    private float h;
    private a2 i;
    private int j;
    private boolean k;
    private Drawable l;
    private Drawable m;
    private Path n;
    private boolean o;
    private Path p;
    private Drawable q;
    private float r;
    private boolean s;
    private ad2 v;
    private Drawable w;
    
    static {
        x = (Build$VERSION.SDK_INT >= 8);
        u = App.aq.getResources().getColor(2131624025);
        a = App.aq.getResources().getColor(2131624026);
        t = App.aq.getResources().getColor(2131623967);
        d = App.aq.getResources().getColor(2131623968);
        y = new int[] { 0, 70, 130 };
    }
    
    public AnswerCallView(final Context context) {
        this(context, null);
    }
    
    public AnswerCallView(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = new Paint(1);
        this.p = new Path();
        this.g = new Path();
        this.n = new Path();
        this.j = -1;
        this.e = -1;
        this.w = context.getResources().getDrawable(2130838748);
        this.m = context.getResources().getDrawable(2130838747);
        this.q = context.getResources().getDrawable(2130838750);
        this.l = context.getResources().getDrawable(2130838749);
    }
    
    static float a(final AnswerCallView answerCallView, final float b) {
        return answerCallView.b = b;
    }
    
    private void a(final MotionEvent motionEvent) {
        float n = 0.0f;
        Label_0026: {
            if (AnswerCallView.x) {
                n = motionEvent.getX(motionEvent.getActionIndex());
                if (!App.I) {
                    break Label_0026;
                }
            }
            n = motionEvent.getX();
        }
        if (n > 0.0f && n < 5 * this.getHeight() / 4) {
            this.s = true;
        }
        if (n < this.getWidth() && n > this.getWidth() - 5 * this.getHeight() / 4) {
            this.f = true;
        }
        this.r = n;
        this.h = n;
    }
    
    private void b(final MotionEvent motionEvent) {
        final boolean i = App.I;
        float n = 0.0f;
        Label_0028: {
            if (AnswerCallView.x) {
                n = motionEvent.getX(motionEvent.getActionIndex());
                if (!i) {
                    break Label_0028;
                }
            }
            n = motionEvent.getX();
        }
        Label_0150: {
            if (this.s && n > this.getWidth() / 2) {
                if (this.v == null || this.k) {
                    break Label_0150;
                }
                this.v.a();
                this.k = true;
                if (!i) {
                    break Label_0150;
                }
            }
            if (this.f && n < this.getWidth() / 2) {
                if (this.v == null || this.o) {
                    break Label_0150;
                }
                this.v.b();
                this.o = true;
                if (!i) {
                    break Label_0150;
                }
            }
            if (this.v != null) {
                this.v.a(this.s);
            }
        }
        this.s = false;
        this.f = false;
    }
    
    private void c(final MotionEvent motionEvent) {
        this.s = false;
        this.f = false;
    }
    
    private void d(final MotionEvent motionEvent) {
        float h = 0.0f;
        Label_0026: {
            if (AnswerCallView.x) {
                h = motionEvent.getX(motionEvent.getActionIndex());
                if (!App.I) {
                    break Label_0026;
                }
            }
            h = motionEvent.getX();
        }
        this.h = h;
        this.invalidate();
    }
    
    public void a() {
        this.k = false;
        this.o = false;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        (this.i = new a2(this, null)).setDuration(800L);
        this.i.setRepeatCount(-1);
        this.i.setInterpolator((Interpolator)new DecelerateInterpolator());
        this.startAnimation((Animation)this.i);
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.clearAnimation();
    }
    
    public void onDraw(final Canvas canvas) {
        int i = 0;
        final boolean j = App.I;
        super.onDraw(canvas);
        canvas.drawColor(AnswerCallView.u);
        final int width = this.getWidth();
        final int height = this.getHeight();
        int min = 0;
        Label_0075: {
            if (this.k) {
                min = width - height;
                if (!j) {
                    break Label_0075;
                }
            }
            else {
                min = 0;
            }
            if (this.s) {
                min = Math.min((int)(this.h - this.r), width - height);
            }
        }
        int min2 = 0;
        Label_0120: {
            if (this.o) {
                min2 = width - height;
                if (!j) {
                    break Label_0120;
                }
            }
            else {
                min2 = 0;
            }
            if (this.f) {
                min2 = Math.min((int)(this.r - this.h), width - height);
            }
        }
        if (!this.f && !this.s && !this.k && !this.o) {
            canvas.save();
            canvas.translate(height - height / 4 + this.b * (width - height * 5 / 2), 0.0f);
            while (i < AnswerCallView.y.length) {
                this.c.setColor(AnswerCallView.a);
                int alpha = 255 - AnswerCallView.y[i];
                if (this.b > 0.8f) {
                    alpha = (int)(alpha * 5 * (1.0f - this.b));
                }
                this.c.setAlpha(alpha);
                canvas.drawPath(this.n, this.c);
                canvas.translate((float)(height * -2 / 5), 0.0f);
                ++i;
                if (j) {
                    break;
                }
            }
            canvas.restore();
            this.c.setAlpha(255);
        }
        if (!this.f && !this.o) {
            if (this.j != min) {
                this.j = min;
                this.p.rewind();
                this.p.moveTo(0.0f, 0.0f);
                this.p.lineTo((float)(height + min), 0.0f);
                this.p.lineTo((float)(min + (height + height / 4)), (float)(height / 2));
                this.p.lineTo((float)(height + min), (float)height);
                this.p.lineTo(0.0f, (float)height);
                this.p.lineTo(0.0f, 0.0f);
                this.p.close();
                this.p.setFillType(Path$FillType.WINDING);
            }
            Drawable drawable = null;
            Label_0476: {
                if (this.s || this.k) {
                    this.c.setColor(AnswerCallView.t);
                    drawable = this.m;
                    if (!j) {
                        break Label_0476;
                    }
                }
                this.c.setColor(AnswerCallView.a);
                drawable = this.w;
            }
            this.c.setStyle(Paint$Style.FILL);
            canvas.drawPath(this.p, this.c);
            final int intrinsicHeight = drawable.getIntrinsicHeight();
            final int intrinsicWidth = drawable.getIntrinsicWidth();
            final int n = (height - intrinsicWidth) / 2;
            final int n2 = (height - intrinsicHeight) / 2;
            drawable.setBounds(n + min, n2, min + (intrinsicWidth + n), intrinsicHeight + n2);
            drawable.draw(canvas);
        }
        if (!this.s && !this.k) {
            if (this.e != min2) {
                this.g.rewind();
                this.g.moveTo((float)width, 0.0f);
                this.g.lineTo((float)(width - height - min2), 0.0f);
                this.g.lineTo((float)(width - height - height / 4 - min2), (float)(height / 2));
                this.g.lineTo((float)(width - height - min2), (float)height);
                this.g.lineTo((float)width, (float)height);
                this.g.lineTo((float)width, 0.0f);
                this.g.close();
                this.g.setFillType(Path$FillType.WINDING);
                this.e = min2;
            }
            Drawable drawable2 = null;
            Label_0761: {
                if (this.f || this.o) {
                    this.c.setColor(AnswerCallView.d);
                    drawable2 = this.l;
                    if (!j) {
                        break Label_0761;
                    }
                }
                this.c.setColor(AnswerCallView.a);
                drawable2 = this.q;
            }
            this.c.setStyle(Paint$Style.FILL);
            canvas.drawPath(this.g, this.c);
            final int intrinsicHeight2 = drawable2.getIntrinsicHeight();
            final int intrinsicWidth2 = drawable2.getIntrinsicWidth();
            final int n3 = width - (height + intrinsicWidth2) / 2;
            final int n4 = (height - intrinsicHeight2) / 2;
            drawable2.setBounds(n3 - min2, n4, intrinsicWidth2 + n3 - min2, intrinsicHeight2 + n4);
            drawable2.draw(canvas);
        }
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        final int height = this.getHeight();
        this.n.rewind();
        this.n.moveTo(0.0f, 0.0f);
        this.n.lineTo((float)(height / 4), 0.0f);
        this.n.lineTo((float)(height / 2), (float)(height / 2));
        this.n.lineTo((float)(height / 4), (float)height);
        this.n.lineTo(0.0f, (float)height);
        this.n.lineTo((float)(height / 4), (float)(height / 2));
        this.n.close();
        this.n.setFillType(Path$FillType.WINDING);
    }
    
    @TargetApi(8)
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final boolean i = App.I;
        int n = 0;
        Label_0024: {
            if (AnswerCallView.x) {
                n = motionEvent.getActionMasked();
                if (!i) {
                    break Label_0024;
                }
            }
            n = motionEvent.getAction();
        }
        while (true) {
            Label_0154: {
                int n2 = 0;
                Label_0138: {
                    switch (n) {
                        default: {
                            n2 = 0;
                            break;
                        }
                        case 0:
                        case 5: {
                            this.a(motionEvent);
                            this.d(motionEvent);
                            if (i) {
                                break Label_0138;
                            }
                            break Label_0154;
                        }
                        case 2: {
                            this.d(motionEvent);
                            if (i) {
                                break Label_0138;
                            }
                            break Label_0154;
                        }
                        case 1:
                        case 6: {
                            this.d(motionEvent);
                            this.b(motionEvent);
                            if (i) {
                                break Label_0138;
                            }
                            break Label_0154;
                        }
                        case 3: {
                            this.d(motionEvent);
                            this.c(motionEvent);
                            n2 = 1;
                            break;
                        }
                    }
                }
                this.invalidate();
                if (n2 == 0) {
                    final boolean onTouchEvent = super.onTouchEvent(motionEvent);
                    final boolean b = false;
                    if (!onTouchEvent) {
                        return b;
                    }
                }
                return true;
            }
            int n2 = 1;
            continue;
        }
    }
    
    protected void onVisibilityChanged(final View view, final int n) {
        if (this.getVisibility() == 0) {
            if (this.getAnimation() != null || this.i == null) {
                return;
            }
            this.startAnimation((Animation)this.i);
            if (!App.I) {
                return;
            }
        }
        this.clearAnimation();
    }
    
    public void setAnswerCallListener(final ad2 v) {
        this.v = v;
    }
}
