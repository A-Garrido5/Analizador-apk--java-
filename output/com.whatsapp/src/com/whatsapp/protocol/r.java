// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class r extends a
{
    private static final String[] z;
    final bf a;
    
    static {
        final String[] z2 = new String[6];
        String s = "\fSy";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'x';
                        break;
                    }
                    case 0: {
                        c2 = 'f';
                        break;
                    }
                    case 1: {
                        c2 = ':';
                        break;
                    }
                    case 2: {
                        c2 = '\u001d';
                        break;
                    }
                    case 3: {
                        c2 = '\\';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u000fNx1";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0012Cm9";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0010[q)\u001d";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\nSn(";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u0017Ox.\u0001";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    r(final bf a) {
        this.a = a;
    }
    
    @Override
    public void a(final int n) {
        if (n == 404) {
            bf.d(this.a).d();
        }
    }
    
    @Override
    public void a(final c0 c0, final String s) {
        final int o = bi.O;
        final c0 a = c0.a(0);
        c0.b(a, r.z[5]);
        final c0 a2 = a.a(0);
        c0.b(a2, r.z[4]);
        bf.d(this.a).d();
        if (a2.d != null) {
            int i = 0;
            while (i < a2.d.length) {
                final c0 c2 = a2.d[i];
                c0.b(c2, r.z[1]);
                if (r.z[0].equals(c2.c(r.z[2]))) {
                    final String c3 = c2.c(r.z[3]);
                    if (c3 != null) {
                        bf.d(this.a).b(c3);
                    }
                }
                ++i;
                if (o != 0) {
                    break;
                }
            }
        }
        bf.d(this.a).g();
    }
}
