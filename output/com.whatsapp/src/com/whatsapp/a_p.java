// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class a_p implements Runnable
{
    private static final String z;
    final String a;
    final ie b;
    final String c;
    
    static {
        final char[] charArray = "\u000eaw\"V\u000e".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '#';
                    break;
                }
                case 0: {
                    c2 = '}';
                    break;
                }
                case 1: {
                    c2 = '\u0015';
                    break;
                }
                case 2: {
                    c2 = '\u0016';
                    break;
                }
                case 3: {
                    c2 = 'V';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    a_p(final ie b, final String a, final String c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public void run() {
        App.S.a(this.a);
        App.b(this.c, this.a, a_p.z);
        App.aq.a5().post((Runnable)new a9g(this));
    }
}
