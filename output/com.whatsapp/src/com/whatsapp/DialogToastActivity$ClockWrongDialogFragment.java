// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.app.Activity;
import com.whatsapp.util.Log;
import android.app.Dialog;
import android.os.Bundle;
import android.content.res.Configuration;
import android.support.v4.app.DialogFragment;

public class DialogToastActivity$ClockWrongDialogFragment extends DialogFragment
{
    private static final String z;
    boolean b;
    
    static {
        final char[] charArray = "_\u001eQ;'S\u0018]2gPQ_2gT\u001a\u0011)zX\u001f[".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\b';
                    break;
                }
                case 0: {
                    c2 = '7';
                    break;
                }
                case 1: {
                    c2 = 'q';
                    break;
                }
                case 2: {
                    c2 = '<';
                    break;
                }
                case 3: {
                    c2 = '^';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public DialogToastActivity$ClockWrongDialogFragment() {
        this.b = true;
    }
    
    @Override
    public void onConfigurationChanged(final Configuration configuration) {
        this.b = false;
        this.dismiss();
        new DialogToastActivity$ClockWrongDialogFragment().show(this.getActivity().getSupportFragmentManager(), this.getClass().getName());
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        Log.w(DialogToastActivity$ClockWrongDialogFragment.z);
        return yt.b(this.getActivity());
    }
    
    @Override
    public void onDismiss(final DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.b && this.getActivity() != null) {
            this.getActivity().finish();
        }
    }
}
