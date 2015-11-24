// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class vf implements View$OnClickListener
{
    final ContactPickerHelp a;
    
    vf(final ContactPickerHelp a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.u.setChecked(!this.a.u.isChecked());
    }
}
