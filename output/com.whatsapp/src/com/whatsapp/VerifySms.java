// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MenuItem;
import com.whatsapp.util.b_;
import android.view.KeyEvent;
import android.view.Menu;
import android.content.DialogInterface$OnDismissListener;
import android.text.InputFilter$LengthFilter;
import android.text.InputFilter;
import com.whatsapp.util.b6;
import android.content.DialogInterface$OnClickListener;
import android.support.v7.app.AlertDialog$Builder;
import android.app.Dialog;
import android.os.Bundle;
import android.telephony.ServiceState;
import android.app.Activity;
import android.os.AsyncTask;
import android.app.PendingIntent;
import android.telephony.SmsManager;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import com.whatsapp.util.Log;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.content.ActivityNotFoundException;
import android.app.ProgressDialog;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.content.BroadcastReceiver;
import android.os.CountDownTimer;

public class VerifySms extends VerifyNumber
{
    private static long B;
    private static String D;
    private static long I;
    private static int J;
    private static int L;
    private static int N;
    private static CountDownTimer T;
    private static String U;
    private static BroadcastReceiver Y;
    private static String aa;
    private static boolean ac;
    private static int ad;
    private static short af;
    private static String ai;
    private static final String[] bb;
    private static final int x;
    private static BroadcastReceiver y;
    private boolean A;
    private long C;
    private BroadcastReceiver E;
    private View F;
    private String G;
    private TextView H;
    private long K;
    private TextView M;
    private CountDownTimer O;
    boolean P;
    private Button Q;
    BroadcastReceiver R;
    private View S;
    private long V;
    private CountDownTimer W;
    private String X;
    private ProgressBar Z;
    private long ab;
    BroadcastReceiver ae;
    private final atq ag;
    private String ah;
    private EditText aj;
    private int ak;
    private int s;
    ProgressDialog t;
    private String u;
    BroadcastReceiver v;
    private boolean w;
    private String z;
    
    static {
        final String[] bb2 = new String[101];
        String s = "\nQ\u0016n)";
        int n = -1;
        String[] array = bb2;
        int n2 = 0;
    Label_0016:
        while (true) {
            while (true) {
                final char[] charArray = s.toCharArray();
                final int length = charArray.length;
                int n3 = 0;
                while (true) {
                    Label_2655: {
                        if (length > n3) {
                            break Label_2655;
                        }
                        final String intern = new String(charArray).intern();
                        switch (n) {
                            default: {
                                array[n2] = intern;
                                n2 = 1;
                                array = bb2;
                                s = ",U\u0015{8<";
                                n = 0;
                                continue Label_0016;
                            }
                            case 0: {
                                array[n2] = intern;
                                n2 = 2;
                                s = ".Q\u0017b;!G\bxr.Q\u0017b;1W\u0004\u007f47Z\tb33\u001b\u0013d4;QJh2<QHn3,F\u001c&?4[\u0006`8<\u0019\u0017n)*MHg<,Q\u0017";
                                n = 1;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 1: {
                                array[n2] = intern;
                                s = ".Q\u0017b;!G\bxr.Q\u0017b;1W\u0004\u007f47Z\tb33\u001b\u0013d4;QJx)9@\u0000+";
                                n = 2;
                                n2 = 3;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 2: {
                                array[n2] = intern;
                                n2 = 4;
                                array = bb2;
                                s = ".Q\u0017b;!G\bxr.Q\u0017b;1W\u0004\u007f47Z\tb33\u001b\u0016f.wG\u0011j)=\u0014";
                                n = 3;
                                continue Label_0016;
                            }
                            case 3: {
                                array[n2] = intern;
                                n2 = 5;
                                s = ".Q\u0017b;!G\bxr.Q\u0017b;1W\u0004\u007f47Z\tb33\u001b\u0016n1>\u001b\u0016\u007f<,QE";
                                n = 4;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 4: {
                                array[n2] = intern;
                                s = ",U\u0015{8<";
                                n = 5;
                                n2 = 6;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 5: {
                                array[n2] = intern;
                                n2 = 7;
                                array = bb2;
                                s = ";[\b%*0U\u0011x<(DKY8?]\u0016\u007f8*d\rd3=\u001a\u0006g89F:{57Z\u0000T3-Y\u0007n/";
                                n = 6;
                                continue Label_0016;
                            }
                            case 6: {
                                array[n2] = intern;
                                n2 = 8;
                                s = ".Q\u0017b;!\u0019\u0016f.";
                                n = 7;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 7: {
                                array[n2] = intern;
                                n2 = 9;
                                s = ".Q\u0017b;!\u0019\u0013d4;QQ+";
                                n = 8;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 8: {
                                array[n2] = intern;
                                s = ".Q\u0017b;!G\bxr;U\u000be2,\u0019\u0016f.uS\n&+7]\u0006n";
                                n = 9;
                                n2 = 10;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 9: {
                                array[n2] = intern;
                                n2 = 11;
                                array = bb2;
                                s = ".Q\u0017b;!G\bxr*Q\u0016~0=\u001b\u0016h5=Y\u0000$>7P\u0000+";
                                n = 10;
                                continue Label_0016;
                            }
                            case 10: {
                                array[n2] = intern;
                                n2 = 12;
                                s = ";[\b%*0U\u0011x<(DK]8*]\u0003r\u000e5GK}8*]\u0003b>9@\fd3\u0007G\u0011j)=";
                                n = 11;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 11: {
                                array[n2] = intern;
                                n2 = 13;
                                s = ".Q\u0017b;!G\bxr*Q\u0016~0=\u001b\u0006h}7FEe(5\u0014\fx}5]\u0016x46SI+?7A\u000bh8x@\n+/=S\u0015c26Q";
                                n = 12;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 12: {
                                array[n2] = intern;
                                n2 = 14;
                                s = ".Q\u0017b;!G\bxr*Q\u0016~0=\u001b\u0012j4,]\u000blr+Q\u0017}8*\u001b\u0011b0=PHd(,\u0019\u0004g/=U\u0001r";
                                n = 13;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 13: {
                                array[n2] = intern;
                                n2 = 15;
                                s = ".Q\u0017b;!G\bxr*Q\u0016~0=\u001b\u0010e66[\u0012ep+@\u0004\u007f8";
                                n = 14;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 14: {
                                array[n2] = intern;
                                n2 = 16;
                                s = ".Q\u0017b;!G\bxr*Q\u0016~0=\u001b\u0012j4,]\u000blr+Q\u0017}8*\u001b\u0017n.-Y\u0000";
                                n = 15;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 15: {
                                array[n2] = intern;
                                n2 = 17;
                                s = ".Q\u0017b;!G\bxr*Q\u0016~0=\u0014";
                                n = 16;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 16: {
                                array[n2] = intern;
                                n2 = 18;
                                s = ".Q\u0017b;!G\bxr+U\u0013n9;[\u0001nr;X\u0000j/wW\nf01@Em<1X\u0000o";
                                n = 17;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 17: {
                                array[n2] = intern;
                                n2 = 19;
                                s = ";[\b%*0U\u0011x<(DK]8*]\u0003r\u000e5GKx0+k\u0015c26Q:e(5V\u0000y";
                                n = 18;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 18: {
                                array[n2] = intern;
                                n2 = 20;
                                s = ";[\b%*0U\u0011x<(DK]8*]\u0003r\u000e5GKx0+k\u0006d9=";
                                n = 19;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 19: {
                                array[n2] = intern;
                                n2 = 21;
                                s = ";[\b%*0U\u0011x<(DK]8*]\u0003r\u000e5GKx0+k\u0006h";
                                n = 20;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 20: {
                                array[n2] = intern;
                                n2 = 22;
                                s = ";[\b%*0U\u0011x<(DK}8*]\u0003r3-Y\u0007n/vP\fj17S";
                                n = 21;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 21: {
                                array[n2] = intern;
                                n2 = 23;
                                s = ".Q\u0017b;!G\bxr1Z\u0011n3,\u001b\u0010e66[\u0012e}";
                                n = 22;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 22: {
                                array[n2] = intern;
                                n2 = 24;
                                s = ".Q\u0017b;!G\bxr1Z\u0011n3,";
                                n = 23;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 23: {
                                array[n2] = intern;
                                n2 = 25;
                                s = ".Q\u0017b;!G\bxr1Z\u0011n3,\u001b\u0001n;=FHh2<QJ";
                                n = 24;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 24: {
                                array[n2] = intern;
                                n2 = 26;
                                s = ".Q\u0017b;!G\bxr+U\u0013n.,U\u0011nr;[\bf4,\u0014\u0003j44Q\u0001";
                                n = 25;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 25: {
                                array[n2] = intern;
                                n2 = 27;
                                s = ";[\b%*0U\u0011x<(DK]8*]\u0003r\u000e5GK}8*]\u0003b>9@\fd3\u0007G\u0011j)=";
                                n = 26;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 26: {
                                array[n2] = intern;
                                n2 = 28;
                                s = "9Z\u0001y21PK{/7B\fo8*\u001a1n1=D\rd3!\u001a6F\u000e\u0007f H\u0018\u0011b O";
                                n = 27;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 27: {
                                array[n2] = intern;
                                n2 = 29;
                                s = "/\\\u0004\u007f.9D\u0015";
                                n = 28;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 28: {
                                array[n2] = intern;
                                n2 = 30;
                                s = ".Q\u0017b;!G\bxr;[\u0001n;*[\b}8*]\u0003b>9@\fd34]\u000b`r;[\u0001nr";
                                n = 29;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 29: {
                                array[n2] = intern;
                                n2 = 31;
                                s = ".Q\u0017b;!G\bxr+U\u0013n/=@\u0017r<>@\u0000yr;[\bf4,\u0014\u0003j44Q\u0001";
                                n = 30;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 30: {
                                array[n2] = intern;
                                n2 = 32;
                                s = ";[\b%*0U\u0011x<(DK]8*]\u0003r\u000e5GKx0+k\u0017n)*M:j;,Q\u0017";
                                n = 31;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 31: {
                                array[n2] = intern;
                                n2 = 33;
                                s = "4SX";
                                n = 32;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 32: {
                                array[n2] = intern;
                                n2 = 34;
                                s = "(X\u0004\u007f;7F\b6";
                                n = 33;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 33: {
                                array[n2] = intern;
                                n2 = 35;
                                s = "4WX";
                                n = 34;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 34: {
                                array[n2] = intern;
                                n2 = 36;
                                s = "9Z\u0001y21PKb3,Q\u000b\u007fs9W\u0011b26\u001a3B\u0018\u000f";
                                n = 35;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 35: {
                                array[n2] = intern;
                                n2 = 37;
                                s = "9Z\u0001y21P";
                                n = 36;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 36: {
                                array[n2] = intern;
                                n2 = 38;
                                s = "0@\u0011{.b\u001bJ|*/\u001a\u0012c<,G\u0004{-vW\nfr>U\u0014$11Z\u000e$+=F\fm4;U\u0011b26\u001a\u0015c-";
                                n = 37;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 37: {
                                array[n2] = intern;
                                n2 = 39;
                                s = "o\u0007Q;i";
                                n = 38;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 38: {
                                array[n2] = intern;
                                n2 = 40;
                                s = ";[\b%*0U\u0011x<(DK]8*]\u0003r\u000e5GKx0+k\u0017n)*M:j;,Q\u0017";
                                n = 39;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 39: {
                                array[n2] = intern;
                                n2 = 41;
                                s = "+Q\u0017}8*\u0019\u0016n3<\u0019\u0011b0=[\u0010\u007f";
                                n = 40;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 40: {
                                array[n2] = intern;
                                n2 = 42;
                                s = ".Q\u0017b;!G\bxr<Q\u0016\u007f/7M";
                                n = 41;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 41: {
                                array[n2] = intern;
                                n2 = 43;
                                s = ";[\u000be8;@\f}4,M";
                                n = 42;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 42: {
                                array[n2] = intern;
                                n2 = 44;
                                s = ".Q\u0017b;!G\bxr6Q\u0011|2*_Jx*1@\u0006cr0U\u0016&/=@\u0017rp(Q\u000bo46S";
                                n = 43;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 43: {
                                array[n2] = intern;
                                n2 = 45;
                                s = ".Q\u0017b;!G\bxr6Q\u0011|2*_Jx*1@\u0006cr6[Hx<.Q\u0001&>7P\u0000";
                                n = 44;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 44: {
                                array[n2] = intern;
                                n2 = 46;
                                s = "xZ\u0000|`";
                                n = 45;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 45: {
                                array[n2] = intern;
                                n2 = 47;
                                s = ".Q\u0017b;!G\bxr6Q\u0011|2*_Jx*1@\u0006c}7X\u00016";
                                n = 46;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 46: {
                                array[n2] = intern;
                                n2 = 48;
                                s = ".Q\u0017b;!G\bxr6Q\u0011|2*_Jj>,]\u0013n}";
                                n = 47;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 47: {
                                array[n2] = intern;
                                n2 = 49;
                                s = ";[\b%*0U\u0011x<(DK]8*]\u0003r\u000e5GKx0+k\u0015c26Q:e(5V\u0000y";
                                n = 48;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 48: {
                                array[n2] = intern;
                                n2 = 50;
                                s = ";[\b%*0U\u0011x<(DK]8*]\u0003r\u000e5GKx0+k\u0006d9=";
                                n = 49;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 49: {
                                array[n2] = intern;
                                n2 = 51;
                                s = ".Q\u0017b;!G\bxr+U\u0013n9;[\u0001nr+U\u0013nr;[\bf4,\u0014\u0003j44Q\u0001";
                                n = 50;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 50: {
                                array[n2] = intern;
                                n2 = 52;
                                s = ";[\b%*0U\u0011x<(DK]8*]\u0003r\u000e5GKx0+k\u0006h";
                                n = 51;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 51: {
                                array[n2] = intern;
                                n2 = 53;
                                s = ";[\b%*0U\u0011x<(DK]8*]\u0003r\u000e5GKx0+k\u0006d9=";
                                n = 52;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 52: {
                                array[n2] = intern;
                                n2 = 54;
                                s = ";[\b%*0U\u0011x<(DK]8*]\u0003r\u000e5GKx0+k\u0015c26Q:e(5V\u0000y";
                                n = 53;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 53: {
                                array[n2] = intern;
                                n2 = 55;
                                s = ";[\b%*0U\u0011x<(DK]8*]\u0003r\u000e5GKx0+k\u0006h";
                                n = 54;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 54: {
                                array[n2] = intern;
                                n2 = 56;
                                s = ".Q\u0017b;!B\nb>=\u001b\u0010e66[\u0012ep+@\u0004\u007f8x";
                                n = 55;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 55: {
                                array[n2] = intern;
                                n2 = 57;
                                s = ".Q\u0017b;!\u0019\u0013d4;Q";
                                n = 56;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 56: {
                                array[n2] = intern;
                                n2 = 58;
                                s = ".Q\u0017b;!\u0019\u0013d4;Q";
                                n = 57;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 57: {
                                array[n2] = intern;
                                n2 = 59;
                                s = "9Z\u0001y21PKb3,Q\u000b\u007fs9W\u0011b26\u001a!J\t\u0019k6F\u000e\u0007f H\u0018\u0011b O";
                                n = 58;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 58: {
                                array[n2] = intern;
                                n2 = 60;
                                s = "+Y\u0016";
                                n = 59;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 59: {
                                array[n2] = intern;
                                n2 = 61;
                                s = ";[\b%*0U\u0011x<(DKX\u0010\u000bk6N\u0013\f";
                                n = 60;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 60: {
                                array[n2] = intern;
                                n2 = 62;
                                s = ";[\b%*0U\u0011x<(DK]8*]\u0003r\u000e5GKx0+k\u0016\u007f<*@:\u007f45Q";
                                n = 61;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 61: {
                                array[n2] = intern;
                                n2 = 63;
                                s = ".Q\u0017b;!G\bxr*Q\u0014~8+@Hx0+";
                                n = 62;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 62: {
                                array[n2] = intern;
                                n2 = 64;
                                s = "\u000f\\\u0004\u007f.\u0019D\u0015+";
                                n = 63;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 63: {
                                array[n2] = intern;
                                n2 = 65;
                                s = "xc\rj)+u\u0015{}1Z\u0011n/6U\t+(+QE&}+U\u0003n},[Eo4+W\u0004y9";
                                n = 64;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 64: {
                                array[n2] = intern;
                                n2 = 66;
                                s = ".Q\u0017b;!G\bxr-Z\u000ee2/ZHx)9@\u0000+";
                                n = 65;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 65: {
                                array[n2] = intern;
                                n2 = 67;
                                s = ".Q\u0017b;!G\bxr+Q\u000bor";
                                n = 66;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 66: {
                                array[n2] = intern;
                                n2 = 68;
                                s = ".Q\u0017b;!G\bxr6A\bi8*\u001b\fep/F\ne:uG\u0011j)=\u0014\u0007d(6W\u0000+)7\u0014\u0017n:(\\\ne8";
                                n = 67;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 67: {
                                array[n2] = intern;
                                n2 = 69;
                                s = "1Z\u0015~)\u0007Y\u0000\u007f57P";
                                n = 68;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 68: {
                                array[n2] = intern;
                                n2 = 70;
                                s = ";[\b%*0U\u0011x<(DK]8*]\u0003r\u000e5GKx0+k\u0016\u007f<*@:\u007f45Q";
                                n = 69;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 69: {
                                array[n2] = intern;
                                n2 = 71;
                                s = ".Q\u0017b;!G\bxr;[\u0010e)<[\u0012e)1Y\u0000yr;[\bf4,\u0014\u0003j44Q\u0001";
                                n = 70;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 70: {
                                array[n2] = intern;
                                n2 = 72;
                                s = ";[\b%*0U\u0011x<(DK]8*]\u0003r\u000e5GK}8*]\u0003b>9@\fd3\u0007G\u0011j)=";
                                n = 71;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 71: {
                                array[n2] = intern;
                                n2 = 73;
                                s = ".Q\u0017b;!G\bxr(U\u0010x8x";
                                n = 72;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 72: {
                                array[n2] = intern;
                                n2 = 74;
                                s = ".Q\u0017b;!G\bxr(U\u0010x8wW\nf01@Em<1X\u0000o";
                                n = 73;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 73: {
                                array[n2] = intern;
                                n2 = 75;
                                s = ".Q\u0017b;!G\bxr.Q\u0017b;1Q\u0001$>0U\u000bl86A\bi8*";
                                n = 74;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 74: {
                                array[n2] = intern;
                                n2 = 76;
                                s = ".Q\u0017b;!G\bxr.Q\u0017b;1Q\u0001$>0U\u000bl86A\bi8*\u001b\bx:+@\ny8<VJc89X\u0011c$";
                                n = 75;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 75: {
                                array[n2] = intern;
                                n2 = 77;
                                s = "+Q\tmp+Q\u000bop+Q\u000bop>U\fg(*Q";
                                n = 76;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 76: {
                                array[n2] = intern;
                                n2 = 78;
                                s = ";[\b%*0U\u0011x<(DKX\u0010\u000bk6N\u0013\f";
                                n = 77;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 77: {
                                array[n2] = intern;
                                n2 = 79;
                                s = ".Q\u0017b;!G\bxr;\\\u0004g1=Z\u0002nr+Q\u000b\u007f}";
                                n = 78;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 78: {
                                array[n2] = intern;
                                n2 = 80;
                                s = ".Q\u0017b;!G\bxr;\\\u0004g1=Z\u0002nr>U\fg8<\u0019\u0002dp,[He8 @";
                                n = 79;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 79: {
                                array[n2] = intern;
                                n2 = 81;
                                s = "*Q\u0011y4=P";
                                n = 80;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 80: {
                                array[n2] = intern;
                                n2 = 82;
                                s = ";W";
                                n = 81;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 81: {
                                array[n2] = intern;
                                n2 = 83;
                                s = ";[\b%*0U\u0011x<(DK]8*]\u0003r\u000e5GKy29Y\fe:";
                                n = 82;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 82: {
                                array[n2] = intern;
                                n2 = 84;
                                s = "(\\";
                                n = 83;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 83: {
                                array[n2] = intern;
                                n2 = 85;
                                s = ";[\b%*0U\u0011x<(DKY8?]\u0016\u007f8*d\rd3=\u001a\u0011j-(Q\u0001T.5G:g46_";
                                n = 84;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 84: {
                                array[n2] = intern;
                                n2 = 86;
                                s = "/\\\u0004\u007f.9D\u0015";
                                n = 85;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 85: {
                                array[n2] = intern;
                                n2 = 87;
                                s = ".Q\u0017b;!G\bxr;F\u0000j)=\u001b\u0016x86P";
                                n = 86;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 86: {
                                array[n2] = intern;
                                n2 = 88;
                                s = ".Q\u0017b;!G\bxr;F\u0000j)=";
                                n = 87;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 87: {
                                array[n2] = intern;
                                n2 = 89;
                                s = ".Q\u0017b;!G\bxr/F\ne:uG\u0011j)=\u0014\u0007d(6W\u0000+)7\u0014\bj46\u0014";
                                n = 88;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 88: {
                                array[n2] = intern;
                                n2 = 90;
                                s = ".Q\u0017b;!G\bxr;F\u0000j)=\u001b\u0006d9=\u0014";
                                n = 89;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 89: {
                                array[n2] = intern;
                                n2 = 91;
                                s = ".Q\u0017b;!G\bxr;F\u0000j)=\u001b\u0016j+=P\u0006d9=\u0014";
                                n = 90;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 90: {
                                array[n2] = intern;
                                n2 = 92;
                                s = ";[\b%*0U\u0011x<(DK]8*]\u0003r\u000e5GKx8*B\u0000y.=Z\u0001";
                                n = 91;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 91: {
                                array[n2] = intern;
                                n2 = 93;
                                s = ".Q\u0017b;!G\bxr;F\u0000j)=\u001b\u0001b.(X\u0004rp*[\u0004f46S";
                                n = 92;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 92: {
                                array[n2] = intern;
                                n2 = 94;
                                s = ";[\b%*0U\u0011x<(DK]8*]\u0003r\u000e5GKh59Z\u0002n3-Y\u0007n/";
                                n = 93;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 93: {
                                array[n2] = intern;
                                n2 = 95;
                                s = "h\u0005W8im\u0002R3d9V\u0006o8>S\rb73X\be2(E\u0017x)-B\u0012s$\"u'H\u0019\u001dr\"C\u0014\u0012\u007f)F\u0013\u0017d4Y\u000e\fa3\\\u0005\u0001n";
                                n = 94;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 94: {
                                array[n2] = intern;
                                n2 = 96;
                                s = ".Q\u0017b;!G\bxr;F\u0000j)=\u001b\u0006h}7FEe(5\u0014\fx}5]\u0016x46SI+?7A\u000bh8x@\n+/=S\u0015c26Q";
                                n = 95;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 95: {
                                array[n2] = intern;
                                n2 = 97;
                                s = ";[\b%*0U\u0011x<(D:{/=R\u0000y86W\u0000x";
                                n = 96;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 96: {
                                array[n2] = intern;
                                n2 = 98;
                                s = ".Q\u0017b;!G\bxr;X\u0000j/+U\u0013n/=@\u0017r<>@\u0000yr;[\bf4,\u0014\u0003j44Q\u0001";
                                n = 97;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 97: {
                                array[n2] = intern;
                                n2 = 99;
                                s = ";[\b%*0U\u0011x<(DK]8*]\u0003r\u000e5GKx0+k\u0017n)*M:j;,Q\u0017";
                                n = 98;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 98: {
                                array[n2] = intern;
                                n2 = 100;
                                s = ".Q\u0017b;!\u0019\u0016f.";
                                n = 99;
                                array = bb2;
                                continue Label_0016;
                            }
                            case 99: {
                                break;
                            }
                        }
                        while (true) {
                            array[n2] = intern;
                            bb = bb2;
                            while (true) {
                                Label_2750: {
                                    try {
                                        if (App.aV == 3) {
                                            final int x2 = 20000;
                                            x = x2;
                                            VerifySms.J = 10;
                                            VerifySms.L = 0;
                                            VerifySms.ad = 6;
                                            VerifySms.N = 6;
                                            VerifySms.T = null;
                                            VerifySms.I = VerifySms.x;
                                            VerifySms.B = 0L;
                                            VerifySms.y = null;
                                            VerifySms.Y = null;
                                            VerifySms.U = null;
                                            VerifySms.aa = "";
                                            VerifySms.ai = "";
                                            VerifySms.D = null;
                                            VerifySms.ac = false;
                                            return;
                                        }
                                        break Label_2750;
                                        Label_2717: {
                                            final char c = 'X';
                                        }
                                        while (true) {
                                            break Label_2700;
                                            final char c2 = charArray[n3];
                                            char c = '\0';
                                            charArray[n3] = (char)(c ^ c2);
                                            ++n3;
                                            break;
                                            Label_2738:
                                            c = '\u000b';
                                            continue;
                                            Label_2696:
                                            c = ']';
                                            continue;
                                            Label_2724:
                                            c = '4';
                                            continue;
                                            Label_2731:
                                            c = 'e';
                                            continue;
                                        }
                                    }
                                    // switch([Lcom.strobel.decompiler.ast.Label;@3e721a16, n3 % 5)
                                    catch (ActivityNotFoundException ex) {
                                        throw ex;
                                    }
                                }
                                final int x2 = 300000;
                                continue;
                            }
                        }
                    }
                }
            }
            break;
        }
    }
    
    public VerifySms() {
        this.z = VerifySms.bb[100];
        this.ab = 0L;
        this.W = null;
        this.P = false;
        this.ag = new atq(this, null);
        this.v = new VerifySms$1(this);
        this.R = new VerifySms$2(this);
        this.ae = new VerifySms$3(this);
        this.ak = -2;
    }
    
    private void A() {
        final Intent intent = new Intent(VerifySms.bb[36], Uri.parse(VerifySms.bb[38] + '?' + VerifySms.bb[34] + VerifySms.bb[37] + '&' + VerifySms.bb[35] + all.c() + '&' + VerifySms.bb[33] + all.b()));
        try {
            this.startActivity(intent);
        }
        catch (ActivityNotFoundException ex) {
            App.a((Context)this, 2131230786, 0);
        }
    }
    
    static void A(final VerifySms verifySms) {
        verifySms.D();
    }
    
    static TextView B(final VerifySms verifySms) {
        return verifySms.H;
    }
    
    private void B() {
        final SharedPreferences$Editor edit = this.getPreferences(0).edit();
        try {
            edit.remove(VerifySms.bb[20]);
            edit.remove(VerifySms.bb[21]);
            edit.remove(VerifySms.bb[19]);
            if (!edit.commit()) {
                Log.w(VerifySms.bb[18]);
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    static int C() {
        return VerifySms.J;
    }
    
    private void D() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: getstatic       com/whatsapp/VerifySms.L:I
        //     7: istore          7
        //     9: iload           7
        //    11: tableswitch {
        //                6: 161
        //                7: 68
        //                8: 68
        //                9: 68
        //               10: 68
        //               11: 68
        //               12: 68
        //               13: 96
        //               14: 191
        //               15: 230
        //               16: 132
        //          default: 68
        //        }
        //    68: new             Ljava/lang/StringBuilder;
        //    71: dup            
        //    72: invokespecial   java/lang/StringBuilder.<init>:()V
        //    75: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //    78: bipush          56
        //    80: aaload         
        //    81: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    84: getstatic       com/whatsapp/VerifySms.L:I
        //    87: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    90: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    93: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    96: aload_0        
        //    97: ldc_w           2131755787
        //   100: invokevirtual   com/whatsapp/VerifySms.findViewById:(I)Landroid/view/View;
        //   103: iconst_0       
        //   104: invokevirtual   android/view/View.setVisibility:(I)V
        //   107: aload_0        
        //   108: getfield        com/whatsapp/VerifySms.Q:Landroid/widget/Button;
        //   111: aload_0        
        //   112: ldc_w           2131231890
        //   115: invokevirtual   com/whatsapp/VerifySms.getString:(I)Ljava/lang/String;
        //   118: invokevirtual   android/widget/Button.setText:(Ljava/lang/CharSequence;)V
        //   121: aload_0        
        //   122: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   125: bipush          57
        //   127: aaload         
        //   128: putfield        com/whatsapp/VerifySms.z:Ljava/lang/String;
        //   131: return         
        //   132: aload_0        
        //   133: ldc_w           2131755787
        //   136: invokevirtual   com/whatsapp/VerifySms.findViewById:(I)Landroid/view/View;
        //   139: iconst_0       
        //   140: invokevirtual   android/view/View.setVisibility:(I)V
        //   143: aload_0        
        //   144: getfield        com/whatsapp/VerifySms.Q:Landroid/widget/Button;
        //   147: aload_0        
        //   148: ldc_w           2131231890
        //   151: invokevirtual   com/whatsapp/VerifySms.getString:(I)Ljava/lang/String;
        //   154: invokevirtual   android/widget/Button.setText:(Ljava/lang/CharSequence;)V
        //   157: iload_1        
        //   158: ifeq            131
        //   161: aload_0        
        //   162: ldc_w           2131755787
        //   165: invokevirtual   com/whatsapp/VerifySms.findViewById:(I)Landroid/view/View;
        //   168: bipush          8
        //   170: invokevirtual   android/view/View.setVisibility:(I)V
        //   173: aload_0        
        //   174: getfield        com/whatsapp/VerifySms.Q:Landroid/widget/Button;
        //   177: aload_0        
        //   178: ldc_w           2131231890
        //   181: invokevirtual   com/whatsapp/VerifySms.getString:(I)Ljava/lang/String;
        //   184: invokevirtual   android/widget/Button.setText:(Ljava/lang/CharSequence;)V
        //   187: iload_1        
        //   188: ifeq            131
        //   191: aload_0        
        //   192: ldc_w           2131755787
        //   195: invokevirtual   com/whatsapp/VerifySms.findViewById:(I)Landroid/view/View;
        //   198: iconst_0       
        //   199: invokevirtual   android/view/View.setVisibility:(I)V
        //   202: aload_0        
        //   203: getfield        com/whatsapp/VerifySms.Q:Landroid/widget/Button;
        //   206: aload_0        
        //   207: ldc_w           2131231609
        //   210: invokevirtual   com/whatsapp/VerifySms.getString:(I)Ljava/lang/String;
        //   213: invokevirtual   android/widget/Button.setText:(Ljava/lang/CharSequence;)V
        //   216: aload_0        
        //   217: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   220: bipush          58
        //   222: aaload         
        //   223: putfield        com/whatsapp/VerifySms.z:Ljava/lang/String;
        //   226: iload_1        
        //   227: ifeq            131
        //   230: aload_0        
        //   231: ldc_w           2131755787
        //   234: invokevirtual   com/whatsapp/VerifySms.findViewById:(I)Landroid/view/View;
        //   237: bipush          8
        //   239: invokevirtual   android/view/View.setVisibility:(I)V
        //   242: aload_0        
        //   243: getfield        com/whatsapp/VerifySms.Q:Landroid/widget/Button;
        //   246: bipush          8
        //   248: invokevirtual   android/widget/Button.setVisibility:(I)V
        //   251: iload_1        
        //   252: ifeq            131
        //   255: goto            68
        //   258: astore_2       
        //   259: aload_2        
        //   260: athrow         
        //   261: astore_3       
        //   262: aload_3        
        //   263: athrow         
        //   264: astore          4
        //   266: aload           4
        //   268: athrow         
        //   269: astore          5
        //   271: aload           5
        //   273: athrow         
        //   274: astore          6
        //   276: aload           6
        //   278: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  4      9      258    261    Landroid/content/ActivityNotFoundException;
        //  68     96     274    279    Landroid/content/ActivityNotFoundException;
        //  132    157    261    264    Landroid/content/ActivityNotFoundException;
        //  161    187    264    269    Landroid/content/ActivityNotFoundException;
        //  191    226    269    274    Landroid/content/ActivityNotFoundException;
        //  230    251    274    279    Landroid/content/ActivityNotFoundException;
        //  259    261    261    264    Landroid/content/ActivityNotFoundException;
        //  262    264    264    269    Landroid/content/ActivityNotFoundException;
        //  266    269    269    274    Landroid/content/ActivityNotFoundException;
        //  271    274    274    279    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 105, Size: 105
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
    
    private void E() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.h:Landroid/telephony/TelephonyManager;
        //     3: invokevirtual   android/telephony/TelephonyManager.getNetworkOperator:()Ljava/lang/String;
        //     6: astore_1       
        //     7: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //    10: bipush          39
        //    12: aaload         
        //    13: aload_1        
        //    14: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    17: istore_3       
        //    18: iload_3        
        //    19: ifne            46
        //    22: sipush          16000
        //    25: new             Ljava/util/Random;
        //    28: dup            
        //    29: invokespecial   java/util/Random.<init>:()V
        //    32: bipush          100
        //    34: invokevirtual   java/util/Random.nextInt:(I)I
        //    37: iadd           
        //    38: i2s            
        //    39: putstatic       com/whatsapp/VerifySms.af:S
        //    42: return         
        //    43: astore_2       
        //    44: aload_2        
        //    45: athrow         
        //    46: iconst_0       
        //    47: putstatic       com/whatsapp/VerifySms.af:S
        //    50: getstatic       com/whatsapp/App.I:Z
        //    53: istore          5
        //    55: iload           5
        //    57: ifeq            42
        //    60: goto            22
        //    63: astore          4
        //    65: aload           4
        //    67: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  7      18     43     46     Landroid/content/ActivityNotFoundException;
        //  22     42     63     68     Landroid/content/ActivityNotFoundException;
        //  46     55     63     68     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0022:
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
    
    private long F() {
        return this.getPreferences(0).getLong(VerifySms.bb[62], 0L);
    }
    
    private int G() {
        return (int)(Math.random() * (4000.0 * (Math.pow(2.0, this.s++) - 1.0)));
    }
    
    static String H() {
        return VerifySms.aa;
    }
    
    private void I() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //     4: bipush          43
        //     6: aaload         
        //     7: invokevirtual   com/whatsapp/VerifySms.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    10: checkcast       Landroid/net/ConnectivityManager;
        //    13: invokevirtual   android/net/ConnectivityManager.getActiveNetworkInfo:()Landroid/net/NetworkInfo;
        //    16: astore_1       
        //    17: new             Ljava/lang/StringBuilder;
        //    20: dup            
        //    21: invokespecial   java/lang/StringBuilder.<init>:()V
        //    24: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //    27: bipush          48
        //    29: aaload         
        //    30: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    33: aload_1        
        //    34: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    37: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    40: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    43: invokestatic    com/whatsapp/App.a6:()V
        //    46: aload_1        
        //    47: ifnonnull       68
        //    50: iconst_m1      
        //    51: istore_3       
        //    52: aload_0        
        //    53: getfield        com/whatsapp/VerifySms.ak:I
        //    56: istore          5
        //    58: iload_3        
        //    59: iload           5
        //    61: if_icmpne       81
        //    64: return         
        //    65: astore_2       
        //    66: aload_2        
        //    67: athrow         
        //    68: aload_1        
        //    69: invokevirtual   android/net/NetworkInfo.getType:()I
        //    72: istore_3       
        //    73: goto            52
        //    76: astore          4
        //    78: aload           4
        //    80: athrow         
        //    81: new             Ljava/lang/StringBuilder;
        //    84: dup            
        //    85: invokespecial   java/lang/StringBuilder.<init>:()V
        //    88: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //    91: bipush          47
        //    93: aaload         
        //    94: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    97: aload_0        
        //    98: getfield        com/whatsapp/VerifySms.ak:I
        //   101: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   104: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   107: bipush          46
        //   109: aaload         
        //   110: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   113: iload_3        
        //   114: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   117: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   120: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   123: aload_0        
        //   124: iload_3        
        //   125: putfield        com/whatsapp/VerifySms.ak:I
        //   128: aload_0        
        //   129: getfield        com/whatsapp/VerifySms.ak:I
        //   132: iconst_m1      
        //   133: if_icmpeq       64
        //   136: aload_0        
        //   137: getfield        com/whatsapp/VerifySms.ag:Lcom/whatsapp/atq;
        //   140: iconst_1       
        //   141: invokevirtual   com/whatsapp/atq.hasMessages:(I)Z
        //   144: istore          7
        //   146: iload           7
        //   148: ifeq            64
        //   151: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   154: bipush          44
        //   156: aaload         
        //   157: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   160: aload_0        
        //   161: getfield        com/whatsapp/VerifySms.ag:Lcom/whatsapp/atq;
        //   164: iconst_1       
        //   165: invokevirtual   com/whatsapp/atq.removeMessages:(I)V
        //   168: aload_0        
        //   169: invokespecial   com/whatsapp/VerifySms.h:()V
        //   172: aload_0        
        //   173: invokespecial   com/whatsapp/VerifySms.J:()Ljava/lang/String;
        //   176: astore          8
        //   178: aload           8
        //   180: ifnull          211
        //   183: aload_0        
        //   184: getfield        com/whatsapp/VerifySms.ag:Lcom/whatsapp/atq;
        //   187: iconst_1       
        //   188: aload           8
        //   190: invokevirtual   com/whatsapp/atq.obtainMessage:(ILjava/lang/Object;)Landroid/os/Message;
        //   193: astore          10
        //   195: aload_0        
        //   196: getfield        com/whatsapp/VerifySms.ag:Lcom/whatsapp/atq;
        //   199: aload           10
        //   201: invokevirtual   com/whatsapp/atq.sendMessage:(Landroid/os/Message;)Z
        //   204: pop            
        //   205: getstatic       com/whatsapp/App.I:Z
        //   208: ifeq            64
        //   211: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   214: bipush          45
        //   216: aaload         
        //   217: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   220: return         
        //   221: astore          9
        //   223: aload           9
        //   225: athrow         
        //   226: astore          6
        //   228: aload           6
        //   230: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  17     46     65     68     Landroid/content/ActivityNotFoundException;
        //  52     58     76     81     Landroid/content/ActivityNotFoundException;
        //  81     146    226    231    Landroid/content/ActivityNotFoundException;
        //  195    211    221    226    Landroid/content/ActivityNotFoundException;
        //  211    220    221    226    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0052:
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
    
    private String J() {
        final SharedPreferences preferences = this.getPreferences(0);
        final String string = preferences.getString(VerifySms.bb[55], (String)null);
        final String string2 = preferences.getString(VerifySms.bb[54], (String)null);
        try {
            final boolean equals = this.G.equals(string);
            String string3 = null;
            if (equals) {
                final boolean equals2 = this.u.equals(string2);
                string3 = null;
                if (equals2) {
                    string3 = preferences.getString(VerifySms.bb[53], (String)null);
                }
            }
            return string3;
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    private void K() {
        this.v();
        this.C = VerifySms.x;
        this.M.setText((CharSequence)(this.getString(2131231889, new Object[] { 2, 2 }) + " "));
        this.m();
    }
    
    private void L() {
        if (this.e()) {
            this.registerReceiver(this.v, new IntentFilter(VerifySms.bb[61]));
            VerifySms.y = this.v;
            final IntentFilter intentFilter = new IntentFilter(VerifySms.bb[59]);
            intentFilter.addDataScheme(VerifySms.bb[60]);
            intentFilter.addDataAuthority("*", Short.toString(VerifySms.af));
            this.registerReceiver(this.ae, intentFilter);
            VerifySms.Y = this.ae;
        }
    }
    
    static int a(final int n) {
        return VerifySms.N = n;
    }
    
    static long a(final long i) {
        return VerifySms.I = i;
    }
    
    static long a(final VerifySms verifySms, final long k) {
        return verifySms.K = k;
    }
    
    private String a(final Intent intent) {
        final boolean equals = VerifySms.bb[29].equals(intent.getScheme());
        String queryParameter = null;
        if (!equals) {
            return queryParameter;
        }
        final Uri data = intent.getData();
        queryParameter = null;
        if (data == null) {
            return queryParameter;
        }
        try {
            final boolean equals2 = "r".equals(data.getHost());
            queryParameter = null;
            if (equals2) {
                queryParameter = data.getQueryParameter("c");
                Log.i(VerifySms.bb[30] + queryParameter);
            }
            return queryParameter;
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    private void a() {
        this.X = "+" + this.G + this.u;
        final String a = alm.a(VerifyNumber.b(this.G, this.u));
        final String string = this.getString(2131231575);
        final String string2 = this.getString(2131231574);
        ((TextView)this.findViewById(2131755783)).setText((CharSequence)string);
        ((TextView)this.findViewById(2131755784)).setText((CharSequence)a);
        ((TextView)this.findViewById(2131755786)).setText((CharSequence)string2);
        this.Q.setVisibility(8);
        this.findViewById(2131755779).setVisibility(0);
        this.findViewById(2131755772).setVisibility(8);
        this.findViewById(2131755781).setVisibility(0);
        this.findViewById(2131755782).setVisibility(8);
        this.findViewById(2131755787).setVisibility(8);
    }
    
    private void a(final SmsManager smsManager, final String s) {
        this.M.setText((CharSequence)(this.getString(2131231889, new Object[] { 1, 2 }) + " "));
        VerifySms.L = 1;
        this.t();
        final PendingIntent broadcast = PendingIntent.getBroadcast((Context)this, 0, new Intent(VerifySms.bb[78]), 0);
        try {
            smsManager.sendDataMessage(VerifySms.U, (String)null, VerifySms.af, s.getBytes(), broadcast, (PendingIntent)null);
            Log.i(VerifySms.bb[79] + System.currentTimeMillis());
        }
        catch (Exception ex) {
            Log.i(VerifySms.bb[80]);
            this.c(VerifySms.bb[77]);
            this.K();
        }
    }
    
    static void a(final VerifySms verifySms) {
        verifySms.o();
    }
    
    static void a(final VerifySms verifySms, final int n) {
        verifySms.h(n);
    }
    
    static void a(final VerifySms verifySms, final String s) {
        verifySms.b(s);
    }
    
    static boolean a(final VerifySms verifySms, final boolean a) {
        return verifySms.A = a;
    }
    
    private boolean a(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_1        
        //     5: ifnull          54
        //     8: aload_1        
        //     9: invokevirtual   java/lang/String.length:()I
        //    12: istore          4
        //    14: getstatic       com/whatsapp/VerifySms.ad:I
        //    17: istore          5
        //    19: iload           4
        //    21: iload           5
        //    23: if_icmpne       54
        //    26: iconst_0       
        //    27: istore          6
        //    29: iload           6
        //    31: aload_1        
        //    32: invokevirtual   java/lang/String.length:()I
        //    35: if_icmpge       71
        //    38: aload_1        
        //    39: iload           6
        //    41: invokevirtual   java/lang/String.charAt:(I)C
        //    44: invokestatic    java/lang/Character.isDigit:(C)Z
        //    47: istore          8
        //    49: iload           8
        //    51: ifne            64
        //    54: iconst_0       
        //    55: ireturn        
        //    56: astore_3       
        //    57: aload_3        
        //    58: athrow         
        //    59: astore          7
        //    61: aload           7
        //    63: athrow         
        //    64: iinc            6, 1
        //    67: iload_2        
        //    68: ifeq            29
        //    71: iconst_1       
        //    72: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      19     56     59     Landroid/content/ActivityNotFoundException;
        //  38     49     59     64     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0054:
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
    
    static long b() {
        return VerifySms.I;
    }
    
    static long b(final VerifySms verifySms, final long ab) {
        return verifySms.ab = ab;
    }
    
    static ProgressBar b(final VerifySms verifySms) {
        return verifySms.Z;
    }
    
    static String b(final VerifySms verifySms, final String u) {
        return verifySms.u = u;
    }
    
    private void b(final long n) {
        try {
            if (this.O != null) {
                this.O.cancel();
                this.O = null;
            }
            this.Q.setEnabled(false);
            this.O = new a8e(this, n, 1000L).start();
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    static void b(final VerifySms verifySms, final boolean b) {
        verifySms.c(b);
    }
    
    private void b(final String s) {
        this.h(s);
        this.h();
    }
    
    static boolean b(final boolean ac) {
        return VerifySms.ac = ac;
    }
    
    static long c(final VerifySms verifySms) {
        return verifySms.V;
    }
    
    static String c() {
        return VerifySms.U;
    }
    
    private void c(final long n) {
        try {
            if (this.W != null) {
                this.W.cancel();
                this.W = null;
            }
            this.aj.setEnabled(false);
            final View viewById = this.findViewById(2131755790);
            viewById.setVisibility(0);
            final ProgressBar progressBar = (ProgressBar)this.findViewById(2131755791);
            progressBar.setVisibility(0);
            this.W = new yl(this, n, 1000L, progressBar, n, viewById).start();
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    static void c(final VerifySms verifySms, final long n) {
        verifySms.b(n);
    }
    
    private void c(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: getstatic       com/whatsapp/App.I:Z
        //     5: istore_3       
        //     6: aload_0        
        //     7: aload_0        
        //     8: getfield        com/whatsapp/VerifySms.G:Ljava/lang/String;
        //    11: aload_0        
        //    12: getfield        com/whatsapp/VerifySms.u:Ljava/lang/String;
        //    15: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
        //    18: iconst_0       
        //    19: putstatic       com/whatsapp/VerifySms.L:I
        //    22: aload_0        
        //    23: invokespecial   com/whatsapp/VerifySms.q:()V
        //    26: aload_0        
        //    27: getfield        com/whatsapp/VerifySms.l:Z
        //    30: ifeq            178
        //    33: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //    36: bipush          75
        //    38: aaload         
        //    39: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    42: aload_0        
        //    43: invokestatic    com/whatsapp/App.x:(Landroid/content/Context;)Lcom/whatsapp/App$Me;
        //    46: astore          12
        //    48: aload           12
        //    50: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    53: invokestatic    com/whatsapp/App.m:(Landroid/content/Context;)Ljava/lang/String;
        //    56: putfield        com/whatsapp/App$Me.jabber_id:Ljava/lang/String;
        //    59: aload           12
        //    61: getfield        com/whatsapp/App$Me.jabber_id:Ljava/lang/String;
        //    64: astore          14
        //    66: aload           14
        //    68: ifnull          93
        //    71: iload_2        
        //    72: invokestatic    com/whatsapp/util/Log.b:(Z)V
        //    75: aload           12
        //    77: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/App$Me;)Z
        //    80: ifne            103
        //    83: aload_0        
        //    84: invokevirtual   com/whatsapp/VerifySms.finish:()V
        //    87: return         
        //    88: astore          13
        //    90: aload           13
        //    92: athrow         
        //    93: iconst_0       
        //    94: istore_2       
        //    95: goto            71
        //    98: astore          15
        //   100: aload           15
        //   102: athrow         
        //   103: aload           12
        //   105: putstatic       com/whatsapp/App.aX:Lcom/whatsapp/App$Me;
        //   108: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   111: invokevirtual   com/whatsapp/vy.l:()Z
        //   114: istore          16
        //   116: iload           16
        //   118: ifne            145
        //   121: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   124: invokevirtual   com/whatsapp/vy.f:()Z
        //   127: ifeq            145
        //   130: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   133: bipush          76
        //   135: aaload         
        //   136: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   139: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   142: invokevirtual   com/whatsapp/vy.y:()V
        //   145: aload_0        
        //   146: invokevirtual   com/whatsapp/VerifySms.getApplication:()Landroid/app/Application;
        //   149: invokestatic    com/whatsapp/App.r:(Landroid/content/Context;)V
        //   152: invokestatic    com/whatsapp/App.a8:()V
        //   155: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   158: invokestatic    com/whatsapp/messaging/MessageService.b:(Landroid/content/Context;)V
        //   161: iload           16
        //   163: ifne            169
        //   166: invokestatic    com/whatsapp/App.aA:()V
        //   169: aload_0        
        //   170: iconst_3       
        //   171: invokestatic    com/whatsapp/App.b:(Landroid/content/Context;I)V
        //   174: aload_0        
        //   175: invokestatic    com/whatsapp/ChangeNumber.c:(Landroid/content/Context;)V
        //   178: aload_0        
        //   179: getfield        com/whatsapp/VerifySms.ag:Lcom/whatsapp/atq;
        //   182: iconst_1       
        //   183: invokevirtual   com/whatsapp/atq.removeMessages:(I)V
        //   186: aload_0        
        //   187: invokespecial   com/whatsapp/VerifySms.B:()V
        //   190: iload_1        
        //   191: ifeq            213
        //   194: aload_0        
        //   195: getfield        com/whatsapp/VerifySms.q:Z
        //   198: istore          11
        //   200: iload           11
        //   202: ifeq            213
        //   205: aload_0        
        //   206: invokevirtual   com/whatsapp/VerifySms.f:()V
        //   209: iload_3        
        //   210: ifeq            274
        //   213: aload_0        
        //   214: getfield        com/whatsapp/VerifySms.l:Z
        //   217: istore          7
        //   219: iload           7
        //   221: ifeq            254
        //   224: invokestatic    com/whatsapp/App.at:()V
        //   227: invokestatic    com/whatsapp/al5.u:()Z
        //   230: pop            
        //   231: new             Landroid/content/Intent;
        //   234: dup            
        //   235: aload_0        
        //   236: ldc_w           Lcom/whatsapp/Main;.class
        //   239: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   242: astore          10
        //   244: aload_0        
        //   245: aload           10
        //   247: invokevirtual   com/whatsapp/VerifySms.startActivity:(Landroid/content/Intent;)V
        //   250: iload_3        
        //   251: ifeq            274
        //   254: aload_0        
        //   255: iconst_2       
        //   256: invokestatic    com/whatsapp/App.b:(Landroid/content/Context;I)V
        //   259: aload_0        
        //   260: new             Landroid/content/Intent;
        //   263: dup            
        //   264: aload_0        
        //   265: ldc_w           Lcom/whatsapp/RegisterName;.class
        //   268: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   271: invokevirtual   com/whatsapp/VerifySms.startActivity:(Landroid/content/Intent;)V
        //   274: aload_0        
        //   275: invokevirtual   com/whatsapp/VerifySms.finish:()V
        //   278: return         
        //   279: astore          18
        //   281: aload           18
        //   283: athrow         
        //   284: astore          17
        //   286: aload           17
        //   288: athrow         
        //   289: astore          4
        //   291: aload           4
        //   293: athrow         
        //   294: astore          5
        //   296: aload           5
        //   298: athrow         
        //   299: astore          6
        //   301: aload           6
        //   303: athrow         
        //   304: astore          8
        //   306: aload           8
        //   308: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  48     66     88     93     Landroid/content/ActivityNotFoundException;
        //  71     87     98     103    Landroid/content/ActivityNotFoundException;
        //  121    145    279    284    Landroid/content/ActivityNotFoundException;
        //  145    161    284    289    Landroid/content/ActivityNotFoundException;
        //  166    169    284    289    Landroid/content/ActivityNotFoundException;
        //  178    190    289    294    Landroid/content/ActivityNotFoundException;
        //  194    200    294    299    Landroid/content/ActivityNotFoundException;
        //  205    209    299    304    Landroid/content/ActivityNotFoundException;
        //  213    219    299    304    Landroid/content/ActivityNotFoundException;
        //  244    250    304    309    Landroid/content/ActivityNotFoundException;
        //  254    274    304    309    Landroid/content/ActivityNotFoundException;
        //  291    294    294    299    Landroid/content/ActivityNotFoundException;
        //  296    299    299    304    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 147, Size: 147
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
    
    static boolean c(final VerifySms verifySms, final String s) {
        return verifySms.a(s);
    }
    
    static int d() {
        return --VerifySms.J;
    }
    
    static String d(final VerifySms verifySms, final String z) {
        return verifySms.z = z;
    }
    
    private void d(final long n) {
        Label_0069: {
            if (n != 0L) {
                break Label_0069;
            }
            long n2 = 0L;
            while (true) {
                long b = VerifySms.I - n2;
                if (VerifySms.T != null) {
                    b = VerifySms.B;
                    VerifySms.T.cancel();
                    VerifySms.T = null;
                }
                try {
                    VerifySms.T = new ahk(this, b, 1000L).start();
                    if (n == 0L) {
                        this.f(System.currentTimeMillis());
                    }
                    return;
                    n2 = System.currentTimeMillis() - n;
                    continue;
                }
                catch (ActivityNotFoundException ex) {
                    throw ex;
                }
                break;
            }
        }
    }
    
    static void d(final VerifySms verifySms) {
        verifySms.x();
    }
    
    static void d(final VerifySms verifySms, final long n) {
        verifySms.c(n);
    }
    
    static long e(final long b) {
        return VerifySms.B = b;
    }
    
    static long e(final VerifySms verifySms, final long v) {
        return verifySms.V = v;
    }
    
    static String e(final VerifySms verifySms) {
        return verifySms.G;
    }
    
    private void e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/VerifySms.y:Landroid/content/BroadcastReceiver;
        //     3: ifnull          17
        //     6: aload_0        
        //     7: getstatic       com/whatsapp/VerifySms.y:Landroid/content/BroadcastReceiver;
        //    10: invokevirtual   com/whatsapp/VerifySms.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
        //    13: aconst_null    
        //    14: putstatic       com/whatsapp/VerifySms.y:Landroid/content/BroadcastReceiver;
        //    17: aload_0        
        //    18: invokespecial   com/whatsapp/VerifySms.r:()V
        //    21: getstatic       com/whatsapp/VerifySms.Y:Landroid/content/BroadcastReceiver;
        //    24: ifnull          38
        //    27: aload_0        
        //    28: getstatic       com/whatsapp/VerifySms.Y:Landroid/content/BroadcastReceiver;
        //    31: invokevirtual   com/whatsapp/VerifySms.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
        //    34: aconst_null    
        //    35: putstatic       com/whatsapp/VerifySms.Y:Landroid/content/BroadcastReceiver;
        //    38: return         
        //    39: astore_1       
        //    40: aload_1        
        //    41: athrow         
        //    42: astore_2       
        //    43: aload_2        
        //    44: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      17     39     42     Landroid/content/ActivityNotFoundException;
        //  17     38     42     45     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0017:
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
    
    private void f(final long n) {
        final SharedPreferences$Editor edit = this.getPreferences(0).edit();
        try {
            edit.putLong(VerifySms.bb[70], System.currentTimeMillis());
            if (!edit.commit()) {
                Log.w(VerifySms.bb[71]);
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    static void f(final VerifySms verifySms) {
        verifySms.h();
    }
    
    static void g(final VerifySms verifySms) {
        verifySms.K();
    }
    
    static long h(final VerifySms verifySms) {
        return verifySms.C;
    }
    
    private void h() {
        this.s = 0;
    }
    
    private void h(final int n) {
        final SharedPreferences$Editor edit = this.getPreferences(0).edit();
        try {
            edit.putInt(VerifySms.bb[32], n);
            if (!edit.commit()) {
                Log.w(VerifySms.bb[31]);
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    private void h(final String s) {
        final SharedPreferences$Editor edit = this.getPreferences(0).edit();
        try {
            edit.putString(VerifySms.bb[50], s);
            edit.putString(VerifySms.bb[52], this.G);
            edit.putString(VerifySms.bb[49], this.u);
            if (!edit.commit()) {
                Log.w(VerifySms.bb[51]);
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    static int i() {
        return VerifySms.L;
    }
    
    static int i(final int ad) {
        return VerifySms.ad = ad;
    }
    
    static void i(final VerifySms verifySms) {
        verifySms.l();
    }
    
    private void i(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: getstatic       com/whatsapp/VerifySms.L:I
        //     7: tableswitch {
        //                2: 224
        //                3: 72
        //                4: 147
        //                5: 313
        //                6: 72
        //                7: 313
        //                8: 313
        //                9: 313
        //               10: 313
        //               11: 147
        //               12: 147
        //               13: 313
        //               14: 147
        //          default: 313
        //        }
        //    72: new             Ljava/lang/StringBuilder;
        //    75: dup            
        //    76: invokespecial   java/lang/StringBuilder.<init>:()V
        //    79: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //    82: iconst_4       
        //    83: aaload         
        //    84: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    87: getstatic       com/whatsapp/VerifySms.L:I
        //    90: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    93: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    96: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    99: aload_0        
        //   100: aload_1        
        //   101: invokespecial   com/whatsapp/VerifySms.b:(Ljava/lang/String;)V
        //   104: new             Lcom/whatsapp/b2;
        //   107: dup            
        //   108: aload_0        
        //   109: invokespecial   com/whatsapp/b2.<init>:(Lcom/whatsapp/VerifySms;)V
        //   112: astore          12
        //   114: iconst_2       
        //   115: anewarray       Ljava/lang/String;
        //   118: astore          13
        //   120: aload           13
        //   122: iconst_0       
        //   123: aload_1        
        //   124: aastore        
        //   125: aload           13
        //   127: iconst_1       
        //   128: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   131: bipush          6
        //   133: aaload         
        //   134: aastore        
        //   135: aload           12
        //   137: aload           13
        //   139: invokestatic    com/whatsapp/a8s.a:(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;
        //   142: pop            
        //   143: iload_2        
        //   144: ifeq            313
        //   147: aload_0        
        //   148: ldc_w           2131755790
        //   151: invokevirtual   com/whatsapp/VerifySms.findViewById:(I)Landroid/view/View;
        //   154: astore          8
        //   156: aload           8
        //   158: invokevirtual   android/view/View.getVisibility:()I
        //   161: istore          11
        //   163: iload           11
        //   165: ifeq            207
        //   168: new             Ljava/lang/StringBuilder;
        //   171: dup            
        //   172: invokespecial   java/lang/StringBuilder.<init>:()V
        //   175: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   178: iconst_3       
        //   179: aaload         
        //   180: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   183: getstatic       com/whatsapp/VerifySms.L:I
        //   186: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   189: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   192: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   195: aload_0        
        //   196: getfield        com/whatsapp/VerifySms.aj:Landroid/widget/EditText;
        //   199: aload_1        
        //   200: invokevirtual   android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
        //   203: iload_2        
        //   204: ifeq            313
        //   207: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   210: iconst_2       
        //   211: aaload         
        //   212: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   215: aload_0        
        //   216: aload_1        
        //   217: invokespecial   com/whatsapp/VerifySms.h:(Ljava/lang/String;)V
        //   220: iload_2        
        //   221: ifeq            313
        //   224: new             Ljava/lang/StringBuilder;
        //   227: dup            
        //   228: invokespecial   java/lang/StringBuilder.<init>:()V
        //   231: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   234: iconst_5       
        //   235: aaload         
        //   236: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   239: getstatic       com/whatsapp/VerifySms.L:I
        //   242: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   245: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   248: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   251: aload_0        
        //   252: aload_1        
        //   253: invokespecial   com/whatsapp/VerifySms.b:(Ljava/lang/String;)V
        //   256: new             Lcom/whatsapp/b2;
        //   259: dup            
        //   260: aload_0        
        //   261: invokespecial   com/whatsapp/b2.<init>:(Lcom/whatsapp/VerifySms;)V
        //   264: astore          5
        //   266: iconst_2       
        //   267: anewarray       Ljava/lang/String;
        //   270: astore          6
        //   272: aload           6
        //   274: iconst_0       
        //   275: aload_1        
        //   276: aastore        
        //   277: aload           6
        //   279: iconst_1       
        //   280: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   283: iconst_1       
        //   284: aaload         
        //   285: aastore        
        //   286: aload           5
        //   288: aload           6
        //   290: invokestatic    com/whatsapp/a8s.a:(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;
        //   293: pop            
        //   294: return         
        //   295: astore          4
        //   297: aload           4
        //   299: athrow         
        //   300: astore_3       
        //   301: aload_3        
        //   302: athrow         
        //   303: astore          9
        //   305: aload           9
        //   307: athrow         
        //   308: astore          10
        //   310: aload           10
        //   312: athrow         
        //   313: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  4      72     300    303    Landroid/content/ActivityNotFoundException;
        //  72     143    300    303    Landroid/content/ActivityNotFoundException;
        //  156    163    303    308    Landroid/content/ActivityNotFoundException;
        //  168    203    308    313    Landroid/content/ActivityNotFoundException;
        //  207    220    295    300    Landroid/content/ActivityNotFoundException;
        //  224    294    295    300    Landroid/content/ActivityNotFoundException;
        //  305    308    308    313    Landroid/content/ActivityNotFoundException;
        //  310    313    295    300    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 127, Size: 127
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
    
    static int j(final int l) {
        return VerifySms.L = l;
    }
    
    static EditText j(final VerifySms verifySms) {
        return verifySms.aj;
    }
    
    private void j() {
        ((TextView)this.findViewById(2131755774)).setText((CharSequence)VerifyNumber.b(this.G, this.u));
        this.Q.setVisibility(8);
        this.findViewById(2131755779).setVisibility(8);
        this.findViewById(2131755781).setVisibility(8);
        this.findViewById(2131755772).setVisibility(0);
    }
    
    private int k() {
        return this.getPreferences(0).getInt(VerifySms.bb[40], -1);
    }
    
    static void k(final VerifySms verifySms) {
        verifySms.q();
    }
    
    static atq l(final VerifySms verifySms) {
        return verifySms.ag;
    }
    
    private void l() {
        try {
            this.v();
            VerifySms.L = 13;
            this.q();
            this.p();
            if ("".equals(VerifySms.m)) {
                this.c(VerifySms.bb[41]);
            }
            this.x();
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    private void m() {
        Log.i(VerifySms.bb[63]);
        this.y();
        VerifySms.D = null;
        App.b((Context)App.aq, VerifyNumber.a(VerifySms.D));
        a8s.a(new wp(this), new String[0]);
    }
    
    static void m(final VerifySms verifySms) {
        verifySms.r();
    }
    
    static int n() {
        return VerifySms.ad;
    }
    
    static String n(final VerifySms verifySms) {
        return verifySms.J();
    }
    
    private void o() {
        if (this.E == null) {
            final IntentFilter intentFilter = new IntentFilter(VerifySms.bb[28]);
            intentFilter.setPriority(Integer.MAX_VALUE);
            this.registerReceiver(this.R, intentFilter);
            this.E = this.R;
        }
    }
    
    static void o(final VerifySms verifySms) {
        verifySms.A();
    }
    
    static long p(final VerifySms verifySms) {
        return verifySms.ab;
    }
    
    private void p() {
        this.f(0L);
    }
    
    static long q(final VerifySms verifySms) {
        return verifySms.K;
    }
    
    private void q() {
        final SharedPreferences$Editor edit = this.getPreferences(0).edit();
        try {
            edit.putInt(VerifySms.bb[27], VerifySms.L);
            if (!edit.commit()) {
                Log.w(VerifySms.bb[26]);
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    private void r() {
        try {
            if (this.E != null) {
                this.unregisterReceiver(this.E);
                this.E = null;
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    static void r(final VerifySms verifySms) {
        verifySms.B();
    }
    
    static int s(final VerifySms verifySms) {
        return verifySms.G();
    }
    
    private void s() {
        final SharedPreferences$Editor edit = this.getPreferences(0).edit();
        try {
            edit.remove(VerifySms.bb[99]);
            if (!edit.commit()) {
                Log.w(VerifySms.bb[98]);
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    private void t() {
        this.d(0L);
    }
    
    static void t(final VerifySms verifySms) {
        verifySms.v();
    }
    
    static Button u(final VerifySms verifySms) {
        return verifySms.Q;
    }
    
    private void u() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/VerifySms.X:Ljava/lang/String;
        //     4: astore_3       
        //     5: aload_3        
        //     6: ifnull          45
        //     9: aload_0        
        //    10: new             Ljava/lang/StringBuilder;
        //    13: dup            
        //    14: invokespecial   java/lang/StringBuilder.<init>:()V
        //    17: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //    20: bipush          9
        //    22: aaload         
        //    23: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    26: aload_0        
        //    27: getfield        com/whatsapp/VerifySms.X:Ljava/lang/String;
        //    30: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    33: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    36: invokespecial   com/whatsapp/VerifyNumber.g:(Ljava/lang/String;)V
        //    39: getstatic       com/whatsapp/App.I:Z
        //    42: ifeq            60
        //    45: aload_0        
        //    46: aload_0        
        //    47: getfield        com/whatsapp/VerifySms.z:Ljava/lang/String;
        //    50: invokespecial   com/whatsapp/VerifyNumber.g:(Ljava/lang/String;)V
        //    53: return         
        //    54: astore_1       
        //    55: aload_1        
        //    56: athrow         
        //    57: astore_2       
        //    58: aload_2        
        //    59: athrow         
        //    60: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      5      54     57     Landroid/content/ActivityNotFoundException;
        //  9      45     57     60     Landroid/content/ActivityNotFoundException;
        //  45     53     57     60     Landroid/content/ActivityNotFoundException;
        //  55     57     57     60     Landroid/content/ActivityNotFoundException;
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
    
    private void v() {
        try {
            if (VerifySms.T != null) {
                VerifySms.T.cancel();
                VerifySms.T = null;
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    static void v(final VerifySms verifySms) {
        verifySms.s();
    }
    
    private void w() {
        VerifySms.L = 0;
        this.q();
        this.z = VerifySms.bb[8];
        this.ag.removeMessages(1);
        Intent intent = null;
        Label_0089: {
            if (!this.l) {
                App.b((Context)this, 1);
                intent = new Intent((Context)this, (Class)RegisterPhone.class);
                intent.putExtra(VerifySms.bb[7], true);
                if (!App.I) {
                    break Label_0089;
                }
            }
            App.b((Context)this, 3);
            ChangeNumber.a(this);
            intent = new Intent((Context)this, (Class)ChangeNumber.class);
        }
        this.startActivity(intent);
        this.finish();
    }
    
    static void w(final VerifySms verifySms) {
        verifySms.a();
    }
    
    private void x() {
        final String b = VerifyNumber.b(this.G, this.u);
        final String string = this.getString(2131231893);
        final String string2 = this.getString(2131231892, new Object[] { this.getString(2131231890), VerifySms.ad });
        ((TextView)this.findViewById(2131755783)).setText((CharSequence)string);
        ((TextView)this.findViewById(2131755784)).setText((CharSequence)b);
        ((TextView)this.findViewById(2131755786)).setText((CharSequence)string2);
        this.Q.setVisibility(0);
        this.findViewById(2131755779).setVisibility(0);
        this.findViewById(2131755782).setVisibility(0);
        this.findViewById(2131755772).setVisibility(8);
        this.findViewById(2131755781).setVisibility(0);
        this.findViewById(2131755787).setVisibility(0);
        this.D();
    }
    
    static void x(final VerifySms verifySms) {
        verifySms.t();
    }
    
    static String y(final VerifySms verifySms) {
        return verifySms.u;
    }
    
    private void y() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/VerifySms.y:Landroid/content/BroadcastReceiver;
        //     3: ifnull          17
        //     6: aload_0        
        //     7: getstatic       com/whatsapp/VerifySms.y:Landroid/content/BroadcastReceiver;
        //    10: invokevirtual   com/whatsapp/VerifySms.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
        //    13: aconst_null    
        //    14: putstatic       com/whatsapp/VerifySms.y:Landroid/content/BroadcastReceiver;
        //    17: getstatic       com/whatsapp/VerifySms.Y:Landroid/content/BroadcastReceiver;
        //    20: ifnull          34
        //    23: aload_0        
        //    24: getstatic       com/whatsapp/VerifySms.Y:Landroid/content/BroadcastReceiver;
        //    27: invokevirtual   com/whatsapp/VerifySms.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
        //    30: aconst_null    
        //    31: putstatic       com/whatsapp/VerifySms.Y:Landroid/content/BroadcastReceiver;
        //    34: return         
        //    35: astore_1       
        //    36: aload_1        
        //    37: athrow         
        //    38: astore_2       
        //    39: aload_2        
        //    40: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      17     35     38     Landroid/content/ActivityNotFoundException;
        //  17     34     38     41     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0017:
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
    
    private void z() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //     8: bipush          69
        //    10: aaload         
        //    11: invokevirtual   com/whatsapp/VerifySms.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    14: checkcast       Landroid/view/inputmethod/InputMethodManager;
        //    17: astore_2       
        //    18: aload_2        
        //    19: iconst_0       
        //    20: iconst_0       
        //    21: invokevirtual   android/view/inputmethod/InputMethodManager.toggleSoftInput:(II)V
        //    24: new             Ljava/lang/StringBuilder;
        //    27: dup            
        //    28: invokespecial   java/lang/StringBuilder.<init>:()V
        //    31: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //    34: bipush          64
        //    36: aaload         
        //    37: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    40: astore          5
        //    42: invokestatic    com/whatsapp/al5.c:()Z
        //    45: istore          6
        //    47: iload           6
        //    49: ifne            58
        //    52: invokestatic    com/whatsapp/al5.l:()Z
        //    55: ifeq            201
        //    58: getstatic       com/whatsapp/VerifySms.ai:Ljava/lang/String;
        //    61: astore          7
        //    63: aload           5
        //    65: aload           7
        //    67: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    70: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //    73: bipush          65
        //    75: aaload         
        //    76: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    79: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    82: astore          8
        //    84: invokestatic    android/telephony/SmsManager.getDefault:()Landroid/telephony/SmsManager;
        //    87: astore          9
        //    89: aload_0        
        //    90: aload_0        
        //    91: getfield        com/whatsapp/VerifySms.G:Ljava/lang/String;
        //    94: aload_0        
        //    95: getfield        com/whatsapp/VerifySms.u:Ljava/lang/String;
        //    98: invokevirtual   com/whatsapp/VerifySms.a:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   101: putstatic       com/whatsapp/VerifySms.U:Ljava/lang/String;
        //   104: new             Ljava/lang/StringBuilder;
        //   107: dup            
        //   108: invokespecial   java/lang/StringBuilder.<init>:()V
        //   111: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   114: bipush          67
        //   116: aaload         
        //   117: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   120: getstatic       com/whatsapp/VerifySms.U:Ljava/lang/String;
        //   123: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   126: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   129: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   132: getstatic       com/whatsapp/VerifySms.L:I
        //   135: istore          18
        //   137: iload           18
        //   139: lookupswitch {
        //                0: 209
        //                5: 316
        //          default: 164
        //        }
        //   164: new             Ljava/lang/StringBuilder;
        //   167: dup            
        //   168: invokespecial   java/lang/StringBuilder.<init>:()V
        //   171: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   174: bipush          66
        //   176: aaload         
        //   177: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   180: getstatic       com/whatsapp/VerifySms.L:I
        //   183: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   186: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   189: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   192: return         
        //   193: astore_3       
        //   194: aload_3        
        //   195: athrow         
        //   196: astore          4
        //   198: aload           4
        //   200: athrow         
        //   201: getstatic       com/whatsapp/VerifySms.aa:Ljava/lang/String;
        //   204: astore          7
        //   206: goto            63
        //   209: aload_0        
        //   210: lconst_0       
        //   211: putfield        com/whatsapp/VerifySms.K:J
        //   214: aload_0        
        //   215: lconst_0       
        //   216: putfield        com/whatsapp/VerifySms.C:J
        //   219: aload_0        
        //   220: invokevirtual   com/whatsapp/VerifySms.e:()Z
        //   223: istore          19
        //   225: iload           19
        //   227: ifeq            262
        //   230: getstatic       com/whatsapp/VerifySms.D:Ljava/lang/String;
        //   233: astore          21
        //   235: aload           21
        //   237: ifnull          262
        //   240: aload_0        
        //   241: iconst_2       
        //   242: getstatic       com/whatsapp/VerifySms.x:I
        //   245: imul           
        //   246: i2l            
        //   247: putfield        com/whatsapp/VerifySms.V:J
        //   250: aload_0        
        //   251: aload           9
        //   253: aload           8
        //   255: invokespecial   com/whatsapp/VerifySms.a:(Landroid/telephony/SmsManager;Ljava/lang/String;)V
        //   258: iload_1        
        //   259: ifeq            192
        //   262: aload_0        
        //   263: invokevirtual   com/whatsapp/VerifySms.c:()Z
        //   266: istore          20
        //   268: iload           20
        //   270: ifeq            299
        //   273: aload_0        
        //   274: getfield        com/whatsapp/VerifySms.M:Landroid/widget/TextView;
        //   277: ldc_w           ""
        //   280: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   283: aload_0        
        //   284: getstatic       com/whatsapp/VerifySms.x:I
        //   287: i2l            
        //   288: putfield        com/whatsapp/VerifySms.V:J
        //   291: aload_0        
        //   292: invokespecial   com/whatsapp/VerifySms.m:()V
        //   295: iload_1        
        //   296: ifeq            192
        //   299: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   302: bipush          68
        //   304: aaload         
        //   305: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   308: aload_0        
        //   309: invokespecial   com/whatsapp/VerifySms.w:()V
        //   312: iload_1        
        //   313: ifeq            192
        //   316: aload_0        
        //   317: getfield        com/whatsapp/VerifySms.M:Landroid/widget/TextView;
        //   320: ldc_w           ""
        //   323: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   326: aload_0        
        //   327: getstatic       com/whatsapp/VerifySms.x:I
        //   330: i2l            
        //   331: putfield        com/whatsapp/VerifySms.V:J
        //   334: aload_0        
        //   335: invokespecial   com/whatsapp/VerifySms.m:()V
        //   338: iload_1        
        //   339: ifeq            192
        //   342: goto            164
        //   345: astore          10
        //   347: aload           10
        //   349: athrow         
        //   350: astore          11
        //   352: aload           11
        //   354: athrow         
        //   355: astore          12
        //   357: aload           12
        //   359: athrow         
        //   360: astore          13
        //   362: aload           13
        //   364: athrow         
        //   365: astore          14
        //   367: aload           14
        //   369: athrow         
        //   370: astore          15
        //   372: aload           15
        //   374: athrow         
        //   375: astore          16
        //   377: aload           16
        //   379: athrow         
        //   380: astore          17
        //   382: aload           17
        //   384: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  18     47     193    196    Landroid/content/ActivityNotFoundException;
        //  52     58     196    201    Landroid/content/ActivityNotFoundException;
        //  58     63     196    201    Landroid/content/ActivityNotFoundException;
        //  89     137    345    350    Landroid/content/ActivityNotFoundException;
        //  164    192    380    385    Landroid/content/ActivityNotFoundException;
        //  194    196    196    201    Landroid/content/ActivityNotFoundException;
        //  209    225    350    355    Landroid/content/ActivityNotFoundException;
        //  230    235    355    360    Landroid/content/ActivityNotFoundException;
        //  240    258    360    365    Landroid/content/ActivityNotFoundException;
        //  262    268    365    370    Landroid/content/ActivityNotFoundException;
        //  273    295    370    375    Landroid/content/ActivityNotFoundException;
        //  299    312    375    380    Landroid/content/ActivityNotFoundException;
        //  316    338    380    385    Landroid/content/ActivityNotFoundException;
        //  347    350    350    355    Landroid/content/ActivityNotFoundException;
        //  352    355    355    360    Landroid/content/ActivityNotFoundException;
        //  357    360    360    365    Landroid/content/ActivityNotFoundException;
        //  362    365    365    370    Landroid/content/ActivityNotFoundException;
        //  367    370    370    375    Landroid/content/ActivityNotFoundException;
        //  372    375    375    380    Landroid/content/ActivityNotFoundException;
        //  377    380    380    385    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 172, Size: 172
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
    
    static void z(final VerifySms verifySms) {
        verifySms.w();
    }
    
    @Override
    protected void a(final ServiceState serviceState) {
        while (true) {
            while (true) {
                try {
                    final View viewById = this.findViewById(2131755773);
                    if (this.k) {
                        final int visibility = 0;
                        viewById.setVisibility(visibility);
                        return;
                    }
                }
                catch (ActivityNotFoundException ex) {
                    throw ex;
                }
                final int visibility = 8;
                continue;
            }
        }
    }
    
    @Override
    public void onBackPressed() {
    }
    
    public void onCreate(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_2       
        //     2: getstatic       com/whatsapp/App.I:Z
        //     5: istore_3       
        //     6: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //     9: bipush          88
        //    11: aaload         
        //    12: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    15: aload_0        
        //    16: aload_1        
        //    17: invokespecial   com/whatsapp/VerifyNumber.onCreate:(Landroid/os/Bundle;)V
        //    20: invokestatic    de/greenrobot/event/m.b:()Lde/greenrobot/event/m;
        //    23: aload_0        
        //    24: invokevirtual   de/greenrobot/event/m.d:(Ljava/lang/Object;)V
        //    27: aload_0        
        //    28: ldc_w           2130903229
        //    31: invokevirtual   com/whatsapp/VerifySms.setContentView:(I)V
        //    34: aload_0        
        //    35: invokevirtual   com/whatsapp/VerifySms.getIntent:()Landroid/content/Intent;
        //    38: astore          4
        //    40: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //    43: bipush          86
        //    45: aaload         
        //    46: aload           4
        //    48: invokevirtual   android/content/Intent.getScheme:()Ljava/lang/String;
        //    51: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    54: ifeq            145
        //    57: aload_0        
        //    58: invokestatic    com/whatsapp/App.c:(Landroid/content/Context;)I
        //    61: iconst_1       
        //    62: if_icmpne       102
        //    65: new             Landroid/content/Intent;
        //    68: dup            
        //    69: aload_0        
        //    70: ldc_w           Lcom/whatsapp/RegisterPhone;.class
        //    73: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //    76: astore          29
        //    78: aload           29
        //    80: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //    83: bipush          85
        //    85: aaload         
        //    86: iconst_1       
        //    87: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //    90: pop            
        //    91: aload_0        
        //    92: aload           29
        //    94: invokevirtual   com/whatsapp/VerifySms.startActivity:(Landroid/content/Intent;)V
        //    97: aload_0        
        //    98: invokevirtual   com/whatsapp/VerifySms.finish:()V
        //   101: return         
        //   102: aload_0        
        //   103: aload_0        
        //   104: aload           4
        //   106: invokespecial   com/whatsapp/VerifySms.a:(Landroid/content/Intent;)Ljava/lang/String;
        //   109: putfield        com/whatsapp/VerifySms.ah:Ljava/lang/String;
        //   112: new             Ljava/lang/StringBuilder;
        //   115: dup            
        //   116: invokespecial   java/lang/StringBuilder.<init>:()V
        //   119: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   122: bipush          90
        //   124: aaload         
        //   125: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   128: aload_0        
        //   129: getfield        com/whatsapp/VerifySms.ah:Ljava/lang/String;
        //   132: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   135: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   138: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   141: iload_3        
        //   142: ifeq            150
        //   145: aload_0        
        //   146: aconst_null    
        //   147: putfield        com/whatsapp/VerifySms.ah:Ljava/lang/String;
        //   150: aload_0        
        //   151: invokestatic    com/whatsapp/App.c:(Landroid/content/Context;)I
        //   154: istore          6
        //   156: iload           6
        //   158: iconst_4       
        //   159: if_icmpeq       214
        //   162: new             Ljava/lang/StringBuilder;
        //   165: dup            
        //   166: invokespecial   java/lang/StringBuilder.<init>:()V
        //   169: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   172: bipush          89
        //   174: aaload         
        //   175: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   178: iload           6
        //   180: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   183: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   186: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   189: aload_0        
        //   190: new             Landroid/content/Intent;
        //   193: dup            
        //   194: aload_0        
        //   195: ldc_w           Lcom/whatsapp/Main;.class
        //   198: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   201: invokevirtual   com/whatsapp/VerifySms.startActivity:(Landroid/content/Intent;)V
        //   204: aload_0        
        //   205: invokevirtual   com/whatsapp/VerifySms.finish:()V
        //   208: return         
        //   209: astore          5
        //   211: aload           5
        //   213: athrow         
        //   214: aload_0        
        //   215: aconst_null    
        //   216: putfield        com/whatsapp/VerifySms.X:Ljava/lang/String;
        //   219: aload_0        
        //   220: invokespecial   com/whatsapp/VerifySms.E:()V
        //   223: aload_0        
        //   224: invokevirtual   com/whatsapp/VerifySms.getIntent:()Landroid/content/Intent;
        //   227: invokevirtual   android/content/Intent.getExtras:()Landroid/os/Bundle;
        //   230: astore          10
        //   232: aload           10
        //   234: ifnull          358
        //   237: aload_0        
        //   238: invokevirtual   com/whatsapp/VerifySms.getIntent:()Landroid/content/Intent;
        //   241: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   244: bipush          83
        //   246: aaload         
        //   247: aload_0        
        //   248: getfield        com/whatsapp/VerifySms.k:Z
        //   251: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   254: istore          26
        //   256: iload           26
        //   258: ifne            268
        //   261: aload_0        
        //   262: getfield        com/whatsapp/VerifySms.k:Z
        //   265: ifeq            288
        //   268: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   271: bipush          93
        //   273: aaload         
        //   274: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   277: aload_0        
        //   278: ldc_w           2131755773
        //   281: invokevirtual   com/whatsapp/VerifySms.findViewById:(I)Landroid/view/View;
        //   284: iconst_0       
        //   285: invokevirtual   android/view/View.setVisibility:(I)V
        //   288: aload_0        
        //   289: invokevirtual   com/whatsapp/VerifySms.getIntent:()Landroid/content/Intent;
        //   292: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   295: bipush          94
        //   297: aaload         
        //   298: iconst_0       
        //   299: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   302: ifeq            310
        //   305: aload_0        
        //   306: iconst_1       
        //   307: putfield        com/whatsapp/VerifySms.l:Z
        //   310: aload_0        
        //   311: invokevirtual   com/whatsapp/VerifySms.getIntent:()Landroid/content/Intent;
        //   314: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   317: bipush          92
        //   319: aaload         
        //   320: iconst_0       
        //   321: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   324: ifeq            358
        //   327: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   330: bipush          87
        //   332: aaload         
        //   333: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   336: iconst_5       
        //   337: putstatic       com/whatsapp/VerifySms.L:I
        //   340: aload_0        
        //   341: invokespecial   com/whatsapp/VerifySms.q:()V
        //   344: aload_0        
        //   345: new             Landroid/content/Intent;
        //   348: dup            
        //   349: aload_0        
        //   350: ldc             Lcom/whatsapp/VerifySms;.class
        //   352: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   355: invokevirtual   com/whatsapp/VerifySms.setIntent:(Landroid/content/Intent;)V
        //   358: aload_0        
        //   359: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   362: bipush          97
        //   364: aaload         
        //   365: iconst_0       
        //   366: invokevirtual   com/whatsapp/VerifySms.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //   369: astore          11
        //   371: aload_0        
        //   372: aload           11
        //   374: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   377: bipush          82
        //   379: aaload         
        //   380: aconst_null    
        //   381: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   386: putfield        com/whatsapp/VerifySms.G:Ljava/lang/String;
        //   389: aload_0        
        //   390: aload           11
        //   392: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   395: bipush          84
        //   397: aaload         
        //   398: aconst_null    
        //   399: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   404: putfield        com/whatsapp/VerifySms.u:Ljava/lang/String;
        //   407: aload_0        
        //   408: getfield        com/whatsapp/VerifySms.G:Ljava/lang/String;
        //   411: astore          14
        //   413: aload           14
        //   415: ifnull          425
        //   418: aload_0        
        //   419: getfield        com/whatsapp/VerifySms.u:Ljava/lang/String;
        //   422: ifnonnull       474
        //   425: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   428: bipush          96
        //   430: aaload         
        //   431: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   434: aload_0        
        //   435: invokespecial   com/whatsapp/VerifySms.w:()V
        //   438: return         
        //   439: astore          13
        //   441: aload           13
        //   443: athrow         
        //   444: astore          7
        //   446: aload           7
        //   448: athrow         
        //   449: astore          8
        //   451: aload           8
        //   453: athrow         
        //   454: astore          9
        //   456: aload           9
        //   458: athrow         
        //   459: astore          27
        //   461: aload           27
        //   463: athrow         
        //   464: astore          28
        //   466: aload           28
        //   468: athrow         
        //   469: astore          12
        //   471: aload           12
        //   473: athrow         
        //   474: aload_0        
        //   475: invokevirtual   com/whatsapp/VerifySms.e:()Z
        //   478: ifeq            599
        //   481: getstatic       com/whatsapp/VerifySms.aa:Ljava/lang/String;
        //   484: invokevirtual   java/lang/String.length:()I
        //   487: istore          22
        //   489: iload           22
        //   491: ifne            599
        //   494: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   497: bipush          95
        //   499: aaload         
        //   500: astore          23
        //   502: aload           23
        //   504: invokevirtual   java/lang/String.length:()I
        //   507: istore          24
        //   509: new             Ljava/util/Random;
        //   512: dup            
        //   513: invokespecial   java/util/Random.<init>:()V
        //   516: astore          25
        //   518: iload_2        
        //   519: bipush          32
        //   521: if_icmpge       599
        //   524: new             Ljava/lang/StringBuilder;
        //   527: dup            
        //   528: invokespecial   java/lang/StringBuilder.<init>:()V
        //   531: getstatic       com/whatsapp/VerifySms.aa:Ljava/lang/String;
        //   534: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   537: aload           23
        //   539: aload           25
        //   541: iload           24
        //   543: invokevirtual   java/util/Random.nextInt:(I)I
        //   546: invokevirtual   java/lang/String.charAt:(I)C
        //   549: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   552: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   555: putstatic       com/whatsapp/VerifySms.aa:Ljava/lang/String;
        //   558: new             Ljava/lang/StringBuilder;
        //   561: dup            
        //   562: invokespecial   java/lang/StringBuilder.<init>:()V
        //   565: getstatic       com/whatsapp/VerifySms.ai:Ljava/lang/String;
        //   568: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   571: aload           23
        //   573: aload           25
        //   575: iload           24
        //   577: invokevirtual   java/util/Random.nextInt:(I)I
        //   580: invokevirtual   java/lang/String.charAt:(I)C
        //   583: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   586: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   589: putstatic       com/whatsapp/VerifySms.ai:Ljava/lang/String;
        //   592: iinc            2, 1
        //   595: iload_3        
        //   596: ifeq            518
        //   599: getstatic       com/whatsapp/App.h:Landroid/telephony/TelephonyManager;
        //   602: aload_0        
        //   603: getfield        com/whatsapp/VerifySms.r:Landroid/telephony/PhoneStateListener;
        //   606: sipush          1535
        //   609: invokevirtual   android/telephony/TelephonyManager.listen:(Landroid/telephony/PhoneStateListener;I)V
        //   612: aload_0        
        //   613: aload_0        
        //   614: ldc_w           2131755163
        //   617: invokevirtual   com/whatsapp/VerifySms.findViewById:(I)Landroid/view/View;
        //   620: checkcast       Landroid/widget/ProgressBar;
        //   623: putfield        com/whatsapp/VerifySms.Z:Landroid/widget/ProgressBar;
        //   626: aload_0        
        //   627: aload_0        
        //   628: ldc_w           2131755776
        //   631: invokevirtual   com/whatsapp/VerifySms.findViewById:(I)Landroid/view/View;
        //   634: checkcast       Landroid/widget/TextView;
        //   637: putfield        com/whatsapp/VerifySms.M:Landroid/widget/TextView;
        //   640: aload_0        
        //   641: aload_0        
        //   642: ldc_w           2131755777
        //   645: invokevirtual   com/whatsapp/VerifySms.findViewById:(I)Landroid/view/View;
        //   648: checkcast       Landroid/widget/TextView;
        //   651: putfield        com/whatsapp/VerifySms.H:Landroid/widget/TextView;
        //   654: aload_0        
        //   655: aload_0        
        //   656: ldc_w           2131755789
        //   659: invokevirtual   com/whatsapp/VerifySms.findViewById:(I)Landroid/view/View;
        //   662: checkcast       Landroid/widget/EditText;
        //   665: putfield        com/whatsapp/VerifySms.aj:Landroid/widget/EditText;
        //   668: aload_0        
        //   669: getfield        com/whatsapp/VerifySms.aj:Landroid/widget/EditText;
        //   672: new             Lcom/whatsapp/yh;
        //   675: dup            
        //   676: aload_0        
        //   677: invokespecial   com/whatsapp/yh.<init>:(Lcom/whatsapp/VerifySms;)V
        //   680: invokevirtual   android/widget/EditText.addTextChangedListener:(Landroid/text/TextWatcher;)V
        //   683: aload_0        
        //   684: getfield        com/whatsapp/VerifySms.aj:Landroid/widget/EditText;
        //   687: ldc_w           ""
        //   690: invokevirtual   android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
        //   693: aload_0        
        //   694: aload_0        
        //   695: ldc_w           2131755378
        //   698: invokevirtual   com/whatsapp/VerifySms.findViewById:(I)Landroid/view/View;
        //   701: checkcast       Landroid/widget/Button;
        //   704: putfield        com/whatsapp/VerifySms.Q:Landroid/widget/Button;
        //   707: aload_0        
        //   708: getfield        com/whatsapp/VerifySms.Q:Landroid/widget/Button;
        //   711: new             Lcom/whatsapp/a99;
        //   714: dup            
        //   715: aload_0        
        //   716: invokespecial   com/whatsapp/a99.<init>:(Lcom/whatsapp/VerifySms;)V
        //   719: invokevirtual   android/widget/Button.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   722: aload_0        
        //   723: aload_0        
        //   724: ldc_w           2131755775
        //   727: invokevirtual   com/whatsapp/VerifySms.findViewById:(I)Landroid/view/View;
        //   730: putfield        com/whatsapp/VerifySms.F:Landroid/view/View;
        //   733: aload_0        
        //   734: aload_0        
        //   735: ldc_w           2131755785
        //   738: invokevirtual   com/whatsapp/VerifySms.findViewById:(I)Landroid/view/View;
        //   741: putfield        com/whatsapp/VerifySms.S:Landroid/view/View;
        //   744: new             Lcom/whatsapp/qe;
        //   747: dup            
        //   748: aload_0        
        //   749: invokespecial   com/whatsapp/qe.<init>:(Lcom/whatsapp/VerifySms;)V
        //   752: astore          16
        //   754: aload_0        
        //   755: getfield        com/whatsapp/VerifySms.F:Landroid/view/View;
        //   758: aload           16
        //   760: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   763: aload_0        
        //   764: getfield        com/whatsapp/VerifySms.S:Landroid/view/View;
        //   767: aload           16
        //   769: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   772: aload_0        
        //   773: ldc_w           2131755792
        //   776: invokevirtual   com/whatsapp/VerifySms.findViewById:(I)Landroid/view/View;
        //   779: checkcast       Landroid/widget/ImageView;
        //   782: new             Lcom/whatsapp/util/m;
        //   785: dup            
        //   786: aload_0        
        //   787: invokevirtual   com/whatsapp/VerifySms.getResources:()Landroid/content/res/Resources;
        //   790: ldc_w           2130839039
        //   793: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   796: invokespecial   com/whatsapp/util/m.<init>:(Landroid/graphics/drawable/Drawable;)V
        //   799: invokevirtual   android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   802: aload_0        
        //   803: invokespecial   com/whatsapp/VerifySms.j:()V
        //   806: aload_0        
        //   807: invokespecial   com/whatsapp/VerifySms.L:()V
        //   810: aload_0        
        //   811: invokespecial   com/whatsapp/VerifySms.I:()V
        //   814: aload_0        
        //   815: invokespecial   com/whatsapp/VerifySms.J:()Ljava/lang/String;
        //   818: astore          17
        //   820: aload           17
        //   822: ifnull          101
        //   825: new             Ljava/lang/StringBuilder;
        //   828: dup            
        //   829: invokespecial   java/lang/StringBuilder.<init>:()V
        //   832: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   835: bipush          91
        //   837: aaload         
        //   838: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   841: aload           17
        //   843: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   846: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   849: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   852: new             Lcom/whatsapp/b2;
        //   855: dup            
        //   856: aload_0        
        //   857: invokespecial   com/whatsapp/b2.<init>:(Lcom/whatsapp/VerifySms;)V
        //   860: astore          19
        //   862: iconst_2       
        //   863: anewarray       Ljava/lang/String;
        //   866: astore          20
        //   868: aload           20
        //   870: iconst_0       
        //   871: aload           17
        //   873: aastore        
        //   874: aload           20
        //   876: iconst_1       
        //   877: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   880: bipush          81
        //   882: aaload         
        //   883: aastore        
        //   884: aload           19
        //   886: aload           20
        //   888: invokestatic    com/whatsapp/a8s.a:(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;
        //   891: pop            
        //   892: return         
        //   893: astore          18
        //   895: aload           18
        //   897: athrow         
        //   898: astore          15
        //   900: aload           15
        //   902: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  102    141    209    214    Landroid/content/ActivityNotFoundException;
        //  145    150    209    214    Landroid/content/ActivityNotFoundException;
        //  214    232    444    449    Landroid/content/ActivityNotFoundException;
        //  237    256    449    454    Landroid/content/ActivityNotFoundException;
        //  261    268    454    459    Landroid/content/ActivityNotFoundException;
        //  268    288    454    459    Landroid/content/ActivityNotFoundException;
        //  288    310    459    464    Landroid/content/ActivityNotFoundException;
        //  310    358    464    469    Landroid/content/ActivityNotFoundException;
        //  371    413    469    474    Landroid/content/ActivityNotFoundException;
        //  418    425    439    444    Landroid/content/ActivityNotFoundException;
        //  425    438    439    444    Landroid/content/ActivityNotFoundException;
        //  446    449    449    454    Landroid/content/ActivityNotFoundException;
        //  451    454    454    459    Landroid/content/ActivityNotFoundException;
        //  471    474    439    444    Landroid/content/ActivityNotFoundException;
        //  474    489    898    903    Landroid/content/ActivityNotFoundException;
        //  825    892    893    898    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 419, Size: 419
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
    
    @Override
    protected Dialog onCreateDialog(final int n) {
        Dialog dialog = null;
        switch (n) {
            default: {
                dialog = super.onCreateDialog(n);
                break;
            }
            case 7: {
                try {
                    return new AlertDialog$Builder((Context)this).setTitle(2131230802).setMessage(2131231563).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new n1(this)).create();
                }
                catch (ActivityNotFoundException ex) {
                    throw ex;
                }
            }
            case 21: {
                return new AlertDialog$Builder((Context)this).setMessage(this.getString(2131231532, new Object[] { this.getString(2131230921) })).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new adb(this)).create();
            }
            case 34: {
                return new AlertDialog$Builder((Context)this).setMessage(2131231576).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new s3(this)).create();
            }
            case 23: {
                VerifySms.L = 0;
                this.q();
                App.b((Context)this, 1);
                return yt.f(this);
            }
            case 4: {
                return new AlertDialog$Builder((Context)this).setTitle(2131230802).setMessage(2131232093).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new m5(this)).create();
            }
            case 9: {
                final ProgressDialog t = new ProgressDialog((Context)this);
                t.setMessage((CharSequence)this.getString(2131231535));
                t.setIndeterminate(true);
                t.setCancelable(false);
                return (Dialog)(this.t = t);
            }
            case 24: {
                final ProgressDialog t2 = new ProgressDialog((Context)this);
                t2.setMessage((CharSequence)this.getString(2131231590));
                t2.setIndeterminate(true);
                t2.setCancelable(false);
                return (Dialog)(this.t = t2);
            }
            case 25: {
                final ProgressDialog t3 = new ProgressDialog((Context)this);
                t3.setMessage((CharSequence)this.getString(2131231589));
                t3.setIndeterminate(true);
                t3.setCancelable(false);
                return (Dialog)(this.t = t3);
            }
            case 26:
            case 27:
            case 28: {
                return new AlertDialog$Builder((Context)this).setMessage(2131231572).setPositiveButton(2131231536, (DialogInterface$OnClickListener)new arj(this, n)).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new uw(this, n)).create();
            }
            case 29:
            case 30: {
                return new AlertDialog$Builder((Context)this).setMessage(this.getString(2131231554)).setPositiveButton(2131231536, (DialogInterface$OnClickListener)new xt(this, n)).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new atn(this, n)).create();
            }
            case 35: {
                return new AlertDialog$Builder((Context)this).setMessage(this.getString(2131231588, new Object[] { b6.n((Context)this, this.ab) })).setPositiveButton(2131231542, (DialogInterface$OnClickListener)new bu(this, n)).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new da(this, n)).create();
            }
            case 31: {
                return new AlertDialog$Builder((Context)this).setMessage(this.getString(2131231578)).setPositiveButton(2131231536, (DialogInterface$OnClickListener)new bp(this, n)).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new ev(this, n)).create();
            }
            case 36: {
                return new AlertDialog$Builder((Context)this).setMessage(this.getString(2131231579, new Object[] { b6.n((Context)this, this.ab) })).setPositiveButton(2131231542, (DialogInterface$OnClickListener)new a8b(this, n)).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new b4(this, n)).create();
            }
            case 32: {
                final EditText view = new EditText((Context)this);
                final InputFilter[] filters = { new InputFilter$LengthFilter(VerifySms.ad) };
                view.setInputType(2);
                view.setFilters(filters);
                view.setGravity(17);
                return new AlertDialog$Builder((Context)this).setTitle(2131231583).setMessage(this.getString(2131231582, new Object[] { VerifySms.ad })).setView((View)view).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new rg(this, view)).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new cr(this)).create();
            }
            case 33: {
                return new AlertDialog$Builder((Context)this).setMessage(this.getString(2131231577, new Object[] { VerifySms.ad })).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new ki(this)).create();
            }
            case 500: {
                dialog = super.onCreateDialog(n);
                if (dialog == null) {
                    break;
                }
                try {
                    if (this.A) {
                        dialog.setCancelable(false);
                        dialog.setOnDismissListener((DialogInterface$OnDismissListener)new a8g(this));
                        return dialog;
                    }
                    break;
                }
                catch (ActivityNotFoundException ex2) {
                    throw ex2;
                }
                break;
            }
        }
        return dialog;
    }
    
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        menu.add(0, 0, 0, 2131231536).setIcon(2130838789);
        if (App.aV == 3) {
            menu.add(0, 2, 0, (CharSequence)VerifySms.bb[0]);
        }
        return super.onCreateOptionsMenu(menu);
    }
    
    @Override
    protected void onDestroy() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //     3: bipush          42
        //     5: aaload         
        //     6: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //     9: getstatic       com/whatsapp/App.h:Landroid/telephony/TelephonyManager;
        //    12: aload_0        
        //    13: getfield        com/whatsapp/VerifySms.r:Landroid/telephony/PhoneStateListener;
        //    16: iconst_0       
        //    17: invokevirtual   android/telephony/TelephonyManager.listen:(Landroid/telephony/PhoneStateListener;I)V
        //    20: aload_0        
        //    21: iconst_1       
        //    22: putfield        com/whatsapp/VerifySms.P:Z
        //    25: aload_0        
        //    26: invokespecial   com/whatsapp/VerifySms.e:()V
        //    29: getstatic       com/whatsapp/VerifySms.T:Landroid/os/CountDownTimer;
        //    32: ifnull          45
        //    35: getstatic       com/whatsapp/VerifySms.T:Landroid/os/CountDownTimer;
        //    38: invokevirtual   android/os/CountDownTimer.cancel:()V
        //    41: aconst_null    
        //    42: putstatic       com/whatsapp/VerifySms.T:Landroid/os/CountDownTimer;
        //    45: aload_0        
        //    46: getfield        com/whatsapp/VerifySms.W:Landroid/os/CountDownTimer;
        //    49: ifnull          64
        //    52: aload_0        
        //    53: getfield        com/whatsapp/VerifySms.W:Landroid/os/CountDownTimer;
        //    56: invokevirtual   android/os/CountDownTimer.cancel:()V
        //    59: aload_0        
        //    60: aconst_null    
        //    61: putfield        com/whatsapp/VerifySms.W:Landroid/os/CountDownTimer;
        //    64: aload_0        
        //    65: getfield        com/whatsapp/VerifySms.O:Landroid/os/CountDownTimer;
        //    68: ifnull          83
        //    71: aload_0        
        //    72: getfield        com/whatsapp/VerifySms.O:Landroid/os/CountDownTimer;
        //    75: invokevirtual   android/os/CountDownTimer.cancel:()V
        //    78: aload_0        
        //    79: aconst_null    
        //    80: putfield        com/whatsapp/VerifySms.O:Landroid/os/CountDownTimer;
        //    83: invokestatic    de/greenrobot/event/m.b:()Lde/greenrobot/event/m;
        //    86: aload_0        
        //    87: invokevirtual   de/greenrobot/event/m.e:(Ljava/lang/Object;)V
        //    90: aload_0        
        //    91: invokespecial   com/whatsapp/VerifyNumber.onDestroy:()V
        //    94: return         
        //    95: astore_1       
        //    96: aload_1        
        //    97: athrow         
        //    98: astore_2       
        //    99: aload_2        
        //   100: athrow         
        //   101: astore_3       
        //   102: aload_3        
        //   103: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      45     95     98     Landroid/content/ActivityNotFoundException;
        //  45     64     98     101    Landroid/content/ActivityNotFoundException;
        //  64     83     101    104    Landroid/content/ActivityNotFoundException;
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
    
    public void onEvent(final vp vp) {
        this.I();
    }
    
    @Override
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        try {
            if (App.aS == 3 && n == 84) {
                final VerifySms verifySms = this;
                final boolean b = false;
                b_.a(verifySms, b);
                return true;
            }
            return super.onKeyDown(n, keyEvent);
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
        try {
            final VerifySms verifySms = this;
            final boolean b = false;
            b_.a(verifySms, b);
            return true;
        }
        catch (ActivityNotFoundException ex2) {
            throw ex2;
        }
        return super.onKeyDown(n, keyEvent);
    }
    
    @Override
    protected void onNewIntent(final Intent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //     7: bipush          24
        //     9: aaload         
        //    10: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    13: aload_0        
        //    14: aload_1        
        //    15: invokespecial   com/whatsapp/VerifyNumber.onNewIntent:(Landroid/content/Intent;)V
        //    18: aload_0        
        //    19: aload_1        
        //    20: invokespecial   com/whatsapp/VerifySms.a:(Landroid/content/Intent;)Ljava/lang/String;
        //    23: astore_3       
        //    24: aload_3        
        //    25: ifnull          90
        //    28: aload_0        
        //    29: getfield        com/whatsapp/VerifySms.w:Z
        //    32: istore          11
        //    34: iload           11
        //    36: ifeq            48
        //    39: aload_0        
        //    40: aload_3        
        //    41: invokespecial   com/whatsapp/VerifySms.i:(Ljava/lang/String;)V
        //    44: iload_2        
        //    45: ifeq            238
        //    48: new             Ljava/lang/StringBuilder;
        //    51: dup            
        //    52: invokespecial   java/lang/StringBuilder.<init>:()V
        //    55: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //    58: bipush          25
        //    60: aaload         
        //    61: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    64: aload_3        
        //    65: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    68: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    71: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    74: aload_0        
        //    75: aload_3        
        //    76: putfield        com/whatsapp/VerifySms.ah:Ljava/lang/String;
        //    79: return         
        //    80: astore          9
        //    82: aload           9
        //    84: athrow         
        //    85: astore          10
        //    87: aload           10
        //    89: athrow         
        //    90: aload_1        
        //    91: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //    94: bipush          22
        //    96: aaload         
        //    97: iconst_0       
        //    98: invokevirtual   android/content/Intent.getIntExtra:(Ljava/lang/String;I)I
        //   101: istore          4
        //   103: iload           4
        //   105: lookupswitch {
        //                4: 191
        //                7: 181
        //               21: 200
        //               23: 210
        //          default: 148
        //        }
        //   148: new             Ljava/lang/StringBuilder;
        //   151: dup            
        //   152: invokespecial   java/lang/StringBuilder.<init>:()V
        //   155: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   158: bipush          23
        //   160: aaload         
        //   161: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   164: iload           4
        //   166: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   169: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   172: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   175: return         
        //   176: astore          5
        //   178: aload           5
        //   180: athrow         
        //   181: aload_0        
        //   182: bipush          7
        //   184: invokevirtual   com/whatsapp/VerifySms.showDialog:(I)V
        //   187: iload_2        
        //   188: ifeq            238
        //   191: aload_0        
        //   192: iconst_4       
        //   193: invokevirtual   com/whatsapp/VerifySms.showDialog:(I)V
        //   196: iload_2        
        //   197: ifeq            238
        //   200: aload_0        
        //   201: bipush          21
        //   203: invokevirtual   com/whatsapp/VerifySms.showDialog:(I)V
        //   206: iload_2        
        //   207: ifeq            238
        //   210: aload_0        
        //   211: bipush          23
        //   213: invokevirtual   com/whatsapp/VerifySms.showDialog:(I)V
        //   216: iload_2        
        //   217: ifeq            238
        //   220: goto            148
        //   223: astore          8
        //   225: aload           8
        //   227: athrow         
        //   228: astore          7
        //   230: aload           7
        //   232: athrow         
        //   233: astore          6
        //   235: aload           6
        //   237: athrow         
        //   238: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  28     34     80     85     Landroid/content/ActivityNotFoundException;
        //  39     44     85     90     Landroid/content/ActivityNotFoundException;
        //  48     79     85     90     Landroid/content/ActivityNotFoundException;
        //  82     85     85     90     Landroid/content/ActivityNotFoundException;
        //  148    175    176    181    Landroid/content/ActivityNotFoundException;
        //  181    187    223    228    Landroid/content/ActivityNotFoundException;
        //  191    196    228    233    Landroid/content/ActivityNotFoundException;
        //  200    206    233    238    Landroid/content/ActivityNotFoundException;
        //  210    216    176    181    Landroid/content/ActivityNotFoundException;
        //  225    228    228    233    Landroid/content/ActivityNotFoundException;
        //  230    233    233    238    Landroid/content/ActivityNotFoundException;
        //  235    238    176    181    Landroid/content/ActivityNotFoundException;
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
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        Label_0059: {
            try {
                switch (menuItem.getItemId()) {
                    default: {
                        return super.onOptionsItemSelected(menuItem);
                    }
                    case 0: {
                        this.u();
                        return true;
                    }
                    case 1: {
                        break;
                    }
                    case 2: {
                        break Label_0059;
                    }
                }
            }
            catch (ActivityNotFoundException ex) {
                throw ex;
            }
            this.showDialog(32);
            return true;
        }
        App.k((Context)this);
        this.finish();
        return true;
    }
    
    @Override
    public void onPause() {
        super.onPause();
        Log.i(VerifySms.bb[73] + VerifySms.L);
        final SharedPreferences$Editor edit = this.getPreferences(0).edit();
        try {
            edit.putInt(VerifySms.bb[72], VerifySms.L);
            if (!edit.commit()) {
                Log.w(VerifySms.bb[74]);
            }
            App.b((Context)App.aq, VerifyNumber.a(VerifySms.D));
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    public boolean onPrepareOptionsMenu(final Menu menu) {
        try {
            if (VerifySms.ac && menu.findItem(1) == null) {
                menu.add(0, 1, 0, 2131231894).setIcon(2130838876);
            }
            return true;
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    @Override
    public void onResume() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: invokespecial   com/whatsapp/VerifyNumber.onResume:()V
        //     8: aload_0        
        //     9: iconst_0       
        //    10: invokevirtual   com/whatsapp/VerifySms.getPreferences:(I)Landroid/content/SharedPreferences;
        //    13: astore_2       
        //    14: aload_2        
        //    15: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //    18: bipush          12
        //    20: aaload         
        //    21: iconst_0       
        //    22: invokeinterface android/content/SharedPreferences.getInt:(Ljava/lang/String;I)I
        //    27: putstatic       com/whatsapp/VerifySms.L:I
        //    30: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    33: invokestatic    com/whatsapp/App.y:(Landroid/content/Context;)Ljava/lang/String;
        //    36: invokestatic    com/whatsapp/VerifySms.b:(Ljava/lang/String;)Ljava/lang/String;
        //    39: putstatic       com/whatsapp/VerifySms.D:Ljava/lang/String;
        //    42: aload_0        
        //    43: invokestatic    com/whatsapp/App.v:(Landroid/content/Context;)I
        //    46: putstatic       com/whatsapp/VerifySms.N:I
        //    49: aload_0        
        //    50: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;)I
        //    53: putstatic       com/whatsapp/VerifySms.ad:I
        //    56: aload_0        
        //    57: getfield        com/whatsapp/VerifySms.G:Ljava/lang/String;
        //    60: astore          5
        //    62: aload           5
        //    64: ifnull          74
        //    67: aload_0        
        //    68: getfield        com/whatsapp/VerifySms.u:Ljava/lang/String;
        //    71: ifnonnull       96
        //    74: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //    77: bipush          13
        //    79: aaload         
        //    80: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    83: aload_0        
        //    84: invokespecial   com/whatsapp/VerifySms.w:()V
        //    87: return         
        //    88: astore_3       
        //    89: aload_3        
        //    90: athrow         
        //    91: astore          4
        //    93: aload           4
        //    95: athrow         
        //    96: aload_0        
        //    97: iconst_4       
        //    98: invokestatic    com/whatsapp/App.b:(Landroid/content/Context;I)V
        //   101: aload_0        
        //   102: invokevirtual   com/whatsapp/VerifySms.c:()Z
        //   105: istore          8
        //   107: iload           8
        //   109: ifne            135
        //   112: getstatic       com/whatsapp/VerifySms.L:I
        //   115: ifne            135
        //   118: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   121: bipush          10
        //   123: aaload         
        //   124: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   127: iconst_3       
        //   128: putstatic       com/whatsapp/VerifySms.L:I
        //   131: aload_0        
        //   132: invokespecial   com/whatsapp/VerifySms.q:()V
        //   135: new             Ljava/lang/StringBuilder;
        //   138: dup            
        //   139: invokespecial   java/lang/StringBuilder.<init>:()V
        //   142: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   145: bipush          17
        //   147: aaload         
        //   148: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   151: getstatic       com/whatsapp/VerifySms.L:I
        //   154: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   157: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   160: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   163: getstatic       com/whatsapp/VerifySms.L:I
        //   166: istore          11
        //   168: iload           11
        //   170: tableswitch {
        //                0: 336
        //                1: 322
        //                2: 356
        //                3: 348
        //                4: 508
        //                5: 336
        //                6: 499
        //                7: 489
        //                8: 518
        //                9: 240
        //               10: 348
        //               11: 348
        //               12: 528
        //               13: 348
        //          default: 240
        //        }
        //   240: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   243: bipush          15
        //   245: aaload         
        //   246: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   249: aload_0        
        //   250: invokestatic    android/support/v4/app/NotificationManagerCompat.from:(Landroid/content/Context;)Landroid/support/v4/app/NotificationManagerCompat;
        //   253: iconst_1       
        //   254: invokevirtual   android/support/v4/app/NotificationManagerCompat.cancel:(I)V
        //   257: aload_0        
        //   258: getfield        com/whatsapp/VerifySms.ah:Ljava/lang/String;
        //   261: ifnull          306
        //   264: new             Ljava/lang/StringBuilder;
        //   267: dup            
        //   268: invokespecial   java/lang/StringBuilder.<init>:()V
        //   271: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   274: bipush          11
        //   276: aaload         
        //   277: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   280: aload_0        
        //   281: getfield        com/whatsapp/VerifySms.ah:Ljava/lang/String;
        //   284: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   287: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   290: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   293: aload_0        
        //   294: aload_0        
        //   295: getfield        com/whatsapp/VerifySms.ah:Ljava/lang/String;
        //   298: invokespecial   com/whatsapp/VerifySms.i:(Ljava/lang/String;)V
        //   301: aload_0        
        //   302: aconst_null    
        //   303: putfield        com/whatsapp/VerifySms.ah:Ljava/lang/String;
        //   306: aload_0        
        //   307: iconst_1       
        //   308: putfield        com/whatsapp/VerifySms.w:Z
        //   311: return         
        //   312: astore          6
        //   314: aload           6
        //   316: athrow         
        //   317: astore          7
        //   319: aload           7
        //   321: athrow         
        //   322: getstatic       com/whatsapp/VerifySms.T:Landroid/os/CountDownTimer;
        //   325: ifnonnull       249
        //   328: iconst_5       
        //   329: putstatic       com/whatsapp/VerifySms.L:I
        //   332: aload_0        
        //   333: invokespecial   com/whatsapp/VerifySms.q:()V
        //   336: aload_0        
        //   337: invokespecial   com/whatsapp/VerifySms.j:()V
        //   340: aload_0        
        //   341: invokespecial   com/whatsapp/VerifySms.z:()V
        //   344: iload_1        
        //   345: ifeq            249
        //   348: aload_0        
        //   349: invokespecial   com/whatsapp/VerifySms.x:()V
        //   352: iload_1        
        //   353: ifeq            249
        //   356: getstatic       com/whatsapp/VerifySms.T:Landroid/os/CountDownTimer;
        //   359: astore          19
        //   361: aload           19
        //   363: ifnonnull       249
        //   366: aload_0        
        //   367: invokespecial   com/whatsapp/VerifySms.F:()J
        //   370: lstore          20
        //   372: invokestatic    java/lang/System.currentTimeMillis:()J
        //   375: lstore          22
        //   377: aload_0        
        //   378: invokespecial   com/whatsapp/VerifySms.k:()I
        //   381: istore          24
        //   383: iload           24
        //   385: ifle            409
        //   388: getstatic       com/whatsapp/VerifySms.x:I
        //   391: i2l            
        //   392: ldc2_w          1000
        //   395: iload           24
        //   397: i2l            
        //   398: lmul           
        //   399: invokestatic    java/lang/Math.min:(JJ)J
        //   402: putstatic       com/whatsapp/VerifySms.I:J
        //   405: iload_1        
        //   406: ifeq            416
        //   409: getstatic       com/whatsapp/VerifySms.x:I
        //   412: i2l            
        //   413: putstatic       com/whatsapp/VerifySms.I:J
        //   416: aload_0        
        //   417: getstatic       com/whatsapp/VerifySms.I:J
        //   420: putfield        com/whatsapp/VerifySms.V:J
        //   423: getstatic       com/whatsapp/VerifySms.I:J
        //   426: lstore          28
        //   428: lload           28
        //   430: lload           22
        //   432: lload           20
        //   434: lsub           
        //   435: lsub           
        //   436: ldc2_w          3000
        //   439: lcmp           
        //   440: iflt            472
        //   443: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   446: bipush          16
        //   448: aaload         
        //   449: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   452: aload_0        
        //   453: getfield        com/whatsapp/VerifySms.M:Landroid/widget/TextView;
        //   456: ldc_w           ""
        //   459: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   462: aload_0        
        //   463: lload           20
        //   465: invokespecial   com/whatsapp/VerifySms.d:(J)V
        //   468: iload_1        
        //   469: ifeq            485
        //   472: getstatic       com/whatsapp/VerifySms.bb:[Ljava/lang/String;
        //   475: bipush          14
        //   477: aaload         
        //   478: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   481: aload_0        
        //   482: invokespecial   com/whatsapp/VerifySms.l:()V
        //   485: iload_1        
        //   486: ifeq            249
        //   489: aload_0        
        //   490: bipush          7
        //   492: invokevirtual   com/whatsapp/VerifySms.showDialog:(I)V
        //   495: iload_1        
        //   496: ifeq            249
        //   499: aload_0        
        //   500: iconst_4       
        //   501: invokevirtual   com/whatsapp/VerifySms.showDialog:(I)V
        //   504: iload_1        
        //   505: ifeq            249
        //   508: aload_0        
        //   509: bipush          21
        //   511: invokevirtual   com/whatsapp/VerifySms.showDialog:(I)V
        //   514: iload_1        
        //   515: ifeq            249
        //   518: aload_0        
        //   519: bipush          23
        //   521: invokevirtual   com/whatsapp/VerifySms.showDialog:(I)V
        //   524: iload_1        
        //   525: ifeq            249
        //   528: aload_0        
        //   529: invokespecial   com/whatsapp/VerifySms.a:()V
        //   532: iload_1        
        //   533: ifeq            249
        //   536: goto            240
        //   539: astore          9
        //   541: aload           9
        //   543: athrow         
        //   544: astore          10
        //   546: aload           10
        //   548: athrow         
        //   549: astore          30
        //   551: aload           30
        //   553: athrow         
        //   554: astore          18
        //   556: aload           18
        //   558: athrow         
        //   559: astore          25
        //   561: aload           25
        //   563: athrow         
        //   564: astore          26
        //   566: aload           26
        //   568: athrow         
        //   569: astore          27
        //   571: aload           27
        //   573: athrow         
        //   574: astore          17
        //   576: aload           17
        //   578: athrow         
        //   579: astore          16
        //   581: aload           16
        //   583: athrow         
        //   584: astore          15
        //   586: aload           15
        //   588: athrow         
        //   589: astore          14
        //   591: aload           14
        //   593: athrow         
        //   594: astore          12
        //   596: aload           12
        //   598: athrow         
        //   599: astore          13
        //   601: aload           13
        //   603: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  14     62     88     91     Landroid/content/ActivityNotFoundException;
        //  67     74     91     96     Landroid/content/ActivityNotFoundException;
        //  74     87     91     96     Landroid/content/ActivityNotFoundException;
        //  89     91     91     96     Landroid/content/ActivityNotFoundException;
        //  96     107    312    317    Landroid/content/ActivityNotFoundException;
        //  112    135    317    322    Landroid/content/ActivityNotFoundException;
        //  135    168    539    544    Landroid/content/ActivityNotFoundException;
        //  240    249    594    599    Landroid/content/ActivityNotFoundException;
        //  249    306    599    604    Landroid/content/ActivityNotFoundException;
        //  314    317    317    322    Landroid/content/ActivityNotFoundException;
        //  322    336    544    549    Landroid/content/ActivityNotFoundException;
        //  336    344    549    554    Landroid/content/ActivityNotFoundException;
        //  348    352    554    559    Landroid/content/ActivityNotFoundException;
        //  356    361    554    559    Landroid/content/ActivityNotFoundException;
        //  388    405    559    564    Landroid/content/ActivityNotFoundException;
        //  409    416    559    564    Landroid/content/ActivityNotFoundException;
        //  416    428    564    569    Landroid/content/ActivityNotFoundException;
        //  443    468    569    574    Landroid/content/ActivityNotFoundException;
        //  472    485    569    574    Landroid/content/ActivityNotFoundException;
        //  489    495    574    579    Landroid/content/ActivityNotFoundException;
        //  499    504    579    584    Landroid/content/ActivityNotFoundException;
        //  508    514    584    589    Landroid/content/ActivityNotFoundException;
        //  518    524    589    594    Landroid/content/ActivityNotFoundException;
        //  528    532    594    599    Landroid/content/ActivityNotFoundException;
        //  541    544    544    549    Landroid/content/ActivityNotFoundException;
        //  551    554    554    559    Landroid/content/ActivityNotFoundException;
        //  566    569    569    574    Landroid/content/ActivityNotFoundException;
        //  576    579    579    584    Landroid/content/ActivityNotFoundException;
        //  581    584    584    589    Landroid/content/ActivityNotFoundException;
        //  586    589    589    594    Landroid/content/ActivityNotFoundException;
        //  591    594    594    599    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 260, Size: 260
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
