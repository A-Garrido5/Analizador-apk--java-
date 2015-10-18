// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public final class a8o
{
    private static final String z;
    private final boolean a;
    
    static {
        final char[] charArray = "t|2\u00026wr3\u0002\tKw $,E}\"\u0002?T|2\u00026wr3\u0002\tKw Z".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'D';
                    break;
                }
                case 0: {
                    c2 = '$';
                    break;
                }
                case 1: {
                    c2 = '\u0013';
                    break;
                }
                case 2: {
                    c2 = 'E';
                    break;
                }
                case 3: {
                    c2 = 'g';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public a8o(final boolean a) {
        this.a = a;
    }
    
    public boolean a() {
        return this.a;
    }
    
    @Override
    public String toString() {
        return a8o.z + this.a + '}';
    }
}
