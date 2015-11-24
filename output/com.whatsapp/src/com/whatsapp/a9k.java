// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.view.View;
import android.view.View$OnClickListener;

class a9k implements View$OnClickListener
{
    private static final String z;
    final Advanced a;
    
    static {
        final char[] charArray = "\u001dw3w>\u000bu.$8\u001cs3>#\u000024#-\u001awzg".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'L';
                    break;
                }
                case 0: {
                    c2 = 'n';
                    break;
                }
                case 1: {
                    c2 = '\u0012';
                    break;
                }
                case 2: {
                    c2 = 'G';
                    break;
                }
                case 3: {
                    c2 = 'W';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    a9k(final Advanced a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        App.F(a9k.z);
        App.b((Context)this.a, 0);
        new atj((j5)null).start();
    }
}
