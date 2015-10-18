// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum h
{
    public static final h AUDIO_INIT_ERROR;
    public static final h CALL_ACCEPT_FAILED;
    public static final h CANNOT_INITIALIZE_AUDIO_RECORD_OBJECT;
    public static final h HANDLE_ACCEPT_FAILED;
    public static final h HANDLE_OFFER_FAILED;
    public static final h INCOMPATIBLE_SRTP_KEY_EXCHANGE;
    public static final h INIT_MEDIA_STREAM_FAILED;
    public static final h P2P_TRANSPORT_CREATE_FAILED;
    public static final h P2P_TRANSPORT_MEDIA_CREATE_FAILED;
    public static final h P2P_TRANSPORT_START_FAILED;
    public static final h PEER_RELAY_BIND_FAILED;
    public static final h RELAY_BIND_FAILED;
    public static final h SOUND_PORT_CREATE_FAILED;
    public static final h SRTP_KEY_GENERATION_ERROR;
    public static final h START_MEDIA_STREAM_FAILED;
    public static final h UNKNOWN;
    public static final h UNSUPPORTED_AUDIO_CAPS;
    private static final h[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[17];
        String s = "yi\rl-tw\fn'tz\u001cn xd\u0006l";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0457:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'a';
                        break;
                    }
                    case 0: {
                        c2 = '1';
                        break;
                    }
                    case 1: {
                        c2 = '(';
                        break;
                    }
                    case 2: {
                        c2 = 'C';
                        break;
                    }
                    case 3: {
                        c2 = '(';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "xf\u0000g,ai\u0017a#}m\u001c{3ex\u001cc$hw\u0006p\"yi\ro$";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "am\u0006z>cm\u000fi8nj\nf%nn\u0002a-tl";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "ri\u000fd>pk\u0000m1ew\u0005i(}m\u0007";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "p}\u0007a.na\ra5nm\u0011z.c";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "yi\rl-tw\u0002k\"tx\u0017w'pa\u000fm%";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "a\u001a\u0013w5ci\r{1~z\u0017w\"cm\u0002|$nn\u0002a-tl";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "ri\rf.ew\nf(ea\u0002d(km\u001ci4ua\fw3tk\fz%ng\u0001b$r|";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "df\u0010}1ag\u0011|$uw\u0002}%xg\u001ck a{";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "a\u001a\u0013w5ci\r{1~z\u0017w2ei\u0011|>wi\nd$u";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "cm\u000fi8nj\nf%nn\u0002a-tl";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "bg\u0016f%nx\fz5nk\u0011m em\u001cn xd\u0006l";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "xf\n|>|m\u0007a n{\u0017z$pe\u001cn xd\u0006l";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "a\u001a\u0013w5ci\r{1~z\u0017w,tl\ni>rz\u0006i5tw\u0005i(}m\u0007";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "bz\u0017x>zm\u001aw&tf\u0006z ea\ff>tz\u0011g3";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "b|\u0002z5ne\u0006l(pw\u0010|3ti\u000ew'pa\u000fm%";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "df\bf.ff";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    break Label_0457;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        UNKNOWN = new h(h.z[16], 0, 1);
        CALL_ACCEPT_FAILED = new h(h.z[3], 1, 2);
        INIT_MEDIA_STREAM_FAILED = new h(h.z[12], 2, 3);
        START_MEDIA_STREAM_FAILED = new h(h.z[15], 3, 4);
        AUDIO_INIT_ERROR = new h(h.z[4], 4, 5);
        HANDLE_OFFER_FAILED = new h(h.z[0], 5, 6);
        HANDLE_ACCEPT_FAILED = new h(h.z[5], 6, 7);
        SOUND_PORT_CREATE_FAILED = new h(h.z[11], 7, 8);
        P2P_TRANSPORT_CREATE_FAILED = new h(h.z[6], 8, 9);
        P2P_TRANSPORT_MEDIA_CREATE_FAILED = new h(h.z[13], 9, 10);
        INCOMPATIBLE_SRTP_KEY_EXCHANGE = new h(h.z[1], 10, 11);
        SRTP_KEY_GENERATION_ERROR = new h(h.z[14], 11, 12);
        UNSUPPORTED_AUDIO_CAPS = new h(h.z[8], 12, 13);
        P2P_TRANSPORT_START_FAILED = new h(h.z[9], 13, 14);
        RELAY_BIND_FAILED = new h(h.z[10], 14, 15);
        CANNOT_INITIALIZE_AUDIO_RECORD_OBJECT = new h(h.z[7], 15, 16);
        PEER_RELAY_BIND_FAILED = new h(h.z[2], 16, 17);
        a = new h[] { h.UNKNOWN, h.CALL_ACCEPT_FAILED, h.INIT_MEDIA_STREAM_FAILED, h.START_MEDIA_STREAM_FAILED, h.AUDIO_INIT_ERROR, h.HANDLE_OFFER_FAILED, h.HANDLE_ACCEPT_FAILED, h.SOUND_PORT_CREATE_FAILED, h.P2P_TRANSPORT_CREATE_FAILED, h.P2P_TRANSPORT_MEDIA_CREATE_FAILED, h.INCOMPATIBLE_SRTP_KEY_EXCHANGE, h.SRTP_KEY_GENERATION_ERROR, h.UNSUPPORTED_AUDIO_CAPS, h.P2P_TRANSPORT_START_FAILED, h.RELAY_BIND_FAILED, h.CANNOT_INITIALIZE_AUDIO_RECORD_OBJECT, h.PEER_RELAY_BIND_FAILED };
    }
    
    private h(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
