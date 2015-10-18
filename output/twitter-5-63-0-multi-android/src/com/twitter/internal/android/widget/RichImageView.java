// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.graphics.Shader;
import android.graphics.Shader$TileMode;
import android.content.res.Resources;
import java.io.FileNotFoundException;
import android.view.View$MeasureSpec;
import android.graphics.Bitmap$Config;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.BitmapShader;
import android.graphics.drawable.shapes.Shape;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable$Callback;
import android.net.Uri;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.graphics.Bitmap;
import java.util.Arrays;
import android.content.res.TypedArray;
import android.graphics.Paint$Style;
import android.graphics.Path$Direction;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Paint;

public class RichImageView extends FixedSizeImageView
{
    private final Paint a;
    private final Path b;
    private final RectF c;
    private af d;
    private ag e;
    private float f;
    
    public RichImageView(final Context context) {
        super(context);
        this.a = new Paint(1);
        this.b = new Path();
        this.c = new RectF();
        this.a(context, null);
    }
    
    public RichImageView(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new Paint(1);
        this.b = new Path();
        this.c = new RectF();
        this.a(context, set);
    }
    
    public RichImageView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = new Paint(1);
        this.b = new Path();
        this.c = new RectF();
        this.a(context, set);
    }
    
    private void a() {
        final int n = this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight();
        final float n2 = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom() - this.f / 2.0f;
        final float n3 = n - this.f / 2.0f;
        final float n4 = this.f / 2.0f;
        this.c.set(n4, n4, n3, n2);
        this.b.reset();
        if (this.e != null) {
            this.b.addRoundRect(this.c, this.e.e, Path$Direction.CW);
            return;
        }
        this.b.addRect(this.c, Path$Direction.CW);
    }
    
    private void a(final Context context, final AttributeSet set) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.RichImageView);
        try {
            this.setOverlayDrawable(obtainStyledAttributes.getDrawable(li.RichImageView_overlayDrawable));
            final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(li.RichImageView_cornerRadius, 0);
            final int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(li.RichImageView_cornerRadiusTopLeft, dimensionPixelSize);
            final int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(li.RichImageView_cornerRadiusTopRight, dimensionPixelSize);
            final int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(li.RichImageView_cornerRadiusBottomRight, dimensionPixelSize);
            final int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(li.RichImageView_cornerRadiusBottomLeft, dimensionPixelSize);
            this.setCornerRadius(new float[] { dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize4, dimensionPixelSize5, dimensionPixelSize5 });
            obtainStyledAttributes.recycle();
            this.a.setStyle(Paint$Style.STROKE);
        }
        finally {
            obtainStyledAttributes.recycle();
        }
    }
    
    private void setCornerRadius(final float[] array) {
        int n = 1;
        while (true) {
            for (int length = array.length, i = 0; i < length; ++i) {
                if (array[i] > 0.0f) {
                    final int n2 = n;
                    if (this.e == null) {
                        n = 0;
                    }
                    if (n != n2 || (n != 0 && !Arrays.equals(this.e.e, array))) {
                        Bitmap a;
                        if (n != 0) {
                            a = this.e.f;
                        }
                        else {
                            a = null;
                        }
                        ag e;
                        if (n2 != 0) {
                            e = new ag(array);
                        }
                        else {
                            e = null;
                        }
                        this.e = e;
                        if (a != null) {
                            this.setImageBitmap(a);
                        }
                        else {
                            this.setImageDrawable(this.getDrawable());
                        }
                        this.a();
                    }
                    return;
                }
            }
            final int n2 = 0;
            continue;
        }
    }
    
    public void a(final float n, final float n2, final float n3, final float n4) {
        this.setCornerRadius(new float[] { n, n, n2, n2, n3, n3, n4, n4 });
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.d != null) {
            this.d.b(this);
        }
    }
    
    public void invalidateDrawable(final Drawable drawable) {
        if (this.d != null && drawable == this.d.b) {
            this.invalidate();
            return;
        }
        super.invalidateDrawable(drawable);
    }
    
    protected void onDraw(final Canvas canvas) {
        if (this.e != null && this.e.f != null) {
            this.e.a(this.getWidth() - this.getPaddingLeft() - this.getPaddingRight(), this.getHeight() - this.getPaddingTop() - this.getPaddingBottom());
            this.e.a(canvas, this.getPaddingLeft(), this.getPaddingTop());
        }
        else {
            super.onDraw(canvas);
        }
        if (this.d != null) {
            this.d.a(canvas);
        }
        if (this.f > 0.0f) {
            this.a.setStrokeWidth(this.f);
            canvas.drawPath(this.b, this.a);
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        if (this.e != null) {
            this.setMeasuredDimension(this.e.a(n, this.getLayoutParams().width, this.e.a()), this.e.a(n2, this.getLayoutParams().height, this.e.b()));
        }
        else {
            super.onMeasure(n, n2);
        }
        if (this.d != null) {
            this.d.a(this.getMeasuredWidth(), this.getMeasuredHeight());
        }
        this.a();
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        if (this.e != null) {
            this.e.a(n - this.getPaddingLeft() - this.getPaddingRight(), n2 - this.getPaddingTop() - this.getPaddingBottom());
        }
        if (this.d != null) {
            this.d.a(n, n2);
        }
    }
    
    public void setBorderColor(final int color) {
        this.a.setColor(color);
    }
    
    public void setBorderSize(final float f) {
        this.f = f;
        this.a();
    }
    
    public void setCornerRadius(final float n) {
        this.a(n, n, n, n);
    }
    
    protected boolean setFrame(final int n, final int n2, final int n3, final int n4) {
        final boolean setFrame = super.setFrame(n, n2, n3, n4);
        if (this.d != null) {
            this.d.a = true;
            this.d.a(this.getMeasuredWidth(), this.getMeasuredHeight());
        }
        return setFrame;
    }
    
    public void setImageBitmap(final Bitmap imageBitmap) {
        if (this.e != null) {
            this.e.a(imageBitmap);
            this.invalidate();
            return;
        }
        super.setImageBitmap(imageBitmap);
    }
    
    @Override
    public void setImageDrawable(final Drawable imageDrawable) {
        if (this.e != null) {
            this.e.a(imageDrawable);
            this.invalidate();
            return;
        }
        super.setImageDrawable(imageDrawable);
    }
    
    @Override
    public void setImageResource(final int imageResource) {
        if (this.e != null) {
            this.e.a(this.getResources(), imageResource);
            this.invalidate();
            return;
        }
        super.setImageResource(imageResource);
    }
    
    @Override
    public void setImageURI(final Uri imageURI) {
        if (this.e != null) {
            this.e.a(this.getContext(), imageURI);
            this.invalidate();
            return;
        }
        super.setImageURI(imageURI);
    }
    
    public void setOverlayDrawable(final int n) {
        Drawable drawable;
        if (n != 0) {
            drawable = this.getResources().getDrawable(n);
        }
        else {
            drawable = null;
        }
        this.setOverlayDrawable(drawable);
    }
    
    public void setOverlayDrawable(final Drawable b) {
        if (this.d != null && this.d.b != b) {
            this.d.a(this);
        }
        if (b != null) {
            af d;
            if (this.d != null) {
                d = this.d;
            }
            else {
                d = new af(null);
            }
            (d.b = b).setCallback((Drawable$Callback)this);
            d.b(this);
            this.setIgnoreLayoutRequest(true);
            this.requestLayout();
            this.setIgnoreLayoutRequest(false);
            this.d = d;
            return;
        }
        this.d = null;
    }
    
    public void setOverlayVisible(final boolean c) {
        if (this.d == null) {
            throw new IllegalStateException("Calling setOverlayVisible() requires a prior call to setOverlayDrawable() or setting the overlayDrawable attribute in the XML declaration of the " + this.getClass().getSimpleName() + " element.");
        }
        this.d.c = c;
        this.invalidate();
    }
}
