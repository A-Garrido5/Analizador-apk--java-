// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class kv implements View$OnClickListener
{
    final CountryPicker a;
    
    kv(final CountryPicker a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        CountryPicker.c(this.a).setText((CharSequence)"");
    }
}
