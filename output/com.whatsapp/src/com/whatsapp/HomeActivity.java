// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.support.v7.app.AlertDialog;
import com.whatsapp.util.Log;
import android.content.DialogInterface$OnClickListener;
import android.support.v7.app.AlertDialog$Builder;
import android.content.Context;
import android.app.ProgressDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.content.res.Configuration;
import android.content.Intent;
import android.view.MotionEvent;
import android.text.format.DateUtils;
import com.whatsapp.protocol.bi;
import com.whatsapp.observablescrollview.g;
import com.whatsapp.observablescrollview.b;
import android.app.Activity;
import com.whatsapp.notification.w;
import android.os.AsyncTask;
import com.whatsapp.observablescrollview.ObservableListView;
import android.support.v4.app.DialogFragment;
import java.util.Iterator;
import java.util.List;
import android.support.v4.app.Fragment;
import android.view.inputmethod.InputMethodManager;
import android.support.v4.view.ViewPager$SimpleOnPageChangeListener;
import android.view.Menu;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.support.v7.widget.SearchView;
import com.whatsapp.observablescrollview.a;

public class HomeActivity extends DialogToastActivity implements _7, aa0, a
{
    private static final int D;
    private static final String[] F;
    private static final int o;
    private SearchView A;
    private int B;
    private TextView C;
    private int E;
    private View k;
    private int l;
    private HomeActivity$TabsPager m;
    private boolean n;
    private View p;
    private MenuItem q;
    private vg r;
    private ActionBar s;
    private Toolbar t;
    private Menu u;
    private ViewPager$SimpleOnPageChangeListener v;
    private a_e w;
    final InputMethodManager x;
    private View y;
    private int z;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: bipush          28
        //     2: anewarray       Ljava/lang/String;
        //     5: astore_0       
        //     6: ldc             "/H\u0019\u000e<$K\u001b\bxjP\u0006\u0004} "
        //     8: astore_1       
        //     9: iconst_m1      
        //    10: istore_2       
        //    11: aload_0        
        //    12: astore_3       
        //    13: iconst_0       
        //    14: istore          4
        //    16: aload_1        
        //    17: invokevirtual   java/lang/String.toCharArray:()[C
        //    20: astore          5
        //    22: aload           5
        //    24: arraylength    
        //    25: istore          6
        //    27: iconst_0       
        //    28: istore          7
        //    30: iload           6
        //    32: iload           7
        //    34: if_icmpgt       787
        //    37: new             Ljava/lang/String;
        //    40: dup            
        //    41: aload           5
        //    43: invokespecial   java/lang/String.<init>:([C)V
        //    46: invokevirtual   java/lang/String.intern:()Ljava/lang/String;
        //    49: astore          10
        //    51: iload_2        
        //    52: tableswitch {
        //                0: 195
        //                1: 214
        //                2: 233
        //                3: 252
        //                4: 271
        //                5: 291
        //                6: 312
        //                7: 333
        //                8: 354
        //                9: 375
        //               10: 396
        //               11: 417
        //               12: 438
        //               13: 459
        //               14: 480
        //               15: 501
        //               16: 522
        //               17: 543
        //               18: 564
        //               19: 585
        //               20: 606
        //               21: 627
        //               22: 648
        //               23: 669
        //               24: 690
        //               25: 711
        //               26: 732
        //          default: 176
        //        }
        //   176: aload_3        
        //   177: iload           4
        //   179: aload           10
        //   181: aastore        
        //   182: ldc             "/H\u0019\u000e<4PY\u000ek7N\u0006\u000ew"
        //   184: astore_1       
        //   185: iconst_1       
        //   186: istore          4
        //   188: aload_0        
        //   189: astore_3       
        //   190: iconst_0       
        //   191: istore_2       
        //   192: goto            16
        //   195: aload_3        
        //   196: iload           4
        //   198: aload           10
        //   200: aastore        
        //   201: ldc             "$H\u001a\u001dv5T\u0015\u001fz(I\u0007Kq(R\u001a\bvgS\u001bK~&N\u001a"
        //   203: astore_1       
        //   204: iconst_2       
        //   205: istore          4
        //   207: aload_0        
        //   208: astore_3       
        //   209: iconst_1       
        //   210: istore_2       
        //   211: goto            16
        //   214: aload_3        
        //   215: iload           4
        //   217: aload           10
        //   219: aastore        
        //   220: iconst_3       
        //   221: istore          4
        //   223: aload_0        
        //   224: astore_3       
        //   225: ldc             "$H\u0019Ed/F\u0000\u0018r7WZ\u0002}3B\u001a\u001f=&D\u0000\u0002|)\t7*_\u000bt"
        //   227: astore_1       
        //   228: iconst_2       
        //   229: istore_2       
        //   230: goto            16
        //   233: aload_3        
        //   234: iload           4
        //   236: aload           10
        //   238: aastore        
        //   239: iconst_4       
        //   240: istore          4
        //   242: ldc             "/H\u0019\u000e<$U\u0011\ng\""
        //   244: astore_1       
        //   245: iconst_3       
        //   246: istore_2       
        //   247: aload_0        
        //   248: astore_3       
        //   249: goto            16
        //   252: aload_3        
        //   253: iload           4
        //   255: aload           10
        //   257: aastore        
        //   258: iconst_5       
        //   259: istore          4
        //   261: ldc             "/H\u0019\u000e<$U\u0011\ng\"\b\u001a\u0004>*BY\u0004ajJ\u0007\f`3H\u0006\u000e>#E"
        //   263: astore_1       
        //   264: iconst_4       
        //   265: istore_2       
        //   266: aload_0        
        //   267: astore_3       
        //   268: goto            16
        //   271: aload_3        
        //   272: iload           4
        //   274: aload           10
        //   276: aastore        
        //   277: bipush          6
        //   279: istore          4
        //   281: ldc             ".I\u0004\u001eg\u0018J\u0011\u001f{(C"
        //   283: astore_1       
        //   284: iconst_5       
        //   285: istore_2       
        //   286: aload_0        
        //   287: astore_3       
        //   288: goto            16
        //   291: aload_3        
        //   292: iload           4
        //   294: aload           10
        //   296: aastore        
        //   297: bipush          7
        //   299: istore          4
        //   301: ldc             "4B\u0015\u0019p/"
        //   303: astore_1       
        //   304: bipush          6
        //   306: istore_2       
        //   307: aload_0        
        //   308: astore_3       
        //   309: goto            16
        //   312: aload_3        
        //   313: iload           4
        //   315: aload           10
        //   317: aastore        
        //   318: bipush          8
        //   320: istore          4
        //   322: ldc             "/H\u0019\u000e<7F\u0001\u0018v"
        //   324: astore_1       
        //   325: bipush          7
        //   327: istore_2       
        //   328: aload_0        
        //   329: astore_3       
        //   330: goto            16
        //   333: aload_3        
        //   334: iload           4
        //   336: aload           10
        //   338: aastore        
        //   339: bipush          9
        //   341: istore          4
        //   343: ldc             "\u0006u34Z\tn \"R\u000bx$$@\u000es=$]"
        //   345: astore_1       
        //   346: bipush          8
        //   348: istore_2       
        //   349: aload_0        
        //   350: astore_3       
        //   351: goto            16
        //   354: aload_3        
        //   355: iload           4
        //   357: aload           10
        //   359: aastore        
        //   360: bipush          10
        //   362: istore          4
        //   364: ldc             "\u0006u34Z\tn \"R\u000bx$$@\u000es=$]"
        //   366: astore_1       
        //   367: bipush          9
        //   369: istore_2       
        //   370: aload_0        
        //   371: astore_3       
        //   372: goto            16
        //   375: aload_3        
        //   376: iload           4
        //   378: aload           10
        //   380: aastore        
        //   381: bipush          11
        //   383: istore          4
        //   385: ldc             "5H\u00034z#"
        //   387: astore_1       
        //   388: bipush          10
        //   390: istore_2       
        //   391: aload_0        
        //   392: astore_3       
        //   393: goto            16
        //   396: aload_3        
        //   397: iload           4
        //   399: aload           10
        //   401: aastore        
        //   402: bipush          12
        //   404: istore          4
        //   406: ldc             "3U\u0015\u0005`+F\u0000\u0002|)~"
        //   408: astore_1       
        //   409: bipush          11
        //   411: istore_2       
        //   412: aload_0        
        //   413: astore_3       
        //   414: goto            16
        //   417: aload_3        
        //   418: iload           4
        //   420: aload           10
        //   422: aastore        
        //   423: bipush          13
        //   425: istore          4
        //   427: ldc             "4B\u0015\u0019p/"
        //   429: astore_1       
        //   430: bipush          12
        //   432: istore_2       
        //   433: aload_0        
        //   434: astore_3       
        //   435: goto            16
        //   438: aload_3        
        //   439: iload           4
        //   441: aload           10
        //   443: aastore        
        //   444: bipush          14
        //   446: istore          4
        //   448: ldc             "/H\u0019\u000e<#N\u0015\u0007| \u0007\u0007\u000ea1N\u0017\u000e>\"_\u0000\u000e}4N\u001b\u0005>&D\u0000\u0002e\""
        //   450: astore_1       
        //   451: bipush          13
        //   453: istore_2       
        //   454: aload_0        
        //   455: astore_3       
        //   456: goto            16
        //   459: aload_3        
        //   460: iload           4
        //   462: aload           10
        //   464: aastore        
        //   465: bipush          15
        //   467: istore          4
        //   469: ldc             "/H\u0019\u000e<#N\u0015\u0007| \u0007\u0007\u000ea1N\u0017\u000e>\"_\u0000\u000e}4N\u001b\u0005>7F\r\u0006v)S"
        //   471: astore_1       
        //   472: bipush          14
        //   474: istore_2       
        //   475: aload_0        
        //   476: astore_3       
        //   477: goto            16
        //   480: aload_3        
        //   481: iload           4
        //   483: aload           10
        //   485: aastore        
        //   486: bipush          16
        //   488: istore          4
        //   490: ldc             "/H\u0019\u000e<#N\u0015\u0007| \u0007\u0007\u000ea1N\u0017\u000e>\"_\u0000\u000e}4N\u001b\u0005>+N\u0012\u000eg.J\u0011"
        //   492: astore_1       
        //   493: bipush          15
        //   495: istore_2       
        //   496: aload_0        
        //   497: astore_3       
        //   498: goto            16
        //   501: aload_3        
        //   502: iload           4
        //   504: aload           10
        //   506: aastore        
        //   507: bipush          17
        //   509: istore          4
        //   511: ldc             "/H\u0019\u000e<#N\u0015\u0007| \u0007\u0007\u000ea1N\u0017\u000e>\"_\u0000\u000e}4N\u001b\u0005>\"_\u0004\u0002a\"C"
        //   513: astore_1       
        //   514: bipush          16
        //   516: istore_2       
        //   517: aload_0        
        //   518: astore_3       
        //   519: goto            16
        //   522: aload_3        
        //   523: iload           4
        //   525: aload           10
        //   527: aastore        
        //   528: bipush          18
        //   530: istore          4
        //   532: ldc             "/H\u0019\u000e<#N\u0015\u0007| \u0007\u0007\u000ea1N\u0017\u000e>\"_\u0000\u000e}4N\u001b\u0005>5H\u0018\u0007q&D\u001f"
        //   534: astore_1       
        //   535: bipush          17
        //   537: istore_2       
        //   538: aload_0        
        //   539: astore_3       
        //   540: goto            16
        //   543: aload_3        
        //   544: iload           4
        //   546: aload           10
        //   548: aastore        
        //   549: ldc             "/H\u0019\u000e<5B\u0007\u001e~\"\b\u001a\u0004>*BY\u0004ajJ\u0007\f`3H\u0006\u000e>#E"
        //   551: astore_1       
        //   552: bipush          18
        //   554: istore_2       
        //   555: bipush          19
        //   557: istore          4
        //   559: aload_0        
        //   560: astore_3       
        //   561: goto            16
        //   564: aload_3        
        //   565: iload           4
        //   567: aload           10
        //   569: aastore        
        //   570: bipush          20
        //   572: istore          4
        //   574: aload_0        
        //   575: astore_3       
        //   576: ldc             "$H\u001a\u001dv5T\u0015\u001fz(I\u0007Kq(R\u001a\bvgS\u001bK~&N\u001a"
        //   578: astore_1       
        //   579: bipush          19
        //   581: istore_2       
        //   582: goto            16
        //   585: aload_3        
        //   586: iload           4
        //   588: aload           10
        //   590: aastore        
        //   591: ldc             "/H\u0019\u000e<5B\u0007\u001e~\""
        //   593: astore_1       
        //   594: bipush          20
        //   596: istore_2       
        //   597: bipush          21
        //   599: istore          4
        //   601: aload_0        
        //   602: astore_3       
        //   603: goto            16
        //   606: aload_3        
        //   607: iload           4
        //   609: aload           10
        //   611: aastore        
        //   612: bipush          22
        //   614: istore          4
        //   616: aload_0        
        //   617: astore_3       
        //   618: ldc             "3U\u0015\u0005`+F\u0000\u0002|)~"
        //   620: astore_1       
        //   621: bipush          21
        //   623: istore_2       
        //   624: goto            16
        //   627: aload_3        
        //   628: iload           4
        //   630: aload           10
        //   632: aastore        
        //   633: bipush          23
        //   635: istore          4
        //   637: ldc             "\"I\u00104t5H\u0001\u001bL-N\u0010"
        //   639: astore_1       
        //   640: bipush          22
        //   642: istore_2       
        //   643: aload_0        
        //   644: astore_3       
        //   645: goto            16
        //   648: aload_3        
        //   649: iload           4
        //   651: aload           10
        //   653: aastore        
        //   654: bipush          24
        //   656: istore          4
        //   658: ldc             "$H\u0019Ed/F\u0000\u0018r7WZ\u0002}3B\u001a\u001f=&D\u0000\u0002|)\t7*_\u000bt"
        //   660: astore_1       
        //   661: bipush          23
        //   663: istore_2       
        //   664: aload_0        
        //   665: astore_3       
        //   666: goto            16
        //   669: aload_3        
        //   670: iload           4
        //   672: aload           10
        //   674: aastore        
        //   675: bipush          25
        //   677: istore          4
        //   679: ldc             "/H\u0019\u000e<)B\u0003\u0002}3B\u001a\u001f"
        //   681: astore_1       
        //   682: bipush          24
        //   684: istore_2       
        //   685: aload_0        
        //   686: astore_3       
        //   687: goto            16
        //   690: aload_3        
        //   691: iload           4
        //   693: aload           10
        //   695: aastore        
        //   696: bipush          26
        //   698: istore          4
        //   700: ldc             "\"_\u001d\u001fL U\u001b\u001ec\u0018M\u001d\u000f"
        //   702: astore_1       
        //   703: bipush          25
        //   705: istore_2       
        //   706: aload_0        
        //   707: astore_3       
        //   708: goto            16
        //   711: aload_3        
        //   712: iload           4
        //   714: aload           10
        //   716: aastore        
        //   717: bipush          27
        //   719: istore          4
        //   721: ldc             "/H\u0019\u000e<#B\u0007\u001fa(^"
        //   723: astore_1       
        //   724: bipush          26
        //   726: istore_2       
        //   727: aload_0        
        //   728: astore_3       
        //   729: goto            16
        //   732: aload_3        
        //   733: iload           4
        //   735: aload           10
        //   737: aastore        
        //   738: aload_0        
        //   739: putstatic       com/whatsapp/HomeActivity.F:[Ljava/lang/String;
        //   742: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   745: istore          12
        //   747: iload           12
        //   749: bipush          21
        //   751: if_icmplt       882
        //   754: sipush          250
        //   757: istore          13
        //   759: iload           13
        //   761: putstatic       com/whatsapp/HomeActivity.D:I
        //   764: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   767: istore          15
        //   769: iload           15
        //   771: bipush          21
        //   773: if_icmplt       895
        //   776: sipush          250
        //   779: istore          16
        //   781: iload           16
        //   783: putstatic       com/whatsapp/HomeActivity.o:I
        //   786: return         
        //   787: aload           5
        //   789: iload           7
        //   791: caload         
        //   792: istore          8
        //   794: iload           7
        //   796: iconst_5       
        //   797: irem           
        //   798: tableswitch {
        //                0: 849
        //                1: 856
        //                2: 863
        //                3: 870
        //          default: 828
        //        }
        //   828: bipush          19
        //   830: istore          9
        //   832: aload           5
        //   834: iload           7
        //   836: iload           9
        //   838: iload           8
        //   840: ixor           
        //   841: i2c            
        //   842: castore        
        //   843: iinc            7, 1
        //   846: goto            30
        //   849: bipush          71
        //   851: istore          9
        //   853: goto            832
        //   856: bipush          39
        //   858: istore          9
        //   860: goto            832
        //   863: bipush          116
        //   865: istore          9
        //   867: goto            832
        //   870: bipush          107
        //   872: istore          9
        //   874: goto            832
        //   877: astore          11
        //   879: aload           11
        //   881: athrow         
        //   882: sipush          220
        //   885: istore          13
        //   887: goto            759
        //   890: astore          14
        //   892: aload           14
        //   894: athrow         
        //   895: sipush          220
        //   898: istore          16
        //   900: goto            781
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  742    747    877    882    Ljava/lang/IllegalArgumentException;
        //  759    769    890    895    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0759:
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
    
    public HomeActivity() {
        this.v = new ru(this);
        this.w = new a_n(this);
        this.x = (InputMethodManager)App.aq.getSystemService(HomeActivity.F[6]);
    }
    
    static int a(final HomeActivity homeActivity, final int b) {
        return homeActivity.B = b;
    }
    
    public static View a(final View p0, final Fragment p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: invokevirtual   android/support/v4/app/Fragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //     4: astore_2       
        //     5: aload_2        
        //     6: instanceof      Lcom/whatsapp/observablescrollview/a;
        //     9: ifeq            109
        //    12: aload_0        
        //    13: ldc             16908298
        //    15: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    18: checkcast       Lcom/whatsapp/observablescrollview/ObservableListView;
        //    21: astore_3       
        //    22: aload_3        
        //    23: new             Lcom/whatsapp/HomeActivity$15;
        //    26: dup            
        //    27: aload_2        
        //    28: invokespecial   com/whatsapp/HomeActivity$15.<init>:(Landroid/content/Context;)V
        //    31: aconst_null    
        //    32: iconst_0       
        //    33: invokevirtual   com/whatsapp/observablescrollview/ObservableListView.addHeaderView:(Landroid/view/View;Ljava/lang/Object;Z)V
        //    36: aload_1        
        //    37: invokevirtual   android/support/v4/app/Fragment.getArguments:()Landroid/os/Bundle;
        //    40: astore          4
        //    42: aload           4
        //    44: ifnull          101
        //    47: aload           4
        //    49: getstatic       com/whatsapp/HomeActivity.F:[Ljava/lang/String;
        //    52: bipush          9
        //    54: aaload         
        //    55: invokevirtual   android/os/Bundle.containsKey:(Ljava/lang/String;)Z
        //    58: istore          6
        //    60: iload           6
        //    62: ifeq            101
        //    65: aload           4
        //    67: getstatic       com/whatsapp/HomeActivity.F:[Ljava/lang/String;
        //    70: bipush          10
        //    72: aaload         
        //    73: iconst_0       
        //    74: invokevirtual   android/os/Bundle.getInt:(Ljava/lang/String;I)I
        //    77: istore          7
        //    79: iload           7
        //    81: ifeq            101
        //    84: aload_0        
        //    85: invokevirtual   android/view/View.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
        //    88: new             Lcom/whatsapp/lp;
        //    91: dup            
        //    92: aload_3        
        //    93: iload           7
        //    95: invokespecial   com/whatsapp/lp.<init>:(Lcom/whatsapp/observablescrollview/ObservableListView;I)V
        //    98: invokevirtual   android/view/ViewTreeObserver.addOnGlobalLayoutListener:(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
        //   101: aload_3        
        //   102: aload_2        
        //   103: checkcast       Lcom/whatsapp/observablescrollview/a;
        //   106: invokevirtual   com/whatsapp/observablescrollview/ObservableListView.setScrollViewCallbacks:(Lcom/whatsapp/observablescrollview/a;)V
        //   109: aload_0        
        //   110: areturn        
        //   111: astore          5
        //   113: aload           5
        //   115: athrow         
        //   116: astore          8
        //   118: aload           8
        //   120: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  47     60     111    116    Ljava/lang/IllegalArgumentException;
        //  84     101    116    121    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0101:
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
    
    private ga a(final int n) {
        final boolean i = App.I;
        final List fragments = this.getSupportFragmentManager().getFragments();
        if (fragments != null) {
            for (final Fragment fragment : fragments) {
                if (n == 1) {
                    try {
                        if (fragment instanceof ConversationsFragment) {
                            return (ga)fragment;
                        }
                    }
                    catch (IllegalArgumentException ex) {
                        throw ex;
                    }
                }
                if (n == 0) {
                    try {
                        if (fragment instanceof CallsFragment) {
                            return (ga)fragment;
                        }
                    }
                    catch (IllegalArgumentException ex2) {
                        throw ex2;
                    }
                }
                if (n == 2) {
                    try {
                        if (fragment instanceof ContactsFragment) {
                            return (ga)fragment;
                        }
                    }
                    catch (IllegalArgumentException ex3) {
                        throw ex3;
                    }
                }
                if (i) {
                    break;
                }
            }
        }
        return null;
    }
    
    static void a(final HomeActivity homeActivity, final boolean b) {
        homeActivity.c(b);
    }
    
    static boolean a(final HomeActivity homeActivity) {
        return homeActivity.c();
    }
    
    static ga b(final HomeActivity homeActivity, final int n) {
        return homeActivity.a(n);
    }
    
    private void b(final DialogFragment dialogFragment) {
        App.ac = true;
        App.aq.aZ();
        this.c(dialogFragment);
    }
    
    static void b(final HomeActivity homeActivity) {
        homeActivity.h();
    }
    
    static void b(final HomeActivity homeActivity, final boolean b) {
        homeActivity.d(b);
    }
    
    private void b(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_2       
        //     2: getstatic       com/whatsapp/App.I:Z
        //     5: istore_3       
        //     6: aload_0        
        //     7: getfield        com/whatsapp/HomeActivity.t:Landroid/support/v7/widget/Toolbar;
        //    10: invokevirtual   android/support/v7/widget/Toolbar.getHeight:()I
        //    13: istore          4
        //    15: aload_0        
        //    16: getfield        com/whatsapp/HomeActivity.r:Lcom/whatsapp/vg;
        //    19: astore          6
        //    21: iload_1        
        //    22: ifeq            172
        //    25: iconst_0       
        //    26: istore          7
        //    28: aload           6
        //    30: iload           7
        //    32: invokevirtual   com/whatsapp/vg.b:(I)V
        //    35: iload_2        
        //    36: aload_0        
        //    37: getfield        com/whatsapp/HomeActivity.r:Lcom/whatsapp/vg;
        //    40: invokevirtual   com/whatsapp/vg.getCount:()I
        //    43: if_icmpge       166
        //    46: aload_0        
        //    47: getfield        com/whatsapp/HomeActivity.m:Lcom/whatsapp/HomeActivity$TabsPager;
        //    50: invokevirtual   com/whatsapp/HomeActivity$TabsPager.getCurrentItem:()I
        //    53: istore          9
        //    55: iload_2        
        //    56: iload           9
        //    58: if_icmpne       65
        //    61: iload_3        
        //    62: ifeq            159
        //    65: aload_0        
        //    66: iload_2        
        //    67: invokespecial   com/whatsapp/HomeActivity.a:(I)Lcom/whatsapp/ga;
        //    70: checkcast       Landroid/support/v4/app/Fragment;
        //    73: astore          10
        //    75: aload           10
        //    77: ifnonnull       84
        //    80: iload_3        
        //    81: ifeq            159
        //    84: aload           10
        //    86: invokevirtual   android/support/v4/app/Fragment.getView:()Landroid/view/View;
        //    89: astore          11
        //    91: aload           11
        //    93: ifnonnull       100
        //    96: iload_3        
        //    97: ifeq            159
        //   100: aload           11
        //   102: ldc             16908298
        //   104: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   107: checkcast       Lcom/whatsapp/observablescrollview/ObservableListView;
        //   110: astore          12
        //   112: aload           12
        //   114: ifnull          159
        //   117: iload_1        
        //   118: ifeq            143
        //   121: aload           12
        //   123: invokevirtual   com/whatsapp/observablescrollview/ObservableListView.c:()I
        //   126: istore          16
        //   128: iload           16
        //   130: ifle            159
        //   133: aload           12
        //   135: iconst_0       
        //   136: invokevirtual   com/whatsapp/observablescrollview/ObservableListView.setSelection:(I)V
        //   139: iload_3        
        //   140: ifeq            159
        //   143: aload           12
        //   145: invokevirtual   com/whatsapp/observablescrollview/ObservableListView.c:()I
        //   148: iload           4
        //   150: if_icmpge       159
        //   153: aload           12
        //   155: iconst_1       
        //   156: invokevirtual   com/whatsapp/observablescrollview/ObservableListView.setSelection:(I)V
        //   159: iinc            2, 1
        //   162: iload_3        
        //   163: ifeq            35
        //   166: return         
        //   167: astore          5
        //   169: aload           5
        //   171: athrow         
        //   172: iload           4
        //   174: istore          7
        //   176: goto            28
        //   179: astore          8
        //   181: aload           8
        //   183: athrow         
        //   184: astore          14
        //   186: aload           14
        //   188: athrow         
        //   189: astore          15
        //   191: aload           15
        //   193: athrow         
        //   194: astore          13
        //   196: aload           13
        //   198: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  15     21     167    172    Ljava/lang/IllegalArgumentException;
        //  46     55     179    184    Ljava/lang/IllegalArgumentException;
        //  121    128    184    189    Ljava/lang/IllegalArgumentException;
        //  133    139    189    194    Ljava/lang/IllegalArgumentException;
        //  143    159    194    199    Ljava/lang/IllegalArgumentException;
        //  186    189    189    194    Ljava/lang/IllegalArgumentException;
        //  191    194    194    199    Ljava/lang/IllegalArgumentException;
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
    
    static Toolbar c(final HomeActivity homeActivity) {
        return homeActivity.t;
    }
    
    private void c(final DialogFragment dialogFragment) {
        try {
            if (this.getSupportFragmentManager().findFragmentByTag(dialogFragment.getClass().getName()) == null) {
                dialogFragment.show(this.getSupportFragmentManager(), dialogFragment.getClass().getName());
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    private void c(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: invokespecial   com/whatsapp/HomeActivity.n:()Z
        //     8: ifeq            356
        //    11: aload_0        
        //    12: getfield        com/whatsapp/HomeActivity.p:Landroid/view/View;
        //    15: iconst_0       
        //    16: invokevirtual   android/view/View.setVisibility:(I)V
        //    19: aload_0        
        //    20: getfield        com/whatsapp/HomeActivity.A:Landroid/support/v7/widget/SearchView;
        //    23: ldc_w           ""
        //    26: iconst_0       
        //    27: invokevirtual   android/support/v7/widget/SearchView.setQuery:(Ljava/lang/CharSequence;Z)V
        //    30: aload_0        
        //    31: ldc_w           2131755613
        //    34: invokevirtual   com/whatsapp/HomeActivity.findViewById:(I)Landroid/view/View;
        //    37: astore_3       
        //    38: aload_3        
        //    39: iconst_0       
        //    40: aload_0        
        //    41: invokevirtual   com/whatsapp/HomeActivity.getResources:()Landroid/content/res/Resources;
        //    44: ldc_w           2131361956
        //    47: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //    50: iconst_0       
        //    51: iconst_0       
        //    52: invokevirtual   android/view/View.setPadding:(IIII)V
        //    55: iload_1        
        //    56: ifeq            315
        //    59: new             Landroid/view/animation/TranslateAnimation;
        //    62: dup            
        //    63: fconst_0       
        //    64: fconst_0       
        //    65: aload_0        
        //    66: invokevirtual   com/whatsapp/HomeActivity.getResources:()Landroid/content/res/Resources;
        //    69: ldc_w           2131361956
        //    72: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //    75: ineg           
        //    76: i2f            
        //    77: fconst_0       
        //    78: invokespecial   android/view/animation/TranslateAnimation.<init>:(FFFF)V
        //    81: astore          4
        //    83: aload           4
        //    85: getstatic       com/whatsapp/HomeActivity.o:I
        //    88: i2l            
        //    89: invokevirtual   android/view/animation/Animation.setDuration:(J)V
        //    92: aload_0        
        //    93: getfield        com/whatsapp/HomeActivity.p:Landroid/view/View;
        //    96: aload           4
        //    98: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //   101: aload_3        
        //   102: aload           4
        //   104: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //   107: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   110: bipush          21
        //   112: if_icmplt       224
        //   115: aload_0        
        //   116: getfield        com/whatsapp/HomeActivity.y:Landroid/view/View;
        //   119: invokevirtual   android/view/View.getWidth:()I
        //   122: aload_0        
        //   123: invokevirtual   com/whatsapp/HomeActivity.getResources:()Landroid/content/res/Resources;
        //   126: ldc_w           2131361823
        //   129: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   132: isub           
        //   133: iconst_3       
        //   134: aload_0        
        //   135: invokevirtual   com/whatsapp/HomeActivity.getResources:()Landroid/content/res/Resources;
        //   138: ldc_w           2131361822
        //   141: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   144: imul           
        //   145: iconst_2       
        //   146: idiv           
        //   147: isub           
        //   148: istore          10
        //   150: aload_0        
        //   151: getfield        com/whatsapp/HomeActivity.y:Landroid/view/View;
        //   154: astore          12
        //   156: invokestatic    com/whatsapp/App.ak:()Z
        //   159: istore          13
        //   161: iload           13
        //   163: ifeq            362
        //   166: iload           10
        //   168: istore          14
        //   170: aload           12
        //   172: iload           14
        //   174: aload_0        
        //   175: getfield        com/whatsapp/HomeActivity.y:Landroid/view/View;
        //   178: invokevirtual   android/view/View.getHeight:()I
        //   181: iconst_2       
        //   182: idiv           
        //   183: iload           10
        //   185: i2f            
        //   186: fconst_0       
        //   187: invokestatic    android/view/ViewAnimationUtils.createCircularReveal:(Landroid/view/View;IIFF)Landroid/animation/Animator;
        //   190: astore          15
        //   192: aload           15
        //   194: getstatic       com/whatsapp/HomeActivity.o:I
        //   197: i2l            
        //   198: invokevirtual   android/animation/Animator.setDuration:(J)Landroid/animation/Animator;
        //   201: pop            
        //   202: aload           15
        //   204: new             Lcom/whatsapp/aao;
        //   207: dup            
        //   208: aload_0        
        //   209: invokespecial   com/whatsapp/aao.<init>:(Lcom/whatsapp/HomeActivity;)V
        //   212: invokevirtual   android/animation/Animator.addListener:(Landroid/animation/Animator$AnimatorListener;)V
        //   215: aload           15
        //   217: invokevirtual   android/animation/Animator.start:()V
        //   220: iload_2        
        //   221: ifeq            311
        //   224: new             Landroid/view/animation/AlphaAnimation;
        //   227: dup            
        //   228: fconst_1       
        //   229: fconst_0       
        //   230: invokespecial   android/view/animation/AlphaAnimation.<init>:(FF)V
        //   233: astore          5
        //   235: new             Landroid/view/animation/TranslateAnimation;
        //   238: dup            
        //   239: fconst_0       
        //   240: fconst_0       
        //   241: fconst_0       
        //   242: aload_0        
        //   243: getfield        com/whatsapp/HomeActivity.y:Landroid/view/View;
        //   246: invokevirtual   android/view/View.getHeight:()I
        //   249: ineg           
        //   250: i2f            
        //   251: invokespecial   android/view/animation/TranslateAnimation.<init>:(FFFF)V
        //   254: astore          6
        //   256: new             Landroid/view/animation/AnimationSet;
        //   259: dup            
        //   260: iconst_1       
        //   261: invokespecial   android/view/animation/AnimationSet.<init>:(Z)V
        //   264: astore          7
        //   266: aload           7
        //   268: aload           5
        //   270: invokevirtual   android/view/animation/AnimationSet.addAnimation:(Landroid/view/animation/Animation;)V
        //   273: aload           7
        //   275: aload           6
        //   277: invokevirtual   android/view/animation/AnimationSet.addAnimation:(Landroid/view/animation/Animation;)V
        //   280: aload           7
        //   282: getstatic       com/whatsapp/HomeActivity.o:I
        //   285: i2l            
        //   286: invokevirtual   android/view/animation/AnimationSet.setDuration:(J)V
        //   289: aload           7
        //   291: new             Lcom/whatsapp/rb;
        //   294: dup            
        //   295: aload_0        
        //   296: invokespecial   com/whatsapp/rb.<init>:(Lcom/whatsapp/HomeActivity;)V
        //   299: invokevirtual   android/view/animation/AnimationSet.setAnimationListener:(Landroid/view/animation/Animation$AnimationListener;)V
        //   302: aload_0        
        //   303: getfield        com/whatsapp/HomeActivity.y:Landroid/view/View;
        //   306: aload           7
        //   308: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //   311: iload_2        
        //   312: ifeq            331
        //   315: aload_0        
        //   316: getfield        com/whatsapp/HomeActivity.A:Landroid/support/v7/widget/SearchView;
        //   319: iconst_1       
        //   320: invokevirtual   android/support/v7/widget/SearchView.setIconified:(Z)V
        //   323: aload_0        
        //   324: getfield        com/whatsapp/HomeActivity.y:Landroid/view/View;
        //   327: iconst_4       
        //   328: invokevirtual   android/view/View.setVisibility:(I)V
        //   331: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   334: bipush          21
        //   336: if_icmplt       356
        //   339: aload_0        
        //   340: invokevirtual   com/whatsapp/HomeActivity.getWindow:()Landroid/view/Window;
        //   343: aload_0        
        //   344: invokevirtual   com/whatsapp/HomeActivity.getResources:()Landroid/content/res/Resources;
        //   347: ldc_w           2131624026
        //   350: invokevirtual   android/content/res/Resources.getColor:(I)I
        //   353: invokevirtual   android/view/Window.setStatusBarColor:(I)V
        //   356: return         
        //   357: astore          11
        //   359: aload           11
        //   361: athrow         
        //   362: aload_0        
        //   363: getfield        com/whatsapp/HomeActivity.y:Landroid/view/View;
        //   366: invokevirtual   android/view/View.getWidth:()I
        //   369: iload           10
        //   371: isub           
        //   372: istore          14
        //   374: goto            170
        //   377: astore          9
        //   379: aload           9
        //   381: athrow         
        //   382: astore          8
        //   384: aload           8
        //   386: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  150    161    357    362    Ljava/lang/IllegalArgumentException;
        //  315    331    377    382    Ljava/lang/IllegalArgumentException;
        //  331    356    382    387    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 190, Size: 190
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
    
    private boolean c() {
        try {
            if (this.l == 0) {
                return true;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return false;
    }
    
    static ObservableListView d(final HomeActivity homeActivity) {
        return homeActivity.j();
    }
    
    private void d(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iload_1        
        //     1: ifne            22
        //     4: aload_0        
        //     5: invokevirtual   com/whatsapp/HomeActivity.isFinishing:()Z
        //     8: ifne            16
        //    11: aload_0        
        //    12: iconst_0       
        //    13: invokevirtual   com/whatsapp/HomeActivity.showDialog:(I)V
        //    16: return         
        //    17: astore          9
        //    19: aload           9
        //    21: athrow         
        //    22: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    25: invokevirtual   com/whatsapp/wc.e:()Lcom/whatsapp/a_d;
        //    28: invokevirtual   com/whatsapp/a_d.y:()Ljava/io/File;
        //    31: invokevirtual   java/io/File.exists:()Z
        //    34: istore          6
        //    36: iload           6
        //    38: ifne            16
        //    41: getstatic       com/whatsapp/App.a6:I
        //    44: istore          7
        //    46: iload           7
        //    48: ifeq            16
        //    51: getstatic       com/whatsapp/ProfilePhotoReminder.l:Z
        //    54: istore          8
        //    56: iload           8
        //    58: ifne            16
        //    61: invokestatic    com/whatsapp/App.O:()Z
        //    64: ifeq            16
        //    67: iconst_1       
        //    68: putstatic       com/whatsapp/ProfilePhotoReminder.l:Z
        //    71: aload_0        
        //    72: new             Landroid/content/Intent;
        //    75: dup            
        //    76: aload_0        
        //    77: ldc_w           Lcom/whatsapp/ProfilePhotoReminder;.class
        //    80: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //    83: invokevirtual   com/whatsapp/HomeActivity.startActivity:(Landroid/content/Intent;)V
        //    86: return         
        //    87: astore          5
        //    89: aload           5
        //    91: athrow         
        //    92: astore_2       
        //    93: aload_2        
        //    94: athrow         
        //    95: astore_3       
        //    96: aload_3        
        //    97: athrow         
        //    98: astore          4
        //   100: aload           4
        //   102: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      16     17     22     Ljava/lang/IllegalArgumentException;
        //  22     36     92     95     Ljava/lang/IllegalArgumentException;
        //  41     46     95     98     Ljava/lang/IllegalArgumentException;
        //  51     56     98     103    Ljava/lang/IllegalArgumentException;
        //  61     86     87     92     Ljava/lang/IllegalArgumentException;
        //  93     95     95     98     Ljava/lang/IllegalArgumentException;
        //  96     98     98     103    Ljava/lang/IllegalArgumentException;
        //  100    103    87     92     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 51, Size: 51
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
    
    private void e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/HomeActivity.l:I
        //     4: istore_3       
        //     5: iload_3        
        //     6: ifeq            113
        //     9: aload_0        
        //    10: getfield        com/whatsapp/HomeActivity.p:Landroid/view/View;
        //    13: invokevirtual   android/view/View.clearAnimation:()V
        //    16: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    19: bipush          11
        //    21: if_icmplt       63
        //    24: aload_0        
        //    25: getfield        com/whatsapp/HomeActivity.p:Landroid/view/View;
        //    28: getstatic       com/whatsapp/HomeActivity.F:[Ljava/lang/String;
        //    31: bipush          22
        //    33: aaload         
        //    34: iconst_1       
        //    35: newarray        F
        //    37: dup            
        //    38: iconst_0       
        //    39: fconst_0       
        //    40: fastore        
        //    41: invokestatic    android/animation/ObjectAnimator.ofFloat:(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;
        //    44: ldc2_w          250
        //    47: invokevirtual   android/animation/ObjectAnimator.setDuration:(J)Landroid/animation/ObjectAnimator;
        //    50: invokevirtual   android/animation/ObjectAnimator.start:()V
        //    53: getstatic       com/whatsapp/App.I:Z
        //    56: istore          5
        //    58: iload           5
        //    60: ifeq            108
        //    63: aload_0        
        //    64: getfield        com/whatsapp/HomeActivity.p:Landroid/view/View;
        //    67: iconst_0       
        //    68: iconst_0       
        //    69: iconst_0       
        //    70: iconst_0       
        //    71: invokevirtual   android/view/View.setPadding:(IIII)V
        //    74: new             Landroid/view/animation/TranslateAnimation;
        //    77: dup            
        //    78: fconst_0       
        //    79: fconst_0       
        //    80: aload_0        
        //    81: getfield        com/whatsapp/HomeActivity.l:I
        //    84: i2f            
        //    85: fconst_0       
        //    86: invokespecial   android/view/animation/TranslateAnimation.<init>:(FFFF)V
        //    89: astore          4
        //    91: aload           4
        //    93: ldc2_w          250
        //    96: invokevirtual   android/view/animation/TranslateAnimation.setDuration:(J)V
        //    99: aload_0        
        //   100: getfield        com/whatsapp/HomeActivity.p:Landroid/view/View;
        //   103: aload           4
        //   105: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //   108: aload_0        
        //   109: iconst_0       
        //   110: putfield        com/whatsapp/HomeActivity.l:I
        //   113: aload_0        
        //   114: iconst_1       
        //   115: invokespecial   com/whatsapp/HomeActivity.b:(Z)V
        //   118: return         
        //   119: astore_1       
        //   120: aload_1        
        //   121: athrow         
        //   122: astore_2       
        //   123: aload_2        
        //   124: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      5      119    122    Ljava/lang/IllegalArgumentException;
        //  9      58     122    125    Ljava/lang/IllegalArgumentException;
        //  120    122    122    125    Ljava/lang/IllegalArgumentException;
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
    
    static void e(final HomeActivity homeActivity) {
        homeActivity.l();
    }
    
    static View f(final HomeActivity homeActivity) {
        return homeActivity.y;
    }
    
    private void f() {
        this.k.setVisibility(0);
        this.C.setText((CharSequence)"");
    }
    
    static SearchView g(final HomeActivity homeActivity) {
        return homeActivity.A;
    }
    
    private void g() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/HomeActivity.t:Landroid/support/v7/widget/Toolbar;
        //     4: invokevirtual   android/support/v7/widget/Toolbar.getHeight:()I
        //     7: istore_1       
        //     8: aload_0        
        //     9: getfield        com/whatsapp/HomeActivity.l:I
        //    12: istore          4
        //    14: iload           4
        //    16: iload_1        
        //    17: ineg           
        //    18: if_icmpeq       138
        //    21: aload_0        
        //    22: getfield        com/whatsapp/HomeActivity.p:Landroid/view/View;
        //    25: invokevirtual   android/view/View.clearAnimation:()V
        //    28: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    31: bipush          11
        //    33: if_icmplt       90
        //    36: aload_0        
        //    37: getfield        com/whatsapp/HomeActivity.p:Landroid/view/View;
        //    40: astore          6
        //    42: getstatic       com/whatsapp/HomeActivity.F:[Ljava/lang/String;
        //    45: bipush          12
        //    47: aaload         
        //    48: astore          7
        //    50: iconst_1       
        //    51: newarray        F
        //    53: astore          8
        //    55: aload           8
        //    57: iconst_0       
        //    58: iload_1        
        //    59: ineg           
        //    60: i2f            
        //    61: fastore        
        //    62: aload           6
        //    64: aload           7
        //    66: aload           8
        //    68: invokestatic    android/animation/ObjectAnimator.ofFloat:(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;
        //    71: ldc2_w          250
        //    74: invokevirtual   android/animation/ObjectAnimator.setDuration:(J)Landroid/animation/ObjectAnimator;
        //    77: invokevirtual   android/animation/ObjectAnimator.start:()V
        //    80: getstatic       com/whatsapp/App.I:Z
        //    83: istore          9
        //    85: iload           9
        //    87: ifeq            132
        //    90: aload_0        
        //    91: getfield        com/whatsapp/HomeActivity.p:Landroid/view/View;
        //    94: iconst_0       
        //    95: iload_1        
        //    96: ineg           
        //    97: iconst_0       
        //    98: iconst_0       
        //    99: invokevirtual   android/view/View.setPadding:(IIII)V
        //   102: new             Landroid/view/animation/TranslateAnimation;
        //   105: dup            
        //   106: fconst_0       
        //   107: fconst_0       
        //   108: fconst_0       
        //   109: fconst_0       
        //   110: invokespecial   android/view/animation/TranslateAnimation.<init>:(FFFF)V
        //   113: astore          5
        //   115: aload           5
        //   117: ldc2_w          250
        //   120: invokevirtual   android/view/animation/TranslateAnimation.setDuration:(J)V
        //   123: aload_0        
        //   124: getfield        com/whatsapp/HomeActivity.p:Landroid/view/View;
        //   127: aload           5
        //   129: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //   132: aload_0        
        //   133: iload_1        
        //   134: ineg           
        //   135: putfield        com/whatsapp/HomeActivity.l:I
        //   138: aload_0        
        //   139: iconst_0       
        //   140: invokespecial   com/whatsapp/HomeActivity.b:(Z)V
        //   143: return         
        //   144: astore_2       
        //   145: aload_2        
        //   146: athrow         
        //   147: astore_3       
        //   148: aload_3        
        //   149: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  8      14     144    147    Ljava/lang/IllegalArgumentException;
        //  21     85     147    150    Ljava/lang/IllegalArgumentException;
        //  145    147    147    150    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0090:
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
    
    static int h(final HomeActivity homeActivity) {
        return homeActivity.B;
    }
    
    private void h() {
        aqu.i();
        a8s.a(new t(this, null), new Void[0]);
    }
    
    private void i() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   com/whatsapp/HomeActivity.n:()Z
        //     4: istore_3       
        //     5: iload_3        
        //     6: ifne            338
        //     9: aload_0        
        //    10: getfield        com/whatsapp/HomeActivity.p:Landroid/view/View;
        //    13: bipush          8
        //    15: invokevirtual   android/view/View.setVisibility:(I)V
        //    18: aload_0        
        //    19: getfield        com/whatsapp/HomeActivity.y:Landroid/view/View;
        //    22: iconst_0       
        //    23: invokevirtual   android/view/View.setVisibility:(I)V
        //    26: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    29: bipush          21
        //    31: if_icmplt       146
        //    34: aload_0        
        //    35: getfield        com/whatsapp/HomeActivity.y:Landroid/view/View;
        //    38: invokevirtual   android/view/View.isAttachedToWindow:()Z
        //    41: istore          9
        //    43: iload           9
        //    45: ifeq            192
        //    48: aload_0        
        //    49: getfield        com/whatsapp/HomeActivity.y:Landroid/view/View;
        //    52: invokevirtual   android/view/View.getWidth:()I
        //    55: aload_0        
        //    56: invokevirtual   com/whatsapp/HomeActivity.getResources:()Landroid/content/res/Resources;
        //    59: ldc_w           2131361823
        //    62: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //    65: isub           
        //    66: iconst_3       
        //    67: aload_0        
        //    68: invokevirtual   com/whatsapp/HomeActivity.getResources:()Landroid/content/res/Resources;
        //    71: ldc_w           2131361822
        //    74: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //    77: imul           
        //    78: iconst_2       
        //    79: idiv           
        //    80: isub           
        //    81: istore          10
        //    83: aload_0        
        //    84: getfield        com/whatsapp/HomeActivity.y:Landroid/view/View;
        //    87: astore          12
        //    89: invokestatic    com/whatsapp/App.ak:()Z
        //    92: istore          13
        //    94: iload           13
        //    96: ifeq            350
        //    99: iload           10
        //   101: istore          14
        //   103: aload           12
        //   105: iload           14
        //   107: aload_0        
        //   108: getfield        com/whatsapp/HomeActivity.y:Landroid/view/View;
        //   111: invokevirtual   android/view/View.getHeight:()I
        //   114: iconst_2       
        //   115: idiv           
        //   116: fconst_0       
        //   117: iload           10
        //   119: i2f            
        //   120: invokestatic    android/view/ViewAnimationUtils.createCircularReveal:(Landroid/view/View;IIFF)Landroid/animation/Animator;
        //   123: astore          15
        //   125: aload           15
        //   127: getstatic       com/whatsapp/HomeActivity.D:I
        //   130: i2l            
        //   131: invokevirtual   android/animation/Animator.setDuration:(J)Landroid/animation/Animator;
        //   134: pop            
        //   135: aload           15
        //   137: invokevirtual   android/animation/Animator.start:()V
        //   140: getstatic       com/whatsapp/App.I:Z
        //   143: ifeq            192
        //   146: new             Landroid/view/animation/TranslateAnimation;
        //   149: dup            
        //   150: fconst_0       
        //   151: fconst_0       
        //   152: aload_0        
        //   153: getfield        com/whatsapp/HomeActivity.y:Landroid/view/View;
        //   156: invokevirtual   android/view/View.getHeight:()I
        //   159: ineg           
        //   160: i2f            
        //   161: fconst_0       
        //   162: invokespecial   android/view/animation/TranslateAnimation.<init>:(FFFF)V
        //   165: astore          4
        //   167: aload           4
        //   169: getstatic       com/whatsapp/HomeActivity.D:I
        //   172: i2l            
        //   173: invokevirtual   android/view/animation/Animation.setDuration:(J)V
        //   176: aload_0        
        //   177: getfield        com/whatsapp/HomeActivity.y:Landroid/view/View;
        //   180: invokevirtual   android/view/View.clearAnimation:()V
        //   183: aload_0        
        //   184: getfield        com/whatsapp/HomeActivity.y:Landroid/view/View;
        //   187: aload           4
        //   189: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //   192: new             Landroid/view/animation/TranslateAnimation;
        //   195: dup            
        //   196: fconst_0       
        //   197: fconst_0       
        //   198: fconst_0       
        //   199: aload_0        
        //   200: invokevirtual   com/whatsapp/HomeActivity.getResources:()Landroid/content/res/Resources;
        //   203: ldc_w           2131361956
        //   206: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   209: ineg           
        //   210: i2f            
        //   211: invokespecial   android/view/animation/TranslateAnimation.<init>:(FFFF)V
        //   214: astore          5
        //   216: aload           5
        //   218: getstatic       com/whatsapp/HomeActivity.D:I
        //   221: i2l            
        //   222: invokevirtual   android/view/animation/Animation.setDuration:(J)V
        //   225: aload_0        
        //   226: getfield        com/whatsapp/HomeActivity.p:Landroid/view/View;
        //   229: aload           5
        //   231: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //   234: aload_0        
        //   235: ldc_w           2131755613
        //   238: invokevirtual   com/whatsapp/HomeActivity.findViewById:(I)Landroid/view/View;
        //   241: astore          6
        //   243: aload           6
        //   245: iconst_0       
        //   246: iconst_0       
        //   247: iconst_0       
        //   248: iconst_0       
        //   249: invokevirtual   android/view/View.setPadding:(IIII)V
        //   252: aload           6
        //   254: invokevirtual   android/view/View.clearAnimation:()V
        //   257: new             Landroid/view/animation/TranslateAnimation;
        //   260: dup            
        //   261: fconst_0       
        //   262: fconst_0       
        //   263: aload_0        
        //   264: invokevirtual   com/whatsapp/HomeActivity.getResources:()Landroid/content/res/Resources;
        //   267: ldc_w           2131361956
        //   270: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   273: i2f            
        //   274: fconst_0       
        //   275: invokespecial   android/view/animation/TranslateAnimation.<init>:(FFFF)V
        //   278: astore          7
        //   280: aload           7
        //   282: iconst_4       
        //   283: getstatic       com/whatsapp/HomeActivity.D:I
        //   286: imul           
        //   287: iconst_3       
        //   288: idiv           
        //   289: i2l            
        //   290: invokevirtual   android/view/animation/Animation.setDuration:(J)V
        //   293: aload           7
        //   295: new             Lcom/whatsapp/dz;
        //   298: dup            
        //   299: aload_0        
        //   300: invokespecial   com/whatsapp/dz.<init>:(Lcom/whatsapp/HomeActivity;)V
        //   303: invokevirtual   android/view/animation/Animation.setAnimationListener:(Landroid/view/animation/Animation$AnimationListener;)V
        //   306: aload           6
        //   308: aload           7
        //   310: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //   313: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   316: bipush          21
        //   318: if_icmplt       338
        //   321: aload_0        
        //   322: invokevirtual   com/whatsapp/HomeActivity.getWindow:()Landroid/view/Window;
        //   325: aload_0        
        //   326: invokevirtual   com/whatsapp/HomeActivity.getResources:()Landroid/content/res/Resources;
        //   329: ldc_w           2131624011
        //   332: invokevirtual   android/content/res/Resources.getColor:(I)I
        //   335: invokevirtual   android/view/Window.setStatusBarColor:(I)V
        //   338: return         
        //   339: astore_1       
        //   340: aload_1        
        //   341: athrow         
        //   342: astore_2       
        //   343: aload_2        
        //   344: athrow         
        //   345: astore          11
        //   347: aload           11
        //   349: athrow         
        //   350: aload_0        
        //   351: getfield        com/whatsapp/HomeActivity.y:Landroid/view/View;
        //   354: invokevirtual   android/view/View.getWidth:()I
        //   357: iload           10
        //   359: isub           
        //   360: istore          14
        //   362: goto            103
        //   365: astore          8
        //   367: aload           8
        //   369: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      5      339    342    Ljava/lang/IllegalArgumentException;
        //  9      43     342    345    Ljava/lang/IllegalArgumentException;
        //  83     94     345    350    Ljava/lang/IllegalArgumentException;
        //  280    338    365    370    Ljava/lang/IllegalArgumentException;
        //  340    342    342    345    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 185, Size: 185
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
    
    static void i(final HomeActivity homeActivity) {
        homeActivity.m();
    }
    
    private ObservableListView j() {
        final Fragment k = this.k();
        if (k != null) {
            final View view = k.getView();
            if (view != null) {
                try {
                    return (ObservableListView)view.findViewById(16908298);
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
        }
        return null;
    }
    
    static void j(final HomeActivity homeActivity) {
        homeActivity.e();
    }
    
    private Fragment k() {
        return (Fragment)this.a(this.B);
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
        //     6: iload_1        
        //     7: iconst_3       
        //     8: if_icmpge       147
        //    11: aload_0        
        //    12: getfield        com/whatsapp/HomeActivity.r:Lcom/whatsapp/vg;
        //    15: iload_1        
        //    16: invokestatic    com/whatsapp/vg.a:(Lcom/whatsapp/vg;I)Lcom/whatsapp/aoz;
        //    19: astore_3       
        //    20: aload_3        
        //    21: getfield        com/whatsapp/aoz.b:I
        //    24: istore          8
        //    26: iload           8
        //    28: ifle            97
        //    31: aload_3        
        //    32: getfield        com/whatsapp/aoz.a:Landroid/widget/TextView;
        //    35: iconst_0       
        //    36: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //    39: aload_3        
        //    40: getfield        com/whatsapp/aoz.a:Landroid/widget/TextView;
        //    43: invokestatic    java/text/NumberFormat.getInstance:()Ljava/text/NumberFormat;
        //    46: aload_3        
        //    47: getfield        com/whatsapp/aoz.b:I
        //    50: i2l            
        //    51: invokevirtual   java/text/NumberFormat.format:(J)Ljava/lang/String;
        //    54: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    57: aload_0        
        //    58: getfield        com/whatsapp/HomeActivity.B:I
        //    61: istore          12
        //    63: iload_1        
        //    64: iload           12
        //    66: if_icmpne       83
        //    69: aload_3        
        //    70: getfield        com/whatsapp/aoz.a:Landroid/widget/TextView;
        //    73: ldc_w           2130839087
        //    76: invokevirtual   android/widget/TextView.setBackgroundResource:(I)V
        //    79: iload_2        
        //    80: ifeq            106
        //    83: aload_3        
        //    84: getfield        com/whatsapp/aoz.a:Landroid/widget/TextView;
        //    87: ldc_w           2130839088
        //    90: invokevirtual   android/widget/TextView.setBackgroundResource:(I)V
        //    93: iload_2        
        //    94: ifeq            106
        //    97: aload_3        
        //    98: getfield        com/whatsapp/aoz.a:Landroid/widget/TextView;
        //   101: bipush          8
        //   103: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   106: aload_0        
        //   107: getfield        com/whatsapp/HomeActivity.B:I
        //   110: istore          11
        //   112: iload_1        
        //   113: iload           11
        //   115: if_icmpne       130
        //   118: aload_3        
        //   119: getfield        com/whatsapp/aoz.d:Landroid/widget/TextView;
        //   122: iconst_m1      
        //   123: invokevirtual   android/widget/TextView.setTextColor:(I)V
        //   126: iload_2        
        //   127: ifeq            140
        //   130: aload_3        
        //   131: getfield        com/whatsapp/aoz.d:Landroid/widget/TextView;
        //   134: ldc_w           -2130706433
        //   137: invokevirtual   android/widget/TextView.setTextColor:(I)V
        //   140: iinc            1, 1
        //   143: iload_2        
        //   144: ifeq            6
        //   147: return         
        //   148: astore          4
        //   150: aload           4
        //   152: athrow         
        //   153: astore          5
        //   155: aload           5
        //   157: athrow         
        //   158: astore          6
        //   160: aload           6
        //   162: athrow         
        //   163: astore          7
        //   165: aload           7
        //   167: athrow         
        //   168: astore          9
        //   170: aload           9
        //   172: athrow         
        //   173: astore          10
        //   175: aload           10
        //   177: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  20     26     148    153    Ljava/lang/IllegalArgumentException;
        //  31     63     153    158    Ljava/lang/IllegalArgumentException;
        //  69     79     158    163    Ljava/lang/IllegalArgumentException;
        //  83     93     163    168    Ljava/lang/IllegalArgumentException;
        //  97     106    163    168    Ljava/lang/IllegalArgumentException;
        //  106    112    168    173    Ljava/lang/IllegalArgumentException;
        //  118    126    173    178    Ljava/lang/IllegalArgumentException;
        //  130    140    173    178    Ljava/lang/IllegalArgumentException;
        //  150    153    153    158    Ljava/lang/IllegalArgumentException;
        //  155    158    158    163    Ljava/lang/IllegalArgumentException;
        //  160    163    163    168    Ljava/lang/IllegalArgumentException;
        //  170    173    173    178    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 89, Size: 89
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
    
    private void m() {
        final boolean i = App.I;
        final Iterator<String> iterator = (Iterator<String>)z8.b().iterator();
        int n = 0;
        while (true) {
            int b = 0;
            Label_0064: {
                if (!iterator.hasNext()) {
                    b = n;
                    break Label_0064;
                }
                while (true) {
                    final a_9 e = App.S.e(iterator.next());
                    while (true) {
                        Label_0113: {
                            try {
                                if (e.l <= 0) {
                                    break Label_0113;
                                }
                                b = n + 1;
                                if (i) {
                                    vg.a(this.r, 1).b = b;
                                    vg.a(this.r, 0).b = com.whatsapp.notification.w.b().d().size();
                                    this.l();
                                    return;
                                }
                            }
                            catch (IllegalArgumentException ex) {
                                throw ex;
                            }
                            break;
                        }
                        b = n;
                        continue;
                    }
                }
            }
            n = b;
        }
    }
    
    private boolean n() {
        try {
            if (this.y.getVisibility() == 0) {
                return true;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return false;
    }
    
    private void o() {
        if (!ChangeNumber.g() && ade.a(this, false) != null) {
            final HomeActivity$ServiceExpirationWarningDialogFragment homeActivity$ServiceExpirationWarningDialogFragment = new HomeActivity$ServiceExpirationWarningDialogFragment();
            homeActivity$ServiceExpirationWarningDialogFragment.setCancelable(false);
            homeActivity$ServiceExpirationWarningDialogFragment.show(this.getSupportFragmentManager(), null);
        }
    }
    
    private void p() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/whatsapp/aqu.c:()Z
        //     3: ifne            43
        //     6: invokestatic    com/whatsapp/aqu.g:()Z
        //     9: istore          5
        //    11: iload           5
        //    13: ifne            43
        //    16: new             Lcom/whatsapp/t;
        //    19: dup            
        //    20: aload_0        
        //    21: aconst_null    
        //    22: invokespecial   com/whatsapp/t.<init>:(Lcom/whatsapp/HomeActivity;Lcom/whatsapp/ru;)V
        //    25: iconst_0       
        //    26: anewarray       Ljava/lang/Void;
        //    29: invokestatic    com/whatsapp/a8s.a:(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;
        //    32: pop            
        //    33: getstatic       com/whatsapp/App.I:Z
        //    36: istore          7
        //    38: iload           7
        //    40: ifeq            50
        //    43: aload_0        
        //    44: invokestatic    com/whatsapp/aqu.h:()Z
        //    47: invokespecial   com/whatsapp/HomeActivity.d:(Z)V
        //    50: return         
        //    51: astore_1       
        //    52: aload_1        
        //    53: athrow         
        //    54: astore_2       
        //    55: aload_2        
        //    56: athrow         
        //    57: astore_3       
        //    58: aload_3        
        //    59: athrow         
        //    60: astore          4
        //    62: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //    65: invokevirtual   java/lang/Thread.interrupt:()V
        //    68: aload_0        
        //    69: iconst_0       
        //    70: invokespecial   com/whatsapp/HomeActivity.d:(Z)V
        //    73: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      11     51     54     Ljava/lang/InterruptedException;
        //  16     38     54     57     Ljava/lang/InterruptedException;
        //  16     38     57     60     Ljava/lang/IllegalArgumentException;
        //  43     50     60     74     Ljava/lang/InterruptedException;
        //  43     50     57     60     Ljava/lang/IllegalArgumentException;
        //  52     54     54     57     Ljava/lang/InterruptedException;
        //  55     57     57     60     Ljava/lang/IllegalArgumentException;
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
    
    @Override
    public void a() {
    }
    
    @Override
    public void a(final b b) {
        while (true) {
            try {
                if (b != this.j()) {
                    return;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            final int n = -this.l;
            final int n2 = this.t.getHeight() / 2;
            int n3 = 0;
            while (true) {
                Label_0104: {
                    if (n > n2) {
                        final ObservableListView j = this.j();
                        if (j == null) {
                            break Label_0104;
                        }
                        final int height = this.t.getHeight();
                        final int c = j.c();
                        n3 = 0;
                        if (c >= height) {
                            break Label_0104;
                        }
                    }
                    Label_0094: {
                        if (n3 == 0) {
                            break Label_0094;
                        }
                        try {
                            this.g();
                            if (App.I) {
                                this.e();
                            }
                            return;
                        }
                        catch (IllegalArgumentException ex2) {
                            throw ex2;
                        }
                    }
                }
                n3 = 1;
                continue;
            }
        }
    }
    
    @Override
    public void a(final b p0, final int p1, final boolean p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          5
        //     5: aload_0        
        //     6: invokespecial   com/whatsapp/HomeActivity.j:()Lcom/whatsapp/observablescrollview/ObservableListView;
        //     9: astore          7
        //    11: aload_1        
        //    12: aload           7
        //    14: if_acmpeq       23
        //    17: return         
        //    18: astore          6
        //    20: aload           6
        //    22: athrow         
        //    23: aload_0        
        //    24: invokespecial   com/whatsapp/HomeActivity.n:()Z
        //    27: ifeq            70
        //    30: aload_0        
        //    31: invokevirtual   com/whatsapp/HomeActivity.getCurrentFocus:()Landroid/view/View;
        //    34: astore          25
        //    36: aload           25
        //    38: ifnull          17
        //    41: iload_3        
        //    42: ifne            17
        //    45: iload           4
        //    47: ifeq            17
        //    50: aload_0        
        //    51: getfield        com/whatsapp/HomeActivity.x:Landroid/view/inputmethod/InputMethodManager;
        //    54: aload           25
        //    56: invokevirtual   android/view/View.getWindowToken:()Landroid/os/IBinder;
        //    59: iconst_2       
        //    60: invokevirtual   android/view/inputmethod/InputMethodManager.hideSoftInputFromWindow:(Landroid/os/IBinder;I)Z
        //    63: pop            
        //    64: return         
        //    65: astore          26
        //    67: aload           26
        //    69: athrow         
        //    70: aload_0        
        //    71: getfield        com/whatsapp/HomeActivity.t:Landroid/support/v7/widget/Toolbar;
        //    74: invokevirtual   android/support/v7/widget/Toolbar.getHeight:()I
        //    77: istore          8
        //    79: aload_0        
        //    80: getfield        com/whatsapp/HomeActivity.z:I
        //    83: istore          10
        //    85: iload           10
        //    87: iload_2        
        //    88: if_icmpge       301
        //    91: iconst_1       
        //    92: istore          11
        //    94: aload_0        
        //    95: iload_2        
        //    96: putfield        com/whatsapp/HomeActivity.z:I
        //    99: iload_3        
        //   100: ifne            116
        //   103: aload_0        
        //   104: getfield        com/whatsapp/HomeActivity.n:Z
        //   107: istore          24
        //   109: iload           24
        //   111: iload           11
        //   113: if_icmpeq       190
        //   116: aload_0        
        //   117: iload           11
        //   119: putfield        com/whatsapp/HomeActivity.n:Z
        //   122: aload_0        
        //   123: iload_2        
        //   124: aload_0        
        //   125: getfield        com/whatsapp/HomeActivity.l:I
        //   128: iadd           
        //   129: putfield        com/whatsapp/HomeActivity.E:I
        //   132: aload_0        
        //   133: getfield        com/whatsapp/HomeActivity.p:Landroid/view/View;
        //   136: invokevirtual   android/view/View.clearAnimation:()V
        //   139: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   142: istore          16
        //   144: iload           16
        //   146: bipush          11
        //   148: if_icmplt       168
        //   151: aload_0        
        //   152: getfield        com/whatsapp/HomeActivity.p:Landroid/view/View;
        //   155: aload_0        
        //   156: getfield        com/whatsapp/HomeActivity.l:I
        //   159: i2f            
        //   160: invokevirtual   android/view/View.setTranslationY:(F)V
        //   163: iload           5
        //   165: ifeq            190
        //   168: aload_0        
        //   169: getfield        com/whatsapp/HomeActivity.p:Landroid/view/View;
        //   172: iconst_0       
        //   173: aload_0        
        //   174: getfield        com/whatsapp/HomeActivity.l:I
        //   177: aload_0        
        //   178: getfield        com/whatsapp/HomeActivity.p:Landroid/view/View;
        //   181: invokevirtual   android/view/View.getTop:()I
        //   184: isub           
        //   185: iconst_0       
        //   186: iconst_0       
        //   187: invokevirtual   android/view/View.setPadding:(IIII)V
        //   190: iload_2        
        //   191: aload_0        
        //   192: getfield        com/whatsapp/HomeActivity.E:I
        //   195: isub           
        //   196: ineg           
        //   197: istore          17
        //   199: iload           8
        //   201: ineg           
        //   202: iload           17
        //   204: iconst_0       
        //   205: invokestatic    java/lang/Math.min:(II)I
        //   208: invokestatic    java/lang/Math.max:(II)I
        //   211: istore          18
        //   213: aload_0        
        //   214: getfield        com/whatsapp/HomeActivity.l:I
        //   217: istore          22
        //   219: iload           18
        //   221: iload           22
        //   223: if_icmpeq       17
        //   226: aload_0        
        //   227: iload           18
        //   229: putfield        com/whatsapp/HomeActivity.l:I
        //   232: aload_0        
        //   233: getfield        com/whatsapp/HomeActivity.p:Landroid/view/View;
        //   236: invokevirtual   android/view/View.clearAnimation:()V
        //   239: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   242: istore          23
        //   244: iload           23
        //   246: bipush          11
        //   248: if_icmplt       268
        //   251: aload_0        
        //   252: getfield        com/whatsapp/HomeActivity.p:Landroid/view/View;
        //   255: aload_0        
        //   256: getfield        com/whatsapp/HomeActivity.l:I
        //   259: i2f            
        //   260: invokevirtual   android/view/View.setTranslationY:(F)V
        //   263: iload           5
        //   265: ifeq            17
        //   268: aload_0        
        //   269: getfield        com/whatsapp/HomeActivity.p:Landroid/view/View;
        //   272: iconst_0       
        //   273: aload_0        
        //   274: getfield        com/whatsapp/HomeActivity.l:I
        //   277: aload_0        
        //   278: getfield        com/whatsapp/HomeActivity.p:Landroid/view/View;
        //   281: invokevirtual   android/view/View.getTop:()I
        //   284: isub           
        //   285: iconst_0       
        //   286: iconst_0       
        //   287: invokevirtual   android/view/View.setPadding:(IIII)V
        //   290: return         
        //   291: astore          21
        //   293: aload           21
        //   295: athrow         
        //   296: astore          9
        //   298: aload           9
        //   300: athrow         
        //   301: iconst_0       
        //   302: istore          11
        //   304: goto            94
        //   307: astore          12
        //   309: aload           12
        //   311: athrow         
        //   312: astore          13
        //   314: aload           13
        //   316: athrow         
        //   317: astore          14
        //   319: aload           14
        //   321: athrow         
        //   322: astore          15
        //   324: aload           15
        //   326: athrow         
        //   327: astore          19
        //   329: aload           19
        //   331: athrow         
        //   332: astore          20
        //   334: aload           20
        //   336: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  5      11     18     23     Ljava/lang/IllegalArgumentException;
        //  50     64     65     70     Ljava/lang/IllegalArgumentException;
        //  79     85     296    301    Ljava/lang/IllegalArgumentException;
        //  94     99     307    312    Ljava/lang/IllegalArgumentException;
        //  103    109    312    317    Ljava/lang/IllegalArgumentException;
        //  116    144    317    322    Ljava/lang/IllegalArgumentException;
        //  151    163    322    327    Ljava/lang/IllegalArgumentException;
        //  168    190    322    327    Ljava/lang/IllegalArgumentException;
        //  213    219    327    332    Ljava/lang/IllegalArgumentException;
        //  226    244    332    337    Ljava/lang/IllegalArgumentException;
        //  251    263    291    296    Ljava/lang/IllegalArgumentException;
        //  268    290    291    296    Ljava/lang/IllegalArgumentException;
        //  309    312    312    317    Ljava/lang/IllegalArgumentException;
        //  314    317    317    322    Ljava/lang/IllegalArgumentException;
        //  319    322    322    327    Ljava/lang/IllegalArgumentException;
        //  329    332    332    337    Ljava/lang/IllegalArgumentException;
        //  334    337    291    296    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 173, Size: 173
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
    public void a(final g g) {
    }
    
    @Override
    public void a(final bi bi) {
        up.h();
    }
    
    @Override
    public void a(final String s, final long n) {
        try {
            if (this.k.getVisibility() != 0) {
                this.k.setVisibility(0);
            }
            this.C.setText((CharSequence)DateUtils.formatElapsedTime(n / 1000L));
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    @Override
    public void a(final String s, final boolean b) {
    }
    
    @Override
    public void b() {
        this.m();
    }
    
    @Override
    public void b(final bi bi) {
        this.k.setVisibility(8);
    }
    
    @Override
    public void c(final bi bi) {
    }
    
    public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        }
        catch (IllegalArgumentException ex) {
            return false;
        }
    }
    
    @Override
    public void e(final String s) {
        this.runOnUiThread((Runnable)new aan(this));
    }
    
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
    }
    
    @Override
    public void onBackPressed() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   com/whatsapp/HomeActivity.n:()Z
        //     4: istore_3       
        //     5: iload_3        
        //     6: ifeq            20
        //     9: aload_0        
        //    10: iconst_1       
        //    11: invokespecial   com/whatsapp/HomeActivity.c:(Z)V
        //    14: getstatic       com/whatsapp/App.I:Z
        //    17: ifeq            31
        //    20: aload_0        
        //    21: invokespecial   com/whatsapp/DialogToastActivity.onBackPressed:()V
        //    24: return         
        //    25: astore_1       
        //    26: aload_1        
        //    27: athrow         
        //    28: astore_2       
        //    29: aload_2        
        //    30: athrow         
        //    31: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      5      25     28     Ljava/lang/IllegalArgumentException;
        //  9      20     28     31     Ljava/lang/IllegalArgumentException;
        //  20     24     28     31     Ljava/lang/IllegalArgumentException;
        //  26     28     28     31     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0020:
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
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
    
    @Override
    protected void onCreate(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: getstatic       com/whatsapp/HomeActivity.F:[Ljava/lang/String;
        //     7: iconst_4       
        //     8: aaload         
        //     9: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    12: getstatic       com/whatsapp/App.aS:I
        //    15: iconst_3       
        //    16: if_icmpne       23
        //    19: aload_0        
        //    20: invokestatic    com/whatsapp/util/b_.b:(Landroid/app/Activity;)V
        //    23: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    26: bipush          21
        //    28: if_icmplt       41
        //    31: aload_0        
        //    32: invokevirtual   com/whatsapp/HomeActivity.getWindow:()Landroid/view/Window;
        //    35: ldc_w           -2147483648
        //    38: invokevirtual   android/view/Window.addFlags:(I)V
        //    41: aload_0        
        //    42: iconst_5       
        //    43: invokevirtual   com/whatsapp/HomeActivity.supportRequestWindowFeature:(I)Z
        //    46: pop            
        //    47: aload_0        
        //    48: aload_1        
        //    49: invokespecial   com/whatsapp/DialogToastActivity.onCreate:(Landroid/os/Bundle;)V
        //    52: aload_0        
        //    53: ldc_w           2130903170
        //    56: invokevirtual   com/whatsapp/HomeActivity.setContentView:(I)V
        //    59: aload_0        
        //    60: aload_0        
        //    61: ldc_w           2131755371
        //    64: invokevirtual   com/whatsapp/HomeActivity.findViewById:(I)Landroid/view/View;
        //    67: checkcast       Landroid/support/v7/widget/Toolbar;
        //    70: putfield        com/whatsapp/HomeActivity.t:Landroid/support/v7/widget/Toolbar;
        //    73: aload_0        
        //    74: aload_0        
        //    75: getfield        com/whatsapp/HomeActivity.t:Landroid/support/v7/widget/Toolbar;
        //    78: invokevirtual   com/whatsapp/HomeActivity.setSupportActionBar:(Landroid/support/v7/widget/Toolbar;)V
        //    81: aload_0        
        //    82: aload_0        
        //    83: ldc_w           2131755280
        //    86: invokevirtual   com/whatsapp/HomeActivity.findViewById:(I)Landroid/view/View;
        //    89: putfield        com/whatsapp/HomeActivity.p:Landroid/view/View;
        //    92: aload_0        
        //    93: aload_0        
        //    94: ldc_w           2131755616
        //    97: invokevirtual   com/whatsapp/HomeActivity.findViewById:(I)Landroid/view/View;
        //   100: checkcast       Landroid/support/v7/widget/SearchView;
        //   103: putfield        com/whatsapp/HomeActivity.A:Landroid/support/v7/widget/SearchView;
        //   106: aload_0        
        //   107: aload_0        
        //   108: ldc_w           2131755614
        //   111: invokevirtual   com/whatsapp/HomeActivity.findViewById:(I)Landroid/view/View;
        //   114: putfield        com/whatsapp/HomeActivity.y:Landroid/view/View;
        //   117: aload_0        
        //   118: getfield        com/whatsapp/HomeActivity.A:Landroid/support/v7/widget/SearchView;
        //   121: ldc_w           2131755115
        //   124: invokevirtual   android/support/v7/widget/SearchView.findViewById:(I)Landroid/view/View;
        //   127: checkcast       Landroid/widget/TextView;
        //   130: aload_0        
        //   131: invokevirtual   com/whatsapp/HomeActivity.getResources:()Landroid/content/res/Resources;
        //   134: ldc_w           2131624032
        //   137: invokevirtual   android/content/res/Resources.getColor:(I)I
        //   140: invokevirtual   android/widget/TextView.setTextColor:(I)V
        //   143: aload_0        
        //   144: getfield        com/whatsapp/HomeActivity.A:Landroid/support/v7/widget/SearchView;
        //   147: iconst_0       
        //   148: invokevirtual   android/support/v7/widget/SearchView.setIconifiedByDefault:(Z)V
        //   151: aload_0        
        //   152: getfield        com/whatsapp/HomeActivity.A:Landroid/support/v7/widget/SearchView;
        //   155: aload_0        
        //   156: ldc_w           2131231617
        //   159: invokevirtual   com/whatsapp/HomeActivity.getString:(I)Ljava/lang/String;
        //   162: invokevirtual   android/support/v7/widget/SearchView.setQueryHint:(Ljava/lang/CharSequence;)V
        //   165: aload_0        
        //   166: getfield        com/whatsapp/HomeActivity.A:Landroid/support/v7/widget/SearchView;
        //   169: new             Lcom/whatsapp/qn;
        //   172: dup            
        //   173: aload_0        
        //   174: invokespecial   com/whatsapp/qn.<init>:(Lcom/whatsapp/HomeActivity;)V
        //   177: invokevirtual   android/support/v7/widget/SearchView.setOnQueryTextListener:(Landroid/support/v7/widget/SearchView$OnQueryTextListener;)V
        //   180: aload_0        
        //   181: getfield        com/whatsapp/HomeActivity.A:Landroid/support/v7/widget/SearchView;
        //   184: ldc_w           2131755113
        //   187: invokevirtual   android/support/v7/widget/SearchView.findViewById:(I)Landroid/view/View;
        //   190: checkcast       Landroid/widget/ImageView;
        //   193: aconst_null    
        //   194: invokevirtual   android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   197: aload_0        
        //   198: getfield        com/whatsapp/HomeActivity.y:Landroid/view/View;
        //   201: ldc_w           2131755615
        //   204: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   207: checkcast       Landroid/widget/ImageView;
        //   210: astore          6
        //   212: aload           6
        //   214: new             Lcom/whatsapp/util/m;
        //   217: dup            
        //   218: aload_0        
        //   219: getfield        com/whatsapp/HomeActivity.A:Landroid/support/v7/widget/SearchView;
        //   222: invokevirtual   android/support/v7/widget/SearchView.getContext:()Landroid/content/Context;
        //   225: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   228: ldc_w           2130838739
        //   231: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   234: invokespecial   com/whatsapp/util/m.<init>:(Landroid/graphics/drawable/Drawable;)V
        //   237: invokevirtual   android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   240: aload           6
        //   242: new             Lcom/whatsapp/l;
        //   245: dup            
        //   246: aload_0        
        //   247: invokespecial   com/whatsapp/l.<init>:(Lcom/whatsapp/HomeActivity;)V
        //   250: invokevirtual   android/widget/ImageView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   253: aload_0        
        //   254: invokevirtual   com/whatsapp/HomeActivity.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //   257: iconst_0       
        //   258: invokevirtual   android/support/v7/app/ActionBar.setDisplayHomeAsUpEnabled:(Z)V
        //   261: aload_0        
        //   262: iconst_0       
        //   263: invokevirtual   com/whatsapp/HomeActivity.setSupportProgressBarIndeterminateVisibility:(Z)V
        //   266: getstatic       com/whatsapp/App.aX:Lcom/whatsapp/App$Me;
        //   269: astore          9
        //   271: aload           9
        //   273: ifnull          297
        //   276: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   279: invokevirtual   com/whatsapp/vy.l:()Z
        //   282: ifeq            297
        //   285: aload_0        
        //   286: invokestatic    com/whatsapp/App.c:(Landroid/content/Context;)I
        //   289: istore          10
        //   291: iload           10
        //   293: iconst_3       
        //   294: if_icmpeq       351
        //   297: getstatic       com/whatsapp/HomeActivity.F:[Ljava/lang/String;
        //   300: iconst_5       
        //   301: aaload         
        //   302: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   305: getstatic       com/whatsapp/HomeActivity.F:[Ljava/lang/String;
        //   308: iconst_2       
        //   309: aaload         
        //   310: invokestatic    com/whatsapp/App.F:(Ljava/lang/String;)V
        //   313: aload_0        
        //   314: new             Landroid/content/Intent;
        //   317: dup            
        //   318: aload_0        
        //   319: ldc_w           Lcom/whatsapp/Main;.class
        //   322: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   325: invokevirtual   com/whatsapp/HomeActivity.startActivity:(Landroid/content/Intent;)V
        //   328: aload_0        
        //   329: invokevirtual   com/whatsapp/HomeActivity.finish:()V
        //   332: return         
        //   333: astore_3       
        //   334: aload_3        
        //   335: athrow         
        //   336: astore          4
        //   338: aload           4
        //   340: athrow         
        //   341: astore          7
        //   343: aload           7
        //   345: athrow         
        //   346: astore          8
        //   348: aload           8
        //   350: athrow         
        //   351: getstatic       com/whatsapp/App.a:Landroid/media/AsyncPlayer;
        //   354: invokevirtual   android/media/AsyncPlayer.stop:()V
        //   357: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   360: invokevirtual   com/whatsapp/App.D:()Z
        //   363: istore          16
        //   365: iload           16
        //   367: ifeq            393
        //   370: getstatic       com/whatsapp/HomeActivity.F:[Ljava/lang/String;
        //   373: iconst_0       
        //   374: aaload         
        //   375: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   378: aload_0        
        //   379: new             Lcom/whatsapp/DialogToastActivity$ClockWrongDialogFragment;
        //   382: dup            
        //   383: invokespecial   com/whatsapp/DialogToastActivity$ClockWrongDialogFragment.<init>:()V
        //   386: invokespecial   com/whatsapp/HomeActivity.b:(Landroid/support/v4/app/DialogFragment;)V
        //   389: iload_2        
        //   390: ifeq            443
        //   393: invokestatic    com/whatsapp/App.w:()Z
        //   396: istore          17
        //   398: iload           17
        //   400: ifeq            426
        //   403: getstatic       com/whatsapp/HomeActivity.F:[Ljava/lang/String;
        //   406: iconst_1       
        //   407: aaload         
        //   408: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   411: aload_0        
        //   412: new             Lcom/whatsapp/DialogToastActivity$SoftwareExpiredDialogFragment;
        //   415: dup            
        //   416: invokespecial   com/whatsapp/DialogToastActivity$SoftwareExpiredDialogFragment.<init>:()V
        //   419: invokespecial   com/whatsapp/HomeActivity.b:(Landroid/support/v4/app/DialogFragment;)V
        //   422: iload_2        
        //   423: ifeq            443
        //   426: invokestatic    com/whatsapp/App.v:()Z
        //   429: ifeq            443
        //   432: aload_0        
        //   433: new             Lcom/whatsapp/HomeActivity$SoftwareAboutToExpireDialogFragment;
        //   436: dup            
        //   437: invokespecial   com/whatsapp/HomeActivity$SoftwareAboutToExpireDialogFragment.<init>:()V
        //   440: invokespecial   com/whatsapp/HomeActivity.c:(Landroid/support/v4/app/DialogFragment;)V
        //   443: aload_0        
        //   444: invokespecial   com/whatsapp/HomeActivity.o:()V
        //   447: aload_0        
        //   448: aload_0        
        //   449: ldc_w           2131755397
        //   452: invokevirtual   com/whatsapp/HomeActivity.findViewById:(I)Landroid/view/View;
        //   455: checkcast       Lcom/whatsapp/HomeActivity$TabsPager;
        //   458: putfield        com/whatsapp/HomeActivity.m:Lcom/whatsapp/HomeActivity$TabsPager;
        //   461: aload_0        
        //   462: new             Lcom/whatsapp/vg;
        //   465: dup            
        //   466: aload_0        
        //   467: aload_0        
        //   468: invokevirtual   com/whatsapp/HomeActivity.getSupportFragmentManager:()Landroid/support/v4/app/FragmentManager;
        //   471: invokespecial   com/whatsapp/vg.<init>:(Lcom/whatsapp/HomeActivity;Landroid/support/v4/app/FragmentManager;)V
        //   474: putfield        com/whatsapp/HomeActivity.r:Lcom/whatsapp/vg;
        //   477: aload_0        
        //   478: getfield        com/whatsapp/HomeActivity.m:Lcom/whatsapp/HomeActivity$TabsPager;
        //   481: aload_0        
        //   482: getfield        com/whatsapp/HomeActivity.r:Lcom/whatsapp/vg;
        //   485: invokevirtual   com/whatsapp/HomeActivity$TabsPager.setAdapter:(Landroid/support/v4/view/PagerAdapter;)V
        //   488: aload_0        
        //   489: getfield        com/whatsapp/HomeActivity.m:Lcom/whatsapp/HomeActivity$TabsPager;
        //   492: iconst_3       
        //   493: invokevirtual   com/whatsapp/HomeActivity$TabsPager.setOffscreenPageLimit:(I)V
        //   496: aload_0        
        //   497: aload_0        
        //   498: invokevirtual   com/whatsapp/HomeActivity.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //   501: putfield        com/whatsapp/HomeActivity.s:Landroid/support/v7/app/ActionBar;
        //   504: aload_0        
        //   505: getfield        com/whatsapp/HomeActivity.s:Landroid/support/v7/app/ActionBar;
        //   508: fconst_0       
        //   509: invokevirtual   android/support/v7/app/ActionBar.setElevation:(F)V
        //   512: aload_0        
        //   513: getfield        com/whatsapp/HomeActivity.p:Landroid/view/View;
        //   516: aload_0        
        //   517: invokevirtual   com/whatsapp/HomeActivity.getResources:()Landroid/content/res/Resources;
        //   520: ldc_w           2131361864
        //   523: invokevirtual   android/content/res/Resources.getDimension:(I)F
        //   526: invokestatic    android/support/v4/view/ViewCompat.setElevation:(Landroid/view/View;F)V
        //   529: getstatic       com/whatsapp/HomeActivity.F:[Ljava/lang/String;
        //   532: iconst_3       
        //   533: aaload         
        //   534: aload_0        
        //   535: invokevirtual   com/whatsapp/HomeActivity.getIntent:()Landroid/content/Intent;
        //   538: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //   541: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   544: istore          20
        //   546: iload           20
        //   548: ifeq            569
        //   551: aload_0        
        //   552: getfield        com/whatsapp/HomeActivity.m:Lcom/whatsapp/HomeActivity$TabsPager;
        //   555: iconst_0       
        //   556: iconst_0       
        //   557: invokevirtual   com/whatsapp/HomeActivity$TabsPager.setCurrentItem:(IZ)V
        //   560: aload_0        
        //   561: iconst_0       
        //   562: putfield        com/whatsapp/HomeActivity.B:I
        //   565: iload_2        
        //   566: ifeq            583
        //   569: aload_0        
        //   570: getfield        com/whatsapp/HomeActivity.m:Lcom/whatsapp/HomeActivity$TabsPager;
        //   573: iconst_1       
        //   574: iconst_0       
        //   575: invokevirtual   com/whatsapp/HomeActivity$TabsPager.setCurrentItem:(IZ)V
        //   578: aload_0        
        //   579: iconst_1       
        //   580: putfield        com/whatsapp/HomeActivity.B:I
        //   583: aload_0        
        //   584: ldc_w           2131755396
        //   587: invokevirtual   com/whatsapp/HomeActivity.findViewById:(I)Landroid/view/View;
        //   590: checkcast       Lcom/whatsapp/PagerSlidingTabStrip;
        //   593: astore          21
        //   595: aload           21
        //   597: iconst_0       
        //   598: invokestatic    android/support/v4/view/ViewCompat.setLayoutDirection:(Landroid/view/View;I)V
        //   601: aload           21
        //   603: aload_0        
        //   604: getfield        com/whatsapp/HomeActivity.m:Lcom/whatsapp/HomeActivity$TabsPager;
        //   607: invokevirtual   com/whatsapp/PagerSlidingTabStrip.setViewPager:(Landroid/support/v4/view/ViewPager;)V
        //   610: aload           21
        //   612: aload_0        
        //   613: getfield        com/whatsapp/HomeActivity.v:Landroid/support/v4/view/ViewPager$SimpleOnPageChangeListener;
        //   616: invokevirtual   com/whatsapp/PagerSlidingTabStrip.setOnPageChangeListener:(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V
        //   619: aload_0        
        //   620: invokespecial   com/whatsapp/HomeActivity.m:()V
        //   623: aload_0        
        //   624: aload_0        
        //   625: invokespecial   com/whatsapp/HomeActivity.c:()Z
        //   628: invokespecial   com/whatsapp/HomeActivity.b:(Z)V
        //   631: aload_0        
        //   632: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/_7;)V
        //   635: aload_0        
        //   636: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/aa0;)V
        //   639: aload_0        
        //   640: aload_0        
        //   641: ldc_w           2131755427
        //   644: invokevirtual   com/whatsapp/HomeActivity.findViewById:(I)Landroid/view/View;
        //   647: putfield        com/whatsapp/HomeActivity.k:Landroid/view/View;
        //   650: aload_0        
        //   651: getfield        com/whatsapp/HomeActivity.k:Landroid/view/View;
        //   654: new             Lcom/whatsapp/al;
        //   657: dup            
        //   658: aload_0        
        //   659: invokespecial   com/whatsapp/al.<init>:(Lcom/whatsapp/HomeActivity;)V
        //   662: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   665: aload_0        
        //   666: aload_0        
        //   667: ldc_w           2131755428
        //   670: invokevirtual   com/whatsapp/HomeActivity.findViewById:(I)Landroid/view/View;
        //   673: checkcast       Landroid/widget/TextView;
        //   676: putfield        com/whatsapp/HomeActivity.C:Landroid/widget/TextView;
        //   679: aload_0        
        //   680: invokespecial   com/whatsapp/HomeActivity.p:()V
        //   683: return         
        //   684: astore          11
        //   686: aload           11
        //   688: athrow         
        //   689: astore          12
        //   691: aload           12
        //   693: athrow         
        //   694: astore          13
        //   696: aload           13
        //   698: athrow         
        //   699: astore          14
        //   701: aload           14
        //   703: athrow         
        //   704: astore          15
        //   706: aload           15
        //   708: athrow         
        //   709: astore          18
        //   711: aload           18
        //   713: athrow         
        //   714: astore          19
        //   716: aload           19
        //   718: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      23     333    336    Ljava/lang/IllegalArgumentException;
        //  23     41     336    341    Ljava/lang/IllegalArgumentException;
        //  212    271    341    346    Ljava/lang/IllegalArgumentException;
        //  276    291    346    351    Ljava/lang/IllegalArgumentException;
        //  343    346    346    351    Ljava/lang/IllegalArgumentException;
        //  351    365    684    689    Ljava/lang/IllegalArgumentException;
        //  370    389    689    694    Ljava/lang/IllegalArgumentException;
        //  393    398    694    699    Ljava/lang/IllegalArgumentException;
        //  403    422    699    704    Ljava/lang/IllegalArgumentException;
        //  426    443    704    709    Ljava/lang/IllegalArgumentException;
        //  443    546    709    714    Ljava/lang/IllegalArgumentException;
        //  551    565    714    719    Ljava/lang/IllegalArgumentException;
        //  569    583    714    719    Ljava/lang/IllegalArgumentException;
        //  686    689    689    694    Ljava/lang/IllegalArgumentException;
        //  691    694    694    699    Ljava/lang/IllegalArgumentException;
        //  696    699    699    704    Ljava/lang/IllegalArgumentException;
        //  701    704    704    709    Ljava/lang/IllegalArgumentException;
        //  711    714    714    719    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 337, Size: 337
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
                return null;
            }
            case 1: {
                final ProgressDialog progressDialog = new ProgressDialog((Context)this);
                progressDialog.setTitle((CharSequence)this.getString(2131231592));
                progressDialog.setMessage((CharSequence)this.getString(2131231591));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return (Dialog)progressDialog;
            }
            case 0: {
                return new AlertDialog$Builder((Context)this).setTitle(2131231248).setMessage(this.getString(2131231246, new Object[] { this.getString(2131230921) })).setCancelable(false).setPositiveButton(2131231247, (DialogInterface$OnClickListener)new asu(this)).create();
            }
            case 121: {
                Log.w(HomeActivity.F[18]);
                return yt.e(this);
            }
            case 120: {
                Log.w(HomeActivity.F[16]);
                return yt.a(this);
            }
            case 119: {
                Log.w(HomeActivity.F[15]);
                return yt.b(this, false);
            }
            case 117: {
                Log.w(HomeActivity.F[14]);
                return yt.d(this);
            }
            case 118: {
                Log.w(HomeActivity.F[17]);
                return yt.c(this);
            }
        }
    }
    
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }
    
    public void onDestroy() {
        Log.i(HomeActivity.F[27]);
        super.onDestroy();
        App.b((_7)this);
        App.b((aa0)this);
    }
    
    public void onNewIntent(final Intent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: invokespecial   com/whatsapp/DialogToastActivity.onNewIntent:(Landroid/content/Intent;)V
        //     5: getstatic       com/whatsapp/HomeActivity.F:[Ljava/lang/String;
        //     8: bipush          25
        //    10: aaload         
        //    11: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    14: aload_1        
        //    15: getstatic       com/whatsapp/HomeActivity.F:[Ljava/lang/String;
        //    18: bipush          26
        //    20: aaload         
        //    21: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    24: astore_2       
        //    25: aload_2        
        //    26: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    29: istore          6
        //    31: iload           6
        //    33: ifne            74
        //    36: aload_2        
        //    37: invokestatic    com/whatsapp/adc.f:(Ljava/lang/String;)Z
        //    40: istore          10
        //    42: iload           10
        //    44: ifne            57
        //    47: aload_2        
        //    48: invokestatic    com/whatsapp/App.G:(Ljava/lang/String;)V
        //    51: getstatic       com/whatsapp/App.I:Z
        //    54: ifeq            74
        //    57: aload_2        
        //    58: iconst_1       
        //    59: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;Z)V
        //    62: new             Lcom/whatsapp/s8;
        //    65: dup            
        //    66: aload_0        
        //    67: aload_2        
        //    68: invokespecial   com/whatsapp/s8.<init>:(Lcom/whatsapp/HomeActivity;Ljava/lang/String;)V
        //    71: invokestatic    com/whatsapp/util/bm.a:(Ljava/lang/Runnable;)V
        //    74: aload_1        
        //    75: getstatic       com/whatsapp/HomeActivity.F:[Ljava/lang/String;
        //    78: bipush          23
        //    80: aaload         
        //    81: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    84: astore          7
        //    86: aload           7
        //    88: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    91: ifne            113
        //    94: aload           7
        //    96: iconst_1       
        //    97: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;Z)V
        //   100: new             Lcom/whatsapp/a21;
        //   103: dup            
        //   104: aload_0        
        //   105: aload           7
        //   107: invokespecial   com/whatsapp/a21.<init>:(Lcom/whatsapp/HomeActivity;Ljava/lang/String;)V
        //   110: invokestatic    com/whatsapp/util/bm.a:(Ljava/lang/Runnable;)V
        //   113: getstatic       com/whatsapp/HomeActivity.F:[Ljava/lang/String;
        //   116: bipush          24
        //   118: aaload         
        //   119: aload_1        
        //   120: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //   123: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   126: ifeq            143
        //   129: aload_0        
        //   130: getfield        com/whatsapp/HomeActivity.m:Lcom/whatsapp/HomeActivity$TabsPager;
        //   133: iconst_0       
        //   134: iconst_0       
        //   135: invokevirtual   com/whatsapp/HomeActivity$TabsPager.setCurrentItem:(IZ)V
        //   138: aload_0        
        //   139: iconst_0       
        //   140: putfield        com/whatsapp/HomeActivity.B:I
        //   143: return         
        //   144: astore_3       
        //   145: aload_3        
        //   146: athrow         
        //   147: astore          4
        //   149: aload           4
        //   151: athrow         
        //   152: astore          5
        //   154: aload           5
        //   156: athrow         
        //   157: astore          8
        //   159: aload           8
        //   161: athrow         
        //   162: astore          9
        //   164: aload           9
        //   166: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  25     31     144    147    Ljava/lang/IllegalArgumentException;
        //  36     42     147    152    Ljava/lang/IllegalArgumentException;
        //  47     57     152    157    Ljava/lang/IllegalArgumentException;
        //  57     74     152    157    Ljava/lang/IllegalArgumentException;
        //  86     113    157    162    Ljava/lang/IllegalArgumentException;
        //  113    143    162    167    Ljava/lang/IllegalArgumentException;
        //  145    147    147    152    Ljava/lang/IllegalArgumentException;
        //  149    152    152    157    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 85, Size: 85
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
        Label_0101: {
            Label_0084: {
                try {
                    switch (menuItem.getItemId()) {
                        default: {
                            return super.onOptionsItemSelected(menuItem);
                        }
                        case 2131755035: {
                            this.i();
                            return true;
                        }
                        case 2131755038: {
                            break;
                        }
                        case 2131755037: {
                            break Label_0084;
                        }
                        case 2131755025: {
                            break Label_0101;
                        }
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                this.startActivity(new Intent((Context)this, (Class)SetStatus.class));
                return true;
            }
            this.startActivity(new Intent((Context)this, (Class)Settings.class));
            return true;
        }
        this.startActivity(new Intent((Context)this, (Class)Advanced.class));
        return true;
    }
    
    public void onPause() {
        Log.i(HomeActivity.F[8]);
        super.onPause();
    }
    
    protected void onPrepareDialog(final int n, final Dialog dialog) {
        final boolean i = App.I;
        Label_0083: {
            switch (n) {
                case 121: {
                    ((AlertDialog)dialog).setMessage(yt.b());
                    if (i) {
                        break Label_0083;
                    }
                    break;
                }
                case 117: {
                    ((AlertDialog)dialog).setMessage(yt.a());
                    if (i) {
                        break Label_0083;
                    }
                    break;
                }
                case 118: {
                    ((AlertDialog)dialog).setMessage(yt.d());
                    if (i) {
                        break Label_0083;
                    }
                    break;
                }
                case 119: {
                    ((AlertDialog)dialog).setMessage(yt.c());
                }
            }
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
        //     4: aload_0        
        //     5: aload_1        
        //     6: invokespecial   com/whatsapp/DialogToastActivity.onPrepareOptionsMenu:(Landroid/view/Menu;)Z
        //     9: pop            
        //    10: aload_0        
        //    11: aload_1        
        //    12: putfield        com/whatsapp/HomeActivity.u:Landroid/view/Menu;
        //    15: aload_1        
        //    16: invokeinterface android/view/Menu.size:()I
        //    21: ifne            390
        //    24: aload_1        
        //    25: iconst_0       
        //    26: ldc_w           2131755035
        //    29: iconst_0       
        //    30: ldc_w           2131231614
        //    33: invokeinterface android/view/Menu.add:(IIII)Landroid/view/MenuItem;
        //    38: ldc_w           2130838731
        //    41: invokeinterface android/view/MenuItem.setIcon:(I)Landroid/view/MenuItem;
        //    46: astore          8
        //    48: aload           8
        //    50: iconst_2       
        //    51: invokestatic    android/support/v4/view/MenuItemCompat.setShowAsAction:(Landroid/view/MenuItem;I)V
        //    54: aload_0        
        //    55: aload_1        
        //    56: iconst_1       
        //    57: ldc_w           2131755029
        //    60: iconst_0       
        //    61: ldc_w           2131231308
        //    64: invokeinterface android/view/Menu.add:(IIII)Landroid/view/MenuItem;
        //    69: ldc_w           2130838728
        //    72: invokeinterface android/view/MenuItem.setIcon:(I)Landroid/view/MenuItem;
        //    77: bipush          110
        //    79: invokeinterface android/view/MenuItem.setAlphabeticShortcut:(C)Landroid/view/MenuItem;
        //    84: putfield        com/whatsapp/HomeActivity.q:Landroid/view/MenuItem;
        //    87: aload_0        
        //    88: getfield        com/whatsapp/HomeActivity.q:Landroid/view/MenuItem;
        //    91: iconst_2       
        //    92: invokestatic    android/support/v4/view/MenuItemCompat.setShowAsAction:(Landroid/view/MenuItem;I)V
        //    95: aload_1        
        //    96: iconst_1       
        //    97: ldc_w           2131755014
        //   100: iconst_0       
        //   101: ldc_w           2131230898
        //   104: invokeinterface android/view/Menu.add:(IIII)Landroid/view/MenuItem;
        //   109: pop            
        //   110: aload_1        
        //   111: iconst_2       
        //   112: ldc_w           2131755031
        //   115: iconst_0       
        //   116: ldc_w           2131231307
        //   119: invokeinterface android/view/Menu.add:(IIII)Landroid/view/MenuItem;
        //   124: ldc_w           2130838715
        //   127: invokeinterface android/view/MenuItem.setIcon:(I)Landroid/view/MenuItem;
        //   132: bipush          110
        //   134: invokeinterface android/view/MenuItem.setAlphabeticShortcut:(C)Landroid/view/MenuItem;
        //   139: iconst_2       
        //   140: invokestatic    android/support/v4/view/MenuItemCompat.setShowAsAction:(Landroid/view/MenuItem;I)V
        //   143: aload_1        
        //   144: iconst_2       
        //   145: ldc_w           2131755032
        //   148: iconst_0       
        //   149: ldc_w           2131231303
        //   152: invokeinterface android/view/Menu.add:(IIII)Landroid/view/MenuItem;
        //   157: ldc_w           2130838788
        //   160: invokeinterface android/view/MenuItem.setIcon:(I)Landroid/view/MenuItem;
        //   165: bipush          103
        //   167: invokeinterface android/view/MenuItem.setAlphabeticShortcut:(C)Landroid/view/MenuItem;
        //   172: pop            
        //   173: aload_1        
        //   174: iconst_2       
        //   175: ldc_w           2131755028
        //   178: iconst_0       
        //   179: ldc_w           2131231304
        //   182: invokeinterface android/view/Menu.add:(IIII)Landroid/view/MenuItem;
        //   187: ldc_w           2130838780
        //   190: invokeinterface android/view/MenuItem.setIcon:(I)Landroid/view/MenuItem;
        //   195: bipush          98
        //   197: invokeinterface android/view/MenuItem.setAlphabeticShortcut:(C)Landroid/view/MenuItem;
        //   202: pop            
        //   203: aload_1        
        //   204: iconst_2       
        //   205: ldc_w           2131755034
        //   208: iconst_0       
        //   209: ldc_w           2131231314
        //   212: invokeinterface android/view/Menu.add:(IIII)Landroid/view/MenuItem;
        //   217: ldc_w           2130838806
        //   220: invokeinterface android/view/MenuItem.setIcon:(I)Landroid/view/MenuItem;
        //   225: bipush          113
        //   227: invokeinterface android/view/MenuItem.setAlphabeticShortcut:(C)Landroid/view/MenuItem;
        //   232: pop            
        //   233: aload_1        
        //   234: iconst_3       
        //   235: ldc_w           2131755030
        //   238: iconst_0       
        //   239: ldc_w           2131231309
        //   242: invokeinterface android/view/Menu.add:(IIII)Landroid/view/MenuItem;
        //   247: ldc_w           2130838708
        //   250: invokeinterface android/view/MenuItem.setIcon:(I)Landroid/view/MenuItem;
        //   255: bipush          110
        //   257: invokeinterface android/view/MenuItem.setAlphabeticShortcut:(C)Landroid/view/MenuItem;
        //   262: iconst_2       
        //   263: invokestatic    android/support/v4/view/MenuItemCompat.setShowAsAction:(Landroid/view/MenuItem;I)V
        //   266: aload_1        
        //   267: iconst_3       
        //   268: ldc_w           2131755033
        //   271: iconst_0       
        //   272: aload_0        
        //   273: ldc_w           2131231310
        //   276: invokevirtual   com/whatsapp/HomeActivity.getString:(I)Ljava/lang/String;
        //   279: invokeinterface android/view/Menu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //   284: ldc_w           2130838798
        //   287: invokeinterface android/view/MenuItem.setIcon:(I)Landroid/view/MenuItem;
        //   292: pop            
        //   293: aload_1        
        //   294: iconst_4       
        //   295: ldc_w           2131755038
        //   298: iconst_0       
        //   299: ldc_w           2131231313
        //   302: invokeinterface android/view/Menu.add:(IIII)Landroid/view/MenuItem;
        //   307: ldc_w           2130838805
        //   310: invokeinterface android/view/MenuItem.setIcon:(I)Landroid/view/MenuItem;
        //   315: bipush          115
        //   317: invokeinterface android/view/MenuItem.setAlphabeticShortcut:(C)Landroid/view/MenuItem;
        //   322: pop            
        //   323: aload_1        
        //   324: iconst_4       
        //   325: ldc_w           2131755037
        //   328: iconst_0       
        //   329: ldc_w           2131231312
        //   332: invokeinterface android/view/Menu.add:(IIII)Landroid/view/MenuItem;
        //   337: ldc_w           2130838802
        //   340: invokeinterface android/view/MenuItem.setIcon:(I)Landroid/view/MenuItem;
        //   345: bipush          111
        //   347: invokeinterface android/view/MenuItem.setAlphabeticShortcut:(C)Landroid/view/MenuItem;
        //   352: pop            
        //   353: getstatic       com/whatsapp/App.aV:I
        //   356: iconst_3       
        //   357: if_icmpne       390
        //   360: aload_1        
        //   361: iconst_4       
        //   362: ldc_w           2131755025
        //   365: iconst_0       
        //   366: ldc_w           2131231302
        //   369: invokeinterface android/view/Menu.add:(IIII)Landroid/view/MenuItem;
        //   374: aload_0        
        //   375: invokevirtual   com/whatsapp/HomeActivity.getResources:()Landroid/content/res/Resources;
        //   378: ldc_w           2130838917
        //   381: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   384: invokeinterface android/view/MenuItem.setIcon:(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;
        //   389: pop            
        //   390: aload_0        
        //   391: getfield        com/whatsapp/HomeActivity.B:I
        //   394: istore          7
        //   396: iload           7
        //   398: tableswitch {
        //                0: 431
        //                1: 459
        //                2: 487
        //          default: 424
        //        }
        //   424: iconst_1       
        //   425: ireturn        
        //   426: astore          9
        //   428: aload           9
        //   430: athrow         
        //   431: aload_1        
        //   432: iconst_1       
        //   433: iconst_1       
        //   434: invokeinterface android/view/Menu.setGroupVisible:(IZ)V
        //   439: aload_1        
        //   440: iconst_2       
        //   441: iconst_0       
        //   442: invokeinterface android/view/Menu.setGroupVisible:(IZ)V
        //   447: aload_1        
        //   448: iconst_3       
        //   449: iconst_0       
        //   450: invokeinterface android/view/Menu.setGroupVisible:(IZ)V
        //   455: iload_2        
        //   456: ifeq            424
        //   459: aload_1        
        //   460: iconst_1       
        //   461: iconst_0       
        //   462: invokeinterface android/view/Menu.setGroupVisible:(IZ)V
        //   467: aload_1        
        //   468: iconst_2       
        //   469: iconst_1       
        //   470: invokeinterface android/view/Menu.setGroupVisible:(IZ)V
        //   475: aload_1        
        //   476: iconst_3       
        //   477: iconst_0       
        //   478: invokeinterface android/view/Menu.setGroupVisible:(IZ)V
        //   483: iload_2        
        //   484: ifeq            424
        //   487: aload_1        
        //   488: iconst_1       
        //   489: iconst_0       
        //   490: invokeinterface android/view/Menu.setGroupVisible:(IZ)V
        //   495: aload_1        
        //   496: iconst_2       
        //   497: iconst_0       
        //   498: invokeinterface android/view/Menu.setGroupVisible:(IZ)V
        //   503: aload_1        
        //   504: iconst_3       
        //   505: iconst_1       
        //   506: invokeinterface android/view/Menu.setGroupVisible:(IZ)V
        //   511: iconst_1       
        //   512: ireturn        
        //   513: astore          6
        //   515: aload           6
        //   517: athrow         
        //   518: astore          4
        //   520: aload           4
        //   522: athrow         
        //   523: astore          5
        //   525: aload           5
        //   527: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  48     390    426    431    Ljava/lang/IllegalArgumentException;
        //  390    396    518    523    Ljava/lang/IllegalArgumentException;
        //  431    455    523    528    Ljava/lang/IllegalArgumentException;
        //  459    483    513    518    Ljava/lang/IllegalArgumentException;
        //  487    511    513    518    Ljava/lang/IllegalArgumentException;
        //  520    523    523    528    Ljava/lang/IllegalArgumentException;
        //  525    528    513    518    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0390:
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
    
    protected void onRestoreInstanceState(final Bundle bundle) {
        try {
            super.onRestoreInstanceState(bundle);
            if (bundle.getBoolean(HomeActivity.F[7])) {
                this.i();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public void onResume() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: getstatic       com/whatsapp/HomeActivity.F:[Ljava/lang/String;
        //     7: bipush          21
        //     9: aaload         
        //    10: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    13: aload_0        
        //    14: invokespecial   com/whatsapp/DialogToastActivity.onResume:()V
        //    17: getstatic       com/whatsapp/App.aX:Lcom/whatsapp/App$Me;
        //    20: astore          4
        //    22: aload           4
        //    24: ifnull          48
        //    27: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //    30: invokevirtual   com/whatsapp/vy.l:()Z
        //    33: ifeq            48
        //    36: aload_0        
        //    37: invokestatic    com/whatsapp/App.c:(Landroid/content/Context;)I
        //    40: istore          5
        //    42: iload           5
        //    44: iconst_3       
        //    45: if_icmpeq       92
        //    48: getstatic       com/whatsapp/HomeActivity.F:[Ljava/lang/String;
        //    51: bipush          19
        //    53: aaload         
        //    54: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    57: getstatic       com/whatsapp/HomeActivity.F:[Ljava/lang/String;
        //    60: bipush          20
        //    62: aaload         
        //    63: invokestatic    com/whatsapp/App.F:(Ljava/lang/String;)V
        //    66: aload_0        
        //    67: new             Landroid/content/Intent;
        //    70: dup            
        //    71: aload_0        
        //    72: ldc_w           Lcom/whatsapp/Main;.class
        //    75: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //    78: invokevirtual   com/whatsapp/HomeActivity.startActivity:(Landroid/content/Intent;)V
        //    81: aload_0        
        //    82: invokevirtual   com/whatsapp/HomeActivity.finish:()V
        //    85: return         
        //    86: astore_2       
        //    87: aload_2        
        //    88: athrow         
        //    89: astore_3       
        //    90: aload_3        
        //    91: athrow         
        //    92: invokestatic    com/whatsapp/notification/y.a:()V
        //    95: getstatic       com/whatsapp/App.a:Landroid/media/AsyncPlayer;
        //    98: invokevirtual   android/media/AsyncPlayer.stop:()V
        //   101: invokestatic    com/whatsapp/App.aq:()Z
        //   104: istore          13
        //   106: iload           13
        //   108: ifeq            120
        //   111: aload_0        
        //   112: invokevirtual   com/whatsapp/HomeActivity.b:()Z
        //   115: pop            
        //   116: iload_1        
        //   117: ifeq            187
        //   120: getstatic       com/whatsapp/App.aU:Ljava/util/Date;
        //   123: astore          14
        //   125: aload           14
        //   127: ifnull          145
        //   130: aload_0        
        //   131: new             Lcom/whatsapp/DialogToastActivity$ClockWrongDialogFragment;
        //   134: dup            
        //   135: invokespecial   com/whatsapp/DialogToastActivity$ClockWrongDialogFragment.<init>:()V
        //   138: invokespecial   com/whatsapp/HomeActivity.b:(Landroid/support/v4/app/DialogFragment;)V
        //   141: iload_1        
        //   142: ifeq            187
        //   145: getstatic       com/whatsapp/App.aA:Z
        //   148: istore          15
        //   150: iload           15
        //   152: ifeq            170
        //   155: aload_0        
        //   156: new             Lcom/whatsapp/DialogToastActivity$SoftwareExpiredDialogFragment;
        //   159: dup            
        //   160: invokespecial   com/whatsapp/DialogToastActivity$SoftwareExpiredDialogFragment.<init>:()V
        //   163: invokespecial   com/whatsapp/HomeActivity.b:(Landroid/support/v4/app/DialogFragment;)V
        //   166: iload_1        
        //   167: ifeq            187
        //   170: invokestatic    com/whatsapp/App.v:()Z
        //   173: ifeq            187
        //   176: aload_0        
        //   177: new             Lcom/whatsapp/HomeActivity$SoftwareAboutToExpireDialogFragment;
        //   180: dup            
        //   181: invokespecial   com/whatsapp/HomeActivity$SoftwareAboutToExpireDialogFragment.<init>:()V
        //   184: invokespecial   com/whatsapp/HomeActivity.c:(Landroid/support/v4/app/DialogFragment;)V
        //   187: aload_0        
        //   188: getfield        com/whatsapp/HomeActivity.B:I
        //   191: ifne            215
        //   194: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   197: invokevirtual   com/whatsapp/App.a5:()Landroid/os/Handler;
        //   200: new             Lcom/whatsapp/a9c;
        //   203: dup            
        //   204: aload_0        
        //   205: invokespecial   com/whatsapp/a9c.<init>:(Lcom/whatsapp/HomeActivity;)V
        //   208: ldc2_w          2000
        //   211: invokevirtual   android/os/Handler.postDelayed:(Ljava/lang/Runnable;J)Z
        //   214: pop            
        //   215: invokestatic    com/whatsapp/Voip.d:()Z
        //   218: istore          19
        //   220: iload           19
        //   222: ifeq            233
        //   225: aload_0        
        //   226: invokespecial   com/whatsapp/HomeActivity.f:()V
        //   229: iload_1        
        //   230: ifeq            85
        //   233: aload_0        
        //   234: getfield        com/whatsapp/HomeActivity.k:Landroid/view/View;
        //   237: bipush          8
        //   239: invokevirtual   android/view/View.setVisibility:(I)V
        //   242: return         
        //   243: astore          18
        //   245: aload           18
        //   247: athrow         
        //   248: astore          6
        //   250: aload           6
        //   252: athrow         
        //   253: astore          7
        //   255: aload           7
        //   257: athrow         
        //   258: astore          8
        //   260: aload           8
        //   262: athrow         
        //   263: astore          9
        //   265: aload           9
        //   267: athrow         
        //   268: astore          10
        //   270: aload           10
        //   272: athrow         
        //   273: astore          11
        //   275: aload           11
        //   277: athrow         
        //   278: astore          12
        //   280: aload           12
        //   282: athrow         
        //   283: astore          16
        //   285: aload           16
        //   287: athrow         
        //   288: astore          17
        //   290: aload           17
        //   292: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      22     86     89     Ljava/lang/IllegalArgumentException;
        //  27     42     89     92     Ljava/lang/IllegalArgumentException;
        //  87     89     89     92     Ljava/lang/IllegalArgumentException;
        //  92     106    248    253    Ljava/lang/IllegalArgumentException;
        //  111    116    253    258    Ljava/lang/IllegalArgumentException;
        //  120    125    258    263    Ljava/lang/IllegalArgumentException;
        //  130    141    263    268    Ljava/lang/IllegalArgumentException;
        //  145    150    268    273    Ljava/lang/IllegalArgumentException;
        //  155    166    273    278    Ljava/lang/IllegalArgumentException;
        //  170    187    278    283    Ljava/lang/IllegalArgumentException;
        //  187    215    283    288    Ljava/lang/IllegalArgumentException;
        //  215    220    288    293    Ljava/lang/IllegalArgumentException;
        //  225    229    243    248    Ljava/lang/IllegalArgumentException;
        //  233    242    243    248    Ljava/lang/IllegalArgumentException;
        //  250    253    253    258    Ljava/lang/IllegalArgumentException;
        //  255    258    258    263    Ljava/lang/IllegalArgumentException;
        //  260    263    263    268    Ljava/lang/IllegalArgumentException;
        //  265    268    268    273    Ljava/lang/IllegalArgumentException;
        //  270    273    273    278    Ljava/lang/IllegalArgumentException;
        //  275    278    278    283    Ljava/lang/IllegalArgumentException;
        //  290    293    243    248    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 141, Size: 141
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
        while (true) {
            while (true) {
                try {
                    super.onSaveInstanceState(bundle);
                    final String s = HomeActivity.F[13];
                    if (this.y.getVisibility() == 0) {
                        final boolean b = true;
                        bundle.putBoolean(s, b);
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
    
    public boolean onSearchRequested() {
        this.i();
        return false;
    }
    
    public void onStart() {
        super.onStart();
        ade.a(this.w);
    }
    
    public void onStop() {
        super.onStop();
        ade.b(this.w);
    }
    
    @Override
    public void startActivityFromFragment(final Fragment fragment, final Intent intent, final int n) {
        try {
            if (intent.getLongExtra(HomeActivity.F[11], -1L) == -1L) {
                this.y.postDelayed((Runnable)new asy(this), (long)this.getResources().getInteger(17694722));
            }
            super.startActivityFromFragment(fragment, intent, n);
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
}
