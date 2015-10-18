// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class j5 implements DialogInterface$OnClickListener
{
    private static final String z;
    final Advanced a;
    
    static {
        final char[] charArray = "t<{m_m%m".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '+';
                    break;
                }
                case 0: {
                    c2 = '\u0004';
                    break;
                }
                case 1: {
                    c2 = 'S';
                    break;
                }
                case 2: {
                    c2 = '\b';
                    break;
                }
                case 3: {
                    c2 = '\u0004';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    j5(final Advanced a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        App.F(j5.z);
    }
}
