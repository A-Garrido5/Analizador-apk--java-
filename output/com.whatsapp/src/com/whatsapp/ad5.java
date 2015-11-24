// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class ad5 implements DialogInterface$OnClickListener
{
    private static final String z;
    final DialogToastPreferenceActivity a;
    
    static {
        final char[] charArray = "18\u0005d*92Oe $\"\bx\"#x(X\u0011\u0015\u0004/W\t\u000f\u00055Y\u0017\u0011\u0011$I\u0016\u0015\u00025_\u000b\u0017\u0005".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'E';
                    break;
                }
                case 0: {
                    c2 = 'P';
                    break;
                }
                case 1: {
                    c2 = 'V';
                    break;
                }
                case 2: {
                    c2 = 'a';
                    break;
                }
                case 3: {
                    c2 = '\u0016';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    ad5(final DialogToastPreferenceActivity a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.startActivity(new Intent(ad5.z));
    }
}
