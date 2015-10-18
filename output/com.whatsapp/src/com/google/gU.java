// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

public final class gU extends gj
{
    static final int[][] b;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "%2r";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '5';
                        break;
                    }
                    case 0: {
                        c2 = 'x';
                        break;
                    }
                    case 1: {
                        c2 = 'q';
                        break;
                    }
                    case 2: {
                        c2 = 'C';
                        break;
                    }
                    case 3: {
                        c2 = 'R';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "%2r";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "%2r";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        b = new int[][] { { 2, 1, 2, 2, 2, 2 }, { 2, 2, 2, 1, 2, 2 }, { 2, 2, 2, 2, 2, 1 }, { 1, 2, 1, 2, 2, 3 }, { 1, 2, 1, 3, 2, 2 }, { 1, 3, 1, 2, 2, 2 }, { 1, 2, 2, 2, 1, 3 }, { 1, 2, 2, 3, 1, 2 }, { 1, 3, 2, 2, 1, 2 }, { 2, 2, 1, 2, 1, 3 }, { 2, 2, 1, 3, 1, 2 }, { 2, 3, 1, 2, 1, 2 }, { 1, 1, 2, 2, 3, 2 }, { 1, 2, 2, 1, 3, 2 }, { 1, 2, 2, 2, 3, 1 }, { 1, 1, 3, 2, 2, 2 }, { 1, 2, 3, 1, 2, 2 }, { 1, 2, 3, 2, 2, 1 }, { 2, 2, 3, 2, 1, 1 }, { 2, 2, 1, 1, 3, 2 }, { 2, 2, 1, 2, 3, 1 }, { 2, 1, 3, 2, 1, 2 }, { 2, 2, 3, 1, 1, 2 }, { 3, 1, 2, 1, 3, 1 }, { 3, 1, 1, 2, 2, 2 }, { 3, 2, 1, 1, 2, 2 }, { 3, 2, 1, 2, 2, 1 }, { 3, 1, 2, 2, 1, 2 }, { 3, 2, 2, 1, 1, 2 }, { 3, 2, 2, 2, 1, 1 }, { 2, 1, 2, 1, 2, 3 }, { 2, 1, 2, 3, 2, 1 }, { 2, 3, 2, 1, 2, 1 }, { 1, 1, 1, 3, 2, 3 }, { 1, 3, 1, 1, 2, 3 }, { 1, 3, 1, 3, 2, 1 }, { 1, 1, 2, 3, 1, 3 }, { 1, 3, 2, 1, 1, 3 }, { 1, 3, 2, 3, 1, 1 }, { 2, 1, 1, 3, 1, 3 }, { 2, 3, 1, 1, 1, 3 }, { 2, 3, 1, 3, 1, 1 }, { 1, 1, 2, 1, 3, 3 }, { 1, 1, 2, 3, 3, 1 }, { 1, 3, 2, 1, 3, 1 }, { 1, 1, 3, 1, 2, 3 }, { 1, 1, 3, 3, 2, 1 }, { 1, 3, 3, 1, 2, 1 }, { 3, 1, 3, 1, 2, 1 }, { 2, 1, 1, 3, 3, 1 }, { 2, 3, 1, 1, 3, 1 }, { 2, 1, 3, 1, 1, 3 }, { 2, 1, 3, 3, 1, 1 }, { 2, 1, 3, 1, 3, 1 }, { 3, 1, 1, 1, 2, 3 }, { 3, 1, 1, 3, 2, 1 }, { 3, 3, 1, 1, 2, 1 }, { 3, 1, 2, 1, 1, 3 }, { 3, 1, 2, 3, 1, 1 }, { 3, 3, 2, 1, 1, 1 }, { 3, 1, 4, 1, 1, 1 }, { 2, 2, 1, 4, 1, 1 }, { 4, 3, 1, 1, 1, 1 }, { 1, 1, 1, 2, 2, 4 }, { 1, 1, 1, 4, 2, 2 }, { 1, 2, 1, 1, 2, 4 }, { 1, 2, 1, 4, 2, 1 }, { 1, 4, 1, 1, 2, 2 }, { 1, 4, 1, 2, 2, 1 }, { 1, 1, 2, 2, 1, 4 }, { 1, 1, 2, 4, 1, 2 }, { 1, 2, 2, 1, 1, 4 }, { 1, 2, 2, 4, 1, 1 }, { 1, 4, 2, 1, 1, 2 }, { 1, 4, 2, 2, 1, 1 }, { 2, 4, 1, 2, 1, 1 }, { 2, 2, 1, 1, 1, 4 }, { 4, 1, 3, 1, 1, 1 }, { 2, 4, 1, 1, 1, 2 }, { 1, 3, 4, 1, 1, 1 }, { 1, 1, 1, 2, 4, 2 }, { 1, 2, 1, 1, 4, 2 }, { 1, 2, 1, 2, 4, 1 }, { 1, 1, 4, 2, 1, 2 }, { 1, 2, 4, 1, 1, 2 }, { 1, 2, 4, 2, 1, 1 }, { 4, 1, 1, 2, 1, 2 }, { 4, 2, 1, 1, 1, 2 }, { 4, 2, 1, 2, 1, 1 }, { 2, 1, 2, 1, 4, 1 }, { 2, 1, 4, 1, 2, 1 }, { 4, 1, 2, 1, 2, 1 }, { 1, 1, 1, 1, 4, 3 }, { 1, 1, 1, 3, 4, 1 }, { 1, 3, 1, 1, 4, 1 }, { 1, 1, 4, 1, 1, 3 }, { 1, 1, 4, 3, 1, 1 }, { 4, 1, 1, 1, 1, 3 }, { 4, 1, 1, 3, 1, 1 }, { 1, 1, 3, 1, 4, 1 }, { 1, 1, 4, 1, 3, 1 }, { 3, 1, 1, 1, 4, 1 }, { 4, 1, 1, 1, 3, 1 }, { 2, 1, 1, 4, 1, 2 }, { 2, 1, 1, 2, 1, 4 }, { 2, 1, 1, 2, 3, 2 }, { 2, 3, 3, 1, 1, 1, 2 } };
    }
    
    private static int a(final hN hn, final int[] array, final int n) {
        final boolean a = gj.a;
        gj.b(hn, n, array);
        float n2 = 0.25f;
        int n3 = -1;
        int i = 0;
        while (i < gU.b.length) {
            final float a2 = gj.a(array, gU.b[i], 0.7f);
            if (a2 < n2) {
                n3 = i;
                n2 = a2;
            }
            ++i;
            if (a) {
                break;
            }
        }
        if (n3 >= 0) {
            return n3;
        }
        throw fv.a();
    }
    
    private static int[] a(final hN hn) {
        final boolean a = gj.a;
        final int b = hn.b();
        int d = hn.d(0);
        int n = 0;
        final int[] array = new int[6];
        boolean b2 = false;
        final int length = array.length;
        int n4;
        for (int i = d; i < b; i = n4) {
            Label_0239: {
                if (b2 ^ hn.a(i)) {
                    ++array[n];
                    if (!a) {
                        break Label_0239;
                    }
                }
                Label_0225: {
                    if (n == length - 1) {
                        float n2 = 0.25f;
                        int n3 = -1;
                        int j = 103;
                        while (j <= 105) {
                            float a2 = gj.a(array, gU.b[j], 0.7f);
                            if (a2 < n2) {
                                n3 = j;
                            }
                            else {
                                a2 = n2;
                            }
                            ++j;
                            if (a) {
                                break;
                            }
                            n2 = a2;
                        }
                        if (n3 >= 0 && hn.a(Math.max(0, d - (i - d) / 2), d, false)) {
                            return new int[] { d, i, n3 };
                        }
                        d += array[0] + array[1];
                        System.arraycopy(array, 2, array, 0, length - 2);
                        array[length - 1] = (array[length - 2] = 0);
                        --n;
                        if (!a) {
                            break Label_0225;
                        }
                    }
                    ++n;
                }
                array[n] = 1;
                b2 = !b2;
            }
            n4 = i + 1;
            if (a) {
                break;
            }
        }
        throw fv.a();
    }
    
    @Override
    public aU a(final int n, final hN hn, final Map map) {
        final boolean a = gj.a;
        final boolean b = map != null && map.containsKey(bj.ASSUME_GS1);
        final int[] a2 = a(hn);
        final int n2 = a2[2];
        final ArrayList<Byte> list = new ArrayList<Byte>(20);
        list.add((byte)n2);
        int n3 = 0;
        Label_0133: {
            Label_0124: {
                switch (n2) {
                    case 103: {
                        n3 = 101;
                        if (a) {
                            ++fN.a;
                            break Label_0124;
                        }
                        break Label_0133;
                    }
                    case 104: {
                        n3 = 100;
                        if (a) {
                            break Label_0124;
                        }
                        break Label_0133;
                    }
                    case 105: {
                        n3 = 99;
                        if (!a) {
                            break Label_0133;
                        }
                        break;
                    }
                }
            }
            throw fD.a();
        }
        int i = 0;
        final StringBuilder sb = new StringBuilder(20);
        int n4 = a2[0];
        int n5 = a2[1];
        final int[] array = new int[6];
        int n6 = 0;
        int n7 = 1;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        int n12 = n3;
        int n13 = 0;
        int n14 = n2;
        while (true) {
        Label_0367_Outer:
            while (i == 0) {
                final int a3 = a(hn, array, n5);
                list.add((byte)a3);
                int n15;
                if (a3 != 106) {
                    n15 = 1;
                }
                else {
                    n15 = n7;
                }
                if (a3 != 106) {
                    ++n13;
                    n14 += n13 * a3;
                }
                final int length = array.length;
                int j = 0;
                int n16 = n5;
                while (j < length) {
                    n16 += array[j];
                    ++j;
                    if (a) {
                        break;
                    }
                }
                switch (a3) {
                    default: {
                        while (true) {
                            int n22 = 0;
                            int n23 = 0;
                            int n24 = 0;
                            int n25 = 0;
                            int n26 = 0;
                            Label_1604: {
                                int n29 = 0;
                                int n30 = 0;
                                int n31 = 0;
                                int n32 = 0;
                                int n33 = 0;
                                int n34 = 0;
                                Label_0829: {
                                    int n28 = 0;
                                    Label_0657: {
                                        int n18 = 0;
                                        int n19 = 0;
                                        int n20 = 0;
                                        int n21 = 0;
                                        switch (n12) {
                                            default: {
                                                final int n17 = n9;
                                                n18 = n8;
                                                n19 = n15;
                                                n20 = 0;
                                                n21 = n17;
                                                break;
                                            }
                                            case 101: {
                                                Label_1668: {
                                                    if (a3 < 64) {
                                                        Label_0501: {
                                                            if (n9 == n8) {
                                                                sb.append((char)(a3 + 32));
                                                                if (!a) {
                                                                    break Label_0501;
                                                                }
                                                            }
                                                            sb.append((char)(128 + (a3 + 32)));
                                                        }
                                                        n22 = 0;
                                                        if (!a) {
                                                            break Label_1668;
                                                        }
                                                    }
                                                    else {
                                                        n22 = n9;
                                                    }
                                                    if (a3 < 96) {
                                                        Label_0552: {
                                                            if (n22 == n8) {
                                                                sb.append((char)(a3 - 64));
                                                                if (!a) {
                                                                    break Label_0552;
                                                                }
                                                            }
                                                            sb.append((char)(a3 + 64));
                                                        }
                                                        n22 = 0;
                                                        if (!a) {
                                                            break Label_1668;
                                                        }
                                                    }
                                                    if (a3 != 106) {
                                                        n23 = 0;
                                                    }
                                                    else {
                                                        n23 = n15;
                                                    }
                                                    n24 = 0;
                                                    Label_0640: {
                                                        Label_1095: {
                                                            switch (a3) {
                                                                case 102: {
                                                                    n24 = 0;
                                                                    if (!b) {
                                                                        break;
                                                                    }
                                                                    if (sb.length() == 0) {
                                                                        sb.append(gU.z[0]);
                                                                        n24 = 0;
                                                                        if (!a) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    sb.append('\u001d');
                                                                    n24 = 0;
                                                                    if (a) {
                                                                        break Label_1095;
                                                                    }
                                                                    break;
                                                                }
                                                                case 96:
                                                                case 97: {
                                                                    n24 = 0;
                                                                    if (a) {
                                                                        break Label_1095;
                                                                    }
                                                                    break;
                                                                }
                                                                case 101: {
                                                                    if (n8 == 0 && n22 != 0) {
                                                                        n8 = 1;
                                                                        n24 = 0;
                                                                        n22 = 0;
                                                                        if (!a) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (n8 != 0 && n22 != 0) {
                                                                        n22 = 0;
                                                                        n24 = 0;
                                                                        n8 = 0;
                                                                        if (!a) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    n22 = 1;
                                                                    n24 = 0;
                                                                    if (a) {
                                                                        break Label_1095;
                                                                    }
                                                                    break;
                                                                }
                                                                case 98: {
                                                                    n24 = 1;
                                                                    n12 = 100;
                                                                    if (a) {
                                                                        break Label_1095;
                                                                    }
                                                                    break;
                                                                }
                                                                case 100: {
                                                                    n12 = 100;
                                                                    if (a) {
                                                                        break Label_1095;
                                                                    }
                                                                    break;
                                                                }
                                                                case 99: {
                                                                    n12 = 99;
                                                                    if (a) {
                                                                        break Label_1095;
                                                                    }
                                                                    break;
                                                                }
                                                                case 106: {
                                                                    n25 = n12;
                                                                    n26 = 1;
                                                                    break Label_0640;
                                                                }
                                                            }
                                                        }
                                                        n25 = n12;
                                                        n26 = i;
                                                    }
                                                    if (a) {
                                                        final int n27 = n26;
                                                        n12 = n25;
                                                        n28 = n27;
                                                        break Label_0657;
                                                    }
                                                    break Label_1604;
                                                }
                                                n18 = n8;
                                                n19 = n15;
                                                n21 = 0;
                                                n20 = 0;
                                                break;
                                            }
                                            case 99: {
                                                n29 = n12;
                                                n30 = n15;
                                                n31 = i;
                                                n32 = n8;
                                                n33 = n9;
                                                n34 = 0;
                                                break Label_0829;
                                            }
                                            case 100: {
                                                n22 = n9;
                                                n23 = n15;
                                                n28 = i;
                                                n24 = 0;
                                                break Label_0657;
                                            }
                                        }
                                        if (n10 != 0) {
                                            int n35;
                                            if (n12 == 101) {
                                                n35 = 100;
                                            }
                                            else {
                                                n35 = 101;
                                            }
                                            n12 = n35;
                                        }
                                        if (!a) {
                                            n7 = n19;
                                            n10 = n20;
                                            n8 = n18;
                                            n9 = n21;
                                            n11 = n6;
                                            n6 = a3;
                                            final int n36 = n5;
                                            n5 = n16;
                                            n4 = n36;
                                            continue Label_0367_Outer;
                                        }
                                        final int n37 = n19;
                                        final int n38 = n6;
                                        final int n39 = n16;
                                        final int n40 = n39 - n5;
                                        final int b2 = hn.b(n39);
                                        if (!hn.a(b2, Math.min(hn.b(), b2 + (b2 - n5) / 2), false)) {
                                            throw fv.a();
                                        }
                                        if ((n14 - n13 * n38) % 103 != n38) {
                                            throw fh.a();
                                        }
                                        final int length2 = sb.length();
                                        if (length2 == 0) {
                                            throw fv.a();
                                        }
                                        Label_1417: {
                                            if (length2 > 0 && n37 != 0) {
                                                if (n12 == 99) {
                                                    sb.delete(length2 - 2, length2);
                                                    if (!a) {
                                                        break Label_1417;
                                                    }
                                                }
                                                sb.delete(length2 - 1, length2);
                                            }
                                        }
                                        final float n41 = (a2[1] + a2[0]) / 2.0f;
                                        final float n42 = n5 + n40 / 2.0f;
                                        final int size = list.size();
                                        final byte[] array2 = new byte[size];
                                        int n43;
                                        for (int k = 0; k < size; k = n43) {
                                            array2[k] = (byte)list.get(k);
                                            n43 = k + 1;
                                            if (a) {
                                                break;
                                            }
                                        }
                                        return new aU(sb.toString(), array2, new cs[] { new cs(n41, n), new cs(n42, n) }, d3.CODE_128);
                                    }
                                    if (a3 < 96) {
                                        Label_0704: {
                                            if (n22 == n8) {
                                                sb.append((char)(a3 + 32));
                                                if (!a) {
                                                    break Label_0704;
                                                }
                                            }
                                            sb.append((char)(128 + (a3 + 32)));
                                        }
                                        n22 = 0;
                                        if (!a) {
                                            i = n28;
                                            final int n20 = n24;
                                            final int n44 = n8;
                                            final int n19 = n23;
                                            final int n18 = n44;
                                            final int n21 = 0;
                                            continue;
                                        }
                                    }
                                    if (a3 != 106) {
                                        n23 = 0;
                                    }
                                    Label_0796: {
                                        Label_1232: {
                                            switch (a3) {
                                                case 102: {
                                                    if (!b) {
                                                        break;
                                                    }
                                                    if (sb.length() == 0) {
                                                        sb.append(gU.z[1]);
                                                        if (!a) {
                                                            break;
                                                        }
                                                    }
                                                    sb.append('\u001d');
                                                    if (a) {
                                                        break Label_1232;
                                                    }
                                                    break;
                                                }
                                                case 96:
                                                case 97: {
                                                    if (a) {
                                                        break Label_1232;
                                                    }
                                                    break;
                                                }
                                                case 100: {
                                                    if (n8 == 0 && n22 != 0) {
                                                        n8 = 1;
                                                        n22 = 0;
                                                        if (!a) {
                                                            break;
                                                        }
                                                    }
                                                    if (n8 != 0 && n22 != 0) {
                                                        n22 = 0;
                                                        n8 = 0;
                                                        if (!a) {
                                                            break;
                                                        }
                                                    }
                                                    n22 = 1;
                                                    if (a) {
                                                        break Label_1232;
                                                    }
                                                    break;
                                                }
                                                case 98: {
                                                    n24 = 1;
                                                    n12 = 101;
                                                    if (a) {
                                                        break Label_1232;
                                                    }
                                                    break;
                                                }
                                                case 101: {
                                                    n12 = 101;
                                                    if (a) {
                                                        break Label_1232;
                                                    }
                                                    break;
                                                }
                                                case 99: {
                                                    n12 = 99;
                                                    if (a) {
                                                        break Label_1232;
                                                    }
                                                    break;
                                                }
                                                case 106: {
                                                    n25 = n12;
                                                    n26 = 1;
                                                    break Label_0796;
                                                }
                                            }
                                        }
                                        final int n45 = n28;
                                        n25 = n12;
                                        n26 = n45;
                                    }
                                    if (!a) {
                                        break Label_1604;
                                    }
                                    final int n46 = n22;
                                    n29 = n25;
                                    n31 = n26;
                                    n30 = n23;
                                    n34 = n24;
                                    n32 = n8;
                                    n33 = n46;
                                }
                                Label_0920: {
                                    if (a3 < 100) {
                                        if (a3 < 10) {
                                            sb.append('0');
                                        }
                                        sb.append(a3);
                                        if (!a) {
                                            break Label_0920;
                                        }
                                    }
                                    if (a3 != 106) {
                                        n30 = 0;
                                    }
                                    Label_1302: {
                                        switch (a3) {
                                            case 102: {
                                                if (!b) {
                                                    break;
                                                }
                                                if (sb.length() == 0) {
                                                    sb.append(gU.z[2]);
                                                    if (!a) {
                                                        break;
                                                    }
                                                }
                                                sb.append('\u001d');
                                                if (a) {
                                                    break Label_1302;
                                                }
                                                break;
                                            }
                                            case 101: {
                                                n29 = 101;
                                                if (a) {
                                                    break Label_1302;
                                                }
                                                break;
                                            }
                                            case 100: {
                                                n29 = 100;
                                                if (a) {
                                                    break Label_1302;
                                                }
                                                break;
                                            }
                                            case 106: {
                                                i = 1;
                                                final int n20 = n34;
                                                final int n18 = n32;
                                                final int n21 = n33;
                                                final int n19 = n30;
                                                n12 = n29;
                                                continue;
                                            }
                                        }
                                    }
                                }
                                i = n31;
                                int n20 = n34;
                                int n18 = n32;
                                int n21 = n33;
                                int n19 = n30;
                                n12 = n29;
                                continue;
                            }
                            i = n26;
                            n12 = n25;
                            int n20 = n24;
                            int n21 = n22;
                            final int n47 = n23;
                            int n18 = n8;
                            int n19 = n47;
                            continue;
                        }
                    }
                    case 103:
                    case 104:
                    case 105: {
                        throw fD.a();
                    }
                }
            }
            final int n37 = n7;
            final int n39 = n5;
            final int n38 = n11;
            n5 = n4;
            continue;
        }
    }
}
