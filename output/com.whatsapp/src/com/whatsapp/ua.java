// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class ua implements View$OnClickListener
{
    private static final String z;
    final Advanced a;
    
    static {
        final char[] charArray = "\bGN:z".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u001d';
                    break;
                }
                case 0: {
                    c2 = 'l';
                    break;
                }
                case 1: {
                    c2 = '\"';
                    break;
                }
                case 2: {
                    c2 = ',';
                    break;
                }
                case 3: {
                    c2 = 'O';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    ua(final Advanced a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        App.S.k();
        final Intent intent = new Intent((Context)this.a, (Class)RegisterName.class);
        intent.putExtra(ua.z, true);
        this.a.finish();
        this.a.startActivity(intent);
    }
}
