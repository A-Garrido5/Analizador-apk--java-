// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.DialogInterface;
import android.content.DialogInterface$OnCancelListener;

class zi implements DialogInterface$OnCancelListener
{
    final /* synthetic */ WebViewActivity a;
    
    zi(final WebViewActivity a) {
        this.a = a;
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
        this.a.finish();
    }
}
