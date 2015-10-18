// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class e5 extends e_
{
    private static final String z;
    
    static {
        final char[] charArray = "L)K{".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '+';
                    break;
                }
                case 0: {
                    c2 = '\"';
                    break;
                }
                case 1: {
                    c2 = '\\';
                    break;
                }
                case 2: {
                    c2 = '\'';
                    break;
                }
                case 3: {
                    c2 = '\u0017';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public void a(final c3 c3, final Boolean b) {
        String s;
        if (b == null) {
            s = e5.z;
        }
        else {
            s = b.toString();
        }
        c3.a(s);
    }
    
    @Override
    public void a(final c3 c3, final Object o) {
        this.a(c3, (Boolean)o);
    }
}
