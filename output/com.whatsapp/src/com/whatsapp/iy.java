// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class iy implements DialogInterface$OnClickListener
{
    private static final String z;
    final GroupChatInfo a;
    
    static {
        final char[] charArray = "u\tyaUM\u0012xrJ=\u0014xwI{\u0018}K@|\u001fQfJg\u000b".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '%';
                    break;
                }
                case 0: {
                    c2 = '\u0012';
                    break;
                }
                case 1: {
                    c2 = '{';
                    break;
                }
                case 2: {
                    c2 = '\u0016';
                    break;
                }
                case 3: {
                    c2 = '\u0014';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    iy(final GroupChatInfo a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        Log.i(iy.z);
        GroupChatInfo.q(this.a);
    }
}
