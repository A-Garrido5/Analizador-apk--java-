// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;

class es implements DialogInterface$OnDismissListener
{
    final /* synthetic */ DialogActivity a;
    
    es(final DialogActivity a) {
        this.a = a;
    }
    
    public void onDismiss(final DialogInterface dialogInterface) {
        this.a.setResult(0);
        this.a.finish();
    }
}
