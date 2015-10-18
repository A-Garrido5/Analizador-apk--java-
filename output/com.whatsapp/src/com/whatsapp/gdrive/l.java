// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.content.Intent;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class l implements DialogInterface$OnClickListener
{
    private static final String z;
    final k a;
    
    static {
        final char[] charArray = "0w.\b\u001d8}d\t\u0017%m#\u0014\u0015\"7\u00034&\u0014K\u0004;>\u000eJ\u001e5 \u0010^\u000f%!\u0014M\u001e3<\u0016J".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'r';
                    break;
                }
                case 0: {
                    c2 = 'Q';
                    break;
                }
                case 1: {
                    c2 = '\u0019';
                    break;
                }
                case 2: {
                    c2 = 'J';
                    break;
                }
                case 3: {
                    c2 = 'z';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    l(final k a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.a.startActivity(new Intent(l.z));
    }
}
