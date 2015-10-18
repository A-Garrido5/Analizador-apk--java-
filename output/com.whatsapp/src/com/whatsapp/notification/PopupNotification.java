// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import com.whatsapp.App;
import android.content.DialogInterface$OnClickListener;
import android.support.v7.app.AlertDialog$Builder;
import com.whatsapp.ade;
import com.whatsapp.yt;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.up;
import android.view.MotionEvent;
import java.util.Collection;
import com.whatsapp.util.Log;
import com.whatsapp.util.b8;
import com.whatsapp.util.b;
import android.widget.ImageView$ScaleType;
import com.whatsapp.ThumbnailButton;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.ConversationRow;
import com.whatsapp.util.cq;
import com.whatsapp.ConversationRowDivider;
import android.content.Context;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.vc;
import com.whatsapp.protocol.bi;
import android.hardware.Sensor;
import java.util.ArrayList;
import com.whatsapp.eu;
import com.whatsapp.a_9;
import android.widget.Button;
import com.whatsapp.n7;
import com.whatsapp.ConversationTextEntry;
import android.hardware.SensorEventListener;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.view.View;
import android.os.Handler;
import android.hardware.SensorManager;
import com.whatsapp.ps;
import java.util.HashSet;
import android.os.PowerManager$WakeLock;
import android.widget.ImageButton;
import com.whatsapp.GalleryView;
import com.whatsapp.aws;
import android.app.Activity;

public class PopupNotification extends Activity implements aws
{
    public static boolean A;
    private static int M;
    public static PopupNotification s;
    private static final String[] z;
    private GalleryView B;
    private float C;
    private ImageButton D;
    private PowerManager$WakeLock E;
    private HashSet F;
    private Runnable G;
    private ps H;
    private SensorManager I;
    private HashSet J;
    private ImageButton K;
    private Handler L;
    private HashSet a;
    private View b;
    private boolean c;
    private TextView d;
    private View$OnClickListener e;
    private Handler f;
    private Runnable g;
    private SensorEventListener h;
    private ConversationTextEntry i;
    private n7 j;
    private Button k;
    private a_9 l;
    private View m;
    private String n;
    private eu o;
    private ArrayList p;
    private Sensor q;
    private View r;
    private TextView t;
    private bi u;
    private HashSet v;
    private View w;
    private vc x;
    private TextView y;
    
    static {
        final String[] z2 = new String[30];
        String s = "\u0010t\u001eUOIs\u0003\u001f";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0782:
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
                        c2 = ',';
                        break;
                    }
                    case 1: {
                        c2 = '\u0015';
                        break;
                    }
                    case 2: {
                        c2 = '>';
                        break;
                    }
                    case 3: {
                        c2 = '=';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "DaJMN\u0016:\u0011P\\\\f\u0010ZRCrRX\u0013OzS\u0012PMeM\u0002L\u0011";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0010:_\u0003";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u000e+";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "\nfRQ\u0000";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "pf\u0015";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "@tGRHXJWS[@tJXO";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\\zNHMBzJT[Ev_ITC{\u0011M\\Yf[";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\\zNHMBzJT[Ev_ITC{\u0011NXBq[SI^l\u0011XP\\aG\u001dIImJ\u001d";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\\zNHMBzJT[Ev_ITC{\u0011NXBq[SI^l\u0011\u001dNOg[XSseQN\u0007";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\fx[NNMr[bMCf\u0004";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\fx[NNMr[N\u0013_|DX\u0007";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "E{NHIsx[IUCq";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "_pPNR^";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\\zIXO";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\\zNHMBzJT[Ev_ITC{\u0011^OItJX";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "\\zNHMBzJT[Ev_ITC{";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "\\zNHMBzJT[Ev_ITC{\u0011J\\GpKMTJ{[XYIq";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\\zNHMBzJT[Ev_ITC{\u0011YX_aLRD";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "@tGRHXJWS[@tJXO";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "\\zNHMBzJT[Ev_ITC{\u0011^QItLSRX|XT^MaWRS_/";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    s = "\\zNHMBzJT[Ev_ITC{\u0011PNK/";
                    n = 20;
                    n2 = 21;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    array = z2;
                    s = "\\zNHMBzJT[Ev_ITC{\u0011TSEaNRMYe";
                    n = 21;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "\\zNHMBzJT[Ev_ITC{\u0011^RY{J\u0007";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "\\zNHMBzJT[Ev_ITC{\u0011NICe";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "\\zNHMBzJT[Ev_ITC{\u0011J\\GpKM";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "\\zNHMBzJT[Ev_ITC{\u0011YTMyQZ\u0010_zXIJMg[\u0010\\NzKI\u0010Xz\u0013XE\\|LX";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "\\zNHMBzJT[Ev_ITC{\u0011^RBa_^I\u0001aVHPN:\\\\NI#\n\u0010YIvQYX\u0003pLOR^";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "\\zNHMBzJT[Ev_ITC{\u0011NIMgJ";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "\\zNHMBzJT[Ev_ITC{\u0011OX_`SX";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    break Label_0782;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        PopupNotification.M = 200;
        PopupNotification.s = null;
    }
    
    public PopupNotification() {
        final boolean a = PopupNotification.A;
        this.c = false;
        this.p = new ArrayList();
        this.v = new HashSet();
        this.J = new HashSet();
        this.F = new HashSet();
        this.a = new HashSet();
        this.E = null;
        this.o = new v(this);
        this.C = 5.0f;
        this.L = new Handler();
        this.G = new a6(this);
        this.f = new Handler();
        this.g = new a(this);
        this.n = null;
        if (DialogToastActivity.h) {
            boolean a2 = false;
            if (!a) {
                a2 = true;
            }
            PopupNotification.A = a2;
        }
    }
    
    static float a(final PopupNotification popupNotification) {
        return popupNotification.C;
    }
    
    static float a(final PopupNotification popupNotification, final float c) {
        return popupNotification.C = c;
    }
    
    static int a(final PopupNotification popupNotification, final int n) {
        return popupNotification.c(n);
    }
    
    static SensorEventListener a(final PopupNotification popupNotification, final SensorEventListener h) {
        return popupNotification.h = h;
    }
    
    private View a(final bi p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Landroid/widget/TextView;
        //     3: dup            
        //     4: aload_0        
        //     5: invokespecial   android/widget/TextView.<init>:(Landroid/content/Context;)V
        //     8: astore_2       
        //     9: aload_2        
        //    10: aload_1        
        //    11: getfield        com/whatsapp/protocol/bi.k:Ljava/lang/String;
        //    14: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    17: aload_2        
        //    18: aload_0        
        //    19: invokevirtual   com/whatsapp/notification/PopupNotification.getResources:()Landroid/content/res/Resources;
        //    22: invokestatic    com/whatsapp/ConversationRow.b:(Landroid/content/res/Resources;)F
        //    25: invokevirtual   android/widget/TextView.setTextSize:(F)V
        //    28: aload_2        
        //    29: bipush          17
        //    31: invokevirtual   android/widget/TextView.setGravity:(I)V
        //    34: aload_2        
        //    35: ldc_w           -16777216
        //    38: invokevirtual   android/widget/TextView.setTextColor:(I)V
        //    41: aload_1        
        //    42: invokevirtual   com/whatsapp/protocol/bi.c:()Ljava/lang/String;
        //    45: invokestatic    o.h:(Ljava/lang/String;)Lo;
        //    48: astore          19
        //    50: aload           19
        //    52: astore          4
        //    54: aconst_null    
        //    55: astore          5
        //    57: aload           4
        //    59: ifnull          119
        //    62: aload           4
        //    64: getfield        o.i:[B
        //    67: astore          12
        //    69: aconst_null    
        //    70: astore          5
        //    72: aload           12
        //    74: ifnull          119
        //    77: aload           4
        //    79: getfield        o.i:[B
        //    82: arraylength    
        //    83: istore          13
        //    85: aconst_null    
        //    86: astore          5
        //    88: iload           13
        //    90: ifle            119
        //    93: aload           4
        //    95: getfield        o.i:[B
        //    98: iconst_0       
        //    99: invokestatic    android/backport/util/Base64.decode:([BI)[B
        //   102: astore          15
        //   104: aload           15
        //   106: iconst_0       
        //   107: aload           15
        //   109: arraylength    
        //   110: invokestatic    android/graphics/BitmapFactory.decodeByteArray:([BII)Landroid/graphics/Bitmap;
        //   113: astore          16
        //   115: aload           16
        //   117: astore          5
        //   119: aload_0        
        //   120: invokevirtual   com/whatsapp/notification/PopupNotification.getResources:()Landroid/content/res/Resources;
        //   123: ldc_w           2130839076
        //   126: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   129: astore          6
        //   131: aload           5
        //   133: ifnull          181
        //   136: aload           5
        //   138: aload           6
        //   140: invokevirtual   android/graphics/drawable/Drawable.getIntrinsicWidth:()I
        //   143: aload_0        
        //   144: getfield        com/whatsapp/notification/PopupNotification.x:Lcom/whatsapp/vc;
        //   147: getfield        com/whatsapp/vc.e:F
        //   150: invokestatic    com/whatsapp/util/br.a:(Landroid/graphics/Bitmap;IF)Landroid/graphics/Bitmap;
        //   153: astore          9
        //   155: aload_2        
        //   156: new             Landroid/graphics/drawable/BitmapDrawable;
        //   159: dup            
        //   160: aload_0        
        //   161: invokevirtual   com/whatsapp/notification/PopupNotification.getResources:()Landroid/content/res/Resources;
        //   164: aload           9
        //   166: invokespecial   android/graphics/drawable/BitmapDrawable.<init>:(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
        //   169: aconst_null    
        //   170: aconst_null    
        //   171: aconst_null    
        //   172: invokevirtual   android/widget/TextView.setCompoundDrawablesWithIntrinsicBounds:(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
        //   175: getstatic       com/whatsapp/notification/PopupNotification.A:Z
        //   178: ifeq            190
        //   181: aload_2        
        //   182: aload           6
        //   184: aconst_null    
        //   185: aconst_null    
        //   186: aconst_null    
        //   187: invokevirtual   android/widget/TextView.setCompoundDrawablesWithIntrinsicBounds:(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
        //   190: aload_2        
        //   191: aload_0        
        //   192: getfield        com/whatsapp/notification/PopupNotification.x:Lcom/whatsapp/vc;
        //   195: getfield        com/whatsapp/vc.t:F
        //   198: f2i            
        //   199: invokevirtual   android/widget/TextView.setCompoundDrawablePadding:(I)V
        //   202: aload_2        
        //   203: aload_0        
        //   204: getfield        com/whatsapp/notification/PopupNotification.x:Lcom/whatsapp/vc;
        //   207: getfield        com/whatsapp/vc.t:F
        //   210: f2i            
        //   211: aload_0        
        //   212: getfield        com/whatsapp/notification/PopupNotification.x:Lcom/whatsapp/vc;
        //   215: getfield        com/whatsapp/vc.t:F
        //   218: f2i            
        //   219: aload_0        
        //   220: getfield        com/whatsapp/notification/PopupNotification.x:Lcom/whatsapp/vc;
        //   223: getfield        com/whatsapp/vc.t:F
        //   226: f2i            
        //   227: aload_0        
        //   228: getfield        com/whatsapp/notification/PopupNotification.x:Lcom/whatsapp/vc;
        //   231: getfield        com/whatsapp/vc.t:F
        //   234: f2i            
        //   235: invokevirtual   android/widget/TextView.setPadding:(IIII)V
        //   238: new             Landroid/widget/RelativeLayout;
        //   241: dup            
        //   242: aload_0        
        //   243: invokespecial   android/widget/RelativeLayout.<init>:(Landroid/content/Context;)V
        //   246: astore          8
        //   248: aload           8
        //   250: bipush          17
        //   252: invokevirtual   android/widget/RelativeLayout.setGravity:(I)V
        //   255: aload           8
        //   257: aload_2        
        //   258: invokevirtual   android/widget/RelativeLayout.addView:(Landroid/view/View;)V
        //   261: aload           8
        //   263: areturn        
        //   264: astore          18
        //   266: aload           18
        //   268: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/Throwable;)V
        //   271: aconst_null    
        //   272: astore          4
        //   274: goto            54
        //   277: astore          17
        //   279: aload           17
        //   281: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   284: aconst_null    
        //   285: astore          4
        //   287: goto            54
        //   290: astore_3       
        //   291: aload_3        
        //   292: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/Throwable;)V
        //   295: aconst_null    
        //   296: astore          4
        //   298: goto            54
        //   301: astore          10
        //   303: aload           10
        //   305: athrow         
        //   306: astore          11
        //   308: aload           11
        //   310: athrow         
        //   311: astore          14
        //   313: getstatic       com/whatsapp/notification/PopupNotification.z:[Ljava/lang/String;
        //   316: bipush          27
        //   318: aaload         
        //   319: aload           14
        //   321: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   324: aconst_null    
        //   325: astore          5
        //   327: goto            119
        //   330: astore          7
        //   332: aload           7
        //   334: athrow         
        //   335: astore          14
        //   337: goto            313
        //   340: astore          14
        //   342: goto            313
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  41     50     264    277    Ljava/io/UnsupportedEncodingException;
        //  41     50     277    290    Ljava/io/IOException;
        //  41     50     290    301    La;
        //  62     69     301    306    Ljava/io/UnsupportedEncodingException;
        //  77     85     306    311    Ljava/io/UnsupportedEncodingException;
        //  93     115    311    313    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  93     115    340    345    Ljava/lang/StringIndexOutOfBoundsException;
        //  93     115    335    340    Ljava/lang/IllegalArgumentException;
        //  155    181    330    335    Ljava/io/UnsupportedEncodingException;
        //  181    190    330    335    Ljava/io/UnsupportedEncodingException;
        //  303    306    306    311    Ljava/io/UnsupportedEncodingException;
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
        //     6: putfield        com/whatsapp/notification/PopupNotification.n:Ljava/lang/String;
        //     9: aload_0        
        //    10: getfield        com/whatsapp/notification/PopupNotification.n:Ljava/lang/String;
        //    13: ifnull          22
        //    16: aload_0        
        //    17: bipush          116
        //    19: invokevirtual   com/whatsapp/notification/PopupNotification.showDialog:(I)V
        //    22: aload_0        
        //    23: getfield        com/whatsapp/notification/PopupNotification.n:Ljava/lang/String;
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
        //  -----  -----  -----  -----  ------------------------------------
        //  0      22     35     38     Ljava/lang/IllegalArgumentException;
        //  22     28     38     41     Ljava/lang/IllegalArgumentException;
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
    
    private int b(int n) {
        try {
            if (this.p.size() > 1) {
                --n;
            }
            return n;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    static SensorEventListener b(final PopupNotification popupNotification) {
        return popupNotification.h;
    }
    
    private View b(final bi p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/notification/PopupNotification.A:Z
        //     3: istore_2       
        //     4: new             Landroid/widget/RelativeLayout;
        //     7: dup            
        //     8: aload_0        
        //     9: invokespecial   android/widget/RelativeLayout.<init>:(Landroid/content/Context;)V
        //    12: astore_3       
        //    13: aload_3        
        //    14: bipush          17
        //    16: invokevirtual   android/widget/RelativeLayout.setGravity:(I)V
        //    19: aload_0        
        //    20: invokevirtual   com/whatsapp/notification/PopupNotification.getBaseContext:()Landroid/content/Context;
        //    23: getstatic       com/whatsapp/notification/PopupNotification.z:[Ljava/lang/String;
        //    26: bipush          6
        //    28: aaload         
        //    29: invokevirtual   android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    32: checkcast       Landroid/view/LayoutInflater;
        //    35: ldc_w           2130903123
        //    38: aload_3        
        //    39: iconst_1       
        //    40: invokevirtual   android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //    43: astore          4
        //    45: aload           4
        //    47: ldc_w           2131755489
        //    50: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    53: checkcast       Landroid/widget/TextView;
        //    56: astore          5
        //    58: aload           4
        //    60: ldc_w           2131755490
        //    63: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    66: checkcast       Landroid/widget/TextView;
        //    69: astore          6
        //    71: aload_1        
        //    72: getfield        com/whatsapp/protocol/bi.k:Ljava/lang/String;
        //    75: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    78: ifne            534
        //    81: aload_1        
        //    82: getfield        com/whatsapp/protocol/bi.k:Ljava/lang/String;
        //    85: ldc_w           "\n"
        //    88: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //    91: astore          7
        //    93: aload           7
        //    95: ifnull          108
        //    98: aload           7
        //   100: arraylength    
        //   101: istore          23
        //   103: iload           23
        //   105: ifne            126
        //   108: aload           5
        //   110: bipush          8
        //   112: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   115: aload           6
        //   117: bipush          8
        //   119: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   122: iload_2        
        //   123: ifeq            375
        //   126: aload           5
        //   128: iconst_0       
        //   129: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   132: aload_1        
        //   133: getfield        com/whatsapp/protocol/bi.d:Ljava/lang/String;
        //   136: ifnull          156
        //   139: ldc_w           ""
        //   142: aload_1        
        //   143: getfield        com/whatsapp/protocol/bi.d:Ljava/lang/String;
        //   146: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   149: istore          21
        //   151: iload           21
        //   153: ifeq            229
        //   156: new             Ljava/lang/StringBuilder;
        //   159: dup            
        //   160: invokespecial   java/lang/StringBuilder.<init>:()V
        //   163: getstatic       com/whatsapp/notification/PopupNotification.z:[Ljava/lang/String;
        //   166: iconst_1       
        //   167: aaload         
        //   168: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   171: aload_1        
        //   172: getfield        com/whatsapp/protocol/bi.k:Ljava/lang/String;
        //   175: getstatic       com/whatsapp/notification/PopupNotification.z:[Ljava/lang/String;
        //   178: iconst_5       
        //   179: aaload         
        //   180: ldc_w           "+"
        //   183: invokevirtual   java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   186: invokestatic    android/net/Uri.encode:(Ljava/lang/String;)Ljava/lang/String;
        //   189: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   192: getstatic       com/whatsapp/notification/PopupNotification.z:[Ljava/lang/String;
        //   195: iconst_4       
        //   196: aaload         
        //   197: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   200: aload_1        
        //   201: getfield        com/whatsapp/protocol/bi.p:D
        //   204: invokevirtual   java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        //   207: ldc_w           ","
        //   210: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   213: aload_1        
        //   214: getfield        com/whatsapp/protocol/bi.G:D
        //   217: invokevirtual   java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        //   220: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   223: astore          14
        //   225: iload_2        
        //   226: ifeq            235
        //   229: aload_1        
        //   230: getfield        com/whatsapp/protocol/bi.d:Ljava/lang/String;
        //   233: astore          14
        //   235: aload           5
        //   237: iconst_0       
        //   238: invokevirtual   android/widget/TextView.setAutoLinkMask:(I)V
        //   241: aload           5
        //   243: new             Ljava/lang/StringBuilder;
        //   246: dup            
        //   247: invokespecial   java/lang/StringBuilder.<init>:()V
        //   250: getstatic       com/whatsapp/notification/PopupNotification.z:[Ljava/lang/String;
        //   253: iconst_0       
        //   254: aaload         
        //   255: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   258: aload           14
        //   260: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   263: getstatic       com/whatsapp/notification/PopupNotification.z:[Ljava/lang/String;
        //   266: iconst_3       
        //   267: aaload         
        //   268: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   271: aload           7
        //   273: iconst_0       
        //   274: aaload         
        //   275: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   278: getstatic       com/whatsapp/notification/PopupNotification.z:[Ljava/lang/String;
        //   281: iconst_2       
        //   282: aaload         
        //   283: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   286: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   289: invokestatic    android/text/Html.fromHtml:(Ljava/lang/String;)Landroid/text/Spanned;
        //   292: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   295: aload           7
        //   297: arraylength    
        //   298: istore          18
        //   300: iload           18
        //   302: iconst_1       
        //   303: if_icmple       342
        //   306: ldc_w           ""
        //   309: aload           7
        //   311: iconst_1       
        //   312: aaload         
        //   313: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   316: istore          20
        //   318: iload           20
        //   320: ifne            342
        //   323: aload           6
        //   325: iconst_0       
        //   326: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   329: aload           6
        //   331: aload           7
        //   333: iconst_1       
        //   334: aaload         
        //   335: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   338: iload_2        
        //   339: ifeq            349
        //   342: aload           6
        //   344: bipush          8
        //   346: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   349: new             Lcom/whatsapp/notification/aj;
        //   352: dup            
        //   353: aload_0        
        //   354: aload           14
        //   356: invokespecial   com/whatsapp/notification/aj.<init>:(Lcom/whatsapp/notification/PopupNotification;Ljava/lang/String;)V
        //   359: astore          19
        //   361: aload           5
        //   363: aload           19
        //   365: invokevirtual   android/widget/TextView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   368: aload           6
        //   370: aload           19
        //   372: invokevirtual   android/widget/TextView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   375: aload           4
        //   377: ldc_w           2131755393
        //   380: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   383: checkcast       Lcom/whatsapp/ThumbnailButton;
        //   386: astore          10
        //   388: aload_0        
        //   389: getfield        com/whatsapp/notification/PopupNotification.x:Lcom/whatsapp/vc;
        //   392: getfield        com/whatsapp/vc.t:F
        //   395: f2i            
        //   396: istore          11
        //   398: aload           10
        //   400: iload           11
        //   402: iload           11
        //   404: iload           11
        //   406: iload           11
        //   408: invokevirtual   com/whatsapp/ThumbnailButton.setPadding:(IIII)V
        //   411: aload           10
        //   413: aload_0        
        //   414: getfield        com/whatsapp/notification/PopupNotification.x:Lcom/whatsapp/vc;
        //   417: getfield        com/whatsapp/vc.e:F
        //   420: invokevirtual   com/whatsapp/ThumbnailButton.setRadius:(F)V
        //   423: aload           10
        //   425: fconst_1       
        //   426: invokevirtual   com/whatsapp/ThumbnailButton.setBorderSize:(F)V
        //   429: aload           10
        //   431: ldc_w           1711276032
        //   434: invokevirtual   com/whatsapp/ThumbnailButton.setBorderColor:(I)V
        //   437: aload_0        
        //   438: getfield        com/whatsapp/notification/PopupNotification.a:Ljava/util/HashSet;
        //   441: aload_1        
        //   442: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   445: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   448: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   451: ifeq            464
        //   454: aload_1        
        //   455: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   458: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   461: invokestatic    com/whatsapp/util/b.a:(Ljava/lang/String;)V
        //   464: aload_1        
        //   465: invokestatic    com/whatsapp/util/b.a:(Lcom/whatsapp/protocol/bi;)Landroid/graphics/Bitmap;
        //   468: astore          13
        //   470: aload           13
        //   472: ifnonnull       481
        //   475: aload_0        
        //   476: invokestatic    com/whatsapp/util/b8.b:(Landroid/content/Context;)Landroid/graphics/Bitmap;
        //   479: astore          13
        //   481: aload           10
        //   483: aload           13
        //   485: invokevirtual   com/whatsapp/ThumbnailButton.setImageBitmap:(Landroid/graphics/Bitmap;)V
        //   488: aload           10
        //   490: aload_0        
        //   491: getfield        com/whatsapp/notification/PopupNotification.e:Landroid/view/View$OnClickListener;
        //   494: invokevirtual   com/whatsapp/ThumbnailButton.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   497: aload_3        
        //   498: areturn        
        //   499: astore          22
        //   501: aload           22
        //   503: athrow         
        //   504: astore          8
        //   506: aload           8
        //   508: athrow         
        //   509: astore          9
        //   511: aload           9
        //   513: athrow         
        //   514: astore          15
        //   516: aload           15
        //   518: athrow         
        //   519: astore          16
        //   521: aload           16
        //   523: athrow         
        //   524: astore          17
        //   526: aload           17
        //   528: athrow         
        //   529: astore          12
        //   531: aload           12
        //   533: athrow         
        //   534: aconst_null    
        //   535: astore          7
        //   537: goto            93
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  98     103    499    504    Ljava/lang/IllegalArgumentException;
        //  108    122    504    509    Ljava/lang/IllegalArgumentException;
        //  126    151    509    514    Ljava/lang/IllegalArgumentException;
        //  235    300    514    519    Ljava/lang/IllegalArgumentException;
        //  306    318    519    524    Ljava/lang/IllegalArgumentException;
        //  323    338    524    529    Ljava/lang/IllegalArgumentException;
        //  342    349    524    529    Ljava/lang/IllegalArgumentException;
        //  398    464    529    534    Ljava/lang/IllegalArgumentException;
        //  501    504    504    509    Ljava/lang/IllegalArgumentException;
        //  506    509    509    514    Ljava/lang/IllegalArgumentException;
        //  516    519    519    524    Ljava/lang/IllegalArgumentException;
        //  521    524    524    529    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 250, Size: 250
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
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_1       
        //     2: aload_0        
        //     3: getfield        com/whatsapp/notification/PopupNotification.l:Lcom/whatsapp/a_9;
        //     6: astore_3       
        //     7: aload_3        
        //     8: ifnonnull       15
        //    11: return         
        //    12: astore_2       
        //    13: aload_2        
        //    14: athrow         
        //    15: aload_0        
        //    16: iconst_1       
        //    17: invokespecial   com/whatsapp/notification/PopupNotification.a:(Z)Z
        //    20: istore          5
        //    22: iload           5
        //    24: ifne            11
        //    27: aload_0        
        //    28: getfield        com/whatsapp/notification/PopupNotification.l:Lcom/whatsapp/a_9;
        //    31: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    34: invokestatic    com/whatsapp/App.p:(Ljava/lang/String;)Z
        //    37: ifeq            57
        //    40: aload_0        
        //    41: bipush          106
        //    43: invokevirtual   com/whatsapp/notification/PopupNotification.showDialog:(I)V
        //    46: return         
        //    47: astore          6
        //    49: aload           6
        //    51: athrow         
        //    52: astore          4
        //    54: aload           4
        //    56: athrow         
        //    57: aload_0        
        //    58: getfield        com/whatsapp/notification/PopupNotification.i:Lcom/whatsapp/ConversationTextEntry;
        //    61: invokevirtual   com/whatsapp/ConversationTextEntry.getText:()Landroid/text/Editable;
        //    64: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    67: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //    70: astore          7
        //    72: aload           7
        //    74: invokevirtual   java/lang/String.length:()I
        //    77: istore          10
        //    79: iload           10
        //    81: ifle            112
        //    84: aload_0        
        //    85: getfield        com/whatsapp/notification/PopupNotification.l:Lcom/whatsapp/a_9;
        //    88: aload           7
        //    90: invokestatic    com/whatsapp/util/cq.a:(Ljava/lang/String;)Ljava/lang/String;
        //    93: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/a_9;Ljava/lang/String;)V
        //    96: aload_0        
        //    97: getfield        com/whatsapp/notification/PopupNotification.i:Lcom/whatsapp/ConversationTextEntry;
        //   100: invokevirtual   com/whatsapp/ConversationTextEntry.getText:()Landroid/text/Editable;
        //   103: invokestatic    android/text/method/TextKeyListener.clear:(Landroid/text/Editable;)V
        //   106: getstatic       com/whatsapp/notification/PopupNotification.A:Z
        //   109: ifeq            155
        //   112: new             Ljava/lang/StringBuilder;
        //   115: dup            
        //   116: invokespecial   java/lang/StringBuilder.<init>:()V
        //   119: getstatic       com/whatsapp/notification/PopupNotification.z:[Ljava/lang/String;
        //   122: bipush          8
        //   124: aaload         
        //   125: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   128: aload_0        
        //   129: getfield        com/whatsapp/notification/PopupNotification.p:Ljava/util/ArrayList;
        //   132: invokevirtual   java/util/ArrayList.size:()I
        //   135: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   138: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   141: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   144: return         
        //   145: astore          9
        //   147: aload           9
        //   149: athrow         
        //   150: astore          8
        //   152: aload           8
        //   154: athrow         
        //   155: aload_0        
        //   156: getfield        com/whatsapp/notification/PopupNotification.l:Lcom/whatsapp/a_9;
        //   159: iconst_0       
        //   160: iconst_1       
        //   161: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/a_9;ZZ)V
        //   164: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   167: getstatic       com/whatsapp/notification/PopupNotification.z:[Ljava/lang/String;
        //   170: bipush          12
        //   172: aaload         
        //   173: invokevirtual   com/whatsapp/App.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   176: checkcast       Landroid/view/inputmethod/InputMethodManager;
        //   179: astore          11
        //   181: aload           11
        //   183: invokevirtual   android/view/inputmethod/InputMethodManager.isFullscreenMode:()Z
        //   186: ifeq            203
        //   189: aload           11
        //   191: aload_0        
        //   192: getfield        com/whatsapp/notification/PopupNotification.i:Lcom/whatsapp/ConversationTextEntry;
        //   195: invokevirtual   com/whatsapp/ConversationTextEntry.getWindowToken:()Landroid/os/IBinder;
        //   198: iconst_0       
        //   199: invokevirtual   android/view/inputmethod/InputMethodManager.hideSoftInputFromWindow:(Landroid/os/IBinder;I)Z
        //   202: pop            
        //   203: aload_0        
        //   204: getfield        com/whatsapp/notification/PopupNotification.B:Lcom/whatsapp/GalleryView;
        //   207: invokevirtual   com/whatsapp/GalleryView.c:()I
        //   210: istore          13
        //   212: aload_0        
        //   213: aload_0        
        //   214: getfield        com/whatsapp/notification/PopupNotification.B:Lcom/whatsapp/GalleryView;
        //   217: invokevirtual   com/whatsapp/GalleryView.c:()I
        //   220: invokespecial   com/whatsapp/notification/PopupNotification.b:(I)I
        //   223: istore          14
        //   225: new             Ljava/lang/StringBuilder;
        //   228: dup            
        //   229: invokespecial   java/lang/StringBuilder.<init>:()V
        //   232: getstatic       com/whatsapp/notification/PopupNotification.z:[Ljava/lang/String;
        //   235: bipush          9
        //   237: aaload         
        //   238: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   241: iload           13
        //   243: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   246: getstatic       com/whatsapp/notification/PopupNotification.z:[Ljava/lang/String;
        //   249: bipush          10
        //   251: aaload         
        //   252: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   255: iload           14
        //   257: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   260: getstatic       com/whatsapp/notification/PopupNotification.z:[Ljava/lang/String;
        //   263: bipush          11
        //   265: aaload         
        //   266: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   269: aload_0        
        //   270: getfield        com/whatsapp/notification/PopupNotification.p:Ljava/util/ArrayList;
        //   273: invokevirtual   java/util/ArrayList.size:()I
        //   276: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   279: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   282: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   285: aload_0        
        //   286: getfield        com/whatsapp/notification/PopupNotification.J:Ljava/util/HashSet;
        //   289: aload_0        
        //   290: getfield        com/whatsapp/notification/PopupNotification.p:Ljava/util/ArrayList;
        //   293: iload           14
        //   295: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   298: checkcast       Lcom/whatsapp/protocol/bi;
        //   301: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   304: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   307: pop            
        //   308: aload_0        
        //   309: getfield        com/whatsapp/notification/PopupNotification.p:Ljava/util/ArrayList;
        //   312: iload           14
        //   314: invokevirtual   java/util/ArrayList.remove:(I)Ljava/lang/Object;
        //   317: pop            
        //   318: aload_0        
        //   319: getfield        com/whatsapp/notification/PopupNotification.p:Ljava/util/ArrayList;
        //   322: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //   325: ifeq            347
        //   328: aload_0        
        //   329: invokespecial   com/whatsapp/notification/PopupNotification.d:()V
        //   332: aload_0        
        //   333: invokevirtual   com/whatsapp/notification/PopupNotification.finish:()V
        //   336: return         
        //   337: astore          15
        //   339: aload           15
        //   341: athrow         
        //   342: astore          12
        //   344: aload           12
        //   346: athrow         
        //   347: aload_0        
        //   348: getfield        com/whatsapp/notification/PopupNotification.B:Lcom/whatsapp/GalleryView;
        //   351: iload           13
        //   353: invokevirtual   com/whatsapp/GalleryView.removeViewAt:(I)V
        //   356: iload           14
        //   358: aload_0        
        //   359: getfield        com/whatsapp/notification/PopupNotification.p:Ljava/util/ArrayList;
        //   362: invokevirtual   java/util/ArrayList.size:()I
        //   365: if_icmplt       625
        //   368: iinc            14, -1
        //   371: iconst_1       
        //   372: istore          18
        //   374: aload_0        
        //   375: getfield        com/whatsapp/notification/PopupNotification.p:Ljava/util/ArrayList;
        //   378: invokevirtual   java/util/ArrayList.size:()I
        //   381: iconst_1       
        //   382: if_icmpne       619
        //   385: aload_0        
        //   386: getfield        com/whatsapp/notification/PopupNotification.B:Lcom/whatsapp/GalleryView;
        //   389: iconst_m1      
        //   390: aload_0        
        //   391: getfield        com/whatsapp/notification/PopupNotification.B:Lcom/whatsapp/GalleryView;
        //   394: invokevirtual   com/whatsapp/GalleryView.getChildCount:()I
        //   397: iadd           
        //   398: invokevirtual   com/whatsapp/GalleryView.removeViewAt:(I)V
        //   401: aload_0        
        //   402: getfield        com/whatsapp/notification/PopupNotification.B:Lcom/whatsapp/GalleryView;
        //   405: iconst_0       
        //   406: invokevirtual   com/whatsapp/GalleryView.removeViewAt:(I)V
        //   409: aload_0        
        //   410: ldc_w           2131755717
        //   413: invokevirtual   com/whatsapp/notification/PopupNotification.findViewById:(I)Landroid/view/View;
        //   416: bipush          8
        //   418: invokevirtual   android/view/View.setVisibility:(I)V
        //   421: aload_0        
        //   422: ldc_w           2131755716
        //   425: invokevirtual   com/whatsapp/notification/PopupNotification.findViewById:(I)Landroid/view/View;
        //   428: bipush          8
        //   430: invokevirtual   android/view/View.setVisibility:(I)V
        //   433: aload_0        
        //   434: getfield        com/whatsapp/notification/PopupNotification.w:Landroid/view/View;
        //   437: bipush          8
        //   439: invokevirtual   android/view/View.setVisibility:(I)V
        //   442: aload_0        
        //   443: getfield        com/whatsapp/notification/PopupNotification.m:Landroid/view/View;
        //   446: bipush          8
        //   448: invokevirtual   android/view/View.setVisibility:(I)V
        //   451: aload_0        
        //   452: iload_1        
        //   453: invokespecial   com/whatsapp/notification/PopupNotification.c:(I)I
        //   456: istore          19
        //   458: aload_0        
        //   459: getfield        com/whatsapp/notification/PopupNotification.B:Lcom/whatsapp/GalleryView;
        //   462: iload           19
        //   464: invokevirtual   com/whatsapp/GalleryView.setCurrentScreen:(I)V
        //   467: aload_0        
        //   468: getfield        com/whatsapp/notification/PopupNotification.u:Lcom/whatsapp/protocol/bi;
        //   471: ifnull          489
        //   474: aload_0        
        //   475: getfield        com/whatsapp/notification/PopupNotification.v:Ljava/util/HashSet;
        //   478: aload_0        
        //   479: getfield        com/whatsapp/notification/PopupNotification.u:Lcom/whatsapp/protocol/bi;
        //   482: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   485: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   488: pop            
        //   489: aload_0        
        //   490: getfield        com/whatsapp/notification/PopupNotification.l:Lcom/whatsapp/a_9;
        //   493: ifnull          511
        //   496: aload_0        
        //   497: getfield        com/whatsapp/notification/PopupNotification.F:Ljava/util/HashSet;
        //   500: aload_0        
        //   501: getfield        com/whatsapp/notification/PopupNotification.l:Lcom/whatsapp/a_9;
        //   504: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   507: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   510: pop            
        //   511: aload_0        
        //   512: getfield        com/whatsapp/notification/PopupNotification.B:Lcom/whatsapp/GalleryView;
        //   515: iload           19
        //   517: invokevirtual   com/whatsapp/GalleryView.getChildAt:(I)Landroid/view/View;
        //   520: astore          22
        //   522: invokestatic    com/whatsapp/App.ak:()Z
        //   525: istore          24
        //   527: iload           24
        //   529: ifeq            607
        //   532: iconst_1       
        //   533: istore          25
        //   535: iload           18
        //   537: ifeq            613
        //   540: iconst_m1      
        //   541: istore          26
        //   543: new             Landroid/view/animation/TranslateAnimation;
        //   546: dup            
        //   547: iload           26
        //   549: iload           25
        //   551: imul           
        //   552: aload           22
        //   554: invokevirtual   android/view/View.getWidth:()I
        //   557: imul           
        //   558: iconst_2       
        //   559: idiv           
        //   560: i2f            
        //   561: fconst_0       
        //   562: fconst_0       
        //   563: fconst_0       
        //   564: invokespecial   android/view/animation/TranslateAnimation.<init>:(FFFF)V
        //   567: astore          27
        //   569: aload           27
        //   571: getstatic       com/whatsapp/notification/PopupNotification.M:I
        //   574: i2l            
        //   575: invokevirtual   android/view/animation/Animation.setDuration:(J)V
        //   578: aload           27
        //   580: iconst_1       
        //   581: invokevirtual   android/view/animation/Animation.setFillAfter:(Z)V
        //   584: aload           22
        //   586: aload           27
        //   588: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //   591: return         
        //   592: astore          20
        //   594: aload           20
        //   596: athrow         
        //   597: astore          21
        //   599: aload           21
        //   601: athrow         
        //   602: astore          23
        //   604: aload           23
        //   606: athrow         
        //   607: iconst_m1      
        //   608: istore          25
        //   610: goto            535
        //   613: iconst_1       
        //   614: istore          26
        //   616: goto            543
        //   619: iload           14
        //   621: istore_1       
        //   622: goto            451
        //   625: iconst_0       
        //   626: istore          18
        //   628: goto            374
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  2      7      12     15     Ljava/lang/IllegalArgumentException;
        //  15     22     52     57     Ljava/lang/IllegalArgumentException;
        //  27     46     47     52     Ljava/lang/IllegalArgumentException;
        //  72     79     150    155    Ljava/lang/IllegalArgumentException;
        //  84     112    145    150    Ljava/lang/IllegalArgumentException;
        //  112    144    145    150    Ljava/lang/IllegalArgumentException;
        //  152    155    145    150    Ljava/lang/IllegalArgumentException;
        //  181    203    342    347    Ljava/lang/IllegalArgumentException;
        //  225    336    337    342    Ljava/lang/IllegalArgumentException;
        //  458    489    592    597    Ljava/lang/IllegalArgumentException;
        //  489    511    597    602    Ljava/lang/IllegalArgumentException;
        //  522    527    602    607    Ljava/lang/IllegalArgumentException;
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
    
    private int c(int n) {
        try {
            if (this.p.size() > 1) {
                ++n;
            }
            return n;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    private View c(final bi bi) {
        try {
            switch (bi.I) {
                default: {
                    return (View)new TextView((Context)this);
                }
                case 0: {
                    return this.e(bi);
                }
                case 2: {
                    break;
                }
                case 1: {
                    return this.g(bi);
                }
                case 3: {
                    return this.d(bi);
                }
                case 5: {
                    return this.b(bi);
                }
                case 4: {
                    return this.a(bi);
                }
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return this.f(bi);
    }
    
    static void c(final PopupNotification popupNotification) {
        popupNotification.k();
    }
    
    private View d(final bi p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Lcom/whatsapp/ThumbnailTextButton;
        //     3: dup            
        //     4: aload_0        
        //     5: invokespecial   com/whatsapp/ThumbnailTextButton.<init>:(Landroid/content/Context;)V
        //     8: astore_2       
        //     9: aload_0        
        //    10: invokevirtual   com/whatsapp/notification/PopupNotification.getResources:()Landroid/content/res/Resources;
        //    13: ldc_w           2131361942
        //    16: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //    19: istore_3       
        //    20: aload_2        
        //    21: iload_3        
        //    22: invokevirtual   com/whatsapp/ThumbnailTextButton.setMinimumHeight:(I)V
        //    25: aload_2        
        //    26: iload_3        
        //    27: invokevirtual   com/whatsapp/ThumbnailTextButton.setMaxHeight:(I)V
        //    30: aload_2        
        //    31: getstatic       android/widget/ImageView$ScaleType.FIT_CENTER:Landroid/widget/ImageView$ScaleType;
        //    34: invokevirtual   com/whatsapp/ThumbnailTextButton.setScaleType:(Landroid/widget/ImageView$ScaleType;)V
        //    37: aload_0        
        //    38: getfield        com/whatsapp/notification/PopupNotification.x:Lcom/whatsapp/vc;
        //    41: getfield        com/whatsapp/vc.t:F
        //    44: f2i            
        //    45: istore          4
        //    47: aload_2        
        //    48: iload           4
        //    50: iload           4
        //    52: iload           4
        //    54: iload           4
        //    56: invokevirtual   com/whatsapp/ThumbnailTextButton.setPadding:(IIII)V
        //    59: aload_2        
        //    60: aload_0        
        //    61: getfield        com/whatsapp/notification/PopupNotification.x:Lcom/whatsapp/vc;
        //    64: getfield        com/whatsapp/vc.e:F
        //    67: invokevirtual   com/whatsapp/ThumbnailTextButton.setRadius:(F)V
        //    70: aload_2        
        //    71: aload_0        
        //    72: invokevirtual   com/whatsapp/notification/PopupNotification.getResources:()Landroid/content/res/Resources;
        //    75: ldc_w           2130838902
        //    78: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //    81: invokevirtual   com/whatsapp/ThumbnailTextButton.setIcon:(Landroid/graphics/drawable/Drawable;)V
        //    84: aload_2        
        //    85: iload_3        
        //    86: i2f            
        //    87: ldc_w           7.0
        //    90: fdiv           
        //    91: invokevirtual   com/whatsapp/ThumbnailTextButton.setTextSize:(F)V
        //    94: aload_2        
        //    95: iconst_5       
        //    96: invokevirtual   com/whatsapp/ThumbnailTextButton.setTextGravity:(I)V
        //    99: aload_0        
        //   100: getfield        com/whatsapp/notification/PopupNotification.a:Ljava/util/HashSet;
        //   103: aload_1        
        //   104: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   107: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   110: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   113: ifeq            126
        //   116: aload_1        
        //   117: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   120: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   123: invokestatic    com/whatsapp/util/b.a:(Ljava/lang/String;)V
        //   126: aload_1        
        //   127: invokestatic    com/whatsapp/util/b.a:(Lcom/whatsapp/protocol/bi;)Landroid/graphics/Bitmap;
        //   130: astore          6
        //   132: aload           6
        //   134: ifnull          153
        //   137: aload_2        
        //   138: aload           6
        //   140: invokevirtual   com/whatsapp/ThumbnailTextButton.setImageBitmap:(Landroid/graphics/Bitmap;)V
        //   143: getstatic       com/whatsapp/notification/PopupNotification.A:Z
        //   146: istore          13
        //   148: iload           13
        //   150: ifeq            161
        //   153: aload_2        
        //   154: aload_0        
        //   155: invokestatic    com/whatsapp/util/b8.e:(Landroid/content/Context;)Landroid/graphics/Bitmap;
        //   158: invokevirtual   com/whatsapp/ThumbnailTextButton.setImageBitmap:(Landroid/graphics/Bitmap;)V
        //   161: aload_1        
        //   162: getfield        com/whatsapp/protocol/bi.D:I
        //   165: ifeq            209
        //   168: aload_1        
        //   169: getfield        com/whatsapp/protocol/bi.D:I
        //   172: i2l            
        //   173: invokestatic    android/text/format/DateUtils.formatElapsedTime:(J)Ljava/lang/String;
        //   176: astore          10
        //   178: aload_2        
        //   179: aload           10
        //   181: invokevirtual   com/whatsapp/ThumbnailTextButton.setText:(Ljava/lang/CharSequence;)V
        //   184: aload_2        
        //   185: aload_0        
        //   186: getfield        com/whatsapp/notification/PopupNotification.e:Landroid/view/View$OnClickListener;
        //   189: invokevirtual   com/whatsapp/ThumbnailTextButton.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   192: aload_2        
        //   193: areturn        
        //   194: astore          5
        //   196: aload           5
        //   198: athrow         
        //   199: astore          12
        //   201: aload           12
        //   203: athrow         
        //   204: astore          7
        //   206: aload           7
        //   208: athrow         
        //   209: aload_1        
        //   210: getfield        com/whatsapp/protocol/bi.L:J
        //   213: lconst_0       
        //   214: lcmp           
        //   215: istore          9
        //   217: aconst_null    
        //   218: astore          10
        //   220: iload           9
        //   222: ifle            178
        //   225: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   228: aload_1        
        //   229: getfield        com/whatsapp/protocol/bi.L:J
        //   232: invokestatic    android/text/format/Formatter.formatShortFileSize:(Landroid/content/Context;J)Ljava/lang/String;
        //   235: astore          11
        //   237: aload           11
        //   239: astore          10
        //   241: goto            178
        //   244: astore          8
        //   246: goto            184
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  47     126    194    199    Ljava/lang/IllegalArgumentException;
        //  137    148    199    204    Ljava/lang/IllegalArgumentException;
        //  153    161    204    209    Ljava/lang/IllegalArgumentException;
        //  161    178    244    249    Ljava/lang/IllegalArgumentException;
        //  178    184    244    249    Ljava/lang/IllegalArgumentException;
        //  201    204    204    209    Ljava/lang/IllegalArgumentException;
        //  209    217    244    249    Ljava/lang/IllegalArgumentException;
        //  225    237    244    249    Ljava/lang/IllegalArgumentException;
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
    
    static a_9 d(final PopupNotification popupNotification) {
        return popupNotification.l;
    }
    
    private void d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/notification/PopupNotification.A:Z
        //     3: istore_1       
        //     4: getstatic       com/whatsapp/notification/PopupNotification.s:Lcom/whatsapp/notification/PopupNotification;
        //     7: aload_0        
        //     8: if_acmpne       234
        //    11: new             Ljava/lang/StringBuilder;
        //    14: dup            
        //    15: invokespecial   java/lang/StringBuilder.<init>:()V
        //    18: getstatic       com/whatsapp/notification/PopupNotification.z:[Ljava/lang/String;
        //    21: bipush          20
        //    23: aaload         
        //    24: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    27: aload_0        
        //    28: getfield        com/whatsapp/notification/PopupNotification.F:Ljava/util/HashSet;
        //    31: invokevirtual   java/util/HashSet.size:()I
        //    34: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    37: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    40: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    43: aload_0        
        //    44: getfield        com/whatsapp/notification/PopupNotification.F:Ljava/util/HashSet;
        //    47: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //    50: astore_2       
        //    51: aload_2        
        //    52: invokeinterface java/util/Iterator.hasNext:()Z
        //    57: ifeq            234
        //    60: aload_2        
        //    61: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    66: checkcast       Ljava/lang/String;
        //    69: astore_3       
        //    70: new             Ljava/util/ArrayList;
        //    73: dup            
        //    74: invokespecial   java/util/ArrayList.<init>:()V
        //    77: astore          4
        //    79: aload_3        
        //    80: invokestatic    com/whatsapp/z8.a:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //    83: astore          5
        //    85: aload_0        
        //    86: getfield        com/whatsapp/notification/PopupNotification.v:Ljava/util/HashSet;
        //    89: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //    92: astore          6
        //    94: aload           6
        //    96: invokeinterface java/util/Iterator.hasNext:()Z
        //   101: ifeq            156
        //   104: aload           6
        //   106: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   111: checkcast       Lcom/whatsapp/protocol/c6;
        //   114: astore          9
        //   116: aload           9
        //   118: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   121: astore          12
        //   123: aload           12
        //   125: ifnull          152
        //   128: aload           9
        //   130: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   133: aload           5
        //   135: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   138: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   141: ifeq            152
        //   144: aload           4
        //   146: aload           9
        //   148: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   151: pop            
        //   152: iload_1        
        //   153: ifeq            94
        //   156: new             Ljava/lang/StringBuilder;
        //   159: dup            
        //   160: invokespecial   java/lang/StringBuilder.<init>:()V
        //   163: getstatic       com/whatsapp/notification/PopupNotification.z:[Ljava/lang/String;
        //   166: bipush          21
        //   168: aaload         
        //   169: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   172: aload           4
        //   174: invokevirtual   java/util/ArrayList.size:()I
        //   177: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   180: ldc_w           "/"
        //   183: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   186: aload           5
        //   188: getfield        com/whatsapp/a_9.l:I
        //   191: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   194: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   197: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   200: aload           4
        //   202: invokevirtual   java/util/ArrayList.size:()I
        //   205: aload           5
        //   207: getfield        com/whatsapp/a_9.l:I
        //   210: if_icmpne       230
        //   213: aload           5
        //   215: iconst_0       
        //   216: iconst_1       
        //   217: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/a_9;ZZ)V
        //   220: aload_0        
        //   221: getfield        com/whatsapp/notification/PopupNotification.v:Ljava/util/HashSet;
        //   224: aload           4
        //   226: invokevirtual   java/util/HashSet.removeAll:(Ljava/util/Collection;)Z
        //   229: pop            
        //   230: iload_1        
        //   231: ifeq            51
        //   234: iconst_1       
        //   235: iconst_1       
        //   236: iconst_1       
        //   237: iconst_0       
        //   238: invokestatic    com/whatsapp/App.a:(ZZZZ)V
        //   241: return         
        //   242: astore          10
        //   244: aload           10
        //   246: athrow         
        //   247: astore          11
        //   249: aload           11
        //   251: athrow         
        //   252: astore          7
        //   254: aload           7
        //   256: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  116    123    242    247    Ljava/lang/IllegalArgumentException;
        //  128    152    247    252    Ljava/lang/IllegalArgumentException;
        //  156    230    252    257    Ljava/lang/IllegalArgumentException;
        //  244    247    247    252    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 112, Size: 112
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
    
    static Sensor e(final PopupNotification popupNotification) {
        return popupNotification.q;
    }
    
    private View e(final bi bi) {
        final TextView textView = new TextView((Context)this);
        String s = null;
        Label_0034: {
            if (bi.c == 6) {
                s = ConversationRowDivider.a(bi);
                if (!PopupNotification.A) {
                    break Label_0034;
                }
            }
            s = bi.c();
        }
        textView.setText(cq.c(s, (Context)this));
        textView.setTextSize(ConversationRow.b(this.getResources()));
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setPadding(this.getResources().getDimensionPixelSize(2131361873), 0, this.getResources().getDimensionPixelSize(2131361873), 0);
        return (View)textView;
    }
    
    public static void e(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/notification/PopupNotification.s:Lcom/whatsapp/notification/PopupNotification;
        //     3: astore          5
        //     5: aload           5
        //     7: ifnull          58
        //    10: getstatic       com/whatsapp/notification/PopupNotification.s:Lcom/whatsapp/notification/PopupNotification;
        //    13: invokevirtual   com/whatsapp/notification/PopupNotification.c:()Z
        //    16: istore          6
        //    18: iload           6
        //    20: ifeq            58
        //    23: getstatic       com/whatsapp/notification/PopupNotification.s:Lcom/whatsapp/notification/PopupNotification;
        //    26: getfield        com/whatsapp/notification/PopupNotification.l:Lcom/whatsapp/a_9;
        //    29: astore          7
        //    31: aload           7
        //    33: ifnull          58
        //    36: aload_0        
        //    37: getstatic       com/whatsapp/notification/PopupNotification.s:Lcom/whatsapp/notification/PopupNotification;
        //    40: getfield        com/whatsapp/notification/PopupNotification.l:Lcom/whatsapp/a_9;
        //    43: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    46: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    49: ifeq            58
        //    52: getstatic       com/whatsapp/notification/PopupNotification.s:Lcom/whatsapp/notification/PopupNotification;
        //    55: invokevirtual   com/whatsapp/notification/PopupNotification.finish:()V
        //    58: return         
        //    59: astore_1       
        //    60: aload_1        
        //    61: athrow         
        //    62: astore_2       
        //    63: aload_2        
        //    64: athrow         
        //    65: astore_3       
        //    66: aload_3        
        //    67: athrow         
        //    68: astore          4
        //    70: aload           4
        //    72: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      5      59     62     Ljava/lang/IllegalArgumentException;
        //  10     18     62     65     Ljava/lang/IllegalArgumentException;
        //  23     31     65     68     Ljava/lang/IllegalArgumentException;
        //  36     58     68     73     Ljava/lang/IllegalArgumentException;
        //  60     62     62     65     Ljava/lang/IllegalArgumentException;
        //  63     65     65     68     Ljava/lang/IllegalArgumentException;
        //  66     68     68     73     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 35, Size: 35
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
    
    private View f(final bi p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: getfield        com/whatsapp/protocol/bi.E:I
        //     4: iconst_1       
        //     5: if_icmpne       175
        //     8: aload_0        
        //     9: getstatic       com/whatsapp/notification/PopupNotification.z:[Ljava/lang/String;
        //    12: bipush          19
        //    14: aaload         
        //    15: invokevirtual   com/whatsapp/notification/PopupNotification.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    18: checkcast       Landroid/view/LayoutInflater;
        //    21: ldc_w           2130903131
        //    24: aconst_null    
        //    25: iconst_0       
        //    26: invokevirtual   android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //    29: astore_3       
        //    30: aload_3        
        //    31: ldc_w           2131755468
        //    34: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    37: checkcast       Landroid/widget/ImageButton;
        //    40: astore          4
        //    42: aload_3        
        //    43: ldc_w           2131755477
        //    46: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    49: checkcast       Landroid/widget/TextView;
        //    52: astore          5
        //    54: aload_3        
        //    55: ldc_w           2131755163
        //    58: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    61: checkcast       Landroid/widget/ProgressBar;
        //    64: astore          6
        //    66: new             Lcom/whatsapp/up;
        //    69: dup            
        //    70: aload_0        
        //    71: invokespecial   com/whatsapp/up.<init>:(Landroid/app/Activity;)V
        //    74: astore          7
        //    76: aload           7
        //    78: aload_1        
        //    79: invokevirtual   com/whatsapp/up.b:(Lcom/whatsapp/protocol/bi;)V
        //    82: aload           7
        //    84: new             Lcom/whatsapp/notification/a5;
        //    87: dup            
        //    88: aload_0        
        //    89: aload           4
        //    91: aload           6
        //    93: aload           7
        //    95: aload           5
        //    97: invokespecial   com/whatsapp/notification/a5.<init>:(Lcom/whatsapp/notification/PopupNotification;Landroid/widget/ImageButton;Landroid/widget/ProgressBar;Lcom/whatsapp/up;Landroid/widget/TextView;)V
        //   100: invokevirtual   com/whatsapp/up.a:(Lcom/whatsapp/r7;)V
        //   103: aload_1        
        //   104: getfield        com/whatsapp/protocol/bi.D:I
        //   107: istore          10
        //   109: iload           10
        //   111: ifeq            133
        //   114: aload           5
        //   116: aload_1        
        //   117: getfield        com/whatsapp/protocol/bi.D:I
        //   120: i2l            
        //   121: invokestatic    android/text/format/DateUtils.formatElapsedTime:(J)Ljava/lang/String;
        //   124: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   127: getstatic       com/whatsapp/notification/PopupNotification.A:Z
        //   130: ifeq            148
        //   133: aload           5
        //   135: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   138: aload_1        
        //   139: getfield        com/whatsapp/protocol/bi.L:J
        //   142: invokestatic    android/text/format/Formatter.formatShortFileSize:(Landroid/content/Context;J)Ljava/lang/String;
        //   145: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   148: aload           4
        //   150: new             Lcom/whatsapp/notification/b;
        //   153: dup            
        //   154: aload_0        
        //   155: aload           7
        //   157: invokespecial   com/whatsapp/notification/b.<init>:(Lcom/whatsapp/notification/PopupNotification;Lcom/whatsapp/up;)V
        //   160: invokevirtual   android/widget/ImageButton.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   163: aload_3        
        //   164: areturn        
        //   165: astore          8
        //   167: aload           8
        //   169: athrow         
        //   170: astore          9
        //   172: aload           9
        //   174: athrow         
        //   175: new             Lcom/whatsapp/ThumbnailButton;
        //   178: dup            
        //   179: aload_0        
        //   180: invokespecial   com/whatsapp/ThumbnailButton.<init>:(Landroid/content/Context;)V
        //   183: astore_2       
        //   184: aload_2        
        //   185: aload_0        
        //   186: invokevirtual   com/whatsapp/notification/PopupNotification.getResources:()Landroid/content/res/Resources;
        //   189: ldc_w           2131361942
        //   192: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   195: invokevirtual   com/whatsapp/ThumbnailButton.setMinimumHeight:(I)V
        //   198: aload_2        
        //   199: aload_0        
        //   200: invokevirtual   com/whatsapp/notification/PopupNotification.getResources:()Landroid/content/res/Resources;
        //   203: ldc_w           2131361942
        //   206: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   209: invokevirtual   com/whatsapp/ThumbnailButton.setMaxHeight:(I)V
        //   212: aload_2        
        //   213: iconst_1       
        //   214: invokevirtual   com/whatsapp/ThumbnailButton.setAdjustViewBounds:(Z)V
        //   217: aload_2        
        //   218: getstatic       android/widget/ImageView$ScaleType.FIT_CENTER:Landroid/widget/ImageView$ScaleType;
        //   221: invokevirtual   com/whatsapp/ThumbnailButton.setScaleType:(Landroid/widget/ImageView$ScaleType;)V
        //   224: aload_2        
        //   225: aload_0        
        //   226: invokestatic    com/whatsapp/util/b8.a:(Landroid/content/Context;)Landroid/graphics/Bitmap;
        //   229: invokevirtual   com/whatsapp/ThumbnailButton.setImageBitmap:(Landroid/graphics/Bitmap;)V
        //   232: aload_2        
        //   233: aload_0        
        //   234: getfield        com/whatsapp/notification/PopupNotification.e:Landroid/view/View$OnClickListener;
        //   237: invokevirtual   com/whatsapp/ThumbnailButton.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   240: aload_2        
        //   241: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  76     109    165    170    Ljava/lang/IllegalArgumentException;
        //  114    133    170    175    Ljava/lang/IllegalArgumentException;
        //  133    148    170    175    Ljava/lang/IllegalArgumentException;
        //  167    170    170    175    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0133:
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
    
    private void f() {
        if (this.l != null) {
            final Bitmap a = this.l.a(this.getResources().getDimensionPixelSize(2131361952), this.getResources().getDimension(2131361814), true);
            Bitmap x;
            if (a == null) {
                x = this.l.x();
            }
            else {
                x = a;
            }
            ((ImageView)this.findViewById(2131755694)).setImageBitmap(x);
        }
    }
    
    static void f(final PopupNotification popupNotification) {
        popupNotification.h();
    }
    
    static int g() {
        return PopupNotification.M;
    }
    
    static SensorManager g(final PopupNotification popupNotification) {
        return popupNotification.I;
    }
    
    private View g(final bi bi) {
        final ThumbnailButton thumbnailButton = new ThumbnailButton((Context)this);
        final int dimensionPixelSize = this.getResources().getDimensionPixelSize(2131361942);
        thumbnailButton.setMinimumHeight(dimensionPixelSize);
        thumbnailButton.setMaxHeight(dimensionPixelSize);
        thumbnailButton.setScaleType(ImageView$ScaleType.FIT_CENTER);
        final int n = (int)this.x.t;
        try {
            thumbnailButton.setPadding(n, n, n, n);
            thumbnailButton.setRadius(this.x.e);
            if (this.a.add(bi.a.a)) {
                com.whatsapp.util.b.a(bi.a.a);
            }
            Bitmap imageBitmap = com.whatsapp.util.b.a(bi);
            if (imageBitmap == null) {
                imageBitmap = b8.c((Context)this);
            }
            thumbnailButton.setImageBitmap(imageBitmap);
            thumbnailButton.setOnClickListener(this.e);
            return (View)thumbnailButton;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    static PowerManager$WakeLock h(final PopupNotification popupNotification) {
        return popupNotification.E;
    }
    
    private void h() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/whatsapp/App.av:()V
        //     3: aload_0        
        //     4: getfield        com/whatsapp/notification/PopupNotification.u:Lcom/whatsapp/protocol/bi;
        //     7: ifnull          25
        //    10: aload_0        
        //    11: getfield        com/whatsapp/notification/PopupNotification.v:Ljava/util/HashSet;
        //    14: aload_0        
        //    15: getfield        com/whatsapp/notification/PopupNotification.u:Lcom/whatsapp/protocol/bi;
        //    18: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    21: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //    24: pop            
        //    25: aload_0        
        //    26: getfield        com/whatsapp/notification/PopupNotification.p:Ljava/util/ArrayList;
        //    29: invokevirtual   java/util/ArrayList.size:()I
        //    32: istore_3       
        //    33: iload_3        
        //    34: iconst_1       
        //    35: if_icmpgt       45
        //    38: return         
        //    39: astore_1       
        //    40: aload_1        
        //    41: athrow         
        //    42: astore_2       
        //    43: aload_2        
        //    44: athrow         
        //    45: iconst_m1      
        //    46: iconst_m1      
        //    47: aload_0        
        //    48: getfield        com/whatsapp/notification/PopupNotification.B:Lcom/whatsapp/GalleryView;
        //    51: invokevirtual   com/whatsapp/GalleryView.c:()I
        //    54: iadd           
        //    55: iadd           
        //    56: istore          4
        //    58: iload           4
        //    60: ifge            74
        //    63: iconst_m1      
        //    64: aload_0        
        //    65: getfield        com/whatsapp/notification/PopupNotification.p:Ljava/util/ArrayList;
        //    68: invokevirtual   java/util/ArrayList.size:()I
        //    71: iadd           
        //    72: istore          4
        //    74: aload_0        
        //    75: getfield        com/whatsapp/notification/PopupNotification.B:Lcom/whatsapp/GalleryView;
        //    78: iload           4
        //    80: iconst_1       
        //    81: iadd           
        //    82: invokevirtual   com/whatsapp/GalleryView.setCurrentScreen:(I)V
        //    85: aload_0        
        //    86: getfield        com/whatsapp/notification/PopupNotification.B:Lcom/whatsapp/GalleryView;
        //    89: iload           4
        //    91: iconst_1       
        //    92: iadd           
        //    93: invokevirtual   com/whatsapp/GalleryView.getChildAt:(I)Landroid/view/View;
        //    96: astore          5
        //    98: invokestatic    com/whatsapp/App.ak:()Z
        //   101: istore          7
        //   103: iload           7
        //   105: ifeq            163
        //   108: iconst_1       
        //   109: istore          8
        //   111: new             Landroid/view/animation/TranslateAnimation;
        //   114: dup            
        //   115: iload           8
        //   117: aload           5
        //   119: invokevirtual   android/view/View.getWidth:()I
        //   122: ineg           
        //   123: imul           
        //   124: iconst_2       
        //   125: idiv           
        //   126: i2f            
        //   127: fconst_0       
        //   128: fconst_0       
        //   129: fconst_0       
        //   130: invokespecial   android/view/animation/TranslateAnimation.<init>:(FFFF)V
        //   133: astore          9
        //   135: aload           9
        //   137: getstatic       com/whatsapp/notification/PopupNotification.M:I
        //   140: i2l            
        //   141: invokevirtual   android/view/animation/Animation.setDuration:(J)V
        //   144: aload           9
        //   146: iconst_1       
        //   147: invokevirtual   android/view/animation/Animation.setFillAfter:(Z)V
        //   150: aload           5
        //   152: aload           9
        //   154: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //   157: return         
        //   158: astore          6
        //   160: aload           6
        //   162: athrow         
        //   163: iconst_m1      
        //   164: istore          8
        //   166: goto            111
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      25     39     42     Ljava/lang/IllegalArgumentException;
        //  25     33     42     45     Ljava/lang/IllegalArgumentException;
        //  98     103    158    163    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0025:
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
    
    static ConversationTextEntry i(final PopupNotification popupNotification) {
        return popupNotification.i;
    }
    
    private void i() {
        try {
            Log.i(PopupNotification.z[17]);
            this.C = 5.0f;
            this.f.removeCallbacks(this.g);
            this.f.postDelayed(this.g, 600L);
            if (this.h != null) {
                return;
            }
            final PopupNotification popupNotification = this;
            final Sensor sensor = popupNotification.q;
            if (sensor != null) {
                final PopupNotification popupNotification2 = this;
                final PopupNotification popupNotification3 = this;
                final n n = new n(popupNotification3);
                popupNotification2.h = (SensorEventListener)n;
                final PopupNotification popupNotification4 = this;
                final SensorManager sensorManager = popupNotification4.I;
                final PopupNotification popupNotification5 = this;
                final SensorEventListener sensorEventListener = popupNotification5.h;
                final PopupNotification popupNotification6 = this;
                final Sensor sensor2 = popupNotification6.q;
                final int n2 = 0;
                sensorManager.registerListener(sensorEventListener, sensor2, n2);
            }
            return;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            final PopupNotification popupNotification = this;
            final Sensor sensor = popupNotification.q;
            if (sensor != null) {
                final PopupNotification popupNotification2 = this;
                final PopupNotification popupNotification3 = this;
                final n n = new n(popupNotification3);
                popupNotification2.h = (SensorEventListener)n;
                final PopupNotification popupNotification4 = this;
                final SensorManager sensorManager = popupNotification4.I;
                final PopupNotification popupNotification5 = this;
                final SensorEventListener sensorEventListener = popupNotification5.h;
                final PopupNotification popupNotification6 = this;
                final Sensor sensor2 = popupNotification6.q;
                final int n2 = 0;
                sensorManager.registerListener(sensorEventListener, sensor2, n2);
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
    }
    
    static ImageButton j(final PopupNotification popupNotification) {
        return popupNotification.K;
    }
    
    private void j() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/notification/PopupNotification.z:[Ljava/lang/String;
        //     3: bipush          25
        //     5: aaload         
        //     6: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //     9: aload_0        
        //    10: getfield        com/whatsapp/notification/PopupNotification.E:Landroid/os/PowerManager$WakeLock;
        //    13: astore_3       
        //    14: aload_3        
        //    15: ifnull          35
        //    18: aload_0        
        //    19: getfield        com/whatsapp/notification/PopupNotification.E:Landroid/os/PowerManager$WakeLock;
        //    22: invokevirtual   android/os/PowerManager$WakeLock.isHeld:()Z
        //    25: ifne            35
        //    28: aload_0        
        //    29: getfield        com/whatsapp/notification/PopupNotification.E:Landroid/os/PowerManager$WakeLock;
        //    32: invokevirtual   android/os/PowerManager$WakeLock.acquire:()V
        //    35: aload_0        
        //    36: getfield        com/whatsapp/notification/PopupNotification.L:Landroid/os/Handler;
        //    39: aload_0        
        //    40: getfield        com/whatsapp/notification/PopupNotification.G:Ljava/lang/Runnable;
        //    43: invokevirtual   android/os/Handler.removeCallbacks:(Ljava/lang/Runnable;)V
        //    46: aload_0        
        //    47: getfield        com/whatsapp/notification/PopupNotification.L:Landroid/os/Handler;
        //    50: aload_0        
        //    51: getfield        com/whatsapp/notification/PopupNotification.G:Ljava/lang/Runnable;
        //    54: ldc2_w          5000
        //    57: invokevirtual   android/os/Handler.postDelayed:(Ljava/lang/Runnable;J)Z
        //    60: pop            
        //    61: return         
        //    62: astore_1       
        //    63: aload_1        
        //    64: athrow         
        //    65: astore_2       
        //    66: aload_2        
        //    67: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      14     62     65     Ljava/lang/IllegalArgumentException;
        //  18     35     65     68     Ljava/lang/IllegalArgumentException;
        //  63     65     65     68     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0035:
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
    
    private void k() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/whatsapp/App.av:()V
        //     3: aload_0        
        //     4: getfield        com/whatsapp/notification/PopupNotification.u:Lcom/whatsapp/protocol/bi;
        //     7: ifnull          25
        //    10: aload_0        
        //    11: getfield        com/whatsapp/notification/PopupNotification.v:Ljava/util/HashSet;
        //    14: aload_0        
        //    15: getfield        com/whatsapp/notification/PopupNotification.u:Lcom/whatsapp/protocol/bi;
        //    18: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    21: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //    24: pop            
        //    25: aload_0        
        //    26: getfield        com/whatsapp/notification/PopupNotification.p:Ljava/util/ArrayList;
        //    29: invokevirtual   java/util/ArrayList.size:()I
        //    32: istore_3       
        //    33: iload_3        
        //    34: iconst_1       
        //    35: if_icmpgt       45
        //    38: return         
        //    39: astore_1       
        //    40: aload_1        
        //    41: athrow         
        //    42: astore_2       
        //    43: aload_2        
        //    44: athrow         
        //    45: iconst_1       
        //    46: iconst_m1      
        //    47: aload_0        
        //    48: getfield        com/whatsapp/notification/PopupNotification.B:Lcom/whatsapp/GalleryView;
        //    51: invokevirtual   com/whatsapp/GalleryView.c:()I
        //    54: iadd           
        //    55: iadd           
        //    56: istore          4
        //    58: iload           4
        //    60: aload_0        
        //    61: getfield        com/whatsapp/notification/PopupNotification.p:Ljava/util/ArrayList;
        //    64: invokevirtual   java/util/ArrayList.size:()I
        //    67: if_icmplt       73
        //    70: iconst_0       
        //    71: istore          4
        //    73: aload_0        
        //    74: getfield        com/whatsapp/notification/PopupNotification.B:Lcom/whatsapp/GalleryView;
        //    77: iload           4
        //    79: iconst_1       
        //    80: iadd           
        //    81: invokevirtual   com/whatsapp/GalleryView.setCurrentScreen:(I)V
        //    84: aload_0        
        //    85: getfield        com/whatsapp/notification/PopupNotification.B:Lcom/whatsapp/GalleryView;
        //    88: iload           4
        //    90: iconst_1       
        //    91: iadd           
        //    92: invokevirtual   com/whatsapp/GalleryView.getChildAt:(I)Landroid/view/View;
        //    95: astore          5
        //    97: invokestatic    com/whatsapp/App.ak:()Z
        //   100: istore          7
        //   102: iload           7
        //   104: ifeq            161
        //   107: iconst_1       
        //   108: istore          8
        //   110: new             Landroid/view/animation/TranslateAnimation;
        //   113: dup            
        //   114: iload           8
        //   116: aload           5
        //   118: invokevirtual   android/view/View.getWidth:()I
        //   121: imul           
        //   122: iconst_2       
        //   123: idiv           
        //   124: i2f            
        //   125: fconst_0       
        //   126: fconst_0       
        //   127: fconst_0       
        //   128: invokespecial   android/view/animation/TranslateAnimation.<init>:(FFFF)V
        //   131: astore          9
        //   133: aload           9
        //   135: getstatic       com/whatsapp/notification/PopupNotification.M:I
        //   138: i2l            
        //   139: invokevirtual   android/view/animation/Animation.setDuration:(J)V
        //   142: aload           9
        //   144: iconst_1       
        //   145: invokevirtual   android/view/animation/Animation.setFillAfter:(Z)V
        //   148: aload           5
        //   150: aload           9
        //   152: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //   155: return         
        //   156: astore          6
        //   158: aload           6
        //   160: athrow         
        //   161: iconst_m1      
        //   162: istore          8
        //   164: goto            110
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      25     39     42     Ljava/lang/IllegalArgumentException;
        //  25     33     42     45     Ljava/lang/IllegalArgumentException;
        //  97     102    156    161    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0025:
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
    
    static void k(final PopupNotification popupNotification) {
        popupNotification.b();
    }
    
    static HashSet l(final PopupNotification popupNotification) {
        return popupNotification.v;
    }
    
    static void m(final PopupNotification popupNotification) {
        popupNotification.d();
    }
    
    static HashSet n(final PopupNotification popupNotification) {
        return popupNotification.F;
    }
    
    static n7 o(final PopupNotification popupNotification) {
        return popupNotification.j;
    }
    
    static bi p(final PopupNotification popupNotification) {
        return popupNotification.u;
    }
    
    static void q(final PopupNotification popupNotification) {
        popupNotification.j();
    }
    
    static ArrayList r(final PopupNotification popupNotification) {
        return popupNotification.p;
    }
    
    static ImageButton s(final PopupNotification popupNotification) {
        return popupNotification.D;
    }
    
    static GalleryView t(final PopupNotification popupNotification) {
        return popupNotification.B;
    }
    
    public void a() {
        try {
            if (!this.p.isEmpty()) {
                this.a(this.b(this.B.c()));
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public void a(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/notification/PopupNotification.A:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: aload_0        
        //     6: getfield        com/whatsapp/notification/PopupNotification.p:Ljava/util/ArrayList;
        //     9: iload_1        
        //    10: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    13: checkcast       Lcom/whatsapp/protocol/bi;
        //    16: putfield        com/whatsapp/notification/PopupNotification.u:Lcom/whatsapp/protocol/bi;
        //    19: aload_0        
        //    20: getfield        com/whatsapp/notification/PopupNotification.H:Lcom/whatsapp/ps;
        //    23: aload_0        
        //    24: getfield        com/whatsapp/notification/PopupNotification.u:Lcom/whatsapp/protocol/bi;
        //    27: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    30: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //    33: invokevirtual   com/whatsapp/ps.a:(Ljava/lang/String;)V
        //    36: aload_0        
        //    37: aload_0        
        //    38: getfield        com/whatsapp/notification/PopupNotification.u:Lcom/whatsapp/protocol/bi;
        //    41: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    44: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //    47: invokestatic    com/whatsapp/z8.a:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //    50: putfield        com/whatsapp/notification/PopupNotification.l:Lcom/whatsapp/a_9;
        //    53: aload_0        
        //    54: getfield        com/whatsapp/notification/PopupNotification.l:Lcom/whatsapp/a_9;
        //    57: astore          4
        //    59: aload           4
        //    61: ifnonnull       68
        //    64: return         
        //    65: astore_3       
        //    66: aload_3        
        //    67: athrow         
        //    68: invokestatic    com/whatsapp/App.p:()Z
        //    71: istore          7
        //    73: iload           7
        //    75: ifeq            95
        //    78: aload_0        
        //    79: getfield        com/whatsapp/notification/PopupNotification.l:Lcom/whatsapp/a_9;
        //    82: invokevirtual   com/whatsapp/a_9.m:()Z
        //    85: ifne            95
        //    88: aload_0        
        //    89: getfield        com/whatsapp/notification/PopupNotification.l:Lcom/whatsapp/a_9;
        //    92: invokestatic    com/whatsapp/App.c:(Lcom/whatsapp/a_9;)V
        //    95: aload_0        
        //    96: getfield        com/whatsapp/notification/PopupNotification.p:Ljava/util/ArrayList;
        //    99: invokevirtual   java/util/ArrayList.size:()I
        //   102: istore          10
        //   104: iload           10
        //   106: iconst_1       
        //   107: if_icmpeq       116
        //   110: invokestatic    com/whatsapp/App.p:()Z
        //   113: ifeq            146
        //   116: aload_0        
        //   117: getfield        com/whatsapp/notification/PopupNotification.v:Ljava/util/HashSet;
        //   120: aload_0        
        //   121: getfield        com/whatsapp/notification/PopupNotification.u:Lcom/whatsapp/protocol/bi;
        //   124: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   127: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   130: pop            
        //   131: aload_0        
        //   132: getfield        com/whatsapp/notification/PopupNotification.F:Ljava/util/HashSet;
        //   135: aload_0        
        //   136: getfield        com/whatsapp/notification/PopupNotification.l:Lcom/whatsapp/a_9;
        //   139: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   142: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   145: pop            
        //   146: aload_0        
        //   147: invokespecial   com/whatsapp/notification/PopupNotification.f:()V
        //   150: ldc_w           2131231907
        //   153: istore          13
        //   155: aload_0        
        //   156: getfield        com/whatsapp/notification/PopupNotification.u:Lcom/whatsapp/protocol/bi;
        //   159: getfield        com/whatsapp/protocol/bi.I:B
        //   162: iconst_2       
        //   163: if_icmpne       175
        //   166: ldc_w           2131231274
        //   169: istore          13
        //   171: iload_2        
        //   172: ifeq            195
        //   175: aload_0        
        //   176: getfield        com/whatsapp/notification/PopupNotification.u:Lcom/whatsapp/protocol/bi;
        //   179: getfield        com/whatsapp/protocol/bi.I:B
        //   182: istore          15
        //   184: iload           15
        //   186: iconst_3       
        //   187: if_icmpne       195
        //   190: ldc_w           2131231958
        //   193: istore          13
        //   195: aload_0        
        //   196: getfield        com/whatsapp/notification/PopupNotification.k:Landroid/widget/Button;
        //   199: iload           13
        //   201: invokevirtual   android/widget/Button.setText:(I)V
        //   204: aload_0        
        //   205: getfield        com/whatsapp/notification/PopupNotification.d:Landroid/widget/TextView;
        //   208: aload_0        
        //   209: getfield        com/whatsapp/notification/PopupNotification.l:Lcom/whatsapp/a_9;
        //   212: aload_0        
        //   213: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   216: aload_0        
        //   217: invokestatic    com/whatsapp/util/cq.c:(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/CharSequence;
        //   220: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   223: aload_0        
        //   224: getfield        com/whatsapp/notification/PopupNotification.l:Lcom/whatsapp/a_9;
        //   227: invokevirtual   com/whatsapp/a_9.m:()Z
        //   230: ifeq            288
        //   233: aload_0        
        //   234: getfield        com/whatsapp/notification/PopupNotification.t:Landroid/widget/TextView;
        //   237: new             Ljava/lang/StringBuilder;
        //   240: dup            
        //   241: invokespecial   java/lang/StringBuilder.<init>:()V
        //   244: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   247: aload_0        
        //   248: getfield        com/whatsapp/notification/PopupNotification.u:Lcom/whatsapp/protocol/bi;
        //   251: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   254: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   257: aload_0        
        //   258: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   261: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   264: ldc_w           " "
        //   267: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   270: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   273: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   276: aload_0        
        //   277: getfield        com/whatsapp/notification/PopupNotification.t:Landroid/widget/TextView;
        //   280: iconst_0       
        //   281: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   284: iload_2        
        //   285: ifeq            358
        //   288: aload_0        
        //   289: getfield        com/whatsapp/notification/PopupNotification.l:Lcom/whatsapp/a_9;
        //   292: invokevirtual   com/whatsapp/a_9.n:()Ljava/lang/String;
        //   295: astore          17
        //   297: aload           17
        //   299: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   302: istore          20
        //   304: iload           20
        //   306: ifeq            322
        //   309: aload_0        
        //   310: getfield        com/whatsapp/notification/PopupNotification.t:Landroid/widget/TextView;
        //   313: bipush          8
        //   315: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   318: iload_2        
        //   319: ifeq            358
        //   322: aload_0        
        //   323: getfield        com/whatsapp/notification/PopupNotification.t:Landroid/widget/TextView;
        //   326: iconst_0       
        //   327: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   330: aload_0        
        //   331: getfield        com/whatsapp/notification/PopupNotification.t:Landroid/widget/TextView;
        //   334: new             Ljava/lang/StringBuilder;
        //   337: dup            
        //   338: invokespecial   java/lang/StringBuilder.<init>:()V
        //   341: aload           17
        //   343: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   346: ldc_w           " "
        //   349: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   352: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   355: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   358: aload_0        
        //   359: getfield        com/whatsapp/notification/PopupNotification.y:Landroid/widget/TextView;
        //   362: astore          22
        //   364: iconst_2       
        //   365: anewarray       Ljava/lang/Object;
        //   368: astore          23
        //   370: aload           23
        //   372: iconst_0       
        //   373: iload_1        
        //   374: iconst_1       
        //   375: iadd           
        //   376: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   379: aastore        
        //   380: aload           23
        //   382: iconst_1       
        //   383: aload_0        
        //   384: getfield        com/whatsapp/notification/PopupNotification.p:Ljava/util/ArrayList;
        //   387: invokevirtual   java/util/ArrayList.size:()I
        //   390: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   393: aastore        
        //   394: aload           22
        //   396: aload_0        
        //   397: ldc_w           2131231299
        //   400: aload           23
        //   402: invokevirtual   com/whatsapp/notification/PopupNotification.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   405: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   408: aload_0        
        //   409: getfield        com/whatsapp/notification/PopupNotification.D:Landroid/widget/ImageButton;
        //   412: astore          24
        //   414: aload_0        
        //   415: getfield        com/whatsapp/notification/PopupNotification.i:Lcom/whatsapp/ConversationTextEntry;
        //   418: invokevirtual   com/whatsapp/ConversationTextEntry.getText:()Landroid/text/Editable;
        //   421: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   424: invokevirtual   java/lang/String.length:()I
        //   427: istore          25
        //   429: iload           25
        //   431: ifeq            490
        //   434: iconst_1       
        //   435: istore          26
        //   437: aload           24
        //   439: iload           26
        //   441: invokevirtual   android/widget/ImageButton.setEnabled:(Z)V
        //   444: return         
        //   445: astore          5
        //   447: aload           5
        //   449: athrow         
        //   450: astore          6
        //   452: aload           6
        //   454: athrow         
        //   455: astore          8
        //   457: aload           8
        //   459: athrow         
        //   460: astore          9
        //   462: aload           9
        //   464: athrow         
        //   465: astore          14
        //   467: aload           14
        //   469: athrow         
        //   470: astore          16
        //   472: aload           16
        //   474: athrow         
        //   475: astore          18
        //   477: aload           18
        //   479: athrow         
        //   480: astore          19
        //   482: aload           19
        //   484: athrow         
        //   485: astore          21
        //   487: aload           21
        //   489: athrow         
        //   490: iconst_0       
        //   491: istore          26
        //   493: goto            437
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      59     65     68     Ljava/lang/IllegalArgumentException;
        //  68     73     445    450    Ljava/lang/IllegalArgumentException;
        //  78     95     450    455    Ljava/lang/IllegalArgumentException;
        //  95     104    455    460    Ljava/lang/IllegalArgumentException;
        //  110    116    460    465    Ljava/lang/IllegalArgumentException;
        //  116    146    460    465    Ljava/lang/IllegalArgumentException;
        //  175    184    465    470    Ljava/lang/IllegalArgumentException;
        //  195    284    470    475    Ljava/lang/IllegalArgumentException;
        //  297    304    475    480    Ljava/lang/IllegalArgumentException;
        //  309    318    480    485    Ljava/lang/IllegalArgumentException;
        //  322    358    480    485    Ljava/lang/IllegalArgumentException;
        //  358    429    485    490    Ljava/lang/IllegalArgumentException;
        //  447    450    450    455    Ljava/lang/IllegalArgumentException;
        //  457    460    460    465    Ljava/lang/IllegalArgumentException;
        //  477    480    480    485    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 231, Size: 231
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
    
    public void a(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/notification/PopupNotification.l:Lcom/whatsapp/a_9;
        //     4: astore          4
        //     6: aload           4
        //     8: ifnull          108
        //    11: aload_1        
        //    12: aload_0        
        //    13: getfield        com/whatsapp/notification/PopupNotification.l:Lcom/whatsapp/a_9;
        //    16: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    19: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    22: ifeq            108
        //    25: aload_1        
        //    26: invokestatic    com/whatsapp/adc.b:(Ljava/lang/String;)Z
        //    29: istore          5
        //    31: iload           5
        //    33: ifne            108
        //    36: aload_0        
        //    37: getfield        com/whatsapp/notification/PopupNotification.l:Lcom/whatsapp/a_9;
        //    40: invokevirtual   com/whatsapp/a_9.n:()Ljava/lang/String;
        //    43: astore          6
        //    45: aload           6
        //    47: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    50: istore          9
        //    52: iload           9
        //    54: ifeq            72
        //    57: aload_0        
        //    58: getfield        com/whatsapp/notification/PopupNotification.t:Landroid/widget/TextView;
        //    61: bipush          8
        //    63: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //    66: getstatic       com/whatsapp/notification/PopupNotification.A:Z
        //    69: ifeq            108
        //    72: aload_0        
        //    73: getfield        com/whatsapp/notification/PopupNotification.t:Landroid/widget/TextView;
        //    76: iconst_0       
        //    77: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //    80: aload_0        
        //    81: getfield        com/whatsapp/notification/PopupNotification.t:Landroid/widget/TextView;
        //    84: new             Ljava/lang/StringBuilder;
        //    87: dup            
        //    88: invokespecial   java/lang/StringBuilder.<init>:()V
        //    91: aload           6
        //    93: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    96: ldc_w           " "
        //    99: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   102: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   105: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   108: return         
        //   109: astore_2       
        //   110: aload_2        
        //   111: athrow         
        //   112: astore_3       
        //   113: aload_3        
        //   114: athrow         
        //   115: astore          7
        //   117: aload           7
        //   119: athrow         
        //   120: astore          8
        //   122: aload           8
        //   124: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      6      109    112    Ljava/lang/IllegalArgumentException;
        //  11     31     112    115    Ljava/lang/IllegalArgumentException;
        //  45     52     115    120    Ljava/lang/IllegalArgumentException;
        //  57     72     120    125    Ljava/lang/IllegalArgumentException;
        //  72     108    120    125    Ljava/lang/IllegalArgumentException;
        //  110    112    112    115    Ljava/lang/IllegalArgumentException;
        //  117    120    120    125    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 59, Size: 59
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
    
    public void a(final Collection collection) {
    }
    
    public void b(final String s) {
        try {
            if (this.l == null) {
                return;
            }
            final String s2 = s;
            final PopupNotification popupNotification = this;
            final a_9 a_9 = popupNotification.l;
            final String s3 = a_9.u;
            final boolean b = s2.equals(s3);
            if (b) {
                final PopupNotification popupNotification2 = this;
                popupNotification2.f();
            }
            return;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            final String s2 = s;
            final PopupNotification popupNotification = this;
            final a_9 a_9 = popupNotification.l;
            final String s3 = a_9.u;
            final boolean b = s2.equals(s3);
            if (b) {
                final PopupNotification popupNotification2 = this;
                popupNotification2.f();
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
    }
    
    public void c(final String s) {
    }
    
    public boolean c() {
        return this.c;
    }
    
    public void d(final String s) {
    }
    
    public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        try {
            if (up.o()) {
                return false;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
    
    public void e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/notification/PopupNotification.A:Z
        //     3: istore_1       
        //     4: getstatic       com/whatsapp/notification/PopupNotification.z:[Ljava/lang/String;
        //     7: bipush          22
        //     9: aaload         
        //    10: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    13: invokestatic    com/whatsapp/notification/a2.b:()Lcom/whatsapp/notification/a2;
        //    16: getstatic       com/whatsapp/qc.GROUP:Lcom/whatsapp/qc;
        //    19: invokevirtual   com/whatsapp/notification/a2.a:(Lcom/whatsapp/qc;)I
        //    22: istore_2       
        //    23: invokestatic    com/whatsapp/notification/a2.b:()Lcom/whatsapp/notification/a2;
        //    26: getstatic       com/whatsapp/qc.INDIVIDUAL:Lcom/whatsapp/qc;
        //    29: invokevirtual   com/whatsapp/notification/a2.a:(Lcom/whatsapp/qc;)I
        //    32: istore_3       
        //    33: iload_2        
        //    34: ifne            51
        //    37: iload_3        
        //    38: ifne            51
        //    41: aload_0        
        //    42: invokevirtual   com/whatsapp/notification/PopupNotification.finish:()V
        //    45: return         
        //    46: astore          61
        //    48: aload           61
        //    50: athrow         
        //    51: aload_0        
        //    52: aload_0        
        //    53: getfield        com/whatsapp/notification/PopupNotification.B:Lcom/whatsapp/GalleryView;
        //    56: invokevirtual   com/whatsapp/GalleryView.c:()I
        //    59: invokespecial   com/whatsapp/notification/PopupNotification.b:(I)I
        //    62: istore          6
        //    64: iload           6
        //    66: ifne            348
        //    69: aload_0        
        //    70: getfield        com/whatsapp/notification/PopupNotification.i:Lcom/whatsapp/ConversationTextEntry;
        //    73: invokevirtual   com/whatsapp/ConversationTextEntry.getText:()Landroid/text/Editable;
        //    76: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    79: invokevirtual   java/lang/String.length:()I
        //    82: istore          60
        //    84: iload           60
        //    86: ifne            348
        //    89: iconst_1       
        //    90: istore          7
        //    92: aload_0        
        //    93: new             Ljava/util/ArrayList;
        //    96: dup            
        //    97: invokespecial   java/util/ArrayList.<init>:()V
        //   100: putfield        com/whatsapp/notification/PopupNotification.p:Ljava/util/ArrayList;
        //   103: invokestatic    com/whatsapp/z8.j:()Ljava/util/ArrayList;
        //   106: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   109: astore          8
        //   111: aload           8
        //   113: invokeinterface java/util/Iterator.hasNext:()Z
        //   118: ifeq            286
        //   121: aload           8
        //   123: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   128: checkcast       Ljava/lang/String;
        //   131: invokestatic    com/whatsapp/z8.a:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   134: astore          44
        //   136: aload           44
        //   138: getfield        com/whatsapp/a_9.l:I
        //   141: istore          48
        //   143: iload           48
        //   145: ifle            282
        //   148: aload           44
        //   150: invokevirtual   com/whatsapp/a_9.m:()Z
        //   153: istore          49
        //   155: iload           49
        //   157: ifeq            168
        //   160: iload_2        
        //   161: ifne            176
        //   164: iload_1        
        //   165: ifeq            111
        //   168: iload_3        
        //   169: ifne            176
        //   172: iload_1        
        //   173: ifeq            111
        //   176: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   179: aload           44
        //   181: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   184: aload           44
        //   186: getfield        com/whatsapp/a_9.l:I
        //   189: invokevirtual   com/whatsapp/vy.c:(Ljava/lang/String;I)Ljava/util/ArrayList;
        //   192: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   195: astore          50
        //   197: aload           50
        //   199: invokeinterface java/util/Iterator.hasNext:()Z
        //   204: ifeq            282
        //   207: aload           50
        //   209: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   214: checkcast       Lcom/whatsapp/protocol/bi;
        //   217: astore          51
        //   219: aload_0        
        //   220: getfield        com/whatsapp/notification/PopupNotification.J:Ljava/util/HashSet;
        //   223: aload           51
        //   225: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   228: invokevirtual   java/util/HashSet.contains:(Ljava/lang/Object;)Z
        //   231: istore          56
        //   233: iload           56
        //   235: ifne            278
        //   238: aload           44
        //   240: invokevirtual   com/whatsapp/a_9.m:()Z
        //   243: istore          57
        //   245: iload           57
        //   247: ifne            268
        //   250: iload_3        
        //   251: ifeq            278
        //   254: aload_0        
        //   255: getfield        com/whatsapp/notification/PopupNotification.p:Ljava/util/ArrayList;
        //   258: aload           51
        //   260: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   263: pop            
        //   264: iload_1        
        //   265: ifeq            278
        //   268: aload_0        
        //   269: getfield        com/whatsapp/notification/PopupNotification.p:Ljava/util/ArrayList;
        //   272: aload           51
        //   274: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   277: pop            
        //   278: iload_1        
        //   279: ifeq            197
        //   282: iload_1        
        //   283: ifeq            111
        //   286: new             Ljava/lang/StringBuilder;
        //   289: dup            
        //   290: invokespecial   java/lang/StringBuilder.<init>:()V
        //   293: getstatic       com/whatsapp/notification/PopupNotification.z:[Ljava/lang/String;
        //   296: bipush          23
        //   298: aaload         
        //   299: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   302: aload_0        
        //   303: getfield        com/whatsapp/notification/PopupNotification.p:Ljava/util/ArrayList;
        //   306: invokevirtual   java/util/ArrayList.size:()I
        //   309: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   312: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   315: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   318: aload_0        
        //   319: getfield        com/whatsapp/notification/PopupNotification.p:Ljava/util/ArrayList;
        //   322: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //   325: ifeq            389
        //   328: aload_0        
        //   329: invokevirtual   com/whatsapp/notification/PopupNotification.finish:()V
        //   332: return         
        //   333: astore          9
        //   335: aload           9
        //   337: athrow         
        //   338: astore          4
        //   340: aload           4
        //   342: athrow         
        //   343: astore          5
        //   345: aload           5
        //   347: athrow         
        //   348: iconst_0       
        //   349: istore          7
        //   351: goto            92
        //   354: astore          45
        //   356: aload           45
        //   358: athrow         
        //   359: astore          46
        //   361: aload           46
        //   363: athrow         
        //   364: astore          47
        //   366: aload           47
        //   368: athrow         
        //   369: astore          52
        //   371: aload           52
        //   373: athrow         
        //   374: astore          53
        //   376: aload           53
        //   378: athrow         
        //   379: astore          54
        //   381: aload           54
        //   383: athrow         
        //   384: astore          55
        //   386: aload           55
        //   388: athrow         
        //   389: aload_0        
        //   390: getfield        com/whatsapp/notification/PopupNotification.p:Ljava/util/ArrayList;
        //   393: invokevirtual   java/util/ArrayList.size:()I
        //   396: istore          12
        //   398: iload           12
        //   400: iconst_1       
        //   401: if_icmpne       450
        //   404: aload_0        
        //   405: ldc_w           2131755717
        //   408: invokevirtual   com/whatsapp/notification/PopupNotification.findViewById:(I)Landroid/view/View;
        //   411: bipush          8
        //   413: invokevirtual   android/view/View.setVisibility:(I)V
        //   416: aload_0        
        //   417: ldc_w           2131755716
        //   420: invokevirtual   com/whatsapp/notification/PopupNotification.findViewById:(I)Landroid/view/View;
        //   423: bipush          8
        //   425: invokevirtual   android/view/View.setVisibility:(I)V
        //   428: aload_0        
        //   429: getfield        com/whatsapp/notification/PopupNotification.w:Landroid/view/View;
        //   432: bipush          8
        //   434: invokevirtual   android/view/View.setVisibility:(I)V
        //   437: aload_0        
        //   438: getfield        com/whatsapp/notification/PopupNotification.m:Landroid/view/View;
        //   441: bipush          8
        //   443: invokevirtual   android/view/View.setVisibility:(I)V
        //   446: iload_1        
        //   447: ifeq            488
        //   450: aload_0        
        //   451: ldc_w           2131755717
        //   454: invokevirtual   com/whatsapp/notification/PopupNotification.findViewById:(I)Landroid/view/View;
        //   457: iconst_0       
        //   458: invokevirtual   android/view/View.setVisibility:(I)V
        //   461: aload_0        
        //   462: ldc_w           2131755716
        //   465: invokevirtual   com/whatsapp/notification/PopupNotification.findViewById:(I)Landroid/view/View;
        //   468: iconst_0       
        //   469: invokevirtual   android/view/View.setVisibility:(I)V
        //   472: aload_0        
        //   473: getfield        com/whatsapp/notification/PopupNotification.w:Landroid/view/View;
        //   476: iconst_0       
        //   477: invokevirtual   android/view/View.setVisibility:(I)V
        //   480: aload_0        
        //   481: getfield        com/whatsapp/notification/PopupNotification.m:Landroid/view/View;
        //   484: iconst_0       
        //   485: invokevirtual   android/view/View.setVisibility:(I)V
        //   488: aload_0        
        //   489: getfield        com/whatsapp/notification/PopupNotification.p:Ljava/util/ArrayList;
        //   492: new             Lcom/whatsapp/notification/o;
        //   495: dup            
        //   496: aload_0        
        //   497: invokespecial   com/whatsapp/notification/o.<init>:(Lcom/whatsapp/notification/PopupNotification;)V
        //   500: invokestatic    java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
        //   503: aload_0        
        //   504: getfield        com/whatsapp/notification/PopupNotification.B:Lcom/whatsapp/GalleryView;
        //   507: invokevirtual   com/whatsapp/GalleryView.removeAllViews:()V
        //   510: aload_0        
        //   511: getfield        com/whatsapp/notification/PopupNotification.p:Ljava/util/ArrayList;
        //   514: invokevirtual   java/util/ArrayList.size:()I
        //   517: iconst_1       
        //   518: if_icmple       585
        //   521: new             Landroid/widget/TextView;
        //   524: dup            
        //   525: aload_0        
        //   526: invokespecial   android/widget/TextView.<init>:(Landroid/content/Context;)V
        //   529: astore          13
        //   531: aload           13
        //   533: bipush          17
        //   535: invokevirtual   android/widget/TextView.setGravity:(I)V
        //   538: new             Landroid/widget/RelativeLayout;
        //   541: dup            
        //   542: aload_0        
        //   543: invokespecial   android/widget/RelativeLayout.<init>:(Landroid/content/Context;)V
        //   546: astore          14
        //   548: new             Landroid/widget/RelativeLayout$LayoutParams;
        //   551: dup            
        //   552: iconst_m1      
        //   553: bipush          -2
        //   555: invokespecial   android/widget/RelativeLayout$LayoutParams.<init>:(II)V
        //   558: astore          15
        //   560: aload           15
        //   562: bipush          13
        //   564: invokevirtual   android/widget/RelativeLayout$LayoutParams.addRule:(I)V
        //   567: aload           14
        //   569: aload           13
        //   571: aload           15
        //   573: invokevirtual   android/widget/RelativeLayout.addView:(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
        //   576: aload_0        
        //   577: getfield        com/whatsapp/notification/PopupNotification.B:Lcom/whatsapp/GalleryView;
        //   580: aload           14
        //   582: invokevirtual   com/whatsapp/GalleryView.addView:(Landroid/view/View;)V
        //   585: aload_0        
        //   586: getfield        com/whatsapp/notification/PopupNotification.p:Ljava/util/ArrayList;
        //   589: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   592: astore          16
        //   594: aload           16
        //   596: invokeinterface java/util/Iterator.hasNext:()Z
        //   601: ifeq            688
        //   604: aload_0        
        //   605: aload           16
        //   607: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   612: checkcast       Lcom/whatsapp/protocol/bi;
        //   615: invokespecial   com/whatsapp/notification/PopupNotification.c:(Lcom/whatsapp/protocol/bi;)Landroid/view/View;
        //   618: astore          40
        //   620: new             Landroid/widget/RelativeLayout;
        //   623: dup            
        //   624: aload_0        
        //   625: invokespecial   android/widget/RelativeLayout.<init>:(Landroid/content/Context;)V
        //   628: astore          41
        //   630: new             Landroid/widget/ScrollView;
        //   633: dup            
        //   634: aload_0        
        //   635: invokespecial   android/widget/ScrollView.<init>:(Landroid/content/Context;)V
        //   638: astore          42
        //   640: new             Landroid/widget/RelativeLayout$LayoutParams;
        //   643: dup            
        //   644: iconst_m1      
        //   645: bipush          -2
        //   647: invokespecial   android/widget/RelativeLayout$LayoutParams.<init>:(II)V
        //   650: astore          43
        //   652: aload           43
        //   654: bipush          13
        //   656: invokevirtual   android/widget/RelativeLayout$LayoutParams.addRule:(I)V
        //   659: aload           42
        //   661: aload           40
        //   663: invokevirtual   android/widget/ScrollView.addView:(Landroid/view/View;)V
        //   666: aload           41
        //   668: aload           42
        //   670: aload           43
        //   672: invokevirtual   android/widget/RelativeLayout.addView:(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
        //   675: aload_0        
        //   676: getfield        com/whatsapp/notification/PopupNotification.B:Lcom/whatsapp/GalleryView;
        //   679: aload           41
        //   681: invokevirtual   com/whatsapp/GalleryView.addView:(Landroid/view/View;)V
        //   684: iload_1        
        //   685: ifeq            594
        //   688: aload_0        
        //   689: getfield        com/whatsapp/notification/PopupNotification.p:Ljava/util/ArrayList;
        //   692: invokevirtual   java/util/ArrayList.size:()I
        //   695: iconst_1       
        //   696: if_icmple       763
        //   699: new             Landroid/widget/TextView;
        //   702: dup            
        //   703: aload_0        
        //   704: invokespecial   android/widget/TextView.<init>:(Landroid/content/Context;)V
        //   707: astore          17
        //   709: aload           17
        //   711: bipush          17
        //   713: invokevirtual   android/widget/TextView.setGravity:(I)V
        //   716: new             Landroid/widget/RelativeLayout;
        //   719: dup            
        //   720: aload_0        
        //   721: invokespecial   android/widget/RelativeLayout.<init>:(Landroid/content/Context;)V
        //   724: astore          18
        //   726: new             Landroid/widget/RelativeLayout$LayoutParams;
        //   729: dup            
        //   730: iconst_m1      
        //   731: bipush          -2
        //   733: invokespecial   android/widget/RelativeLayout$LayoutParams.<init>:(II)V
        //   736: astore          19
        //   738: aload           19
        //   740: bipush          13
        //   742: invokevirtual   android/widget/RelativeLayout$LayoutParams.addRule:(I)V
        //   745: aload           18
        //   747: aload           17
        //   749: aload           19
        //   751: invokevirtual   android/widget/RelativeLayout.addView:(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
        //   754: aload_0        
        //   755: getfield        com/whatsapp/notification/PopupNotification.B:Lcom/whatsapp/GalleryView;
        //   758: aload           18
        //   760: invokevirtual   com/whatsapp/GalleryView.addView:(Landroid/view/View;)V
        //   763: aload_0        
        //   764: getfield        com/whatsapp/notification/PopupNotification.u:Lcom/whatsapp/protocol/bi;
        //   767: astore          21
        //   769: aload           21
        //   771: ifnull          1103
        //   774: iload           7
        //   776: ifeq            802
        //   779: new             Landroid/os/Handler;
        //   782: dup            
        //   783: invokespecial   android/os/Handler.<init>:()V
        //   786: new             Lcom/whatsapp/notification/c;
        //   789: dup            
        //   790: aload_0        
        //   791: invokespecial   com/whatsapp/notification/c.<init>:(Lcom/whatsapp/notification/PopupNotification;)V
        //   794: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   797: pop            
        //   798: iload_1        
        //   799: ifeq            1103
        //   802: aload_0        
        //   803: getfield        com/whatsapp/notification/PopupNotification.p:Ljava/util/ArrayList;
        //   806: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   809: astore          33
        //   811: iconst_0       
        //   812: istore          22
        //   814: aload           33
        //   816: invokeinterface java/util/Iterator.hasNext:()Z
        //   821: ifeq            876
        //   824: aload           33
        //   826: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   831: checkcast       Lcom/whatsapp/protocol/bi;
        //   834: astore          34
        //   836: aload           34
        //   838: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   841: aload_0        
        //   842: getfield        com/whatsapp/notification/PopupNotification.u:Lcom/whatsapp/protocol/bi;
        //   845: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   848: invokevirtual   com/whatsapp/protocol/c6.equals:(Ljava/lang/Object;)Z
        //   851: istore          37
        //   853: iload           37
        //   855: ifeq            862
        //   858: iload_1        
        //   859: ifeq            876
        //   862: iload           22
        //   864: iconst_1       
        //   865: iadd           
        //   866: istore          38
        //   868: iload_1        
        //   869: ifeq            1096
        //   872: iload           38
        //   874: istore          22
        //   876: iload           22
        //   878: aload_0        
        //   879: getfield        com/whatsapp/notification/PopupNotification.p:Ljava/util/ArrayList;
        //   882: invokevirtual   java/util/ArrayList.size:()I
        //   885: if_icmpne       891
        //   888: iconst_0       
        //   889: istore          22
        //   891: aload_0        
        //   892: getfield        com/whatsapp/notification/PopupNotification.B:Lcom/whatsapp/GalleryView;
        //   895: aload_0        
        //   896: iload           22
        //   898: invokespecial   com/whatsapp/notification/PopupNotification.c:(I)I
        //   901: invokevirtual   com/whatsapp/GalleryView.setCurrentScreen:(I)V
        //   904: aload_0        
        //   905: ldc_w           2130968587
        //   908: invokestatic    android/view/animation/AnimationUtils.loadAnimation:(Landroid/content/Context;I)Landroid/view/animation/Animation;
        //   911: astore          23
        //   913: iload           7
        //   915: ifeq            1065
        //   918: iconst_1       
        //   919: istore          24
        //   921: aload           23
        //   923: iload           24
        //   925: getstatic       com/whatsapp/notification/PopupNotification.M:I
        //   928: imul           
        //   929: i2l            
        //   930: invokevirtual   android/view/animation/Animation.setDuration:(J)V
        //   933: aload           23
        //   935: iconst_1       
        //   936: invokevirtual   android/view/animation/Animation.setFillAfter:(Z)V
        //   939: aload_0        
        //   940: getfield        com/whatsapp/notification/PopupNotification.y:Landroid/widget/TextView;
        //   943: aload           23
        //   945: invokevirtual   android/widget/TextView.startAnimation:(Landroid/view/animation/Animation;)V
        //   948: aload_0        
        //   949: getfield        com/whatsapp/notification/PopupNotification.p:Ljava/util/ArrayList;
        //   952: iconst_0       
        //   953: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   956: checkcast       Lcom/whatsapp/protocol/bi;
        //   959: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   962: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   965: invokestatic    com/whatsapp/z8.a:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   968: astore          25
        //   970: aload           25
        //   972: invokevirtual   com/whatsapp/a_9.m:()Z
        //   975: istore          32
        //   977: iload           32
        //   979: ifeq            1010
        //   982: iload_2        
        //   983: iconst_2       
        //   984: if_icmpeq       992
        //   987: iload_2        
        //   988: iconst_3       
        //   989: if_icmpne       45
        //   992: aload_0        
        //   993: invokevirtual   com/whatsapp/notification/PopupNotification.getWindow:()Landroid/view/Window;
        //   996: ldc_w           524288
        //   999: invokevirtual   android/view/Window.addFlags:(I)V
        //  1002: aload_0        
        //  1003: invokespecial   com/whatsapp/notification/PopupNotification.i:()V
        //  1006: iload_1        
        //  1007: ifeq            45
        //  1010: iload_3        
        //  1011: iconst_2       
        //  1012: if_icmpeq       1020
        //  1015: iload_3        
        //  1016: iconst_3       
        //  1017: if_icmpne       45
        //  1020: aload_0        
        //  1021: invokevirtual   com/whatsapp/notification/PopupNotification.getWindow:()Landroid/view/Window;
        //  1024: ldc_w           524288
        //  1027: invokevirtual   android/view/Window.addFlags:(I)V
        //  1030: aload_0        
        //  1031: invokespecial   com/whatsapp/notification/PopupNotification.i:()V
        //  1034: return         
        //  1035: astore          31
        //  1037: aload           31
        //  1039: athrow         
        //  1040: astore          10
        //  1042: aload           10
        //  1044: athrow         
        //  1045: astore          11
        //  1047: aload           11
        //  1049: athrow         
        //  1050: astore          20
        //  1052: aload           20
        //  1054: athrow         
        //  1055: astore          35
        //  1057: aload           35
        //  1059: athrow         
        //  1060: astore          36
        //  1062: aload           36
        //  1064: athrow         
        //  1065: iconst_2       
        //  1066: istore          24
        //  1068: goto            921
        //  1071: astore          26
        //  1073: aload           26
        //  1075: athrow         
        //  1076: astore          27
        //  1078: aload           27
        //  1080: athrow         
        //  1081: astore          28
        //  1083: aload           28
        //  1085: athrow         
        //  1086: astore          29
        //  1088: aload           29
        //  1090: athrow         
        //  1091: astore          30
        //  1093: aload           30
        //  1095: athrow         
        //  1096: iload           38
        //  1098: istore          22
        //  1100: goto            814
        //  1103: iconst_0       
        //  1104: istore          22
        //  1106: goto            891
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  41     45     46     51     Ljava/lang/IllegalArgumentException;
        //  51     64     338    343    Ljava/lang/IllegalArgumentException;
        //  69     84     343    348    Ljava/lang/IllegalArgumentException;
        //  136    143    354    359    Ljava/lang/IllegalArgumentException;
        //  148    155    359    369    Ljava/lang/IllegalArgumentException;
        //  219    233    369    374    Ljava/lang/IllegalArgumentException;
        //  238    245    374    384    Ljava/lang/IllegalArgumentException;
        //  254    264    384    389    Ljava/lang/IllegalArgumentException;
        //  268    278    384    389    Ljava/lang/IllegalArgumentException;
        //  286    332    333    338    Ljava/lang/IllegalArgumentException;
        //  340    343    343    348    Ljava/lang/IllegalArgumentException;
        //  356    359    359    369    Ljava/lang/IllegalArgumentException;
        //  361    364    364    369    Ljava/lang/IllegalArgumentException;
        //  371    374    374    384    Ljava/lang/IllegalArgumentException;
        //  376    379    379    384    Ljava/lang/IllegalArgumentException;
        //  381    384    384    389    Ljava/lang/IllegalArgumentException;
        //  389    398    1040   1045   Ljava/lang/IllegalArgumentException;
        //  404    446    1045   1050   Ljava/lang/IllegalArgumentException;
        //  450    488    1045   1050   Ljava/lang/IllegalArgumentException;
        //  763    769    1050   1055   Ljava/lang/IllegalArgumentException;
        //  836    853    1055   1065   Ljava/lang/IllegalArgumentException;
        //  970    977    1071   1086   Ljava/lang/IllegalArgumentException;
        //  992    1006   1086   1096   Ljava/lang/IllegalArgumentException;
        //  1020   1034   1035   1040   Ljava/lang/IllegalArgumentException;
        //  1042   1045   1045   1050   Ljava/lang/IllegalArgumentException;
        //  1057   1060   1060   1065   Ljava/lang/IllegalArgumentException;
        //  1073   1076   1076   1086   Ljava/lang/IllegalArgumentException;
        //  1078   1081   1081   1086   Ljava/lang/IllegalArgumentException;
        //  1083   1086   1086   1096   Ljava/lang/IllegalArgumentException;
        //  1088   1091   1091   1096   Ljava/lang/IllegalArgumentException;
        //  1093   1096   1035   1040   Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 512, Size: 512
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
    
    public void onBackPressed() {
        super.onBackPressed();
        this.d();
    }
    
    protected void onCreate(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/notification/PopupNotification.A:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: iconst_1       
        //     6: invokevirtual   com/whatsapp/notification/PopupNotification.requestWindowFeature:(I)Z
        //     9: pop            
        //    10: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    13: bipush          17
        //    15: if_icmplt       29
        //    18: aload_0        
        //    19: invokevirtual   com/whatsapp/notification/PopupNotification.getWindow:()Landroid/view/Window;
        //    22: invokevirtual   android/view/Window.getDecorView:()Landroid/view/View;
        //    25: iconst_3       
        //    26: invokevirtual   android/view/View.setLayoutDirection:(I)V
        //    29: aload_0        
        //    30: aload_1        
        //    31: invokespecial   android/app/Activity.onCreate:(Landroid/os/Bundle;)V
        //    34: aload_0        
        //    35: invokevirtual   com/whatsapp/notification/PopupNotification.getWindow:()Landroid/view/Window;
        //    38: new             Landroid/graphics/drawable/ColorDrawable;
        //    41: dup            
        //    42: aload_0        
        //    43: invokevirtual   com/whatsapp/notification/PopupNotification.getResources:()Landroid/content/res/Resources;
        //    46: ldc_w           2131624024
        //    49: invokevirtual   android/content/res/Resources.getColor:(I)I
        //    52: invokespecial   android/graphics/drawable/ColorDrawable.<init>:(I)V
        //    55: invokevirtual   android/view/Window.setBackgroundDrawable:(Landroid/graphics/drawable/Drawable;)V
        //    58: aload_0        
        //    59: aload_0        
        //    60: getstatic       com/whatsapp/notification/PopupNotification.z:[Ljava/lang/String;
        //    63: bipush          13
        //    65: aaload         
        //    66: invokevirtual   com/whatsapp/notification/PopupNotification.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    69: checkcast       Landroid/hardware/SensorManager;
        //    72: putfield        com/whatsapp/notification/PopupNotification.I:Landroid/hardware/SensorManager;
        //    75: aload_0        
        //    76: aload_0        
        //    77: getfield        com/whatsapp/notification/PopupNotification.I:Landroid/hardware/SensorManager;
        //    80: bipush          8
        //    82: invokevirtual   android/hardware/SensorManager.getDefaultSensor:(I)Landroid/hardware/Sensor;
        //    85: putfield        com/whatsapp/notification/PopupNotification.q:Landroid/hardware/Sensor;
        //    88: getstatic       com/whatsapp/notification/PopupNotification.z:[Ljava/lang/String;
        //    91: bipush          15
        //    93: aaload         
        //    94: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    97: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   100: getstatic       com/whatsapp/notification/PopupNotification.z:[Ljava/lang/String;
        //   103: bipush          14
        //   105: aaload         
        //   106: invokevirtual   com/whatsapp/App.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   109: checkcast       Landroid/os/PowerManager;
        //   112: astore          5
        //   114: aload           5
        //   116: ifnull          137
        //   119: aload_0        
        //   120: aload           5
        //   122: ldc_w           268435466
        //   125: getstatic       com/whatsapp/notification/PopupNotification.z:[Ljava/lang/String;
        //   128: bipush          16
        //   130: aaload         
        //   131: invokevirtual   android/os/PowerManager.newWakeLock:(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
        //   134: putfield        com/whatsapp/notification/PopupNotification.E:Landroid/os/PowerManager$WakeLock;
        //   137: aload_0        
        //   138: aload_0        
        //   139: invokevirtual   com/whatsapp/notification/PopupNotification.getLayoutInflater:()Landroid/view/LayoutInflater;
        //   142: ldc_w           2130903203
        //   145: aconst_null    
        //   146: iconst_0       
        //   147: invokestatic    com/whatsapp/alm.a:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //   150: invokevirtual   com/whatsapp/notification/PopupNotification.setContentView:(Landroid/view/View;)V
        //   153: aload_0        
        //   154: putstatic       com/whatsapp/notification/PopupNotification.s:Lcom/whatsapp/notification/PopupNotification;
        //   157: aload_0        
        //   158: invokestatic    com/whatsapp/vc.b:()Lcom/whatsapp/vc;
        //   161: putfield        com/whatsapp/notification/PopupNotification.x:Lcom/whatsapp/vc;
        //   164: aload_0        
        //   165: aload_0        
        //   166: ldc_w           2131755720
        //   169: invokevirtual   com/whatsapp/notification/PopupNotification.findViewById:(I)Landroid/view/View;
        //   172: checkcast       Lcom/whatsapp/GalleryView;
        //   175: putfield        com/whatsapp/notification/PopupNotification.B:Lcom/whatsapp/GalleryView;
        //   178: aload_0        
        //   179: aload_0        
        //   180: ldc_w           2131755447
        //   183: invokevirtual   com/whatsapp/notification/PopupNotification.findViewById:(I)Landroid/view/View;
        //   186: checkcast       Lcom/whatsapp/ConversationTextEntry;
        //   189: putfield        com/whatsapp/notification/PopupNotification.i:Lcom/whatsapp/ConversationTextEntry;
        //   192: aload_0        
        //   193: aload_0        
        //   194: ldc_w           2131755722
        //   197: invokevirtual   com/whatsapp/notification/PopupNotification.findViewById:(I)Landroid/view/View;
        //   200: checkcast       Landroid/widget/Button;
        //   203: putfield        com/whatsapp/notification/PopupNotification.k:Landroid/widget/Button;
        //   206: aload_0        
        //   207: aload_0        
        //   208: ldc_w           2131755715
        //   211: invokevirtual   com/whatsapp/notification/PopupNotification.findViewById:(I)Landroid/view/View;
        //   214: checkcast       Landroid/widget/TextView;
        //   217: putfield        com/whatsapp/notification/PopupNotification.d:Landroid/widget/TextView;
        //   220: aload_0        
        //   221: aload_0        
        //   222: ldc_w           2131755362
        //   225: invokevirtual   com/whatsapp/notification/PopupNotification.findViewById:(I)Landroid/view/View;
        //   228: checkcast       Landroid/widget/TextView;
        //   231: putfield        com/whatsapp/notification/PopupNotification.t:Landroid/widget/TextView;
        //   234: aload_0        
        //   235: aload_0        
        //   236: ldc_w           2131755718
        //   239: invokevirtual   com/whatsapp/notification/PopupNotification.findViewById:(I)Landroid/view/View;
        //   242: checkcast       Landroid/widget/TextView;
        //   245: putfield        com/whatsapp/notification/PopupNotification.y:Landroid/widget/TextView;
        //   248: aload_0        
        //   249: aload_0        
        //   250: ldc_w           2131755612
        //   253: invokevirtual   com/whatsapp/notification/PopupNotification.findViewById:(I)Landroid/view/View;
        //   256: putfield        com/whatsapp/notification/PopupNotification.b:Landroid/view/View;
        //   259: aload_0        
        //   260: getfield        com/whatsapp/notification/PopupNotification.b:Landroid/view/View;
        //   263: checkcast       Landroid/widget/ImageView;
        //   266: new             Lcom/whatsapp/util/m;
        //   269: dup            
        //   270: aload_0        
        //   271: invokevirtual   com/whatsapp/notification/PopupNotification.getResources:()Landroid/content/res/Resources;
        //   274: ldc_w           2130839066
        //   277: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   280: invokespecial   com/whatsapp/util/m.<init>:(Landroid/graphics/drawable/Drawable;)V
        //   283: invokevirtual   android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   286: aload_0        
        //   287: aload_0        
        //   288: ldc_w           2131755713
        //   291: invokevirtual   com/whatsapp/notification/PopupNotification.findViewById:(I)Landroid/view/View;
        //   294: putfield        com/whatsapp/notification/PopupNotification.w:Landroid/view/View;
        //   297: aload_0        
        //   298: aload_0        
        //   299: ldc_w           2131755611
        //   302: invokevirtual   com/whatsapp/notification/PopupNotification.findViewById:(I)Landroid/view/View;
        //   305: putfield        com/whatsapp/notification/PopupNotification.r:Landroid/view/View;
        //   308: aload_0        
        //   309: getfield        com/whatsapp/notification/PopupNotification.r:Landroid/view/View;
        //   312: checkcast       Landroid/widget/ImageView;
        //   315: new             Lcom/whatsapp/util/m;
        //   318: dup            
        //   319: aload_0        
        //   320: invokevirtual   com/whatsapp/notification/PopupNotification.getResources:()Landroid/content/res/Resources;
        //   323: ldc_w           2130839067
        //   326: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   329: invokespecial   com/whatsapp/util/m.<init>:(Landroid/graphics/drawable/Drawable;)V
        //   332: invokevirtual   android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   335: aload_0        
        //   336: aload_0        
        //   337: ldc_w           2131755712
        //   340: invokevirtual   com/whatsapp/notification/PopupNotification.findViewById:(I)Landroid/view/View;
        //   343: putfield        com/whatsapp/notification/PopupNotification.m:Landroid/view/View;
        //   346: aload_0        
        //   347: aload_0        
        //   348: ldc_w           2131755456
        //   351: invokevirtual   com/whatsapp/notification/PopupNotification.findViewById:(I)Landroid/view/View;
        //   354: checkcast       Landroid/widget/ImageButton;
        //   357: putfield        com/whatsapp/notification/PopupNotification.D:Landroid/widget/ImageButton;
        //   360: aload_0        
        //   361: aload_0        
        //   362: ldc_w           2131755457
        //   365: invokevirtual   com/whatsapp/notification/PopupNotification.findViewById:(I)Landroid/view/View;
        //   368: checkcast       Landroid/widget/ImageButton;
        //   371: putfield        com/whatsapp/notification/PopupNotification.K:Landroid/widget/ImageButton;
        //   374: aload_0        
        //   375: getfield        com/whatsapp/notification/PopupNotification.B:Lcom/whatsapp/GalleryView;
        //   378: new             Lcom/whatsapp/notification/h;
        //   381: dup            
        //   382: aload_0        
        //   383: invokespecial   com/whatsapp/notification/h.<init>:(Lcom/whatsapp/notification/PopupNotification;)V
        //   386: invokevirtual   com/whatsapp/GalleryView.setEventCallback:(Lcom/whatsapp/awc;)V
        //   389: aload_0        
        //   390: ldc_w           2131755721
        //   393: invokevirtual   com/whatsapp/notification/PopupNotification.findViewById:(I)Landroid/view/View;
        //   396: checkcast       Landroid/widget/Button;
        //   399: new             Lcom/whatsapp/notification/a3;
        //   402: dup            
        //   403: aload_0        
        //   404: invokespecial   com/whatsapp/notification/a3.<init>:(Lcom/whatsapp/notification/PopupNotification;)V
        //   407: invokevirtual   android/widget/Button.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   410: aload_0        
        //   411: new             Lcom/whatsapp/notification/m;
        //   414: dup            
        //   415: aload_0        
        //   416: invokespecial   com/whatsapp/notification/m.<init>:(Lcom/whatsapp/notification/PopupNotification;)V
        //   419: putfield        com/whatsapp/notification/PopupNotification.e:Landroid/view/View$OnClickListener;
        //   422: aload_0        
        //   423: getfield        com/whatsapp/notification/PopupNotification.k:Landroid/widget/Button;
        //   426: aload_0        
        //   427: getfield        com/whatsapp/notification/PopupNotification.e:Landroid/view/View$OnClickListener;
        //   430: invokevirtual   android/widget/Button.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   433: new             Lcom/whatsapp/notification/ac;
        //   436: dup            
        //   437: aload_0        
        //   438: invokespecial   com/whatsapp/notification/ac.<init>:(Lcom/whatsapp/notification/PopupNotification;)V
        //   441: astore          6
        //   443: aload_0        
        //   444: getfield        com/whatsapp/notification/PopupNotification.b:Landroid/view/View;
        //   447: aload           6
        //   449: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   452: aload_0        
        //   453: getfield        com/whatsapp/notification/PopupNotification.w:Landroid/view/View;
        //   456: aload           6
        //   458: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   461: new             Lcom/whatsapp/notification/t;
        //   464: dup            
        //   465: aload_0        
        //   466: invokespecial   com/whatsapp/notification/t.<init>:(Lcom/whatsapp/notification/PopupNotification;)V
        //   469: astore          7
        //   471: aload_0        
        //   472: getfield        com/whatsapp/notification/PopupNotification.r:Landroid/view/View;
        //   475: aload           7
        //   477: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   480: aload_0        
        //   481: getfield        com/whatsapp/notification/PopupNotification.m:Landroid/view/View;
        //   484: aload           7
        //   486: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   489: aload_0        
        //   490: getfield        com/whatsapp/notification/PopupNotification.D:Landroid/widget/ImageButton;
        //   493: new             Lcom/whatsapp/util/m;
        //   496: dup            
        //   497: aload_0        
        //   498: invokevirtual   com/whatsapp/notification/PopupNotification.getResources:()Landroid/content/res/Resources;
        //   501: ldc_w           2130838884
        //   504: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   507: invokespecial   com/whatsapp/util/m.<init>:(Landroid/graphics/drawable/Drawable;)V
        //   510: invokevirtual   android/widget/ImageButton.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   513: aload_0        
        //   514: ldc_w           2131755444
        //   517: invokevirtual   com/whatsapp/notification/PopupNotification.findViewById:(I)Landroid/view/View;
        //   520: new             Lcom/whatsapp/util/m;
        //   523: dup            
        //   524: aload_0        
        //   525: invokevirtual   com/whatsapp/notification/PopupNotification.getResources:()Landroid/content/res/Resources;
        //   528: ldc_w           2130838869
        //   531: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   534: invokespecial   com/whatsapp/util/m.<init>:(Landroid/graphics/drawable/Drawable;)V
        //   537: invokevirtual   android/view/View.setBackgroundDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   540: aload_0        
        //   541: getfield        com/whatsapp/notification/PopupNotification.i:Lcom/whatsapp/ConversationTextEntry;
        //   544: new             Lcom/whatsapp/notification/l;
        //   547: dup            
        //   548: aload_0        
        //   549: invokespecial   com/whatsapp/notification/l.<init>:(Lcom/whatsapp/notification/PopupNotification;)V
        //   552: invokevirtual   com/whatsapp/ConversationTextEntry.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   555: aload_0        
        //   556: new             Lcom/whatsapp/notification/k;
        //   559: dup            
        //   560: aload_0        
        //   561: aload_0        
        //   562: new             Lcom/whatsapp/notification/f;
        //   565: dup            
        //   566: aload_0        
        //   567: invokespecial   com/whatsapp/notification/f.<init>:(Lcom/whatsapp/notification/PopupNotification;)V
        //   570: invokespecial   com/whatsapp/notification/k.<init>:(Lcom/whatsapp/notification/PopupNotification;Landroid/app/Activity;Lcom/whatsapp/gu;)V
        //   573: putfield        com/whatsapp/notification/PopupNotification.H:Lcom/whatsapp/ps;
        //   576: aload_0        
        //   577: getfield        com/whatsapp/notification/PopupNotification.K:Landroid/widget/ImageButton;
        //   580: iconst_0       
        //   581: invokevirtual   android/widget/ImageButton.setVisibility:(I)V
        //   584: aload_0        
        //   585: getfield        com/whatsapp/notification/PopupNotification.D:Landroid/widget/ImageButton;
        //   588: bipush          8
        //   590: invokevirtual   android/widget/ImageButton.setVisibility:(I)V
        //   593: new             Lcom/whatsapp/notification/s;
        //   596: dup            
        //   597: aload_0        
        //   598: invokespecial   com/whatsapp/notification/s.<init>:(Lcom/whatsapp/notification/PopupNotification;)V
        //   601: astore          8
        //   603: aload_0        
        //   604: getfield        com/whatsapp/notification/PopupNotification.i:Lcom/whatsapp/ConversationTextEntry;
        //   607: aload           8
        //   609: invokevirtual   com/whatsapp/ConversationTextEntry.addTextChangedListener:(Landroid/text/TextWatcher;)V
        //   612: new             Lcom/whatsapp/notification/ar;
        //   615: dup            
        //   616: aload_0        
        //   617: invokespecial   com/whatsapp/notification/ar.<init>:(Lcom/whatsapp/notification/PopupNotification;)V
        //   620: astore          9
        //   622: aload_0        
        //   623: getfield        com/whatsapp/notification/PopupNotification.i:Lcom/whatsapp/ConversationTextEntry;
        //   626: aload           9
        //   628: invokevirtual   com/whatsapp/ConversationTextEntry.setOnEditorActionListener:(Landroid/widget/TextView$OnEditorActionListener;)V
        //   631: aload_0        
        //   632: getfield        com/whatsapp/notification/PopupNotification.D:Landroid/widget/ImageButton;
        //   635: new             Lcom/whatsapp/notification/al;
        //   638: dup            
        //   639: aload_0        
        //   640: invokespecial   com/whatsapp/notification/al.<init>:(Lcom/whatsapp/notification/PopupNotification;)V
        //   643: invokevirtual   android/widget/ImageButton.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   646: aload_0        
        //   647: new             Lcom/whatsapp/n7;
        //   650: dup            
        //   651: aload_0        
        //   652: invokespecial   com/whatsapp/n7.<init>:(Landroid/app/Activity;)V
        //   655: putfield        com/whatsapp/notification/PopupNotification.j:Lcom/whatsapp/n7;
        //   658: aload_0        
        //   659: getfield        com/whatsapp/notification/PopupNotification.j:Lcom/whatsapp/n7;
        //   662: aload_0        
        //   663: getfield        com/whatsapp/notification/PopupNotification.o:Lcom/whatsapp/eu;
        //   666: invokevirtual   com/whatsapp/n7.a:(Lcom/whatsapp/eu;)V
        //   669: aload_0        
        //   670: getfield        com/whatsapp/notification/PopupNotification.j:Lcom/whatsapp/n7;
        //   673: aconst_null    
        //   674: invokevirtual   com/whatsapp/n7.a:(Landroid/widget/PopupWindow$OnDismissListener;)V
        //   677: aload_0        
        //   678: ldc_w           2131755446
        //   681: invokevirtual   com/whatsapp/notification/PopupNotification.findViewById:(I)Landroid/view/View;
        //   684: checkcast       Landroid/widget/ImageButton;
        //   687: astore          10
        //   689: aload           10
        //   691: new             Lcom/whatsapp/notification/r;
        //   694: dup            
        //   695: aload_0        
        //   696: invokespecial   com/whatsapp/notification/r.<init>:(Lcom/whatsapp/notification/PopupNotification;)V
        //   699: invokevirtual   android/widget/ImageButton.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   702: aload_0        
        //   703: invokevirtual   com/whatsapp/notification/PopupNotification.e:()V
        //   706: aload_0        
        //   707: invokestatic    com/whatsapp/App.b:(Lcom/whatsapp/aws;)V
        //   710: invokestatic    com/whatsapp/App.v:()Z
        //   713: ifeq            722
        //   716: aload_0        
        //   717: bipush          115
        //   719: invokevirtual   com/whatsapp/notification/PopupNotification.showDialog:(I)V
        //   722: iload_2        
        //   723: ifeq            744
        //   726: getstatic       com/whatsapp/DialogToastActivity.h:Z
        //   729: istore          13
        //   731: iload           13
        //   733: ifeq            763
        //   736: iconst_0       
        //   737: istore          14
        //   739: iload           14
        //   741: putstatic       com/whatsapp/DialogToastActivity.h:Z
        //   744: return         
        //   745: astore_3       
        //   746: aload_3        
        //   747: athrow         
        //   748: astore          15
        //   750: aload           15
        //   752: athrow         
        //   753: astore          11
        //   755: aload           11
        //   757: athrow         
        //   758: astore          12
        //   760: aload           12
        //   762: athrow         
        //   763: iconst_1       
        //   764: istore          14
        //   766: goto            739
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      29     745    748    Ljava/lang/IllegalArgumentException;
        //  119    137    748    753    Ljava/lang/IllegalArgumentException;
        //  689    722    753    758    Ljava/lang/IllegalArgumentException;
        //  726    731    758    763    Ljava/lang/IllegalArgumentException;
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
    
    public Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 116: {
                try {
                    return yt.a(this, this.n);
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
            case 115: {
                Log.i(PopupNotification.z[26]);
                return ade.a(this);
            }
            case 106: {
                return new AlertDialog$Builder((Context)this).setMessage(this.getString(2131230877, new Object[] { this.l.a((Context)this) })).setPositiveButton(2131231867, (DialogInterface$OnClickListener)new g(this)).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new d(this)).create();
            }
        }
    }
    
    public void onDestroy() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/notification/PopupNotification.A:Z
        //     3: istore_1       
        //     4: getstatic       com/whatsapp/notification/PopupNotification.z:[Ljava/lang/String;
        //     7: bipush          18
        //     9: aaload         
        //    10: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    13: aload_0        
        //    14: invokespecial   android/app/Activity.onDestroy:()V
        //    17: aload_0        
        //    18: getfield        com/whatsapp/notification/PopupNotification.a:Ljava/util/HashSet;
        //    21: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //    24: astore_2       
        //    25: aload_2        
        //    26: invokeinterface java/util/Iterator.hasNext:()Z
        //    31: ifeq            50
        //    34: aload_2        
        //    35: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    40: checkcast       Ljava/lang/String;
        //    43: invokestatic    com/whatsapp/util/b.c:(Ljava/lang/String;)V
        //    46: iload_1        
        //    47: ifeq            25
        //    50: aload_0        
        //    51: getfield        com/whatsapp/notification/PopupNotification.L:Landroid/os/Handler;
        //    54: aload_0        
        //    55: getfield        com/whatsapp/notification/PopupNotification.G:Ljava/lang/Runnable;
        //    58: invokevirtual   android/os/Handler.removeCallbacks:(Ljava/lang/Runnable;)V
        //    61: aload_0        
        //    62: getfield        com/whatsapp/notification/PopupNotification.f:Landroid/os/Handler;
        //    65: aload_0        
        //    66: getfield        com/whatsapp/notification/PopupNotification.g:Ljava/lang/Runnable;
        //    69: invokevirtual   android/os/Handler.removeCallbacks:(Ljava/lang/Runnable;)V
        //    72: aload_0        
        //    73: getfield        com/whatsapp/notification/PopupNotification.E:Landroid/os/PowerManager$WakeLock;
        //    76: astore          5
        //    78: aload           5
        //    80: ifnull          100
        //    83: aload_0        
        //    84: getfield        com/whatsapp/notification/PopupNotification.E:Landroid/os/PowerManager$WakeLock;
        //    87: invokevirtual   android/os/PowerManager$WakeLock.isHeld:()Z
        //    90: ifeq            100
        //    93: aload_0        
        //    94: getfield        com/whatsapp/notification/PopupNotification.E:Landroid/os/PowerManager$WakeLock;
        //    97: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   100: aload_0        
        //   101: getfield        com/whatsapp/notification/PopupNotification.h:Landroid/hardware/SensorEventListener;
        //   104: ifnull          118
        //   107: aload_0        
        //   108: getfield        com/whatsapp/notification/PopupNotification.I:Landroid/hardware/SensorManager;
        //   111: aload_0        
        //   112: getfield        com/whatsapp/notification/PopupNotification.h:Landroid/hardware/SensorEventListener;
        //   115: invokevirtual   android/hardware/SensorManager.unregisterListener:(Landroid/hardware/SensorEventListener;)V
        //   118: getstatic       com/whatsapp/notification/PopupNotification.s:Lcom/whatsapp/notification/PopupNotification;
        //   121: aload_0        
        //   122: if_acmpne       129
        //   125: aconst_null    
        //   126: putstatic       com/whatsapp/notification/PopupNotification.s:Lcom/whatsapp/notification/PopupNotification;
        //   129: invokestatic    com/whatsapp/up.h:()V
        //   132: aload_0        
        //   133: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/aws;)V
        //   136: return         
        //   137: astore_3       
        //   138: aload_3        
        //   139: athrow         
        //   140: astore          4
        //   142: aload           4
        //   144: athrow         
        //   145: astore          6
        //   147: aload           6
        //   149: athrow         
        //   150: astore          7
        //   152: aload           7
        //   154: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  50     78     137    140    Ljava/lang/IllegalArgumentException;
        //  83     100    140    145    Ljava/lang/IllegalArgumentException;
        //  100    118    145    150    Ljava/lang/IllegalArgumentException;
        //  118    129    150    155    Ljava/lang/IllegalArgumentException;
        //  138    140    140    145    Ljava/lang/IllegalArgumentException;
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
    
    protected void onPause() {
        Log.i(PopupNotification.z[7]);
        super.onPause();
        App.t();
    }
    
    protected void onResume() {
        Log.i(PopupNotification.z[29]);
        super.onResume();
    }
    
    protected void onStart() {
        Log.i(PopupNotification.z[28]);
        super.onStart();
        this.c = true;
    }
    
    public void onStop() {
        Log.i(PopupNotification.z[24]);
        super.onStop();
        this.c = false;
    }
}
