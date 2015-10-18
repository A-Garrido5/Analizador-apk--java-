// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

import java.util.Hashtable;

class ao extends a
{
    private static final String z;
    final Runnable a;
    final c2 b;
    final bf c;
    
    static {
        final char[] charArray = "[u)\u0018WZ".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '#';
                    break;
                }
                case 0: {
                    c2 = '?';
                    break;
                }
                case 1: {
                    c2 = '\u0010';
                    break;
                }
                case 2: {
                    c2 = 'D';
                    break;
                }
                case 3: {
                    c2 = 'w';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    ao(final bf c, final Runnable a, final c2 b) {
        this.c = c;
        this.a = a;
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
        bf.a(this.c, c0, hashtable, hashtable2, ao.z);
        bf.b(this.c).b(s, hashtable, hashtable2);
        if (this.a != null) {
            this.a.run();
        }
    }
}
