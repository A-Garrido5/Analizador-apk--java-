// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class be implements View$OnClickListener
{
    final qh a;
    
    be(final qh a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        qh.a(this.a);
        this.a.dismiss();
    }
}
