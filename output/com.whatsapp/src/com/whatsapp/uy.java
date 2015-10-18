// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class uy implements View$OnClickListener
{
    final VoipActivity a;
    
    uy(final VoipActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (VoipActivity.f(this.a) != null) {
            VoipActivity.f(this.a).B();
        }
    }
}
