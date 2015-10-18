// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.io.RandomAccessFile;

public class bk extends bx
{
    private static final String z;
    String d;
    int e;
    String f;
    String g;
    String h;
    
    static {
        final char[] charArray = "5m\u001b".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0015';
                    break;
                }
                case 0: {
                    c2 = '\u0015';
                    break;
                }
                case 1: {
                    c2 = '@';
                    break;
                }
                case 2: {
                    c2 = ';';
                    break;
                }
                case 3: {
                    c2 = '\u007f';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public bk(final long n, final String s, final RandomAccessFile randomAccessFile) {
        super(n, s, randomAccessFile);
        this.e = bb.d(randomAccessFile);
        bb.a(randomAccessFile);
        this.g = bb.a(randomAccessFile, 4);
        this.h = bb.a(randomAccessFile, 4);
        this.d = bb.a(randomAccessFile, 4);
        bb.e(randomAccessFile);
        bb.e(randomAccessFile);
        int d = bb.d(randomAccessFile);
        if (d != n - 33L) {
            d = -33 + (int)n;
            randomAccessFile.seek(randomAccessFile.getFilePointer() - 1L);
        }
        final byte[] array = new byte[d];
        randomAccessFile.read(array, 0, d);
        this.f = new String(array);
    }
    
    @Override
    public String toString() {
        return super.toString() + "[" + this.g + "/" + this.h + bk.z + this.f + "]";
    }
}
