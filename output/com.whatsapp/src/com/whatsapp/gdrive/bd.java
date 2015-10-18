// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

class bd implements Runnable
{
    final SettingsGoogleDrive a;
    final String b;
    
    bd(final SettingsGoogleDrive a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        SettingsGoogleDrive.b(this.a, this.b);
    }
}
