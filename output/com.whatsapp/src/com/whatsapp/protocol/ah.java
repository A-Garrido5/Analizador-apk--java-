// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

import java.util.Hashtable;

class ah extends a
{
    private static final String z;
    final c2 a;
    final bf b;
    final Runnable c;
    
    static {
        final char[] charArray = "\b_tjS\u001f".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '%';
                    break;
                }
                case 0: {
                    c2 = 'z';
                    break;
                }
                case 1: {
                    c2 = ':';
                    break;
                }
                case 2: {
                    c2 = '\u0019';
                    break;
                }
                case 3: {
                    c2 = '\u0005';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    ah(final bf b, final Runnable c, final c2 a) {
        this.b = b;
        this.c = c;
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
        bf.a(this.b, c0, hashtable, hashtable2, ah.z);
        bf.b(this.b).a(s, hashtable, hashtable2);
        if (this.c != null) {
            this.c.run();
        }
    }
}
