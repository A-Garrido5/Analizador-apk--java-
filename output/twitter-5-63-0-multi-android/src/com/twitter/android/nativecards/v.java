// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import android.util.AttributeSet;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

class v
{
    private ProgressBar a;
    
    public void a() {
        if (this.a != null) {
            this.a.bringToFront();
        }
    }
    
    public void a(final ViewGroup viewGroup) {
        if (this.a != null) {
            viewGroup.removeView((View)this.a);
            this.a = null;
        }
    }
    
    public void a(final ViewGroup viewGroup, final Context context, final ViewGroup$LayoutParams viewGroup$LayoutParams, final int n) {
        if (this.a == null) {
            this.a = new ProgressBar(context, (AttributeSet)null, n);
            if (viewGroup$LayoutParams != null) {
                viewGroup.addView((View)this.a, viewGroup$LayoutParams);
            }
            else {
                viewGroup.addView((View)this.a);
            }
            viewGroup.requestLayout();
        }
    }
    
    public void a(final boolean b, final int n, final int n2, final int n3, final int n4) {
        if (this.a != null) {
            final int n5 = n3 - n;
            final int measuredWidth = this.a.getMeasuredWidth();
            if (n5 >= measuredWidth) {
                final int measuredHeight = this.a.getMeasuredHeight();
                final int n6 = n4 - n2;
                if (n6 >= measuredHeight) {
                    final int n7 = (n5 - measuredWidth) / 2;
                    final int n8 = (n6 - measuredHeight) / 2;
                    this.a.layout(n7, n8, measuredWidth + n7, measuredHeight + n8);
                }
            }
        }
    }
}
