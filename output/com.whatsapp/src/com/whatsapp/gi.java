// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class gi implements View$OnClickListener
{
    private static final String z;
    final Advanced a;
    
    static {
        final char[] charArray = ";G\u001bpw:\u0002\u0013w#>L\u00135q:Q\u0003zq:\u0002\u001ea-".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0003';
                    break;
                }
                case 0: {
                    c2 = '_';
                    break;
                }
                case 1: {
                    c2 = '\"';
                    break;
                }
                case 2: {
                    c2 = 'w';
                    break;
                }
                case 3: {
                    c2 = '\u0015';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    gi(final Advanced a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        App.F(gi.z);
        App.ak.i();
        new atj((j5)null).start();
    }
}
