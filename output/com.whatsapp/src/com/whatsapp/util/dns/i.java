// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util.dns;

import java.io.OutputStream;

class i
{
    static byte a(final short n) {
        return (byte)(n & 0xFF);
    }
    
    static int a(final byte b, final byte b2, final byte b3, final byte b4) {
        return (0xFF000000 & b << 24) | (0xFF0000 & b2 << 16) | (0xFF00 & b3 << 8) | (b4 & 0xFF);
    }
    
    static int a(final byte[] array, final int n) {
        return a(array[n], array[n + 1], array[n + 2], array[n + 3]);
    }
    
    static short a(final byte b, final byte b2) {
        return (short)((0xFF00 & b << 8) | (b2 & 0xFF));
    }
    
    static void a(final OutputStream outputStream, final int n) {
        outputStream.write(0xFF & n >>> 24);
        outputStream.write(0xFF & n >>> 16);
        outputStream.write(0xFF & n >>> 8);
        outputStream.write(n & 0xFF);
    }
    
    static void a(final OutputStream outputStream, final short n) {
        outputStream.write(b(n));
        outputStream.write(a(n));
    }
    
    static void a(final short n, final byte[] array, final int n2) {
        array[n2] = b(n);
        array[n2 + 1] = a(n);
    }
    
    static byte b(final short n) {
        return (byte)((0xFF00 & n) >>> 8);
    }
    
    static short b(final byte[] array, final int n) {
        return a(array[n], array[n + 1]);
    }
}
