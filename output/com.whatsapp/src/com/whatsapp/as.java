// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.AbsListView;
import android.widget.AbsListView$OnScrollListener;

class as implements AbsListView$OnScrollListener
{
    final sy a;
    
    as(final sy a) {
        this.a = a;
    }
    
    public void onScroll(final AbsListView absListView, final int n, final int n2, final int n3) {
        ChatInfoLayout.d(this.a.b);
    }
    
    public void onScrollStateChanged(final AbsListView absListView, final int n) {
        ChatInfoLayout.d(this.a.b);
    }
}
