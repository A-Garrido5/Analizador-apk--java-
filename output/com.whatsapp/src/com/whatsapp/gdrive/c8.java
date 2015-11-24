// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.bm;
import android.view.View;
import android.view.View$OnClickListener;

class c8 implements View$OnClickListener
{
    final SettingsGoogleDrive a;
    final String b;
    
    c8(final SettingsGoogleDrive a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final View view) {
        bm.a(new a1(this));
    }
}
