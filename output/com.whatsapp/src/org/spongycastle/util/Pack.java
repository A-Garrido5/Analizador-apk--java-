// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.util;

import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

public abstract class Pack
{
    public static boolean a;
    
    public static int bigEndianToInt(final byte[] array, final int n) {
        final boolean a = Pack.a;
        final int n2 = array[n] << 24;
        final int n3 = n + 1;
        final int n4 = n2 | (0xFF & array[n3]) << 16;
        final int n5 = n3 + 1;
        final int n6 = n4 | (0xFF & array[n5]) << 8 | (0xFF & array[n5 + 1]);
        if (BaseKeyGenerator.a) {
            Pack.a = !a;
        }
        return n6;
    }
    
    public static void bigEndianToInt(final byte[] array, int n, final int[] array2) {
        final boolean a = Pack.a;
        int i = 0;
        while (i < array2.length) {
            array2[i] = bigEndianToInt(array, n);
            n += 4;
            ++i;
            if (a) {
                break;
            }
        }
    }
    
    public static long bigEndianToLong(final byte[] array, final int n) {
        return (0xFFFFFFFFL & bigEndianToInt(array, n)) << 32 | (0xFFFFFFFFL & bigEndianToInt(array, n + 4));
    }
    
    public static void bigEndianToLong(final byte[] array, int n, final long[] array2) {
        final boolean a = Pack.a;
        int i = 0;
        while (i < array2.length) {
            array2[i] = bigEndianToLong(array, n);
            n += 8;
            ++i;
            if (a) {
                break;
            }
        }
    }
    
    public static void intToBigEndian(final int n, final byte[] array, final int n2) {
        array[n2] = (byte)(n >>> 24);
        final int n3 = n2 + 1;
        array[n3] = (byte)(n >>> 16);
        final int n4 = n3 + 1;
        array[n4] = (byte)(n >>> 8);
        array[n4 + 1] = (byte)n;
    }
    
    public static void intToBigEndian(final int[] array, final byte[] array2, int n) {
        final boolean a = Pack.a;
        int i = 0;
        while (i < array.length) {
            intToBigEndian(array[i], array2, n);
            n += 4;
            ++i;
            if (a) {
                break;
            }
        }
    }
    
    public static void intToLittleEndian(final int n, final byte[] array, final int n2) {
        array[n2] = (byte)n;
        final int n3 = n2 + 1;
        array[n3] = (byte)(n >>> 8);
        final int n4 = n3 + 1;
        array[n4] = (byte)(n >>> 16);
        array[n4 + 1] = (byte)(n >>> 24);
    }
    
    public static int littleEndianToInt(final byte[] array, final int n) {
        final boolean a = Pack.a;
        final int n2 = 0xFF & array[n];
        final int n3 = n + 1;
        final int n4 = n2 | (0xFF & array[n3]) << 8;
        final int n5 = n3 + 1;
        final int n6 = n4 | (0xFF & array[n5]) << 16 | array[n5 + 1] << 24;
        if (a) {
            BaseKeyGenerator.a = !BaseKeyGenerator.a;
        }
        return n6;
    }
    
    public static void longToBigEndian(final long n, final byte[] array, final int n2) {
        intToBigEndian((int)(n >>> 32), array, n2);
        intToBigEndian((int)(0xFFFFFFFFL & n), array, n2 + 4);
    }
    
    public static void longToBigEndian(final long[] array, final byte[] array2, int n) {
        final boolean a = Pack.a;
        int i = 0;
        while (i < array.length) {
            longToBigEndian(array[i], array2, n);
            n += 8;
            ++i;
            if (a) {
                break;
            }
        }
    }
}
