// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.RelativeLayout;

public class VariableHeightLayout extends RelativeLayout
{
    public VariableHeightLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    protected void onMeasure(final int n, final int n2) {
        final int size = View$MeasureSpec.getSize(n);
        final int n3 = size / 2;
        super.onMeasure(n, View$MeasureSpec.makeMeasureSpec(n3, Integer.MIN_VALUE));
        this.setMeasuredDimension(size, n3);
    }
}
