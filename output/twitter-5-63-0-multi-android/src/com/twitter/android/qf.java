// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import com.twitter.ui.dialog.b;

final class qf implements b
{
    final /* synthetic */ FragmentActivity a;
    
    qf(final FragmentActivity a) {
        this.a = a;
    }
    
    @Override
    public void a(final DialogInterface dialogInterface, final int n) {
        this.a.getIntent().removeExtra("email_redirect_retweet");
    }
}
