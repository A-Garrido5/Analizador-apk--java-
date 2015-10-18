// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.support.v4.app.FragmentActivity;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.support.v7.app.AlertDialog$Builder;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class DialogToastActivity$LoginFailedDialogFragment extends DialogFragment
{
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        return new AlertDialog$Builder((Context)this.getActivity()).setMessage(2131231288).setCancelable(false).setPositiveButton(2131231439, (DialogInterface$OnClickListener)new c6(this)).create();
    }
    
    @Override
    public void onDismiss(final DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        final FragmentActivity activity = this.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
