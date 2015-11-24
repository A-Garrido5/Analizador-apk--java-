// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

class bi implements Runnable
{
    final s a;
    
    bi(final s a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        SettingsGoogleDrive.b(this.a.a, GoogleDriveService.o());
    }
}
