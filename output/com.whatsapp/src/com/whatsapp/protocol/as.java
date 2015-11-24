// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

import java.util.Hashtable;

class as extends a
{
    private static final String z;
    final bf a;
    final c2 b;
    final Runnable c;
    
    static {
        final char[] charArray = ">,L".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'E';
                    break;
                }
                case 0: {
                    c2 = '_';
                    break;
                }
                case 1: {
                    c2 = 'H';
                    break;
                }
                case 2: {
                    c2 = '(';
                    break;
                }
                case 3: {
                    c2 = '\n';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    as(final bf a, final Runnable c, final c2 b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public void a(final int n) {
        if (this.b != null) {
            this.b.a(n);
        }
    }
    
    @Override
    public void a(final c0 c0, final String s) {
        final Hashtable hashtable = new Hashtable();
        final Hashtable hashtable2 = new Hashtable();
        bf.a(this.a, c0, hashtable, hashtable2, as.z);
        bf.b(this.a).d(s, hashtable, hashtable2);
        if (this.c != null) {
            this.c.run();
        }
    }
}
