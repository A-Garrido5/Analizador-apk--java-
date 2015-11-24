// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.database.DataSetObserver;

class ab extends DataSetObserver
{
    final /* synthetic */ PopupEditText a;
    
    public ab(final PopupEditText a) {
        this.a = a;
    }
    
    public void onChanged() {
        super.onChanged();
        if (this.a.d || this.a.c) {
            this.a.a();
            this.a.d = false;
        }
    }
    
    public void onInvalidated() {
        super.onInvalidated();
        this.a.b();
    }
}
