// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadFactory;

final class p implements ThreadFactory
{
    private static final String z;
    private final AtomicInteger a;
    
    static {
        final char[] charArray = "w,~0'UcU%\"F&1\u0000$B(t%k\u0013".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'K';
                    break;
                }
                case 0: {
                    c2 = '0';
                    break;
                }
                case 1: {
                    c2 = 'C';
                    break;
                }
                case 2: {
                    c2 = '\u0011';
                    break;
                }
                case 3: {
                    c2 = 'W';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    p() {
        this.a = new AtomicInteger(1);
    }
    
    @Override
    public Thread newThread(final Runnable runnable) {
        return new Thread(new cd(this, runnable), p.z + this.a.getAndIncrement());
    }
}
