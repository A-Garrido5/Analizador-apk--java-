// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

final class ay implements DialogInterface$OnClickListener
{
    private /* synthetic */ aw a;
    
    ay(final aw a) {
        this.a = a;
    }
    
    public final void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.a.a(false);
        dialogInterface.dismiss();
    }
}
