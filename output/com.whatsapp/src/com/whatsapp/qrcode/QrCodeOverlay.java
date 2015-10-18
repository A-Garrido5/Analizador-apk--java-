// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.qrcode;

import com.whatsapp.DialogToastActivity;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import android.view.animation.Animation;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;

public class QrCodeOverlay extends View
{
    float a;
    private m b;
    private Paint c;
    float d;
    
    public QrCodeOverlay(final Context context) {
        super(context);
        this.c = new Paint(1);
        this.a = 0.0f;
        this.d = 0.01f;
    }
    
    public QrCodeOverlay(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = new Paint(1);
        this.a = 0.0f;
        this.d = 0.01f;
    }
    
    public QrCodeOverlay(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.c = new Paint(1);
        this.a = 0.0f;
        this.d = 0.01f;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        (this.b = new m(this, null)).setDuration(2000L);
        this.b.setRepeatCount(-1);
        this.b.setRepeatMode(2);
        this.startAnimation((Animation)this.b);
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.clearAnimation();
    }
    
    public void onDraw(final Canvas canvas) {
        final int r = QrCodeActivity.r;
        final int width = this.getWidth();
        final int height = this.getHeight();
        final int n = 3 * Math.min(width, height) / 4;
        final int n2 = (width - n) / 2;
        final int n3 = (height - n) / 2;
        final int n4 = n2 + n;
        final int n5 = n3 + n;
        this.c.setARGB(125, 50, 50, 50);
        this.c.setStyle(Paint$Style.FILL);
        canvas.drawRect(0.0f, 0.0f, (float)width, (float)n3, this.c);
        canvas.drawRect(0.0f, (float)n3, (float)n2, (float)n5, this.c);
        canvas.drawRect((float)n4, (float)n3, (float)width, (float)n5, this.c);
        canvas.drawRect(0.0f, (float)n5, (float)width, (float)height, this.c);
        final float dimension = this.getContext().getResources().getDimension(2131361868);
        this.c.setStrokeWidth(dimension);
        this.c.setStyle(Paint$Style.STROKE);
        this.c.setColor(872415231);
        canvas.drawRect((float)n2, (float)n3, (float)n4, (float)n5, this.c);
        canvas.drawLine((float)((n2 + n4) / 2), (float)(n3 - n / 12), (float)((n2 + n4) / 2), (float)(n3 + n / 12), this.c);
        canvas.drawLine((float)((n2 + n4) / 2), (float)(n5 - n / 12), (float)((n2 + n4) / 2), (float)(n5 + n / 12), this.c);
        canvas.drawLine((float)(n2 - n / 12), (float)((n3 + n5) / 2), (float)(n2 + n / 12), (float)((n3 + n5) / 2), this.c);
        canvas.drawLine((float)(n4 - n / 12), (float)((n3 + n5) / 2), (float)(n4 + n / 12), (float)((n3 + n5) / 2), this.c);
        this.c.setStyle(Paint$Style.STROKE);
        this.c.setColor(-2147418368);
        this.c.setStrokeWidth(2.0f * dimension);
        final int n6 = (int)(n3 + 2.0f * dimension);
        final int n7 = (int)(n5 - 2.0f * dimension);
        if (this.a > 1.0f || this.a < 0.0f) {
            this.d = -this.d;
        }
        this.a += this.d;
        canvas.drawLine((float)n2, n6 + (n7 - n6) * this.a, (float)n4, n6 + (n7 - n6) * this.a, this.c);
        if (r != 0) {
            DialogToastActivity.h = !DialogToastActivity.h;
        }
    }
    
    protected void onVisibilityChanged(final View view, final int n) {
        if (this.getVisibility() == 0) {
            if (this.getAnimation() != null || this.b == null) {
                return;
            }
            this.startAnimation((Animation)this.b);
            if (QrCodeActivity.r == 0) {
                return;
            }
        }
        this.clearAnimation();
    }
}
