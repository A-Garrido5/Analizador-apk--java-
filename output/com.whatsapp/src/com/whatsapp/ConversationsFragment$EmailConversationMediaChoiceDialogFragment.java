// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.support.v7.app.AlertDialog$Builder;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class ConversationsFragment$EmailConversationMediaChoiceDialogFragment extends DialogFragment
{
    private static final String z;
    
    static {
        final char[] charArray = "(%\"".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '.';
                    break;
                }
                case 0: {
                    c2 = 'B';
                    break;
                }
                case 1: {
                    c2 = 'L';
                    break;
                }
                case 2: {
                    c2 = 'F';
                    break;
                }
                case 3: {
                    c2 = '1';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        final a_9 e = App.S.e(this.getArguments().getString(ConversationsFragment$EmailConversationMediaChoiceDialogFragment.z));
        return new AlertDialog$Builder((Context)this.getActivity()).setMessage(2131231049).setPositiveButton(2131230831, (DialogInterface$OnClickListener)new a9l(this, e)).setNeutralButton(2131231976, (DialogInterface$OnClickListener)new sh(this, e)).create();
    }
}
