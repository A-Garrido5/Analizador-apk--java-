// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public final class v1
{
    private static final String z;
    private final boolean a;
    private final Conversation b;
    
    static {
        final char[] charArray = "1Bb\u0017\u0007+D4\u0013D,H1\u0005\r0C".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'd';
                    break;
                }
                case 0: {
                    c2 = '_';
                    break;
                }
                case 1: {
                    c2 = '-';
                    break;
                }
                case 2: {
                    c2 = 'B';
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
    
    public v1(final Conversation b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    static Conversation a(final v1 v1) {
        return v1.b;
    }
    
    public boolean a() {
        return this.a;
    }
    
    public Conversation b() {
        if (!this.a()) {
            throw new AssertionError((Object)v1.z);
        }
        return this.b;
    }
}
