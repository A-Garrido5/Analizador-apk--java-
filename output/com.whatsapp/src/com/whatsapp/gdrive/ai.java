// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.support.v7.app.AlertDialog$Builder;
import android.view.View;
import android.view.View$OnClickListener;

class ai implements View$OnClickListener
{
    final String a;
    final GoogleDriveActivity b;
    
    ai(final GoogleDriveActivity b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final View view) {
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)this.b);
        alertDialog$Builder.setMessage(2131231999).setCancelable(true);
        alertDialog$Builder.setPositiveButton(2131232030, (DialogInterface$OnClickListener)new bv(this));
        alertDialog$Builder.setNegativeButton(2131230874, null);
        alertDialog$Builder.create().show();
    }
}
