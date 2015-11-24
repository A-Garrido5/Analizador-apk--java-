// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.io.RandomAccessFile;

public class bx extends bi
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        String s = "*p";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\b';
                        break;
                    }
                    case 0: {
                        c2 = '\n';
                        break;
                    }
                    case 1: {
                        c2 = 'X';
                        break;
                    }
                    case 2: {
                        c2 = '?';
                        break;
                    }
                    case 3: {
                        c2 = '&';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "*:FRmyq\u001f";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public bx(final long n, final String s, final RandomAccessFile randomAccessFile) {
        super(n, s);
    }
    
    @Override
    public String toString() {
        return this.a + bx.z[0] + this.c + bx.z[1];
    }
}
