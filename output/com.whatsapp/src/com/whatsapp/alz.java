// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Bitmap;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Path;
import android.graphics.drawable.BitmapDrawable;

public class alz extends BitmapDrawable
{
    private Path a;
    private Rect b;
    private int c;
    private Paint d;
    private int e;
    private float f;
    
    public alz(final Context context, final Bitmap bitmap, final boolean b) {
        final boolean i = App.I;
        super(context.getResources(), bitmap);
        this.f = vc.b().e;
        this.e = context.getResources().getDimensionPixelSize(2131361933);
        final int width = bitmap.getWidth();
        final int height = bitmap.getHeight();
        Label_0117: {
            if (width < height) {
                this.b = new Rect(0, (height - width) / 2, width, (height + width) / 2);
                if (!i) {
                    break Label_0117;
                }
            }
            this.b = new Rect((width - height) / 2, 0, (width + height) / 2, height);
        }
        this.a = new Path();
        Label_0450: {
            if (!b) {
                this.a.moveTo(0.0f, 0.0f);
                this.a.lineTo(this.e - this.f, 0.0f);
                this.a.arcTo(new RectF(this.e - 2.0f * this.f, 0.0f, (float)this.e, 2.0f * this.f), -90.0f, 90.0f);
                this.a.lineTo((float)this.e, this.e - this.f);
                this.a.arcTo(new RectF(this.e - 2.0f * this.f, this.e - 2.0f * this.f, (float)this.e, (float)this.e), 0.0f, 90.0f);
                this.a.lineTo(0.0f, (float)this.e);
                this.a.lineTo(0.0f, 0.0f);
                if (!i) {
                    break Label_0450;
                }
            }
            this.a.moveTo((float)this.e, (float)this.e);
            this.a.lineTo(this.f, (float)this.e);
            this.a.arcTo(new RectF(0.0f, this.e - 2.0f * this.f, 2.0f * this.f, (float)this.e), 90.0f, 90.0f);
            this.a.lineTo(0.0f, this.f);
            this.a.arcTo(new RectF(0.0f, 0.0f, 2.0f * this.f, 2.0f * this.f), 180.0f, 90.0f);
            this.a.lineTo((float)this.e, 0.0f);
            this.a.lineTo((float)this.e, (float)this.e);
        }
        (this.d = new Paint()).setAntiAlias(true);
        this.d.setDither(true);
        this.d.setFilterBitmap(true);
        this.d.setColor(-1);
    }
    
    public void draw(final Canvas canvas) {
        if (this.getBitmap().isRecycled()) {
            return;
        }
        if (this.f == 0.0f) {
            super.draw(canvas);
            return;
        }
        final RectF rectF = new RectF(this.getBounds());
        final int saveLayer = canvas.saveLayer(rectF, (Paint)null, 31);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawPath(this.a, this.d);
        this.d.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.SRC_IN));
        canvas.drawBitmap(this.getBitmap(), this.b, rectF, this.d);
        this.d.setXfermode((Xfermode)null);
        canvas.restoreToCount(saveLayer);
    }
    
    public int getIntrinsicHeight() {
        return this.e;
    }
    
    public int getIntrinsicWidth() {
        return this.e;
    }
    
    public boolean isStateful() {
        return true;
    }
    
    public boolean setState(final int[] array) {
        final boolean i = App.I;
        final int c = this.c;
        this.c = 16842921;
        final int length = array.length;
        int j = 0;
        while (j < length) {
            final int n = array[j];
            if (n == 16842919) {
                this.c = 16842919;
                if (!i) {
                    break;
                }
            }
            if (n == 16842908) {
                this.c = 16842908;
            }
            ++j;
            if (i) {
                break;
            }
        }
        final int c2 = this.c;
        boolean b = false;
        if (c != c2) {
            this.invalidateSelf();
            b = true;
        }
        return b;
    }
}
