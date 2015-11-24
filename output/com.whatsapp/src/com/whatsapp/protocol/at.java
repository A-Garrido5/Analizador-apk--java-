// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

import java.util.Vector;

class at extends a
{
    private static final String[] z;
    final Runnable a;
    final c2 b;
    final bf c;
    
    static {
        final String[] z2 = new String[3];
        String s = "[6kzO";
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
                        c2 = '?';
                        break;
                    }
                    case 0: {
                        c2 = '<';
                        break;
                    }
                    case 1: {
                        c2 = 'D';
                        break;
                    }
                    case 2: {
                        c2 = '\u0004';
                        break;
                    }
                    case 3: {
                        c2 = '\u000f';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "P!eyZ";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "U ";
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
    
    at(final bf c, final Runnable a, final c2 b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a(final int n) {
        if (this.b != null) {
            this.b.a(n);
        }
    }
    
    @Override
    public void a(final c0 c0, final String s) {
        final c0 b = c0.b(at.z[1]);
        if (b != null) {
            final Vector vector = new Vector();
            bf.a(this.c, b, vector, at.z[0], at.z[2]);
            if (vector.size() > 0) {
                bf.b(this.c).b(vector);
            }
        }
        if (this.a != null) {
            this.a.run();
        }
    }
}
