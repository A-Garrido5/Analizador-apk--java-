// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.IOException;
import android.view.MotionEvent;
import android.hardware.Camera$Parameters;
import android.hardware.Camera$PictureCallback;
import android.hardware.Camera$ShutterCallback;
import android.view.Display;
import android.hardware.Camera$CameraInfo;
import android.view.WindowManager;
import java.util.ArrayList;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Iterator;
import android.content.SharedPreferences;
import android.os.Build$VERSION;
import android.os.Handler;
import android.util.AttributeSet;
import android.content.Context;
import android.media.MediaRecorder;
import android.view.SurfaceHolder;
import android.view.ScaleGestureDetector;
import android.support.v4.view.GestureDetectorCompat;
import android.hardware.Camera;
import java.util.List;
import android.hardware.Camera$Size;
import android.view.ScaleGestureDetector$OnScaleGestureListener;
import android.view.GestureDetector$OnGestureListener;
import android.view.SurfaceHolder$Callback;
import android.view.SurfaceView;

public class CameraView extends SurfaceView implements SurfaceHolder$Callback, GestureDetector$OnGestureListener, ScaleGestureDetector$OnScaleGestureListener
{
    private static String[] n;
    private static String[] r;
    private static final String[] z;
    private boolean a;
    private float b;
    private boolean c;
    private int d;
    private Camera$Size e;
    private String f;
    private boolean g;
    private List h;
    private Camera i;
    private GestureDetectorCompat j;
    private ScaleGestureDetector k;
    private int l;
    private SurfaceHolder m;
    private boolean o;
    private MediaRecorder p;
    private Camera$Size q;
    private i s;
    
    static {
        final String[] array = new String[108];
        String s = "$Xf`\u001a&Ob`\u001fhJ\u007fj\u00181Po`\u0007$X{q\u001d5\\+";
        int n = -1;
        String[] array2 = array;
        String[] n2 = array;
        int n3 = 0;
        String intern = null;
    Label_3317:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n4 = 0; i > n4; ++n4) {
                final char c = charArray[n4];
                char c2 = '\0';
                switch (n4 % 5) {
                    default: {
                        c2 = 'h';
                        break;
                    }
                    case 0: {
                        c2 = 'G';
                        break;
                    }
                    case 1: {
                        c2 = '9';
                        break;
                    }
                    case 2: {
                        c2 = '\u000b';
                        break;
                    }
                    case 3: {
                        c2 = '\u0005';
                        break;
                    }
                }
                charArray[n4] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array2[n3] = intern;
                    s = "$Xf`\u001a&Ob`\u001fhJ\u007fd\u001a3Iy`\u001e.\\|%\u0012(Vf%\u001a&Mbj\u001b}";
                    n3 = 1;
                    array2 = n2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array2[n3] = intern;
                    s = "0Pea\u00070";
                    n3 = 2;
                    array2 = n2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array2[n3] = intern;
                    s = "g_yj\u00063\u0003";
                    n3 = 3;
                    array2 = n2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array2[n3] = intern;
                    n3 = 4;
                    array2 = n2;
                    s = "$Xf`\u001a&Ob`\u001fhJ\u007fd\u001a3Iy`\u001e.\\|*\u001b\"Mol\u001b7Uj|\u00075Pnk\u001c&Mbj\u0006g";
                    n = 3;
                    continue;
                }
                case 3: {
                    array2[n3] = intern;
                    s = "$Xf`\u001a&Ob`\u001fhJ\u007fd\u001a3Iy`\u001e.\\|%\u0006(\u0019qj\u0007*";
                    n = 4;
                    n3 = 5;
                    array2 = n2;
                    continue;
                }
                case 4: {
                    array2[n3] = intern;
                    n3 = 6;
                    array2 = n2;
                    s = "5V\u007fd\u001c.Ve";
                    n = 5;
                    continue;
                }
                case 5: {
                    array2[n3] = intern;
                    n3 = 7;
                    s = "$Xf`\u001a&Ob`\u001fhJ\u007fd\u001a3Iy`\u001e.\\|%\u001b2I{j\u001a3\\o%\u000e(Z~vR";
                    n = 6;
                    array2 = n2;
                    continue;
                }
                case 6: {
                    array2[n3] = intern;
                    n3 = 8;
                    s = "$Xf`\u001a&Ob`\u001fhJ\u007fd\u001a3Iy`\u001e.\\|%\u001b\"M+c\u0004&Jc%\u0005(]n?";
                    n = 7;
                    array2 = n2;
                    continue;
                }
                case 7: {
                    array2[n3] = intern;
                    n3 = 9;
                    s = "$Xf`\u001a&Ob`\u001fhJ\u007fd\u001a3Iy`\u001e.\\|%\f.J{i\t>\u0003";
                    n = 8;
                    array2 = n2;
                    continue;
                }
                case 8: {
                    array2[n3] = intern;
                    n3 = 10;
                    s = "$Xf`\u001a&Ob`\u001fhJ\u007fd\u001a3Iy`\u001e.\\|%\u0018.Z\u007fp\u001a\"Jb\u007f\r4\u0003";
                    n = 9;
                    array2 = n2;
                    continue;
                }
                case 9: {
                    array2[n3] = intern;
                    n3 = 11;
                    s = "$Xf`\u001a&Ob`\u001fhJ\u007fd\u001a3Iy`\u001e.\\|%\u0018.Z\u007fp\u001a\"\u0019xl\u0012\"\u0019";
                    n = 10;
                    array2 = n2;
                    continue;
                }
                case 10: {
                    array2[n3] = intern;
                    n3 = 12;
                    s = "4Xfv\u001d)^";
                    n = 11;
                    array2 = n2;
                    continue;
                }
                case 11: {
                    array2[n3] = intern;
                    n3 = 13;
                    s = "gIy`\u001e.\\|?";
                    n = 12;
                    array2 = n2;
                    continue;
                }
                case 12: {
                    array2[n3] = intern;
                    n3 = 14;
                    s = "7Vyq\u001a&P\u007f";
                    n = 13;
                    array2 = n2;
                    continue;
                }
                case 13: {
                    array2[n3] = intern;
                    n3 = 15;
                    s = "$Xf`\u001a&Ob`\u001fhJ\u007fd\u001a3Iy`\u001e.\\|%\u001b2I{j\u001a3\\o%\u000e+XxmR)Lgi";
                    n = 14;
                    array2 = n2;
                    continue;
                }
                case 14: {
                    array2[n3] = intern;
                    n3 = 16;
                    s = "$Xf`\u001a&Ob`\u001fhJ\u007fd\u001a3Iy`\u001e.\\|%\u001b2I{j\u001a3\\o%\u000e(Z~vR)Lgi";
                    n = 15;
                    array2 = n2;
                    continue;
                }
                case 15: {
                    array2[n3] = intern;
                    n3 = 17;
                    s = "$Veq\u0001)Ldp\u001bjIbf\u001c2Kn";
                    n = 16;
                    array2 = n2;
                    continue;
                }
                case 16: {
                    array2[n3] = intern;
                    n3 = 18;
                    s = "(Kb`\u00063X\u007fl\u0007)";
                    n = 17;
                    array2 = n2;
                    continue;
                }
                case 17: {
                    array2[n3] = intern;
                    n3 = 19;
                    s = "$Veq\u0001)Ldp\u001bjIbf\u001c2Kn";
                    n = 18;
                    array2 = n2;
                    continue;
                }
                case 18: {
                    array2[n3] = intern;
                    n3 = 20;
                    s = "$Xf`\u001a&Ob`\u001fhJ\u007fd\u001a3Iy`\u001e.\\|%\u001b2I{j\u001a3\\o%\u000e+XxmR";
                    n = 19;
                    array2 = n2;
                    continue;
                }
                case 19: {
                    array2[n3] = intern;
                    n3 = 21;
                    s = "$Xf`\u001a&Ob`\u001fhJ\u007fd\u001a3Iy`\u001e.\\|%\u000b&Tnw\tgPx%\u00062Ug";
                    n = 20;
                    array2 = n2;
                    continue;
                }
                case 20: {
                    array2[n3] = intern;
                    n3 = 22;
                    s = "$Xf`\u001a&Ob`\u001fhJ\u007fd\u001a3Iy`\u001e.\\|%\u0005&AT\u007f\u0007(T1";
                    n = 21;
                    array2 = n2;
                    continue;
                }
                case 21: {
                    array2[n3] = intern;
                    n3 = 23;
                    s = "$Xf`\u001a&Ob`\u001fhJ\u007fd\u001a3Iy`\u001e.\\|%\u00077Mbh\t+\u0019{w\r1PnrH4Pq`R";
                    n = 22;
                    array2 = n2;
                    continue;
                }
                case 22: {
                    array2[n3] = intern;
                    n3 = 24;
                    s = "+Xea\u001b$X{`";
                    n = 23;
                    array2 = n2;
                    continue;
                }
                case 23: {
                    array2[n3] = intern;
                    n3 = 25;
                    s = "gZjh\r5X1";
                    n = 24;
                    array2 = n2;
                    continue;
                }
                case 24: {
                    array2[n3] = intern;
                    n3 = 26;
                    s = "$Xf`\u001a&Ob`\u001fhJ~w\u000e&Znf\u0000&Wl`\f}\u0019ejH$Xf`\u001a&";
                    n = 25;
                    array2 = n2;
                    continue;
                }
                case 25: {
                    array2[n3] = intern;
                    n3 = 27;
                    s = "$Xf`\u001a&Ob`\u001fhJ~w\u000e&Znf\u0000&Wl`\fg";
                    n = 26;
                    array2 = n2;
                    continue;
                }
                case 26: {
                    array2[n3] = intern;
                    n3 = 28;
                    s = "$Xf`\u001a&Ob`\u001fhJ~w\u000e&Znf\u0000&Wl`\f}\u0019nw\u001a(K+v\r3Mbk\u000fgIy`\u001e.\\|%\f.J{i\t>";
                    n = 27;
                    array2 = n2;
                    continue;
                }
                case 27: {
                    array2[n3] = intern;
                    n3 = 29;
                    s = "$Xf`\u001a&Ob`\u001fhJ~w\u000e&Znf\u0000&Wl`\f}\u0019ejH4Lyc\t$\\";
                    n = 28;
                    array2 = n2;
                    continue;
                }
                case 28: {
                    array2[n3] = intern;
                    n3 = 30;
                    s = "$Xf`\u001a&fbk\f\"A";
                    n = 29;
                    array2 = n2;
                    continue;
                }
                case 29: {
                    array2[n3] = intern;
                    n3 = 31;
                    s = "$Vf+\u001f/X\u007fv\t7ITu\u001a\"_nw\r)Znv";
                    n = 30;
                    array2 = n2;
                    continue;
                }
                case 30: {
                    array2[n3] = intern;
                    n3 = 32;
                    s = "!Ujv\u0000\u0018Tda\r";
                    n = 31;
                    array2 = n2;
                    continue;
                }
                case 31: {
                    array2[n3] = intern;
                    n3 = 33;
                    s = "&L\u007fj";
                    n = 32;
                    array2 = n2;
                    continue;
                }
                case 32: {
                    array2[n3] = intern;
                    n3 = 34;
                    s = "&L\u007fj";
                    n = 33;
                    array2 = n2;
                    continue;
                }
                case 33: {
                    array2[n3] = intern;
                    n3 = 35;
                    s = "$Xf`\u001a&Ob`\u001fhMjn\r7Phq\u001d5\\$v\u001c&K\u007f";
                    n = 34;
                    array2 = n2;
                    continue;
                }
                case 34: {
                    array2[n3] = intern;
                    n3 = 36;
                    s = "$Xf`\u001a&Ob`\u001fhMjn\r7Phq\u001d5\\+c\t.Una";
                    n = 35;
                    array2 = n2;
                    continue;
                }
                case 35: {
                    array2[n3] = intern;
                    n3 = 37;
                    s = "7Phq\u001d5\\Tf\t+Uid\u000b,\u0019bvH)Lgi";
                    n = 36;
                    array2 = n2;
                    continue;
                }
                case 36: {
                    array2[n3] = intern;
                    n3 = 38;
                    s = "$Xf`\u001a&Ob`\u001fhMjn\r7Phq\u001d5\\+f\t*\\ydH.J+k\u001d+U";
                    n = 37;
                    array2 = n2;
                    continue;
                }
                case 37: {
                    array2[n3] = intern;
                    n3 = 39;
                    s = "!Ujv\u0000\u0018Tda\r";
                    n = 38;
                    array2 = n2;
                    continue;
                }
                case 38: {
                    array2[n3] = intern;
                    n3 = 40;
                    s = "$Vf+\u001f/X\u007fv\t7ITu\u001a\"_nw\r)Znv";
                    n = 39;
                    array2 = n2;
                    continue;
                }
                case 39: {
                    array2[n3] = intern;
                    n3 = 41;
                    s = "$Xf`\u001a&Ob`\u001fhWn}\u001cg_gd\u001b/\u0019fj\f\"\u0003";
                    n = 40;
                    array2 = n2;
                    continue;
                }
                case 40: {
                    array2[n3] = intern;
                    n3 = 42;
                    s = "$Xf`\u001a&Ob`\u001fhJ\u007fd\u001a3Zjh\r5X+`\u001a5Vy%\u00077\\el\u0006 \u0019hd\u0005\"Kj";
                    n = 41;
                    array2 = n2;
                    continue;
                }
                case 41: {
                    array2[n3] = intern;
                    n3 = 43;
                    s = "$Xf`\u001a&Ob`\u001fhJ\u007fd\u001a3Zjh\r5X+`\u001a5Vy%\u001a\"Zdk\u0006\"Z\u007fl\u0006 \u0019hd\u0005\"Kj";
                    n = 42;
                    array2 = n2;
                    continue;
                }
                case 42: {
                    array2[n3] = intern;
                    n3 = 44;
                    s = "$Xf`\u001a&Ob`\u001fhJ\u007fj\u0018$Xf`\u001a&\u0019nw\u001a(K+v\u001c(I{l\u0006 \u0019hd\u0005\"Kj%\u00185\\}l\r0";
                    n = 43;
                    array2 = n2;
                    continue;
                }
                case 43: {
                    array2[n3] = intern;
                    n3 = 45;
                    s = "$Xf`\u001a&Ob`\u001fhJ\u007fj\u0018$Xf`\u001a&\u0019nw\u001a(K+w\r+\\jv\r.Wl%\u000b&Tnw\t";
                    n = 44;
                    array2 = n2;
                    continue;
                }
                case 44: {
                    array2[n3] = intern;
                    n3 = 46;
                    s = "$Xf`\u001a&Ob`\u001fhJ\u007fj\u0018$Xf`\u001a&";
                    n = 45;
                    array2 = n2;
                    continue;
                }
                case 45: {
                    array2[n3] = intern;
                    n3 = 47;
                    s = "(W";
                    n = 46;
                    array2 = n2;
                    continue;
                }
                case 46: {
                    array2[n3] = intern;
                    n3 = 48;
                    s = "(_m";
                    n = 47;
                    array2 = n2;
                    continue;
                }
                case 47: {
                    array2[n3] = intern;
                    n3 = 49;
                    s = "(_m";
                    n = 48;
                    array2 = n2;
                    continue;
                }
                case 48: {
                    array2[n3] = intern;
                    n3 = 50;
                    s = "&L\u007fj";
                    n = 49;
                    array2 = n2;
                    continue;
                }
                case 49: {
                    array2[n3] = intern;
                    n3 = 51;
                    s = "(W";
                    n = 50;
                    array2 = n2;
                    continue;
                }
                case 50: {
                    array2[n3] = intern;
                    n3 = 52;
                    s = "&L\u007fj";
                    n = 51;
                    array2 = n2;
                    continue;
                }
                case 51: {
                    array2[n3] = intern;
                    n3 = 53;
                    s = "0Pea\u00070";
                    n = 52;
                    array2 = n2;
                    continue;
                }
                case 52: {
                    array2[n3] = intern;
                    n3 = 54;
                    s = "$Xf`\u001a&Ob`\u001fhVyl\r)Mjq\u0001(W+a\u00014Igd\u0011}";
                    n = 53;
                    array2 = n2;
                    continue;
                }
                case 53: {
                    array2[n3] = intern;
                    n3 = 55;
                    s = "gZjh\r5X1";
                    n = 54;
                    array2 = n2;
                    continue;
                }
                case 54: {
                    array2[n3] = intern;
                    n3 = 56;
                    s = "gKdq\t3\\1";
                    n = 55;
                    array2 = n2;
                    continue;
                }
                case 55: {
                    array2[n3] = intern;
                    n3 = 57;
                    s = "$Xf`\u001a&fbk\f\"A";
                    n = 56;
                    array2 = n2;
                    continue;
                }
                case 56: {
                    array2[n3] = intern;
                    n3 = 58;
                    s = "$Xf`\u001a&Ob`\u001fhWn}\u001c$Xf`\u001a&";
                    n = 57;
                    array2 = n2;
                    continue;
                }
                case 57: {
                    array2[n3] = intern;
                    n3 = 59;
                    s = "$Xf`\u001a&Ob`\u001fhWn}\u001c$Xf`\u001a&\u0019nw\u001a(K+v\r3Mbk\u000fgIy`\u001e.\\|%\f.J{i\t>";
                    n = 58;
                    array2 = n2;
                    continue;
                }
                case 58: {
                    array2[n3] = intern;
                    n3 = 60;
                    s = "$Xf`\u001a&Ob`\u001fhWn}\u001c$Xf`\u001a&\u0019";
                    n = 59;
                    array2 = n2;
                    continue;
                }
                case 59: {
                    array2[n3] = intern;
                    n3 = 61;
                    s = "$Vf+\u001f/X\u007fv\t7ITu\u001a\"_nw\r)Znv";
                    n = 60;
                    array2 = n2;
                    continue;
                }
                case 60: {
                    array2[n3] = intern;
                    n3 = 62;
                    s = ".Wml\u0006.Mr";
                    n = 61;
                    array2 = n2;
                    continue;
                }
                case 61: {
                    array2[n3] = intern;
                    n3 = 63;
                    s = "$Xf`\u001a&Ob`\u001fh\u0019ejH4L{u\u00075MnaH1Po`\u0007gJb\u007f\r4";
                    n = 62;
                    array2 = n2;
                    continue;
                }
                case 62: {
                    array2[n3] = intern;
                    n3 = 64;
                    s = "$Xf`\u001a&Ob`\u001fh\u0019ejH7Kdc\u0001+\\";
                    n = 63;
                    array2 = n2;
                    continue;
                }
                case 63: {
                    array2[n3] = intern;
                    n3 = 65;
                    s = ".Wml\u0006.Mr";
                    n = 64;
                    array2 = n2;
                    continue;
                }
                case 64: {
                    array2[n3] = intern;
                    n3 = 66;
                    s = "gOba\r(zda\r$\u0003";
                    n = 65;
                    array2 = n2;
                    continue;
                }
                case 65: {
                    array2[n3] = intern;
                    n3 = 67;
                    s = "$Xf`\u001a&Ob`\u001fh\u0019~v\rgIy`\u000e\"Ky`\fgOba\r(\u0019xl\u0012\"";
                    n = 66;
                    array2 = n2;
                    continue;
                }
                case 66: {
                    array2[n3] = intern;
                    n3 = 68;
                    s = "gOba\r({bq:&Mn?";
                    n = 67;
                    array2 = n2;
                    continue;
                }
                case 67: {
                    array2[n3] = intern;
                    n3 = 69;
                    s = "g_bi\r\u0001Vyh\t3\u0003";
                    n = 68;
                    array2 = n2;
                    continue;
                }
                case 68: {
                    array2[n3] = intern;
                    n3 = 70;
                    s = "$Xf`\u001a&Ob`\u001fh\u0019{w\r!\\yw\r#\u0019}l\f\"V+u\u001a\"Ob`\u001fgJb\u007f\r}";
                    n = 69;
                    array2 = n2;
                    continue;
                }
                case 69: {
                    array2[n3] = intern;
                    n3 = 71;
                    s = "$Xf`\u001a&Ob`\u001fh\u0019xp\u00187Vyq\r#\u0019mj\u000b2J1%\u00062Ug";
                    n = 70;
                    array2 = n2;
                    continue;
                }
                case 70: {
                    array2[n3] = intern;
                    n3 = 72;
                    s = "$Xf`\u001a&Ob`\u001fh\u0019hd\u0006)V\u007f%\u000e.Wo%\u00185\\}l\r0\u0019xl\u0012\"";
                    n = 71;
                    array2 = n2;
                    continue;
                }
                case 71: {
                    array2[n3] = intern;
                    n3 = 73;
                    s = "gOba\r({bq:&Mn?";
                    n = 72;
                    array2 = n2;
                    continue;
                }
                case 72: {
                    array2[n3] = intern;
                    n3 = 74;
                    s = "$Xf`\u001a&Ob`\u001fh\u0019y`\u001b3XyqH7Kns\u0001\"N";
                    n = 73;
                    array2 = n2;
                    continue;
                }
                case 73: {
                    array2[n3] = intern;
                    n3 = 75;
                    s = "gOba\r(\u007fyd\u0005\"kjq\r}";
                    n = 74;
                    array2 = n2;
                    continue;
                }
                case 74: {
                    array2[n3] = intern;
                    n3 = 76;
                    s = "gIy`\u001e.\\|?";
                    n = 75;
                    array2 = n2;
                    continue;
                }
                case 75: {
                    array2[n3] = intern;
                    n3 = 77;
                    s = "$XfZ\u0005(]n";
                    n = 76;
                    array2 = n2;
                    continue;
                }
                case 76: {
                    array2[n3] = intern;
                    n3 = 78;
                    s = "$Xf`\u001a&Ob`\u001fh\u0019{w\r!\\yw\r#\u0019}l\f\"V+u\u001a\"Ob`\u001fgJb\u007f\rgPx%\u00062Ug";
                    n = 77;
                    array2 = n2;
                    continue;
                }
                case 77: {
                    array2[n3] = intern;
                    n3 = 79;
                    s = "gX~a\u0001(zda\r$\u0003";
                    n = 78;
                    array2 = n2;
                    continue;
                }
                case 78: {
                    array2[n3] = intern;
                    n3 = 80;
                    s = "\u000fmH";
                    n = 79;
                    array2 = n2;
                    continue;
                }
                case 79: {
                    array2[n3] = intern;
                    n3 = 81;
                    s = "$Veq\u0001)Ldp\u001bjOba\r(";
                    n = 80;
                    array2 = n2;
                    continue;
                }
                case 80: {
                    array2[n3] = intern;
                    n3 = 82;
                    s = "4Xfv\u001d)^";
                    n = 81;
                    array2 = n2;
                    continue;
                }
                case 81: {
                    array2[n3] = intern;
                    n3 = 83;
                    s = "$Xf`\u001a&Ob`\u001fh\u0019~v\rgIyj\u000e.Un?";
                    n = 82;
                    array2 = n2;
                    continue;
                }
                case 82: {
                    array2[n3] = intern;
                    n3 = 84;
                    s = "$Xf`\u001a&Ob`\u001fh\u0019{w\u0007!Pg`R";
                    n = 83;
                    array2 = n2;
                    continue;
                }
                case 83: {
                    array2[n3] = intern;
                    n3 = 85;
                    s = "$Xf`\u001a&Ob`\u001fh\u0019hd\u0006)V\u007f%\u000e.Wo%\u001e.]njH4Pq`";
                    n = 84;
                    array2 = n2;
                    continue;
                }
                case 84: {
                    array2[n3] = intern;
                    n3 = 86;
                    s = "$Xf`\u001a&Ob`\u001fh\u0019xp\u00187Vyq\r#\u0019}l\f\"V+v\u0001=\\x?";
                    n = 85;
                    array2 = n2;
                    continue;
                }
                case 85: {
                    array2[n3] = intern;
                    n3 = 87;
                    s = "$Xf`\u001a&Ob`\u001fh\u0019+`\u001a5Vy%\u001b\"M\u007fl\u0006 \u0019{w\r1PnrH#Pxu\u0004&@";
                    n = 86;
                    array2 = n2;
                    continue;
                }
                case 86: {
                    array2[n3] = intern;
                    n3 = 88;
                    s = "$Xf`\u001a&Ob`\u001fhIy`\u0018&Kns\u0001#\\d%\u000e5VeqR";
                    n = 87;
                    array2 = n2;
                    continue;
                }
                case 87: {
                    array2[n3] = intern;
                    n3 = 89;
                    s = "$Xf`\u001a&Ob`\u001fh\u0019xp\u00187Vyq\r#\u0019{w\r1PnrH4Pq`\u001b}";
                    n = 88;
                    array2 = n2;
                    continue;
                }
                case 88: {
                    array2[n3] = intern;
                    n3 = 90;
                    s = "$Xf`\u001a&Ob`\u001fh\u0019xp\u00187Vyq\r#\u0019mj\u000b2J1";
                    n = 89;
                    array2 = n2;
                    continue;
                }
                case 89: {
                    array2[n3] = intern;
                    n3 = 91;
                    s = "$Xf`\u001a&Ob`\u001fh\u0019hd\u0006)V\u007f%\u000e.Wo%\u00185\\}l\r0\u0019xl\u0012\"\u0019\u007fm\t3\u0019bvH+Xyb\r5\u0019\u007fm\t)\u0019}l\f\"V";
                    n = 90;
                    array2 = n2;
                    continue;
                }
                case 90: {
                    array2[n3] = intern;
                    n3 = 92;
                    s = "$Veq\u0001)Ldp\u001bjOba\r(";
                    n = 91;
                    array2 = n2;
                    continue;
                }
                case 91: {
                    array2[n3] = intern;
                    n3 = 93;
                    s = "$Xf`\u001a&Ob`\u001fh_ji\u0004%Xhn\u001b2I{j\u001a3\\ou\u001a\"Ob`\u001f4Pq`\u001b";
                    n = 92;
                    array2 = n2;
                    continue;
                }
                case 92: {
                    array2[n3] = intern;
                    n3 = 94;
                    s = "gJhd\u0004\"ffd\u0010}";
                    n = 93;
                    array2 = n2;
                    continue;
                }
                case 93: {
                    array2[n3] = intern;
                    n3 = 95;
                    s = "$Xf`\u001a&Ob`\u001fhTnd\u001b2Kn%\u001a\"J~i\u001c}";
                    n = 94;
                    array2 = n2;
                    continue;
                }
                case 94: {
                    array2[n3] = intern;
                    n3 = 96;
                    s = "$Xf`\u001a&Ob`\u001fhTnd\u001b2Kn%\u00077Mbh\t+Iy`\u001e.\\|v\u0001=\\1";
                    n = 95;
                    array2 = n2;
                    continue;
                }
                case 95: {
                    array2[n3] = intern;
                    n3 = 97;
                    s = "$Xf`\u001a&Ob`\u001fhTnd\u001b2Kn%\u00077Mbh\t+Iy`\u001e.\\|v\u0001=\\+v\u000b&UnZ\u0005.W1";
                    n = 96;
                    array2 = n2;
                    continue;
                }
                case 96: {
                    array2[n3] = intern;
                    n3 = 98;
                    s = "gTnd\u001b2KnaR";
                    n = 97;
                    array2 = n2;
                    continue;
                }
                case 97: {
                    array2[n3] = intern;
                    n3 = 99;
                    s = "gJhd\u0004\"ffd\u0010}";
                    n = 98;
                    array2 = n2;
                    continue;
                }
                case 98: {
                    array2[n3] = intern;
                    n3 = 100;
                    s = "$Xf`\u001a&Ob`\u001fhTnd\u001b2Kn*\u00185\\}l\r0Jb\u007f\r4\u0019";
                    n = 99;
                    array2 = n2;
                    continue;
                }
                case 99: {
                    array2[n3] = intern;
                    n3 = 101;
                    s = "gXxu\r$M+a\u0001!_1";
                    n = 100;
                    array2 = n2;
                    continue;
                }
                case 100: {
                    array2[n3] = intern;
                    n3 = 102;
                    s = "$Xf`\u001a&Ob`\u001fhTnd\u001b2Kn%\u00077Mbh\t+Iy`\u001e.\\|v\u0001=\\+v\u000b&UnZ\u0005.W1";
                    n = 101;
                    array2 = n2;
                    continue;
                }
                case 101: {
                    array2[n3] = intern;
                    n3 = 103;
                    s = "0Pea\u00070";
                    n = 102;
                    array2 = n2;
                    continue;
                }
                case 102: {
                    array2[n3] = intern;
                    n3 = 104;
                    s = "k\u0019";
                    n = 103;
                    array2 = n2;
                    continue;
                }
                case 103: {
                    array2[n3] = intern;
                    n3 = 105;
                    s = "$Xf`\u001a&Ob`\u001fhJ\u007fd\u001a3Oba\r(Zju\u001c2Kn%\u000e&Pg`\f";
                    n = 104;
                    array2 = n2;
                    continue;
                }
                case 104: {
                    array2[n3] = intern;
                    n3 = 106;
                    s = "$Xf`\u001a&Ob`\u001fhJ\u007fd\u001a3Oba\r(Zju\u001c2Kn%\u000e&Pg`\f";
                    n = 105;
                    array2 = n2;
                    continue;
                }
                case 105: {
                    array2[n3] = intern;
                    n3 = 107;
                    s = "$Xf`\u001a&Ob`\u001fhJ\u007fd\u001a3\u0019}l\f\"V";
                    n = 106;
                    array2 = n2;
                    continue;
                }
                case 106: {
                    array2[n3] = intern;
                    z = n2;
                    final String[] array3 = new String[11];
                    s = "\u0000m&LQr\t>";
                    n = 107;
                    array2 = array3;
                    n2 = array3;
                    n3 = 0;
                    continue;
                }
                case 107: {
                    array2[n3] = intern;
                    s = "\u0000m&LQr\t=";
                    n = 108;
                    n3 = 1;
                    array2 = n2;
                    continue;
                }
                case 108: {
                    array2[n3] = intern;
                    s = "\u0000m&LQr\t>B";
                    n = 109;
                    n3 = 2;
                    array2 = n2;
                    continue;
                }
                case 109: {
                    array2[n3] = intern;
                    s = "\u0014~C(!t\n<";
                    n = 110;
                    n3 = 3;
                    array2 = n2;
                    continue;
                }
                case 110: {
                    array2[n3] = intern;
                    n3 = 4;
                    s = "\u0014~C(%~\b2";
                    n = 111;
                    array2 = n2;
                    continue;
                }
                case 111: {
                    array2[n3] = intern;
                    s = "\u0014zC(!r\r>";
                    n = 112;
                    n3 = 5;
                    array2 = n2;
                    continue;
                }
                case 112: {
                    array2[n3] = intern;
                    n3 = 6;
                    s = "\u0014iC($p\u000b;";
                    n = 113;
                    array2 = n2;
                    continue;
                }
                case 113: {
                    array2[n3] = intern;
                    n3 = 7;
                    s = "\u0014zC(:~\u000e;";
                    n = 114;
                    array2 = n2;
                    continue;
                }
                case 114: {
                    array2[n3] = intern;
                    n3 = 8;
                    s = "\u0000m&LQr\t3";
                    n = 115;
                    array2 = n2;
                    continue;
                }
                case 115: {
                    array2[n3] = intern;
                    n3 = 9;
                    s = "\u0014~C(&w\r>";
                    n = 116;
                    array2 = n2;
                    continue;
                }
                case 116: {
                    array2[n3] = intern;
                    n3 = 10;
                    s = "\u0014z&5\\\u0002";
                    n = 117;
                    array2 = n2;
                    continue;
                }
                case 117: {
                    array2[n3] = intern;
                    CameraView.r = n2;
                    final String[] array4 = new String[3];
                    s = "\u0000m&LQv\u0000>";
                    n = 118;
                    array2 = array4;
                    n2 = array4;
                    n3 = 0;
                    continue;
                }
                case 118: {
                    array2[n3] = intern;
                    s = "\u0000m&LQv\u0000;";
                    n = 119;
                    n3 = 1;
                    array2 = n2;
                    continue;
                }
                case 119: {
                    array2[n3] = intern;
                    s = "\u0000m&LQv\u00009";
                    n = 120;
                    n3 = 2;
                    array2 = n2;
                    continue;
                }
                case 120: {
                    break Label_3317;
                }
            }
        }
        array2[n3] = intern;
        CameraView.n = n2;
    }
    
    public CameraView(final Context context) {
        this(context, null);
    }
    
    public CameraView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public CameraView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b = 1.0f;
        final SharedPreferences sharedPreferences = context.getSharedPreferences(CameraView.z[31], 0);
        try {
            this.l = sharedPreferences.getInt(CameraView.z[30], 0);
            this.f = sharedPreferences.getString(CameraView.z[32], (String)null);
            (this.m = this.getHolder()).addCallback((SurfaceHolder$Callback)this);
            this.m.setType(3);
            this.j = new GestureDetectorCompat(context, (GestureDetector$OnGestureListener)this, null);
            if (Build$VERSION.SDK_INT >= 8) {
                this.k = new ScaleGestureDetector(context, (ScaleGestureDetector$OnScaleGestureListener)this);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
    }
    
    public static Camera$Size a(final List p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/camera/CameraActivity.m:Z
        //     3: istore_3       
        //     4: iload_1        
        //     5: i2d            
        //     6: iload_2        
        //     7: i2d            
        //     8: ddiv           
        //     9: dstore          4
        //    11: aload_0        
        //    12: ifnonnull       21
        //    15: aconst_null    
        //    16: astore          10
        //    18: aload           10
        //    20: areturn        
        //    21: aload_0        
        //    22: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    27: astore          6
        //    29: aconst_null    
        //    30: astore          7
        //    32: ldc2_w          1.7976931348623157E308
        //    35: dstore          8
        //    37: aload           6
        //    39: invokeinterface java/util/Iterator.hasNext:()Z
        //    44: ifeq            483
        //    47: aload           6
        //    49: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    54: checkcast       Landroid/hardware/Camera$Size;
        //    57: astore          37
        //    59: aload           37
        //    61: getfield        android/hardware/Camera$Size.width:I
        //    64: i2d            
        //    65: aload           37
        //    67: getfield        android/hardware/Camera$Size.height:I
        //    70: i2d            
        //    71: ddiv           
        //    72: dstore          38
        //    74: aload           37
        //    76: getfield        android/hardware/Camera$Size.width:I
        //    79: i2d            
        //    80: iload_1        
        //    81: i2d            
        //    82: ddiv           
        //    83: dstore          40
        //    85: aload           37
        //    87: getfield        android/hardware/Camera$Size.width:I
        //    90: istore          43
        //    92: aload           37
        //    94: getfield        android/hardware/Camera$Size.height:I
        //    97: istore          44
        //    99: iload           43
        //   101: iload           44
        //   103: imul           
        //   104: ldc_w           153600
        //   107: if_icmpge       114
        //   110: iload_3        
        //   111: ifeq            37
        //   114: dload           40
        //   116: ldc2_w          1.5
        //   119: dcmpl          
        //   120: ifle            127
        //   123: iload_3        
        //   124: ifeq            37
        //   127: dload           38
        //   129: dload           4
        //   131: dsub           
        //   132: dstore          45
        //   134: dload           45
        //   136: invokestatic    java/lang/Math.abs:(D)D
        //   139: dstore          48
        //   141: dload           48
        //   143: ldc2_w          0.1
        //   146: dcmpl          
        //   147: ifle            154
        //   150: iload_3        
        //   151: ifeq            37
        //   154: aload           37
        //   156: getfield        android/hardware/Camera$Size.height:I
        //   159: iload_2        
        //   160: isub           
        //   161: invokestatic    java/lang/Math.abs:(I)I
        //   164: i2d            
        //   165: dload           8
        //   167: dcmpg          
        //   168: ifge            468
        //   171: aload           37
        //   173: getfield        android/hardware/Camera$Size.height:I
        //   176: iload_2        
        //   177: isub           
        //   178: invokestatic    java/lang/Math.abs:(I)I
        //   181: i2d            
        //   182: dstore          56
        //   184: aload           37
        //   186: astore          10
        //   188: dload           56
        //   190: dstore          52
        //   192: iload_3        
        //   193: ifeq            490
        //   196: aload           10
        //   198: ifnonnull       302
        //   201: aload_0        
        //   202: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   207: astore          24
        //   209: aload           10
        //   211: astore          25
        //   213: ldc2_w          1.7976931348623157E308
        //   216: dstore          26
        //   218: aload           24
        //   220: invokeinterface java/util/Iterator.hasNext:()Z
        //   225: ifeq            461
        //   228: aload           24
        //   230: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   235: checkcast       Landroid/hardware/Camera$Size;
        //   238: astore          28
        //   240: aload           28
        //   242: getfield        android/hardware/Camera$Size.width:I
        //   245: i2d            
        //   246: iload_1        
        //   247: i2d            
        //   248: ddiv           
        //   249: ldc2_w          1.5
        //   252: dcmpl          
        //   253: ifle            260
        //   256: iload_3        
        //   257: ifeq            218
        //   260: aload           28
        //   262: getfield        android/hardware/Camera$Size.height:I
        //   265: iload_2        
        //   266: isub           
        //   267: invokestatic    java/lang/Math.abs:(I)I
        //   270: i2d            
        //   271: dload           26
        //   273: dcmpg          
        //   274: ifge            446
        //   277: aload           28
        //   279: getfield        android/hardware/Camera$Size.height:I
        //   282: iload_2        
        //   283: isub           
        //   284: invokestatic    java/lang/Math.abs:(I)I
        //   287: i2d            
        //   288: dstore          35
        //   290: aload           28
        //   292: astore          10
        //   294: dload           35
        //   296: dstore          31
        //   298: iload_3        
        //   299: ifeq            431
        //   302: aload           10
        //   304: ifnonnull       18
        //   307: aload_0        
        //   308: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   313: astore          11
        //   315: aload           10
        //   317: astore          12
        //   319: ldc2_w          1.7976931348623157E308
        //   322: dstore          13
        //   324: aload           11
        //   326: invokeinterface java/util/Iterator.hasNext:()Z
        //   331: ifeq            428
        //   334: aload           11
        //   336: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   341: checkcast       Landroid/hardware/Camera$Size;
        //   344: astore          15
        //   346: aload           15
        //   348: getfield        android/hardware/Camera$Size.height:I
        //   351: iload_2        
        //   352: isub           
        //   353: invokestatic    java/lang/Math.abs:(I)I
        //   356: i2d            
        //   357: dload           13
        //   359: dcmpg          
        //   360: ifge            413
        //   363: aload           15
        //   365: getfield        android/hardware/Camera$Size.height:I
        //   368: iload_2        
        //   369: isub           
        //   370: invokestatic    java/lang/Math.abs:(I)I
        //   373: i2d            
        //   374: dstore          22
        //   376: aload           15
        //   378: astore          10
        //   380: dload           22
        //   382: dstore          18
        //   384: iload_3        
        //   385: ifne            18
        //   388: dload           18
        //   390: dstore          20
        //   392: aload           10
        //   394: astore          12
        //   396: dload           20
        //   398: dstore          13
        //   400: goto            324
        //   403: astore          42
        //   405: aload           42
        //   407: athrow         
        //   408: astore          47
        //   410: aload           47
        //   412: athrow         
        //   413: dload           13
        //   415: dstore          16
        //   417: aload           12
        //   419: astore          10
        //   421: dload           16
        //   423: dstore          18
        //   425: goto            384
        //   428: aload           12
        //   430: areturn        
        //   431: dload           31
        //   433: dstore          33
        //   435: aload           10
        //   437: astore          25
        //   439: dload           33
        //   441: dstore          26
        //   443: goto            218
        //   446: dload           26
        //   448: dstore          29
        //   450: aload           25
        //   452: astore          10
        //   454: dload           29
        //   456: dstore          31
        //   458: goto            298
        //   461: aload           25
        //   463: astore          10
        //   465: goto            302
        //   468: dload           8
        //   470: dstore          50
        //   472: aload           7
        //   474: astore          10
        //   476: dload           50
        //   478: dstore          52
        //   480: goto            192
        //   483: aload           7
        //   485: astore          10
        //   487: goto            196
        //   490: dload           52
        //   492: dstore          54
        //   494: aload           10
        //   496: astore          7
        //   498: dload           54
        //   500: dstore          8
        //   502: goto            37
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  85     99     403    408    Ljava/lang/RuntimeException;
        //  134    141    408    413    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0154:
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
    
    static Camera a(final CameraView cameraView, final Camera i) {
        return cameraView.i = i;
    }
    
    static i a(final CameraView cameraView) {
        return cameraView.s;
    }
    
    private static String a(final List list) {
        final boolean m = CameraActivity.m;
        final StringBuilder sb = new StringBuilder();
        for (final Camera$Size camera$Size : list) {
            sb.append(camera$Size.width).append('x').append(camera$Size.height).append(CameraView.z[104]);
            if (m) {
                break;
            }
        }
        try {
            if (sb.length() > 1) {
                sb.deleteCharAt(-2 + sb.length());
            }
            return sb.toString();
        }
        catch (RuntimeException ex) {
            throw ex;
        }
    }
    
    static boolean a(final CameraView cameraView, final boolean a) {
        return cameraView.a = a;
    }
    
    private void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_1       
        //     2: getstatic       com/whatsapp/camera/CameraActivity.m:Z
        //     5: istore_2       
        //     6: aload_0        
        //     7: invokevirtual   com/whatsapp/camera/CameraView.getWidth:()I
        //    10: istore_3       
        //    11: aload_0        
        //    12: invokevirtual   com/whatsapp/camera/CameraView.getHeight:()I
        //    15: istore          4
        //    17: aload_0        
        //    18: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //    21: ifnonnull       43
        //    24: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //    27: bipush          21
        //    29: aaload         
        //    30: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    33: aload_0        
        //    34: invokespecial   com/whatsapp/camera/CameraView.f:()V
        //    37: return         
        //    38: astore          5
        //    40: aload           5
        //    42: athrow         
        //    43: aload_0        
        //    44: invokevirtual   com/whatsapp/camera/CameraView.getContext:()Landroid/content/Context;
        //    47: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //    50: iconst_2       
        //    51: aaload         
        //    52: invokevirtual   android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    55: checkcast       Landroid/view/WindowManager;
        //    58: invokeinterface android/view/WindowManager.getDefaultDisplay:()Landroid/view/Display;
        //    63: astore          6
        //    65: aload           6
        //    67: invokevirtual   android/view/Display.getOrientation:()I
        //    70: istore          7
        //    72: iload           7
        //    74: ifeq            83
        //    77: iload           7
        //    79: iconst_2       
        //    80: if_icmpne       1464
        //    83: iload_1        
        //    84: istore          8
        //    86: aload_0        
        //    87: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //    90: invokevirtual   android/hardware/Camera.getParameters:()Landroid/hardware/Camera$Parameters;
        //    93: astore          9
        //    95: aload           9
        //    97: invokevirtual   android/hardware/Camera$Parameters.getSupportedPreviewSizes:()Ljava/util/List;
        //   100: astore          10
        //   102: aload           10
        //   104: ifnonnull       1821
        //   107: aload_0        
        //   108: invokespecial   com/whatsapp/camera/CameraView.c:()Ljava/util/List;
        //   111: astore          11
        //   113: iload           8
        //   115: ifeq            1470
        //   118: iload           4
        //   120: istore          12
        //   122: iload           8
        //   124: ifeq            1476
        //   127: aload_0        
        //   128: aload           11
        //   130: iload           12
        //   132: iload_3        
        //   133: invokestatic    com/whatsapp/camera/CameraView.a:(Ljava/util/List;II)Landroid/hardware/Camera$Size;
        //   136: putfield        com/whatsapp/camera/CameraView.q:Landroid/hardware/Camera$Size;
        //   139: aload_0        
        //   140: getfield        com/whatsapp/camera/CameraView.f:Ljava/lang/String;
        //   143: ifnonnull       155
        //   146: aload_0        
        //   147: aload           9
        //   149: invokevirtual   android/hardware/Camera$Parameters.getFlashMode:()Ljava/lang/String;
        //   152: putfield        com/whatsapp/camera/CameraView.f:Ljava/lang/String;
        //   155: new             Ljava/lang/StringBuilder;
        //   158: dup            
        //   159: invokespecial   java/lang/StringBuilder.<init>:()V
        //   162: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   165: bipush          23
        //   167: aaload         
        //   168: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   171: aload_0        
        //   172: getfield        com/whatsapp/camera/CameraView.q:Landroid/hardware/Camera$Size;
        //   175: getfield        android/hardware/Camera$Size.width:I
        //   178: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   181: ldc_w           "x"
        //   184: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   187: aload_0        
        //   188: getfield        com/whatsapp/camera/CameraView.q:Landroid/hardware/Camera$Size;
        //   191: getfield        android/hardware/Camera$Size.height:I
        //   194: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   197: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   200: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   203: aload_0        
        //   204: iconst_0       
        //   205: putfield        com/whatsapp/camera/CameraView.o:Z
        //   208: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   211: bipush          9
        //   213: if_icmplt       267
        //   216: new             Landroid/hardware/Camera$CameraInfo;
        //   219: dup            
        //   220: invokespecial   android/hardware/Camera$CameraInfo.<init>:()V
        //   223: astore          14
        //   225: aload_0        
        //   226: getfield        com/whatsapp/camera/CameraView.l:I
        //   229: aload           14
        //   231: invokestatic    android/hardware/Camera.getCameraInfo:(ILandroid/hardware/Camera$CameraInfo;)V
        //   234: aload           14
        //   236: getfield        android/hardware/Camera$CameraInfo.facing:I
        //   239: istore          16
        //   241: iload           16
        //   243: iload_1        
        //   244: if_icmpne       1492
        //   247: iload_1        
        //   248: istore          17
        //   250: aload_0        
        //   251: iload           17
        //   253: putfield        com/whatsapp/camera/CameraView.o:Z
        //   256: aload           14
        //   258: getfield        android/hardware/Camera$CameraInfo.orientation:I
        //   261: istore          18
        //   263: iload_2        
        //   264: ifeq            1814
        //   267: iload           7
        //   269: ifeq            278
        //   272: iload           7
        //   274: iconst_2       
        //   275: if_icmpne       296
        //   278: aload           6
        //   280: invokevirtual   android/view/Display.getWidth:()I
        //   283: istore          80
        //   285: aload           6
        //   287: invokevirtual   android/view/Display.getHeight:()I
        //   290: istore          81
        //   292: iload_2        
        //   293: ifeq            310
        //   296: aload           6
        //   298: invokevirtual   android/view/Display.getHeight:()I
        //   301: istore          80
        //   303: aload           6
        //   305: invokevirtual   android/view/Display.getWidth:()I
        //   308: istore          81
        //   310: iload           80
        //   312: iload           81
        //   314: if_icmple       321
        //   317: iload_2        
        //   318: ifeq            1808
        //   321: bipush          90
        //   323: istore          19
        //   325: iload           7
        //   327: tableswitch {
        //                0: 1498
        //                1: 1502
        //                2: 1510
        //                3: 1519
        //          default: 356
        //        }
        //   356: iconst_0       
        //   357: istore          20
        //   359: aload_0        
        //   360: getfield        com/whatsapp/camera/CameraView.o:Z
        //   363: ifeq            389
        //   366: sipush          360
        //   369: iload           19
        //   371: iload           20
        //   373: iadd           
        //   374: sipush          360
        //   377: irem           
        //   378: isub           
        //   379: sipush          360
        //   382: irem           
        //   383: istore          21
        //   385: iload_2        
        //   386: ifeq            404
        //   389: sipush          360
        //   392: iload           19
        //   394: iload           20
        //   396: isub           
        //   397: iadd           
        //   398: sipush          360
        //   401: irem           
        //   402: istore          21
        //   404: new             Ljava/lang/StringBuilder;
        //   407: dup            
        //   408: invokespecial   java/lang/StringBuilder.<init>:()V
        //   411: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   414: bipush          9
        //   416: aaload         
        //   417: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   420: iload           20
        //   422: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   425: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   428: bipush          25
        //   430: aaload         
        //   431: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   434: iload           19
        //   436: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   439: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   442: bipush          13
        //   444: aaload         
        //   445: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   448: iload           21
        //   450: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   453: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   456: iconst_3       
        //   457: aaload         
        //   458: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   461: aload_0        
        //   462: getfield        com/whatsapp/camera/CameraView.o:Z
        //   465: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   468: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   471: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   474: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   477: bipush          8
        //   479: if_icmplt       1562
        //   482: aload_0        
        //   483: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //   486: iload           21
        //   488: invokevirtual   android/hardware/Camera.setDisplayOrientation:(I)V
        //   491: aload           9
        //   493: aload_0        
        //   494: getfield        com/whatsapp/camera/CameraView.q:Landroid/hardware/Camera$Size;
        //   497: getfield        android/hardware/Camera$Size.width:I
        //   500: aload_0        
        //   501: getfield        com/whatsapp/camera/CameraView.q:Landroid/hardware/Camera$Size;
        //   504: getfield        android/hardware/Camera$Size.height:I
        //   507: invokevirtual   android/hardware/Camera$Parameters.setPreviewSize:(II)V
        //   510: aload           9
        //   512: invokevirtual   android/hardware/Camera$Parameters.getSupportedFocusModes:()Ljava/util/List;
        //   515: astore          25
        //   517: aload           25
        //   519: ifnull          1803
        //   522: new             Ljava/lang/StringBuilder;
        //   525: dup            
        //   526: invokespecial   java/lang/StringBuilder.<init>:()V
        //   529: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   532: bipush          7
        //   534: aaload         
        //   535: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   538: aload           25
        //   540: invokeinterface java/util/List.toArray:()[Ljava/lang/Object;
        //   545: invokestatic    java/util/Arrays.deepToString:([Ljava/lang/Object;)Ljava/lang/String;
        //   548: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   551: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   554: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   557: aload           25
        //   559: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   562: bipush          17
        //   564: aaload         
        //   565: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   570: istore          77
        //   572: iload           77
        //   574: ifeq            1798
        //   577: aload           9
        //   579: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   582: bipush          19
        //   584: aaload         
        //   585: invokevirtual   android/hardware/Camera$Parameters.setFocusMode:(Ljava/lang/String;)V
        //   588: iload_2        
        //   589: ifeq            601
        //   592: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   595: bipush          16
        //   597: aaload         
        //   598: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   601: aload           9
        //   603: invokevirtual   android/hardware/Camera$Parameters.getSupportedFlashModes:()Ljava/util/List;
        //   606: astore          27
        //   608: aload           27
        //   610: ifnull          652
        //   613: new             Ljava/lang/StringBuilder;
        //   616: dup            
        //   617: invokespecial   java/lang/StringBuilder.<init>:()V
        //   620: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   623: bipush          20
        //   625: aaload         
        //   626: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   629: aload           27
        //   631: invokeinterface java/util/List.toArray:()[Ljava/lang/Object;
        //   636: invokestatic    java/util/Arrays.deepToString:([Ljava/lang/Object;)Ljava/lang/String;
        //   639: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   642: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   645: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   648: iload_2        
        //   649: ifeq            661
        //   652: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   655: bipush          15
        //   657: aaload         
        //   658: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   661: aload_0        
        //   662: getfield        com/whatsapp/camera/CameraView.f:Ljava/lang/String;
        //   665: astore          32
        //   667: aload           32
        //   669: ifnull          729
        //   672: aload           27
        //   674: ifnull          729
        //   677: aload           27
        //   679: aload_0        
        //   680: getfield        com/whatsapp/camera/CameraView.f:Ljava/lang/String;
        //   683: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   688: ifeq            729
        //   691: aload           9
        //   693: aload_0        
        //   694: getfield        com/whatsapp/camera/CameraView.f:Ljava/lang/String;
        //   697: invokevirtual   android/hardware/Camera$Parameters.setFlashMode:(Ljava/lang/String;)V
        //   700: new             Ljava/lang/StringBuilder;
        //   703: dup            
        //   704: invokespecial   java/lang/StringBuilder.<init>:()V
        //   707: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   710: bipush          8
        //   712: aaload         
        //   713: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   716: aload_0        
        //   717: getfield        com/whatsapp/camera/CameraView.f:Ljava/lang/String;
        //   720: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   723: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   726: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   729: aload           9
        //   731: invokevirtual   android/hardware/Camera$Parameters.getSupportedPictureSizes:()Ljava/util/List;
        //   734: astore          33
        //   736: aload           33
        //   738: new             Lcom/whatsapp/camera/x;
        //   741: dup            
        //   742: aload_0        
        //   743: invokespecial   com/whatsapp/camera/x.<init>:(Lcom/whatsapp/camera/CameraView;)V
        //   746: invokestatic    java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
        //   749: new             Ljava/lang/StringBuilder;
        //   752: dup            
        //   753: invokespecial   java/lang/StringBuilder.<init>:()V
        //   756: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   759: bipush          10
        //   761: aaload         
        //   762: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   765: aload           33
        //   767: invokestatic    com/whatsapp/camera/CameraView.a:(Ljava/util/List;)Ljava/lang/String;
        //   770: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   773: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   776: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   779: sipush          640
        //   782: istore          34
        //   784: sipush          480
        //   787: istore          35
        //   789: aload_0        
        //   790: getfield        com/whatsapp/camera/CameraView.q:Landroid/hardware/Camera$Size;
        //   793: ifnull          1010
        //   796: aload_0        
        //   797: getfield        com/whatsapp/camera/CameraView.q:Landroid/hardware/Camera$Size;
        //   800: getfield        android/hardware/Camera$Size.height:I
        //   803: i2f            
        //   804: aload_0        
        //   805: getfield        com/whatsapp/camera/CameraView.q:Landroid/hardware/Camera$Size;
        //   808: getfield        android/hardware/Camera$Size.width:I
        //   811: i2f            
        //   812: fdiv           
        //   813: fstore          59
        //   815: aload           33
        //   817: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   822: astore          60
        //   824: iload           35
        //   826: istore          61
        //   828: iload           34
        //   830: istore          62
        //   832: ldc_w           3.4028235E38
        //   835: fstore          63
        //   837: aload           60
        //   839: invokeinterface java/util/Iterator.hasNext:()Z
        //   844: ifeq            1757
        //   847: aload           60
        //   849: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   854: checkcast       Landroid/hardware/Camera$Size;
        //   857: astore          64
        //   859: aload           64
        //   861: getfield        android/hardware/Camera$Size.width:I
        //   864: istore          68
        //   866: aload           64
        //   868: getfield        android/hardware/Camera$Size.height:I
        //   871: istore          69
        //   873: iload           68
        //   875: iload           69
        //   877: imul           
        //   878: ldc_w           10000000
        //   881: if_icmpge       1783
        //   884: fload           63
        //   886: ldc_w           3.4028235E38
        //   889: fcmpl          
        //   890: ifeq            926
        //   893: aload           64
        //   895: getfield        android/hardware/Camera$Size.width:I
        //   898: istore          74
        //   900: aload           64
        //   902: getfield        android/hardware/Camera$Size.height:I
        //   905: istore          75
        //   907: iconst_2       
        //   908: iload           74
        //   910: iload           75
        //   912: imul           
        //   913: imul           
        //   914: iload           62
        //   916: iload           61
        //   918: imul           
        //   919: if_icmpge       926
        //   922: iload_2        
        //   923: ifeq            1757
        //   926: aload           64
        //   928: getfield        android/hardware/Camera$Size.height:I
        //   931: i2f            
        //   932: aload           64
        //   934: getfield        android/hardware/Camera$Size.width:I
        //   937: i2f            
        //   938: fdiv           
        //   939: fload           59
        //   941: fsub           
        //   942: invokestatic    java/lang/Math.abs:(F)F
        //   945: fstore          73
        //   947: fload           73
        //   949: fload           63
        //   951: fcmpg          
        //   952: ifge            1783
        //   955: aload           64
        //   957: getfield        android/hardware/Camera$Size.height:I
        //   960: istore          61
        //   962: aload           64
        //   964: getfield        android/hardware/Camera$Size.width:I
        //   967: istore          62
        //   969: fload           73
        //   971: ldc_w           0.05
        //   974: fcmpg          
        //   975: ifge            1768
        //   978: iload_2        
        //   979: ifeq            1757
        //   982: fload           73
        //   984: fstore          70
        //   986: iload           61
        //   988: istore          71
        //   990: iload           62
        //   992: istore          72
        //   994: iload_2        
        //   995: ifeq            1742
        //   998: iload           71
        //  1000: istore          35
        //  1002: iload           72
        //  1004: istore          34
        //  1006: iload_2        
        //  1007: ifeq            1119
        //  1010: aload           33
        //  1012: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1017: astore          36
        //  1019: iload           34
        //  1021: istore          37
        //  1023: iload           35
        //  1025: istore          38
        //  1027: aload           36
        //  1029: invokeinterface java/util/Iterator.hasNext:()Z
        //  1034: ifeq            1731
        //  1037: aload           36
        //  1039: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1044: checkcast       Landroid/hardware/Camera$Size;
        //  1047: astore          53
        //  1049: aload           53
        //  1051: getfield        android/hardware/Camera$Size.width:I
        //  1054: aload           53
        //  1056: getfield        android/hardware/Camera$Size.height:I
        //  1059: imul           
        //  1060: iload           37
        //  1062: iload           38
        //  1064: imul           
        //  1065: if_icmple       1720
        //  1068: aload           53
        //  1070: getfield        android/hardware/Camera$Size.width:I
        //  1073: istore          55
        //  1075: aload           53
        //  1077: getfield        android/hardware/Camera$Size.height:I
        //  1080: istore          56
        //  1082: iload           55
        //  1084: iload           56
        //  1086: imul           
        //  1087: ldc_w           10000000
        //  1090: if_icmpge       1720
        //  1093: aload           53
        //  1095: getfield        android/hardware/Camera$Size.height:I
        //  1098: istore          57
        //  1100: aload           53
        //  1102: getfield        android/hardware/Camera$Size.width:I
        //  1105: istore          58
        //  1107: iload           57
        //  1109: istore          35
        //  1111: iload           58
        //  1113: istore          34
        //  1115: iload_2        
        //  1116: ifeq            1709
        //  1119: aload_0        
        //  1120: getfield        com/whatsapp/camera/CameraView.o:Z
        //  1123: istore          41
        //  1125: iload           41
        //  1127: ifeq            1216
        //  1130: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //  1133: bipush          12
        //  1135: aaload         
        //  1136: getstatic       android/os/Build.MANUFACTURER:Ljava/lang/String;
        //  1139: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1142: ifeq            1216
        //  1145: getstatic       com/whatsapp/camera/CameraView.n:[Ljava/lang/String;
        //  1148: getstatic       android/os/Build.MODEL:Ljava/lang/String;
        //  1151: invokestatic    com/whatsapp/util/ax.a:([Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1154: istore          49
        //  1156: iload           49
        //  1158: ifeq            1216
        //  1161: aload_0        
        //  1162: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //  1165: astore          50
        //  1167: aload           50
        //  1169: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1172: pop            
        //  1173: new             Landroid/hardware/Camera$Size;
        //  1176: dup            
        //  1177: aload           50
        //  1179: sipush          1280
        //  1182: sipush          720
        //  1185: invokespecial   android/hardware/Camera$Size.<init>:(Landroid/hardware/Camera;II)V
        //  1188: astore          52
        //  1190: aload           33
        //  1192: aload           52
        //  1194: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //  1199: ifeq            1216
        //  1202: aload           52
        //  1204: getfield        android/hardware/Camera$Size.width:I
        //  1207: istore          34
        //  1209: aload           52
        //  1211: getfield        android/hardware/Camera$Size.height:I
        //  1214: istore          35
        //  1216: new             Ljava/lang/StringBuilder;
        //  1219: dup            
        //  1220: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1223: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //  1226: bipush          11
        //  1228: aaload         
        //  1229: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1232: iload           34
        //  1234: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1237: ldc_w           "x"
        //  1240: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1243: iload           35
        //  1245: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1248: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1251: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1254: aload           9
        //  1256: iload           34
        //  1258: iload           35
        //  1260: invokevirtual   android/hardware/Camera$Parameters.setPictureSize:(II)V
        //  1263: aload_0        
        //  1264: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //  1267: aload           9
        //  1269: invokevirtual   android/hardware/Camera.setParameters:(Landroid/hardware/Camera$Parameters;)V
        //  1272: aload_0        
        //  1273: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //  1276: invokevirtual   android/hardware/Camera.startPreview:()V
        //  1279: iload_1        
        //  1280: ifne            1298
        //  1283: aload_0        
        //  1284: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //  1287: new             Lcom/whatsapp/camera/o;
        //  1290: dup            
        //  1291: aload_0        
        //  1292: invokespecial   com/whatsapp/camera/o.<init>:(Lcom/whatsapp/camera/CameraView;)V
        //  1295: invokevirtual   android/hardware/Camera.autoFocus:(Landroid/hardware/Camera$AutoFocusCallback;)V
        //  1298: aload_0        
        //  1299: iconst_0       
        //  1300: putfield        com/whatsapp/camera/CameraView.d:I
        //  1303: getstatic       android/os/Build$VERSION.SDK_INT:I
        //  1306: istore          46
        //  1308: iload           46
        //  1310: bipush          8
        //  1312: if_icmplt       1437
        //  1315: aload_0        
        //  1316: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //  1319: invokevirtual   android/hardware/Camera.getParameters:()Landroid/hardware/Camera$Parameters;
        //  1322: invokevirtual   android/hardware/Camera$Parameters.isZoomSupported:()Z
        //  1325: istore          48
        //  1327: iload           48
        //  1329: ifeq            1429
        //  1332: aload_0        
        //  1333: aload_0        
        //  1334: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //  1337: invokevirtual   android/hardware/Camera.getParameters:()Landroid/hardware/Camera$Parameters;
        //  1340: invokevirtual   android/hardware/Camera$Parameters.getMaxZoom:()I
        //  1343: putfield        com/whatsapp/camera/CameraView.d:I
        //  1346: new             Ljava/lang/StringBuilder;
        //  1349: dup            
        //  1350: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1353: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //  1356: bipush          22
        //  1358: aaload         
        //  1359: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1362: aload_0        
        //  1363: getfield        com/whatsapp/camera/CameraView.d:I
        //  1366: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1369: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1372: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1375: aload_0        
        //  1376: aload_0        
        //  1377: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //  1380: invokevirtual   android/hardware/Camera.getParameters:()Landroid/hardware/Camera$Parameters;
        //  1383: invokevirtual   android/hardware/Camera$Parameters.getZoomRatios:()Ljava/util/List;
        //  1386: putfield        com/whatsapp/camera/CameraView.h:Ljava/util/List;
        //  1389: new             Ljava/lang/StringBuilder;
        //  1392: dup            
        //  1393: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1396: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //  1399: iconst_1       
        //  1400: aaload         
        //  1401: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1404: aload_0        
        //  1405: getfield        com/whatsapp/camera/CameraView.h:Ljava/util/List;
        //  1408: invokeinterface java/util/List.toArray:()[Ljava/lang/Object;
        //  1413: invokestatic    java/util/Arrays.deepToString:([Ljava/lang/Object;)Ljava/lang/String;
        //  1416: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1419: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1422: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1425: iload_2        
        //  1426: ifeq            1437
        //  1429: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //  1432: iconst_5       
        //  1433: aaload         
        //  1434: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1437: aload_0        
        //  1438: iconst_1       
        //  1439: putfield        com/whatsapp/camera/CameraView.c:Z
        //  1442: aload_0        
        //  1443: getfield        com/whatsapp/camera/CameraView.s:Lcom/whatsapp/camera/i;
        //  1446: ifnull          37
        //  1449: aload_0        
        //  1450: getfield        com/whatsapp/camera/CameraView.s:Lcom/whatsapp/camera/i;
        //  1453: invokeinterface com/whatsapp/camera/i.b:()V
        //  1458: return         
        //  1459: astore          47
        //  1461: aload           47
        //  1463: athrow         
        //  1464: iconst_0       
        //  1465: istore          8
        //  1467: goto            86
        //  1470: iload_3        
        //  1471: istore          12
        //  1473: goto            122
        //  1476: iload           4
        //  1478: istore_3       
        //  1479: goto            127
        //  1482: astore          13
        //  1484: aload           13
        //  1486: athrow         
        //  1487: astore          15
        //  1489: aload           15
        //  1491: athrow         
        //  1492: iconst_0       
        //  1493: istore          17
        //  1495: goto            250
        //  1498: iload_2        
        //  1499: ifeq            356
        //  1502: bipush          90
        //  1504: istore          20
        //  1506: iload_2        
        //  1507: ifeq            359
        //  1510: sipush          180
        //  1513: istore          20
        //  1515: iload_2        
        //  1516: ifeq            359
        //  1519: sipush          270
        //  1522: istore          20
        //  1524: goto            359
        //  1527: astore          78
        //  1529: new             Ljava/lang/StringBuilder;
        //  1532: dup            
        //  1533: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1536: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //  1539: iconst_4       
        //  1540: aaload         
        //  1541: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1544: aload           78
        //  1546: invokevirtual   java/lang/RuntimeException.toString:()Ljava/lang/String;
        //  1549: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1552: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1555: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  1558: iload_2        
        //  1559: ifeq            491
        //  1562: aload           9
        //  1564: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //  1567: bipush          6
        //  1569: aaload         
        //  1570: iload           21
        //  1572: invokevirtual   android/hardware/Camera$Parameters.set:(Ljava/lang/String;I)V
        //  1575: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //  1578: bipush          18
        //  1580: aaload         
        //  1581: astore          23
        //  1583: iload           8
        //  1585: ifeq            1618
        //  1588: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //  1591: bipush          14
        //  1593: aaload         
        //  1594: astore          24
        //  1596: aload           9
        //  1598: aload           23
        //  1600: aload           24
        //  1602: invokevirtual   android/hardware/Camera$Parameters.set:(Ljava/lang/String;Ljava/lang/String;)V
        //  1605: goto            491
        //  1608: astore          79
        //  1610: aload           79
        //  1612: athrow         
        //  1613: astore          22
        //  1615: aload           22
        //  1617: athrow         
        //  1618: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //  1621: bipush          24
        //  1623: aaload         
        //  1624: astore          24
        //  1626: goto            1596
        //  1629: astore          76
        //  1631: aload           76
        //  1633: athrow         
        //  1634: astore          26
        //  1636: aload           26
        //  1638: athrow         
        //  1639: astore          28
        //  1641: aload           28
        //  1643: athrow         
        //  1644: astore          29
        //  1646: aload           29
        //  1648: athrow         
        //  1649: astore          30
        //  1651: aload           30
        //  1653: athrow         
        //  1654: astore          31
        //  1656: aload           31
        //  1658: athrow         
        //  1659: astore          65
        //  1661: aload           65
        //  1663: athrow         
        //  1664: astore          66
        //  1666: aload           66
        //  1668: athrow         
        //  1669: astore          67
        //  1671: aload           67
        //  1673: athrow         
        //  1674: astore          54
        //  1676: aload           54
        //  1678: athrow         
        //  1679: astore          39
        //  1681: aload           39
        //  1683: athrow         
        //  1684: astore          40
        //  1686: aload           40
        //  1688: athrow         
        //  1689: astore          42
        //  1691: aload           42
        //  1693: athrow         
        //  1694: astore          43
        //  1696: aload           43
        //  1698: athrow         
        //  1699: astore          44
        //  1701: aload           44
        //  1703: athrow         
        //  1704: astore          45
        //  1706: aload           45
        //  1708: athrow         
        //  1709: iload           34
        //  1711: istore          37
        //  1713: iload           35
        //  1715: istore          38
        //  1717: goto            1027
        //  1720: iload           38
        //  1722: istore          35
        //  1724: iload           37
        //  1726: istore          34
        //  1728: goto            1115
        //  1731: iload           38
        //  1733: istore          35
        //  1735: iload           37
        //  1737: istore          34
        //  1739: goto            1119
        //  1742: iload           72
        //  1744: istore          62
        //  1746: iload           71
        //  1748: istore          61
        //  1750: fload           70
        //  1752: fstore          63
        //  1754: goto            837
        //  1757: iload           61
        //  1759: istore          35
        //  1761: iload           62
        //  1763: istore          34
        //  1765: goto            1006
        //  1768: fload           73
        //  1770: fstore          70
        //  1772: iload           61
        //  1774: istore          71
        //  1776: iload           62
        //  1778: istore          72
        //  1780: goto            994
        //  1783: fload           63
        //  1785: fstore          70
        //  1787: iload           61
        //  1789: istore          71
        //  1791: iload           62
        //  1793: istore          72
        //  1795: goto            994
        //  1798: iconst_0       
        //  1799: istore_1       
        //  1800: goto            601
        //  1803: iconst_0       
        //  1804: istore_1       
        //  1805: goto            592
        //  1808: iconst_0       
        //  1809: istore          19
        //  1811: goto            325
        //  1814: iload           18
        //  1816: istore          19
        //  1818: goto            325
        //  1821: aload           10
        //  1823: astore          11
        //  1825: goto            113
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  17     37     38     43     Ljava/lang/RuntimeException;
        //  127    155    1482   1487   Ljava/lang/RuntimeException;
        //  225    241    1487   1492   Ljava/lang/RuntimeException;
        //  482    491    1527   1613   Ljava/lang/RuntimeException;
        //  522    572    1629   1634   Ljava/lang/RuntimeException;
        //  592    601    1634   1639   Ljava/lang/RuntimeException;
        //  613    648    1639   1644   Ljava/lang/RuntimeException;
        //  652    661    1639   1644   Ljava/lang/RuntimeException;
        //  661    667    1644   1654   Ljava/lang/RuntimeException;
        //  677    729    1654   1659   Ljava/lang/RuntimeException;
        //  859    873    1659   1669   Ljava/lang/RuntimeException;
        //  893    907    1669   1674   Ljava/lang/RuntimeException;
        //  1049   1082   1674   1679   Ljava/lang/RuntimeException;
        //  1119   1125   1679   1684   Ljava/lang/RuntimeException;
        //  1130   1156   1684   1689   Ljava/lang/RuntimeException;
        //  1216   1279   1689   1694   Ljava/lang/RuntimeException;
        //  1283   1298   1689   1694   Ljava/lang/RuntimeException;
        //  1298   1308   1694   1699   Ljava/lang/RuntimeException;
        //  1315   1327   1699   1704   Ljava/lang/RuntimeException;
        //  1332   1425   1704   1709   Ljava/lang/RuntimeException;
        //  1429   1437   1704   1709   Ljava/lang/RuntimeException;
        //  1437   1458   1459   1464   Ljava/lang/RuntimeException;
        //  1529   1558   1608   1613   Ljava/lang/RuntimeException;
        //  1562   1583   1613   1618   Ljava/lang/RuntimeException;
        //  1588   1596   1613   1618   Ljava/lang/RuntimeException;
        //  1610   1613   1613   1618   Ljava/lang/RuntimeException;
        //  1646   1649   1649   1654   Ljava/lang/RuntimeException;
        //  1651   1654   1654   1659   Ljava/lang/RuntimeException;
        //  1661   1664   1664   1669   Ljava/lang/RuntimeException;
        //  1666   1669   1669   1674   Ljava/lang/RuntimeException;
        //  1681   1684   1684   1689   Ljava/lang/RuntimeException;
        //  1696   1699   1699   1704   Ljava/lang/RuntimeException;
        //  1701   1704   1704   1709   Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 811, Size: 811
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
    
    static boolean b(final CameraView cameraView) {
        return cameraView.a;
    }
    
    private boolean b(final File p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/camera/CameraActivity.m:Z
        //     3: istore_2       
        //     4: new             Ljava/lang/StringBuilder;
        //     7: dup            
        //     8: invokespecial   java/lang/StringBuilder.<init>:()V
        //    11: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //    14: bipush          88
        //    16: aaload         
        //    17: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    20: aload_0        
        //    21: getfield        com/whatsapp/camera/CameraView.o:Z
        //    24: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //    27: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    30: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    33: aload_0        
        //    34: new             Landroid/media/MediaRecorder;
        //    37: dup            
        //    38: invokespecial   android/media/MediaRecorder.<init>:()V
        //    41: putfield        com/whatsapp/camera/CameraView.p:Landroid/media/MediaRecorder;
        //    44: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    47: istore          5
        //    49: aconst_null    
        //    50: astore          6
        //    52: iload           5
        //    54: bipush          8
        //    56: if_icmplt       1821
        //    59: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    62: istore          7
        //    64: iload           7
        //    66: bipush          11
        //    68: if_icmplt       157
        //    71: aload_0        
        //    72: getfield        com/whatsapp/camera/CameraView.l:I
        //    75: iconst_4       
        //    76: invokestatic    android/media/CamcorderProfile.hasProfile:(II)Z
        //    79: istore          131
        //    81: iload           131
        //    83: ifeq            120
        //    86: aload_0        
        //    87: getfield        com/whatsapp/camera/CameraView.l:I
        //    90: iconst_4       
        //    91: invokestatic    android/media/CamcorderProfile.get:(II)Landroid/media/CamcorderProfile;
        //    94: astore          8
        //    96: aload           8
        //    98: ifnonnull       192
        //   101: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   104: bipush          64
        //   106: aaload         
        //   107: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   110: iconst_0       
        //   111: ireturn        
        //   112: astore_3       
        //   113: aload_3        
        //   114: athrow         
        //   115: astore          4
        //   117: aload           4
        //   119: athrow         
        //   120: aload_0        
        //   121: getfield        com/whatsapp/camera/CameraView.l:I
        //   124: iconst_5       
        //   125: invokestatic    android/media/CamcorderProfile.hasProfile:(II)Z
        //   128: ifeq            144
        //   131: aload_0        
        //   132: getfield        com/whatsapp/camera/CameraView.l:I
        //   135: iconst_5       
        //   136: invokestatic    android/media/CamcorderProfile.get:(II)Landroid/media/CamcorderProfile;
        //   139: astore          8
        //   141: goto            96
        //   144: aload_0        
        //   145: getfield        com/whatsapp/camera/CameraView.l:I
        //   148: iconst_1       
        //   149: invokestatic    android/media/CamcorderProfile.get:(II)Landroid/media/CamcorderProfile;
        //   152: astore          8
        //   154: goto            96
        //   157: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   160: bipush          9
        //   162: if_icmplt       178
        //   165: aload_0        
        //   166: getfield        com/whatsapp/camera/CameraView.l:I
        //   169: iconst_1       
        //   170: invokestatic    android/media/CamcorderProfile.get:(II)Landroid/media/CamcorderProfile;
        //   173: astore          8
        //   175: goto            96
        //   178: iconst_1       
        //   179: invokestatic    android/media/CamcorderProfile.get:(I)Landroid/media/CamcorderProfile;
        //   182: astore          8
        //   184: goto            96
        //   187: astore          130
        //   189: aload           130
        //   191: athrow         
        //   192: new             Ljava/lang/StringBuilder;
        //   195: dup            
        //   196: invokespecial   java/lang/StringBuilder.<init>:()V
        //   199: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   202: bipush          84
        //   204: aaload         
        //   205: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   208: aload           8
        //   210: getfield        android/media/CamcorderProfile.videoFrameWidth:I
        //   213: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   216: ldc_w           "x"
        //   219: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   222: aload           8
        //   224: getfield        android/media/CamcorderProfile.videoFrameHeight:I
        //   227: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   230: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   233: bipush          66
        //   235: aaload         
        //   236: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   239: aload           8
        //   241: getfield        android/media/CamcorderProfile.videoCodec:I
        //   244: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   247: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   250: bipush          79
        //   252: aaload         
        //   253: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   256: aload           8
        //   258: getfield        android/media/CamcorderProfile.audioCodec:I
        //   261: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   264: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   267: bipush          69
        //   269: aaload         
        //   270: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   273: aload           8
        //   275: getfield        android/media/CamcorderProfile.fileFormat:I
        //   278: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   281: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   284: bipush          75
        //   286: aaload         
        //   287: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   290: aload           8
        //   292: getfield        android/media/CamcorderProfile.videoFrameRate:I
        //   295: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   298: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   301: bipush          73
        //   303: aaload         
        //   304: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   307: aload           8
        //   309: getfield        android/media/CamcorderProfile.videoBitRate:I
        //   312: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   315: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   318: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   321: aload_0        
        //   322: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //   325: invokevirtual   android/hardware/Camera.getParameters:()Landroid/hardware/Camera$Parameters;
        //   328: astore          9
        //   330: aload           9
        //   332: invokevirtual   android/hardware/Camera$Parameters.getSupportedPreviewSizes:()Ljava/util/List;
        //   335: astore          10
        //   337: aload           10
        //   339: ifnonnull       2270
        //   342: aload_0        
        //   343: invokespecial   com/whatsapp/camera/CameraView.c:()Ljava/util/List;
        //   346: astore          11
        //   348: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   351: istore          12
        //   353: aconst_null    
        //   354: astore          13
        //   356: iload           12
        //   358: bipush          11
        //   360: if_icmplt       370
        //   363: aload           9
        //   365: invokevirtual   android/hardware/Camera$Parameters.getSupportedVideoSizes:()Ljava/util/List;
        //   368: astore          13
        //   370: aload           13
        //   372: ifnonnull       2263
        //   375: aload           11
        //   377: astore          14
        //   379: aload           14
        //   381: ifnull          398
        //   384: aload           14
        //   386: invokeinterface java/util/List.isEmpty:()Z
        //   391: istore          17
        //   393: iload           17
        //   395: ifeq            419
        //   398: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   401: bipush          63
        //   403: aaload         
        //   404: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   407: iconst_0       
        //   408: ireturn        
        //   409: astore          16
        //   411: aload           16
        //   413: athrow         
        //   414: astore          15
        //   416: aload           15
        //   418: athrow         
        //   419: ldc_w           2147483647
        //   422: istore          18
        //   424: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   427: bipush          11
        //   429: if_icmplt       2253
        //   432: aload           9
        //   434: invokevirtual   android/hardware/Camera$Parameters.getPreferredPreviewSizeForVideo:()Landroid/hardware/Camera$Size;
        //   437: astore          124
        //   439: aload           124
        //   441: ifnull          535
        //   444: new             Ljava/lang/StringBuilder;
        //   447: dup            
        //   448: invokespecial   java/lang/StringBuilder.<init>:()V
        //   451: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   454: bipush          70
        //   456: aaload         
        //   457: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   460: aload           124
        //   462: getfield        android/hardware/Camera$Size.width:I
        //   465: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   468: ldc_w           "x"
        //   471: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   474: aload           124
        //   476: getfield        android/hardware/Camera$Size.height:I
        //   479: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   482: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   485: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   488: aload           124
        //   490: getfield        android/hardware/Camera$Size.width:I
        //   493: istore          128
        //   495: iload           128
        //   497: sipush          176
        //   500: if_icmpne       518
        //   503: aload           124
        //   505: getfield        android/hardware/Camera$Size.height:I
        //   508: istore          129
        //   510: iload           129
        //   512: sipush          144
        //   515: if_icmpeq       2242
        //   518: aload           124
        //   520: getfield        android/hardware/Camera$Size.width:I
        //   523: aload           124
        //   525: getfield        android/hardware/Camera$Size.height:I
        //   528: imul           
        //   529: istore          18
        //   531: iload_2        
        //   532: ifeq            2242
        //   535: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   538: bipush          78
        //   540: aaload         
        //   541: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   544: iload           18
        //   546: istore          19
        //   548: aload           124
        //   550: astore          20
        //   552: new             Ljava/lang/StringBuilder;
        //   555: dup            
        //   556: invokespecial   java/lang/StringBuilder.<init>:()V
        //   559: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   562: bipush          86
        //   564: aaload         
        //   565: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   568: aload           14
        //   570: invokestatic    com/whatsapp/camera/CameraView.a:(Ljava/util/List;)Ljava/lang/String;
        //   573: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   576: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   579: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   582: new             Ljava/lang/StringBuilder;
        //   585: dup            
        //   586: invokespecial   java/lang/StringBuilder.<init>:()V
        //   589: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   592: bipush          89
        //   594: aaload         
        //   595: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   598: aload           11
        //   600: invokestatic    com/whatsapp/camera/CameraView.a:(Ljava/util/List;)Ljava/lang/String;
        //   603: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   606: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   609: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   612: aload           14
        //   614: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   619: astore          21
        //   621: aconst_null    
        //   622: astore          22
        //   624: aload           21
        //   626: invokeinterface java/util/Iterator.hasNext:()Z
        //   631: ifeq            806
        //   634: aload           21
        //   636: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   641: checkcast       Landroid/hardware/Camera$Size;
        //   644: astore          105
        //   646: aload           105
        //   648: getfield        android/hardware/Camera$Size.height:I
        //   651: sipush          480
        //   654: if_icmpgt       2228
        //   657: aload           105
        //   659: getfield        android/hardware/Camera$Size.width:I
        //   662: istore          110
        //   664: iload           110
        //   666: sipush          720
        //   669: if_icmpgt       2228
        //   672: aload           105
        //   674: getfield        android/hardware/Camera$Size.height:I
        //   677: istore          111
        //   679: aload           8
        //   681: getfield        android/media/CamcorderProfile.videoFrameHeight:I
        //   684: istore          112
        //   686: iload           111
        //   688: iload           112
        //   690: if_icmpgt       2228
        //   693: aload           105
        //   695: getfield        android/hardware/Camera$Size.width:I
        //   698: istore          113
        //   700: aload           8
        //   702: getfield        android/media/CamcorderProfile.videoFrameWidth:I
        //   705: istore          114
        //   707: iload           113
        //   709: iload           114
        //   711: if_icmpgt       2228
        //   714: aload           22
        //   716: ifnonnull       727
        //   719: iload_2        
        //   720: ifeq            798
        //   723: aload           105
        //   725: astore          22
        //   727: aload           105
        //   729: getfield        android/hardware/Camera$Size.height:I
        //   732: istore          116
        //   734: aload           22
        //   736: getfield        android/hardware/Camera$Size.height:I
        //   739: istore          117
        //   741: iload           116
        //   743: iload           117
        //   745: if_icmple       756
        //   748: iload_2        
        //   749: ifeq            798
        //   752: aload           105
        //   754: astore          22
        //   756: aload           105
        //   758: getfield        android/hardware/Camera$Size.height:I
        //   761: istore          120
        //   763: aload           22
        //   765: getfield        android/hardware/Camera$Size.height:I
        //   768: istore          121
        //   770: iload           120
        //   772: iload           121
        //   774: if_icmpne       2228
        //   777: aload           105
        //   779: getfield        android/hardware/Camera$Size.width:I
        //   782: istore          122
        //   784: aload           22
        //   786: getfield        android/hardware/Camera$Size.width:I
        //   789: istore          123
        //   791: iload           122
        //   793: iload           123
        //   795: if_icmple       2228
        //   798: iload_2        
        //   799: ifeq            2235
        //   802: aload           105
        //   804: astore          22
        //   806: aload           22
        //   808: ifnonnull       877
        //   811: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   814: bipush          85
        //   816: aaload         
        //   817: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   820: iconst_0       
        //   821: ireturn        
        //   822: astore          126
        //   824: aload           126
        //   826: athrow         
        //   827: astore          127
        //   829: aload           127
        //   831: athrow         
        //   832: astore          125
        //   834: aload           125
        //   836: athrow         
        //   837: astore          106
        //   839: aload           106
        //   841: athrow         
        //   842: astore          107
        //   844: aload           107
        //   846: athrow         
        //   847: astore          108
        //   849: aload           108
        //   851: athrow         
        //   852: astore          109
        //   854: aload           109
        //   856: athrow         
        //   857: astore          115
        //   859: aload           115
        //   861: athrow         
        //   862: astore          118
        //   864: aload           118
        //   866: athrow         
        //   867: astore          119
        //   869: aload           119
        //   871: athrow         
        //   872: astore          104
        //   874: aload           104
        //   876: athrow         
        //   877: aload           11
        //   879: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   884: astore          23
        //   886: aload           23
        //   888: invokeinterface java/util/Iterator.hasNext:()Z
        //   893: ifeq            2222
        //   896: aload           23
        //   898: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   903: checkcast       Landroid/hardware/Camera$Size;
        //   906: astore          24
        //   908: aload           22
        //   910: aload           24
        //   912: invokevirtual   android/hardware/Camera$Size.equals:(Ljava/lang/Object;)Z
        //   915: ifeq            886
        //   918: aload_0        
        //   919: getfield        com/whatsapp/camera/CameraView.o:Z
        //   922: ifeq            2215
        //   925: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   928: istore          96
        //   930: iload           96
        //   932: bipush          17
        //   934: if_icmplt       2215
        //   937: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   940: istore          97
        //   942: iload           97
        //   944: bipush          19
        //   946: if_icmpgt       2215
        //   949: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   952: bipush          82
        //   954: aaload         
        //   955: getstatic       android/os/Build.MANUFACTURER:Ljava/lang/String;
        //   958: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   961: istore          98
        //   963: iload           98
        //   965: ifeq            2215
        //   968: getstatic       com/whatsapp/camera/CameraView.r:[Ljava/lang/String;
        //   971: getstatic       android/os/Build.MODEL:Ljava/lang/String;
        //   974: invokestatic    com/whatsapp/util/ax.a:([Ljava/lang/Object;Ljava/lang/Object;)Z
        //   977: istore          99
        //   979: iload           99
        //   981: ifeq            2215
        //   984: aload_0        
        //   985: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //   988: astore          100
        //   990: aload           100
        //   992: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   995: pop            
        //   996: new             Landroid/hardware/Camera$Size;
        //   999: dup            
        //  1000: aload           100
        //  1002: sipush          1440
        //  1005: sipush          1080
        //  1008: invokespecial   android/hardware/Camera$Size.<init>:(Landroid/hardware/Camera;II)V
        //  1011: astore          24
        //  1013: aload_0        
        //  1014: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //  1017: astore          102
        //  1019: aload           102
        //  1021: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1024: pop            
        //  1025: new             Landroid/hardware/Camera$Size;
        //  1028: dup            
        //  1029: aload           102
        //  1031: sipush          640
        //  1034: sipush          480
        //  1037: invokespecial   android/hardware/Camera$Size.<init>:(Landroid/hardware/Camera;II)V
        //  1040: astore          29
        //  1042: aload           24
        //  1044: ifnonnull       2132
        //  1047: ldc2_w          1.7976931348623157E308
        //  1050: dstore          56
        //  1052: aload           29
        //  1054: getfield        android/hardware/Camera$Size.width:I
        //  1057: i2d            
        //  1058: aload           29
        //  1060: getfield        android/hardware/Camera$Size.height:I
        //  1063: i2d            
        //  1064: ddiv           
        //  1065: dstore          58
        //  1067: aload           11
        //  1069: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1074: astore          60
        //  1076: aload           24
        //  1078: astore          61
        //  1080: aload           60
        //  1082: invokeinterface java/util/Iterator.hasNext:()Z
        //  1087: ifeq            2208
        //  1090: aload           60
        //  1092: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1097: checkcast       Landroid/hardware/Camera$Size;
        //  1100: astore          24
        //  1102: aload           24
        //  1104: getfield        android/hardware/Camera$Size.width:I
        //  1107: aload           29
        //  1109: getfield        android/hardware/Camera$Size.width:I
        //  1112: if_icmplt       2194
        //  1115: aload           24
        //  1117: getfield        android/hardware/Camera$Size.height:I
        //  1120: istore          83
        //  1122: aload           29
        //  1124: getfield        android/hardware/Camera$Size.height:I
        //  1127: istore          84
        //  1129: iload           83
        //  1131: iload           84
        //  1133: if_icmplt       2194
        //  1136: aload           24
        //  1138: getfield        android/hardware/Camera$Size.height:I
        //  1141: istore          85
        //  1143: aload           24
        //  1145: getfield        android/hardware/Camera$Size.width:I
        //  1148: istore          86
        //  1150: iload           85
        //  1152: iload           86
        //  1154: imul           
        //  1155: iload           19
        //  1157: if_icmpgt       2194
        //  1160: aload           24
        //  1162: getfield        android/hardware/Camera$Size.width:I
        //  1165: i2d            
        //  1166: aload           24
        //  1168: getfield        android/hardware/Camera$Size.height:I
        //  1171: i2d            
        //  1172: ddiv           
        //  1173: dstore          87
        //  1175: aload           61
        //  1177: ifnonnull       1192
        //  1180: iload_2        
        //  1181: ifeq            2201
        //  1184: dload           87
        //  1186: dstore          56
        //  1188: aload           24
        //  1190: astore          61
        //  1192: dload           58
        //  1194: dload           87
        //  1196: dsub           
        //  1197: dstore          89
        //  1199: dload           89
        //  1201: invokestatic    java/lang/Math.abs:(D)D
        //  1204: dstore          92
        //  1206: dload           58
        //  1208: dload           56
        //  1210: dsub           
        //  1211: invokestatic    java/lang/Math.abs:(D)D
        //  1214: dstore          94
        //  1216: dload           92
        //  1218: dload           94
        //  1220: dcmpg          
        //  1221: ifge            2194
        //  1224: dload           87
        //  1226: dstore          56
        //  1228: iload_2        
        //  1229: ifeq            2187
        //  1232: aload           24
        //  1234: ifnonnull       1377
        //  1237: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //  1240: bipush          91
        //  1242: aaload         
        //  1243: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1246: aload           11
        //  1248: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1253: astore          62
        //  1255: aload           24
        //  1257: astore          63
        //  1259: aload           62
        //  1261: invokeinterface java/util/Iterator.hasNext:()Z
        //  1266: ifeq            2180
        //  1269: aload           62
        //  1271: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1276: checkcast       Landroid/hardware/Camera$Size;
        //  1279: astore          64
        //  1281: aload           64
        //  1283: getfield        android/hardware/Camera$Size.height:I
        //  1286: aload           64
        //  1288: getfield        android/hardware/Camera$Size.width:I
        //  1291: imul           
        //  1292: iload           19
        //  1294: if_icmpgt       2154
        //  1297: aload           64
        //  1299: getfield        android/hardware/Camera$Size.width:I
        //  1302: i2d            
        //  1303: aload           64
        //  1305: getfield        android/hardware/Camera$Size.height:I
        //  1308: i2d            
        //  1309: ddiv           
        //  1310: dstore          72
        //  1312: aload           63
        //  1314: ifnonnull       1329
        //  1317: iload_2        
        //  1318: ifeq            2169
        //  1321: dload           72
        //  1323: dstore          56
        //  1325: aload           64
        //  1327: astore          63
        //  1329: dload           58
        //  1331: dload           72
        //  1333: dsub           
        //  1334: dstore          74
        //  1336: dload           74
        //  1338: invokestatic    java/lang/Math.abs:(D)D
        //  1341: dstore          77
        //  1343: dload           58
        //  1345: dload           56
        //  1347: dsub           
        //  1348: invokestatic    java/lang/Math.abs:(D)D
        //  1351: dstore          79
        //  1353: dload           77
        //  1355: dload           79
        //  1357: dcmpg          
        //  1358: ifge            2154
        //  1361: aload           64
        //  1363: astore          67
        //  1365: dload           72
        //  1367: dstore          68
        //  1369: iload_2        
        //  1370: ifeq            2139
        //  1373: aload           67
        //  1375: astore          24
        //  1377: aload           24
        //  1379: ifnonnull       2132
        //  1382: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //  1385: bipush          67
        //  1387: aaload         
        //  1388: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1391: aload           20
        //  1393: ifnonnull       1452
        //  1396: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //  1399: bipush          72
        //  1401: aaload         
        //  1402: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  1405: iconst_0       
        //  1406: ireturn        
        //  1407: astore          25
        //  1409: aload           25
        //  1411: athrow         
        //  1412: astore          26
        //  1414: aload           26
        //  1416: athrow         
        //  1417: astore          27
        //  1419: aload           27
        //  1421: athrow         
        //  1422: astore          28
        //  1424: aload           28
        //  1426: athrow         
        //  1427: astore          81
        //  1429: aload           81
        //  1431: athrow         
        //  1432: astore          82
        //  1434: aload           82
        //  1436: athrow         
        //  1437: astore          91
        //  1439: aload           91
        //  1441: athrow         
        //  1442: astore          76
        //  1444: aload           76
        //  1446: athrow         
        //  1447: astore          55
        //  1449: aload           55
        //  1451: athrow         
        //  1452: aload           8
        //  1454: aload           29
        //  1456: getfield        android/hardware/Camera$Size.width:I
        //  1459: putfield        android/media/CamcorderProfile.videoFrameWidth:I
        //  1462: aload           8
        //  1464: aload           29
        //  1466: getfield        android/hardware/Camera$Size.height:I
        //  1469: putfield        android/media/CamcorderProfile.videoFrameHeight:I
        //  1472: aload           8
        //  1474: iconst_4       
        //  1475: aload           8
        //  1477: getfield        android/media/CamcorderProfile.videoFrameWidth:I
        //  1480: aload           8
        //  1482: getfield        android/media/CamcorderProfile.videoFrameHeight:I
        //  1485: imul           
        //  1486: imul           
        //  1487: putfield        android/media/CamcorderProfile.videoBitRate:I
        //  1490: new             Ljava/lang/StringBuilder;
        //  1493: dup            
        //  1494: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1497: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //  1500: bipush          83
        //  1502: aaload         
        //  1503: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1506: aload           8
        //  1508: getfield        android/media/CamcorderProfile.videoFrameWidth:I
        //  1511: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1514: ldc_w           "x"
        //  1517: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1520: aload           8
        //  1522: getfield        android/media/CamcorderProfile.videoFrameHeight:I
        //  1525: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1528: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //  1531: bipush          68
        //  1533: aaload         
        //  1534: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1537: aload           8
        //  1539: getfield        android/media/CamcorderProfile.videoBitRate:I
        //  1542: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1545: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //  1548: bipush          76
        //  1550: aaload         
        //  1551: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1554: aload           20
        //  1556: getfield        android/hardware/Camera$Size.width:I
        //  1559: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1562: ldc_w           "x"
        //  1565: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1568: aload           20
        //  1570: getfield        android/hardware/Camera$Size.height:I
        //  1573: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1576: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1579: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1582: aload           9
        //  1584: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //  1587: bipush          77
        //  1589: aaload         
        //  1590: iconst_1       
        //  1591: invokevirtual   android/hardware/Camera$Parameters.set:(Ljava/lang/String;I)V
        //  1594: aload           9
        //  1596: invokevirtual   android/hardware/Camera$Parameters.getSupportedFocusModes:()Ljava/util/List;
        //  1599: astore          30
        //  1601: aload           30
        //  1603: ifnull          1711
        //  1606: new             Ljava/lang/StringBuilder;
        //  1609: dup            
        //  1610: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1613: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //  1616: bipush          90
        //  1618: aaload         
        //  1619: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1622: aload           30
        //  1624: invokeinterface java/util/List.toArray:()[Ljava/lang/Object;
        //  1629: invokestatic    java/util/Arrays.deepToString:([Ljava/lang/Object;)Ljava/lang/String;
        //  1632: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1635: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1638: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1641: aload           30
        //  1643: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //  1646: bipush          92
        //  1648: aaload         
        //  1649: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //  1654: istore          53
        //  1656: iload           53
        //  1658: ifeq            1676
        //  1661: aload           9
        //  1663: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //  1666: bipush          81
        //  1668: aaload         
        //  1669: invokevirtual   android/hardware/Camera$Parameters.setFocusMode:(Ljava/lang/String;)V
        //  1672: iload_2        
        //  1673: ifeq            1720
        //  1676: aload           30
        //  1678: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //  1681: bipush          62
        //  1683: aaload         
        //  1684: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //  1689: istore          54
        //  1691: iload           54
        //  1693: ifeq            1720
        //  1696: aload           9
        //  1698: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //  1701: bipush          65
        //  1703: aaload         
        //  1704: invokevirtual   android/hardware/Camera$Parameters.setFocusMode:(Ljava/lang/String;)V
        //  1707: iload_2        
        //  1708: ifeq            1720
        //  1711: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //  1714: bipush          71
        //  1716: aaload         
        //  1717: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1720: aload_0        
        //  1721: aload           20
        //  1723: putfield        com/whatsapp/camera/CameraView.e:Landroid/hardware/Camera$Size;
        //  1726: aload           9
        //  1728: aload           20
        //  1730: getfield        android/hardware/Camera$Size.width:I
        //  1733: aload           20
        //  1735: getfield        android/hardware/Camera$Size.height:I
        //  1738: invokevirtual   android/hardware/Camera$Parameters.setPreviewSize:(II)V
        //  1741: aload           20
        //  1743: aload_0        
        //  1744: getfield        com/whatsapp/camera/CameraView.q:Landroid/hardware/Camera$Size;
        //  1747: invokevirtual   android/hardware/Camera$Size.equals:(Ljava/lang/Object;)Z
        //  1750: istore          33
        //  1752: iload           33
        //  1754: ifne            2051
        //  1757: iconst_1       
        //  1758: istore          34
        //  1760: iload           34
        //  1762: ifeq            1772
        //  1765: aload_0        
        //  1766: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //  1769: invokevirtual   android/hardware/Camera.stopPreview:()V
        //  1772: aload_0        
        //  1773: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //  1776: aload           9
        //  1778: invokevirtual   android/hardware/Camera.setParameters:(Landroid/hardware/Camera$Parameters;)V
        //  1781: iload           34
        //  1783: ifeq            1817
        //  1786: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //  1789: bipush          74
        //  1791: aaload         
        //  1792: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1795: aload_0        
        //  1796: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //  1799: aload_0        
        //  1800: getfield        com/whatsapp/camera/CameraView.m:Landroid/view/SurfaceHolder;
        //  1803: invokevirtual   android/hardware/Camera.setPreviewDisplay:(Landroid/view/SurfaceHolder;)V
        //  1806: aload_0        
        //  1807: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //  1810: invokevirtual   android/hardware/Camera.startPreview:()V
        //  1813: aload_0        
        //  1814: invokevirtual   com/whatsapp/camera/CameraView.requestLayout:()V
        //  1817: aload           8
        //  1819: astore          6
        //  1821: aload_0        
        //  1822: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //  1825: invokevirtual   android/hardware/Camera.unlock:()V
        //  1828: aload_0        
        //  1829: getfield        com/whatsapp/camera/CameraView.p:Landroid/media/MediaRecorder;
        //  1832: aload_0        
        //  1833: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //  1836: invokevirtual   android/media/MediaRecorder.setCamera:(Landroid/hardware/Camera;)V
        //  1839: aload_0        
        //  1840: getfield        com/whatsapp/camera/CameraView.p:Landroid/media/MediaRecorder;
        //  1843: iconst_5       
        //  1844: invokevirtual   android/media/MediaRecorder.setAudioSource:(I)V
        //  1847: aload_0        
        //  1848: getfield        com/whatsapp/camera/CameraView.p:Landroid/media/MediaRecorder;
        //  1851: iconst_1       
        //  1852: invokevirtual   android/media/MediaRecorder.setVideoSource:(I)V
        //  1855: getstatic       android/os/Build$VERSION.SDK_INT:I
        //  1858: bipush          8
        //  1860: if_icmplt       1876
        //  1863: aload_0        
        //  1864: getfield        com/whatsapp/camera/CameraView.p:Landroid/media/MediaRecorder;
        //  1867: aload           6
        //  1869: invokevirtual   android/media/MediaRecorder.setProfile:(Landroid/media/CamcorderProfile;)V
        //  1872: iload_2        
        //  1873: ifeq            1900
        //  1876: aload_0        
        //  1877: getfield        com/whatsapp/camera/CameraView.p:Landroid/media/MediaRecorder;
        //  1880: iconst_2       
        //  1881: invokevirtual   android/media/MediaRecorder.setOutputFormat:(I)V
        //  1884: aload_0        
        //  1885: getfield        com/whatsapp/camera/CameraView.p:Landroid/media/MediaRecorder;
        //  1888: iconst_0       
        //  1889: invokevirtual   android/media/MediaRecorder.setAudioEncoder:(I)V
        //  1892: aload_0        
        //  1893: getfield        com/whatsapp/camera/CameraView.p:Landroid/media/MediaRecorder;
        //  1896: iconst_0       
        //  1897: invokevirtual   android/media/MediaRecorder.setVideoEncoder:(I)V
        //  1900: aload_0        
        //  1901: getfield        com/whatsapp/camera/CameraView.p:Landroid/media/MediaRecorder;
        //  1904: aload_1        
        //  1905: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //  1908: invokevirtual   android/media/MediaRecorder.setOutputFile:(Ljava/lang/String;)V
        //  1911: aload_0        
        //  1912: getfield        com/whatsapp/camera/CameraView.p:Landroid/media/MediaRecorder;
        //  1915: aload_0        
        //  1916: invokevirtual   com/whatsapp/camera/CameraView.getHolder:()Landroid/view/SurfaceHolder;
        //  1919: invokeinterface android/view/SurfaceHolder.getSurface:()Landroid/view/Surface;
        //  1924: invokevirtual   android/media/MediaRecorder.setPreviewDisplay:(Landroid/view/Surface;)V
        //  1927: getstatic       android/os/Build$VERSION.SDK_INT:I
        //  1930: bipush          9
        //  1932: if_icmplt       2012
        //  1935: aload_0        
        //  1936: invokespecial   com/whatsapp/camera/CameraView.d:()I
        //  1939: istore          41
        //  1941: aload_0        
        //  1942: getfield        com/whatsapp/camera/CameraView.o:Z
        //  1945: ifeq            2003
        //  1948: getstatic       android/os/Build$VERSION.SDK_INT:I
        //  1951: istore          45
        //  1953: iload           45
        //  1955: bipush          14
        //  1957: if_icmpeq       1972
        //  1960: getstatic       android/os/Build$VERSION.SDK_INT:I
        //  1963: istore          47
        //  1965: iload           47
        //  1967: bipush          15
        //  1969: if_icmpne       2003
        //  1972: getstatic       android/os/Build.MANUFACTURER:Ljava/lang/String;
        //  1975: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //  1978: bipush          80
        //  1980: aaload         
        //  1981: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1984: istore          46
        //  1986: iload           46
        //  1988: ifeq            2003
        //  1991: sipush          360
        //  1994: iload           41
        //  1996: isub           
        //  1997: sipush          360
        //  2000: irem           
        //  2001: istore          41
        //  2003: aload_0        
        //  2004: getfield        com/whatsapp/camera/CameraView.p:Landroid/media/MediaRecorder;
        //  2007: iload           41
        //  2009: invokevirtual   android/media/MediaRecorder.setOrientationHint:(I)V
        //  2012: aload_0        
        //  2013: getfield        com/whatsapp/camera/CameraView.p:Landroid/media/MediaRecorder;
        //  2016: invokevirtual   android/media/MediaRecorder.prepare:()V
        //  2019: iconst_1       
        //  2020: ireturn        
        //  2021: astore          49
        //  2023: aload           49
        //  2025: athrow         
        //  2026: astore          50
        //  2028: aload           50
        //  2030: athrow         
        //  2031: astore          51
        //  2033: aload           51
        //  2035: athrow         
        //  2036: astore          52
        //  2038: aload           52
        //  2040: athrow         
        //  2041: astore          31
        //  2043: aload           31
        //  2045: athrow         
        //  2046: astore          32
        //  2048: aload           32
        //  2050: athrow         
        //  2051: iconst_0       
        //  2052: istore          34
        //  2054: goto            1760
        //  2057: astore          48
        //  2059: aload           48
        //  2061: athrow         
        //  2062: astore          35
        //  2064: aload           35
        //  2066: athrow         
        //  2067: astore          36
        //  2069: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //  2072: bipush          87
        //  2074: aaload         
        //  2075: aload           36
        //  2077: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2080: goto            1806
        //  2083: astore          37
        //  2085: aload           37
        //  2087: athrow         
        //  2088: astore          38
        //  2090: aload           38
        //  2092: athrow         
        //  2093: astore          42
        //  2095: aload           42
        //  2097: athrow         
        //  2098: astore          43
        //  2100: aload           43
        //  2102: athrow         
        //  2103: astore          44
        //  2105: aload           44
        //  2107: athrow         
        //  2108: astore          40
        //  2110: aload_0        
        //  2111: invokespecial   com/whatsapp/camera/CameraView.l:()V
        //  2114: aload_0        
        //  2115: invokespecial   com/whatsapp/camera/CameraView.f:()V
        //  2118: iconst_0       
        //  2119: ireturn        
        //  2120: astore          39
        //  2122: aload_0        
        //  2123: invokespecial   com/whatsapp/camera/CameraView.l:()V
        //  2126: aload_0        
        //  2127: invokespecial   com/whatsapp/camera/CameraView.f:()V
        //  2130: iconst_0       
        //  2131: ireturn        
        //  2132: aload           24
        //  2134: astore          20
        //  2136: goto            1391
        //  2139: dload           68
        //  2141: dstore          70
        //  2143: aload           67
        //  2145: astore          63
        //  2147: dload           70
        //  2149: dstore          56
        //  2151: goto            1259
        //  2154: dload           56
        //  2156: dstore          65
        //  2158: aload           63
        //  2160: astore          67
        //  2162: dload           65
        //  2164: dstore          68
        //  2166: goto            1369
        //  2169: aload           64
        //  2171: astore          67
        //  2173: dload           72
        //  2175: dstore          68
        //  2177: goto            1369
        //  2180: aload           63
        //  2182: astore          24
        //  2184: goto            1377
        //  2187: aload           24
        //  2189: astore          61
        //  2191: goto            1080
        //  2194: aload           61
        //  2196: astore          24
        //  2198: goto            1228
        //  2201: dload           87
        //  2203: dstore          56
        //  2205: goto            1228
        //  2208: aload           61
        //  2210: astore          24
        //  2212: goto            1232
        //  2215: aload           22
        //  2217: astore          29
        //  2219: goto            1042
        //  2222: aconst_null    
        //  2223: astore          24
        //  2225: goto            918
        //  2228: aload           22
        //  2230: astore          105
        //  2232: goto            798
        //  2235: aload           105
        //  2237: astore          22
        //  2239: goto            624
        //  2242: iload           18
        //  2244: istore          19
        //  2246: aload           124
        //  2248: astore          20
        //  2250: goto            552
        //  2253: iload           18
        //  2255: istore          19
        //  2257: aconst_null    
        //  2258: astore          20
        //  2260: goto            552
        //  2263: aload           13
        //  2265: astore          14
        //  2267: goto            379
        //  2270: aload           10
        //  2272: astore          11
        //  2274: goto            348
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  44     49     112    115    Ljava/io/IOException;
        //  59     64     112    115    Ljava/io/IOException;
        //  71     81     115    120    Ljava/io/IOException;
        //  101    110    187    192    Ljava/io/IOException;
        //  113    115    115    120    Ljava/io/IOException;
        //  384    393    409    414    Ljava/io/IOException;
        //  398    407    414    419    Ljava/io/IOException;
        //  411    414    414    419    Ljava/io/IOException;
        //  444    495    822    827    Ljava/io/IOException;
        //  503    510    827    832    Ljava/io/IOException;
        //  535    544    832    837    Ljava/io/IOException;
        //  646    664    837    842    Ljava/io/IOException;
        //  672    686    842    847    Ljava/io/IOException;
        //  693    707    847    857    Ljava/io/IOException;
        //  727    741    857    862    Ljava/io/IOException;
        //  756    770    862    867    Ljava/io/IOException;
        //  777    791    867    872    Ljava/io/IOException;
        //  811    820    872    877    Ljava/io/IOException;
        //  824    827    827    832    Ljava/io/IOException;
        //  839    842    842    847    Ljava/io/IOException;
        //  844    847    847    857    Ljava/io/IOException;
        //  849    852    852    857    Ljava/io/IOException;
        //  864    867    867    872    Ljava/io/IOException;
        //  918    930    1407   1412   Ljava/io/IOException;
        //  937    942    1412   1417   Ljava/io/IOException;
        //  949    963    1417   1422   Ljava/io/IOException;
        //  968    979    1422   1427   Ljava/io/IOException;
        //  1102   1129   1427   1432   Ljava/io/IOException;
        //  1136   1150   1432   1437   Ljava/io/IOException;
        //  1199   1216   1437   1442   Ljava/io/IOException;
        //  1336   1353   1442   1447   Ljava/io/IOException;
        //  1396   1405   1447   1452   Ljava/io/IOException;
        //  1409   1412   1412   1417   Ljava/io/IOException;
        //  1414   1417   1417   1422   Ljava/io/IOException;
        //  1419   1422   1422   1427   Ljava/io/IOException;
        //  1429   1432   1432   1437   Ljava/io/IOException;
        //  1606   1656   2021   2026   Ljava/io/IOException;
        //  1661   1672   2026   2031   Ljava/io/IOException;
        //  1676   1691   2031   2036   Ljava/io/IOException;
        //  1696   1707   2036   2041   Ljava/io/IOException;
        //  1711   1720   2041   2046   Ljava/io/IOException;
        //  1720   1752   2046   2051   Ljava/io/IOException;
        //  1765   1772   2057   2062   Ljava/io/IOException;
        //  1772   1781   2062   2067   Ljava/lang/IllegalStateException;
        //  1786   1795   2062   2067   Ljava/lang/IllegalStateException;
        //  1795   1806   2067   2083   Ljava/io/IOException;
        //  1795   1806   2062   2067   Ljava/lang/IllegalStateException;
        //  1821   1872   2083   2088   Ljava/io/IOException;
        //  1876   1900   2088   2093   Ljava/io/IOException;
        //  1941   1953   2093   2098   Ljava/io/IOException;
        //  1960   1965   2098   2103   Ljava/io/IOException;
        //  1972   1986   2103   2108   Ljava/io/IOException;
        //  2012   2019   2108   2120   Ljava/lang/IllegalStateException;
        //  2012   2019   2120   2132   Ljava/io/IOException;
        //  2023   2026   2026   2031   Ljava/io/IOException;
        //  2028   2031   2031   2036   Ljava/io/IOException;
        //  2033   2036   2036   2041   Ljava/io/IOException;
        //  2038   2041   2041   2046   Ljava/io/IOException;
        //  2085   2088   2088   2093   Ljava/io/IOException;
        //  2095   2098   2098   2103   Ljava/io/IOException;
        //  2100   2103   2103   2108   Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 1020, Size: 1020
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
    
    private List c() {
        Log.i(CameraView.z[93]);
        final ArrayList<Camera$Size> list = new ArrayList<Camera$Size>();
        final Camera i = this.i;
        i.getClass();
        list.add(new Camera$Size(i, 640, 480));
        return list;
    }
    
    static boolean c(final CameraView cameraView) {
        return cameraView.c;
    }
    
    private int d() {
        final boolean m = CameraActivity.m;
        final Display defaultDisplay = ((WindowManager)this.getContext().getSystemService(CameraView.z[53])).getDefaultDisplay();
        final int orientation = defaultDisplay.getOrientation();
        this.o = false;
        Label_0095: {
            if (Build$VERSION.SDK_INT < 9) {
                break Label_0095;
            }
        Label_0147_Outer:
            while (true) {
                final Camera$CameraInfo camera$CameraInfo = new Camera$CameraInfo();
                while (true) {
                    int orientation2 = 0;
                    Label_0331: {
                        Label_0325: {
                            while (true) {
                                Label_0310: {
                                    Label_0301: {
                                        Label_0297: {
                                        Label_0290:
                                            while (true) {
                                                try {
                                                    Camera.getCameraInfo(this.l, camera$CameraInfo);
                                                    if (camera$CameraInfo.facing == 1) {
                                                        final boolean o = true;
                                                        this.o = o;
                                                        orientation2 = camera$CameraInfo.orientation;
                                                        if (!m) {
                                                            break Label_0331;
                                                        }
                                                        int n = 0;
                                                        int n2 = 0;
                                                        Label_0132: {
                                                            if (orientation == 0 || orientation == 2) {
                                                                n = defaultDisplay.getWidth();
                                                                n2 = defaultDisplay.getHeight();
                                                                if (!m) {
                                                                    break Label_0132;
                                                                }
                                                            }
                                                            n = defaultDisplay.getHeight();
                                                            n2 = defaultDisplay.getWidth();
                                                        }
                                                        if (n > n2 && !m) {
                                                            break Label_0325;
                                                        }
                                                        final int n3 = 90;
                                                        final int n4 = 0;
                                                        switch (orientation) {
                                                            default: {
                                                                int n5 = 0;
                                                                Label_0221: {
                                                                    if (this.o) {
                                                                        n5 = (360 + (n3 + n4)) % 360;
                                                                        if (!m) {
                                                                            break Label_0221;
                                                                        }
                                                                    }
                                                                    n5 = (360 + (n3 - n4)) % 360;
                                                                }
                                                                Log.i(CameraView.z[54] + n4 + CameraView.z[55] + n3 + CameraView.z[56] + n5);
                                                                return n5;
                                                            }
                                                            case 0: {
                                                                break Label_0290;
                                                            }
                                                            case 1: {
                                                                break Label_0297;
                                                            }
                                                            case 2: {
                                                                break Label_0301;
                                                            }
                                                            case 3: {
                                                                break Label_0310;
                                                            }
                                                        }
                                                    }
                                                }
                                                catch (RuntimeException ex) {
                                                    throw ex;
                                                }
                                                final boolean o = false;
                                                continue Label_0147_Outer;
                                            }
                                            final int n4 = 0;
                                            if (!m) {
                                                continue;
                                            }
                                        }
                                        if (!m) {
                                            final int n4 = 90;
                                            continue;
                                        }
                                    }
                                    final int n4 = 180;
                                    if (!m) {
                                        continue;
                                    }
                                }
                                final int n4 = 270;
                                continue;
                            }
                        }
                        final int n3 = 0;
                        continue;
                    }
                    final int n3 = orientation2;
                    continue;
                }
            }
        }
    }
    
    static boolean d(final CameraView cameraView) {
        return cameraView.g;
    }
    
    static void e(final CameraView cameraView) {
        cameraView.f();
    }
    
    private void f() {
        try {
            if (this.s != null) {
                this.s.a();
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
    }
    
    static boolean f(final CameraView cameraView) {
        return cameraView.o;
    }
    
    static Camera g(final CameraView cameraView) {
        return cameraView.i;
    }
    
    static void h(final CameraView cameraView) {
        cameraView.b();
    }
    
    static void i(final CameraView cameraView) {
        cameraView.m();
    }
    
    static void j(final CameraView cameraView) {
        cameraView.k();
    }
    
    static SurfaceHolder k(final CameraView cameraView) {
        return cameraView.m;
    }
    
    private void k() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/camera/CameraActivity.m:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: fconst_1       
        //     6: putfield        com/whatsapp/camera/CameraView.b:F
        //     9: aload_0        
        //    10: iconst_0       
        //    11: putfield        com/whatsapp/camera/CameraView.d:I
        //    14: aload_0        
        //    15: aconst_null    
        //    16: putfield        com/whatsapp/camera/CameraView.h:Ljava/util/List;
        //    19: aload_0        
        //    20: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //    23: ifnonnull       149
        //    26: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    29: bipush          9
        //    31: if_icmplt       76
        //    34: aload_0        
        //    35: getfield        com/whatsapp/camera/CameraView.l:I
        //    38: istore          12
        //    40: invokestatic    android/hardware/Camera.getNumberOfCameras:()I
        //    43: istore          13
        //    45: iload           12
        //    47: iload           13
        //    49: if_icmplt       61
        //    52: aload_0        
        //    53: iconst_m1      
        //    54: invokestatic    android/hardware/Camera.getNumberOfCameras:()I
        //    57: iadd           
        //    58: putfield        com/whatsapp/camera/CameraView.l:I
        //    61: aload_0        
        //    62: aload_0        
        //    63: getfield        com/whatsapp/camera/CameraView.l:I
        //    66: invokestatic    android/hardware/Camera.open:(I)Landroid/hardware/Camera;
        //    69: putfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //    72: iload_1        
        //    73: ifeq            83
        //    76: aload_0        
        //    77: invokestatic    android/hardware/Camera.open:()Landroid/hardware/Camera;
        //    80: putfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //    83: aload_0        
        //    84: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //    87: new             Lcom/whatsapp/camera/c;
        //    90: dup            
        //    91: aload_0        
        //    92: invokespecial   com/whatsapp/camera/c.<init>:(Lcom/whatsapp/camera/CameraView;)V
        //    95: invokevirtual   android/hardware/Camera.setErrorCallback:(Landroid/hardware/Camera$ErrorCallback;)V
        //    98: return         
        //    99: astore          7
        //   101: aload           7
        //   103: athrow         
        //   104: astore          8
        //   106: aload           8
        //   108: athrow         
        //   109: astore          9
        //   111: aload_0        
        //   112: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //   115: ifnull          125
        //   118: aload_0        
        //   119: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //   122: invokevirtual   android/hardware/Camera.release:()V
        //   125: aload_0        
        //   126: aconst_null    
        //   127: putfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //   130: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   133: bipush          42
        //   135: aaload         
        //   136: aload           9
        //   138: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   141: aload_0        
        //   142: invokespecial   com/whatsapp/camera/CameraView.f:()V
        //   145: iload_1        
        //   146: ifeq            98
        //   149: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   152: istore          4
        //   154: iload           4
        //   156: bipush          8
        //   158: if_icmplt       202
        //   161: aload_0        
        //   162: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //   165: invokevirtual   android/hardware/Camera.reconnect:()V
        //   168: return         
        //   169: astore          6
        //   171: aload_0        
        //   172: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //   175: invokevirtual   android/hardware/Camera.release:()V
        //   178: aload_0        
        //   179: aconst_null    
        //   180: putfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //   183: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   186: bipush          43
        //   188: aaload         
        //   189: aload           6
        //   191: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   194: aload_0        
        //   195: invokespecial   com/whatsapp/camera/CameraView.f:()V
        //   198: iload_1        
        //   199: ifeq            98
        //   202: aload_0        
        //   203: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //   206: invokevirtual   android/hardware/Camera.release:()V
        //   209: aload_0        
        //   210: aconst_null    
        //   211: putfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //   214: aload_0        
        //   215: invokespecial   com/whatsapp/camera/CameraView.k:()V
        //   218: return         
        //   219: astore          5
        //   221: aload           5
        //   223: athrow         
        //   224: astore          11
        //   226: aload           11
        //   228: athrow         
        //   229: astore          10
        //   231: aload           10
        //   233: athrow         
        //   234: astore_3       
        //   235: aload_3        
        //   236: athrow         
        //   237: astore_2       
        //   238: aload_2        
        //   239: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  26     45     99     104    Ljava/lang/Exception;
        //  52     61     104    109    Ljava/lang/Exception;
        //  61     72     224    229    Ljava/lang/Exception;
        //  76     83     224    229    Ljava/lang/Exception;
        //  83     98     109    149    Ljava/lang/Exception;
        //  101    104    104    109    Ljava/lang/Exception;
        //  106    109    109    149    Ljava/lang/Exception;
        //  111    125    229    234    Ljava/lang/Exception;
        //  125    145    234    237    Ljava/lang/Exception;
        //  149    154    234    237    Ljava/lang/Exception;
        //  149    154    237    240    Ljava/lang/RuntimeException;
        //  161    168    169    202    Ljava/io/IOException;
        //  161    168    237    240    Ljava/lang/RuntimeException;
        //  171    198    219    224    Ljava/lang/Exception;
        //  202    218    219    224    Ljava/lang/Exception;
        //  226    229    109    149    Ljava/lang/Exception;
        //  235    237    237    240    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 122, Size: 122
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
    
    private void l() {
        try {
            if (this.p != null) {
                this.p.reset();
                this.p.release();
                this.p = null;
                this.i.lock();
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
    }
    
    private void m() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //     3: bipush          46
        //     5: aaload         
        //     6: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //     9: aload_0        
        //    10: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //    13: ifnull          35
        //    16: aload_0        
        //    17: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //    20: invokevirtual   android/hardware/Camera.stopPreview:()V
        //    23: aload_0        
        //    24: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //    27: invokevirtual   android/hardware/Camera.release:()V
        //    30: aload_0        
        //    31: aconst_null    
        //    32: putfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //    35: return         
        //    36: astore_1       
        //    37: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //    40: bipush          44
        //    42: aaload         
        //    43: aload_1        
        //    44: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    47: goto            23
        //    50: astore_2       
        //    51: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //    54: bipush          45
        //    56: aaload         
        //    57: aload_2        
        //    58: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    61: goto            30
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  16     23     36     50     Ljava/lang/Exception;
        //  23     30     50     64     Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0023:
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
    
    public String a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //     4: astore_2       
        //     5: aload_2        
        //     6: ifnonnull       14
        //     9: aconst_null    
        //    10: areturn        
        //    11: astore_1       
        //    12: aload_1        
        //    13: athrow         
        //    14: aload_0        
        //    15: invokevirtual   com/whatsapp/camera/CameraView.e:()Ljava/util/List;
        //    18: astore_3       
        //    19: aload_3        
        //    20: ifnull          9
        //    23: aload_3        
        //    24: invokeinterface java/util/List.isEmpty:()Z
        //    29: istore          5
        //    31: iload           5
        //    33: ifne            9
        //    36: aload_0        
        //    37: getfield        com/whatsapp/camera/CameraView.f:Ljava/lang/String;
        //    40: ifnonnull       57
        //    43: aload_0        
        //    44: aload_0        
        //    45: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //    48: invokevirtual   android/hardware/Camera.getParameters:()Landroid/hardware/Camera$Parameters;
        //    51: invokevirtual   android/hardware/Camera$Parameters.getFlashMode:()Ljava/lang/String;
        //    54: putfield        com/whatsapp/camera/CameraView.f:Ljava/lang/String;
        //    57: aload_3        
        //    58: aload_0        
        //    59: getfield        com/whatsapp/camera/CameraView.f:Ljava/lang/String;
        //    62: invokeinterface java/util/List.indexOf:(Ljava/lang/Object;)I
        //    67: istore          7
        //    69: iload           7
        //    71: iflt            9
        //    74: aload_0        
        //    75: aload_3        
        //    76: iload           7
        //    78: iconst_1       
        //    79: iadd           
        //    80: aload_3        
        //    81: invokeinterface java/util/List.size:()I
        //    86: irem           
        //    87: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    92: checkcast       Ljava/lang/String;
        //    95: putfield        com/whatsapp/camera/CameraView.f:Ljava/lang/String;
        //    98: new             Ljava/lang/StringBuilder;
        //   101: dup            
        //   102: invokespecial   java/lang/StringBuilder.<init>:()V
        //   105: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   108: bipush          41
        //   110: aaload         
        //   111: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   114: aload_0        
        //   115: getfield        com/whatsapp/camera/CameraView.f:Ljava/lang/String;
        //   118: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   121: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   124: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   127: aload_0        
        //   128: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //   131: invokevirtual   android/hardware/Camera.getParameters:()Landroid/hardware/Camera$Parameters;
        //   134: astore          8
        //   136: aload           8
        //   138: aload_0        
        //   139: getfield        com/whatsapp/camera/CameraView.f:Ljava/lang/String;
        //   142: invokevirtual   android/hardware/Camera$Parameters.setFlashMode:(Ljava/lang/String;)V
        //   145: aload_0        
        //   146: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //   149: aload           8
        //   151: invokevirtual   android/hardware/Camera.setParameters:(Landroid/hardware/Camera$Parameters;)V
        //   154: aload_0        
        //   155: invokevirtual   com/whatsapp/camera/CameraView.getContext:()Landroid/content/Context;
        //   158: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   161: bipush          40
        //   163: aaload         
        //   164: iconst_0       
        //   165: invokevirtual   android/content/Context.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //   168: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //   173: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   176: bipush          39
        //   178: aaload         
        //   179: aload_0        
        //   180: getfield        com/whatsapp/camera/CameraView.f:Ljava/lang/String;
        //   183: invokeinterface android/content/SharedPreferences$Editor.putString:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
        //   188: invokeinterface android/content/SharedPreferences$Editor.commit:()Z
        //   193: pop            
        //   194: aload_0        
        //   195: getfield        com/whatsapp/camera/CameraView.f:Ljava/lang/String;
        //   198: areturn        
        //   199: astore          4
        //   201: aload           4
        //   203: athrow         
        //   204: astore          6
        //   206: aload           6
        //   208: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      5      11     14     Ljava/lang/RuntimeException;
        //  23     31     199    204    Ljava/lang/RuntimeException;
        //  36     57     204    209    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0057:
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
    
    public void a(final y y) {
        if (y == null) {
            try {
                throw new IllegalArgumentException(CameraView.z[37]);
            }
            catch (Exception ex) {
                throw ex;
            }
        }
        try {
            if (this.i == null) {
                Log.e(CameraView.z[38]);
                this.f();
                return;
            }
        }
        catch (Exception ex2) {
            throw ex2;
        }
        this.c = false;
        this.a = true;
        Log.i(CameraView.z[35]);
        final Camera$Parameters parameters = this.i.getParameters();
        parameters.setRotation(this.d());
        parameters.setJpegQuality(80);
        this.i.setParameters(parameters);
        try {
            this.i.takePicture((Camera$ShutterCallback)new p(this, y), (Camera$PictureCallback)null, (Camera$PictureCallback)new b(this, y));
        }
        catch (Exception ex3) {
            Log.b(CameraView.z[36], ex3);
            this.f();
        }
    }
    
    public void a(final File file) {
        Label_0055: {
            if (!this.b(file)) {
                break Label_0055;
            }
            try {
                Log.i(CameraView.z[107]);
                this.p.start();
                this.g = true;
                return;
            }
            catch (RuntimeException ex2) {
                final String[] array = CameraView.z;
                final int n = 105;
                final String s = array[n];
                final RuntimeException ex = ex2;
                Log.b(s, ex);
                final CameraView cameraView = this;
                cameraView.l();
                final CameraView cameraView2 = this;
                cameraView2.f();
                final boolean b = CameraActivity.m;
                if (!b) {
                    return;
                }
            }
            try {
                final String[] array = CameraView.z;
                final int n = 105;
                final String s = array[n];
                final RuntimeException ex2;
                final RuntimeException ex = ex2;
                Log.b(s, ex);
                final CameraView cameraView = this;
                cameraView.l();
                final CameraView cameraView2 = this;
                cameraView2.f();
                final boolean b = CameraActivity.m;
                if (b) {
                    Log.e(CameraView.z[106]);
                    this.l();
                    this.f();
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
    }
    
    public List e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //     4: astore_2       
        //     5: aconst_null    
        //     6: astore_3       
        //     7: aload_2        
        //     8: ifnonnull       16
        //    11: aload_3        
        //    12: areturn        
        //    13: astore_1       
        //    14: aload_1        
        //    15: athrow         
        //    16: aload_0        
        //    17: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //    20: invokevirtual   android/hardware/Camera.getParameters:()Landroid/hardware/Camera$Parameters;
        //    23: invokevirtual   android/hardware/Camera$Parameters.getSupportedFlashModes:()Ljava/util/List;
        //    26: astore          4
        //    28: aconst_null    
        //    29: astore_3       
        //    30: aload           4
        //    32: ifnull          11
        //    35: new             Ljava/util/ArrayList;
        //    38: dup            
        //    39: invokespecial   java/util/ArrayList.<init>:()V
        //    42: astore_3       
        //    43: aload           4
        //    45: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //    48: bipush          48
        //    50: aaload         
        //    51: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //    56: ifeq            72
        //    59: aload_3        
        //    60: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //    63: bipush          49
        //    65: aaload         
        //    66: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    71: pop            
        //    72: aload           4
        //    74: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //    77: bipush          51
        //    79: aaload         
        //    80: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //    85: ifeq            101
        //    88: aload_3        
        //    89: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //    92: bipush          47
        //    94: aaload         
        //    95: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   100: pop            
        //   101: aload           4
        //   103: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   106: bipush          50
        //   108: aaload         
        //   109: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   114: ifeq            11
        //   117: aload_3        
        //   118: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   121: bipush          52
        //   123: aaload         
        //   124: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   129: pop            
        //   130: aload_3        
        //   131: areturn        
        //   132: astore          7
        //   134: aload           7
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
        //  -----  -----  -----  -----  ----------------------------
        //  0      5      13     16     Ljava/lang/RuntimeException;
        //  43     72     137    142    Ljava/lang/RuntimeException;
        //  72     101    142    147    Ljava/lang/RuntimeException;
        //  101    130    132    137    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0072:
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
    
    public boolean g() {
        return this.g;
    }
    
    public int h() {
        return this.d;
    }
    
    public void i() {
        while (true) {
            try {
                this.p.stop();
                this.l();
                this.i.lock();
                this.g = false;
                this.e = null;
            }
            catch (RuntimeException ex) {
                Log.w(CameraView.z[0] + ex.toString());
                continue;
            }
            break;
        }
    }
    
    public String j() {
        return this.f;
    }
    
    public void n() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //     3: bipush          58
        //     5: aaload         
        //     6: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //     9: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    12: bipush          9
        //    14: if_icmplt       107
        //    17: invokestatic    android/hardware/Camera.getNumberOfCameras:()I
        //    20: istore_2       
        //    21: iload_2        
        //    22: iconst_1       
        //    23: if_icmple       107
        //    26: aload_0        
        //    27: iconst_1       
        //    28: aload_0        
        //    29: getfield        com/whatsapp/camera/CameraView.l:I
        //    32: iadd           
        //    33: invokestatic    android/hardware/Camera.getNumberOfCameras:()I
        //    36: irem           
        //    37: putfield        com/whatsapp/camera/CameraView.l:I
        //    40: aload_0        
        //    41: invokespecial   com/whatsapp/camera/CameraView.m:()V
        //    44: aload_0        
        //    45: invokespecial   com/whatsapp/camera/CameraView.k:()V
        //    48: aload_0        
        //    49: invokevirtual   com/whatsapp/camera/CameraView.requestLayout:()V
        //    52: aload_0        
        //    53: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //    56: aload_0        
        //    57: getfield        com/whatsapp/camera/CameraView.m:Landroid/view/SurfaceHolder;
        //    60: invokevirtual   android/hardware/Camera.setPreviewDisplay:(Landroid/view/SurfaceHolder;)V
        //    63: aload_0        
        //    64: invokespecial   com/whatsapp/camera/CameraView.b:()V
        //    67: aload_0        
        //    68: invokevirtual   com/whatsapp/camera/CameraView.getContext:()Landroid/content/Context;
        //    71: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //    74: bipush          61
        //    76: aaload         
        //    77: iconst_0       
        //    78: invokevirtual   android/content/Context.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //    81: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //    86: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //    89: bipush          57
        //    91: aaload         
        //    92: aload_0        
        //    93: getfield        com/whatsapp/camera/CameraView.l:I
        //    96: invokeinterface android/content/SharedPreferences$Editor.putInt:(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
        //   101: invokeinterface android/content/SharedPreferences$Editor.commit:()Z
        //   106: pop            
        //   107: return         
        //   108: astore_1       
        //   109: aload_1        
        //   110: athrow         
        //   111: astore          4
        //   113: aload_0        
        //   114: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //   117: invokevirtual   android/hardware/Camera.release:()V
        //   120: aload_0        
        //   121: aconst_null    
        //   122: putfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //   125: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   128: bipush          60
        //   130: aaload         
        //   131: aload           4
        //   133: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   136: aload_0        
        //   137: invokespecial   com/whatsapp/camera/CameraView.f:()V
        //   140: return         
        //   141: astore_3       
        //   142: aload_0        
        //   143: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //   146: invokevirtual   android/hardware/Camera.release:()V
        //   149: aload_0        
        //   150: aconst_null    
        //   151: putfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //   154: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   157: bipush          59
        //   159: aaload         
        //   160: aload_3        
        //   161: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   164: aload_0        
        //   165: invokespecial   com/whatsapp/camera/CameraView.f:()V
        //   168: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      21     108    111    Ljava/lang/RuntimeException;
        //  52     107    111    141    Ljava/lang/RuntimeException;
        //  52     107    141    169    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0107:
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
    
    public boolean onDown(final MotionEvent motionEvent) {
        return false;
    }
    
    public boolean onFling(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
        return false;
    }
    
    public void onLongPress(final MotionEvent motionEvent) {
    }
    
    protected void onMeasure(final int p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/camera/CameraActivity.m:Z
        //     3: istore_3       
        //     4: aload_0        
        //     5: iload_1        
        //     6: iload_2        
        //     7: invokespecial   android/view/SurfaceView.onMeasure:(II)V
        //    10: aload_0        
        //    11: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //    14: ifnonnull       21
        //    17: aload_0        
        //    18: invokespecial   com/whatsapp/camera/CameraView.k:()V
        //    21: aload_0        
        //    22: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //    25: astore          6
        //    27: aload           6
        //    29: ifnonnull       43
        //    32: return         
        //    33: astore          4
        //    35: aload           4
        //    37: athrow         
        //    38: astore          5
        //    40: aload           5
        //    42: athrow         
        //    43: aload_0        
        //    44: invokevirtual   com/whatsapp/camera/CameraView.getMeasuredWidth:()I
        //    47: istore          7
        //    49: aload_0        
        //    50: invokevirtual   com/whatsapp/camera/CameraView.getMeasuredHeight:()I
        //    53: istore          8
        //    55: aload_0        
        //    56: getfield        com/whatsapp/camera/CameraView.e:Landroid/hardware/Camera$Size;
        //    59: ifnull          72
        //    62: aload_0        
        //    63: getfield        com/whatsapp/camera/CameraView.e:Landroid/hardware/Camera$Size;
        //    66: astore          15
        //    68: iload_3        
        //    69: ifeq            194
        //    72: aload_0        
        //    73: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //    76: invokevirtual   android/hardware/Camera.getParameters:()Landroid/hardware/Camera$Parameters;
        //    79: invokevirtual   android/hardware/Camera$Parameters.getSupportedPreviewSizes:()Ljava/util/List;
        //    82: astore          9
        //    84: aload           9
        //    86: ifnonnull       798
        //    89: aload_0        
        //    90: invokespecial   com/whatsapp/camera/CameraView.c:()Ljava/util/List;
        //    93: astore          10
        //    95: new             Ljava/lang/StringBuilder;
        //    98: dup            
        //    99: invokespecial   java/lang/StringBuilder.<init>:()V
        //   102: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   105: bipush          100
        //   107: aaload         
        //   108: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   111: aload           10
        //   113: invokestatic    com/whatsapp/camera/CameraView.a:(Ljava/util/List;)Ljava/lang/String;
        //   116: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   119: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   122: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   125: aload_0        
        //   126: invokevirtual   com/whatsapp/camera/CameraView.getContext:()Landroid/content/Context;
        //   129: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   132: bipush          103
        //   134: aaload         
        //   135: invokevirtual   android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   138: checkcast       Landroid/view/WindowManager;
        //   141: invokeinterface android/view/WindowManager.getDefaultDisplay:()Landroid/view/Display;
        //   146: invokevirtual   android/view/Display.getOrientation:()I
        //   149: istore          11
        //   151: iload           11
        //   153: ifeq            162
        //   156: iload           11
        //   158: iconst_2       
        //   159: if_icmpne       713
        //   162: iconst_1       
        //   163: istore          12
        //   165: iload           12
        //   167: ifeq            719
        //   170: iload           8
        //   172: istore          13
        //   174: iload           12
        //   176: ifeq            726
        //   179: iload           7
        //   181: istore          14
        //   183: aload           10
        //   185: iload           13
        //   187: iload           14
        //   189: invokestatic    com/whatsapp/camera/CameraView.a:(Ljava/util/List;II)Landroid/hardware/Camera$Size;
        //   192: astore          15
        //   194: iload           7
        //   196: i2d            
        //   197: iload           8
        //   199: i2d            
        //   200: ddiv           
        //   201: aload           15
        //   203: getfield        android/hardware/Camera$Size.width:I
        //   206: i2d            
        //   207: aload           15
        //   209: getfield        android/hardware/Camera$Size.height:I
        //   212: i2d            
        //   213: ddiv           
        //   214: dsub           
        //   215: invokestatic    java/lang/Math.abs:(D)D
        //   218: iload           8
        //   220: i2d            
        //   221: iload           7
        //   223: i2d            
        //   224: ddiv           
        //   225: aload           15
        //   227: getfield        android/hardware/Camera$Size.width:I
        //   230: i2d            
        //   231: aload           15
        //   233: getfield        android/hardware/Camera$Size.height:I
        //   236: i2d            
        //   237: ddiv           
        //   238: dsub           
        //   239: invokestatic    java/lang/Math.abs:(D)D
        //   242: invokestatic    java/lang/Math.min:(DD)D
        //   245: dstore          16
        //   247: new             Ljava/lang/StringBuilder;
        //   250: dup            
        //   251: invokespecial   java/lang/StringBuilder.<init>:()V
        //   254: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   257: bipush          96
        //   259: aaload         
        //   260: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   263: aload           15
        //   265: getfield        android/hardware/Camera$Size.width:I
        //   268: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   271: ldc_w           "x"
        //   274: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   277: aload           15
        //   279: getfield        android/hardware/Camera$Size.height:I
        //   282: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   285: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   288: bipush          98
        //   290: aaload         
        //   291: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   294: iload           7
        //   296: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   299: ldc_w           "x"
        //   302: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   305: iload           8
        //   307: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   310: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   313: bipush          101
        //   315: aaload         
        //   316: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   319: dload           16
        //   321: invokevirtual   java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        //   324: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   327: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   330: dload           16
        //   332: ldc2_w          0.1
        //   335: dcmpl          
        //   336: ifle            32
        //   339: iload           7
        //   341: iload           8
        //   343: if_icmple       743
        //   346: iconst_1       
        //   347: istore          20
        //   349: aload           15
        //   351: getfield        android/hardware/Camera$Size.width:I
        //   354: istore          22
        //   356: aload           15
        //   358: getfield        android/hardware/Camera$Size.height:I
        //   361: istore          23
        //   363: iload           22
        //   365: iload           23
        //   367: if_icmple       754
        //   370: iconst_1       
        //   371: istore          24
        //   373: iload           20
        //   375: iload           24
        //   377: if_icmpne       523
        //   380: iload           7
        //   382: i2d            
        //   383: aload           15
        //   385: getfield        android/hardware/Camera$Size.width:I
        //   388: i2d            
        //   389: ddiv           
        //   390: iload           8
        //   392: i2d            
        //   393: aload           15
        //   395: getfield        android/hardware/Camera$Size.height:I
        //   398: i2d            
        //   399: ddiv           
        //   400: invokestatic    java/lang/Math.min:(DD)D
        //   403: dstore          34
        //   405: iload           7
        //   407: i2d            
        //   408: aload           15
        //   410: getfield        android/hardware/Camera$Size.width:I
        //   413: i2d            
        //   414: ddiv           
        //   415: iload           8
        //   417: i2d            
        //   418: aload           15
        //   420: getfield        android/hardware/Camera$Size.height:I
        //   423: i2d            
        //   424: ddiv           
        //   425: invokestatic    java/lang/Math.max:(DD)D
        //   428: dstore          36
        //   430: new             Ljava/lang/StringBuilder;
        //   433: dup            
        //   434: invokespecial   java/lang/StringBuilder.<init>:()V
        //   437: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   440: bipush          97
        //   442: aaload         
        //   443: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   446: dload           34
        //   448: invokevirtual   java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        //   451: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   454: bipush          94
        //   456: aaload         
        //   457: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   460: dload           36
        //   462: invokevirtual   java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        //   465: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   468: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   471: dload           36
        //   473: dload           34
        //   475: ddiv           
        //   476: ldc2_w          1.1
        //   479: dcmpl          
        //   480: ifle            770
        //   483: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   486: istore          42
        //   488: iload           42
        //   490: bipush          9
        //   492: if_icmplt       770
        //   495: dload           34
        //   497: aload           15
        //   499: getfield        android/hardware/Camera$Size.width:I
        //   502: i2d            
        //   503: dmul           
        //   504: d2i            
        //   505: istore          40
        //   507: dload           34
        //   509: aload           15
        //   511: getfield        android/hardware/Camera$Size.height:I
        //   514: i2d            
        //   515: dmul           
        //   516: d2i            
        //   517: istore          41
        //   519: iload_3        
        //   520: ifeq            787
        //   523: iload           7
        //   525: i2d            
        //   526: aload           15
        //   528: getfield        android/hardware/Camera$Size.height:I
        //   531: i2d            
        //   532: ddiv           
        //   533: iload           8
        //   535: i2d            
        //   536: aload           15
        //   538: getfield        android/hardware/Camera$Size.width:I
        //   541: i2d            
        //   542: ddiv           
        //   543: invokestatic    java/lang/Math.min:(DD)D
        //   546: dstore          25
        //   548: iload           7
        //   550: i2d            
        //   551: aload           15
        //   553: getfield        android/hardware/Camera$Size.height:I
        //   556: i2d            
        //   557: ddiv           
        //   558: iload           8
        //   560: i2d            
        //   561: aload           15
        //   563: getfield        android/hardware/Camera$Size.width:I
        //   566: i2d            
        //   567: ddiv           
        //   568: invokestatic    java/lang/Math.max:(DD)D
        //   571: dstore          27
        //   573: new             Ljava/lang/StringBuilder;
        //   576: dup            
        //   577: invokespecial   java/lang/StringBuilder.<init>:()V
        //   580: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   583: bipush          102
        //   585: aaload         
        //   586: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   589: dload           25
        //   591: invokevirtual   java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        //   594: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   597: bipush          99
        //   599: aaload         
        //   600: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   603: dload           27
        //   605: invokevirtual   java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        //   608: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   611: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   614: dload           27
        //   616: dload           25
        //   618: ddiv           
        //   619: ldc2_w          1.1
        //   622: dcmpl          
        //   623: ifle            642
        //   626: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   629: istore          33
        //   631: iload           33
        //   633: bipush          9
        //   635: if_icmplt       642
        //   638: dload           25
        //   640: dstore          27
        //   642: dload           27
        //   644: aload           15
        //   646: getfield        android/hardware/Camera$Size.height:I
        //   649: i2d            
        //   650: dmul           
        //   651: d2i            
        //   652: istore          31
        //   654: dload           27
        //   656: aload           15
        //   658: getfield        android/hardware/Camera$Size.width:I
        //   661: i2d            
        //   662: dmul           
        //   663: d2i            
        //   664: istore          32
        //   666: new             Ljava/lang/StringBuilder;
        //   669: dup            
        //   670: invokespecial   java/lang/StringBuilder.<init>:()V
        //   673: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   676: bipush          95
        //   678: aaload         
        //   679: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   682: iload           31
        //   684: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   687: ldc_w           "x"
        //   690: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   693: iload           32
        //   695: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   698: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   701: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   704: aload_0        
        //   705: iload           31
        //   707: iload           32
        //   709: invokevirtual   com/whatsapp/camera/CameraView.setMeasuredDimension:(II)V
        //   712: return         
        //   713: iconst_0       
        //   714: istore          12
        //   716: goto            165
        //   719: iload           7
        //   721: istore          13
        //   723: goto            174
        //   726: iload           8
        //   728: istore          14
        //   730: goto            183
        //   733: astore          18
        //   735: aload           18
        //   737: athrow         
        //   738: astore          19
        //   740: aload           19
        //   742: athrow         
        //   743: iconst_0       
        //   744: istore          20
        //   746: goto            349
        //   749: astore          21
        //   751: aload           21
        //   753: athrow         
        //   754: iconst_0       
        //   755: istore          24
        //   757: goto            373
        //   760: astore          38
        //   762: aload           38
        //   764: athrow         
        //   765: astore          39
        //   767: aload           39
        //   769: athrow         
        //   770: dload           36
        //   772: dstore          34
        //   774: goto            495
        //   777: astore          29
        //   779: aload           29
        //   781: athrow         
        //   782: astore          30
        //   784: aload           30
        //   786: athrow         
        //   787: iload           41
        //   789: istore          32
        //   791: iload           40
        //   793: istore          31
        //   795: goto            666
        //   798: aload           9
        //   800: astore          10
        //   802: goto            95
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  4      21     33     38     Ljava/lang/RuntimeException;
        //  21     27     38     43     Ljava/lang/RuntimeException;
        //  247    330    733    743    Ljava/lang/RuntimeException;
        //  349    363    749    754    Ljava/lang/RuntimeException;
        //  430    471    760    765    Ljava/lang/RuntimeException;
        //  483    488    765    770    Ljava/lang/RuntimeException;
        //  573    614    777    782    Ljava/lang/RuntimeException;
        //  626    631    782    787    Ljava/lang/RuntimeException;
        //  735    738    738    743    Ljava/lang/RuntimeException;
        //  762    765    765    770    Ljava/lang/RuntimeException;
        //  779    782    782    787    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 386, Size: 386
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
    
    public boolean onScale(final ScaleGestureDetector scaleGestureDetector) {
        Label_0026: {
            try {
                if (this.i == null) {
                    return true;
                }
                final CameraView cameraView = this;
                final int n = cameraView.d;
                if (n == 0) {
                    return true;
                }
                break Label_0026;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final CameraView cameraView = this;
                final int n = cameraView.d;
                if (n == 0) {
                    return true;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        final float scaleFactor = scaleGestureDetector.getScaleFactor();
        try {
            this.b = scaleFactor * (scaleFactor * this.b);
            if (this.b < 1.0f) {
                this.b = 1.0f;
            }
            this.s.a(this.b);
            return true;
        }
        catch (RuntimeException ex3) {
            throw ex3;
        }
        return true;
    }
    
    public boolean onScaleBegin(final ScaleGestureDetector scaleGestureDetector) {
        Label_0026: {
            try {
                if (this.i == null) {
                    return true;
                }
                final CameraView cameraView = this;
                final int n = cameraView.d;
                if (n == 0) {
                    return true;
                }
                break Label_0026;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final CameraView cameraView = this;
                final int n = cameraView.d;
                if (n == 0) {
                    return true;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        this.s.c(this.b);
        return true;
    }
    
    public void onScaleEnd(final ScaleGestureDetector scaleGestureDetector) {
        Label_0025: {
            try {
                if (this.i == null) {
                    return;
                }
                final CameraView cameraView = this;
                final int n = cameraView.d;
                if (n == 0) {
                    return;
                }
                break Label_0025;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final CameraView cameraView = this;
                final int n = cameraView.d;
                if (n == 0) {
                    return;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        this.s.b(this.b);
    }
    
    public boolean onScroll(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
        return false;
    }
    
    public void onShowPress(final MotionEvent motionEvent) {
    }
    
    public boolean onSingleTapUp(final MotionEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/camera/CameraView.c:Z
        //     4: istore_3       
        //     5: iload_3        
        //     6: ifne            14
        //     9: iconst_1       
        //    10: ireturn        
        //    11: astore_2       
        //    12: aload_2        
        //    13: athrow         
        //    14: aload_0        
        //    15: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //    18: ifnull          9
        //    21: aload_0        
        //    22: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //    25: invokevirtual   android/hardware/Camera.cancelAutoFocus:()V
        //    28: aload_1        
        //    29: invokevirtual   android/view/MotionEvent.getX:()F
        //    32: fstore          4
        //    34: aload_1        
        //    35: invokevirtual   android/view/MotionEvent.getY:()F
        //    38: fstore          5
        //    40: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    43: istore          6
        //    45: iconst_0       
        //    46: istore          7
        //    48: iload           6
        //    50: bipush          14
        //    52: if_icmplt       543
        //    55: new             Landroid/graphics/Rect;
        //    58: dup            
        //    59: fload           4
        //    61: ldc_w           100.0
        //    64: fconst_2       
        //    65: fdiv           
        //    66: fsub           
        //    67: f2i            
        //    68: fload           5
        //    70: ldc_w           100.0
        //    73: fconst_2       
        //    74: fdiv           
        //    75: fsub           
        //    76: f2i            
        //    77: fload           4
        //    79: ldc_w           100.0
        //    82: fconst_2       
        //    83: fdiv           
        //    84: fadd           
        //    85: f2i            
        //    86: fload           5
        //    88: ldc_w           100.0
        //    91: fconst_2       
        //    92: fdiv           
        //    93: fadd           
        //    94: f2i            
        //    95: invokespecial   android/graphics/Rect.<init>:(IIII)V
        //    98: astore          8
        //   100: new             Landroid/graphics/Rect;
        //   103: dup            
        //   104: invokespecial   android/graphics/Rect.<init>:()V
        //   107: astore          9
        //   109: aload           9
        //   111: sipush          -1000
        //   114: sipush          2000
        //   117: aload           8
        //   119: getfield        android/graphics/Rect.left:I
        //   122: imul           
        //   123: aload_0        
        //   124: invokevirtual   com/whatsapp/camera/CameraView.getWidth:()I
        //   127: idiv           
        //   128: iadd           
        //   129: sipush          -1000
        //   132: sipush          2000
        //   135: aload           8
        //   137: getfield        android/graphics/Rect.top:I
        //   140: imul           
        //   141: aload_0        
        //   142: invokevirtual   com/whatsapp/camera/CameraView.getHeight:()I
        //   145: idiv           
        //   146: iadd           
        //   147: sipush          -1000
        //   150: sipush          2000
        //   153: aload           8
        //   155: getfield        android/graphics/Rect.right:I
        //   158: imul           
        //   159: aload_0        
        //   160: invokevirtual   com/whatsapp/camera/CameraView.getWidth:()I
        //   163: idiv           
        //   164: iadd           
        //   165: sipush          -1000
        //   168: sipush          2000
        //   171: aload           8
        //   173: getfield        android/graphics/Rect.bottom:I
        //   176: imul           
        //   177: aload_0        
        //   178: invokevirtual   com/whatsapp/camera/CameraView.getHeight:()I
        //   181: idiv           
        //   182: iadd           
        //   183: invokevirtual   android/graphics/Rect.set:(IIII)V
        //   186: aload           9
        //   188: getfield        android/graphics/Rect.left:I
        //   191: sipush          -1000
        //   194: if_icmpge       205
        //   197: aload           9
        //   199: sipush          -1000
        //   202: putfield        android/graphics/Rect.left:I
        //   205: aload           9
        //   207: getfield        android/graphics/Rect.top:I
        //   210: sipush          -1000
        //   213: if_icmpge       224
        //   216: aload           9
        //   218: sipush          -1000
        //   221: putfield        android/graphics/Rect.top:I
        //   224: aload           9
        //   226: getfield        android/graphics/Rect.right:I
        //   229: sipush          1000
        //   232: if_icmple       243
        //   235: aload           9
        //   237: sipush          1000
        //   240: putfield        android/graphics/Rect.right:I
        //   243: aload           9
        //   245: getfield        android/graphics/Rect.bottom:I
        //   248: sipush          1000
        //   251: if_icmple       262
        //   254: aload           9
        //   256: sipush          1000
        //   259: putfield        android/graphics/Rect.bottom:I
        //   262: aload           9
        //   264: getfield        android/graphics/Rect.top:I
        //   267: aload           9
        //   269: getfield        android/graphics/Rect.bottom:I
        //   272: isub           
        //   273: invokestatic    java/lang/Math.abs:(I)I
        //   276: istore          16
        //   278: iload           16
        //   280: bipush          10
        //   282: if_icmpge       348
        //   285: aload           9
        //   287: bipush          -5
        //   289: aload           9
        //   291: getfield        android/graphics/Rect.top:I
        //   294: iadd           
        //   295: putfield        android/graphics/Rect.top:I
        //   298: aload           9
        //   300: iconst_5       
        //   301: aload           9
        //   303: getfield        android/graphics/Rect.bottom:I
        //   306: iadd           
        //   307: putfield        android/graphics/Rect.bottom:I
        //   310: aload           9
        //   312: getfield        android/graphics/Rect.top:I
        //   315: sipush          -1000
        //   318: if_icmpge       329
        //   321: aload           9
        //   323: sipush          -1000
        //   326: putfield        android/graphics/Rect.top:I
        //   329: aload           9
        //   331: getfield        android/graphics/Rect.top:I
        //   334: sipush          1000
        //   337: if_icmple       348
        //   340: aload           9
        //   342: sipush          1000
        //   345: putfield        android/graphics/Rect.top:I
        //   348: aload           9
        //   350: getfield        android/graphics/Rect.left:I
        //   353: aload           9
        //   355: getfield        android/graphics/Rect.right:I
        //   358: isub           
        //   359: invokestatic    java/lang/Math.abs:(I)I
        //   362: istore          19
        //   364: iload           19
        //   366: bipush          10
        //   368: if_icmpge       434
        //   371: aload           9
        //   373: bipush          -5
        //   375: aload           9
        //   377: getfield        android/graphics/Rect.left:I
        //   380: iadd           
        //   381: putfield        android/graphics/Rect.left:I
        //   384: aload           9
        //   386: iconst_5       
        //   387: aload           9
        //   389: getfield        android/graphics/Rect.right:I
        //   392: iadd           
        //   393: putfield        android/graphics/Rect.right:I
        //   396: aload           9
        //   398: getfield        android/graphics/Rect.left:I
        //   401: sipush          -1000
        //   404: if_icmpge       415
        //   407: aload           9
        //   409: sipush          -1000
        //   412: putfield        android/graphics/Rect.left:I
        //   415: aload           9
        //   417: getfield        android/graphics/Rect.right:I
        //   420: sipush          1000
        //   423: if_icmpge       434
        //   426: aload           9
        //   428: sipush          1000
        //   431: putfield        android/graphics/Rect.right:I
        //   434: aload_0        
        //   435: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //   438: invokevirtual   android/hardware/Camera.getParameters:()Landroid/hardware/Camera$Parameters;
        //   441: astore          20
        //   443: aload           20
        //   445: invokevirtual   android/hardware/Camera$Parameters.getMaxNumFocusAreas:()I
        //   448: istore          21
        //   450: iconst_0       
        //   451: istore          7
        //   453: iload           21
        //   455: ifle            543
        //   458: new             Ljava/util/ArrayList;
        //   461: dup            
        //   462: invokespecial   java/util/ArrayList.<init>:()V
        //   465: astore          22
        //   467: aload           22
        //   469: new             Landroid/hardware/Camera$Area;
        //   472: dup            
        //   473: aload           9
        //   475: sipush          1000
        //   478: invokespecial   android/hardware/Camera$Area.<init>:(Landroid/graphics/Rect;I)V
        //   481: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   484: pop            
        //   485: aload           20
        //   487: aload           22
        //   489: invokevirtual   android/hardware/Camera$Parameters.setFocusAreas:(Ljava/util/List;)V
        //   492: aload           20
        //   494: invokevirtual   android/hardware/Camera$Parameters.getSupportedFocusModes:()Ljava/util/List;
        //   497: astore          24
        //   499: aload           24
        //   501: ifnull          531
        //   504: aload           24
        //   506: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   509: bipush          33
        //   511: aaload         
        //   512: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   517: ifeq            531
        //   520: aload           20
        //   522: getstatic       com/whatsapp/camera/CameraView.z:[Ljava/lang/String;
        //   525: bipush          34
        //   527: aaload         
        //   528: invokevirtual   android/hardware/Camera$Parameters.setFocusMode:(Ljava/lang/String;)V
        //   531: aload_0        
        //   532: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //   535: aload           20
        //   537: invokevirtual   android/hardware/Camera.setParameters:(Landroid/hardware/Camera$Parameters;)V
        //   540: iconst_1       
        //   541: istore          7
        //   543: iload           7
        //   545: ifeq            561
        //   548: aload_0        
        //   549: getfield        com/whatsapp/camera/CameraView.s:Lcom/whatsapp/camera/i;
        //   552: fload           4
        //   554: fload           5
        //   556: invokeinterface com/whatsapp/camera/i.a:(FF)V
        //   561: aload_0        
        //   562: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //   565: new             Lcom/whatsapp/camera/s;
        //   568: dup            
        //   569: aload_0        
        //   570: invokespecial   com/whatsapp/camera/s.<init>:(Lcom/whatsapp/camera/CameraView;)V
        //   573: invokevirtual   android/hardware/Camera.autoFocus:(Landroid/hardware/Camera$AutoFocusCallback;)V
        //   576: iconst_1       
        //   577: ireturn        
        //   578: astore          10
        //   580: aload           10
        //   582: athrow         
        //   583: astore          11
        //   585: aload           11
        //   587: athrow         
        //   588: astore          12
        //   590: aload           12
        //   592: athrow         
        //   593: astore          13
        //   595: aload           13
        //   597: athrow         
        //   598: astore          14
        //   600: aload           14
        //   602: athrow         
        //   603: astore          15
        //   605: aload           15
        //   607: athrow         
        //   608: astore          28
        //   610: aload           28
        //   612: athrow         
        //   613: astore          17
        //   615: aload           17
        //   617: athrow         
        //   618: astore          18
        //   620: aload           18
        //   622: athrow         
        //   623: astore          27
        //   625: aload           27
        //   627: athrow         
        //   628: astore          26
        //   630: aload           26
        //   632: athrow         
        //   633: astore          25
        //   635: aload           25
        //   637: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      5      11     14     Ljava/lang/RuntimeException;
        //  109    205    578    583    Ljava/lang/RuntimeException;
        //  205    224    583    588    Ljava/lang/RuntimeException;
        //  224    243    588    593    Ljava/lang/RuntimeException;
        //  243    262    593    598    Ljava/lang/RuntimeException;
        //  262    278    598    603    Ljava/lang/RuntimeException;
        //  285    329    603    608    Ljava/lang/RuntimeException;
        //  329    348    608    613    Ljava/lang/RuntimeException;
        //  348    364    613    618    Ljava/lang/RuntimeException;
        //  371    415    618    623    Ljava/lang/RuntimeException;
        //  415    434    623    628    Ljava/lang/RuntimeException;
        //  504    531    628    633    Ljava/lang/RuntimeException;
        //  548    561    633    638    Ljava/lang/RuntimeException;
        //  600    603    603    608    Ljava/lang/RuntimeException;
        //  615    618    618    623    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 299, Size: 299
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
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        try {
            this.j.onTouchEvent(motionEvent);
            if (this.k != null) {
                this.k.onTouchEvent(motionEvent);
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw ex;
        }
    }
    
    public void setCameraCallback(final i s) {
        this.s = s;
    }
    
    public int setZoomLevel(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/camera/CameraView.d:I
        //     4: istore_3       
        //     5: iload_1        
        //     6: iload_3        
        //     7: if_icmple       15
        //    10: iconst_0       
        //    11: ireturn        
        //    12: astore_2       
        //    13: aload_2        
        //    14: athrow         
        //    15: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    18: istore          5
        //    20: iload           5
        //    22: bipush          8
        //    24: if_icmplt       10
        //    27: aload_0        
        //    28: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //    31: invokevirtual   android/hardware/Camera.getParameters:()Landroid/hardware/Camera$Parameters;
        //    34: astore          6
        //    36: aload           6
        //    38: iload_1        
        //    39: invokevirtual   android/hardware/Camera$Parameters.setZoom:(I)V
        //    42: aload_0        
        //    43: getfield        com/whatsapp/camera/CameraView.i:Landroid/hardware/Camera;
        //    46: aload           6
        //    48: invokevirtual   android/hardware/Camera.setParameters:(Landroid/hardware/Camera$Parameters;)V
        //    51: aload_0        
        //    52: getfield        com/whatsapp/camera/CameraView.h:Ljava/util/List;
        //    55: astore          9
        //    57: aload           9
        //    59: ifnull          10
        //    62: aload_0        
        //    63: getfield        com/whatsapp/camera/CameraView.h:Ljava/util/List;
        //    66: invokeinterface java/util/List.size:()I
        //    71: istore          10
        //    73: iload           10
        //    75: iload_1        
        //    76: if_icmplt       10
        //    79: aload_0        
        //    80: getfield        com/whatsapp/camera/CameraView.h:Ljava/util/List;
        //    83: iload_1        
        //    84: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    89: checkcast       Ljava/lang/Integer;
        //    92: invokevirtual   java/lang/Integer.intValue:()I
        //    95: ireturn        
        //    96: astore          4
        //    98: aload           4
        //   100: athrow         
        //   101: astore          7
        //   103: aload           7
        //   105: athrow         
        //   106: astore          8
        //   108: aload           8
        //   110: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      5      12     15     Ljava/lang/RuntimeException;
        //  15     20     96     101    Ljava/lang/RuntimeException;
        //  36     57     101    106    Ljava/lang/RuntimeException;
        //  62     73     106    111    Ljava/lang/RuntimeException;
        //  103    106    106    111    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 55, Size: 55
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
    
    public void surfaceChanged(final SurfaceHolder previewDisplay, final int n, final int n2, final int n3) {
        while (true) {
            try {
                if (this.i == null) {
                    Log.e(CameraView.z[26]);
                    this.f();
                    return;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (this.m.getSurface() == null) {
                    Log.e(CameraView.z[29]);
                    this.f();
                    return;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
            if (!this.g) {
                break;
            }
            return;
        }
        try {
            try {
                if (!previewDisplay.isCreating()) {
                    this.i.stopPreview();
                }
                try {
                    this.i.setPreviewDisplay(previewDisplay);
                    this.b();
                }
                catch (RuntimeException ex3) {
                    this.i.release();
                    this.i = null;
                    Log.b(CameraView.z[27], ex3);
                    this.f();
                }
            }
            catch (RuntimeException ex4) {
                throw ex4;
            }
        }
        catch (IOException ex5) {
            this.i.release();
            this.i = null;
            Log.b(CameraView.z[28], ex5);
            this.f();
        }
    }
    
    public void surfaceCreated(final SurfaceHolder surfaceHolder) {
        this.k();
    }
    
    public void surfaceDestroyed(final SurfaceHolder surfaceHolder) {
        this.m();
        this.l();
    }
}
