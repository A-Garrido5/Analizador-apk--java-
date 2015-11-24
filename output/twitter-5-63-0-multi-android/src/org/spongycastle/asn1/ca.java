// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

class ca
{
    private static final long a;
    
    static {
        a = Runtime.getRuntime().maxMemory();
    }
    
    static int a(int n) {
        int n2 = 1;
        if (n > 127) {
            int n3 = n2;
            while (true) {
                n >>>= 8;
                if (n == 0) {
                    break;
                }
                ++n3;
            }
            int n4;
            for (int i = 8 * (n3 - 1); i >= 0; i -= 8, n2 = n4) {
                n4 = n2 + 1;
            }
        }
        return n2;
    }
    
    static int a(final InputStream inputStream) {
        if (inputStream instanceof by) {
            return ((by)inputStream).a();
        }
        if (inputStream instanceof h) {
            return ((h)inputStream).a();
        }
        if (inputStream instanceof ByteArrayInputStream) {
            return ((ByteArrayInputStream)inputStream).available();
        }
        if (inputStream instanceof FileInputStream) {
            try {
                final long size = ((FileInputStream)inputStream).getChannel().size();
                if (size < 2147483647L) {
                    return (int)size;
                }
            }
            catch (IOException ex) {}
        }
        if (ca.a > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int)ca.a;
    }
    
    static int b(int i) {
        if (i < 31) {
            return 1;
        }
        if (i < 128) {
            return 2;
        }
        final byte[] array = new byte[5];
        int n = -1 + array.length;
        array[n] = (byte)(i & 0x7F);
        do {
            i >>= 7;
            --n;
            array[n] = (byte)(0x80 | (i & 0x7F));
        } while (i > 127);
        return 1 + (array.length - n);
    }
}
