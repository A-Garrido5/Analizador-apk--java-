// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

class ar implements Runnable
{
    final SettingsGoogleDrive a;
    
    ar(final SettingsGoogleDrive a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        SettingsGoogleDrive.r(this.a).setEnabled(true);
    }
}
