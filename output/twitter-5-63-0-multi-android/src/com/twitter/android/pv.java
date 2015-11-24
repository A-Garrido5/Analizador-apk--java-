// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class pv implements DialogInterface$OnClickListener
{
    final /* synthetic */ RemoveAccountDialogActivity a;
    
    pv(final RemoveAccountDialogActivity a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.b();
        this.a.showDialog(1);
    }
}
