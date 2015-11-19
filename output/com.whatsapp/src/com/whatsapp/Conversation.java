// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Build$VERSION;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AlertDialog;
import android.view.KeyEvent;
import android.os.Bundle;
import android.content.res.Configuration;
import android.view.MotionEvent;
import com.whatsapp.fieldstats.bq;
import android.text.format.DateUtils;
import java.util.Iterator;
import java.util.Collection;
import com.whatsapp.camera.CameraActivity;
import android.os.Environment;
import android.content.SharedPreferences$Editor;
import android.app.Dialog;
import android.content.DialogInterface$OnClickListener;
import android.support.v7.app.AlertDialog$Builder;
import android.view.animation.Animation;
import android.view.SubMenu;
import java.io.Serializable;
import com.whatsapp.gallerypicker.ImagePreview;
import android.net.Uri;
import android.graphics.drawable.Drawable;
import com.whatsapp.util.Log;
import com.whatsapp.util.bm;
import com.whatsapp.protocol.bi;
import android.view.Menu;
import android.content.Intent;
import android.content.Context;
import android.app.Activity;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import android.content.ActivityNotFoundException;
import com.whatsapp.wallpaper.WallPaperView;
import android.widget.TextView$OnEditorActionListener;
import android.view.ViewGroup;
import android.app.WallpaperManager;
import java.util.HashSet;
import android.database.DataSetObserver;
import android.support.v7.view.ActionMode;
import android.view.inputmethod.InputMethodManager;
import android.os.Handler;
import android.widget.ListView;
import android.database.Cursor;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.whatsapp.protocol.c6;
import android.widget.AbsListView$OnScrollListener;
import android.support.v7.view.ActionMode$Callback;
import android.view.MenuItem;
import android.text.TextWatcher;
import android.widget.ImageButton;
import android.widget.TextView;
import android.view.View;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import android.view.Display;

public class Conversation extends DialogToastListActivity implements aws, aa0
{
    public static boolean M;
    public static boolean a3;
    public static boolean aB;
    public static Display aR;
    private static boolean aW;
    static boolean a_;
    private static AtomicReference ac;
    static ArrayList ao;
    private static final String[] cb;
    public static HashMap v;
    private View A;
    private boolean B;
    private TextView C;
    public boolean D;
    private ImageButton E;
    private a6z F;
    private int G;
    private final TextWatcher H;
    public String I;
    private String J;
    private MenuItem K;
    boolean L;
    String N;
    private ActionMode$Callback O;
    final AbsListView$OnScrollListener P;
    private Runnable Q;
    protected c6 R;
    private boolean S;
    private ImageView T;
    private ArrayList U;
    final View$OnClickListener V;
    private TextView W;
    private ConversationTextEntry X;
    private boolean Y;
    private l1 Z;
    private MenuItem a0;
    private boolean a1;
    private ImageButton a2;
    private boolean a4;
    private vc a5;
    private ImageButton a6;
    private boolean a7;
    private String a8;
    private ActionMode$Callback a9;
    private Cursor aA;
    private boolean aC;
    private TextView aD;
    private View aE;
    private View aF;
    private boolean aG;
    private boolean aH;
    public ListView aI;
    private boolean aJ;
    private Handler aK;
    final InputMethodManager aL;
    private ActionMode aM;
    private View aN;
    private View aO;
    private View aP;
    private boolean aQ;
    private final DataSetObserver aS;
    private a_e aT;
    private String aU;
    eu aV;
    private ConversationContentLayout aX;
    private ArrayList aY;
    private Handler aZ;
    private View aa;
    private ImageButton ab;
    private HashSet ad;
    private gw ae;
    private WallpaperManager af;
    private HashMap ag;
    private TextView ah;
    private final s0 ai;
    private boolean aj;
    private String ak;
    private ps al;
    private boolean am;
    boolean an;
    private ArrayList ap;
    boolean aq;
    private View ar;
    private int as;
    private boolean at;
    private ViewGroup au;
    private int av;
    public HashMap aw;
    private Handler ax;
    boolean ay;
    private boolean az;
    private int ba;
    private aoq bb;
    private ArrayList bc;
    private String bd;
    private TextView be;
    private Handler bf;
    private boolean bg;
    private int bh;
    private final sj bi;
    private boolean bj;
    private ahz bk;
    private Runnable bl;
    private int q;
    final TextView$OnEditorActionListener r;
    public a_9 s;
    private String t;
    public nm u;
    private int w;
    private boolean x;
    private WallPaperView y;
    private ActionMode z;
    
    static {
        final String[] cb2 = new String[261];
        String s = "v9=(:g%2*6z8|?<a?%7+l$6-pf>2,:80273p2|~";
        int n = -1;
        String[] array = cb2;
        int n2 = 0;
        String intern = null;
    Label_7021:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '_';
                        break;
                    }
                    case 0: {
                        c2 = '\u0015';
                        break;
                    }
                    case 1: {
                        c2 = 'V';
                        break;
                    }
                    case 2: {
                        c2 = 'S';
                        break;
                    }
                    case 3: {
                        c2 = '^';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "v9=(:g%2*6z8|?<a?%7+l$6-pf>2,:80273p2|~";
                    n2 = 1;
                    array = cb2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = cb2;
                    s = "v9=(:g%2*6z8|?<a?%7+l$6-pf>2,:80273p2|~";
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    s = "v9=(:g%2*6z8|?<a?%7+l$6-pf>2,:80273p2|~";
                    n = 2;
                    array = cb2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "[9s-/t56";
                    n = 3;
                    array = cb2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "/v";
                    n = 4;
                    array = cb2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "v::.=z7!:";
                    n = 5;
                    array = cb2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "Hv";
                    n = 6;
                    array = cb2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "v9=(:g%2*6z8|=0e/>;,f74;p{&6";
                    n = 7;
                    array = cb2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "v9=(:g%2*6z8|=0e/ ;3p5';;p% ?8p%|00a>:08f3?;<a37";
                    n = 8;
                    array = cb2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "v9=(:g%2*6z8|80g!2,;:0273:5223";
                    n = 9;
                    array = cb2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "s9!)>g2";
                    n = 10;
                    array = cb2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "v9=(:g%2*6z8|80g!2,;f3?;<a37;,f74;,:8<*7|84-:y30*:q";
                    n = 11;
                    array = cb2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "v9=(:g%2*6z8|80g!2,;:0273:#=86{%;;;8##20t2";
                    n = 12;
                    array = cb2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "c52,;J823:";
                    n = 13;
                    array = cb2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "f=:.\u0000e$6(6p!";
                    n = 14;
                    array = cb2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "v9=(:g%2*6z8|=-p7';<z8%;-f7'70{";
                    n = 15;
                    array = cb2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "v9=(:g%2*6z8|11v$6?+p5<0):9<3rp$!1-5";
                    n = 16;
                    array = cb2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "v9>p>x7)11;26(6v3}60x3};'a$2p\u0017P\u0004\u001c\u0001\b\\\u0012\u0014\u001b\u000bJ\u0012\u0012\n\u001e";
                    n = 17;
                    array = cb2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "}7 \u0001,}7!;";
                    n = 18;
                    array = cb2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "c52,;J823:";
                    n = 19;
                    array = cb2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    s = "[9s-/t56";
                    n = 20;
                    n2 = 21;
                    array = cb2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    array = cb2;
                    s = "x7+\u00016a3>-";
                    n = 21;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "}7 \u0001,}7!;";
                    n = 22;
                    array = cb2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "f=:.\u0000e$6(6p!";
                    n = 23;
                    array = cb2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "t87,0|2}71a3=*qp.',>;\u0005\u0007\f\u001aT\u001b";
                    n = 24;
                    array = cb2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "f; *0";
                    n = 25;
                    array = cb2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "v7#*6z8";
                    n = 26;
                    array = cb2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "t87,0|2}71a3=*qp.',>;\u0005\u0007\f\u001aT\u001b";
                    n = 27;
                    array = cb2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "v9=(:g%2*6z8|-+t$'q(t\t''/pl";
                    n = 28;
                    array = cb2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "v9=86g;";
                    n = 29;
                    array = cb2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "v9=(:g%2*6z8|-+t$'~1zv97;";
                    n = 30;
                    array = cb2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "v9=(:g%2*6z8|-+t$'~1zv:=0{\"2=+50<,\u007f";
                    n = 31;
                    array = cb2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "v9=(:g%2*6z8|-+t$'q-p%6*p\u007f?7~";
                    n = 32;
                    array = cb2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "v9=(:g%2*6z8|11v$6?+p5<0):?<;-g9!~";
                    n = 33;
                    array = cb2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "5#!7e";
                    n = 34;
                    array = cb2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "f; s5|2|,>b{=+2w3!";
                    n = 35;
                    array = cb2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "v9=(:g%2*6z8|-2fy=1\u007f\u007f?7";
                    n = 36;
                    array = cb2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "f>2,:J; 9";
                    n = 37;
                    array = cb2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "\u007f?7";
                    n = 38;
                    array = cb2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "c52,;J%',";
                    n = 39;
                    array = cb2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "g307/|3=*";
                    n = 40;
                    array = cb2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "U%})7t\" ?/ex=;+";
                    n = 41;
                    array = cb2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "b7\f*&e3";
                    n = 42;
                    array = cb2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "c52,;J%',";
                    n = 43;
                    array = cb2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "f; ";
                    n = 44;
                    array = cb2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "v9=(:g%2*6z8|-2f{97;/";
                    n = 45;
                    array = cb2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "v9=(:g%2*6z8|11e$6.>g3<.+|9=-2p8&~";
                    n = 46;
                    array = cb2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "t87,0|2}71a3=*qt5'70{x\u001a\u0010\fP\u0004\u0007";
                    n = 47;
                    array = cb2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "v9=(:g%2*6z8|1/av ',a3>~<z8'?<av?7,av01*y2s00av51*{2";
                    n = 48;
                    array = cb2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "p;273";
                    n = 49;
                    array = cb2;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "g9$\u00016q";
                    n = 50;
                    array = cb2;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "v>208pv#?8pv 7%pl";
                    n = 51;
                    array = cb2;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "v9>p(}7'->e&}71a3=*qt5'70{x\u0003\u0012\u001eL";
                    n = 52;
                    array = cb2;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "g9$\u00016q";
                    n = 53;
                    array = cb2;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    s = "|8';-s70;\u0000s9=*\u0000f?);";
                    n = 54;
                    array = cb2;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    s = "v9=(:g%2*6z8|-+t$'";
                    n = 55;
                    array = cb2;
                    continue;
                }
                case 55: {
                    array[n2] = intern;
                    n2 = 57;
                    s = "v9>p(}7'->e&\f.-p06,:{56-";
                    n = 56;
                    array = cb2;
                    continue;
                }
                case 56: {
                    array[n2] = intern;
                    n2 = 58;
                    s = "d#6,&";
                    n = 57;
                    array = cb2;
                    continue;
                }
                case 57: {
                    array[n2] = intern;
                    n2 = 59;
                    s = "~3*";
                    n = 58;
                    array = cb2;
                    continue;
                }
                case 58: {
                    array[n2] = intern;
                    n2 = 60;
                    s = "g307/|3=*";
                    n = 59;
                    array = cb2;
                    continue;
                }
                case 59: {
                    array[n2] = intern;
                    n2 = 61;
                    s = "v9=(:g%2*6z8|-:a##.-p :;(:%;?-p{5?6y37";
                    n = 60;
                    array = cb2;
                    continue;
                }
                case 60: {
                    array[n2] = intern;
                    n2 = 62;
                    s = "x7+\u00016a3>-";
                    n = 61;
                    array = cb2;
                    continue;
                }
                case 61: {
                    array[n2] = intern;
                    n2 = 63;
                    s = "t87,0|2}71a3=*qp.',>;\u0005\u0007\f\u001aT\u001b";
                    n = 62;
                    array = cb2;
                    continue;
                }
                case 62: {
                    array[n2] = intern;
                    n2 = 64;
                    s = "v9=(:g%2*6z8|-:y30*6z8!;.`3 *:q";
                    n = 63;
                    array = cb2;
                    continue;
                }
                case 63: {
                    array[n2] = intern;
                    n2 = 65;
                    s = "v9=(:g%2*6z8|;2z<:.0e##6:|1;*\u007f";
                    n = 64;
                    array = cb2;
                    continue;
                }
                case 64: {
                    array[n2] = intern;
                    n2 = 66;
                    s = "v9=(:g%2*6z8|;2z<:.0e##6:|1;*\u007f";
                    n = 65;
                    array = cb2;
                    continue;
                }
                case 65: {
                    array[n2] = intern;
                    n2 = 67;
                    s = "v9=(:g%2*6z8|:6f&2*<}{'1*v>~;)p8'~";
                    n = 66;
                    array = cb2;
                    continue;
                }
                case 66: {
                    array[n2] = intern;
                    n2 = 68;
                    s = "v9=(:g%2*6z8|:6f&2*<}{'1*v>~;)p8'~";
                    n = 67;
                    array = cb2;
                    continue;
                }
                case 67: {
                    array[n2] = intern;
                    n2 = 69;
                    s = "f3?;<a37\u00012p% ?8p%";
                    n = 68;
                    array = cb2;
                    continue;
                }
                case 68: {
                    array[n2] = intern;
                    n2 = 70;
                    s = "55&,,z$\u00101*{\"i";
                    n = 69;
                    array = cb2;
                    continue;
                }
                case 69: {
                    array[n2] = intern;
                    n2 = 71;
                    s = "5;\u001c,6r?=?3@8 ;:{\u0015<+1al";
                    n = 70;
                    array = cb2;
                    continue;
                }
                case 70: {
                    array[n2] = intern;
                    n2 = 72;
                    s = "5%;79a\u0015<+1al";
                    n = 71;
                    array = cb2;
                    continue;
                }
                case 71: {
                    array[n2] = intern;
                    n2 = 73;
                    s = "v9=(:g%2*6z8|?;\u007f# **{%6;1v9&0+:#=;'e30*:qys+1f360\u001cz#=*e";
                    n = 72;
                    array = cb2;
                    continue;
                }
                case 72: {
                    array[n2] = intern;
                    n2 = 74;
                    s = "e><0:";
                    n = 73;
                    array = cb2;
                    continue;
                }
                case 73: {
                    array[n2] = intern;
                    n2 = 75;
                    s = "t87,0|2}71a3=*qt5'70{x\u001a\u0010\fP\u0004\u0007";
                    n = 74;
                    array = cb2;
                    continue;
                }
                case 74: {
                    array[n2] = intern;
                    n2 = 76;
                    s = "v9=(:g%2*6z8|1/av ',a3>~<z8'?<av?7,av01*y2s00av51*{2";
                    n = 75;
                    array = cb2;
                    continue;
                }
                case 75: {
                    array[n2] = intern;
                    n2 = 77;
                    s = "|8#++J;6*7z2";
                    n = 76;
                    array = cb2;
                    continue;
                }
                case 76: {
                    array[n2] = intern;
                    n2 = 78;
                    s = "v9>p(}7'->e&\f.-p06,:{56-";
                    n = 77;
                    array = cb2;
                    continue;
                }
                case 77: {
                    array[n2] = intern;
                    n2 = 79;
                    s = "b7!0:q\t2<0`\"\f=>y:\f=7t$4;,";
                    n = 78;
                    array = cb2;
                    continue;
                }
                case 78: {
                    array[n2] = intern;
                    n2 = 80;
                    s = "\u007f?7";
                    n = 79;
                    array = cb2;
                    continue;
                }
                case 79: {
                    array[n2] = intern;
                    n2 = 81;
                    s = "x9&0+p2";
                    n = 80;
                    array = cb2;
                    continue;
                }
                case 80: {
                    array[n2] = intern;
                    n2 = 82;
                    s = "a3?d";
                    n = 81;
                    array = cb2;
                    continue;
                }
                case 81: {
                    array[n2] = intern;
                    s = "t87,0|2}71a3=*qt5'70{x\u0017\u0017\u001eY";
                    n = 82;
                    n2 = 83;
                    array = cb2;
                    continue;
                }
                case 82: {
                    array[n2] = intern;
                    n2 = 84;
                    array = cb2;
                    s = "e74;\u007ff?);e";
                    n = 83;
                    continue;
                }
                case 83: {
                    array[n2] = intern;
                    n2 = 85;
                    s = "f7>-*{1";
                    n = 84;
                    array = cb2;
                    continue;
                }
                case 84: {
                    array[n2] = intern;
                    s = "{9~-/t56";
                    n = 85;
                    n2 = 86;
                    array = cb2;
                    continue;
                }
                case 85: {
                    array[n2] = intern;
                    n2 = 87;
                    array = cb2;
                    s = "v9=(:g%2*6z8|?<a?%7+l$6-ps7:2py92:r|;29:";
                    n = 86;
                    continue;
                }
                case 86: {
                    array[n2] = intern;
                    n2 = 88;
                    s = "|%\f.-p :;(";
                    n = 87;
                    array = cb2;
                    continue;
                }
                case 87: {
                    array[n2] = intern;
                    n2 = 89;
                    s = "z#'.*a\u000e";
                    n = 88;
                    array = cb2;
                    continue;
                }
                case 88: {
                    array[n2] = intern;
                    n2 = 90;
                    s = "f522:@&\u001a8\u0011p37;;";
                    n = 89;
                    array = cb2;
                    continue;
                }
                case 89: {
                    array[n2] = intern;
                    n2 = 91;
                    s = "z#'.*a\u0010<,2t\"";
                    n = 90;
                    array = cb2;
                    continue;
                }
                case 90: {
                    array[n2] = intern;
                    n2 = 92;
                    s = "a?>;\u0000a9";
                    n = 91;
                    array = cb2;
                    continue;
                }
                case 91: {
                    array[n2] = intern;
                    n2 = 93;
                    s = "v7#*6z8";
                    n = 92;
                    array = cb2;
                    continue;
                }
                case 92: {
                    array[n2] = intern;
                    n2 = 94;
                    s = "c?7;0";
                    n = 93;
                    array = cb2;
                    continue;
                }
                case 93: {
                    array[n2] = intern;
                    n2 = 95;
                    s = "a?>;\u0000a9";
                    n = 94;
                    array = cb2;
                    continue;
                }
                case 94: {
                    array[n2] = intern;
                    n2 = 96;
                    s = "J?7";
                    n = 95;
                    array = cb2;
                    continue;
                }
                case 95: {
                    array[n2] = intern;
                    n2 = 97;
                    s = "U%})7t\" ?/ex=;+";
                    n = 96;
                    array = cb2;
                    continue;
                }
                case 96: {
                    array[n2] = intern;
                    n2 = 98;
                    s = "v7#*6z8";
                    n = 97;
                    array = cb2;
                    continue;
                }
                case 97: {
                    array[n2] = intern;
                    n2 = 99;
                    s = "p2:*\u0000v9=*>v\"\f71s9";
                    n = 98;
                    array = cb2;
                    continue;
                }
                case 98: {
                    array[n2] = intern;
                    n2 = 100;
                    s = "U%})7t\" ?/ex=;+";
                    n = 99;
                    array = cb2;
                    continue;
                }
                case 99: {
                    array[n2] = intern;
                    n2 = 101;
                    s = "|%\f,:f3'";
                    n = 100;
                    array = cb2;
                    continue;
                }
                case 100: {
                    array[n2] = intern;
                    n2 = 102;
                    s = "5*s";
                    n = 101;
                    array = cb2;
                    continue;
                }
                case 101: {
                    array[n2] = intern;
                    n2 = 103;
                    s = "v9=(:g%2*6z8|(6q3<q,}7!;p{90?/a#!;9|:6~";
                    n = 102;
                    array = cb2;
                    continue;
                }
                case 102: {
                    array[n2] = intern;
                    n2 = 104;
                    s = "v9=(:g%2*6z8|)>y:#?/p$|::s7&2+";
                    n = 103;
                    array = cb2;
                    continue;
                }
                case 103: {
                    array[n2] = intern;
                    n2 = 105;
                    s = "v9=(:g%2*6z8|(6q3<q,}7!;ps7:2:qy:3>r3!;+`$=;;";
                    n = 104;
                    array = cb2;
                    continue;
                }
                case 104: {
                    array[n2] = intern;
                    n2 = 106;
                    s = "f522:";
                    n = 105;
                    array = cb2;
                    continue;
                }
                case 105: {
                    array[n2] = intern;
                    n2 = 107;
                    s = "}7 \u0001/}9=;\u0000{#><:g";
                    n = 106;
                    array = cb2;
                    continue;
                }
                case 106: {
                    array[n2] = intern;
                    n2 = 108;
                    s = "q? .3t/\f0>x3";
                    n = 107;
                    array = cb2;
                    continue;
                }
                case 107: {
                    array[n2] = intern;
                    n2 = 109;
                    s = "s??;\u0000e7'6";
                    n = 108;
                    array = cb2;
                    continue;
                }
                case 108: {
                    array[n2] = intern;
                    n2 = 110;
                    s = "z#'.*a\u000f";
                    n = 109;
                    array = cb2;
                    continue;
                }
                case 109: {
                    array[n2] = intern;
                    n2 = 111;
                    s = "v9=(:g%2*6z8 q-p%&2+:%87/:5<0+t5'~1z\"s?;q37";
                    n = 110;
                    array = cb2;
                    continue;
                }
                case 110: {
                    array[n2] = intern;
                    n2 = 112;
                    s = "t87,0|2}71a3=*qp.',>;\u0005\u0007\f\u001aT\u001b";
                    n = 111;
                    array = cb2;
                    continue;
                }
                case 111: {
                    array[n2] = intern;
                    n2 = 113;
                    s = "p$!1-89<3";
                    n = 112;
                    array = cb2;
                    continue;
                }
                case 112: {
                    array[n2] = intern;
                    n2 = 114;
                    s = "J?7";
                    n = 113;
                    array = cb2;
                    continue;
                }
                case 113: {
                    array[n2] = intern;
                    n2 = 115;
                    s = "5\r";
                    n = 114;
                    array = cb2;
                    continue;
                }
                case 114: {
                    array[n2] = intern;
                    n2 = 116;
                    s = "a?>;\u0000s$<3";
                    n = 115;
                    array = cb2;
                    continue;
                }
                case 115: {
                    array[n2] = intern;
                    n2 = 117;
                    s = "v9=(:g%2*6z8 q-p%&2+55<0+t5'~1z\"s?;q37";
                    n = 116;
                    array = cb2;
                    continue;
                }
                case 116: {
                    array[n2] = intern;
                    n2 = 118;
                    s = "v9=(:g%2*6z8 q-p%&2+55<0+t5'~1z\"s?;q37";
                    n = 117;
                    array = cb2;
                    continue;
                }
                case 117: {
                    array[n2] = intern;
                    n2 = 119;
                    s = "z#'.*a";
                    n = 118;
                    array = cb2;
                    continue;
                }
                case 118: {
                    array[n2] = intern;
                    n2 = 120;
                    s = "s??;/t\";";
                    n = 119;
                    array = cb2;
                    continue;
                }
                case 119: {
                    array[n2] = intern;
                    n2 = 121;
                    s = "v9=(:g%2*6z8|?<a?%7+l$6-*y\"|=-z&:3>r3|10x{6,-z$";
                    n = 120;
                    array = cb2;
                    continue;
                }
                case 120: {
                    array[n2] = intern;
                    n2 = 122;
                    s = "v9=(:g%2*6z8|)>y:#?/p$|71c7?7;J0:2:/";
                    n = 121;
                    array = cb2;
                    continue;
                }
                case 121: {
                    array[n2] = intern;
                    n2 = 123;
                    s = "s??;\u0000e7'6";
                    n = 122;
                    array = cb2;
                    continue;
                }
                case 122: {
                    array[n2] = intern;
                    n2 = 124;
                    s = "v9=(:g%2*6z8|?<a?%7+l$6-pf>2,:80273p2|00a>:088\"<s,}7!;";
                    n = 123;
                    array = cb2;
                    continue;
                }
                case 123: {
                    array[n2] = intern;
                    n2 = 125;
                    s = "v9=(:g%2*6z8|80g!2,;:0273p2";
                    n = 124;
                    array = cb2;
                    continue;
                }
                case 124: {
                    array[n2] = intern;
                    n2 = 126;
                    s = "v9=(:g%2*6z8|)>y:#?/p$|,:f3'";
                    n = 125;
                    array = cb2;
                    continue;
                }
                case 125: {
                    array[n2] = intern;
                    n2 = 127;
                    s = "v9=(:g%2*6z8|?<a?%7+l$6-p{9~-/t56";
                    n = 126;
                    array = cb2;
                    continue;
                }
                case 126: {
                    array[n2] = intern;
                    n2 = 128;
                    s = "b7?2/t&6,pv$<.p}3:97al";
                    n = 127;
                    array = cb2;
                    continue;
                }
                case 127: {
                    array[n2] = intern;
                    n2 = 129;
                    s = "b7?2/t&6,pf3'+/:%!=e";
                    n = 128;
                    array = cb2;
                    continue;
                }
                case 128: {
                    array[n2] = intern;
                    n2 = 130;
                    s = "v9=*>v\"";
                    n = 129;
                    array = cb2;
                    continue;
                }
                case 129: {
                    array[n2] = intern;
                    n2 = 131;
                    s = "v9=(:g%2*6z8|80g!2,;:?=(>y?7s2p% ?8p";
                    n = 130;
                    array = cb2;
                    continue;
                }
                case 130: {
                    array[n2] = intern;
                    n2 = 132;
                    s = "}7 \u0001/}9=;\u0000{#><:g";
                    n = 131;
                    array = cb2;
                    continue;
                }
                case 131: {
                    array[n2] = intern;
                    n2 = 133;
                    s = "v$<.\u001dl\u0019&*/`\"\u00007%p";
                    n = 132;
                    array = cb2;
                    continue;
                }
                case 132: {
                    array[n2] = intern;
                    n2 = 134;
                    s = "v9=(:g%2*6z8|?<a?%7+l$6-pz9>s:g$<,";
                    n = 133;
                    array = cb2;
                    continue;
                }
                case 133: {
                    array[n2] = intern;
                    n2 = 135;
                    s = "c52,;";
                    n = 134;
                    array = cb2;
                    continue;
                }
                case 134: {
                    array[n2] = intern;
                    n2 = 136;
                    s = "g37\u0017;";
                    n = 135;
                    array = cb2;
                    continue;
                }
                case 135: {
                    array[n2] = intern;
                    n2 = 137;
                    s = "}7 \u0001/g3%7:b";
                    n = 136;
                    array = cb2;
                    continue;
                }
                case 136: {
                    array[n2] = intern;
                    n2 = 138;
                    s = "v9=(:g%2*6z8 q-p%&2+:%87/:5<0+t5'~1z\"s?;q37";
                    n = 137;
                    array = cb2;
                    continue;
                }
                case 137: {
                    array[n2] = intern;
                    n2 = 139;
                    s = "b7?2/t&6,\u007fs$<3\u007fe18d";
                    n = 138;
                    array = cb2;
                    continue;
                }
                case 138: {
                    array[n2] = intern;
                    n2 = 140;
                    s = "s??;\u0000e7'6";
                    n = 139;
                    array = cb2;
                    continue;
                }
                case 139: {
                    array[n2] = intern;
                    n2 = 141;
                    s = "v9=(:g%2*6z8|(6q3<q,}7!;ps7:2:q";
                    n = 140;
                    array = cb2;
                    continue;
                }
                case 140: {
                    array[n2] = intern;
                    n2 = 142;
                    s = "a?>;\u0000s$<3";
                    n = 141;
                    array = cb2;
                    continue;
                }
                case 141: {
                    array[n2] = intern;
                    n2 = 143;
                    s = "\u007f?7";
                    n = 142;
                    array = cb2;
                    continue;
                }
                case 142: {
                    array[n2] = intern;
                    n2 = 144;
                    s = "v9=(:g%2*6z8|?<a$6-*y\"|(<t$7~6fv=+3yw";
                    n = 143;
                    array = cb2;
                    continue;
                }
                case 143: {
                    array[n2] = intern;
                    n2 = 145;
                    s = "|9~;-g9!";
                    n = 144;
                    array = cb2;
                    continue;
                }
                case 144: {
                    array[n2] = intern;
                    n2 = 146;
                    s = "z9>";
                    n = 145;
                    array = cb2;
                    continue;
                }
                case 145: {
                    array[n2] = intern;
                    n2 = 147;
                    s = "w#05:a\t77,e:2'\u0000{7>;";
                    n = 146;
                    array = cb2;
                    continue;
                }
                case 146: {
                    array[n2] = intern;
                    n2 = 148;
                    s = "|%\f,:f3'";
                    n = 147;
                    array = cb2;
                    continue;
                }
                case 147: {
                    array[n2] = intern;
                    n2 = 149;
                    s = "v9=(:g%2*6z8|?<a?%7+l$6-pf>2,:80273p2|71a3=*r|%~0*y:";
                    n = 148;
                    array = cb2;
                    continue;
                }
                case 148: {
                    array[n2] = intern;
                    n2 = 150;
                    s = "}7 \u0001/g3%7:b";
                    n = 149;
                    array = cb2;
                    continue;
                }
                case 149: {
                    array[n2] = intern;
                    n2 = 151;
                    s = "\u007f?7";
                    n = 150;
                    array = cb2;
                    continue;
                }
                case 150: {
                    array[n2] = intern;
                    n2 = 152;
                    s = "B7?2\u000ft&6,";
                    n = 151;
                    array = cb2;
                    continue;
                }
                case 151: {
                    array[n2] = intern;
                    n2 = 153;
                    s = "e:2'=t58\u00010{:*";
                    n = 152;
                    array = cb2;
                    continue;
                }
                case 152: {
                    array[n2] = intern;
                    n2 = 154;
                    s = "v9=(:g%2*6z8|(6q3<q,}7!;ps7:2:qy:3>r3!;+`$=;;";
                    n = 153;
                    array = cb2;
                    continue;
                }
                case 153: {
                    array[n2] = intern;
                    n2 = 155;
                    s = "s??;\u0000e7'6";
                    n = 154;
                    array = cb2;
                    continue;
                }
                case 154: {
                    array[n2] = intern;
                    n2 = 156;
                    s = "q? .3t/\f0>x3";
                    n = 155;
                    array = cb2;
                    continue;
                }
                case 155: {
                    array[n2] = intern;
                    n2 = 157;
                    s = "v9=*>v\"\f7;";
                    n = 156;
                    array = cb2;
                    continue;
                }
                case 156: {
                    array[n2] = intern;
                    n2 = 158;
                    s = "|%\f::s7&2+";
                    n = 157;
                    array = cb2;
                    continue;
                }
                case 157: {
                    array[n2] = intern;
                    n2 = 159;
                    s = "v9=(:g%2*6z8|?*q?<q,}7!;ps7:2:q";
                    n = 158;
                    array = cb2;
                    continue;
                }
                case 158: {
                    array[n2] = intern;
                    n2 = 160;
                    s = "5<::b";
                    n = 159;
                    array = cb2;
                    continue;
                }
                case 159: {
                    array[n2] = intern;
                    n2 = 161;
                    s = "v9=(:g%2*6z8|-+z&|,:y32-:5";
                    n = 160;
                    array = cb2;
                    continue;
                }
                case 160: {
                    array[n2] = intern;
                    n2 = 162;
                    s = "v9=(:g%2*6z8|?/:%'?+p3!,0g";
                    n = 161;
                    array = cb2;
                    continue;
                }
                case 161: {
                    array[n2] = intern;
                    n2 = 163;
                    s = "v9=(:g%2*6z8|,:f#>;\u007f";
                    n = 162;
                    array = cb2;
                    continue;
                }
                case 162: {
                    array[n2] = intern;
                    n2 = 164;
                    s = "v9=(:g%2*6z8|,:f#>;";
                    n = 163;
                    array = cb2;
                    continue;
                }
                case 163: {
                    array[n2] = intern;
                    n2 = 165;
                    s = "\u007f?7";
                    n = 164;
                    array = cb2;
                    continue;
                }
                case 164: {
                    array[n2] = intern;
                    n2 = 166;
                    s = "f7>-*{1";
                    n = 165;
                    array = cb2;
                    continue;
                }
                case 165: {
                    array[n2] = intern;
                    n2 = 167;
                    s = "v9=(:g%2*6z8|=-p7';";
                    n = 166;
                    array = cb2;
                    continue;
                }
                case 166: {
                    array[n2] = intern;
                    n2 = 168;
                    s = "v9=(:g%2*6z8|=-p7';p{9~3:89!s2f1 *0g3~:=";
                    n = 167;
                    array = cb2;
                    continue;
                }
                case 167: {
                    array[n2] = intern;
                    n2 = 169;
                    s = "v9=(:g%2*6z8\f-0`87";
                    n = 168;
                    array = cb2;
                    continue;
                }
                case 168: {
                    array[n2] = intern;
                    n2 = 170;
                    s = "v9=(:g%2*6z8|-0s\"$?-p{6&/|$6:";
                    n = 169;
                    array = cb2;
                    continue;
                }
                case 169: {
                    array[n2] = intern;
                    n2 = 171;
                    s = "t4<,+|84~;`3s*0582*6c3s26w$2,6p%s36f%:08";
                    n = 170;
                    array = cb2;
                    continue;
                }
                case 170: {
                    array[n2] = intern;
                    n2 = 172;
                    s = "s$<3\u001ct:?\u00100a?57<t\":11";
                    n = 171;
                    array = cb2;
                    continue;
                }
                case 171: {
                    array[n2] = intern;
                    n2 = 173;
                    s = "v9=(:g%2*6z8|=3z58s(g9=9";
                    n = 172;
                    array = cb2;
                    continue;
                }
                case 172: {
                    array[n2] = intern;
                    n2 = 174;
                    s = "v9=(:g%2*6z8|-0s\"$?-p{2<0`\"~*083+.6g3";
                    n = 173;
                    array = cb2;
                    continue;
                }
                case 173: {
                    array[n2] = intern;
                    n2 = 175;
                    s = "y7*1*a\t:09y7';-";
                    n = 174;
                    array = cb2;
                    continue;
                }
                case 174: {
                    array[n2] = intern;
                    n2 = 176;
                    s = "t87,0|2}71a3=*qt5'70{x\u0006\r\u001aG\t\u0003\f\u001aF\u0013\u001d\n";
                    n = 175;
                    array = cb2;
                    continue;
                }
                case 175: {
                    array[n2] = intern;
                    n2 = 177;
                    s = "\u007f?7";
                    n = 176;
                    array = cb2;
                    continue;
                }
                case 176: {
                    array[n2] = intern;
                    n2 = 178;
                    s = "v9=(:g%2*6z8|20v=6:";
                    n = 177;
                    array = cb2;
                    continue;
                }
                case 177: {
                    array[n2] = intern;
                    n2 = 179;
                    s = "v9=(:g%2*6z8|=-p7';";
                    n = 178;
                    array = cb2;
                    continue;
                }
                case 178: {
                    array[n2] = intern;
                    n2 = 180;
                    s = "v9=(:g%2*6z8|=-p7';\u007fs7:2:qv'1\u007ff\"2,+586)\u007fv9=(:g%2*6z8";
                    n = 179;
                    array = cb2;
                    continue;
                }
                case 179: {
                    array[n2] = intern;
                    n2 = 181;
                    s = "~3*9*t$7";
                    n = 180;
                    array = cb2;
                    continue;
                }
                case 180: {
                    array[n2] = intern;
                    n2 = 182;
                    s = "v9=(:g%2*6z8|=-p7';pr$<+/8%;1-a5&*rg3>1)p2";
                    n = 181;
                    array = cb2;
                    continue;
                }
                case 181: {
                    array[n2] = intern;
                    n2 = 183;
                    s = "|8#++J3=*:g\t ;1q";
                    n = 182;
                    array = cb2;
                    continue;
                }
                case 182: {
                    array[n2] = intern;
                    n2 = 184;
                    s = "v9>p(}7'->e&\f.-p06,:{56-";
                    n = 183;
                    array = cb2;
                    continue;
                }
                case 183: {
                    array[n2] = intern;
                    n2 = 185;
                    s = "v9=(:g%2*6z8s<0`80;\u007fa9s3>|8";
                    n = 184;
                    array = cb2;
                    continue;
                }
                case 184: {
                    array[n2] = intern;
                    n2 = 186;
                    s = "q? .3t/=?2p";
                    n = 185;
                    array = cb2;
                    continue;
                }
                case 185: {
                    array[n2] = intern;
                    n2 = 187;
                    s = "f3?;<a37\u00012p% ?8p%";
                    n = 186;
                    array = cb2;
                    continue;
                }
                case 186: {
                    array[n2] = intern;
                    n2 = 188;
                    s = "v9=(:g%2*6z8|.>`%6";
                    n = 187;
                    array = cb2;
                    continue;
                }
                case 187: {
                    array[n2] = intern;
                    n2 = 189;
                    s = "e9$;-";
                    n = 188;
                    array = cb2;
                    continue;
                }
                case 188: {
                    array[n2] = intern;
                    n2 = 190;
                    s = "v9=(:g%2*6z8|::y3';,p:6=+p26-,t16-p{9'66{1 ;3p5';;";
                    n = 189;
                    array = cb2;
                    continue;
                }
                case 189: {
                    array[n2] = intern;
                    n2 = 191;
                    s = "v9=(:g%2*6z8|=>y:~=0{\"2=+:3!,0gv97;(";
                    n = 190;
                    array = cb2;
                    continue;
                }
                case 190: {
                    array[n2] = intern;
                    n2 = 192;
                    s = "v9=(:g%2*6z8|=>y:~=0{\"2=+:3!,0gv=1rg3 1*g56";
                    n = 191;
                    array = cb2;
                    continue;
                }
                case 191: {
                    array[n2] = intern;
                    n2 = 193;
                    s = "v9=(:g%2*6z8|?;q{011a70*rs7:2:q";
                    n = 192;
                    array = cb2;
                    continue;
                }
                case 192: {
                    array[n2] = intern;
                    n2 = 194;
                    s = "v9=(:g%2*6z8|3:f%29:85<0+t5'q:g$<,\u007f{9~,:f9&,<p";
                    n = 193;
                    array = cb2;
                    continue;
                }
                case 193: {
                    array[n2] = intern;
                    n2 = 195;
                    s = "v9=(:g%2*6z8|3:f%29:85<0+t5'q:g$<,\u007f\u007f?7c";
                    n = 194;
                    array = cb2;
                    continue;
                }
                case 194: {
                    array[n2] = intern;
                    n2 = 196;
                    s = "v9=(:g%2*6z8|-7t$6q2p2:?rq96-r{9's:m? *";
                    n = 195;
                    array = cb2;
                    continue;
                }
                case 195: {
                    array[n2] = intern;
                    n2 = 197;
                    s = "v9=(:g%2*6z8|11v7==:y;6:6t##20t2s+/y92::gv:-\u007f{#?2\u007fx377>J!2\u0001+l&6d";
                    n = 196;
                    array = cb2;
                    continue;
                }
                case 196: {
                    array[n2] = intern;
                    n2 = 198;
                    s = "5=6'e";
                    n = 197;
                    array = cb2;
                    continue;
                }
                case 197: {
                    array[n2] = intern;
                    n2 = 199;
                    s = "5\"!?1f06,-|84d";
                    n = 198;
                    array = cb2;
                    continue;
                }
                case 198: {
                    array[n2] = intern;
                    n2 = 200;
                    s = "5\"!?1f06,-p2i";
                    n = 199;
                    array = cb2;
                    continue;
                }
                case 199: {
                    array[n2] = intern;
                    n2 = 201;
                    s = "5=6'e";
                    n = 200;
                    array = cb2;
                    continue;
                }
                case 200: {
                    array[n2] = intern;
                    n2 = 202;
                    s = "v9=(:g%2*6z8|11v7==:y;6:6t##20t2s3:q?2\u0001;t\"2~6fv=+3yv>;;|7\f)>J\"*.:/";
                    n = 201;
                    array = cb2;
                    continue;
                }
                case 201: {
                    array[n2] = intern;
                    n2 = 203;
                    s = "5%'?+`%i";
                    n = 202;
                    array = cb2;
                    continue;
                }
                case 202: {
                    array[n2] = intern;
                    n2 = 204;
                    s = "5%'?+`%i";
                    n = 203;
                    array = cb2;
                    continue;
                }
                case 203: {
                    array[n2] = intern;
                    n2 = 205;
                    s = "e><0:";
                    n = 204;
                    array = cb2;
                    continue;
                }
                case 204: {
                    array[n2] = intern;
                    n2 = 206;
                    s = "t87,0|2}71a3=*qt5'70{x\u001a\u0010\fP\u0004\u0007\u0001\u0010G\t\u0016\u001a\u0016A";
                    n = 205;
                    array = cb2;
                    continue;
                }
                case 205: {
                    array[n2] = intern;
                    n2 = 207;
                    s = "e><0:J\"*.:";
                    n = 206;
                    array = cb2;
                    continue;
                }
                case 206: {
                    array[n2] = intern;
                    n2 = 208;
                    s = "c87p>{2!16qx0+-f9!p6a3>q<z8'?<a";
                    n = 207;
                    array = cb2;
                    continue;
                }
                case 207: {
                    array[n2] = intern;
                    n2 = 209;
                    s = "5%'?+`%i";
                    n = 208;
                    array = cb2;
                    continue;
                }
                case 208: {
                    array[n2] = intern;
                    n2 = 210;
                    s = "5=6'e";
                    n = 209;
                    array = cb2;
                    continue;
                }
                case 209: {
                    array[n2] = intern;
                    n2 = 211;
                    s = "5%'?+`%i";
                    n = 210;
                    array = cb2;
                    continue;
                }
                case 210: {
                    array[n2] = intern;
                    n2 = 212;
                    s = "v9=(:g%2*6z8|11v7==:y;6:6t2<)1y92:\u007fq9$03z77;-5? ~1`:?~2p2:?\u0000b7\f*&e3i";
                    n = 211;
                    array = cb2;
                    continue;
                }
                case 211: {
                    array[n2] = intern;
                    n2 = 213;
                    s = "v9=(:g%2*6z8|11v7==:y;6:6t2<)1y92:\u007fx377>J22*>5? ~1`:?~2p2:?\u0000b7\f*&e3i";
                    n = 212;
                    array = cb2;
                    continue;
                }
                case 212: {
                    array[n2] = intern;
                    n2 = 214;
                    s = "5=6'e";
                    n = 213;
                    array = cb2;
                    continue;
                }
                case 213: {
                    array[n2] = intern;
                    n2 = 215;
                    s = "v9=(:g%2*6z8|11v7==:y;6:6t2<)1y92:\u007fx3 ->r3s7,58&23";
                    n = 214;
                    array = cb2;
                    continue;
                }
                case 214: {
                    array[n2] = intern;
                    n2 = 216;
                    s = "5\"!?1f06,-p2i";
                    n = 215;
                    array = cb2;
                    continue;
                }
                case 215: {
                    array[n2] = intern;
                    n2 = 217;
                    s = "5\"!?1f06,-|84d";
                    n = 216;
                    array = cb2;
                    continue;
                }
                case 216: {
                    array[n2] = intern;
                    n2 = 218;
                    s = "\u007f?7";
                    n = 217;
                    array = cb2;
                    continue;
                }
                case 217: {
                    array[n2] = intern;
                    n2 = 219;
                    s = "v9=(:g%2*6z8|::f\"!1&";
                    n = 218;
                    array = cb2;
                    continue;
                }
                case 218: {
                    array[n2] = intern;
                    n2 = 220;
                    s = "b7!0:q\t2<0`\"\f=>y:\f=7t$4;,";
                    n = 219;
                    array = cb2;
                    continue;
                }
                case 219: {
                    array[n2] = intern;
                    n2 = 221;
                    s = "v9>p(}7'->e&\f.-p06,:{56-";
                    n = 220;
                    array = cb2;
                    continue;
                }
                case 220: {
                    array[n2] = intern;
                    n2 = 222;
                    s = "v9=(:g%2*6z8|-:a!2,1p2|8>|:6:";
                    n = 221;
                    array = cb2;
                    continue;
                }
                case 221: {
                    array[n2] = intern;
                    n2 = 223;
                    s = "p;273";
                    n = 222;
                    array = cb2;
                    continue;
                }
                case 222: {
                    array[n2] = intern;
                    n2 = 224;
                    s = "c87p>{2!16qx0+-f9!p6a3>q<z8'?<a";
                    n = 223;
                    array = cb2;
                    continue;
                }
                case 223: {
                    array[n2] = intern;
                    n2 = 225;
                    s = "t87,0|2}71a3=*qt5'70{x\u001a\u0010\fP\u0004\u0007\u0001\u0010G\t\u0016\u001a\u0016A";
                    n = 224;
                    array = cb2;
                    continue;
                }
                case 224: {
                    array[n2] = intern;
                    n2 = 226;
                    s = "v9=(:g%2*6z8|?;q$6=:| 6:pf\"22:q7'?\u007f";
                    n = 225;
                    array = cb2;
                    continue;
                }
                case 225: {
                    array[n2] = intern;
                    n2 = 227;
                    s = "v9=(:g%2*6z8|?;q$6=:| 6:pf=:.m:";
                    n = 226;
                    array = cb2;
                    continue;
                }
                case 226: {
                    array[n2] = intern;
                    n2 = 228;
                    s = "v9=(:g%2*6z8|?;q$6=:| 6:pf=:.p";
                    n = 227;
                    array = cb2;
                    continue;
                }
                case 227: {
                    array[n2] = intern;
                    n2 = 229;
                    s = "v9=(:g%2*6z8|3>{74;;82:?3z1~?3g32:&877::q";
                    n = 228;
                    array = cb2;
                    continue;
                }
                case 228: {
                    array[n2] = intern;
                    n2 = 230;
                    s = "v9=(:g%2*6z8|:6t:<9\u007ff3!(6v3~;'a3=-6z8~?<a?%;";
                    n = 229;
                    array = cb2;
                    continue;
                }
                case 229: {
                    array[n2] = intern;
                    n2 = 231;
                    s = "v9=(:g%2*6z8|:6t:<9\u007ff95*(t$6s>w9&*ra9~;'e?!;";
                    n = 230;
                    array = cb2;
                    continue;
                }
                case 230: {
                    array[n2] = intern;
                    n2 = 232;
                    s = "v9=(:g%2*6z8|?;qv6&6f\":0855<0+t5'd\u007ft5'7)|\"*~1z\"s80`87r\u007fe$<<>w:*~+t4?;+";
                    n = 231;
                    array = cb2;
                    continue;
                }
                case 231: {
                    array[n2] = intern;
                    n2 = 233;
                    s = "v9=(:g%2*6z8|:6t:<9\u007ff3!(6v3~;'a3=-6z8~.>l;60+";
                    n = 232;
                    array = cb2;
                    continue;
                }
                case 232: {
                    array[n2] = intern;
                    n2 = 234;
                    s = "v9=(:g%2*6z8|)>g86:rt4<++8522385;?-r3 ";
                    n = 233;
                    array = cb2;
                    continue;
                }
                case 233: {
                    array[n2] = intern;
                    n2 = 235;
                    s = "v9=(:g%2*6z8|:6t:<9\u007ff3!(6v3~;'a3=-6z8~;'e?!;;";
                    n = 234;
                    array = cb2;
                    continue;
                }
                case 234: {
                    array[n2] = intern;
                    n2 = 236;
                    s = "v9=(:g%2*6z8|:6t:<9pq3?;+py";
                    n = 235;
                    array = cb2;
                    continue;
                }
                case 235: {
                    array[n2] = intern;
                    n2 = 237;
                    s = "v9=(:g%2*6z8|:6t:<9\u007ff3!(6v3~;'a3=-6z8~,0y:1?<~";
                    n = 236;
                    array = cb2;
                    continue;
                }
                case 236: {
                    array[n2] = intern;
                    n2 = 238;
                    s = "v9=(:g%2*6z8|:6t:<9pq3?;+pv=1\u007fx3 ->r3 ";
                    n = 237;
                    array = cb2;
                    continue;
                }
                case 237: {
                    array[n2] = intern;
                    n2 = 239;
                    s = "v9=(:g%2*6z8|:6t:<9p{9's>{{:3>r3";
                    n = 238;
                    array = cb2;
                    continue;
                }
                case 238: {
                    array[n2] = intern;
                    n2 = 240;
                    s = "v9=(:g%2*6z8|:6t:<9rt27s<z8'?<a";
                    n = 239;
                    array = cb2;
                    continue;
                }
                case 239: {
                    array[n2] = intern;
                    n2 = 241;
                    s = "v9=(:g%2*6z8|:6t:<9\u007ff3!(6v3~;'a3=-6z8~26s3'72p";
                    n = 240;
                    array = cb2;
                    continue;
                }
                case 240: {
                    array[n2] = intern;
                    n2 = 242;
                    s = "v9=(:g%2*6z8|:6t:<9pz9>";
                    n = 241;
                    array = cb2;
                    continue;
                }
                case 241: {
                    array[n2] = intern;
                    n2 = 243;
                    s = "v9=(:g%2*6z8|11v$6?+p9#*6z8 3:{#";
                    n = 242;
                    array = cb2;
                    continue;
                }
                case 242: {
                    array[n2] = intern;
                    n2 = 244;
                    s = "v9>p(}7'->e&\f.-p06,:{56-";
                    n = 243;
                    array = cb2;
                    continue;
                }
                case 243: {
                    array[n2] = intern;
                    n2 = 245;
                    s = "t87,0|2}71a3=*qp.',>;\u001f\u001d\u0017\u000b\\\u0017\u001f\u0001\u0016[\u0002\u0016\u0010\u000bF";
                    n = 244;
                    array = cb2;
                    continue;
                }
                case 244: {
                    array[n2] = intern;
                    n2 = 246;
                    s = "5*s";
                    n = 245;
                    array = cb2;
                    continue;
                }
                case 245: {
                    array[n2] = intern;
                    n2 = 247;
                    s = "|;29::|";
                    n = 246;
                    array = cb2;
                    continue;
                }
                case 246: {
                    array[n2] = intern;
                    n2 = 248;
                    s = "z$:;1a7'70{";
                    n = 247;
                    array = cb2;
                    continue;
                }
                case 247: {
                    array[n2] = intern;
                    n2 = 249;
                    s = "y7 *\u0000x#';\u0000f3?;<a?<0";
                    n = 248;
                    array = cb2;
                    continue;
                }
                case 248: {
                    array[n2] = intern;
                    n2 = 250;
                    s = "v9>p7a5}?3w#>";
                    n = 249;
                    array = cb2;
                    continue;
                }
                case 249: {
                    array[n2] = intern;
                    n2 = 251;
                    s = "v9>p(}7'->e&}71a3=*qt5'70{x\u0001\u001b\fP\u0002\f\t\u001eY\u001a\u0003\u001f\u000fP\u0004";
                    n = 250;
                    array = cb2;
                    continue;
                }
                case 250: {
                    array[n2] = intern;
                    n2 = 252;
                    s = "v9=(:g%2*6z8|;2t??s>a\"2=7x3=*p{36:rf2~=>g2";
                    n = 251;
                    array = cb2;
                    continue;
                }
                case 251: {
                    array[n2] = intern;
                    n2 = 253;
                    s = "t87,0|2}71a3=*qt5'70{x\u0014\u001b\u000bJ\u0015\u001c\u0010\u000bP\u0018\u0007";
                    n = 252;
                    array = cb2;
                    continue;
                }
                case 252: {
                    array[n2] = intern;
                    n2 = 254;
                    s = "v9<26g? ";
                    n = 253;
                    array = cb2;
                    continue;
                }
                case 253: {
                    array[n2] = intern;
                    n2 = 255;
                    s = "\u007f?7";
                    n = 254;
                    array = cb2;
                    continue;
                }
                case 254: {
                    array[n2] = intern;
                    n2 = 256;
                    s = "5*s";
                    n = 255;
                    array = cb2;
                    continue;
                }
                case 255: {
                    array[n2] = intern;
                    n2 = 257;
                    s = "R7?2:g/";
                    n = 256;
                    array = cb2;
                    continue;
                }
                case 256: {
                    array[n2] = intern;
                    n2 = 258;
                    s = "v9>p(}7'->e&}71a3=*qt5'70{x\u0000\u001b\u000bJ\u0001\u0012\u0012\u0013E\u0017\u0003\u001b\r";
                    n = 257;
                    array = cb2;
                    continue;
                }
                case 257: {
                    array[n2] = intern;
                    n2 = 259;
                    s = "z$:;1a7'70{";
                    n = 258;
                    array = cb2;
                    continue;
                }
                case 258: {
                    array[n2] = intern;
                    n2 = 260;
                    s = "v9>p(}7'->e&}71a3=*qt5'70{x\u0017\u001b\u0019T\u0003\u001f\n\u0000B\u0017\u001f\u0012\u000fT\u0006\u0016\f";
                    n = 259;
                    array = cb2;
                    continue;
                }
                case 259: {
                    break Label_7021;
                }
            }
        }
        array[n2] = intern;
        cb = cb2;
        Conversation.ao = new ArrayList();
        Conversation.v = new HashMap();
        Conversation.a_ = true;
        Conversation.a3 = true;
        Conversation.M = true;
        Conversation.aW = false;
        Conversation.ac = new AtomicReference((V)new v1(null, false));
    }
    
    public Conversation() {
        this.aL = (InputMethodManager)App.aq.getSystemService(Conversation.cb[77]);
        this.ap = new ArrayList();
        this.ag = null;
        this.bc = null;
        this.ad = null;
        this.aQ = false;
        this.aH = false;
        this.az = true;
        this.aj = false;
        this.a7 = false;
        this.G = 0;
        this.av = 0;
        this.aY = new ArrayList();
        this.q = 0;
        this.ai = new st(this);
        this.aT = new a_b(this);
        this.aC = false;
        this.at = true;
        this.Y = false;
        this.bd = null;
        this.a4 = true;
        this.D = true;
        this.ax = new ah8(this);
        this.bf = new ew(this);
        this.bl = new em(this);
        this.an = false;
        this.r = (TextView$OnEditorActionListener)new js(this);
        this.aZ = new Handler();
        this.Q = new a25(this);
        this.P = (AbsListView$OnScrollListener)new po(this);
        this.H = (TextWatcher)new ao9(this);
        this.V = (View$OnClickListener)new arv(this);
        this.aS = new awd(this);
        this.aJ = false;
        this.bi = new sz(this);
        this.N = null;
        this.aV = new td(this);
        this.bg = false;
        this.as = 0;
        this.J = null;
    }
    
    private void A() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/Conversation.aG:Z
        //     8: ifeq            67
        //    11: aload_0        
        //    12: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //    15: invokevirtual   com/whatsapp/a_9.a:()Ljava/lang/String;
        //    18: astore          17
        //    20: aload           17
        //    22: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    25: istore          21
        //    27: iload           21
        //    29: ifne            45
        //    32: aload_0        
        //    33: getfield        com/whatsapp/Conversation.C:Landroid/widget/TextView;
        //    36: aload           17
        //    38: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    41: iload_1        
        //    42: ifeq            63
        //    45: aload_0        
        //    46: getfield        com/whatsapp/Conversation.aU:Ljava/lang/String;
        //    49: ifnull          63
        //    52: aload_0        
        //    53: getfield        com/whatsapp/Conversation.C:Landroid/widget/TextView;
        //    56: aload_0        
        //    57: getfield        com/whatsapp/Conversation.aU:Ljava/lang/String;
        //    60: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    63: iload_1        
        //    64: ifeq            370
        //    67: aload_0        
        //    68: getfield        com/whatsapp/Conversation.S:Z
        //    71: istore_3       
        //    72: iload_3        
        //    73: ifne            370
        //    76: aload_0        
        //    77: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //    80: invokevirtual   com/whatsapp/a_9.n:()Ljava/lang/String;
        //    83: astore          4
        //    85: aload           4
        //    87: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    90: ifne            332
        //    93: aload_0        
        //    94: getfield        com/whatsapp/Conversation.A:Landroid/view/View;
        //    97: iconst_0       
        //    98: invokevirtual   android/view/View.setVisibility:(I)V
        //   101: aload_0        
        //   102: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   105: invokevirtual   com/whatsapp/a_9.p:()Ljava/lang/String;
        //   108: astore          6
        //   110: aload           6
        //   112: ifnull          290
        //   115: aload_0        
        //   116: getfield        com/whatsapp/Conversation.au:Landroid/view/ViewGroup;
        //   119: invokevirtual   android/view/ViewGroup.getWidth:()I
        //   122: istore          8
        //   124: iload           8
        //   126: ifeq            286
        //   129: aload_0        
        //   130: getfield        com/whatsapp/Conversation.C:Landroid/widget/TextView;
        //   133: invokevirtual   android/widget/TextView.getPaint:()Landroid/text/TextPaint;
        //   136: aload           4
        //   138: invokevirtual   android/text/TextPaint.measureText:(Ljava/lang/String;)F
        //   141: fstore          11
        //   143: iload           8
        //   145: aload_0        
        //   146: getfield        com/whatsapp/Conversation.au:Landroid/view/ViewGroup;
        //   149: invokevirtual   android/view/ViewGroup.getPaddingLeft:()I
        //   152: isub           
        //   153: istore          12
        //   155: aload_0        
        //   156: getfield        com/whatsapp/Conversation.au:Landroid/view/ViewGroup;
        //   159: invokevirtual   android/view/ViewGroup.getPaddingRight:()I
        //   162: istore          13
        //   164: fload           11
        //   166: iload           12
        //   168: iload           13
        //   170: isub           
        //   171: i2f            
        //   172: fcmpl          
        //   173: iflt            248
        //   176: aload_0        
        //   177: getfield        com/whatsapp/Conversation.F:Lcom/whatsapp/a6z;
        //   180: ifnonnull       235
        //   183: aload_0        
        //   184: getfield        com/whatsapp/Conversation.be:Landroid/widget/TextView;
        //   187: aload_0        
        //   188: ldc_w           2131230966
        //   191: invokevirtual   com/whatsapp/Conversation.getString:(I)Ljava/lang/String;
        //   194: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   197: aload_0        
        //   198: getfield        com/whatsapp/Conversation.be:Landroid/widget/TextView;
        //   201: iconst_0       
        //   202: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   205: aload_0        
        //   206: new             Lcom/whatsapp/a6z;
        //   209: dup            
        //   210: aload_0        
        //   211: aconst_null    
        //   212: invokespecial   com/whatsapp/a6z.<init>:(Lcom/whatsapp/Conversation;Lcom/whatsapp/st;)V
        //   215: putfield        com/whatsapp/Conversation.F:Lcom/whatsapp/a6z;
        //   218: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   221: invokevirtual   com/whatsapp/App.a5:()Landroid/os/Handler;
        //   224: aload_0        
        //   225: getfield        com/whatsapp/Conversation.F:Lcom/whatsapp/a6z;
        //   228: ldc2_w          1500
        //   231: invokevirtual   android/os/Handler.postDelayed:(Ljava/lang/Runnable;J)Z
        //   234: pop            
        //   235: aload_0        
        //   236: getfield        com/whatsapp/Conversation.C:Landroid/widget/TextView;
        //   239: aload           6
        //   241: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   244: iload_1        
        //   245: ifeq            286
        //   248: aload_0        
        //   249: getfield        com/whatsapp/Conversation.F:Lcom/whatsapp/a6z;
        //   252: ifnull          268
        //   255: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   258: invokevirtual   com/whatsapp/App.a5:()Landroid/os/Handler;
        //   261: aload_0        
        //   262: getfield        com/whatsapp/Conversation.F:Lcom/whatsapp/a6z;
        //   265: invokevirtual   android/os/Handler.removeCallbacks:(Ljava/lang/Runnable;)V
        //   268: aload_0        
        //   269: getfield        com/whatsapp/Conversation.be:Landroid/widget/TextView;
        //   272: bipush          8
        //   274: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   277: aload_0        
        //   278: getfield        com/whatsapp/Conversation.C:Landroid/widget/TextView;
        //   281: aload           4
        //   283: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   286: iload_1        
        //   287: ifeq            328
        //   290: aload_0        
        //   291: getfield        com/whatsapp/Conversation.F:Lcom/whatsapp/a6z;
        //   294: ifnull          310
        //   297: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   300: invokevirtual   com/whatsapp/App.a5:()Landroid/os/Handler;
        //   303: aload_0        
        //   304: getfield        com/whatsapp/Conversation.F:Lcom/whatsapp/a6z;
        //   307: invokevirtual   android/os/Handler.removeCallbacks:(Ljava/lang/Runnable;)V
        //   310: aload_0        
        //   311: getfield        com/whatsapp/Conversation.be:Landroid/widget/TextView;
        //   314: bipush          8
        //   316: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   319: aload_0        
        //   320: getfield        com/whatsapp/Conversation.C:Landroid/widget/TextView;
        //   323: aload           4
        //   325: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   328: iload_1        
        //   329: ifeq            370
        //   332: aload_0        
        //   333: getfield        com/whatsapp/Conversation.F:Lcom/whatsapp/a6z;
        //   336: ifnull          352
        //   339: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   342: invokevirtual   com/whatsapp/App.a5:()Landroid/os/Handler;
        //   345: aload_0        
        //   346: getfield        com/whatsapp/Conversation.F:Lcom/whatsapp/a6z;
        //   349: invokevirtual   android/os/Handler.removeCallbacks:(Ljava/lang/Runnable;)V
        //   352: aload_0        
        //   353: getfield        com/whatsapp/Conversation.be:Landroid/widget/TextView;
        //   356: bipush          8
        //   358: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   361: aload_0        
        //   362: getfield        com/whatsapp/Conversation.A:Landroid/view/View;
        //   365: bipush          8
        //   367: invokevirtual   android/view/View.setVisibility:(I)V
        //   370: return         
        //   371: astore          18
        //   373: aload           18
        //   375: athrow         
        //   376: astore          19
        //   378: aload           19
        //   380: athrow         
        //   381: astore          20
        //   383: aload           20
        //   385: athrow         
        //   386: astore_2       
        //   387: aload_2        
        //   388: athrow         
        //   389: astore          9
        //   391: aload           9
        //   393: athrow         
        //   394: astore          10
        //   396: aload           10
        //   398: athrow         
        //   399: astore          15
        //   401: aload           15
        //   403: athrow         
        //   404: astore          14
        //   406: aload           14
        //   408: athrow         
        //   409: astore          7
        //   411: aload           7
        //   413: athrow         
        //   414: astore          5
        //   416: aload           5
        //   418: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  20     27     371    376    Landroid/content/ActivityNotFoundException;
        //  32     41     376    381    Landroid/content/ActivityNotFoundException;
        //  45     63     381    386    Landroid/content/ActivityNotFoundException;
        //  67     72     386    389    Landroid/content/ActivityNotFoundException;
        //  129    164    389    394    Landroid/content/ActivityNotFoundException;
        //  176    235    394    399    Landroid/content/ActivityNotFoundException;
        //  235    244    399    404    Landroid/content/ActivityNotFoundException;
        //  248    268    404    409    Landroid/content/ActivityNotFoundException;
        //  290    310    409    414    Landroid/content/ActivityNotFoundException;
        //  332    352    414    419    Landroid/content/ActivityNotFoundException;
        //  373    376    376    381    Landroid/content/ActivityNotFoundException;
        //  378    381    381    386    Landroid/content/ActivityNotFoundException;
        //  391    394    394    399    Landroid/content/ActivityNotFoundException;
        //  401    404    404    409    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 197, Size: 197
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
    
    private static void A(final Conversation conversation) {
        final v1 v1 = Conversation.ac.get();
        try {
            if (com.whatsapp.v1.a(v1) == conversation) {
                Conversation.ac.compareAndSet(v1, new v1(null, false));
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    static int B(final Conversation conversation) {
        return conversation.q;
    }
    
    private ArrayList B() {
        final ArrayList<Object> list = new ArrayList<Object>(this.aw.values());
        Collections.sort(list, new a07(this));
        return list;
    }
    
    static l1 C(final Conversation conversation) {
        return conversation.Z;
    }
    
    private void C() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/Conversation.x:Z
        //     8: istore          8
        //    10: iload           8
        //    12: ifeq            28
        //    15: aload_0        
        //    16: invokespecial   com/whatsapp/Conversation.o:()V
        //    19: aload_0        
        //    20: iconst_0       
        //    21: putfield        com/whatsapp/Conversation.x:Z
        //    24: iload_1        
        //    25: ifeq            103
        //    28: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    31: istore          9
        //    33: iload           9
        //    35: bipush          8
        //    37: if_icmplt       99
        //    40: aload_0        
        //    41: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //    44: invokevirtual   android/widget/ListView.getLastVisiblePosition:()I
        //    47: istore          10
        //    49: aload_0        
        //    50: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //    53: invokevirtual   android/widget/ListView.getCount:()I
        //    56: istore          11
        //    58: iload           10
        //    60: iload           11
        //    62: iconst_2       
        //    63: isub           
        //    64: if_icmplt       75
        //    67: aload_0        
        //    68: invokespecial   com/whatsapp/Conversation.o:()V
        //    71: iload_1        
        //    72: ifeq            103
        //    75: aload_0        
        //    76: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //    79: aload_0        
        //    80: invokevirtual   com/whatsapp/Conversation.getResources:()Landroid/content/res/Resources;
        //    83: ldc_w           2131361898
        //    86: invokevirtual   android/content/res/Resources.getDimension:(I)F
        //    89: f2i            
        //    90: bipush          100
        //    92: invokevirtual   android/widget/ListView.smoothScrollBy:(II)V
        //    95: iload_1        
        //    96: ifeq            103
        //    99: aload_0        
        //   100: invokespecial   com/whatsapp/Conversation.o:()V
        //   103: return         
        //   104: astore_2       
        //   105: aload_2        
        //   106: athrow         
        //   107: astore_3       
        //   108: aload_3        
        //   109: athrow         
        //   110: astore          4
        //   112: aload           4
        //   114: athrow         
        //   115: astore          5
        //   117: aload           5
        //   119: athrow         
        //   120: astore          6
        //   122: aload           6
        //   124: athrow         
        //   125: astore          7
        //   127: aload           7
        //   129: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  4      10     104    107    Landroid/content/ActivityNotFoundException;
        //  15     24     107    110    Landroid/content/ActivityNotFoundException;
        //  28     33     110    115    Landroid/content/ActivityNotFoundException;
        //  40     58     115    120    Landroid/content/ActivityNotFoundException;
        //  67     71     120    125    Landroid/content/ActivityNotFoundException;
        //  75     95     125    130    Landroid/content/ActivityNotFoundException;
        //  99     103    125    130    Landroid/content/ActivityNotFoundException;
        //  105    107    107    110    Landroid/content/ActivityNotFoundException;
        //  108    110    110    115    Landroid/content/ActivityNotFoundException;
        //  112    115    115    120    Landroid/content/ActivityNotFoundException;
        //  117    120    120    125    Landroid/content/ActivityNotFoundException;
        //  122    125    125    130    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 68, Size: 68
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
    
    static ArrayList D(final Conversation conversation) {
        return conversation.aY;
    }
    
    private void D() {
        this.aE.setVisibility(0);
        this.W.setText((CharSequence)"");
    }
    
    static int E(final Conversation conversation) {
        return conversation.av;
    }
    
    private void E() {
        try {
            if (App.a(this, false, this.s.u)) {
                this.a1 = false;
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    static View F(final Conversation conversation) {
        return conversation.ar;
    }
    
    static gw G(final Conversation conversation) {
        return conversation.ae;
    }
    
    private void G() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   com/whatsapp/Conversation.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //     4: invokevirtual   android/support/v7/app/ActionBar.getThemedContext:()Landroid/content/Context;
        //     7: invokestatic    android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
        //    10: ldc_w           2130903107
        //    13: aconst_null    
        //    14: iconst_0       
        //    15: invokestatic    com/whatsapp/alm.a:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //    18: checkcast       Landroid/view/ViewGroup;
        //    21: astore_1       
        //    22: aload_0        
        //    23: aload_1        
        //    24: ldc_w           2131755434
        //    27: invokevirtual   android/view/ViewGroup.findViewById:(I)Landroid/view/View;
        //    30: checkcast       Landroid/view/ViewGroup;
        //    33: putfield        com/whatsapp/Conversation.au:Landroid/view/ViewGroup;
        //    36: aload_0        
        //    37: getfield        com/whatsapp/Conversation.au:Landroid/view/ViewGroup;
        //    40: invokevirtual   android/view/ViewGroup.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
        //    43: new             Lcom/whatsapp/ly;
        //    46: dup            
        //    47: aload_0        
        //    48: invokespecial   com/whatsapp/ly.<init>:(Lcom/whatsapp/Conversation;)V
        //    51: invokevirtual   android/view/ViewTreeObserver.addOnGlobalLayoutListener:(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
        //    54: aload_0        
        //    55: aload_0        
        //    56: getfield        com/whatsapp/Conversation.au:Landroid/view/ViewGroup;
        //    59: ldc_w           2131755361
        //    62: invokevirtual   android/view/ViewGroup.findViewById:(I)Landroid/view/View;
        //    65: checkcast       Landroid/widget/TextView;
        //    68: putfield        com/whatsapp/Conversation.aD:Landroid/widget/TextView;
        //    71: aload_0        
        //    72: aload_0        
        //    73: getfield        com/whatsapp/Conversation.au:Landroid/view/ViewGroup;
        //    76: ldc_w           2131755435
        //    79: invokevirtual   android/view/ViewGroup.findViewById:(I)Landroid/view/View;
        //    82: putfield        com/whatsapp/Conversation.A:Landroid/view/View;
        //    85: aload_0        
        //    86: aload_0        
        //    87: getfield        com/whatsapp/Conversation.au:Landroid/view/ViewGroup;
        //    90: ldc_w           2131755362
        //    93: invokevirtual   android/view/ViewGroup.findViewById:(I)Landroid/view/View;
        //    96: checkcast       Landroid/widget/TextView;
        //    99: putfield        com/whatsapp/Conversation.C:Landroid/widget/TextView;
        //   102: aload_0        
        //   103: aload_0        
        //   104: getfield        com/whatsapp/Conversation.au:Landroid/view/ViewGroup;
        //   107: ldc_w           2131755436
        //   110: invokevirtual   android/view/ViewGroup.findViewById:(I)Landroid/view/View;
        //   113: checkcast       Landroid/widget/TextView;
        //   116: putfield        com/whatsapp/Conversation.be:Landroid/widget/TextView;
        //   119: aload_0        
        //   120: aload_1        
        //   121: ldc_w           2131755431
        //   124: invokevirtual   android/view/ViewGroup.findViewById:(I)Landroid/view/View;
        //   127: checkcast       Landroid/widget/ImageView;
        //   130: putfield        com/whatsapp/Conversation.T:Landroid/widget/ImageView;
        //   133: invokestatic    com/whatsapp/App.ak:()Z
        //   136: istore          5
        //   138: iload           5
        //   140: ifne            171
        //   143: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   146: istore          14
        //   148: iload           14
        //   150: bipush          11
        //   152: if_icmplt       171
        //   155: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   158: bipush          19
        //   160: if_icmpge       171
        //   163: aload_0        
        //   164: getfield        com/whatsapp/Conversation.au:Landroid/view/ViewGroup;
        //   167: aconst_null    
        //   168: invokevirtual   android/view/ViewGroup.setLayoutTransition:(Landroid/animation/LayoutTransition;)V
        //   171: aload_0        
        //   172: getfield        com/whatsapp/Conversation.au:Landroid/view/ViewGroup;
        //   175: iconst_1       
        //   176: invokevirtual   android/view/ViewGroup.setClickable:(Z)V
        //   179: aload_0        
        //   180: getfield        com/whatsapp/Conversation.aG:Z
        //   183: istore          9
        //   185: iload           9
        //   187: ifne            201
        //   190: aload_0        
        //   191: getfield        com/whatsapp/Conversation.S:Z
        //   194: istore          13
        //   196: iload           13
        //   198: ifeq            234
        //   201: aload_0        
        //   202: getfield        com/whatsapp/Conversation.C:Landroid/widget/TextView;
        //   205: astore          10
        //   207: aload_0        
        //   208: getfield        com/whatsapp/Conversation.aG:Z
        //   211: istore          11
        //   213: iload           11
        //   215: ifeq            310
        //   218: ldc_w           2131231837
        //   221: istore          12
        //   223: aload           10
        //   225: aload_0        
        //   226: iload           12
        //   228: invokevirtual   com/whatsapp/Conversation.getString:(I)Ljava/lang/String;
        //   231: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   234: aload_1        
        //   235: ldc_w           2131755429
        //   238: invokevirtual   android/view/ViewGroup.findViewById:(I)Landroid/view/View;
        //   241: new             Lcom/whatsapp/ky;
        //   244: dup            
        //   245: aload_0        
        //   246: invokespecial   com/whatsapp/ky.<init>:(Lcom/whatsapp/Conversation;)V
        //   249: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   252: aload_0        
        //   253: getfield        com/whatsapp/Conversation.au:Landroid/view/ViewGroup;
        //   256: new             Lcom/whatsapp/w7;
        //   259: dup            
        //   260: aload_0        
        //   261: invokespecial   com/whatsapp/w7.<init>:(Lcom/whatsapp/Conversation;)V
        //   264: invokevirtual   android/view/ViewGroup.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   267: aload_0        
        //   268: invokevirtual   com/whatsapp/Conversation.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //   271: iconst_1       
        //   272: invokevirtual   android/support/v7/app/ActionBar.setDisplayShowCustomEnabled:(Z)V
        //   275: aload_0        
        //   276: invokevirtual   com/whatsapp/Conversation.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //   279: aload_1        
        //   280: invokevirtual   android/support/v7/app/ActionBar.setCustomView:(Landroid/view/View;)V
        //   283: return         
        //   284: astore_2       
        //   285: aload_2        
        //   286: athrow         
        //   287: astore_3       
        //   288: aload_3        
        //   289: athrow         
        //   290: astore          4
        //   292: aload           4
        //   294: athrow         
        //   295: astore          6
        //   297: aload           6
        //   299: athrow         
        //   300: astore          7
        //   302: aload           7
        //   304: athrow         
        //   305: astore          8
        //   307: aload           8
        //   309: athrow         
        //   310: ldc_w           2131231838
        //   313: istore          12
        //   315: goto            223
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  22     138    284    287    Landroid/content/ActivityNotFoundException;
        //  143    148    287    290    Landroid/content/ActivityNotFoundException;
        //  155    171    290    295    Landroid/content/ActivityNotFoundException;
        //  171    185    295    300    Landroid/content/ActivityNotFoundException;
        //  190    196    300    305    Landroid/content/ActivityNotFoundException;
        //  201    213    305    310    Landroid/content/ActivityNotFoundException;
        //  285    287    287    290    Landroid/content/ActivityNotFoundException;
        //  288    290    290    295    Landroid/content/ActivityNotFoundException;
        //  297    300    300    305    Landroid/content/ActivityNotFoundException;
        //  302    305    305    310    Landroid/content/ActivityNotFoundException;
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
    
    private void H() {
        try {
            if (this.Z.isShowing()) {
                this.Z.dismiss();
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    static boolean H(final Conversation conversation) {
        return conversation.S;
    }
    
    static View I(final Conversation conversation) {
        return conversation.aP;
    }
    
    private void I() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_1       
        //     2: getstatic       com/whatsapp/App.I:Z
        //     5: istore_2       
        //     6: aload_0        
        //     7: aload_0        
        //     8: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //    11: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    14: invokestatic    com/whatsapp/z8.a:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //    17: putfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //    20: aload_0        
        //    21: getfield        com/whatsapp/Conversation.aD:Landroid/widget/TextView;
        //    24: aload_0        
        //    25: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //    28: aload_0        
        //    29: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //    32: aload_0        
        //    33: invokevirtual   com/whatsapp/Conversation.getBaseContext:()Landroid/content/Context;
        //    36: aload_0        
        //    37: getfield        com/whatsapp/Conversation.aD:Landroid/widget/TextView;
        //    40: invokevirtual   android/widget/TextView.getPaint:()Landroid/text/TextPaint;
        //    43: invokestatic    com/whatsapp/util/cq.b:(Ljava/lang/String;Landroid/content/Context;Landroid/graphics/Paint;)Ljava/lang/CharSequence;
        //    46: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    49: aload_0        
        //    50: getfield        com/whatsapp/Conversation.bk:Lcom/whatsapp/ahz;
        //    53: astore          4
        //    55: aload           4
        //    57: ifnonnull       349
        //    60: aload_0        
        //    61: getfield        com/whatsapp/Conversation.bk:Lcom/whatsapp/ahz;
        //    64: ifnull          79
        //    67: aload_0        
        //    68: getfield        com/whatsapp/Conversation.bk:Lcom/whatsapp/ahz;
        //    71: invokevirtual   com/whatsapp/ahz.a:()V
        //    74: aload_0        
        //    75: aconst_null    
        //    76: putfield        com/whatsapp/Conversation.bk:Lcom/whatsapp/ahz;
        //    79: aload_0        
        //    80: invokespecial   com/whatsapp/Conversation.A:()V
        //    83: aload_0        
        //    84: getfield        com/whatsapp/Conversation.aG:Z
        //    87: istore          11
        //    89: iload           11
        //    91: ifne            105
        //    94: aload_0        
        //    95: getfield        com/whatsapp/Conversation.S:Z
        //    98: istore          28
        //   100: iload           28
        //   102: ifeq            141
        //   105: aload_0        
        //   106: new             Lcom/whatsapp/ahz;
        //   109: dup            
        //   110: aload_0        
        //   111: aload_0        
        //   112: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   115: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   118: iload_1        
        //   119: invokespecial   com/whatsapp/ahz.<init>:(Lcom/whatsapp/Conversation;Ljava/lang/String;Z)V
        //   122: putfield        com/whatsapp/Conversation.bk:Lcom/whatsapp/ahz;
        //   125: aload_0        
        //   126: getfield        com/whatsapp/Conversation.bk:Lcom/whatsapp/ahz;
        //   129: iconst_0       
        //   130: anewarray       Ljava/lang/Void;
        //   133: invokestatic    com/whatsapp/a8s.a:(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;
        //   136: pop            
        //   137: iload_2        
        //   138: ifeq            210
        //   141: aload_0        
        //   142: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   145: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //   148: astore          24
        //   150: aload           24
        //   152: ifnull          210
        //   155: aload_0        
        //   156: getfield        com/whatsapp/Conversation.aa:Landroid/view/View;
        //   159: ifnull          179
        //   162: aload_0        
        //   163: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //   166: aload_0        
        //   167: getfield        com/whatsapp/Conversation.aa:Landroid/view/View;
        //   170: invokevirtual   android/widget/ListView.removeHeaderView:(Landroid/view/View;)Z
        //   173: pop            
        //   174: aload_0        
        //   175: aconst_null    
        //   176: putfield        com/whatsapp/Conversation.aa:Landroid/view/View;
        //   179: aload_0        
        //   180: getfield        com/whatsapp/Conversation.aF:Landroid/view/View;
        //   183: ifnull          203
        //   186: aload_0        
        //   187: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //   190: aload_0        
        //   191: getfield        com/whatsapp/Conversation.aF:Landroid/view/View;
        //   194: invokevirtual   android/widget/ListView.removeFooterView:(Landroid/view/View;)Z
        //   197: pop            
        //   198: aload_0        
        //   199: aconst_null    
        //   200: putfield        com/whatsapp/Conversation.aF:Landroid/view/View;
        //   203: aload_0        
        //   204: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //   207: invokevirtual   com/whatsapp/nm.notifyDataSetChanged:()V
        //   210: aload_0        
        //   211: getfield        com/whatsapp/Conversation.aG:Z
        //   214: istore          18
        //   216: iload           18
        //   218: ifeq            287
        //   221: aload_0        
        //   222: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   225: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   228: invokestatic    com/whatsapp/adc.f:(Ljava/lang/String;)Z
        //   231: istore          21
        //   233: iload           21
        //   235: ifne            287
        //   238: aload_0        
        //   239: ldc_w           2131755441
        //   242: invokevirtual   com/whatsapp/Conversation.findViewById:(I)Landroid/view/View;
        //   245: bipush          8
        //   247: invokevirtual   android/view/View.setVisibility:(I)V
        //   250: aload_0        
        //   251: ldc_w           2131755440
        //   254: invokevirtual   com/whatsapp/Conversation.findViewById:(I)Landroid/view/View;
        //   257: iconst_0       
        //   258: invokevirtual   android/view/View.setVisibility:(I)V
        //   261: aload_0        
        //   262: getfield        com/whatsapp/Conversation.a0:Landroid/view/MenuItem;
        //   265: astore          22
        //   267: aload           22
        //   269: ifnull          328
        //   272: aload_0        
        //   273: getfield        com/whatsapp/Conversation.a0:Landroid/view/MenuItem;
        //   276: iconst_0       
        //   277: invokeinterface android/view/MenuItem.setVisible:(Z)Landroid/view/MenuItem;
        //   282: pop            
        //   283: iload_2        
        //   284: ifeq            328
        //   287: aload_0        
        //   288: ldc_w           2131755441
        //   291: invokevirtual   com/whatsapp/Conversation.findViewById:(I)Landroid/view/View;
        //   294: iconst_0       
        //   295: invokevirtual   android/view/View.setVisibility:(I)V
        //   298: aload_0        
        //   299: ldc_w           2131755440
        //   302: invokevirtual   com/whatsapp/Conversation.findViewById:(I)Landroid/view/View;
        //   305: bipush          8
        //   307: invokevirtual   android/view/View.setVisibility:(I)V
        //   310: aload_0        
        //   311: getfield        com/whatsapp/Conversation.a0:Landroid/view/MenuItem;
        //   314: ifnull          328
        //   317: aload_0        
        //   318: getfield        com/whatsapp/Conversation.a0:Landroid/view/MenuItem;
        //   321: iconst_1       
        //   322: invokeinterface android/view/MenuItem.setVisible:(Z)Landroid/view/MenuItem;
        //   327: pop            
        //   328: new             Lcom/whatsapp/wd;
        //   331: dup            
        //   332: aload_0        
        //   333: aconst_null    
        //   334: invokespecial   com/whatsapp/wd.<init>:(Lcom/whatsapp/Conversation;Lcom/whatsapp/st;)V
        //   337: iconst_0       
        //   338: anewarray       Ljava/lang/Void;
        //   341: invokestatic    com/whatsapp/a8s.a:(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;
        //   344: pop            
        //   345: return         
        //   346: astore_3       
        //   347: aload_3        
        //   348: athrow         
        //   349: iconst_0       
        //   350: istore_1       
        //   351: goto            60
        //   354: astore          5
        //   356: aload           5
        //   358: athrow         
        //   359: astore          6
        //   361: aload           6
        //   363: athrow         
        //   364: astore          7
        //   366: aload           7
        //   368: athrow         
        //   369: astore          8
        //   371: aload           8
        //   373: athrow         
        //   374: astore          9
        //   376: aload           9
        //   378: athrow         
        //   379: astore          10
        //   381: aload           10
        //   383: athrow         
        //   384: astore          25
        //   386: aload           25
        //   388: athrow         
        //   389: astore          13
        //   391: aload           13
        //   393: athrow         
        //   394: astore          14
        //   396: aload           14
        //   398: athrow         
        //   399: astore          15
        //   401: aload           15
        //   403: athrow         
        //   404: astore          16
        //   406: aload           16
        //   408: athrow         
        //   409: astore          17
        //   411: aload           17
        //   413: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  6      55     346    349    Landroid/content/ActivityNotFoundException;
        //  60     79     354    359    Landroid/content/ActivityNotFoundException;
        //  79     89     359    364    Landroid/content/ActivityNotFoundException;
        //  94     100    364    369    Landroid/content/ActivityNotFoundException;
        //  105    137    369    374    Landroid/content/ActivityNotFoundException;
        //  141    150    374    379    Landroid/content/ActivityNotFoundException;
        //  155    179    379    384    Landroid/content/ActivityNotFoundException;
        //  179    203    384    389    Landroid/content/ActivityNotFoundException;
        //  210    216    389    394    Landroid/content/ActivityNotFoundException;
        //  221    233    394    399    Landroid/content/ActivityNotFoundException;
        //  238    267    399    404    Landroid/content/ActivityNotFoundException;
        //  272    283    404    409    Landroid/content/ActivityNotFoundException;
        //  287    328    409    414    Landroid/content/ActivityNotFoundException;
        //  361    364    364    369    Landroid/content/ActivityNotFoundException;
        //  366    369    369    374    Landroid/content/ActivityNotFoundException;
        //  371    374    374    379    Landroid/content/ActivityNotFoundException;
        //  376    379    379    384    Landroid/content/ActivityNotFoundException;
        //  391    394    394    399    Landroid/content/ActivityNotFoundException;
        //  396    399    399    404    Landroid/content/ActivityNotFoundException;
        //  401    404    404    409    Landroid/content/ActivityNotFoundException;
        //  406    409    409    414    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 204, Size: 204
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
    
    static vc J(final Conversation conversation) {
        return conversation.a5;
    }
    
    private boolean J() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //     4: invokevirtual   com/whatsapp/nm.getCursor:()Landroid/database/Cursor;
        //     7: astore_1       
        //     8: aload_1        
        //     9: ifnull          80
        //    12: aload_1        
        //    13: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    18: istore_3       
        //    19: iload_3        
        //    20: ifeq            80
        //    23: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //    26: aload_1        
        //    27: aload_0        
        //    28: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //    31: invokevirtual   com/whatsapp/vy.a:(Landroid/database/Cursor;Ljava/lang/String;)Lcom/whatsapp/protocol/bi;
        //    34: astore          4
        //    36: aload           4
        //    38: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    41: getfield        com/whatsapp/protocol/c6.b:Z
        //    44: ifeq            61
        //    47: aload           4
        //    49: getfield        com/whatsapp/protocol/bi.c:I
        //    52: istore          6
        //    54: iload           6
        //    56: bipush          6
        //    58: if_icmpeq       71
        //    61: iconst_0       
        //    62: ireturn        
        //    63: astore_2       
        //    64: aload_2        
        //    65: athrow         
        //    66: astore          5
        //    68: aload           5
        //    70: athrow         
        //    71: aload_1        
        //    72: invokeinterface android/database/Cursor.moveToNext:()Z
        //    77: ifne            23
        //    80: iconst_1       
        //    81: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  12     19     63     66     Landroid/content/ActivityNotFoundException;
        //  47     54     66     71     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0061:
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
    
    static ImageButton K(final Conversation conversation) {
        return conversation.ab;
    }
    
    static ImageView L(final Conversation conversation) {
        return conversation.T;
    }
    
    static void M(final Conversation conversation) {
        conversation.n();
    }
    
    static void N(final Conversation conversation) {
        conversation.C();
    }
    
    static ImageButton O(final Conversation conversation) {
        return conversation.a6;
    }
    
    static boolean P(final Conversation conversation) {
        return conversation.bj;
    }
    
    static View Q(final Conversation conversation) {
        return conversation.aF;
    }
    
    static HashMap R(final Conversation conversation) {
        return conversation.ag;
    }
    
    static ActionMode S(final Conversation conversation) {
        return conversation.aM;
    }
    
    static String T(final Conversation conversation) {
        return conversation.a8;
    }
    
    static TextView U(final Conversation conversation) {
        return conversation.C;
    }
    
    static boolean V(final Conversation conversation) {
        return conversation.a1;
    }
    
    static void W(final Conversation conversation) {
        conversation.A();
    }
    
    static void X(final Conversation conversation) {
        conversation.E();
    }
    
    static int Y(final Conversation conversation) {
        return conversation.ba;
    }
    
    static boolean Z(final Conversation conversation) {
        return conversation.aH;
    }
    
    static int a(final Conversation conversation, final int q) {
        return conversation.q = q;
    }
    
    public static Intent a(final Context context, final a_9 a_9) {
        return new Intent((String)null, a_9.h(), context, (Class)Conversation.class).addFlags(335544320);
    }
    
    public static Intent a(final a_9 a_9) {
        return new Intent(App.aq.getApplicationContext(), (Class)Conversation.class).putExtra(Conversation.cb[218], a_9.u).addFlags(335544320);
    }
    
    static ActionMode a(final Conversation conversation, final ActionMode am) {
        return conversation.aM = am;
    }
    
    private MenuItem a(final Menu menu, final int n, final int n2) {
        return menu.add(0, n, 0, n2);
    }
    
    private MenuItem a(final Menu menu, final int n, final int n2, final int icon) {
        final MenuItem add = menu.add(0, n, 0, n2);
        add.setIcon(icon);
        return add;
    }
    
    static MenuItem a(final Conversation conversation, final Menu menu, final int n, final int n2, final int n3) {
        return conversation.a(menu, n, n2, n3);
    }
    
    static View a(final Conversation conversation, final View an) {
        return conversation.aN = an;
    }
    
    public static ConversationRow a(final Context p0, final bi p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: getfield        com/whatsapp/protocol/bi.I:B
        //     4: istore          4
        //     6: iload           4
        //     8: tableswitch {
        //                0: 94
        //                1: 170
        //                2: 133
        //                3: 180
        //                4: 200
        //                5: 190
        //                6: 60
        //                7: 60
        //                8: 210
        //          default: 60
        //        }
        //    60: aload_1        
        //    61: getfield        com/whatsapp/protocol/bi.c:I
        //    64: istore          10
        //    66: iload           10
        //    68: iconst_m1      
        //    69: if_icmpne       230
        //    72: aload_1        
        //    73: getfield        com/whatsapp/protocol/bi.I:B
        //    76: iconst_m1      
        //    77: if_icmpne       230
        //    80: new             Lcom/whatsapp/ConversationRowDivider;
        //    83: dup            
        //    84: aload_0        
        //    85: aload_1        
        //    86: invokespecial   com/whatsapp/ConversationRowDivider.<init>:(Landroid/content/Context;Lcom/whatsapp/protocol/bi;)V
        //    89: astore          11
        //    91: aload           11
        //    93: areturn        
        //    94: aload_1        
        //    95: getfield        com/whatsapp/protocol/bi.c:I
        //    98: bipush          6
        //   100: if_icmpne       123
        //   103: new             Lcom/whatsapp/ConversationRowDivider;
        //   106: dup            
        //   107: aload_0        
        //   108: aload_1        
        //   109: invokespecial   com/whatsapp/ConversationRowDivider.<init>:(Landroid/content/Context;Lcom/whatsapp/protocol/bi;)V
        //   112: astore          7
        //   114: aload           7
        //   116: areturn        
        //   117: astore_3       
        //   118: aload_3        
        //   119: athrow         
        //   120: astore_2       
        //   121: aload_2        
        //   122: athrow         
        //   123: new             Lcom/whatsapp/ConversationRowText;
        //   126: dup            
        //   127: aload_0        
        //   128: aload_1        
        //   129: invokespecial   com/whatsapp/ConversationRowText.<init>:(Landroid/content/Context;Lcom/whatsapp/protocol/bi;)V
        //   132: areturn        
        //   133: aload_1        
        //   134: getfield        com/whatsapp/protocol/bi.E:I
        //   137: iconst_1       
        //   138: if_icmpne       160
        //   141: new             Lcom/whatsapp/ConversationRowVoiceNote;
        //   144: dup            
        //   145: aload_0        
        //   146: aload_1        
        //   147: invokespecial   com/whatsapp/ConversationRowVoiceNote.<init>:(Landroid/content/Context;Lcom/whatsapp/protocol/bi;)V
        //   150: astore          6
        //   152: aload           6
        //   154: areturn        
        //   155: astore          5
        //   157: aload           5
        //   159: athrow         
        //   160: new             Lcom/whatsapp/ConversationRowAudio;
        //   163: dup            
        //   164: aload_0        
        //   165: aload_1        
        //   166: invokespecial   com/whatsapp/ConversationRowAudio.<init>:(Landroid/content/Context;Lcom/whatsapp/protocol/bi;)V
        //   169: areturn        
        //   170: new             Lcom/whatsapp/ConversationRowImage;
        //   173: dup            
        //   174: aload_0        
        //   175: aload_1        
        //   176: invokespecial   com/whatsapp/ConversationRowImage.<init>:(Landroid/content/Context;Lcom/whatsapp/protocol/bi;)V
        //   179: areturn        
        //   180: new             Lcom/whatsapp/ConversationRowVideo;
        //   183: dup            
        //   184: aload_0        
        //   185: aload_1        
        //   186: invokespecial   com/whatsapp/ConversationRowVideo.<init>:(Landroid/content/Context;Lcom/whatsapp/protocol/bi;)V
        //   189: areturn        
        //   190: new             Lcom/whatsapp/ConversationRowLocation;
        //   193: dup            
        //   194: aload_0        
        //   195: aload_1        
        //   196: invokespecial   com/whatsapp/ConversationRowLocation.<init>:(Landroid/content/Context;Lcom/whatsapp/protocol/bi;)V
        //   199: areturn        
        //   200: new             Lcom/whatsapp/ConversationRowContact;
        //   203: dup            
        //   204: aload_0        
        //   205: aload_1        
        //   206: invokespecial   com/whatsapp/ConversationRowContact.<init>:(Landroid/content/Context;Lcom/whatsapp/protocol/bi;)V
        //   209: areturn        
        //   210: new             Lcom/whatsapp/ConversationRowCall;
        //   213: dup            
        //   214: aload_0        
        //   215: aload_1        
        //   216: invokespecial   com/whatsapp/ConversationRowCall.<init>:(Landroid/content/Context;Lcom/whatsapp/protocol/bi;)V
        //   219: areturn        
        //   220: astore          8
        //   222: aload           8
        //   224: athrow         
        //   225: astore          9
        //   227: aload           9
        //   229: athrow         
        //   230: aconst_null    
        //   231: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      6      120    123    Landroid/content/ActivityNotFoundException;
        //  60     66     220    225    Landroid/content/ActivityNotFoundException;
        //  72     91     225    230    Landroid/content/ActivityNotFoundException;
        //  94     114    117    120    Landroid/content/ActivityNotFoundException;
        //  121    123    117    120    Landroid/content/ActivityNotFoundException;
        //  133    152    155    160    Landroid/content/ActivityNotFoundException;
        //  222    225    225    230    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 106, Size: 106
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
    
    static aoq a(final Conversation conversation, final aoq bb) {
        return conversation.bb = bb;
    }
    
    static String a(final Conversation conversation, final String t) {
        return conversation.t = t;
    }
    
    static ArrayList a(final Conversation conversation, final ArrayList u) {
        return conversation.U = u;
    }
    
    static void a(final Activity activity, final gu gu, final a_9 a_9, final boolean b) {
        gu.a(2131231592, 2131231591);
        bm.a(new pe(a_9, b, new Handler(), gu, activity));
    }
    
    private void a(final Cursor aa) {
        Log.b(aa != null);
        this.aA = aa;
    }
    
    private void a(final Drawable drawable) {
        Label_0026: {
            if (drawable == null) {
                break Label_0026;
            }
            try {
                this.y.setDrawable(drawable);
                this.aX.setBackgroundResource(0);
                if (App.I) {
                    this.y.a();
                    this.aX.setBackgroundResource(2131623981);
                }
            }
            catch (ActivityNotFoundException ex) {
                throw ex;
            }
        }
    }
    
    private void a(final Uri uri) {
        final boolean i = App.I;
        Label_0157: {
            if (uri == null) {
                break Label_0157;
            }
            final Intent intent = new Intent((Context)this, (Class)ImagePreview.class);
            String s = null;
            Label_0092: {
                if (this.s.m()) {
                    s = this.getString(2131231158, new Object[] { this.s.a((Context)this) });
                    if (!i) {
                        break Label_0092;
                    }
                }
                s = this.getString(2131231643, new Object[] { this.s.a((Context)this) });
            }
            intent.putExtra(Conversation.cb[60], s);
            intent.putExtra(Conversation.cb[62], 0);
            final ArrayList<Uri> list = new ArrayList<Uri>();
            try {
                list.add(uri);
                intent.putExtra(Conversation.cb[63], (Serializable)list);
                this.startActivityForResult(intent, 22);
                if (i) {
                    Log.e(Conversation.cb[61]);
                    App.a(this.getBaseContext(), 2131231735, 0);
                }
            }
            catch (ActivityNotFoundException ex) {
                throw ex;
            }
        }
    }
    
    private void a(final Uri p0, final int p1, final int p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          5
        //     5: aload_0        
        //     6: getfield        com/whatsapp/Conversation.az:Z
        //     9: istore          7
        //    11: iload           7
        //    13: ifeq            53
        //    16: aload_1        
        //    17: ifnonnull       37
        //    20: aload_0        
        //    21: iconst_1       
        //    22: iload_2        
        //    23: aconst_null    
        //    24: iload_3        
        //    25: iload           4
        //    27: invokestatic    com/whatsapp/wallpaper/h.a:(Landroid/content/Context;ZILandroid/net/Uri;II)Landroid/graphics/drawable/Drawable;
        //    30: astore          9
        //    32: iload           5
        //    34: ifeq            103
        //    37: aload_0        
        //    38: iconst_0       
        //    39: iconst_m1      
        //    40: aload_1        
        //    41: iconst_0       
        //    42: iconst_0       
        //    43: invokestatic    com/whatsapp/wallpaper/h.a:(Landroid/content/Context;ZILandroid/net/Uri;II)Landroid/graphics/drawable/Drawable;
        //    46: astore          9
        //    48: iload           5
        //    50: ifeq            103
        //    53: aload_1        
        //    54: ifnonnull       76
        //    57: aload_0        
        //    58: aload_0        
        //    59: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //    62: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    65: iconst_1       
        //    66: iload_2        
        //    67: aconst_null    
        //    68: invokestatic    com/whatsapp/wallpaper/h.a:(Landroid/content/Context;Ljava/lang/String;ZILandroid/net/Uri;)V
        //    71: iload           5
        //    73: ifeq            90
        //    76: aload_0        
        //    77: aload_0        
        //    78: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //    81: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    84: iconst_0       
        //    85: iconst_0       
        //    86: aload_1        
        //    87: invokestatic    com/whatsapp/wallpaper/h.a:(Landroid/content/Context;Ljava/lang/String;ZILandroid/net/Uri;)V
        //    90: aload_0        
        //    91: aload_0        
        //    92: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //    95: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    98: invokestatic    com/whatsapp/wallpaper/h.a:(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
        //   101: astore          9
        //   103: aload_0        
        //   104: aload           9
        //   106: invokespecial   com/whatsapp/Conversation.a:(Landroid/graphics/drawable/Drawable;)V
        //   109: aload_0        
        //   110: aload_1        
        //   111: invokestatic    com/whatsapp/util/br.a:(Landroid/content/Context;Landroid/net/Uri;)V
        //   114: return         
        //   115: astore          6
        //   117: aload           6
        //   119: athrow         
        //   120: astore          8
        //   122: aload           8
        //   124: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  5      11     115    120    Landroid/content/ActivityNotFoundException;
        //  57     71     120    125    Landroid/content/ActivityNotFoundException;
        //  76     90     120    125    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0076:
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
    
    static void a(final Conversation conversation) {
        conversation.o();
    }
    
    static void a(final Conversation conversation, final Cursor cursor) {
        conversation.a(cursor);
    }
    
    static void a(final Conversation conversation, final bi bi) {
        conversation.f(bi);
    }
    
    static void a(final Conversation conversation, final String s, final boolean b) {
        conversation.a(s, b);
    }
    
    private void a(final String s, final int n) {
        final Intent intent = new Intent(Conversation.cb[225]);
        try {
            intent.setType(Conversation.cb[224]);
            switch (n) {
                case 102: {
                    intent.putExtra(Conversation.cb[223], s);
                    break;
                }
            }
            intent.setFlags(524288);
            this.startActivity(intent);
            Conversation.a_ = false;
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    private void a(final String p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_3       
        //     4: new             Landroid/content/Intent;
        //     7: dup            
        //     8: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    11: bipush          75
        //    13: aaload         
        //    14: getstatic       android/provider/ContactsContract$Contacts.CONTENT_URI:Landroid/net/Uri;
        //    17: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;Landroid/net/Uri;)V
        //    20: astore          4
        //    22: aload           4
        //    24: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    27: bipush          74
        //    29: aaload         
        //    30: aload_1        
        //    31: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //    34: pop            
        //    35: aload           4
        //    37: aload           4
        //    39: aload_0        
        //    40: invokevirtual   com/whatsapp/Conversation.getPackageManager:()Landroid/content/pm/PackageManager;
        //    43: invokevirtual   android/content/Intent.resolveActivity:(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;
        //    46: invokevirtual   android/content/Intent.setComponent:(Landroid/content/ComponentName;)Landroid/content/Intent;
        //    49: pop            
        //    50: aload           4
        //    52: invokevirtual   android/content/Intent.getComponent:()Landroid/content/ComponentName;
        //    55: astore          10
        //    57: aload           10
        //    59: ifnull          99
        //    62: iload_2        
        //    63: ifeq            78
        //    66: aload_0        
        //    67: aload           4
        //    69: bipush          11
        //    71: invokevirtual   com/whatsapp/Conversation.startActivityForResult:(Landroid/content/Intent;I)V
        //    74: iload_3        
        //    75: ifeq            91
        //    78: aload_0        
        //    79: aload_1        
        //    80: putfield        com/whatsapp/Conversation.J:Ljava/lang/String;
        //    83: aload_0        
        //    84: aload           4
        //    86: bipush          10
        //    88: invokevirtual   com/whatsapp/Conversation.startActivityForResult:(Landroid/content/Intent;I)V
        //    91: iconst_0       
        //    92: putstatic       com/whatsapp/Conversation.a_:Z
        //    95: iload_3        
        //    96: ifeq            111
        //    99: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   102: bipush          76
        //   104: aaload         
        //   105: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   108: invokestatic    com/whatsapp/App.N:()V
        //   111: return         
        //   112: astore          5
        //   114: aload           5
        //   116: athrow         
        //   117: astore          6
        //   119: aload           6
        //   121: athrow         
        //   122: astore          7
        //   124: aload           7
        //   126: athrow         
        //   127: astore          11
        //   129: aload           11
        //   131: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  22     57     112    122    Landroid/content/ActivityNotFoundException;
        //  66     74     122    127    Landroid/content/ActivityNotFoundException;
        //  78     91     122    127    Landroid/content/ActivityNotFoundException;
        //  91     95     127    132    Landroid/content/ActivityNotFoundException;
        //  99     111    127    132    Landroid/content/ActivityNotFoundException;
        //  114    117    117    122    Landroid/content/ActivityNotFoundException;
        //  119    122    122    127    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 66, Size: 66
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
    
    private void a(final ArrayList p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_1        
        //     5: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //     8: astore          12
        //    10: aload           12
        //    12: invokeinterface java/util/Iterator.hasNext:()Z
        //    17: ifeq            45
        //    20: aload           12
        //    22: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    27: checkcast       Landroid/net/Uri;
        //    30: astore          13
        //    32: aload_0        
        //    33: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //    36: aload           13
        //    38: invokestatic    com/whatsapp/util/br.a:(Ljava/lang/String;Landroid/net/Uri;)V
        //    41: iload_2        
        //    42: ifeq            10
        //    45: return         
        //    46: astore          6
        //    48: new             Ljava/lang/StringBuilder;
        //    51: dup            
        //    52: invokespecial   java/lang/StringBuilder.<init>:()V
        //    55: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    58: iconst_2       
        //    59: aaload         
        //    60: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    63: aload           6
        //    65: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //    68: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    71: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    74: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    77: aload           6
        //    79: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //    82: astore          10
        //    84: aload           10
        //    86: ifnull          123
        //    89: aload           6
        //    91: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //    94: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    97: iconst_4       
        //    98: aaload         
        //    99: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   102: istore          11
        //   104: iload           11
        //   106: ifeq            123
        //   109: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   112: ldc_w           2131231078
        //   115: iconst_0       
        //   116: invokestatic    com/whatsapp/App.b:(Landroid/content/Context;II)V
        //   119: iload_2        
        //   120: ifeq            45
        //   123: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   126: ldc_w           2131231735
        //   129: iconst_0       
        //   130: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   133: return         
        //   134: astore          9
        //   136: aload           9
        //   138: athrow         
        //   139: astore          7
        //   141: aload           7
        //   143: athrow         
        //   144: astore          8
        //   146: aload           8
        //   148: athrow         
        //   149: astore          5
        //   151: new             Ljava/lang/StringBuilder;
        //   154: dup            
        //   155: invokespecial   java/lang/StringBuilder.<init>:()V
        //   158: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   161: iconst_3       
        //   162: aaload         
        //   163: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   166: aload           5
        //   168: invokevirtual   com/whatsapp/util/av.toString:()Ljava/lang/String;
        //   171: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   174: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   177: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   180: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   183: ldc_w           2131231071
        //   186: iconst_0       
        //   187: invokestatic    com/whatsapp/App.b:(Landroid/content/Context;II)V
        //   190: return         
        //   191: astore          4
        //   193: new             Ljava/lang/StringBuilder;
        //   196: dup            
        //   197: invokespecial   java/lang/StringBuilder.<init>:()V
        //   200: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   203: iconst_1       
        //   204: aaload         
        //   205: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   208: aload           4
        //   210: invokevirtual   java/lang/OutOfMemoryError.toString:()Ljava/lang/String;
        //   213: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   216: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   219: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   222: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   225: ldc_w           2131231082
        //   228: iconst_0       
        //   229: invokestatic    com/whatsapp/App.b:(Landroid/content/Context;II)V
        //   232: return         
        //   233: astore_3       
        //   234: new             Ljava/lang/StringBuilder;
        //   237: dup            
        //   238: invokespecial   java/lang/StringBuilder.<init>:()V
        //   241: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   244: iconst_0       
        //   245: aaload         
        //   246: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   249: aload_3        
        //   250: invokevirtual   java/lang/SecurityException.toString:()Ljava/lang/String;
        //   253: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   256: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   259: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   262: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   265: ldc_w           2131231412
        //   268: iconst_0       
        //   269: invokestatic    com/whatsapp/App.b:(Landroid/content/Context;II)V
        //   272: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  4      10     46     149    Ljava/io/IOException;
        //  4      10     149    191    Lcom/whatsapp/util/av;
        //  4      10     191    233    Ljava/lang/OutOfMemoryError;
        //  4      10     233    273    Ljava/lang/SecurityException;
        //  10     41     46     149    Ljava/io/IOException;
        //  10     41     149    191    Lcom/whatsapp/util/av;
        //  10     41     191    233    Ljava/lang/OutOfMemoryError;
        //  10     41     233    273    Ljava/lang/SecurityException;
        //  48     84     139    144    Ljava/io/IOException;
        //  89     104    144    149    Ljava/io/IOException;
        //  109    119    134    139    Ljava/io/IOException;
        //  123    133    134    139    Ljava/io/IOException;
        //  141    144    144    149    Ljava/io/IOException;
        //  146    149    134    139    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0123:
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
    
    private boolean a(final int n, final String s, final int n2) {
        boolean b = true;
        final boolean i = App.I;
        Label_0089: {
            switch (n) {
                default: {
                    b = false;
                    break;
                }
                case 12: {
                    while (true) {
                        switch (n2) {
                            default: {
                                return b;
                            }
                            case 101: {
                                try {
                                    this.a(s, false);
                                    if (i) {
                                        this.b(s, 102);
                                        return b;
                                    }
                                    break Label_0089;
                                }
                                catch (ActivityNotFoundException ex) {
                                    throw ex;
                                }
                                break Label_0089;
                            }
                            case 102: {
                                continue;
                            }
                        }
                        break;
                    }
                    break;
                }
                case 13: {
                    while (true) {
                        switch (n2) {
                            default: {
                                return b;
                            }
                            case 101: {
                                try {
                                    this.b(s, false);
                                    if (i) {
                                        this.a(s, 102);
                                        return b;
                                    }
                                    break Label_0089;
                                }
                                catch (ActivityNotFoundException ex2) {
                                    throw ex2;
                                }
                                break;
                            }
                            case 102: {
                                continue;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
        return b;
    }
    
    static boolean a(final Conversation conversation, final int n, final String s, final int n2) {
        return conversation.a(n, s, n2);
    }
    
    static boolean a(final Conversation conversation, final boolean aj) {
        return conversation.aj = aj;
    }
    
    private boolean a(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_0        
        //     2: iload_1        
        //     3: invokestatic    com/whatsapp/ade.a:(Landroid/app/Activity;Z)Ljava/lang/String;
        //     6: putfield        com/whatsapp/Conversation.N:Ljava/lang/String;
        //     9: aload_0        
        //    10: getfield        com/whatsapp/Conversation.N:Ljava/lang/String;
        //    13: ifnull          22
        //    16: aload_0        
        //    17: bipush          116
        //    19: invokevirtual   com/whatsapp/Conversation.showDialog:(I)V
        //    22: aload_0        
        //    23: getfield        com/whatsapp/Conversation.N:Ljava/lang/String;
        //    26: astore          4
        //    28: aload           4
        //    30: ifnull          41
        //    33: iconst_1       
        //    34: ireturn        
        //    35: astore_2       
        //    36: aload_2        
        //    37: athrow         
        //    38: astore_3       
        //    39: aload_3        
        //    40: athrow         
        //    41: iconst_0       
        //    42: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      22     35     38     Landroid/content/ActivityNotFoundException;
        //  22     28     38     41     Landroid/content/ActivityNotFoundException;
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
    
    static void aa(final Conversation conversation) {
        conversation.I();
    }
    
    static boolean ab(final Conversation conversation) {
        return conversation.k();
    }
    
    static boolean ac(final Conversation conversation) {
        return conversation.at;
    }
    
    static View ad(final Conversation conversation) {
        return conversation.aO;
    }
    
    static void ae(final Conversation conversation) {
        conversation.r();
    }
    
    static ImageButton af(final Conversation conversation) {
        return conversation.E;
    }
    
    static void ag(final Conversation conversation) {
        conversation.q();
    }
    
    private static void ah(final Conversation conversation) {
        final v1 v1 = Conversation.ac.get();
        try {
            if (com.whatsapp.v1.a(v1) == conversation) {
                Conversation.ac.compareAndSet(v1, new v1(conversation, false));
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    static String ai(final Conversation conversation) {
        return conversation.t;
    }
    
    static boolean aj(final Conversation conversation) {
        return conversation.aj;
    }
    
    static void ak(final Conversation conversation) {
        conversation.u();
    }
    
    static ActionMode al(final Conversation conversation) {
        return conversation.z;
    }
    
    static String am(final Conversation conversation) {
        return conversation.bd;
    }
    
    static int b(final Conversation conversation, final int av) {
        return conversation.av = av;
    }
    
    static ActionMode b(final Conversation conversation, final ActionMode z) {
        return conversation.z = z;
    }
    
    private SubMenu b(final Menu menu, final int n, final int n2) {
        final SubMenu addSubMenu = menu.addSubMenu(0, n, 0, n2);
        addSubMenu.clearHeader();
        return addSubMenu;
    }
    
    public static Animation b(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Landroid/view/animation/AnimationSet;
        //     3: dup            
        //     4: iconst_1       
        //     5: invokespecial   android/view/animation/AnimationSet.<init>:(Z)V
        //     8: astore_1       
        //     9: iload_0        
        //    10: ifeq            100
        //    13: new             Landroid/view/animation/AlphaAnimation;
        //    16: dup            
        //    17: fconst_0       
        //    18: fconst_1       
        //    19: invokespecial   android/view/animation/AlphaAnimation.<init>:(FF)V
        //    22: astore_2       
        //    23: aload_2        
        //    24: ldc2_w          100
        //    27: invokevirtual   android/view/animation/Animation.setDuration:(J)V
        //    30: aload_1        
        //    31: aload_2        
        //    32: invokevirtual   android/view/animation/AnimationSet.addAnimation:(Landroid/view/animation/Animation;)V
        //    35: iload_0        
        //    36: ifeq            127
        //    39: invokestatic    com/whatsapp/App.ak:()Z
        //    42: istore          9
        //    44: iload           9
        //    46: ifeq            121
        //    49: fconst_1       
        //    50: fstore          10
        //    52: new             Landroid/view/animation/ScaleAnimation;
        //    55: dup            
        //    56: fconst_0       
        //    57: fconst_1       
        //    58: fconst_1       
        //    59: fconst_1       
        //    60: iconst_1       
        //    61: fload           10
        //    63: iconst_1       
        //    64: ldc_w           0.5
        //    67: invokespecial   android/view/animation/ScaleAnimation.<init>:(FFFFIFIF)V
        //    70: astore          8
        //    72: aload           8
        //    74: ldc2_w          100
        //    77: invokevirtual   android/view/animation/ScaleAnimation.setDuration:(J)V
        //    80: aload_1        
        //    81: aload           8
        //    83: invokevirtual   android/view/animation/AnimationSet.addAnimation:(Landroid/view/animation/Animation;)V
        //    86: aload_1        
        //    87: ldc2_w          100
        //    90: invokevirtual   android/view/animation/AnimationSet.setDuration:(J)V
        //    93: aload_1        
        //    94: areturn        
        //    95: astore          11
        //    97: aload           11
        //    99: athrow         
        //   100: new             Landroid/view/animation/AlphaAnimation;
        //   103: dup            
        //   104: fconst_1       
        //   105: fconst_0       
        //   106: invokespecial   android/view/animation/AlphaAnimation.<init>:(FF)V
        //   109: astore_2       
        //   110: goto            23
        //   113: astore_3       
        //   114: aload_3        
        //   115: athrow         
        //   116: astore          4
        //   118: aload           4
        //   120: athrow         
        //   121: fconst_0       
        //   122: fstore          10
        //   124: goto            52
        //   127: invokestatic    com/whatsapp/App.ak:()Z
        //   130: istore          6
        //   132: iload           6
        //   134: ifeq            168
        //   137: fconst_1       
        //   138: fstore          7
        //   140: new             Landroid/view/animation/ScaleAnimation;
        //   143: dup            
        //   144: fconst_1       
        //   145: fconst_0       
        //   146: fconst_1       
        //   147: fconst_1       
        //   148: iconst_1       
        //   149: fload           7
        //   151: iconst_1       
        //   152: ldc_w           0.5
        //   155: invokespecial   android/view/animation/ScaleAnimation.<init>:(FFFFIFIF)V
        //   158: astore          8
        //   160: goto            72
        //   163: astore          5
        //   165: aload           5
        //   167: athrow         
        //   168: fconst_0       
        //   169: fstore          7
        //   171: goto            140
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  13     23     95     100    Landroid/content/ActivityNotFoundException;
        //  23     35     113    116    Landroid/content/ActivityNotFoundException;
        //  39     44     116    121    Landroid/content/ActivityNotFoundException;
        //  114    116    116    121    Landroid/content/ActivityNotFoundException;
        //  127    132    163    168    Landroid/content/ActivityNotFoundException;
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
    
    static String b(final Conversation conversation, final String a8) {
        return conversation.a8 = a8;
    }
    
    static void b(final Conversation conversation, final bi bi) {
        conversation.h(bi);
    }
    
    static void b(final Conversation conversation, final String s, final boolean b) {
        conversation.b(s, b);
    }
    
    static void b(final Conversation conversation, final boolean b) {
        conversation.e(b);
    }
    
    private void b(final String p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Landroid/content/Intent;
        //     3: dup            
        //     4: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //     7: bipush          48
        //     9: aaload         
        //    10: getstatic       android/provider/ContactsContract$Contacts.CONTENT_URI:Landroid/net/Uri;
        //    13: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;Landroid/net/Uri;)V
        //    16: astore_3       
        //    17: iload_2        
        //    18: tableswitch {
        //              204: 88
        //          default: 36
        //        }
        //    36: aload_3        
        //    37: aload_3        
        //    38: aload_0        
        //    39: invokevirtual   com/whatsapp/Conversation.getPackageManager:()Landroid/content/pm/PackageManager;
        //    42: invokevirtual   android/content/Intent.resolveActivity:(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;
        //    45: invokevirtual   android/content/Intent.setComponent:(Landroid/content/ComponentName;)Landroid/content/Intent;
        //    48: pop            
        //    49: aload_3        
        //    50: invokevirtual   android/content/Intent.getComponent:()Landroid/content/ComponentName;
        //    53: astore          9
        //    55: aload           9
        //    57: ifnull          75
        //    60: aload_0        
        //    61: aload_3        
        //    62: invokevirtual   com/whatsapp/Conversation.startActivity:(Landroid/content/Intent;)V
        //    65: iconst_0       
        //    66: putstatic       com/whatsapp/Conversation.a_:Z
        //    69: getstatic       com/whatsapp/App.I:Z
        //    72: ifeq            87
        //    75: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    78: bipush          49
        //    80: aaload         
        //    81: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    84: invokestatic    com/whatsapp/App.N:()V
        //    87: return         
        //    88: aload_3        
        //    89: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    92: bipush          50
        //    94: aaload         
        //    95: aload_1        
        //    96: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //    99: pop            
        //   100: goto            36
        //   103: astore          4
        //   105: aload           4
        //   107: athrow         
        //   108: astore          6
        //   110: aload           6
        //   112: athrow         
        //   113: astore          7
        //   115: aload           7
        //   117: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  36     55     108    113    Landroid/content/ActivityNotFoundException;
        //  60     75     113    118    Landroid/content/ActivityNotFoundException;
        //  75     87     113    118    Landroid/content/ActivityNotFoundException;
        //  88     100    103    108    Landroid/content/ActivityNotFoundException;
        //  110    113    113    118    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0075:
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
    
    private void b(final String p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Landroid/content/Intent;
        //     3: dup            
        //     4: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //     7: sipush          206
        //    10: aaload         
        //    11: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //    14: astore_3       
        //    15: aload_3        
        //    16: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    19: sipush          208
        //    22: aaload         
        //    23: invokevirtual   android/content/Intent.setType:(Ljava/lang/String;)Landroid/content/Intent;
        //    26: pop            
        //    27: aload_3        
        //    28: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    31: sipush          205
        //    34: aaload         
        //    35: aload_1        
        //    36: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //    39: pop            
        //    40: aload_3        
        //    41: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    44: sipush          207
        //    47: aaload         
        //    48: iconst_2       
        //    49: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //    52: pop            
        //    53: aload_3        
        //    54: ldc_w           524288
        //    57: invokevirtual   android/content/Intent.setFlags:(I)Landroid/content/Intent;
        //    60: pop            
        //    61: iload_2        
        //    62: ifeq            82
        //    65: aload_0        
        //    66: aload_3        
        //    67: bipush          13
        //    69: invokevirtual   com/whatsapp/Conversation.startActivityForResult:(Landroid/content/Intent;I)V
        //    72: getstatic       com/whatsapp/App.I:Z
        //    75: istore          11
        //    77: iload           11
        //    79: ifeq            94
        //    82: aload_0        
        //    83: aload_1        
        //    84: putfield        com/whatsapp/Conversation.J:Ljava/lang/String;
        //    87: aload_0        
        //    88: aload_3        
        //    89: bipush          12
        //    91: invokevirtual   com/whatsapp/Conversation.startActivityForResult:(Landroid/content/Intent;I)V
        //    94: iconst_0       
        //    95: putstatic       com/whatsapp/Conversation.a_:Z
        //    98: return         
        //    99: astore          4
        //   101: aload           4
        //   103: athrow         
        //   104: astore          5
        //   106: aload           5
        //   108: athrow         
        //   109: astore          6
        //   111: aload_0        
        //   112: bipush          12
        //   114: invokevirtual   com/whatsapp/Conversation.showDialog:(I)V
        //   117: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      15     109    118    Landroid/content/ActivityNotFoundException;
        //  15     61     99     104    Landroid/content/ActivityNotFoundException;
        //  65     77     99     104    Landroid/content/ActivityNotFoundException;
        //  82     94     104    109    Landroid/content/ActivityNotFoundException;
        //  94     98     109    118    Landroid/content/ActivityNotFoundException;
        //  101    104    104    109    Landroid/content/ActivityNotFoundException;
        //  106    109    109    118    Landroid/content/ActivityNotFoundException;
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
    
    static boolean b(final Conversation conversation) {
        return conversation.aQ;
    }
    
    static int c(final Conversation conversation, final int ba) {
        return conversation.ba = ba;
    }
    
    static int c(final Conversation conversation, final boolean b) {
        return conversation.c(b);
    }
    
    private int c(final boolean b) {
        if (!b) {
            try {
                if (this.av > 90) {
                    Log.e(Conversation.cb[84] + (10 + this.av));
                    return this.av + 10;
                }
            }
            catch (ActivityNotFoundException ex) {
                throw ex;
            }
            try {
                if (this.as > 0) {
                    return this.as;
                }
            }
            catch (ActivityNotFoundException ex2) {
                throw ex2;
            }
        }
        return 100;
    }
    
    static ps c(final Conversation conversation) {
        return conversation.al;
    }
    
    static String c(final Conversation conversation, final String au) {
        return conversation.aU = au;
    }
    
    static void c(final Conversation conversation, final bi bi) {
        conversation.j(bi);
    }
    
    private void c(final String s, final int n) {
        final String[] array = { this.getString(2131230796), this.getString(2131230795) };
        final int[] array2 = { 12, 13 };
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)this);
        alertDialog$Builder.setTitle(this.getResources().getString(2131230895));
        alertDialog$Builder.setItems(array, (DialogInterface$OnClickListener)new _z(this, array2, s, n));
        this.a(alertDialog$Builder.create());
    }
    
    static Runnable d(final Conversation conversation) {
        return conversation.bl;
    }
    
    static void d(final Conversation conversation, final bi bi) {
        conversation.i(bi);
    }
    
    static void d(final Conversation conversation, final String s) {
        conversation.h(s);
    }
    
    private void d(final bi bi) {
        final Handler handler = new Handler();
        handler.post((Runnable)new aau(this, bi, handler));
    }
    
    private void d(final boolean b) {
        final SharedPreferences$Editor edit = this.getSharedPreferences(Conversation.cb[221], 0).edit();
        try {
            edit.putBoolean(Conversation.cb[220], b);
            if (!edit.commit()) {
                Log.e(Conversation.cb[222]);
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    static boolean d(final Conversation conversation, final boolean bg) {
        return conversation.bg = bg;
    }
    
    static View e(final Conversation conversation) {
        return conversation.aN;
    }
    
    private void e() {
        this.aI.post((Runnable)new qd(this));
    }
    
    static void e(final Conversation conversation, final bi bi) {
        conversation.e(bi);
    }
    
    static void e(final Conversation conversation, final String s) {
        conversation.e(s);
    }
    
    private void e(final bi bi) {
        this.aI.post((Runnable)new asf(this, bi));
    }
    
    private void e(final String s) {
        final Intent intent = new Intent(Conversation.cb[83], Uri.parse(Conversation.cb[82] + s));
        try {
            this.startActivity(intent);
        }
        catch (ActivityNotFoundException ex) {
            App.a((Context)this, 2131230786, 0);
        }
    }
    
    private void e(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/Conversation.a8:Ljava/lang/String;
        //     4: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //     7: ifeq            24
        //    10: aload_0        
        //    11: aconst_null    
        //    12: putfield        com/whatsapp/Conversation.a8:Ljava/lang/String;
        //    15: aload_0        
        //    16: aconst_null    
        //    17: putfield        com/whatsapp/Conversation.U:Ljava/util/ArrayList;
        //    20: return         
        //    21: astore_2       
        //    22: aload_2        
        //    23: athrow         
        //    24: aload_0        
        //    25: aload_0        
        //    26: getfield        com/whatsapp/Conversation.a8:Ljava/lang/String;
        //    29: putfield        com/whatsapp/Conversation.t:Ljava/lang/String;
        //    32: aload_0        
        //    33: invokespecial   com/whatsapp/Conversation.r:()V
        //    36: aload_0        
        //    37: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //    40: invokevirtual   android/widget/ListView.getFirstVisiblePosition:()I
        //    43: istore_3       
        //    44: aload_0        
        //    45: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //    48: iload_3        
        //    49: invokevirtual   com/whatsapp/nm.getItem:(I)Ljava/lang/Object;
        //    52: checkcast       Lcom/whatsapp/protocol/bi;
        //    55: astore          4
        //    57: aload           4
        //    59: ifnull          20
        //    62: aload           4
        //    64: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    67: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //    70: astore          6
        //    72: aload           6
        //    74: ifnonnull       92
        //    77: aload_0        
        //    78: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //    81: iload_3        
        //    82: iconst_1       
        //    83: iadd           
        //    84: invokevirtual   com/whatsapp/nm.getItem:(I)Ljava/lang/Object;
        //    87: checkcast       Lcom/whatsapp/protocol/bi;
        //    90: astore          4
        //    92: aload           4
        //    94: ifnull          20
        //    97: aload_0        
        //    98: getfield        com/whatsapp/Conversation.bb:Lcom/whatsapp/aoq;
        //   101: ifnull          113
        //   104: aload_0        
        //   105: getfield        com/whatsapp/Conversation.bb:Lcom/whatsapp/aoq;
        //   108: iconst_1       
        //   109: invokevirtual   com/whatsapp/aoq.cancel:(Z)Z
        //   112: pop            
        //   113: aload_0        
        //   114: new             Lcom/whatsapp/aoq;
        //   117: dup            
        //   118: aload_0        
        //   119: aload_0        
        //   120: getfield        com/whatsapp/Conversation.a8:Ljava/lang/String;
        //   123: iload_1        
        //   124: aload           4
        //   126: invokespecial   com/whatsapp/aoq.<init>:(Lcom/whatsapp/Conversation;Ljava/lang/String;ZLcom/whatsapp/protocol/bi;)V
        //   129: putfield        com/whatsapp/Conversation.bb:Lcom/whatsapp/aoq;
        //   132: aload_0        
        //   133: getfield        com/whatsapp/Conversation.bb:Lcom/whatsapp/aoq;
        //   136: iconst_0       
        //   137: anewarray       Ljava/lang/Void;
        //   140: invokestatic    com/whatsapp/a8s.a:(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;
        //   143: pop            
        //   144: return         
        //   145: astore          5
        //   147: aload           5
        //   149: athrow         
        //   150: astore          7
        //   152: aload           7
        //   154: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      20     21     24     Landroid/content/ActivityNotFoundException;
        //  62     72     145    150    Landroid/content/ActivityNotFoundException;
        //  97     113    150    155    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0113:
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
    
    static boolean e(final Conversation conversation, final boolean y) {
        return conversation.Y = y;
    }
    
    static ConversationContentLayout f(final Conversation conversation) {
        return conversation.aX;
    }
    
    private void f() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/Conversation.aw:Ljava/util/HashMap;
        //     4: astore_3       
        //     5: aload_3        
        //     6: ifnull          19
        //     9: aload_0        
        //    10: getfield        com/whatsapp/Conversation.aw:Ljava/util/HashMap;
        //    13: invokevirtual   java/util/HashMap.isEmpty:()Z
        //    16: ifeq            36
        //    19: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    22: sipush          190
        //    25: aaload         
        //    26: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    29: return         
        //    30: astore_1       
        //    31: aload_1        
        //    32: athrow         
        //    33: astore_2       
        //    34: aload_2        
        //    35: athrow         
        //    36: aload_0        
        //    37: bipush          13
        //    39: invokevirtual   com/whatsapp/Conversation.showDialog:(I)V
        //    42: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      5      30     33     Landroid/content/ActivityNotFoundException;
        //  9      19     33     36     Landroid/content/ActivityNotFoundException;
        //  19     29     33     36     Landroid/content/ActivityNotFoundException;
        //  31     33     33     36     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0019:
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
    
    static void f(final Conversation conversation, final bi bi) {
        conversation.g(bi);
    }
    
    private void f(final bi bi) {
        final Intent intent = new Intent((Context)this, (Class)MessageDetailsActivity.class);
        intent.putExtra(MessageDetailsActivity.l, bi.a.c);
        intent.putExtra(MessageDetailsActivity.m, bi.a.a);
        this.startActivity(intent);
    }
    
    static boolean f(final Conversation conversation, final boolean bj) {
        return conversation.bj = bj;
    }
    
    static ViewGroup g(final Conversation conversation) {
        return conversation.au;
    }
    
    public static void g() {
        final v1 v1 = Conversation.ac.get();
        Conversation conversation;
        if (v1.a()) {
            conversation = v1.b();
        }
        else {
            conversation = com.whatsapp.v1.a(v1);
            Label_0093: {
                if (conversation == null) {
                    break Label_0093;
                }
                try {
                    if (conversation.isFinishing()) {
                        conversation = null;
                    }
                }
                catch (ActivityNotFoundException ex) {
                    throw ex;
                }
            }
        }
        if (conversation != null) {
            final Cursor a = App.ak.a(conversation.I, conversation.c(false), conversation.ai);
            conversation.a(a);
            conversation.u.changeCursor(a);
            conversation.u.getCursor().requery();
        }
    }
    
    private void g(final bi p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_1        
        //     5: ifnull          218
        //     8: aload_1        
        //     9: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //    12: checkcast       Lcom/whatsapp/MediaData;
        //    15: astore          4
        //    17: aload           4
        //    19: ifnull          150
        //    22: aload           4
        //    24: getfield        com/whatsapp/MediaData.downloader:Lcom/whatsapp/ds;
        //    27: astore          8
        //    29: aload           8
        //    31: ifnull          46
        //    34: aload           4
        //    36: getfield        com/whatsapp/MediaData.downloader:Lcom/whatsapp/ds;
        //    39: invokevirtual   com/whatsapp/ds.a:()V
        //    42: iload_2        
        //    43: ifeq            214
        //    46: new             Ljava/lang/StringBuilder;
        //    49: dup            
        //    50: invokespecial   java/lang/StringBuilder.<init>:()V
        //    53: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    56: sipush          212
        //    59: aaload         
        //    60: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    63: aload_1        
        //    64: getfield        com/whatsapp/protocol/bi.I:B
        //    67: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    70: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    73: sipush          209
        //    76: aaload         
        //    77: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    80: aload_1        
        //    81: getfield        com/whatsapp/protocol/bi.c:I
        //    84: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    87: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    90: sipush          217
        //    93: aaload         
        //    94: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    97: aload           4
        //    99: getfield        com/whatsapp/MediaData.transferring:Z
        //   102: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   105: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   108: sipush          216
        //   111: aaload         
        //   112: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   115: aload           4
        //   117: getfield        com/whatsapp/MediaData.transferred:Z
        //   120: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   123: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   126: sipush          210
        //   129: aaload         
        //   130: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   133: aload_1        
        //   134: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   137: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   140: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   143: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   146: iload_2        
        //   147: ifeq            214
        //   150: new             Ljava/lang/StringBuilder;
        //   153: dup            
        //   154: invokespecial   java/lang/StringBuilder.<init>:()V
        //   157: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   160: sipush          213
        //   163: aaload         
        //   164: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   167: aload_1        
        //   168: getfield        com/whatsapp/protocol/bi.I:B
        //   171: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   174: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   177: sipush          211
        //   180: aaload         
        //   181: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   184: aload_1        
        //   185: getfield        com/whatsapp/protocol/bi.c:I
        //   188: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   191: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   194: sipush          214
        //   197: aaload         
        //   198: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   201: aload_1        
        //   202: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   205: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   208: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   211: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   214: iload_2        
        //   215: ifeq            228
        //   218: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   221: sipush          215
        //   224: aaload         
        //   225: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   228: return         
        //   229: astore          6
        //   231: aload           6
        //   233: athrow         
        //   234: astore          7
        //   236: aload           7
        //   238: athrow         
        //   239: astore          5
        //   241: aload           5
        //   243: athrow         
        //   244: astore_3       
        //   245: aload_3        
        //   246: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  22     29     229    234    Landroid/content/ActivityNotFoundException;
        //  34     42     234    239    Landroid/content/ActivityNotFoundException;
        //  46     146    239    244    Landroid/content/ActivityNotFoundException;
        //  150    214    239    244    Landroid/content/ActivityNotFoundException;
        //  218    228    244    247    Landroid/content/ActivityNotFoundException;
        //  231    234    234    239    Landroid/content/ActivityNotFoundException;
        //  236    239    239    244    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 107, Size: 107
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
    
    public static void g(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/Conversation.ac:Ljava/util/concurrent/atomic/AtomicReference;
        //     3: invokevirtual   java/util/concurrent/atomic/AtomicReference.get:()Ljava/lang/Object;
        //     6: checkcast       Lcom/whatsapp/v1;
        //     9: astore_1       
        //    10: aload_1        
        //    11: invokevirtual   com/whatsapp/v1.a:()Z
        //    14: istore          5
        //    16: iload           5
        //    18: ifeq            56
        //    21: aload_0        
        //    22: ifnull          39
        //    25: aload_0        
        //    26: aload_1        
        //    27: invokevirtual   com/whatsapp/v1.b:()Lcom/whatsapp/Conversation;
        //    30: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //    33: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    36: ifeq            100
        //    39: aload_1        
        //    40: invokevirtual   com/whatsapp/v1.b:()Lcom/whatsapp/Conversation;
        //    43: invokevirtual   com/whatsapp/Conversation.finish:()V
        //    46: getstatic       com/whatsapp/App.I:Z
        //    49: istore          11
        //    51: iload           11
        //    53: ifeq            100
        //    56: aload_1        
        //    57: invokestatic    com/whatsapp/v1.a:(Lcom/whatsapp/v1;)Lcom/whatsapp/Conversation;
        //    60: astore          6
        //    62: aload           6
        //    64: ifnull          100
        //    67: aload           6
        //    69: invokevirtual   com/whatsapp/Conversation.isFinishing:()Z
        //    72: istore          10
        //    74: iload           10
        //    76: ifne            100
        //    79: aload_0        
        //    80: ifnull          95
        //    83: aload_0        
        //    84: aload           6
        //    86: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //    89: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    92: ifeq            100
        //    95: aload           6
        //    97: invokevirtual   com/whatsapp/Conversation.finish:()V
        //   100: return         
        //   101: astore_2       
        //   102: aload_2        
        //   103: athrow         
        //   104: astore_3       
        //   105: aload_3        
        //   106: athrow         
        //   107: astore          4
        //   109: aload           4
        //   111: athrow         
        //   112: astore          7
        //   114: aload           7
        //   116: athrow         
        //   117: astore          8
        //   119: aload           8
        //   121: athrow         
        //   122: astore          9
        //   124: aload           9
        //   126: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  10     16     101    107    Landroid/content/ActivityNotFoundException;
        //  25     39     107    112    Landroid/content/ActivityNotFoundException;
        //  39     51     107    112    Landroid/content/ActivityNotFoundException;
        //  67     74     112    122    Landroid/content/ActivityNotFoundException;
        //  83     95     122    127    Landroid/content/ActivityNotFoundException;
        //  95     100    122    127    Landroid/content/ActivityNotFoundException;
        //  102    104    104    107    Landroid/content/ActivityNotFoundException;
        //  105    107    107    112    Landroid/content/ActivityNotFoundException;
        //  114    117    117    122    Landroid/content/ActivityNotFoundException;
        //  119    122    122    127    Landroid/content/ActivityNotFoundException;
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
    
    static boolean g(final Conversation conversation, final boolean am) {
        return conversation.am = am;
    }
    
    static Runnable h(final Conversation conversation) {
        return conversation.Q;
    }
    
    private void h(final bi p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //     4: checkcast       Lcom/whatsapp/MediaData;
        //     7: astore_2       
        //     8: aload_2        
        //     9: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //    12: astore          5
        //    14: aload           5
        //    16: ifnonnull       64
        //    19: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    22: sipush          196
        //    25: aaload         
        //    26: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    29: aload_0        
        //    30: invokevirtual   com/whatsapp/Conversation.getBaseContext:()Landroid/content/Context;
        //    33: astore          7
        //    35: invokestatic    com/whatsapp/App.aw:()Z
        //    38: istore          8
        //    40: iload           8
        //    42: ifeq            85
        //    45: ldc_w           2131231142
        //    48: istore          9
        //    50: aload           7
        //    52: iload           9
        //    54: iconst_0       
        //    55: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //    58: getstatic       com/whatsapp/App.I:Z
        //    61: ifeq            76
        //    64: aload_0        
        //    65: aload_2        
        //    66: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //    69: aload_1        
        //    70: getfield        com/whatsapp/protocol/bi.I:B
        //    73: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;Ljava/io/File;I)V
        //    76: return         
        //    77: astore_3       
        //    78: aload_3        
        //    79: athrow         
        //    80: astore          4
        //    82: aload           4
        //    84: athrow         
        //    85: ldc_w           2131231143
        //    88: istore          9
        //    90: goto            50
        //    93: astore          6
        //    95: aload           6
        //    97: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      14     77     80     Landroid/content/ActivityNotFoundException;
        //  19     40     80     85     Landroid/content/ActivityNotFoundException;
        //  50     64     93     98     Landroid/content/ActivityNotFoundException;
        //  64     76     93     98     Landroid/content/ActivityNotFoundException;
        //  78     80     80     85     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 47, Size: 47
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
    
    private void h(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/Conversation.aG:Z
        //     8: ifeq            266
        //    11: aload_0        
        //    12: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //    15: invokevirtual   android/widget/ListView.getFirstVisiblePosition:()I
        //    18: istore_3       
        //    19: aload_0        
        //    20: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //    23: invokevirtual   android/widget/ListView.getLastVisiblePosition:()I
        //    26: istore          4
        //    28: iload_3        
        //    29: ifle            35
        //    32: iinc            3, -1
        //    35: iload           4
        //    37: iconst_1       
        //    38: iadd           
        //    39: istore          5
        //    41: aload_0        
        //    42: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //    45: invokevirtual   android/widget/ListView.getCount:()I
        //    48: istore          7
        //    50: iload           5
        //    52: iload           7
        //    54: if_icmpge       339
        //    57: iload           4
        //    59: iconst_1       
        //    60: iadd           
        //    61: istore          8
        //    63: aload_1        
        //    64: ifnonnull       272
        //    67: iconst_1       
        //    68: istore          9
        //    70: aload_0        
        //    71: invokevirtual   com/whatsapp/Conversation.isFinishing:()Z
        //    74: ifne            266
        //    77: getstatic       com/whatsapp/Conversation.ac:Ljava/util/concurrent/atomic/AtomicReference;
        //    80: invokevirtual   java/util/concurrent/atomic/AtomicReference.get:()Ljava/lang/Object;
        //    83: checkcast       Lcom/whatsapp/v1;
        //    86: invokevirtual   com/whatsapp/v1.a:()Z
        //    89: istore          11
        //    91: iload           11
        //    93: ifeq            266
        //    96: iload_3        
        //    97: iload           8
        //    99: if_icmpgt       245
        //   102: aload_0        
        //   103: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //   106: iload_3        
        //   107: invokevirtual   com/whatsapp/nm.getItem:(I)Ljava/lang/Object;
        //   110: checkcast       Lcom/whatsapp/protocol/bi;
        //   113: astore          13
        //   115: aload           13
        //   117: ifnull          236
        //   120: aload           13
        //   122: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   125: getfield        com/whatsapp/protocol/c6.b:Z
        //   128: istore          24
        //   130: iload           24
        //   132: ifne            168
        //   135: iload           9
        //   137: ifne            226
        //   140: aload           13
        //   142: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   145: astore          29
        //   147: aload           29
        //   149: ifnull          168
        //   152: aload           13
        //   154: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   157: aload_1        
        //   158: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   161: istore          30
        //   163: iload           30
        //   165: ifne            226
        //   168: aload           13
        //   170: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   173: getfield        com/whatsapp/protocol/c6.b:Z
        //   176: istore          25
        //   178: iload           25
        //   180: ifeq            236
        //   183: aload           13
        //   185: getfield        com/whatsapp/protocol/bi.c:I
        //   188: istore          26
        //   190: iload           26
        //   192: bipush          6
        //   194: if_icmpne       236
        //   197: iload           9
        //   199: ifne            226
        //   202: aload           13
        //   204: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   207: astore          28
        //   209: aload           28
        //   211: ifnull          236
        //   214: aload           13
        //   216: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   219: aload_1        
        //   220: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   223: ifeq            236
        //   226: aload_0        
        //   227: getfield        com/whatsapp/Conversation.ad:Ljava/util/HashSet;
        //   230: aload           13
        //   232: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   235: pop            
        //   236: iload_3        
        //   237: iconst_1       
        //   238: iadd           
        //   239: istore          14
        //   241: iload_2        
        //   242: ifeq            333
        //   245: aload_0        
        //   246: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //   249: invokevirtual   com/whatsapp/nm.notifyDataSetChanged:()V
        //   252: aload_0        
        //   253: aconst_null    
        //   254: putfield        com/whatsapp/Conversation.bd:Ljava/lang/String;
        //   257: aload_1        
        //   258: ifnonnull       266
        //   261: aload_0        
        //   262: iconst_0       
        //   263: putfield        com/whatsapp/Conversation.a7:Z
        //   266: return         
        //   267: astore          6
        //   269: aload           6
        //   271: athrow         
        //   272: iconst_0       
        //   273: istore          9
        //   275: goto            70
        //   278: astore          10
        //   280: aload           10
        //   282: athrow         
        //   283: astore          15
        //   285: aload           15
        //   287: athrow         
        //   288: astore          16
        //   290: aload           16
        //   292: athrow         
        //   293: astore          17
        //   295: aload           17
        //   297: athrow         
        //   298: astore          18
        //   300: aload           18
        //   302: athrow         
        //   303: astore          19
        //   305: aload           19
        //   307: athrow         
        //   308: astore          20
        //   310: aload           20
        //   312: athrow         
        //   313: astore          21
        //   315: aload           21
        //   317: athrow         
        //   318: astore          22
        //   320: aload           22
        //   322: athrow         
        //   323: astore          23
        //   325: aload           23
        //   327: athrow         
        //   328: astore          12
        //   330: aload           12
        //   332: athrow         
        //   333: iload           14
        //   335: istore_3       
        //   336: goto            96
        //   339: iload           4
        //   341: istore          8
        //   343: goto            63
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  41     50     267    272    Landroid/content/ActivityNotFoundException;
        //  70     91     278    283    Landroid/content/ActivityNotFoundException;
        //  120    130    283    293    Landroid/content/ActivityNotFoundException;
        //  140    147    293    298    Landroid/content/ActivityNotFoundException;
        //  152    163    298    303    Landroid/content/ActivityNotFoundException;
        //  168    178    303    308    Landroid/content/ActivityNotFoundException;
        //  183    190    308    318    Landroid/content/ActivityNotFoundException;
        //  202    209    318    323    Landroid/content/ActivityNotFoundException;
        //  214    226    323    328    Landroid/content/ActivityNotFoundException;
        //  226    236    323    328    Landroid/content/ActivityNotFoundException;
        //  245    257    328    333    Landroid/content/ActivityNotFoundException;
        //  261    266    328    333    Landroid/content/ActivityNotFoundException;
        //  285    288    288    293    Landroid/content/ActivityNotFoundException;
        //  290    293    293    298    Landroid/content/ActivityNotFoundException;
        //  295    298    298    303    Landroid/content/ActivityNotFoundException;
        //  300    303    303    308    Landroid/content/ActivityNotFoundException;
        //  305    308    308    318    Landroid/content/ActivityNotFoundException;
        //  310    313    313    318    Landroid/content/ActivityNotFoundException;
        //  315    318    318    323    Landroid/content/ActivityNotFoundException;
        //  320    323    323    328    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 168, Size: 168
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
    
    static boolean h(final Conversation conversation, final boolean ah) {
        return conversation.aH = ah;
    }
    
    static void i(final Conversation conversation) {
        conversation.w();
    }
    
    private void i(final bi p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/Conversation.bc:Ljava/util/ArrayList;
        //     8: invokevirtual   java/util/ArrayList.size:()I
        //    11: ifne            269
        //    14: aload_0        
        //    15: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //    18: invokevirtual   com/whatsapp/nm.getCursor:()Landroid/database/Cursor;
        //    21: invokeinterface android/database/Cursor.getCount:()I
        //    26: istore          7
        //    28: iload           7
        //    30: ifle            100
        //    33: aload_0        
        //    34: getfield        com/whatsapp/Conversation.aH:Z
        //    37: istore          19
        //    39: iload           19
        //    41: ifeq            100
        //    44: aload_0        
        //    45: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //    48: iload           7
        //    50: iconst_1       
        //    51: isub           
        //    52: invokevirtual   com/whatsapp/nm.getItem:(I)Ljava/lang/Object;
        //    55: aload_1        
        //    56: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //    59: istore          20
        //    61: iload           20
        //    63: ifeq            100
        //    66: new             Ljava/lang/StringBuilder;
        //    69: dup            
        //    70: invokespecial   java/lang/StringBuilder.<init>:()V
        //    73: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    76: sipush          228
        //    79: aaload         
        //    80: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    83: aload_1        
        //    84: invokestatic    com/whatsapp/util/Log.a:(Lcom/whatsapp/protocol/bi;)Ljava/lang/String;
        //    87: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    90: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    93: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    96: iload_2        
        //    97: ifeq            182
        //   100: iload           7
        //   102: iconst_1       
        //   103: if_icmple       173
        //   106: aload_0        
        //   107: getfield        com/whatsapp/Conversation.aH:Z
        //   110: istore          13
        //   112: iload           13
        //   114: ifeq            173
        //   117: aload_0        
        //   118: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //   121: iload           7
        //   123: iconst_2       
        //   124: isub           
        //   125: invokevirtual   com/whatsapp/nm.getItem:(I)Ljava/lang/Object;
        //   128: aload_1        
        //   129: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   132: istore          14
        //   134: iload           14
        //   136: ifeq            173
        //   139: new             Ljava/lang/StringBuilder;
        //   142: dup            
        //   143: invokespecial   java/lang/StringBuilder.<init>:()V
        //   146: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   149: sipush          227
        //   152: aaload         
        //   153: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   156: aload_1        
        //   157: invokestatic    com/whatsapp/util/Log.a:(Lcom/whatsapp/protocol/bi;)Ljava/lang/String;
        //   160: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   163: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   166: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   169: iload_2        
        //   170: ifeq            182
        //   173: aload_0        
        //   174: getfield        com/whatsapp/Conversation.bc:Ljava/util/ArrayList;
        //   177: aload_1        
        //   178: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   181: pop            
        //   182: return         
        //   183: astore          15
        //   185: aload           15
        //   187: athrow         
        //   188: astore          16
        //   190: aload           16
        //   192: athrow         
        //   193: astore          17
        //   195: aload           17
        //   197: athrow         
        //   198: astore          18
        //   200: aload           18
        //   202: athrow         
        //   203: astore          10
        //   205: aload           10
        //   207: athrow         
        //   208: astore          11
        //   210: aload           11
        //   212: athrow         
        //   213: astore          12
        //   215: aload           12
        //   217: athrow         
        //   218: astore          8
        //   220: aload           8
        //   222: athrow         
        //   223: astore          5
        //   225: new             Ljava/lang/StringBuilder;
        //   228: dup            
        //   229: invokespecial   java/lang/StringBuilder.<init>:()V
        //   232: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   235: sipush          226
        //   238: aaload         
        //   239: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   242: aload           5
        //   244: invokevirtual   android/database/StaleDataException.toString:()Ljava/lang/String;
        //   247: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   250: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   253: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   256: aload_0        
        //   257: getfield        com/whatsapp/Conversation.bc:Ljava/util/ArrayList;
        //   260: aload_1        
        //   261: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   264: pop            
        //   265: iload_2        
        //   266: ifeq            182
        //   269: aload_0        
        //   270: getfield        com/whatsapp/Conversation.bc:Ljava/util/ArrayList;
        //   273: aload_1        
        //   274: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   277: pop            
        //   278: return         
        //   279: astore_3       
        //   280: aload_3        
        //   281: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                 
        //  -----  -----  -----  -----  -------------------------------------
        //  14     28     223    269    Landroid/database/StaleDataException;
        //  33     39     183    188    Landroid/database/StaleDataException;
        //  44     61     188    193    Landroid/database/StaleDataException;
        //  66     96     193    203    Landroid/database/StaleDataException;
        //  106    112    203    208    Landroid/database/StaleDataException;
        //  117    134    208    213    Landroid/database/StaleDataException;
        //  139    169    213    218    Landroid/database/StaleDataException;
        //  173    182    218    223    Landroid/database/StaleDataException;
        //  185    188    188    193    Landroid/database/StaleDataException;
        //  190    193    193    203    Landroid/database/StaleDataException;
        //  195    198    198    203    Landroid/database/StaleDataException;
        //  200    203    203    208    Landroid/database/StaleDataException;
        //  205    208    208    213    Landroid/database/StaleDataException;
        //  210    213    213    218    Landroid/database/StaleDataException;
        //  215    218    218    223    Landroid/database/StaleDataException;
        //  220    223    223    269    Landroid/database/StaleDataException;
        //  225    265    279    282    Landroid/database/StaleDataException;
        //  269    278    279    282    Landroid/database/StaleDataException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 135, Size: 135
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
    
    public static void i(final String bd) {
        final Conversation a = v1.a(Conversation.ac.get());
        if (a == null) {
            return;
        }
        try {
            a.bd = bd;
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    static boolean i(final Conversation conversation, final boolean ac) {
        return conversation.aC = ac;
    }
    
    static s0 j(final Conversation conversation) {
        return conversation.ai;
    }
    
    public static void j() {
        Conversation.aW = true;
    }
    
    private void j(final bi p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_1        
        //     5: getfield        com/whatsapp/protocol/bi.c:I
        //     8: iconst_2       
        //     9: invokestatic    com/whatsapp/protocol/b7.a:(II)I
        //    12: iflt            30
        //    15: aload_0        
        //    16: invokevirtual   com/whatsapp/Conversation.getBaseContext:()Landroid/content/Context;
        //    19: ldc_w           2131231128
        //    22: iconst_0       
        //    23: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //    26: return         
        //    27: astore_3       
        //    28: aload_3        
        //    29: athrow         
        //    30: aload_1        
        //    31: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //    34: checkcast       Lcom/whatsapp/MediaData;
        //    37: astore          4
        //    39: aload           4
        //    41: ifnull          172
        //    44: aload           4
        //    46: getfield        com/whatsapp/MediaData.uploader:Lcom/whatsapp/a9;
        //    49: astore          8
        //    51: aload           8
        //    53: ifnull          68
        //    56: aload           4
        //    58: getfield        com/whatsapp/MediaData.uploader:Lcom/whatsapp/a9;
        //    61: invokevirtual   com/whatsapp/a9.i:()V
        //    64: iload_2        
        //    65: ifeq            26
        //    68: new             Ljava/lang/StringBuilder;
        //    71: dup            
        //    72: invokespecial   java/lang/StringBuilder.<init>:()V
        //    75: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    78: sipush          197
        //    81: aaload         
        //    82: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    85: aload_1        
        //    86: getfield        com/whatsapp/protocol/bi.I:B
        //    89: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    92: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    95: sipush          204
        //    98: aaload         
        //    99: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   102: aload_1        
        //   103: getfield        com/whatsapp/protocol/bi.c:I
        //   106: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   109: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   112: sipush          199
        //   115: aaload         
        //   116: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   119: aload           4
        //   121: getfield        com/whatsapp/MediaData.transferring:Z
        //   124: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   127: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   130: sipush          200
        //   133: aaload         
        //   134: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   137: aload           4
        //   139: getfield        com/whatsapp/MediaData.transferred:Z
        //   142: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   145: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   148: sipush          201
        //   151: aaload         
        //   152: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   155: aload_1        
        //   156: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   159: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   162: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   165: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   168: iload_2        
        //   169: ifeq            26
        //   172: new             Ljava/lang/StringBuilder;
        //   175: dup            
        //   176: invokespecial   java/lang/StringBuilder.<init>:()V
        //   179: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   182: sipush          202
        //   185: aaload         
        //   186: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   189: aload_1        
        //   190: getfield        com/whatsapp/protocol/bi.I:B
        //   193: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   196: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   199: sipush          203
        //   202: aaload         
        //   203: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   206: aload_1        
        //   207: getfield        com/whatsapp/protocol/bi.c:I
        //   210: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   213: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   216: sipush          198
        //   219: aaload         
        //   220: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   223: aload_1        
        //   224: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   227: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   230: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   233: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   236: return         
        //   237: astore          5
        //   239: aload           5
        //   241: athrow         
        //   242: astore          6
        //   244: aload           6
        //   246: athrow         
        //   247: astore          7
        //   249: aload           7
        //   251: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  4      26     27     30     Landroid/content/ActivityNotFoundException;
        //  44     51     242    247    Landroid/content/ActivityNotFoundException;
        //  56     64     247    252    Landroid/content/ActivityNotFoundException;
        //  68     168    237    242    Landroid/content/ActivityNotFoundException;
        //  172    236    237    242    Landroid/content/ActivityNotFoundException;
        //  244    247    247    252    Landroid/content/ActivityNotFoundException;
        //  249    252    237    242    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0068:
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
    
    static boolean j(final Conversation conversation, final boolean at) {
        return conversation.at = at;
    }
    
    static int k(final bi bi) {
        return l(bi);
    }
    
    static void k(final Conversation conversation) {
        conversation.z();
    }
    
    private boolean k() {
        return this.Z.isShowing();
    }
    
    static boolean k(final Conversation conversation, final boolean aq) {
        return conversation.aQ = aq;
    }
    
    private boolean k(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: new             Lcom/whatsapp/util/b0;
        //     7: dup            
        //     8: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    11: bipush          16
        //    13: aaload         
        //    14: invokespecial   com/whatsapp/util/b0.<init>:(Ljava/lang/String;)V
        //    17: astore_3       
        //    18: aload_1        
        //    19: ifnull          65
        //    22: aload_0        
        //    23: iconst_0       
        //    24: putfield        com/whatsapp/Conversation.av:I
        //    27: aload_0        
        //    28: aload_1        
        //    29: putfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //    32: new             Ljava/lang/StringBuilder;
        //    35: dup            
        //    36: invokespecial   java/lang/StringBuilder.<init>:()V
        //    39: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    42: bipush          33
        //    44: aaload         
        //    45: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    48: aload_0        
        //    49: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //    52: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    55: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    58: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    61: iload_2        
        //    62: ifeq            110
        //    65: aload_0        
        //    66: aload_0        
        //    67: invokevirtual   com/whatsapp/Conversation.getIntent:()Landroid/content/Intent;
        //    70: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    73: bipush          39
        //    75: aaload         
        //    76: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    79: putfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //    82: aload_0        
        //    83: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //    86: astore          6
        //    88: aload           6
        //    90: ifnonnull       110
        //    93: aload_0        
        //    94: aload_0        
        //    95: invokevirtual   com/whatsapp/Conversation.getIntent:()Landroid/content/Intent;
        //    98: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   101: bipush          18
        //   103: aaload         
        //   104: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   107: putfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //   110: iconst_1       
        //   111: istore          7
        //   113: aload_0        
        //   114: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //   117: ifnonnull       564
        //   120: aload_0        
        //   121: invokevirtual   com/whatsapp/Conversation.getIntent:()Landroid/content/Intent;
        //   124: astore          82
        //   126: aload           82
        //   128: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   131: ifnull          545
        //   134: aload           82
        //   136: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   139: invokevirtual   android/net/Uri.getScheme:()Ljava/lang/String;
        //   142: astore          87
        //   144: aload           87
        //   146: ifnull          545
        //   149: aload           82
        //   151: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   154: invokevirtual   android/net/Uri.getScheme:()Ljava/lang/String;
        //   157: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   160: bipush          26
        //   162: aaload         
        //   163: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   166: istore          88
        //   168: iload           88
        //   170: ifne            197
        //   173: aload           82
        //   175: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   178: invokevirtual   android/net/Uri.getScheme:()Ljava/lang/String;
        //   181: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   184: bipush          45
        //   186: aaload         
        //   187: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   190: istore          104
        //   192: iload           104
        //   194: ifeq            545
        //   197: aload_0        
        //   198: invokevirtual   com/whatsapp/Conversation.getIntent:()Landroid/content/Intent;
        //   201: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   204: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //   207: astore          89
        //   209: aload           89
        //   211: ifnonnull       246
        //   214: iconst_0       
        //   215: ireturn        
        //   216: astore          105
        //   218: aload           105
        //   220: athrow         
        //   221: astore          4
        //   223: aload           4
        //   225: athrow         
        //   226: astore          5
        //   228: aload           5
        //   230: athrow         
        //   231: astore          83
        //   233: aload           83
        //   235: athrow         
        //   236: astore          84
        //   238: aload           84
        //   240: athrow         
        //   241: astore          85
        //   243: aload           85
        //   245: athrow         
        //   246: aload           89
        //   248: ldc_w           ":"
        //   251: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   254: astore          90
        //   256: aload           90
        //   258: ifnull          525
        //   261: aload           90
        //   263: arraylength    
        //   264: istore          93
        //   266: iload           93
        //   268: iconst_2       
        //   269: if_icmpne       525
        //   272: new             Ljava/lang/StringBuilder;
        //   275: dup            
        //   276: invokespecial   java/lang/StringBuilder.<init>:()V
        //   279: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   282: bipush          36
        //   284: aaload         
        //   285: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   288: aload           90
        //   290: iconst_1       
        //   291: aaload         
        //   292: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   295: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   298: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   301: aload           90
        //   303: iconst_1       
        //   304: aaload         
        //   305: invokestatic    java/net/URLDecoder.decode:(Ljava/lang/String;)Ljava/lang/String;
        //   308: invokestatic    android/telephony/PhoneNumberUtils.stripSeparators:(Ljava/lang/String;)Ljava/lang/String;
        //   311: astore          94
        //   313: aload           94
        //   315: invokevirtual   java/lang/String.length:()I
        //   318: ifle            345
        //   321: aload           94
        //   323: iconst_0       
        //   324: invokevirtual   java/lang/String.charAt:(I)C
        //   327: invokestatic    java/lang/Character.isDigit:(C)Z
        //   330: istore          103
        //   332: iload           103
        //   334: ifne            345
        //   337: aload           94
        //   339: iconst_1       
        //   340: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   343: astore          94
        //   345: new             Ljava/lang/StringBuilder;
        //   348: dup            
        //   349: invokespecial   java/lang/StringBuilder.<init>:()V
        //   352: aload           94
        //   354: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   357: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   360: bipush          42
        //   362: aaload         
        //   363: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   366: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   369: astore          96
        //   371: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   374: aload           96
        //   376: invokevirtual   com/whatsapp/wc.i:(Ljava/lang/String;)Ljava/util/ArrayList;
        //   379: astore          97
        //   381: aload           97
        //   383: invokevirtual   java/util/ArrayList.size:()I
        //   386: ifle            465
        //   389: aload           97
        //   391: iconst_0       
        //   392: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   395: checkcast       Lcom/whatsapp/a_9;
        //   398: getfield        com/whatsapp/a_9.b:Z
        //   401: istore          102
        //   403: iload           102
        //   405: ifeq            465
        //   408: aload_0        
        //   409: aload           97
        //   411: iconst_0       
        //   412: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   415: checkcast       Lcom/whatsapp/a_9;
        //   418: putfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   421: aload_0        
        //   422: aload_0        
        //   423: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   426: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   429: putfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //   432: new             Ljava/lang/StringBuilder;
        //   435: dup            
        //   436: invokespecial   java/lang/StringBuilder.<init>:()V
        //   439: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   442: bipush          46
        //   444: aaload         
        //   445: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   448: aload_0        
        //   449: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //   452: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   455: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   458: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   461: iload_2        
        //   462: ifeq            521
        //   465: new             Landroid/content/Intent;
        //   468: dup            
        //   469: aload_0        
        //   470: ldc_w           Lcom/whatsapp/SmsDefaultAppWarning;.class
        //   473: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   476: astore          100
        //   478: aload           100
        //   480: aload           89
        //   482: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //   485: invokevirtual   android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
        //   488: pop            
        //   489: aload_0        
        //   490: aload           100
        //   492: invokevirtual   com/whatsapp/Conversation.startActivity:(Landroid/content/Intent;)V
        //   495: aload_0        
        //   496: invokevirtual   com/whatsapp/Conversation.finish:()V
        //   499: iconst_0       
        //   500: ireturn        
        //   501: astore          92
        //   503: aload           92
        //   505: athrow         
        //   506: astore          95
        //   508: aload           95
        //   510: athrow         
        //   511: astore          98
        //   513: aload           98
        //   515: athrow         
        //   516: astore          99
        //   518: aload           99
        //   520: athrow         
        //   521: iload_2        
        //   522: ifeq            541
        //   525: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   528: bipush          37
        //   530: aaload         
        //   531: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   534: iconst_0       
        //   535: ireturn        
        //   536: astore          91
        //   538: aload           91
        //   540: athrow         
        //   541: iload_2        
        //   542: ifeq            561
        //   545: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   548: bipush          31
        //   550: aaload         
        //   551: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   554: iconst_0       
        //   555: ireturn        
        //   556: astore          86
        //   558: aload           86
        //   560: athrow         
        //   561: iconst_0       
        //   562: istore          7
        //   564: aload_0        
        //   565: getfield        com/whatsapp/Conversation.al:Lcom/whatsapp/ps;
        //   568: aload_0        
        //   569: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //   572: invokevirtual   com/whatsapp/ps.a:(Ljava/lang/String;)V
        //   575: iload           7
        //   577: ifeq            591
        //   580: aload_0        
        //   581: aload_0        
        //   582: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //   585: invokestatic    com/whatsapp/z8.a:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   588: putfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   591: aload_0        
        //   592: aload_0        
        //   593: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   596: invokevirtual   com/whatsapp/a_9.m:()Z
        //   599: putfield        com/whatsapp/Conversation.aG:Z
        //   602: aload_0        
        //   603: aload_0        
        //   604: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   607: invokevirtual   com/whatsapp/a_9.k:()Z
        //   610: putfield        com/whatsapp/Conversation.S:Z
        //   613: aload_0        
        //   614: invokestatic    com/whatsapp/Conversation.y:(Lcom/whatsapp/Conversation;)V
        //   617: aload_0        
        //   618: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   621: ifnonnull       665
        //   624: new             Ljava/lang/StringBuilder;
        //   627: dup            
        //   628: invokespecial   java/lang/StringBuilder.<init>:()V
        //   631: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   634: bipush          32
        //   636: aaload         
        //   637: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   640: aload_0        
        //   641: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //   644: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   647: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   650: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   653: iconst_0       
        //   654: ireturn        
        //   655: astore          8
        //   657: aload           8
        //   659: athrow         
        //   660: astore          9
        //   662: aload           9
        //   664: athrow         
        //   665: aload_0        
        //   666: aload_0        
        //   667: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   670: getfield        com/whatsapp/a_9.l:I
        //   673: putfield        com/whatsapp/Conversation.G:I
        //   676: aload_0        
        //   677: new             Ljava/util/HashMap;
        //   680: dup            
        //   681: invokespecial   java/util/HashMap.<init>:()V
        //   684: putfield        com/whatsapp/Conversation.ag:Ljava/util/HashMap;
        //   687: aload_0        
        //   688: new             Ljava/util/ArrayList;
        //   691: dup            
        //   692: invokespecial   java/util/ArrayList.<init>:()V
        //   695: putfield        com/whatsapp/Conversation.bc:Ljava/util/ArrayList;
        //   698: aload_0        
        //   699: new             Ljava/util/HashSet;
        //   702: dup            
        //   703: invokespecial   java/util/HashSet.<init>:()V
        //   706: putfield        com/whatsapp/Conversation.ad:Ljava/util/HashSet;
        //   709: aload_0        
        //   710: iconst_1       
        //   711: putfield        com/whatsapp/Conversation.aH:Z
        //   714: aload_0        
        //   715: new             Lcom/whatsapp/nm;
        //   718: dup            
        //   719: aload_0        
        //   720: aload_0        
        //   721: aload_0        
        //   722: getfield        com/whatsapp/Conversation.aA:Landroid/database/Cursor;
        //   725: iconst_0       
        //   726: invokespecial   com/whatsapp/nm.<init>:(Lcom/whatsapp/Conversation;Landroid/content/Context;Landroid/database/Cursor;Z)V
        //   729: putfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //   732: aload_0        
        //   733: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //   736: aload_0        
        //   737: getfield        com/whatsapp/Conversation.aS:Landroid/database/DataSetObserver;
        //   740: invokevirtual   com/whatsapp/nm.registerDataSetObserver:(Landroid/database/DataSetObserver;)V
        //   743: aload_0        
        //   744: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //   747: aload_0        
        //   748: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //   751: invokevirtual   android/widget/ListView.setAdapter:(Landroid/widget/ListAdapter;)V
        //   754: aload_0        
        //   755: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   758: iconst_0       
        //   759: iconst_1       
        //   760: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/a_9;ZZ)V
        //   763: invokestatic    com/whatsapp/notification/a2.b:()Lcom/whatsapp/notification/a2;
        //   766: invokevirtual   com/whatsapp/notification/a2.c:()V
        //   769: invokestatic    com/whatsapp/notification/AndroidWear.a:()Z
        //   772: ifeq            831
        //   775: invokestatic    com/whatsapp/z8.j:()Ljava/util/ArrayList;
        //   778: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   781: astore          79
        //   783: aload           79
        //   785: invokeinterface java/util/Iterator.hasNext:()Z
        //   790: ifeq            831
        //   793: aload           79
        //   795: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   800: checkcast       Ljava/lang/String;
        //   803: astore          80
        //   805: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   808: aload           80
        //   810: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   813: getfield        com/whatsapp/a_9.l:I
        //   816: ifle            827
        //   819: invokestatic    com/whatsapp/notification/a2.b:()Lcom/whatsapp/notification/a2;
        //   822: aload           80
        //   824: invokevirtual   com/whatsapp/notification/a2.b:(Ljava/lang/String;)V
        //   827: iload_2        
        //   828: ifeq            783
        //   831: aload_0        
        //   832: iconst_0       
        //   833: putfield        com/whatsapp/Conversation.aC:Z
        //   836: aload_0        
        //   837: getfield        com/whatsapp/Conversation.aJ:Z
        //   840: ifne            858
        //   843: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   846: aload_0        
        //   847: getfield        com/whatsapp/Conversation.bi:Lcom/whatsapp/sj;
        //   850: invokevirtual   com/whatsapp/vy.a:(Lcom/whatsapp/sj;)V
        //   853: aload_0        
        //   854: iconst_1       
        //   855: putfield        com/whatsapp/Conversation.aJ:Z
        //   858: aload_0        
        //   859: invokevirtual   com/whatsapp/Conversation.getIntent:()Landroid/content/Intent;
        //   862: astore          11
        //   864: aload           11
        //   866: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   869: bipush          23
        //   871: aaload         
        //   872: iconst_0       
        //   873: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   876: ifeq            1388
        //   879: aload_0        
        //   880: getfield        com/whatsapp/Conversation.B:Z
        //   883: istore          29
        //   885: iload           29
        //   887: ifne            1388
        //   890: getstatic       com/whatsapp/Conversation.aB:Z
        //   893: istore          30
        //   895: iload           30
        //   897: ifeq            1388
        //   900: aload           11
        //   902: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   905: bipush          19
        //   907: aaload         
        //   908: iconst_0       
        //   909: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   912: pop            
        //   913: iconst_0       
        //   914: putstatic       com/whatsapp/Conversation.aB:Z
        //   917: aload_0        
        //   918: iconst_1       
        //   919: putfield        com/whatsapp/Conversation.x:Z
        //   922: aload_1        
        //   923: ifnonnull       1388
        //   926: aload           11
        //   928: invokevirtual   android/content/Intent.getExtras:()Landroid/os/Bundle;
        //   931: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   934: bipush          43
        //   936: aaload         
        //   937: invokevirtual   android/os/Bundle.getByte:(Ljava/lang/String;)B
        //   940: istore          32
        //   942: aload           11
        //   944: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   947: bipush          25
        //   949: aaload         
        //   950: invokevirtual   android/content/Intent.getParcelableArrayListExtra:(Ljava/lang/String;)Ljava/util/ArrayList;
        //   953: astore          33
        //   955: aload           33
        //   957: ifnull          1271
        //   960: new             Ljava/util/ArrayList;
        //   963: dup            
        //   964: invokespecial   java/util/ArrayList.<init>:()V
        //   967: astore          34
        //   969: aload           33
        //   971: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   974: astore          35
        //   976: aload           35
        //   978: invokeinterface java/util/Iterator.hasNext:()Z
        //   983: ifeq            1096
        //   986: aload           35
        //   988: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   993: checkcast       Landroid/net/Uri;
        //   996: astore          54
        //   998: iload           32
        //  1000: ifge            2051
        //  1003: aload           54
        //  1005: invokestatic    com/whatsapp/util/br.e:(Landroid/net/Uri;)B
        //  1008: istore          78
        //  1010: iload           78
        //  1012: istore          55
        //  1014: new             Ljava/lang/StringBuilder;
        //  1017: dup            
        //  1018: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1021: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1024: bipush          29
        //  1026: aaload         
        //  1027: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1030: iload           55
        //  1032: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1035: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1038: bipush          35
        //  1040: aaload         
        //  1041: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1044: aload           54
        //  1046: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1049: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1052: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1055: iload           55
        //  1057: tableswitch {
        //                2: 1739
        //                3: 1615
        //                4: 1636
        //                5: 1751
        //          default: 1088
        //        }
        //  1088: aload_0        
        //  1089: invokevirtual   com/whatsapp/Conversation.finish:()V
        //  1092: iload_2        
        //  1093: ifeq            976
        //  1096: aload           34
        //  1098: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //  1101: istore          38
        //  1103: iload           38
        //  1105: ifne            1267
        //  1108: aload           11
        //  1110: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1113: bipush          24
        //  1115: aaload         
        //  1116: iconst_0       
        //  1117: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //  1120: ifeq            1133
        //  1123: aload_0        
        //  1124: aload           34
        //  1126: invokespecial   com/whatsapp/Conversation.a:(Ljava/util/ArrayList;)V
        //  1129: iload_2        
        //  1130: ifeq            1267
        //  1133: new             Landroid/content/Intent;
        //  1136: dup            
        //  1137: aload_0        
        //  1138: ldc_w           Lcom/whatsapp/gallerypicker/ImagePreview;.class
        //  1141: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  1144: astore          47
        //  1146: aload_0        
        //  1147: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //  1150: invokevirtual   com/whatsapp/a_9.m:()Z
        //  1153: ifeq            1189
        //  1156: iconst_1       
        //  1157: anewarray       Ljava/lang/Object;
        //  1160: astore          53
        //  1162: aload           53
        //  1164: iconst_0       
        //  1165: aload_0        
        //  1166: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //  1169: aload_0        
        //  1170: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //  1173: aastore        
        //  1174: aload_0        
        //  1175: ldc_w           2131231158
        //  1178: aload           53
        //  1180: invokevirtual   com/whatsapp/Conversation.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //  1183: astore          49
        //  1185: iload_2        
        //  1186: ifeq            1218
        //  1189: iconst_1       
        //  1190: anewarray       Ljava/lang/Object;
        //  1193: astore          48
        //  1195: aload           48
        //  1197: iconst_0       
        //  1198: aload_0        
        //  1199: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //  1202: aload_0        
        //  1203: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //  1206: aastore        
        //  1207: aload_0        
        //  1208: ldc_w           2131231643
        //  1211: aload           48
        //  1213: invokevirtual   com/whatsapp/Conversation.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //  1216: astore          49
        //  1218: aload           47
        //  1220: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1223: bipush          41
        //  1225: aaload         
        //  1226: aload           49
        //  1228: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1231: pop            
        //  1232: aload           47
        //  1234: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1237: bipush          22
        //  1239: aaload         
        //  1240: iconst_0       
        //  1241: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //  1244: pop            
        //  1245: aload           47
        //  1247: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1250: bipush          28
        //  1252: aaload         
        //  1253: aload           34
        //  1255: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
        //  1258: pop            
        //  1259: aload_0        
        //  1260: aload           47
        //  1262: bipush          14
        //  1264: invokevirtual   com/whatsapp/Conversation.startActivityForResult:(Landroid/content/Intent;I)V
        //  1267: iload_2        
        //  1268: ifeq            1388
        //  1271: iload           32
        //  1273: iconst_4       
        //  1274: if_icmpne       1310
        //  1277: aload_0        
        //  1278: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //  1281: aload           11
        //  1283: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1286: bipush          14
        //  1288: aaload         
        //  1289: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //  1292: aload           11
        //  1294: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1297: bipush          44
        //  1299: aaload         
        //  1300: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //  1303: invokestatic    com/whatsapp/App.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //  1306: iload_2        
        //  1307: ifeq            1388
        //  1310: aload           11
        //  1312: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1315: bipush          38
        //  1317: aaload         
        //  1318: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //  1321: astore          39
        //  1323: aload           39
        //  1325: ifnull          1388
        //  1328: aload           39
        //  1330: invokevirtual   java/lang/String.length:()I
        //  1333: istore          43
        //  1335: iload           43
        //  1337: ifle            1388
        //  1340: aload           11
        //  1342: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1345: bipush          30
        //  1347: aaload         
        //  1348: iconst_0       
        //  1349: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //  1352: istore          44
        //  1354: iload           44
        //  1356: ifeq            1379
        //  1359: getstatic       com/whatsapp/Conversation.v:Ljava/util/HashMap;
        //  1362: aload_0        
        //  1363: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //  1366: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //  1369: aload           39
        //  1371: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1374: pop            
        //  1375: iload_2        
        //  1376: ifeq            1388
        //  1379: aload_0        
        //  1380: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //  1383: aload           39
        //  1385: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/a_9;Ljava/lang/String;)V
        //  1388: getstatic       com/whatsapp/Conversation.v:Ljava/util/HashMap;
        //  1391: aload_0        
        //  1392: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //  1395: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //  1398: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1401: checkcast       Ljava/lang/String;
        //  1404: astore          15
        //  1406: aload           15
        //  1408: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  1411: istore          18
        //  1413: iload           18
        //  1415: ifne            1470
        //  1418: aload_0        
        //  1419: getfield        com/whatsapp/Conversation.X:Lcom/whatsapp/ConversationTextEntry;
        //  1422: aload           15
        //  1424: aload_0        
        //  1425: invokevirtual   com/whatsapp/Conversation.getBaseContext:()Landroid/content/Context;
        //  1428: invokestatic    com/whatsapp/util/cq.c:(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/CharSequence;
        //  1431: invokevirtual   com/whatsapp/ConversationTextEntry.setText:(Ljava/lang/CharSequence;)V
        //  1434: aload_0        
        //  1435: getfield        com/whatsapp/Conversation.E:Landroid/widget/ImageButton;
        //  1438: bipush          8
        //  1440: invokevirtual   android/widget/ImageButton.setVisibility:(I)V
        //  1443: invokestatic    com/whatsapp/App.ab:()Z
        //  1446: ifeq            1458
        //  1449: aload_0        
        //  1450: getfield        com/whatsapp/Conversation.ab:Landroid/widget/ImageButton;
        //  1453: bipush          8
        //  1455: invokevirtual   android/widget/ImageButton.setVisibility:(I)V
        //  1458: aload_0        
        //  1459: getfield        com/whatsapp/Conversation.a6:Landroid/widget/ImageButton;
        //  1462: iconst_0       
        //  1463: invokevirtual   android/widget/ImageButton.setVisibility:(I)V
        //  1466: iload_2        
        //  1467: ifeq            1509
        //  1470: aload_0        
        //  1471: getfield        com/whatsapp/Conversation.X:Lcom/whatsapp/ConversationTextEntry;
        //  1474: aconst_null    
        //  1475: invokevirtual   com/whatsapp/ConversationTextEntry.setText:(Ljava/lang/CharSequence;)V
        //  1478: aload_0        
        //  1479: getfield        com/whatsapp/Conversation.E:Landroid/widget/ImageButton;
        //  1482: iconst_0       
        //  1483: invokevirtual   android/widget/ImageButton.setVisibility:(I)V
        //  1486: invokestatic    com/whatsapp/App.ab:()Z
        //  1489: ifeq            1500
        //  1492: aload_0        
        //  1493: getfield        com/whatsapp/Conversation.ab:Landroid/widget/ImageButton;
        //  1496: iconst_0       
        //  1497: invokevirtual   android/widget/ImageButton.setVisibility:(I)V
        //  1500: aload_0        
        //  1501: getfield        com/whatsapp/Conversation.a6:Landroid/widget/ImageButton;
        //  1504: bipush          8
        //  1506: invokevirtual   android/widget/ImageButton.setVisibility:(I)V
        //  1509: aload_0        
        //  1510: invokespecial   com/whatsapp/Conversation.G:()V
        //  1513: aload_0        
        //  1514: getfield        com/whatsapp/Conversation.aL:Landroid/view/inputmethod/InputMethodManager;
        //  1517: aload_0        
        //  1518: getfield        com/whatsapp/Conversation.X:Lcom/whatsapp/ConversationTextEntry;
        //  1521: invokevirtual   com/whatsapp/ConversationTextEntry.getWindowToken:()Landroid/os/IBinder;
        //  1524: iconst_0       
        //  1525: invokevirtual   android/view/inputmethod/InputMethodManager.hideSoftInputFromWindow:(Landroid/os/IBinder;I)Z
        //  1528: pop            
        //  1529: aload_0        
        //  1530: getfield        com/whatsapp/Conversation.X:Lcom/whatsapp/ConversationTextEntry;
        //  1533: invokevirtual   com/whatsapp/ConversationTextEntry.requestFocus:()Z
        //  1536: pop            
        //  1537: aload_1        
        //  1538: ifnull          1556
        //  1541: aload_0        
        //  1542: invokespecial   com/whatsapp/Conversation.I:()V
        //  1545: aload_0        
        //  1546: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //  1549: invokevirtual   com/whatsapp/nm.notifyDataSetChanged:()V
        //  1552: aload_0        
        //  1553: invokespecial   com/whatsapp/Conversation.o:()V
        //  1556: invokestatic    com/whatsapp/Voip.d:()Z
        //  1559: istore          25
        //  1561: iload           25
        //  1563: ifeq            1574
        //  1566: aload_0        
        //  1567: invokespecial   com/whatsapp/Conversation.D:()V
        //  1570: iload_2        
        //  1571: ifeq            1583
        //  1574: aload_0        
        //  1575: getfield        com/whatsapp/Conversation.aE:Landroid/view/View;
        //  1578: bipush          8
        //  1580: invokevirtual   android/view/View.setVisibility:(I)V
        //  1583: aload_3        
        //  1584: invokevirtual   com/whatsapp/util/b0.c:()J
        //  1587: pop2           
        //  1588: iconst_1       
        //  1589: ireturn        
        //  1590: astore          81
        //  1592: aload           81
        //  1594: athrow         
        //  1595: astore          10
        //  1597: aload           10
        //  1599: athrow         
        //  1600: astore          12
        //  1602: aload           12
        //  1604: athrow         
        //  1605: astore          13
        //  1607: aload           13
        //  1609: athrow         
        //  1610: astore          14
        //  1612: aload           14
        //  1614: athrow         
        //  1615: aload_0        
        //  1616: aload_0        
        //  1617: aload_0        
        //  1618: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //  1621: aload           54
        //  1623: invokestatic    com/whatsapp/util/br.b:(Landroid/net/Uri;)Ljava/io/File;
        //  1626: iconst_2       
        //  1627: iconst_1       
        //  1628: invokestatic    com/whatsapp/util/br.a:(Landroid/app/Activity;Lcom/whatsapp/gu;Ljava/lang/String;Ljava/io/File;BZ)Z
        //  1631: pop            
        //  1632: iload_2        
        //  1633: ifeq            1092
        //  1636: aload           54
        //  1638: invokestatic    com/whatsapp/util/br.b:(Landroid/net/Uri;)Ljava/io/File;
        //  1641: astore          68
        //  1643: aload           54
        //  1645: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1648: bipush          27
        //  1650: aaload         
        //  1651: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  1654: astore          69
        //  1656: aload           11
        //  1658: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1661: bipush          15
        //  1663: aaload         
        //  1664: iconst_0       
        //  1665: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //  1668: ifeq            1692
        //  1671: aload_0        
        //  1672: aload_0        
        //  1673: aload_0        
        //  1674: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //  1677: aload           68
        //  1679: iconst_3       
        //  1680: iconst_0       
        //  1681: iconst_1       
        //  1682: aload           69
        //  1684: invokestatic    com/whatsapp/util/br.a:(Landroid/app/Activity;Lcom/whatsapp/gu;Ljava/lang/String;Ljava/io/File;BIZLjava/lang/String;)Z
        //  1687: pop            
        //  1688: iload_2        
        //  1689: ifeq            1092
        //  1692: aload           68
        //  1694: invokestatic    com/whatsapp/wm.c:(Ljava/io/File;)Z
        //  1697: istore          74
        //  1699: iload           74
        //  1701: ifeq            1718
        //  1704: aload_0        
        //  1705: aload_0        
        //  1706: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //  1709: aload           68
        //  1711: invokestatic    com/whatsapp/VideoPreviewActivity.a:(Landroid/app/Activity;Lcom/whatsapp/a_9;Ljava/io/File;)V
        //  1714: iload_2        
        //  1715: ifeq            1092
        //  1718: aload_0        
        //  1719: aload_0        
        //  1720: aload_0        
        //  1721: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //  1724: aload           68
        //  1726: iconst_3       
        //  1727: iconst_0       
        //  1728: iconst_1       
        //  1729: aload           69
        //  1731: invokestatic    com/whatsapp/util/br.a:(Landroid/app/Activity;Lcom/whatsapp/gu;Ljava/lang/String;Ljava/io/File;BIZLjava/lang/String;)Z
        //  1734: pop            
        //  1735: iload_2        
        //  1736: ifeq            1092
        //  1739: aload           34
        //  1741: aload           54
        //  1743: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1746: pop            
        //  1747: iload_2        
        //  1748: ifeq            1092
        //  1751: aload_0        
        //  1752: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //  1755: aload           11
        //  1757: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1760: bipush          20
        //  1762: aaload         
        //  1763: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //  1766: aload           11
        //  1768: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1771: bipush          40
        //  1773: aaload         
        //  1774: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //  1777: invokestatic    com/whatsapp/App.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //  1780: iload_2        
        //  1781: ifeq            1092
        //  1784: goto            1088
        //  1787: astore          57
        //  1789: aload           57
        //  1791: athrow         
        //  1792: astore          58
        //  1794: aload           58
        //  1796: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //  1799: astore          62
        //  1801: aload           62
        //  1803: ifnull          1844
        //  1806: aload           58
        //  1808: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //  1811: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1814: bipush          21
        //  1816: aaload         
        //  1817: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //  1820: istore          63
        //  1822: iload           63
        //  1824: ifeq            1844
        //  1827: aload_0        
        //  1828: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  1831: ldc_w           2131231078
        //  1834: invokevirtual   com/whatsapp/App.getString:(I)Ljava/lang/String;
        //  1837: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/gu;Ljava/lang/String;)V
        //  1840: iload_2        
        //  1841: ifeq            1855
        //  1844: aload_0        
        //  1845: invokevirtual   com/whatsapp/Conversation.getBaseContext:()Landroid/content/Context;
        //  1848: ldc_w           2131231735
        //  1851: iconst_0       
        //  1852: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //  1855: new             Ljava/lang/StringBuilder;
        //  1858: dup            
        //  1859: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1862: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1865: bipush          34
        //  1867: aaload         
        //  1868: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1871: aload           58
        //  1873: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //  1876: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1879: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1882: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  1885: goto            1096
        //  1888: astore          70
        //  1890: aload           70
        //  1892: athrow         
        //  1893: astore          71
        //  1895: aload           71
        //  1897: athrow         
        //  1898: astore          72
        //  1900: aload           72
        //  1902: athrow         
        //  1903: astore          73
        //  1905: aload           73
        //  1907: athrow         
        //  1908: astore          66
        //  1910: aload           66
        //  1912: athrow         
        //  1913: astore          64
        //  1915: aload           64
        //  1917: athrow         
        //  1918: astore          65
        //  1920: aload           65
        //  1922: athrow         
        //  1923: astore          56
        //  1925: new             Ljava/lang/StringBuilder;
        //  1928: dup            
        //  1929: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1932: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1935: bipush          17
        //  1937: aaload         
        //  1938: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1941: aload           56
        //  1943: invokevirtual   java/lang/OutOfMemoryError.toString:()Ljava/lang/String;
        //  1946: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1949: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1952: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  1955: aload_0        
        //  1956: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  1959: ldc_w           2131231082
        //  1962: invokevirtual   com/whatsapp/App.getString:(I)Ljava/lang/String;
        //  1965: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/gu;Ljava/lang/String;)V
        //  1968: goto            1096
        //  1971: astore          59
        //  1973: aload           59
        //  1975: athrow         
        //  1976: astore          60
        //  1978: aload           60
        //  1980: athrow         
        //  1981: astore          61
        //  1983: aload           61
        //  1985: athrow         
        //  1986: astore          36
        //  1988: aload           36
        //  1990: athrow         
        //  1991: astore          37
        //  1993: aload           37
        //  1995: athrow         
        //  1996: astore          46
        //  1998: aload           46
        //  2000: athrow         
        //  2001: astore          40
        //  2003: aload           40
        //  2005: athrow         
        //  2006: astore          41
        //  2008: aload           41
        //  2010: athrow         
        //  2011: astore          42
        //  2013: aload           42
        //  2015: athrow         
        //  2016: astore          16
        //  2018: aload           16
        //  2020: athrow         
        //  2021: astore          17
        //  2023: aload           17
        //  2025: athrow         
        //  2026: astore          28
        //  2028: aload           28
        //  2030: athrow         
        //  2031: astore          19
        //  2033: aload           19
        //  2035: athrow         
        //  2036: astore          20
        //  2038: aload           20
        //  2040: athrow         
        //  2041: astore          23
        //  2043: aload           23
        //  2045: athrow         
        //  2046: astore          24
        //  2048: aload           24
        //  2050: athrow         
        //  2051: iload           32
        //  2053: istore          55
        //  2055: goto            1014
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  22     61     216    221    Ljava/io/IOException;
        //  65     88     221    226    Ljava/io/IOException;
        //  93     110    226    231    Ljava/io/IOException;
        //  126    144    231    236    Ljava/io/IOException;
        //  149    168    236    241    Ljava/io/IOException;
        //  173    192    241    246    Ljava/io/IOException;
        //  218    221    221    226    Ljava/io/IOException;
        //  223    226    226    231    Ljava/io/IOException;
        //  233    236    236    241    Ljava/io/IOException;
        //  238    241    241    246    Ljava/io/IOException;
        //  261    266    501    506    Ljava/io/IOException;
        //  313    332    506    511    Ljava/io/IOException;
        //  381    403    511    516    Ljava/io/IOException;
        //  408    461    516    521    Ljava/io/IOException;
        //  513    516    516    521    Ljava/io/IOException;
        //  525    534    536    541    Ljava/io/IOException;
        //  545    554    556    561    Ljava/io/IOException;
        //  564    575    655    660    Ljava/io/IOException;
        //  580    591    655    660    Ljava/io/IOException;
        //  591    653    660    665    Ljava/io/IOException;
        //  805    827    1590   1595   Ljava/io/IOException;
        //  831    858    1595   1600   Ljava/io/IOException;
        //  864    885    1600   1605   Ljava/io/IOException;
        //  890    895    1605   1610   Ljava/io/IOException;
        //  900    922    1610   1615   Ljava/io/IOException;
        //  1003   1010   1792   1986   Ljava/io/IOException;
        //  1003   1010   1923   1971   Ljava/lang/OutOfMemoryError;
        //  1014   1055   1787   1792   Ljava/io/IOException;
        //  1014   1055   1923   1971   Ljava/lang/OutOfMemoryError;
        //  1088   1092   1918   1923   Ljava/io/IOException;
        //  1088   1092   1923   1971   Ljava/lang/OutOfMemoryError;
        //  1096   1103   1986   1991   Ljava/io/IOException;
        //  1108   1129   1991   1996   Ljava/io/IOException;
        //  1277   1306   1996   2001   Ljava/io/IOException;
        //  1328   1335   2001   2006   Ljava/io/IOException;
        //  1340   1354   2006   2011   Ljava/io/IOException;
        //  1359   1375   2011   2016   Ljava/io/IOException;
        //  1379   1388   2011   2016   Ljava/io/IOException;
        //  1406   1413   2016   2021   Ljava/io/IOException;
        //  1418   1458   2021   2026   Ljava/io/IOException;
        //  1458   1466   2026   2031   Ljava/io/IOException;
        //  1470   1500   2031   2036   Ljava/io/IOException;
        //  1509   1537   2036   2041   Ljava/io/IOException;
        //  1541   1556   2036   2041   Ljava/io/IOException;
        //  1556   1561   2041   2046   Ljava/io/IOException;
        //  1566   1570   2046   2051   Ljava/io/IOException;
        //  1574   1583   2046   2051   Ljava/io/IOException;
        //  1602   1605   1605   1610   Ljava/io/IOException;
        //  1607   1610   1610   1615   Ljava/io/IOException;
        //  1615   1632   1787   1792   Ljava/io/IOException;
        //  1615   1632   1923   1971   Ljava/lang/OutOfMemoryError;
        //  1636   1656   1792   1986   Ljava/io/IOException;
        //  1636   1656   1923   1971   Ljava/lang/OutOfMemoryError;
        //  1656   1688   1888   1893   Ljava/io/IOException;
        //  1656   1688   1923   1971   Ljava/lang/OutOfMemoryError;
        //  1692   1699   1893   1898   Ljava/io/IOException;
        //  1692   1699   1923   1971   Ljava/lang/OutOfMemoryError;
        //  1704   1714   1898   1903   Ljava/io/IOException;
        //  1704   1714   1923   1971   Ljava/lang/OutOfMemoryError;
        //  1718   1735   1903   1908   Ljava/io/IOException;
        //  1718   1735   1923   1971   Ljava/lang/OutOfMemoryError;
        //  1739   1747   1908   1913   Ljava/io/IOException;
        //  1739   1747   1923   1971   Ljava/lang/OutOfMemoryError;
        //  1751   1780   1913   1918   Ljava/io/IOException;
        //  1751   1780   1923   1971   Ljava/lang/OutOfMemoryError;
        //  1789   1792   1792   1986   Ljava/io/IOException;
        //  1789   1792   1923   1971   Ljava/lang/OutOfMemoryError;
        //  1794   1801   1971   1976   Ljava/io/IOException;
        //  1806   1822   1976   1981   Ljava/io/IOException;
        //  1827   1840   1981   1986   Ljava/io/IOException;
        //  1844   1855   1981   1986   Ljava/io/IOException;
        //  1890   1893   1893   1898   Ljava/io/IOException;
        //  1890   1893   1923   1971   Ljava/lang/OutOfMemoryError;
        //  1895   1898   1898   1903   Ljava/io/IOException;
        //  1895   1898   1923   1971   Ljava/lang/OutOfMemoryError;
        //  1900   1903   1903   1908   Ljava/io/IOException;
        //  1900   1903   1923   1971   Ljava/lang/OutOfMemoryError;
        //  1905   1908   1908   1913   Ljava/io/IOException;
        //  1905   1908   1923   1971   Ljava/lang/OutOfMemoryError;
        //  1910   1913   1913   1918   Ljava/io/IOException;
        //  1910   1913   1923   1971   Ljava/lang/OutOfMemoryError;
        //  1915   1918   1918   1923   Ljava/io/IOException;
        //  1915   1918   1923   1971   Ljava/lang/OutOfMemoryError;
        //  1920   1923   1792   1986   Ljava/io/IOException;
        //  1920   1923   1923   1971   Ljava/lang/OutOfMemoryError;
        //  1973   1976   1976   1981   Ljava/io/IOException;
        //  1978   1981   1981   1986   Ljava/io/IOException;
        //  1988   1991   1991   1996   Ljava/io/IOException;
        //  2003   2006   2006   2011   Ljava/io/IOException;
        //  2008   2011   2011   2016   Ljava/io/IOException;
        //  2018   2021   2021   2026   Ljava/io/IOException;
        //  2028   2031   2031   2036   Ljava/io/IOException;
        //  2043   2046   2046   2051   Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 959, Size: 959
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
    
    private static int l(final bi p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/protocol/bi.I:B
        //     4: istore          4
        //     6: iload           4
        //     8: tableswitch {
        //                0: 101
        //                1: 226
        //                2: 164
        //                3: 250
        //                4: 298
        //                5: 274
        //                6: 60
        //                7: 60
        //                8: 322
        //          default: 60
        //        }
        //    60: aload_0        
        //    61: getfield        com/whatsapp/protocol/bi.c:I
        //    64: istore          27
        //    66: iload           27
        //    68: iconst_m1      
        //    69: if_icmpne       365
        //    72: aload_0        
        //    73: getfield        com/whatsapp/protocol/bi.I:B
        //    76: istore          28
        //    78: iload           28
        //    80: iconst_m1      
        //    81: if_icmpne       365
        //    84: aload_0        
        //    85: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    88: getfield        com/whatsapp/protocol/c6.b:Z
        //    91: istore          29
        //    93: iload           29
        //    95: ifeq            362
        //    98: bipush          6
        //   100: ireturn        
        //   101: aload_0        
        //   102: getfield        com/whatsapp/protocol/bi.c:I
        //   105: istore          20
        //   107: iload           20
        //   109: bipush          6
        //   111: if_icmpne       140
        //   114: aload_0        
        //   115: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   118: getfield        com/whatsapp/protocol/c6.b:Z
        //   121: istore          23
        //   123: iload           23
        //   125: ifne            98
        //   128: bipush          15
        //   130: ireturn        
        //   131: astore_1       
        //   132: aload_1        
        //   133: athrow         
        //   134: astore_2       
        //   135: aload_2        
        //   136: athrow         
        //   137: astore_3       
        //   138: aload_3        
        //   139: athrow         
        //   140: aload_0        
        //   141: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   144: getfield        com/whatsapp/protocol/c6.b:Z
        //   147: istore          22
        //   149: iload           22
        //   151: ifeq            161
        //   154: iconst_0       
        //   155: ireturn        
        //   156: astore          21
        //   158: aload           21
        //   160: athrow         
        //   161: bipush          9
        //   163: ireturn        
        //   164: aload_0        
        //   165: getfield        com/whatsapp/protocol/bi.E:I
        //   168: istore          17
        //   170: iload           17
        //   172: iconst_1       
        //   173: if_icmpne       202
        //   176: aload_0        
        //   177: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   180: getfield        com/whatsapp/protocol/c6.b:Z
        //   183: ifeq            199
        //   186: bipush          7
        //   188: ireturn        
        //   189: astore          15
        //   191: aload           15
        //   193: athrow         
        //   194: astore          16
        //   196: aload           16
        //   198: athrow         
        //   199: bipush          16
        //   201: ireturn        
        //   202: aload_0        
        //   203: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   206: getfield        com/whatsapp/protocol/c6.b:Z
        //   209: istore          19
        //   211: iload           19
        //   213: ifeq            223
        //   216: iconst_2       
        //   217: ireturn        
        //   218: astore          18
        //   220: aload           18
        //   222: athrow         
        //   223: bipush          11
        //   225: ireturn        
        //   226: aload_0        
        //   227: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   230: getfield        com/whatsapp/protocol/c6.b:Z
        //   233: istore          14
        //   235: iload           14
        //   237: ifeq            247
        //   240: iconst_1       
        //   241: ireturn        
        //   242: astore          13
        //   244: aload           13
        //   246: athrow         
        //   247: bipush          10
        //   249: ireturn        
        //   250: aload_0        
        //   251: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   254: getfield        com/whatsapp/protocol/c6.b:Z
        //   257: istore          12
        //   259: iload           12
        //   261: ifeq            271
        //   264: iconst_3       
        //   265: ireturn        
        //   266: astore          11
        //   268: aload           11
        //   270: athrow         
        //   271: bipush          12
        //   273: ireturn        
        //   274: aload_0        
        //   275: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   278: getfield        com/whatsapp/protocol/c6.b:Z
        //   281: istore          10
        //   283: iload           10
        //   285: ifeq            295
        //   288: iconst_4       
        //   289: ireturn        
        //   290: astore          9
        //   292: aload           9
        //   294: athrow         
        //   295: bipush          13
        //   297: ireturn        
        //   298: aload_0        
        //   299: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   302: getfield        com/whatsapp/protocol/c6.b:Z
        //   305: istore          8
        //   307: iload           8
        //   309: ifeq            319
        //   312: iconst_5       
        //   313: ireturn        
        //   314: astore          7
        //   316: aload           7
        //   318: athrow         
        //   319: bipush          14
        //   321: ireturn        
        //   322: aload_0        
        //   323: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   326: getfield        com/whatsapp/protocol/c6.b:Z
        //   329: istore          6
        //   331: iload           6
        //   333: ifeq            344
        //   336: bipush          8
        //   338: ireturn        
        //   339: astore          5
        //   341: aload           5
        //   343: athrow         
        //   344: bipush          17
        //   346: ireturn        
        //   347: astore          24
        //   349: aload           24
        //   351: athrow         
        //   352: astore          25
        //   354: aload           25
        //   356: athrow         
        //   357: astore          26
        //   359: aload           26
        //   361: athrow         
        //   362: bipush          15
        //   364: ireturn        
        //   365: iconst_m1      
        //   366: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      6      131    134    Landroid/content/ActivityNotFoundException;
        //  60     66     347    352    Landroid/content/ActivityNotFoundException;
        //  72     78     352    357    Landroid/content/ActivityNotFoundException;
        //  84     93     357    362    Landroid/content/ActivityNotFoundException;
        //  101    107    134    137    Landroid/content/ActivityNotFoundException;
        //  114    123    137    140    Landroid/content/ActivityNotFoundException;
        //  132    134    134    137    Landroid/content/ActivityNotFoundException;
        //  135    137    137    140    Landroid/content/ActivityNotFoundException;
        //  140    149    156    161    Landroid/content/ActivityNotFoundException;
        //  164    170    189    194    Landroid/content/ActivityNotFoundException;
        //  176    186    194    199    Landroid/content/ActivityNotFoundException;
        //  191    194    194    199    Landroid/content/ActivityNotFoundException;
        //  202    211    218    223    Landroid/content/ActivityNotFoundException;
        //  226    235    242    247    Landroid/content/ActivityNotFoundException;
        //  250    259    266    271    Landroid/content/ActivityNotFoundException;
        //  274    283    290    295    Landroid/content/ActivityNotFoundException;
        //  298    307    314    319    Landroid/content/ActivityNotFoundException;
        //  322    331    339    344    Landroid/content/ActivityNotFoundException;
        //  349    352    352    357    Landroid/content/ActivityNotFoundException;
        //  354    357    357    362    Landroid/content/ActivityNotFoundException;
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
    
    private void l() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_1       
        //     2: getstatic       com/whatsapp/App.I:Z
        //     5: istore_2       
        //     6: aload_0        
        //     7: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //    10: invokevirtual   com/whatsapp/nm.getCursor:()Landroid/database/Cursor;
        //    13: astore_3       
        //    14: aload_3        
        //    15: ifnull          279
        //    18: aload_3        
        //    19: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    24: istore          11
        //    26: iload           11
        //    28: ifeq            279
        //    31: iconst_0       
        //    32: istore          4
        //    34: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //    37: aload_3        
        //    38: aload_0        
        //    39: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //    42: invokevirtual   com/whatsapp/vy.a:(Landroid/database/Cursor;Ljava/lang/String;)Lcom/whatsapp/protocol/bi;
        //    45: astore          12
        //    47: aload           12
        //    49: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    52: getfield        com/whatsapp/protocol/c6.b:Z
        //    55: ifeq            87
        //    58: aload           12
        //    60: getfield        com/whatsapp/protocol/bi.c:I
        //    63: istore          17
        //    65: iload           17
        //    67: bipush          6
        //    69: if_icmpne       87
        //    72: aload           12
        //    74: invokestatic    com/whatsapp/adc.a:(Lcom/whatsapp/protocol/bi;)Z
        //    77: istore          18
        //    79: iload           18
        //    81: ifne            87
        //    84: iinc            4, 1
        //    87: iinc            1, 1
        //    90: aload_3        
        //    91: invokeinterface android/database/Cursor.moveToNext:()Z
        //    96: ifeq            114
        //    99: aload_0        
        //   100: getfield        com/whatsapp/Conversation.av:I
        //   103: istore          14
        //   105: iload_1        
        //   106: iload           14
        //   108: iload           4
        //   110: iadd           
        //   111: if_icmplt       34
        //   114: aload_3        
        //   115: invokeinterface android/database/Cursor.getCount:()I
        //   120: istore          5
        //   122: aload_0        
        //   123: getfield        com/whatsapp/Conversation.av:I
        //   126: istore          8
        //   128: iload           8
        //   130: iload           4
        //   132: iadd           
        //   133: iload           5
        //   135: if_icmplt       232
        //   138: iload           4
        //   140: aload_0        
        //   141: getfield        com/whatsapp/Conversation.av:I
        //   144: iadd           
        //   145: iload           5
        //   147: if_icmple       223
        //   150: new             Ljava/lang/StringBuilder;
        //   153: dup            
        //   154: invokespecial   java/lang/StringBuilder.<init>:()V
        //   157: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   160: bipush          73
        //   162: aaload         
        //   163: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   166: aload_0        
        //   167: getfield        com/whatsapp/Conversation.av:I
        //   170: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   173: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   176: bipush          72
        //   178: aaload         
        //   179: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   182: iload           4
        //   184: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   187: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   190: bipush          70
        //   192: aaload         
        //   193: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   196: iload           5
        //   198: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   201: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   204: bipush          71
        //   206: aaload         
        //   207: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   210: aload_0        
        //   211: getfield        com/whatsapp/Conversation.G:I
        //   214: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   217: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   220: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   223: aload_0        
        //   224: iconst_0       
        //   225: putfield        com/whatsapp/Conversation.av:I
        //   228: iload_2        
        //   229: ifeq            243
        //   232: aload_0        
        //   233: iload           4
        //   235: aload_0        
        //   236: getfield        com/whatsapp/Conversation.av:I
        //   239: iadd           
        //   240: putfield        com/whatsapp/Conversation.av:I
        //   243: return         
        //   244: astore          10
        //   246: aload           10
        //   248: athrow         
        //   249: astore          15
        //   251: aload           15
        //   253: athrow         
        //   254: astore          16
        //   256: aload           16
        //   258: athrow         
        //   259: astore          13
        //   261: aload           13
        //   263: athrow         
        //   264: astore          6
        //   266: aload           6
        //   268: athrow         
        //   269: astore          7
        //   271: aload           7
        //   273: athrow         
        //   274: astore          9
        //   276: aload           9
        //   278: athrow         
        //   279: iconst_0       
        //   280: istore          4
        //   282: goto            114
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  18     26     244    249    Landroid/content/ActivityNotFoundException;
        //  58     65     249    254    Landroid/content/ActivityNotFoundException;
        //  72     79     254    259    Landroid/content/ActivityNotFoundException;
        //  90     105    259    264    Landroid/content/ActivityNotFoundException;
        //  122    128    264    269    Landroid/content/ActivityNotFoundException;
        //  138    223    269    274    Landroid/content/ActivityNotFoundException;
        //  223    228    274    279    Landroid/content/ActivityNotFoundException;
        //  232    243    274    279    Landroid/content/ActivityNotFoundException;
        //  251    254    254    259    Landroid/content/ActivityNotFoundException;
        //  266    269    269    274    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 135, Size: 135
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
    
    static void l(final Conversation conversation) {
        conversation.e();
    }
    
    static boolean l(final Conversation conversation, final boolean a4) {
        return conversation.a4 = a4;
    }
    
    static ConversationTextEntry m(final Conversation conversation) {
        return conversation.X;
    }
    
    public static void m() {
        g((String)null);
    }
    
    static boolean m(final Conversation conversation, final boolean a1) {
        return conversation.a1 = a1;
    }
    
    static TextView n(final Conversation conversation) {
        return conversation.ah;
    }
    
    private void n() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_1       
        //     2: getstatic       com/whatsapp/App.I:Z
        //     5: istore_2       
        //     6: aload_0        
        //     7: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //    10: invokevirtual   com/whatsapp/a_9.m:()Z
        //    13: istore          7
        //    15: iload           7
        //    17: ifne            311
        //    20: aload_0        
        //    21: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //    24: invokevirtual   com/whatsapp/a_9.k:()Z
        //    27: istore          10
        //    29: iload           10
        //    31: ifne            311
        //    34: aload_0        
        //    35: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //    38: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //    41: astore          11
        //    43: aload           11
        //    45: ifnonnull       311
        //    48: aload_0        
        //    49: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //    52: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    55: invokestatic    com/whatsapp/App.p:(Ljava/lang/String;)Z
        //    58: istore          12
        //    60: iload           12
        //    62: ifeq            373
        //    65: ldc_w           2131231867
        //    68: istore          13
        //    70: aload_0        
        //    71: iload           13
        //    73: invokevirtual   com/whatsapp/Conversation.getString:(I)Ljava/lang/String;
        //    76: astore          14
        //    78: aload_0        
        //    79: getfield        com/whatsapp/Conversation.aa:Landroid/view/View;
        //    82: ifnull          103
        //    85: aload_0        
        //    86: getfield        com/whatsapp/Conversation.aa:Landroid/view/View;
        //    89: ldc_w           2131755438
        //    92: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    95: checkcast       Landroid/widget/Button;
        //    98: aload           14
        //   100: invokevirtual   android/widget/Button.setText:(Ljava/lang/CharSequence;)V
        //   103: aload_0        
        //   104: getfield        com/whatsapp/Conversation.aF:Landroid/view/View;
        //   107: ifnull          128
        //   110: aload_0        
        //   111: getfield        com/whatsapp/Conversation.aF:Landroid/view/View;
        //   114: ldc_w           2131755438
        //   117: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   120: checkcast       Landroid/widget/Button;
        //   123: aload           14
        //   125: invokevirtual   android/widget/Button.setText:(Ljava/lang/CharSequence;)V
        //   128: aload_0        
        //   129: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //   132: invokevirtual   com/whatsapp/nm.getCount:()I
        //   135: istore          15
        //   137: iconst_0       
        //   138: istore          16
        //   140: iload           16
        //   142: iload           15
        //   144: if_icmpge       437
        //   147: aload_0        
        //   148: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //   151: iload           16
        //   153: invokevirtual   com/whatsapp/nm.getItem:(I)Ljava/lang/Object;
        //   156: checkcast       Lcom/whatsapp/protocol/bi;
        //   159: astore          24
        //   161: aload           24
        //   163: ifnull          431
        //   166: aload           24
        //   168: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   171: getfield        com/whatsapp/protocol/c6.b:Z
        //   174: istore          27
        //   176: iload           27
        //   178: ifeq            431
        //   181: iconst_1       
        //   182: istore          17
        //   184: iload_2        
        //   185: ifeq            198
        //   188: iload           16
        //   190: iconst_1       
        //   191: iadd           
        //   192: istore          25
        //   194: iload_2        
        //   195: ifeq            421
        //   198: iload           17
        //   200: ifne            208
        //   203: iload           15
        //   205: ifne            259
        //   208: aload_0        
        //   209: getfield        com/whatsapp/Conversation.aa:Landroid/view/View;
        //   212: ifnull          229
        //   215: aload_0        
        //   216: getfield        com/whatsapp/Conversation.aa:Landroid/view/View;
        //   219: ldc_w           2131755262
        //   222: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   225: iconst_0       
        //   226: invokevirtual   android/view/View.setVisibility:(I)V
        //   229: aload_0        
        //   230: getfield        com/whatsapp/Conversation.aF:Landroid/view/View;
        //   233: astore          22
        //   235: aload           22
        //   237: ifnull          307
        //   240: aload_0        
        //   241: getfield        com/whatsapp/Conversation.aF:Landroid/view/View;
        //   244: ldc_w           2131755262
        //   247: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   250: bipush          8
        //   252: invokevirtual   android/view/View.setVisibility:(I)V
        //   255: iload_2        
        //   256: ifeq            307
        //   259: aload_0        
        //   260: getfield        com/whatsapp/Conversation.aa:Landroid/view/View;
        //   263: ifnull          281
        //   266: aload_0        
        //   267: getfield        com/whatsapp/Conversation.aa:Landroid/view/View;
        //   270: ldc_w           2131755262
        //   273: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   276: bipush          8
        //   278: invokevirtual   android/view/View.setVisibility:(I)V
        //   281: aload_0        
        //   282: getfield        com/whatsapp/Conversation.aF:Landroid/view/View;
        //   285: ifnull          302
        //   288: aload_0        
        //   289: getfield        com/whatsapp/Conversation.aF:Landroid/view/View;
        //   292: ldc_w           2131755262
        //   295: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   298: iconst_0       
        //   299: invokevirtual   android/view/View.setVisibility:(I)V
        //   302: aload_0        
        //   303: aconst_null    
        //   304: invokespecial   com/whatsapp/Conversation.a:(Landroid/graphics/drawable/Drawable;)V
        //   307: iload_2        
        //   308: ifeq            354
        //   311: aload_0        
        //   312: getfield        com/whatsapp/Conversation.aa:Landroid/view/View;
        //   315: ifnull          333
        //   318: aload_0        
        //   319: getfield        com/whatsapp/Conversation.aa:Landroid/view/View;
        //   322: ldc_w           2131755262
        //   325: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   328: bipush          8
        //   330: invokevirtual   android/view/View.setVisibility:(I)V
        //   333: aload_0        
        //   334: getfield        com/whatsapp/Conversation.aF:Landroid/view/View;
        //   337: ifnull          354
        //   340: aload_0        
        //   341: getfield        com/whatsapp/Conversation.aF:Landroid/view/View;
        //   344: ldc_w           2131755262
        //   347: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   350: iconst_0       
        //   351: invokevirtual   android/view/View.setVisibility:(I)V
        //   354: return         
        //   355: astore_3       
        //   356: aload_3        
        //   357: athrow         
        //   358: astore          4
        //   360: aload           4
        //   362: athrow         
        //   363: astore          5
        //   365: aload           5
        //   367: athrow         
        //   368: astore          6
        //   370: aload           6
        //   372: athrow         
        //   373: ldc_w           2131230839
        //   376: istore          13
        //   378: goto            70
        //   381: astore          26
        //   383: aload           26
        //   385: athrow         
        //   386: astore          18
        //   388: aload           18
        //   390: athrow         
        //   391: astore          19
        //   393: aload           19
        //   395: athrow         
        //   396: astore          20
        //   398: aload           20
        //   400: athrow         
        //   401: astore          21
        //   403: aload           21
        //   405: athrow         
        //   406: astore          23
        //   408: aload           23
        //   410: athrow         
        //   411: astore          8
        //   413: aload           8
        //   415: athrow         
        //   416: astore          9
        //   418: aload           9
        //   420: athrow         
        //   421: iload           25
        //   423: istore          16
        //   425: iload           17
        //   427: istore_1       
        //   428: goto            140
        //   431: iload_1        
        //   432: istore          17
        //   434: goto            188
        //   437: iload_1        
        //   438: istore          17
        //   440: goto            198
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  6      15     355    358    Landroid/content/ActivityNotFoundException;
        //  20     29     358    363    Landroid/content/ActivityNotFoundException;
        //  34     43     363    368    Landroid/content/ActivityNotFoundException;
        //  48     60     368    373    Landroid/content/ActivityNotFoundException;
        //  166    176    381    386    Landroid/content/ActivityNotFoundException;
        //  208    229    386    391    Landroid/content/ActivityNotFoundException;
        //  229    235    391    396    Landroid/content/ActivityNotFoundException;
        //  240    255    396    401    Landroid/content/ActivityNotFoundException;
        //  259    281    401    406    Landroid/content/ActivityNotFoundException;
        //  281    302    406    411    Landroid/content/ActivityNotFoundException;
        //  311    333    411    416    Landroid/content/ActivityNotFoundException;
        //  333    354    416    421    Landroid/content/ActivityNotFoundException;
        //  356    358    358    363    Landroid/content/ActivityNotFoundException;
        //  360    363    363    368    Landroid/content/ActivityNotFoundException;
        //  365    368    368    373    Landroid/content/ActivityNotFoundException;
        //  393    396    396    401    Landroid/content/ActivityNotFoundException;
        //  398    401    401    406    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 206, Size: 206
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
    
    private void o() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/Conversation.aj:Z
        //     4: ifeq            17
        //     7: aload_0        
        //     8: iconst_0       
        //     9: putfield        com/whatsapp/Conversation.bj:Z
        //    12: aload_0        
        //    13: iconst_0       
        //    14: putfield        com/whatsapp/Conversation.bg:Z
        //    17: aload_0        
        //    18: getfield        com/whatsapp/Conversation.bg:Z
        //    21: istore_3       
        //    22: iload_3        
        //    23: ifeq            33
        //    26: return         
        //    27: astore_1       
        //    28: aload_1        
        //    29: athrow         
        //    30: astore_2       
        //    31: aload_2        
        //    32: athrow         
        //    33: aload_0        
        //    34: iconst_1       
        //    35: putfield        com/whatsapp/Conversation.a4:Z
        //    38: aload_0        
        //    39: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //    42: new             Lcom/whatsapp/a9d;
        //    45: dup            
        //    46: aload_0        
        //    47: invokespecial   com/whatsapp/a9d.<init>:(Lcom/whatsapp/Conversation;)V
        //    50: invokevirtual   android/widget/ListView.post:(Ljava/lang/Runnable;)Z
        //    53: pop            
        //    54: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      17     27     30     Landroid/content/ActivityNotFoundException;
        //  17     22     30     33     Landroid/content/ActivityNotFoundException;
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
    
    static void o(final Conversation conversation) {
        conversation.H();
    }
    
    public static v1 p() {
        return Conversation.ac.get();
    }
    
    static boolean p(final Conversation conversation) {
        return conversation.aG;
    }
    
    static Handler q(final Conversation conversation) {
        return conversation.aZ;
    }
    
    private void q() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/Conversation.aw:Ljava/util/HashMap;
        //     8: astore          4
        //    10: aload           4
        //    12: ifnull          25
        //    15: aload_0        
        //    16: getfield        com/whatsapp/Conversation.aw:Ljava/util/HashMap;
        //    19: invokevirtual   java/util/HashMap.isEmpty:()Z
        //    22: ifeq            41
        //    25: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    28: bipush          12
        //    30: aaload         
        //    31: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    34: return         
        //    35: astore_2       
        //    36: aload_2        
        //    37: athrow         
        //    38: astore_3       
        //    39: aload_3        
        //    40: athrow         
        //    41: aload_0        
        //    42: getfield        com/whatsapp/Conversation.aw:Ljava/util/HashMap;
        //    45: invokevirtual   java/util/HashMap.values:()Ljava/util/Collection;
        //    48: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //    53: astore          5
        //    55: iconst_1       
        //    56: istore          6
        //    58: aload           5
        //    60: invokeinterface java/util/Iterator.hasNext:()Z
        //    65: ifeq            322
        //    68: aload           5
        //    70: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    75: checkcast       Lcom/whatsapp/protocol/bi;
        //    78: astore          10
        //    80: aload           10
        //    82: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //    85: instanceof      Lcom/whatsapp/MediaData;
        //    88: ifeq            269
        //    91: aload           10
        //    93: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //    96: checkcast       Lcom/whatsapp/MediaData;
        //    99: astore          12
        //   101: aload           12
        //   103: ifnull          315
        //   106: aload           12
        //   108: getfield        com/whatsapp/MediaData.transferred:Z
        //   111: istore          19
        //   113: iload           19
        //   115: ifne            315
        //   118: aload           10
        //   120: getfield        com/whatsapp/protocol/bi.I:B
        //   123: istore          20
        //   125: iload           20
        //   127: iconst_4       
        //   128: if_icmpeq       315
        //   131: aload           10
        //   133: getfield        com/whatsapp/protocol/bi.I:B
        //   136: iconst_5       
        //   137: if_icmpeq       315
        //   140: aload           10
        //   142: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   145: getfield        com/whatsapp/protocol/c6.b:Z
        //   148: istore          21
        //   150: iload           21
        //   152: ifeq            315
        //   155: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   158: bipush          13
        //   160: aaload         
        //   161: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   164: aload_0        
        //   165: ldc_w           2131231316
        //   168: iconst_0       
        //   169: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   172: iload_1        
        //   173: ifeq            302
        //   176: iconst_0       
        //   177: istore          13
        //   179: aload           10
        //   181: getfield        com/whatsapp/protocol/bi.I:B
        //   184: istore          15
        //   186: iload           15
        //   188: bipush          8
        //   190: if_icmpne       308
        //   193: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   196: bipush          10
        //   198: aaload         
        //   199: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   202: aload_0        
        //   203: ldc_w           2131231315
        //   206: iconst_0       
        //   207: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   210: iload_1        
        //   211: ifeq            302
        //   214: iconst_0       
        //   215: istore          7
        //   217: iload_1        
        //   218: ifeq            295
        //   221: iload           7
        //   223: ifeq            329
        //   226: new             Landroid/content/Intent;
        //   229: dup            
        //   230: aload_0        
        //   231: ldc_w           Lcom/whatsapp/ContactPicker;.class
        //   234: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   237: astore          8
        //   239: aload           8
        //   241: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   244: bipush          11
        //   246: aaload         
        //   247: iconst_1       
        //   248: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   251: pop            
        //   252: aload_0        
        //   253: aload           8
        //   255: iconst_2       
        //   256: invokevirtual   com/whatsapp/Conversation.startActivityForResult:(Landroid/content/Intent;I)V
        //   259: iconst_0       
        //   260: putstatic       com/whatsapp/Conversation.a_:Z
        //   263: return         
        //   264: astore          11
        //   266: aload           11
        //   268: athrow         
        //   269: aconst_null    
        //   270: astore          12
        //   272: goto            101
        //   275: astore          16
        //   277: aload           16
        //   279: athrow         
        //   280: astore          17
        //   282: aload           17
        //   284: athrow         
        //   285: astore          18
        //   287: aload           18
        //   289: athrow         
        //   290: astore          14
        //   292: aload           14
        //   294: athrow         
        //   295: iload           7
        //   297: istore          6
        //   299: goto            58
        //   302: iconst_0       
        //   303: istore          7
        //   305: goto            221
        //   308: iload           13
        //   310: istore          7
        //   312: goto            217
        //   315: iload           6
        //   317: istore          13
        //   319: goto            179
        //   322: iload           6
        //   324: istore          7
        //   326: goto            221
        //   329: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  4      10     35     38     Landroid/content/ActivityNotFoundException;
        //  15     25     38     41     Landroid/content/ActivityNotFoundException;
        //  25     34     38     41     Landroid/content/ActivityNotFoundException;
        //  36     38     38     41     Landroid/content/ActivityNotFoundException;
        //  80     101    264    269    Landroid/content/ActivityNotFoundException;
        //  106    113    275    280    Landroid/content/ActivityNotFoundException;
        //  118    125    280    285    Landroid/content/ActivityNotFoundException;
        //  131    150    285    290    Landroid/content/ActivityNotFoundException;
        //  179    186    290    295    Landroid/content/ActivityNotFoundException;
        //  277    280    280    285    Landroid/content/ActivityNotFoundException;
        //  282    285    285    290    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 155, Size: 155
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
    
    private void r() {
        this.aL.hideSoftInputFromWindow(this.X.getWindowToken(), 0);
    }
    
    static void r(final Conversation conversation) {
        conversation.s();
    }
    
    private void s() {
        this.aX.removeCallbacks(this.bl);
        final View ao = this.aO;
        final int[] array = new int[2];
        ao.getLocationOnScreen(array);
        final Display defaultDisplay = this.getWindowManager().getDefaultDisplay();
        if (defaultDisplay.getHeight() - (array[1] + ao.getHeight()) > 128.0f * this.a5.b) {
            int n = defaultDisplay.getHeight() - (array[1] + ao.getHeight());
            Log.i(Conversation.cb[66] + n);
            if (n == 0) {
                n = 2 * defaultDisplay.getHeight() / 5;
            }
            Math.max(n, 4 * this.getResources().getDimensionPixelSize(2131361909));
            this.r();
            this.Z.a(true);
            this.Z.a(ao, this.a2, this.a6, (View)this.X);
            this.aX.setFreezeHeight();
            if (!App.I) {
                return;
            }
        }
        int b = this.Z.b();
        Log.i(Conversation.cb[65] + b);
        if (b == 0) {
            b = 2 * defaultDisplay.getHeight() / 5;
        }
        final int max = Math.max(b, 4 * this.getResources().getDimensionPixelSize(2131361909));
        this.aI.setTranscriptMode(2);
        this.aI.setFastScrollEnabled(false);
        this.ax.sendEmptyMessageDelayed(0, 1000L);
        this.Z.a(false);
        this.Z.a(ao, this.a2, this.a6, (View)this.X);
        this.aX.setFreezeHeight(this.aX.getHeight() - max);
    }
    
    static void s(final Conversation conversation) {
        conversation.f();
    }
    
    static ArrayList t(final Conversation conversation) {
        return conversation.bc;
    }
    
    private void t() {
        try {
            if (this.aM != null) {
                this.aM.finish();
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    private void u() {
        final String externalStorageState = Environment.getExternalStorageState();
        try {
            if (!externalStorageState.equals(Conversation.cb[81])) {
                this.showDialog(15);
                return;
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
        try {
            if (App.C() < 1024 * (1024 * ym.k)) {
                this.a(2131231078);
                return;
            }
        }
        catch (ActivityNotFoundException ex2) {
            throw ex2;
        }
        try {
            if (App.p(this.I)) {
                this.showDialog(106);
                return;
            }
        }
        catch (ActivityNotFoundException ex3) {
            throw ex3;
        }
        final Intent intent = new Intent((Context)this, (Class)CameraActivity.class);
        intent.putExtra(Conversation.cb[80], this.I);
        this.startActivity(intent);
    }
    
    static void u(final Conversation conversation) {
        conversation.t();
    }
    
    static HashSet v(final Conversation conversation) {
        return conversation.ad;
    }
    
    private boolean v() {
        return this.getSharedPreferences(Conversation.cb[78], 0).getBoolean(Conversation.cb[79], false);
    }
    
    static TextView w(final Conversation conversation) {
        return conversation.be;
    }
    
    private void w() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/Conversation.aw:Ljava/util/HashMap;
        //     8: ifnull          25
        //    11: aload_0        
        //    12: getfield        com/whatsapp/Conversation.aw:Ljava/util/HashMap;
        //    15: invokevirtual   java/util/HashMap.isEmpty:()Z
        //    18: istore          4
        //    20: iload           4
        //    22: ifeq            41
        //    25: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    28: bipush          9
        //    30: aaload         
        //    31: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    34: return         
        //    35: astore_2       
        //    36: aload_2        
        //    37: athrow         
        //    38: astore_3       
        //    39: aload_3        
        //    40: athrow         
        //    41: new             Ljava/lang/StringBuilder;
        //    44: dup            
        //    45: invokespecial   java/lang/StringBuilder.<init>:()V
        //    48: astore          5
        //    50: aload_0        
        //    51: invokespecial   com/whatsapp/Conversation.B:()Ljava/util/ArrayList;
        //    54: astore          6
        //    56: aload           6
        //    58: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    61: astore          7
        //    63: aload           7
        //    65: invokeinterface java/util/Iterator.hasNext:()Z
        //    70: ifeq            266
        //    73: aload           7
        //    75: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    80: checkcast       Lcom/whatsapp/protocol/bi;
        //    83: astore          14
        //    85: aload           14
        //    87: getfield        com/whatsapp/protocol/bi.I:B
        //    90: ifne            262
        //    93: aload           5
        //    95: invokevirtual   java/lang/StringBuilder.length:()I
        //    98: istore          17
        //   100: iload           17
        //   102: ifeq            113
        //   105: aload           5
        //   107: bipush          10
        //   109: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   112: pop            
        //   113: aload           6
        //   115: invokevirtual   java/util/ArrayList.size:()I
        //   118: iconst_1       
        //   119: if_icmple       251
        //   122: aload           5
        //   124: bipush          91
        //   126: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   129: aload_0        
        //   130: aload           14
        //   132: getfield        com/whatsapp/protocol/bi.u:J
        //   135: ldc_w           655377
        //   138: invokestatic    android/text/format/DateUtils.formatDateTime:(Landroid/content/Context;JI)Ljava/lang/String;
        //   141: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   144: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   147: bipush          7
        //   149: aaload         
        //   150: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   153: pop            
        //   154: aload           14
        //   156: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   159: getfield        com/whatsapp/protocol/c6.b:Z
        //   162: istore          23
        //   164: iload           23
        //   166: ifeq            183
        //   169: aload           5
        //   171: aload_0        
        //   172: invokestatic    com/whatsapp/App.q:(Landroid/content/Context;)Ljava/lang/String;
        //   175: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   178: pop            
        //   179: iload_1        
        //   180: ifeq            240
        //   183: aload_0        
        //   184: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   187: invokevirtual   com/whatsapp/a_9.m:()Z
        //   190: istore          24
        //   192: iload           24
        //   194: ifeq            226
        //   197: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   200: aload           14
        //   202: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   205: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   208: astore          28
        //   210: aload           5
        //   212: aload           28
        //   214: aload_0        
        //   215: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   218: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   221: pop            
        //   222: iload_1        
        //   223: ifeq            240
        //   226: aload           5
        //   228: aload_0        
        //   229: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   232: aload_0        
        //   233: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   236: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   239: pop            
        //   240: aload           5
        //   242: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   245: iconst_5       
        //   246: aaload         
        //   247: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   250: pop            
        //   251: aload           5
        //   253: aload           14
        //   255: invokevirtual   com/whatsapp/protocol/bi.c:()Ljava/lang/String;
        //   258: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   261: pop            
        //   262: iload_1        
        //   263: ifeq            63
        //   266: aload_0        
        //   267: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   270: bipush          6
        //   272: aaload         
        //   273: invokevirtual   com/whatsapp/Conversation.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   276: checkcast       Landroid/text/ClipboardManager;
        //   279: astore          8
        //   281: aload           8
        //   283: aload           5
        //   285: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   288: invokevirtual   android/text/ClipboardManager.setText:(Ljava/lang/CharSequence;)V
        //   291: aload           6
        //   293: invokevirtual   java/util/ArrayList.size:()I
        //   296: iconst_1       
        //   297: if_icmpne       312
        //   300: aload_0        
        //   301: ldc_w           2131231319
        //   304: iconst_0       
        //   305: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   308: iload_1        
        //   309: ifeq            419
        //   312: getstatic       com/whatsapp/App.C:Lcom/whatsapp/aai;
        //   315: ldc_w           2131296276
        //   318: aload           6
        //   320: invokevirtual   java/util/ArrayList.size:()I
        //   323: invokevirtual   com/whatsapp/aai.a:(II)Ljava/lang/String;
        //   326: astore          12
        //   328: iconst_1       
        //   329: anewarray       Ljava/lang/Object;
        //   332: astore          13
        //   334: aload           13
        //   336: iconst_0       
        //   337: aload           6
        //   339: invokevirtual   java/util/ArrayList.size:()I
        //   342: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   345: aastore        
        //   346: aload_0        
        //   347: aload           12
        //   349: aload           13
        //   351: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   354: iconst_0       
        //   355: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;Ljava/lang/String;I)V
        //   358: return         
        //   359: astore          10
        //   361: aload           10
        //   363: athrow         
        //   364: astore          11
        //   366: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   369: bipush          8
        //   371: aaload         
        //   372: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   375: aload_0        
        //   376: ldc_w           2131231911
        //   379: iconst_0       
        //   380: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   383: return         
        //   384: astore          15
        //   386: aload           15
        //   388: athrow         
        //   389: astore          16
        //   391: aload           16
        //   393: athrow         
        //   394: astore          18
        //   396: aload           18
        //   398: athrow         
        //   399: astore          19
        //   401: aload           19
        //   403: athrow         
        //   404: astore          20
        //   406: aload           20
        //   408: athrow         
        //   409: astore          25
        //   411: aload           25
        //   413: athrow         
        //   414: astore          9
        //   416: aload           9
        //   418: athrow         
        //   419: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      20     35     38     Ljava/lang/NullPointerException;
        //  25     34     38     41     Ljava/lang/NullPointerException;
        //  36     38     38     41     Ljava/lang/NullPointerException;
        //  85     100    384    389    Ljava/lang/NullPointerException;
        //  105    113    389    394    Ljava/lang/NullPointerException;
        //  113    164    394    399    Ljava/lang/NullPointerException;
        //  169    179    399    404    Ljava/lang/NullPointerException;
        //  183    192    404    409    Ljava/lang/NullPointerException;
        //  210    222    409    414    Ljava/lang/NullPointerException;
        //  226    240    409    414    Ljava/lang/NullPointerException;
        //  281    308    414    419    Ljava/lang/NullPointerException;
        //  312    358    359    384    Ljava/lang/NullPointerException;
        //  361    364    364    384    Ljava/lang/NullPointerException;
        //  386    389    389    394    Ljava/lang/NullPointerException;
        //  396    399    399    404    Ljava/lang/NullPointerException;
        //  401    404    404    409    Ljava/lang/NullPointerException;
        //  416    419    359    384    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 199, Size: 199
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
    
    static int x(final Conversation conversation) {
        return conversation.G;
    }
    
    private void y() {
        try {
            if (!this.aL.isFullscreenMode()) {
                this.aL.toggleSoftInput(2, 0);
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    private static void y(final Conversation conversation) {
        Conversation.ac.set(new v1(conversation, true));
    }
    
    private void z() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: iconst_1       
        //     2: invokespecial   com/whatsapp/Conversation.a:(Z)Z
        //     5: istore_2       
        //     6: iload_2        
        //     7: ifeq            14
        //    10: return         
        //    11: astore_1       
        //    12: aload_1        
        //    13: athrow         
        //    14: aload_0        
        //    15: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //    18: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    21: invokestatic    com/whatsapp/App.p:(Ljava/lang/String;)Z
        //    24: ifeq            37
        //    27: aload_0        
        //    28: bipush          106
        //    30: invokevirtual   com/whatsapp/Conversation.showDialog:(I)V
        //    33: return         
        //    34: astore_3       
        //    35: aload_3        
        //    36: athrow         
        //    37: new             Ljava/lang/StringBuilder;
        //    40: dup            
        //    41: aload_0        
        //    42: getfield        com/whatsapp/Conversation.X:Lcom/whatsapp/ConversationTextEntry;
        //    45: invokevirtual   com/whatsapp/ConversationTextEntry.getText:()Landroid/text/Editable;
        //    48: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/CharSequence;)V
        //    51: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    54: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //    57: astore          4
        //    59: aload           4
        //    61: invokevirtual   java/lang/String.length:()I
        //    64: ifle            111
        //    67: aload_0        
        //    68: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //    71: aload           4
        //    73: invokestatic    com/whatsapp/util/cq.a:(Ljava/lang/String;)Ljava/lang/String;
        //    76: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/a_9;Ljava/lang/String;)V
        //    79: aload_0        
        //    80: getfield        com/whatsapp/Conversation.X:Lcom/whatsapp/ConversationTextEntry;
        //    83: ldc_w           ""
        //    86: invokevirtual   com/whatsapp/ConversationTextEntry.setText:(Ljava/lang/CharSequence;)V
        //    89: aload_0        
        //    90: getfield        com/whatsapp/Conversation.X:Lcom/whatsapp/ConversationTextEntry;
        //    93: invokevirtual   com/whatsapp/ConversationTextEntry.getText:()Landroid/text/Editable;
        //    96: invokestatic    android/text/method/TextKeyListener.clear:(Landroid/text/Editable;)V
        //    99: aload_0        
        //   100: invokespecial   com/whatsapp/Conversation.H:()V
        //   103: aload_0        
        //   104: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //   107: iconst_0       
        //   108: invokevirtual   android/widget/ListView.setFastScrollEnabled:(Z)V
        //   111: aload_0        
        //   112: getfield        com/whatsapp/Conversation.aL:Landroid/view/inputmethod/InputMethodManager;
        //   115: invokevirtual   android/view/inputmethod/InputMethodManager.isFullscreenMode:()Z
        //   118: istore          10
        //   120: iload           10
        //   122: ifne            181
        //   125: iconst_4       
        //   126: aload_0        
        //   127: getfield        com/whatsapp/Conversation.X:Lcom/whatsapp/ConversationTextEntry;
        //   130: invokevirtual   com/whatsapp/ConversationTextEntry.getHeight:()I
        //   133: aload_0        
        //   134: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //   137: invokevirtual   android/widget/ListView.getHeight:()I
        //   140: iadd           
        //   141: imul           
        //   142: istore          12
        //   144: aload_0        
        //   145: invokevirtual   com/whatsapp/Conversation.getWindow:()Landroid/view/Window;
        //   148: invokevirtual   android/view/Window.getDecorView:()Landroid/view/View;
        //   151: invokevirtual   android/view/View.getHeight:()I
        //   154: istore          13
        //   156: iload           12
        //   158: iload           13
        //   160: if_icmpge       10
        //   163: aload_0        
        //   164: invokevirtual   com/whatsapp/Conversation.getResources:()Landroid/content/res/Resources;
        //   167: invokevirtual   android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
        //   170: getfield        android/content/res/Configuration.orientation:I
        //   173: istore          14
        //   175: iload           14
        //   177: iconst_2       
        //   178: if_icmpne       10
        //   181: aload_0        
        //   182: getfield        com/whatsapp/Conversation.aL:Landroid/view/inputmethod/InputMethodManager;
        //   185: aload_0        
        //   186: getfield        com/whatsapp/Conversation.X:Lcom/whatsapp/ConversationTextEntry;
        //   189: invokevirtual   com/whatsapp/ConversationTextEntry.getWindowToken:()Landroid/os/IBinder;
        //   192: iconst_0       
        //   193: invokevirtual   android/view/inputmethod/InputMethodManager.hideSoftInputFromWindow:(Landroid/os/IBinder;I)Z
        //   196: pop            
        //   197: aload_0        
        //   198: getfield        com/whatsapp/Conversation.Z:Lcom/whatsapp/l1;
        //   201: invokevirtual   com/whatsapp/l1.isShowing:()Z
        //   204: ifeq            10
        //   207: aload_0        
        //   208: getfield        com/whatsapp/Conversation.Z:Lcom/whatsapp/l1;
        //   211: invokevirtual   com/whatsapp/l1.dismiss:()V
        //   214: return         
        //   215: astore          9
        //   217: aload           9
        //   219: athrow         
        //   220: astore          5
        //   222: aload           5
        //   224: athrow         
        //   225: astore          6
        //   227: aload           6
        //   229: athrow         
        //   230: astore          7
        //   232: aload           7
        //   234: athrow         
        //   235: astore          8
        //   237: aload           8
        //   239: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      6      11     14     Landroid/content/ActivityNotFoundException;
        //  14     33     34     37     Landroid/content/ActivityNotFoundException;
        //  59     111    220    225    Landroid/content/ActivityNotFoundException;
        //  111    120    225    230    Landroid/content/ActivityNotFoundException;
        //  125    156    230    235    Landroid/content/ActivityNotFoundException;
        //  163    175    235    240    Landroid/content/ActivityNotFoundException;
        //  181    214    215    220    Landroid/content/ActivityNotFoundException;
        //  227    230    230    235    Landroid/content/ActivityNotFoundException;
        //  232    235    235    240    Landroid/content/ActivityNotFoundException;
        //  237    240    215    220    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 116, Size: 116
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
    
    static void z(final Conversation conversation) {
        conversation.y();
    }
    
    public void F() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/Conversation.aM:Landroid/support/v7/view/ActionMode;
        //     4: astore          4
        //     6: aload           4
        //     8: ifnull          42
        //    11: aload_0        
        //    12: getfield        com/whatsapp/Conversation.aw:Ljava/util/HashMap;
        //    15: invokevirtual   java/util/HashMap.size:()I
        //    18: istore          5
        //    20: iload           5
        //    22: ifne            35
        //    25: aload_0        
        //    26: invokespecial   com/whatsapp/Conversation.t:()V
        //    29: getstatic       com/whatsapp/App.I:Z
        //    32: ifeq            42
        //    35: aload_0        
        //    36: getfield        com/whatsapp/Conversation.aM:Landroid/support/v7/view/ActionMode;
        //    39: invokevirtual   android/support/v7/view/ActionMode.invalidate:()V
        //    42: return         
        //    43: astore_1       
        //    44: aload_1        
        //    45: athrow         
        //    46: astore_2       
        //    47: aload_2        
        //    48: athrow         
        //    49: astore_3       
        //    50: aload_3        
        //    51: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      6      43     46     Landroid/content/ActivityNotFoundException;
        //  11     20     46     49     Landroid/content/ActivityNotFoundException;
        //  25     35     49     52     Landroid/content/ActivityNotFoundException;
        //  35     42     49     52     Landroid/content/ActivityNotFoundException;
        //  44     46     46     49     Landroid/content/ActivityNotFoundException;
        //  47     49     49     52     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 28, Size: 28
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
    public void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   com/whatsapp/Conversation.isFinishing:()Z
        //     4: istore          4
        //     6: iload           4
        //     8: ifne            62
        //    11: getstatic       com/whatsapp/Conversation.ac:Ljava/util/concurrent/atomic/AtomicReference;
        //    14: invokevirtual   java/util/concurrent/atomic/AtomicReference.get:()Ljava/lang/Object;
        //    17: checkcast       Lcom/whatsapp/v1;
        //    20: invokevirtual   com/whatsapp/v1.a:()Z
        //    23: istore          6
        //    25: iload           6
        //    27: ifeq            62
        //    30: aload_0        
        //    31: aconst_null    
        //    32: invokespecial   com/whatsapp/Conversation.h:(Ljava/lang/String;)V
        //    35: aload_0        
        //    36: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //    39: invokevirtual   com/whatsapp/a_9.m:()Z
        //    42: ifeq            52
        //    45: aload_0        
        //    46: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //    49: invokevirtual   com/whatsapp/nm.notifyDataSetChanged:()V
        //    52: aload_0        
        //    53: invokespecial   com/whatsapp/Conversation.I:()V
        //    56: getstatic       com/whatsapp/App.I:Z
        //    59: ifeq            67
        //    62: aload_0        
        //    63: iconst_1       
        //    64: putfield        com/whatsapp/Conversation.a7:Z
        //    67: return         
        //    68: astore_1       
        //    69: aload_1        
        //    70: athrow         
        //    71: astore_2       
        //    72: aload_2        
        //    73: athrow         
        //    74: astore_3       
        //    75: aload_3        
        //    76: athrow         
        //    77: astore          5
        //    79: aload           5
        //    81: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      6      68     71     Landroid/content/ActivityNotFoundException;
        //  11     25     71     74     Landroid/content/ActivityNotFoundException;
        //  30     52     74     77     Landroid/content/ActivityNotFoundException;
        //  52     62     77     82     Landroid/content/ActivityNotFoundException;
        //  62     67     77     82     Landroid/content/ActivityNotFoundException;
        //  69     71     71     74     Landroid/content/ActivityNotFoundException;
        //  72     74     74     77     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 42, Size: 42
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
    
    public void a(final Dialog dialog) {
        final boolean i = App.I;
        try {
            if (this.ap.contains(dialog)) {
                Log.e(Conversation.cb[229]);
                dialog.show();
                return;
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
        final ArrayList<Dialog> list = new ArrayList<Dialog>();
        final Iterator<Dialog> iterator = (Iterator<Dialog>)this.ap.iterator();
        while (true) {
            Label_0093: {
                if (!iterator.hasNext()) {
                    break Label_0093;
                }
                final Dialog dialog2 = iterator.next();
                try {
                    if (!dialog2.isShowing()) {
                        list.add(dialog2);
                    }
                    if (i) {
                        this.ap.removeAll(list);
                        this.ap.add(dialog);
                        dialog.show();
                        return;
                    }
                    continue;
                }
                catch (ActivityNotFoundException ex2) {
                    throw ex2;
                }
            }
        }
    }
    
    @Override
    public void a(final bi bi) {
        up.h();
        this.D();
    }
    
    @Override
    public void a(final String s) {
        try {
            if (s.equals(this.I)) {
                this.A();
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    @Override
    public void a(final String s, final long n) {
        try {
            if (this.aE.getVisibility() != 0) {
                this.aE.setVisibility(0);
            }
            this.W.setText((CharSequence)DateUtils.formatElapsedTime(n / 1000L));
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    @Override
    public void a(final Collection collection) {
        try {
            if (this.aa != null) {
                this.n();
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    boolean a(final int n, final String s, final bi bi) {
        boolean b = true;
        final boolean i = App.I;
        switch (n) {
            default: {
                b = false;
                break;
            }
            case 2: {
                try {
                    this.w();
                    return b;
                }
                catch (ActivityNotFoundException ex) {
                    throw ex;
                }
            }
            case 1: {
                this.q();
                return b;
            }
            case 0: {
                this.f();
                return b;
            }
            case 3: {
                this.d(bi);
                return b;
            }
            case 15: {
                this.f(bi);
                return b;
            }
            case 6: {
                this.h(bi);
                return b;
            }
            case 4: {
                this.j(bi);
                return b;
            }
            case 5: {
                this.g(bi);
                return b;
            }
            case 7: {
                try {
                    this.ak = bi.t.substring(0, bi.t.indexOf("@"));
                    if (this.ak == null) {
                        Log.w(Conversation.cb[193]);
                        App.a((Context)this, 2131231154, 0);
                        return b;
                    }
                }
                catch (ActivityNotFoundException ex2) {
                    throw ex2;
                }
                this.a("+" + this.ak, b);
                return this.Y = b;
            }
            case 8: {
                this.ak = bi.t.substring(0, bi.t.indexOf("@"));
                this.b("+" + this.ak, b);
                return this.Y = b;
            }
            case 9: {
                this.c(s, 102);
                return b;
            }
            case 10: {
                this.c(s, 101);
                return b;
            }
            case 14: {
                Label_0414: {
                    if (bi.t == null) {
                        break Label_0414;
                    }
                    final a_9 e = App.S.e(bi.t);
                    Label_0379: {
                        if (e == null) {
                            break Label_0379;
                        }
                        try {
                            this.startActivity(a(e));
                            this.finish();
                            if (i) {
                                Log.e(Conversation.cb[195] + bi.t);
                            }
                            if (!i) {
                                break;
                            }
                            try {
                                Log.e(Conversation.cb[194]);
                                return b;
                            }
                            catch (ActivityNotFoundException ex3) {
                                throw ex3;
                            }
                        }
                        catch (ActivityNotFoundException ex4) {
                            throw ex4;
                        }
                    }
                }
            }
            case 16: {
                Label_0511: {
                    if (bi.t == null) {
                        break Label_0511;
                    }
                    final a_9 e2 = App.S.e(bi.t);
                    Label_0476: {
                        if (e2 == null) {
                            break Label_0476;
                        }
                        try {
                            App.a(e2, this, bq.CONVERSATION);
                            if (i) {
                                Log.e(Conversation.cb[191] + bi.t);
                            }
                            if (!i) {
                                break;
                            }
                            try {
                                Log.e(Conversation.cb[192]);
                                return b;
                            }
                            catch (ActivityNotFoundException ex5) {
                                throw ex5;
                            }
                        }
                        catch (ActivityNotFoundException ex6) {
                            throw ex6;
                        }
                    }
                }
                break;
            }
        }
        return b;
    }
    
    @Override
    public void b(final bi bi) {
        this.aE.setVisibility(8);
    }
    
    @Override
    public void b(final String s) {
        try {
            if (s.equals(this.I)) {
                this.findViewById(2131755433).setVisibility(8);
                this.T.setVisibility(0);
                this.I();
            }
            this.aI.post((Runnable)new t2(this, s));
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    @Override
    public void c(final bi bi) {
    }
    
    @Override
    public void c(final String s) {
        try {
            if (s.equals(this.I)) {
                this.I();
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    @Override
    public void d(final String s) {
        try {
            if (s.equals(this.I)) {
                this.I();
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        while (true) {
            try {
                if (!this.aH) {
                    return false;
                }
            }
            catch (ActivityNotFoundException ex) {
                throw ex;
            }
            try {
                if (!up.o()) {
                    final Conversation conversation = this;
                    final MotionEvent motionEvent2 = motionEvent;
                    final boolean dispatchTouchEvent = conversation.dispatchTouchEvent(motionEvent2);
                    return dispatchTouchEvent;
                }
                return false;
            }
            catch (ActivityNotFoundException ex2) {
                throw ex2;
            }
            try {
                final Conversation conversation = this;
                final MotionEvent motionEvent2 = motionEvent;
                final boolean dispatchTouchEvent2;
                final boolean dispatchTouchEvent = dispatchTouchEvent2 = conversation.dispatchTouchEvent(motionEvent2);
                return dispatchTouchEvent2;
            }
            catch (ActivityNotFoundException ex3) {
                Log.e(Conversation.cb[68] + ex3.toString());
                App.a((Context)this, 2131230786, 0);
                return false;
            }
            catch (IllegalArgumentException ex4) {
                Log.e(Conversation.cb[67] + ex4.toString());
                return false;
            }
        }
    }
    
    public boolean h() {
        return this.al.i();
    }
    
    public boolean i() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/Conversation.aM:Landroid/support/v7/view/ActionMode;
        //     4: astore_2       
        //     5: aload_2        
        //     6: ifnull          14
        //     9: iconst_0       
        //    10: ireturn        
        //    11: astore_1       
        //    12: aload_1        
        //    13: athrow         
        //    14: aload_0        
        //    15: getfield        com/whatsapp/Conversation.z:Landroid/support/v7/view/ActionMode;
        //    18: ifnull          28
        //    21: aload_0        
        //    22: getfield        com/whatsapp/Conversation.z:Landroid/support/v7/view/ActionMode;
        //    25: invokevirtual   android/support/v7/view/ActionMode.finish:()V
        //    28: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    31: bipush          64
        //    33: aaload         
        //    34: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    37: aload_0        
        //    38: getfield        com/whatsapp/Conversation.O:Landroid/support/v7/view/ActionMode$Callback;
        //    41: ifnonnull       56
        //    44: aload_0        
        //    45: new             Lcom/whatsapp/a0m;
        //    48: dup            
        //    49: aload_0        
        //    50: invokespecial   com/whatsapp/a0m.<init>:(Lcom/whatsapp/Conversation;)V
        //    53: putfield        com/whatsapp/Conversation.O:Landroid/support/v7/view/ActionMode$Callback;
        //    56: aload_0        
        //    57: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //    60: invokevirtual   com/whatsapp/nm.notifyDataSetChanged:()V
        //    63: aload_0        
        //    64: aload_0        
        //    65: aload_0        
        //    66: getfield        com/whatsapp/Conversation.O:Landroid/support/v7/view/ActionMode$Callback;
        //    69: invokevirtual   com/whatsapp/Conversation.startSupportActionMode:(Landroid/support/v7/view/ActionMode$Callback;)Landroid/support/v7/view/ActionMode;
        //    72: putfield        com/whatsapp/Conversation.aM:Landroid/support/v7/view/ActionMode;
        //    75: iconst_1       
        //    76: ireturn        
        //    77: astore_3       
        //    78: aload_3        
        //    79: athrow         
        //    80: astore          4
        //    82: aload           4
        //    84: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      5      11     14     Landroid/content/ActivityNotFoundException;
        //  14     28     77     80     Landroid/content/ActivityNotFoundException;
        //  28     56     80     85     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0028:
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
    
    public void j(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    de/greenrobot/event/m.b:()Lde/greenrobot/event/m;
        //     3: ldc_w           Lcom/whatsapp/a8p;.class
        //     6: invokevirtual   de/greenrobot/event/m.a:(Ljava/lang/Class;)Ljava/lang/Object;
        //     9: checkcast       Lcom/whatsapp/a8p;
        //    12: astore_2       
        //    13: aload_2        
        //    14: invokevirtual   com/whatsapp/a8p.a:()Z
        //    17: istore          6
        //    19: iload           6
        //    21: ifeq            49
        //    24: aload_0        
        //    25: iconst_1       
        //    26: putfield        com/whatsapp/Conversation.aC:Z
        //    29: aload_1        
        //    30: ifnull          44
        //    33: aload_1        
        //    34: aload_0        
        //    35: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //    38: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    41: ifne            49
        //    44: aload_0        
        //    45: iconst_0       
        //    46: putfield        com/whatsapp/Conversation.at:Z
        //    49: return         
        //    50: astore_3       
        //    51: aload_3        
        //    52: athrow         
        //    53: astore          4
        //    55: aload           4
        //    57: athrow         
        //    58: astore          5
        //    60: aload           5
        //    62: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  13     19     50     53     Landroid/content/ActivityNotFoundException;
        //  24     29     53     58     Landroid/content/ActivityNotFoundException;
        //  33     44     58     63     Landroid/content/ActivityNotFoundException;
        //  44     49     58     63     Landroid/content/ActivityNotFoundException;
        //  51     53     53     58     Landroid/content/ActivityNotFoundException;
        //  55     58     58     63     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 33, Size: 33
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
    protected void onActivityResult(final int p0, final int p1, final Intent p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          4
        //     5: iload_2        
        //     6: ifne            128
        //     9: aload_3        
        //    10: ifnull          128
        //    13: aload_3        
        //    14: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    17: sipush          146
        //    20: aaload         
        //    21: iconst_0       
        //    22: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //    25: istore          192
        //    27: iload           192
        //    29: ifeq            55
        //    32: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    35: sipush          134
        //    38: aaload         
        //    39: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    42: aload_0        
        //    43: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    46: ldc_w           2131231082
        //    49: invokevirtual   com/whatsapp/App.getString:(I)Ljava/lang/String;
        //    52: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/gu;Ljava/lang/String;)V
        //    55: aload_3        
        //    56: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    59: bipush          86
        //    61: aaload         
        //    62: iconst_0       
        //    63: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //    66: ifeq            91
        //    69: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    72: bipush          127
        //    74: aaload         
        //    75: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    78: aload_0        
        //    79: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    82: ldc_w           2131231078
        //    85: invokevirtual   com/whatsapp/App.getString:(I)Ljava/lang/String;
        //    88: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/gu;Ljava/lang/String;)V
        //    91: aload_3        
        //    92: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    95: sipush          145
        //    98: aaload         
        //    99: iconst_0       
        //   100: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   103: ifeq            128
        //   106: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   109: bipush          87
        //   111: aaload         
        //   112: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   115: aload_0        
        //   116: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   119: ldc_w           2131231072
        //   122: invokevirtual   com/whatsapp/App.getString:(I)Ljava/lang/String;
        //   125: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/gu;Ljava/lang/String;)V
        //   128: iload_2        
        //   129: iconst_m1      
        //   130: if_icmpeq       169
        //   133: iload_1        
        //   134: bipush          14
        //   136: if_icmpne       169
        //   139: aload_0        
        //   140: invokevirtual   com/whatsapp/Conversation.finish:()V
        //   143: return         
        //   144: astore          190
        //   146: aload           190
        //   148: athrow         
        //   149: astore          191
        //   151: aload           191
        //   153: athrow         
        //   154: astore          193
        //   156: aload           193
        //   158: athrow         
        //   159: astore          194
        //   161: aload           194
        //   163: athrow         
        //   164: astore          189
        //   166: aload           189
        //   168: athrow         
        //   169: iload_1        
        //   170: tableswitch {
        //                4: 281
        //                5: 276
        //                6: 1550
        //                7: 1120
        //                8: 276
        //                9: 1806
        //               10: 1791
        //               11: 276
        //               12: 693
        //               13: 442
        //               14: 820
        //               15: 584
        //               16: 914
        //               17: 276
        //               18: 276
        //               19: 2255
        //               20: 2170
        //               21: 3690
        //               22: 3767
        //               23: 914
        //               24: 914
        //               25: 870
        //               26: 1361
        //          default: 276
        //        }
        //   276: iconst_1       
        //   277: putstatic       com/whatsapp/Conversation.a_:Z
        //   280: return         
        //   281: iload_2        
        //   282: iconst_m1      
        //   283: if_icmpne       276
        //   286: aload_0        
        //   287: getfield        com/whatsapp/Conversation.aw:Ljava/util/HashMap;
        //   290: astore          181
        //   292: aload           181
        //   294: ifnull          416
        //   297: aload_3        
        //   298: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   301: sipush          130
        //   304: aaload         
        //   305: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   308: astore          184
        //   310: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   313: aload           184
        //   315: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   318: astore          185
        //   320: aload           185
        //   322: ifnull          393
        //   325: aload_0        
        //   326: invokespecial   com/whatsapp/Conversation.B:()Ljava/util/ArrayList;
        //   329: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   332: astore          187
        //   334: aload           187
        //   336: invokeinterface java/util/Iterator.hasNext:()Z
        //   341: ifeq            364
        //   344: aload           187
        //   346: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   351: checkcast       Lcom/whatsapp/protocol/bi;
        //   354: aload           185
        //   356: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/protocol/bi;Lcom/whatsapp/a_9;)V
        //   359: iload           4
        //   361: ifeq            334
        //   364: aload_0        
        //   365: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //   368: aload           185
        //   370: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   373: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   376: ifne            411
        //   379: aload_0        
        //   380: aload           185
        //   382: invokestatic    com/whatsapp/Conversation.a:(Lcom/whatsapp/a_9;)Landroid/content/Intent;
        //   385: invokevirtual   com/whatsapp/Conversation.startActivity:(Landroid/content/Intent;)V
        //   388: iload           4
        //   390: ifeq            411
        //   393: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   396: sipush          131
        //   399: aaload         
        //   400: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   403: aload_0        
        //   404: ldc_w           2131231257
        //   407: iconst_0       
        //   408: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   411: iload           4
        //   413: ifeq            433
        //   416: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   419: bipush          125
        //   421: aaload         
        //   422: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   425: aload_0        
        //   426: ldc_w           2131231324
        //   429: iconst_0       
        //   430: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   433: aload_0        
        //   434: invokespecial   com/whatsapp/Conversation.t:()V
        //   437: iload           4
        //   439: ifeq            276
        //   442: iload_2        
        //   443: iconst_m1      
        //   444: if_icmpne       570
        //   447: aload_0        
        //   448: getfield        com/whatsapp/Conversation.Y:Z
        //   451: istore          173
        //   453: iload           173
        //   455: ifeq            521
        //   458: new             Lcom/whatsapp/a_9;
        //   461: dup            
        //   462: new             Ljava/lang/StringBuilder;
        //   465: dup            
        //   466: invokespecial   java/lang/StringBuilder.<init>:()V
        //   469: aload_0        
        //   470: getfield        com/whatsapp/Conversation.ak:Ljava/lang/String;
        //   473: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   476: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   479: bipush          100
        //   481: aaload         
        //   482: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   485: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   488: invokespecial   com/whatsapp/a_9.<init>:(Ljava/lang/String;)V
        //   491: astore          174
        //   493: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   496: aload           174
        //   498: invokevirtual   com/whatsapp/wc.h:(Lcom/whatsapp/a_9;)V
        //   501: aload           174
        //   503: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   506: invokestatic    com/whatsapp/Conversation.i:(Ljava/lang/String;)V
        //   509: aload_0        
        //   510: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //   513: invokevirtual   com/whatsapp/nm.notifyDataSetChanged:()V
        //   516: iload           4
        //   518: ifeq            276
        //   521: aload_3        
        //   522: ifnull          555
        //   525: aload_3        
        //   526: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   529: astore          179
        //   531: aload           179
        //   533: ifnull          555
        //   536: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   539: aload_3        
        //   540: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   543: aload_0        
        //   544: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   547: invokevirtual   com/whatsapp/wc.a:(Landroid/net/Uri;Lcom/whatsapp/a_9;)V
        //   550: iload           4
        //   552: ifeq            276
        //   555: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   558: aload_0        
        //   559: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   562: invokevirtual   com/whatsapp/wc.h:(Lcom/whatsapp/a_9;)V
        //   565: iload           4
        //   567: ifeq            276
        //   570: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   573: bipush          118
        //   575: aaload         
        //   576: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   579: iload           4
        //   581: ifeq            276
        //   584: iload_2        
        //   585: iconst_m1      
        //   586: if_icmpne       678
        //   589: aload_0        
        //   590: getfield        com/whatsapp/Conversation.Y:Z
        //   593: istore          167
        //   595: iload           167
        //   597: ifeq            663
        //   600: new             Lcom/whatsapp/a_9;
        //   603: dup            
        //   604: new             Ljava/lang/StringBuilder;
        //   607: dup            
        //   608: invokespecial   java/lang/StringBuilder.<init>:()V
        //   611: aload_0        
        //   612: getfield        com/whatsapp/Conversation.ak:Ljava/lang/String;
        //   615: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   618: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   621: bipush          97
        //   623: aaload         
        //   624: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   627: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   630: invokespecial   com/whatsapp/a_9.<init>:(Ljava/lang/String;)V
        //   633: astore          168
        //   635: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   638: aload           168
        //   640: invokevirtual   com/whatsapp/wc.h:(Lcom/whatsapp/a_9;)V
        //   643: aload           168
        //   645: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   648: invokestatic    com/whatsapp/Conversation.i:(Ljava/lang/String;)V
        //   651: aload_0        
        //   652: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //   655: invokevirtual   com/whatsapp/nm.notifyDataSetChanged:()V
        //   658: iload           4
        //   660: ifeq            276
        //   663: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   666: aload_0        
        //   667: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   670: invokevirtual   com/whatsapp/wc.h:(Lcom/whatsapp/a_9;)V
        //   673: iload           4
        //   675: ifeq            276
        //   678: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   681: sipush          138
        //   684: aaload         
        //   685: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   688: iload           4
        //   690: ifeq            276
        //   693: iload_2        
        //   694: iconst_m1      
        //   695: if_icmpne       801
        //   698: aload_0        
        //   699: getfield        com/whatsapp/Conversation.J:Ljava/lang/String;
        //   702: astore          155
        //   704: aload           155
        //   706: ifnull          719
        //   709: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   712: aload_0        
        //   713: getfield        com/whatsapp/Conversation.J:Ljava/lang/String;
        //   716: invokevirtual   com/whatsapp/wc.g:(Ljava/lang/String;)V
        //   719: aload_0        
        //   720: getfield        com/whatsapp/Conversation.aa:Landroid/view/View;
        //   723: ifnonnull       737
        //   726: aload_0        
        //   727: getfield        com/whatsapp/Conversation.aF:Landroid/view/View;
        //   730: astore          163
        //   732: aload           163
        //   734: ifnull          810
        //   737: aload_0        
        //   738: getfield        com/whatsapp/Conversation.aa:Landroid/view/View;
        //   741: astore          159
        //   743: aload           159
        //   745: ifnull          765
        //   748: aload_0        
        //   749: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //   752: aload_0        
        //   753: getfield        com/whatsapp/Conversation.aa:Landroid/view/View;
        //   756: invokevirtual   android/widget/ListView.removeHeaderView:(Landroid/view/View;)Z
        //   759: pop            
        //   760: aload_0        
        //   761: aconst_null    
        //   762: putfield        com/whatsapp/Conversation.aa:Landroid/view/View;
        //   765: aload_0        
        //   766: getfield        com/whatsapp/Conversation.aF:Landroid/view/View;
        //   769: ifnull          789
        //   772: aload_0        
        //   773: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //   776: aload_0        
        //   777: getfield        com/whatsapp/Conversation.aF:Landroid/view/View;
        //   780: invokevirtual   android/widget/ListView.removeFooterView:(Landroid/view/View;)Z
        //   783: pop            
        //   784: aload_0        
        //   785: aconst_null    
        //   786: putfield        com/whatsapp/Conversation.aF:Landroid/view/View;
        //   789: aload_0        
        //   790: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //   793: invokevirtual   com/whatsapp/nm.notifyDataSetChanged:()V
        //   796: iload           4
        //   798: ifeq            810
        //   801: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   804: bipush          117
        //   806: aaload         
        //   807: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   810: aload_0        
        //   811: aconst_null    
        //   812: putfield        com/whatsapp/Conversation.J:Ljava/lang/String;
        //   815: iload           4
        //   817: ifeq            276
        //   820: iload_2        
        //   821: iconst_m1      
        //   822: if_icmpne       851
        //   825: aload_0        
        //   826: getfield        com/whatsapp/Conversation.J:Ljava/lang/String;
        //   829: astore          150
        //   831: aload           150
        //   833: ifnull          860
        //   836: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   839: aload_0        
        //   840: getfield        com/whatsapp/Conversation.J:Ljava/lang/String;
        //   843: invokevirtual   com/whatsapp/wc.g:(Ljava/lang/String;)V
        //   846: iload           4
        //   848: ifeq            860
        //   851: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   854: bipush          111
        //   856: aaload         
        //   857: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   860: aload_0        
        //   861: aconst_null    
        //   862: putfield        com/whatsapp/Conversation.J:Ljava/lang/String;
        //   865: iload           4
        //   867: ifeq            276
        //   870: iload_2        
        //   871: iconst_m1      
        //   872: if_icmpne       901
        //   875: aload_0        
        //   876: invokestatic    com/whatsapp/util/br.b:(Landroid/content/Context;)Ljava/io/File;
        //   879: invokestatic    android/net/Uri.fromFile:(Ljava/io/File;)Landroid/net/Uri;
        //   882: astore          144
        //   884: aload_0        
        //   885: aload           144
        //   887: invokestatic    com/whatsapp/util/br.a:(Landroid/content/Context;Landroid/net/Uri;)V
        //   890: aload_0        
        //   891: aload           144
        //   893: invokespecial   com/whatsapp/Conversation.a:(Landroid/net/Uri;)V
        //   896: iload           4
        //   898: ifeq            276
        //   901: iload_2        
        //   902: ifne            276
        //   905: aload_0        
        //   906: invokestatic    com/whatsapp/util/br.c:(Landroid/content/Context;)V
        //   909: iload           4
        //   911: ifeq            276
        //   914: aload_3        
        //   915: ifnull          276
        //   918: aload_3        
        //   919: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   922: bipush          94
        //   924: aaload         
        //   925: iconst_0       
        //   926: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   929: ifeq            2837
        //   932: iload_2        
        //   933: iconst_m1      
        //   934: if_icmpne       1072
        //   937: aload_3        
        //   938: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   941: astore          130
        //   943: aload           130
        //   945: ifnull          2695
        //   948: aload           130
        //   950: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //   953: getstatic       android/provider/MediaStore$Images$Media.INTERNAL_CONTENT_URI:Landroid/net/Uri;
        //   956: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //   959: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   962: istore          135
        //   964: iload           135
        //   966: ifne            990
        //   969: aload           130
        //   971: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //   974: getstatic       android/provider/MediaStore$Images$Media.EXTERNAL_CONTENT_URI:Landroid/net/Uri;
        //   977: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //   980: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   983: istore          141
        //   985: iload           141
        //   987: ifeq            1015
        //   990: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   993: bipush          105
        //   995: aaload         
        //   996: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   999: aload_0        
        //  1000: invokevirtual   com/whatsapp/Conversation.getBaseContext:()Landroid/content/Context;
        //  1003: ldc_w           2131231735
        //  1006: iconst_0       
        //  1007: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //  1010: iload           4
        //  1012: ifeq            1067
        //  1015: aload           130
        //  1017: invokestatic    com/whatsapp/util/br.b:(Landroid/net/Uri;)Ljava/io/File;
        //  1020: astore          137
        //  1022: aload           137
        //  1024: invokestatic    com/whatsapp/wm.c:(Ljava/io/File;)Z
        //  1027: ifeq            1045
        //  1030: aload_0        
        //  1031: aload_0        
        //  1032: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //  1035: aload           137
        //  1037: invokestatic    com/whatsapp/VideoPreviewActivity.a:(Landroid/app/Activity;Lcom/whatsapp/a_9;Ljava/io/File;)V
        //  1040: iload           4
        //  1042: ifeq            1067
        //  1045: aload_0        
        //  1046: aload_0        
        //  1047: aload_0        
        //  1048: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //  1051: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //  1054: aload           137
        //  1056: iconst_3       
        //  1057: iconst_1       
        //  1058: invokestatic    com/whatsapp/util/br.a:(Landroid/app/Activity;Lcom/whatsapp/gu;Ljava/lang/String;Ljava/io/File;BZ)Z
        //  1061: pop            
        //  1062: aload_0        
        //  1063: iconst_1       
        //  1064: putfield        com/whatsapp/Conversation.x:Z
        //  1067: iload           4
        //  1069: ifeq            1115
        //  1072: iload_2        
        //  1073: iconst_1       
        //  1074: if_icmpne       1115
        //  1077: aload_0        
        //  1078: iconst_1       
        //  1079: putfield        com/whatsapp/Conversation.x:Z
        //  1082: aload_0        
        //  1083: aload_0        
        //  1084: aload_0        
        //  1085: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //  1088: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //  1091: new             Ljava/io/File;
        //  1094: dup            
        //  1095: aload_3        
        //  1096: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1099: sipush          155
        //  1102: aaload         
        //  1103: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //  1106: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //  1109: iconst_3       
        //  1110: iconst_1       
        //  1111: invokestatic    com/whatsapp/util/br.a:(Landroid/app/Activity;Lcom/whatsapp/gu;Ljava/lang/String;Ljava/io/File;BZ)Z
        //  1114: pop            
        //  1115: iload           4
        //  1117: ifeq            276
        //  1120: iload_2        
        //  1121: iconst_m1      
        //  1122: if_icmpne       276
        //  1125: aload_3        
        //  1126: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //  1129: astore          107
        //  1131: aload           107
        //  1133: ifnonnull       1162
        //  1136: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1139: sipush          159
        //  1142: aaload         
        //  1143: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1146: aload_0        
        //  1147: invokevirtual   com/whatsapp/Conversation.getBaseContext:()Landroid/content/Context;
        //  1150: ldc_w           2131231735
        //  1153: iconst_0       
        //  1154: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //  1157: iload           4
        //  1159: ifeq            276
        //  1162: aload           107
        //  1164: invokestatic    com/whatsapp/util/br.b:(Landroid/net/Uri;)Ljava/io/File;
        //  1167: astore          108
        //  1169: getstatic       android/os/Build.MANUFACTURER:Ljava/lang/String;
        //  1172: bipush          32
        //  1174: bipush          95
        //  1176: invokevirtual   java/lang/String.replace:(CC)Ljava/lang/String;
        //  1179: astore          109
        //  1181: aload           109
        //  1183: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1186: bipush          85
        //  1188: aaload         
        //  1189: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //  1192: ifeq            1302
        //  1195: aload_3        
        //  1196: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1199: sipush          150
        //  1202: aaload         
        //  1203: iconst_1       
        //  1204: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //  1207: istore          113
        //  1209: iload           113
        //  1211: ifeq            1302
        //  1214: new             Landroid/content/Intent;
        //  1217: dup            
        //  1218: aload_0        
        //  1219: ldc_w           Lcom/whatsapp/RecordAudio;.class
        //  1222: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  1225: astore          114
        //  1227: aload           114
        //  1229: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1232: bipush          88
        //  1234: aaload         
        //  1235: iconst_1       
        //  1236: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //  1239: pop            
        //  1240: aload           114
        //  1242: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1245: sipush          153
        //  1248: aaload         
        //  1249: iconst_1       
        //  1250: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //  1253: pop            
        //  1254: aload           114
        //  1256: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1259: sipush          151
        //  1262: aaload         
        //  1263: aload_0        
        //  1264: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //  1267: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //  1270: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1273: pop            
        //  1274: aload           114
        //  1276: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1279: bipush          120
        //  1281: aaload         
        //  1282: aload           108
        //  1284: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //  1287: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1290: pop            
        //  1291: aload_0        
        //  1292: aload           114
        //  1294: invokevirtual   com/whatsapp/Conversation.startActivity:(Landroid/content/Intent;)V
        //  1297: iload           4
        //  1299: ifeq            1330
        //  1302: aload_0        
        //  1303: aload_0        
        //  1304: aload_0        
        //  1305: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //  1308: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //  1311: aload           108
        //  1313: iconst_2       
        //  1314: aload_3        
        //  1315: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1318: sipush          137
        //  1321: aaload         
        //  1322: iconst_1       
        //  1323: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //  1326: invokestatic    com/whatsapp/util/br.a:(Landroid/app/Activity;Lcom/whatsapp/gu;Ljava/lang/String;Ljava/io/File;BZ)Z
        //  1329: pop            
        //  1330: aload_0        
        //  1331: iconst_1       
        //  1332: putfield        com/whatsapp/Conversation.x:Z
        //  1335: goto            276
        //  1338: astore          105
        //  1340: aload_0        
        //  1341: invokevirtual   com/whatsapp/Conversation.getBaseContext:()Landroid/content/Context;
        //  1344: ldc_w           2131231735
        //  1347: iconst_0       
        //  1348: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //  1351: aload           105
        //  1353: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //  1356: iload           4
        //  1358: ifeq            276
        //  1361: iload_2        
        //  1362: iconst_m1      
        //  1363: if_icmpne       1481
        //  1366: new             Lcom/whatsapp/MediaData;
        //  1369: dup            
        //  1370: invokespecial   com/whatsapp/MediaData.<init>:()V
        //  1373: astore          99
        //  1375: aload           99
        //  1377: new             Ljava/io/File;
        //  1380: dup            
        //  1381: aload_3        
        //  1382: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1385: bipush          123
        //  1387: aaload         
        //  1388: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //  1391: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //  1394: putfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //  1397: aload           99
        //  1399: aload_3        
        //  1400: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1403: bipush          116
        //  1405: aaload         
        //  1406: lconst_0       
        //  1407: invokevirtual   android/content/Intent.getLongExtra:(Ljava/lang/String;J)J
        //  1410: putfield        com/whatsapp/MediaData.trimFrom:J
        //  1413: aload           99
        //  1415: aload_3        
        //  1416: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1419: bipush          95
        //  1421: aaload         
        //  1422: lconst_0       
        //  1423: invokevirtual   android/content/Intent.getLongExtra:(Ljava/lang/String;J)J
        //  1426: putfield        com/whatsapp/MediaData.trimTo:J
        //  1429: aload_0        
        //  1430: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //  1433: aload           99
        //  1435: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //  1438: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //  1441: ldc2_w          1000
        //  1444: aload           99
        //  1446: getfield        com/whatsapp/MediaData.trimFrom:J
        //  1449: lmul           
        //  1450: invokestatic    com/whatsapp/util/br.a:(Ljava/lang/String;J)[B
        //  1453: aload           99
        //  1455: iconst_3       
        //  1456: iconst_0       
        //  1457: aload_3        
        //  1458: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1461: bipush          98
        //  1463: aaload         
        //  1464: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //  1467: aconst_null    
        //  1468: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;[BLcom/whatsapp/MediaData;BILjava/lang/String;Landroid/net/Uri;)V
        //  1471: aload_0        
        //  1472: iconst_1       
        //  1473: putfield        com/whatsapp/Conversation.x:Z
        //  1476: iload           4
        //  1478: ifeq            276
        //  1481: iload_2        
        //  1482: iconst_1       
        //  1483: if_icmpne       276
        //  1486: aload_0        
        //  1487: iconst_1       
        //  1488: putfield        com/whatsapp/Conversation.x:Z
        //  1491: aload_0        
        //  1492: aload_0        
        //  1493: aload_0        
        //  1494: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //  1497: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //  1500: new             Ljava/io/File;
        //  1503: dup            
        //  1504: aload_3        
        //  1505: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1508: sipush          140
        //  1511: aaload         
        //  1512: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //  1515: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //  1518: iconst_3       
        //  1519: iconst_1       
        //  1520: invokestatic    com/whatsapp/util/br.a:(Landroid/app/Activity;Lcom/whatsapp/gu;Ljava/lang/String;Ljava/io/File;BZ)Z
        //  1523: pop            
        //  1524: goto            276
        //  1527: astore          102
        //  1529: aload           102
        //  1531: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //  1534: aload_0        
        //  1535: invokevirtual   com/whatsapp/Conversation.getBaseContext:()Landroid/content/Context;
        //  1538: ldc_w           2131231735
        //  1541: iconst_0       
        //  1542: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //  1545: iload           4
        //  1547: ifeq            276
        //  1550: iload_2        
        //  1551: iconst_m1      
        //  1552: if_icmpne       1766
        //  1555: aload_3        
        //  1556: ifnull          3006
        //  1559: aload_3        
        //  1560: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //  1563: astore          97
        //  1565: aload           97
        //  1567: ifnull          3006
        //  1570: aload_3        
        //  1571: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //  1574: astore          98
        //  1576: aload           98
        //  1578: astore          82
        //  1580: iconst_1       
        //  1581: istore          83
        //  1583: aload           82
        //  1585: ifnonnull       1614
        //  1588: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1591: sipush          141
        //  1594: aaload         
        //  1595: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1598: aload_0        
        //  1599: invokevirtual   com/whatsapp/Conversation.getBaseContext:()Landroid/content/Context;
        //  1602: ldc_w           2131231735
        //  1605: iconst_0       
        //  1606: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //  1609: iload           4
        //  1611: ifeq            276
        //  1614: aload           82
        //  1616: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //  1619: getstatic       android/provider/MediaStore$Images$Media.INTERNAL_CONTENT_URI:Landroid/net/Uri;
        //  1622: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //  1625: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //  1628: istore          89
        //  1630: iload           89
        //  1632: ifne            1656
        //  1635: aload           82
        //  1637: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //  1640: getstatic       android/provider/MediaStore$Images$Media.EXTERNAL_CONTENT_URI:Landroid/net/Uri;
        //  1643: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //  1646: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //  1649: istore          94
        //  1651: iload           94
        //  1653: ifeq            1682
        //  1656: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1659: sipush          154
        //  1662: aaload         
        //  1663: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1666: aload_0        
        //  1667: invokevirtual   com/whatsapp/Conversation.getBaseContext:()Landroid/content/Context;
        //  1670: ldc_w           2131231735
        //  1673: iconst_0       
        //  1674: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //  1677: iload           4
        //  1679: ifeq            276
        //  1682: aload           82
        //  1684: invokestatic    com/whatsapp/util/br.b:(Landroid/net/Uri;)Ljava/io/File;
        //  1687: astore          90
        //  1689: aload           90
        //  1691: invokestatic    com/whatsapp/wm.c:(Ljava/io/File;)Z
        //  1694: ifeq            1712
        //  1697: aload_0        
        //  1698: aload_0        
        //  1699: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //  1702: aload           90
        //  1704: invokestatic    com/whatsapp/VideoPreviewActivity.a:(Landroid/app/Activity;Lcom/whatsapp/a_9;Ljava/io/File;)V
        //  1707: iload           4
        //  1709: ifeq            276
        //  1712: aload_0        
        //  1713: iconst_1       
        //  1714: putfield        com/whatsapp/Conversation.x:Z
        //  1717: aload_0        
        //  1718: aload_0        
        //  1719: aload_0        
        //  1720: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //  1723: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //  1726: aload           90
        //  1728: iconst_3       
        //  1729: iload           83
        //  1731: invokestatic    com/whatsapp/util/br.a:(Landroid/app/Activity;Lcom/whatsapp/gu;Ljava/lang/String;Ljava/io/File;BZ)Z
        //  1734: pop            
        //  1735: goto            276
        //  1738: astore          92
        //  1740: aload           92
        //  1742: athrow         
        //  1743: astore          87
        //  1745: aload           87
        //  1747: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //  1750: aload_0        
        //  1751: invokevirtual   com/whatsapp/Conversation.getBaseContext:()Landroid/content/Context;
        //  1754: ldc_w           2131231735
        //  1757: iconst_0       
        //  1758: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //  1761: iload           4
        //  1763: ifeq            276
        //  1766: iload_2        
        //  1767: ifne            276
        //  1770: getstatic       android/os/Build$VERSION.SDK_INT:I
        //  1773: istore          80
        //  1775: iload           80
        //  1777: bipush          18
        //  1779: if_icmplt       276
        //  1782: aload_0        
        //  1783: invokestatic    com/whatsapp/util/br.c:(Landroid/content/Context;)V
        //  1786: iload           4
        //  1788: ifeq            276
        //  1791: iload_2        
        //  1792: iconst_m1      
        //  1793: if_icmpne       276
        //  1796: aload_0        
        //  1797: iconst_1       
        //  1798: putfield        com/whatsapp/Conversation.x:Z
        //  1801: iload           4
        //  1803: ifeq            276
        //  1806: iload_2        
        //  1807: iconst_m1      
        //  1808: if_icmpne       276
        //  1811: aload_3        
        //  1812: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //  1815: astore          59
        //  1817: iconst_3       
        //  1818: anewarray       Ljava/lang/String;
        //  1821: astore          60
        //  1823: aload           60
        //  1825: iconst_0       
        //  1826: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1829: bipush          114
        //  1831: aaload         
        //  1832: aastore        
        //  1833: aload           60
        //  1835: iconst_1       
        //  1836: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1839: sipush          156
        //  1842: aaload         
        //  1843: aastore        
        //  1844: aload           60
        //  1846: iconst_2       
        //  1847: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1850: sipush          132
        //  1853: aaload         
        //  1854: aastore        
        //  1855: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //  1858: aload           59
        //  1860: aload           60
        //  1862: aconst_null    
        //  1863: aconst_null    
        //  1864: aconst_null    
        //  1865: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //  1868: astore          61
        //  1870: new             Lo;
        //  1873: dup            
        //  1874: aload_0        
        //  1875: invokespecial   o.<init>:(Landroid/content/Context;)V
        //  1878: astore          62
        //  1880: aload           61
        //  1882: invokeinterface android/database/Cursor.moveToNext:()Z
        //  1887: ifeq            3905
        //  1890: aload           61
        //  1892: aload           61
        //  1894: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1897: bipush          96
        //  1899: aaload         
        //  1900: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //  1905: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //  1910: astore          63
        //  1912: aload           62
        //  1914: getfield        o.f:Lk;
        //  1917: aload           61
        //  1919: aload           61
        //  1921: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1924: bipush          108
        //  1926: aaload         
        //  1927: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //  1932: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //  1937: putfield        k.e:Ljava/lang/String;
        //  1940: aload           62
        //  1942: aload           63
        //  1944: invokevirtual   o.e:(Ljava/lang/String;)V
        //  1947: aload           61
        //  1949: aload           61
        //  1951: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1954: bipush          107
        //  1956: aaload         
        //  1957: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //  1962: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //  1967: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //  1970: ifle            1980
        //  1973: aload           62
        //  1975: aload           63
        //  1977: invokevirtual   o.j:(Ljava/lang/String;)V
        //  1980: aload           62
        //  1982: aload           63
        //  1984: invokevirtual   o.c:(Ljava/lang/String;)V
        //  1987: aload           62
        //  1989: aload           63
        //  1991: invokevirtual   o.g:(Ljava/lang/String;)V
        //  1994: aload           62
        //  1996: aload           63
        //  1998: invokevirtual   o.b:(Ljava/lang/String;)V
        //  2001: aload           62
        //  2003: aload           63
        //  2005: invokevirtual   o.f:(Ljava/lang/String;)V
        //  2008: aload           62
        //  2010: aload           63
        //  2012: invokevirtual   o.a:(Ljava/lang/String;)V
        //  2015: aload           62
        //  2017: aload           63
        //  2019: invokevirtual   o.d:(Ljava/lang/String;)V
        //  2022: aload           61
        //  2024: invokeinterface android/database/Cursor.close:()V
        //  2029: new             Li;
        //  2032: dup            
        //  2033: invokespecial   i.<init>:()V
        //  2036: astore          64
        //  2038: aload           64
        //  2040: aload_0        
        //  2041: aload           62
        //  2043: iconst_2       
        //  2044: invokevirtual   i.a:(Landroid/content/Context;Lo;I)Ljava/lang/String;
        //  2047: astore          73
        //  2049: aload           73
        //  2051: astore          66
        //  2053: aload           66
        //  2055: ifnonnull       2081
        //  2058: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  2061: sipush          144
        //  2064: aaload         
        //  2065: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  2068: aload_0        
        //  2069: ldc_w           2131231861
        //  2072: iconst_0       
        //  2073: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //  2076: iload           4
        //  2078: ifeq            2165
        //  2081: new             Landroid/content/Intent;
        //  2084: dup            
        //  2085: aload_0        
        //  2086: ldc_w           Lcom/whatsapp/ViewSharedContactActivity;.class
        //  2089: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  2092: astore          67
        //  2094: aload           67
        //  2096: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  2099: bipush          99
        //  2101: aaload         
        //  2102: iconst_1       
        //  2103: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //  2106: pop            
        //  2107: aload           67
        //  2109: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  2112: sipush          143
        //  2115: aaload         
        //  2116: aload_0        
        //  2117: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //  2120: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //  2123: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  2126: pop            
        //  2127: aload           67
        //  2129: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  2132: sipush          135
        //  2135: aaload         
        //  2136: aload           66
        //  2138: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  2141: pop            
        //  2142: aload           67
        //  2144: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  2147: sipush          157
        //  2150: aaload         
        //  2151: aload           63
        //  2153: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  2156: pop            
        //  2157: aload_0        
        //  2158: aload           67
        //  2160: bipush          8
        //  2162: invokevirtual   com/whatsapp/Conversation.startActivityForResult:(Landroid/content/Intent;I)V
        //  2165: iload           4
        //  2167: ifeq            276
        //  2170: iload_2        
        //  2171: iconst_m1      
        //  2172: if_icmpne       2213
        //  2175: aload_3        
        //  2176: ifnull          276
        //  2179: aload_3        
        //  2180: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //  2183: astore          58
        //  2185: aload           58
        //  2187: ifnull          276
        //  2190: aload_0        
        //  2191: getfield        com/whatsapp/Conversation.y:Lcom/whatsapp/wallpaper/WallPaperView;
        //  2194: invokevirtual   com/whatsapp/wallpaper/WallPaperView.a:()V
        //  2197: aload_0        
        //  2198: aload_3        
        //  2199: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //  2202: iconst_m1      
        //  2203: iconst_0       
        //  2204: iconst_0       
        //  2205: invokespecial   com/whatsapp/Conversation.a:(Landroid/net/Uri;III)V
        //  2208: iload           4
        //  2210: ifeq            276
        //  2213: aload_3        
        //  2214: ifnull          276
        //  2217: aload_3        
        //  2218: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  2221: bipush          113
        //  2223: aaload         
        //  2224: iconst_0       
        //  2225: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //  2228: istore          54
        //  2230: iload           54
        //  2232: ifeq            276
        //  2235: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  2238: bipush          121
        //  2240: aaload         
        //  2241: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  2244: aload_0        
        //  2245: bipush          7
        //  2247: invokevirtual   com/whatsapp/Conversation.showDialog:(I)V
        //  2250: iload           4
        //  2252: ifeq            276
        //  2255: iload_2        
        //  2256: iconst_m1      
        //  2257: if_icmpne       3681
        //  2260: aload_3        
        //  2261: ifnull          3681
        //  2264: aload_0        
        //  2265: invokestatic    com/whatsapp/wallpaper/h.d:(Landroid/content/Context;)Landroid/graphics/Point;
        //  2268: astore          15
        //  2270: aload_3        
        //  2271: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //  2274: ifnull          3438
        //  2277: new             Ljava/lang/StringBuilder;
        //  2280: dup            
        //  2281: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2284: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  2287: sipush          129
        //  2290: aaload         
        //  2291: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2294: aload_3        
        //  2295: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //  2298: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //  2301: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2304: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2307: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  2310: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //  2313: aload_3        
        //  2314: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //  2317: aconst_null    
        //  2318: aconst_null    
        //  2319: aconst_null    
        //  2320: aconst_null    
        //  2321: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //  2324: astore          24
        //  2326: aload           24
        //  2328: ifnull          3235
        //  2331: aload           24
        //  2333: invokeinterface android/database/Cursor.moveToFirst:()Z
        //  2338: pop            
        //  2339: aload           24
        //  2341: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  2344: sipush          147
        //  2347: aaload         
        //  2348: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //  2353: istore          38
        //  2355: iload           38
        //  2357: iflt            3235
        //  2360: aload           24
        //  2362: iload           38
        //  2364: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //  2369: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  2372: sipush          152
        //  2375: aaload         
        //  2376: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2379: istore          40
        //  2381: iload           40
        //  2383: ifeq            3235
        //  2386: new             Landroid/graphics/BitmapFactory$Options;
        //  2389: dup            
        //  2390: invokespecial   android/graphics/BitmapFactory$Options.<init>:()V
        //  2393: astore          41
        //  2395: aload           41
        //  2397: iconst_1       
        //  2398: putfield        android/graphics/BitmapFactory$Options.inJustDecodeBounds:Z
        //  2401: aconst_null    
        //  2402: astore          42
        //  2404: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //  2407: aload_3        
        //  2408: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //  2411: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //  2414: astore          45
        //  2416: aload           45
        //  2418: astore          42
        //  2420: aload           42
        //  2422: aconst_null    
        //  2423: aload           41
        //  2425: invokestatic    android/graphics/BitmapFactory.decodeStream:(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //  2428: pop            
        //  2429: aload           41
        //  2431: getfield        android/graphics/BitmapFactory$Options.outWidth:I
        //  2434: aload           15
        //  2436: getfield        android/graphics/Point.x:I
        //  2439: if_icmpne       3817
        //  2442: aload           41
        //  2444: getfield        android/graphics/BitmapFactory$Options.outHeight:I
        //  2447: istore          48
        //  2449: aload           15
        //  2451: getfield        android/graphics/Point.y:I
        //  2454: istore          49
        //  2456: iload           48
        //  2458: iload           49
        //  2460: if_icmpne       3817
        //  2463: aload_0        
        //  2464: aload_3        
        //  2465: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //  2468: iconst_m1      
        //  2469: iconst_0       
        //  2470: iconst_0       
        //  2471: invokespecial   com/whatsapp/Conversation.a:(Landroid/net/Uri;III)V
        //  2474: aload           42
        //  2476: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //  2479: aload           24
        //  2481: ifnull          143
        //  2484: aload           24
        //  2486: invokeinterface android/database/Cursor.close:()V
        //  2491: return         
        //  2492: astore          180
        //  2494: aload           180
        //  2496: athrow         
        //  2497: astore          188
        //  2499: aload           188
        //  2501: athrow         
        //  2502: astore          186
        //  2504: aload           186
        //  2506: athrow         
        //  2507: astore          182
        //  2509: aload           182
        //  2511: athrow         
        //  2512: astore          183
        //  2514: aload           183
        //  2516: athrow         
        //  2517: astore          172
        //  2519: aload           172
        //  2521: athrow         
        //  2522: astore          175
        //  2524: aload           175
        //  2526: athrow         
        //  2527: astore          176
        //  2529: aload           176
        //  2531: athrow         
        //  2532: astore          177
        //  2534: aload           177
        //  2536: athrow         
        //  2537: astore          178
        //  2539: aload           178
        //  2541: athrow         
        //  2542: astore          170
        //  2544: aload           170
        //  2546: athrow         
        //  2547: astore          171
        //  2549: aload           171
        //  2551: athrow         
        //  2552: astore          166
        //  2554: aload           166
        //  2556: athrow         
        //  2557: astore          169
        //  2559: aload           169
        //  2561: athrow         
        //  2562: astore          164
        //  2564: aload           164
        //  2566: athrow         
        //  2567: astore          165
        //  2569: aload           165
        //  2571: athrow         
        //  2572: astore          153
        //  2574: aload           153
        //  2576: athrow         
        //  2577: astore          154
        //  2579: aload           154
        //  2581: athrow         
        //  2582: astore          156
        //  2584: aload           156
        //  2586: athrow         
        //  2587: astore          157
        //  2589: aload           157
        //  2591: athrow         
        //  2592: astore          158
        //  2594: aload           158
        //  2596: athrow         
        //  2597: astore          160
        //  2599: aload           160
        //  2601: athrow         
        //  2602: astore          151
        //  2604: aload           151
        //  2606: athrow         
        //  2607: astore          152
        //  2609: aload           152
        //  2611: athrow         
        //  2612: astore          148
        //  2614: aload           148
        //  2616: athrow         
        //  2617: astore          149
        //  2619: aload           149
        //  2621: athrow         
        //  2622: astore          146
        //  2624: aload           146
        //  2626: athrow         
        //  2627: astore          147
        //  2629: aload           147
        //  2631: athrow         
        //  2632: astore          145
        //  2634: aload           145
        //  2636: athrow         
        //  2637: astore          142
        //  2639: aload           142
        //  2641: athrow         
        //  2642: astore          143
        //  2644: aload           143
        //  2646: athrow         
        //  2647: astore          132
        //  2649: aload           132
        //  2651: athrow         
        //  2652: astore          133
        //  2654: aload           133
        //  2656: athrow         
        //  2657: astore          134
        //  2659: aload           134
        //  2661: athrow         
        //  2662: astore          138
        //  2664: aload           138
        //  2666: athrow         
        //  2667: astore          139
        //  2669: aload           139
        //  2671: athrow         
        //  2672: astore          136
        //  2674: aload           136
        //  2676: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //  2679: aload_0        
        //  2680: invokevirtual   com/whatsapp/Conversation.getBaseContext:()Landroid/content/Context;
        //  2683: ldc_w           2131231735
        //  2686: iconst_0       
        //  2687: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //  2690: iload           4
        //  2692: ifeq            1067
        //  2695: new             Lcom/whatsapp/MediaData;
        //  2698: dup            
        //  2699: invokespecial   com/whatsapp/MediaData.<init>:()V
        //  2702: astore          131
        //  2704: aload           131
        //  2706: new             Ljava/io/File;
        //  2709: dup            
        //  2710: aload_3        
        //  2711: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  2714: bipush          109
        //  2716: aaload         
        //  2717: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //  2720: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //  2723: putfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //  2726: aload           131
        //  2728: aload_3        
        //  2729: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  2732: sipush          142
        //  2735: aaload         
        //  2736: lconst_0       
        //  2737: invokevirtual   android/content/Intent.getLongExtra:(Ljava/lang/String;J)J
        //  2740: putfield        com/whatsapp/MediaData.trimFrom:J
        //  2743: aload           131
        //  2745: aload_3        
        //  2746: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  2749: bipush          92
        //  2751: aaload         
        //  2752: lconst_0       
        //  2753: invokevirtual   android/content/Intent.getLongExtra:(Ljava/lang/String;J)J
        //  2756: putfield        com/whatsapp/MediaData.trimTo:J
        //  2759: aload_0        
        //  2760: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //  2763: aload           131
        //  2765: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //  2768: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //  2771: ldc2_w          1000
        //  2774: aload           131
        //  2776: getfield        com/whatsapp/MediaData.trimFrom:J
        //  2779: lmul           
        //  2780: invokestatic    com/whatsapp/util/br.a:(Ljava/lang/String;J)[B
        //  2783: aload           131
        //  2785: iconst_3       
        //  2786: iconst_0       
        //  2787: aload_3        
        //  2788: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  2791: bipush          93
        //  2793: aaload         
        //  2794: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //  2797: aconst_null    
        //  2798: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;[BLcom/whatsapp/MediaData;BILjava/lang/String;Landroid/net/Uri;)V
        //  2801: aload_0        
        //  2802: iconst_1       
        //  2803: putfield        com/whatsapp/Conversation.x:Z
        //  2806: goto            1067
        //  2809: astore          126
        //  2811: aload           126
        //  2813: athrow         
        //  2814: astore          127
        //  2816: aload           127
        //  2818: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //  2821: aload_0        
        //  2822: invokevirtual   com/whatsapp/Conversation.getBaseContext:()Landroid/content/Context;
        //  2825: ldc_w           2131231735
        //  2828: iconst_0       
        //  2829: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //  2832: iload           4
        //  2834: ifeq            1115
        //  2837: iload_2        
        //  2838: iconst_m1      
        //  2839: if_icmpne       2917
        //  2842: aload_3        
        //  2843: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //  2846: astore          121
        //  2848: aload           121
        //  2850: ifnull          2864
        //  2853: aload_0        
        //  2854: aload           121
        //  2856: invokespecial   com/whatsapp/Conversation.a:(Landroid/net/Uri;)V
        //  2859: iload           4
        //  2861: ifeq            2912
        //  2864: aload_3        
        //  2865: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  2868: bipush          112
        //  2870: aaload         
        //  2871: invokevirtual   android/content/Intent.getParcelableArrayListExtra:(Ljava/lang/String;)Ljava/util/ArrayList;
        //  2874: astore          122
        //  2876: aload           122
        //  2878: ifnull          2892
        //  2881: aload_0        
        //  2882: aload           122
        //  2884: invokespecial   com/whatsapp/Conversation.a:(Ljava/util/ArrayList;)V
        //  2887: iload           4
        //  2889: ifeq            2912
        //  2892: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  2895: bipush          124
        //  2897: aaload         
        //  2898: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  2901: aload_0        
        //  2902: invokevirtual   com/whatsapp/Conversation.getBaseContext:()Landroid/content/Context;
        //  2905: ldc_w           2131231735
        //  2908: iconst_0       
        //  2909: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //  2912: iload           4
        //  2914: ifeq            1115
        //  2917: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  2920: sipush          149
        //  2923: aaload         
        //  2924: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  2927: aload_0        
        //  2928: invokevirtual   com/whatsapp/Conversation.getBaseContext:()Landroid/content/Context;
        //  2931: ldc_w           2131231735
        //  2934: iconst_0       
        //  2935: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //  2938: goto            1115
        //  2941: astore          120
        //  2943: aload           120
        //  2945: athrow         
        //  2946: astore          128
        //  2948: aload           128
        //  2950: athrow         
        //  2951: astore          125
        //  2953: aload           125
        //  2955: athrow         
        //  2956: astore          124
        //  2958: aload           124
        //  2960: athrow         
        //  2961: astore          123
        //  2963: aload           123
        //  2965: athrow         
        //  2966: astore          119
        //  2968: aload           119
        //  2970: athrow         
        //  2971: astore          110
        //  2973: aload           110
        //  2975: athrow         
        //  2976: astore          111
        //  2978: aload           111
        //  2980: athrow         
        //  2981: astore          106
        //  2983: aload           106
        //  2985: athrow         
        //  2986: astore          100
        //  2988: aload           100
        //  2990: athrow         
        //  2991: astore          101
        //  2993: aload           101
        //  2995: athrow         
        //  2996: astore          103
        //  2998: aload           103
        //  3000: athrow         
        //  3001: astore          96
        //  3003: aload           96
        //  3005: athrow         
        //  3006: aload_0        
        //  3007: invokestatic    com/whatsapp/util/br.b:(Landroid/content/Context;)Ljava/io/File;
        //  3010: astore          81
        //  3012: aload           81
        //  3014: invokevirtual   java/io/File.exists:()Z
        //  3017: ifeq            3039
        //  3020: aload           81
        //  3022: invokestatic    android/net/Uri.fromFile:(Ljava/io/File;)Landroid/net/Uri;
        //  3025: astore          82
        //  3027: aload_0        
        //  3028: aload           82
        //  3030: invokestatic    com/whatsapp/util/br.a:(Landroid/content/Context;Landroid/net/Uri;)V
        //  3033: iconst_0       
        //  3034: istore          83
        //  3036: goto            1583
        //  3039: new             Ljava/lang/StringBuilder;
        //  3042: dup            
        //  3043: invokespecial   java/lang/StringBuilder.<init>:()V
        //  3046: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  3049: bipush          103
        //  3051: aaload         
        //  3052: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3055: aload           81
        //  3057: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  3060: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3063: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  3066: aconst_null    
        //  3067: astore          82
        //  3069: iconst_0       
        //  3070: istore          83
        //  3072: goto            1583
        //  3075: astore          95
        //  3077: aload           95
        //  3079: athrow         
        //  3080: astore          84
        //  3082: aload           84
        //  3084: athrow         
        //  3085: astore          85
        //  3087: aload           85
        //  3089: athrow         
        //  3090: astore          86
        //  3092: aload           86
        //  3094: athrow         
        //  3095: astore          91
        //  3097: aload           91
        //  3099: athrow         
        //  3100: astore          88
        //  3102: aload           88
        //  3104: athrow         
        //  3105: astore          77
        //  3107: aload           77
        //  3109: athrow         
        //  3110: astore          78
        //  3112: aload           78
        //  3114: athrow         
        //  3115: astore          79
        //  3117: aload           79
        //  3119: athrow         
        //  3120: astore          75
        //  3122: aload           75
        //  3124: athrow         
        //  3125: astore          76
        //  3127: aload           76
        //  3129: athrow         
        //  3130: astore          74
        //  3132: aload           74
        //  3134: athrow         
        //  3135: astore          65
        //  3137: aload           65
        //  3139: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //  3142: aload_0        
        //  3143: ldc_w           2131231376
        //  3146: iconst_0       
        //  3147: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //  3150: aconst_null    
        //  3151: astore          66
        //  3153: goto            2053
        //  3156: astore          72
        //  3158: aload           72
        //  3160: athrow         
        //  3161: astore          55
        //  3163: aload           55
        //  3165: athrow         
        //  3166: astore          56
        //  3168: aload           56
        //  3170: athrow         
        //  3171: astore          57
        //  3173: aload           57
        //  3175: athrow         
        //  3176: astore          50
        //  3178: aload           50
        //  3180: athrow         
        //  3181: astore          51
        //  3183: aload           51
        //  3185: athrow         
        //  3186: astore          52
        //  3188: aload           52
        //  3190: athrow         
        //  3191: astore          53
        //  3193: aload           53
        //  3195: athrow         
        //  3196: astore          39
        //  3198: aload           39
        //  3200: athrow         
        //  3201: astore          35
        //  3203: aload           24
        //  3205: ifnull          3215
        //  3208: aload           24
        //  3210: invokeinterface android/database/Cursor.close:()V
        //  3215: aload           35
        //  3217: athrow         
        //  3218: astore          46
        //  3220: aload           46
        //  3222: athrow         
        //  3223: astore          44
        //  3225: aload           44
        //  3227: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //  3230: aload           42
        //  3232: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //  3235: aload           24
        //  3237: ifnull          3247
        //  3240: aload           24
        //  3242: invokeinterface android/database/Cursor.close:()V
        //  3247: new             Ljava/lang/StringBuilder;
        //  3250: dup            
        //  3251: invokespecial   java/lang/StringBuilder.<init>:()V
        //  3254: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  3257: sipush          128
        //  3260: aaload         
        //  3261: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3264: aload           15
        //  3266: getfield        android/graphics/Point.x:I
        //  3269: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  3272: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  3275: bipush          102
        //  3277: aaload         
        //  3278: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3281: aload           15
        //  3283: getfield        android/graphics/Point.y:I
        //  3286: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  3289: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3292: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  3295: new             Landroid/content/Intent;
        //  3298: dup            
        //  3299: aload_0        
        //  3300: ldc_w           Lcom/whatsapp/wallpaper/CropImage;.class
        //  3303: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  3306: astore          25
        //  3308: aload           25
        //  3310: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  3313: bipush          89
        //  3315: aaload         
        //  3316: aload           15
        //  3318: getfield        android/graphics/Point.x:I
        //  3321: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //  3324: pop            
        //  3325: aload           25
        //  3327: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  3330: bipush          110
        //  3332: aaload         
        //  3333: aload           15
        //  3335: getfield        android/graphics/Point.y:I
        //  3338: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //  3341: pop            
        //  3342: aload           25
        //  3344: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  3347: bipush          106
        //  3349: aaload         
        //  3350: iconst_1       
        //  3351: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //  3354: pop            
        //  3355: aload           25
        //  3357: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  3360: bipush          90
        //  3362: aaload         
        //  3363: iconst_1       
        //  3364: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //  3367: pop            
        //  3368: aload           25
        //  3370: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  3373: sipush          133
        //  3376: aaload         
        //  3377: iconst_1       
        //  3378: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //  3381: pop            
        //  3382: aload           25
        //  3384: aload_3        
        //  3385: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //  3388: invokevirtual   android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
        //  3391: pop            
        //  3392: aload           25
        //  3394: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  3397: bipush          119
        //  3399: aaload         
        //  3400: invokestatic    com/whatsapp/wallpaper/h.a:()Landroid/net/Uri;
        //  3403: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
        //  3406: pop            
        //  3407: aload           25
        //  3409: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  3412: bipush          91
        //  3414: aaload         
        //  3415: getstatic       android/graphics/Bitmap$CompressFormat.JPEG:Landroid/graphics/Bitmap$CompressFormat;
        //  3418: invokevirtual   android/graphics/Bitmap$CompressFormat.toString:()Ljava/lang/String;
        //  3421: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  3424: pop            
        //  3425: aload_0        
        //  3426: aload           25
        //  3428: bipush          18
        //  3430: invokevirtual   com/whatsapp/Conversation.startActivityForResult:(Landroid/content/Intent;I)V
        //  3433: iload           4
        //  3435: ifeq            3681
        //  3438: aload_0        
        //  3439: getfield        com/whatsapp/Conversation.y:Lcom/whatsapp/wallpaper/WallPaperView;
        //  3442: invokevirtual   com/whatsapp/wallpaper/WallPaperView.a:()V
        //  3445: aload_3        
        //  3446: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  3449: sipush          136
        //  3452: aaload         
        //  3453: iconst_0       
        //  3454: invokevirtual   android/content/Intent.getIntExtra:(Ljava/lang/String;I)I
        //  3457: istore          16
        //  3459: iload           16
        //  3461: ifeq            3551
        //  3464: new             Ljava/lang/StringBuilder;
        //  3467: dup            
        //  3468: invokespecial   java/lang/StringBuilder.<init>:()V
        //  3471: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  3474: sipush          139
        //  3477: aaload         
        //  3478: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3481: iload           16
        //  3483: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  3486: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  3489: bipush          115
        //  3491: aaload         
        //  3492: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3495: aload           15
        //  3497: getfield        android/graphics/Point.x:I
        //  3500: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  3503: ldc_w           ","
        //  3506: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3509: aload           15
        //  3511: getfield        android/graphics/Point.y:I
        //  3514: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  3517: ldc_w           "]"
        //  3520: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3523: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3526: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  3529: aload_0        
        //  3530: aconst_null    
        //  3531: iload           16
        //  3533: aload           15
        //  3535: getfield        android/graphics/Point.x:I
        //  3538: aload           15
        //  3540: getfield        android/graphics/Point.y:I
        //  3543: invokespecial   com/whatsapp/Conversation.a:(Landroid/net/Uri;III)V
        //  3546: iload           4
        //  3548: ifeq            3681
        //  3551: aload_3        
        //  3552: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  3555: bipush          101
        //  3557: aaload         
        //  3558: iconst_0       
        //  3559: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //  3562: istore          21
        //  3564: iload           21
        //  3566: ifeq            3592
        //  3569: aload_0        
        //  3570: invokestatic    com/whatsapp/wallpaper/h.a:(Landroid/content/Context;)V
        //  3573: aload_0        
        //  3574: aconst_null    
        //  3575: invokespecial   com/whatsapp/Conversation.a:(Landroid/graphics/drawable/Drawable;)V
        //  3578: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  3581: bipush          126
        //  3583: aaload         
        //  3584: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  3587: iload           4
        //  3589: ifeq            3681
        //  3592: aload_3        
        //  3593: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  3596: sipush          158
        //  3599: aaload         
        //  3600: iconst_0       
        //  3601: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //  3604: istore          22
        //  3606: iload           22
        //  3608: ifeq            3637
        //  3611: aload_0        
        //  3612: invokestatic    com/whatsapp/wallpaper/h.e:(Landroid/content/Context;)V
        //  3615: aload_0        
        //  3616: aload_0        
        //  3617: invokestatic    com/whatsapp/wallpaper/h.f:(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
        //  3620: invokespecial   com/whatsapp/Conversation.a:(Landroid/graphics/drawable/Drawable;)V
        //  3623: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  3626: bipush          104
        //  3628: aaload         
        //  3629: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  3632: iload           4
        //  3634: ifeq            3681
        //  3637: aload_0        
        //  3638: invokevirtual   com/whatsapp/Conversation.getBaseContext:()Landroid/content/Context;
        //  3641: aload_0        
        //  3642: ldc_w           2131231094
        //  3645: invokevirtual   com/whatsapp/Conversation.getString:(I)Ljava/lang/String;
        //  3648: iconst_0       
        //  3649: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;Ljava/lang/String;I)V
        //  3652: new             Ljava/lang/StringBuilder;
        //  3655: dup            
        //  3656: invokespecial   java/lang/StringBuilder.<init>:()V
        //  3659: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  3662: bipush          122
        //  3664: aaload         
        //  3665: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3668: aload_3        
        //  3669: invokevirtual   android/content/Intent.toString:()Ljava/lang/String;
        //  3672: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3675: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3678: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  3681: aload_0        
        //  3682: invokespecial   com/whatsapp/Conversation.o:()V
        //  3685: iload           4
        //  3687: ifeq            276
        //  3690: iload_2        
        //  3691: iconst_m1      
        //  3692: if_icmpne       276
        //  3695: aload_3        
        //  3696: ifnull          3750
        //  3699: aload_3        
        //  3700: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  3703: sipush          148
        //  3706: aaload         
        //  3707: iconst_0       
        //  3708: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //  3711: istore          11
        //  3713: iload           11
        //  3715: ifeq            3750
        //  3718: aload_0        
        //  3719: ldc_w           2131755433
        //  3722: invokevirtual   com/whatsapp/Conversation.findViewById:(I)Landroid/view/View;
        //  3725: iconst_0       
        //  3726: invokevirtual   android/view/View.setVisibility:(I)V
        //  3729: aload_0        
        //  3730: getfield        com/whatsapp/Conversation.T:Landroid/widget/ImageView;
        //  3733: iconst_4       
        //  3734: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //  3737: aload_0        
        //  3738: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //  3741: aload_0        
        //  3742: invokestatic    com/whatsapp/qp.b:(Lcom/whatsapp/a_9;Landroid/app/Activity;)V
        //  3745: iload           4
        //  3747: ifeq            276
        //  3750: aload_3        
        //  3751: aload_0        
        //  3752: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //  3755: aload_0        
        //  3756: bipush          20
        //  3758: aload_0        
        //  3759: invokestatic    com/whatsapp/qp.a:(Landroid/content/Intent;Lcom/whatsapp/a_9;Landroid/app/Activity;ILcom/whatsapp/gu;)V
        //  3762: iload           4
        //  3764: ifeq            276
        //  3767: invokestatic    com/whatsapp/qp.b:()Ljava/io/File;
        //  3770: invokevirtual   java/io/File.delete:()Z
        //  3773: pop            
        //  3774: iload_2        
        //  3775: iconst_m1      
        //  3776: if_icmpne       276
        //  3779: aload_0        
        //  3780: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //  3783: aload_0        
        //  3784: invokestatic    com/whatsapp/qp.a:(Lcom/whatsapp/a_9;Landroid/app/Activity;)Z
        //  3787: ifeq            276
        //  3790: aload_0        
        //  3791: ldc_w           2131755433
        //  3794: invokevirtual   com/whatsapp/Conversation.findViewById:(I)Landroid/view/View;
        //  3797: iconst_0       
        //  3798: invokevirtual   android/view/View.setVisibility:(I)V
        //  3801: aload_0        
        //  3802: getfield        com/whatsapp/Conversation.T:Landroid/widget/ImageView;
        //  3805: iconst_4       
        //  3806: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //  3809: goto            276
        //  3812: astore          6
        //  3814: aload           6
        //  3816: athrow         
        //  3817: aload           42
        //  3819: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //  3822: goto            3235
        //  3825: astore          43
        //  3827: aload           42
        //  3829: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //  3832: aload           43
        //  3834: athrow         
        //  3835: astore          34
        //  3837: aload           34
        //  3839: athrow         
        //  3840: astore          36
        //  3842: aload           36
        //  3844: athrow         
        //  3845: astore          23
        //  3847: aload           23
        //  3849: athrow         
        //  3850: astore          17
        //  3852: aload           17
        //  3854: athrow         
        //  3855: astore          18
        //  3857: aload           18
        //  3859: athrow         
        //  3860: astore          19
        //  3862: aload           19
        //  3864: athrow         
        //  3865: astore          20
        //  3867: aload           20
        //  3869: athrow         
        //  3870: astore          12
        //  3872: aload           12
        //  3874: athrow         
        //  3875: astore          13
        //  3877: aload           13
        //  3879: athrow         
        //  3880: astore          14
        //  3882: aload           14
        //  3884: athrow         
        //  3885: astore          9
        //  3887: aload           9
        //  3889: athrow         
        //  3890: astore          10
        //  3892: aload           10
        //  3894: athrow         
        //  3895: astore          8
        //  3897: aload           8
        //  3899: athrow         
        //  3900: astore          5
        //  3902: aload           5
        //  3904: athrow         
        //  3905: aconst_null    
        //  3906: astore          63
        //  3908: goto            2022
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  13     27     144    149    Ljava/io/IOException;
        //  32     55     149    154    Ljava/io/IOException;
        //  55     91     154    159    Ljava/io/IOException;
        //  91     128    159    164    Ljava/io/IOException;
        //  139    143    164    169    Ljava/io/IOException;
        //  146    149    149    154    Ljava/io/IOException;
        //  286    292    2492   2497   Ljava/io/IOException;
        //  364    388    2497   2502   Ljava/io/IOException;
        //  393    411    2502   2507   Ljava/io/IOException;
        //  416    433    2507   2512   Ljava/io/IOException;
        //  433    437    2512   2517   Ljava/io/IOException;
        //  447    453    2517   2522   Ljava/io/IOException;
        //  493    516    2522   2527   Ljava/io/IOException;
        //  525    531    2527   2532   Ljava/io/IOException;
        //  536    550    2532   2537   Ljava/io/IOException;
        //  555    565    2537   2542   Ljava/io/IOException;
        //  570    579    2542   2552   Ljava/io/IOException;
        //  589    595    2552   2557   Ljava/io/IOException;
        //  635    658    2557   2562   Ljava/io/IOException;
        //  663    673    2557   2562   Ljava/io/IOException;
        //  678    688    2562   2572   Ljava/io/IOException;
        //  698    704    2572   2577   Ljava/io/IOException;
        //  709    719    2577   2582   Ljava/io/IOException;
        //  719    732    2582   2587   Ljava/io/IOException;
        //  737    743    2587   2592   Ljava/io/IOException;
        //  748    765    2592   2597   Ljava/io/IOException;
        //  765    789    2597   2602   Ljava/io/IOException;
        //  789    796    2602   2607   Ljava/io/IOException;
        //  801    810    2602   2607   Ljava/io/IOException;
        //  810    815    2607   2612   Ljava/io/IOException;
        //  825    831    2612   2617   Ljava/io/IOException;
        //  836    846    2617   2622   Ljava/io/IOException;
        //  851    860    2622   2627   Ljava/io/IOException;
        //  860    865    2627   2632   Ljava/io/IOException;
        //  884    896    2632   2637   Ljava/io/IOException;
        //  905    909    2637   2647   Ljava/io/IOException;
        //  948    964    2647   2652   Ljava/io/IOException;
        //  969    985    2652   2657   Ljava/io/IOException;
        //  990    1010   2657   2662   Ljava/io/IOException;
        //  1015   1022   2672   2695   Ljava/io/IOException;
        //  1022   1040   2662   2667   Ljava/io/IOException;
        //  1045   1067   2667   2672   Ljava/io/IOException;
        //  1077   1082   2809   2814   La;
        //  1082   1115   2814   2837   Ljava/io/IOException;
        //  1082   1115   2809   2814   La;
        //  1125   1131   1338   1361   Ljava/io/IOException;
        //  1136   1157   2966   2971   Ljava/io/IOException;
        //  1162   1181   1338   1361   Ljava/io/IOException;
        //  1181   1209   2971   2976   Ljava/io/IOException;
        //  1214   1227   1338   1361   Ljava/io/IOException;
        //  1227   1297   2976   2981   Ljava/io/IOException;
        //  1302   1330   2976   2981   Ljava/io/IOException;
        //  1330   1335   1338   1361   Ljava/io/IOException;
        //  1340   1356   2981   2986   Ljava/io/IOException;
        //  1375   1476   2986   2991   Ljava/io/IOException;
        //  1486   1491   2991   2996   La;
        //  1491   1524   1527   1550   Ljava/io/IOException;
        //  1491   1524   2991   2996   La;
        //  1529   1545   2996   3001   Ljava/io/IOException;
        //  1559   1565   3001   3006   Ljava/io/IOException;
        //  1570   1576   1743   3105   Ljava/io/IOException;
        //  1588   1609   3075   3080   Ljava/io/IOException;
        //  1614   1630   3080   3085   Ljava/io/IOException;
        //  1635   1651   3085   3090   Ljava/io/IOException;
        //  1656   1677   3090   3095   Ljava/io/IOException;
        //  1682   1689   1743   3105   Ljava/io/IOException;
        //  1689   1707   3095   3100   Ljava/io/IOException;
        //  1712   1735   1738   1743   Ljava/io/IOException;
        //  1740   1743   1743   3105   Ljava/io/IOException;
        //  1745   1761   3100   3105   Ljava/io/IOException;
        //  1770   1775   3105   3110   Ljava/io/IOException;
        //  1782   1786   3110   3120   Ljava/io/IOException;
        //  1796   1801   3120   3130   Ljava/io/IOException;
        //  1912   1980   3130   3135   Ljava/io/IOException;
        //  2038   2049   3135   3156   La;
        //  2058   2076   3156   3161   Ljava/io/IOException;
        //  2179   2185   3161   3166   Ljava/io/IOException;
        //  2190   2208   3166   3176   Ljava/io/IOException;
        //  2217   2230   3176   3181   Ljava/io/IOException;
        //  2235   2250   3181   3196   Ljava/io/IOException;
        //  2331   2355   3201   3218   Any
        //  2360   2381   3196   3201   Ljava/io/IOException;
        //  2360   2381   3201   3218   Any
        //  2386   2401   3201   3218   Any
        //  2404   2416   3223   3235   Ljava/io/FileNotFoundException;
        //  2404   2416   3825   3835   Any
        //  2420   2456   3218   3223   Ljava/io/IOException;
        //  2420   2456   3223   3235   Ljava/io/FileNotFoundException;
        //  2420   2456   3825   3835   Any
        //  2463   2474   3223   3235   Ljava/io/FileNotFoundException;
        //  2463   2474   3825   3835   Any
        //  2474   2479   3201   3218   Any
        //  2499   2502   2502   2507   Ljava/io/IOException;
        //  2514   2517   2517   2522   Ljava/io/IOException;
        //  2524   2527   2527   2532   Ljava/io/IOException;
        //  2529   2532   2532   2537   Ljava/io/IOException;
        //  2534   2537   2537   2542   Ljava/io/IOException;
        //  2539   2542   2542   2552   Ljava/io/IOException;
        //  2544   2547   2547   2552   Ljava/io/IOException;
        //  2549   2552   2552   2557   Ljava/io/IOException;
        //  2559   2562   2562   2572   Ljava/io/IOException;
        //  2564   2567   2567   2572   Ljava/io/IOException;
        //  2569   2572   2572   2577   Ljava/io/IOException;
        //  2574   2577   2577   2582   Ljava/io/IOException;
        //  2584   2587   2587   2592   Ljava/io/IOException;
        //  2589   2592   2592   2597   Ljava/io/IOException;
        //  2609   2612   2612   2617   Ljava/io/IOException;
        //  2614   2617   2617   2622   Ljava/io/IOException;
        //  2619   2622   2622   2627   Ljava/io/IOException;
        //  2634   2637   2637   2647   Ljava/io/IOException;
        //  2639   2642   2642   2647   Ljava/io/IOException;
        //  2649   2652   2652   2657   Ljava/io/IOException;
        //  2654   2657   2657   2662   Ljava/io/IOException;
        //  2664   2667   2667   2672   Ljava/io/IOException;
        //  2669   2672   2672   2695   Ljava/io/IOException;
        //  2816   2832   2946   2951   Ljava/io/IOException;
        //  2853   2859   2951   2956   Ljava/io/IOException;
        //  2881   2887   2956   2961   Ljava/io/IOException;
        //  2892   2912   2961   2966   Ljava/io/IOException;
        //  2917   2938   2941   2946   Ljava/io/IOException;
        //  2958   2961   2961   2966   Ljava/io/IOException;
        //  2968   2971   1338   1361   Ljava/io/IOException;
        //  2973   2976   1338   1361   Ljava/io/IOException;
        //  2978   2981   1338   1361   Ljava/io/IOException;
        //  2988   2991   2991   2996   La;
        //  3003   3006   1743   3105   Ljava/io/IOException;
        //  3006   3033   1743   3105   Ljava/io/IOException;
        //  3039   3066   1743   3105   Ljava/io/IOException;
        //  3077   3080   3080   3085   Ljava/io/IOException;
        //  3082   3085   3085   3090   Ljava/io/IOException;
        //  3087   3090   3090   3095   Ljava/io/IOException;
        //  3092   3095   1743   3105   Ljava/io/IOException;
        //  3097   3100   1738   1743   Ljava/io/IOException;
        //  3102   3105   3105   3110   Ljava/io/IOException;
        //  3107   3110   3110   3120   Ljava/io/IOException;
        //  3112   3115   3115   3120   Ljava/io/IOException;
        //  3117   3120   3120   3130   Ljava/io/IOException;
        //  3122   3125   3125   3130   Ljava/io/IOException;
        //  3163   3166   3166   3176   Ljava/io/IOException;
        //  3168   3171   3171   3176   Ljava/io/IOException;
        //  3173   3176   3176   3181   Ljava/io/IOException;
        //  3178   3181   3181   3196   Ljava/io/IOException;
        //  3183   3186   3186   3196   Ljava/io/IOException;
        //  3188   3191   3191   3196   Ljava/io/IOException;
        //  3198   3201   3201   3218   Any
        //  3208   3215   3840   3845   Ljava/io/IOException;
        //  3220   3223   3223   3235   Ljava/io/FileNotFoundException;
        //  3220   3223   3825   3835   Any
        //  3225   3230   3825   3835   Any
        //  3230   3235   3201   3218   Any
        //  3240   3247   3835   3840   Ljava/io/IOException;
        //  3464   3546   3845   3850   Ljava/io/IOException;
        //  3551   3564   3850   3855   Ljava/io/IOException;
        //  3569   3587   3855   3860   Ljava/io/IOException;
        //  3592   3606   3860   3865   Ljava/io/IOException;
        //  3611   3632   3865   3870   Ljava/io/IOException;
        //  3637   3681   3865   3870   Ljava/io/IOException;
        //  3681   3685   3870   3885   Ljava/io/IOException;
        //  3699   3713   3885   3890   Ljava/io/IOException;
        //  3718   3745   3890   3895   Ljava/io/IOException;
        //  3750   3762   3895   3900   Ljava/io/IOException;
        //  3767   3774   3900   3905   Ljava/io/IOException;
        //  3779   3809   3812   3817   Ljava/io/IOException;
        //  3817   3822   3201   3218   Any
        //  3827   3835   3201   3218   Any
        //  3847   3850   3850   3855   Ljava/io/IOException;
        //  3852   3855   3855   3860   Ljava/io/IOException;
        //  3857   3860   3860   3865   Ljava/io/IOException;
        //  3862   3865   3865   3870   Ljava/io/IOException;
        //  3872   3875   3875   3885   Ljava/io/IOException;
        //  3877   3880   3880   3885   Ljava/io/IOException;
        //  3882   3885   3885   3890   Ljava/io/IOException;
        //  3887   3890   3890   3895   Ljava/io/IOException;
        //  3892   3895   3895   3900   Ljava/io/IOException;
        //  3897   3900   3900   3905   Ljava/io/IOException;
        //  3902   3905   3812   3817   Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 1799, Size: 1799
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
    
    @Override
    public void onBackPressed() {
        try {
            Conversation.a_ = true;
            if (this.isTaskRoot()) {
                this.startActivity(new Intent((Context)this, Main.h()));
            }
            super.onBackPressed();
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    @Override
    public void onConfigurationChanged(final Configuration p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: aload_1        
        //     6: invokespecial   com/whatsapp/DialogToastListActivity.onConfigurationChanged:(Landroid/content/res/Configuration;)V
        //     9: aload_0        
        //    10: getfield        com/whatsapp/Conversation.aL:Landroid/view/inputmethod/InputMethodManager;
        //    13: invokevirtual   android/view/inputmethod/InputMethodManager.isFullscreenMode:()Z
        //    16: ifeq            55
        //    19: aload_1        
        //    20: getfield        android/content/res/Configuration.orientation:I
        //    23: istore          13
        //    25: iload           13
        //    27: iconst_1       
        //    28: if_icmpne       55
        //    31: aload_0        
        //    32: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //    35: iconst_2       
        //    36: invokevirtual   android/widget/ListView.setTranscriptMode:(I)V
        //    39: aload_0        
        //    40: getfield        com/whatsapp/Conversation.ax:Landroid/os/Handler;
        //    43: iconst_0       
        //    44: ldc2_w          1000
        //    47: invokevirtual   android/os/Handler.sendEmptyMessageDelayed:(IJ)Z
        //    50: pop            
        //    51: iload_2        
        //    52: ifeq            101
        //    55: aload_0        
        //    56: getfield        com/whatsapp/Conversation.a4:Z
        //    59: istore          5
        //    61: iload           5
        //    63: ifeq            90
        //    66: aload_0        
        //    67: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //    70: iconst_2       
        //    71: invokevirtual   android/widget/ListView.setTranscriptMode:(I)V
        //    74: aload_0        
        //    75: getfield        com/whatsapp/Conversation.ax:Landroid/os/Handler;
        //    78: iconst_1       
        //    79: ldc2_w          1000
        //    82: invokevirtual   android/os/Handler.sendEmptyMessageDelayed:(IJ)Z
        //    85: pop            
        //    86: iload_2        
        //    87: ifeq            101
        //    90: aload_0        
        //    91: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //    94: aload_0        
        //    95: getfield        com/whatsapp/Conversation.ba:I
        //    98: invokevirtual   android/widget/ListView.setSelection:(I)V
        //   101: aload_1        
        //   102: getfield        android/content/res/Configuration.orientation:I
        //   105: istore          8
        //   107: iload           8
        //   109: iconst_1       
        //   110: if_icmpne       128
        //   113: aload_0        
        //   114: getfield        com/whatsapp/Conversation.a5:Lcom/whatsapp/vc;
        //   117: aload_0        
        //   118: getfield        com/whatsapp/Conversation.X:Lcom/whatsapp/ConversationTextEntry;
        //   121: invokevirtual   com/whatsapp/vc.a:(Landroid/widget/EditText;)V
        //   124: iload_2        
        //   125: ifeq            136
        //   128: aload_0        
        //   129: getfield        com/whatsapp/Conversation.X:Lcom/whatsapp/ConversationTextEntry;
        //   132: iconst_2       
        //   133: invokevirtual   com/whatsapp/ConversationTextEntry.setMaxLines:(I)V
        //   136: aload_0        
        //   137: getfield        com/whatsapp/Conversation.Z:Lcom/whatsapp/l1;
        //   140: invokevirtual   com/whatsapp/l1.isShowing:()Z
        //   143: ifeq            154
        //   146: aload_0        
        //   147: getfield        com/whatsapp/Conversation.Z:Lcom/whatsapp/l1;
        //   150: aload_1        
        //   151: invokevirtual   com/whatsapp/l1.a:(Landroid/content/res/Configuration;)V
        //   154: return         
        //   155: astore          11
        //   157: aload           11
        //   159: athrow         
        //   160: astore          12
        //   162: aload           12
        //   164: athrow         
        //   165: astore_3       
        //   166: aload_3        
        //   167: athrow         
        //   168: astore          4
        //   170: aload           4
        //   172: athrow         
        //   173: astore          6
        //   175: aload           6
        //   177: athrow         
        //   178: astore          7
        //   180: aload           7
        //   182: athrow         
        //   183: astore          9
        //   185: aload           9
        //   187: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  19     25     155    160    Landroid/content/ActivityNotFoundException;
        //  31     51     160    165    Landroid/content/ActivityNotFoundException;
        //  55     61     165    168    Landroid/content/ActivityNotFoundException;
        //  66     86     168    173    Landroid/content/ActivityNotFoundException;
        //  90     101    168    173    Landroid/content/ActivityNotFoundException;
        //  101    107    173    178    Landroid/content/ActivityNotFoundException;
        //  113    124    178    183    Landroid/content/ActivityNotFoundException;
        //  128    136    178    183    Landroid/content/ActivityNotFoundException;
        //  136    154    183    188    Landroid/content/ActivityNotFoundException;
        //  157    160    160    165    Landroid/content/ActivityNotFoundException;
        //  162    165    165    168    Landroid/content/ActivityNotFoundException;
        //  166    168    168    173    Landroid/content/ActivityNotFoundException;
        //  175    178    178    183    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 96, Size: 96
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
    
    public void onCreate(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //     7: sipush          167
        //    10: aaload         
        //    11: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    14: invokestatic    com/whatsapp/App.y:()V
        //    17: new             Lcom/whatsapp/util/b0;
        //    20: dup            
        //    21: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    24: sipush          179
        //    27: aaload         
        //    28: invokespecial   com/whatsapp/util/b0.<init>:(Ljava/lang/String;)V
        //    31: astore_3       
        //    32: getstatic       com/whatsapp/App.aS:I
        //    35: iconst_3       
        //    36: if_icmpne       43
        //    39: aload_0        
        //    40: invokestatic    com/whatsapp/util/b_.b:(Landroid/app/Activity;)V
        //    43: aload_0        
        //    44: invokevirtual   com/whatsapp/Conversation.getWindow:()Landroid/view/Window;
        //    47: bipush          13
        //    49: invokevirtual   android/view/Window.requestFeature:(I)Z
        //    52: pop            
        //    53: aload_0        
        //    54: invokevirtual   com/whatsapp/Conversation.getWindow:()Landroid/view/Window;
        //    57: bipush          12
        //    59: invokevirtual   android/view/Window.requestFeature:(I)Z
        //    62: pop            
        //    63: aload_0        
        //    64: invokevirtual   com/whatsapp/Conversation.getWindow:()Landroid/view/Window;
        //    67: new             Landroid/graphics/drawable/ColorDrawable;
        //    70: dup            
        //    71: iconst_0       
        //    72: invokespecial   android/graphics/drawable/ColorDrawable.<init>:(I)V
        //    75: invokevirtual   android/view/Window.setBackgroundDrawable:(Landroid/graphics/drawable/Drawable;)V
        //    78: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    81: bipush          21
        //    83: if_icmplt       96
        //    86: aload_0        
        //    87: invokevirtual   com/whatsapp/Conversation.getWindow:()Landroid/view/Window;
        //    90: ldc_w           -2147483648
        //    93: invokevirtual   android/view/Window.addFlags:(I)V
        //    96: aload_0        
        //    97: aload_1        
        //    98: invokespecial   com/whatsapp/DialogToastListActivity.onCreate:(Landroid/os/Bundle;)V
        //   101: aload_0        
        //   102: invokevirtual   com/whatsapp/Conversation.d:()V
        //   105: aload_0        
        //   106: invokevirtual   com/whatsapp/Conversation.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //   109: aload_0        
        //   110: invokevirtual   com/whatsapp/Conversation.getResources:()Landroid/content/res/Resources;
        //   113: ldc_w           2131361864
        //   116: invokevirtual   android/content/res/Resources.getDimension:(I)F
        //   119: invokevirtual   android/support/v7/app/ActionBar.setElevation:(F)V
        //   122: aload_1        
        //   123: ifnull          182
        //   126: iconst_1       
        //   127: istore          9
        //   129: aload_0        
        //   130: iload           9
        //   132: putfield        com/whatsapp/Conversation.B:Z
        //   135: aload_0        
        //   136: getfield        com/whatsapp/Conversation.B:Z
        //   139: ifne            145
        //   142: invokestatic    com/whatsapp/ConversationRowVoiceNote.b:()V
        //   145: aconst_null    
        //   146: invokestatic    com/whatsapp/util/WhatsAppLibLoader.a:(Landroid/content/Context;)Z
        //   149: ifne            198
        //   152: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   155: sipush          171
        //   158: aaload         
        //   159: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   162: aload_0        
        //   163: invokevirtual   com/whatsapp/Conversation.finish:()V
        //   166: return         
        //   167: astore          4
        //   169: aload           4
        //   171: athrow         
        //   172: astore          5
        //   174: aload           5
        //   176: athrow         
        //   177: astore          8
        //   179: aload           8
        //   181: athrow         
        //   182: iconst_0       
        //   183: istore          9
        //   185: goto            129
        //   188: astore          10
        //   190: aload           10
        //   192: athrow         
        //   193: astore          11
        //   195: aload           11
        //   197: athrow         
        //   198: getstatic       com/whatsapp/App.aX:Lcom/whatsapp/App$Me;
        //   201: astore          14
        //   203: aload           14
        //   205: ifnull          229
        //   208: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   211: invokevirtual   com/whatsapp/vy.l:()Z
        //   214: ifeq            229
        //   217: aload_0        
        //   218: invokestatic    com/whatsapp/App.c:(Landroid/content/Context;)I
        //   221: istore          15
        //   223: iload           15
        //   225: iconst_3       
        //   226: if_icmpeq       279
        //   229: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   232: sipush          168
        //   235: aaload         
        //   236: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   239: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   242: sipush          185
        //   245: aaload         
        //   246: invokestatic    com/whatsapp/App.F:(Ljava/lang/String;)V
        //   249: aload_0        
        //   250: new             Landroid/content/Intent;
        //   253: dup            
        //   254: aload_0        
        //   255: ldc_w           Lcom/whatsapp/Main;.class
        //   258: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   261: invokevirtual   com/whatsapp/Conversation.startActivity:(Landroid/content/Intent;)V
        //   264: aload_0        
        //   265: invokevirtual   com/whatsapp/Conversation.finish:()V
        //   268: return         
        //   269: astore          12
        //   271: aload           12
        //   273: athrow         
        //   274: astore          13
        //   276: aload           13
        //   278: athrow         
        //   279: aload_0        
        //   280: invokevirtual   com/whatsapp/Conversation.getIntent:()Landroid/content/Intent;
        //   283: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   286: sipush          165
        //   289: aaload         
        //   290: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   293: astore          16
        //   295: aload           16
        //   297: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   300: ifeq            364
        //   303: aload_0        
        //   304: invokevirtual   com/whatsapp/Conversation.getIntent:()Landroid/content/Intent;
        //   307: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   310: invokestatic    com/whatsapp/contact/ContactProvider.a:(Landroid/net/Uri;)Z
        //   313: istore          62
        //   315: iload           62
        //   317: ifeq            364
        //   320: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   323: aload_0        
        //   324: invokevirtual   com/whatsapp/Conversation.getIntent:()Landroid/content/Intent;
        //   327: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   330: invokevirtual   com/whatsapp/wc.a:(Landroid/net/Uri;)Lcom/whatsapp/a_9;
        //   333: astore          63
        //   335: aload           63
        //   337: ifnull          364
        //   340: aload           63
        //   342: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   345: astore          16
        //   347: aload_0        
        //   348: invokevirtual   com/whatsapp/Conversation.getIntent:()Landroid/content/Intent;
        //   351: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   354: sipush          177
        //   357: aaload         
        //   358: aload           16
        //   360: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   363: pop            
        //   364: aload           16
        //   366: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   369: ifne            537
        //   372: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   375: aload           16
        //   377: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   380: astore          52
        //   382: aload           52
        //   384: ifnull          423
        //   387: aload           52
        //   389: invokevirtual   com/whatsapp/a_9.m:()Z
        //   392: istore          59
        //   394: iload           59
        //   396: ifne            411
        //   399: aload           52
        //   401: invokevirtual   com/whatsapp/a_9.o:()Z
        //   404: istore          61
        //   406: iload           61
        //   408: ifeq            537
        //   411: aload           52
        //   413: getfield        com/whatsapp/a_9.t:Ljava/lang/String;
        //   416: astore          60
        //   418: aload           60
        //   420: ifnonnull       537
        //   423: aload           52
        //   425: ifnull          435
        //   428: aload           52
        //   430: iconst_0       
        //   431: iconst_1       
        //   432: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/a_9;ZZ)V
        //   435: aload_0        
        //   436: invokevirtual   com/whatsapp/Conversation.getIntent:()Landroid/content/Intent;
        //   439: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   442: sipush          186
        //   445: aaload         
        //   446: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   449: astore          53
        //   451: aload           53
        //   453: ifnull          537
        //   456: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   459: sipush          182
        //   462: aaload         
        //   463: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   466: aload_0        
        //   467: aload_0        
        //   468: ldc_w           2131231207
        //   471: iconst_1       
        //   472: anewarray       Ljava/lang/Object;
        //   475: dup            
        //   476: iconst_0       
        //   477: aload           53
        //   479: aastore        
        //   480: invokevirtual   com/whatsapp/Conversation.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   483: iconst_1       
        //   484: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;Ljava/lang/String;I)V
        //   487: aload_0        
        //   488: new             Landroid/content/Intent;
        //   491: dup            
        //   492: aload_0        
        //   493: invokestatic    com/whatsapp/Main.h:()Ljava/lang/Class;
        //   496: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   499: invokevirtual   com/whatsapp/Conversation.startActivity:(Landroid/content/Intent;)V
        //   502: aload_0        
        //   503: invokevirtual   com/whatsapp/Conversation.finish:()V
        //   506: return         
        //   507: astore          54
        //   509: aload           54
        //   511: athrow         
        //   512: astore          17
        //   514: aload           17
        //   516: athrow         
        //   517: astore          56
        //   519: aload           56
        //   521: athrow         
        //   522: astore          57
        //   524: aload           57
        //   526: athrow         
        //   527: astore          58
        //   529: aload           58
        //   531: athrow         
        //   532: astore          55
        //   534: aload           55
        //   536: athrow         
        //   537: aload_0        
        //   538: invokevirtual   com/whatsapp/Conversation.getIntent:()Landroid/content/Intent;
        //   541: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   544: sipush          172
        //   547: aaload         
        //   548: iconst_0       
        //   549: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   552: ifeq            561
        //   555: invokestatic    com/whatsapp/notification/w.b:()Lcom/whatsapp/notification/w;
        //   558: invokevirtual   com/whatsapp/notification/w.c:()V
        //   561: aload_0        
        //   562: iconst_1       
        //   563: putfield        com/whatsapp/Conversation.L:Z
        //   566: aload_0        
        //   567: ldc_w           2130903106
        //   570: invokevirtual   com/whatsapp/Conversation.setContentView:(I)V
        //   573: aload_0        
        //   574: invokevirtual   com/whatsapp/Conversation.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //   577: iconst_0       
        //   578: invokevirtual   android/support/v7/app/ActionBar.setDisplayHomeAsUpEnabled:(Z)V
        //   581: aload_0        
        //   582: ldc_w           2131755371
        //   585: invokevirtual   com/whatsapp/Conversation.findViewById:(I)Landroid/view/View;
        //   588: checkcast       Landroid/support/v7/widget/Toolbar;
        //   591: iconst_0       
        //   592: iconst_0       
        //   593: invokevirtual   android/support/v7/widget/Toolbar.setContentInsetsAbsolute:(II)V
        //   596: aload_0        
        //   597: new             Lcom/whatsapp/ph;
        //   600: dup            
        //   601: aload_0        
        //   602: aload_0        
        //   603: aload_0        
        //   604: invokespecial   com/whatsapp/ph.<init>:(Lcom/whatsapp/Conversation;Landroid/app/Activity;Lcom/whatsapp/gu;)V
        //   607: putfield        com/whatsapp/Conversation.al:Lcom/whatsapp/ps;
        //   610: aload_0        
        //   611: aload_0        
        //   612: ldc_w           2131755427
        //   615: invokevirtual   com/whatsapp/Conversation.findViewById:(I)Landroid/view/View;
        //   618: putfield        com/whatsapp/Conversation.aE:Landroid/view/View;
        //   621: aload_0        
        //   622: getfield        com/whatsapp/Conversation.aE:Landroid/view/View;
        //   625: new             Lcom/whatsapp/ti;
        //   628: dup            
        //   629: aload_0        
        //   630: invokespecial   com/whatsapp/ti.<init>:(Lcom/whatsapp/Conversation;)V
        //   633: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   636: aload_0        
        //   637: aload_0        
        //   638: ldc_w           2131755428
        //   641: invokevirtual   com/whatsapp/Conversation.findViewById:(I)Landroid/view/View;
        //   644: checkcast       Landroid/widget/TextView;
        //   647: putfield        com/whatsapp/Conversation.W:Landroid/widget/TextView;
        //   650: aload_0        
        //   651: aload_0        
        //   652: ldc_w           2131755418
        //   655: invokevirtual   com/whatsapp/Conversation.findViewById:(I)Landroid/view/View;
        //   658: checkcast       Lcom/whatsapp/ConversationContentLayout;
        //   661: putfield        com/whatsapp/Conversation.aX:Lcom/whatsapp/ConversationContentLayout;
        //   664: aload_0        
        //   665: aload_0        
        //   666: ldc_w           2131755441
        //   669: invokevirtual   com/whatsapp/Conversation.findViewById:(I)Landroid/view/View;
        //   672: putfield        com/whatsapp/Conversation.aO:Landroid/view/View;
        //   675: aload_0        
        //   676: invokevirtual   com/whatsapp/Conversation.getWindowManager:()Landroid/view/WindowManager;
        //   679: invokeinterface android/view/WindowManager.getDefaultDisplay:()Landroid/view/Display;
        //   684: putstatic       com/whatsapp/Conversation.aR:Landroid/view/Display;
        //   687: aload_0        
        //   688: invokestatic    com/whatsapp/vc.b:()Lcom/whatsapp/vc;
        //   691: putfield        com/whatsapp/Conversation.a5:Lcom/whatsapp/vc;
        //   694: aload_0        
        //   695: aload_0        
        //   696: ldc_w           2131755422
        //   699: invokevirtual   com/whatsapp/Conversation.findViewById:(I)Landroid/view/View;
        //   702: checkcast       Landroid/widget/TextView;
        //   705: putfield        com/whatsapp/Conversation.ah:Landroid/widget/TextView;
        //   708: aload_0        
        //   709: getfield        com/whatsapp/Conversation.az:Z
        //   712: ifeq            725
        //   715: aload_0        
        //   716: invokestatic    com/whatsapp/wallpaper/h.f:(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
        //   719: astore          51
        //   721: iload_2        
        //   722: ifeq            2153
        //   725: aload_0        
        //   726: aload_0        
        //   727: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   730: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   733: invokestatic    com/whatsapp/wallpaper/h.a:(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
        //   736: astore          19
        //   738: aload_0        
        //   739: aload_0        
        //   740: ldc_w           2131755420
        //   743: invokevirtual   com/whatsapp/Conversation.findViewById:(I)Landroid/view/View;
        //   746: checkcast       Lcom/whatsapp/wallpaper/WallPaperView;
        //   749: putfield        com/whatsapp/Conversation.y:Lcom/whatsapp/wallpaper/WallPaperView;
        //   752: aload_0        
        //   753: getfield        com/whatsapp/Conversation.y:Lcom/whatsapp/wallpaper/WallPaperView;
        //   756: new             Lcom/whatsapp/jn;
        //   759: dup            
        //   760: aload_0        
        //   761: invokespecial   com/whatsapp/jn.<init>:(Lcom/whatsapp/Conversation;)V
        //   764: invokevirtual   com/whatsapp/wallpaper/WallPaperView.setOnSizeChangedListener:(Lcom/whatsapp/wallpaper/a;)V
        //   767: aload_0        
        //   768: aload           19
        //   770: invokespecial   com/whatsapp/Conversation.a:(Landroid/graphics/drawable/Drawable;)V
        //   773: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   776: sipush          184
        //   779: aaload         
        //   780: astore          20
        //   782: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   785: aload           20
        //   787: iconst_0       
        //   788: invokevirtual   com/whatsapp/App.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //   791: astore          21
        //   793: aload           21
        //   795: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   798: sipush          183
        //   801: aaload         
        //   802: iconst_1       
        //   803: invokeinterface android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
        //   808: putstatic       com/whatsapp/Conversation.a3:Z
        //   811: aload           21
        //   813: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   816: sipush          169
        //   819: aaload         
        //   820: iconst_1       
        //   821: invokeinterface android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
        //   826: putstatic       com/whatsapp/Conversation.M:Z
        //   829: aload_0        
        //   830: aload_0        
        //   831: invokevirtual   com/whatsapp/Conversation.c:()Landroid/widget/ListView;
        //   834: putfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //   837: aload_0        
        //   838: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //   841: iconst_0       
        //   842: invokevirtual   android/widget/ListView.setDividerHeight:(I)V
        //   845: aload_0        
        //   846: aload_0        
        //   847: ldc_w           2131755447
        //   850: invokevirtual   com/whatsapp/Conversation.findViewById:(I)Landroid/view/View;
        //   853: checkcast       Lcom/whatsapp/ConversationTextEntry;
        //   856: putfield        com/whatsapp/Conversation.X:Lcom/whatsapp/ConversationTextEntry;
        //   859: aload_0        
        //   860: getfield        com/whatsapp/Conversation.X:Lcom/whatsapp/ConversationTextEntry;
        //   863: aload_0        
        //   864: ldc_w           2131231859
        //   867: invokevirtual   com/whatsapp/Conversation.getString:(I)Ljava/lang/String;
        //   870: invokevirtual   com/whatsapp/ConversationTextEntry.setHint:(Ljava/lang/String;)V
        //   873: aload_0        
        //   874: aload_0        
        //   875: ldc_w           2131755456
        //   878: invokevirtual   com/whatsapp/Conversation.findViewById:(I)Landroid/view/View;
        //   881: checkcast       Landroid/widget/ImageButton;
        //   884: putfield        com/whatsapp/Conversation.a6:Landroid/widget/ImageButton;
        //   887: aload_0        
        //   888: getfield        com/whatsapp/Conversation.a6:Landroid/widget/ImageButton;
        //   891: new             Lcom/whatsapp/util/m;
        //   894: dup            
        //   895: aload_0        
        //   896: invokevirtual   com/whatsapp/Conversation.getResources:()Landroid/content/res/Resources;
        //   899: ldc_w           2130838884
        //   902: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   905: invokespecial   com/whatsapp/util/m.<init>:(Landroid/graphics/drawable/Drawable;)V
        //   908: invokevirtual   android/widget/ImageButton.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   911: aload_0        
        //   912: ldc_w           2131755444
        //   915: invokevirtual   com/whatsapp/Conversation.findViewById:(I)Landroid/view/View;
        //   918: new             Lcom/whatsapp/util/m;
        //   921: dup            
        //   922: aload_0        
        //   923: invokevirtual   com/whatsapp/Conversation.getResources:()Landroid/content/res/Resources;
        //   926: ldc_w           2130838869
        //   929: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   932: invokespecial   com/whatsapp/util/m.<init>:(Landroid/graphics/drawable/Drawable;)V
        //   935: invokevirtual   android/view/View.setBackgroundDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   938: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   941: bipush          21
        //   943: if_icmplt       965
        //   946: new             Lcom/whatsapp/j8;
        //   949: dup            
        //   950: aload_0        
        //   951: invokespecial   com/whatsapp/j8.<init>:(Lcom/whatsapp/Conversation;)V
        //   954: astore          22
        //   956: aload_0        
        //   957: getfield        com/whatsapp/Conversation.a6:Landroid/widget/ImageButton;
        //   960: aload           22
        //   962: invokevirtual   android/widget/ImageButton.setOutlineProvider:(Landroid/view/ViewOutlineProvider;)V
        //   965: aload_0        
        //   966: aload_0        
        //   967: ldc_w           2131755446
        //   970: invokevirtual   com/whatsapp/Conversation.findViewById:(I)Landroid/view/View;
        //   973: checkcast       Landroid/widget/ImageButton;
        //   976: putfield        com/whatsapp/Conversation.a2:Landroid/widget/ImageButton;
        //   979: aload_0        
        //   980: aload_0        
        //   981: ldc_w           2131755457
        //   984: invokevirtual   com/whatsapp/Conversation.findViewById:(I)Landroid/view/View;
        //   987: checkcast       Landroid/widget/ImageButton;
        //   990: putfield        com/whatsapp/Conversation.E:Landroid/widget/ImageButton;
        //   993: aload_0        
        //   994: aload_0        
        //   995: ldc_w           2131755448
        //   998: invokevirtual   com/whatsapp/Conversation.findViewById:(I)Landroid/view/View;
        //  1001: checkcast       Landroid/widget/ImageButton;
        //  1004: putfield        com/whatsapp/Conversation.ab:Landroid/widget/ImageButton;
        //  1007: aload_0        
        //  1008: getfield        com/whatsapp/Conversation.ab:Landroid/widget/ImageButton;
        //  1011: new             Lcom/whatsapp/pa;
        //  1014: dup            
        //  1015: aload_0        
        //  1016: invokespecial   com/whatsapp/pa.<init>:(Lcom/whatsapp/Conversation;)V
        //  1019: invokevirtual   android/widget/ImageButton.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //  1022: aload_0        
        //  1023: getfield        com/whatsapp/Conversation.ab:Landroid/widget/ImageButton;
        //  1026: new             Lcom/whatsapp/ar2;
        //  1029: dup            
        //  1030: aload_0        
        //  1031: invokespecial   com/whatsapp/ar2.<init>:(Lcom/whatsapp/Conversation;)V
        //  1034: invokevirtual   android/widget/ImageButton.setOnLongClickListener:(Landroid/view/View$OnLongClickListener;)V
        //  1037: aload_0        
        //  1038: invokevirtual   com/whatsapp/Conversation.getBaseContext:()Landroid/content/Context;
        //  1041: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1044: sipush          175
        //  1047: aaload         
        //  1048: invokevirtual   android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //  1051: checkcast       Landroid/view/LayoutInflater;
        //  1054: astore          23
        //  1056: aload_0        
        //  1057: aload           23
        //  1059: ldc_w           2130903109
        //  1062: aload_0        
        //  1063: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //  1066: iconst_0       
        //  1067: invokestatic    com/whatsapp/alm.a:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //  1070: putfield        com/whatsapp/Conversation.aa:Landroid/view/View;
        //  1073: aload_0        
        //  1074: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //  1077: aload_0        
        //  1078: getfield        com/whatsapp/Conversation.aa:Landroid/view/View;
        //  1081: invokevirtual   android/widget/ListView.addHeaderView:(Landroid/view/View;)V
        //  1084: aload_0        
        //  1085: getfield        com/whatsapp/Conversation.aa:Landroid/view/View;
        //  1088: ldc_w           2131755438
        //  1091: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //  1094: new             Lcom/whatsapp/a2j;
        //  1097: dup            
        //  1098: aload_0        
        //  1099: invokespecial   com/whatsapp/a2j.<init>:(Lcom/whatsapp/Conversation;)V
        //  1102: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //  1105: aload_0        
        //  1106: getfield        com/whatsapp/Conversation.aa:Landroid/view/View;
        //  1109: ldc_w           2131755439
        //  1112: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //  1115: new             Lcom/whatsapp/qj;
        //  1118: dup            
        //  1119: aload_0        
        //  1120: invokespecial   com/whatsapp/qj.<init>:(Lcom/whatsapp/Conversation;)V
        //  1123: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //  1126: aload_0        
        //  1127: aload           23
        //  1129: ldc_w           2130903108
        //  1132: aload_0        
        //  1133: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //  1136: iconst_0       
        //  1137: invokestatic    com/whatsapp/alm.a:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //  1140: putfield        com/whatsapp/Conversation.aF:Landroid/view/View;
        //  1143: aload_0        
        //  1144: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //  1147: aload_0        
        //  1148: getfield        com/whatsapp/Conversation.aF:Landroid/view/View;
        //  1151: invokevirtual   android/widget/ListView.addFooterView:(Landroid/view/View;)V
        //  1154: aload_0        
        //  1155: getfield        com/whatsapp/Conversation.aF:Landroid/view/View;
        //  1158: ldc_w           2131755437
        //  1161: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //  1164: new             Lcom/whatsapp/qs;
        //  1167: dup            
        //  1168: aload_0        
        //  1169: invokespecial   com/whatsapp/qs.<init>:(Lcom/whatsapp/Conversation;)V
        //  1172: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //  1175: aload_0        
        //  1176: getfield        com/whatsapp/Conversation.aF:Landroid/view/View;
        //  1179: ldc_w           2131755438
        //  1182: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //  1185: new             Lcom/whatsapp/qt;
        //  1188: dup            
        //  1189: aload_0        
        //  1190: invokespecial   com/whatsapp/qt.<init>:(Lcom/whatsapp/Conversation;)V
        //  1193: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //  1196: aload_0        
        //  1197: getfield        com/whatsapp/Conversation.aF:Landroid/view/View;
        //  1200: ldc_w           2131755439
        //  1203: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //  1206: new             Lcom/whatsapp/ah4;
        //  1209: dup            
        //  1210: aload_0        
        //  1211: invokespecial   com/whatsapp/ah4.<init>:(Lcom/whatsapp/Conversation;)V
        //  1214: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //  1217: aload_0        
        //  1218: aload           23
        //  1220: ldc_w           2130903111
        //  1223: aload_0        
        //  1224: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //  1227: iconst_0       
        //  1228: invokestatic    com/whatsapp/alm.a:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //  1231: putfield        com/whatsapp/Conversation.aN:Landroid/view/View;
        //  1234: aload_0        
        //  1235: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //  1238: aload_0        
        //  1239: getfield        com/whatsapp/Conversation.aN:Landroid/view/View;
        //  1242: invokevirtual   android/widget/ListView.addHeaderView:(Landroid/view/View;)V
        //  1245: aload_0        
        //  1246: getfield        com/whatsapp/Conversation.aN:Landroid/view/View;
        //  1249: ldc_w           2131755462
        //  1252: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //  1255: new             Lcom/whatsapp/_8;
        //  1258: dup            
        //  1259: aload_0        
        //  1260: invokespecial   com/whatsapp/_8.<init>:(Lcom/whatsapp/Conversation;)V
        //  1263: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //  1266: aload_0        
        //  1267: aconst_null    
        //  1268: invokespecial   com/whatsapp/Conversation.k:(Ljava/lang/String;)Z
        //  1271: ifne            1299
        //  1274: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1277: sipush          180
        //  1280: aaload         
        //  1281: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  1284: aload_0        
        //  1285: invokevirtual   com/whatsapp/Conversation.finish:()V
        //  1288: return         
        //  1289: astore          24
        //  1291: aload           24
        //  1293: athrow         
        //  1294: astore          18
        //  1296: aload           18
        //  1298: athrow         
        //  1299: aload_0        
        //  1300: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //  1303: iconst_1       
        //  1304: invokevirtual   android/widget/ListView.setScrollbarFadingEnabled:(Z)V
        //  1307: aload_0        
        //  1308: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //  1311: aload_0        
        //  1312: getfield        com/whatsapp/Conversation.P:Landroid/widget/AbsListView$OnScrollListener;
        //  1315: invokevirtual   android/widget/ListView.setOnScrollListener:(Landroid/widget/AbsListView$OnScrollListener;)V
        //  1318: aload_0        
        //  1319: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //  1322: new             Lcom/whatsapp/a2f;
        //  1325: dup            
        //  1326: aload_0        
        //  1327: invokespecial   com/whatsapp/a2f.<init>:(Lcom/whatsapp/Conversation;)V
        //  1330: invokevirtual   android/widget/ListView.setOnTouchListener:(Landroid/view/View$OnTouchListener;)V
        //  1333: aload_0        
        //  1334: aload_0        
        //  1335: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //  1338: invokevirtual   com/whatsapp/Conversation.registerForContextMenu:(Landroid/view/View;)V
        //  1341: aload_0        
        //  1342: getfield        com/whatsapp/Conversation.X:Lcom/whatsapp/ConversationTextEntry;
        //  1345: iconst_1       
        //  1346: invokevirtual   com/whatsapp/ConversationTextEntry.setScrollbarFadingEnabled:(Z)V
        //  1349: aload_0        
        //  1350: getfield        com/whatsapp/Conversation.X:Lcom/whatsapp/ConversationTextEntry;
        //  1353: aload_0        
        //  1354: getfield        com/whatsapp/Conversation.H:Landroid/text/TextWatcher;
        //  1357: invokevirtual   com/whatsapp/ConversationTextEntry.addTextChangedListener:(Landroid/text/TextWatcher;)V
        //  1360: aload_0        
        //  1361: getfield        com/whatsapp/Conversation.X:Lcom/whatsapp/ConversationTextEntry;
        //  1364: aload_0        
        //  1365: getfield        com/whatsapp/Conversation.r:Landroid/widget/TextView$OnEditorActionListener;
        //  1368: invokevirtual   com/whatsapp/ConversationTextEntry.setOnEditorActionListener:(Landroid/widget/TextView$OnEditorActionListener;)V
        //  1371: aload_0        
        //  1372: getfield        com/whatsapp/Conversation.X:Lcom/whatsapp/ConversationTextEntry;
        //  1375: aload_0        
        //  1376: getfield        com/whatsapp/Conversation.V:Landroid/view/View$OnClickListener;
        //  1379: invokevirtual   com/whatsapp/ConversationTextEntry.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //  1382: aload_0        
        //  1383: getfield        com/whatsapp/Conversation.X:Lcom/whatsapp/ConversationTextEntry;
        //  1386: getstatic       com/whatsapp/Conversation.a3:Z
        //  1389: invokevirtual   com/whatsapp/ConversationTextEntry.setInputEnterSend:(Z)V
        //  1392: aload_0        
        //  1393: getfield        com/whatsapp/Conversation.X:Lcom/whatsapp/ConversationTextEntry;
        //  1396: invokestatic    com/whatsapp/alm.a:(Landroid/widget/TextView;)V
        //  1399: aload_0        
        //  1400: getfield        com/whatsapp/Conversation.X:Lcom/whatsapp/ConversationTextEntry;
        //  1403: new             Lcom/whatsapp/asd;
        //  1406: dup            
        //  1407: aload_0        
        //  1408: invokespecial   com/whatsapp/asd.<init>:(Lcom/whatsapp/Conversation;)V
        //  1411: invokevirtual   com/whatsapp/ConversationTextEntry.setOnKeyListener:(Landroid/view/View$OnKeyListener;)V
        //  1414: aload_0        
        //  1415: getfield        com/whatsapp/Conversation.a6:Landroid/widget/ImageButton;
        //  1418: new             Lcom/whatsapp/gg;
        //  1421: dup            
        //  1422: aload_0        
        //  1423: invokespecial   com/whatsapp/gg.<init>:(Lcom/whatsapp/Conversation;)V
        //  1426: invokevirtual   android/widget/ImageButton.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //  1429: aload_0        
        //  1430: getfield        com/whatsapp/Conversation.X:Lcom/whatsapp/ConversationTextEntry;
        //  1433: invokevirtual   com/whatsapp/ConversationTextEntry.getText:()Landroid/text/Editable;
        //  1436: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //  1439: astore          25
        //  1441: aload_0        
        //  1442: getfield        com/whatsapp/Conversation.a6:Landroid/widget/ImageButton;
        //  1445: astore          27
        //  1447: aload           25
        //  1449: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //  1452: invokevirtual   java/lang/String.length:()I
        //  1455: istore          28
        //  1457: iload           28
        //  1459: ifle            2107
        //  1462: iconst_1       
        //  1463: istore          29
        //  1465: aload           27
        //  1467: iload           29
        //  1469: invokevirtual   android/widget/ImageButton.setEnabled:(Z)V
        //  1472: aload_0        
        //  1473: getfield        com/whatsapp/Conversation.a2:Landroid/widget/ImageButton;
        //  1476: new             Lcom/whatsapp/zo;
        //  1479: dup            
        //  1480: aload_0        
        //  1481: invokespecial   com/whatsapp/zo.<init>:(Lcom/whatsapp/Conversation;)V
        //  1484: invokevirtual   android/widget/ImageButton.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //  1487: aload_0        
        //  1488: new             Lcom/whatsapp/l1;
        //  1491: dup            
        //  1492: aload_0        
        //  1493: invokespecial   com/whatsapp/l1.<init>:(Landroid/app/Activity;)V
        //  1496: putfield        com/whatsapp/Conversation.Z:Lcom/whatsapp/l1;
        //  1499: aload_0        
        //  1500: getfield        com/whatsapp/Conversation.Z:Lcom/whatsapp/l1;
        //  1503: aload_0        
        //  1504: getfield        com/whatsapp/Conversation.aV:Lcom/whatsapp/eu;
        //  1507: invokevirtual   com/whatsapp/l1.a:(Lcom/whatsapp/eu;)V
        //  1510: aload_0        
        //  1511: getfield        com/whatsapp/Conversation.Z:Lcom/whatsapp/l1;
        //  1514: new             Lcom/whatsapp/aof;
        //  1517: dup            
        //  1518: aload_0        
        //  1519: invokespecial   com/whatsapp/aof.<init>:(Lcom/whatsapp/Conversation;)V
        //  1522: invokevirtual   com/whatsapp/l1.setOnDismissListener:(Landroid/widget/PopupWindow$OnDismissListener;)V
        //  1525: aload_0        
        //  1526: new             Lcom/whatsapp/gw;
        //  1529: dup            
        //  1530: aload_0        
        //  1531: invokespecial   com/whatsapp/gw.<init>:(Landroid/app/Activity;)V
        //  1534: putfield        com/whatsapp/Conversation.ae:Lcom/whatsapp/gw;
        //  1537: aload_0        
        //  1538: getfield        com/whatsapp/Conversation.ae:Lcom/whatsapp/gw;
        //  1541: invokevirtual   com/whatsapp/gw.getContentView:()Landroid/view/View;
        //  1544: ldc_w           2131755264
        //  1547: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //  1550: new             Lcom/whatsapp/cc;
        //  1553: dup            
        //  1554: aload_0        
        //  1555: invokespecial   com/whatsapp/cc.<init>:(Lcom/whatsapp/Conversation;)V
        //  1558: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //  1561: aload_0        
        //  1562: getfield        com/whatsapp/Conversation.ae:Lcom/whatsapp/gw;
        //  1565: invokevirtual   com/whatsapp/gw.getContentView:()Landroid/view/View;
        //  1568: ldc_w           2131755264
        //  1571: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //  1574: new             Lcom/whatsapp/a_u;
        //  1577: dup            
        //  1578: aload_0        
        //  1579: invokespecial   com/whatsapp/a_u.<init>:(Lcom/whatsapp/Conversation;)V
        //  1582: invokevirtual   android/view/View.setOnLongClickListener:(Landroid/view/View$OnLongClickListener;)V
        //  1585: aload_0        
        //  1586: getfield        com/whatsapp/Conversation.ae:Lcom/whatsapp/gw;
        //  1589: invokevirtual   com/whatsapp/gw.getContentView:()Landroid/view/View;
        //  1592: ldc_w           2131755266
        //  1595: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //  1598: new             Lcom/whatsapp/n_;
        //  1601: dup            
        //  1602: aload_0        
        //  1603: invokespecial   com/whatsapp/n_.<init>:(Lcom/whatsapp/Conversation;)V
        //  1606: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //  1609: aload_0        
        //  1610: getfield        com/whatsapp/Conversation.ae:Lcom/whatsapp/gw;
        //  1613: invokevirtual   com/whatsapp/gw.getContentView:()Landroid/view/View;
        //  1616: ldc_w           2131755268
        //  1619: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //  1622: new             Lcom/whatsapp/jb;
        //  1625: dup            
        //  1626: aload_0        
        //  1627: invokespecial   com/whatsapp/jb.<init>:(Lcom/whatsapp/Conversation;)V
        //  1630: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //  1633: aload_0        
        //  1634: getfield        com/whatsapp/Conversation.ae:Lcom/whatsapp/gw;
        //  1637: invokevirtual   com/whatsapp/gw.getContentView:()Landroid/view/View;
        //  1640: ldc_w           2131755270
        //  1643: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //  1646: new             Lcom/whatsapp/dj;
        //  1649: dup            
        //  1650: aload_0        
        //  1651: invokespecial   com/whatsapp/dj.<init>:(Lcom/whatsapp/Conversation;)V
        //  1654: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //  1657: aload_0        
        //  1658: getfield        com/whatsapp/Conversation.ae:Lcom/whatsapp/gw;
        //  1661: invokevirtual   com/whatsapp/gw.getContentView:()Landroid/view/View;
        //  1664: ldc_w           2131755272
        //  1667: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //  1670: new             Lcom/whatsapp/dx;
        //  1673: dup            
        //  1674: aload_0        
        //  1675: invokespecial   com/whatsapp/dx.<init>:(Lcom/whatsapp/Conversation;)V
        //  1678: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //  1681: aload_0        
        //  1682: getfield        com/whatsapp/Conversation.ae:Lcom/whatsapp/gw;
        //  1685: invokevirtual   com/whatsapp/gw.getContentView:()Landroid/view/View;
        //  1688: ldc_w           2131755274
        //  1691: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //  1694: new             Lcom/whatsapp/mj;
        //  1697: dup            
        //  1698: aload_0        
        //  1699: invokespecial   com/whatsapp/mj.<init>:(Lcom/whatsapp/Conversation;)V
        //  1702: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //  1705: aload_0        
        //  1706: getfield        com/whatsapp/Conversation.a5:Lcom/whatsapp/vc;
        //  1709: aload_0        
        //  1710: getfield        com/whatsapp/Conversation.X:Lcom/whatsapp/ConversationTextEntry;
        //  1713: invokevirtual   com/whatsapp/vc.a:(Landroid/widget/EditText;)V
        //  1716: aload_0        
        //  1717: aload_0        
        //  1718: ldc_w           2131755425
        //  1721: invokevirtual   com/whatsapp/Conversation.findViewById:(I)Landroid/view/View;
        //  1724: putfield        com/whatsapp/Conversation.aP:Landroid/view/View;
        //  1727: aload_0        
        //  1728: getfield        com/whatsapp/Conversation.aP:Landroid/view/View;
        //  1731: ifnull          1758
        //  1734: aload_0        
        //  1735: getfield        com/whatsapp/Conversation.aP:Landroid/view/View;
        //  1738: bipush          8
        //  1740: invokevirtual   android/view/View.setVisibility:(I)V
        //  1743: aload_0        
        //  1744: getfield        com/whatsapp/Conversation.aP:Landroid/view/View;
        //  1747: new             Lcom/whatsapp/a_y;
        //  1750: dup            
        //  1751: aload_0        
        //  1752: invokespecial   com/whatsapp/a_y.<init>:(Lcom/whatsapp/Conversation;)V
        //  1755: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //  1758: aload_0        
        //  1759: aload_0        
        //  1760: ldc_w           2131755424
        //  1763: invokevirtual   com/whatsapp/Conversation.findViewById:(I)Landroid/view/View;
        //  1766: putfield        com/whatsapp/Conversation.ar:Landroid/view/View;
        //  1769: aload_0        
        //  1770: getfield        com/whatsapp/Conversation.ar:Landroid/view/View;
        //  1773: ifnull          1800
        //  1776: aload_0        
        //  1777: getfield        com/whatsapp/Conversation.ar:Landroid/view/View;
        //  1780: bipush          8
        //  1782: invokevirtual   android/view/View.setVisibility:(I)V
        //  1785: aload_0        
        //  1786: getfield        com/whatsapp/Conversation.ar:Landroid/view/View;
        //  1789: new             Lcom/whatsapp/fv;
        //  1792: dup            
        //  1793: aload_0        
        //  1794: invokespecial   com/whatsapp/fv.<init>:(Lcom/whatsapp/Conversation;)V
        //  1797: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //  1800: aload_0        
        //  1801: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //  1804: invokestatic    com/whatsapp/util/b.a:(Ljava/lang/String;)V
        //  1807: aload_0        
        //  1808: invokestatic    com/whatsapp/App.b:(Lcom/whatsapp/aws;)V
        //  1811: aload_0        
        //  1812: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/aa0;)V
        //  1815: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  1818: invokevirtual   com/whatsapp/App.D:()Z
        //  1821: istore          37
        //  1823: iload           37
        //  1825: ifeq            1847
        //  1828: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1831: sipush          173
        //  1834: aaload         
        //  1835: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1838: aload_0        
        //  1839: invokevirtual   com/whatsapp/Conversation.a:()Z
        //  1842: pop            
        //  1843: iload_2        
        //  1844: ifeq            1898
        //  1847: invokestatic    com/whatsapp/App.w:()Z
        //  1850: istore          38
        //  1852: iload           38
        //  1854: ifeq            1876
        //  1857: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1860: sipush          170
        //  1863: aaload         
        //  1864: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1867: aload_0        
        //  1868: invokevirtual   com/whatsapp/Conversation.d:()Z
        //  1871: pop            
        //  1872: iload_2        
        //  1873: ifeq            1898
        //  1876: invokestatic    com/whatsapp/App.v:()Z
        //  1879: ifeq            1898
        //  1882: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1885: sipush          174
        //  1888: aaload         
        //  1889: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1892: aload_0        
        //  1893: bipush          115
        //  1895: invokevirtual   com/whatsapp/Conversation.showDialog:(I)V
        //  1898: aload_1        
        //  1899: ifnull          2000
        //  1902: aload_1        
        //  1903: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1906: sipush          187
        //  1909: aaload         
        //  1910: invokevirtual   android/os/Bundle.getParcelableArrayList:(Ljava/lang/String;)Ljava/util/ArrayList;
        //  1913: astore          44
        //  1915: aload           44
        //  1917: ifnull          2000
        //  1920: aload_0        
        //  1921: new             Ljava/util/HashMap;
        //  1924: dup            
        //  1925: invokespecial   java/util/HashMap.<init>:()V
        //  1928: putfield        com/whatsapp/Conversation.aw:Ljava/util/HashMap;
        //  1931: aload           44
        //  1933: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  1936: astore          45
        //  1938: aload           45
        //  1940: invokeinterface java/util/Iterator.hasNext:()Z
        //  1945: ifeq            1991
        //  1948: aload           45
        //  1950: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1955: checkcast       Landroid/os/Parcelable;
        //  1958: checkcast       Lcom/whatsapp/d6;
        //  1961: astore          47
        //  1963: aload_0        
        //  1964: getfield        com/whatsapp/Conversation.aw:Ljava/util/HashMap;
        //  1967: aload           47
        //  1969: getfield        com/whatsapp/d6.a:Lcom/whatsapp/protocol/c6;
        //  1972: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //  1975: aload           47
        //  1977: getfield        com/whatsapp/d6.a:Lcom/whatsapp/protocol/c6;
        //  1980: invokevirtual   com/whatsapp/vy.a:(Lcom/whatsapp/protocol/c6;)Lcom/whatsapp/protocol/bi;
        //  1983: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1986: pop            
        //  1987: iload_2        
        //  1988: ifeq            1938
        //  1991: aload_0        
        //  1992: invokevirtual   com/whatsapp/Conversation.i:()Z
        //  1995: pop            
        //  1996: aload_0        
        //  1997: invokevirtual   com/whatsapp/Conversation.F:()V
        //  2000: aload_3        
        //  2001: invokevirtual   com/whatsapp/util/b0.c:()J
        //  2004: pop2           
        //  2005: new             Lcom/whatsapp/mu;
        //  2008: dup            
        //  2009: aload_0        
        //  2010: invokespecial   com/whatsapp/mu.<init>:(Lcom/whatsapp/Conversation;)V
        //  2013: invokestatic    com/whatsapp/util/bm.a:(Ljava/lang/Runnable;)V
        //  2016: getstatic       android/os/Build$VERSION.SDK_INT:I
        //  2019: bipush          21
        //  2021: if_icmpne       166
        //  2024: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  2027: sipush          166
        //  2030: aaload         
        //  2031: getstatic       android/os/Build.MANUFACTURER:Ljava/lang/String;
        //  2034: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //  2037: istore          42
        //  2039: iload           42
        //  2041: ifeq            166
        //  2044: aload_0        
        //  2045: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  2048: sipush          181
        //  2051: aaload         
        //  2052: invokevirtual   com/whatsapp/Conversation.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //  2055: checkcast       Landroid/app/KeyguardManager;
        //  2058: invokevirtual   android/app/KeyguardManager.isKeyguardLocked:()Z
        //  2061: ifeq            166
        //  2064: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  2067: sipush          178
        //  2070: aaload         
        //  2071: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  2074: aload_0        
        //  2075: new             Lcom/whatsapp/Conversation$60;
        //  2078: dup            
        //  2079: aload_0        
        //  2080: invokespecial   com/whatsapp/Conversation$60.<init>:(Lcom/whatsapp/Conversation;)V
        //  2083: new             Landroid/content/IntentFilter;
        //  2086: dup            
        //  2087: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  2090: sipush          176
        //  2093: aaload         
        //  2094: invokespecial   android/content/IntentFilter.<init>:(Ljava/lang/String;)V
        //  2097: invokevirtual   com/whatsapp/Conversation.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
        //  2100: pop            
        //  2101: return         
        //  2102: astore          26
        //  2104: aload           26
        //  2106: athrow         
        //  2107: iconst_0       
        //  2108: istore          29
        //  2110: goto            1465
        //  2113: astore          30
        //  2115: aload           30
        //  2117: athrow         
        //  2118: astore          31
        //  2120: aload           31
        //  2122: athrow         
        //  2123: astore          32
        //  2125: aload           32
        //  2127: athrow         
        //  2128: astore          33
        //  2130: aload           33
        //  2132: athrow         
        //  2133: astore          34
        //  2135: aload           34
        //  2137: athrow         
        //  2138: astore          35
        //  2140: aload           35
        //  2142: athrow         
        //  2143: astore          36
        //  2145: aload           36
        //  2147: athrow         
        //  2148: astore          39
        //  2150: aload           39
        //  2152: athrow         
        //  2153: aload           51
        //  2155: astore          19
        //  2157: goto            738
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  32     43     167    172    Landroid/content/ActivityNotFoundException;
        //  43     96     172    177    Landroid/content/ActivityNotFoundException;
        //  96     122    177    182    Landroid/content/ActivityNotFoundException;
        //  129    145    188    193    Landroid/content/ActivityNotFoundException;
        //  145    166    193    198    Landroid/content/ActivityNotFoundException;
        //  198    203    269    274    Landroid/content/ActivityNotFoundException;
        //  208    223    274    279    Landroid/content/ActivityNotFoundException;
        //  271    274    274    279    Landroid/content/ActivityNotFoundException;
        //  295    315    512    517    Landroid/content/ActivityNotFoundException;
        //  387    394    517    522    Landroid/content/ActivityNotFoundException;
        //  399    406    522    527    Landroid/content/ActivityNotFoundException;
        //  411    418    527    532    Landroid/content/ActivityNotFoundException;
        //  428    435    532    537    Landroid/content/ActivityNotFoundException;
        //  456    506    507    512    Landroid/content/ActivityNotFoundException;
        //  519    522    522    527    Landroid/content/ActivityNotFoundException;
        //  524    527    527    532    Landroid/content/ActivityNotFoundException;
        //  529    532    532    537    Landroid/content/ActivityNotFoundException;
        //  537    561    1294   1299   Landroid/content/ActivityNotFoundException;
        //  1056   1288   1289   1294   Landroid/content/ActivityNotFoundException;
        //  1441   1457   2102   2107   Landroid/content/ActivityNotFoundException;
        //  1465   1758   2113   2118   Landroid/content/ActivityNotFoundException;
        //  1758   1800   2118   2123   Landroid/content/ActivityNotFoundException;
        //  1800   1823   2123   2128   Landroid/content/ActivityNotFoundException;
        //  1828   1843   2128   2133   Landroid/content/ActivityNotFoundException;
        //  1847   1852   2133   2138   Landroid/content/ActivityNotFoundException;
        //  1857   1872   2138   2143   Landroid/content/ActivityNotFoundException;
        //  1876   1898   2143   2148   Landroid/content/ActivityNotFoundException;
        //  2000   2039   2148   2153   Landroid/content/ActivityNotFoundException;
        //  2125   2128   2128   2133   Landroid/content/ActivityNotFoundException;
        //  2130   2133   2133   2138   Landroid/content/ActivityNotFoundException;
        //  2135   2138   2138   2143   Landroid/content/ActivityNotFoundException;
        //  2140   2143   2143   2148   Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 976, Size: 976
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
    
    public Dialog onCreateDialog(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   com/whatsapp/Conversation.h:()Z
        //     4: ifeq            20
        //     7: aload_0        
        //     8: getfield        com/whatsapp/Conversation.al:Lcom/whatsapp/ps;
        //    11: iload_1        
        //    12: invokevirtual   com/whatsapp/ps.a:(I)V
        //    15: aconst_null    
        //    16: areturn        
        //    17: astore_2       
        //    18: aload_2        
        //    19: athrow         
        //    20: iload_1        
        //    21: lookupswitch {
        //                0: 198
        //                1: 241
        //                2: 355
        //                7: 480
        //                8: 522
        //                9: 564
        //               10: 620
        //               11: 666
        //               12: 737
        //               13: 779
        //               15: 896
        //               16: 312
        //              106: 406
        //              115: 722
        //              116: 397
        //              117: 1040
        //              118: 1055
        //              119: 1024
        //              120: 1009
        //              121: 994
        //          default: 192
        //        }
        //   192: aload_0        
        //   193: iload_1        
        //   194: invokespecial   com/whatsapp/DialogToastListActivity.onCreateDialog:(I)Landroid/app/Dialog;
        //   197: areturn        
        //   198: new             Lcom/whatsapp/a2b;
        //   201: dup            
        //   202: aload_0        
        //   203: invokespecial   com/whatsapp/a2b.<init>:(Lcom/whatsapp/Conversation;)V
        //   206: astore          22
        //   208: new             Landroid/support/v7/app/AlertDialog$Builder;
        //   211: dup            
        //   212: aload_0        
        //   213: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   216: ldc_w           2131231011
        //   219: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   222: ldc_w           2131231435
        //   225: aload           22
        //   227: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   230: ldc_w           2131230874
        //   233: aconst_null    
        //   234: invokevirtual   android/support/v7/app/AlertDialog$Builder.setNegativeButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   237: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   240: areturn        
        //   241: new             Lcom/whatsapp/f0;
        //   244: dup            
        //   245: aload_0        
        //   246: invokespecial   com/whatsapp/f0.<init>:(Lcom/whatsapp/Conversation;)V
        //   249: astore          19
        //   251: new             Landroid/support/v7/app/AlertDialog$Builder;
        //   254: dup            
        //   255: aload_0        
        //   256: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   259: astore          20
        //   261: iconst_1       
        //   262: anewarray       Ljava/lang/Object;
        //   265: astore          21
        //   267: aload           21
        //   269: iconst_0       
        //   270: aload_0        
        //   271: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   274: aload_0        
        //   275: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   278: aastore        
        //   279: aload           20
        //   281: aload_0        
        //   282: ldc_w           2131230840
        //   285: aload           21
        //   287: invokevirtual   com/whatsapp/Conversation.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   290: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(Ljava/lang/CharSequence;)Landroid/support/v7/app/AlertDialog$Builder;
        //   293: ldc_w           2131231435
        //   296: aload           19
        //   298: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   301: ldc_w           2131230874
        //   304: aconst_null    
        //   305: invokevirtual   android/support/v7/app/AlertDialog$Builder.setNegativeButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   308: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   311: areturn        
        //   312: new             Lcom/whatsapp/m1;
        //   315: dup            
        //   316: aload_0        
        //   317: invokespecial   com/whatsapp/m1.<init>:(Lcom/whatsapp/Conversation;)V
        //   320: astore          18
        //   322: new             Landroid/support/v7/app/AlertDialog$Builder;
        //   325: dup            
        //   326: aload_0        
        //   327: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   330: ldc_w           2131231606
        //   333: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   336: ldc_w           2131231435
        //   339: aload           18
        //   341: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   344: ldc_w           2131230874
        //   347: aconst_null    
        //   348: invokevirtual   android/support/v7/app/AlertDialog$Builder.setNegativeButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   351: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   354: areturn        
        //   355: new             Lcom/whatsapp/ahi;
        //   358: dup            
        //   359: aload_0        
        //   360: invokespecial   com/whatsapp/ahi.<init>:(Lcom/whatsapp/Conversation;)V
        //   363: astore          17
        //   365: new             Landroid/support/v7/app/AlertDialog$Builder;
        //   368: dup            
        //   369: aload_0        
        //   370: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   373: ldc_w           2131231153
        //   376: invokevirtual   android/support/v7/app/AlertDialog$Builder.setTitle:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   379: ldc_w           2131231152
        //   382: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   385: ldc_w           2131231435
        //   388: aload           17
        //   390: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   393: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   396: areturn        
        //   397: aload_0        
        //   398: aload_0        
        //   399: getfield        com/whatsapp/Conversation.N:Ljava/lang/String;
        //   402: invokestatic    com/whatsapp/yt.a:(Landroid/app/Activity;Ljava/lang/String;)Landroid/app/Dialog;
        //   405: areturn        
        //   406: new             Landroid/support/v7/app/AlertDialog$Builder;
        //   409: dup            
        //   410: aload_0        
        //   411: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   414: astore          15
        //   416: iconst_1       
        //   417: anewarray       Ljava/lang/Object;
        //   420: astore          16
        //   422: aload           16
        //   424: iconst_0       
        //   425: aload_0        
        //   426: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   429: aload_0        
        //   430: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   433: aastore        
        //   434: aload           15
        //   436: aload_0        
        //   437: ldc_w           2131230877
        //   440: aload           16
        //   442: invokevirtual   com/whatsapp/Conversation.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   445: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(Ljava/lang/CharSequence;)Landroid/support/v7/app/AlertDialog$Builder;
        //   448: ldc_w           2131231867
        //   451: new             Lcom/whatsapp/arn;
        //   454: dup            
        //   455: aload_0        
        //   456: invokespecial   com/whatsapp/arn.<init>:(Lcom/whatsapp/Conversation;)V
        //   459: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   462: ldc_w           2131230874
        //   465: new             Lcom/whatsapp/wj;
        //   468: dup            
        //   469: aload_0        
        //   470: invokespecial   com/whatsapp/wj.<init>:(Lcom/whatsapp/Conversation;)V
        //   473: invokevirtual   android/support/v7/app/AlertDialog$Builder.setNegativeButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   476: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   479: areturn        
        //   480: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   483: sipush          242
        //   486: aaload         
        //   487: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   490: new             Landroid/support/v7/app/AlertDialog$Builder;
        //   493: dup            
        //   494: aload_0        
        //   495: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   498: ldc_w           2131231082
        //   501: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   504: ldc_w           2131231435
        //   507: new             Lcom/whatsapp/zq;
        //   510: dup            
        //   511: aload_0        
        //   512: invokespecial   com/whatsapp/zq.<init>:(Lcom/whatsapp/Conversation;)V
        //   515: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   518: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   521: areturn        
        //   522: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   525: sipush          239
        //   528: aaload         
        //   529: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   532: new             Landroid/support/v7/app/AlertDialog$Builder;
        //   535: dup            
        //   536: aload_0        
        //   537: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   540: ldc_w           2131231071
        //   543: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   546: ldc_w           2131231435
        //   549: new             Lcom/whatsapp/a_s;
        //   552: dup            
        //   553: aload_0        
        //   554: invokespecial   com/whatsapp/a_s.<init>:(Lcom/whatsapp/Conversation;)V
        //   557: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   560: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   563: areturn        
        //   564: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   567: sipush          234
        //   570: aaload         
        //   571: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   574: new             Landroid/support/v7/app/AlertDialog$Builder;
        //   577: dup            
        //   578: aload_0        
        //   579: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   582: ldc_w           2131230858
        //   585: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   588: ldc_w           2131230856
        //   591: new             Lcom/whatsapp/a2l;
        //   594: dup            
        //   595: aload_0        
        //   596: invokespecial   com/whatsapp/a2l.<init>:(Lcom/whatsapp/Conversation;)V
        //   599: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   602: ldc_w           2131230874
        //   605: new             Lcom/whatsapp/qk;
        //   608: dup            
        //   609: aload_0        
        //   610: invokespecial   com/whatsapp/qk.<init>:(Lcom/whatsapp/Conversation;)V
        //   613: invokevirtual   android/support/v7/app/AlertDialog$Builder.setNegativeButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   616: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   619: areturn        
        //   620: new             Landroid/support/v7/app/AlertDialog$Builder;
        //   623: dup            
        //   624: aload_0        
        //   625: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   628: ldc_w           2131231049
        //   631: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   634: ldc_w           2131230831
        //   637: new             Lcom/whatsapp/mq;
        //   640: dup            
        //   641: aload_0        
        //   642: invokespecial   com/whatsapp/mq.<init>:(Lcom/whatsapp/Conversation;)V
        //   645: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   648: ldc_w           2131231976
        //   651: new             Lcom/whatsapp/a_2;
        //   654: dup            
        //   655: aload_0        
        //   656: invokespecial   com/whatsapp/a_2.<init>:(Lcom/whatsapp/Conversation;)V
        //   659: invokevirtual   android/support/v7/app/AlertDialog$Builder.setNeutralButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   662: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   665: areturn        
        //   666: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   669: sipush          240
        //   672: aaload         
        //   673: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   676: new             Landroid/support/v7/app/AlertDialog$Builder;
        //   679: dup            
        //   680: aload_0        
        //   681: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   684: ldc_w           2131230791
        //   687: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   690: ldc_w           2131231406
        //   693: new             Lcom/whatsapp/nz;
        //   696: dup            
        //   697: aload_0        
        //   698: invokespecial   com/whatsapp/nz.<init>:(Lcom/whatsapp/Conversation;)V
        //   701: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   704: ldc_w           2131231101
        //   707: new             Lcom/whatsapp/d0;
        //   710: dup            
        //   711: aload_0        
        //   712: invokespecial   com/whatsapp/d0.<init>:(Lcom/whatsapp/Conversation;)V
        //   715: invokevirtual   android/support/v7/app/AlertDialog$Builder.setNeutralButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   718: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   721: areturn        
        //   722: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   725: sipush          231
        //   728: aaload         
        //   729: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   732: aload_0        
        //   733: invokestatic    com/whatsapp/ade.a:(Landroid/app/Activity;)Landroid/app/Dialog;
        //   736: areturn        
        //   737: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   740: sipush          232
        //   743: aaload         
        //   744: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   747: new             Landroid/support/v7/app/AlertDialog$Builder;
        //   750: dup            
        //   751: aload_0        
        //   752: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   755: ldc_w           2131230786
        //   758: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   761: ldc_w           2131231435
        //   764: new             Lcom/whatsapp/yu;
        //   767: dup            
        //   768: aload_0        
        //   769: invokespecial   com/whatsapp/yu.<init>:(Lcom/whatsapp/Conversation;)V
        //   772: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   775: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   778: areturn        
        //   779: aload_0        
        //   780: getfield        com/whatsapp/Conversation.aw:Ljava/util/HashMap;
        //   783: astore          13
        //   785: aload           13
        //   787: ifnull          800
        //   790: aload_0        
        //   791: getfield        com/whatsapp/Conversation.aw:Ljava/util/HashMap;
        //   794: invokevirtual   java/util/HashMap.isEmpty:()Z
        //   797: ifeq            826
        //   800: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   803: sipush          238
        //   806: aaload         
        //   807: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   810: aload_0        
        //   811: iload_1        
        //   812: invokespecial   com/whatsapp/DialogToastListActivity.onCreateDialog:(I)Landroid/app/Dialog;
        //   815: areturn        
        //   816: astore          11
        //   818: aload           11
        //   820: athrow         
        //   821: astore          12
        //   823: aload           12
        //   825: athrow         
        //   826: new             Ljava/lang/StringBuilder;
        //   829: dup            
        //   830: invokespecial   java/lang/StringBuilder.<init>:()V
        //   833: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   836: sipush          236
        //   839: aaload         
        //   840: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   843: aload_0        
        //   844: getfield        com/whatsapp/Conversation.aw:Ljava/util/HashMap;
        //   847: invokevirtual   java/util/HashMap.size:()I
        //   850: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   853: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   856: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   859: aload_0        
        //   860: getfield        com/whatsapp/Conversation.aw:Ljava/util/HashMap;
        //   863: astore          14
        //   865: aload_0        
        //   866: aload_0        
        //   867: getfield        com/whatsapp/Conversation.aw:Ljava/util/HashMap;
        //   870: invokevirtual   java/util/HashMap.values:()Ljava/util/Collection;
        //   873: aload_0        
        //   874: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   877: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   880: bipush          13
        //   882: new             Lcom/whatsapp/awl;
        //   885: dup            
        //   886: aload_0        
        //   887: aload           14
        //   889: invokespecial   com/whatsapp/awl.<init>:(Lcom/whatsapp/Conversation;Ljava/util/HashMap;)V
        //   892: invokestatic    com/whatsapp/alh.a:(Landroid/app/Activity;Ljava/util/Collection;Ljava/lang/String;ILcom/whatsapp/yk;)Landroid/app/Dialog;
        //   895: areturn        
        //   896: new             Landroid/support/v7/app/AlertDialog$Builder;
        //   899: dup            
        //   900: aload_0        
        //   901: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   904: astore_3       
        //   905: invokestatic    com/whatsapp/App.aw:()Z
        //   908: istore          5
        //   910: iload           5
        //   912: ifeq            973
        //   915: ldc_w           2131231521
        //   918: istore          6
        //   920: aload_3        
        //   921: iload           6
        //   923: invokevirtual   android/support/v7/app/AlertDialog$Builder.setTitle:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   926: astore          8
        //   928: invokestatic    com/whatsapp/App.aw:()Z
        //   931: istore          9
        //   933: iload           9
        //   935: ifeq            986
        //   938: ldc_w           2131231519
        //   941: istore          10
        //   943: aload           8
        //   945: iload           10
        //   947: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   950: ldc_w           2131231435
        //   953: new             Lcom/whatsapp/asw;
        //   956: dup            
        //   957: aload_0        
        //   958: invokespecial   com/whatsapp/asw.<init>:(Lcom/whatsapp/Conversation;)V
        //   961: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   964: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   967: areturn        
        //   968: astore          4
        //   970: aload           4
        //   972: athrow         
        //   973: ldc_w           2131231522
        //   976: istore          6
        //   978: goto            920
        //   981: astore          7
        //   983: aload           7
        //   985: athrow         
        //   986: ldc_w           2131231520
        //   989: istore          10
        //   991: goto            943
        //   994: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   997: sipush          237
        //  1000: aaload         
        //  1001: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1004: aload_0        
        //  1005: invokestatic    com/whatsapp/yt.e:(Landroid/app/Activity;)Landroid/app/Dialog;
        //  1008: areturn        
        //  1009: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1012: sipush          241
        //  1015: aaload         
        //  1016: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1019: aload_0        
        //  1020: invokestatic    com/whatsapp/yt.a:(Landroid/app/Activity;)Landroid/app/Dialog;
        //  1023: areturn        
        //  1024: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1027: sipush          233
        //  1030: aaload         
        //  1031: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1034: aload_0        
        //  1035: iconst_0       
        //  1036: invokestatic    com/whatsapp/yt.b:(Landroid/app/Activity;Z)Landroid/app/Dialog;
        //  1039: areturn        
        //  1040: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1043: sipush          230
        //  1046: aaload         
        //  1047: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1050: aload_0        
        //  1051: invokestatic    com/whatsapp/yt.d:(Landroid/app/Activity;)Landroid/app/Dialog;
        //  1054: areturn        
        //  1055: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1058: sipush          235
        //  1061: aaload         
        //  1062: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1065: aload_0        
        //  1066: invokestatic    com/whatsapp/yt.c:(Landroid/app/Activity;)Landroid/app/Dialog;
        //  1069: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      15     17     20     Landroid/content/ActivityNotFoundException;
        //  779    785    816    821    Landroid/content/ActivityNotFoundException;
        //  790    800    821    826    Landroid/content/ActivityNotFoundException;
        //  800    816    821    826    Landroid/content/ActivityNotFoundException;
        //  818    821    821    826    Landroid/content/ActivityNotFoundException;
        //  896    910    968    973    Landroid/content/ActivityNotFoundException;
        //  920    933    981    986    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0800:
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
    
    @Override
    public boolean onCreateOptionsMenu(final Menu p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //     7: sipush          243
        //    10: aaload         
        //    11: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    14: aload_0        
        //    15: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //    18: astore          7
        //    20: aload           7
        //    22: ifnull          523
        //    25: aload_0        
        //    26: getfield        com/whatsapp/Conversation.aG:Z
        //    29: istore          8
        //    31: iload           8
        //    33: ifeq            195
        //    36: aload_0        
        //    37: aload_0        
        //    38: aload_1        
        //    39: bipush          15
        //    41: ldc_w           2131230827
        //    44: ldc_w           2130838711
        //    47: invokespecial   com/whatsapp/Conversation.a:(Landroid/view/Menu;III)Landroid/view/MenuItem;
        //    50: putfield        com/whatsapp/Conversation.a0:Landroid/view/MenuItem;
        //    53: aload_0        
        //    54: aload_1        
        //    55: bipush          9
        //    57: ldc_w           2131231204
        //    60: invokespecial   com/whatsapp/Conversation.a:(Landroid/view/Menu;II)Landroid/view/MenuItem;
        //    63: pop            
        //    64: aload_0        
        //    65: aload_1        
        //    66: bipush          12
        //    68: ldc_w           2131231913
        //    71: invokespecial   com/whatsapp/Conversation.a:(Landroid/view/Menu;II)Landroid/view/MenuItem;
        //    74: pop            
        //    75: aload_0        
        //    76: aload_1        
        //    77: bipush          14
        //    79: ldc_w           2131231614
        //    82: invokespecial   com/whatsapp/Conversation.a:(Landroid/view/Menu;II)Landroid/view/MenuItem;
        //    85: pop            
        //    86: aload_0        
        //    87: aload_0        
        //    88: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //    91: invokestatic    com/whatsapp/notification/y.d:(Landroid/content/Context;Ljava/lang/String;)Z
        //    94: istore          37
        //    96: iload           37
        //    98: ifne            116
        //   101: aload_0        
        //   102: aload_1        
        //   103: bipush          10
        //   105: ldc_w           2131231305
        //   108: invokespecial   com/whatsapp/Conversation.a:(Landroid/view/Menu;II)Landroid/view/MenuItem;
        //   111: pop            
        //   112: iload_2        
        //   113: ifeq            127
        //   116: aload_0        
        //   117: aload_1        
        //   118: bipush          10
        //   120: ldc_w           2131231306
        //   123: invokespecial   com/whatsapp/Conversation.a:(Landroid/view/Menu;II)Landroid/view/MenuItem;
        //   126: pop            
        //   127: aload_0        
        //   128: aload_1        
        //   129: bipush          11
        //   131: ldc_w           2131231952
        //   134: invokespecial   com/whatsapp/Conversation.a:(Landroid/view/Menu;II)Landroid/view/MenuItem;
        //   137: pop            
        //   138: aload_0        
        //   139: aload_1        
        //   140: iconst_3       
        //   141: ldc_w           2131231338
        //   144: invokespecial   com/whatsapp/Conversation.b:(Landroid/view/Menu;II)Landroid/view/SubMenu;
        //   147: astore          40
        //   149: aload_0        
        //   150: aload           40
        //   152: bipush          7
        //   154: ldc_w           2131231010
        //   157: invokespecial   com/whatsapp/Conversation.a:(Landroid/view/Menu;II)Landroid/view/MenuItem;
        //   160: pop            
        //   161: aload_0        
        //   162: aload           40
        //   164: bipush          8
        //   166: ldc_w           2131231047
        //   169: invokespecial   com/whatsapp/Conversation.a:(Landroid/view/Menu;II)Landroid/view/MenuItem;
        //   172: pop            
        //   173: invokestatic    com/whatsapp/App.q:()Z
        //   176: ifne            191
        //   179: aload_0        
        //   180: aload           40
        //   182: bipush          6
        //   184: ldc_w           2131230798
        //   187: invokespecial   com/whatsapp/Conversation.a:(Landroid/view/Menu;II)Landroid/view/MenuItem;
        //   190: pop            
        //   191: iload_2        
        //   192: ifeq            480
        //   195: aload_0        
        //   196: getfield        com/whatsapp/Conversation.S:Z
        //   199: istore          10
        //   201: iload           10
        //   203: ifeq            324
        //   206: aload_0        
        //   207: aload_0        
        //   208: aload_1        
        //   209: bipush          15
        //   211: ldc_w           2131230827
        //   214: ldc_w           2130838711
        //   217: invokespecial   com/whatsapp/Conversation.a:(Landroid/view/Menu;III)Landroid/view/MenuItem;
        //   220: putfield        com/whatsapp/Conversation.a0:Landroid/view/MenuItem;
        //   223: aload_0        
        //   224: aload_1        
        //   225: bipush          9
        //   227: ldc_w           2131231270
        //   230: invokespecial   com/whatsapp/Conversation.a:(Landroid/view/Menu;II)Landroid/view/MenuItem;
        //   233: pop            
        //   234: aload_0        
        //   235: aload_1        
        //   236: bipush          12
        //   238: ldc_w           2131231915
        //   241: invokespecial   com/whatsapp/Conversation.a:(Landroid/view/Menu;II)Landroid/view/MenuItem;
        //   244: pop            
        //   245: aload_0        
        //   246: aload_1        
        //   247: bipush          14
        //   249: ldc_w           2131231614
        //   252: invokespecial   com/whatsapp/Conversation.a:(Landroid/view/Menu;II)Landroid/view/MenuItem;
        //   255: pop            
        //   256: aload_0        
        //   257: aload_1        
        //   258: bipush          11
        //   260: ldc_w           2131231952
        //   263: invokespecial   com/whatsapp/Conversation.a:(Landroid/view/Menu;II)Landroid/view/MenuItem;
        //   266: pop            
        //   267: aload_0        
        //   268: aload_1        
        //   269: iconst_3       
        //   270: ldc_w           2131231338
        //   273: invokespecial   com/whatsapp/Conversation.b:(Landroid/view/Menu;II)Landroid/view/SubMenu;
        //   276: astore          29
        //   278: aload_0        
        //   279: aload           29
        //   281: bipush          7
        //   283: ldc_w           2131231010
        //   286: invokespecial   com/whatsapp/Conversation.a:(Landroid/view/Menu;II)Landroid/view/MenuItem;
        //   289: pop            
        //   290: aload_0        
        //   291: aload           29
        //   293: bipush          8
        //   295: ldc_w           2131231047
        //   298: invokespecial   com/whatsapp/Conversation.a:(Landroid/view/Menu;II)Landroid/view/MenuItem;
        //   301: pop            
        //   302: invokestatic    com/whatsapp/App.q:()Z
        //   305: ifne            320
        //   308: aload_0        
        //   309: aload           29
        //   311: bipush          6
        //   313: ldc_w           2131230798
        //   316: invokespecial   com/whatsapp/Conversation.a:(Landroid/view/Menu;II)Landroid/view/MenuItem;
        //   319: pop            
        //   320: iload_2        
        //   321: ifeq            480
        //   324: aload_0        
        //   325: aload_0        
        //   326: aload_1        
        //   327: bipush          16
        //   329: ldc_w           2131230856
        //   332: ldc_w           2130838712
        //   335: invokespecial   com/whatsapp/Conversation.a:(Landroid/view/Menu;III)Landroid/view/MenuItem;
        //   338: putfield        com/whatsapp/Conversation.K:Landroid/view/MenuItem;
        //   341: aload_0        
        //   342: getfield        com/whatsapp/Conversation.K:Landroid/view/MenuItem;
        //   345: iconst_2       
        //   346: invokestatic    android/support/v4/view/MenuItemCompat.setShowAsAction:(Landroid/view/MenuItem;I)V
        //   349: aload_0        
        //   350: aload_0        
        //   351: aload_1        
        //   352: bipush          15
        //   354: ldc_w           2131230827
        //   357: ldc_w           2130838711
        //   360: invokespecial   com/whatsapp/Conversation.a:(Landroid/view/Menu;III)Landroid/view/MenuItem;
        //   363: putfield        com/whatsapp/Conversation.a0:Landroid/view/MenuItem;
        //   366: aload_0        
        //   367: aload_1        
        //   368: iconst_1       
        //   369: ldc_w           2131231908
        //   372: invokespecial   com/whatsapp/Conversation.a:(Landroid/view/Menu;II)Landroid/view/MenuItem;
        //   375: pop            
        //   376: aload_0        
        //   377: aload_1        
        //   378: bipush          12
        //   380: ldc_w           2131231912
        //   383: invokespecial   com/whatsapp/Conversation.a:(Landroid/view/Menu;II)Landroid/view/MenuItem;
        //   386: pop            
        //   387: aload_0        
        //   388: aload_1        
        //   389: bipush          14
        //   391: ldc_w           2131231614
        //   394: invokespecial   com/whatsapp/Conversation.a:(Landroid/view/Menu;II)Landroid/view/MenuItem;
        //   397: pop            
        //   398: aload_0        
        //   399: aload_1        
        //   400: bipush          11
        //   402: ldc_w           2131231952
        //   405: invokespecial   com/whatsapp/Conversation.a:(Landroid/view/Menu;II)Landroid/view/MenuItem;
        //   408: pop            
        //   409: aload_0        
        //   410: aload_1        
        //   411: iconst_3       
        //   412: ldc_w           2131231338
        //   415: invokespecial   com/whatsapp/Conversation.b:(Landroid/view/Menu;II)Landroid/view/SubMenu;
        //   418: astore          15
        //   420: aload           15
        //   422: invokeinterface android/view/SubMenu.clearHeader:()V
        //   427: aload_0        
        //   428: aload           15
        //   430: iconst_4       
        //   431: ldc_w           2131230839
        //   434: invokespecial   com/whatsapp/Conversation.a:(Landroid/view/Menu;II)Landroid/view/MenuItem;
        //   437: pop            
        //   438: aload_0        
        //   439: aload           15
        //   441: bipush          7
        //   443: ldc_w           2131231010
        //   446: invokespecial   com/whatsapp/Conversation.a:(Landroid/view/Menu;II)Landroid/view/MenuItem;
        //   449: pop            
        //   450: aload_0        
        //   451: aload           15
        //   453: bipush          8
        //   455: ldc_w           2131231047
        //   458: invokespecial   com/whatsapp/Conversation.a:(Landroid/view/Menu;II)Landroid/view/MenuItem;
        //   461: pop            
        //   462: invokestatic    com/whatsapp/App.q:()Z
        //   465: ifne            480
        //   468: aload_0        
        //   469: aload           15
        //   471: bipush          6
        //   473: ldc_w           2131230798
        //   476: invokespecial   com/whatsapp/Conversation.a:(Landroid/view/Menu;II)Landroid/view/MenuItem;
        //   479: pop            
        //   480: aload_0        
        //   481: getfield        com/whatsapp/Conversation.a0:Landroid/view/MenuItem;
        //   484: iconst_2       
        //   485: invokestatic    android/support/v4/view/MenuItemCompat.setShowAsAction:(Landroid/view/MenuItem;I)V
        //   488: aload_0        
        //   489: getfield        com/whatsapp/Conversation.aG:Z
        //   492: istore          22
        //   494: iload           22
        //   496: ifeq            523
        //   499: aload_0        
        //   500: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   503: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   506: invokestatic    com/whatsapp/adc.f:(Ljava/lang/String;)Z
        //   509: ifne            523
        //   512: aload_0        
        //   513: getfield        com/whatsapp/Conversation.a0:Landroid/view/MenuItem;
        //   516: iconst_0       
        //   517: invokeinterface android/view/MenuItem.setVisible:(Z)Landroid/view/MenuItem;
        //   522: pop            
        //   523: aload_0        
        //   524: aload_1        
        //   525: invokespecial   com/whatsapp/DialogToastListActivity.onCreateOptionsMenu:(Landroid/view/Menu;)Z
        //   528: ireturn        
        //   529: astore_3       
        //   530: aload_3        
        //   531: athrow         
        //   532: astore          4
        //   534: aload           4
        //   536: athrow         
        //   537: astore          5
        //   539: aload           5
        //   541: athrow         
        //   542: astore          6
        //   544: aload           6
        //   546: athrow         
        //   547: astore          41
        //   549: aload           41
        //   551: athrow         
        //   552: astore          9
        //   554: aload           9
        //   556: athrow         
        //   557: astore          30
        //   559: aload           30
        //   561: athrow         
        //   562: astore          16
        //   564: aload           16
        //   566: athrow         
        //   567: astore          20
        //   569: aload           20
        //   571: athrow         
        //   572: astore          21
        //   574: aload           21
        //   576: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  4      20     529    532    Landroid/content/ActivityNotFoundException;
        //  25     31     532    537    Landroid/content/ActivityNotFoundException;
        //  36     96     537    542    Landroid/content/ActivityNotFoundException;
        //  101    112    542    547    Landroid/content/ActivityNotFoundException;
        //  116    127    542    547    Landroid/content/ActivityNotFoundException;
        //  149    191    547    552    Landroid/content/ActivityNotFoundException;
        //  195    201    552    557    Landroid/content/ActivityNotFoundException;
        //  278    320    557    562    Landroid/content/ActivityNotFoundException;
        //  420    480    562    567    Landroid/content/ActivityNotFoundException;
        //  480    494    567    572    Landroid/content/ActivityNotFoundException;
        //  499    523    572    577    Landroid/content/ActivityNotFoundException;
        //  530    532    532    537    Landroid/content/ActivityNotFoundException;
        //  534    537    537    542    Landroid/content/ActivityNotFoundException;
        //  539    542    542    547    Landroid/content/ActivityNotFoundException;
        //  569    572    572    577    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 293, Size: 293
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
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //     7: sipush          219
        //    10: aaload         
        //    11: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    14: aload_0        
        //    15: invokespecial   com/whatsapp/DialogToastListActivity.onDestroy:()V
        //    18: aload_0        
        //    19: getfield        com/whatsapp/Conversation.al:Lcom/whatsapp/ps;
        //    22: ifnull          33
        //    25: aload_0        
        //    26: getfield        com/whatsapp/Conversation.al:Lcom/whatsapp/ps;
        //    29: iconst_0       
        //    30: invokevirtual   com/whatsapp/ps.b:(Z)V
        //    33: aload_0        
        //    34: getfield        com/whatsapp/Conversation.aJ:Z
        //    37: ifeq            55
        //    40: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //    43: aload_0        
        //    44: getfield        com/whatsapp/Conversation.bi:Lcom/whatsapp/sj;
        //    47: invokevirtual   com/whatsapp/vy.b:(Lcom/whatsapp/sj;)V
        //    50: aload_0        
        //    51: iconst_0       
        //    52: putfield        com/whatsapp/Conversation.aJ:Z
        //    55: iconst_1       
        //    56: putstatic       com/whatsapp/Conversation.a_:Z
        //    59: aload_0        
        //    60: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //    63: astore          6
        //    65: aload           6
        //    67: ifnull          88
        //    70: aload_0        
        //    71: getfield        com/whatsapp/Conversation.aS:Landroid/database/DataSetObserver;
        //    74: ifnull          88
        //    77: aload_0        
        //    78: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //    81: aload_0        
        //    82: getfield        com/whatsapp/Conversation.aS:Landroid/database/DataSetObserver;
        //    85: invokevirtual   com/whatsapp/nm.unregisterDataSetObserver:(Landroid/database/DataSetObserver;)V
        //    88: aload_0        
        //    89: invokestatic    com/whatsapp/Conversation.ah:(Lcom/whatsapp/Conversation;)V
        //    92: aload_0        
        //    93: invokestatic    com/whatsapp/Conversation.A:(Lcom/whatsapp/Conversation;)V
        //    96: aload_0        
        //    97: getfield        com/whatsapp/Conversation.aA:Landroid/database/Cursor;
        //   100: ifnull          112
        //   103: aload_0        
        //   104: getfield        com/whatsapp/Conversation.aA:Landroid/database/Cursor;
        //   107: invokeinterface android/database/Cursor.close:()V
        //   112: aload_0        
        //   113: getfield        com/whatsapp/Conversation.bb:Lcom/whatsapp/aoq;
        //   116: ifnull          128
        //   119: aload_0        
        //   120: getfield        com/whatsapp/Conversation.bb:Lcom/whatsapp/aoq;
        //   123: iconst_1       
        //   124: invokevirtual   com/whatsapp/aoq.cancel:(Z)Z
        //   127: pop            
        //   128: aload_0        
        //   129: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //   132: astore          12
        //   134: aload           12
        //   136: ifnull          167
        //   139: aload_0        
        //   140: getfield        com/whatsapp/Conversation.t:Ljava/lang/String;
        //   143: astore          17
        //   145: aload           17
        //   147: ifnonnull       157
        //   150: aload_0        
        //   151: getfield        com/whatsapp/Conversation.am:Z
        //   154: ifne            167
        //   157: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   160: aload_0        
        //   161: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //   164: invokevirtual   com/whatsapp/vy.t:(Ljava/lang/String;)V
        //   167: aload_0        
        //   168: getfield        com/whatsapp/Conversation.ap:Ljava/util/ArrayList;
        //   171: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   174: astore          13
        //   176: aload           13
        //   178: invokeinterface java/util/Iterator.hasNext:()Z
        //   183: ifeq            215
        //   186: aload           13
        //   188: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   193: checkcast       Landroid/app/Dialog;
        //   196: astore          15
        //   198: aload           15
        //   200: invokevirtual   android/app/Dialog.isShowing:()Z
        //   203: ifeq            211
        //   206: aload           15
        //   208: invokevirtual   android/app/Dialog.dismiss:()V
        //   211: iload_1        
        //   212: ifeq            176
        //   215: aload_0        
        //   216: getfield        com/whatsapp/Conversation.ap:Ljava/util/ArrayList;
        //   219: invokevirtual   java/util/ArrayList.clear:()V
        //   222: aload_0        
        //   223: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/aws;)V
        //   226: aload_0        
        //   227: invokestatic    com/whatsapp/App.b:(Lcom/whatsapp/aa0;)V
        //   230: aload_0        
        //   231: getfield        com/whatsapp/Conversation.bk:Lcom/whatsapp/ahz;
        //   234: ifnull          249
        //   237: aload_0        
        //   238: getfield        com/whatsapp/Conversation.bk:Lcom/whatsapp/ahz;
        //   241: invokevirtual   com/whatsapp/ahz.a:()V
        //   244: aload_0        
        //   245: aconst_null    
        //   246: putfield        com/whatsapp/Conversation.bk:Lcom/whatsapp/ahz;
        //   249: aload_0        
        //   250: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //   253: invokestatic    com/whatsapp/util/b.c:(Ljava/lang/String;)V
        //   256: invokestatic    com/whatsapp/up.h:()V
        //   259: invokestatic    com/whatsapp/App.y:()V
        //   262: return         
        //   263: astore_2       
        //   264: aload_2        
        //   265: athrow         
        //   266: astore_3       
        //   267: aload_3        
        //   268: athrow         
        //   269: astore          4
        //   271: aload           4
        //   273: athrow         
        //   274: astore          5
        //   276: aload           5
        //   278: athrow         
        //   279: astore          7
        //   281: aload           7
        //   283: athrow         
        //   284: astore          8
        //   286: aload           8
        //   288: athrow         
        //   289: astore          9
        //   291: aload           9
        //   293: athrow         
        //   294: astore          10
        //   296: aload           10
        //   298: athrow         
        //   299: astore          11
        //   301: aload           11
        //   303: athrow         
        //   304: astore          16
        //   306: aload           16
        //   308: athrow         
        //   309: astore          14
        //   311: aload           14
        //   313: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  4      33     263    266    Landroid/content/ActivityNotFoundException;
        //  33     55     266    269    Landroid/content/ActivityNotFoundException;
        //  55     65     269    274    Landroid/content/ActivityNotFoundException;
        //  70     88     274    279    Landroid/content/ActivityNotFoundException;
        //  88     112    279    284    Landroid/content/ActivityNotFoundException;
        //  112    128    284    289    Landroid/content/ActivityNotFoundException;
        //  128    134    289    294    Landroid/content/ActivityNotFoundException;
        //  139    145    294    299    Landroid/content/ActivityNotFoundException;
        //  150    157    299    304    Landroid/content/ActivityNotFoundException;
        //  157    167    299    304    Landroid/content/ActivityNotFoundException;
        //  198    211    304    309    Landroid/content/ActivityNotFoundException;
        //  215    249    309    314    Landroid/content/ActivityNotFoundException;
        //  271    274    274    279    Landroid/content/ActivityNotFoundException;
        //  291    294    294    299    Landroid/content/ActivityNotFoundException;
        //  296    299    299    304    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 148, Size: 148
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
    public boolean onKeyDown(final int p0, final KeyEvent p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_2        
        //     1: invokevirtual   android/view/KeyEvent.isPrintingKey:()Z
        //     4: istore          6
        //     6: iload           6
        //     8: ifeq            64
        //    11: aload_0        
        //    12: getfield        com/whatsapp/Conversation.X:Lcom/whatsapp/ConversationTextEntry;
        //    15: invokevirtual   com/whatsapp/ConversationTextEntry.isShown:()Z
        //    18: istore          7
        //    20: iload           7
        //    22: ifeq            64
        //    25: aload_0        
        //    26: getfield        com/whatsapp/Conversation.X:Lcom/whatsapp/ConversationTextEntry;
        //    29: invokevirtual   com/whatsapp/ConversationTextEntry.hasFocus:()Z
        //    32: ifne            64
        //    35: aload_0        
        //    36: getfield        com/whatsapp/Conversation.X:Lcom/whatsapp/ConversationTextEntry;
        //    39: invokevirtual   com/whatsapp/ConversationTextEntry.requestFocus:()Z
        //    42: pop            
        //    43: aload_0        
        //    44: aload_2        
        //    45: invokevirtual   com/whatsapp/Conversation.dispatchKeyEvent:(Landroid/view/KeyEvent;)Z
        //    48: pop            
        //    49: iconst_1       
        //    50: ireturn        
        //    51: astore_3       
        //    52: aload_3        
        //    53: athrow         
        //    54: astore          4
        //    56: aload           4
        //    58: athrow         
        //    59: astore          5
        //    61: aload           5
        //    63: athrow         
        //    64: aload_0        
        //    65: iload_1        
        //    66: aload_2        
        //    67: invokespecial   com/whatsapp/DialogToastListActivity.onKeyDown:(ILandroid/view/KeyEvent;)Z
        //    70: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      6      51     54     Landroid/content/ActivityNotFoundException;
        //  11     20     54     59     Landroid/content/ActivityNotFoundException;
        //  25     49     59     64     Landroid/content/ActivityNotFoundException;
        //  52     54     54     59     Landroid/content/ActivityNotFoundException;
        //  56     59     59     64     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 39, Size: 39
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
    
    public boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        if (n != 82) {
            if (n != 4) {
                return super.onKeyUp(n, keyEvent);
            }
        }
        try {
            if (this.Z.isShowing()) {
                this.Z.a(false);
                this.Z.dismiss();
                return false;
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
        return super.onKeyUp(n, keyEvent);
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_1        
        //     5: invokeinterface android/view/MenuItem.getItemId:()I
        //    10: lookupswitch {
        //                0: 141
        //                1: 191
        //                4: 256
        //                6: 530
        //                7: 327
        //                8: 395
        //                9: 542
        //               10: 622
        //               11: 855
        //               12: 1331
        //               14: 334
        //               15: 341
        //               16: 1376
        //          16908332: 132
        //          default: 1397
        //        }
        //   132: aload_0        
        //   133: invokevirtual   com/whatsapp/Conversation.finish:()V
        //   136: iconst_1       
        //   137: ireturn        
        //   138: astore_3       
        //   139: aload_3        
        //   140: athrow         
        //   141: aload_0        
        //   142: invokespecial   com/whatsapp/Conversation.v:()Z
        //   145: istore          70
        //   147: iload           70
        //   149: ifeq            167
        //   152: aload_0        
        //   153: aload_0        
        //   154: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   157: invokevirtual   com/whatsapp/a_9.f:()Ljava/lang/String;
        //   160: invokespecial   com/whatsapp/Conversation.e:(Ljava/lang/String;)V
        //   163: iload_2        
        //   164: ifeq            1399
        //   167: aload_0        
        //   168: iconst_1       
        //   169: invokespecial   com/whatsapp/Conversation.d:(Z)V
        //   172: aload_0        
        //   173: bipush          9
        //   175: invokevirtual   com/whatsapp/Conversation.showDialog:(I)V
        //   178: goto            1399
        //   181: astore          68
        //   183: aload           68
        //   185: athrow         
        //   186: astore          69
        //   188: aload           69
        //   190: athrow         
        //   191: aload_0        
        //   192: getfield        com/whatsapp/Conversation.aq:Z
        //   195: istore          67
        //   197: iload           67
        //   199: ifeq            217
        //   202: aload_0        
        //   203: iconst_0       
        //   204: putfield        com/whatsapp/Conversation.Y:Z
        //   207: aload_0        
        //   208: bipush          11
        //   210: invokevirtual   com/whatsapp/Conversation.showDialog:(I)V
        //   213: iload_2        
        //   214: ifeq            1401
        //   217: aload_0        
        //   218: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   221: aload_0        
        //   222: aload_0        
        //   223: aload_0        
        //   224: ldc_w           2131755432
        //   227: invokevirtual   com/whatsapp/Conversation.findViewById:(I)Landroid/view/View;
        //   230: aload_0        
        //   231: ldc_w           2131232142
        //   234: invokevirtual   com/whatsapp/Conversation.getString:(I)Ljava/lang/String;
        //   237: invokestatic    android/support/v4/app/ActivityOptionsCompat.makeSceneTransitionAnimation:(Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;)Landroid/support/v4/app/ActivityOptionsCompat;
        //   240: invokestatic    com/whatsapp/ContactInfo.a:(Lcom/whatsapp/a_9;Landroid/app/Activity;Landroid/support/v4/app/ActivityOptionsCompat;)V
        //   243: goto            1401
        //   246: astore          65
        //   248: aload           65
        //   250: athrow         
        //   251: astore          66
        //   253: aload           66
        //   255: athrow         
        //   256: aload_0        
        //   257: getfield        com/whatsapp/Conversation.ay:Z
        //   260: istore          63
        //   262: iload           63
        //   264: ifeq            276
        //   267: aload_0        
        //   268: iconst_1       
        //   269: invokevirtual   com/whatsapp/Conversation.showDialog:(I)V
        //   272: iload_2        
        //   273: ifeq            305
        //   276: invokestatic    com/whatsapp/App.O:()Z
        //   279: istore          64
        //   281: iload           64
        //   283: ifne            301
        //   286: aload_0        
        //   287: invokevirtual   com/whatsapp/Conversation.getBaseContext:()Landroid/content/Context;
        //   290: ldc_w           2131231421
        //   293: iconst_0       
        //   294: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   297: iload_2        
        //   298: ifeq            305
        //   301: aload_0        
        //   302: invokespecial   com/whatsapp/Conversation.E:()V
        //   305: iconst_1       
        //   306: ireturn        
        //   307: astore          59
        //   309: aload           59
        //   311: athrow         
        //   312: astore          60
        //   314: aload           60
        //   316: athrow         
        //   317: astore          61
        //   319: aload           61
        //   321: athrow         
        //   322: astore          62
        //   324: aload           62
        //   326: athrow         
        //   327: aload_0        
        //   328: iconst_0       
        //   329: invokevirtual   com/whatsapp/Conversation.showDialog:(I)V
        //   332: iconst_1       
        //   333: ireturn        
        //   334: aload_0        
        //   335: invokevirtual   com/whatsapp/Conversation.onSearchRequested:()Z
        //   338: pop            
        //   339: iconst_1       
        //   340: ireturn        
        //   341: aload_0        
        //   342: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   345: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   348: invokestatic    com/whatsapp/App.p:(Ljava/lang/String;)Z
        //   351: istore          57
        //   353: iload           57
        //   355: ifeq            368
        //   358: aload_0        
        //   359: bipush          106
        //   361: invokevirtual   com/whatsapp/Conversation.showDialog:(I)V
        //   364: iload_2        
        //   365: ifeq            1403
        //   368: aload_0        
        //   369: getfield        com/whatsapp/Conversation.ae:Lcom/whatsapp/gw;
        //   372: aload_0        
        //   373: ldc_w           2131755419
        //   376: invokevirtual   com/whatsapp/Conversation.findViewById:(I)Landroid/view/View;
        //   379: invokevirtual   com/whatsapp/gw.a:(Landroid/view/View;)V
        //   382: goto            1403
        //   385: astore          55
        //   387: aload           55
        //   389: athrow         
        //   390: astore          56
        //   392: aload           56
        //   394: athrow         
        //   395: getstatic       com/whatsapp/App.o:Z
        //   398: istore          47
        //   400: iload           47
        //   402: ifne            415
        //   405: getstatic       com/whatsapp/App.G:Z
        //   408: istore          54
        //   410: iload           54
        //   412: ifeq            450
        //   415: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   418: sipush          252
        //   421: aaload         
        //   422: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   425: invokestatic    com/whatsapp/App.aw:()Z
        //   428: istore          48
        //   430: iload           48
        //   432: ifeq            507
        //   435: ldc_w           2131231383
        //   438: istore          49
        //   440: aload_0        
        //   441: iload           49
        //   443: invokevirtual   com/whatsapp/Conversation.a:(I)V
        //   446: iload_2        
        //   447: ifeq            490
        //   450: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   453: aload_0        
        //   454: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   457: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   460: invokevirtual   com/whatsapp/vy.a:(Ljava/lang/String;)Z
        //   463: istore          53
        //   465: iload           53
        //   467: ifeq            480
        //   470: aload_0        
        //   471: bipush          10
        //   473: invokevirtual   com/whatsapp/Conversation.showDialog:(I)V
        //   476: iload_2        
        //   477: ifeq            490
        //   480: aload_0        
        //   481: aload_0        
        //   482: aload_0        
        //   483: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   486: iconst_0       
        //   487: invokestatic    com/whatsapp/Conversation.a:(Landroid/app/Activity;Lcom/whatsapp/gu;Lcom/whatsapp/a_9;Z)V
        //   490: iconst_1       
        //   491: ireturn        
        //   492: astore          44
        //   494: aload           44
        //   496: athrow         
        //   497: astore          45
        //   499: aload           45
        //   501: athrow         
        //   502: astore          46
        //   504: aload           46
        //   506: athrow         
        //   507: ldc_w           2131231384
        //   510: istore          49
        //   512: goto            440
        //   515: astore          50
        //   517: aload           50
        //   519: athrow         
        //   520: astore          51
        //   522: aload           51
        //   524: athrow         
        //   525: astore          52
        //   527: aload           52
        //   529: athrow         
        //   530: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   533: aload_0        
        //   534: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   537: invokevirtual   com/whatsapp/wc.e:(Lcom/whatsapp/a_9;)V
        //   540: iconst_1       
        //   541: ireturn        
        //   542: aload_0        
        //   543: getfield        com/whatsapp/Conversation.S:Z
        //   546: istore          43
        //   548: iload           43
        //   550: ifeq            583
        //   553: aload_0        
        //   554: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   557: aload_0        
        //   558: aload_0        
        //   559: aload_0        
        //   560: ldc_w           2131755432
        //   563: invokevirtual   com/whatsapp/Conversation.findViewById:(I)Landroid/view/View;
        //   566: aload_0        
        //   567: ldc_w           2131232142
        //   570: invokevirtual   com/whatsapp/Conversation.getString:(I)Ljava/lang/String;
        //   573: invokestatic    android/support/v4/app/ActivityOptionsCompat.makeSceneTransitionAnimation:(Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;)Landroid/support/v4/app/ActivityOptionsCompat;
        //   576: invokestatic    com/whatsapp/ListChatInfo.a:(Lcom/whatsapp/a_9;Landroid/app/Activity;Landroid/support/v4/app/ActivityOptionsCompat;)V
        //   579: iload_2        
        //   580: ifeq            1405
        //   583: aload_0        
        //   584: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   587: aload_0        
        //   588: aload_0        
        //   589: aload_0        
        //   590: ldc_w           2131755432
        //   593: invokevirtual   com/whatsapp/Conversation.findViewById:(I)Landroid/view/View;
        //   596: aload_0        
        //   597: ldc_w           2131232142
        //   600: invokevirtual   com/whatsapp/Conversation.getString:(I)Ljava/lang/String;
        //   603: invokestatic    android/support/v4/app/ActivityOptionsCompat.makeSceneTransitionAnimation:(Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;)Landroid/support/v4/app/ActivityOptionsCompat;
        //   606: invokestatic    com/whatsapp/GroupChatInfo.a:(Lcom/whatsapp/a_9;Landroid/app/Activity;Landroid/support/v4/app/ActivityOptionsCompat;)V
        //   609: goto            1405
        //   612: astore          41
        //   614: aload           41
        //   616: athrow         
        //   617: astore          42
        //   619: aload           42
        //   621: athrow         
        //   622: aload_0        
        //   623: aload_0        
        //   624: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //   627: invokestatic    com/whatsapp/notification/y.d:(Landroid/content/Context;Ljava/lang/String;)Z
        //   630: ifeq            645
        //   633: aload_0        
        //   634: aload_0        
        //   635: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //   638: invokestatic    com/whatsapp/notification/y.b:(Landroid/content/Context;Ljava/lang/String;)V
        //   641: iload_2        
        //   642: ifeq            843
        //   645: aload_0        
        //   646: invokevirtual   com/whatsapp/Conversation.getResources:()Landroid/content/res/Resources;
        //   649: ldc_w           2131689489
        //   652: invokevirtual   android/content/res/Resources.getStringArray:(I)[Ljava/lang/String;
        //   655: astore          31
        //   657: aload_0        
        //   658: invokevirtual   com/whatsapp/Conversation.getResources:()Landroid/content/res/Resources;
        //   661: ldc_w           2131689490
        //   664: invokevirtual   android/content/res/Resources.getIntArray:(I)[I
        //   667: astore          32
        //   669: new             Landroid/support/v7/app/AlertDialog$Builder;
        //   672: dup            
        //   673: aload_0        
        //   674: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   677: astore          33
        //   679: aload           33
        //   681: aload_0        
        //   682: ldc_w           2131231381
        //   685: invokevirtual   com/whatsapp/Conversation.getString:(I)Ljava/lang/String;
        //   688: invokevirtual   android/support/v7/app/AlertDialog$Builder.setTitle:(Ljava/lang/CharSequence;)Landroid/support/v7/app/AlertDialog$Builder;
        //   691: pop            
        //   692: aload_0        
        //   693: invokevirtual   com/whatsapp/Conversation.getLayoutInflater:()Landroid/view/LayoutInflater;
        //   696: ldc_w           2130903197
        //   699: aconst_null    
        //   700: iconst_0       
        //   701: invokestatic    com/whatsapp/alm.a:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //   704: astore          35
        //   706: aload           35
        //   708: ldc_w           2131755689
        //   711: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   714: checkcast       Landroid/widget/CheckBox;
        //   717: astore          36
        //   719: iconst_1       
        //   720: newarray        I
        //   722: astore          37
        //   724: aload           37
        //   726: iconst_0       
        //   727: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   730: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   733: sipush          244
        //   736: aaload         
        //   737: iconst_0       
        //   738: invokevirtual   com/whatsapp/App.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //   741: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   744: sipush          249
        //   747: aaload         
        //   748: iconst_0       
        //   749: invokeinterface android/content/SharedPreferences.getInt:(Ljava/lang/String;I)I
        //   754: iastore        
        //   755: aload           37
        //   757: iconst_0       
        //   758: iaload         
        //   759: aload           31
        //   761: arraylength    
        //   762: if_icmplt       770
        //   765: aload           37
        //   767: iconst_0       
        //   768: iconst_0       
        //   769: iastore        
        //   770: aload           33
        //   772: aload           31
        //   774: aload           37
        //   776: iconst_0       
        //   777: iaload         
        //   778: new             Lcom/whatsapp/xs;
        //   781: dup            
        //   782: aload_0        
        //   783: aload           37
        //   785: invokespecial   com/whatsapp/xs.<init>:(Lcom/whatsapp/Conversation;[I)V
        //   788: invokevirtual   android/support/v7/app/AlertDialog$Builder.setSingleChoiceItems:([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   791: ldc_w           2131231435
        //   794: new             Lcom/whatsapp/aqi;
        //   797: dup            
        //   798: aload_0        
        //   799: aload           37
        //   801: aload           32
        //   803: aload           36
        //   805: invokespecial   com/whatsapp/aqi.<init>:(Lcom/whatsapp/Conversation;[I[ILandroid/widget/CheckBox;)V
        //   808: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   811: ldc_w           2131230874
        //   814: new             Lcom/whatsapp/vt;
        //   817: dup            
        //   818: aload_0        
        //   819: invokespecial   com/whatsapp/vt.<init>:(Lcom/whatsapp/Conversation;)V
        //   822: invokevirtual   android/support/v7/app/AlertDialog$Builder.setNegativeButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   825: pop            
        //   826: aload           33
        //   828: aload           35
        //   830: invokevirtual   android/support/v7/app/AlertDialog$Builder.setView:(Landroid/view/View;)Landroid/support/v7/app/AlertDialog$Builder;
        //   833: pop            
        //   834: aload_0        
        //   835: aload           33
        //   837: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   840: invokevirtual   com/whatsapp/Conversation.a:(Landroid/app/Dialog;)V
        //   843: iconst_1       
        //   844: ireturn        
        //   845: astore          30
        //   847: aload           30
        //   849: athrow         
        //   850: astore          38
        //   852: aload           38
        //   854: athrow         
        //   855: aload_0        
        //   856: getfield        com/whatsapp/Conversation.af:Landroid/app/WallpaperManager;
        //   859: ifnonnull       870
        //   862: aload_0        
        //   863: aload_0        
        //   864: invokestatic    android/app/WallpaperManager.getInstance:(Landroid/content/Context;)Landroid/app/WallpaperManager;
        //   867: putfield        com/whatsapp/Conversation.af:Landroid/app/WallpaperManager;
        //   870: new             Landroid/graphics/Rect;
        //   873: dup            
        //   874: invokespecial   android/graphics/Rect.<init>:()V
        //   877: astore          8
        //   879: aload_0        
        //   880: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //   883: aload           8
        //   885: invokevirtual   android/widget/ListView.getDrawingRect:(Landroid/graphics/Rect;)V
        //   888: new             Ljava/lang/StringBuilder;
        //   891: dup            
        //   892: invokespecial   java/lang/StringBuilder.<init>:()V
        //   895: aload_0        
        //   896: getfield        com/whatsapp/Conversation.y:Lcom/whatsapp/wallpaper/WallPaperView;
        //   899: invokevirtual   com/whatsapp/wallpaper/WallPaperView.getWidth:()I
        //   902: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   905: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   908: sipush          246
        //   911: aaload         
        //   912: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   915: aload_0        
        //   916: getfield        com/whatsapp/Conversation.y:Lcom/whatsapp/wallpaper/WallPaperView;
        //   919: invokevirtual   com/whatsapp/wallpaper/WallPaperView.getHeight:()I
        //   922: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   925: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   928: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   931: new             Landroid/content/Intent;
        //   934: dup            
        //   935: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   938: sipush          253
        //   941: aaload         
        //   942: aconst_null    
        //   943: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;Landroid/net/Uri;)V
        //   946: astore          9
        //   948: aload           9
        //   950: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   953: sipush          247
        //   956: aaload         
        //   957: invokevirtual   android/content/Intent.setType:(Ljava/lang/String;)Landroid/content/Intent;
        //   960: pop            
        //   961: aload_0        
        //   962: invokevirtual   com/whatsapp/Conversation.getPackageManager:()Landroid/content/pm/PackageManager;
        //   965: aload           9
        //   967: iconst_0       
        //   968: invokevirtual   android/content/pm/PackageManager.queryIntentActivities:(Landroid/content/Intent;I)Ljava/util/List;
        //   971: astore          11
        //   973: aload           11
        //   975: invokeinterface java/util/List.size:()I
        //   980: istore          12
        //   982: iconst_0       
        //   983: istore          13
        //   985: iload           13
        //   987: iload           12
        //   989: if_icmpge       1180
        //   992: aload           11
        //   994: iload           13
        //   996: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1001: checkcast       Landroid/content/pm/ResolveInfo;
        //  1004: getfield        android/content/pm/ResolveInfo.activityInfo:Landroid/content/pm/ActivityInfo;
        //  1007: astore          19
        //  1009: new             Ljava/lang/StringBuilder;
        //  1012: dup            
        //  1013: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1016: aload           19
        //  1018: getfield        android/content/pm/ActivityInfo.applicationInfo:Landroid/content/pm/ApplicationInfo;
        //  1021: getfield        android/content/pm/ApplicationInfo.packageName:Ljava/lang/String;
        //  1024: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1027: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1030: sipush          256
        //  1033: aaload         
        //  1034: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1037: aload           19
        //  1039: getfield        android/content/pm/ActivityInfo.name:Ljava/lang/String;
        //  1042: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1045: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1048: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1051: aload           19
        //  1053: getfield        android/content/pm/ActivityInfo.name:Ljava/lang/String;
        //  1056: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1059: sipush          254
        //  1062: aaload         
        //  1063: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //  1066: istore          24
        //  1068: iload           24
        //  1070: ifeq            1095
        //  1073: aload           19
        //  1075: getfield        android/content/pm/ActivityInfo.name:Ljava/lang/String;
        //  1078: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1081: sipush          257
        //  1084: aaload         
        //  1085: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //  1088: istore          29
        //  1090: iload           29
        //  1092: ifne            1117
        //  1095: aload           19
        //  1097: getfield        android/content/pm/ActivityInfo.name:Ljava/lang/String;
        //  1100: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1103: sipush          250
        //  1106: aaload         
        //  1107: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //  1110: istore          25
        //  1112: iload           25
        //  1114: ifeq            1170
        //  1117: aload           9
        //  1119: new             Landroid/content/ComponentName;
        //  1122: dup            
        //  1123: aload           19
        //  1125: getfield        android/content/pm/ActivityInfo.applicationInfo:Landroid/content/pm/ApplicationInfo;
        //  1128: getfield        android/content/pm/ApplicationInfo.packageName:Ljava/lang/String;
        //  1131: aload           19
        //  1133: getfield        android/content/pm/ActivityInfo.name:Ljava/lang/String;
        //  1136: invokespecial   android/content/ComponentName.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //  1139: invokevirtual   android/content/Intent.setComponent:(Landroid/content/ComponentName;)Landroid/content/Intent;
        //  1142: pop            
        //  1143: aload           9
        //  1145: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1148: sipush          248
        //  1151: aaload         
        //  1152: aload_0        
        //  1153: invokevirtual   com/whatsapp/Conversation.getResources:()Landroid/content/res/Resources;
        //  1156: invokevirtual   android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
        //  1159: getfield        android/content/res/Configuration.orientation:I
        //  1162: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //  1165: pop            
        //  1166: iload_2        
        //  1167: ifeq            1180
        //  1170: iload           13
        //  1172: iconst_1       
        //  1173: iadd           
        //  1174: istore          26
        //  1176: iload_2        
        //  1177: ifeq            1390
        //  1180: new             Landroid/content/Intent;
        //  1183: dup            
        //  1184: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1187: sipush          258
        //  1190: aaload         
        //  1191: aconst_null    
        //  1192: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;Landroid/net/Uri;)V
        //  1195: astore          14
        //  1197: aload           14
        //  1199: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1202: sipush          259
        //  1205: aaload         
        //  1206: aload_0        
        //  1207: invokevirtual   com/whatsapp/Conversation.getResources:()Landroid/content/res/Resources;
        //  1210: invokevirtual   android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
        //  1213: getfield        android/content/res/Configuration.orientation:I
        //  1216: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //  1219: pop            
        //  1220: iconst_3       
        //  1221: anewarray       Landroid/os/Parcelable;
        //  1224: dup            
        //  1225: iconst_0       
        //  1226: aload           9
        //  1228: aastore        
        //  1229: dup            
        //  1230: iconst_1       
        //  1231: aload           14
        //  1233: aastore        
        //  1234: dup            
        //  1235: iconst_2       
        //  1236: new             Landroid/content/Intent;
        //  1239: dup            
        //  1240: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1243: sipush          260
        //  1246: aaload         
        //  1247: aconst_null    
        //  1248: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;Landroid/net/Uri;)V
        //  1251: aastore        
        //  1252: astore          16
        //  1254: new             Landroid/content/Intent;
        //  1257: dup            
        //  1258: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1261: sipush          251
        //  1264: aaload         
        //  1265: aconst_null    
        //  1266: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;Landroid/net/Uri;)V
        //  1269: aload_0        
        //  1270: ldc_w           2131231479
        //  1273: invokevirtual   com/whatsapp/Conversation.getString:(I)Ljava/lang/String;
        //  1276: invokestatic    android/content/Intent.createChooser:(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;
        //  1279: astore          17
        //  1281: aload           17
        //  1283: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1286: sipush          245
        //  1289: aaload         
        //  1290: aload           16
        //  1292: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;[Landroid/os/Parcelable;)Landroid/content/Intent;
        //  1295: pop            
        //  1296: aload_0        
        //  1297: aload           17
        //  1299: bipush          17
        //  1301: invokevirtual   com/whatsapp/Conversation.startActivityForResult:(Landroid/content/Intent;I)V
        //  1304: iconst_1       
        //  1305: ireturn        
        //  1306: astore          7
        //  1308: aload           7
        //  1310: athrow         
        //  1311: astore          20
        //  1313: aload           20
        //  1315: athrow         
        //  1316: astore          21
        //  1318: aload           21
        //  1320: athrow         
        //  1321: astore          22
        //  1323: aload           22
        //  1325: athrow         
        //  1326: astore          23
        //  1328: aload           23
        //  1330: athrow         
        //  1331: new             Landroid/content/Intent;
        //  1334: dup            
        //  1335: aload_0        
        //  1336: ldc_w           Lcom/whatsapp/MediaGallery;.class
        //  1339: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  1342: astore          5
        //  1344: aload           5
        //  1346: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //  1349: sipush          255
        //  1352: aaload         
        //  1353: aload_0        
        //  1354: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //  1357: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //  1360: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1363: pop            
        //  1364: aload_0        
        //  1365: aload           5
        //  1367: invokevirtual   com/whatsapp/Conversation.startActivity:(Landroid/content/Intent;)V
        //  1370: iconst_1       
        //  1371: putstatic       com/whatsapp/Conversation.a_:Z
        //  1374: iconst_1       
        //  1375: ireturn        
        //  1376: aload_0        
        //  1377: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //  1380: aload_0        
        //  1381: getstatic       com/whatsapp/fieldstats/bq.CONVERSATION:Lcom/whatsapp/fieldstats/bq;
        //  1384: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/a_9;Landroid/app/Activity;Lcom/whatsapp/fieldstats/bq;)Z
        //  1387: pop            
        //  1388: iconst_1       
        //  1389: ireturn        
        //  1390: iload           26
        //  1392: istore          13
        //  1394: goto            985
        //  1397: iconst_0       
        //  1398: ireturn        
        //  1399: iconst_1       
        //  1400: ireturn        
        //  1401: iconst_1       
        //  1402: ireturn        
        //  1403: iconst_1       
        //  1404: ireturn        
        //  1405: iconst_1       
        //  1406: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  4      132    138    141    Landroid/content/ActivityNotFoundException;
        //  132    136    138    141    Landroid/content/ActivityNotFoundException;
        //  141    147    181    186    Landroid/content/ActivityNotFoundException;
        //  152    163    186    191    Landroid/content/ActivityNotFoundException;
        //  167    178    186    191    Landroid/content/ActivityNotFoundException;
        //  183    186    186    191    Landroid/content/ActivityNotFoundException;
        //  191    197    246    251    Landroid/content/ActivityNotFoundException;
        //  202    213    251    256    Landroid/content/ActivityNotFoundException;
        //  217    243    251    256    Landroid/content/ActivityNotFoundException;
        //  248    251    251    256    Landroid/content/ActivityNotFoundException;
        //  256    262    307    312    Landroid/content/ActivityNotFoundException;
        //  267    272    312    317    Landroid/content/ActivityNotFoundException;
        //  276    281    317    322    Landroid/content/ActivityNotFoundException;
        //  286    297    322    327    Landroid/content/ActivityNotFoundException;
        //  301    305    322    327    Landroid/content/ActivityNotFoundException;
        //  309    312    312    317    Landroid/content/ActivityNotFoundException;
        //  314    317    317    322    Landroid/content/ActivityNotFoundException;
        //  319    322    322    327    Landroid/content/ActivityNotFoundException;
        //  341    353    385    390    Landroid/content/ActivityNotFoundException;
        //  358    364    390    395    Landroid/content/ActivityNotFoundException;
        //  368    382    390    395    Landroid/content/ActivityNotFoundException;
        //  387    390    390    395    Landroid/content/ActivityNotFoundException;
        //  395    400    492    497    Landroid/content/ActivityNotFoundException;
        //  405    410    497    502    Landroid/content/ActivityNotFoundException;
        //  415    430    502    507    Landroid/content/ActivityNotFoundException;
        //  440    446    515    520    Landroid/content/ActivityNotFoundException;
        //  450    465    520    525    Landroid/content/ActivityNotFoundException;
        //  470    476    525    530    Landroid/content/ActivityNotFoundException;
        //  480    490    525    530    Landroid/content/ActivityNotFoundException;
        //  494    497    497    502    Landroid/content/ActivityNotFoundException;
        //  499    502    502    507    Landroid/content/ActivityNotFoundException;
        //  517    520    520    525    Landroid/content/ActivityNotFoundException;
        //  522    525    525    530    Landroid/content/ActivityNotFoundException;
        //  542    548    612    617    Landroid/content/ActivityNotFoundException;
        //  553    579    617    622    Landroid/content/ActivityNotFoundException;
        //  583    609    617    622    Landroid/content/ActivityNotFoundException;
        //  614    617    617    622    Landroid/content/ActivityNotFoundException;
        //  622    641    845    850    Landroid/content/ActivityNotFoundException;
        //  724    770    850    855    Landroid/content/ActivityNotFoundException;
        //  855    870    1306   1311   Landroid/content/ActivityNotFoundException;
        //  1009   1068   1311   1316   Landroid/content/ActivityNotFoundException;
        //  1073   1090   1316   1321   Landroid/content/ActivityNotFoundException;
        //  1095   1112   1321   1326   Landroid/content/ActivityNotFoundException;
        //  1117   1166   1326   1331   Landroid/content/ActivityNotFoundException;
        //  1313   1316   1316   1321   Landroid/content/ActivityNotFoundException;
        //  1318   1321   1321   1326   Landroid/content/ActivityNotFoundException;
        //  1323   1326   1326   1331   Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 624, Size: 624
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
    
    public void onPause() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //     3: sipush          188
        //     6: aaload         
        //     7: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    10: aload_0        
        //    11: invokespecial   com/whatsapp/DialogToastListActivity.onPause:()V
        //    14: aload_0        
        //    15: getfield        com/whatsapp/Conversation.al:Lcom/whatsapp/ps;
        //    18: ifnull          29
        //    21: aload_0        
        //    22: getfield        com/whatsapp/Conversation.al:Lcom/whatsapp/ps;
        //    25: iconst_0       
        //    26: invokevirtual   com/whatsapp/ps.b:(Z)V
        //    29: getstatic       com/whatsapp/Conversation.v:Ljava/util/HashMap;
        //    32: aload_0        
        //    33: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //    36: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    39: aload_0        
        //    40: getfield        com/whatsapp/Conversation.X:Lcom/whatsapp/ConversationTextEntry;
        //    43: invokevirtual   com/whatsapp/ConversationTextEntry.getText:()Landroid/text/Editable;
        //    46: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    49: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    52: pop            
        //    53: aload_0        
        //    54: iconst_1       
        //    55: putfield        com/whatsapp/Conversation.aQ:Z
        //    58: aload_0        
        //    59: getfield        com/whatsapp/Conversation.aK:Landroid/os/Handler;
        //    62: astore          6
        //    64: aload           6
        //    66: ifnull          121
        //    69: aload_0        
        //    70: getfield        com/whatsapp/Conversation.aK:Landroid/os/Handler;
        //    73: iconst_0       
        //    74: invokevirtual   android/os/Handler.hasMessages:(I)Z
        //    77: istore          13
        //    79: iload           13
        //    81: ifeq            121
        //    84: aload_0        
        //    85: getfield        com/whatsapp/Conversation.aK:Landroid/os/Handler;
        //    88: iconst_0       
        //    89: invokevirtual   android/os/Handler.removeMessages:(I)V
        //    92: aload_0        
        //    93: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    96: sipush          189
        //    99: aaload         
        //   100: invokevirtual   com/whatsapp/Conversation.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   103: checkcast       Landroid/os/PowerManager;
        //   106: invokevirtual   android/os/PowerManager.isScreenOn:()Z
        //   109: ifeq            121
        //   112: aload_0        
        //   113: getfield        com/whatsapp/Conversation.aK:Landroid/os/Handler;
        //   116: iconst_0       
        //   117: invokevirtual   android/os/Handler.sendEmptyMessage:(I)Z
        //   120: pop            
        //   121: aload_0        
        //   122: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //   125: invokevirtual   android/widget/ListView.getHeight:()I
        //   128: istore          9
        //   130: iload           9
        //   132: ifeq            214
        //   135: aload_0        
        //   136: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //   139: invokevirtual   android/widget/ListView.getLastVisiblePosition:()I
        //   142: iconst_m1      
        //   143: aload_0        
        //   144: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //   147: invokevirtual   android/widget/ListView.getCount:()I
        //   150: iadd           
        //   151: if_icmpne       169
        //   154: aload_0        
        //   155: iconst_1       
        //   156: putfield        com/whatsapp/Conversation.D:Z
        //   159: getstatic       com/whatsapp/App.I:Z
        //   162: istore          12
        //   164: iload           12
        //   166: ifeq            214
        //   169: aload_0        
        //   170: aload_0        
        //   171: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //   174: invokevirtual   android/widget/ListView.getFirstVisiblePosition:()I
        //   177: putfield        com/whatsapp/Conversation.bh:I
        //   180: aload_0        
        //   181: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //   184: iconst_0       
        //   185: invokevirtual   android/widget/ListView.getChildAt:(I)Landroid/view/View;
        //   188: astore          10
        //   190: aload_0        
        //   191: iconst_0       
        //   192: putfield        com/whatsapp/Conversation.w:I
        //   195: aload           10
        //   197: ifnull          209
        //   200: aload_0        
        //   201: aload           10
        //   203: invokevirtual   android/view/View.getTop:()I
        //   206: putfield        com/whatsapp/Conversation.w:I
        //   209: aload_0        
        //   210: iconst_0       
        //   211: putfield        com/whatsapp/Conversation.D:Z
        //   214: aload_0        
        //   215: invokespecial   com/whatsapp/Conversation.r:()V
        //   218: return         
        //   219: astore_1       
        //   220: aload_1        
        //   221: athrow         
        //   222: astore_2       
        //   223: aload_2        
        //   224: athrow         
        //   225: astore_3       
        //   226: aload_3        
        //   227: athrow         
        //   228: astore          4
        //   230: aload           4
        //   232: athrow         
        //   233: astore          7
        //   235: aload           7
        //   237: athrow         
        //   238: astore          8
        //   240: aload           8
        //   242: athrow         
        //   243: astore          11
        //   245: aload           11
        //   247: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      29     219    222    Landroid/content/ActivityNotFoundException;
        //  29     64     222    225    Landroid/content/ActivityNotFoundException;
        //  69     79     225    228    Landroid/content/ActivityNotFoundException;
        //  84     121    228    233    Landroid/content/ActivityNotFoundException;
        //  121    130    233    238    Landroid/content/ActivityNotFoundException;
        //  135    164    238    243    Landroid/content/ActivityNotFoundException;
        //  190    195    243    248    Landroid/content/ActivityNotFoundException;
        //  200    209    243    248    Landroid/content/ActivityNotFoundException;
        //  223    225    225    228    Landroid/content/ActivityNotFoundException;
        //  226    228    228    233    Landroid/content/ActivityNotFoundException;
        //  235    238    238    243    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 123, Size: 123
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
    
    protected void onPrepareDialog(final int n, final Dialog dialog) {
        final boolean i = App.I;
        Label_0061_Outer:Label_0089_Outer:
        while (true) {
        Label_0089:
            while (true) {
            Label_0075:
                while (true) {
                    switch (n) {
                        default: {
                            break Label_0040;
                        }
                        case 121: {
                            break Label_0089;
                        }
                        case 117: {
                            while (true) {
                                break Label_0061;
                                try {
                                    super.onPrepareDialog(n, dialog);
                                    Label_0046: {
                                        return;
                                    }
                                    ((AlertDialog)dialog).setMessage(yt.c());
                                    // iftrue(Label_0046:, !i)
                                    // iftrue(Label_0046:, !i)
                                    // iftrue(Label_0046:, !i)
                                    // iftrue(Label_0046:, !i)
                                    Block_2: {
                                        break Block_2;
                                        ((AlertDialog)dialog).setMessage(yt.a());
                                        break Label_0075;
                                        ((AlertDialog)dialog).setMessage(yt.b());
                                        continue Label_0089_Outer;
                                        ((AlertDialog)dialog).setMessage(yt.d());
                                        continue Label_0089;
                                    }
                                    continue Label_0061_Outer;
                                }
                                catch (ActivityNotFoundException ex) {
                                    throw ex;
                                }
                                break;
                            }
                            break;
                        }
                        case 118: {
                            continue Label_0075;
                        }
                        case 119: {
                            continue Label_0089;
                        }
                    }
                    break;
                }
                break;
            }
            break;
        }
    }
    
    public boolean onPrepareOptionsMenu(final Menu p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: new             Ljava/lang/StringBuilder;
        //     7: dup            
        //     8: invokespecial   java/lang/StringBuilder.<init>:()V
        //    11: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    14: bipush          47
        //    16: aaload         
        //    17: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    20: aload_1        
        //    21: invokeinterface android/view/Menu.size:()I
        //    26: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    29: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    32: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    35: aload_1        
        //    36: invokeinterface android/view/Menu.size:()I
        //    41: istore          4
        //    43: iload           4
        //    45: ifne            53
        //    48: iconst_0       
        //    49: ireturn        
        //    50: astore_3       
        //    51: aload_3        
        //    52: athrow         
        //    53: aload_0        
        //    54: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //    57: astore          7
        //    59: aload           7
        //    61: ifnull          435
        //    64: aload_0        
        //    65: getfield        com/whatsapp/Conversation.aG:Z
        //    68: ifne            211
        //    71: aload_0        
        //    72: getfield        com/whatsapp/Conversation.S:Z
        //    75: istore          32
        //    77: iload           32
        //    79: ifne            211
        //    82: aload_1        
        //    83: iconst_1       
        //    84: invokeinterface android/view/Menu.findItem:(I)Landroid/view/MenuItem;
        //    89: astore          33
        //    91: aload_0        
        //    92: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //    95: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //    98: astore          36
        //   100: aload           36
        //   102: ifnull          125
        //   105: aload_0        
        //   106: iconst_0       
        //   107: putfield        com/whatsapp/Conversation.aq:Z
        //   110: aload           33
        //   112: ldc_w           2131231908
        //   115: invokeinterface android/view/MenuItem.setTitle:(I)Landroid/view/MenuItem;
        //   120: pop            
        //   121: iload_2        
        //   122: ifeq            141
        //   125: aload_0        
        //   126: iconst_1       
        //   127: putfield        com/whatsapp/Conversation.aq:Z
        //   130: aload           33
        //   132: ldc_w           2131230790
        //   135: invokeinterface android/view/MenuItem.setTitle:(I)Landroid/view/MenuItem;
        //   140: pop            
        //   141: aload_1        
        //   142: iconst_4       
        //   143: invokeinterface android/view/Menu.findItem:(I)Landroid/view/MenuItem;
        //   148: astore          38
        //   150: aload_0        
        //   151: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   154: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   157: invokestatic    com/whatsapp/App.p:(Ljava/lang/String;)Z
        //   160: ifeq            187
        //   163: aload_0        
        //   164: iconst_0       
        //   165: putfield        com/whatsapp/Conversation.ay:Z
        //   168: aload           38
        //   170: aload_0        
        //   171: ldc_w           2131231867
        //   174: invokevirtual   com/whatsapp/Conversation.getString:(I)Ljava/lang/String;
        //   177: invokeinterface android/view/MenuItem.setTitle:(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
        //   182: pop            
        //   183: iload_2        
        //   184: ifeq            207
        //   187: aload_0        
        //   188: iconst_1       
        //   189: putfield        com/whatsapp/Conversation.ay:Z
        //   192: aload           38
        //   194: aload_0        
        //   195: ldc_w           2131230839
        //   198: invokevirtual   com/whatsapp/Conversation.getString:(I)Ljava/lang/String;
        //   201: invokeinterface android/view/MenuItem.setTitle:(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
        //   206: pop            
        //   207: iload_2        
        //   208: ifeq            273
        //   211: aload_0        
        //   212: getfield        com/whatsapp/Conversation.aG:Z
        //   215: istore          9
        //   217: iload           9
        //   219: ifeq            273
        //   222: aload_1        
        //   223: bipush          10
        //   225: invokeinterface android/view/Menu.findItem:(I)Landroid/view/MenuItem;
        //   230: astore          26
        //   232: aload_0        
        //   233: aload_0        
        //   234: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //   237: invokestatic    com/whatsapp/notification/y.d:(Landroid/content/Context;Ljava/lang/String;)Z
        //   240: istore          29
        //   242: iload           29
        //   244: ifeq            262
        //   247: aload           26
        //   249: ldc_w           2131231306
        //   252: invokeinterface android/view/MenuItem.setTitle:(I)Landroid/view/MenuItem;
        //   257: pop            
        //   258: iload_2        
        //   259: ifeq            273
        //   262: aload           26
        //   264: ldc_w           2131231305
        //   267: invokeinterface android/view/MenuItem.setTitle:(I)Landroid/view/MenuItem;
        //   272: pop            
        //   273: aload_0        
        //   274: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //   277: invokevirtual   com/whatsapp/nm.getCount:()I
        //   280: istore          12
        //   282: iload           12
        //   284: ifle            336
        //   287: aload_1        
        //   288: bipush          7
        //   290: invokeinterface android/view/Menu.findItem:(I)Landroid/view/MenuItem;
        //   295: iconst_1       
        //   296: invokeinterface android/view/MenuItem.setVisible:(Z)Landroid/view/MenuItem;
        //   301: pop            
        //   302: aload_1        
        //   303: bipush          8
        //   305: invokeinterface android/view/Menu.findItem:(I)Landroid/view/MenuItem;
        //   310: iconst_1       
        //   311: invokeinterface android/view/MenuItem.setVisible:(Z)Landroid/view/MenuItem;
        //   316: pop            
        //   317: aload_1        
        //   318: bipush          14
        //   320: invokeinterface android/view/Menu.findItem:(I)Landroid/view/MenuItem;
        //   325: iconst_1       
        //   326: invokeinterface android/view/MenuItem.setVisible:(Z)Landroid/view/MenuItem;
        //   331: pop            
        //   332: iload_2        
        //   333: ifeq            381
        //   336: aload_1        
        //   337: bipush          7
        //   339: invokeinterface android/view/Menu.findItem:(I)Landroid/view/MenuItem;
        //   344: iconst_0       
        //   345: invokeinterface android/view/MenuItem.setVisible:(Z)Landroid/view/MenuItem;
        //   350: pop            
        //   351: aload_1        
        //   352: bipush          8
        //   354: invokeinterface android/view/Menu.findItem:(I)Landroid/view/MenuItem;
        //   359: iconst_0       
        //   360: invokeinterface android/view/MenuItem.setVisible:(Z)Landroid/view/MenuItem;
        //   365: pop            
        //   366: aload_1        
        //   367: bipush          14
        //   369: invokeinterface android/view/Menu.findItem:(I)Landroid/view/MenuItem;
        //   374: iconst_0       
        //   375: invokeinterface android/view/MenuItem.setVisible:(Z)Landroid/view/MenuItem;
        //   380: pop            
        //   381: aload_1        
        //   382: iconst_3       
        //   383: invokeinterface android/view/Menu.findItem:(I)Landroid/view/MenuItem;
        //   388: astore          16
        //   390: aload           16
        //   392: invokeinterface android/view/MenuItem.getSubMenu:()Landroid/view/SubMenu;
        //   397: astore          17
        //   399: aload           17
        //   401: invokeinterface android/view/SubMenu.hasVisibleItems:()Z
        //   406: istore          20
        //   408: iload           20
        //   410: ifeq            426
        //   413: aload           16
        //   415: iconst_1       
        //   416: invokeinterface android/view/MenuItem.setVisible:(Z)Landroid/view/MenuItem;
        //   421: pop            
        //   422: iload_2        
        //   423: ifeq            435
        //   426: aload           16
        //   428: iconst_0       
        //   429: invokeinterface android/view/MenuItem.setVisible:(Z)Landroid/view/MenuItem;
        //   434: pop            
        //   435: aload_0        
        //   436: aload_1        
        //   437: invokespecial   com/whatsapp/DialogToastListActivity.onPrepareOptionsMenu:(Landroid/view/Menu;)Z
        //   440: ireturn        
        //   441: astore          5
        //   443: aload           5
        //   445: athrow         
        //   446: astore          6
        //   448: aload           6
        //   450: athrow         
        //   451: astore          34
        //   453: aload           34
        //   455: athrow         
        //   456: astore          35
        //   458: aload           35
        //   460: athrow         
        //   461: astore          8
        //   463: aload           8
        //   465: athrow         
        //   466: astore          27
        //   468: aload           27
        //   470: athrow         
        //   471: astore          28
        //   473: aload           28
        //   475: athrow         
        //   476: astore          10
        //   478: aload           10
        //   480: athrow         
        //   481: astore          11
        //   483: aload           11
        //   485: athrow         
        //   486: astore          18
        //   488: aload           18
        //   490: athrow         
        //   491: astore          19
        //   493: aload           19
        //   495: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  4      43     50     53     Landroid/content/ActivityNotFoundException;
        //  53     59     441    446    Landroid/content/ActivityNotFoundException;
        //  64     77     446    451    Landroid/content/ActivityNotFoundException;
        //  91     100    451    456    Landroid/content/ActivityNotFoundException;
        //  105    121    456    461    Landroid/content/ActivityNotFoundException;
        //  125    141    456    461    Landroid/content/ActivityNotFoundException;
        //  211    217    461    466    Landroid/content/ActivityNotFoundException;
        //  232    242    466    471    Landroid/content/ActivityNotFoundException;
        //  247    258    471    476    Landroid/content/ActivityNotFoundException;
        //  262    273    471    476    Landroid/content/ActivityNotFoundException;
        //  273    282    476    481    Landroid/content/ActivityNotFoundException;
        //  287    332    481    486    Landroid/content/ActivityNotFoundException;
        //  336    381    481    486    Landroid/content/ActivityNotFoundException;
        //  399    408    486    491    Landroid/content/ActivityNotFoundException;
        //  413    422    491    496    Landroid/content/ActivityNotFoundException;
        //  426    435    491    496    Landroid/content/ActivityNotFoundException;
        //  443    446    446    451    Landroid/content/ActivityNotFoundException;
        //  453    456    456    461    Landroid/content/ActivityNotFoundException;
        //  468    471    471    476    Landroid/content/ActivityNotFoundException;
        //  478    481    481    486    Landroid/content/ActivityNotFoundException;
        //  488    491    491    496    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 223, Size: 223
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
    
    public void onResume() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: new             Ljava/lang/StringBuilder;
        //     7: dup            
        //     8: invokespecial   java/lang/StringBuilder.<init>:()V
        //    11: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    14: sipush          163
        //    17: aaload         
        //    18: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    21: aload_0        
        //    22: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //    25: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    28: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    31: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    34: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    37: new             Lcom/whatsapp/util/b0;
        //    40: dup            
        //    41: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    44: sipush          164
        //    47: aaload         
        //    48: invokespecial   com/whatsapp/util/b0.<init>:(Ljava/lang/String;)V
        //    51: astore_2       
        //    52: aload_0        
        //    53: invokespecial   com/whatsapp/DialogToastListActivity.onResume:()V
        //    56: invokestatic    com/whatsapp/notification/y.a:()V
        //    59: getstatic       com/whatsapp/wallpaper/h.b:Z
        //    62: ifeq            114
        //    65: aload_0        
        //    66: getfield        com/whatsapp/Conversation.az:Z
        //    69: istore          46
        //    71: iload           46
        //    73: ifeq            86
        //    76: aload_0        
        //    77: invokestatic    com/whatsapp/wallpaper/h.f:(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
        //    80: astore          47
        //    82: iload_1        
        //    83: ifeq            99
        //    86: aload_0        
        //    87: aload_0        
        //    88: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //    91: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    94: invokestatic    com/whatsapp/wallpaper/h.a:(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
        //    97: astore          47
        //    99: aload           47
        //   101: ifnull          110
        //   104: aload_0        
        //   105: aload           47
        //   107: invokespecial   com/whatsapp/Conversation.a:(Landroid/graphics/drawable/Drawable;)V
        //   110: iconst_0       
        //   111: putstatic       com/whatsapp/wallpaper/h.b:Z
        //   114: invokestatic    com/whatsapp/ChangeNumber.g:()Z
        //   117: ifne            126
        //   120: aload_0        
        //   121: iconst_0       
        //   122: invokespecial   com/whatsapp/Conversation.a:(Z)Z
        //   125: pop            
        //   126: aload_0        
        //   127: aload_0        
        //   128: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   131: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   134: invokestatic    com/whatsapp/z8.a:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   137: putfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   140: aload_0        
        //   141: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   144: iconst_0       
        //   145: iconst_1       
        //   146: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/a_9;ZZ)V
        //   149: aload_0        
        //   150: invokespecial   com/whatsapp/Conversation.I:()V
        //   153: aload_0        
        //   154: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   157: invokevirtual   com/whatsapp/a_9.m:()Z
        //   160: ifne            170
        //   163: aload_0        
        //   164: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   167: invokestatic    com/whatsapp/App.c:(Lcom/whatsapp/a_9;)V
        //   170: aload_0        
        //   171: getfield        com/whatsapp/Conversation.aa:Landroid/view/View;
        //   174: ifnull          181
        //   177: aload_0        
        //   178: invokespecial   com/whatsapp/Conversation.n:()V
        //   181: getstatic       com/whatsapp/Conversation.aW:Z
        //   184: ifeq            215
        //   187: aload_0        
        //   188: getfield        com/whatsapp/Conversation.L:Z
        //   191: istore          43
        //   193: iload           43
        //   195: ifne            215
        //   198: aload_0        
        //   199: getfield        com/whatsapp/Conversation.aC:Z
        //   202: istore          44
        //   204: iload           44
        //   206: ifne            215
        //   209: invokestatic    com/whatsapp/notification/a2.b:()Lcom/whatsapp/notification/a2;
        //   212: invokevirtual   com/whatsapp/notification/a2.c:()V
        //   215: iconst_0       
        //   216: putstatic       com/whatsapp/Conversation.aW:Z
        //   219: getstatic       com/whatsapp/Conversation.ao:Ljava/util/ArrayList;
        //   222: aload_0        
        //   223: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   226: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   229: invokevirtual   java/util/ArrayList.remove:(Ljava/lang/Object;)Z
        //   232: ifeq            240
        //   235: aload_0        
        //   236: iconst_2       
        //   237: invokevirtual   com/whatsapp/Conversation.showDialog:(I)V
        //   240: getstatic       com/whatsapp/App.a:Landroid/media/AsyncPlayer;
        //   243: invokevirtual   android/media/AsyncPlayer.stop:()V
        //   246: aload_0        
        //   247: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //   250: iconst_0       
        //   251: invokevirtual   android/widget/ListView.setFastScrollEnabled:(Z)V
        //   254: aload_0        
        //   255: getfield        com/whatsapp/Conversation.L:Z
        //   258: istore          15
        //   260: iload           15
        //   262: ifeq            274
        //   265: aload_0        
        //   266: iconst_0       
        //   267: putfield        com/whatsapp/Conversation.L:Z
        //   270: iload_1        
        //   271: ifeq            306
        //   274: aload_0        
        //   275: getfield        com/whatsapp/Conversation.aC:Z
        //   278: ifeq            306
        //   281: aload_0        
        //   282: new             Lcom/whatsapp/aoh;
        //   285: dup            
        //   286: aload_0        
        //   287: aconst_null    
        //   288: invokespecial   com/whatsapp/aoh.<init>:(Lcom/whatsapp/Conversation;Lcom/whatsapp/st;)V
        //   291: putfield        com/whatsapp/Conversation.aK:Landroid/os/Handler;
        //   294: aload_0        
        //   295: getfield        com/whatsapp/Conversation.aK:Landroid/os/Handler;
        //   298: iconst_0       
        //   299: ldc2_w          3000
        //   302: invokevirtual   android/os/Handler.sendEmptyMessageDelayed:(IJ)Z
        //   305: pop            
        //   306: aload_0        
        //   307: getfield        com/whatsapp/Conversation.bj:Z
        //   310: ifeq            363
        //   313: getstatic       com/whatsapp/Conversation.aR:Landroid/view/Display;
        //   316: invokevirtual   android/view/Display.getHeight:()I
        //   319: iconst_2       
        //   320: aload_0        
        //   321: invokevirtual   com/whatsapp/Conversation.getResources:()Landroid/content/res/Resources;
        //   324: ldc_w           2131361920
        //   327: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   330: imul           
        //   331: isub           
        //   332: iconst_4       
        //   333: idiv           
        //   334: istore          39
        //   336: aload_0        
        //   337: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //   340: new             Lcom/whatsapp/l0;
        //   343: dup            
        //   344: aload_0        
        //   345: iload           39
        //   347: invokespecial   com/whatsapp/l0.<init>:(Lcom/whatsapp/Conversation;I)V
        //   350: invokevirtual   android/widget/ListView.post:(Ljava/lang/Runnable;)Z
        //   353: pop            
        //   354: aload_0        
        //   355: iconst_1       
        //   356: putfield        com/whatsapp/Conversation.aj:Z
        //   359: iload_1        
        //   360: ifeq            430
        //   363: aload_0        
        //   364: getfield        com/whatsapp/Conversation.bg:Z
        //   367: istore          20
        //   369: iload           20
        //   371: ifeq            396
        //   374: aload_0        
        //   375: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //   378: iconst_0       
        //   379: invokevirtual   android/widget/ListView.setSelection:(I)V
        //   382: aload_0        
        //   383: iconst_1       
        //   384: putfield        com/whatsapp/Conversation.aj:Z
        //   387: aload_0        
        //   388: iconst_1       
        //   389: putfield        com/whatsapp/Conversation.bj:Z
        //   392: iload_1        
        //   393: ifeq            430
        //   396: aload_0        
        //   397: getfield        com/whatsapp/Conversation.D:Z
        //   400: istore          21
        //   402: iload           21
        //   404: ifeq            415
        //   407: aload_0        
        //   408: invokespecial   com/whatsapp/Conversation.o:()V
        //   411: iload_1        
        //   412: ifeq            430
        //   415: aload_0        
        //   416: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //   419: aload_0        
        //   420: getfield        com/whatsapp/Conversation.bh:I
        //   423: aload_0        
        //   424: getfield        com/whatsapp/Conversation.w:I
        //   427: invokevirtual   android/widget/ListView.setSelectionFromTop:(II)V
        //   430: aload_0        
        //   431: getfield        com/whatsapp/Conversation.C:Landroid/widget/TextView;
        //   434: iconst_1       
        //   435: invokevirtual   android/widget/TextView.setSelected:(Z)V
        //   438: aload_0        
        //   439: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //   442: invokevirtual   com/whatsapp/nm.getCount:()I
        //   445: istore          24
        //   447: iload           24
        //   449: ifne            468
        //   452: aload_0        
        //   453: getfield        com/whatsapp/Conversation.bf:Landroid/os/Handler;
        //   456: iconst_0       
        //   457: ldc2_w          100
        //   460: invokevirtual   android/os/Handler.sendEmptyMessageDelayed:(IJ)Z
        //   463: pop            
        //   464: iload_1        
        //   465: ifeq            480
        //   468: aload_0        
        //   469: getfield        com/whatsapp/Conversation.bf:Landroid/os/Handler;
        //   472: iconst_1       
        //   473: ldc2_w          100
        //   476: invokevirtual   android/os/Handler.sendEmptyMessageDelayed:(IJ)Z
        //   479: pop            
        //   480: aload_0        
        //   481: getfield        com/whatsapp/Conversation.a7:Z
        //   484: istore          29
        //   486: iload           29
        //   488: ifeq            514
        //   491: aload_0        
        //   492: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //   495: new             Lcom/whatsapp/or;
        //   498: dup            
        //   499: aload_0        
        //   500: invokespecial   com/whatsapp/or.<init>:(Lcom/whatsapp/Conversation;)V
        //   503: ldc2_w          500
        //   506: invokevirtual   android/widget/ListView.postDelayed:(Ljava/lang/Runnable;J)Z
        //   509: pop            
        //   510: iload_1        
        //   511: ifeq            540
        //   514: aload_0        
        //   515: getfield        com/whatsapp/Conversation.bd:Ljava/lang/String;
        //   518: ifnull          540
        //   521: aload_0        
        //   522: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //   525: new             Lcom/whatsapp/sl;
        //   528: dup            
        //   529: aload_0        
        //   530: invokespecial   com/whatsapp/sl.<init>:(Lcom/whatsapp/Conversation;)V
        //   533: ldc2_w          500
        //   536: invokevirtual   android/widget/ListView.postDelayed:(Ljava/lang/Runnable;J)Z
        //   539: pop            
        //   540: invokestatic    com/whatsapp/App.v:()Z
        //   543: ifeq            552
        //   546: aload_0        
        //   547: bipush          115
        //   549: invokevirtual   com/whatsapp/Conversation.showDialog:(I)V
        //   552: invokestatic    com/whatsapp/App.aq:()Z
        //   555: ifeq            563
        //   558: aload_0        
        //   559: invokevirtual   com/whatsapp/Conversation.b:()Z
        //   562: pop            
        //   563: invokestatic    com/whatsapp/Voip.d:()Z
        //   566: ifeq            573
        //   569: aload_0        
        //   570: invokespecial   com/whatsapp/Conversation.D:()V
        //   573: aload_2        
        //   574: invokevirtual   com/whatsapp/util/b0.c:()J
        //   577: pop2           
        //   578: return         
        //   579: astore_3       
        //   580: aload_3        
        //   581: athrow         
        //   582: astore          48
        //   584: aload           48
        //   586: athrow         
        //   587: astore          4
        //   589: aload           4
        //   591: athrow         
        //   592: astore          5
        //   594: aload           5
        //   596: athrow         
        //   597: astore          6
        //   599: aload           6
        //   601: athrow         
        //   602: astore          7
        //   604: aload           7
        //   606: athrow         
        //   607: astore          8
        //   609: aload           8
        //   611: athrow         
        //   612: astore          9
        //   614: aload           9
        //   616: athrow         
        //   617: astore          10
        //   619: aload           10
        //   621: athrow         
        //   622: astore          11
        //   624: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   627: sipush          162
        //   630: aaload         
        //   631: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   634: goto            246
        //   637: astore          12
        //   639: aload           12
        //   641: athrow         
        //   642: astore          13
        //   644: aload           13
        //   646: athrow         
        //   647: astore          14
        //   649: aload           14
        //   651: athrow         
        //   652: astore          40
        //   654: aload           40
        //   656: athrow         
        //   657: astore          16
        //   659: aload           16
        //   661: athrow         
        //   662: astore          17
        //   664: aload           17
        //   666: athrow         
        //   667: astore          18
        //   669: aload           18
        //   671: athrow         
        //   672: astore          19
        //   674: aload           19
        //   676: athrow         
        //   677: astore          22
        //   679: aload           22
        //   681: athrow         
        //   682: astore          23
        //   684: aload           23
        //   686: athrow         
        //   687: astore          26
        //   689: aload           26
        //   691: athrow         
        //   692: astore          27
        //   694: aload           27
        //   696: athrow         
        //   697: astore          28
        //   699: aload           28
        //   701: athrow         
        //   702: astore          30
        //   704: aload           30
        //   706: athrow         
        //   707: astore          31
        //   709: aload           31
        //   711: athrow         
        //   712: astore          32
        //   714: aload           32
        //   716: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  52     71     579    582    Ljava/lang/IllegalStateException;
        //  104    110    582    587    Ljava/lang/IllegalStateException;
        //  114    126    587    592    Ljava/lang/IllegalStateException;
        //  126    170    592    597    Ljava/lang/IllegalStateException;
        //  170    181    597    602    Ljava/lang/IllegalStateException;
        //  181    193    602    607    Ljava/lang/IllegalStateException;
        //  198    204    607    612    Ljava/lang/IllegalStateException;
        //  209    215    612    617    Ljava/lang/IllegalStateException;
        //  215    240    617    622    Ljava/lang/IllegalStateException;
        //  240    246    622    637    Ljava/lang/IllegalStateException;
        //  246    260    637    642    Ljava/lang/IllegalStateException;
        //  265    270    642    647    Ljava/lang/IllegalStateException;
        //  274    306    647    652    Ljava/lang/IllegalStateException;
        //  336    359    652    657    Ljava/lang/IllegalStateException;
        //  363    369    657    662    Ljava/lang/IllegalStateException;
        //  374    392    662    667    Ljava/lang/IllegalStateException;
        //  396    402    667    672    Ljava/lang/IllegalStateException;
        //  407    411    672    677    Ljava/lang/IllegalStateException;
        //  415    430    672    677    Ljava/lang/IllegalStateException;
        //  430    447    677    682    Ljava/lang/IllegalStateException;
        //  452    464    682    687    Ljava/lang/IllegalStateException;
        //  468    480    682    687    Ljava/lang/IllegalStateException;
        //  480    486    687    692    Ljava/lang/IllegalStateException;
        //  491    510    692    697    Ljava/lang/IllegalStateException;
        //  514    540    697    702    Ljava/lang/IllegalStateException;
        //  540    552    702    707    Ljava/lang/IllegalStateException;
        //  552    563    707    712    Ljava/lang/IllegalStateException;
        //  563    573    712    717    Ljava/lang/IllegalStateException;
        //  604    607    607    612    Ljava/lang/IllegalStateException;
        //  609    612    612    617    Ljava/lang/IllegalStateException;
        //  639    642    642    647    Ljava/lang/IllegalStateException;
        //  644    647    647    652    Ljava/lang/IllegalStateException;
        //  654    657    657    662    Ljava/lang/IllegalStateException;
        //  659    662    662    667    Ljava/lang/IllegalStateException;
        //  664    667    667    672    Ljava/lang/IllegalStateException;
        //  669    672    672    677    Ljava/lang/IllegalStateException;
        //  679    682    682    687    Ljava/lang/IllegalStateException;
        //  689    692    692    697    Ljava/lang/IllegalStateException;
        //  694    697    697    702    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 351, Size: 351
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
    protected void onSaveInstanceState(final Bundle bundle) {
        final boolean i = App.I;
        super.onSaveInstanceState(bundle);
        final ArrayList<d6> list = new ArrayList<d6>();
        if (this.aw != null) {
            final Iterator<bi> iterator = this.aw.values().iterator();
            while (iterator.hasNext()) {
                list.add(new d6(iterator.next().a));
                if (i) {
                    break;
                }
            }
            bundle.putParcelableArrayList(Conversation.cb[69], (ArrayList)list);
        }
    }
    
    public boolean onSearchRequested() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/Conversation.z:Landroid/support/v7/view/ActionMode;
        //     4: astore_2       
        //     5: aload_2        
        //     6: ifnull          14
        //     9: iconst_0       
        //    10: ireturn        
        //    11: astore_1       
        //    12: aload_1        
        //    13: athrow         
        //    14: aload_0        
        //    15: getfield        com/whatsapp/Conversation.aM:Landroid/support/v7/view/ActionMode;
        //    18: ifnull          28
        //    21: aload_0        
        //    22: getfield        com/whatsapp/Conversation.aM:Landroid/support/v7/view/ActionMode;
        //    25: invokevirtual   android/support/v7/view/ActionMode.finish:()V
        //    28: aload_0        
        //    29: getfield        com/whatsapp/Conversation.a9:Landroid/support/v7/view/ActionMode$Callback;
        //    32: ifnonnull       47
        //    35: aload_0        
        //    36: new             Lcom/whatsapp/fa;
        //    39: dup            
        //    40: aload_0        
        //    41: invokespecial   com/whatsapp/fa.<init>:(Lcom/whatsapp/Conversation;)V
        //    44: putfield        com/whatsapp/Conversation.a9:Landroid/support/v7/view/ActionMode$Callback;
        //    47: aload_0        
        //    48: getfield        com/whatsapp/Conversation.aO:Landroid/view/View;
        //    51: bipush          8
        //    53: invokevirtual   android/view/View.setVisibility:(I)V
        //    56: aload_0        
        //    57: aload_0        
        //    58: aload_0        
        //    59: getfield        com/whatsapp/Conversation.a9:Landroid/support/v7/view/ActionMode$Callback;
        //    62: invokevirtual   com/whatsapp/Conversation.startSupportActionMode:(Landroid/support/v7/view/ActionMode$Callback;)Landroid/support/v7/view/ActionMode;
        //    65: putfield        com/whatsapp/Conversation.z:Landroid/support/v7/view/ActionMode;
        //    68: aload_0        
        //    69: getfield        com/whatsapp/Conversation.aL:Landroid/view/inputmethod/InputMethodManager;
        //    72: iconst_0       
        //    73: iconst_0       
        //    74: invokevirtual   android/view/inputmethod/InputMethodManager.toggleSoftInput:(II)V
        //    77: iconst_0       
        //    78: ireturn        
        //    79: astore_3       
        //    80: aload_3        
        //    81: athrow         
        //    82: astore          4
        //    84: aload           4
        //    86: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      5      11     14     Landroid/content/ActivityNotFoundException;
        //  14     28     79     82     Landroid/content/ActivityNotFoundException;
        //  28     47     82     87     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0028:
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
    
    @Override
    protected void onStart() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: new             Lcom/whatsapp/util/b0;
        //     7: dup            
        //     8: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    11: bipush          56
        //    13: aaload         
        //    14: invokespecial   com/whatsapp/util/b0.<init>:(Ljava/lang/String;)V
        //    17: astore_2       
        //    18: aload_0        
        //    19: invokespecial   com/whatsapp/DialogToastListActivity.onStart:()V
        //    22: aload_0        
        //    23: getfield        com/whatsapp/Conversation.aT:Lcom/whatsapp/a_e;
        //    26: invokestatic    com/whatsapp/ade.a:(Lcom/whatsapp/a_e;)V
        //    29: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    32: bipush          57
        //    34: aaload         
        //    35: astore_3       
        //    36: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    39: aload_3        
        //    40: iconst_0       
        //    41: invokevirtual   com/whatsapp/App.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //    44: astore          4
        //    46: aload           4
        //    48: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    51: bipush          55
        //    53: aaload         
        //    54: ldc_w           "0"
        //    57: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    62: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    65: putstatic       com/whatsapp/preference/WaFontListPreference.b:I
        //    68: getstatic       com/whatsapp/Conversation.a_:Z
        //    71: ifeq            78
        //    74: aload_0        
        //    75: invokestatic    com/whatsapp/Conversation.y:(Lcom/whatsapp/Conversation;)V
        //    78: aload_0        
        //    79: getfield        com/whatsapp/Conversation.bc:Ljava/util/ArrayList;
        //    82: invokevirtual   java/util/ArrayList.clear:()V
        //    85: aload_0        
        //    86: getfield        com/whatsapp/Conversation.ag:Ljava/util/HashMap;
        //    89: invokevirtual   java/util/HashMap.clear:()V
        //    92: aload_0        
        //    93: invokevirtual   com/whatsapp/Conversation.getIntent:()Landroid/content/Intent;
        //    96: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    99: bipush          54
        //   101: aaload         
        //   102: lconst_0       
        //   103: invokevirtual   android/content/Intent.getLongExtra:(Ljava/lang/String;J)J
        //   106: lstore          6
        //   108: iconst_m1      
        //   109: istore          8
        //   111: lload           6
        //   113: lconst_0       
        //   114: lcmp           
        //   115: ifle            243
        //   118: aload_0        
        //   119: invokevirtual   com/whatsapp/Conversation.getIntent:()Landroid/content/Intent;
        //   122: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   125: bipush          51
        //   127: aaload         
        //   128: iconst_0       
        //   129: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //   132: pop            
        //   133: aload_0        
        //   134: aload_0        
        //   135: invokevirtual   com/whatsapp/Conversation.getIntent:()Landroid/content/Intent;
        //   138: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   141: bipush          58
        //   143: aaload         
        //   144: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   147: putfield        com/whatsapp/Conversation.a8:Ljava/lang/String;
        //   150: aload_0        
        //   151: aload_0        
        //   152: getfield        com/whatsapp/Conversation.a8:Ljava/lang/String;
        //   155: invokestatic    com/whatsapp/vy.E:(Ljava/lang/String;)Ljava/util/ArrayList;
        //   158: putfield        com/whatsapp/Conversation.U:Ljava/util/ArrayList;
        //   161: aload_0        
        //   162: aload_0        
        //   163: getfield        com/whatsapp/Conversation.a8:Ljava/lang/String;
        //   166: putfield        com/whatsapp/Conversation.t:Ljava/lang/String;
        //   169: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   172: aload_0        
        //   173: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //   176: lload           6
        //   178: aload_0        
        //   179: iconst_0       
        //   180: invokespecial   com/whatsapp/Conversation.c:(Z)I
        //   183: aload_0        
        //   184: getfield        com/whatsapp/Conversation.ai:Lcom/whatsapp/s0;
        //   187: invokevirtual   com/whatsapp/vy.a:(Ljava/lang/String;JILcom/whatsapp/s0;)Lcom/whatsapp/ad8;
        //   190: astore          71
        //   192: aload           71
        //   194: getfield        com/whatsapp/ad8.b:Landroid/database/Cursor;
        //   197: ifnonnull       225
        //   200: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   203: aload_0        
        //   204: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //   207: aload_0        
        //   208: iconst_0       
        //   209: invokespecial   com/whatsapp/Conversation.c:(Z)I
        //   212: aload_0        
        //   213: getfield        com/whatsapp/Conversation.ai:Lcom/whatsapp/s0;
        //   216: invokevirtual   com/whatsapp/vy.a:(Ljava/lang/String;ILcom/whatsapp/s0;)Landroid/database/Cursor;
        //   219: astore          72
        //   221: iload_1        
        //   222: ifeq            232
        //   225: aload           71
        //   227: getfield        com/whatsapp/ad8.b:Landroid/database/Cursor;
        //   230: astore          72
        //   232: aload           71
        //   234: getfield        com/whatsapp/ad8.a:I
        //   237: istore          8
        //   239: iload_1        
        //   240: ifeq            1119
        //   243: aload_0        
        //   244: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //   247: invokevirtual   com/whatsapp/nm.getCursor:()Landroid/database/Cursor;
        //   250: astore          10
        //   252: aload           10
        //   254: ifnonnull       969
        //   257: iconst_1       
        //   258: istore          11
        //   260: iload           11
        //   262: ifeq            305
        //   265: aload_0        
        //   266: getfield        com/whatsapp/Conversation.G:I
        //   269: istore          67
        //   271: iload           67
        //   273: bipush          90
        //   275: if_icmple       305
        //   278: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   281: aload_0        
        //   282: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //   285: bipush          10
        //   287: aload_0        
        //   288: getfield        com/whatsapp/Conversation.G:I
        //   291: iadd           
        //   292: aload_0        
        //   293: getfield        com/whatsapp/Conversation.ai:Lcom/whatsapp/s0;
        //   296: invokevirtual   com/whatsapp/vy.a:(Ljava/lang/String;ILcom/whatsapp/s0;)Landroid/database/Cursor;
        //   299: astore          68
        //   301: iload_1        
        //   302: ifeq            1100
        //   305: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   308: aload_0        
        //   309: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //   312: aload_0        
        //   313: iconst_0       
        //   314: invokespecial   com/whatsapp/Conversation.c:(Z)I
        //   317: aload_0        
        //   318: getfield        com/whatsapp/Conversation.ai:Lcom/whatsapp/s0;
        //   321: invokevirtual   com/whatsapp/vy.a:(Ljava/lang/String;ILcom/whatsapp/s0;)Landroid/database/Cursor;
        //   324: astore          12
        //   326: iload           8
        //   328: istore          13
        //   330: aload           12
        //   332: astore          14
        //   334: iload           11
        //   336: istore          15
        //   338: iload           13
        //   340: istore          16
        //   342: aload_0        
        //   343: aload           14
        //   345: invokespecial   com/whatsapp/Conversation.a:(Landroid/database/Cursor;)V
        //   348: aload_0        
        //   349: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //   352: aload           14
        //   354: invokevirtual   com/whatsapp/nm.changeCursor:(Landroid/database/Cursor;)V
        //   357: iload           15
        //   359: ifeq            940
        //   362: aload_0        
        //   363: getfield        com/whatsapp/Conversation.aG:Z
        //   366: istore          29
        //   368: iload           29
        //   370: ifeq            443
        //   373: aload_0        
        //   374: getfield        com/whatsapp/Conversation.G:I
        //   377: istore          62
        //   379: aload_0        
        //   380: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //   383: invokevirtual   com/whatsapp/nm.getCursor:()Landroid/database/Cursor;
        //   386: invokeinterface android/database/Cursor.getCount:()I
        //   391: istore          63
        //   393: iload           62
        //   395: iload           63
        //   397: if_icmpeq       443
        //   400: aload_0        
        //   401: invokespecial   com/whatsapp/Conversation.J:()Z
        //   404: istore          64
        //   406: iload           64
        //   408: ifne            443
        //   411: aload_0        
        //   412: aload_0        
        //   413: getfield        com/whatsapp/Conversation.G:I
        //   416: putfield        com/whatsapp/Conversation.av:I
        //   419: aload_0        
        //   420: getfield        com/whatsapp/Conversation.av:I
        //   423: istore          65
        //   425: iload           65
        //   427: ifle            521
        //   430: aload_0        
        //   431: invokespecial   com/whatsapp/Conversation.l:()V
        //   434: aload_0        
        //   435: iconst_1       
        //   436: putfield        com/whatsapp/Conversation.bj:Z
        //   439: iload_1        
        //   440: ifeq            521
        //   443: aload_0        
        //   444: getfield        com/whatsapp/Conversation.G:I
        //   447: istore          30
        //   449: aload_0        
        //   450: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //   453: invokevirtual   com/whatsapp/nm.getCursor:()Landroid/database/Cursor;
        //   456: invokeinterface android/database/Cursor.getCount:()I
        //   461: istore          31
        //   463: iload           30
        //   465: iload           31
        //   467: if_icmpne       521
        //   470: aload_0        
        //   471: getfield        com/whatsapp/Conversation.G:I
        //   474: bipush          100
        //   476: if_icmple       516
        //   479: aload_0        
        //   480: aload_0        
        //   481: getfield        com/whatsapp/Conversation.G:I
        //   484: putfield        com/whatsapp/Conversation.as:I
        //   487: new             Ljava/lang/StringBuilder;
        //   490: dup            
        //   491: invokespecial   java/lang/StringBuilder.<init>:()V
        //   494: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   497: bipush          52
        //   499: aaload         
        //   500: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   503: aload_0        
        //   504: getfield        com/whatsapp/Conversation.as:I
        //   507: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   510: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   513: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   516: aload_0        
        //   517: iconst_1       
        //   518: putfield        com/whatsapp/Conversation.bg:Z
        //   521: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   524: aload_0        
        //   525: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //   528: invokevirtual   com/whatsapp/vy.x:(Ljava/lang/String;)Z
        //   531: ifne            574
        //   534: aload_0        
        //   535: getfield        com/whatsapp/Conversation.aN:Landroid/view/View;
        //   538: ifnull          574
        //   541: aload_0        
        //   542: getfield        com/whatsapp/Conversation.aN:Landroid/view/View;
        //   545: bipush          8
        //   547: invokevirtual   android/view/View.setVisibility:(I)V
        //   550: aload_0        
        //   551: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //   554: aload_0        
        //   555: getfield        com/whatsapp/Conversation.aN:Landroid/view/View;
        //   558: invokevirtual   android/widget/ListView.removeHeaderView:(Landroid/view/View;)Z
        //   561: pop            
        //   562: aload_0        
        //   563: aconst_null    
        //   564: putfield        com/whatsapp/Conversation.aN:Landroid/view/View;
        //   567: aload_0        
        //   568: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //   571: invokevirtual   com/whatsapp/nm.notifyDataSetChanged:()V
        //   574: aload_0        
        //   575: getfield        com/whatsapp/Conversation.aN:Landroid/view/View;
        //   578: astore          38
        //   580: aload           38
        //   582: ifnonnull       643
        //   585: aload_0        
        //   586: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   589: invokevirtual   com/whatsapp/a_9.m:()Z
        //   592: istore          56
        //   594: iload           56
        //   596: ifne            643
        //   599: aload_0        
        //   600: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   603: invokevirtual   com/whatsapp/a_9.k:()Z
        //   606: istore          57
        //   608: iload           57
        //   610: ifne            643
        //   613: aload_0        
        //   614: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   617: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //   620: astore          58
        //   622: aload           58
        //   624: ifnonnull       643
        //   627: aload_0        
        //   628: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //   631: invokevirtual   com/whatsapp/nm.getCount:()I
        //   634: istore          59
        //   636: iload           59
        //   638: bipush          100
        //   640: if_icmplt       688
        //   643: aload_0        
        //   644: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //   647: aload_0        
        //   648: getfield        com/whatsapp/Conversation.aa:Landroid/view/View;
        //   651: invokevirtual   android/widget/ListView.removeHeaderView:(Landroid/view/View;)Z
        //   654: pop            
        //   655: aload_0        
        //   656: aconst_null    
        //   657: putfield        com/whatsapp/Conversation.aa:Landroid/view/View;
        //   660: aload_0        
        //   661: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //   664: aload_0        
        //   665: getfield        com/whatsapp/Conversation.aF:Landroid/view/View;
        //   668: invokevirtual   android/widget/ListView.removeFooterView:(Landroid/view/View;)Z
        //   671: pop            
        //   672: aload_0        
        //   673: aconst_null    
        //   674: putfield        com/whatsapp/Conversation.aF:Landroid/view/View;
        //   677: aload_0        
        //   678: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //   681: invokevirtual   com/whatsapp/nm.notifyDataSetChanged:()V
        //   684: iload_1        
        //   685: ifeq            692
        //   688: aload_0        
        //   689: invokespecial   com/whatsapp/Conversation.n:()V
        //   692: iload           16
        //   694: iflt            753
        //   697: aload_0        
        //   698: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //   701: iload           16
        //   703: invokevirtual   android/widget/ListView.setSelection:(I)V
        //   706: aload_0        
        //   707: iconst_0       
        //   708: putfield        com/whatsapp/Conversation.bj:Z
        //   711: aload_0        
        //   712: iconst_0       
        //   713: putfield        com/whatsapp/Conversation.bg:Z
        //   716: aload_0        
        //   717: iconst_0       
        //   718: putfield        com/whatsapp/Conversation.D:Z
        //   721: aload_0        
        //   722: iload           16
        //   724: aload_0        
        //   725: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //   728: invokevirtual   android/widget/ListView.getHeaderViewsCount:()I
        //   731: iadd           
        //   732: putfield        com/whatsapp/Conversation.bh:I
        //   735: aload_0        
        //   736: aload_0        
        //   737: invokevirtual   com/whatsapp/Conversation.getResources:()Landroid/content/res/Resources;
        //   740: ldc_w           2131361793
        //   743: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   746: putfield        com/whatsapp/Conversation.w:I
        //   749: iload_1        
        //   750: ifeq            805
        //   753: aload_0        
        //   754: getfield        com/whatsapp/Conversation.bj:Z
        //   757: istore          44
        //   759: iload           44
        //   761: ifeq            782
        //   764: aload_0        
        //   765: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //   768: aload_0        
        //   769: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //   772: invokestatic    com/whatsapp/nm.a:(Lcom/whatsapp/nm;)I
        //   775: invokevirtual   android/widget/ListView.setSelection:(I)V
        //   778: iload_1        
        //   779: ifeq            805
        //   782: aload_0        
        //   783: getfield        com/whatsapp/Conversation.bg:Z
        //   786: ifne            805
        //   789: aload_0        
        //   790: getfield        com/whatsapp/Conversation.aI:Landroid/widget/ListView;
        //   793: iconst_m1      
        //   794: aload_0        
        //   795: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //   798: invokevirtual   com/whatsapp/nm.getCount:()I
        //   801: iadd           
        //   802: invokevirtual   android/widget/ListView.setSelection:(I)V
        //   805: aload_0        
        //   806: invokevirtual   com/whatsapp/Conversation.getIntent:()Landroid/content/Intent;
        //   809: astore          45
        //   811: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   814: bipush          53
        //   816: aaload         
        //   817: aload           45
        //   819: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //   822: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   825: istore          48
        //   827: iload           48
        //   829: ifeq            936
        //   832: aload_0        
        //   833: getfield        com/whatsapp/Conversation.B:Z
        //   836: ifne            936
        //   839: aload_0        
        //   840: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //   843: invokevirtual   com/whatsapp/nm.getCount:()I
        //   846: istore          49
        //   848: iload           49
        //   850: ifle            936
        //   853: aload           45
        //   855: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //   858: bipush          59
        //   860: aaload         
        //   861: invokevirtual   android/content/Intent.getParcelableExtra:(Ljava/lang/String;)Landroid/os/Parcelable;
        //   864: checkcast       Lcom/whatsapp/d6;
        //   867: astore          50
        //   869: aload           50
        //   871: ifnull          936
        //   874: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   877: aload           50
        //   879: getfield        com/whatsapp/d6.a:Lcom/whatsapp/protocol/c6;
        //   882: invokevirtual   com/whatsapp/vy.a:(Lcom/whatsapp/protocol/c6;)Lcom/whatsapp/protocol/bi;
        //   885: astore          51
        //   887: aload           51
        //   889: ifnull          936
        //   892: aload           51
        //   894: getfield        com/whatsapp/protocol/bi.I:B
        //   897: istore          54
        //   899: iload           54
        //   901: iconst_2       
        //   902: if_icmpne       918
        //   905: aload_0        
        //   906: aload           51
        //   908: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   911: putfield        com/whatsapp/Conversation.R:Lcom/whatsapp/protocol/c6;
        //   914: iload_1        
        //   915: ifeq            936
        //   918: aload_0        
        //   919: aload           51
        //   921: aload           51
        //   923: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   926: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   929: aload_0        
        //   930: invokestatic    com/whatsapp/MediaView.a:(Lcom/whatsapp/protocol/bi;Ljava/lang/String;Landroid/content/Context;)Landroid/content/Intent;
        //   933: invokevirtual   com/whatsapp/Conversation.startActivity:(Landroid/content/Intent;)V
        //   936: iload_1        
        //   937: ifeq            953
        //   940: aload_0        
        //   941: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //   944: invokevirtual   com/whatsapp/nm.getCursor:()Landroid/database/Cursor;
        //   947: invokeinterface android/database/Cursor.requery:()Z
        //   952: pop            
        //   953: aload_2        
        //   954: invokevirtual   com/whatsapp/util/b0.c:()J
        //   957: pop2           
        //   958: return         
        //   959: astore          5
        //   961: aload           5
        //   963: athrow         
        //   964: astore          9
        //   966: aload           9
        //   968: athrow         
        //   969: iconst_0       
        //   970: istore          11
        //   972: goto            260
        //   975: astore          66
        //   977: aload           66
        //   979: athrow         
        //   980: astore          17
        //   982: aload           17
        //   984: athrow         
        //   985: astore          18
        //   987: aload           18
        //   989: athrow         
        //   990: astore          19
        //   992: aload           19
        //   994: athrow         
        //   995: astore          20
        //   997: aload           20
        //   999: athrow         
        //  1000: astore          21
        //  1002: aload           21
        //  1004: athrow         
        //  1005: astore          22
        //  1007: aload           22
        //  1009: athrow         
        //  1010: astore          23
        //  1012: aload           23
        //  1014: athrow         
        //  1015: astore          24
        //  1017: aload           24
        //  1019: athrow         
        //  1020: astore          60
        //  1022: aload           60
        //  1024: athrow         
        //  1025: astore          32
        //  1027: aload           32
        //  1029: athrow         
        //  1030: astore          33
        //  1032: aload           33
        //  1034: athrow         
        //  1035: astore          34
        //  1037: aload           34
        //  1039: athrow         
        //  1040: astore          35
        //  1042: aload           35
        //  1044: athrow         
        //  1045: astore          36
        //  1047: aload           36
        //  1049: athrow         
        //  1050: astore          37
        //  1052: aload           37
        //  1054: athrow         
        //  1055: astore          55
        //  1057: aload           55
        //  1059: athrow         
        //  1060: astore          41
        //  1062: aload           41
        //  1064: athrow         
        //  1065: astore          42
        //  1067: aload           42
        //  1069: athrow         
        //  1070: astore          43
        //  1072: aload           43
        //  1074: athrow         
        //  1075: astore          46
        //  1077: aload           46
        //  1079: athrow         
        //  1080: astore          47
        //  1082: aload           47
        //  1084: athrow         
        //  1085: astore          52
        //  1087: aload           52
        //  1089: athrow         
        //  1090: astore          53
        //  1092: aload           53
        //  1094: athrow         
        //  1095: astore          25
        //  1097: aload           25
        //  1099: athrow         
        //  1100: iload           8
        //  1102: istore          69
        //  1104: aload           68
        //  1106: astore          14
        //  1108: iload           11
        //  1110: istore          15
        //  1112: iload           69
        //  1114: istore          16
        //  1116: goto            342
        //  1119: iconst_1       
        //  1120: istore          15
        //  1122: aload           72
        //  1124: astore          73
        //  1126: iload           8
        //  1128: istore          16
        //  1130: aload           73
        //  1132: astore          14
        //  1134: goto            342
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  46     78     959    964    Landroid/content/ActivityNotFoundException;
        //  243    252    964    969    Landroid/content/ActivityNotFoundException;
        //  265    271    975    980    Landroid/content/ActivityNotFoundException;
        //  342    357    980    985    Landroid/content/ActivityNotFoundException;
        //  362    368    985    990    Landroid/content/ActivityNotFoundException;
        //  373    393    990    995    Landroid/content/ActivityNotFoundException;
        //  400    406    995    1000   Landroid/content/ActivityNotFoundException;
        //  411    425    1000   1005   Landroid/content/ActivityNotFoundException;
        //  430    439    1005   1010   Landroid/content/ActivityNotFoundException;
        //  443    463    1010   1015   Landroid/content/ActivityNotFoundException;
        //  470    516    1015   1020   Landroid/content/ActivityNotFoundException;
        //  534    574    1020   1025   Landroid/content/ActivityNotFoundException;
        //  574    580    1025   1030   Landroid/content/ActivityNotFoundException;
        //  585    594    1030   1035   Landroid/content/ActivityNotFoundException;
        //  599    608    1035   1040   Landroid/content/ActivityNotFoundException;
        //  613    622    1040   1045   Landroid/content/ActivityNotFoundException;
        //  627    636    1045   1050   Landroid/content/ActivityNotFoundException;
        //  643    684    1050   1055   Landroid/content/ActivityNotFoundException;
        //  688    692    1050   1055   Landroid/content/ActivityNotFoundException;
        //  697    749    1055   1060   Landroid/content/ActivityNotFoundException;
        //  753    759    1060   1065   Landroid/content/ActivityNotFoundException;
        //  764    778    1065   1070   Landroid/content/ActivityNotFoundException;
        //  782    805    1070   1075   Landroid/content/ActivityNotFoundException;
        //  811    827    1075   1080   Landroid/content/ActivityNotFoundException;
        //  832    848    1080   1085   Landroid/content/ActivityNotFoundException;
        //  892    899    1085   1090   Landroid/content/ActivityNotFoundException;
        //  905    914    1090   1095   Landroid/content/ActivityNotFoundException;
        //  918    936    1090   1095   Landroid/content/ActivityNotFoundException;
        //  940    953    1095   1100   Landroid/content/ActivityNotFoundException;
        //  982    985    985    990    Landroid/content/ActivityNotFoundException;
        //  987    990    990    995    Landroid/content/ActivityNotFoundException;
        //  992    995    995    1000   Landroid/content/ActivityNotFoundException;
        //  997    1000   1000   1005   Landroid/content/ActivityNotFoundException;
        //  1002   1005   1005   1010   Landroid/content/ActivityNotFoundException;
        //  1007   1010   1010   1015   Landroid/content/ActivityNotFoundException;
        //  1012   1015   1015   1020   Landroid/content/ActivityNotFoundException;
        //  1027   1030   1030   1035   Landroid/content/ActivityNotFoundException;
        //  1032   1035   1035   1040   Landroid/content/ActivityNotFoundException;
        //  1037   1040   1040   1045   Landroid/content/ActivityNotFoundException;
        //  1042   1045   1045   1050   Landroid/content/ActivityNotFoundException;
        //  1047   1050   1050   1055   Landroid/content/ActivityNotFoundException;
        //  1057   1060   1060   1065   Landroid/content/ActivityNotFoundException;
        //  1062   1065   1065   1070   Landroid/content/ActivityNotFoundException;
        //  1067   1070   1070   1075   Landroid/content/ActivityNotFoundException;
        //  1077   1080   1080   1085   Landroid/content/ActivityNotFoundException;
        //  1087   1090   1090   1095   Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 544, Size: 544
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
    protected void onStop() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   com/whatsapp/DialogToastListActivity.onStop:()V
        //     4: aload_0        
        //     5: getfield        com/whatsapp/Conversation.aT:Lcom/whatsapp/a_e;
        //     8: invokestatic    com/whatsapp/ade.b:(Lcom/whatsapp/a_e;)V
        //    11: getstatic       com/whatsapp/Conversation.a_:Z
        //    14: ifeq            21
        //    17: aload_0        
        //    18: invokestatic    com/whatsapp/Conversation.ah:(Lcom/whatsapp/Conversation;)V
        //    21: new             Ljava/lang/StringBuilder;
        //    24: dup            
        //    25: invokespecial   java/lang/StringBuilder.<init>:()V
        //    28: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    31: sipush          161
        //    34: aaload         
        //    35: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    38: invokestatic    android/database/sqlite/SQLiteDatabase.releaseMemory:()I
        //    41: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    44: getstatic       com/whatsapp/Conversation.cb:[Ljava/lang/String;
        //    47: sipush          160
        //    50: aaload         
        //    51: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    54: aload_0        
        //    55: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //    58: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    61: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    64: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    67: aload_0        
        //    68: getfield        com/whatsapp/Conversation.aA:Landroid/database/Cursor;
        //    71: ifnull          83
        //    74: aload_0        
        //    75: getfield        com/whatsapp/Conversation.aA:Landroid/database/Cursor;
        //    78: invokeinterface android/database/Cursor.deactivate:()V
        //    83: return         
        //    84: astore_1       
        //    85: aload_1        
        //    86: athrow         
        //    87: astore_2       
        //    88: aload_2        
        //    89: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      21     84     87     Landroid/content/ActivityNotFoundException;
        //  21     83     87     90     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0021:
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
    
    @Override
    public void onSupportActionModeFinished(final ActionMode actionMode) {
        super.onSupportActionModeFinished(actionMode);
        final Toolbar toolbar = (Toolbar)this.findViewById(2131755371);
        try {
            toolbar.setVisibility(0);
            if (Build$VERSION.SDK_INT >= 21) {
                this.getWindow().setStatusBarColor(this.getResources().getColor(2131624026));
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    @Override
    public void onSupportActionModeStarted(final ActionMode actionMode) {
        super.onSupportActionModeStarted(actionMode);
        final Toolbar toolbar = (Toolbar)this.findViewById(2131755371);
        try {
            toolbar.setVisibility(4);
            if (Build$VERSION.SDK_INT >= 21) {
                this.getWindow().setStatusBarColor(this.getResources().getColor(2131623946));
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    public ArrayList x() {
        return this.U;
    }
}
