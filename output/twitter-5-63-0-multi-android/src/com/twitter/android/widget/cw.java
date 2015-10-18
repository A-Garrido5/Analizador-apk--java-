// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.database.DataSetObserver;

class cw extends DataSetObserver
{
    final /* synthetic */ cv a;
    
    cw(final cv a) {
        this.a = a;
    }
    
    public void onChanged() {
        this.a.notifyDataSetChanged();
    }
    
    public void onInvalidated() {
        this.a.notifyDataSetInvalidated();
    }
}
