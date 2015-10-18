// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class pv implements View$OnClickListener
{
    final mt a;
    
    pv(final mt a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.b.showDialog(50);
    }
}
