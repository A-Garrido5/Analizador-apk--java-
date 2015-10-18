// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;

class vz implements DialogInterface$OnDismissListener
{
    final /* synthetic */ TweetFragment a;
    
    vz(final TweetFragment a) {
        this.a = a;
    }
    
    public void onDismiss(final DialogInterface dialogInterface) {
        this.a.getActivity().getIntent().removeExtra("email_redirect_favorite");
    }
}
