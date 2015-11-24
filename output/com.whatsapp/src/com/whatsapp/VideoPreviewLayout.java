// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View$MeasureSpec;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup;

public class VideoPreviewLayout extends ViewGroup
{
    public VideoPreviewLayout(final Context context) {
        super(context);
    }
    
    public VideoPreviewLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public VideoPreviewLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final int n5 = n3 - n;
        final int n6 = n4 - n2;
        final View viewById = this.findViewById(2131755328);
        View view = this.findViewById(2131755329);
        if (view.getVisibility() == 8) {
            view = this.findViewById(2131755393);
        }
        final View viewById2 = this.findViewById(2131755795);
        final View viewById3 = this.findViewById(2131755798);
        if (n6 > n5) {
            final int measuredHeight = view.getMeasuredHeight();
            final int measuredHeight2 = viewById2.getMeasuredHeight();
            final int measuredHeight3 = viewById3.getMeasuredHeight();
            viewById.layout(n, n2, n3, n2 + measuredHeight);
            viewById2.layout(n, n2 + measuredHeight, n3, measuredHeight2 + (n2 + measuredHeight));
            viewById3.layout(n, measuredHeight2 + (n2 + measuredHeight), n3, measuredHeight3 + (measuredHeight2 + (measuredHeight + n2)));
            if (!App.I) {
                return;
            }
        }
        final int n7 = view.getMeasuredWidth() + viewById.getPaddingLeft() + viewById.getPaddingRight();
        final int n8 = n + (n5 - (n7 + n5 / 2)) / 2;
        viewById.layout(n8, n2, n8 + n7, n4);
        final int measuredHeight4 = viewById2.getMeasuredHeight();
        final int measuredWidth = viewById2.getMeasuredWidth();
        final int measuredHeight5 = viewById3.getMeasuredHeight();
        final int measuredWidth2 = viewById3.getMeasuredWidth();
        final int n9 = (n6 - measuredHeight4 - measuredHeight5) / 2;
        viewById2.layout(n8 + n7, n2 + n9, measuredWidth + (n8 + n7), measuredHeight4 + (n2 + n9));
        viewById3.layout(n8 + n7, measuredHeight4 + (n2 + n9), measuredWidth2 + (n7 + n8), measuredHeight5 + (measuredHeight4 + (n2 + n9)));
    }
    
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        final int measuredWidth = this.getMeasuredWidth();
        final int measuredHeight = this.getMeasuredHeight();
        final View viewById = this.findViewById(2131755328);
        final View viewById2 = this.findViewById(2131755795);
        final View viewById3 = this.findViewById(2131755798);
        if (measuredHeight > measuredWidth) {
            viewById2.measure(n, View$MeasureSpec.makeMeasureSpec(0, 0));
            viewById3.measure(n, View$MeasureSpec.makeMeasureSpec(0, 0));
            viewById.measure(n, View$MeasureSpec.makeMeasureSpec(measuredHeight - viewById2.getMeasuredHeight() - viewById3.getMeasuredHeight(), 1073741824));
            if (!App.I) {
                return;
            }
        }
        viewById.measure(View$MeasureSpec.makeMeasureSpec(measuredWidth / 2, Integer.MIN_VALUE), n2);
        viewById2.measure(View$MeasureSpec.makeMeasureSpec(measuredWidth / 2, 1073741824), View$MeasureSpec.makeMeasureSpec(0, 0));
        viewById3.measure(View$MeasureSpec.makeMeasureSpec(measuredWidth / 2, 1073741824), View$MeasureSpec.makeMeasureSpec(0, 0));
    }
}
