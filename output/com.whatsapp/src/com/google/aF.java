// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

final class aF extends an
{
    private static final String z;
    
    static {
        final char[] charArray = " %}W".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'L';
                    break;
                }
                case 0: {
                    c2 = '\b';
                    break;
                }
                case 1: {
                    c2 = '\u0015';
                    break;
                }
                case 2: {
                    c2 = 'L';
                    break;
                }
                case 3: {
                    c2 = '~';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    aF(final hN hn) {
        super(hn);
    }
    
    @Override
    public String c() {
        final StringBuilder sb = new StringBuilder();
        sb.append(aF.z);
        final int length = sb.length();
        sb.append(this.a().a(4, 4));
        this.a(sb, 8, length);
        return this.a().a(sb, 48);
    }
}
