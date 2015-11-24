// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso;

import java.io.ByteArrayOutputStream;

public class Hex
{
    private static final char[] DIGITS;
    
    static {
        DIGITS = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
    }
    
    public static byte[] decodeHex(final String s) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i < s.length(); i += 2) {
            byteArrayOutputStream.write(Integer.parseInt(s.substring(i, i + 2), 16));
        }
        return byteArrayOutputStream.toByteArray();
    }
    
    public static String encodeHex(final byte[] array) {
        return encodeHex(array, 0);
    }
    
    public static String encodeHex(final byte[] array, final int n) {
        final int length = array.length;
        final int n2 = length << 1;
        int n3;
        if (n > 0) {
            n3 = length / n;
        }
        else {
            n3 = 0;
        }
        final char[] array2 = new char[n3 + n2];
        int i = 0;
        int n4 = 0;
        while (i < length) {
            int n5;
            if (n > 0 && i % n == 0 && n4 > 0) {
                n5 = n4 + 1;
                array2[n4] = '-';
            }
            else {
                n5 = n4;
            }
            final int n6 = n5 + 1;
            array2[n5] = Hex.DIGITS[(0xF0 & array[i]) >>> 4];
            final int n7 = n6 + 1;
            array2[n6] = Hex.DIGITS[0xF & array[i]];
            ++i;
            n4 = n7;
        }
        return new String(array2);
    }
}
