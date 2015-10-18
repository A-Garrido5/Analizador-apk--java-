// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.widget;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.graphics.drawable.Drawable;
import com.twitter.util.j;
import com.twitter.internal.android.util.Size;
import com.twitter.util.g;
import android.view.MotionEvent;
import android.util.AttributeSet;
import android.widget.ImageView$ScaleType;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.widget.ImageView;

public class MultiTouchImageView extends ImageView
{
    protected final Matrix a;
    protected final RectF b;
    protected final RectF c;
    protected int d;
    private final Rect e;
    private final PointF f;
    private boolean g;
    private int h;
    private float i;
    private RectF j;
    
    public MultiTouchImageView(final Context context) {
        super(context);
        this.a = new Matrix();
        this.b = new RectF();
        this.c = new RectF();
        this.e = new Rect();
        this.f = new PointF();
        this.g = true;
        this.h = 0;
        this.i = 1.0f;
        this.setScaleType(ImageView$ScaleType.MATRIX);
    }
    
    public MultiTouchImageView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public MultiTouchImageView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = new Matrix();
        this.b = new RectF();
        this.c = new RectF();
        this.e = new Rect();
        this.f = new PointF();
        this.g = true;
        this.h = 0;
        this.i = 1.0f;
        this.setScaleType(ImageView$ScaleType.MATRIX);
    }
    
    private static float a(final MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            return g.a(motionEvent.getX(0) - motionEvent.getX(1), motionEvent.getY(0) - motionEvent.getY(1));
        }
        return 0.0f;
    }
    
    private void a(final RectF rectF, final int d) {
        if (d != 0) {
            this.d = d;
            this.a(this.b.centerX(), this.b.centerY(), 0.0f, 0.0f, 1.0f, d);
        }
        this.a.mapRect(this.c, rectF);
    }
    
    private Size getDrawableSize() {
        if (this.getDrawable() != null) {
            return Size.a(this.getDrawable());
        }
        return Size.a;
    }
    
    protected void a() {
        final RectF rectF = new RectF(this.c);
        final RectF rectF2 = new RectF(this.b);
        final float centerX = rectF.centerX();
        final float centerY = rectF.centerY();
        final float centerX2 = rectF2.centerX();
        final float centerY2 = rectF2.centerY();
        final float n = centerX2 - centerX;
        final float n2 = centerY2 - centerY;
        final float a = com.twitter.util.j.a(rectF, rectF2, true);
        this.a(centerX, centerY, n, n2, a, 0);
        this.a(n, n2, a);
    }
    
    protected void a(final float n, final float n2, final float n3) {
        if (n3 == 1.0f && n == 0.0f && n2 == 0.0f) {
            return;
        }
        if (n3 != 1.0f) {
            this.c.inset((1.0f - n3) * this.c.width() / 2.0f, (1.0f - n3) * this.c.height() / 2.0f);
        }
        if (n != 0.0f || n2 != 0.0f) {
            this.c.offset(n, n2);
        }
        this.invalidate();
    }
    
    public void a(final float n, final float n2, final float n3, final float n4, final float n5, final int n6) {
        final int n7 = n6 % 360;
        if (n7 == 0 && n5 == 1.0f && n3 == 0.0f && n4 == 0.0f) {
            return;
        }
        if (n7 != 0) {
            this.a.postRotate((float)n7, n, n2);
        }
        if (n5 != 1.0f) {
            this.a.postScale(n5, n5, n, n2);
        }
        if (n3 != 0.0f || n4 != 0.0f) {
            this.a.postTranslate(n3, n4);
        }
        this.setScaleType(ImageView$ScaleType.MATRIX);
        this.setImageMatrix(this.a);
    }
    
    protected void b() {
        if (this.c()) {
            if (this.j != null) {
                this.setImageSelection(this.j);
                this.j = null;
            }
            if (this.g) {
                this.c.set(this.getImageRect());
            }
            this.a();
            this.d();
        }
    }
    
    protected boolean c() {
        final Drawable drawable = this.getDrawable();
        return drawable != null && drawable.getIntrinsicWidth() > 0 && this.b.width() > 0.0f;
    }
    
    protected void d() {
        final RectF imageRect = this.getImageRect();
        if (imageRect == null || imageRect.contains(this.c)) {
            return;
        }
        final RectF c = this.c;
        final RectF b = this.b;
        final float max = Math.max(1.0f, com.twitter.util.j.a(imageRect, c, false));
        final float centerX = b.centerX();
        final float centerY = b.centerY();
        this.a(centerX, centerY, 0.0f, 0.0f, max, 0);
        imageRect.set(this.getImageRect());
        this.a(centerX, centerY, com.twitter.util.g.a(0.0f, imageRect.right, imageRect.left, c.right, c.left), com.twitter.util.g.a(0.0f, imageRect.bottom, imageRect.top, c.bottom, c.top), 1.0f, 0);
    }
    
    public RectF getActiveRect() {
        return this.c;
    }
    
    protected RectF getImageRect() {
        final Drawable drawable = this.getDrawable();
        if (drawable != null) {
            final RectF rectF = new RectF(0.0f, 0.0f, (float)drawable.getIntrinsicWidth(), (float)drawable.getIntrinsicHeight());
            this.a.mapRect(rectF);
            return rectF;
        }
        return null;
    }
    
    public int getImageRotation() {
        return this.d;
    }
    
    public RectF getNormalizedImageSelection() {
        final Size drawableSize = this.getDrawableSize();
        if (!drawableSize.c()) {
            final RectF rectF = new RectF(this.c);
            final Matrix matrix = new Matrix();
            this.a.invert(matrix);
            matrix.mapRect(rectF);
            return com.twitter.util.j.b(rectF, drawableSize);
        }
        return new RectF(0.0f, 0.0f, 1.0f, 1.0f);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (b) {
            this.getDrawingRect(this.e);
            this.b.set(this.e);
            this.b();
        }
    }
    
    protected void onRestoreInstanceState(final Parcelable parcelable) {
        this.g = false;
        final Bundle bundle = (Bundle)parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("parent_bundle"));
        this.a((RectF)bundle.getParcelable("image_selection"), bundle.getInt("rotation", 0));
    }
    
    protected Parcelable onSaveInstanceState() {
        final Bundle bundle = new Bundle();
        bundle.putParcelable("parent_bundle", super.onSaveInstanceState());
        bundle.putParcelable("image_selection", (Parcelable)com.twitter.util.j.a(this.getNormalizedImageSelection(), this.getDrawableSize()));
        bundle.putInt("rotation", this.d);
        return (Parcelable)bundle;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (!this.c()) {
            return false;
        }
        this.getParent().requestDisallowInterceptTouchEvent(true);
        switch (0xFF & motionEvent.getAction()) {
            default: {
                return super.onTouchEvent(motionEvent);
            }
            case 0: {
                if (this.h == 0) {
                    this.f.set(motionEvent.getX(), motionEvent.getY());
                    this.h = 1;
                    break;
                }
                break;
            }
            case 5: {
                if (this.h == 1) {
                    this.i = a(motionEvent);
                    this.h = 2;
                    break;
                }
                break;
            }
            case 2: {
                if (this.h == 1) {
                    final PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
                    final RectF imageRect = this.getImageRect();
                    final float a = com.twitter.util.g.a(pointF.x - this.f.x, imageRect.right, imageRect.left, this.c.right, this.c.left);
                    this.a(0.0f, 0.0f, a, com.twitter.util.g.a(pointF.y - this.f.y, imageRect.bottom, imageRect.top, this.c.bottom, this.c.top), 1.0f, 0);
                    boolean b;
                    if (a == 0.0f && a != pointF.x - this.f.x) {
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    this.getParent().requestDisallowInterceptTouchEvent(!b);
                    this.f.set(pointF);
                    break;
                }
                if (this.h == 2) {
                    final float a2 = a(motionEvent);
                    if (this.i != 0.0f) {
                        this.a(this.c.centerX(), this.c.centerY(), 0.0f, 0.0f, a2 / this.i, 0);
                    }
                    this.i = a2;
                    break;
                }
                return super.onTouchEvent(motionEvent);
            }
            case 1:
            case 3:
            case 6: {
                this.h = 0;
                this.d();
                break;
            }
        }
        return true;
    }
    
    public void setImageBitmap(final Bitmap imageBitmap) {
        this.g = (this.g && !this.getDrawableSize().d(Size.a(imageBitmap)));
        super.setImageBitmap(imageBitmap);
        this.b();
    }
    
    public void setImageSelection(final RectF j) {
        if (!this.c()) {
            this.j = j;
            return;
        }
        final RectF a = j.a(j, this.getDrawableSize());
        this.g = false;
        this.a.mapRect(a);
        this.c.set(a);
        this.a();
        this.d();
    }
    
    public void setScaleType(final ImageView$ScaleType imageView$ScaleType) {
        super.setScaleType(ImageView$ScaleType.MATRIX);
    }
}
