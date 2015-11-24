// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.observablescrollview;

import android.widget.AbsListView;
import android.widget.AbsListView$OnScrollListener;

class f implements AbsListView$OnScrollListener
{
    final ObservableListView a;
    
    f(final ObservableListView a) {
        this.a = a;
    }
    
    public void onScroll(final AbsListView absListView, final int n, final int n2, final int n3) {
        if (ObservableListView.c(this.a) != null) {
            ObservableListView.c(this.a).onScroll(absListView, n, n2, n3);
        }
        ObservableListView.b(this.a);
    }
    
    public void onScrollStateChanged(final AbsListView absListView, final int n) {
        if (ObservableListView.c(this.a) != null) {
            ObservableListView.c(this.a).onScrollStateChanged(absListView, n);
        }
        if (ObservableListView.a(this.a) != null && n == 0) {
            ObservableListView.a(this.a).a(this.a);
        }
    }
}
