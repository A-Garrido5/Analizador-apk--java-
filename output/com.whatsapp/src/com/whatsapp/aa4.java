// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.concurrent.ThreadFactory;

final class aa4 implements ThreadFactory
{
    private static final String z;
    
    static {
        final char[] charArray = "\u0005z\u0005\u001fZ0n".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '5';
                    break;
                }
                case 0: {
                    c2 = 'D';
                    break;
                }
                case 1: {
                    c2 = '\u0002';
                    break;
                }
                case 2: {
                    c2 = 'j';
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
    
    @Override
    public Thread newThread(final Runnable runnable) {
        return new Thread(new ad4(this, runnable), aa4.z);
    }
}
