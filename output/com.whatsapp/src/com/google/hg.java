// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class hg implements cH, Comparable, aK
{
    private static final el[] i;
    private static final String[] z;
    private final bl a;
    private bl b;
    private bl c;
    private E d;
    private Object e;
    private final by f;
    private final String g;
    private bq h;
    private final int j;
    private dC k;
    
    static {
        final String[] z2 = new String[32];
        final char[] charArray = " R\u0003AB\u0012S\u000f^\u0006TS\u0019\u0012\f\u001bNJ]\u0004TW\u000fA\u0011\u0015]\u000f\u0012\u0016\rJ\u000f\u001c".toCharArray();
        for (int j = charArray.length, n = 0; j > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'b';
                    break;
                }
                case 0: {
                    c2 = 't';
                    break;
                }
                case 1: {
                    c2 = ':';
                    break;
                }
                case 2: {
                    c2 = 'j';
                    break;
                }
                case 3: {
                    c2 = '2';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "2S\u000f^\u00060_\u0019Q\u0010\u001dJ\u001e]\u0010\u0007\u001a\tS\fTU\u0004^\u001bTX\u000f\u0012\u0001\u001bW\u001aS\u0010\u0011^JF\rTU\u001eZ\u0007\u0006\u001a,[\u0007\u0018^.W\u0011\u0017H\u0003B\u0016\u001bH\u0019\u0012\u0004\u001bHJT\u000b\u0011V\u000eAB\u001b\\JF\n\u0011\u001a\u0019S\u000f\u0011\u001a\u0007W\u0011\u0007[\rWB\u0000C\u001aWL".toCharArray();
        for (int k = charArray2.length, n2 = 0; k > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'b';
                    break;
                }
                case 0: {
                    c4 = 't';
                    break;
                }
                case 1: {
                    c4 = ':';
                    break;
                }
                case 2: {
                    c4 = 'j';
                    break;
                }
                case 3: {
                    c4 = '2';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "2S\u000f^\u00060_\u0019Q\u0010\u001dJ\u001e]\u0010Z]\u000fF&\u0011\\\u000bG\u000e\u0000l\u000b^\u0017\u0011\u0012C\u0012\u0001\u0015V\u0006W\u0006TU\u0004\u0012\u0003\u001a\u001a\u000f_\u0000\u0011^\u000eW\u0006TW\u000fA\u0011\u0015]\u000f\u0012\u0004\u001d_\u0006VL".toCharArray();
        for (int l = charArray3.length, n3 = 0; l > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = 'b';
                    break;
                }
                case 0: {
                    c6 = 't';
                    break;
                }
                case 1: {
                    c6 = ':';
                    break;
                }
                case 2: {
                    c6 = 'j';
                    break;
                }
                case 3: {
                    c6 = '2';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "/J\u000bQ\t\u0011^J\u000fB\u0000H\u001fW?TY\u000b\\B\u001bT\u0006KB\u0016_JA\u0012\u0011Y\u0003T\u000b\u0011^JT\r\u0006\u001a\u0018W\u0012\u0011[\u001eW\u0006TJ\u0018[\u000f\u001dN\u0003D\u0007T\\\u0003W\u000e\u0010ID".toCharArray();
        for (int length = charArray4.length, n4 = 0; length > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = 'b';
                    break;
                }
                case 0: {
                    c8 = 't';
                    break;
                }
                case 1: {
                    c8 = ':';
                    break;
                }
                case 2: {
                    c8 = 'j';
                    break;
                }
                case 3: {
                    c8 = '2';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "2S\u000f^\u0006TT\u001f_\u0000\u0011H\u0019\u0012\u000f\u0001I\u001e\u0012\u0000\u0011\u001a\u001a]\u0011\u001dN\u0003D\u0007TS\u0004F\u0007\u0013_\u0018AL".toCharArray();
        for (int length2 = charArray5.length, n5 = 0; length2 > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = 'b';
                    break;
                }
                case 0: {
                    c10 = 't';
                    break;
                }
                case 1: {
                    c10 = ':';
                    break;
                }
                case 2: {
                    c10 = 'j';
                    break;
                }
                case 3: {
                    c10 = '2';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "2S\u000f^\u00060_\u0019Q\u0010\u001dJ\u001e]\u0010$H\u0005F\rZ_\u0012F\u0007\u001a^\u000fWB\u001aU\u001e\u0012\u0011\u0011NJT\r\u0006\u001a\u000fJ\u0016\u0011T\u0019[\r\u001a\u001a\f[\u0007\u0018^D".toCharArray();
        for (int length3 = charArray6.length, n6 = 0; length3 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = 'b';
                    break;
                }
                case 0: {
                    c12 = 't';
                    break;
                }
                case 1: {
                    c12 = ':';
                    break;
                }
                case 2: {
                    c12 = 'j';
                    break;
                }
                case 3: {
                    c12 = '2';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "2S\u000f^\u00060_\u0019Q\u0010\u001dJ\u001e]\u0010$H\u0005F\rZ_\u0012F\u0007\u001a^\u000fWB\u0007_\u001e\u0012\u0004\u001bHJ\\\r\u001a\u0017\u000fJ\u0016\u0011T\u0019[\r\u001a\u001a\f[\u0007\u0018^D".toCharArray();
        for (int length4 = charArray7.length, n7 = 0; length4 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = 'b';
                    break;
                }
                case 0: {
                    c14 = 't';
                    break;
                }
                case 1: {
                    c14 = ':';
                    break;
                }
                case 2: {
                    c14 = 'j';
                    break;
                }
                case 3: {
                    c14 = '2';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        final char[] charArray8 = " R\u0003AB\u0012S\u000f^\u0006TS\u0019\u0012\f\u001bNJS\fT_\u0012F\u0007\u001aI\u0003]\fZ".toCharArray();
        for (int length5 = charArray8.length, n8 = 0; length5 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = 'b';
                    break;
                }
                case 0: {
                    c16 = 't';
                    break;
                }
                case 1: {
                    c16 = ':';
                    break;
                }
                case 2: {
                    c16 = 'j';
                    break;
                }
                case 3: {
                    c16 = '2';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[7] = new String(charArray8).intern();
        final char[] charArray9 = "\u001dT\f".toCharArray();
        for (int length6 = charArray9.length, n9 = 0; length6 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = 'b';
                    break;
                }
                case 0: {
                    c18 = 't';
                    break;
                }
                case 1: {
                    c18 = ':';
                    break;
                }
                case 2: {
                    c18 = 'j';
                    break;
                }
                case 3: {
                    c18 = '2';
                    break;
                }
            }
            charArray9[n9] = (char)(c18 ^ c17);
        }
        z2[8] = new String(charArray9).intern();
        final char[] charArray10 = "9_\u0019A\u0003\u0013_\u0019\u0012\u0001\u0015TMFB\u001c[\u001cWB\u0010_\fS\u0017\u0018NJD\u0003\u0018O\u000fAL".toCharArray();
        for (int length7 = charArray10.length, n10 = 0; length7 > n10; ++n10) {
            final char c19 = charArray10[n10];
            char c20 = '\0';
            switch (n10 % 5) {
                default: {
                    c20 = 'b';
                    break;
                }
                case 0: {
                    c20 = 't';
                    break;
                }
                case 1: {
                    c20 = ':';
                    break;
                }
                case 2: {
                    c20 = 'j';
                    break;
                }
                case 3: {
                    c20 = '2';
                    break;
                }
            }
            charArray10[n10] = (char)(c20 ^ c19);
        }
        z2[9] = new String(charArray10).intern();
        final char[] charArray11 = "7U\u001f^\u0006\u001a\u001d\u001e\u0012\u0012\u0015H\u0019WB\u0010_\fS\u0017\u0018NJD\u0003\u0018O\u000f\bB".toCharArray();
        for (int length8 = charArray11.length, n11 = 0; length8 > n11; ++n11) {
            final char c21 = charArray11[n11];
            char c22 = '\0';
            switch (n11 % 5) {
                default: {
                    c22 = 'b';
                    break;
                }
                case 0: {
                    c22 = 't';
                    break;
                }
                case 1: {
                    c22 = ':';
                    break;
                }
                case 2: {
                    c22 = 'j';
                    break;
                }
                case 3: {
                    c22 = '2';
                    break;
                }
            }
            charArray11[n11] = (char)(c22 ^ c21);
        }
        z2[10] = new String(charArray11).intern();
        final char[] charArray12 = "2S\u000f^\u0006TM\u0003F\nTJ\u0018[\u000f\u001dN\u0003D\u0007TN\u0013B\u0007TR\u000bAB\u0000C\u001aW=\u001a[\u0007WL".toCharArray();
        for (int length9 = charArray12.length, n12 = 0; length9 > n12; ++n12) {
            final char c23 = charArray12[n12];
            char c24 = '\0';
            switch (n12 % 5) {
                default: {
                    c24 = 'b';
                    break;
                }
                case 0: {
                    c24 = 't';
                    break;
                }
                case 1: {
                    c24 = ':';
                    break;
                }
                case 2: {
                    c24 = 'j';
                    break;
                }
                case 3: {
                    c24 = '2';
                    break;
                }
            }
            charArray12[n12] = (char)(c24 ^ c23);
        }
        z2[11] = new String(charArray12).intern();
        final char[] charArray13 = "V\u001a\u0003AB\u001aU\u001e\u0012\u0003TN\u0013B\u0007Z".toCharArray();
        for (int length10 = charArray13.length, n13 = 0; length10 > n13; ++n13) {
            final char c25 = charArray13[n13];
            char c26 = '\0';
            switch (n13 % 5) {
                default: {
                    c26 = 'b';
                    break;
                }
                case 0: {
                    c26 = 't';
                    break;
                }
                case 1: {
                    c26 = ':';
                    break;
                }
                case 2: {
                    c26 = 'j';
                    break;
                }
                case 3: {
                    c26 = '2';
                    break;
                }
            }
            charArray13[n13] = (char)(c26 ^ c25);
        }
        z2[12] = new String(charArray13).intern();
        final char[] charArray14 = "9_\u0019A\u0003\u0013_9W\u0016\u0007\u001a\tS\f\u001aU\u001e\u0012\n\u0015L\u000f\u0012\u0004\u001d_\u0006V\u0011X\u001a\u0005\\\u000e\r\u001a\u000fJ\u0016\u0011T\u0019[\r\u001aID".toCharArray();
        for (int length11 = charArray14.length, n14 = 0; length11 > n14; ++n14) {
            final char c27 = charArray14[n14];
            char c28 = '\0';
            switch (n14 % 5) {
                default: {
                    c28 = 'b';
                    break;
                }
                case 0: {
                    c28 = 't';
                    break;
                }
                case 1: {
                    c28 = ':';
                    break;
                }
                case 2: {
                    c28 = 'j';
                    break;
                }
                case 3: {
                    c28 = '2';
                    break;
                }
            }
            charArray14[n14] = (char)(c28 ^ c27);
        }
        z2[13] = new String(charArray14).intern();
        final char[] charArray15 = "T[\u0019\u0012\u0003\u001a\u001a\u000fJ\u0016\u0011T\u0019[\r\u001a\u001a\u0004G\u000f\u0016_\u0018\u001c".toCharArray();
        for (int length12 = charArray15.length, n15 = 0; length12 > n15; ++n15) {
            final char c29 = charArray15[n15];
            char c30 = '\0';
            switch (n15 % 5) {
                default: {
                    c30 = 'b';
                    break;
                }
                case 0: {
                    c30 = 't';
                    break;
                }
                case 1: {
                    c30 = ':';
                    break;
                }
                case 2: {
                    c30 = 'j';
                    break;
                }
                case 3: {
                    c30 = '2';
                    break;
                }
            }
            charArray15[n15] = (char)(c30 ^ c29);
        }
        z2[14] = new String(charArray15).intern();
        final char[] charArray16 = "7U\u001f^\u0006TT\u0005FB\u0004[\u0018A\u0007T^\u000fT\u0003\u0001V\u001e\u0012\u0014\u0015V\u001fWXT\u0018".toCharArray();
        for (int length13 = charArray16.length, n16 = 0; length13 > n16; ++n16) {
            final char c31 = charArray16[n16];
            char c32 = '\0';
            switch (n16 % 5) {
                default: {
                    c32 = 'b';
                    break;
                }
                case 0: {
                    c32 = 't';
                    break;
                }
                case 1: {
                    c32 = ':';
                    break;
                }
                case 2: {
                    c32 = 'j';
                    break;
                }
                case 3: {
                    c32 = '2';
                    break;
                }
            }
            charArray16[n16] = (char)(c32 ^ c31);
        }
        z2[15] = new String(charArray16).intern();
        final char[] charArray17 = "YS\u0004T".toCharArray();
        for (int length14 = charArray17.length, n17 = 0; length14 > n17; ++n17) {
            final char c33 = charArray17[n17];
            char c34 = '\0';
            switch (n17 % 5) {
                default: {
                    c34 = 'b';
                    break;
                }
                case 0: {
                    c34 = 't';
                    break;
                }
                case 1: {
                    c34 = ':';
                    break;
                }
                case 2: {
                    c34 = 'j';
                    break;
                }
                case 3: {
                    c34 = '2';
                    break;
                }
            }
            charArray17[n17] = (char)(c34 ^ c33);
        }
        z2[16] = new String(charArray17).intern();
        final char[] charArray18 = "1B\u001eW\f\u0007S\u0005\\\u0011TU\f\u0012/\u0011I\u0019S\u0005\u0011i\u000fF\u0011TW\u001fA\u0016TX\u000f\u0012\r\u0004N\u0003]\f\u0015VJ_\u0007\u0007I\u000bU\u0007\u0007\u0014".toCharArray();
        for (int length15 = charArray18.length, n18 = 0; length15 > n18; ++n18) {
            final char c35 = charArray18[n18];
            char c36 = '\0';
            switch (n18 % 5) {
                default: {
                    c36 = 'b';
                    break;
                }
                case 0: {
                    c36 = 't';
                    break;
                }
                case 1: {
                    c36 = ':';
                    break;
                }
                case 2: {
                    c36 = 'j';
                    break;
                }
                case 3: {
                    c36 = '2';
                    break;
                }
            }
            charArray18[n18] = (char)(c36 ^ c35);
        }
        z2[17] = new String(charArray18).intern();
        final char[] charArray19 = "V\u001a\u000e]\u0007\u0007\u001a\u0004]\u0016T^\u000fQ\u000e\u0015H\u000f\u0012".toCharArray();
        for (int length16 = charArray19.length, n19 = 0; length16 > n19; ++n19) {
            final char c37 = charArray19[n19];
            char c38 = '\0';
            switch (n19 % 5) {
                default: {
                    c38 = 'b';
                    break;
                }
                case 0: {
                    c38 = 't';
                    break;
                }
                case 1: {
                    c38 = ':';
                    break;
                }
                case 2: {
                    c38 = 'j';
                    break;
                }
                case 3: {
                    c38 = '2';
                    break;
                }
            }
            charArray19[n19] = (char)(c38 ^ c37);
        }
        z2[18] = new String(charArray19).intern();
        final char[] charArray20 = "!T\u0001\\\r\u0003TJW\f\u0001WJV\u0007\u0012[\u001f^\u0016TL\u000b^\u0017\u0011\u0000J\u0010".toCharArray();
        for (int length17 = charArray20.length, n20 = 0; length17 > n20; ++n20) {
            final char c39 = charArray20[n20];
            char c40 = '\0';
            switch (n20 % 5) {
                default: {
                    c40 = 'b';
                    break;
                }
                case 0: {
                    c40 = 't';
                    break;
                }
                case 1: {
                    c40 = ':';
                    break;
                }
                case 2: {
                    c40 = 'j';
                    break;
                }
                case 3: {
                    c40 = '2';
                    break;
                }
            }
            charArray20[n20] = (char)(c40 ^ c39);
        }
        z2[19] = new String(charArray20).intern();
        final char[] charArray21 = "2S\u000f^\u0006TM\u0003F\nTW\u000fA\u0011\u0015]\u000f\u0012\r\u0006\u001a\u000f\\\u0017\u0019\u001a\u001eK\u0012\u0011\u001a\u0007[\u0011\u0007S\u0004UB\u0000C\u001aW=\u001a[\u0007WL".toCharArray();
        for (int length18 = charArray21.length, n21 = 0; length18 > n21; ++n21) {
            final char c41 = charArray21[n21];
            char c42 = '\0';
            switch (n21 % 5) {
                default: {
                    c42 = 'b';
                    break;
                }
                case 0: {
                    c42 = 't';
                    break;
                }
                case 1: {
                    c42 = ':';
                    break;
                }
                case 2: {
                    c42 = 'j';
                    break;
                }
                case 3: {
                    c42 = '2';
                    break;
                }
            }
            charArray21[n21] = (char)(c42 ^ c41);
        }
        z2[20] = new String(charArray21).intern();
        final char[] charArray22 = "YS\u0004T".toCharArray();
        for (int length19 = charArray22.length, n22 = 0; length19 > n22; ++n22) {
            final char c43 = charArray22[n22];
            char c44 = '\0';
            switch (n22 % 5) {
                default: {
                    c44 = 'b';
                    break;
                }
                case 0: {
                    c44 = 't';
                    break;
                }
                case 1: {
                    c44 = ':';
                    break;
                }
                case 2: {
                    c44 = 'j';
                    break;
                }
                case 3: {
                    c44 = '2';
                    break;
                }
            }
            charArray22[n22] = (char)(c44 ^ c43);
        }
        z2[21] = new String(charArray22).intern();
        final char[] charArray23 = "V\u001a\u0003AB\u001aU\u001e\u0012\u0003\u001a\u001a\u000f\\\u0017\u0019\u001a\u001eK\u0012\u0011\u0014".toCharArray();
        for (int length20 = charArray23.length, n23 = 0; length20 > n23; ++n23) {
            final char c45 = charArray23[n23];
            char c46 = '\0';
            switch (n23 % 5) {
                default: {
                    c46 = 'b';
                    break;
                }
                case 0: {
                    c46 = 't';
                    break;
                }
                case 1: {
                    c46 = ':';
                    break;
                }
                case 2: {
                    c46 = 'j';
                    break;
                }
                case 3: {
                    c46 = '2';
                    break;
                }
            }
            charArray23[n23] = (char)(c46 ^ c45);
        }
        z2[22] = new String(charArray23).intern();
        final char[] charArray24 = "V\u001a\u0003AB\u001aU\u001e\u0012\u0003TW\u000fA\u0011\u0015]\u000f\u0012\u0016\rJ\u000f\u001c".toCharArray();
        for (int length21 = charArray24.length, n24 = 0; length21 > n24; ++n24) {
            final char c47 = charArray24[n24];
            char c48 = '\0';
            switch (n24 % 5) {
                default: {
                    c48 = 'b';
                    break;
                }
                case 0: {
                    c48 = 't';
                    break;
                }
                case 1: {
                    c48 = ':';
                    break;
                }
                case 2: {
                    c48 = 'j';
                    break;
                }
                case 3: {
                    c48 = '2';
                    break;
                }
            }
            charArray24[n24] = (char)(c48 ^ c47);
        }
        z2[23] = new String(charArray24).intern();
        final char[] charArray25 = "V\u001a\u0003AB\u001aU\u001e\u0012\u0003TW\u000fA\u0011\u0015]\u000f\u0012\u0016\rJ\u000f\u001c".toCharArray();
        for (int length22 = charArray25.length, n25 = 0; length22 > n25; ++n25) {
            final char c49 = charArray25[n25];
            char c50 = '\0';
            switch (n25 % 5) {
                default: {
                    c50 = 'b';
                    break;
                }
                case 0: {
                    c50 = 't';
                    break;
                }
                case 1: {
                    c50 = ':';
                    break;
                }
                case 2: {
                    c50 = 'j';
                    break;
                }
                case 3: {
                    c50 = '2';
                    break;
                }
            }
            charArray25[n25] = (char)(c50 ^ c49);
        }
        z2[24] = new String(charArray25).intern();
        final char[] charArray26 = "9_\u0019A\u0003\u0013_JF\u001b\u0004_JZ\u0003\u0010\u001a\u000eW\u0004\u0015O\u0006FB\u0002[\u0006G\u0007Z".toCharArray();
        for (int length23 = charArray26.length, n26 = 0; length23 > n26; ++n26) {
            final char c51 = charArray26[n26];
            char c52 = '\0';
            switch (n26 % 5) {
                default: {
                    c52 = 'b';
                    break;
                }
                case 0: {
                    c52 = 't';
                    break;
                }
                case 1: {
                    c52 = ':';
                    break;
                }
                case 2: {
                    c52 = 'j';
                    break;
                }
                case 3: {
                    c52 = '2';
                    break;
                }
            }
            charArray26[n26] = (char)(c52 ^ c51);
        }
        z2[25] = new String(charArray26).intern();
        final char[] charArray27 = "&_\u001aW\u0003\u0000_\u000e\u0012\u0004\u001d_\u0006V\u0011TY\u000b\\\f\u001bNJZ\u0003\u0002_JV\u0007\u0012[\u001f^\u0016TL\u000b^\u0017\u0011ID".toCharArray();
        for (int length24 = charArray27.length, n27 = 0; length24 > n27; ++n27) {
            final char c53 = charArray27[n27];
            char c54 = '\0';
            switch (n27 % 5) {
                default: {
                    c54 = 'b';
                    break;
                }
                case 0: {
                    c54 = 't';
                    break;
                }
                case 1: {
                    c54 = ':';
                    break;
                }
                case 2: {
                    c54 = 'j';
                    break;
                }
                case 3: {
                    c54 = '2';
                    break;
                }
            }
            charArray27[n27] = (char)(c54 ^ c53);
        }
        z2[26] = new String(charArray27).intern();
        final char[] charArray28 = "\u001dT\f".toCharArray();
        for (int length25 = charArray28.length, n28 = 0; length25 > n28; ++n28) {
            final char c55 = charArray28[n28];
            char c56 = '\0';
            switch (n28 % 5) {
                default: {
                    c56 = 'b';
                    break;
                }
                case 0: {
                    c56 = 't';
                    break;
                }
                case 1: {
                    c56 = ':';
                    break;
                }
                case 2: {
                    c56 = 'j';
                    break;
                }
                case 3: {
                    c56 = '2';
                    break;
                }
            }
            charArray28[n28] = (char)(c56 ^ c55);
        }
        z2[27] = new String(charArray28).intern();
        final char[] charArray29 = "\u001a[\u0004".toCharArray();
        for (int length26 = charArray29.length, n29 = 0; length26 > n29; ++n29) {
            final char c57 = charArray29[n29];
            char c58 = '\0';
            switch (n29 % 5) {
                default: {
                    c58 = 'b';
                    break;
                }
                case 0: {
                    c58 = 't';
                    break;
                }
                case 1: {
                    c58 = ':';
                    break;
                }
                case 2: {
                    c58 = 'j';
                    break;
                }
                case 3: {
                    c58 = '2';
                    break;
                }
            }
            charArray29[n29] = (char)(c58 ^ c57);
        }
        z2[28] = new String(charArray29).intern();
        final char[] charArray30 = "\u001a[\u0004".toCharArray();
        for (int length27 = charArray30.length, n30 = 0; length27 > n30; ++n30) {
            final char c59 = charArray30[n30];
            char c60 = '\0';
            switch (n30 % 5) {
                default: {
                    c60 = 'b';
                    break;
                }
                case 0: {
                    c60 = 't';
                    break;
                }
                case 1: {
                    c60 = ':';
                    break;
                }
                case 2: {
                    c60 = 'j';
                    break;
                }
                case 3: {
                    c60 = '2';
                    break;
                }
            }
            charArray30[n30] = (char)(c60 ^ c59);
        }
        z2[29] = new String(charArray30).intern();
        final char[] charArray31 = " R\u0003AB\u0012S\u000f^\u0006TS\u0019\u0012\f\u001bNJ]\u0004T_\u0004G\u000fTN\u0013B\u0007Z".toCharArray();
        for (int length28 = charArray31.length, n31 = 0; length28 > n31; ++n31) {
            final char c61 = charArray31[n31];
            char c62 = '\0';
            switch (n31 % 5) {
                default: {
                    c62 = 'b';
                    break;
                }
                case 0: {
                    c62 = 't';
                    break;
                }
                case 1: {
                    c62 = ':';
                    break;
                }
                case 2: {
                    c62 = 'j';
                    break;
                }
                case 3: {
                    c62 = '2';
                    break;
                }
            }
            charArray31[n31] = (char)(c62 ^ c61);
        }
        z2[30] = new String(charArray31).intern();
        final char[] charArray32 = "\u0010_\u0019Q\u0010\u001dJ\u001e]\u0010ZJ\u0018]\u0016\u001b\u001a\u0002S\u0011T[J\\\u0007\u0003\u001a\u000eW\u0001\u0018[\u0018W\u0006TN\u0013B\u0007TX\u001fFB0_\u0019@\u0001\u001dJ\u001e]\u0010\u0007\u0014\u0000S\u0014\u0015\u001a\u001dS\u0011\u001a\u001d\u001e\u0012\u0017\u0004^\u000bF\u0007\u0010\u0014".toCharArray();
        for (int length29 = charArray32.length, n32 = 0; length29 > n32; ++n32) {
            final char c63 = charArray32[n32];
            char c64 = '\0';
            switch (n32 % 5) {
                default: {
                    c64 = 'b';
                    break;
                }
                case 0: {
                    c64 = 't';
                    break;
                }
                case 1: {
                    c64 = ':';
                    break;
                }
                case 2: {
                    c64 = 'j';
                    break;
                }
                case 3: {
                    c64 = '2';
                    break;
                }
            }
            charArray32[n32] = (char)(c64 ^ c63);
        }
        z2[31] = new String(charArray32).intern();
        z = z2;
        try {
            i = el.values();
            if (bq.values().length != d1.values().length) {
                throw new RuntimeException(hg.z[31]);
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
    }
    
    private hg(final dC k, final by f, final bl bl, final int j, final boolean b) {
        this.j = j;
        this.k = k;
        this.g = cl.b(f, bl, k.i());
        this.f = f;
        if (k.k()) {
            this.h = bq.valueOf(k.u());
        }
        try {
            if (this.c() <= 0) {
                throw new gG(this, hg.z[4], (bO)null);
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        try {
            if (k.y().m()) {
                try {
                    if (!this.j()) {
                        throw new gG(this, hg.z[3], (bO)null);
                    }
                }
                catch (UnsupportedOperationException ex2) {
                    throw ex2;
                }
            }
        }
        catch (UnsupportedOperationException ex3) {
            throw ex3;
        }
    Label_0170:
        while (true) {
            if (!b) {
                try {
                    if (k.x()) {
                        throw new gG(this, hg.z[6], (bO)null);
                    }
                }
                catch (UnsupportedOperationException ex4) {
                    throw ex4;
                }
                this.b = bl;
                this.a = null;
                break Label_0170;
            }
            try {
                if (!k.x()) {
                    throw new gG(this, hg.z[5], (bO)null);
                }
            }
            catch (UnsupportedOperationException ex5) {
                throw ex5;
            }
            while (true) {
                try {
                    this.b = null;
                    if (bl != null) {
                        this.a = bl;
                        by.a(f).d(this);
                        return;
                    }
                }
                catch (UnsupportedOperationException ex6) {
                    throw ex6;
                }
                this.a = null;
                continue Label_0170;
            }
            break;
        }
    }
    
    hg(final dC dc, final by by, final bl bl, final int n, final boolean b, final bO bo) {
        this(dc, by, bl, n, b);
    }
    
    private void a(final dC k) {
        this.k = k;
    }
    
    static void a(final hg hg, final dC dc) {
        hg.a(dc);
    }
    
    private void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/google/hg.k:Lcom/google/dC;
        //     4: invokevirtual   com/google/dC.x:()Z
        //     7: ifeq            178
        //    10: aload_0        
        //    11: getfield        com/google/hg.f:Lcom/google/by;
        //    14: invokestatic    com/google/by.a:(Lcom/google/by;)Lcom/google/b7;
        //    17: aload_0        
        //    18: getfield        com/google/hg.k:Lcom/google/dC;
        //    21: invokevirtual   com/google/dC.m:()Ljava/lang/String;
        //    24: aload_0        
        //    25: getstatic       com/google/ag.TYPES_ONLY:Lcom/google/ag;
        //    28: invokevirtual   com/google/b7.a:(Ljava/lang/String;Lcom/google/cH;Lcom/google/ag;)Lcom/google/cH;
        //    31: astore          44
        //    33: aload           44
        //    35: instanceof      Lcom/google/bl;
        //    38: ifne            90
        //    41: new             Lcom/google/gG;
        //    44: dup            
        //    45: aload_0        
        //    46: new             Ljava/lang/StringBuilder;
        //    49: dup            
        //    50: invokespecial   java/lang/StringBuilder.<init>:()V
        //    53: bipush          34
        //    55: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    58: aload_0        
        //    59: getfield        com/google/hg.k:Lcom/google/dC;
        //    62: invokevirtual   com/google/dC.m:()Ljava/lang/String;
        //    65: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    68: getstatic       com/google/hg.z:[Ljava/lang/String;
        //    71: bipush          23
        //    73: aaload         
        //    74: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    77: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    80: aconst_null    
        //    81: invokespecial   com/google/gG.<init>:(Lcom/google/cH;Ljava/lang/String;Lcom/google/bO;)V
        //    84: athrow         
        //    85: astore          45
        //    87: aload           45
        //    89: athrow         
        //    90: aload_0        
        //    91: aload           44
        //    93: checkcast       Lcom/google/bl;
        //    96: putfield        com/google/hg.b:Lcom/google/bl;
        //    99: aload_0        
        //   100: invokevirtual   com/google/hg.m:()Lcom/google/bl;
        //   103: aload_0        
        //   104: invokevirtual   com/google/hg.c:()I
        //   107: invokevirtual   com/google/bl.b:(I)Z
        //   110: ifne            178
        //   113: new             Lcom/google/gG;
        //   116: dup            
        //   117: aload_0        
        //   118: new             Ljava/lang/StringBuilder;
        //   121: dup            
        //   122: invokespecial   java/lang/StringBuilder.<init>:()V
        //   125: bipush          34
        //   127: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   130: aload_0        
        //   131: invokevirtual   com/google/hg.m:()Lcom/google/bl;
        //   134: invokevirtual   com/google/bl.a:()Ljava/lang/String;
        //   137: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   140: getstatic       com/google/hg.z:[Ljava/lang/String;
        //   143: bipush          18
        //   145: aaload         
        //   146: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   149: aload_0        
        //   150: invokevirtual   com/google/hg.c:()I
        //   153: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   156: getstatic       com/google/hg.z:[Ljava/lang/String;
        //   159: bipush          14
        //   161: aaload         
        //   162: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   165: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   168: aconst_null    
        //   169: invokespecial   com/google/gG.<init>:(Lcom/google/cH;Ljava/lang/String;Lcom/google/bO;)V
        //   172: athrow         
        //   173: astore          46
        //   175: aload           46
        //   177: athrow         
        //   178: aload_0        
        //   179: getfield        com/google/hg.k:Lcom/google/dC;
        //   182: invokevirtual   com/google/dC.e:()Z
        //   185: ifeq            576
        //   188: aload_0        
        //   189: getfield        com/google/hg.f:Lcom/google/by;
        //   192: invokestatic    com/google/by.a:(Lcom/google/by;)Lcom/google/b7;
        //   195: aload_0        
        //   196: getfield        com/google/hg.k:Lcom/google/dC;
        //   199: invokevirtual   com/google/dC.o:()Ljava/lang/String;
        //   202: aload_0        
        //   203: getstatic       com/google/ag.TYPES_ONLY:Lcom/google/ag;
        //   206: invokevirtual   com/google/b7.a:(Ljava/lang/String;Lcom/google/cH;Lcom/google/ag;)Lcom/google/cH;
        //   209: astore          32
        //   211: aload_0        
        //   212: getfield        com/google/hg.k:Lcom/google/dC;
        //   215: invokevirtual   com/google/dC.k:()Z
        //   218: ifne            240
        //   221: aload           32
        //   223: instanceof      Lcom/google/bl;
        //   226: istore          42
        //   228: iload           42
        //   230: ifeq            321
        //   233: aload_0        
        //   234: getstatic       com/google/bq.MESSAGE:Lcom/google/bq;
        //   237: putfield        com/google/hg.h:Lcom/google/bq;
        //   240: aload_0        
        //   241: invokevirtual   com/google/hg.n:()Lcom/google/hD;
        //   244: getstatic       com/google/hD.MESSAGE:Lcom/google/hD;
        //   247: if_acmpne       433
        //   250: aload           32
        //   252: instanceof      Lcom/google/bl;
        //   255: istore          40
        //   257: iload           40
        //   259: ifne            393
        //   262: new             Lcom/google/gG;
        //   265: dup            
        //   266: aload_0        
        //   267: new             Ljava/lang/StringBuilder;
        //   270: dup            
        //   271: invokespecial   java/lang/StringBuilder.<init>:()V
        //   274: bipush          34
        //   276: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   279: aload_0        
        //   280: getfield        com/google/hg.k:Lcom/google/dC;
        //   283: invokevirtual   com/google/dC.o:()Ljava/lang/String;
        //   286: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   289: getstatic       com/google/hg.z:[Ljava/lang/String;
        //   292: bipush          24
        //   294: aaload         
        //   295: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   298: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   301: aconst_null    
        //   302: invokespecial   com/google/gG.<init>:(Lcom/google/cH;Ljava/lang/String;Lcom/google/bO;)V
        //   305: athrow         
        //   306: astore          36
        //   308: aload           36
        //   310: athrow         
        //   311: astore          33
        //   313: aload           33
        //   315: athrow         
        //   316: astore          34
        //   318: aload           34
        //   320: athrow         
        //   321: aload           32
        //   323: instanceof      Lcom/google/E;
        //   326: ifeq            344
        //   329: aload_0        
        //   330: getstatic       com/google/bq.ENUM:Lcom/google/bq;
        //   333: putfield        com/google/hg.h:Lcom/google/bq;
        //   336: goto            240
        //   339: astore          43
        //   341: aload           43
        //   343: athrow         
        //   344: new             Lcom/google/gG;
        //   347: dup            
        //   348: aload_0        
        //   349: new             Ljava/lang/StringBuilder;
        //   352: dup            
        //   353: invokespecial   java/lang/StringBuilder.<init>:()V
        //   356: bipush          34
        //   358: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   361: aload_0        
        //   362: getfield        com/google/hg.k:Lcom/google/dC;
        //   365: invokevirtual   com/google/dC.o:()Ljava/lang/String;
        //   368: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   371: getstatic       com/google/hg.z:[Ljava/lang/String;
        //   374: bipush          12
        //   376: aaload         
        //   377: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   380: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   383: aconst_null    
        //   384: invokespecial   com/google/gG.<init>:(Lcom/google/cH;Ljava/lang/String;Lcom/google/bO;)V
        //   387: athrow         
        //   388: astore          35
        //   390: aload           35
        //   392: athrow         
        //   393: aload_0        
        //   394: aload           32
        //   396: checkcast       Lcom/google/bl;
        //   399: putfield        com/google/hg.c:Lcom/google/bl;
        //   402: aload_0        
        //   403: getfield        com/google/hg.k:Lcom/google/dC;
        //   406: invokevirtual   com/google/dC.v:()Z
        //   409: ifeq            518
        //   412: new             Lcom/google/gG;
        //   415: dup            
        //   416: aload_0        
        //   417: getstatic       com/google/hg.z:[Ljava/lang/String;
        //   420: bipush          9
        //   422: aaload         
        //   423: aconst_null    
        //   424: invokespecial   com/google/gG.<init>:(Lcom/google/cH;Ljava/lang/String;Lcom/google/bO;)V
        //   427: athrow         
        //   428: astore          41
        //   430: aload           41
        //   432: athrow         
        //   433: aload_0        
        //   434: invokevirtual   com/google/hg.n:()Lcom/google/hD;
        //   437: getstatic       com/google/hD.ENUM:Lcom/google/hD;
        //   440: if_acmpne       560
        //   443: aload           32
        //   445: instanceof      Lcom/google/E;
        //   448: istore          39
        //   450: iload           39
        //   452: ifne            509
        //   455: new             Lcom/google/gG;
        //   458: dup            
        //   459: aload_0        
        //   460: new             Ljava/lang/StringBuilder;
        //   463: dup            
        //   464: invokespecial   java/lang/StringBuilder.<init>:()V
        //   467: bipush          34
        //   469: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   472: aload_0        
        //   473: getfield        com/google/hg.k:Lcom/google/dC;
        //   476: invokevirtual   com/google/dC.o:()Ljava/lang/String;
        //   479: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   482: getstatic       com/google/hg.z:[Ljava/lang/String;
        //   485: bipush          22
        //   487: aaload         
        //   488: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   491: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   494: aconst_null    
        //   495: invokespecial   com/google/gG.<init>:(Lcom/google/cH;Ljava/lang/String;Lcom/google/bO;)V
        //   498: athrow         
        //   499: astore          38
        //   501: aload           38
        //   503: athrow         
        //   504: astore          37
        //   506: aload           37
        //   508: athrow         
        //   509: aload_0        
        //   510: aload           32
        //   512: checkcast       Lcom/google/E;
        //   515: putfield        com/google/hg.d:Lcom/google/E;
        //   518: aload_0        
        //   519: getfield        com/google/hg.k:Lcom/google/dC;
        //   522: invokevirtual   com/google/dC.v:()Z
        //   525: ifeq            1399
        //   528: aload_0        
        //   529: invokevirtual   com/google/hg.b:()Z
        //   532: istore          20
        //   534: iload           20
        //   536: ifeq            629
        //   539: new             Lcom/google/gG;
        //   542: dup            
        //   543: aload_0        
        //   544: getstatic       com/google/hg.z:[Ljava/lang/String;
        //   547: bipush          26
        //   549: aaload         
        //   550: aconst_null    
        //   551: invokespecial   com/google/gG.<init>:(Lcom/google/cH;Ljava/lang/String;Lcom/google/bO;)V
        //   554: athrow         
        //   555: astore          6
        //   557: aload           6
        //   559: athrow         
        //   560: new             Lcom/google/gG;
        //   563: dup            
        //   564: aload_0        
        //   565: getstatic       com/google/hg.z:[Ljava/lang/String;
        //   568: bipush          11
        //   570: aaload         
        //   571: aconst_null    
        //   572: invokespecial   com/google/gG.<init>:(Lcom/google/cH;Ljava/lang/String;Lcom/google/bO;)V
        //   575: athrow         
        //   576: aload_0        
        //   577: invokevirtual   com/google/hg.n:()Lcom/google/hD;
        //   580: getstatic       com/google/hD.MESSAGE:Lcom/google/hD;
        //   583: if_acmpeq       602
        //   586: aload_0        
        //   587: invokevirtual   com/google/hg.n:()Lcom/google/hD;
        //   590: astore_3       
        //   591: getstatic       com/google/hD.ENUM:Lcom/google/hD;
        //   594: astore          4
        //   596: aload_3        
        //   597: aload           4
        //   599: if_acmpne       518
        //   602: new             Lcom/google/gG;
        //   605: dup            
        //   606: aload_0        
        //   607: getstatic       com/google/hg.z:[Ljava/lang/String;
        //   610: bipush          20
        //   612: aaload         
        //   613: aconst_null    
        //   614: invokespecial   com/google/gG.<init>:(Lcom/google/cH;Ljava/lang/String;Lcom/google/bO;)V
        //   617: athrow         
        //   618: astore_2       
        //   619: aload_2        
        //   620: athrow         
        //   621: astore_1       
        //   622: aload_1        
        //   623: athrow         
        //   624: astore          5
        //   626: aload           5
        //   628: athrow         
        //   629: getstatic       com/google/bO.b:[I
        //   632: aload_0        
        //   633: invokevirtual   com/google/hg.d:()Lcom/google/bq;
        //   636: invokevirtual   com/google/bq.ordinal:()I
        //   639: iaload         
        //   640: istore          23
        //   642: iload           23
        //   644: tableswitch {
        //                2: 831
        //                3: 831
        //                4: 831
        //                5: 904
        //                6: 904
        //                7: 924
        //                8: 924
        //                9: 924
        //               10: 944
        //               11: 944
        //               12: 964
        //               13: 1092
        //               14: 1220
        //               15: 1237
        //               16: 1251
        //               17: 1309
        //               18: 1383
        //               19: 1383
        //          default: 732
        //        }
        //   732: aload_0        
        //   733: invokevirtual   com/google/hg.e:()Z
        //   736: ifne            750
        //   739: aload_0        
        //   740: getfield        com/google/hg.f:Lcom/google/by;
        //   743: invokestatic    com/google/by.a:(Lcom/google/by;)Lcom/google/b7;
        //   746: aload_0        
        //   747: invokevirtual   com/google/b7.a:(Lcom/google/hg;)V
        //   750: aload_0        
        //   751: getfield        com/google/hg.b:Lcom/google/bl;
        //   754: astore          16
        //   756: aload           16
        //   758: ifnull          1548
        //   761: aload_0        
        //   762: getfield        com/google/hg.b:Lcom/google/bl;
        //   765: invokevirtual   com/google/bl.e:()Lcom/google/d_;
        //   768: invokevirtual   com/google/d_.a:()Z
        //   771: istore          17
        //   773: iload           17
        //   775: ifeq            1548
        //   778: aload_0        
        //   779: invokevirtual   com/google/hg.e:()Z
        //   782: istore          18
        //   784: iload           18
        //   786: ifeq            1532
        //   789: aload_0        
        //   790: invokevirtual   com/google/hg.g:()Z
        //   793: istore          19
        //   795: iload           19
        //   797: ifeq            810
        //   800: aload_0        
        //   801: invokevirtual   com/google/hg.d:()Lcom/google/bq;
        //   804: getstatic       com/google/bq.MESSAGE:Lcom/google/bq;
        //   807: if_acmpeq       1548
        //   810: new             Lcom/google/gG;
        //   813: dup            
        //   814: aload_0        
        //   815: getstatic       com/google/hg.z:[Ljava/lang/String;
        //   818: bipush          17
        //   820: aaload         
        //   821: aconst_null    
        //   822: invokespecial   com/google/gG.<init>:(Lcom/google/cH;Ljava/lang/String;Lcom/google/bO;)V
        //   825: athrow         
        //   826: astore          15
        //   828: aload           15
        //   830: athrow         
        //   831: aload_0        
        //   832: aload_0        
        //   833: getfield        com/google/hg.k:Lcom/google/dC;
        //   836: invokevirtual   com/google/dC.c:()Ljava/lang/String;
        //   839: invokestatic    com/google/a.b:(Ljava/lang/String;)I
        //   842: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   845: putfield        com/google/hg.e:Ljava/lang/Object;
        //   848: goto            732
        //   851: astore          22
        //   853: aload           22
        //   855: athrow         
        //   856: astore          21
        //   858: new             Lcom/google/gG;
        //   861: dup            
        //   862: aload_0        
        //   863: new             Ljava/lang/StringBuilder;
        //   866: dup            
        //   867: invokespecial   java/lang/StringBuilder.<init>:()V
        //   870: getstatic       com/google/hg.z:[Ljava/lang/String;
        //   873: bipush          15
        //   875: aaload         
        //   876: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   879: aload_0        
        //   880: getfield        com/google/hg.k:Lcom/google/dC;
        //   883: invokevirtual   com/google/dC.c:()Ljava/lang/String;
        //   886: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   889: bipush          34
        //   891: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   894: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   897: aload           21
        //   899: aconst_null    
        //   900: invokespecial   com/google/gG.<init>:(Lcom/google/cH;Ljava/lang/String;Ljava/lang/Throwable;Lcom/google/bO;)V
        //   903: athrow         
        //   904: aload_0        
        //   905: aload_0        
        //   906: getfield        com/google/hg.k:Lcom/google/dC;
        //   909: invokevirtual   com/google/dC.c:()Ljava/lang/String;
        //   912: invokestatic    com/google/a.c:(Ljava/lang/String;)I
        //   915: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   918: putfield        com/google/hg.e:Ljava/lang/Object;
        //   921: goto            732
        //   924: aload_0        
        //   925: aload_0        
        //   926: getfield        com/google/hg.k:Lcom/google/dC;
        //   929: invokevirtual   com/google/dC.c:()Ljava/lang/String;
        //   932: invokestatic    com/google/a.e:(Ljava/lang/String;)J
        //   935: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   938: putfield        com/google/hg.e:Ljava/lang/Object;
        //   941: goto            732
        //   944: aload_0        
        //   945: aload_0        
        //   946: getfield        com/google/hg.k:Lcom/google/dC;
        //   949: invokevirtual   com/google/dC.c:()Ljava/lang/String;
        //   952: invokestatic    com/google/a.d:(Ljava/lang/String;)J
        //   955: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   958: putfield        com/google/hg.e:Ljava/lang/Object;
        //   961: goto            732
        //   964: aload_0        
        //   965: getfield        com/google/hg.k:Lcom/google/dC;
        //   968: invokevirtual   com/google/dC.c:()Ljava/lang/String;
        //   971: getstatic       com/google/hg.z:[Ljava/lang/String;
        //   974: bipush          8
        //   976: aaload         
        //   977: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   980: ifeq            1001
        //   983: aload_0        
        //   984: ldc_w           Infinity
        //   987: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   990: putfield        com/google/hg.e:Ljava/lang/Object;
        //   993: goto            732
        //   996: astore          29
        //   998: aload           29
        //  1000: athrow         
        //  1001: aload_0        
        //  1002: getfield        com/google/hg.k:Lcom/google/dC;
        //  1005: invokevirtual   com/google/dC.c:()Ljava/lang/String;
        //  1008: getstatic       com/google/hg.z:[Ljava/lang/String;
        //  1011: bipush          16
        //  1013: aaload         
        //  1014: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1017: ifeq            1038
        //  1020: aload_0        
        //  1021: ldc_w           -Infinity
        //  1024: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  1027: putfield        com/google/hg.e:Ljava/lang/Object;
        //  1030: goto            732
        //  1033: astore          30
        //  1035: aload           30
        //  1037: athrow         
        //  1038: aload_0        
        //  1039: getfield        com/google/hg.k:Lcom/google/dC;
        //  1042: invokevirtual   com/google/dC.c:()Ljava/lang/String;
        //  1045: getstatic       com/google/hg.z:[Ljava/lang/String;
        //  1048: bipush          29
        //  1050: aaload         
        //  1051: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1054: ifeq            1075
        //  1057: aload_0        
        //  1058: ldc_w           NaN
        //  1061: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  1064: putfield        com/google/hg.e:Ljava/lang/Object;
        //  1067: goto            732
        //  1070: astore          31
        //  1072: aload           31
        //  1074: athrow         
        //  1075: aload_0        
        //  1076: aload_0        
        //  1077: getfield        com/google/hg.k:Lcom/google/dC;
        //  1080: invokevirtual   com/google/dC.c:()Ljava/lang/String;
        //  1083: invokestatic    java/lang/Float.valueOf:(Ljava/lang/String;)Ljava/lang/Float;
        //  1086: putfield        com/google/hg.e:Ljava/lang/Object;
        //  1089: goto            732
        //  1092: aload_0        
        //  1093: getfield        com/google/hg.k:Lcom/google/dC;
        //  1096: invokevirtual   com/google/dC.c:()Ljava/lang/String;
        //  1099: getstatic       com/google/hg.z:[Ljava/lang/String;
        //  1102: bipush          27
        //  1104: aaload         
        //  1105: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1108: ifeq            1129
        //  1111: aload_0        
        //  1112: ldc2_w          Infinity
        //  1115: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  1118: putfield        com/google/hg.e:Ljava/lang/Object;
        //  1121: goto            732
        //  1124: astore          26
        //  1126: aload           26
        //  1128: athrow         
        //  1129: aload_0        
        //  1130: getfield        com/google/hg.k:Lcom/google/dC;
        //  1133: invokevirtual   com/google/dC.c:()Ljava/lang/String;
        //  1136: getstatic       com/google/hg.z:[Ljava/lang/String;
        //  1139: bipush          21
        //  1141: aaload         
        //  1142: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1145: ifeq            1166
        //  1148: aload_0        
        //  1149: ldc2_w          -Infinity
        //  1152: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  1155: putfield        com/google/hg.e:Ljava/lang/Object;
        //  1158: goto            732
        //  1161: astore          27
        //  1163: aload           27
        //  1165: athrow         
        //  1166: aload_0        
        //  1167: getfield        com/google/hg.k:Lcom/google/dC;
        //  1170: invokevirtual   com/google/dC.c:()Ljava/lang/String;
        //  1173: getstatic       com/google/hg.z:[Ljava/lang/String;
        //  1176: bipush          28
        //  1178: aaload         
        //  1179: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1182: ifeq            1203
        //  1185: aload_0        
        //  1186: ldc2_w          NaN
        //  1189: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  1192: putfield        com/google/hg.e:Ljava/lang/Object;
        //  1195: goto            732
        //  1198: astore          28
        //  1200: aload           28
        //  1202: athrow         
        //  1203: aload_0        
        //  1204: aload_0        
        //  1205: getfield        com/google/hg.k:Lcom/google/dC;
        //  1208: invokevirtual   com/google/dC.c:()Ljava/lang/String;
        //  1211: invokestatic    java/lang/Double.valueOf:(Ljava/lang/String;)Ljava/lang/Double;
        //  1214: putfield        com/google/hg.e:Ljava/lang/Object;
        //  1217: goto            732
        //  1220: aload_0        
        //  1221: aload_0        
        //  1222: getfield        com/google/hg.k:Lcom/google/dC;
        //  1225: invokevirtual   com/google/dC.c:()Ljava/lang/String;
        //  1228: invokestatic    java/lang/Boolean.valueOf:(Ljava/lang/String;)Ljava/lang/Boolean;
        //  1231: putfield        com/google/hg.e:Ljava/lang/Object;
        //  1234: goto            732
        //  1237: aload_0        
        //  1238: aload_0        
        //  1239: getfield        com/google/hg.k:Lcom/google/dC;
        //  1242: invokevirtual   com/google/dC.c:()Ljava/lang/String;
        //  1245: putfield        com/google/hg.e:Ljava/lang/Object;
        //  1248: goto            732
        //  1251: aload_0        
        //  1252: aload_0        
        //  1253: getfield        com/google/hg.k:Lcom/google/dC;
        //  1256: invokevirtual   com/google/dC.c:()Ljava/lang/String;
        //  1259: invokestatic    com/google/a.a:(Ljava/lang/CharSequence;)Lcom/google/hv;
        //  1262: putfield        com/google/hg.e:Ljava/lang/Object;
        //  1265: goto            732
        //  1268: astore          25
        //  1270: new             Lcom/google/gG;
        //  1273: dup            
        //  1274: aload_0        
        //  1275: new             Ljava/lang/StringBuilder;
        //  1278: dup            
        //  1279: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1282: getstatic       com/google/hg.z:[Ljava/lang/String;
        //  1285: bipush          10
        //  1287: aaload         
        //  1288: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1291: aload           25
        //  1293: invokevirtual   com/google/fR.getMessage:()Ljava/lang/String;
        //  1296: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1299: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1302: aload           25
        //  1304: aconst_null    
        //  1305: invokespecial   com/google/gG.<init>:(Lcom/google/cH;Ljava/lang/String;Ljava/lang/Throwable;Lcom/google/bO;)V
        //  1308: athrow         
        //  1309: aload_0        
        //  1310: aload_0        
        //  1311: getfield        com/google/hg.d:Lcom/google/E;
        //  1314: aload_0        
        //  1315: getfield        com/google/hg.k:Lcom/google/dC;
        //  1318: invokevirtual   com/google/dC.c:()Ljava/lang/String;
        //  1321: invokevirtual   com/google/E.a:(Ljava/lang/String;)Lcom/google/dV;
        //  1324: putfield        com/google/hg.e:Ljava/lang/Object;
        //  1327: aload_0        
        //  1328: getfield        com/google/hg.e:Ljava/lang/Object;
        //  1331: ifnonnull       732
        //  1334: new             Lcom/google/gG;
        //  1337: dup            
        //  1338: aload_0        
        //  1339: new             Ljava/lang/StringBuilder;
        //  1342: dup            
        //  1343: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1346: getstatic       com/google/hg.z:[Ljava/lang/String;
        //  1349: bipush          19
        //  1351: aaload         
        //  1352: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1355: aload_0        
        //  1356: getfield        com/google/hg.k:Lcom/google/dC;
        //  1359: invokevirtual   com/google/dC.c:()Ljava/lang/String;
        //  1362: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1365: bipush          34
        //  1367: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //  1370: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1373: aconst_null    
        //  1374: invokespecial   com/google/gG.<init>:(Lcom/google/cH;Ljava/lang/String;Lcom/google/bO;)V
        //  1377: athrow         
        //  1378: astore          24
        //  1380: aload           24
        //  1382: athrow         
        //  1383: new             Lcom/google/gG;
        //  1386: dup            
        //  1387: aload_0        
        //  1388: getstatic       com/google/hg.z:[Ljava/lang/String;
        //  1391: bipush          25
        //  1393: aaload         
        //  1394: aconst_null    
        //  1395: invokespecial   com/google/gG.<init>:(Lcom/google/cH;Ljava/lang/String;Lcom/google/bO;)V
        //  1398: athrow         
        //  1399: aload_0        
        //  1400: invokevirtual   com/google/hg.b:()Z
        //  1403: ifeq            1421
        //  1406: aload_0        
        //  1407: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //  1410: putfield        com/google/hg.e:Ljava/lang/Object;
        //  1413: goto            732
        //  1416: astore          7
        //  1418: aload           7
        //  1420: athrow         
        //  1421: getstatic       com/google/bO.a:[I
        //  1424: aload_0        
        //  1425: invokevirtual   com/google/hg.n:()Lcom/google/hD;
        //  1428: invokevirtual   com/google/hD.ordinal:()I
        //  1431: iaload         
        //  1432: istore          9
        //  1434: iload           9
        //  1436: tableswitch {
        //                2: 1474
        //                3: 1499
        //          default: 1460
        //        }
        //  1460: aload_0        
        //  1461: aload_0        
        //  1462: invokevirtual   com/google/hg.n:()Lcom/google/hD;
        //  1465: invokestatic    com/google/hD.a:(Lcom/google/hD;)Ljava/lang/Object;
        //  1468: putfield        com/google/hg.e:Ljava/lang/Object;
        //  1471: goto            732
        //  1474: aload_0        
        //  1475: aload_0        
        //  1476: getfield        com/google/hg.d:Lcom/google/E;
        //  1479: invokevirtual   com/google/E.b:()Ljava/util/List;
        //  1482: iconst_0       
        //  1483: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1488: putfield        com/google/hg.e:Ljava/lang/Object;
        //  1491: goto            732
        //  1494: astore          8
        //  1496: aload           8
        //  1498: athrow         
        //  1499: aload_0        
        //  1500: aconst_null    
        //  1501: putfield        com/google/hg.e:Ljava/lang/Object;
        //  1504: goto            732
        //  1507: astore          10
        //  1509: aload           10
        //  1511: athrow         
        //  1512: astore          11
        //  1514: aload           11
        //  1516: athrow         
        //  1517: astore          12
        //  1519: aload           12
        //  1521: athrow         
        //  1522: astore          13
        //  1524: aload           13
        //  1526: athrow         
        //  1527: astore          14
        //  1529: aload           14
        //  1531: athrow         
        //  1532: new             Lcom/google/gG;
        //  1535: dup            
        //  1536: aload_0        
        //  1537: getstatic       com/google/hg.z:[Ljava/lang/String;
        //  1540: bipush          13
        //  1542: aaload         
        //  1543: aconst_null    
        //  1544: invokespecial   com/google/gG.<init>:(Lcom/google/cH;Ljava/lang/String;Lcom/google/bO;)V
        //  1547: athrow         
        //  1548: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  33     85     85     90     Lcom/google/fR;
        //  90     173    173    178    Lcom/google/fR;
        //  211    228    311    316    Lcom/google/fR;
        //  233    240    316    321    Lcom/google/fR;
        //  240    257    388    393    Lcom/google/fR;
        //  262    306    306    311    Lcom/google/fR;
        //  313    316    316    321    Lcom/google/fR;
        //  321    336    339    344    Lcom/google/fR;
        //  390    393    306    311    Lcom/google/fR;
        //  393    428    428    433    Lcom/google/fR;
        //  433    450    504    509    Lcom/google/fR;
        //  455    499    499    504    Lcom/google/fR;
        //  506    509    499    504    Lcom/google/fR;
        //  518    534    624    629    Lcom/google/fR;
        //  539    555    555    560    Lcom/google/fR;
        //  576    596    621    624    Lcom/google/fR;
        //  602    618    618    621    Lcom/google/fR;
        //  622    624    618    621    Lcom/google/fR;
        //  626    629    555    560    Lcom/google/fR;
        //  629    642    851    856    Lcom/google/fR;
        //  629    642    856    904    Ljava/lang/NumberFormatException;
        //  732    750    1507   1512   Lcom/google/fR;
        //  750    756    1512   1517   Lcom/google/fR;
        //  761    773    1517   1522   Lcom/google/fR;
        //  778    784    1522   1527   Lcom/google/fR;
        //  789    795    1527   1532   Lcom/google/fR;
        //  800    810    826    831    Lcom/google/fR;
        //  810    826    826    831    Lcom/google/fR;
        //  831    848    851    856    Lcom/google/fR;
        //  831    848    856    904    Ljava/lang/NumberFormatException;
        //  853    856    856    904    Ljava/lang/NumberFormatException;
        //  904    921    856    904    Ljava/lang/NumberFormatException;
        //  924    941    856    904    Ljava/lang/NumberFormatException;
        //  944    961    856    904    Ljava/lang/NumberFormatException;
        //  964    993    996    1001   Lcom/google/fR;
        //  964    993    856    904    Ljava/lang/NumberFormatException;
        //  998    1001   856    904    Ljava/lang/NumberFormatException;
        //  1001   1030   1033   1038   Lcom/google/fR;
        //  1001   1030   856    904    Ljava/lang/NumberFormatException;
        //  1035   1038   856    904    Ljava/lang/NumberFormatException;
        //  1038   1067   1070   1075   Lcom/google/fR;
        //  1038   1067   856    904    Ljava/lang/NumberFormatException;
        //  1072   1075   856    904    Ljava/lang/NumberFormatException;
        //  1075   1089   856    904    Ljava/lang/NumberFormatException;
        //  1092   1121   1124   1129   Lcom/google/fR;
        //  1092   1121   856    904    Ljava/lang/NumberFormatException;
        //  1126   1129   856    904    Ljava/lang/NumberFormatException;
        //  1129   1158   1161   1166   Lcom/google/fR;
        //  1129   1158   856    904    Ljava/lang/NumberFormatException;
        //  1163   1166   856    904    Ljava/lang/NumberFormatException;
        //  1166   1195   1198   1203   Lcom/google/fR;
        //  1166   1195   856    904    Ljava/lang/NumberFormatException;
        //  1200   1203   856    904    Ljava/lang/NumberFormatException;
        //  1203   1217   856    904    Ljava/lang/NumberFormatException;
        //  1220   1234   856    904    Ljava/lang/NumberFormatException;
        //  1237   1248   856    904    Ljava/lang/NumberFormatException;
        //  1251   1265   1268   1309   Lcom/google/fR;
        //  1251   1265   856    904    Ljava/lang/NumberFormatException;
        //  1270   1309   856    904    Ljava/lang/NumberFormatException;
        //  1309   1378   1378   1383   Lcom/google/fR;
        //  1309   1378   856    904    Ljava/lang/NumberFormatException;
        //  1380   1383   856    904    Ljava/lang/NumberFormatException;
        //  1383   1399   856    904    Ljava/lang/NumberFormatException;
        //  1399   1413   1416   1421   Lcom/google/fR;
        //  1421   1434   1494   1499   Lcom/google/fR;
        //  1474   1491   1494   1499   Lcom/google/fR;
        //  1514   1517   1517   1522   Lcom/google/fR;
        //  1519   1522   1522   1527   Lcom/google/fR;
        //  1524   1527   1527   1532   Lcom/google/fR;
        //  1529   1532   826    831    Lcom/google/fR;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 663, Size: 663
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    static void b(final hg hg) {
        hg.b();
    }
    
    public int a(final hg hg) {
        try {
            if (hg.b != this.b) {
                throw new IllegalArgumentException(hg.z[1]);
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        return this.c() - hg.c();
    }
    
    @Override
    public aJ a(final aJ aj, final ci ci) {
        return ((a8)aj).mergeFrom((fm)ci);
    }
    
    public dC a() {
        return this.k;
    }
    
    @Override
    public String a() {
        return this.g;
    }
    
    @Override
    public boolean a() {
        return this.c().m();
    }
    
    @Override
    public fm b() {
        return this.a();
    }
    
    @Override
    public boolean b() {
        try {
            if (this.k.t() == dU.LABEL_REPEATED) {
                return true;
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        return false;
    }
    
    @Override
    public int c() {
        return this.k.q();
    }
    
    public ds c() {
        return this.k.y();
    }
    
    @Override
    public String c() {
        return this.k.i();
    }
    
    @Override
    public int compareTo(final Object o) {
        return this.a((hg)o);
    }
    
    public bq d() {
        return this.h;
    }
    
    @Override
    public by d() {
        return this.f;
    }
    
    @Override
    public es d() {
        return this.e().getJavaType();
    }
    
    @Override
    public el e() {
        return hg.i[this.h.ordinal()];
    }
    
    public boolean e() {
        return this.k.x();
    }
    
    public bl f() {
        try {
            if (this.n() != hD.MESSAGE) {
                throw new UnsupportedOperationException(hg.z[0]);
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        return this.c;
    }
    
    public boolean g() {
        try {
            if (this.k.t() == dU.LABEL_OPTIONAL) {
                return true;
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        return false;
    }
    
    public bl h() {
        try {
            if (!this.e()) {
                throw new UnsupportedOperationException(hg.z[7]);
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        return this.a;
    }
    
    public E i() {
        try {
            if (this.n() != hD.ENUM) {
                throw new UnsupportedOperationException(hg.z[30]);
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        return this.d;
    }
    
    public boolean j() {
        try {
            if (!this.b()) {
                return false;
            }
            final hg hg = this;
            final el el = hg.e();
            final boolean b = el.isPackable();
            if (b) {
                return true;
            }
            return false;
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        try {
            final hg hg = this;
            final el el = hg.e();
            final boolean b = el.isPackable();
            if (b) {
                return true;
            }
        }
        catch (UnsupportedOperationException ex2) {
            throw ex2;
        }
        return false;
    }
    
    public int k() {
        return this.j;
    }
    
    public Object l() {
        try {
            if (this.n() == hD.MESSAGE) {
                throw new UnsupportedOperationException(hg.z[2]);
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        return this.e;
    }
    
    public bl m() {
        return this.b;
    }
    
    public hD n() {
        return this.h.getJavaType();
    }
    
    public boolean o() {
        try {
            if (this.k.t() == dU.LABEL_REQUIRED) {
                return true;
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        return false;
    }
}
