// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.ui.widget;

import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.Shader$TileMode;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.drawable.shapes.OvalShape;

class c extends OvalShape
{
    final /* synthetic */ CircleImageView a;
    private RadialGradient b;
    private int c;
    private Paint d;
    private int e;
    
    public c(final CircleImageView a, final int c, final int e) {
        this.a = a;
        this.d = new Paint();
        this.c = c;
        this.e = e;
        this.b = new RadialGradient((float)(this.e / 2), (float)(this.e / 2), (float)this.c, new int[] { 1023410176, 0 }, (float[])null, Shader$TileMode.CLAMP);
        this.d.setShader((Shader)this.b);
    }
    
    public void draw(final Canvas canvas, final Paint paint) {
        final int width = this.a.getWidth();
        final int height = this.a.getHeight();
        canvas.drawCircle((float)(width / 2), (float)(height / 2), (float)(this.e / 2 + this.c), this.d);
        canvas.drawCircle((float)(width / 2), (float)(height / 2), (float)(this.e / 2), paint);
    }
}
