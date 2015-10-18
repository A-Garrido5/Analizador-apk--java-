// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class tx implements View$OnClickListener
{
    private static final String z;
    final Advanced a;
    
    static {
        final char[] charArray = "j\u000bFA$r".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'Q';
                    break;
                }
                case 0: {
                    c2 = '\u0006';
                    break;
                }
                case 1: {
                    c2 = 'd';
                    break;
                }
                case 2: {
                    c2 = '!';
                    break;
                }
                case 3: {
                    c2 = '.';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    tx(final Advanced a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        App.F(tx.z);
        App.o();
    }
}
