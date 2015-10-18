// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class ash implements View$OnClickListener
{
    final VoipNotAllowedActivity a;
    
    ash(final VoipNotAllowedActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.finish();
    }
}
