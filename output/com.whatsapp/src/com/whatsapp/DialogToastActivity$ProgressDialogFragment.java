// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.content.Context;
import android.app.ProgressDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class DialogToastActivity$ProgressDialogFragment extends DialogFragment
{
    private static final String[] z;
    private boolean b;
    
    static {
        final String[] z2 = new String[6];
        String s = "\u0011\"%jC:\"5";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '&';
                        break;
                    }
                    case 0: {
                        c2 = 'e';
                        break;
                    }
                    case 1: {
                        c2 = 'K';
                        break;
                    }
                    case 2: {
                        c2 = 'Q';
                        break;
                    }
                    case 3: {
                        c2 = '\u0006';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\b.\"uG\u0002.\u000eoB";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\b.\"uG\u0002.\u000eoB";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0011\"%jC:\"5";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\b.\"uG\u0002.\u000eoB";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u0011\"%jC:\"5";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public DialogToastActivity$ProgressDialogFragment() {
        this.b = false;
        final Bundle arguments = new Bundle();
        arguments.putInt(DialogToastActivity$ProgressDialogFragment.z[3], 2131231497);
        arguments.putInt(DialogToastActivity$ProgressDialogFragment.z[2], 2131231591);
        this.setArguments(arguments);
    }
    
    static DialogFragment a(final int n, final int n2) {
        return b(n, n2);
    }
    
    private static DialogFragment b(final int n, final int n2) {
        final DialogToastActivity$ProgressDialogFragment dialogToastActivity$ProgressDialogFragment = new DialogToastActivity$ProgressDialogFragment();
        final Bundle arguments = new Bundle();
        arguments.putInt(DialogToastActivity$ProgressDialogFragment.z[0], n);
        arguments.putInt(DialogToastActivity$ProgressDialogFragment.z[1], n2);
        dialogToastActivity$ProgressDialogFragment.setArguments(arguments);
        return dialogToastActivity$ProgressDialogFragment;
    }
    
    public void a() {
        if (this.isResumed()) {
            this.dismiss();
            if (!App.I) {
                return;
            }
        }
        this.b = true;
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        final int int1 = this.getArguments().getInt(DialogToastActivity$ProgressDialogFragment.z[5]);
        final int int2 = this.getArguments().getInt(DialogToastActivity$ProgressDialogFragment.z[4]);
        final ProgressDialog progressDialog = new ProgressDialog((Context)this.getActivity());
        if (int1 != 0) {
            progressDialog.setTitle((CharSequence)this.getString(int1));
        }
        progressDialog.setMessage((CharSequence)this.getString(int2));
        progressDialog.setIndeterminate(true);
        this.setCancelable(false);
        return (Dialog)progressDialog;
    }
    
    @Override
    public void onStart() {
        super.onStart();
        if (this.b) {
            this.dismiss();
            this.b = false;
        }
    }
    
    @Override
    public void show(final FragmentManager fragmentManager, final String s) {
        final FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.add(this, s);
        beginTransaction.commitAllowingStateLoss();
    }
}
