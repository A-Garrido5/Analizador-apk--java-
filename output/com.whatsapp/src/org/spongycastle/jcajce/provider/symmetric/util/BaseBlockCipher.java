// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.symmetric.util;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.SecureRandom;
import java.security.AlgorithmParameters;
import java.security.Key;
import org.spongycastle.crypto.DataLengthException;
import javax.crypto.IllegalBlockSizeException;
import org.spongycastle.crypto.OutputLengthException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.BlockCipher;

public class BaseBlockCipher extends BaseWrapCipher implements PBE
{
    private static final String[] z;
    private Class[] availableSpecs;
    private BlockCipher baseEngine;
    private BaseBlockCipher$GenericBlockCipher cipher;
    private BlockCipherProvider engineProvider;
    private int ivLength;
    private ParametersWithIV ivParam;
    private String modeName;
    private boolean padded;
    private String pbeAlgorithm;
    private PBEParameterSpec pbeSpec;
    
    static {
        final String[] z2 = new String[34];
        final char[] charArray = "b`+\u0018\u0005hf5\u001e".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'A';
                    break;
                }
                case 0: {
                    c2 = ',';
                    break;
                }
                case 1: {
                    c2 = '/';
                    break;
                }
                case 2: {
                    c2 = '{';
                    break;
                }
                case 3: {
                    c2 = 'Y';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "\fZ\u00152/CX\u0015w".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'A';
                    break;
                }
                case 0: {
                    c4 = ',';
                    break;
                }
                case 1: {
                    c4 = '/';
                    break;
                }
                case 2: {
                    c4 = '{';
                    break;
                }
                case 3: {
                    c4 = 'Y';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "|N\u001f=(BH[".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = 'A';
                    break;
                }
                case 0: {
                    c6 = ',';
                    break;
                }
                case 1: {
                    c6 = '/';
                    break;
                }
                case 2: {
                    c6 = '{';
                    break;
                }
                case 3: {
                    c6 = 'Y';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "cA\u0017 ab@+8%HF\u0015>aON\u0015y#I\u000f\u000e*$H\u000f\f05D\u000f:\u001c\u0000h\u000f\u00166%I\\U".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = 'A';
                    break;
                }
                case 0: {
                    c8 = ',';
                    break;
                }
                case 1: {
                    c8 = '/';
                    break;
                }
                case 2: {
                    c8 = '{';
                    break;
                }
                case 3: {
                    c8 = 'Y';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "|d8\nt|n?\u001d\bbh".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = 'A';
                    break;
                }
                case 0: {
                    c10 = ',';
                    break;
                }
                case 1: {
                    c10 = '/';
                    break;
                }
                case 2: {
                    c10 = '{';
                    break;
                }
                case 3: {
                    c10 = 'Y';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "|d8\nv|n?\u001d\bbh".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = 'A';
                    break;
                }
                case 0: {
                    c12 = ',';
                    break;
                }
                case 1: {
                    c12 = '/';
                    break;
                }
                case 2: {
                    c12 = '{';
                    break;
                }
                case 3: {
                    c12 = 'Y';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "\u007fl".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = 'A';
                    break;
                }
                case 0: {
                    c14 = ',';
                    break;
                }
                case 1: {
                    c14 = '/';
                    break;
                }
                case 2: {
                    c14 = '{';
                    break;
                }
                case 3: {
                    c14 = 'Y';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        final char[] charArray8 = "\u007fl".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = 'A';
                    break;
                }
                case 0: {
                    c16 = ',';
                    break;
                }
                case 1: {
                    c16 = '/';
                    break;
                }
                case 2: {
                    c16 = '{';
                    break;
                }
                case 3: {
                    c16 = 'Y';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[7] = new String(charArray8).intern();
        final char[] charArray9 = "YA\u00107.[A[) ^N\u0016<5I][-8\\JU".toCharArray();
        for (int length5 = charArray9.length, n9 = 0; length5 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = 'A';
                    break;
                }
                case 0: {
                    c18 = ',';
                    break;
                }
                case 1: {
                    c18 = '/';
                    break;
                }
                case 2: {
                    c18 = '{';
                    break;
                }
                case 3: {
                    c18 = 'Y';
                    break;
                }
            }
            charArray9[n9] = (char)(c18 ^ c17);
        }
        z2[8] = new String(charArray9).intern();
        final char[] charArray10 = "YA\u00107.[A[61A@\u001f<a".toCharArray();
        for (int length6 = charArray10.length, n10 = 0; length6 > n10; ++n10) {
            final char c19 = charArray10[n10];
            char c20 = '\0';
            switch (n10 % 5) {
                default: {
                    c20 = 'A';
                    break;
                }
                case 0: {
                    c20 = ',';
                    break;
                }
                case 1: {
                    c20 = '/';
                    break;
                }
                case 2: {
                    c20 = '{';
                    break;
                }
                case 3: {
                    c20 = 'Y';
                    break;
                }
            }
            charArray10[n10] = (char)(c20 ^ c19);
        }
        z2[9] = new String(charArray10).intern();
        final char[] charArray11 = "\f_\u001a*2IK".toCharArray();
        for (int length7 = charArray11.length, n11 = 0; length7 > n11; ++n11) {
            final char c21 = charArray11[n11];
            char c22 = '\0';
            switch (n11 % 5) {
                default: {
                    c22 = 'A';
                    break;
                }
                case 0: {
                    c22 = ',';
                    break;
                }
                case 1: {
                    c22 = '/';
                    break;
                }
                case 2: {
                    c22 = '{';
                    break;
                }
                case 3: {
                    c22 = 'Y';
                    break;
                }
            }
            charArray11[n11] = (char)(c22 ^ c21);
        }
        z2[10] = new String(charArray11).intern();
        final char[] charArray12 = "~lNtw\u0018".toCharArray();
        for (int length8 = charArray12.length, n12 = 0; length8 > n12; ++n12) {
            final char c23 = charArray12[n12];
            char c24 = '\0';
            switch (n12 % 5) {
                default: {
                    c24 = 'A';
                    break;
                }
                case 0: {
                    c24 = ',';
                    break;
                }
                case 1: {
                    c24 = '/';
                    break;
                }
                case 2: {
                    c24 = '{';
                    break;
                }
                case 3: {
                    c24 = 'Y';
                    break;
                }
            }
            charArray12[n12] = (char)(c24 ^ c23);
        }
        z2[11] = new String(charArray12).intern();
        final char[] charArray13 = "~lNy3I^\u000e03I\\[8/\f}8l\u0011M]\u001a4$XJ\t*\u0012\\J\u0018y5C\u000f\u0019<a\\N\b*$H\u000f\u00127o".toCharArray();
        for (int length9 = charArray13.length, n13 = 0; length9 > n13; ++n13) {
            final char c25 = charArray13[n13];
            char c26 = '\0';
            switch (n13 % 5) {
                default: {
                    c26 = 'A';
                    break;
                }
                case 0: {
                    c26 = ',';
                    break;
                }
                case 1: {
                    c26 = '/';
                    break;
                }
                case 2: {
                    c26 = '{';
                    break;
                }
                case 3: {
                    c26 = 'Y';
                    break;
                }
            }
            charArray13[n13] = (char)(c26 ^ c25);
        }
        z2[12] = new String(charArray13).intern();
        final char[] charArray14 = "ey[44_[[;$\f".toCharArray();
        for (int length10 = charArray14.length, n14 = 0; length10 > n14; ++n14) {
            final char c27 = charArray14[n14];
            char c28 = '\0';
            switch (n14 % 5) {
                default: {
                    c28 = 'A';
                    break;
                }
                case 0: {
                    c28 = ',';
                    break;
                }
                case 1: {
                    c28 = '/';
                    break;
                }
                case 2: {
                    c28 = '{';
                    break;
                }
                case 3: {
                    c28 = 'Y';
                    break;
                }
            }
            charArray14[n14] = (char)(c28 ^ c27);
        }
        z2[13] = new String(charArray14).intern();
        final char[] charArray15 = "il9y,CK\u001ey%CJ\by/C[[,2I\u000f\u001a7aey".toCharArray();
        for (int length11 = charArray15.length, n15 = 0; length11 > n15; ++n15) {
            final char c29 = charArray15[n15];
            char c30 = '\0';
            switch (n15 % 5) {
                default: {
                    c30 = 'A';
                    break;
                }
                case 0: {
                    c30 = ',';
                    break;
                }
                case 1: {
                    c30 = '/';
                    break;
                }
                case 2: {
                    c30 = '{';
                    break;
                }
                case 3: {
                    c30 = 'Y';
                    break;
                }
            }
            charArray15[n15] = (char)(c30 ^ c29);
        }
        z2[14] = new String(charArray15).intern();
        final char[] charArray16 = "|h+\u001a\u0007n".toCharArray();
        for (int length12 = charArray16.length, n16 = 0; length12 > n16; ++n16) {
            final char c31 = charArray16[n16];
            char c32 = '\0';
            switch (n16 % 5) {
                default: {
                    c32 = 'A';
                    break;
                }
                case 0: {
                    c32 = ',';
                    break;
                }
                case 1: {
                    c32 = '/';
                    break;
                }
                case 2: {
                    c32 = '{';
                    break;
                }
                case 3: {
                    c32 = 'Y';
                    break;
                }
            }
            charArray16[n16] = (char)(c32 ^ c31);
        }
        z2[15] = new String(charArray16).intern();
        final char[] charArray17 = "il9".toCharArray();
        for (int length13 = charArray17.length, n17 = 0; length13 > n17; ++n17) {
            final char c33 = charArray17[n17];
            char c34 = '\0';
            switch (n17 % 5) {
                default: {
                    c34 = 'A';
                    break;
                }
                case 0: {
                    c34 = ',';
                    break;
                }
                case 1: {
                    c34 = '/';
                    break;
                }
                case 2: {
                    c34 = '{';
                    break;
                }
                case 3: {
                    c34 = 'Y';
                    break;
                }
            }
            charArray17[n17] = (char)(c34 ^ c33);
        }
        z2[16] = new String(charArray17).intern();
        final char[] charArray18 = "gJ\u0002y'C][8-K@\t05DB[".toCharArray();
        for (int length14 = charArray18.length, n18 = 0; length14 > n18; ++n18) {
            final char c35 = charArray18[n18];
            char c36 = '\0';
            switch (n18 % 5) {
                default: {
                    c36 = 'A';
                    break;
                }
                case 0: {
                    c36 = ',';
                    break;
                }
                case 1: {
                    c36 = '/';
                    break;
                }
                case 2: {
                    c36 = '{';
                    break;
                }
                case 3: {
                    c36 = 'Y';
                    break;
                }
            }
            charArray18[n18] = (char)(c36 ^ c35);
        }
        z2[17] = new String(charArray18).intern();
        final char[] charArray19 = "B@[\u0010\u0017\f\\\u001e-a[G\u001e7aCA\u001ey$T_\u001e:5IK".toCharArray();
        for (int length15 = charArray19.length, n19 = 0; length15 > n19; ++n19) {
            final char c37 = charArray19[n19];
            char c38 = '\0';
            switch (n19 % 5) {
                default: {
                    c38 = 'A';
                    break;
                }
                case 0: {
                    c38 = ',';
                    break;
                }
                case 1: {
                    c38 = '/';
                    break;
                }
                case 2: {
                    c38 = '{';
                    break;
                }
                case 3: {
                    c38 = 'Y';
                    break;
                }
            }
            charArray19[n19] = (char)(c38 ^ c37);
        }
        z2[18] = new String(charArray19).intern();
        final char[] charArray20 = "\fA\u0014-a_Z\u0012- NC\u001ey'C][*8AB\u001e-3EL[</^V\u000b-(CAU".toCharArray();
        for (int length16 = charArray20.length, n20 = 0; length16 > n20; ++n20) {
            final char c39 = charArray20[n20];
            char c40 = '\0';
            switch (n20 % 5) {
                default: {
                    c40 = 'A';
                    break;
                }
                case 0: {
                    c40 = ',';
                    break;
                }
                case 1: {
                    c40 = '/';
                    break;
                }
                case 2: {
                    c40 = '{';
                    break;
                }
                case 3: {
                    c40 = 'Y';
                    break;
                }
            }
            charArray20[n20] = (char)(c40 ^ c39);
        }
        z2[19] = new String(charArray20).intern();
        final char[] charArray21 = "\fM\u0002-$_\u000f\u00176/K\u0001".toCharArray();
        for (int length17 = charArray21.length, n21 = 0; length17 > n21; ++n21) {
            final char c41 = charArray21[n21];
            char c42 = '\0';
            switch (n21 % 5) {
                default: {
                    c42 = 'A';
                    break;
                }
                case 0: {
                    c42 = ',';
                    break;
                }
                case 1: {
                    c42 = '/';
                    break;
                }
                case 2: {
                    c42 = '{';
                    break;
                }
                case 3: {
                    c42 = 'Y';
                    break;
                }
            }
            charArray21[n21] = (char)(c42 ^ c41);
        }
        z2[20] = new String(charArray21).intern();
        final char[] charArray22 = "|m>y3I^\u000e03I\\[\t\u0003i\u000f\u000b83MB\u001e-$^\\[-.\fM\u001ey2I[U".toCharArray();
        for (int length18 = charArray22.length, n22 = 0; length18 > n22; ++n22) {
            final char c43 = charArray22[n22];
            char c44 = '\0';
            switch (n22 % 5) {
                default: {
                    c44 = 'A';
                    break;
                }
                case 0: {
                    c44 = ',';
                    break;
                }
                case 1: {
                    c44 = '/';
                    break;
                }
                case 2: {
                    c44 = '{';
                    break;
                }
                case 3: {
                    c44 = 'Y';
                    break;
                }
            }
            charArray22[n22] = (char)(c44 ^ c43);
        }
        z2[21] = new String(charArray22).intern();
        final char[] charArray23 = "ON\u0015~5\fG\u001a7%@J[) ^N\u0016<5I][".toCharArray();
        for (int length19 = charArray23.length, n23 = 0; length19 > n23; ++n23) {
            final char c45 = charArray23[n23];
            char c46 = '\0';
            switch (n23 % 5) {
                default: {
                    c46 = 'A';
                    break;
                }
                case 0: {
                    c46 = ',';
                    break;
                }
                case 1: {
                    c46 = '/';
                    break;
                }
                case 2: {
                    c46 = '{';
                    break;
                }
                case 3: {
                    c46 = 'Y';
                    break;
                }
            }
            charArray23[n23] = (char)(c46 ^ c45);
        }
        z2[22] = new String(charArray23).intern();
        final char[] charArray24 = "kl6".toCharArray();
        for (int length20 = charArray24.length, n24 = 0; length20 > n24; ++n24) {
            final char c47 = charArray24[n24];
            char c48 = '\0';
            switch (n24 % 5) {
                default: {
                    c48 = 'A';
                    break;
                }
                case 0: {
                    c48 = ',';
                    break;
                }
                case 1: {
                    c48 = '/';
                    break;
                }
                case 2: {
                    c48 = '{';
                    break;
                }
                case 3: {
                    c48 = 'Y';
                    break;
                }
            }
            charArray24[n24] = (char)(c48 ^ c47);
        }
        z2[23] = new String(charArray24).intern();
        final char[] charArray25 = "oi9".toCharArray();
        for (int length21 = charArray25.length, n25 = 0; length21 > n25; ++n25) {
            final char c49 = charArray25[n25];
            char c50 = '\0';
            switch (n25 % 5) {
                default: {
                    c50 = 'A';
                    break;
                }
                case 0: {
                    c50 = ',';
                    break;
                }
                case 1: {
                    c50 = '/';
                    break;
                }
                case 2: {
                    c50 = '{';
                    break;
                }
                case 3: {
                    c50 = 'Y';
                    break;
                }
            }
            charArray25[n25] = (char)(c50 ^ c49);
        }
        z2[24] = new String(charArray25).intern();
        final char[] charArray26 = "o{)".toCharArray();
        for (int length22 = charArray26.length, n26 = 0; length22 > n26; ++n26) {
            final char c51 = charArray26[n26];
            char c52 = '\0';
            switch (n26 % 5) {
                default: {
                    c52 = 'A';
                    break;
                }
                case 0: {
                    c52 = ',';
                    break;
                }
                case 1: {
                    c52 = '/';
                    break;
                }
                case 2: {
                    c52 = '{';
                    break;
                }
                case 3: {
                    c52 = 'Y';
                    break;
                }
            }
            charArray26[n26] = (char)(c52 ^ c51);
        }
        z2[25] = new String(charArray26).intern();
        final char[] charArray27 = "ON\u0015~5\f\\\u000e)1C]\u000fy,CK\u001ey".toCharArray();
        for (int length23 = charArray27.length, n27 = 0; length23 > n27; ++n27) {
            final char c53 = charArray27[n27];
            char c54 = '\0';
            switch (n27 % 5) {
                default: {
                    c54 = 'A';
                    break;
                }
                case 0: {
                    c54 = ',';
                    break;
                }
                case 1: {
                    c54 = '/';
                    break;
                }
                case 2: {
                    c54 = '{';
                    break;
                }
                case 3: {
                    c54 = 'Y';
                    break;
                }
            }
            charArray27[n27] = (char)(c54 ^ c53);
        }
        z2[26] = new String(charArray27).intern();
        final char[] charArray28 = "om8".toCharArray();
        for (int length24 = charArray28.length, n28 = 0; length24 > n28; ++n28) {
            final char c55 = charArray28[n28];
            char c56 = '\0';
            switch (n28 % 5) {
                default: {
                    c56 = 'A';
                    break;
                }
                case 0: {
                    c56 = ',';
                    break;
                }
                case 1: {
                    c56 = '/';
                    break;
                }
                case 2: {
                    c56 = '{';
                    break;
                }
                case 3: {
                    c56 = 'Y';
                    break;
                }
            }
            charArray28[n28] = (char)(c56 ^ c55);
        }
        z2[27] = new String(charArray28).intern();
        final char[] charArray29 = "ci9".toCharArray();
        for (int length25 = charArray29.length, n29 = 0; length25 > n29; ++n29) {
            final char c57 = charArray29[n29];
            char c58 = '\0';
            switch (n29 % 5) {
                default: {
                    c58 = 'A';
                    break;
                }
                case 0: {
                    c58 = ',';
                    break;
                }
                case 1: {
                    c58 = '/';
                    break;
                }
                case 2: {
                    c58 = '{';
                    break;
                }
                case 3: {
                    c58 = 'Y';
                    break;
                }
            }
            charArray29[n29] = (char)(c58 ^ c57);
        }
        z2[28] = new String(charArray29).intern();
        final char[] charArray30 = "il9".toCharArray();
        for (int length26 = charArray30.length, n30 = 0; length26 > n30; ++n30) {
            final char c59 = charArray30[n30];
            char c60 = '\0';
            switch (n30 % 5) {
                default: {
                    c60 = 'A';
                    break;
                }
                case 0: {
                    c60 = ',';
                    break;
                }
                case 1: {
                    c60 = '/';
                    break;
                }
                case 2: {
                    c60 = '{';
                    break;
                }
                case 3: {
                    c60 = 'Y';
                    break;
                }
            }
            charArray30[n30] = (char)(c60 ^ c59);
        }
        z2[29] = new String(charArray30).intern();
        final char[] charArray31 = "in#".toCharArray();
        for (int length27 = charArray31.length, n31 = 0; length27 > n31; ++n31) {
            final char c61 = charArray31[n31];
            char c62 = '\0';
            switch (n31 % 5) {
                default: {
                    c62 = 'A';
                    break;
                }
                case 0: {
                    c62 = ',';
                    break;
                }
                case 1: {
                    c62 = '/';
                    break;
                }
                case 2: {
                    c62 = '{';
                    break;
                }
                case 3: {
                    c62 = 'Y';
                    break;
                }
            }
            charArray31[n31] = (char)(c62 ^ c61);
        }
        z2[30] = new String(charArray31).intern();
        final char[] charArray32 = "kl6".toCharArray();
        for (int length28 = charArray32.length, n32 = 0; length28 > n32; ++n32) {
            final char c63 = charArray32[n32];
            char c64 = '\0';
            switch (n32 % 5) {
                default: {
                    c64 = 'A';
                    break;
                }
                case 0: {
                    c64 = ',';
                    break;
                }
                case 1: {
                    c64 = '/';
                    break;
                }
                case 2: {
                    c64 = '{';
                    break;
                }
                case 3: {
                    c64 = 'Y';
                    break;
                }
            }
            charArray32[n32] = (char)(c64 ^ c63);
        }
        z2[31] = new String(charArray32).intern();
        final char[] charArray33 = "ol6".toCharArray();
        for (int length29 = charArray33.length, n33 = 0; length29 > n33; ++n33) {
            final char c65 = charArray33[n33];
            char c66 = '\0';
            switch (n33 % 5) {
                default: {
                    c66 = 'A';
                    break;
                }
                case 0: {
                    c66 = ',';
                    break;
                }
                case 1: {
                    c66 = '/';
                    break;
                }
                case 2: {
                    c66 = '{';
                    break;
                }
                case 3: {
                    c66 = 'Y';
                    break;
                }
            }
            charArray33[n33] = (char)(c66 ^ c65);
        }
        z2[32] = new String(charArray33).intern();
        final char[] charArray34 = "cl9".toCharArray();
        for (int length30 = charArray34.length, n34 = 0; length30 > n34; ++n34) {
            final char c67 = charArray34[n34];
            char c68 = '\0';
            switch (n34 % 5) {
                default: {
                    c68 = 'A';
                    break;
                }
                case 0: {
                    c68 = ',';
                    break;
                }
                case 1: {
                    c68 = '/';
                    break;
                }
                case 2: {
                    c68 = '{';
                    break;
                }
                case 3: {
                    c68 = 'Y';
                    break;
                }
            }
            charArray34[n34] = (char)(c68 ^ c67);
        }
        z2[33] = new String(charArray34).intern();
        z = z2;
    }
    
    protected BaseBlockCipher(final BlockCipherProvider engineProvider) {
        final int a = BaseMac.a;
        this.availableSpecs = new Class[] { RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class };
        this.ivLength = 0;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = engineProvider.get();
        this.engineProvider = engineProvider;
        this.cipher = new BaseBlockCipher$BufferedGenericBlockCipher(engineProvider.get());
        if (a == 0) {
            return;
        }
        while (true) {
            while (true) {
                try {
                    final boolean a2 = BaseKeyGenerator.a;
                    final boolean a3 = false;
                    if (a2) {
                        BaseKeyGenerator.a = a3;
                        return;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                final boolean a3 = true;
                continue;
            }
        }
    }
    
    static Class access$000(final String s) {
        return lookup(s);
    }
    
    private boolean isAEADModeName(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //     3: bipush          32
        //     5: aaload         
        //     6: aload_1        
        //     7: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    10: istore          6
        //    12: iload           6
        //    14: ifne            68
        //    17: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //    20: bipush          30
        //    22: aaload         
        //    23: aload_1        
        //    24: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    27: istore          7
        //    29: iload           7
        //    31: ifne            68
        //    34: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //    37: bipush          31
        //    39: aaload         
        //    40: aload_1        
        //    41: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    44: istore          8
        //    46: iload           8
        //    48: ifne            68
        //    51: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //    54: bipush          33
        //    56: aaload         
        //    57: aload_1        
        //    58: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    61: istore          9
        //    63: iload           9
        //    65: ifeq            86
        //    68: iconst_1       
        //    69: ireturn        
        //    70: astore_2       
        //    71: aload_2        
        //    72: athrow         
        //    73: astore_3       
        //    74: aload_3        
        //    75: athrow         
        //    76: astore          4
        //    78: aload           4
        //    80: athrow         
        //    81: astore          5
        //    83: aload           5
        //    85: athrow         
        //    86: iconst_0       
        //    87: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      12     70     73     Ljava/lang/RuntimeException;
        //  17     29     73     76     Ljava/lang/RuntimeException;
        //  34     46     76     81     Ljava/lang/RuntimeException;
        //  51     63     81     86     Ljava/lang/RuntimeException;
        //  71     73     73     76     Ljava/lang/RuntimeException;
        //  74     76     76     81     Ljava/lang/RuntimeException;
        //  78     81     81     86     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 48, Size: 48
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
    
    private static Class lookup(final String s) {
        try {
            return BaseBlockCipher.class.getClassLoader().loadClass(s);
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    @Override
    protected int engineDoFinal(final byte[] array, final int n, final int n2, final byte[] array2, final int n3) {
        int processBytes = 0;
        Label_0025: {
            if (n2 == 0) {
                break Label_0025;
            }
            try {
                processBytes = this.cipher.processBytes(array, n, n2, array2, n3);
                return processBytes + this.cipher.doFinal(array2, n3 + processBytes);
            }
            catch (OutputLengthException ex) {
                throw new ShortBufferException(ex.getMessage());
            }
            catch (DataLengthException ex2) {
                throw new IllegalBlockSizeException(ex2.getMessage());
            }
        }
    }
    
    @Override
    protected byte[] engineDoFinal(final byte[] array, final int n, final int n2) {
        final byte[] array2 = new byte[this.engineGetOutputSize(n2)];
        int processBytes;
        if (n2 != 0) {
            processBytes = this.cipher.processBytes(array, n, n2, array2, 0);
        }
        else {
            processBytes = 0;
        }
        int n3 = 0;
        Label_0087: {
            try {
                n3 = this.cipher.doFinal(array2, processBytes) + processBytes;
                final byte[] array3 = array2;
                final int n4 = array3.length;
                final int n5 = n3;
                final int n6 = n4;
                if (n5 == n6) {
                    return array2;
                }
                break Label_0087;
            }
            catch (DataLengthException ex) {
                throw new IllegalBlockSizeException(ex.getMessage());
            }
            try {
                final byte[] array3 = array2;
                final int n4 = array3.length;
                final int n5 = n3;
                final int n6 = n4;
                if (n5 == n6) {
                    return array2;
                }
            }
            catch (DataLengthException ex2) {
                throw ex2;
            }
        }
        final byte[] array5 = new byte[n3];
        System.arraycopy(array2, 0, array5, 0, n3);
        return array5;
    }
    
    @Override
    protected int engineGetBlockSize() {
        return this.baseEngine.getBlockSize();
    }
    
    @Override
    protected byte[] engineGetIV() {
        try {
            if (this.ivParam != null) {
                return this.ivParam.getIV();
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return null;
    }
    
    @Override
    protected int engineGetKeySize(final Key key) {
        return 8 * key.getEncoded().length;
    }
    
    @Override
    protected int engineGetOutputSize(final int n) {
        return this.cipher.getOutputSize(n);
    }
    
    @Override
    protected AlgorithmParameters engineGetParameters() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.engineParams:Ljava/security/AlgorithmParameters;
        //     4: ifnonnull       44
        //     7: aload_0        
        //     8: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;
        //    11: astore_2       
        //    12: aload_2        
        //    13: ifnull          56
        //    16: aload_0        
        //    17: aload_0        
        //    18: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.pbeAlgorithm:Ljava/lang/String;
        //    21: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //    24: bipush          7
        //    26: aaload         
        //    27: invokestatic    java/security/AlgorithmParameters.getInstance:(Ljava/lang/String;Ljava/lang/String;)Ljava/security/AlgorithmParameters;
        //    30: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.engineParams:Ljava/security/AlgorithmParameters;
        //    33: aload_0        
        //    34: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.engineParams:Ljava/security/AlgorithmParameters;
        //    37: aload_0        
        //    38: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;
        //    41: invokevirtual   java/security/AlgorithmParameters.init:(Ljava/security/spec/AlgorithmParameterSpec;)V
        //    44: aload_0        
        //    45: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.engineParams:Ljava/security/AlgorithmParameters;
        //    48: areturn        
        //    49: astore_1       
        //    50: aload_1        
        //    51: athrow         
        //    52: astore          5
        //    54: aconst_null    
        //    55: areturn        
        //    56: aload_0        
        //    57: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.ivParam:Lorg/spongycastle/crypto/params/ParametersWithIV;
        //    60: ifnull          44
        //    63: aload_0        
        //    64: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.cipher:Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;
        //    67: invokeinterface org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher.getUnderlyingCipher:()Lorg/spongycastle/crypto/BlockCipher;
        //    72: invokeinterface org/spongycastle/crypto/BlockCipher.getAlgorithmName:()Ljava/lang/String;
        //    77: astore_3       
        //    78: aload_3        
        //    79: bipush          47
        //    81: invokevirtual   java/lang/String.indexOf:(I)I
        //    84: iflt            99
        //    87: aload_3        
        //    88: iconst_0       
        //    89: aload_3        
        //    90: bipush          47
        //    92: invokevirtual   java/lang/String.indexOf:(I)I
        //    95: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //    98: astore_3       
        //    99: aload_0        
        //   100: aload_3        
        //   101: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //   104: bipush          6
        //   106: aaload         
        //   107: invokestatic    java/security/AlgorithmParameters.getInstance:(Ljava/lang/String;Ljava/lang/String;)Ljava/security/AlgorithmParameters;
        //   110: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.engineParams:Ljava/security/AlgorithmParameters;
        //   113: aload_0        
        //   114: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.engineParams:Ljava/security/AlgorithmParameters;
        //   117: aload_0        
        //   118: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.ivParam:Lorg/spongycastle/crypto/params/ParametersWithIV;
        //   121: invokevirtual   org/spongycastle/crypto/params/ParametersWithIV.getIV:()[B
        //   124: invokevirtual   java/security/AlgorithmParameters.init:([B)V
        //   127: goto            44
        //   130: astore          4
        //   132: new             Ljava/lang/RuntimeException;
        //   135: dup            
        //   136: aload           4
        //   138: invokevirtual   java/lang/Exception.toString:()Ljava/lang/String;
        //   141: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   144: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      12     49     52     Ljava/lang/Exception;
        //  16     44     52     56     Ljava/lang/Exception;
        //  99     127    130    145    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0044:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
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
    
    @Override
    protected void engineInit(final int p0, final Key p1, final AlgorithmParameters p2, final SecureRandom p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseMac.a:I
        //     3: istore          5
        //     5: aload_3        
        //     6: ifnull          123
        //     9: iconst_0       
        //    10: istore          7
        //    12: iload           7
        //    14: aload_0        
        //    15: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.availableSpecs:[Ljava/lang/Class;
        //    18: arraylength    
        //    19: if_icmpeq       117
        //    22: aload_0        
        //    23: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.availableSpecs:[Ljava/lang/Class;
        //    26: iload           7
        //    28: aaload         
        //    29: astore          10
        //    31: aload           10
        //    33: ifnonnull       41
        //    36: iload           5
        //    38: ifeq            109
        //    41: aload_3        
        //    42: aload_0        
        //    43: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.availableSpecs:[Ljava/lang/Class;
        //    46: iload           7
        //    48: aaload         
        //    49: invokevirtual   java/security/AlgorithmParameters.getParameterSpec:(Ljava/lang/Class;)Ljava/security/spec/AlgorithmParameterSpec;
        //    52: astore          12
        //    54: aload           12
        //    56: astore          6
        //    58: aload           6
        //    60: ifnonnull       126
        //    63: new             Ljava/security/InvalidAlgorithmParameterException;
        //    66: dup            
        //    67: new             Ljava/lang/StringBuilder;
        //    70: dup            
        //    71: invokespecial   java/lang/StringBuilder.<init>:()V
        //    74: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //    77: bipush          22
        //    79: aaload         
        //    80: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    83: aload_3        
        //    84: invokevirtual   java/security/AlgorithmParameters.toString:()Ljava/lang/String;
        //    87: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    90: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    93: invokespecial   java/security/InvalidAlgorithmParameterException.<init>:(Ljava/lang/String;)V
        //    96: athrow         
        //    97: astore          8
        //    99: aload           8
        //   101: athrow         
        //   102: astore          9
        //   104: aload           9
        //   106: athrow         
        //   107: astore          11
        //   109: iinc            7, 1
        //   112: iload           5
        //   114: ifeq            12
        //   117: aconst_null    
        //   118: astore          6
        //   120: goto            58
        //   123: aconst_null    
        //   124: astore          6
        //   126: aload_0        
        //   127: iload_1        
        //   128: aload_2        
        //   129: aload           6
        //   131: aload           4
        //   133: invokevirtual   org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.engineInit:(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
        //   136: aload_0        
        //   137: aload_3        
        //   138: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.engineParams:Ljava/security/AlgorithmParameters;
        //   141: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  22     31     102    107    Ljava/lang/Exception;
        //  41     54     107    109    Ljava/lang/Exception;
        //  63     97     97     102    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0041:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
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
    
    @Override
    protected void engineInit(final int n, final Key key, final SecureRandom secureRandom) {
        try {
            this.engineInit(n, key, (AlgorithmParameterSpec)null, secureRandom);
        }
        catch (InvalidAlgorithmParameterException ex) {
            throw new InvalidKeyException(ex.getMessage());
        }
    }
    
    @Override
    protected void engineInit(final int p0, final Key p1, final AlgorithmParameterSpec p2, final SecureRandom p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseMac.a:I
        //     3: istore          5
        //     5: aload_0        
        //     6: aconst_null    
        //     7: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;
        //    10: aload_0        
        //    11: aconst_null    
        //    12: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.pbeAlgorithm:Ljava/lang/String;
        //    15: aload_0        
        //    16: aconst_null    
        //    17: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.engineParams:Ljava/security/AlgorithmParameters;
        //    20: aload_2        
        //    21: instanceof      Ljavax/crypto/SecretKey;
        //    24: ifne            77
        //    27: new             Ljava/security/InvalidKeyException;
        //    30: dup            
        //    31: new             Ljava/lang/StringBuilder;
        //    34: dup            
        //    35: invokespecial   java/lang/StringBuilder.<init>:()V
        //    38: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //    41: bipush          17
        //    43: aaload         
        //    44: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    47: aload_2        
        //    48: invokeinterface java/security/Key.getAlgorithm:()Ljava/lang/String;
        //    53: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    56: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //    59: bipush          19
        //    61: aaload         
        //    62: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    65: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    68: invokespecial   java/security/InvalidKeyException.<init>:(Ljava/lang/String;)V
        //    71: athrow         
        //    72: astore          6
        //    74: aload           6
        //    76: athrow         
        //    77: aload_3        
        //    78: ifnonnull       130
        //    81: aload_0        
        //    82: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.baseEngine:Lorg/spongycastle/crypto/BlockCipher;
        //    85: invokeinterface org/spongycastle/crypto/BlockCipher.getAlgorithmName:()Ljava/lang/String;
        //    90: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //    93: bipush          11
        //    95: aaload         
        //    96: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    99: istore          53
        //   101: iload           53
        //   103: ifeq            130
        //   106: new             Ljava/security/InvalidAlgorithmParameterException;
        //   109: dup            
        //   110: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //   113: bipush          12
        //   115: aaload         
        //   116: invokespecial   java/security/InvalidAlgorithmParameterException.<init>:(Ljava/lang/String;)V
        //   119: athrow         
        //   120: astore          52
        //   122: aload           52
        //   124: athrow         
        //   125: astore          51
        //   127: aload           51
        //   129: athrow         
        //   130: aload_2        
        //   131: instanceof      Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;
        //   134: ifeq            293
        //   137: aload_2        
        //   138: checkcast       Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;
        //   141: astore          43
        //   143: aload_0        
        //   144: aload           43
        //   146: invokevirtual   org/spongycastle/jcajce/provider/symmetric/util/BCPBEKey.getAlgorithm:()Ljava/lang/String;
        //   149: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.pbeAlgorithm:Ljava/lang/String;
        //   152: aload           43
        //   154: invokevirtual   org/spongycastle/jcajce/provider/symmetric/util/BCPBEKey.getParam:()Lorg/spongycastle/crypto/CipherParameters;
        //   157: ifnull          197
        //   160: aload           43
        //   162: invokevirtual   org/spongycastle/jcajce/provider/symmetric/util/BCPBEKey.getParam:()Lorg/spongycastle/crypto/CipherParameters;
        //   165: astore          49
        //   167: aload_3        
        //   168: instanceof      Ljavax/crypto/spec/IvParameterSpec;
        //   171: ifeq            982
        //   174: new             Lorg/spongycastle/crypto/params/ParametersWithIV;
        //   177: dup            
        //   178: aload           49
        //   180: aload_3        
        //   181: checkcast       Ljavax/crypto/spec/IvParameterSpec;
        //   184: invokevirtual   javax/crypto/spec/IvParameterSpec.getIV:()[B
        //   187: invokespecial   org/spongycastle/crypto/params/ParametersWithIV.<init>:(Lorg/spongycastle/crypto/CipherParameters;[B)V
        //   190: astore          50
        //   192: iload           5
        //   194: ifeq            267
        //   197: aload_3        
        //   198: instanceof      Ljavax/crypto/spec/PBEParameterSpec;
        //   201: istore          45
        //   203: iload           45
        //   205: ifeq            243
        //   208: aload_0        
        //   209: aload_3        
        //   210: checkcast       Ljavax/crypto/spec/PBEParameterSpec;
        //   213: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;
        //   216: aload           43
        //   218: aload_3        
        //   219: aload_0        
        //   220: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.cipher:Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;
        //   223: invokeinterface org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher.getUnderlyingCipher:()Lorg/spongycastle/crypto/BlockCipher;
        //   228: invokeinterface org/spongycastle/crypto/BlockCipher.getAlgorithmName:()Ljava/lang/String;
        //   233: invokestatic    org/spongycastle/jcajce/provider/symmetric/util/PBE$Util.makePBEParameters:(Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;Ljava/security/spec/AlgorithmParameterSpec;Ljava/lang/String;)Lorg/spongycastle/crypto/CipherParameters;
        //   236: astore          47
        //   238: iload           5
        //   240: ifeq            271
        //   243: new             Ljava/security/InvalidAlgorithmParameterException;
        //   246: dup            
        //   247: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //   250: bipush          21
        //   252: aaload         
        //   253: invokespecial   java/security/InvalidAlgorithmParameterException.<init>:(Ljava/lang/String;)V
        //   256: athrow         
        //   257: astore          46
        //   259: aload           46
        //   261: athrow         
        //   262: astore          44
        //   264: aload           44
        //   266: athrow         
        //   267: aload           50
        //   269: astore          47
        //   271: aload           47
        //   273: instanceof      Lorg/spongycastle/crypto/params/ParametersWithIV;
        //   276: ifeq            288
        //   279: aload_0        
        //   280: aload           47
        //   282: checkcast       Lorg/spongycastle/crypto/params/ParametersWithIV;
        //   285: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.ivParam:Lorg/spongycastle/crypto/params/ParametersWithIV;
        //   288: iload           5
        //   290: ifeq            975
        //   293: aload_3        
        //   294: ifnonnull       317
        //   297: new             Lorg/spongycastle/crypto/params/KeyParameter;
        //   300: dup            
        //   301: aload_2        
        //   302: invokeinterface java/security/Key.getEncoded:()[B
        //   307: invokespecial   org/spongycastle/crypto/params/KeyParameter.<init>:([B)V
        //   310: astore          7
        //   312: iload           5
        //   314: ifeq            968
        //   317: aload_3        
        //   318: instanceof      Ljavax/crypto/spec/IvParameterSpec;
        //   321: istore          29
        //   323: iload           29
        //   325: ifeq            562
        //   328: aload_0        
        //   329: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.ivLength:I
        //   332: istore          31
        //   334: iload           31
        //   336: ifeq            482
        //   339: aload_3        
        //   340: checkcast       Ljavax/crypto/spec/IvParameterSpec;
        //   343: astore          38
        //   345: aload           38
        //   347: invokevirtual   javax/crypto/spec/IvParameterSpec.getIV:()[B
        //   350: arraylength    
        //   351: aload_0        
        //   352: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.ivLength:I
        //   355: if_icmpeq       441
        //   358: aload_0        
        //   359: aload_0        
        //   360: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.modeName:Ljava/lang/String;
        //   363: invokespecial   org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.isAEADModeName:(Ljava/lang/String;)Z
        //   366: istore          42
        //   368: iload           42
        //   370: ifne            441
        //   373: new             Ljava/security/InvalidAlgorithmParameterException;
        //   376: dup            
        //   377: new             Ljava/lang/StringBuilder;
        //   380: dup            
        //   381: invokespecial   java/lang/StringBuilder.<init>:()V
        //   384: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //   387: bipush          13
        //   389: aaload         
        //   390: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   393: aload_0        
        //   394: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.ivLength:I
        //   397: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   400: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //   403: bipush          20
        //   405: aaload         
        //   406: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   409: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   412: invokespecial   java/security/InvalidAlgorithmParameterException.<init>:(Ljava/lang/String;)V
        //   415: athrow         
        //   416: astore          40
        //   418: aload           40
        //   420: athrow         
        //   421: astore          48
        //   423: aload           48
        //   425: athrow         
        //   426: astore          27
        //   428: aload           27
        //   430: athrow         
        //   431: astore          28
        //   433: aload           28
        //   435: athrow         
        //   436: astore          39
        //   438: aload           39
        //   440: athrow         
        //   441: new             Lorg/spongycastle/crypto/params/ParametersWithIV;
        //   444: dup            
        //   445: new             Lorg/spongycastle/crypto/params/KeyParameter;
        //   448: dup            
        //   449: aload_2        
        //   450: invokeinterface java/security/Key.getEncoded:()[B
        //   455: invokespecial   org/spongycastle/crypto/params/KeyParameter.<init>:([B)V
        //   458: aload           38
        //   460: invokevirtual   javax/crypto/spec/IvParameterSpec.getIV:()[B
        //   463: invokespecial   org/spongycastle/crypto/params/ParametersWithIV.<init>:(Lorg/spongycastle/crypto/CipherParameters;[B)V
        //   466: astore          41
        //   468: aload_0        
        //   469: aload           41
        //   471: checkcast       Lorg/spongycastle/crypto/params/ParametersWithIV;
        //   474: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.ivParam:Lorg/spongycastle/crypto/params/ParametersWithIV;
        //   477: iload           5
        //   479: ifeq            961
        //   482: aload_0        
        //   483: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.modeName:Ljava/lang/String;
        //   486: astore          35
        //   488: aload           35
        //   490: ifnull          542
        //   493: aload_0        
        //   494: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.modeName:Ljava/lang/String;
        //   497: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //   500: bipush          16
        //   502: aaload         
        //   503: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   506: istore          37
        //   508: iload           37
        //   510: ifeq            542
        //   513: new             Ljava/security/InvalidAlgorithmParameterException;
        //   516: dup            
        //   517: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //   520: bipush          14
        //   522: aaload         
        //   523: invokespecial   java/security/InvalidAlgorithmParameterException.<init>:(Ljava/lang/String;)V
        //   526: athrow         
        //   527: astore          34
        //   529: aload           34
        //   531: athrow         
        //   532: astore          32
        //   534: aload           32
        //   536: athrow         
        //   537: astore          33
        //   539: aload           33
        //   541: athrow         
        //   542: new             Lorg/spongycastle/crypto/params/KeyParameter;
        //   545: dup            
        //   546: aload_2        
        //   547: invokeinterface java/security/Key.getEncoded:()[B
        //   552: invokespecial   org/spongycastle/crypto/params/KeyParameter.<init>:([B)V
        //   555: astore          36
        //   557: iload           5
        //   559: ifeq            581
        //   562: new             Ljava/security/InvalidAlgorithmParameterException;
        //   565: dup            
        //   566: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //   569: bipush          8
        //   571: aaload         
        //   572: invokespecial   java/security/InvalidAlgorithmParameterException.<init>:(Ljava/lang/String;)V
        //   575: athrow         
        //   576: astore          30
        //   578: aload           30
        //   580: athrow         
        //   581: aload           36
        //   583: astore          8
        //   585: aload_0        
        //   586: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.ivLength:I
        //   589: ifeq            746
        //   592: aload           8
        //   594: instanceof      Lorg/spongycastle/crypto/params/ParametersWithIV;
        //   597: istore          20
        //   599: iload           20
        //   601: ifne            746
        //   604: aload           8
        //   606: instanceof      Lorg/spongycastle/crypto/params/AEADParameters;
        //   609: istore          21
        //   611: iload           21
        //   613: ifne            746
        //   616: aload           4
        //   618: ifnonnull       954
        //   621: new             Ljava/security/SecureRandom;
        //   624: dup            
        //   625: invokespecial   java/security/SecureRandom.<init>:()V
        //   628: astore          22
        //   630: iload_1        
        //   631: iconst_1       
        //   632: if_icmpeq       640
        //   635: iload_1        
        //   636: iconst_3       
        //   637: if_icmpne       947
        //   640: aload_0        
        //   641: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.ivLength:I
        //   644: newarray        B
        //   646: astore          23
        //   648: aload           22
        //   650: aload           23
        //   652: invokevirtual   java/security/SecureRandom.nextBytes:([B)V
        //   655: new             Lorg/spongycastle/crypto/params/ParametersWithIV;
        //   658: dup            
        //   659: aload           8
        //   661: aload           23
        //   663: invokespecial   org/spongycastle/crypto/params/ParametersWithIV.<init>:(Lorg/spongycastle/crypto/CipherParameters;[B)V
        //   666: astore          11
        //   668: aload_0        
        //   669: aload           11
        //   671: checkcast       Lorg/spongycastle/crypto/params/ParametersWithIV;
        //   674: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.ivParam:Lorg/spongycastle/crypto/params/ParametersWithIV;
        //   677: iload           5
        //   679: ifeq            750
        //   682: aload_0        
        //   683: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.cipher:Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;
        //   686: invokeinterface org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher.getUnderlyingCipher:()Lorg/spongycastle/crypto/BlockCipher;
        //   691: invokeinterface org/spongycastle/crypto/BlockCipher.getAlgorithmName:()Ljava/lang/String;
        //   696: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //   699: bipush          15
        //   701: aaload         
        //   702: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   705: istore          26
        //   707: iload           26
        //   709: ifge            750
        //   712: new             Ljava/security/InvalidAlgorithmParameterException;
        //   715: dup            
        //   716: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //   719: bipush          18
        //   721: aaload         
        //   722: invokespecial   java/security/InvalidAlgorithmParameterException.<init>:(Ljava/lang/String;)V
        //   725: athrow         
        //   726: astore          25
        //   728: aload           25
        //   730: athrow         
        //   731: astore          9
        //   733: aload           9
        //   735: athrow         
        //   736: astore          10
        //   738: aload           10
        //   740: athrow         
        //   741: astore          24
        //   743: aload           24
        //   745: athrow         
        //   746: aload           8
        //   748: astore          11
        //   750: aload           4
        //   752: ifnull          940
        //   755: aload_0        
        //   756: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.padded:Z
        //   759: istore          19
        //   761: iload           19
        //   763: ifeq            940
        //   766: new             Lorg/spongycastle/crypto/params/ParametersWithRandom;
        //   769: dup            
        //   770: aload           11
        //   772: aload           4
        //   774: invokespecial   org/spongycastle/crypto/params/ParametersWithRandom.<init>:(Lorg/spongycastle/crypto/CipherParameters;Ljava/security/SecureRandom;)V
        //   777: astore          12
        //   779: iload_1        
        //   780: tableswitch {
        //                2: 877
        //                3: 894
        //                4: 877
        //                5: 894
        //          default: 812
        //        }
        //   812: new             Ljava/security/InvalidParameterException;
        //   815: dup            
        //   816: new             Ljava/lang/StringBuilder;
        //   819: dup            
        //   820: invokespecial   java/lang/StringBuilder.<init>:()V
        //   823: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //   826: bipush          9
        //   828: aaload         
        //   829: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   832: iload_1        
        //   833: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   836: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //   839: bipush          10
        //   841: aaload         
        //   842: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   845: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   848: invokespecial   java/security/InvalidParameterException.<init>:(Ljava/lang/String;)V
        //   851: athrow         
        //   852: astore          14
        //   854: aload           14
        //   856: athrow         
        //   857: astore          15
        //   859: new             Ljava/security/InvalidKeyException;
        //   862: dup            
        //   863: aload           15
        //   865: invokevirtual   java/lang/Exception.getMessage:()Ljava/lang/String;
        //   868: invokespecial   java/security/InvalidKeyException.<init>:(Ljava/lang/String;)V
        //   871: athrow         
        //   872: astore          18
        //   874: aload           18
        //   876: athrow         
        //   877: aload_0        
        //   878: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.cipher:Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;
        //   881: iconst_1       
        //   882: aload           12
        //   884: invokeinterface org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher.init:(ZLorg/spongycastle/crypto/CipherParameters;)V
        //   889: iload           5
        //   891: ifeq            911
        //   894: aload_0        
        //   895: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.cipher:Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;
        //   898: iconst_0       
        //   899: aload           12
        //   901: invokeinterface org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher.init:(ZLorg/spongycastle/crypto/CipherParameters;)V
        //   906: iload           5
        //   908: ifne            812
        //   911: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator.a:Z
        //   914: ifeq            924
        //   917: iload           5
        //   919: iconst_1       
        //   920: iadd           
        //   921: putstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseMac.a:I
        //   924: return         
        //   925: astore          17
        //   927: aload           17
        //   929: athrow         
        //   930: astore          13
        //   932: aload           13
        //   934: athrow         
        //   935: astore          16
        //   937: aload           16
        //   939: athrow         
        //   940: aload           11
        //   942: astore          12
        //   944: goto            779
        //   947: aload           8
        //   949: astore          11
        //   951: goto            682
        //   954: aload           4
        //   956: astore          22
        //   958: goto            630
        //   961: aload           41
        //   963: astore          8
        //   965: goto            585
        //   968: aload           7
        //   970: astore          8
        //   972: goto            585
        //   975: aload           47
        //   977: astore          8
        //   979: goto            585
        //   982: aload           49
        //   984: astore          47
        //   986: goto            271
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  5      72     72     77     Ljava/lang/Exception;
        //  81     101    125    130    Ljava/lang/Exception;
        //  106    120    120    125    Ljava/lang/Exception;
        //  127    130    120    125    Ljava/lang/Exception;
        //  197    203    262    267    Ljava/lang/Exception;
        //  243    257    257    262    Ljava/lang/Exception;
        //  271    288    421    426    Ljava/lang/Exception;
        //  317    323    426    431    Ljava/lang/Exception;
        //  328    334    431    436    Ljava/lang/Exception;
        //  345    368    436    441    Ljava/lang/Exception;
        //  373    416    416    421    Ljava/lang/Exception;
        //  428    431    431    436    Ljava/lang/Exception;
        //  438    441    416    421    Ljava/lang/Exception;
        //  468    477    532    537    Ljava/lang/Exception;
        //  482    488    532    537    Ljava/lang/Exception;
        //  493    508    537    542    Ljava/lang/Exception;
        //  513    527    527    532    Ljava/lang/Exception;
        //  534    537    537    542    Ljava/lang/Exception;
        //  539    542    527    532    Ljava/lang/Exception;
        //  562    576    576    581    Ljava/lang/Exception;
        //  585    599    731    736    Ljava/lang/Exception;
        //  604    611    736    741    Ljava/lang/Exception;
        //  668    677    741    746    Ljava/lang/Exception;
        //  682    707    741    746    Ljava/lang/Exception;
        //  712    726    726    731    Ljava/lang/Exception;
        //  733    736    736    741    Ljava/lang/Exception;
        //  743    746    726    731    Ljava/lang/Exception;
        //  755    761    872    877    Ljava/lang/Exception;
        //  812    852    852    872    Ljava/lang/Exception;
        //  854    857    857    872    Ljava/lang/Exception;
        //  877    889    925    930    Ljava/lang/Exception;
        //  894    906    930    935    Ljava/lang/Exception;
        //  911    924    935    940    Ljava/lang/Exception;
        //  927    930    930    935    Ljava/lang/Exception;
        //  932    935    852    872    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 443, Size: 443
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
    
    @Override
    protected void engineSetMode(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseMac.a:I
        //     3: istore_2       
        //     4: aload_0        
        //     5: aload_1        
        //     6: invokestatic    org/spongycastle/util/Strings.toUpperCase:(Ljava/lang/String;)Ljava/lang/String;
        //     9: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.modeName:Ljava/lang/String;
        //    12: aload_0        
        //    13: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.modeName:Ljava/lang/String;
        //    16: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //    19: bipush          29
        //    21: aaload         
        //    22: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    25: istore          8
        //    27: iload           8
        //    29: ifeq            56
        //    32: aload_0        
        //    33: iconst_0       
        //    34: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.ivLength:I
        //    37: aload_0        
        //    38: new             Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;
        //    41: dup            
        //    42: aload_0        
        //    43: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.baseEngine:Lorg/spongycastle/crypto/BlockCipher;
        //    46: invokespecial   org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher.<init>:(Lorg/spongycastle/crypto/BlockCipher;)V
        //    49: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.cipher:Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;
        //    52: iload_2        
        //    53: ifeq            585
        //    56: aload_0        
        //    57: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.modeName:Ljava/lang/String;
        //    60: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //    63: bipush          27
        //    65: aaload         
        //    66: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    69: istore          9
        //    71: iload           9
        //    73: ifeq            115
        //    76: aload_0        
        //    77: aload_0        
        //    78: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.baseEngine:Lorg/spongycastle/crypto/BlockCipher;
        //    81: invokeinterface org/spongycastle/crypto/BlockCipher.getBlockSize:()I
        //    86: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.ivLength:I
        //    89: aload_0        
        //    90: new             Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;
        //    93: dup            
        //    94: new             Lorg/spongycastle/crypto/modes/CBCBlockCipher;
        //    97: dup            
        //    98: aload_0        
        //    99: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.baseEngine:Lorg/spongycastle/crypto/BlockCipher;
        //   102: invokespecial   org/spongycastle/crypto/modes/CBCBlockCipher.<init>:(Lorg/spongycastle/crypto/BlockCipher;)V
        //   105: invokespecial   org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher.<init>:(Lorg/spongycastle/crypto/BlockCipher;)V
        //   108: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.cipher:Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;
        //   111: iload_2        
        //   112: ifeq            585
        //   115: aload_0        
        //   116: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.modeName:Ljava/lang/String;
        //   119: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //   122: bipush          28
        //   124: aaload         
        //   125: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   128: ifeq            238
        //   131: aload_0        
        //   132: aload_0        
        //   133: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.baseEngine:Lorg/spongycastle/crypto/BlockCipher;
        //   136: invokeinterface org/spongycastle/crypto/BlockCipher.getBlockSize:()I
        //   141: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.ivLength:I
        //   144: aload_0        
        //   145: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.modeName:Ljava/lang/String;
        //   148: invokevirtual   java/lang/String.length:()I
        //   151: istore          21
        //   153: iload           21
        //   155: iconst_3       
        //   156: if_icmpeq       200
        //   159: aload_0        
        //   160: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.modeName:Ljava/lang/String;
        //   163: iconst_3       
        //   164: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   167: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   170: istore          23
        //   172: aload_0        
        //   173: new             Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;
        //   176: dup            
        //   177: new             Lorg/spongycastle/crypto/modes/OFBBlockCipher;
        //   180: dup            
        //   181: aload_0        
        //   182: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.baseEngine:Lorg/spongycastle/crypto/BlockCipher;
        //   185: iload           23
        //   187: invokespecial   org/spongycastle/crypto/modes/OFBBlockCipher.<init>:(Lorg/spongycastle/crypto/BlockCipher;I)V
        //   190: invokespecial   org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher.<init>:(Lorg/spongycastle/crypto/BlockCipher;)V
        //   193: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.cipher:Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;
        //   196: iload_2        
        //   197: ifeq            585
        //   200: aload_0        
        //   201: new             Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;
        //   204: dup            
        //   205: new             Lorg/spongycastle/crypto/modes/OFBBlockCipher;
        //   208: dup            
        //   209: aload_0        
        //   210: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.baseEngine:Lorg/spongycastle/crypto/BlockCipher;
        //   213: bipush          8
        //   215: aload_0        
        //   216: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.baseEngine:Lorg/spongycastle/crypto/BlockCipher;
        //   219: invokeinterface org/spongycastle/crypto/BlockCipher.getBlockSize:()I
        //   224: imul           
        //   225: invokespecial   org/spongycastle/crypto/modes/OFBBlockCipher.<init>:(Lorg/spongycastle/crypto/BlockCipher;I)V
        //   228: invokespecial   org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher.<init>:(Lorg/spongycastle/crypto/BlockCipher;)V
        //   231: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.cipher:Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;
        //   234: iload_2        
        //   235: ifeq            585
        //   238: aload_0        
        //   239: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.modeName:Ljava/lang/String;
        //   242: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //   245: bipush          24
        //   247: aaload         
        //   248: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   251: ifeq            361
        //   254: aload_0        
        //   255: aload_0        
        //   256: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.baseEngine:Lorg/spongycastle/crypto/BlockCipher;
        //   259: invokeinterface org/spongycastle/crypto/BlockCipher.getBlockSize:()I
        //   264: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.ivLength:I
        //   267: aload_0        
        //   268: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.modeName:Ljava/lang/String;
        //   271: invokevirtual   java/lang/String.length:()I
        //   274: istore          17
        //   276: iload           17
        //   278: iconst_3       
        //   279: if_icmpeq       323
        //   282: aload_0        
        //   283: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.modeName:Ljava/lang/String;
        //   286: iconst_3       
        //   287: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   290: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   293: istore          19
        //   295: aload_0        
        //   296: new             Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;
        //   299: dup            
        //   300: new             Lorg/spongycastle/crypto/modes/CFBBlockCipher;
        //   303: dup            
        //   304: aload_0        
        //   305: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.baseEngine:Lorg/spongycastle/crypto/BlockCipher;
        //   308: iload           19
        //   310: invokespecial   org/spongycastle/crypto/modes/CFBBlockCipher.<init>:(Lorg/spongycastle/crypto/BlockCipher;I)V
        //   313: invokespecial   org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher.<init>:(Lorg/spongycastle/crypto/BlockCipher;)V
        //   316: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.cipher:Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;
        //   319: iload_2        
        //   320: ifeq            585
        //   323: aload_0        
        //   324: new             Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;
        //   327: dup            
        //   328: new             Lorg/spongycastle/crypto/modes/CFBBlockCipher;
        //   331: dup            
        //   332: aload_0        
        //   333: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.baseEngine:Lorg/spongycastle/crypto/BlockCipher;
        //   336: bipush          8
        //   338: aload_0        
        //   339: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.baseEngine:Lorg/spongycastle/crypto/BlockCipher;
        //   342: invokeinterface org/spongycastle/crypto/BlockCipher.getBlockSize:()I
        //   347: imul           
        //   348: invokespecial   org/spongycastle/crypto/modes/CFBBlockCipher.<init>:(Lorg/spongycastle/crypto/BlockCipher;I)V
        //   351: invokespecial   org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher.<init>:(Lorg/spongycastle/crypto/BlockCipher;)V
        //   354: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.cipher:Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;
        //   357: iload_2        
        //   358: ifeq            585
        //   361: aload_0        
        //   362: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.modeName:Ljava/lang/String;
        //   365: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //   368: bipush          25
        //   370: aaload         
        //   371: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   374: istore          15
        //   376: iload           15
        //   378: ifeq            427
        //   381: aload_0        
        //   382: aload_0        
        //   383: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.baseEngine:Lorg/spongycastle/crypto/BlockCipher;
        //   386: invokeinterface org/spongycastle/crypto/BlockCipher.getBlockSize:()I
        //   391: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.ivLength:I
        //   394: aload_0        
        //   395: new             Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;
        //   398: dup            
        //   399: new             Lorg/spongycastle/crypto/BufferedBlockCipher;
        //   402: dup            
        //   403: new             Lorg/spongycastle/crypto/modes/SICBlockCipher;
        //   406: dup            
        //   407: aload_0        
        //   408: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.baseEngine:Lorg/spongycastle/crypto/BlockCipher;
        //   411: invokespecial   org/spongycastle/crypto/modes/SICBlockCipher.<init>:(Lorg/spongycastle/crypto/BlockCipher;)V
        //   414: invokespecial   org/spongycastle/crypto/BufferedBlockCipher.<init>:(Lorg/spongycastle/crypto/BlockCipher;)V
        //   417: invokespecial   org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher.<init>:(Lorg/spongycastle/crypto/BufferedBlockCipher;)V
        //   420: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.cipher:Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;
        //   423: iload_2        
        //   424: ifeq            585
        //   427: aload_0        
        //   428: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.modeName:Ljava/lang/String;
        //   431: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //   434: bipush          23
        //   436: aaload         
        //   437: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   440: istore          16
        //   442: iload           16
        //   444: ifeq            486
        //   447: aload_0        
        //   448: aload_0        
        //   449: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.baseEngine:Lorg/spongycastle/crypto/BlockCipher;
        //   452: invokeinterface org/spongycastle/crypto/BlockCipher.getBlockSize:()I
        //   457: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.ivLength:I
        //   460: aload_0        
        //   461: new             Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$AEADGenericBlockCipher;
        //   464: dup            
        //   465: new             Lorg/spongycastle/crypto/modes/GCMBlockCipher;
        //   468: dup            
        //   469: aload_0        
        //   470: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.baseEngine:Lorg/spongycastle/crypto/BlockCipher;
        //   473: invokespecial   org/spongycastle/crypto/modes/GCMBlockCipher.<init>:(Lorg/spongycastle/crypto/BlockCipher;)V
        //   476: invokespecial   org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$AEADGenericBlockCipher.<init>:(Lorg/spongycastle/crypto/modes/AEADBlockCipher;)V
        //   479: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.cipher:Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;
        //   482: iload_2        
        //   483: ifeq            585
        //   486: new             Ljava/security/NoSuchAlgorithmException;
        //   489: dup            
        //   490: new             Ljava/lang/StringBuilder;
        //   493: dup            
        //   494: invokespecial   java/lang/StringBuilder.<init>:()V
        //   497: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //   500: bipush          26
        //   502: aaload         
        //   503: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   506: aload_1        
        //   507: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   510: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   513: invokespecial   java/security/NoSuchAlgorithmException.<init>:(Ljava/lang/String;)V
        //   516: athrow         
        //   517: astore          14
        //   519: aload           14
        //   521: athrow         
        //   522: astore_3       
        //   523: aload_3        
        //   524: athrow         
        //   525: astore          4
        //   527: aload           4
        //   529: athrow         
        //   530: astore          5
        //   532: aload           5
        //   534: athrow         
        //   535: astore          6
        //   537: aload           6
        //   539: athrow         
        //   540: astore          7
        //   542: aload           7
        //   544: athrow         
        //   545: astore          24
        //   547: aload           24
        //   549: athrow         
        //   550: astore          22
        //   552: aload           22
        //   554: athrow         
        //   555: astore          10
        //   557: aload           10
        //   559: athrow         
        //   560: astore          20
        //   562: aload           20
        //   564: athrow         
        //   565: astore          18
        //   567: aload           18
        //   569: athrow         
        //   570: astore          11
        //   572: aload           11
        //   574: athrow         
        //   575: astore          12
        //   577: aload           12
        //   579: athrow         
        //   580: astore          13
        //   582: aload           13
        //   584: athrow         
        //   585: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  4      27     522    525    Ljava/lang/RuntimeException;
        //  32     52     525    530    Ljava/lang/RuntimeException;
        //  56     71     530    535    Ljava/lang/RuntimeException;
        //  76     111    535    540    Ljava/lang/RuntimeException;
        //  115    153    540    545    Ljava/lang/RuntimeException;
        //  172    196    545    550    Ljava/lang/RuntimeException;
        //  200    234    550    555    Ljava/lang/RuntimeException;
        //  238    276    555    560    Ljava/lang/RuntimeException;
        //  295    319    560    565    Ljava/lang/RuntimeException;
        //  323    357    565    570    Ljava/lang/RuntimeException;
        //  361    376    570    575    Ljava/lang/RuntimeException;
        //  381    423    575    580    Ljava/lang/RuntimeException;
        //  427    442    580    585    Ljava/lang/RuntimeException;
        //  447    482    517    522    Ljava/lang/RuntimeException;
        //  486    517    517    522    Ljava/lang/RuntimeException;
        //  523    525    525    530    Ljava/lang/RuntimeException;
        //  527    530    530    535    Ljava/lang/RuntimeException;
        //  532    535    535    540    Ljava/lang/RuntimeException;
        //  537    540    540    545    Ljava/lang/RuntimeException;
        //  547    550    550    555    Ljava/lang/RuntimeException;
        //  552    555    555    560    Ljava/lang/RuntimeException;
        //  562    565    565    570    Ljava/lang/RuntimeException;
        //  567    570    570    575    Ljava/lang/RuntimeException;
        //  572    575    575    580    Ljava/lang/RuntimeException;
        //  577    580    580    585    Ljava/lang/RuntimeException;
        //  582    585    517    522    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 275, Size: 275
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
    
    @Override
    protected void engineSetPadding(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseMac.a:I
        //     3: istore_2       
        //     4: aload_1        
        //     5: invokestatic    org/spongycastle/util/Strings.toUpperCase:(Ljava/lang/String;)Ljava/lang/String;
        //     8: astore_3       
        //     9: aload_3        
        //    10: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //    13: iconst_0       
        //    14: aaload         
        //    15: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    18: istore          8
        //    20: iload           8
        //    22: ifeq            72
        //    25: aload_0        
        //    26: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.cipher:Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;
        //    29: invokeinterface org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher.wrapOnNoPadding:()Z
        //    34: istore          14
        //    36: iload           14
        //    38: ifeq            230
        //    41: aload_0        
        //    42: new             Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;
        //    45: dup            
        //    46: new             Lorg/spongycastle/crypto/BufferedBlockCipher;
        //    49: dup            
        //    50: aload_0        
        //    51: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.cipher:Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;
        //    54: invokeinterface org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher.getUnderlyingCipher:()Lorg/spongycastle/crypto/BlockCipher;
        //    59: invokespecial   org/spongycastle/crypto/BufferedBlockCipher.<init>:(Lorg/spongycastle/crypto/BlockCipher;)V
        //    62: invokespecial   org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher.<init>:(Lorg/spongycastle/crypto/BufferedBlockCipher;)V
        //    65: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.cipher:Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;
        //    68: iload_2        
        //    69: ifeq            230
        //    72: aload_0        
        //    73: iconst_1       
        //    74: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.padded:Z
        //    77: aload_0        
        //    78: aload_0        
        //    79: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.modeName:Ljava/lang/String;
        //    82: invokespecial   org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.isAEADModeName:(Ljava/lang/String;)Z
        //    85: ifeq            121
        //    88: new             Ljavax/crypto/NoSuchPaddingException;
        //    91: dup            
        //    92: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //    95: iconst_3       
        //    96: aaload         
        //    97: invokespecial   javax/crypto/NoSuchPaddingException.<init>:(Ljava/lang/String;)V
        //   100: athrow         
        //   101: astore          7
        //   103: aload           7
        //   105: athrow         
        //   106: astore          4
        //   108: aload           4
        //   110: athrow         
        //   111: astore          5
        //   113: aload           5
        //   115: athrow         
        //   116: astore          6
        //   118: aload           6
        //   120: athrow         
        //   121: aload_3        
        //   122: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //   125: iconst_4       
        //   126: aaload         
        //   127: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   130: istore          12
        //   132: iload           12
        //   134: ifne            153
        //   137: aload_3        
        //   138: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //   141: iconst_5       
        //   142: aaload         
        //   143: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   146: istore          13
        //   148: iload           13
        //   150: ifeq            177
        //   153: aload_0        
        //   154: new             Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;
        //   157: dup            
        //   158: aload_0        
        //   159: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.cipher:Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;
        //   162: invokeinterface org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher.getUnderlyingCipher:()Lorg/spongycastle/crypto/BlockCipher;
        //   167: invokespecial   org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher.<init>:(Lorg/spongycastle/crypto/BlockCipher;)V
        //   170: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.cipher:Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;
        //   173: iload_2        
        //   174: ifeq            230
        //   177: new             Ljavax/crypto/NoSuchPaddingException;
        //   180: dup            
        //   181: new             Ljava/lang/StringBuilder;
        //   184: dup            
        //   185: invokespecial   java/lang/StringBuilder.<init>:()V
        //   188: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //   191: iconst_2       
        //   192: aaload         
        //   193: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   196: aload_1        
        //   197: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   200: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher.z:[Ljava/lang/String;
        //   203: iconst_1       
        //   204: aaload         
        //   205: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   208: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   211: invokespecial   javax/crypto/NoSuchPaddingException.<init>:(Ljava/lang/String;)V
        //   214: athrow         
        //   215: astore          11
        //   217: aload           11
        //   219: athrow         
        //   220: astore          9
        //   222: aload           9
        //   224: athrow         
        //   225: astore          10
        //   227: aload           10
        //   229: athrow         
        //   230: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  9      20     106    111    Ljava/lang/RuntimeException;
        //  25     36     111    116    Ljava/lang/RuntimeException;
        //  41     68     116    121    Ljava/lang/RuntimeException;
        //  72     101    101    106    Ljava/lang/RuntimeException;
        //  108    111    111    116    Ljava/lang/RuntimeException;
        //  113    116    116    121    Ljava/lang/RuntimeException;
        //  118    121    101    106    Ljava/lang/RuntimeException;
        //  121    132    220    225    Ljava/lang/RuntimeException;
        //  137    148    225    230    Ljava/lang/RuntimeException;
        //  153    173    215    220    Ljava/lang/RuntimeException;
        //  177    215    215    220    Ljava/lang/RuntimeException;
        //  222    225    225    230    Ljava/lang/RuntimeException;
        //  227    230    215    220    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 113, Size: 113
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
    
    @Override
    protected int engineUpdate(final byte[] array, final int n, final int n2, final byte[] array2, final int n3) {
        try {
            return this.cipher.processBytes(array, n, n2, array2, n3);
        }
        catch (DataLengthException ex) {
            throw new ShortBufferException(ex.getMessage());
        }
    }
    
    @Override
    protected byte[] engineUpdate(final byte[] array, final int n, final int n2) {
        final int updateOutputSize = this.cipher.getUpdateOutputSize(n2);
        if (updateOutputSize > 0) {
            byte[] array2 = new byte[updateOutputSize];
            final int processBytes = this.cipher.processBytes(array, n, n2, array2, 0);
            if (processBytes == 0) {
                array2 = null;
            }
            else if (processBytes != array2.length) {
                final byte[] array3 = new byte[processBytes];
                System.arraycopy(array2, 0, array3, 0, processBytes);
                return array3;
            }
            return array2;
        }
        this.cipher.processBytes(array, n, n2, null, 0);
        return null;
    }
    
    @Override
    protected void engineUpdateAAD(final ByteBuffer byteBuffer) {
        this.engineUpdateAAD(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
    }
    
    @Override
    protected void engineUpdateAAD(final byte[] array, final int n, final int n2) {
        this.cipher.updateAAD(array, n, n2);
    }
}
