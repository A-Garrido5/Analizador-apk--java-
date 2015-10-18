// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.bm;
import android.view.View;
import android.view.View$OnClickListener;

class a9 implements View$OnClickListener
{
    final SettingsGoogleDrive a;
    
    a9(final SettingsGoogleDrive a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final String o = GoogleDriveService.o();
        if (o == null) {
            SettingsGoogleDrive.m(this.a);
            if (GoogleDriveService.F == 0) {
                return;
            }
        }
        bm.a(new b9(this, o));
    }
}
