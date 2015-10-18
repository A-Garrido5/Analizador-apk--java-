// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

import java.util.Hashtable;

class al extends a
{
    private static final String z;
    final c2 a;
    final Runnable b;
    final bf c;
    
    static {
        final char[] charArray = "\u000b.k'g\u000f9".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\b';
                    break;
                }
                case 0: {
                    c2 = '{';
                    break;
                }
                case 1: {
                    c2 = '\\';
                    break;
                }
                case 2: {
                    c2 = '\u0004';
                    break;
                }
                case 3: {
                    c2 = 'J';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    al(final bf c, final Runnable b, final c2 a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a(final int n) {
        if (this.a != null) {
            this.a.a(n);
        }
    }
    
    @Override
    public void a(final c0 c0, final String s) {
        final Hashtable hashtable = new Hashtable();
        final Hashtable hashtable2 = new Hashtable();
        bf.a(this.c, c0, hashtable, hashtable2, al.z);
        bf.b(this.c).c(s, hashtable, hashtable2);
        if (this.b != null) {
            this.b.run();
        }
    }
}
