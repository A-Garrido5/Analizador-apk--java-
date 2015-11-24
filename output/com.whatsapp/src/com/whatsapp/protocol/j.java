// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class j extends a
{
    private static final String[] z;
    final bf a;
    
    static {
        final String[] z2 = new String[2];
        String s = "D=8A\u0010E";
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
                        c2 = '~';
                        break;
                    }
                    case 0: {
                        c2 = '!';
                        break;
                    }
                    case 1: {
                        c2 = 'E';
                        break;
                    }
                    case 2: {
                        c2 = 'L';
                        break;
                    }
                    case 3: {
                        c2 = '$';
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
                    s = "@&/K\u000bO1";
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
    
    j(final bf a) {
        this.a = a;
    }
    
    @Override
    public void a(final c0 c0, final String s) {
        final c0 a = c0.a(0);
        c0.b(a, j.z[0]);
        final c0 b = a.b(j.z[1]);
        if (b != null) {
            bf.d(this.a).a(true, bf.b(this.a, b));
            if (bi.O == 0) {
                return;
            }
        }
        bf.d(this.a).a(false, null);
    }
}
