// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

import java.util.Vector;

public abstract class a
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "i\t\u00199S";
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
                        c2 = '!';
                        break;
                    }
                    case 0: {
                        c2 = '\f';
                        break;
                    }
                    case 1: {
                        c2 = '{';
                        break;
                    }
                    case 2: {
                        c2 = 'k';
                        break;
                    }
                    case 3: {
                        c2 = 'V';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "o\u0014\u000f3";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "x\u001e\u0013\"";
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
    
    public void a(final int n) {
    }
    
    public void a(final int n, final String s) {
        this.a(n);
    }
    
    public void a(final c0 c0) {
        final int o = bi.O;
        final Vector a = c0.a(com.whatsapp.protocol.a.z[0]);
        int n;
        for (int i = 0; i < a.size(); i = n) {
            final c0 c2 = a.elementAt(i);
            if (c2 != null) {
                final String c3 = c2.c(com.whatsapp.protocol.a.z[1]);
                final String c4 = c2.c(com.whatsapp.protocol.a.z[2]);
                if (c3 != null) {
                    this.a(Integer.parseInt(c3), c4);
                }
            }
            n = i + 1;
            if (o != 0) {
                break;
            }
        }
    }
    
    public abstract void a(final c0 p0, final String p1);
    
    public void a(final Exception ex) {
    }
}
