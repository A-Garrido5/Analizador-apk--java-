// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.os.SystemClock;
import com.whatsapp.App$Me;
import com.whatsapp.ChangeNumber;
import com.whatsapp.al5;
import com.whatsapp.Voip;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import android.backport.util.Base64;
import com.whatsapp.protocol.bg;
import com.whatsapp.protocol.b_;
import com.whatsapp.protocol.b3;
import com.whatsapp.protocol.ce;
import com.whatsapp.protocol.cl;
import com.whatsapp.protocol.by;
import com.whatsapp.protocol.cg;
import com.whatsapp.protocol.ct;
import com.whatsapp.jp;
import com.whatsapp.dt;
import com.whatsapp.protocol.b1;
import com.whatsapp.protocol.bj;
import java.util.List;
import com.whatsapp.protocol.c6;
import android.os.Bundle;
import android.os.Message;
import com.whatsapp.protocol.co;
import com.whatsapp.util.x;
import android.telephony.TelephonyManager;
import android.os.Build$VERSION;
import android.os.Build;
import com.whatsapp.protocol.b6;
import com.whatsapp.protocol.c3;
import com.whatsapp.protocol.c5;
import java.io.OutputStream;
import com.whatsapp.protocol.bx;
import com.whatsapp.l7;
import java.io.Writer;
import com.whatsapp.protocol.bc;
import com.whatsapp.protocol.bn;
import com.whatsapp.util.q;
import com.whatsapp.App;
import java.io.InputStream;
import com.whatsapp.protocol.bk;
import com.whatsapp.protocol.b7;
import com.whatsapp.a2p;
import com.whatsapp._y;
import com.whatsapp.protocol.bw;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import android.os.Handler$Callback;
import java.net.Socket;
import com.whatsapp.protocol.bf;
import android.os.Handler;
import android.content.Context;
import java.util.Random;
import com.whatsapp.protocol.bh;
import android.os.HandlerThread;

final class ae extends HandlerThread
{
    private static final String[] z;
    private a4 a;
    private boolean b;
    private boolean c;
    private final bh d;
    private final String e;
    private final Random f;
    private final ba g;
    private bp h;
    private y i;
    private final Context j;
    private final ar k;
    private final ar l;
    private final Handler m;
    private bf n;
    private Socket o;
    private boolean p;
    private final ar q;
    private b0 r;
    
    static {
        final String[] z2 = new String[66];
        String s = "\u0015'!\u0014\u0016\u001e)8I\u0000\u00068";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1682:
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
                        c2 = 'v';
                        break;
                    }
                    case 1: {
                        c2 = 'H';
                        break;
                    }
                    case 2: {
                        c2 = 'L';
                        break;
                    }
                    case 3: {
                        c2 = ':';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0017$-H\f";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0015'!\u0014\u0016\u001e)8I\u0000\u00068b[\r\u0017:!\u0014\":\u0001\tt5)\u0018\u0005t&)\u001c\u0005w$9\u001d\u0018";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY8%T\u0006\u0002!!_\u000e\u0003<c[\r\u0004--^\u0018);)N";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "%\r\u0002~A";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "\u0006 #T\u0004";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "$\r\u000flA";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY;#Y\n\u0013<cY\r\u0019;)";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY+ U\u0012\u0013\u001b#Y\n\u0013<l";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY$#]\u000e\u0003<cN\b\u001b-#O\u0015Y;'S\u0011[>#S\u0011[)/N\b\u0000-";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY$#]\u000e\u0003<cN\b\u001b-#O\u0015Y+ U\u0012\u0013e?U\u0002\u001d-8";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY99S\u0015";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY+#T\u000f\u0013+8";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY$#]\b\u0018g8S\f\u0013'9NN\u0005<#J";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY;#Y\n\u0013<cY\r\u0019;)^";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY+#T\u000f\u0013+8\u0015\u000f\u0019<a[\r\u001a';_\u0005Y$#]\b\u0018e*[\b\u001a-(";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "\u0018'lT\u000e\u0018+)\u001a\b\u0018h/R\u0000\u001a$)T\u0006\u0013";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY)8N\u0004\u001b88\u0015D\u0012";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY$#]\b\u0018";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY;#Y\n\u0013<cY\r\u0019;)^";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "V+#^\u0004L";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY+#T\u000f\u0013+8\u0015\u000e\u0000->H\b\u0012-a_\u0019\u0006!>_\u0005";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY$#]\b\u0018g8S\f\u0013'9NN\u0005<-H\u0015";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY;#Y\n\u0013<cT\u0004\u000e<aJ\u000e\u0004<cY\u000e\u0004:9J\u0015[;8H\u0004\u0017%a_\u0019\u0015-<N\b\u0019&l";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY?>S\u0015\u0013g/V\b\u0013&8e\u0002\u0019&*S\u0006Y/)N";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY;#Y\n\u0013<c^\b\u0005+#T\u000f\u0013+8\u001a";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY;#Y\n\u0013<cY\r\u0019;)^";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY;#Y\n\u0013<cY\u000e\u0018&)Y\u0015\u0013,";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY+#T\u000f\u0013+8\u0015\u000f\u0019<a[\r\u001a';_\u0005Y;#\\\u0015\u0001)>_L\u00130<S\u0013\u0013,";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY;#Y\n\u0013<cY\r\u0019;)^";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY$#]\b\u0018g*[\b\u001a=>_A\u00021<_[";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY+#T\u000f\u0013+8\u0015\u000f\u0019<a[\r\u001a';_\u0005Y+ U\u0002\u001d";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY?>S\u0015\u0013g.V\u000e\u0015# S\u0012\u0002g+_\u0015";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY+#T\u000f\u0013+8\u0015\u000f\u0019<a[\r\u001a';_\u0005Y-4J\b\u0004-(\u0017\u000f\u0019e/R\u0000\u0018/)\u0017\u0011\u0013&(S\u000f\u0011";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY$#]\b\u0018g([\u000f\u0011$%T\u0006[%?]\u0012Y8-I\u0012\u001f>)\u0017\r\u0019/%T";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "\u0014)(\u001a\u000f\u0019&/_A\u001f&lY\t\u0017$ _\u000f\u0011-";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY$#]\b\u0018g8S\f\u0013'9NN\u0005<#J";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY+#T\u000f\u0013+8\u0015\u0012\u0001!8Y\t\u0013,aN\u000e[) V\u000e\u0001-(";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY$#]\b\u0018g*[\b\u001a=>_N\u0018-4N>\u0015 \u0013^\u0000\u0002)cY\u000e\u001b%%N";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "\u0015'!\u0014\u0016\u001e)8I\u0000\u00068\u0013J\u0013\u0013.)H\u0004\u0018+)I";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "\u0018-4N>\u0015 \u0013^\u0000\u0002)";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "\u0015'\"T\u0004\u0015<%U\u000f)<$H\u0004\u0017,cV\u000e\u0011/)^>\u0010$-]N\u0007=%N";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "\u0015'\"T\u0004\u0015<%U\u000f)<$H\u0004\u0017,cV\u000e\u0011/)^>\u0010$-]N\u0015'\"T\u0004\u0015<)^";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "5'\"T\u0004\u0015<%U\u000f\" >_\u0000\u0012";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "7&(H\u000e\u001f,a\bOGzb\u000bV@";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "\u0015'\"T\u0004\u0015<%U\u000f)<$H\u0004\u0017,cV\u000e\u0011/)^>\u0010$-]N\u0012!?Y\u000e\u0018&)Y\u0015\u001f&+";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = ";\fy";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "\u0015'!\u0014\u0016\u001e)8I\u0000\u00068\u0013J\u0013\u0013.)H\u0004\u0018+)I";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "\u0018-4N>\u0015 \u0013^\u0000\u0002)";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "[8%T\u0006";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "[8%T\u0006";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY8%T\u0006\u0002!!_\u000e\u0003<c_\u0019\u0006!>_\u0005";
                    n = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY8%T\u0006\u0002!!_\u000e\u0003<c_\u0019\u0006!>_\u0005Y!+T\u000e\u0004-";
                    n = 51;
                    array = z2;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "\u0006!\"]A\u0002!!_\u000e\u0003<";
                    n = 52;
                    array = z2;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "!\u001a\ty7V";
                    n = 53;
                    array = z2;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    s = "\u0005f;R\u0000\u0002;-J\u0011X&)N";
                    n = 54;
                    array = z2;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    s = "!\u001b\tt%V";
                    n = 55;
                    array = z2;
                    continue;
                }
                case 55: {
                    array[n2] = intern;
                    n2 = 57;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY;)T\u0005\u0015 -T\u0006\u0013&9W\u0003\u0013:";
                    n = 56;
                    array = z2;
                    continue;
                }
                case 56: {
                    array[n2] = intern;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY$#]\b\u0018g8S\f\u0013'9N";
                    n = 57;
                    n2 = 58;
                    array = z2;
                    continue;
                }
                case 57: {
                    array[n2] = intern;
                    n2 = 59;
                    array = z2;
                    s = "\u0004-/U\u000f\u0018-/N \u0010<)H5\u001f%)U\u0014\u0002";
                    n = 58;
                    continue;
                }
                case 58: {
                    array[n2] = intern;
                    n2 = 60;
                    s = "\u0004-/U\u000f\u0018-/N \u0010<)H5\u001f%)U\u0014\u0002";
                    n = 59;
                    array = z2;
                    continue;
                }
                case 59: {
                    array[n2] = intern;
                    n2 = 61;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY.#H\u0002\u0013,\u0013^\b\u0005+#T\u000f\u0013+8\u0015\u0013\u0013)(_\u0013)<$H\u0004\u0017,cW\u0000\u0004#\u0013\\\b\u0018!?R\u0004\u0012";
                    n = 60;
                    array = z2;
                    continue;
                }
                case 60: {
                    array[n2] = intern;
                    n2 = 62;
                    s = "\u000e%<JN\u0015'\"T\u0004\u0015<%U\u000fY99S\u0015V,9H\b\u0018/l\\\u000e\u0004+)^A\u0012!?Y\u000e\u0018&)Y\u0015";
                    n = 61;
                    array = z2;
                    continue;
                }
                case 61: {
                    array[n2] = intern;
                    n2 = 63;
                    s = "\u0015'!\u0014\u0016\u001e)8I\u0000\u00068";
                    n = 62;
                    array = z2;
                    continue;
                }
                case 62: {
                    array[n2] = intern;
                    n2 = 64;
                    s = "\u0017$-H\f";
                    n = 63;
                    array = z2;
                    continue;
                }
                case 63: {
                    array[n2] = intern;
                    n2 = 65;
                    s = "\u0015'!\u0014\u0016\u001e)8I\u0000\u00068b[\r\u0017:!\u0014\":\u0001\tt5)\u0018\u0005t&)\u001c\u0005w$9\u001d\u0018";
                    n = 64;
                    array = z2;
                    continue;
                }
                case 64: {
                    break Label_1682;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public ae(final Context j, final ba g) {
        super(ae.z[43]);
        this.m = new Handler((Handler$Callback)new ah(this));
        this.b = false;
        this.c = false;
        this.q = new ar(3, ae.z[42]);
        this.l = new ar(3, ae.z[45]);
        this.k = new ar(3, ae.z[41]);
        this.f = new Random();
        this.g = g;
        this.j = j;
        this.e = ae.z[44];
        try {
            this.d = new bh(MessageDigest.getInstance(ae.z[46]));
        }
        catch (NoSuchAlgorithmException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    static ba a(final ae ae) {
        return ae.g;
    }
    
    private bw a(final Context context, final bz bz) {
        final _y y = new _y(bz.a(this.o), 1);
        final bk bk = new bk(new a2p(bz.b(this.o), 1), b7.b, b7.a);
        bc bc;
        if (App.aV >= 1) {
            bc = new bn((bc)bk, new q(), ae.z[6]);
        }
        else {
            bc = bk;
        }
        final String[] b = b7.b;
        final String[] a = b7.a;
        int n;
        if (l7.p()) {
            n = 1048571;
        }
        else {
            n = 0;
        }
        co co = new bx(y, b, a, n, null);
        if (App.aV >= 1) {
            co = new c3(co, new q(), ae.z[4]);
        }
        final bw bw = new bw(bc, co, this.d, this.l());
        bw.d(Build.DEVICE);
        bw.e(Build.MANUFACTURER);
        bw.f(Build.DISPLAY);
        bw.c(Build$VERSION.RELEASE);
        if (context.getSystemService(ae.z[5]) != null) {
            final x a2 = x.a(App.h.getNetworkOperator());
            bw.a(a2.a());
            bw.b(a2.b());
        }
        return bw;
    }
    
    private void a() {
        this.g();
    }
    
    private void a(final Message message) {
        final boolean a = com.whatsapp.messaging.e.a;
        this.i.a(Message.obtain(message));
        Label_0141: {
            switch (message.arg1) {
                case 32:
                case 33: {
                    this.c = true;
                    if (a) {
                        break Label_0141;
                    }
                    break;
                }
                case 37: {
                    this.h.b();
                    if (a) {
                        break Label_0141;
                    }
                    break;
                }
                case 60: {
                    final Bundle bundle = (Bundle)message.obj;
                    if (bundle == null || !bundle.getBoolean(ae.z[59], false)) {
                        break;
                    }
                    bundle.putBoolean(ae.z[60], false);
                    this.h.h();
                    if (a) {
                        break Label_0141;
                    }
                    break;
                }
                case 63: {
                    this.h.f();
                }
            }
        }
    }
    
    static void a(final ae ae, final Message message) {
        ae.b(message);
    }
    
    static void a(final ae ae, final y y) {
        ae.a(y);
    }
    
    static void a(final ae ae, final bf bf) {
        ae.a(bf);
    }
    
    static void a(final ae ae, final c6 c6) {
        ae.a(c6);
    }
    
    static void a(final ae ae, final String s, final byte[] array, final String s2, final boolean b, final boolean b2, final List list, final boolean b3) {
        ae.b(s, array, s2, b, b2, list, b3);
    }
    
    static void a(final ae ae, final boolean b) {
        ae.a(b);
    }
    
    private void a(final y i) {
        this.i = i;
        this.g.a(new bq(this));
    }
    
    private void a(final bf bf) {
        if (bf == this.n) {
            this.c(true);
        }
    }
    
    private void a(final c6 c6) {
        this.h.a(c6);
    }
    
    private void a(final String s, final byte[] array, final bw bw, final ax ax) {
        final com.whatsapp.messaging.bh bh = new com.whatsapp.messaging.bh(this);
        final bk bk = new bk(bj.a, new String[0]);
        bc bc;
        if (App.aV >= 1) {
            bc = new bn((b1)bk, new q(), ae.z[54]);
        }
        else {
            bc = bk;
        }
        final bx bx = new bx(bj.a, new String[0]);
        co co;
        if (App.aV >= 1) {
            co = new c3((com.whatsapp.protocol.bp)bx, new q(), ae.z[56]);
        }
        else {
            co = bx;
        }
        bw.a(this.n = new bf(bw, ae.z[55], this.e, s, App.q(this.j), array, ax, App.ab, ax, ax, dt.c, ax, bh, new jp(), (b1)bc, (com.whatsapp.protocol.bp)co));
        this.n.j(l7.c);
        this.n.a(true);
        this.n.d(true);
        this.n.b(true);
        this.n.f(true);
    }
    
    private void a(final String p0, final byte[] p1, final String p2, final boolean p3, final boolean p4, final List p5, final boolean p6) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/messaging/e.a:Z
        //     3: istore          8
        //     5: iload           7
        //     7: ifeq            24
        //    10: getstatic       com/whatsapp/messaging/ae.z:[Ljava/lang/String;
        //    13: bipush          21
        //    15: aaload         
        //    16: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    19: aload_0        
        //    20: iconst_0       
        //    21: putfield        com/whatsapp/messaging/ae.b:Z
        //    24: aload_0        
        //    25: getfield        com/whatsapp/messaging/ae.q:Lcom/whatsapp/messaging/ar;
        //    28: invokevirtual   com/whatsapp/messaging/ar.a:()Z
        //    31: istore          10
        //    33: iload           10
        //    35: ifeq            49
        //    38: return         
        //    39: astore          128
        //    41: aload           128
        //    43: athrow         
        //    44: astore          9
        //    46: aload           9
        //    48: athrow         
        //    49: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    52: invokevirtual   com/whatsapp/App.D:()Z
        //    55: ifeq            82
        //    58: getstatic       com/whatsapp/messaging/ae.z:[Ljava/lang/String;
        //    61: bipush          31
        //    63: aaload         
        //    64: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    67: aload_0        
        //    68: getfield        com/whatsapp/messaging/ae.g:Lcom/whatsapp/messaging/ba;
        //    71: invokeinterface com/whatsapp/messaging/ba.c:()V
        //    76: return         
        //    77: astore          11
        //    79: aload           11
        //    81: athrow         
        //    82: invokestatic    com/whatsapp/App.aq:()Z
        //    85: ifeq            103
        //    88: getstatic       com/whatsapp/messaging/ae.z:[Ljava/lang/String;
        //    91: bipush          15
        //    93: aaload         
        //    94: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    97: return         
        //    98: astore          12
        //   100: aload           12
        //   102: athrow         
        //   103: invokestatic    com/whatsapp/App.w:()Z
        //   106: ifeq            133
        //   109: getstatic       com/whatsapp/messaging/ae.z:[Ljava/lang/String;
        //   112: bipush          28
        //   114: aaload         
        //   115: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   118: aload_0        
        //   119: getfield        com/whatsapp/messaging/ae.g:Lcom/whatsapp/messaging/ba;
        //   122: invokeinterface com/whatsapp/messaging/ba.a:()V
        //   127: return         
        //   128: astore          13
        //   130: aload           13
        //   132: athrow         
        //   133: aload_0        
        //   134: getfield        com/whatsapp/messaging/ae.b:Z
        //   137: ifeq            265
        //   140: aload_0        
        //   141: getfield        com/whatsapp/messaging/ae.n:Lcom/whatsapp/protocol/bf;
        //   144: getfield        com/whatsapp/protocol/bf.j:I
        //   147: istore          120
        //   149: iload           120
        //   151: iconst_1       
        //   152: if_icmpne       230
        //   155: iconst_1       
        //   156: istore          121
        //   158: aload_0        
        //   159: iload           121
        //   161: putfield        com/whatsapp/messaging/ae.b:Z
        //   164: aload_0        
        //   165: getfield        com/whatsapp/messaging/ae.b:Z
        //   168: ifeq            256
        //   171: aload_0        
        //   172: getfield        com/whatsapp/messaging/ae.c:Z
        //   175: istore          126
        //   177: iload           126
        //   179: ifne            246
        //   182: getstatic       com/whatsapp/App.X:Lcom/whatsapp/o6;
        //   185: invokevirtual   com/whatsapp/o6.d:()Z
        //   188: istore          127
        //   190: iload           127
        //   192: ifne            246
        //   195: getstatic       com/whatsapp/messaging/ae.z:[Ljava/lang/String;
        //   198: bipush          33
        //   200: aaload         
        //   201: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   204: aload_0        
        //   205: getfield        com/whatsapp/messaging/ae.g:Lcom/whatsapp/messaging/ba;
        //   208: iconst_0       
        //   209: invokeinterface com/whatsapp/messaging/ba.a:(Z)V
        //   214: return         
        //   215: astore          124
        //   217: aload           124
        //   219: athrow         
        //   220: astore          14
        //   222: aload           14
        //   224: athrow         
        //   225: astore          15
        //   227: aload           15
        //   229: athrow         
        //   230: iconst_0       
        //   231: istore          121
        //   233: goto            158
        //   236: astore          122
        //   238: aload           122
        //   240: athrow         
        //   241: astore          123
        //   243: aload           123
        //   245: athrow         
        //   246: aload_0        
        //   247: iconst_0       
        //   248: putfield        com/whatsapp/messaging/ae.c:Z
        //   251: iload           8
        //   253: ifeq            265
        //   256: getstatic       com/whatsapp/messaging/ae.z:[Ljava/lang/String;
        //   259: bipush          37
        //   261: aaload         
        //   262: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   265: getstatic       com/whatsapp/messaging/ae.z:[Ljava/lang/String;
        //   268: bipush          12
        //   270: aaload         
        //   271: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   274: aload_0        
        //   275: getfield        com/whatsapp/messaging/ae.g:Lcom/whatsapp/messaging/ba;
        //   278: invokeinterface com/whatsapp/messaging/ba.b:()V
        //   283: aload_0        
        //   284: getfield        com/whatsapp/messaging/ae.o:Ljava/net/Socket;
        //   287: ifnull          308
        //   290: aload_0        
        //   291: getfield        com/whatsapp/messaging/ae.o:Ljava/net/Socket;
        //   294: invokevirtual   java/net/Socket.isClosed:()Z
        //   297: istore          119
        //   299: iload           119
        //   301: ifne            308
        //   304: aload_0        
        //   305: invokespecial   com/whatsapp/messaging/ae.b:()V
        //   308: iconst_1       
        //   309: istore          18
        //   311: invokestatic    java/lang/System.currentTimeMillis:()J
        //   314: lstore          19
        //   316: new             Lcom/whatsapp/messaging/bz;
        //   319: dup            
        //   320: aload_0        
        //   321: getfield        com/whatsapp/messaging/ae.j:Landroid/content/Context;
        //   324: invokestatic    com/whatsapp/messaging/d.b:(Landroid/content/Context;)Ljava/net/InetSocketAddress;
        //   327: aload_3        
        //   328: aload           6
        //   330: aload_0        
        //   331: getfield        com/whatsapp/messaging/ae.f:Ljava/util/Random;
        //   334: invokespecial   com/whatsapp/messaging/bz.<init>:(Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/util/List;Ljava/util/Random;)V
        //   337: astore          21
        //   339: aload           21
        //   341: invokevirtual   com/whatsapp/messaging/bz.a:()Z
        //   344: ifeq            977
        //   347: aload_0        
        //   348: getfield        com/whatsapp/messaging/ae.q:Lcom/whatsapp/messaging/ar;
        //   351: invokevirtual   com/whatsapp/messaging/ar.a:()Z
        //   354: ifne            977
        //   357: getstatic       com/whatsapp/messaging/ae.z:[Ljava/lang/String;
        //   360: bipush          17
        //   362: aaload         
        //   363: astore          48
        //   365: iconst_1       
        //   366: anewarray       Ljava/lang/Object;
        //   369: astore          49
        //   371: aload           49
        //   373: iconst_0       
        //   374: iload           18
        //   376: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   379: aastore        
        //   380: aload           48
        //   382: aconst_null    
        //   383: aload           49
        //   385: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        //   388: iload           18
        //   390: iconst_1       
        //   391: iadd           
        //   392: istore          24
        //   394: aload_0        
        //   395: aload           21
        //   397: sipush          30000
        //   400: invokevirtual   com/whatsapp/messaging/bz.a:(I)Ljava/net/Socket;
        //   403: putfield        com/whatsapp/messaging/ae.o:Ljava/net/Socket;
        //   406: aload_0        
        //   407: getfield        com/whatsapp/messaging/ae.o:Ljava/net/Socket;
        //   410: ldc_w           1020000
        //   413: invokevirtual   java/net/Socket.setSoTimeout:(I)V
        //   416: getstatic       com/whatsapp/messaging/ae.z:[Ljava/lang/String;
        //   419: bipush          27
        //   421: aaload         
        //   422: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   425: new             Lcom/whatsapp/messaging/b0;
        //   428: dup            
        //   429: aload_0        
        //   430: invokespecial   com/whatsapp/messaging/b0.<init>:(Lcom/whatsapp/messaging/ae;)V
        //   433: astore          51
        //   435: new             Lcom/whatsapp/messaging/ax;
        //   438: dup            
        //   439: aload           51
        //   441: invokespecial   com/whatsapp/messaging/ax.<init>:(Lcom/whatsapp/messaging/bc;)V
        //   444: astore          83
        //   446: aload_0        
        //   447: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   450: aload           21
        //   452: invokespecial   com/whatsapp/messaging/ae.a:(Landroid/content/Context;Lcom/whatsapp/messaging/bz;)Lcom/whatsapp/protocol/bw;
        //   455: astore          84
        //   457: aload_0        
        //   458: aload_1        
        //   459: aload_2        
        //   460: aload           84
        //   462: aload           83
        //   464: invokespecial   com/whatsapp/messaging/ae.a:(Ljava/lang/String;[BLcom/whatsapp/protocol/bw;Lcom/whatsapp/messaging/ax;)V
        //   467: getstatic       com/whatsapp/messaging/ae.z:[Ljava/lang/String;
        //   470: bipush          18
        //   472: aaload         
        //   473: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   476: getstatic       com/whatsapp/messaging/ae.z:[Ljava/lang/String;
        //   479: bipush          22
        //   481: aaload         
        //   482: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   485: aload_0        
        //   486: getfield        com/whatsapp/messaging/ae.m:Landroid/os/Handler;
        //   489: iconst_0       
        //   490: ldc2_w          30000
        //   493: invokevirtual   android/os/Handler.sendEmptyMessageDelayed:(IJ)Z
        //   496: pop            
        //   497: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   500: invokevirtual   com/whatsapp/vy.C:()Ljava/util/List;
        //   503: astore          86
        //   505: iload           5
        //   507: ifeq            538
        //   510: aload           86
        //   512: invokeinterface java/util/List.size:()I
        //   517: istore          118
        //   519: iload           118
        //   521: ifne            538
        //   524: aload_0        
        //   525: getfield        com/whatsapp/messaging/ae.n:Lcom/whatsapp/protocol/bf;
        //   528: iload           4
        //   530: invokevirtual   com/whatsapp/protocol/bf.c:(Z)V
        //   533: iload           8
        //   535: ifeq            561
        //   538: iload           5
        //   540: ifeq            552
        //   543: getstatic       com/whatsapp/messaging/ae.z:[Ljava/lang/String;
        //   546: bipush          34
        //   548: aaload         
        //   549: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   552: aload_0        
        //   553: getfield        com/whatsapp/messaging/ae.n:Lcom/whatsapp/protocol/bf;
        //   556: iload           4
        //   558: invokevirtual   com/whatsapp/protocol/bf.h:(Z)V
        //   561: aload_0        
        //   562: aload           84
        //   564: getfield        com/whatsapp/protocol/bw.l:[B
        //   567: invokespecial   com/whatsapp/messaging/ae.a:([B)V
        //   570: getstatic       com/whatsapp/messaging/ae.z:[Ljava/lang/String;
        //   573: bipush          36
        //   575: aaload         
        //   576: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   579: aload_0        
        //   580: getfield        com/whatsapp/messaging/ae.m:Landroid/os/Handler;
        //   583: iconst_0       
        //   584: invokevirtual   android/os/Handler.removeMessages:(I)V
        //   587: invokestatic    com/whatsapp/App.r:()Z
        //   590: ifeq            609
        //   593: getstatic       com/whatsapp/messaging/ae.z:[Ljava/lang/String;
        //   596: bipush          32
        //   598: aaload         
        //   599: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   602: aload_0        
        //   603: getfield        com/whatsapp/messaging/ae.n:Lcom/whatsapp/protocol/bf;
        //   606: invokevirtual   com/whatsapp/protocol/bf.f:()V
        //   609: getstatic       com/whatsapp/messaging/ae.z:[Ljava/lang/String;
        //   612: bipush          24
        //   614: aaload         
        //   615: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   618: aload_0        
        //   619: getfield        com/whatsapp/messaging/ae.n:Lcom/whatsapp/protocol/bf;
        //   622: invokevirtual   com/whatsapp/protocol/bf.c:()V
        //   625: aload_0        
        //   626: getfield        com/whatsapp/messaging/ae.n:Lcom/whatsapp/protocol/bf;
        //   629: invokevirtual   com/whatsapp/protocol/bf.j:()Ljava/lang/Integer;
        //   632: ifnull          666
        //   635: aload_0        
        //   636: getfield        com/whatsapp/messaging/ae.n:Lcom/whatsapp/protocol/bf;
        //   639: invokevirtual   com/whatsapp/protocol/bf.j:()Ljava/lang/Integer;
        //   642: invokevirtual   java/lang/Integer.intValue:()I
        //   645: istore          112
        //   647: getstatic       com/whatsapp/ym.f:I
        //   650: istore          113
        //   652: iload           112
        //   654: iload           113
        //   656: if_icmpeq       666
        //   659: aload_0        
        //   660: getfield        com/whatsapp/messaging/ae.n:Lcom/whatsapp/protocol/bf;
        //   663: invokevirtual   com/whatsapp/protocol/bf.l:()V
        //   666: new             Lcom/whatsapp/messaging/a8;
        //   669: dup            
        //   670: aload           51
        //   672: aload_0        
        //   673: getfield        com/whatsapp/messaging/ae.n:Lcom/whatsapp/protocol/bf;
        //   676: invokespecial   com/whatsapp/messaging/a8.<init>:(Lcom/whatsapp/messaging/bc;Lcom/whatsapp/protocol/bf;)V
        //   679: astore          91
        //   681: aload           91
        //   683: invokevirtual   com/whatsapp/messaging/a8.start:()V
        //   686: aload_0        
        //   687: getfield        com/whatsapp/messaging/ae.q:Lcom/whatsapp/messaging/ar;
        //   690: iconst_1       
        //   691: invokevirtual   com/whatsapp/messaging/ar.a:(Z)V
        //   694: aload           21
        //   696: invokevirtual   com/whatsapp/messaging/bz.c:()V
        //   699: aload_0        
        //   700: aload           51
        //   702: putfield        com/whatsapp/messaging/ae.r:Lcom/whatsapp/messaging/b0;
        //   705: iload           5
        //   707: ifeq            758
        //   710: aload           86
        //   712: invokeinterface java/util/List.size:()I
        //   717: istore          94
        //   719: iload           94
        //   721: ifle            758
        //   724: aload_0        
        //   725: getfield        com/whatsapp/messaging/ae.i:Lcom/whatsapp/messaging/y;
        //   728: aload           86
        //   730: invokestatic    com/whatsapp/messaging/e.a:(Ljava/util/List;)Landroid/os/Message;
        //   733: invokeinterface com/whatsapp/messaging/y.a:(Landroid/os/Message;)V
        //   738: aload_0        
        //   739: getfield        com/whatsapp/messaging/ae.i:Lcom/whatsapp/messaging/y;
        //   742: iconst_1       
        //   743: invokestatic    com/whatsapp/messaging/e.a:(Z)Landroid/os/Message;
        //   746: invokeinterface com/whatsapp/messaging/y.a:(Landroid/os/Message;)V
        //   751: aload_0        
        //   752: getfield        com/whatsapp/messaging/ae.h:Lcom/whatsapp/messaging/bp;
        //   755: invokevirtual   com/whatsapp/messaging/bp.b:()V
        //   758: invokestatic    com/whatsapp/adc.a:()Z
        //   761: ifeq            786
        //   764: getstatic       com/whatsapp/App.j:Z
        //   767: istore          111
        //   769: iload           111
        //   771: ifeq            786
        //   774: aload_0        
        //   775: getfield        com/whatsapp/messaging/ae.i:Lcom/whatsapp/messaging/y;
        //   778: invokestatic    com/whatsapp/messaging/e.q:()Landroid/os/Message;
        //   781: invokeinterface com/whatsapp/messaging/y.a:(Landroid/os/Message;)V
        //   786: invokestatic    com/whatsapp/ChangeNumber.g:()Z
        //   789: istore          97
        //   791: iload           97
        //   793: ifeq            805
        //   796: iload           4
        //   798: ifeq            805
        //   801: aload_0        
        //   802: invokespecial   com/whatsapp/messaging/ae.m:()V
        //   805: iload           97
        //   807: ifne            1870
        //   810: aload_0        
        //   811: getfield        com/whatsapp/messaging/ae.n:Lcom/whatsapp/protocol/bf;
        //   814: getfield        com/whatsapp/protocol/bf.j:I
        //   817: istore          109
        //   819: iload           109
        //   821: iconst_1       
        //   822: if_icmpne       1870
        //   825: iconst_1       
        //   826: istore          98
        //   828: aload_0        
        //   829: iload           98
        //   831: putfield        com/whatsapp/messaging/ae.b:Z
        //   834: aload_0        
        //   835: getfield        com/whatsapp/messaging/ae.g:Lcom/whatsapp/messaging/ba;
        //   838: aload_0        
        //   839: getfield        com/whatsapp/messaging/ae.n:Lcom/whatsapp/protocol/bf;
        //   842: getfield        com/whatsapp/protocol/bf.e:I
        //   845: aload_0        
        //   846: getfield        com/whatsapp/messaging/ae.n:Lcom/whatsapp/protocol/bf;
        //   849: getfield        com/whatsapp/protocol/bf.H:J
        //   852: invokestatic    com/whatsapp/messaging/e.b:(IJ)Landroid/os/Message;
        //   855: invokeinterface com/whatsapp/messaging/ba.a:(Landroid/os/Message;)V
        //   860: ldc2_w          1000
        //   863: aload_0        
        //   864: getfield        com/whatsapp/messaging/ae.n:Lcom/whatsapp/protocol/bf;
        //   867: getfield        com/whatsapp/protocol/bf.h:J
        //   870: lmul           
        //   871: ldc2_w          1000
        //   874: aload_0        
        //   875: getfield        com/whatsapp/messaging/ae.n:Lcom/whatsapp/protocol/bf;
        //   878: getfield        com/whatsapp/protocol/bf.q:J
        //   881: lmul           
        //   882: invokestatic    com/whatsapp/App.a:(JJ)V
        //   885: aload_0        
        //   886: invokespecial   com/whatsapp/messaging/ae.h:()V
        //   889: aload_0        
        //   890: getfield        com/whatsapp/messaging/ae.q:Lcom/whatsapp/messaging/ar;
        //   893: invokevirtual   com/whatsapp/messaging/ar.a:()Z
        //   896: istore          99
        //   898: iload           99
        //   900: ifne            968
        //   903: aload           21
        //   905: invokevirtual   com/whatsapp/messaging/bz.f:()V
        //   908: aload_0        
        //   909: getfield        com/whatsapp/messaging/ae.o:Ljava/net/Socket;
        //   912: ifnull          938
        //   915: aload_0        
        //   916: getfield        com/whatsapp/messaging/ae.o:Ljava/net/Socket;
        //   919: invokevirtual   java/net/Socket.isClosed:()Z
        //   922: istore          106
        //   924: iload           106
        //   926: ifne            938
        //   929: aload_0        
        //   930: invokespecial   com/whatsapp/messaging/ae.b:()V
        //   933: iload           8
        //   935: ifeq            958
        //   938: aload_0        
        //   939: getfield        com/whatsapp/messaging/ae.o:Ljava/net/Socket;
        //   942: astore          104
        //   944: aload           104
        //   946: ifnull          958
        //   949: getstatic       com/whatsapp/messaging/ae.z:[Ljava/lang/String;
        //   952: bipush          14
        //   954: aaload         
        //   955: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   958: aload           51
        //   960: ifnull          968
        //   963: aload           51
        //   965: invokevirtual   com/whatsapp/messaging/b0.d:()V
        //   968: iload           8
        //   970: ifeq            2075
        //   973: iload           24
        //   975: istore          18
        //   977: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   980: aload_0        
        //   981: getfield        com/whatsapp/messaging/ae.q:Lcom/whatsapp/messaging/ar;
        //   984: invokevirtual   com/whatsapp/messaging/ar.a:()Z
        //   987: iload           18
        //   989: iconst_1       
        //   990: isub           
        //   991: invokestatic    java/lang/System.currentTimeMillis:()J
        //   994: lload           19
        //   996: lsub           
        //   997: invokestatic    com/whatsapp/aam.a:(Landroid/content/Context;ZIJ)V
        //  1000: aload_0        
        //  1001: getfield        com/whatsapp/messaging/ae.q:Lcom/whatsapp/messaging/ar;
        //  1004: invokevirtual   com/whatsapp/messaging/ar.a:()Z
        //  1007: ifeq            1991
        //  1010: aload_0        
        //  1011: getfield        com/whatsapp/messaging/ae.g:Lcom/whatsapp/messaging/ba;
        //  1014: invokeinterface com/whatsapp/messaging/ba.d:()V
        //  1019: aload_0        
        //  1020: getfield        com/whatsapp/messaging/ae.i:Lcom/whatsapp/messaging/y;
        //  1023: aload_0        
        //  1024: getfield        com/whatsapp/messaging/ae.n:Lcom/whatsapp/protocol/bf;
        //  1027: invokeinterface com/whatsapp/messaging/y.a:(Lcom/whatsapp/protocol/bf;)V
        //  1032: getstatic       com/whatsapp/App.j:Z
        //  1035: istore          43
        //  1037: iload           43
        //  1039: ifeq            38
        //  1042: invokestatic    com/whatsapp/al5.L:()Z
        //  1045: istore          44
        //  1047: iload           44
        //  1049: ifeq            38
        //  1052: invokestatic    com/whatsapp/al5.P:()[B
        //  1055: astore          45
        //  1057: aload           45
        //  1059: invokestatic    com/whatsapp/al5.a:([B)[B
        //  1062: astore          46
        //  1064: aload           46
        //  1066: ifnull          38
        //  1069: aload_0        
        //  1070: getfield        com/whatsapp/messaging/ae.i:Lcom/whatsapp/messaging/y;
        //  1073: aload           46
        //  1075: aload           45
        //  1077: invokestatic    com/whatsapp/messaging/e.b:([B[B)Landroid/os/Message;
        //  1080: invokeinterface com/whatsapp/messaging/y.a:(Landroid/os/Message;)V
        //  1085: return         
        //  1086: astore          47
        //  1088: aload           47
        //  1090: athrow         
        //  1091: astore          125
        //  1093: aload           125
        //  1095: athrow         
        //  1096: astore          16
        //  1098: aload           16
        //  1100: athrow         
        //  1101: astore          17
        //  1103: aload           17
        //  1105: athrow         
        //  1106: astore          115
        //  1108: aload           115
        //  1110: athrow         
        //  1111: astore          116
        //  1113: aload           116
        //  1115: athrow         
        //  1116: astore          117
        //  1118: aload           117
        //  1120: athrow         
        //  1121: astore          114
        //  1123: aload           114
        //  1125: athrow         
        //  1126: astore          87
        //  1128: getstatic       com/whatsapp/messaging/ae.z:[Ljava/lang/String;
        //  1131: bipush          13
        //  1133: aaload         
        //  1134: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1137: aload_0        
        //  1138: getfield        com/whatsapp/messaging/ae.m:Landroid/os/Handler;
        //  1141: iconst_0       
        //  1142: invokevirtual   android/os/Handler.removeMessages:(I)V
        //  1145: aload           87
        //  1147: athrow         
        //  1148: astore          50
        //  1150: aload           50
        //  1152: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //  1155: astore          62
        //  1157: getstatic       com/whatsapp/messaging/ae.z:[Ljava/lang/String;
        //  1160: bipush          35
        //  1162: aaload         
        //  1163: aload           62
        //  1165: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1168: ifne            1189
        //  1171: getstatic       com/whatsapp/messaging/ae.z:[Ljava/lang/String;
        //  1174: bipush          16
        //  1176: aaload         
        //  1177: aload           62
        //  1179: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1182: istore          73
        //  1184: iload           73
        //  1186: ifeq            1194
        //  1189: aload_0        
        //  1190: aconst_null    
        //  1191: invokespecial   com/whatsapp/messaging/ae.a:([B)V
        //  1194: new             Ljava/lang/StringBuilder;
        //  1197: dup            
        //  1198: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1201: getstatic       com/whatsapp/messaging/ae.z:[Ljava/lang/String;
        //  1204: bipush          25
        //  1206: aaload         
        //  1207: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1210: aload           50
        //  1212: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //  1215: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1218: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1221: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1224: aload_0        
        //  1225: getfield        com/whatsapp/messaging/ae.q:Lcom/whatsapp/messaging/ar;
        //  1228: invokevirtual   com/whatsapp/messaging/ar.a:()Z
        //  1231: istore          65
        //  1233: iload           65
        //  1235: ifne            968
        //  1238: aload           21
        //  1240: invokevirtual   com/whatsapp/messaging/bz.f:()V
        //  1243: aload_0        
        //  1244: getfield        com/whatsapp/messaging/ae.o:Ljava/net/Socket;
        //  1247: ifnull          1273
        //  1250: aload_0        
        //  1251: getfield        com/whatsapp/messaging/ae.o:Ljava/net/Socket;
        //  1254: invokevirtual   java/net/Socket.isClosed:()Z
        //  1257: istore          72
        //  1259: iload           72
        //  1261: ifne            1273
        //  1264: aload_0        
        //  1265: invokespecial   com/whatsapp/messaging/ae.b:()V
        //  1268: iload           8
        //  1270: ifeq            1293
        //  1273: aload_0        
        //  1274: getfield        com/whatsapp/messaging/ae.o:Ljava/net/Socket;
        //  1277: astore          70
        //  1279: aload           70
        //  1281: ifnull          1293
        //  1284: getstatic       com/whatsapp/messaging/ae.z:[Ljava/lang/String;
        //  1287: bipush          19
        //  1289: aaload         
        //  1290: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1293: aload           51
        //  1295: ifnull          968
        //  1298: aload           51
        //  1300: invokevirtual   com/whatsapp/messaging/b0.d:()V
        //  1303: goto            968
        //  1306: astore          71
        //  1308: aload           71
        //  1310: athrow         
        //  1311: astore          22
        //  1313: iload           24
        //  1315: istore          18
        //  1317: new             Ljava/lang/StringBuilder;
        //  1320: dup            
        //  1321: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1324: getstatic       com/whatsapp/messaging/ae.z:[Ljava/lang/String;
        //  1327: bipush          30
        //  1329: aaload         
        //  1330: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1333: aload           22
        //  1335: getfield        com/whatsapp/protocol/a4.a:I
        //  1338: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1341: getstatic       com/whatsapp/messaging/ae.z:[Ljava/lang/String;
        //  1344: bipush          20
        //  1346: aaload         
        //  1347: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1350: aload           22
        //  1352: getfield        com/whatsapp/protocol/a4.b:I
        //  1355: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1358: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1361: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1364: aload_0        
        //  1365: getfield        com/whatsapp/messaging/ae.g:Lcom/whatsapp/messaging/ba;
        //  1368: aload           22
        //  1370: invokeinterface com/whatsapp/messaging/ba.a:(Lcom/whatsapp/protocol/a4;)V
        //  1375: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  1378: aload_0        
        //  1379: getfield        com/whatsapp/messaging/ae.q:Lcom/whatsapp/messaging/ar;
        //  1382: invokevirtual   com/whatsapp/messaging/ar.a:()Z
        //  1385: iload           18
        //  1387: iconst_1       
        //  1388: isub           
        //  1389: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1392: lload           19
        //  1394: lsub           
        //  1395: invokestatic    com/whatsapp/aam.a:(Landroid/content/Context;ZIJ)V
        //  1398: aload_0        
        //  1399: getfield        com/whatsapp/messaging/ae.q:Lcom/whatsapp/messaging/ar;
        //  1402: invokevirtual   com/whatsapp/messaging/ar.a:()Z
        //  1405: ifeq            38
        //  1408: aload_0        
        //  1409: getfield        com/whatsapp/messaging/ae.g:Lcom/whatsapp/messaging/ba;
        //  1412: invokeinterface com/whatsapp/messaging/ba.d:()V
        //  1417: aload_0        
        //  1418: getfield        com/whatsapp/messaging/ae.i:Lcom/whatsapp/messaging/y;
        //  1421: aload_0        
        //  1422: getfield        com/whatsapp/messaging/ae.n:Lcom/whatsapp/protocol/bf;
        //  1425: invokeinterface com/whatsapp/messaging/y.a:(Lcom/whatsapp/protocol/bf;)V
        //  1430: getstatic       com/whatsapp/App.j:Z
        //  1433: istore          35
        //  1435: iload           35
        //  1437: ifeq            38
        //  1440: invokestatic    com/whatsapp/al5.L:()Z
        //  1443: istore          36
        //  1445: iload           36
        //  1447: ifeq            38
        //  1450: invokestatic    com/whatsapp/al5.P:()[B
        //  1453: astore          37
        //  1455: aload           37
        //  1457: invokestatic    com/whatsapp/al5.a:([B)[B
        //  1460: astore          38
        //  1462: aload           38
        //  1464: ifnull          38
        //  1467: aload_0        
        //  1468: getfield        com/whatsapp/messaging/ae.i:Lcom/whatsapp/messaging/y;
        //  1471: aload           38
        //  1473: aload           37
        //  1475: invokestatic    com/whatsapp/messaging/e.b:([B[B)Landroid/os/Message;
        //  1478: invokeinterface com/whatsapp/messaging/y.a:(Landroid/os/Message;)V
        //  1483: return         
        //  1484: astore          39
        //  1486: aload           39
        //  1488: athrow         
        //  1489: astore          88
        //  1491: aload           88
        //  1493: athrow         
        //  1494: astore          74
        //  1496: new             Ljava/lang/StringBuilder;
        //  1499: dup            
        //  1500: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1503: getstatic       com/whatsapp/messaging/ae.z:[Ljava/lang/String;
        //  1506: bipush          23
        //  1508: aaload         
        //  1509: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1512: aload           74
        //  1514: invokevirtual   com/whatsapp/protocol/cz.toString:()Ljava/lang/String;
        //  1517: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1520: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1523: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1526: aload_0        
        //  1527: getfield        com/whatsapp/messaging/ae.q:Lcom/whatsapp/messaging/ar;
        //  1530: invokevirtual   com/whatsapp/messaging/ar.a:()Z
        //  1533: istore          75
        //  1535: iload           75
        //  1537: ifne            968
        //  1540: aload           21
        //  1542: invokevirtual   com/whatsapp/messaging/bz.f:()V
        //  1545: aload_0        
        //  1546: getfield        com/whatsapp/messaging/ae.o:Ljava/net/Socket;
        //  1549: ifnull          1575
        //  1552: aload_0        
        //  1553: getfield        com/whatsapp/messaging/ae.o:Ljava/net/Socket;
        //  1556: invokevirtual   java/net/Socket.isClosed:()Z
        //  1559: istore          82
        //  1561: iload           82
        //  1563: ifne            1575
        //  1566: aload_0        
        //  1567: invokespecial   com/whatsapp/messaging/ae.b:()V
        //  1570: iload           8
        //  1572: ifeq            1595
        //  1575: aload_0        
        //  1576: getfield        com/whatsapp/messaging/ae.o:Ljava/net/Socket;
        //  1579: astore          80
        //  1581: aload           80
        //  1583: ifnull          1595
        //  1586: getstatic       com/whatsapp/messaging/ae.z:[Ljava/lang/String;
        //  1589: bipush          26
        //  1591: aaload         
        //  1592: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1595: aload           51
        //  1597: ifnull          968
        //  1600: aload           51
        //  1602: invokevirtual   com/whatsapp/messaging/b0.d:()V
        //  1605: goto            968
        //  1608: astore          81
        //  1610: aload           81
        //  1612: athrow         
        //  1613: astore          23
        //  1615: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  1618: aload_0        
        //  1619: getfield        com/whatsapp/messaging/ae.q:Lcom/whatsapp/messaging/ar;
        //  1622: invokevirtual   com/whatsapp/messaging/ar.a:()Z
        //  1625: iload           24
        //  1627: iconst_1       
        //  1628: isub           
        //  1629: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1632: lload           19
        //  1634: lsub           
        //  1635: invokestatic    com/whatsapp/aam.a:(Landroid/content/Context;ZIJ)V
        //  1638: aload_0        
        //  1639: getfield        com/whatsapp/messaging/ae.q:Lcom/whatsapp/messaging/ar;
        //  1642: invokevirtual   com/whatsapp/messaging/ar.a:()Z
        //  1645: istore          27
        //  1647: iload           27
        //  1649: ifeq            1728
        //  1652: aload_0        
        //  1653: getfield        com/whatsapp/messaging/ae.g:Lcom/whatsapp/messaging/ba;
        //  1656: invokeinterface com/whatsapp/messaging/ba.d:()V
        //  1661: aload_0        
        //  1662: getfield        com/whatsapp/messaging/ae.i:Lcom/whatsapp/messaging/y;
        //  1665: aload_0        
        //  1666: getfield        com/whatsapp/messaging/ae.n:Lcom/whatsapp/protocol/bf;
        //  1669: invokeinterface com/whatsapp/messaging/y.a:(Lcom/whatsapp/protocol/bf;)V
        //  1674: getstatic       com/whatsapp/App.j:Z
        //  1677: ifeq            1738
        //  1680: invokestatic    com/whatsapp/al5.L:()Z
        //  1683: istore          29
        //  1685: iload           29
        //  1687: ifeq            1738
        //  1690: invokestatic    com/whatsapp/al5.P:()[B
        //  1693: astore          30
        //  1695: aload           30
        //  1697: invokestatic    com/whatsapp/al5.a:([B)[B
        //  1700: astore          31
        //  1702: aload           31
        //  1704: ifnull          1723
        //  1707: aload_0        
        //  1708: getfield        com/whatsapp/messaging/ae.i:Lcom/whatsapp/messaging/y;
        //  1711: aload           31
        //  1713: aload           30
        //  1715: invokestatic    com/whatsapp/messaging/e.b:([B[B)Landroid/os/Message;
        //  1718: invokeinterface com/whatsapp/messaging/y.a:(Landroid/os/Message;)V
        //  1723: iload           8
        //  1725: ifeq            1738
        //  1728: aload_0        
        //  1729: getfield        com/whatsapp/messaging/ae.g:Lcom/whatsapp/messaging/ba;
        //  1732: iconst_1       
        //  1733: invokeinterface com/whatsapp/messaging/ba.a:(Z)V
        //  1738: aload           23
        //  1740: athrow         
        //  1741: astore          89
        //  1743: aload           89
        //  1745: athrow         
        //  1746: astore          90
        //  1748: aload           90
        //  1750: athrow         
        //  1751: astore          52
        //  1753: aload_0        
        //  1754: getfield        com/whatsapp/messaging/ae.q:Lcom/whatsapp/messaging/ar;
        //  1757: invokevirtual   com/whatsapp/messaging/ar.a:()Z
        //  1760: ifne            1832
        //  1763: aload           21
        //  1765: invokevirtual   com/whatsapp/messaging/bz.f:()V
        //  1768: aload_0        
        //  1769: getfield        com/whatsapp/messaging/ae.o:Ljava/net/Socket;
        //  1772: astore          58
        //  1774: aload           58
        //  1776: ifnull          1802
        //  1779: aload_0        
        //  1780: getfield        com/whatsapp/messaging/ae.o:Ljava/net/Socket;
        //  1783: invokevirtual   java/net/Socket.isClosed:()Z
        //  1786: istore          61
        //  1788: iload           61
        //  1790: ifne            1802
        //  1793: aload_0        
        //  1794: invokespecial   com/whatsapp/messaging/ae.b:()V
        //  1797: iload           8
        //  1799: ifeq            1822
        //  1802: aload_0        
        //  1803: getfield        com/whatsapp/messaging/ae.o:Ljava/net/Socket;
        //  1806: astore          59
        //  1808: aload           59
        //  1810: ifnull          1822
        //  1813: getstatic       com/whatsapp/messaging/ae.z:[Ljava/lang/String;
        //  1816: bipush          29
        //  1818: aaload         
        //  1819: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1822: aload           51
        //  1824: ifnull          1832
        //  1827: aload           51
        //  1829: invokevirtual   com/whatsapp/messaging/b0.d:()V
        //  1832: aload           52
        //  1834: athrow         
        //  1835: astore          92
        //  1837: aload           92
        //  1839: athrow         
        //  1840: astore          93
        //  1842: aload           93
        //  1844: athrow         
        //  1845: astore          95
        //  1847: aload           95
        //  1849: athrow         
        //  1850: astore          96
        //  1852: aload           96
        //  1854: athrow         
        //  1855: astore          110
        //  1857: aload           110
        //  1859: athrow         
        //  1860: astore          107
        //  1862: aload           107
        //  1864: athrow         
        //  1865: astore          108
        //  1867: aload           108
        //  1869: athrow         
        //  1870: iconst_0       
        //  1871: istore          98
        //  1873: goto            828
        //  1876: astore          100
        //  1878: aload           100
        //  1880: athrow         
        //  1881: astore          101
        //  1883: aload           101
        //  1885: athrow         
        //  1886: astore          102
        //  1888: aload           102
        //  1890: athrow         
        //  1891: astore          103
        //  1893: aload           103
        //  1895: athrow         
        //  1896: astore          105
        //  1898: aload           105
        //  1900: athrow         
        //  1901: astore          63
        //  1903: aload           63
        //  1905: athrow         
        //  1906: astore          64
        //  1908: aload           64
        //  1910: athrow         
        //  1911: astore          66
        //  1913: aload           66
        //  1915: athrow         
        //  1916: astore          67
        //  1918: aload           67
        //  1920: athrow         
        //  1921: astore          68
        //  1923: aload           68
        //  1925: athrow         
        //  1926: astore          69
        //  1928: aload           69
        //  1930: athrow         
        //  1931: astore          76
        //  1933: aload           76
        //  1935: athrow         
        //  1936: astore          77
        //  1938: aload           77
        //  1940: athrow         
        //  1941: astore          78
        //  1943: aload           78
        //  1945: athrow         
        //  1946: astore          79
        //  1948: aload           79
        //  1950: athrow         
        //  1951: astore          53
        //  1953: aload           53
        //  1955: athrow         
        //  1956: astore          54
        //  1958: aload           54
        //  1960: athrow         
        //  1961: astore          55
        //  1963: aload           55
        //  1965: athrow         
        //  1966: astore          56
        //  1968: aload           56
        //  1970: athrow         
        //  1971: astore          57
        //  1973: aload           57
        //  1975: athrow         
        //  1976: astore          60
        //  1978: aload           60
        //  1980: athrow         
        //  1981: astore          40
        //  1983: aload           40
        //  1985: athrow         
        //  1986: astore          41
        //  1988: aload           41
        //  1990: athrow         
        //  1991: aload_0        
        //  1992: getfield        com/whatsapp/messaging/ae.g:Lcom/whatsapp/messaging/ba;
        //  1995: iconst_1       
        //  1996: invokeinterface com/whatsapp/messaging/ba.a:(Z)V
        //  2001: return         
        //  2002: astore          42
        //  2004: aload           42
        //  2006: athrow         
        //  2007: astore          33
        //  2009: aload           33
        //  2011: athrow         
        //  2012: astore          34
        //  2014: aload           34
        //  2016: athrow         
        //  2017: astore          25
        //  2019: aload           25
        //  2021: athrow         
        //  2022: astore          26
        //  2024: aload           26
        //  2026: athrow         
        //  2027: astore          32
        //  2029: aload           32
        //  2031: athrow         
        //  2032: astore          28
        //  2034: aload           28
        //  2036: athrow         
        //  2037: astore          23
        //  2039: iload           18
        //  2041: istore          24
        //  2043: goto            1615
        //  2046: astore          22
        //  2048: goto            1317
        //  2051: astore          52
        //  2053: aconst_null    
        //  2054: astore          51
        //  2056: goto            1753
        //  2059: astore          74
        //  2061: aconst_null    
        //  2062: astore          51
        //  2064: goto            1496
        //  2067: astore          50
        //  2069: aconst_null    
        //  2070: astore          51
        //  2072: goto            1150
        //  2075: iload           24
        //  2077: istore          18
        //  2079: goto            339
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  10     24     39     44     Ljava/io/IOException;
        //  24     33     44     49     Ljava/io/IOException;
        //  49     76     77     82     Ljava/io/IOException;
        //  82     97     98     103    Ljava/io/IOException;
        //  103    127    128    133    Ljava/io/IOException;
        //  133    149    220    230    Ljava/io/IOException;
        //  158    177    236    241    Ljava/io/IOException;
        //  182    190    241    246    Ljava/io/IOException;
        //  195    214    215    220    Ljava/io/IOException;
        //  222    225    225    230    Ljava/io/IOException;
        //  238    241    241    246    Ljava/io/IOException;
        //  243    246    215    220    Ljava/io/IOException;
        //  246    251    1091   1096   Ljava/io/IOException;
        //  256    265    1091   1096   Ljava/io/IOException;
        //  265    299    1096   1101   Ljava/io/IOException;
        //  304    308    1101   1106   Ljava/io/IOException;
        //  316    339    2046   2051   Lcom/whatsapp/protocol/a4;
        //  316    339    2037   2046   Any
        //  339    388    2046   2051   Lcom/whatsapp/protocol/a4;
        //  339    388    2037   2046   Any
        //  394    435    2067   2075   Ljava/io/IOException;
        //  394    435    2059   2067   Lcom/whatsapp/protocol/cz;
        //  394    435    2051   2059   Any
        //  435    505    1148   1150   Ljava/io/IOException;
        //  435    505    1494   1496   Lcom/whatsapp/protocol/cz;
        //  435    505    1751   1753   Any
        //  510    519    1106   1111   Ljava/io/IOException;
        //  510    519    1126   1148   Any
        //  524    533    1111   1121   Ljava/io/IOException;
        //  524    533    1126   1148   Any
        //  543    552    1121   1126   Ljava/io/IOException;
        //  543    552    1126   1148   Any
        //  552    561    1126   1148   Any
        //  561    570    1126   1148   Any
        //  570    587    1148   1150   Ljava/io/IOException;
        //  570    587    1494   1496   Lcom/whatsapp/protocol/cz;
        //  570    587    1751   1753   Any
        //  587    609    1489   1494   Ljava/io/IOException;
        //  587    609    1494   1496   Lcom/whatsapp/protocol/cz;
        //  587    609    1751   1753   Any
        //  609    652    1741   1746   Ljava/io/IOException;
        //  609    652    1494   1496   Lcom/whatsapp/protocol/cz;
        //  609    652    1751   1753   Any
        //  659    666    1746   1751   Ljava/io/IOException;
        //  659    666    1494   1496   Lcom/whatsapp/protocol/cz;
        //  659    666    1751   1753   Any
        //  666    681    1148   1150   Ljava/io/IOException;
        //  666    681    1494   1496   Lcom/whatsapp/protocol/cz;
        //  666    681    1751   1753   Any
        //  681    705    1835   1840   Ljava/io/IOException;
        //  681    705    1494   1496   Lcom/whatsapp/protocol/cz;
        //  681    705    1751   1753   Any
        //  710    719    1835   1840   Ljava/io/IOException;
        //  710    719    1494   1496   Lcom/whatsapp/protocol/cz;
        //  710    719    1751   1753   Any
        //  724    758    1840   1845   Ljava/io/IOException;
        //  724    758    1494   1496   Lcom/whatsapp/protocol/cz;
        //  724    758    1751   1753   Any
        //  758    769    1845   1850   Ljava/io/IOException;
        //  758    769    1494   1496   Lcom/whatsapp/protocol/cz;
        //  758    769    1751   1753   Any
        //  774    786    1850   1855   Ljava/io/IOException;
        //  774    786    1494   1496   Lcom/whatsapp/protocol/cz;
        //  774    786    1751   1753   Any
        //  786    791    1148   1150   Ljava/io/IOException;
        //  786    791    1494   1496   Lcom/whatsapp/protocol/cz;
        //  786    791    1751   1753   Any
        //  801    805    1855   1860   Ljava/io/IOException;
        //  801    805    1494   1496   Lcom/whatsapp/protocol/cz;
        //  801    805    1751   1753   Any
        //  810    819    1860   1870   Ljava/io/IOException;
        //  810    819    1494   1496   Lcom/whatsapp/protocol/cz;
        //  810    819    1751   1753   Any
        //  828    889    1148   1150   Ljava/io/IOException;
        //  828    889    1494   1496   Lcom/whatsapp/protocol/cz;
        //  828    889    1751   1753   Any
        //  889    898    1311   1317   Lcom/whatsapp/protocol/a4;
        //  889    898    1613   1615   Any
        //  903    924    1876   1881   Ljava/io/IOException;
        //  903    924    1311   1317   Lcom/whatsapp/protocol/a4;
        //  903    924    1613   1615   Any
        //  929    933    1881   1886   Ljava/io/IOException;
        //  929    933    1311   1317   Lcom/whatsapp/protocol/a4;
        //  929    933    1613   1615   Any
        //  938    944    1886   1891   Ljava/io/IOException;
        //  938    944    1311   1317   Lcom/whatsapp/protocol/a4;
        //  938    944    1613   1615   Any
        //  949    958    1891   1896   Ljava/io/IOException;
        //  949    958    1311   1317   Lcom/whatsapp/protocol/a4;
        //  949    958    1613   1615   Any
        //  963    968    1896   1901   Ljava/io/IOException;
        //  963    968    1311   1317   Lcom/whatsapp/protocol/a4;
        //  963    968    1613   1615   Any
        //  977    1037   1981   1986   Ljava/io/IOException;
        //  1042   1047   1986   1991   Ljava/io/IOException;
        //  1069   1085   1086   1091   Ljava/io/IOException;
        //  1098   1101   1101   1106   Ljava/io/IOException;
        //  1108   1111   1111   1121   Ljava/io/IOException;
        //  1108   1111   1126   1148   Any
        //  1113   1116   1116   1121   Ljava/io/IOException;
        //  1113   1116   1126   1148   Any
        //  1118   1121   1121   1126   Ljava/io/IOException;
        //  1118   1121   1126   1148   Any
        //  1123   1126   1126   1148   Any
        //  1128   1148   1148   1150   Ljava/io/IOException;
        //  1128   1148   1494   1496   Lcom/whatsapp/protocol/cz;
        //  1128   1148   1751   1753   Any
        //  1150   1157   1751   1753   Any
        //  1157   1184   1901   1906   Ljava/io/IOException;
        //  1157   1184   1751   1753   Any
        //  1189   1194   1906   1911   Ljava/io/IOException;
        //  1189   1194   1751   1753   Any
        //  1194   1224   1751   1753   Any
        //  1224   1233   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1224   1233   1613   1615   Any
        //  1238   1259   1911   1916   Ljava/io/IOException;
        //  1238   1259   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1238   1259   1613   1615   Any
        //  1264   1268   1916   1921   Ljava/io/IOException;
        //  1264   1268   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1264   1268   1613   1615   Any
        //  1273   1279   1921   1926   Ljava/io/IOException;
        //  1273   1279   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1273   1279   1613   1615   Any
        //  1284   1293   1926   1931   Ljava/io/IOException;
        //  1284   1293   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1284   1293   1613   1615   Any
        //  1298   1303   1306   1311   Ljava/io/IOException;
        //  1298   1303   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1298   1303   1613   1615   Any
        //  1308   1311   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1308   1311   1613   1615   Any
        //  1317   1375   2037   2046   Any
        //  1375   1435   2007   2012   Ljava/io/IOException;
        //  1440   1445   2012   2017   Ljava/io/IOException;
        //  1467   1483   1484   1489   Ljava/io/IOException;
        //  1491   1494   1148   1150   Ljava/io/IOException;
        //  1491   1494   1494   1496   Lcom/whatsapp/protocol/cz;
        //  1491   1494   1751   1753   Any
        //  1496   1526   1751   1753   Any
        //  1526   1535   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1526   1535   1613   1615   Any
        //  1540   1561   1931   1936   Ljava/io/IOException;
        //  1540   1561   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1540   1561   1613   1615   Any
        //  1566   1570   1936   1941   Ljava/io/IOException;
        //  1566   1570   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1566   1570   1613   1615   Any
        //  1575   1581   1941   1946   Ljava/io/IOException;
        //  1575   1581   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1575   1581   1613   1615   Any
        //  1586   1595   1946   1951   Ljava/io/IOException;
        //  1586   1595   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1586   1595   1613   1615   Any
        //  1600   1605   1608   1613   Ljava/io/IOException;
        //  1600   1605   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1600   1605   1613   1615   Any
        //  1610   1613   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1610   1613   1613   1615   Any
        //  1615   1647   2017   2022   Ljava/io/IOException;
        //  1652   1685   2022   2027   Ljava/io/IOException;
        //  1707   1723   2027   2032   Ljava/io/IOException;
        //  1728   1738   2032   2037   Ljava/io/IOException;
        //  1743   1746   1746   1751   Ljava/io/IOException;
        //  1743   1746   1494   1496   Lcom/whatsapp/protocol/cz;
        //  1743   1746   1751   1753   Any
        //  1748   1751   1148   1150   Ljava/io/IOException;
        //  1748   1751   1494   1496   Lcom/whatsapp/protocol/cz;
        //  1748   1751   1751   1753   Any
        //  1753   1774   1951   1956   Ljava/io/IOException;
        //  1753   1774   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1753   1774   1613   1615   Any
        //  1779   1788   1956   1961   Ljava/io/IOException;
        //  1779   1788   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1779   1788   1613   1615   Any
        //  1793   1797   1961   1966   Ljava/io/IOException;
        //  1793   1797   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1793   1797   1613   1615   Any
        //  1802   1808   1966   1971   Ljava/io/IOException;
        //  1802   1808   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1802   1808   1613   1615   Any
        //  1813   1822   1971   1976   Ljava/io/IOException;
        //  1813   1822   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1813   1822   1613   1615   Any
        //  1827   1832   1976   1981   Ljava/io/IOException;
        //  1827   1832   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1827   1832   1613   1615   Any
        //  1832   1835   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1832   1835   1613   1615   Any
        //  1837   1840   1840   1845   Ljava/io/IOException;
        //  1837   1840   1494   1496   Lcom/whatsapp/protocol/cz;
        //  1837   1840   1751   1753   Any
        //  1842   1845   1148   1150   Ljava/io/IOException;
        //  1842   1845   1494   1496   Lcom/whatsapp/protocol/cz;
        //  1842   1845   1751   1753   Any
        //  1847   1850   1850   1855   Ljava/io/IOException;
        //  1847   1850   1494   1496   Lcom/whatsapp/protocol/cz;
        //  1847   1850   1751   1753   Any
        //  1852   1855   1148   1150   Ljava/io/IOException;
        //  1852   1855   1494   1496   Lcom/whatsapp/protocol/cz;
        //  1852   1855   1751   1753   Any
        //  1857   1860   1148   1150   Ljava/io/IOException;
        //  1857   1860   1494   1496   Lcom/whatsapp/protocol/cz;
        //  1857   1860   1751   1753   Any
        //  1862   1865   1865   1870   Ljava/io/IOException;
        //  1862   1865   1494   1496   Lcom/whatsapp/protocol/cz;
        //  1862   1865   1751   1753   Any
        //  1867   1870   1148   1150   Ljava/io/IOException;
        //  1867   1870   1494   1496   Lcom/whatsapp/protocol/cz;
        //  1867   1870   1751   1753   Any
        //  1878   1881   1881   1886   Ljava/io/IOException;
        //  1878   1881   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1878   1881   1613   1615   Any
        //  1883   1886   1886   1891   Ljava/io/IOException;
        //  1883   1886   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1883   1886   1613   1615   Any
        //  1888   1891   1891   1896   Ljava/io/IOException;
        //  1888   1891   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1888   1891   1613   1615   Any
        //  1893   1896   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1893   1896   1613   1615   Any
        //  1898   1901   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1898   1901   1613   1615   Any
        //  1903   1906   1906   1911   Ljava/io/IOException;
        //  1903   1906   1751   1753   Any
        //  1908   1911   1751   1753   Any
        //  1913   1916   1916   1921   Ljava/io/IOException;
        //  1913   1916   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1913   1916   1613   1615   Any
        //  1918   1921   1921   1926   Ljava/io/IOException;
        //  1918   1921   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1918   1921   1613   1615   Any
        //  1923   1926   1926   1931   Ljava/io/IOException;
        //  1923   1926   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1923   1926   1613   1615   Any
        //  1928   1931   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1928   1931   1613   1615   Any
        //  1933   1936   1936   1941   Ljava/io/IOException;
        //  1933   1936   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1933   1936   1613   1615   Any
        //  1938   1941   1941   1946   Ljava/io/IOException;
        //  1938   1941   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1938   1941   1613   1615   Any
        //  1943   1946   1946   1951   Ljava/io/IOException;
        //  1943   1946   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1943   1946   1613   1615   Any
        //  1948   1951   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1948   1951   1613   1615   Any
        //  1953   1956   1956   1961   Ljava/io/IOException;
        //  1953   1956   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1953   1956   1613   1615   Any
        //  1958   1961   1961   1966   Ljava/io/IOException;
        //  1958   1961   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1958   1961   1613   1615   Any
        //  1963   1966   1966   1971   Ljava/io/IOException;
        //  1963   1966   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1963   1966   1613   1615   Any
        //  1968   1971   1971   1976   Ljava/io/IOException;
        //  1968   1971   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1968   1971   1613   1615   Any
        //  1973   1976   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1973   1976   1613   1615   Any
        //  1978   1981   1311   1317   Lcom/whatsapp/protocol/a4;
        //  1978   1981   1613   1615   Any
        //  1983   1986   1986   1991   Ljava/io/IOException;
        //  1991   2001   2002   2007   Ljava/io/IOException;
        //  2009   2012   2012   2017   Ljava/io/IOException;
        //  2019   2022   2022   2027   Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 950, Size: 950
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void a(final boolean b) {
        this.c(b);
    }
    
    private void a(final byte[] array) {
        final SharedPreferences sharedPreferences = this.j.getSharedPreferences(ae.z[39], 0);
        String encodeToString;
        if (array == null) {
            encodeToString = null;
        }
        else {
            encodeToString = Base64.encodeToString(array, 2);
        }
        final SharedPreferences$Editor edit = sharedPreferences.edit();
        edit.putString(ae.z[40], encodeToString);
        if (!edit.commit()) {
            Log.e(ae.z[38]);
        }
    }
    
    private void b() {
        Log.i(ae.z[7]);
        while (true) {
            try {
                if (!this.o.isOutputShutdown()) {
                    this.o.shutdownOutput();
                }
                try {
                    if (!this.o.isInputShutdown()) {
                        this.o.shutdownInput();
                    }
                    try {
                        if (!this.o.isClosed()) {
                            this.o.close();
                        }
                    }
                    catch (Exception ex) {
                        Log.i(ae.z[8] + ex.toString());
                    }
                }
                catch (Exception ex2) {}
            }
            catch (Exception ex3) {
                continue;
            }
            break;
        }
    }
    
    private void b(final Message message) {
        boolean b = true;
        final boolean a = com.whatsapp.messaging.e.a;
        Label_0332: {
            switch (com.whatsapp.messaging.e.b(message)) {
                case 23: {
                    final bo bo = (bo)message.obj;
                    if (bo == null || bo.b == null) {
                        break;
                    }
                    this.b = (1000L * bo.b.b < System.currentTimeMillis() && b);
                    if (a) {
                        break Label_0332;
                    }
                    break;
                }
                case 22: {
                    final ag ag = (ag)message.obj;
                    if (ag == null || ag.a == null) {
                        break;
                    }
                    this.b = (1000L * ag.a.b < System.currentTimeMillis() && b);
                    if (a) {
                        break Label_0332;
                    }
                    break;
                }
                case 8: {
                    if (1000L * (long)message.obj >= System.currentTimeMillis()) {
                        b = false;
                    }
                    this.b = b;
                    if (a) {
                        break Label_0332;
                    }
                    break;
                }
                case 5: {
                    final String s = (String)message.obj;
                    if (s.indexOf(ae.z[49]) > 0) {
                        App.a(1000L * Long.parseLong(s.substring(0, s.indexOf(ae.z[50]))), System.currentTimeMillis());
                    }
                    this.i.a(com.whatsapp.messaging.e.c(s));
                    return;
                }
                case 101: {
                    this.h.g();
                    if (a) {
                        break Label_0332;
                    }
                    break;
                }
                case 57:
                case 62:
                case 65: {
                    this.h.f();
                    break;
                }
            }
        }
        this.g.a(Message.obtain(message));
    }
    
    static void b(final ae ae) {
        ae.c();
    }
    
    static void b(final ae ae, final Message message) {
        ae.a(message);
    }
    
    private void b(final String s, final byte[] array, final String s2, final boolean b, final boolean b2, final List list, final boolean b3) {
        this.a(s, array, s2, b, b2, list, b3);
    }
    
    private void b(boolean b) {
        this.q.a(false);
        this.l.a(false);
        Label_0089: {
            if (!this.k.a()) {
                this.h.c();
                this.i.a();
                if (this.p) {
                    b = true;
                }
                this.g.a(b);
                if (!com.whatsapp.messaging.e.a) {
                    break Label_0089;
                }
            }
            Log.i(ae.z[11]);
            this.a.quit();
            this.quit();
        }
        this.h();
        this.h.d();
    }
    
    private void c() {
        this.k.a(true);
        this.c(false);
    }
    
    static void c(final ae ae) {
        ae.p();
    }
    
    private void c(final boolean b) {
        this.h.d();
        if (this.q.a() && !this.l.a()) {
            if (b) {
                Log.i(ae.z[61]);
                if (this.r != null) {
                    this.r.d();
                }
                this.b();
                this.i.a();
                this.g.a(true);
                this.q.a(false);
                this.h();
                if (!this.k.a()) {
                    return;
                }
                Log.i(ae.z[62]);
                this.a.quit();
                this.quit();
                if (!com.whatsapp.messaging.e.a) {
                    return;
                }
            }
            this.h.a();
            this.i.a(com.whatsapp.messaging.e.n());
            this.l.a(true);
        }
    }
    
    private void d() {
        this.b();
        this.b(true);
    }
    
    static void d(final ae ae) {
        ae.d();
    }
    
    static void e(final ae ae) {
        ae.a();
    }
    
    private boolean e() {
        return this.h.e();
    }
    
    private void f() {
        this.o();
        this.i.a(com.whatsapp.messaging.e.l());
    }
    
    static boolean f(final ae ae) {
        return ae.e();
    }
    
    private void g() {
        Log.i(ae.z[51]);
        Label_0045: {
            if (this.p) {
                App.F(ae.z[53]);
                this.a(true);
                if (!com.whatsapp.messaging.e.a) {
                    break Label_0045;
                }
            }
            Log.i(ae.z[52]);
        }
        this.p = false;
    }
    
    static void g(final ae ae) {
        ae.i();
    }
    
    private void h() {
        final PendingIntent broadcast = PendingIntent.getBroadcast((Context)App.aq, 0, new Intent(ae.z[65]).setPackage(ae.z[63]), 536870912);
        if (broadcast != null) {
            ((AlarmManager)App.aq.getSystemService(ae.z[64])).cancel(broadcast);
            broadcast.cancel();
        }
        this.p = false;
    }
    
    static void h(final ae ae) {
        ae.n();
    }
    
    private void i() {
        this.b();
        this.b(false);
    }
    
    static void i(final ae ae) {
        ae.h();
    }
    
    private void j() {
        this.i.a(com.whatsapp.messaging.e.f());
    }
    
    static void j(final ae ae) {
        ae.k();
    }
    
    private void k() {
        if (Voip.d()) {
            Log.i(ae.z[9]);
            this.h.a();
            this.f();
            if (!com.whatsapp.messaging.e.a) {
                return;
            }
        }
        Log.i(ae.z[10]);
        this.b();
    }
    
    static void k(final ae ae) {
        ae.j();
    }
    
    static void l(final ae ae) {
        ae.f();
    }
    
    private byte[] l() {
        final String string = this.j.getSharedPreferences(ae.z[47], 0).getString(ae.z[48], (String)null);
        if (string == null) {
            return null;
        }
        return Base64.decode(string, 0);
    }
    
    private void m() {
        Log.i(ae.z[57]);
        final App$Me f = App.F();
        this.i.a(com.whatsapp.messaging.e.a(f.jabber_id, al5.b(App.n(f.jabber_id)), ChangeNumber.M, ChangeNumber.E));
    }
    
    private void n() {
        this.i.a(com.whatsapp.messaging.e.j());
        if (ChangeNumber.g()) {
            this.m();
        }
    }
    
    private void o() {
        final boolean a = com.whatsapp.messaging.e.a;
        final Intent setPackage = new Intent(ae.z[2]).setPackage(ae.z[0]);
        Label_0118: {
            if (PendingIntent.getBroadcast((Context)App.aq, 0, setPackage, 536870912) == null) {
                final PendingIntent broadcast = PendingIntent.getBroadcast((Context)App.aq, 0, setPackage, 1073741824);
                final AlarmManager alarmManager = (AlarmManager)App.aq.getSystemService(ae.z[1]);
                final long n = 32000L + SystemClock.elapsedRealtime();
                Label_0106: {
                    if (Build$VERSION.SDK_INT >= 19) {
                        alarmManager.setExact(2, n, broadcast);
                        if (!a) {
                            break Label_0106;
                        }
                    }
                    alarmManager.set(2, n, broadcast);
                }
                if (!a) {
                    break Label_0118;
                }
            }
            Log.i(ae.z[3]);
        }
        this.p = true;
    }
    
    private void p() {
        Log.e(ae.z[58]);
        this.b();
    }
    
    protected void onLooperPrepared() {
        this.h = new bp(this, null);
        (this.a = new a4(new ao(this))).start();
    }
}
