// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class u9 implements DialogInterface$OnClickListener
{
    private static final String z;
    final a_9 a;
    final ConversationsFragment$DeleteBroadcastListDialogFragment b;
    
    static {
        final char[] charArray = "\"}F{\u00193aIy\u0015.|[\"\u0018$~My\u0019lqGc\b q\\".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '|';
                    break;
                }
                case 0: {
                    c2 = 'A';
                    break;
                }
                case 1: {
                    c2 = '\u0012';
                    break;
                }
                case 2: {
                    c2 = '(';
                    break;
                }
                case 3: {
                    c2 = '\r';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    u9(final ConversationsFragment$DeleteBroadcastListDialogFragment b, final a_9 a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        Log.i(u9.z);
        App.G(this.a.u);
        App.e(this.a.u);
        ConversationsFragment.c(1 + ConversationsFragment.g());
        this.b.dismiss();
    }
}
