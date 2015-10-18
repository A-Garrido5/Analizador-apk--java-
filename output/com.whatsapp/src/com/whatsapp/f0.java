// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class f0 implements DialogInterface$OnClickListener
{
    final Conversation a;
    
    f0(final Conversation a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        if (App.a(this.a, true, this.a.s.u, false)) {
            Conversation.m(this.a, true);
        }
    }
}
