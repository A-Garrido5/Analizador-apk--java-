// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import com.whatsapp.util.Log;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class HomeActivity$SoftwareAboutToExpireDialogFragment extends DialogFragment
{
    private static final String z;
    
    static {
        final char[] charArray = "0./3r<(#:2?a19;,6#$8u  9(,l69p=92?/=".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = ']';
                    break;
                }
                case 0: {
                    c2 = 'X';
                    break;
                }
                case 1: {
                    c2 = 'A';
                    break;
                }
                case 2: {
                    c2 = 'B';
                    break;
                }
                case 3: {
                    c2 = 'V';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        Log.i(HomeActivity$SoftwareAboutToExpireDialogFragment.z);
        return ade.a(this.getActivity());
    }
}
