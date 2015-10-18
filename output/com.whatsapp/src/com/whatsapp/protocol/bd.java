// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

import java.io.InputStream;

public class bd
{
    public static int a(final InputStream inputStream) {
        return inputStream.read() + ((inputStream.read() << 16) + (inputStream.read() << 8));
    }
    
    public static void a(final byte[] array, final int n, final int n2, final int n3) {
        final int n4 = (0xFFFFF & n3) | n2 << 20;
        array[n] = (byte)((0xFF0000 & n4) >> 16);
        array[n + 1] = (byte)((0xFF00 & n4) >> 8);
        array[n + 2] = (byte)((n4 & 0xFF) >> 0);
    }
    
    public static boolean a(final int n) {
        return (0x100000 & n) > 0;
    }
    
    public static boolean b(final int n) {
        return (0x400000 & n) > 0;
    }
    
    public static int c(final int n) {
        return 0xFFFFF & n;
    }
    
    public static boolean d(final int n) {
        return (0x800000 & n) > 0;
    }
}
