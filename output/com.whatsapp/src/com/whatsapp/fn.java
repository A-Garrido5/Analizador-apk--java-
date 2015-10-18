// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.IOException;

class fn implements Runnable
{
    private static final String z;
    final o8 a;
    
    static {
        final char[] charArray = "L\"\f\u0010vH(\u0006\u001ca^(\u0017\u0012f^$\n\u0001vY\"\u0017\u0017".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0013';
                    break;
                }
                case 0: {
                    c2 = ':';
                    break;
                }
                case 1: {
                    c2 = 'M';
                    break;
                }
                case 2: {
                    c2 = 'e';
                    break;
                }
                case 3: {
                    c2 = 's';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    fn(final o8 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        o8.a(this.a, true);
        try {
            o8.a(this.a);
            o8.a(this.a, false);
        }
        catch (IllegalStateException ex) {}
        catch (IOException ex2) {
            goto Label_0027;
        }
    }
}
