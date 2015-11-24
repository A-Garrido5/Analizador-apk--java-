// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class gv implements View$OnClickListener
{
    final VoipActivity a;
    
    gv(final VoipActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (VoipActivity.c(this.a)) {
            new VoipActivity$ReplyWithMessageDialogFragment().show(this.a.getSupportFragmentManager(), null);
        }
    }
}
