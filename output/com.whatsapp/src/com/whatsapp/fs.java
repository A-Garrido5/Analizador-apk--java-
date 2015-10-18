// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class fs implements DialogInterface$OnClickListener
{
    private static final String z;
    final ConversationsFragment$DeleteContactDialogFragment a;
    final a_9 b;
    
    static {
        final char[] charArray = "kVXIczJWKogWE\u0010bmUSKc%ZYQriZB".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0006';
                    break;
                }
                case 0: {
                    c2 = '\b';
                    break;
                }
                case 1: {
                    c2 = '9';
                    break;
                }
                case 2: {
                    c2 = '6';
                    break;
                }
                case 3: {
                    c2 = '?';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    fs(final ConversationsFragment$DeleteContactDialogFragment a, final a_9 b) {
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        Log.i(fs.z);
        App.G(this.b.u);
        ConversationsFragment.c(1 + ConversationsFragment.g());
        this.a.dismiss();
    }
}
