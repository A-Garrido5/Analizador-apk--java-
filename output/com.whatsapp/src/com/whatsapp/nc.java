// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import com.whatsapp.protocol.c_;
import java.util.Vector;

class nc extends n9
{
    private static final String z;
    final asm j;
    
    static {
        final char[] charArray = "l\u0006\u00193-`\u0006\u00193'h\u0015\u001f3$\u007f)\b\u007f!d\u0019\u0007C&h\u00026{'b\u0003\u0019<6\u007f\u0013\bh0-\u0011\u001bs }V=S\u0011BV\bx1-\u0006\u0000\u007f!x\u0004\f".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'U';
                    break;
                }
                case 0: {
                    c2 = '\r';
                    break;
                }
                case 1: {
                    c2 = 'v';
                    break;
                }
                case 2: {
                    c2 = 'i';
                    break;
                }
                case 3: {
                    c2 = '\u001c';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    nc(final asm j, final String s, final String s2, final Vector vector, final int n, final c_ c_) {
        this.j = j;
        super(s, s2, vector, n, c_);
    }
    
    @Override
    public void a(final String s) {
        Log.i(nc.z);
        super.a(s);
    }
}
