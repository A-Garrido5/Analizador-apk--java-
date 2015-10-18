// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum s
{
    public static final s ANDROID;
    public static final s BB;
    public static final s BBX;
    public static final s IPHONE;
    public static final s OSMETA;
    public static final s S40;
    public static final s SYMBIAN;
    public static final s TEST;
    public static final s UNKNOWN;
    public static final s WEBCLIENT;
    public static final s WP;
    private static final s[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[11];
        String s = "7$";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0307:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = ':';
                        break;
                    }
                    case 0: {
                        c2 = 'u';
                        break;
                    }
                    case 1: {
                        c2 = 'f';
                        break;
                    }
                    case 2: {
                        c2 = '~';
                        break;
                    }
                    case 3: {
                        c2 = 'L';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "7$&";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = " (5\u0002u\"(";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = ":53\tn4";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "&RN";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "&?3\u000es4(";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\"6";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\"#<\u000fv<#0\u0018";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "!#-\u0018";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "<66\u0003t0";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "4(:\u001eu<\"";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    break Label_0307;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        IPHONE = new s(com.whatsapp.fieldstats.s.z[9], 0, 1);
        ANDROID = new s(com.whatsapp.fieldstats.s.z[10], 1, 2);
        BB = new s(com.whatsapp.fieldstats.s.z[0], 2, 3);
        BBX = new s(com.whatsapp.fieldstats.s.z[1], 3, 7);
        S40 = new s(com.whatsapp.fieldstats.s.z[4], 4, 4);
        SYMBIAN = new s(com.whatsapp.fieldstats.s.z[5], 5, 5);
        WP = new s(com.whatsapp.fieldstats.s.z[6], 6, 6);
        WEBCLIENT = new s(com.whatsapp.fieldstats.s.z[7], 7, 8);
        OSMETA = new s(com.whatsapp.fieldstats.s.z[3], 8, 11);
        TEST = new s(com.whatsapp.fieldstats.s.z[8], 9, 9);
        UNKNOWN = new s(com.whatsapp.fieldstats.s.z[2], 10, 10);
        a = new s[] { com.whatsapp.fieldstats.s.IPHONE, com.whatsapp.fieldstats.s.ANDROID, com.whatsapp.fieldstats.s.BB, com.whatsapp.fieldstats.s.BBX, com.whatsapp.fieldstats.s.S40, com.whatsapp.fieldstats.s.SYMBIAN, com.whatsapp.fieldstats.s.WP, com.whatsapp.fieldstats.s.WEBCLIENT, com.whatsapp.fieldstats.s.OSMETA, com.whatsapp.fieldstats.s.TEST, com.whatsapp.fieldstats.s.UNKNOWN };
    }
    
    private s(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
