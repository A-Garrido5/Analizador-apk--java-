// 
// Decompiled by Procyon v0.5.30
// 

package com.tonicartos.widget.stickygridheaders;

import android.database.DataSetObserver;

class s extends DataSetObserver
{
    final k a;
    
    s(final k a) {
        this.a = a;
    }
    
    public void onChanged() {
        this.a.notifyDataSetChanged();
    }
    
    public void onInvalidated() {
        this.a.notifyDataSetInvalidated();
    }
}
