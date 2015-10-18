// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import com.whatsapp.messaging.MessageService;
import android.view.View;
import android.view.View$OnClickListener;

class f implements View$OnClickListener
{
    private static final String z;
    final Advanced a;
    
    static {
        final char[] charArray = "}k3H$ak3S".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'J';
                    break;
                }
                case 0: {
                    c2 = '\u000f';
                    break;
                }
                case 1: {
                    c2 = '\u000e';
                    break;
                }
                case 2: {
                    c2 = 'P';
                    break;
                }
                case 3: {
                    c2 = '\'';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    f(final Advanced a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        App.F(f.z);
        MessageService.b((Context)this.a, true);
    }
}
