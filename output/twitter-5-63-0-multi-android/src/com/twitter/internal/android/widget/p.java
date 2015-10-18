// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.database.DataSetObserver;

class p extends DataSetObserver
{
    final /* synthetic */ HorizontalListView a;
    
    public p(final HorizontalListView a) {
        this.a = a;
    }
    
    public void onChanged() {
        this.a.d = this.a.c.getCount();
        this.a.f = 0;
        this.a.e = true;
        this.a.b = false;
        this.a.requestLayout();
    }
    
    public void onInvalidated() {
        this.a.d = 0;
        this.a.f = 0;
        this.a.e = true;
        this.a.b = false;
        this.a.requestLayout();
    }
}
