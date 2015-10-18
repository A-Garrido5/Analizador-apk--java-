// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public final class a6k
{
    private static final String z;
    private final String a;
    
    static {
        final char[] charArray = "xKs,OM_O%N]Vn\u000bE@vj%NMH{2OLCV)D\u0004\u0014".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = ' ';
                    break;
                }
                case 0: {
                    c2 = '9';
                    break;
                }
                case 1: {
                    c2 = '3';
                    break;
                }
                case 2: {
                    c2 = '\u001c';
                    break;
                }
                case 3: {
                    c2 = '@';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public a6k(final String a) {
        this.a = a;
    }
    
    @Override
    public String toString() {
        return a6k.z + this.a + '\'' + '}';
    }
}
