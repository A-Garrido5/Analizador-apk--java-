// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import android.database.DataSetObserver;

class u extends DataSetObserver
{
    final /* synthetic */ r a;
    
    public u(final r a) {
        this.a = a;
    }
    
    public void onChanged() {
        this.a.a.notifyChanged();
    }
    
    public void onInvalidated() {
        this.a.a.notifyInvalidated();
    }
}
