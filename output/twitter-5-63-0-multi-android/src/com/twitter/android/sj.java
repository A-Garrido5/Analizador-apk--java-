// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class sj implements DialogInterface$OnClickListener
{
    final /* synthetic */ SettingsActivity a;
    
    sj(final SettingsActivity a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        dialogInterface.cancel();
    }
}
