// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.Layout;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;

public class ScalingTextView extends TextEmojiLabel
{
    private float g;
    private float h;
    
    public ScalingTextView(final Context context) {
        super(context);
        this.h = 1.0f;
    }
    
    public ScalingTextView(final Context context, final AttributeSet set) {
        super(context, set);
        this.h = 1.0f;
    }
    
    public ScalingTextView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.h = 1.0f;
    }
    
    @Override
    protected void onDraw(final Canvas canvas) {
        final boolean i = App.I;
        final Layout layout = this.getLayout();
        if (layout != null) {
            canvas.save();
            Label_0121: {
                if (App.ak()) {
                    canvas.translate(0.0f, (float)(this.getHeight() / 2));
                    canvas.scale(this.h, this.h);
                    canvas.translate(0.0f, -this.getHeight() / 2 * this.h);
                    if (!i) {
                        break Label_0121;
                    }
                }
                canvas.translate((float)this.getWidth(), (float)(this.getHeight() / 2));
                canvas.scale(this.h, this.h);
                canvas.translate((float)(-this.getWidth()), -this.getHeight() / 2 * this.h);
            }
            layout.getPaint().setColor(this.getCurrentTextColor());
            final float textSize = layout.getPaint().getTextSize();
            layout.getPaint().setTextSize(this.g);
            layout.draw(canvas);
            layout.getPaint().setTextSize(textSize);
            canvas.restore();
            if (!i) {
                return;
            }
        }
        super.onDraw(canvas);
    }
    
    public void setMaxTextSize(final float g) {
        this.g = g;
    }
    
    public void setTextScale(final float h) {
        this.h = h;
    }
}
