// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.content.DialogInterface;
import android.content.DialogInterface$OnCancelListener;

class _t implements DialogInterface$OnCancelListener
{
    private static final String z;
    final RegisterName a;
    
    static {
        final char[] charArray = "[>oxr]>z\u007f`D>'uhH7gv.J:fe,J4f\u007fdJ/'r`G8m}".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0001';
                    break;
                }
                case 0: {
                    c2 = ')';
                    break;
                }
                case 1: {
                    c2 = '[';
                    break;
                }
                case 2: {
                    c2 = '\b';
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
    
    _t(final RegisterName a) {
        this.a = a;
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
        Log.i(_t.z);
    }
}
