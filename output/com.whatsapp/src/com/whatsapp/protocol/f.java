// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class f extends a
{
    private static final String z;
    final bf a;
    
    static {
        final char[] charArray = "\u0007\n\u001e}m\u0010".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u001b';
                    break;
                }
                case 0: {
                    c2 = 'u';
                    break;
                }
                case 1: {
                    c2 = 'o';
                    break;
                }
                case 2: {
                    c2 = 's';
                    break;
                }
                case 3: {
                    c2 = '\u0012';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    f(final bf a) {
        this.a = a;
    }
    
    @Override
    public void a(final c0 c0, final String s) {
        c0.b(c0.a(0), f.z);
        bf.d(this.a).e();
    }
}
