// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum an
{
    public static final an CELLULAR_1XRTT;
    public static final an CELLULAR_CDMA;
    public static final an CELLULAR_EDGE;
    public static final an CELLULAR_EHRPD;
    public static final an CELLULAR_EVDO;
    public static final an CELLULAR_GPRS;
    public static final an CELLULAR_HSDPA;
    public static final an CELLULAR_HSPA;
    public static final an CELLULAR_HSPAP;
    public static final an CELLULAR_HSUPA;
    public static final an CELLULAR_IDEN;
    public static final an CELLULAR_LTE;
    public static final an CELLULAR_UMTS;
    public static final an CELLULAR_UNKNOWN;
    public static final an WIFI_UNKNOWN;
    private static final an[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[15];
        String s = "\u001duP`2\u0012qNs\"\u0016bLh";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0407:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'g';
                        break;
                    }
                    case 0: {
                        c2 = '^';
                        break;
                    }
                    case 1: {
                        c2 = '0';
                        break;
                    }
                    case 2: {
                        c2 = '\u001c';
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
                    s = "\u001duP`2\u0012qNs\"\u001awY";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u001duP`2\u0012qNs.\u001auR";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u001duP`2\u0012qNs\"\btS";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u001duP`2\u0012qNs \u000ebO";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u001duP`2\u0012qNs/\r`]|";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u001duP`2\u0012qNs/\rtLm";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u001duP`2\u0012qNs/\reLm";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u001duP`2\u0012qNs2\u0013dO";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u001duP`2\u0012qNsV\u0006bHx";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u001duP`2\u0012qNs/\r`]";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u001duP`2\u0012qNs2\u0010{Rc0\u0010";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u001duP`2\u0012qNs$\u001a}]";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\tyZe8\u000b~Wb(\t~";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\u001duP`2\u0012qNs+\nu";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    break Label_0407;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        CELLULAR_UNKNOWN = new an(an.z[11], 0, 0);
        WIFI_UNKNOWN = new an(an.z[13], 1, 1);
        CELLULAR_EDGE = new an(an.z[1], 2, 100);
        CELLULAR_IDEN = new an(an.z[2], 3, 101);
        CELLULAR_UMTS = new an(an.z[8], 4, 102);
        CELLULAR_EVDO = new an(an.z[3], 5, 103);
        CELLULAR_GPRS = new an(an.z[4], 6, 104);
        CELLULAR_HSDPA = new an(an.z[6], 7, 105);
        CELLULAR_HSUPA = new an(an.z[7], 8, 106);
        CELLULAR_HSPA = new an(an.z[10], 9, 107);
        CELLULAR_CDMA = new an(an.z[12], 10, 108);
        CELLULAR_1XRTT = new an(an.z[9], 11, 109);
        CELLULAR_EHRPD = new an(an.z[0], 12, 110);
        CELLULAR_LTE = new an(an.z[14], 13, 111);
        CELLULAR_HSPAP = new an(an.z[5], 14, 112);
        a = new an[] { an.CELLULAR_UNKNOWN, an.WIFI_UNKNOWN, an.CELLULAR_EDGE, an.CELLULAR_IDEN, an.CELLULAR_UMTS, an.CELLULAR_EVDO, an.CELLULAR_GPRS, an.CELLULAR_HSDPA, an.CELLULAR_HSUPA, an.CELLULAR_HSPA, an.CELLULAR_CDMA, an.CELLULAR_1XRTT, an.CELLULAR_EHRPD, an.CELLULAR_LTE, an.CELLULAR_HSPAP };
    }
    
    private an(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
