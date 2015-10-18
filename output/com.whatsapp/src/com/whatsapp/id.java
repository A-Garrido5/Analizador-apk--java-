// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.inputmethod.InputMethodManager;
import android.view.View;
import android.view.View$OnClickListener;

class id implements View$OnClickListener
{
    private static final String z;
    final NewGroup a;
    
    static {
        final char[] charArray = "C6\u000f*nu5\u001a+rE<".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u001a';
                    break;
                }
                case 0: {
                    c2 = '*';
                    break;
                }
                case 1: {
                    c2 = 'X';
                    break;
                }
                case 2: {
                    c2 = '\u007f';
                    break;
                }
                case 3: {
                    c2 = '_';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    id(final NewGroup a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        ((InputMethodManager)this.a.getSystemService(id.z)).hideSoftInputFromWindow(NewGroup.b(this.a).getWindowToken(), 0);
        NewGroup.c(this.a).a(this.a.findViewById(2131755548));
    }
}
