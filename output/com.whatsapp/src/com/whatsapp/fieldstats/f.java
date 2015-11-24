// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum f
{
    public static final f ADDRESSBOOK_SYNC;
    public static final f BACKUP;
    public static final f BAN;
    public static final f BBX_BBID_CALL;
    public static final f BBX_HUB_UPDATE_INBOX;
    public static final f BB_OPUS_DECODE;
    public static final f BROADCAST_FANOUT;
    public static final f CALL;
    public static final f CALL_OFFER;
    public static final f CDB_GET;
    public static final f CDB_REGENERATION;
    public static final f CHATD_LAST_SEEN;
    public static final f CHATD_OFFLINE_DELIVERY;
    public static final f CHATD_OFFLINE_FETCH;
    public static final f CHAT_CONNECTION;
    public static final f CONTACT_US_SESSION;
    public static final f CRASH_LOG;
    public static final f DATABASE_ERROR;
    public static final f E2E_MESSAGE_RECV;
    public static final f E2E_MESSAGE_SEND;
    public static final f FS_BUFFER;
    public static final f GROUP_CREATE;
    public static final f GROUP_MUTE;
    public static final f IPHONE_BACKGROUND_FETCH;
    public static final f IPHONE_FAILED_TO_LAUNCH;
    public static final f I_CLOUD_AUTO_BACKUP_ERROR;
    public static final f I_CLOUD_BACKUP;
    public static final f I_CLOUD_RESTORE;
    public static final f LOCATION_PICKER;
    public static final f LOGIN;
    public static final f MEDIA_DOWNLOAD;
    public static final f MEDIA_UPLOAD;
    public static final f MESSAGE_RECEIVE;
    public static final f MESSAGE_SEND;
    public static final f MMD_DOWNLOAD;
    public static final f OFFLINE_MESSAGES;
    public static final f PAY_CHURN;
    public static final f PAY_FREE_EXTENSION;
    public static final f PAY_PAYMENT;
    public static final f PROFILE_PIC_UPLOAD;
    public static final f PTT;
    public static final f PUSH_RECEIVE;
    public static final f RECEIPTS_RECV;
    public static final f RECEIPTS_SEND;
    public static final f REG_CODE;
    public static final f REG_COST_EVENT;
    public static final f REG_EXIST;
    public static final f REG_REGISTER;
    public static final f RESTORE;
    public static final f REVIEWED_BAN;
    public static final f SUPPORT_EMAIL;
    public static final f TEST;
    public static final f UI_ACTION;
    public static final f UI_USAGE;
    public static final f UNBAN;
    public static final f WEBC_PAGE_LOAD;
    public static final f WEBC_RESOURCE_LOAD;
    public static final f WEBD_PAGE_LOAD;
    public static final f WEBD_PAGE_REQUEST;
    public static final f WEBD_TERMINATE;
    public static final f WEBD_UNNAMED_PAGE_LOAD;
    private static final f[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[61];
        String s = "R8\u001b{/Q8\u000br9K<\rz";
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
                        c2 = 'p';
                        break;
                    }
                    case 0: {
                        c2 = '\u0005';
                        break;
                    }
                    case 1: {
                        c2 = '}';
                        break;
                    }
                    case 2: {
                        c2 = 'Y';
                        break;
                    }
                    case 3: {
                        c2 = '?';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "F2\u0017k1F)\u0006j#Z.\u001cl#L2\u0017";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "A<\r~2D.\u001c`5W/\u0016m";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "F5\u0018k4Z1\u0018l$Z.\u001cz>";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "G?\u0001`2G4\u001d`3D1\u0015";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    s = "V(\to?W)\u0006z=D4\u0015";
                    n = 4;
                    n2 = 5;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    array = z2;
                    s = "L\"\u001as?P9\u0006~%Q2\u0006}1F6\fo/@/\u000bp\"";
                    n = 5;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "F5\u0018k/F2\u0017q5F)\u0010p>";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "W8\u001az9U)\n`#@3\u001d";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "W8\u001az9U)\n`\"@>\u000f";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "W8\u001e`3J.\r`5S8\u0017k";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "U<\u0000` D$\u0014z>Q";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "U)\r";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "P4\u0006j#D:\u001c";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "G<\u001at%U";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "L\"\u001as?P9\u0006m5V)\u0016m5";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "F5\u0018k4Z2\u001fy<L3\u001c`4@1\u0010i5W$";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "L-\u0011p>@\"\u001f~9I8\u001d`$J\"\u0015~%K>\u0011";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "B/\u0016j Z>\u000bz1Q8";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "G<\u0017";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "I2\u001a~$L2\u0017` L>\u0012z\"";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "U/\u0016y9I8\u0006o9F\"\fo<J<\u001d";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "G?\u0006p P.\u0006{5F2\u001dz";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "L-\u0011p>@\"\u001b~3N:\u000bp%K9\u0006y5Q>\u0011";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "C.\u0006}%C;\u001cm";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "W8\u001e`\"@:\u0010l$@/";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "J;\u001fs9K8\u0006r5V.\u0018x5V";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "F<\u0015s";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "U(\nw/W8\u001az9S8";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "R8\u001b|/U<\u001ez/I2\u0018{";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "R8\u001b{/P3\u0017~=@9\u0006o1B8\u0006s?D9";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "W8\nk?W8";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "F5\u0018k4Z2\u001fy<L3\u001c`6@)\u001aw";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "R8\u001b{/U<\u001ez/I2\u0018{";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "F9\u001b`\"@:\u001cq5W<\rv?K";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "W8\u000fv5R8\u001d`2D3";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "F9\u001b`7@)";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "I2\u001ev>";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "Q8\nk";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "@O\u001c`=@.\n~7@\"\u000bz3S";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "U<\u0000`6W8\u001c`5])\u001cq#L2\u0017";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "H8\u001dv1Z(\ts?D9";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "H8\nl1B8\u0006m5F8\u0010i5";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "H8\nl1B8\u0006l5K9";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "R8\u001b{/U<\u001ez/W8\bj5V)";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "G/\u0016~4F<\nk/C<\u0017p%Q";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "H8\u001dv1Z9\u0016h>I2\u0018{";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "P3\u001b~>";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "G?\u0001`8P?\u0006j A<\rz/L3\u001bp(";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "L\"\u001as?P9\u0006}1F6\fo";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "W8\u001e`5]4\nk";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "@O\u001c`=@.\n~7@\"\nz>A";
                    n = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "D9\u001dm5V.\u001bp?N\"\nf>F";
                    n = 51;
                    array = z2;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "B/\u0016j Z0\fk5";
                    n = 52;
                    array = z2;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "P4\u0006~3Q4\u0016q";
                    n = 53;
                    array = z2;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    s = "H0\u001d`4J*\u0017s?D9";
                    n = 54;
                    array = z2;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    s = "F<\u0015s/J;\u001fz\"";
                    n = 55;
                    array = z2;
                    continue;
                }
                case 55: {
                    array[n2] = intern;
                    n2 = 57;
                    s = "W8\u001e`3J9\u001c";
                    n = 56;
                    array = z2;
                    continue;
                }
                case 56: {
                    array[n2] = intern;
                    n2 = 58;
                    s = "R8\u001b|/W8\np%W>\u001c`<J<\u001d";
                    n = 57;
                    array = z2;
                    continue;
                }
                case 57: {
                    array[n2] = intern;
                    n2 = 59;
                    s = "F/\u0018l8Z1\u0016x";
                    n = 58;
                    array = z2;
                    continue;
                }
                case 58: {
                    array[n2] = intern;
                    n2 = 60;
                    s = "U<\u0000`3M(\u000bq";
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
        ADDRESSBOOK_SYNC = new f(f.z[52], 0, 31);
        BACKUP = new f(f.z[14], 1, 41);
        BAN = new f(f.z[19], 2, 47);
        BB_OPUS_DECODE = new f(f.z[22], 3, 55);
        BBX_BBID_CALL = new f(f.z[4], 4, 20);
        BBX_HUB_UPDATE_INBOX = new f(f.z[48], 5, 19);
        BROADCAST_FANOUT = new f(f.z[45], 6, 28);
        CALL = new f(f.z[27], 7, 15);
        CALL_OFFER = new f(f.z[56], 8, 16);
        CDB_GET = new f(f.z[36], 9, 27);
        CDB_REGENERATION = new f(f.z[34], 10, 26);
        CHAT_CONNECTION = new f(f.z[7], 11, 40);
        CHATD_LAST_SEEN = new f(f.z[3], 12, 53);
        CHATD_OFFLINE_DELIVERY = new f(f.z[16], 13, 51);
        CHATD_OFFLINE_FETCH = new f(f.z[32], 14, 50);
        CONTACT_US_SESSION = new f(f.z[1], 15, 25);
        CRASH_LOG = new f(f.z[59], 16, 32);
        DATABASE_ERROR = new f(f.z[2], 17, 37);
        E2E_MESSAGE_RECV = new f(f.z[39], 18, 24);
        E2E_MESSAGE_SEND = new f(f.z[51], 19, 23);
        FS_BUFFER = new f(f.z[24], 20, 46);
        GROUP_CREATE = new f(f.z[18], 21, 52);
        GROUP_MUTE = new f(f.z[53], 22, 17);
        I_CLOUD_AUTO_BACKUP_ERROR = new f(f.z[6], 23, 36);
        I_CLOUD_BACKUP = new f(f.z[49], 24, 21);
        I_CLOUD_RESTORE = new f(f.z[15], 25, 35);
        IPHONE_BACKGROUND_FETCH = new f(f.z[23], 26, 38);
        IPHONE_FAILED_TO_LAUNCH = new f(f.z[17], 27, 39);
        LOCATION_PICKER = new f(f.z[20], 28, 43);
        LOGIN = new f(f.z[37], 29, 14);
        MEDIA_DOWNLOAD = new f(f.z[46], 30, 12);
        MEDIA_UPLOAD = new f(f.z[41], 31, 11);
        MESSAGE_RECEIVE = new f(f.z[42], 32, 10);
        MESSAGE_SEND = new f(f.z[43], 33, 9);
        MMD_DOWNLOAD = new f(f.z[55], 34, 8);
        OFFLINE_MESSAGES = new f(f.z[26], 35, 30);
        PAY_CHURN = new f(f.z[60], 36, 6);
        PAY_FREE_EXTENSION = new f(f.z[40], 37, 5);
        PAY_PAYMENT = new f(f.z[11], 38, 4);
        PROFILE_PIC_UPLOAD = new f(f.z[21], 39, 18);
        PTT = new f(f.z[12], 40, 13);
        PUSH_RECEIVE = new f(f.z[28], 41, 44);
        RECEIPTS_RECV = new f(f.z[9], 42, 33);
        RECEIPTS_SEND = new f(f.z[8], 43, 34);
        REG_CODE = new f(f.z[57], 44, 2);
        REG_COST_EVENT = new f(f.z[10], 45, 54);
        REG_EXIST = new f(f.z[50], 46, 1);
        REG_REGISTER = new f(f.z[25], 47, 3);
        RESTORE = new f(f.z[31], 48, 42);
        REVIEWED_BAN = new f(f.z[35], 49, 49);
        SUPPORT_EMAIL = new f(f.z[5], 50, 7);
        TEST = new f(f.z[38], 51, 45);
        UI_ACTION = new f(f.z[54], 52, 22);
        UI_USAGE = new f(f.z[13], 53, 29);
        UNBAN = new f(f.z[47], 54, 48);
        WEBC_PAGE_LOAD = new f(f.z[29], 55, 59);
        WEBC_RESOURCE_LOAD = new f(f.z[58], 56, 60);
        WEBD_PAGE_LOAD = new f(f.z[33], 57, 56);
        WEBD_PAGE_REQUEST = new f(f.z[44], 58, 61);
        WEBD_TERMINATE = new f(f.z[0], 59, 58);
        WEBD_UNNAMED_PAGE_LOAD = new f(f.z[30], 60, 57);
        b = new f[] { f.ADDRESSBOOK_SYNC, f.BACKUP, f.BAN, f.BB_OPUS_DECODE, f.BBX_BBID_CALL, f.BBX_HUB_UPDATE_INBOX, f.BROADCAST_FANOUT, f.CALL, f.CALL_OFFER, f.CDB_GET, f.CDB_REGENERATION, f.CHAT_CONNECTION, f.CHATD_LAST_SEEN, f.CHATD_OFFLINE_DELIVERY, f.CHATD_OFFLINE_FETCH, f.CONTACT_US_SESSION, f.CRASH_LOG, f.DATABASE_ERROR, f.E2E_MESSAGE_RECV, f.E2E_MESSAGE_SEND, f.FS_BUFFER, f.GROUP_CREATE, f.GROUP_MUTE, f.I_CLOUD_AUTO_BACKUP_ERROR, f.I_CLOUD_BACKUP, f.I_CLOUD_RESTORE, f.IPHONE_BACKGROUND_FETCH, f.IPHONE_FAILED_TO_LAUNCH, f.LOCATION_PICKER, f.LOGIN, f.MEDIA_DOWNLOAD, f.MEDIA_UPLOAD, f.MESSAGE_RECEIVE, f.MESSAGE_SEND, f.MMD_DOWNLOAD, f.OFFLINE_MESSAGES, f.PAY_CHURN, f.PAY_FREE_EXTENSION, f.PAY_PAYMENT, f.PROFILE_PIC_UPLOAD, f.PTT, f.PUSH_RECEIVE, f.RECEIPTS_RECV, f.RECEIPTS_SEND, f.REG_CODE, f.REG_COST_EVENT, f.REG_EXIST, f.REG_REGISTER, f.RESTORE, f.REVIEWED_BAN, f.SUPPORT_EMAIL, f.TEST, f.UI_ACTION, f.UI_USAGE, f.UNBAN, f.WEBC_PAGE_LOAD, f.WEBC_RESOURCE_LOAD, f.WEBD_PAGE_LOAD, f.WEBD_PAGE_REQUEST, f.WEBD_TERMINATE, f.WEBD_UNNAMED_PAGE_LOAD };
    }
    
    private f(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
