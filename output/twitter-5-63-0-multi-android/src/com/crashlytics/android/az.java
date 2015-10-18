// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

final class az implements DialogInterface$OnClickListener
{
    private /* synthetic */ aw a;
    
    az(final aw a) {
        this.a = a;
    }
    
    public final void onClick(final DialogInterface dialogInterface, final int n) {
        final d b = this.a.b;
        d.a(true);
        this.a.a.a(true);
        dialogInterface.dismiss();
    }
}
