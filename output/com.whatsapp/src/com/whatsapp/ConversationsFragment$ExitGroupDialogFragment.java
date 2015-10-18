// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface$OnClickListener;
import com.whatsapp.util.cq;
import android.content.Context;
import android.support.v7.app.AlertDialog$Builder;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class ConversationsFragment$ExitGroupDialogFragment extends DialogFragment
{
    private static final String z;
    
    static {
        final char[] charArray = "O>e".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0013';
                    break;
                }
                case 0: {
                    c2 = '%';
                    break;
                }
                case 1: {
                    c2 = 'W';
                    break;
                }
                case 2: {
                    c2 = '\u0001';
                    break;
                }
                case 3: {
                    c2 = 'e';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        final a_9 e = App.S.e(this.getArguments().getString(ConversationsFragment$ExitGroupDialogFragment.z));
        return new AlertDialog$Builder((Context)this.getActivity()).setMessage(cq.c(this.getString(2131231104, new Object[] { e.a((Context)this.getActivity()) }), this.getActivity().getBaseContext())).setCancelable(true).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new a9_(this)).setPositiveButton(2131231102, (DialogInterface$OnClickListener)new pp(this, e)).create();
    }
}
