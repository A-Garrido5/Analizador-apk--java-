// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util.dns;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicInteger;

class d
{
    private static final AtomicInteger d;
    private static final String z;
    private final c a;
    private final a[] b;
    private byte[] c;
    private final e[] e;
    private int f;
    private final int g;
    
    static {
        final char[] charArray = "4R".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '&';
                    break;
                }
                case 0: {
                    c2 = 'h';
                    break;
                }
                case 1: {
                    c2 = '|';
                    break;
                }
                case 2: {
                    c2 = 'G';
                    break;
                }
                case 3: {
                    c2 = 'Z';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
        d = new AtomicInteger();
    }
    
    private d(final c a, final a[] b, final e[] e, final int g) {
        this.a = a;
        this.b = b;
        this.e = e;
        this.g = g;
    }
    
    static d a(final String s) {
        final String[] split = s.split(com.whatsapp.util.dns.d.z);
        final c c = new c((short)com.whatsapp.util.dns.d.d.getAndIncrement(), false, (byte)0, false, false, true, false, (short)0, (short)1, (short)0, (short)0, (short)0);
        final a[] array = { a.a(f.a(split, (short)0), (short)1, (short)1) };
        return new d(c, array, new e[0], c.b() + array[0].a());
    }
    
    static d a(final byte[] array) {
        return a(array, 0);
    }
    
    static d a(final byte[] c, final int f) {
        int i = 0;
        final boolean a = b.a;
        final c a2 = c.a(c, f);
        final int n = f + a2.b();
        final a[] array = new a[a2.f()];
        int n2 = n;
        int j = 0;
        while (j < array.length) {
            array[j] = com.whatsapp.util.dns.a.a(c, n2);
            n2 += array[j].a();
            ++j;
            if (a) {
                break;
            }
        }
        final e[] array2 = new e[a2.c()];
        while (i < array2.length) {
            array2[i] = e.a(c, n2);
            n2 += array2[i].c();
            ++i;
            if (a) {
                break;
            }
        }
        final d d = new d(a2, array, array2, -1);
        d.c = c;
        d.f = f;
        return d;
    }
    
    String a(final f f) {
        int i = 0;
        final boolean a = com.whatsapp.util.dns.b.a;
        final StringBuilder sb = new StringBuilder();
        final String[] c = f.c();
        final int length = c.length;
        int j = 0;
        while (j < length) {
            sb.append(c[j]).append('.');
            ++j;
            if (a) {
                break;
            }
        }
        if (f.b() != 0) {
            final String[] c2 = f.a(this.c, this.f + f.b()).c();
            while (i < c2.length) {
                sb.append(c2[i]).append('.');
                ++i;
                if (a) {
                    break;
                }
            }
        }
        if (sb.length() > 0) {
            sb.setLength(-1 + sb.length());
        }
        return sb.toString();
    }
    
    void a(final OutputStream outputStream) {
        int i = 0;
        final boolean a = com.whatsapp.util.dns.b.a;
        this.a.a(outputStream);
        final a[] b = this.b;
        final int length = b.length;
        int j = 0;
        while (j < length) {
            b[j].a(outputStream);
            ++j;
            if (a) {
                break;
            }
        }
        final e[] e = this.e;
        while (i < e.length) {
            e[i].a(outputStream);
            ++i;
            if (a) {
                break;
            }
        }
    }
    
    e[] a() {
        return this.e;
    }
    
    byte[] b() {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            this.a(byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException ex) {
            return null;
        }
    }
    
    c c() {
        return this.a;
    }
}
