// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.AbsListView;
import android.widget.AbsListView$OnScrollListener;

class aow implements AbsListView$OnScrollListener
{
    final ChatInfoLayout a;
    
    aow(final ChatInfoLayout a) {
        this.a = a;
    }
    
    public void onScroll(final AbsListView absListView, final int n, final int n2, final int n3) {
        ChatInfoLayout.d(this.a);
    }
    
    public void onScrollStateChanged(final AbsListView absListView, final int n) {
        ChatInfoLayout.d(this.a);
    }
}
