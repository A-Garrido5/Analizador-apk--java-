// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import com.whatsapp.DialogToastActivity;
import java.io.RandomAccessFile;

public class bf extends bx
{
    private static final String[] z;
    long d;
    long e;
    an f;
    double g;
    double h;
    int i;
    long j;
    
    static {
        final String[] z2 = new String[3];
        String s = "D\t8OH\u0010\u0004\"S\u0013";
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
                        c2 = ')';
                        break;
                    }
                    case 0: {
                        c2 = 'd';
                        break;
                    }
                    case 1: {
                        c2 = 'm';
                        break;
                    }
                    case 2: {
                        c2 = 'M';
                        break;
                    }
                    case 3: {
                        c2 = '=';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "D\u001f\"IH\u0010\u0004\"S\u0013";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\u0011\u0003$IZD";
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
    
    public bf(final long n, final String s, final RandomAccessFile randomAccessFile) {
        final int b = bi.b;
        super(n, s, randomAccessFile);
        this.f = an.c;
        this.i = bb.d(randomAccessFile);
        bb.a(randomAccessFile);
        this.j = bb.e(randomAccessFile);
        this.d = bb.e(randomAccessFile);
        bb.e(randomAccessFile);
        bb.e(randomAccessFile);
        this.e = bb.e(randomAccessFile);
        bb.e(randomAccessFile);
        bb.e(randomAccessFile);
        bb.f(randomAccessFile);
        bb.f(randomAccessFile);
        bb.f(randomAccessFile);
        bb.f(randomAccessFile);
        this.f = an.a(randomAccessFile);
        this.g = bb.g(randomAccessFile);
        this.h = bb.g(randomAccessFile);
        if (DialogToastActivity.h) {
            bi.b = b + 1;
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + "[" + bb.a(this.j) + "/" + bb.a(this.d) + bf.z[0] + this.e + bf.z[2] + this.f + " " + this.g + "x" + this.h + bf.z[1] + this.f.a() + "]";
    }
}
