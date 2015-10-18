// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.io.RandomAccessFile;

public class bu extends bx
{
    private static final String[] z;
    long d;
    long e;
    long f;
    an g;
    long h;
    int i;
    
    static {
        final String[] z2 = new String[3];
        String s = "\n\rf\u0006 ";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
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
                        c2 = 'y';
                        break;
                    }
                    case 1: {
                        c2 = 'h';
                        break;
                    }
                    case 2: {
                        c2 = '\u0005';
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
                    s = "PH";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "Y\fpTi\r\u0001jH2";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public bu(final long n, final String s, final RandomAccessFile randomAccessFile) {
        super(n, s, randomAccessFile);
        this.g = an.c;
        this.i = bb.d(randomAccessFile);
        bb.a(randomAccessFile);
        this.d = bb.e(randomAccessFile);
        this.f = bb.e(randomAccessFile);
        this.e = bb.e(randomAccessFile);
        this.h = bb.e(randomAccessFile);
        bb.e(randomAccessFile);
        bb.f(randomAccessFile);
        bb.f(randomAccessFile);
        bb.e(randomAccessFile);
        bb.e(randomAccessFile);
        this.g = an.a(randomAccessFile);
    }
    
    @Override
    public String toString() {
        return super.toString() + "[" + bb.a(this.d) + "/" + bb.a(this.f) + bu.z[2] + this.h / this.e + bu.z[0] + this.h + bu.z[1] + this.g + "]";
    }
}
