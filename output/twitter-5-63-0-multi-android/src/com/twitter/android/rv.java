// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.DialogInterface;
import android.content.DialogInterface$OnCancelListener;

class rv implements DialogInterface$OnCancelListener
{
    final /* synthetic */ SecuritySettingsActivity a;
    
    rv(final SecuritySettingsActivity a) {
        this.a = a;
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
        this.a.finish();
    }
}
