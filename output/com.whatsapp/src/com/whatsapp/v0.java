// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class v0 implements View$OnClickListener
{
    final cb a;
    
    v0(final cb a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.a.showDialog(50);
    }
}
