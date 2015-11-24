// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnLongClickListener;

class ar2 implements View$OnLongClickListener
{
    final Conversation a;
    
    ar2(final Conversation a) {
        this.a = a;
    }
    
    public boolean onLongClick(final View view) {
        Conversation.ak(this.a);
        return true;
    }
}
