// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.guide;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView$OnScrollListener;
import android.view.View$OnLayoutChangeListener;

public class k implements View$OnLayoutChangeListener, AbsListView$OnScrollListener
{
    private final int a;
    private final AbsListView b;
    private l c;
    private boolean d;
    
    public k(final AbsListView b, final int a) {
        this.a = a;
        (this.b = b).setOnScrollListener((AbsListView$OnScrollListener)this);
        b.addOnLayoutChangeListener((View$OnLayoutChangeListener)this);
    }
    
    private void a(final int n, final int n2) {
        if (this.c != null) {
            if (n > this.a && !this.d) {
                this.c.a(true);
                this.d = true;
            }
            else {
                if (n2 < this.a && !this.d) {
                    this.c.a(false);
                    this.d = true;
                    return;
                }
                if (n <= this.a && n2 >= this.a) {
                    final View child = this.b.getChildAt(this.a - n);
                    if (child != null) {
                        this.c.a(this.a, child.getTop());
                    }
                    this.d = false;
                }
            }
        }
    }
    
    public void a(final l c) {
        this.c = c;
        this.d = false;
    }
    
    public void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        this.a(this.b.getFirstVisiblePosition(), this.b.getLastVisiblePosition());
    }
    
    public void onScroll(final AbsListView absListView, final int n, final int n2, final int n3) {
        this.a(n, -1 + (n + n2));
    }
    
    public void onScrollStateChanged(final AbsListView absListView, final int n) {
    }
}
