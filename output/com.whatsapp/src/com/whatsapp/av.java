// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;

class av implements Runnable
{
    private static final String z;
    final ahb a;
    
    static {
        final char[] charArray = "W\u0019^1HO\fV7H^SN1D_\u0013O,\t".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = ')';
                    break;
                }
                case 0: {
                    c2 = ':';
                    break;
                }
                case 1: {
                    c2 = '|';
                    break;
                }
                case 2: {
                    c2 = ':';
                    break;
                }
                case 3: {
                    c2 = 'X';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    av(final ahb a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        Log.i(av.z + this.a.a.h.a);
        this.a.a.cancel(true);
    }
}
