// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public final class a8p
{
    public static boolean b;
    private static final String z;
    private final boolean a;
    
    static {
        final char[] charArray = "2E-~1\u000fj0x?\u001aJ0x?\u0004Bb".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'T';
                    break;
                }
                case 0: {
                    c2 = 'a';
                    break;
                }
                case 1: {
                    c2 = '&';
                    break;
                }
                case 2: {
                    c2 = '_';
                    break;
                }
                case 3: {
                    c2 = '\u001b';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public a8p(final boolean a) {
        this.a = a;
    }
    
    public boolean a() {
        return this.a;
    }
    
    @Override
    public String toString() {
        return a8p.z + this.a + '}';
    }
}
