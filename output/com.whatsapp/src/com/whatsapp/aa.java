// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.view.View;
import android.view.View$OnClickListener;

class aa implements View$OnClickListener
{
    private static final String z;
    final DeleteAccountConfirmation a;
    
    static {
        final char[] charArray = "Co\u001aE\u0006Bk\u0015C\u0006De\u0018F\u001bUgYN\u001d\ni\u0019N\u001cBi\u0002I\u0004N~\u000f".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'r';
                    break;
                }
                case 0: {
                    c2 = '\'';
                    break;
                }
                case 1: {
                    c2 = '\n';
                    break;
                }
                case 2: {
                    c2 = 'v';
                    break;
                }
                case 3: {
                    c2 = ' ';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    aa(final DeleteAccountConfirmation a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (!App.O()) {
            Log.i(aa.z);
            this.a.showDialog(2);
            return;
        }
        this.a.showDialog(1);
        DeleteAccountConfirmation.a(this.a).sendEmptyMessageDelayed(0, 60000L);
        App.aR();
    }
}
