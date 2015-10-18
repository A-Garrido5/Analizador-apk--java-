// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.inputmethod.InputMethodManager;
import android.view.View;
import android.view.View$OnClickListener;

class kk implements View$OnClickListener
{
    private static final String z;
    final ah6 a;
    
    static {
        final char[] charArray = "ZfkS*le~R6\\l".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '^';
                    break;
                }
                case 0: {
                    c2 = '3';
                    break;
                }
                case 1: {
                    c2 = '\b';
                    break;
                }
                case 2: {
                    c2 = '\u001b';
                    break;
                }
                case 3: {
                    c2 = '&';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    kk(final ah6 a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        ((InputMethodManager)ah6.g(this.a).getSystemService(kk.z)).hideSoftInputFromWindow(ah6.e(this.a).getWindowToken(), 0);
        ah6.c(this.a).a(this.a.findViewById(2131755548));
    }
}
