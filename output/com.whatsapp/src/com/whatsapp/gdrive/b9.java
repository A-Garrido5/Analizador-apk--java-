// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

class b9 implements Runnable
{
    final a9 a;
    final String b;
    
    b9(final a9 a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        SettingsGoogleDrive.b(this.a.a, this.b);
    }
}
