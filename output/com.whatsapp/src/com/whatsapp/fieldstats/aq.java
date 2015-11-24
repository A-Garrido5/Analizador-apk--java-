// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum aq
{
    public static final aq ABOUT;
    public static final aq ACCOUNT;
    public static final aq BACKUP_CONVERSATIONS;
    public static final aq CHANGE_NUMBER;
    public static final aq CHATS_ALL_ARCHIVE;
    public static final aq CHATS_ALL_CLEAR;
    public static final aq CHATS_ALL_DELETE;
    public static final aq CHAT_ARCHIVE;
    public static final aq CHAT_CLEAR;
    public static final aq CHAT_DELETE;
    public static final aq CONTACTS_VIEWS;
    public static final aq CONTACT_US;
    public static final aq DELETE_ACCOUNT;
    public static final aq FAQ;
    public static final aq FAVORITES_VIEWS;
    public static final aq GROUP_INFO;
    public static final aq NEW_BROADCAST_LIST;
    public static final aq NEW_GROUP;
    public static final aq PROFILE;
    public static final aq SETTINGS;
    public static final aq STATUS_VIEWS;
    @Deprecated
    public static final aq TAF_VIA_CONTACTPICKER_MENU;
    @Deprecated
    public static final aq TAF_VIA_CONTACTSFRAGMENT_MENU;
    @Deprecated
    public static final aq TAF_VIA_CONTACTS_LIST;
    @Deprecated
    public static final aq TAF_VIA_CONTACT_PICKER_LIST;
    @Deprecated
    public static final aq TAF_VIA_EMPTY;
    @Deprecated
    public static final aq TAF_VIA_INVITE_NON_WA_CONTACT;
    @Deprecated
    public static final aq TAF_VIA_SETTINGS;
    public static final aq TELL_A_FRIEND;
    private static final aq[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[29];
        String s = "\u0000\u007f23L\u001d\u007f+/U\u001aj5/N\u0007a8%I\u0000";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0757:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u001a';
                        break;
                    }
                    case 0: {
                        c2 = 'T';
                        break;
                    }
                    case 1: {
                        c2 = '>';
                        break;
                    }
                    case 2: {
                        c2 = 't';
                        break;
                    }
                    case 3: {
                        c2 = 'l';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0000\u007f23L\u001d\u007f+/U\u001aj5/N\u000bn=/Q\u0011l+ S\u0007j";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0017v58I\u000b\u007f8 E\u0010{8)N\u0011";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0017v58E\u0010{8)N\u0011";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "\u0012\u007f\"#H\u001dj1?E\u0002w1;I";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "\u0016\u007f7'O\u0004a7#T\u0002{&?[\u0000w;\"I";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0017v58I\u000b\u007f8 E\u0017r1-H";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0017v58I\u000b\u007f8 E\u0015l7$S\u0002{";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u0017q:8[\u0017j'3L\u001d{#?";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u001a{#3]\u0006q!<";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0000{8 E\u0015a2>S\u0011p0";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u0000\u007f23L\u001d\u007f+/U\u001aj5/N\u0007x&-]\u0019{:8E\u0019{:9";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u0000\u007f23L\u001d\u007f+)W\u0004j-";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u0013l;9J\u000bw:*U";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\u0012\u007f%";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\u0000\u007f23L\u001d\u007f+%T\u0002w )E\u001aq:3M\u0015a7#T\u0000\u007f78";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "\u0004l;*S\u0018{";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "\u0015|;9N";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\u001a{#3X\u0006q5(Y\u0015m 3V\u001dm ";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "\u0015}7#O\u001aj";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "\u0017v58E\u0015l7$S\u0002{";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "\u0017q:8[\u0017j+9I";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "\u0000\u007f23L\u001d\u007f+/U\u001aj5/N\u0004w7'_\u0006a9)T\u0001";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "\u0017v58E\u0017r1-H";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "\u0010{8)N\u0011a5/Y\u001bk:8";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "\u0007j58O\u0007a\"%_\u0003m";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    s = "\u0000\u007f23L\u001d\u007f+?_\u0000j=\"]\u0007";
                    n = 25;
                    n2 = 26;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    array = z2;
                    s = "\u0007{ 8S\u001ay'";
                    n = 26;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "\u0017v5\"]\u0011a:9W\u0016{&";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    break Label_0757;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        NEW_GROUP = new aq(aq.z[9], 0, 1);
        NEW_BROADCAST_LIST = new aq(aq.z[18], 1, 2);
        SETTINGS = new aq(aq.z[27], 2, 3);
        PROFILE = new aq(aq.z[16], 3, 4);
        ACCOUNT = new aq(aq.z[19], 4, 5);
        CHANGE_NUMBER = new aq(aq.z[28], 5, 6);
        GROUP_INFO = new aq(aq.z[13], 6, 7);
        BACKUP_CONVERSATIONS = new aq(aq.z[5], 7, 8);
        ABOUT = new aq(aq.z[17], 8, 9);
        FAQ = new aq(aq.z[14], 9, 10);
        CONTACT_US = new aq(aq.z[21], 10, 11);
        DELETE_ACCOUNT = new aq(aq.z[24], 11, 12);
        CONTACTS_VIEWS = new aq(aq.z[8], 12, 13);
        STATUS_VIEWS = new aq(aq.z[25], 13, 14);
        TAF_VIA_SETTINGS = new aq(aq.z[26], 14, 15);
        TAF_VIA_CONTACTS_LIST = new aq(aq.z[0], 15, 16);
        TAF_VIA_CONTACTPICKER_MENU = new aq(aq.z[22], 16, 17);
        TAF_VIA_EMPTY = new aq(aq.z[12], 17, 18);
        TAF_VIA_INVITE_NON_WA_CONTACT = new aq(aq.z[15], 18, 19);
        TAF_VIA_CONTACT_PICKER_LIST = new aq(aq.z[1], 19, 20);
        TAF_VIA_CONTACTSFRAGMENT_MENU = new aq(aq.z[11], 20, 21);
        TELL_A_FRIEND = new aq(aq.z[10], 21, 22);
        FAVORITES_VIEWS = new aq(aq.z[4], 22, 23);
        CHAT_DELETE = new aq(aq.z[3], 23, 24);
        CHAT_CLEAR = new aq(aq.z[23], 24, 25);
        CHAT_ARCHIVE = new aq(aq.z[20], 25, 26);
        CHATS_ALL_DELETE = new aq(aq.z[2], 26, 27);
        CHATS_ALL_CLEAR = new aq(aq.z[6], 27, 28);
        CHATS_ALL_ARCHIVE = new aq(aq.z[7], 28, 29);
        b = new aq[] { aq.NEW_GROUP, aq.NEW_BROADCAST_LIST, aq.SETTINGS, aq.PROFILE, aq.ACCOUNT, aq.CHANGE_NUMBER, aq.GROUP_INFO, aq.BACKUP_CONVERSATIONS, aq.ABOUT, aq.FAQ, aq.CONTACT_US, aq.DELETE_ACCOUNT, aq.CONTACTS_VIEWS, aq.STATUS_VIEWS, aq.TAF_VIA_SETTINGS, aq.TAF_VIA_CONTACTS_LIST, aq.TAF_VIA_CONTACTPICKER_MENU, aq.TAF_VIA_EMPTY, aq.TAF_VIA_INVITE_NON_WA_CONTACT, aq.TAF_VIA_CONTACT_PICKER_LIST, aq.TAF_VIA_CONTACTSFRAGMENT_MENU, aq.TELL_A_FRIEND, aq.FAVORITES_VIEWS, aq.CHAT_DELETE, aq.CHAT_CLEAR, aq.CHAT_ARCHIVE, aq.CHATS_ALL_DELETE, aq.CHATS_ALL_CLEAR, aq.CHATS_ALL_ARCHIVE };
    }
    
    private aq(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
