// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

class b_ implements Runnable
{
    final SettingsGoogleDrive a;
    final String b;
    
    b_(final SettingsGoogleDrive a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        SettingsGoogleDrive.n(this.a).setText((CharSequence)this.b);
        SettingsGoogleDrive.t(this.a);
    }
}
