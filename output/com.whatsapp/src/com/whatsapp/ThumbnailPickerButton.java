// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Paint$Cap;
import android.graphics.Paint$Join;
import android.graphics.RectF;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Path;

public class ThumbnailPickerButton extends ThumbnailButton
{
    private Path k;
    
    public ThumbnailPickerButton(final Context context) {
        super(context);
        this.k = new Path();
    }
    
    public ThumbnailPickerButton(final Context context, final AttributeSet set) {
        super(context, set);
        this.k = new Path();
    }
    
    public ThumbnailPickerButton(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.k = new Path();
    }
    
    @Override
    protected void b(final Canvas canvas) {
        super.b(canvas);
        if (this.isEnabled() && this.a > 0.0f) {
            final float n = 7.0f * this.a;
            this.k.reset();
            this.g.setStyle(Paint$Style.FILL);
            this.k.moveTo(this.d.right, this.d.bottom - n);
            this.k.lineTo(this.d.right, this.d.bottom - this.a);
            this.k.arcTo(new RectF(this.d.right - 2.0f * this.a, this.d.bottom - 2.0f * this.a, this.d.right, this.d.bottom), 0.0f, 90.0f);
            this.k.lineTo(this.d.right - n, this.d.bottom);
            this.k.lineTo(this.d.right, this.d.bottom - n);
            this.g.setColor(1409286144);
            canvas.drawPath(this.k, this.g);
            this.k.reset();
            this.k.moveTo(this.d.right, this.d.bottom - n);
            this.k.lineTo(this.d.right - n, this.d.bottom);
            this.g.setStyle(Paint$Style.STROKE);
            this.g.setStrokeJoin(Paint$Join.ROUND);
            this.g.setStrokeCap(Paint$Cap.ROUND);
            this.g.setStrokeWidth(1.0f * vc.b().b);
            this.g.setColor(-570425345);
            canvas.drawPath(this.k, this.g);
        }
    }
}
