// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface$OnClickListener;
import com.whatsapp.util.cq;
import android.content.Context;
import android.support.v7.app.AlertDialog$Builder;
import android.text.TextUtils;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class ConversationsFragment$DeleteBroadcastListDialogFragment extends DialogFragment
{
    private static final String z;
    
    static {
        final char[] charArray = "@<L".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '6';
                    break;
                }
                case 0: {
                    c2 = '*';
                    break;
                }
                case 1: {
                    c2 = 'U';
                    break;
                }
                case 2: {
                    c2 = '(';
                    break;
                }
                case 3: {
                    c2 = '[';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        final a_9 e = App.S.e(this.getArguments().getString(ConversationsFragment$DeleteBroadcastListDialogFragment.z));
        if (TextUtils.isEmpty((CharSequence)e.t)) {
            final String s = this.getString(2131231023);
            if (!App.I) {
                return new AlertDialog$Builder((Context)this.getActivity()).setMessage(cq.c(s, this.getActivity().getBaseContext())).setCancelable(true).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new mr(this)).setPositiveButton(2131230992, (DialogInterface$OnClickListener)new u9(this, e)).create();
            }
        }
        final String s = this.getString(2131231022, new Object[] { e.a((Context)this.getActivity()) });
        return new AlertDialog$Builder((Context)this.getActivity()).setMessage(cq.c(s, this.getActivity().getBaseContext())).setCancelable(true).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new mr(this)).setPositiveButton(2131230992, (DialogInterface$OnClickListener)new u9(this, e)).create();
    }
}
