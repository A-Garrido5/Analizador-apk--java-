// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public class jx extends j1
{
    private static final String z;
    String b;
    boolean c;
    
    static {
        final char[] charArray = "p<\u0012%Um'>3is+..Fh+#3E!".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '6';
                    break;
                }
                case 0: {
                    c2 = '\u0001';
                    break;
                }
                case 1: {
                    c2 = 'N';
                    break;
                }
                case 2: {
                    c2 = 'M';
                    break;
                }
                case 3: {
                    c2 = 'G';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public jx(final String b, final boolean c) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    public boolean a() {
        return this.c || super.a();
    }
    
    @Override
    public String b() {
        return jx.z + this.b;
    }
    
    @Override
    public void c() {
        App.b(this.b, this.c);
    }
}
