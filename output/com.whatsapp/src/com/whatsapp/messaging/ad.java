// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.view.View;
import android.view.View$OnClickListener;

class ad implements View$OnClickListener
{
    final CaptivePortalActivity a;
    
    ad(final CaptivePortalActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.finish();
    }
}
