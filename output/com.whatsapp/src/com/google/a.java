// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.IOException;
import java.math.BigInteger;

public final class a
{
    private static final f3 a;
    private static final f3 b;
    private static final f3 c;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[24];
        final char[] charArray = "h]".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c2 = charArray[n];
            char c3 = '\0';
            switch (n % 5) {
                default: {
                    c3 = '\u001d';
                    break;
                }
                case 0: {
                    c3 = '4';
                    break;
                }
                case 1: {
                    c3 = ';';
                    break;
                }
                case 2: {
                    c3 = '6';
                    break;
                }
                case 3: {
                    c3 = '\u0006';
                    break;
                }
            }
            charArray[n] = (char)(c3 ^ c2);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "hY".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c4 = charArray2[n2];
            char c5 = '\0';
            switch (n2 % 5) {
                default: {
                    c5 = '\u001d';
                    break;
                }
                case 0: {
                    c5 = '4';
                    break;
                }
                case 1: {
                    c5 = ';';
                    break;
                }
                case 2: {
                    c5 = '6';
                    break;
                }
                case 3: {
                    c5 = '\u0006';
                    break;
                }
            }
            charArray2[n2] = (char)(c5 ^ c4);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "h\u0019".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c6 = charArray3[n3];
            char c7 = '\0';
            switch (n3 % 5) {
                default: {
                    c7 = '\u001d';
                    break;
                }
                case 0: {
                    c7 = '4';
                    break;
                }
                case 1: {
                    c7 = ';';
                    break;
                }
                case 2: {
                    c7 = '6';
                    break;
                }
                case 3: {
                    c7 = '\u0006';
                    break;
                }
            }
            charArray3[n3] = (char)(c7 ^ c6);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "h\u001c".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c8 = charArray4[n4];
            char c9 = '\0';
            switch (n4 % 5) {
                default: {
                    c9 = '\u001d';
                    break;
                }
                case 0: {
                    c9 = '4';
                    break;
                }
                case 1: {
                    c9 = ';';
                    break;
                }
                case 2: {
                    c9 = '6';
                    break;
                }
                case 3: {
                    c9 = '\u0006';
                    break;
                }
            }
            charArray4[n4] = (char)(c9 ^ c8);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "hI".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c10 = charArray5[n5];
            char c11 = '\0';
            switch (n5 % 5) {
                default: {
                    c11 = '\u001d';
                    break;
                }
                case 0: {
                    c11 = '4';
                    break;
                }
                case 1: {
                    c11 = ';';
                    break;
                }
                case 2: {
                    c11 = '6';
                    break;
                }
                case 3: {
                    c11 = '\u0006';
                    break;
                }
            }
            charArray5[n5] = (char)(c11 ^ c10);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "hU".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c12 = charArray6[n6];
            char c13 = '\0';
            switch (n6 % 5) {
                default: {
                    c13 = '\u001d';
                    break;
                }
                case 0: {
                    c13 = '4';
                    break;
                }
                case 1: {
                    c13 = ';';
                    break;
                }
                case 2: {
                    c13 = '6';
                    break;
                }
                case 3: {
                    c13 = '\u0006';
                    break;
                }
            }
            charArray6[n6] = (char)(c13 ^ c12);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "hM".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c14 = charArray7[n7];
            char c15 = '\0';
            switch (n7 % 5) {
                default: {
                    c15 = '\u001d';
                    break;
                }
                case 0: {
                    c15 = '4';
                    break;
                }
                case 1: {
                    c15 = ';';
                    break;
                }
                case 2: {
                    c15 = '6';
                    break;
                }
                case 3: {
                    c15 = '\u0006';
                    break;
                }
            }
            charArray7[n7] = (char)(c15 ^ c14);
        }
        z2[6] = new String(charArray7).intern();
        final char[] charArray8 = "hZ".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c16 = charArray8[n8];
            char c17 = '\0';
            switch (n8 % 5) {
                default: {
                    c17 = '\u001d';
                    break;
                }
                case 0: {
                    c17 = '4';
                    break;
                }
                case 1: {
                    c17 = ';';
                    break;
                }
                case 2: {
                    c17 = '6';
                    break;
                }
                case 3: {
                    c17 = '\u0006';
                    break;
                }
            }
            charArray8[n8] = (char)(c17 ^ c16);
        }
        z2[7] = new String(charArray8).intern();
        final char[] charArray9 = "hO".toCharArray();
        for (int length5 = charArray9.length, n9 = 0; length5 > n9; ++n9) {
            final char c18 = charArray9[n9];
            char c19 = '\0';
            switch (n9 % 5) {
                default: {
                    c19 = '\u001d';
                    break;
                }
                case 0: {
                    c19 = '4';
                    break;
                }
                case 1: {
                    c19 = ';';
                    break;
                }
                case 2: {
                    c19 = '6';
                    break;
                }
                case 3: {
                    c19 = '\u0006';
                    break;
                }
            }
            charArray9[n9] = (char)(c19 ^ c18);
        }
        z2[8] = new String(charArray9).intern();
        final char[] charArray10 = "hg".toCharArray();
        for (int length6 = charArray10.length, n10 = 0; length6 > n10; ++n10) {
            final char c20 = charArray10[n10];
            char c21 = '\0';
            switch (n10 % 5) {
                default: {
                    c21 = '\u001d';
                    break;
                }
                case 0: {
                    c21 = '4';
                    break;
                }
                case 1: {
                    c21 = ';';
                    break;
                }
                case 2: {
                    c21 = '6';
                    break;
                }
                case 3: {
                    c21 = '\u0006';
                    break;
                }
            }
            charArray10[n10] = (char)(c21 ^ c20);
        }
        z2[9] = new String(charArray10).intern();
        final char[] charArray11 = "}U@gq]_\u0016cnWZFc=G^GsxZXS<=\u0013gN!=CRBn=ZT\u0016btSRBu".toCharArray();
        for (int length7 = charArray11.length, n11 = 0; length7 > n11; ++n11) {
            final char c22 = charArray11[n11];
            char c23 = '\0';
            switch (n11 % 5) {
                default: {
                    c23 = '\u001d';
                    break;
                }
                case 0: {
                    c23 = '4';
                    break;
                }
                case 1: {
                    c23 = ';';
                    break;
                }
                case 2: {
                    c23 = '6';
                    break;
                }
                case 3: {
                    c23 = '\u0006';
                    break;
                }
            }
            charArray11[n11] = (char)(c23 ^ c22);
        }
        z2[10] = new String(charArray11).intern();
        final char[] charArray12 = "}U@gq]_\u0016cnWZFc=G^GsxZXS<=\u0013g".toCharArray();
        for (int length8 = charArray12.length, n12 = 0; length8 > n12; ++n12) {
            final char c24 = charArray12[n12];
            char c25 = '\0';
            switch (n12 % 5) {
                default: {
                    c25 = '\u001d';
                    break;
                }
                case 0: {
                    c25 = '4';
                    break;
                }
                case 1: {
                    c25 = ';';
                    break;
                }
                case 2: {
                    c25 = '6';
                    break;
                }
                case 3: {
                    c25 = '\u0006';
                    break;
                }
            }
            charArray12[n12] = (char)(c25 ^ c24);
        }
        z2[11] = new String(charArray12).intern();
        final char[] charArray13 = "}U@gq]_\u0016cnWZFc=G^GsxZXS<=\u0013g\u0011&|@\u001bShy\u0014TP&n@I_hz\u001a".toCharArray();
        for (int length9 = charArray13.length, n13 = 0; length9 > n13; ++n13) {
            final char c26 = charArray13[n13];
            char c27 = '\0';
            switch (n13 % 5) {
                default: {
                    c27 = '\u001d';
                    break;
                }
                case 0: {
                    c27 = '4';
                    break;
                }
                case 1: {
                    c27 = ';';
                    break;
                }
                case 2: {
                    c27 = '6';
                    break;
                }
                case 3: {
                    c27 = '\u0006';
                    break;
                }
            }
            charArray13[n13] = (char)(c27 ^ c26);
        }
        z2[12] = new String(charArray13).intern();
        final char[] charArray14 = "\u0004C\u00136,\u0002C".toCharArray();
        for (int length10 = charArray14.length, n14 = 0; length10 > n14; ++n14) {
            final char c28 = charArray14[n14];
            char c29 = '\0';
            switch (n14 % 5) {
                default: {
                    c29 = '\u001d';
                    break;
                }
                case 0: {
                    c29 = '4';
                    break;
                }
                case 1: {
                    c29 = ';';
                    break;
                }
                case 2: {
                    c29 = '6';
                    break;
                }
                case 3: {
                    c29 = '\u0006';
                    break;
                }
            }
            charArray14[n14] = (char)(c29 ^ c28);
        }
        z2[13] = new String(charArray14).intern();
        final char[] charArray15 = "vZR&iU\\\f&".toCharArray();
        for (int length11 = charArray15.length, n15 = 0; length11 > n15; ++n15) {
            final char c30 = charArray15[n15];
            char c31 = '\0';
            switch (n15 % 5) {
                default: {
                    c31 = '\u001d';
                    break;
                }
                case 0: {
                    c31 = '4';
                    break;
                }
                case 1: {
                    c31 = ';';
                    break;
                }
                case 2: {
                    c31 = '6';
                    break;
                }
                case 3: {
                    c31 = '\u0006';
                    break;
                }
            }
            charArray15[n15] = (char)(c31 ^ c30);
        }
        z2[14] = new String(charArray15).intern();
        final char[] charArray16 = "\u0004C\u00136%L".toCharArray();
        for (int length12 = charArray16.length, n16 = 0; length12 > n16; ++n16) {
            final char c32 = charArray16[n16];
            char c33 = '\0';
            switch (n16 % 5) {
                default: {
                    c33 = '\u001d';
                    break;
                }
                case 0: {
                    c33 = '4';
                    break;
                }
                case 1: {
                    c33 = ';';
                    break;
                }
                case 2: {
                    c33 = '6';
                    break;
                }
                case 3: {
                    c33 = '\u0006';
                    break;
                }
            }
            charArray16[n16] = (char)(c33 ^ c32);
        }
        z2[15] = new String(charArray16).intern();
        final char[] charArray17 = "zN[dxF\u001bYsi\u0014TP&oUUQc=RTD&.\u0006\u0016Toi\u0014H_asQ_\u0016os@^Qco\u000e\u001b".toCharArray();
        for (int length13 = charArray17.length, n17 = 0; length13 > n17; ++n17) {
            final char c34 = charArray17[n17];
            char c35 = '\0';
            switch (n17 % 5) {
                default: {
                    c35 = '\u001d';
                    break;
                }
                case 0: {
                    c35 = '4';
                    break;
                }
                case 1: {
                    c35 = ';';
                    break;
                }
                case 2: {
                    c35 = '6';
                    break;
                }
                case 3: {
                    c35 = '\u0006';
                    break;
                }
            }
            charArray17[n17] = (char)(c35 ^ c34);
        }
        z2[16] = new String(charArray17).intern();
        final char[] charArray18 = "zN[dxF\u001bYsi\u0014TP&oUUQc=RTD&+\u0000\u0016Toi\u0014H_asQ_\u0016os@^Qco\u000e\u001b".toCharArray();
        for (int length14 = charArray18.length, n18 = 0; length14 > n18; ++n18) {
            final char c36 = charArray18[n18];
            char c37 = '\0';
            switch (n18 % 5) {
                default: {
                    c37 = '\u001d';
                    break;
                }
                case 0: {
                    c37 = '4';
                    break;
                }
                case 1: {
                    c37 = ';';
                    break;
                }
                case 2: {
                    c37 = '6';
                    break;
                }
                case 3: {
                    c37 = '\u0006';
                    break;
                }
            }
            charArray18[n18] = (char)(c37 ^ c36);
        }
        z2[17] = new String(charArray18).intern();
        final char[] charArray19 = "zN[dxF\u001b[sn@\u001bTc=DTEoi]MS<=".toCharArray();
        for (int length15 = charArray19.length, n19 = 0; length15 > n19; ++n19) {
            final char c38 = charArray19[n19];
            char c39 = '\0';
            switch (n19 % 5) {
                default: {
                    c39 = '\u001d';
                    break;
                }
                case 0: {
                    c39 = '4';
                    break;
                }
                case 1: {
                    c39 = ';';
                    break;
                }
                case 2: {
                    c39 = '6';
                    break;
                }
                case 3: {
                    c39 = '\u0006';
                    break;
                }
            }
            charArray19[n19] = (char)(c39 ^ c38);
        }
        z2[18] = new String(charArray19).intern();
        final char[] charArray20 = "zN[dxF\u001bYsi\u0014TP&oUUQc=RTD&.\u0006\u0016Toi\u0014NXutSUSb=]UBczQI\f&".toCharArray();
        for (int length16 = charArray20.length, n20 = 0; length16 > n20; ++n20) {
            final char c40 = charArray20[n20];
            char c41 = '\0';
            switch (n20 % 5) {
                default: {
                    c41 = '\u001d';
                    break;
                }
                case 0: {
                    c41 = '4';
                    break;
                }
                case 1: {
                    c41 = ';';
                    break;
                }
                case 2: {
                    c41 = '6';
                    break;
                }
                case 3: {
                    c41 = '\u0006';
                    break;
                }
            }
            charArray20[n20] = (char)(c41 ^ c40);
        }
        z2[19] = new String(charArray20).intern();
        final char[] charArray21 = "zN[dxF\u001bYsi\u0014TP&oUUQc=RTD&.\u0006\u0016Toi\u0014H_asQ_\u0016os@^Qco\u000e\u001b".toCharArray();
        for (int length17 = charArray21.length, n21 = 0; length17 > n21; ++n21) {
            final char c42 = charArray21[n21];
            char c43 = '\0';
            switch (n21 % 5) {
                default: {
                    c43 = '\u001d';
                    break;
                }
                case 0: {
                    c43 = '4';
                    break;
                }
                case 1: {
                    c43 = ';';
                    break;
                }
                case 2: {
                    c43 = '6';
                    break;
                }
                case 3: {
                    c43 = '\u0006';
                    break;
                }
            }
            charArray21[n21] = (char)(c43 ^ c42);
        }
        z2[20] = new String(charArray21).intern();
        final char[] charArray22 = "\u0004C".toCharArray();
        for (int length18 = charArray22.length, n22 = 0; length18 > n22; ++n22) {
            final char c44 = charArray22[n22];
            char c45 = '\0';
            switch (n22 % 5) {
                default: {
                    c45 = '\u001d';
                    break;
                }
                case 0: {
                    c45 = '4';
                    break;
                }
                case 1: {
                    c45 = ';';
                    break;
                }
                case 2: {
                    c45 = '6';
                    break;
                }
                case 3: {
                    c45 = '\u0006';
                    break;
                }
            }
            charArray22[n22] = (char)(c45 ^ c44);
        }
        z2[21] = new String(charArray22).intern();
        final char[] charArray23 = "zN[dxF\u001bYsi\u0014TP&oUUQc=RTD&.\u0006\u0016Toi\u0014NXutSUSb=]UBczQI\f&".toCharArray();
        for (int length19 = charArray23.length, n23 = 0; length19 > n23; ++n23) {
            final char c46 = charArray23[n23];
            char c47 = '\0';
            switch (n23 % 5) {
                default: {
                    c47 = '\u001d';
                    break;
                }
                case 0: {
                    c47 = '4';
                    break;
                }
                case 1: {
                    c47 = ';';
                    break;
                }
                case 2: {
                    c47 = '6';
                    break;
                }
                case 3: {
                    c47 = '\u0006';
                    break;
                }
            }
            charArray23[n23] = (char)(c47 ^ c46);
        }
        z2[22] = new String(charArray23).intern();
        final char[] charArray24 = "zN[dxF\u001bYsi\u0014TP&oUUQc=RTD&+\u0000\u0016Toi\u0014NXutSUSb=]UBczQI\f&".toCharArray();
        for (int length20 = charArray24.length, n24 = 0; length20 > n24; ++n24) {
            final char c48 = charArray24[n24];
            char c49 = '\0';
            switch (n24 % 5) {
                default: {
                    c49 = '\u001d';
                    break;
                }
                case 0: {
                    c49 = '4';
                    break;
                }
                case 1: {
                    c49 = ';';
                    break;
                }
                case 2: {
                    c49 = '6';
                    break;
                }
                case 3: {
                    c49 = '\u0006';
                    break;
                }
            }
            charArray24[n24] = (char)(c49 ^ c48);
        }
        z2[23] = new String(charArray24).intern();
        z = z2;
        b = new f3(null);
        c = f3.a(new f3(null), true);
        a = f3.b(new f3(null), false);
    }
    
    private static long a(final String s, final boolean b, final boolean b2) {
        int n = 1;
        while (true) {
            Label_0516: {
                try {
                    if (!s.startsWith("-", 0)) {
                        break Label_0516;
                    }
                    if (!b) {
                        try {
                            throw new NumberFormatException(com.google.a.z[18] + s);
                        }
                        catch (IllegalStateException ex) {
                            throw ex;
                        }
                    }
                }
                catch (IllegalStateException ex2) {
                    throw ex2;
                }
                final int n2 = n;
                while (true) {
                    Label_0187: {
                        if (!s.startsWith(com.google.a.z[21], n2)) {
                            break Label_0187;
                        }
                        final int n3 = n2 + 2;
                        final int n4 = 16;
                        final String substring = s.substring(n3);
                        if (substring.length() < 16) {
                            final long long1 = Long.parseLong(substring, n4);
                            long longValue;
                            if (n != 0) {
                                longValue = -long1;
                            }
                            else {
                                longValue = long1;
                            }
                            if (b2) {
                                return longValue;
                            }
                            if (b) {
                                if (longValue <= 2147483647L) {
                                    if (longValue >= -2147483648L) {
                                        return longValue;
                                    }
                                }
                                try {
                                    throw new NumberFormatException(com.google.a.z[20] + s);
                                }
                                catch (IllegalStateException ex3) {
                                    throw ex3;
                                }
                                break Label_0187;
                            }
                            if (longValue < 4294967296L) {
                                if (longValue >= 0L) {
                                    return longValue;
                                }
                            }
                            try {
                                throw new NumberFormatException(com.google.a.z[22] + s);
                            }
                            catch (IllegalStateException ex4) {
                                throw ex4;
                            }
                        }
                        final BigInteger bigInteger = new BigInteger(substring, n4);
                        BigInteger negate;
                        if (n != 0) {
                            negate = bigInteger.negate();
                        }
                        else {
                            negate = bigInteger;
                        }
                        if (!b2) {
                            if (b) {
                                try {
                                    if (negate.bitLength() > 31) {
                                        throw new NumberFormatException(com.google.a.z[16] + s);
                                    }
                                    return negate.longValue();
                                }
                                catch (IllegalStateException ex5) {
                                    throw ex5;
                                }
                            }
                            try {
                                if (negate.bitLength() > 32) {
                                    throw new NumberFormatException(com.google.a.z[19] + s);
                                }
                                return negate.longValue();
                            }
                            catch (IllegalStateException ex6) {
                                throw ex6;
                            }
                        }
                        if (b) {
                            try {
                                if (negate.bitLength() > 63) {
                                    throw new NumberFormatException(com.google.a.z[17] + s);
                                }
                                return negate.longValue();
                            }
                            catch (IllegalStateException ex7) {
                                throw ex7;
                            }
                        }
                        try {
                            if (negate.bitLength() > 64) {
                                throw new NumberFormatException(com.google.a.z[23] + s);
                            }
                        }
                        catch (IllegalStateException ex8) {
                            throw ex8;
                        }
                        return negate.longValue();
                    }
                    if (s.startsWith("0", n2)) {
                        final int n3 = n2;
                        final int n4 = 8;
                        continue;
                    }
                    final int n3 = n2;
                    final int n4 = 10;
                    continue;
                }
            }
            n = 0;
            final int n2 = 0;
            continue;
        }
    }
    
    static hv a(final CharSequence p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokeinterface java/lang/CharSequence.toString:()Ljava/lang/String;
        //     6: invokestatic    com/google/hv.b:(Ljava/lang/String;)Lcom/google/hv;
        //     9: astore_1       
        //    10: aload_1        
        //    11: invokevirtual   com/google/hv.c:()I
        //    14: newarray        B
        //    16: astore_2       
        //    17: iconst_0       
        //    18: istore_3       
        //    19: iconst_0       
        //    20: istore          4
        //    22: iload_3        
        //    23: aload_1        
        //    24: invokevirtual   com/google/hv.c:()I
        //    27: if_icmpge       713
        //    30: aload_1        
        //    31: iload_3        
        //    32: invokevirtual   com/google/hv.b:(I)B
        //    35: istore          5
        //    37: iload           5
        //    39: bipush          92
        //    41: if_icmpne       691
        //    44: iload_3        
        //    45: iconst_1       
        //    46: iadd           
        //    47: istore          8
        //    49: aload_1        
        //    50: invokevirtual   com/google/hv.c:()I
        //    53: istore          10
        //    55: iload           8
        //    57: iload           10
        //    59: if_icmpge       677
        //    62: iload_3        
        //    63: iconst_1       
        //    64: iadd           
        //    65: istore          7
        //    67: aload_1        
        //    68: iload           7
        //    70: invokevirtual   com/google/hv.b:(I)B
        //    73: istore          11
        //    75: iload           11
        //    77: invokestatic    com/google/a.c:(B)Z
        //    80: ifeq            236
        //    83: iload           11
        //    85: invokestatic    com/google/a.b:(B)I
        //    88: istore          22
        //    90: iload           7
        //    92: iconst_1       
        //    93: iadd           
        //    94: istore          23
        //    96: iload           23
        //    98: aload_1        
        //    99: invokevirtual   com/google/hv.c:()I
        //   102: if_icmpge       143
        //   105: aload_1        
        //   106: iload           7
        //   108: iconst_1       
        //   109: iadd           
        //   110: invokevirtual   com/google/hv.b:(I)B
        //   113: invokestatic    com/google/a.c:(B)Z
        //   116: istore          29
        //   118: iload           29
        //   120: ifeq            143
        //   123: iinc            7, 1
        //   126: iload           22
        //   128: bipush          8
        //   130: imul           
        //   131: aload_1        
        //   132: iload           7
        //   134: invokevirtual   com/google/hv.b:(I)B
        //   137: invokestatic    com/google/a.b:(B)I
        //   140: iadd           
        //   141: istore          22
        //   143: iload           7
        //   145: iconst_1       
        //   146: iadd           
        //   147: istore          25
        //   149: iload           25
        //   151: aload_1        
        //   152: invokevirtual   com/google/hv.c:()I
        //   155: if_icmpge       196
        //   158: aload_1        
        //   159: iload           7
        //   161: iconst_1       
        //   162: iadd           
        //   163: invokevirtual   com/google/hv.b:(I)B
        //   166: invokestatic    com/google/a.c:(B)Z
        //   169: istore          28
        //   171: iload           28
        //   173: ifeq            196
        //   176: iinc            7, 1
        //   179: iload           22
        //   181: bipush          8
        //   183: imul           
        //   184: aload_1        
        //   185: iload           7
        //   187: invokevirtual   com/google/hv.b:(I)B
        //   190: invokestatic    com/google/a.b:(B)I
        //   193: iadd           
        //   194: istore          22
        //   196: iload           4
        //   198: iconst_1       
        //   199: iadd           
        //   200: istore          27
        //   202: aload_2        
        //   203: iload           4
        //   205: iload           22
        //   207: i2b            
        //   208: bastore        
        //   209: iload           27
        //   211: istore          4
        //   213: iload           7
        //   215: iconst_1       
        //   216: iadd           
        //   217: istore_3       
        //   218: goto            22
        //   221: astore          9
        //   223: aload           9
        //   225: athrow         
        //   226: astore          24
        //   228: aload           24
        //   230: athrow         
        //   231: astore          26
        //   233: aload           26
        //   235: athrow         
        //   236: iload           11
        //   238: lookupswitch {
        //               34: 518
        //               39: 503
        //               92: 488
        //               97: 374
        //               98: 398
        //              102: 413
        //              110: 428
        //              114: 443
        //              116: 458
        //              118: 473
        //              120: 533
        //          default: 336
        //        }
        //   336: new             Lcom/google/fR;
        //   339: dup            
        //   340: new             Ljava/lang/StringBuilder;
        //   343: dup            
        //   344: invokespecial   java/lang/StringBuilder.<init>:()V
        //   347: getstatic       com/google/a.z:[Ljava/lang/String;
        //   350: bipush          11
        //   352: aaload         
        //   353: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   356: iload           11
        //   358: i2c            
        //   359: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   362: bipush          39
        //   364: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   367: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   370: invokespecial   com/google/fR.<init>:(Ljava/lang/String;)V
        //   373: athrow         
        //   374: iload           4
        //   376: iconst_1       
        //   377: iadd           
        //   378: istore          19
        //   380: aload_2        
        //   381: iload           4
        //   383: bipush          7
        //   385: bastore        
        //   386: iload           19
        //   388: istore          4
        //   390: goto            213
        //   393: astore          21
        //   395: aload           21
        //   397: athrow         
        //   398: iload           4
        //   400: iconst_1       
        //   401: iadd           
        //   402: istore          19
        //   404: aload_2        
        //   405: iload           4
        //   407: bipush          8
        //   409: bastore        
        //   410: goto            386
        //   413: iload           4
        //   415: iconst_1       
        //   416: iadd           
        //   417: istore          19
        //   419: aload_2        
        //   420: iload           4
        //   422: bipush          12
        //   424: bastore        
        //   425: goto            386
        //   428: iload           4
        //   430: iconst_1       
        //   431: iadd           
        //   432: istore          19
        //   434: aload_2        
        //   435: iload           4
        //   437: bipush          10
        //   439: bastore        
        //   440: goto            386
        //   443: iload           4
        //   445: iconst_1       
        //   446: iadd           
        //   447: istore          19
        //   449: aload_2        
        //   450: iload           4
        //   452: bipush          13
        //   454: bastore        
        //   455: goto            386
        //   458: iload           4
        //   460: iconst_1       
        //   461: iadd           
        //   462: istore          19
        //   464: aload_2        
        //   465: iload           4
        //   467: bipush          9
        //   469: bastore        
        //   470: goto            386
        //   473: iload           4
        //   475: iconst_1       
        //   476: iadd           
        //   477: istore          19
        //   479: aload_2        
        //   480: iload           4
        //   482: bipush          11
        //   484: bastore        
        //   485: goto            386
        //   488: iload           4
        //   490: iconst_1       
        //   491: iadd           
        //   492: istore          19
        //   494: aload_2        
        //   495: iload           4
        //   497: bipush          92
        //   499: bastore        
        //   500: goto            386
        //   503: iload           4
        //   505: iconst_1       
        //   506: iadd           
        //   507: istore          19
        //   509: aload_2        
        //   510: iload           4
        //   512: bipush          39
        //   514: bastore        
        //   515: goto            386
        //   518: iload           4
        //   520: iconst_1       
        //   521: iadd           
        //   522: istore          19
        //   524: aload_2        
        //   525: iload           4
        //   527: bipush          34
        //   529: bastore        
        //   530: goto            386
        //   533: iload           7
        //   535: iconst_1       
        //   536: iadd           
        //   537: istore          12
        //   539: iload           12
        //   541: aload_1        
        //   542: invokevirtual   com/google/hv.c:()I
        //   545: if_icmpge       658
        //   548: aload_1        
        //   549: iload           7
        //   551: iconst_1       
        //   552: iadd           
        //   553: invokevirtual   com/google/hv.b:(I)B
        //   556: invokestatic    com/google/a.a:(B)Z
        //   559: istore          14
        //   561: iload           14
        //   563: ifeq            658
        //   566: iinc            7, 1
        //   569: aload_1        
        //   570: iload           7
        //   572: invokevirtual   com/google/hv.b:(I)B
        //   575: invokestatic    com/google/a.b:(B)I
        //   578: istore          15
        //   580: iload           7
        //   582: iconst_1       
        //   583: iadd           
        //   584: istore          16
        //   586: iload           16
        //   588: aload_1        
        //   589: invokevirtual   com/google/hv.c:()I
        //   592: if_icmpge       633
        //   595: aload_1        
        //   596: iload           7
        //   598: iconst_1       
        //   599: iadd           
        //   600: invokevirtual   com/google/hv.b:(I)B
        //   603: invokestatic    com/google/a.a:(B)Z
        //   606: istore          20
        //   608: iload           20
        //   610: ifeq            633
        //   613: iinc            7, 1
        //   616: iload           15
        //   618: bipush          16
        //   620: imul           
        //   621: aload_1        
        //   622: iload           7
        //   624: invokevirtual   com/google/hv.b:(I)B
        //   627: invokestatic    com/google/a.b:(B)I
        //   630: iadd           
        //   631: istore          15
        //   633: iload           4
        //   635: iconst_1       
        //   636: iadd           
        //   637: istore          18
        //   639: aload_2        
        //   640: iload           4
        //   642: iload           15
        //   644: i2b            
        //   645: bastore        
        //   646: iload           18
        //   648: istore          19
        //   650: goto            386
        //   653: astore          13
        //   655: aload           13
        //   657: athrow         
        //   658: new             Lcom/google/fR;
        //   661: dup            
        //   662: getstatic       com/google/a.z:[Ljava/lang/String;
        //   665: bipush          10
        //   667: aaload         
        //   668: invokespecial   com/google/fR.<init>:(Ljava/lang/String;)V
        //   671: athrow         
        //   672: astore          17
        //   674: aload           17
        //   676: athrow         
        //   677: new             Lcom/google/fR;
        //   680: dup            
        //   681: getstatic       com/google/a.z:[Ljava/lang/String;
        //   684: bipush          12
        //   686: aaload         
        //   687: invokespecial   com/google/fR.<init>:(Ljava/lang/String;)V
        //   690: athrow         
        //   691: iload           4
        //   693: iconst_1       
        //   694: iadd           
        //   695: istore          6
        //   697: aload_2        
        //   698: iload           4
        //   700: iload           5
        //   702: bastore        
        //   703: iload           6
        //   705: istore          4
        //   707: iload_3        
        //   708: istore          7
        //   710: goto            213
        //   713: aload_2        
        //   714: iconst_0       
        //   715: iload           4
        //   717: invokestatic    com/google/hv.a:([BII)Lcom/google/hv;
        //   720: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  49     55     221    226    Ljava/lang/IllegalStateException;
        //  96     118    226    231    Ljava/lang/IllegalStateException;
        //  149    171    231    236    Ljava/lang/IllegalStateException;
        //  380    386    393    398    Ljava/lang/IllegalStateException;
        //  539    561    653    658    Ljava/lang/IllegalStateException;
        //  586    608    672    677    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 340, Size: 340
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
    
    private static String a(final int n) {
        if (n >= 0) {
            try {
                return Integer.toString(n);
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
        }
        return Long.toString(0xFFFFFFFFL & n);
    }
    
    static String a(final long n) {
        return b(n);
    }
    
    public static String a(final cT ct) {
        try {
            final StringBuilder sb = new StringBuilder();
            a(ct, sb);
            return sb.toString();
        }
        catch (IOException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    public static String a(final ce ce) {
        try {
            final StringBuilder sb = new StringBuilder();
            a(ce, sb);
            return sb.toString();
        }
        catch (IOException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    static String a(final hv p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_1       
        //     2: getstatic       com/google/dt.b:Z
        //     5: istore_2       
        //     6: new             Ljava/lang/StringBuilder;
        //     9: dup            
        //    10: aload_0        
        //    11: invokevirtual   com/google/hv.c:()I
        //    14: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //    17: astore_3       
        //    18: iload_1        
        //    19: aload_0        
        //    20: invokevirtual   com/google/hv.c:()I
        //    23: if_icmpge       207
        //    26: aload_0        
        //    27: iload_1        
        //    28: invokevirtual   com/google/hv.b:(I)B
        //    31: istore          4
        //    33: iload           4
        //    35: lookupswitch {
        //                7: 212
        //                8: 227
        //                9: 283
        //               10: 255
        //               11: 298
        //               12: 241
        //               13: 269
        //               34: 342
        //               39: 328
        //               92: 313
        //          default: 124
        //        }
        //   124: iload           4
        //   126: bipush          32
        //   128: if_icmplt       147
        //   131: iload           4
        //   133: i2c            
        //   134: istore          13
        //   136: aload_3        
        //   137: iload           13
        //   139: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   142: pop            
        //   143: iload_2        
        //   144: ifeq            200
        //   147: aload_3        
        //   148: bipush          92
        //   150: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   153: pop            
        //   154: aload_3        
        //   155: bipush          48
        //   157: iconst_3       
        //   158: iload           4
        //   160: bipush          6
        //   162: iushr          
        //   163: iand           
        //   164: iadd           
        //   165: i2c            
        //   166: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   169: pop            
        //   170: aload_3        
        //   171: bipush          48
        //   173: bipush          7
        //   175: iload           4
        //   177: iconst_3       
        //   178: iushr          
        //   179: iand           
        //   180: iadd           
        //   181: i2c            
        //   182: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   185: pop            
        //   186: aload_3        
        //   187: bipush          48
        //   189: iload           4
        //   191: bipush          7
        //   193: iand           
        //   194: iadd           
        //   195: i2c            
        //   196: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   199: pop            
        //   200: iinc            1, 1
        //   203: iload_2        
        //   204: ifeq            18
        //   207: aload_3        
        //   208: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   211: areturn        
        //   212: aload_3        
        //   213: getstatic       com/google/a.z:[Ljava/lang/String;
        //   216: bipush          7
        //   218: aaload         
        //   219: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   222: pop            
        //   223: iload_2        
        //   224: ifeq            200
        //   227: aload_3        
        //   228: getstatic       com/google/a.z:[Ljava/lang/String;
        //   231: iconst_1       
        //   232: aaload         
        //   233: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   236: pop            
        //   237: iload_2        
        //   238: ifeq            200
        //   241: aload_3        
        //   242: getstatic       com/google/a.z:[Ljava/lang/String;
        //   245: iconst_0       
        //   246: aaload         
        //   247: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   250: pop            
        //   251: iload_2        
        //   252: ifeq            200
        //   255: aload_3        
        //   256: getstatic       com/google/a.z:[Ljava/lang/String;
        //   259: iconst_5       
        //   260: aaload         
        //   261: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   264: pop            
        //   265: iload_2        
        //   266: ifeq            200
        //   269: aload_3        
        //   270: getstatic       com/google/a.z:[Ljava/lang/String;
        //   273: iconst_4       
        //   274: aaload         
        //   275: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   278: pop            
        //   279: iload_2        
        //   280: ifeq            200
        //   283: aload_3        
        //   284: getstatic       com/google/a.z:[Ljava/lang/String;
        //   287: bipush          8
        //   289: aaload         
        //   290: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   293: pop            
        //   294: iload_2        
        //   295: ifeq            200
        //   298: aload_3        
        //   299: getstatic       com/google/a.z:[Ljava/lang/String;
        //   302: bipush          6
        //   304: aaload         
        //   305: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   308: pop            
        //   309: iload_2        
        //   310: ifeq            200
        //   313: aload_3        
        //   314: getstatic       com/google/a.z:[Ljava/lang/String;
        //   317: bipush          9
        //   319: aaload         
        //   320: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   323: pop            
        //   324: iload_2        
        //   325: ifeq            200
        //   328: aload_3        
        //   329: getstatic       com/google/a.z:[Ljava/lang/String;
        //   332: iconst_3       
        //   333: aaload         
        //   334: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   337: pop            
        //   338: iload_2        
        //   339: ifeq            200
        //   342: aload_3        
        //   343: getstatic       com/google/a.z:[Ljava/lang/String;
        //   346: iconst_2       
        //   347: aaload         
        //   348: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   351: pop            
        //   352: iload_2        
        //   353: ifeq            200
        //   356: goto            124
        //   359: astore          31
        //   361: aload           31
        //   363: athrow         
        //   364: astore          29
        //   366: aload           29
        //   368: athrow         
        //   369: astore          27
        //   371: aload           27
        //   373: athrow         
        //   374: astore          25
        //   376: aload           25
        //   378: athrow         
        //   379: astore          23
        //   381: aload           23
        //   383: athrow         
        //   384: astore          21
        //   386: aload           21
        //   388: athrow         
        //   389: astore          19
        //   391: aload           19
        //   393: athrow         
        //   394: astore          17
        //   396: aload           17
        //   398: athrow         
        //   399: astore          15
        //   401: aload           15
        //   403: athrow         
        //   404: astore          5
        //   406: aload           5
        //   408: athrow         
        //   409: astore          6
        //   411: aload           6
        //   413: athrow         
        //   414: astore          7
        //   416: aload           7
        //   418: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  136    143    414    419    Ljava/lang/IllegalStateException;
        //  147    200    414    419    Ljava/lang/IllegalStateException;
        //  212    223    359    364    Ljava/lang/IllegalStateException;
        //  227    237    364    369    Ljava/lang/IllegalStateException;
        //  241    251    369    374    Ljava/lang/IllegalStateException;
        //  255    265    374    379    Ljava/lang/IllegalStateException;
        //  269    279    379    384    Ljava/lang/IllegalStateException;
        //  283    294    384    389    Ljava/lang/IllegalStateException;
        //  298    309    389    394    Ljava/lang/IllegalStateException;
        //  313    324    394    399    Ljava/lang/IllegalStateException;
        //  328    338    399    404    Ljava/lang/IllegalStateException;
        //  342    352    404    414    Ljava/lang/IllegalStateException;
        //  361    364    364    369    Ljava/lang/IllegalStateException;
        //  366    369    369    374    Ljava/lang/IllegalStateException;
        //  371    374    374    379    Ljava/lang/IllegalStateException;
        //  376    379    379    384    Ljava/lang/IllegalStateException;
        //  381    384    384    389    Ljava/lang/IllegalStateException;
        //  386    389    389    394    Ljava/lang/IllegalStateException;
        //  391    394    394    399    Ljava/lang/IllegalStateException;
        //  396    399    399    404    Ljava/lang/IllegalStateException;
        //  401    404    404    414    Ljava/lang/IllegalStateException;
        //  406    409    409    414    Ljava/lang/IllegalStateException;
        //  411    414    414    419    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 190, Size: 190
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
    
    static String a(final String s) {
        return a(hv.b(s));
    }
    
    private static void a(final int p0, final Object p1, final C p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dt.b:Z
        //     3: istore_3       
        //     4: iload_0        
        //     5: invokestatic    com/google/cp.a:(I)I
        //     8: istore          10
        //    10: iload           10
        //    12: tableswitch {
        //                0: 88
        //                1: 151
        //                2: 196
        //                3: 223
        //                4: 52
        //                5: 106
        //          default: 52
        //        }
        //    52: new             Ljava/lang/IllegalArgumentException;
        //    55: dup            
        //    56: new             Ljava/lang/StringBuilder;
        //    59: dup            
        //    60: invokespecial   java/lang/StringBuilder.<init>:()V
        //    63: getstatic       com/google/a.z:[Ljava/lang/String;
        //    66: bipush          14
        //    68: aaload         
        //    69: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    72: iload_0        
        //    73: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    76: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    79: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    82: athrow         
        //    83: astore          9
        //    85: aload           9
        //    87: athrow         
        //    88: aload_2        
        //    89: aload_1        
        //    90: checkcast       Ljava/lang/Long;
        //    93: invokevirtual   java/lang/Long.longValue:()J
        //    96: invokestatic    com/google/a.b:(J)Ljava/lang/String;
        //    99: invokevirtual   com/google/C.a:(Ljava/lang/CharSequence;)V
        //   102: iload_3        
        //   103: ifeq            238
        //   106: aconst_null    
        //   107: checkcast       Ljava/util/Locale;
        //   110: astore          14
        //   112: getstatic       com/google/a.z:[Ljava/lang/String;
        //   115: bipush          15
        //   117: aaload         
        //   118: astore          15
        //   120: iconst_1       
        //   121: anewarray       Ljava/lang/Object;
        //   124: astore          16
        //   126: aload           16
        //   128: iconst_0       
        //   129: aload_1        
        //   130: checkcast       Ljava/lang/Integer;
        //   133: aastore        
        //   134: aload_2        
        //   135: aload           14
        //   137: aload           15
        //   139: aload           16
        //   141: invokestatic    java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   144: invokevirtual   com/google/C.a:(Ljava/lang/CharSequence;)V
        //   147: iload_3        
        //   148: ifeq            238
        //   151: aconst_null    
        //   152: checkcast       Ljava/util/Locale;
        //   155: astore          11
        //   157: getstatic       com/google/a.z:[Ljava/lang/String;
        //   160: bipush          13
        //   162: aaload         
        //   163: astore          12
        //   165: iconst_1       
        //   166: anewarray       Ljava/lang/Object;
        //   169: astore          13
        //   171: aload           13
        //   173: iconst_0       
        //   174: aload_1        
        //   175: checkcast       Ljava/lang/Long;
        //   178: aastore        
        //   179: aload_2        
        //   180: aload           11
        //   182: aload           12
        //   184: aload           13
        //   186: invokestatic    java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   189: invokevirtual   com/google/C.a:(Ljava/lang/CharSequence;)V
        //   192: iload_3        
        //   193: ifeq            238
        //   196: aload_2        
        //   197: ldc             "\""
        //   199: invokevirtual   com/google/C.a:(Ljava/lang/CharSequence;)V
        //   202: aload_2        
        //   203: aload_1        
        //   204: checkcast       Lcom/google/hv;
        //   207: invokestatic    com/google/a.a:(Lcom/google/hv;)Ljava/lang/String;
        //   210: invokevirtual   com/google/C.a:(Ljava/lang/CharSequence;)V
        //   213: aload_2        
        //   214: ldc             "\""
        //   216: invokevirtual   com/google/C.a:(Ljava/lang/CharSequence;)V
        //   219: iload_3        
        //   220: ifeq            238
        //   223: getstatic       com/google/a.b:Lcom/google/f3;
        //   226: aload_1        
        //   227: checkcast       Lcom/google/ce;
        //   230: aload_2        
        //   231: invokestatic    com/google/f3.a:(Lcom/google/f3;Lcom/google/ce;Lcom/google/C;)V
        //   234: iload_3        
        //   235: ifne            52
        //   238: return         
        //   239: astore          4
        //   241: aload           4
        //   243: athrow         
        //   244: astore          5
        //   246: aload           5
        //   248: athrow         
        //   249: astore          6
        //   251: aload           6
        //   253: athrow         
        //   254: astore          7
        //   256: aload           7
        //   258: athrow         
        //   259: astore          8
        //   261: aload           8
        //   263: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      10     239    244    Ljava/lang/IllegalStateException;
        //  52     83     83     88     Ljava/lang/IllegalStateException;
        //  88     102    244    249    Ljava/lang/IllegalStateException;
        //  106    147    249    254    Ljava/lang/IllegalStateException;
        //  151    192    254    259    Ljava/lang/IllegalStateException;
        //  196    219    259    264    Ljava/lang/IllegalStateException;
        //  223    234    83     88     Ljava/lang/IllegalStateException;
        //  241    244    244    249    Ljava/lang/IllegalStateException;
        //  246    249    249    254    Ljava/lang/IllegalStateException;
        //  251    254    254    259    Ljava/lang/IllegalStateException;
        //  256    259    259    264    Ljava/lang/IllegalStateException;
        //  261    264    83     88     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 114, Size: 114
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
    
    public static void a(final cT ct, final Appendable appendable) {
        f3.a(com.google.a.b, ct, new C(appendable, null));
    }
    
    public static void a(final ce ce, final Appendable appendable) {
        f3.a(com.google.a.b, ce, new C(appendable, null));
    }
    
    private static boolean a(final byte b) {
        return (48 <= b && b <= 57) || (97 <= b && b <= 102) || (65 <= b && b <= 70);
    }
    
    private static int b(final byte b) {
        if (48 <= b && b <= 57) {
            return b - 48;
        }
        if (97 <= b && b <= 122) {
            return 10 + (b - 97);
        }
        return 10 + (b - 65);
    }
    
    static int b(final String s) {
        return (int)a(s, true, false);
    }
    
    static String b(final int n) {
        return a(n);
    }
    
    private static String b(final long n) {
        if (n >= 0L) {
            try {
                return Long.toString(n);
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
        }
        return BigInteger.valueOf(Long.MAX_VALUE & n).setBit(63).toString();
    }
    
    static void b(final int n, final Object o, final C c) {
        a(n, o, c);
    }
    
    static int c(final String s) {
        return (int)a(s, false, false);
    }
    
    private static boolean c(final byte b) {
        return 48 <= b && b <= 55;
    }
    
    static long d(final String s) {
        return a(s, false, true);
    }
    
    static long e(final String s) {
        return a(s, true, true);
    }
}
