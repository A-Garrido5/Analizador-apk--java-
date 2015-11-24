// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class lc implements View$OnClickListener
{
    final SystemStatusActivity a;
    
    lc(final SystemStatusActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.finish();
    }
}
