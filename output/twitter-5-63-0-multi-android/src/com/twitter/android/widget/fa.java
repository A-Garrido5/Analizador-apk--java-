// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.database.DataSetObserver;

class fa extends DataSetObserver
{
    final /* synthetic */ ez a;
    
    fa(final ez a) {
        this.a = a;
    }
    
    public void onChanged() {
        if (this.a.a) {
            this.a.notifyDataSetChanged();
        }
    }
    
    public void onInvalidated() {
        this.a.notifyDataSetInvalidated();
    }
}
