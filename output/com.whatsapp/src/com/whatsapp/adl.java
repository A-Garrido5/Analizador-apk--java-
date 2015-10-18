// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class adl implements DialogInterface$OnClickListener
{
    private static final String z;
    final RegisterName a;
    
    static {
        final char[] charArray = "\b\"\u0019)<\u000e\"\f..\u0017\"Q$&\u001b+\u0011'`\u0019&\u00104b\u0019(\u0010.*\u00193Q\":\u000e3\u0011.`\u0019&\u0010#*\u0016".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'O';
                    break;
                }
                case 0: {
                    c2 = 'z';
                    break;
                }
                case 1: {
                    c2 = 'G';
                    break;
                }
                case 2: {
                    c2 = '~';
                    break;
                }
                case 3: {
                    c2 = '@';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    adl(final RegisterName a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        Log.i(adl.z);
        this.a.removeDialog(109);
    }
}
