// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.view.View$OnClickListener;

class bu implements Runnable
{
    final b0 a;
    final View$OnClickListener b;
    
    bu(final b0 a, final View$OnClickListener b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        SettingsGoogleDrive.r(this.a.b).setVisibility(8);
        SettingsGoogleDrive.c(this.a.b).setVisibility(0);
        SettingsGoogleDrive.c(this.a.b).setIndeterminate(true);
        if (this.b != null) {
            SettingsGoogleDrive.l(this.a.b).setVisibility(0);
            SettingsGoogleDrive.l(this.a.b).setOnClickListener(this.b);
        }
        SettingsGoogleDrive.g(this.a.b).setVisibility(0);
    }
}
