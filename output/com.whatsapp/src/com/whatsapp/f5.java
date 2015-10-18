// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class f5 implements View$OnClickListener
{
    private static final String z;
    final Advanced a;
    
    static {
        final char[] charArray = "KC\u001aqfM".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0001';
                    break;
                }
                case 0: {
                    c2 = '.';
                    break;
                }
                case 1: {
                    c2 = '\"';
                    break;
                }
                case 2: {
                    c2 = 'n';
                    break;
                }
                case 3: {
                    c2 = 'Q';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    f5(final Advanced a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        App.F(f5.z);
        new Thread(new i3(this)).start();
    }
}
