// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class p implements DialogInterface$OnClickListener
{
    final /* synthetic */ OfferSummaryActivity a;
    
    p(final OfferSummaryActivity a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        dialogInterface.dismiss();
    }
}
