// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.util.Log;
import android.view.View;
import android.view.View$OnClickListener;

class mo implements View$OnClickListener
{
    private static final String z;
    final ContactPickerHelp a;
    
    static {
        final char[] charArray = "{\u0004+\u0014]{\u001f-\u0005PhD6\bSo\u0002+\u0016Uk\u0002'\fY7\b)\t_s\u000e!".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '<';
                    break;
                }
                case 0: {
                    c2 = '\u0018';
                    break;
                }
                case 1: {
                    c2 = 'k';
                    break;
                }
                case 2: {
                    c2 = 'E';
                    break;
                }
                case 3: {
                    c2 = '`';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    mo(final ContactPickerHelp a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        Log.i(mo.z);
        a8s.a(new alc(this.a, null), new Void[0]);
    }
}
