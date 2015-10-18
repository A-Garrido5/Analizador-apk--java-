// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class vj implements View$OnClickListener
{
    private static final String z;
    final Advanced a;
    
    static {
        final char[] charArray = "x2]Kzd0@\u00056m6@\u0007so".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0016';
                    break;
                }
                case 0: {
                    c2 = '\u000b';
                    break;
                }
                case 1: {
                    c2 = 'W';
                    break;
                }
                case 2: {
                    c2 = ')';
                    break;
                }
                case 3: {
                    c2 = 'k';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    vj(final Advanced a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        App.F(vj.z);
        App.f(true);
    }
}
