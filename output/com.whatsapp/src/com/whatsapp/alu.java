// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

enum alu
{
    public static final alu BROADCAST;
    public static final alu CALL;
    public static final alu NORMAL;
    private static final alu[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u0016cz5\\\u0017pf ";
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
                        c2 = '\u0018';
                        break;
                    }
                    case 0: {
                        c2 = 'T';
                        break;
                    }
                    case 1: {
                        c2 = '1';
                        break;
                    }
                    case 2: {
                        c2 = '5';
                        break;
                    }
                    case 3: {
                        c2 = 't';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u001a~g9Y\u0018";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0017py8";
                    n2 = 2;
                    array = z2;
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
        NORMAL = new alu(alu.z[1], 0);
        BROADCAST = new alu(alu.z[0], 1);
        CALL = new alu(alu.z[2], 2);
        a = new alu[] { alu.NORMAL, alu.BROADCAST, alu.CALL };
    }
    
    private alu(final String s, final int n) {
    }
}
