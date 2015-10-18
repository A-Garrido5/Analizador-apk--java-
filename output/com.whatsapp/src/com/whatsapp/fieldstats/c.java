// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum c
{
    public static final c AIRTEL;
    public static final c ALFA;
    public static final c BANGLALINK;
    public static final c BEELINE;
    public static final c BICS;
    public static final c CELLC;
    public static final c CLARO;
    public static final c CLICKATELL;
    public static final c COSMOTE;
    public static final c DIGI;
    public static final c DJEZZY;
    public static final c DONT_SEND_SMS;
    public static final c DONT_SEND_VOICE;
    public static final c EMAILONLY;
    public static final c ETB;
    public static final c FACEBOOK;
    public static final c HIGHSIDE;
    public static final c HTHK;
    public static final c IMESSAGE;
    public static final c INDOSAT;
    public static final c INFOBIP;
    public static final c INFOBIPSMS;
    public static final c JAWWAL;
    public static final c MACH;
    public static final c MBLOX;
    public static final c MIO;
    public static final c MOBILY;
    public static final c MOBME;
    public static final c MOVISTAR;
    public static final c MTN;
    public static final c NAWRAS;
    public static final c NEXMO;
    public static final c NEXMOVOICE;
    public static final c OMANTEL;
    public static final c PERSONAL;
    public static final c PLIVO;
    public static final c ROUTO;
    public static final c ROUTOSMS;
    public static final c SELF;
    public static final c SMSGATEWAY;
    public static final c SMSGATEWAY2;
    public static final c SUNRISE;
    public static final c SYBASE;
    public static final c SYNIVERSE;
    public static final c TELENOR;
    public static final c TELESIGNSMS;
    public static final c TELESIGNVOICE;
    public static final c TIGO;
    public static final c TIM;
    public static final c TOUCH;
    public static final c TROPO;
    public static final c TWILIO;
    public static final c TWILIO2;
    public static final c TWILIOL;
    public static final c TWILIOSMS;
    public static final c TWILIOSMS2;
    public static final c TWILIOSMS3;
    public static final c TYNTEC;
    public static final c UFONE;
    public static final c VEXX;
    public static final c VIETTEL;
    public static final c VOICEWORKS;
    public static final c WEBAROO;
    public static final c XL;
    private static final c[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[64];
        String s = "\u0005G<Z\u000b\u0006J;S\f";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1632:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'G';
                        break;
                    }
                    case 0: {
                        c2 = 'G';
                        break;
                    }
                    case 1: {
                        c2 = '\u0006';
                        break;
                    }
                    case 2: {
                        c2 = 'r';
                        break;
                    }
                    case 3: {
                        c2 = '\u001d';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\tG%O\u0006\u0014";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\nI$T\u0014\u0013G ";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\u0002R0";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "\u0013Q;Q\u000e\b";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "\u0004C>Q\u0004";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    s = "\u0003O5T";
                    n = 5;
                    n2 = 6;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    array = z2;
                    s = "\u0014_<T\u0011\u0002T!X";
                    n = 6;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u0015I'I\b";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\nI0T\u000b\u001e";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0013C>X\u0014\u000eA<N\n\u0014";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u0003I<I\u0018\u0014C<Y\u0018\u0014K!";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u0014_0\\\u0014\u0002";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\nG1U";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\nO=";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\u0014S<O\u000e\u0014C";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "\u0013Q;Q\u000e\bU?N";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "\u0013T=M\b";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\tC*P\b\u0011I;^\u0002";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "\u0001G1X\u0005\bI9";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "\u000eK7N\u0014\u0006A7";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "\u0003I<I\u0018\u0014C<Y\u0018\u0011I;^\u0002";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "\u0013Q;Q\u000e\b4";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "\u0004J;^\f\u0006R7Q\u000b";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "\nD>R\u001f";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "\nI0P\u0002";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "\u0002K3T\u000b\bH>D";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "\u0014K!Z\u0006\u0013C%\\\u001eu";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "\u0013Q;Q\u000e\bJ";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    s = "\u0013C>X\u0014\u000eA<K\b\u000eE7";
                    n = 28;
                    n2 = 29;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    array = z2;
                    s = "\u0017C N\b\tG>";
                    n = 29;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "\u000eH4R\u0005\u000eV";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "\u0005C7Q\u000e\tC";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "\u0013Q;Q\u000e\bU?Nt";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "\u000fR:V";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "\u000fO5U\u0014\u000eB7";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "\u0014K!Z\u0006\u0013C%\\\u001e";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "\bK3S\u0013\u0002J";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "\u000eH6R\u0014\u0006R";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "\u0005O1N";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "\u0004I!P\b\u0013C";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "\u0013Q;Q\u000e\bU?Nu";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "\u0014C>[";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "\u0013C>X\t\bT";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "\u0013O?";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "\u001fJ";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "\u0011O7I\u0013\u0002J";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "\u0015I'I\b\u0014K!";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "\u000eH4R\u0005\u000eV!P\u0014";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "\u0011I;^\u0002\u0010I V\u0014";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "\u0006J4\\";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "\u0017J;K\b";
                    n = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "\rG%J\u0006\u000b";
                    n = 51;
                    array = z2;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "\nR<";
                    n = 52;
                    array = z2;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "\u0003L7G\u001d\u001e";
                    n = 53;
                    array = z2;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    s = "\tC*P\b";
                    n = 54;
                    array = z2;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    s = "\u0006O I\u0002\u000b";
                    n = 55;
                    array = z2;
                    continue;
                }
                case 55: {
                    array[n2] = intern;
                    n2 = 57;
                    s = "\u0013_<I\u0002\u0004";
                    n = 56;
                    array = z2;
                    continue;
                }
                case 56: {
                    array[n2] = intern;
                    n2 = 58;
                    s = "\u0004J3O\b";
                    n = 57;
                    array = z2;
                    continue;
                }
                case 57: {
                    array[n2] = intern;
                    n2 = 59;
                    s = "\u0011C*E";
                    n = 58;
                    array = z2;
                    continue;
                }
                case 58: {
                    array[n2] = intern;
                    n2 = 60;
                    s = "\u0013I'^\u000f";
                    n = 59;
                    array = z2;
                    continue;
                }
                case 59: {
                    array[n2] = intern;
                    n2 = 61;
                    s = "\u0010C0\\\u0015\bI";
                    n = 60;
                    array = z2;
                    continue;
                }
                case 60: {
                    array[n2] = intern;
                    n2 = 62;
                    s = "\u0012@=S\u0002";
                    n = 61;
                    array = z2;
                    continue;
                }
                case 61: {
                    array[n2] = intern;
                    n2 = 63;
                    s = "\u0013O5R";
                    n = 62;
                    array = z2;
                    continue;
                }
                case 62: {
                    break Label_1632;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        SELF = new c(c.z[42], 0, 0);
        CLICKATELL = new c(c.z[23], 1, 1);
        SYBASE = new c(c.z[12], 2, 2);
        SMSGATEWAY = new c(c.z[36], 3, 3);
        TROPO = new c(c.z[17], 4, 4);
        ROUTO = new c(c.z[8], 5, 5);
        INFOBIP = new c(c.z[31], 6, 6);
        ROUTOSMS = new c(c.z[47], 7, 7);
        TWILIO = new c(c.z[4], 8, 8);
        INFOBIPSMS = new c(c.z[48], 9, 9);
        TWILIOSMS = new c(c.z[16], 10, 10);
        NEXMO = new c(c.z[55], 11, 11);
        EMAILONLY = new c(c.z[26], 12, 12);
        INDOSAT = new c(c.z[38], 13, 13);
        MIO = new c(c.z[14], 14, 14);
        UFONE = new c(c.z[62], 15, 15);
        NAWRAS = new c(c.z[1], 16, 16);
        VOICEWORKS = new c(c.z[49], 17, 17);
        HTHK = new c(c.z[34], 18, 18);
        DIGI = new c(c.z[6], 19, 19);
        AIRTEL = new c(c.z[56], 20, 20);
        SMSGATEWAY2 = new c(c.z[27], 21, 21);
        XL = new c(c.z[45], 22, 22);
        TELESIGNVOICE = new c(c.z[29], 23, 23);
        MOBILY = new c(c.z[9], 24, 24);
        OMANTEL = new c(c.z[37], 25, 25);
        PLIVO = new c(c.z[51], 26, 26);
        TYNTEC = new c(c.z[57], 27, 27);
        MACH = new c(c.z[13], 28, 28);
        TELESIGNSMS = new c(c.z[10], 29, 29);
        HIGHSIDE = new c(c.z[35], 30, 30);
        IMESSAGE = new c(c.z[20], 31, 31);
        TWILIO2 = new c(c.z[22], 32, 32);
        TELENOR = new c(c.z[43], 33, 33);
        CLARO = new c(c.z[58], 34, 34);
        ALFA = new c(c.z[50], 35, 35);
        BANGLALINK = new c(c.z[0], 36, 36);
        MTN = new c(c.z[53], 37, 37);
        MOBME = new c(c.z[25], 38, 38);
        COSMOTE = new c(c.z[40], 39, 39);
        SUNRISE = new c(c.z[15], 40, 40);
        VEXX = new c(c.z[59], 41, 41);
        TOUCH = new c(c.z[60], 42, 42);
        DJEZZY = new c(c.z[54], 43, 43);
        MOVISTAR = new c(c.z[2], 44, 44);
        JAWWAL = new c(c.z[52], 45, 45);
        TWILIOSMS2 = new c(c.z[41], 46, 46);
        VIETTEL = new c(c.z[46], 47, 47);
        PERSONAL = new c(c.z[30], 48, 48);
        BEELINE = new c(c.z[32], 49, 49);
        TIGO = new c(c.z[63], 50, 50);
        ETB = new c(c.z[3], 51, 51);
        CELLC = new c(c.z[5], 52, 52);
        WEBAROO = new c(c.z[61], 53, 53);
        TIM = new c(c.z[44], 54, 54);
        NEXMOVOICE = new c(c.z[18], 55, 55);
        SYNIVERSE = new c(c.z[7], 56, 56);
        BICS = new c(c.z[39], 57, 57);
        MBLOX = new c(c.z[24], 58, 58);
        TWILIOSMS3 = new c(c.z[33], 59, 59);
        TWILIOL = new c(c.z[28], 60, 60);
        FACEBOOK = new c(c.z[19], 61, 61);
        DONT_SEND_SMS = new c(c.z[11], 62, 98);
        DONT_SEND_VOICE = new c(c.z[21], 63, 99);
        a = new c[] { c.SELF, c.CLICKATELL, c.SYBASE, c.SMSGATEWAY, c.TROPO, c.ROUTO, c.INFOBIP, c.ROUTOSMS, c.TWILIO, c.INFOBIPSMS, c.TWILIOSMS, c.NEXMO, c.EMAILONLY, c.INDOSAT, c.MIO, c.UFONE, c.NAWRAS, c.VOICEWORKS, c.HTHK, c.DIGI, c.AIRTEL, c.SMSGATEWAY2, c.XL, c.TELESIGNVOICE, c.MOBILY, c.OMANTEL, c.PLIVO, c.TYNTEC, c.MACH, c.TELESIGNSMS, c.HIGHSIDE, c.IMESSAGE, c.TWILIO2, c.TELENOR, c.CLARO, c.ALFA, c.BANGLALINK, c.MTN, c.MOBME, c.COSMOTE, c.SUNRISE, c.VEXX, c.TOUCH, c.DJEZZY, c.MOVISTAR, c.JAWWAL, c.TWILIOSMS2, c.VIETTEL, c.PERSONAL, c.BEELINE, c.TIGO, c.ETB, c.CELLC, c.WEBAROO, c.TIM, c.NEXMOVOICE, c.SYNIVERSE, c.BICS, c.MBLOX, c.TWILIOSMS3, c.TWILIOL, c.FACEBOOK, c.DONT_SEND_SMS, c.DONT_SEND_VOICE };
    }
    
    private c(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
