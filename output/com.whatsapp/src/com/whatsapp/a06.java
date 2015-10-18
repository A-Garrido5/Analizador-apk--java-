// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class a06 implements View$OnClickListener
{
    private static final String z;
    final Advanced a;
    
    static {
        final char[] charArray = "\u0014Ro72\u0014^te&".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '_';
                    break;
                }
                case 0: {
                    c2 = 'q';
                    break;
                }
                case 1: {
                    c2 = '3';
                    break;
                }
                case 2: {
                    c2 = '\u001b';
                    break;
                }
                case 3: {
                    c2 = '\u0017';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    a06(final Advanced a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        App.F(a06.z);
        new Thread(new aq1(this)).start();
    }
}
