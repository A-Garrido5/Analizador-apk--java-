// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.support.v4.app.FragmentActivity;
import android.content.DialogInterface;
import android.app.Activity;
import com.whatsapp.util.Log;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class DialogToastActivity$SoftwareExpiredDialogFragment extends DialogFragment
{
    private static final String z;
    
    static {
        final char[] charArray = "ct4\u0017uor8\u001e5l;*\u001d<\u007fl8\u0000?&~!\u00023y~=".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'Z';
                    break;
                }
                case 0: {
                    c2 = '\u000b';
                    break;
                }
                case 1: {
                    c2 = '\u001b';
                    break;
                }
                case 2: {
                    c2 = 'Y';
                    break;
                }
                case 3: {
                    c2 = 'r';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        Log.w(DialogToastActivity$SoftwareExpiredDialogFragment.z);
        return yt.f(this.getActivity());
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
