// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class fv implements View$OnClickListener
{
    final Conversation a;
    
    fv(final Conversation a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.aI.onWindowFocusChanged(false);
        this.a.aI.post((Runnable)new op(this));
        Conversation.I(this.a).setVisibility(8);
        Conversation.F(this.a).setVisibility(8);
    }
}
