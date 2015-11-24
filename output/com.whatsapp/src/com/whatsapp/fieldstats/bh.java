// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum bh
{
    public static final bh DEDUPED;
    public static final bh ERROR_CANCEL;
    public static final bh ERROR_CANNOT_RESUME;
    public static final bh ERROR_DNS;
    public static final bh ERROR_HASH_MISMATCH;
    public static final bh ERROR_INSUFFICIENT_SPACE;
    public static final bh ERROR_INVALID_URL;
    public static final bh ERROR_OUTPUT_STREAM;
    public static final bh ERROR_TIMEOUT;
    public static final bh ERROR_TOO_OLD;
    public static final bh ERROR_UNKNOWN;
    public static final bh OK;
    private static final bh[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[12];
        String s = "\u0001|`,o\u001b{|(s\u000by|";
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
                        c2 = '=';
                        break;
                    }
                    case 0: {
                        c2 = 'D';
                        break;
                    }
                    case 1: {
                        c2 = '.';
                        break;
                    }
                    case 2: {
                        c2 = '2';
                        break;
                    }
                    case 3: {
                        c2 = 'c';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0001|`,o\u001bg|0h\u0002h{ t\u0001`f<n\u0014oq&";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0001|`,o\u001bz},b\u000bbv";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0001|`,o\u001bms-~\u0001b";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u000be";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u0001|`,o\u001bg|5|\bgv<h\u0016b";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0001|`,o\u001bz{.x\u000b{f";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0001|`,o\u001bj|0";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u0001|`,o\u001bfs0u\u001bc{0p\u0005zq+";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u0001|`,o\u001bag7m\u0011zm0i\u0016ks.";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0001|`,o\u001bms-s\u000bzm1x\u0017{\u007f&";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u0000kv6m\u0001j";
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
        OK = new bh(bh.z[4], 0, 1);
        ERROR_UNKNOWN = new bh(bh.z[0], 1, 2);
        ERROR_TIMEOUT = new bh(bh.z[6], 2, 3);
        ERROR_DNS = new bh(bh.z[7], 3, 4);
        ERROR_INSUFFICIENT_SPACE = new bh(bh.z[1], 4, 5);
        ERROR_TOO_OLD = new bh(bh.z[2], 5, 6);
        ERROR_CANNOT_RESUME = new bh(bh.z[10], 6, 7);
        ERROR_HASH_MISMATCH = new bh(bh.z[8], 7, 8);
        ERROR_INVALID_URL = new bh(bh.z[5], 8, 9);
        ERROR_OUTPUT_STREAM = new bh(bh.z[9], 9, 10);
        ERROR_CANCEL = new bh(bh.z[3], 10, 11);
        DEDUPED = new bh(bh.z[11], 11, 12);
        a = new bh[] { bh.OK, bh.ERROR_UNKNOWN, bh.ERROR_TIMEOUT, bh.ERROR_DNS, bh.ERROR_INSUFFICIENT_SPACE, bh.ERROR_TOO_OLD, bh.ERROR_CANNOT_RESUME, bh.ERROR_HASH_MISMATCH, bh.ERROR_INVALID_URL, bh.ERROR_OUTPUT_STREAM, bh.ERROR_CANCEL, bh.DEDUPED };
    }
    
    private bh(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
