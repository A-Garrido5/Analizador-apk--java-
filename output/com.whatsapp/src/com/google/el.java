// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public enum el
{
    public static final el BOOL;
    public static final el BYTES;
    public static final el DOUBLE;
    public static final el ENUM;
    public static final el FIXED32;
    public static final el FIXED64;
    public static final el FLOAT;
    public static final el GROUP;
    public static final el INT32;
    public static final el INT64;
    public static final el MESSAGE;
    public static final el SFIXED32;
    public static final el SFIXED64;
    public static final el SINT32;
    public static final el SINT64;
    public static final el STRING;
    public static final el UINT32;
    public static final el UINT64;
    private static final el[] b;
    private static final String[] z;
    private final es a;
    private final int c;
    
    static {
        final String[] z2 = new String[18];
        final char[] charArray = "\u0006\\%J\u0013v!".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'W';
                    break;
                }
                case 0: {
                    c2 = '@';
                    break;
                }
                case 1: {
                    c2 = '\u0015';
                    break;
                }
                case 2: {
                    c2 = '}';
                    break;
                }
                case 3: {
                    c2 = '\u000f';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "\u0015\\3[dr".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'W';
                    break;
                }
                case 0: {
                    c4 = '@';
                    break;
                }
                case 1: {
                    c4 = '\u0015';
                    break;
                }
                case 2: {
                    c4 = '}';
                    break;
                }
                case 3: {
                    c4 = '\u000f';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "\u0007G2Z\u0007".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = 'W';
                    break;
                }
                case 0: {
                    c6 = '@';
                    break;
                }
                case 1: {
                    c6 = '\u0015';
                    break;
                }
                case 2: {
                    c6 = '}';
                    break;
                }
                case 3: {
                    c6 = '\u000f';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "\u0002Z2C".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = 'W';
                    break;
                }
                case 0: {
                    c8 = '@';
                    break;
                }
                case 1: {
                    c8 = '\u0015';
                    break;
                }
                case 2: {
                    c8 = '}';
                    break;
                }
                case 3: {
                    c8 = '\u000f';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "\u0013A/F\u0019\u0007".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = 'W';
                    break;
                }
                case 0: {
                    c10 = '@';
                    break;
                }
                case 1: {
                    c10 = '\u0015';
                    break;
                }
                case 2: {
                    c10 = '}';
                    break;
                }
                case 3: {
                    c10 = '\u000f';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "\u0002L)J\u0004".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = 'W';
                    break;
                }
                case 0: {
                    c12 = '@';
                    break;
                }
                case 1: {
                    c12 = '\u0015';
                    break;
                }
                case 2: {
                    c12 = '}';
                    break;
                }
                case 3: {
                    c12 = '\u000f';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "\u0013S4W\u0012\u0004&O".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = 'W';
                    break;
                }
                case 0: {
                    c14 = '@';
                    break;
                }
                case 1: {
                    c14 = '\u0015';
                    break;
                }
                case 2: {
                    c14 = '}';
                    break;
                }
                case 3: {
                    c14 = '\u000f';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        final char[] charArray8 = "\u0004Z(M\u001b\u0005".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = 'W';
                    break;
                }
                case 0: {
                    c16 = '@';
                    break;
                }
                case 1: {
                    c16 = '\u0015';
                    break;
                }
                case 2: {
                    c16 = '}';
                    break;
                }
                case 3: {
                    c16 = '\u000f';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[7] = new String(charArray8).intern();
        final char[] charArray9 = "\u0015\\3[at".toCharArray();
        for (int length5 = charArray9.length, n9 = 0; length5 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = 'W';
                    break;
                }
                case 0: {
                    c18 = '@';
                    break;
                }
                case 1: {
                    c18 = '\u0015';
                    break;
                }
                case 2: {
                    c18 = '}';
                    break;
                }
                case 3: {
                    c18 = '\u000f';
                    break;
                }
            }
            charArray9[n9] = (char)(c18 ^ c17);
        }
        z2[8] = new String(charArray9).intern();
        final char[] charArray10 = "\u0013\\3[at".toCharArray();
        for (int length6 = charArray10.length, n10 = 0; length6 > n10; ++n10) {
            final char c19 = charArray10[n10];
            char c20 = '\0';
            switch (n10 % 5) {
                default: {
                    c20 = 'W';
                    break;
                }
                case 0: {
                    c20 = '@';
                    break;
                }
                case 1: {
                    c20 = '\u0015';
                    break;
                }
                case 2: {
                    c20 = '}';
                    break;
                }
                case 3: {
                    c20 = '\u000f';
                    break;
                }
            }
            charArray10[n10] = (char)(c20 ^ c19);
        }
        z2[9] = new String(charArray10).intern();
        final char[] charArray11 = "\u0006\\%J\u0013s'".toCharArray();
        for (int length7 = charArray11.length, n11 = 0; length7 > n11; ++n11) {
            final char c21 = charArray11[n11];
            char c22 = '\0';
            switch (n11 % 5) {
                default: {
                    c22 = 'W';
                    break;
                }
                case 0: {
                    c22 = '@';
                    break;
                }
                case 1: {
                    c22 = '\u0015';
                    break;
                }
                case 2: {
                    c22 = '}';
                    break;
                }
                case 3: {
                    c22 = '\u000f';
                    break;
                }
            }
            charArray11[n11] = (char)(c22 ^ c21);
        }
        z2[10] = new String(charArray11).intern();
        final char[] charArray12 = "\t[)<e".toCharArray();
        for (int length8 = charArray12.length, n12 = 0; length8 > n12; ++n12) {
            final char c23 = charArray12[n12];
            char c24 = '\0';
            switch (n12 % 5) {
                default: {
                    c24 = 'W';
                    break;
                }
                case 0: {
                    c24 = '@';
                    break;
                }
                case 1: {
                    c24 = '\u0015';
                    break;
                }
                case 2: {
                    c24 = '}';
                    break;
                }
                case 3: {
                    c24 = '\u000f';
                    break;
                }
            }
            charArray12[n12] = (char)(c24 ^ c23);
        }
        z2[11] = new String(charArray12).intern();
        final char[] charArray13 = "\u0005[(B".toCharArray();
        for (int length9 = charArray13.length, n13 = 0; length9 > n13; ++n13) {
            final char c25 = charArray13[n13];
            char c26 = '\0';
            switch (n13 % 5) {
                default: {
                    c26 = 'W';
                    break;
                }
                case 0: {
                    c26 = '@';
                    break;
                }
                case 1: {
                    c26 = '\u0015';
                    break;
                }
                case 2: {
                    c26 = '}';
                    break;
                }
                case 3: {
                    c26 = '\u000f';
                    break;
                }
            }
            charArray13[n13] = (char)(c26 ^ c25);
        }
        z2[12] = new String(charArray13).intern();
        final char[] charArray14 = "\u0006Y2N\u0003".toCharArray();
        for (int length10 = charArray14.length, n14 = 0; length10 > n14; ++n14) {
            final char c27 = charArray14[n14];
            char c28 = '\0';
            switch (n14 % 5) {
                default: {
                    c28 = 'W';
                    break;
                }
                case 0: {
                    c28 = '@';
                    break;
                }
                case 1: {
                    c28 = '\u0015';
                    break;
                }
                case 2: {
                    c28 = '}';
                    break;
                }
                case 3: {
                    c28 = '\u000f';
                    break;
                }
            }
            charArray14[n14] = (char)(c28 ^ c27);
        }
        z2[13] = new String(charArray14).intern();
        final char[] charArray15 = "\rP.\\\u0016\u0007P".toCharArray();
        for (int length11 = charArray15.length, n15 = 0; length11 > n15; ++n15) {
            final char c29 = charArray15[n15];
            char c30 = '\0';
            switch (n15 % 5) {
                default: {
                    c30 = 'W';
                    break;
                }
                case 0: {
                    c30 = '@';
                    break;
                }
                case 1: {
                    c30 = '\u0015';
                    break;
                }
                case 2: {
                    c30 = '}';
                    break;
                }
                case 3: {
                    c30 = '\u000f';
                    break;
                }
            }
            charArray15[n15] = (char)(c30 ^ c29);
        }
        z2[14] = new String(charArray15).intern();
        final char[] charArray16 = "\u0013S4W\u0012\u0004#I".toCharArray();
        for (int length12 = charArray16.length, n16 = 0; length12 > n16; ++n16) {
            final char c31 = charArray16[n16];
            char c32 = '\0';
            switch (n16 % 5) {
                default: {
                    c32 = 'W';
                    break;
                }
                case 0: {
                    c32 = '@';
                    break;
                }
                case 1: {
                    c32 = '\u0015';
                    break;
                }
                case 2: {
                    c32 = '}';
                    break;
                }
                case 3: {
                    c32 = '\u000f';
                    break;
                }
            }
            charArray16[n16] = (char)(c32 ^ c31);
        }
        z2[15] = new String(charArray16).intern();
        final char[] charArray17 = "\u0013\\3[dr".toCharArray();
        for (int length13 = charArray17.length, n17 = 0; length13 > n17; ++n17) {
            final char c33 = charArray17[n17];
            char c34 = '\0';
            switch (n17 % 5) {
                default: {
                    c34 = 'W';
                    break;
                }
                case 0: {
                    c34 = '@';
                    break;
                }
                case 1: {
                    c34 = '\u0015';
                    break;
                }
                case 2: {
                    c34 = '}';
                    break;
                }
                case 3: {
                    c34 = '\u000f';
                    break;
                }
            }
            charArray17[n17] = (char)(c34 ^ c33);
        }
        z2[16] = new String(charArray17).intern();
        final char[] charArray18 = "\t[)9c".toCharArray();
        for (int length14 = charArray18.length, n18 = 0; length14 > n18; ++n18) {
            final char c35 = charArray18[n18];
            char c36 = '\0';
            switch (n18 % 5) {
                default: {
                    c36 = 'W';
                    break;
                }
                case 0: {
                    c36 = '@';
                    break;
                }
                case 1: {
                    c36 = '\u0015';
                    break;
                }
                case 2: {
                    c36 = '}';
                    break;
                }
                case 3: {
                    c36 = '\u000f';
                    break;
                }
            }
            charArray18[n18] = (char)(c36 ^ c35);
        }
        z2[17] = new String(charArray18).intern();
        z = z2;
        DOUBLE = new el(el.z[7], 0, es.DOUBLE, 1);
        FLOAT = new el(el.z[13], 1, es.FLOAT, 5);
        INT64 = new el(el.z[17], 2, es.LONG, 0);
        UINT64 = new el(el.z[8], 3, es.LONG, 0);
        INT32 = new el(el.z[11], 4, es.INT, 0);
        FIXED64 = new el(el.z[0], 5, es.LONG, 1);
        FIXED32 = new el(el.z[10], 6, es.INT, 5);
        BOOL = new el(el.z[3], 7, es.BOOLEAN, 0);
        STRING = new el(el.z[4], 8, es.STRING, 2)
        {
            ec(final String s, final int n, final es es, final int n2) {
            }
            
            @Override
            public boolean isPackable() {
                return false;
            }
        };
        GROUP = new el(el.z[2], 9, es.MESSAGE, 3)
        {
            eB(final String s, final int n, final es es, final int n2) {
            }
            
            @Override
            public boolean isPackable() {
                return false;
            }
        };
        MESSAGE = new el(el.z[14], 10, es.MESSAGE, 2)
        {
            eR(final String s, final int n, final es es, final int n2) {
            }
            
            @Override
            public boolean isPackable() {
                return false;
            }
        };
        BYTES = new el(el.z[5], 11, es.BYTE_STRING, 2)
        {
            em(final String s, final int n, final es es, final int n2) {
            }
            
            @Override
            public boolean isPackable() {
                return false;
            }
        };
        UINT32 = new el(el.z[1], 12, es.INT, 0);
        ENUM = new el(el.z[12], 13, es.ENUM, 0);
        SFIXED32 = new el(el.z[6], 14, es.INT, 5);
        SFIXED64 = new el(el.z[15], 15, es.LONG, 1);
        SINT32 = new el(el.z[16], 16, es.INT, 0);
        SINT64 = new el(el.z[9], 17, es.LONG, 0);
        b = new el[] { el.DOUBLE, el.FLOAT, el.INT64, el.UINT64, el.INT32, el.FIXED64, el.FIXED32, el.BOOL, el.STRING, el.GROUP, el.MESSAGE, el.BYTES, el.UINT32, el.ENUM, el.SFIXED32, el.SFIXED64, el.SINT32, el.SINT64 };
    }
    
    private el(final String s, final int n, final es a, final int c) {
        this.a = a;
        this.c = c;
    }
    
    el(final String s, final int n, final es es, final int n2, final V v) {
        this(s, n, es, n2);
    }
    
    public es getJavaType() {
        return this.a;
    }
    
    public int getWireType() {
        return this.c;
    }
    
    public boolean isPackable() {
        return true;
    }
}
