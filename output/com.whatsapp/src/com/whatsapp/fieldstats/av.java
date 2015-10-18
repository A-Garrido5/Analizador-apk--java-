// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum av
{
    public static final av CHAT_DB_COPY_ERROR;
    public static final av CORRUPTED;
    public static final av ERROR_FAILED;
    public static final av LOW_BATTERY;
    public static final av MISSING_CHAT_STORE;
    public static final av NOT_CONNECTED;
    public static final av NOT_ENOUGH_SPACE;
    public static final av NOT_REGISTERED;
    public static final av NOT_SIGNED_IN;
    public static final av SUCCESS;
    public static final av TIME_EXPIRED;
    public static final av TOO_LARGE;
    public static final av UPLOAD;
    public static final av USER_STOPPED;
    private static final av[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[14];
        String s = "\fG;\u0011v\fA";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0382:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '3';
                        break;
                    }
                    case 0: {
                        c2 = '_';
                        break;
                    }
                    case 1: {
                        c2 = '\u0012';
                        break;
                    }
                    case 2: {
                        c2 = 'x';
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
                    s = "\u001cZ9\u0006l\u001bP'\u0011|\u000fK'\u0017a\r]*";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u001c]*\u0000f\u000fF=\u0016";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0011],\rv\u0011]-\u0015{\u0000A(\u0013p\u001a";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u0011],\r`\u0016U6\u0017w\u0000[6";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\nB4\u001dr\u001b";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u001a@*\u001da\u0000T9\u001b\u007f\u001aV";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0012[+\u0001z\u0011U'\u0011{\u001eF'\u0001g\u0010@=";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\nA=\u0000l\fF7\u0002c\u001aV";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u000b[5\u0017l\u001aJ(\u001ba\u001aV";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0011],\rp\u0010\\6\u0017p\u000bW<";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u0013]/\rq\u001eF,\u0017a\u0006";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u000b]7\r\u007f\u001e@?\u0017";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u0011],\ra\u001aU1\u0001g\u001a@=\u0016";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    break Label_0382;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        SUCCESS = new av(av.z[0], 0, 1);
        USER_STOPPED = new av(av.z[8], 1, 2);
        TIME_EXPIRED = new av(av.z[9], 2, 3);
        ERROR_FAILED = new av(av.z[6], 3, 4);
        MISSING_CHAT_STORE = new av(av.z[7], 4, 5);
        CORRUPTED = new av(av.z[2], 5, 6);
        NOT_REGISTERED = new av(av.z[13], 6, 7);
        NOT_ENOUGH_SPACE = new av(av.z[3], 7, 8);
        TOO_LARGE = new av(av.z[12], 8, 9);
        NOT_CONNECTED = new av(av.z[10], 9, 10);
        LOW_BATTERY = new av(av.z[11], 10, 11);
        NOT_SIGNED_IN = new av(av.z[4], 11, 12);
        UPLOAD = new av(av.z[5], 12, 13);
        CHAT_DB_COPY_ERROR = new av(av.z[1], 13, 14);
        a = new av[] { av.SUCCESS, av.USER_STOPPED, av.TIME_EXPIRED, av.ERROR_FAILED, av.MISSING_CHAT_STORE, av.CORRUPTED, av.NOT_REGISTERED, av.NOT_ENOUGH_SPACE, av.TOO_LARGE, av.NOT_CONNECTED, av.LOW_BATTERY, av.NOT_SIGNED_IN, av.UPLOAD, av.CHAT_DB_COPY_ERROR };
    }
    
    private av(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
