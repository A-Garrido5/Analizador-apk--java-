// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.bm;
import android.view.View;
import android.view.View$OnClickListener;

class ak implements View$OnClickListener
{
    final SettingsGoogleDrive a;
    
    ak(final SettingsGoogleDrive a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        bm.a(new c(this));
    }
}
