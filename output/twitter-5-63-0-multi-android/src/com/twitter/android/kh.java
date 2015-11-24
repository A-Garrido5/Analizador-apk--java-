// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.app.Activity;
import com.twitter.android.dialog.LoggedOutDialogFragment;
import android.support.v4.app.FragmentActivity;

final class kh implements Runnable
{
    final /* synthetic */ FragmentActivity a;
    final /* synthetic */ LoggedOutDialogFragment b;
    
    kh(final FragmentActivity a, final LoggedOutDialogFragment b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        kg.a(this.a, this.b.a() + "::impression");
        this.b.show(this.a.getSupportFragmentManager(), "logged_out_dialog_fragment");
    }
}
