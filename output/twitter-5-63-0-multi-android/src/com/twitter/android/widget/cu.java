// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.database.DataSetObserver;

class cu extends DataSetObserver
{
    final /* synthetic */ ct a;
    
    cu(final ct a) {
        this.a = a;
    }
    
    public void onChanged() {
        this.a.notifyDataSetChanged();
    }
    
    public void onInvalidated() {
        this.a.notifyDataSetInvalidated();
    }
}
