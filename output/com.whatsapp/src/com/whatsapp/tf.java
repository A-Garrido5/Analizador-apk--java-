// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class tf implements View$OnClickListener
{
    final MultipleContactPicker a;
    
    tf(final MultipleContactPicker a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        MultipleContactPicker.h(this.a).setVisibility(8);
        MultipleContactPicker.e(this.a).setText((CharSequence)"");
    }
}
