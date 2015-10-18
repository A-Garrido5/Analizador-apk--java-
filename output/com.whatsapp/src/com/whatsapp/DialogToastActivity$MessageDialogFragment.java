// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.support.v7.app.AlertDialog$Builder;
import android.app.Dialog;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class DialogToastActivity$MessageDialogFragment extends DialogFragment
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[11];
        String s = "N\u007fP&`D\u007f|<e";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0307:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0001';
                        break;
                    }
                    case 0: {
                        c2 = '#';
                        break;
                    }
                    case 1: {
                        c2 = '\u001a';
                        break;
                    }
                    case 2: {
                        c2 = '#';
                        break;
                    }
                    case 3: {
                        c2 = 'U';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "WsW9d|sG";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "N\u007fP&`D\u007f";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "S{Q4lP";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "N\u007fP&`D\u007f";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "WsW9d|sG";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "N\u007fP&`D\u007f|<e";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "N\u007fP&`D\u007f|<e";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "WsW9d|sG";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "N\u007fP&`D\u007f|<e";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "S{Q4lP";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    break Label_0307;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    static DialogFragment a(final int n, final int n2) {
        return b(n, n2);
    }
    
    private static DialogFragment a(final int n, final int n2, final String[] array) {
        final DialogToastActivity$MessageDialogFragment dialogToastActivity$MessageDialogFragment = new DialogToastActivity$MessageDialogFragment();
        final Bundle arguments = new Bundle();
        final ArrayList list = new ArrayList((Collection<? extends E>)Arrays.asList(array));
        arguments.putInt(DialogToastActivity$MessageDialogFragment.z[8], n);
        arguments.putInt(DialogToastActivity$MessageDialogFragment.z[9], n2);
        arguments.putStringArrayList(DialogToastActivity$MessageDialogFragment.z[10], list);
        dialogToastActivity$MessageDialogFragment.setArguments(arguments);
        return dialogToastActivity$MessageDialogFragment;
    }
    
    private static DialogFragment a(final String s) {
        final DialogToastActivity$MessageDialogFragment dialogToastActivity$MessageDialogFragment = new DialogToastActivity$MessageDialogFragment();
        final Bundle arguments = new Bundle();
        arguments.putString(DialogToastActivity$MessageDialogFragment.z[4], s);
        dialogToastActivity$MessageDialogFragment.setArguments(arguments);
        return dialogToastActivity$MessageDialogFragment;
    }
    
    private static DialogFragment b(final int n, final int n2) {
        final DialogToastActivity$MessageDialogFragment dialogToastActivity$MessageDialogFragment = new DialogToastActivity$MessageDialogFragment();
        final Bundle arguments = new Bundle();
        arguments.putInt(DialogToastActivity$MessageDialogFragment.z[5], n);
        arguments.putInt(DialogToastActivity$MessageDialogFragment.z[6], n2);
        dialogToastActivity$MessageDialogFragment.setArguments(arguments);
        return dialogToastActivity$MessageDialogFragment;
    }
    
    static DialogFragment b(final int n, final int n2, final String[] array) {
        return a(n, n2, array);
    }
    
    static DialogFragment b(final String s) {
        return a(s);
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        final boolean i = App.I;
        final int int1 = this.getArguments().getInt(DialogToastActivity$MessageDialogFragment.z[0]);
        String message = null;
        Label_0081: {
            if (int1 == 0) {
                message = this.getArguments().getString(DialogToastActivity$MessageDialogFragment.z[2]);
                if (!i) {
                    break Label_0081;
                }
            }
            final ArrayList stringArrayList = this.getArguments().getStringArrayList(DialogToastActivity$MessageDialogFragment.z[3]);
            if (stringArrayList == null) {
                message = this.getString(int1);
                if (!i) {
                    break Label_0081;
                }
            }
            message = this.getString(int1, stringArrayList.toArray());
        }
        final int int2 = this.getArguments().getInt(DialogToastActivity$MessageDialogFragment.z[1]);
        final AlertDialog$Builder setPositiveButton = new AlertDialog$Builder((Context)this.getActivity()).setMessage(message).setCancelable(true).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new aaf(this));
        if (int2 != 0) {
            setPositiveButton.setTitle(int2);
        }
        return setPositiveButton.create();
    }
    
    @Override
    public void onDismiss(final DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.getActivity() instanceof DialogToastActivity) {
            ((DialogToastActivity)this.getActivity()).b(this.getArguments().getInt(DialogToastActivity$MessageDialogFragment.z[7]));
        }
    }
    
    @Override
    public void show(final FragmentManager fragmentManager, final String s) {
        final FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.add(this, s);
        beginTransaction.commitAllowingStateLoss();
    }
}
