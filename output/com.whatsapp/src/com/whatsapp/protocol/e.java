// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class e extends a
{
    private static final String z;
    final c2 a;
    final bf b;
    final Runnable c;
    
    static {
        final char[] charArray = "Q\u001e\u0006B\u0006E".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '`';
                    break;
                }
                case 0: {
                    c2 = '<';
                    break;
                }
                case 1: {
                    c2 = 'q';
                    break;
                }
                case 2: {
                    c2 = 'b';
                    break;
                }
                case 3: {
                    c2 = '+';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    e(final bf b, final Runnable c, final c2 a) {
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
        final c0 a = c0.a(0);
        c0.b(a, e.z);
        if (this.c != null) {
            this.c.run();
        }
        final c0 a2 = a.a(0);
        if (a2 != null) {
            final ch b = bf.b(this.b, a2);
            if (b != null) {
                bf.d(this.b).a(b.a, b.b);
            }
        }
    }
}
