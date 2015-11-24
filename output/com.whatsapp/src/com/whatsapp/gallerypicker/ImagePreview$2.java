// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.graphics.Canvas;
import android.content.Context;
import com.whatsapp.MediaGalleryImageView;

class ImagePreview$2 extends MediaGalleryImageView
{
    final ImagePreview z;
    
    ImagePreview$2(final ImagePreview z, final Context context) {
        this.z = z;
        super(context);
    }
    
    @Override
    public void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (ImagePreview.g(this.z)) {
            canvas.drawColor(1727987712);
        }
    }
    
    @Override
    protected void onMeasure(final int n, final int n2) {
        final int defaultSize = getDefaultSize(this.getSuggestedMinimumWidth(), n);
        this.setMeasuredDimension(defaultSize, defaultSize);
    }
}
