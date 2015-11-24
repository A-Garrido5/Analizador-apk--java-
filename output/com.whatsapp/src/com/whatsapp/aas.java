// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class aas implements DialogInterface$OnClickListener
{
    private static final String z;
    final LocationPicker a;
    
    static {
        final char[] charArray = "2\u0007l\u000fV:\r&\u000e\\'\u001da\u0013^ GD2z\u0012=A2w\f:G(k\u0010,W.|\u0007=A3~\u0000".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '9';
                    break;
                }
                case 0: {
                    c2 = 'S';
                    break;
                }
                case 1: {
                    c2 = 'i';
                    break;
                }
                case 2: {
                    c2 = '\b';
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
    
    aas(final LocationPicker a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.startActivityForResult(new Intent(aas.z), 0);
        this.a.removeDialog(2);
    }
}
