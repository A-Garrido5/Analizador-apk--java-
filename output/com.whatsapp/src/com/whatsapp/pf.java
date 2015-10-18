// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public enum pf
{
    public static final pf ERROR_BAD_PARAMETER;
    public static final pf ERROR_BAD_TOKEN;
    public static final pf ERROR_BLOCKED;
    public static final pf ERROR_CONNECTIVITY;
    public static final pf ERROR_MISSING_PARAMETER;
    public static final pf ERROR_NEXT_METHOD;
    public static final pf ERROR_NO_ROUTES;
    public static final pf ERROR_OLD_VERSION;
    public static final pf ERROR_PROVIDER_TIMEOUT;
    public static final pf ERROR_PROVIDER_UNROUTABLE;
    public static final pf ERROR_TEMPORARILY_UNAVAILABLE;
    public static final pf ERROR_TOO_MANY;
    public static final pf ERROR_TOO_MANY_ALL_METHODS;
    public static final pf ERROR_TOO_MANY_GUESSES;
    public static final pf ERROR_TOO_RECENT;
    public static final pf ERROR_UNSPECIFIED;
    public static final pf EXPIRED;
    public static final pf OK;
    public static final pf YES;
    public static final pf YES_WITH_CODE;
    private static final pf[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[20];
        String s = "~T\u0011\u0015\u007fdV\u0011\u0015{rB\u0006\brnH\u0011\u0015xoG\u0001\u0016h";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0532:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '-';
                        break;
                    }
                    case 0: {
                        c2 = ';';
                        break;
                    }
                    case 1: {
                        c2 = '\u0006';
                        break;
                    }
                    case 2: {
                        c2 = 'C';
                        break;
                    }
                    case 3: {
                        c2 = 'Z';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "~T\u0011\u0015\u007fdH\f\u0005\u007ftS\u0017\u001f~";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "~T\u0011\u0015\u007fdD\u0002\u001erkG\u0011\u001b`~R\u0006\b";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "~T\u0011\u0015\u007fdI\u000f\u001ermC\u0011\tdtH";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "~T\u0011\u0015\u007fdV\u0011\u0015{rB\u0006\broO\u000e\u001fbnR";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "~T\u0011\u0015\u007fdS\r\t}~E\n\u001cd~B";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    s = "~T\u0011\u0015\u007fdR\f\u0015rvG\r\u0003";
                    n = 5;
                    n2 = 6;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    array = z2;
                    s = "~T\u0011\u0015\u007fdR\f\u0015rvG\r\u0003r|S\u0006\t~~U";
                    n = 6;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "~T\u0011\u0015\u007fdD\u000f\u0015npC\u0007";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "~T\u0011\u0015\u007fdH\u0006\u0002ydK\u0006\u000eetB";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "~^\u0013\u0013\u007f~B";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "~T\u0011\u0015\u007fdK\n\t~rH\u0004\u0005}zT\u0002\u0017hoC\u0011";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "tM";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "~T\u0011\u0015\u007fdR\f\u0015riC\u0000\u001fco";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "bC\u0010\u0005zrR\u000b\u0005ntB\u0006";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "~T\u0011\u0015\u007fdR\f\u0015rvG\r\u0003rzJ\u000f\u0005`~R\u000b\u0015ih";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "~T\u0011\u0015\u007fdR\u0006\u0017}tT\u0002\bdw_\u001c\u000fczP\u0002\u0013azD\u000f\u001f";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "bC\u0010";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "~T\u0011\u0015\u007fdD\u0002\u001eroI\b\u001fc";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "~T\u0011\u0015\u007fdE\f\u0014c~E\u0017\u0013{rR\u001a";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    break Label_0532;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        YES = new pf(pf.z[17], 0);
        YES_WITH_CODE = new pf(pf.z[14], 1);
        OK = new pf(pf.z[12], 2);
        EXPIRED = new pf(pf.z[10], 3);
        ERROR_UNSPECIFIED = new pf(pf.z[5], 4);
        ERROR_CONNECTIVITY = new pf(pf.z[19], 5);
        ERROR_TOO_RECENT = new pf(pf.z[13], 6);
        ERROR_TOO_MANY = new pf(pf.z[6], 7);
        ERROR_OLD_VERSION = new pf(pf.z[3], 8);
        ERROR_TEMPORARILY_UNAVAILABLE = new pf(pf.z[16], 9);
        ERROR_NEXT_METHOD = new pf(pf.z[9], 10);
        ERROR_TOO_MANY_GUESSES = new pf(pf.z[7], 11);
        ERROR_BLOCKED = new pf(pf.z[8], 12);
        ERROR_BAD_PARAMETER = new pf(pf.z[2], 13);
        ERROR_MISSING_PARAMETER = new pf(pf.z[11], 14);
        ERROR_PROVIDER_TIMEOUT = new pf(pf.z[4], 15);
        ERROR_PROVIDER_UNROUTABLE = new pf(pf.z[0], 16);
        ERROR_BAD_TOKEN = new pf(pf.z[18], 17);
        ERROR_TOO_MANY_ALL_METHODS = new pf(pf.z[15], 18);
        ERROR_NO_ROUTES = new pf(pf.z[1], 19);
        a = new pf[] { pf.YES, pf.YES_WITH_CODE, pf.OK, pf.EXPIRED, pf.ERROR_UNSPECIFIED, pf.ERROR_CONNECTIVITY, pf.ERROR_TOO_RECENT, pf.ERROR_TOO_MANY, pf.ERROR_OLD_VERSION, pf.ERROR_TEMPORARILY_UNAVAILABLE, pf.ERROR_NEXT_METHOD, pf.ERROR_TOO_MANY_GUESSES, pf.ERROR_BLOCKED, pf.ERROR_BAD_PARAMETER, pf.ERROR_MISSING_PARAMETER, pf.ERROR_PROVIDER_TIMEOUT, pf.ERROR_PROVIDER_UNROUTABLE, pf.ERROR_BAD_TOKEN, pf.ERROR_TOO_MANY_ALL_METHODS, pf.ERROR_NO_ROUTES };
    }
    
    private pf(final String s, final int n) {
    }
}
