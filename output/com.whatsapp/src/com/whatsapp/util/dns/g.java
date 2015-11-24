// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util.dns;

import java.net.InetAddress;

final class g
{
    private static final String[] z;
    final long a;
    final InetAddress b;
    
    static {
        final String[] z2 = new String[2];
        String s = "mN\u0005yt@D\u0012hFWw\ty]aX\u0010dG][\u0001iQVE\u0013~\b";
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
                        c2 = '5';
                        break;
                    }
                    case 0: {
                        c2 = '$';
                        break;
                    }
                    case 1: {
                        c2 = ' ';
                        break;
                    }
                    case 2: {
                        c2 = '`';
                        break;
                    }
                    case 3: {
                        c2 = '\r';
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
                    s = "\b\u0000\u0005uEMR\u0005Y\\IE-dYHI\u00130";
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
    
    g(final InetAddress b, final long a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public String toString() {
        return g.z[0] + this.b + g.z[1] + this.a + '}';
    }
}
