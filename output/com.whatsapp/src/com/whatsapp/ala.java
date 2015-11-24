// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.Toast;

final class ala implements Runnable
{
    final String a;
    
    ala(final String a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        final Toast text = Toast.makeText(App.aq.getApplicationContext(), (CharSequence)this.a, 0);
        text.setGravity(85, 0, 0);
        text.show();
    }
}
