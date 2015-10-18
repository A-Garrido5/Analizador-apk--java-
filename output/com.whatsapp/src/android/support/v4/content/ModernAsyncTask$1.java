// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.content;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadFactory;

final class ModernAsyncTask$1 implements ThreadFactory
{
    private static final String z;
    private final AtomicInteger mCount;
    
    static {
        final char[] charArray = "\t\u0015e8\u0017*;r$\u000b'.`.\u000edY".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'e';
                    break;
                }
                case 0: {
                    c2 = 'D';
                    break;
                }
                case 1: {
                    c2 = 'z';
                    break;
                }
                case 2: {
                    c2 = '\u0001';
                    break;
                }
                case 3: {
                    c2 = ']';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    ModernAsyncTask$1() {
        this.mCount = new AtomicInteger(1);
    }
    
    @Override
    public Thread newThread(final Runnable runnable) {
        return new Thread(runnable, ModernAsyncTask$1.z + this.mCount.getAndIncrement());
    }
}
