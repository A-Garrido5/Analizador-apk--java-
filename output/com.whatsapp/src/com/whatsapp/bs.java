// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.MaskFilter;
import android.graphics.Paint$Style;
import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter$Blur;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

class bs extends Drawable
{
    private int a;
    final Broadcasts b;
    private Paint c;
    private int d;
    private Paint e;
    
    public bs(final Broadcasts b, final int d, final int a) {
        this.b = b;
        this.c = new Paint(1);
        this.e = new Paint(1);
        this.a = a;
        this.d = d;
    }
    
    public void draw(final Canvas canvas) {
        final float n = 3.0f * vc.b().b / 2.0f;
        final Rect rect = new Rect(this.getBounds());
        rect.right -= (int)(2.0f * n);
        rect.bottom -= (int)(2.0f * n);
        final int n2 = Math.min(rect.width(), rect.height()) / 2 - (int)n;
        final BlurMaskFilter maskFilter = new BlurMaskFilter(n, BlurMaskFilter$Blur.NORMAL);
        this.c.setColor(-10066330);
        this.c.setStyle(Paint$Style.FILL);
        this.c.setMaskFilter((MaskFilter)maskFilter);
        canvas.translate(2.0f * n / 3.0f, n);
        canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), (float)n2, this.c);
        canvas.translate(-2.0f * n / 3.0f, -n);
        this.c.setMaskFilter((MaskFilter)null);
        this.e.setStrokeWidth(1.0f);
        this.e.setStyle(Paint$Style.STROKE);
        this.e.setColor(-1728053248);
        canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), (float)n2, this.e);
        final RectF rectF = new RectF(rect.exactCenterX() - n2, rect.exactCenterY() - n2, rect.exactCenterX() + n2, rect.exactCenterY() + n2);
        this.e.setStyle(Paint$Style.FILL);
        if (this.a == 0) {
            this.e.setColor(-1728001024);
            canvas.drawArc(rectF, 270.0f, 360.0f, true, this.e);
            if (!App.I) {
                return;
            }
        }
        this.e.setColor(-1728001024);
        canvas.drawArc(rectF, 270.0f, (float)(360 * this.d / this.a), true, this.e);
        this.e.setColor(-1426063361);
        canvas.drawArc(rectF, (float)(270 + 360 * this.d / this.a), (float)(360 - 360 * this.d / this.a), true, this.e);
    }
    
    public int getOpacity() {
        return 0;
    }
    
    public void setAlpha(final int n) {
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
    }
}
