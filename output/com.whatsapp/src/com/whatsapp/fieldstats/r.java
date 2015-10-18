// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum r
{
    public static final r ACCEPTED_BUT_NOT_CONNECTED;
    public static final r BUSY;
    public static final r CALL_CANCELED_AIRPLANE_MODE_ON;
    public static final r CALL_CANCELED_CELLULAR_IN_PROGRESS;
    public static final r CALL_CANCELED_NO_NETWORK;
    public static final r CALL_OFFER_ACK_NOT_RECEIVED;
    public static final r CONNECTED;
    public static final r MISSED;
    public static final r MISSED_NO_RECEIPT;
    public static final r REJECTED_BY_SERVER;
    public static final r REJECTED_BY_USER;
    public static final r SERVER_NACK;
    public static final r SETUP_ERROR;
    private static final r[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[13];
        String s = "T4F ";
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
                        c2 = 'C';
                        break;
                    }
                    case 0: {
                        c2 = '\u0016';
                        break;
                    }
                    case 1: {
                        c2 = 'a';
                        break;
                    }
                    case 2: {
                        c2 = '\u0015';
                        break;
                    }
                    case 3: {
                        c2 = 'y';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "E$A,\u0013I$G+\fD";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "D$_<\u0000B$Q&\u0001O>@*\u0006D";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "U Y5\u001cU [:\u0006Z$Q&\u0002_3E5\u0002X$J4\fR$J6\r";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "U Y5\u001cU [:\u0006Z$Q&\rY>[<\u0017A.G2";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "U Y5\u001cU [:\u0006Z$Q&\u0000S-Y,\u000fW3J0\rI1G6\u0004D$F*";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "E$G/\u0006D>[8\u0000]";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "U.[7\u0006U5P=";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "[(F*\u0006R>[6\u001cD$V<\nF5";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "U Y5\u001cY'S<\u0011I V2\u001cX.A&\u0011S\"P0\u0015S%";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "W\"V<\u0013B$Q&\u0001C5J7\fB>V6\rX$V-\u0006R";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "D$_<\u0000B$Q&\u0001O>F<\u0011@$G";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "[(F*\u0006R";
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
        CONNECTED = new r(r.z[7], 0, 1);
        REJECTED_BY_USER = new r(r.z[2], 1, 2);
        REJECTED_BY_SERVER = new r(r.z[11], 2, 3);
        MISSED = new r(r.z[12], 3, 4);
        BUSY = new r(r.z[0], 4, 5);
        SETUP_ERROR = new r(r.z[1], 5, 6);
        SERVER_NACK = new r(r.z[6], 6, 7);
        CALL_OFFER_ACK_NOT_RECEIVED = new r(r.z[9], 7, 8);
        MISSED_NO_RECEIPT = new r(r.z[8], 8, 9);
        ACCEPTED_BUT_NOT_CONNECTED = new r(r.z[10], 9, 10);
        CALL_CANCELED_CELLULAR_IN_PROGRESS = new r(r.z[5], 10, 11);
        CALL_CANCELED_AIRPLANE_MODE_ON = new r(r.z[3], 11, 12);
        CALL_CANCELED_NO_NETWORK = new r(r.z[4], 12, 13);
        a = new r[] { r.CONNECTED, r.REJECTED_BY_USER, r.REJECTED_BY_SERVER, r.MISSED, r.BUSY, r.SETUP_ERROR, r.SERVER_NACK, r.CALL_OFFER_ACK_NOT_RECEIVED, r.MISSED_NO_RECEIPT, r.ACCEPTED_BUT_NOT_CONNECTED, r.CALL_CANCELED_CELLULAR_IN_PROGRESS, r.CALL_CANCELED_AIRPLANE_MODE_ON, r.CALL_CANCELED_NO_NETWORK };
    }
    
    private r(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
