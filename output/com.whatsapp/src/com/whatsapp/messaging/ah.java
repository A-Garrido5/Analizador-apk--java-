// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import com.whatsapp.util.Log;
import android.os.Message;
import android.os.Handler$Callback;

class ah implements Handler$Callback
{
    private static final String z;
    final ae a;
    
    static {
        final char[] charArray = "9I\u007f\u0003W2A}\u0005\u0011\"A \u001f\u0017&Ma\\\f(Ij\u001c\r5\u000bj\u000b\b(Vj\u0017".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'x';
                    break;
                }
                case 0: {
                    c2 = 'A';
                    break;
                }
                case 1: {
                    c2 = '$';
                    break;
                }
                case 2: {
                    c2 = '\u000f';
                    break;
                }
                case 3: {
                    c2 = 's';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    ah(final ae a) {
        this.a = a;
    }
    
    public boolean handleMessage(final Message message) {
        Log.e(ah.z);
        ae.c(this.a);
        return true;
    }
}
