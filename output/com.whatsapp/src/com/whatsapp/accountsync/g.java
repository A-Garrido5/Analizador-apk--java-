// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.accountsync;

class g
{
    private static final String[] z;
    final long a;
    final String b;
    
    static {
        final String[] z2 = new String[2];
        String s = "%\u0019-g4";
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
                        c2 = '\t';
                        break;
                    }
                    case 0: {
                        c2 = '\u0005';
                        break;
                    }
                    case 1: {
                        c2 = 's';
                        break;
                    }
                    case 2: {
                        c2 = 'D';
                        break;
                    }
                    case 3: {
                        c2 = '\u0003';
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
                    s = "l\u0017y";
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
    
    public g(final long a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public String toString() {
        return g.z[1] + this.a + g.z[0] + this.b;
    }
}
