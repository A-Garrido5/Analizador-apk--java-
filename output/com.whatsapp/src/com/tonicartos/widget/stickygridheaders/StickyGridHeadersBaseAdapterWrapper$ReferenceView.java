// 
// Decompiled by Procyon v0.5.30
// 

package com.tonicartos.widget.stickygridheaders;

import android.annotation.SuppressLint;
import android.view.View$MeasureSpec;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

public class StickyGridHeadersBaseAdapterWrapper$ReferenceView extends FrameLayout
{
    private View[] a;
    private int b;
    private boolean c;
    final u d;
    private int e;
    
    public StickyGridHeadersBaseAdapterWrapper$ReferenceView(final u d, final Context context) {
        this.d = d;
        super(context);
    }
    
    public StickyGridHeadersBaseAdapterWrapper$ReferenceView(final u d, final Context context, final AttributeSet set) {
        this.d = d;
        super(context, set);
    }
    
    public StickyGridHeadersBaseAdapterWrapper$ReferenceView(final u d, final Context context, final AttributeSet set, final int n) {
        this.d = d;
        super(context, set, n);
    }
    
    private void a(final int n, final int n2) {
        final int c = StickyGridHeadersGridView.c;
        if (this.c) {
            return;
        }
        this.c = true;
        final View[] a = this.a;
        final int length = a.length;
        int i = 0;
        while (i < length) {
            final View view = a[i];
            if (view != null) {
                view.measure(n, n2);
            }
            ++i;
            if (c != 0) {
                break;
            }
        }
        this.c = false;
    }
    
    public View a() {
        return this.getChildAt(0);
    }
    
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)this.generateDefaultLayoutParams();
    }
    
    protected FrameLayout$LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout$LayoutParams(-1, -1);
    }
    
    public Object getTag() {
        return this.getChildAt(0).getTag();
    }
    
    public Object getTag(final int n) {
        return this.getChildAt(0).getTag(n);
    }
    
    protected void onMeasure(final int n, final int n2) {
        final int c = StickyGridHeadersGridView.c;
        super.onMeasure(n, n2);
        if (this.b != 1 && u.b(this.d) != null) {
            if (this.e % this.b == -1 + this.b) {
                this.a(n, n2);
            }
            final int measuredHeight = this.getMeasuredHeight();
            final View[] a = this.a;
            final int length = a.length;
            int i = 0;
            int max = measuredHeight;
            while (i < length) {
                final View view = a[i];
                if (view != null) {
                    max = Math.max(max, view.getMeasuredHeight());
                }
                ++i;
                if (c != 0) {
                    break;
                }
            }
            if (max != measuredHeight) {
                super.onMeasure(n, View$MeasureSpec.makeMeasureSpec(max, 1073741824));
            }
        }
    }
    
    public void setNumColumns(final int b) {
        this.b = b;
    }
    
    public void setPosition(final int e) {
        this.e = e;
    }
    
    @SuppressLint({ "NewApi" })
    public void setRowSiblings(final View[] a) {
        this.a = a;
    }
    
    public void setTag(final int n, final Object o) {
        this.getChildAt(0).setTag(n, o);
    }
    
    public void setTag(final Object tag) {
        this.getChildAt(0).setTag(tag);
    }
}
