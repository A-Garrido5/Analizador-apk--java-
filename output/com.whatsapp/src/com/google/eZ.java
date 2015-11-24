// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public enum eZ
{
    public static final eZ ALPHANUMERIC;
    public static final eZ BYTE;
    public static final eZ ECI;
    public static final eZ FNC1_FIRST_POSITION;
    public static final eZ FNC1_SECOND_POSITION;
    public static final eZ HANZI;
    public static final eZ KANJI;
    public static final eZ NUMERIC;
    public static final eZ STRUCTURED_APPEND;
    public static final eZ TERMINATOR;
    private static final String[] z;
    private final int a;
    private final int[] c;
    
    static {
        final String[] z2 = new String[10];
        String s = "\u001caqC[\u001b`qS\\\u0010tsF]\u0001q";
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
                        c2 = '\u0018';
                        break;
                    }
                    case 0: {
                        c2 = 'O';
                        break;
                    }
                    case 1: {
                        c2 = '5';
                        break;
                    }
                    case 2: {
                        c2 = '#';
                        break;
                    }
                    case 3: {
                        c2 = '\u0016';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\nvj";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0004tm\\Q";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\t{`'G\u001cp`YV\u000bjsYK\u0006ajYV";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\t{`'G\t|qEL\u0010elEQ\u001b|lX";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u0007tmLQ";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0001`nSJ\u0006v";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u000eys^Y\u0001`nSJ\u0006v";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u001bpq[Q\u0001twYJ";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\rlwS";
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
        TERMINATOR = new eZ(eZ.z[8], 0, new int[] { 0, 0, 0 }, 0);
        NUMERIC = new eZ(eZ.z[6], 1, new int[] { 10, 12, 14 }, 1);
        ALPHANUMERIC = new eZ(eZ.z[7], 2, new int[] { 9, 11, 13 }, 2);
        STRUCTURED_APPEND = new eZ(eZ.z[0], 3, new int[] { 0, 0, 0 }, 3);
        BYTE = new eZ(eZ.z[9], 4, new int[] { 8, 16, 16 }, 4);
        ECI = new eZ(eZ.z[1], 5, new int[] { 0, 0, 0 }, 7);
        KANJI = new eZ(eZ.z[2], 6, new int[] { 8, 10, 12 }, 8);
        FNC1_FIRST_POSITION = new eZ(eZ.z[4], 7, new int[] { 0, 0, 0 }, 5);
        FNC1_SECOND_POSITION = new eZ(eZ.z[3], 8, new int[] { 0, 0, 0 }, 9);
        HANZI = new eZ(eZ.z[5], 9, new int[] { 8, 10, 12 }, 13);
    }
    
    private eZ(final String s, final int n, final int[] c, final int a) {
        this.c = c;
        this.a = a;
    }
    
    public static eZ forBits(final int n) {
        switch (n) {
            default: {
                throw new IllegalArgumentException();
            }
            case 0: {
                try {
                    return eZ.TERMINATOR;
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
            case 1: {
                return eZ.NUMERIC;
            }
            case 2: {
                return eZ.ALPHANUMERIC;
            }
            case 3: {
                return eZ.STRUCTURED_APPEND;
            }
            case 4: {
                return eZ.BYTE;
            }
            case 5: {
                return eZ.FNC1_FIRST_POSITION;
            }
            case 7: {
                return eZ.ECI;
            }
            case 8: {
                return eZ.KANJI;
            }
            case 9: {
                return eZ.FNC1_SECOND_POSITION;
            }
            case 13: {
                return eZ.HANZI;
            }
        }
    }
    
    public int getBits() {
        return this.a;
    }
    
    public int getCharacterCountBits(final bE be) {
        final int e = bE.e;
        final int d = be.d();
        if (d <= 9) {
            final int n = 0;
            if (e == 0) {
                return this.c[n];
            }
        }
        if (d <= 26) {
            final int n = 1;
            if (e == 0) {
                return this.c[n];
            }
        }
        final int n = 2;
        return this.c[n];
    }
}
