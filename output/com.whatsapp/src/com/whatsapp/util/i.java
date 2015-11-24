// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.graphics.ColorFilter;
import com.whatsapp.vc;
import android.graphics.Rect;
import com.whatsapp.DialogToastActivity;
import android.graphics.Path$FillType;
import android.graphics.Canvas;
import android.graphics.Paint$Align;
import android.graphics.Paint$Style;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

class i extends Drawable
{
    Paint a;
    String b;
    Path c;
    
    public i(final String b) {
        this.c = new Path();
        this.b = b;
        (this.a = new Paint()).setColor(-16777216);
        this.a.setAntiAlias(true);
        this.a.setFakeBoldText(true);
        this.a.setStyle(Paint$Style.FILL);
        this.a.setTextAlign(Paint$Align.CENTER);
    }
    
    public void draw(final Canvas canvas) {
        final boolean l = Log.l;
        final Rect bounds = this.getBounds();
        final float textSize = 3.0f * bounds.height() / 5.0f;
        this.a.setTextSize(textSize);
        this.a.setStyle(Paint$Style.FILL);
        canvas.drawText(this.b, (float)((bounds.left + bounds.right) / 2), textSize + bounds.top, this.a);
        this.a.setStyle(Paint$Style.STROKE);
        final float n = textSize + textSize / 6.0f;
        this.c.reset();
        this.c.moveTo((float)(1 + bounds.left), (float)(-1 + bounds.bottom));
        this.c.lineTo((float)(1 + bounds.left), (float)(1 + bounds.top));
        this.c.lineTo((float)bounds.right, (float)(1 + bounds.top));
        this.c.lineTo((float)bounds.right, n + bounds.top);
        this.c.lineTo((float)(1 + bounds.left), n + bounds.top);
        this.c.setFillType(Path$FillType.WINDING);
        canvas.drawPath(this.c, this.a);
        if (l) {
            DialogToastActivity.h = !DialogToastActivity.h;
        }
    }
    
    public int getIntrinsicHeight() {
        return (int)(32.0f * vc.b().b);
    }
    
    public int getIntrinsicWidth() {
        return (int)(32.0f * vc.b().b);
    }
    
    public int getOpacity() {
        return -3;
    }
    
    public void setAlpha(final int alpha) {
        this.a.setAlpha(alpha);
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
