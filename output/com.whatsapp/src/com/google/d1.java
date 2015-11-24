// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public enum d1 implements gp
{
    public static final d1 TYPE_BOOL;
    public static final int TYPE_BOOL_VALUE = 8;
    public static final d1 TYPE_BYTES;
    public static final int TYPE_BYTES_VALUE = 12;
    public static final d1 TYPE_DOUBLE;
    public static final int TYPE_DOUBLE_VALUE = 1;
    public static final d1 TYPE_ENUM;
    public static final int TYPE_ENUM_VALUE = 14;
    public static final d1 TYPE_FIXED32;
    public static final int TYPE_FIXED32_VALUE = 7;
    public static final d1 TYPE_FIXED64;
    public static final int TYPE_FIXED64_VALUE = 6;
    public static final d1 TYPE_FLOAT;
    public static final int TYPE_FLOAT_VALUE = 2;
    public static final d1 TYPE_GROUP;
    public static final int TYPE_GROUP_VALUE = 10;
    public static final d1 TYPE_INT32;
    public static final int TYPE_INT32_VALUE = 5;
    public static final d1 TYPE_INT64;
    public static final int TYPE_INT64_VALUE = 3;
    public static final d1 TYPE_MESSAGE;
    public static final int TYPE_MESSAGE_VALUE = 11;
    public static final d1 TYPE_SFIXED32;
    public static final int TYPE_SFIXED32_VALUE = 15;
    public static final d1 TYPE_SFIXED64;
    public static final int TYPE_SFIXED64_VALUE = 16;
    public static final d1 TYPE_SINT32;
    public static final int TYPE_SINT32_VALUE = 17;
    public static final d1 TYPE_SINT64;
    public static final int TYPE_SINT64_VALUE = 18;
    public static final d1 TYPE_STRING;
    public static final int TYPE_STRING_VALUE = 9;
    public static final d1 TYPE_UINT32;
    public static final int TYPE_UINT32_VALUE = 13;
    public static final d1 TYPE_UINT64;
    public static final int TYPE_UINT64_VALUE = 4;
    private static final d1[] a;
    private static dw c;
    private static final d1[] e;
    private static final String[] z;
    private final int b;
    private final int d;
    
    static {
        final String[] z2 = new String[19];
        final char[] charArray = "%|5pw\u0001~5xe\u0005a#oH\u0010f/o\u0001\ta`sN\u00142&rS@f(tR@f9mDN".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '!';
                    break;
                }
                case 0: {
                    c2 = '`';
                    break;
                }
                case 1: {
                    c2 = '\u0012';
                    break;
                }
                case 2: {
                    c2 = '@';
                    break;
                }
                case 3: {
                    c2 = '\u001d';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "4K\u0010X~3[\u000eI\u0012R".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '!';
                    break;
                }
                case 0: {
                    c4 = '`';
                    break;
                }
                case 1: {
                    c4 = '\u0012';
                    break;
                }
                case 2: {
                    c4 = '@';
                    break;
                }
                case 3: {
                    c4 = '\u001d';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "4K\u0010X~$]\u0015_m%".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '!';
                    break;
                }
                case 0: {
                    c6 = '`';
                    break;
                }
                case 1: {
                    c6 = '\u0012';
                    break;
                }
                case 2: {
                    c6 = '@';
                    break;
                }
                case 3: {
                    c6 = '\u001d';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "4K\u0010X~-W\u0013N`'W".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '!';
                    break;
                }
                case 0: {
                    c8 = '`';
                    break;
                }
                case 1: {
                    c8 = '\u0012';
                    break;
                }
                case 2: {
                    c8 = '@';
                    break;
                }
                case 3: {
                    c8 = '\u001d';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "4K\u0010X~&[\u0018XeV&".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '!';
                    break;
                }
                case 0: {
                    c10 = '`';
                    break;
                }
                case 1: {
                    c10 = '\u0012';
                    break;
                }
                case 2: {
                    c10 = '@';
                    break;
                }
                case 3: {
                    c10 = '\u001d';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "4K\u0010X~\"K\u0014Xr".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = '!';
                    break;
                }
                case 0: {
                    c12 = '`';
                    break;
                }
                case 1: {
                    c12 = '\u0012';
                    break;
                }
                case 2: {
                    c12 = '@';
                    break;
                }
                case 3: {
                    c12 = '\u001d';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "4K\u0010X~%\\\u0015P".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = '!';
                    break;
                }
                case 0: {
                    c14 = '`';
                    break;
                }
                case 1: {
                    c14 = '\u0012';
                    break;
                }
                case 2: {
                    c14 = '@';
                    break;
                }
                case 3: {
                    c14 = '\u001d';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        final char[] charArray8 = "4K\u0010X~3[\u000eI\u0017T".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = '!';
                    break;
                }
                case 0: {
                    c16 = '`';
                    break;
                }
                case 1: {
                    c16 = '\u0012';
                    break;
                }
                case 2: {
                    c16 = '@';
                    break;
                }
                case 3: {
                    c16 = '\u001d';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[7] = new String(charArray8).intern();
        final char[] charArray9 = "4K\u0010X~)\\\u0014+\u0015".toCharArray();
        for (int length5 = charArray9.length, n9 = 0; length5 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = '!';
                    break;
                }
                case 0: {
                    c18 = '`';
                    break;
                }
                case 1: {
                    c18 = '\u0012';
                    break;
                }
                case 2: {
                    c18 = '@';
                    break;
                }
                case 3: {
                    c18 = '\u001d';
                    break;
                }
            }
            charArray9[n9] = (char)(c18 ^ c17);
        }
        z2[8] = new String(charArray9).intern();
        final char[] charArray10 = "4K\u0010X~\"]\u000fQ".toCharArray();
        for (int length6 = charArray10.length, n10 = 0; length6 > n10; ++n10) {
            final char c19 = charArray10[n10];
            char c20 = '\0';
            switch (n10 % 5) {
                default: {
                    c20 = '!';
                    break;
                }
                case 0: {
                    c20 = '`';
                    break;
                }
                case 1: {
                    c20 = '\u0012';
                    break;
                }
                case 2: {
                    c20 = '@';
                    break;
                }
                case 3: {
                    c20 = '\u001d';
                    break;
                }
            }
            charArray10[n10] = (char)(c20 ^ c19);
        }
        z2[9] = new String(charArray10).intern();
        final char[] charArray11 = "4K\u0010X~&^\u000f\\u".toCharArray();
        for (int length7 = charArray11.length, n11 = 0; length7 > n11; ++n11) {
            final char c21 = charArray11[n11];
            char c22 = '\0';
            switch (n11 % 5) {
                default: {
                    c22 = '!';
                    break;
                }
                case 0: {
                    c22 = '`';
                    break;
                }
                case 1: {
                    c22 = '\u0012';
                    break;
                }
                case 2: {
                    c22 = '@';
                    break;
                }
                case 3: {
                    c22 = '\u001d';
                    break;
                }
            }
            charArray11[n11] = (char)(c22 ^ c21);
        }
        z2[10] = new String(charArray11).intern();
        final char[] charArray12 = "4K\u0010X~)\\\u0014.\u0013".toCharArray();
        for (int length8 = charArray12.length, n12 = 0; length8 > n12; ++n12) {
            final char c23 = charArray12[n12];
            char c24 = '\0';
            switch (n12 % 5) {
                default: {
                    c24 = '!';
                    break;
                }
                case 0: {
                    c24 = '`';
                    break;
                }
                case 1: {
                    c24 = '\u0012';
                    break;
                }
                case 2: {
                    c24 = '@';
                    break;
                }
                case 3: {
                    c24 = '\u001d';
                    break;
                }
            }
            charArray12[n12] = (char)(c24 ^ c23);
        }
        z2[11] = new String(charArray12).intern();
        final char[] charArray13 = "4K\u0010X~3F\u0012To'".toCharArray();
        for (int length9 = charArray13.length, n13 = 0; length9 > n13; ++n13) {
            final char c25 = charArray13[n13];
            char c26 = '\0';
            switch (n13 % 5) {
                default: {
                    c26 = '!';
                    break;
                }
                case 0: {
                    c26 = '`';
                    break;
                }
                case 1: {
                    c26 = '\u0012';
                    break;
                }
                case 2: {
                    c26 = '@';
                    break;
                }
                case 3: {
                    c26 = '\u001d';
                    break;
                }
            }
            charArray13[n13] = (char)(c26 ^ c25);
        }
        z2[12] = new String(charArray13).intern();
        final char[] charArray14 = "4K\u0010X~5[\u000eI\u0012R".toCharArray();
        for (int length10 = charArray14.length, n14 = 0; length10 > n14; ++n14) {
            final char c27 = charArray14[n14];
            char c28 = '\0';
            switch (n14 % 5) {
                default: {
                    c28 = '!';
                    break;
                }
                case 0: {
                    c28 = '`';
                    break;
                }
                case 1: {
                    c28 = '\u0012';
                    break;
                }
                case 2: {
                    c28 = '@';
                    break;
                }
                case 3: {
                    c28 = '\u001d';
                    break;
                }
            }
            charArray14[n14] = (char)(c28 ^ c27);
        }
        z2[13] = new String(charArray14).intern();
        final char[] charArray15 = "4K\u0010X~3T\tEd$$t".toCharArray();
        for (int length11 = charArray15.length, n15 = 0; length11 > n15; ++n15) {
            final char c29 = charArray15[n15];
            char c30 = '\0';
            switch (n15 % 5) {
                default: {
                    c30 = '!';
                    break;
                }
                case 0: {
                    c30 = '`';
                    break;
                }
                case 1: {
                    c30 = '\u0012';
                    break;
                }
                case 2: {
                    c30 = '@';
                    break;
                }
                case 3: {
                    c30 = '\u001d';
                    break;
                }
            }
            charArray15[n15] = (char)(c30 ^ c29);
        }
        z2[14] = new String(charArray15).intern();
        final char[] charArray16 = "4K\u0010X~5[\u000eI\u0017T".toCharArray();
        for (int length12 = charArray16.length, n16 = 0; length12 > n16; ++n16) {
            final char c31 = charArray16[n16];
            char c32 = '\0';
            switch (n16 % 5) {
                default: {
                    c32 = '!';
                    break;
                }
                case 0: {
                    c32 = '`';
                    break;
                }
                case 1: {
                    c32 = '\u0012';
                    break;
                }
                case 2: {
                    c32 = '@';
                    break;
                }
                case 3: {
                    c32 = '\u001d';
                    break;
                }
            }
            charArray16[n16] = (char)(c32 ^ c31);
        }
        z2[15] = new String(charArray16).intern();
        final char[] charArray17 = "4K\u0010X~'@\u000fHq".toCharArray();
        for (int length13 = charArray17.length, n17 = 0; length13 > n17; ++n17) {
            final char c33 = charArray17[n17];
            char c34 = '\0';
            switch (n17 % 5) {
                default: {
                    c34 = '!';
                    break;
                }
                case 0: {
                    c34 = '`';
                    break;
                }
                case 1: {
                    c34 = '\u0012';
                    break;
                }
                case 2: {
                    c34 = '@';
                    break;
                }
                case 3: {
                    c34 = '\u001d';
                    break;
                }
            }
            charArray17[n17] = (char)(c34 ^ c33);
        }
        z2[16] = new String(charArray17).intern();
        final char[] charArray18 = "4K\u0010X~3T\tEd$!r".toCharArray();
        for (int length14 = charArray18.length, n18 = 0; length14 > n18; ++n18) {
            final char c35 = charArray18[n18];
            char c36 = '\0';
            switch (n18 % 5) {
                default: {
                    c36 = '!';
                    break;
                }
                case 0: {
                    c36 = '`';
                    break;
                }
                case 1: {
                    c36 = '\u0012';
                    break;
                }
                case 2: {
                    c36 = '@';
                    break;
                }
                case 3: {
                    c36 = '\u001d';
                    break;
                }
            }
            charArray18[n18] = (char)(c36 ^ c35);
        }
        z2[17] = new String(charArray18).intern();
        final char[] charArray19 = "4K\u0010X~&[\u0018XeS ".toCharArray();
        for (int length15 = charArray19.length, n19 = 0; length15 > n19; ++n19) {
            final char c37 = charArray19[n19];
            char c38 = '\0';
            switch (n19 % 5) {
                default: {
                    c38 = '!';
                    break;
                }
                case 0: {
                    c38 = '`';
                    break;
                }
                case 1: {
                    c38 = '\u0012';
                    break;
                }
                case 2: {
                    c38 = '@';
                    break;
                }
                case 3: {
                    c38 = '\u001d';
                    break;
                }
            }
            charArray19[n19] = (char)(c38 ^ c37);
        }
        z2[18] = new String(charArray19).intern();
        z = z2;
        TYPE_DOUBLE = new d1(d1.z[2], 0, 0, 1);
        TYPE_FLOAT = new d1(d1.z[10], 1, 1, 2);
        TYPE_INT64 = new d1(d1.z[8], 2, 2, 3);
        TYPE_UINT64 = new d1(d1.z[15], 3, 3, 4);
        TYPE_INT32 = new d1(d1.z[11], 4, 4, 5);
        TYPE_FIXED64 = new d1(d1.z[4], 5, 5, 6);
        TYPE_FIXED32 = new d1(d1.z[18], 6, 6, 7);
        TYPE_BOOL = new d1(d1.z[9], 7, 7, 8);
        TYPE_STRING = new d1(d1.z[12], 8, 8, 9);
        TYPE_GROUP = new d1(d1.z[16], 9, 9, 10);
        TYPE_MESSAGE = new d1(d1.z[3], 10, 10, 11);
        TYPE_BYTES = new d1(d1.z[5], 11, 11, 12);
        TYPE_UINT32 = new d1(d1.z[13], 12, 12, 13);
        TYPE_ENUM = new d1(d1.z[6], 13, 13, 14);
        TYPE_SFIXED32 = new d1(d1.z[17], 14, 14, 15);
        TYPE_SFIXED64 = new d1(d1.z[14], 15, 15, 16);
        TYPE_SINT32 = new d1(d1.z[1], 16, 16, 17);
        TYPE_SINT64 = new d1(d1.z[7], 17, 17, 18);
        a = new d1[] { d1.TYPE_DOUBLE, d1.TYPE_FLOAT, d1.TYPE_INT64, d1.TYPE_UINT64, d1.TYPE_INT32, d1.TYPE_FIXED64, d1.TYPE_FIXED32, d1.TYPE_BOOL, d1.TYPE_STRING, d1.TYPE_GROUP, d1.TYPE_MESSAGE, d1.TYPE_BYTES, d1.TYPE_UINT32, d1.TYPE_ENUM, d1.TYPE_SFIXED32, d1.TYPE_SFIXED64, d1.TYPE_SINT32, d1.TYPE_SINT64 };
        d1.c = new ak();
        e = values();
    }
    
    private d1(final String s, final int n, final int b, final int d) {
        this.b = b;
        this.d = d;
    }
    
    public static final E getDescriptor() {
        return dC.z().c().get(0);
    }
    
    public static dw internalGetValueMap() {
        return d1.c;
    }
    
    public static d1 valueOf(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 1: {
                try {
                    return d1.TYPE_DOUBLE;
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
            case 2: {
                return d1.TYPE_FLOAT;
            }
            case 3: {
                return d1.TYPE_INT64;
            }
            case 4: {
                return d1.TYPE_UINT64;
            }
            case 5: {
                return d1.TYPE_INT32;
            }
            case 6: {
                return d1.TYPE_FIXED64;
            }
            case 7: {
                return d1.TYPE_FIXED32;
            }
            case 8: {
                return d1.TYPE_BOOL;
            }
            case 9: {
                return d1.TYPE_STRING;
            }
            case 10: {
                return d1.TYPE_GROUP;
            }
            case 11: {
                return d1.TYPE_MESSAGE;
            }
            case 12: {
                return d1.TYPE_BYTES;
            }
            case 13: {
                return d1.TYPE_UINT32;
            }
            case 14: {
                return d1.TYPE_ENUM;
            }
            case 15: {
                return d1.TYPE_SFIXED32;
            }
            case 16: {
                return d1.TYPE_SFIXED64;
            }
            case 17: {
                return d1.TYPE_SINT32;
            }
            case 18: {
                return d1.TYPE_SINT64;
            }
        }
    }
    
    public static d1 valueOf(final dV dv) {
        try {
            if (dv.a() != getDescriptor()) {
                throw new IllegalArgumentException(d1.z[0]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return d1.e[dv.c()];
    }
    
    public final E getDescriptorForType() {
        return getDescriptor();
    }
    
    @Override
    public final int getNumber() {
        return this.d;
    }
    
    public final dV getValueDescriptor() {
        return getDescriptor().b().get(this.b);
    }
}
