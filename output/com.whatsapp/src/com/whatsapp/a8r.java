// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bl;

class a8r implements bl
{
    private static final String z;
    final String a;
    final p9 b;
    final String c;
    
    static {
        final char[] charArray = ",d*WF\rcwA^\u001c9jEZ".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '.';
                    break;
                }
                case 0: {
                    c2 = 'l';
                    break;
                }
                case 1: {
                    c2 = '\u0017';
                    break;
                }
                case 2: {
                    c2 = '\u0004';
                    break;
                }
                case 3: {
                    c2 = ' ';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    a8r(final p9 b, final String c, final String a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public void a(final String s) {
        l7.a(this.c, 200);
        App.aB = this.a;
        App.C(App.au() + a8r.z);
    }
}
