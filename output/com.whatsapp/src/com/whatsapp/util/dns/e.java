// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util.dns;

import java.io.OutputStream;

class e
{
    private static final String[] z;
    private final int a;
    private final short b;
    private final byte[] c;
    private final short d;
    private final f e;
    private final int f;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u0011\u0000e\u0016\b\u001e\u0007u\n\u000b\u0016\u001a6\u0007\u000f\f\u000f";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'n';
                        break;
                    }
                    case 0: {
                        c2 = 'x';
                        break;
                    }
                    case 1: {
                        c2 = 'n';
                        break;
                    }
                    case 2: {
                        c2 = '\u0016';
                        break;
                    }
                    case 3: {
                        c2 = 'c';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u001a\u0017b\u0006\u001dX\u0003w\u001aN\u0016\u0001bC\f\u001dNx\u0016\u0002\u0014";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\u0011\u0000e\u0016\b\u001e\u0007u\n\u000b\u0016\u001a6\u0007\u000f\f\u000f";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    private e(final f e, final short b, final short d, final int a, final byte[] c, final int f) {
        this.e = e;
        this.b = b;
        this.d = d;
        this.a = a;
        this.c = c;
        this.f = f;
    }
    
    static e a(final byte[] array, final int n) {
        if (array == null) {
            try {
                throw new NullPointerException(e.z[1]);
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        final f a = f.a(array, n);
        final int n2 = n + a.a();
        try {
            if (array.length < n2 + 10) {
                throw new IllegalArgumentException(e.z[0]);
            }
        }
        catch (NullPointerException ex2) {
            throw ex2;
        }
        final short b = i.b(array, n2);
        final short b2 = i.b(array, n2 + 2);
        final int a2 = i.a(array, n2 + 4);
        final short b3 = i.b(array, n2 + 8);
        final int n3 = n2 + 10;
        try {
            if (array.length < n3 + b3) {
                throw new IllegalArgumentException(e.z[2]);
            }
        }
        catch (NullPointerException ex3) {
            throw ex3;
        }
        final byte[] array2 = new byte[b3];
        System.arraycopy(array, n3, array2, 0, b3);
        return new e(a, b, b2, a2, array2, b3 + (10 + a.a()));
    }
    
    short a() {
        return this.d;
    }
    
    void a(final OutputStream outputStream) {
        this.e.a(outputStream);
        i.a(outputStream, this.b);
        i.a(outputStream, this.d);
        i.a(outputStream, this.a);
        i.a(outputStream, (short)this.c.length);
        outputStream.write(this.c);
    }
    
    byte[] b() {
        return this.c;
    }
    
    int c() {
        return this.f;
    }
    
    short d() {
        return this.b;
    }
    
    f e() {
        return this.e;
    }
    
    int f() {
        return this.a;
    }
    
    short g() {
        return (short)this.c.length;
    }
}
