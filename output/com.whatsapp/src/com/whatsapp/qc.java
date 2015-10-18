// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public enum qc
{
    public static final qc GROUP;
    public static final qc INDIVIDUAL;
    private static final qc[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        String s = "&|Nrp";
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
                        c2 = ' ';
                        break;
                    }
                    case 0: {
                        c2 = 'a';
                        break;
                    }
                    case 1: {
                        c2 = '.';
                        break;
                    }
                    case 2: {
                        c2 = '\u0001';
                        break;
                    }
                    case 3: {
                        c2 = '\'';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "(`Env(jTfl";
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
        INDIVIDUAL = new qc(qc.z[1], 0);
        GROUP = new qc(qc.z[0], 1);
        a = new qc[] { qc.INDIVIDUAL, qc.GROUP };
    }
    
    private qc(final String s, final int n) {
    }
}
