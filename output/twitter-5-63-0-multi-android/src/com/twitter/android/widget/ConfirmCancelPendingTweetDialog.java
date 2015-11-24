// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.app.AlertDialog$Builder;
import android.app.Dialog;
import android.os.Bundle;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.provider.Tweet;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.DialogFragment;

public class ConfirmCancelPendingTweetDialog extends DialogFragment
{
    private long a;
    
    public static ConfirmCancelPendingTweetDialog a(final FragmentManager fragmentManager, final Tweet tweet) {
        final Long k = tweet.K;
        if (k == null) {
            ErrorReporter.a(new IllegalStateException("A pending tweet row was shown without am associated draft"));
            return null;
        }
        final ConfirmCancelPendingTweetDialog confirmCancelPendingTweetDialog = new ConfirmCancelPendingTweetDialog();
        confirmCancelPendingTweetDialog.a(k);
        confirmCancelPendingTweetDialog.show(fragmentManager, "ConfirmCancelInFlightTweet");
        return confirmCancelPendingTweetDialog;
    }
    
    public ConfirmCancelPendingTweetDialog a(final long a) {
        this.a = a;
        return this;
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        return (Dialog)new AlertDialog$Builder((Context)this.getActivity()).setMessage(2131297993).setPositiveButton(2131296786, (DialogInterface$OnClickListener)new ai(this)).setNegativeButton(2131296445, (DialogInterface$OnClickListener)new ah(this)).create();
    }
}
