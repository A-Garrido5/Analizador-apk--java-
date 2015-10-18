// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface$OnCancelListener;

class xv implements DialogInterface$OnCancelListener
{
    final pn a;
    
    xv(final pn a) {
        this.a = a;
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
        if (pn.a(this.a) != null) {
            pn.a(this.a).dismiss();
        }
        pn.a(this.a, null);
        this.a.cancel(true);
        if (WebImagePicker.f(this.a.a) == this.a) {
            WebImagePicker.a(this.a.a, (pn)null);
        }
    }
}
