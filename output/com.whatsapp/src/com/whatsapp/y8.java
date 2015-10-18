// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class y8 implements View$OnClickListener
{
    final LocationPicker2 a;
    
    y8(final LocationPicker2 a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        LocationPicker2.v(this.a).b();
    }
}
