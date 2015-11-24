// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.database.DataSetObserver;

class l extends DataSetObserver
{
    final /* synthetic */ k a;
    
    l(final k a) {
        this.a = a;
    }
    
    public void onChanged() {
        this.a.b(this.a.b.getCount());
    }
}
