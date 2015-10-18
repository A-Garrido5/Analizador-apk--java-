// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class d extends a
{
    private static final String[] z;
    final c2 a;
    final bl b;
    final bf c;
    
    static {
        final String[] z2 = new String[2];
        String s = "\u001a\u0001\u000fe\u0001\u0018\u0007\u0007m";
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
                        c2 = '`';
                        break;
                    }
                    case 0: {
                        c2 = 't';
                        break;
                    }
                    case 1: {
                        c2 = 'n';
                        break;
                    }
                    case 2: {
                        c2 = '}';
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
                    s = "\u0006\u000b\u000e}\f\u0000";
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
    
    d(final bf c, final bl b, final c2 a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a(final int n) {
        if (this.a != null) {
            this.a.a(n);
        }
    }
    
    @Override
    public void a(final c0 c0, final String s) {
        final c0 a = c0.a(0);
        c0.b(a, d.z[0]);
        final String c2 = a.c(d.z[1]);
        if (this.b != null) {
            this.b.a(c2);
        }
    }
}
