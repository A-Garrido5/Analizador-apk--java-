// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.support.v7.app.AlertDialog$Builder;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class VoipActivity$MessageDialogFragment extends DialogFragment
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        String s = "\u00028\t\u0002r\b8";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0013';
                        break;
                    }
                    case 0: {
                        c2 = 'o';
                        break;
                    }
                    case 1: {
                        c2 = ']';
                        break;
                    }
                    case 2: {
                        c2 = 'z';
                        break;
                    }
                    case 3: {
                        c2 = 'q';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "\u00028\t\u0002r\b8";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    static DialogFragment a(final String s) {
        return b(s);
    }
    
    private static DialogFragment b(final String s) {
        final VoipActivity$MessageDialogFragment voipActivity$MessageDialogFragment = new VoipActivity$MessageDialogFragment();
        final Bundle arguments = new Bundle();
        arguments.putString(VoipActivity$MessageDialogFragment.z[0], s);
        voipActivity$MessageDialogFragment.setArguments(arguments);
        return voipActivity$MessageDialogFragment;
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        return new AlertDialog$Builder((Context)this.getActivity()).setMessage(this.getArguments().getString(VoipActivity$MessageDialogFragment.z[1])).setCancelable(true).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new rf(this)).create();
    }
    
    @Override
    public void onDismiss(final DialogInterface dialogInterface) {
        if (this.getActivity() != null && !Voip.d()) {
            this.getActivity().finish();
        }
    }
}
