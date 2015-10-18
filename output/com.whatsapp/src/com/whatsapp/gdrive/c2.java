// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.support.v7.app.AlertDialog$Builder;

class c2 implements Runnable
{
    final ac a;
    
    c2(final ac a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        new AlertDialog$Builder((Context)this.a.a).setMessage(2131232126).setPositiveButton(2131231435, null).create().show();
    }
}
