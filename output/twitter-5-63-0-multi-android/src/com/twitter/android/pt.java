// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;

class pt implements DialogInterface$OnDismissListener
{
    final /* synthetic */ RemoveAccountDialogActivity a;
    
    pt(final RemoveAccountDialogActivity a) {
        this.a = a;
    }
    
    public void onDismiss(final DialogInterface dialogInterface) {
        if (!this.a.b) {
            this.a.finish();
        }
    }
}
