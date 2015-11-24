// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class aa6 implements View$OnClickListener
{
    private static final String z;
    final AccountInfoActivity a;
    
    static {
        final char[] charArray = "QUX=BlZX0]RZC".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = ')';
                    break;
                }
                case 0: {
                    c2 = '3';
                    break;
                }
                case 1: {
                    c2 = '9';
                    break;
                }
                case 2: {
                    c2 = '7';
                    break;
                }
                case 3: {
                    c2 = '^';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    aa6(final AccountInfoActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final Intent intent = new Intent((Context)this.a, (Class)ContactPicker.class);
        intent.putExtra(aa6.z, true);
        this.a.startActivityForResult(intent, 10002);
    }
}
