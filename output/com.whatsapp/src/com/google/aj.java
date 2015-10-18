// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class aj extends aD
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        String s = "R\f6\u0011\u0016S";
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
                        c2 = '$';
                        break;
                    }
                    case 0: {
                        c2 = 'z';
                        break;
                    }
                    case 1: {
                        c2 = '?';
                        break;
                    }
                    case 2: {
                        c2 = '\u0004';
                        break;
                    }
                    case 3: {
                        c2 = '!';
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
                    s = "R\f6\u0011\u0017S";
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
    
    aj(final hN hn) {
        super(hn);
    }
    
    @Override
    protected int a(final int n) {
        if (n < 10000) {
            return n;
        }
        return n - 10000;
    }
    
    @Override
    protected void c(final StringBuilder sb, final int n) {
        if (n < 10000) {
            sb.append(aj.z[0]);
            if (ay.c == 0) {
                return;
            }
        }
        sb.append(aj.z[1]);
    }
}
