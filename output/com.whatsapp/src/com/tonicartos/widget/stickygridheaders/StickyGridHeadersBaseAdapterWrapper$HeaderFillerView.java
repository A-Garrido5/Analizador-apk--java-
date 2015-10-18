// 
// Decompiled by Procyon v0.5.30
// 

package com.tonicartos.widget.stickygridheaders;

import android.view.View$MeasureSpec;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;

public class StickyGridHeadersBaseAdapterWrapper$HeaderFillerView extends FrameLayout
{
    final u a;
    private int b;
    private int c;
    
    public StickyGridHeadersBaseAdapterWrapper$HeaderFillerView(final u a, final Context context) {
        this.a = a;
        super(context);
    }
    
    public StickyGridHeadersBaseAdapterWrapper$HeaderFillerView(final u a, final Context context, final AttributeSet set) {
        this.a = a;
        super(context, set);
    }
    
    public StickyGridHeadersBaseAdapterWrapper$HeaderFillerView(final u a, final Context context, final AttributeSet set, final int n) {
        this.a = a;
        super(context, set, n);
    }
    
    public int a() {
        return this.c;
    }
    
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)this.generateDefaultLayoutParams();
    }
    
    protected FrameLayout$LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout$LayoutParams(-1, -1);
    }
    
    protected void onMeasure(final int n, final int n2) {
        final View view = (View)this.getTag();
        if (view.getLayoutParams() == null) {
            view.setLayoutParams((ViewGroup$LayoutParams)this.generateDefaultLayoutParams());
        }
        if (view.getVisibility() != 8 && view.getMeasuredHeight() == 0) {
            view.measure(View$MeasureSpec.makeMeasureSpec(this.b, 1073741824), View$MeasureSpec.makeMeasureSpec(0, 0));
        }
        this.setMeasuredDimension(View$MeasureSpec.getSize(n), view.getMeasuredHeight());
    }
    
    public void setHeaderId(final int c) {
        this.c = c;
    }
    
    public void setHeaderWidth(final int b) {
        this.b = b;
    }
}
