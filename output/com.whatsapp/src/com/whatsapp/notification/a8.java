// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import java.util.List;
import com.whatsapp.aol;

class a8 extends ao
{
    private static final String z;
    
    static {
        final char[] charArray = "\u0011o1*;\u0006'00#Bd?3;BI1\u001d6\u0006`;-".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'W';
                    break;
                }
                case 0: {
                    c2 = 'b';
                    break;
                }
                case 1: {
                    c2 = '\u0007';
                    break;
                }
                case 2: {
                    c2 = '^';
                    break;
                }
                case 3: {
                    c2 = '_';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    private a8() {
    }
    
    a8(final as as) {
        this();
    }
    
    @Override
    public void a(final int n) {
        aol.a(true, a8.z);
    }
    
    @Override
    public List b() {
        return null;
    }
}
