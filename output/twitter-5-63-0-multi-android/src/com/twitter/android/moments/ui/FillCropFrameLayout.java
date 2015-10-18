// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui;

import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.internal.android.util.Size;
import android.graphics.Rect;
import android.widget.FrameLayout;

public class FillCropFrameLayout extends FrameLayout
{
    private Rect a;
    private Size b;
    private Rect c;
    
    public FillCropFrameLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public void a(final Size b, final Rect c) {
        this.b = b;
        this.c = c;
        this.requestLayout();
    }
    
    public Rect getConstraint() {
        return this.a;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        if (this.a == null) {
            super.onLayout(b, n, n2, n3, n4);
        }
        else {
            for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                this.getChildAt(i).layout(this.a.left, this.a.top, this.a.right, this.a.bottom);
            }
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        if (this.b == null) {
            super.onMeasure(n, n2);
            return;
        }
        final Size a = Size.a(View$MeasureSpec.getSize(n), View$MeasureSpec.getSize(n2));
        if (this.c != null) {
            this.a = com.twitter.android.moments.ui.a.a(this.b, a, this.c);
        }
        else {
            this.a = com.twitter.android.moments.ui.a.b(this.b, a);
        }
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            this.getChildAt(i).measure(View$MeasureSpec.makeMeasureSpec(this.a.width(), 1073741824), View$MeasureSpec.makeMeasureSpec(this.a.height(), 1073741824));
        }
        this.setMeasuredDimension(View$MeasureSpec.getSize(n), View$MeasureSpec.getSize(n2));
    }
}
