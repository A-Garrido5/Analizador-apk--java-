// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Map;
import java.nio.charset.Charset;

public final class bR
{
    private static final String a;
    private static final boolean b;
    private static final String[] z;
    
    static {
        int n = -1;
        final String[] z2 = new String[7];
        int n2 = 0;
        String[] array = z2;
        String s = "Hd\u0006&\u00004\u000e\u0016/";
        int n3 = n;
        String intern = null;
    Label_0211:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n4 = 0; i > n4; ++n4) {
                final char c = charArray[n4];
                char c2 = '\0';
                switch (n4 % 5) {
                    default: {
                        c2 = '8';
                        break;
                    }
                    case 0: {
                        c2 = '\u0001';
                        break;
                    }
                    case 1: {
                        c2 = '7';
                        break;
                    }
                    case 2: {
                        c2 = 'I';
                        break;
                    }
                    case 3: {
                        c2 = '\u001e';
                        break;
                    }
                }
                charArray[n4] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n3) {
                default: {
                    array[n2] = intern;
                    s = "Hd\u0006&\u00004\u000e\u0016/";
                    n2 = 1;
                    array = z2;
                    n3 = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "R}\u0000M";
                    n2 = 2;
                    array = z2;
                    n3 = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "R}\u0000M";
                    n2 = 3;
                    array = z2;
                    n3 = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "R}\u0000M";
                    n3 = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "Tc\u000f&";
                    n3 = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "Tc\u000f&";
                    n3 = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0211;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        a = Charset.defaultCharset().name();
        String s2 = "R}\u0000M";
        boolean b2 = false;
        Label_0505: {
        Label_0502:
            while (true) {
                final char[] charArray2 = s2.toCharArray();
                for (int j = charArray2.length, n5 = 0; j > n5; ++n5) {
                    final char c3 = charArray2[n5];
                    char c4 = '\0';
                    switch (n5 % 5) {
                        default: {
                            c4 = '8';
                            break;
                        }
                        case 0: {
                            c4 = '\u0001';
                            break;
                        }
                        case 1: {
                            c4 = '7';
                            break;
                        }
                        case 2: {
                            c4 = 'I';
                            break;
                        }
                        case 3: {
                            c4 = '\u001e';
                            break;
                        }
                    }
                    charArray2[n5] = (char)(c4 ^ c3);
                }
                final String intern2 = new String(charArray2).intern();
                switch (n) {
                    default: {
                        if (!intern2.equalsIgnoreCase(bR.a)) {
                            s2 = "Db\nArQ";
                            n = 0;
                            continue;
                        }
                        break Label_0502;
                    }
                    case 0: {
                        final boolean equalsIgnoreCase = intern2.equalsIgnoreCase(bR.a);
                        b2 = false;
                        if (equalsIgnoreCase) {
                            break Label_0502;
                        }
                        break Label_0505;
                    }
                }
            }
            b2 = true;
        }
        b = b2;
    }
    
    public static String a(final byte[] array, final Map map) {
        final int b = hN.b;
        if (map != null) {
            final String s = map.get(bj.CHARACTER_SET);
            if (s != null) {
                return s;
            }
        }
        final int length = array.length;
        int n = 1;
        int n2 = 1;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        boolean b2;
        if (array.length > 3 && array[0] == -17 && array[1] == -69 && array[2] == -65) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        int n12 = 0;
        int n13 = 0;
        int n14 = 0;
        int n15 = 1;
        while (true) {
        Label_0337_Outer:
            while (n12 < length && (n != 0 || n2 != 0 || n15 != 0)) {
                final int n16 = 0xFF & array[n12];
                int n17 = 0;
                int n18 = 0;
                int n19 = 0;
                int n20 = 0;
                int n21 = 0;
                Label_0272: {
                    if (n15 != 0) {
                        Label_1007: {
                            if (n3 > 0) {
                                if ((n16 & 0x80) == 0x0) {
                                    n17 = 0;
                                    if (b == 0) {
                                        break Label_1007;
                                    }
                                }
                                else {
                                    n17 = n15;
                                }
                                --n3;
                                if (b == 0) {
                                    break Label_1007;
                                }
                            }
                            else {
                                n17 = n15;
                            }
                            if ((n16 & 0x80) != 0x0) {
                                if ((n16 & 0x40) == 0x0) {
                                    n17 = 0;
                                    if (b == 0) {
                                        break Label_1007;
                                    }
                                }
                                ++n3;
                                if ((n16 & 0x20) == 0x0) {
                                    ++n14;
                                    if (b == 0) {
                                        break Label_1007;
                                    }
                                }
                                ++n3;
                                if ((n16 & 0x10) == 0x0) {
                                    ++n4;
                                    if (b == 0) {
                                        break Label_1007;
                                    }
                                }
                                ++n3;
                                if ((n16 & 0x8) == 0x0) {
                                    ++n13;
                                    if (b == 0) {
                                        break Label_1007;
                                    }
                                }
                                n17 = 0;
                                n18 = n14;
                                n19 = n3;
                                n20 = n13;
                                n21 = n4;
                                break Label_0272;
                            }
                        }
                        n18 = n14;
                        n19 = n3;
                        n20 = n13;
                        n21 = n4;
                    }
                    else {
                        n19 = n3;
                        n17 = n15;
                        n18 = n14;
                        n21 = n4;
                        n20 = n13;
                    }
                }
                while (true) {
                    Label_1000: {
                        if (n == 0) {
                            break Label_1000;
                        }
                        if (n16 > 127 && n16 < 160) {
                            n = 0;
                            if (b == 0) {
                                break Label_1000;
                            }
                        }
                        if (n16 <= 159 || (n16 >= 192 && n16 != 215 && n16 != 247)) {
                            break Label_1000;
                        }
                        final int n22 = n11 + 1;
                        while (true) {
                            Label_0966: {
                                if (n2 == 0) {
                                    break Label_0966;
                                }
                                int n23 = 0;
                                Label_0935: {
                                    if (n5 > 0) {
                                        if (n16 < 64 || n16 == 127 || n16 > 252) {
                                            n2 = 0;
                                            if (b == 0) {
                                                break Label_0966;
                                            }
                                        }
                                        n23 = n5 - 1;
                                        if (b == 0) {
                                            break Label_0935;
                                        }
                                    }
                                    else {
                                        n23 = n5;
                                    }
                                    if (n16 == 128 || n16 == 160 || n16 > 239) {
                                        n2 = 0;
                                        if (b == 0) {
                                            break Label_0935;
                                        }
                                    }
                                    int n24;
                                    if (n16 > 160 && n16 < 224) {
                                        n24 = n6 + 1;
                                        final int n25 = n7 + 1;
                                        if (n25 <= n9) {
                                            final int n26 = n9;
                                            final int n27 = n23;
                                            final int n28 = n26;
                                            final int n29 = n24;
                                            final int n30 = n2;
                                            final int n31 = n25;
                                            final int n32 = 0;
                                            break Label_0527;
                                        }
                                        if (b == 0) {
                                            final int n27 = n23;
                                            final int n28 = n25;
                                            final int n29 = n24;
                                            final int n30 = n2;
                                            final int n31 = n25;
                                            final int n32 = 0;
                                            break Label_0527;
                                        }
                                        n9 = n25;
                                        n8 = 0;
                                    }
                                    else {
                                        n24 = n6;
                                    }
                                    int n34;
                                    int n37;
                                    if (n16 > 127) {
                                        final int n33 = n23 + 1;
                                        n34 = n8 + 1;
                                        if (n34 <= n10) {
                                            final int n35 = n9;
                                            final int n27 = n33;
                                            final int n29 = n24;
                                            final int n32 = n34;
                                            final int n28 = n35;
                                            final int n30 = n2;
                                            final int n31 = 0;
                                            break Label_0527;
                                        }
                                        if (b == 0) {
                                            n10 = n34;
                                            final int n36 = n9;
                                            final int n27 = n33;
                                            final int n29 = n24;
                                            final int n32 = n34;
                                            final int n28 = n36;
                                            final int n30 = n2;
                                            final int n31 = 0;
                                            break Label_0527;
                                        }
                                        n37 = n33;
                                    }
                                    else {
                                        final int n38 = n10;
                                        n37 = n23;
                                        n34 = n38;
                                    }
                                    final int n39 = n34;
                                    final int n28 = n9;
                                    final int n27 = n37;
                                    n10 = n39;
                                    final int n30 = n2;
                                    final int n31 = 0;
                                    final int n29 = n24;
                                    final int n32 = 0;
                                    break Label_0527;
                                }
                                final int n32 = n8;
                                final int n29 = n6;
                                final int n30 = n2;
                                final int n31 = n7;
                                final int n40 = n23;
                                final int n28 = n9;
                                final int n27 = n40;
                                final int n41 = n12 + 1;
                                if (b == 0) {
                                    n12 = n41;
                                    n7 = n31;
                                    n8 = n32;
                                    n2 = n30;
                                    n6 = n29;
                                    n5 = n27;
                                    n11 = n22;
                                    n9 = n28;
                                    n4 = n21;
                                    n13 = n20;
                                    n3 = n19;
                                    n14 = n18;
                                    n15 = n17;
                                    continue Label_0337_Outer;
                                }
                                n5 = n27;
                                n9 = n28;
                                int n42 = n30;
                                n6 = n29;
                                n11 = n22;
                                final int n43 = n10;
                                int n44 = n17;
                                final int n45 = n;
                                if (n44 != 0 && n19 > 0) {
                                    n44 = 0;
                                }
                                if (n42 != 0 && n5 > 0) {
                                    n42 = 0;
                                }
                                if (n44 != 0 && (b2 || n20 + (n18 + n21) > 0)) {
                                    return bR.z[6];
                                }
                                if (n42 != 0 && (bR.b || n9 >= 3 || n43 >= 3)) {
                                    return bR.z[2];
                                }
                                if (n45 != 0 && n42 != 0) {
                                    if ((n9 == 2 && n6 == 2) || n11 * 10 >= length) {
                                        return bR.z[3];
                                    }
                                    return bR.z[0];
                                }
                                else {
                                    if (n45 != 0) {
                                        return bR.z[1];
                                    }
                                    if (n42 != 0) {
                                        return bR.z[4];
                                    }
                                    if (n44 != 0) {
                                        return bR.z[5];
                                    }
                                    return bR.a;
                                }
                            }
                            final int n28 = n9;
                            final int n29 = n6;
                            final int n27 = n5;
                            final int n30 = n2;
                            final int n31 = n7;
                            final int n32 = n8;
                            continue;
                        }
                    }
                    final int n22 = n11;
                    continue;
                }
            }
            int n19 = n3;
            final int n45 = n;
            int n21 = n4;
            final int n43 = n10;
            int n44 = n15;
            int n18 = n14;
            int n20 = n13;
            int n42 = n2;
            continue;
        }
    }
}
