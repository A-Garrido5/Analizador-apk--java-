// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class k extends a
{
    private static final String[] z;
    final bf a;
    
    static {
        final String[] z2 = new String[5];
        String s = "\u0018GV\b[\u001fGZ";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '2';
                        break;
                    }
                    case 0: {
                        c2 = '}';
                        break;
                    }
                    case 1: {
                        c2 = '+';
                        break;
                    }
                    case 2: {
                        c2 = '?';
                        break;
                    }
                    case 3: {
                        c2 = 'o';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\bXZ\u001d";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0017B[";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\tYJ\n";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "\u0018GV\b[\u001fGZ";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    k(final bf a) {
        this.a = a;
    }
    
    @Override
    public void a(final int n) {
        bf.d(this.a).b(new Integer(n));
    }
    
    @Override
    public void a(final c0 c0, final String s) {
        final int o = bi.O;
        final c0 b = c0.b(k.z[0]);
        String[] array2 = null;
        Label_0147: {
            if (b != null && b.d != null) {
                final String[] array = new String[b.d.length];
                int i = 0;
                int n = 0;
                while (i < b.d.length) {
                    final c0 c2 = b.d[i];
                    c0.b(c2, k.z[1]);
                    final String c3 = c2.c(k.z[2]);
                    if (k.z[3].equals(c2.c(k.z[4]))) {
                        final int n2 = n + 1;
                        array[n] = c3;
                        n = n2;
                    }
                    ++i;
                    if (o != 0) {
                        break;
                    }
                }
                if (o == 0) {
                    array2 = array;
                    break Label_0147;
                }
            }
            array2 = new String[0];
        }
        bf.d(this.a).a(array2);
    }
}
