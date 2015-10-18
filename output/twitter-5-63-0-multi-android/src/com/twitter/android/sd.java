// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.AbsListView;
import android.widget.AbsListView$OnScrollListener;

class sd implements AbsListView$OnScrollListener
{
    final /* synthetic */ SelectionFragment a;
    
    sd(final SelectionFragment a) {
        this.a = a;
    }
    
    public void onScroll(final AbsListView absListView, final int n, final int n2, final int n3) {
        if (this.a.j != null) {
            this.a.j.onScroll(absListView, n, n2, n3);
        }
    }
    
    public void onScrollStateChanged(final AbsListView absListView, final int n) {
        if (this.a.j != null) {
            this.a.j.onScrollStateChanged(absListView, n);
        }
    }
}
