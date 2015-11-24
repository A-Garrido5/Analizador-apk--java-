// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;

class mz implements Runnable
{
    private static final String z;
    final RegisterName a;
    
    static {
        final char[] charArray = ">nW\u0001\u00048nB\u0006\u0016!n\u001f\f\u001e-g_\u000fX%eY\u001c\u0007>dW\u001a\u0012?x\u001f\u001a\u0012!dF\r\u0013%j\\\u0007\u0010".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'w';
                    break;
                }
                case 0: {
                    c2 = 'L';
                    break;
                }
                case 1: {
                    c2 = '\u000b';
                    break;
                }
                case 2: {
                    c2 = '0';
                    break;
                }
                case 3: {
                    c2 = 'h';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    mz(final RegisterName a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        Log.i(mz.z);
        this.a.removeDialog(0);
    }
}
