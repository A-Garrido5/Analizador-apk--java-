// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.view.View;
import android.view.View$OnClickListener;

class wt implements View$OnClickListener
{
    private static final String z;
    final RegisterName a;
    
    static {
        final char[] charArray = "\tV!aF\u000fV4fT\u0016VikY\u0012P-mQ".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '5';
                    break;
                }
                case 0: {
                    c2 = '{';
                    break;
                }
                case 1: {
                    c2 = '3';
                    break;
                }
                case 2: {
                    c2 = 'F';
                    break;
                }
                case 3: {
                    c2 = '\b';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    wt(final RegisterName a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        Log.i(wt.z);
        RegisterName.n(this.a);
    }
}
