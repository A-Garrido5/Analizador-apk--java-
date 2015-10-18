// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.support.v7.app.AlertDialog$Builder;
import android.view.View;
import android.view.View$OnClickListener;

class af implements View$OnClickListener
{
    final SettingsGoogleDrive a;
    
    af(final SettingsGoogleDrive a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        new AlertDialog$Builder((Context)this.a).setTitle(2131232119).setSingleChoiceItems(SettingsGoogleDrive.f(this.a), SettingsGoogleDrive.j(this.a), (DialogInterface$OnClickListener)new av(this)).setPositiveButton(2131230874, null).create().show();
    }
}
