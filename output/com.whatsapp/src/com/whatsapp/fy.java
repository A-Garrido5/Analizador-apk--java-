// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class fy implements DialogInterface$OnClickListener
{
    private static final String z;
    final ConversationsFragment$DeleteGroupDialogFragment a;
    final a_9 b;
    
    static {
        final char[] charArray = "ms;\u001e\u0018|o4\u001c\u0014ar&G\b}y'E\u0019kp0\u001c\u0018In:\u001d\r".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '}';
                    break;
                }
                case 0: {
                    c2 = '\u000e';
                    break;
                }
                case 1: {
                    c2 = '\u001c';
                    break;
                }
                case 2: {
                    c2 = 'U';
                    break;
                }
                case 3: {
                    c2 = 'h';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    fy(final ConversationsFragment$DeleteGroupDialogFragment a, final a_9 b) {
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        Log.i(fy.z);
        App.G(this.b.u);
        ConversationsFragment.c(1 + ConversationsFragment.g());
        this.a.dismiss();
    }
}
