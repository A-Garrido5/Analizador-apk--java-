// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.MaskFilter;
import android.graphics.Paint$Style;
import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter$Blur;
import android.graphics.Canvas;
import android.graphics.Path$FillType;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

public class yj extends Drawable
{
    private Paint a;
    private int b;
    private int c;
    private float d;
    
    public yj() {
        this.b = 18;
        this.c = 16842921;
        this.d = 3.0f;
        this.a = new Paint(1);
        this.d = 2.0f * vc.b().b;
    }
    
    private Path a(final float n, final float n2) {
        final Path path = new Path();
        final int n3 = (int)(2.0f * vc.b().b);
        path.moveTo(n / 2.0f - 2 * this.b / 3, n2 - this.b);
        path.lineTo(n / 2.0f, n2);
        path.lineTo(n / 2.0f + 2 * this.b / 3, n2 - this.b);
        path.lineTo(n - n3, n2 - this.b);
        path.arcTo(new RectF(n - n3 * 2, n2 - this.b - n3 * 2, n, n2 - this.b), 90.0f, -90.0f);
        path.lineTo(n, (float)n3);
        path.arcTo(new RectF(n - n3 * 2, 0.0f, n, (float)(n3 * 2)), 0.0f, -90.0f);
        path.lineTo((float)n3, 0.0f);
        path.arcTo(new RectF(0.0f, 0.0f, (float)(n3 * 2), (float)(n3 * 2)), -90.0f, -90.0f);
        path.lineTo(0.0f, n2 - this.b - n3);
        path.arcTo(new RectF(0.0f, n2 - this.b - n3 * 2, (float)(n3 * 2), n2 - this.b), -180.0f, -90.0f);
        path.close();
        path.setFillType(Path$FillType.WINDING);
        return path;
    }
    
    public void a(final int b) {
        this.b = b;
    }
    
    public void draw(final Canvas canvas) {
        this.a.setARGB(255, 0, 0, 0);
        final Rect bounds = this.getBounds();
        final Path a = this.a(bounds.width() - 2.0f * this.d, bounds.height() - 2.0f * this.d);
        final BlurMaskFilter maskFilter = new BlurMaskFilter(this.d, BlurMaskFilter$Blur.NORMAL);
        this.a.setColor(-1724697805);
        this.a.setStyle(Paint$Style.FILL);
        this.a.setMaskFilter((MaskFilter)maskFilter);
        canvas.translate(this.d, 1.5f * this.d);
        canvas.drawPath(a, this.a);
        canvas.translate(-this.d, 1.5f * -this.d);
        canvas.translate(this.d, this.d);
        Label_0185: {
            if (this.c == 16842919) {
                this.a.setColor(-13388315);
                if (!App.I) {
                    break Label_0185;
                }
            }
            this.a.setColor(-1);
        }
        this.a.setMaskFilter((MaskFilter)null);
        canvas.drawPath(a, this.a);
        if (this.c == 16842913) {
            this.a.setStrokeWidth(this.d);
            this.a.setStyle(Paint$Style.STROKE);
            this.a.setColor(-13388315);
            canvas.drawPath(a, this.a);
        }
        canvas.translate(-this.d, -this.d);
    }
    
    public int getOpacity() {
        return 0;
    }
    
    public boolean getPadding(final Rect rect) {
        rect.top = (int)this.d;
        rect.bottom = this.b + (int)this.d;
        rect.left = (int)this.d;
        rect.right = (int)this.d;
        return true;
    }
    
    public boolean isStateful() {
        return true;
    }
    
    public void setAlpha(final int n) {
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
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
            if (n == 16842913) {
                this.c = 16842913;
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
