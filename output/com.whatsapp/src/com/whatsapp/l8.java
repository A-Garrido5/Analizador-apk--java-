// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class l8 implements View$OnClickListener
{
    final VoipActivity a;
    
    l8(final VoipActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (VoipActivity.f(this.a) != null) {
            VoipActivity.f(this.a).i();
        }
    }
}
