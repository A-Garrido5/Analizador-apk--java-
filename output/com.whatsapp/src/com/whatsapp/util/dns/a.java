// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util.dns;

import java.io.OutputStream;

class a
{
    private static final String[] z;
    private final f a;
    private final short b;
    private final int c;
    private final short d;
    
    static {
        final String[] z2 = new String[2];
        String s = "=m9m>\u007fy,qm1{9(/:4#}!3";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'M';
                        break;
                    }
                    case 0: {
                        c2 = '_';
                        break;
                    }
                    case 1: {
                        c2 = '\u0014';
                        break;
                    }
                    case 2: {
                        c2 = 'M';
                        break;
                    }
                    case 3: {
                        c2 = '\b';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "6z>}+9}.a(1`ml,+u";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    private a(final f a, final short d, final short b, final int c) {
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    static a a(final f f, final short n, final short n2) {
        return new a(f, n, n2, 4 + f.a());
    }
    
    static a a(final byte[] array, final int n) {
        if (array == null) {
            try {
                throw new NullPointerException(a.z[0]);
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        final f a = f.a(array, n);
        final int n2 = n + a.a();
        try {
            if (array.length < n2 + 4) {
                throw new IllegalArgumentException(com.whatsapp.util.dns.a.z[1]);
            }
        }
        catch (NullPointerException ex2) {
            throw ex2;
        }
        return new a(a, i.b(array, n2), i.b(array, n2 + 2), 4 + a.a());
    }
    
    int a() {
        return this.c;
    }
    
    void a(final OutputStream outputStream) {
        this.a.a(outputStream);
        i.a(outputStream, this.d);
        i.a(outputStream, this.b);
    }
}
