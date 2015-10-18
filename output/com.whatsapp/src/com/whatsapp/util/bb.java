// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.io.RandomAccessFile;
import java.util.HashSet;

public class bb
{
    public static final HashSet a;
    public static final String[] b;
    private static final String[] z;
    private bi[] c;
    
    static {
        int i = 0;
        final String[] array = new String[6];
        String s = "\u0016U\nF\u0010;\u001d\u000b\n\u00060[\u001b\n\u0015!U\u0012\n\u0000,J\u001a";
        int n = -1;
        String[] array2 = array;
        String[] array3 = array;
        int n2 = 0;
        String intern = null;
    Label_0692:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int j = charArray.length, n3 = 0; j > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 't';
                        break;
                    }
                    case 0: {
                        c2 = 'U';
                        break;
                    }
                    case 1: {
                        c2 = ':';
                        break;
                    }
                    case 2: {
                        c2 = '\u007f';
                        break;
                    }
                    case 3: {
                        c2 = '*';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array2[n2] = intern;
                    s = "4N\u0010GT=[\f\n\u001d;L\u001eF\u001d1\u001a\fC\u000e0\u0000_";
                    n2 = 1;
                    array2 = array3;
                    n = 0;
                    continue;
                }
                case 0: {
                    array2[n2] = intern;
                    s = "#S\u001bO";
                    n2 = 2;
                    array2 = array3;
                    n = 1;
                    continue;
                }
                case 1: {
                    array2[n2] = intern;
                    s = "!Q\u0017N";
                    n2 = 3;
                    array2 = array3;
                    n = 2;
                    continue;
                }
                case 2: {
                    array2[n2] = intern;
                    s = "=^\u0013X";
                    n2 = 4;
                    array2 = array3;
                    n = 3;
                    continue;
                }
                case 3: {
                    array2[n2] = intern;
                    n2 = 5;
                    array2 = array3;
                    s = "8L\u0017N";
                    n = 4;
                    continue;
                }
                case 4: {
                    array2[n2] = intern;
                    z = array3;
                    final String[] array4 = new String[14];
                    s = "8U\u0010\\";
                    n = 5;
                    array2 = array4;
                    array3 = array4;
                    n2 = 0;
                    continue;
                }
                case 5: {
                    array2[n2] = intern;
                    s = "!H\u001eA";
                    n = 6;
                    n2 = 1;
                    array2 = array3;
                    continue;
                }
                case 6: {
                    array2[n2] = intern;
                    s = " ^\u000bK";
                    n = 7;
                    n2 = 2;
                    array2 = array3;
                    continue;
                }
                case 7: {
                    array2[n2] = intern;
                    s = "!H\u001aL";
                    n = 8;
                    n2 = 3;
                    array2 = array3;
                    continue;
                }
                case 8: {
                    array2[n2] = intern;
                    s = "<W\u001eZ";
                    n = 9;
                    n2 = 4;
                    array2 = array3;
                    continue;
                }
                case 9: {
                    array2[n2] = intern;
                    n2 = 5;
                    s = "8^\u0016K";
                    n = 10;
                    array2 = array3;
                    continue;
                }
                case 10: {
                    array2[n2] = intern;
                    n2 = 6;
                    s = "8S\u0011L";
                    n = 11;
                    array2 = array3;
                    continue;
                }
                case 11: {
                    array2[n2] = intern;
                    n2 = 7;
                    s = "&N\u001dF";
                    n = 12;
                    array2 = array3;
                    continue;
                }
                case 12: {
                    array2[n2] = intern;
                    n2 = 8;
                    s = "0^\u000bY";
                    n = 13;
                    array2 = array3;
                    continue;
                }
                case 13: {
                    array2[n2] = intern;
                    n2 = 9;
                    s = "8^\rK";
                    n = 14;
                    array2 = array3;
                    continue;
                }
                case 14: {
                    array2[n2] = intern;
                    n2 = 10;
                    s = "'W\rK";
                    n = 15;
                    array2 = array3;
                    continue;
                }
                case 15: {
                    array2[n2] = intern;
                    n2 = 11;
                    s = "<W\u001eM";
                    n = 16;
                    array2 = array3;
                    continue;
                }
                case 16: {
                    array2[n2] = intern;
                    n2 = 12;
                    s = "#T\rZ";
                    n = 17;
                    array2 = array3;
                    continue;
                }
                case 17: {
                    array2[n2] = intern;
                    n2 = 13;
                    s = "1S\u0011L";
                    n = 18;
                    array2 = array3;
                    continue;
                }
                case 18: {
                    break Label_0692;
                }
            }
        }
        array2[n2] = intern;
        b = array3;
        a = new HashSet();
        while (i < bb.b.length) {
            bb.a.add(bb.b[i]);
            ++i;
        }
    }
    
    public static int a(final RandomAccessFile randomAccessFile) {
        final byte[] array = new byte[3];
        randomAccessFile.read(array, 0, 3);
        return 0x0 | (0xFF0000 & array[0] << 16) | (0xFF00 & array[1] << 8) | (0xFF & array[2]);
    }
    
    private static an a(final bi[] array) {
        final int b = bi.b;
        int n;
        for (int i = 0; i < array.length; i = n) {
            final bi bi = array[i];
            Label_0094: {
                if (bi instanceof b1) {
                    final an a = a(((b1)bi).a());
                    if (a != null) {
                        return a;
                    }
                    if (b == 0) {
                        break Label_0094;
                    }
                }
                if (bi instanceof bf) {
                    final bk bk = (bk)a(array, bk.class);
                    if (bk != null && bb.z[2].equals(bk.h)) {
                        return ((bf)bi).f;
                    }
                }
            }
            n = i + 1;
            if (b != 0) {
                break;
            }
        }
        return null;
    }
    
    private static bi a(final bi[] array, final Class clazz) {
        final int b = bi.b;
        int n;
        for (int i = 0; i < array.length; i = n) {
            bi bi = array[i];
            Label_0064: {
                if (bi instanceof b1) {
                    final bi a = a(((b1)bi).a(), clazz);
                    if (a != null) {
                        bi = a;
                        return bi;
                    }
                    if (b == 0) {
                        break Label_0064;
                    }
                }
                if (((b1)bi).getClass() == clazz) {
                    return bi;
                }
            }
            n = i + 1;
            if (b != 0) {
                break;
            }
        }
        return null;
    }
    
    private static bx a(final long n, final String s, final RandomAccessFile randomAccessFile) {
        if (bb.z[4].equals(s)) {
            return new bk(n, s, randomAccessFile);
        }
        if (bb.z[5].equals(s)) {
            return new bu(n, s, randomAccessFile);
        }
        if (bb.z[3].equals(s)) {
            return new bf(n, s, randomAccessFile);
        }
        return new bx(n, s, randomAccessFile);
    }
    
    public static String a(final RandomAccessFile randomAccessFile, final int n) {
        final byte[] array = new byte[n];
        randomAccessFile.read(array, 0, n);
        return new String(array);
    }
    
    public static Date a(final long n) {
        return new Date(1000L * (n - 2082844800L));
    }
    
    protected static bi[] a(final RandomAccessFile randomAccessFile, final long n, final long n2) {
        final int b = bi.b;
        final ArrayList<bi> list = new ArrayList<bi>();
        long length = 0L;
        for (long n3 = n; n3 < n2; n3 = length) {
            randomAccessFile.seek(n3);
            final long e = e(randomAccessFile);
            if (randomAccessFile.getFilePointer() == n2 && b == 0) {
                break;
            }
            final byte[] array = new byte[4];
            if (randomAccessFile.read(array, 0, array.length) != array.length) {
                throw new IOException(bb.z[0]);
            }
            final String s = new String(array);
            long b2;
            if (e == 1L) {
                b2 = b(randomAccessFile);
            }
            else {
                b2 = e;
            }
            if (b2 < 0L || n3 + b2 > randomAccessFile.length()) {
                throw new IOException(bb.z[1] + b2);
            }
            bi a;
            if (bb.a.contains(s)) {
                a = new b1(b2, s, a(randomAccessFile, randomAccessFile.getFilePointer(), n3 + b2));
            }
            else {
                a = a(b2, s, randomAccessFile);
            }
            list.add(a);
            Label_0229: {
                if (b2 == 0L) {
                    length = randomAccessFile.length();
                    if (b == 0) {
                        break Label_0229;
                    }
                }
                else {
                    length = n3;
                }
                length += b2;
            }
            if (b != 0) {
                break;
            }
        }
        final bi[] array2 = new bi[list.size()];
        list.toArray(array2);
        return array2;
    }
    
    public static long b(final RandomAccessFile randomAccessFile) {
        return 0L + (e(randomAccessFile) << 32) + e(randomAccessFile);
    }
    
    public static double c(final RandomAccessFile randomAccessFile) {
        final byte[] array = new byte[4];
        randomAccessFile.read(array, 0, 4);
        return (0x0 | (0xFF000000 & array[0] << 24) | (0xFF0000 & array[1] << 16) | (0xFF00 & array[2] << 8) | (0xFF & array[3])) / 1.073741824E9;
    }
    
    public static int d(final RandomAccessFile randomAccessFile) {
        return randomAccessFile.readByte();
    }
    
    public static long e(final RandomAccessFile randomAccessFile) {
        final byte[] array = new byte[4];
        randomAccessFile.read(array, 0, 4);
        return 0x0 | (0xFF000000 & array[0] << 24) | (0xFF0000 & array[1] << 16) | (0xFF00 & array[2] << 8) | (0xFF & array[3]);
    }
    
    public static int f(final RandomAccessFile randomAccessFile) {
        return randomAccessFile.readByte() << 8 | randomAccessFile.readByte();
    }
    
    public static double g(final RandomAccessFile randomAccessFile) {
        final byte[] array = new byte[4];
        randomAccessFile.read(array, 0, 4);
        return (0x0 | (0xFF000000 & array[0] << 24) | (0xFF0000 & array[1] << 16) | (0xFF00 & array[2] << 8) | (0xFF & array[3])) / 65536.0;
    }
    
    public an a() {
        return a(this.c);
    }
    
    public void a(final File file) {
        final RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        this.c = a(randomAccessFile, 0L, randomAccessFile.length());
        randomAccessFile.close();
    }
}
