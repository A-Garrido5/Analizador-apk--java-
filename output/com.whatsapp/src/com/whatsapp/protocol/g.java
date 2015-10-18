// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class g extends a
{
    private static final String[] z;
    final byte[] a;
    final bf b;
    
    static {
        final String[] z2 = new String[2];
        String s = "\u0007Uk\u0007\u0002\u0018";
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
                        c2 = 'g';
                        break;
                    }
                    case 0: {
                        c2 = 'u';
                        break;
                    }
                    case 1: {
                        c2 = '0';
                        break;
                    }
                    case 2: {
                        c2 = '\u000f';
                        break;
                    }
                    case 3: {
                        c2 = 'b';
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
                    s = "\u0014Sl\r\u0012\u001bD";
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
    
    g(final bf b, final byte[] a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a(final c0 c0, final String s) {
        final c0 a = c0.a(0);
        c0.b(a, g.z[0]);
        final c0 b = a.b(g.z[1]);
        if (b != null) {
            bf.d(this.b).a(this.a, bf.b(this.b, b));
            if (bi.O == 0) {
                return;
            }
        }
        bf.d(this.b).a(this.a, null);
    }
}
