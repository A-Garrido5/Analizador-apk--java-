// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.AbsListView;
import android.widget.AbsListView$OnScrollListener;

class sa implements AbsListView$OnScrollListener
{
    final CallLogActivity a;
    
    sa(final CallLogActivity a) {
        this.a = a;
    }
    
    public void onScroll(final AbsListView absListView, final int n, final int n2, final int n3) {
        CallLogActivity.a(this.a);
    }
    
    public void onScrollStateChanged(final AbsListView absListView, final int n) {
    }
}
