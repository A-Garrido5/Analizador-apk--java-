// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class w extends a
{
    private static final String[] z;
    final c2 a;
    final boolean b;
    final bl c;
    final bf d;
    
    static {
        final String[] z2 = new String[2];
        String s = "kv`0viz";
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
                        c2 = '\u0003';
                        break;
                    }
                    case 0: {
                        c2 = '\u001b';
                        break;
                    }
                    case 1: {
                        c2 = '\u001f';
                        break;
                    }
                    case 2: {
                        c2 = '\u0003';
                        break;
                    }
                    case 3: {
                        c2 = 'D';
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
                    s = "r{";
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
    
    w(final bf d, final bl c, final boolean b, final c2 a) {
        this.d = d;
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
        if (this.c != null) {
            final boolean b = this.b;
            String c2 = null;
            if (!b) {
                final c0 a = c0.a(0);
                c0.b(a, w.z[0]);
                c2 = a.c(w.z[1]);
            }
            this.c.a(c2);
        }
    }
}
