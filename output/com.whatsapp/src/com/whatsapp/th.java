// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import com.whatsapp.util.Log;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class th implements DialogInterface$OnClickListener
{
    private static final String z;
    final ListChatInfo a;
    
    static {
        final char[] charArray = "8\u0018^\u001bN7\u0019L\u001bN=\u001fK\u0000>;\u001fN\u0003x7\u001ar\u0003t5\u0007H(c;\u0004]".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0011';
                    break;
                }
                case 0: {
                    c2 = 'T';
                    break;
                }
                case 1: {
                    c2 = 'q';
                    break;
                }
                case 2: {
                    c2 = '-';
                    break;
                }
                case 3: {
                    c2 = 'o';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    th(final ListChatInfo a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        Log.i(th.z);
        App.G(ListChatInfo.e(this.a).u);
        App.e(ListChatInfo.e(this.a).u);
        this.a.startActivity(new Intent(App.aq.getApplicationContext(), Main.h()).addFlags(603979776));
    }
}
