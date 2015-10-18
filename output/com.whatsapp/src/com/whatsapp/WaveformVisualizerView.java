// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Path;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Join;
import android.graphics.Paint$Style;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Paint;
import android.view.View;

public class WaveformVisualizerView extends View
{
    private byte[] a;
    private Paint b;
    private float[] c;
    private Rect d;
    
    public WaveformVisualizerView(final Context context) {
        super(context);
        this.d = new Rect();
        this.b = new Paint();
        this.a();
    }
    
    private void a() {
        this.a = null;
        this.b.setStrokeWidth(2.0f);
        this.b.setStyle(Paint$Style.STROKE);
        this.b.setStrokeJoin(Paint$Join.ROUND);
        this.b.setStrokeCap(Paint$Cap.ROUND);
        this.b.setAntiAlias(true);
        this.b.setColor(Color.rgb(0, 128, 255));
    }
    
    public void a(final byte[] a) {
        this.a = a;
        this.invalidate();
    }
    
    protected void onDraw(final Canvas canvas) {
        int i = 0;
        final boolean j = App.I;
        super.onDraw(canvas);
        if (this.a == null) {
            return;
        }
        if (this.c == null || this.c.length < 4 * this.a.length) {
            this.c = new float[4 * this.a.length];
        }
        this.d.set(0, 0, this.getWidth(), this.getHeight());
        final Rect d = this.d;
        d.top += this.getPaddingTop();
        final Rect d2 = this.d;
        d2.bottom -= this.getPaddingBottom();
        final Rect d3 = this.d;
        d3.left += this.getPaddingLeft();
        final Rect d4 = this.d;
        d4.right -= this.getPaddingRight();
        final Path path = new Path();
        path.moveTo((float)this.d.left, (float)(this.d.top + this.d.height() / 2 + (byte)(128 + this.a[0]) * (this.d.height() / 2) / 128));
        while (i < -1 + this.a.length) {
            path.lineTo((float)(this.d.left + i * this.d.width() / (-1 + this.a.length)), (float)(this.d.top + this.d.height() / 2 + (byte)(128 + this.a[i]) * (this.d.height() / 2) / 128));
            ++i;
            if (j) {
                break;
            }
        }
        canvas.drawPath(path, this.b);
    }
    
    public void setColor(final int color) {
        this.b.setColor(color);
    }
}
