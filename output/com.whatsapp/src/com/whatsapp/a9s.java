// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class a9s implements DialogInterface$OnClickListener
{
    private static final String z;
    final LocationPicker2 a;
    
    static {
        final char[] charArray = "cYWvIkS\u001dwCvCZjAq\u0019\u007fKeCczKh]d|QtArlWcVczJaQ".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '&';
                    break;
                }
                case 0: {
                    c2 = '\u0002';
                    break;
                }
                case 1: {
                    c2 = '7';
                    break;
                }
                case 2: {
                    c2 = '3';
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
    
    a9s(final LocationPicker2 a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.startActivityForResult(new Intent(a9s.z), 0);
        this.a.removeDialog(2);
    }
}
