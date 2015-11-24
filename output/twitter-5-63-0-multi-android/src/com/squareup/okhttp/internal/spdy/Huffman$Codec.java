// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.spdy;

import java.io.ByteArrayOutputStream;

enum Huffman$Codec
{
    a("REQUEST", 0, Huffman.a, Huffman.b), 
    b("RESPONSE", 1, Huffman.c, Huffman.d);
    
    private final int[] codes;
    private final byte[] lengths;
    private final l root;
    
    private Huffman$Codec(final String s, final int n, final int[] codes, final byte[] lengths) {
        this.root = new l();
        this.a(codes, lengths);
        this.codes = codes;
        this.lengths = lengths;
    }
    
    private void a(final int n, final int n2, byte b) {
        final l l = new l(n, b);
        l root = this.root;
        while (b > 8) {
            b -= 8;
            final int n3 = 0xFF & n2 >>> b;
            if (root.a == null) {
                throw new IllegalStateException("invalid dictionary: prefix not unique");
            }
            if (root.a[n3] == null) {
                root.a[n3] = new l();
            }
            root = root.a[n3];
        }
        final byte b2 = (byte)(8 - b);
        for (int n4 = 0xFF & n2 << b2, n5 = 1 << b2, i = n4; i < n4 + n5; ++i) {
            root.a[i] = l;
        }
    }
    
    private void a(final int[] array, final byte[] array2) {
        for (int i = 0; i < array2.length; ++i) {
            this.a(i, array[i], array2[i]);
        }
    }
    
    bk a(final bk bk) {
        return bk.a(this.a(bk.f()));
    }
    
    byte[] a(final byte[] array) {
        int i = 0;
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final l root = this.root;
        int n = 0;
        l l = root;
        int j = 0;
        while (i < array.length) {
            n = ((0xFF & array[i]) | n << 8);
            j += 8;
            while (j >= 8) {
                l = l.a[0xFF & n >>> j - 8];
                if (l.a == null) {
                    byteArrayOutputStream.write(l.b);
                    j -= l.c;
                    l = this.root;
                }
                else {
                    j -= 8;
                }
            }
            ++i;
        }
        while (j > 0) {
            final l k = l.a[0xFF & n << 8 - j];
            if (k.a != null || k.c > j) {
                break;
            }
            byteArrayOutputStream.write(k.b);
            j -= k.c;
            l = this.root;
        }
        return byteArrayOutputStream.toByteArray();
    }
}
