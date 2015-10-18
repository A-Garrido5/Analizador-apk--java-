// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class rw implements DialogInterface$OnClickListener
{
    final /* synthetic */ SecuritySettingsActivity a;
    
    rw(final SecuritySettingsActivity a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.finish();
    }
}
