// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.c6;

public class jy extends j1
{
    private static final String z;
    int b;
    c6 c;
    
    static {
        final char[] charArray = ";\u0007ye^-*TmN<U".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '-';
                    break;
                }
                case 0: {
                    c2 = 'J';
                    break;
                }
                case 1: {
                    c2 = 'u';
                    break;
                }
                case 2: {
                    c2 = '&';
                    break;
                }
                case 3: {
                    c2 = '\b';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public jy(final c6 c, final int b) {
        this.c = c;
        this.b = b;
    }
    
    @Override
    public String b() {
        return jy.z + this.c.toString();
    }
    
    @Override
    public void c() {
        App.a(this.c, this.b);
    }
}
