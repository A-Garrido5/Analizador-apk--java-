// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

import java.util.Vector;

class a0 extends a
{
    private static final String[] z;
    final c2 a;
    final bf b;
    final c2 c;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u0016tc\u007f-\u001bn\u007f";
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
                        c2 = 'Y';
                        break;
                    }
                    case 0: {
                        c2 = 'r';
                        break;
                    }
                    case 1: {
                        c2 = '\u0001';
                        break;
                    }
                    case 2: {
                        c2 = '\u0011';
                        break;
                    }
                    case 3: {
                        c2 = '\u001e';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0018hu";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\u0002`cj0\u0011ha\u007f7\u0006";
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
    
    a0(final bf b, final c2 c, final c2 a) {
        this.b = b;
        this.c = c;
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
        final int o = bi.O;
        if (this.c != null) {
            final c0 a = c0.a(0);
            int int1 = 0;
            if (a != null) {
                final c0 a2 = a.a(0);
                if (a2 != null) {
                    final Vector a3 = a2.a(a0.z[2]);
                    if (a3 != null) {
                        final bt[] array = new bt[a3.size()];
                        int n;
                        for (int i = 0; i < a3.size(); i = n) {
                            final c0 c2 = a3.elementAt(i);
                            final c0 a4 = c2.a(0);
                            Label_0134: {
                                if (a4 != null) {
                                    array[i] = bf.a(this.b, a4);
                                    if (o == 0) {
                                        break Label_0134;
                                    }
                                }
                                array[i] = new bt();
                            }
                            array[i].e = c2.c(a0.z[1]);
                            n = i + 1;
                            if (o != 0) {
                                break;
                            }
                        }
                        bf.a(this.b).a(s, array);
                    }
                }
                final String c3 = a.c(a0.z[0]);
                int1 = 0;
                if (c3 != null) {
                    int1 = Integer.parseInt(c3);
                }
            }
            this.c.a(int1 * 1000);
        }
    }
}
