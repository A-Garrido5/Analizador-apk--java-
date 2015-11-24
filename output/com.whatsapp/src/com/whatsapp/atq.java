// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.AsyncTask;
import android.os.Message;
import android.os.Handler;

class atq extends Handler
{
    private static final String z;
    final VerifySms a;
    
    static {
        final char[] charArray = "O\f4\u0011bX\r".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u000b';
                    break;
                }
                case 0: {
                    c2 = '=';
                    break;
                }
                case 1: {
                    c2 = 'i';
                    break;
                }
                case 2: {
                    c2 = '@';
                    break;
                }
                case 3: {
                    c2 = 'c';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    private atq(final VerifySms a) {
        this.a = a;
    }
    
    atq(final VerifySms verifySms, final VerifySms$1 verifySms$1) {
        this(verifySms);
    }
    
    public void handleMessage(final Message message) {
        switch (message.what) {
            default: {}
            case 1: {
                a8s.a(new b2(this.a), new String[] { (String)message.obj, atq.z });
            }
        }
    }
}
