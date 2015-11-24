// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class adu implements View$OnClickListener
{
    private static final String z;
    final Advanced a;
    
    static {
        final char[] charArray = "\u007f$$GDd?'H\u0001g>".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'd';
                    break;
                }
                case 0: {
                    c2 = '\u0014';
                    break;
                }
                case 1: {
                    c2 = 'M';
                    break;
                }
                case 2: {
                    c2 = 'H';
                    break;
                }
                case 3: {
                    c2 = '+';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    adu(final Advanced a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        App.F(adu.z);
        new atj((j5)null).start();
    }
}
