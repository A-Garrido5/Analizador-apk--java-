// 
// Decompiled by Procyon v0.5.30
// 

package com.tonicartos.widget.stickygridheaders;

import android.database.DataSetObserver;

final class l extends DataSetObserver
{
    final m a;
    
    private l(final m a) {
        this.a = a;
    }
    
    l(final m m, final o o) {
        this(m);
    }
    
    public void onChanged() {
        m.a(this.a, this.a.a(m.a(this.a)));
        this.a.notifyDataSetChanged();
    }
    
    public void onInvalidated() {
        m.a(this.a, this.a.a(m.a(this.a)));
        this.a.notifyDataSetInvalidated();
    }
}
