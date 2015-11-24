// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget.highlights;

import android.database.DataSetObserver;

class m extends DataSetObserver
{
    final /* synthetic */ StoriesViewPager a;
    
    private m(final StoriesViewPager a) {
        this.a = a;
    }
    
    public void onChanged() {
        this.a.a();
    }
    
    public void onInvalidated() {
        this.a.a();
    }
}
