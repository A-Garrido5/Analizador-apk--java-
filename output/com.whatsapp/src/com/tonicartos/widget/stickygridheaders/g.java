// 
// Decompiled by Procyon v0.5.30
// 

package com.tonicartos.widget.stickygridheaders;

import android.database.DataSetObserver;

class g extends DataSetObserver
{
    final StickyGridHeadersGridView a;
    
    g(final StickyGridHeadersGridView a) {
        this.a = a;
    }
    
    public void onChanged() {
        StickyGridHeadersGridView.c(this.a);
    }
    
    public void onInvalidated() {
        StickyGridHeadersGridView.c(this.a);
    }
}
