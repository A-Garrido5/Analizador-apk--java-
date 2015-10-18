// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.view.View;
import android.view.View$OnClickListener;

class by implements View$OnClickListener
{
    final SettingsGoogleDrive a;
    
    by(final SettingsGoogleDrive a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        SettingsGoogleDrive.m(this.a);
    }
}
