// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public enum cY
{
    public static final cY ADDRESSBOOK;
    public static final cY CALENDAR;
    public static final cY EMAIL_ADDRESS;
    public static final cY GEO;
    public static final cY ISBN;
    public static final cY PRODUCT;
    public static final cY SMS;
    public static final cY TEL;
    public static final cY TEXT;
    public static final cY URI;
    public static final cY VIN;
    public static final cY WIFI;
    public static int a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[12];
        String s = "=[@";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0332:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'f';
                        break;
                    }
                    case 0: {
                        c2 = 'h';
                        break;
                    }
                    case 1: {
                        c2 = '\t';
                        break;
                    }
                    case 2: {
                        c2 = '\t';
                        break;
                    }
                    case 3: {
                        c2 = '\u0019';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ";DZ";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "?@OP";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "<LQM";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "!ZKW";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = ")MMK#;ZKV)#";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "-DHP*7HM]4-ZZ";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "8[F]3+]";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "/LF";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    s = "<LE";
                    n = 8;
                    n2 = 9;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    array = z2;
                    s = "+HE\\(,H[";
                    n = 9;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = ">@G";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    break Label_0332;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        ADDRESSBOOK = new cY(cY.z[5], 0);
        EMAIL_ADDRESS = new cY(cY.z[6], 1);
        PRODUCT = new cY(cY.z[7], 2);
        URI = new cY(cY.z[0], 3);
        TEXT = new cY(cY.z[3], 4);
        GEO = new cY(cY.z[8], 5);
        TEL = new cY(cY.z[9], 6);
        SMS = new cY(cY.z[1], 7);
        CALENDAR = new cY(cY.z[10], 8);
        WIFI = new cY(cY.z[2], 9);
        ISBN = new cY(cY.z[4], 10);
        VIN = new cY(cY.z[11], 11);
    }
    
    private cY(final String s, final int n) {
    }
}
