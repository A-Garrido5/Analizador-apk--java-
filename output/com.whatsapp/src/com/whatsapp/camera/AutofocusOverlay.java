// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import android.graphics.Paint$Style;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public class AutofocusOverlay extends View
{
    private RectF a;
    private Runnable b;
    private Boolean c;
    private Paint d;
    
    public AutofocusOverlay(final Context context) {
        super(context);
        this.d = new Paint(1);
        this.b = new at(this);
    }
    
    public AutofocusOverlay(final Context context, final AttributeSet set) {
        super(context, set);
        this.d = new Paint(1);
        this.b = new at(this);
    }
    
    public AutofocusOverlay(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.d = new Paint(1);
        this.b = new at(this);
    }
    
    public void a(final float n, final float n2) {
        final float dimension = this.getContext().getResources().getDimension(2131361867);
        this.a = new RectF(n - dimension / 2.0f, n2 - dimension / 2.0f, n + dimension / 2.0f, n2 + dimension / 2.0f);
        this.c = null;
        this.setVisibility(0);
        this.invalidate();
        this.removeCallbacks(this.b);
    }
    
    public void a(final boolean b) {
        this.c = b;
        this.invalidate();
        this.postDelayed(this.b, 1000L);
    }
    
    public void onDraw(final Canvas canvas) {
        final boolean m = CameraActivity.m;
        this.d.setStrokeWidth(this.getContext().getResources().getDimension(2131361868));
        this.d.setStyle(Paint$Style.STROKE);
        Label_0084: {
            if (this.c == null) {
                this.d.setColor(-1);
                if (!m) {
                    break Label_0084;
                }
            }
            if (this.c == Boolean.TRUE) {
                this.d.setColor(-16711936);
                if (!m) {
                    break Label_0084;
                }
            }
            this.d.setColor(-65536);
        }
        canvas.drawRect(this.a, this.d);
    }
}
