// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class a_a implements DialogInterface$OnClickListener
{
    private static final String z;
    final Advanced a;
    
    static {
        final char[] charArray = "\u000b]\b\u0012{\u0004T".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\t';
                    break;
                }
                case 0: {
                    c2 = 'e';
                    break;
                }
                case 1: {
                    c2 = '8';
                    break;
                }
                case 2: {
                    c2 = '}';
                    break;
                }
                case 3: {
                    c2 = 'f';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    a_a(final Advanced a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        App.F(a_a.z);
    }
}
