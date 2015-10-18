// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import com.whatsapp.adc;
import com.whatsapp.util.Log;
import com.whatsapp.protocol.c2;

class bv implements c2
{
    private static final String z;
    final w a;
    
    static {
        final char[] charArray = "@GO\u0006pOXV\u0002:J\u0005X\u00040MZv\u00186Ll^\u001f3]N".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '_';
                    break;
                }
                case 0: {
                    c2 = '8';
                    break;
                }
                case 1: {
                    c2 = '*';
                    break;
                }
                case 2: {
                    c2 = '?';
                    break;
                }
                case 3: {
                    c2 = 'v';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    bv(final w a) {
        this.a = a;
    }
    
    @Override
    public void a(final int n) {
        Log.e(bv.z);
        adc.e();
    }
}
