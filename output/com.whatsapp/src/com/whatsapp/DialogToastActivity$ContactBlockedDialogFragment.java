// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import com.whatsapp.util.Log;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class DialogToastActivity$ContactBlockedDialogFragment extends DialogFragment
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[5];
        String s = "SlkU|Yl";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u001d';
                        break;
                    }
                    case 0: {
                        c2 = '>';
                        break;
                    }
                    case 1: {
                        c2 = '\t';
                        break;
                    }
                    case 2: {
                        c2 = '\u0018';
                        break;
                    }
                    case 3: {
                        c2 = '&';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "T`|";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "VfuC2Z`yJrY){IsJh{R0\\ewEv[m";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "SlkU|Yl";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "T`|";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    private static DialogFragment a(final String s, final String s2) {
        final DialogToastActivity$ContactBlockedDialogFragment dialogToastActivity$ContactBlockedDialogFragment = new DialogToastActivity$ContactBlockedDialogFragment();
        final Bundle arguments = new Bundle();
        arguments.putString(DialogToastActivity$ContactBlockedDialogFragment.z[0], s);
        arguments.putString(DialogToastActivity$ContactBlockedDialogFragment.z[1], s2);
        dialogToastActivity$ContactBlockedDialogFragment.setArguments(arguments);
        return dialogToastActivity$ContactBlockedDialogFragment;
    }
    
    static DialogFragment b(final String s, final String s2) {
        return a(s, s2);
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        Log.w(DialogToastActivity$ContactBlockedDialogFragment.z[2]);
        return yt.a(this.getActivity(), this.getArguments().getString(DialogToastActivity$ContactBlockedDialogFragment.z[3]), this.getArguments().getString(DialogToastActivity$ContactBlockedDialogFragment.z[4]));
    }
}
