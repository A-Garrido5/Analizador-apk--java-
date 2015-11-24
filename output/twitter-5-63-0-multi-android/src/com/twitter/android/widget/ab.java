// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.database.DataSetObserver;

class ab extends DataSetObserver
{
    final /* synthetic */ ComposerPoiFragment a;
    final /* synthetic */ aa b;
    
    ab(final aa b, final ComposerPoiFragment a) {
        this.b = b;
        this.a = a;
    }
    
    public void onChanged() {
        this.b.notifyDataSetChanged();
    }
    
    public void onInvalidated() {
    }
}
