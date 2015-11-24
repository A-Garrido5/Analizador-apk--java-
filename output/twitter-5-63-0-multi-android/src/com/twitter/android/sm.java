// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.app.AlertDialog;
import android.widget.EditText;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class sm implements DialogInterface$OnClickListener
{
    final /* synthetic */ SignUpActivity a;
    
    sm(final SignUpActivity a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        if (n == -1) {
            this.a.w = ((EditText)((AlertDialog)dialogInterface).findViewById(2131886357)).getText().toString();
            this.a.l();
        }
        dialogInterface.dismiss();
    }
}
