// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class au extends a
{
    private static final String[] z;
    final bf a;
    
    static {
        final String[] z2 = new String[3];
        String s = "?K";
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
                        c2 = '\u0001';
                        break;
                    }
                    case 0: {
                        c2 = 'V';
                        break;
                    }
                    case 1: {
                        c2 = '/';
                        break;
                    }
                    case 2: {
                        c2 = 'Y';
                        break;
                    }
                    case 3: {
                        c2 = 'M';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "&C89g9]4";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "5@7+h1";
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
    
    au(final bf a) {
        this.a = a;
    }
    
    @Override
    public void a(final int n) {
        if (n == 404) {
            bf.d(this.a).j(null, null);
            if (bi.O == 0) {
                return;
            }
        }
        bf.d(this.a).c(n);
    }
    
    @Override
    public void a(final c0 c0, final String s) {
        final c0 a = c0.a(0);
        c0.b(a, au.z[2]);
        bf.d(this.a).j(a.c(au.z[1]), a.c(au.z[0]));
    }
}
