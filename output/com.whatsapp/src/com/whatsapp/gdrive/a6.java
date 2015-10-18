// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.support.v7.app.AlertDialog$Builder;
import android.view.View;
import android.view.View$OnClickListener;

class a6 implements View$OnClickListener
{
    final SettingsGoogleDrive a;
    
    a6(final SettingsGoogleDrive a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        new AlertDialog$Builder((Context)this.a).setTitle(2131232129).setSingleChoiceItems(2131689483, GoogleDriveService.y(), (DialogInterface$OnClickListener)new au(this)).setPositiveButton(2131230874, null).create().show();
    }
}
