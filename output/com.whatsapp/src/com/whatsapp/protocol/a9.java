// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

import java.util.Hashtable;
import java.util.Vector;

class a9 extends a
{
    private static final String[] z;
    final c2 a;
    final Runnable b;
    final bf c;
    
    static {
        final String[] z2 = new String[2];
        String s = "z1P\f\u001e{";
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
                        c2 = 'j';
                        break;
                    }
                    case 0: {
                        c2 = '\u001e';
                        break;
                    }
                    case 1: {
                        c2 = 'T';
                        break;
                    }
                    case 2: {
                        c2 = '<';
                        break;
                    }
                    case 3: {
                        c2 = 'i';
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
                    s = "z1P\f\u001e{";
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
    
    a9(final bf c, final Runnable b, final c2 a) {
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
        if (c0.b(a9.z[1]) != null) {
            final Vector vector = new Vector();
            final Hashtable hashtable = new Hashtable();
            bf.a(this.c, c0, vector, hashtable, a9.z[0]);
            bf.b(this.c).a(vector, hashtable);
        }
        if (this.b != null) {
            this.b.run();
        }
    }
}
