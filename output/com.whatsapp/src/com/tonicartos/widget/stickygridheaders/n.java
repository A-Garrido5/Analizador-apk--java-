// 
// Decompiled by Procyon v0.5.30
// 

package com.tonicartos.widget.stickygridheaders;

import android.database.DataSetObserver;

class n extends DataSetObserver
{
    final u a;
    
    n(final u a) {
        this.a = a;
    }
    
    public void onChanged() {
        this.a.a();
        this.a.notifyDataSetChanged();
    }
    
    public void onInvalidated() {
        u.a(this.a).clear();
        this.a.notifyDataSetInvalidated();
    }
}
