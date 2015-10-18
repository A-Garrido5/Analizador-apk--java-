// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Intent;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class fh implements DialogInterface$OnClickListener
{
    final /* synthetic */ DiskCleanupPromptActivity a;
    
    fh(final DiskCleanupPromptActivity a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        if (-1 == n) {
            System.exit(0);
        }
        else if (-2 == n) {
            final Intent intent = new Intent("android.settings.SETTINGS");
            intent.setFlags(1073741824);
            this.a.startActivity(intent);
            System.exit(0);
        }
    }
}
