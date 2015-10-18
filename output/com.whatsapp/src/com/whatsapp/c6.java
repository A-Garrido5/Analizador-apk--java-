// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import com.whatsapp.util.Log;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class c6 implements DialogInterface$OnClickListener
{
    private static final String z;
    final DialogToastActivity$LoginFailedDialogFragment a;
    
    static {
        final char[] charArray = "KQuPFQ[jP\u000eJMlP\u001b".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'i';
                    break;
                }
                case 0: {
                    c2 = '#';
                    break;
                }
                case 1: {
                    c2 = '>';
                    break;
                }
                case 2: {
                    c2 = '\u0018';
                    break;
                }
                case 3: {
                    c2 = '5';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    c6(final DialogToastActivity$LoginFailedDialogFragment a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        Log.i(c6.z);
        OverlayAlert.a(this.a.getActivity());
    }
}
