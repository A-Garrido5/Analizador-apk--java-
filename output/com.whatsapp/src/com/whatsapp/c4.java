// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class c4 implements DialogInterface$OnClickListener
{
    private static final String z;
    final ContactPicker a;
    
    static {
        final char[] charArray = "Bp\u0006XMBk".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = ',';
                    break;
                }
                case 0: {
                    c2 = '!';
                    break;
                }
                case 1: {
                    c2 = '\u001f';
                    break;
                }
                case 2: {
                    c2 = 'h';
                    break;
                }
                case 3: {
                    c2 = ',';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    c4(final ContactPicker a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        final Intent intent = new Intent();
        intent.putExtra(c4.z, ContactPicker.o(this.a).u);
        this.a.setResult(-1, intent);
        this.a.removeDialog(0);
        this.a.finish();
    }
}
