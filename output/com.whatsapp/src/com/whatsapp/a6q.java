// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import com.whatsapp.util.Log;
import android.view.View;
import android.view.View$OnClickListener;

class a6q implements View$OnClickListener
{
    private static final String z;
    final OverlayAlert a;
    
    static {
        final char[] charArray = "\u0006EO/v\bJ\u0005/\u007f\u001bVM4i\u001dVXry\u0005ZI6\u007f\r".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u001a';
                    break;
                }
                case 0: {
                    c2 = 'i';
                    break;
                }
                case 1: {
                    c2 = '3';
                    break;
                }
                case 2: {
                    c2 = '*';
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
    
    a6q(final OverlayAlert a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        Log.i(a6q.z);
        OverlayAlert.a(this.a);
    }
}
