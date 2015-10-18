// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.b;
import android.support.v4.view.MenuItemCompat;
import android.view.Menu;
import com.whatsapp.util.Log;
import com.whatsapp.util.cq;
import android.app.Dialog;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.ContextMenu;
import android.widget.AdapterView$AdapterContextMenuInfo;
import android.view.MenuItem;
import android.content.res.Configuration;
import android.transition.Transition;
import android.transition.Slide;
import android.transition.TransitionSet;
import android.os.Build$VERSION;
import java.util.List;
import java.util.Collection;
import android.content.ActivityNotFoundException;
import android.widget.CompoundButton;
import android.support.v7.widget.SwitchCompat;
import android.view.ViewGroup;
import android.content.DialogInterface$OnClickListener;
import android.support.v7.app.AlertDialog$Builder;
import com.whatsapp.fieldstats.bq;
import java.util.Vector;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.app.Activity;
import android.os.Handler$Callback;
import android.os.Handler;
import java.util.ArrayList;
import android.os.AsyncTask;
import android.widget.LinearLayout;
import android.widget.ImageButton;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.ImageView;
import java.util.HashMap;
import android.widget.ListView;
import android.view.View;
import android.widget.TextView;

public class GroupChatInfo extends ChatInfoActivity implements aws
{
    private static final String[] T;
    private static GroupChatInfo y;
    private ah0 A;
    private TextView B;
    private View C;
    private View D;
    private ListView E;
    private a9q F;
    private gt G;
    private final sj H;
    private TextView I;
    private HashMap J;
    private View K;
    private ImageView L;
    private TextView M;
    private View N;
    CompoundButton$OnCheckedChangeListener O;
    private k0 P;
    private a_9 Q;
    private a_9 R;
    private View S;
    private ImageButton q;
    private LinearLayout r;
    private TextView s;
    private TextView t;
    private AsyncTask u;
    private ChatInfoLayout v;
    private ArrayList w;
    private final Handler x;
    private String z;
    
    static {
        final String[] t = new String[26];
        String s = "DY\rV=FS\u000bW\u0012~K\rF";
        int n = -1;
        String[] array = t;
        int n2 = 0;
        String intern = null;
    Label_0682:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'b';
                        break;
                    }
                    case 0: {
                        c2 = '!';
                        break;
                    }
                    case 1: {
                        c2 = '!';
                        break;
                    }
                    case 2: {
                        c2 = 'd';
                        break;
                    }
                    case 3: {
                        c2 = '\"';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "FH\u0000";
                    n2 = 1;
                    array = t;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "FS\u000bW\u0012BI\u0005V\u000bOG\u000b\r\u0001SD\u0005V\u000bNOIV\u000bLDKG\u0010SN\u0016\u0002";
                    n2 = 2;
                    array = t;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "FS\u000bW\u0012~H\nD\r\u000eB\u0016G\u0003UD";
                    n2 = 3;
                    array = t;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "FH\u0000";
                    n2 = 4;
                    array = t;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = t;
                    s = "BH\u0016A\u0017M@\u0016}\u0016S@\nQ\u000bUH\u000bL";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "RD\bG\u0001UD\u0000}\bHE";
                    n = 5;
                    array = t;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "FH\u0000";
                    n = 6;
                    array = t;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "BH\u0016A\u0017M@\u0016}\u0016S@\nQ\u000bUH\u000bL";
                    n = 7;
                    array = t;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "HR;P\u0007RD\u0010";
                    n = 8;
                    array = t;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "FS\u000bW\u0012~H\nD\r\u000eS\u0001Q\u0017MUKQ\tHQKA\rOU\u0005A\u0016\u0001O\u000bVB@E\u0000G\u0006\u0001";
                    n = 9;
                    array = t;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "FS\u000bW\u0012~H\nD\r\u000eS\u0001Q\u0017MUKA\rOU\u0005A\u0016\u0001O\u000bVB@E\u0000G\u0006\u0001";
                    n = 10;
                    array = t;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "BN\nV\u0003BU";
                    n = 11;
                    array = t;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "FS\u000bW\u0012BI\u0005V\u000bOG\u000b\r\u0003EEDG\u001aHR\u0010K\fF\u0001\u0007M\fU@\u0007VX\u0001@\u0007V\u000bWH\u0010[BON\u0010\u0002\u0004NT\nFN\u0001Q\u0016M\u0000@C\b[BU@\u0006N\u0007U";
                    n = 12;
                    array = t;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "RD\bG\u0001UD\u0000}\bHE";
                    n = 13;
                    array = t;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "FS\u000bW\u0012~H\nD\r\u000eB\fC\fFDDQ\u0017CK\u0001A\u0016\u001b";
                    n = 14;
                    array = t;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "WO\u0000\f\u0003OE\u0016M\u000bE\u000f\u0007W\u0010RN\u0016\f\u000bUD\t\r\u0001NO\u0010C\u0001U";
                    n = 15;
                    array = t;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "QI\u000bL\u0007~U\u001dR\u0007";
                    n = 16;
                    array = t;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "@O\u0000P\rHEJK\fUD\nVL@B\u0010K\rO\u000f-l1ds0}-s~!f+u";
                    n = 17;
                    array = t;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "QI\u000bL\u0007";
                    n = 18;
                    array = t;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "FS\u000bW\u0012\u0001H\nD\r\u000eB\u000bL\u0016DY\u0010\u0002\u0011XR\u0010G\u000f\u0001B\u000bL\u0016@B\u0010\u0002\u000eHR\u0010\u0002\u0001NT\bFBON\u0010\u0002\u0004NT\nF";
                    n = 19;
                    array = t;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "QI\u000bL\u0007";
                    n = 20;
                    array = t;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "@O\u0000P\rHEJK\fUD\nVL@B\u0010K\rO\u000f-l1ds0";
                    n = 21;
                    array = t;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "aRJU\n@U\u0017C\u0012Q\u000f\nG\u0016";
                    n = 22;
                    array = t;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "FS\u000bW\u0012~H\nD\r\u000eE\u0001Q\u0016SN\u001d";
                    n = 23;
                    array = t;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "DO\u0000}\u0005SN\u0011R=KH\u0000";
                    n = 24;
                    array = t;
                    continue;
                }
                case 24: {
                    break Label_0682;
                }
            }
        }
        array[n2] = intern;
        T = t;
    }
    
    public GroupChatInfo() {
        this.w = new ArrayList();
        this.J = new HashMap();
        this.F = new a9q();
        this.G = new awm(this);
        this.O = (CompoundButton$OnCheckedChangeListener)new aty(this);
        this.x = new Handler((Handler$Callback)new di(this));
        this.H = new sn(this);
    }
    
    static Handler a(final GroupChatInfo groupChatInfo) {
        return groupChatInfo.x;
    }
    
    static a_9 a(final GroupChatInfo groupChatInfo, final a_9 q) {
        return groupChatInfo.Q = q;
    }
    
    static void a(final GroupChatInfo groupChatInfo, final int n) {
        groupChatInfo.d(n);
    }
    
    static void a(final GroupChatInfo groupChatInfo, final String s) {
        groupChatInfo.g(s);
    }
    
    static void a(final GroupChatInfo groupChatInfo, final ArrayList list) {
        groupChatInfo.a(list);
    }
    
    public static void a(final a_9 a_9, final Activity activity) {
        a(a_9, activity, null);
    }
    
    public static void a(final a_9 a_9, final Activity activity, final ActivityOptionsCompat activityOptionsCompat) {
        while (true) {
            final Intent intent = new Intent((Context)activity, (Class)GroupChatInfo.class);
            while (true) {
                try {
                    intent.putExtra(GroupChatInfo.T[7], a_9.u);
                    intent.putExtra(GroupChatInfo.T[8], true);
                    if (activityOptionsCompat == null) {
                        final Bundle bundle = null;
                        ActivityCompat.startActivity(activity, intent, bundle);
                        return;
                    }
                }
                catch (NumberFormatException ex) {
                    throw ex;
                }
                final Bundle bundle = activityOptionsCompat.toBundle();
                continue;
            }
        }
    }
    
    private void a(final ArrayList list) {
        this.a(list, this.z);
    }
    
    static void b(final GroupChatInfo groupChatInfo) {
        groupChatInfo.f();
    }
    
    static void b(final GroupChatInfo groupChatInfo, final String s) {
        groupChatInfo.h(s);
    }
    
    static void b(final GroupChatInfo groupChatInfo, final ArrayList list) {
        groupChatInfo.b(list);
    }
    
    private void b(final ArrayList p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_1        
        //     5: invokevirtual   java/util/ArrayList.size:()I
        //     8: istore_3       
        //     9: aload_0        
        //    10: ldc             2131755597
        //    12: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //    15: astore          4
        //    17: iload_3        
        //    18: ifne            41
        //    21: aload_0        
        //    22: getfield        com/whatsapp/GroupChatInfo.B:Landroid/widget/TextView;
        //    25: bipush          8
        //    27: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //    30: aload           4
        //    32: bipush          8
        //    34: invokevirtual   android/view/View.setVisibility:(I)V
        //    37: iload_2        
        //    38: ifeq            436
        //    41: aload_0        
        //    42: getfield        com/whatsapp/GroupChatInfo.B:Landroid/widget/TextView;
        //    45: invokestatic    java/text/NumberFormat.getInstance:()Ljava/text/NumberFormat;
        //    48: iload_3        
        //    49: i2l            
        //    50: invokevirtual   java/text/NumberFormat.format:(J)Ljava/lang/String;
        //    53: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    56: aload_0        
        //    57: getfield        com/whatsapp/GroupChatInfo.B:Landroid/widget/TextView;
        //    60: iconst_0       
        //    61: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //    64: aload           4
        //    66: iconst_0       
        //    67: invokevirtual   android/view/View.setVisibility:(I)V
        //    70: aload_0        
        //    71: ldc_w           2131755602
        //    74: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //    77: checkcast       Landroid/view/ViewGroup;
        //    80: astore          5
        //    82: aload           5
        //    84: new             Lcom/whatsapp/r_;
        //    87: dup            
        //    88: aload_0        
        //    89: invokespecial   com/whatsapp/r_.<init>:(Lcom/whatsapp/GroupChatInfo;)V
        //    92: invokevirtual   android/view/ViewGroup.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    95: aload           5
        //    97: invokevirtual   android/view/ViewGroup.removeAllViews:()V
        //   100: aload_0        
        //   101: invokevirtual   com/whatsapp/GroupChatInfo.getResources:()Landroid/content/res/Resources;
        //   104: ldc_w           2131361935
        //   107: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   110: istore          6
        //   112: aload_0        
        //   113: invokevirtual   com/whatsapp/GroupChatInfo.getResources:()Landroid/content/res/Resources;
        //   116: ldc_w           2131361936
        //   119: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   122: istore          7
        //   124: new             Landroid/widget/ImageView;
        //   127: dup            
        //   128: aload_0        
        //   129: invokespecial   android/widget/ImageView.<init>:(Landroid/content/Context;)V
        //   132: astore          8
        //   134: aload           8
        //   136: ldc_w           2130839068
        //   139: invokevirtual   android/widget/ImageView.setBackgroundResource:(I)V
        //   142: aload           8
        //   144: iload           6
        //   146: iload           6
        //   148: iload           6
        //   150: iload           6
        //   152: invokevirtual   android/widget/ImageView.setPadding:(IIII)V
        //   155: aload           8
        //   157: new             Lcom/whatsapp/xx;
        //   160: dup            
        //   161: aload_0        
        //   162: invokespecial   com/whatsapp/xx.<init>:(Lcom/whatsapp/GroupChatInfo;)V
        //   165: invokevirtual   android/widget/ImageView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   168: aload           8
        //   170: new             Lcom/whatsapp/util/m;
        //   173: dup            
        //   174: aload_0        
        //   175: invokevirtual   com/whatsapp/GroupChatInfo.getResources:()Landroid/content/res/Resources;
        //   178: ldc_w           2130838704
        //   181: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   184: invokespecial   com/whatsapp/util/m.<init>:(Landroid/graphics/drawable/Drawable;)V
        //   187: invokevirtual   android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   190: aload           8
        //   192: getstatic       android/widget/ImageView$ScaleType.CENTER:Landroid/widget/ImageView$ScaleType;
        //   195: invokevirtual   android/widget/ImageView.setScaleType:(Landroid/widget/ImageView$ScaleType;)V
        //   198: aload_0        
        //   199: invokevirtual   com/whatsapp/GroupChatInfo.getResources:()Landroid/content/res/Resources;
        //   202: ldc_w           2131361934
        //   205: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   208: i2f            
        //   209: fstore          9
        //   211: aload_1        
        //   212: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   215: astore          10
        //   217: aload           10
        //   219: invokeinterface java/util/Iterator.hasNext:()Z
        //   224: ifeq            379
        //   227: aload           10
        //   229: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   234: checkcast       Lcom/whatsapp/protocol/bi;
        //   237: astore          13
        //   239: new             Lcom/whatsapp/ThumbnailTextButton;
        //   242: dup            
        //   243: aload_0        
        //   244: invokespecial   com/whatsapp/ThumbnailTextButton.<init>:(Landroid/content/Context;)V
        //   247: astore          14
        //   249: aload           14
        //   251: getstatic       android/widget/ImageView$ScaleType.CENTER_CROP:Landroid/widget/ImageView$ScaleType;
        //   254: invokevirtual   com/whatsapp/ThumbnailTextButton.setScaleType:(Landroid/widget/ImageView$ScaleType;)V
        //   257: aload           14
        //   259: new             Landroid/view/ViewGroup$LayoutParams;
        //   262: dup            
        //   263: iload           7
        //   265: iload           6
        //   267: iadd           
        //   268: iload           7
        //   270: iload           6
        //   272: iadd           
        //   273: invokespecial   android/view/ViewGroup$LayoutParams.<init>:(II)V
        //   276: invokevirtual   com/whatsapp/ThumbnailTextButton.setLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)V
        //   279: aload           14
        //   281: iload           6
        //   283: iload           6
        //   285: iload           6
        //   287: iload           6
        //   289: invokevirtual   com/whatsapp/ThumbnailTextButton.setPadding:(IIII)V
        //   292: aload           14
        //   294: fload           9
        //   296: invokevirtual   com/whatsapp/ThumbnailTextButton.setRadius:(F)V
        //   299: aload           14
        //   301: iload           7
        //   303: bipush          6
        //   305: idiv           
        //   306: i2f            
        //   307: invokevirtual   com/whatsapp/ThumbnailTextButton.setTextSize:(F)V
        //   310: aload           14
        //   312: fconst_1       
        //   313: invokevirtual   com/whatsapp/ThumbnailTextButton.setBorderSize:(F)V
        //   316: aload           14
        //   318: ldc_w           1711276032
        //   321: invokevirtual   com/whatsapp/ThumbnailTextButton.setBorderColor:(I)V
        //   324: aload           13
        //   326: invokestatic    com/whatsapp/util/b.a:(Lcom/whatsapp/protocol/bi;)Landroid/graphics/Bitmap;
        //   329: astore          15
        //   331: aload           15
        //   333: ifnonnull       342
        //   336: aload_0        
        //   337: invokestatic    com/whatsapp/util/b8.d:(Landroid/content/Context;)Landroid/graphics/Bitmap;
        //   340: astore          15
        //   342: aload           14
        //   344: aload           15
        //   346: invokevirtual   com/whatsapp/ThumbnailTextButton.setImageBitmap:(Landroid/graphics/Bitmap;)V
        //   349: aload           14
        //   351: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   354: aload           13
        //   356: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   359: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   362: invokevirtual   com/whatsapp/a_9.l:()Ljava/lang/String;
        //   365: invokevirtual   com/whatsapp/ThumbnailTextButton.setText:(Ljava/lang/CharSequence;)V
        //   368: aload           5
        //   370: aload           14
        //   372: invokevirtual   android/view/ViewGroup.addView:(Landroid/view/View;)V
        //   375: iload_2        
        //   376: ifeq            217
        //   379: aload_1        
        //   380: invokevirtual   java/util/ArrayList.size:()I
        //   383: bipush          12
        //   385: if_icmplt       395
        //   388: aload           5
        //   390: aload           8
        //   392: invokevirtual   android/view/ViewGroup.addView:(Landroid/view/View;)V
        //   395: aload           5
        //   397: invokestatic    com/whatsapp/alm.a:(Landroid/view/View;)V
        //   400: invokestatic    com/whatsapp/App.ak:()Z
        //   403: ifne            436
        //   406: aload_0        
        //   407: ldc_w           2131755601
        //   410: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   413: checkcast       Landroid/widget/HorizontalScrollView;
        //   416: astore          12
        //   418: aload           12
        //   420: invokevirtual   android/widget/HorizontalScrollView.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
        //   423: new             Lcom/whatsapp/an;
        //   426: dup            
        //   427: aload_0        
        //   428: aload           12
        //   430: invokespecial   com/whatsapp/an.<init>:(Lcom/whatsapp/GroupChatInfo;Landroid/widget/HorizontalScrollView;)V
        //   433: invokevirtual   android/view/ViewTreeObserver.addOnGlobalLayoutListener:(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
        //   436: return         
        //   437: astore          16
        //   439: aload           16
        //   441: athrow         
        //   442: astore          11
        //   444: aload           11
        //   446: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  21     37     437    442    Ljava/lang/NumberFormatException;
        //  379    395    442    447    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0379:
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
    
    private void b(final ArrayList p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_3       
        //     4: aload_2        
        //     5: invokestatic    com/whatsapp/adc.a:(Ljava/lang/String;)Lcom/whatsapp/atf;
        //     8: invokevirtual   com/whatsapp/atf.k:()Ljava/util/Collection;
        //    11: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //    16: astore          4
        //    18: aload           4
        //    20: invokeinterface java/util/Iterator.hasNext:()Z
        //    25: ifeq            96
        //    28: aload           4
        //    30: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    35: checkcast       Lcom/whatsapp/wh;
        //    38: astore          5
        //    40: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    43: aload           5
        //    45: getfield        com/whatsapp/wh.c:Ljava/lang/String;
        //    48: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //    51: astore          6
        //    53: aload_1        
        //    54: aload           6
        //    56: invokevirtual   java/util/ArrayList.contains:(Ljava/lang/Object;)Z
        //    59: ifne            69
        //    62: aload_1        
        //    63: aload           6
        //    65: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    68: pop            
        //    69: aload           5
        //    71: getfield        com/whatsapp/wh.e:Z
        //    74: ifeq            92
        //    77: aload_0        
        //    78: getfield        com/whatsapp/GroupChatInfo.J:Ljava/util/HashMap;
        //    81: aload           6
        //    83: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    86: aload           6
        //    88: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    91: pop            
        //    92: iload_3        
        //    93: ifeq            18
        //    96: aload_1        
        //    97: new             Lcom/whatsapp/x6;
        //   100: dup            
        //   101: aload_0        
        //   102: invokevirtual   com/whatsapp/GroupChatInfo.getApplicationContext:()Landroid/content/Context;
        //   105: invokespecial   com/whatsapp/x6.<init>:(Landroid/content/Context;)V
        //   108: invokestatic    java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
        //   111: return         
        //   112: astore          7
        //   114: aload           7
        //   116: athrow         
        //   117: astore          8
        //   119: aload           8
        //   121: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  53     69     112    117    Ljava/lang/NumberFormatException;
        //  69     92     117    122    Ljava/lang/NumberFormatException;
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
    
    static TextView c(final GroupChatInfo groupChatInfo) {
        return groupChatInfo.I;
    }
    
    static void c(final GroupChatInfo groupChatInfo, final String s) {
        groupChatInfo.e(s);
    }
    
    static LinearLayout d(final GroupChatInfo groupChatInfo) {
        return groupChatInfo.r;
    }
    
    private void d(final int n) {
        Label_0045: {
            switch (n) {
                case 406: {
                    break Label_0045;
                }
                case 400:
                case 401:
                case 404: {
                    Label_0100: {
                        break Label_0100;
                        try {
                            App.a(App.aq.getApplicationContext(), App.aq.getApplicationContext().getString(2131231792, new Object[] { ym.m }), 0);
                            App.X();
                            if (App.I) {
                                App.a(App.aq.getApplicationContext(), 2131231790, 0);
                                return;
                            }
                            break;
                        }
                        catch (NumberFormatException ex) {
                            throw ex;
                        }
                    }
                    break;
                }
            }
        }
    }
    
    static View e(final GroupChatInfo groupChatInfo) {
        return groupChatInfo.C;
    }
    
    private void e() {
        try {
            if (!App.ah()) {
                return;
            }
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
        this.runOnUiThread((Runnable)new aap(this));
    }
    
    private void e(final String s) {
        Label_0059: {
            if (!App.O()) {
                break Label_0059;
            }
            this.a(2131231440, 2131231591);
            final Vector<String> vector = new Vector<String>();
            vector.add(s);
            final nt nt = new nt(this, this.z, null, vector, 14);
            try {
                App.a(nt);
                if (App.I) {
                    App.a(this.getBaseContext(), 2131231385, 0);
                    this.o();
                }
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
        }
    }
    
    private boolean e(final int n) {
        Label_0147: {
            Label_0134: {
                Label_0126: {
                    Label_0112: {
                        Label_0099: {
                            Label_0093: {
                            Label_0087:
                                while (true) {
                                    try {
                                        if (this.Q == null) {
                                            return true;
                                        }
                                    }
                                    catch (NumberFormatException ex) {
                                        throw ex;
                                    }
                                    switch (n) {
                                        default: {
                                            return true;
                                        }
                                        case 0: {
                                            try {
                                                if (this.Q.e != null) {
                                                    ContactInfo.a(this.Q, this);
                                                    return true;
                                                }
                                                return true;
                                            }
                                            catch (NumberFormatException ex2) {
                                                throw ex2;
                                            }
                                        }
                                        case 2: {
                                            break Label_0087;
                                        }
                                        case 3: {
                                            break Label_0093;
                                        }
                                        case 1: {
                                            break Label_0099;
                                        }
                                        case 4: {
                                            break Label_0112;
                                        }
                                        case 5: {
                                            break Label_0126;
                                        }
                                        case 6: {
                                            break Label_0134;
                                        }
                                        case 7: {
                                            break Label_0147;
                                        }
                                    }
                                }
                                this.j();
                                return true;
                            }
                            this.n();
                            return true;
                        }
                        this.startActivity(Conversation.a(this.Q));
                        return true;
                    }
                    App.a(this.Q, this, bq.GROUP_CHAT_INFO);
                    return true;
                }
                this.showDialog(6);
                return true;
            }
            this.i(this.Q.u);
            return true;
        }
        this.j(this.Q.u);
        return true;
    }
    
    private void f() {
        this.startActivity(new Intent(App.aq.getApplicationContext(), Main.h()).putExtra(GroupChatInfo.T[0], this.R.u).addFlags(603979776));
    }
    
    static void f(final GroupChatInfo groupChatInfo) {
        groupChatInfo.p();
    }
    
    static View g(final GroupChatInfo groupChatInfo) {
        return groupChatInfo.S;
    }
    
    private void g() {
        Label_0051: {
            if (this.w.size() >= ym.c) {
                break Label_0051;
            }
            final Intent intent = new Intent((Context)this, (Class)ContactPicker.class);
            try {
                intent.putExtra(GroupChatInfo.T[1], this.z);
                this.startActivityForResult(intent, 1);
                if (App.I) {
                    new AlertDialog$Builder((Context)this).setTitle(this.getString(2131230802)).setMessage(this.getString(2131231231, new Object[] { ym.c })).setPositiveButton(this.getString(2131231435), (DialogInterface$OnClickListener)new df(this)).create().show();
                }
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
        }
    }
    
    private void g(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/GroupChatInfo.R:Lcom/whatsapp/a_9;
        //     8: aload_0        
        //     9: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //    12: aload_1        
        //    13: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    16: ifne            171
        //    19: invokestatic    com/whatsapp/App.O:()Z
        //    22: istore          4
        //    24: iload           4
        //    26: ifeq            160
        //    29: aload_1        
        //    30: iconst_0       
        //    31: aload_1        
        //    32: invokevirtual   java/lang/String.length:()I
        //    35: invokevirtual   java/lang/String.codePointCount:(II)I
        //    38: istore          6
        //    40: getstatic       com/whatsapp/ym.m:I
        //    43: istore          9
        //    45: iload           6
        //    47: iload           9
        //    49: if_icmpgt       119
        //    52: aload_0        
        //    53: getfield        com/whatsapp/GroupChatInfo.K:Landroid/view/View;
        //    56: iconst_0       
        //    57: invokevirtual   android/view/View.setVisibility:(I)V
        //    60: aload_0        
        //    61: getfield        com/whatsapp/GroupChatInfo.q:Landroid/widget/ImageButton;
        //    64: bipush          8
        //    66: invokevirtual   android/widget/ImageButton.setVisibility:(I)V
        //    69: new             Ljava/lang/StringBuilder;
        //    72: dup            
        //    73: invokespecial   java/lang/StringBuilder.<init>:()V
        //    76: getstatic       com/whatsapp/GroupChatInfo.T:[Ljava/lang/String;
        //    79: bipush          15
        //    81: aaload         
        //    82: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    85: aload_1        
        //    86: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    89: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    92: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    95: new             Lcom/whatsapp/n2;
        //    98: dup            
        //    99: aload_0        
        //   100: aload_0        
        //   101: getfield        com/whatsapp/GroupChatInfo.z:Ljava/lang/String;
        //   104: aload_1        
        //   105: aconst_null    
        //   106: bipush          16
        //   108: aconst_null    
        //   109: invokespecial   com/whatsapp/n2.<init>:(Lcom/whatsapp/GroupChatInfo;Ljava/lang/String;Ljava/lang/String;Ljava/util/Vector;ILcom/whatsapp/protocol/c_;)V
        //   112: invokestatic    com/whatsapp/App.f:(Lcom/whatsapp/n9;)V
        //   115: iload_2        
        //   116: ifeq            156
        //   119: aload_0        
        //   120: ldc_w           2131231792
        //   123: invokevirtual   com/whatsapp/GroupChatInfo.getString:(I)Ljava/lang/String;
        //   126: astore          10
        //   128: iconst_1       
        //   129: anewarray       Ljava/lang/Object;
        //   132: astore          11
        //   134: aload           11
        //   136: iconst_0       
        //   137: getstatic       com/whatsapp/ym.m:I
        //   140: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   143: aastore        
        //   144: aload_0        
        //   145: aload           10
        //   147: aload           11
        //   149: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   152: iconst_0       
        //   153: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;Ljava/lang/String;I)V
        //   156: iload_2        
        //   157: ifeq            171
        //   160: aload_0        
        //   161: invokevirtual   com/whatsapp/GroupChatInfo.getBaseContext:()Landroid/content/Context;
        //   164: ldc_w           2131231422
        //   167: iconst_0       
        //   168: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   171: return         
        //   172: astore_3       
        //   173: aload_3        
        //   174: athrow         
        //   175: astore          7
        //   177: aload           7
        //   179: athrow         
        //   180: astore          8
        //   182: aload           8
        //   184: athrow         
        //   185: astore          5
        //   187: aload           5
        //   189: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      24     172    175    Ljava/lang/NumberFormatException;
        //  40     45     175    180    Ljava/lang/NumberFormatException;
        //  52     115    180    185    Ljava/lang/NumberFormatException;
        //  119    156    180    185    Ljava/lang/NumberFormatException;
        //  160    171    185    190    Ljava/lang/NumberFormatException;
        //  177    180    180    185    Ljava/lang/NumberFormatException;
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
    
    static ArrayList h(final GroupChatInfo groupChatInfo) {
        return groupChatInfo.w;
    }
    
    private void h() {
        Label_0056: {
            if (!App.O()) {
                break Label_0056;
            }
            final Intent addFlags = new Intent(App.aq.getApplicationContext(), Main.h()).putExtra(GroupChatInfo.T[25], this.R.u).addFlags(603979776);
            try {
                this.startActivity(addFlags);
                if (App.I) {
                    App.a(this.getBaseContext(), 2131231115, 0);
                }
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
        }
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
        //     5: getfield        com/whatsapp/GroupChatInfo.J:Ljava/util/HashMap;
        //     8: aload_1        
        //     9: invokevirtual   java/util/HashMap.containsKey:(Ljava/lang/Object;)Z
        //    12: ifeq            33
        //    15: new             Ljava/util/Vector;
        //    18: dup            
        //    19: invokespecial   java/util/Vector.<init>:()V
        //    22: astore_3       
        //    23: aload_3        
        //    24: aload_1        
        //    25: invokevirtual   java/util/Vector.add:(Ljava/lang/Object;)Z
        //    28: pop            
        //    29: iload_2        
        //    30: ifeq            112
        //    33: invokestatic    com/whatsapp/App.O:()Z
        //    36: istore          6
        //    38: iload           6
        //    40: ifeq            97
        //    43: aload_0        
        //    44: ldc_w           2131231442
        //    47: ldc_w           2131231591
        //    50: invokevirtual   com/whatsapp/GroupChatInfo.a:(II)V
        //    53: new             Ljava/util/Vector;
        //    56: dup            
        //    57: invokespecial   java/util/Vector.<init>:()V
        //    60: astore          8
        //    62: aload           8
        //    64: aload_1        
        //    65: invokevirtual   java/util/Vector.add:(Ljava/lang/Object;)Z
        //    68: pop            
        //    69: new             Lcom/whatsapp/nd;
        //    72: dup            
        //    73: aload_0        
        //    74: aload_0        
        //    75: getfield        com/whatsapp/GroupChatInfo.z:Ljava/lang/String;
        //    78: aconst_null    
        //    79: aload           8
        //    81: bipush          29
        //    83: invokespecial   com/whatsapp/nd.<init>:(Lcom/whatsapp/GroupChatInfo;Ljava/lang/String;Ljava/lang/String;Ljava/util/Vector;I)V
        //    86: astore          10
        //    88: aload           10
        //    90: invokestatic    com/whatsapp/App.c:(Lcom/whatsapp/n9;)V
        //    93: iload_2        
        //    94: ifeq            112
        //    97: aload_0        
        //    98: invokevirtual   com/whatsapp/GroupChatInfo.getBaseContext:()Landroid/content/Context;
        //   101: ldc_w           2131231385
        //   104: iconst_0       
        //   105: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   108: aload_0        
        //   109: invokespecial   com/whatsapp/GroupChatInfo.o:()V
        //   112: return         
        //   113: astore          4
        //   115: aload           4
        //   117: athrow         
        //   118: astore          7
        //   120: aload           7
        //   122: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  23     29     113    118    Ljava/lang/NumberFormatException;
        //  33     38     113    118    Ljava/lang/NumberFormatException;
        //  88     93     118    123    Ljava/lang/NumberFormatException;
        //  97     112    118    123    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0097:
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
    
    static ListView i(final GroupChatInfo groupChatInfo) {
        return groupChatInfo.E;
    }
    
    private void i() {
        a8s.a(this.u = new o5(this), new Void[0]);
    }
    
    private void i(final String s) {
        Label_0059: {
            if (!App.O()) {
                break Label_0059;
            }
            this.a(2131231440, 2131231591);
            final Vector<String> vector = new Vector<String>();
            vector.add(s);
            final n8 n8 = new n8(this, this.z, null, vector, 90);
            try {
                App.b(n8);
                if (App.I) {
                    App.a(this.getBaseContext(), 2131231385, 0);
                }
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
        }
    }
    
    private void j() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/GroupChatInfo.Q:Lcom/whatsapp/a_9;
        //     4: invokevirtual   com/whatsapp/a_9.f:()Ljava/lang/String;
        //     7: astore_1       
        //     8: new             Landroid/content/Intent;
        //    11: dup            
        //    12: getstatic       com/whatsapp/GroupChatInfo.T:[Ljava/lang/String;
        //    15: bipush          22
        //    17: aaload         
        //    18: getstatic       android/provider/ContactsContract$Contacts.CONTENT_URI:Landroid/net/Uri;
        //    21: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;Landroid/net/Uri;)V
        //    24: astore_2       
        //    25: aload_2        
        //    26: getstatic       com/whatsapp/GroupChatInfo.T:[Ljava/lang/String;
        //    29: bipush          21
        //    31: aaload         
        //    32: aload_1        
        //    33: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //    36: pop            
        //    37: aload_2        
        //    38: aload_2        
        //    39: aload_0        
        //    40: invokevirtual   com/whatsapp/GroupChatInfo.getPackageManager:()Landroid/content/pm/PackageManager;
        //    43: invokevirtual   android/content/Intent.resolveActivity:(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;
        //    46: invokevirtual   android/content/Intent.setComponent:(Landroid/content/ComponentName;)Landroid/content/Intent;
        //    49: pop            
        //    50: aload_2        
        //    51: invokevirtual   android/content/Intent.getComponent:()Landroid/content/ComponentName;
        //    54: astore          7
        //    56: aload           7
        //    58: ifnull          74
        //    61: aload_0        
        //    62: aload_2        
        //    63: bipush          10
        //    65: invokevirtual   com/whatsapp/GroupChatInfo.startActivityForResult:(Landroid/content/Intent;I)V
        //    68: getstatic       com/whatsapp/App.I:Z
        //    71: ifeq            95
        //    74: getstatic       com/whatsapp/GroupChatInfo.T:[Ljava/lang/String;
        //    77: bipush          20
        //    79: aaload         
        //    80: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    83: invokestatic    com/whatsapp/App.N:()V
        //    86: return         
        //    87: astore_3       
        //    88: aload_3        
        //    89: athrow         
        //    90: astore          4
        //    92: aload           4
        //    94: athrow         
        //    95: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  25     56     87     90     Ljava/lang/NumberFormatException;
        //  61     74     90     95     Ljava/lang/NumberFormatException;
        //  74     86     90     95     Ljava/lang/NumberFormatException;
        //  88     90     90     95     Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0074:
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
    
    static void j(final GroupChatInfo groupChatInfo) {
        groupChatInfo.l();
    }
    
    private void j(final String s) {
        Label_0059: {
            if (!App.O()) {
                break Label_0059;
            }
            this.a(2131231442, 2131231591);
            final Vector<String> vector = new Vector<String>();
            vector.add(s);
            final na na = new na(this, this.z, null, vector, 91);
            try {
                App.g(na);
                if (App.I) {
                    App.a(this.getBaseContext(), 2131231385, 0);
                }
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
        }
    }
    
    static k0 k(final GroupChatInfo groupChatInfo) {
        return groupChatInfo.P;
    }
    
    private void k() {
        try {
            if (!this.isFinishing()) {
                this.E.postDelayed((Runnable)new a87(this), 300L);
            }
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
    }
    
    public static void k(final String s) {
        try {
            if (GroupChatInfo.y == null) {
                return;
            }
            final GroupChatInfo groupChatInfo = GroupChatInfo.y;
            final String s2 = groupChatInfo.z;
            final String s3 = s;
            final boolean b = s2.equals(s3);
            if (b) {
                final GroupChatInfo groupChatInfo2 = GroupChatInfo.y;
                groupChatInfo2.o();
            }
            return;
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
        try {
            final GroupChatInfo groupChatInfo = GroupChatInfo.y;
            final String s2 = groupChatInfo.z;
            final String s3 = s;
            final boolean b = s2.equals(s3);
            if (b) {
                final GroupChatInfo groupChatInfo2 = GroupChatInfo.y;
                groupChatInfo2.o();
            }
        }
        catch (NumberFormatException ex2) {
            throw ex2;
        }
    }
    
    static String l(final GroupChatInfo groupChatInfo) {
        return groupChatInfo.z;
    }
    
    private void l() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/whatsapp/App.O:()Z
        //     3: istore_3       
        //     4: iload_3        
        //     5: ifeq            43
        //     8: aload_0        
        //     9: ldc_w           2131231442
        //    12: ldc_w           2131231591
        //    15: invokevirtual   com/whatsapp/GroupChatInfo.a:(II)V
        //    18: new             Lcom/whatsapp/n0;
        //    21: dup            
        //    22: aload_0        
        //    23: aload_0        
        //    24: getfield        com/whatsapp/GroupChatInfo.z:Ljava/lang/String;
        //    27: aconst_null    
        //    28: aconst_null    
        //    29: bipush          15
        //    31: invokespecial   com/whatsapp/n0.<init>:(Lcom/whatsapp/GroupChatInfo;Ljava/lang/String;Ljava/lang/String;Ljava/util/Vector;I)V
        //    34: invokestatic    com/whatsapp/App.e:(Lcom/whatsapp/n9;)V
        //    37: getstatic       com/whatsapp/App.I:Z
        //    40: ifeq            61
        //    43: aload_0        
        //    44: invokevirtual   com/whatsapp/GroupChatInfo.getBaseContext:()Landroid/content/Context;
        //    47: ldc_w           2131231115
        //    50: iconst_0       
        //    51: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //    54: return         
        //    55: astore_1       
        //    56: aload_1        
        //    57: athrow         
        //    58: astore_2       
        //    59: aload_2        
        //    60: athrow         
        //    61: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      4      55     58     Ljava/lang/NumberFormatException;
        //  8      43     58     61     Ljava/lang/NumberFormatException;
        //  43     54     58     61     Ljava/lang/NumberFormatException;
        //  56     58     58     61     Ljava/lang/NumberFormatException;
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
    
    static ImageView m(final GroupChatInfo groupChatInfo) {
        return groupChatInfo.L;
    }
    
    private void m() {
        final ViewGroup viewGroup = (ViewGroup)this.findViewById(2131755595);
        this.I = (TextView)new SwitchCompat((Context)this);
        ((CompoundButton)this.I).setOnCheckedChangeListener(this.O);
        viewGroup.addView((View)this.I);
    }
    
    static View n(final GroupChatInfo groupChatInfo) {
        return groupChatInfo.K;
    }
    
    private void n() {
        try {
            final Intent intent = new Intent(GroupChatInfo.T[18]);
            intent.setType(GroupChatInfo.T[16]);
            intent.putExtra(GroupChatInfo.T[19], this.Q.a((Context)this));
            intent.putExtra(GroupChatInfo.T[17], 2);
            intent.setFlags(524288);
            this.startActivityForResult(intent, 11);
        }
        catch (ActivityNotFoundException ex) {
            this.showDialog(4);
        }
    }
    
    static a_9 o(final GroupChatInfo groupChatInfo) {
        return groupChatInfo.Q;
    }
    
    private void o() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: bipush          8
        //     2: istore_1       
        //     3: aload_0        
        //     4: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //     7: aload_0        
        //     8: getfield        com/whatsapp/GroupChatInfo.z:Ljava/lang/String;
        //    11: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //    14: putfield        com/whatsapp/GroupChatInfo.R:Lcom/whatsapp/a_9;
        //    17: aload_0        
        //    18: invokespecial   com/whatsapp/GroupChatInfo.q:()V
        //    21: aload_0        
        //    22: invokespecial   com/whatsapp/GroupChatInfo.i:()V
        //    25: aload_0        
        //    26: getfield        com/whatsapp/GroupChatInfo.w:Ljava/util/ArrayList;
        //    29: invokevirtual   java/util/ArrayList.clear:()V
        //    32: aload_0        
        //    33: aload_0        
        //    34: getfield        com/whatsapp/GroupChatInfo.w:Ljava/util/ArrayList;
        //    37: aload_0        
        //    38: getfield        com/whatsapp/GroupChatInfo.z:Ljava/lang/String;
        //    41: invokespecial   com/whatsapp/GroupChatInfo.b:(Ljava/util/ArrayList;Ljava/lang/String;)V
        //    44: aload_0        
        //    45: getfield        com/whatsapp/GroupChatInfo.K:Landroid/view/View;
        //    48: iload_1        
        //    49: invokevirtual   android/view/View.setVisibility:(I)V
        //    52: aload_0        
        //    53: getfield        com/whatsapp/GroupChatInfo.q:Landroid/widget/ImageButton;
        //    56: iconst_0       
        //    57: invokevirtual   android/widget/ImageButton.setVisibility:(I)V
        //    60: aload_0        
        //    61: getfield        com/whatsapp/GroupChatInfo.M:Landroid/widget/TextView;
        //    64: astore_2       
        //    65: iconst_2       
        //    66: anewarray       Ljava/lang/Object;
        //    69: astore_3       
        //    70: aload_3        
        //    71: iconst_0       
        //    72: aload_0        
        //    73: getfield        com/whatsapp/GroupChatInfo.w:Ljava/util/ArrayList;
        //    76: invokevirtual   java/util/ArrayList.size:()I
        //    79: getstatic       com/whatsapp/ym.c:I
        //    82: invokestatic    java/lang/Math.min:(II)I
        //    85: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    88: aastore        
        //    89: aload_3        
        //    90: iconst_1       
        //    91: getstatic       com/whatsapp/ym.c:I
        //    94: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    97: aastore        
        //    98: aload_2        
        //    99: aload_0        
        //   100: ldc_w           2131231443
        //   103: aload_3        
        //   104: invokevirtual   com/whatsapp/GroupChatInfo.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   107: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   110: aload_0        
        //   111: getfield        com/whatsapp/GroupChatInfo.z:Ljava/lang/String;
        //   114: invokestatic    com/whatsapp/adc.f:(Ljava/lang/String;)Z
        //   117: istore          4
        //   119: aload_0        
        //   120: getfield        com/whatsapp/GroupChatInfo.z:Ljava/lang/String;
        //   123: invokestatic    com/whatsapp/adc.e:(Ljava/lang/String;)Z
        //   126: istore          5
        //   128: invokestatic    com/whatsapp/App.ah:()Z
        //   131: istore          9
        //   133: iload           9
        //   135: ifeq            164
        //   138: iload           4
        //   140: ifeq            164
        //   143: aload_0        
        //   144: ldc_w           2131755593
        //   147: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   150: iconst_0       
        //   151: invokevirtual   android/view/View.setVisibility:(I)V
        //   154: aload_0        
        //   155: invokespecial   com/whatsapp/GroupChatInfo.e:()V
        //   158: getstatic       com/whatsapp/App.I:Z
        //   161: ifeq            176
        //   164: aload_0        
        //   165: ldc_w           2131755593
        //   168: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   171: bipush          8
        //   173: invokevirtual   android/view/View.setVisibility:(I)V
        //   176: aload_0        
        //   177: ldc_w           2131755603
        //   180: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   183: astore          11
        //   185: aload_0        
        //   186: getfield        com/whatsapp/GroupChatInfo.z:Ljava/lang/String;
        //   189: invokestatic    com/whatsapp/adc.a:(Ljava/lang/String;)Lcom/whatsapp/atf;
        //   192: invokevirtual   com/whatsapp/atf.j:()I
        //   195: istore          12
        //   197: iload           12
        //   199: ifle            377
        //   202: iconst_0       
        //   203: istore          13
        //   205: aload           11
        //   207: iload           13
        //   209: invokevirtual   android/view/View.setVisibility:(I)V
        //   212: aload_0        
        //   213: ldc_w           2131755591
        //   216: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   219: checkcast       Landroid/widget/Button;
        //   222: astore          14
        //   224: iload           4
        //   226: ifeq            383
        //   229: ldc_w           2131231103
        //   232: istore          15
        //   234: aload           14
        //   236: iload           15
        //   238: invokevirtual   android/widget/Button.setText:(I)V
        //   241: aload_0        
        //   242: ldc_w           2131755592
        //   245: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   248: bipush          8
        //   250: invokevirtual   android/view/View.setVisibility:(I)V
        //   253: aload_0        
        //   254: getfield        com/whatsapp/GroupChatInfo.v:Lcom/whatsapp/ChatInfoLayout;
        //   257: astore          17
        //   259: aload_0        
        //   260: invokevirtual   com/whatsapp/GroupChatInfo.getResources:()Landroid/content/res/Resources;
        //   263: ldc_w           2131361822
        //   266: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   269: istore          18
        //   271: iload           5
        //   273: ifeq            396
        //   276: aload_0        
        //   277: invokevirtual   com/whatsapp/GroupChatInfo.getResources:()Landroid/content/res/Resources;
        //   280: ldc_w           2131361822
        //   283: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   286: istore          19
        //   288: iload           19
        //   290: istore          20
        //   292: aload           17
        //   294: iload           18
        //   296: iload           20
        //   298: invokevirtual   com/whatsapp/ChatInfoLayout.setCollapsedPadding:(II)V
        //   301: aload_0        
        //   302: ldc_w           2131755588
        //   305: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   308: astore          22
        //   310: iload           5
        //   312: ifeq            407
        //   315: iconst_0       
        //   316: istore          23
        //   318: aload           22
        //   320: iload           23
        //   322: invokevirtual   android/view/View.setVisibility:(I)V
        //   325: aload_0        
        //   326: ldc_w           2131755440
        //   329: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   332: astore          25
        //   334: iload           4
        //   336: ifeq            418
        //   339: aload           25
        //   341: iload_1        
        //   342: invokevirtual   android/view/View.setVisibility:(I)V
        //   345: aload_0        
        //   346: invokevirtual   com/whatsapp/GroupChatInfo.invalidateOptionsMenu:()V
        //   349: aload_0        
        //   350: getfield        com/whatsapp/GroupChatInfo.P:Lcom/whatsapp/k0;
        //   353: invokevirtual   com/whatsapp/k0.notifyDataSetChanged:()V
        //   356: return         
        //   357: astore          6
        //   359: aload           6
        //   361: athrow         
        //   362: astore          7
        //   364: aload           7
        //   366: athrow         
        //   367: astore          8
        //   369: aload           8
        //   371: athrow         
        //   372: astore          10
        //   374: aload           10
        //   376: athrow         
        //   377: iload_1        
        //   378: istore          13
        //   380: goto            205
        //   383: ldc_w           2131231019
        //   386: istore          15
        //   388: goto            234
        //   391: astore          16
        //   393: aload           16
        //   395: athrow         
        //   396: iconst_0       
        //   397: istore          20
        //   399: goto            292
        //   402: astore          21
        //   404: aload           21
        //   406: athrow         
        //   407: iload_1        
        //   408: istore          23
        //   410: goto            318
        //   413: astore          24
        //   415: aload           24
        //   417: athrow         
        //   418: iconst_0       
        //   419: istore_1       
        //   420: goto            339
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  128    133    357    367    Ljava/lang/NumberFormatException;
        //  143    164    367    372    Ljava/lang/NumberFormatException;
        //  164    176    367    372    Ljava/lang/NumberFormatException;
        //  176    197    372    377    Ljava/lang/NumberFormatException;
        //  234    271    391    396    Ljava/lang/NumberFormatException;
        //  276    288    391    396    Ljava/lang/NumberFormatException;
        //  292    310    402    407    Ljava/lang/NumberFormatException;
        //  318    334    413    418    Ljava/lang/NumberFormatException;
        //  359    362    362    367    Ljava/lang/NumberFormatException;
        //  364    367    367    372    Ljava/lang/NumberFormatException;
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
    
    static ImageButton p(final GroupChatInfo groupChatInfo) {
        return groupChatInfo.q;
    }
    
    private void p() {
        try {
            if (this.A != null) {
                this.A.cancel(true);
            }
            this.setSupportProgressBarIndeterminateVisibility(true);
            a8s.a(this.A = new ah0(this), new Void[0]);
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
    }
    
    private void q() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/GroupChatInfo.t:Landroid/widget/TextView;
        //     4: aload_0        
        //     5: getfield        com/whatsapp/GroupChatInfo.R:Lcom/whatsapp/a_9;
        //     8: aload_0        
        //     9: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //    12: aload_0        
        //    13: aload_0        
        //    14: getfield        com/whatsapp/GroupChatInfo.t:Landroid/widget/TextView;
        //    17: invokevirtual   android/widget/TextView.getPaint:()Landroid/text/TextPaint;
        //    20: ldc_w           0.82
        //    23: invokestatic    com/whatsapp/util/cq.b:(Ljava/lang/String;Landroid/content/Context;Landroid/graphics/Paint;F)Ljava/lang/CharSequence;
        //    26: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    29: aload_0        
        //    30: aload_0        
        //    31: getfield        com/whatsapp/GroupChatInfo.R:Lcom/whatsapp/a_9;
        //    34: getfield        com/whatsapp/a_9.m:Ljava/lang/String;
        //    37: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //    40: invokestatic    com/whatsapp/App.b:(J)J
        //    43: invokestatic    com/whatsapp/util/b6.e:(Landroid/content/Context;J)Ljava/lang/String;
        //    46: astore          18
        //    48: aload           18
        //    50: astore_2       
        //    51: aload_0        
        //    52: getfield        com/whatsapp/GroupChatInfo.R:Lcom/whatsapp/a_9;
        //    55: invokevirtual   com/whatsapp/a_9.i:()Ljava/lang/String;
        //    58: astore_3       
        //    59: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    62: aload_3        
        //    63: invokevirtual   com/whatsapp/wc.f:(Ljava/lang/String;)Z
        //    66: istore          6
        //    68: iload           6
        //    70: ifeq            132
        //    73: aload_0        
        //    74: getfield        com/whatsapp/GroupChatInfo.s:Landroid/widget/TextView;
        //    77: astore          13
        //    79: new             Ljava/lang/StringBuilder;
        //    82: dup            
        //    83: invokespecial   java/lang/StringBuilder.<init>:()V
        //    86: aload_0        
        //    87: ldc_w           2131231176
        //    90: invokevirtual   com/whatsapp/GroupChatInfo.getString:(I)Ljava/lang/String;
        //    93: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    96: astore          14
        //    98: aload_2        
        //    99: ifnonnull       257
        //   102: ldc_w           ""
        //   105: astore          15
        //   107: aload           13
        //   109: aload           14
        //   111: aload           15
        //   113: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   116: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   119: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   122: getstatic       com/whatsapp/App.I:Z
        //   125: istore          17
        //   127: iload           17
        //   129: ifeq            207
        //   132: aload_0        
        //   133: getfield        com/whatsapp/GroupChatInfo.s:Landroid/widget/TextView;
        //   136: astore          8
        //   138: new             Ljava/lang/StringBuilder;
        //   141: dup            
        //   142: invokespecial   java/lang/StringBuilder.<init>:()V
        //   145: astore          9
        //   147: iconst_1       
        //   148: anewarray       Ljava/lang/Object;
        //   151: astore          10
        //   153: aload           10
        //   155: iconst_0       
        //   156: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   159: aload_3        
        //   160: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   163: invokevirtual   com/whatsapp/a_9.q:()Ljava/lang/String;
        //   166: aastore        
        //   167: aload           9
        //   169: aload_0        
        //   170: ldc_w           2131231175
        //   173: aload           10
        //   175: invokevirtual   com/whatsapp/GroupChatInfo.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   178: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   181: astore          11
        //   183: aload_2        
        //   184: ifnonnull       298
        //   187: ldc_w           ""
        //   190: astore          12
        //   192: aload           8
        //   194: aload           11
        //   196: aload           12
        //   198: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   201: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   204: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   207: aload_0        
        //   208: getfield        com/whatsapp/GroupChatInfo.s:Landroid/widget/TextView;
        //   211: iconst_0       
        //   212: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   215: return         
        //   216: astore_1       
        //   217: new             Ljava/lang/StringBuilder;
        //   220: dup            
        //   221: invokespecial   java/lang/StringBuilder.<init>:()V
        //   224: getstatic       com/whatsapp/GroupChatInfo.T:[Ljava/lang/String;
        //   227: iconst_2       
        //   228: aaload         
        //   229: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   232: aload_1        
        //   233: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   236: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   239: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   242: aconst_null    
        //   243: astore_2       
        //   244: goto            51
        //   247: astore          4
        //   249: aload           4
        //   251: athrow         
        //   252: astore          5
        //   254: aload           5
        //   256: athrow         
        //   257: new             Ljava/lang/StringBuilder;
        //   260: dup            
        //   261: invokespecial   java/lang/StringBuilder.<init>:()V
        //   264: invokestatic    com/whatsapp/alm.a:()C
        //   267: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   270: ldc_w           " "
        //   273: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   276: aload_2        
        //   277: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   280: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   283: astore          15
        //   285: goto            107
        //   288: astore          16
        //   290: aload           16
        //   292: athrow         
        //   293: astore          7
        //   295: aload           7
        //   297: athrow         
        //   298: new             Ljava/lang/StringBuilder;
        //   301: dup            
        //   302: invokespecial   java/lang/StringBuilder.<init>:()V
        //   305: invokestatic    com/whatsapp/alm.a:()C
        //   308: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   311: ldc_w           " "
        //   314: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   317: aload_2        
        //   318: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   321: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   324: astore          12
        //   326: goto            192
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  29     48     216    247    Ljava/lang/NumberFormatException;
        //  59     68     247    252    Ljava/lang/NumberFormatException;
        //  73     98     252    257    Ljava/lang/NumberFormatException;
        //  107    127    288    293    Ljava/lang/NumberFormatException;
        //  132    183    293    298    Ljava/lang/NumberFormatException;
        //  249    252    252    257    Ljava/lang/NumberFormatException;
        //  290    293    293    298    Ljava/lang/NumberFormatException;
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
    
    static void q(final GroupChatInfo groupChatInfo) {
        groupChatInfo.h();
    }
    
    static HashMap r(final GroupChatInfo groupChatInfo) {
        return groupChatInfo.J;
    }
    
    static a_9 s(final GroupChatInfo groupChatInfo) {
        return groupChatInfo.R;
    }
    
    static a9q t(final GroupChatInfo groupChatInfo) {
        return groupChatInfo.F;
    }
    
    static ChatInfoLayout u(final GroupChatInfo groupChatInfo) {
        return groupChatInfo.v;
    }
    
    static void v(final GroupChatInfo groupChatInfo) {
        groupChatInfo.e();
    }
    
    static void w(final GroupChatInfo groupChatInfo) {
        groupChatInfo.g();
    }
    
    static void x(final GroupChatInfo groupChatInfo) {
        groupChatInfo.k();
    }
    
    @Override
    public void a() {
        this.w.clear();
        this.R = App.S.c(this.z);
        this.b(this.w, this.z);
        this.P.notifyDataSetChanged();
    }
    
    @Override
    public void a(final String s) {
    }
    
    @Override
    public void a(final Collection collection) {
    }
    
    @Override
    public void b(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: invokestatic    com/whatsapp/adc.b:(Ljava/lang/String;)Z
        //     4: ifne            56
        //     7: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    10: aload_1        
        //    11: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //    14: astore_3       
        //    15: aload_3        
        //    16: ifnull          46
        //    19: new             Lcom/whatsapp/rq;
        //    22: dup            
        //    23: aload_3        
        //    24: invokespecial   com/whatsapp/rq.<init>:(Lcom/whatsapp/a_9;)V
        //    27: astore          4
        //    29: aload_0        
        //    30: getfield        com/whatsapp/GroupChatInfo.w:Ljava/util/ArrayList;
        //    33: aload           4
        //    35: invokestatic    com/whatsapp/a_9.a:(Ljava/util/List;Lcom/whatsapp/w2;)Z
        //    38: pop            
        //    39: aload_0        
        //    40: getfield        com/whatsapp/GroupChatInfo.P:Lcom/whatsapp/k0;
        //    43: invokevirtual   com/whatsapp/k0.notifyDataSetChanged:()V
        //    46: getstatic       com/whatsapp/App.I:Z
        //    49: istore          7
        //    51: iload           7
        //    53: ifeq            96
        //    56: aload_1        
        //    57: aload_0        
        //    58: getfield        com/whatsapp/GroupChatInfo.z:Ljava/lang/String;
        //    61: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    64: ifeq            96
        //    67: aload_0        
        //    68: getfield        com/whatsapp/GroupChatInfo.N:Landroid/view/View;
        //    71: bipush          8
        //    73: invokevirtual   android/view/View.setVisibility:(I)V
        //    76: aload_0        
        //    77: getfield        com/whatsapp/GroupChatInfo.R:Lcom/whatsapp/a_9;
        //    80: invokevirtual   com/whatsapp/a_9.w:()V
        //    83: aload_0        
        //    84: invokespecial   com/whatsapp/GroupChatInfo.i:()V
        //    87: return         
        //    88: astore          6
        //    90: aload           6
        //    92: athrow         
        //    93: astore_2       
        //    94: aload_2        
        //    95: athrow         
        //    96: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  46     51     88     93     Ljava/lang/NumberFormatException;
        //  56     87     93     96     Ljava/lang/NumberFormatException;
        //  90     93     93     96     Ljava/lang/NumberFormatException;
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
    
    @Override
    public void c(final String s) {
    }
    
    @Override
    public void d(final String s) {
        Label_0053: {
            if (s == null) {
                break Label_0053;
            }
            try {
                if (s.equals(App.au() + GroupChatInfo.T[23])) {
                    this.P.notifyDataSetChanged();
                    if (!App.I) {
                        return;
                    }
                }
                final a_9 e = App.S.e(s);
                if (e != null) {
                    a_9.a(this.w, new rw(e));
                    this.P.notifyDataSetChanged();
                }
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
        }
    }
    
    public void finishAfterTransition() {
        if (Build$VERSION.SDK_INT >= 21) {
            this.D.setTransitionName((String)null);
            final TransitionSet returnTransition = new TransitionSet();
            final Slide slide = new Slide(48);
            ((Transition)slide).addTarget(this.D);
            returnTransition.addTransition((Transition)slide);
            final Slide slide2 = new Slide(80);
            ((Transition)slide2).addTarget((View)this.E);
            returnTransition.addTransition((Transition)slide2);
            this.getWindow().setReturnTransition((Transition)returnTransition);
        }
        super.finishAfterTransition();
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
        //     5: iload_1        
        //     6: tableswitch {
        //                2: 269
        //                3: 76
        //                4: 76
        //                5: 76
        //                6: 76
        //                7: 76
        //                8: 76
        //                9: 76
        //               10: 76
        //               11: 77
        //               12: 190
        //               13: 297
        //               14: 362
        //               15: 420
        //          default: 76
        //        }
        //    76: return         
        //    77: iload_2        
        //    78: iconst_m1      
        //    79: if_icmpne       156
        //    82: aload_0        
        //    83: getfield        com/whatsapp/GroupChatInfo.Q:Lcom/whatsapp/a_9;
        //    86: astore          31
        //    88: aload           31
        //    90: ifnull          156
        //    93: aload_3        
        //    94: ifnull          127
        //    97: aload_3        
        //    98: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   101: astore          33
        //   103: aload           33
        //   105: ifnull          127
        //   108: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   111: aload_3        
        //   112: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   115: aload_0        
        //   116: getfield        com/whatsapp/GroupChatInfo.Q:Lcom/whatsapp/a_9;
        //   119: invokevirtual   com/whatsapp/wc.a:(Landroid/net/Uri;Lcom/whatsapp/a_9;)V
        //   122: iload           4
        //   124: ifeq            137
        //   127: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   130: aload_0        
        //   131: getfield        com/whatsapp/GroupChatInfo.Q:Lcom/whatsapp/a_9;
        //   134: invokevirtual   com/whatsapp/wc.h:(Lcom/whatsapp/a_9;)V
        //   137: aload_0        
        //   138: invokespecial   com/whatsapp/GroupChatInfo.o:()V
        //   141: aload_0        
        //   142: getfield        com/whatsapp/GroupChatInfo.Q:Lcom/whatsapp/a_9;
        //   145: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   148: invokestatic    com/whatsapp/Conversation.i:(Ljava/lang/String;)V
        //   151: iload           4
        //   153: ifeq            76
        //   156: new             Ljava/lang/StringBuilder;
        //   159: dup            
        //   160: invokespecial   java/lang/StringBuilder.<init>:()V
        //   163: getstatic       com/whatsapp/GroupChatInfo.T:[Ljava/lang/String;
        //   166: bipush          11
        //   168: aaload         
        //   169: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   172: aload_0        
        //   173: getfield        com/whatsapp/GroupChatInfo.Q:Lcom/whatsapp/a_9;
        //   176: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   179: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   182: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   185: iload           4
        //   187: ifeq            76
        //   190: iload_2        
        //   191: iconst_m1      
        //   192: if_icmpne       235
        //   195: aload_0        
        //   196: getfield        com/whatsapp/GroupChatInfo.Q:Lcom/whatsapp/a_9;
        //   199: astore          24
        //   201: aload           24
        //   203: ifnull          235
        //   206: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   209: aload_0        
        //   210: getfield        com/whatsapp/GroupChatInfo.Q:Lcom/whatsapp/a_9;
        //   213: invokevirtual   com/whatsapp/wc.h:(Lcom/whatsapp/a_9;)V
        //   216: aload_0        
        //   217: invokespecial   com/whatsapp/GroupChatInfo.o:()V
        //   220: aload_0        
        //   221: getfield        com/whatsapp/GroupChatInfo.Q:Lcom/whatsapp/a_9;
        //   224: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   227: invokestatic    com/whatsapp/Conversation.i:(Ljava/lang/String;)V
        //   230: iload           4
        //   232: ifeq            76
        //   235: new             Ljava/lang/StringBuilder;
        //   238: dup            
        //   239: invokespecial   java/lang/StringBuilder.<init>:()V
        //   242: getstatic       com/whatsapp/GroupChatInfo.T:[Ljava/lang/String;
        //   245: bipush          10
        //   247: aaload         
        //   248: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   251: aload_0        
        //   252: getfield        com/whatsapp/GroupChatInfo.Q:Lcom/whatsapp/a_9;
        //   255: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   258: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   261: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   264: iload           4
        //   266: ifeq            76
        //   269: iload_2        
        //   270: iconst_m1      
        //   271: if_icmpne       76
        //   274: aload_3        
        //   275: getstatic       com/whatsapp/GroupChatInfo.T:[Ljava/lang/String;
        //   278: bipush          12
        //   280: aaload         
        //   281: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   284: astore          17
        //   286: aload_0        
        //   287: aload           17
        //   289: invokespecial   com/whatsapp/GroupChatInfo.e:(Ljava/lang/String;)V
        //   292: iload           4
        //   294: ifeq            76
        //   297: iload_2        
        //   298: iconst_m1      
        //   299: if_icmpne       76
        //   302: aload_3        
        //   303: ifnull          345
        //   306: aload_3        
        //   307: getstatic       com/whatsapp/GroupChatInfo.T:[Ljava/lang/String;
        //   310: bipush          9
        //   312: aaload         
        //   313: iconst_0       
        //   314: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   317: istore          16
        //   319: iload           16
        //   321: ifeq            345
        //   324: aload_0        
        //   325: getfield        com/whatsapp/GroupChatInfo.N:Landroid/view/View;
        //   328: iconst_0       
        //   329: invokevirtual   android/view/View.setVisibility:(I)V
        //   332: aload_0        
        //   333: getfield        com/whatsapp/GroupChatInfo.R:Lcom/whatsapp/a_9;
        //   336: aload_0        
        //   337: invokestatic    com/whatsapp/qp.b:(Lcom/whatsapp/a_9;Landroid/app/Activity;)V
        //   340: iload           4
        //   342: ifeq            76
        //   345: aload_3        
        //   346: aload_0        
        //   347: getfield        com/whatsapp/GroupChatInfo.R:Lcom/whatsapp/a_9;
        //   350: aload_0        
        //   351: bipush          13
        //   353: aload_0        
        //   354: invokestatic    com/whatsapp/qp.a:(Landroid/content/Intent;Lcom/whatsapp/a_9;Landroid/app/Activity;ILcom/whatsapp/gu;)V
        //   357: iload           4
        //   359: ifeq            76
        //   362: invokestatic    com/whatsapp/qp.b:()Ljava/io/File;
        //   365: invokevirtual   java/io/File.delete:()Z
        //   368: pop            
        //   369: iload_2        
        //   370: iconst_m1      
        //   371: if_icmpne       402
        //   374: aload_0        
        //   375: getfield        com/whatsapp/GroupChatInfo.R:Lcom/whatsapp/a_9;
        //   378: aload_0        
        //   379: invokestatic    com/whatsapp/qp.a:(Lcom/whatsapp/a_9;Landroid/app/Activity;)Z
        //   382: istore          12
        //   384: iload           12
        //   386: ifeq            76
        //   389: aload_0        
        //   390: getfield        com/whatsapp/GroupChatInfo.N:Landroid/view/View;
        //   393: iconst_0       
        //   394: invokevirtual   android/view/View.setVisibility:(I)V
        //   397: iload           4
        //   399: ifeq            76
        //   402: iload_2        
        //   403: ifne            76
        //   406: aload_3        
        //   407: ifnull          76
        //   410: aload_3        
        //   411: aload_0        
        //   412: invokestatic    com/whatsapp/qp.a:(Landroid/content/Intent;Lcom/whatsapp/gu;)V
        //   415: iload           4
        //   417: ifeq            76
        //   420: aload_0        
        //   421: invokespecial   com/whatsapp/GroupChatInfo.i:()V
        //   424: return         
        //   425: astore          5
        //   427: aload           5
        //   429: athrow         
        //   430: astore          27
        //   432: aload           27
        //   434: athrow         
        //   435: astore          28
        //   437: aload           28
        //   439: athrow         
        //   440: astore          29
        //   442: aload           29
        //   444: athrow         
        //   445: astore          30
        //   447: aload           30
        //   449: athrow         
        //   450: astore          32
        //   452: aload           32
        //   454: athrow         
        //   455: astore          25
        //   457: aload           25
        //   459: athrow         
        //   460: astore          26
        //   462: aload           26
        //   464: athrow         
        //   465: astore          22
        //   467: aload           22
        //   469: athrow         
        //   470: astore          23
        //   472: aload           23
        //   474: athrow         
        //   475: astore          21
        //   477: aload           21
        //   479: athrow         
        //   480: astore          18
        //   482: aload           18
        //   484: athrow         
        //   485: astore          19
        //   487: aload           19
        //   489: athrow         
        //   490: astore          20
        //   492: aload           20
        //   494: athrow         
        //   495: astore          14
        //   497: aload           14
        //   499: athrow         
        //   500: astore          15
        //   502: aload           15
        //   504: athrow         
        //   505: astore          13
        //   507: aload           13
        //   509: athrow         
        //   510: astore          6
        //   512: aload           6
        //   514: athrow         
        //   515: astore          7
        //   517: aload           7
        //   519: athrow         
        //   520: astore          8
        //   522: aload           8
        //   524: athrow         
        //   525: astore          9
        //   527: aload           9
        //   529: athrow         
        //   530: astore          10
        //   532: aload           10
        //   534: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  82     88     430    440    Ljava/lang/NumberFormatException;
        //  97     103    440    445    Ljava/lang/NumberFormatException;
        //  108    122    445    450    Ljava/lang/NumberFormatException;
        //  127    137    445    450    Ljava/lang/NumberFormatException;
        //  137    151    450    455    Ljava/lang/NumberFormatException;
        //  156    185    455    465    Ljava/lang/NumberFormatException;
        //  195    201    465    470    Ljava/lang/NumberFormatException;
        //  206    230    470    475    Ljava/lang/NumberFormatException;
        //  235    264    475    480    Ljava/lang/NumberFormatException;
        //  286    292    480    495    Ljava/lang/NumberFormatException;
        //  306    319    495    500    Ljava/lang/NumberFormatException;
        //  324    340    500    505    Ljava/lang/NumberFormatException;
        //  345    357    505    510    Ljava/lang/NumberFormatException;
        //  362    369    510    515    Ljava/lang/NumberFormatException;
        //  374    384    515    520    Ljava/lang/NumberFormatException;
        //  389    397    520    535    Ljava/lang/NumberFormatException;
        //  410    415    425    430    Ljava/lang/NumberFormatException;
        //  420    424    425    430    Ljava/lang/NumberFormatException;
        //  432    435    435    440    Ljava/lang/NumberFormatException;
        //  437    440    440    445    Ljava/lang/NumberFormatException;
        //  442    445    445    450    Ljava/lang/NumberFormatException;
        //  452    455    455    465    Ljava/lang/NumberFormatException;
        //  457    460    460    465    Ljava/lang/NumberFormatException;
        //  462    465    465    470    Ljava/lang/NumberFormatException;
        //  467    470    470    475    Ljava/lang/NumberFormatException;
        //  472    475    475    480    Ljava/lang/NumberFormatException;
        //  482    485    485    495    Ljava/lang/NumberFormatException;
        //  487    490    490    495    Ljava/lang/NumberFormatException;
        //  492    495    495    500    Ljava/lang/NumberFormatException;
        //  497    500    500    505    Ljava/lang/NumberFormatException;
        //  502    505    505    510    Ljava/lang/NumberFormatException;
        //  507    510    510    515    Ljava/lang/NumberFormatException;
        //  512    515    515    520    Ljava/lang/NumberFormatException;
        //  517    520    520    535    Ljava/lang/NumberFormatException;
        //  522    525    525    535    Ljava/lang/NumberFormatException;
        //  527    530    530    535    Ljava/lang/NumberFormatException;
        //  532    535    425    430    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 232, Size: 232
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
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
    
    public boolean onContextItemSelected(final MenuItem menuItem) {
        this.Q = (a_9)((AdapterView$AdapterContextMenuInfo)menuItem.getMenuInfo()).targetView.getTag();
        this.e(menuItem.getItemId());
        return true;
    }
    
    @Override
    public void onCreate(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: getstatic       com/whatsapp/GroupChatInfo.T:[Ljava/lang/String;
        //     7: iconst_3       
        //     8: aaload         
        //     9: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    12: getstatic       com/whatsapp/fieldstats/aq.GROUP_INFO:Lcom/whatsapp/fieldstats/aq;
        //    15: invokestatic    com/whatsapp/aam.a:(Lcom/whatsapp/fieldstats/aq;)V
        //    18: aload_0        
        //    19: aload_1        
        //    20: invokespecial   com/whatsapp/ChatInfoActivity.onCreate:(Landroid/os/Bundle;)V
        //    23: aload_0        
        //    24: invokevirtual   com/whatsapp/GroupChatInfo.supportPostponeEnterTransition:()V
        //    27: aload_0        
        //    28: aload_0        
        //    29: invokevirtual   com/whatsapp/GroupChatInfo.getLayoutInflater:()Landroid/view/LayoutInflater;
        //    32: ldc_w           2130903165
        //    35: aconst_null    
        //    36: iconst_0       
        //    37: invokestatic    com/whatsapp/alm.a:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //    40: checkcast       Lcom/whatsapp/ChatInfoLayout;
        //    43: putfield        com/whatsapp/GroupChatInfo.v:Lcom/whatsapp/ChatInfoLayout;
        //    46: aload_0        
        //    47: aload_0        
        //    48: getfield        com/whatsapp/GroupChatInfo.v:Lcom/whatsapp/ChatInfoLayout;
        //    51: invokevirtual   com/whatsapp/GroupChatInfo.setContentView:(Landroid/view/View;)V
        //    54: aload_0        
        //    55: ldc_w           2131755371
        //    58: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //    61: checkcast       Landroid/support/v7/widget/Toolbar;
        //    64: astore_3       
        //    65: aload_3        
        //    66: ldc_w           ""
        //    69: invokevirtual   android/support/v7/widget/Toolbar.setTitle:(Ljava/lang/CharSequence;)V
        //    72: aload_3        
        //    73: iconst_0       
        //    74: iconst_0       
        //    75: invokevirtual   android/support/v7/widget/Toolbar.setContentInsetsAbsolute:(II)V
        //    78: aload_0        
        //    79: aload_3        
        //    80: invokevirtual   com/whatsapp/GroupChatInfo.setSupportActionBar:(Landroid/support/v7/widget/Toolbar;)V
        //    83: aload_0        
        //    84: invokevirtual   com/whatsapp/GroupChatInfo.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //    87: iconst_1       
        //    88: invokevirtual   android/support/v7/app/ActionBar.setDisplayHomeAsUpEnabled:(Z)V
        //    91: aload_3        
        //    92: new             Lcom/whatsapp/util/m;
        //    95: dup            
        //    96: aload_0        
        //    97: invokevirtual   com/whatsapp/GroupChatInfo.getResources:()Landroid/content/res/Resources;
        //   100: ldc_w           2130838738
        //   103: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   106: invokespecial   com/whatsapp/util/m.<init>:(Landroid/graphics/drawable/Drawable;)V
        //   109: invokevirtual   android/support/v7/widget/Toolbar.setNavigationIcon:(Landroid/graphics/drawable/Drawable;)V
        //   112: aload_0        
        //   113: aload_0        
        //   114: invokevirtual   com/whatsapp/GroupChatInfo.c:()Landroid/widget/ListView;
        //   117: putfield        com/whatsapp/GroupChatInfo.E:Landroid/widget/ListView;
        //   120: aload_0        
        //   121: aload_0        
        //   122: invokevirtual   com/whatsapp/GroupChatInfo.getLayoutInflater:()Landroid/view/LayoutInflater;
        //   125: ldc_w           2130903167
        //   128: aload_0        
        //   129: getfield        com/whatsapp/GroupChatInfo.E:Landroid/widget/ListView;
        //   132: iconst_0       
        //   133: invokestatic    com/whatsapp/alm.a:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //   136: putfield        com/whatsapp/GroupChatInfo.C:Landroid/view/View;
        //   139: aload_0        
        //   140: getfield        com/whatsapp/GroupChatInfo.E:Landroid/widget/ListView;
        //   143: aload_0        
        //   144: getfield        com/whatsapp/GroupChatInfo.C:Landroid/view/View;
        //   147: aconst_null    
        //   148: iconst_0       
        //   149: invokevirtual   android/widget/ListView.addHeaderView:(Landroid/view/View;Ljava/lang/Object;Z)V
        //   152: aload_0        
        //   153: aload_0        
        //   154: ldc_w           2131755280
        //   157: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   160: putfield        com/whatsapp/GroupChatInfo.D:Landroid/view/View;
        //   163: aload_0        
        //   164: getfield        com/whatsapp/GroupChatInfo.v:Lcom/whatsapp/ChatInfoLayout;
        //   167: invokevirtual   com/whatsapp/ChatInfoLayout.b:()V
        //   170: aload_0        
        //   171: aload_0        
        //   172: invokevirtual   com/whatsapp/GroupChatInfo.getLayoutInflater:()Landroid/view/LayoutInflater;
        //   175: ldc_w           2130903166
        //   178: aload_0        
        //   179: getfield        com/whatsapp/GroupChatInfo.E:Landroid/widget/ListView;
        //   182: iconst_0       
        //   183: invokestatic    com/whatsapp/alm.a:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //   186: putfield        com/whatsapp/GroupChatInfo.S:Landroid/view/View;
        //   189: aload_0        
        //   190: getfield        com/whatsapp/GroupChatInfo.E:Landroid/widget/ListView;
        //   193: aload_0        
        //   194: getfield        com/whatsapp/GroupChatInfo.S:Landroid/view/View;
        //   197: aconst_null    
        //   198: iconst_0       
        //   199: invokevirtual   android/widget/ListView.addFooterView:(Landroid/view/View;Ljava/lang/Object;Z)V
        //   202: aload_0        
        //   203: new             Landroid/widget/LinearLayout;
        //   206: dup            
        //   207: aload_0        
        //   208: invokespecial   android/widget/LinearLayout.<init>:(Landroid/content/Context;)V
        //   211: putfield        com/whatsapp/GroupChatInfo.r:Landroid/widget/LinearLayout;
        //   214: aload_0        
        //   215: invokevirtual   com/whatsapp/GroupChatInfo.getWindowManager:()Landroid/view/WindowManager;
        //   218: invokeinterface android/view/WindowManager.getDefaultDisplay:()Landroid/view/Display;
        //   223: invokevirtual   android/view/Display.getHeight:()I
        //   226: istore          4
        //   228: aload_0        
        //   229: getfield        com/whatsapp/GroupChatInfo.r:Landroid/widget/LinearLayout;
        //   232: iconst_0       
        //   233: iconst_0       
        //   234: iconst_0       
        //   235: iload           4
        //   237: invokevirtual   android/widget/LinearLayout.setPadding:(IIII)V
        //   240: aload_0        
        //   241: getfield        com/whatsapp/GroupChatInfo.E:Landroid/widget/ListView;
        //   244: aload_0        
        //   245: getfield        com/whatsapp/GroupChatInfo.r:Landroid/widget/LinearLayout;
        //   248: aconst_null    
        //   249: iconst_0       
        //   250: invokevirtual   android/widget/ListView.addFooterView:(Landroid/view/View;Ljava/lang/Object;Z)V
        //   253: aload_0        
        //   254: aload_0        
        //   255: invokevirtual   com/whatsapp/GroupChatInfo.getIntent:()Landroid/content/Intent;
        //   258: getstatic       com/whatsapp/GroupChatInfo.T:[Ljava/lang/String;
        //   261: iconst_4       
        //   262: aaload         
        //   263: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   266: putfield        com/whatsapp/GroupChatInfo.z:Ljava/lang/String;
        //   269: aload_0        
        //   270: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   273: aload_0        
        //   274: getfield        com/whatsapp/GroupChatInfo.z:Ljava/lang/String;
        //   277: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   280: putfield        com/whatsapp/GroupChatInfo.R:Lcom/whatsapp/a_9;
        //   283: aload_0        
        //   284: getfield        com/whatsapp/GroupChatInfo.J:Ljava/util/HashMap;
        //   287: invokevirtual   java/util/HashMap.clear:()V
        //   290: aload_0        
        //   291: aload_0        
        //   292: getfield        com/whatsapp/GroupChatInfo.w:Ljava/util/ArrayList;
        //   295: aload_0        
        //   296: getfield        com/whatsapp/GroupChatInfo.z:Ljava/lang/String;
        //   299: invokespecial   com/whatsapp/GroupChatInfo.b:(Ljava/util/ArrayList;Ljava/lang/String;)V
        //   302: aload_0        
        //   303: new             Lcom/whatsapp/k0;
        //   306: dup            
        //   307: aload_0        
        //   308: aload_0        
        //   309: aload_0        
        //   310: getfield        com/whatsapp/GroupChatInfo.w:Ljava/util/ArrayList;
        //   313: invokespecial   com/whatsapp/k0.<init>:(Lcom/whatsapp/GroupChatInfo;Landroid/content/Context;Ljava/util/List;)V
        //   316: putfield        com/whatsapp/GroupChatInfo.P:Lcom/whatsapp/k0;
        //   319: aload_0        
        //   320: getfield        com/whatsapp/GroupChatInfo.E:Landroid/widget/ListView;
        //   323: new             Lcom/whatsapp/ko;
        //   326: dup            
        //   327: aload_0        
        //   328: invokespecial   com/whatsapp/ko.<init>:(Lcom/whatsapp/GroupChatInfo;)V
        //   331: invokevirtual   android/widget/ListView.setOnItemClickListener:(Landroid/widget/AdapterView$OnItemClickListener;)V
        //   334: new             Lcom/whatsapp/t_;
        //   337: dup            
        //   338: aload_0        
        //   339: invokespecial   com/whatsapp/t_.<init>:(Lcom/whatsapp/GroupChatInfo;)V
        //   342: astore          5
        //   344: aload_0        
        //   345: getfield        com/whatsapp/GroupChatInfo.v:Lcom/whatsapp/ChatInfoLayout;
        //   348: astore          7
        //   350: aload_0        
        //   351: invokevirtual   com/whatsapp/GroupChatInfo.getResources:()Landroid/content/res/Resources;
        //   354: ldc_w           2131361822
        //   357: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   360: istore          8
        //   362: aload_0        
        //   363: getfield        com/whatsapp/GroupChatInfo.z:Ljava/lang/String;
        //   366: invokestatic    com/whatsapp/adc.e:(Ljava/lang/String;)Z
        //   369: ifeq            1190
        //   372: aload_0        
        //   373: invokevirtual   com/whatsapp/GroupChatInfo.getResources:()Landroid/content/res/Resources;
        //   376: ldc_w           2131361822
        //   379: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   382: istore          50
        //   384: iload           50
        //   386: istore          9
        //   388: aload           7
        //   390: iload           8
        //   392: iload           9
        //   394: invokevirtual   com/whatsapp/ChatInfoLayout.setCollapsedPadding:(II)V
        //   397: aload_0        
        //   398: ldc_w           2131755588
        //   401: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   404: astore          10
        //   406: aload_0        
        //   407: getfield        com/whatsapp/GroupChatInfo.z:Ljava/lang/String;
        //   410: invokestatic    com/whatsapp/adc.e:(Ljava/lang/String;)Z
        //   413: istore          12
        //   415: iload           12
        //   417: ifeq            1201
        //   420: iconst_0       
        //   421: istore          13
        //   423: aload           10
        //   425: iload           13
        //   427: invokevirtual   android/view/View.setVisibility:(I)V
        //   430: aload           10
        //   432: aload           5
        //   434: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   437: aload           10
        //   439: ldc_w           2130838967
        //   442: invokevirtual   android/view/View.setBackgroundResource:(I)V
        //   445: aload_0        
        //   446: ldc_w           2131755384
        //   449: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   452: bipush          8
        //   454: invokevirtual   android/view/View.setVisibility:(I)V
        //   457: aload_0        
        //   458: aload_0        
        //   459: ldc_w           2131755599
        //   462: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   465: checkcast       Landroid/widget/TextView;
        //   468: putfield        com/whatsapp/GroupChatInfo.B:Landroid/widget/TextView;
        //   471: aload_0        
        //   472: ldc             2131755597
        //   474: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   477: bipush          8
        //   479: invokevirtual   android/view/View.setVisibility:(I)V
        //   482: aload_0        
        //   483: aload_0        
        //   484: ldc_w           2131755362
        //   487: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   490: checkcast       Landroid/widget/TextView;
        //   493: putfield        com/whatsapp/GroupChatInfo.s:Landroid/widget/TextView;
        //   496: aload_0        
        //   497: getfield        com/whatsapp/GroupChatInfo.z:Ljava/lang/String;
        //   500: astore          16
        //   502: aload_0        
        //   503: getfield        com/whatsapp/GroupChatInfo.R:Lcom/whatsapp/a_9;
        //   506: invokevirtual   com/whatsapp/a_9.r:()Z
        //   509: istore          17
        //   511: iload           17
        //   513: ifne            533
        //   516: aload_0        
        //   517: getfield        com/whatsapp/GroupChatInfo.R:Lcom/whatsapp/a_9;
        //   520: getfield        com/whatsapp/a_9.m:Ljava/lang/String;
        //   523: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   526: istore          49
        //   528: iload           49
        //   530: ifeq            1218
        //   533: iconst_1       
        //   534: istore          18
        //   536: aload           16
        //   538: iload           18
        //   540: invokestatic    com/whatsapp/App.e:(Ljava/lang/String;Z)V
        //   543: aload_0        
        //   544: invokespecial   com/whatsapp/GroupChatInfo.i:()V
        //   547: aload_0        
        //   548: invokespecial   com/whatsapp/GroupChatInfo.p:()V
        //   551: aload_0        
        //   552: ldc_w           2131755591
        //   555: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   558: new             Lcom/whatsapp/hz;
        //   561: dup            
        //   562: aload_0        
        //   563: invokespecial   com/whatsapp/hz.<init>:(Lcom/whatsapp/GroupChatInfo;)V
        //   566: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   569: aload_0        
        //   570: ldc_w           2131755592
        //   573: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   576: new             Lcom/whatsapp/c2;
        //   579: dup            
        //   580: aload_0        
        //   581: invokespecial   com/whatsapp/c2.<init>:(Lcom/whatsapp/GroupChatInfo;)V
        //   584: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   587: new             Lcom/whatsapp/a_1;
        //   590: dup            
        //   591: aload_0        
        //   592: invokespecial   com/whatsapp/a_1.<init>:(Lcom/whatsapp/GroupChatInfo;)V
        //   595: astore          19
        //   597: aload_0        
        //   598: ldc_w           2131755385
        //   601: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   604: aload           19
        //   606: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   609: aload_0        
        //   610: ldc_w           2131755386
        //   613: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   616: aload           19
        //   618: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   621: aload_0        
        //   622: ldc_w           2131755600
        //   625: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   628: new             Lcom/whatsapp/oq;
        //   631: dup            
        //   632: aload_0        
        //   633: invokespecial   com/whatsapp/oq.<init>:(Lcom/whatsapp/GroupChatInfo;)V
        //   636: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   639: aload_0        
        //   640: aload_0        
        //   641: ldc_w           2131755367
        //   644: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   647: checkcast       Landroid/widget/ImageView;
        //   650: putfield        com/whatsapp/GroupChatInfo.L:Landroid/widget/ImageView;
        //   653: aload_0        
        //   654: ldc_w           2131755370
        //   657: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   660: new             Lcom/whatsapp/ahj;
        //   663: dup            
        //   664: aload_0        
        //   665: invokespecial   com/whatsapp/ahj.<init>:(Lcom/whatsapp/GroupChatInfo;)V
        //   668: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   671: aload_0        
        //   672: aload_0        
        //   673: ldc_w           2131755358
        //   676: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   679: putfield        com/whatsapp/GroupChatInfo.N:Landroid/view/View;
        //   682: aload_0        
        //   683: getfield        com/whatsapp/GroupChatInfo.E:Landroid/widget/ListView;
        //   686: aload_0        
        //   687: getfield        com/whatsapp/GroupChatInfo.P:Lcom/whatsapp/k0;
        //   690: invokevirtual   android/widget/ListView.setAdapter:(Landroid/widget/ListAdapter;)V
        //   693: aload_0        
        //   694: aload_0        
        //   695: getfield        com/whatsapp/GroupChatInfo.E:Landroid/widget/ListView;
        //   698: invokevirtual   com/whatsapp/GroupChatInfo.registerForContextMenu:(Landroid/view/View;)V
        //   701: aload_0        
        //   702: aload_0        
        //   703: ldc_w           2131755361
        //   706: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   709: checkcast       Landroid/widget/TextView;
        //   712: putfield        com/whatsapp/GroupChatInfo.t:Landroid/widget/TextView;
        //   715: aload_0        
        //   716: invokespecial   com/whatsapp/GroupChatInfo.q:()V
        //   719: aload_0        
        //   720: aload_0        
        //   721: ldc_w           2131755587
        //   724: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   727: checkcast       Landroid/widget/ImageButton;
        //   730: putfield        com/whatsapp/GroupChatInfo.q:Landroid/widget/ImageButton;
        //   733: aload_0        
        //   734: aload_0        
        //   735: ldc_w           2131755586
        //   738: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   741: putfield        com/whatsapp/GroupChatInfo.K:Landroid/view/View;
        //   744: aload_0        
        //   745: getfield        com/whatsapp/GroupChatInfo.q:Landroid/widget/ImageButton;
        //   748: new             Lcom/whatsapp/ahc;
        //   751: dup            
        //   752: aload_0        
        //   753: invokespecial   com/whatsapp/ahc.<init>:(Lcom/whatsapp/GroupChatInfo;)V
        //   756: invokevirtual   android/widget/ImageButton.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   759: aload_0        
        //   760: aload_0        
        //   761: ldc_w           2131755605
        //   764: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   767: checkcast       Landroid/widget/TextView;
        //   770: putfield        com/whatsapp/GroupChatInfo.M:Landroid/widget/TextView;
        //   773: aload_0        
        //   774: getfield        com/whatsapp/GroupChatInfo.M:Landroid/widget/TextView;
        //   777: astore          21
        //   779: iconst_2       
        //   780: anewarray       Ljava/lang/Object;
        //   783: astore          22
        //   785: aload           22
        //   787: iconst_0       
        //   788: aload_0        
        //   789: getfield        com/whatsapp/GroupChatInfo.w:Ljava/util/ArrayList;
        //   792: invokevirtual   java/util/ArrayList.size:()I
        //   795: getstatic       com/whatsapp/ym.c:I
        //   798: invokestatic    java/lang/Math.min:(II)I
        //   801: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   804: aastore        
        //   805: aload           22
        //   807: iconst_1       
        //   808: getstatic       com/whatsapp/ym.c:I
        //   811: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   814: aastore        
        //   815: aload           21
        //   817: aload_0        
        //   818: ldc_w           2131231443
        //   821: aload           22
        //   823: invokevirtual   com/whatsapp/GroupChatInfo.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   826: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   829: aload_0        
        //   830: getfield        com/whatsapp/GroupChatInfo.z:Ljava/lang/String;
        //   833: invokestatic    com/whatsapp/util/b.a:(Ljava/lang/String;)V
        //   836: aload_0        
        //   837: ldc_w           2131755603
        //   840: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   843: astore          23
        //   845: aload_0        
        //   846: getfield        com/whatsapp/GroupChatInfo.z:Ljava/lang/String;
        //   849: invokestatic    com/whatsapp/adc.a:(Ljava/lang/String;)Lcom/whatsapp/atf;
        //   852: invokevirtual   com/whatsapp/atf.j:()I
        //   855: istore          24
        //   857: iload           24
        //   859: ifle            1229
        //   862: iconst_0       
        //   863: istore          25
        //   865: aload           23
        //   867: iload           25
        //   869: invokevirtual   android/view/View.setVisibility:(I)V
        //   872: aload_0        
        //   873: ldc_w           2131755591
        //   876: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   879: checkcast       Landroid/widget/TextView;
        //   882: astore          27
        //   884: aload_0        
        //   885: getfield        com/whatsapp/GroupChatInfo.z:Ljava/lang/String;
        //   888: invokestatic    com/whatsapp/adc.f:(Ljava/lang/String;)Z
        //   891: istore          28
        //   893: iload           28
        //   895: ifeq            1241
        //   898: ldc_w           2131231103
        //   901: istore          29
        //   903: aload           27
        //   905: iload           29
        //   907: invokevirtual   android/widget/TextView.setText:(I)V
        //   910: aload_0        
        //   911: ldc_w           2131755440
        //   914: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   917: astore          31
        //   919: aload_0        
        //   920: getfield        com/whatsapp/GroupChatInfo.z:Ljava/lang/String;
        //   923: invokestatic    com/whatsapp/adc.f:(Ljava/lang/String;)Z
        //   926: istore          32
        //   928: iload           32
        //   930: ifeq            1254
        //   933: bipush          8
        //   935: istore          33
        //   937: aload           31
        //   939: iload           33
        //   941: invokevirtual   android/view/View.setVisibility:(I)V
        //   944: aload_0        
        //   945: ldc_w           2131755592
        //   948: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   951: bipush          8
        //   953: invokevirtual   android/view/View.setVisibility:(I)V
        //   956: invokestatic    com/whatsapp/App.ah:()Z
        //   959: istore          38
        //   961: iload           38
        //   963: ifeq            1013
        //   966: aload_0        
        //   967: getfield        com/whatsapp/GroupChatInfo.z:Ljava/lang/String;
        //   970: invokestatic    com/whatsapp/adc.f:(Ljava/lang/String;)Z
        //   973: istore          46
        //   975: iload           46
        //   977: ifeq            1013
        //   980: aload_0        
        //   981: ldc_w           2131755593
        //   984: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //   987: iconst_0       
        //   988: invokevirtual   android/view/View.setVisibility:(I)V
        //   991: iload_2        
        //   992: ifeq            1025
        //   995: getstatic       com/whatsapp/DialogToastActivity.h:Z
        //   998: istore          47
        //  1000: iconst_0       
        //  1001: istore          48
        //  1003: iload           47
        //  1005: ifeq            1280
        //  1008: iload           48
        //  1010: putstatic       com/whatsapp/DialogToastActivity.h:Z
        //  1013: aload_0        
        //  1014: ldc_w           2131755593
        //  1017: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //  1020: bipush          8
        //  1022: invokevirtual   android/view/View.setVisibility:(I)V
        //  1025: invokestatic    com/whatsapp/App.ah:()Z
        //  1028: ifeq            1066
        //  1031: aload_0        
        //  1032: ldc_w           2131755594
        //  1035: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //  1038: checkcast       Landroid/widget/TextView;
        //  1041: new             Lcom/whatsapp/oy;
        //  1044: dup            
        //  1045: aload_0        
        //  1046: invokespecial   com/whatsapp/oy.<init>:(Lcom/whatsapp/GroupChatInfo;)V
        //  1049: invokevirtual   android/widget/TextView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //  1052: aload_0        
        //  1053: invokespecial   com/whatsapp/GroupChatInfo.m:()V
        //  1056: getstatic       com/whatsapp/dt.c:Lcom/whatsapp/dt;
        //  1059: aload_0        
        //  1060: getfield        com/whatsapp/GroupChatInfo.G:Lcom/whatsapp/gt;
        //  1063: invokevirtual   com/whatsapp/dt.b:(Lcom/whatsapp/gt;)V
        //  1066: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //  1069: aload_0        
        //  1070: getfield        com/whatsapp/GroupChatInfo.H:Lcom/whatsapp/sj;
        //  1073: invokevirtual   com/whatsapp/vy.a:(Lcom/whatsapp/sj;)V
        //  1076: aload_0        
        //  1077: invokestatic    com/whatsapp/App.b:(Lcom/whatsapp/aws;)V
        //  1080: aload_1        
        //  1081: ifnull          1113
        //  1084: aload_1        
        //  1085: getstatic       com/whatsapp/GroupChatInfo.T:[Ljava/lang/String;
        //  1088: bipush          6
        //  1090: aaload         
        //  1091: invokevirtual   android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //  1094: astore          44
        //  1096: aload           44
        //  1098: ifnull          1113
        //  1101: aload_0        
        //  1102: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //  1105: aload           44
        //  1107: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //  1110: putfield        com/whatsapp/GroupChatInfo.Q:Lcom/whatsapp/a_9;
        //  1113: getstatic       android/os/Build$VERSION.SDK_INT:I
        //  1116: istore          42
        //  1118: iload           42
        //  1120: bipush          21
        //  1122: if_icmplt       1180
        //  1125: aload_0        
        //  1126: invokevirtual   com/whatsapp/GroupChatInfo.getIntent:()Landroid/content/Intent;
        //  1129: getstatic       com/whatsapp/GroupChatInfo.T:[Ljava/lang/String;
        //  1132: iconst_5       
        //  1133: aaload         
        //  1134: iconst_0       
        //  1135: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //  1138: istore          43
        //  1140: iload           43
        //  1142: ifeq            1163
        //  1145: aload_0        
        //  1146: getfield        com/whatsapp/GroupChatInfo.D:Landroid/view/View;
        //  1149: aload_0        
        //  1150: ldc_w           2131232142
        //  1153: invokevirtual   com/whatsapp/GroupChatInfo.getString:(I)Ljava/lang/String;
        //  1156: invokevirtual   android/view/View.setTransitionName:(Ljava/lang/String;)V
        //  1159: iload_2        
        //  1160: ifeq            1180
        //  1163: aload_0        
        //  1164: ldc_w           2131755367
        //  1167: invokevirtual   com/whatsapp/GroupChatInfo.findViewById:(I)Landroid/view/View;
        //  1170: aload_0        
        //  1171: ldc_w           2131232142
        //  1174: invokevirtual   com/whatsapp/GroupChatInfo.getString:(I)Ljava/lang/String;
        //  1177: invokevirtual   android/view/View.setTransitionName:(Ljava/lang/String;)V
        //  1180: aload_0        
        //  1181: putstatic       com/whatsapp/GroupChatInfo.y:Lcom/whatsapp/GroupChatInfo;
        //  1184: return         
        //  1185: astore          6
        //  1187: aload           6
        //  1189: athrow         
        //  1190: iconst_0       
        //  1191: istore          9
        //  1193: goto            388
        //  1196: astore          11
        //  1198: aload           11
        //  1200: athrow         
        //  1201: bipush          8
        //  1203: istore          13
        //  1205: goto            423
        //  1208: astore          14
        //  1210: aload           14
        //  1212: athrow         
        //  1213: astore          15
        //  1215: aload           15
        //  1217: athrow         
        //  1218: iconst_0       
        //  1219: istore          18
        //  1221: goto            536
        //  1224: astore          20
        //  1226: aload           20
        //  1228: athrow         
        //  1229: bipush          8
        //  1231: istore          25
        //  1233: goto            865
        //  1236: astore          26
        //  1238: aload           26
        //  1240: athrow         
        //  1241: ldc_w           2131231019
        //  1244: istore          29
        //  1246: goto            903
        //  1249: astore          30
        //  1251: aload           30
        //  1253: athrow         
        //  1254: iconst_0       
        //  1255: istore          33
        //  1257: goto            937
        //  1260: astore          34
        //  1262: aload           34
        //  1264: athrow         
        //  1265: astore          35
        //  1267: aload           35
        //  1269: athrow         
        //  1270: astore          36
        //  1272: aload           36
        //  1274: athrow         
        //  1275: astore          37
        //  1277: aload           37
        //  1279: athrow         
        //  1280: iconst_1       
        //  1281: istore          48
        //  1283: goto            1008
        //  1286: astore          45
        //  1288: aload           45
        //  1290: athrow         
        //  1291: astore          39
        //  1293: aload           39
        //  1295: athrow         
        //  1296: astore          40
        //  1298: aload           40
        //  1300: athrow         
        //  1301: astore          41
        //  1303: aload           41
        //  1305: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  344    384    1185   1190   Ljava/lang/NumberFormatException;
        //  406    415    1196   1201   Ljava/lang/NumberFormatException;
        //  423    511    1208   1213   Ljava/lang/NumberFormatException;
        //  516    528    1213   1218   Ljava/lang/NumberFormatException;
        //  597    857    1224   1229   Ljava/lang/NumberFormatException;
        //  865    893    1236   1241   Ljava/lang/NumberFormatException;
        //  903    928    1249   1254   Ljava/lang/NumberFormatException;
        //  937    961    1260   1265   Ljava/lang/NumberFormatException;
        //  966    975    1265   1270   Ljava/lang/NumberFormatException;
        //  980    991    1270   1275   Ljava/lang/NumberFormatException;
        //  995    1000   1275   1280   Ljava/lang/NumberFormatException;
        //  1101   1113   1286   1291   Ljava/lang/NumberFormatException;
        //  1113   1118   1291   1296   Ljava/lang/NumberFormatException;
        //  1125   1140   1296   1301   Ljava/lang/NumberFormatException;
        //  1145   1159   1301   1306   Ljava/lang/NumberFormatException;
        //  1163   1180   1301   1306   Ljava/lang/NumberFormatException;
        //  1210   1213   1213   1218   Ljava/lang/NumberFormatException;
        //  1262   1265   1265   1270   Ljava/lang/NumberFormatException;
        //  1267   1270   1270   1275   Ljava/lang/NumberFormatException;
        //  1272   1275   1275   1280   Ljava/lang/NumberFormatException;
        //  1293   1296   1296   1301   Ljava/lang/NumberFormatException;
        //  1298   1301   1301   1306   Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 605, Size: 605
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
    public void onCreateContextMenu(final ContextMenu p0, final View p1, final ContextMenu$ContextMenuInfo p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: aload_2        
        //     3: aload_3        
        //     4: invokespecial   com/whatsapp/ChatInfoActivity.onCreateContextMenu:(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
        //     7: aload_3        
        //     8: checkcast       Landroid/widget/AdapterView$AdapterContextMenuInfo;
        //    11: getfield        android/widget/AdapterView$AdapterContextMenuInfo.targetView:Landroid/view/View;
        //    14: invokevirtual   android/view/View.getTag:()Ljava/lang/Object;
        //    17: checkcast       Lcom/whatsapp/a_9;
        //    20: astore          4
        //    22: aload           4
        //    24: ifnonnull       28
        //    27: return         
        //    28: aload_0        
        //    29: getfield        com/whatsapp/GroupChatInfo.J:Ljava/util/HashMap;
        //    32: aload           4
        //    34: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    37: invokevirtual   java/util/HashMap.containsKey:(Ljava/lang/Object;)Z
        //    40: istore          6
        //    42: iload           6
        //    44: ifne            27
        //    47: iconst_1       
        //    48: anewarray       Ljava/lang/Object;
        //    51: astore          9
        //    53: aload           9
        //    55: iconst_0       
        //    56: aload           4
        //    58: invokevirtual   com/whatsapp/a_9.l:()Ljava/lang/String;
        //    61: aastore        
        //    62: aload_1        
        //    63: iconst_0       
        //    64: iconst_1       
        //    65: iconst_0       
        //    66: aload_0        
        //    67: ldc_w           2131231318
        //    70: aload           9
        //    72: invokevirtual   com/whatsapp/GroupChatInfo.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //    75: invokeinterface android/view/ContextMenu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //    80: pop            
        //    81: iconst_1       
        //    82: anewarray       Ljava/lang/Object;
        //    85: astore          11
        //    87: aload           11
        //    89: iconst_0       
        //    90: aload           4
        //    92: invokevirtual   com/whatsapp/a_9.l:()Ljava/lang/String;
        //    95: aastore        
        //    96: aload_1        
        //    97: iconst_0       
        //    98: iconst_4       
        //    99: iconst_0       
        //   100: aload_0        
        //   101: ldc_w           2131230860
        //   104: aload           11
        //   106: invokevirtual   com/whatsapp/GroupChatInfo.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   109: invokeinterface android/view/ContextMenu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //   114: pop            
        //   115: aload           4
        //   117: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //   120: astore          13
        //   122: aload           13
        //   124: ifnonnull       167
        //   127: aload_1        
        //   128: iconst_0       
        //   129: iconst_2       
        //   130: iconst_0       
        //   131: aload_0        
        //   132: ldc_w           2131230790
        //   135: invokevirtual   com/whatsapp/GroupChatInfo.getString:(I)Ljava/lang/String;
        //   138: invokeinterface android/view/ContextMenu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //   143: pop            
        //   144: aload_1        
        //   145: iconst_0       
        //   146: iconst_3       
        //   147: iconst_0       
        //   148: aload_0        
        //   149: ldc_w           2131230792
        //   152: invokevirtual   com/whatsapp/GroupChatInfo.getString:(I)Ljava/lang/String;
        //   155: invokeinterface android/view/ContextMenu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //   160: pop            
        //   161: getstatic       com/whatsapp/App.I:Z
        //   164: ifeq            201
        //   167: iconst_1       
        //   168: anewarray       Ljava/lang/Object;
        //   171: astore          14
        //   173: aload           14
        //   175: iconst_0       
        //   176: aload           4
        //   178: invokevirtual   com/whatsapp/a_9.l:()Ljava/lang/String;
        //   181: aastore        
        //   182: aload_1        
        //   183: iconst_0       
        //   184: iconst_0       
        //   185: iconst_0       
        //   186: aload_0        
        //   187: ldc_w           2131231910
        //   190: aload           14
        //   192: invokevirtual   com/whatsapp/GroupChatInfo.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   195: invokeinterface android/view/ContextMenu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //   200: pop            
        //   201: aload_0        
        //   202: getfield        com/whatsapp/GroupChatInfo.z:Ljava/lang/String;
        //   205: invokestatic    com/whatsapp/adc.e:(Ljava/lang/String;)Z
        //   208: istore          18
        //   210: iload           18
        //   212: ifeq            27
        //   215: aload_0        
        //   216: getfield        com/whatsapp/GroupChatInfo.z:Ljava/lang/String;
        //   219: aload           4
        //   221: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   224: invokestatic    com/whatsapp/adc.b:(Ljava/lang/String;Ljava/lang/String;)Z
        //   227: istore          19
        //   229: iload           19
        //   231: ifeq            294
        //   234: iconst_1       
        //   235: anewarray       Ljava/lang/Object;
        //   238: astore          21
        //   240: aload           21
        //   242: iconst_0       
        //   243: aload           4
        //   245: invokevirtual   com/whatsapp/a_9.l:()Ljava/lang/String;
        //   248: aastore        
        //   249: aload_1        
        //   250: iconst_0       
        //   251: iconst_5       
        //   252: iconst_0       
        //   253: aload_0        
        //   254: ldc_w           2131231596
        //   257: aload           21
        //   259: invokevirtual   com/whatsapp/GroupChatInfo.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   262: invokeinterface android/view/ContextMenu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //   267: pop            
        //   268: return         
        //   269: astore          5
        //   271: aload           5
        //   273: athrow         
        //   274: astore          7
        //   276: aload           7
        //   278: athrow         
        //   279: astore          8
        //   281: aload           8
        //   283: athrow         
        //   284: astore          16
        //   286: aload           16
        //   288: athrow         
        //   289: astore          17
        //   291: aload           17
        //   293: athrow         
        //   294: aload_1        
        //   295: iconst_0       
        //   296: bipush          6
        //   298: iconst_0       
        //   299: aload_0        
        //   300: ldc_w           2131231292
        //   303: invokevirtual   com/whatsapp/GroupChatInfo.getString:(I)Ljava/lang/String;
        //   306: invokeinterface android/view/ContextMenu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //   311: pop            
        //   312: goto            234
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  28     42     269    274    Ljava/lang/NumberFormatException;
        //  47     122    274    279    Ljava/lang/NumberFormatException;
        //  127    167    279    284    Ljava/lang/NumberFormatException;
        //  167    201    279    284    Ljava/lang/NumberFormatException;
        //  201    210    284    289    Ljava/lang/NumberFormatException;
        //  215    229    289    294    Ljava/lang/NumberFormatException;
        //  276    279    279    284    Ljava/lang/NumberFormatException;
        //  286    289    289    294    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 159, Size: 159
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
    
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 50: {
                return new ah6(this, 2131231041, App.S.c(this.R.u).a((Context)this), new z_(this), ym.m, 2131231742, 2131231416);
            }
            case 1: {
                return new AlertDialog$Builder((Context)this).setMessage(cq.c(this.getString(2131231020, new Object[] { this.R.a((Context)this) }), this.getBaseContext())).setCancelable(true).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new tk(this)).setPositiveButton(2131230992, (DialogInterface$OnClickListener)new _w(this)).create();
            }
            case 2: {
                return new AlertDialog$Builder((Context)this).setMessage(cq.c(this.getString(2131231104, new Object[] { this.R.a((Context)this) }), this.getBaseContext())).setCancelable(true).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new aoo(this)).setPositiveButton(2131231102, (DialogInterface$OnClickListener)new aaw(this)).create();
            }
            case 3: {
                return new AlertDialog$Builder((Context)this).setMessage(cq.c(this.getString(2131231062, new Object[] { this.R.a((Context)this) }), this.getBaseContext())).setCancelable(true).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new a9j(this)).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new iy(this)).create();
            }
            case 6: {
                if (this.Q != null) {
                    return new AlertDialog$Builder((Context)this).setMessage(cq.c(this.getString(2131231601, new Object[] { this.Q.a((Context)this), this.R.a((Context)this) }), this.getBaseContext())).setCancelable(true).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new z9(this)).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new ul(this)).create();
                }
                return super.onCreateDialog(n);
            }
            case 4: {
                Log.w(GroupChatInfo.T[13]);
                return new AlertDialog$Builder((Context)this).setMessage(2131230786).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new es(this)).create();
            }
        }
    }
    
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        try {
            if (adc.e(this.z)) {
                MenuItemCompat.setShowAsAction(menu.add(0, 1, 0, 2131230793).setIcon(2130838709), 2);
            }
            return super.onCreateOptionsMenu(menu);
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
    }
    
    public void onDestroy() {
        try {
            Log.i(GroupChatInfo.T[24]);
            super.onDestroy();
            if (this.A != null) {
                this.A.cancel(true);
            }
            dt.c.a(this.G);
            App.ak.b(this.H);
            App.a((aws)this);
            this.F.a();
            com.whatsapp.util.b.c(this.z);
            GroupChatInfo.y = null;
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        try {
            switch (menuItem.getItemId()) {
                default: {
                    return super.onOptionsItemSelected(menuItem);
                }
                case 1: {
                    this.g();
                    return true;
                }
                case 16908332: {
                    break;
                }
            }
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
        ActivityCompat.finishAfterTransition(this);
        return true;
    }
    
    public void onResume() {
        super.onResume();
        this.e();
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        try {
            super.onSaveInstanceState(bundle);
            if (this.Q != null) {
                bundle.putString(GroupChatInfo.T[14], this.Q.u);
            }
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
    }
}
