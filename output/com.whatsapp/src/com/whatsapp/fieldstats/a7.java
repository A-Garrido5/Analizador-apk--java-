// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum a7
{
    public static final a7 APP_RESUMED;
    public static final a7 CHAT_DB_COPY_ERROR;
    public static final a7 CORRUPTED;
    public static final a7 LOW_BATTERY;
    public static final a7 NOT_CONNECTED;
    public static final a7 NOT_ENOUGH_SPACE;
    public static final a7 NOT_REGISTERED;
    public static final a7 NOT_SIGNED_IN;
    public static final a7 NO_CHAT_STORE;
    public static final a7 OUT_OF_TIME;
    public static final a7 TOO_LARGE;
    public static final a7 TOO_OLD;
    public static final a7 UPLOAD;
    private static final a7[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[13];
        String s = "{P{#k|Ze4{hAe2fjWh";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0357:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '4';
                        break;
                    }
                    case 0: {
                        c2 = '8';
                        break;
                    }
                    case 1: {
                        c2 = '\u0018';
                        break;
                    }
                    case 2: {
                        c2 = ':';
                        break;
                    }
                    case 3: {
                        c2 = 'w';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "{Wh%ahL\u007f3";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "lWu({t\\";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "vWn(qvWo0|gKj6w}";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "lWu(xyJ}2";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "wMn({~Gn>y}";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "mHv8u|";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "vWn(wwVt2wl]~";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "vWn(f}_s$`}J\u007f3";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "vWe4|yLe$`wJ\u007f";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "yHj(f}Ko:q|";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "vWn(gq_t2pgQt";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "tWm(vyLn2fa";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    break Label_0357;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        NOT_REGISTERED = new a7(a7.z[8], 0, 1);
        NOT_SIGNED_IN = new a7(a7.z[11], 1, 2);
        NO_CHAT_STORE = new a7(a7.z[9], 2, 3);
        CORRUPTED = new a7(a7.z[1], 3, 4);
        NOT_ENOUGH_SPACE = new a7(a7.z[3], 4, 5);
        TOO_LARGE = new a7(a7.z[4], 5, 6);
        UPLOAD = new a7(a7.z[6], 6, 7);
        TOO_OLD = new a7(a7.z[2], 7, 8);
        LOW_BATTERY = new a7(a7.z[12], 8, 9);
        OUT_OF_TIME = new a7(a7.z[5], 9, 10);
        APP_RESUMED = new a7(a7.z[10], 10, 11);
        NOT_CONNECTED = new a7(a7.z[7], 11, 12);
        CHAT_DB_COPY_ERROR = new a7(a7.z[0], 12, 13);
        b = new a7[] { a7.NOT_REGISTERED, a7.NOT_SIGNED_IN, a7.NO_CHAT_STORE, a7.CORRUPTED, a7.NOT_ENOUGH_SPACE, a7.TOO_LARGE, a7.UPLOAD, a7.TOO_OLD, a7.LOW_BATTERY, a7.OUT_OF_TIME, a7.APP_RESUMED, a7.NOT_CONNECTED, a7.CHAT_DB_COPY_ERROR };
    }
    
    private a7(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
