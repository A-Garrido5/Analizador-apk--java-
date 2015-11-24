// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class av extends aD
{
    private static final String z;
    
    static {
        final char[] charArray = "d\bFuEe".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'v';
                    break;
                }
                case 0: {
                    c2 = 'L';
                    break;
                }
                case 1: {
                    c2 = ';';
                    break;
                }
                case 2: {
                    c2 = 'w';
                    break;
                }
                case 3: {
                    c2 = 'E';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    av(final hN hn) {
        super(hn);
    }
    
    @Override
    protected int a(final int n) {
        return n;
    }
    
    @Override
    protected void c(final StringBuilder sb, final int n) {
        sb.append(av.z);
    }
}
