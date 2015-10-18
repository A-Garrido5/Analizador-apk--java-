// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum bq
{
    public static final bq ANDROID_BROADCAST_DETAILS;
    public static final bq ANDROID_CONTACTS_APPLICATION;
    public static final bq ANDROID_LIST_CHAT_INFO;
    public static final bq CALLS_TAB_INCOMING;
    public static final bq CALLS_TAB_MISSED;
    public static final bq CALLS_TAB_OUTGOING;
    public static final bq CALL_INFO;
    public static final bq CONTACT_INFO;
    public static final bq CONTACT_VCARD;
    public static final bq CONVERSATION;
    public static final bq GROUP_CHAT_INFO;
    public static final bq GROUP_CHAT_RECENT_LOCATION;
    public static final bq NOTIFICATION_MISSED;
    public static final bq QUICK_CONTACT_INFO;
    public static final bq SELECT_CONTACT;
    private static final bq[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[15];
        String s = "\u001eq>x\u001a\u0016{%i\u001a\u0011k;i\u0001\f`;z\u0005\u0013v9k\u0001\u0016p4";
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
                        c2 = 'U';
                        break;
                    }
                    case 0: {
                        c2 = '_';
                        break;
                    }
                    case 1: {
                        c2 = '?';
                        break;
                    }
                    case 2: {
                        c2 = 'z';
                        break;
                    }
                    case 3: {
                        c2 = '*';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0011p.c\u0013\u0016|;~\u001c\u0010q%g\u001c\fl?n";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u000ej3i\u001e\u0000|5d\u0001\u001e|.u\u001c\u0011y5";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u001cp4~\u0014\u001ck%|\u0016\u001em>";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u001cp4|\u0010\rl;~\u001c\u0010q";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u001c~6f\u0006\u0000k;h\n\u0016q9e\u0018\u0016q=";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u001c~6f\n\u0016q<e";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u001cp4~\u0014\u001ck%c\u001b\u0019p";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u001eq>x\u001a\u0016{%h\u0007\u0010~>i\u0014\fk%n\u0010\u000b~3f\u0006";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\fz6o\u0016\u000b`9e\u001b\u000b~9~";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0018m5\u007f\u0005\u0000|2k\u0001\u0000m?i\u0010\u0011k%f\u001a\u001c~.c\u001a\u0011";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u0018m5\u007f\u0005\u0000|2k\u0001\u0000v4l\u001a";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u001c~6f\u0006\u0000k;h\n\u0012v)y\u0010\u001b";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u001eq>x\u001a\u0016{%f\u001c\fk%i\u001d\u001ek%c\u001b\u0019p";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\u001c~6f\u0006\u0000k;h\n\u0010j.m\u001a\u0016q=";
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
        CALLS_TAB_MISSED = new bq(bq.z[12], 0, 1);
        CALLS_TAB_OUTGOING = new bq(bq.z[14], 1, 2);
        SELECT_CONTACT = new bq(bq.z[9], 2, 3);
        CALL_INFO = new bq(bq.z[6], 3, 4);
        NOTIFICATION_MISSED = new bq(bq.z[1], 4, 5);
        CONTACT_INFO = new bq(bq.z[7], 5, 6);
        QUICK_CONTACT_INFO = new bq(bq.z[2], 6, 7);
        CONVERSATION = new bq(bq.z[4], 7, 8);
        CALLS_TAB_INCOMING = new bq(bq.z[5], 8, 9);
        GROUP_CHAT_INFO = new bq(bq.z[11], 9, 10);
        GROUP_CHAT_RECENT_LOCATION = new bq(bq.z[10], 10, 11);
        ANDROID_BROADCAST_DETAILS = new bq(bq.z[8], 11, 12);
        ANDROID_LIST_CHAT_INFO = new bq(bq.z[13], 12, 13);
        ANDROID_CONTACTS_APPLICATION = new bq(bq.z[0], 13, 14);
        CONTACT_VCARD = new bq(bq.z[3], 14, 15);
        b = new bq[] { bq.CALLS_TAB_MISSED, bq.CALLS_TAB_OUTGOING, bq.SELECT_CONTACT, bq.CALL_INFO, bq.NOTIFICATION_MISSED, bq.CONTACT_INFO, bq.QUICK_CONTACT_INFO, bq.CONVERSATION, bq.CALLS_TAB_INCOMING, bq.GROUP_CHAT_INFO, bq.GROUP_CHAT_RECENT_LOCATION, bq.ANDROID_BROADCAST_DETAILS, bq.ANDROID_LIST_CHAT_INFO, bq.ANDROID_CONTACTS_APPLICATION, bq.CONTACT_VCARD };
    }
    
    private bq(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
