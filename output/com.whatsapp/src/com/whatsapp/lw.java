// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnLongClickListener;

class lw implements View$OnLongClickListener
{
    final ConversationRow a;
    
    lw(final ConversationRow a) {
        this.a = a;
    }
    
    public boolean onLongClick(final View view) {
        this.a.k();
        return true;
    }
}
