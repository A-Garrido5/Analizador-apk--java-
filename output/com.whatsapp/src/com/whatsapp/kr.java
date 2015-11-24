// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Paint$Style;
import android.graphics.RectF;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Join;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;

class kr extends BitmapDrawable
{
    private Paint a;
    final Conversation b;
    
    public kr(final Conversation b, final Resources resources, final Bitmap bitmap) {
        this.b = b;
        super(resources, bitmap);
    }
    
    public void draw(final Canvas canvas) {
        if (this.a == null) {
            (this.a = new Paint()).setAntiAlias(true);
            this.a.setStrokeJoin(Paint$Join.ROUND);
            this.a.setStrokeCap(Paint$Cap.ROUND);
            this.a.setStrokeWidth(1.0f * Conversation.J(this.b).b);
        }
        super.draw(canvas);
        final float dimension = this.b.getResources().getDimension(2131361814);
        final RectF rectF = new RectF(this.getBounds());
        this.a.setStyle(Paint$Style.STROKE);
        this.a.setColor(1493172224);
        if (dimension > 0.0f) {
            canvas.drawRoundRect(rectF, dimension, dimension, this.a);
            if (!App.I) {
                return;
            }
        }
        canvas.drawArc(rectF, 0.0f, 360.0f, true, this.a);
    }
}
