// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.ScrollView;

class ol implements Runnable
{
    final alc a;
    
    ol(final alc a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        ((ScrollView)this.a.a.findViewById(2131755344)).smoothScrollTo(0, this.a.a.findViewById(2131755398).getTop());
    }
}
