// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.widget;

import com.twitter.library.client.App;
import com.twitter.errorreporter.ErrorReporter;
import android.view.MotionEvent;
import android.graphics.Canvas;
import com.twitter.util.j;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.graphics.Rect;
import com.twitter.library.media.util.m;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Bitmap;

public class CroppableImageView extends MultiTouchImageView
{
    private final Bitmap e;
    private final Bitmap f;
    private final Bitmap g;
    private final Bitmap h;
    private final Paint i;
    private final Paint j;
    private final Paint k;
    private final RectF l;
    private final PointF m;
    private final boolean n;
    private final boolean o;
    private g p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    
    public CroppableImageView(final Context context) {
        this(context, null);
    }
    
    public CroppableImageView(final Context context, final AttributeSet set) {
        this(context, set, kv.croppableImageViewStyle);
    }
    
    public CroppableImageView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.i = new Paint();
        this.j = new Paint();
        this.k = new Paint();
        this.l = new RectF();
        this.m = new PointF();
        final Resources resources = this.getResources();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.CroppableImageView, n, 0);
        this.t = obtainStyledAttributes.getDimensionPixelSize(li.CroppableImageView_cropRectPadding, 0);
        this.u = obtainStyledAttributes.getDimensionPixelSize(li.CroppableImageView_toolbarMargin, 0);
        this.o = obtainStyledAttributes.getBoolean(li.CroppableImageView_draggableCorners, true);
        this.n = obtainStyledAttributes.getBoolean(li.CroppableImageView_showGrid, false);
        final Paint i = this.i;
        i.setColor(obtainStyledAttributes.getColor(li.CroppableImageView_cropRectStrokeColor, resources.getColor(kx.white)));
        i.setStyle(Paint$Style.STROKE);
        i.setStrokeWidth(obtainStyledAttributes.getFloat(li.CroppableImageView_cropRectStrokeWidth, 2.0f));
        final Paint j = this.j;
        j.setColor(obtainStyledAttributes.getColor(li.CroppableImageView_gridColor, 0));
        j.setStyle(Paint$Style.STROKE);
        j.setStrokeWidth(0.0f);
        this.k.setColor(obtainStyledAttributes.getColor(li.CroppableImageView_cropShadowColor, resources.getColor(kx.dark_transparent_black)));
        obtainStyledAttributes.recycle();
        if (this.o) {
            final Matrix matrix = new Matrix();
            this.e = BitmapFactory.decodeResource(this.getResources(), kz.ic_filters_crop_corner);
            matrix.postRotate(90.0f);
            this.f = com.twitter.library.media.util.m.a(this.e, null, matrix, false);
            matrix.postRotate(90.0f);
            this.h = com.twitter.library.media.util.m.a(this.e, null, matrix, false);
            matrix.postRotate(90.0f);
            this.g = com.twitter.library.media.util.m.a(this.e, null, matrix, false);
            this.s = this.e.getWidth();
            return;
        }
        this.e = null;
        this.f = null;
        this.h = null;
        this.g = null;
    }
    
    private int a(final PointF pointF) {
        final RectF c = this.c;
        if (com.twitter.util.j.a(pointF, c.left, c.top) < this.s) {
            return 1;
        }
        if (com.twitter.util.j.a(pointF, c.right, c.top) < this.s) {
            return 2;
        }
        if (com.twitter.util.j.a(pointF, c.right, c.bottom) < this.s) {
            return 3;
        }
        if (com.twitter.util.j.a(pointF, c.left, c.bottom) < this.s) {
            return 4;
        }
        return 0;
    }
    
    private void a(final int n, final float n2, final float n3) {
        final RectF imageRect = this.getImageRect();
        final RectF c = this.c;
        final float n4 = this.s;
        switch (n) {
            case 1: {
                c.left += com.twitter.util.g.a(n2, c.left, c.left, imageRect.left, c.right - n4);
                c.top += com.twitter.util.g.a(n3, c.top, c.top, imageRect.top, c.bottom - n4);
                break;
            }
            case 2: {
                c.right += com.twitter.util.g.a(n2, c.right, c.right, n4 + c.left, imageRect.right);
                c.top += com.twitter.util.g.a(n3, c.top, c.top, imageRect.top, c.bottom - n4);
                break;
            }
            case 3: {
                c.right += com.twitter.util.g.a(n2, c.right, c.right, n4 + c.left, imageRect.right);
                c.bottom += com.twitter.util.g.a(n3, c.bottom, c.bottom, n4 + c.top, imageRect.bottom);
                break;
            }
            case 4: {
                c.left += com.twitter.util.g.a(n2, c.left, c.left, imageRect.left, c.right - n4);
                c.bottom += com.twitter.util.g.a(n3, c.bottom, c.bottom, n4 + c.top, imageRect.bottom);
                break;
            }
        }
        this.invalidate();
    }
    
    private void a(final boolean b) {
        final RectF c = this.c;
        final RectF paddedViewRect = this.getPaddedViewRect();
        final float centerX = c.centerX();
        final float centerY = c.centerY();
        final float centerX2 = paddedViewRect.centerX();
        final float centerY2 = paddedViewRect.centerY();
        final float n = centerX2 - centerX;
        final float n2 = centerY2 - centerY;
        final float a = com.twitter.util.j.a(c, paddedViewRect, true);
        if (n != 0.0f || n2 != 0.0f || a != 1.0f) {
            if (!b) {
                this.a(centerX, centerY, n, n2, a, 0);
                this.a(n, n2, a);
                return;
            }
            new i(this, centerX, centerX2, centerY, centerY2, a).a();
        }
    }
    
    private RectF getPaddedViewRect() {
        final RectF rectF = new RectF(this.b);
        rectF.top += this.u;
        rectF.inset((float)this.t, (float)this.t);
        return rectF;
    }
    
    private void setAnimating(final boolean q) {
        this.q = q;
    }
    
    @Override
    protected void a() {
        this.a(false);
    }
    
    public void a(final int n, final boolean b) {
        if (this.q) {
            return;
        }
        this.d += n;
        if (!b) {
            this.a(this.c.centerX(), this.c.centerY(), 0.0f, 0.0f, 1.0f, n);
            this.d();
            return;
        }
        new h(this, n).a();
    }
    
    @Override
    protected void b() {
        if (this.c() && this.v != 0) {
            this.setRotation(this.v);
            this.v = 0;
        }
        super.b();
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final int width = canvas.getWidth();
        final int height = canvas.getHeight();
        final RectF c = this.c;
        final RectF l = this.l;
        final Paint k = this.k;
        l.set(0.0f, c.top, c.left, c.bottom);
        canvas.drawRect(l, k);
        l.set(0.0f, 0.0f, (float)width, c.top);
        canvas.drawRect(l, k);
        l.set(c.right, c.top, (float)width, c.bottom);
        canvas.drawRect(l, k);
        l.set(0.0f, c.bottom, (float)width, (float)height);
        canvas.drawRect(l, k);
        canvas.drawRect(this.c, this.i);
        if (this.n) {
            final float n = c.left + 0.33333334f * c.width();
            final float n2 = c.left + 0.6666667f * c.width();
            final float n3 = c.top + 0.33333334f * c.height();
            final float n4 = c.top + 0.6666667f * c.height();
            canvas.drawLine(n, c.top, n, c.bottom, this.j);
            canvas.drawLine(n2, c.top, n2, c.bottom, this.j);
            canvas.drawLine(c.left, n3, c.right, n3, this.j);
            canvas.drawLine(c.left, n4, c.right, n4, this.j);
            final int width2 = this.e.getWidth();
            final float n5 = 0.13636364f * width2 - 1.0f;
            canvas.drawBitmap(this.e, c.left - n5, c.top - n5, (Paint)null);
            canvas.drawBitmap(this.f, n5 + (c.right - width2), c.top - n5, (Paint)null);
            canvas.drawBitmap(this.h, n5 + (c.right - width2), n5 + (c.bottom - width2), (Paint)null);
            canvas.drawBitmap(this.g, c.left - n5, n5 + (c.bottom - width2), (Paint)null);
        }
    }
    
    @Override
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.q || !this.c()) {
            return false;
        }
        if (!this.o) {
            return super.onTouchEvent(motionEvent);
        }
        switch (0xFF & motionEvent.getAction()) {
            case 0: {
                this.m.set(motionEvent.getX(), motionEvent.getY());
                this.r = this.a(this.m);
                if (this.r != 0) {
                    return true;
                }
                break;
            }
            case 2: {
                if (this.r != 0) {
                    final PointF pointF = new PointF(motionEvent.getX(0), motionEvent.getY(0));
                    pointF.set(com.twitter.util.g.a(pointF.x, 0.0f, 0.0f, this.b.left, this.b.right), com.twitter.util.g.a(pointF.y, 0.0f, 0.0f, this.b.top, this.b.bottom));
                    this.a(this.r, pointF.x - this.m.x, pointF.y - this.m.y);
                    if (this.p != null) {
                        this.p.a();
                    }
                    this.m.set(pointF);
                    return true;
                }
                break;
            }
            case 1:
            case 3: {
                if (this.r != 0) {
                    this.r = 0;
                    this.a(true);
                    return true;
                }
                break;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public void setCropAspectRatio(final float n) {
        final RectF imageRect = this.getImageRect();
        if (imageRect != null) {
            imageRect.intersect(this.getPaddedViewRect());
            int n2;
            if (imageRect.width() / imageRect.height() < n) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            if (n2 != 0) {
                imageRect.inset(0.0f, (imageRect.height() - imageRect.width() / n) / 2.0f);
            }
            else {
                imageRect.inset((imageRect.width() - n * imageRect.height()) / 2.0f, 0.0f);
            }
            this.c.set(imageRect);
            this.a(true);
            this.invalidate();
        }
        else {
            final IllegalStateException ex = new IllegalStateException("Crop aspect ratio cannot be set until drawable is ready");
            ErrorReporter.a(ex);
            if (App.a()) {
                throw ex;
            }
        }
    }
    
    public void setCropListener(final g p) {
        this.p = p;
    }
    
    public void setRotation(final int n) {
        if (!this.c()) {
            this.v = n;
            return;
        }
        final int n2 = n - this.d;
        this.a(this.c.centerX(), this.c.centerY(), 0.0f, 0.0f, 1.0f, n2);
        final Matrix matrix = new Matrix();
        matrix.postRotate((float)n2, this.c.centerX(), this.c.centerY());
        matrix.mapRect(this.c);
        this.d();
        this.d = n;
    }
}
