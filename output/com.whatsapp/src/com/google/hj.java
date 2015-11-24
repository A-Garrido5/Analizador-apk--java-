// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Iterator;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

class hj extends hv
{
    private static final String[] z;
    protected final byte[] c;
    private int d;
    
    static {
        final String[] z2 = new String[5];
        final char[] charArray = "\u001d?".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '0';
                    break;
                }
                case 0: {
                    c2 = '1';
                    break;
                }
                case 1: {
                    c2 = '\u001f';
                    break;
                }
                case 2: {
                    c2 = 'b';
                    break;
                }
                case 3: {
                    c2 = '\r';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "\u001d?".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '0';
                    break;
                }
                case 0: {
                    c4 = '1';
                    break;
                }
                case 1: {
                    c4 = '\u001f';
                    break;
                }
                case 2: {
                    c4 = 'b';
                    break;
                }
                case 3: {
                    c4 = '\r';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "}z\fjDY?\u0016b_\u0011s\u0003\u007fWT%B".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '0';
                    break;
                }
                case 0: {
                    c6 = '1';
                    break;
                }
                case 1: {
                    c6 = '\u001f';
                    break;
                }
                case 2: {
                    c6 = 'b';
                    break;
                }
                case 3: {
                    c6 = '\r';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "c~\f-_WyBh^U?\rk\u0010^k\nhB\u000b?".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '0';
                    break;
                }
                case 0: {
                    c8 = '1';
                    break;
                }
                case 1: {
                    c8 = '\u001f';
                    break;
                }
                case 2: {
                    c8 = 'b';
                    break;
                }
                case 3: {
                    c8 = '\r';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "y~\u0011-Q\u0011q\u0007z\u0010Ef\u0012h\u0010^yBOIEz1yBXq\u0005-RTz\f-SCz\u0003yUU BK_Dq\u0006-".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '0';
                    break;
                }
                case 0: {
                    c10 = '1';
                    break;
                }
                case 1: {
                    c10 = '\u001f';
                    break;
                }
                case 2: {
                    c10 = 'b';
                    break;
                }
                case 3: {
                    c10 = '\r';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        z = z2;
    }
    
    hj(final byte[] c) {
        this.d = 0;
        this.c = c;
    }
    
    protected int a() {
        return 0;
    }
    
    @Override
    protected int a(final int n, final int n2, final int n3) {
        final int n4 = n2 + this.a();
        return hx.a(n, this.c, n4, n4 + n3);
    }
    
    @Override
    public String a(final String s) {
        return new String(this.c, this.a(), this.c(), s);
    }
    
    @Override
    protected void a(final byte[] array, final int n, final int n2, final int n3) {
        System.arraycopy(this.c, n, array, n2, n3);
    }
    
    boolean a(final hj hj, final int n, final int n2) {
        final boolean b = dt.b;
        try {
            if (n2 > hj.c()) {
                throw new IllegalArgumentException(hj.z[2] + n2 + this.c());
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        final int n3 = n + n2;
        try {
            if (n3 > hj.c()) {
                throw new IllegalArgumentException(hj.z[3] + n + hj.z[1] + n2 + hj.z[0] + hj.c());
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        final byte[] c = this.c;
        final byte[] c2 = hj.c;
        final int n4 = n2 + this.a();
        int i = this.a();
        int n5 = n + hj.a();
        while (i < n4) {
            try {
                if (c[i] != c2[n5]) {
                    return false;
                }
            }
            catch (IllegalArgumentException ex3) {
                throw ex3;
            }
            ++i;
            ++n5;
            if (b) {
                break;
            }
        }
        return true;
    }
    
    @Override
    public byte b(final int n) {
        return this.c[n];
    }
    
    @Override
    protected int b(final int n, final int n2, final int n3) {
        final boolean b = dt.b;
        final byte[] c = this.c;
        final int n4 = n2 + this.a();
        final int n5 = n4 + n3;
        int i = n4;
        int n6 = n;
        while (i < n5) {
            n6 = n6 * 31 + c[i];
            ++i;
            if (b) {
                break;
            }
        }
        return n6;
    }
    
    @Override
    public boolean b() {
        final int a = this.a();
        return hx.b(this.c, a, a + this.c());
    }
    
    @Override
    public int c() {
        return this.c.length;
    }
    
    @Override
    protected int e() {
        return this.d;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        try {
            if (!(o instanceof hv)) {
                return false;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            if (this.c() != ((hv)o).c()) {
                return false;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        try {
            if (this.c() == 0) {
                return true;
            }
        }
        catch (IllegalArgumentException ex3) {
            throw ex3;
        }
        try {
            if (o instanceof hj) {
                return this.a((hj)o, 0, this.c());
            }
        }
        catch (IllegalArgumentException ex4) {
            throw ex4;
        }
        try {
            if (o instanceof hu) {
                return o.equals(this);
            }
        }
        catch (IllegalArgumentException ex5) {
            throw ex5;
        }
        throw new IllegalArgumentException(hj.z[4] + o.getClass());
    }
    
    @Override
    public hb f() {
        return new dj(this, null);
    }
    
    @Override
    public cL g() {
        return cL.a(this.c, this.a(), this.c());
    }
    
    @Override
    public InputStream h() {
        return new ByteArrayInputStream(this.c, this.a(), this.c());
    }
    
    @Override
    public int hashCode() {
        int d = this.d;
        if (d == 0) {
            final int c = this.c();
            d = this.b(c, 0, c);
            if (d == 0) {
                d = 1;
            }
            this.d = d;
        }
        return d;
    }
    
    @Override
    public Iterator iterator() {
        return this.f();
    }
}
