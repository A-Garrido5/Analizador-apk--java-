// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.ScrollView;

class xr implements Runnable
{
    final ContactPickerHelp a;
    
    xr(final ContactPickerHelp a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        ((ScrollView)this.a.findViewById(2131755344)).fullScroll(130);
    }
}
