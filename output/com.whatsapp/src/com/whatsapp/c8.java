// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class c8 implements Runnable
{
    private static final String z;
    final String a;
    final String b;
    final long c;
    final ie d;
    final String e;
    
    static {
        final char[] charArray = "B[fnNB".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = ';';
                    break;
                }
                case 0: {
                    c2 = '1';
                    break;
                }
                case 1: {
                    c2 = '/';
                    break;
                }
                case 2: {
                    c2 = '\u0007';
                    break;
                }
                case 3: {
                    c2 = '\u001a';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    c8(final ie d, final String b, final long c, final String e, final String a) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.e = e;
        this.a = a;
    }
    
    @Override
    public void run() {
        App.S.a(this.b, this.c, this.e);
        App.b(this.a, this.b, c8.z);
        App.aq.a5().post((Runnable)new alq(this));
    }
}
