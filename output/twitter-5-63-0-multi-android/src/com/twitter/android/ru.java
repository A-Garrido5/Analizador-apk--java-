// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;

class ru implements DialogInterface$OnDismissListener
{
    final /* synthetic */ SecuritySettingsActivity a;
    
    ru(final SecuritySettingsActivity a) {
        this.a = a;
    }
    
    public void onDismiss(final DialogInterface dialogInterface) {
        this.a.finish();
    }
}
