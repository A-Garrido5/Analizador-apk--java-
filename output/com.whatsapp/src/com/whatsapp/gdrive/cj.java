// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

class cj implements Runnable
{
    final as a;
    
    cj(final as a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        SettingsGoogleDrive.t(this.a.a);
        if (SettingsGoogleDrive.u(this.a.a).m() == 16) {
            SettingsGoogleDrive.u(this.a.a).e(10);
        }
        if (GoogleDriveService.ae() != 0) {
            SettingsGoogleDrive.q(this.a.a);
        }
    }
}
