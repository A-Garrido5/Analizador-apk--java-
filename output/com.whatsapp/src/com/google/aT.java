// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public enum aT
{
    public static final aT AZTEC_LAYERS;
    public static final aT CHARACTER_SET;
    public static final aT DATA_MATRIX_SHAPE;
    public static final aT ERROR_CORRECTION;
    public static final aT MARGIN;
    public static final aT MAX_SIZE;
    public static final aT MIN_SIZE;
    public static final aT PDF417_COMPACT;
    public static final aT PDF417_COMPACTION;
    public static final aT PDF417_DIMENSIONS;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[10];
        String s = "\u001b3sL\b|(v7t\u001b6v,";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0282:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '9';
                        break;
                    }
                    case 0: {
                        c2 = 'K';
                        break;
                    }
                    case 1: {
                        c2 = 'w';
                        break;
                    }
                    case 2: {
                        c2 = '5';
                        break;
                    }
                    case 3: {
                        c2 = 'x';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u001b3sL\b|(v7t\u001b6v,p\u00049";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0006>{'j\u0002-p";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u00066g?p\u0005";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u00066m'j\u0002-p";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u001b3sL\b|(q1t\u000e9f1v\u0005$";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u000f6a9f\u00066a*p\u0013(f0x\u001b2";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\n-a=z\u0014;t!|\u0019$";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\b?t*x\b#p*f\u00182a";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u000e%g7k\u00144z*k\u000e4a1v\u0005";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    break Label_0282;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        ERROR_CORRECTION = new aT(aT.z[9], 0);
        CHARACTER_SET = new aT(aT.z[8], 1);
        DATA_MATRIX_SHAPE = new aT(aT.z[6], 2);
        MIN_SIZE = new aT(aT.z[2], 3);
        MAX_SIZE = new aT(aT.z[4], 4);
        MARGIN = new aT(aT.z[3], 5);
        PDF417_COMPACT = new aT(aT.z[0], 6);
        PDF417_COMPACTION = new aT(aT.z[1], 7);
        PDF417_DIMENSIONS = new aT(aT.z[5], 8);
        AZTEC_LAYERS = new aT(aT.z[7], 9);
    }
    
    private aT(final String s, final int n) {
    }
}
