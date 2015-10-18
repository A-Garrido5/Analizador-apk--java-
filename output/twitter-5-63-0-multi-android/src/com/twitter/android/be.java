// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Intent;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class be implements DialogInterface$OnClickListener
{
    final /* synthetic */ BugReporterActivity a;
    
    be(final BugReporterActivity a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.startActivity(new Intent("android.settings.ADD_ACCOUNT_SETTINGS"));
    }
}
