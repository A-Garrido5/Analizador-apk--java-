// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.graphics.Rect;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import android.view.animation.DecelerateInterpolator;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

public class gi extends Drawable
{
    private int a;
    private int b;
    private ColorFilter c;
    private float d;
    private float e;
    private RectF f;
    private RectF g;
    private Paint h;
    private int i;
    private int j;
    private long k;
    private float l;
    private float m;
    private float n;
    private Interpolator o;
    private PointF p;
    private PointF q;
    private gj r;
    private boolean s;
    
    public gi() {
        this.a = -1;
        this.f = new RectF();
        this.g = new RectF();
        this.h = new Paint(1);
        this.i = 66;
        this.j = 1;
        this.k = 0L;
        this.m = 666.0f;
        this.n = 666.0f;
        this.o = (Interpolator)new DecelerateInterpolator();
        this.p = new PointF();
        this.q = new PointF();
    }
    
    private void a(final Canvas canvas, final float n) {
        canvas.save();
        this.p.x = 0.5f * (this.getBounds().width() - this.f.width());
        final PointF p2 = this.p;
        p2.x -= n * (0.5f * (this.getBounds().width() - 0.579f * (this.f.width() + this.e)));
        this.p.y = 0.5f * (this.getBounds().height() - this.f.height());
        this.q.x = 0.579f + 0.421f * (1.0f - n);
        this.q.y = this.q.x;
        this.g.set(this.f);
        this.a(this.g, 0.5f * this.e);
        this.g.offset(this.p.x, this.p.y);
        final float width = this.g.width();
        final RectF g = this.g;
        g.right -= 0.5f * (width * (1.0f - this.q.x));
        final RectF g2 = this.g;
        g2.right -= n * (0.5f * (width * this.q.x));
        canvas.clipRect(this.g);
        this.h.setStrokeWidth(this.e / this.q.x);
        canvas.translate(this.p.x, this.p.y);
        canvas.scale(this.q.x, this.q.y, 0.5f * this.f.width(), 0.5f * this.f.height());
        canvas.drawRoundRect(this.f, this.d, this.d, this.h);
        canvas.restore();
    }
    
    private void a(final RectF rectF, final float n) {
        rectF.left -= n;
        rectF.top -= n;
        rectF.right += n;
        rectF.bottom += n;
    }
    
    private void b(final Canvas canvas, final float n) {
        canvas.save();
        this.p.x = 0.5f * (this.getBounds().width() - this.f.width());
        final PointF p2 = this.p;
        p2.x += 0.5f * (this.getBounds().width() - 0.579f * (this.f.width() + this.e)) * (1.0f - n);
        this.p.y = 0.5f * (this.getBounds().height() - this.f.height());
        this.q.x = 0.579f + 0.421f * n;
        this.q.y = this.q.x;
        this.g.set(this.f);
        this.a(this.g, 0.5f * this.e);
        this.g.offset(this.p.x, this.p.y);
        final float width = this.g.width();
        final RectF g = this.g;
        g.left += 0.5f * (width * (1.0f - this.q.x));
        final RectF g2 = this.g;
        g2.left += 0.5f * (width * this.q.x) * (1.0f - n);
        canvas.clipRect(this.g);
        this.h.setStrokeWidth(this.e / this.q.x);
        canvas.translate(this.p.x, this.p.y);
        canvas.scale(this.q.x, this.q.y, 0.5f * this.f.width(), 0.5f * this.f.height());
        canvas.drawRoundRect(this.f, this.d, this.d, this.h);
        canvas.restore();
    }
    
    private void c(final Canvas canvas, final float n) {
        canvas.save();
        final float n2 = 0.5f * (0.421f * (this.e - this.f.width()));
        this.p.x = n2 + n * (this.getBounds().width() - 0.579f * (this.f.width() + this.e));
        this.p.y = 0.5f * (this.getBounds().height() - this.f.height());
        this.q.x = 0.579f;
        this.q.y = this.q.x;
        this.g.set(this.f);
        this.a(this.g, 0.5f * this.e);
        if (n < 0.5f) {
            this.g.offset(this.p.x, this.p.y);
            final RectF g = this.g;
            g.right -= 0.5f * (0.421f * this.g.width()) + 0.5f * (0.579f * this.g.width());
            final RectF g2 = this.g;
            g2.right -= this.p.x - n2;
        }
        else {
            this.g.offset(0.5f * this.e + this.getBounds().width() - 0.579f * this.g.width(), this.p.y);
            final RectF g3 = this.g;
            g3.left += 0.579f * this.g.width() - n * (0.5f * (0.579f * this.g.width()));
        }
        canvas.clipRect(this.g);
        this.h.setStrokeWidth(this.e / this.q.x);
        canvas.translate(this.p.x, this.p.y);
        canvas.scale(this.q.x, this.q.y, 0.5f * this.f.width(), 0.5f * this.f.height());
        canvas.drawRoundRect(this.f, this.d, this.d, this.h);
        canvas.restore();
    }
    
    public void a(final int j) {
        if (this.m >= this.n) {
            this.m = 0.0f;
            this.k = System.currentTimeMillis();
            this.j = j;
        }
        this.s = true;
        this.invalidateSelf();
    }
    
    public void a(final gj r) {
        this.r = r;
    }
    
    public boolean a() {
        return this.s;
    }
    
    public void draw(final Canvas canvas) {
        if (this.m < this.n) {
            this.l = Math.min(this.i, System.currentTimeMillis() - this.k);
            this.m = Math.min(this.n, this.m + this.l);
        }
        this.k = System.currentTimeMillis();
        final float interpolation = this.o.getInterpolation(this.m / this.n);
        this.h.setAlpha(this.b);
        this.h.setColor(this.a);
        this.h.setColorFilter(this.c);
        this.h.setStyle(Paint$Style.STROKE);
        this.c(canvas, interpolation);
        this.a(canvas, interpolation);
        this.b(canvas, interpolation);
        if (this.m < this.n) {
            this.invalidateSelf();
        }
        else if (this.s && this.m >= this.n) {
            --this.j;
            if (this.j <= 0) {
                if (this.r != null) {
                    this.r.onAnimationEnd();
                }
                this.s = false;
                return;
            }
            this.a(this.j);
            if (this.r != null) {
                this.r.a();
            }
        }
    }
    
    public int getOpacity() {
        return this.b;
    }
    
    protected void onBoundsChange(final Rect rect) {
        super.onBoundsChange(rect);
        final float n = rect.width() / 1.7368f;
        final float n2 = n / 1.0f;
        this.e = 0.08f * n2;
        this.d = 0.1f * n2;
        final float n3 = n - this.e;
        final float n4 = n2 - this.e;
        this.f.set(0.0f, 0.0f, n3, n4);
        this.g.set(0.0f, 0.0f, n3, n4);
    }
    
    public void setAlpha(final int b) {
        this.b = b;
    }
    
    public void setColorFilter(final ColorFilter c) {
        this.c = c;
    }
}
