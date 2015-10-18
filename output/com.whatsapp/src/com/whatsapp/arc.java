// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class arc implements View$OnClickListener
{
    final WebImagePicker a;
    
    arc(final WebImagePicker a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        WebImagePicker.h(this.a);
    }
}
