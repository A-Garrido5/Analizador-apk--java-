// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class ye implements View$OnClickListener
{
    final Advanced a;
    
    ye(final Advanced a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.showDialog(1);
    }
}
