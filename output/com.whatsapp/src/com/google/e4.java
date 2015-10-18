// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.HashMap;
import java.util.Map;

public enum e4
{
    public static final e4 ASCII;
    public static final e4 Big5;
    public static final e4 Cp1250;
    public static final e4 Cp1251;
    public static final e4 Cp1252;
    public static final e4 Cp1256;
    public static final e4 Cp437;
    public static final e4 EUC_KR;
    public static final e4 GB18030;
    public static final e4 ISO8859_1;
    public static final e4 ISO8859_10;
    public static final e4 ISO8859_11;
    public static final e4 ISO8859_13;
    public static final e4 ISO8859_14;
    public static final e4 ISO8859_15;
    public static final e4 ISO8859_16;
    public static final e4 ISO8859_2;
    public static final e4 ISO8859_3;
    public static final e4 ISO8859_4;
    public static final e4 ISO8859_5;
    public static final e4 ISO8859_6;
    public static final e4 ISO8859_7;
    public static final e4 ISO8859_8;
    public static final e4 ISO8859_9;
    public static final e4 SJIS;
    public static final e4 UTF8;
    public static final e4 UnicodeBigUnmarked;
    private static final Map a;
    private static final Map c;
    private static final String[] z;
    private final int[] b;
    private final String[] d;
    
    static {
        final String[] z2 = new String[55];
        String s = "YUX\u0010.%?H\u001e";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1407:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c2 = charArray[n3];
                char c3 = '\0';
                switch (n3 % 5) {
                    default: {
                        c3 = '\u0016';
                        break;
                    }
                    case 0: {
                        c3 = '\u0010';
                        break;
                    }
                    case 1: {
                        c3 = '\u0006';
                        break;
                    }
                    case 2: {
                        c3 = '\u0017';
                        break;
                    }
                    case 3: {
                        c3 = '(';
                        break;
                    }
                }
                charArray[n3] = (char)(c3 ^ c2);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Sv#\u001b!";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "YUX\u0005.(3.\u0005'#";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "goyLygu:\u0019$%4";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "YUX\u0010.%?H\u0019%";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "YUX\u0005.(3.\u0005'!";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    s = "YUX\u0010.%?H\u0019#";
                    n = 5;
                    n2 = 6;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    array = z2;
                    s = "ERQ\u0010";
                    n = 6;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "Sv&\u001a#&";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "YUX\u0010.%?H\u001c";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "YUX\u0010.%?H\u0019";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "goyLygu:\u0019$%7";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "YUX\u0005.(3.\u0005%";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "YUX\u0005.(3.\u0005.";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "WD\\";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "YUX\u0005.(3.\u0005'$";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    s = "YUX\u0005.(3.\u0005\"";
                    n = 15;
                    n2 = 16;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    array = z2;
                    s = "Eh~KytcUAqEhzId{cs";
                    n = 16;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "Eh~KytcUAq";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "goyLygu:\u0019$%6";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "YUX\u0010.%?H\u001d";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "ERQ\u0005.";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "WD%\u001b'\"";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "USTwU^";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "YUX\u0005.(3.\u0005$";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "YUX\u0010.%?H\u0019 ";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "CL^{";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "EU:iESO^";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "QUTa_";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "YUX\u0005.(3.\u0005'&";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "Sv&\u001a#\"";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "YUX\u0010.%?H\u001f";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "WD&\u0010&#6";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "Cn~NbOL^{";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "ERQ\u0005'&DR";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "YUX\u0005.(3.\u0005'%";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "YUX\u0010.%?H\u0019'";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "YUX\u0005.(3.\u0005!";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "YUX\u0005.(3.\u0005'";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "YUX\u0005.(3.\u0005 ";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "YUX\u0005.(3.\u0005' ";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "YUX\u0010.%?H\u0019&";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "Sv&\u001a#!";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "goyLygu:\u0019$%0";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "YUX\u0010.%?H\u0010";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "YUX\u0005.(3.\u0005/";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "YUX\u0010.%?H\u0019\"";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "YUX\u0010.%?H\u001a";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "YUX\u0005.(3.\u0005#";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "YUX\u0010.%?H\u001b";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "YUX\u0010.%?H\u0011";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "USTw]B";
                    n = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "Sv&\u001a# ";
                    n = 51;
                    array = z2;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "UST\u0005]B";
                    n = 52;
                    array = z2;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "Rop\u001d";
                    n = 53;
                    array = z2;
                    continue;
                }
                case 53: {
                    break Label_1407;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        Cp437 = new e4(e4.z[1], 0, new int[] { 0, 2 }, new String[0]);
        ISO8859_1 = new e4(e4.z[10], 1, new int[] { 1, 3 }, new String[] { e4.z[38] });
        ISO8859_2 = new e4(e4.z[47], 2, 4, new String[] { e4.z[24] });
        ISO8859_3 = new e4(e4.z[49], 3, 5, new String[] { e4.z[12] });
        ISO8859_4 = new e4(e4.z[9], 4, 6, new String[] { e4.z[16] });
        ISO8859_5 = new e4(e4.z[20], 5, 7, new String[] { e4.z[48] });
        ISO8859_6 = new e4(e4.z[0], 6, 8, new String[] { e4.z[39] });
        ISO8859_7 = new e4(e4.z[31], 7, 9, new String[] { e4.z[37] });
        ISO8859_8 = new e4(e4.z[44], 8, 10, new String[] { e4.z[13] });
        ISO8859_9 = new e4(e4.z[50], 9, 11, new String[] { e4.z[45] });
        ISO8859_10 = new e4(e4.z[41], 10, 12, new String[] { e4.z[40] });
        ISO8859_11 = new e4(e4.z[36], 11, 13, new String[] { e4.z[5] });
        ISO8859_13 = new e4(e4.z[4], 12, 15, new String[] { e4.z[2] });
        ISO8859_14 = new e4(e4.z[46], 13, 16, new String[] { e4.z[15] });
        ISO8859_15 = new e4(e4.z[6], 14, 17, new String[] { e4.z[35] });
        ISO8859_16 = new e4(e4.z[25], 15, 18, new String[] { e4.z[29] });
        SJIS = new e4(e4.z[26], 16, 20, new String[] { e4.z[33] });
        Cp1250 = new e4(e4.z[52], 17, 21, new String[] { e4.z[19] });
        Cp1251 = new e4(e4.z[42], 18, 22, new String[] { e4.z[11] });
        Cp1252 = new e4(e4.z[30], 19, 23, new String[] { e4.z[3] });
        Cp1256 = new e4(e4.z[8], 20, 24, new String[] { e4.z[43] });
        UnicodeBigUnmarked = new e4(e4.z[17], 21, 25, new String[] { e4.z[34], e4.z[18] });
        UTF8 = new e4(e4.z[7], 22, 26, new String[] { e4.z[21] });
        ASCII = new e4(e4.z[28], 23, new int[] { 27, 170 }, new String[] { e4.z[27] });
        Big5 = new e4(e4.z[54], 24, 28);
        GB18030 = new e4(e4.z[32], 25, 29, new String[] { e4.z[22], e4.z[23], e4.z[14] });
        EUC_KR = new e4(e4.z[51], 26, 30, new String[] { e4.z[53] });
        c = new HashMap();
        a = new HashMap();
        for (final e4 e2 : values()) {
            final int[] b = e2.b;
            for (int length2 = b.length, k = 0; k < length2; ++k) {
                e4.c.put(b[k], e2);
            }
            e4.a.put(e2.name(), e2);
            final String[] d = e2.d;
            for (int length3 = d.length, l = 0; l < length3; ++l) {
                e4.a.put(d[l], e2);
            }
        }
    }
    
    private e4(final String s, final int n, final int n2) {
        this(s, n, new int[] { n2 }, new String[0]);
    }
    
    private e4(final String s, final int n, final int n2, final String[] d) {
        this.b = new int[] { n2 };
        this.d = d;
    }
    
    private e4(final String s, final int n, final int[] b, final String[] d) {
        this.b = b;
        this.d = d;
    }
    
    public static e4 getCharacterSetECIByName(final String s) {
        return e4.a.get(s);
    }
    
    public static e4 getCharacterSetECIByValue(final int n) {
        if (n < 0 || n >= 900) {
            throw fD.a();
        }
        return e4.c.get(n);
    }
    
    public int getValue() {
        return this.b[0];
    }
}
