// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public enum kp
{
    public static final kp CANCEL;
    public static final kp FAILED_CANNOT_RESUME;
    public static final kp FAILED_GENERIC;
    public static final kp FAILED_HASH_MISMATCH;
    public static final kp FAILED_INSUFFICIENT_SPACE;
    public static final kp FAILED_INVALID_URL;
    public static final kp FAILED_OUTPUT_STREAM;
    public static final kp FAILED_TOO_OLD;
    public static final kp SUCCESS;
    private static final kp[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[9];
        String s = "%yy\u0017X'gw\u001eS&jy\u0018";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0257:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u001d';
                        break;
                    }
                    case 0: {
                        c2 = 'c';
                        break;
                    }
                    case 1: {
                        c2 = '8';
                        break;
                    }
                    case 2: {
                        c2 = '0';
                        break;
                    }
                    case 3: {
                        c2 = '[';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "%yy\u0017X'gy\u0015K\"ty\u001fB6j|";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "%yy\u0017X'g\u007f\u000eI3md\u0004N7ju\u001aP";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = " y~\u0018X/";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "%yy\u0017X'gs\u001aS-wd\u0004O&ke\u0016X";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "%yy\u0017X'gy\u0015N6~v\u0012^*}~\u000fB0hq\u0018X";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "0ms\u0018X0k";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "%yy\u0017X'gd\u0014R<w|\u001f";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "%yy\u0017X'gx\u001aN+g}\u0012N.yd\u0018U";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    break Label_0257;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        FAILED_GENERIC = new kp(kp.z[0], 0);
        SUCCESS = new kp(kp.z[6], 1);
        FAILED_INSUFFICIENT_SPACE = new kp(kp.z[5], 2);
        FAILED_TOO_OLD = new kp(kp.z[7], 3);
        FAILED_CANNOT_RESUME = new kp(kp.z[4], 4);
        FAILED_HASH_MISMATCH = new kp(kp.z[8], 5);
        FAILED_INVALID_URL = new kp(kp.z[1], 6);
        FAILED_OUTPUT_STREAM = new kp(kp.z[2], 7);
        CANCEL = new kp(kp.z[3], 8);
        a = new kp[] { kp.FAILED_GENERIC, kp.SUCCESS, kp.FAILED_INSUFFICIENT_SPACE, kp.FAILED_TOO_OLD, kp.FAILED_CANNOT_RESUME, kp.FAILED_HASH_MISMATCH, kp.FAILED_INVALID_URL, kp.FAILED_OUTPUT_STREAM, kp.CANCEL };
    }
    
    private kp(final String s, final int n) {
    }
}
