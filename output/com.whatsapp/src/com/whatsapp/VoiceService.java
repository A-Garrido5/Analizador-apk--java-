// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.IBinder;
import android.os.Vibrator;
import com.whatsapp.protocol.cr;
import android.content.ContextWrapper;
import android.media.AudioManager;
import com.whatsapp.protocol.c6;
import com.whatsapp.protocol.bi;
import android.os.PowerManager;
import com.whatsapp.fieldstats.aw;
import android.content.Intent;
import com.whatsapp.protocol.VoipOptions;
import android.content.Context;
import com.whatsapp.fieldstats.n;
import com.whatsapp.fieldstats.r;
import android.view.WindowManager$LayoutParams;
import android.view.View;
import android.view.Window;
import android.view.ViewGroup;
import com.whatsapp.util.Log;
import android.app.Notification;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import android.os.Build$VERSION;
import com.whatsapp.util.k;
import com.whatsapp.fieldstats.Events$Call;
import com.whatsapp.util.b4;
import android.os.PowerManager$WakeLock;
import android.media.SoundPool;
import com.whatsapp.fieldstats.w;
import android.telephony.PhoneStateListener;
import android.bluetooth.BluetoothHeadset;
import android.media.Ringtone;
import android.os.HandlerThread;
import android.content.BroadcastReceiver;
import android.bluetooth.BluetoothAdapter;
import android.net.Uri;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadPoolExecutor;
import com.whatsapp.messaging.l;
import android.app.Service;

public class VoiceService extends Service implements l
{
    private static final ThreadPoolExecutor C;
    private static final Object K;
    private static final String[] Z;
    private static AtomicInteger w;
    private Handler A;
    private boolean B;
    private boolean D;
    private boolean E;
    private Uri F;
    private BluetoothAdapter G;
    private BroadcastReceiver H;
    private boolean I;
    private aln J;
    private boolean L;
    private Handler M;
    private Double N;
    private String O;
    private BroadcastReceiver P;
    private Integer Q;
    private HandlerThread R;
    private boolean S;
    private VoiceService$VoiceServiceEventCallback T;
    private Voip$RecordingInfo[] U;
    private BroadcastReceiver V;
    private Ringtone W;
    private Double X;
    private asg Y;
    private BluetoothHeadset a;
    private boolean b;
    private boolean c;
    private PhoneStateListener d;
    private Handler e;
    private BroadcastReceiver f;
    private w g;
    private long[] h;
    private Handler i;
    private boolean j;
    private boolean k;
    private px l;
    private boolean m;
    private SoundPool n;
    private PowerManager$WakeLock o;
    private b4 p;
    private Events$Call q;
    private PowerManager$WakeLock r;
    private final pk s;
    private Boolean t;
    private boolean u;
    private int v;
    private k x;
    private String y;
    private Integer z;
    
    static {
        final String[] z = new String[205];
        String s = "\u0015\u001bb\"\"&\u0004|.&\u0017";
        int n = -1;
        String[] array = z;
        int n2 = 0;
    Label_0017:
        while (true) {
            while (true) {
                final char[] charArray = s.toCharArray();
                final int length = charArray.length;
                int n3 = 0;
                while (true) {
                    Label_5478: {
                        if (length > n3) {
                            break Label_5478;
                        }
                        final String intern = new String(charArray).intern();
                        switch (n) {
                            default: {
                                array[n2] = intern;
                                s = "\u0005\u001by1h\u0000\u0011b7.\u0010\u0011?%\"\u0000\u0000b.>";
                                n2 = 1;
                                array = z;
                                n = 0;
                                continue Label_0017;
                            }
                            case 0: {
                                array[n2] = intern;
                                n2 = 2;
                                array = z;
                                s = "\u0007\u0015w2";
                                n = 1;
                                continue Label_0017;
                            }
                            case 1: {
                                array[n2] = intern;
                                n2 = 3;
                                s = "\u0010\u001b}o0\u001b\u0015d2&\u0003\u0004>\r\b4+S\u0013\u000e'=S\u0000\u000b,1F\u0004\t'";
                                n = 2;
                                array = z;
                                continue Label_0017;
                            }
                            case 2: {
                                array[n2] = intern;
                                n2 = 4;
                                s = "\u0012\u0018q3*";
                                n = 3;
                                array = z;
                                continue Label_0017;
                            }
                            case 3: {
                                array[n2] = intern;
                                n2 = 5;
                                s = "\u0010\u001b}o0\u001b\u0015d2&\u0003\u0004";
                                n = 4;
                                array = z;
                                continue Label_0017;
                            }
                            case 4: {
                                array[n2] = intern;
                                n2 = 6;
                                s = "\u0010\u0006y5.\u0010\u0015|\u00041\u0016\u001ad";
                                n = 5;
                                array = z;
                                continue Label_0017;
                            }
                            case 5: {
                                array[n2] = intern;
                                n2 = 7;
                                s = "\u0005\u001by1h\u0000\u0011b7.\u0010\u0011?%\"\u0000\u0000b.>\u0016\u0010";
                                n = 6;
                                array = z;
                                continue Label_0017;
                            }
                            case 6: {
                                array[n2] = intern;
                                s = "%\u001bY\u0011g0\u0015|-g6\u001at$#";
                                n = 7;
                                n2 = 8;
                                array = z;
                                continue Label_0017;
                            }
                            case 7: {
                                array[n2] = intern;
                                n2 = 9;
                                array = z;
                                s = "\u0005\u001du6";
                                n = 8;
                                continue Label_0017;
                            }
                            case 8: {
                                array[n2] = intern;
                                n2 = 10;
                                s = "\u0005\u001by1h\u0001\u0011s$.\u0005\u0011O,\"\u0000\u0007q&\"\\\u0017q-+^\u0006u-&\nY| 3\u0016\u001as8j\u0012\u0017{";
                                n = 9;
                                array = z;
                                continue Label_0017;
                            }
                            case 9: {
                                array[n2] = intern;
                                n2 = 11;
                                s = "\u0005\u001by1h\u0001\u0011s$.\u0005\u0011O,\"\u0000\u0007q&\"\\\u0017q-+^\u001bv'\"\u0001Yq\"$\u0016\u0004d";
                                n = 10;
                                array = z;
                                continue Label_0017;
                            }
                            case 10: {
                                array[n2] = intern;
                                n2 = 12;
                                s = "\u001f\u0013u";
                                n = 11;
                                array = z;
                                continue Label_0017;
                            }
                            case 11: {
                                array[n2] = intern;
                                n2 = 13;
                                s = "GZ!ou";
                                n = 12;
                                array = z;
                                continue Label_0017;
                            }
                            case 12: {
                                array[n2] = intern;
                                n2 = 14;
                                s = "\u0017L t";
                                n = 13;
                                array = z;
                                continue Label_0017;
                            }
                            case 13: {
                                array[n2] = intern;
                                n2 = 15;
                                s = "\u0000C\"wu";
                                n = 14;
                                array = z;
                                continue Label_0017;
                            }
                            case 14: {
                                array[n2] = intern;
                                s = "\u0000A\"yu";
                                n = 15;
                                n2 = 16;
                                array = z;
                                continue Label_0017;
                            }
                            case 15: {
                                array[n2] = intern;
                                n2 = 17;
                                array = z;
                                s = "\u0000A\"yw";
                                n = 16;
                                continue Label_0017;
                            }
                            case 16: {
                                array[n2] = intern;
                                n2 = 18;
                                s = "GZ$ou";
                                n = 17;
                                array = z;
                                continue Label_0017;
                            }
                            case 17: {
                                array[n2] = intern;
                                n2 = 19;
                                s = "\u0000\u0015}22\u001d\u0013";
                                n = 18;
                                array = z;
                                continue Label_0017;
                            }
                            case 18: {
                                array[n2] = intern;
                                n2 = 20;
                                s = "\u0005\u001by1h\u0001\u001d~&3\u001c\u001aun5\u001a\u001aw$5,\u0019\u007f%\"\\\u0002y#5\u0012\u0000u";
                                n = 19;
                                array = z;
                                continue Label_0017;
                            }
                            case 19: {
                                array[n2] = intern;
                                n2 = 21;
                                s = "\u0006\u001a{/(\u0004\u001a07.\u0011\u0006q5\"S\u0004b$!\u0016\u0006u/$\u0016T";
                                n = 20;
                                array = z;
                                continue Label_0017;
                            }
                            case 20: {
                                array[n2] = intern;
                                n2 = 22;
                                s = "\u0010\u0015|-\u0018\u0005\u001dr3&\u0007\u0011O-\"\u001d\u0013d)";
                                n = 21;
                                array = z;
                                continue Label_0017;
                            }
                            case 21: {
                                array[n2] = intern;
                                n2 = 23;
                                s = "\u0005\u001by1h\u0001\u001d~&3\u001c\u001aun)\u001cYb()\u0014\u0000\u007f/\"S\u0012\u007f4)\u0017Tv.5S";
                                n = 22;
                                array = z;
                                continue Label_0017;
                            }
                            case 22: {
                                array[n2] = intern;
                                n2 = 24;
                                s = "\u0010\u0015|-\u0018\u0001\u001d~&3\u001c\u001au";
                                n = 23;
                                array = z;
                                continue Label_0017;
                            }
                            case 23: {
                                array[n2] = intern;
                                n2 = 25;
                                s = "\u0010\u001b~5\"\u001d\u0000*nh\u0000\u0011d5.\u001d\u0013cn4\n\u0007d$*\\\u0006y/ \u0007\u001b~$";
                                n = 24;
                                array = z;
                                continue Label_0017;
                            }
                            case 24: {
                                array[n2] = intern;
                                n2 = 26;
                                s = "\u0005\u001by1h\u0001\u001d~&3\u001c\u001aung";
                                n = 25;
                                array = z;
                                continue Label_0017;
                            }
                            case 25: {
                                array[n2] = intern;
                                n2 = 27;
                                s = "\u0010\u001b}o0\u001b\u0015d2&\u0003\u0004O15\u0016\u0012u3\"\u001d\u0017u2";
                                n = 26;
                                array = z;
                                continue Label_0017;
                            }
                            case 26: {
                                array[n2] = intern;
                                n2 = 28;
                                s = "\u0005\u001by1h\u0001\u001d~&3\u001c\u001aun7\u001f\u0015i";
                                n = 27;
                                array = z;
                                continue Label_0017;
                            }
                            case 27: {
                                array[n2] = intern;
                                n2 = 29;
                                s = "\u0005\u001dr3&\u0007\u001bb";
                                n = 28;
                                array = z;
                                continue Label_0017;
                            }
                            case 28: {
                                array[n2] = intern;
                                n2 = 30;
                                s = "\u0012\u0001t((";
                                n = 29;
                                array = z;
                                continue Label_0017;
                            }
                            case 29: {
                                array[n2] = intern;
                                n2 = 31;
                                s = "\u0005\u001by1h\u0001\u001d~&3\u001c\u001aun7\u001f\u0015in\"\u0001\u0006\u007f3h\u0003\u0011u3\u0018\u0019\u001dt\u001e.\u0000+~4+\u001fTs +\u001fT}44\u0007Tx 1\u0016Tr$\"\u001dTv()\u001a\u0007x$#";
                                n = 30;
                                array = z;
                                continue Label_0017;
                            }
                            case 30: {
                                array[n2] = intern;
                                n2 = 32;
                                s = "\u0005\u001by1h\u0001\u001d~&3\u001c\u001aun1\u001a\u0016b 3\u0016[E\u000f\f=;G\u000f";
                                n = 31;
                                array = z;
                                continue Label_0017;
                            }
                            case 31: {
                                array[n2] = intern;
                                n2 = 33;
                                s = "\u0005\u001by1h\u0001\u001d~&3\u001c\u001aun5\u001a\u001aw$5,\u0019\u007f%\"\\\u001a\u007f3*\u0012\u0018";
                                n = 32;
                                array = z;
                                continue Label_0017;
                            }
                            case 32: {
                                array[n2] = intern;
                                n2 = 34;
                                s = "\u0005\u001by1h\u0001\u001d~&3\u001c\u001aun5\u001a\u001aw$5,\u0019\u007f%\"\\\u0007y-\"\u001d\u0000";
                                n = 33;
                                array = z;
                                continue Label_0017;
                            }
                            case 33: {
                                array[n2] = intern;
                                n2 = 35;
                                s = "\u0005\u001by1h\u0001\u0011s$.\u0005\u0011O,\"\u0000\u0007q&\"\\\u0017q-+^\u0000u3*\u001a\u001aq5\"^\u0015s*";
                                n = 34;
                                array = z;
                                continue Label_0017;
                            }
                            case 34: {
                                array[n2] = intern;
                                n2 = 36;
                                s = "\u0010\u0015~a)\u001c\u00000'.\u001d\u00100,\"\u0000\u0007q&\"S";
                                n = 35;
                                array = z;
                                continue Label_0017;
                            }
                            case 35: {
                                array[n2] = intern;
                                n2 = 37;
                                s = "\u0010\u0015~a)\u001c\u00000'.\u001d\u00100,\"\u0000\u0007q&\"S";
                                n = 36;
                                array = z;
                                continue Label_0017;
                            }
                            case 36: {
                                array[n2] = intern;
                                n2 = 38;
                                s = "\u0010\u0015|-\u0001\u001a\u0011|%\u0014\u0007\u0015da$\u0012\u001a0/(\u0007Tr$g\u001d\u0001|-g\u0004\u001cu/g\u0010\u0015|-g\u0000\u0000q5\"S\u0017x )\u0014\u0011ta3\u001cT^\u000e\t6Z";
                                n = 37;
                                array = z;
                                continue Label_0017;
                            }
                            case 37: {
                                array[n2] = intern;
                                n2 = 39;
                                s = "\u0005\u001by1h\u0001\u0011s$.\u0005\u0011O,\"\u0000\u0007q&\"\\\u0017q-+^\u0006u-&\nY| 3\u0016\u001as8";
                                n = 38;
                                array = z;
                                continue Label_0017;
                            }
                            case 38: {
                                array[n2] = intern;
                                n2 = 40;
                                s = "\u0005\u001by1h\u0016\u0015bl!\u0012\u0006";
                                n = 39;
                                array = z;
                                continue Label_0017;
                            }
                            case 39: {
                                array[n2] = intern;
                                n2 = 41;
                                s = "\u0005\u001by1h\u0001\u0011s$.\u0005\u0011O,\"\u0000\u0007q&\"\\\u0017q-+^\u001bv'\"\u0001Yq\",\\\u0001`-(\u0012\u0010V(\"\u001f\u0010C5&\u0007=},\"\u0017\u001dq5\"\u001f\rQ'3\u0016\u0006S +\u001f";
                                n = 40;
                                array = z;
                                continue Label_0017;
                            }
                            case 40: {
                                array[n2] = intern;
                                n2 = 42;
                                s = "\u0005\u001by1h\u0001\u0011s$.\u0005\u0011O,\"\u0000\u0007q&\"\\\u0017q-+^\u001bv'\"\u0001Yq\",";
                                n = 41;
                                array = z;
                                continue Label_0017;
                            }
                            case 41: {
                                array[n2] = intern;
                                n2 = 43;
                                s = "\u0005\u001by1h\u0001\u0011s$.\u0005\u0011O,\"\u0000\u0007q&\"\\\u0017q-+^\u001bv'\"\u0001Yq\",S\u0017x )\u0014\u001105/\u0016Ts +\u001f\u0011ba3\u001a\u0019u.2\u0007Td.g";
                                n = 42;
                                array = z;
                                continue Label_0017;
                            }
                            case 42: {
                                array[n2] = intern;
                                n2 = 44;
                                s = "_Tb$*\u0012\u001d~()\u0014T";
                                n = 43;
                                array = z;
                                continue Label_0017;
                            }
                            case 43: {
                                array[n2] = intern;
                                n2 = 45;
                                s = "\u0005\u001by1h\u0001\u0011s$.\u0005\u0011O,\"\u0000\u0007q&\"\\\u0017q-+^\u0006u-&\nYu-\"\u0010\u0000y.)";
                                n = 44;
                                array = z;
                                continue Label_0017;
                            }
                            case 44: {
                                array[n2] = intern;
                                n2 = 46;
                                s = "\u0005\u001by1h\u0001\u0011s$.\u0005\u0011O,\"\u0000\u0007q&\"\\\u0017q-+^\u0000b )\u0000\u0004\u007f33^\u0015s*";
                                n = 45;
                                array = z;
                                continue Label_0017;
                            }
                            case 45: {
                                array[n2] = intern;
                                n2 = 47;
                                s = "\u0005\u001by1h\u0000\u0011b7.\u0010\u0011? $\u0002\u0001y3\"#\u0006\u007f9.\u001e\u001dd8\u0010\u0012\u001fu\r(\u0010\u001f0 $\u0002\u0001y3\"\u0017";
                                n = 46;
                                array = z;
                                continue Label_0017;
                            }
                            case 46: {
                                array[n2] = intern;
                                n2 = 48;
                                s = "\u0003\u001bg$5";
                                n = 47;
                                array = z;
                                continue Label_0017;
                            }
                            case 47: {
                                array[n2] = intern;
                                n2 = 49;
                                s = "$\u001cq542\u0004`a\u0011\u001c\u001ds$\u0014\u0016\u0006f($\u0016T@3(\u000b\u001d}(3\n";
                                n = 48;
                                array = z;
                                continue Label_0017;
                            }
                            case 48: {
                                array[n2] = intern;
                                n2 = 50;
                                s = "_Tr-2\u0016\u0000\u007f.3\u001bTC\u0002\bS\u0017\u007f/)\u0016\u0017d$#S";
                                n = 49;
                                array = z;
                                continue Label_0017;
                            }
                            case 49: {
                                array[n2] = intern;
                                n2 = 51;
                                s = "\u0012\u0001t((";
                                n = 50;
                                array = z;
                                continue Label_0017;
                            }
                            case 50: {
                                array[n2] = intern;
                                n2 = 52;
                                s = "\u0005\u001by1h\u0012\u0001t((,\u0006\u007f43\u0016[s)&\u001d\u0013u\u0003+\u0006\u0011d.(\u0007\u001cC5&\u0007\u00110\"/\u0012\u001aw()\u0014Tr-2\u0016\u0000\u007f.3\u001bTc5&\u0007\u001105(S";
                                n = 51;
                                array = z;
                                continue Label_0017;
                            }
                            case 51: {
                                array[n2] = intern;
                                n2 = 53;
                                s = "\u0012\u0001t((";
                                n = 52;
                                array = z;
                                continue Label_0017;
                            }
                            case 52: {
                                array[n2] = intern;
                                n2 = 54;
                                s = "\u0005\u001by1h\u0001\u0011s$.\u0005\u0011O,\"\u0000\u0007q&\"\\\u0017q-+^\u001bv'\"\u0001Y`3\"^\u0015s\"\"\u0003\u0000";
                                n = 53;
                                array = z;
                                continue Label_0017;
                            }
                            case 53: {
                                array[n2] = intern;
                                n2 = 55;
                                s = "\u0005\u001by1h\u0001\u0011s$.\u0005\u0011O,\"\u0000\u0007q&\"\\\u0017q-+^\u001bv'\"\u0001Yb$-\u0016\u0017dl5\u0016\u0017u(7\u0007";
                                n = 54;
                                array = z;
                                continue Label_0017;
                            }
                            case 54: {
                                array[n2] = intern;
                                n2 = 56;
                                s = "\u0005\u001by1h\u0001\u0011s$.\u0005\u0011O,\"\u0000\u0007q&\"\\\u0017q-+^\u0019e5\"^\u0015s*";
                                n = 55;
                                array = z;
                                continue Label_0017;
                            }
                            case 55: {
                                array[n2] = intern;
                                n2 = 57;
                                s = "\u0005\u001by1h\u0001\u0011s$.\u0005\u0011O,\"\u0000\u0007q&\"\\\u0017q-+^\u001bv'\"\u0001Yb$-\u0016\u0017d";
                                n = 56;
                                array = z;
                                continue Label_0017;
                            }
                            case 56: {
                                array[n2] = intern;
                                n2 = 58;
                                s = "\u0005\u001by1h\u0001\u0011s$.\u0005\u0011O,\"\u0000\u0007q&\"\\\u0017q-+^\u001bv'\"\u0001Y`3\"^\u0015s\"\"\u0003\u0000= $\u0018";
                                n = 57;
                                array = z;
                                continue Label_0017;
                            }
                            case 57: {
                                array[n2] = intern;
                                n2 = 59;
                                s = "\u0012\u0001t((";
                                n = 58;
                                array = z;
                                continue Label_0017;
                            }
                            case 58: {
                                array[n2] = intern;
                                n2 = 60;
                                s = "\u0005\u001by1h\u0010\u0011|-2\u001f\u0015bl$\u0012\u0018|l.\u001dY`3(\u0014\u0006u24^\u0017x )\u0014\u0011t{g";
                                n = 59;
                                array = z;
                                continue Label_0017;
                            }
                            case 59: {
                                array[n2] = intern;
                                n2 = 61;
                                s = "\u0005\u001by1h\u0001\u0011s$.\u0005\u0011O,\"\u0000\u0007q&\"\\\u0017q-+^\u0006u-&\nYu-\"\u0010\u0000y.)^\u0015s*";
                                n = 60;
                                array = z;
                                continue Label_0017;
                            }
                            case 60: {
                                array[n2] = intern;
                                n2 = 62;
                                s = "_Tr4!\u0015\u0011ba4\u001a\u000eua";
                                n = 61;
                                array = z;
                                continue Label_0017;
                            }
                            case 61: {
                                array[n2] = intern;
                                n2 = 63;
                                s = "\u0005\u001by1h\u0015\u001d~%\u0006\u0005\u0015y-&\u0011\u0018u\u00002\u0017\u001d\u007f\u0012&\u001e\u0004|()\u0014&q5\"\\T";
                                n = 62;
                                array = z;
                                continue Label_0017;
                            }
                            case 62: {
                                array[n2] = intern;
                                n2 = 64;
                                s = "\u0005\u001by1h\u0015\u001d~%\u0006\u0005\u0015y-&\u0011\u0018u\u00002\u0017\u001d\u007f\u0012&\u001e\u0004|()\u0014&q5\"\\\u0007q,7\u001f\u001d~&g\u0001\u0015d$g";
                                n = 63;
                                array = z;
                                continue Label_0017;
                            }
                            case 63: {
                                array[n2] = intern;
                                s = "_Tq4#\u001a\u001b02(\u0006\u0006s$g";
                                n = 64;
                                n2 = 65;
                                array = z;
                                continue Label_0017;
                            }
                            case 64: {
                                array[n2] = intern;
                                n2 = 66;
                                array = z;
                                s = "_Tq4#\u001a\u001b02(\u0006\u0006s$g";
                                n = 65;
                                continue Label_0017;
                            }
                            case 65: {
                                array[n2] = intern;
                                n2 = 67;
                                s = "S\u0003\u007f3,\u0000";
                                n = 66;
                                array = z;
                                continue Label_0017;
                            }
                            case 66: {
                                array[n2] = intern;
                                n2 = 68;
                                s = "_Tr4!\u0015\u0011ba4\u001a\u000eua";
                                n = 67;
                                array = z;
                                continue Label_0017;
                            }
                            case 67: {
                                array[n2] = intern;
                                n2 = 69;
                                s = "\u0005\u001by1h\u0015\u001d~%\u0006\u0005\u0015y-&\u0011\u0018u\u00002\u0017\u001d\u007f\u0012&\u001e\u0004|()\u0014&q5\"\\\u0007q,7\u001f\u001d~&g\u0001\u0015d$g";
                                n = 68;
                                array = z;
                                continue Label_0017;
                            }
                            case 68: {
                                array[n2] = intern;
                                n2 = 70;
                                s = "S\u0010\u007f$4\u001dSda0\u001c\u0006{";
                                n = 69;
                                array = z;
                                continue Label_0017;
                            }
                            case 69: {
                                array[n2] = intern;
                                n2 = 71;
                                s = "S\u0003\u007f3,\u0000";
                                n = 70;
                                array = z;
                                continue Label_0017;
                            }
                            case 70: {
                                array[n2] = intern;
                                n2 = 72;
                                s = "S\u0003\u007f3,\u0000";
                                n = 71;
                                array = z;
                                continue Label_0017;
                            }
                            case 71: {
                                array[n2] = intern;
                                n2 = 73;
                                s = "_Tr4!\u0015\u0011ba4\u001a\u000eua";
                                n = 72;
                                array = z;
                                continue Label_0017;
                            }
                            case 72: {
                                array[n2] = intern;
                                n2 = 74;
                                s = "\u0005\u001by1h\u0015\u001d~%\u0006\u0005\u0015y-&\u0011\u0018u\u00002\u0017\u001d\u007f\u0012&\u001e\u0004|()\u0014&q5\"\\\u0007q,7\u001f\u001d~&g\u0001\u0015d$g";
                                n = 73;
                                array = z;
                                continue Label_0017;
                            }
                            case 73: {
                                array[n2] = intern;
                                n2 = 75;
                                s = "S\u0010\u007f$4\u001dSda0\u001c\u0006{";
                                n = 74;
                                array = z;
                                continue Label_0017;
                            }
                            case 74: {
                                array[n2] = intern;
                                n2 = 76;
                                s = "S\u0010\u007f$4\u001dSda0\u001c\u0006{";
                                n = 75;
                                array = z;
                                continue Label_0017;
                            }
                            case 75: {
                                array[n2] = intern;
                                n2 = 77;
                                s = "_Tq4#\u001a\u001b02(\u0006\u0006s$g";
                                n = 76;
                                array = z;
                                continue Label_0017;
                            }
                            case 76: {
                                array[n2] = intern;
                                n2 = 78;
                                s = "\u0005\u001by1h\u0000\u0011b7.\u0010\u0011?3\"\u001f\u0011q2\"#\u0006\u007f9.\u001e\u001dd8\u0010\u0012\u001fu\r(\u0010\u001f";
                                n = 77;
                                array = z;
                                continue Label_0017;
                            }
                            case 77: {
                                array[n2] = intern;
                                n2 = 79;
                                s = "\u0005\u001by1h\u0000\u0011b7.\u0010\u0011?\"5\u0016\u0015d$";
                                n = 78;
                                array = z;
                                continue Label_0017;
                            }
                            case 78: {
                                array[n2] = intern;
                                n2 = 80;
                                s = "%\u001by1g \u001dw/&\u001f\u001d~&g'\u001cb$&\u0017";
                                n = 79;
                                array = z;
                                continue Label_0017;
                            }
                            case 79: {
                                array[n2] = intern;
                                n2 = 81;
                                s = "\u0005\u001by1h\u0000\u0011b7.\u0010\u0011?\"5\u0016\u0015d$#";
                                n = 80;
                                array = z;
                                continue Label_0017;
                            }
                            case 80: {
                                array[n2] = intern;
                                n2 = 82;
                                s = "\u0005\u001by1h\u0001\u0011s$.\u0005\u0011O,\"\u0000\u0007q&\"\\\u0017q-+^\u0000b )\u0000\u0004\u007f33";
                                n = 81;
                                array = z;
                                continue Label_0017;
                            }
                            case 81: {
                                array[n2] = intern;
                                n2 = 83;
                                s = "\u0012\u0001t((";
                                n = 82;
                                array = z;
                                continue Label_0017;
                            }
                            case 82: {
                                array[n2] = intern;
                                n2 = 84;
                                s = "\u0005\u001by1h\u0000\u0011b7.\u0010\u0011?23\u0012\u0006d";
                                n = 83;
                                array = z;
                                continue Label_0017;
                            }
                            case 83: {
                                array[n2] = intern;
                                n2 = 85;
                                s = "AZ!siBC&";
                                n = 84;
                                array = z;
                                continue Label_0017;
                            }
                            case 84: {
                                array[n2] = intern;
                                n2 = 86;
                                s = "S5`1}S";
                                n = 85;
                                array = z;
                                continue Label_0017;
                            }
                            case 85: {
                                array[n2] = intern;
                                n2 = 87;
                                s = "\u0012\u001at3(\u001a\u0010>#+\u0006\u0011d.(\u0007\u001c>)\"\u0012\u0010c$3]\u0004b.!\u001a\u0018uo&\u0010\u0000y.)]7_\u000f\t67D\b\b=+C\u0015\u0006'1O\u0002\u000f2:W\u0004\u0003";
                                n = 86;
                                array = z;
                                continue Label_0017;
                            }
                            case 86: {
                                array[n2] = intern;
                                n2 = 88;
                                s = "\u0001\u0011c4+\u0007T\u007f'g\u0012\u0001t((S\u0012\u007f\"2\u0000Tv.5S\u0002\u007f($\u0016Ts +\u001fN0";
                                n = 87;
                                array = z;
                                continue Label_0017;
                            }
                            case 87: {
                                array[n2] = intern;
                                n2 = 89;
                                s = "\u0003\u001c\u007f/\"";
                                n = 88;
                                array = z;
                                continue Label_0017;
                            }
                            case 88: {
                                array[n2] = intern;
                                n2 = 90;
                                s = "S\u0019c";
                                n = 89;
                                array = z;
                                continue Label_0017;
                            }
                            case 89: {
                                array[n2] = intern;
                                n2 = 91;
                                s = "\u0005\u001by1h\u0017\u0011f($\u0016+y/!\u001cT]\u0000\t&2Q\u0002\u0013&&U\u0013}S";
                                n = 90;
                                array = z;
                                continue Label_0017;
                            }
                            case 90: {
                                array[n2] = intern;
                                n2 = 92;
                                s = "\u0005\u001by1h\u0000\u0011b7.\u0010\u0011?23\u0012\u0006da\"\u001f\u0015`2\"\u0017T";
                                n = 91;
                                array = z;
                                continue Label_0017;
                            }
                            case 91: {
                                array[n2] = intern;
                                n2 = 93;
                                s = "S9_\u0005\u0002?N0";
                                n = 92;
                                array = z;
                                continue Label_0017;
                            }
                            case 92: {
                                array[n2] = intern;
                                n2 = 94;
                                s = "S;C{g";
                                n = 93;
                                array = z;
                                continue Label_0017;
                            }
                            case 93: {
                                array[n2] = intern;
                                n2 = 95;
                                s = "\u0012\u001at3(\u001a\u0010>()\u0007\u0011~5i\u0012\u0017d((\u001dZC\u0002\u001561^\u001e\b52";
                                n = 94;
                                array = z;
                                continue Label_0017;
                            }
                            case 94: {
                                array[n2] = intern;
                                n2 = 96;
                                s = "\u0012\u001at3(\u001a\u0010>,\"\u0017\u001dqo\"\u000b\u0000b i 7_\u001e\u0006&0Y\u000e\u0018  Q\u0015\u0002";
                                n = 95;
                                array = z;
                                continue Label_0017;
                            }
                            case 95: {
                                array[n2] = intern;
                                n2 = 97;
                                s = "S0u7.\u0010\u0011*a";
                                n = 96;
                                array = z;
                                continue Label_0017;
                            }
                            case 96: {
                                array[n2] = intern;
                                n2 = 98;
                                s = "S6e(+\u0017N0";
                                n = 97;
                                array = z;
                                continue Label_0017;
                            }
                            case 97: {
                                array[n2] = intern;
                                n2 = 99;
                                s = "\u0012\u001at3(\u001a\u0010>()\u0007\u0011~5i\u0012\u0017d((\u001dZX\u0004\u00067'U\u0015\u0018#8E\u0006";
                                n = 98;
                                array = z;
                                continue Label_0017;
                            }
                            case 98: {
                                array[n2] = intern;
                                n2 = 100;
                                s = "\u0012\u001at3(\u001a\u0010>,\"\u0017\u001dqo\u00140;O\u0000\u00127=_\u001e\u0014'5D\u0004\u00180<Q\u000f\u000060";
                                n = 99;
                                array = z;
                                continue Label_0017;
                            }
                            case 99: {
                                array[n2] = intern;
                                n2 = 101;
                                s = "$\u001cq542\u0004`a\u0011\u001c\u001ds$\u0014\u0016\u0006f($\u0016";
                                n = 100;
                                array = z;
                                continue Label_0017;
                            }
                            case 100: {
                                array[n2] = intern;
                                n2 = 102;
                                s = "\u0005\u001by1h\u0000\u0011b7.\u0010\u0011? $\u0002\u0001y3\"#\u0015b5.\u0012\u0018G ,\u00168\u007f\",S\u0015s02\u001a\u0006u%";
                                n = 101;
                                array = z;
                                continue Label_0017;
                            }
                            case 101: {
                                array[n2] = intern;
                                n2 = 103;
                                s = "\u0003\u001bg$5";
                                n = 102;
                                array = z;
                                continue Label_0017;
                            }
                            case 102: {
                                array[n2] = intern;
                                n2 = 104;
                                s = "\u0005\u001by1h\u0012\u0010z44\u0007$b.?\u001a\u0019y5> \u0011~2(\u0001N0.)";
                                n = 103;
                                array = z;
                                continue Label_0017;
                            }
                            case 103: {
                                array[n2] = intern;
                                n2 = 105;
                                s = "\u0005\u001by1h\u0012\u0010z44\u0007$b.?\u001a\u0019y5> \u0011~2(\u0001N0.!\u0015";
                                n = 104;
                                array = z;
                                continue Label_0017;
                            }
                            case 104: {
                                array[n2] = intern;
                                n2 = 106;
                                s = "\u0005\u001by1h\u0001\u0011s$.\u0005\u0011O,\"\u0000\u0007q&\"\\\u0017q-+^\u0019e5\"";
                                n = 105;
                                array = z;
                                continue Label_0017;
                            }
                            case 105: {
                                array[n2] = intern;
                                n2 = 107;
                                s = "_Te1#\u0012\u0000u%}S";
                                n = 106;
                                array = z;
                                continue Label_0017;
                            }
                            case 106: {
                                array[n2] = intern;
                                n2 = 108;
                                s = "\u0005\u001by1h\u0006\u0004t 3\u0016<y23\u001c\u0006y\"&\u001f1s)(S\u0003b.)\u0014T~$0S1s)(IT";
                                n = 107;
                                array = z;
                                continue Label_0017;
                            }
                            case 107: {
                                array[n2] = intern;
                                n2 = 109;
                                s = "\u0010\u001b}o0\u001b\u0015d2&\u0003\u0004O15\u0016\u0012u3\"\u001d\u0017u2";
                                n = 108;
                                array = z;
                                continue Label_0017;
                            }
                            case 108: {
                                array[n2] = intern;
                                n2 = 110;
                                s = "\u0005\u001by1h\u0006\u0004t 3\u0016<y23\u001c\u0006y\"&\u001f1s)(S\u001cy236\u0017x.}S";
                                n = 109;
                                array = z;
                                continue Label_0017;
                            }
                            case 109: {
                                array[n2] = intern;
                                n2 = 111;
                                s = "\u0016\u0017x.g\u0000\u001c\u007f4+\u0017Tr$g\u001a\u001a05/\u0016Tb )\u0014\u00110.!SD05(SE q";
                                n = 110;
                                array = z;
                                continue Label_0017;
                            }
                            case 110: {
                                array[n2] = intern;
                                n2 = 112;
                                s = "_T~$06\u0017x.}S";
                                n = 111;
                                array = z;
                                continue Label_0017;
                            }
                            case 111: {
                                array[n2] = intern;
                                n2 = 113;
                                s = "\u0003\u0006u'\u0018\u001b\u001dc5\u0018\u0016\u0017x.";
                                n = 112;
                                array = z;
                                continue Label_0017;
                            }
                            case 112: {
                                array[n2] = intern;
                                n2 = 114;
                                s = "\u0005\u001by1h\u0001\u0011s$.\u0005\u0011O,\"\u0000\u0007q&\"\\\u0017q-+^\u001bv'\"\u0001[y&)\u001c\u0006u%j\u0007\u001b\u007fl(\u001f\u0010?";
                                n = 113;
                                array = z;
                                continue Label_0017;
                            }
                            case 113: {
                                array[n2] = intern;
                                n2 = 115;
                                s = "\u0005\u001by1h\u0001\u0011s$.\u0005\u0011O,\"\u0000\u0007q&\"\\\u0017q-+^\u001bv'\"\u0001[y&)\u001c\u0006u%j\u001d\u001b~l1\u001c\u001d`l.\u001dY`3(\u0014\u0006u24";
                                n = 114;
                                array = z;
                                continue Label_0017;
                            }
                            case 114: {
                                array[n2] = intern;
                                n2 = 116;
                                s = "\u0011\u0001c8";
                                n = 115;
                                array = z;
                                continue Label_0017;
                            }
                            case 115: {
                                array[n2] = intern;
                                n2 = 117;
                                s = "\u0003\u001c\u007f/\"";
                                n = 116;
                                array = z;
                                continue Label_0017;
                            }
                            case 116: {
                                array[n2] = intern;
                                n2 = 118;
                                s = "\u0005\u001by1h\u0001\u0011s$.\u0005\u0011O,\"\u0000\u0007q&\"\\\u0017q-+^\u001bv'\"\u0001Tv3(\u001eT";
                                n = 117;
                                array = z;
                                continue Label_0017;
                            }
                            case 117: {
                                array[n2] = intern;
                                n2 = 119;
                                s = "\u0005\u001by1h\u0001\u0011s$.\u0005\u0011O,\"\u0000\u0007q&\"\\\u0017q-+^\u001bv'\"\u0001[e1+\u001c\u0015t\u0007.\u0016\u0018t\u00123\u0012\u0000Y,*\u0016\u0010y 3\u0016\u0018i\u0000!\u0007\u0011b\u0002&\u001f\u0018";
                                n = 118;
                                array = z;
                                continue Label_0017;
                            }
                            case 118: {
                                array[n2] = intern;
                                n2 = 120;
                                s = "_Ts +\u001fTy%g";
                                n = 119;
                                array = z;
                                continue Label_0017;
                            }
                            case 119: {
                                array[n2] = intern;
                                n2 = 121;
                                s = "\u0012\u0001t((";
                                n = 120;
                                array = z;
                                continue Label_0017;
                            }
                            case 120: {
                                array[n2] = intern;
                                n2 = 122;
                                s = "\u0005\u001by1h\u0012\u0001t((,\u0006\u007f43\u0016[e1#\u0012\u0000u\u00002\u0017\u001d\u007f\u0013(\u0006\u0000u{g";
                                n = 121;
                                array = z;
                                continue Label_0017;
                            }
                            case 121: {
                                array[n2] = intern;
                                n2 = 123;
                                s = "\u0007\u001d}$";
                                n = 122;
                                array = z;
                                continue Label_0017;
                            }
                            case 122: {
                                array[n2] = intern;
                                n2 = 124;
                                s = "\u0017\u001b0/(\u0007Ts3\"\u0012\u0000ua)\u001c\u0000y'.\u0010\u0015d((\u001dX06\"S\u0015b$g\u001d\u001bda.\u001dTqa&\u0010\u0000y7\"S\u0017q-+";
                                n = 123;
                                array = z;
                                continue Label_0017;
                            }
                            case 123: {
                                array[n2] = intern;
                                n2 = 125;
                                s = "\u0005\u001by1h\u0000\u0011b7.\u0010\u0011?/(\u0007\u001dv($\u0012\u0000y.)\\\u001au$#^\u0000x4*\u0011";
                                n = 124;
                                array = z;
                                continue Label_0017;
                            }
                            case 124: {
                                array[n2] = intern;
                                n2 = 126;
                                s = "\u0005\u001by1h\u0000\u0011b7.\u0010\u0011?/(\u0007\u001dv($\u0012\u0000y.)\\\u0000x4*\u0011Yc(=\u0016Yy2jC";
                                n = 125;
                                array = z;
                                continue Label_0017;
                            }
                            case 125: {
                                array[n2] = intern;
                                n2 = 127;
                                s = "\u0001\u0011z$$\u0007+s +\u001f";
                                n = 126;
                                array = z;
                                continue Label_0017;
                            }
                            case 126: {
                                array[n2] = intern;
                                n2 = 128;
                                s = "\u0005\u001by1h\u0000\u0011b7.\u0010\u0011?/(\u0007\u001dv($\u0012\u0000y.)\\\u0000y,\"^\u0001yl \u001c\u001au";
                                n = 127;
                                array = z;
                                continue Label_0017;
                            }
                            case 127: {
                                array[n2] = intern;
                                n2 = 129;
                                s = "\u001b\u0015~&2\u0003+s +\u001f";
                                n = 128;
                                array = z;
                                continue Label_0017;
                            }
                            case 128: {
                                array[n2] = intern;
                                n2 = 130;
                                s = "\u0010\u0015|-";
                                n = 129;
                                array = z;
                                continue Label_0017;
                            }
                            case 129: {
                                array[n2] = intern;
                                n2 = 131;
                                s = "\u0010\u001b}o0\u001b\u0015d2&\u0003\u0004>()\u0007\u0011~5i\u0012\u0017d((\u001dZQ\u0002\u00046$D\u001e\u000428\\";
                                n = 130;
                                array = z;
                                continue Label_0017;
                            }
                            case 130: {
                                array[n2] = intern;
                                n2 = 132;
                                s = "\u0019\u001dt";
                                n = 131;
                                array = z;
                                continue Label_0017;
                            }
                            case 131: {
                                array[n2] = intern;
                                n2 = 133;
                                s = "\u0010\u001b}o&\u001d\u0010b..\u0017Zy/3\u0016\u0006~ +]&4(#";
                                n = 132;
                                array = z;
                                continue Label_0017;
                            }
                            case 132: {
                                array[n2] = intern;
                                n2 = 134;
                                s = "\u0005\u001by1h\u0014\u0011d\u0011\"\u0016\u0006T(4\u0003\u0018q8\t\u0012\u0019un7\u0016\u0011b\u001e-\u001a\u0010O(4,\u001ae-+S\u0017q-+S\u0019e23S\u001cq7\"S\u0016u$)S\u0012y/.\u0000\u001cu%";
                                n = 133;
                                array = z;
                                continue Label_0017;
                            }
                            case 133: {
                                array[n2] = intern;
                                n2 = 135;
                                s = "\u0016\u001at\u001e$\u0012\u0018|\u001e4\u0007\u0006y/ ";
                                n = 134;
                                array = z;
                                continue Label_0017;
                            }
                            case 134: {
                                array[n2] = intern;
                                n2 = 136;
                                s = "\u001b\u0015~&2\u0003+s +\u001f";
                                n = 135;
                                array = z;
                                continue Label_0017;
                            }
                            case 135: {
                                array[n2] = intern;
                                n2 = 137;
                                s = "\u0003\u001c\u007f/\"";
                                n = 136;
                                array = z;
                                continue Label_0017;
                            }
                            case 136: {
                                array[n2] = intern;
                                n2 = 138;
                                s = "\u0005\u001by1h\u0000\u0011b7.\u0010\u0011?23\u001c\u00040$+\u0012\u0004c$#S";
                                n = 137;
                                array = z;
                                continue Label_0017;
                            }
                            case 137: {
                                array[n2] = intern;
                                n2 = 139;
                                s = "\u0005\u001by1h\u0000\u0011b7.\u0010\u0011?23\u001c\u0004";
                                n = 138;
                                array = z;
                                continue Label_0017;
                            }
                            case 138: {
                                array[n2] = intern;
                                n2 = 140;
                                s = "\u0012\u0001t((";
                                n = 139;
                                array = z;
                                continue Label_0017;
                            }
                            case 139: {
                                array[n2] = intern;
                                n2 = 141;
                                s = "S\u0019c";
                                n = 140;
                                array = z;
                                continue Label_0017;
                            }
                            case 140: {
                                array[n2] = intern;
                                n2 = 142;
                                s = "\u0005\u001by1h\u0000\u0011b7.\u0010\u0011?3\"\u001f\u0011q2\"#\u0015b5.\u0012\u0018G ,\u00168\u007f\",";
                                n = 141;
                                array = z;
                                continue Label_0017;
                            }
                            case 141: {
                                array[n2] = intern;
                                n2 = 143;
                                s = "\u0005\u001by1h\u0016\u0015bl)\u0016\u0015b";
                                n = 142;
                                array = z;
                                continue Label_0017;
                            }
                            case 142: {
                                array[n2] = intern;
                                n2 = 144;
                                s = "\u0005\u001by1h\u0010\u0015|-h\u0016\u001at";
                                n = 143;
                                array = z;
                                continue Label_0017;
                            }
                            case 143: {
                                array[n2] = intern;
                                n2 = 145;
                                s = "S\u0019c";
                                n = 144;
                                array = z;
                                continue Label_0017;
                            }
                            case 144: {
                                array[n2] = intern;
                                n2 = 146;
                                s = "\u0005\u001by1h\u0010\u0015|-h\u0016\u001ata$\u0012\u0018|a!\u0012\u001d|$#S\u0003y5/S\u0000u93S";
                                n = 145;
                                array = z;
                                continue Label_0017;
                            }
                            case 145: {
                                array[n2] = intern;
                                n2 = 147;
                                s = "_Tt.g\u001d\u001bda4\u001b\u001bga2\u0000\u0011ba5\u0012\u0000y/ S\u0007s3\"\u0016\u001a0 !\u0007\u0011ba$\u0012\u0018|a\"\u001d\u0010co";
                                n = 146;
                                array = z;
                                continue Label_0017;
                            }
                            case 146: {
                                array[n2] = intern;
                                n2 = 148;
                                s = "\u0005\u001by1h\u0010\u0015|-h\u0016\u001ata\"\u001f\u0015`2\"\u0017T";
                                n = 147;
                                array = z;
                                continue Label_0017;
                            }
                            case 147: {
                                array[n2] = intern;
                                n2 = 149;
                                s = "\u0005\u001by1h\u0001\u0011s$.\u0005\u0011O,\"\u0000\u0007q&\"\\\u0017q-+^\u001bv'\"\u0001Yq\"$\u0016\u0004dl&\u0010\u001f";
                                n = 148;
                                array = z;
                                continue Label_0017;
                            }
                            case 148: {
                                array[n2] = intern;
                                n2 = 150;
                                s = "\u0005\u001by1h\u0001\u0011s$.\u0005\u0011O,\"\u0000\u0007q&\"\\\u0017q-+^\u001d~5\"\u0001\u0006e13\u001a\u001b~l&\u0010\u001f";
                                n = 149;
                                array = z;
                                continue Label_0017;
                            }
                            case 149: {
                                array[n2] = intern;
                                n2 = 151;
                                s = "%\u001by\"\" \u0011b7.\u0010\u00110$)\u0017Ts +\u001f";
                                n = 150;
                                array = z;
                                continue Label_0017;
                            }
                            case 150: {
                                array[n2] = intern;
                                n2 = 152;
                                s = "\u0003\u001bg$5";
                                n = 151;
                                array = z;
                                continue Label_0017;
                            }
                            case 151: {
                                array[n2] = intern;
                                n2 = 153;
                                s = "\u0005\u001by1h\u0001\u0011s$.\u0005\u0011O,\"\u0000\u0007q&\"\\\u0017q-+^\u0000u3*\u001a\u001aq5\"S\u0012b.*S";
                                n = 152;
                                array = z;
                                continue Label_0017;
                            }
                            case 152: {
                                array[n2] = intern;
                                n2 = 154;
                                s = "_Ts +\u001fTy%g";
                                n = 153;
                                array = z;
                                continue Label_0017;
                            }
                            case 153: {
                                array[n2] = intern;
                                n2 = 155;
                                s = "\u0005\u001by1h\u0010\u0015|-h\u0001\u0011z$$\u0007";
                                n = 154;
                                array = z;
                                continue Label_0017;
                            }
                            case 154: {
                                array[n2] = intern;
                                n2 = 156;
                                s = "\u0001\u0011v3\"\u0000\u001cO/(\u0007\u001dv($\u0012\u0000y.)";
                                n = 155;
                                array = z;
                                continue Label_0017;
                            }
                            case 155: {
                                array[n2] = intern;
                                n2 = 157;
                                s = "\u0005\u001by1h\u0000\u0011b7.\u0010\u0011?\"*\u0017[~4+\u001fYq\"3\u001a\u001b~";
                                n = 156;
                                array = z;
                                continue Label_0017;
                            }
                            case 156: {
                                array[n2] = intern;
                                n2 = 158;
                                s = "S\u0019c";
                                n = 157;
                                array = z;
                                continue Label_0017;
                            }
                            case 157: {
                                array[n2] = intern;
                                n2 = 159;
                                s = "\u0005\u001by1h\u0000\u0011b7.\u0010\u0011?\"*\u0017[~4+\u001fYq\"3\u001a\u001b~";
                                n = 158;
                                array = z;
                                continue Label_0017;
                            }
                            case 158: {
                                array[n2] = intern;
                                n2 = 160;
                                s = "\u0001\u0011s$.\u0005\u0011O,\"\u0000\u0007q&\"";
                                n = 159;
                                array = z;
                                continue Label_0017;
                            }
                            case 159: {
                                array[n2] = intern;
                                n2 = 161;
                                s = "\u0005\u001by1h\u0000\u0011b7.\u0010\u0011?\"*\u0017[~.3^\u0007d 5\u0007\u0011t";
                                n = 160;
                                array = z;
                                continue Label_0017;
                            }
                            case 160: {
                                array[n2] = intern;
                                n2 = 162;
                                s = "\u0005\u001by1h\u0000\u0011b7.\u0010\u0011?23\u0012\u0006d\u001e$\u0012\u0018|n!\u0012\u001d|$#,\u0015y37\u001f\u0015~$\u0018\u001e\u001bt$\u0018\u001a\u0007O.)";
                                n = 161;
                                array = z;
                                continue Label_0017;
                            }
                            case 161: {
                                array[n2] = intern;
                                n2 = 163;
                                s = "S\u0011| 7\u0000\u0011ta";
                                n = 162;
                                array = z;
                                continue Label_0017;
                            }
                            case 162: {
                                array[n2] = intern;
                                n2 = 164;
                                s = "\u0019\u001dt";
                                n = 163;
                                array = z;
                                continue Label_0017;
                            }
                            case 163: {
                                array[n2] = intern;
                                n2 = 165;
                                s = "\u0019\u001dt";
                                n = 164;
                                array = z;
                                continue Label_0017;
                            }
                            case 164: {
                                array[n2] = intern;
                                n2 = 166;
                                s = "\u0001\u0011z$$\u0007+s +\u001f";
                                n = 165;
                                array = z;
                                continue Label_0017;
                            }
                            case 165: {
                                array[n2] = intern;
                                n2 = 167;
                                s = "\u001d\u0011g\u0002&\u001f\u0018";
                                n = 166;
                                array = z;
                                continue Label_0017;
                            }
                            case 166: {
                                array[n2] = intern;
                                n2 = 168;
                                s = "\u0003\u001c\u007f/\"";
                                n = 167;
                                array = z;
                                continue Label_0017;
                            }
                            case 167: {
                                array[n2] = intern;
                                n2 = 169;
                                s = "S\u0012|  \u0000I";
                                n = 168;
                                array = z;
                                continue Label_0017;
                            }
                            case 168: {
                                array[n2] = intern;
                                n2 = 170;
                                s = "\u0005\u001by1h\u001d\u0015d(1\u0016+c5&\u0001\u0000O\"&\u001f\u00180$+\u0012\u0004c$#S";
                                n = 169;
                                array = z;
                                continue Label_0017;
                            }
                            case 169: {
                                array[n2] = intern;
                                n2 = 171;
                                s = "\u0000\u0000q33,\u0017q-+";
                                n = 170;
                                array = z;
                                continue Label_0017;
                            }
                            case 170: {
                                array[n2] = intern;
                                n2 = 172;
                                s = "\u0005\u001by1h\u0000\u0011b7.\u0010\u0011?\"*\u0017Ty/3\u0016\u001ad|";
                                n = 171;
                                array = z;
                                continue Label_0017;
                            }
                            case 171: {
                                array[n2] = intern;
                                n2 = 173;
                                s = "\u0001\u0011s$.\u0005\u0011O,\"\u0000\u0007q&\"";
                                n = 172;
                                array = z;
                                continue Label_0017;
                            }
                            case 172: {
                                array[n2] = intern;
                                n2 = 174;
                                s = "\u0005\u001by1h\u0000\u0011b7.\u0010\u0011?\"*\u0017[";
                                n = 173;
                                array = z;
                                continue Label_0017;
                            }
                            case 173: {
                                array[n2] = intern;
                                n2 = 175;
                                s = "\u0005\u001by1h\u0000\u0011b7.\u0010\u0011?23\u0012\u0006d\u001e$\u0012\u0018|n!\u0012\u001d|$#,\u001a\u007f\u001e$\u0016\u0018|4+\u0012\u0006O\"&\u001f\u0018O(),\u0004b. \u0001\u0011c2";
                                n = 174;
                                array = z;
                                continue Label_0017;
                            }
                            case 174: {
                                array[n2] = intern;
                                n2 = 176;
                                s = "\u0005\u001by1h\u0000\u0011b7.\u0010\u0011?\"*\u0017[e/,\u001d\u001bg/j\u0012\u0017d((\u001d";
                                n = 175;
                                array = z;
                                continue Label_0017;
                            }
                            case 175: {
                                array[n2] = intern;
                                n2 = 177;
                                s = "S\u0019c";
                                n = 176;
                                array = z;
                                continue Label_0017;
                            }
                            case 176: {
                                array[n2] = intern;
                                n2 = 178;
                                s = "\u0016\u001at\u001e$\u0012\u0018|\u001e4\u0007\u0006y/ ";
                                n = 177;
                                array = z;
                                continue Label_0017;
                            }
                            case 177: {
                                array[n2] = intern;
                                n2 = 179;
                                s = "\u0010\u0015|-\u0018\u0015\u0006\u007f,";
                                n = 178;
                                array = z;
                                continue Label_0017;
                            }
                            case 178: {
                                array[n2] = intern;
                                n2 = 180;
                                s = "\u0016\fd3&,\u0006u\"\"\u001a\u0002u\u001e*\u0016\u0007c  \u0016+\u007f#-";
                                n = 179;
                                array = z;
                                continue Label_0017;
                            }
                            case 179: {
                                array[n2] = intern;
                                n2 = 181;
                                s = "S\u0007d 5\u0007=t|";
                                n = 180;
                                array = z;
                                continue Label_0017;
                            }
                            case 180: {
                                array[n2] = intern;
                                n2 = 182;
                                s = "\u0005\u001by1h\u0000\u0011b7.\u0010\u0011?\"*\u0017[~4+\u001fYy/3\u0016\u001ad";
                                n = 181;
                                array = z;
                                continue Label_0017;
                            }
                            case 181: {
                                array[n2] = intern;
                                n2 = 183;
                                s = "\u001b\u0015~&2\u0003+s +\u001f";
                                n = 182;
                                array = z;
                                continue Label_0017;
                            }
                            case 182: {
                                array[n2] = intern;
                                n2 = 184;
                                s = "\u0016\fd3&,\u0006u\"\"\u001a\u0002u\u001e*\u0016\u0007c  \u0016";
                                n = 183;
                                array = z;
                                continue Label_0017;
                            }
                            case 183: {
                                array[n2] = intern;
                                n2 = 185;
                                s = "\u0005\u001by1h\u0000\u0011b7.\u0010\u0011?23\u0012\u0006d\u001e$\u0012\u0018|n!\u0012\u001d|$#,\u001a\u007f\u001e)\u0016\u0000g.5\u0018";
                                n = 184;
                                array = z;
                                continue Label_0017;
                            }
                            case 184: {
                                array[n2] = intern;
                                n2 = 186;
                                s = "\u0000\u0000q33,\u0017q-+";
                                n = 185;
                                array = z;
                                continue Label_0017;
                            }
                            case 185: {
                                array[n2] = intern;
                                n2 = 187;
                                s = "\u0000\u001c\u007f6\u0004\u0012\u0018|\u0007&\u001a\u0018u%\n\u0016\u0007c  \u0016";
                                n = 186;
                                array = z;
                                continue Label_0017;
                            }
                            case 186: {
                                array[n2] = intern;
                                n2 = 188;
                                s = "\u0005\u001by1h\u0001\u001d~&3\u001c\u001aun4\u0007\u001b`";
                                n = 187;
                                array = z;
                                continue Label_0017;
                            }
                            case 187: {
                                array[n2] = intern;
                                n2 = 189;
                                s = "\u0005\u001dr3&\u0007\u001bb";
                                n = 188;
                                array = z;
                                continue Label_0017;
                            }
                            case 188: {
                                array[n2] = intern;
                                n2 = 190;
                                s = "\u0005\u001by1h\u0001\u0011s$.\u0005\u0011O,\"\u0000\u0007q&\"\\\u0017q-+^\u001d~5\"\u0001\u0006e13\u001a\u001b~a\"\u001d\u0010-";
                                n = 189;
                                array = z;
                                continue Label_0017;
                            }
                            case 189: {
                                array[n2] = intern;
                                n2 = 191;
                                s = "\u0006\u001aq#+\u0016Td.g\u0012\u0017s$4\u0000T@\u0013\b+=]\b\u0013*+C\u0002\u001561^\u001e\b52O\u0016\u000681O\r\b0?0'.\u0016\u0018ta.\u001dT@.0\u0016\u0006] )\u0012\u0013u3";
                                n = 190;
                                array = z;
                                continue Label_0017;
                            }
                            case 190: {
                                array[n2] = intern;
                                n2 = 192;
                                s = "#&_\u0019\u000e>=D\u0018\u0018 7B\u0004\u0002=+_\u0007\u0001,#Q\n\u0002,8_\u0002\f";
                                n = 191;
                                array = z;
                                continue Label_0017;
                            }
                            case 191: {
                                array[n2] = intern;
                                n2 = 193;
                                s = "\u001d\u001b0\u0011\u0015<,Y\f\u000e'-O\u0012\u0004!1U\u000f\u0018<2V\u001e\u00102?U\u001e\u000b<7[a!\u001a\u0011|%g\u001a\u001a0\u0011(\u0004\u0011b\f&\u001d\u0015w$5";
                                n = 192;
                                array = z;
                                continue Label_0017;
                            }
                            case 192: {
                                array[n2] = intern;
                                n2 = 194;
                                s = "\u0005\u001by1h\u0001\u0011s$.\u0005\u0011O,\"\u0000\u0007q&\"\\\u0017q-+^\u001bv'\"\u0001Yb$-\u0016\u0017dl&\u0010\u001f";
                                n = 193;
                                array = z;
                                continue Label_0017;
                            }
                            case 193: {
                                array[n2] = intern;
                                n2 = 195;
                                s = "\u0005\u001by1h\u0010\u0015|-h\u0012\u0017s$7\u0007";
                                n = 194;
                                array = z;
                                continue Label_0017;
                            }
                            case 194: {
                                array[n2] = intern;
                                n2 = 196;
                                s = "\u0005\u001by1h\u0000\u0011b7.\u0010\u0011? $\u0010\u0011`5h\u0015\u0015y-\"\u0017+~.\u0018\u0001\u0011s.5\u0017+q4#\u001a\u001bO1\"\u0001\u0019y24\u001a\u001b~";
                                n = 195;
                                array = z;
                                continue Label_0017;
                            }
                            case 195: {
                                array[n2] = intern;
                                n2 = 197;
                                s = "\u0005\u001by1h\u0007\u001bw&+\u00169e5\" \u0000q52\u0000Ts)&\u001d\u0013y/ S\u0019e5\"\u0017Tc5&\u0007\u001105(S";
                                n = 196;
                                array = z;
                                continue Label_0017;
                            }
                            case 196: {
                                array[n2] = intern;
                                n2 = 198;
                                s = "\u0003\u0006u'\u0018\u001b\u001dc5\u0018\u0016\u0017x.";
                                n = 197;
                                array = z;
                                continue Label_0017;
                            }
                            case 197: {
                                array[n2] = intern;
                                n2 = 199;
                                s = "\u0010\u001b}o0\u001b\u0015d2&\u0003\u0004O15\u0016\u0012u3\"\u001d\u0017u2";
                                n = 198;
                                array = z;
                                continue Label_0017;
                            }
                            case 198: {
                                array[n2] = intern;
                                n2 = 200;
                                s = "\u0005\u001by1h\u0001\u0011s$.\u0005\u0011O,\"\u0000\u0007q&\"\\\u0017q-+^\u001bv'\"\u0001Yb$$\u0016\u001d`5";
                                n = 199;
                                array = z;
                                continue Label_0017;
                            }
                            case 199: {
                                array[n2] = intern;
                                n2 = 201;
                                s = "\u0005\u001by1h\u0001\u0011s$.\u0005\u0011O,\"\u0000\u0007q&\"\\\u0017q-+^\u001bv'\"\u0001Yq\"$\u0016\u0004dl5\u0016\u0017u(7\u0007";
                                n = 200;
                                array = z;
                                continue Label_0017;
                            }
                            case 200: {
                                array[n2] = intern;
                                n2 = 202;
                                s = "\u0005\u001by1h\u0000\u0011b7.\u0010\u0011?#.\u001d\u00100()\u0007\u0011~5z";
                                n = 201;
                                array = z;
                                continue Label_0017;
                            }
                            case 201: {
                                array[n2] = intern;
                                n2 = 203;
                                s = "\u0005\u001by1h\u0012\u0001t((,\u0006\u007f43\u0016[d.(\u0014\u0018u\u00127\u0016\u0015{$5#\u001c\u007f/\"S\u0017x )\u0014\u001d~&g\u0000\u0004u ,\u0016\u0006023\u0012\u0000ua3\u001cT";
                                n = 202;
                                array = z;
                                continue Label_0017;
                            }
                            case 202: {
                                array[n2] = intern;
                                n2 = 204;
                                s = "\u0012\u0001t((";
                                n = 203;
                                array = z;
                                continue Label_0017;
                            }
                            case 203: {
                                break;
                            }
                        }
                        while (true) {
                            array[n2] = intern;
                            Z = z;
                            while (true) {
                                Label_5574: {
                                    try {
                                        if (Build$VERSION.SDK_INT >= 8) {
                                            K = new qx();
                                            VoiceService.w = new AtomicInteger();
                                            C = new ThreadPoolExecutor(0, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
                                            return;
                                        }
                                        break Label_5574;
                                        Label_5562: {
                                            final char c = 'A';
                                        }
                                        while (true) {
                                            break Label_5524;
                                            Label_5520:
                                            char c = 'G';
                                            final char c2;
                                            charArray[n3] = (char)(c ^ c2);
                                            ++n3;
                                            break;
                                            Label_5548:
                                            c = 't';
                                            continue;
                                            c2 = charArray[n3];
                                            Label_5541:
                                            c = 's';
                                            continue;
                                            Label_5555:
                                            c = '\u0010';
                                            continue;
                                        }
                                    }
                                    // switch([Lcom.strobel.decompiler.ast.Label;@69adbf10, n3 % 5)
                                    catch (IllegalArgumentException ex) {
                                        throw ex;
                                    }
                                }
                                K = null;
                                continue;
                            }
                        }
                    }
                }
            }
            break;
        }
    }
    
    public VoiceService() {
        this.s = new pk(this);
        this.T = new VoiceService$VoiceServiceEventCallback(this);
    }
    
    static float A(final VoiceService voiceService) {
        return voiceService.x();
    }
    
    static Double B(final VoiceService voiceService) {
        return voiceService.X;
    }
    
    static boolean C(final VoiceService voiceService) {
        return voiceService.E;
    }
    
    static Events$Call D(final VoiceService voiceService) {
        return voiceService.q;
    }
    
    static Notification E(final VoiceService voiceService) {
        return voiceService.v();
    }
    
    private static boolean E() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/os/Build.MANUFACTURER:Ljava/lang/String;
        //     3: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //     6: astore_0       
        //     7: getstatic       android/os/Build.MODEL:Ljava/lang/String;
        //    10: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //    13: astore_1       
        //    14: getstatic       android/os/Build$VERSION.RELEASE:Ljava/lang/String;
        //    17: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //    20: astore_2       
        //    21: aload_0        
        //    22: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    25: bipush          12
        //    27: aaload         
        //    28: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    31: istore          11
        //    33: iload           11
        //    35: ifeq            72
        //    38: aload_1        
        //    39: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    42: bipush          14
        //    44: aaload         
        //    45: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //    48: istore          17
        //    50: iload           17
        //    52: ifeq            72
        //    55: aload_2        
        //    56: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    59: bipush          18
        //    61: aaload         
        //    62: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    65: istore          18
        //    67: iload           18
        //    69: ifne            157
        //    72: aload_0        
        //    73: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    76: bipush          19
        //    78: aaload         
        //    79: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    82: istore          12
        //    84: iload           12
        //    86: ifeq            197
        //    89: aload_1        
        //    90: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    93: bipush          17
        //    95: aaload         
        //    96: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //    99: istore          13
        //   101: iload           13
        //   103: ifne            140
        //   106: aload_1        
        //   107: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   110: bipush          16
        //   112: aaload         
        //   113: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   116: istore          15
        //   118: iload           15
        //   120: ifne            140
        //   123: aload_1        
        //   124: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   127: bipush          15
        //   129: aaload         
        //   130: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   133: istore          16
        //   135: iload           16
        //   137: ifeq            197
        //   140: aload_2        
        //   141: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   144: bipush          13
        //   146: aaload         
        //   147: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   150: istore          14
        //   152: iload           14
        //   154: ifeq            197
        //   157: iconst_1       
        //   158: ireturn        
        //   159: astore_3       
        //   160: aload_3        
        //   161: athrow         
        //   162: astore          4
        //   164: aload           4
        //   166: athrow         
        //   167: astore          5
        //   169: aload           5
        //   171: athrow         
        //   172: astore          6
        //   174: aload           6
        //   176: athrow         
        //   177: astore          7
        //   179: aload           7
        //   181: athrow         
        //   182: astore          8
        //   184: aload           8
        //   186: athrow         
        //   187: astore          9
        //   189: aload           9
        //   191: athrow         
        //   192: astore          10
        //   194: aload           10
        //   196: athrow         
        //   197: iconst_0       
        //   198: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  21     33     159    162    Ljava/lang/IllegalArgumentException;
        //  38     50     162    167    Ljava/lang/IllegalArgumentException;
        //  55     67     167    172    Ljava/lang/IllegalArgumentException;
        //  72     84     172    177    Ljava/lang/IllegalArgumentException;
        //  89     101    177    182    Ljava/lang/IllegalArgumentException;
        //  106    118    182    187    Ljava/lang/IllegalArgumentException;
        //  123    135    187    192    Ljava/lang/IllegalArgumentException;
        //  140    152    192    197    Ljava/lang/IllegalArgumentException;
        //  160    162    162    167    Ljava/lang/IllegalArgumentException;
        //  164    167    167    172    Ljava/lang/IllegalArgumentException;
        //  169    172    172    177    Ljava/lang/IllegalArgumentException;
        //  174    177    177    182    Ljava/lang/IllegalArgumentException;
        //  179    182    182    187    Ljava/lang/IllegalArgumentException;
        //  184    187    187    192    Ljava/lang/IllegalArgumentException;
        //  189    192    192    197    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 101, Size: 101
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
    
    private void F() {
        aol.a();
        try {
            if (this.r != null) {
                Log.i(VoiceService.Z[78]);
                this.r.release();
                this.r = null;
            }
        }
        catch (Exception ex) {
            Log.b(ex);
            this.r = null;
        }
    }
    
    private void G() {
        this.M.removeMessages(0);
        this.M.sendEmptyMessageDelayed(0, 3000L);
    }
    
    private void H() {
        this.e.removeMessages(1);
        this.e.sendEmptyMessageDelayed(1, 500L);
    }
    
    static AtomicInteger I() {
        return VoiceService.w;
    }
    
    private void J() {
        Label_0041: {
            try {
                Log.i(VoiceService.Z[40]);
                aol.a();
                this.j = false;
                if (this.r == null) {
                    break Label_0041;
                }
                final int n = Build$VERSION.SDK_INT;
                final int n2 = 21;
                if (n >= n2) {
                    return;
                }
                break Label_0041;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            try {
                final int n = Build$VERSION.SDK_INT;
                final int n2 = 21;
                if (n >= n2) {
                    return;
                }
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        if (this.l != null) {
            final Window window = this.l.a().getWindow();
            final View child = ((ViewGroup)window.getDecorView().findViewById(16908290)).getChildAt(0);
            if (child.getVisibility() == 4) {
                final WindowManager$LayoutParams attributes = window.getAttributes();
                try {
                    attributes.flags &= 0xFFFFFBFF;
                    attributes.screenBrightness = -1.0f;
                    if (Build$VERSION.SDK_INT >= 11) {
                        window.getDecorView().setSystemUiVisibility(0xFFFFFFFD & window.getDecorView().getSystemUiVisibility());
                    }
                    child.setVisibility(0);
                    window.setAttributes(attributes);
                }
                catch (IllegalArgumentException ex3) {
                    throw ex3;
                }
            }
        }
    }
    
    private void K() {
        this.e.removeMessages(0);
        this.e.sendEmptyMessage(0);
    }
    
    private void L() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //     7: bipush          28
        //     9: aaload         
        //    10: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    13: invokestatic    com/whatsapp/Voip.getPeerJid:()Ljava/lang/String;
        //    16: astore_2       
        //    17: aload_2        
        //    18: ifnonnull       36
        //    21: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    24: bipush          31
        //    26: aaload         
        //    27: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    30: return         
        //    31: astore          30
        //    33: aload           30
        //    35: athrow         
        //    36: aload_0        
        //    37: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    40: bipush          30
        //    42: aaload         
        //    43: invokevirtual   com/whatsapp/VoiceService.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    46: checkcast       Landroid/media/AudioManager;
        //    49: astore_3       
        //    50: aload_3        
        //    51: invokevirtual   android/media/AudioManager.getRingerMode:()I
        //    54: istore          7
        //    56: iload           7
        //    58: tableswitch {
        //                0: 426
        //                1: 439
        //                2: 413
        //          default: 84
        //        }
        //    84: aload_0        
        //    85: getfield        com/whatsapp/VoiceService.W:Landroid/media/Ringtone;
        //    88: ifnonnull       30
        //    91: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    94: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    97: bipush          27
        //    99: aaload         
        //   100: iconst_0       
        //   101: invokevirtual   com/whatsapp/App.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //   104: astore          8
        //   106: aload           8
        //   108: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   111: bipush          24
        //   113: aaload         
        //   114: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   117: bipush          25
        //   119: aaload         
        //   120: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   125: astore          9
        //   127: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   130: aload_2        
        //   131: invokevirtual   com/whatsapp/wc.d:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   134: astore          10
        //   136: aload           10
        //   138: ifnull          159
        //   141: aload           10
        //   143: aload           8
        //   145: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/SharedPreferences;)Ljava/lang/String;
        //   148: astore          29
        //   150: aload           29
        //   152: ifnull          159
        //   155: aload           29
        //   157: astore          9
        //   159: aload           9
        //   161: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   164: ifne            215
        //   167: new             Ljava/lang/StringBuilder;
        //   170: dup            
        //   171: invokespecial   java/lang/StringBuilder.<init>:()V
        //   174: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   177: bipush          26
        //   179: aaload         
        //   180: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   183: aload           9
        //   185: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   188: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   191: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   194: aload_0        
        //   195: aload           9
        //   197: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //   200: putfield        com/whatsapp/VoiceService.F:Landroid/net/Uri;
        //   203: aload_0        
        //   204: aload_0        
        //   205: aload_0        
        //   206: getfield        com/whatsapp/VoiceService.F:Landroid/net/Uri;
        //   209: invokestatic    android/media/RingtoneManager.getRingtone:(Landroid/content/Context;Landroid/net/Uri;)Landroid/media/Ringtone;
        //   212: putfield        com/whatsapp/VoiceService.W:Landroid/media/Ringtone;
        //   215: aload_0        
        //   216: getfield        com/whatsapp/VoiceService.W:Landroid/media/Ringtone;
        //   219: ifnull          494
        //   222: aload_3        
        //   223: iconst_1       
        //   224: invokevirtual   android/media/AudioManager.setMode:(I)V
        //   227: aload_0        
        //   228: getfield        com/whatsapp/VoiceService.W:Landroid/media/Ringtone;
        //   231: invokevirtual   android/media/Ringtone.play:()V
        //   234: aload_3        
        //   235: invokevirtual   android/media/AudioManager.getRingerMode:()I
        //   238: iconst_2       
        //   239: if_icmpeq       254
        //   242: aload_3        
        //   243: invokevirtual   android/media/AudioManager.getRingerMode:()I
        //   246: istore          26
        //   248: iload           26
        //   250: iconst_1       
        //   251: if_icmpne       30
        //   254: aload           8
        //   256: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   259: bipush          22
        //   261: aaload         
        //   262: ldc_w           "1"
        //   265: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   270: astore          14
        //   272: aload           14
        //   274: ldc_w           "0"
        //   277: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   280: ifne            30
        //   283: iconst_m1      
        //   284: istore          15
        //   286: aload           14
        //   288: invokevirtual   java/lang/String.hashCode:()I
        //   291: istore          17
        //   293: iload           17
        //   295: tableswitch {
        //               98: 544
        //               99: 566
        //              100: 588
        //          default: 320
        //        }
        //   320: iload           15
        //   322: tableswitch {
        //                0: 624
        //                1: 651
        //                2: 678
        //          default: 348
        //        }
        //   348: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   351: bipush          32
        //   353: aaload         
        //   354: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   357: new             Ljava/lang/StringBuilder;
        //   360: dup            
        //   361: invokespecial   java/lang/StringBuilder.<init>:()V
        //   364: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   367: bipush          21
        //   369: aaload         
        //   370: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   373: aload           14
        //   375: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   378: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   381: invokestatic    com/whatsapp/aol.a:(Ljava/lang/String;)V
        //   384: aload_0        
        //   385: getfield        com/whatsapp/VoiceService.h:[J
        //   388: ifnull          30
        //   391: aload_0        
        //   392: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   395: bipush          29
        //   397: aaload         
        //   398: invokevirtual   com/whatsapp/VoiceService.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   401: checkcast       Landroid/os/Vibrator;
        //   404: aload_0        
        //   405: getfield        com/whatsapp/VoiceService.h:[J
        //   408: iconst_0       
        //   409: invokevirtual   android/os/Vibrator.vibrate:([JI)V
        //   412: return         
        //   413: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   416: bipush          33
        //   418: aaload         
        //   419: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   422: iload_1        
        //   423: ifeq            84
        //   426: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   429: bipush          34
        //   431: aaload         
        //   432: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   435: iload_1        
        //   436: ifeq            84
        //   439: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   442: bipush          20
        //   444: aaload         
        //   445: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   448: goto            84
        //   451: astore          6
        //   453: aload           6
        //   455: athrow         
        //   456: astore          4
        //   458: aload           4
        //   460: athrow         
        //   461: astore          5
        //   463: aload           5
        //   465: athrow         
        //   466: astore          11
        //   468: aload           11
        //   470: athrow         
        //   471: astore          27
        //   473: aload           27
        //   475: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   478: aload_0        
        //   479: getfield        com/whatsapp/VoiceService.W:Landroid/media/Ringtone;
        //   482: invokevirtual   android/media/Ringtone.stop:()V
        //   485: aload_0        
        //   486: aconst_null    
        //   487: putfield        com/whatsapp/VoiceService.W:Landroid/media/Ringtone;
        //   490: iload_1        
        //   491: ifeq            234
        //   494: new             Ljava/lang/StringBuilder;
        //   497: dup            
        //   498: invokespecial   java/lang/StringBuilder.<init>:()V
        //   501: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   504: bipush          23
        //   506: aaload         
        //   507: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   510: aload           9
        //   512: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   515: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   518: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   521: goto            234
        //   524: astore          12
        //   526: aload           12
        //   528: athrow         
        //   529: astore          28
        //   531: aload           28
        //   533: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   536: goto            485
        //   539: astore          13
        //   541: aload           13
        //   543: athrow         
        //   544: aload           14
        //   546: ldc_w           "1"
        //   549: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   552: istore          25
        //   554: iload           25
        //   556: ifeq            320
        //   559: iload_1        
        //   560: ifeq            729
        //   563: iconst_0       
        //   564: istore          15
        //   566: aload           14
        //   568: ldc_w           "2"
        //   571: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   574: istore          24
        //   576: iload           24
        //   578: ifeq            320
        //   581: iload_1        
        //   582: ifeq            723
        //   585: iconst_1       
        //   586: istore          15
        //   588: aload           14
        //   590: ldc_w           "3"
        //   593: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   596: istore          19
        //   598: iload           19
        //   600: ifeq            320
        //   603: iconst_2       
        //   604: istore          15
        //   606: goto            320
        //   609: astore          16
        //   611: aload           16
        //   613: athrow         
        //   614: astore          23
        //   616: aload           23
        //   618: athrow         
        //   619: astore          18
        //   621: aload           18
        //   623: athrow         
        //   624: aload_0        
        //   625: iconst_3       
        //   626: newarray        J
        //   628: dup            
        //   629: iconst_0       
        //   630: lconst_0       
        //   631: lastore        
        //   632: dup            
        //   633: iconst_1       
        //   634: ldc2_w          750
        //   637: lastore        
        //   638: dup            
        //   639: iconst_2       
        //   640: ldc2_w          1500
        //   643: lastore        
        //   644: putfield        com/whatsapp/VoiceService.h:[J
        //   647: iload_1        
        //   648: ifeq            384
        //   651: aload_0        
        //   652: iconst_3       
        //   653: newarray        J
        //   655: dup            
        //   656: iconst_0       
        //   657: lconst_0       
        //   658: lastore        
        //   659: dup            
        //   660: iconst_1       
        //   661: ldc2_w          300
        //   664: lastore        
        //   665: dup            
        //   666: iconst_2       
        //   667: ldc2_w          200
        //   670: lastore        
        //   671: putfield        com/whatsapp/VoiceService.h:[J
        //   674: iload_1        
        //   675: ifeq            384
        //   678: aload_0        
        //   679: iconst_3       
        //   680: newarray        J
        //   682: dup            
        //   683: iconst_0       
        //   684: lconst_0       
        //   685: lastore        
        //   686: dup            
        //   687: iconst_1       
        //   688: ldc2_w          750
        //   691: lastore        
        //   692: dup            
        //   693: iconst_2       
        //   694: ldc2_w          250
        //   697: lastore        
        //   698: putfield        com/whatsapp/VoiceService.h:[J
        //   701: iload_1        
        //   702: ifeq            384
        //   705: goto            348
        //   708: astore          22
        //   710: aload           22
        //   712: athrow         
        //   713: astore          21
        //   715: aload           21
        //   717: athrow         
        //   718: astore          20
        //   720: aload           20
        //   722: athrow         
        //   723: iconst_1       
        //   724: istore          15
        //   726: goto            320
        //   729: iconst_0       
        //   730: istore          15
        //   732: goto            320
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  21     30     31     36     Ljava/lang/Exception;
        //  50     56     456    461    Ljava/lang/Exception;
        //  159    215    466    471    Ljava/lang/Exception;
        //  227    234    471    494    Ljava/lang/Exception;
        //  234    248    539    544    Ljava/lang/Exception;
        //  286    293    609    614    Ljava/lang/Exception;
        //  348    384    718    723    Ljava/lang/Exception;
        //  413    422    456    461    Ljava/lang/Exception;
        //  426    435    461    466    Ljava/lang/Exception;
        //  439    448    451    456    Ljava/lang/Exception;
        //  458    461    461    466    Ljava/lang/Exception;
        //  463    466    451    456    Ljava/lang/Exception;
        //  478    485    529    539    Ljava/lang/Exception;
        //  485    490    524    529    Ljava/lang/Exception;
        //  494    521    524    529    Ljava/lang/Exception;
        //  544    554    609    614    Ljava/lang/Exception;
        //  566    576    614    619    Ljava/lang/Exception;
        //  588    598    619    624    Ljava/lang/Exception;
        //  624    647    708    713    Ljava/lang/Exception;
        //  651    674    713    718    Ljava/lang/Exception;
        //  678    701    718    723    Ljava/lang/Exception;
        //  710    713    713    718    Ljava/lang/Exception;
        //  715    718    718    723    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 325, Size: 325
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
    
    private void N() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/whatsapp/aol.a:()V
        //     3: aload_0        
        //     4: getfield        com/whatsapp/VoiceService.r:Landroid/os/PowerManager$WakeLock;
        //     7: astore_2       
        //     8: aload_2        
        //     9: ifnull          16
        //    12: return         
        //    13: astore_1       
        //    14: aload_1        
        //    15: athrow         
        //    16: aload_0        
        //    17: invokespecial   com/whatsapp/VoiceService.l:()I
        //    20: istore          4
        //    22: aload_0        
        //    23: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    26: bipush          48
        //    28: aaload         
        //    29: invokevirtual   com/whatsapp/VoiceService.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    32: checkcast       Landroid/os/PowerManager;
        //    35: astore          5
        //    37: aload_0        
        //    38: getfield        com/whatsapp/VoiceService.r:Landroid/os/PowerManager$WakeLock;
        //    41: astore          10
        //    43: aload           10
        //    45: ifnonnull       12
        //    48: iload           4
        //    50: iconst_m1      
        //    51: if_icmpeq       12
        //    54: aload           5
        //    56: ifnull          12
        //    59: aload_0        
        //    60: aload           5
        //    62: iload           4
        //    64: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    67: bipush          49
        //    69: aaload         
        //    70: invokevirtual   android/os/PowerManager.newWakeLock:(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
        //    73: putfield        com/whatsapp/VoiceService.r:Landroid/os/PowerManager$WakeLock;
        //    76: aload_0        
        //    77: getfield        com/whatsapp/VoiceService.r:Landroid/os/PowerManager$WakeLock;
        //    80: astore          11
        //    82: aload           11
        //    84: ifnull          12
        //    87: aload_0        
        //    88: getfield        com/whatsapp/VoiceService.r:Landroid/os/PowerManager$WakeLock;
        //    91: invokevirtual   android/os/PowerManager$WakeLock.acquire:()V
        //    94: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    97: bipush          47
        //    99: aaload         
        //   100: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   103: return         
        //   104: astore          9
        //   106: aload           9
        //   108: athrow         
        //   109: astore_3       
        //   110: aload_3        
        //   111: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   114: aload_0        
        //   115: aconst_null    
        //   116: putfield        com/whatsapp/VoiceService.r:Landroid/os/PowerManager$WakeLock;
        //   119: return         
        //   120: astore          6
        //   122: aload           6
        //   124: athrow         
        //   125: astore          7
        //   127: aload           7
        //   129: athrow         
        //   130: astore          8
        //   132: aload           8
        //   134: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      8      13     16     Ljava/lang/Exception;
        //  16     37     109    120    Ljava/lang/Exception;
        //  37     43     120    130    Ljava/lang/Exception;
        //  59     82     130    135    Ljava/lang/Exception;
        //  87     103    104    109    Ljava/lang/Exception;
        //  106    109    109    120    Ljava/lang/Exception;
        //  122    125    125    130    Ljava/lang/Exception;
        //  127    130    130    135    Ljava/lang/Exception;
        //  132    135    104    109    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 70, Size: 70
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
    
    static BluetoothHeadset a(final VoiceService voiceService, final BluetoothHeadset a) {
        return voiceService.a = a;
    }
    
    static Ringtone a(final VoiceService voiceService, final Ringtone w) {
        return voiceService.W = w;
    }
    
    static Double a(final VoiceService voiceService, final Double n) {
        return voiceService.N = n;
    }
    
    static ThreadPoolExecutor a() {
        return VoiceService.C;
    }
    
    static void a(final VoiceService voiceService, final Voip$CallInfo voip$CallInfo) {
        voiceService.b(voip$CallInfo);
    }
    
    static void a(final VoiceService voiceService, final Voip$CallState voip$CallState) {
        voiceService.a(voip$CallState);
    }
    
    static void a(final VoiceService voiceService, final Voip$CallState voip$CallState, final Voip$CallInfo voip$CallInfo) {
        voiceService.a(voip$CallState, voip$CallInfo);
    }
    
    static void a(final VoiceService voiceService, final Events$Call events$Call) {
        voiceService.a(events$Call);
    }
    
    static void a(final VoiceService voiceService, final String s) {
        voiceService.a(s);
    }
    
    private void a(final Voip$CallState p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //     8: bipush          59
        //    10: aaload         
        //    11: invokevirtual   com/whatsapp/VoiceService.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    14: checkcast       Landroid/media/AudioManager;
        //    17: astore_3       
        //    18: getstatic       com/whatsapp/z2.a:[I
        //    21: aload_1        
        //    22: invokevirtual   com/whatsapp/Voip$CallState.ordinal:()I
        //    25: iaload         
        //    26: istore          9
        //    28: iload           9
        //    30: tableswitch {
        //                2: 69
        //                3: 163
        //                4: 69
        //                5: 69
        //                6: 69
        //                7: 193
        //          default: 68
        //        }
        //    68: return         
        //    69: aload_0        
        //    70: getfield        com/whatsapp/VoiceService.z:Ljava/lang/Integer;
        //    73: astore          14
        //    75: aload           14
        //    77: ifnull          92
        //    80: aload_0        
        //    81: aload_0        
        //    82: getfield        com/whatsapp/VoiceService.z:Ljava/lang/Integer;
        //    85: putfield        com/whatsapp/VoiceService.Q:Ljava/lang/Integer;
        //    88: iload_2        
        //    89: ifeq            124
        //    92: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    95: istore          15
        //    97: iload           15
        //    99: bipush          11
        //   101: if_icmplt       116
        //   104: aload_0        
        //   105: iconst_3       
        //   106: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   109: putfield        com/whatsapp/VoiceService.Q:Ljava/lang/Integer;
        //   112: iload_2        
        //   113: ifeq            124
        //   116: aload_0        
        //   117: iconst_2       
        //   118: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   121: putfield        com/whatsapp/VoiceService.Q:Ljava/lang/Integer;
        //   124: aload_3        
        //   125: aload_0        
        //   126: getfield        com/whatsapp/VoiceService.Q:Ljava/lang/Integer;
        //   129: invokevirtual   java/lang/Integer.intValue:()I
        //   132: invokevirtual   android/media/AudioManager.setMode:(I)V
        //   135: aload_0        
        //   136: getfield        com/whatsapp/VoiceService.l:Lcom/whatsapp/px;
        //   139: astore          18
        //   141: aload           18
        //   143: ifnull          68
        //   146: aload_0        
        //   147: getfield        com/whatsapp/VoiceService.l:Lcom/whatsapp/px;
        //   150: invokeinterface com/whatsapp/px.a:()Landroid/app/Activity;
        //   155: iconst_0       
        //   156: invokevirtual   android/app/Activity.setVolumeControlStream:(I)V
        //   159: iload_2        
        //   160: ifeq            68
        //   163: aload_0        
        //   164: getfield        com/whatsapp/VoiceService.l:Lcom/whatsapp/px;
        //   167: astore          13
        //   169: aload           13
        //   171: ifnull          68
        //   174: aload_0        
        //   175: getfield        com/whatsapp/VoiceService.l:Lcom/whatsapp/px;
        //   178: invokeinterface com/whatsapp/px.a:()Landroid/app/Activity;
        //   183: ldc_w           -2147483648
        //   186: invokevirtual   android/app/Activity.setVolumeControlStream:(I)V
        //   189: iload_2        
        //   190: ifeq            68
        //   193: aload_3        
        //   194: iconst_1       
        //   195: invokevirtual   android/media/AudioManager.setMode:(I)V
        //   198: aload_0        
        //   199: getfield        com/whatsapp/VoiceService.l:Lcom/whatsapp/px;
        //   202: ifnull          68
        //   205: aload_0        
        //   206: getfield        com/whatsapp/VoiceService.l:Lcom/whatsapp/px;
        //   209: invokeinterface com/whatsapp/px.a:()Landroid/app/Activity;
        //   214: iconst_2       
        //   215: invokevirtual   android/app/Activity.setVolumeControlStream:(I)V
        //   218: return         
        //   219: astore          10
        //   221: aload           10
        //   223: athrow         
        //   224: astore          4
        //   226: aload           4
        //   228: athrow         
        //   229: astore          5
        //   231: aload           5
        //   233: athrow         
        //   234: astore          6
        //   236: aload           6
        //   238: athrow         
        //   239: astore          7
        //   241: aload           7
        //   243: athrow         
        //   244: astore          8
        //   246: aload           8
        //   248: athrow         
        //   249: astore          16
        //   251: aload           16
        //   253: athrow         
        //   254: astore          17
        //   256: aload           17
        //   258: athrow         
        //   259: astore          11
        //   261: aload           11
        //   263: athrow         
        //   264: astore          12
        //   266: aload           12
        //   268: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  18     28     224    229    Ljava/lang/IllegalArgumentException;
        //  69     75     229    234    Ljava/lang/IllegalArgumentException;
        //  80     88     234    239    Ljava/lang/IllegalArgumentException;
        //  92     97     239    244    Ljava/lang/IllegalArgumentException;
        //  104    112    244    249    Ljava/lang/IllegalArgumentException;
        //  116    124    244    249    Ljava/lang/IllegalArgumentException;
        //  124    141    249    254    Ljava/lang/IllegalArgumentException;
        //  146    159    254    259    Ljava/lang/IllegalArgumentException;
        //  163    169    259    264    Ljava/lang/IllegalArgumentException;
        //  174    189    264    269    Ljava/lang/IllegalArgumentException;
        //  193    218    219    224    Ljava/lang/IllegalArgumentException;
        //  226    229    229    234    Ljava/lang/IllegalArgumentException;
        //  231    234    234    239    Ljava/lang/IllegalArgumentException;
        //  236    239    239    244    Ljava/lang/IllegalArgumentException;
        //  241    244    244    249    Ljava/lang/IllegalArgumentException;
        //  251    254    254    259    Ljava/lang/IllegalArgumentException;
        //  256    259    259    264    Ljava/lang/IllegalArgumentException;
        //  261    264    264    269    Ljava/lang/IllegalArgumentException;
        //  266    269    219    224    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 114, Size: 114
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
    
    private void a(final Voip$CallState p0, final Voip$CallInfo p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_3       
        //     4: invokestatic    com/whatsapp/aol.a:()V
        //     7: aload_2        
        //     8: ifnull          519
        //    11: aload_1        
        //    12: aload_2        
        //    13: invokevirtual   com/whatsapp/Voip$CallInfo.getCallState:()Lcom/whatsapp/Voip$CallState;
        //    16: if_acmpne       30
        //    19: return         
        //    20: astore          4
        //    22: aload           4
        //    24: athrow         
        //    25: astore          5
        //    27: aload           5
        //    29: athrow         
        //    30: aload_2        
        //    31: invokevirtual   com/whatsapp/Voip$CallInfo.getCallState:()Lcom/whatsapp/Voip$CallState;
        //    34: astore          6
        //    36: getstatic       com/whatsapp/Voip$CallState.RECEIVED_CALL:Lcom/whatsapp/Voip$CallState;
        //    39: astore          10
        //    41: aload           6
        //    43: aload           10
        //    45: if_acmpne       56
        //    48: aload_0        
        //    49: invokespecial   com/whatsapp/VoiceService.H:()V
        //    52: iload_3        
        //    53: ifeq            72
        //    56: aload           6
        //    58: getstatic       com/whatsapp/Voip$CallState.NONE:Lcom/whatsapp/Voip$CallState;
        //    61: if_acmpne       72
        //    64: aload_0        
        //    65: getfield        com/whatsapp/VoiceService.e:Landroid/os/Handler;
        //    68: iconst_1       
        //    69: invokevirtual   android/os/Handler.removeMessages:(I)V
        //    72: aload           6
        //    74: getstatic       com/whatsapp/Voip$CallState.NONE:Lcom/whatsapp/Voip$CallState;
        //    77: if_acmpeq       84
        //    80: aload_0        
        //    81: invokespecial   com/whatsapp/VoiceService.c:()V
        //    84: aload_0        
        //    85: getfield        com/whatsapp/VoiceService.l:Lcom/whatsapp/px;
        //    88: astore          12
        //    90: iconst_0       
        //    91: istore          13
        //    93: aload           12
        //    95: ifnull          120
        //    98: aload_0        
        //    99: getfield        com/whatsapp/VoiceService.l:Lcom/whatsapp/px;
        //   102: invokeinterface com/whatsapp/px.c:()Z
        //   107: istore          13
        //   109: aload_0        
        //   110: getfield        com/whatsapp/VoiceService.l:Lcom/whatsapp/px;
        //   113: aload_1        
        //   114: aload_2        
        //   115: invokeinterface com/whatsapp/px.a:(Lcom/whatsapp/Voip$CallState;Lcom/whatsapp/Voip$CallInfo;)V
        //   120: new             Lcom/whatsapp/protocol/c6;
        //   123: dup            
        //   124: aload_2        
        //   125: invokevirtual   com/whatsapp/Voip$CallInfo.getPeerId:()Ljava/lang/String;
        //   128: aload_2        
        //   129: invokevirtual   com/whatsapp/Voip$CallInfo.isCaller:()Z
        //   132: aload_2        
        //   133: invokevirtual   com/whatsapp/Voip$CallInfo.getCallId:()Ljava/lang/String;
        //   136: invokestatic    com/whatsapp/Voip.a:(Ljava/lang/String;)Ljava/lang/String;
        //   139: invokespecial   com/whatsapp/protocol/c6.<init>:(Ljava/lang/String;ZLjava/lang/String;)V
        //   142: astore          14
        //   144: getstatic       com/whatsapp/Voip$CallState.NONE:Lcom/whatsapp/Voip$CallState;
        //   147: astore          19
        //   149: aload           6
        //   151: aload           19
        //   153: if_acmpne       378
        //   156: aload_0        
        //   157: getfield        com/whatsapp/VoiceService.q:Lcom/whatsapp/fieldstats/Events$Call;
        //   160: astore          24
        //   162: aload           24
        //   164: ifnull          289
        //   167: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //   170: aload_0        
        //   171: getfield        com/whatsapp/VoiceService.t:Ljava/lang/Boolean;
        //   174: invokevirtual   java/lang/Boolean.equals:(Ljava/lang/Object;)Z
        //   177: istore          30
        //   179: iload           30
        //   181: ifeq            261
        //   184: getstatic       com/whatsapp/Voip$CallState.ACTIVE:Lcom/whatsapp/Voip$CallState;
        //   187: astore          33
        //   189: aload_1        
        //   190: aload           33
        //   192: if_acmpne       261
        //   195: iload           13
        //   197: ifeq            261
        //   200: new             Landroid/content/Intent;
        //   203: dup            
        //   204: aload_0        
        //   205: ldc_w           Lcom/whatsapp/CallRatingActivity;.class
        //   208: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   211: astore          34
        //   213: aload           34
        //   215: ldc_w           268435456
        //   218: invokevirtual   android/content/Intent.setFlags:(I)Landroid/content/Intent;
        //   221: pop            
        //   222: aload           34
        //   224: getstatic       com/whatsapp/CallRatingActivity.l:Ljava/lang/String;
        //   227: aload_0        
        //   228: getfield        com/whatsapp/VoiceService.q:Lcom/whatsapp/fieldstats/Events$Call;
        //   231: invokestatic    com/whatsapp/aam.a:(Ljava/lang/Object;)Landroid/os/Bundle;
        //   234: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
        //   237: pop            
        //   238: aload           34
        //   240: getstatic       com/whatsapp/CallRatingActivity.j:Ljava/lang/String;
        //   243: aload_0        
        //   244: getfield        com/whatsapp/VoiceService.S:Z
        //   247: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   250: pop            
        //   251: aload_0        
        //   252: aload           34
        //   254: invokevirtual   com/whatsapp/VoiceService.startActivity:(Landroid/content/Intent;)V
        //   257: iload_3        
        //   258: ifeq            298
        //   261: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   264: aload_0        
        //   265: getfield        com/whatsapp/VoiceService.q:Lcom/whatsapp/fieldstats/Events$Call;
        //   268: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/b9;)V
        //   271: aload_0        
        //   272: getfield        com/whatsapp/VoiceService.S:Z
        //   275: istore          32
        //   277: iload           32
        //   279: ifeq            298
        //   282: invokestatic    com/whatsapp/aam.b:()V
        //   285: iload_3        
        //   286: ifeq            298
        //   289: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   292: bipush          38
        //   294: aaload         
        //   295: invokestatic    com/whatsapp/aol.a:(Ljava/lang/String;)V
        //   298: aload_0        
        //   299: aload_1        
        //   300: invokespecial   com/whatsapp/VoiceService.b:(Lcom/whatsapp/Voip$CallState;)V
        //   303: invokestatic    com/whatsapp/Voip.c:()V
        //   306: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   309: aload           14
        //   311: invokevirtual   com/whatsapp/vy.a:(Lcom/whatsapp/protocol/c6;)Lcom/whatsapp/protocol/bi;
        //   314: astore          26
        //   316: aload           26
        //   318: ifnull          347
        //   321: aload           26
        //   323: invokestatic    com/whatsapp/App.j:(Lcom/whatsapp/protocol/bi;)V
        //   326: aload           26
        //   328: invokestatic    com/whatsapp/Voip.a:(Lcom/whatsapp/protocol/bi;)Z
        //   331: istore          29
        //   333: iload           29
        //   335: ifeq            374
        //   338: aload           26
        //   340: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/protocol/bi;)V
        //   343: iload_3        
        //   344: ifeq            374
        //   347: new             Ljava/lang/StringBuilder;
        //   350: dup            
        //   351: invokespecial   java/lang/StringBuilder.<init>:()V
        //   354: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   357: bipush          37
        //   359: aaload         
        //   360: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   363: aload           14
        //   365: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   368: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   371: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   374: iload_3        
        //   375: ifeq            519
        //   378: invokestatic    com/whatsapp/Voip.a:()V
        //   381: getstatic       com/whatsapp/Voip$CallState.NONE:Lcom/whatsapp/Voip$CallState;
        //   384: astore          21
        //   386: aload_1        
        //   387: aload           21
        //   389: if_acmpne       519
        //   392: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   395: aload           14
        //   397: invokevirtual   com/whatsapp/vy.a:(Lcom/whatsapp/protocol/c6;)Lcom/whatsapp/protocol/bi;
        //   400: astore          22
        //   402: aload           22
        //   404: ifnull          416
        //   407: aload           22
        //   409: invokestatic    com/whatsapp/App.k:(Lcom/whatsapp/protocol/bi;)V
        //   412: iload_3        
        //   413: ifeq            519
        //   416: new             Ljava/lang/StringBuilder;
        //   419: dup            
        //   420: invokespecial   java/lang/StringBuilder.<init>:()V
        //   423: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   426: bipush          36
        //   428: aaload         
        //   429: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   432: aload           14
        //   434: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   437: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   440: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   443: return         
        //   444: astore          23
        //   446: aload           23
        //   448: athrow         
        //   449: astore          7
        //   451: aload           7
        //   453: athrow         
        //   454: astore          8
        //   456: aload           8
        //   458: athrow         
        //   459: astore          9
        //   461: aload           9
        //   463: athrow         
        //   464: astore          11
        //   466: aload           11
        //   468: athrow         
        //   469: astore          15
        //   471: aload           15
        //   473: athrow         
        //   474: astore          16
        //   476: aload           16
        //   478: athrow         
        //   479: astore          17
        //   481: aload           17
        //   483: athrow         
        //   484: astore          18
        //   486: aload           18
        //   488: athrow         
        //   489: astore          35
        //   491: aload           35
        //   493: athrow         
        //   494: astore          31
        //   496: aload           31
        //   498: athrow         
        //   499: astore          25
        //   501: aload           25
        //   503: athrow         
        //   504: astore          28
        //   506: aload           28
        //   508: athrow         
        //   509: astore          27
        //   511: aload           27
        //   513: athrow         
        //   514: astore          20
        //   516: aload           20
        //   518: athrow         
        //   519: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      7      20     25     Ljava/lang/IllegalArgumentException;
        //  11     19     25     30     Ljava/lang/IllegalArgumentException;
        //  22     25     25     30     Ljava/lang/IllegalArgumentException;
        //  36     41     449    454    Ljava/lang/IllegalArgumentException;
        //  48     52     454    459    Ljava/lang/IllegalArgumentException;
        //  56     72     459    464    Ljava/lang/IllegalArgumentException;
        //  72     84     464    469    Ljava/lang/IllegalArgumentException;
        //  144    149    469    474    Ljava/lang/IllegalArgumentException;
        //  156    162    474    479    Ljava/lang/IllegalArgumentException;
        //  167    179    479    484    Ljava/lang/IllegalArgumentException;
        //  184    189    484    489    Ljava/lang/IllegalArgumentException;
        //  213    257    489    494    Ljava/lang/IllegalArgumentException;
        //  261    277    494    499    Ljava/lang/IllegalArgumentException;
        //  282    285    499    504    Ljava/lang/IllegalArgumentException;
        //  289    298    499    504    Ljava/lang/IllegalArgumentException;
        //  321    333    504    509    Ljava/lang/IllegalArgumentException;
        //  338    343    509    514    Ljava/lang/IllegalArgumentException;
        //  347    374    509    514    Ljava/lang/IllegalArgumentException;
        //  378    386    514    519    Ljava/lang/IllegalArgumentException;
        //  407    412    444    449    Ljava/lang/IllegalArgumentException;
        //  416    443    444    449    Ljava/lang/IllegalArgumentException;
        //  451    454    454    459    Ljava/lang/IllegalArgumentException;
        //  456    459    459    464    Ljava/lang/IllegalArgumentException;
        //  471    474    474    479    Ljava/lang/IllegalArgumentException;
        //  476    479    479    484    Ljava/lang/IllegalArgumentException;
        //  481    484    484    489    Ljava/lang/IllegalArgumentException;
        //  491    494    494    499    Ljava/lang/IllegalArgumentException;
        //  496    499    499    504    Ljava/lang/IllegalArgumentException;
        //  506    509    509    514    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 243, Size: 243
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
    
    private void a(final Events$Call p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: ifnull          108
        //     4: aload_1        
        //     5: getfield        com/whatsapp/fieldstats/Events$Call.callAecMode:Ljava/lang/Double;
        //     8: astore          5
        //    10: aload           5
        //    12: ifnull          108
        //    15: aload_1        
        //    16: getfield        com/whatsapp/fieldstats/Events$Call.callEchoLikelihood:Ljava/lang/Double;
        //    19: astore          6
        //    21: aload           6
        //    23: ifnull          108
        //    26: aload_1        
        //    27: getfield        com/whatsapp/fieldstats/Events$Call.callT:Ljava/lang/Double;
        //    30: ifnull          108
        //    33: aload_1        
        //    34: getfield        com/whatsapp/fieldstats/Events$Call.callT:Ljava/lang/Double;
        //    37: invokevirtual   java/lang/Double.intValue:()I
        //    40: istore          7
        //    42: iload           7
        //    44: sipush          5000
        //    47: if_icmplt       108
        //    50: aload_0        
        //    51: invokespecial   com/whatsapp/VoiceService.x:()F
        //    54: fstore          8
        //    56: aload_1        
        //    57: getfield        com/whatsapp/fieldstats/Events$Call.callEchoLikelihood:Ljava/lang/Double;
        //    60: invokevirtual   java/lang/Double.floatValue:()F
        //    63: fstore          9
        //    65: fload           9
        //    67: fconst_0       
        //    68: fcmpg          
        //    69: iflt            81
        //    72: fload           9
        //    74: ldc_w           100.0
        //    77: fcmpl          
        //    78: ifle            125
        //    81: new             Ljava/lang/StringBuilder;
        //    84: dup            
        //    85: invokespecial   java/lang/StringBuilder.<init>:()V
        //    88: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    91: bipush          108
        //    93: aaload         
        //    94: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    97: fload           9
        //    99: invokevirtual   java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
        //   102: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   105: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   108: return         
        //   109: astore_2       
        //   110: aload_2        
        //   111: athrow         
        //   112: astore_3       
        //   113: aload_3        
        //   114: athrow         
        //   115: astore          4
        //   117: aload           4
        //   119: athrow         
        //   120: astore          10
        //   122: aload           10
        //   124: athrow         
        //   125: aload_1        
        //   126: getfield        com/whatsapp/fieldstats/Events$Call.callAecMode:Ljava/lang/Double;
        //   129: invokevirtual   java/lang/Double.intValue:()I
        //   132: istore          16
        //   134: getstatic       com/whatsapp/fieldstats/a8.NONE:Lcom/whatsapp/fieldstats/a8;
        //   137: invokevirtual   com/whatsapp/fieldstats/a8.getCode:()I
        //   140: istore          17
        //   142: iload           16
        //   144: iload           17
        //   146: if_icmpeq       180
        //   149: fload           8
        //   151: fconst_0       
        //   152: fcmpg          
        //   153: ifge            165
        //   156: fload           9
        //   158: ldc_w           70.0
        //   161: fcmpl          
        //   162: ifge            180
        //   165: fload           8
        //   167: fconst_0       
        //   168: fcmpl          
        //   169: iflt            108
        //   172: fload           9
        //   174: fload           8
        //   176: fcmpl          
        //   177: ifle            108
        //   180: fload           8
        //   182: fconst_0       
        //   183: fcmpg          
        //   184: ifge            193
        //   187: getstatic       com/whatsapp/App.I:Z
        //   190: ifeq            360
        //   193: ldc_w           0.5
        //   196: fload           8
        //   198: fmul           
        //   199: ldc_w           0.5
        //   202: fload           9
        //   204: fmul           
        //   205: fadd           
        //   206: fstore          18
        //   208: fload           18
        //   210: fconst_0       
        //   211: fcmpl          
        //   212: iflt            354
        //   215: fload           18
        //   217: ldc_w           100.0
        //   220: fcmpg          
        //   221: ifgt            354
        //   224: iconst_1       
        //   225: istore          19
        //   227: iload           19
        //   229: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   232: bipush          111
        //   234: aaload         
        //   235: invokestatic    com/whatsapp/aol.a:(ZLjava/lang/String;)V
        //   238: aload_0        
        //   239: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   242: bipush          109
        //   244: aaload         
        //   245: iconst_0       
        //   246: invokevirtual   com/whatsapp/VoiceService.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //   249: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //   254: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   257: bipush          113
        //   259: aaload         
        //   260: fload           18
        //   262: invokeinterface android/content/SharedPreferences$Editor.putFloat:(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;
        //   267: invokeinterface android/content/SharedPreferences$Editor.commit:()Z
        //   272: pop            
        //   273: new             Ljava/lang/StringBuilder;
        //   276: dup            
        //   277: invokespecial   java/lang/StringBuilder.<init>:()V
        //   280: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   283: bipush          110
        //   285: aaload         
        //   286: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   289: fload           8
        //   291: invokevirtual   java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
        //   294: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   297: bipush          112
        //   299: aaload         
        //   300: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   303: fload           9
        //   305: invokevirtual   java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
        //   308: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   311: bipush          107
        //   313: aaload         
        //   314: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   317: fload           18
        //   319: invokevirtual   java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
        //   322: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   325: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   328: return         
        //   329: astore          11
        //   331: aload           11
        //   333: athrow         
        //   334: astore          12
        //   336: aload           12
        //   338: athrow         
        //   339: astore          13
        //   341: aload           13
        //   343: athrow         
        //   344: astore          14
        //   346: aload           14
        //   348: athrow         
        //   349: astore          15
        //   351: aload           15
        //   353: athrow         
        //   354: iconst_0       
        //   355: istore          19
        //   357: goto            227
        //   360: fload           9
        //   362: fstore          18
        //   364: goto            208
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      10     109    112    Ljava/lang/IllegalArgumentException;
        //  15     21     112    115    Ljava/lang/IllegalArgumentException;
        //  26     42     115    120    Ljava/lang/IllegalArgumentException;
        //  81     108    120    125    Ljava/lang/IllegalArgumentException;
        //  110    112    112    115    Ljava/lang/IllegalArgumentException;
        //  113    115    115    120    Ljava/lang/IllegalArgumentException;
        //  125    142    329    354    Ljava/lang/IllegalArgumentException;
        //  331    334    334    354    Ljava/lang/IllegalArgumentException;
        //  336    339    339    354    Ljava/lang/IllegalArgumentException;
        //  341    344    344    354    Ljava/lang/IllegalArgumentException;
        //  346    349    349    354    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 175, Size: 175
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
    
    public static void a(final r r, final String s, final Double n) {
        final Events$Call events$Call = new Events$Call();
        events$Call.callNetwork = (double)d();
        events$Call.callResult = (double)r.getCode();
        events$Call.callSide = (double)n.CALLER.getCode();
        aam.a((Context)App.aq, false, events$Call, s, null, n, null, null, null, null);
    }
    
    public static void a(final r r, final String s, final Double n, final w w, final String s2, final String s3, final boolean b) {
        final Events$Call events$Call = new Events$Call();
        events$Call.callNetwork = (double)d();
        events$Call.callResult = (double)r.getCode();
        events$Call.callSide = (double)n.CALLEE.getCode();
        aam.a((Context)App.aq, b, events$Call, s, n, null, null, w, s2, s3);
    }
    
    private void a(final VoipOptions voipOptions) {
        if (voipOptions != null) {
            try {
                if (voipOptions.miscellaneous != null) {
                    this.z = voipOptions.miscellaneous.androidAudioModeInCall;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
    }
    
    private void a(final String s) {
        final Intent intent = new Intent(VoiceService.Z[136], (Uri)null, (Context)this, (Class)VoiceService.class);
        Label_0036: {
            if (s == null) {
                break Label_0036;
            }
            try {
                intent.putExtra(VoiceService.Z[135], s);
                this.startService(intent);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
    }
    
    private void a(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    10: bipush          52
        //    12: aaload         
        //    13: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    16: iload_1        
        //    17: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //    20: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    23: bipush          50
        //    25: aaload         
        //    26: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    29: aload_0        
        //    30: getfield        com/whatsapp/VoiceService.E:Z
        //    33: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //    36: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    39: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    42: aload_0        
        //    43: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    46: bipush          51
        //    48: aaload         
        //    49: invokevirtual   com/whatsapp/VoiceService.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    52: checkcast       Landroid/media/AudioManager;
        //    55: astore_2       
        //    56: iload_1        
        //    57: ifeq            99
        //    60: aload_0        
        //    61: iconst_0       
        //    62: putfield        com/whatsapp/VoiceService.D:Z
        //    65: aload_2        
        //    66: invokevirtual   android/media/AudioManager.startBluetoothSco:()V
        //    69: aload_0        
        //    70: getfield        com/whatsapp/VoiceService.E:Z
        //    73: istore          6
        //    75: iload           6
        //    77: ifeq            124
        //    80: aload_2        
        //    81: iconst_1       
        //    82: invokevirtual   android/media/AudioManager.setBluetoothScoOn:(Z)V
        //    85: aload_0        
        //    86: invokespecial   com/whatsapp/VoiceService.K:()V
        //    89: getstatic       com/whatsapp/App.I:Z
        //    92: istore          7
        //    94: iload           7
        //    96: ifeq            124
        //    99: aload_0        
        //   100: iconst_1       
        //   101: putfield        com/whatsapp/VoiceService.D:Z
        //   104: aload_2        
        //   105: invokevirtual   android/media/AudioManager.stopBluetoothSco:()V
        //   108: aload_0        
        //   109: getfield        com/whatsapp/VoiceService.E:Z
        //   112: ifne            124
        //   115: aload_2        
        //   116: iconst_0       
        //   117: invokevirtual   android/media/AudioManager.setBluetoothScoOn:(Z)V
        //   120: aload_0        
        //   121: invokespecial   com/whatsapp/VoiceService.K:()V
        //   124: return         
        //   125: astore          4
        //   127: aload           4
        //   129: athrow         
        //   130: astore          5
        //   132: aload           5
        //   134: athrow         
        //   135: astore_3       
        //   136: aload_3        
        //   137: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  60     75     125    130    Ljava/lang/IllegalArgumentException;
        //  80     94     130    135    Ljava/lang/IllegalArgumentException;
        //  99     124    135    138    Ljava/lang/IllegalArgumentException;
        //  127    130    130    135    Ljava/lang/IllegalArgumentException;
        //  132    135    135    138    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 69, Size: 69
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
    
    static boolean a(final VoiceService voiceService) {
        return voiceService.c;
    }
    
    static boolean a(final VoiceService voiceService, final boolean u) {
        return voiceService.u = u;
    }
    
    public static int[] a(final int[] p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: new             Ljava/util/ArrayList;
        //     7: dup            
        //     8: aload_0        
        //     9: arraylength    
        //    10: invokespecial   java/util/ArrayList.<init>:(I)V
        //    13: astore_3       
        //    14: aload_0        
        //    15: arraylength    
        //    16: istore          4
        //    18: iconst_0       
        //    19: istore          5
        //    21: iload           5
        //    23: iload           4
        //    25: if_icmpge       214
        //    28: aload_0        
        //    29: iload           5
        //    31: iaload         
        //    32: istore          9
        //    34: iload           9
        //    36: bipush          16
        //    38: iconst_2       
        //    39: invokestatic    android/media/AudioRecord.getMinBufferSize:(III)I
        //    42: istore          30
        //    44: iload           30
        //    46: istore          13
        //    48: iload           13
        //    50: bipush          -2
        //    52: if_icmpeq       717
        //    55: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    58: istore          41
        //    60: iload           41
        //    62: bipush          11
        //    64: if_icmplt       436
        //    67: bipush          7
        //    69: istore          11
        //    71: new             Landroid/media/AudioRecord;
        //    74: dup            
        //    75: iload           11
        //    77: iload           9
        //    79: bipush          16
        //    81: iconst_2       
        //    82: iload           13
        //    84: invokespecial   android/media/AudioRecord.<init>:(IIIII)V
        //    87: astore          42
        //    89: aload           42
        //    91: invokevirtual   android/media/AudioRecord.getState:()I
        //    94: istore          43
        //    96: iload           43
        //    98: iconst_1       
        //    99: if_icmpne       711
        //   102: aload           42
        //   104: invokevirtual   android/media/AudioRecord.release:()V
        //   107: iconst_1       
        //   108: istore          31
        //   110: new             Ljava/lang/StringBuilder;
        //   113: dup            
        //   114: invokespecial   java/lang/StringBuilder.<init>:()V
        //   117: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   120: bipush          74
        //   122: aaload         
        //   123: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   126: iload           9
        //   128: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   131: astore          33
        //   133: iload           31
        //   135: ifeq            447
        //   138: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   141: bipush          67
        //   143: aaload         
        //   144: astore          34
        //   146: aload           33
        //   148: aload           34
        //   150: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   153: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   156: bipush          62
        //   158: aaload         
        //   159: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   162: iload           13
        //   164: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   167: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   170: bipush          66
        //   172: aaload         
        //   173: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   176: iload           11
        //   178: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   181: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   184: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   187: iload           31
        //   189: ifeq            419
        //   192: aload_3        
        //   193: iload           9
        //   195: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   198: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   201: pop            
        //   202: aload_3        
        //   203: invokevirtual   java/util/ArrayList.size:()I
        //   206: istore          38
        //   208: iload           38
        //   210: iload_1        
        //   211: if_icmplt       419
        //   214: aload_3        
        //   215: invokestatic    java/util/Collections.sort:(Ljava/util/List;)V
        //   218: aload_3        
        //   219: invokevirtual   java/util/ArrayList.size:()I
        //   222: newarray        I
        //   224: astore          6
        //   226: iconst_0       
        //   227: istore          7
        //   229: iload           7
        //   231: aload           6
        //   233: arraylength    
        //   234: if_icmpge       264
        //   237: aload           6
        //   239: iload           7
        //   241: aload_3        
        //   242: iload           7
        //   244: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   247: checkcast       Ljava/lang/Integer;
        //   250: invokevirtual   java/lang/Integer.intValue:()I
        //   253: iastore        
        //   254: iload           7
        //   256: iconst_1       
        //   257: iadd           
        //   258: istore          8
        //   260: iload_2        
        //   261: ifeq            704
        //   264: aload           6
        //   266: areturn        
        //   267: astore          39
        //   269: aload           39
        //   271: athrow         
        //   272: astore          40
        //   274: aload           40
        //   276: athrow         
        //   277: astore          10
        //   279: iconst_0       
        //   280: istore          11
        //   282: iconst_0       
        //   283: istore          12
        //   285: new             Ljava/lang/StringBuilder;
        //   288: dup            
        //   289: invokespecial   java/lang/StringBuilder.<init>:()V
        //   292: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   295: bipush          63
        //   297: aaload         
        //   298: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   301: aload           10
        //   303: invokevirtual   java/lang/IllegalArgumentException.toString:()Ljava/lang/String;
        //   306: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   309: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   312: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   315: new             Ljava/lang/StringBuilder;
        //   318: dup            
        //   319: invokespecial   java/lang/StringBuilder.<init>:()V
        //   322: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   325: bipush          64
        //   327: aaload         
        //   328: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   331: iload           9
        //   333: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   336: astore          23
        //   338: iload           12
        //   340: ifeq            468
        //   343: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   346: bipush          71
        //   348: aaload         
        //   349: astore          24
        //   351: aload           23
        //   353: aload           24
        //   355: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   358: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   361: bipush          68
        //   363: aaload         
        //   364: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   367: iload           13
        //   369: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   372: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   375: bipush          65
        //   377: aaload         
        //   378: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   381: iload           11
        //   383: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   386: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   389: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   392: iload           12
        //   394: ifeq            419
        //   397: aload_3        
        //   398: iload           9
        //   400: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   403: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   406: pop            
        //   407: aload_3        
        //   408: invokevirtual   java/util/ArrayList.size:()I
        //   411: istore          28
        //   413: iload           28
        //   415: iload_1        
        //   416: if_icmpge       214
        //   419: iload           5
        //   421: iconst_1       
        //   422: iadd           
        //   423: istore          29
        //   425: iload_2        
        //   426: ifne            214
        //   429: iload           29
        //   431: istore          5
        //   433: goto            21
        //   436: iconst_0       
        //   437: istore          11
        //   439: goto            71
        //   442: astore          32
        //   444: aload           32
        //   446: athrow         
        //   447: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   450: bipush          70
        //   452: aaload         
        //   453: astore          34
        //   455: goto            146
        //   458: astore          35
        //   460: aload           35
        //   462: athrow         
        //   463: astore          36
        //   465: aload           36
        //   467: athrow         
        //   468: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   471: bipush          75
        //   473: aaload         
        //   474: astore          24
        //   476: goto            351
        //   479: astore          25
        //   481: aload           25
        //   483: athrow         
        //   484: astore          26
        //   486: aload           26
        //   488: athrow         
        //   489: astore          14
        //   491: iconst_0       
        //   492: istore          11
        //   494: iconst_0       
        //   495: istore          13
        //   497: iconst_0       
        //   498: istore          12
        //   500: new             Ljava/lang/StringBuilder;
        //   503: dup            
        //   504: invokespecial   java/lang/StringBuilder.<init>:()V
        //   507: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   510: bipush          69
        //   512: aaload         
        //   513: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   516: iload           9
        //   518: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   521: astore          16
        //   523: iload           12
        //   525: ifeq            621
        //   528: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   531: bipush          72
        //   533: aaload         
        //   534: astore          17
        //   536: aload           16
        //   538: aload           17
        //   540: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   543: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   546: bipush          73
        //   548: aaload         
        //   549: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   552: iload           13
        //   554: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   557: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   560: bipush          77
        //   562: aaload         
        //   563: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   566: iload           11
        //   568: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   571: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   574: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   577: iload           12
        //   579: ifeq            608
        //   582: aload_3        
        //   583: iload           9
        //   585: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   588: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   591: pop            
        //   592: aload_3        
        //   593: invokevirtual   java/util/ArrayList.size:()I
        //   596: istore          22
        //   598: iload           22
        //   600: iload_1        
        //   601: if_icmplt       608
        //   604: iload_2        
        //   605: ifeq            214
        //   608: aload           14
        //   610: athrow         
        //   611: astore          20
        //   613: aload           20
        //   615: athrow         
        //   616: astore          15
        //   618: aload           15
        //   620: athrow         
        //   621: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   624: bipush          76
        //   626: aaload         
        //   627: astore          17
        //   629: goto            536
        //   632: astore          18
        //   634: aload           18
        //   636: athrow         
        //   637: astore          19
        //   639: aload           19
        //   641: athrow         
        //   642: astore          14
        //   644: iconst_0       
        //   645: istore          11
        //   647: iconst_0       
        //   648: istore          12
        //   650: goto            500
        //   653: astore          14
        //   655: iconst_0       
        //   656: istore          12
        //   658: goto            500
        //   661: astore          14
        //   663: iconst_1       
        //   664: istore          12
        //   666: goto            500
        //   669: astore          14
        //   671: goto            500
        //   674: astore          10
        //   676: iconst_0       
        //   677: istore          11
        //   679: iconst_0       
        //   680: istore          12
        //   682: iconst_0       
        //   683: istore          13
        //   685: goto            285
        //   688: astore          10
        //   690: iconst_0       
        //   691: istore          12
        //   693: goto            285
        //   696: astore          10
        //   698: iconst_1       
        //   699: istore          12
        //   701: goto            285
        //   704: iload           8
        //   706: istore          7
        //   708: goto            229
        //   711: iconst_0       
        //   712: istore          31
        //   714: goto            110
        //   717: iconst_0       
        //   718: istore          11
        //   720: iconst_0       
        //   721: istore          31
        //   723: goto            110
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  34     44     674    688    Ljava/lang/IllegalArgumentException;
        //  34     44     489    500    Any
        //  55     60     267    285    Ljava/lang/IllegalArgumentException;
        //  55     60     642    653    Any
        //  71     96     688    696    Ljava/lang/IllegalArgumentException;
        //  71     96     653    661    Any
        //  102    107    696    704    Ljava/lang/IllegalArgumentException;
        //  102    107    661    669    Any
        //  110    133    442    447    Ljava/lang/IllegalArgumentException;
        //  138    146    442    447    Ljava/lang/IllegalArgumentException;
        //  146    187    458    468    Ljava/lang/IllegalArgumentException;
        //  192    208    458    468    Ljava/lang/IllegalArgumentException;
        //  269    272    272    285    Ljava/lang/IllegalArgumentException;
        //  269    272    642    653    Any
        //  274    277    277    285    Ljava/lang/IllegalArgumentException;
        //  274    277    642    653    Any
        //  285    315    669    674    Any
        //  351    392    479    489    Ljava/lang/IllegalArgumentException;
        //  397    413    479    489    Ljava/lang/IllegalArgumentException;
        //  460    463    463    468    Ljava/lang/IllegalArgumentException;
        //  481    484    484    489    Ljava/lang/IllegalArgumentException;
        //  500    523    616    621    Ljava/lang/IllegalArgumentException;
        //  528    536    616    621    Ljava/lang/IllegalArgumentException;
        //  536    577    632    637    Ljava/lang/IllegalArgumentException;
        //  582    598    637    642    Ljava/lang/IllegalArgumentException;
        //  608    611    611    616    Ljava/lang/IllegalArgumentException;
        //  634    637    637    642    Ljava/lang/IllegalArgumentException;
        //  639    642    611    616    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 353, Size: 353
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
    
    static Events$Call b(final VoiceService voiceService, final Events$Call q) {
        return voiceService.q = q;
    }
    
    static Double b(final VoiceService voiceService, final Double x) {
        return voiceService.X = x;
    }
    
    private void b() {
        Label_0042: {
            try {
                Log.i(VoiceService.Z[143]);
                aol.a();
                this.j = true;
                if (this.r == null) {
                    break Label_0042;
                }
                final int n = Build$VERSION.SDK_INT;
                final int n2 = 21;
                if (n >= n2) {
                    return;
                }
                break Label_0042;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            try {
                final int n = Build$VERSION.SDK_INT;
                final int n2 = 21;
                if (n >= n2) {
                    return;
                }
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        if (this.l != null) {
            final Window window = this.l.a().getWindow();
            final View child = ((ViewGroup)window.getDecorView().findViewById(16908290)).getChildAt(0);
            if (child.getVisibility() == 0) {
                final WindowManager$LayoutParams attributes = window.getAttributes();
                try {
                    attributes.flags |= 0x400;
                    attributes.screenBrightness = 0.1f;
                    if (Build$VERSION.SDK_INT >= 11) {
                        window.getDecorView().setSystemUiVisibility(0x2 | window.getDecorView().getSystemUiVisibility());
                    }
                    child.setVisibility(4);
                    window.setAttributes(attributes);
                }
                catch (IllegalArgumentException ex3) {
                    throw ex3;
                }
            }
        }
    }
    
    static void b(final VoiceService voiceService) {
        voiceService.J();
    }
    
    static void b(final VoiceService voiceService, final boolean b) {
        voiceService.b(b);
    }
    
    private void b(final Voip$CallInfo p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: invokestatic    com/whatsapp/App.j:()I
        //     7: istore_3       
        //     8: iload_3        
        //     9: ifne            27
        //    12: aload_0        
        //    13: aload_0        
        //    14: ldc_w           2131231924
        //    17: invokevirtual   com/whatsapp/VoiceService.getString:(I)Ljava/lang/String;
        //    20: invokespecial   com/whatsapp/VoiceService.a:(Ljava/lang/String;)V
        //    23: iload_2        
        //    24: ifeq            58
        //    27: iload_3        
        //    28: iconst_1       
        //    29: if_icmpne       47
        //    32: aload_0        
        //    33: aload_0        
        //    34: ldc_w           2131231923
        //    37: invokevirtual   com/whatsapp/VoiceService.getString:(I)Ljava/lang/String;
        //    40: invokespecial   com/whatsapp/VoiceService.a:(Ljava/lang/String;)V
        //    43: iload_2        
        //    44: ifeq            58
        //    47: aload_0        
        //    48: aload_0        
        //    49: ldc_w           2131231922
        //    52: invokevirtual   com/whatsapp/VoiceService.getString:(I)Ljava/lang/String;
        //    55: invokespecial   com/whatsapp/VoiceService.a:(Ljava/lang/String;)V
        //    58: return         
        //    59: astore          5
        //    61: aload           5
        //    63: athrow         
        //    64: astore          6
        //    66: aload           6
        //    68: athrow         
        //    69: astore          4
        //    71: aload           4
        //    73: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  12     23     59     69     Ljava/lang/IllegalArgumentException;
        //  32     43     69     74     Ljava/lang/IllegalArgumentException;
        //  47     58     69     74     Ljava/lang/IllegalArgumentException;
        //  61     64     64     69     Ljava/lang/IllegalArgumentException;
        //  66     69     69     74     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0047:
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
    
    private void b(final Voip$CallState p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //     3: sipush          139
        //     6: aaload         
        //     7: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    10: invokestatic    com/whatsapp/aol.a:()V
        //    13: aload_0        
        //    14: getfield        com/whatsapp/VoiceService.I:Z
        //    17: istore_3       
        //    18: iload_3        
        //    19: ifne            26
        //    22: return         
        //    23: astore_2       
        //    24: aload_2        
        //    25: athrow         
        //    26: invokestatic    java/lang/System.currentTimeMillis:()J
        //    29: lstore          4
        //    31: aload_0        
        //    32: getfield        com/whatsapp/VoiceService.n:Landroid/media/SoundPool;
        //    35: ifnull          77
        //    38: getstatic       com/whatsapp/Voip$CallState.NONE:Lcom/whatsapp/Voip$CallState;
        //    41: astore          16
        //    43: aload_1        
        //    44: aload           16
        //    46: if_acmpeq       77
        //    49: getstatic       com/whatsapp/Voip$CallState.RECEIVED_CALL:Lcom/whatsapp/Voip$CallState;
        //    52: astore          17
        //    54: aload_1        
        //    55: aload           17
        //    57: if_acmpeq       77
        //    60: aload_0        
        //    61: getfield        com/whatsapp/VoiceService.n:Landroid/media/SoundPool;
        //    64: aload_0        
        //    65: getfield        com/whatsapp/VoiceService.v:I
        //    68: fconst_1       
        //    69: fconst_1       
        //    70: iconst_0       
        //    71: iconst_0       
        //    72: fconst_1       
        //    73: invokevirtual   android/media/SoundPool.play:(IFFIIF)I
        //    76: pop            
        //    77: aload_0        
        //    78: iconst_0       
        //    79: putfield        com/whatsapp/VoiceService.I:Z
        //    82: aload_0        
        //    83: iconst_0       
        //    84: putfield        com/whatsapp/VoiceService.j:Z
        //    87: aload_0        
        //    88: iconst_0       
        //    89: putfield        com/whatsapp/VoiceService.m:Z
        //    92: aload_0        
        //    93: iconst_0       
        //    94: putfield        com/whatsapp/VoiceService.k:Z
        //    97: aload_0        
        //    98: iconst_0       
        //    99: putfield        com/whatsapp/VoiceService.L:Z
        //   102: aload_0        
        //   103: iconst_0       
        //   104: putfield        com/whatsapp/VoiceService.b:Z
        //   107: aload_0        
        //   108: iconst_0       
        //   109: putfield        com/whatsapp/VoiceService.B:Z
        //   112: aload_0        
        //   113: aconst_null    
        //   114: putfield        com/whatsapp/VoiceService.t:Ljava/lang/Boolean;
        //   117: aload_0        
        //   118: aconst_null    
        //   119: putfield        com/whatsapp/VoiceService.q:Lcom/whatsapp/fieldstats/Events$Call;
        //   122: aload_0        
        //   123: aconst_null    
        //   124: putfield        com/whatsapp/VoiceService.U:[Lcom/whatsapp/Voip$RecordingInfo;
        //   127: aload_0        
        //   128: aconst_null    
        //   129: putfield        com/whatsapp/VoiceService.z:Ljava/lang/Integer;
        //   132: aload_0        
        //   133: aconst_null    
        //   134: putfield        com/whatsapp/VoiceService.Q:Ljava/lang/Integer;
        //   137: aload_0        
        //   138: aconst_null    
        //   139: putfield        com/whatsapp/VoiceService.F:Landroid/net/Uri;
        //   142: aload_0        
        //   143: aconst_null    
        //   144: putfield        com/whatsapp/VoiceService.g:Lcom/whatsapp/fieldstats/w;
        //   147: aload_0        
        //   148: aconst_null    
        //   149: putfield        com/whatsapp/VoiceService.O:Ljava/lang/String;
        //   152: aload_0        
        //   153: aconst_null    
        //   154: putfield        com/whatsapp/VoiceService.y:Ljava/lang/String;
        //   157: aload_0        
        //   158: iconst_0       
        //   159: putfield        com/whatsapp/VoiceService.S:Z
        //   162: aload_0        
        //   163: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   166: sipush          137
        //   169: aaload         
        //   170: invokevirtual   com/whatsapp/VoiceService.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   173: checkcast       Landroid/telephony/TelephonyManager;
        //   176: aload_0        
        //   177: getfield        com/whatsapp/VoiceService.d:Landroid/telephony/PhoneStateListener;
        //   180: iconst_0       
        //   181: invokevirtual   android/telephony/TelephonyManager.listen:(Landroid/telephony/PhoneStateListener;I)V
        //   184: aload_0        
        //   185: aload_0        
        //   186: getfield        com/whatsapp/VoiceService.f:Landroid/content/BroadcastReceiver;
        //   189: invokevirtual   com/whatsapp/VoiceService.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
        //   192: aload_0        
        //   193: aload_0        
        //   194: getfield        com/whatsapp/VoiceService.V:Landroid/content/BroadcastReceiver;
        //   197: invokevirtual   com/whatsapp/VoiceService.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
        //   200: aload_0        
        //   201: aload_0        
        //   202: getfield        com/whatsapp/VoiceService.H:Landroid/content/BroadcastReceiver;
        //   205: invokevirtual   com/whatsapp/VoiceService.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
        //   208: aload_0        
        //   209: aload_0        
        //   210: getfield        com/whatsapp/VoiceService.P:Landroid/content/BroadcastReceiver;
        //   213: invokevirtual   com/whatsapp/VoiceService.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
        //   216: aload_0        
        //   217: getfield        com/whatsapp/VoiceService.x:Lcom/whatsapp/util/k;
        //   220: aconst_null    
        //   221: invokevirtual   com/whatsapp/util/k.a:(Lcom/whatsapp/util/b4;)V
        //   224: aload_0        
        //   225: invokespecial   com/whatsapp/VoiceService.J:()V
        //   228: aload_0        
        //   229: invokespecial   com/whatsapp/VoiceService.q:()V
        //   232: aload_0        
        //   233: invokespecial   com/whatsapp/VoiceService.j:()V
        //   236: aload_0        
        //   237: invokevirtual   com/whatsapp/VoiceService.f:()V
        //   240: aload_0        
        //   241: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   244: sipush          140
        //   247: aaload         
        //   248: invokevirtual   com/whatsapp/VoiceService.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   251: checkcast       Landroid/media/AudioManager;
        //   254: astore          9
        //   256: aload           9
        //   258: iconst_0       
        //   259: invokevirtual   android/media/AudioManager.setSpeakerphoneOn:(Z)V
        //   262: aload           9
        //   264: iconst_0       
        //   265: invokevirtual   android/media/AudioManager.setMicrophoneMute:(Z)V
        //   268: aload_0        
        //   269: getfield        com/whatsapp/VoiceService.E:Z
        //   272: ifeq            280
        //   275: aload_0        
        //   276: iconst_0       
        //   277: invokespecial   com/whatsapp/VoiceService.a:(Z)V
        //   280: aload           9
        //   282: iconst_0       
        //   283: invokevirtual   android/media/AudioManager.setMode:(I)V
        //   286: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   289: bipush          8
        //   291: if_icmplt       306
        //   294: aload           9
        //   296: getstatic       com/whatsapp/VoiceService.K:Ljava/lang/Object;
        //   299: checkcast       Landroid/media/AudioManager$OnAudioFocusChangeListener;
        //   302: invokevirtual   android/media/AudioManager.abandonAudioFocus:(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I
        //   305: pop            
        //   306: aload_0        
        //   307: getfield        com/whatsapp/VoiceService.i:Landroid/os/Handler;
        //   310: aconst_null    
        //   311: invokevirtual   android/os/Handler.removeCallbacksAndMessages:(Ljava/lang/Object;)V
        //   314: aload_0        
        //   315: getfield        com/whatsapp/VoiceService.A:Landroid/os/Handler;
        //   318: aconst_null    
        //   319: invokevirtual   android/os/Handler.removeCallbacksAndMessages:(Ljava/lang/Object;)V
        //   322: aload_0        
        //   323: getfield        com/whatsapp/VoiceService.e:Landroid/os/Handler;
        //   326: aconst_null    
        //   327: invokevirtual   android/os/Handler.removeCallbacksAndMessages:(Ljava/lang/Object;)V
        //   330: aload_0        
        //   331: iconst_1       
        //   332: invokevirtual   com/whatsapp/VoiceService.stopForeground:(Z)V
        //   335: aload_0        
        //   336: invokespecial   com/whatsapp/VoiceService.G:()V
        //   339: invokestatic    java/lang/System.currentTimeMillis:()J
        //   342: lload           4
        //   344: lsub           
        //   345: lstore          13
        //   347: new             Ljava/lang/StringBuilder;
        //   350: dup            
        //   351: invokespecial   java/lang/StringBuilder.<init>:()V
        //   354: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   357: sipush          138
        //   360: aaload         
        //   361: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   364: lload           13
        //   366: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   369: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   372: sipush          141
        //   375: aaload         
        //   376: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   379: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   382: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   385: return         
        //   386: astore          6
        //   388: aload           6
        //   390: athrow         
        //   391: astore          7
        //   393: aload           7
        //   395: athrow         
        //   396: astore          8
        //   398: aload           8
        //   400: athrow         
        //   401: astore          10
        //   403: aload           10
        //   405: athrow         
        //   406: astore          11
        //   408: aload           11
        //   410: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   413: goto            286
        //   416: astore          12
        //   418: aload           12
        //   420: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      18     23     26     Ljava/lang/Exception;
        //  31     43     386    391    Ljava/lang/Exception;
        //  49     54     391    396    Ljava/lang/Exception;
        //  60     77     396    401    Ljava/lang/Exception;
        //  256    280    401    406    Ljava/lang/Exception;
        //  280    286    406    416    Ljava/lang/Exception;
        //  286    306    416    421    Ljava/lang/Exception;
        //  388    391    391    396    Ljava/lang/Exception;
        //  393    396    396    401    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 215, Size: 215
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
    
    private void b(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //     7: bipush          84
        //     9: aaload         
        //    10: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    13: new             Ljava/lang/StringBuilder;
        //    16: dup            
        //    17: invokespecial   java/lang/StringBuilder.<init>:()V
        //    20: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    23: bipush          91
        //    25: aaload         
        //    26: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    29: getstatic       android/os/Build.MANUFACTURER:Ljava/lang/String;
        //    32: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    35: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    38: bipush          93
        //    40: aaload         
        //    41: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    44: getstatic       android/os/Build.MODEL:Ljava/lang/String;
        //    47: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    50: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    53: bipush          97
        //    55: aaload         
        //    56: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    59: getstatic       android/os/Build.DEVICE:Ljava/lang/String;
        //    62: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    65: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    68: bipush          94
        //    70: aaload         
        //    71: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    74: getstatic       android/os/Build$VERSION.RELEASE:Ljava/lang/String;
        //    77: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    80: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    83: bipush          98
        //    85: aaload         
        //    86: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    89: getstatic       android/os/Build.DISPLAY:Ljava/lang/String;
        //    92: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    95: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    98: bipush          86
        //   100: aaload         
        //   101: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   104: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   107: bipush          85
        //   109: aaload         
        //   110: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   113: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   116: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   119: invokestatic    com/whatsapp/aol.a:()V
        //   122: aload_0        
        //   123: getfield        com/whatsapp/VoiceService.I:Z
        //   126: istore          4
        //   128: iload           4
        //   130: ifeq            137
        //   133: return         
        //   134: astore_3       
        //   135: aload_3        
        //   136: athrow         
        //   137: invokestatic    java/lang/System.currentTimeMillis:()J
        //   140: lstore          5
        //   142: aload_0        
        //   143: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   146: bipush          83
        //   148: aaload         
        //   149: invokevirtual   com/whatsapp/VoiceService.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   152: checkcast       Landroid/media/AudioManager;
        //   155: astore          7
        //   157: aload_0        
        //   158: iconst_0       
        //   159: putfield        com/whatsapp/VoiceService.j:Z
        //   162: aload_0        
        //   163: iconst_0       
        //   164: putfield        com/whatsapp/VoiceService.m:Z
        //   167: aload_0        
        //   168: iconst_0       
        //   169: putfield        com/whatsapp/VoiceService.k:Z
        //   172: aload_0        
        //   173: iconst_0       
        //   174: putfield        com/whatsapp/VoiceService.L:Z
        //   177: aload_0        
        //   178: iconst_0       
        //   179: putfield        com/whatsapp/VoiceService.b:Z
        //   182: aload_0        
        //   183: iconst_0       
        //   184: putfield        com/whatsapp/VoiceService.B:Z
        //   187: aload_0        
        //   188: invokestatic    com/whatsapp/Voip$DebugTapType.values:()[Lcom/whatsapp/Voip$DebugTapType;
        //   191: arraylength    
        //   192: anewarray       Lcom/whatsapp/Voip$RecordingInfo;
        //   195: putfield        com/whatsapp/VoiceService.U:[Lcom/whatsapp/Voip$RecordingInfo;
        //   198: aload_0        
        //   199: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   202: bipush          89
        //   204: aaload         
        //   205: invokevirtual   com/whatsapp/VoiceService.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   208: checkcast       Landroid/telephony/TelephonyManager;
        //   211: astore          8
        //   213: aload           8
        //   215: invokevirtual   android/telephony/TelephonyManager.getCallState:()I
        //   218: istore          10
        //   220: iload           10
        //   222: ifeq            657
        //   225: iconst_1       
        //   226: istore          11
        //   228: aload_0        
        //   229: iload           11
        //   231: putfield        com/whatsapp/VoiceService.c:Z
        //   234: aload           8
        //   236: aload_0        
        //   237: getfield        com/whatsapp/VoiceService.d:Landroid/telephony/PhoneStateListener;
        //   240: bipush          32
        //   242: invokevirtual   android/telephony/TelephonyManager.listen:(Landroid/telephony/PhoneStateListener;I)V
        //   245: aload_0        
        //   246: aload_0        
        //   247: getfield        com/whatsapp/VoiceService.f:Landroid/content/BroadcastReceiver;
        //   250: new             Landroid/content/IntentFilter;
        //   253: dup            
        //   254: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   257: bipush          95
        //   259: aaload         
        //   260: invokespecial   android/content/IntentFilter.<init>:(Ljava/lang/String;)V
        //   263: invokevirtual   com/whatsapp/VoiceService.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
        //   266: pop            
        //   267: aload_0        
        //   268: aload_0        
        //   269: getfield        com/whatsapp/VoiceService.V:Landroid/content/BroadcastReceiver;
        //   272: new             Landroid/content/IntentFilter;
        //   275: dup            
        //   276: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   279: bipush          99
        //   281: aaload         
        //   282: invokespecial   android/content/IntentFilter.<init>:(Ljava/lang/String;)V
        //   285: invokevirtual   com/whatsapp/VoiceService.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
        //   288: pop            
        //   289: aload_0        
        //   290: aload_0        
        //   291: getfield        com/whatsapp/VoiceService.H:Landroid/content/BroadcastReceiver;
        //   294: new             Landroid/content/IntentFilter;
        //   297: dup            
        //   298: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   301: bipush          87
        //   303: aaload         
        //   304: invokespecial   android/content/IntentFilter.<init>:(Ljava/lang/String;)V
        //   307: invokevirtual   com/whatsapp/VoiceService.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
        //   310: pop            
        //   311: aload_0        
        //   312: aload_0        
        //   313: getfield        com/whatsapp/VoiceService.P:Landroid/content/BroadcastReceiver;
        //   316: new             Landroid/content/IntentFilter;
        //   319: dup            
        //   320: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   323: bipush          100
        //   325: aaload         
        //   326: invokespecial   android/content/IntentFilter.<init>:(Ljava/lang/String;)V
        //   329: invokevirtual   com/whatsapp/VoiceService.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
        //   332: astore          15
        //   334: aload           15
        //   336: ifnull          368
        //   339: aload           15
        //   341: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   344: bipush          96
        //   346: aaload         
        //   347: iconst_m1      
        //   348: invokevirtual   android/content/Intent.getIntExtra:(Ljava/lang/String;I)I
        //   351: istore          32
        //   353: iconst_1       
        //   354: iload           32
        //   356: if_icmpne       668
        //   359: iconst_1       
        //   360: istore          33
        //   362: aload_0        
        //   363: iload           33
        //   365: putfield        com/whatsapp/VoiceService.E:Z
        //   368: aload_0        
        //   369: invokespecial   com/whatsapp/VoiceService.r:()V
        //   372: aload_0        
        //   373: iconst_0       
        //   374: putfield        com/whatsapp/VoiceService.u:Z
        //   377: aload_0        
        //   378: invokespecial   com/whatsapp/VoiceService.u:()V
        //   381: aload           7
        //   383: iconst_0       
        //   384: invokevirtual   android/media/AudioManager.setMicrophoneMute:(Z)V
        //   387: iload_1        
        //   388: ifne            684
        //   391: aload           7
        //   393: invokevirtual   android/media/AudioManager.isWiredHeadsetOn:()Z
        //   396: istore          30
        //   398: iload           30
        //   400: ifne            684
        //   403: iconst_1       
        //   404: istore          18
        //   406: aload           7
        //   408: iload           18
        //   410: invokevirtual   android/media/AudioManager.setSpeakerphoneOn:(Z)V
        //   413: aload_0        
        //   414: invokevirtual   com/whatsapp/VoiceService.t:()Z
        //   417: ifeq            425
        //   420: aload_0        
        //   421: iconst_1       
        //   422: invokespecial   com/whatsapp/VoiceService.a:(Z)V
        //   425: aload_0        
        //   426: invokespecial   com/whatsapp/VoiceService.c:()V
        //   429: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   432: bipush          8
        //   434: if_icmplt       479
        //   437: aload           7
        //   439: getstatic       com/whatsapp/VoiceService.K:Ljava/lang/Object;
        //   442: checkcast       Landroid/media/AudioManager$OnAudioFocusChangeListener;
        //   445: iconst_0       
        //   446: iconst_2       
        //   447: invokevirtual   android/media/AudioManager.requestAudioFocus:(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I
        //   450: istore          29
        //   452: new             Ljava/lang/StringBuilder;
        //   455: dup            
        //   456: invokespecial   java/lang/StringBuilder.<init>:()V
        //   459: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   462: bipush          88
        //   464: aaload         
        //   465: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   468: iload           29
        //   470: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   473: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   476: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   479: iload_1        
        //   480: ifne            496
        //   483: aload_0        
        //   484: invokespecial   com/whatsapp/VoiceService.L:()V
        //   487: aload_0        
        //   488: aconst_null    
        //   489: putfield        com/whatsapp/VoiceService.N:Ljava/lang/Double;
        //   492: iload_2        
        //   493: ifeq            534
        //   496: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   499: istore          22
        //   501: iload           22
        //   503: bipush          11
        //   505: if_icmplt       518
        //   508: aload           7
        //   510: iconst_3       
        //   511: invokevirtual   android/media/AudioManager.setMode:(I)V
        //   514: iload_2        
        //   515: ifeq            524
        //   518: aload           7
        //   520: iconst_2       
        //   521: invokevirtual   android/media/AudioManager.setMode:(I)V
        //   524: aload_0        
        //   525: aconst_null    
        //   526: putfield        com/whatsapp/VoiceService.X:Ljava/lang/Double;
        //   529: aload_0        
        //   530: aconst_null    
        //   531: putfield        com/whatsapp/VoiceService.g:Lcom/whatsapp/fieldstats/w;
        //   534: aload_0        
        //   535: getfield        com/whatsapp/VoiceService.i:Landroid/os/Handler;
        //   538: iconst_0       
        //   539: ldc2_w          1000
        //   542: invokevirtual   android/os/Handler.sendEmptyMessageDelayed:(IJ)Z
        //   545: pop            
        //   546: aload_0        
        //   547: getfield        com/whatsapp/VoiceService.n:Landroid/media/SoundPool;
        //   550: ifnull          560
        //   553: aload_0        
        //   554: getfield        com/whatsapp/VoiceService.n:Landroid/media/SoundPool;
        //   557: invokevirtual   android/media/SoundPool.release:()V
        //   560: aload_0        
        //   561: new             Landroid/media/SoundPool;
        //   564: dup            
        //   565: iconst_1       
        //   566: iconst_0       
        //   567: iconst_0       
        //   568: invokespecial   android/media/SoundPool.<init>:(III)V
        //   571: putfield        com/whatsapp/VoiceService.n:Landroid/media/SoundPool;
        //   574: aload_0        
        //   575: aload_0        
        //   576: getfield        com/whatsapp/VoiceService.n:Landroid/media/SoundPool;
        //   579: aload_0        
        //   580: invokevirtual   com/whatsapp/VoiceService.getApplicationContext:()Landroid/content/Context;
        //   583: ldc_w           2131165185
        //   586: iconst_1       
        //   587: invokevirtual   android/media/SoundPool.load:(Landroid/content/Context;II)I
        //   590: putfield        com/whatsapp/VoiceService.v:I
        //   593: aload_0        
        //   594: getfield        com/whatsapp/VoiceService.e:Landroid/os/Handler;
        //   597: iconst_3       
        //   598: invokevirtual   android/os/Handler.sendEmptyMessage:(I)Z
        //   601: pop            
        //   602: aload_0        
        //   603: iconst_1       
        //   604: putfield        com/whatsapp/VoiceService.I:Z
        //   607: invokestatic    java/lang/System.currentTimeMillis:()J
        //   610: lload           5
        //   612: lsub           
        //   613: lstore          26
        //   615: new             Ljava/lang/StringBuilder;
        //   618: dup            
        //   619: invokespecial   java/lang/StringBuilder.<init>:()V
        //   622: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   625: bipush          92
        //   627: aaload         
        //   628: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   631: lload           26
        //   633: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   636: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   639: bipush          90
        //   641: aaload         
        //   642: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   645: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   648: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   651: return         
        //   652: astore          9
        //   654: aload           9
        //   656: athrow         
        //   657: iconst_0       
        //   658: istore          11
        //   660: goto            228
        //   663: astore          31
        //   665: aload           31
        //   667: athrow         
        //   668: iconst_0       
        //   669: istore          33
        //   671: goto            362
        //   674: astore          16
        //   676: aload           16
        //   678: athrow         
        //   679: astore          17
        //   681: aload           17
        //   683: athrow         
        //   684: iconst_0       
        //   685: istore          18
        //   687: goto            406
        //   690: astore          19
        //   692: aload           19
        //   694: athrow         
        //   695: astore          28
        //   697: aload           28
        //   699: athrow         
        //   700: astore          20
        //   702: aload           20
        //   704: athrow         
        //   705: astore          21
        //   707: aload           21
        //   709: athrow         
        //   710: astore          23
        //   712: aload           23
        //   714: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      128    134    137    Ljava/lang/IllegalArgumentException;
        //  213    220    652    657    Ljava/lang/IllegalArgumentException;
        //  339    353    663    668    Ljava/lang/IllegalArgumentException;
        //  368    387    674    679    Ljava/lang/IllegalArgumentException;
        //  391    398    679    684    Ljava/lang/IllegalArgumentException;
        //  406    425    690    695    Ljava/lang/IllegalArgumentException;
        //  483    492    695    700    Ljava/lang/IllegalArgumentException;
        //  496    501    700    705    Ljava/lang/IllegalArgumentException;
        //  508    514    705    710    Ljava/lang/IllegalArgumentException;
        //  518    524    705    710    Ljava/lang/IllegalArgumentException;
        //  534    560    710    715    Ljava/lang/IllegalArgumentException;
        //  676    679    679    684    Ljava/lang/IllegalArgumentException;
        //  697    700    700    705    Ljava/lang/IllegalArgumentException;
        //  702    705    705    710    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 346, Size: 346
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
    
    static px c(final VoiceService voiceService) {
        return voiceService.l;
    }
    
    private void c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: invokestatic    com/whatsapp/aol.a:()V
        //     7: aload_0        
        //     8: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    11: bipush          121
        //    13: aaload         
        //    14: invokevirtual   com/whatsapp/VoiceService.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    17: checkcast       Landroid/media/AudioManager;
        //    20: astore_2       
        //    21: aload_2        
        //    22: invokevirtual   android/media/AudioManager.isBluetoothScoOn:()Z
        //    25: istore          10
        //    27: iload           10
        //    29: ifeq            43
        //    32: aload_0        
        //    33: getstatic       com/whatsapp/asg.BLUETOOTH:Lcom/whatsapp/asg;
        //    36: putfield        com/whatsapp/VoiceService.Y:Lcom/whatsapp/asg;
        //    39: iload_1        
        //    40: ifeq            105
        //    43: aload_2        
        //    44: invokevirtual   android/media/AudioManager.isSpeakerphoneOn:()Z
        //    47: istore          11
        //    49: iload           11
        //    51: ifeq            76
        //    54: aload_0        
        //    55: getfield        com/whatsapp/VoiceService.u:Z
        //    58: istore          14
        //    60: iload           14
        //    62: ifne            76
        //    65: aload_0        
        //    66: getstatic       com/whatsapp/asg.SPEAKER:Lcom/whatsapp/asg;
        //    69: putfield        com/whatsapp/VoiceService.Y:Lcom/whatsapp/asg;
        //    72: iload_1        
        //    73: ifeq            105
        //    76: aload_2        
        //    77: invokevirtual   android/media/AudioManager.isWiredHeadsetOn:()Z
        //    80: istore          12
        //    82: iload           12
        //    84: ifeq            98
        //    87: aload_0        
        //    88: getstatic       com/whatsapp/asg.HEADSET:Lcom/whatsapp/asg;
        //    91: putfield        com/whatsapp/VoiceService.Y:Lcom/whatsapp/asg;
        //    94: iload_1        
        //    95: ifeq            105
        //    98: aload_0        
        //    99: getstatic       com/whatsapp/asg.EARPIECE:Lcom/whatsapp/asg;
        //   102: putfield        com/whatsapp/VoiceService.Y:Lcom/whatsapp/asg;
        //   105: aload_0        
        //   106: getfield        com/whatsapp/VoiceService.Y:Lcom/whatsapp/asg;
        //   109: invokestatic    com/whatsapp/asg.a:(Lcom/whatsapp/asg;)I
        //   112: invokestatic    com/whatsapp/Voip.notifyAudioRouteChange:(I)V
        //   115: aload_0        
        //   116: iconst_0       
        //   117: putfield        com/whatsapp/VoiceService.u:Z
        //   120: new             Ljava/lang/StringBuilder;
        //   123: dup            
        //   124: invokespecial   java/lang/StringBuilder.<init>:()V
        //   127: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   130: bipush          122
        //   132: aaload         
        //   133: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   136: aload_0        
        //   137: getfield        com/whatsapp/VoiceService.Y:Lcom/whatsapp/asg;
        //   140: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   143: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   146: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   149: aload_0        
        //   150: getfield        com/whatsapp/VoiceService.l:Lcom/whatsapp/px;
        //   153: ifnull          165
        //   156: aload_0        
        //   157: getfield        com/whatsapp/VoiceService.l:Lcom/whatsapp/px;
        //   160: invokeinterface com/whatsapp/px.b:()V
        //   165: aload_0        
        //   166: invokespecial   com/whatsapp/VoiceService.k:()V
        //   169: return         
        //   170: astore_3       
        //   171: aload_3        
        //   172: athrow         
        //   173: astore          4
        //   175: aload           4
        //   177: athrow         
        //   178: astore          5
        //   180: aload           5
        //   182: athrow         
        //   183: astore          6
        //   185: aload           6
        //   187: athrow         
        //   188: astore          7
        //   190: aload           7
        //   192: athrow         
        //   193: astore          8
        //   195: aload           8
        //   197: athrow         
        //   198: astore          9
        //   200: aload           9
        //   202: athrow         
        //   203: astore          13
        //   205: aload           13
        //   207: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  21     27     170    173    Ljava/lang/IllegalArgumentException;
        //  32     39     173    178    Ljava/lang/IllegalArgumentException;
        //  43     49     178    183    Ljava/lang/IllegalArgumentException;
        //  54     60     183    188    Ljava/lang/IllegalArgumentException;
        //  65     72     188    193    Ljava/lang/IllegalArgumentException;
        //  76     82     193    198    Ljava/lang/IllegalArgumentException;
        //  87     94     198    203    Ljava/lang/IllegalArgumentException;
        //  98     105    198    203    Ljava/lang/IllegalArgumentException;
        //  105    165    203    208    Ljava/lang/IllegalArgumentException;
        //  171    173    173    178    Ljava/lang/IllegalArgumentException;
        //  175    178    178    183    Ljava/lang/IllegalArgumentException;
        //  180    183    183    188    Ljava/lang/IllegalArgumentException;
        //  185    188    188    193    Ljava/lang/IllegalArgumentException;
        //  190    193    193    198    Ljava/lang/IllegalArgumentException;
        //  195    198    198    203    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 100, Size: 100
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
    
    static boolean c(final VoiceService voiceService, final boolean b) {
        return voiceService.B = b;
    }
    
    private static int d() {
        final boolean i = App.I;
        final int j = App.j();
        if (j == 0) {
            final int n = aw.NONE.getCode();
            if (!i) {
                return n;
            }
        }
        if (j == 1) {
            final int n = aw.WIFI.getCode();
            if (!i) {
                return n;
            }
        }
        return aw.CELLULAR.getCode();
    }
    
    static Handler d(final VoiceService voiceService) {
        return voiceService.i;
    }
    
    static boolean d(final VoiceService voiceService, final boolean b) {
        return voiceService.b = b;
    }
    
    static BluetoothHeadset e(final VoiceService voiceService) {
        return voiceService.a;
    }
    
    static boolean e(final VoiceService voiceService, final boolean l) {
        return voiceService.L = l;
    }
    
    static Double f(final VoiceService voiceService) {
        return voiceService.N;
    }
    
    static boolean f(final VoiceService voiceService, final boolean e) {
        return voiceService.E = e;
    }
    
    static w g(final VoiceService voiceService) {
        return voiceService.g;
    }
    
    private void g() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_1       
        //     2: new             Ljava/lang/StringBuilder;
        //     5: dup            
        //     6: invokespecial   java/lang/StringBuilder.<init>:()V
        //     9: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    12: bipush          60
        //    14: aaload         
        //    15: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    18: aload_0        
        //    19: getfield        com/whatsapp/VoiceService.c:Z
        //    22: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //    25: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    28: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    31: invokestatic    com/whatsapp/Voip.getCallInfo:()Lcom/whatsapp/Voip$CallInfo;
        //    34: astore_2       
        //    35: aload_2        
        //    36: ifnull          139
        //    39: aload_2        
        //    40: invokevirtual   com/whatsapp/Voip$CallInfo.getPeerId:()Ljava/lang/String;
        //    43: astore_3       
        //    44: aload_2        
        //    45: invokevirtual   com/whatsapp/Voip$CallInfo.getCallState:()Lcom/whatsapp/Voip$CallState;
        //    48: astore          7
        //    50: getstatic       com/whatsapp/Voip$CallState.CALLING:Lcom/whatsapp/Voip$CallState;
        //    53: astore          8
        //    55: aload           7
        //    57: aload           8
        //    59: if_acmpne       88
        //    62: aload_0        
        //    63: getfield        com/whatsapp/VoiceService.c:Z
        //    66: istore          14
        //    68: iload           14
        //    70: ifeq            88
        //    73: aload_0        
        //    74: aconst_null    
        //    75: invokespecial   com/whatsapp/VoiceService.a:(Ljava/lang/String;)V
        //    78: getstatic       com/whatsapp/App.I:Z
        //    81: istore          15
        //    83: iload           15
        //    85: ifeq            132
        //    88: aload_3        
        //    89: ifnull          132
        //    92: aload_3        
        //    93: iload_1        
        //    94: invokestatic    com/whatsapp/protocol/bi.a:(Ljava/lang/String;Z)Lcom/whatsapp/protocol/c6;
        //    97: astore          9
        //    99: aload           9
        //   101: getfield        com/whatsapp/protocol/c6.c:Ljava/lang/String;
        //   104: astore          11
        //   106: aload_2        
        //   107: invokevirtual   com/whatsapp/Voip$CallInfo.getCallId:()Ljava/lang/String;
        //   110: astore          12
        //   112: aload_0        
        //   113: getfield        com/whatsapp/VoiceService.c:Z
        //   116: istore          13
        //   118: iload           13
        //   120: ifne            160
        //   123: aload           11
        //   125: aload_3        
        //   126: aload           12
        //   128: iload_1        
        //   129: invokestatic    com/whatsapp/App.b:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   132: aload_0        
        //   133: getfield        com/whatsapp/VoiceService.c:Z
        //   136: invokestatic    com/whatsapp/Voip.setAudioStreamPause:(Z)V
        //   139: return         
        //   140: astore          4
        //   142: aload           4
        //   144: athrow         
        //   145: astore          5
        //   147: aload           5
        //   149: athrow         
        //   150: astore          6
        //   152: aload           6
        //   154: athrow         
        //   155: astore          10
        //   157: aload           10
        //   159: athrow         
        //   160: iconst_0       
        //   161: istore_1       
        //   162: goto            123
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  44     55     140    145    Ljava/lang/IllegalArgumentException;
        //  62     68     145    150    Ljava/lang/IllegalArgumentException;
        //  73     83     150    155    Ljava/lang/IllegalArgumentException;
        //  99     118    155    160    Ljava/lang/IllegalArgumentException;
        //  142    145    145    150    Ljava/lang/IllegalArgumentException;
        //  147    150    150    155    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 82, Size: 82
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
    
    static boolean g(final VoiceService voiceService, final boolean c) {
        return voiceService.c = c;
    }
    
    private String h() {
        final String peerJid = Voip.getPeerJid();
        a_9 e;
        while (true) {
            Label_0025: {
                if (peerJid != null) {
                    break Label_0025;
                }
                try {
                    Log.w(VoiceService.Z[134]);
                    return null;
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
            e = App.S.e(peerJid);
            if (e == null) {
                continue;
            }
            break;
        }
        try {
            return e.a((Context)this);
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
    }
    
    static void h(final VoiceService voiceService) {
        voiceService.c();
    }
    
    static void h(final VoiceService voiceService, final boolean b) {
        voiceService.a(b);
    }
    
    static Voip$RecordingInfo[] i(final VoiceService voiceService) {
        return voiceService.U;
    }
    
    static Ringtone j(final VoiceService voiceService) {
        return voiceService.W;
    }
    
    private void j() {
        try {
            final PowerManager powerManager = (PowerManager)this.getSystemService(VoiceService.Z[152]);
            if (powerManager.isScreenOn()) {
                return;
            }
            final PowerManager$WakeLock wakeLock = powerManager.newWakeLock(268435466, VoiceService.Z[151]);
            if (wakeLock == null) {
                return;
            }
            try {
                wakeLock.acquire();
                wakeLock.release();
            }
            catch (Exception ex) {
                throw ex;
            }
        }
        catch (Exception ex2) {
            Log.b(ex2);
        }
    }
    
    private void k() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/whatsapp/Voip.getCallInfo:()Lcom/whatsapp/Voip$CallInfo;
        //     3: astore_1       
        //     4: aload_1        
        //     5: ifnonnull       9
        //     8: return         
        //     9: aload_1        
        //    10: invokevirtual   com/whatsapp/Voip$CallInfo.isCaller:()Z
        //    13: istore          4
        //    15: iload           4
        //    17: ifne            38
        //    20: aload_1        
        //    21: invokevirtual   com/whatsapp/Voip$CallInfo.getCallState:()Lcom/whatsapp/Voip$CallState;
        //    24: astore          11
        //    26: getstatic       com/whatsapp/Voip$CallState.RECEIVED_CALL:Lcom/whatsapp/Voip$CallState;
        //    29: astore          12
        //    31: aload           11
        //    33: aload           12
        //    35: if_acmpeq       127
        //    38: iconst_1       
        //    39: istore          5
        //    41: aload_0        
        //    42: getfield        com/whatsapp/VoiceService.Y:Lcom/whatsapp/asg;
        //    45: astore          9
        //    47: getstatic       com/whatsapp/asg.EARPIECE:Lcom/whatsapp/asg;
        //    50: astore          10
        //    52: aload           9
        //    54: aload           10
        //    56: if_acmpne       94
        //    59: iload           5
        //    61: ifeq            94
        //    64: aload_0        
        //    65: invokespecial   com/whatsapp/VoiceService.N:()V
        //    68: aload_0        
        //    69: getfield        com/whatsapp/VoiceService.x:Lcom/whatsapp/util/k;
        //    72: aload_0        
        //    73: getfield        com/whatsapp/VoiceService.p:Lcom/whatsapp/util/b4;
        //    76: invokevirtual   com/whatsapp/util/k.a:(Lcom/whatsapp/util/b4;)V
        //    79: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    82: bipush          104
        //    84: aaload         
        //    85: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    88: getstatic       com/whatsapp/App.I:Z
        //    91: ifeq            8
        //    94: aload_0        
        //    95: invokespecial   com/whatsapp/VoiceService.F:()V
        //    98: aload_0        
        //    99: getfield        com/whatsapp/VoiceService.x:Lcom/whatsapp/util/k;
        //   102: aconst_null    
        //   103: invokevirtual   com/whatsapp/util/k.a:(Lcom/whatsapp/util/b4;)V
        //   106: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   109: bipush          105
        //   111: aaload         
        //   112: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   115: return         
        //   116: astore          8
        //   118: aload           8
        //   120: athrow         
        //   121: astore_2       
        //   122: aload_2        
        //   123: athrow         
        //   124: astore_3       
        //   125: aload_3        
        //   126: athrow         
        //   127: iconst_0       
        //   128: istore          5
        //   130: goto            41
        //   133: astore          6
        //   135: aload           6
        //   137: athrow         
        //   138: astore          7
        //   140: aload           7
        //   142: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  9      15     121    124    Ljava/lang/IllegalArgumentException;
        //  20     31     124    127    Ljava/lang/IllegalArgumentException;
        //  41     52     133    143    Ljava/lang/IllegalArgumentException;
        //  64     94     116    121    Ljava/lang/IllegalArgumentException;
        //  94     115    116    121    Ljava/lang/IllegalArgumentException;
        //  122    124    124    127    Ljava/lang/IllegalArgumentException;
        //  135    138    138    143    Ljava/lang/IllegalArgumentException;
        //  140    143    116    121    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 72, Size: 72
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
    
    static void k(final VoiceService voiceService) {
        voiceService.g();
    }
    
    private int l() {
        try {
            if (Build$VERSION.SDK_INT >= 21) {
                return 32;
            }
        }
        catch (NoSuchFieldException ex) {
            throw ex;
        }
        try {
            return PowerManager.class.getDeclaredField(VoiceService.Z[192]).getInt(null);
        }
        catch (NoSuchFieldException ex2) {
            Log.w(VoiceService.Z[193]);
        }
        catch (IllegalAccessException ex3) {
            Log.w(VoiceService.Z[191]);
            goto Label_0050;
        }
    }
    
    static Integer l(final VoiceService voiceService) {
        return voiceService.Q;
    }
    
    static Handler m(final VoiceService voiceService) {
        return voiceService.e;
    }
    
    private void m() {
        aol.a();
        try {
            if (this.o != null) {
                Log.i(VoiceService.Z[142]);
                this.o.release();
                this.o = null;
            }
        }
        catch (Exception ex) {
            Log.b(ex);
            this.o = null;
        }
    }
    
    private void n() {
        try {
            if (App.aB()) {
                VoiceService.C.execute(new aab(this));
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    static void n(final VoiceService voiceService) {
        voiceService.K();
    }
    
    static void o(final VoiceService voiceService) {
        voiceService.n();
    }
    
    static boolean p(final VoiceService voiceService) {
        return voiceService.B;
    }
    
    private void q() {
        this.F();
        this.m();
    }
    
    static void q(final VoiceService voiceService) {
        voiceService.G();
    }
    
    static Handler r(final VoiceService voiceService) {
        return voiceService.A;
    }
    
    private void r() {
        Voip.setNetworkMedium(d());
    }
    
    static Uri s(final VoiceService voiceService) {
        return voiceService.F;
    }
    
    static String t(final VoiceService voiceService) {
        return voiceService.O;
    }
    
    static String u(final VoiceService voiceService) {
        return voiceService.y;
    }
    
    private void u() {
        while (true) {
            try {
                aol.a();
                if (this.o != null) {
                    return;
                }
            }
            catch (Exception ex) {
                throw ex;
            }
            PowerManager powerManager;
            try {
                powerManager = (PowerManager)this.getSystemService(VoiceService.Z[103]);
                if (powerManager == null) {
                    return;
                }
                final VoiceService voiceService = this;
                final PowerManager powerManager2 = powerManager;
                final int n = 1;
                final String[] array = VoiceService.Z;
                final int n2 = 101;
                final String s = array[n2];
                final PowerManager$WakeLock powerManager$WakeLock = powerManager2.newWakeLock(n, s);
                voiceService.o = powerManager$WakeLock;
                final VoiceService voiceService2 = this;
                final PowerManager$WakeLock o = voiceService2.o;
                final PowerManager$WakeLock o2 = o;
                if (o2 == null) {
                    return;
                }
                try {
                    final VoiceService voiceService3 = this;
                    final PowerManager$WakeLock powerManager$WakeLock2 = voiceService3.o;
                    powerManager$WakeLock2.acquire();
                    final String[] array2 = VoiceService.Z;
                    final int n3 = 102;
                    final String s2 = array2[n3];
                    Log.i(s2);
                    return;
                }
                catch (Exception ex2) {
                    throw ex2;
                }
            }
            catch (Exception ex3) {
                Log.b(ex3);
                this.o = null;
                return;
            }
            try {
                final VoiceService voiceService = this;
                final PowerManager powerManager2 = powerManager;
                final int n = 1;
                final String[] array = VoiceService.Z;
                final int n2 = 101;
                final String s = array[n2];
                final PowerManager$WakeLock powerManager$WakeLock = powerManager2.newWakeLock(n, s);
                voiceService.o = powerManager$WakeLock;
                final VoiceService voiceService2 = this;
                final PowerManager$WakeLock o2;
                final PowerManager$WakeLock o = o2 = voiceService2.o;
                if (o2 != null) {
                    final VoiceService voiceService3 = this;
                    final PowerManager$WakeLock powerManager$WakeLock2 = voiceService3.o;
                    powerManager$WakeLock2.acquire();
                    final String[] array2 = VoiceService.Z;
                    final int n3 = 102;
                    final String s2 = array2[n3];
                    Log.i(s2);
                }
            }
            catch (Exception ex4) {
                throw ex4;
            }
        }
    }
    
    private Notification v() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: invokestatic    com/whatsapp/Voip.getCallInfo:()Lcom/whatsapp/Voip$CallInfo;
        //     7: astore_2       
        //     8: aload_2        
        //     9: ifnonnull       32
        //    12: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    15: bipush          124
        //    17: aaload         
        //    18: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    21: aconst_null    
        //    22: astore          31
        //    24: aload           31
        //    26: areturn        
        //    27: astore          65
        //    29: aload           65
        //    31: athrow         
        //    32: aload_2        
        //    33: invokevirtual   com/whatsapp/Voip$CallInfo.getCallActiveTime:()J
        //    36: lstore_3       
        //    37: new             Landroid/support/v4/app/NotificationCompat$Builder;
        //    40: dup            
        //    41: aload_0        
        //    42: invokespecial   android/support/v4/app/NotificationCompat$Builder.<init>:(Landroid/content/Context;)V
        //    45: astore          5
        //    47: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    50: aload_2        
        //    51: invokevirtual   com/whatsapp/Voip$CallInfo.getPeerId:()Ljava/lang/String;
        //    54: invokevirtual   com/whatsapp/wc.d:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //    57: astore          6
        //    59: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    62: bipush          11
        //    64: if_icmplt       238
        //    67: aload_0        
        //    68: invokevirtual   com/whatsapp/VoiceService.getResources:()Landroid/content/res/Resources;
        //    71: ldc_w           17104901
        //    74: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //    77: istore          48
        //    79: aload_0        
        //    80: invokevirtual   com/whatsapp/VoiceService.getResources:()Landroid/content/res/Resources;
        //    83: ldc_w           17104902
        //    86: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //    89: istore          49
        //    91: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    94: istore          51
        //    96: iload           51
        //    98: bipush          21
        //   100: if_icmplt       712
        //   103: iconst_m1      
        //   104: istore          52
        //   106: iload           48
        //   108: iload           49
        //   110: invokestatic    java/lang/Math.min:(II)I
        //   113: istore          53
        //   115: iload           53
        //   117: ifle            229
        //   120: aload           6
        //   122: ifnull          238
        //   125: aload           6
        //   127: iload           53
        //   129: iload           52
        //   131: i2f            
        //   132: invokevirtual   com/whatsapp/a_9.b:(IF)Landroid/graphics/Bitmap;
        //   135: astore          55
        //   137: iconst_0       
        //   138: istore          56
        //   140: aload           55
        //   142: ifnull          160
        //   145: aload           5
        //   147: aload           55
        //   149: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setLargeIcon:(Landroid/graphics/Bitmap;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   152: pop            
        //   153: iconst_1       
        //   154: istore          56
        //   156: iload_1        
        //   157: ifeq            803
        //   160: aload           6
        //   162: getfield        com/whatsapp/a_9.h:Z
        //   165: istore          59
        //   167: iload           59
        //   169: ifeq            803
        //   172: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   175: bipush          125
        //   177: aaload         
        //   178: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   181: new             Lcom/whatsapp/ut;
        //   184: dup            
        //   185: aload_0        
        //   186: aload           6
        //   188: iload           53
        //   190: iload           52
        //   192: invokespecial   com/whatsapp/ut.<init>:(Lcom/whatsapp/VoiceService;Lcom/whatsapp/a_9;II)V
        //   195: iconst_0       
        //   196: anewarray       Ljava/lang/Void;
        //   199: invokestatic    com/whatsapp/a8s.a:(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;
        //   202: pop            
        //   203: iload           56
        //   205: istore          60
        //   207: iload           60
        //   209: ifne            225
        //   212: aload           5
        //   214: aload           6
        //   216: iload           53
        //   218: invokevirtual   com/whatsapp/a_9.a:(I)Landroid/graphics/Bitmap;
        //   221: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setLargeIcon:(Landroid/graphics/Bitmap;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   224: pop            
        //   225: iload_1        
        //   226: ifeq            238
        //   229: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   232: bipush          126
        //   234: aaload         
        //   235: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   238: aload           5
        //   240: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   243: sipush          130
        //   246: aaload         
        //   247: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setCategory:(Ljava/lang/String;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   250: pop            
        //   251: aload           5
        //   253: iconst_1       
        //   254: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setPriority:(I)Landroid/support/v4/app/NotificationCompat$Builder;
        //   257: pop            
        //   258: aload           5
        //   260: ldc_w           2130838963
        //   263: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setSmallIcon:(I)Landroid/support/v4/app/NotificationCompat$Builder;
        //   266: pop            
        //   267: aload           5
        //   269: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   272: invokevirtual   com/whatsapp/App.getResources:()Landroid/content/res/Resources;
        //   275: ldc_w           2131624025
        //   278: invokevirtual   android/content/res/Resources.getColor:(I)I
        //   281: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setColor:(I)Landroid/support/v4/app/NotificationCompat$Builder;
        //   284: pop            
        //   285: aload           6
        //   287: ifnonnull       743
        //   290: aload_2        
        //   291: invokevirtual   com/whatsapp/Voip$CallInfo.getPeerId:()Ljava/lang/String;
        //   294: invokestatic    com/whatsapp/a_9.b:(Ljava/lang/String;)Ljava/lang/String;
        //   297: astore          12
        //   299: aload           12
        //   301: astore          13
        //   303: aload           5
        //   305: aload           13
        //   307: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setContentTitle:(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   310: pop            
        //   311: aload_2        
        //   312: invokevirtual   com/whatsapp/Voip$CallInfo.isCaller:()Z
        //   315: istore          15
        //   317: lload_3        
        //   318: lconst_0       
        //   319: lcmp           
        //   320: ifle            757
        //   323: ldc_w           2131231437
        //   326: istore          16
        //   328: aload           5
        //   330: aload_0        
        //   331: iload           16
        //   333: invokevirtual   com/whatsapp/VoiceService.getText:(I)Ljava/lang/CharSequence;
        //   336: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setContentText:(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   339: pop            
        //   340: lload_3        
        //   341: lconst_0       
        //   342: lcmp           
        //   343: ifle            364
        //   346: aload           5
        //   348: iconst_1       
        //   349: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setUsesChronometer:(Z)Landroid/support/v4/app/NotificationCompat$Builder;
        //   352: pop            
        //   353: aload           5
        //   355: lload_3        
        //   356: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setWhen:(J)Landroid/support/v4/app/NotificationCompat$Builder;
        //   359: pop            
        //   360: iload_1        
        //   361: ifeq            380
        //   364: aload           5
        //   366: iconst_0       
        //   367: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setUsesChronometer:(Z)Landroid/support/v4/app/NotificationCompat$Builder;
        //   370: pop            
        //   371: aload           5
        //   373: invokestatic    java/lang/System.currentTimeMillis:()J
        //   376: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setWhen:(J)Landroid/support/v4/app/NotificationCompat$Builder;
        //   379: pop            
        //   380: aload           5
        //   382: iconst_1       
        //   383: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setOngoing:(Z)Landroid/support/v4/app/NotificationCompat$Builder;
        //   386: pop            
        //   387: iload           15
        //   389: ifne            398
        //   392: lload_3        
        //   393: lconst_0       
        //   394: lcmp           
        //   395: ifle            457
        //   398: new             Landroid/content/Intent;
        //   401: dup            
        //   402: aload_0        
        //   403: ldc             Lcom/whatsapp/VoiceService;.class
        //   405: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   408: astore          24
        //   410: aload           24
        //   412: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   415: sipush          129
        //   418: aaload         
        //   419: invokevirtual   android/content/Intent.setAction:(Ljava/lang/String;)Landroid/content/Intent;
        //   422: pop            
        //   423: aload_0        
        //   424: iconst_0       
        //   425: aload           24
        //   427: ldc_w           268435456
        //   430: invokestatic    android/app/PendingIntent.getService:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //   433: astore          26
        //   435: aload           5
        //   437: ldc_w           2130838721
        //   440: aload_0        
        //   441: ldc_w           2131231234
        //   444: invokevirtual   com/whatsapp/VoiceService.getText:(I)Ljava/lang/CharSequence;
        //   447: aload           26
        //   449: invokevirtual   android/support/v4/app/NotificationCompat$Builder.addAction:(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   452: pop            
        //   453: iload_1        
        //   454: ifeq            567
        //   457: new             Landroid/content/Intent;
        //   460: dup            
        //   461: aload_0        
        //   462: ldc             Lcom/whatsapp/VoiceService;.class
        //   464: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   467: astore          38
        //   469: aload           38
        //   471: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   474: bipush          127
        //   476: aaload         
        //   477: invokevirtual   android/content/Intent.setAction:(Ljava/lang/String;)Landroid/content/Intent;
        //   480: pop            
        //   481: aload_0        
        //   482: iconst_0       
        //   483: aload           38
        //   485: ldc_w           268435456
        //   488: invokestatic    android/app/PendingIntent.getService:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //   491: astore          40
        //   493: aload           5
        //   495: ldc_w           2130838721
        //   498: aload_0        
        //   499: ldc_w           2131231594
        //   502: invokevirtual   com/whatsapp/VoiceService.getText:(I)Ljava/lang/CharSequence;
        //   505: aload           40
        //   507: invokevirtual   android/support/v4/app/NotificationCompat$Builder.addAction:(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   510: pop            
        //   511: new             Landroid/content/Intent;
        //   514: dup            
        //   515: aload_0        
        //   516: ldc_w           Lcom/whatsapp/VoipActivity;.class
        //   519: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   522: astore          42
        //   524: aload           42
        //   526: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   529: sipush          131
        //   532: aaload         
        //   533: invokevirtual   android/content/Intent.setAction:(Ljava/lang/String;)Landroid/content/Intent;
        //   536: pop            
        //   537: aload_0        
        //   538: iconst_0       
        //   539: aload           42
        //   541: ldc_w           268435456
        //   544: invokestatic    android/app/PendingIntent.getActivity:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //   547: astore          44
        //   549: aload           5
        //   551: ldc_w           2130838712
        //   554: aload_0        
        //   555: ldc_w           2131230819
        //   558: invokevirtual   com/whatsapp/VoiceService.getText:(I)Ljava/lang/CharSequence;
        //   561: aload           44
        //   563: invokevirtual   android/support/v4/app/NotificationCompat$Builder.addAction:(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   566: pop            
        //   567: new             Landroid/content/Intent;
        //   570: dup            
        //   571: aload_0        
        //   572: ldc_w           Lcom/whatsapp/VoipActivity;.class
        //   575: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   578: astore          28
        //   580: aload           28
        //   582: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   585: sipush          132
        //   588: aaload         
        //   589: aload_2        
        //   590: invokevirtual   com/whatsapp/Voip$CallInfo.getPeerId:()Ljava/lang/String;
        //   593: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   596: pop            
        //   597: aload           5
        //   599: aload_0        
        //   600: iconst_0       
        //   601: aload           28
        //   603: ldc_w           268435456
        //   606: invokestatic    android/app/PendingIntent.getActivity:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //   609: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setContentIntent:(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   612: pop            
        //   613: aload           5
        //   615: invokevirtual   android/support/v4/app/NotificationCompat$Builder.build:()Landroid/app/Notification;
        //   618: astore          31
        //   620: lload_3        
        //   621: lconst_0       
        //   622: lcmp           
        //   623: ifle            24
        //   626: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   629: istore          34
        //   631: iload           34
        //   633: bipush          16
        //   635: if_icmplt       24
        //   638: aload           31
        //   640: getfield        android/app/Notification.bigContentView:Landroid/widget/RemoteViews;
        //   643: astore          35
        //   645: aload           35
        //   647: ifnull          24
        //   650: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   653: sipush          133
        //   656: aaload         
        //   657: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //   660: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   663: bipush          123
        //   665: aaload         
        //   666: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //   669: aconst_null    
        //   670: invokevirtual   java/lang/reflect/Field.getInt:(Ljava/lang/Object;)I
        //   673: istore          37
        //   675: aload           31
        //   677: getfield        android/app/Notification.bigContentView:Landroid/widget/RemoteViews;
        //   680: iload           37
        //   682: bipush          8
        //   684: invokevirtual   android/widget/RemoteViews.setViewVisibility:(II)V
        //   687: aload           31
        //   689: areturn        
        //   690: astore          36
        //   692: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   695: sipush          128
        //   698: aaload         
        //   699: aload           36
        //   701: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   704: aload           31
        //   706: areturn        
        //   707: astore          50
        //   709: aload           50
        //   711: athrow         
        //   712: iconst_0       
        //   713: istore          52
        //   715: goto            106
        //   718: astore          57
        //   720: aload           57
        //   722: athrow         
        //   723: astore          58
        //   725: aload           58
        //   727: athrow         
        //   728: astore          61
        //   730: aload           61
        //   732: athrow         
        //   733: astore          54
        //   735: aload           54
        //   737: athrow         
        //   738: astore          7
        //   740: aload           7
        //   742: athrow         
        //   743: aload           6
        //   745: aload_0        
        //   746: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   749: invokestatic    com/whatsapp/util/cq.a:(Ljava/lang/CharSequence;)Ljava/lang/String;
        //   752: astore          13
        //   754: goto            303
        //   757: iload           15
        //   759: ifeq            770
        //   762: ldc_w           2131231438
        //   765: istore          16
        //   767: goto            328
        //   770: ldc_w           2131231238
        //   773: istore          16
        //   775: goto            328
        //   778: astore          17
        //   780: aload           17
        //   782: athrow         
        //   783: astore          18
        //   785: aload           18
        //   787: athrow         
        //   788: astore          22
        //   790: aload           22
        //   792: athrow         
        //   793: astore          32
        //   795: aload           32
        //   797: athrow         
        //   798: astore          33
        //   800: aload           33
        //   802: athrow         
        //   803: iload           56
        //   805: istore          60
        //   807: goto            207
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  12     21     27     32     Ljava/lang/Exception;
        //  91     96     707    712    Ljava/lang/Exception;
        //  160    167    718    723    Ljava/lang/Exception;
        //  172    203    723    728    Ljava/lang/Exception;
        //  212    225    728    733    Ljava/lang/Exception;
        //  229    238    733    738    Ljava/lang/Exception;
        //  238    285    738    743    Ljava/lang/Exception;
        //  290    299    738    743    Ljava/lang/Exception;
        //  328    340    778    783    Ljava/lang/Exception;
        //  346    360    778    783    Ljava/lang/Exception;
        //  364    380    783    788    Ljava/lang/Exception;
        //  380    387    788    793    Ljava/lang/Exception;
        //  626    631    793    798    Ljava/lang/Exception;
        //  638    645    798    803    Ljava/lang/Exception;
        //  650    687    690    707    Ljava/lang/Exception;
        //  720    723    723    728    Ljava/lang/Exception;
        //  780    783    783    788    Ljava/lang/Exception;
        //  795    798    798    803    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 390, Size: 390
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
    
    static boolean v(final VoiceService voiceService) {
        return voiceService.D;
    }
    
    static void w(final VoiceService voiceService) {
        voiceService.b();
    }
    
    private float x() {
        return this.getSharedPreferences(VoiceService.Z[199], 0).getFloat(VoiceService.Z[198], -1.0f);
    }
    
    static void x(final VoiceService voiceService) {
        voiceService.y();
    }
    
    static String y(final VoiceService voiceService) {
        return voiceService.h();
    }
    
    private void y() {
        boolean b = true;
        final Voip$CallInfo callInfo = Voip.getCallInfo();
        if (callInfo == null) {
            return;
        }
        while (true) {
            Voip.muteCall(this.m);
            final String peerId = callInfo.getPeerId();
            final c6 a = bi.a(peerId, b);
            while (true) {
                try {
                    final String c = a.c;
                    final String callId = callInfo.getCallId();
                    if (!this.m) {
                        App.a(c, peerId, callId, b);
                        return;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                b = false;
                continue;
            }
        }
    }
    
    static boolean z(final VoiceService voiceService) {
        return voiceService.I;
    }
    
    public boolean A() {
        return this.m;
    }
    
    public void B() {
        while (true) {
            final AudioManager audioManager = (AudioManager)this.getSystemService(VoiceService.Z[204]);
            while (true) {
                try {
                    if (this.Y != asg.SPEAKER) {
                        final boolean speakerphoneOn = true;
                        Log.i(VoiceService.Z[203] + speakerphoneOn);
                        audioManager.setSpeakerphoneOn(speakerphoneOn);
                        this.c();
                        return;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                final boolean speakerphoneOn = false;
                continue;
            }
        }
    }
    
    public void C() {
        Log.i(VoiceService.Z[155]);
        this.J.sendEmptyMessage(4);
    }
    
    public void D() {
        while (true) {
            try {
                Log.i(VoiceService.Z[195]);
                if (!App.a((ContextWrapper)this)) {
                    Log.w(VoiceService.Z[196]);
                    this.a(this.getString(2131230873));
                    return;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            try {
                this.f();
                this.a(Voip$CallState.ACCEPT_SENT);
                this.J.sendEmptyMessageDelayed(3, 100L);
                if (this.Y == asg.SPEAKER) {
                    this.B();
                }
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
    }
    
    public void M() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/VoiceService.m:Z
        //     4: istore_2       
        //     5: iload_2        
        //     6: ifne            79
        //     9: iconst_1       
        //    10: istore_3       
        //    11: aload_0        
        //    12: iload_3        
        //    13: putfield        com/whatsapp/VoiceService.m:Z
        //    16: new             Ljava/lang/StringBuilder;
        //    19: dup            
        //    20: invokespecial   java/lang/StringBuilder.<init>:()V
        //    23: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    26: sipush          197
        //    29: aaload         
        //    30: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    33: aload_0        
        //    34: getfield        com/whatsapp/VoiceService.m:Z
        //    37: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //    40: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    43: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    46: invokestatic    com/whatsapp/Voip.getCurrentCallState:()Lcom/whatsapp/Voip$CallState;
        //    49: getstatic       com/whatsapp/Voip$CallState.ACTIVE:Lcom/whatsapp/Voip$CallState;
        //    52: if_acmpne       59
        //    55: aload_0        
        //    56: invokespecial   com/whatsapp/VoiceService.y:()V
        //    59: aload_0        
        //    60: getfield        com/whatsapp/VoiceService.l:Lcom/whatsapp/px;
        //    63: ifnull          75
        //    66: aload_0        
        //    67: getfield        com/whatsapp/VoiceService.l:Lcom/whatsapp/px;
        //    70: invokeinterface com/whatsapp/px.b:()V
        //    75: return         
        //    76: astore_1       
        //    77: aload_1        
        //    78: athrow         
        //    79: iconst_0       
        //    80: istore_3       
        //    81: goto            11
        //    84: astore          4
        //    86: aload           4
        //    88: athrow         
        //    89: astore          5
        //    91: aload           5
        //    93: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      5      76     79     Ljava/lang/IllegalArgumentException;
        //  11     59     84     89     Ljava/lang/IllegalArgumentException;
        //  59     75     89     94     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 46, Size: 46
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
    
    public void a(final cr p0, final String p1, final long p2, final int p3, final String[] p4, final int[] p5, final byte[][] p6, final int[] p7, final byte[][] p8, final byte[][] p9, final byte[] p10, final byte[] p11, final VoipOptions p12, final boolean p13, final boolean p14, final String p15, final String p16) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          19
        //     5: aload_1        
        //     6: getfield        com/whatsapp/protocol/cr.a:Ljava/lang/String;
        //     9: astore          20
        //    11: aload_1        
        //    12: getfield        com/whatsapp/protocol/cr.c:Ljava/lang/String;
        //    15: astore          21
        //    17: new             Ljava/lang/StringBuilder;
        //    20: dup            
        //    21: invokespecial   java/lang/StringBuilder.<init>:()V
        //    24: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    27: bipush          118
        //    29: aaload         
        //    30: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    33: aload           20
        //    35: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    38: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    41: bipush          120
        //    43: aaload         
        //    44: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    47: aload_2        
        //    48: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    51: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    54: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    57: new             Lcom/whatsapp/protocol/bi;
        //    60: dup            
        //    61: new             Lcom/whatsapp/protocol/c6;
        //    64: dup            
        //    65: aload           20
        //    67: iconst_0       
        //    68: aload_2        
        //    69: invokestatic    com/whatsapp/Voip.a:(Ljava/lang/String;)Ljava/lang/String;
        //    72: invokespecial   com/whatsapp/protocol/c6.<init>:(Ljava/lang/String;ZLjava/lang/String;)V
        //    75: invokespecial   com/whatsapp/protocol/bi.<init>:(Lcom/whatsapp/protocol/c6;)V
        //    78: astore          22
        //    80: aload           22
        //    82: lload_3        
        //    83: putfield        com/whatsapp/protocol/bi.u:J
        //    86: aload           22
        //    88: bipush          8
        //    90: putfield        com/whatsapp/protocol/bi.I:B
        //    93: aload           22
        //    95: iconst_0       
        //    96: putfield        com/whatsapp/protocol/bi.D:I
        //    99: aload           22
        //   101: bipush          6
        //   103: putfield        com/whatsapp/protocol/bi.c:I
        //   106: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   109: aload           22
        //   111: invokevirtual   com/whatsapp/vy.g:(Lcom/whatsapp/protocol/bi;)V
        //   114: aload           20
        //   116: aload           21
        //   118: aload_2        
        //   119: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   122: aload           22
        //   124: invokestatic    com/whatsapp/atd.b:(Lcom/whatsapp/protocol/bi;)V
        //   127: iload           5
        //   129: sipush          1000
        //   132: imul           
        //   133: i2d            
        //   134: dstore          23
        //   136: iload           5
        //   138: ifne            151
        //   141: getstatic       com/whatsapp/fieldstats/w.ONLINE:Lcom/whatsapp/fieldstats/w;
        //   144: astore          27
        //   146: iload           19
        //   148: ifeq            176
        //   151: getstatic       com/whatsapp/App.aR:Z
        //   154: istore          26
        //   156: iload           26
        //   158: ifeq            171
        //   161: getstatic       com/whatsapp/fieldstats/w.GCM_PUSH:Lcom/whatsapp/fieldstats/w;
        //   164: astore          27
        //   166: iload           19
        //   168: ifeq            176
        //   171: getstatic       com/whatsapp/fieldstats/w.UNKNOWN:Lcom/whatsapp/fieldstats/w;
        //   174: astore          27
        //   176: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   179: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   182: bipush          117
        //   184: aaload         
        //   185: invokevirtual   com/whatsapp/App.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   188: checkcast       Landroid/telephony/TelephonyManager;
        //   191: astore          28
        //   193: iload           5
        //   195: bipush          45
        //   197: if_icmplt       266
        //   200: new             Ljava/lang/StringBuilder;
        //   203: dup            
        //   204: invokespecial   java/lang/StringBuilder.<init>:()V
        //   207: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   210: bipush          114
        //   212: aaload         
        //   213: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   216: iload           5
        //   218: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   221: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   224: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   227: aload_0        
        //   228: getfield        com/whatsapp/VoiceService.e:Landroid/os/Handler;
        //   231: iconst_5       
        //   232: aload           22
        //   234: invokestatic    android/os/Message.obtain:(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;
        //   237: invokevirtual   android/os/Message.sendToTarget:()V
        //   240: getstatic       com/whatsapp/fieldstats/r.MISSED:Lcom/whatsapp/fieldstats/r;
        //   243: aload           20
        //   245: dload           23
        //   247: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   250: aload           27
        //   252: aload           17
        //   254: aload           17
        //   256: iload           16
        //   258: invokestatic    com/whatsapp/VoiceService.a:(Lcom/whatsapp/fieldstats/r;Ljava/lang/String;Ljava/lang/Double;Lcom/whatsapp/fieldstats/w;Ljava/lang/String;Ljava/lang/String;Z)V
        //   261: iload           19
        //   263: ifeq            436
        //   266: aload           28
        //   268: invokevirtual   android/telephony/TelephonyManager.getCallState:()I
        //   271: istore          34
        //   273: iload           34
        //   275: ifeq            319
        //   278: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   281: bipush          115
        //   283: aaload         
        //   284: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   287: getstatic       com/whatsapp/Voip.b:Lcom/whatsapp/Voip$SignalingCallback;
        //   290: astore          37
        //   292: aload           37
        //   294: ifnull          436
        //   297: getstatic       com/whatsapp/Voip.b:Lcom/whatsapp/Voip$SignalingCallback;
        //   300: aload_2        
        //   301: aload           20
        //   303: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   306: bipush          116
        //   308: aaload         
        //   309: invokeinterface com/whatsapp/Voip$SignalingCallback.sendReject:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   314: iload           19
        //   316: ifeq            436
        //   319: invokestatic    com/whatsapp/Voip.d:()Z
        //   322: istore          35
        //   324: iload           35
        //   326: ifne            382
        //   329: aload_0        
        //   330: aload           14
        //   332: invokespecial   com/whatsapp/VoiceService.a:(Lcom/whatsapp/protocol/VoipOptions;)V
        //   335: aload_0        
        //   336: aload           27
        //   338: putfield        com/whatsapp/VoiceService.g:Lcom/whatsapp/fieldstats/w;
        //   341: aload_0        
        //   342: dload           23
        //   344: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   347: putfield        com/whatsapp/VoiceService.X:Ljava/lang/Double;
        //   350: aload_0        
        //   351: aload           17
        //   353: putfield        com/whatsapp/VoiceService.O:Ljava/lang/String;
        //   356: aload_0        
        //   357: aload           18
        //   359: putfield        com/whatsapp/VoiceService.y:Ljava/lang/String;
        //   362: aload_0        
        //   363: iload           16
        //   365: putfield        com/whatsapp/VoiceService.S:Z
        //   368: iload           16
        //   370: ifeq            382
        //   373: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   376: bipush          119
        //   378: aaload         
        //   379: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   382: aload           20
        //   384: aload           21
        //   386: aload_2        
        //   387: aload           6
        //   389: aload           7
        //   391: aload           8
        //   393: aload           9
        //   395: aload           10
        //   397: aload           11
        //   399: aload           12
        //   401: aload           13
        //   403: aload           14
        //   405: invokestatic    com/whatsapp/Voip.k:()Z
        //   408: aload_0        
        //   409: invokespecial   com/whatsapp/VoiceService.x:()F
        //   412: f2i            
        //   413: invokestatic    com/whatsapp/Voip.nativeHandleCallOffer:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[I[[B[I[[B[[B[B[BLcom/whatsapp/protocol/VoipOptions;ZI)V
        //   416: aload_0        
        //   417: invokespecial   com/whatsapp/VoiceService.r:()V
        //   420: aload_0        
        //   421: getfield        com/whatsapp/VoiceService.t:Ljava/lang/Boolean;
        //   424: ifnonnull       436
        //   427: aload_0        
        //   428: iload           15
        //   430: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   433: putfield        com/whatsapp/VoiceService.t:Ljava/lang/Boolean;
        //   436: return         
        //   437: astore          25
        //   439: aload           25
        //   441: athrow         
        //   442: astore          38
        //   444: aload           38
        //   446: athrow         
        //   447: astore          29
        //   449: aload           29
        //   451: athrow         
        //   452: astore          30
        //   454: aload           30
        //   456: athrow         
        //   457: astore          31
        //   459: aload           31
        //   461: athrow         
        //   462: astore          32
        //   464: aload           32
        //   466: athrow         
        //   467: astore          33
        //   469: aload           33
        //   471: athrow         
        //   472: astore          36
        //   474: aload           36
        //   476: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  151    156    437    442    Ljava/lang/IllegalArgumentException;
        //  200    261    442    447    Ljava/lang/IllegalArgumentException;
        //  266    273    447    452    Ljava/lang/IllegalArgumentException;
        //  278    292    452    457    Ljava/lang/IllegalArgumentException;
        //  297    314    457    462    Ljava/lang/IllegalArgumentException;
        //  319    324    462    467    Ljava/lang/IllegalArgumentException;
        //  329    368    467    472    Ljava/lang/IllegalArgumentException;
        //  373    382    467    472    Ljava/lang/IllegalArgumentException;
        //  382    436    472    477    Ljava/lang/IllegalArgumentException;
        //  444    447    447    452    Ljava/lang/IllegalArgumentException;
        //  449    452    452    457    Ljava/lang/IllegalArgumentException;
        //  454    457    457    462    Ljava/lang/IllegalArgumentException;
        //  459    462    462    467    Ljava/lang/IllegalArgumentException;
        //  464    467    467    472    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 218, Size: 218
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
    
    public void a(final cr cr, final String s, final long n, final String s2) {
        Log.i(VoiceService.Z[57]);
        final String a = cr.a;
        final String c = cr.c;
        App.e(a, c, s);
        Voip.nativeHandleCallOfferReject(a, c, s, s2);
    }
    
    public void a(final cr cr, final String s, final long n, final String s2, final int n2, final byte[] array) {
        Log.i(VoiceService.Z[54]);
        Voip.nativeHandleCallOfferPreAccept(cr.a, cr.c, s, s2, n2, array);
        App.b(cr);
    }
    
    public void a(final cr cr, final String s, final long n, final String s2, final int n2, final byte[][] array, final int[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final int n3, final String s3, final String s4) {
        Log.i(VoiceService.Z[11]);
        final String a = cr.a;
        final String c = cr.c;
        try {
            App.c(a, c, s);
            Voip.nativeHandleCallOfferAccept(a, c, s, s2, n2, array, array2, array3, array4, array5, n3);
            if (s == null) {
                return;
            }
            final String s5 = s;
            final String s6 = Voip.getCurrentCallId();
            final boolean b = s5.equals(s6);
            if (b) {
                final VoiceService voiceService = this;
                final String s7 = s3;
                voiceService.O = s7;
                final VoiceService voiceService2 = this;
                final String s8 = s4;
                voiceService2.y = s8;
            }
            return;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            final String s5 = s;
            final String s6 = Voip.getCurrentCallId();
            final boolean b = s5.equals(s6);
            if (b) {
                final VoiceService voiceService = this;
                final String s7 = s3;
                voiceService.O = s7;
                final VoiceService voiceService2 = this;
                final String s8 = s4;
                voiceService2.y = s8;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
    }
    
    public void a(final cr p0, final String p1, final long p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //     3: bipush          106
        //     5: aaload         
        //     6: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //     9: aload_1        
        //    10: invokestatic    com/whatsapp/App.b:(Lcom/whatsapp/protocol/cr;)V
        //    13: aload_2        
        //    14: ifnull          45
        //    17: aload_2        
        //    18: invokestatic    com/whatsapp/Voip.getCurrentCallId:()Ljava/lang/String;
        //    21: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    24: istore          9
        //    26: iload           9
        //    28: ifeq            45
        //    31: iload           5
        //    33: ifne            61
        //    36: iconst_1       
        //    37: istore          10
        //    39: aload_0        
        //    40: iload           10
        //    42: putfield        com/whatsapp/VoiceService.k:Z
        //    45: return         
        //    46: astore          6
        //    48: aload           6
        //    50: athrow         
        //    51: astore          7
        //    53: aload           7
        //    55: athrow         
        //    56: astore          8
        //    58: aload           8
        //    60: athrow         
        //    61: iconst_0       
        //    62: istore          10
        //    64: goto            39
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      13     46     51     Ljava/lang/IllegalArgumentException;
        //  17     26     51     61     Ljava/lang/IllegalArgumentException;
        //  48     51     51     61     Ljava/lang/IllegalArgumentException;
        //  53     56     56     61     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0039:
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
    
    public void a(final cr cr, final String s, final long n, final byte[] array, final int n2) {
        Log.i(VoiceService.Z[45]);
        Voip.nativeHandleCallRelayElection(cr.a, cr.c, s, array, n2);
        App.b(cr);
    }
    
    public void a(final cr cr, final String s, final long n, final byte[][] array, final int[] array2) {
        Log.i(VoiceService.Z[39]);
        Voip.nativeHandleCallRelayLatency(cr.a, cr.c, s, array, array2);
        App.b(cr);
    }
    
    public void a(final px p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: putfield        com/whatsapp/VoiceService.l:Lcom/whatsapp/px;
        //     5: aload_1        
        //     6: ifnull          26
        //     9: aload_0        
        //    10: invokestatic    com/whatsapp/Voip.getCurrentCallState:()Lcom/whatsapp/Voip$CallState;
        //    13: invokespecial   com/whatsapp/VoiceService.a:(Lcom/whatsapp/Voip$CallState;)V
        //    16: getstatic       com/whatsapp/App.I:Z
        //    19: istore          5
        //    21: iload           5
        //    23: ifeq            39
        //    26: invokestatic    com/whatsapp/Voip.getCurrentCallState:()Lcom/whatsapp/Voip$CallState;
        //    29: getstatic       com/whatsapp/Voip$CallState.RECEIVED_CALL:Lcom/whatsapp/Voip$CallState;
        //    32: if_acmpne       39
        //    35: aload_0        
        //    36: invokespecial   com/whatsapp/VoiceService.H:()V
        //    39: return         
        //    40: astore_2       
        //    41: aload_2        
        //    42: athrow         
        //    43: astore_3       
        //    44: aload_3        
        //    45: athrow         
        //    46: astore          4
        //    48: aload           4
        //    50: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      5      40     43     Ljava/lang/IllegalArgumentException;
        //  9      21     43     46     Ljava/lang/IllegalArgumentException;
        //  26     39     46     51     Ljava/lang/IllegalArgumentException;
        //  41     43     43     46     Ljava/lang/IllegalArgumentException;
        //  44     46     46     51     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 27, Size: 27
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
    
    public void a(final String s, final String s2) {
        Log.i(VoiceService.Z[56]);
    }
    
    public void a(final String s, final String s2, final String s3) {
        Log.i(VoiceService.Z[200]);
        Voip.nativeHandleCallOfferReceipt(s, s2, s3);
    }
    
    public void a(final String p0, final String p1, final String p2, final int p3, final byte[][] p4, final byte[][] p5, final VoipOptions p6, final boolean p7, final boolean p8) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //     3: bipush          42
        //     5: aaload         
        //     6: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //     9: aload_1        
        //    10: aload_2        
        //    11: aload_3        
        //    12: iload           4
        //    14: aload           5
        //    16: aload           6
        //    18: aload           7
        //    20: invokestatic    com/whatsapp/Voip.k:()Z
        //    23: aload_0        
        //    24: invokespecial   com/whatsapp/VoiceService.x:()F
        //    27: f2i            
        //    28: invokestatic    com/whatsapp/Voip.nativeHandleCallOfferAck:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I[[B[[BLcom/whatsapp/protocol/VoipOptions;ZI)V
        //    31: invokestatic    com/whatsapp/Voip.getCallInfo:()Lcom/whatsapp/Voip$CallInfo;
        //    34: astore          10
        //    36: aload           10
        //    38: ifnull          46
        //    41: aload           7
        //    43: ifnonnull       47
        //    46: return         
        //    47: aload           10
        //    49: invokevirtual   com/whatsapp/Voip$CallInfo.getCallState:()Lcom/whatsapp/Voip$CallState;
        //    52: astore          13
        //    54: getstatic       com/whatsapp/Voip$CallState.CALLING:Lcom/whatsapp/Voip$CallState;
        //    57: astore          14
        //    59: aload           13
        //    61: aload           14
        //    63: if_acmpne       188
        //    66: aload           7
        //    68: getfield        com/whatsapp/protocol/VoipOptions.miscellaneous:Lcom/whatsapp/protocol/VoipOptions$Miscellaneous;
        //    71: ifnull          188
        //    74: aload           7
        //    76: getfield        com/whatsapp/protocol/VoipOptions.miscellaneous:Lcom/whatsapp/protocol/VoipOptions$Miscellaneous;
        //    79: getfield        com/whatsapp/protocol/VoipOptions$Miscellaneous.callerTimeout:Ljava/lang/Integer;
        //    82: astore          19
        //    84: aload           19
        //    86: ifnull          188
        //    89: sipush          1000
        //    92: aload           7
        //    94: getfield        com/whatsapp/protocol/VoipOptions.miscellaneous:Lcom/whatsapp/protocol/VoipOptions$Miscellaneous;
        //    97: getfield        com/whatsapp/protocol/VoipOptions$Miscellaneous.callerTimeout:Ljava/lang/Integer;
        //   100: invokevirtual   java/lang/Integer.intValue:()I
        //   103: imul           
        //   104: istore          20
        //   106: iload           20
        //   108: invokestatic    com/whatsapp/Voip.getElapsedTimeSinceCallStarts:()I
        //   111: isub           
        //   112: istore          21
        //   114: iload           21
        //   116: ifle            188
        //   119: iload           21
        //   121: ldc_w           120000
        //   124: if_icmpge       188
        //   127: aload_0        
        //   128: getfield        com/whatsapp/VoiceService.A:Landroid/os/Handler;
        //   131: aconst_null    
        //   132: invokevirtual   android/os/Handler.removeCallbacksAndMessages:(Ljava/lang/Object;)V
        //   135: aload_0        
        //   136: getfield        com/whatsapp/VoiceService.A:Landroid/os/Handler;
        //   139: iconst_0       
        //   140: iload           21
        //   142: i2l            
        //   143: invokevirtual   android/os/Handler.sendEmptyMessageDelayed:(IJ)Z
        //   146: pop            
        //   147: new             Ljava/lang/StringBuilder;
        //   150: dup            
        //   151: invokespecial   java/lang/StringBuilder.<init>:()V
        //   154: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   157: bipush          43
        //   159: aaload         
        //   160: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   163: iload           20
        //   165: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   168: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   171: bipush          44
        //   173: aaload         
        //   174: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   177: iload           21
        //   179: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   182: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   185: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   188: aload_0        
        //   189: getfield        com/whatsapp/VoiceService.t:Ljava/lang/Boolean;
        //   192: ifnonnull       204
        //   195: aload_0        
        //   196: iload           8
        //   198: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   201: putfield        com/whatsapp/VoiceService.t:Ljava/lang/Boolean;
        //   204: aload_0        
        //   205: invokespecial   com/whatsapp/VoiceService.n:()V
        //   208: aload           10
        //   210: invokevirtual   com/whatsapp/Voip$CallInfo.getCallId:()Ljava/lang/String;
        //   213: aload_3        
        //   214: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   217: istore          18
        //   219: iload           18
        //   221: ifeq            46
        //   224: aload_0        
        //   225: aload           7
        //   227: invokespecial   com/whatsapp/VoiceService.a:(Lcom/whatsapp/protocol/VoipOptions;)V
        //   230: aload_0        
        //   231: iload           9
        //   233: putfield        com/whatsapp/VoiceService.S:Z
        //   236: iload           9
        //   238: ifeq            46
        //   241: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   244: bipush          41
        //   246: aaload         
        //   247: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   250: return         
        //   251: astore          17
        //   253: aload           17
        //   255: athrow         
        //   256: astore          11
        //   258: aload           11
        //   260: athrow         
        //   261: astore          12
        //   263: aload           12
        //   265: athrow         
        //   266: astore          22
        //   268: aload           22
        //   270: athrow         
        //   271: astore          15
        //   273: aload           15
        //   275: athrow         
        //   276: astore          16
        //   278: aload           16
        //   280: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  47     59     256    261    Ljava/lang/IllegalArgumentException;
        //  66     84     261    266    Ljava/lang/IllegalArgumentException;
        //  127    188    266    271    Ljava/lang/IllegalArgumentException;
        //  188    204    271    276    Ljava/lang/IllegalArgumentException;
        //  204    219    276    281    Ljava/lang/IllegalArgumentException;
        //  224    236    251    256    Ljava/lang/IllegalArgumentException;
        //  241    250    251    256    Ljava/lang/IllegalArgumentException;
        //  258    261    261    266    Ljava/lang/IllegalArgumentException;
        //  278    281    251    256    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 131, Size: 131
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
    
    public boolean a(final Voip$CallInfo p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/VoiceService.b:Z
        //     4: istore          6
        //     6: iload           6
        //     8: ifeq            62
        //    11: aload_1        
        //    12: ifnull          62
        //    15: aload_1        
        //    16: invokevirtual   com/whatsapp/Voip$CallInfo.getCallState:()Lcom/whatsapp/Voip$CallState;
        //    19: astore          7
        //    21: getstatic       com/whatsapp/Voip$CallState.ACTIVE:Lcom/whatsapp/Voip$CallState;
        //    24: astore          8
        //    26: aload           7
        //    28: aload           8
        //    30: if_acmpne       62
        //    33: aload_1        
        //    34: invokevirtual   com/whatsapp/Voip$CallInfo.isPeerInterrupted:()Z
        //    37: istore          9
        //    39: iload           9
        //    41: ifne            62
        //    44: iconst_1       
        //    45: ireturn        
        //    46: astore_2       
        //    47: aload_2        
        //    48: athrow         
        //    49: astore_3       
        //    50: aload_3        
        //    51: athrow         
        //    52: astore          4
        //    54: aload           4
        //    56: athrow         
        //    57: astore          5
        //    59: aload           5
        //    61: athrow         
        //    62: iconst_0       
        //    63: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      6      46     52     Ljava/lang/IllegalArgumentException;
        //  15     26     52     57     Ljava/lang/IllegalArgumentException;
        //  33     39     57     62     Ljava/lang/IllegalArgumentException;
        //  47     49     49     52     Ljava/lang/IllegalArgumentException;
        //  50     52     52     57     Ljava/lang/IllegalArgumentException;
        //  54     57     57     62     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 36, Size: 36
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
    
    public void b(final cr p0, final String p1, final long p2, final String p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: getfield        com/whatsapp/protocol/cr.a:Ljava/lang/String;
        //     4: astore          6
        //     6: aload_1        
        //     7: getfield        com/whatsapp/protocol/cr.c:Ljava/lang/String;
        //    10: astore          7
        //    12: new             Ljava/lang/StringBuilder;
        //    15: dup            
        //    16: invokespecial   java/lang/StringBuilder.<init>:()V
        //    19: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    22: sipush          153
        //    25: aaload         
        //    26: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    29: aload           6
        //    31: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    34: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    37: sipush          154
        //    40: aaload         
        //    41: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    44: aload_2        
        //    45: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    48: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    51: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    54: invokestatic    com/whatsapp/Voip.getCallInfo:()Lcom/whatsapp/Voip$CallInfo;
        //    57: astore          8
        //    59: aload           8
        //    61: ifnull          101
        //    64: aload           8
        //    66: invokevirtual   com/whatsapp/Voip$CallInfo.getCallId:()Ljava/lang/String;
        //    69: aload_2        
        //    70: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //    73: istore          16
        //    75: iload           16
        //    77: ifeq            101
        //    80: aload           8
        //    82: invokevirtual   com/whatsapp/Voip$CallInfo.getPeerId:()Ljava/lang/String;
        //    85: aload           6
        //    87: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //    90: ifeq            101
        //    93: aload_0        
        //    94: getfield        com/whatsapp/VoiceService.e:Landroid/os/Handler;
        //    97: iconst_1       
        //    98: invokevirtual   android/os/Handler.removeMessages:(I)V
        //   101: aload           8
        //   103: ifnull          156
        //   106: aload           8
        //   108: invokevirtual   com/whatsapp/Voip$CallInfo.getCallDuration:()J
        //   111: lstore          12
        //   113: lload           12
        //   115: lstore          9
        //   117: aload           6
        //   119: aload           7
        //   121: aload_2        
        //   122: aload           5
        //   124: invokestatic    com/whatsapp/Voip.nativeHandleCallTerminate:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   127: new             Lcom/whatsapp/protocol/cc;
        //   130: dup            
        //   131: aload_1        
        //   132: lload           9
        //   134: invokespecial   com/whatsapp/protocol/cc.<init>:(Lcom/whatsapp/protocol/cr;J)V
        //   137: invokestatic    com/whatsapp/App.b:(Lcom/whatsapp/protocol/cr;)V
        //   140: return         
        //   141: astore          14
        //   143: aload           14
        //   145: athrow         
        //   146: astore          15
        //   148: aload           15
        //   150: athrow         
        //   151: astore          11
        //   153: aload           11
        //   155: athrow         
        //   156: lconst_0       
        //   157: lstore          9
        //   159: goto            117
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  64     75     141    146    Ljava/lang/IllegalArgumentException;
        //  80     101    146    151    Ljava/lang/IllegalArgumentException;
        //  106    113    151    156    Ljava/lang/IllegalArgumentException;
        //  143    146    146    151    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 74, Size: 74
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
    
    public void b(final cr p0, final String p1, final long p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    10: sipush          190
        //    13: aaload         
        //    14: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    17: iload           5
        //    19: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //    22: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    25: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    28: iload           5
        //    30: ifeq            50
        //    33: aload_0        
        //    34: getfield        com/whatsapp/VoiceService.T:Lcom/whatsapp/VoiceService$VoiceServiceEventCallback;
        //    37: invokevirtual   com/whatsapp/VoiceService$VoiceServiceEventCallback.callResumed:()V
        //    40: iconst_0       
        //    41: invokestatic    com/whatsapp/Voip.setPeerAudioStreamPause:(Z)V
        //    44: getstatic       com/whatsapp/App.I:Z
        //    47: ifeq            61
        //    50: aload_0        
        //    51: getfield        com/whatsapp/VoiceService.T:Lcom/whatsapp/VoiceService$VoiceServiceEventCallback;
        //    54: invokevirtual   com/whatsapp/VoiceService$VoiceServiceEventCallback.callInterrupted:()V
        //    57: iconst_1       
        //    58: invokestatic    com/whatsapp/Voip.setPeerAudioStreamPause:(Z)V
        //    61: aload_1        
        //    62: invokestatic    com/whatsapp/App.b:(Lcom/whatsapp/protocol/cr;)V
        //    65: return         
        //    66: astore          6
        //    68: aload           6
        //    70: athrow         
        //    71: astore          7
        //    73: aload           7
        //    75: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      28     66     71     Ljava/lang/IllegalArgumentException;
        //  33     50     71     76     Ljava/lang/IllegalArgumentException;
        //  50     61     71     76     Ljava/lang/IllegalArgumentException;
        //  68     71     71     76     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0050:
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
    
    public void b(final cr cr, final String s, final long n, final byte[][] array, final int[] array2) {
        Log.i(VoiceService.Z[82]);
        Voip.nativeHandleCallTransport(cr.a, cr.c, s, array, array2);
        App.b(cr);
    }
    
    public void b(final String s) {
        final Intent intent = new Intent((Context)App.aq, (Class)VoipActivity.class);
        intent.putExtra(VoiceService.Z[187], s);
        intent.setFlags(268435456);
        this.startActivity(intent);
    }
    
    public void b(final String s, final String s2) {
        Log.i(VoiceService.Z[35]);
    }
    
    public void b(final String s, final String s2, final String s3) {
        Log.i(VoiceService.Z[55]);
    }
    
    public void c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //     3: sipush          144
        //     6: aaload         
        //     7: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    10: invokestatic    java/lang/System.currentTimeMillis:()J
        //    13: lstore_2       
        //    14: invokestatic    com/whatsapp/aol.a:()V
        //    17: aload_1        
        //    18: ifnull          94
        //    21: aload_0        
        //    22: getfield        com/whatsapp/VoiceService.l:Lcom/whatsapp/px;
        //    25: astore          10
        //    27: aload           10
        //    29: ifnull          94
        //    32: aload_0        
        //    33: getfield        com/whatsapp/VoiceService.l:Lcom/whatsapp/px;
        //    36: aload_1        
        //    37: invokeinterface com/whatsapp/px.e:(Ljava/lang/String;)V
        //    42: aload_0        
        //    43: getfield        com/whatsapp/VoiceService.t:Ljava/lang/Boolean;
        //    46: ifnull          94
        //    49: new             Ljava/lang/StringBuilder;
        //    52: dup            
        //    53: invokespecial   java/lang/StringBuilder.<init>:()V
        //    56: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    59: sipush          146
        //    62: aaload         
        //    63: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    66: aload_1        
        //    67: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    70: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    73: sipush          147
        //    76: aaload         
        //    77: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    80: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    83: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    86: aload_0        
        //    87: iconst_0       
        //    88: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    91: putfield        com/whatsapp/VoiceService.t:Ljava/lang/Boolean;
        //    94: aload_0        
        //    95: getfield        com/whatsapp/VoiceService.J:Lcom/whatsapp/aln;
        //    98: iconst_2       
        //    99: invokevirtual   com/whatsapp/aln.sendEmptyMessage:(I)Z
        //   102: pop            
        //   103: invokestatic    java/lang/System.currentTimeMillis:()J
        //   106: lload_2        
        //   107: lsub           
        //   108: lstore          8
        //   110: new             Ljava/lang/StringBuilder;
        //   113: dup            
        //   114: invokespecial   java/lang/StringBuilder.<init>:()V
        //   117: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   120: sipush          148
        //   123: aaload         
        //   124: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   127: lload           8
        //   129: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   132: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   135: sipush          145
        //   138: aaload         
        //   139: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   142: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   145: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   148: return         
        //   149: astore          4
        //   151: aload           4
        //   153: athrow         
        //   154: astore          5
        //   156: aload           5
        //   158: athrow         
        //   159: astore          6
        //   161: aload           6
        //   163: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  14     17     149    154    Ljava/lang/IllegalArgumentException;
        //  21     27     154    159    Ljava/lang/IllegalArgumentException;
        //  32     94     159    164    Ljava/lang/IllegalArgumentException;
        //  151    154    154    159    Ljava/lang/IllegalArgumentException;
        //  156    159    159    164    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 74, Size: 74
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
    
    public void c(final String s, final String s2) {
        Log.i(VoiceService.Z[58]);
    }
    
    public void c(final String s, final String s2, final String s3) {
        Log.i(VoiceService.Z[201]);
    }
    
    public void d(final String s, final String s2) {
        Log.i(VoiceService.Z[46]);
    }
    
    public void e(final String s, final String s2) {
        Log.i(VoiceService.Z[61]);
    }
    
    public boolean e() {
        try {
            if (this.Y == asg.SPEAKER) {
                return true;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return false;
    }
    
    public void f() {
        Log.i(VoiceService.Z[188]);
        if (this.h != null) {
            ((Vibrator)this.getSystemService(VoiceService.Z[189])).cancel();
            this.h = null;
        }
        try {
            if (this.W != null) {
                this.W.stop();
                this.W = null;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public void f(final String s, final String s2) {
        Log.i(VoiceService.Z[149]);
    }
    
    public void g(final String s, final String s2) {
        Log.i(VoiceService.Z[150]);
    }
    
    public void h(final String s, final String s2) {
        Log.i(VoiceService.Z[10]);
    }
    
    public void i() {
        while (true) {
            while (true) {
                try {
                    if (this.Y != asg.BLUETOOTH) {
                        final boolean b = true;
                        this.a(b);
                        return;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                final boolean b = false;
                continue;
            }
        }
    }
    
    public void i(final String s, final String s2) {
        Log.i(VoiceService.Z[194]);
    }
    
    public boolean o() {
        try {
            if (this.Y == asg.BLUETOOTH) {
                return true;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return false;
    }
    
    public IBinder onBind(final Intent intent) {
        Log.i(VoiceService.Z[202] + intent);
        return (IBinder)this.s;
    }
    
    public void onCreate() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //     3: bipush          79
        //     5: aaload         
        //     6: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //     9: aload_0        
        //    10: invokespecial   android/app/Service.onCreate:()V
        //    13: invokestatic    de/greenrobot/event/m.b:()Lde/greenrobot/event/m;
        //    16: aload_0        
        //    17: invokevirtual   de/greenrobot/event/m.d:(Ljava/lang/Object;)V
        //    20: aload_0        
        //    21: getfield        com/whatsapp/VoiceService.T:Lcom/whatsapp/VoiceService$VoiceServiceEventCallback;
        //    24: invokestatic    com/whatsapp/Voip.nativeRegisterEventCallback:(Lcom/whatsapp/Voip$EventCallback;)V
        //    27: aload_0        
        //    28: new             Lcom/whatsapp/util/k;
        //    31: dup            
        //    32: aload_0        
        //    33: invokespecial   com/whatsapp/util/k.<init>:(Landroid/content/Context;)V
        //    36: putfield        com/whatsapp/VoiceService.x:Lcom/whatsapp/util/k;
        //    39: aload_0        
        //    40: invokestatic    android/bluetooth/BluetoothAdapter.getDefaultAdapter:()Landroid/bluetooth/BluetoothAdapter;
        //    43: putfield        com/whatsapp/VoiceService.G:Landroid/bluetooth/BluetoothAdapter;
        //    46: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    49: bipush          11
        //    51: if_icmplt       85
        //    54: aload_0        
        //    55: getfield        com/whatsapp/VoiceService.G:Landroid/bluetooth/BluetoothAdapter;
        //    58: astore_3       
        //    59: aload_3        
        //    60: ifnull          85
        //    63: new             Lcom/whatsapp/atg;
        //    66: dup            
        //    67: aload_0        
        //    68: invokespecial   com/whatsapp/atg.<init>:(Lcom/whatsapp/VoiceService;)V
        //    71: astore          4
        //    73: aload_0        
        //    74: getfield        com/whatsapp/VoiceService.G:Landroid/bluetooth/BluetoothAdapter;
        //    77: aload_0        
        //    78: aload           4
        //    80: iconst_1       
        //    81: invokevirtual   android/bluetooth/BluetoothAdapter.getProfileProxy:(Landroid/content/Context;Landroid/bluetooth/BluetoothProfile$ServiceListener;I)Z
        //    84: pop            
        //    85: aload_0        
        //    86: new             Lcom/whatsapp/ata;
        //    89: dup            
        //    90: aload_0        
        //    91: invokespecial   com/whatsapp/ata.<init>:(Lcom/whatsapp/VoiceService;)V
        //    94: putfield        com/whatsapp/VoiceService.d:Landroid/telephony/PhoneStateListener;
        //    97: aload_0        
        //    98: new             Lcom/whatsapp/VoiceService$4;
        //   101: dup            
        //   102: aload_0        
        //   103: invokespecial   com/whatsapp/VoiceService$4.<init>:(Lcom/whatsapp/VoiceService;)V
        //   106: putfield        com/whatsapp/VoiceService.f:Landroid/content/BroadcastReceiver;
        //   109: aload_0        
        //   110: new             Lcom/whatsapp/VoiceService$5;
        //   113: dup            
        //   114: aload_0        
        //   115: invokespecial   com/whatsapp/VoiceService$5.<init>:(Lcom/whatsapp/VoiceService;)V
        //   118: putfield        com/whatsapp/VoiceService.V:Landroid/content/BroadcastReceiver;
        //   121: aload_0        
        //   122: new             Lcom/whatsapp/VoiceService$6;
        //   125: dup            
        //   126: aload_0        
        //   127: invokespecial   com/whatsapp/VoiceService$6.<init>:(Lcom/whatsapp/VoiceService;)V
        //   130: putfield        com/whatsapp/VoiceService.P:Landroid/content/BroadcastReceiver;
        //   133: aload_0        
        //   134: new             Lcom/whatsapp/VoiceService$7;
        //   137: dup            
        //   138: aload_0        
        //   139: invokespecial   com/whatsapp/VoiceService$7.<init>:(Lcom/whatsapp/VoiceService;)V
        //   142: putfield        com/whatsapp/VoiceService.H:Landroid/content/BroadcastReceiver;
        //   145: aload_0        
        //   146: new             Landroid/os/Handler;
        //   149: dup            
        //   150: new             Lcom/whatsapp/c9;
        //   153: dup            
        //   154: aload_0        
        //   155: invokespecial   com/whatsapp/c9.<init>:(Lcom/whatsapp/VoiceService;)V
        //   158: invokespecial   android/os/Handler.<init>:(Landroid/os/Handler$Callback;)V
        //   161: putfield        com/whatsapp/VoiceService.i:Landroid/os/Handler;
        //   164: aload_0        
        //   165: new             Landroid/os/Handler;
        //   168: dup            
        //   169: new             Lcom/whatsapp/hb;
        //   172: dup            
        //   173: aload_0        
        //   174: invokespecial   com/whatsapp/hb.<init>:(Lcom/whatsapp/VoiceService;)V
        //   177: invokespecial   android/os/Handler.<init>:(Landroid/os/Handler$Callback;)V
        //   180: putfield        com/whatsapp/VoiceService.A:Landroid/os/Handler;
        //   183: aload_0        
        //   184: new             Landroid/os/Handler;
        //   187: dup            
        //   188: new             Lcom/whatsapp/awi;
        //   191: dup            
        //   192: aload_0        
        //   193: invokespecial   com/whatsapp/awi.<init>:(Lcom/whatsapp/VoiceService;)V
        //   196: invokespecial   android/os/Handler.<init>:(Landroid/os/Handler$Callback;)V
        //   199: putfield        com/whatsapp/VoiceService.M:Landroid/os/Handler;
        //   202: aload_0        
        //   203: new             Landroid/os/Handler;
        //   206: dup            
        //   207: new             Lcom/whatsapp/dv;
        //   210: dup            
        //   211: aload_0        
        //   212: invokespecial   com/whatsapp/dv.<init>:(Lcom/whatsapp/VoiceService;)V
        //   215: invokespecial   android/os/Handler.<init>:(Landroid/os/Handler$Callback;)V
        //   218: putfield        com/whatsapp/VoiceService.e:Landroid/os/Handler;
        //   221: aload_0        
        //   222: new             Lcom/whatsapp/nw;
        //   225: dup            
        //   226: aload_0        
        //   227: invokespecial   com/whatsapp/nw.<init>:(Lcom/whatsapp/VoiceService;)V
        //   230: putfield        com/whatsapp/VoiceService.p:Lcom/whatsapp/util/b4;
        //   233: aload_0        
        //   234: new             Landroid/os/HandlerThread;
        //   237: dup            
        //   238: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   241: bipush          80
        //   243: aaload         
        //   244: invokespecial   android/os/HandlerThread.<init>:(Ljava/lang/String;)V
        //   247: putfield        com/whatsapp/VoiceService.R:Landroid/os/HandlerThread;
        //   250: aload_0        
        //   251: getfield        com/whatsapp/VoiceService.R:Landroid/os/HandlerThread;
        //   254: invokevirtual   android/os/HandlerThread.start:()V
        //   257: aload_0        
        //   258: new             Lcom/whatsapp/aln;
        //   261: dup            
        //   262: aload_0        
        //   263: aload_0        
        //   264: getfield        com/whatsapp/VoiceService.R:Landroid/os/HandlerThread;
        //   267: invokevirtual   android/os/HandlerThread.getLooper:()Landroid/os/Looper;
        //   270: aconst_null    
        //   271: invokespecial   com/whatsapp/aln.<init>:(Lcom/whatsapp/VoiceService;Landroid/os/Looper;Lcom/whatsapp/qx;)V
        //   274: putfield        com/whatsapp/VoiceService.J:Lcom/whatsapp/aln;
        //   277: invokestatic    com/whatsapp/VoiceService.E:()Z
        //   280: ifeq            292
        //   283: getstatic       com/whatsapp/i8.AUDIO_ENGINE_JNI:Lcom/whatsapp/i8;
        //   286: invokevirtual   com/whatsapp/i8.ordinal:()I
        //   289: invokestatic    com/whatsapp/Voip.setAudioEnginePreference:(I)V
        //   292: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   295: bipush          81
        //   297: aaload         
        //   298: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   301: return         
        //   302: astore_1       
        //   303: aload_1        
        //   304: athrow         
        //   305: astore          5
        //   307: aload           5
        //   309: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   312: goto            85
        //   315: astore_2       
        //   316: aload_2        
        //   317: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      59     302    305    Ljava/lang/Exception;
        //  73     85     305    315    Ljava/lang/Exception;
        //  85     292    315    318    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 154, Size: 154
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
    
    public void onDestroy() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //     3: iconst_1       
        //     4: aaload         
        //     5: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //     8: aload_0        
        //     9: getfield        com/whatsapp/VoiceService.n:Landroid/media/SoundPool;
        //    12: ifnull          27
        //    15: aload_0        
        //    16: getfield        com/whatsapp/VoiceService.n:Landroid/media/SoundPool;
        //    19: invokevirtual   android/media/SoundPool.release:()V
        //    22: aload_0        
        //    23: aconst_null    
        //    24: putfield        com/whatsapp/VoiceService.n:Landroid/media/SoundPool;
        //    27: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    30: istore          5
        //    32: iload           5
        //    34: bipush          11
        //    36: if_icmplt       69
        //    39: aload_0        
        //    40: getfield        com/whatsapp/VoiceService.G:Landroid/bluetooth/BluetoothAdapter;
        //    43: astore          15
        //    45: aload           15
        //    47: ifnull          69
        //    50: aload_0        
        //    51: getfield        com/whatsapp/VoiceService.a:Landroid/bluetooth/BluetoothHeadset;
        //    54: ifnull          69
        //    57: aload_0        
        //    58: getfield        com/whatsapp/VoiceService.G:Landroid/bluetooth/BluetoothAdapter;
        //    61: iconst_1       
        //    62: aload_0        
        //    63: getfield        com/whatsapp/VoiceService.a:Landroid/bluetooth/BluetoothHeadset;
        //    66: invokevirtual   android/bluetooth/BluetoothAdapter.closeProfileProxy:(ILandroid/bluetooth/BluetoothProfile;)V
        //    69: invokestatic    com/whatsapp/App.x:()Z
        //    72: ifeq            207
        //    75: aload_0        
        //    76: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    79: iconst_4       
        //    80: aaload         
        //    81: invokevirtual   com/whatsapp/VoiceService.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    84: checkcast       Landroid/app/AlarmManager;
        //    87: astore          8
        //    89: new             Landroid/content/Intent;
        //    92: dup            
        //    93: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    96: iconst_3       
        //    97: aaload         
        //    98: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //   101: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   104: iconst_5       
        //   105: aaload         
        //   106: invokevirtual   android/content/Intent.setPackage:(Ljava/lang/String;)Landroid/content/Intent;
        //   109: astore          9
        //   111: aload           9
        //   113: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   116: bipush          6
        //   118: aaload         
        //   119: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   122: bipush          8
        //   124: aaload         
        //   125: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   128: pop            
        //   129: aload           9
        //   131: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   134: iconst_0       
        //   135: aaload         
        //   136: iconst_1       
        //   137: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   140: pop            
        //   141: aload           9
        //   143: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   146: bipush          9
        //   148: aaload         
        //   149: getstatic       com/whatsapp/f8.VOICE:Lcom/whatsapp/f8;
        //   152: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
        //   155: pop            
        //   156: aload           9
        //   158: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   161: iconst_2       
        //   162: aaload         
        //   163: getstatic       com/whatsapp/v4.VOICE:Lcom/whatsapp/v4;
        //   166: invokestatic    java/util/EnumSet.of:(Ljava/lang/Enum;)Ljava/util/EnumSet;
        //   169: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
        //   172: pop            
        //   173: aload_0        
        //   174: iconst_0       
        //   175: aload           9
        //   177: ldc_w           1073741824
        //   180: invokestatic    android/app/PendingIntent.getBroadcast:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //   183: astore          14
        //   185: aload           8
        //   187: aload           14
        //   189: invokevirtual   android/app/AlarmManager.cancel:(Landroid/app/PendingIntent;)V
        //   192: aload           8
        //   194: iconst_3       
        //   195: ldc2_w          30000
        //   198: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //   201: ladd           
        //   202: aload           14
        //   204: invokevirtual   android/app/AlarmManager.set:(IJLandroid/app/PendingIntent;)V
        //   207: aload_0        
        //   208: invokespecial   com/whatsapp/VoiceService.q:()V
        //   211: invokestatic    com/whatsapp/Voip.nativeUnregisterEventCallback:()V
        //   214: invokestatic    de/greenrobot/event/m.b:()Lde/greenrobot/event/m;
        //   217: aload_0        
        //   218: invokevirtual   de/greenrobot/event/m.e:(Ljava/lang/Object;)V
        //   221: aload_0        
        //   222: getfield        com/whatsapp/VoiceService.R:Landroid/os/HandlerThread;
        //   225: ifnull          242
        //   228: aload_0        
        //   229: getfield        com/whatsapp/VoiceService.J:Lcom/whatsapp/aln;
        //   232: iconst_0       
        //   233: invokevirtual   com/whatsapp/aln.sendEmptyMessage:(I)Z
        //   236: pop            
        //   237: aload_0        
        //   238: aconst_null    
        //   239: putfield        com/whatsapp/VoiceService.R:Landroid/os/HandlerThread;
        //   242: aload_0        
        //   243: invokespecial   android/app/Service.onDestroy:()V
        //   246: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   249: bipush          7
        //   251: aaload         
        //   252: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   255: return         
        //   256: astore_1       
        //   257: aload_1        
        //   258: athrow         
        //   259: astore_2       
        //   260: aload_2        
        //   261: athrow         
        //   262: astore_3       
        //   263: aload_3        
        //   264: athrow         
        //   265: astore          4
        //   267: aload           4
        //   269: athrow         
        //   270: astore          6
        //   272: aload           6
        //   274: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      27     256    259    Ljava/lang/IllegalArgumentException;
        //  27     32     259    262    Ljava/lang/IllegalArgumentException;
        //  39     45     262    265    Ljava/lang/IllegalArgumentException;
        //  50     69     265    270    Ljava/lang/IllegalArgumentException;
        //  207    242    270    275    Ljava/lang/IllegalArgumentException;
        //  260    262    262    265    Ljava/lang/IllegalArgumentException;
        //  263    265    265    270    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 138, Size: 138
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
    
    public void onEvent(final fr fr) {
        try {
            if (fr.a()) {
                Voip.onNetworkChange();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public void onEvent(final vp vp) {
        this.r();
    }
    
    public int onStartCommand(final Intent p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          4
        //     5: aload_1        
        //     6: ifnonnull       37
        //     9: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    12: sipush          182
        //    15: aaload         
        //    16: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    19: aload_0        
        //    20: getfield        com/whatsapp/VoiceService.I:Z
        //    23: ifne            30
        //    26: aload_0        
        //    27: invokevirtual   com/whatsapp/VoiceService.stopSelf:()V
        //    30: iconst_2       
        //    31: ireturn        
        //    32: astore          61
        //    34: aload           61
        //    36: athrow         
        //    37: aload_1        
        //    38: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //    41: astore          5
        //    43: new             Ljava/lang/StringBuilder;
        //    46: dup            
        //    47: invokespecial   java/lang/StringBuilder.<init>:()V
        //    50: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    53: sipush          172
        //    56: aaload         
        //    57: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    60: aload_1        
        //    61: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    64: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    67: sipush          169
        //    70: aaload         
        //    71: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    74: iload_2        
        //    75: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    78: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    81: sipush          181
        //    84: aaload         
        //    85: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    88: iload_3        
        //    89: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    92: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    95: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    98: aload           5
        //   100: ifnonnull       130
        //   103: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   106: sipush          157
        //   109: aaload         
        //   110: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   113: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   116: sipush          159
        //   119: aaload         
        //   120: invokestatic    com/whatsapp/aol.a:(Ljava/lang/String;)V
        //   123: iconst_2       
        //   124: ireturn        
        //   125: astore          6
        //   127: aload           6
        //   129: athrow         
        //   130: aload_0        
        //   131: getfield        com/whatsapp/VoiceService.I:Z
        //   134: istore          10
        //   136: iload           10
        //   138: ifne            202
        //   141: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   144: sipush          160
        //   147: aaload         
        //   148: aload           5
        //   150: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   153: istore          60
        //   155: iload           60
        //   157: ifne            202
        //   160: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   163: sipush          171
        //   166: aaload         
        //   167: aload           5
        //   169: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   172: ifne            202
        //   175: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   178: sipush          161
        //   181: aaload         
        //   182: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   185: iconst_2       
        //   186: ireturn        
        //   187: astore          7
        //   189: aload           7
        //   191: athrow         
        //   192: astore          8
        //   194: aload           8
        //   196: athrow         
        //   197: astore          9
        //   199: aload           9
        //   201: athrow         
        //   202: invokestatic    java/lang/System.currentTimeMillis:()J
        //   205: lstore          11
        //   207: iconst_m1      
        //   208: istore          13
        //   210: aload           5
        //   212: invokevirtual   java/lang/String.hashCode:()I
        //   215: istore          15
        //   217: iload           15
        //   219: lookupswitch {
        //          -1573659621: 387
        //          1281366991: 495
        //          1331833598: 441
        //          1444513451: 414
        //          2138982608: 468
        //          default: 268
        //        }
        //   268: iload           13
        //   270: tableswitch {
        //                0: 545
        //                1: 986
        //                2: 1057
        //                3: 1066
        //                4: 1086
        //          default: 304
        //        }
        //   304: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   307: sipush          176
        //   310: aaload         
        //   311: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   314: invokestatic    java/lang/System.currentTimeMillis:()J
        //   317: lload           11
        //   319: lsub           
        //   320: lstore          20
        //   322: new             Ljava/lang/StringBuilder;
        //   325: dup            
        //   326: invokespecial   java/lang/StringBuilder.<init>:()V
        //   329: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   332: sipush          174
        //   335: aaload         
        //   336: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   339: aload           5
        //   341: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   344: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   347: sipush          163
        //   350: aaload         
        //   351: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   354: lload           20
        //   356: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   359: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   362: sipush          177
        //   365: aaload         
        //   366: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   369: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   372: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   375: invokestatic    com/whatsapp/Voip.d:()Z
        //   378: ifne            385
        //   381: aload_0        
        //   382: invokespecial   com/whatsapp/VoiceService.G:()V
        //   385: iconst_2       
        //   386: ireturn        
        //   387: aload           5
        //   389: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   392: sipush          186
        //   395: aaload         
        //   396: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   399: istore          59
        //   401: iload           59
        //   403: ifeq            268
        //   406: iconst_0       
        //   407: istore          13
        //   409: iload           4
        //   411: ifeq            268
        //   414: aload           5
        //   416: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   419: sipush          173
        //   422: aaload         
        //   423: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   426: istore          58
        //   428: iload           58
        //   430: ifeq            268
        //   433: iconst_1       
        //   434: istore          13
        //   436: iload           4
        //   438: ifeq            268
        //   441: aload           5
        //   443: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   446: sipush          166
        //   449: aaload         
        //   450: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   453: istore          56
        //   455: iload           56
        //   457: ifeq            268
        //   460: iconst_2       
        //   461: istore          13
        //   463: iload           4
        //   465: ifeq            268
        //   468: aload           5
        //   470: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   473: sipush          183
        //   476: aaload         
        //   477: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   480: istore          54
        //   482: iload           54
        //   484: ifeq            268
        //   487: iconst_3       
        //   488: istore          13
        //   490: iload           4
        //   492: ifeq            268
        //   495: aload           5
        //   497: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   500: sipush          156
        //   503: aaload         
        //   504: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   507: istore          17
        //   509: iload           17
        //   511: ifeq            268
        //   514: iconst_4       
        //   515: istore          13
        //   517: goto            268
        //   520: astore          14
        //   522: aload           14
        //   524: athrow         
        //   525: astore          57
        //   527: aload           57
        //   529: athrow         
        //   530: astore          55
        //   532: aload           55
        //   534: athrow         
        //   535: astore          53
        //   537: aload           53
        //   539: athrow         
        //   540: astore          16
        //   542: aload           16
        //   544: athrow         
        //   545: aload_1        
        //   546: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   549: sipush          164
        //   552: aaload         
        //   553: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   556: astore          27
        //   558: aload_1        
        //   559: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   562: sipush          179
        //   565: aaload         
        //   566: iconst_m1      
        //   567: invokevirtual   android/content/Intent.getIntExtra:(Ljava/lang/String;I)I
        //   570: i2d            
        //   571: dstore          28
        //   573: dload           28
        //   575: ldc2_w          -1.0
        //   578: dcmpl          
        //   579: ifne            1114
        //   582: aconst_null    
        //   583: astore          30
        //   585: aload_0        
        //   586: aload           30
        //   588: putfield        com/whatsapp/VoiceService.N:Ljava/lang/Double;
        //   591: aload_0        
        //   592: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   595: sipush          168
        //   598: aaload         
        //   599: invokevirtual   com/whatsapp/VoiceService.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   602: checkcast       Landroid/telephony/TelephonyManager;
        //   605: astore          31
        //   607: aload           31
        //   609: invokevirtual   android/telephony/TelephonyManager.getCallState:()I
        //   612: istore          33
        //   614: iload           33
        //   616: ifeq            1129
        //   619: iconst_1       
        //   620: istore          34
        //   622: aload_0        
        //   623: iload           34
        //   625: putfield        com/whatsapp/VoiceService.c:Z
        //   628: aload_0        
        //   629: getfield        com/whatsapp/VoiceService.c:Z
        //   632: istore          40
        //   634: iload           40
        //   636: ifeq            674
        //   639: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   642: sipush          175
        //   645: aaload         
        //   646: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   649: aload_0        
        //   650: ldc_w           2131230872
        //   653: iconst_1       
        //   654: invokestatic    com/whatsapp/App.b:(Landroid/content/Context;II)V
        //   657: getstatic       com/whatsapp/fieldstats/r.CALL_CANCELED_CELLULAR_IN_PROGRESS:Lcom/whatsapp/fieldstats/r;
        //   660: aload           27
        //   662: aload_0        
        //   663: getfield        com/whatsapp/VoiceService.N:Ljava/lang/Double;
        //   666: invokestatic    com/whatsapp/VoiceService.a:(Lcom/whatsapp/fieldstats/r;Ljava/lang/String;Ljava/lang/Double;)V
        //   669: iload           4
        //   671: ifeq            314
        //   674: invokestatic    com/whatsapp/App.j:()I
        //   677: istore          41
        //   679: iload           41
        //   681: ifne            765
        //   684: aload_0        
        //   685: invokestatic    com/whatsapp/App.d:(Landroid/content/Context;)Z
        //   688: istore          52
        //   690: iload           52
        //   692: ifeq            730
        //   695: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   698: sipush          162
        //   701: aaload         
        //   702: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   705: aload_0        
        //   706: ldc_w           2131230871
        //   709: iconst_1       
        //   710: invokestatic    com/whatsapp/App.b:(Landroid/content/Context;II)V
        //   713: getstatic       com/whatsapp/fieldstats/r.CALL_CANCELED_AIRPLANE_MODE_ON:Lcom/whatsapp/fieldstats/r;
        //   716: aload           27
        //   718: aload_0        
        //   719: getfield        com/whatsapp/VoiceService.N:Ljava/lang/Double;
        //   722: invokestatic    com/whatsapp/VoiceService.a:(Lcom/whatsapp/fieldstats/r;Ljava/lang/String;Ljava/lang/Double;)V
        //   725: iload           4
        //   727: ifeq            314
        //   730: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   733: sipush          185
        //   736: aaload         
        //   737: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   740: aload_0        
        //   741: ldc_w           2131231924
        //   744: iconst_1       
        //   745: invokestatic    com/whatsapp/App.b:(Landroid/content/Context;II)V
        //   748: getstatic       com/whatsapp/fieldstats/r.CALL_CANCELED_NO_NETWORK:Lcom/whatsapp/fieldstats/r;
        //   751: aload           27
        //   753: aload_0        
        //   754: getfield        com/whatsapp/VoiceService.N:Ljava/lang/Double;
        //   757: invokestatic    com/whatsapp/VoiceService.a:(Lcom/whatsapp/fieldstats/r;Ljava/lang/String;Ljava/lang/Double;)V
        //   760: iload           4
        //   762: ifeq            314
        //   765: aload           27
        //   767: iconst_1       
        //   768: invokestatic    com/whatsapp/protocol/bi.a:(Ljava/lang/String;Z)Lcom/whatsapp/protocol/c6;
        //   771: getfield        com/whatsapp/protocol/c6.c:Ljava/lang/String;
        //   774: astore          42
        //   776: new             Lcom/whatsapp/protocol/bi;
        //   779: dup            
        //   780: new             Lcom/whatsapp/protocol/c6;
        //   783: dup            
        //   784: aload           27
        //   786: iconst_1       
        //   787: aload           42
        //   789: invokestatic    com/whatsapp/Voip.a:(Ljava/lang/String;)Ljava/lang/String;
        //   792: invokespecial   com/whatsapp/protocol/c6.<init>:(Ljava/lang/String;ZLjava/lang/String;)V
        //   795: invokespecial   com/whatsapp/protocol/bi.<init>:(Lcom/whatsapp/protocol/c6;)V
        //   798: astore          43
        //   800: aload           43
        //   802: invokestatic    com/whatsapp/App.m:()J
        //   805: putfield        com/whatsapp/protocol/bi.u:J
        //   808: aload           43
        //   810: bipush          8
        //   812: putfield        com/whatsapp/protocol/bi.I:B
        //   815: aload           43
        //   817: iconst_0       
        //   818: putfield        com/whatsapp/protocol/bi.D:I
        //   821: aload           43
        //   823: bipush          6
        //   825: putfield        com/whatsapp/protocol/bi.c:I
        //   828: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   831: aload           43
        //   833: invokevirtual   com/whatsapp/vy.g:(Lcom/whatsapp/protocol/bi;)V
        //   836: aload           43
        //   838: invokestatic    com/whatsapp/atd.b:(Lcom/whatsapp/protocol/bi;)V
        //   841: aload_0        
        //   842: iconst_1       
        //   843: invokespecial   com/whatsapp/VoiceService.b:(Z)V
        //   846: invokestatic    java/lang/System.currentTimeMillis:()J
        //   849: lstore          44
        //   851: aload           42
        //   853: aload           27
        //   855: invokestatic    com/whatsapp/Voip.startCall:(Ljava/lang/String;Ljava/lang/String;)V
        //   858: new             Ljava/lang/StringBuilder;
        //   861: dup            
        //   862: invokespecial   java/lang/StringBuilder.<init>:()V
        //   865: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   868: sipush          170
        //   871: aaload         
        //   872: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   875: invokestatic    java/lang/System.currentTimeMillis:()J
        //   878: lload           44
        //   880: lsub           
        //   881: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   884: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   887: sipush          158
        //   890: aaload         
        //   891: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   894: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   897: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   900: aload_0        
        //   901: invokespecial   com/whatsapp/VoiceService.r:()V
        //   904: new             Landroid/content/Intent;
        //   907: dup            
        //   908: aload_0        
        //   909: ldc_w           Lcom/whatsapp/VoipActivity;.class
        //   912: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   915: astore          46
        //   917: aload           46
        //   919: ldc_w           268435456
        //   922: invokevirtual   android/content/Intent.setFlags:(I)Landroid/content/Intent;
        //   925: pop            
        //   926: aload           46
        //   928: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   931: sipush          165
        //   934: aaload         
        //   935: aload           27
        //   937: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   940: pop            
        //   941: aload           46
        //   943: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   946: sipush          167
        //   949: aaload         
        //   950: iconst_1       
        //   951: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   954: pop            
        //   955: aload_0        
        //   956: aload           46
        //   958: invokevirtual   com/whatsapp/VoiceService.startActivity:(Landroid/content/Intent;)V
        //   961: aload_0        
        //   962: invokespecial   com/whatsapp/VoiceService.v:()Landroid/app/Notification;
        //   965: astore          50
        //   967: aload           50
        //   969: ifnull          314
        //   972: aload_0        
        //   973: ldc_w           2131755041
        //   976: aload           50
        //   978: invokevirtual   com/whatsapp/VoiceService.startForeground:(ILandroid/app/Notification;)V
        //   981: iload           4
        //   983: ifeq            314
        //   986: getstatic       com/whatsapp/VoiceService.w:Ljava/util/concurrent/atomic/AtomicInteger;
        //   989: invokevirtual   java/util/concurrent/atomic/AtomicInteger.getAndIncrement:()I
        //   992: pop            
        //   993: aload_1        
        //   994: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //   997: sipush          184
        //  1000: aaload         
        //  1001: invokevirtual   android/content/Intent.getParcelableExtra:(Ljava/lang/String;)Landroid/os/Parcelable;
        //  1004: checkcast       Landroid/os/Message;
        //  1007: astore          25
        //  1009: aload           25
        //  1011: invokestatic    com/whatsapp/messaging/e.b:(Landroid/os/Message;)I
        //  1014: bipush          56
        //  1016: if_icmpne       1023
        //  1019: aload_0        
        //  1020: invokespecial   com/whatsapp/VoiceService.u:()V
        //  1023: aload           25
        //  1025: aload_1        
        //  1026: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //  1029: sipush          180
        //  1032: aaload         
        //  1033: invokevirtual   android/content/Intent.getParcelableExtra:(Ljava/lang/String;)Landroid/os/Parcelable;
        //  1036: putfield        android/os/Message.obj:Ljava/lang/Object;
        //  1039: aload_0        
        //  1040: getfield        com/whatsapp/VoiceService.J:Lcom/whatsapp/aln;
        //  1043: iconst_1       
        //  1044: aload           25
        //  1046: invokevirtual   com/whatsapp/aln.obtainMessage:(ILjava/lang/Object;)Landroid/os/Message;
        //  1049: invokevirtual   android/os/Message.sendToTarget:()V
        //  1052: iload           4
        //  1054: ifeq            314
        //  1057: aload_0        
        //  1058: invokevirtual   com/whatsapp/VoiceService.C:()V
        //  1061: iload           4
        //  1063: ifeq            314
        //  1066: aload_0        
        //  1067: aload_1        
        //  1068: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //  1071: sipush          178
        //  1074: aaload         
        //  1075: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //  1078: invokevirtual   com/whatsapp/VoiceService.c:(Ljava/lang/String;)V
        //  1081: iload           4
        //  1083: ifeq            314
        //  1086: aload_0        
        //  1087: invokespecial   com/whatsapp/VoiceService.v:()Landroid/app/Notification;
        //  1090: astore          18
        //  1092: aload           18
        //  1094: ifnull          314
        //  1097: aload_0        
        //  1098: ldc_w           2131755041
        //  1101: aload           18
        //  1103: invokevirtual   com/whatsapp/VoiceService.startForeground:(ILandroid/app/Notification;)V
        //  1106: iload           4
        //  1108: ifeq            314
        //  1111: goto            304
        //  1114: dload           28
        //  1116: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  1119: astore          30
        //  1121: goto            585
        //  1124: astore          32
        //  1126: aload           32
        //  1128: athrow         
        //  1129: iconst_0       
        //  1130: istore          34
        //  1132: goto            622
        //  1135: astore          35
        //  1137: aload           35
        //  1139: athrow         
        //  1140: astore          36
        //  1142: aload           36
        //  1144: athrow         
        //  1145: astore          37
        //  1147: aload           37
        //  1149: athrow         
        //  1150: astore          38
        //  1152: aload           38
        //  1154: athrow         
        //  1155: astore          39
        //  1157: aload           39
        //  1159: athrow         
        //  1160: astore          51
        //  1162: aload           51
        //  1164: athrow         
        //  1165: astore          26
        //  1167: aload           26
        //  1169: athrow         
        //  1170: astore          23
        //  1172: aload           23
        //  1174: athrow         
        //  1175: astore          19
        //  1177: aload           19
        //  1179: athrow         
        //  1180: astore          22
        //  1182: aload           22
        //  1184: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  9      30     32     37     Ljava/lang/IllegalArgumentException;
        //  43     98     125    130    Ljava/lang/IllegalArgumentException;
        //  103    123    125    130    Ljava/lang/IllegalArgumentException;
        //  130    136    187    192    Ljava/lang/IllegalArgumentException;
        //  141    155    192    197    Ljava/lang/IllegalArgumentException;
        //  160    185    197    202    Ljava/lang/IllegalArgumentException;
        //  189    192    192    197    Ljava/lang/IllegalArgumentException;
        //  194    197    197    202    Ljava/lang/IllegalArgumentException;
        //  210    217    520    525    Ljava/lang/IllegalArgumentException;
        //  304    314    1175   1180   Ljava/lang/IllegalArgumentException;
        //  322    385    1180   1185   Ljava/lang/IllegalArgumentException;
        //  387    401    520    525    Ljava/lang/IllegalArgumentException;
        //  414    428    525    530    Ljava/lang/IllegalArgumentException;
        //  441    455    530    535    Ljava/lang/IllegalArgumentException;
        //  468    482    535    540    Ljava/lang/IllegalArgumentException;
        //  495    509    540    545    Ljava/lang/IllegalArgumentException;
        //  607    614    1124   1129   Ljava/lang/IllegalArgumentException;
        //  622    634    1135   1140   Ljava/lang/IllegalArgumentException;
        //  639    669    1140   1145   Ljava/lang/IllegalArgumentException;
        //  674    679    1145   1150   Ljava/lang/IllegalArgumentException;
        //  684    690    1150   1155   Ljava/lang/IllegalArgumentException;
        //  695    725    1155   1160   Ljava/lang/IllegalArgumentException;
        //  730    760    1155   1160   Ljava/lang/IllegalArgumentException;
        //  972    981    1160   1165   Ljava/lang/IllegalArgumentException;
        //  1009   1023   1165   1170   Ljava/lang/IllegalArgumentException;
        //  1023   1052   1170   1175   Ljava/lang/IllegalArgumentException;
        //  1057   1061   1170   1175   Ljava/lang/IllegalArgumentException;
        //  1097   1106   1175   1180   Ljava/lang/IllegalArgumentException;
        //  1137   1140   1140   1145   Ljava/lang/IllegalArgumentException;
        //  1142   1145   1145   1150   Ljava/lang/IllegalArgumentException;
        //  1147   1150   1150   1155   Ljava/lang/IllegalArgumentException;
        //  1152   1155   1155   1160   Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 506, Size: 506
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
    
    public boolean p() {
        return this.L;
    }
    
    public boolean s() {
        return this.j;
    }
    
    public boolean t() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/os/Build$VERSION.SDK_INT:I
        //     3: istore_2       
        //     4: iload_2        
        //     5: bipush          8
        //     7: if_icmpge       12
        //    10: iconst_0       
        //    11: ireturn        
        //    12: aload_0        
        //    13: getfield        com/whatsapp/VoiceService.G:Landroid/bluetooth/BluetoothAdapter;
        //    16: ifnull          10
        //    19: aload_0        
        //    20: getfield        com/whatsapp/VoiceService.G:Landroid/bluetooth/BluetoothAdapter;
        //    23: invokevirtual   android/bluetooth/BluetoothAdapter.isEnabled:()Z
        //    26: istore          4
        //    28: iload           4
        //    30: ifeq            10
        //    33: aload_0        
        //    34: getstatic       com/whatsapp/VoiceService.Z:[Ljava/lang/String;
        //    37: bipush          53
        //    39: aaload         
        //    40: invokevirtual   com/whatsapp/VoiceService.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    43: checkcast       Landroid/media/AudioManager;
        //    46: astore          5
        //    48: aload           5
        //    50: invokevirtual   android/media/AudioManager.isBluetoothScoAvailableOffCall:()Z
        //    53: istore          6
        //    55: iload           6
        //    57: ifeq            10
        //    60: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    63: bipush          11
        //    65: if_icmplt       135
        //    68: aload_0        
        //    69: getfield        com/whatsapp/VoiceService.a:Landroid/bluetooth/BluetoothHeadset;
        //    72: astore          13
        //    74: aload           13
        //    76: ifnull          129
        //    79: aload_0        
        //    80: getfield        com/whatsapp/VoiceService.a:Landroid/bluetooth/BluetoothHeadset;
        //    83: invokevirtual   android/bluetooth/BluetoothHeadset.getConnectedDevices:()Ljava/util/List;
        //    86: invokeinterface java/util/List.isEmpty:()Z
        //    91: istore          15
        //    93: iload           15
        //    95: ifne            129
        //    98: iconst_1       
        //    99: istore          14
        //   101: iload           14
        //   103: ireturn        
        //   104: astore_3       
        //   105: aload_3        
        //   106: athrow         
        //   107: astore_1       
        //   108: aload_1        
        //   109: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   112: iconst_0       
        //   113: ireturn        
        //   114: astore          7
        //   116: aload           7
        //   118: athrow         
        //   119: astore          8
        //   121: aload           8
        //   123: athrow         
        //   124: astore          9
        //   126: aload           9
        //   128: athrow         
        //   129: iconst_0       
        //   130: istore          14
        //   132: goto            101
        //   135: aload           5
        //   137: invokevirtual   android/media/AudioManager.isBluetoothScoOn:()Z
        //   140: ifne            155
        //   143: aload           5
        //   145: invokevirtual   android/media/AudioManager.isBluetoothA2dpOn:()Z
        //   148: istore          12
        //   150: iload           12
        //   152: ifeq            10
        //   155: iconst_1       
        //   156: ireturn        
        //   157: astore          10
        //   159: aload           10
        //   161: athrow         
        //   162: astore          11
        //   164: aload           11
        //   166: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      4      107    114    Ljava/lang/Exception;
        //  12     28     104    107    Ljava/lang/Exception;
        //  33     55     107    114    Ljava/lang/Exception;
        //  60     74     114    119    Ljava/lang/Exception;
        //  79     93     119    129    Ljava/lang/Exception;
        //  105    107    107    114    Ljava/lang/Exception;
        //  116    119    119    129    Ljava/lang/Exception;
        //  121    124    124    129    Ljava/lang/Exception;
        //  126    129    107    114    Ljava/lang/Exception;
        //  135    150    157    167    Ljava/lang/Exception;
        //  159    162    162    167    Ljava/lang/Exception;
        //  164    167    107    114    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 83, Size: 83
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
    
    public void w() {
        this.c((String)null);
    }
    
    public boolean z() {
        return this.k;
    }
}
