// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.inputmethod.InputMethodManager;
import android.view.View;
import android.view.View$OnClickListener;

class ep implements View$OnClickListener
{
    private static final String z;
    final RegisterName a;
    
    static {
        final char[] charArray = "0`Z0(\u0006cO146j".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\\';
                    break;
                }
                case 0: {
                    c2 = 'Y';
                    break;
                }
                case 1: {
                    c2 = '\u000e';
                    break;
                }
                case 2: {
                    c2 = '*';
                    break;
                }
                case 3: {
                    c2 = 'E';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    ep(final RegisterName a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        ((InputMethodManager)this.a.getSystemService(ep.z)).hideSoftInputFromWindow(RegisterName.g(this.a).getWindowToken(), 0);
        RegisterName.e(this.a).a(this.a.findViewById(2131755548));
    }
}
