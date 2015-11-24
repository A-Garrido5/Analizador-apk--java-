// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public final class as0
{
    private static final String z;
    private final String a;
    
    static {
        final char[] charArray = "\nfHhf?rtaz8wHjL={Ipr!wC9.".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\t';
                    break;
                }
                case 0: {
                    c2 = 'K';
                    break;
                }
                case 1: {
                    c2 = '\u001e';
                    break;
                }
                case 2: {
                    c2 = '\'';
                    break;
                }
                case 3: {
                    c2 = '\u0004';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public as0(final String a) {
        this.a = a;
    }
    
    @Override
    public String toString() {
        return as0.z + this.a + '\'' + '}';
    }
}
