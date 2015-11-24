// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.util;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class g implements DialogInterface$OnClickListener
{
    final /* synthetic */ f a;
    
    g(final f a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        dialogInterface.dismiss();
    }
}
