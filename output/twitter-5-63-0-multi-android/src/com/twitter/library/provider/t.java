// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import android.database.DataSetObservable;

public class t extends DataSetObservable
{
    final /* synthetic */ r a;
    private boolean b;
    
    public t(final r a) {
        this.a = a;
        this.b = true;
    }
    
    public void a(final boolean b) {
        this.b = b;
    }
    
    public void notifyChanged() {
        if (this.b) {
            super.notifyChanged();
        }
    }
}
