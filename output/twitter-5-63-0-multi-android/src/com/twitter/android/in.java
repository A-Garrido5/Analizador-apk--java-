// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Intent;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class in implements DialogInterface$OnClickListener
{
    final /* synthetic */ GeneralSettingsActivity a;
    
    in(final GeneralSettingsActivity a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        if (-1 == n) {
            this.a.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS").setFlags(268435456));
        }
    }
}
