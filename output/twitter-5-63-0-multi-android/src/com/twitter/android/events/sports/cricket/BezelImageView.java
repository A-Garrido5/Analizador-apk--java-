// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events.sports.cricket;

import android.graphics.ColorFilter;
import android.view.View;
import android.support.v4.view.ViewCompat;
import android.content.res.TypedArray;
import android.graphics.ColorMatrix;
import android.graphics.Bitmap$Config;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable$Callback;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.RectF;
import android.graphics.Rect;
import android.graphics.Paint;
import android.widget.ImageView;

public class BezelImageView extends ImageView
{
    private Paint a;
    private Paint b;
    private Rect c;
    private RectF d;
    private Drawable e;
    private Drawable f;
    private ColorMatrixColorFilter g;
    private boolean h;
    private boolean i;
    private Bitmap j;
    private int k;
    private int l;
    private Canvas m;
    
    public BezelImageView(final Context context) {
        this(context, null);
    }
    
    public BezelImageView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public BezelImageView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, pa.BezelImageView, n, 0);
        this.f = obtainStyledAttributes.getDrawable(0);
        if (this.f != null) {
            this.f.setCallback((Drawable$Callback)this);
        }
        this.e = obtainStyledAttributes.getDrawable(1);
        if (this.e != null) {
            this.e.setCallback((Drawable$Callback)this);
        }
        this.h = obtainStyledAttributes.getBoolean(2, false);
        obtainStyledAttributes.recycle();
        (this.a = new Paint()).setColor(-16777216);
        (this.b = new Paint()).setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.SRC_IN));
        this.j = Bitmap.createBitmap(1, 1, Bitmap$Config.ARGB_8888);
        if (this.h) {
            final ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            this.g = new ColorMatrixColorFilter(colorMatrix);
        }
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.e != null && this.e.isStateful()) {
            this.e.setState(this.getDrawableState());
        }
        if (this.f != null && this.f.isStateful()) {
            this.f.setState(this.getDrawableState());
        }
        if (this.isDuplicateParentStateEnabled()) {
            ViewCompat.postInvalidateOnAnimation((View)this);
        }
    }
    
    public void invalidateDrawable(final Drawable drawable) {
        if (drawable == this.e || drawable == this.f) {
            this.invalidate();
            return;
        }
        super.invalidateDrawable(drawable);
    }
    
    protected void onDraw(final Canvas canvas) {
        if (this.c == null) {
            return;
        }
        final int width = this.c.width();
        final int height = this.c.height();
        if (!this.i || width != this.k || height != this.l) {
            if (width == this.k && height == this.l) {
                this.j.eraseColor(0);
            }
            else {
                this.j.recycle();
                this.j = Bitmap.createBitmap(width, height, Bitmap$Config.ARGB_8888);
                this.k = width;
                this.l = height;
            }
            this.m = new Canvas(this.j);
            if (this.f != null) {
                final int save = this.m.save();
                this.f.draw(this.m);
                final Paint b = this.b;
                Object g;
                if (this.h && this.isPressed()) {
                    g = this.g;
                }
                else {
                    g = null;
                }
                b.setColorFilter((ColorFilter)g);
                this.m.saveLayer(this.d, this.b, 12);
                super.onDraw(this.m);
                this.m.restoreToCount(save);
            }
            else if (this.h && this.isPressed()) {
                final int save2 = this.m.save();
                this.m.drawRect(0.0f, 0.0f, (float)this.k, (float)this.l, this.a);
                this.b.setColorFilter((ColorFilter)this.g);
                this.m.saveLayer(this.d, this.b, 12);
                super.onDraw(this.m);
                this.m.restoreToCount(save2);
            }
            else {
                super.onDraw(this.m);
            }
            if (this.e != null) {
                this.e.draw(this.m);
            }
        }
        canvas.drawBitmap(this.j, (float)this.c.left, (float)this.c.top, (Paint)null);
    }
    
    protected boolean setFrame(final int n, final int n2, final int n3, final int n4) {
        final boolean setFrame = super.setFrame(n, n2, n3, n4);
        this.c = new Rect(0, 0, n3 - n, n4 - n2);
        this.d = new RectF(this.c);
        if (this.e != null) {
            this.e.setBounds(this.c);
        }
        if (this.f != null) {
            this.f.setBounds(this.c);
        }
        if (setFrame) {
            this.i = false;
        }
        return setFrame;
    }
    
    protected boolean verifyDrawable(final Drawable drawable) {
        return drawable == this.e || drawable == this.f || super.verifyDrawable(drawable);
    }
}
