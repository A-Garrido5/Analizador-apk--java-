// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.ServiceConnection;
import android.os.Bundle;
import android.content.Intent;
import java.util.EnumSet;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import android.content.Context;
import android.os.Handler;
import java.util.Map;
import android.os.HandlerThread;

public class o6 extends HandlerThread
{
    private static final a85 j;
    private static final String[] z;
    private Map a;
    private boolean b;
    private Handler c;
    private Context d;
    private ArrayList e;
    private t7 f;
    private ArrayList g;
    private Map h;
    private String i;
    private Map k;
    private boolean l;
    private int m;
    
    static {
        final String[] z2 = new String[69];
        String s = "t\u001c].rh\nK!~i\u001dK";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1757:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '=';
                        break;
                    }
                    case 0: {
                        c2 = '&';
                        break;
                    }
                    case 1: {
                        c2 = 'Y';
                        break;
                    }
                    case 2: {
                        c2 = '\u000e';
                        break;
                    }
                    case 3: {
                        c2 = '~';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t+k\rMI7}\u001b\u0010E6j\u001b\u0012H,b\u0012\u0012I2";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "s7k\u0006MC:z\u001bY\u0006-w\u000eX\u0006?a\f\u001dO7z\u001bSRy|\u001bNV6`\rX\u0006:a\u001aX\u001cy";
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    s = "O7o\u000eM";
                    n = 2;
                    array = z2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t;g\u0012QO7iSNS)~\u0011OR<j";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t+k\u001aXC4#\u000eHT:f\u001fNCy";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t:a\u0010NS4kQXT+a\f\u001dT<}\u000eRH*kC";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t:a\u0010NS4kQNS:m\u001bNU";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t:a\u0010NS4kQII2k\u0010\u0010O7x\u001fQO=";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u0006-a\u0015XHd";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t:a\u0010NS4kQNS:m\u001bNUt`\u0011I\u000b6y\u0010XB";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t:a\u0010NS4k^NM,3";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t:a\u0010NS4kQXT+a\f";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t>k\n\u0010U2{SYC-o\u0017QUy|\u001bNV6`\rX\u001b";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    s = "b\u001cZ?tj\nQ2tu\r";
                    n = 13;
                    n2 = 14;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    array = z2;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t>k\n\u0010U2{SYC-o\u0017QUv`\u000bQJ";
                    n = 14;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t>k\n\u0010U2{SYC-o\u0017QUvk\fOI+.";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "O7o\u000eM";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "o\rK3bo\u001dQ2tu\r";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t>k\n\u0010U2{SYC-o\u0017QUv`\u000eX";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t>k\n\u0010U2{SYC-o\u0017QUvc\u0017NU0`\u0019\u0010M<w^YC-o\u0017QUd";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "b\u001cZ?tj\nQ2tu\r";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t0}S_O5b\u0017SAt}\u000bMV6|\nXBy";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "s\n*N\u0013\u001f`";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "s\n*L\u0013\u0010n";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t)o\u001dVG>kSSG4kQSS5b";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "V8w\u0013XH-";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "s\n*M\u0013\u0011h";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "E6cPJN8z\r\\V)";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "H,b\u0012\u001dV8m\u0015\\A<.\u0010\\K<";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "t\u001c].rh\nK!~i\u001dK";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "\u0006*g\u0019SG-{\fX\u001b";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t){\f^N8}\u001b\u0012U0i\u0010\\R,|\u001b\u0012P<|\u0017[O<j";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t){\f^N8}\u001b\u0012U0i\u0010\\R,|\u001b\u0012@8g\u0012XBy}\u0015H\u001b";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "o\u0017O.my\u001dO*|y\nG9sg\r[,x";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "\u00060`\nXH-3";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "\u0006<v\nOG*3";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t:o\u0010^C5k\u001a";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t6`S\\E-g\bTR #\fXU,b\n\u001dT<}\u000eRH*kC";
                    n = 37;
                    n2 = 38;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    array = z2;
                    s = "o\u0017O.my\t[,~n\u0018];bb\u0018Z?";
                    n = 38;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t*{\u001d^C*}^YG-oC";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t8m\nTP0z\u0007\u0010T<}\u000bQRy|\u001bNS5zC";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t6`S\\E-g\bTR #\fXU,b\n\u001dO7z\u001bSRd`\u000bQJ";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t<|\fRTv{\u0010VH6y\u0010";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t6`SQI6~\u001bO\u000b)|\u001bMG+k\u001a";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t*k\fKO:kQYO*m\u0011SH<m\n";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t*k\fKO:kQYO*m\u0011SH<m\n\u0012C!m\u001bMR0a\u0010\u001d";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "E6cP\\H=|\u0011TBwx\u001bSB0`\u0019";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "E6cP\\H=|\u0011TBwx\u001bSB0`\u0019\u0013D0b\u0012TH> 7Sg)~<TJ5g\u0010Zu<|\bTE< <th\u001d";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t>k\n\u0010V,|\u001dUG*k\r\u0012D8jSOC*~\u0011SU<";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "o\u0017O.my\t[,~n\u0018];bo\rK3bj\u0010]*";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "o\u0017O.my\u001dO*|y\nG9sg\r[,xy\u0015G-i";
                    n = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "o\u0017O.my\t[,~n\u0018];bb\u0018Z?bj\u0010]*";
                    n = 51;
                    array = z2;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t<c\u000eI_tz\u0011VC7";
                    n = 52;
                    array = z2;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t({\u001bO_t~\u000bOE1o\rXUvx\u001bOO?g\u001d\\R0a\u0010\u0010@8g\u0012XBy~\u000bOE1o\rX\u001b";
                    n = 53;
                    array = z2;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    s = "\u0006){\f^N8}\u001b\u0000";
                    n = 54;
                    array = z2;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t)|\u0011^C*}SMS+m\u0016\\U<}QOC=k\u001bP\u000b){\f^N8}\u001b\u001d";
                    n = 55;
                    array = z2;
                    continue;
                }
                case 55: {
                    array[n2] = intern;
                    n2 = 57;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t>k\n\u0010V,|\u001dUG*k\r\u0012H,b\u0012";
                    n = 56;
                    array = z2;
                    continue;
                }
                case 56: {
                    array[n2] = intern;
                    n2 = 58;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t>k\n\u0010V,|\u001dUG*k\r\u0012T<}\u000eRH*kD\u001d";
                    n = 57;
                    array = z2;
                    continue;
                }
                case 57: {
                    array[n2] = intern;
                    n2 = 59;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t){\f^N8}\u001b\u001d";
                    n = 58;
                    array = z2;
                    continue;
                }
                case 58: {
                    array[n2] = intern;
                    n2 = 60;
                    s = "o\u0017O.my\t[,~n\u0018];bo\rK3bj\u0010]*";
                    n = 59;
                    array = z2;
                    continue;
                }
                case 59: {
                    array[n2] = intern;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t)|\u0011^C*}SMS+m\u0016\\U<}^NM,3";
                    n = 60;
                    n2 = 61;
                    array = z2;
                    continue;
                }
                case 60: {
                    array[n2] = intern;
                    n2 = 62;
                    array = z2;
                    s = "O7o\u000eM";
                    n = 61;
                    continue;
                }
                case 61: {
                    array[n2] = intern;
                    n2 = 63;
                    s = "o\u0017O.my\u001dO*|y\nG9sg\r[,xy\u0015G-i";
                    n = 62;
                    array = z2;
                    continue;
                }
                case 62: {
                    array[n2] = intern;
                    n2 = 64;
                    s = "V8w\u0013XH-#\u0013\\H8i\u001bO\t>k\n\u0010V,|\u001dUG*k\r\u001dT<}\u000eRH*kC";
                    n = 63;
                    array = z2;
                    continue;
                }
                case 63: {
                    array[n2] = intern;
                    n2 = 65;
                    s = "\u0006*g\u0019SG-{\fX\u001b";
                    n = 64;
                    array = z2;
                    continue;
                }
                case 64: {
                    array[n2] = intern;
                    n2 = 66;
                    s = "o\u0017O.my\t[,~n\u0018];bb\u0018Z?bj\u0010]*";
                    n = 65;
                    array = z2;
                    continue;
                }
                case 65: {
                    array[n2] = intern;
                    n2 = 67;
                    s = "\u0006*g\u0019SG-{\fX\u001b";
                    n = 66;
                    array = z2;
                    continue;
                }
                case 66: {
                    array[n2] = intern;
                    n2 = 68;
                    s = "o\u0017O.my\u001aA0io\u0017[?io\u0016@!ii\u0012K0";
                    n = 67;
                    array = z2;
                    continue;
                }
                case 67: {
                    break Label_1757;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        j = new a85(null);
    }
    
    public o6(final Context context) {
        super(o6.z[26], 10);
        this.g = new ArrayList(3);
        this.a = new ConcurrentHashMap();
        this.h = new HashMap();
        this.k = new HashMap();
        this.e = new ArrayList();
        this.m = 2;
        this.b = false;
        this.l = false;
        this.g.add("1");
        this.g.add("3");
        this.g.add("5");
        this.h.put("1", o6.z[23]);
        this.h.put("3", o6.z[24]);
        this.h.put("5", o6.z[27]);
        this.d = context.getApplicationContext();
        this.i = context.getPackageName();
        if (this.i == null) {
            Log.e(o6.z[25]);
            App.a(o6.z[29], false, f8.CRASH, null);
            this.i = o6.z[28];
        }
    }
    
    private int a(final Intent intent) {
        return this.a(intent.getExtras().get(o6.z[0]));
    }
    
    private int a(final Bundle bundle) {
        return this.a(bundle.get(o6.z[30]));
    }
    
    static int a(final o6 o6, final int m) {
        return o6.m = m;
    }
    
    static int a(final o6 o6, final Bundle bundle) {
        return o6.a(bundle);
    }
    
    private int a(final Object o) {
        if (o == null) {
            try {
                Log.e(o6.z[1]);
                return 0;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
        try {
            if (o instanceof Integer) {
                return (int)o;
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        try {
            if (o instanceof Long) {
                return (int)(long)o;
            }
        }
        catch (RuntimeException ex3) {
            throw ex3;
        }
        throw new RuntimeException(o6.z[2] + o.getClass().getName());
    }
    
    static t7 a(final o6 o6, final t7 f) {
        return o6.f = f;
    }
    
    static String a(final o6 o6) {
        return o6.i;
    }
    
    private void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //     3: bipush          45
        //     5: aaload         
        //     6: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //     9: aload_0        
        //    10: getfield        com/whatsapp/o6.f:Lcom/whatsapp/t7;
        //    13: astore_3       
        //    14: aload_3        
        //    15: ifnull          67
        //    18: aload_0        
        //    19: getfield        com/whatsapp/o6.f:Lcom/whatsapp/t7;
        //    22: getfield        com/whatsapp/t7.b:Landroid/content/ServiceConnection;
        //    25: astore          4
        //    27: aload           4
        //    29: ifnull          62
        //    32: aload_0        
        //    33: getfield        com/whatsapp/o6.d:Landroid/content/Context;
        //    36: aload_0        
        //    37: getfield        com/whatsapp/o6.f:Lcom/whatsapp/t7;
        //    40: getfield        com/whatsapp/t7.b:Landroid/content/ServiceConnection;
        //    43: invokevirtual   android/content/Context.unbindService:(Landroid/content/ServiceConnection;)V
        //    46: aload_0        
        //    47: getfield        com/whatsapp/o6.f:Lcom/whatsapp/t7;
        //    50: aconst_null    
        //    51: putfield        com/whatsapp/t7.b:Landroid/content/ServiceConnection;
        //    54: aload_0        
        //    55: getfield        com/whatsapp/o6.f:Lcom/whatsapp/t7;
        //    58: aconst_null    
        //    59: putfield        com/whatsapp/t7.c:Lcom/android/vending/billing/IInAppBillingService;
        //    62: aload_0        
        //    63: aconst_null    
        //    64: putfield        com/whatsapp/o6.f:Lcom/whatsapp/t7;
        //    67: aload_0        
        //    68: iconst_2       
        //    69: putfield        com/whatsapp/o6.m:I
        //    72: return         
        //    73: astore_1       
        //    74: aload_1        
        //    75: athrow         
        //    76: astore_2       
        //    77: aload_2        
        //    78: athrow         
        //    79: astore          5
        //    81: new             Ljava/lang/StringBuilder;
        //    84: dup            
        //    85: invokespecial   java/lang/StringBuilder.<init>:()V
        //    88: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //    91: bipush          46
        //    93: aaload         
        //    94: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    97: aload           5
        //    99: invokevirtual   java/lang/IllegalArgumentException.toString:()Ljava/lang/String;
        //   102: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   105: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   108: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   111: goto            46
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      14     73     76     Ljava/lang/IllegalArgumentException;
        //  18     27     73     76     Ljava/lang/IllegalArgumentException;
        //  18     27     76     79     Ljava/lang/NullPointerException;
        //  32     46     79     114    Ljava/lang/IllegalArgumentException;
        //  32     46     76     79     Ljava/lang/NullPointerException;
        //  74     76     76     79     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 56, Size: 56
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
    
    static void a(final o6 o6, final Runnable runnable) {
        o6.a(runnable);
    }
    
    static void a(final o6 o6, final ArrayList list) {
        o6.a(list);
    }
    
    private void a(final Runnable runnable) {
        this.d.bindService(new Intent(o6.z[48]).setPackage(o6.z[47]), (ServiceConnection)new m_(this, runnable), 1);
    }
    
    private void a(final ArrayList p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: new             Landroid/os/Bundle;
        //     7: dup            
        //     8: invokespecial   android/os/Bundle.<init>:()V
        //    11: astore_3       
        //    12: aload_3        
        //    13: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //    16: bipush          18
        //    18: aaload         
        //    19: aload_1        
        //    20: invokevirtual   android/os/Bundle.putStringArrayList:(Ljava/lang/String;Ljava/util/ArrayList;)V
        //    23: aload_0        
        //    24: getfield        com/whatsapp/o6.f:Lcom/whatsapp/t7;
        //    27: getfield        com/whatsapp/t7.c:Lcom/android/vending/billing/IInAppBillingService;
        //    30: iconst_3       
        //    31: aload_0        
        //    32: getfield        com/whatsapp/o6.i:Ljava/lang/String;
        //    35: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //    38: bipush          17
        //    40: aaload         
        //    41: aload_3        
        //    42: invokeinterface com/android/vending/billing/IInAppBillingService.getSkuDetails:(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
        //    47: astore          5
        //    49: aload           5
        //    51: ifnonnull       81
        //    54: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //    57: bipush          15
        //    59: aaload         
        //    60: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    63: return         
        //    64: astore          4
        //    66: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //    69: bipush          19
        //    71: aaload         
        //    72: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    75: return         
        //    76: astore          14
        //    78: aload           14
        //    80: athrow         
        //    81: aload_0        
        //    82: aload           5
        //    84: invokespecial   com/whatsapp/o6.a:(Landroid/os/Bundle;)I
        //    87: istore          6
        //    89: iload           6
        //    91: lookupswitch {
        //                0: 187
        //                6: 156
        //          default: 116
        //        }
        //   116: new             Ljava/lang/StringBuilder;
        //   119: dup            
        //   120: invokespecial   java/lang/StringBuilder.<init>:()V
        //   123: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //   126: bipush          13
        //   128: aaload         
        //   129: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   132: iload           6
        //   134: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   137: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   140: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   143: new             Ljava/lang/IllegalStateException;
        //   146: dup            
        //   147: invokespecial   java/lang/IllegalStateException.<init>:()V
        //   150: athrow         
        //   151: astore          12
        //   153: aload           12
        //   155: athrow         
        //   156: new             Ljava/lang/StringBuilder;
        //   159: dup            
        //   160: invokespecial   java/lang/StringBuilder.<init>:()V
        //   163: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //   166: bipush          16
        //   168: aaload         
        //   169: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   172: aload           5
        //   174: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   177: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   180: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   183: iload_2        
        //   184: ifeq            63
        //   187: aload           5
        //   189: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //   192: bipush          21
        //   194: aaload         
        //   195: invokevirtual   android/os/Bundle.containsKey:(Ljava/lang/String;)Z
        //   198: ifne            246
        //   201: new             Ljava/lang/StringBuilder;
        //   204: dup            
        //   205: invokespecial   java/lang/StringBuilder.<init>:()V
        //   208: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //   211: bipush          20
        //   213: aaload         
        //   214: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   217: aload           5
        //   219: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   222: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   225: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   228: new             Ljava/lang/IllegalStateException;
        //   231: dup            
        //   232: invokespecial   java/lang/IllegalStateException.<init>:()V
        //   235: athrow         
        //   236: astore          7
        //   238: aload           7
        //   240: athrow         
        //   241: astore          13
        //   243: aload           13
        //   245: athrow         
        //   246: aload           5
        //   248: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //   251: bipush          14
        //   253: aaload         
        //   254: invokevirtual   android/os/Bundle.getStringArrayList:(Ljava/lang/String;)Ljava/util/ArrayList;
        //   257: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   260: astore          8
        //   262: aload           8
        //   264: invokeinterface java/util/Iterator.hasNext:()Z
        //   269: ifeq            332
        //   272: new             Lcom/whatsapp/x2;
        //   275: dup            
        //   276: aload           8
        //   278: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   283: checkcast       Ljava/lang/String;
        //   286: invokespecial   com/whatsapp/x2.<init>:(Ljava/lang/String;)V
        //   289: astore          9
        //   291: aload_0        
        //   292: getfield        com/whatsapp/o6.k:Ljava/util/Map;
        //   295: aload           9
        //   297: invokevirtual   com/whatsapp/x2.a:()Ljava/lang/String;
        //   300: aload           9
        //   302: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   307: pop            
        //   308: aload_0        
        //   309: getfield        com/whatsapp/o6.h:Ljava/util/Map;
        //   312: aload           9
        //   314: invokevirtual   com/whatsapp/x2.a:()Ljava/lang/String;
        //   317: aload           9
        //   319: invokevirtual   com/whatsapp/x2.b:()Ljava/lang/String;
        //   322: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   327: pop            
        //   328: iload_2        
        //   329: ifeq            262
        //   332: iload_2        
        //   333: ifeq            63
        //   336: goto            116
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  23     49     64     76     Ljava/lang/NullPointerException;
        //  54     63     76     81     Ljava/lang/NullPointerException;
        //  116    151    151    156    Ljava/lang/NullPointerException;
        //  156    183    241    246    Ljava/lang/NullPointerException;
        //  187    236    236    241    Ljava/lang/NullPointerException;
        //  243    246    236    241    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0063:
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
    
    static t7 b(final o6 o6) {
        return o6.f;
    }
    
    private void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_3       
        //     1: istore_1       
        //     2: aload_0        
        //     3: getfield        com/whatsapp/o6.f:Lcom/whatsapp/t7;
        //     6: getfield        com/whatsapp/t7.c:Lcom/android/vending/billing/IInAppBillingService;
        //     9: iconst_3       
        //    10: aload_0        
        //    11: getfield        com/whatsapp/o6.i:Ljava/lang/String;
        //    14: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //    17: iconst_3       
        //    18: aaload         
        //    19: invokeinterface com/android/vending/billing/IInAppBillingService.isBillingSupported:(ILjava/lang/String;Ljava/lang/String;)I
        //    24: istore          5
        //    26: iload           5
        //    28: istore_1       
        //    29: aload_0        
        //    30: monitorenter   
        //    31: aload_0        
        //    32: iconst_1       
        //    33: putfield        com/whatsapp/o6.b:Z
        //    36: iload_1        
        //    37: ifne            65
        //    40: iconst_1       
        //    41: istore          4
        //    43: aload_0        
        //    44: iload           4
        //    46: putfield        com/whatsapp/o6.l:Z
        //    49: aload_0        
        //    50: monitorexit    
        //    51: return         
        //    52: astore_2       
        //    53: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //    56: iconst_4       
        //    57: aaload         
        //    58: aload_2        
        //    59: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    62: goto            29
        //    65: iconst_0       
        //    66: istore          4
        //    68: goto            43
        //    71: astore_3       
        //    72: aload_0        
        //    73: monitorexit    
        //    74: aload_3        
        //    75: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                    
        //  -----  -----  -----  -----  ----------------------------------------
        //  2      26     52     65     Ljava/lang/IncompatibleClassChangeError;
        //  31     36     71     76     Any
        //  43     51     71     76     Any
        //  72     74     71     76     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0043:
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
    
    static int c(final o6 o6) {
        return o6.m;
    }
    
    static void d(final o6 o6) {
        o6.a();
    }
    
    static Handler e(final o6 o6) {
        return o6.c;
    }
    
    static ArrayList f(final o6 o6) {
        return o6.g;
    }
    
    static a85 g() {
        return o6.j;
    }
    
    static void g(final o6 o6) {
        o6.b();
    }
    
    public String a(final String s) {
        final String s2 = this.h.get(s);
        if (s2 == null) {
            try {
                throw new IllegalStateException();
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
        return s2;
    }
    
    public void a(final int n, final Intent intent) {
    Label_0394:
        while (true) {
            final boolean i = App.I;
            while (true) {
                Label_0381: {
                    try {
                        Log.i(o6.z[41] + n + o6.z[35] + intent);
                        switch (n) {
                            default: {
                                try {
                                    throw new IllegalStateException();
                                }
                                catch (RuntimeException ex) {
                                    throw ex;
                                }
                            }
                            case -1: {
                                if (intent != null) {
                                    break;
                                }
                                try {
                                    throw new IllegalStateException(o6.z[42]);
                                }
                                catch (RuntimeException ex2) {
                                    throw ex2;
                                }
                                break;
                            }
                            case 0: {
                                break Label_0381;
                            }
                        }
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                    final int a = this.a(intent);
                    while (true) {
                        switch (a) {
                            case 0: {
                                final String stringExtra = intent.getStringExtra(o6.z[39]);
                                final String stringExtra2 = intent.getStringExtra(o6.z[34]);
                                Label_0288: {
                                    try {
                                        Log.i(o6.z[40] + stringExtra + o6.z[31] + stringExtra2 + o6.z[36] + intent.getExtras());
                                        if (stringExtra != null) {
                                            if (stringExtra2 != null) {
                                                break Label_0288;
                                            }
                                        }
                                        try {
                                            throw new IllegalStateException(o6.z[43]);
                                        }
                                        catch (RuntimeException ex4) {
                                            throw ex4;
                                        }
                                    }
                                    catch (RuntimeException ex5) {
                                        throw ex5;
                                    }
                                }
                                final g2 g2 = new g2(stringExtra, stringExtra2);
                                final String c = g2.c();
                                try {
                                    if (!ja.a(a6c.l, stringExtra, stringExtra2)) {
                                        throw new IllegalStateException(o6.z[33] + c);
                                    }
                                }
                                catch (RuntimeException ex6) {
                                    throw ex6;
                                }
                                Log.i(o6.z[32]);
                                this.a(g2);
                                if (i) {
                                    break;
                                }
                                if (i) {
                                    break Label_0381;
                                }
                                break Label_0394;
                            }
                        }
                        try {
                            throw new IllegalStateException(o6.z[38] + a);
                        }
                        catch (RuntimeException ex7) {
                            throw ex7;
                        }
                        continue;
                    }
                }
                Log.i(o6.z[37]);
                if (!i) {
                    break;
                }
                continue;
            }
        }
    }
    
    public void a(final g2 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //    10: iconst_5       
        //    11: aaload         
        //    12: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    15: aload_1        
        //    16: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    19: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    22: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    25: aload_1        
        //    26: invokevirtual   com/whatsapp/g2.d:()Ljava/lang/String;
        //    29: astore_2       
        //    30: aload_1        
        //    31: invokevirtual   com/whatsapp/g2.b:()Ljava/lang/String;
        //    34: astore_3       
        //    35: aload_2        
        //    36: ifnull          104
        //    39: aload_2        
        //    40: invokevirtual   java/lang/String.length:()I
        //    43: istore          6
        //    45: iload           6
        //    47: ifle            104
        //    50: aload_3        
        //    51: ifnull          104
        //    54: aload_3        
        //    55: invokevirtual   java/lang/String.length:()I
        //    58: istore          7
        //    60: iload           7
        //    62: ifle            104
        //    65: aload_2        
        //    66: invokevirtual   java/lang/String.getBytes:()[B
        //    69: astore          8
        //    71: aload_3        
        //    72: iconst_0       
        //    73: invokestatic    android/backport/util/Base64.decode:(Ljava/lang/String;I)[B
        //    76: astore          9
        //    78: getstatic       com/whatsapp/o6.j:Lcom/whatsapp/a85;
        //    81: invokevirtual   com/whatsapp/a85.a:()V
        //    84: aload_0        
        //    85: getfield        com/whatsapp/o6.a:Ljava/util/Map;
        //    88: aload           8
        //    90: aload_1        
        //    91: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    96: pop            
        //    97: aload           8
        //    99: aload           9
        //   101: invokestatic    com/whatsapp/App.b:([B[B)V
        //   104: return         
        //   105: astore          4
        //   107: aload           4
        //   109: athrow         
        //   110: astore          5
        //   112: aload           5
        //   114: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  39     45     105    110    Ljava/lang/RuntimeException;
        //  54     60     110    115    Ljava/lang/RuntimeException;
        //  107    110    110    115    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0104:
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
    
    public void a(final gm gm) {
        final byte[] a = gm.a();
        if (a == null) {
            try {
                throw new IllegalStateException();
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
        final g2 g2 = this.a.get(a);
        if (g2 == null) {
            return;
        }
        try {
            this.c.post((Runnable)new atm(this, new adv(this, a, g2)));
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
    }
    
    public void a(final kf kf) {
        o6.j.unregisterObserver((Object)kf);
    }
    
    public void a(final Integer n, final String[] array) {
        o6.j.a(n, array);
    }
    
    public void a(final String s, final String s2) {
        this.c.post((Runnable)new atm(this, new y1(this, s, s2)));
    }
    
    void a(final byte[] p0, final g2 p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_2        
        //     5: invokevirtual   com/whatsapp/g2.a:()Ljava/lang/String;
        //     8: astore          4
        //    10: aload_2        
        //    11: invokevirtual   com/whatsapp/g2.c:()Ljava/lang/String;
        //    14: astore          5
        //    16: new             Ljava/lang/StringBuilder;
        //    19: dup            
        //    20: invokespecial   java/lang/StringBuilder.<init>:()V
        //    23: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //    26: bipush          11
        //    28: aaload         
        //    29: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    32: aload           5
        //    34: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    37: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //    40: bipush          9
        //    42: aaload         
        //    43: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    46: aload           4
        //    48: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    51: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    54: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    57: aload           4
        //    59: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    62: ifeq            84
        //    65: new             Ljava/lang/IllegalStateException;
        //    68: dup            
        //    69: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //    72: bipush          8
        //    74: aaload         
        //    75: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    78: athrow         
        //    79: astore          6
        //    81: aload           6
        //    83: athrow         
        //    84: aload_0        
        //    85: getfield        com/whatsapp/o6.f:Lcom/whatsapp/t7;
        //    88: getfield        com/whatsapp/t7.c:Lcom/android/vending/billing/IInAppBillingService;
        //    91: iconst_3       
        //    92: aload_0        
        //    93: getfield        com/whatsapp/o6.i:Ljava/lang/String;
        //    96: aload           4
        //    98: invokeinterface com/android/vending/billing/IInAppBillingService.consumePurchase:(ILjava/lang/String;Ljava/lang/String;)I
        //   103: istore          7
        //   105: iload           7
        //   107: lookupswitch {
        //                0: 177
        //                6: 203
        //                8: 190
        //          default: 140
        //        }
        //   140: new             Ljava/lang/IllegalStateException;
        //   143: dup            
        //   144: new             Ljava/lang/StringBuilder;
        //   147: dup            
        //   148: invokespecial   java/lang/StringBuilder.<init>:()V
        //   151: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //   154: bipush          6
        //   156: aaload         
        //   157: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   160: iload           7
        //   162: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   165: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   168: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   171: athrow         
        //   172: astore          9
        //   174: aload           9
        //   176: athrow         
        //   177: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //   180: bipush          7
        //   182: aaload         
        //   183: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   186: iload_3        
        //   187: ifeq            216
        //   190: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //   193: bipush          10
        //   195: aaload         
        //   196: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   199: iload_3        
        //   200: ifeq            216
        //   203: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //   206: bipush          12
        //   208: aaload         
        //   209: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   212: iload_3        
        //   213: ifne            140
        //   216: aload_0        
        //   217: getfield        com/whatsapp/o6.a:Ljava/util/Map;
        //   220: aload_1        
        //   221: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   226: pop            
        //   227: getstatic       com/whatsapp/o6.j:Lcom/whatsapp/a85;
        //   230: aload_2        
        //   231: invokevirtual   com/whatsapp/a85.a:(Lcom/whatsapp/g2;)V
        //   234: return         
        //   235: astore          11
        //   237: aload           11
        //   239: athrow         
        //   240: astore          10
        //   242: aload           10
        //   244: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  16     79     79     84     Ljava/lang/RuntimeException;
        //  140    172    172    177    Ljava/lang/RuntimeException;
        //  177    186    235    240    Ljava/lang/RuntimeException;
        //  190    199    240    245    Ljava/lang/RuntimeException;
        //  203    212    172    177    Ljava/lang/RuntimeException;
        //  237    240    240    245    Ljava/lang/RuntimeException;
        //  242    245    172    177    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0190:
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
    
    public void b(final kf kf) {
        o6.j.registerObserver((Object)kf);
    }
    
    void c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: aconst_null    
        //     5: astore_2       
        //     6: aload_0        
        //     7: new             Ljava/util/ArrayList;
        //    10: dup            
        //    11: invokespecial   java/util/ArrayList.<init>:()V
        //    14: putfield        com/whatsapp/o6.e:Ljava/util/ArrayList;
        //    17: aload_0        
        //    18: getfield        com/whatsapp/o6.f:Lcom/whatsapp/t7;
        //    21: getfield        com/whatsapp/t7.c:Lcom/android/vending/billing/IInAppBillingService;
        //    24: iconst_3       
        //    25: aload_0        
        //    26: getfield        com/whatsapp/o6.i:Ljava/lang/String;
        //    29: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //    32: bipush          62
        //    34: aaload         
        //    35: aload_2        
        //    36: invokeinterface com/android/vending/billing/IInAppBillingService.getPurchases:(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
        //    41: astore_3       
        //    42: aload_3        
        //    43: ifnonnull       56
        //    46: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //    49: bipush          57
        //    51: aaload         
        //    52: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    55: return         
        //    56: aload_0        
        //    57: aload_3        
        //    58: invokespecial   com/whatsapp/o6.a:(Landroid/os/Bundle;)I
        //    61: istore          4
        //    63: new             Ljava/lang/StringBuilder;
        //    66: dup            
        //    67: invokespecial   java/lang/StringBuilder.<init>:()V
        //    70: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //    73: bipush          58
        //    75: aaload         
        //    76: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    79: iload           4
        //    81: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    84: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    87: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    90: iload           4
        //    92: ifeq            128
        //    95: new             Ljava/lang/StringBuilder;
        //    98: dup            
        //    99: invokespecial   java/lang/StringBuilder.<init>:()V
        //   102: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //   105: bipush          64
        //   107: aaload         
        //   108: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   111: iload           4
        //   113: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   116: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   119: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   122: return         
        //   123: astore          5
        //   125: aload           5
        //   127: athrow         
        //   128: aload_3        
        //   129: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //   132: bipush          60
        //   134: aaload         
        //   135: invokevirtual   android/os/Bundle.containsKey:(Ljava/lang/String;)Z
        //   138: istore          9
        //   140: iload           9
        //   142: ifeq            175
        //   145: aload_3        
        //   146: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //   149: bipush          66
        //   151: aaload         
        //   152: invokevirtual   android/os/Bundle.containsKey:(Ljava/lang/String;)Z
        //   155: istore          10
        //   157: iload           10
        //   159: ifeq            175
        //   162: aload_3        
        //   163: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //   166: bipush          63
        //   168: aaload         
        //   169: invokevirtual   android/os/Bundle.containsKey:(Ljava/lang/String;)Z
        //   172: ifne            200
        //   175: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //   178: bipush          49
        //   180: aaload         
        //   181: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   184: return         
        //   185: astore          8
        //   187: aload           8
        //   189: athrow         
        //   190: astore          6
        //   192: aload           6
        //   194: athrow         
        //   195: astore          7
        //   197: aload           7
        //   199: athrow         
        //   200: aload_3        
        //   201: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //   204: bipush          50
        //   206: aaload         
        //   207: invokevirtual   android/os/Bundle.getStringArrayList:(Ljava/lang/String;)Ljava/util/ArrayList;
        //   210: astore          11
        //   212: aload_3        
        //   213: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //   216: bipush          52
        //   218: aaload         
        //   219: invokevirtual   android/os/Bundle.getStringArrayList:(Ljava/lang/String;)Ljava/util/ArrayList;
        //   222: astore          12
        //   224: aload_3        
        //   225: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //   228: bipush          51
        //   230: aaload         
        //   231: invokevirtual   android/os/Bundle.getStringArrayList:(Ljava/lang/String;)Ljava/util/ArrayList;
        //   234: astore          13
        //   236: iconst_0       
        //   237: istore          14
        //   239: iload           14
        //   241: aload           12
        //   243: invokevirtual   java/util/ArrayList.size:()I
        //   246: if_icmpge       478
        //   249: aload           12
        //   251: iload           14
        //   253: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   256: checkcast       Ljava/lang/String;
        //   259: astore          17
        //   261: aload           13
        //   263: iload           14
        //   265: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   268: checkcast       Ljava/lang/String;
        //   271: astore          18
        //   273: aload           11
        //   275: iload           14
        //   277: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   280: checkcast       Ljava/lang/String;
        //   283: astore          19
        //   285: new             Ljava/lang/StringBuilder;
        //   288: dup            
        //   289: invokespecial   java/lang/StringBuilder.<init>:()V
        //   292: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //   295: bipush          61
        //   297: aaload         
        //   298: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   301: aload           19
        //   303: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   306: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //   309: bipush          55
        //   311: aaload         
        //   312: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   315: aload           17
        //   317: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   320: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //   323: bipush          65
        //   325: aaload         
        //   326: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   329: aload           18
        //   331: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   334: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   337: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   340: getstatic       com/whatsapp/a6c.l:Ljava/lang/String;
        //   343: aload           17
        //   345: aload           18
        //   347: invokestatic    com/whatsapp/ja.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
        //   350: ifeq            427
        //   353: new             Lcom/whatsapp/g2;
        //   356: dup            
        //   357: aload           17
        //   359: aload           18
        //   361: invokespecial   com/whatsapp/g2.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   364: astore          20
        //   366: aload           20
        //   368: invokevirtual   com/whatsapp/g2.a:()Ljava/lang/String;
        //   371: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   374: ifeq            413
        //   377: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //   380: bipush          53
        //   382: aaload         
        //   383: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   386: new             Ljava/lang/StringBuilder;
        //   389: dup            
        //   390: invokespecial   java/lang/StringBuilder.<init>:()V
        //   393: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //   396: bipush          59
        //   398: aaload         
        //   399: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   402: aload           17
        //   404: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   407: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   410: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   413: aload_0        
        //   414: getfield        com/whatsapp/o6.e:Ljava/util/ArrayList;
        //   417: aload           20
        //   419: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   422: pop            
        //   423: iload_1        
        //   424: ifeq            468
        //   427: new             Ljava/lang/StringBuilder;
        //   430: dup            
        //   431: invokespecial   java/lang/StringBuilder.<init>:()V
        //   434: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //   437: bipush          54
        //   439: aaload         
        //   440: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   443: aload           17
        //   445: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   448: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //   451: bipush          67
        //   453: aaload         
        //   454: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   457: aload           18
        //   459: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   462: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   465: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   468: iload           14
        //   470: iconst_1       
        //   471: iadd           
        //   472: istore          24
        //   474: iload_1        
        //   475: ifeq            575
        //   478: aload_3        
        //   479: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //   482: bipush          68
        //   484: aaload         
        //   485: invokevirtual   android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   488: astore_2       
        //   489: aload_2        
        //   490: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   493: ifeq            17
        //   496: aload_0        
        //   497: getfield        com/whatsapp/o6.e:Ljava/util/ArrayList;
        //   500: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   503: astore          15
        //   505: aload           15
        //   507: invokeinterface java/util/Iterator.hasNext:()Z
        //   512: ifeq            55
        //   515: aload           15
        //   517: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   522: checkcast       Lcom/whatsapp/g2;
        //   525: astore          16
        //   527: new             Ljava/lang/StringBuilder;
        //   530: dup            
        //   531: invokespecial   java/lang/StringBuilder.<init>:()V
        //   534: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //   537: bipush          56
        //   539: aaload         
        //   540: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   543: aload           16
        //   545: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   548: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   551: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   554: aload_0        
        //   555: aload           16
        //   557: invokevirtual   com/whatsapp/o6.a:(Lcom/whatsapp/g2;)V
        //   560: iload_1        
        //   561: ifeq            505
        //   564: return         
        //   565: astore          21
        //   567: aload           21
        //   569: athrow         
        //   570: astore          22
        //   572: aload           22
        //   574: athrow         
        //   575: iload           24
        //   577: istore          14
        //   579: goto            239
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  63     90     123    128    Ljava/lang/RuntimeException;
        //  95     122    123    128    Ljava/lang/RuntimeException;
        //  128    140    190    195    Ljava/lang/RuntimeException;
        //  145    157    195    200    Ljava/lang/RuntimeException;
        //  162    175    185    190    Ljava/lang/RuntimeException;
        //  175    184    185    190    Ljava/lang/RuntimeException;
        //  192    195    195    200    Ljava/lang/RuntimeException;
        //  197    200    185    190    Ljava/lang/RuntimeException;
        //  366    413    565    570    Ljava/lang/RuntimeException;
        //  413    423    570    575    Ljava/lang/RuntimeException;
        //  427    468    570    575    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0175:
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
    
    public boolean d() {
        try {
            if (!this.a.isEmpty()) {
                return true;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return false;
    }
    
    public void e() {
        while (true) {
            try {
                if (!this.f()) {
                    return;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (this.d()) {
                    this.c.post((Runnable)new atm(this, new aw7(this)));
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
    }
    
    public boolean f() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        com/whatsapp/o6.b:Z
        //     6: istore          4
        //     8: iload           4
        //    10: ifeq            70
        //    13: aload_0        
        //    14: getfield        com/whatsapp/o6.l:Z
        //    17: istore          6
        //    19: iload           6
        //    21: ifeq            70
        //    24: iconst_1       
        //    25: istore          5
        //    27: new             Ljava/lang/StringBuilder;
        //    30: dup            
        //    31: invokespecial   java/lang/StringBuilder.<init>:()V
        //    34: getstatic       com/whatsapp/o6.z:[Ljava/lang/String;
        //    37: bipush          22
        //    39: aaload         
        //    40: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    43: iload           5
        //    45: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //    48: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    51: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    54: aload_0        
        //    55: monitorexit    
        //    56: iload           5
        //    58: ireturn        
        //    59: astore_2       
        //    60: aload_2        
        //    61: athrow         
        //    62: astore_3       
        //    63: aload_3        
        //    64: athrow         
        //    65: astore_1       
        //    66: aload_0        
        //    67: monitorexit    
        //    68: aload_1        
        //    69: athrow         
        //    70: iconst_0       
        //    71: istore          5
        //    73: goto            27
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  2      8      59     62     Ljava/lang/RuntimeException;
        //  2      8      65     70     Any
        //  13     19     62     65     Ljava/lang/RuntimeException;
        //  13     19     65     70     Any
        //  27     54     65     70     Any
        //  60     62     62     65     Ljava/lang/RuntimeException;
        //  60     62     65     70     Any
        //  63     65     65     70     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0027:
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
    
    protected void onLooperPrepared() {
        Log.i(o6.z[44]);
        this.c = new rh(this);
        this.a(new atm(this, new z7(this)));
    }
}
