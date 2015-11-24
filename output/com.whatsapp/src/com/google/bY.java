// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class bY extends b5
{
    private static final String[] z;
    private final int c;
    private final int d;
    private final byte[] e;
    private final int f;
    private final int g;
    
    static {
        final String[] z2 = new String[2];
        String s = ")!\u0003\\u\b0\u0017M0\t+\u0005\ty\bd\u001d\\d\b-\u0016L0\u000f,\u0017\ty\u0016%\u0015L*[";
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
                        c2 = '\u0010';
                        break;
                    }
                    case 0: {
                        c2 = '{';
                        break;
                    }
                    case 1: {
                        c2 = 'D';
                        break;
                    }
                    case 2: {
                        c2 = 'r';
                        break;
                    }
                    case 3: {
                        c2 = ')';
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
                    s = "86\u001dY0\t!\u0011]q\u0015#\u001eL0\u001f+\u0017Z0\u0015+\u0006\tv\u00120R^y\u000f,\u001bG0\u0012)\u0013Nu[ \u0013]qU";
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
    
    public bY(final byte[] e, final int c, final int d, final int g, final int f, final int n, final int n2, final boolean b) {
        super(n, n2);
        Label_0044: {
            if (g + n <= c) {
                if (f + n2 <= d) {
                    break Label_0044;
                }
            }
            try {
                throw new IllegalArgumentException(bY.z[1]);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            try {
                this.e = e;
                this.c = c;
                this.d = d;
                this.g = g;
                this.f = f;
                if (b) {
                    this.a(n, n2);
                }
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
    }
    
    private void a(final int n, final int n2) {
        final int c = cs.c;
        final byte[] e = this.e;
        int n3 = this.f * this.c + this.g;
        int n6;
        for (int i = 0; i < n2; i = n6) {
            final int n4 = n3 + n / 2;
            int n5 = -1 + (n3 + n);
            int j = n3;
            while (j < n4) {
                final byte b = e[j];
                e[j] = e[n5];
                e[n5] = b;
                ++j;
                --n5;
                if (c != 0) {
                    break;
                }
            }
            n6 = i + 1;
            n3 += this.c;
            if (c != 0) {
                break;
            }
        }
    }
    
    @Override
    public byte[] a(final int n, byte[] array) {
        Label_0012: {
            if (n < 0) {
                break Label_0012;
            }
            try {
                if (n >= this.e()) {
                    throw new IllegalArgumentException(bY.z[0] + n);
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        final int c = this.c();
        Label_0066: {
            if (array == null) {
                break Label_0066;
            }
            try {
                if (array.length < c) {
                    array = new byte[c];
                }
                System.arraycopy(this.e, (n + this.f) * this.c + this.g, array, 0, c);
                return array;
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
    }
    
    @Override
    public byte[] b() {
        int i = 0;
        final int c = cs.c;
        final int c2 = this.c();
        final int e = this.e();
        Label_0053: {
            try {
                if (c2 != this.c) {
                    break Label_0053;
                }
                final int n = e;
                final bY by = this;
                final int n2 = by.d;
                if (n == n2) {
                    final bY by2 = this;
                    return by2.e;
                }
                break Label_0053;
            }
            catch (IllegalArgumentException ex) {
                try {
                    throw ex;
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
            }
            try {
                final int n = e;
                final bY by = this;
                final int n2 = by.d;
                if (n == n2) {
                    final bY by2 = this;
                    return by2.e;
                }
            }
            catch (IllegalArgumentException ex4) {}
        }
        final int n3 = c2 * e;
        final byte[] array2 = new byte[n3];
        int n4 = this.f * this.c + this.g;
        try {
            if (c2 == this.c) {
                System.arraycopy(this.e, n4, array2, 0, n3);
                return array2;
            }
        }
        catch (IllegalArgumentException ex3) {
            throw ex3;
        }
        final byte[] e2 = this.e;
        while (i < e) {
            System.arraycopy(e2, n4, array2, i * c2, c2);
            n4 += this.c;
            ++i;
            if (c != 0) {
                break;
            }
        }
        return array2;
    }
}
