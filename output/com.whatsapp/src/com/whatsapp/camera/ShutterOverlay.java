// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import android.graphics.Paint$Style;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;

public class ShutterOverlay extends View
{
    private boolean a;
    private Paint b;
    
    public ShutterOverlay(final Context context) {
        super(context);
        this.b = new Paint(1);
    }
    
    public ShutterOverlay(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = new Paint(1);
    }
    
    public ShutterOverlay(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b = new Paint(1);
    }
    
    static boolean a(final ShutterOverlay shutterOverlay, final boolean a) {
        return shutterOverlay.a = a;
    }
    
    public void onDraw(final Canvas canvas) {
        if (this.a) {
            this.b.setStrokeWidth(8.0f * this.getContext().getResources().getDimension(2131361868));
            this.b.setStyle(Paint$Style.STROKE);
            this.b.setColor(-1);
            canvas.drawRect(0.0f, 0.0f, (float)this.getWidth(), (float)this.getHeight(), this.b);
        }
    }
    
    public void setOn() {
        this.a = true;
        this.invalidate();
        this.postDelayed((Runnable)new l(this), 50L);
    }
}
