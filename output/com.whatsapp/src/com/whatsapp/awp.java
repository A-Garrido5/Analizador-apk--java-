// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.Adapter;
import android.view.View;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class awp implements ViewTreeObserver$OnGlobalLayoutListener
{
    final View a;
    final ChatInfoLayout b;
    final Adapter c;
    final View d;
    final View e;
    
    awp(final ChatInfoLayout b, final View e, final Adapter c, final View a, final View d) {
        this.b = b;
        this.e = e;
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public void onGlobalLayout() {
        if (!ChatInfoLayout.c(this.b).isLayoutRequested()) {
            if (this.b.getHeight() >= this.b.getWidth()) {
                final int n = Math.max(this.b.getMeasuredHeight() - (this.e.getMeasuredHeight() - this.b.getMeasuredWidth() + this.c.getCount() * this.b.getResources().getDimensionPixelSize(2131361955) + this.a.getMeasuredHeight() + (int)(0.5625f * ChatInfoLayout.e(this.b).getMeasuredWidth())), 0) + this.b.getResources().getDimensionPixelSize(2131361876);
                if (this.d.getPaddingBottom() != n) {
                    this.d.setPadding(0, 0, 0, n);
                }
                if (!App.I) {
                    return;
                }
            }
            if (this.d.getPaddingBottom() != 0) {
                this.d.setPadding(0, 0, 0, 0);
            }
        }
    }
}
