// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

abstract class an extends ay
{
    private static final String z;
    
    static {
        final char[] charArray = "z(O\u0013".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u001d';
                    break;
                }
                case 0: {
                    c2 = 'R';
                    break;
                }
                case 1: {
                    c2 = '\u0018';
                    break;
                }
                case 2: {
                    c2 = '~';
                    break;
                }
                case 3: {
                    c2 = ':';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    an(final hN hn) {
        super(hn);
    }
    
    private static void b(final StringBuilder sb, final int n) {
        final int c = ay.c;
        int i = 0;
        int n2 = 0;
        while (i < 13) {
            int n3 = -48 + sb.charAt(i + n);
            if ((i & 0x1) == 0x0) {
                n3 *= 3;
            }
            n2 += n3;
            final int n4 = i + 1;
            if (c != 0) {
                break;
            }
            i = n4;
        }
        int n5 = 10 - n2 % 10;
        if (n5 == 10) {
            n5 = 0;
        }
        sb.append(n5);
    }
    
    protected final void a(final StringBuilder sb, final int n) {
        sb.append(an.z);
        final int length = sb.length();
        sb.append('9');
        this.a(sb, n, length);
    }
    
    protected final void a(final StringBuilder sb, final int n, final int n2) {
        final int c = ay.c;
        int i = 0;
        while (i < 4) {
            final int a = this.a().a(n + i * 10, 10);
            if (a / 100 == 0) {
                sb.append('0');
            }
            if (a / 10 == 0) {
                sb.append('0');
            }
            sb.append(a);
            ++i;
            if (c != 0) {
                break;
            }
        }
        b(sb, n2);
    }
}
