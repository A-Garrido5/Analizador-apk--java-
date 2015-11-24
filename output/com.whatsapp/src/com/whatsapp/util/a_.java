// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadFactory;

final class a_ implements ThreadFactory
{
    private static final String z;
    private final AtomicInteger a;
    
    static {
        final char[] charArray = "AE\u000f\u0003\fW]\u001eW(y_\u0005\u0012\r6\u000e".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u007f';
                    break;
                }
                case 0: {
                    c2 = '\u0016';
                    break;
                }
                case 1: {
                    c2 = '-';
                    break;
                }
                case 2: {
                    c2 = 'n';
                    break;
                }
                case 3: {
                    c2 = 'w';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    a_() {
        this.a = new AtomicInteger(1);
    }
    
    @Override
    public Thread newThread(final Runnable runnable) {
        return new Thread(new a(this, runnable), a_.z + this.a.getAndIncrement());
    }
}
