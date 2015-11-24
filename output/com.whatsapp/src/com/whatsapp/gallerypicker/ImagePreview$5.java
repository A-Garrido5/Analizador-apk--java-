// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.graphics.Canvas;
import android.content.Context;
import android.widget.ImageView;

class ImagePreview$5 extends ImageView
{
    final ImagePreview a;
    
    ImagePreview$5(final ImagePreview a, final Context context) {
        this.a = a;
        super(context);
    }
    
    public void onDraw(final Canvas canvas) {
        if (!this.isSelected() && !this.isPressed()) {
            canvas.drawColor(-15658735);
        }
        super.onDraw(canvas);
    }
    
    protected void onMeasure(final int n, final int n2) {
        final int defaultSize = getDefaultSize(this.getSuggestedMinimumHeight(), n2);
        this.setMeasuredDimension(defaultSize, defaultSize);
    }
}
