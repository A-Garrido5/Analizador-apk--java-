// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.inputmethod.InputMethodManager;
import android.view.View;
import android.view.View$OnClickListener;

class pt implements View$OnClickListener
{
    private static final String z;
    final MultipleContactsSelector a;
    
    static {
        final char[] charArray = ", 3(|\u001a#&)`**".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\b';
                    break;
                }
                case 0: {
                    c2 = 'E';
                    break;
                }
                case 1: {
                    c2 = 'N';
                    break;
                }
                case 2: {
                    c2 = 'C';
                    break;
                }
                case 3: {
                    c2 = ']';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    pt(final MultipleContactsSelector a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (this.a.l.size() < this.a.c()) {
            App.a(this.a.getBaseContext(), String.format(App.C.a(2131296285, this.a.c()), this.a.c()), 0);
            if (!App.I) {
                return;
            }
        }
        ((InputMethodManager)this.a.getSystemService(pt.z)).hideSoftInputFromWindow(this.a.t.getWindowToken(), 0);
        this.a.j();
    }
}
