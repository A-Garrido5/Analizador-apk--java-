// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class aod implements DialogInterface$OnClickListener
{
    final SettingsNetworkUsage a;
    
    aod(final SettingsNetworkUsage a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        if (n == -1) {
            atd.a();
            SettingsNetworkUsage.a(this.a);
        }
    }
}
