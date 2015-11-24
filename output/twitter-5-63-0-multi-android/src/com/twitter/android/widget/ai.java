// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.app.AlertDialog$Builder;
import android.app.Dialog;
import android.os.Bundle;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.provider.Tweet;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class ai implements DialogInterface$OnClickListener
{
    final /* synthetic */ ConfirmCancelPendingTweetDialog a;
    
    ai(final ConfirmCancelPendingTweetDialog a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        ob.a((Context)this.a.getActivity(), this.a.a);
    }
}
