// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.content.IntentFilter;
import android.os.IBinder;
import java.util.concurrent.Future;
import com.whatsapp.App;
import com.whatsapp.protocol.cr;
import com.whatsapp.protocol.a4;
import android.os.Message;
import com.whatsapp.aam;
import android.os.SystemClock;
import android.app.PendingIntent;
import android.content.Intent;
import android.app.AlarmManager;
import com.whatsapp.util.Log;
import java.util.Iterator;
import com.whatsapp.DialogToastActivity;
import android.os.Handler$Callback;
import java.util.HashMap;
import android.os.Looper;
import android.content.Context;
import java.util.Random;
import android.content.BroadcastReceiver;
import android.os.HandlerThread;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.CountDownLatch;
import android.app.Service;

public class MessageService extends Service
{
    private static CountDownLatch A;
    private static final String E;
    private static final String[] J;
    private static final String a;
    private static final AtomicBoolean s;
    private static final String x;
    private final Handler B;
    private final a5 C;
    private final Map D;
    private AtomicInteger F;
    private byte[] G;
    private az H;
    private final by I;
    private long b;
    private f c;
    private Handler d;
    private final ar e;
    private int f;
    private HandlerThread g;
    private boolean h;
    private final BroadcastReceiver i;
    private long j;
    private final ar k;
    private final BroadcastReceiver l;
    private final Map m;
    private final Object n;
    private boolean o;
    private final BroadcastReceiver p;
    private ae q;
    private String r;
    private boolean t;
    private final Random u;
    private final an v;
    private final Object w;
    private final ar y;
    private boolean z;
    
    static {
        final String[] j = new String[77];
        String s2 = "tT2_jpT1]%qI|Q-jR.].?\u001d2WjwX2\\#jZ|[\"eS2]&$\\*Y#h\\>T/$D9L";
        int n = -1;
        String[] array = j;
        int n2 = 0;
        String intern = null;
    Label_1957:
        while (true) {
            final char[] charArray = s2.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'J';
                        break;
                    }
                    case 0: {
                        c2 = '\u0004';
                        break;
                    }
                    case 1: {
                        c2 = '=';
                        break;
                    }
                    case 2: {
                        c2 = '\\';
                        break;
                    }
                    case 3: {
                        c2 = '8';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s2 = "|P,HewX.N#gXsK>eO(";
                    n2 = 1;
                    array = j;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = j;
                    s2 = "|P,HewX.N#gXsT%cR)LgpT1]8+^=V)aQ";
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    s2 = "eQ=J'";
                    n = 2;
                    array = j;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s2 = "gR1\u0016=l\\(K+tMru/wN=_/WX.N#gXrk\u000fPb\u001fw\u0004Jx\u001fl\u0003Ks\u0003l\u0013Tx";
                    n = 3;
                    n2 = 4;
                    array = j;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = j;
                    s2 = "hR2_\u0015gR2V/gI";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s2 = "|P,HewX.N#gXsV/pJ3J!+N+Q>gU|W&`\u0000";
                    n = 5;
                    array = j;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s2 = "$S9Ow";
                    n = 6;
                    array = j;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s2 = "vX/]>";
                    n = 7;
                    array = j;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s2 = "b\\0T(e^7g#tN";
                    n = 8;
                    array = j;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s2 = "kK9J8mY9g/|M5J/`";
                    n = 9;
                    array = j;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s2 = "gR1\u0016=l\\(K+tMru/wN=_/WX.N#gXrj\u000fGr\u0012v\u000fGi";
                    n = 10;
                    array = j;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s2 = "bR.[/";
                    n = 11;
                    array = j;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s2 = "gU9[![^3V$a^(Q%j";
                    n = 12;
                    array = j;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s2 = "mM\u0003Y.`O9K9";
                    n = 13;
                    array = j;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s2 = "g\\,L#rX|O#bT|K>eI)KjmN|";
                    n = 14;
                    array = j;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s2 = "eJ=Q>mS;\u0018)eM(Q<a\u001d+Q,m\u001d/L+pH/";
                    n = 15;
                    array = j;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s2 = "wX/K#kS|Q$e^(Q<a";
                    n = 16;
                    array = j;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s2 = "IX/K+cX\u000f]8rT?]ewX2\\\u0012iM,\u0003jpD,]w";
                    n = 17;
                    array = j;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s2 = "|P,HewX.N#gXsT%cR)LgpT1]8+U=Kw";
                    n = 18;
                    array = j;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s2 = "gR1\u0016=l\\(K+tM";
                    n = 19;
                    array = j;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s2 = "IX/K+cX\u000f]8rT?]jGR2V/gI5N#pD|p+jY0]8";
                    n = 20;
                    array = j;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s2 = "eS8J%mYrV/p\u0013?W$j\u0013\u001fw\u0004Jx\u001fl\u0003Rt\ba\u0015Gu\u001dv\rA";
                    n = 21;
                    array = j;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s2 = "gR2V/gI5N#pD";
                    n = 22;
                    array = j;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s2 = "|P,HewX.N#gXs[8a\\(]";
                    n = 23;
                    array = j;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s2 = "gR1\u0016=l\\(K+tMrH/vP5K9mR2\u0016\bVr\u001d|\tEn\b";
                    n = 24;
                    array = j;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s2 = "gR1\u0016=l\\(K+tMrH/vP5K9mR2\u0016\bVr\u001d|\tEn\b";
                    n = 25;
                    array = j;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s2 = "eQ=J'";
                    n = 26;
                    array = j;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s2 = "|P,HewX.N#gXs[&mX2LgtT2_/v\u0010(Q'aOsK>eO(";
                    n = 27;
                    array = j;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s2 = "|P,HewX.N#gXsK>kM";
                    n = 28;
                    array = j;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s2 = "mS(]8vH,L/`\u001d+P#hX|O+mI5V-$R2\u0018)kS2])pT*Q>}\u001d4Y$`Q9JjpU.]+`\u001d(WjaE5L";
                    n = 29;
                    array = j;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s2 = "gR1\u0016=l\\(K+tMru/wN=_/WX.N#gXrk\u001eEo\b";
                    n = 30;
                    array = j;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s2 = "|P,HewX.N#gXsZ+gV\u0003W,b\u0012.]9aI";
                    n = 31;
                    array = j;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s2 = "|P,HewX.N#gXsJ/gR2V/gIsV/pJ3J![H2Y<eT0Y(hX";
                    n = 32;
                    array = j;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s2 = "|P,HewX.N#gXsJ/gR2V/gIsV%pb8Q9gR2V/gI9\\egU9[![^3V$a^(Q<mI%";
                    n = 33;
                    array = j;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s2 = "|P,HewX.N#gXsV/pJ3J!+T;V%vX|\u0010";
                    n = 34;
                    array = j;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s2 = "gR1\u0016=l\\(K+tMru/wN=_/WX.N#gXrk\u001eKm\u0003v\u0005[o\u0019k\u001eEo\b";
                    n = 35;
                    array = j;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s2 = "bR.[/";
                    n = 36;
                    array = j;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s2 = "b\\0T(e^7g#tN";
                    n = 37;
                    array = j;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s2 = "gR1\u0016=l\\(K+tMru/wN=_/WX.N#gXrk\u001eEo\b";
                    n = 38;
                    array = j;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s2 = "vX/]>";
                    n = 39;
                    array = j;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s2 = "gR1\u0016=l\\(K+tMru/wN=_/WX.N#gXrk\u000fPb\u001fw\u0004Jx\u001fl\u0003Ks\u0003l\u0013Tx";
                    n = 40;
                    array = j;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s2 = "mM\u0003Y.`O9K9";
                    n = 41;
                    array = j;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s2 = "kK9J8mY9g/|M5J/`";
                    n = 42;
                    array = j;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s2 = "gR1\u0016=l\\(K+tMru/wN=_/WX.N#gXrj\u000fGr\u0012v\u000fGi";
                    n = 43;
                    array = j;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s2 = "gR1\u0016=l\\(K+tMru/wN=_/WX.N#gXrk\u001eKm\u0003v\u0005[o\u0019k\u001eEo\b";
                    n = 44;
                    array = j;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s2 = "hR2_\u0015gR2V/gI";
                    n = 45;
                    array = j;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s2 = "gU9[![^3V$a^(Q%j";
                    n = 46;
                    array = j;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s2 = "wX/K#kS|Y)pT*]";
                    n = 47;
                    array = j;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s2 = "|P,HewX.N#gXsJ/gR2V/gIsY&vX=\\3)M9V.mS;";
                    n = 48;
                    array = j;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s2 = "gR1\u0016=l\\(K+tMru/wN=_/WX.N#gXrj\u000fGr\u0012v\u000fGi";
                    n = 49;
                    array = j;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s2 = "|P,HewX.N#gXsJ/gR2V/gIsQ'iX8Q+pX";
                    n = 50;
                    array = j;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s2 = "|P,HewX.N#gXsJ/gR2V/gIs";
                    n = 51;
                    array = j;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s2 = "bR.[/";
                    n = 52;
                    array = j;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s2 = "eQ=J'";
                    n = 53;
                    array = j;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    s2 = "iX/K+cX\u000f]8rT?]ewX2\\\u0003u\u0007|Q.$T/\u0018$qQ0";
                    n = 54;
                    array = j;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    s2 = "iX/K+cX\u000f]8rT?]ewX2\\\u000bgV=Z&ap9K9eZ9\u0002jwI=V0ev9AjmN|V?hQ";
                    n = 55;
                    n2 = 56;
                    array = j;
                    continue;
                }
                case 55: {
                    array[n2] = intern;
                    n2 = 57;
                    array = j;
                    s2 = "|P,HewX.N#gXsT%cR)LgpT1]8+O9K/p";
                    n = 56;
                    continue;
                }
                case 56: {
                    array[n2] = intern;
                    n2 = 58;
                    s2 = "$T/j/pO%\u0005";
                    n = 57;
                    array = j;
                    continue;
                }
                case 57: {
                    array[n2] = intern;
                    n2 = 59;
                    s2 = "gR2V/gI5N#pD";
                    n = 58;
                    array = j;
                    continue;
                }
                case 58: {
                    array[n2] = intern;
                    n2 = 60;
                    s2 = "|P,HewX.N#gXsV/pJ3J!+\\?L#rX|";
                    n = 59;
                    array = j;
                    continue;
                }
                case 59: {
                    array[n2] = intern;
                    s2 = "gR2V/gI5N#pD|J/pO%\u0018+h\\.Ujg\\2[/hX8";
                    n = 60;
                    n2 = 61;
                    array = j;
                    continue;
                }
                case 60: {
                    array[n2] = intern;
                    n2 = 62;
                    array = j;
                    s2 = "eQ=J'";
                    n = 61;
                    continue;
                }
                case 61: {
                    array[n2] = intern;
                    n2 = 63;
                    s2 = "gR2V/gI5N#pD|J/pO%\u0018+h\\.UjwX(\u0018,kO|\u000ez4\rlU9$[.W'$S3O";
                    n = 62;
                    array = j;
                    continue;
                }
                case 62: {
                    array[n2] = intern;
                    n2 = 64;
                    s2 = "eQ=J'";
                    n = 63;
                    array = j;
                    continue;
                }
                case 63: {
                    array[n2] = intern;
                    n2 = 65;
                    s2 = "|P,HewX.N#gXsV/pJ3J!+H,";
                    n = 64;
                    array = j;
                    continue;
                }
                case 64: {
                    array[n2] = intern;
                    n2 = 66;
                    s2 = "|P,HewX.N#gXsV/pJ3J!+Y3O$";
                    n = 65;
                    array = j;
                    continue;
                }
                case 65: {
                    array[n2] = intern;
                    n2 = 67;
                    s2 = "|P,HewX.N#gXs\\/wI.W3";
                    n = 66;
                    array = j;
                    continue;
                }
                case 66: {
                    array[n2] = intern;
                    n2 = 68;
                    s2 = "gR2V/gI5N#pD";
                    n = 67;
                    array = j;
                    continue;
                }
                case 67: {
                    array[n2] = intern;
                    n2 = 69;
                    s2 = "iX/K+cX\u0003K/vK5[/+Q3_-aY\u0003^&eZsU?wI\u0003Q-jR.]\u0015jX(O%vV\u0003W$gX";
                    n = 68;
                    array = j;
                    continue;
                }
                case 68: {
                    array[n2] = intern;
                    n2 = 70;
                    s2 = "iX/K+cX\u0003K/vK5[/+Q3_-aY\u0003^&eZsU?wI\u0003J/gR2V/gI";
                    n = 69;
                    array = j;
                    continue;
                }
                case 69: {
                    array[n2] = intern;
                    n2 = 71;
                    s2 = "iX/K+cX\u0003K/vK5[/+Q3_-aY\u0003^&eZs\\#w^3V$a^(].";
                    n = 70;
                    array = j;
                    continue;
                }
                case 70: {
                    array[n2] = intern;
                    n2 = 72;
                    s2 = "vX?]#rX8\u0018+gVg\u00189p\\2B+OX%\u0005";
                    n = 71;
                    array = j;
                    continue;
                }
                case 71: {
                    array[n2] = intern;
                    n2 = 73;
                    s2 = "eQ=J'";
                    n = 72;
                    array = j;
                    continue;
                }
                case 72: {
                    array[n2] = intern;
                    n2 = 74;
                    s2 = "|P,HewX.N#gXsT%cR)LgpT1]8+N(Y8p";
                    n = 73;
                    array = j;
                    continue;
                }
                case 73: {
                    array[n2] = intern;
                    n2 = 75;
                    s2 = "|P,HewX.N#gXs[&mX2LgtT2_/v\u0010(Q'aOsK>kM";
                    n = 74;
                    array = j;
                    continue;
                }
                case 74: {
                    array[n2] = intern;
                    n2 = 76;
                    s2 = "eQ=J'";
                    n = 75;
                    array = j;
                    continue;
                }
                case 75: {
                    break Label_1957;
                }
            }
        }
        array[n2] = intern;
        J = j;
        StringBuilder sb = new StringBuilder().append(MessageService.class.getCanonicalName());
        String s3 = "*~\u0013v\u0004A~\bq\u001cMi\u0005g\u0018Ai\u000ea\u0015E~\bq\u0005J";
        int n4 = -1;
        String intern2 = null;
    Label_2308:
        while (true) {
            final char[] charArray2 = s3.toCharArray();
            for (int k = charArray2.length, n5 = 0; k > n5; ++n5) {
                final char c3 = charArray2[n5];
                char c4 = '\0';
                switch (n5 % 5) {
                    default: {
                        c4 = 'J';
                        break;
                    }
                    case 0: {
                        c4 = '\u0004';
                        break;
                    }
                    case 1: {
                        c4 = '=';
                        break;
                    }
                    case 2: {
                        c4 = '\\';
                        break;
                    }
                    case 3: {
                        c4 = '8';
                        break;
                    }
                }
                charArray2[n5] = (char)(c4 ^ c3);
            }
            intern2 = new String(charArray2).intern();
            switch (n4) {
                default: {
                    E = sb.append(intern2).toString();
                    sb = new StringBuilder().append(MessageService.class.getCanonicalName());
                    s3 = "*q\u0013\u007f\u0005Qi\u0003y\tPt\u0013v";
                    n4 = 0;
                    continue;
                }
                case 0: {
                    x = sb.append(intern2).toString();
                    sb = new StringBuilder().append(MessageService.class.getCanonicalName());
                    s3 = "*~\u0010q\u000fJi\u0003h\u0003Jz\u0019j\u0015E~\bq\u0005J";
                    n4 = 1;
                    continue;
                }
                case 1: {
                    break Label_2308;
                }
            }
        }
        a = sb.append(intern2).toString();
        s = new AtomicBoolean();
        MessageService.A = new CountDownLatch(1);
    }
    
    public MessageService() {
        final boolean a = com.whatsapp.messaging.e.a;
        this.I = new by(this);
        this.C = new a5((Context)this);
        this.v = new an(this, Looper.getMainLooper());
        this.F = new AtomicInteger();
        this.z = false;
        this.f = -1;
        this.n = new Object();
        this.j = 0L;
        this.b = 10000L;
        this.u = new Random();
        this.w = new Object();
        this.y = new ar(3, MessageService.J[70], true);
        this.k = new ar(3, MessageService.J[69], false);
        this.e = new ar(3, MessageService.J[71], true);
        this.m = new HashMap();
        this.D = new HashMap();
        this.o = false;
        this.i = new MessageService$1(this);
        this.B = new Handler((Handler$Callback)new i(this));
        this.l = new MessageService$3(this);
        this.p = new MessageService$4(this);
        if (!a) {
            return;
        }
        while (true) {
            while (true) {
                try {
                    final boolean h = DialogToastActivity.h;
                    final boolean h2 = false;
                    if (h) {
                        DialogToastActivity.h = h2;
                        return;
                    }
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
                final boolean h2 = true;
                continue;
            }
        }
    }
    
    private void A() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/messaging/MessageService.l:Landroid/content/BroadcastReceiver;
        //     4: astore_1       
        //     5: aload_1        
        //     6: monitorenter   
        //     7: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //    10: bipush          74
        //    12: aaload         
        //    13: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    16: aload_0        
        //    17: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //    20: bipush          73
        //    22: aaload         
        //    23: invokevirtual   com/whatsapp/messaging/MessageService.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    26: checkcast       Landroid/app/AlarmManager;
        //    29: astore_3       
        //    30: aload_0        
        //    31: iconst_0       
        //    32: aload_0        
        //    33: invokespecial   com/whatsapp/messaging/MessageService.q:()Landroid/content/Intent;
        //    36: ldc_w           1073741824
        //    39: invokestatic    android/app/PendingIntent.getBroadcast:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //    42: astore          4
        //    44: aload_3        
        //    45: aload           4
        //    47: invokevirtual   android/app/AlarmManager.cancel:(Landroid/app/PendingIntent;)V
        //    50: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    53: bipush          19
        //    55: if_icmplt       82
        //    58: aload_3        
        //    59: iconst_2       
        //    60: ldc2_w          600000
        //    63: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //    66: ladd           
        //    67: aload           4
        //    69: invokevirtual   android/app/AlarmManager.setExact:(IJLandroid/app/PendingIntent;)V
        //    72: getstatic       com/whatsapp/messaging/e.a:Z
        //    75: istore          7
        //    77: iload           7
        //    79: ifeq            96
        //    82: aload_3        
        //    83: iconst_2       
        //    84: ldc2_w          600000
        //    87: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //    90: ladd           
        //    91: aload           4
        //    93: invokevirtual   android/app/AlarmManager.set:(IJLandroid/app/PendingIntent;)V
        //    96: aload_1        
        //    97: monitorexit    
        //    98: return         
        //    99: astore          5
        //   101: aload           5
        //   103: athrow         
        //   104: astore          6
        //   106: aload           6
        //   108: athrow         
        //   109: astore_2       
        //   110: aload_1        
        //   111: monitorexit    
        //   112: aload_2        
        //   113: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  7      44     109    114    Any
        //  44     77     99     104    Ljava/lang/NullPointerException;
        //  44     77     109    114    Any
        //  82     96     104    109    Ljava/lang/NullPointerException;
        //  82     96     109    114    Any
        //  96     98     109    114    Any
        //  101    104    104    109    Ljava/lang/NullPointerException;
        //  101    104    109    114    Any
        //  106    109    109    114    Any
        //  110    112    109    114    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0082:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
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
    
    private void B() {
        final boolean a = com.whatsapp.messaging.e.a;
        synchronized (this.m) {
            final Iterator<Map.Entry<K, as>> iterator = this.m.entrySet().iterator();
            while (iterator.hasNext()) {
                iterator.next().getValue().a();
                if (a) {
                    break;
                }
            }
            this.m.clear();
        }
    }
    
    private void a() {
        Log.i(MessageService.J[28]);
        final AlarmManager alarmManager = (AlarmManager)this.getSystemService(MessageService.J[27]);
        final PendingIntent broadcast = PendingIntent.getBroadcast((Context)this, 0, new Intent(MessageService.a), 0);
        alarmManager.cancel(broadcast);
        alarmManager.setInexactRepeating(2, 15000L + SystemClock.elapsedRealtime(), 240000L, broadcast);
    }
    
    private void a(final int f) {
        try {
            if (f == this.f) {
                return;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        try {
            Log.i(MessageService.J[6] + this.f + MessageService.J[7] + f);
            if (this.c != null) {
                this.c.a(true);
            }
            this.f = f;
            aam.a((Context)this);
        }
        catch (NullPointerException ex2) {
            throw ex2;
        }
    }
    
    public static void a(final Context context) {
        context.startService(new Intent(context, (Class)MessageService.class).setAction(MessageService.J[36]));
    }
    
    public static void a(final Context context, final boolean b) {
        context.startService(new Intent(context, (Class)MessageService.class).setAction(MessageService.J[4]).putExtra(MessageService.J[5], b));
    }
    
    public static void a(final Context context, final boolean b, final boolean b2) {
        a(context, b, b2, false, null, null, false);
    }
    
    public static void a(final Context context, final boolean b, final boolean b2, final boolean b3, final String s, final String[] array, final boolean b4) {
        context.startService(new Intent(context, (Class)MessageService.class).setAction(MessageService.J[11]).putExtra(MessageService.J[12], b).putExtra(MessageService.J[8], b2).putExtra(MessageService.J[13], b3).putExtra(MessageService.J[14], s).putExtra(MessageService.J[9], array).putExtra(MessageService.J[10], b4));
    }
    
    private void a(final Message message) {
        this.H.a(message);
    }
    
    static void a(final MessageService messageService) {
        messageService.b();
    }
    
    static void a(final MessageService messageService, final int n) {
        messageService.a(n);
    }
    
    static void a(final MessageService messageService, final Message message) {
        messageService.a(message);
    }
    
    static void a(final MessageService messageService, final f f) {
        messageService.a(f);
    }
    
    static void a(final MessageService messageService, final a4 a4) {
        messageService.a(a4);
    }
    
    static void a(final MessageService messageService, final cr cr) {
        messageService.a(cr);
    }
    
    static void a(final MessageService messageService, final String s) {
        messageService.a(s);
    }
    
    static void a(final MessageService messageService, final boolean b) {
        messageService.c(b);
    }
    
    private void a(final f p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: putfield        com/whatsapp/messaging/MessageService.c:Lcom/whatsapp/messaging/f;
        //     5: aload_0        
        //     6: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //     9: bipush          23
        //    11: aaload         
        //    12: invokevirtual   com/whatsapp/messaging/MessageService.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    15: checkcast       Landroid/net/ConnectivityManager;
        //    18: invokevirtual   android/net/ConnectivityManager.getActiveNetworkInfo:()Landroid/net/NetworkInfo;
        //    21: astore_2       
        //    22: aload_2        
        //    23: ifnull          34
        //    26: aload_0        
        //    27: aload_2        
        //    28: invokevirtual   android/net/NetworkInfo.getType:()I
        //    31: putfield        com/whatsapp/messaging/MessageService.f:I
        //    34: aload_0        
        //    35: new             Landroid/os/HandlerThread;
        //    38: dup            
        //    39: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //    42: bipush          21
        //    44: aaload         
        //    45: invokespecial   android/os/HandlerThread.<init>:(Ljava/lang/String;)V
        //    48: putfield        com/whatsapp/messaging/MessageService.g:Landroid/os/HandlerThread;
        //    51: aload_0        
        //    52: getfield        com/whatsapp/messaging/MessageService.g:Landroid/os/HandlerThread;
        //    55: invokevirtual   android/os/HandlerThread.start:()V
        //    58: aload_0        
        //    59: new             Landroid/os/Handler;
        //    62: dup            
        //    63: aload_0        
        //    64: getfield        com/whatsapp/messaging/MessageService.g:Landroid/os/HandlerThread;
        //    67: invokevirtual   android/os/HandlerThread.getLooper:()Landroid/os/Looper;
        //    70: invokespecial   android/os/Handler.<init>:(Landroid/os/Looper;)V
        //    73: putfield        com/whatsapp/messaging/MessageService.d:Landroid/os/Handler;
        //    76: aload_0        
        //    77: aload_0        
        //    78: getfield        com/whatsapp/messaging/MessageService.i:Landroid/content/BroadcastReceiver;
        //    81: new             Landroid/content/IntentFilter;
        //    84: dup            
        //    85: getstatic       com/whatsapp/messaging/MessageService.E:Ljava/lang/String;
        //    88: invokespecial   android/content/IntentFilter.<init>:(Ljava/lang/String;)V
        //    91: aconst_null    
        //    92: aload_0        
        //    93: getfield        com/whatsapp/messaging/MessageService.d:Landroid/os/Handler;
        //    96: invokevirtual   com/whatsapp/messaging/MessageService.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;
        //    99: pop            
        //   100: new             Landroid/content/IntentFilter;
        //   103: dup            
        //   104: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //   107: bipush          22
        //   109: aaload         
        //   110: invokespecial   android/content/IntentFilter.<init>:(Ljava/lang/String;)V
        //   113: astore          4
        //   115: aload_0        
        //   116: aload_0        
        //   117: getfield        com/whatsapp/messaging/MessageService.i:Landroid/content/BroadcastReceiver;
        //   120: aload           4
        //   122: aconst_null    
        //   123: aload_0        
        //   124: getfield        com/whatsapp/messaging/MessageService.d:Landroid/os/Handler;
        //   127: invokevirtual   com/whatsapp/messaging/MessageService.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;
        //   130: ifnonnull       149
        //   133: aload_0        
        //   134: getfield        com/whatsapp/messaging/MessageService.d:Landroid/os/Handler;
        //   137: new             Lcom/whatsapp/messaging/ab;
        //   140: dup            
        //   141: aload_0        
        //   142: invokespecial   com/whatsapp/messaging/ab.<init>:(Lcom/whatsapp/messaging/MessageService;)V
        //   145: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   148: pop            
        //   149: aload_0        
        //   150: iconst_1       
        //   151: iconst_0       
        //   152: aconst_null    
        //   153: aconst_null    
        //   154: iconst_0       
        //   155: invokespecial   com/whatsapp/messaging/MessageService.a:(ZZLjava/lang/String;[Ljava/lang/String;Z)V
        //   158: aload_0        
        //   159: getfield        com/whatsapp/messaging/MessageService.H:Lcom/whatsapp/messaging/az;
        //   162: ifnull          174
        //   165: aload_0        
        //   166: getfield        com/whatsapp/messaging/MessageService.H:Lcom/whatsapp/messaging/az;
        //   169: invokeinterface com/whatsapp/messaging/az.b:()V
        //   174: aload_0        
        //   175: invokestatic    com/whatsapp/aam.a:(Landroid/content/Context;)V
        //   178: return         
        //   179: astore          8
        //   181: aload           8
        //   183: athrow         
        //   184: astore          6
        //   186: aload           6
        //   188: athrow         
        //   189: astore          5
        //   191: aload           5
        //   193: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  26     34     179    184    Ljava/lang/NullPointerException;
        //  133    149    184    189    Ljava/lang/NullPointerException;
        //  149    174    189    194    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 97, Size: 97
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
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
    
    private void a(final a4 a4) {
        synchronized (this.w) {
            this.H.a(a4);
            this.e.a(true);
            this.B();
            this.c();
            this.F.set(0);
        }
    }
    
    private void a(final cr p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //    10: bipush          72
        //    12: aaload         
        //    13: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    16: aload_1        
        //    17: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    20: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    23: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    26: aload_0        
        //    27: getfield        com/whatsapp/messaging/MessageService.D:Ljava/util/Map;
        //    30: astore_2       
        //    31: aload_2        
        //    32: monitorenter   
        //    33: aload_0        
        //    34: getfield        com/whatsapp/messaging/MessageService.D:Ljava/util/Map;
        //    37: aload_1        
        //    38: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //    43: checkcast       Lcom/whatsapp/messaging/as;
        //    46: astore          4
        //    48: aload_2        
        //    49: monitorexit    
        //    50: aload           4
        //    52: ifnull          62
        //    55: aload           4
        //    57: invokeinterface com/whatsapp/messaging/as.b:()V
        //    62: return         
        //    63: astore_3       
        //    64: aload_2        
        //    65: monitorexit    
        //    66: aload_3        
        //    67: athrow         
        //    68: astore          5
        //    70: aload           5
        //    72: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  33     50     63     68     Any
        //  55     62     68     73     Ljava/lang/NullPointerException;
        //  64     66     63     68     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0062:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
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
    
    private void a(final cr cr, final as as) {
        synchronized (this.D) {
            this.D.put(cr, as);
        }
    }
    
    private void a(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/messaging/MessageService.m:Ljava/util/Map;
        //     4: astore_2       
        //     5: aload_2        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        com/whatsapp/messaging/MessageService.m:Ljava/util/Map;
        //    11: aload_1        
        //    12: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //    17: checkcast       Lcom/whatsapp/messaging/as;
        //    20: astore          4
        //    22: aload_2        
        //    23: monitorexit    
        //    24: aload           4
        //    26: ifnull          36
        //    29: aload           4
        //    31: invokeinterface com/whatsapp/messaging/as.b:()V
        //    36: return         
        //    37: astore_3       
        //    38: aload_2        
        //    39: monitorexit    
        //    40: aload_3        
        //    41: athrow         
        //    42: astore          5
        //    44: aload           5
        //    46: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  7      24     37     42     Any
        //  29     36     42     47     Ljava/lang/NullPointerException;
        //  38     40     37     42     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0036:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
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
    
    private void a(final String s, final as as) {
        synchronized (this.m) {
            this.m.put(s, as);
        }
    }
    
    private void a(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/messaging/e.a:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //     8: bipush          59
        //    10: aaload         
        //    11: invokevirtual   com/whatsapp/messaging/MessageService.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    14: checkcast       Landroid/net/ConnectivityManager;
        //    17: invokevirtual   android/net/ConnectivityManager.getActiveNetworkInfo:()Landroid/net/NetworkInfo;
        //    20: astore_3       
        //    21: new             Ljava/lang/StringBuilder;
        //    24: dup            
        //    25: invokespecial   java/lang/StringBuilder.<init>:()V
        //    28: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //    31: bipush          60
        //    33: aaload         
        //    34: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    37: aload_3        
        //    38: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    41: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //    44: bipush          58
        //    46: aaload         
        //    47: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    50: iload_1        
        //    51: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //    54: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    57: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    60: invokestatic    com/whatsapp/App.a6:()V
        //    63: aload_3        
        //    64: ifnonnull       89
        //    67: aload_0        
        //    68: getfield        com/whatsapp/messaging/MessageService.B:Landroid/os/Handler;
        //    71: aload_0        
        //    72: getfield        com/whatsapp/messaging/MessageService.B:Landroid/os/Handler;
        //    75: iconst_0       
        //    76: iconst_m1      
        //    77: iconst_0       
        //    78: invokestatic    android/os/Message.obtain:(Landroid/os/Handler;III)Landroid/os/Message;
        //    81: invokevirtual   android/os/Handler.sendMessage:(Landroid/os/Message;)Z
        //    84: pop            
        //    85: iload_2        
        //    86: ifeq            414
        //    89: aload_3        
        //    90: invokevirtual   android/net/NetworkInfo.getState:()Landroid/net/NetworkInfo$State;
        //    93: astore          5
        //    95: getstatic       android/net/NetworkInfo$State.CONNECTED:Landroid/net/NetworkInfo$State;
        //    98: astore          6
        //   100: aload           5
        //   102: aload           6
        //   104: if_acmpne       288
        //   107: iconst_1       
        //   108: istore          7
        //   110: iload           7
        //   112: ifeq            408
        //   115: aload_3        
        //   116: invokestatic    com/whatsapp/messaging/CaptivePortalActivity.a:(Landroid/net/NetworkInfo;)Z
        //   119: istore          8
        //   121: aload_0        
        //   122: getfield        com/whatsapp/messaging/MessageService.B:Landroid/os/Handler;
        //   125: astore          11
        //   127: aload_0        
        //   128: getfield        com/whatsapp/messaging/MessageService.B:Landroid/os/Handler;
        //   131: astore          12
        //   133: aload_3        
        //   134: invokevirtual   android/net/NetworkInfo.getType:()I
        //   137: istore          13
        //   139: iload           7
        //   141: ifeq            304
        //   144: iload           8
        //   146: ifne            304
        //   149: iconst_1       
        //   150: istore          14
        //   152: aload           11
        //   154: aload           12
        //   156: iconst_0       
        //   157: iload           13
        //   159: iload           14
        //   161: invokestatic    android/os/Message.obtain:(Landroid/os/Handler;III)Landroid/os/Message;
        //   164: invokevirtual   android/os/Handler.sendMessage:(Landroid/os/Message;)Z
        //   167: pop            
        //   168: iload           7
        //   170: ifeq            330
        //   173: iload           8
        //   175: ifeq            330
        //   178: iload_1        
        //   179: ifne            389
        //   182: new             Landroid/content/Intent;
        //   185: dup            
        //   186: getstatic       com/whatsapp/messaging/MessageService.E:Ljava/lang/String;
        //   189: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //   192: astore          21
        //   194: aload_0        
        //   195: invokevirtual   com/whatsapp/messaging/MessageService.getApplicationContext:()Landroid/content/Context;
        //   198: iconst_0       
        //   199: aload           21
        //   201: iconst_0       
        //   202: invokestatic    android/app/PendingIntent.getBroadcast:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //   205: astore          22
        //   207: aload_0        
        //   208: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //   211: bipush          64
        //   213: aaload         
        //   214: invokevirtual   com/whatsapp/messaging/MessageService.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   217: checkcast       Landroid/app/AlarmManager;
        //   220: astore          23
        //   222: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   225: istore          26
        //   227: iload           26
        //   229: bipush          19
        //   231: if_icmplt       253
        //   234: aload           23
        //   236: iconst_2       
        //   237: ldc2_w          60000
        //   240: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //   243: ladd           
        //   244: aload           22
        //   246: invokevirtual   android/app/AlarmManager.setExact:(IJLandroid/app/PendingIntent;)V
        //   249: iload_2        
        //   250: ifeq            268
        //   253: aload           23
        //   255: iconst_2       
        //   256: ldc2_w          60000
        //   259: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //   262: ladd           
        //   263: aload           22
        //   265: invokevirtual   android/app/AlarmManager.set:(IJLandroid/app/PendingIntent;)V
        //   268: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //   271: bipush          63
        //   273: aaload         
        //   274: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   277: return         
        //   278: astore          27
        //   280: aload           27
        //   282: athrow         
        //   283: astore          4
        //   285: aload           4
        //   287: athrow         
        //   288: iconst_0       
        //   289: istore          7
        //   291: goto            110
        //   294: astore          9
        //   296: aload           9
        //   298: athrow         
        //   299: astore          10
        //   301: aload           10
        //   303: athrow         
        //   304: iconst_0       
        //   305: istore          14
        //   307: goto            152
        //   310: astore          15
        //   312: aload           15
        //   314: athrow         
        //   315: astore          16
        //   317: aload           16
        //   319: athrow         
        //   320: astore          24
        //   322: aload           24
        //   324: athrow         
        //   325: astore          25
        //   327: aload           25
        //   329: athrow         
        //   330: new             Landroid/content/Intent;
        //   333: dup            
        //   334: getstatic       com/whatsapp/messaging/MessageService.E:Ljava/lang/String;
        //   337: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //   340: astore          18
        //   342: aload_0        
        //   343: invokevirtual   com/whatsapp/messaging/MessageService.getApplicationContext:()Landroid/content/Context;
        //   346: iconst_0       
        //   347: aload           18
        //   349: ldc_w           536870912
        //   352: invokestatic    android/app/PendingIntent.getBroadcast:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //   355: astore          19
        //   357: aload           19
        //   359: ifnull          389
        //   362: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //   365: bipush          61
        //   367: aaload         
        //   368: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   371: aload_0        
        //   372: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //   375: bipush          62
        //   377: aaload         
        //   378: invokevirtual   com/whatsapp/messaging/MessageService.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   381: checkcast       Landroid/app/AlarmManager;
        //   384: aload           19
        //   386: invokevirtual   android/app/AlarmManager.cancel:(Landroid/app/PendingIntent;)V
        //   389: iload           8
        //   391: istore          20
        //   393: getstatic       com/whatsapp/messaging/MessageService.s:Ljava/util/concurrent/atomic/AtomicBoolean;
        //   396: iload           20
        //   398: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //   401: getstatic       com/whatsapp/messaging/MessageService.A:Ljava/util/concurrent/CountDownLatch;
        //   404: invokevirtual   java/util/concurrent/CountDownLatch.countDown:()V
        //   407: return         
        //   408: iconst_0       
        //   409: istore          8
        //   411: goto            121
        //   414: iconst_0       
        //   415: istore          20
        //   417: goto            393
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  67     85     278    283    Ljava/lang/NullPointerException;
        //  89     100    283    288    Ljava/lang/NullPointerException;
        //  121    139    294    304    Ljava/lang/NullPointerException;
        //  152    168    310    320    Ljava/lang/NullPointerException;
        //  222    227    320    325    Ljava/lang/NullPointerException;
        //  234    249    325    330    Ljava/lang/NullPointerException;
        //  253    268    325    330    Ljava/lang/NullPointerException;
        //  280    283    283    288    Ljava/lang/NullPointerException;
        //  296    299    299    304    Ljava/lang/NullPointerException;
        //  312    315    315    320    Ljava/lang/NullPointerException;
        //  322    325    325    330    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 201, Size: 201
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
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
    
    private void a(final boolean p0, final boolean p1, final String p2, final String[] p3, final boolean p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/messaging/e.a:Z
        //     3: istore          6
        //     5: aload_0        
        //     6: getfield        com/whatsapp/messaging/MessageService.w:Ljava/lang/Object;
        //     9: astore          7
        //    11: aload           7
        //    13: monitorenter   
        //    14: aload_0        
        //    15: getfield        com/whatsapp/messaging/MessageService.C:Lcom/whatsapp/messaging/a5;
        //    18: aload           4
        //    20: invokevirtual   com/whatsapp/messaging/a5.a:([Ljava/lang/String;)Ljava/util/ArrayList;
        //    23: astore          9
        //    25: aload_0        
        //    26: getfield        com/whatsapp/messaging/MessageService.e:Lcom/whatsapp/messaging/ar;
        //    29: invokevirtual   com/whatsapp/messaging/ar.a:()Z
        //    32: istore          12
        //    34: iload           12
        //    36: ifne            115
        //    39: iload_2        
        //    40: ifeq            61
        //    43: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //    46: bipush          34
        //    48: aaload         
        //    49: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    52: aload_0        
        //    53: getfield        com/whatsapp/messaging/MessageService.c:Lcom/whatsapp/messaging/f;
        //    56: invokeinterface com/whatsapp/messaging/f.e:()V
        //    61: aload_0        
        //    62: invokestatic    com/whatsapp/App.n:(Landroid/content/Context;)Z
        //    65: ifeq            83
        //    68: aload_0        
        //    69: invokespecial   com/whatsapp/messaging/MessageService.t:()Z
        //    72: istore          33
        //    74: iload           33
        //    76: ifne            83
        //    79: aload_0        
        //    80: invokespecial   com/whatsapp/messaging/MessageService.A:()V
        //    83: aload           7
        //    85: monitorexit    
        //    86: return         
        //    87: astore          10
        //    89: aload           10
        //    91: athrow         
        //    92: astore          11
        //    94: aload           11
        //    96: athrow         
        //    97: astore          8
        //    99: aload           7
        //   101: monitorexit    
        //   102: aload           8
        //   104: athrow         
        //   105: astore          31
        //   107: aload           31
        //   109: athrow         
        //   110: astore          32
        //   112: aload           32
        //   114: athrow         
        //   115: iload_1        
        //   116: ifeq            140
        //   119: aload_0        
        //   120: getfield        com/whatsapp/messaging/MessageService.y:Lcom/whatsapp/messaging/ar;
        //   123: iconst_1       
        //   124: invokevirtual   com/whatsapp/messaging/ar.a:(Z)V
        //   127: aload_0        
        //   128: getfield        com/whatsapp/messaging/MessageService.k:Lcom/whatsapp/messaging/ar;
        //   131: iconst_1       
        //   132: invokevirtual   com/whatsapp/messaging/ar.a:(Z)V
        //   135: iload           6
        //   137: ifeq            168
        //   140: aload_0        
        //   141: getfield        com/whatsapp/messaging/MessageService.y:Lcom/whatsapp/messaging/ar;
        //   144: invokevirtual   com/whatsapp/messaging/ar.a:()Z
        //   147: istore          14
        //   149: iload           14
        //   151: ifne            168
        //   154: aload           7
        //   156: monitorexit    
        //   157: return         
        //   158: astore          30
        //   160: aload           30
        //   162: athrow         
        //   163: astore          13
        //   165: aload           13
        //   167: athrow         
        //   168: aload_0        
        //   169: getfield        com/whatsapp/messaging/MessageService.z:Z
        //   172: ifeq            187
        //   175: aload_0        
        //   176: getfield        com/whatsapp/messaging/MessageService.f:I
        //   179: istore          29
        //   181: iload           29
        //   183: iconst_m1      
        //   184: if_icmpne       310
        //   187: aload_0        
        //   188: getfield        com/whatsapp/messaging/MessageService.y:Lcom/whatsapp/messaging/ar;
        //   191: invokevirtual   com/whatsapp/messaging/ar.a:()Z
        //   194: istore          19
        //   196: iload           19
        //   198: ifeq            277
        //   201: aload_0        
        //   202: getfield        com/whatsapp/messaging/MessageService.k:Lcom/whatsapp/messaging/ar;
        //   205: invokevirtual   com/whatsapp/messaging/ar.a:()Z
        //   208: istore          20
        //   210: iload           20
        //   212: ifeq            277
        //   215: aload_0        
        //   216: getfield        com/whatsapp/messaging/MessageService.k:Lcom/whatsapp/messaging/ar;
        //   219: iconst_0       
        //   220: invokevirtual   com/whatsapp/messaging/ar.a:(Z)V
        //   223: new             Ljava/lang/StringBuilder;
        //   226: dup            
        //   227: invokespecial   java/lang/StringBuilder.<init>:()V
        //   230: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //   233: bipush          35
        //   235: aaload         
        //   236: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   239: aload_0        
        //   240: getfield        com/whatsapp/messaging/MessageService.z:Z
        //   243: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   246: bipush          44
        //   248: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   251: aload_0        
        //   252: getfield        com/whatsapp/messaging/MessageService.f:I
        //   255: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   258: bipush          41
        //   260: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   263: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   266: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   269: invokestatic    com/whatsapp/App.a6:()V
        //   272: iload           6
        //   274: ifeq            310
        //   277: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //   280: bipush          33
        //   282: aaload         
        //   283: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   286: aload           7
        //   288: monitorexit    
        //   289: return         
        //   290: astore          15
        //   292: aload           15
        //   294: athrow         
        //   295: astore          16
        //   297: aload           16
        //   299: athrow         
        //   300: astore          17
        //   302: aload           17
        //   304: athrow         
        //   305: astore          18
        //   307: aload           18
        //   309: athrow         
        //   310: aload_0        
        //   311: getfield        com/whatsapp/messaging/MessageService.h:Z
        //   314: ifne            321
        //   317: aload           7
        //   319: monitorexit    
        //   320: return         
        //   321: aload_0        
        //   322: getfield        com/whatsapp/messaging/MessageService.H:Lcom/whatsapp/messaging/az;
        //   325: ifnull          350
        //   328: aload_0        
        //   329: getfield        com/whatsapp/messaging/MessageService.c:Lcom/whatsapp/messaging/f;
        //   332: astore          23
        //   334: aload           23
        //   336: ifnull          350
        //   339: aload_0        
        //   340: getfield        com/whatsapp/messaging/MessageService.o:Z
        //   343: istore          24
        //   345: iload           24
        //   347: ifeq            364
        //   350: aload           7
        //   352: monitorexit    
        //   353: return         
        //   354: astore          21
        //   356: aload           21
        //   358: athrow         
        //   359: astore          22
        //   361: aload           22
        //   363: athrow         
        //   364: invokestatic    com/whatsapp/App.p:()Z
        //   367: ifne            383
        //   370: invokestatic    com/whatsapp/l7.d:()Z
        //   373: istore          28
        //   375: iconst_0       
        //   376: istore          27
        //   378: iload           28
        //   380: ifeq            386
        //   383: iconst_1       
        //   384: istore          27
        //   386: iload           27
        //   388: invokestatic    com/whatsapp/App.a:(Z)V
        //   391: aload_0        
        //   392: getfield        com/whatsapp/messaging/MessageService.c:Lcom/whatsapp/messaging/f;
        //   395: aload_0        
        //   396: getfield        com/whatsapp/messaging/MessageService.r:Ljava/lang/String;
        //   399: aload_0        
        //   400: getfield        com/whatsapp/messaging/MessageService.G:[B
        //   403: aload_3        
        //   404: iload           27
        //   406: getstatic       com/whatsapp/App.an:Z
        //   409: aload           9
        //   411: iload           5
        //   413: invokeinterface com/whatsapp/messaging/f.a:(Ljava/lang/String;[BLjava/lang/String;ZZLjava/util/ArrayList;Z)V
        //   418: aload           7
        //   420: monitorexit    
        //   421: return         
        //   422: astore          25
        //   424: aload           25
        //   426: athrow         
        //   427: astore          26
        //   429: aload           26
        //   431: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  14     25     97     105    Any
        //  25     34     87     92     Ljava/lang/NullPointerException;
        //  25     34     97     105    Any
        //  43     61     92     97     Ljava/lang/NullPointerException;
        //  43     61     97     105    Any
        //  61     74     105    110    Ljava/lang/NullPointerException;
        //  61     74     97     105    Any
        //  79     83     110    115    Ljava/lang/NullPointerException;
        //  79     83     97     105    Any
        //  83     86     97     105    Any
        //  89     92     92     97     Ljava/lang/NullPointerException;
        //  89     92     97     105    Any
        //  94     97     97     105    Any
        //  99     102    97     105    Any
        //  107    110    110    115    Ljava/lang/NullPointerException;
        //  107    110    97     105    Any
        //  112    115    97     105    Any
        //  119    135    158    163    Ljava/lang/NullPointerException;
        //  119    135    97     105    Any
        //  140    149    163    168    Ljava/lang/NullPointerException;
        //  140    149    97     105    Any
        //  154    157    97     105    Any
        //  160    163    163    168    Ljava/lang/NullPointerException;
        //  160    163    97     105    Any
        //  165    168    97     105    Any
        //  168    181    290    295    Ljava/lang/NullPointerException;
        //  168    181    97     105    Any
        //  187    196    295    300    Ljava/lang/NullPointerException;
        //  187    196    97     105    Any
        //  201    210    300    305    Ljava/lang/NullPointerException;
        //  201    210    97     105    Any
        //  215    272    305    310    Ljava/lang/NullPointerException;
        //  215    272    97     105    Any
        //  277    289    97     105    Any
        //  292    295    295    300    Ljava/lang/NullPointerException;
        //  292    295    97     105    Any
        //  297    300    300    305    Ljava/lang/NullPointerException;
        //  297    300    97     105    Any
        //  302    305    305    310    Ljava/lang/NullPointerException;
        //  302    305    97     105    Any
        //  307    310    97     105    Any
        //  310    320    97     105    Any
        //  321    334    354    359    Ljava/lang/NullPointerException;
        //  321    334    97     105    Any
        //  339    345    359    364    Ljava/lang/NullPointerException;
        //  339    345    97     105    Any
        //  350    353    97     105    Any
        //  356    359    359    364    Ljava/lang/NullPointerException;
        //  356    359    97     105    Any
        //  361    364    97     105    Any
        //  364    375    422    432    Ljava/lang/NullPointerException;
        //  364    375    97     105    Any
        //  386    421    97     105    Any
        //  424    427    427    432    Ljava/lang/NullPointerException;
        //  424    427    97     105    Any
        //  429    432    97     105    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 211, Size: 211
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
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
    
    private void b() {
        synchronized (this.l) {
            Log.i(MessageService.J[2]);
            final PendingIntent broadcast = PendingIntent.getBroadcast((Context)this, 0, this.q(), 536870912);
            if (broadcast != null) {
                ((AlarmManager)this.getSystemService(MessageService.J[3])).cancel(broadcast);
                broadcast.cancel();
            }
        }
    }
    
    public static void b(final Context context) {
        context.startService(new Intent(context, (Class)MessageService.class).setAction(MessageService.J[31]));
    }
    
    public static void b(final Context context, final boolean b) {
        a(context, b, false, false, null, null, false);
    }
    
    static void b(final MessageService messageService) {
        messageService.h();
    }
    
    static void b(final MessageService messageService, final boolean b) {
        messageService.d(b);
    }
    
    private void b(final boolean h) {
        this.h = h;
    }
    
    private void c() {
        final boolean a = com.whatsapp.messaging.e.a;
        synchronized (this.D) {
            final Iterator<Map.Entry<K, as>> iterator = this.D.entrySet().iterator();
            while (iterator.hasNext()) {
                iterator.next().getValue().a();
                if (a) {
                    break;
                }
            }
            this.D.clear();
        }
    }
    
    static void c(final MessageService messageService) {
        messageService.d();
    }
    
    static void c(final MessageService messageService, final boolean b) {
        messageService.a(b);
    }
    
    private void c(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/messaging/MessageService.w:Ljava/lang/Object;
        //     4: astore_2       
        //     5: aload_2        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        com/whatsapp/messaging/MessageService.e:Lcom/whatsapp/messaging/ar;
        //    11: iconst_1       
        //    12: invokevirtual   com/whatsapp/messaging/ar.a:(Z)V
        //    15: aload_0        
        //    16: invokespecial   com/whatsapp/messaging/MessageService.B:()V
        //    19: aload_0        
        //    20: invokespecial   com/whatsapp/messaging/MessageService.c:()V
        //    23: aload_0        
        //    24: getfield        com/whatsapp/messaging/MessageService.F:Ljava/util/concurrent/atomic/AtomicInteger;
        //    27: iconst_0       
        //    28: invokevirtual   java/util/concurrent/atomic/AtomicInteger.set:(I)V
        //    31: aload_0        
        //    32: getfield        com/whatsapp/messaging/MessageService.H:Lcom/whatsapp/messaging/az;
        //    35: invokeinterface com/whatsapp/messaging/az.e:()V
        //    40: aload_0        
        //    41: invokespecial   com/whatsapp/messaging/MessageService.v:()V
        //    44: aload_0        
        //    45: invokespecial   com/whatsapp/messaging/MessageService.b:()V
        //    48: iload_1        
        //    49: ifeq            109
        //    52: aload_0        
        //    53: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //    56: bipush          68
        //    58: aaload         
        //    59: invokevirtual   com/whatsapp/messaging/MessageService.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    62: checkcast       Landroid/net/ConnectivityManager;
        //    65: invokevirtual   android/net/ConnectivityManager.getActiveNetworkInfo:()Landroid/net/NetworkInfo;
        //    68: astore          4
        //    70: aload           4
        //    72: ifnull          101
        //    75: aload           4
        //    77: invokevirtual   android/net/NetworkInfo.isConnected:()Z
        //    80: istore          9
        //    82: iload           9
        //    84: ifeq            101
        //    87: aload_0        
        //    88: invokespecial   com/whatsapp/messaging/MessageService.f:()V
        //    91: getstatic       com/whatsapp/messaging/e.a:Z
        //    94: istore          10
        //    96: iload           10
        //    98: ifeq            109
        //   101: aload_0        
        //   102: getfield        com/whatsapp/messaging/MessageService.y:Lcom/whatsapp/messaging/ar;
        //   105: iconst_1       
        //   106: invokevirtual   com/whatsapp/messaging/ar.a:(Z)V
        //   109: getstatic       com/whatsapp/App.X:Lcom/whatsapp/o6;
        //   112: invokevirtual   com/whatsapp/o6.d:()Z
        //   115: ifeq            126
        //   118: aload_0        
        //   119: getfield        com/whatsapp/messaging/MessageService.y:Lcom/whatsapp/messaging/ar;
        //   122: iconst_1       
        //   123: invokevirtual   com/whatsapp/messaging/ar.a:(Z)V
        //   126: aload_2        
        //   127: monitorexit    
        //   128: return         
        //   129: astore          7
        //   131: aload           7
        //   133: athrow         
        //   134: astore          8
        //   136: aload           8
        //   138: athrow         
        //   139: astore          5
        //   141: aload           5
        //   143: athrow         
        //   144: astore_3       
        //   145: aload_2        
        //   146: monitorexit    
        //   147: aload_3        
        //   148: athrow         
        //   149: astore          6
        //   151: aload           6
        //   153: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  7      48     144    149    Any
        //  52     70     144    149    Any
        //  75     82     129    134    Ljava/lang/NullPointerException;
        //  75     82     144    149    Any
        //  87     96     134    139    Ljava/lang/NullPointerException;
        //  87     96     144    149    Any
        //  101    109    139    144    Ljava/lang/NullPointerException;
        //  101    109    144    149    Any
        //  109    126    149    154    Ljava/lang/NullPointerException;
        //  109    126    144    149    Any
        //  126    128    144    149    Any
        //  131    134    134    139    Ljava/lang/NullPointerException;
        //  131    134    144    149    Any
        //  136    139    139    144    Ljava/lang/NullPointerException;
        //  136    139    144    149    Any
        //  141    144    144    149    Any
        //  145    147    144    149    Any
        //  151    154    144    149    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 78, Size: 78
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
    
    private void d() {
        this.H.d();
    }
    
    static void d(final MessageService messageService) {
        messageService.s();
    }
    
    private void d(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/messaging/e.a:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/messaging/MessageService.z:Z
        //     8: istore          7
        //    10: iload           7
        //    12: iload_1        
        //    13: if_icmpeq       77
        //    16: iload_1        
        //    17: ifeq            42
        //    20: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //    23: bipush          65
        //    25: aaload         
        //    26: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    29: aload_0        
        //    30: iconst_1       
        //    31: iconst_0       
        //    32: aconst_null    
        //    33: aconst_null    
        //    34: iconst_0       
        //    35: invokespecial   com/whatsapp/messaging/MessageService.a:(ZZLjava/lang/String;[Ljava/lang/String;Z)V
        //    38: iload_2        
        //    39: ifeq            68
        //    42: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //    45: bipush          66
        //    47: aaload         
        //    48: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    51: aload_0        
        //    52: getfield        com/whatsapp/messaging/MessageService.c:Lcom/whatsapp/messaging/f;
        //    55: ifnull          68
        //    58: aload_0        
        //    59: getfield        com/whatsapp/messaging/MessageService.c:Lcom/whatsapp/messaging/f;
        //    62: iconst_1       
        //    63: invokeinterface com/whatsapp/messaging/f.a:(Z)V
        //    68: aload_0        
        //    69: iload_1        
        //    70: putfield        com/whatsapp/messaging/MessageService.z:Z
        //    73: iload_2        
        //    74: ifeq            90
        //    77: iload_1        
        //    78: ifeq            90
        //    81: aload_0        
        //    82: iconst_0       
        //    83: iconst_1       
        //    84: aconst_null    
        //    85: aconst_null    
        //    86: iconst_0       
        //    87: invokespecial   com/whatsapp/messaging/MessageService.a:(ZZLjava/lang/String;[Ljava/lang/String;Z)V
        //    90: return         
        //    91: astore_3       
        //    92: aload_3        
        //    93: athrow         
        //    94: astore          4
        //    96: aload           4
        //    98: athrow         
        //    99: astore          5
        //   101: aload           5
        //   103: athrow         
        //   104: astore          6
        //   106: aload           6
        //   108: athrow         
        //   109: astore          9
        //   111: aload           9
        //   113: athrow         
        //   114: astore          8
        //   116: aload           8
        //   118: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      10     91     99     Ljava/lang/NullPointerException;
        //  20     38     99     104    Ljava/lang/NullPointerException;
        //  42     68     104    109    Ljava/lang/NullPointerException;
        //  68     73     109    114    Ljava/lang/NullPointerException;
        //  81     90     114    119    Ljava/lang/NullPointerException;
        //  92     94     94     99     Ljava/lang/NullPointerException;
        //  96     99     99     104    Ljava/lang/NullPointerException;
        //  101    104    104    109    Ljava/lang/NullPointerException;
        //  111    114    114    119    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 67, Size: 67
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
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
    
    static f e(final MessageService messageService) {
        return messageService.c;
    }
    
    static Handler f(final MessageService messageService) {
        return messageService.d;
    }
    
    private void f() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/messaging/MessageService.t:Z
        //     4: ifeq            20
        //     7: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //    10: bipush          49
        //    12: aaload         
        //    13: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    16: return         
        //    17: astore_1       
        //    18: aload_1        
        //    19: athrow         
        //    20: aload_0        
        //    21: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //    24: bipush          54
        //    26: aaload         
        //    27: invokevirtual   com/whatsapp/messaging/MessageService.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    30: checkcast       Landroid/app/AlarmManager;
        //    33: astore_2       
        //    34: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //    37: lstore_3       
        //    38: new             Landroid/content/Intent;
        //    41: dup            
        //    42: aload_0        
        //    43: ldc             Lcom/whatsapp/messaging/MessageService;.class
        //    45: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //    48: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //    51: bipush          50
        //    53: aaload         
        //    54: invokevirtual   android/content/Intent.setAction:(Ljava/lang/String;)Landroid/content/Intent;
        //    57: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //    60: bipush          53
        //    62: aaload         
        //    63: iconst_1       
        //    64: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //    67: astore          5
        //    69: aload_0        
        //    70: invokespecial   com/whatsapp/messaging/MessageService.y:()J
        //    73: lstore          6
        //    75: lload           6
        //    77: lconst_0       
        //    78: lcmp           
        //    79: ifne            104
        //    82: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //    85: bipush          51
        //    87: aaload         
        //    88: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    91: aload_0        
        //    92: aload           5
        //    94: invokevirtual   com/whatsapp/messaging/MessageService.startService:(Landroid/content/Intent;)Landroid/content/ComponentName;
        //    97: pop            
        //    98: return         
        //    99: astore          16
        //   101: aload           16
        //   103: athrow         
        //   104: lload           6
        //   106: ldc2_w          2
        //   109: ldiv           
        //   110: aload_0        
        //   111: getfield        com/whatsapp/messaging/MessageService.u:Ljava/util/Random;
        //   114: invokevirtual   java/util/Random.nextLong:()J
        //   117: lload           6
        //   119: lrem           
        //   120: ladd           
        //   121: lstore          8
        //   123: new             Ljava/lang/StringBuilder;
        //   126: dup            
        //   127: invokespecial   java/lang/StringBuilder.<init>:()V
        //   130: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //   133: bipush          52
        //   135: aaload         
        //   136: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   139: lload           8
        //   141: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   144: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   147: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   150: aload_0        
        //   151: iconst_0       
        //   152: aload           5
        //   154: iconst_0       
        //   155: invokestatic    android/app/PendingIntent.getService:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //   158: astore          10
        //   160: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   163: istore          13
        //   165: iload           13
        //   167: bipush          19
        //   169: if_icmplt       193
        //   172: lload_3        
        //   173: lload           8
        //   175: ladd           
        //   176: lstore          14
        //   178: aload_2        
        //   179: iconst_2       
        //   180: lload           14
        //   182: aload           10
        //   184: invokevirtual   android/app/AlarmManager.setExact:(IJLandroid/app/PendingIntent;)V
        //   187: getstatic       com/whatsapp/messaging/e.a:Z
        //   190: ifeq            204
        //   193: aload_2        
        //   194: iconst_2       
        //   195: lload_3        
        //   196: lload           8
        //   198: ladd           
        //   199: aload           10
        //   201: invokevirtual   android/app/AlarmManager.set:(IJLandroid/app/PendingIntent;)V
        //   204: aload_0        
        //   205: iconst_1       
        //   206: putfield        com/whatsapp/messaging/MessageService.t:Z
        //   209: return         
        //   210: astore          11
        //   212: aload           11
        //   214: athrow         
        //   215: astore          12
        //   217: aload           12
        //   219: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      16     17     20     Ljava/lang/NullPointerException;
        //  82     98     99     104    Ljava/lang/NullPointerException;
        //  160    165    210    215    Ljava/lang/NullPointerException;
        //  178    193    215    220    Ljava/lang/NullPointerException;
        //  193    204    215    220    Ljava/lang/NullPointerException;
        //  212    215    215    220    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0193:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
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
    
    static void g(final MessageService messageService) {
        messageService.m();
    }
    
    static boolean g() {
        Log.i(MessageService.J[16]);
        MessageService.A.await();
        final boolean value = MessageService.s.get();
        Log.i(MessageService.J[15] + value);
        return value;
    }
    
    private void h() {
        this.H.a();
    }
    
    static void h(final MessageService messageService) {
        messageService.w();
    }
    
    static void i(final MessageService messageService) {
        messageService.x();
    }
    
    static String j() {
        return MessageService.x;
    }
    
    static String k() {
        return MessageService.a;
    }
    
    private void m() {
        this.H.f();
    }
    
    private void n() {
        synchronized (this.n) {
            Log.i(MessageService.J[32]);
            this.j = 0L;
            this.b = 10000L;
        }
    }
    
    private void p() {
        while (true) {
            while (true) {
                synchronized (this.w) {
                    final ar y = this.y;
                    if (!App.n((Context)this)) {
                        final boolean b = true;
                        y.a(b);
                        return;
                    }
                }
                final boolean b = false;
                continue;
            }
        }
    }
    
    private Intent q() {
        return new Intent(MessageService.x).setPackage(MessageService.J[20]);
    }
    
    static String r() {
        return MessageService.E;
    }
    
    private void s() {
        synchronized (this.w) {
            this.e.a(false);
            this.H.c();
            if (App.n((Context)this)) {
                this.A();
            }
            this.n();
            this.p();
            this.a();
        }
    }
    
    private boolean t() {
        synchronized (this.l) {
            final PendingIntent broadcast = PendingIntent.getBroadcast((Context)this, 0, this.q(), 536870912);
            boolean b = false;
            if (broadcast != null) {
                b = true;
            }
            Log.i(MessageService.J[19] + b);
            return b;
        }
    }
    
    private void u() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //     3: bipush          29
        //     5: aaload         
        //     6: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //     9: aload_0        
        //    10: getfield        com/whatsapp/messaging/MessageService.h:Z
        //    13: istore_2       
        //    14: iload_2        
        //    15: ifne            22
        //    18: return         
        //    19: astore_1       
        //    20: aload_1        
        //    21: athrow         
        //    22: aload_0        
        //    23: iconst_0       
        //    24: invokespecial   com/whatsapp/messaging/MessageService.b:(Z)V
        //    27: aload_0        
        //    28: getfield        com/whatsapp/messaging/MessageService.w:Ljava/lang/Object;
        //    31: astore_3       
        //    32: aload_3        
        //    33: monitorenter   
        //    34: aload_0        
        //    35: getfield        com/whatsapp/messaging/MessageService.e:Lcom/whatsapp/messaging/ar;
        //    38: invokevirtual   com/whatsapp/messaging/ar.a:()Z
        //    41: ifne            53
        //    44: aload_0        
        //    45: getfield        com/whatsapp/messaging/MessageService.H:Lcom/whatsapp/messaging/az;
        //    48: invokeinterface com/whatsapp/messaging/az.e:()V
        //    53: aload_0        
        //    54: getfield        com/whatsapp/messaging/MessageService.e:Lcom/whatsapp/messaging/ar;
        //    57: iconst_1       
        //    58: invokevirtual   com/whatsapp/messaging/ar.a:(Z)V
        //    61: aload_3        
        //    62: monitorexit    
        //    63: aload_0        
        //    64: getfield        com/whatsapp/messaging/MessageService.c:Lcom/whatsapp/messaging/f;
        //    67: ifnull          141
        //    70: aload_0        
        //    71: aload_0        
        //    72: getfield        com/whatsapp/messaging/MessageService.i:Landroid/content/BroadcastReceiver;
        //    75: invokevirtual   com/whatsapp/messaging/MessageService.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
        //    78: aload_0        
        //    79: getfield        com/whatsapp/messaging/MessageService.g:Landroid/os/HandlerThread;
        //    82: invokevirtual   android/os/HandlerThread.quit:()Z
        //    85: pop            
        //    86: aload_0        
        //    87: getfield        com/whatsapp/messaging/MessageService.g:Landroid/os/HandlerThread;
        //    90: invokevirtual   android/os/HandlerThread.join:()V
        //    93: aload_0        
        //    94: aconst_null    
        //    95: putfield        com/whatsapp/messaging/MessageService.g:Landroid/os/HandlerThread;
        //    98: aload_0        
        //    99: aconst_null    
        //   100: putfield        com/whatsapp/messaging/MessageService.d:Landroid/os/Handler;
        //   103: new             Ljava/util/concurrent/CountDownLatch;
        //   106: dup            
        //   107: iconst_1       
        //   108: invokespecial   java/util/concurrent/CountDownLatch.<init>:(I)V
        //   111: putstatic       com/whatsapp/messaging/MessageService.A:Ljava/util/concurrent/CountDownLatch;
        //   114: getstatic       com/whatsapp/messaging/MessageService.s:Ljava/util/concurrent/atomic/AtomicBoolean;
        //   117: iconst_0       
        //   118: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //   121: aload_0        
        //   122: getfield        com/whatsapp/messaging/MessageService.c:Lcom/whatsapp/messaging/f;
        //   125: invokeinterface com/whatsapp/messaging/f.a:()V
        //   130: aload_0        
        //   131: aconst_null    
        //   132: putfield        com/whatsapp/messaging/MessageService.c:Lcom/whatsapp/messaging/f;
        //   135: getstatic       com/whatsapp/messaging/e.a:Z
        //   138: ifeq            18
        //   141: aload_0        
        //   142: getfield        com/whatsapp/messaging/MessageService.q:Lcom/whatsapp/messaging/ae;
        //   145: invokevirtual   com/whatsapp/messaging/ae.quit:()Z
        //   148: pop            
        //   149: return         
        //   150: astore          6
        //   152: aload           6
        //   154: athrow         
        //   155: astore          4
        //   157: aload_3        
        //   158: monitorexit    
        //   159: aload           4
        //   161: athrow         
        //   162: astore          5
        //   164: aload           5
        //   166: athrow         
        //   167: astore          9
        //   169: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //   172: bipush          30
        //   174: aaload         
        //   175: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   178: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   181: invokevirtual   java/lang/Thread.interrupt:()V
        //   184: goto            93
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      14     19     22     Ljava/lang/InterruptedException;
        //  34     53     155    162    Any
        //  53     63     155    162    Any
        //  63     86     162    167    Ljava/lang/NullPointerException;
        //  86     93     167    187    Ljava/lang/InterruptedException;
        //  86     93     162    167    Ljava/lang/NullPointerException;
        //  93     141    150    155    Ljava/lang/InterruptedException;
        //  141    149    150    155    Ljava/lang/InterruptedException;
        //  157    159    155    162    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 94, Size: 94
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
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
    
    private void v() {
        Log.i(MessageService.J[75]);
        final AlarmManager alarmManager = (AlarmManager)this.getSystemService(MessageService.J[76]);
        final PendingIntent broadcast = PendingIntent.getBroadcast((Context)this, 0, new Intent(MessageService.a), 536870912);
        if (broadcast == null) {
            return;
        }
        try {
            alarmManager.cancel(broadcast);
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    private void w() {
        this.p();
    }
    
    private void x() {
        synchronized (this.l) {
            Log.i(MessageService.J[57]);
            if (this.t()) {
                this.A();
            }
        }
    }
    
    private long y() {
        synchronized (this.n) {
            if (this.j > 172800000L) {
                return 172800000L;
            }
            this.b += this.j;
            this.j = this.b - this.j;
            return this.b - this.j;
        }
    }
    
    private void z() {
        try {
            if (this.h) {
                return;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        Log.i(MessageService.J[1]);
        this.b(true);
        (this.q = new ae((Context)this, this.v)).start();
    }
    
    public Future a(final cr cr, final Message message) {
        if (cr == null) {
            try {
                throw new NullPointerException(MessageService.J[56]);
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        final t t = new t();
        this.a(cr, t);
        this.b(message);
        return t;
    }
    
    public Future a(final String s, final Message message) {
        if (s == null) {
            try {
                throw new NullPointerException(MessageService.J[55]);
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        final t t = new t();
        this.a(s, t);
        this.b(message);
        return t;
    }
    
    public void a(final String r, final byte[] g) {
        this.r = r;
        this.G = g;
    }
    
    public void a(final String r, final byte[] g, final az h) {
        try {
            this.r = r;
            this.G = g;
            this.H = h;
            this.a(true, false, null, null, false);
            if (this.c != null) {
                h.b();
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    public void b(final Message p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //    10: bipush          18
        //    12: aaload         
        //    13: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    16: aload_1        
        //    17: invokestatic    com/whatsapp/messaging/e.c:(Landroid/os/Message;)I
        //    20: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    23: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    26: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    29: aload_1        
        //    30: invokestatic    com/whatsapp/messaging/e.e:(Landroid/os/Message;)Z
        //    33: istore_2       
        //    34: iload_2        
        //    35: ifeq            51
        //    38: aload_0        
        //    39: getfield        com/whatsapp/messaging/MessageService.c:Lcom/whatsapp/messaging/f;
        //    42: aload_1        
        //    43: invokestatic    android/os/Message.obtain:(Landroid/os/Message;)Landroid/os/Message;
        //    46: invokeinterface com/whatsapp/messaging/f.a:(Landroid/os/Message;)V
        //    51: aload_1        
        //    52: invokestatic    com/whatsapp/messaging/e.d:(Landroid/os/Message;)Z
        //    55: ifeq            75
        //    58: aload_0        
        //    59: invokespecial   com/whatsapp/messaging/MessageService.x:()V
        //    62: aload_0        
        //    63: invokespecial   com/whatsapp/messaging/MessageService.n:()V
        //    66: aload_0        
        //    67: iconst_1       
        //    68: iconst_0       
        //    69: aconst_null    
        //    70: aconst_null    
        //    71: iconst_0       
        //    72: invokespecial   com/whatsapp/messaging/MessageService.a:(ZZLjava/lang/String;[Ljava/lang/String;Z)V
        //    75: iload_2        
        //    76: ifne            92
        //    79: aload_0        
        //    80: getfield        com/whatsapp/messaging/MessageService.c:Lcom/whatsapp/messaging/f;
        //    83: aload_1        
        //    84: invokestatic    android/os/Message.obtain:(Landroid/os/Message;)Landroid/os/Message;
        //    87: invokeinterface com/whatsapp/messaging/f.a:(Landroid/os/Message;)V
        //    92: return         
        //    93: astore          5
        //    95: aload           5
        //    97: athrow         
        //    98: astore_3       
        //    99: aload_3        
        //   100: athrow         
        //   101: astore          4
        //   103: aload           4
        //   105: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  38     51     93     98     Ljava/lang/NullPointerException;
        //  51     75     98     101    Ljava/lang/NullPointerException;
        //  79     92     101    106    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 53, Size: 53
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
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
    
    public String e() {
        return "0" + Integer.toHexString(this.F.getAndIncrement());
    }
    
    public void i() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/messaging/MessageService.c:Lcom/whatsapp/messaging/f;
        //     4: astore_3       
        //     5: aload_3        
        //     6: ifnull          24
        //     9: aload_0        
        //    10: getfield        com/whatsapp/messaging/MessageService.c:Lcom/whatsapp/messaging/f;
        //    13: invokeinterface com/whatsapp/messaging/f.c:()V
        //    18: getstatic       com/whatsapp/messaging/e.a:Z
        //    21: ifeq            39
        //    24: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //    27: iconst_0       
        //    28: aaload         
        //    29: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    32: return         
        //    33: astore_1       
        //    34: aload_1        
        //    35: athrow         
        //    36: astore_2       
        //    37: aload_2        
        //    38: athrow         
        //    39: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      5      33     36     Ljava/lang/NullPointerException;
        //  9      24     36     39     Ljava/lang/NullPointerException;
        //  24     32     36     39     Ljava/lang/NullPointerException;
        //  34     36     36     39     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0024:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
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
    
    public void l() {
        App.F(MessageService.J[17]);
        this.c.d();
    }
    
    public void o() {
        App.F(MessageService.J[48]);
        this.c.b();
        this.x();
        this.n();
        this.a(true, false, null, null, false);
        this.c.e();
    }
    
    public IBinder onBind(final Intent intent) {
        return (IBinder)this.I;
    }
    
    public void onCreate() {
        super.onCreate();
        Log.i(MessageService.J[24]);
        this.registerReceiver(this.p, new IntentFilter(MessageService.a), MessageService.J[25], (Handler)null);
        this.registerReceiver(this.l, new IntentFilter(MessageService.x), MessageService.J[26], (Handler)null);
    }
    
    public void onDestroy() {
        try {
            super.onDestroy();
            Log.i(MessageService.J[67]);
            if (this.h) {
                this.u();
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    public int onStartCommand(final Intent p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/messaging/e.a:Z
        //     3: istore          4
        //     5: aload_1        
        //     6: ifnull          279
        //     9: aload_1        
        //    10: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //    13: astore          25
        //    15: aload           25
        //    17: astore          5
        //    19: aload           5
        //    21: ifnonnull       33
        //    24: aload_0        
        //    25: invokespecial   com/whatsapp/messaging/MessageService.z:()V
        //    28: iload           4
        //    30: ifeq            272
        //    33: aload           5
        //    35: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //    38: bipush          45
        //    40: aaload         
        //    41: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    44: istore          10
        //    46: iload           10
        //    48: ifeq            69
        //    51: aload_0        
        //    52: invokespecial   com/whatsapp/messaging/MessageService.u:()V
        //    55: aload_0        
        //    56: iconst_1       
        //    57: putfield        com/whatsapp/messaging/MessageService.o:Z
        //    60: aload_0        
        //    61: invokevirtual   com/whatsapp/messaging/MessageService.stopSelf:()V
        //    64: iload           4
        //    66: ifeq            272
        //    69: aload           5
        //    71: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //    74: bipush          39
        //    76: aaload         
        //    77: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    80: istore          11
        //    82: iload           11
        //    84: ifeq            101
        //    87: aload_0        
        //    88: iconst_0       
        //    89: putfield        com/whatsapp/messaging/MessageService.o:Z
        //    92: aload_0        
        //    93: invokespecial   com/whatsapp/messaging/MessageService.z:()V
        //    96: iload           4
        //    98: ifeq            272
        //   101: aload           5
        //   103: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //   106: bipush          44
        //   108: aaload         
        //   109: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   112: istore          12
        //   114: iload           12
        //   116: ifeq            232
        //   119: aload_0        
        //   120: iconst_0       
        //   121: putfield        com/whatsapp/messaging/MessageService.t:Z
        //   124: aload_0        
        //   125: invokespecial   com/whatsapp/messaging/MessageService.z:()V
        //   128: aload_1        
        //   129: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //   132: bipush          40
        //   134: aaload         
        //   135: iconst_0       
        //   136: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   139: istore          16
        //   141: aload_1        
        //   142: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //   145: bipush          37
        //   147: aaload         
        //   148: iconst_0       
        //   149: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   152: istore          17
        //   154: aload_1        
        //   155: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //   158: bipush          47
        //   160: aaload         
        //   161: iconst_0       
        //   162: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   165: istore          18
        //   167: aload_1        
        //   168: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //   171: bipush          42
        //   173: aaload         
        //   174: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   177: astore          19
        //   179: aload_1        
        //   180: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //   183: bipush          38
        //   185: aaload         
        //   186: invokevirtual   android/content/Intent.getStringArrayExtra:(Ljava/lang/String;)[Ljava/lang/String;
        //   189: astore          20
        //   191: aload_1        
        //   192: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //   195: bipush          43
        //   197: aaload         
        //   198: iconst_0       
        //   199: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   202: istore          21
        //   204: iload           16
        //   206: ifeq            213
        //   209: aload_0        
        //   210: invokespecial   com/whatsapp/messaging/MessageService.n:()V
        //   213: aload_0        
        //   214: iload           17
        //   216: iload           18
        //   218: aload           19
        //   220: aload           20
        //   222: iload           21
        //   224: invokespecial   com/whatsapp/messaging/MessageService.a:(ZZLjava/lang/String;[Ljava/lang/String;Z)V
        //   227: iload           4
        //   229: ifeq            272
        //   232: aload           5
        //   234: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //   237: bipush          41
        //   239: aaload         
        //   240: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   243: istore          14
        //   245: iload           14
        //   247: ifeq            272
        //   250: aload_0        
        //   251: invokespecial   com/whatsapp/messaging/MessageService.z:()V
        //   254: aload_1        
        //   255: getstatic       com/whatsapp/messaging/MessageService.J:[Ljava/lang/String;
        //   258: bipush          46
        //   260: aaload         
        //   261: iconst_0       
        //   262: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   265: ifeq            272
        //   268: aload_0        
        //   269: invokespecial   com/whatsapp/messaging/MessageService.w:()V
        //   272: iconst_1       
        //   273: ireturn        
        //   274: astore          24
        //   276: aload           24
        //   278: athrow         
        //   279: aconst_null    
        //   280: astore          5
        //   282: goto            19
        //   285: astore          23
        //   287: aload           23
        //   289: athrow         
        //   290: astore          6
        //   292: aload           6
        //   294: athrow         
        //   295: astore          7
        //   297: aload           7
        //   299: athrow         
        //   300: astore          8
        //   302: aload           8
        //   304: athrow         
        //   305: astore          9
        //   307: aload           9
        //   309: athrow         
        //   310: astore          22
        //   312: aload           22
        //   314: athrow         
        //   315: astore          13
        //   317: aload           13
        //   319: athrow         
        //   320: astore          15
        //   322: aload           15
        //   324: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  9      15     274    279    Ljava/lang/NullPointerException;
        //  24     28     285    290    Ljava/lang/NullPointerException;
        //  33     46     290    295    Ljava/lang/NullPointerException;
        //  51     64     295    300    Ljava/lang/NullPointerException;
        //  69     82     300    305    Ljava/lang/NullPointerException;
        //  87     96     305    310    Ljava/lang/NullPointerException;
        //  101    114    305    310    Ljava/lang/NullPointerException;
        //  209    213    310    315    Ljava/lang/NullPointerException;
        //  213    227    315    320    Ljava/lang/NullPointerException;
        //  232    245    315    320    Ljava/lang/NullPointerException;
        //  268    272    320    325    Ljava/lang/NullPointerException;
        //  287    290    290    295    Ljava/lang/NullPointerException;
        //  292    295    295    300    Ljava/lang/NullPointerException;
        //  297    300    300    305    Ljava/lang/NullPointerException;
        //  302    305    305    310    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 164, Size: 164
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
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
}
