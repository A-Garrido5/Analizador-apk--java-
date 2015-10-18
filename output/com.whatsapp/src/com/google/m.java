// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public class m extends Exception
{
    private static final String[] z;
    private String a;
    private g2 b;
    
    static {
        final String[] z2 = new String[2];
        String s = "b\u000b";
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
                        c2 = '1';
                        break;
                    }
                    case 0: {
                        c2 = 'L';
                        break;
                    }
                    case 1: {
                        c2 = '+';
                        break;
                    }
                    case 2: {
                        c2 = '%';
                        break;
                    }
                    case 3: {
                        c2 = 'W';
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
                    s = "\tYW8Cl_\\'Tv\u000b";
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
    
    public m(final g2 b, final String a) {
        super(a);
        this.a = a;
        this.b = b;
    }
    
    public g2 a() {
        return this.b;
    }
    
    @Override
    public String toString() {
        return m.z[1] + this.b + m.z[0] + this.a;
    }
}
