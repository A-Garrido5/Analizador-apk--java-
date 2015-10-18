// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class _w implements DialogInterface$OnClickListener
{
    private static final String z;
    final GroupChatInfo a;
    
    static {
        final char[] charArray = ",{{\u0012{\u0014`z\u0001ddfz\u0004g\"j\u007f8o.eq\u0013n\f{{\u0012{".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u000b';
                    break;
                }
                case 0: {
                    c2 = 'K';
                    break;
                }
                case 1: {
                    c2 = '\t';
                    break;
                }
                case 2: {
                    c2 = '\u0014';
                    break;
                }
                case 3: {
                    c2 = 'g';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    _w(final GroupChatInfo a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        Log.i(_w.z);
        GroupChatInfo.b(this.a);
    }
}
