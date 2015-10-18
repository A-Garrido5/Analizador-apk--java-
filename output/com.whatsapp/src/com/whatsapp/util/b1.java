// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

public class b1 extends bi
{
    private static final String[] z;
    protected bi[] d;
    
    static {
        final String[] z2 = new String[4];
        String s = "\b\u0004";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'r';
                        break;
                    }
                    case 0: {
                        c2 = '(';
                        break;
                    }
                    case 1: {
                        c2 = ',';
                        break;
                    }
                    case 2: {
                        c2 = '\n';
                        break;
                    }
                    case 3: {
                        c2 = '1';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\bObX\u001eL";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\bObX\u001eL^o_";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\bNsE\u0017[\u0005*\u001cR";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    protected b1(final long n, final String s, final bi[] d) {
        super(n, s);
        this.d = d;
    }
    
    public bi[] a() {
        return this.d;
    }
    
    @Override
    public String toString() {
        final StringBuilder append = new StringBuilder().append(this.a).append(b1.z[0]).append(this.c).append(b1.z[3]).append(this.d.length);
        String s;
        if (this.d.length == 1) {
            s = b1.z[1];
        }
        else {
            s = b1.z[2];
        }
        return append.append(s).toString();
    }
}
