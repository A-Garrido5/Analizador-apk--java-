// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget.carousel;

import android.database.DataSetObserver;

class i extends DataSetObserver
{
    final /* synthetic */ CarouselView a;
    
    i(final CarouselView a) {
        this.a = a;
    }
    
    public void onChanged() {
        super.onChanged();
        this.a.a();
    }
    
    public void onInvalidated() {
        super.onInvalidated();
        this.a.b();
    }
}
