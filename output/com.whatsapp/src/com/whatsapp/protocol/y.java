// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

import java.util.Vector;
import java.util.Hashtable;

class y extends a
{
    private static final String[] z;
    final bf a;
    
    static {
        final String[] z2 = new String[5];
        String s = "\u0017%eD";
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
                        c2 = '\u0010';
                        break;
                    }
                    case 0: {
                        c2 = 'g';
                        break;
                    }
                    case 1: {
                        c2 = 'W';
                        break;
                    }
                    case 2: {
                        c2 = '\n';
                        break;
                    }
                    case 3: {
                        c2 = '4';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\t6gQ";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u00116fAu";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u00112xGy\b9";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "\u0017%eDc";
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
    
    y(final bf a) {
        this.a = a;
    }
    
    @Override
    public void a(final c0 c0, final String s) {
        int i = 0;
        final int o = bi.O;
        final c0 b = c0.b(y.z[4]);
        if (b == null) {
            return;
        }
        final String c2 = b.c(y.z[3]);
        while (true) {
            try {
                final int int1 = Integer.parseInt(c2);
                final Vector a = b.a(y.z[0]);
                final Hashtable<String, String> hashtable = new Hashtable<String, String>();
                while (i < a.size()) {
                    final c0 c3 = a.elementAt(i);
                    hashtable.put(c3.c(y.z[1]), c3.c(y.z[2]));
                    ++i;
                    if (o != 0) {
                        break;
                    }
                }
                bf.d(this.a).a(int1, hashtable);
            }
            catch (NumberFormatException ex) {
                final int int1 = 0;
                continue;
            }
            break;
        }
    }
}
