// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.bm;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class b8 implements DialogInterface$OnClickListener
{
    final SettingsGoogleDrive a;
    
    b8(final SettingsGoogleDrive a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        bm.a(new bg(this));
    }
}
