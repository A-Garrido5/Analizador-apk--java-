// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

class u implements Runnable
{
    final int a;
    final String b;
    final b0 c;
    
    u(final b0 c, final int a, final String b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        SettingsGoogleDrive.c(this.c.b).setProgress(this.a);
        SettingsGoogleDrive.g(this.c.b).setText((CharSequence)this.b);
    }
}
