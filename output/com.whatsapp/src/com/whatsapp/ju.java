// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public class ju extends j1
{
    private static final String z;
    a_9 b;
    
    static {
        final char[] charArray = "\u0016&\u001d<&\u0006 \u001d,+\u0002:m".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'N';
                    break;
                }
                case 0: {
                    c2 = 'g';
                    break;
                }
                case 1: {
                    c2 = 'T';
                    break;
                }
                case 2: {
                    c2 = 'B';
                    break;
                }
                case 3: {
                    c2 = '_';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public ju(final a_9 b) {
        this.b = b;
    }
    
    @Override
    public String b() {
        return ju.z + this.b.u;
    }
    
    @Override
    public void c() {
        App.b(this.b);
    }
}
