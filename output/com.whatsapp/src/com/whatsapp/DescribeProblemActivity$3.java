// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Canvas;
import android.content.Context;

class DescribeProblemActivity$3 extends ThumbnailButton
{
    final DescribeProblemActivity k;
    
    DescribeProblemActivity$3(final DescribeProblemActivity k, final Context context) {
        this.k = k;
        super(context);
    }
    
    @Override
    public void onDraw(final Canvas canvas) {
        if (!this.isSelected() && !this.isPressed()) {
            canvas.drawColor(this.getResources().getColor(2131624000));
        }
        super.onDraw(canvas);
    }
    
    @Override
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        this.setMeasuredDimension(this.getMeasuredWidth(), 4 * this.getMeasuredWidth() / 3);
    }
}
