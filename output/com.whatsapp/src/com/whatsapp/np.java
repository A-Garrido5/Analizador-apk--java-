// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class np implements DialogInterface$OnClickListener
{
    private static final String z;
    final Main a;
    
    static {
        final char[] charArray = "o8hS\u0019g2\"H\u0018z3bUXo5xH\u0019`xZh3Y".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'v';
                    break;
                }
                case 0: {
                    c2 = '\u000e';
                    break;
                }
                case 1: {
                    c2 = 'V';
                    break;
                }
                case 2: {
                    c2 = '\f';
                    break;
                }
                case 3: {
                    c2 = '!';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    np(final Main a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        aah.a();
        this.a.startActivity(new Intent(np.z, aah.e()));
        this.a.removeDialog(0);
        this.a.finish();
    }
}
