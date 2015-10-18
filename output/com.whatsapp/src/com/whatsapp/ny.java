// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Message;
import android.view.View;
import android.view.View$OnClickListener;

class ny implements View$OnClickListener
{
    private static final String z;
    final Advanced a;
    
    static {
        final char[] charArray = "\u00125!]&\u0007!".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'E';
                    break;
                }
                case 0: {
                    c2 = 'w';
                    break;
                }
                case 1: {
                    c2 = 'T';
                    break;
                }
                case 2: {
                    c2 = 'U';
                    break;
                }
                case 3: {
                    c2 = '}';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    ny(final Advanced a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        App.F(ny.z);
        new ud(this).handleMessage(null);
    }
}
