// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public enum A
{
    public static final A BYTE_SEGMENTS;
    public static final A ERROR_CORRECTION_LEVEL;
    public static final A ISSUE_NUMBER;
    public static final A ORIENTATION;
    public static final A OTHER;
    public static final A PDF417_EXTRA_METADATA;
    public static final A POSSIBLE_COUNTRY;
    public static final A STRUCTURED_APPEND_PARITY;
    public static final A STRUCTURED_APPEND_SEQUENCE;
    public static final A SUGGESTED_PRICE;
    public static final A UPC_EAN_EXTENSION;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[11];
        String s = "j$\u001ccTp5\u0001~Tj5\u001aeIa)\u0002iPj:";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0307:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0006';
                        break;
                    }
                    case 0: {
                        c2 = '/';
                        break;
                    }
                    case 1: {
                        c2 = 'v';
                        break;
                    }
                    case 2: {
                        c2 = 'N';
                        break;
                    }
                    case 3: {
                        c2 = ',';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "|#\tkC|\"\u000bhY\u007f$\u0007oC";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "`\"\u0006iT";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u007f9\u001d\u007fOm:\u000bsE`#\u0000xTv";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "`$\u0007iH{7\u001aeIa";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "|\"\u001cyE{#\u001ciBp7\u001e|Ca2\u0011\u007fC~#\u000bbEj";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    s = "z&\rsCn8\u0011i^{3\u0000\u007fO`8";
                    n = 5;
                    n2 = 6;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    array = z2;
                    s = "\u007f2\b\u00187\u0018)\u000btR}7\u0011aC{7\nmRn";
                    n = 6;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "m/\u001aiY|3\taCa\"\u001d";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "f%\u001dyCp8\u001baDj$";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "|\"\u001cyE{#\u001ciBp7\u001e|Ca2\u0011|G}?\u001au";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    break Label_0307;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        OTHER = new A(A.z[2], 0);
        ORIENTATION = new A(A.z[4], 1);
        BYTE_SEGMENTS = new A(A.z[8], 2);
        ERROR_CORRECTION_LEVEL = new A(A.z[0], 3);
        ISSUE_NUMBER = new A(A.z[9], 4);
        SUGGESTED_PRICE = new A(A.z[1], 5);
        POSSIBLE_COUNTRY = new A(A.z[3], 6);
        UPC_EAN_EXTENSION = new A(A.z[6], 7);
        PDF417_EXTRA_METADATA = new A(A.z[7], 8);
        STRUCTURED_APPEND_SEQUENCE = new A(A.z[5], 9);
        STRUCTURED_APPEND_PARITY = new A(A.z[10], 10);
    }
    
    private A(final String s, final int n) {
    }
}
