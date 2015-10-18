// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.os.Message;
import android.content.Context;
import android.app.ProgressDialog;
import android.app.Dialog;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class ProgressDialogFragment extends DialogFragment
{
    public static ProgressDialogFragment a(final int n) {
        final ProgressDialogFragment progressDialogFragment = new ProgressDialogFragment();
        final Bundle arguments = new Bundle(1);
        arguments.putInt("msg_res", n);
        progressDialogFragment.setArguments(arguments);
        return progressDialogFragment;
    }
    
    public void a(final FragmentManager fragmentManager) {
        this.show(fragmentManager, null);
    }
    
    public void a(final FragmentManager fragmentManager, final String s) {
        final FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.add(this, s);
        beginTransaction.commitAllowingStateLoss();
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        final ProgressDialog progressDialog = new ProgressDialog((Context)this.getActivity());
        progressDialog.setProgressStyle(0);
        progressDialog.setMessage(this.getText(this.getArguments().getInt("msg_res")));
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        this.setCancelable(false);
        return (Dialog)progressDialog;
    }
    
    @Override
    public void onDestroyView() {
        if (this.getDialog() != null && this.getRetainInstance()) {
            this.getDialog().setDismissMessage((Message)null);
        }
        super.onDestroyView();
    }
}
