// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

import java.util.Hashtable;

class s extends a
{
    private static final String[] z;
    final bf a;
    
    static {
        final String[] z2 = new String[7];
        String s = "dN\\rYwE";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '8';
                        break;
                    }
                    case 0: {
                        c2 = '\u0014';
                        break;
                    }
                    case 1: {
                        c2 = '<';
                        break;
                    }
                    case 2: {
                        c2 = '5';
                        break;
                    }
                    case 3: {
                        c2 = '\u0004';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "z]Xa";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "qNGkJ";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "b]Yq]";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "qNGkJ";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "wSQa";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "w]Aa_{NL";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    s(final bf a) {
        this.a = a;
    }
    
    @Override
    public void a(final int n) {
    }
    
    @Override
    public void a(final c0 c0, final String s) {
        final int o = bi.O;
        final c0 a = c0.a(0);
        final Hashtable<String, String> hashtable = new Hashtable<String, String>();
        c0.b(a, s.z[0]);
        if (a.d != null) {
            int i = 0;
            while (i < a.d.length) {
                final c0 c2 = a.d[i];
                c0.b(c2, s.z[6]);
                final String c3 = c2.c(s.z[1]);
                String s2 = c2.c(s.z[3]);
                if (s.z[2].equals(s2)) {
                    final c0 a2 = c2.a(0);
                    c0.b(a2, s.z[4]);
                    s2 = a2.c(s.z[5]);
                }
                hashtable.put(c3, s2);
                ++i;
                if (o != 0) {
                    break;
                }
            }
        }
        bf.d(this.a).d(hashtable);
    }
}
