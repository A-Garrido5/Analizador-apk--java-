// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Intent;
import android.net.Uri;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class ry implements DialogInterface$OnClickListener
{
    final /* synthetic */ SecuritySettingsActivity a;
    
    ry(final SecuritySettingsActivity a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.twitter.com/articles/82050-i-m-having-trouble-confirming-my-email-address")));
    }
}
