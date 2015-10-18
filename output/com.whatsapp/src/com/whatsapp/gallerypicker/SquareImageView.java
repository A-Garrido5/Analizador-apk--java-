// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;

public class SquareImageView extends ImageView
{
    public SquareImageView(final Context context) {
        super(context);
    }
    
    public SquareImageView(final Context context, final AttributeSet set) {
        super(context, set, 0);
    }
    
    public SquareImageView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    protected void onMeasure(final int n, final int n2) {
        final int defaultSize = getDefaultSize(this.getSuggestedMinimumWidth(), n);
        this.setMeasuredDimension(defaultSize, defaultSize);
    }
}
