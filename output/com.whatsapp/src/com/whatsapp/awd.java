// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.database.DataSetObserver;

class awd extends DataSetObserver
{
    final Conversation a;
    
    awd(final Conversation a) {
        this.a = a;
    }
    
    public void onChanged() {
        if (App.aV >= 1) {}
    }
    
    public void onInvalidated() {
        Conversation.h(this.a, false);
    }
}
