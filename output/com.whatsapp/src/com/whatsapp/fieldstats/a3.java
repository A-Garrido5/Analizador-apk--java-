// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum a3
{
    public static final a3 ADDRESSBOOK_SYNC;
    public static final a3 BACKUP;
    public static final a3 BAN;
    public static final a3 BBX_BBID_CALL;
    public static final a3 BBX_HUB_UPDATE_INBOX;
    public static final a3 BB_OPUS_DECODE;
    public static final a3 BROADCAST_FANOUT;
    public static final a3 CALL;
    public static final a3 CALL_OFFER;
    public static final a3 CDB_GET;
    public static final a3 CDB_REGENERATION;
    public static final a3 CHATD_LAST_SEEN;
    public static final a3 CHATD_OFFLINE_DELIVERY;
    public static final a3 CHATD_OFFLINE_FETCH;
    public static final a3 CHAT_CONNECTION;
    public static final a3 CONTACT_US_SESSION;
    public static final a3 CRASH_LOG;
    public static final a3 DATABASE_ERROR;
    public static final a3 E2E_MESSAGE_RECV;
    public static final a3 E2E_MESSAGE_SEND;
    public static final a3 FS_BUFFER;
    public static final a3 GROUP_CREATE;
    public static final a3 GROUP_MUTE;
    public static final a3 IPHONE_BACKGROUND_FETCH;
    public static final a3 IPHONE_FAILED_TO_LAUNCH;
    public static final a3 I_CLOUD_AUTO_BACKUP_ERROR;
    public static final a3 I_CLOUD_BACKUP;
    public static final a3 I_CLOUD_RESTORE;
    public static final a3 LOCATION_PICKER;
    public static final a3 LOGIN;
    public static final a3 MEDIA_DOWNLOAD;
    public static final a3 MEDIA_UPLOAD;
    public static final a3 MESSAGE_RECEIVE;
    public static final a3 MESSAGE_SEND;
    public static final a3 MMD_DOWNLOAD;
    public static final a3 OFFLINE_MESSAGES;
    public static final a3 PAY_CHURN;
    public static final a3 PAY_FREE_EXTENSION;
    public static final a3 PAY_PAYMENT;
    public static final a3 PROFILE_PIC_UPLOAD;
    public static final a3 PTT;
    public static final a3 PUSH_RECEIVE;
    public static final a3 RECEIPTS_RECV;
    public static final a3 RECEIPTS_SEND;
    public static final a3 REG_CODE;
    public static final a3 REG_COST_EVENT;
    public static final a3 REG_EXIST;
    public static final a3 REG_REGISTER;
    public static final a3 RESTORE;
    public static final a3 REVIEWED_BAN;
    public static final a3 SUPPORT_EMAIL;
    public static final a3 TEST;
    public static final a3 UI_ACTION;
    public static final a3 UI_USAGE;
    public static final a3 UNBAN;
    public static final a3 WEBC_PAGE_LOAD;
    public static final a3 WEBC_RESOURCE_LOAD;
    public static final a3 WEBD_PAGE_LOAD;
    public static final a3 WEBD_PAGE_REQUEST;
    public static final a3 WEBD_TERMINATE;
    public static final a3 WEBD_UNNAMED_PAGE_LOAD;
    private static final a3[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[61];
        String s = "5\u000e\u0007j\u000b\"\u001f\u0007a\u001e4\u0003\u001c`";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1557:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '[';
                        break;
                    }
                    case 0: {
                        c2 = 'w';
                        break;
                    }
                    case 1: {
                        c2 = 'L';
                        break;
                    }
                    case 2: {
                        c2 = 'X';
                        break;
                    }
                    case 3: {
                        c2 = '%';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "5\u000e\u0000z\u00195\u0005\u001cz\u00186\u0000\u0014";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "'\u001e\u0017c\u0012;\t\u0007u\u00124\u0013\ru\u00178\r\u001c";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = " \t\u001aa\u0004'\r\u001f`\u0004%\t\tp\u001e$\u0018";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "5\r\u001bn\u000e'";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "6\b\u001cw\u001e$\u001f\u001aj\u0014<\u0013\u000b|\u00154";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "1\u001f\u0007g\u000e1\n\u001dw";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = ":\t\u000bv\u001a0\t\u0007v\u001e9\b";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = ">\u001c\u0010j\u00152\u0013\u001ad\u0018<\u000b\nj\u000e9\b\u0007c\u001e#\u000f\u0010";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\"\u0005\u0007d\u0018#\u0005\u0017k";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = " \t\u001aa\u0004\"\u0002\u0016d\u00162\b\u0007u\u001a0\t\u0007i\u00146\b";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = ">\u0013\u001bi\u0014\"\b\u0007g\u001a4\u0007\ru";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "4\u0003\u0016q\u001a4\u0018\u0007p\b(\u001f\u001dv\b>\u0003\u0016";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "'\u0019\u000bm\u0004%\t\u001b`\u0012!\t";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "%\t\u001fz\u00188\b\u001d";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "%\t\u000el\u001e \t\u001cz\u00196\u0002";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = ":\t\u001cl\u001a(\b\u0017r\u0015;\u0003\u0019a";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = ":\t\u000bv\u001a0\t\u0007w\u001e4\t\u0011s\u001e";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "%\t\u000bq\u0014%\t";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "4\u001e\u0019v\u0013(\u0000\u0017b";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "$\u0019\bu\u0014%\u0018\u0007`\u00166\u0005\u0014";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "%\t\u001fz\u001e/\u0005\u000bq";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = " \t\u001af\u0004'\r\u001f`\u0004;\u0003\u0019a";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = ";\u0003\u001bd\u000f>\u0003\u0016z\u000b>\u000f\u0013`\t";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "%\t\u001b`\u0012'\u0018\u000bz\b2\u0002\u001c";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = ":\t\u001cl\u001a(\u0019\bi\u00146\b";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "5\u001e\u0017d\u001f4\r\u000bq\u00041\r\u0016j\u000e#";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "0\u001e\u0017p\u000b(\u000f\n`\u001a#\t";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "4\b\u001az\u001c2\u0018";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "4\u0004\u0019q\u001f(\u0003\u001ec\u0017>\u0002\u001dz\u001d2\u0018\u001bm";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "5\u000e\u0000z\u0013\"\u000e\u0007p\u000b3\r\f`\u0004>\u0002\u001aj\u0003";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "'\u0018\f";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "8\n\u001ei\u00129\t\u0007h\u001e$\u001f\u0019b\u001e$";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "'\r\u0001z\u000b6\u0015\u0015`\u0015#";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "%\t\u001b`\u0012'\u0018\u000bz\t2\u000f\u000e";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = ">\u0013\u001bi\u0014\"\b\u0007d\u000e#\u0003\u0007g\u001a4\u0007\ru\u00042\u001e\nj\t";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = " \t\u001aa\u0004#\t\nh\u00129\r\f`";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    s = " \t\u001af\u0004%\t\u000bj\u000e%\u000f\u001dz\u00178\r\u001c";
                    n = 36;
                    n2 = 37;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    array = z2;
                    s = ">\u0013\u001bi\u0014\"\b\u0007w\u001e$\u0018\u0017w\u001e";
                    n = 37;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = ":\u0001\u001cz\u001f8\u001b\u0016i\u00146\b";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "\"\u0005\u0007p\b6\u000b\u001d";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = " \t\u001aa\u0004'\r\u001f`\u0004;\u0003\u0019a";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "4\b\u001az\t2\u000b\u001dk\u001e%\r\fl\u00149";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "4\r\u0014i";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "2~\u001dz\u00162\u001f\u000bd\u001c2\u0013\n`\u0018!";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "3\r\fd\u00196\u001f\u001dz\u001e%\u001e\u0017w";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "%\t\u001fz\t2\u000b\u0011v\u000f2\u001e";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = ";\u0003\u001fl\u0015";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "4\u0004\u0019q\u001f(\u0000\u0019v\u000f(\u001f\u001d`\u0015";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "%\t\u001fz\u00188\u001f\fz\u001e!\t\u0016q";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = ">\u001c\u0010j\u00152\u0013\u001ed\u0012;\t\u001cz\u000f8\u0013\u0014d\u000e9\u000f\u0010";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "0\u001e\u0017p\u000b(\u0001\rq\u001e";
                    n = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "#\t\u000bq";
                    n = 51;
                    array = z2;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "'\r\u0001z\u0018?\u0019\nk";
                    n = 52;
                    array = z2;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "4\u0004\u0019q\u00044\u0003\u0016k\u001e4\u0018\u0011j\u0015";
                    n = 53;
                    array = z2;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    s = "2~\u001dz\u00162\u001f\u000bd\u001c2\u0013\u000b`\u00153";
                    n = 54;
                    array = z2;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    s = "5\r\u0016";
                    n = 55;
                    array = z2;
                    continue;
                }
                case 55: {
                    array[n2] = intern;
                    n2 = 57;
                    s = "4\u0004\u0019q\u001f(\u0003\u001ec\u0017>\u0002\u001dz\u001f2\u0000\u0011s\u001e%\u0015";
                    n = 56;
                    array = z2;
                    continue;
                }
                case 56: {
                    array[n2] = intern;
                    n2 = 58;
                    s = "\"\u0002\u001ad\u0015";
                    n = 57;
                    array = z2;
                    continue;
                }
                case 57: {
                    array[n2] = intern;
                    n2 = 59;
                    s = "4\r\u0014i\u00048\n\u001e`\t";
                    n = 58;
                    array = z2;
                    continue;
                }
                case 58: {
                    array[n2] = intern;
                    n2 = 60;
                    s = "'\r\u0001z\u001d%\t\u001dz\u001e/\u0018\u001dk\b>\u0003\u0016";
                    n = 59;
                    array = z2;
                    continue;
                }
                case 59: {
                    break Label_1557;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        ADDRESSBOOK_SYNC = new a3(a3.z[5], 0, 31);
        BACKUP = new a3(a3.z[4], 1, 41);
        BAN = new a3(a3.z[56], 2, 47);
        BB_OPUS_DECODE = new a3(a3.z[0], 3, 55);
        BBX_BBID_CALL = new a3(a3.z[1], 4, 20);
        BBX_HUB_UPDATE_INBOX = new a3(a3.z[30], 5, 19);
        BROADCAST_FANOUT = new a3(a3.z[26], 6, 28);
        CALL = new a3(a3.z[43], 7, 15);
        CALL_OFFER = new a3(a3.z[59], 8, 16);
        CDB_GET = new a3(a3.z[28], 9, 27);
        CDB_REGENERATION = new a3(a3.z[42], 10, 26);
        CHAT_CONNECTION = new a3(a3.z[54], 11, 40);
        CHATD_LAST_SEEN = new a3(a3.z[48], 12, 53);
        CHATD_OFFLINE_DELIVERY = new a3(a3.z[57], 13, 51);
        CHATD_OFFLINE_FETCH = new a3(a3.z[29], 14, 50);
        CONTACT_US_SESSION = new a3(a3.z[12], 15, 25);
        CRASH_LOG = new a3(a3.z[19], 16, 32);
        DATABASE_ERROR = new a3(a3.z[45], 17, 37);
        E2E_MESSAGE_RECV = new a3(a3.z[44], 18, 24);
        E2E_MESSAGE_SEND = new a3(a3.z[55], 19, 23);
        FS_BUFFER = new a3(a3.z[6], 20, 46);
        GROUP_CREATE = new a3(a3.z[27], 21, 52);
        GROUP_MUTE = new a3(a3.z[51], 22, 17);
        I_CLOUD_AUTO_BACKUP_ERROR = new a3(a3.z[35], 23, 36);
        I_CLOUD_BACKUP = new a3(a3.z[11], 24, 21);
        I_CLOUD_RESTORE = new a3(a3.z[38], 25, 35);
        IPHONE_BACKGROUND_FETCH = new a3(a3.z[8], 26, 38);
        IPHONE_FAILED_TO_LAUNCH = new a3(a3.z[50], 27, 39);
        LOCATION_PICKER = new a3(a3.z[23], 28, 43);
        LOGIN = new a3(a3.z[47], 29, 14);
        MEDIA_DOWNLOAD = new a3(a3.z[16], 30, 12);
        MEDIA_UPLOAD = new a3(a3.z[25], 31, 11);
        MESSAGE_RECEIVE = new a3(a3.z[17], 32, 10);
        MESSAGE_SEND = new a3(a3.z[7], 33, 9);
        MMD_DOWNLOAD = new a3(a3.z[39], 34, 8);
        OFFLINE_MESSAGES = new a3(a3.z[32], 35, 30);
        PAY_CHURN = new a3(a3.z[53], 36, 6);
        PAY_FREE_EXTENSION = new a3(a3.z[60], 37, 5);
        PAY_PAYMENT = new a3(a3.z[33], 38, 4);
        PROFILE_PIC_UPLOAD = new a3(a3.z[2], 39, 18);
        PTT = new a3(a3.z[31], 40, 13);
        PUSH_RECEIVE = new a3(a3.z[13], 41, 44);
        RECEIPTS_RECV = new a3(a3.z[34], 42, 33);
        RECEIPTS_SEND = new a3(a3.z[24], 43, 34);
        REG_CODE = new a3(a3.z[14], 44, 2);
        REG_COST_EVENT = new a3(a3.z[49], 45, 54);
        REG_EXIST = new a3(a3.z[21], 46, 1);
        REG_REGISTER = new a3(a3.z[46], 47, 3);
        RESTORE = new a3(a3.z[18], 48, 42);
        REVIEWED_BAN = new a3(a3.z[15], 49, 49);
        SUPPORT_EMAIL = new a3(a3.z[20], 50, 7);
        TEST = new a3(a3.z[52], 51, 45);
        UI_ACTION = new a3(a3.z[9], 52, 22);
        UI_USAGE = new a3(a3.z[40], 53, 29);
        UNBAN = new a3(a3.z[58], 54, 48);
        WEBC_PAGE_LOAD = new a3(a3.z[22], 55, 59);
        WEBC_RESOURCE_LOAD = new a3(a3.z[37], 56, 60);
        WEBD_PAGE_LOAD = new a3(a3.z[41], 57, 56);
        WEBD_PAGE_REQUEST = new a3(a3.z[3], 58, 61);
        WEBD_TERMINATE = new a3(a3.z[36], 59, 58);
        WEBD_UNNAMED_PAGE_LOAD = new a3(a3.z[10], 60, 57);
        b = new a3[] { a3.ADDRESSBOOK_SYNC, a3.BACKUP, a3.BAN, a3.BB_OPUS_DECODE, a3.BBX_BBID_CALL, a3.BBX_HUB_UPDATE_INBOX, a3.BROADCAST_FANOUT, a3.CALL, a3.CALL_OFFER, a3.CDB_GET, a3.CDB_REGENERATION, a3.CHAT_CONNECTION, a3.CHATD_LAST_SEEN, a3.CHATD_OFFLINE_DELIVERY, a3.CHATD_OFFLINE_FETCH, a3.CONTACT_US_SESSION, a3.CRASH_LOG, a3.DATABASE_ERROR, a3.E2E_MESSAGE_RECV, a3.E2E_MESSAGE_SEND, a3.FS_BUFFER, a3.GROUP_CREATE, a3.GROUP_MUTE, a3.I_CLOUD_AUTO_BACKUP_ERROR, a3.I_CLOUD_BACKUP, a3.I_CLOUD_RESTORE, a3.IPHONE_BACKGROUND_FETCH, a3.IPHONE_FAILED_TO_LAUNCH, a3.LOCATION_PICKER, a3.LOGIN, a3.MEDIA_DOWNLOAD, a3.MEDIA_UPLOAD, a3.MESSAGE_RECEIVE, a3.MESSAGE_SEND, a3.MMD_DOWNLOAD, a3.OFFLINE_MESSAGES, a3.PAY_CHURN, a3.PAY_FREE_EXTENSION, a3.PAY_PAYMENT, a3.PROFILE_PIC_UPLOAD, a3.PTT, a3.PUSH_RECEIVE, a3.RECEIPTS_RECV, a3.RECEIPTS_SEND, a3.REG_CODE, a3.REG_COST_EVENT, a3.REG_EXIST, a3.REG_REGISTER, a3.RESTORE, a3.REVIEWED_BAN, a3.SUPPORT_EMAIL, a3.TEST, a3.UI_ACTION, a3.UI_USAGE, a3.UNBAN, a3.WEBC_PAGE_LOAD, a3.WEBC_RESOURCE_LOAD, a3.WEBD_PAGE_LOAD, a3.WEBD_PAGE_REQUEST, a3.WEBD_TERMINATE, a3.WEBD_UNNAMED_PAGE_LOAD };
    }
    
    private a3(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
