// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.os.IBinder;
import android.support.annotation.Nullable;
import java.util.Calendar;
import android.support.annotation.NonNull;
import java.util.List;
import android.os.Environment;
import android.content.SharedPreferences$Editor;
import com.whatsapp.util.Log;
import android.content.Context;
import com.whatsapp.App;
import com.whatsapp.t1;
import com.whatsapp.qf;
import com.whatsapp.ym;
import java.util.concurrent.CountDownLatch;
import com.whatsapp.fieldstats.bd;
import android.content.Intent;
import com.whatsapp.fieldstats.bv;
import java.util.concurrent.atomic.AtomicLong;
import android.content.SharedPreferences;
import java.util.concurrent.atomic.AtomicBoolean;
import java.io.File;
import android.os.ConditionVariable;
import android.app.IntentService;

public final class GoogleDriveService extends IntentService
{
    private static final ConditionVariable A;
    private static int C;
    static final File D;
    private static int E;
    public static int F;
    private static boolean G;
    private static boolean H;
    private static final ConditionVariable I;
    private static final String J;
    private static final ConditionVariable K;
    private static boolean S;
    private static final ConditionVariable U;
    private static final ConditionVariable V;
    private static final long W;
    private static boolean Y;
    private static final AtomicBoolean a;
    private static final File[] aa;
    private static final String[] bb;
    private static int c;
    private static boolean f;
    private static boolean h;
    private static final ConditionVariable j;
    private static boolean m;
    private static final Object n;
    private static SharedPreferences o;
    private static boolean p;
    @ct
    private static int q;
    private static boolean s;
    private static final AtomicBoolean t;
    private static final Object u;
    private static final AtomicBoolean v;
    private static final File w;
    private static boolean x;
    private static final ConditionVariable z;
    private String B;
    private q L;
    private final AtomicLong M;
    private long N;
    private bv O;
    private bq P;
    private long Q;
    private final AtomicLong R;
    private final AtomicLong T;
    private Intent X;
    private final aq Z;
    private boolean ab;
    private long b;
    private ae d;
    private final AtomicBoolean e;
    private String g;
    private bd i;
    private String k;
    private final AtomicLong l;
    private CountDownLatch r;
    private final bw y;
    
    static {
        final String[] bb2 = new String[330];
        String s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0011B*5s\u001e\f-8b\u0017Q6#f\u0006\u000e $\u007f\u0004Fi7f\u001b";
        int n2 = -1;
        String[] array = bb2;
        int n3 = 0;
        String intern = null;
    Label_8892:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n4 = 0; i > n4; ++n4) {
                final char c = charArray[n4];
                char c2 = '\0';
                switch (n4 % 5) {
                    default: {
                        c2 = '\u0016';
                        break;
                    }
                    case 0: {
                        c2 = 'r';
                        break;
                    }
                    case 1: {
                        c2 = '#';
                        break;
                    }
                    case 2: {
                        c2 = 'D';
                        break;
                    }
                    case 3: {
                        c2 = 'V';
                        break;
                    }
                }
                charArray[n4] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n2) {
                default: {
                    array[n3] = intern;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0016Q- s_B4?9\u001cV(:";
                    n3 = 1;
                    array = bb2;
                    n2 = 0;
                    continue;
                }
                case 0: {
                    array[n3] = intern;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0011B*5s\u001e\f*9b\u001aJ*1;\u0006Li5w\u001c@!:";
                    n3 = 2;
                    array = bb2;
                    n2 = 1;
                    continue;
                }
                case 1: {
                    array[n3] = intern;
                    s = "\u0015G6?`\u0017|%:d\u0017B /I\u0007S(9w\u0016F \tt\u000bW!%";
                    n3 = 3;
                    array = bb2;
                    n2 = 2;
                    continue;
                }
                case 2: {
                    array[n3] = intern;
                    s = "\u0015G6?`\u0017|&7u\u0019V4\te\u0006B6\"I\u0006J)3e\u0006B)&";
                    n3 = 4;
                    array = bb2;
                    n2 = 3;
                    continue;
                }
                case 3: {
                    array[n3] = intern;
                    n3 = 5;
                    array = bb2;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0011O!7x\u0007Si7p\u0006F6{t\u0013@/#fRE%?z\u0017Gd\"yR@+;{\u001bWj";
                    n2 = 4;
                    continue;
                }
                case 4: {
                    array[n3] = intern;
                    n3 = 6;
                    s = "\u0015G6?`\u0017|1%s\u0000|-8\u007f\u0006J%\"s\u0016|&7u\u0019V4";
                    n2 = 5;
                    array = bb2;
                    continue;
                }
                case 5: {
                    array[n3] = intern;
                    n3 = 7;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0010B0\"s\u0000Zi!w\u001bWk4w\u0011H1&6J\u0015pf&RP!5y\u001cG7z6\u0015J2?x\u0015\u00031&6\u001cL3x";
                    n2 = 6;
                    array = bb2;
                    continue;
                }
                case 6: {
                    array[n3] = intern;
                    n3 = 8;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0010B0\"s\u0000Zi!w\u001bWk;s\u0016J%{d\u0017P09d\u0017\u0003|`\"B\u0013d%s\u0011L*2e^\u0003#?`\u001bM#vc\u0002\u0003*9a\\";
                    n2 = 7;
                    array = bb2;
                    continue;
                }
                case 7: {
                    array[n3] = intern;
                    n3 = 9;
                    s = "\u0007M)9c\u001cW!2";
                    n2 = 8;
                    array = bb2;
                    continue;
                }
                case 8: {
                    array[n3] = intern;
                    n3 = 10;
                    s = "\u0007M)9c\u001cW!2";
                    n2 = 9;
                    array = bb2;
                    continue;
                }
                case 9: {
                    array[n3] = intern;
                    n3 = 11;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001F0{t\u0013@/#f_E63gRV*7t\u001eFd\"yR@+;{\u001bW";
                    n2 = 10;
                    array = bb2;
                    continue;
                }
                case 10: {
                    array[n3] = intern;
                    n3 = 12;
                    s = "\u0015G6?`\u0017|1%s\u0000|-8\u007f\u0006J%\"s\u0016|&7u\u0019V4";
                    n2 = 11;
                    array = bb2;
                    continue;
                }
                case 11: {
                    array[n3] = intern;
                    n3 = 13;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0000F7\"y\u0000Fd5w\u001cM+\"6\u0001W%$bRQ!%b\u001dQ!z6\u0010B'=c\u0002\u0003-86\u0002Q+1d\u0017P7x";
                    n2 = 12;
                    array = bb2;
                    continue;
                }
                case 12: {
                    array[n3] = intern;
                    n3 = 14;
                    s = "P\u0003l!~\u001bO!vz\u001dL/?x\u0015\u0003-86\u0006K!vu\u0013@,36\u001dEd%\u007f\bF~v";
                    n2 = 13;
                    array = bb2;
                    continue;
                }
                case 13: {
                    array[n3] = intern;
                    n3 = 15;
                    s = "RJ*v";
                    n2 = 14;
                    array = bb2;
                    continue;
                }
                case 14: {
                    array[n3] = intern;
                    n3 = 16;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0000F7\"y\u0000Fd0w\u001bO!26\u0006Ld$s\u0001W+$sRG%\"w\u0010B738";
                    n2 = 15;
                    array = bb2;
                    continue;
                }
                case 15: {
                    array[n3] = intern;
                    n3 = 17;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0000F7\"y\u0000Fd#x\u0013A(36\u0006Ld0s\u0006@,vz\u001bP0vy\u0014\u0003\"?z\u0017Pd?xRA%%sRE+:r\u0017Qj";
                    n2 = 16;
                    array = bb2;
                    continue;
                }
                case 16: {
                    array[n3] = intern;
                    n3 = 18;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0000F7\"y\u0000Fd;T\u0013P!\u0010y\u001eG!$_\u0016\u0003-%6\u001cV(::RB&9d\u0006J*16\u0000F7\"y\u0000Fj";
                    n2 = 17;
                    array = bb2;
                    continue;
                }
                case 17: {
                    array[n3] = intern;
                    n3 = 19;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0000F7\"y\u0000Fd!s\u001bQ ve\u001bW17b\u001bL*z6\u001cLd;s\u0001P%1sRA%5}\u0007Sd0\u007f\u001eFd0y\u0007M vp\u001dQd&w\u0006Kdt";
                    n2 = 18;
                    array = bb2;
                    continue;
                }
                case 18: {
                    array[n3] = intern;
                    n3 = 20;
                    s = "P\u0003-86\u001fa%%s4L(2s\u0000j v4";
                    n2 = 19;
                    array = bb2;
                    continue;
                }
                case 19: {
                    array[n3] = intern;
                    n3 = 21;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0000F7\"y\u0000Fd8c\u001fA!$6\u001dEd0\u007f\u001eF7l6";
                    n2 = 20;
                    array = bb2;
                    continue;
                }
                case 20: {
                    array[n3] = intern;
                    n3 = 22;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0015F0{t\u0013@/#f_M!\"a\u001dQ/{e\u0017W0?x\u0015P";
                    n2 = 21;
                    array = bb2;
                    continue;
                }
                case 21: {
                    array[n3] = intern;
                    n3 = 23;
                    s = "\u001bM03d\u0014B'3I\u0015G6?`\u0017|&7u\u0019V4\tx\u0017W39d\u0019|73b\u0006J*1";
                    n2 = 22;
                    array = bb2;
                    continue;
                }
                case 22: {
                    array[n3] = intern;
                    n3 = 24;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001F0{r\u0000J23;\u0001W%\"sRV*7t\u001eFd\"yR@+;{\u001bWd1y\u001dD(36\u0016Q- sRP07b\u0017\u0003096\u0001K%$s\u0016\u00034$s\u0014P";
                    n2 = 23;
                    array = bb2;
                    continue;
                }
                case 23: {
                    array[n3] = intern;
                    n3 = 25;
                    s = "\u0015G6?`\u0017|7\"w\u0006F";
                    n2 = 24;
                    array = bb2;
                    continue;
                }
                case 24: {
                    array[n3] = intern;
                    n3 = 26;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001fB6=;\u0010B'=c\u0002\u000e%%;\u0011L)&z\u0017W!yp\u0013J(3r]";
                    n2 = 25;
                    array = bb2;
                    continue;
                }
                case 25: {
                    array[n3] = intern;
                    n3 = 27;
                    s = "\u001bM'9{\u0002O!\"s-A%5}\u0007S\u001b;w\u0000H!$";
                    n2 = 26;
                    array = bb2;
                    continue;
                }
                case 26: {
                    array[n3] = intern;
                    n3 = 28;
                    s = "\u0015G6?`\u0017|%:d\u0017B /I\u0016L38z\u001dB 3r-A=\"s\u0001";
                    n2 = 27;
                    array = bb2;
                    continue;
                }
                case 27: {
                    array[n3] = intern;
                    n3 = 29;
                    s = "\u0015G6?`\u0017|1%s\u0000|-8\u007f\u0006J%\"s\u0016|&7u\u0019V4";
                    n2 = 28;
                    array = bb2;
                    continue;
                }
                case 28: {
                    array[n3] = intern;
                    n3 = 30;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001F0{t\u0013@/#f_M!\"a\u001dQ/{e\u0017W0?x\u0015\u000318w\u0010O!vb\u001d\u0003'9{\u001fJ0";
                    n2 = 29;
                    array = bb2;
                    continue;
                }
                case 29: {
                    array[n3] = intern;
                    n3 = 31;
                    s = "\u001bM03d\u0014B'3I\u0015G6?`\u0017|&7u\u0019V4\tx\u0017W39d\u0019|73b\u0006J*1";
                    n2 = 30;
                    array = bb2;
                    continue;
                }
                case 30: {
                    array[n3] = intern;
                    n3 = 32;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001F0{t\u0013@/#f_M!\"a\u001dQ/{e\u0017W0?x\u0015\f-8u\u001dQ63u\u0006\u000e27z\u0007Fk";
                    n2 = 31;
                    array = bb2;
                    continue;
                }
                case 31: {
                    array[n3] = intern;
                    n3 = 33;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001F0{q\u0016Q- s_E-:s_N%&6\u001fd $\u007f\u0004F\u0002?z\u0017n%&6\u001bPd8y\u0006\u0003*#z\u001e\u0003%8rRBd8s\u0005\u0003#2d\u001bU!\u0010\u007f\u001eF\t7fRJ7vt\u0017J*16\u0013P7?q\u001cF z6\u0006K-%6\u001bPd#x\u0017[43u\u0006F v>\u0006K+#q\u001a\u0003*9bRE%\"w\u001e\nj";
                    n2 = 32;
                    array = bb2;
                    continue;
                }
                case 32: {
                    array[n3] = intern;
                    n3 = 34;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001F0{t\u0013P!{p\u001dO 3d_J v{0B73P\u001dO 3d;Gd?eRM+\"6\u001cV(:6\u0013M vwRM!!6\u0010B73P\u001dO 3d;Gd?eRA!?x\u0015\u0003%%e\u001bD*3r^\u00030>\u007f\u0001\u0003-%6\u0007M!.f\u0017@03rR\u000b0>y\u0007D,vx\u001dWd0w\u0006B(\u007f8";
                    n2 = 33;
                    array = bb2;
                    continue;
                }
                case 33: {
                    array[n3] = intern;
                    n3 = 35;
                    s = "\u0013@0?y\u001c|63e\u0006L63I\u001fF ?w";
                    n2 = 34;
                    array = bb2;
                    continue;
                }
                case 34: {
                    array[n3] = intern;
                    n3 = 36;
                    s = "\u0015G6?`\u0017|(7e\u0006|7#u\u0011F7%p\u0007O\u001b4w\u0011H1&I\u0006L07z-P-,sH";
                    n2 = 35;
                    array = bb2;
                    continue;
                }
                case 35: {
                    array[n3] = intern;
                    n3 = 37;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0015F0{b\u001dW%:;\u0010B'=c\u0002\u000e7?l\u0017\u0003%5u\u001dV*\"x\u0013N!v\u007f\u0001\u0003*#z\u001e";
                    n2 = 36;
                    array = bb2;
                    continue;
                }
                case 36: {
                    array[n3] = intern;
                    n3 = 38;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0000F##z\u0013Qi4w\u0011H1&9\u0014Q!'c\u0017M'/9\u001fB*#w\u001e";
                    n2 = 37;
                    array = bb2;
                    continue;
                }
                case 37: {
                    array[n3] = intern;
                    n3 = 39;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0000F##z\u0013Qi4w\u0011H1&9\u0014Q!'c\u0017M'/9\u001cL*3";
                    n2 = 38;
                    array = bb2;
                    continue;
                }
                case 38: {
                    array[n3] = intern;
                    n3 = 40;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0000F##z\u0013Qi4w\u0011H1&9\u0014Q!'c\u0017M'/9\u0005F!=z\u000b\u0003-\"eRM+\"6E\u0003 7o\u0001\u00037?x\u0011Fd\"~\u0017\u0003(7e\u0006\u00037#u\u0011F7%p\u0007Od4w\u0011H1&8";
                    n2 = 39;
                    array = bb2;
                    continue;
                }
                case 39: {
                    array[n3] = intern;
                    n3 = 41;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0000F##z\u0013Qi4w\u0011H1&6\u0014Q!'c\u0017M'/6\u001aB7vc\u001cF<&s\u0011W!26\u0004B(#sH\u0003";
                    n2 = 40;
                    array = bb2;
                    continue;
                }
                case 40: {
                    array[n3] = intern;
                    n3 = 42;
                    s = "^\u0003*96\u0013V096\u0010B'=c\u0002Pd!\u007f\u001eOd4sRS!$p\u001dQ)3r\\";
                    n2 = 41;
                    array = bb2;
                    continue;
                }
                case 41: {
                    array[n3] = intern;
                    n3 = 43;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0000F##z\u0013Qi4w\u0011H1&9\u0014Q!'c\u0017M'/9\u001fL*\"~\u001eZd?b\u0001\u0003*9bRL*36\u001fL*\"~RP-8u\u0017\u00030>sRO%%bRP15u\u0017P70c\u001e\u0003&7u\u0019V4x";
                    n2 = 42;
                    array = bb2;
                    continue;
                }
                case 42: {
                    array[n3] = intern;
                    n3 = 44;
                    s = "\u001bM'9{\u0002O!\"s-A%5}\u0007S\u001b;w\u0000H!$";
                    n2 = 43;
                    array = bb2;
                    continue;
                }
                case 43: {
                    array[n3] = intern;
                    n3 = 45;
                    s = "\u0015G6?`\u0017|\"?z\u0017|)7f";
                    n2 = 44;
                    array = bb2;
                    continue;
                }
                case 44: {
                    array[n3] = intern;
                    n3 = 46;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0015F0{p\u001bO!{\u007f\u0016\u0003#2d\u001bU!vp\u001bO!v{\u0013Sd?eRM1:z\\";
                    n2 = 45;
                    array = bb2;
                    continue;
                }
                case 45: {
                    array[n3] = intern;
                    n3 = 47;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0015F0{p\u001bO!{\u007f\u0016\u000318w\u0010O!vb\u001d\u0003#3bRQ!%6\u001bGd0y\u0000\u0003";
                    n2 = 46;
                    array = bb2;
                    continue;
                }
                case 46: {
                    array[n3] = intern;
                    n3 = 48;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0015F0{p\u001bO!{\u007f\u0016\u0003\"?z\u0017v4:y\u0013G\u00147b\u001a\u00037>y\u0007O vx\u001dWd4sRM1:z\\";
                    n2 = 47;
                    array = bb2;
                    continue;
                }
                case 47: {
                    array[n3] = intern;
                    n3 = 49;
                    s = "\u001bM03d\u0014B'3I\u0015G6?`\u0017|&7u\u0019V4\tp\u0000F5#s\u001c@=";
                    n2 = 48;
                    array = bb2;
                    continue;
                }
                case 48: {
                    array[n3] = intern;
                    n3 = 50;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0015F0{t\u0013@/#f_E63g";
                    n2 = 49;
                    array = bb2;
                    continue;
                }
                case 49: {
                    array[n3] = intern;
                    n3 = 51;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001cF0!y\u0000Hi!w\u001bWk;s\u0016J%{d\u0017P09d\u0017\u0003|`\"B\u0013d%s\u0011L*2e^\u0003#?`\u001bM#vc\u0002\u0003*9a\\";
                    n2 = 50;
                    array = bb2;
                    continue;
                }
                case 50: {
                    array[n3] = intern;
                    n3 = 52;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001cF0!y\u0000Hi!w\u001bWk;s\u0001P%1s_Q!%b\u001dQ!v.D\u0017tf6\u0001F'9x\u0016Phvq\u001bU-8qRV4vx\u001dTj";
                    n2 = 51;
                    array = bb2;
                    continue;
                }
                case 51: {
                    array[n3] = intern;
                    n3 = 53;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001cF0!y\u0000Hi!w\u001bWk4w\u0011H1&6J\u0015pf&RP!5y\u001cG7z6\u0015J2?x\u0015\u00031&6\u001cL3x";
                    n2 = 52;
                    array = bb2;
                    continue;
                }
                case 52: {
                    array[n3] = intern;
                    n3 = 54;
                    s = "\u001fL18b\u0017G";
                    n2 = 53;
                    array = bb2;
                    continue;
                }
                case 53: {
                    array[n3] = intern;
                    n3 = 55;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0006Q-1q\u0017Qi8y\u0006K-8q";
                    n2 = 54;
                    array = bb2;
                    continue;
                }
                case 54: {
                    array[n3] = intern;
                    n3 = 56;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0006Q-1q\u0017Qi&s\u001cG-8q_A%5}\u0007S";
                    n2 = 55;
                    array = bb2;
                    continue;
                }
                case 55: {
                    array[n3] = intern;
                    n3 = 57;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0006Q-1q\u0017Qi&s\u001cG-8q_N!2\u007f\u0013\u000e63e\u0006L63";
                    n2 = 56;
                    array = bb2;
                    continue;
                }
                case 56: {
                    array[n3] = intern;
                    n3 = 58;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0015F0{p\u001bO!%;\u0006Li4s_G+!x\u001eL%2s\u0016\u0003";
                    n2 = 57;
                    array = bb2;
                    continue;
                }
                case 57: {
                    array[n3] = intern;
                    n3 = 59;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0015F0{p\u001bO!%;\u0006Li4s_G+!x\u001eL%2s\u0016\u000337\u007f\u0006J*16\u0014L6vw\u001eOd0\u007f\u001eF7vb\u001d\u0003&36\u0002Q+5s\u0001P!28";
                    n2 = 58;
                    array = bb2;
                    continue;
                }
                case 58: {
                    array[n3] = intern;
                    n3 = 60;
                    s = "\u0015G6?`\u0017|&7u\u0019V4\te\u0006B6\"I\u0006J)3e\u0006B)&";
                    n2 = 59;
                    array = bb2;
                    continue;
                }
                case 59: {
                    array[n3] = intern;
                    n3 = 61;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001F0{t\u0013@/#f_P07d\u0006\u000e0?{\u0017P07{\u0002\u000318w\u0010O!vb\u001d\u0003'9{\u001fJ0vt\u0013@/#fRP07d\u0006\u00030?{\u0017P07{\u0002\u0003096\u0001K%$s\u0016\u00034$s\u0014P";
                    n2 = 60;
                    array = bb2;
                    continue;
                }
                case 60: {
                    array[n3] = intern;
                    n3 = 62;
                    s = "\u0015G6?`\u0017|%:d\u0017B /I\u0016L38z\u001dB 3r-A=\"s\u0001";
                    n2 = 61;
                    array = bb2;
                    continue;
                }
                case 61: {
                    array[n3] = intern;
                    n3 = 63;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001F0{w\u001eQ!7r\u000b\u000e 9a\u001cO+7r\u0017Gi4o\u0006F7vp\u0013J(3rRW+vu\u001dN)?b\\";
                    n2 = 62;
                    array = bb2;
                    continue;
                }
                case 62: {
                    array[n3] = intern;
                    n3 = 64;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0vt\u0013P!vp\u001dO 3dRM%;sRJ7vx\u0007O(z6\u0014B07zRF6$y\u0000\r";
                    n2 = 63;
                    array = bb2;
                    continue;
                }
                case 63: {
                    array[n3] = intern;
                    n3 = 65;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0";
                    n2 = 64;
                    array = bb2;
                    continue;
                }
                case 64: {
                    array[n3] = intern;
                    n3 = 66;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0vr\u0017O!\"s3O(\u0010\u007f\u001eF7vp\u0013J(3rRW3?u\u0017\r";
                    n2 = 65;
                    array = bb2;
                    continue;
                }
                case 65: {
                    array[n3] = intern;
                    n3 = 67;
                    s = "\u0013@0?y\u001c|'>w\u001cD!\tx\u0007N&3d";
                    n2 = 66;
                    array = bb2;
                    continue;
                }
                case 66: {
                    array[n3] = intern;
                    n3 = 68;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0";
                    n2 = 67;
                    array = bb2;
                    continue;
                }
                case 67: {
                    array[n3] = intern;
                    n3 = 69;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0vw\u0011@+#x\u0006m%;sRJ7vx\u0007O(z6\u0011B*8y\u0006\u00034$y\u0011F!26\u0014V6\"~\u0017Qj";
                    n2 = 68;
                    array = bb2;
                    continue;
                }
                case 68: {
                    array[n3] = intern;
                    n3 = 70;
                    s = "RJ7vx\u001dWd&d\u0017P!8bRL*vb\u001aFd2s\u0004J'36\u0013M=;y\u0000Fj";
                    n2 = 69;
                    array = bb2;
                    continue;
                }
                case 69: {
                    array[n3] = intern;
                    n3 = 71;
                    s = "\u0013@0?y\u001c|63e\u0006L63I\u0015G6?`\u0017|73b\u0006J*1e";
                    n2 = 70;
                    array = bb2;
                    continue;
                }
                case 70: {
                    array[n3] = intern;
                    n3 = 72;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0vd\u0017P09d\u0017\u0003)3r\u001bBd5w\u001eO!26\u0010V0v{\u0017G-76\u0000F7\"y\u0000Fd?eRM+\"6\u0002F*2\u007f\u001cDhvd\u0017R13e\u0006\u0003-1x\u001dQ!28";
                    n2 = 71;
                    array = bb2;
                    continue;
                }
                case 71: {
                    array[n3] = intern;
                    n3 = 73;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0vs\u0000Q+$6\u001d@'#d\u0000F va\u001aJ(36\u0006Q=?x\u0015\u0003096\u0014F05~RB1\"~&L/3xRE+$6";
                    n2 = 72;
                    array = bb2;
                    continue;
                }
                case 72: {
                    array[n3] = intern;
                    n3 = 74;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0";
                    n2 = 73;
                    array = bb2;
                    continue;
                }
                case 73: {
                    array[n3] = intern;
                    n3 = 75;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0";
                    n2 = 74;
                    array = bb2;
                    continue;
                }
                case 74: {
                    array[n3] = intern;
                    n3 = 76;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0vW1w\r\u0019X-g\u0001\u001aS&fd5w\u001eO!26\u0005J0>6\u001cLd8c\u001fA!$8";
                    n2 = 75;
                    array = bb2;
                    continue;
                }
                case 75: {
                    array[n3] = intern;
                    n3 = 77;
                    s = "\u0013@0?y\u001c| 3z\u0017W!";
                    n2 = 76;
                    array = bb2;
                    continue;
                }
                case 76: {
                    array[n3] = intern;
                    n3 = 78;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0vd\u0017P09d\u0017\u0003-%6\u0013O63w\u0016Zd$c\u001cM-8q\\";
                    n2 = 77;
                    array = bb2;
                    continue;
                }
                case 77: {
                    array[n3] = intern;
                    n3 = 79;
                    s = "\u001dO \tf\u001aL*3I\u001cV)4s\u0000";
                    n2 = 78;
                    array = bb2;
                    continue;
                }
                case 78: {
                    array[n3] = intern;
                    n3 = 80;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0014L65s_A%5}\u0007Si9`\u0017Qi5s\u001eO1:w\u0000\f";
                    n2 = 79;
                    array = bb2;
                    continue;
                }
                case 79: {
                    array[n3] = intern;
                    n3 = 81;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0";
                    n2 = 80;
                    array = bb2;
                    continue;
                }
                case 80: {
                    array[n3] = intern;
                    n3 = 82;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0vw\u001cL0>s\u0000\u0003 3z\u0017W-9xRJ7vw\u001eQ!7r\u000b\u00036#x\u001cJ*18";
                    n2 = 81;
                    array = bb2;
                    continue;
                }
                case 81: {
                    array[n3] = intern;
                    n3 = 83;
                    s = "\u0006Z43";
                    n2 = 82;
                    array = bb2;
                    continue;
                }
                case 82: {
                    array[n3] = intern;
                    n3 = 84;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0";
                    n2 = 83;
                    array = bb2;
                    continue;
                }
                case 83: {
                    array[n3] = intern;
                    n3 = 85;
                    s = "\u001cF3\tf\u001aL*3I\u001cV)4s\u0000";
                    n2 = 84;
                    array = bb2;
                    continue;
                }
                case 84: {
                    array[n3] = intern;
                    n3 = 86;
                    s = "\u0013V09{\u0013W!2";
                    n2 = 85;
                    array = bb2;
                    continue;
                }
                case 85: {
                    array[n3] = intern;
                    n3 = 87;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0vu\u001aB*1sRM1;t\u0017Qd$s\u0003V!%b\u0017Gd4c\u0006\u0003+:rRS,9x\u0017\u0003*#{\u0010F6va\u0013Pd8y\u0006\u000347e\u0001F v\u007f\u001c\u00030>sRQ!'c\u0017P0x";
                    n2 = 86;
                    array = bb2;
                    continue;
                }
                case 86: {
                    array[n3] = intern;
                    n3 = 88;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0vA\u001aB0%W\u0002Sd\u001ay\u0015J*v~\u0013Pd0w\u001bO!2:RD+9q\u001eFd2d\u001bU!vt\u0013@/#fRB&9d\u0006F x";
                    n2 = 87;
                    array = bb2;
                    continue;
                }
                case 87: {
                    array[n3] = intern;
                    n3 = 89;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0vw\u001cL0>s\u0000\u0003&7u\u0019V4v\u007f\u0001\u0003%:d\u0017B /6\u0000V*8\u007f\u001cDj";
                    n2 = 88;
                    array = bb2;
                    continue;
                }
                case 88: {
                    array[n3] = intern;
                    n3 = 90;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0";
                    n2 = 89;
                    array = bb2;
                    continue;
                }
                case 89: {
                    array[n3] = intern;
                    n3 = 91;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0vw\u0011@+#x\u0006\u0003";
                    n2 = 90;
                    array = bb2;
                    continue;
                }
                case 90: {
                    array[n3] = intern;
                    n3 = 92;
                    s = "\u0007P!$I\u001bM-\"\u007f\u0013W!2";
                    n2 = 91;
                    array = bb2;
                    continue;
                }
                case 91: {
                    array[n3] = intern;
                    n3 = 93;
                    s = "\u0006Z43";
                    n2 = 92;
                    array = bb2;
                    continue;
                }
                case 92: {
                    array[n3] = intern;
                    n3 = 94;
                    s = "\u0013@0?y\u001c| 3z\u0017W!";
                    n2 = 93;
                    array = bb2;
                    continue;
                }
                case 93: {
                    array[n3] = intern;
                    n3 = 95;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0v";
                    n2 = 94;
                    array = bb2;
                    continue;
                }
                case 94: {
                    array[n3] = intern;
                    n3 = 96;
                    s = "RP15u\u0017P7?`\u0017\u0003&7u\u0019V4%6\u001aB236\u0014B-:s\u0016\u000fd\"~\u001bPd?eRS69t\u0013A(/6\u0007M1%c\u0013Oj";
                    n2 = 95;
                    array = bb2;
                    continue;
                }
                case 95: {
                    array[n3] = intern;
                    n3 = 97;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0";
                    n2 = 96;
                    array = bb2;
                    continue;
                }
                case 96: {
                    array[n3] = intern;
                    n3 = 98;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0";
                    n2 = 97;
                    array = bb2;
                    continue;
                }
                case 97: {
                    array[n3] = intern;
                    n3 = 99;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001@6#t";
                    n2 = 98;
                    array = bb2;
                    continue;
                }
                case 98: {
                    array[n3] = intern;
                    n3 = 100;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0vw\u0007W+;w\u0006F vt\u0013@/#fR@%:z\u0017Gd\"y\u001d\u0003!7d\u001eZhv\u007f\u0015M+$s\u0016\r";
                    n2 = 99;
                    array = bb2;
                    continue;
                }
                case 99: {
                    array[n3] = intern;
                    n3 = 101;
                    s = "\u0013@'9c\u001cW\u001b8w\u001fF";
                    n2 = 100;
                    array = bb2;
                    continue;
                }
                case 100: {
                    array[n3] = intern;
                    n3 = 102;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0";
                    n2 = 101;
                    array = bb2;
                    continue;
                }
                case 101: {
                    array[n3] = intern;
                    n3 = 103;
                    s = "\u0013@0?y\u001c|63e\u0006L63";
                    n2 = 102;
                    array = bb2;
                    continue;
                }
                case 102: {
                    array[n3] = intern;
                    n3 = 104;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0vu\u001aB*1sRM1;t\u0017Qd$s\u0003V!%b\u0017Gd4c\u0006\u0003*3aRS,9x\u0017\u0003*#{\u0010F6va\u0013Pd8y\u0006\u000347e\u0001F v\u007f\u001c\u00030>sRQ!'c\u0017P0x";
                    n2 = 103;
                    array = bb2;
                    continue;
                }
                case 103: {
                    array[n3] = intern;
                    n3 = 105;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0";
                    n2 = 104;
                    array = bb2;
                    continue;
                }
                case 104: {
                    array[n3] = intern;
                    n3 = 106;
                    s = "\u0013@0?y\u001c| 3z\u0017W!";
                    n2 = 105;
                    array = bb2;
                    continue;
                }
                case 105: {
                    array[n3] = intern;
                    n3 = 107;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0ve\u0006B6\"s\u0016\u00033?b\u001aL1\"6\u0013Md7u\u0006J+88";
                    n2 = 106;
                    array = bb2;
                    continue;
                }
                case 106: {
                    array[n3] = intern;
                    n3 = 108;
                    s = "\u0013@0?y\u001c|&7u\u0019V4";
                    n2 = 107;
                    array = bb2;
                    continue;
                }
                case 107: {
                    array[n3] = intern;
                    n3 = 109;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0ve\u0006B6\"s\u0016\u00033?b\u001aL1\"6\u0013Md7u\u0006J+88";
                    n2 = 108;
                    array = bb2;
                    continue;
                }
                case 108: {
                    array[n3] = intern;
                    n3 = 110;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0vu\u0013M*9bRP07d\u0006\u0003&7u\u0019V4z6\u001fF ?wRQ!%b\u001dQ!v\u007f\u001c\u000343x\u0016J*18";
                    n2 = 109;
                    array = bb2;
                    continue;
                }
                case 109: {
                    array[n3] = intern;
                    n3 = 111;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0vw\u0011@+#x\u0006m%;sRJ7vx\u0007O(v+L\u00031%s\u0000\u0003,7eRM! s\u0000\u0003'9x\u0014J##d\u0017Gd\u0011y\u001dD(366Q- sRA%5}\u0007Sdvw\u001cGd?eRM+!6\u0016F(3b\u001bM#vA\u001aB0%W\u0002Sd7u\u0011L18b^\u0003*9b\u001aJ*16\u0006Ld2s\u001eF038";
                    n2 = 110;
                    array = bb2;
                    continue;
                }
                case 110: {
                    array[n3] = intern;
                    n3 = 112;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0";
                    n2 = 111;
                    array = bb2;
                    continue;
                }
                case 111: {
                    array[n3] = intern;
                    n3 = 113;
                    s = "\u0013@0?y\u001c|63e\u0006L63I\u001fF ?w";
                    n2 = 112;
                    array = bb2;
                    continue;
                }
                case 112: {
                    array[n3] = intern;
                    n3 = 114;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0vd\u0017P09d\u0017\u0003-%6\u0013O63w\u0016Zd$c\u001cM-8q\\";
                    n2 = 113;
                    array = bb2;
                    continue;
                }
                case 113: {
                    array[n3] = intern;
                    n3 = 115;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0vr\u0017O!\"s3O(\u0010\u007f\u001eF7ve\u0007@'3s\u0016F v\u007f\u001c\u0003\"?d\u0001Wd7b\u0006F)&b\\";
                    n2 = 114;
                    array = bb2;
                    continue;
                }
                case 114: {
                    array[n3] = intern;
                    n3 = 116;
                    s = "\u0018J ";
                    n2 = 115;
                    array = bb2;
                    continue;
                }
                case 115: {
                    array[n3] = intern;
                    n3 = 117;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0";
                    n2 = 116;
                    array = bb2;
                    continue;
                }
                case 116: {
                    array[n3] = intern;
                    n3 = 118;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0vr\u0017O!\"s3O(\u0010\u007f\u001eF7vp\u0013J(3rRL*5sRA1\"6\u0001V'5s\u0017G!26\u0001F'9x\u0016\u00030?{\u0017\r";
                    n2 = 117;
                    array = bb2;
                    continue;
                }
                case 117: {
                    array[n3] = intern;
                    n3 = 119;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8bRB'\"\u007f\u001dMd?eR";
                    n2 = 118;
                    array = bb2;
                    continue;
                }
                case 118: {
                    array[n3] = intern;
                    n3 = 120;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001aB*2z\u0017\u000e-8b\u0017M0vW1w\r\u0019X-a\u0005\u0015]'sd5w\u001eO!28";
                    n2 = 119;
                    array = bb2;
                    continue;
                }
                case 119: {
                    array[n3] = intern;
                    n3 = 121;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0000F7\"y\u0000Fi%s\u0006W-8q\u0001\u000318w\u0010O!vb\u001d\u0003'9{\u001fJ0vq\u0016Q- sRP!\"b\u001bM#%6\u0006Ld%~\u0013Q!26\u0002Q!0e";
                    n2 = 120;
                    array = bb2;
                    continue;
                }
                case 120: {
                    array[n3] = intern;
                    n3 = 122;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0000F7\"y\u0000Fi%s\u0006W-8q\u0001\u0003)\u0011r\u0000J23P\u001bO!\u001bw\u0002\u0003-%6\u001cV(:8";
                    n2 = 121;
                    array = bb2;
                    continue;
                }
                case 121: {
                    array[n3] = intern;
                    n3 = 123;
                    s = "\u001bM03d\u0014B'3I\u0015G6?`\u0017|&7u\u0019V4\tp\u0000F5#s\u001c@=";
                    n2 = 122;
                    array = bb2;
                    continue;
                }
                case 122: {
                    array[n3] = intern;
                    n3 = 124;
                    s = "\u001bM03d\u0014B'3I\u0015G6?`\u0017|&7u\u0019V4\tx\u0017W39d\u0019|73b\u0006J*1";
                    n2 = 123;
                    array = bb2;
                    continue;
                }
                case 123: {
                    array[n3] = intern;
                    n3 = 125;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0007S(9w\u0016";
                    n2 = 124;
                    array = bb2;
                    continue;
                }
                case 124: {
                    array[n3] = intern;
                    n3 = 126;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0007S(9w\u0016\u0003'7z\u001eF va\u001bW,vx\u0007O(vp\u001bO!\u0006w\u0006Khvc\u001cF<&s\u0011W!2";
                    n2 = 125;
                    array = bb2;
                    continue;
                }
                case 125: {
                    array[n3] = intern;
                    n3 = 127;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0007S(9w\u0016\u0003'7z\u001eF va\u001bW,vx\u0007O(vp\u001bO!\u0003f\u001eL%2F\u0013W,z6\u0007M!.f\u0017@03r";
                    n2 = 126;
                    array = bb2;
                    continue;
                }
                case 126: {
                    array[n3] = intern;
                    n3 = 128;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0007S(9w\u0016\u0003%2r\u001bM#vp\u001bO!l6";
                    n2 = 127;
                    array = bb2;
                    continue;
                }
                case 127: {
                    array[n3] = intern;
                    n3 = 129;
                    s = ")}\u0018.$B\u000e\u0018.!7~";
                    n2 = 128;
                    array = bb2;
                    continue;
                }
                case 128: {
                    array[n3] = intern;
                    n3 = 130;
                    s = "RQ!%_\u0016\u0019d";
                    n2 = 129;
                    array = bb2;
                    continue;
                }
                case 129: {
                    array[n3] = intern;
                    n3 = 131;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0016F(3b\u0017\u000e-8u\u001dN4:s\u0006Fi4w\u0011H1&;\u001bM ?u\u0013W+$eRE!\"u\u001aJ*16\u001eJ7\"6\u001dEd0\u007f\u001eF7va\u001bW,vx\u0013N!v\u007f\u001c@+;f\u001eF03I\u0010B'=c\u0002|)7d\u0019F6vd\u0017W1$x\u0017Gd8c\u001eOhvc\u001cF<&s\u0011W!28";
                    n2 = 130;
                    array = bb2;
                    continue;
                }
                case 130: {
                    array[n3] = intern;
                    n3 = 132;
                    s = "\u001bM'9{\u0002O!\"s-A%5}\u0007S\u001b;w\u0000H!$";
                    n2 = 131;
                    array = bb2;
                    continue;
                }
                case 131: {
                    array[n3] = intern;
                    n3 = 133;
                    s = "\u0007M)9c\u001cW!2";
                    n2 = 132;
                    array = bb2;
                    continue;
                }
                case 132: {
                    array[n3] = intern;
                    n3 = 134;
                    s = "\u0007M)9c\u001cW!2";
                    n2 = 133;
                    array = bb2;
                    continue;
                }
                case 133: {
                    array[n3] = intern;
                    n3 = 135;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0000F7\"y\u0000Fi0\u007f\u001eF7vs\u001cR13c\u001bM#vr\u001dT*:y\u0013Gdv";
                    n2 = 134;
                    array = bb2;
                    continue;
                }
                case 134: {
                    array[n3] = intern;
                    n3 = 136;
                    s = "R\u000b";
                    n2 = 135;
                    array = bb2;
                    continue;
                }
                case 135: {
                    array[n3] = intern;
                    n3 = 137;
                    s = "RE%?z\u0017Gm";
                    n2 = 136;
                    array = bb2;
                    continue;
                }
                case 136: {
                    array[n3] = intern;
                    n3 = 138;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0015F0{p\u001bO!%;\u0006Li4s_G+!x\u001eL%2s\u0016";
                    n2 = 137;
                    array = bb2;
                    continue;
                }
                case 137: {
                    array[n3] = intern;
                    n3 = 139;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0000F7\"y\u0000Fi0\u007f\u001eF7vb\u001aJ7ve\u0006B036\u0001K+#z\u0016\u0003,7`\u0017\u0003*3`\u0017Qd>w\u0002S!8s\u0016\r";
                    n2 = 138;
                    array = bb2;
                    continue;
                }
                case 138: {
                    array[n3] = intern;
                    n3 = 140;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0000F7\"y\u0000Fi0\u007f\u001eF7vp\u0013J(3rRW+vq\u0017Wd:\u007f\u0001Wd9pRE-:s\u0001\u0003096\u0010Fd$s\u0001W+$s\u0016\r";
                    n2 = 139;
                    array = bb2;
                    continue;
                }
                case 139: {
                    array[n3] = intern;
                    n3 = 141;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0000F7\"y\u0000Fi0\u007f\u001eF7va\u0013J0?x\u0015\u0003\"9dRB(:6\u0014J(3eRW+vt\u0017\u000363e\u0006L63r\\";
                    n2 = 140;
                    array = bb2;
                    continue;
                }
                case 140: {
                    array[n3] = intern;
                    n3 = 142;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0000F7\"y\u0000Fi0\u007f\u001eF7va\u0013J0?x\u0015\u0003\"9dRQ!%b\u001dQ!vb\u001d\u0003\"?x\u001bP,l6";
                    n2 = 141;
                    array = bb2;
                    continue;
                }
                case 141: {
                    array[n3] = intern;
                    n3 = 143;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0000F7\"y\u0000Fi0\u007f\u001eF7vq\u0016Q- s-E-:s-N%&6\u001bPd8y\u0006\u0003-8\u007f\u0006J%:\u007f\bF z6\u0007M!.f\u0017@03rRA1\"6\u001cL0vp\u0013W%:8";
                    n2 = 142;
                    array = bb2;
                    continue;
                }
                case 142: {
                    array[n3] = intern;
                    n3 = 144;
                    s = "H\u0003";
                    n2 = 143;
                    array = bb2;
                    continue;
                }
                case 143: {
                    array[n3] = intern;
                    n3 = 145;
                    s = "RB*26\u0014J(3eRJ*%\u007f\u0016Fd?b\\";
                    n2 = 144;
                    array = bb2;
                    continue;
                }
                case 144: {
                    array[n3] = intern;
                    n3 = 146;
                    s = "RB*26\u0013O(vp\u001bO!%6\u001bM7?r\u0017\u0003-\"8";
                    n2 = 145;
                    array = bb2;
                    continue;
                }
                case 145: {
                    array[n3] = intern;
                    n3 = 147;
                    s = "RB*26\u0013O(vp\u001bO!%6\u001bM7?r\u0017\u0003-\"8";
                    n2 = 146;
                    array = bb2;
                    continue;
                }
                case 146: {
                    array[n3] = intern;
                    n3 = 148;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001@6#tRE%?z\u0017Gd\"yRG!:s\u0006Fd0y\u001eG!$6";
                    n2 = 147;
                    array = bb2;
                    continue;
                }
                case 147: {
                    array[n3] = intern;
                    n3 = 149;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001@6#tRE%?z\u0017Gd\"yRG!:s\u0006Fd0y\u001eG!$6";
                    n2 = 148;
                    array = bb2;
                    continue;
                }
                case 148: {
                    array[n3] = intern;
                    n3 = 150;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001@6#tRP15u\u0017P70c\u001eO=vr\u0017O!\"s\u0016\u0003\"9z\u0016F6v";
                    n2 = 149;
                    array = bb2;
                    continue;
                }
                case 149: {
                    array[n3] = intern;
                    n3 = 151;
                    s = "\u0015G6?`\u0017|7#u\u0011F7%\u007f\u0004F\u001b4w\u0011H1&I\u0014B-:s\u0016|'9c\u001cW";
                    n2 = 150;
                    array = bb2;
                    continue;
                }
                case 150: {
                    array[n3] = intern;
                    n3 = 152;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0000F73b_A%5}\u0007Si0w\u001bO!2;\u0011L18bRV*7t\u001eFd\"yR@+;{\u001bWd4w\u0011H1&6\u0014B-:s\u0016\u0003'9c\u001cWd\"yRP,7d\u0017Gd&d\u0017E7";
                    n2 = 151;
                    array = bb2;
                    continue;
                }
                case 151: {
                    array[n3] = intern;
                    n3 = 153;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0011B*{c\u0001Fi8s\u0006T+$}]B'\"\u007f\u0004F\u001b8s\u0006T+$}]T-0\u007f";
                    n2 = 152;
                    array = bb2;
                    continue;
                }
                case 152: {
                    array[n3] = intern;
                    n3 = 154;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0011B*{c\u0001Fi8s\u0006T+$}]B'\"\u007f\u0004F\u001b8s\u0006T+$}]@!:z\u0007O%$";
                    n2 = 153;
                    array = bb2;
                    continue;
                }
                case 153: {
                    array[n3] = intern;
                    n3 = 155;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0011B*{c\u0001Fi8s\u0006T+$}]B'\"\u007f\u0004F\u001b8s\u0006T+$}]Q+7{\u001bM#";
                    n2 = 154;
                    array = bb2;
                    continue;
                }
                case 154: {
                    array[n3] = intern;
                    n3 = 156;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0011B*{c\u0001Fi8s\u0006T+$}]B'\"\u007f\u0004F\u001b8s\u0006T+$}]M+8s";
                    n2 = 155;
                    array = bb2;
                    continue;
                }
                case 155: {
                    array[n3] = intern;
                    n3 = 157;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0011B*{c\u0001Fi8s\u0006T+$}]N!2\u007f\u0013\u000e63e\u0006L639";
                    n2 = 156;
                    array = bb2;
                    continue;
                }
                case 156: {
                    array[n3] = intern;
                    n3 = 158;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0011B*{c\u0001Fi8s\u0006T+$}]A%5}\u0007Sk";
                    n2 = 157;
                    array = bb2;
                    continue;
                }
                case 157: {
                    array[n3] = intern;
                    n3 = 159;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0011B*{c\u0001Fi8s\u0006T+$}]N!%e\u0013D!{d\u0017P09d\u0017\f";
                    n2 = 158;
                    array = bb2;
                    continue;
                }
                case 158: {
                    array[n3] = intern;
                    n3 = 160;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001F0{r\u0000J23;\u0013S-v{6Q- s3S-v\u007f\u0001\u0003*9bRM1:zRB*26\u0013\u0003*3aRG6?`\u0017b4?6\u001dA.3u\u0006\u0003-%6\u0010F-8qRB7%\u007f\u0015M!2:RW,?eRJ7vc\u001cF<&s\u0011W!26ZW,9c\u0015Kd8y\u0006\u0003\"7b\u0013Omx";
                    n2 = 159;
                    array = bb2;
                    continue;
                }
                case 159: {
                    array[n3] = intern;
                    n3 = 161;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001G'7d\u0016\u000e37\u007f\u0006\u0003|`\"B\u0013d%s\u0011L*2e^\u0003#?`\u001bM#vc\u0002\u0003*9a\\";
                    n2 = 160;
                    array = bb2;
                    continue;
                }
                case 160: {
                    array[n3] = intern;
                    n3 = 162;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001@6#tRM+vt\u0013@/#fRE+#x\u0016\u000fd#x\u0017[43u\u0006F z6\u0001J*5sRP'$c\u0010\u0003-%6\u0011B(:s\u0016\u0003%0b\u0017Qd76\u0001V'5s\u0001P\"#zRA%5}\u0007Sj";
                    n2 = 161;
                    array = bb2;
                    continue;
                }
                case 161: {
                    array[n3] = intern;
                    n3 = 163;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001@6#tRP07d\u0006J*16\u001bM-\"6\u001fd $\u007f\u0004F\u0002?z\u0017n%&";
                    n2 = 162;
                    array = bb2;
                    continue;
                }
                case 162: {
                    array[n3] = intern;
                    n3 = 164;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001@6#t";
                    n2 = 163;
                    array = bb2;
                    continue;
                }
                case 163: {
                    array[n3] = intern;
                    n3 = 165;
                    s = "\u0015L+1z\u0017\u000e $\u007f\u0004Fi%s\u0000U-5s]P'$c\u0010\u0003\"?z\u0017\u0003";
                    n2 = 164;
                    array = bb2;
                    continue;
                }
                case 164: {
                    array[n3] = intern;
                    n3 = 166;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0010B'=c\u0002\u000318w\u0010O!vb\u001d\u0003-8e\u0017Q0v\u007f\u001c@+;f\u001eF036\u0010B'=c\u0002\u0003-8r\u001b@%\"y\u0000\u000fd4w\u0016\u0003&#bRM+\"6\u0014B07z\\";
                    n2 = 165;
                    array = bb2;
                    continue;
                }
                case 165: {
                    array[n3] = intern;
                    n3 = 167;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001@6#tR@%8x\u001dWd&s\u0000E+${RP'$c\u0010\u0003-06\u0010B'=c\u0002\f63e\u0006L636\u001bPd&s\u001cG-8q\\";
                    n2 = 166;
                    array = bb2;
                    continue;
                }
                case 166: {
                    array[n3] = intern;
                    n3 = 168;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001@6#tR@%8x\u001dWd&s\u0000E+${RP'$c\u0010\u00033>s\u001c\u0003-8u\u001dN4:s\u0006Fd4w\u0011H1&6\u001fB6=s\u0000\u0003-%6\u0002Q!%s\u001cWj";
                    n2 = 167;
                    array = bb2;
                    continue;
                }
                case 167: {
                    array[n3] = intern;
                    n3 = 169;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001@6#tR\u0006 vy\u0014\u0003a26\u0014J(3eRT!$sRG!:s\u0006F x";
                    n2 = 168;
                    array = bb2;
                    continue;
                }
                case 168: {
                    array[n3] = intern;
                    n3 = 170;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001@6#tR@%8x\u001dWd&s\u0000E+${RP'$c\u0010\u00033>s\u001c\u0003-8u\u001dN4:s\u0006Fd4w\u0011H1&6\u001fB6=s\u0000\u0003-%6\u0002Q!%s\u001cWj";
                    n2 = 169;
                    array = bb2;
                    continue;
                }
                case 169: {
                    array[n3] = intern;
                    n3 = 171;
                    s = "RE-:s\u0001\u0003\"9c\u001cGd\"yRA!vr\u0017O!\"s\u0016\u0003-86\u0006K-%6\u0001@6#t^\u0003,7d\u0016\u0003(?{\u001bWd$s\u0013@,3r\\\u0003\n96\u001fL636\u0016F(3b\u001bL*%8";
                    n2 = 170;
                    array = bb2;
                    continue;
                }
                case 170: {
                    array[n3] = intern;
                    n3 = 172;
                    s = "[\u000fd!sRT-:zRW6/6\u0006Ld2s\u001eF036\u0013O(vs\n@!&bRW,36\u001eB03e\u0006\u0003+8s\\";
                    n2 = 171;
                    array = bb2;
                    continue;
                }
                case 171: {
                    array[n3] = intern;
                    n3 = 173;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001@6#tRE+#x\u0016\u0003)9d\u0017\u00030>w\u001c\u0003+8sRA%%sRE+:r\u0017Qd~";
                    n2 = 172;
                    array = bb2;
                    continue;
                }
                case 172: {
                    array[n3] = intern;
                    n3 = 174;
                    s = "RK%%6\u001cV(:6\u0000F79c\u0000@!v\u007f\u0016\u000fd%}\u001bS4?x\u0015\r";
                    n2 = 173;
                    array = bb2;
                    continue;
                }
                case 173: {
                    array[n3] = intern;
                    n3 = 175;
                    s = "R\u000b'9c\u001eGd4sRG136\u0006Ld76\u001cF0!y\u0000Hd3d\u0000L6\u007f8";
                    n2 = 174;
                    array = bb2;
                    continue;
                }
                case 174: {
                    array[n3] = intern;
                    n3 = 176;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001@6#t";
                    n2 = 175;
                    array = bb2;
                    continue;
                }
                case 175: {
                    array[n3] = intern;
                    n3 = 177;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001@6#tRE%?z\u0017Gd\"yR\u0006 vp\u001bO!%:RQ!\"d\u000bJ*18";
                    n2 = 176;
                    array = bb2;
                    continue;
                }
                case 176: {
                    array[n3] = intern;
                    n3 = 178;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001@6#tRM+\"~\u001bM#vb\u001d\u0003 3z\u0017W!x";
                    n2 = 177;
                    array = bb2;
                    continue;
                }
                case 177: {
                    array[n3] = intern;
                    n3 = 179;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001@6#tRQ!%_\u0016\u0019d";
                    n2 = 178;
                    array = bb2;
                    continue;
                }
                case 178: {
                    array[n3] = intern;
                    n3 = 180;
                    s = "\u0015G6?`\u0017|\"?z\u0017|)7f";
                    n2 = 179;
                    array = bb2;
                    continue;
                }
                case 179: {
                    array[n3] = intern;
                    n3 = 181;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001@6#tRE+#x\u0016\u0003";
                    n2 = 180;
                    array = bb2;
                    continue;
                }
                case 180: {
                    array[n3] = intern;
                    n3 = 182;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001@6#tRJ*?bRN\u00032d\u001bU!\u0010\u007f\u001eF\t7fRP15u\u0017P70c\u001e\u000fd8y\u0005\u0003 9a\u001cO+7r\u001bM#vz\u001bP0vy\u0014\u0003%:zRE-:s\u0001\u0003-86\u001eB03e\u0006\u0003&7u\u0019V4vr\u001bQj";
                    n2 = 181;
                    array = bb2;
                    continue;
                }
                case 181: {
                    array[n3] = intern;
                    n3 = 183;
                    s = "RW-\"z\u0017\u0019d";
                    n2 = 182;
                    array = bb2;
                    continue;
                }
                case 182: {
                    array[n3] = intern;
                    n3 = 184;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001@6#tRM1:zRE-:s\u0001\u0003\"9c\u001cGd?xR";
                    n2 = 183;
                    array = bb2;
                    continue;
                }
                case 183: {
                    array[n3] = intern;
                    n3 = 185;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001@6#t";
                    n2 = 184;
                    array = bb2;
                    continue;
                }
                case 184: {
                    array[n3] = intern;
                    n3 = 186;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001@6#tRP!8r\u001bM#vd\u0017R13e\u0006\u0003096\u0016F(3b\u0017\u0003a26\u0014J(3e\\";
                    n2 = 185;
                    array = bb2;
                    continue;
                }
                case 185: {
                    array[n3] = intern;
                    n3 = 187;
                    s = "RE+:r\u0017Q7va\u001bW,vb\u001bW(36";
                    n2 = 186;
                    array = bb2;
                    continue;
                }
                case 186: {
                    array[n3] = intern;
                    n3 = 188;
                    s = "\u0015G6?`\u0017|\"?z\u0017|)7f";
                    n2 = 187;
                    array = bb2;
                    continue;
                }
                case 187: {
                    array[n3] = intern;
                    n3 = 189;
                    s = "RJ7v{\u001bP7?x\u0015\u0003\"$y\u001f\u0003\u00039y\u0015O!vR\u0000J238";
                    n2 = 188;
                    array = bb2;
                    continue;
                }
                case 188: {
                    array[n3] = intern;
                    n3 = 190;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001@6#tRV*7t\u001eFd\"yRE!\"u\u001a\u0003(?e\u0006\u0003+06\u0015G6?`\u0017|\"?z\u0017|)7fRJ*vp\u001dO 3dR";
                    n2 = 189;
                    array = bb2;
                    continue;
                }
                case 189: {
                    array[n3] = intern;
                    n3 = 191;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001@6#t";
                    n2 = 190;
                    array = bb2;
                    continue;
                }
                case 190: {
                    array[n3] = intern;
                    n3 = 192;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001@6#tRE-:sRJ7vwRG-$s\u0011W+$o^\u00033>\u007f\u0011Kd%~\u001dV(26\u001cL0v~\u0013U!v~\u0013S43x\u0017Gj";
                    n2 = 191;
                    array = bb2;
                    continue;
                }
                case 191: {
                    array[n3] = intern;
                    n3 = 193;
                    s = "\u0015G6?`\u0017|63e\u0006L63I\u0001W%$b-W-;s\u0001W%;f";
                    n2 = 192;
                    array = bb2;
                    continue;
                }
                case 192: {
                    array[n3] = intern;
                    n3 = 194;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001bM-\";\u001fB4vu\u0000F%\"\u007f\u001cDd8s\u0005\u0003#2d\u001bU!\tp\u001bO!\t{\u0013S";
                    n2 = 193;
                    array = bb2;
                    continue;
                }
                case 193: {
                    array[n3] = intern;
                    n3 = 195;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001bM-\";\u001fB4yr\u0000J23;\u0013S-{r\u001bP%4z\u0017G";
                    n2 = 194;
                    array = bb2;
                    continue;
                }
                case 194: {
                    array[n3] = intern;
                    n3 = 196;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001bM-\";\u001fB4yr\u0000J23;\u0013S-{r\u001bP%4z\u0017G";
                    n2 = 195;
                    array = bb2;
                    continue;
                }
                case 195: {
                    array[n3] = intern;
                    n3 = 197;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001bM-\";\u001fB4ye\u0007@'3e\u0001\f";
                    n2 = 196;
                    array = bb2;
                    continue;
                }
                case 196: {
                    array[n3] = intern;
                    n3 = 198;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001bM-\";\u001fB4v\u007f\u001cJ0vx\u0017Td1r\u0000J23I\u0014J(3I\u001fB4";
                    n2 = 197;
                    array = bb2;
                    continue;
                }
                case 197: {
                    array[n3] = intern;
                    n3 = 199;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001bM-\";\u001fB4y\u007f\u001c@+;f\u001eF03;\u0010B'=c\u0002\u000e\"9c\u001cG";
                    n2 = 198;
                    array = bb2;
                    continue;
                }
                case 198: {
                    array[n3] = intern;
                    n3 = 200;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001bM-\";\u001fB4v\u007f\u001cJ0vq\u0016Q- s-E-:s-N%&6\u0014B-:s\u0016\r";
                    n2 = 199;
                    array = bb2;
                    continue;
                }
                case 199: {
                    array[n3] = intern;
                    n3 = 201;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001bM-\";\u001fB4yx\u0007N\u001b3x\u0006Q-3e]";
                    n2 = 200;
                    array = bb2;
                    continue;
                }
                case 200: {
                    array[n3] = intern;
                    n3 = 202;
                    s = "\u0015G6?`\u0017|\"?z\u0017|)7f";
                    n2 = 201;
                    array = bb2;
                    continue;
                }
                case 201: {
                    array[n3] = intern;
                    n3 = 203;
                    s = "\u0015G6?`\u0017|63e\u0006L63I\u001dU!$a\u0000J03I\u001eL'7z-E-:s\u0001";
                    n2 = 202;
                    array = bb2;
                    continue;
                }
                case 202: {
                    array[n3] = intern;
                    n3 = 204;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0000F7\"y\u0000Fi9`\u0017Q3$\u007f\u0006Fi:y\u0011B({p\u001bO!%6\u0007M%4z\u0017\u0003096\u0011L);\u007f\u0006\u0003+ s\u0000T6?b\u0017\u0003(9u\u0013Od0\u007f\u001eF7vb\u001d\u00037>w\u0000F vf\u0000F\"%";
                    n2 = 203;
                    array = bb2;
                    continue;
                }
                case 203: {
                    array[n3] = intern;
                    n3 = 205;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001F0{s\u0000Q+$9";
                    n2 = 204;
                    array = bb2;
                    continue;
                }
                case 204: {
                    array[n3] = intern;
                    n3 = 206;
                    s = "\u0013@0?y\u001c|63e\u0006L63I\u001fF ?w";
                    n2 = 205;
                    array = bb2;
                    continue;
                }
                case 205: {
                    array[n3] = intern;
                    n3 = 207;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001F0{s\u0000Q+$9\u0007M!.f\u0017@03r_P!$`\u001b@!{e\u0006B6\";\u0013@0?y\u001c\f";
                    n2 = 206;
                    array = bb2;
                    continue;
                }
                case 206: {
                    array[n3] = intern;
                    n3 = 208;
                    s = "\u0013@0?y\u001c|&7u\u0019V4";
                    n2 = 207;
                    array = bb2;
                    continue;
                }
                case 207: {
                    array[n3] = intern;
                    n3 = 209;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001F0{s\u0000Q+$9\u001bM03x\u0006\u000e-%;\u001cV(:6\u0013M vx\u001dW,?x\u0015\u0003-%6\u0002F*2\u007f\u001cD";
                    n2 = 208;
                    array = bb2;
                    continue;
                }
                case 208: {
                    array[n3] = intern;
                    n3 = 210;
                    s = "\u0013@0?y\u001c|63e\u0006L63";
                    n2 = 209;
                    array = bb2;
                    continue;
                }
                case 209: {
                    array[n3] = intern;
                    n3 = 211;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0000F7\"y\u0000Fi0\u007f\u001eFd$s\u0001W+$sRK%%6\u0010F!86\u0011B*5s\u001eO!28";
                    n2 = 210;
                    array = bb2;
                    continue;
                }
                case 210: {
                    array[n3] = intern;
                    n3 = 212;
                    s = "\u0015G6?`\u0017|%5u\u001dV*\"I\u001cB)3";
                    n2 = 211;
                    array = bb2;
                    continue;
                }
                case 211: {
                    array[n3] = intern;
                    n3 = 213;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001F0{b\u001dW%:;\u0010B'=c\u0002\u000e7?l\u0017\u0003%5u\u001dV*\"x\u0013N!v\u007f\u0001\u0003*#z\u001e";
                    n2 = 212;
                    array = bb2;
                    continue;
                }
                case 212: {
                    array[n3] = intern;
                    n3 = 214;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001F0{b\u001dW%:;\u0010B'=c\u0002\u000e7?l\u0017\u000318w\u0010O!vb\u001d\u0003'9{\u001fJ0";
                    n2 = 213;
                    array = bb2;
                    continue;
                }
                case 213: {
                    array[n3] = intern;
                    n3 = 215;
                    s = "\u0015G6?`\u0017|(7e\u0006|7#u\u0011F7%p\u0007O\u001b4w\u0011H1&I\u0006L07z-P-,sH";
                    n2 = 214;
                    array = bb2;
                    continue;
                }
                case 214: {
                    array[n3] = intern;
                    n3 = 216;
                    s = "\u0015G6?`\u0017|63e\u0006L63I\u0001W%$b-W-;s\u0001W%;f";
                    n2 = 215;
                    array = bb2;
                    continue;
                }
                case 215: {
                    array[n3] = intern;
                    n3 = 217;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0011O!7x\u0007Si7p\u0006F6{{\u0017G-7;\u0000F7\"y\u0000Fd0w\u001bO!26\u0006Ld5y\u001fN-\"8";
                    n2 = 216;
                    array = bb2;
                    continue;
                }
                case 216: {
                    array[n3] = intern;
                    n3 = 218;
                    s = "\u0015G6?`\u0017|%:d\u0017B /I\u0016L38z\u001dB 3r-A=\"s\u0001";
                    n2 = 217;
                    array = bb2;
                    continue;
                }
                case 217: {
                    array[n3] = intern;
                    n3 = 219;
                    s = "\u0015G6?`\u0017|63e\u0006L63I\u001dU!$a\u0000J03I\u001eL'7z-E-:s\u0001";
                    n2 = 218;
                    array = bb2;
                    continue;
                }
                case 218: {
                    array[n3] = intern;
                    n3 = 220;
                    s = "\u0015G6?`\u0017|63e\u0006L63I\u001cL0?p\u001b@%\"\u007f\u001dM\u001b \u007f\u0001J&?z\u001bW=";
                    n2 = 219;
                    array = bb2;
                    continue;
                }
                case 219: {
                    array[n3] = intern;
                    n3 = 221;
                    s = "\u0015G6?`\u0017|)3r\u001bB\u001b$s\u0001W+$s-M!\"a\u001dQ/\te\u0017W0?x\u0015";
                    n2 = 220;
                    array = bb2;
                    continue;
                }
                case 220: {
                    array[n3] = intern;
                    n3 = 222;
                    s = "%Ji\u0010\u007fRL*:o";
                    n2 = 221;
                    array = bb2;
                    continue;
                }
                case 221: {
                    array[n3] = intern;
                    n3 = 223;
                    s = "%Ji\u0010\u007fRL*:o";
                    n2 = 222;
                    array = bb2;
                    continue;
                }
                case 222: {
                    array[n3] = intern;
                    n3 = 224;
                    s = "\u0007M/8y\u0005M";
                    n2 = 223;
                    array = bb2;
                    continue;
                }
                case 223: {
                    array[n3] = intern;
                    n3 = 225;
                    s = "%Ji\u0010\u007fRL6vu\u0017O(#z\u0013Q";
                    n2 = 224;
                    array = bb2;
                    continue;
                }
                case 224: {
                    array[n3] = intern;
                    n3 = 226;
                    s = "%Ji\u0010\u007fRL6vu\u0017O(#z\u0013Q";
                    n2 = 225;
                    array = bb2;
                    continue;
                }
                case 225: {
                    array[n3] = intern;
                    n3 = 227;
                    s = "\u0007M/8y\u0005M";
                    n2 = 226;
                    array = bb2;
                    continue;
                }
                case 226: {
                    array[n3] = intern;
                    n3 = 228;
                    s = "\u0015G6?`\u0017|)3r\u001bB\u001b$s\u0001W+$s-M!\"a\u001dQ/\te\u0017W0?x\u0015";
                    n2 = 227;
                    array = bb2;
                    continue;
                }
                case 227: {
                    array[n3] = intern;
                    n3 = 229;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001F0{{\u0017G-7;\u0000F7\"y\u0000Fi8s\u0006T+$}_P!\"b\u001bM#vc\u001cB&:sRW+vu\u001dN)?b";
                    n2 = 228;
                    array = bb2;
                    continue;
                }
                case 228: {
                    array[n3] = intern;
                    n3 = 230;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001F0{{\u0017G-7;\u0000F7\"y\u0000Fi8s\u0006T+$}_P!\"b\u001bM#y\u007f\u001cU%:\u007f\u0016\u000e27z\u0007Fk";
                    n2 = 229;
                    array = bb2;
                    continue;
                }
                case 229: {
                    array[n3] = intern;
                    n3 = 231;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'3e]J7{w\u0011@!%e_S+%e\u001bA(3";
                    n2 = 230;
                    array = bb2;
                    continue;
                }
                case 230: {
                    array[n3] = intern;
                    n3 = 232;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'3e]J7{w\u0011@!%e_S+%e\u001bA(365L+1z\u0017\u0003\u0014:w\u000b\u000373d\u0004J'3eRB636\u001fJ7%\u007f\u001cDd7x\u0016\u0003'7x\u001cL0vt\u0017\u0003-8e\u0006B(:s\u0016\u000fd%b\u0013W1%6\u0011L 3,R";
                    n2 = 231;
                    array = bb2;
                    continue;
                }
                case 231: {
                    array[n3] = intern;
                    n3 = 233;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001bPi7u\u0011F7%;\u0002L7%\u007f\u0010O!vx\u001d\u0003%5u\u0017P7vp\u001dQd\u0017F;\u0003&3z\u001dTdo8";
                    n2 = 232;
                    array = bb2;
                    continue;
                }
                case 232: {
                    array[n3] = intern;
                    n3 = 234;
                    s = "\u0011L)xw\u001cG69\u007f\u0016\r23x\u0016J*1";
                    n2 = 233;
                    array = bb2;
                    continue;
                }
                case 233: {
                    array[n3] = intern;
                    n3 = 235;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001bPi7u\u0011F7%;\u0002L7%\u007f\u0010O!vQ\u001dL#:sRs(7oRP!$`\u001b@!%6\u0013Q!vx\u001dWd7`\u0013J(7t\u001eFj";
                    n2 = 234;
                    array = bb2;
                    continue;
                }
                case 234: {
                    array[n3] = intern;
                    n3 = 236;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001bPi7u\u0011F7%;\u0002L7%\u007f\u0010O!";
                    n2 = 235;
                    array = bb2;
                    continue;
                }
                case 235: {
                    array[n3] = intern;
                    n3 = 237;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001bPi7u\u0011F7%;\u0002L7%\u007f\u0010O!vQ\u001dL#:sRs(7oRP!$`\u001b@!%6\u0013Q!v{\u001bP7?x\u0015\u0003%8rR@%86\u0010Fd?x\u0001W%:z\u0017Ghv6\u0001W%\"c\u0001\u0003'9r\u0017\u0019d";
                    n2 = 236;
                    array = bb2;
                    continue;
                }
                case 236: {
                    array[n3] = intern;
                    n3 = 238;
                    s = "\u001bM'9{\u0002O!\"s-A%5}\u0007S\u001b;w\u0000H!$";
                    n2 = 237;
                    array = bb2;
                    continue;
                }
                case 237: {
                    array[n3] = intern;
                    n3 = 239;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0016F(3b\u0017\u000e\"?z\u0017Pd0s\u0006@,?x\u0015\u0003(?e\u0006\u0003+06\u0014J(3eRT-\"~RM%;sR";
                    n2 = 238;
                    array = bb2;
                    continue;
                }
                case 238: {
                    array[n3] = intern;
                    n3 = 240;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0011K%8q\u0017\u000e*#{\u0010F6vp\u0013J(3rRW+vd\u0017M%;sRE-:sRJ l6WPhvy\u001eGd8w\u001fF~v3\u0001\u000fd8s\u0005\u0003*7{\u0017\u0019dse";
                    n2 = 239;
                    array = bb2;
                    continue;
                }
                case 239: {
                    array[n3] = intern;
                    n3 = 241;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0011K%8q\u0017\u000e*#{\u0010F6vt\u0013P!vp\u001dO 3dRM+\"6\u0014L18rRE+$6";
                    n2 = 240;
                    array = bb2;
                    continue;
                }
                case 240: {
                    array[n3] = intern;
                    n3 = 242;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0011K%8q\u0017\u000e*#{\u0010F6vt\u0013P!vp\u001dO 3dUPd$s\u0001j vx\u001dWd0y\u0007M vp\u001dQd";
                    n2 = 241;
                    array = bb2;
                    continue;
                }
                case 241: {
                    array[n3] = intern;
                    n3 = 243;
                    s = "RQ!\"c\u0000M!26\u001cV(::RV*3n\u0002F'\"s\u0016\r";
                    n2 = 242;
                    array = bb2;
                    continue;
                }
                case 242: {
                    array[n3] = intern;
                    n3 = 244;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001F0{t\u0013@/#f_E63gRV*7t\u001eFd\"yR@+;{\u001bW";
                    n2 = 243;
                    array = bb2;
                    continue;
                }
                case 243: {
                    array[n3] = intern;
                    n3 = 245;
                    s = "\u001bM03d\u0014B'3I\u0015G6?`\u0017|&7u\u0019V4\tp\u0000F5#s\u001c@=";
                    n2 = 244;
                    array = bb2;
                    continue;
                }
                case 244: {
                    array[n3] = intern;
                    n3 = 246;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001F0{t\u0013@/#f_E63g]";
                    n2 = 245;
                    array = bb2;
                    continue;
                }
                case 245: {
                    array[n3] = intern;
                    n3 = 247;
                    s = "\u0013@0?y\u001c|&7u\u0019V4";
                    n2 = 246;
                    array = bb2;
                    continue;
                }
                case 246: {
                    array[n3] = intern;
                    n3 = 248;
                    s = "C\u0017tn#G\u0016ud%G";
                    n2 = 247;
                    array = bb2;
                    continue;
                }
                case 247: {
                    array[n3] = intern;
                    n3 = 249;
                    s = "C\u0017tn#G\u0016ud%D";
                    n2 = 248;
                    array = bb2;
                    continue;
                }
                case 248: {
                    array[n3] = intern;
                    n3 = 250;
                    s = "C\u0015qf$F\u001buf/G";
                    n2 = 249;
                    array = bb2;
                    continue;
                }
                case 249: {
                    array[n3] = intern;
                    n3 = 251;
                    s = "C\u0017tn#G\u0016ud%J";
                    n2 = 250;
                    array = bb2;
                    continue;
                }
                case 250: {
                    array[n3] = intern;
                    n3 = 252;
                    s = "C\u0017tn#G\u0016ud%E";
                    n2 = 251;
                    array = bb2;
                    continue;
                }
                case 251: {
                    array[n3] = intern;
                    n3 = 253;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0010B73;\u0014L(2s\u0000\u000e*7{\u0017\u0003.?rRJ7vx\u0007O(z6\u0014B07zRF6$y\u0000\r";
                    n2 = 252;
                    array = bb2;
                    continue;
                }
                case 252: {
                    array[n3] = intern;
                    n3 = 254;
                    s = "C\u0017tn#G\u0016r` D";
                    n2 = 253;
                    array = bb2;
                    continue;
                }
                case 253: {
                    array[n3] = intern;
                    n3 = 255;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0016F(3b\u0017\u000e\"?z\u0017P";
                    n2 = 254;
                    array = bb2;
                    continue;
                }
                case 254: {
                    array[n3] = intern;
                    n3 = 256;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0016F(3b\u0017\u000e\"?z\u0017Pd0s\u0006@,?x\u0015\u0003(?e\u0006\u0003+06\u0014J(3eRT-\"~RM%;sR";
                    n2 = 255;
                    array = bb2;
                    continue;
                }
                case 255: {
                    array[n3] = intern;
                    n3 = 257;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0016F(3b\u0017\u000e\"?z\u0017Pd;W\u0011@+#x\u0006m%;sRJ7vx\u0007O(z6\u001cL0>\u007f\u001cDd\"yRA!vr\u0017O!\"s\u0016\r";
                    n2 = 256;
                    array = bb2;
                    continue;
                }
                case 256: {
                    array[n3] = intern;
                    n3 = 258;
                    s = "]@+#x\u0006\f";
                    n2 = 257;
                    array = bb2;
                    continue;
                }
                case 257: {
                    array[n3] = intern;
                    n3 = 259;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0016F(3b\u0017\u000e\"?z\u0017Pk%c\u0011@!%e]";
                    n2 = 258;
                    array = bb2;
                    continue;
                }
                case 258: {
                    array[n3] = intern;
                    n3 = 260;
                    s = "RQ!\"c\u0000M!26\u001cV(::RV*3n\u0002F'\"s\u0016\r";
                    n2 = 259;
                    array = bb2;
                    continue;
                }
                case 259: {
                    array[n3] = intern;
                    n3 = 261;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0016F(3b\u0017\u000e\"?z\u0017Pk";
                    n2 = 260;
                    array = bb2;
                    continue;
                }
                case 260: {
                    array[n3] = intern;
                    n3 = 262;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0016F(3b\u0017\u000e\"?z\u0017Pd3d\u0000L6vy\u0011@1$d\u0017Gd!~\u001bO!vb\u0000Z-8qRW+vp\u0017W'>6\u0013V0>B\u001dH!86\u0014L6v";
                    n2 = 261;
                    array = bb2;
                    continue;
                }
                case 261: {
                    array[n3] = intern;
                    n3 = 263;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0010B'=c\u0002\f09b\u0013Oi%\u007f\bFk";
                    n2 = 262;
                    array = bb2;
                    continue;
                }
                case 262: {
                    array[n3] = intern;
                    n3 = 264;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0010B'=c\u0002\u0003&7e\u0017\u0003\"9z\u0016F6v\u007f\u0016\u0003-%6\u001cV(::RB&9d\u0006J*16\u0010B'=c\u0002\r";
                    n2 = 263;
                    array = bb2;
                    continue;
                }
                case 263: {
                    array[n3] = intern;
                    n3 = 265;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0010B'=c\u0002\u000337\u007f\u0006J*16\u0014L6vt\u0013@/#fRW+vp\u001bM-%~\\\rj";
                    n2 = 264;
                    array = bb2;
                    continue;
                }
                case 264: {
                    array[n3] = intern;
                    n3 = 266;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0010B'=c\u0002\u0003'7z\u0011V(7b\u001bM#vb\u001dW%:6\u0010B'=c\u0002\u00037?l\u0017";
                    n2 = 265;
                    array = bb2;
                    continue;
                }
                case 265: {
                    array[n3] = intern;
                    n3 = 267;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0014J(3e_W+{t\u0017\u000e1&z\u001dB 3r";
                    n2 = 266;
                    array = bb2;
                    continue;
                }
                case 266: {
                    array[n3] = intern;
                    n3 = 268;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0010B'=c\u0002\u0003";
                    n2 = 267;
                    array = bb2;
                    continue;
                }
                case 267: {
                    array[n3] = intern;
                    n3 = 269;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0010B'=c\u0002\f7#u\u0011F7%p\u0007O";
                    n2 = 268;
                    array = bb2;
                    continue;
                }
                case 268: {
                    array[n3] = intern;
                    n3 = 270;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0010B'=c\u0002\u000318w\u0010O!vb\u001d\u0003-8e\u0017Q0v\u007f\u001c@+;f\u001eF036\u0010B'=c\u0002\u0003-8r\u001b@%\"y\u0000\u000fd4w\u0016\u0003&#bRM+\"6\u0014B07z\\";
                    n2 = 269;
                    array = bb2;
                    continue;
                }
                case 269: {
                    array[n3] = intern;
                    n3 = 271;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0010B'=c\u0002\u0003&7u\u0019V4vp\u0013J(3r\\";
                    n2 = 270;
                    array = bb2;
                    continue;
                }
                case 270: {
                    array[n3] = intern;
                    n3 = 272;
                    s = "RG+3eRM+\"6\u0017[-%b^\u0003)7oRA!vc\u0001F6vr\u0017O!\"s\u0016\u0003-\")";
                    n2 = 271;
                    array = bb2;
                    continue;
                }
                case 271: {
                    array[n3] = intern;
                    n3 = 273;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0010B'=c\u0002\u000e\"?z\u0017\u0003&7u\u0019V4v~\u0013Pd4s\u0017Md5w\u001c@!:z\u0017Gj";
                    n2 = 272;
                    array = bb2;
                    continue;
                }
                case 272: {
                    array[n3] = intern;
                    n3 = 274;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0010B'=c\u0002";
                    n2 = 273;
                    array = bb2;
                    continue;
                }
                case 273: {
                    array[n3] = intern;
                    n3 = 275;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0010B'=c\u0002\u0003#2d\u001bU!\tp\u001bO!\t{\u0013Sd4w\u0011H1&6\u0001V'5s\u0001P\"#z\\";
                    n2 = 274;
                    array = bb2;
                    continue;
                }
                case 274: {
                    array[n3] = intern;
                    n3 = 276;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0010B'=c\u0002\u0003&7u\u0019V4vp\u001bM-%~\u0017Gj";
                    n2 = 275;
                    array = bb2;
                    continue;
                }
                case 275: {
                    array[n3] = intern;
                    n3 = 277;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0010B'=c\u0002\u000e\"?z\u0017\u0003&7u\u0019V4v~\u0013Pd4s\u0017Md5w\u001c@!:z\u0017Gj";
                    n2 = 276;
                    array = bb2;
                    continue;
                }
                case 276: {
                    array[n3] = intern;
                    n3 = 278;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0010B'=c\u0002\u00037\"w\u0000W-8qRJ*?b5G6?`\u0017e-:s?B4";
                    n2 = 277;
                    array = bb2;
                    continue;
                }
                case 277: {
                    array[n3] = intern;
                    n3 = 279;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0010B'=c\u0002\u0003\"?x\u0016J*16\u0014J(3e&L\u00063C\u0002O+7r\u0017G";
                    n2 = 278;
                    array = bb2;
                    continue;
                }
                case 278: {
                    array[n3] = intern;
                    n3 = 280;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0010B'=c\u0002\u0003#2d\u001bU!\tp\u001bO!\t{\u0013Sd4w\u0011H1&6\u0014B-:s\u0016\r";
                    n2 = 279;
                    array = bb2;
                    continue;
                }
                case 279: {
                    array[n3] = intern;
                    n3 = 281;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0010B'=c\u0002\u000318w\u0010O!vb\u001d\u0003'$s\u0013W!vt\u0013P!vp\u001dO 3d\\";
                    n2 = 280;
                    array = bb2;
                    continue;
                }
                case 280: {
                    array[n3] = intern;
                    n3 = 282;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0010B'=c\u0002\u0003\"7\u007f\u001eF vb\u001d\u0003#3x\u0017Q%\"sRO-%bRL\"vp\u001bO!%6\u0006Ld4sRV4:y\u0013G!28";
                    n2 = 281;
                    array = bb2;
                    continue;
                }
                case 281: {
                    array[n3] = intern;
                    n3 = 283;
                    s = "\u0015G6?`\u0017\u000e)7f]A%5}\u0007Sd0w\u001bO!26\u0006Ld4w\u0011H1&6\u0015G6?`\u0017|\"?z\u0017|)7f";
                    n2 = 282;
                    array = bb2;
                    continue;
                }
                case 282: {
                    array[n3] = intern;
                    n3 = 284;
                    s = "\u0015G6?`\u0017|7#u\u0011F7%\u007f\u0004F\u001b4w\u0011H1&I\u0014B-:s\u0016|'9c\u001cW";
                    n2 = 283;
                    array = bb2;
                    continue;
                }
                case 283: {
                    array[n3] = intern;
                    n3 = 285;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0000F7\"y\u0000Fi;s\u0016J%vp\u0013J(3rRW+v\u007f\u001cJ0vq\u0016Q- s-E-:s-N%&";
                    n2 = 284;
                    array = bb2;
                    continue;
                }
                case 284: {
                    array[n3] = intern;
                    n3 = 286;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001F0{w\u001eQ!7r\u000b\u000e1&z\u001dB 3r_A=\"s\u0001\u0003\"7\u007f\u001eF vb\u001d\u0003'9{\u001fJ0x";
                    n2 = 285;
                    array = bb2;
                    continue;
                }
                case 285: {
                    array[n3] = intern;
                    n3 = 287;
                    s = "\u0015G6?`\u0017|%:d\u0017B /I\u0007S(9w\u0016F \tt\u000bW!%";
                    n2 = 286;
                    array = bb2;
                    continue;
                }
                case 286: {
                    array[n3] = intern;
                    n3 = 288;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0015F0{t\u0013P!{p\u001dO 3dRO!\"eRE-8rRW,36\u001dM!va\u001bW,v{\u0013[d8c\u001fA!$6\u001dEd0\u007f\u001eF7";
                    n2 = 287;
                    array = bb2;
                    continue;
                }
                case 287: {
                    array[n3] = intern;
                    n3 = 289;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0015F0{t\u0013P!{p\u001dO 3d^\u0003(?e\u0006e-:s\u0001\u0003+86";
                    n2 = 288;
                    array = bb2;
                    continue;
                }
                case 288: {
                    array[n3] = intern;
                    n3 = 290;
                    s = "RT-\"~RE-:s\u0001\u0003";
                    n2 = 289;
                    array = bb2;
                    continue;
                }
                case 289: {
                    array[n3] = intern;
                    n3 = 291;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0015F0{t\u0013P!{p\u001dO 3d]N1:b\u001bS(3;\u0014L18r";
                    n2 = 290;
                    array = bb2;
                    continue;
                }
                case 290: {
                    array[n3] = intern;
                    n3 = 292;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0015F0{t\u0013P!{p\u001dO 3dRM1;6\u001dEd0\u007f\u001eF7v\u007f\u001c\u0003";
                    n2 = 291;
                    array = bb2;
                    continue;
                }
                case 291: {
                    array[n3] = intern;
                    n3 = 293;
                    s = "RJ7v";
                    n2 = 292;
                    array = bb2;
                    continue;
                }
                case 292: {
                    array[n3] = intern;
                    n3 = 294;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0015F0{t\u0013P!{p\u001dO 3d_J z6\u0010B736\u0014L(2s\u0000\u0003*7{\u0017\u0003-%6\u001cV(::RV*3n\u0002F'\"s\u0016\r";
                    n2 = 293;
                    array = bb2;
                    continue;
                }
                case 293: {
                    array[n3] = intern;
                    n3 = 295;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0015F0{t\u0013P!{p\u001dO 3d]M+8s_E+#x\u0016";
                    n2 = 294;
                    array = bb2;
                    continue;
                }
                case 294: {
                    array[n3] = intern;
                    n3 = 296;
                    s = "RQ!\"c\u0000M!26\u001cV(:8";
                    n2 = 295;
                    array = bb2;
                    continue;
                }
                case 295: {
                    array[n3] = intern;
                    n3 = 297;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0015F0{t\u0013P!{p\u001dO 3dRE-8w\u001e\u0003&7e\u0017e+:r\u0017Q\r26\u001bPd";
                    n2 = 296;
                    array = bb2;
                    continue;
                }
                case 296: {
                    array[n3] = intern;
                    n3 = 298;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0015F0{t\u0013P!{p\u001dO 3d_J ve\u0017Q-9c\u0001\u0003!$d\u001dQ~v{5G6?`\u0017e-:s?B4v\u007f\u0001\u0003*9bRF)&b\u000b\u0003d4c\u0006\u0003336\u0016L*qbRK% sRN\u00067e\u0017e+:r\u0017Q\r28";
                    n2 = 297;
                    array = bb2;
                    continue;
                }
                case 297: {
                    array[n3] = intern;
                    n3 = 299;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0010B'=c\u0002\u000e\"?z\u0017\u0003'7z\u001eF va\u001bW,vx\u0007O(vp\u001bO!vy\u0010I!5b^\u000318s\nS!5b\u0017G";
                    n2 = 298;
                    array = bb2;
                    continue;
                }
                case 298: {
                    array[n3] = intern;
                    n3 = 300;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0010B'=c\u0002\u000e\"?z\u0017\u00030>\u007f\u0001\u0003'9r\u0017\u000347b\u001a\u0003-%6\u001dA79z\u0017W!vw\u001cGd%~\u001dV(26\u001cL0v~\u0013U!vt\u0017F*vu\u0013O(3r\\";
                    n2 = 299;
                    array = bb2;
                    continue;
                }
                case 299: {
                    array[n3] = intern;
                    n3 = 301;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0010B'=c\u0002\u000e\"?z\u0017\u0003\"?z\u0017\u0003";
                    n2 = 300;
                    array = bb2;
                    continue;
                }
                case 300: {
                    array[n3] = intern;
                    n3 = 302;
                    s = "RG+3eRM+\"6\u0017[-%b\\";
                    n2 = 301;
                    array = bb2;
                    continue;
                }
                case 301: {
                    array[n3] = intern;
                    n3 = 303;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0010B'=c\u0002\u000e\"?z\u0017\u0003&7u\u0019V4v~\u0013Pd4s\u0017Md5w\u001c@!:z\u0017Gj";
                    n2 = 302;
                    array = bb2;
                    continue;
                }
                case 302: {
                    array[n3] = intern;
                    n3 = 304;
                    s = "\u0015G6?`\u0017|%:d\u0017B /I\u0007S(9w\u0016F \tt\u000bW!%";
                    n2 = 303;
                    array = bb2;
                    continue;
                }
                case 303: {
                    array[n3] = intern;
                    n3 = 305;
                    s = "\u0015G6?`\u0017|7#u\u0011F7%\u007f\u0004F\u001b4w\u0011H1&I\u0014B-:s\u0016|'9c\u001cW";
                    n2 = 304;
                    array = bb2;
                    continue;
                }
                case 304: {
                    array[n3] = intern;
                    n3 = 306;
                    s = "\u0015G6?`\u0017|7#u\u0011F7%\u007f\u0004F\u001b4w\u0011H1&I\u0014B-:s\u0016|'9c\u001cW";
                    n2 = 305;
                    array = bb2;
                    continue;
                }
                case 305: {
                    array[n3] = intern;
                    n3 = 307;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u001bM'$s\u001fF*\";\u0010B'=c\u0002\u000e\"7\u007f\u001eF {u\u001dV*\"6\u0007M%4z\u0017\u0003096\u0011L);\u007f\u0006\u0003&7u\u0019V4vp\u0013J(3rR@+#x\u0006\u0003096\u0001K%$s\u0016\u00034$s\u0014P";
                    n2 = 306;
                    array = bb2;
                    continue;
                }
                case 306: {
                    array[n3] = intern;
                    n3 = 308;
                    s = "\u0015G6?`\u0017|7\"w\u0006F";
                    n2 = 307;
                    array = bb2;
                    continue;
                }
                case 307: {
                    array[n3] = intern;
                    n3 = 309;
                    s = "\u0015G6?`\u0017|63e\u0006L63I\u001dU!$a\u0000J03I\u001eL'7z-E-:s\u0001";
                    n2 = 308;
                    array = bb2;
                    continue;
                }
                case 308: {
                    array[n3] = intern;
                    n3 = 310;
                    s = "\u0015G6?`\u0017|)3r\u001bB\u001b$s\u0001W+$s-M!\"a\u001dQ/\te\u0017W0?x\u0015";
                    n2 = 309;
                    array = bb2;
                    continue;
                }
                case 309: {
                    array[n3] = intern;
                    n3 = 311;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0015F0{{\u0017G-7;\u0000F7\"y\u0000Fi8s\u0006T+$}_P!\"b\u001bM#";
                    n2 = 310;
                    array = bb2;
                    continue;
                }
                case 310: {
                    array[n3] = intern;
                    n3 = 312;
                    s = "\u0015G6?`\u0017|(7e\u0006|7#u\u0011F7%p\u0007O\u001b4w\u0011H1&I\u0006J)3e\u0006B)&";
                    n2 = 311;
                    array = bb2;
                    continue;
                }
                case 311: {
                    array[n3] = intern;
                    n3 = 313;
                    s = "\u0015G6?`\u0017|(7e\u0006|7#u\u0011F7%p\u0007O\u001b4w\u0011H1&I\u0006J)3e\u0006B)&";
                    n2 = 312;
                    array = bb2;
                    continue;
                }
                case 312: {
                    array[n3] = intern;
                    n3 = 314;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0015F0{t\u0013@/#f_W-;s\u0001W%;fRB'5y\u0007M0\u0018w\u001fFd&w\u0001P!26\u001bPd8c\u001eOj";
                    n2 = 313;
                    array = bb2;
                    continue;
                }
                case 313: {
                    array[n3] = intern;
                    n3 = 315;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0015F0{t\u0013@/#f_W-;s\u0001W%;fRV*7t\u001eFd\"yRG!:s\u0006Fd9z\u0016\u0003/3oRD $\u007f\u0004F\u001b:w\u0001W\u001b%c\u0011@!%e\u0014V(\tt\u0013@/#f-W-;s\u0001W%;f^\u00030>\u007f\u0001\u0003!$d\u001dQd5w\u001c\u0003&36\u001bD*9d\u0017Gj";
                    n2 = 314;
                    array = bb2;
                    continue;
                }
                case 314: {
                    array[n3] = intern;
                    n3 = 316;
                    s = "\u0015G6?`\u0017|(7e\u0006|7#u\u0011F7%p\u0007O\u001b4w\u0011H1&I\u0006J)3e\u0006B)&,";
                    n2 = 315;
                    array = bb2;
                    continue;
                }
                case 315: {
                    array[n3] = intern;
                    n3 = 317;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001F0{d\u0017P09d\u0017\u000e7\"w\u0000Wi\"\u007f\u001fF7\"w\u001fSd#x\u0013A(36\u0006Ld5y\u001fN-\"6\u0000F7\"y\u0000Fd%b\u0013Q0vb\u001bN!%b\u0013N4vb\u001d\u00037>w\u0000F vf\u0000F\"%";
                    n2 = 316;
                    array = bb2;
                    continue;
                }
                case 316: {
                    array[n3] = intern;
                    n3 = 318;
                    s = "\u0015G6?`\u0017|63e\u0006L63I\u0001W%$b-W-;s\u0001W%;f";
                    n2 = 317;
                    array = bb2;
                    continue;
                }
                case 317: {
                    array[n3] = intern;
                    n3 = 319;
                    s = "\u001bM'9{\u0002O!\"s-A%5}\u0007S\u001b;w\u0000H!$";
                    n2 = 318;
                    array = bb2;
                    continue;
                }
                case 318: {
                    array[n3] = intern;
                    n3 = 320;
                    s = "\u0011L)xa\u001aB0%w\u0002S\u001b&d\u0017E!$s\u001c@!%";
                    n2 = 319;
                    array = bb2;
                    continue;
                }
                case 319: {
                    array[n3] = intern;
                    n3 = 321;
                    s = "\u0015G6?`\u0017|&7u\u0019V4\te\u0006B6\"I\u0006J)3e\u0006B)&";
                    n2 = 320;
                    array = bb2;
                    continue;
                }
                case 320: {
                    array[n3] = intern;
                    n3 = 322;
                    s = "RA1\"6\u0013@'9c\u001cW\n7{\u0017\u0003%%e\u001d@-7b\u0017Gd?eRM1:z^\u0003-1x\u001dQ-8q\\";
                    n2 = 321;
                    array = bb2;
                    continue;
                }
                case 321: {
                    array[n3] = intern;
                    n3 = 323;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001F0{t\u0013@/#f_W-;s\u0001W%;fRW,?eRJ7va\u0017J62:RO%%bRP15u\u0017P70c\u001e\u0003&7u\u0019V4vb\u001bN!%b\u0013N4v\u007f\u0001\u000373bRW+v";
                    n2 = 322;
                    array = bb2;
                    continue;
                }
                case 322: {
                    array[n3] = intern;
                    n3 = 324;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001F0{t\u0013@/#f_W-;s\u0001W%;fRV*7t\u001eFd\"yR@+;{\u001bWd4w\u0011H1&6\u0006J)3e\u0006B)&6\u0006Ld%~\u0013Q!26\u0002Q!0e";
                    n2 = 323;
                    array = bb2;
                    continue;
                }
                case 323: {
                    array[n3] = intern;
                    n3 = 325;
                    s = "\u0015G6?`\u0017|(7e\u0006|7#u\u0011F7%p\u0007O\u001b4w\u0011H1&I\u0006J)3e\u0006B)&,";
                    n2 = 324;
                    array = bb2;
                    continue;
                }
                case 324: {
                    array[n3] = intern;
                    n3 = 326;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0001F0{w\u0011@+#x\u0006\u000e*7{\u0017\u000318w\u0010O!vb\u001d\u0003'9{\u001fJ0vw\u0011@+#x\u0006\u0003*7{\u0017\u0003096\u0001K%$s\u0016\u00034$s\u0014P";
                    n2 = 325;
                    array = bb2;
                    continue;
                }
                case 325: {
                    array[n3] = intern;
                    n3 = 327;
                    s = "\u0015G6?`\u0017|%5u\u001dV*\"I\u001cB)3";
                    n2 = 326;
                    array = bb2;
                    continue;
                }
                case 326: {
                    array[n3] = intern;
                    n3 = 328;
                    s = "\u0015G6?`\u0017\u000e73d\u0004J'39\u0010B'=c\u0002\u000e\"?z\u0017\f39x\u0006\u000e&7u\u0019V4v";
                    n2 = 327;
                    array = bb2;
                    continue;
                }
                case 327: {
                    array[n3] = intern;
                    n3 = 329;
                    s = "RP-,sH";
                    n2 = 328;
                    array = bb2;
                    continue;
                }
                case 328: {
                    break Label_8892;
                }
            }
        }
        array[n3] = intern;
        bb = bb2;
        W = 1048576L * (2 * ym.k);
        J = GoogleDriveService.class.getCanonicalName();
        w = qf.h();
        D = t1.a();
        aa = new File[] { qf.f(), qf.g(), qf.c(), qf.h(), qf.e(), qf.j(), qf.a() };
        GoogleDriveService.H = true;
        A = new ConditionVariable(false);
        K = new ConditionVariable(false);
        V = new ConditionVariable(false);
        GoogleDriveService.Y = false;
        GoogleDriveService.G = false;
        GoogleDriveService.m = false;
        j = new ConditionVariable(false);
        z = new ConditionVariable(false);
        U = new ConditionVariable(false);
        I = new ConditionVariable(false);
        GoogleDriveService.f = false;
        GoogleDriveService.S = false;
        GoogleDriveService.s = false;
        GoogleDriveService.x = false;
        GoogleDriveService.E = 0;
        GoogleDriveService.C = 0;
        GoogleDriveService.p = false;
        GoogleDriveService.h = false;
        t = new AtomicBoolean(false);
        a = new AtomicBoolean(false);
        v = new AtomicBoolean(false);
        GoogleDriveService.q = 10;
        G();
        M();
        c();
        ah();
        n = new w();
        u = new ah();
    }
    
    public GoogleDriveService() {
        super(GoogleDriveService.J);
        this.y = new bw(this);
        this.e = new AtomicBoolean(false);
        this.R = new AtomicLong(0L);
        this.l = new AtomicLong(0L);
        this.T = new AtomicLong(0L);
        this.M = new AtomicLong(0L);
        this.Z = new aq(null);
        if (this.d == null) {
            this.a(this.d = new ae((Context)App.aq));
        }
    }
    
    private static boolean A() {
        boolean b = true;
        final SharedPreferences$Editor edit = e().edit();
        try {
            edit.putBoolean(GoogleDriveService.bb[12], true);
            if (!edit.commit()) {
                Log.w(GoogleDriveService.bb[11]);
                b = false;
            }
            return b;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    private static boolean B() {
        return e().getBoolean(GoogleDriveService.bb[29], false);
    }
    
    private boolean C() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/whatsapp/gdrive/GoogleDriveService.af:()Z
        //     3: istore          4
        //     5: iload           4
        //     7: ifeq            42
        //    10: aload_0        
        //    11: invokespecial   com/whatsapp/gdrive/GoogleDriveService.f:()Z
        //    14: istore          5
        //    16: iload           5
        //    18: ifeq            42
        //    21: invokestatic    com/whatsapp/gdrive/GoogleDriveService.af:()Z
        //    24: istore          6
        //    26: iload           6
        //    28: ifeq            42
        //    31: iconst_1       
        //    32: ireturn        
        //    33: astore_1       
        //    34: aload_1        
        //    35: athrow         
        //    36: astore_2       
        //    37: aload_2        
        //    38: athrow         
        //    39: astore_3       
        //    40: aload_3        
        //    41: athrow         
        //    42: iconst_0       
        //    43: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      5      33     36     Ljava/lang/NullPointerException;
        //  10     16     36     39     Ljava/lang/NullPointerException;
        //  21     26     39     42     Ljava/lang/NullPointerException;
        //  34     36     36     39     Ljava/lang/NullPointerException;
        //  37     39     39     42     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 26, Size: 26
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
    
    private static boolean D() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/whatsapp/gdrive/GoogleDriveService.af:()Z
        //     3: istore_2       
        //     4: iload_2        
        //     5: ifeq            37
        //     8: getstatic       com/whatsapp/gdrive/GoogleDriveService.A:Landroid/os/ConditionVariable;
        //    11: ldc2_w          86400000
        //    14: invokevirtual   android/os/ConditionVariable.block:(J)Z
        //    17: ifne            123
        //    20: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    23: bipush          53
        //    25: aaload         
        //    26: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    29: iconst_0       
        //    30: ireturn        
        //    31: astore_0       
        //    32: aload_0        
        //    33: athrow         
        //    34: astore_1       
        //    35: aload_1        
        //    36: athrow         
        //    37: invokestatic    com/whatsapp/gdrive/GoogleDriveService.z:()Z
        //    40: istore          7
        //    42: iload           7
        //    44: ifeq            82
        //    47: getstatic       com/whatsapp/gdrive/GoogleDriveService.K:Landroid/os/ConditionVariable;
        //    50: ldc2_w          86400000
        //    53: invokevirtual   android/os/ConditionVariable.block:(J)Z
        //    56: istore          8
        //    58: iload           8
        //    60: ifne            123
        //    63: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    66: bipush          51
        //    68: aaload         
        //    69: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    72: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //    75: istore          9
        //    77: iload           9
        //    79: ifeq            123
        //    82: getstatic       com/whatsapp/gdrive/GoogleDriveService.V:Landroid/os/ConditionVariable;
        //    85: ldc2_w          86400000
        //    88: invokevirtual   android/os/ConditionVariable.block:(J)Z
        //    91: ifne            123
        //    94: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    97: bipush          52
        //    99: aaload         
        //   100: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   103: iconst_0       
        //   104: ireturn        
        //   105: astore          6
        //   107: aload           6
        //   109: athrow         
        //   110: astore_3       
        //   111: aload_3        
        //   112: athrow         
        //   113: astore          4
        //   115: aload           4
        //   117: athrow         
        //   118: astore          5
        //   120: aload           5
        //   122: athrow         
        //   123: iconst_1       
        //   124: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      4      31     34     Ljava/lang/NullPointerException;
        //  8      29     34     37     Ljava/lang/NullPointerException;
        //  32     34     34     37     Ljava/lang/NullPointerException;
        //  37     42     110    113    Ljava/lang/NullPointerException;
        //  47     58     113    118    Ljava/lang/NullPointerException;
        //  63     77     118    123    Ljava/lang/NullPointerException;
        //  82     103    105    110    Ljava/lang/NullPointerException;
        //  111    113    113    118    Ljava/lang/NullPointerException;
        //  115    118    118    123    Ljava/lang/NullPointerException;
        //  120    123    105    110    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 62, Size: 62
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
    
    private static int E() {
        return e().getInt(GoogleDriveService.bb[284], 0);
    }
    
    public static boolean F() {
        return b(2);
    }
    
    private static void G() {
        g(Environment.getExternalStorageState());
    }
    
    private boolean H() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore_1       
        //     4: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //     7: sipush          274
        //    10: aaload         
        //    11: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    14: iconst_1       
        //    15: getstatic       com/whatsapp/gdrive/GoogleDriveService.aa:[Ljava/io/File;
        //    18: arraylength    
        //    19: iadd           
        //    20: anewarray       Ljava/io/File;
        //    23: astore_2       
        //    24: aload_2        
        //    25: iconst_0       
        //    26: getstatic       com/whatsapp/gdrive/GoogleDriveService.D:Ljava/io/File;
        //    29: aastore        
        //    30: iconst_1       
        //    31: istore_3       
        //    32: getstatic       com/whatsapp/gdrive/GoogleDriveService.aa:[Ljava/io/File;
        //    35: astore          4
        //    37: aload           4
        //    39: arraylength    
        //    40: istore          5
        //    42: iconst_0       
        //    43: istore          6
        //    45: iload           6
        //    47: iload           5
        //    49: if_icmpge       76
        //    52: aload           4
        //    54: iload           6
        //    56: aaload         
        //    57: astore          78
        //    59: iload_3        
        //    60: iconst_1       
        //    61: iadd           
        //    62: istore          79
        //    64: aload_2        
        //    65: iload_3        
        //    66: aload           78
        //    68: aastore        
        //    69: iinc            6, 1
        //    72: iload_1        
        //    73: ifeq            1365
        //    76: aload_0        
        //    77: invokespecial   com/whatsapp/gdrive/GoogleDriveService.K:()Ljava/lang/String;
        //    80: ifnonnull       100
        //    83: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    86: sipush          264
        //    89: aaload         
        //    90: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    93: iconst_0       
        //    94: ireturn        
        //    95: astore          7
        //    97: aload           7
        //    99: athrow         
        //   100: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   103: sipush          278
        //   106: aaload         
        //   107: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   110: aload_0        
        //   111: invokespecial   com/whatsapp/gdrive/GoogleDriveService.C:()Z
        //   114: istore          9
        //   116: iload           9
        //   118: ifne            128
        //   121: iconst_0       
        //   122: ireturn        
        //   123: astore          8
        //   125: aload           8
        //   127: athrow         
        //   128: aload_0        
        //   129: iconst_0       
        //   130: invokespecial   com/whatsapp/gdrive/GoogleDriveService.b:(Z)Z
        //   133: istore          11
        //   135: iload           11
        //   137: ifne            147
        //   140: iconst_0       
        //   141: ireturn        
        //   142: astore          10
        //   144: aload           10
        //   146: athrow         
        //   147: aload_0        
        //   148: lconst_0       
        //   149: putfield        com/whatsapp/gdrive/GoogleDriveService.N:J
        //   152: new             Ljava/util/ArrayList;
        //   155: dup            
        //   156: sipush          1000
        //   159: invokespecial   java/util/ArrayList.<init>:(I)V
        //   162: invokestatic    java/util/Collections.synchronizedList:(Ljava/util/List;)Ljava/util/List;
        //   165: astore          12
        //   167: aload_0        
        //   168: getfield        com/whatsapp/gdrive/GoogleDriveService.M:Ljava/util/concurrent/atomic/AtomicLong;
        //   171: lconst_0       
        //   172: invokevirtual   java/util/concurrent/atomic/AtomicLong.set:(J)V
        //   175: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   178: sipush          266
        //   181: aaload         
        //   182: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   185: aload_2        
        //   186: arraylength    
        //   187: istore          13
        //   189: iconst_0       
        //   190: istore          14
        //   192: iload           14
        //   194: iload           13
        //   196: if_icmpge       231
        //   199: aload_2        
        //   200: iload           14
        //   202: aaload         
        //   203: astore          76
        //   205: aload           76
        //   207: ifnull          224
        //   210: aload_0        
        //   211: aload_0        
        //   212: getfield        com/whatsapp/gdrive/GoogleDriveService.Q:J
        //   215: aload           76
        //   217: invokestatic    com/whatsapp/gdrive/a7.b:(Ljava/io/File;)J
        //   220: ladd           
        //   221: putfield        com/whatsapp/gdrive/GoogleDriveService.Q:J
        //   224: iinc            14, 1
        //   227: iload_1        
        //   228: ifeq            192
        //   231: new             Ljava/lang/StringBuilder;
        //   234: dup            
        //   235: invokespecial   java/lang/StringBuilder.<init>:()V
        //   238: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   241: sipush          263
        //   244: aaload         
        //   245: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   248: aload_0        
        //   249: getfield        com/whatsapp/gdrive/GoogleDriveService.Q:J
        //   252: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   255: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   258: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   261: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   264: sipush          279
        //   267: aaload         
        //   268: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   271: new             Lcom/whatsapp/util/b0;
        //   274: dup            
        //   275: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   278: sipush          267
        //   281: aaload         
        //   282: invokespecial   com/whatsapp/util/b0.<init>:(Ljava/lang/String;)V
        //   285: astore          15
        //   287: aload_2        
        //   288: arraylength    
        //   289: istore          16
        //   291: iconst_1       
        //   292: istore          17
        //   294: iconst_0       
        //   295: istore          18
        //   297: iload           18
        //   299: iload           16
        //   301: if_icmpge       372
        //   304: aload_2        
        //   305: iload           18
        //   307: aaload         
        //   308: astore          72
        //   310: aload           72
        //   312: ifnull          365
        //   315: aload_0        
        //   316: invokespecial   com/whatsapp/gdrive/GoogleDriveService.C:()Z
        //   319: istore          75
        //   321: iload           75
        //   323: ifne            343
        //   326: iconst_0       
        //   327: ireturn        
        //   328: astore          77
        //   330: aload           77
        //   332: athrow         
        //   333: astore          73
        //   335: aload           73
        //   337: athrow         
        //   338: astore          74
        //   340: aload           74
        //   342: athrow         
        //   343: iload           17
        //   345: aload_0        
        //   346: aload           12
        //   348: aload           72
        //   350: invokespecial   com/whatsapp/gdrive/GoogleDriveService.b:(Ljava/util/List;Ljava/io/File;)Z
        //   353: iand           
        //   354: istore          17
        //   356: iload           17
        //   358: ifne            365
        //   361: iload_1        
        //   362: ifeq            372
        //   365: iinc            18, 1
        //   368: iload_1        
        //   369: ifeq            297
        //   372: aload           15
        //   374: invokevirtual   com/whatsapp/util/b0.c:()J
        //   377: pop2           
        //   378: iload           17
        //   380: ifne            400
        //   383: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   386: sipush          282
        //   389: aaload         
        //   390: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   393: iconst_0       
        //   394: ireturn        
        //   395: astore          19
        //   397: aload           19
        //   399: athrow         
        //   400: aload           12
        //   402: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   407: astore          22
        //   409: aload           22
        //   411: invokeinterface java/util/Iterator.hasNext:()Z
        //   416: ifeq            449
        //   419: aload           22
        //   421: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   426: checkcast       Ljava/io/File;
        //   429: astore          71
        //   431: aload_0        
        //   432: aload_0        
        //   433: getfield        com/whatsapp/gdrive/GoogleDriveService.N:J
        //   436: aload           71
        //   438: invokevirtual   java/io/File.length:()J
        //   441: ladd           
        //   442: putfield        com/whatsapp/gdrive/GoogleDriveService.N:J
        //   445: iload_1        
        //   446: ifeq            409
        //   449: aload_0        
        //   450: invokespecial   com/whatsapp/gdrive/GoogleDriveService.C:()Z
        //   453: istore          24
        //   455: iload           24
        //   457: ifne            467
        //   460: iconst_0       
        //   461: ireturn        
        //   462: astore          23
        //   464: aload           23
        //   466: athrow         
        //   467: getstatic       com/whatsapp/gdrive/GoogleDriveService.D:Ljava/io/File;
        //   470: invokevirtual   java/io/File.exists:()Z
        //   473: ifne            528
        //   476: aload_0        
        //   477: bipush          16
        //   479: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.e:(I)V
        //   482: new             Ljava/lang/StringBuilder;
        //   485: dup            
        //   486: invokespecial   java/lang/StringBuilder.<init>:()V
        //   489: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   492: sipush          268
        //   495: aaload         
        //   496: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   499: getstatic       com/whatsapp/gdrive/GoogleDriveService.D:Ljava/io/File;
        //   502: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   505: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   508: sipush          272
        //   511: aaload         
        //   512: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   515: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   518: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   521: iconst_0       
        //   522: ireturn        
        //   523: astore          25
        //   525: aload           25
        //   527: athrow         
        //   528: aload_0        
        //   529: getfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //   532: getstatic       com/whatsapp/gdrive/GoogleDriveService.D:Ljava/io/File;
        //   535: invokestatic    com/whatsapp/gdrive/a7.b:(Ljava/io/File;)J
        //   538: l2d            
        //   539: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   542: putfield        com/whatsapp/fieldstats/bd.i:Ljava/lang/Double;
        //   545: aload_0        
        //   546: getfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //   549: aload_0        
        //   550: getfield        com/whatsapp/gdrive/GoogleDriveService.Q:J
        //   553: l2d            
        //   554: aload_0        
        //   555: getfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //   558: getfield        com/whatsapp/fieldstats/bd.i:Ljava/lang/Double;
        //   561: invokevirtual   java/lang/Double.doubleValue:()D
        //   564: dsub           
        //   565: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   568: putfield        com/whatsapp/fieldstats/bd.g:Ljava/lang/Double;
        //   571: aload_0        
        //   572: aload_0        
        //   573: getfield        com/whatsapp/gdrive/GoogleDriveService.Q:J
        //   576: aload_0        
        //   577: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //   580: invokevirtual   com/whatsapp/gdrive/bq.i:()J
        //   583: ladd           
        //   584: putfield        com/whatsapp/gdrive/GoogleDriveService.Q:J
        //   587: aload_0        
        //   588: getfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //   591: aload_0        
        //   592: getfield        com/whatsapp/gdrive/GoogleDriveService.Q:J
        //   595: l2d            
        //   596: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   599: putfield        com/whatsapp/fieldstats/bd.f:Ljava/lang/Double;
        //   602: aload_0        
        //   603: getfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //   606: dconst_0       
        //   607: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   610: putfield        com/whatsapp/fieldstats/bd.d:Ljava/lang/Double;
        //   613: getstatic       com/whatsapp/gdrive/GoogleDriveService.w:Ljava/io/File;
        //   616: iconst_0       
        //   617: invokestatic    com/whatsapp/gdrive/a7.a:(Ljava/io/File;Z)J
        //   620: lstore          26
        //   622: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   625: invokevirtual   com/whatsapp/vy.G:()I
        //   628: i2l            
        //   629: lstore          28
        //   631: getstatic       com/whatsapp/gdrive/GoogleDriveService.c:I
        //   634: iconst_1       
        //   635: if_icmpne       653
        //   638: aload_0        
        //   639: getfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //   642: dconst_1       
        //   643: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   646: putfield        com/whatsapp/fieldstats/bd.j:Ljava/lang/Double;
        //   649: iload_1        
        //   650: ifeq            664
        //   653: aload_0        
        //   654: getfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //   657: dconst_0       
        //   658: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   661: putfield        com/whatsapp/fieldstats/bd.j:Ljava/lang/Double;
        //   664: getstatic       com/whatsapp/gdrive/GoogleDriveService.aa:[Ljava/io/File;
        //   667: astore          32
        //   669: aload           32
        //   671: arraylength    
        //   672: istore          33
        //   674: iconst_0       
        //   675: istore          34
        //   677: iload           34
        //   679: iload           33
        //   681: if_icmpge       734
        //   684: aload           32
        //   686: iload           34
        //   688: aaload         
        //   689: astore          69
        //   691: aload_0        
        //   692: getfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //   695: astore          70
        //   697: aload           70
        //   699: aload           70
        //   701: getfield        com/whatsapp/fieldstats/bd.d:Ljava/lang/Double;
        //   704: invokevirtual   java/lang/Double.doubleValue:()D
        //   707: aload           69
        //   709: iconst_0       
        //   710: invokestatic    com/whatsapp/gdrive/a7.a:(Ljava/io/File;Z)J
        //   713: l2d            
        //   714: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   717: invokevirtual   java/lang/Double.doubleValue:()D
        //   720: dadd           
        //   721: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   724: putfield        com/whatsapp/fieldstats/bd.d:Ljava/lang/Double;
        //   727: iinc            34, 1
        //   730: iload_1        
        //   731: ifeq            677
        //   734: invokestatic    com/whatsapp/gdrive/GoogleDriveService.I:()J
        //   737: lstore          35
        //   739: lload           35
        //   741: lconst_0       
        //   742: lcmp           
        //   743: ifge            757
        //   746: invokestatic    java/lang/System.currentTimeMillis:()J
        //   749: lstore          35
        //   751: lload           35
        //   753: invokestatic    com/whatsapp/gdrive/GoogleDriveService.d:(J)Z
        //   756: pop            
        //   757: lload           35
        //   759: lstore          37
        //   761: invokestatic    com/whatsapp/gdrive/GoogleDriveService.ai:()J
        //   764: lstore          39
        //   766: aload_0        
        //   767: getfield        com/whatsapp/gdrive/GoogleDriveService.T:Ljava/util/concurrent/atomic/AtomicLong;
        //   770: lload           39
        //   772: invokevirtual   java/util/concurrent/atomic/AtomicLong.set:(J)V
        //   775: aload_0        
        //   776: lload           39
        //   778: aload_0        
        //   779: getfield        com/whatsapp/gdrive/GoogleDriveService.N:J
        //   782: ladd           
        //   783: putfield        com/whatsapp/gdrive/GoogleDriveService.N:J
        //   786: aload_0        
        //   787: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //   790: aload_0        
        //   791: getfield        com/whatsapp/gdrive/GoogleDriveService.T:Ljava/util/concurrent/atomic/AtomicLong;
        //   794: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   797: aload_0        
        //   798: getfield        com/whatsapp/gdrive/GoogleDriveService.N:J
        //   801: invokevirtual   com/whatsapp/gdrive/aq.l:(JJ)V
        //   804: aload_0        
        //   805: getfield        com/whatsapp/gdrive/GoogleDriveService.k:Ljava/lang/String;
        //   808: ifnonnull       840
        //   811: aload_0        
        //   812: invokespecial   com/whatsapp/gdrive/GoogleDriveService.al:()Z
        //   815: ifne            840
        //   818: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   821: sipush          281
        //   824: aaload         
        //   825: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   828: iconst_0       
        //   829: ireturn        
        //   830: astore          30
        //   832: aload           30
        //   834: athrow         
        //   835: astore          31
        //   837: aload           31
        //   839: athrow         
        //   840: aload_0        
        //   841: invokespecial   com/whatsapp/gdrive/GoogleDriveService.ag:()Z
        //   844: ifne            857
        //   847: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   850: sipush          270
        //   853: aaload         
        //   854: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   857: iconst_1       
        //   858: istore          44
        //   860: aload_0        
        //   861: iconst_1       
        //   862: putfield        com/whatsapp/gdrive/GoogleDriveService.ab:Z
        //   865: aload_0        
        //   866: new             Ljava/util/concurrent/CountDownLatch;
        //   869: dup            
        //   870: aload           12
        //   872: invokeinterface java/util/List.size:()I
        //   877: invokespecial   java/util/concurrent/CountDownLatch.<init>:(I)V
        //   880: putfield        com/whatsapp/gdrive/GoogleDriveService.r:Ljava/util/concurrent/CountDownLatch;
        //   883: aload           12
        //   885: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   890: astore          45
        //   892: aload           45
        //   894: invokeinterface java/util/Iterator.hasNext:()Z
        //   899: ifeq            1358
        //   902: aload           45
        //   904: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   909: checkcast       Ljava/io/File;
        //   912: astore          67
        //   914: invokestatic    com/whatsapp/gdrive/GoogleDriveService.af:()Z
        //   917: ifne            959
        //   920: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   923: sipush          273
        //   926: aaload         
        //   927: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   930: aload_0        
        //   931: getfield        com/whatsapp/gdrive/GoogleDriveService.r:Ljava/util/concurrent/CountDownLatch;
        //   934: invokevirtual   java/util/concurrent/CountDownLatch.countDown:()V
        //   937: iconst_0       
        //   938: ireturn        
        //   939: astore          43
        //   941: aload           43
        //   943: athrow         
        //   944: astore          42
        //   946: aload           42
        //   948: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   951: aload_0        
        //   952: bipush          13
        //   954: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.e:(I)V
        //   957: iconst_0       
        //   958: ireturn        
        //   959: iload           44
        //   961: aload_0        
        //   962: aload           67
        //   964: invokespecial   com/whatsapp/gdrive/GoogleDriveService.a:(Ljava/io/File;)Z
        //   967: iand           
        //   968: istore          46
        //   970: iload_1        
        //   971: ifeq            1351
        //   974: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   977: sipush          265
        //   980: aaload         
        //   981: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   984: aload_0        
        //   985: getfield        com/whatsapp/gdrive/GoogleDriveService.r:Ljava/util/concurrent/CountDownLatch;
        //   988: ldc2_w          86400
        //   991: getstatic       java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        //   994: invokevirtual   java/util/concurrent/CountDownLatch.await:(JLjava/util/concurrent/TimeUnit;)Z
        //   997: istore          66
        //   999: iload           46
        //  1001: iload           66
        //  1003: iand           
        //  1004: istore          48
        //  1006: invokestatic    com/whatsapp/gdrive/GoogleDriveService.af:()Z
        //  1009: ifne            1044
        //  1012: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1015: sipush          277
        //  1018: aaload         
        //  1019: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1022: aload_0        
        //  1023: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  1026: invokevirtual   com/whatsapp/gdrive/aq.a:()V
        //  1029: iconst_0       
        //  1030: ireturn        
        //  1031: astore          47
        //  1033: aload           47
        //  1035: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //  1038: iconst_0       
        //  1039: istore          48
        //  1041: goto            1006
        //  1044: iload           48
        //  1046: aload_0        
        //  1047: getfield        com/whatsapp/gdrive/GoogleDriveService.ab:Z
        //  1050: iand           
        //  1051: istore          49
        //  1053: iload           49
        //  1055: ifeq            1320
        //  1058: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1061: sipush          269
        //  1064: aaload         
        //  1065: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1068: iconst_0       
        //  1069: istore          50
        //  1071: aload_0        
        //  1072: invokespecial   com/whatsapp/gdrive/GoogleDriveService.f:()Z
        //  1075: ifne            1080
        //  1078: iconst_0       
        //  1079: ireturn        
        //  1080: aload_0        
        //  1081: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //  1084: aload_0        
        //  1085: aload_0        
        //  1086: getfield        com/whatsapp/gdrive/GoogleDriveService.Q:J
        //  1089: getstatic       com/whatsapp/gdrive/GoogleDriveService.D:Ljava/io/File;
        //  1092: invokestatic    com/whatsapp/gdrive/a7.b:(Ljava/io/File;)J
        //  1095: aload_0        
        //  1096: getfield        com/whatsapp/gdrive/GoogleDriveService.Q:J
        //  1099: getstatic       com/whatsapp/gdrive/GoogleDriveService.D:Ljava/io/File;
        //  1102: invokestatic    com/whatsapp/gdrive/a7.b:(Ljava/io/File;)J
        //  1105: lsub           
        //  1106: lload           26
        //  1108: lload           28
        //  1110: invokestatic    com/whatsapp/gdrive/GoogleDriveService.ae:()I
        //  1113: invokestatic    com/whatsapp/gdrive/GoogleDriveService.y:()I
        //  1116: invokevirtual   com/whatsapp/gdrive/bq.a:(Lcom/whatsapp/gdrive/GoogleDriveService;JJJJJII)Z
        //  1119: istore          51
        //  1121: iload           51
        //  1123: istore          49
        //  1125: iload           49
        //  1127: ifeq            1134
        //  1130: iload_1        
        //  1131: ifeq            1161
        //  1134: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1137: sipush          283
        //  1140: aaload         
        //  1141: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1144: iload           50
        //  1146: invokestatic    com/whatsapp/gdrive/al.a:(I)V
        //  1149: iload           50
        //  1151: iconst_1       
        //  1152: iadd           
        //  1153: istore          53
        //  1155: iload           50
        //  1157: iconst_5       
        //  1158: if_icmplt       1344
        //  1161: iload           49
        //  1163: ifeq            1193
        //  1166: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1169: sipush          275
        //  1172: aaload         
        //  1173: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1176: aload_0        
        //  1177: invokespecial   com/whatsapp/gdrive/GoogleDriveService.aj:()Z
        //  1180: istore          65
        //  1182: iload           49
        //  1184: iload           65
        //  1186: iand           
        //  1187: istore          49
        //  1189: iload_1        
        //  1190: ifeq            1203
        //  1193: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1196: sipush          280
        //  1199: aaload         
        //  1200: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1203: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1206: lstore          55
        //  1208: aload_0        
        //  1209: getfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //  1212: aload_0        
        //  1213: getfield        com/whatsapp/gdrive/GoogleDriveService.N:J
        //  1216: l2d            
        //  1217: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  1220: putfield        com/whatsapp/fieldstats/bd.b:Ljava/lang/Double;
        //  1223: aload_0        
        //  1224: getfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //  1227: astore          58
        //  1229: aload_0        
        //  1230: getfield        com/whatsapp/gdrive/GoogleDriveService.N:J
        //  1233: lstore          59
        //  1235: aload_0        
        //  1236: getfield        com/whatsapp/gdrive/GoogleDriveService.Q:J
        //  1239: lstore          61
        //  1241: lload           59
        //  1243: lload           61
        //  1245: lcmp           
        //  1246: ifne            1338
        //  1249: dconst_1       
        //  1250: dstore          63
        //  1252: aload           58
        //  1254: dload           63
        //  1256: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  1259: putfield        com/whatsapp/fieldstats/bd.a:Ljava/lang/Double;
        //  1262: aload_0        
        //  1263: getfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //  1266: lload           55
        //  1268: lload           37
        //  1270: lsub           
        //  1271: l2d            
        //  1272: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  1275: putfield        com/whatsapp/fieldstats/bd.e:Ljava/lang/Double;
        //  1278: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1281: sipush          276
        //  1284: aaload         
        //  1285: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1288: iload           49
        //  1290: ireturn        
        //  1291: astore          52
        //  1293: aload           52
        //  1295: athrow         
        //  1296: astore          41
        //  1298: aload           41
        //  1300: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //  1303: aload_0        
        //  1304: aconst_null    
        //  1305: putfield        com/whatsapp/gdrive/GoogleDriveService.k:Ljava/lang/String;
        //  1308: aload_0        
        //  1309: aconst_null    
        //  1310: putfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //  1313: iconst_0       
        //  1314: ireturn        
        //  1315: astore          54
        //  1317: aload           54
        //  1319: athrow         
        //  1320: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1323: sipush          271
        //  1326: aaload         
        //  1327: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1330: goto            1203
        //  1333: astore          57
        //  1335: aload           57
        //  1337: athrow         
        //  1338: dconst_0       
        //  1339: dstore          63
        //  1341: goto            1252
        //  1344: iload           53
        //  1346: istore          50
        //  1348: goto            1071
        //  1351: iload           46
        //  1353: istore          44
        //  1355: goto            892
        //  1358: iload           44
        //  1360: istore          46
        //  1362: goto            974
        //  1365: iload           79
        //  1367: istore_3       
        //  1368: goto            45
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  76     93     95     100    Ljava/lang/InterruptedException;
        //  100    116    123    128    Ljava/lang/InterruptedException;
        //  128    135    142    147    Ljava/lang/InterruptedException;
        //  210    224    328    333    Ljava/lang/InterruptedException;
        //  315    321    333    343    Ljava/lang/InterruptedException;
        //  335    338    338    343    Ljava/lang/InterruptedException;
        //  372    378    395    400    Ljava/lang/InterruptedException;
        //  383    393    395    400    Ljava/lang/InterruptedException;
        //  449    455    462    467    Ljava/lang/InterruptedException;
        //  467    521    523    528    Ljava/lang/InterruptedException;
        //  631    649    830    835    Ljava/lang/InterruptedException;
        //  653    664    835    840    Ljava/lang/InterruptedException;
        //  804    828    944    959    Lcom/whatsapp/gdrive/b5;
        //  804    828    1296   1315   Lcom/whatsapp/gdrive/b3;
        //  832    835    835    840    Ljava/lang/InterruptedException;
        //  840    857    939    944    Ljava/lang/InterruptedException;
        //  840    857    944    959    Lcom/whatsapp/gdrive/b5;
        //  840    857    1296   1315   Lcom/whatsapp/gdrive/b3;
        //  860    892    944    959    Lcom/whatsapp/gdrive/b5;
        //  860    892    1296   1315   Lcom/whatsapp/gdrive/b3;
        //  892    937    944    959    Lcom/whatsapp/gdrive/b5;
        //  892    937    1296   1315   Lcom/whatsapp/gdrive/b3;
        //  941    944    944    959    Lcom/whatsapp/gdrive/b5;
        //  941    944    1296   1315   Lcom/whatsapp/gdrive/b3;
        //  959    970    944    959    Lcom/whatsapp/gdrive/b5;
        //  959    970    1296   1315   Lcom/whatsapp/gdrive/b3;
        //  974    984    944    959    Lcom/whatsapp/gdrive/b5;
        //  974    984    1296   1315   Lcom/whatsapp/gdrive/b3;
        //  984    999    1031   1044   Ljava/lang/InterruptedException;
        //  984    999    944    959    Lcom/whatsapp/gdrive/b5;
        //  984    999    1296   1315   Lcom/whatsapp/gdrive/b3;
        //  1006   1029   944    959    Lcom/whatsapp/gdrive/b5;
        //  1006   1029   1296   1315   Lcom/whatsapp/gdrive/b3;
        //  1033   1038   944    959    Lcom/whatsapp/gdrive/b5;
        //  1033   1038   1296   1315   Lcom/whatsapp/gdrive/b3;
        //  1044   1053   944    959    Lcom/whatsapp/gdrive/b5;
        //  1044   1053   1296   1315   Lcom/whatsapp/gdrive/b3;
        //  1058   1068   944    959    Lcom/whatsapp/gdrive/b5;
        //  1058   1068   1296   1315   Lcom/whatsapp/gdrive/b3;
        //  1071   1078   944    959    Lcom/whatsapp/gdrive/b5;
        //  1071   1078   1296   1315   Lcom/whatsapp/gdrive/b3;
        //  1080   1121   944    959    Lcom/whatsapp/gdrive/b5;
        //  1080   1121   1296   1315   Lcom/whatsapp/gdrive/b3;
        //  1134   1149   1291   1296   Ljava/lang/InterruptedException;
        //  1134   1149   944    959    Lcom/whatsapp/gdrive/b5;
        //  1134   1149   1296   1315   Lcom/whatsapp/gdrive/b3;
        //  1166   1182   944    959    Lcom/whatsapp/gdrive/b5;
        //  1166   1182   1296   1315   Lcom/whatsapp/gdrive/b3;
        //  1193   1203   1315   1320   Ljava/lang/InterruptedException;
        //  1193   1203   944    959    Lcom/whatsapp/gdrive/b5;
        //  1193   1203   1296   1315   Lcom/whatsapp/gdrive/b3;
        //  1208   1241   1333   1338   Ljava/lang/InterruptedException;
        //  1293   1296   944    959    Lcom/whatsapp/gdrive/b5;
        //  1293   1296   1296   1315   Lcom/whatsapp/gdrive/b3;
        //  1317   1320   944    959    Lcom/whatsapp/gdrive/b5;
        //  1317   1320   1296   1315   Lcom/whatsapp/gdrive/b3;
        //  1320   1330   944    959    Lcom/whatsapp/gdrive/b5;
        //  1320   1330   1296   1315   Lcom/whatsapp/gdrive/b3;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 651, Size: 651
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
    
    private static long I() {
        return e().getLong(GoogleDriveService.bb[321], -1L);
    }
    
    private boolean J() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore_1       
        //     4: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //     7: sipush          185
        //    10: aaload         
        //    11: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    14: invokestatic    com/whatsapp/gdrive/GoogleDriveService.X:()I
        //    17: ifeq            35
        //    20: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    23: sipush          167
        //    26: aaload         
        //    27: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    30: iconst_0       
        //    31: ireturn        
        //    32: astore_2       
        //    33: aload_2        
        //    34: athrow         
        //    35: aload_0        
        //    36: invokespecial   com/whatsapp/gdrive/GoogleDriveService.C:()Z
        //    39: istore          4
        //    41: iload           4
        //    43: ifne            51
        //    46: iconst_0       
        //    47: ireturn        
        //    48: astore_3       
        //    49: aload_3        
        //    50: athrow         
        //    51: iconst_0       
        //    52: istore          5
        //    54: aload_0        
        //    55: invokespecial   com/whatsapp/gdrive/GoogleDriveService.C:()Z
        //    58: ifne            63
        //    61: iconst_0       
        //    62: ireturn        
        //    63: aload_0        
        //    64: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //    67: aconst_null    
        //    68: aload_0        
        //    69: getfield        com/whatsapp/gdrive/GoogleDriveService.g:Ljava/lang/String;
        //    72: invokevirtual   com/whatsapp/gdrive/q.c:(Ljava/lang/String;Ljava/lang/String;)[Lcom/whatsapp/gdrive/ag;
        //    75: astore          6
        //    77: aload           6
        //    79: ifnull          86
        //    82: iload_1        
        //    83: ifeq            103
        //    86: iload           5
        //    88: invokestatic    com/whatsapp/gdrive/al.a:(I)V
        //    91: iload           5
        //    93: iconst_1       
        //    94: iadd           
        //    95: istore          8
        //    97: iload           5
        //    99: iconst_5       
        //   100: if_icmplt       1672
        //   103: aload           6
        //   105: ifnonnull       160
        //   108: new             Ljava/lang/StringBuilder;
        //   111: dup            
        //   112: invokespecial   java/lang/StringBuilder.<init>:()V
        //   115: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   118: sipush          184
        //   121: aaload         
        //   122: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   125: aload_0        
        //   126: getfield        com/whatsapp/gdrive/GoogleDriveService.g:Ljava/lang/String;
        //   129: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   132: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   135: sipush          175
        //   138: aaload         
        //   139: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   142: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   145: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   148: iconst_0       
        //   149: ireturn        
        //   150: astore          7
        //   152: aload           7
        //   154: athrow         
        //   155: astore          94
        //   157: aload           94
        //   159: athrow         
        //   160: new             Ljava/lang/StringBuilder;
        //   163: dup            
        //   164: invokespecial   java/lang/StringBuilder.<init>:()V
        //   167: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   170: sipush          181
        //   173: aaload         
        //   174: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   177: aload           6
        //   179: arraylength    
        //   180: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   183: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   186: sipush          187
        //   189: aaload         
        //   190: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   193: aload_0        
        //   194: getfield        com/whatsapp/gdrive/GoogleDriveService.g:Ljava/lang/String;
        //   197: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   200: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   203: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   206: aload           6
        //   208: arraylength    
        //   209: iconst_1       
        //   210: if_icmpne       239
        //   213: aload           6
        //   215: iconst_0       
        //   216: aaload         
        //   217: invokevirtual   com/whatsapp/gdrive/ag.b:()Ljava/lang/String;
        //   220: astore          10
        //   222: aload           10
        //   224: ifnonnull       559
        //   227: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   230: sipush          162
        //   233: aaload         
        //   234: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   237: iconst_0       
        //   238: ireturn        
        //   239: aload           6
        //   241: arraylength    
        //   242: istore          9
        //   244: aconst_null    
        //   245: astore          10
        //   247: iload           9
        //   249: iconst_1       
        //   250: if_icmple       222
        //   253: new             Ljava/lang/StringBuilder;
        //   256: dup            
        //   257: invokespecial   java/lang/StringBuilder.<init>:()V
        //   260: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   263: sipush          173
        //   266: aaload         
        //   267: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   270: aload_0        
        //   271: getfield        com/whatsapp/gdrive/GoogleDriveService.g:Ljava/lang/String;
        //   274: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   277: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   280: sipush          172
        //   283: aaload         
        //   284: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   287: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   290: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   293: aload           6
        //   295: arraylength    
        //   296: istore          11
        //   298: ldc2_w          -1
        //   301: lstore          12
        //   303: aconst_null    
        //   304: astore          14
        //   306: iconst_0       
        //   307: istore          15
        //   309: iload           15
        //   311: iload           11
        //   313: if_icmpge       1658
        //   316: aload           6
        //   318: iload           15
        //   320: aaload         
        //   321: astore          77
        //   323: aload_0        
        //   324: invokespecial   com/whatsapp/gdrive/GoogleDriveService.C:()Z
        //   327: istore          79
        //   329: iload           79
        //   331: ifne            341
        //   334: iconst_0       
        //   335: ireturn        
        //   336: astore          78
        //   338: aload           78
        //   340: athrow         
        //   341: iconst_0       
        //   342: istore          80
        //   344: aload_0        
        //   345: invokespecial   com/whatsapp/gdrive/GoogleDriveService.C:()Z
        //   348: ifne            353
        //   351: iconst_0       
        //   352: ireturn        
        //   353: aload_0        
        //   354: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //   357: aload           77
        //   359: invokevirtual   com/whatsapp/gdrive/ag.b:()Ljava/lang/String;
        //   362: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   365: sipush          180
        //   368: aaload         
        //   369: invokevirtual   com/whatsapp/gdrive/q.c:(Ljava/lang/String;Ljava/lang/String;)[Lcom/whatsapp/gdrive/ag;
        //   372: astore          81
        //   374: aload           81
        //   376: ifnonnull       396
        //   379: iload           80
        //   381: invokestatic    com/whatsapp/gdrive/al.a:(I)V
        //   384: iload           80
        //   386: iconst_1       
        //   387: iadd           
        //   388: istore          93
        //   390: iload           80
        //   392: iconst_5       
        //   393: if_icmplt       1651
        //   396: aload           81
        //   398: ifnonnull       444
        //   401: new             Ljava/lang/StringBuilder;
        //   404: dup            
        //   405: invokespecial   java/lang/StringBuilder.<init>:()V
        //   408: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   411: sipush          190
        //   414: aaload         
        //   415: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   418: aload           77
        //   420: invokevirtual   com/whatsapp/gdrive/ag.b:()Ljava/lang/String;
        //   423: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   426: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   429: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   432: iconst_0       
        //   433: ireturn        
        //   434: astore          92
        //   436: aload           92
        //   438: athrow         
        //   439: astore          91
        //   441: aload           91
        //   443: athrow         
        //   444: aload           81
        //   446: arraylength    
        //   447: ifne            464
        //   450: aload_0        
        //   451: aload           77
        //   453: invokevirtual   com/whatsapp/gdrive/ag.b:()Ljava/lang/String;
        //   456: invokespecial   com/whatsapp/gdrive/GoogleDriveService.e:(Ljava/lang/String;)Z
        //   459: pop            
        //   460: iload_1        
        //   461: ifeq            1644
        //   464: aload           81
        //   466: iconst_0       
        //   467: aaload         
        //   468: invokevirtual   com/whatsapp/gdrive/ag.h:()J
        //   471: lstore          83
        //   473: lload           83
        //   475: lload           12
        //   477: lcmp           
        //   478: ifle            1637
        //   481: aload           14
        //   483: ifnull          493
        //   486: aload_0        
        //   487: aload           14
        //   489: invokespecial   com/whatsapp/gdrive/GoogleDriveService.e:(Ljava/lang/String;)Z
        //   492: pop            
        //   493: aload           77
        //   495: invokevirtual   com/whatsapp/gdrive/ag.b:()Ljava/lang/String;
        //   498: astore          10
        //   500: iload_1        
        //   501: ifeq            1665
        //   504: lload           83
        //   506: lstore          12
        //   508: aload_0        
        //   509: aload           77
        //   511: invokevirtual   com/whatsapp/gdrive/ag.b:()Ljava/lang/String;
        //   514: invokespecial   com/whatsapp/gdrive/GoogleDriveService.e:(Ljava/lang/String;)Z
        //   517: pop            
        //   518: iload           15
        //   520: iconst_1       
        //   521: iadd           
        //   522: istore          87
        //   524: iload_1        
        //   525: ifne            222
        //   528: iload           87
        //   530: istore          15
        //   532: aload           10
        //   534: astore          14
        //   536: goto            309
        //   539: astore          82
        //   541: aload           82
        //   543: athrow         
        //   544: astore          88
        //   546: aload           88
        //   548: athrow         
        //   549: astore          85
        //   551: aload           85
        //   553: athrow         
        //   554: astore          76
        //   556: aload           76
        //   558: athrow         
        //   559: aload_0        
        //   560: aload           10
        //   562: putfield        com/whatsapp/gdrive/GoogleDriveService.k:Ljava/lang/String;
        //   565: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   568: sipush          163
        //   571: aaload         
        //   572: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   575: aload_0        
        //   576: new             Lcom/whatsapp/gdrive/bq;
        //   579: dup            
        //   580: aload_0        
        //   581: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //   584: aload_0        
        //   585: getfield        com/whatsapp/gdrive/GoogleDriveService.k:Ljava/lang/String;
        //   588: aconst_null    
        //   589: invokespecial   com/whatsapp/gdrive/bq.<init>:(Lcom/whatsapp/gdrive/q;Ljava/lang/String;Lcom/whatsapp/gdrive/ag;)V
        //   592: putfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //   595: aload_0        
        //   596: invokespecial   com/whatsapp/gdrive/GoogleDriveService.C:()Z
        //   599: istore          17
        //   601: iload           17
        //   603: ifne            613
        //   606: iconst_0       
        //   607: ireturn        
        //   608: astore          16
        //   610: aload           16
        //   612: athrow         
        //   613: aload_0        
        //   614: iconst_0       
        //   615: invokespecial   com/whatsapp/gdrive/GoogleDriveService.b:(Z)Z
        //   618: ifeq            699
        //   621: aload_0        
        //   622: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //   625: invokevirtual   com/whatsapp/gdrive/bq.n:()I
        //   628: istore          21
        //   630: iload           21
        //   632: ifle            699
        //   635: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   638: sipush          182
        //   641: aaload         
        //   642: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   645: aload_0        
        //   646: invokespecial   com/whatsapp/gdrive/GoogleDriveService.j:()Z
        //   649: istore          22
        //   651: iload           22
        //   653: ifeq            683
        //   656: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   659: sipush          170
        //   662: aaload         
        //   663: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   666: iconst_0       
        //   667: ireturn        
        //   668: astore          18
        //   670: aload           18
        //   672: athrow         
        //   673: astore          19
        //   675: aload           19
        //   677: athrow         
        //   678: astore          20
        //   680: aload           20
        //   682: athrow         
        //   683: aload_0        
        //   684: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //   687: aload           10
        //   689: invokevirtual   com/whatsapp/gdrive/q.j:(Ljava/lang/String;)Ljava/util/List;
        //   692: astore          23
        //   694: aload           23
        //   696: ifnonnull       701
        //   699: iconst_1       
        //   700: ireturn        
        //   701: aload           23
        //   703: invokeinterface java/util/List.size:()I
        //   708: istore          24
        //   710: new             Ljava/util/ArrayList;
        //   713: dup            
        //   714: bipush          100
        //   716: invokespecial   java/util/ArrayList.<init>:(I)V
        //   719: astore          25
        //   721: iconst_0       
        //   722: istore          26
        //   724: iload           26
        //   726: aload           23
        //   728: invokeinterface java/util/List.size:()I
        //   733: if_icmpge       1016
        //   736: aload           25
        //   738: invokeinterface java/util/List.size:()I
        //   743: bipush          100
        //   745: if_icmpge       1016
        //   748: aload_0        
        //   749: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //   752: iload           26
        //   754: bipush          100
        //   756: imul           
        //   757: aload           23
        //   759: invokeinterface java/util/List.size:()I
        //   764: idiv           
        //   765: invokevirtual   com/whatsapp/gdrive/aq.d:(I)V
        //   768: aload           23
        //   770: iload           26
        //   772: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   777: checkcast       Lcom/whatsapp/gdrive/ag;
        //   780: astore          55
        //   782: aload           55
        //   784: invokevirtual   com/whatsapp/gdrive/ag.b:()Ljava/lang/String;
        //   787: ifnonnull       832
        //   790: new             Ljava/lang/StringBuilder;
        //   793: dup            
        //   794: invokespecial   java/lang/StringBuilder.<init>:()V
        //   797: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   800: sipush          165
        //   803: aaload         
        //   804: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   807: aload           55
        //   809: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   812: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   815: sipush          174
        //   818: aaload         
        //   819: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   822: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   825: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   828: iload_1        
        //   829: ifeq            1006
        //   832: aload           55
        //   834: invokevirtual   com/whatsapp/gdrive/ag.b:()Ljava/lang/String;
        //   837: aload_0        
        //   838: invokespecial   com/whatsapp/gdrive/GoogleDriveService.K:()Ljava/lang/String;
        //   841: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   844: istore          65
        //   846: iload           65
        //   848: ifeq            855
        //   851: iload_1        
        //   852: ifeq            1006
        //   855: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   858: sipush          188
        //   861: aaload         
        //   862: aload           55
        //   864: invokevirtual   com/whatsapp/gdrive/ag.g:()Ljava/lang/String;
        //   867: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   870: istore          66
        //   872: iload           66
        //   874: ifeq            881
        //   877: iload_1        
        //   878: ifeq            1006
        //   881: aload_0        
        //   882: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //   885: aload           55
        //   887: invokevirtual   com/whatsapp/gdrive/ag.b:()Ljava/lang/String;
        //   890: invokevirtual   com/whatsapp/gdrive/bq.f:(Ljava/lang/String;)Z
        //   893: istore          67
        //   895: iload           67
        //   897: ifne            961
        //   900: aload           55
        //   902: invokevirtual   com/whatsapp/gdrive/ag.a:()Z
        //   905: istore          74
        //   907: iload           74
        //   909: ifne            926
        //   912: aload           25
        //   914: aload           55
        //   916: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   921: pop            
        //   922: iload_1        
        //   923: ifeq            1006
        //   926: new             Ljava/lang/StringBuilder;
        //   929: dup            
        //   930: invokespecial   java/lang/StringBuilder.<init>:()V
        //   933: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   936: sipush          192
        //   939: aaload         
        //   940: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   943: aload           55
        //   945: invokevirtual   com/whatsapp/gdrive/ag.b:()Ljava/lang/String;
        //   948: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   951: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   954: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   957: iload_1        
        //   958: ifeq            1006
        //   961: new             Ljava/io/File;
        //   964: dup            
        //   965: getstatic       com/whatsapp/App.M:Ljava/io/File;
        //   968: aload           55
        //   970: invokevirtual   com/whatsapp/gdrive/ag.g:()Ljava/lang/String;
        //   973: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   976: astore          68
        //   978: aload           68
        //   980: invokevirtual   java/io/File.exists:()Z
        //   983: ifne            1006
        //   986: getstatic       com/whatsapp/gdrive/GoogleDriveService.x:Z
        //   989: istore          72
        //   991: iload           72
        //   993: ifeq            1006
        //   996: aload           25
        //   998: aload           55
        //  1000: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  1005: pop            
        //  1006: iload           26
        //  1008: iconst_1       
        //  1009: iadd           
        //  1010: istore          71
        //  1012: iload_1        
        //  1013: ifeq            1630
        //  1016: aload           25
        //  1018: invokeinterface java/util/List.size:()I
        //  1023: istore          27
        //  1025: iload           27
        //  1027: bipush          100
        //  1029: if_icmpne       1070
        //  1032: new             Ljava/lang/StringBuilder;
        //  1035: dup            
        //  1036: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1039: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1042: sipush          191
        //  1045: aaload         
        //  1046: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1049: iload           27
        //  1051: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1054: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1057: sipush          171
        //  1060: aaload         
        //  1061: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1064: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1067: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1070: aload           25
        //  1072: invokeinterface java/util/List.size:()I
        //  1077: ifne            1094
        //  1080: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1083: sipush          178
        //  1086: aaload         
        //  1087: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1090: iload_1        
        //  1091: ifeq            1395
        //  1094: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1097: sipush          186
        //  1100: aaload         
        //  1101: astore          31
        //  1103: iconst_1       
        //  1104: anewarray       Ljava/lang/Object;
        //  1107: astore          32
        //  1109: aload           32
        //  1111: iconst_0       
        //  1112: iload           27
        //  1114: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1117: aastore        
        //  1118: aload           31
        //  1120: aload           32
        //  1122: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //  1125: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1128: aload_0        
        //  1129: invokespecial   com/whatsapp/gdrive/GoogleDriveService.j:()Z
        //  1132: istore          33
        //  1134: iload           33
        //  1136: ifeq            1226
        //  1139: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1142: sipush          168
        //  1145: aaload         
        //  1146: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1149: iconst_0       
        //  1150: ireturn        
        //  1151: astore          56
        //  1153: aload           56
        //  1155: athrow         
        //  1156: astore          57
        //  1158: aload           57
        //  1160: athrow         
        //  1161: astore          58
        //  1163: aload           58
        //  1165: athrow         
        //  1166: astore          59
        //  1168: aload           59
        //  1170: athrow         
        //  1171: astore          60
        //  1173: aload           60
        //  1175: athrow         
        //  1176: astore          61
        //  1178: aload           61
        //  1180: athrow         
        //  1181: astore          62
        //  1183: aload           62
        //  1185: athrow         
        //  1186: astore          63
        //  1188: aload           63
        //  1190: athrow         
        //  1191: astore          64
        //  1193: aload           64
        //  1195: athrow         
        //  1196: astore          69
        //  1198: aload           69
        //  1200: athrow         
        //  1201: astore          70
        //  1203: aload           70
        //  1205: athrow         
        //  1206: astore          54
        //  1208: aload           54
        //  1210: athrow         
        //  1211: astore          28
        //  1213: aload           28
        //  1215: athrow         
        //  1216: astore          29
        //  1218: aload           29
        //  1220: athrow         
        //  1221: astore          30
        //  1223: aload           30
        //  1225: athrow         
        //  1226: iconst_0       
        //  1227: istore          34
        //  1229: aload_0        
        //  1230: invokespecial   com/whatsapp/gdrive/GoogleDriveService.C:()Z
        //  1233: ifne            1238
        //  1236: iconst_0       
        //  1237: ireturn        
        //  1238: aload_0        
        //  1239: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //  1242: aload           25
        //  1244: invokevirtual   com/whatsapp/gdrive/q.a:(Ljava/util/List;)Z
        //  1247: istore          35
        //  1249: iload           35
        //  1251: ifeq            1332
        //  1254: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1257: sipush          169
        //  1260: aaload         
        //  1261: astore          50
        //  1263: iconst_2       
        //  1264: anewarray       Ljava/lang/Object;
        //  1267: astore          51
        //  1269: aload           51
        //  1271: iconst_0       
        //  1272: iload           27
        //  1274: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1277: aastore        
        //  1278: aload           51
        //  1280: iconst_1       
        //  1281: iload           24
        //  1283: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1286: aastore        
        //  1287: aload           50
        //  1289: aload           51
        //  1291: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //  1294: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1297: aload_0        
        //  1298: invokespecial   com/whatsapp/gdrive/GoogleDriveService.ag:()Z
        //  1301: pop            
        //  1302: iload           35
        //  1304: ifne            1395
        //  1307: iconst_0       
        //  1308: ireturn        
        //  1309: astore          49
        //  1311: aload           49
        //  1313: athrow         
        //  1314: astore          52
        //  1316: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1319: sipush          176
        //  1322: aaload         
        //  1323: aload           52
        //  1325: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1328: iload_1        
        //  1329: ifeq            1302
        //  1332: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1335: sipush          177
        //  1338: aaload         
        //  1339: astore          37
        //  1341: iconst_1       
        //  1342: anewarray       Ljava/lang/Object;
        //  1345: astore          38
        //  1347: aload           38
        //  1349: iconst_0       
        //  1350: iload           27
        //  1352: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1355: aastore        
        //  1356: aload           37
        //  1358: aload           38
        //  1360: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //  1363: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  1366: iload           34
        //  1368: invokestatic    com/whatsapp/gdrive/al.a:(I)V
        //  1371: iload           34
        //  1373: iconst_1       
        //  1374: iadd           
        //  1375: istore          39
        //  1377: iload           34
        //  1379: iconst_5       
        //  1380: if_icmpge       1302
        //  1383: iload           39
        //  1385: istore          34
        //  1387: goto            1229
        //  1390: astore          36
        //  1392: aload           36
        //  1394: athrow         
        //  1395: aload_0        
        //  1396: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  1399: bipush          100
        //  1401: invokevirtual   com/whatsapp/gdrive/aq.d:(I)V
        //  1404: iload           24
        //  1406: aload_0        
        //  1407: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //  1410: invokevirtual   com/whatsapp/gdrive/bq.n:()I
        //  1413: if_icmpge       699
        //  1416: aload_0        
        //  1417: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //  1420: invokevirtual   com/whatsapp/gdrive/bq.g:()Ljava/util/Set;
        //  1423: astore          40
        //  1425: new             Ljava/util/TreeSet;
        //  1428: dup            
        //  1429: invokespecial   java/util/TreeSet.<init>:()V
        //  1432: astore          41
        //  1434: aload           23
        //  1436: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1441: astore          42
        //  1443: aload           42
        //  1445: invokeinterface java/util/Iterator.hasNext:()Z
        //  1450: ifeq            1478
        //  1453: aload           41
        //  1455: aload           42
        //  1457: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1462: checkcast       Lcom/whatsapp/gdrive/ag;
        //  1465: invokevirtual   com/whatsapp/gdrive/ag.b:()Ljava/lang/String;
        //  1468: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //  1473: pop            
        //  1474: iload_1        
        //  1475: ifeq            1443
        //  1478: aload           40
        //  1480: aload           41
        //  1482: invokeinterface java/util/Set.removeAll:(Ljava/util/Collection;)Z
        //  1487: pop            
        //  1488: aload           40
        //  1490: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //  1495: astore          44
        //  1497: aload           44
        //  1499: invokeinterface java/util/Iterator.hasNext:()Z
        //  1504: ifeq            1583
        //  1507: aload           44
        //  1509: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1514: checkcast       Ljava/lang/String;
        //  1517: astore          47
        //  1519: new             Ljava/lang/StringBuilder;
        //  1522: dup            
        //  1523: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1526: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1529: sipush          179
        //  1532: aaload         
        //  1533: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1536: aload           47
        //  1538: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1541: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1544: sipush          183
        //  1547: aaload         
        //  1548: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1551: aload_0        
        //  1552: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //  1555: aload           47
        //  1557: invokevirtual   com/whatsapp/gdrive/bq.b:(Ljava/lang/String;)Ljava/lang/String;
        //  1560: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1563: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1566: sipush          189
        //  1569: aaload         
        //  1570: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1573: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1576: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1579: iload_1        
        //  1580: ifeq            1497
        //  1583: aload_0        
        //  1584: invokespecial   com/whatsapp/gdrive/GoogleDriveService.ag:()Z
        //  1587: ifne            699
        //  1590: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1593: sipush          166
        //  1596: aaload         
        //  1597: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  1600: goto            699
        //  1603: astore          46
        //  1605: aload           46
        //  1607: athrow         
        //  1608: astore          45
        //  1610: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1613: sipush          164
        //  1616: aaload         
        //  1617: aload           45
        //  1619: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1622: goto            699
        //  1625: astore          45
        //  1627: goto            1610
        //  1630: iload           71
        //  1632: istore          26
        //  1634: goto            724
        //  1637: aload           14
        //  1639: astore          10
        //  1641: goto            508
        //  1644: aload           14
        //  1646: astore          10
        //  1648: goto            518
        //  1651: iload           93
        //  1653: istore          80
        //  1655: goto            344
        //  1658: aload           14
        //  1660: astore          10
        //  1662: goto            222
        //  1665: lload           83
        //  1667: lstore          12
        //  1669: goto            518
        //  1672: iload           8
        //  1674: istore          5
        //  1676: goto            54
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      30     32     35     Lcom/whatsapp/gdrive/b2;
        //  35     41     48     51     Lcom/whatsapp/gdrive/b2;
        //  86     91     150    155    Lcom/whatsapp/gdrive/b2;
        //  108    148    155    160    Lcom/whatsapp/gdrive/b2;
        //  227    237    554    559    Lcom/whatsapp/gdrive/b2;
        //  323    329    336    341    Lcom/whatsapp/gdrive/b2;
        //  379    384    434    439    Lcom/whatsapp/gdrive/b2;
        //  401    432    439    444    Lcom/whatsapp/gdrive/b2;
        //  444    460    539    544    Lcom/whatsapp/gdrive/b2;
        //  486    493    544    549    Lcom/whatsapp/gdrive/b2;
        //  508    518    549    554    Lcom/whatsapp/gdrive/b2;
        //  559    601    608    613    Lcom/whatsapp/gdrive/b2;
        //  613    630    668    673    Lcom/whatsapp/gdrive/b2;
        //  635    651    673    678    Lcom/whatsapp/gdrive/b2;
        //  656    666    678    683    Lcom/whatsapp/gdrive/b2;
        //  670    673    673    678    Lcom/whatsapp/gdrive/b2;
        //  675    678    678    683    Lcom/whatsapp/gdrive/b2;
        //  782    828    1151   1156   Lcom/whatsapp/gdrive/b2;
        //  832    846    1156   1166   Lcom/whatsapp/gdrive/b2;
        //  855    872    1166   1176   Lcom/whatsapp/gdrive/b2;
        //  881    895    1176   1181   Lcom/whatsapp/gdrive/b2;
        //  900    907    1181   1186   Lcom/whatsapp/gdrive/b2;
        //  912    922    1186   1191   Lcom/whatsapp/gdrive/b2;
        //  926    957    1191   1196   Lcom/whatsapp/gdrive/b2;
        //  978    991    1196   1201   Lcom/whatsapp/gdrive/b2;
        //  996    1006   1201   1206   Lcom/whatsapp/gdrive/b2;
        //  1032   1070   1206   1211   Lcom/whatsapp/gdrive/b2;
        //  1070   1090   1211   1216   Lcom/whatsapp/gdrive/b2;
        //  1094   1134   1216   1221   Lcom/whatsapp/gdrive/b2;
        //  1139   1149   1221   1226   Lcom/whatsapp/gdrive/b2;
        //  1153   1156   1156   1166   Lcom/whatsapp/gdrive/b2;
        //  1158   1161   1161   1166   Lcom/whatsapp/gdrive/b2;
        //  1163   1166   1166   1176   Lcom/whatsapp/gdrive/b2;
        //  1168   1171   1171   1176   Lcom/whatsapp/gdrive/b2;
        //  1173   1176   1176   1181   Lcom/whatsapp/gdrive/b2;
        //  1178   1181   1181   1186   Lcom/whatsapp/gdrive/b2;
        //  1183   1186   1186   1191   Lcom/whatsapp/gdrive/b2;
        //  1188   1191   1191   1196   Lcom/whatsapp/gdrive/b2;
        //  1198   1201   1201   1206   Lcom/whatsapp/gdrive/b2;
        //  1213   1216   1216   1221   Lcom/whatsapp/gdrive/b2;
        //  1218   1221   1221   1226   Lcom/whatsapp/gdrive/b2;
        //  1254   1297   1309   1314   Ljava/lang/NullPointerException;
        //  1297   1302   1314   1332   Lcom/whatsapp/gdrive/b2;
        //  1297   1302   1309   1314   Ljava/lang/NullPointerException;
        //  1316   1328   1390   1395   Lcom/whatsapp/gdrive/b2;
        //  1332   1371   1390   1395   Lcom/whatsapp/gdrive/b2;
        //  1583   1600   1603   1608   Ljava/lang/NullPointerException;
        //  1583   1600   1608   1610   Lcom/whatsapp/gdrive/b3;
        //  1583   1600   1625   1630   Lcom/whatsapp/gdrive/b5;
        //  1605   1608   1608   1610   Lcom/whatsapp/gdrive/b3;
        //  1605   1608   1625   1630   Lcom/whatsapp/gdrive/b5;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 774, Size: 774
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
    
    private String K() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/gdrive/GoogleDriveService.k:Ljava/lang/String;
        //     8: ifnull          23
        //    11: aload_0        
        //    12: getfield        com/whatsapp/gdrive/GoogleDriveService.k:Ljava/lang/String;
        //    15: astore          28
        //    17: aload           28
        //    19: areturn        
        //    20: astore_2       
        //    21: aload_2        
        //    22: athrow         
        //    23: aload_0        
        //    24: getfield        com/whatsapp/gdrive/GoogleDriveService.g:Ljava/lang/String;
        //    27: ifnonnull       45
        //    30: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    33: sipush          294
        //    36: aaload         
        //    37: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    40: aconst_null    
        //    41: areturn        
        //    42: astore_3       
        //    43: aload_3        
        //    44: athrow         
        //    45: iconst_0       
        //    46: istore          4
        //    48: aload_0        
        //    49: invokespecial   com/whatsapp/gdrive/GoogleDriveService.f:()Z
        //    52: ifne            57
        //    55: aconst_null    
        //    56: areturn        
        //    57: aload_0        
        //    58: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //    61: aconst_null    
        //    62: aload_0        
        //    63: invokestatic    com/whatsapp/gdrive/GoogleDriveService.a:(Landroid/content/Context;)Ljava/lang/String;
        //    66: invokevirtual   com/whatsapp/gdrive/q.c:(Ljava/lang/String;Ljava/lang/String;)[Lcom/whatsapp/gdrive/ag;
        //    69: astore          5
        //    71: aload           5
        //    73: ifnonnull       85
        //    76: iload           4
        //    78: invokestatic    com/whatsapp/gdrive/al.a:(I)V
        //    81: iload_1        
        //    82: ifeq            453
        //    85: aload           5
        //    87: arraylength    
        //    88: istore          7
        //    90: iload           7
        //    92: ifne            109
        //    95: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    98: sipush          295
        //   101: aaload         
        //   102: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   105: iload_1        
        //   106: ifeq            465
        //   109: aload           5
        //   111: arraylength    
        //   112: istore          9
        //   114: iload           9
        //   116: iconst_1       
        //   117: if_icmpne       210
        //   120: aload           5
        //   122: iconst_0       
        //   123: aaload         
        //   124: astore          13
        //   126: aload           13
        //   128: ifnull          140
        //   131: aload_0        
        //   132: aload           13
        //   134: invokevirtual   com/whatsapp/gdrive/ag.b:()Ljava/lang/String;
        //   137: putfield        com/whatsapp/gdrive/GoogleDriveService.k:Ljava/lang/String;
        //   140: aload_0        
        //   141: getfield        com/whatsapp/gdrive/GoogleDriveService.k:Ljava/lang/String;
        //   144: astore          18
        //   146: aload           18
        //   148: ifnonnull       496
        //   151: aload_0        
        //   152: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //   155: astore          19
        //   157: aload           19
        //   159: ifnull          176
        //   162: aload_0        
        //   163: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //   166: invokevirtual   com/whatsapp/gdrive/bq.n:()I
        //   169: istore          21
        //   171: iload           21
        //   173: ifgt            185
        //   176: aload_0        
        //   177: invokespecial   com/whatsapp/gdrive/GoogleDriveService.al:()Z
        //   180: pop            
        //   181: iload_1        
        //   182: ifeq            496
        //   185: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   188: sipush          298
        //   191: aaload         
        //   192: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   195: invokestatic    java/lang/Thread.dumpStack:()V
        //   198: aconst_null    
        //   199: areturn        
        //   200: astore          6
        //   202: aload           6
        //   204: athrow         
        //   205: astore          8
        //   207: aload           8
        //   209: athrow         
        //   210: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   213: sipush          291
        //   216: aaload         
        //   217: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   220: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   223: sipush          288
        //   226: aaload         
        //   227: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   230: iconst_m1      
        //   231: istore          10
        //   233: aload           5
        //   235: arraylength    
        //   236: istore          11
        //   238: iconst_0       
        //   239: istore          12
        //   241: aconst_null    
        //   242: astore          13
        //   244: iload           12
        //   246: iload           11
        //   248: if_icmpge       399
        //   251: aload           5
        //   253: iload           12
        //   255: aaload         
        //   256: astore          23
        //   258: aload_0        
        //   259: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //   262: aload           23
        //   264: invokevirtual   com/whatsapp/gdrive/ag.b:()Ljava/lang/String;
        //   267: invokevirtual   com/whatsapp/gdrive/q.j:(Ljava/lang/String;)Ljava/util/List;
        //   270: astore          24
        //   272: aload           24
        //   274: ifnonnull       322
        //   277: new             Ljava/lang/StringBuilder;
        //   280: dup            
        //   281: invokespecial   java/lang/StringBuilder.<init>:()V
        //   284: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   287: sipush          289
        //   290: aaload         
        //   291: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   294: aload           23
        //   296: invokevirtual   com/whatsapp/gdrive/ag.b:()Ljava/lang/String;
        //   299: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   302: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   305: sipush          296
        //   308: aaload         
        //   309: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   312: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   315: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   318: iload_1        
        //   319: ifeq            392
        //   322: aload           24
        //   324: invokeinterface java/util/List.size:()I
        //   329: istore          25
        //   331: new             Ljava/lang/StringBuilder;
        //   334: dup            
        //   335: invokespecial   java/lang/StringBuilder.<init>:()V
        //   338: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   341: sipush          292
        //   344: aaload         
        //   345: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   348: aload           23
        //   350: invokevirtual   com/whatsapp/gdrive/ag.b:()Ljava/lang/String;
        //   353: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   356: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   359: sipush          293
        //   362: aaload         
        //   363: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   366: iload           25
        //   368: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   371: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   374: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   377: iload           25
        //   379: iload           10
        //   381: if_icmple       392
        //   384: iload           25
        //   386: istore          10
        //   388: aload           23
        //   390: astore          13
        //   392: iinc            12, 1
        //   395: iload_1        
        //   396: ifeq            244
        //   399: new             Ljava/lang/StringBuilder;
        //   402: dup            
        //   403: invokespecial   java/lang/StringBuilder.<init>:()V
        //   406: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   409: sipush          297
        //   412: aaload         
        //   413: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   416: aload           13
        //   418: invokevirtual   com/whatsapp/gdrive/ag.b:()Ljava/lang/String;
        //   421: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   424: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   427: sipush          290
        //   430: aaload         
        //   431: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   434: iload           10
        //   436: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   439: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   442: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   445: goto            126
        //   448: astore          26
        //   450: aload           26
        //   452: athrow         
        //   453: iload           4
        //   455: iconst_1       
        //   456: iadd           
        //   457: istore          27
        //   459: iload           4
        //   461: iconst_5       
        //   462: if_icmplt       501
        //   465: aconst_null    
        //   466: astore          13
        //   468: goto            126
        //   471: astore          22
        //   473: aload           22
        //   475: athrow         
        //   476: astore          14
        //   478: aload           14
        //   480: athrow         
        //   481: astore          15
        //   483: aload           15
        //   485: athrow         
        //   486: astore          16
        //   488: aload           16
        //   490: athrow         
        //   491: astore          17
        //   493: aload           17
        //   495: athrow         
        //   496: aload_0        
        //   497: getfield        com/whatsapp/gdrive/GoogleDriveService.k:Ljava/lang/String;
        //   500: areturn        
        //   501: iload           27
        //   503: istore          4
        //   505: goto            48
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      17     20     23     Ljava/lang/NullPointerException;
        //  23     40     42     45     Ljava/lang/NullPointerException;
        //  76     81     200    205    Ljava/lang/NullPointerException;
        //  85     90     200    205    Ljava/lang/NullPointerException;
        //  109    114    205    210    Ljava/lang/NullPointerException;
        //  131    140    471    476    Ljava/lang/NullPointerException;
        //  140    146    476    481    Ljava/lang/NullPointerException;
        //  151    157    481    486    Ljava/lang/NullPointerException;
        //  162    171    486    491    Ljava/lang/NullPointerException;
        //  176    181    491    496    Ljava/lang/NullPointerException;
        //  185    198    491    496    Ljava/lang/NullPointerException;
        //  277    318    448    453    Ljava/lang/NullPointerException;
        //  478    481    481    486    Ljava/lang/NullPointerException;
        //  483    486    486    491    Ljava/lang/NullPointerException;
        //  488    491    491    496    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 240, Size: 240
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
    
    private boolean L() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/whatsapp/gdrive/GoogleDriveService.e:()Landroid/content/SharedPreferences;
        //     3: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //     8: astore_1       
        //     9: aload_0        
        //    10: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //    13: ifnonnull       30
        //    16: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    19: bipush          122
        //    21: aaload         
        //    22: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    25: iconst_0       
        //    26: ireturn        
        //    27: astore_2       
        //    28: aload_2        
        //    29: athrow         
        //    30: aload_0        
        //    31: getfield        com/whatsapp/gdrive/GoogleDriveService.B:Ljava/lang/String;
        //    34: ifnull          78
        //    37: aload_0        
        //    38: getfield        com/whatsapp/gdrive/GoogleDriveService.B:Ljava/lang/String;
        //    41: invokestatic    com/whatsapp/gdrive/GoogleDriveService.h:(Ljava/lang/String;)Z
        //    44: pop            
        //    45: aload_0        
        //    46: getfield        com/whatsapp/gdrive/GoogleDriveService.B:Ljava/lang/String;
        //    49: aload_0        
        //    50: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //    53: invokevirtual   com/whatsapp/gdrive/bq.d:()Lcom/whatsapp/gdrive/ag;
        //    56: invokevirtual   com/whatsapp/gdrive/ag.h:()J
        //    59: invokestatic    com/whatsapp/gdrive/GoogleDriveService.b:(Ljava/lang/String;J)Z
        //    62: pop            
        //    63: aload_0        
        //    64: getfield        com/whatsapp/gdrive/GoogleDriveService.B:Ljava/lang/String;
        //    67: aload_0        
        //    68: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //    71: invokevirtual   com/whatsapp/gdrive/bq.b:()J
        //    74: invokestatic    com/whatsapp/gdrive/GoogleDriveService.a:(Ljava/lang/String;J)Z
        //    77: pop            
        //    78: aload_0        
        //    79: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //    82: invokevirtual   com/whatsapp/gdrive/bq.e:()I
        //    85: istore          4
        //    87: aload_0        
        //    88: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //    91: invokevirtual   com/whatsapp/gdrive/bq.a:()I
        //    94: istore          5
        //    96: iload           4
        //    98: iflt            119
        //   101: aload_1        
        //   102: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   105: bipush          123
        //   107: aaload         
        //   108: iload           4
        //   110: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   113: invokeinterface android/content/SharedPreferences$Editor.putString:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
        //   118: pop            
        //   119: iload           5
        //   121: iflt            142
        //   124: aload_1        
        //   125: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   128: bipush          124
        //   130: aaload         
        //   131: iload           5
        //   133: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   136: invokeinterface android/content/SharedPreferences$Editor.putString:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
        //   141: pop            
        //   142: aload_1        
        //   143: invokeinterface android/content/SharedPreferences$Editor.commit:()Z
        //   148: ifne            180
        //   151: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   154: bipush          121
        //   156: aaload         
        //   157: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   160: iconst_0       
        //   161: ireturn        
        //   162: astore          6
        //   164: aload           6
        //   166: athrow         
        //   167: astore_3       
        //   168: aload_3        
        //   169: athrow         
        //   170: astore          9
        //   172: aload           9
        //   174: athrow         
        //   175: astore          7
        //   177: aload           7
        //   179: athrow         
        //   180: iconst_1       
        //   181: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  9      25     27     30     Ljava/lang/NullPointerException;
        //  30     78     167    170    Ljava/lang/NullPointerException;
        //  101    119    170    175    Ljava/lang/NullPointerException;
        //  124    142    175    180    Ljava/lang/NullPointerException;
        //  142    160    162    167    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 88, Size: 88
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
    
    static void M() {
        try {
            GoogleDriveService.E = y();
            GoogleDriveService.C = Z();
            switch (GoogleDriveService.E) {
                default: {
                    final String s = GoogleDriveService.bb[227];
                    break;
                }
                case 0: {
                    final String s2 = GoogleDriveService.bb[222];
                    break;
                }
                case 1: {
                    final String s3 = GoogleDriveService.bb[225];
                    break;
                }
            }
            switch (GoogleDriveService.C) {
                default: {
                    final String s4 = GoogleDriveService.bb[224];
                }
                case 0: {
                    final String s5 = GoogleDriveService.bb[223];
                }
                case 1: {
                    final String s6 = GoogleDriveService.bb[226];
                }
            }
        }
        catch (NumberFormatException ex) {
            Log.b(ex);
        }
    }
    
    static boolean O() {
        return af();
    }
    
    static boolean P() {
        try {
            if (X() == 1) {
                return true;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return false;
    }
    
    private static long Q() {
        return e().getLong(GoogleDriveService.bb[193], -1L);
    }
    
    private static void R() {
        final Intent intent = new Intent((Context)App.aq, (Class)GoogleDriveService.class);
        intent.setAction(GoogleDriveService.bb[35]);
        App.aq.startService(intent);
    }
    
    private boolean S() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/whatsapp/gdrive/GoogleDriveService.z:()Z
        //     3: istore          4
        //     5: iload           4
        //     7: ifeq            42
        //    10: aload_0        
        //    11: invokespecial   com/whatsapp/gdrive/GoogleDriveService.f:()Z
        //    14: istore          5
        //    16: iload           5
        //    18: ifeq            42
        //    21: invokestatic    com/whatsapp/gdrive/GoogleDriveService.z:()Z
        //    24: istore          6
        //    26: iload           6
        //    28: ifeq            42
        //    31: iconst_1       
        //    32: ireturn        
        //    33: astore_1       
        //    34: aload_1        
        //    35: athrow         
        //    36: astore_2       
        //    37: aload_2        
        //    38: athrow         
        //    39: astore_3       
        //    40: aload_3        
        //    41: athrow         
        //    42: iconst_0       
        //    43: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      5      33     36     Ljava/lang/NullPointerException;
        //  10     16     36     39     Ljava/lang/NullPointerException;
        //  21     26     39     42     Ljava/lang/NullPointerException;
        //  34     36     36     39     Ljava/lang/NullPointerException;
        //  37     39     39     42     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 26, Size: 26
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
    
    static boolean T() {
        return e().getBoolean(GoogleDriveService.bb[309], false);
    }
    
    private boolean U() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore_1       
        //     4: iconst_0       
        //     5: istore_2       
        //     6: aload_0        
        //     7: invokespecial   com/whatsapp/gdrive/GoogleDriveService.C:()Z
        //    10: ifne            15
        //    13: iconst_0       
        //    14: ireturn        
        //    15: aload_0        
        //    16: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //    19: aload_0        
        //    20: getfield        com/whatsapp/gdrive/GoogleDriveService.k:Ljava/lang/String;
        //    23: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    26: bipush          44
        //    28: aaload         
        //    29: invokevirtual   com/whatsapp/gdrive/q.c:(Ljava/lang/String;Ljava/lang/String;)[Lcom/whatsapp/gdrive/ag;
        //    32: astore_3       
        //    33: aload_3        
        //    34: ifnonnull       45
        //    37: iload_2        
        //    38: invokestatic    com/whatsapp/gdrive/al.a:(I)V
        //    41: iload_1        
        //    42: ifeq            62
        //    45: aload_3        
        //    46: arraylength    
        //    47: ifle            13
        //    50: iconst_1       
        //    51: ireturn        
        //    52: astore          5
        //    54: aload           5
        //    56: athrow         
        //    57: astore          4
        //    59: aload           4
        //    61: athrow         
        //    62: iload_2        
        //    63: iconst_1       
        //    64: iadd           
        //    65: istore          6
        //    67: iload_2        
        //    68: iconst_5       
        //    69: if_icmplt       74
        //    72: iconst_1       
        //    73: ireturn        
        //    74: iload           6
        //    76: istore_2       
        //    77: goto            6
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  37     41     52     57     Ljava/lang/NullPointerException;
        //  45     50     57     62     Ljava/lang/NullPointerException;
        //  54     57     57     62     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0045:
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
    
    private static boolean V() {
        final SharedPreferences$Editor edit = e().edit();
        try {
            edit.remove(GoogleDriveService.bb[218]);
            edit.remove(GoogleDriveService.bb[220]);
            edit.remove(GoogleDriveService.bb[219]);
            edit.remove(GoogleDriveService.bb[216]);
            edit.remove(GoogleDriveService.bb[221]);
            if (!edit.commit()) {
                Log.w(GoogleDriveService.bb[217]);
                return false;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return true;
    }
    
    private boolean W() {
        Label_0049: {
            try {
                b(2);
                this.Z.c();
                if (this.P != null) {
                    break Label_0049;
                }
                final GoogleDriveService googleDriveService = this;
                final boolean b = true;
                final boolean b2 = googleDriveService.b(b);
                if (!b2) {
                    final String[] array = GoogleDriveService.bb;
                    final int n = 285;
                    final String s = array[n];
                    Log.e(s);
                    return false;
                }
                break Label_0049;
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            try {
                final GoogleDriveService googleDriveService = this;
                final boolean b = true;
                final boolean b2 = googleDriveService.b(b);
                if (!b2) {
                    final String[] array = GoogleDriveService.bb;
                    final int n = 285;
                    final String s = array[n];
                    Log.e(s);
                    return false;
                }
            }
            catch (NullPointerException ex2) {
                throw ex2;
            }
        }
        final boolean a = this.a(qf.d().getName(), T());
        b(0);
        V();
        return a;
    }
    
    private static int X() {
        return e().getInt(GoogleDriveService.bb[308], 0);
    }
    
    private static boolean Y() {
        final int n = 1 + e().getInt(GoogleDriveService.bb[305], 0);
        final SharedPreferences$Editor edit = e().edit();
        try {
            edit.putInt(GoogleDriveService.bb[306], n);
            if (!edit.commit()) {
                Log.w(GoogleDriveService.bb[307]);
                return false;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return true;
    }
    
    private static int Z() {
        try {
            return Integer.parseInt(e().getString(GoogleDriveService.bb[310], String.valueOf(0)));
        }
        catch (NumberFormatException ex) {
            Log.b(GoogleDriveService.bb[311], ex);
            return 0;
        }
    }
    
    static long a(final String s) {
        Label_0023: {
            if (s != null) {
                break Label_0023;
            }
            try {
                Log.w(GoogleDriveService.bb[314]);
                return 0L;
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        long n = e().getLong(GoogleDriveService.bb[316] + s, 0L);
        if (n != 0L) {
            return n;
        }
        n = e().getLong(GoogleDriveService.bb[312], 0L);
        if (n == 0L) {
            return n;
        }
        b(s, n);
        final SharedPreferences$Editor edit = e().edit();
        try {
            edit.remove(GoogleDriveService.bb[313]);
            if (!edit.commit()) {
                Log.w(GoogleDriveService.bb[315]);
                return n;
            }
            return n;
        }
        catch (NullPointerException ex2) {
            throw ex2;
        }
    }
    
    public static String a(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokestatic    com/whatsapp/App.m:(Landroid/content/Context;)Ljava/lang/String;
        //     4: astore_1       
        //     5: aload_1        
        //     6: ifnonnull       28
        //     9: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    12: sipush          253
        //    15: aaload         
        //    16: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    19: aconst_null    
        //    20: astore_1       
        //    21: aload_1        
        //    22: areturn        
        //    23: astore          12
        //    25: aload           12
        //    27: athrow         
        //    28: aload_1        
        //    29: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    32: sipush          254
        //    35: aaload         
        //    36: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    39: istore          7
        //    41: iload           7
        //    43: ifne            114
        //    46: aload_1        
        //    47: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    50: sipush          248
        //    53: aaload         
        //    54: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    57: istore          9
        //    59: iload           9
        //    61: ifne            114
        //    64: aload_1        
        //    65: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    68: sipush          249
        //    71: aaload         
        //    72: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    75: istore          10
        //    77: iload           10
        //    79: ifne            114
        //    82: aload_1        
        //    83: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    86: sipush          252
        //    89: aaload         
        //    90: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    93: istore          11
        //    95: iload           11
        //    97: ifne            114
        //   100: aload_1        
        //   101: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   104: sipush          251
        //   107: aaload         
        //   108: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   111: ifeq            21
        //   114: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   117: sipush          250
        //   120: aaload         
        //   121: astore          8
        //   123: aload           8
        //   125: areturn        
        //   126: astore_2       
        //   127: aload_2        
        //   128: athrow         
        //   129: astore_3       
        //   130: aload_3        
        //   131: athrow         
        //   132: astore          4
        //   134: aload           4
        //   136: athrow         
        //   137: astore          5
        //   139: aload           5
        //   141: athrow         
        //   142: astore          6
        //   144: aload           6
        //   146: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  9      19     23     28     Ljava/lang/NullPointerException;
        //  28     41     126    129    Ljava/lang/NullPointerException;
        //  46     59     129    132    Ljava/lang/NullPointerException;
        //  64     77     132    137    Ljava/lang/NullPointerException;
        //  82     95     137    142    Ljava/lang/NullPointerException;
        //  100    114    142    147    Ljava/lang/NullPointerException;
        //  114    123    142    147    Ljava/lang/NullPointerException;
        //  127    129    129    132    Ljava/lang/NullPointerException;
        //  130    132    132    137    Ljava/lang/NullPointerException;
        //  134    137    137    142    Ljava/lang/NullPointerException;
        //  139    142    142    147    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 75, Size: 75
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
    
    static String a(final GoogleDriveService googleDriveService, final String s) {
        return googleDriveService.b(s);
    }
    
    static CountDownLatch a(final GoogleDriveService googleDriveService) {
        return googleDriveService.r;
    }
    
    private void a(final List p0, final File p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore_3       
        //     4: aload_2        
        //     5: invokevirtual   java/io/File.exists:()Z
        //     8: ifeq            69
        //    11: aload_2        
        //    12: invokevirtual   java/io/File.isDirectory:()Z
        //    15: istore          7
        //    17: iload           7
        //    19: ifeq            69
        //    22: aload_2        
        //    23: invokevirtual   java/io/File.listFiles:()[Ljava/io/File;
        //    26: astore          8
        //    28: aload           8
        //    30: ifnull          65
        //    33: aload           8
        //    35: arraylength    
        //    36: istore          9
        //    38: iconst_0       
        //    39: istore          10
        //    41: iload           10
        //    43: iload           9
        //    45: if_icmpge       65
        //    48: aload_0        
        //    49: aload_1        
        //    50: aload           8
        //    52: iload           10
        //    54: aaload         
        //    55: invokespecial   com/whatsapp/gdrive/GoogleDriveService.a:(Ljava/util/List;Ljava/io/File;)V
        //    58: iinc            10, 1
        //    61: iload_3        
        //    62: ifeq            41
        //    65: iload_3        
        //    66: ifeq            86
        //    69: aload_2        
        //    70: invokevirtual   java/io/File.length:()J
        //    73: lconst_0       
        //    74: lcmp           
        //    75: ifle            86
        //    78: aload_1        
        //    79: aload_2        
        //    80: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    85: pop            
        //    86: return         
        //    87: astore          4
        //    89: aload           4
        //    91: athrow         
        //    92: astore          5
        //    94: aload           5
        //    96: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      17     87     92     Ljava/lang/NullPointerException;
        //  69     86     92     97     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0069:
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
    
    private boolean a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore_1       
        //     4: iconst_3       
        //     5: invokestatic    com/whatsapp/gdrive/GoogleDriveService.b:(I)Z
        //     8: pop            
        //     9: invokestatic    com/whatsapp/gdrive/GoogleDriveService.T:()Z
        //    12: istore          5
        //    14: iload           5
        //    16: ifeq            465
        //    19: aload_0        
        //    20: invokespecial   com/whatsapp/gdrive/GoogleDriveService.K:()Ljava/lang/String;
        //    23: ifnonnull       43
        //    26: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    29: bipush          18
        //    31: aaload         
        //    32: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    35: iconst_0       
        //    36: ireturn        
        //    37: astore_2       
        //    38: aload_2        
        //    39: athrow         
        //    40: astore_3       
        //    41: aload_3        
        //    42: athrow         
        //    43: invokestatic    com/whatsapp/gdrive/GoogleDriveService.X:()I
        //    46: iconst_1       
        //    47: if_icmpne       66
        //    50: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    53: bipush          13
        //    55: aaload         
        //    56: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    59: iconst_0       
        //    60: ireturn        
        //    61: astore          8
        //    63: aload           8
        //    65: athrow         
        //    66: aload_0        
        //    67: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //    70: astore          11
        //    72: aload           11
        //    74: ifnonnull       97
        //    77: aload_0        
        //    78: iconst_1       
        //    79: invokespecial   com/whatsapp/gdrive/GoogleDriveService.b:(Z)Z
        //    82: ifne            97
        //    85: iconst_0       
        //    86: ireturn        
        //    87: astore          9
        //    89: aload           9
        //    91: athrow         
        //    92: astore          10
        //    94: aload           10
        //    96: athrow         
        //    97: getstatic       com/whatsapp/gdrive/GoogleDriveService.D:Ljava/io/File;
        //   100: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   103: invokestatic    com/whatsapp/gdrive/a7.b:(Ljava/lang/String;)Ljava/lang/String;
        //   106: astore          12
        //   108: aload_0        
        //   109: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //   112: aload           12
        //   114: invokevirtual   com/whatsapp/gdrive/bq.c:(Ljava/lang/String;)Ljava/lang/String;
        //   117: astore          13
        //   119: aload_0        
        //   120: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //   123: aload           12
        //   125: invokevirtual   com/whatsapp/gdrive/bq.e:(Ljava/lang/String;)Ljava/lang/String;
        //   128: astore          14
        //   130: aload_0        
        //   131: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //   134: aload           14
        //   136: invokevirtual   com/whatsapp/gdrive/bq.d:(Ljava/lang/String;)J
        //   139: lstore          15
        //   141: aload           14
        //   143: ifnonnull       318
        //   146: new             Ljava/lang/StringBuilder;
        //   149: dup            
        //   150: invokespecial   java/lang/StringBuilder.<init>:()V
        //   153: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   156: bipush          19
        //   158: aaload         
        //   159: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   162: aload           12
        //   164: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   167: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   170: bipush          20
        //   172: aaload         
        //   173: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   176: aload_0        
        //   177: invokespecial   com/whatsapp/gdrive/GoogleDriveService.K:()Ljava/lang/String;
        //   180: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   183: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   186: bipush          14
        //   188: aaload         
        //   189: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   192: aload_0        
        //   193: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //   196: invokevirtual   com/whatsapp/gdrive/bq.n:()I
        //   199: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   202: ldc_w           ")"
        //   205: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   208: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   211: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   214: aload_0        
        //   215: invokespecial   com/whatsapp/gdrive/GoogleDriveService.f:()Z
        //   218: istore          29
        //   220: iload           29
        //   222: ifne            232
        //   225: iconst_0       
        //   226: ireturn        
        //   227: astore          28
        //   229: aload           28
        //   231: athrow         
        //   232: aload_0        
        //   233: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //   236: aload_0        
        //   237: invokespecial   com/whatsapp/gdrive/GoogleDriveService.K:()Ljava/lang/String;
        //   240: invokevirtual   com/whatsapp/gdrive/q.j:(Ljava/lang/String;)Ljava/util/List;
        //   243: astore          30
        //   245: aload           30
        //   247: ifnonnull       263
        //   250: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   253: bipush          17
        //   255: aaload         
        //   256: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   259: iload_1        
        //   260: ifeq            311
        //   263: new             Ljava/lang/StringBuilder;
        //   266: dup            
        //   267: invokespecial   java/lang/StringBuilder.<init>:()V
        //   270: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   273: bipush          21
        //   275: aaload         
        //   276: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   279: aload           30
        //   281: invokeinterface java/util/List.size:()I
        //   286: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   289: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   292: bipush          15
        //   294: aaload         
        //   295: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   298: aload_0        
        //   299: invokespecial   com/whatsapp/gdrive/GoogleDriveService.K:()Ljava/lang/String;
        //   302: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   305: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   308: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   311: iconst_0       
        //   312: ireturn        
        //   313: astore          31
        //   315: aload           31
        //   317: athrow         
        //   318: getstatic       com/whatsapp/gdrive/GoogleDriveService.D:Ljava/io/File;
        //   321: invokevirtual   java/io/File.exists:()Z
        //   324: istore          19
        //   326: iload           19
        //   328: ifeq            352
        //   331: getstatic       com/whatsapp/gdrive/GoogleDriveService.D:Ljava/io/File;
        //   334: invokevirtual   java/io/File.length:()J
        //   337: lconst_0       
        //   338: lcmp           
        //   339: ifle            352
        //   342: getstatic       com/whatsapp/gdrive/GoogleDriveService.D:Ljava/io/File;
        //   345: ldc_w           ""
        //   348: invokestatic    com/whatsapp/util/ba.a:(Ljava/io/File;Ljava/lang/String;)Z
        //   351: pop            
        //   352: iconst_0       
        //   353: istore          20
        //   355: iconst_0       
        //   356: istore          21
        //   358: iload           21
        //   360: ifne            444
        //   363: iload           20
        //   365: iconst_1       
        //   366: iadd           
        //   367: istore          23
        //   369: iload           20
        //   371: iconst_5       
        //   372: if_icmpge       444
        //   375: aload_0        
        //   376: invokespecial   com/whatsapp/gdrive/GoogleDriveService.f:()Z
        //   379: istore          25
        //   381: iload           25
        //   383: ifne            403
        //   386: iconst_0       
        //   387: ireturn        
        //   388: astore          17
        //   390: aload           17
        //   392: athrow         
        //   393: astore          18
        //   395: aload           18
        //   397: athrow         
        //   398: astore          24
        //   400: aload           24
        //   402: athrow         
        //   403: new             Lcom/whatsapp/gdrive/cq;
        //   406: dup            
        //   407: aload_0        
        //   408: lload           15
        //   410: invokespecial   com/whatsapp/gdrive/cq.<init>:(Lcom/whatsapp/gdrive/GoogleDriveService;J)V
        //   413: astore          26
        //   415: aload_0        
        //   416: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //   419: getstatic       com/whatsapp/gdrive/GoogleDriveService.D:Ljava/io/File;
        //   422: aload           14
        //   424: aload           13
        //   426: lload           15
        //   428: aload           26
        //   430: invokevirtual   com/whatsapp/gdrive/q.a:(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;JLcom/whatsapp/gdrive/v;)Z
        //   433: istore          21
        //   435: iload           23
        //   437: invokestatic    com/whatsapp/gdrive/al.a:(I)V
        //   440: iload_1        
        //   441: ifeq            477
        //   444: iload           21
        //   446: ifne            465
        //   449: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   452: bipush          16
        //   454: aaload         
        //   455: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   458: iconst_0       
        //   459: ireturn        
        //   460: astore          22
        //   462: aload           22
        //   464: athrow         
        //   465: aload_0        
        //   466: invokespecial   com/whatsapp/gdrive/GoogleDriveService.L:()Z
        //   469: pop            
        //   470: iconst_2       
        //   471: invokestatic    com/whatsapp/gdrive/GoogleDriveService.b:(I)Z
        //   474: pop            
        //   475: iconst_1       
        //   476: ireturn        
        //   477: iload           23
        //   479: istore          20
        //   481: goto            358
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      14     37     40     Ljava/lang/NullPointerException;
        //  19     35     40     43     Ljava/lang/NullPointerException;
        //  38     40     40     43     Ljava/lang/NullPointerException;
        //  43     59     61     66     Ljava/lang/NullPointerException;
        //  66     72     87     92     Ljava/lang/NullPointerException;
        //  77     85     92     97     Ljava/lang/NullPointerException;
        //  89     92     92     97     Ljava/lang/NullPointerException;
        //  146    220    227    232    Ljava/lang/NullPointerException;
        //  250    259    313    318    Ljava/lang/NullPointerException;
        //  263    311    313    318    Ljava/lang/NullPointerException;
        //  318    326    388    393    Ljava/lang/NullPointerException;
        //  331    352    393    398    Ljava/lang/NullPointerException;
        //  375    381    398    403    Ljava/lang/NullPointerException;
        //  390    393    393    398    Ljava/lang/NullPointerException;
        //  449    458    460    465    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 234, Size: 234
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
    
    static boolean a(int n) {
        if (n != 0 && n != 1) {
            Log.e(GoogleDriveService.bb[230] + n);
            n = 0;
        }
        final SharedPreferences$Editor edit = e().edit();
        try {
            edit.putString(GoogleDriveService.bb[228], String.valueOf(n));
            if (!edit.commit()) {
                Log.w(GoogleDriveService.bb[229]);
                return false;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return true;
    }
    
    private static boolean a(final long n) {
        final SharedPreferences$Editor edit = e().edit();
        try {
            edit.putLong(GoogleDriveService.bb[287], n);
            if (!edit.commit()) {
                Log.w(GoogleDriveService.bb[286]);
                return false;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return true;
    }
    
    static boolean a(final GoogleDriveService googleDriveService, final File file, final String s, final String s2, final long n) {
        return googleDriveService.a(file, s, s2, n);
    }
    
    static boolean a(final GoogleDriveService googleDriveService, final boolean ab) {
        return googleDriveService.ab = ab;
    }
    
    private boolean a(@NonNull final File file) {
        final int f = GoogleDriveService.F;
        if (file == null) {
            try {
                Log.e(GoogleDriveService.bb[299]);
                this.r.countDown();
                return false;
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        try {
            if (!file.exists()) {
                Log.e(GoogleDriveService.bb[301] + file.getAbsolutePath() + GoogleDriveService.bb[302]);
                this.r.countDown();
                return false;
            }
        }
        catch (NullPointerException ex2) {
            throw ex2;
        }
        if (file.isDirectory()) {
            Log.e(GoogleDriveService.bb[300]);
            final File[] listFiles = file.listFiles();
            final int length = listFiles.length;
            int i = 0;
            boolean b = true;
            while (i < length) {
                b &= this.a(listFiles[i]);
                ++i;
                if (f != 0) {
                    break;
                }
            }
            if (f == 0) {
                return true;
            }
        }
        try {
            if (!af()) {
                Log.i(GoogleDriveService.bb[303]);
                this.r.countDown();
                return false;
            }
        }
        catch (NullPointerException ex3) {
            throw ex3;
        }
        com.whatsapp.gdrive.h.a(new ca(this, file, a7.b(file.getAbsolutePath())));
        return true;
    }
    
    private boolean a(final File file, final String s, final String s2, final long n) {
        while (true) {
            try {
                if (!this.S()) {
                    return false;
                }
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            try {
                if (!z()) {
                    Log.i(GoogleDriveService.bb[211]);
                    return false;
                }
            }
            catch (NullPointerException ex2) {
                throw ex2;
            }
            int n2 = 0;
            while (this.S()) {
                final t t = new t(this);
                try {
                    if (this.L.a(file, s, s2, n, t)) {
                        return true;
                    }
                }
                catch (NullPointerException ex3) {
                    throw ex3;
                }
                al.a(n2);
                final int n3 = n2 + 1;
                if (n2 >= 5) {
                    return false;
                }
                n2 = n3;
            }
            return false;
        }
    }
    
    static boolean a(@NonNull final String s, final long n) {
        if (s == null) {
            try {
                Log.e(GoogleDriveService.bb[213]);
                return false;
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        final SharedPreferences$Editor edit = e().edit();
        try {
            edit.putLong(GoogleDriveService.bb[215] + s, n);
            if (!edit.commit()) {
                Log.w(GoogleDriveService.bb[214]);
                return false;
            }
        }
        catch (NullPointerException ex2) {
            throw ex2;
        }
        return true;
    }
    
    private boolean a(final String p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore_3       
        //     4: iconst_0       
        //     5: istore          4
        //     7: invokestatic    com/whatsapp/gdrive/GoogleDriveService.D:()Z
        //    10: ifne            15
        //    13: iconst_0       
        //    14: ireturn        
        //    15: aload_0        
        //    16: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //    19: aconst_null    
        //    20: aload_1        
        //    21: invokevirtual   com/whatsapp/gdrive/q.c:(Ljava/lang/String;Ljava/lang/String;)[Lcom/whatsapp/gdrive/ag;
        //    24: astore          7
        //    26: aload           7
        //    28: ifnonnull       77
        //    31: new             Ljava/lang/StringBuilder;
        //    34: dup            
        //    35: invokespecial   java/lang/StringBuilder.<init>:()V
        //    38: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    41: sipush          239
        //    44: aaload         
        //    45: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    48: aload_1        
        //    49: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    52: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    55: sipush          243
        //    58: aaload         
        //    59: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    62: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    65: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    68: iload           4
        //    70: invokestatic    com/whatsapp/gdrive/al.a:(I)V
        //    73: iload_3        
        //    74: ifeq            313
        //    77: aload           7
        //    79: arraylength    
        //    80: istore          9
        //    82: iload           9
        //    84: ifne            156
        //    87: new             Ljava/lang/StringBuilder;
        //    90: dup            
        //    91: invokespecial   java/lang/StringBuilder.<init>:()V
        //    94: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    97: sipush          241
        //   100: aaload         
        //   101: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   104: aload_1        
        //   105: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   108: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   111: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   114: iconst_0       
        //   115: ireturn        
        //   116: astore          6
        //   118: aload_0        
        //   119: bipush          12
        //   121: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.e:(I)V
        //   124: aload           6
        //   126: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   129: iconst_0       
        //   130: ireturn        
        //   131: astore          19
        //   133: aload           19
        //   135: athrow         
        //   136: astore          8
        //   138: aload           8
        //   140: athrow         
        //   141: astore          5
        //   143: aload_0        
        //   144: bipush          11
        //   146: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.e:(I)V
        //   149: aload           5
        //   151: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   154: iconst_0       
        //   155: ireturn        
        //   156: aload           7
        //   158: iconst_0       
        //   159: aaload         
        //   160: astore          10
        //   162: aload           10
        //   164: ifnull          179
        //   167: aload           10
        //   169: invokevirtual   com/whatsapp/gdrive/ag.b:()Ljava/lang/String;
        //   172: astore          12
        //   174: aload           12
        //   176: ifnonnull       213
        //   179: new             Ljava/lang/StringBuilder;
        //   182: dup            
        //   183: invokespecial   java/lang/StringBuilder.<init>:()V
        //   186: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   189: sipush          242
        //   192: aaload         
        //   193: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   196: aload_1        
        //   197: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   200: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   203: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   206: iconst_0       
        //   207: ireturn        
        //   208: astore          11
        //   210: aload           11
        //   212: athrow         
        //   213: aload           10
        //   215: invokevirtual   com/whatsapp/gdrive/ag.b:()Ljava/lang/String;
        //   218: astore          13
        //   220: iconst_0       
        //   221: istore          14
        //   223: invokestatic    com/whatsapp/gdrive/GoogleDriveService.D:()Z
        //   226: istore          15
        //   228: iload           15
        //   230: ifeq            311
        //   233: aload_0        
        //   234: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //   237: aload           13
        //   239: aload_2        
        //   240: invokevirtual   com/whatsapp/gdrive/q.d:(Ljava/lang/String;Ljava/lang/String;)Z
        //   243: istore          17
        //   245: iload           17
        //   247: ifeq            257
        //   250: iconst_1       
        //   251: ireturn        
        //   252: astore          16
        //   254: aload           16
        //   256: athrow         
        //   257: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   260: sipush          240
        //   263: aaload         
        //   264: iconst_3       
        //   265: anewarray       Ljava/lang/Object;
        //   268: dup            
        //   269: iconst_0       
        //   270: aload           13
        //   272: aastore        
        //   273: dup            
        //   274: iconst_1       
        //   275: aload_1        
        //   276: aastore        
        //   277: dup            
        //   278: iconst_2       
        //   279: aload_2        
        //   280: aastore        
        //   281: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   284: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   287: iload           14
        //   289: invokestatic    com/whatsapp/gdrive/al.a:(I)V
        //   292: iload           14
        //   294: iconst_1       
        //   295: iadd           
        //   296: istore          18
        //   298: iload           14
        //   300: iconst_5       
        //   301: if_icmpge       311
        //   304: iload           18
        //   306: istore          14
        //   308: goto            223
        //   311: iconst_0       
        //   312: ireturn        
        //   313: iload           4
        //   315: iconst_1       
        //   316: iadd           
        //   317: istore          20
        //   319: aconst_null    
        //   320: astore          10
        //   322: iload           4
        //   324: iconst_5       
        //   325: if_icmpge       162
        //   328: iload           20
        //   330: istore          4
        //   332: goto            7
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  7      13     116    131    Lcom/whatsapp/gdrive/br;
        //  7      13     141    156    Lcom/whatsapp/gdrive/bc;
        //  15     26     116    131    Lcom/whatsapp/gdrive/br;
        //  15     26     141    156    Lcom/whatsapp/gdrive/bc;
        //  31     73     131    136    Lcom/whatsapp/gdrive/br;
        //  31     73     141    156    Lcom/whatsapp/gdrive/bc;
        //  77     82     136    141    Lcom/whatsapp/gdrive/br;
        //  77     82     141    156    Lcom/whatsapp/gdrive/bc;
        //  87     114    116    131    Lcom/whatsapp/gdrive/br;
        //  87     114    141    156    Lcom/whatsapp/gdrive/bc;
        //  133    136    136    141    Lcom/whatsapp/gdrive/br;
        //  133    136    141    156    Lcom/whatsapp/gdrive/bc;
        //  138    141    116    131    Lcom/whatsapp/gdrive/br;
        //  138    141    141    156    Lcom/whatsapp/gdrive/bc;
        //  156    162    116    131    Lcom/whatsapp/gdrive/br;
        //  156    162    141    156    Lcom/whatsapp/gdrive/bc;
        //  167    174    208    213    Lcom/whatsapp/gdrive/br;
        //  167    174    141    156    Lcom/whatsapp/gdrive/bc;
        //  179    206    116    131    Lcom/whatsapp/gdrive/br;
        //  179    206    141    156    Lcom/whatsapp/gdrive/bc;
        //  210    213    116    131    Lcom/whatsapp/gdrive/br;
        //  210    213    141    156    Lcom/whatsapp/gdrive/bc;
        //  213    220    116    131    Lcom/whatsapp/gdrive/br;
        //  213    220    141    156    Lcom/whatsapp/gdrive/bc;
        //  223    228    116    131    Lcom/whatsapp/gdrive/br;
        //  223    228    141    156    Lcom/whatsapp/gdrive/bc;
        //  233    245    116    131    Lcom/whatsapp/gdrive/br;
        //  233    245    141    156    Lcom/whatsapp/gdrive/bc;
        //  233    245    252    257    Ljava/lang/NullPointerException;
        //  257    292    116    131    Lcom/whatsapp/gdrive/br;
        //  257    292    141    156    Lcom/whatsapp/gdrive/bc;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 169, Size: 169
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
    
    private boolean a(@NonNull final String p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore_3       
        //     4: getstatic       com/whatsapp/gdrive/GoogleDriveService.c:I
        //     7: iconst_1       
        //     8: if_icmpeq       22
        //    11: aload_0        
        //    12: getfield        com/whatsapp/gdrive/GoogleDriveService.O:Lcom/whatsapp/fieldstats/bv;
        //    15: dconst_0       
        //    16: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    19: putfield        com/whatsapp/fieldstats/bv.e:Ljava/lang/Double;
        //    22: aload_0        
        //    23: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //    26: ifnonnull       68
        //    29: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    32: sipush          143
        //    35: aaload         
        //    36: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    39: aload_0        
        //    40: iconst_1       
        //    41: invokespecial   com/whatsapp/gdrive/GoogleDriveService.b:(Z)Z
        //    44: istore          50
        //    46: iload           50
        //    48: ifne            68
        //    51: iconst_0       
        //    52: ireturn        
        //    53: astore          4
        //    55: aload           4
        //    57: athrow         
        //    58: astore          5
        //    60: aload           5
        //    62: athrow         
        //    63: astore          6
        //    65: aload           6
        //    67: athrow         
        //    68: aload_0        
        //    69: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //    72: ifnonnull       98
        //    75: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    78: sipush          139
        //    81: aaload         
        //    82: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    85: new             Ljava/lang/RuntimeException;
        //    88: dup            
        //    89: invokespecial   java/lang/RuntimeException.<init>:()V
        //    92: athrow         
        //    93: astore          7
        //    95: aload           7
        //    97: athrow         
        //    98: new             Ljava/util/ArrayList;
        //   101: dup            
        //   102: invokespecial   java/util/ArrayList.<init>:()V
        //   105: invokestatic    java/util/Collections.synchronizedList:(Ljava/util/List;)Ljava/util/List;
        //   108: astore          8
        //   110: new             Lcom/whatsapp/util/b0;
        //   113: dup            
        //   114: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   117: sipush          138
        //   120: aaload         
        //   121: invokespecial   com/whatsapp/util/b0.<init>:(Ljava/lang/String;)V
        //   124: astore          9
        //   126: aload_0        
        //   127: aload           8
        //   129: aload_1        
        //   130: iload_2        
        //   131: invokespecial   com/whatsapp/gdrive/GoogleDriveService.a:(Ljava/util/List;Ljava/lang/String;Z)Z
        //   134: ifne            160
        //   137: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   140: sipush          140
        //   143: aaload         
        //   144: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   147: aload           9
        //   149: invokevirtual   com/whatsapp/util/b0.c:()J
        //   152: pop2           
        //   153: iconst_0       
        //   154: ireturn        
        //   155: astore          10
        //   157: aload           10
        //   159: athrow         
        //   160: aload           9
        //   162: invokevirtual   com/whatsapp/util/b0.c:()J
        //   165: pop2           
        //   166: invokestatic    com/whatsapp/gdrive/GoogleDriveService.b:()J
        //   169: lstore          13
        //   171: aload_0        
        //   172: lload           13
        //   174: putfield        com/whatsapp/gdrive/GoogleDriveService.b:J
        //   177: aload           8
        //   179: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   184: astore          15
        //   186: aload           15
        //   188: invokeinterface java/util/Iterator.hasNext:()Z
        //   193: ifeq            241
        //   196: aload           15
        //   198: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   203: checkcast       Ljava/lang/String;
        //   206: astore          46
        //   208: aload_0        
        //   209: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //   212: aload           46
        //   214: invokevirtual   com/whatsapp/gdrive/bq.e:(Ljava/lang/String;)Ljava/lang/String;
        //   217: astore          47
        //   219: aload_0        
        //   220: aload_0        
        //   221: getfield        com/whatsapp/gdrive/GoogleDriveService.b:J
        //   224: aload_0        
        //   225: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //   228: aload           47
        //   230: invokevirtual   com/whatsapp/gdrive/bq.d:(Ljava/lang/String;)J
        //   233: ladd           
        //   234: putfield        com/whatsapp/gdrive/GoogleDriveService.b:J
        //   237: iload_3        
        //   238: ifeq            186
        //   241: aload           8
        //   243: new             Lcom/whatsapp/gdrive/j;
        //   246: dup            
        //   247: invokespecial   com/whatsapp/gdrive/j.<init>:()V
        //   250: invokestatic    java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
        //   253: aload_0        
        //   254: getfield        com/whatsapp/gdrive/GoogleDriveService.O:Lcom/whatsapp/fieldstats/bv;
        //   257: ifnull          278
        //   260: aload_0        
        //   261: getfield        com/whatsapp/gdrive/GoogleDriveService.O:Lcom/whatsapp/fieldstats/bv;
        //   264: aload           8
        //   266: invokeinterface java/util/List.size:()I
        //   271: i2d            
        //   272: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   275: putfield        com/whatsapp/fieldstats/bv.g:Ljava/lang/Double;
        //   278: new             Ljava/util/ArrayList;
        //   281: dup            
        //   282: invokespecial   java/util/ArrayList.<init>:()V
        //   285: astore          17
        //   287: aload_0        
        //   288: getfield        com/whatsapp/gdrive/GoogleDriveService.R:Ljava/util/concurrent/atomic/AtomicLong;
        //   291: lload           13
        //   293: invokevirtual   java/util/concurrent/atomic/AtomicLong.set:(J)V
        //   296: aload_0        
        //   297: getfield        com/whatsapp/gdrive/GoogleDriveService.l:Ljava/util/concurrent/atomic/AtomicLong;
        //   300: lconst_0       
        //   301: invokevirtual   java/util/concurrent/atomic/AtomicLong.set:(J)V
        //   304: new             Ljava/util/concurrent/CountDownLatch;
        //   307: dup            
        //   308: aload           8
        //   310: invokeinterface java/util/List.size:()I
        //   315: invokespecial   java/util/concurrent/CountDownLatch.<init>:(I)V
        //   318: astore          18
        //   320: iconst_0       
        //   321: istore          19
        //   323: new             Ljava/util/concurrent/atomic/AtomicBoolean;
        //   326: dup            
        //   327: iconst_0       
        //   328: invokespecial   java/util/concurrent/atomic/AtomicBoolean.<init>:(Z)V
        //   331: astore          20
        //   333: new             Ljava/util/concurrent/atomic/AtomicBoolean;
        //   336: dup            
        //   337: iconst_0       
        //   338: invokespecial   java/util/concurrent/atomic/AtomicBoolean.<init>:(Z)V
        //   341: astore          21
        //   343: new             Ljava/util/concurrent/atomic/AtomicBoolean;
        //   346: dup            
        //   347: iconst_0       
        //   348: invokespecial   java/util/concurrent/atomic/AtomicBoolean.<init>:(Z)V
        //   351: astore          22
        //   353: aload           8
        //   355: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   360: astore          23
        //   362: aload           23
        //   364: invokeinterface java/util/Iterator.hasNext:()Z
        //   369: ifeq            531
        //   372: aload           23
        //   374: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   379: checkcast       Ljava/lang/String;
        //   382: astore          41
        //   384: iload           19
        //   386: iconst_1       
        //   387: iadd           
        //   388: istore          42
        //   390: iload           42
        //   392: bipush          100
        //   394: irem           
        //   395: ifne            457
        //   398: new             Ljava/lang/StringBuilder;
        //   401: dup            
        //   402: invokespecial   java/lang/StringBuilder.<init>:()V
        //   405: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   408: sipush          135
        //   411: aaload         
        //   412: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   415: iload           42
        //   417: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   420: ldc_w           "/"
        //   423: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   426: aload           8
        //   428: invokeinterface java/util/List.size:()I
        //   433: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   436: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   439: sipush          144
        //   442: aaload         
        //   443: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   446: aload           41
        //   448: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   451: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   454: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   457: aload_0        
        //   458: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //   461: aload           41
        //   463: invokevirtual   com/whatsapp/gdrive/bq.e:(Ljava/lang/String;)Ljava/lang/String;
        //   466: astore          44
        //   468: aload_0        
        //   469: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //   472: aload           41
        //   474: invokevirtual   com/whatsapp/gdrive/bq.c:(Ljava/lang/String;)Ljava/lang/String;
        //   477: astore          45
        //   479: new             Lcom/whatsapp/gdrive/cc;
        //   482: dup            
        //   483: aload_0        
        //   484: aload           20
        //   486: aload           21
        //   488: aload           22
        //   490: new             Ljava/io/File;
        //   493: dup            
        //   494: aload           41
        //   496: invokestatic    com/whatsapp/gdrive/a7.c:(Ljava/lang/String;)Ljava/lang/String;
        //   499: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   502: aload           44
        //   504: aload           45
        //   506: aload_0        
        //   507: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //   510: aload           44
        //   512: invokevirtual   com/whatsapp/gdrive/bq.d:(Ljava/lang/String;)J
        //   515: aload           17
        //   517: aload           41
        //   519: aload           18
        //   521: invokespecial   com/whatsapp/gdrive/cc.<init>:(Lcom/whatsapp/gdrive/GoogleDriveService;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;JLjava/util/ArrayList;Ljava/lang/String;Ljava/util/concurrent/CountDownLatch;)V
        //   524: invokestatic    com/whatsapp/gdrive/h.a:(Ljava/lang/Runnable;)V
        //   527: iload_3        
        //   528: ifeq            875
        //   531: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   534: sipush          141
        //   537: aaload         
        //   538: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   541: aload           18
        //   543: invokevirtual   java/util/concurrent/CountDownLatch.await:()V
        //   546: aload           20
        //   548: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //   551: ifeq            586
        //   554: new             Lcom/whatsapp/gdrive/bc;
        //   557: dup            
        //   558: invokespecial   com/whatsapp/gdrive/bc.<init>:()V
        //   561: athrow         
        //   562: astore          25
        //   564: aload           25
        //   566: athrow         
        //   567: astore          16
        //   569: aload           16
        //   571: athrow         
        //   572: astore          43
        //   574: aload           43
        //   576: athrow         
        //   577: astore          24
        //   579: aload           24
        //   581: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   584: iconst_0       
        //   585: ireturn        
        //   586: aload           21
        //   588: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //   591: ifeq            607
        //   594: new             Lcom/whatsapp/gdrive/br;
        //   597: dup            
        //   598: invokespecial   com/whatsapp/gdrive/br.<init>:()V
        //   601: athrow         
        //   602: astore          26
        //   604: aload           26
        //   606: athrow         
        //   607: aload           22
        //   609: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //   612: ifeq            628
        //   615: new             Lcom/whatsapp/gdrive/be;
        //   618: dup            
        //   619: invokespecial   com/whatsapp/gdrive/be.<init>:()V
        //   622: athrow         
        //   623: astore          27
        //   625: aload           27
        //   627: athrow         
        //   628: aload           17
        //   630: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   633: astore          28
        //   635: aload           28
        //   637: invokeinterface java/util/Iterator.hasNext:()Z
        //   642: ifeq            750
        //   645: aload           28
        //   647: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   652: checkcast       Ljava/lang/String;
        //   655: astore          30
        //   657: new             Ljava/io/File;
        //   660: dup            
        //   661: getstatic       com/whatsapp/App.M:Ljava/io/File;
        //   664: aload           30
        //   666: invokestatic    com/whatsapp/gdrive/a7.c:(Ljava/lang/String;)Ljava/lang/String;
        //   669: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   672: astore          31
        //   674: aload_0        
        //   675: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //   678: aload           30
        //   680: invokevirtual   com/whatsapp/gdrive/bq.e:(Ljava/lang/String;)Ljava/lang/String;
        //   683: astore          32
        //   685: aload_0        
        //   686: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //   689: aload           30
        //   691: invokevirtual   com/whatsapp/gdrive/bq.c:(Ljava/lang/String;)Ljava/lang/String;
        //   694: astore          33
        //   696: aload_0        
        //   697: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //   700: aload           32
        //   702: invokevirtual   com/whatsapp/gdrive/bq.d:(Ljava/lang/String;)J
        //   705: lstore          34
        //   707: aload_0        
        //   708: aload           31
        //   710: aload           32
        //   712: aload           33
        //   714: lload           34
        //   716: invokespecial   com/whatsapp/gdrive/GoogleDriveService.a:(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;J)Z
        //   719: ifeq            746
        //   722: aload_0        
        //   723: getfield        com/whatsapp/gdrive/GoogleDriveService.R:Ljava/util/concurrent/atomic/AtomicLong;
        //   726: lload           34
        //   728: invokevirtual   java/util/concurrent/atomic/AtomicLong.addAndGet:(J)J
        //   731: pop2           
        //   732: aload_0        
        //   733: getfield        com/whatsapp/gdrive/GoogleDriveService.l:Ljava/util/concurrent/atomic/AtomicLong;
        //   736: ldc2_w          -1
        //   739: lload           34
        //   741: lmul           
        //   742: invokevirtual   java/util/concurrent/atomic/AtomicLong.addAndGet:(J)J
        //   745: pop2           
        //   746: iload_3        
        //   747: ifeq            635
        //   750: new             Ljava/lang/StringBuilder;
        //   753: dup            
        //   754: invokespecial   java/lang/StringBuilder.<init>:()V
        //   757: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   760: sipush          142
        //   763: aaload         
        //   764: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   767: aload_0        
        //   768: getfield        com/whatsapp/gdrive/GoogleDriveService.R:Ljava/util/concurrent/atomic/AtomicLong;
        //   771: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   774: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   777: ldc_w           "/"
        //   780: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   783: aload_0        
        //   784: getfield        com/whatsapp/gdrive/GoogleDriveService.b:J
        //   787: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   790: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   793: sipush          136
        //   796: aaload         
        //   797: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   800: aload_0        
        //   801: getfield        com/whatsapp/gdrive/GoogleDriveService.l:Ljava/util/concurrent/atomic/AtomicLong;
        //   804: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   807: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   810: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   813: sipush          137
        //   816: aaload         
        //   817: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   820: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   823: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   826: aload_0        
        //   827: getfield        com/whatsapp/gdrive/GoogleDriveService.R:Ljava/util/concurrent/atomic/AtomicLong;
        //   830: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   833: lconst_0       
        //   834: lcmp           
        //   835: ifle            863
        //   838: aload_0        
        //   839: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //   842: aload_0        
        //   843: getfield        com/whatsapp/gdrive/GoogleDriveService.R:Ljava/util/concurrent/atomic/AtomicLong;
        //   846: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   849: aload_0        
        //   850: getfield        com/whatsapp/gdrive/GoogleDriveService.l:Ljava/util/concurrent/atomic/AtomicLong;
        //   853: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   856: aload_0        
        //   857: getfield        com/whatsapp/gdrive/GoogleDriveService.b:J
        //   860: invokevirtual   com/whatsapp/gdrive/aq.a:(JJJ)V
        //   863: iconst_1       
        //   864: ireturn        
        //   865: astore          36
        //   867: aload           36
        //   869: athrow         
        //   870: astore          29
        //   872: aload           29
        //   874: athrow         
        //   875: iload           42
        //   877: istore          19
        //   879: goto            362
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      22     53     58     Ljava/lang/InterruptedException;
        //  22     46     58     68     Ljava/lang/InterruptedException;
        //  60     63     63     68     Ljava/lang/InterruptedException;
        //  68     93     93     98     Ljava/lang/InterruptedException;
        //  126    153    155    160    Ljava/lang/InterruptedException;
        //  241    278    567    572    Ljava/lang/InterruptedException;
        //  398    457    572    577    Ljava/lang/InterruptedException;
        //  531    546    577    586    Ljava/lang/InterruptedException;
        //  546    562    562    567    Ljava/lang/InterruptedException;
        //  586    602    602    607    Ljava/lang/InterruptedException;
        //  607    623    623    628    Ljava/lang/InterruptedException;
        //  707    746    865    870    Ljava/lang/InterruptedException;
        //  750    863    870    875    Ljava/lang/InterruptedException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 394, Size: 394
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
    
    private boolean a(@NonNull final List p0, @NonNull final String p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore          4
        //     5: aload_0        
        //     6: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //     9: invokevirtual   com/whatsapp/gdrive/bq.l:()Ljava/util/Set;
        //    12: astore          5
        //    14: new             Ljava/util/concurrent/atomic/AtomicBoolean;
        //    17: dup            
        //    18: iconst_1       
        //    19: invokespecial   java/util/concurrent/atomic/AtomicBoolean.<init>:(Z)V
        //    22: astore          6
        //    24: new             Ljava/util/concurrent/CountDownLatch;
        //    27: dup            
        //    28: aload           5
        //    30: invokeinterface java/util/Set.size:()I
        //    35: invokespecial   java/util/concurrent/CountDownLatch.<init>:(I)V
        //    38: astore          7
        //    40: iconst_0       
        //    41: istore          8
        //    43: aload           5
        //    45: invokeinterface java/util/Set.size:()I
        //    50: istore          9
        //    52: aload           5
        //    54: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    59: astore          10
        //    61: aload           10
        //    63: invokeinterface java/util/Iterator.hasNext:()Z
        //    68: ifeq            220
        //    71: aload           10
        //    73: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    78: checkcast       Ljava/lang/String;
        //    81: astore          12
        //    83: aload_0        
        //    84: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //    87: aload           12
        //    89: invokevirtual   com/whatsapp/gdrive/bq.e:(Ljava/lang/String;)Ljava/lang/String;
        //    92: astore          13
        //    94: new             Ljava/io/File;
        //    97: dup            
        //    98: aload           12
        //   100: invokestatic    com/whatsapp/gdrive/a7.c:(Ljava/lang/String;)Ljava/lang/String;
        //   103: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   106: astore          14
        //   108: iload           8
        //   110: bipush          100
        //   112: irem           
        //   113: ifne            154
        //   116: new             Ljava/lang/StringBuilder;
        //   119: dup            
        //   120: invokespecial   java/lang/StringBuilder.<init>:()V
        //   123: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   126: bipush          58
        //   128: aaload         
        //   129: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   132: iload           8
        //   134: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   137: ldc_w           "/"
        //   140: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   143: iload           9
        //   145: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   148: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   151: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   154: iload           8
        //   156: iconst_1       
        //   157: iadd           
        //   158: istore          16
        //   160: aload_0        
        //   161: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //   164: iload           16
        //   166: i2l            
        //   167: iload           9
        //   169: i2l            
        //   170: invokevirtual   com/whatsapp/gdrive/aq.m:(JJ)V
        //   173: aload           12
        //   175: aload_2        
        //   176: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   179: ifne            192
        //   182: aload           7
        //   184: invokevirtual   java/util/concurrent/CountDownLatch.countDown:()V
        //   187: iload           4
        //   189: ifeq            215
        //   192: new             Lcom/whatsapp/gdrive/aj;
        //   195: dup            
        //   196: aload_0        
        //   197: aload           6
        //   199: iload_3        
        //   200: aload           14
        //   202: aload           13
        //   204: aload           12
        //   206: aload_1        
        //   207: aload           7
        //   209: invokespecial   com/whatsapp/gdrive/aj.<init>:(Lcom/whatsapp/gdrive/GoogleDriveService;Ljava/util/concurrent/atomic/AtomicBoolean;ZLjava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/concurrent/CountDownLatch;)V
        //   212: invokestatic    com/whatsapp/gdrive/h.a:(Ljava/lang/Runnable;)V
        //   215: iload           4
        //   217: ifeq            264
        //   220: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   223: bipush          59
        //   225: aaload         
        //   226: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   229: aload           7
        //   231: invokevirtual   java/util/concurrent/CountDownLatch.await:()V
        //   234: aload           6
        //   236: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //   239: ireturn        
        //   240: astore          15
        //   242: aload           15
        //   244: athrow         
        //   245: astore          17
        //   247: aload           17
        //   249: athrow         
        //   250: astore          18
        //   252: aload           18
        //   254: athrow         
        //   255: astore          11
        //   257: aload           11
        //   259: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   262: iconst_0       
        //   263: ireturn        
        //   264: iload           16
        //   266: istore          8
        //   268: goto            61
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  116    154    240    245    Ljava/lang/InterruptedException;
        //  160    187    245    250    Ljava/lang/InterruptedException;
        //  192    215    250    255    Ljava/lang/InterruptedException;
        //  220    234    255    264    Ljava/lang/InterruptedException;
        //  247    250    250    255    Ljava/lang/InterruptedException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 121, Size: 121
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
    
    static boolean a(final boolean b) {
        final SharedPreferences$Editor edit = e().edit();
        try {
            edit.putBoolean(GoogleDriveService.bb[203], b);
            if (!edit.commit()) {
                Log.w(GoogleDriveService.bb[204]);
                return false;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return true;
    }
    
    static void aa() {
        GoogleDriveService.h = true;
        ah();
    }
    
    private static boolean ab() {
        Label_0037: {
            try {
                if (!af()) {
                    break Label_0037;
                }
                final ConditionVariable conditionVariable = GoogleDriveService.z;
                final long n = 86400000L;
                final boolean b = conditionVariable.block(n);
                if (!b) {
                    final String[] array = GoogleDriveService.bb;
                    final int n2 = 7;
                    final String s = array[n2];
                    Log.e(s);
                    return false;
                }
                return true;
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            try {
                final ConditionVariable conditionVariable = GoogleDriveService.z;
                final long n = 86400000L;
                final boolean b = conditionVariable.block(n);
                if (!b) {
                    final String[] array = GoogleDriveService.bb;
                    final int n2 = 7;
                    final String s = array[n2];
                    Log.e(s);
                    return false;
                }
                return true;
            }
            catch (NullPointerException ex2) {
                throw ex2;
            }
            try {
                if (z()) {
                    try {
                        if (!GoogleDriveService.U.block(86400000L)) {
                            Log.e(GoogleDriveService.bb[8]);
                            return false;
                        }
                        return true;
                    }
                    catch (NullPointerException ex3) {
                        throw ex3;
                    }
                }
            }
            catch (NullPointerException ex4) {
                throw ex4;
            }
        }
        return true;
    }
    
    public static boolean ac() {
        try {
            if (X() == 2) {
                return true;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return false;
    }
    
    static int ae() {
        try {
            return Integer.parseInt(e().getString(GoogleDriveService.bb[49], String.valueOf(0)));
        }
        catch (NumberFormatException ex) {
            Log.b(GoogleDriveService.bb[50], ex);
            return 0;
        }
    }
    
    private static boolean af() {
        return GoogleDriveService.t.get();
    }
    
    private boolean ag() {
        int n = 0;
        while (this.C()) {
            try {
                if (this.L.a(this.k, GoogleDriveService.bb[238], String.valueOf(true))) {
                    return true;
                }
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            al.a(n);
            final int n2 = n + 1;
            if (n >= 5) {
                break;
            }
            n = n2;
        }
        return false;
    }
    
    private static void ah() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    de/greenrobot/event/m.b:()Lde/greenrobot/event/m;
        //     3: ldc_w           Lcom/whatsapp/b5;.class
        //     6: invokevirtual   de/greenrobot/event/m.a:(Ljava/lang/Class;)Ljava/lang/Object;
        //     9: checkcast       Lcom/whatsapp/b5;
        //    12: astore_0       
        //    13: aload_0        
        //    14: ifnull          116
        //    17: aload_0        
        //    18: invokevirtual   com/whatsapp/b5.a:()D
        //    21: dstore          9
        //    23: dload           9
        //    25: d2i            
        //    26: istore_1       
        //    27: aload_0        
        //    28: ifnull          126
        //    31: aload_0        
        //    32: invokevirtual   com/whatsapp/b5.b:()Z
        //    35: istore          7
        //    37: iload           7
        //    39: ifeq            126
        //    42: iconst_1       
        //    43: istore_2       
        //    44: getstatic       com/whatsapp/gdrive/GoogleDriveService.I:Landroid/os/ConditionVariable;
        //    47: invokevirtual   android/os/ConditionVariable.open:()V
        //    50: iconst_1       
        //    51: putstatic       com/whatsapp/gdrive/GoogleDriveService.s:Z
        //    54: iload_2        
        //    55: ifne            64
        //    58: iload_1        
        //    59: bipush          20
        //    61: if_icmplt       139
        //    64: getstatic       com/whatsapp/gdrive/GoogleDriveService.z:Landroid/os/ConditionVariable;
        //    67: invokevirtual   android/os/ConditionVariable.open:()V
        //    70: getstatic       com/whatsapp/gdrive/GoogleDriveService.U:Landroid/os/ConditionVariable;
        //    73: invokevirtual   android/os/ConditionVariable.open:()V
        //    76: iconst_1       
        //    77: putstatic       com/whatsapp/gdrive/GoogleDriveService.f:Z
        //    80: iconst_1       
        //    81: putstatic       com/whatsapp/gdrive/GoogleDriveService.S:Z
        //    84: getstatic       com/whatsapp/gdrive/GoogleDriveService.h:Z
        //    87: ifeq            110
        //    90: getstatic       com/whatsapp/gdrive/GoogleDriveService.z:Landroid/os/ConditionVariable;
        //    93: invokevirtual   android/os/ConditionVariable.open:()V
        //    96: getstatic       com/whatsapp/gdrive/GoogleDriveService.U:Landroid/os/ConditionVariable;
        //    99: invokevirtual   android/os/ConditionVariable.open:()V
        //   102: iconst_1       
        //   103: putstatic       com/whatsapp/gdrive/GoogleDriveService.f:Z
        //   106: iconst_1       
        //   107: putstatic       com/whatsapp/gdrive/GoogleDriveService.S:Z
        //   110: return         
        //   111: astore          8
        //   113: aload           8
        //   115: athrow         
        //   116: iconst_0       
        //   117: istore_1       
        //   118: goto            27
        //   121: astore          6
        //   123: aload           6
        //   125: athrow         
        //   126: iconst_0       
        //   127: istore_2       
        //   128: goto            44
        //   131: astore_3       
        //   132: aload_3        
        //   133: athrow         
        //   134: astore          4
        //   136: aload           4
        //   138: athrow         
        //   139: getstatic       com/whatsapp/gdrive/GoogleDriveService.z:Landroid/os/ConditionVariable;
        //   142: invokevirtual   android/os/ConditionVariable.close:()V
        //   145: getstatic       com/whatsapp/gdrive/GoogleDriveService.U:Landroid/os/ConditionVariable;
        //   148: invokevirtual   android/os/ConditionVariable.close:()V
        //   151: iconst_0       
        //   152: putstatic       com/whatsapp/gdrive/GoogleDriveService.f:Z
        //   155: iconst_0       
        //   156: putstatic       com/whatsapp/gdrive/GoogleDriveService.S:Z
        //   159: goto            84
        //   162: astore          5
        //   164: aload           5
        //   166: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  17     23     111    116    Ljava/lang/NullPointerException;
        //  31     37     121    126    Ljava/lang/NullPointerException;
        //  44     54     131    134    Ljava/lang/NullPointerException;
        //  64     84     134    139    Ljava/lang/NullPointerException;
        //  84     110    162    167    Ljava/lang/NullPointerException;
        //  132    134    134    139    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 80, Size: 80
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
    
    private static long ai() {
        return e().getLong(GoogleDriveService.bb[304], 0L);
    }
    
    private boolean aj() {
        int n = 0;
        while (this.C()) {
            try {
                if (this.L.a(this.k, GoogleDriveService.bb[27], String.valueOf(false))) {
                    return this.v();
                }
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            Log.e(GoogleDriveService.bb[26] + n);
            al.a(n);
            final int n2 = n + 1;
            if (n >= 5) {
                break;
            }
            n = n2;
        }
        return false;
    }
    
    private static boolean ak() {
        final SharedPreferences$Editor edit = e().edit();
        try {
            edit.putInt(GoogleDriveService.bb[151], 0);
            if (!edit.commit()) {
                Log.w(GoogleDriveService.bb[152]);
                return false;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return true;
    }
    
    private boolean al() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   com/whatsapp/gdrive/GoogleDriveService.f:()Z
        //     4: istore_2       
        //     5: iload_2        
        //     6: ifne            14
        //     9: iconst_0       
        //    10: ireturn        
        //    11: astore_1       
        //    12: aload_1        
        //    13: athrow         
        //    14: aload_0        
        //    15: aconst_null    
        //    16: putfield        com/whatsapp/gdrive/GoogleDriveService.k:Ljava/lang/String;
        //    19: iconst_0       
        //    20: istore_3       
        //    21: aload_0        
        //    22: invokespecial   com/whatsapp/gdrive/GoogleDriveService.C:()Z
        //    25: ifeq            9
        //    28: aload_0        
        //    29: aload_0        
        //    30: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //    33: aload_0        
        //    34: getfield        com/whatsapp/gdrive/GoogleDriveService.g:Ljava/lang/String;
        //    37: invokevirtual   com/whatsapp/gdrive/q.g:(Ljava/lang/String;)Ljava/lang/String;
        //    40: putfield        com/whatsapp/gdrive/GoogleDriveService.k:Ljava/lang/String;
        //    43: aload_0        
        //    44: getfield        com/whatsapp/gdrive/GoogleDriveService.k:Ljava/lang/String;
        //    47: ifnonnull       64
        //    50: iload_3        
        //    51: invokestatic    com/whatsapp/gdrive/al.a:(I)V
        //    54: iload_3        
        //    55: iconst_1       
        //    56: iadd           
        //    57: istore          7
        //    59: iload_3        
        //    60: iconst_5       
        //    61: if_icmplt       87
        //    64: aload_0        
        //    65: getfield        com/whatsapp/gdrive/GoogleDriveService.k:Ljava/lang/String;
        //    68: astore          6
        //    70: aload           6
        //    72: ifnull          9
        //    75: iconst_1       
        //    76: ireturn        
        //    77: astore          4
        //    79: aload           4
        //    81: athrow         
        //    82: astore          5
        //    84: aload           5
        //    86: athrow         
        //    87: iload           7
        //    89: istore_3       
        //    90: goto            21
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      5      11     14     Ljava/lang/NullPointerException;
        //  28     54     77     82     Ljava/lang/NullPointerException;
        //  64     70     82     87     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0064:
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
    
    public static boolean am() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.H:Z
        //     3: istore_1       
        //     4: iload_1        
        //     5: ifne            13
        //     8: iconst_0       
        //     9: ireturn        
        //    10: astore_0       
        //    11: aload_0        
        //    12: athrow         
        //    13: getstatic       com/whatsapp/App.aV:I
        //    16: iconst_2       
        //    17: if_icmpne       30
        //    20: getstatic       com/whatsapp/App.aS:I
        //    23: istore          11
        //    25: iload           11
        //    27: ifeq            41
        //    30: getstatic       com/whatsapp/App.aV:I
        //    33: istore          5
        //    35: iload           5
        //    37: iconst_3       
        //    38: if_icmpne       8
        //    41: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    44: bipush          9
        //    46: if_icmpge       77
        //    49: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    52: sipush          233
        //    55: aaload         
        //    56: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    59: iconst_0       
        //    60: ireturn        
        //    61: astore          6
        //    63: aload           6
        //    65: athrow         
        //    66: astore_2       
        //    67: aload_2        
        //    68: athrow         
        //    69: astore_3       
        //    70: aload_3        
        //    71: athrow         
        //    72: astore          4
        //    74: aload           4
        //    76: athrow         
        //    77: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    80: invokestatic    com/google/android/gms/common/GooglePlayServicesUtil.isGooglePlayServicesAvailable:(Landroid/content/Context;)I
        //    83: istore          8
        //    85: iload           8
        //    87: ifne            118
        //    90: iconst_1       
        //    91: ireturn        
        //    92: astore          7
        //    94: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    97: sipush          235
        //   100: aaload         
        //   101: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   104: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   107: sipush          236
        //   110: aaload         
        //   111: aload           7
        //   113: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   116: iconst_0       
        //   117: ireturn        
        //   118: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   121: invokevirtual   com/whatsapp/App.getPackageManager:()Landroid/content/pm/PackageManager;
        //   124: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   127: sipush          234
        //   130: aaload         
        //   131: iconst_1       
        //   132: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //   135: pop            
        //   136: new             Ljava/lang/StringBuilder;
        //   139: dup            
        //   140: invokespecial   java/lang/StringBuilder.<init>:()V
        //   143: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   146: sipush          237
        //   149: aaload         
        //   150: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   153: iload           8
        //   155: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   158: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   161: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   164: iconst_1       
        //   165: ireturn        
        //   166: astore          9
        //   168: new             Ljava/lang/StringBuilder;
        //   171: dup            
        //   172: invokespecial   java/lang/StringBuilder.<init>:()V
        //   175: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   178: sipush          232
        //   181: aaload         
        //   182: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   185: iload           8
        //   187: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   190: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   193: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   196: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   199: sipush          231
        //   202: aaload         
        //   203: aload           9
        //   205: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   208: iconst_0       
        //   209: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      4      10     13     Ljava/lang/NullPointerException;
        //  13     25     66     69     Ljava/lang/NullPointerException;
        //  30     35     69     77     Ljava/lang/NullPointerException;
        //  41     59     61     66     Ljava/lang/NullPointerException;
        //  67     69     69     77     Ljava/lang/NullPointerException;
        //  70     72     72     77     Ljava/lang/NullPointerException;
        //  77     85     92     118    Ljava/lang/NullPointerException;
        //  118    164    166    210    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0030:
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
    
    private static long b() {
        return e().getLong(GoogleDriveService.bb[28], 0L);
    }
    
    private String b(final String s) {
        if (s == null) {
            try {
                Log.e(GoogleDriveService.bb[48]);
                return null;
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        try {
            if (this.P == null) {
                Log.e(GoogleDriveService.bb[46]);
                return null;
            }
        }
        catch (NullPointerException ex2) {
            throw ex2;
        }
        Label_0086: {
            try {
                if (s.equals(GoogleDriveService.bb[45])) {
                    break Label_0086;
                }
                final String s2 = s;
                final GoogleDriveService googleDriveService = this;
                final String s3 = googleDriveService.g;
                final boolean b = s2.equals(s3);
                if (!b) {
                    final GoogleDriveService googleDriveService2 = this;
                    final bq bq = googleDriveService2.P;
                    final String s4 = s;
                    return bq.e(s4);
                }
                break Label_0086;
            }
            catch (NullPointerException ex3) {
                try {
                    throw ex3;
                }
                catch (NullPointerException ex4) {
                    throw ex4;
                }
            }
            try {
                final String s2 = s;
                final GoogleDriveService googleDriveService = this;
                final String s3 = googleDriveService.g;
                final boolean b = s2.equals(s3);
                if (!b) {
                    final GoogleDriveService googleDriveService2 = this;
                    final bq bq = googleDriveService2.P;
                    final String s4 = s;
                    return bq.e(s4);
                }
            }
            catch (NullPointerException ex5) {}
        }
        Log.e(GoogleDriveService.bb[47] + s);
        return null;
    }
    
    private static boolean b(final int n) {
        final SharedPreferences$Editor edit = e().edit();
        try {
            edit.putInt(GoogleDriveService.bb[25], n);
            if (!edit.commit()) {
                Log.w(GoogleDriveService.bb[24]);
                return false;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return true;
    }
    
    private static boolean b(final long n) {
        final SharedPreferences$Editor edit = e().edit();
        try {
            edit.putLong(GoogleDriveService.bb[318], n);
            if (!edit.commit()) {
                Log.w(GoogleDriveService.bb[317]);
                return false;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return true;
    }
    
    static boolean b(final GoogleDriveService googleDriveService) {
        return googleDriveService.ab;
    }
    
    static boolean b(@NonNull final String s, final long n) {
        if (s == null) {
            try {
                Log.e(GoogleDriveService.bb[323] + n + GoogleDriveService.bb[322]);
                return false;
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        final SharedPreferences$Editor edit = e().edit();
        try {
            edit.putLong(GoogleDriveService.bb[325] + s, n);
            if (!edit.commit()) {
                Log.w(GoogleDriveService.bb[324]);
                return false;
            }
        }
        catch (NullPointerException ex2) {
            throw ex2;
        }
        return true;
    }
    
    private boolean b(@NonNull final List p0, @NonNull final File p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore_3       
        //     4: new             Ljava/util/ArrayList;
        //     7: dup            
        //     8: sipush          1000
        //    11: invokespecial   java/util/ArrayList.<init>:(I)V
        //    14: astore          4
        //    16: aload_0        
        //    17: aload           4
        //    19: aload_2        
        //    20: invokespecial   com/whatsapp/gdrive/GoogleDriveService.a:(Ljava/util/List;Ljava/io/File;)V
        //    23: new             Ljava/util/concurrent/CountDownLatch;
        //    26: dup            
        //    27: aload           4
        //    29: invokeinterface java/util/List.size:()I
        //    34: invokespecial   java/util/concurrent/CountDownLatch.<init>:(I)V
        //    37: astore          5
        //    39: new             Ljava/util/concurrent/atomic/AtomicBoolean;
        //    42: dup            
        //    43: iconst_1       
        //    44: invokespecial   java/util/concurrent/atomic/AtomicBoolean.<init>:(Z)V
        //    47: astore          6
        //    49: aload           4
        //    51: invokeinterface java/util/List.size:()I
        //    56: bipush          100
        //    58: if_icmple       110
        //    61: aload           4
        //    63: invokeinterface java/util/List.size:()I
        //    68: bipush          100
        //    70: idiv           
        //    71: istore          29
        //    73: iload           29
        //    75: istore          8
        //    77: iconst_0       
        //    78: istore          9
        //    80: iload           9
        //    82: aload           4
        //    84: invokeinterface java/util/List.size:()I
        //    89: if_icmpge       293
        //    92: aload_0        
        //    93: invokespecial   com/whatsapp/gdrive/GoogleDriveService.C:()Z
        //    96: istore          12
        //    98: iload           12
        //   100: ifne            121
        //   103: iconst_0       
        //   104: ireturn        
        //   105: astore          7
        //   107: aload           7
        //   109: athrow         
        //   110: iconst_1       
        //   111: istore          8
        //   113: goto            77
        //   116: astore          11
        //   118: aload           11
        //   120: athrow         
        //   121: aload           4
        //   123: iload           9
        //   125: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   130: checkcast       Ljava/io/File;
        //   133: astore          13
        //   135: aload           13
        //   137: invokevirtual   java/io/File.exists:()Z
        //   140: ifeq            314
        //   143: aload           13
        //   145: invokevirtual   java/io/File.length:()J
        //   148: lstore          27
        //   150: lload           27
        //   152: lconst_0       
        //   153: lcmp           
        //   154: ifle            314
        //   157: iconst_1       
        //   158: istore          16
        //   160: aload           13
        //   162: invokestatic    com/whatsapp/qf.a:(Ljava/io/File;)Z
        //   165: ifeq            188
        //   168: aload           13
        //   170: invokevirtual   java/io/File.length:()J
        //   173: lstore          23
        //   175: getstatic       com/whatsapp/gdrive/GoogleDriveService.W:J
        //   178: lstore          25
        //   180: lload           23
        //   182: lload           25
        //   184: lcmp           
        //   185: ifgt            330
        //   188: iconst_1       
        //   189: istore          19
        //   191: iload           16
        //   193: iload           19
        //   195: iand           
        //   196: ifeq            232
        //   199: iload           9
        //   201: iload           8
        //   203: irem           
        //   204: ifne            336
        //   207: iconst_1       
        //   208: istore          22
        //   210: new             Lcom/whatsapp/gdrive/ap;
        //   213: dup            
        //   214: aload_0        
        //   215: aload           13
        //   217: aload_1        
        //   218: iload           22
        //   220: aload           5
        //   222: invokespecial   com/whatsapp/gdrive/ap.<init>:(Lcom/whatsapp/gdrive/GoogleDriveService;Ljava/io/File;Ljava/util/List;ZLjava/util/concurrent/CountDownLatch;)V
        //   225: invokestatic    com/whatsapp/gdrive/h.a:(Ljava/lang/Runnable;)V
        //   228: iload_3        
        //   229: ifeq            283
        //   232: new             Ljava/lang/StringBuilder;
        //   235: dup            
        //   236: invokespecial   java/lang/StringBuilder.<init>:()V
        //   239: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   242: sipush          328
        //   245: aaload         
        //   246: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   249: aload           13
        //   251: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   254: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   257: sipush          329
        //   260: aaload         
        //   261: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   264: aload           13
        //   266: invokevirtual   java/io/File.length:()J
        //   269: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   272: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   275: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   278: aload           5
        //   280: invokevirtual   java/util/concurrent/CountDownLatch.countDown:()V
        //   283: iload           9
        //   285: iconst_1       
        //   286: iadd           
        //   287: istore          21
        //   289: iload_3        
        //   290: ifeq            357
        //   293: aload           5
        //   295: invokevirtual   java/util/concurrent/CountDownLatch.await:()V
        //   298: aload           6
        //   300: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //   303: ireturn        
        //   304: astore          14
        //   306: aload           14
        //   308: athrow         
        //   309: astore          15
        //   311: aload           15
        //   313: athrow         
        //   314: iconst_0       
        //   315: istore          16
        //   317: goto            160
        //   320: astore          17
        //   322: aload           17
        //   324: athrow         
        //   325: astore          18
        //   327: aload           18
        //   329: athrow         
        //   330: iconst_0       
        //   331: istore          19
        //   333: goto            191
        //   336: iconst_0       
        //   337: istore          22
        //   339: goto            210
        //   342: astore          20
        //   344: aload           20
        //   346: athrow         
        //   347: astore          10
        //   349: aload           10
        //   351: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   354: goto            298
        //   357: iload           21
        //   359: istore          9
        //   361: goto            80
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  49     73     105    110    Ljava/lang/InterruptedException;
        //  92     98     116    121    Ljava/lang/InterruptedException;
        //  135    150    304    314    Ljava/lang/InterruptedException;
        //  160    180    320    330    Ljava/lang/InterruptedException;
        //  210    228    342    347    Ljava/lang/InterruptedException;
        //  232    283    342    347    Ljava/lang/InterruptedException;
        //  293    298    347    357    Ljava/lang/InterruptedException;
        //  306    309    309    314    Ljava/lang/InterruptedException;
        //  322    325    325    330    Ljava/lang/InterruptedException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 169, Size: 169
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
    
    private boolean b(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore_2       
        //     4: iload_1        
        //     5: ifne            61
        //     8: aload_0        
        //     9: invokespecial   com/whatsapp/gdrive/GoogleDriveService.j:()Z
        //    12: istore          23
        //    14: iload           23
        //    16: ifeq            61
        //    19: iconst_1       
        //    20: istore_3       
        //    21: iload_3        
        //    22: ifeq            44
        //    25: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    28: sipush          199
        //    31: aaload         
        //    32: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    35: aload_0        
        //    36: aconst_null    
        //    37: putfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //    40: iload_2        
        //    41: ifeq            266
        //    44: iconst_0       
        //    45: istore          4
        //    47: aload_0        
        //    48: invokespecial   com/whatsapp/gdrive/GoogleDriveService.f:()Z
        //    51: ifne            66
        //    54: iconst_0       
        //    55: ireturn        
        //    56: astore          22
        //    58: aload           22
        //    60: athrow         
        //    61: iconst_0       
        //    62: istore_3       
        //    63: goto            21
        //    66: aload_0        
        //    67: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //    70: invokevirtual   com/whatsapp/gdrive/q.b:()Z
        //    73: istore          6
        //    75: iload           6
        //    77: ifne            54
        //    80: aload_0        
        //    81: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //    84: aload_0        
        //    85: invokespecial   com/whatsapp/gdrive/GoogleDriveService.K:()Ljava/lang/String;
        //    88: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    91: sipush          202
        //    94: aaload         
        //    95: invokevirtual   com/whatsapp/gdrive/q.c:(Ljava/lang/String;Ljava/lang/String;)[Lcom/whatsapp/gdrive/ag;
        //    98: astore          7
        //   100: aload           7
        //   102: ifnonnull       128
        //   105: aload_0        
        //   106: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //   109: invokevirtual   com/whatsapp/gdrive/q.b:()Z
        //   112: istore          20
        //   114: iload           20
        //   116: ifne            54
        //   119: iload           4
        //   121: invokestatic    com/whatsapp/gdrive/al.a:(I)V
        //   124: iload_2        
        //   125: ifeq            254
        //   128: aload           7
        //   130: arraylength    
        //   131: istore          9
        //   133: iload           9
        //   135: ifle            266
        //   138: aload           7
        //   140: iconst_0       
        //   141: aaload         
        //   142: astore          10
        //   144: aload_0        
        //   145: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //   148: ifnonnull       182
        //   151: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   154: sipush          194
        //   157: aaload         
        //   158: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   161: aload_0        
        //   162: new             Lcom/whatsapp/gdrive/bq;
        //   165: dup            
        //   166: aload_0        
        //   167: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //   170: aload_0        
        //   171: getfield        com/whatsapp/gdrive/GoogleDriveService.k:Ljava/lang/String;
        //   174: aload           10
        //   176: invokespecial   com/whatsapp/gdrive/bq.<init>:(Lcom/whatsapp/gdrive/q;Ljava/lang/String;Lcom/whatsapp/gdrive/ag;)V
        //   179: putfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //   182: aload_0        
        //   183: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //   186: invokevirtual   com/whatsapp/gdrive/bq.j:()Z
        //   189: ifne            435
        //   192: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   195: sipush          198
        //   198: aaload         
        //   199: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   202: iconst_0       
        //   203: istore          14
        //   205: aload_0        
        //   206: invokespecial   com/whatsapp/gdrive/GoogleDriveService.f:()Z
        //   209: ifeq            54
        //   212: aload_0        
        //   213: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //   216: invokevirtual   com/whatsapp/gdrive/q.b:()Z
        //   219: ifeq            277
        //   222: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   225: sipush          196
        //   228: aaload         
        //   229: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   232: iconst_0       
        //   233: ireturn        
        //   234: astore          15
        //   236: aload           15
        //   238: athrow         
        //   239: astore          5
        //   241: aload           5
        //   243: athrow         
        //   244: astore          19
        //   246: aload           19
        //   248: athrow         
        //   249: astore          8
        //   251: aload           8
        //   253: athrow         
        //   254: iload           4
        //   256: iconst_1       
        //   257: iadd           
        //   258: istore          21
        //   260: iload           4
        //   262: iconst_5       
        //   263: if_icmplt       441
        //   266: aconst_null    
        //   267: astore          10
        //   269: goto            144
        //   272: astore          11
        //   274: aload           11
        //   276: athrow         
        //   277: aload_0        
        //   278: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //   281: iload_3        
        //   282: invokevirtual   com/whatsapp/gdrive/bq.a:(Z)Z
        //   285: istore          16
        //   287: iload           16
        //   289: ifeq            296
        //   292: iload_2        
        //   293: ifeq            350
        //   296: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   299: sipush          200
        //   302: aaload         
        //   303: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   306: aload_0        
        //   307: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //   310: invokevirtual   com/whatsapp/gdrive/q.b:()Z
        //   313: ifeq            333
        //   316: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   319: sipush          195
        //   322: aaload         
        //   323: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   326: iconst_0       
        //   327: ireturn        
        //   328: astore          17
        //   330: aload           17
        //   332: athrow         
        //   333: iload           14
        //   335: invokestatic    com/whatsapp/gdrive/al.a:(I)V
        //   338: iload           14
        //   340: iconst_1       
        //   341: iadd           
        //   342: istore          18
        //   344: iload           14
        //   346: iconst_5       
        //   347: if_icmplt       428
        //   350: iload           16
        //   352: istore          12
        //   354: iload           12
        //   356: ifeq            392
        //   359: new             Ljava/lang/StringBuilder;
        //   362: dup            
        //   363: invokespecial   java/lang/StringBuilder.<init>:()V
        //   366: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   369: sipush          201
        //   372: aaload         
        //   373: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   376: aload_0        
        //   377: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //   380: invokevirtual   com/whatsapp/gdrive/bq.n:()I
        //   383: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   386: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   389: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   392: new             Ljava/lang/StringBuilder;
        //   395: dup            
        //   396: invokespecial   java/lang/StringBuilder.<init>:()V
        //   399: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   402: sipush          197
        //   405: aaload         
        //   406: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   409: iload           12
        //   411: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   414: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   417: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   420: iload           12
        //   422: ireturn        
        //   423: astore          13
        //   425: aload           13
        //   427: athrow         
        //   428: iload           18
        //   430: istore          14
        //   432: goto            205
        //   435: iconst_1       
        //   436: istore          12
        //   438: goto            354
        //   441: iload           21
        //   443: istore          4
        //   445: goto            47
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  8      14     56     61     Ljava/lang/NullPointerException;
        //  66     75     239    244    Ljava/lang/NullPointerException;
        //  105    114    244    249    Ljava/lang/NullPointerException;
        //  119    124    249    254    Ljava/lang/NullPointerException;
        //  128    133    249    254    Ljava/lang/NullPointerException;
        //  144    182    272    277    Ljava/lang/NullPointerException;
        //  212    232    234    239    Ljava/lang/NullPointerException;
        //  296    326    328    333    Ljava/lang/NullPointerException;
        //  359    392    423    428    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 213, Size: 213
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
    
    static void c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/whatsapp/App.j:()I
        //     3: putstatic       com/whatsapp/gdrive/GoogleDriveService.c:I
        //     6: getstatic       com/whatsapp/gdrive/GoogleDriveService.c:I
        //     9: istore_1       
        //    10: iload_1        
        //    11: tableswitch {
        //                0: 321
        //                1: 128
        //                2: 174
        //                3: 278
        //          default: 40
        //        }
        //    40: new             Ljava/lang/StringBuilder;
        //    43: dup            
        //    44: invokespecial   java/lang/StringBuilder.<init>:()V
        //    47: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    50: sipush          159
        //    53: aaload         
        //    54: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    57: getstatic       com/whatsapp/gdrive/GoogleDriveService.m:Z
        //    60: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //    63: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    66: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    69: new             Ljava/lang/StringBuilder;
        //    72: dup            
        //    73: invokespecial   java/lang/StringBuilder.<init>:()V
        //    76: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    79: sipush          157
        //    82: aaload         
        //    83: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    86: getstatic       com/whatsapp/gdrive/GoogleDriveService.G:Z
        //    89: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //    92: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    95: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    98: new             Ljava/lang/StringBuilder;
        //   101: dup            
        //   102: invokespecial   java/lang/StringBuilder.<init>:()V
        //   105: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   108: sipush          158
        //   111: aaload         
        //   112: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   115: getstatic       com/whatsapp/gdrive/GoogleDriveService.Y:Z
        //   118: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   121: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   124: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   127: return         
        //   128: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   131: sipush          153
        //   134: aaload         
        //   135: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   138: getstatic       com/whatsapp/gdrive/GoogleDriveService.V:Landroid/os/ConditionVariable;
        //   141: invokevirtual   android/os/ConditionVariable.open:()V
        //   144: getstatic       com/whatsapp/gdrive/GoogleDriveService.K:Landroid/os/ConditionVariable;
        //   147: invokevirtual   android/os/ConditionVariable.open:()V
        //   150: getstatic       com/whatsapp/gdrive/GoogleDriveService.A:Landroid/os/ConditionVariable;
        //   153: invokevirtual   android/os/ConditionVariable.open:()V
        //   156: iconst_1       
        //   157: putstatic       com/whatsapp/gdrive/GoogleDriveService.m:Z
        //   160: iconst_1       
        //   161: putstatic       com/whatsapp/gdrive/GoogleDriveService.G:Z
        //   164: iconst_1       
        //   165: putstatic       com/whatsapp/gdrive/GoogleDriveService.Y:Z
        //   168: goto            40
        //   171: astore_0       
        //   172: aload_0        
        //   173: athrow         
        //   174: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   177: sipush          154
        //   180: aaload         
        //   181: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   184: getstatic       com/whatsapp/gdrive/GoogleDriveService.V:Landroid/os/ConditionVariable;
        //   187: invokevirtual   android/os/ConditionVariable.open:()V
        //   190: iconst_1       
        //   191: putstatic       com/whatsapp/gdrive/GoogleDriveService.m:Z
        //   194: getstatic       com/whatsapp/gdrive/GoogleDriveService.p:Z
        //   197: istore          4
        //   199: iload           4
        //   201: ifne            211
        //   204: getstatic       com/whatsapp/gdrive/GoogleDriveService.E:I
        //   207: iconst_1       
        //   208: if_icmpne       252
        //   211: getstatic       com/whatsapp/gdrive/GoogleDriveService.A:Landroid/os/ConditionVariable;
        //   214: invokevirtual   android/os/ConditionVariable.open:()V
        //   217: iconst_1       
        //   218: putstatic       com/whatsapp/gdrive/GoogleDriveService.Y:Z
        //   221: getstatic       com/whatsapp/gdrive/GoogleDriveService.C:I
        //   224: iconst_1       
        //   225: if_icmpne       265
        //   228: getstatic       com/whatsapp/gdrive/GoogleDriveService.K:Landroid/os/ConditionVariable;
        //   231: invokevirtual   android/os/ConditionVariable.open:()V
        //   234: iconst_1       
        //   235: putstatic       com/whatsapp/gdrive/GoogleDriveService.G:Z
        //   238: goto            40
        //   241: astore          5
        //   243: aload           5
        //   245: athrow         
        //   246: astore_2       
        //   247: aload_2        
        //   248: athrow         
        //   249: astore_3       
        //   250: aload_3        
        //   251: athrow         
        //   252: getstatic       com/whatsapp/gdrive/GoogleDriveService.A:Landroid/os/ConditionVariable;
        //   255: invokevirtual   android/os/ConditionVariable.close:()V
        //   258: iconst_0       
        //   259: putstatic       com/whatsapp/gdrive/GoogleDriveService.Y:Z
        //   262: goto            221
        //   265: getstatic       com/whatsapp/gdrive/GoogleDriveService.K:Landroid/os/ConditionVariable;
        //   268: invokevirtual   android/os/ConditionVariable.close:()V
        //   271: iconst_0       
        //   272: putstatic       com/whatsapp/gdrive/GoogleDriveService.G:Z
        //   275: goto            40
        //   278: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   281: sipush          155
        //   284: aaload         
        //   285: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   288: getstatic       com/whatsapp/gdrive/GoogleDriveService.V:Landroid/os/ConditionVariable;
        //   291: invokevirtual   android/os/ConditionVariable.open:()V
        //   294: getstatic       com/whatsapp/gdrive/GoogleDriveService.K:Landroid/os/ConditionVariable;
        //   297: invokevirtual   android/os/ConditionVariable.close:()V
        //   300: getstatic       com/whatsapp/gdrive/GoogleDriveService.A:Landroid/os/ConditionVariable;
        //   303: invokevirtual   android/os/ConditionVariable.close:()V
        //   306: iconst_1       
        //   307: putstatic       com/whatsapp/gdrive/GoogleDriveService.m:Z
        //   310: iconst_0       
        //   311: putstatic       com/whatsapp/gdrive/GoogleDriveService.G:Z
        //   314: iconst_0       
        //   315: putstatic       com/whatsapp/gdrive/GoogleDriveService.Y:Z
        //   318: goto            40
        //   321: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   324: sipush          156
        //   327: aaload         
        //   328: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   331: getstatic       com/whatsapp/gdrive/GoogleDriveService.V:Landroid/os/ConditionVariable;
        //   334: invokevirtual   android/os/ConditionVariable.close:()V
        //   337: getstatic       com/whatsapp/gdrive/GoogleDriveService.K:Landroid/os/ConditionVariable;
        //   340: invokevirtual   android/os/ConditionVariable.close:()V
        //   343: getstatic       com/whatsapp/gdrive/GoogleDriveService.A:Landroid/os/ConditionVariable;
        //   346: invokevirtual   android/os/ConditionVariable.close:()V
        //   349: iconst_0       
        //   350: putstatic       com/whatsapp/gdrive/GoogleDriveService.m:Z
        //   353: iconst_0       
        //   354: putstatic       com/whatsapp/gdrive/GoogleDriveService.G:Z
        //   357: iconst_0       
        //   358: putstatic       com/whatsapp/gdrive/GoogleDriveService.Y:Z
        //   361: goto            40
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      10     171    174    Ljava/lang/NullPointerException;
        //  128    168    171    174    Ljava/lang/NullPointerException;
        //  174    199    246    249    Ljava/lang/NullPointerException;
        //  204    211    249    252    Ljava/lang/NullPointerException;
        //  211    221    249    252    Ljava/lang/NullPointerException;
        //  221    238    241    246    Ljava/lang/NullPointerException;
        //  247    249    249    252    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0211:
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
    
    static boolean c(final int n) {
        Label_0036: {
            switch (n) {
                default: {
                    break Label_0036;
                }
                case 0:
                case 1:
                case 2:
                case 3:
                case 4: {
                    Label_0065: {
                        break Label_0065;
                        try {
                            Log.e(GoogleDriveService.bb[246] + n);
                            return false;
                            while (true) {
                                final SharedPreferences$Editor edit = e().edit();
                                try {
                                    edit.putString(GoogleDriveService.bb[245], String.valueOf(n));
                                    if (!edit.commit()) {
                                        Log.w(GoogleDriveService.bb[244]);
                                        return false;
                                    }
                                    return true;
                                }
                                catch (NullPointerException ex) {
                                    throw ex;
                                }
                                continue;
                            }
                        }
                        // iftrue(Label_0036:, GoogleDriveService.F != 0)
                        catch (NullPointerException ex2) {
                            throw ex2;
                        }
                    }
                    return true;
                }
            }
        }
    }
    
    private static boolean c(final long n) {
        final SharedPreferences$Editor edit = e().edit();
        try {
            edit.putLong(GoogleDriveService.bb[62], n);
            if (!edit.commit()) {
                Log.w(GoogleDriveService.bb[63]);
                return false;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return true;
    }
    
    static boolean c(final GoogleDriveService googleDriveService) {
        return googleDriveService.f();
    }
    
    static long d(@NonNull final String s) {
        if (s == null) {
            try {
                Log.e(GoogleDriveService.bb[37]);
                return -1L;
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        return e().getLong(GoogleDriveService.bb[36] + s, -1L);
    }
    
    static aq d(final GoogleDriveService googleDriveService) {
        return googleDriveService.Z;
    }
    
    static void d() {
        GoogleDriveService.h = true;
        ah();
    }
    
    static boolean d(final int e) {
        Label_0024: {
            switch (e) {
                default: {
                    break Label_0024;
                }
                case 0:
                case 1: {
                    Label_0052: {
                        break Label_0052;
                        try {
                            Log.e(GoogleDriveService.bb[32] + e);
                            return false;
                            while (true) {
                                GoogleDriveService.E = e;
                                c();
                                final SharedPreferences$Editor edit = e().edit();
                                try {
                                    edit.putString(GoogleDriveService.bb[31], String.valueOf(e));
                                    if (!edit.commit()) {
                                        Log.w(GoogleDriveService.bb[30]);
                                        return false;
                                    }
                                    return true;
                                }
                                catch (NullPointerException ex) {
                                    throw ex;
                                }
                                continue;
                            }
                        }
                        // iftrue(Label_0024:, GoogleDriveService.F != 0)
                        catch (NullPointerException ex2) {
                            throw ex2;
                        }
                    }
                    return true;
                }
            }
        }
    }
    
    private static boolean d(final long n) {
        final SharedPreferences$Editor edit = e().edit();
        try {
            edit.putLong(GoogleDriveService.bb[60], n);
            if (!edit.commit()) {
                Log.w(GoogleDriveService.bb[61]);
                return false;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return true;
    }
    
    private static SharedPreferences e() {
        try {
            if (GoogleDriveService.o == null) {
                GoogleDriveService.o = App.aq.getSharedPreferences(GoogleDriveService.bb[320], 0);
            }
            return GoogleDriveService.o;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    static boolean e(final long n) {
        return b(n);
    }
    
    static boolean e(final GoogleDriveService googleDriveService) {
        return googleDriveService.C();
    }
    
    private boolean e(final String s) {
        int n = 0;
        while (true) {
            int n2;
            try {
                if (!D()) {
                    return false;
                }
                if (this.L.f(s)) {
                    Log.i(GoogleDriveService.bb[150] + s + GoogleDriveService.bb[146]);
                    return true;
                }
                n2 = n + 1;
                if (n >= 5) {
                    Log.i(GoogleDriveService.bb[149] + s + GoogleDriveService.bb[145]);
                    return false;
                }
            }
            catch (b3 b3) {
                Log.e(GoogleDriveService.bb[148] + s + GoogleDriveService.bb[147]);
                return false;
            }
            n = n2;
        }
    }
    
    static long f(final GoogleDriveService googleDriveService) {
        return googleDriveService.b;
    }
    
    private boolean f() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore_1       
        //     4: getstatic       com/whatsapp/gdrive/GoogleDriveService.m:Z
        //     7: istore_2       
        //     8: getstatic       com/whatsapp/gdrive/GoogleDriveService.s:Z
        //    11: istore_3       
        //    12: invokestatic    com/whatsapp/gdrive/GoogleDriveService.af:()Z
        //    15: ifeq            30
        //    18: getstatic       com/whatsapp/gdrive/GoogleDriveService.Y:Z
        //    21: istore_2       
        //    22: getstatic       com/whatsapp/gdrive/GoogleDriveService.f:Z
        //    25: istore_3       
        //    26: iload_1        
        //    27: ifeq            48
        //    30: invokestatic    com/whatsapp/gdrive/GoogleDriveService.z:()Z
        //    33: istore          5
        //    35: iload           5
        //    37: ifeq            48
        //    40: getstatic       com/whatsapp/gdrive/GoogleDriveService.G:Z
        //    43: istore_2       
        //    44: getstatic       com/whatsapp/gdrive/GoogleDriveService.S:Z
        //    47: istore_3       
        //    48: iload_2        
        //    49: ifeq            82
        //    52: iload_3        
        //    53: ifeq            82
        //    56: getstatic       com/whatsapp/gdrive/GoogleDriveService.x:Z
        //    59: ifeq            82
        //    62: aload_0        
        //    63: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //    66: iconst_1       
        //    67: invokevirtual   com/whatsapp/gdrive/q.a:(Z)V
        //    70: iconst_1       
        //    71: ireturn        
        //    72: astore          4
        //    74: aload           4
        //    76: athrow         
        //    77: astore          34
        //    79: aload           34
        //    81: athrow         
        //    82: iload_2        
        //    83: ifne            116
        //    86: invokestatic    com/whatsapp/gdrive/GoogleDriveService.X:()I
        //    89: istore          31
        //    91: iload           31
        //    93: tableswitch {
        //                2: 229
        //                3: 299
        //          default: 116
        //        }
        //   116: iload_3        
        //   117: ifne            148
        //   120: invokestatic    com/whatsapp/gdrive/GoogleDriveService.X:()I
        //   123: istore          24
        //   125: iload           24
        //   127: tableswitch {
        //                2: 398
        //                3: 428
        //          default: 148
        //        }
        //   148: getstatic       com/whatsapp/gdrive/GoogleDriveService.x:Z
        //   151: istore          13
        //   153: iload           13
        //   155: ifne            188
        //   158: invokestatic    com/whatsapp/gdrive/GoogleDriveService.X:()I
        //   161: istore          19
        //   163: iload           19
        //   165: tableswitch {
        //                2: 502
        //                3: 566
        //          default: 188
        //        }
        //   188: invokestatic    com/whatsapp/gdrive/GoogleDriveService.D:()Z
        //   191: istore          17
        //   193: iload           17
        //   195: ifeq            639
        //   198: invokestatic    com/whatsapp/gdrive/GoogleDriveService.ab:()Z
        //   201: istore          18
        //   203: iload           18
        //   205: ifeq            639
        //   208: invokestatic    com/whatsapp/gdrive/GoogleDriveService.k:()Z
        //   211: ifeq            639
        //   214: aload_0        
        //   215: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //   218: iconst_1       
        //   219: invokevirtual   com/whatsapp/gdrive/q.a:(Z)V
        //   222: iconst_1       
        //   223: ireturn        
        //   224: astore          16
        //   226: aload           16
        //   228: athrow         
        //   229: getstatic       com/whatsapp/gdrive/GoogleDriveService.E:I
        //   232: istore          33
        //   234: iload           33
        //   236: ifne            269
        //   239: aload_0        
        //   240: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //   243: aload_0        
        //   244: getfield        com/whatsapp/gdrive/GoogleDriveService.T:Ljava/util/concurrent/atomic/AtomicLong;
        //   247: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   250: aload_0        
        //   251: getfield        com/whatsapp/gdrive/GoogleDriveService.N:J
        //   254: invokevirtual   com/whatsapp/gdrive/aq.j:(JJ)V
        //   257: aload_0        
        //   258: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //   261: iconst_0       
        //   262: invokevirtual   com/whatsapp/gdrive/q.a:(Z)V
        //   265: iload_1        
        //   266: ifeq            116
        //   269: aload_0        
        //   270: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //   273: aload_0        
        //   274: getfield        com/whatsapp/gdrive/GoogleDriveService.T:Ljava/util/concurrent/atomic/AtomicLong;
        //   277: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   280: aload_0        
        //   281: getfield        com/whatsapp/gdrive/GoogleDriveService.N:J
        //   284: invokevirtual   com/whatsapp/gdrive/aq.k:(JJ)V
        //   287: aload_0        
        //   288: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //   291: iconst_0       
        //   292: invokevirtual   com/whatsapp/gdrive/q.a:(Z)V
        //   295: iload_1        
        //   296: ifeq            116
        //   299: getstatic       com/whatsapp/gdrive/GoogleDriveService.C:I
        //   302: istore          32
        //   304: iload           32
        //   306: ifne            339
        //   309: aload_0        
        //   310: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //   313: aload_0        
        //   314: getfield        com/whatsapp/gdrive/GoogleDriveService.R:Ljava/util/concurrent/atomic/AtomicLong;
        //   317: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   320: aload_0        
        //   321: getfield        com/whatsapp/gdrive/GoogleDriveService.b:J
        //   324: invokevirtual   com/whatsapp/gdrive/aq.h:(JJ)V
        //   327: aload_0        
        //   328: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //   331: iconst_0       
        //   332: invokevirtual   com/whatsapp/gdrive/q.a:(Z)V
        //   335: iload_1        
        //   336: ifeq            116
        //   339: aload_0        
        //   340: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //   343: aload_0        
        //   344: getfield        com/whatsapp/gdrive/GoogleDriveService.R:Ljava/util/concurrent/atomic/AtomicLong;
        //   347: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   350: aload_0        
        //   351: getfield        com/whatsapp/gdrive/GoogleDriveService.b:J
        //   354: invokevirtual   com/whatsapp/gdrive/aq.n:(JJ)V
        //   357: aload_0        
        //   358: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //   361: iconst_0       
        //   362: invokevirtual   com/whatsapp/gdrive/q.a:(Z)V
        //   365: goto            116
        //   368: astore          30
        //   370: aload           30
        //   372: athrow         
        //   373: astore          25
        //   375: aload           25
        //   377: athrow         
        //   378: astore          26
        //   380: aload           26
        //   382: athrow         
        //   383: astore          27
        //   385: aload           27
        //   387: athrow         
        //   388: astore          28
        //   390: aload           28
        //   392: athrow         
        //   393: astore          29
        //   395: aload           29
        //   397: athrow         
        //   398: aload_0        
        //   399: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //   402: aload_0        
        //   403: getfield        com/whatsapp/gdrive/GoogleDriveService.T:Ljava/util/concurrent/atomic/AtomicLong;
        //   406: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   409: aload_0        
        //   410: getfield        com/whatsapp/gdrive/GoogleDriveService.N:J
        //   413: invokevirtual   com/whatsapp/gdrive/aq.b:(JJ)V
        //   416: aload_0        
        //   417: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //   420: iconst_0       
        //   421: invokevirtual   com/whatsapp/gdrive/q.a:(Z)V
        //   424: iload_1        
        //   425: ifeq            148
        //   428: aload_0        
        //   429: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //   432: aload_0        
        //   433: getfield        com/whatsapp/gdrive/GoogleDriveService.R:Ljava/util/concurrent/atomic/AtomicLong;
        //   436: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   439: aload_0        
        //   440: getfield        com/whatsapp/gdrive/GoogleDriveService.b:J
        //   443: invokevirtual   com/whatsapp/gdrive/aq.g:(JJ)V
        //   446: aload_0        
        //   447: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //   450: iconst_0       
        //   451: invokevirtual   com/whatsapp/gdrive/q.a:(Z)V
        //   454: goto            148
        //   457: astore          23
        //   459: aload           23
        //   461: athrow         
        //   462: astore          22
        //   464: aload           22
        //   466: athrow         
        //   467: astore          6
        //   469: aload           6
        //   471: athrow         
        //   472: astore          7
        //   474: aload           7
        //   476: athrow         
        //   477: astore          8
        //   479: aload           8
        //   481: athrow         
        //   482: astore          9
        //   484: aload           9
        //   486: athrow         
        //   487: astore          10
        //   489: aload           10
        //   491: athrow         
        //   492: astore          11
        //   494: aload           11
        //   496: athrow         
        //   497: astore          12
        //   499: aload           12
        //   501: athrow         
        //   502: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   505: sipush          133
        //   508: aaload         
        //   509: invokestatic    android/os/Environment.getExternalStorageState:()Ljava/lang/String;
        //   512: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   515: istore          21
        //   517: iload           21
        //   519: ifeq            544
        //   522: aload_0        
        //   523: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //   526: aload_0        
        //   527: getfield        com/whatsapp/gdrive/GoogleDriveService.T:Ljava/util/concurrent/atomic/AtomicLong;
        //   530: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   533: aload_0        
        //   534: getfield        com/whatsapp/gdrive/GoogleDriveService.N:J
        //   537: invokevirtual   com/whatsapp/gdrive/aq.c:(JJ)V
        //   540: iload_1        
        //   541: ifeq            188
        //   544: aload_0        
        //   545: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //   548: aload_0        
        //   549: getfield        com/whatsapp/gdrive/GoogleDriveService.T:Ljava/util/concurrent/atomic/AtomicLong;
        //   552: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   555: aload_0        
        //   556: getfield        com/whatsapp/gdrive/GoogleDriveService.N:J
        //   559: invokevirtual   com/whatsapp/gdrive/aq.d:(JJ)V
        //   562: iload_1        
        //   563: ifeq            188
        //   566: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   569: sipush          134
        //   572: aaload         
        //   573: invokestatic    android/os/Environment.getExternalStorageState:()Ljava/lang/String;
        //   576: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   579: istore          20
        //   581: iload           20
        //   583: ifeq            608
        //   586: aload_0        
        //   587: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //   590: aload_0        
        //   591: getfield        com/whatsapp/gdrive/GoogleDriveService.R:Ljava/util/concurrent/atomic/AtomicLong;
        //   594: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   597: aload_0        
        //   598: getfield        com/whatsapp/gdrive/GoogleDriveService.b:J
        //   601: invokevirtual   com/whatsapp/gdrive/aq.f:(JJ)V
        //   604: iload_1        
        //   605: ifeq            188
        //   608: aload_0        
        //   609: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //   612: aload_0        
        //   613: getfield        com/whatsapp/gdrive/GoogleDriveService.R:Ljava/util/concurrent/atomic/AtomicLong;
        //   616: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   619: aload_0        
        //   620: getfield        com/whatsapp/gdrive/GoogleDriveService.b:J
        //   623: invokevirtual   com/whatsapp/gdrive/aq.e:(JJ)V
        //   626: goto            188
        //   629: astore          14
        //   631: aload           14
        //   633: athrow         
        //   634: astore          15
        //   636: aload           15
        //   638: athrow         
        //   639: iconst_0       
        //   640: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  30     35     72     77     Ljava/lang/NullPointerException;
        //  56     70     77     82     Ljava/lang/NullPointerException;
        //  86     91     373    378    Ljava/lang/NullPointerException;
        //  120    125    462    467    Ljava/lang/NullPointerException;
        //  148    153    467    472    Ljava/lang/NullPointerException;
        //  158    163    472    477    Ljava/lang/NullPointerException;
        //  188    193    629    634    Ljava/lang/NullPointerException;
        //  198    203    634    639    Ljava/lang/NullPointerException;
        //  208    222    224    229    Ljava/lang/NullPointerException;
        //  229    234    378    383    Ljava/lang/NullPointerException;
        //  239    265    383    388    Ljava/lang/NullPointerException;
        //  269    295    388    393    Ljava/lang/NullPointerException;
        //  299    304    393    398    Ljava/lang/NullPointerException;
        //  309    335    368    373    Ljava/lang/NullPointerException;
        //  339    365    368    373    Ljava/lang/NullPointerException;
        //  375    378    378    383    Ljava/lang/NullPointerException;
        //  380    383    383    388    Ljava/lang/NullPointerException;
        //  385    388    388    393    Ljava/lang/NullPointerException;
        //  390    393    393    398    Ljava/lang/NullPointerException;
        //  395    398    368    373    Ljava/lang/NullPointerException;
        //  398    424    457    462    Ljava/lang/NullPointerException;
        //  428    454    457    462    Ljava/lang/NullPointerException;
        //  464    467    457    462    Ljava/lang/NullPointerException;
        //  469    472    472    477    Ljava/lang/NullPointerException;
        //  474    477    477    482    Ljava/lang/NullPointerException;
        //  479    482    482    487    Ljava/lang/NullPointerException;
        //  484    487    487    492    Ljava/lang/NullPointerException;
        //  489    492    492    497    Ljava/lang/NullPointerException;
        //  494    497    497    502    Ljava/lang/NullPointerException;
        //  502    517    477    482    Ljava/lang/NullPointerException;
        //  522    540    482    487    Ljava/lang/NullPointerException;
        //  544    562    487    492    Ljava/lang/NullPointerException;
        //  566    581    492    497    Ljava/lang/NullPointerException;
        //  586    604    497    502    Ljava/lang/NullPointerException;
        //  608    626    497    502    Ljava/lang/NullPointerException;
        //  631    634    634    639    Ljava/lang/NullPointerException;
        //  636    639    224    229    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 277, Size: 277
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
    
    static boolean f(final long n) {
        return c(n);
    }
    
    private boolean f(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/gdrive/GoogleDriveService.B:Ljava/lang/String;
        //     8: ifnonnull       30
        //    11: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    14: sipush          257
        //    17: aaload         
        //    18: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    21: iconst_1       
        //    22: istore          6
        //    24: iload           6
        //    26: ireturn        
        //    27: astore_3       
        //    28: aload_3        
        //    29: athrow         
        //    30: aload_0        
        //    31: new             Lcom/whatsapp/gdrive/q;
        //    34: dup            
        //    35: aload_0        
        //    36: getfield        com/whatsapp/gdrive/GoogleDriveService.B:Ljava/lang/String;
        //    39: aload_0        
        //    40: invokespecial   com/whatsapp/gdrive/q.<init>:(Ljava/lang/String;Landroid/content/Context;)V
        //    43: putfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //    46: invokestatic    com/whatsapp/gdrive/GoogleDriveService.D:()Z
        //    49: istore          5
        //    51: iconst_0       
        //    52: istore          6
        //    54: iload           5
        //    56: ifeq            24
        //    59: aload_0        
        //    60: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //    63: aload_0        
        //    64: getfield        com/whatsapp/gdrive/GoogleDriveService.B:Ljava/lang/String;
        //    67: invokevirtual   com/whatsapp/gdrive/q.h:(Ljava/lang/String;)Z
        //    70: pop            
        //    71: iconst_0       
        //    72: istore          9
        //    74: invokestatic    com/whatsapp/gdrive/GoogleDriveService.D:()Z
        //    77: istore          10
        //    79: iconst_0       
        //    80: istore          6
        //    82: iload           10
        //    84: ifeq            24
        //    87: aload_0        
        //    88: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //    91: aconst_null    
        //    92: aload_1        
        //    93: invokevirtual   com/whatsapp/gdrive/q.c:(Ljava/lang/String;Ljava/lang/String;)[Lcom/whatsapp/gdrive/ag;
        //    96: astore          11
        //    98: aload           11
        //   100: ifnonnull       157
        //   103: new             Ljava/lang/StringBuilder;
        //   106: dup            
        //   107: invokespecial   java/lang/StringBuilder.<init>:()V
        //   110: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   113: sipush          256
        //   116: aaload         
        //   117: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   120: aload_1        
        //   121: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   124: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   127: sipush          260
        //   130: aaload         
        //   131: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   134: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   137: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   140: iload           9
        //   142: invokestatic    com/whatsapp/gdrive/al.a:(I)V
        //   145: iload           9
        //   147: iconst_1       
        //   148: iadd           
        //   149: istore          26
        //   151: iload           9
        //   153: iconst_5       
        //   154: if_icmplt       453
        //   157: new             Ljava/lang/StringBuilder;
        //   160: dup            
        //   161: invokespecial   java/lang/StringBuilder.<init>:()V
        //   164: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   167: sipush          261
        //   170: aaload         
        //   171: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   174: aload_1        
        //   175: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   178: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   181: sipush          258
        //   184: aaload         
        //   185: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   188: aload           11
        //   190: arraylength    
        //   191: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   194: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   197: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   200: aload           11
        //   202: arraylength    
        //   203: istore          12
        //   205: iconst_0       
        //   206: istore          13
        //   208: iconst_1       
        //   209: istore          14
        //   211: iload           13
        //   213: iload           12
        //   215: if_icmpge       308
        //   218: aload           11
        //   220: iload           13
        //   222: aaload         
        //   223: astore          15
        //   225: iconst_0       
        //   226: istore          16
        //   228: invokestatic    com/whatsapp/gdrive/GoogleDriveService.D:()Z
        //   231: istore          17
        //   233: iconst_0       
        //   234: istore          6
        //   236: iload           17
        //   238: ifeq            24
        //   241: aload_0        
        //   242: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //   245: aload           15
        //   247: invokevirtual   com/whatsapp/gdrive/ag.b:()Ljava/lang/String;
        //   250: invokevirtual   com/whatsapp/gdrive/q.f:(Ljava/lang/String;)Z
        //   253: istore          22
        //   255: iload           22
        //   257: ifne            282
        //   260: iload           16
        //   262: iconst_5       
        //   263: if_icmpne       273
        //   266: iload_2        
        //   267: ifeq            447
        //   270: iconst_0       
        //   271: istore          14
        //   273: iload           16
        //   275: invokestatic    com/whatsapp/gdrive/al.a:(I)V
        //   278: iload_2        
        //   279: ifeq            286
        //   282: iload_2        
        //   283: ifeq            298
        //   286: iload           16
        //   288: iconst_1       
        //   289: iadd           
        //   290: istore          19
        //   292: iload           16
        //   294: iconst_5       
        //   295: if_icmplt       440
        //   298: iload           13
        //   300: iconst_1       
        //   301: iadd           
        //   302: istore          20
        //   304: iload_2        
        //   305: ifeq            433
        //   308: aload_0        
        //   309: aconst_null    
        //   310: putfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //   313: new             Ljava/lang/StringBuilder;
        //   316: dup            
        //   317: invokespecial   java/lang/StringBuilder.<init>:()V
        //   320: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   323: sipush          259
        //   326: aaload         
        //   327: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   330: iload           14
        //   332: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   335: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   338: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   341: iload           14
        //   343: ireturn        
        //   344: astore          4
        //   346: aload           4
        //   348: athrow         
        //   349: astore          7
        //   351: new             Ljava/lang/StringBuilder;
        //   354: dup            
        //   355: invokespecial   java/lang/StringBuilder.<init>:()V
        //   358: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   361: sipush          262
        //   364: aaload         
        //   365: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   368: aload_0        
        //   369: getfield        com/whatsapp/gdrive/GoogleDriveService.B:Ljava/lang/String;
        //   372: invokestatic    com/whatsapp/gdrive/a7.a:(Ljava/lang/String;)Ljava/lang/String;
        //   375: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   378: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   381: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   384: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   387: sipush          255
        //   390: aaload         
        //   391: aload           7
        //   393: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   396: aload_0        
        //   397: bipush          11
        //   399: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.e:(I)V
        //   402: iconst_0       
        //   403: ireturn        
        //   404: astore          25
        //   406: aload           25
        //   408: athrow         
        //   409: astore          21
        //   411: aload           21
        //   413: athrow         
        //   414: astore          18
        //   416: iload_2        
        //   417: ifeq            298
        //   420: goto            286
        //   423: astore          23
        //   425: aload           23
        //   427: athrow         
        //   428: astore          24
        //   430: aload           24
        //   432: athrow         
        //   433: iload           20
        //   435: istore          13
        //   437: goto            211
        //   440: iload           19
        //   442: istore          16
        //   444: goto            228
        //   447: iconst_0       
        //   448: istore          14
        //   450: goto            298
        //   453: iload           26
        //   455: istore          9
        //   457: goto            74
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      21     27     30     Lcom/whatsapp/gdrive/b2;
        //  30     51     344    349    Lcom/whatsapp/gdrive/b2;
        //  59     71     349    404    Lcom/whatsapp/gdrive/b2;
        //  103    145    404    409    Lcom/whatsapp/gdrive/b2;
        //  241    255    409    414    Lcom/whatsapp/gdrive/b2;
        //  241    255    414    423    Lcom/whatsapp/gdrive/b3;
        //  273    278    414    423    Lcom/whatsapp/gdrive/b3;
        //  273    278    423    433    Ljava/lang/NullPointerException;
        //  411    414    414    423    Lcom/whatsapp/gdrive/b3;
        //  425    428    428    433    Lcom/whatsapp/gdrive/b2;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:3035)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
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
    
    static bq g(final GoogleDriveService googleDriveService) {
        return googleDriveService.P;
    }
    
    public static void g(final String s) {
        Label_0041: {
            try {
                if (!GoogleDriveService.bb[54].equals(s)) {
                    break Label_0041;
                }
                final ConditionVariable conditionVariable = GoogleDriveService.j;
                conditionVariable.open();
                final boolean b = GoogleDriveService.x;
                if (!b) {
                    GoogleDriveService.x = true;
                    i();
                }
                return;
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            try {
                final ConditionVariable conditionVariable = GoogleDriveService.j;
                conditionVariable.open();
                final boolean b = GoogleDriveService.x;
                if (!b) {
                    GoogleDriveService.x = true;
                    i();
                }
                return;
            }
            catch (NullPointerException ex2) {
                throw ex2;
            }
        }
        GoogleDriveService.j.close();
        GoogleDriveService.x = false;
    }
    
    public static boolean g() {
        try {
            if (X() == 3) {
                return true;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return false;
    }
    
    static boolean h(final GoogleDriveService googleDriveService) {
        return googleDriveService.S();
    }
    
    public static boolean h(final String s) {
        final SharedPreferences$Editor edit = e().edit();
        try {
            edit.putString(GoogleDriveService.bb[327], s);
            if (!edit.commit()) {
                Log.w(GoogleDriveService.bb[326]);
                return false;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return true;
    }
    
    static AtomicLong i(final GoogleDriveService googleDriveService) {
        return googleDriveService.T;
    }
    
    public static void i() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/whatsapp/gdrive/GoogleDriveService.c:()V
        //     3: invokestatic    com/whatsapp/gdrive/GoogleDriveService.ac:()Z
        //     6: istore          5
        //     8: iload           5
        //    10: ifeq            79
        //    13: invokestatic    com/whatsapp/gdrive/GoogleDriveService.z:()Z
        //    16: istore          15
        //    18: iload           15
        //    20: ifne            79
        //    23: getstatic       com/whatsapp/gdrive/GoogleDriveService.G:Z
        //    26: istore          16
        //    28: iload           16
        //    30: ifeq            79
        //    33: getstatic       com/whatsapp/gdrive/GoogleDriveService.S:Z
        //    36: istore          17
        //    38: iload           17
        //    40: ifeq            79
        //    43: getstatic       com/whatsapp/gdrive/GoogleDriveService.x:Z
        //    46: ifeq            79
        //    49: invokestatic    com/whatsapp/gdrive/GoogleDriveService.R:()V
        //    52: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    55: bipush          57
        //    57: aaload         
        //    58: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    61: return         
        //    62: astore_0       
        //    63: aload_0        
        //    64: athrow         
        //    65: astore_1       
        //    66: aload_1        
        //    67: athrow         
        //    68: astore_2       
        //    69: aload_2        
        //    70: athrow         
        //    71: astore_3       
        //    72: aload_3        
        //    73: athrow         
        //    74: astore          4
        //    76: aload           4
        //    78: athrow         
        //    79: invokestatic    com/whatsapp/gdrive/GoogleDriveService.P:()Z
        //    82: istore          11
        //    84: iload           11
        //    86: ifeq            163
        //    89: invokestatic    com/whatsapp/gdrive/GoogleDriveService.af:()Z
        //    92: istore          12
        //    94: iload           12
        //    96: ifne            163
        //    99: getstatic       com/whatsapp/gdrive/GoogleDriveService.Y:Z
        //   102: istore          13
        //   104: iload           13
        //   106: ifeq            163
        //   109: getstatic       com/whatsapp/gdrive/GoogleDriveService.f:Z
        //   112: istore          14
        //   114: iload           14
        //   116: ifeq            163
        //   119: getstatic       com/whatsapp/gdrive/GoogleDriveService.x:Z
        //   122: ifeq            163
        //   125: invokestatic    com/whatsapp/gdrive/GoogleDriveService.u:()V
        //   128: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   131: bipush          56
        //   133: aaload         
        //   134: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   137: return         
        //   138: astore          10
        //   140: aload           10
        //   142: athrow         
        //   143: astore          6
        //   145: aload           6
        //   147: athrow         
        //   148: astore          7
        //   150: aload           7
        //   152: athrow         
        //   153: astore          8
        //   155: aload           8
        //   157: athrow         
        //   158: astore          9
        //   160: aload           9
        //   162: athrow         
        //   163: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   166: bipush          55
        //   168: aaload         
        //   169: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   172: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      8      62     65     Ljava/lang/NullPointerException;
        //  13     18     65     68     Ljava/lang/NullPointerException;
        //  23     28     68     71     Ljava/lang/NullPointerException;
        //  33     38     71     74     Ljava/lang/NullPointerException;
        //  43     61     74     79     Ljava/lang/NullPointerException;
        //  63     65     65     68     Ljava/lang/NullPointerException;
        //  66     68     68     71     Ljava/lang/NullPointerException;
        //  69     71     71     74     Ljava/lang/NullPointerException;
        //  72     74     74     79     Ljava/lang/NullPointerException;
        //  79     84     143    148    Ljava/lang/NullPointerException;
        //  89     94     148    153    Ljava/lang/NullPointerException;
        //  99     104    153    158    Ljava/lang/NullPointerException;
        //  109    114    158    163    Ljava/lang/NullPointerException;
        //  119    137    138    143    Ljava/lang/NullPointerException;
        //  145    148    148    153    Ljava/lang/NullPointerException;
        //  150    153    153    158    Ljava/lang/NullPointerException;
        //  155    158    158    163    Ljava/lang/NullPointerException;
        //  160    163    138    143    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 84, Size: 84
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
    
    static bv j(final GoogleDriveService googleDriveService) {
        return googleDriveService.O;
    }
    
    private boolean j() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore_1       
        //     4: iconst_0       
        //     5: istore_2       
        //     6: aload_0        
        //     7: invokespecial   com/whatsapp/gdrive/GoogleDriveService.C:()Z
        //    10: ifne            15
        //    13: iconst_0       
        //    14: ireturn        
        //    15: aload_0        
        //    16: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //    19: aload_0        
        //    20: getfield        com/whatsapp/gdrive/GoogleDriveService.k:Ljava/lang/String;
        //    23: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    26: sipush          319
        //    29: aaload         
        //    30: invokevirtual   com/whatsapp/gdrive/q.b:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    33: astore          4
        //    35: aload           4
        //    37: ifnonnull       48
        //    40: iload_2        
        //    41: invokestatic    com/whatsapp/gdrive/al.a:(I)V
        //    44: iload_1        
        //    45: ifeq            69
        //    48: aload           4
        //    50: invokestatic    java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
        //    53: istore          6
        //    55: iload           6
        //    57: ireturn        
        //    58: astore_3       
        //    59: aload_0        
        //    60: invokespecial   com/whatsapp/gdrive/GoogleDriveService.U:()Z
        //    63: ireturn        
        //    64: astore          5
        //    66: aload           5
        //    68: athrow         
        //    69: iload_2        
        //    70: iconst_1       
        //    71: iadd           
        //    72: istore          7
        //    74: iload_2        
        //    75: iconst_5       
        //    76: if_icmplt       81
        //    79: iconst_1       
        //    80: ireturn        
        //    81: iload           7
        //    83: istore_2       
        //    84: goto            6
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  15     35     58     64     Lcom/whatsapp/gdrive/bj;
        //  40     44     64     69     Lcom/whatsapp/gdrive/bj;
        //  48     55     64     69     Lcom/whatsapp/gdrive/bj;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0048:
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
    
    static long k(final GoogleDriveService googleDriveService) {
        return googleDriveService.N;
    }
    
    private static boolean k() {
        try {
            if (!GoogleDriveService.j.block(86400000L)) {
                Log.e(GoogleDriveService.bb[161]);
                return false;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return true;
    }
    
    static AtomicLong l(final GoogleDriveService googleDriveService) {
        return googleDriveService.M;
    }
    
    static void l() {
        GoogleDriveService.p = true;
    }
    
    static long m(final GoogleDriveService googleDriveService) {
        return googleDriveService.Q;
    }
    
    public static boolean n() {
        final int f = GoogleDriveService.F;
        final int ae = ae();
        final long a = a(o());
        Block_1: {
            while (true) {
                switch (ae) {
                    case 0: {
                        Log.i(GoogleDriveService.bb[39]);
                        if (f != 0) {
                            break Block_1;
                        }
                        return false;
                    }
                    case 4: {
                        Log.i(GoogleDriveService.bb[38]);
                        if (f != 0) {
                            break Block_1;
                        }
                        return false;
                    }
                    case 1: {
                        if (f != 0) {
                            break Block_1;
                        }
                        return true;
                    }
                    case 2: {
                        try {
                            if (System.currentTimeMillis() - a < 518400000L || f != 0) {
                                Log.i(GoogleDriveService.bb[40]);
                                if (f == 0) {
                                    return false;
                                }
                                final Calendar instance = Calendar.getInstance();
                                instance.setTimeInMillis(a);
                                instance.roll(2, 1);
                                if (System.currentTimeMillis() - (instance.getTimeInMillis() - 86400000L) < 0L || f != 0) {
                                    Log.i(GoogleDriveService.bb[43]);
                                    if (f != 0) {
                                        break;
                                    }
                                    return false;
                                }
                            }
                        }
                        catch (NullPointerException ex) {
                            throw ex;
                        }
                        return true;
                    }
                    case 3: {
                        continue;
                    }
                }
                break;
            }
        }
        Log.e(GoogleDriveService.bb[41] + ae + GoogleDriveService.bb[42]);
        return false;
    }
    
    static boolean n(final GoogleDriveService googleDriveService) {
        return googleDriveService.a();
    }
    
    public static String o() {
        return e().getString(GoogleDriveService.bb[212], (String)null);
    }
    
    static AtomicLong o(final GoogleDriveService googleDriveService) {
        return googleDriveService.R;
    }
    
    static AtomicLong p(final GoogleDriveService googleDriveService) {
        return googleDriveService.l;
    }
    
    public static boolean p() {
        return b(1);
    }
    
    private static boolean q() {
        final SharedPreferences$Editor edit = e().edit();
        try {
            edit.remove(GoogleDriveService.bb[4]);
            edit.remove(GoogleDriveService.bb[3]);
            edit.remove(GoogleDriveService.bb[6]);
            if (!edit.commit()) {
                Log.w(GoogleDriveService.bb[5]);
                return false;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return true;
    }
    
    private static void u() {
        final Intent intent = new Intent((Context)App.aq, (Class)GoogleDriveService.class);
        intent.setAction(GoogleDriveService.bb[247]);
        App.aq.startService(intent);
    }
    
    private boolean v() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore_1       
        //     4: iconst_0       
        //     5: istore_2       
        //     6: aload_0        
        //     7: invokespecial   com/whatsapp/gdrive/GoogleDriveService.C:()Z
        //    10: ifne            15
        //    13: iconst_0       
        //    14: ireturn        
        //    15: aload_0        
        //    16: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //    19: aload_0        
        //    20: getfield        com/whatsapp/gdrive/GoogleDriveService.k:Ljava/lang/String;
        //    23: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    26: sipush          132
        //    29: aaload         
        //    30: invokevirtual   com/whatsapp/gdrive/q.c:(Ljava/lang/String;Ljava/lang/String;)[Lcom/whatsapp/gdrive/ag;
        //    33: astore_3       
        //    34: aload_3        
        //    35: ifnonnull       56
        //    38: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    41: sipush          131
        //    44: aaload         
        //    45: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    48: iload_2        
        //    49: invokestatic    com/whatsapp/gdrive/al.a:(I)V
        //    52: iload_1        
        //    53: ifeq            85
        //    56: aload_3        
        //    57: arraylength    
        //    58: ifle            83
        //    61: aload_0        
        //    62: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //    65: aload_3        
        //    66: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //    69: invokevirtual   com/whatsapp/gdrive/q.a:(Ljava/util/List;)Z
        //    72: ireturn        
        //    73: astore          5
        //    75: aload           5
        //    77: athrow         
        //    78: astore          4
        //    80: aload           4
        //    82: athrow         
        //    83: iconst_1       
        //    84: ireturn        
        //    85: iload_2        
        //    86: iconst_1       
        //    87: iadd           
        //    88: istore          6
        //    90: iload_2        
        //    91: iconst_5       
        //    92: if_icmpge       13
        //    95: iload           6
        //    97: istore_2       
        //    98: goto            6
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  38     52     73     78     Ljava/lang/NullPointerException;
        //  56     73     78     83     Ljava/lang/NullPointerException;
        //  75     78     78     83     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0056:
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
    
    static long w() {
        return Q();
    }
    
    static void x() {
        ah();
    }
    
    static int y() {
        try {
            return Integer.parseInt(e().getString(GoogleDriveService.bb[23], String.valueOf(0)));
        }
        catch (NumberFormatException ex) {
            Log.b(GoogleDriveService.bb[22], ex);
            return 0;
        }
    }
    
    private static boolean z() {
        return GoogleDriveService.v.get();
    }
    
    public ae N() {
        return this.d;
    }
    
    void a(final bq p) {
        try {
            if (this.P != null) {
                Log.e(GoogleDriveService.bb[33]);
            }
            this.P = p;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    public void a(final cs p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //     8: aload_1        
        //     9: invokevirtual   com/whatsapp/gdrive/aq.registerObserver:(Ljava/lang/Object;)V
        //    12: invokestatic    com/whatsapp/gdrive/GoogleDriveService.P:()Z
        //    15: istore          16
        //    17: iload           16
        //    19: ifeq            241
        //    22: getstatic       com/whatsapp/gdrive/GoogleDriveService.Y:Z
        //    25: istore          40
        //    27: iload           40
        //    29: ifne            84
        //    32: getstatic       com/whatsapp/gdrive/GoogleDriveService.E:I
        //    35: istore          47
        //    37: iload           47
        //    39: ifne            63
        //    42: aload_1        
        //    43: aload_0        
        //    44: getfield        com/whatsapp/gdrive/GoogleDriveService.T:Ljava/util/concurrent/atomic/AtomicLong;
        //    47: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //    50: aload_0        
        //    51: getfield        com/whatsapp/gdrive/GoogleDriveService.N:J
        //    54: invokeinterface com/whatsapp/gdrive/cs.g:(JJ)V
        //    59: iload_2        
        //    60: ifeq            226
        //    63: aload_1        
        //    64: aload_0        
        //    65: getfield        com/whatsapp/gdrive/GoogleDriveService.T:Ljava/util/concurrent/atomic/AtomicLong;
        //    68: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //    71: aload_0        
        //    72: getfield        com/whatsapp/gdrive/GoogleDriveService.N:J
        //    75: invokeinterface com/whatsapp/gdrive/cs.c:(JJ)V
        //    80: iload_2        
        //    81: ifeq            226
        //    84: getstatic       com/whatsapp/gdrive/GoogleDriveService.f:Z
        //    87: istore          41
        //    89: iload           41
        //    91: ifne            115
        //    94: aload_1        
        //    95: aload_0        
        //    96: getfield        com/whatsapp/gdrive/GoogleDriveService.T:Ljava/util/concurrent/atomic/AtomicLong;
        //    99: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   102: aload_0        
        //   103: getfield        com/whatsapp/gdrive/GoogleDriveService.N:J
        //   106: invokeinterface com/whatsapp/gdrive/cs.a:(JJ)V
        //   111: iload_2        
        //   112: ifeq            226
        //   115: getstatic       com/whatsapp/gdrive/GoogleDriveService.x:Z
        //   118: istore          42
        //   120: iload           42
        //   122: ifne            186
        //   125: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   128: bipush          10
        //   130: aaload         
        //   131: invokestatic    android/os/Environment.getExternalStorageState:()Ljava/lang/String;
        //   134: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   137: istore          46
        //   139: iload           46
        //   141: ifeq            165
        //   144: aload_1        
        //   145: aload_0        
        //   146: getfield        com/whatsapp/gdrive/GoogleDriveService.T:Ljava/util/concurrent/atomic/AtomicLong;
        //   149: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   152: aload_0        
        //   153: getfield        com/whatsapp/gdrive/GoogleDriveService.N:J
        //   156: invokeinterface com/whatsapp/gdrive/cs.i:(JJ)V
        //   161: iload_2        
        //   162: ifeq            226
        //   165: aload_1        
        //   166: aload_0        
        //   167: getfield        com/whatsapp/gdrive/GoogleDriveService.T:Ljava/util/concurrent/atomic/AtomicLong;
        //   170: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   173: aload_0        
        //   174: getfield        com/whatsapp/gdrive/GoogleDriveService.N:J
        //   177: invokeinterface com/whatsapp/gdrive/cs.f:(JJ)V
        //   182: iload_2        
        //   183: ifeq            226
        //   186: aload_0        
        //   187: getfield        com/whatsapp/gdrive/GoogleDriveService.N:J
        //   190: lstore          43
        //   192: lload           43
        //   194: lconst_0       
        //   195: lcmp           
        //   196: ifle            220
        //   199: aload_1        
        //   200: aload_0        
        //   201: getfield        com/whatsapp/gdrive/GoogleDriveService.T:Ljava/util/concurrent/atomic/AtomicLong;
        //   204: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   207: aload_0        
        //   208: getfield        com/whatsapp/gdrive/GoogleDriveService.N:J
        //   211: invokeinterface com/whatsapp/gdrive/cs.j:(JJ)V
        //   216: iload_2        
        //   217: ifeq            226
        //   220: aload_1        
        //   221: invokeinterface com/whatsapp/gdrive/cs.e:()V
        //   226: aload_0        
        //   227: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //   230: aload_0        
        //   231: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.m:()I
        //   234: invokevirtual   com/whatsapp/gdrive/aq.a:(I)V
        //   237: iload_2        
        //   238: ifeq            483
        //   241: invokestatic    com/whatsapp/gdrive/GoogleDriveService.z:()Z
        //   244: istore          31
        //   246: iload           31
        //   248: ifne            261
        //   251: invokestatic    com/whatsapp/gdrive/GoogleDriveService.ac:()Z
        //   254: istore          39
        //   256: iload           39
        //   258: ifeq            483
        //   261: getstatic       com/whatsapp/gdrive/GoogleDriveService.G:Z
        //   264: istore          32
        //   266: iload           32
        //   268: ifne            323
        //   271: getstatic       com/whatsapp/gdrive/GoogleDriveService.C:I
        //   274: istore          38
        //   276: iload           38
        //   278: ifne            302
        //   281: aload_1        
        //   282: aload_0        
        //   283: getfield        com/whatsapp/gdrive/GoogleDriveService.R:Ljava/util/concurrent/atomic/AtomicLong;
        //   286: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   289: aload_0        
        //   290: getfield        com/whatsapp/gdrive/GoogleDriveService.b:J
        //   293: invokeinterface com/whatsapp/gdrive/cs.e:(JJ)V
        //   298: iload_2        
        //   299: ifeq            472
        //   302: aload_1        
        //   303: aload_0        
        //   304: getfield        com/whatsapp/gdrive/GoogleDriveService.R:Ljava/util/concurrent/atomic/AtomicLong;
        //   307: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   310: aload_0        
        //   311: getfield        com/whatsapp/gdrive/GoogleDriveService.b:J
        //   314: invokeinterface com/whatsapp/gdrive/cs.d:(JJ)V
        //   319: iload_2        
        //   320: ifeq            472
        //   323: getstatic       com/whatsapp/gdrive/GoogleDriveService.S:Z
        //   326: istore          33
        //   328: iload           33
        //   330: ifne            354
        //   333: aload_1        
        //   334: aload_0        
        //   335: getfield        com/whatsapp/gdrive/GoogleDriveService.R:Ljava/util/concurrent/atomic/AtomicLong;
        //   338: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   341: aload_0        
        //   342: getfield        com/whatsapp/gdrive/GoogleDriveService.b:J
        //   345: invokeinterface com/whatsapp/gdrive/cs.k:(JJ)V
        //   350: iload_2        
        //   351: ifeq            472
        //   354: getstatic       com/whatsapp/gdrive/GoogleDriveService.x:Z
        //   357: istore          34
        //   359: iload           34
        //   361: ifne            425
        //   364: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   367: bipush          9
        //   369: aaload         
        //   370: invokestatic    android/os/Environment.getExternalStorageState:()Ljava/lang/String;
        //   373: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   376: istore          37
        //   378: iload           37
        //   380: ifeq            404
        //   383: aload_1        
        //   384: aload_0        
        //   385: getfield        com/whatsapp/gdrive/GoogleDriveService.R:Ljava/util/concurrent/atomic/AtomicLong;
        //   388: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   391: aload_0        
        //   392: getfield        com/whatsapp/gdrive/GoogleDriveService.b:J
        //   395: invokeinterface com/whatsapp/gdrive/cs.m:(JJ)V
        //   400: iload_2        
        //   401: ifeq            472
        //   404: aload_1        
        //   405: aload_0        
        //   406: getfield        com/whatsapp/gdrive/GoogleDriveService.R:Ljava/util/concurrent/atomic/AtomicLong;
        //   409: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   412: aload_0        
        //   413: getfield        com/whatsapp/gdrive/GoogleDriveService.b:J
        //   416: invokeinterface com/whatsapp/gdrive/cs.n:(JJ)V
        //   421: iload_2        
        //   422: ifeq            472
        //   425: aload_0        
        //   426: getfield        com/whatsapp/gdrive/GoogleDriveService.b:J
        //   429: lstore          35
        //   431: lload           35
        //   433: lconst_0       
        //   434: lcmp           
        //   435: ifle            466
        //   438: aload_1        
        //   439: aload_0        
        //   440: getfield        com/whatsapp/gdrive/GoogleDriveService.R:Ljava/util/concurrent/atomic/AtomicLong;
        //   443: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   446: aload_0        
        //   447: getfield        com/whatsapp/gdrive/GoogleDriveService.l:Ljava/util/concurrent/atomic/AtomicLong;
        //   450: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   453: aload_0        
        //   454: getfield        com/whatsapp/gdrive/GoogleDriveService.b:J
        //   457: invokeinterface com/whatsapp/gdrive/cs.a:(JJJ)V
        //   462: iload_2        
        //   463: ifeq            472
        //   466: aload_1        
        //   467: invokeinterface com/whatsapp/gdrive/cs.b:()V
        //   472: aload_0        
        //   473: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //   476: aload_0        
        //   477: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.m:()I
        //   480: invokevirtual   com/whatsapp/gdrive/aq.b:(I)V
        //   483: return         
        //   484: astore_3       
        //   485: aload_3        
        //   486: athrow         
        //   487: astore          4
        //   489: aload           4
        //   491: athrow         
        //   492: astore          5
        //   494: aload           5
        //   496: athrow         
        //   497: astore          6
        //   499: aload           6
        //   501: athrow         
        //   502: astore          7
        //   504: aload           7
        //   506: athrow         
        //   507: astore          8
        //   509: aload           8
        //   511: athrow         
        //   512: astore          9
        //   514: aload           9
        //   516: athrow         
        //   517: astore          10
        //   519: aload           10
        //   521: athrow         
        //   522: astore          11
        //   524: aload           11
        //   526: athrow         
        //   527: astore          12
        //   529: aload           12
        //   531: athrow         
        //   532: astore          13
        //   534: aload           13
        //   536: athrow         
        //   537: astore          14
        //   539: aload           14
        //   541: athrow         
        //   542: astore          15
        //   544: aload           15
        //   546: athrow         
        //   547: astore          45
        //   549: aload           45
        //   551: athrow         
        //   552: astore          17
        //   554: aload           17
        //   556: athrow         
        //   557: astore          18
        //   559: aload           18
        //   561: athrow         
        //   562: astore          19
        //   564: aload           19
        //   566: athrow         
        //   567: astore          20
        //   569: aload           20
        //   571: athrow         
        //   572: astore          21
        //   574: aload           21
        //   576: athrow         
        //   577: astore          22
        //   579: aload           22
        //   581: athrow         
        //   582: astore          23
        //   584: aload           23
        //   586: athrow         
        //   587: astore          24
        //   589: aload           24
        //   591: athrow         
        //   592: astore          25
        //   594: aload           25
        //   596: athrow         
        //   597: astore          26
        //   599: aload           26
        //   601: athrow         
        //   602: astore          27
        //   604: aload           27
        //   606: athrow         
        //   607: astore          28
        //   609: aload           28
        //   611: athrow         
        //   612: astore          29
        //   614: aload           29
        //   616: athrow         
        //   617: astore          30
        //   619: aload           30
        //   621: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      17     484    487    Ljava/lang/NullPointerException;
        //  22     27     487    492    Ljava/lang/NullPointerException;
        //  32     37     492    497    Ljava/lang/NullPointerException;
        //  42     59     497    502    Ljava/lang/NullPointerException;
        //  63     80     502    507    Ljava/lang/NullPointerException;
        //  84     89     507    512    Ljava/lang/NullPointerException;
        //  94     111    512    517    Ljava/lang/NullPointerException;
        //  115    120    517    522    Ljava/lang/NullPointerException;
        //  125    139    522    527    Ljava/lang/NullPointerException;
        //  144    161    527    532    Ljava/lang/NullPointerException;
        //  165    182    532    537    Ljava/lang/NullPointerException;
        //  186    192    537    542    Ljava/lang/NullPointerException;
        //  199    216    542    547    Ljava/lang/NullPointerException;
        //  220    226    542    547    Ljava/lang/NullPointerException;
        //  226    237    547    552    Ljava/lang/NullPointerException;
        //  241    246    552    557    Ljava/lang/NullPointerException;
        //  251    256    557    562    Ljava/lang/NullPointerException;
        //  261    266    562    567    Ljava/lang/NullPointerException;
        //  271    276    567    572    Ljava/lang/NullPointerException;
        //  281    298    572    577    Ljava/lang/NullPointerException;
        //  302    319    577    582    Ljava/lang/NullPointerException;
        //  323    328    582    587    Ljava/lang/NullPointerException;
        //  333    350    587    592    Ljava/lang/NullPointerException;
        //  354    359    592    597    Ljava/lang/NullPointerException;
        //  364    378    597    602    Ljava/lang/NullPointerException;
        //  383    400    602    607    Ljava/lang/NullPointerException;
        //  404    421    607    612    Ljava/lang/NullPointerException;
        //  425    431    612    617    Ljava/lang/NullPointerException;
        //  438    462    617    622    Ljava/lang/NullPointerException;
        //  466    472    617    622    Ljava/lang/NullPointerException;
        //  485    487    487    492    Ljava/lang/NullPointerException;
        //  489    492    492    497    Ljava/lang/NullPointerException;
        //  494    497    497    502    Ljava/lang/NullPointerException;
        //  499    502    502    507    Ljava/lang/NullPointerException;
        //  504    507    507    512    Ljava/lang/NullPointerException;
        //  509    512    512    517    Ljava/lang/NullPointerException;
        //  514    517    517    522    Ljava/lang/NullPointerException;
        //  519    522    522    527    Ljava/lang/NullPointerException;
        //  524    527    527    532    Ljava/lang/NullPointerException;
        //  529    532    532    537    Ljava/lang/NullPointerException;
        //  534    537    537    542    Ljava/lang/NullPointerException;
        //  539    542    542    547    Ljava/lang/NullPointerException;
        //  549    552    552    557    Ljava/lang/NullPointerException;
        //  554    557    557    562    Ljava/lang/NullPointerException;
        //  559    562    562    567    Ljava/lang/NullPointerException;
        //  564    567    567    572    Ljava/lang/NullPointerException;
        //  569    572    572    577    Ljava/lang/NullPointerException;
        //  574    577    577    582    Ljava/lang/NullPointerException;
        //  579    582    582    587    Ljava/lang/NullPointerException;
        //  584    587    587    592    Ljava/lang/NullPointerException;
        //  589    592    592    597    Ljava/lang/NullPointerException;
        //  594    597    597    602    Ljava/lang/NullPointerException;
        //  599    602    602    607    Ljava/lang/NullPointerException;
        //  604    607    607    612    Ljava/lang/NullPointerException;
        //  609    612    612    617    Ljava/lang/NullPointerException;
        //  614    617    617    622    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 292, Size: 292
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
    
    void a(final q l) {
        try {
            if (this.L != null) {
                Log.e(GoogleDriveService.bb[160]);
            }
            this.L = l;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    boolean a(@NonNull final String p0, @NonNull final String p1, @Nullable final String p2, @Nullable final String p3, final boolean p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: aload_1        
        //     6: ifnonnull       25
        //     9: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    12: bipush          126
        //    14: aaload         
        //    15: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    18: iconst_0       
        //    19: ireturn        
        //    20: astore          30
        //    22: aload           30
        //    24: athrow         
        //    25: aload_2        
        //    26: ifnonnull       45
        //    29: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    32: bipush          127
        //    34: aaload         
        //    35: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    38: iconst_0       
        //    39: ireturn        
        //    40: astore          29
        //    42: aload           29
        //    44: athrow         
        //    45: aload_2        
        //    46: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    49: sipush          129
        //    52: aaload         
        //    53: ldc_w           ""
        //    56: invokevirtual   java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    59: astore          7
        //    61: aload_0        
        //    62: invokespecial   com/whatsapp/gdrive/GoogleDriveService.C:()Z
        //    65: istore          9
        //    67: iload           9
        //    69: ifne            79
        //    72: iconst_0       
        //    73: ireturn        
        //    74: astore          8
        //    76: aload           8
        //    78: athrow         
        //    79: getstatic       com/whatsapp/gdrive/GoogleDriveService.c:I
        //    82: iconst_1       
        //    83: if_icmpeq       97
        //    86: aload_0        
        //    87: getfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //    90: dconst_0       
        //    91: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    94: putfield        com/whatsapp/fieldstats/bd.j:Ljava/lang/Double;
        //    97: aconst_null    
        //    98: astore          11
        //   100: iconst_0       
        //   101: istore          12
        //   103: iload           12
        //   105: iconst_5       
        //   106: if_icmpge       403
        //   109: aload_0        
        //   110: invokespecial   com/whatsapp/gdrive/GoogleDriveService.C:()Z
        //   113: istore          23
        //   115: iload           23
        //   117: ifne            132
        //   120: iconst_0       
        //   121: ireturn        
        //   122: astore          10
        //   124: aload           10
        //   126: athrow         
        //   127: astore          22
        //   129: aload           22
        //   131: athrow         
        //   132: new             Lcom/whatsapp/gdrive/b1;
        //   135: dup            
        //   136: aload_0        
        //   137: iload           5
        //   139: invokespecial   com/whatsapp/gdrive/b1.<init>:(Lcom/whatsapp/gdrive/GoogleDriveService;Z)V
        //   142: astore          24
        //   144: aload_0        
        //   145: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //   148: aload_0        
        //   149: getfield        com/whatsapp/gdrive/GoogleDriveService.k:Ljava/lang/String;
        //   152: aload_1        
        //   153: aload           7
        //   155: aload           24
        //   157: aload           4
        //   159: invokevirtual   com/whatsapp/gdrive/q.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whatsapp/gdrive/bn;Ljava/lang/String;)Lcom/whatsapp/gdrive/ag;
        //   162: astore          28
        //   164: aload           28
        //   166: astore          26
        //   168: aload           26
        //   170: ifnull          178
        //   173: iload           6
        //   175: ifeq            194
        //   178: iload           12
        //   180: invokestatic    com/whatsapp/gdrive/al.a:(I)V
        //   183: iload           12
        //   185: iconst_1       
        //   186: iadd           
        //   187: istore          27
        //   189: iload           6
        //   191: ifeq            410
        //   194: aload           26
        //   196: astore          13
        //   198: aload_0        
        //   199: invokespecial   com/whatsapp/gdrive/GoogleDriveService.C:()Z
        //   202: istore          15
        //   204: iload           15
        //   206: ifne            237
        //   209: iconst_0       
        //   210: ireturn        
        //   211: astore          25
        //   213: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   216: bipush          125
        //   218: aaload         
        //   219: aload           25
        //   221: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   224: iload           12
        //   226: invokestatic    com/whatsapp/gdrive/al.a:(I)V
        //   229: goto            183
        //   232: astore          14
        //   234: aload           14
        //   236: athrow         
        //   237: new             Ljava/io/File;
        //   240: dup            
        //   241: aload_1        
        //   242: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   245: astore          16
        //   247: iload           5
        //   249: ifeq            294
        //   252: aload_0        
        //   253: getfield        com/whatsapp/gdrive/GoogleDriveService.T:Ljava/util/concurrent/atomic/AtomicLong;
        //   256: aload           16
        //   258: invokevirtual   java/io/File.length:()J
        //   261: invokevirtual   java/util/concurrent/atomic/AtomicLong.addAndGet:(J)J
        //   264: pop2           
        //   265: aload_0        
        //   266: getfield        com/whatsapp/gdrive/GoogleDriveService.T:Ljava/util/concurrent/atomic/AtomicLong;
        //   269: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   272: invokestatic    com/whatsapp/gdrive/GoogleDriveService.a:(J)Z
        //   275: pop            
        //   276: aload_0        
        //   277: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //   280: aload_0        
        //   281: getfield        com/whatsapp/gdrive/GoogleDriveService.T:Ljava/util/concurrent/atomic/AtomicLong;
        //   284: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   287: aload_0        
        //   288: getfield        com/whatsapp/gdrive/GoogleDriveService.N:J
        //   291: invokevirtual   com/whatsapp/gdrive/aq.l:(JJ)V
        //   294: aload           13
        //   296: ifnull          375
        //   299: new             Ljava/lang/StringBuilder;
        //   302: dup            
        //   303: invokespecial   java/lang/StringBuilder.<init>:()V
        //   306: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   309: sipush          128
        //   312: aaload         
        //   313: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   316: aload           13
        //   318: invokevirtual   com/whatsapp/gdrive/ag.g:()Ljava/lang/String;
        //   321: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   324: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   327: sipush          130
        //   330: aaload         
        //   331: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   334: aload           13
        //   336: invokevirtual   com/whatsapp/gdrive/ag.b:()Ljava/lang/String;
        //   339: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   342: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   345: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   348: aload_0        
        //   349: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //   352: aload           13
        //   354: invokevirtual   com/whatsapp/gdrive/ag.g:()Ljava/lang/String;
        //   357: aload           13
        //   359: invokevirtual   com/whatsapp/gdrive/ag.b:()Ljava/lang/String;
        //   362: aload           13
        //   364: invokevirtual   com/whatsapp/gdrive/ag.d:()J
        //   367: aload           13
        //   369: invokevirtual   com/whatsapp/gdrive/ag.e:()Ljava/lang/String;
        //   372: invokevirtual   com/whatsapp/gdrive/bq.a:(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V
        //   375: aload           13
        //   377: ifnull          392
        //   380: iconst_1       
        //   381: ireturn        
        //   382: astore          18
        //   384: aload           18
        //   386: athrow         
        //   387: astore          17
        //   389: aload           17
        //   391: athrow         
        //   392: iconst_0       
        //   393: ireturn        
        //   394: astore          25
        //   396: aload           11
        //   398: astore          26
        //   400: goto            213
        //   403: aload           11
        //   405: astore          13
        //   407: goto            198
        //   410: iload           27
        //   412: istore          12
        //   414: aload           26
        //   416: astore          11
        //   418: goto            103
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  9      18     20     25     Ljava/lang/Exception;
        //  29     38     40     45     Ljava/lang/Exception;
        //  61     67     74     79     Ljava/lang/Exception;
        //  79     97     122    127    Ljava/lang/Exception;
        //  109    115    127    132    Ljava/lang/Exception;
        //  132    164    394    403    Ljava/lang/Exception;
        //  178    183    211    213    Ljava/lang/Exception;
        //  198    204    232    237    Ljava/lang/Exception;
        //  252    294    382    387    Ljava/lang/Exception;
        //  299    375    387    392    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0198:
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
    
    public void ad() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore_1       
        //     4: invokestatic    com/whatsapp/gdrive/GoogleDriveService.X:()I
        //     7: istore          5
        //     9: iload           5
        //    11: iconst_1       
        //    12: if_icmpne       119
        //    15: getstatic       com/whatsapp/gdrive/GoogleDriveService.t:Ljava/util/concurrent/atomic/AtomicBoolean;
        //    18: iconst_0       
        //    19: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //    22: getstatic       com/whatsapp/gdrive/GoogleDriveService.j:Landroid/os/ConditionVariable;
        //    25: invokevirtual   android/os/ConditionVariable.open:()V
        //    28: aload_0        
        //    29: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //    32: astore          10
        //    34: aload           10
        //    36: ifnull          71
        //    39: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    42: iconst_0       
        //    43: aaload         
        //    44: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    47: aload_0        
        //    48: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //    51: iconst_0       
        //    52: invokevirtual   com/whatsapp/gdrive/q.a:(Z)V
        //    55: getstatic       com/whatsapp/gdrive/GoogleDriveService.A:Landroid/os/ConditionVariable;
        //    58: invokevirtual   android/os/ConditionVariable.open:()V
        //    61: getstatic       com/whatsapp/gdrive/GoogleDriveService.z:Landroid/os/ConditionVariable;
        //    64: invokevirtual   android/os/ConditionVariable.open:()V
        //    67: iload_1        
        //    68: ifeq            110
        //    71: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    74: iconst_1       
        //    75: aaload         
        //    76: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    79: getstatic       com/whatsapp/gdrive/GoogleDriveService.A:Landroid/os/ConditionVariable;
        //    82: invokevirtual   android/os/ConditionVariable.open:()V
        //    85: getstatic       com/whatsapp/gdrive/GoogleDriveService.z:Landroid/os/ConditionVariable;
        //    88: invokevirtual   android/os/ConditionVariable.open:()V
        //    91: invokestatic    com/whatsapp/gdrive/GoogleDriveService.M:()V
        //    94: invokestatic    com/whatsapp/gdrive/GoogleDriveService.c:()V
        //    97: invokestatic    com/whatsapp/gdrive/GoogleDriveService.ah:()V
        //   100: invokestatic    com/whatsapp/gdrive/GoogleDriveService.G:()V
        //   103: aload_0        
        //   104: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //   107: invokevirtual   com/whatsapp/gdrive/aq.a:()V
        //   110: iconst_0       
        //   111: invokestatic    com/whatsapp/gdrive/GoogleDriveService.b:(I)Z
        //   114: pop            
        //   115: iload_1        
        //   116: ifeq            154
        //   119: invokestatic    com/whatsapp/gdrive/GoogleDriveService.X:()I
        //   122: istore          8
        //   124: iload           8
        //   126: iconst_2       
        //   127: if_icmpne       146
        //   130: getstatic       com/whatsapp/gdrive/GoogleDriveService.v:Ljava/util/concurrent/atomic/AtomicBoolean;
        //   133: iconst_0       
        //   134: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //   137: iconst_0       
        //   138: invokestatic    com/whatsapp/gdrive/GoogleDriveService.b:(I)Z
        //   141: pop            
        //   142: iload_1        
        //   143: ifeq            154
        //   146: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   149: iconst_2       
        //   150: aaload         
        //   151: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   154: return         
        //   155: astore_2       
        //   156: aload_2        
        //   157: athrow         
        //   158: astore_3       
        //   159: aload_3        
        //   160: athrow         
        //   161: astore          4
        //   163: aload           4
        //   165: athrow         
        //   166: astore          11
        //   168: aload           11
        //   170: athrow         
        //   171: astore          6
        //   173: aload           6
        //   175: athrow         
        //   176: astore          7
        //   178: aload           7
        //   180: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      9      155    158    Ljava/lang/NullPointerException;
        //  15     34     158    161    Ljava/lang/NullPointerException;
        //  39     67     161    166    Ljava/lang/NullPointerException;
        //  71     110    161    166    Ljava/lang/NullPointerException;
        //  110    115    166    171    Ljava/lang/NullPointerException;
        //  119    124    171    176    Ljava/lang/NullPointerException;
        //  130    142    176    181    Ljava/lang/NullPointerException;
        //  146    154    176    181    Ljava/lang/NullPointerException;
        //  156    158    158    161    Ljava/lang/NullPointerException;
        //  159    161    161    166    Ljava/lang/NullPointerException;
        //  168    171    171    176    Ljava/lang/NullPointerException;
        //  173    176    176    181    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 87, Size: 87
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
    
    public void b(final cs cs) {
        this.Z.unregisterObserver((Object)cs);
    }
    
    void c(final String k) {
        try {
            if (this.k != null) {
                Log.e(GoogleDriveService.bb[34]);
            }
            this.k = k;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    void e(@ct final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: iload_1        
        //     5: tableswitch {
        //               20: 336
        //               21: 444
        //               22: 384
        //               23: 504
        //               24: 540
        //               25: 48
        //               26: 600
        //          default: 48
        //        }
        //    48: aload_0        
        //    49: getfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //    52: ifnull          72
        //    55: aload_0        
        //    56: getfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //    59: getstatic       com/whatsapp/fieldstats/d.UNKNOWN_ERROR:Lcom/whatsapp/fieldstats/d;
        //    62: invokevirtual   com/whatsapp/fieldstats/d.getCode:()I
        //    65: i2d            
        //    66: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    69: putfield        com/whatsapp/fieldstats/bd.c:Ljava/lang/Double;
        //    72: aload_0        
        //    73: getfield        com/whatsapp/gdrive/GoogleDriveService.O:Lcom/whatsapp/fieldstats/bv;
        //    76: ifnull          96
        //    79: aload_0        
        //    80: getfield        com/whatsapp/gdrive/GoogleDriveService.O:Lcom/whatsapp/fieldstats/bv;
        //    83: getstatic       com/whatsapp/fieldstats/d.UNKNOWN_ERROR:Lcom/whatsapp/fieldstats/d;
        //    86: invokevirtual   com/whatsapp/fieldstats/d.getCode:()I
        //    89: i2d            
        //    90: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    93: putfield        com/whatsapp/fieldstats/bv.d:Ljava/lang/Double;
        //    96: iload_1        
        //    97: bipush          10
        //    99: if_icmpeq       129
        //   102: new             Ljava/lang/StringBuilder;
        //   105: dup            
        //   106: invokespecial   java/lang/StringBuilder.<init>:()V
        //   109: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   112: sipush          205
        //   115: aaload         
        //   116: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   119: iload_1        
        //   120: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   123: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   126: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   129: invokestatic    com/whatsapp/gdrive/GoogleDriveService.ac:()Z
        //   132: istore          15
        //   134: iload           15
        //   136: ifeq            151
        //   139: aload_0        
        //   140: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //   143: iload_1        
        //   144: invokevirtual   com/whatsapp/gdrive/aq.b:(I)V
        //   147: iload_2        
        //   148: ifeq            335
        //   151: invokestatic    com/whatsapp/gdrive/GoogleDriveService.g:()Z
        //   154: istore          16
        //   156: iload           16
        //   158: ifeq            173
        //   161: aload_0        
        //   162: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //   165: iload_1        
        //   166: invokevirtual   com/whatsapp/gdrive/aq.c:(I)V
        //   169: iload_2        
        //   170: ifeq            335
        //   173: invokestatic    com/whatsapp/gdrive/GoogleDriveService.P:()Z
        //   176: istore          17
        //   178: iload           17
        //   180: ifeq            195
        //   183: aload_0        
        //   184: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //   187: iload_1        
        //   188: invokevirtual   com/whatsapp/gdrive/aq.a:(I)V
        //   191: iload_2        
        //   192: ifeq            335
        //   195: aload_0        
        //   196: getfield        com/whatsapp/gdrive/GoogleDriveService.X:Landroid/content/Intent;
        //   199: astore          18
        //   201: aload           18
        //   203: ifnull          325
        //   206: aload_0        
        //   207: getfield        com/whatsapp/gdrive/GoogleDriveService.X:Landroid/content/Intent;
        //   210: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //   213: astore          20
        //   215: iconst_m1      
        //   216: istore          21
        //   218: aload           20
        //   220: invokevirtual   java/lang/String.hashCode:()I
        //   223: istore          23
        //   225: iload           23
        //   227: lookupswitch {
        //          -1755890518: 817
        //          -818191995: 843
        //          1035381739: 791
        //          default: 260
        //        }
        //   260: iload           21
        //   262: tableswitch {
        //                0: 883
        //                1: 895
        //                2: 907
        //          default: 288
        //        }
        //   288: new             Ljava/lang/StringBuilder;
        //   291: dup            
        //   292: invokespecial   java/lang/StringBuilder.<init>:()V
        //   295: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   298: sipush          207
        //   301: aaload         
        //   302: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   305: aload_0        
        //   306: getfield        com/whatsapp/gdrive/GoogleDriveService.X:Landroid/content/Intent;
        //   309: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //   312: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   315: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   318: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   321: iload_2        
        //   322: ifeq            335
        //   325: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   328: sipush          209
        //   331: aaload         
        //   332: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   335: return         
        //   336: iload_1        
        //   337: putstatic       com/whatsapp/gdrive/GoogleDriveService.q:I
        //   340: aload_0        
        //   341: getfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //   344: ifnull          358
        //   347: aload_0        
        //   348: getfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //   351: dconst_0       
        //   352: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   355: putfield        com/whatsapp/fieldstats/bd.c:Ljava/lang/Double;
        //   358: aload_0        
        //   359: getfield        com/whatsapp/gdrive/GoogleDriveService.O:Lcom/whatsapp/fieldstats/bv;
        //   362: astore          51
        //   364: aload           51
        //   366: ifnull          96
        //   369: aload_0        
        //   370: getfield        com/whatsapp/gdrive/GoogleDriveService.O:Lcom/whatsapp/fieldstats/bv;
        //   373: dconst_0       
        //   374: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   377: putfield        com/whatsapp/fieldstats/bv.d:Ljava/lang/Double;
        //   380: iload_2        
        //   381: ifeq            96
        //   384: iload_1        
        //   385: putstatic       com/whatsapp/gdrive/GoogleDriveService.q:I
        //   388: aload_0        
        //   389: getfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //   392: ifnull          412
        //   395: aload_0        
        //   396: getfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //   399: getstatic       com/whatsapp/fieldstats/d.AUTH_FAILED:Lcom/whatsapp/fieldstats/d;
        //   402: invokevirtual   com/whatsapp/fieldstats/d.getCode:()I
        //   405: i2d            
        //   406: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   409: putfield        com/whatsapp/fieldstats/bd.c:Ljava/lang/Double;
        //   412: aload_0        
        //   413: getfield        com/whatsapp/gdrive/GoogleDriveService.O:Lcom/whatsapp/fieldstats/bv;
        //   416: astore          47
        //   418: aload           47
        //   420: ifnull          96
        //   423: aload_0        
        //   424: getfield        com/whatsapp/gdrive/GoogleDriveService.O:Lcom/whatsapp/fieldstats/bv;
        //   427: getstatic       com/whatsapp/fieldstats/d.AUTH_FAILED:Lcom/whatsapp/fieldstats/d;
        //   430: invokevirtual   com/whatsapp/fieldstats/d.getCode:()I
        //   433: i2d            
        //   434: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   437: putfield        com/whatsapp/fieldstats/bv.d:Ljava/lang/Double;
        //   440: iload_2        
        //   441: ifeq            96
        //   444: iload_1        
        //   445: putstatic       com/whatsapp/gdrive/GoogleDriveService.q:I
        //   448: aload_0        
        //   449: getfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //   452: ifnull          472
        //   455: aload_0        
        //   456: getfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //   459: getstatic       com/whatsapp/fieldstats/d.AUTH_FAILED:Lcom/whatsapp/fieldstats/d;
        //   462: invokevirtual   com/whatsapp/fieldstats/d.getCode:()I
        //   465: i2d            
        //   466: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   469: putfield        com/whatsapp/fieldstats/bd.c:Ljava/lang/Double;
        //   472: aload_0        
        //   473: getfield        com/whatsapp/gdrive/GoogleDriveService.O:Lcom/whatsapp/fieldstats/bv;
        //   476: astore          43
        //   478: aload           43
        //   480: ifnull          96
        //   483: aload_0        
        //   484: getfield        com/whatsapp/gdrive/GoogleDriveService.O:Lcom/whatsapp/fieldstats/bv;
        //   487: getstatic       com/whatsapp/fieldstats/d.AUTH_FAILED:Lcom/whatsapp/fieldstats/d;
        //   490: invokevirtual   com/whatsapp/fieldstats/d.getCode:()I
        //   493: i2d            
        //   494: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   497: putfield        com/whatsapp/fieldstats/bv.d:Ljava/lang/Double;
        //   500: iload_2        
        //   501: ifeq            96
        //   504: iload_1        
        //   505: putstatic       com/whatsapp/gdrive/GoogleDriveService.q:I
        //   508: aload_0        
        //   509: getfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //   512: astore          39
        //   514: aload           39
        //   516: ifnull          96
        //   519: aload_0        
        //   520: getfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //   523: getstatic       com/whatsapp/fieldstats/d.NO_SPACE_AVAILABLE:Lcom/whatsapp/fieldstats/d;
        //   526: invokevirtual   com/whatsapp/fieldstats/d.getCode:()I
        //   529: i2d            
        //   530: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   533: putfield        com/whatsapp/fieldstats/bd.c:Ljava/lang/Double;
        //   536: iload_2        
        //   537: ifeq            96
        //   540: iload_1        
        //   541: putstatic       com/whatsapp/gdrive/GoogleDriveService.q:I
        //   544: aload_0        
        //   545: getfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //   548: ifnull          568
        //   551: aload_0        
        //   552: getfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //   555: getstatic       com/whatsapp/fieldstats/d.BACKUP_SERVER_UNREACHABLE:Lcom/whatsapp/fieldstats/d;
        //   558: invokevirtual   com/whatsapp/fieldstats/d.getCode:()I
        //   561: i2d            
        //   562: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   565: putfield        com/whatsapp/fieldstats/bd.c:Ljava/lang/Double;
        //   568: aload_0        
        //   569: getfield        com/whatsapp/gdrive/GoogleDriveService.O:Lcom/whatsapp/fieldstats/bv;
        //   572: astore          36
        //   574: aload           36
        //   576: ifnull          96
        //   579: aload_0        
        //   580: getfield        com/whatsapp/gdrive/GoogleDriveService.O:Lcom/whatsapp/fieldstats/bv;
        //   583: getstatic       com/whatsapp/fieldstats/d.BACKUP_SERVER_UNREACHABLE:Lcom/whatsapp/fieldstats/d;
        //   586: invokevirtual   com/whatsapp/fieldstats/d.getCode:()I
        //   589: i2d            
        //   590: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   593: putfield        com/whatsapp/fieldstats/bv.d:Ljava/lang/Double;
        //   596: iload_2        
        //   597: ifeq            96
        //   600: iload_1        
        //   601: putstatic       com/whatsapp/gdrive/GoogleDriveService.q:I
        //   604: aload_0        
        //   605: getfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //   608: ifnull          628
        //   611: aload_0        
        //   612: getfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //   615: getstatic       com/whatsapp/fieldstats/d.UNKNOWN_ERROR:Lcom/whatsapp/fieldstats/d;
        //   618: invokevirtual   com/whatsapp/fieldstats/d.getCode:()I
        //   621: i2d            
        //   622: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   625: putfield        com/whatsapp/fieldstats/bd.c:Ljava/lang/Double;
        //   628: aload_0        
        //   629: getfield        com/whatsapp/gdrive/GoogleDriveService.O:Lcom/whatsapp/fieldstats/bv;
        //   632: astore          7
        //   634: aload           7
        //   636: ifnull          96
        //   639: aload_0        
        //   640: getfield        com/whatsapp/gdrive/GoogleDriveService.O:Lcom/whatsapp/fieldstats/bv;
        //   643: getstatic       com/whatsapp/fieldstats/d.UNKNOWN_ERROR:Lcom/whatsapp/fieldstats/d;
        //   646: invokevirtual   com/whatsapp/fieldstats/d.getCode:()I
        //   649: i2d            
        //   650: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   653: putfield        com/whatsapp/fieldstats/bv.d:Ljava/lang/Double;
        //   656: iload_2        
        //   657: ifeq            96
        //   660: goto            48
        //   663: astore          48
        //   665: aload           48
        //   667: athrow         
        //   668: astore          49
        //   670: aload           49
        //   672: athrow         
        //   673: astore          50
        //   675: aload           50
        //   677: athrow         
        //   678: astore          44
        //   680: aload           44
        //   682: athrow         
        //   683: astore          45
        //   685: aload           45
        //   687: athrow         
        //   688: astore          46
        //   690: aload           46
        //   692: athrow         
        //   693: astore          40
        //   695: aload           40
        //   697: athrow         
        //   698: astore          41
        //   700: aload           41
        //   702: athrow         
        //   703: astore          42
        //   705: aload           42
        //   707: athrow         
        //   708: astore          37
        //   710: aload           37
        //   712: athrow         
        //   713: astore          38
        //   715: aload           38
        //   717: athrow         
        //   718: astore          33
        //   720: aload           33
        //   722: athrow         
        //   723: astore          34
        //   725: aload           34
        //   727: athrow         
        //   728: astore          35
        //   730: aload           35
        //   732: athrow         
        //   733: astore_3       
        //   734: aload_3        
        //   735: athrow         
        //   736: astore          4
        //   738: aload           4
        //   740: athrow         
        //   741: astore          5
        //   743: aload           5
        //   745: athrow         
        //   746: astore          6
        //   748: aload           6
        //   750: athrow         
        //   751: astore          8
        //   753: aload           8
        //   755: athrow         
        //   756: astore          32
        //   758: aload           32
        //   760: athrow         
        //   761: astore          9
        //   763: aload           9
        //   765: athrow         
        //   766: astore          10
        //   768: aload           10
        //   770: athrow         
        //   771: astore          11
        //   773: aload           11
        //   775: athrow         
        //   776: astore          12
        //   778: aload           12
        //   780: athrow         
        //   781: astore          13
        //   783: aload           13
        //   785: athrow         
        //   786: astore          14
        //   788: aload           14
        //   790: athrow         
        //   791: aload           20
        //   793: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   796: sipush          208
        //   799: aaload         
        //   800: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   803: istore          31
        //   805: iload           31
        //   807: ifeq            260
        //   810: iconst_0       
        //   811: istore          21
        //   813: iload_2        
        //   814: ifeq            260
        //   817: aload           20
        //   819: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   822: sipush          206
        //   825: aaload         
        //   826: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   829: istore          30
        //   831: iload           30
        //   833: ifeq            260
        //   836: iconst_1       
        //   837: istore          21
        //   839: iload_2        
        //   840: ifeq            260
        //   843: aload           20
        //   845: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   848: sipush          210
        //   851: aaload         
        //   852: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   855: istore          25
        //   857: iload           25
        //   859: ifeq            260
        //   862: iconst_2       
        //   863: istore          21
        //   865: goto            260
        //   868: astore          22
        //   870: aload           22
        //   872: athrow         
        //   873: astore          29
        //   875: aload           29
        //   877: athrow         
        //   878: astore          24
        //   880: aload           24
        //   882: athrow         
        //   883: aload_0        
        //   884: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //   887: iload_1        
        //   888: invokevirtual   com/whatsapp/gdrive/aq.a:(I)V
        //   891: iload_2        
        //   892: ifeq            321
        //   895: aload_0        
        //   896: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //   899: iload_1        
        //   900: invokevirtual   com/whatsapp/gdrive/aq.b:(I)V
        //   903: iload_2        
        //   904: ifeq            321
        //   907: aload_0        
        //   908: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //   911: iload_1        
        //   912: invokevirtual   com/whatsapp/gdrive/aq.c:(I)V
        //   915: iload_2        
        //   916: ifeq            321
        //   919: goto            288
        //   922: astore          28
        //   924: aload           28
        //   926: athrow         
        //   927: astore          27
        //   929: aload           27
        //   931: athrow         
        //   932: astore          26
        //   934: aload           26
        //   936: athrow         
        //   937: astore          19
        //   939: aload           19
        //   941: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  48     72     746    751    Ljava/lang/NullPointerException;
        //  72     96     751    756    Ljava/lang/NullPointerException;
        //  102    129    756    761    Ljava/lang/NullPointerException;
        //  129    134    761    766    Ljava/lang/NullPointerException;
        //  139    147    766    771    Ljava/lang/NullPointerException;
        //  151    156    771    776    Ljava/lang/NullPointerException;
        //  161    169    776    781    Ljava/lang/NullPointerException;
        //  173    178    781    786    Ljava/lang/NullPointerException;
        //  183    191    786    791    Ljava/lang/NullPointerException;
        //  195    201    786    791    Ljava/lang/NullPointerException;
        //  218    225    868    873    Ljava/lang/NullPointerException;
        //  288    321    932    937    Ljava/lang/NullPointerException;
        //  325    335    937    942    Ljava/lang/NullPointerException;
        //  336    358    663    668    Ljava/lang/NullPointerException;
        //  358    364    668    673    Ljava/lang/NullPointerException;
        //  369    380    673    678    Ljava/lang/NullPointerException;
        //  384    412    678    683    Ljava/lang/NullPointerException;
        //  412    418    683    688    Ljava/lang/NullPointerException;
        //  423    440    688    693    Ljava/lang/NullPointerException;
        //  444    472    693    698    Ljava/lang/NullPointerException;
        //  472    478    698    703    Ljava/lang/NullPointerException;
        //  483    500    703    708    Ljava/lang/NullPointerException;
        //  504    514    708    713    Ljava/lang/NullPointerException;
        //  519    536    713    718    Ljava/lang/NullPointerException;
        //  540    568    718    723    Ljava/lang/NullPointerException;
        //  568    574    723    728    Ljava/lang/NullPointerException;
        //  579    596    728    733    Ljava/lang/NullPointerException;
        //  600    628    733    736    Ljava/lang/NullPointerException;
        //  628    634    736    741    Ljava/lang/NullPointerException;
        //  639    656    741    746    Ljava/lang/NullPointerException;
        //  670    673    673    678    Ljava/lang/NullPointerException;
        //  675    678    678    683    Ljava/lang/NullPointerException;
        //  685    688    688    693    Ljava/lang/NullPointerException;
        //  690    693    693    698    Ljava/lang/NullPointerException;
        //  700    703    703    708    Ljava/lang/NullPointerException;
        //  705    708    708    713    Ljava/lang/NullPointerException;
        //  710    713    713    718    Ljava/lang/NullPointerException;
        //  715    718    718    723    Ljava/lang/NullPointerException;
        //  725    728    728    733    Ljava/lang/NullPointerException;
        //  730    733    733    736    Ljava/lang/NullPointerException;
        //  738    741    741    746    Ljava/lang/NullPointerException;
        //  743    746    746    751    Ljava/lang/NullPointerException;
        //  763    766    766    771    Ljava/lang/NullPointerException;
        //  768    771    771    776    Ljava/lang/NullPointerException;
        //  773    776    776    781    Ljava/lang/NullPointerException;
        //  778    781    781    786    Ljava/lang/NullPointerException;
        //  783    786    786    791    Ljava/lang/NullPointerException;
        //  791    805    868    873    Ljava/lang/NullPointerException;
        //  817    831    873    878    Ljava/lang/NullPointerException;
        //  843    857    878    883    Ljava/lang/NullPointerException;
        //  883    891    922    927    Ljava/lang/NullPointerException;
        //  895    903    927    932    Ljava/lang/NullPointerException;
        //  907    915    932    937    Ljava/lang/NullPointerException;
        //  924    927    927    932    Ljava/lang/NullPointerException;
        //  929    932    932    937    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 402, Size: 402
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
    
    public long h() {
        return this.N;
    }
    
    @ct
    public int m() {
        return GoogleDriveService.q;
    }
    
    public IBinder onBind(final Intent intent) {
        return (IBinder)this.y;
    }
    
    public void onDestroy() {
        try {
            if (this.d != null) {
                this.d.h();
            }
            this.b(this.d);
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    public void onHandleIntent(final Intent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore_2       
        //     4: invokestatic    com/whatsapp/gdrive/GoogleDriveService.am:()Z
        //     7: istore          4
        //     9: iload           4
        //    11: ifne            18
        //    14: return         
        //    15: astore_3       
        //    16: aload_3        
        //    17: athrow         
        //    18: aload_0        
        //    19: aload_1        
        //    20: putfield        com/whatsapp/gdrive/GoogleDriveService.X:Landroid/content/Intent;
        //    23: aload_1        
        //    24: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //    27: astore          5
        //    29: aload           5
        //    31: ifnonnull       49
        //    34: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //    37: bipush          107
        //    39: aaload         
        //    40: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    43: return         
        //    44: astore          171
        //    46: aload           171
        //    48: athrow         
        //    49: invokestatic    com/whatsapp/gdrive/GoogleDriveService.G:()V
        //    52: invokestatic    com/whatsapp/gdrive/GoogleDriveService.M:()V
        //    55: invokestatic    com/whatsapp/gdrive/GoogleDriveService.c:()V
        //    58: invokestatic    com/whatsapp/gdrive/GoogleDriveService.ah:()V
        //    61: aload_0        
        //    62: aload_0        
        //    63: invokestatic    com/whatsapp/gdrive/GoogleDriveService.a:(Landroid/content/Context;)Ljava/lang/String;
        //    66: putfield        com/whatsapp/gdrive/GoogleDriveService.g:Ljava/lang/String;
        //    69: aload_0        
        //    70: getfield        com/whatsapp/gdrive/GoogleDriveService.g:Ljava/lang/String;
        //    73: ifnonnull       138
        //    76: aload_0        
        //    77: aload_0        
        //    78: invokestatic    com/whatsapp/gdrive/GoogleDriveService.a:(Landroid/content/Context;)Ljava/lang/String;
        //    81: putfield        com/whatsapp/gdrive/GoogleDriveService.g:Ljava/lang/String;
        //    84: aload_0        
        //    85: getfield        com/whatsapp/gdrive/GoogleDriveService.g:Ljava/lang/String;
        //    88: astore          169
        //    90: aload           169
        //    92: ifnonnull       138
        //    95: aload           5
        //    97: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   100: bipush          94
        //   102: aaload         
        //   103: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   106: istore          170
        //   108: iload           170
        //   110: ifne            138
        //   113: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   116: bipush          64
        //   118: aaload         
        //   119: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   122: return         
        //   123: astore          8
        //   125: aload           8
        //   127: athrow         
        //   128: astore          6
        //   130: aload           6
        //   132: athrow         
        //   133: astore          7
        //   135: aload           7
        //   137: athrow         
        //   138: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   141: bipush          92
        //   143: aaload         
        //   144: aload_1        
        //   145: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   148: bipush          93
        //   150: aaload         
        //   151: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   154: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   157: istore          9
        //   159: iload           9
        //   161: ifeq            172
        //   164: invokestatic    com/whatsapp/gdrive/GoogleDriveService.A:()Z
        //   167: pop            
        //   168: iload_2        
        //   169: ifeq            3041
        //   172: invokestatic    com/whatsapp/gdrive/GoogleDriveService.B:()Z
        //   175: istore          10
        //   177: aload_0        
        //   178: getfield        com/whatsapp/gdrive/GoogleDriveService.d:Lcom/whatsapp/gdrive/ae;
        //   181: iload           10
        //   183: invokevirtual   com/whatsapp/gdrive/ae.d:(Z)V
        //   186: aload_0        
        //   187: invokestatic    com/whatsapp/gdrive/GoogleDriveService.o:()Ljava/lang/String;
        //   190: putfield        com/whatsapp/gdrive/GoogleDriveService.B:Ljava/lang/String;
        //   193: aload_0        
        //   194: getfield        com/whatsapp/gdrive/GoogleDriveService.B:Ljava/lang/String;
        //   197: ifnull          517
        //   200: aload_0        
        //   201: new             Lcom/whatsapp/gdrive/q;
        //   204: dup            
        //   205: aload_0        
        //   206: getfield        com/whatsapp/gdrive/GoogleDriveService.B:Ljava/lang/String;
        //   209: aload_0        
        //   210: invokespecial   com/whatsapp/gdrive/q.<init>:(Ljava/lang/String;Landroid/content/Context;)V
        //   213: putfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //   216: aload_0        
        //   217: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //   220: aload_0        
        //   221: getfield        com/whatsapp/gdrive/GoogleDriveService.B:Ljava/lang/String;
        //   224: invokevirtual   com/whatsapp/gdrive/q.h:(Ljava/lang/String;)Z
        //   227: pop            
        //   228: new             Ljava/lang/StringBuilder;
        //   231: dup            
        //   232: invokespecial   java/lang/StringBuilder.<init>:()V
        //   235: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   238: bipush          119
        //   240: aaload         
        //   241: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   244: aload           5
        //   246: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   249: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   252: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   255: invokestatic    com/whatsapp/App.j:()I
        //   258: putstatic       com/whatsapp/gdrive/GoogleDriveService.c:I
        //   261: invokestatic    com/whatsapp/gdrive/GoogleDriveService.M:()V
        //   264: invokestatic    com/whatsapp/gdrive/GoogleDriveService.c:()V
        //   267: invokestatic    com/whatsapp/gdrive/GoogleDriveService.ah:()V
        //   270: invokestatic    com/whatsapp/gdrive/GoogleDriveService.G:()V
        //   273: iconst_m1      
        //   274: istore          14
        //   276: aload           5
        //   278: invokevirtual   java/lang/String.hashCode:()I
        //   281: istore          16
        //   283: iload           16
        //   285: lookupswitch {
        //          -1755890518: 614
        //          -818191995: 589
        //          287784101: 639
        //          1035381739: 564
        //          1096596436: 664
        //          1996912751: 689
        //          default: 344
        //        }
        //   344: iload           14
        //   346: tableswitch {
        //                0: 743
        //                1: 1590
        //                2: 1661
        //                3: 2473
        //                4: 2482
        //                5: 2759
        //          default: 384
        //        }
        //   384: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   387: bipush          109
        //   389: aaload         
        //   390: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   393: return         
        //   394: astore          167
        //   396: aload           167
        //   398: athrow         
        //   399: astore          11
        //   401: aload           11
        //   403: athrow         
        //   404: astore          165
        //   406: new             Ljava/lang/StringBuilder;
        //   409: dup            
        //   410: invokespecial   java/lang/StringBuilder.<init>:()V
        //   413: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   416: bipush          91
        //   418: aaload         
        //   419: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   422: aload_0        
        //   423: getfield        com/whatsapp/gdrive/GoogleDriveService.B:Ljava/lang/String;
        //   426: invokestatic    com/whatsapp/gdrive/a7.a:(Ljava/lang/String;)Ljava/lang/String;
        //   429: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   432: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   435: bipush          70
        //   437: aaload         
        //   438: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   441: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   444: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   447: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   450: bipush          117
        //   452: aaload         
        //   453: aload           165
        //   455: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   458: aload_0        
        //   459: bipush          12
        //   461: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.e:(I)V
        //   464: return         
        //   465: astore          164
        //   467: new             Ljava/lang/StringBuilder;
        //   470: dup            
        //   471: invokespecial   java/lang/StringBuilder.<init>:()V
        //   474: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   477: bipush          73
        //   479: aaload         
        //   480: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   483: aload_0        
        //   484: getfield        com/whatsapp/gdrive/GoogleDriveService.B:Ljava/lang/String;
        //   487: invokestatic    com/whatsapp/gdrive/a7.a:(Ljava/lang/String;)Ljava/lang/String;
        //   490: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   493: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   496: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   499: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   502: bipush          68
        //   504: aaload         
        //   505: aload           164
        //   507: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   510: aload_0        
        //   511: bipush          11
        //   513: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.e:(I)V
        //   516: return         
        //   517: aload           5
        //   519: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   522: bipush          77
        //   524: aaload         
        //   525: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   528: ifeq            544
        //   531: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   534: bipush          111
        //   536: aaload         
        //   537: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   540: iload_2        
        //   541: ifeq            228
        //   544: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   547: bipush          69
        //   549: aaload         
        //   550: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   553: return         
        //   554: astore          13
        //   556: aload           13
        //   558: athrow         
        //   559: astore          12
        //   561: aload           12
        //   563: athrow         
        //   564: aload           5
        //   566: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   569: bipush          108
        //   571: aaload         
        //   572: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   575: istore          163
        //   577: iload           163
        //   579: ifeq            344
        //   582: iload_2        
        //   583: ifeq            3035
        //   586: iconst_0       
        //   587: istore          14
        //   589: aload           5
        //   591: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   594: bipush          103
        //   596: aaload         
        //   597: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   600: istore          162
        //   602: iload           162
        //   604: ifeq            344
        //   607: iload_2        
        //   608: ifeq            3029
        //   611: iconst_1       
        //   612: istore          14
        //   614: aload           5
        //   616: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   619: bipush          113
        //   621: aaload         
        //   622: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   625: istore          160
        //   627: iload           160
        //   629: ifeq            344
        //   632: iconst_2       
        //   633: istore          14
        //   635: iload_2        
        //   636: ifeq            344
        //   639: aload           5
        //   641: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   644: bipush          71
        //   646: aaload         
        //   647: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   650: istore          158
        //   652: iload           158
        //   654: ifeq            344
        //   657: iconst_3       
        //   658: istore          14
        //   660: iload_2        
        //   661: ifeq            344
        //   664: aload           5
        //   666: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   669: bipush          106
        //   671: aaload         
        //   672: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   675: istore          156
        //   677: iload           156
        //   679: ifeq            344
        //   682: iconst_4       
        //   683: istore          14
        //   685: iload_2        
        //   686: ifeq            344
        //   689: aload           5
        //   691: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   694: bipush          67
        //   696: aaload         
        //   697: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   700: istore          18
        //   702: iload           18
        //   704: ifeq            344
        //   707: iconst_5       
        //   708: istore          14
        //   710: goto            344
        //   713: astore          15
        //   715: aload           15
        //   717: athrow         
        //   718: astore          161
        //   720: aload           161
        //   722: athrow         
        //   723: astore          159
        //   725: aload           159
        //   727: athrow         
        //   728: astore          157
        //   730: aload           157
        //   732: athrow         
        //   733: astore          155
        //   735: aload           155
        //   737: athrow         
        //   738: astore          17
        //   740: aload           17
        //   742: athrow         
        //   743: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   746: bipush          120
        //   748: aaload         
        //   749: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   752: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   755: bipush          86
        //   757: aaload         
        //   758: aload_1        
        //   759: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   762: bipush          83
        //   764: aaload         
        //   765: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   768: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   771: istore          65
        //   773: invokestatic    java/lang/System.currentTimeMillis:()J
        //   776: lstore          67
        //   778: aload_0        
        //   779: getfield        com/whatsapp/gdrive/GoogleDriveService.B:Ljava/lang/String;
        //   782: invokestatic    com/whatsapp/gdrive/GoogleDriveService.a:(Ljava/lang/String;)J
        //   785: lstore          69
        //   787: lload           67
        //   789: lload           69
        //   791: lsub           
        //   792: ldc2_w          3600
        //   795: lcmp           
        //   796: ifle            855
        //   799: iconst_1       
        //   800: istore          71
        //   802: iload           10
        //   804: ifne            827
        //   807: iload           71
        //   809: ifeq            871
        //   812: iload           65
        //   814: ifne            827
        //   817: invokestatic    com/whatsapp/gdrive/GoogleDriveService.P:()Z
        //   820: istore          154
        //   822: iload           154
        //   824: ifeq            871
        //   827: iconst_1       
        //   828: istore          72
        //   830: iload           72
        //   832: ifne            877
        //   835: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   838: bipush          100
        //   840: aaload         
        //   841: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   844: return         
        //   845: astore          151
        //   847: aload           151
        //   849: athrow         
        //   850: astore          66
        //   852: aload           66
        //   854: athrow         
        //   855: iconst_0       
        //   856: istore          71
        //   858: goto            802
        //   861: astore          152
        //   863: aload           152
        //   865: athrow         
        //   866: astore          153
        //   868: aload           153
        //   870: athrow         
        //   871: iconst_0       
        //   872: istore          72
        //   874: goto            830
        //   877: invokestatic    com/whatsapp/App.aq:()Z
        //   880: ifeq            898
        //   883: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   886: bipush          88
        //   888: aaload         
        //   889: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   892: return         
        //   893: astore          73
        //   895: aload           73
        //   897: athrow         
        //   898: invokestatic    com/whatsapp/gdrive/GoogleDriveService.ac:()Z
        //   901: ifeq            919
        //   904: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   907: bipush          110
        //   909: aaload         
        //   910: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   913: return         
        //   914: astore          74
        //   916: aload           74
        //   918: athrow         
        //   919: getstatic       com/whatsapp/gdrive/GoogleDriveService.t:Ljava/util/concurrent/atomic/AtomicBoolean;
        //   922: iconst_1       
        //   923: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.getAndSet:(Z)Z
        //   926: ifeq            944
        //   929: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //   932: bipush          89
        //   934: aaload         
        //   935: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   938: return         
        //   939: astore          75
        //   941: aload           75
        //   943: athrow         
        //   944: aload_0        
        //   945: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //   948: invokevirtual   com/whatsapp/gdrive/aq.e:()V
        //   951: iconst_1       
        //   952: invokestatic    com/whatsapp/gdrive/GoogleDriveService.b:(I)Z
        //   955: pop            
        //   956: iload           10
        //   958: ifeq            990
        //   961: getstatic       com/whatsapp/gdrive/GoogleDriveService.E:I
        //   964: istore          81
        //   966: iload           81
        //   968: ifne            990
        //   971: getstatic       com/whatsapp/gdrive/GoogleDriveService.c:I
        //   974: istore          150
        //   976: iload           150
        //   978: iconst_2       
        //   979: if_icmpne       990
        //   982: iconst_1       
        //   983: putstatic       com/whatsapp/gdrive/GoogleDriveService.p:Z
        //   986: iload_2        
        //   987: ifeq            998
        //   990: iconst_0       
        //   991: putstatic       com/whatsapp/gdrive/GoogleDriveService.p:Z
        //   994: iconst_0       
        //   995: putstatic       com/whatsapp/gdrive/GoogleDriveService.h:Z
        //   998: invokestatic    de/greenrobot/event/m.b:()Lde/greenrobot/event/m;
        //  1001: ldc_w           Lcom/whatsapp/b5;.class
        //  1004: invokevirtual   de/greenrobot/event/m.a:(Ljava/lang/Class;)Ljava/lang/Object;
        //  1007: checkcast       Lcom/whatsapp/b5;
        //  1010: astore          82
        //  1012: iload           10
        //  1014: ifeq            1144
        //  1017: aload           82
        //  1019: ifnull          1144
        //  1022: aload           82
        //  1024: invokevirtual   com/whatsapp/b5.b:()Z
        //  1027: istore          147
        //  1029: iload           147
        //  1031: ifne            1144
        //  1034: aload           82
        //  1036: invokevirtual   com/whatsapp/b5.a:()D
        //  1039: dstore          148
        //  1041: dload           148
        //  1043: ldc2_w          20.0
        //  1046: dcmpg          
        //  1047: ifge            1144
        //  1050: iconst_1       
        //  1051: istore          83
        //  1053: iload           83
        //  1055: putstatic       com/whatsapp/gdrive/GoogleDriveService.h:Z
        //  1058: invokestatic    com/whatsapp/gdrive/GoogleDriveService.c:()V
        //  1061: new             Ljava/lang/StringBuilder;
        //  1064: dup            
        //  1065: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1068: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1071: bipush          80
        //  1073: aaload         
        //  1074: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1077: getstatic       com/whatsapp/gdrive/GoogleDriveService.p:Z
        //  1080: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //  1083: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1086: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1089: aload_0        
        //  1090: invokespecial   com/whatsapp/gdrive/GoogleDriveService.C:()Z
        //  1093: ifne            1150
        //  1096: aload_0        
        //  1097: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  1100: invokevirtual   com/whatsapp/gdrive/aq.a:()V
        //  1103: return         
        //  1104: astore          84
        //  1106: aload           84
        //  1108: athrow         
        //  1109: astore          76
        //  1111: aload           76
        //  1113: athrow         
        //  1114: astore          77
        //  1116: aload           77
        //  1118: athrow         
        //  1119: astore          78
        //  1121: aload           78
        //  1123: athrow         
        //  1124: astore          79
        //  1126: aload           79
        //  1128: athrow         
        //  1129: astore          144
        //  1131: aload           144
        //  1133: athrow         
        //  1134: astore          145
        //  1136: aload           145
        //  1138: athrow         
        //  1139: astore          146
        //  1141: aload           146
        //  1143: athrow         
        //  1144: iconst_0       
        //  1145: istore          83
        //  1147: goto            1053
        //  1150: aload_0        
        //  1151: new             Lcom/whatsapp/fieldstats/bd;
        //  1154: dup            
        //  1155: invokespecial   com/whatsapp/fieldstats/bd.<init>:()V
        //  1158: putfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //  1161: aload_0        
        //  1162: invokespecial   com/whatsapp/gdrive/GoogleDriveService.C:()Z
        //  1165: ifne            1264
        //  1168: aload_0        
        //  1169: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  1172: invokevirtual   com/whatsapp/gdrive/aq.a:()V
        //  1175: aload_0        
        //  1176: lconst_0       
        //  1177: putfield        com/whatsapp/gdrive/GoogleDriveService.N:J
        //  1180: aload_0        
        //  1181: getfield        com/whatsapp/gdrive/GoogleDriveService.T:Ljava/util/concurrent/atomic/AtomicLong;
        //  1184: lconst_0       
        //  1185: invokevirtual   java/util/concurrent/atomic/AtomicLong.set:(J)V
        //  1188: iconst_0       
        //  1189: invokestatic    com/whatsapp/gdrive/GoogleDriveService.b:(I)Z
        //  1192: pop            
        //  1193: invokestatic    com/whatsapp/gdrive/GoogleDriveService.q:()Z
        //  1196: pop            
        //  1197: aload_0        
        //  1198: lconst_0       
        //  1199: putfield        com/whatsapp/gdrive/GoogleDriveService.Q:J
        //  1202: getstatic       com/whatsapp/gdrive/GoogleDriveService.t:Ljava/util/concurrent/atomic/AtomicBoolean;
        //  1205: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //  1208: ifne            1222
        //  1211: aload_0        
        //  1212: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  1215: invokevirtual   com/whatsapp/gdrive/aq.a:()V
        //  1218: iload_2        
        //  1219: ifeq            1230
        //  1222: aload_0        
        //  1223: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  1226: iconst_0       
        //  1227: invokevirtual   com/whatsapp/gdrive/aq.a:(Z)V
        //  1230: getstatic       com/whatsapp/gdrive/GoogleDriveService.t:Ljava/util/concurrent/atomic/AtomicBoolean;
        //  1233: iconst_0       
        //  1234: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //  1237: iload_2        
        //  1238: ifeq            14
        //  1241: aload_0        
        //  1242: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  1245: invokevirtual   com/whatsapp/gdrive/aq.f:()V
        //  1248: return         
        //  1249: astore          143
        //  1251: aload           143
        //  1253: athrow         
        //  1254: astore          141
        //  1256: aload           141
        //  1258: athrow         
        //  1259: astore          142
        //  1261: aload           142
        //  1263: athrow         
        //  1264: aload_0        
        //  1265: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  1268: invokevirtual   com/whatsapp/gdrive/aq.b:()V
        //  1271: aload_0        
        //  1272: invokespecial   com/whatsapp/gdrive/GoogleDriveService.H:()Z
        //  1275: istore          138
        //  1277: iload           138
        //  1279: istore          95
        //  1281: iload           95
        //  1283: ifeq            1315
        //  1286: invokestatic    com/whatsapp/gdrive/GoogleDriveService.o:()Ljava/lang/String;
        //  1289: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1292: invokestatic    com/whatsapp/gdrive/GoogleDriveService.b:(Ljava/lang/String;J)Z
        //  1295: pop            
        //  1296: invokestatic    com/whatsapp/gdrive/GoogleDriveService.o:()Ljava/lang/String;
        //  1299: aload_0        
        //  1300: getfield        com/whatsapp/gdrive/GoogleDriveService.Q:J
        //  1303: invokestatic    com/whatsapp/gdrive/GoogleDriveService.a:(Ljava/lang/String;J)Z
        //  1306: pop            
        //  1307: invokestatic    com/whatsapp/gdrive/GoogleDriveService.ak:()Z
        //  1310: pop            
        //  1311: iload_2        
        //  1312: ifeq            1377
        //  1315: invokestatic    com/whatsapp/gdrive/GoogleDriveService.af:()Z
        //  1318: istore          99
        //  1320: iload           99
        //  1322: ifeq            1377
        //  1325: invokestatic    com/whatsapp/gdrive/GoogleDriveService.Y:()Z
        //  1328: pop            
        //  1329: invokestatic    com/whatsapp/gdrive/GoogleDriveService.E:()I
        //  1332: istore          131
        //  1334: iload           131
        //  1336: iconst_4       
        //  1337: if_icmplt       1377
        //  1340: new             Ljava/lang/StringBuilder;
        //  1343: dup            
        //  1344: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1347: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1350: bipush          95
        //  1352: aaload         
        //  1353: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1356: invokestatic    com/whatsapp/gdrive/GoogleDriveService.E:()I
        //  1359: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1362: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1365: bipush          96
        //  1367: aaload         
        //  1368: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1371: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1374: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  1377: aload_0        
        //  1378: lconst_0       
        //  1379: putfield        com/whatsapp/gdrive/GoogleDriveService.N:J
        //  1382: aload_0        
        //  1383: getfield        com/whatsapp/gdrive/GoogleDriveService.T:Ljava/util/concurrent/atomic/AtomicLong;
        //  1386: lconst_0       
        //  1387: invokevirtual   java/util/concurrent/atomic/AtomicLong.set:(J)V
        //  1390: iconst_0       
        //  1391: invokestatic    com/whatsapp/gdrive/GoogleDriveService.b:(I)Z
        //  1394: pop            
        //  1395: invokestatic    com/whatsapp/gdrive/GoogleDriveService.q:()Z
        //  1398: pop            
        //  1399: aload_0        
        //  1400: lconst_0       
        //  1401: putfield        com/whatsapp/gdrive/GoogleDriveService.Q:J
        //  1404: iload           95
        //  1406: ifne            1453
        //  1409: getstatic       com/whatsapp/gdrive/GoogleDriveService.t:Ljava/util/concurrent/atomic/AtomicBoolean;
        //  1412: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //  1415: istore          105
        //  1417: iload           105
        //  1419: ifne            1433
        //  1422: aload_0        
        //  1423: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  1426: invokevirtual   com/whatsapp/gdrive/aq.a:()V
        //  1429: iload_2        
        //  1430: ifeq            1442
        //  1433: aload_0        
        //  1434: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  1437: iload           95
        //  1439: invokevirtual   com/whatsapp/gdrive/aq.a:(Z)V
        //  1442: getstatic       com/whatsapp/gdrive/GoogleDriveService.t:Ljava/util/concurrent/atomic/AtomicBoolean;
        //  1445: iconst_0       
        //  1446: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //  1449: iload_2        
        //  1450: ifeq            1460
        //  1453: aload_0        
        //  1454: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  1457: invokevirtual   com/whatsapp/gdrive/aq.f:()V
        //  1460: iload           95
        //  1462: ifeq            1573
        //  1465: aload_0        
        //  1466: bipush          10
        //  1468: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.e:(I)V
        //  1471: aload_0        
        //  1472: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //  1475: invokevirtual   com/whatsapp/gdrive/q.a:()Z
        //  1478: pop            
        //  1479: aload_0        
        //  1480: getfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //  1483: getstatic       com/whatsapp/fieldstats/d.OK:Lcom/whatsapp/fieldstats/d;
        //  1486: invokevirtual   com/whatsapp/fieldstats/d.getCode:()I
        //  1489: i2d            
        //  1490: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  1493: putfield        com/whatsapp/fieldstats/bd.c:Ljava/lang/Double;
        //  1496: aload_0        
        //  1497: getfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //  1500: invokestatic    com/whatsapp/gdrive/GoogleDriveService.E:()I
        //  1503: i2d            
        //  1504: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  1507: putfield        com/whatsapp/fieldstats/bd.h:Ljava/lang/Double;
        //  1510: new             Lcom/whatsapp/util/b0;
        //  1513: dup            
        //  1514: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1517: bipush          99
        //  1519: aaload         
        //  1520: invokespecial   com/whatsapp/util/b0.<init>:(Ljava/lang/String;)V
        //  1523: astore          108
        //  1525: aload_0        
        //  1526: invokespecial   com/whatsapp/gdrive/GoogleDriveService.J:()Z
        //  1529: pop            
        //  1530: getstatic       com/whatsapp/gdrive/GoogleDriveService.t:Ljava/util/concurrent/atomic/AtomicBoolean;
        //  1533: iconst_0       
        //  1534: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //  1537: aload_0        
        //  1538: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //  1541: invokevirtual   com/whatsapp/gdrive/q.b:()Z
        //  1544: ifeq            1558
        //  1547: aload_0        
        //  1548: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  1551: invokevirtual   com/whatsapp/gdrive/aq.a:()V
        //  1554: iload_2        
        //  1555: ifeq            1567
        //  1558: aload_0        
        //  1559: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  1562: iload           95
        //  1564: invokevirtual   com/whatsapp/gdrive/aq.a:(Z)V
        //  1567: aload           108
        //  1569: invokevirtual   com/whatsapp/util/b0.c:()J
        //  1572: pop2           
        //  1573: aload_0        
        //  1574: aload_0        
        //  1575: getfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //  1578: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/b9;)V
        //  1581: aload_0        
        //  1582: aconst_null    
        //  1583: putfield        com/whatsapp/gdrive/GoogleDriveService.i:Lcom/whatsapp/fieldstats/bd;
        //  1586: iload_2        
        //  1587: ifeq            14
        //  1590: invokestatic    com/whatsapp/gdrive/GoogleDriveService.ac:()Z
        //  1593: istore          62
        //  1595: iload           62
        //  1597: ifeq            1612
        //  1600: aload_0        
        //  1601: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  1604: iconst_1       
        //  1605: invokevirtual   com/whatsapp/gdrive/aq.b:(Z)V
        //  1608: iload_2        
        //  1609: ifeq            14
        //  1612: getstatic       com/whatsapp/gdrive/GoogleDriveService.a:Ljava/util/concurrent/atomic/AtomicBoolean;
        //  1615: iconst_1       
        //  1616: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.getAndSet:(Z)Z
        //  1619: istore          63
        //  1621: iload           63
        //  1623: ifeq            1639
        //  1626: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1629: bipush          78
        //  1631: aaload         
        //  1632: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  1635: iload_2        
        //  1636: ifeq            14
        //  1639: new             Lcom/whatsapp/gdrive/c5;
        //  1642: dup            
        //  1643: aload_0        
        //  1644: invokespecial   com/whatsapp/gdrive/c5.<init>:(Lcom/whatsapp/gdrive/GoogleDriveService;)V
        //  1647: invokestatic    com/whatsapp/gdrive/h.a:(Ljava/lang/Runnable;)V
        //  1650: getstatic       com/whatsapp/gdrive/GoogleDriveService.a:Ljava/util/concurrent/atomic/AtomicBoolean;
        //  1653: iconst_0       
        //  1654: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //  1657: iload_2        
        //  1658: ifeq            14
        //  1661: invokestatic    com/whatsapp/gdrive/GoogleDriveService.ac:()Z
        //  1664: istore          44
        //  1666: iload           44
        //  1668: ifne            2223
        //  1671: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1674: bipush          72
        //  1676: aaload         
        //  1677: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1680: return         
        //  1681: astore          43
        //  1683: aload           43
        //  1685: athrow         
        //  1686: astore          137
        //  1688: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1691: bipush          74
        //  1693: aaload         
        //  1694: aload           137
        //  1696: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1699: aload_0        
        //  1700: bipush          12
        //  1702: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.e:(I)V
        //  1705: iconst_0       
        //  1706: istore          95
        //  1708: goto            1281
        //  1711: astore          136
        //  1713: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1716: bipush          98
        //  1718: aaload         
        //  1719: aload           136
        //  1721: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1724: aload_0        
        //  1725: bipush          11
        //  1727: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.e:(I)V
        //  1730: iconst_0       
        //  1731: istore          95
        //  1733: goto            1281
        //  1736: astore          94
        //  1738: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1741: bipush          65
        //  1743: aaload         
        //  1744: aload           94
        //  1746: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1749: aload_0        
        //  1750: bipush          15
        //  1752: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.e:(I)V
        //  1755: iconst_0       
        //  1756: istore          95
        //  1758: goto            1281
        //  1761: astore          132
        //  1763: aload           132
        //  1765: athrow         
        //  1766: astore          96
        //  1768: aload           96
        //  1770: athrow         
        //  1771: astore          97
        //  1773: aload           97
        //  1775: athrow         
        //  1776: astore          98
        //  1778: aload           98
        //  1780: athrow         
        //  1781: astore          85
        //  1783: iload           95
        //  1785: istore          86
        //  1787: aload_0        
        //  1788: lconst_0       
        //  1789: putfield        com/whatsapp/gdrive/GoogleDriveService.N:J
        //  1792: aload_0        
        //  1793: getfield        com/whatsapp/gdrive/GoogleDriveService.T:Ljava/util/concurrent/atomic/AtomicLong;
        //  1796: lconst_0       
        //  1797: invokevirtual   java/util/concurrent/atomic/AtomicLong.set:(J)V
        //  1800: iconst_0       
        //  1801: invokestatic    com/whatsapp/gdrive/GoogleDriveService.b:(I)Z
        //  1804: pop            
        //  1805: invokestatic    com/whatsapp/gdrive/GoogleDriveService.q:()Z
        //  1808: pop            
        //  1809: aload_0        
        //  1810: lconst_0       
        //  1811: putfield        com/whatsapp/gdrive/GoogleDriveService.Q:J
        //  1814: iload           86
        //  1816: ifne            1863
        //  1819: getstatic       com/whatsapp/gdrive/GoogleDriveService.t:Ljava/util/concurrent/atomic/AtomicBoolean;
        //  1822: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //  1825: istore          92
        //  1827: iload           92
        //  1829: ifne            1843
        //  1832: aload_0        
        //  1833: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  1836: invokevirtual   com/whatsapp/gdrive/aq.a:()V
        //  1839: iload_2        
        //  1840: ifeq            1852
        //  1843: aload_0        
        //  1844: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  1847: iload           86
        //  1849: invokevirtual   com/whatsapp/gdrive/aq.a:(Z)V
        //  1852: getstatic       com/whatsapp/gdrive/GoogleDriveService.t:Ljava/util/concurrent/atomic/AtomicBoolean;
        //  1855: iconst_0       
        //  1856: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //  1859: iload_2        
        //  1860: ifeq            1870
        //  1863: aload_0        
        //  1864: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  1867: invokevirtual   com/whatsapp/gdrive/aq.f:()V
        //  1870: aload           85
        //  1872: athrow         
        //  1873: astore          100
        //  1875: aload           100
        //  1877: athrow         
        //  1878: astore          101
        //  1880: aload           101
        //  1882: athrow         
        //  1883: astore          102
        //  1885: aload           102
        //  1887: athrow         
        //  1888: astore          106
        //  1890: aload           106
        //  1892: athrow         
        //  1893: astore          87
        //  1895: aload           87
        //  1897: athrow         
        //  1898: astore          88
        //  1900: aload           88
        //  1902: athrow         
        //  1903: astore          89
        //  1905: aload           89
        //  1907: athrow         
        //  1908: astore          93
        //  1910: aload           93
        //  1912: athrow         
        //  1913: astore          127
        //  1915: aload           127
        //  1917: athrow         
        //  1918: astore          122
        //  1920: aload_0        
        //  1921: bipush          12
        //  1923: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.e:(I)V
        //  1926: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1929: bipush          90
        //  1931: aaload         
        //  1932: aload           122
        //  1934: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1937: getstatic       com/whatsapp/gdrive/GoogleDriveService.t:Ljava/util/concurrent/atomic/AtomicBoolean;
        //  1940: iconst_0       
        //  1941: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //  1944: aload_0        
        //  1945: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //  1948: invokevirtual   com/whatsapp/gdrive/q.b:()Z
        //  1951: ifeq            1965
        //  1954: aload_0        
        //  1955: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  1958: invokevirtual   com/whatsapp/gdrive/aq.a:()V
        //  1961: iload_2        
        //  1962: ifeq            1974
        //  1965: aload_0        
        //  1966: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  1969: iload           95
        //  1971: invokevirtual   com/whatsapp/gdrive/aq.a:(Z)V
        //  1974: aload           108
        //  1976: invokevirtual   com/whatsapp/util/b0.c:()J
        //  1979: pop2           
        //  1980: goto            1573
        //  1983: astore          123
        //  1985: aload           123
        //  1987: athrow         
        //  1988: astore          118
        //  1990: aload_0        
        //  1991: bipush          11
        //  1993: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.e:(I)V
        //  1996: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  1999: bipush          112
        //  2001: aaload         
        //  2002: aload           118
        //  2004: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2007: getstatic       com/whatsapp/gdrive/GoogleDriveService.t:Ljava/util/concurrent/atomic/AtomicBoolean;
        //  2010: iconst_0       
        //  2011: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //  2014: aload_0        
        //  2015: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //  2018: invokevirtual   com/whatsapp/gdrive/q.b:()Z
        //  2021: ifeq            2035
        //  2024: aload_0        
        //  2025: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  2028: invokevirtual   com/whatsapp/gdrive/aq.a:()V
        //  2031: iload_2        
        //  2032: ifeq            2044
        //  2035: aload_0        
        //  2036: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  2039: iload           95
        //  2041: invokevirtual   com/whatsapp/gdrive/aq.a:(Z)V
        //  2044: aload           108
        //  2046: invokevirtual   com/whatsapp/util/b0.c:()J
        //  2049: pop2           
        //  2050: goto            1573
        //  2053: astore          119
        //  2055: aload           119
        //  2057: athrow         
        //  2058: astore          114
        //  2060: aload_0        
        //  2061: bipush          15
        //  2063: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.e:(I)V
        //  2066: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  2069: bipush          75
        //  2071: aaload         
        //  2072: aload           114
        //  2074: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2077: getstatic       com/whatsapp/gdrive/GoogleDriveService.t:Ljava/util/concurrent/atomic/AtomicBoolean;
        //  2080: iconst_0       
        //  2081: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //  2084: aload_0        
        //  2085: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //  2088: invokevirtual   com/whatsapp/gdrive/q.b:()Z
        //  2091: ifeq            2105
        //  2094: aload_0        
        //  2095: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  2098: invokevirtual   com/whatsapp/gdrive/aq.a:()V
        //  2101: iload_2        
        //  2102: ifeq            2114
        //  2105: aload_0        
        //  2106: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  2109: iload           95
        //  2111: invokevirtual   com/whatsapp/gdrive/aq.a:(Z)V
        //  2114: aload           108
        //  2116: invokevirtual   com/whatsapp/util/b0.c:()J
        //  2119: pop2           
        //  2120: goto            1573
        //  2123: astore          115
        //  2125: aload           115
        //  2127: athrow         
        //  2128: astore          109
        //  2130: getstatic       com/whatsapp/gdrive/GoogleDriveService.t:Ljava/util/concurrent/atomic/AtomicBoolean;
        //  2133: iconst_0       
        //  2134: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //  2137: aload_0        
        //  2138: getfield        com/whatsapp/gdrive/GoogleDriveService.L:Lcom/whatsapp/gdrive/q;
        //  2141: invokevirtual   com/whatsapp/gdrive/q.b:()Z
        //  2144: ifeq            2158
        //  2147: aload_0        
        //  2148: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  2151: invokevirtual   com/whatsapp/gdrive/aq.a:()V
        //  2154: iload_2        
        //  2155: ifeq            2167
        //  2158: aload_0        
        //  2159: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  2162: iload           95
        //  2164: invokevirtual   com/whatsapp/gdrive/aq.a:(Z)V
        //  2167: aload           108
        //  2169: invokevirtual   com/whatsapp/util/b0.c:()J
        //  2172: pop2           
        //  2173: aload           109
        //  2175: athrow         
        //  2176: astore          110
        //  2178: aload           110
        //  2180: athrow         
        //  2181: astore          111
        //  2183: aload           111
        //  2185: athrow         
        //  2186: astore          58
        //  2188: aload           58
        //  2190: athrow         
        //  2191: astore          59
        //  2193: aload           59
        //  2195: athrow         
        //  2196: astore          60
        //  2198: aload           60
        //  2200: athrow         
        //  2201: astore          61
        //  2203: aload           61
        //  2205: athrow         
        //  2206: astore          64
        //  2208: getstatic       com/whatsapp/gdrive/GoogleDriveService.a:Ljava/util/concurrent/atomic/AtomicBoolean;
        //  2211: iconst_0       
        //  2212: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //  2215: aload           64
        //  2217: athrow         
        //  2218: astore          42
        //  2220: aload           42
        //  2222: athrow         
        //  2223: getstatic       com/whatsapp/gdrive/GoogleDriveService.v:Ljava/util/concurrent/atomic/AtomicBoolean;
        //  2226: iconst_1       
        //  2227: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.getAndSet:(Z)Z
        //  2230: ifeq            2246
        //  2233: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  2236: bipush          114
        //  2238: aaload         
        //  2239: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  2242: iload_2        
        //  2243: ifeq            14
        //  2246: aload_0        
        //  2247: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  2250: invokevirtual   com/whatsapp/gdrive/aq.c:()V
        //  2253: aload_0        
        //  2254: new             Lcom/whatsapp/fieldstats/bv;
        //  2257: dup            
        //  2258: invokespecial   com/whatsapp/fieldstats/bv.<init>:()V
        //  2261: putfield        com/whatsapp/gdrive/GoogleDriveService.O:Lcom/whatsapp/fieldstats/bv;
        //  2264: aload_0        
        //  2265: getfield        com/whatsapp/gdrive/GoogleDriveService.O:Lcom/whatsapp/fieldstats/bv;
        //  2268: dconst_1       
        //  2269: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  2272: putfield        com/whatsapp/fieldstats/bv.f:Ljava/lang/Double;
        //  2275: invokestatic    com/whatsapp/gdrive/GoogleDriveService.Q:()J
        //  2278: lconst_0       
        //  2279: lcmp           
        //  2280: ifge            2290
        //  2283: invokestatic    java/lang/System.currentTimeMillis:()J
        //  2286: invokestatic    com/whatsapp/gdrive/GoogleDriveService.b:(J)Z
        //  2289: pop            
        //  2290: aload_0        
        //  2291: invokespecial   com/whatsapp/gdrive/GoogleDriveService.W:()Z
        //  2294: istore          50
        //  2296: iload           50
        //  2298: ifeq            2318
        //  2301: aload_0        
        //  2302: getfield        com/whatsapp/gdrive/GoogleDriveService.O:Lcom/whatsapp/fieldstats/bv;
        //  2305: getstatic       com/whatsapp/fieldstats/d.OK:Lcom/whatsapp/fieldstats/d;
        //  2308: invokevirtual   com/whatsapp/fieldstats/d.getCode:()I
        //  2311: i2d            
        //  2312: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  2315: putfield        com/whatsapp/fieldstats/bv.d:Ljava/lang/Double;
        //  2318: getstatic       com/whatsapp/gdrive/GoogleDriveService.c:I
        //  2321: iconst_1       
        //  2322: if_icmpne       2340
        //  2325: aload_0        
        //  2326: getfield        com/whatsapp/gdrive/GoogleDriveService.O:Lcom/whatsapp/fieldstats/bv;
        //  2329: dconst_1       
        //  2330: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  2333: putfield        com/whatsapp/fieldstats/bv.e:Ljava/lang/Double;
        //  2336: iload_2        
        //  2337: ifeq            2351
        //  2340: aload_0        
        //  2341: getfield        com/whatsapp/gdrive/GoogleDriveService.O:Lcom/whatsapp/fieldstats/bv;
        //  2344: dconst_0       
        //  2345: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  2348: putfield        com/whatsapp/fieldstats/bv.e:Ljava/lang/Double;
        //  2351: invokestatic    java/lang/System.currentTimeMillis:()J
        //  2354: lstore          53
        //  2356: aload_0        
        //  2357: getfield        com/whatsapp/gdrive/GoogleDriveService.O:Lcom/whatsapp/fieldstats/bv;
        //  2360: lload           53
        //  2362: invokestatic    com/whatsapp/gdrive/GoogleDriveService.Q:()J
        //  2365: lsub           
        //  2366: l2d            
        //  2367: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  2370: putfield        com/whatsapp/fieldstats/bv.a:Ljava/lang/Double;
        //  2373: aload_0        
        //  2374: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //  2377: ifnull          2442
        //  2380: aload_0        
        //  2381: getfield        com/whatsapp/gdrive/GoogleDriveService.O:Lcom/whatsapp/fieldstats/bv;
        //  2384: aload_0        
        //  2385: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //  2388: invokevirtual   com/whatsapp/gdrive/bq.b:()J
        //  2391: l2d            
        //  2392: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  2395: putfield        com/whatsapp/fieldstats/bv.b:Ljava/lang/Double;
        //  2398: aload_0        
        //  2399: getfield        com/whatsapp/gdrive/GoogleDriveService.O:Lcom/whatsapp/fieldstats/bv;
        //  2402: aload_0        
        //  2403: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //  2406: invokevirtual   com/whatsapp/gdrive/bq.h:()J
        //  2409: l2d            
        //  2410: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  2413: putfield        com/whatsapp/fieldstats/bv.i:Ljava/lang/Double;
        //  2416: aload_0        
        //  2417: getfield        com/whatsapp/gdrive/GoogleDriveService.O:Lcom/whatsapp/fieldstats/bv;
        //  2420: aload_0        
        //  2421: getfield        com/whatsapp/gdrive/GoogleDriveService.P:Lcom/whatsapp/gdrive/bq;
        //  2424: invokevirtual   com/whatsapp/gdrive/bq.f:()J
        //  2427: l2d            
        //  2428: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  2431: putfield        com/whatsapp/fieldstats/bv.j:Ljava/lang/Double;
        //  2434: aload_0        
        //  2435: aload_0        
        //  2436: getfield        com/whatsapp/gdrive/GoogleDriveService.O:Lcom/whatsapp/fieldstats/bv;
        //  2439: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/b9;)V
        //  2442: aload_0        
        //  2443: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  2446: iload           50
        //  2448: aload_0        
        //  2449: getfield        com/whatsapp/gdrive/GoogleDriveService.l:Ljava/util/concurrent/atomic/AtomicLong;
        //  2452: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //  2455: aload_0        
        //  2456: getfield        com/whatsapp/gdrive/GoogleDriveService.b:J
        //  2459: invokevirtual   com/whatsapp/gdrive/aq.a:(ZJJ)V
        //  2462: getstatic       com/whatsapp/gdrive/GoogleDriveService.v:Ljava/util/concurrent/atomic/AtomicBoolean;
        //  2465: iconst_0       
        //  2466: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //  2469: iload_2        
        //  2470: ifeq            14
        //  2473: aload_0        
        //  2474: invokespecial   com/whatsapp/gdrive/GoogleDriveService.L:()Z
        //  2477: pop            
        //  2478: iload_2        
        //  2479: ifeq            14
        //  2482: aload_0        
        //  2483: getfield        com/whatsapp/gdrive/GoogleDriveService.e:Ljava/util/concurrent/atomic/AtomicBoolean;
        //  2486: iconst_1       
        //  2487: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.getAndSet:(Z)Z
        //  2490: istore          25
        //  2492: iload           25
        //  2494: ifeq            2625
        //  2497: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  2500: bipush          82
        //  2502: aaload         
        //  2503: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  2506: return         
        //  2507: astore          24
        //  2509: aload           24
        //  2511: athrow         
        //  2512: astore          45
        //  2514: aload           45
        //  2516: athrow         
        //  2517: astore          56
        //  2519: aload           56
        //  2521: athrow         
        //  2522: astore          49
        //  2524: aload_0        
        //  2525: bipush          12
        //  2527: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.e:(I)V
        //  2530: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  2533: bipush          105
        //  2535: aaload         
        //  2536: aload           49
        //  2538: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2541: goto            2462
        //  2544: astore          46
        //  2546: getstatic       com/whatsapp/gdrive/GoogleDriveService.v:Ljava/util/concurrent/atomic/AtomicBoolean;
        //  2549: iconst_0       
        //  2550: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //  2553: aload           46
        //  2555: athrow         
        //  2556: astore          51
        //  2558: aload           51
        //  2560: athrow         
        //  2561: astore          52
        //  2563: aload           52
        //  2565: athrow         
        //  2566: astore          48
        //  2568: aload_0        
        //  2569: bipush          11
        //  2571: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.e:(I)V
        //  2574: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  2577: bipush          84
        //  2579: aaload         
        //  2580: aload           48
        //  2582: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2585: goto            2462
        //  2588: astore          55
        //  2590: aload           55
        //  2592: athrow         
        //  2593: astore          47
        //  2595: aload_0        
        //  2596: bipush          15
        //  2598: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.e:(I)V
        //  2601: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  2604: bipush          97
        //  2606: aaload         
        //  2607: aload           47
        //  2609: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2612: goto            2462
        //  2615: astore          40
        //  2617: aload           40
        //  2619: athrow         
        //  2620: astore          23
        //  2622: aload           23
        //  2624: athrow         
        //  2625: aload_1        
        //  2626: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  2629: bipush          116
        //  2631: aaload         
        //  2632: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //  2635: astore          30
        //  2637: aload_0        
        //  2638: aload_1        
        //  2639: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  2642: bipush          101
        //  2644: aaload         
        //  2645: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //  2648: putfield        com/whatsapp/gdrive/GoogleDriveService.B:Ljava/lang/String;
        //  2651: aload           30
        //  2653: ifnonnull       2669
        //  2656: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  2659: bipush          76
        //  2661: aaload         
        //  2662: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  2665: iload_2        
        //  2666: ifeq            3023
        //  2669: aload_0        
        //  2670: aload           30
        //  2672: invokespecial   com/whatsapp/gdrive/GoogleDriveService.f:(Ljava/lang/String;)Z
        //  2675: istore          33
        //  2677: iload           33
        //  2679: istore          27
        //  2681: iload           27
        //  2683: ifne            3016
        //  2686: aload_0        
        //  2687: aload           30
        //  2689: invokespecial   com/whatsapp/gdrive/GoogleDriveService.f:(Ljava/lang/String;)Z
        //  2692: istore          37
        //  2694: iload           37
        //  2696: istore          32
        //  2698: iload           32
        //  2700: ifeq            2716
        //  2703: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  2706: bipush          118
        //  2708: aaload         
        //  2709: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  2712: iload_2        
        //  2713: ifeq            2738
        //  2716: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  2719: bipush          66
        //  2721: aaload         
        //  2722: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  2725: iload_2        
        //  2726: ifeq            2738
        //  2729: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  2732: bipush          115
        //  2734: aaload         
        //  2735: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  2738: aload_0        
        //  2739: getfield        com/whatsapp/gdrive/GoogleDriveService.e:Ljava/util/concurrent/atomic/AtomicBoolean;
        //  2742: iconst_0       
        //  2743: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //  2746: aload_0        
        //  2747: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  2750: iload           32
        //  2752: invokevirtual   com/whatsapp/gdrive/aq.c:(Z)V
        //  2755: iload_2        
        //  2756: ifeq            14
        //  2759: aload_1        
        //  2760: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  2763: bipush          79
        //  2765: aaload         
        //  2766: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //  2769: astore          19
        //  2771: aload_1        
        //  2772: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  2775: bipush          85
        //  2777: aaload         
        //  2778: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //  2781: astore          20
        //  2783: aload           19
        //  2785: ifnonnull       2941
        //  2788: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  2791: bipush          87
        //  2793: aaload         
        //  2794: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  2797: return         
        //  2798: astore          22
        //  2800: aload           22
        //  2802: athrow         
        //  2803: astore          31
        //  2805: aload           31
        //  2807: athrow         
        //  2808: astore          29
        //  2810: iconst_0       
        //  2811: istore          27
        //  2813: aload_0        
        //  2814: bipush          12
        //  2816: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.e:(I)V
        //  2819: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  2822: bipush          102
        //  2824: aaload         
        //  2825: aload           29
        //  2827: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2830: aload_0        
        //  2831: getfield        com/whatsapp/gdrive/GoogleDriveService.e:Ljava/util/concurrent/atomic/AtomicBoolean;
        //  2834: iconst_0       
        //  2835: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //  2838: aload_0        
        //  2839: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  2842: iload           27
        //  2844: invokevirtual   com/whatsapp/gdrive/aq.c:(Z)V
        //  2847: goto            2755
        //  2850: astore          39
        //  2852: aload           39
        //  2854: athrow         
        //  2855: astore          38
        //  2857: aload           38
        //  2859: athrow         
        //  2860: astore          36
        //  2862: iload           32
        //  2864: istore          27
        //  2866: aload           36
        //  2868: athrow         
        //  2869: astore          29
        //  2871: goto            2813
        //  2874: astore          28
        //  2876: iconst_0       
        //  2877: istore          27
        //  2879: aload_0        
        //  2880: bipush          11
        //  2882: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.e:(I)V
        //  2885: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  2888: bipush          81
        //  2890: aaload         
        //  2891: aload           28
        //  2893: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2896: aload_0        
        //  2897: getfield        com/whatsapp/gdrive/GoogleDriveService.e:Ljava/util/concurrent/atomic/AtomicBoolean;
        //  2900: iconst_0       
        //  2901: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //  2904: aload_0        
        //  2905: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  2908: iload           27
        //  2910: invokevirtual   com/whatsapp/gdrive/aq.c:(Z)V
        //  2913: goto            2755
        //  2916: astore          26
        //  2918: iconst_0       
        //  2919: istore          27
        //  2921: aload_0        
        //  2922: getfield        com/whatsapp/gdrive/GoogleDriveService.e:Ljava/util/concurrent/atomic/AtomicBoolean;
        //  2925: iconst_0       
        //  2926: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //  2929: aload_0        
        //  2930: getfield        com/whatsapp/gdrive/GoogleDriveService.Z:Lcom/whatsapp/gdrive/aq;
        //  2933: iload           27
        //  2935: invokevirtual   com/whatsapp/gdrive/aq.c:(Z)V
        //  2938: aload           26
        //  2940: athrow         
        //  2941: aload           20
        //  2943: ifnonnull       2955
        //  2946: getstatic       com/whatsapp/gdrive/GoogleDriveService.bb:[Ljava/lang/String;
        //  2949: bipush          104
        //  2951: aaload         
        //  2952: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  2955: aload_0        
        //  2956: aload           19
        //  2958: aload           20
        //  2960: invokespecial   com/whatsapp/gdrive/GoogleDriveService.a:(Ljava/lang/String;Ljava/lang/String;)Z
        //  2963: ifeq            14
        //  2966: return         
        //  2967: astore          21
        //  2969: aload           21
        //  2971: athrow         
        //  2972: astore          26
        //  2974: goto            2921
        //  2977: astore          35
        //  2979: iload           32
        //  2981: istore          27
        //  2983: aload           35
        //  2985: astore          26
        //  2987: goto            2921
        //  2990: astore          28
        //  2992: goto            2879
        //  2995: astore          34
        //  2997: iload           32
        //  2999: istore          27
        //  3001: aload           34
        //  3003: astore          28
        //  3005: goto            2879
        //  3008: astore          85
        //  3010: iconst_0       
        //  3011: istore          86
        //  3013: goto            1787
        //  3016: iload           27
        //  3018: istore          32
        //  3020: goto            2729
        //  3023: iconst_0       
        //  3024: istore          32
        //  3026: goto            2738
        //  3029: iconst_1       
        //  3030: istore          14
        //  3032: goto            344
        //  3035: iconst_0       
        //  3036: istore          14
        //  3038: goto            344
        //  3041: iload           9
        //  3043: istore          10
        //  3045: goto            177
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      9      15     18     Lcom/whatsapp/gdrive/br;
        //  34     43     44     49     Lcom/whatsapp/gdrive/br;
        //  49     90     128    133    Lcom/whatsapp/gdrive/br;
        //  95     108    133    138    Lcom/whatsapp/gdrive/br;
        //  113    122    123    128    Lcom/whatsapp/gdrive/br;
        //  130    133    133    138    Lcom/whatsapp/gdrive/br;
        //  135    138    123    128    Lcom/whatsapp/gdrive/br;
        //  164    168    394    399    Lcom/whatsapp/gdrive/br;
        //  177    216    399    404    Ljava/lang/NullPointerException;
        //  216    228    404    465    Lcom/whatsapp/gdrive/br;
        //  216    228    465    517    Lcom/whatsapp/gdrive/b2;
        //  216    228    399    404    Ljava/lang/NullPointerException;
        //  276    283    713    718    Lcom/whatsapp/gdrive/br;
        //  517    540    559    564    Lcom/whatsapp/gdrive/br;
        //  544    553    554    559    Lcom/whatsapp/gdrive/br;
        //  561    564    554    559    Lcom/whatsapp/gdrive/br;
        //  564    577    713    718    Lcom/whatsapp/gdrive/br;
        //  589    602    718    723    Lcom/whatsapp/gdrive/br;
        //  614    627    723    728    Lcom/whatsapp/gdrive/br;
        //  639    652    728    733    Lcom/whatsapp/gdrive/br;
        //  664    677    733    738    Lcom/whatsapp/gdrive/br;
        //  689    702    738    743    Lcom/whatsapp/gdrive/br;
        //  773    787    850    855    Lcom/whatsapp/gdrive/br;
        //  817    822    861    871    Lcom/whatsapp/gdrive/br;
        //  835    844    845    850    Lcom/whatsapp/gdrive/br;
        //  863    866    866    871    Lcom/whatsapp/gdrive/br;
        //  877    892    893    898    Lcom/whatsapp/gdrive/br;
        //  898    913    914    919    Lcom/whatsapp/gdrive/br;
        //  919    938    939    944    Lcom/whatsapp/gdrive/br;
        //  944    956    1109   1114   Lcom/whatsapp/gdrive/br;
        //  961    966    1109   1114   Lcom/whatsapp/gdrive/br;
        //  971    976    1114   1119   Lcom/whatsapp/gdrive/br;
        //  982    986    1119   1124   Lcom/whatsapp/gdrive/br;
        //  990    998    1124   1129   Lcom/whatsapp/gdrive/br;
        //  1022   1029   1129   1134   Lcom/whatsapp/gdrive/br;
        //  1034   1041   1134   1144   Lcom/whatsapp/gdrive/br;
        //  1053   1103   1104   1109   Lcom/whatsapp/gdrive/br;
        //  1111   1114   1114   1119   Lcom/whatsapp/gdrive/br;
        //  1116   1119   1119   1124   Lcom/whatsapp/gdrive/br;
        //  1121   1124   1124   1129   Lcom/whatsapp/gdrive/br;
        //  1131   1134   1134   1144   Lcom/whatsapp/gdrive/br;
        //  1136   1139   1139   1144   Lcom/whatsapp/gdrive/br;
        //  1161   1175   3008   3016   Any
        //  1202   1218   1254   1259   Lcom/whatsapp/gdrive/br;
        //  1222   1230   1259   1264   Lcom/whatsapp/gdrive/br;
        //  1230   1237   1249   1254   Lcom/whatsapp/gdrive/br;
        //  1241   1248   1249   1254   Lcom/whatsapp/gdrive/br;
        //  1256   1259   1259   1264   Lcom/whatsapp/gdrive/br;
        //  1264   1271   3008   3016   Any
        //  1271   1277   1686   1711   Lcom/whatsapp/gdrive/br;
        //  1271   1277   1711   1736   Lcom/whatsapp/gdrive/bc;
        //  1271   1277   1736   1761   Lcom/whatsapp/gdrive/be;
        //  1271   1277   3008   3016   Any
        //  1286   1311   1761   1766   Lcom/whatsapp/gdrive/br;
        //  1286   1311   1781   1787   Any
        //  1315   1320   1766   1771   Lcom/whatsapp/gdrive/br;
        //  1315   1320   1781   1787   Any
        //  1325   1334   1771   1776   Lcom/whatsapp/gdrive/br;
        //  1325   1334   1781   1787   Any
        //  1340   1377   1776   1781   Lcom/whatsapp/gdrive/br;
        //  1340   1377   1781   1787   Any
        //  1377   1404   1873   1878   Lcom/whatsapp/gdrive/br;
        //  1409   1417   1873   1878   Lcom/whatsapp/gdrive/br;
        //  1422   1429   1878   1883   Lcom/whatsapp/gdrive/br;
        //  1433   1442   1883   1888   Lcom/whatsapp/gdrive/br;
        //  1442   1449   1888   1893   Lcom/whatsapp/gdrive/br;
        //  1453   1460   1888   1893   Lcom/whatsapp/gdrive/br;
        //  1525   1530   1918   1988   Lcom/whatsapp/gdrive/br;
        //  1525   1530   1988   2058   Lcom/whatsapp/gdrive/bc;
        //  1525   1530   2058   2128   Lcom/whatsapp/gdrive/be;
        //  1525   1530   2128   2186   Any
        //  1547   1554   1913   1918   Lcom/whatsapp/gdrive/br;
        //  1558   1567   1913   1918   Lcom/whatsapp/gdrive/br;
        //  1573   1586   2186   2191   Lcom/whatsapp/gdrive/br;
        //  1590   1595   2186   2191   Lcom/whatsapp/gdrive/br;
        //  1600   1608   2191   2196   Lcom/whatsapp/gdrive/br;
        //  1612   1621   2196   2201   Lcom/whatsapp/gdrive/br;
        //  1626   1635   2201   2206   Lcom/whatsapp/gdrive/br;
        //  1639   1650   2206   2218   Any
        //  1661   1666   2218   2223   Lcom/whatsapp/gdrive/br;
        //  1671   1680   1681   1686   Lcom/whatsapp/gdrive/br;
        //  1688   1705   3008   3016   Any
        //  1713   1730   3008   3016   Any
        //  1738   1755   3008   3016   Any
        //  1763   1766   1766   1771   Lcom/whatsapp/gdrive/br;
        //  1763   1766   1781   1787   Any
        //  1768   1771   1771   1776   Lcom/whatsapp/gdrive/br;
        //  1768   1771   1781   1787   Any
        //  1773   1776   1776   1781   Lcom/whatsapp/gdrive/br;
        //  1773   1776   1781   1787   Any
        //  1778   1781   1781   1787   Any
        //  1787   1814   1893   1898   Lcom/whatsapp/gdrive/br;
        //  1819   1827   1893   1898   Lcom/whatsapp/gdrive/br;
        //  1832   1839   1898   1903   Lcom/whatsapp/gdrive/br;
        //  1843   1852   1903   1908   Lcom/whatsapp/gdrive/br;
        //  1852   1859   1908   1913   Lcom/whatsapp/gdrive/br;
        //  1863   1870   1908   1913   Lcom/whatsapp/gdrive/br;
        //  1875   1878   1878   1883   Lcom/whatsapp/gdrive/br;
        //  1880   1883   1883   1888   Lcom/whatsapp/gdrive/br;
        //  1895   1898   1898   1903   Lcom/whatsapp/gdrive/br;
        //  1900   1903   1903   1908   Lcom/whatsapp/gdrive/br;
        //  1920   1937   2128   2186   Any
        //  1954   1961   1983   1988   Lcom/whatsapp/gdrive/br;
        //  1965   1974   1983   1988   Lcom/whatsapp/gdrive/br;
        //  1990   2007   2128   2186   Any
        //  2024   2031   2053   2058   Lcom/whatsapp/gdrive/br;
        //  2035   2044   2053   2058   Lcom/whatsapp/gdrive/br;
        //  2060   2077   2128   2186   Any
        //  2094   2101   2123   2128   Lcom/whatsapp/gdrive/br;
        //  2105   2114   2123   2128   Lcom/whatsapp/gdrive/br;
        //  2130   2154   2176   2181   Lcom/whatsapp/gdrive/br;
        //  2158   2167   2181   2186   Lcom/whatsapp/gdrive/br;
        //  2178   2181   2181   2186   Lcom/whatsapp/gdrive/br;
        //  2188   2191   2191   2196   Lcom/whatsapp/gdrive/br;
        //  2193   2196   2196   2201   Lcom/whatsapp/gdrive/br;
        //  2198   2201   2201   2206   Lcom/whatsapp/gdrive/br;
        //  2220   2223   1681   1686   Lcom/whatsapp/gdrive/br;
        //  2223   2242   2512   2517   Lcom/whatsapp/gdrive/br;
        //  2275   2290   2544   2556   Any
        //  2290   2296   2522   2544   Lcom/whatsapp/gdrive/br;
        //  2290   2296   2566   2588   Lcom/whatsapp/gdrive/bc;
        //  2290   2296   2593   2615   Lcom/whatsapp/gdrive/be;
        //  2290   2296   2544   2556   Any
        //  2301   2318   2517   2522   Lcom/whatsapp/gdrive/br;
        //  2301   2318   2566   2588   Lcom/whatsapp/gdrive/bc;
        //  2301   2318   2593   2615   Lcom/whatsapp/gdrive/be;
        //  2301   2318   2544   2556   Any
        //  2318   2336   2556   2561   Lcom/whatsapp/gdrive/br;
        //  2318   2336   2566   2588   Lcom/whatsapp/gdrive/bc;
        //  2318   2336   2593   2615   Lcom/whatsapp/gdrive/be;
        //  2318   2336   2544   2556   Any
        //  2340   2351   2561   2566   Lcom/whatsapp/gdrive/br;
        //  2340   2351   2566   2588   Lcom/whatsapp/gdrive/bc;
        //  2340   2351   2593   2615   Lcom/whatsapp/gdrive/be;
        //  2340   2351   2544   2556   Any
        //  2351   2356   2522   2544   Lcom/whatsapp/gdrive/br;
        //  2351   2356   2566   2588   Lcom/whatsapp/gdrive/bc;
        //  2351   2356   2593   2615   Lcom/whatsapp/gdrive/be;
        //  2351   2356   2544   2556   Any
        //  2356   2442   2588   2593   Lcom/whatsapp/gdrive/br;
        //  2356   2442   2566   2588   Lcom/whatsapp/gdrive/bc;
        //  2356   2442   2593   2615   Lcom/whatsapp/gdrive/be;
        //  2356   2442   2544   2556   Any
        //  2442   2462   2522   2544   Lcom/whatsapp/gdrive/br;
        //  2442   2462   2566   2588   Lcom/whatsapp/gdrive/bc;
        //  2442   2462   2593   2615   Lcom/whatsapp/gdrive/be;
        //  2442   2462   2544   2556   Any
        //  2473   2478   2615   2620   Lcom/whatsapp/gdrive/br;
        //  2482   2492   2620   2625   Lcom/whatsapp/gdrive/br;
        //  2497   2506   2507   2512   Lcom/whatsapp/gdrive/br;
        //  2519   2522   2522   2544   Lcom/whatsapp/gdrive/br;
        //  2519   2522   2566   2588   Lcom/whatsapp/gdrive/bc;
        //  2519   2522   2593   2615   Lcom/whatsapp/gdrive/be;
        //  2519   2522   2544   2556   Any
        //  2524   2541   2544   2556   Any
        //  2558   2561   2561   2566   Lcom/whatsapp/gdrive/br;
        //  2558   2561   2566   2588   Lcom/whatsapp/gdrive/bc;
        //  2558   2561   2593   2615   Lcom/whatsapp/gdrive/be;
        //  2558   2561   2544   2556   Any
        //  2563   2566   2522   2544   Lcom/whatsapp/gdrive/br;
        //  2563   2566   2566   2588   Lcom/whatsapp/gdrive/bc;
        //  2563   2566   2593   2615   Lcom/whatsapp/gdrive/be;
        //  2563   2566   2544   2556   Any
        //  2568   2585   2544   2556   Any
        //  2590   2593   2522   2544   Lcom/whatsapp/gdrive/br;
        //  2590   2593   2566   2588   Lcom/whatsapp/gdrive/bc;
        //  2590   2593   2593   2615   Lcom/whatsapp/gdrive/be;
        //  2590   2593   2544   2556   Any
        //  2595   2612   2544   2556   Any
        //  2617   2620   2620   2625   Lcom/whatsapp/gdrive/br;
        //  2622   2625   2507   2512   Lcom/whatsapp/gdrive/br;
        //  2625   2637   2808   2813   Lcom/whatsapp/gdrive/br;
        //  2625   2637   2874   2879   Lcom/whatsapp/gdrive/bc;
        //  2625   2637   2916   2921   Any
        //  2637   2651   2803   2808   Lcom/whatsapp/gdrive/br;
        //  2637   2651   2874   2879   Lcom/whatsapp/gdrive/bc;
        //  2637   2651   2916   2921   Any
        //  2656   2665   2803   2808   Lcom/whatsapp/gdrive/br;
        //  2656   2665   2874   2879   Lcom/whatsapp/gdrive/bc;
        //  2656   2665   2916   2921   Any
        //  2669   2677   2808   2813   Lcom/whatsapp/gdrive/br;
        //  2669   2677   2874   2879   Lcom/whatsapp/gdrive/bc;
        //  2669   2677   2916   2921   Any
        //  2686   2694   2869   2874   Lcom/whatsapp/gdrive/br;
        //  2686   2694   2990   2995   Lcom/whatsapp/gdrive/bc;
        //  2686   2694   2972   2977   Any
        //  2703   2712   2850   2855   Lcom/whatsapp/gdrive/br;
        //  2703   2712   2995   3008   Lcom/whatsapp/gdrive/bc;
        //  2703   2712   2977   2990   Any
        //  2716   2725   2855   2860   Lcom/whatsapp/gdrive/br;
        //  2716   2725   2995   3008   Lcom/whatsapp/gdrive/bc;
        //  2716   2725   2977   2990   Any
        //  2729   2738   2860   2869   Lcom/whatsapp/gdrive/br;
        //  2729   2738   2995   3008   Lcom/whatsapp/gdrive/bc;
        //  2729   2738   2977   2990   Any
        //  2788   2797   2798   2803   Lcom/whatsapp/gdrive/br;
        //  2805   2808   2808   2813   Lcom/whatsapp/gdrive/br;
        //  2805   2808   2874   2879   Lcom/whatsapp/gdrive/bc;
        //  2805   2808   2916   2921   Any
        //  2813   2830   2972   2977   Any
        //  2852   2855   2855   2860   Lcom/whatsapp/gdrive/br;
        //  2852   2855   2995   3008   Lcom/whatsapp/gdrive/bc;
        //  2852   2855   2977   2990   Any
        //  2857   2860   2860   2869   Lcom/whatsapp/gdrive/br;
        //  2857   2860   2995   3008   Lcom/whatsapp/gdrive/bc;
        //  2857   2860   2977   2990   Any
        //  2866   2869   2869   2874   Lcom/whatsapp/gdrive/br;
        //  2866   2869   2990   2995   Lcom/whatsapp/gdrive/bc;
        //  2866   2869   2972   2977   Any
        //  2879   2896   2972   2977   Any
        //  2946   2955   2967   2972   Lcom/whatsapp/gdrive/br;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:3035)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
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
    
    public long r() {
        return this.b;
    }
    
    public long s() {
        return this.R.get();
    }
    
    void t() {
        this.k = null;
        this.L = null;
        this.P = null;
    }
}
