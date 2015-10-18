// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import java.text.ParseException;
import java.io.IOException;
import java.io.ByteArrayOutputStream;

public class m
{
    public static int a;
    private static final String z;
    
    static {
        final char[] charArray = "|\u0017]%g\u0015\rB?3F\u0014L<\u007f\u000fY".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0013';
                    break;
                }
                case 0: {
                    c2 = '5';
                    break;
                }
                case 1: {
                    c2 = 'y';
                    break;
                }
                case 2: {
                    c2 = '-';
                    break;
                }
                case 3: {
                    c2 = 'P';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public static byte a(final int n, final int n2) {
        return (byte)(0xFF & (n2 | n << 4));
    }
    
    public static int a(final byte b) {
        return (b & 0xFF) >> 4;
    }
    
    public static int a(final byte[] array) {
        return b(array, 0);
    }
    
    public static int a(final byte[] array, final int n) {
        return (0xFF & array[n]) << 16 | (0xFF & array[n + 1]) << 8 | (0xFF & array[n + 2]);
    }
    
    public static int a(final byte[] array, final int n, final int n2) {
        final int a = m.a;
        array[n + 3] = (byte)n2;
        array[n + 2] = (byte)(n2 >> 8);
        array[n + 1] = (byte)(n2 >> 16);
        array[n] = (byte)(n2 >> 24);
        if (bO.s != 0) {
            m.a = a + 1;
        }
        return 4;
    }
    
    public static byte[] a(final int n) {
        final byte[] array = new byte[4];
        a(array, 0, n);
        return array;
    }
    
    public static byte[] a(final byte[][] array) {
        final int a = m.a;
        try {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            final int length = array.length;
            int i = 0;
            while (i < length) {
                byteArrayOutputStream.write(array[i]);
                ++i;
                if (a != 0) {
                    break;
                }
            }
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public static byte[][] a(final byte[] array, final int n, final int n2, final int n3) {
        final int a = m.a;
        if (array == null || n < 0 || n2 < 0 || n3 < 0 || array.length < n3 + (n + n2)) {
            final StringBuilder append = new StringBuilder().append(m.z);
            String a2;
            if (array == null) {
                a2 = null;
            }
            else {
                a2 = K.a(array);
            }
            throw new ParseException(append.append(a2).toString(), 0);
        }
        final byte[][] array2 = { new byte[n], null, null };
        System.arraycopy(array, 0, array2[0], 0, n);
        System.arraycopy(array, n, array2[1] = new byte[n2], 0, n2);
        System.arraycopy(array, n + n2, array2[2] = new byte[n3], 0, n3);
        if (a != 0) {
            ++bO.s;
        }
        return array2;
    }
    
    public static int b(final byte[] array, final int n) {
        return (0xFF & array[n]) << 24 | (0xFF & array[n + 1]) << 16 | (0xFF & array[n + 2]) << 8 | (0xFF & array[n + 3]);
    }
    
    public static byte[] b(final int n) {
        final byte[] array = new byte[3];
        c(array, 0, n);
        return array;
    }
    
    public static byte[][] b(final byte[] array, final int n, final int n2) {
        final byte[][] array2 = { new byte[n], null };
        System.arraycopy(array, 0, array2[0], 0, n);
        System.arraycopy(array, n, array2[1] = new byte[n2], 0, n2);
        return array2;
    }
    
    public static int c(final byte[] array, final int n, final int n2) {
        array[n + 2] = (byte)n2;
        array[n + 1] = (byte)(n2 >> 8);
        array[n] = (byte)(n2 >> 16);
        return 3;
    }
    
    public static byte[] c(final byte[] array, final int n) {
        final byte[] array2 = new byte[n];
        System.arraycopy(array, 0, array2, 0, array2.length);
        return array2;
    }
}
