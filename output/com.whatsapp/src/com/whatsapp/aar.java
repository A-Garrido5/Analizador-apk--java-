// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.ay;
import com.whatsapp.util.Log;
import java.io.InputStream;

class aar implements _b
{
    private static final String z;
    final ad a;
    
    static {
        final char[] charArray = "IV\u000b'!QV\u0016!kR\\\u0006-%JI\u000e+%[\u0016\u0005!0VW\u001210LM\u0010!%R".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'D';
                    break;
                }
                case 0: {
                    c2 = '?';
                    break;
                }
                case 1: {
                    c2 = '9';
                    break;
                }
                case 2: {
                    c2 = 'b';
                    break;
                }
                case 3: {
                    c2 = 'D';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    aar(final ad a) {
        this.a = a;
    }
    
    @Override
    public String a() {
        return this.a.b().file.getName();
    }
    
    @Override
    public long b() {
        return -1L;
    }
    
    @Override
    public InputStream c() {
        Log.i(aar.z);
        ad.a(this.a, new t4(this, this.a.b().file));
        return ad.b(this.a);
    }
}
