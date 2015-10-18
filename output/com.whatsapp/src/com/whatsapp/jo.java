// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.CheckBox;
import android.view.View;
import android.view.View$OnClickListener;

class jo implements View$OnClickListener
{
    final RegisterName a;
    
    jo(final RegisterName a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        ((CheckBox)this.a.findViewById(2131755730)).toggle();
    }
}
