// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.view.View;
import android.view.View$OnClickListener;

class qe implements View$OnClickListener
{
    private static final String z;
    final VerifySms a;
    
    static {
        final char[] charArray = "8c\rxh7u\u0012b!+b\u0016e".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u000e';
                    break;
                }
                case 0: {
                    c2 = 'N';
                    break;
                }
                case 1: {
                    c2 = '\u0006';
                    break;
                }
                case 2: {
                    c2 = '\u007f';
                    break;
                }
                case 3: {
                    c2 = '\u0011';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    qe(final VerifySms a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        Log.i(qe.z);
        VerifySms.z(this.a);
    }
}
