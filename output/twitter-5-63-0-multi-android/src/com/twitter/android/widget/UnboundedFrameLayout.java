// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;

public class UnboundedFrameLayout extends FrameLayout
{
    private ge a;
    
    public UnboundedFrameLayout(final Context context) {
        super(context);
    }
    
    public UnboundedFrameLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(n2), 0));
    }
    
    public void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        if (n != 0 && n2 != 0 && this.a != null) {
            this.a.L_();
        }
    }
    
    public void setOnHeaderSizeChangedListener(final ge a) {
        this.a = a;
    }
}
