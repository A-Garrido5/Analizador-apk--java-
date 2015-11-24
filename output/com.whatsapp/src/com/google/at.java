// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

enum at
{
    public static final at ANSIX12_ENCODE;
    public static final at ASCII_ENCODE;
    public static final at BASE256_ENCODE;
    public static final at C40_ENCODE;
    public static final at EDIFACT_ENCODE;
    public static final at PAD_ENCODE;
    public static final at TEXT_ENCODE;
    private static final at[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[7];
        String s = "ab\u0018b;\u0016\u0015\u0014bG`l\u000fb";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
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
                        c2 = '#';
                        break;
                    }
                    case 1: {
                        c2 = '#';
                        break;
                    }
                    case 2: {
                        c2 = 'K';
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
                    s = "bm\u0018nQ\u0012\u0011\u0014bG`l\u000fb";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "sb\u000fxLm`\u0004cL";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "bp\bn@|f\u0005dFgf";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "fg\u0002aH`w\u0014bG`l\u000fb";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "wf\u0013sVfm\bhMf";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "`\u0017{xLm`\u0004cL";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        PAD_ENCODE = new at(at.z[2], 0);
        ASCII_ENCODE = new at(at.z[3], 1);
        C40_ENCODE = new at(at.z[6], 2);
        TEXT_ENCODE = new at(at.z[5], 3);
        ANSIX12_ENCODE = new at(at.z[1], 4);
        EDIFACT_ENCODE = new at(at.z[4], 5);
        BASE256_ENCODE = new at(at.z[0], 6);
        a = new at[] { at.PAD_ENCODE, at.ASCII_ENCODE, at.C40_ENCODE, at.TEXT_ENCODE, at.ANSIX12_ENCODE, at.EDIFACT_ENCODE, at.BASE256_ENCODE };
    }
    
    private at(final String s, final int n) {
    }
}
