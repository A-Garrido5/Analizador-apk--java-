// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class ky implements View$OnClickListener
{
    final Conversation a;
    
    ky(final Conversation a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.onBackPressed();
    }
}
