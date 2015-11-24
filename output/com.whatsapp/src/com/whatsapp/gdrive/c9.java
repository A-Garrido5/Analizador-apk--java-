// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

class c9 implements Runnable
{
    final c6 a;
    
    c9(final c6 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        SettingsGoogleDrive.u(this.a.a).a(SettingsGoogleDrive.d(this.a.a));
    }
}
