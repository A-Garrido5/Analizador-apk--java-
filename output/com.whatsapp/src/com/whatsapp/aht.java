// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class aht implements View$OnClickListener
{
    final OverlayAlert a;
    
    aht(final OverlayAlert a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.finish();
    }
}
