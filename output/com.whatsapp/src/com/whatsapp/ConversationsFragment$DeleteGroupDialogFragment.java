// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;
import android.content.DialogInterface$OnClickListener;
import com.whatsapp.util.cq;
import android.support.v7.app.AlertDialog$Builder;
import android.content.Context;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class ConversationsFragment$DeleteGroupDialogFragment extends DialogFragment
{
    private static final String z;
    
    static {
        final char[] charArray = "BO$".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '/';
                    break;
                }
                case 0: {
                    c2 = '(';
                    break;
                }
                case 1: {
                    c2 = '&';
                    break;
                }
                case 2: {
                    c2 = '@';
                    break;
                }
                case 3: {
                    c2 = '#';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        final a_9 e = App.S.e(this.getArguments().getString(ConversationsFragment$DeleteGroupDialogFragment.z));
        final String t = e.t;
        String s = null;
        Label_0102: {
            if (t == null) {
                final bi c = App.ak.C(e.u);
                s = null;
                if (c != null) {
                    final byte i = c.I;
                    s = null;
                    if (i == 0) {
                        if (c.L != 2L) {
                            final long n = lcmp(c.L, 3L);
                            s = null;
                            if (n != 0) {
                                break Label_0102;
                            }
                        }
                        s = c.c();
                    }
                }
            }
        }
        if (s == null) {
            s = e.a((Context)this.getActivity());
        }
        return new AlertDialog$Builder((Context)this.getActivity()).setMessage(cq.c(this.getString(2131231020, new Object[] { s }), this.getActivity().getBaseContext())).setCancelable(true).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new s9(this)).setPositiveButton(2131230992, (DialogInterface$OnClickListener)new fy(this, e)).create();
    }
}
