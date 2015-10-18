// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum n
{
    public static final n CALLEE;
    public static final n CALLER;
    private static final n[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[2];
        String s = "F-\u00036h@";
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
                        c2 = '-';
                        break;
                    }
                    case 0: {
                        c2 = '\u0005';
                        break;
                    }
                    case 1: {
                        c2 = 'l';
                        break;
                    }
                    case 2: {
                        c2 = 'O';
                        break;
                    }
                    case 3: {
                        c2 = 'z';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "F-\u00036hW";
                    n2 = 1;
                    array = z2;
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
        CALLER = new n(com.whatsapp.fieldstats.n.z[1], 0, 1);
        CALLEE = new n(com.whatsapp.fieldstats.n.z[0], 1, 2);
        b = new n[] { com.whatsapp.fieldstats.n.CALLER, com.whatsapp.fieldstats.n.CALLEE };
    }
    
    private n(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
