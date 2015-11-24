// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.messaging.CaptivePortalActivity;
import android.view.View;
import android.view.View$OnClickListener;

class jg implements View$OnClickListener
{
    final Advanced a;
    
    jg(final Advanced a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        CaptivePortalActivity.a(this.a.getApplicationContext());
    }
}
