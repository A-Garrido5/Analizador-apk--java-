// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.RelativeLayout;

public class ConversationContentLayout extends RelativeLayout
{
    private int a;
    private boolean b;
    
    public ConversationContentLayout(final Context context) {
        super(context);
    }
    
    public ConversationContentLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public ConversationContentLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public ConversationContentLayout(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        if (this.b) {
            super.onLayout(b, n, n2, n3, n2 + this.a);
            if (!App.I) {
                return;
            }
        }
        super.onLayout(b, n, n2, n3, n4);
    }
    
    protected void onMeasure(final int n, final int n2) {
        if (this.b) {
            super.onMeasure(n, View$MeasureSpec.makeMeasureSpec(this.a, Integer.MIN_VALUE));
            if (!App.I) {
                return;
            }
        }
        super.onMeasure(n, n2);
    }
    
    public void setFreezeHeight() {
        this.setFreezeHeight(this.getHeight());
    }
    
    public void setFreezeHeight(final int a) {
        if (!this.b || this.a != a) {
            this.b = true;
            this.a = a;
            this.requestLayout();
        }
    }
    
    public void setUnfreezeHeight() {
        if (this.b) {
            this.b = false;
            this.requestLayout();
        }
    }
}
