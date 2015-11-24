// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class v extends a
{
    private static final String[] z;
    final String a;
    final bf b;
    final String c;
    final String d;
    
    static {
        final String[] z2 = new String[2];
        String s = "H3Z3gJ?";
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
                        c2 = '\u0012';
                        break;
                    }
                    case 0: {
                        c2 = '8';
                        break;
                    }
                    case 1: {
                        c2 = 'Z';
                        break;
                    }
                    case 2: {
                        c2 = '9';
                        break;
                    }
                    case 3: {
                        c2 = 'G';
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
                    s = "Q>";
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
    
    v(final bf b, final String a, final String c, final String d) {
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public void a(final int n) {
        if (n == 404) {
            bf.d(this.b).a(this.d, null, null, this.c);
            if (bi.O == 0) {
                return;
            }
        }
        bf.d(this.b).b(this.d, n);
    }
    
    @Override
    public void a(final c0 c0, final String s) {
        final c0 b = c0.b(v.z[0]);
        String s2 = this.a;
        byte[] a = null;
        if (b != null) {
            a = b.a;
            s2 = b.c(v.z[1]);
        }
        if (s != null) {
            bf.d(this.b).a(s, s2, a, this.c);
        }
    }
}
