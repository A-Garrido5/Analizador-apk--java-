// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Locale;
import java.util.HashMap;
import java.util.Map;

public abstract class el
{
    public static int a;
    private static Map b;
    private static final String[] z;
    
    static {
        final String[] array = new String[6];
        String s = "r\u0005o";
        int n = -1;
        String[] array2 = array;
        String[] z2 = array;
        int n2 = 0;
        String intern = null;
    Label_3953:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0016';
                        break;
                    }
                    case 0: {
                        c2 = '\u0014';
                        break;
                    }
                    case 1: {
                        c2 = '`';
                        break;
                    }
                    case 2: {
                        c2 = '\u0018';
                        break;
                    }
                    case 3: {
                        c2 = '\u0002';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array2[n2] = intern;
                    s = "{\u000e}";
                    n2 = 1;
                    array2 = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array2[n2] = intern;
                    s = "y\u0001v{";
                    n2 = 2;
                    array2 = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array2[n2] = intern;
                    s = "{\u0014pgd";
                    n2 = 3;
                    array2 = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array2[n2] = intern;
                    s = "n\u0005jm";
                    n2 = 4;
                    array2 = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array2[n2] = intern;
                    n2 = 5;
                    array2 = z2;
                    s = "`\u0017w";
                    n = 4;
                    continue;
                }
                case 4: {
                    array2[n2] = intern;
                    z = z2;
                    el.b = new HashMap();
                    final String[] array3 = new String[54];
                    s = "v\u0005u";
                    n = 5;
                    array2 = array3;
                    z2 = array3;
                    n2 = 0;
                    continue;
                }
                case 5: {
                    array2[n2] = intern;
                    s = "v\u0012`";
                    n = 6;
                    n2 = 1;
                    array2 = z2;
                    continue;
                }
                case 6: {
                    array2[n2] = intern;
                    s = "p\u0001";
                    n = 7;
                    n2 = 2;
                    array2 = z2;
                    continue;
                }
                case 7: {
                    array2[n2] = intern;
                    s = "p\u0005";
                    n = 8;
                    n2 = 3;
                    array2 = z2;
                    continue;
                }
                case 8: {
                    array2[n2] = intern;
                    s = "q\f";
                    n = 9;
                    n2 = 4;
                    array2 = z2;
                    continue;
                }
                case 9: {
                    array2[n2] = intern;
                    n2 = 5;
                    s = "q\u000e";
                    n = 10;
                    array2 = z2;
                    continue;
                }
                case 10: {
                    array2[n2] = intern;
                    n2 = 6;
                    s = "q\u000f";
                    n = 11;
                    array2 = z2;
                    continue;
                }
                case 11: {
                    array2[n2] = intern;
                    n2 = 7;
                    s = "q\u0013";
                    n = 12;
                    array2 = z2;
                    continue;
                }
                case 12: {
                    array2[n2] = intern;
                    n2 = 8;
                    s = "q\u0014";
                    n = 13;
                    array2 = z2;
                    continue;
                }
                case 13: {
                    array2[n2] = intern;
                    n2 = 9;
                    s = "r\t";
                    n = 14;
                    array2 = z2;
                    continue;
                }
                case 14: {
                    array2[n2] = intern;
                    n2 = 10;
                    s = "r\u000f";
                    n = 15;
                    array2 = z2;
                    continue;
                }
                case 15: {
                    array2[n2] = intern;
                    n2 = 11;
                    s = "s\f";
                    n = 16;
                    array2 = z2;
                    continue;
                }
                case 16: {
                    array2[n2] = intern;
                    n2 = 12;
                    s = "|\u0005";
                    n = 17;
                    array2 = z2;
                    continue;
                }
                case 17: {
                    array2[n2] = intern;
                    n2 = 13;
                    s = "}\u0017";
                    n = 18;
                    array2 = z2;
                    continue;
                }
                case 18: {
                    array2[n2] = intern;
                    n2 = 14;
                    s = "}\u0014";
                    n = 19;
                    array2 = z2;
                    continue;
                }
                case 19: {
                    array2[n2] = intern;
                    n2 = 15;
                    s = "z\u0002";
                    n = 20;
                    array2 = z2;
                    continue;
                }
                case 20: {
                    array2[n2] = intern;
                    n2 = 16;
                    s = "z\f";
                    n = 21;
                    array2 = z2;
                    continue;
                }
                case 21: {
                    array2[n2] = intern;
                    n2 = 17;
                    s = "z\u000e";
                    n = 22;
                    array2 = z2;
                    continue;
                }
                case 22: {
                    array2[n2] = intern;
                    n2 = 18;
                    s = "z\u000f";
                    n = 23;
                    array2 = z2;
                    continue;
                }
                case 23: {
                    array2[n2] = intern;
                    n2 = 19;
                    s = "g\u0016";
                    n = 24;
                    array2 = z2;
                    continue;
                }
                case 24: {
                    array2[n2] = intern;
                    n2 = 20;
                    s = "u\u0006";
                    n = 25;
                    array2 = z2;
                    continue;
                }
                case 25: {
                    array2[n2] = intern;
                    n2 = 21;
                    s = "v\u0007";
                    n = 26;
                    array2 = z2;
                    continue;
                }
                case 26: {
                    array2[n2] = intern;
                    n2 = 22;
                    s = "v\u000e";
                    n = 27;
                    array2 = z2;
                    continue;
                }
                case 27: {
                    array2[n2] = intern;
                    n2 = 23;
                    s = "w\u0001";
                    n = 28;
                    array2 = z2;
                    continue;
                }
                case 28: {
                    array2[n2] = intern;
                    n2 = 24;
                    s = "q\u0015";
                    n = 29;
                    array2 = z2;
                    continue;
                }
                case 29: {
                    array2[n2] = intern;
                    n2 = 25;
                    s = "r\u0015j";
                    n = 30;
                    array2 = z2;
                    continue;
                }
                case 30: {
                    array2[n2] = intern;
                    n2 = 26;
                    s = "r\u0019";
                    n = 31;
                    array2 = z2;
                    continue;
                }
                case 31: {
                    array2[n2] = intern;
                    n2 = 27;
                    s = "s\u0015";
                    n = 32;
                    array2 = z2;
                    continue;
                }
                case 32: {
                    array2[n2] = intern;
                    n2 = 28;
                    s = "|\u0001";
                    n = 33;
                    array2 = z2;
                    continue;
                }
                case 33: {
                    array2[n2] = intern;
                    n2 = 29;
                    s = "}\u0013";
                    n = 34;
                    array2 = z2;
                    continue;
                }
                case 34: {
                    array2[n2] = intern;
                    n2 = 30;
                    s = "\u007f\u0015";
                    n = 35;
                    array2 = z2;
                    continue;
                }
                case 35: {
                    array2[n2] = intern;
                    n2 = 31;
                    s = "x\u0002";
                    n = 36;
                    array2 = z2;
                    continue;
                }
                case 36: {
                    array2[n2] = intern;
                    n2 = 32;
                    s = "y\f";
                    n = 37;
                    array2 = z2;
                    continue;
                }
                case 37: {
                    array2[n2] = intern;
                    n2 = 33;
                    s = "y\u0012";
                    n = 38;
                    array2 = z2;
                    continue;
                }
                case 38: {
                    array2[n2] = intern;
                    n2 = 34;
                    s = "z\u0001p";
                    n = 39;
                    array2 = z2;
                    continue;
                }
                case 39: {
                    array2[n2] = intern;
                    n2 = 35;
                    s = "z\u0005";
                    n = 40;
                    array2 = z2;
                    continue;
                }
                case 40: {
                    array2[n2] = intern;
                    n2 = 36;
                    s = "{\r";
                    n = 41;
                    array2 = z2;
                    continue;
                }
                case 41: {
                    array2[n2] = intern;
                    n2 = 37;
                    s = "{\u0012";
                    n = 42;
                    array2 = z2;
                    continue;
                }
                case 42: {
                    array2[n2] = intern;
                    n2 = 38;
                    s = "d\u0001";
                    n = 43;
                    array2 = z2;
                    continue;
                }
                case 43: {
                    array2[n2] = intern;
                    n2 = 39;
                    s = "d\u0001h";
                    n = 44;
                    array2 = z2;
                    continue;
                }
                case 44: {
                    array2[n2] = intern;
                    n2 = 40;
                    s = "d\u0013";
                    n = 45;
                    array2 = z2;
                    continue;
                }
                case 45: {
                    array2[n2] = intern;
                    n2 = 41;
                    s = "g\u000f";
                    n = 46;
                    array2 = z2;
                    continue;
                }
                case 46: {
                    array2[n2] = intern;
                    n2 = 42;
                    s = "g\u0011";
                    n = 47;
                    array2 = z2;
                    continue;
                }
                case 47: {
                    array2[n2] = intern;
                    n2 = 43;
                    s = "g\u0017";
                    n = 48;
                    array2 = z2;
                    continue;
                }
                case 48: {
                    array2[n2] = intern;
                    n2 = 44;
                    s = "`\u0001";
                    n = 49;
                    array2 = z2;
                    continue;
                }
                case 49: {
                    array2[n2] = intern;
                    n2 = 45;
                    s = "`\u0005";
                    n = 50;
                    array2 = z2;
                    continue;
                }
                case 50: {
                    array2[n2] = intern;
                    n2 = 46;
                    s = "`\u000b";
                    n = 51;
                    array2 = z2;
                    continue;
                }
                case 51: {
                    array2[n2] = intern;
                    n2 = 47;
                    s = "a\u0012";
                    n = 52;
                    array2 = z2;
                    continue;
                }
                case 52: {
                    array2[n2] = intern;
                    n2 = 48;
                    s = "n\u0015";
                    n = 53;
                    array2 = z2;
                    continue;
                }
                case 53: {
                    array2[n2] = intern;
                    n2 = 49;
                    s = "y\u000e";
                    n = 54;
                    array2 = z2;
                    continue;
                }
                case 54: {
                    array2[n2] = intern;
                    n2 = 50;
                    s = "s\u0013o";
                    n = 55;
                    array2 = z2;
                    continue;
                }
                case 55: {
                    array2[n2] = intern;
                    n2 = 51;
                    s = "w\bj";
                    n = 56;
                    array2 = z2;
                    continue;
                }
                case 56: {
                    array2[n2] = intern;
                    n2 = 52;
                    s = "f\r";
                    n = 57;
                    array2 = z2;
                    continue;
                }
                case 57: {
                    array2[n2] = intern;
                    n2 = 53;
                    s = "d\u0014";
                    n = 58;
                    array2 = z2;
                    continue;
                }
                case 58: {
                    array2[n2] = intern;
                    a(z2, new e5());
                    final String[] array4 = new String[2];
                    s = "w\u0013";
                    n = 59;
                    array2 = array4;
                    z2 = array4;
                    n2 = 0;
                    continue;
                }
                case 59: {
                    array2[n2] = intern;
                    s = "g\u000b";
                    n = 60;
                    n2 = 1;
                    array2 = z2;
                    continue;
                }
                case 60: {
                    array2[n2] = intern;
                    a(z2, new ed());
                    final String[] array5 = new String[3];
                    s = "r\u0006";
                    n = 61;
                    array2 = array5;
                    z2 = array5;
                    n2 = 0;
                    continue;
                }
                case 61: {
                    array2[n2] = intern;
                    s = "r\u0012";
                    n = 62;
                    n2 = 1;
                    array2 = z2;
                    continue;
                }
                case 62: {
                    array2[n2] = intern;
                    s = "\u007f\u0001z";
                    n = 63;
                    n2 = 2;
                    array2 = z2;
                    continue;
                }
                case 63: {
                    array2[n2] = intern;
                    a(z2, new e8());
                    final String[] array6 = new String[7];
                    s = "|\u0012";
                    n = 64;
                    array2 = array6;
                    z2 = array6;
                    n2 = 0;
                    continue;
                }
                case 64: {
                    array2[n2] = intern;
                    s = "f\u0015";
                    n = 65;
                    n2 = 1;
                    array2 = z2;
                    continue;
                }
                case 65: {
                    array2[n2] = intern;
                    s = "g\u0012";
                    n = 66;
                    n2 = 2;
                    array2 = z2;
                    continue;
                }
                case 66: {
                    array2[n2] = intern;
                    s = "a\u000b";
                    n = 67;
                    n2 = 3;
                    array2 = z2;
                    continue;
                }
                case 67: {
                    array2[n2] = intern;
                    s = "v\u0005";
                    n = 68;
                    n2 = 4;
                    array2 = z2;
                    continue;
                }
                case 68: {
                    array2[n2] = intern;
                    n2 = 5;
                    s = "v\u0013";
                    n = 69;
                    array2 = z2;
                    continue;
                }
                case 69: {
                    array2[n2] = intern;
                    n2 = 6;
                    s = "g\b";
                    n = 70;
                    array2 = z2;
                    continue;
                }
                case 70: {
                    array2[n2] = intern;
                    a(z2, new e9());
                    final String[] array7 = { null };
                    s = "x\u0016";
                    n = 71;
                    array2 = array7;
                    z2 = array7;
                    n2 = 0;
                    continue;
                }
                case 71: {
                    array2[n2] = intern;
                    a(z2, new e0());
                    final String[] array8 = { null };
                    s = "x\u0014";
                    n = 72;
                    array2 = array8;
                    z2 = array8;
                    n2 = 0;
                    continue;
                }
                case 72: {
                    array2[n2] = intern;
                    a(z2, new e2());
                    final String[] array9 = { null };
                    s = "d\f";
                    n = 73;
                    array2 = array9;
                    z2 = array9;
                    n2 = 0;
                    continue;
                }
                case 73: {
                    array2[n2] = intern;
                    a(z2, new ej());
                    final String[] array10 = new String[2];
                    s = "f\u000f";
                    n = 74;
                    array2 = array10;
                    z2 = array10;
                    n2 = 0;
                    continue;
                }
                case 74: {
                    array2[n2] = intern;
                    s = "y\u000f";
                    n = 75;
                    n2 = 1;
                    array2 = z2;
                    continue;
                }
                case 75: {
                    array2[n2] = intern;
                    a(z2, new ee());
                    final String[] array11 = { null };
                    s = "g\f";
                    n = 76;
                    array2 = array11;
                    z2 = array11;
                    n2 = 0;
                    continue;
                }
                case 76: {
                    array2[n2] = intern;
                    a(z2, new eg());
                    final String[] array12 = { null };
                    s = "u\u0012";
                    n = 77;
                    array2 = array12;
                    z2 = array12;
                    n2 = 0;
                    continue;
                }
                case 77: {
                    array2[n2] = intern;
                    a(z2, new eo());
                    final String[] array13 = { null };
                    s = "y\u000b";
                    n = 78;
                    array2 = array13;
                    z2 = array13;
                    n2 = 0;
                    continue;
                }
                case 78: {
                    array2[n2] = intern;
                    a(z2, new er());
                    final String[] array14 = { null };
                    s = "w\u0019";
                    n = 79;
                    array2 = array14;
                    z2 = array14;
                    n2 = 0;
                    continue;
                }
                case 79: {
                    array2[n2] = intern;
                    a(z2, new en());
                    final String[] array15 = { null };
                    s = "v\u0012";
                    n = 80;
                    array2 = array15;
                    z2 = array15;
                    n2 = 0;
                    continue;
                }
                case 80: {
                    array2[n2] = intern;
                    a(z2, new et());
                    final String[] array16 = { null };
                    s = "x\u0001\u007f";
                    n = 81;
                    array2 = array16;
                    z2 = array16;
                    n2 = 0;
                    continue;
                }
                case 81: {
                    array2[n2] = intern;
                    a(z2, new ea());
                    final String[] array17 = { null };
                    s = "g\bq";
                    n = 82;
                    array2 = array17;
                    z2 = array17;
                    n2 = 0;
                    continue;
                }
                case 82: {
                    array2[n2] = intern;
                    a(z2, new eb());
                    final String[] array18 = { null };
                    s = "y\u0014";
                    n = 83;
                    array2 = array18;
                    z2 = array18;
                    n2 = 0;
                    continue;
                }
                case 83: {
                    array2[n2] = intern;
                    a(z2, new ec());
                    final String[] array19 = new String[7];
                    s = "s\u0001";
                    n = 84;
                    array2 = array19;
                    z2 = array19;
                    n2 = 0;
                    continue;
                }
                case 84: {
                    array2[n2] = intern;
                    s = "g\u0005";
                    n = 85;
                    n2 = 1;
                    array2 = z2;
                    continue;
                }
                case 85: {
                    array2[n2] = intern;
                    s = "g\ry";
                    n = 86;
                    n2 = 2;
                    array2 = z2;
                    continue;
                }
                case 86: {
                    array2[n2] = intern;
                    s = "g\rq";
                    n = 87;
                    n2 = 3;
                    array2 = z2;
                    continue;
                }
                case 87: {
                    array2[n2] = intern;
                    s = "g\rr";
                    n = 88;
                    n2 = 4;
                    array2 = z2;
                    continue;
                }
                case 88: {
                    array2[n2] = intern;
                    n2 = 5;
                    s = "g\rv";
                    n = 89;
                    array2 = z2;
                    continue;
                }
                case 89: {
                    array2[n2] = intern;
                    n2 = 6;
                    s = "g\rk";
                    n = 90;
                    array2 = z2;
                    continue;
                }
                case 90: {
                    array2[n2] = intern;
                    a(z2, new ez());
                    final String[] array20 = new String[12];
                    s = "u\u000b";
                    n = 91;
                    array2 = array20;
                    z2 = array20;
                    n2 = 0;
                    continue;
                }
                case 91: {
                    array2[n2] = intern;
                    s = "u\r";
                    n = 92;
                    n2 = 1;
                    array2 = z2;
                    continue;
                }
                case 92: {
                    array2[n2] = intern;
                    s = "v\b";
                    n = 93;
                    n2 = 2;
                    array2 = z2;
                    continue;
                }
                case 93: {
                    array2[n2] = intern;
                    s = "r\tt";
                    n = 94;
                    n2 = 3;
                    array2 = z2;
                    continue;
                }
                case 94: {
                    array2[n2] = intern;
                    s = "`\f";
                    n = 95;
                    n2 = 4;
                    array2 = z2;
                    continue;
                }
                case 95: {
                    array2[n2] = intern;
                    n2 = 5;
                    s = "s\u0015o";
                    n = 96;
                    array2 = z2;
                    continue;
                }
                case 96: {
                    array2[n2] = intern;
                    n2 = 6;
                    s = "|\t";
                    n = 97;
                    array2 = z2;
                    continue;
                }
                case 97: {
                    array2[n2] = intern;
                    n2 = 7;
                    s = "x\u000e";
                    n = 98;
                    array2 = z2;
                    continue;
                }
                case 98: {
                    array2[n2] = intern;
                    n2 = 8;
                    s = "y\u0007";
                    n = 99;
                    array2 = z2;
                    continue;
                }
                case 99: {
                    array2[n2] = intern;
                    n2 = 9;
                    s = "z\u0013w";
                    n = 100;
                    array2 = z2;
                    continue;
                }
                case 100: {
                    array2[n2] = intern;
                    n2 = 10;
                    s = "`\t";
                    n = 101;
                    array2 = z2;
                    continue;
                }
                case 101: {
                    array2[n2] = intern;
                    n2 = 11;
                    s = "c\u0001";
                    n = 102;
                    array2 = z2;
                    continue;
                }
                case 102: {
                    array2[n2] = intern;
                    a(z2, new e7());
                    final String[] array21 = new String[27];
                    s = "u\u001a";
                    n = 103;
                    array2 = array21;
                    z2 = array21;
                    n2 = 0;
                    continue;
                }
                case 103: {
                    array2[n2] = intern;
                    s = "v\r";
                    n = 104;
                    n2 = 1;
                    array2 = z2;
                    continue;
                }
                case 104: {
                    array2[n2] = intern;
                    s = "r\u0001";
                    n = 105;
                    n2 = 2;
                    array2 = z2;
                    continue;
                }
                case 105: {
                    array2[n2] = intern;
                    s = "}\u0007";
                    n = 106;
                    n2 = 3;
                    array2 = z2;
                    continue;
                }
                case 106: {
                    array2[n2] = intern;
                    s = "|\u0015";
                    n = 107;
                    n2 = 4;
                    array2 = z2;
                    continue;
                }
                case 107: {
                    array2[n2] = intern;
                    n2 = 5;
                    s = "~\u0001";
                    n = 108;
                    array2 = z2;
                    continue;
                }
                case 108: {
                    array2[n2] = intern;
                    n2 = 6;
                    s = "\u007f\u0004}";
                    n = 109;
                    array2 = z2;
                    continue;
                }
                case 109: {
                    array2[n2] = intern;
                    n2 = 7;
                    s = "\u007f\u0005y";
                    n = 110;
                    array2 = z2;
                    continue;
                }
                case 110: {
                    array2[n2] = intern;
                    n2 = 8;
                    s = "\u007f\u000f";
                    n = 111;
                    array2 = z2;
                    continue;
                }
                case 111: {
                    array2[n2] = intern;
                    n2 = 9;
                    s = "y\u0019";
                    n = 112;
                    array2 = z2;
                    continue;
                }
                case 112: {
                    array2[n2] = intern;
                    n2 = 10;
                    s = "g\u0005k";
                    n = 113;
                    array2 = z2;
                    continue;
                }
                case 113: {
                    array2[n2] = intern;
                    n2 = 11;
                    s = "g\u0007";
                    n = 114;
                    array2 = z2;
                    continue;
                }
                case 114: {
                    array2[n2] = intern;
                    n2 = 12;
                    s = "`\u000f";
                    n = 115;
                    array2 = z2;
                    continue;
                }
                case 115: {
                    array2[n2] = intern;
                    n2 = 13;
                    s = "`\u0012";
                    n = 116;
                    array2 = z2;
                    continue;
                }
                case 116: {
                    array2[n2] = intern;
                    n2 = 14;
                    s = "b\t";
                    n = 117;
                    array2 = z2;
                    continue;
                }
                case 117: {
                    array2[n2] = intern;
                    n2 = 15;
                    s = "c\u000f";
                    n = 118;
                    array2 = z2;
                    continue;
                }
                case 118: {
                    array2[n2] = intern;
                    n2 = 16;
                    s = "m\u000f";
                    n = 119;
                    array2 = z2;
                    continue;
                }
                case 119: {
                    array2[n2] = intern;
                    n2 = 17;
                    s = "n\b";
                    n = 120;
                    array2 = z2;
                    continue;
                }
                case 120: {
                    array2[n2] = intern;
                    n2 = 18;
                    s = "v\u000f";
                    n = 121;
                    array2 = z2;
                    continue;
                }
                case 121: {
                    array2[n2] = intern;
                    n2 = 19;
                    s = "p\u001a";
                    n = 122;
                    array2 = z2;
                    continue;
                }
                case 122: {
                    array2[n2] = intern;
                    n2 = 20;
                    s = "}\u0004";
                    n = 123;
                    array2 = z2;
                    continue;
                }
                case 123: {
                    array2[n2] = intern;
                    n2 = 21;
                    s = "~\u0016";
                    n = 124;
                    array2 = z2;
                    continue;
                }
                case 124: {
                    array2[n2] = intern;
                    n2 = 22;
                    s = "\u007f\u0001";
                    n = 125;
                    array2 = z2;
                    continue;
                }
                case 125: {
                    array2[n2] = intern;
                    n2 = 23;
                    s = "\u007f\r";
                    n = 126;
                    array2 = z2;
                    continue;
                }
                case 126: {
                    array2[n2] = intern;
                    n2 = 24;
                    s = "\u007f\u000e";
                    n = 127;
                    array2 = z2;
                    continue;
                }
                case 127: {
                    array2[n2] = intern;
                    n2 = 25;
                    s = "y\u0013";
                    n = 128;
                    array2 = z2;
                    continue;
                }
                case 128: {
                    array2[n2] = intern;
                    n2 = 26;
                    s = "`\b";
                    n = 129;
                    array2 = z2;
                    continue;
                }
                case 129: {
                    break Label_3953;
                }
            }
        }
        array2[n2] = intern;
        a(z2, new e3());
    }
    
    static final el a(final Locale locale) {
        return el.b.get(locale.getLanguage());
    }
    
    static final String a(final int n) {
        switch (n) {
            default: {
                return el.z[3];
            }
            case 1: {
                return el.z[4];
            }
            case 2: {
                return el.z[1];
            }
            case 4: {
                return el.z[5];
            }
            case 8: {
                return el.z[0];
            }
            case 16: {
                return el.z[2];
            }
        }
    }
    
    public static void a(final String[] array, final el el) {
        for (int length = array.length, i = 0; i < length; ++i) {
            el.b.put(array[i], el);
        }
    }
    
    static final int c(final int n) {
        switch (n) {
            default: {
                return 16777220;
            }
            case 1: {
                return 16777221;
            }
            case 2: {
                return 16777222;
            }
            case 4: {
                return 16777223;
            }
            case 8: {
                return 16777224;
            }
            case 16: {
                return 16777225;
            }
        }
    }
    
    abstract int b(final int p0);
}
