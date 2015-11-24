// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.b9;
import com.whatsapp.protocol.c2;
import com.whatsapp.protocol.bl;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.protocol.bz;
import android.content.Context;
import com.whatsapp.notification.y;
import com.whatsapp.protocol.bv;
import com.whatsapp.protocol.bs;
import com.whatsapp.protocol.c_;
import com.whatsapp.protocol.b8;
import com.whatsapp.protocol.b5;
import com.whatsapp.protocol.bi;
import com.whatsapp.protocol.b7;
import com.whatsapp.protocol.c6;
import com.whatsapp.util.bm;
import java.util.List;
import com.whatsapp.util.Log;
import android.text.TextUtils;
import com.whatsapp.protocol.cq;
import com.whatsapp.messaging.v;

final class p9 implements v
{
    private static final String[] z;
    private final App a;
    
    static {
        final String[] z2 = new String[80];
        String s = "\u0000\u0002;8~\f\u0002;8t\u0004\u0011=8w\u0013-*tr\b\u001d%He\t\u0013?7s\u000f\u0019%xq\u000fR?nv\u0004Hk2bA\u0014$e&D\u0001";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_2032:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0006';
                        break;
                    }
                    case 0: {
                        c2 = 'a';
                        break;
                    }
                    case 1: {
                        c2 = 'r';
                        break;
                    }
                    case 2: {
                        c2 = 'K';
                        break;
                    }
                    case 3: {
                        c2 = '\u0017';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0016\u0017)";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\u0016\u0017)";
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    s = "\u0000\u0002;8~\f\u0002;8t\u0004\u0011=8w\u0013-;~h\u0006Rnd&D\u0001";
                    n = 2;
                    array = z2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "\u0000\u0002;8~\f\u0002;8t\u0004\u0011=8w\u0013-:bc\u0013\u000bdzc\u0005\u001b*7t\u0004\u0007;{i\u0000\u0016\"yaA";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "\u0016\u0017)";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    s = "\u0000\u0002;8~\f\u0002;8t\u0004\u0011=8w\u0013-:bc\u0013\u000bk";
                    n = 5;
                    n2 = 6;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    array = z2;
                    s = "\u0016\u0017)";
                    n = 6;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "A\u0007%|h\u000e\u0005%7r\u0018\u0002.-&";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u0016\u0017)";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0016\u0017)";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u0000\u0002;8~\f\u0002;8t\u0004\u0011=8w\u0013-:bc\u0013\u000bdzc\u0005\u001b*7c\u0013\u0000$e&\u000f\u001d?7s\u0011\u001e$vb\u0004\u0016";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u0000\u0002;8~\f\u0002;8t\u0004\u0011=8w\u0013-:bc\u0013\u000bdzc\u0005\u001b*7h\u000eR-~j\u0004";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u0016\u0017)";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\u0016\u0017)";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\u0000\u0002;8~\f\u0002;8t\u0004\u0011=8w\u0013-:bc\u0013\u000bdzc\u0005\u001b*7c\u0013\u0000$e&\u000f\u001dkzc\u0012\u0001*pc";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "\u0000\u0002;8~\f\u0002;8t\u0004\u0011=8w\u0013-:bc\u0013\u000bdzc\u0005\u001b*7c\u0013\u0000$e&\u0014\u001c yi\u0016\u001c";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "\u0000\u0016/";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\u0000\u0002;8~\f\u0002;8t\u0004\u0011=8w\u0013-*tr\b\u001d%Hu\u0004\u0006\u0014pt\u000e\u0007;7h\u000eR%rr\u0016\u001d9|&\u0000\u0011(ru\u0012^kqg\b\u001ekciA\u00119rg\u0015\u0017kpt\u000e\u0007;";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "\u0016\u0017)";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "\u0013\u0017&xp\u0004";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "\u0012\u0017?";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "\u0000\u0002;8~\f\u0002;8t\u0004\u0011=8w\u0013-*tr\b\u001d%Hu\u0004\u0006\u0014pt\u000e\u0007;7k\u0000\u001e-xt\f\u0017/7g\u0002\u0006\"xh";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    s = "\u0011\u0000$zi\u0015\u0017";
                    n = 22;
                    n2 = 23;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    array = z2;
                    s = "\u0000\u0002;8~\f\u0002;8t\u0004\u0011=8w\u0013-*tr\b\u001d%Hu\u0004\u0006\u0014pt\u000e\u0007;7k\u0000\u001e-xt\f\u0017/7g\u0002\u0006\"xh";
                    n = 23;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "\u0000\u0016/";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "\u0002\u0000.vr\u0004";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "\u0011\u0000$zi\u0015\u0017";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "\r\u0017*ac";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "\u0013\u0017&xp\u0004";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "\u0012\u0007)}c\u0002\u0006";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "\u0000\u0002;8~\f\u0002;8t\u0004\u0011=8w\u0013-*tr\b\u001d%Hu\u0004\u0006\u0014pt\u000e\u0007;7e\u0013\u0017*ccA\u00159xs\u0011H";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "\u0013\u0017*s";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "\u0016\u0017)";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "\u0011\u001e*nc\u0005";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "\u0012\u0017?";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "2\u00179ac\u0013289q\t\u0013?dg\u0011\u0002eyc\u0015";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "\u0012\u0007)de\u0013\u001b)r";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "\u0011\u0013>dc\u0005";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "\u0013\u0017(xt\u0005\u001b%p";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "\u0002\u001d&gi\u0012\u001b%p";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "\u0013\u0017(xt\u0005\u001b%p";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "\u0014\u001c*ag\b\u001e*uj\u0004";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "\u0000\u0004*~j\u0000\u0010'r";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "\u0016\u0017)";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "\u0002\u001d&gi\u0012\u001b%p";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "\u0011\u0013>dc\u0005";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "\u0000\u0002;8~\f\u0002;8t\u0004\u0011=8w\u0013-*tr\b\u001d%Ho\u000f\u001b?~g\u0015\u0017k2uA\u0006$|c\u000fR=rt\b\u0014\"tg\u0015\u001b$y&\u0007\u0013\"{c\u0005^kdc\u000f\u0016\"yaA\u0011#vj\r\u0017%pcAW89&\u0003;/-&D\u0001k{i\u0002\u0013'-&D\u0001kec\u0002\u0004q7#\u0012R#vu2\u0017(ec\u0015Hk2d";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "\u0013\u00178bk\u0004";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "\u0013\u0017:bo\u0013\u0017/";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "\u0002\u001a*{j\u0004\u001c,r";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "\u0013\u0017:bo\u0013\u0017/";
                    n = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "\u0000\u0002;8~\f\u0002;8t\u0004\u0011=8w\u0013-*tr\b\u001d%Ho\u000f\u001b?~g\u0015\u0017kdc\u0012\u0001\"xh\\W);&\u0014\u001c yi\u0016\u001ckut\u000e\u00058rtAW8";
                    n = 51;
                    array = z2;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "\u0000\u0002;8~\f\u0002;8t\u0004\u0011=8w\u0013-*tr\b\u001d%Ho\u000f\u001b?~g\u0015\u0017k2u";
                    n = 52;
                    array = z2;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "\u0000\u0002;8~\f\u0002;8t\u0004\u0011=8w\u0013-*tr\b\u001d%Ho\u000f\u001b?~g\u0015\u0017k2uA\u0011#vj\r\u0017%pcA\u0014*~j\u0004\u0016kts\u0013\u0000\t-&D\u0001kec\u00100q7#\u0012";
                    n = 53;
                    array = z2;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    s = "\u0013\u0017:bo\u0013\u0017/";
                    n = 54;
                    array = z2;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    s = "\u0000\u0002;8~\f\u0002;8t\u0004\u0011=8w\u0013-*tr\b\u001d%Ho\u000f\u001b?~g\u0015\u0017ktn\u0000\u001e'rh\u0006\u0017kgg\u0012\u0001.s";
                    n = 55;
                    array = z2;
                    continue;
                }
                case 55: {
                    array[n2] = intern;
                    n2 = 57;
                    s = "\u0016\u0017)";
                    n = 56;
                    array = z2;
                    continue;
                }
                case 56: {
                    array[n2] = intern;
                    n2 = 58;
                    s = "\u0013\u00178bk\u0004";
                    n = 57;
                    array = z2;
                    continue;
                }
                case 57: {
                    array[n2] = intern;
                    n2 = 59;
                    s = "\u0000\u0002;8~\f\u0002;8t\u0004\u0011=8w\u0013-*tr\b\u001d%7o\u000f\u001b?~g\u0015\u0017ktn\u0000\u001e'rh\u0006\u0017kti\u000f\u0014'~e\u0015R(bt\u00130q7#\u0012R9rw#Hk2u";
                    n = 58;
                    array = z2;
                    continue;
                }
                case 58: {
                    array[n2] = intern;
                    n2 = 60;
                    s = "\u0000\u0002;8~\f\u0002;8t\u0004\u0011=8w\u0013-*tr\b\u001d%Hu\u0004\u0006\u0014ec\u0000\u0016kys\r\u001e";
                    n = 59;
                    array = z2;
                    continue;
                }
                case 59: {
                    array[n2] = intern;
                    n2 = 61;
                    s = "\u0000\u0002;8~\f\u0002;8t\u0004\u0011=8w\u0013-*tr\b\u001d%Hu\u0004\u0006\u0014ec\u0000\u0016kzg\r\u0014$ek\u0004\u0016kve\u0015\u001b$y";
                    n = 60;
                    array = z2;
                    continue;
                }
                case 60: {
                    array[n2] = intern;
                    n2 = 62;
                    s = "\u0016\u0017)";
                    n = 61;
                    array = z2;
                    continue;
                }
                case 61: {
                    array[n2] = intern;
                    n2 = 63;
                    s = "\u0016\u0017)";
                    n = 62;
                    array = z2;
                    continue;
                }
                case 62: {
                    array[n2] = intern;
                    n2 = 64;
                    s = "\u0012\u0017?";
                    n = 63;
                    array = z2;
                    continue;
                }
                case 63: {
                    array[n2] = intern;
                    n2 = 65;
                    s = "\u0010\u0000kds\u0002\u0011.du";
                    n = 64;
                    array = z2;
                    continue;
                }
                case 64: {
                    array[n2] = intern;
                    n2 = 66;
                    s = "\u0002\u001d&9q\t\u0013?dg\u0011\u0002\u0014gt\u0004\u0014.ec\u000f\u0011.d";
                    n = 65;
                    array = z2;
                    continue;
                }
                case 65: {
                    array[n2] = intern;
                    n2 = 67;
                    s = "\u0000\u0002;8~\f\u0002;8t\u0004\u0011=8w\u0013-8nh\u0002R8be\u0002\u00178d&D\u0001k2uAW87#\u0012";
                    n = 66;
                    array = z2;
                    continue;
                }
                case 66: {
                    array[n2] = intern;
                    n2 = 68;
                    s = "\u0010\u0000\u0014rb\u0014\u0011*co\u000e\u001c";
                    n = 67;
                    array = z2;
                    continue;
                }
                case 67: {
                    array[n2] = intern;
                    n2 = 69;
                    s = "\u0000\u0002;8~\f\u0002;8t\u0004\u0011=8w\u0013-8nh\u0002R.et\u000e\u0000k2uAW/";
                    n = 68;
                    array = z2;
                    continue;
                }
                case 68: {
                    array[n2] = intern;
                    n2 = 70;
                    s = "\u0010\u0000krt\u0013\u001d97";
                    n = 69;
                    array = z2;
                    continue;
                }
                case 69: {
                    array[n2] = intern;
                    n2 = 71;
                    s = "\u0012\u0017?";
                    n = 70;
                    array = z2;
                    continue;
                }
                case 70: {
                    array[n2] = intern;
                    n2 = 72;
                    s = "\u0016\u0017)";
                    n = 71;
                    array = z2;
                    continue;
                }
                case 71: {
                    array[n2] = intern;
                    n2 = 73;
                    s = "\u0012\u0017?";
                    n = 72;
                    array = z2;
                    continue;
                }
                case 72: {
                    array[n2] = intern;
                    n2 = 74;
                    s = "\u0016\u0017)";
                    n = 73;
                    array = z2;
                    continue;
                }
                case 73: {
                    array[n2] = intern;
                    s = "\u0012\u0017?";
                    n = 74;
                    n2 = 75;
                    array = z2;
                    continue;
                }
                case 74: {
                    array[n2] = intern;
                    n2 = 76;
                    array = z2;
                    s = "\u0012\u0017?";
                    n = 75;
                    continue;
                }
                case 75: {
                    array[n2] = intern;
                    n2 = 77;
                    s = "\u0005\u0017'rr\u0004";
                    n = 76;
                    array = z2;
                    continue;
                }
                case 76: {
                    array[n2] = intern;
                    n2 = 78;
                    s = "2\u00179ac\u0013289q\t\u0013?dg\u0011\u0002eyc\u0015";
                    n = 77;
                    array = z2;
                    continue;
                }
                case 77: {
                    array[n2] = intern;
                    n2 = 79;
                    s = "\u0016\u0017)";
                    n = 78;
                    array = z2;
                    continue;
                }
                case 78: {
                    break Label_2032;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public p9(final App a) {
        this.a = a;
    }
    
    static int a(final long n, final boolean b) {
        return b(n, b);
    }
    
    static App a(final p9 p) {
        return p.a;
    }
    
    private static cq a(final String d, final int h) {
        final cq cq = new cq();
        cq.h = h;
        cq.f = App.ak.m(d);
        cq.s = App.ak.j(d);
        cq.d = d;
        final a_9 a = z8.a(d);
        if (a != null) {
            cq.i = a.l;
            String t;
            if (TextUtils.isEmpty((CharSequence)a.t)) {
                t = null;
            }
            else {
                t = a.t;
            }
            cq.j = t;
        }
        return cq;
    }
    
    private static int b(final long n, final boolean b) {
        if (b || System.currentTimeMillis() > 86400000L + n) {
            return 20;
        }
        return 1;
    }
    
    static cq b(final String s, final int n) {
        return a(s, n);
    }
    
    @Override
    public void a(final String s) {
        l7.g(s);
    }
    
    @Override
    public void a(final String s, final int n) {
        Log.c(p9.z[69], null, new Object[] { s, n });
        App.F(p9.z[70] + n);
        l7.b(s, n);
    }
    
    @Override
    public void a(final String s, final String s2, final int n, final cq cq) {
        final boolean i = App.I;
        Label_0134: {
            Label_0486: {
                switch (n) {
                    case 0: {
                        App.a(s2, (List)null, 9);
                        App.b(s2, s, p9.z[5]);
                        if (i) {
                            break Label_0486;
                        }
                        break Label_0134;
                    }
                    case 1: {
                        App.g(s2);
                        App.b(s2, s, p9.z[9]);
                        if (i) {
                            break Label_0486;
                        }
                        break Label_0134;
                    }
                    case 2: {
                        App.a(s2, (List)null, 10);
                        App.b(s2, s, p9.z[13]);
                        if (i) {
                            break Label_0486;
                        }
                        break Label_0134;
                    }
                    case 3: {
                        App.E(s2);
                        App.b(s2, s, p9.z[14]);
                        if (i) {
                            break Label_0486;
                        }
                        break Label_0134;
                    }
                    case 4: {
                        bm.a(new adx(this, cq, s2, s));
                        if (i) {
                            break Label_0486;
                        }
                        break Label_0134;
                    }
                    case 5: {
                        final c6 c6 = new c6(cq.d, cq.a, cq.g);
                        final bi a = App.ak.a(c6);
                        final cq cq2 = new cq();
                        Label_0386: {
                            if (a == null) {
                                Log.e(p9.z[15]);
                                cq2.h = 404;
                                App.a(s2, cq2, n);
                                if (!i) {
                                    break Label_0386;
                                }
                            }
                            if (c6.b && b7.a(a.c, 2) < 0) {
                                Log.e(p9.z[11]);
                                cq2.h = 400;
                                App.a(s2, cq2, n);
                                if (!i) {
                                    break Label_0386;
                                }
                            }
                            if (!a9.a(a)) {
                                if (a.I == 1 || a.I == 2 || a.I == 3) {
                                    final MediaData mediaData = (MediaData)a.N;
                                    Label_0793: {
                                        if (mediaData.file != null && mediaData.file.exists()) {
                                            Log.i(p9.z[4] + c6);
                                            final MediaData n2 = new MediaData(mediaData);
                                            final bi bi = new bi(c6);
                                            bi.a(a.d());
                                            bi.N = n2;
                                            bi.n = a.n;
                                            bi.d = a.d;
                                            bi.I = a.I;
                                            bi.o = a.o;
                                            bi.L = a.L;
                                            bi.k = a.k;
                                            bi.P = a.P;
                                            bi.p = a.p;
                                            bi.G = a.G;
                                            (n2.uploader = new a8(a, bi, s2)).g();
                                            if (!i) {
                                                break Label_0793;
                                            }
                                        }
                                        Log.e(p9.z[12] + c6);
                                        cq2.h = 404;
                                        App.a(s2, cq2, n);
                                    }
                                    if (!i) {
                                        break Label_0386;
                                    }
                                }
                                Log.e(p9.z[16]);
                                cq2.h = 400;
                                App.a(s2, cq2, n);
                            }
                        }
                        App.b(s2, s, p9.z[10]);
                        if (i) {
                            break Label_0486;
                        }
                        break Label_0134;
                    }
                    case 6: {
                        bm.a(new za(this, cq, s2, n, s));
                        if (i) {
                            break Label_0486;
                        }
                        break Label_0134;
                    }
                    case 11: {
                        bm.a(new a8z(this, cq, s2, n, s));
                        if (i) {
                            break Label_0486;
                        }
                        break Label_0134;
                    }
                    case 13: {
                        bm.a(new oe(this, cq, s2, n, s));
                        if (i) {
                            break Label_0486;
                        }
                        break Label_0134;
                    }
                    case 12: {
                        bm.a(new u4(this, cq, s2, n, s));
                        if (i) {
                            break Label_0486;
                        }
                        break Label_0134;
                    }
                    case 14: {
                        bm.a(new dy(this, n, cq, s2, s));
                        if (i) {
                            break;
                        }
                        break Label_0134;
                    }
                }
            }
            Log.e(p9.z[6] + s2 + p9.z[8] + n);
            App.b(s2, s, p9.z[7]);
            App.w(s2);
        }
        l7.b();
        l7.C();
    }
    
    @Override
    public void a(final String s, final String s2, final b5 b5) {
        final boolean i = App.I;
        Label_0288: {
            if (l7.j()) {
                if (p9.z[43].equals(b5.a)) {
                    l7.r();
                    App.G();
                    if (!i) {
                        break Label_0288;
                    }
                }
                if (p9.z[42].equals(b5.a)) {
                    l7.a(b5.c);
                    App.K();
                    if (!i) {
                        break Label_0288;
                    }
                }
                if (p9.z[37].equals(b5.a) && b5.d != null) {
                    App.c(z8.a(b5.d));
                    if (!i) {
                        break Label_0288;
                    }
                }
                if ((p9.z[45].equals(b5.a) || p9.z[38].equals(b5.a) || p9.z[41].equals(b5.a)) && b5.d != null) {
                    final a_9 a = z8.a(b5.d);
                    if (a != null && !a_9.h(b5.d) && !a.u.equals(p9.z[36]) && b5.a != null) {
                        final String a2 = b5.a;
                        int n = -1;
                        Label_0350: {
                            switch (a2.hashCode()) {
                                case 993558001: {
                                    if (!a2.equals(p9.z[39])) {
                                        break;
                                    }
                                    if (i) {
                                        n = 0;
                                        break Label_0350;
                                    }
                                    n = 0;
                                    break;
                                }
                                case -1399754289: {
                                    if (!a2.equals(p9.z[40])) {
                                        break;
                                    }
                                    if (i) {
                                        n = 1;
                                        break Label_0350;
                                    }
                                    n = 1;
                                    break;
                                }
                                case -995321554: {
                                    if (a2.equals(p9.z[46])) {
                                        n = 2;
                                        break;
                                    }
                                    break;
                                }
                            }
                        }
                        Label_0406: {
                            switch (n) {
                                case 0: {
                                    this.a.a(a.u, 1);
                                    if (i) {
                                        break Label_0406;
                                    }
                                    break;
                                }
                                case 1: {
                                    this.a.a(a.u, 0);
                                    if (i) {
                                        break Label_0406;
                                    }
                                    break;
                                }
                                case 2: {
                                    this.a.v(a.u);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        App.b(s2, s, p9.z[44]);
        l7.b();
        l7.C();
    }
    
    @Override
    public void a(final String s, final String s2, final b8 b8) {
        Label_0197: {
            if (l7.j() && b8.e != null && b8.c != null && b8.d != null) {
                final App a = this.a;
                if (!App.o(b8.e)) {
                    if (p9.z[75].equals(b8.c) && b8.b != null && b8.a != null) {
                        if (!b8.d.startsWith(App.au()) && !adc.b(b8.d)) {
                            break Label_0197;
                        }
                        App.a(new _r(b8.d, b8.a, b8.b, new c_(b8.e, p9.z[73])));
                        if (!App.I) {
                            break Label_0197;
                        }
                    }
                    if (p9.z[77].equals(b8.c)) {
                        App.a(new _r(b8.d, null, null, new c_(b8.e, p9.z[76])));
                    }
                }
            }
        }
        App.b(s2, s, p9.z[74]);
        l7.b();
        l7.C();
    }
    
    @Override
    public void a(final String s, final String s2, final bi bi) {
        final boolean i = App.I;
        Label_0214: {
            if (l7.j()) {
                App.g(bi);
                Label_0061: {
                    if (a_9.h(bi.a.a)) {
                        final a_9 a = z8.a(bi.a.a);
                        if (a != null) {
                            App.b(bi, a);
                            if (!i) {
                                break Label_0061;
                            }
                        }
                        bi.t = null;
                    }
                }
                App.ak.g(bi);
                arz.a().a(bi.b != null);
                a_9 a2;
                if (bi.a.b) {
                    a2 = z8.a(bi.a.a);
                }
                else {
                    a2 = null;
                }
                if (a2 != null && !a_9.h(a2.u) && !a2.m() && !a2.u.equals(p9.z[78])) {
                    App.ay.removeMessages(5, (Object)App.r(a2.u));
                    App.ay.removeMessages(3, (Object)App.r(a2.u));
                    App.ay.removeMessages(4, (Object)App.r(a2.u));
                }
                if (!i) {
                    break Label_0214;
                }
            }
            App.b(s2, s, p9.z[79]);
        }
        l7.b();
        l7.C();
    }
    
    @Override
    public void a(final String s, final String s2, final bs bs) {
        if (l7.j()) {
            final App a = this.a;
            if (!App.o(s2)) {
                final c_ c_ = new c_(s2, p9.z[71]);
                final App a2 = this.a;
                App.a(bs.b, bs.a, bs.c, c_);
            }
        }
        App.b(s2, s, p9.z[72]);
        l7.b();
        l7.C();
    }
    
    @Override
    public void a(final String s, final String s2, final bv bv) {
        final boolean i = App.I;
        final String d = bv.d;
        final int c = bv.c;
        if (l7.j()) {
            final App a = this.a;
            if (!App.o(s2)) {
                int n = 200;
                Label_0117: {
                    Label_0372: {
                        switch (c) {
                            case 2: {
                                final App a2 = this.a;
                                final bi c2 = App.ak.C(d);
                                if ((c2 == null && bv.b == null) || (c2 != null && c2.a.equals(bv.b))) {
                                    App.d(d, false);
                                    Conversation.g(d);
                                    if (!i) {
                                        break Label_0117;
                                    }
                                }
                                n = 409;
                                if (i) {
                                    break Label_0372;
                                }
                                break Label_0117;
                            }
                            case 3:
                            case 4: {
                                final App a3 = this.a;
                                final bi c3 = App.ak.C(d);
                                if ((c3 == null && bv.b == null) || (c3 != null && c3.a.equals(bv.b))) {
                                    App.ak.a(d, c == 3, false);
                                    if (!i) {
                                        break Label_0117;
                                    }
                                }
                                n = 409;
                                if (i) {
                                    break Label_0372;
                                }
                                break Label_0117;
                            }
                            case 5: {
                                final int n2 = n;
                                final App a4 = this.a;
                                if (!y.d((Context)App.aq, d)) {
                                    final App a5 = this.a;
                                    y.a((Context)App.aq, d, bv.a, true, false);
                                    if (!i) {
                                        n = n2;
                                        break Label_0117;
                                    }
                                }
                                n = 409;
                                if (i) {
                                    break Label_0372;
                                }
                                break Label_0117;
                            }
                            case 6: {
                                final App a6 = this.a;
                                if (1000L * (y.e((Context)App.aq, d) / 1000L) == bv.g) {
                                    final App a7 = this.a;
                                    y.a((Context)App.aq, d, false);
                                    if (!i) {
                                        break Label_0117;
                                    }
                                }
                                n = 409;
                                if (i) {
                                    break;
                                }
                                break Label_0117;
                            }
                        }
                    }
                    n = 400;
                    Log.b(p9.z[0], null, new Object[] { c, d });
                }
                l7.a(s2, n);
                if (n != 200) {
                    final App a8 = this.a;
                    App.b(s2, n);
                }
            }
        }
        App.b(s2, s, p9.z[1]);
        l7.b();
        l7.C();
    }
    
    @Override
    public void a(final String s, final String s2, final bz bz) {
        final boolean i = App.I;
        Label_0527: {
            if (l7.j() && bz.a != null && bz.f != null && bz.c != null && bz.c.startsWith(App.au())) {
                final App a = this.a;
                if (App.o(bz.a)) {
                    break Label_0527;
                }
                final c_ c_ = new c_(bz.a, p9.z[21]);
                Label_0513: {
                    Label_0253: {
                        if ((p9.z[20].equals(bz.f) || p9.z[25].equals(bz.f) || p9.z[27].equals(bz.f)) && bz.d != null && bz.d.size() > 0 && bz.e != null) {
                            final n9 n9 = new n9(bz.e, null, bz.d, 0, c_);
                            final String f = bz.f;
                            int n10 = -1;
                        Label_0220:
                            while (true) {
                                int n11 = 0;
                                Label_0658: {
                                    while (true) {
                                        Label_0567: {
                                            switch (f.hashCode()) {
                                                case -934610812: {
                                                    if (!f.equals(p9.z[29])) {
                                                        break;
                                                    }
                                                    n11 = 0;
                                                    if (i) {
                                                        break Label_0567;
                                                    }
                                                    break Label_0658;
                                                }
                                                case -309211200: {
                                                    if (f.equals(p9.z[23])) {
                                                        n10 = 2;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case 96417: {
                                                    n11 = n10;
                                                    break Label_0567;
                                                }
                                            }
                                            Label_0643: {
                                                switch (n10) {
                                                    case 0: {
                                                        n9.h = 29;
                                                        App.c(n9);
                                                        if (i) {
                                                            break Label_0643;
                                                        }
                                                        break;
                                                    }
                                                    case 1: {
                                                        n9.h = 14;
                                                        App.a(n9);
                                                        if (i) {
                                                            break Label_0643;
                                                        }
                                                        break;
                                                    }
                                                    case 2: {
                                                        n9.h = 90;
                                                        App.b(n9);
                                                        break;
                                                    }
                                                }
                                            }
                                            if (i) {
                                                break Label_0253;
                                            }
                                            break Label_0513;
                                        }
                                        if (f.equals(p9.z[17])) {
                                            n10 = 1;
                                            if (i) {
                                                continue;
                                            }
                                            continue Label_0220;
                                        }
                                        break;
                                    }
                                }
                                n10 = n11;
                                continue Label_0220;
                            }
                        }
                    }
                    if (p9.z[28].equals(bz.f) && bz.e != null) {
                        App.a(bz.e, c_);
                        if (!i) {
                            break Label_0513;
                        }
                    }
                    if (p9.z[30].equals(bz.f) && bz.b != null && bz.e != null) {
                        App.a(bz.e, bz.b, c_);
                        if (!i) {
                            break Label_0513;
                        }
                    }
                    if (p9.z[26].equals(bz.f) && bz.b != null && bz.d != null && bz.d.size() > 0) {
                        final String d = adc.d(bz.b);
                        adc.a(d, bz.d);
                        Label_0499: {
                            if (App.O()) {
                                Log.i(p9.z[31] + d);
                                App.ak.g(adc.a(d, bz.b, bz.d, 2));
                                bm.a(new asm(this, d, bz, c_));
                                if (!i) {
                                    break Label_0499;
                                }
                            }
                            Log.i(p9.z[18]);
                            App.ak.g(adc.a(d, bz.b, bz.d, 3));
                        }
                        if (!i) {
                            break Label_0513;
                        }
                    }
                    Log.e(p9.z[24]);
                }
                if (!i) {
                    break Label_0527;
                }
            }
            Log.e(p9.z[22]);
        }
        App.b(s2, s, p9.z[19]);
        l7.b();
        l7.C();
    }
    
    @Override
    public void a(final String s, final String s2, final String s3) {
        Log.c(p9.z[3], null, new Object[] { s2, s3 });
        l7.b(s2, s3);
        App.b(s2, s, p9.z[2]);
        l7.b();
    }
    
    @Override
    public void a(final String s, final String s2, final String s3, final c6 c6) {
        if (l7.j() && c6 != null && (p9.z[34].equals(s3) || p9.z[32].equals(s3)) && App.ak.b(c6, 9)) {
            final bi a = App.ak.a(c6);
            a.C = p9.z[35];
            App.b(a);
        }
        App.b(s2, s, p9.z[33]);
        l7.b();
        l7.C();
    }
    
    @Override
    public void a(final String s, final String s2, final String s3, final c6 c6, final int n) {
        final boolean i = App.I;
        Label_0134: {
            if (l7.j() && s3 != null) {
                final App a = this.a;
                if (App.o(s2)) {
                    break Label_0134;
                }
                final a_9 a2 = z8.a(s3);
                final bi a3 = App.ak.a(c6);
                Label_0120: {
                    if (a2 != null && a3 != null && a2.l >= n) {
                        l7.a(s2, 200);
                        App.a(a2, false, false, c6, n);
                        App.a(true, true, true, false);
                        PopupNotification.e(s3);
                        if (!i) {
                            break Label_0120;
                        }
                    }
                    l7.a(s2, 400);
                    App.b(s2, 400);
                    Log.e(p9.z[60]);
                }
                if (!i) {
                    break Label_0134;
                }
            }
            Log.e(p9.z[61]);
        }
        App.b(s2, s, p9.z[62]);
        l7.b();
        l7.C();
    }
    
    @Override
    public void a(final String s, final String s2, final String s3, final String s4, final String s5, final String s6) {
        final boolean i = App.I;
        Label_0612: {
            if (p9.z[50].equals(s6)) {
                final tj j = l7.i();
                Label_0283: {
                    if (j != null) {
                        final String c = l7.c(s4, s5, j.b);
                        if (c != null) {
                            Log.i(p9.z[56]);
                            if (p9.z[48].equals(j.a) && l7.c(s4)) {
                                if (l7.j()) {
                                    l7.w();
                                }
                                App.a(s3, c, s4, 2);
                                if (!i) {
                                    break Label_0283;
                                }
                            }
                            if (p9.z[49].equals(j.a)) {
                                App.c(false);
                                App.a(s3, c, s4, 1);
                                if (!i) {
                                    break Label_0283;
                                }
                            }
                            if (!l7.j()) {
                                App.a(s3, c, s4, 1);
                                if (!i) {
                                    break Label_0283;
                                }
                            }
                            if (l7.c(s4)) {
                                App.c(false);
                                App.a(s3, c, s4, 1);
                                if (!i) {
                                    break Label_0283;
                                }
                            }
                            Log.b(p9.z[59], null, new Object[] { l7.r, s4 });
                            App.b(0, s3);
                            if (!i) {
                                break Label_0283;
                            }
                        }
                        Log.b(p9.z[54], null, new Object[] { j.a, l7.r, s4 });
                        l7.q();
                        App.b(1, s3);
                    }
                }
                if (!i) {
                    break Label_0612;
                }
            }
            if (!l7.j() || l7.c(s4) || p9.z[55].equals(s6)) {
                final String d = l7.d(s4, s5);
                Label_0565: {
                    if (d != null) {
                        if (p9.z[58].equals(s6)) {
                            if (l7.j()) {
                                l7.w();
                            }
                            App.a(s3, d, s4, 2);
                            if (!i) {
                                break Label_0565;
                            }
                        }
                        if (p9.z[51].equals(s6)) {
                            App.c(false);
                            App.a(s3, d, s4, 1);
                            if (!i) {
                                break Label_0565;
                            }
                        }
                        if (l7.j()) {
                            App.c(false);
                        }
                        App.a(s3, d, s4, 1);
                        if (!i) {
                            break Label_0565;
                        }
                    }
                    if (l7.f(s4)) {
                        final String k = l7.j(s6);
                        App.a(2, s3, k);
                        Log.c(p9.z[47], null, new Object[] { s6, k, s4, l7.j, s5, l7.a != null });
                        if (!i) {
                            break Label_0565;
                        }
                    }
                    Log.b(p9.z[52], null, new Object[] { l7.j(), s4 });
                    App.b(1, s3);
                }
                if (!i) {
                    break Label_0612;
                }
            }
            Log.b(p9.z[53], null, new Object[] { s6 });
            if (l7.f(s4)) {
                App.b(0, s3);
                if (!i) {
                    break Label_0612;
                }
            }
            App.b(1, s3);
        }
        App.b(s2, s, p9.z[57]);
    }
    
    @Override
    public void a(final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final boolean b) {
        Log.c(p9.z[67], null, new Object[] { s, s4, s5, s6 });
        App.F(p9.z[65]);
        l7.a(s, s2, s3, s4, s5, s6, b);
        App.aq.getSharedPreferences(p9.z[66], 0).edit().putBoolean(p9.z[68], false).commit();
        l7.b();
        l7.C();
    }
    
    @Override
    public void a(final String s, final String s2, final boolean b, final String s3, final String s4, final long n, final String s5) {
        App.a(s, s2, b, s3, s4, n, s5);
    }
    
    @Override
    public void b(final String s, final String s2, final String s3) {
        Label_0098: {
            if (l7.j()) {
                final App a = this.a;
                if (!App.o(s2)) {
                    if (s3 != null) {
                        App.a(s3, new a8r(this, s2, s3), new f9(this, s2), new ux(this, s2), new c_(s2, p9.z[64]));
                        if (!App.I) {
                            break Label_0098;
                        }
                    }
                    l7.a(s2, 400);
                    final App a2 = this.a;
                    App.b(s2, 400);
                }
            }
        }
        App.b(s2, s, p9.z[63]);
        l7.b();
        l7.C();
    }
}
