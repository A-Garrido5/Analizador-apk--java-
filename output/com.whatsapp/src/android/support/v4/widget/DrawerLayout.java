// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.os.Parcelable;
import android.support.v4.view.KeyEventCompat;
import android.view.KeyEvent;
import android.support.annotation.Nullable;
import android.view.ViewGroup$MarginLayoutParams;
import android.support.v4.view.GravityCompat;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.os.SystemClock;
import android.view.ViewGroup$LayoutParams;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.Paint;
import android.view.ViewGroup;

public class DrawerLayout extends ViewGroup implements DrawerLayoutImpl
{
    private static final boolean CAN_HIDE_DESCENDANTS;
    static final DrawerLayout$DrawerLayoutCompatImpl IMPL;
    private static final int[] LAYOUT_ATTRS;
    private static final String[] z;
    private final DrawerLayout$ChildAccessibilityDelegate mChildAccessibilityDelegate;
    private boolean mChildrenCanceledTouch;
    private boolean mDisallowInterceptRequested;
    private boolean mDrawStatusBarBackground;
    private int mDrawerState;
    private boolean mFirstLayout;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private Object mLastInsets;
    private final DrawerLayout$ViewDragCallback mLeftCallback;
    private final ViewDragHelper mLeftDragger;
    private DrawerLayout$DrawerListener mListener;
    private int mLockModeLeft;
    private int mLockModeRight;
    private int mMinDrawerMargin;
    private final DrawerLayout$ViewDragCallback mRightCallback;
    private final ViewDragHelper mRightDragger;
    private int mScrimColor;
    private float mScrimOpacity;
    private Paint mScrimPaint;
    private Drawable mShadowLeft;
    private Drawable mShadowRight;
    private Drawable mStatusBarBackground;
    private CharSequence mTitleLeft;
    private CharSequence mTitleRight;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_0       
        //     2: bipush          18
        //     4: anewarray       Ljava/lang/String;
        //     7: astore_1       
        //     8: ldc             "P\u0003\u0011Y\t"
        //    10: astore_2       
        //    11: iconst_m1      
        //    12: istore_3       
        //    13: aload_1        
        //    14: astore          4
        //    16: iconst_0       
        //    17: istore          5
        //    19: aload_2        
        //    20: invokevirtual   java/lang/String.toCharArray:()[C
        //    23: astore          6
        //    25: aload           6
        //    27: arraylength    
        //    28: istore          7
        //    30: iconst_0       
        //    31: istore          8
        //    33: iload           7
        //    35: iload           8
        //    37: if_icmpgt       573
        //    40: new             Ljava/lang/String;
        //    43: dup            
        //    44: aload           6
        //    46: invokespecial   java/lang/String.<init>:([C)V
        //    49: invokevirtual   java/lang/String.intern:()Ljava/lang/String;
        //    52: astore          11
        //    54: iload_3        
        //    55: tableswitch {
        //                0: 157
        //                1: 178
        //                2: 199
        //                3: 220
        //                4: 241
        //                5: 263
        //                6: 286
        //                7: 309
        //                8: 332
        //                9: 355
        //               10: 378
        //               11: 401
        //               12: 424
        //               13: 447
        //               14: 470
        //               15: 493
        //               16: 516
        //          default: 136
        //        }
        //   136: aload           4
        //   138: iload           5
        //   140: aload           11
        //   142: aastore        
        //   143: ldc             "&\u0003\u0007\u000eGi\u001eTO\tu\u0006\u001dJ@h\rTJ[g\u001d\u0011\\"
        //   145: astore_2       
        //   146: iload_0        
        //   147: istore          5
        //   149: aload_1        
        //   150: astore          4
        //   152: iconst_0       
        //   153: istore_3       
        //   154: goto            19
        //   157: aload           4
        //   159: iload           5
        //   161: aload           11
        //   163: aastore        
        //   164: ldc             "&\b\u0001Z\tr\u0002\u001d]\t"
        //   166: astore_2       
        //   167: iconst_2       
        //   168: istore          5
        //   170: aload_1        
        //   171: astore          4
        //   173: iload_0        
        //   174: istore_3       
        //   175: goto            19
        //   178: aload           4
        //   180: iload           5
        //   182: aload           11
        //   184: aastore        
        //   185: ldc             "&\u000b\u0018\\Lg\u000e\r\u000eAg\u0019TO\t"
        //   187: astore_2       
        //   188: iconst_3       
        //   189: istore          5
        //   191: aload_1        
        //   192: astore          4
        //   194: iconst_2       
        //   195: istore_3       
        //   196: goto            19
        //   199: aload           4
        //   201: iload           5
        //   203: aload           11
        //   205: aastore        
        //   206: iconst_4       
        //   207: istore          5
        //   209: aload_1        
        //   210: astore          4
        //   212: ldc             "&\u000e\u001bKZ&\u0004\u001bZ\tn\u000b\u0002K\tgJ\u0002OEo\u000eTBH\u007f\u0005\u0001Zva\u0018\u0015X@r\u0013T\u0003\tk\u001f\u0007Z\td\u000fTi[g\u001c\u001dZP(&1h}*J"
        //   214: astore_2       
        //   215: iconst_3       
        //   216: istore_3       
        //   217: goto            19
        //   220: aload           4
        //   222: iload           5
        //   224: aload           11
        //   226: aastore        
        //   227: iconst_5       
        //   228: istore          5
        //   230: ldc             "E\u0002\u001dBM&"
        //   232: astore_2       
        //   233: iconst_4       
        //   234: istore_3       
        //   235: aload_1        
        //   236: astore          4
        //   238: goto            19
        //   241: aload           4
        //   243: iload           5
        //   245: aload           11
        //   247: aastore        
        //   248: ldc             "E\u0002\u001dBM&\u000e\u0006O^c\u0018TFHuJ\u0015LZi\u0006\u0001ZL&\r\u0006O_o\u001e\r\u000e"
        //   250: astore_2       
        //   251: iconst_5       
        //   252: istore_3       
        //   253: bipush          6
        //   255: istore          5
        //   257: aload_1        
        //   258: astore          4
        //   260: goto            19
        //   263: aload           4
        //   265: iload           5
        //   267: aload           11
        //   269: aastore        
        //   270: bipush          7
        //   272: istore          5
        //   274: aload_1        
        //   275: astore          4
        //   277: ldc             "b\u0018\u0015YLtJ\u0002GLqJ\u0015BFh\rTZAg\u001eTKMa\u000f"
        //   279: astore_2       
        //   280: bipush          6
        //   282: istore_3       
        //   283: goto            19
        //   286: aload           4
        //   288: iload           5
        //   290: aload           11
        //   292: aastore        
        //   293: bipush          8
        //   295: istore          5
        //   297: ldc             "&\u000b\u0000\u000e@h\u000e\u0011V\t"
        //   299: astore_2       
        //   300: bipush          7
        //   302: istore_3       
        //   303: aload_1        
        //   304: astore          4
        //   306: goto            19
        //   309: aload           4
        //   311: iload           5
        //   313: aload           11
        //   315: aastore        
        //   316: bipush          9
        //   318: istore          5
        //   320: ldc             "B\u0018\u0015YLt&\u0015WFs\u001e"
        //   322: astore_2       
        //   323: bipush          8
        //   325: istore_3       
        //   326: aload_1        
        //   327: astore          4
        //   329: goto            19
        //   332: aload           4
        //   334: iload           5
        //   336: aload           11
        //   338: aastore        
        //   339: bipush          10
        //   341: istore          5
        //   343: ldc             "B\u0018\u0015YLt&\u0015WFs\u001eTC\\u\u001eTLL&\u0007\u0011OZs\u0018\u0011J\tq\u0003\u0000F\tK\u000f\u0015]\\t\u000f'^LeD1vhE>8w\u0007"
        //   345: astore_2       
        //   346: bipush          9
        //   348: istore_3       
        //   349: aload_1        
        //   350: astore          4
        //   352: goto            19
        //   355: aload           4
        //   357: iload           5
        //   359: aload           11
        //   361: aastore        
        //   362: bipush          11
        //   364: istore          5
        //   366: ldc             "A\u0018\u0015X@r\u0013Z|`A\" \u000eFtJ3\\Hp\u0003\u0000W\u0007H%+i{G<=zp"
        //   368: astore_2       
        //   369: bipush          10
        //   371: istore_3       
        //   372: aload_1        
        //   373: astore          4
        //   375: goto            19
        //   378: aload           4
        //   380: iload           5
        //   382: aload           11
        //   384: aastore        
        //   385: bipush          12
        //   387: istore          5
        //   389: ldc             "P\u0003\u0011Y\t"
        //   391: astore_2       
        //   392: bipush          11
        //   394: istore_3       
        //   395: aload_1        
        //   396: astore          4
        //   398: goto            19
        //   401: aload           4
        //   403: iload           5
        //   405: aload           11
        //   407: aastore        
        //   408: bipush          13
        //   410: istore          5
        //   412: ldc             "&\u0003\u0007\u000eGi\u001eTO\tu\u0006\u001dJ@h\rTJ[g\u001d\u0011\\"
        //   414: astore_2       
        //   415: bipush          12
        //   417: istore_3       
        //   418: aload_1        
        //   419: astore          4
        //   421: goto            19
        //   424: aload           4
        //   426: iload           5
        //   428: aload           11
        //   430: aastore        
        //   431: bipush          14
        //   433: istore          5
        //   435: ldc             "P\u0003\u0011Y\t"
        //   437: astore_2       
        //   438: bipush          13
        //   440: istore_3       
        //   441: aload_1        
        //   442: astore          4
        //   444: goto            19
        //   447: aload           4
        //   449: iload           5
        //   451: aload           11
        //   453: aastore        
        //   454: bipush          15
        //   456: istore          5
        //   458: ldc             "&\u0003\u0007\u000eGi\u001eTO\tb\u0018\u0015YLt"
        //   460: astore_2       
        //   461: bipush          14
        //   463: istore_3       
        //   464: aload_1        
        //   465: astore          4
        //   467: goto            19
        //   470: aload           4
        //   472: iload           5
        //   474: aload           11
        //   476: aastore        
        //   477: bipush          16
        //   479: istore          5
        //   481: ldc             "T#3f}"
        //   483: astore_2       
        //   484: bipush          15
        //   486: istore_3       
        //   487: aload_1        
        //   488: astore          4
        //   490: goto            19
        //   493: aload           4
        //   495: iload           5
        //   497: aload           11
        //   499: aastore        
        //   500: bipush          17
        //   502: istore          5
        //   504: ldc             "J/2z"
        //   506: astore_2       
        //   507: bipush          16
        //   509: istore_3       
        //   510: aload_1        
        //   511: astore          4
        //   513: goto            19
        //   516: aload           4
        //   518: iload           5
        //   520: aload           11
        //   522: aastore        
        //   523: aload_1        
        //   524: putstatic       android/support/v4/widget/DrawerLayout.z:[Ljava/lang/String;
        //   527: iconst_1       
        //   528: newarray        I
        //   530: dup            
        //   531: iconst_0       
        //   532: ldc             16842931
        //   534: iastore        
        //   535: putstatic       android/support/v4/widget/DrawerLayout.LAYOUT_ATTRS:[I
        //   538: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   541: istore          13
        //   543: iload           13
        //   545: bipush          19
        //   547: if_icmplt       670
        //   550: iload_0        
        //   551: putstatic       android/support/v4/widget/DrawerLayout.CAN_HIDE_DESCENDANTS:Z
        //   554: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   557: bipush          21
        //   559: if_icmplt       680
        //   562: new             Landroid/support/v4/widget/DrawerLayout$DrawerLayoutCompatImplApi21;
        //   565: dup            
        //   566: invokespecial   android/support/v4/widget/DrawerLayout$DrawerLayoutCompatImplApi21.<init>:()V
        //   569: putstatic       android/support/v4/widget/DrawerLayout.IMPL:Landroid/support/v4/widget/DrawerLayout$DrawerLayoutCompatImpl;
        //   572: return         
        //   573: aload           6
        //   575: iload           8
        //   577: caload         
        //   578: istore          9
        //   580: iload           8
        //   582: iconst_5       
        //   583: irem           
        //   584: tableswitch {
        //                0: 637
        //                1: 644
        //                2: 651
        //                3: 658
        //          default: 616
        //        }
        //   616: bipush          41
        //   618: istore          10
        //   620: aload           6
        //   622: iload           8
        //   624: iload           10
        //   626: iload           9
        //   628: ixor           
        //   629: i2c            
        //   630: castore        
        //   631: iinc            8, 1
        //   634: goto            33
        //   637: bipush          6
        //   639: istore          10
        //   641: goto            620
        //   644: bipush          106
        //   646: istore          10
        //   648: goto            620
        //   651: bipush          116
        //   653: istore          10
        //   655: goto            620
        //   658: bipush          46
        //   660: istore          10
        //   662: goto            620
        //   665: astore          12
        //   667: aload           12
        //   669: athrow         
        //   670: iconst_0       
        //   671: istore_0       
        //   672: goto            550
        //   675: astore          14
        //   677: aload           14
        //   679: athrow         
        //   680: new             Landroid/support/v4/widget/DrawerLayout$DrawerLayoutCompatImplBase;
        //   683: dup            
        //   684: invokespecial   android/support/v4/widget/DrawerLayout$DrawerLayoutCompatImplBase.<init>:()V
        //   687: putstatic       android/support/v4/widget/DrawerLayout.IMPL:Landroid/support/v4/widget/DrawerLayout$DrawerLayoutCompatImpl;
        //   690: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  527    543    665    670    Ljava/lang/IllegalArgumentException;
        //  562    572    675    680    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0573:
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
    
    public DrawerLayout(final Context context) {
        this(context, null);
    }
    
    public DrawerLayout(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public DrawerLayout(final Context p0, final AttributeSet p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //     3: istore          4
        //     5: aload_0        
        //     6: aload_1        
        //     7: aload_2        
        //     8: iload_3        
        //     9: invokespecial   android/view/ViewGroup.<init>:(Landroid/content/Context;Landroid/util/AttributeSet;I)V
        //    12: aload_0        
        //    13: new             Landroid/support/v4/widget/DrawerLayout$ChildAccessibilityDelegate;
        //    16: dup            
        //    17: aload_0        
        //    18: invokespecial   android/support/v4/widget/DrawerLayout$ChildAccessibilityDelegate.<init>:(Landroid/support/v4/widget/DrawerLayout;)V
        //    21: putfield        android/support/v4/widget/DrawerLayout.mChildAccessibilityDelegate:Landroid/support/v4/widget/DrawerLayout$ChildAccessibilityDelegate;
        //    24: aload_0        
        //    25: ldc             -1728053248
        //    27: putfield        android/support/v4/widget/DrawerLayout.mScrimColor:I
        //    30: aload_0        
        //    31: new             Landroid/graphics/Paint;
        //    34: dup            
        //    35: invokespecial   android/graphics/Paint.<init>:()V
        //    38: putfield        android/support/v4/widget/DrawerLayout.mScrimPaint:Landroid/graphics/Paint;
        //    41: aload_0        
        //    42: iconst_1       
        //    43: putfield        android/support/v4/widget/DrawerLayout.mFirstLayout:Z
        //    46: aload_0        
        //    47: ldc             262144
        //    49: invokevirtual   android/support/v4/widget/DrawerLayout.setDescendantFocusability:(I)V
        //    52: aload_0        
        //    53: invokevirtual   android/support/v4/widget/DrawerLayout.getResources:()Landroid/content/res/Resources;
        //    56: invokevirtual   android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
        //    59: getfield        android/util/DisplayMetrics.density:F
        //    62: fstore          5
        //    64: aload_0        
        //    65: ldc             0.5
        //    67: ldc             64.0
        //    69: fload           5
        //    71: fmul           
        //    72: fadd           
        //    73: f2i            
        //    74: putfield        android/support/v4/widget/DrawerLayout.mMinDrawerMargin:I
        //    77: fload           5
        //    79: ldc             400.0
        //    81: fmul           
        //    82: fstore          6
        //    84: aload_0        
        //    85: new             Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
        //    88: dup            
        //    89: aload_0        
        //    90: iconst_3       
        //    91: invokespecial   android/support/v4/widget/DrawerLayout$ViewDragCallback.<init>:(Landroid/support/v4/widget/DrawerLayout;I)V
        //    94: putfield        android/support/v4/widget/DrawerLayout.mLeftCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
        //    97: aload_0        
        //    98: new             Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
        //   101: dup            
        //   102: aload_0        
        //   103: iconst_5       
        //   104: invokespecial   android/support/v4/widget/DrawerLayout$ViewDragCallback.<init>:(Landroid/support/v4/widget/DrawerLayout;I)V
        //   107: putfield        android/support/v4/widget/DrawerLayout.mRightCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
        //   110: aload_0        
        //   111: aload_0        
        //   112: fconst_1       
        //   113: aload_0        
        //   114: getfield        android/support/v4/widget/DrawerLayout.mLeftCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
        //   117: invokestatic    android/support/v4/widget/ViewDragHelper.create:(Landroid/view/ViewGroup;FLandroid/support/v4/widget/ViewDragHelper$Callback;)Landroid/support/v4/widget/ViewDragHelper;
        //   120: putfield        android/support/v4/widget/DrawerLayout.mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
        //   123: aload_0        
        //   124: getfield        android/support/v4/widget/DrawerLayout.mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
        //   127: iconst_1       
        //   128: invokevirtual   android/support/v4/widget/ViewDragHelper.setEdgeTrackingEnabled:(I)V
        //   131: aload_0        
        //   132: getfield        android/support/v4/widget/DrawerLayout.mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
        //   135: fload           6
        //   137: invokevirtual   android/support/v4/widget/ViewDragHelper.setMinVelocity:(F)V
        //   140: aload_0        
        //   141: getfield        android/support/v4/widget/DrawerLayout.mLeftCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
        //   144: aload_0        
        //   145: getfield        android/support/v4/widget/DrawerLayout.mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
        //   148: invokevirtual   android/support/v4/widget/DrawerLayout$ViewDragCallback.setDragger:(Landroid/support/v4/widget/ViewDragHelper;)V
        //   151: aload_0        
        //   152: aload_0        
        //   153: fconst_1       
        //   154: aload_0        
        //   155: getfield        android/support/v4/widget/DrawerLayout.mRightCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
        //   158: invokestatic    android/support/v4/widget/ViewDragHelper.create:(Landroid/view/ViewGroup;FLandroid/support/v4/widget/ViewDragHelper$Callback;)Landroid/support/v4/widget/ViewDragHelper;
        //   161: putfield        android/support/v4/widget/DrawerLayout.mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
        //   164: aload_0        
        //   165: getfield        android/support/v4/widget/DrawerLayout.mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
        //   168: iconst_2       
        //   169: invokevirtual   android/support/v4/widget/ViewDragHelper.setEdgeTrackingEnabled:(I)V
        //   172: aload_0        
        //   173: getfield        android/support/v4/widget/DrawerLayout.mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
        //   176: fload           6
        //   178: invokevirtual   android/support/v4/widget/ViewDragHelper.setMinVelocity:(F)V
        //   181: aload_0        
        //   182: getfield        android/support/v4/widget/DrawerLayout.mRightCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
        //   185: aload_0        
        //   186: getfield        android/support/v4/widget/DrawerLayout.mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
        //   189: invokevirtual   android/support/v4/widget/DrawerLayout$ViewDragCallback.setDragger:(Landroid/support/v4/widget/ViewDragHelper;)V
        //   192: aload_0        
        //   193: iconst_1       
        //   194: invokevirtual   android/support/v4/widget/DrawerLayout.setFocusableInTouchMode:(Z)V
        //   197: aload_0        
        //   198: iconst_1       
        //   199: invokestatic    android/support/v4/view/ViewCompat.setImportantForAccessibility:(Landroid/view/View;I)V
        //   202: aload_0        
        //   203: new             Landroid/support/v4/widget/DrawerLayout$AccessibilityDelegate;
        //   206: dup            
        //   207: aload_0        
        //   208: invokespecial   android/support/v4/widget/DrawerLayout$AccessibilityDelegate.<init>:(Landroid/support/v4/widget/DrawerLayout;)V
        //   211: invokestatic    android/support/v4/view/ViewCompat.setAccessibilityDelegate:(Landroid/view/View;Landroid/support/v4/view/AccessibilityDelegateCompat;)V
        //   214: aload_0        
        //   215: iconst_0       
        //   216: invokestatic    android/support/v4/view/ViewGroupCompat.setMotionEventSplittingEnabled:(Landroid/view/ViewGroup;Z)V
        //   219: aload_0        
        //   220: invokestatic    android/support/v4/view/ViewCompat.getFitsSystemWindows:(Landroid/view/View;)Z
        //   223: ifeq            248
        //   226: getstatic       android/support/v4/widget/DrawerLayout.IMPL:Landroid/support/v4/widget/DrawerLayout$DrawerLayoutCompatImpl;
        //   229: aload_0        
        //   230: invokeinterface android/support/v4/widget/DrawerLayout$DrawerLayoutCompatImpl.configureApplyInsets:(Landroid/view/View;)V
        //   235: aload_0        
        //   236: getstatic       android/support/v4/widget/DrawerLayout.IMPL:Landroid/support/v4/widget/DrawerLayout$DrawerLayoutCompatImpl;
        //   239: aload_1        
        //   240: invokeinterface android/support/v4/widget/DrawerLayout$DrawerLayoutCompatImpl.getDefaultStatusBarBackground:(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
        //   245: putfield        android/support/v4/widget/DrawerLayout.mStatusBarBackground:Landroid/graphics/drawable/Drawable;
        //   248: getstatic       android/support/v4/app/FragmentActivity.a:I
        //   251: istore          10
        //   253: iload           10
        //   255: ifeq            271
        //   258: iconst_0       
        //   259: istore          11
        //   261: iload           4
        //   263: ifeq            287
        //   266: iload           11
        //   268: putstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //   271: return         
        //   272: astore          7
        //   274: aload           7
        //   276: athrow         
        //   277: astore          8
        //   279: aload           8
        //   281: athrow         
        //   282: astore          9
        //   284: aload           9
        //   286: athrow         
        //   287: iconst_1       
        //   288: istore          11
        //   290: goto            266
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  84     248    272    277    Ljava/lang/IllegalArgumentException;
        //  248    253    277    287    Ljava/lang/IllegalArgumentException;
        //  279    282    282    287    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0248:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:692)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:529)
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
    
    static int[] access$100() {
        return DrawerLayout.LAYOUT_ATTRS;
    }
    
    static boolean access$200() {
        return DrawerLayout.CAN_HIDE_DESCENDANTS;
    }
    
    static View access$300(final DrawerLayout drawerLayout) {
        return drawerLayout.findVisibleDrawer();
    }
    
    static boolean access$400(final View view) {
        return includeChildForAccessibility(view);
    }
    
    private View findVisibleDrawer() {
        final boolean a = SlidingPaneLayout.a;
        int n;
        for (int childCount = this.getChildCount(), i = 0; i < childCount; i = n) {
            final View child = this.getChildAt(i);
            Label_0058: {
                try {
                    if (!this.isDrawerView(child)) {
                        break Label_0058;
                    }
                    final DrawerLayout drawerLayout = this;
                    final View view = child;
                    final boolean b = drawerLayout.isDrawerVisible(view);
                    if (b) {
                        return child;
                    }
                    break Label_0058;
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                try {
                    final DrawerLayout drawerLayout = this;
                    final View view = child;
                    final boolean b = drawerLayout.isDrawerVisible(view);
                    if (b) {
                        return child;
                    }
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
            }
            n = i + 1;
            if (a) {
                break;
            }
        }
        return null;
    }
    
    static String gravityToString(final int n) {
        if ((n & 0x3) == 0x3) {
            try {
                return DrawerLayout.z[17];
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        if ((n & 0x5) == 0x5) {
            try {
                return DrawerLayout.z[16];
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        return Integer.toHexString(n);
    }
    
    private static boolean hasOpaqueBackground(final View view) {
        final Drawable background = view.getBackground();
        boolean b = false;
        if (background == null) {
            return b;
        }
        try {
            final int opacity = background.getOpacity();
            b = false;
            if (opacity == -1) {
                b = true;
            }
            return b;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    private boolean hasPeekingDrawer() {
        final boolean a = SlidingPaneLayout.a;
        int n;
        for (int childCount = this.getChildCount(), i = 0; i < childCount; i = n) {
            final DrawerLayout$LayoutParams drawerLayout$LayoutParams = (DrawerLayout$LayoutParams)this.getChildAt(i).getLayoutParams();
            try {
                if (drawerLayout$LayoutParams.isPeeking) {
                    return true;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            n = i + 1;
            if (a) {
                break;
            }
        }
        return false;
    }
    
    private boolean hasVisibleDrawer() {
        try {
            if (this.findVisibleDrawer() != null) {
                return true;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return false;
    }
    
    private static boolean includeChildForAccessibility(final View view) {
        try {
            if (ViewCompat.getImportantForAccessibility(view) == 4) {
                return false;
            }
            final View view2 = view;
            final int n = ViewCompat.getImportantForAccessibility(view2);
            final int n2 = 2;
            if (n != n2) {
                return true;
            }
            return false;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            final View view2 = view;
            final int n = ViewCompat.getImportantForAccessibility(view2);
            final int n2 = 2;
            if (n != n2) {
                return true;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        return false;
    }
    
    private void updateChildrenImportantForAccessibility(final View p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokevirtual   android/support/v4/widget/DrawerLayout.getChildCount:()I
        //     8: istore          4
        //    10: iconst_0       
        //    11: istore          5
        //    13: iload           5
        //    15: iload           4
        //    17: if_icmpge       78
        //    20: aload_0        
        //    21: iload           5
        //    23: invokevirtual   android/support/v4/widget/DrawerLayout.getChildAt:(I)Landroid/view/View;
        //    26: astore          6
        //    28: iload_2        
        //    29: ifne            45
        //    32: aload_0        
        //    33: aload           6
        //    35: invokevirtual   android/support/v4/widget/DrawerLayout.isDrawerView:(Landroid/view/View;)Z
        //    38: istore          11
        //    40: iload           11
        //    42: ifeq            55
        //    45: iload_2        
        //    46: ifeq            65
        //    49: aload           6
        //    51: aload_1        
        //    52: if_acmpne       65
        //    55: aload           6
        //    57: iconst_1       
        //    58: invokestatic    android/support/v4/view/ViewCompat.setImportantForAccessibility:(Landroid/view/View;I)V
        //    61: iload_3        
        //    62: ifeq            71
        //    65: aload           6
        //    67: iconst_4       
        //    68: invokestatic    android/support/v4/view/ViewCompat.setImportantForAccessibility:(Landroid/view/View;I)V
        //    71: iinc            5, 1
        //    74: iload_3        
        //    75: ifeq            13
        //    78: return         
        //    79: astore          8
        //    81: aload           8
        //    83: athrow         
        //    84: astore          9
        //    86: aload           9
        //    88: athrow         
        //    89: astore          10
        //    91: aload           10
        //    93: athrow         
        //    94: astore          7
        //    96: aload           7
        //    98: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  32     40     79     94     Ljava/lang/IllegalArgumentException;
        //  55     61     94     99     Ljava/lang/IllegalArgumentException;
        //  65     71     94     99     Ljava/lang/IllegalArgumentException;
        //  81     84     84     94     Ljava/lang/IllegalArgumentException;
        //  86     89     89     94     Ljava/lang/IllegalArgumentException;
        //  91     94     94     99     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0055:
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
    
    public void addView(final View p0, final int p1, final ViewGroup$LayoutParams p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: iload_2        
        //     3: aload_3        
        //     4: invokespecial   android/view/ViewGroup.addView:(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
        //     7: aload_0        
        //     8: invokevirtual   android/support/v4/widget/DrawerLayout.findOpenDrawer:()Landroid/view/View;
        //    11: ifnonnull       26
        //    14: aload_0        
        //    15: aload_1        
        //    16: invokevirtual   android/support/v4/widget/DrawerLayout.isDrawerView:(Landroid/view/View;)Z
        //    19: istore          7
        //    21: iload           7
        //    23: ifeq            37
        //    26: aload_1        
        //    27: iconst_4       
        //    28: invokestatic    android/support/v4/view/ViewCompat.setImportantForAccessibility:(Landroid/view/View;I)V
        //    31: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //    34: ifeq            42
        //    37: aload_1        
        //    38: iconst_1       
        //    39: invokestatic    android/support/v4/view/ViewCompat.setImportantForAccessibility:(Landroid/view/View;I)V
        //    42: getstatic       android/support/v4/widget/DrawerLayout.CAN_HIDE_DESCENDANTS:Z
        //    45: ifne            56
        //    48: aload_1        
        //    49: aload_0        
        //    50: getfield        android/support/v4/widget/DrawerLayout.mChildAccessibilityDelegate:Landroid/support/v4/widget/DrawerLayout$ChildAccessibilityDelegate;
        //    53: invokestatic    android/support/v4/view/ViewCompat.setAccessibilityDelegate:(Landroid/view/View;Landroid/support/v4/view/AccessibilityDelegateCompat;)V
        //    56: return         
        //    57: astore          6
        //    59: aload           6
        //    61: athrow         
        //    62: astore          4
        //    64: aload           4
        //    66: athrow         
        //    67: astore          5
        //    69: aload           5
        //    71: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  14     21     57     62     Ljava/lang/IllegalArgumentException;
        //  26     37     62     67     Ljava/lang/IllegalArgumentException;
        //  37     42     62     67     Ljava/lang/IllegalArgumentException;
        //  42     56     67     72     Ljava/lang/IllegalArgumentException;
        //  59     62     62     67     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 38, Size: 38
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
    
    void cancelChildViewTouch() {
        int i = 0;
        final boolean a = SlidingPaneLayout.a;
        if (!this.mChildrenCanceledTouch) {
            final long uptimeMillis = SystemClock.uptimeMillis();
            final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            while (i < this.getChildCount()) {
                this.getChildAt(i).dispatchTouchEvent(obtain);
                ++i;
                if (a) {
                    break;
                }
            }
            obtain.recycle();
            this.mChildrenCanceledTouch = true;
        }
    }
    
    boolean checkDrawerViewAbsoluteGravity(final View view, final int n) {
        return (n & this.getDrawerViewAbsoluteGravity(view)) == n;
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        try {
            if (!(viewGroup$LayoutParams instanceof DrawerLayout$LayoutParams)) {
                return false;
            }
            final DrawerLayout drawerLayout = this;
            final ViewGroup$LayoutParams viewGroup$LayoutParams2 = viewGroup$LayoutParams;
            final boolean b = drawerLayout.checkLayoutParams(viewGroup$LayoutParams2);
            if (b) {
                return true;
            }
            return false;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            final DrawerLayout drawerLayout = this;
            final ViewGroup$LayoutParams viewGroup$LayoutParams2 = viewGroup$LayoutParams;
            final boolean b = drawerLayout.checkLayoutParams(viewGroup$LayoutParams2);
            if (b) {
                return true;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        return false;
    }
    
    public void closeDrawer(final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: aload_1        
        //     6: invokevirtual   android/support/v4/widget/DrawerLayout.isDrawerView:(Landroid/view/View;)Z
        //     9: ifne            53
        //    12: new             Ljava/lang/IllegalArgumentException;
        //    15: dup            
        //    16: new             Ljava/lang/StringBuilder;
        //    19: dup            
        //    20: invokespecial   java/lang/StringBuilder.<init>:()V
        //    23: getstatic       android/support/v4/widget/DrawerLayout.z:[Ljava/lang/String;
        //    26: iconst_0       
        //    27: aaload         
        //    28: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    31: aload_1        
        //    32: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    35: getstatic       android/support/v4/widget/DrawerLayout.z:[Ljava/lang/String;
        //    38: iconst_1       
        //    39: aaload         
        //    40: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    43: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    46: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    49: athrow         
        //    50: astore_3       
        //    51: aload_3        
        //    52: athrow         
        //    53: aload_0        
        //    54: getfield        android/support/v4/widget/DrawerLayout.mFirstLayout:Z
        //    57: ifeq            85
        //    60: aload_1        
        //    61: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //    64: checkcast       Landroid/support/v4/widget/DrawerLayout$LayoutParams;
        //    67: astore          9
        //    69: aload           9
        //    71: fconst_0       
        //    72: putfield        android/support/v4/widget/DrawerLayout$LayoutParams.onScreen:F
        //    75: aload           9
        //    77: iconst_0       
        //    78: putfield        android/support/v4/widget/DrawerLayout$LayoutParams.knownOpen:Z
        //    81: iload_2        
        //    82: ifeq            137
        //    85: aload_0        
        //    86: aload_1        
        //    87: iconst_3       
        //    88: invokevirtual   android/support/v4/widget/DrawerLayout.checkDrawerViewAbsoluteGravity:(Landroid/view/View;I)Z
        //    91: istore          6
        //    93: iload           6
        //    95: ifeq            120
        //    98: aload_0        
        //    99: getfield        android/support/v4/widget/DrawerLayout.mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
        //   102: aload_1        
        //   103: aload_1        
        //   104: invokevirtual   android/view/View.getWidth:()I
        //   107: ineg           
        //   108: aload_1        
        //   109: invokevirtual   android/view/View.getTop:()I
        //   112: invokevirtual   android/support/v4/widget/ViewDragHelper.smoothSlideViewTo:(Landroid/view/View;II)Z
        //   115: pop            
        //   116: iload_2        
        //   117: ifeq            137
        //   120: aload_0        
        //   121: getfield        android/support/v4/widget/DrawerLayout.mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
        //   124: aload_1        
        //   125: aload_0        
        //   126: invokevirtual   android/support/v4/widget/DrawerLayout.getWidth:()I
        //   129: aload_1        
        //   130: invokevirtual   android/view/View.getTop:()I
        //   133: invokevirtual   android/support/v4/widget/ViewDragHelper.smoothSlideViewTo:(Landroid/view/View;II)Z
        //   136: pop            
        //   137: aload_0        
        //   138: invokevirtual   android/support/v4/widget/DrawerLayout.invalidate:()V
        //   141: return         
        //   142: astore          10
        //   144: aload           10
        //   146: athrow         
        //   147: astore          4
        //   149: aload           4
        //   151: athrow         
        //   152: astore          5
        //   154: aload           5
        //   156: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      50     50     53     Ljava/lang/IllegalArgumentException;
        //  69     81     142    147    Ljava/lang/IllegalArgumentException;
        //  85     93     147    152    Ljava/lang/IllegalArgumentException;
        //  98     116    152    157    Ljava/lang/IllegalArgumentException;
        //  120    137    152    157    Ljava/lang/IllegalArgumentException;
        //  144    147    147    152    Ljava/lang/IllegalArgumentException;
        //  149    152    152    157    Ljava/lang/IllegalArgumentException;
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
    
    public void closeDrawers() {
        this.closeDrawers(false);
    }
    
    void closeDrawers(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: aload_0        
        //     5: invokevirtual   android/support/v4/widget/DrawerLayout.getChildCount:()I
        //     8: istore_3       
        //     9: iconst_0       
        //    10: istore          4
        //    12: iconst_0       
        //    13: istore          5
        //    15: iload           4
        //    17: iload_3        
        //    18: if_icmpge       154
        //    21: aload_0        
        //    22: iload           4
        //    24: invokevirtual   android/support/v4/widget/DrawerLayout.getChildAt:(I)Landroid/view/View;
        //    27: astore          7
        //    29: aload           7
        //    31: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //    34: checkcast       Landroid/support/v4/widget/DrawerLayout$LayoutParams;
        //    37: astore          8
        //    39: aload_0        
        //    40: aload           7
        //    42: invokevirtual   android/support/v4/widget/DrawerLayout.isDrawerView:(Landroid/view/View;)Z
        //    45: istore          12
        //    47: iload           12
        //    49: ifeq            144
        //    52: iload_1        
        //    53: ifeq            72
        //    56: aload           8
        //    58: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.isPeeking:Z
        //    61: istore          15
        //    63: iload           15
        //    65: ifne            72
        //    68: iload_2        
        //    69: ifeq            144
        //    72: aload           7
        //    74: invokevirtual   android/view/View.getWidth:()I
        //    77: istore          14
        //    79: aload_0        
        //    80: aload           7
        //    82: iconst_3       
        //    83: invokevirtual   android/support/v4/widget/DrawerLayout.checkDrawerViewAbsoluteGravity:(Landroid/view/View;I)Z
        //    86: ifeq            115
        //    89: iload           5
        //    91: aload_0        
        //    92: getfield        android/support/v4/widget/DrawerLayout.mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
        //    95: aload           7
        //    97: iload           14
        //    99: ineg           
        //   100: aload           7
        //   102: invokevirtual   android/view/View.getTop:()I
        //   105: invokevirtual   android/support/v4/widget/ViewDragHelper.smoothSlideViewTo:(Landroid/view/View;II)Z
        //   108: ior            
        //   109: istore          5
        //   111: iload_2        
        //   112: ifeq            138
        //   115: iload           5
        //   117: aload_0        
        //   118: getfield        android/support/v4/widget/DrawerLayout.mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
        //   121: aload           7
        //   123: aload_0        
        //   124: invokevirtual   android/support/v4/widget/DrawerLayout.getWidth:()I
        //   127: aload           7
        //   129: invokevirtual   android/view/View.getTop:()I
        //   132: invokevirtual   android/support/v4/widget/ViewDragHelper.smoothSlideViewTo:(Landroid/view/View;II)Z
        //   135: ior            
        //   136: istore          5
        //   138: aload           8
        //   140: iconst_0       
        //   141: putfield        android/support/v4/widget/DrawerLayout$LayoutParams.isPeeking:Z
        //   144: iload           4
        //   146: iconst_1       
        //   147: iadd           
        //   148: istore          13
        //   150: iload_2        
        //   151: ifeq            198
        //   154: aload_0        
        //   155: getfield        android/support/v4/widget/DrawerLayout.mLeftCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
        //   158: invokevirtual   android/support/v4/widget/DrawerLayout$ViewDragCallback.removeCallbacks:()V
        //   161: aload_0        
        //   162: getfield        android/support/v4/widget/DrawerLayout.mRightCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
        //   165: invokevirtual   android/support/v4/widget/DrawerLayout$ViewDragCallback.removeCallbacks:()V
        //   168: iload           5
        //   170: ifeq            177
        //   173: aload_0        
        //   174: invokevirtual   android/support/v4/widget/DrawerLayout.invalidate:()V
        //   177: return         
        //   178: astore          9
        //   180: aload           9
        //   182: athrow         
        //   183: astore          10
        //   185: aload           10
        //   187: athrow         
        //   188: astore          11
        //   190: aload           11
        //   192: athrow         
        //   193: astore          6
        //   195: aload           6
        //   197: athrow         
        //   198: iload           13
        //   200: istore          4
        //   202: goto            15
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  39     47     178    188    Ljava/lang/IllegalArgumentException;
        //  56     63     188    193    Ljava/lang/IllegalArgumentException;
        //  154    168    193    198    Ljava/lang/IllegalArgumentException;
        //  173    177    193    198    Ljava/lang/IllegalArgumentException;
        //  180    183    183    188    Ljava/lang/IllegalArgumentException;
        //  185    188    188    193    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 102, Size: 102
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
    
    public void computeScroll() {
        final boolean a = SlidingPaneLayout.a;
        final int childCount = this.getChildCount();
        float n = 0.0f;
        int n2 = 0;
        while (true) {
            float max = 0.0f;
            final int n3;
            Label_0087: {
                if (n2 < childCount) {
                    max = Math.max(n, ((DrawerLayout$LayoutParams)this.getChildAt(n2).getLayoutParams()).onScreen);
                    n3 = n2 + 1;
                    if (!a) {
                        break Label_0087;
                    }
                }
                else {
                    max = n;
                }
                try {
                    this.mScrimOpacity = max;
                    if (this.mLeftDragger.continueSettling(true) | this.mRightDragger.continueSettling(true)) {
                        ViewCompat.postInvalidateOnAnimation((View)this);
                    }
                    return;
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
            n2 = n3;
            n = max;
        }
    }
    
    void dispatchOnDrawerClosed(final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //     4: checkcast       Landroid/support/v4/widget/DrawerLayout$LayoutParams;
        //     7: astore_2       
        //     8: aload_2        
        //     9: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.knownOpen:Z
        //    12: istore          5
        //    14: iload           5
        //    16: ifeq            72
        //    19: aload_2        
        //    20: iconst_0       
        //    21: putfield        android/support/v4/widget/DrawerLayout$LayoutParams.knownOpen:Z
        //    24: aload_0        
        //    25: getfield        android/support/v4/widget/DrawerLayout.mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
        //    28: ifnull          41
        //    31: aload_0        
        //    32: getfield        android/support/v4/widget/DrawerLayout.mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
        //    35: aload_1        
        //    36: invokeinterface android/support/v4/widget/DrawerLayout$DrawerListener.onDrawerClosed:(Landroid/view/View;)V
        //    41: aload_0        
        //    42: aload_1        
        //    43: iconst_0       
        //    44: invokespecial   android/support/v4/widget/DrawerLayout.updateChildrenImportantForAccessibility:(Landroid/view/View;Z)V
        //    47: aload_0        
        //    48: invokevirtual   android/support/v4/widget/DrawerLayout.hasWindowFocus:()Z
        //    51: ifeq            72
        //    54: aload_0        
        //    55: invokevirtual   android/support/v4/widget/DrawerLayout.getRootView:()Landroid/view/View;
        //    58: astore          6
        //    60: aload           6
        //    62: ifnull          72
        //    65: aload           6
        //    67: bipush          32
        //    69: invokevirtual   android/view/View.sendAccessibilityEvent:(I)V
        //    72: return         
        //    73: astore_3       
        //    74: aload_3        
        //    75: athrow         
        //    76: astore          4
        //    78: aload           4
        //    80: athrow         
        //    81: astore          7
        //    83: aload           7
        //    85: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  8      14     73     76     Ljava/lang/IllegalArgumentException;
        //  19     41     76     81     Ljava/lang/IllegalArgumentException;
        //  65     72     81     86     Ljava/lang/IllegalArgumentException;
        //  74     76     76     81     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 44, Size: 44
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
    
    void dispatchOnDrawerOpened(final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //     4: checkcast       Landroid/support/v4/widget/DrawerLayout$LayoutParams;
        //     7: astore_2       
        //     8: aload_2        
        //     9: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.knownOpen:Z
        //    12: istore          5
        //    14: iload           5
        //    16: ifne            65
        //    19: aload_2        
        //    20: iconst_1       
        //    21: putfield        android/support/v4/widget/DrawerLayout$LayoutParams.knownOpen:Z
        //    24: aload_0        
        //    25: getfield        android/support/v4/widget/DrawerLayout.mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
        //    28: ifnull          41
        //    31: aload_0        
        //    32: getfield        android/support/v4/widget/DrawerLayout.mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
        //    35: aload_1        
        //    36: invokeinterface android/support/v4/widget/DrawerLayout$DrawerListener.onDrawerOpened:(Landroid/view/View;)V
        //    41: aload_0        
        //    42: aload_1        
        //    43: iconst_1       
        //    44: invokespecial   android/support/v4/widget/DrawerLayout.updateChildrenImportantForAccessibility:(Landroid/view/View;Z)V
        //    47: aload_0        
        //    48: invokevirtual   android/support/v4/widget/DrawerLayout.hasWindowFocus:()Z
        //    51: ifeq            60
        //    54: aload_0        
        //    55: bipush          32
        //    57: invokevirtual   android/support/v4/widget/DrawerLayout.sendAccessibilityEvent:(I)V
        //    60: aload_1        
        //    61: invokevirtual   android/view/View.requestFocus:()Z
        //    64: pop            
        //    65: return         
        //    66: astore_3       
        //    67: aload_3        
        //    68: athrow         
        //    69: astore          4
        //    71: aload           4
        //    73: athrow         
        //    74: astore          6
        //    76: aload           6
        //    78: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  8      14     66     69     Ljava/lang/IllegalArgumentException;
        //  19     41     69     74     Ljava/lang/IllegalArgumentException;
        //  41     60     74     79     Ljava/lang/IllegalArgumentException;
        //  67     69     69     74     Ljava/lang/IllegalArgumentException;
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
    
    void dispatchOnDrawerSlide(final View view, final float n) {
        try {
            if (this.mListener != null) {
                this.mListener.onDrawerSlide(view, n);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    protected boolean drawChild(final Canvas p0, final View p1, final long p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //     3: istore          5
        //     5: aload_0        
        //     6: invokevirtual   android/support/v4/widget/DrawerLayout.getHeight:()I
        //     9: istore          6
        //    11: aload_0        
        //    12: aload_2        
        //    13: invokevirtual   android/support/v4/widget/DrawerLayout.isContentView:(Landroid/view/View;)Z
        //    16: istore          7
        //    18: aload_0        
        //    19: invokevirtual   android/support/v4/widget/DrawerLayout.getWidth:()I
        //    22: istore          8
        //    24: aload_1        
        //    25: invokevirtual   android/graphics/Canvas.save:()I
        //    28: istore          9
        //    30: iconst_0       
        //    31: istore          10
        //    33: iload           7
        //    35: ifeq            219
        //    38: aload_0        
        //    39: invokevirtual   android/support/v4/widget/DrawerLayout.getChildCount:()I
        //    42: istore          30
        //    44: iconst_0       
        //    45: istore          31
        //    47: iload           8
        //    49: istore          32
        //    51: iconst_0       
        //    52: istore          33
        //    54: iload           32
        //    56: istore          34
        //    58: iload           31
        //    60: iload           30
        //    62: if_icmpge       629
        //    65: aload_0        
        //    66: iload           31
        //    68: invokevirtual   android/support/v4/widget/DrawerLayout.getChildAt:(I)Landroid/view/View;
        //    71: astore          37
        //    73: aload           37
        //    75: aload_2        
        //    76: if_acmpeq       614
        //    79: aload           37
        //    81: invokevirtual   android/view/View.getVisibility:()I
        //    84: istore          46
        //    86: iload           46
        //    88: ifne            614
        //    91: aload           37
        //    93: invokestatic    android/support/v4/widget/DrawerLayout.hasOpaqueBackground:(Landroid/view/View;)Z
        //    96: istore          47
        //    98: iload           47
        //   100: ifeq            614
        //   103: aload_0        
        //   104: aload           37
        //   106: invokevirtual   android/support/v4/widget/DrawerLayout.isDrawerView:(Landroid/view/View;)Z
        //   109: istore          48
        //   111: iload           48
        //   113: ifeq            614
        //   116: aload           37
        //   118: invokevirtual   android/view/View.getHeight:()I
        //   121: istore          49
        //   123: iload           49
        //   125: iload           6
        //   127: if_icmpge       135
        //   130: iload           5
        //   132: ifeq            614
        //   135: aload_0        
        //   136: aload           37
        //   138: iconst_3       
        //   139: invokevirtual   android/support/v4/widget/DrawerLayout.checkDrawerViewAbsoluteGravity:(Landroid/view/View;I)Z
        //   142: istore          50
        //   144: iload           50
        //   146: ifeq            172
        //   149: aload           37
        //   151: invokevirtual   android/view/View.getRight:()I
        //   154: istore          52
        //   156: iload           52
        //   158: iload           33
        //   160: if_icmple       167
        //   163: iload           52
        //   165: istore          33
        //   167: iload           5
        //   169: ifeq            614
        //   172: aload           37
        //   174: invokevirtual   android/view/View.getLeft:()I
        //   177: istore          51
        //   179: iload           51
        //   181: iload           34
        //   183: if_icmpge       614
        //   186: iload           33
        //   188: istore          10
        //   190: iload           51
        //   192: istore          8
        //   194: iload           31
        //   196: iconst_1       
        //   197: iadd           
        //   198: istore          39
        //   200: iload           5
        //   202: ifeq            595
        //   205: aload_1        
        //   206: iload           10
        //   208: iconst_0       
        //   209: iload           8
        //   211: aload_0        
        //   212: invokevirtual   android/support/v4/widget/DrawerLayout.getHeight:()I
        //   215: invokevirtual   android/graphics/Canvas.clipRect:(IIII)Z
        //   218: pop            
        //   219: aload_0        
        //   220: aload_1        
        //   221: aload_2        
        //   222: lload_3        
        //   223: invokespecial   android/view/ViewGroup.drawChild:(Landroid/graphics/Canvas;Landroid/view/View;J)Z
        //   226: istore          11
        //   228: aload_1        
        //   229: iload           9
        //   231: invokevirtual   android/graphics/Canvas.restoreToCount:(I)V
        //   234: aload_0        
        //   235: getfield        android/support/v4/widget/DrawerLayout.mScrimOpacity:F
        //   238: fstore          13
        //   240: fload           13
        //   242: fconst_0       
        //   243: fcmpl          
        //   244: ifle            318
        //   247: iload           7
        //   249: ifeq            318
        //   252: ldc_w           -16777216
        //   255: aload_0        
        //   256: getfield        android/support/v4/widget/DrawerLayout.mScrimColor:I
        //   259: iand           
        //   260: bipush          24
        //   262: iushr          
        //   263: i2f            
        //   264: aload_0        
        //   265: getfield        android/support/v4/widget/DrawerLayout.mScrimOpacity:F
        //   268: fmul           
        //   269: f2i            
        //   270: bipush          24
        //   272: ishl           
        //   273: ldc_w           16777215
        //   276: aload_0        
        //   277: getfield        android/support/v4/widget/DrawerLayout.mScrimColor:I
        //   280: iand           
        //   281: ior            
        //   282: istore          28
        //   284: aload_0        
        //   285: getfield        android/support/v4/widget/DrawerLayout.mScrimPaint:Landroid/graphics/Paint;
        //   288: iload           28
        //   290: invokevirtual   android/graphics/Paint.setColor:(I)V
        //   293: aload_1        
        //   294: iload           10
        //   296: i2f            
        //   297: fconst_0       
        //   298: iload           8
        //   300: i2f            
        //   301: aload_0        
        //   302: invokevirtual   android/support/v4/widget/DrawerLayout.getHeight:()I
        //   305: i2f            
        //   306: aload_0        
        //   307: getfield        android/support/v4/widget/DrawerLayout.mScrimPaint:Landroid/graphics/Paint;
        //   310: invokevirtual   android/graphics/Canvas.drawRect:(FFFFLandroid/graphics/Paint;)V
        //   313: iload           5
        //   315: ifeq            542
        //   318: aload_0        
        //   319: getfield        android/support/v4/widget/DrawerLayout.mShadowLeft:Landroid/graphics/drawable/Drawable;
        //   322: ifnull          428
        //   325: aload_0        
        //   326: aload_2        
        //   327: iconst_3       
        //   328: invokevirtual   android/support/v4/widget/DrawerLayout.checkDrawerViewAbsoluteGravity:(Landroid/view/View;I)Z
        //   331: istore          22
        //   333: iload           22
        //   335: ifeq            428
        //   338: aload_0        
        //   339: getfield        android/support/v4/widget/DrawerLayout.mShadowLeft:Landroid/graphics/drawable/Drawable;
        //   342: invokevirtual   android/graphics/drawable/Drawable.getIntrinsicWidth:()I
        //   345: istore          23
        //   347: aload_2        
        //   348: invokevirtual   android/view/View.getRight:()I
        //   351: istore          24
        //   353: aload_0        
        //   354: getfield        android/support/v4/widget/DrawerLayout.mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
        //   357: invokevirtual   android/support/v4/widget/ViewDragHelper.getEdgeSize:()I
        //   360: istore          25
        //   362: fconst_0       
        //   363: iload           24
        //   365: i2f            
        //   366: iload           25
        //   368: i2f            
        //   369: fdiv           
        //   370: fconst_1       
        //   371: invokestatic    java/lang/Math.min:(FF)F
        //   374: invokestatic    java/lang/Math.max:(FF)F
        //   377: fstore          26
        //   379: aload_0        
        //   380: getfield        android/support/v4/widget/DrawerLayout.mShadowLeft:Landroid/graphics/drawable/Drawable;
        //   383: iload           24
        //   385: aload_2        
        //   386: invokevirtual   android/view/View.getTop:()I
        //   389: iload           23
        //   391: iload           24
        //   393: iadd           
        //   394: aload_2        
        //   395: invokevirtual   android/view/View.getBottom:()I
        //   398: invokevirtual   android/graphics/drawable/Drawable.setBounds:(IIII)V
        //   401: aload_0        
        //   402: getfield        android/support/v4/widget/DrawerLayout.mShadowLeft:Landroid/graphics/drawable/Drawable;
        //   405: ldc_w           255.0
        //   408: fload           26
        //   410: fmul           
        //   411: f2i            
        //   412: invokevirtual   android/graphics/drawable/Drawable.setAlpha:(I)V
        //   415: aload_0        
        //   416: getfield        android/support/v4/widget/DrawerLayout.mShadowLeft:Landroid/graphics/drawable/Drawable;
        //   419: aload_1        
        //   420: invokevirtual   android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
        //   423: iload           5
        //   425: ifeq            542
        //   428: aload_0        
        //   429: getfield        android/support/v4/widget/DrawerLayout.mShadowRight:Landroid/graphics/drawable/Drawable;
        //   432: ifnull          542
        //   435: aload_0        
        //   436: aload_2        
        //   437: iconst_5       
        //   438: invokevirtual   android/support/v4/widget/DrawerLayout.checkDrawerViewAbsoluteGravity:(Landroid/view/View;I)Z
        //   441: istore          16
        //   443: iload           16
        //   445: ifeq            542
        //   448: aload_0        
        //   449: getfield        android/support/v4/widget/DrawerLayout.mShadowRight:Landroid/graphics/drawable/Drawable;
        //   452: invokevirtual   android/graphics/drawable/Drawable.getIntrinsicWidth:()I
        //   455: istore          17
        //   457: aload_2        
        //   458: invokevirtual   android/view/View.getLeft:()I
        //   461: istore          18
        //   463: aload_0        
        //   464: invokevirtual   android/support/v4/widget/DrawerLayout.getWidth:()I
        //   467: iload           18
        //   469: isub           
        //   470: istore          19
        //   472: aload_0        
        //   473: getfield        android/support/v4/widget/DrawerLayout.mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
        //   476: invokevirtual   android/support/v4/widget/ViewDragHelper.getEdgeSize:()I
        //   479: istore          20
        //   481: fconst_0       
        //   482: iload           19
        //   484: i2f            
        //   485: iload           20
        //   487: i2f            
        //   488: fdiv           
        //   489: fconst_1       
        //   490: invokestatic    java/lang/Math.min:(FF)F
        //   493: invokestatic    java/lang/Math.max:(FF)F
        //   496: fstore          21
        //   498: aload_0        
        //   499: getfield        android/support/v4/widget/DrawerLayout.mShadowRight:Landroid/graphics/drawable/Drawable;
        //   502: iload           18
        //   504: iload           17
        //   506: isub           
        //   507: aload_2        
        //   508: invokevirtual   android/view/View.getTop:()I
        //   511: iload           18
        //   513: aload_2        
        //   514: invokevirtual   android/view/View.getBottom:()I
        //   517: invokevirtual   android/graphics/drawable/Drawable.setBounds:(IIII)V
        //   520: aload_0        
        //   521: getfield        android/support/v4/widget/DrawerLayout.mShadowRight:Landroid/graphics/drawable/Drawable;
        //   524: ldc_w           255.0
        //   527: fload           21
        //   529: fmul           
        //   530: f2i            
        //   531: invokevirtual   android/graphics/drawable/Drawable.setAlpha:(I)V
        //   534: aload_0        
        //   535: getfield        android/support/v4/widget/DrawerLayout.mShadowRight:Landroid/graphics/drawable/Drawable;
        //   538: aload_1        
        //   539: invokevirtual   android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
        //   542: iload           11
        //   544: ireturn        
        //   545: astore          41
        //   547: aload           41
        //   549: athrow         
        //   550: astore          42
        //   552: aload           42
        //   554: athrow         
        //   555: astore          43
        //   557: aload           43
        //   559: athrow         
        //   560: astore          44
        //   562: aload           44
        //   564: athrow         
        //   565: astore          45
        //   567: aload           45
        //   569: athrow         
        //   570: astore          12
        //   572: aload           12
        //   574: athrow         
        //   575: astore          29
        //   577: aload           29
        //   579: athrow         
        //   580: astore          14
        //   582: aload           14
        //   584: athrow         
        //   585: astore          27
        //   587: aload           27
        //   589: athrow         
        //   590: astore          15
        //   592: aload           15
        //   594: athrow         
        //   595: iload           39
        //   597: istore          31
        //   599: iload           8
        //   601: istore          40
        //   603: iload           10
        //   605: istore          33
        //   607: iload           40
        //   609: istore          34
        //   611: goto            58
        //   614: iload           34
        //   616: istore          38
        //   618: iload           33
        //   620: istore          10
        //   622: iload           38
        //   624: istore          8
        //   626: goto            194
        //   629: iload           34
        //   631: istore          35
        //   633: iload           33
        //   635: istore          10
        //   637: iload           35
        //   639: istore          8
        //   641: goto            205
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  79     86     545    550    Ljava/lang/IllegalArgumentException;
        //  91     98     550    555    Ljava/lang/IllegalArgumentException;
        //  103    111    555    560    Ljava/lang/IllegalArgumentException;
        //  116    123    560    565    Ljava/lang/IllegalArgumentException;
        //  135    144    565    570    Ljava/lang/IllegalArgumentException;
        //  228    240    570    575    Ljava/lang/IllegalArgumentException;
        //  284    313    575    580    Ljava/lang/IllegalArgumentException;
        //  318    333    580    585    Ljava/lang/IllegalArgumentException;
        //  379    423    585    590    Ljava/lang/IllegalArgumentException;
        //  428    443    590    595    Ljava/lang/IllegalArgumentException;
        //  547    550    550    555    Ljava/lang/IllegalArgumentException;
        //  552    555    555    560    Ljava/lang/IllegalArgumentException;
        //  557    560    560    565    Ljava/lang/IllegalArgumentException;
        //  562    565    565    570    Ljava/lang/IllegalArgumentException;
        //  577    580    580    585    Ljava/lang/IllegalArgumentException;
        //  587    590    590    595    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 328, Size: 328
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
    
    View findDrawerWithGravity(final int n) {
        final boolean a = SlidingPaneLayout.a;
        final int n2 = 0x7 & GravityCompat.getAbsoluteGravity(n, ViewCompat.getLayoutDirection((View)this));
        int n3;
        for (int childCount = this.getChildCount(), i = 0; i < childCount; i = n3) {
            final View child = this.getChildAt(i);
            if ((0x7 & this.getDrawerViewAbsoluteGravity(child)) == n2) {
                return child;
            }
            n3 = i + 1;
            if (a) {
                break;
            }
        }
        return null;
    }
    
    View findOpenDrawer() {
        final boolean a = SlidingPaneLayout.a;
        int n;
        for (int childCount = this.getChildCount(), i = 0; i < childCount; i = n) {
            final View child = this.getChildAt(i);
            try {
                if (((DrawerLayout$LayoutParams)child.getLayoutParams()).knownOpen) {
                    return child;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            n = i + 1;
            if (a) {
                break;
            }
        }
        return null;
    }
    
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new DrawerLayout$LayoutParams(-1, -1);
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new DrawerLayout$LayoutParams(this.getContext(), set);
    }
    
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        try {
            if (viewGroup$LayoutParams instanceof DrawerLayout$LayoutParams) {
                return (ViewGroup$LayoutParams)new DrawerLayout$LayoutParams((DrawerLayout$LayoutParams)viewGroup$LayoutParams);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
                return (ViewGroup$LayoutParams)new DrawerLayout$LayoutParams((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        return (ViewGroup$LayoutParams)new DrawerLayout$LayoutParams(viewGroup$LayoutParams);
    }
    
    public int getDrawerLockMode(final View view) {
        final int drawerViewAbsoluteGravity = this.getDrawerViewAbsoluteGravity(view);
        if (drawerViewAbsoluteGravity == 3) {
            try {
                return this.mLockModeLeft;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        if (drawerViewAbsoluteGravity == 5) {
            try {
                return this.mLockModeRight;
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        return 0;
    }
    
    @Nullable
    public CharSequence getDrawerTitle(final int n) {
        final int absoluteGravity = GravityCompat.getAbsoluteGravity(n, ViewCompat.getLayoutDirection((View)this));
        if (absoluteGravity == 3) {
            try {
                return this.mTitleLeft;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        if (absoluteGravity == 5) {
            try {
                return this.mTitleRight;
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        return null;
    }
    
    int getDrawerViewAbsoluteGravity(final View view) {
        return GravityCompat.getAbsoluteGravity(((DrawerLayout$LayoutParams)view.getLayoutParams()).gravity, ViewCompat.getLayoutDirection((View)this));
    }
    
    float getDrawerViewOffset(final View view) {
        return ((DrawerLayout$LayoutParams)view.getLayoutParams()).onScreen;
    }
    
    boolean isContentView(final View view) {
        try {
            if (((DrawerLayout$LayoutParams)view.getLayoutParams()).gravity == 0) {
                return true;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return false;
    }
    
    boolean isDrawerView(final View view) {
        return (0x7 & GravityCompat.getAbsoluteGravity(((DrawerLayout$LayoutParams)view.getLayoutParams()).gravity, ViewCompat.getLayoutDirection(view))) != 0x0;
    }
    
    public boolean isDrawerVisible(final View view) {
        try {
            if (!this.isDrawerView(view)) {
                throw new IllegalArgumentException(DrawerLayout.z[14] + view + DrawerLayout.z[15]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            if (((DrawerLayout$LayoutParams)view.getLayoutParams()).onScreen > 0.0f) {
                return true;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        return false;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mFirstLayout = true;
    }
    
    public void onDraw(final Canvas p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: invokespecial   android/view/ViewGroup.onDraw:(Landroid/graphics/Canvas;)V
        //     5: aload_0        
        //     6: getfield        android/support/v4/widget/DrawerLayout.mDrawStatusBarBackground:Z
        //     9: ifeq            63
        //    12: aload_0        
        //    13: getfield        android/support/v4/widget/DrawerLayout.mStatusBarBackground:Landroid/graphics/drawable/Drawable;
        //    16: astore_3       
        //    17: aload_3        
        //    18: ifnull          63
        //    21: getstatic       android/support/v4/widget/DrawerLayout.IMPL:Landroid/support/v4/widget/DrawerLayout$DrawerLayoutCompatImpl;
        //    24: aload_0        
        //    25: getfield        android/support/v4/widget/DrawerLayout.mLastInsets:Ljava/lang/Object;
        //    28: invokeinterface android/support/v4/widget/DrawerLayout$DrawerLayoutCompatImpl.getTopInset:(Ljava/lang/Object;)I
        //    33: istore          4
        //    35: iload           4
        //    37: ifle            63
        //    40: aload_0        
        //    41: getfield        android/support/v4/widget/DrawerLayout.mStatusBarBackground:Landroid/graphics/drawable/Drawable;
        //    44: iconst_0       
        //    45: iconst_0       
        //    46: aload_0        
        //    47: invokevirtual   android/support/v4/widget/DrawerLayout.getWidth:()I
        //    50: iload           4
        //    52: invokevirtual   android/graphics/drawable/Drawable.setBounds:(IIII)V
        //    55: aload_0        
        //    56: getfield        android/support/v4/widget/DrawerLayout.mStatusBarBackground:Landroid/graphics/drawable/Drawable;
        //    59: aload_1        
        //    60: invokevirtual   android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
        //    63: return         
        //    64: astore_2       
        //    65: aload_2        
        //    66: athrow         
        //    67: astore          5
        //    69: aload           5
        //    71: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      17     64     67     Ljava/lang/IllegalArgumentException;
        //  40     63     67     72     Ljava/lang/IllegalArgumentException;
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
    
    public boolean onInterceptTouchEvent(final MotionEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //     3: istore_2       
        //     4: aload_1        
        //     5: invokestatic    android/support/v4/view/MotionEventCompat.getActionMasked:(Landroid/view/MotionEvent;)I
        //     8: istore_3       
        //     9: aload_0        
        //    10: getfield        android/support/v4/widget/DrawerLayout.mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
        //    13: aload_1        
        //    14: invokevirtual   android/support/v4/widget/ViewDragHelper.shouldInterceptTouchEvent:(Landroid/view/MotionEvent;)Z
        //    17: aload_0        
        //    18: getfield        android/support/v4/widget/DrawerLayout.mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
        //    21: aload_1        
        //    22: invokevirtual   android/support/v4/widget/ViewDragHelper.shouldInterceptTouchEvent:(Landroid/view/MotionEvent;)Z
        //    25: ior            
        //    26: istore          4
        //    28: iload_3        
        //    29: tableswitch {
        //                0: 104
        //                1: 274
        //                2: 280
        //                3: 274
        //          default: 60
        //        }
        //    60: iconst_0       
        //    61: istore          5
        //    63: iload           4
        //    65: ifne            98
        //    68: iload           5
        //    70: ifne            98
        //    73: aload_0        
        //    74: invokespecial   android/support/v4/widget/DrawerLayout.hasPeekingDrawer:()Z
        //    77: istore          12
        //    79: iload           12
        //    81: ifne            98
        //    84: aload_0        
        //    85: getfield        android/support/v4/widget/DrawerLayout.mChildrenCanceledTouch:Z
        //    88: istore          13
        //    90: iconst_0       
        //    91: istore          9
        //    93: iload           13
        //    95: ifeq            101
        //    98: iconst_1       
        //    99: istore          9
        //   101: iload           9
        //   103: ireturn        
        //   104: aload_1        
        //   105: invokevirtual   android/view/MotionEvent.getX:()F
        //   108: fstore          14
        //   110: aload_1        
        //   111: invokevirtual   android/view/MotionEvent.getY:()F
        //   114: fstore          15
        //   116: aload_0        
        //   117: fload           14
        //   119: putfield        android/support/v4/widget/DrawerLayout.mInitialMotionX:F
        //   122: aload_0        
        //   123: fload           15
        //   125: putfield        android/support/v4/widget/DrawerLayout.mInitialMotionY:F
        //   128: aload_0        
        //   129: getfield        android/support/v4/widget/DrawerLayout.mScrimOpacity:F
        //   132: fconst_0       
        //   133: fcmpl          
        //   134: ifle            268
        //   137: aload_0        
        //   138: getfield        android/support/v4/widget/DrawerLayout.mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
        //   141: fload           14
        //   143: f2i            
        //   144: fload           15
        //   146: f2i            
        //   147: invokevirtual   android/support/v4/widget/ViewDragHelper.findTopChildUnder:(II)Landroid/view/View;
        //   150: astore          17
        //   152: aload           17
        //   154: ifnull          268
        //   157: aload_0        
        //   158: aload           17
        //   160: invokevirtual   android/support/v4/widget/DrawerLayout.isContentView:(Landroid/view/View;)Z
        //   163: istore          19
        //   165: iload           19
        //   167: ifeq            268
        //   170: iconst_1       
        //   171: istore          5
        //   173: aload_0        
        //   174: iconst_0       
        //   175: putfield        android/support/v4/widget/DrawerLayout.mDisallowInterceptRequested:Z
        //   178: aload_0        
        //   179: iconst_0       
        //   180: putfield        android/support/v4/widget/DrawerLayout.mChildrenCanceledTouch:Z
        //   183: iload_2        
        //   184: ifeq            63
        //   187: aload_0        
        //   188: getfield        android/support/v4/widget/DrawerLayout.mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
        //   191: iconst_3       
        //   192: invokevirtual   android/support/v4/widget/ViewDragHelper.checkTouchSlop:(I)Z
        //   195: istore          8
        //   197: iload           8
        //   199: ifeq            63
        //   202: aload_0        
        //   203: getfield        android/support/v4/widget/DrawerLayout.mLeftCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
        //   206: invokevirtual   android/support/v4/widget/DrawerLayout$ViewDragCallback.removeCallbacks:()V
        //   209: aload_0        
        //   210: getfield        android/support/v4/widget/DrawerLayout.mRightCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
        //   213: invokevirtual   android/support/v4/widget/DrawerLayout$ViewDragCallback.removeCallbacks:()V
        //   216: iload_2        
        //   217: ifeq            63
        //   220: aload_0        
        //   221: iconst_1       
        //   222: invokevirtual   android/support/v4/widget/DrawerLayout.closeDrawers:(Z)V
        //   225: aload_0        
        //   226: iconst_0       
        //   227: putfield        android/support/v4/widget/DrawerLayout.mDisallowInterceptRequested:Z
        //   230: aload_0        
        //   231: iconst_0       
        //   232: putfield        android/support/v4/widget/DrawerLayout.mChildrenCanceledTouch:Z
        //   235: goto            63
        //   238: astore          7
        //   240: aload           7
        //   242: athrow         
        //   243: astore          18
        //   245: aload           18
        //   247: athrow         
        //   248: astore          16
        //   250: aload           16
        //   252: athrow         
        //   253: astore          6
        //   255: aload           6
        //   257: athrow         
        //   258: astore          10
        //   260: aload           10
        //   262: athrow         
        //   263: astore          11
        //   265: aload           11
        //   267: athrow         
        //   268: iconst_0       
        //   269: istore          5
        //   271: goto            173
        //   274: iconst_0       
        //   275: istore          5
        //   277: goto            220
        //   280: iconst_0       
        //   281: istore          5
        //   283: goto            187
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  73     79     258    263    Ljava/lang/IllegalArgumentException;
        //  84     90     263    268    Ljava/lang/IllegalArgumentException;
        //  157    165    243    248    Ljava/lang/IllegalArgumentException;
        //  173    183    248    253    Ljava/lang/IllegalArgumentException;
        //  187    197    253    258    Ljava/lang/IllegalArgumentException;
        //  202    216    238    243    Ljava/lang/IllegalArgumentException;
        //  220    235    238    243    Ljava/lang/IllegalArgumentException;
        //  250    253    253    258    Ljava/lang/IllegalArgumentException;
        //  255    258    238    243    Ljava/lang/IllegalArgumentException;
        //  260    263    263    268    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 134, Size: 134
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
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        if (n == 4) {
            try {
                if (this.hasVisibleDrawer()) {
                    KeyEventCompat.startTracking(keyEvent);
                    return true;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        return super.onKeyDown(n, keyEvent);
    }
    
    public boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        if (n != 4) {
            return super.onKeyUp(n, keyEvent);
        }
        final View visibleDrawer = this.findVisibleDrawer();
        while (true) {
            if (visibleDrawer != null) {
                try {
                    if (this.getDrawerLockMode(visibleDrawer) == 0) {
                        this.closeDrawers();
                    }
                    if (visibleDrawer != null) {
                        return true;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                return false;
            }
            continue;
        }
    }
    
    protected void onLayout(final boolean p0, final int p1, final int p2, final int p3, final int p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //     3: istore          6
        //     5: aload_0        
        //     6: iconst_1       
        //     7: putfield        android/support/v4/widget/DrawerLayout.mInLayout:Z
        //    10: iload           4
        //    12: iload_2        
        //    13: isub           
        //    14: istore          7
        //    16: aload_0        
        //    17: invokevirtual   android/support/v4/widget/DrawerLayout.getChildCount:()I
        //    20: istore          8
        //    22: iconst_0       
        //    23: istore          9
        //    25: iload           9
        //    27: iload           8
        //    29: if_icmpge       486
        //    32: aload_0        
        //    33: iload           9
        //    35: invokevirtual   android/support/v4/widget/DrawerLayout.getChildAt:(I)Landroid/view/View;
        //    38: astore          10
        //    40: aload           10
        //    42: invokevirtual   android/view/View.getVisibility:()I
        //    45: istore          12
        //    47: iload           12
        //    49: bipush          8
        //    51: if_icmpne       59
        //    54: iload           6
        //    56: ifeq            475
        //    59: aload           10
        //    61: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //    64: checkcast       Landroid/support/v4/widget/DrawerLayout$LayoutParams;
        //    67: astore          13
        //    69: aload_0        
        //    70: aload           10
        //    72: invokevirtual   android/support/v4/widget/DrawerLayout.isContentView:(Landroid/view/View;)Z
        //    75: ifeq            120
        //    78: aload           10
        //    80: aload           13
        //    82: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.leftMargin:I
        //    85: aload           13
        //    87: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.topMargin:I
        //    90: aload           13
        //    92: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.leftMargin:I
        //    95: aload           10
        //    97: invokevirtual   android/view/View.getMeasuredWidth:()I
        //   100: iadd           
        //   101: aload           13
        //   103: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.topMargin:I
        //   106: aload           10
        //   108: invokevirtual   android/view/View.getMeasuredHeight:()I
        //   111: iadd           
        //   112: invokevirtual   android/view/View.layout:(IIII)V
        //   115: iload           6
        //   117: ifeq            475
        //   120: aload           10
        //   122: invokevirtual   android/view/View.getMeasuredWidth:()I
        //   125: istore          15
        //   127: aload           10
        //   129: invokevirtual   android/view/View.getMeasuredHeight:()I
        //   132: istore          16
        //   134: aload_0        
        //   135: aload           10
        //   137: iconst_3       
        //   138: invokevirtual   android/support/v4/widget/DrawerLayout.checkDrawerViewAbsoluteGravity:(Landroid/view/View;I)Z
        //   141: ifeq            177
        //   144: iload           15
        //   146: ineg           
        //   147: iload           15
        //   149: i2f            
        //   150: aload           13
        //   152: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.onScreen:F
        //   155: fmul           
        //   156: f2i            
        //   157: iadd           
        //   158: istore          36
        //   160: iload           15
        //   162: iload           36
        //   164: iadd           
        //   165: i2f            
        //   166: iload           15
        //   168: i2f            
        //   169: fdiv           
        //   170: fstore          37
        //   172: iload           6
        //   174: ifeq            556
        //   177: iload           7
        //   179: iload           15
        //   181: i2f            
        //   182: aload           13
        //   184: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.onScreen:F
        //   187: fmul           
        //   188: f2i            
        //   189: isub           
        //   190: istore          17
        //   192: iload           7
        //   194: iload           17
        //   196: isub           
        //   197: i2f            
        //   198: iload           15
        //   200: i2f            
        //   201: fdiv           
        //   202: fstore          18
        //   204: iload           17
        //   206: istore          19
        //   208: aload           13
        //   210: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.onScreen:F
        //   213: fstore          21
        //   215: fload           18
        //   217: fload           21
        //   219: fcmpl          
        //   220: ifeq            512
        //   223: iconst_1       
        //   224: istore          22
        //   226: bipush          112
        //   228: aload           13
        //   230: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.gravity:I
        //   233: iand           
        //   234: lookupswitch {
        //               16: 335
        //               80: 290
        //          default: 260
        //        }
        //   260: aload           10
        //   262: iload           19
        //   264: aload           13
        //   266: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.topMargin:I
        //   269: iload           19
        //   271: iload           15
        //   273: iadd           
        //   274: iload           16
        //   276: aload           13
        //   278: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.topMargin:I
        //   281: iadd           
        //   282: invokevirtual   android/view/View.layout:(IIII)V
        //   285: iload           6
        //   287: ifeq            428
        //   290: iload           5
        //   292: iload_3        
        //   293: isub           
        //   294: istore          34
        //   296: aload           10
        //   298: iload           19
        //   300: iload           34
        //   302: aload           13
        //   304: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.bottomMargin:I
        //   307: isub           
        //   308: aload           10
        //   310: invokevirtual   android/view/View.getMeasuredHeight:()I
        //   313: isub           
        //   314: iload           19
        //   316: iload           15
        //   318: iadd           
        //   319: iload           34
        //   321: aload           13
        //   323: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.bottomMargin:I
        //   326: isub           
        //   327: invokevirtual   android/view/View.layout:(IIII)V
        //   330: iload           6
        //   332: ifeq            428
        //   335: iload           5
        //   337: iload_3        
        //   338: isub           
        //   339: istore          23
        //   341: iload           23
        //   343: iload           16
        //   345: isub           
        //   346: iconst_2       
        //   347: idiv           
        //   348: istore          24
        //   350: iload           24
        //   352: aload           13
        //   354: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.topMargin:I
        //   357: if_icmpge       372
        //   360: aload           13
        //   362: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.topMargin:I
        //   365: istore          24
        //   367: iload           6
        //   369: ifeq            409
        //   372: iload           24
        //   374: iload           16
        //   376: iadd           
        //   377: istore          25
        //   379: aload           13
        //   381: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.bottomMargin:I
        //   384: istore          27
        //   386: iload           25
        //   388: iload           23
        //   390: iload           27
        //   392: isub           
        //   393: if_icmple       409
        //   396: iload           23
        //   398: aload           13
        //   400: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.bottomMargin:I
        //   403: isub           
        //   404: iload           16
        //   406: isub           
        //   407: istore          24
        //   409: aload           10
        //   411: iload           19
        //   413: iload           24
        //   415: iload           15
        //   417: iload           19
        //   419: iadd           
        //   420: iload           16
        //   422: iload           24
        //   424: iadd           
        //   425: invokevirtual   android/view/View.layout:(IIII)V
        //   428: iload           22
        //   430: ifeq            441
        //   433: aload_0        
        //   434: aload           10
        //   436: fload           18
        //   438: invokevirtual   android/support/v4/widget/DrawerLayout.setDrawerViewOffset:(Landroid/view/View;F)V
        //   441: aload           13
        //   443: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.onScreen:F
        //   446: fstore          29
        //   448: fload           29
        //   450: fconst_0       
        //   451: fcmpl          
        //   452: ifle            538
        //   455: iconst_0       
        //   456: istore          30
        //   458: aload           10
        //   460: invokevirtual   android/view/View.getVisibility:()I
        //   463: iload           30
        //   465: if_icmpeq       475
        //   468: aload           10
        //   470: iload           30
        //   472: invokevirtual   android/view/View.setVisibility:(I)V
        //   475: iload           9
        //   477: iconst_1       
        //   478: iadd           
        //   479: istore          32
        //   481: iload           6
        //   483: ifeq            549
        //   486: aload_0        
        //   487: iconst_0       
        //   488: putfield        android/support/v4/widget/DrawerLayout.mInLayout:Z
        //   491: aload_0        
        //   492: iconst_0       
        //   493: putfield        android/support/v4/widget/DrawerLayout.mFirstLayout:Z
        //   496: return         
        //   497: astore          11
        //   499: aload           11
        //   501: athrow         
        //   502: astore          14
        //   504: aload           14
        //   506: athrow         
        //   507: astore          20
        //   509: aload           20
        //   511: athrow         
        //   512: iconst_0       
        //   513: istore          22
        //   515: goto            226
        //   518: astore          35
        //   520: aload           35
        //   522: athrow         
        //   523: astore          26
        //   525: aload           26
        //   527: athrow         
        //   528: astore          33
        //   530: aload           33
        //   532: athrow         
        //   533: astore          28
        //   535: aload           28
        //   537: athrow         
        //   538: iconst_4       
        //   539: istore          30
        //   541: goto            458
        //   544: astore          31
        //   546: aload           31
        //   548: athrow         
        //   549: iload           32
        //   551: istore          9
        //   553: goto            25
        //   556: fload           37
        //   558: fstore          18
        //   560: iload           36
        //   562: istore          19
        //   564: goto            208
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  40     47     497    502    Ljava/lang/IllegalArgumentException;
        //  69     115    502    507    Ljava/lang/IllegalArgumentException;
        //  208    215    507    512    Ljava/lang/IllegalArgumentException;
        //  260    285    518    523    Ljava/lang/IllegalArgumentException;
        //  379    386    523    528    Ljava/lang/IllegalArgumentException;
        //  433    441    528    533    Ljava/lang/IllegalArgumentException;
        //  441    448    533    538    Ljava/lang/IllegalArgumentException;
        //  458    475    544    549    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 277, Size: 277
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
    
    protected void onMeasure(final int p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //     3: istore_3       
        //     4: iload_1        
        //     5: invokestatic    android/view/View$MeasureSpec.getMode:(I)I
        //     8: istore          4
        //    10: iload_2        
        //    11: invokestatic    android/view/View$MeasureSpec.getMode:(I)I
        //    14: istore          5
        //    16: iload_1        
        //    17: invokestatic    android/view/View$MeasureSpec.getSize:(I)I
        //    20: istore          6
        //    22: iload_2        
        //    23: invokestatic    android/view/View$MeasureSpec.getSize:(I)I
        //    26: istore          7
        //    28: iload           4
        //    30: ldc_w           1073741824
        //    33: if_icmpne       44
        //    36: iload           5
        //    38: ldc_w           1073741824
        //    41: if_icmpeq       137
        //    44: aload_0        
        //    45: invokevirtual   android/support/v4/widget/DrawerLayout.isInEditMode:()Z
        //    48: istore          9
        //    50: iload           9
        //    52: ifeq            113
        //    55: iload           4
        //    57: ldc_w           -2147483648
        //    60: if_icmpne       72
        //    63: ldc_w           1073741824
        //    66: istore          4
        //    68: iload_3        
        //    69: ifeq            82
        //    72: iload           4
        //    74: ifne            82
        //    77: sipush          300
        //    80: istore          6
        //    82: iload           5
        //    84: ldc_w           -2147483648
        //    87: if_icmpne       99
        //    90: ldc_w           1073741824
        //    93: istore          5
        //    95: iload_3        
        //    96: ifeq            137
        //    99: iload           5
        //   101: ifne            137
        //   104: sipush          300
        //   107: istore          7
        //   109: iload_3        
        //   110: ifeq            137
        //   113: new             Ljava/lang/IllegalArgumentException;
        //   116: dup            
        //   117: getstatic       android/support/v4/widget/DrawerLayout.z:[Ljava/lang/String;
        //   120: bipush          10
        //   122: aaload         
        //   123: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   126: athrow         
        //   127: astore          10
        //   129: aload           10
        //   131: athrow         
        //   132: astore          8
        //   134: aload           8
        //   136: athrow         
        //   137: iload           7
        //   139: istore          11
        //   141: iload           6
        //   143: istore          12
        //   145: aload_0        
        //   146: iload           12
        //   148: iload           11
        //   150: invokevirtual   android/support/v4/widget/DrawerLayout.setMeasuredDimension:(II)V
        //   153: aload_0        
        //   154: getfield        android/support/v4/widget/DrawerLayout.mLastInsets:Ljava/lang/Object;
        //   157: astore          15
        //   159: aload           15
        //   161: ifnull          482
        //   164: aload_0        
        //   165: invokestatic    android/support/v4/view/ViewCompat.getFitsSystemWindows:(Landroid/view/View;)Z
        //   168: istore          38
        //   170: iload           38
        //   172: ifeq            482
        //   175: iconst_1       
        //   176: istore          16
        //   178: aload_0        
        //   179: invokestatic    android/support/v4/view/ViewCompat.getLayoutDirection:(Landroid/view/View;)I
        //   182: istore          17
        //   184: aload_0        
        //   185: invokevirtual   android/support/v4/widget/DrawerLayout.getChildCount:()I
        //   188: istore          18
        //   190: iconst_0       
        //   191: istore          19
        //   193: iload           19
        //   195: iload           18
        //   197: if_icmpge       647
        //   200: aload_0        
        //   201: iload           19
        //   203: invokevirtual   android/support/v4/widget/DrawerLayout.getChildAt:(I)Landroid/view/View;
        //   206: astore          20
        //   208: aload           20
        //   210: invokevirtual   android/view/View.getVisibility:()I
        //   213: istore          22
        //   215: iload           22
        //   217: bipush          8
        //   219: if_icmpne       226
        //   222: iload_3        
        //   223: ifeq            637
        //   226: aload           20
        //   228: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   231: checkcast       Landroid/support/v4/widget/DrawerLayout$LayoutParams;
        //   234: astore          23
        //   236: iload           16
        //   238: ifeq            301
        //   241: aload           23
        //   243: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.gravity:I
        //   246: iload           17
        //   248: invokestatic    android/support/v4/view/GravityCompat.getAbsoluteGravity:(II)I
        //   251: istore          34
        //   253: aload           20
        //   255: invokestatic    android/support/v4/view/ViewCompat.getFitsSystemWindows:(Landroid/view/View;)Z
        //   258: istore          37
        //   260: iload           37
        //   262: ifeq            285
        //   265: getstatic       android/support/v4/widget/DrawerLayout.IMPL:Landroid/support/v4/widget/DrawerLayout$DrawerLayoutCompatImpl;
        //   268: aload           20
        //   270: aload_0        
        //   271: getfield        android/support/v4/widget/DrawerLayout.mLastInsets:Ljava/lang/Object;
        //   274: iload           34
        //   276: invokeinterface android/support/v4/widget/DrawerLayout$DrawerLayoutCompatImpl.dispatchChildInsets:(Landroid/view/View;Ljava/lang/Object;I)V
        //   281: iload_3        
        //   282: ifeq            301
        //   285: getstatic       android/support/v4/widget/DrawerLayout.IMPL:Landroid/support/v4/widget/DrawerLayout$DrawerLayoutCompatImpl;
        //   288: aload           23
        //   290: aload_0        
        //   291: getfield        android/support/v4/widget/DrawerLayout.mLastInsets:Ljava/lang/Object;
        //   294: iload           34
        //   296: invokeinterface android/support/v4/widget/DrawerLayout$DrawerLayoutCompatImpl.applyMarginInsets:(Landroid/view/ViewGroup$MarginLayoutParams;Ljava/lang/Object;I)V
        //   301: aload_0        
        //   302: aload           20
        //   304: invokevirtual   android/support/v4/widget/DrawerLayout.isContentView:(Landroid/view/View;)Z
        //   307: ifeq            367
        //   310: iload           12
        //   312: aload           23
        //   314: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.leftMargin:I
        //   317: isub           
        //   318: aload           23
        //   320: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.rightMargin:I
        //   323: isub           
        //   324: ldc_w           1073741824
        //   327: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   330: istore          32
        //   332: iload           11
        //   334: aload           23
        //   336: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.topMargin:I
        //   339: isub           
        //   340: aload           23
        //   342: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.bottomMargin:I
        //   345: isub           
        //   346: ldc_w           1073741824
        //   349: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   352: istore          33
        //   354: aload           20
        //   356: iload           32
        //   358: iload           33
        //   360: invokevirtual   android/view/View.measure:(II)V
        //   363: iload_3        
        //   364: ifeq            637
        //   367: aload_0        
        //   368: aload           20
        //   370: invokevirtual   android/support/v4/widget/DrawerLayout.isDrawerView:(Landroid/view/View;)Z
        //   373: istore          25
        //   375: iload           25
        //   377: ifeq            570
        //   380: bipush          7
        //   382: aload_0        
        //   383: aload           20
        //   385: invokevirtual   android/support/v4/widget/DrawerLayout.getDrawerViewAbsoluteGravity:(Landroid/view/View;)I
        //   388: iand           
        //   389: istore          27
        //   391: iconst_0       
        //   392: iload           27
        //   394: iand           
        //   395: ifeq            508
        //   398: new             Ljava/lang/IllegalStateException;
        //   401: dup            
        //   402: new             Ljava/lang/StringBuilder;
        //   405: dup            
        //   406: invokespecial   java/lang/StringBuilder.<init>:()V
        //   409: getstatic       android/support/v4/widget/DrawerLayout.z:[Ljava/lang/String;
        //   412: bipush          6
        //   414: aaload         
        //   415: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   418: iload           27
        //   420: invokestatic    android/support/v4/widget/DrawerLayout.gravityToString:(I)Ljava/lang/String;
        //   423: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   426: getstatic       android/support/v4/widget/DrawerLayout.z:[Ljava/lang/String;
        //   429: iconst_2       
        //   430: aaload         
        //   431: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   434: getstatic       android/support/v4/widget/DrawerLayout.z:[Ljava/lang/String;
        //   437: bipush          9
        //   439: aaload         
        //   440: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   443: getstatic       android/support/v4/widget/DrawerLayout.z:[Ljava/lang/String;
        //   446: iconst_3       
        //   447: aaload         
        //   448: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   451: getstatic       android/support/v4/widget/DrawerLayout.z:[Ljava/lang/String;
        //   454: bipush          7
        //   456: aaload         
        //   457: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   460: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   463: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   466: athrow         
        //   467: astore          31
        //   469: aload           31
        //   471: athrow         
        //   472: astore          13
        //   474: aload           13
        //   476: athrow         
        //   477: astore          14
        //   479: aload           14
        //   481: athrow         
        //   482: iconst_0       
        //   483: istore          16
        //   485: goto            178
        //   488: astore          21
        //   490: aload           21
        //   492: athrow         
        //   493: astore          35
        //   495: aload           35
        //   497: athrow         
        //   498: astore          36
        //   500: aload           36
        //   502: athrow         
        //   503: astore          24
        //   505: aload           24
        //   507: athrow         
        //   508: iload_1        
        //   509: aload_0        
        //   510: getfield        android/support/v4/widget/DrawerLayout.mMinDrawerMargin:I
        //   513: aload           23
        //   515: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.leftMargin:I
        //   518: iadd           
        //   519: aload           23
        //   521: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.rightMargin:I
        //   524: iadd           
        //   525: aload           23
        //   527: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.width:I
        //   530: invokestatic    android/support/v4/widget/DrawerLayout.getChildMeasureSpec:(III)I
        //   533: istore          28
        //   535: iload_2        
        //   536: aload           23
        //   538: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.topMargin:I
        //   541: aload           23
        //   543: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.bottomMargin:I
        //   546: iadd           
        //   547: aload           23
        //   549: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.height:I
        //   552: invokestatic    android/support/v4/widget/DrawerLayout.getChildMeasureSpec:(III)I
        //   555: istore          29
        //   557: aload           20
        //   559: iload           28
        //   561: iload           29
        //   563: invokevirtual   android/view/View.measure:(II)V
        //   566: iload_3        
        //   567: ifeq            637
        //   570: new             Ljava/lang/IllegalStateException;
        //   573: dup            
        //   574: new             Ljava/lang/StringBuilder;
        //   577: dup            
        //   578: invokespecial   java/lang/StringBuilder.<init>:()V
        //   581: getstatic       android/support/v4/widget/DrawerLayout.z:[Ljava/lang/String;
        //   584: iconst_5       
        //   585: aaload         
        //   586: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   589: aload           20
        //   591: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   594: getstatic       android/support/v4/widget/DrawerLayout.z:[Ljava/lang/String;
        //   597: bipush          8
        //   599: aaload         
        //   600: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   603: iload           19
        //   605: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   608: getstatic       android/support/v4/widget/DrawerLayout.z:[Ljava/lang/String;
        //   611: iconst_4       
        //   612: aaload         
        //   613: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   616: getstatic       android/support/v4/widget/DrawerLayout.z:[Ljava/lang/String;
        //   619: bipush          11
        //   621: aaload         
        //   622: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   625: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   628: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   631: athrow         
        //   632: astore          26
        //   634: aload           26
        //   636: athrow         
        //   637: iload           19
        //   639: iconst_1       
        //   640: iadd           
        //   641: istore          30
        //   643: iload_3        
        //   644: ifeq            648
        //   647: return         
        //   648: iload           30
        //   650: istore          19
        //   652: goto            193
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  44     50     132    137    Ljava/lang/IllegalArgumentException;
        //  113    127    127    132    Ljava/lang/IllegalArgumentException;
        //  145    159    472    477    Ljava/lang/IllegalArgumentException;
        //  164    170    477    482    Ljava/lang/IllegalArgumentException;
        //  208    215    488    493    Ljava/lang/IllegalArgumentException;
        //  253    260    493    498    Ljava/lang/IllegalArgumentException;
        //  265    281    498    503    Ljava/lang/IllegalArgumentException;
        //  285    301    498    503    Ljava/lang/IllegalArgumentException;
        //  354    363    503    508    Ljava/lang/IllegalArgumentException;
        //  367    375    503    508    Ljava/lang/IllegalArgumentException;
        //  398    467    467    472    Ljava/lang/IllegalArgumentException;
        //  474    477    477    482    Ljava/lang/IllegalArgumentException;
        //  495    498    498    503    Ljava/lang/IllegalArgumentException;
        //  557    566    632    637    Ljava/lang/IllegalArgumentException;
        //  570    632    632    637    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 306, Size: 306
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
    
    protected void onRestoreInstanceState(final Parcelable parcelable) {
        final DrawerLayout$SavedState drawerLayout$SavedState = (DrawerLayout$SavedState)parcelable;
        super.onRestoreInstanceState(drawerLayout$SavedState.getSuperState());
        Label_0038: {
            if (drawerLayout$SavedState.openDrawerGravity == 0) {
                break Label_0038;
            }
            final View drawerWithGravity = this.findDrawerWithGravity(drawerLayout$SavedState.openDrawerGravity);
            if (drawerWithGravity == null) {
                break Label_0038;
            }
            try {
                this.openDrawer(drawerWithGravity);
                this.setDrawerLockMode(drawerLayout$SavedState.lockModeLeft, 3);
                this.setDrawerLockMode(drawerLayout$SavedState.lockModeRight, 5);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
    }
    
    protected Parcelable onSaveInstanceState() {
        final DrawerLayout$SavedState drawerLayout$SavedState = new DrawerLayout$SavedState(super.onSaveInstanceState());
        final View openDrawer = this.findOpenDrawer();
        Label_0035: {
            if (openDrawer == null) {
                break Label_0035;
            }
            try {
                drawerLayout$SavedState.openDrawerGravity = ((DrawerLayout$LayoutParams)openDrawer.getLayoutParams()).gravity;
                drawerLayout$SavedState.lockModeLeft = this.mLockModeLeft;
                drawerLayout$SavedState.lockModeRight = this.mLockModeRight;
                return (Parcelable)drawerLayout$SavedState;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
    }
    
    public boolean onTouchEvent(final MotionEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        android/support/v4/widget/DrawerLayout.mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
        //     8: aload_1        
        //     9: invokevirtual   android/support/v4/widget/ViewDragHelper.processTouchEvent:(Landroid/view/MotionEvent;)V
        //    12: aload_0        
        //    13: getfield        android/support/v4/widget/DrawerLayout.mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
        //    16: aload_1        
        //    17: invokevirtual   android/support/v4/widget/ViewDragHelper.processTouchEvent:(Landroid/view/MotionEvent;)V
        //    20: sipush          255
        //    23: aload_1        
        //    24: invokevirtual   android/view/MotionEvent.getAction:()I
        //    27: iand           
        //    28: tableswitch {
        //                0: 62
        //                1: 100
        //                2: 60
        //                3: 239
        //          default: 60
        //        }
        //    60: iconst_1       
        //    61: ireturn        
        //    62: aload_1        
        //    63: invokevirtual   android/view/MotionEvent.getX:()F
        //    66: fstore          16
        //    68: aload_1        
        //    69: invokevirtual   android/view/MotionEvent.getY:()F
        //    72: fstore          17
        //    74: aload_0        
        //    75: fload           16
        //    77: putfield        android/support/v4/widget/DrawerLayout.mInitialMotionX:F
        //    80: aload_0        
        //    81: fload           17
        //    83: putfield        android/support/v4/widget/DrawerLayout.mInitialMotionY:F
        //    86: aload_0        
        //    87: iconst_0       
        //    88: putfield        android/support/v4/widget/DrawerLayout.mDisallowInterceptRequested:Z
        //    91: aload_0        
        //    92: iconst_0       
        //    93: putfield        android/support/v4/widget/DrawerLayout.mChildrenCanceledTouch:Z
        //    96: iload_2        
        //    97: ifeq            60
        //   100: aload_1        
        //   101: invokevirtual   android/view/MotionEvent.getX:()F
        //   104: fstore          4
        //   106: aload_1        
        //   107: invokevirtual   android/view/MotionEvent.getY:()F
        //   110: fstore          5
        //   112: aload_0        
        //   113: getfield        android/support/v4/widget/DrawerLayout.mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
        //   116: fload           4
        //   118: f2i            
        //   119: fload           5
        //   121: f2i            
        //   122: invokevirtual   android/support/v4/widget/ViewDragHelper.findTopChildUnder:(II)Landroid/view/View;
        //   125: astore          6
        //   127: aload           6
        //   129: ifnull          269
        //   132: aload_0        
        //   133: aload           6
        //   135: invokevirtual   android/support/v4/widget/DrawerLayout.isContentView:(Landroid/view/View;)Z
        //   138: istore          9
        //   140: iload           9
        //   142: ifeq            269
        //   145: fload           4
        //   147: aload_0        
        //   148: getfield        android/support/v4/widget/DrawerLayout.mInitialMotionX:F
        //   151: fsub           
        //   152: fstore          10
        //   154: fload           5
        //   156: aload_0        
        //   157: getfield        android/support/v4/widget/DrawerLayout.mInitialMotionY:F
        //   160: fsub           
        //   161: fstore          11
        //   163: aload_0        
        //   164: getfield        android/support/v4/widget/DrawerLayout.mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
        //   167: invokevirtual   android/support/v4/widget/ViewDragHelper.getTouchSlop:()I
        //   170: istore          12
        //   172: fload           10
        //   174: fload           10
        //   176: fmul           
        //   177: fload           11
        //   179: fload           11
        //   181: fmul           
        //   182: fadd           
        //   183: iload           12
        //   185: iload           12
        //   187: imul           
        //   188: i2f            
        //   189: fcmpg          
        //   190: ifge            269
        //   193: aload_0        
        //   194: invokevirtual   android/support/v4/widget/DrawerLayout.findOpenDrawer:()Landroid/view/View;
        //   197: astore          13
        //   199: aload           13
        //   201: ifnull          269
        //   204: aload_0        
        //   205: aload           13
        //   207: invokevirtual   android/support/v4/widget/DrawerLayout.getDrawerLockMode:(Landroid/view/View;)I
        //   210: istore          15
        //   212: iconst_0       
        //   213: istore          7
        //   215: iload           15
        //   217: iconst_2       
        //   218: if_icmpne       224
        //   221: iconst_1       
        //   222: istore          7
        //   224: aload_0        
        //   225: iload           7
        //   227: invokevirtual   android/support/v4/widget/DrawerLayout.closeDrawers:(Z)V
        //   230: aload_0        
        //   231: iconst_0       
        //   232: putfield        android/support/v4/widget/DrawerLayout.mDisallowInterceptRequested:Z
        //   235: iload_2        
        //   236: ifeq            60
        //   239: aload_0        
        //   240: iconst_1       
        //   241: invokevirtual   android/support/v4/widget/DrawerLayout.closeDrawers:(Z)V
        //   244: aload_0        
        //   245: iconst_0       
        //   246: putfield        android/support/v4/widget/DrawerLayout.mDisallowInterceptRequested:Z
        //   249: aload_0        
        //   250: iconst_0       
        //   251: putfield        android/support/v4/widget/DrawerLayout.mChildrenCanceledTouch:Z
        //   254: iconst_1       
        //   255: ireturn        
        //   256: astore_3       
        //   257: aload_3        
        //   258: athrow         
        //   259: astore          8
        //   261: aload           8
        //   263: athrow         
        //   264: astore          14
        //   266: aload           14
        //   268: athrow         
        //   269: iconst_1       
        //   270: istore          7
        //   272: goto            224
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  132    140    259    264    Ljava/lang/IllegalArgumentException;
        //  204    212    264    269    Ljava/lang/IllegalArgumentException;
        //  224    235    256    259    Ljava/lang/IllegalArgumentException;
        //  239    254    256    259    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0224:
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
    
    public void openDrawer(final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: aload_1        
        //     6: invokevirtual   android/support/v4/widget/DrawerLayout.isDrawerView:(Landroid/view/View;)Z
        //     9: ifne            55
        //    12: new             Ljava/lang/IllegalArgumentException;
        //    15: dup            
        //    16: new             Ljava/lang/StringBuilder;
        //    19: dup            
        //    20: invokespecial   java/lang/StringBuilder.<init>:()V
        //    23: getstatic       android/support/v4/widget/DrawerLayout.z:[Ljava/lang/String;
        //    26: bipush          12
        //    28: aaload         
        //    29: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    32: aload_1        
        //    33: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    36: getstatic       android/support/v4/widget/DrawerLayout.z:[Ljava/lang/String;
        //    39: bipush          13
        //    41: aaload         
        //    42: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    45: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    48: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    51: athrow         
        //    52: astore_3       
        //    53: aload_3        
        //    54: athrow         
        //    55: aload_0        
        //    56: getfield        android/support/v4/widget/DrawerLayout.mFirstLayout:Z
        //    59: ifeq            93
        //    62: aload_1        
        //    63: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //    66: checkcast       Landroid/support/v4/widget/DrawerLayout$LayoutParams;
        //    69: astore          9
        //    71: aload           9
        //    73: fconst_1       
        //    74: putfield        android/support/v4/widget/DrawerLayout$LayoutParams.onScreen:F
        //    77: aload           9
        //    79: iconst_1       
        //    80: putfield        android/support/v4/widget/DrawerLayout$LayoutParams.knownOpen:Z
        //    83: aload_0        
        //    84: aload_1        
        //    85: iconst_1       
        //    86: invokespecial   android/support/v4/widget/DrawerLayout.updateChildrenImportantForAccessibility:(Landroid/view/View;Z)V
        //    89: iload_2        
        //    90: ifeq            146
        //    93: aload_0        
        //    94: aload_1        
        //    95: iconst_3       
        //    96: invokevirtual   android/support/v4/widget/DrawerLayout.checkDrawerViewAbsoluteGravity:(Landroid/view/View;I)Z
        //    99: istore          6
        //   101: iload           6
        //   103: ifeq            124
        //   106: aload_0        
        //   107: getfield        android/support/v4/widget/DrawerLayout.mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
        //   110: aload_1        
        //   111: iconst_0       
        //   112: aload_1        
        //   113: invokevirtual   android/view/View.getTop:()I
        //   116: invokevirtual   android/support/v4/widget/ViewDragHelper.smoothSlideViewTo:(Landroid/view/View;II)Z
        //   119: pop            
        //   120: iload_2        
        //   121: ifeq            146
        //   124: aload_0        
        //   125: getfield        android/support/v4/widget/DrawerLayout.mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
        //   128: aload_1        
        //   129: aload_0        
        //   130: invokevirtual   android/support/v4/widget/DrawerLayout.getWidth:()I
        //   133: aload_1        
        //   134: invokevirtual   android/view/View.getWidth:()I
        //   137: isub           
        //   138: aload_1        
        //   139: invokevirtual   android/view/View.getTop:()I
        //   142: invokevirtual   android/support/v4/widget/ViewDragHelper.smoothSlideViewTo:(Landroid/view/View;II)Z
        //   145: pop            
        //   146: aload_0        
        //   147: invokevirtual   android/support/v4/widget/DrawerLayout.invalidate:()V
        //   150: return         
        //   151: astore          10
        //   153: aload           10
        //   155: athrow         
        //   156: astore          4
        //   158: aload           4
        //   160: athrow         
        //   161: astore          5
        //   163: aload           5
        //   165: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      52     52     55     Ljava/lang/IllegalArgumentException;
        //  71     89     151    156    Ljava/lang/IllegalArgumentException;
        //  93     101    156    161    Ljava/lang/IllegalArgumentException;
        //  106    120    161    166    Ljava/lang/IllegalArgumentException;
        //  124    146    161    166    Ljava/lang/IllegalArgumentException;
        //  153    156    156    161    Ljava/lang/IllegalArgumentException;
        //  158    161    161    166    Ljava/lang/IllegalArgumentException;
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
    
    public void requestDisallowInterceptTouchEvent(final boolean mDisallowInterceptRequested) {
        try {
            super.requestDisallowInterceptTouchEvent(mDisallowInterceptRequested);
            this.mDisallowInterceptRequested = mDisallowInterceptRequested;
            if (mDisallowInterceptRequested) {
                this.closeDrawers(true);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public void requestLayout() {
        try {
            if (!this.mInLayout) {
                super.requestLayout();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public void setChildInsets(final Object p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: putfield        android/support/v4/widget/DrawerLayout.mLastInsets:Ljava/lang/Object;
        //     5: aload_0        
        //     6: iload_2        
        //     7: putfield        android/support/v4/widget/DrawerLayout.mDrawStatusBarBackground:Z
        //    10: iload_2        
        //    11: ifne            47
        //    14: aload_0        
        //    15: invokevirtual   android/support/v4/widget/DrawerLayout.getBackground:()Landroid/graphics/drawable/Drawable;
        //    18: astore          6
        //    20: aload           6
        //    22: ifnonnull       47
        //    25: iconst_1       
        //    26: istore          5
        //    28: aload_0        
        //    29: iload           5
        //    31: invokevirtual   android/support/v4/widget/DrawerLayout.setWillNotDraw:(Z)V
        //    34: aload_0        
        //    35: invokevirtual   android/support/v4/widget/DrawerLayout.requestLayout:()V
        //    38: return         
        //    39: astore_3       
        //    40: aload_3        
        //    41: athrow         
        //    42: astore          4
        //    44: aload           4
        //    46: athrow         
        //    47: iconst_0       
        //    48: istore          5
        //    50: goto            28
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      10     39     42     Ljava/lang/IllegalArgumentException;
        //  14     20     42     47     Ljava/lang/IllegalArgumentException;
        //  40     42     42     47     Ljava/lang/IllegalArgumentException;
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
    
    public void setDrawerLockMode(final int p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //     3: istore_3       
        //     4: iload_2        
        //     5: aload_0        
        //     6: invokestatic    android/support/v4/view/ViewCompat.getLayoutDirection:(Landroid/view/View;)I
        //     9: invokestatic    android/support/v4/view/GravityCompat.getAbsoluteGravity:(II)I
        //    12: istore          4
        //    14: iload           4
        //    16: iconst_3       
        //    17: if_icmpne       29
        //    20: aload_0        
        //    21: iload_1        
        //    22: putfield        android/support/v4/widget/DrawerLayout.mLockModeLeft:I
        //    25: iload_3        
        //    26: ifeq            40
        //    29: iload           4
        //    31: iconst_5       
        //    32: if_icmpne       40
        //    35: aload_0        
        //    36: iload_1        
        //    37: putfield        android/support/v4/widget/DrawerLayout.mLockModeRight:I
        //    40: iload_1        
        //    41: ifeq            61
        //    44: iload           4
        //    46: iconst_3       
        //    47: if_icmpne       100
        //    50: aload_0        
        //    51: getfield        android/support/v4/widget/DrawerLayout.mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
        //    54: astore          9
        //    56: aload           9
        //    58: invokevirtual   android/support/v4/widget/ViewDragHelper.cancel:()V
        //    61: iload_1        
        //    62: tableswitch {
        //                2: 132
        //                3: 109
        //          default: 84
        //        }
        //    84: return         
        //    85: astore          12
        //    87: aload           12
        //    89: athrow         
        //    90: astore          11
        //    92: aload           11
        //    94: athrow         
        //    95: astore          10
        //    97: aload           10
        //    99: athrow         
        //   100: aload_0        
        //   101: getfield        android/support/v4/widget/DrawerLayout.mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
        //   104: astore          9
        //   106: goto            56
        //   109: aload_0        
        //   110: iload           4
        //   112: invokevirtual   android/support/v4/widget/DrawerLayout.findDrawerWithGravity:(I)Landroid/view/View;
        //   115: astore          7
        //   117: aload           7
        //   119: ifnull          84
        //   122: aload_0        
        //   123: aload           7
        //   125: invokevirtual   android/support/v4/widget/DrawerLayout.openDrawer:(Landroid/view/View;)V
        //   128: iload_3        
        //   129: ifeq            84
        //   132: aload_0        
        //   133: iload           4
        //   135: invokevirtual   android/support/v4/widget/DrawerLayout.findDrawerWithGravity:(I)Landroid/view/View;
        //   138: astore          5
        //   140: aload           5
        //   142: ifnull          84
        //   145: aload_0        
        //   146: aload           5
        //   148: invokevirtual   android/support/v4/widget/DrawerLayout.closeDrawer:(Landroid/view/View;)V
        //   151: return         
        //   152: astore          6
        //   154: aload           6
        //   156: athrow         
        //   157: astore          8
        //   159: aload           8
        //   161: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  20     25     85     90     Ljava/lang/IllegalArgumentException;
        //  35     40     90     95     Ljava/lang/IllegalArgumentException;
        //  50     56     95     100    Ljava/lang/IllegalArgumentException;
        //  87     90     90     95     Ljava/lang/IllegalArgumentException;
        //  122    128    157    162    Ljava/lang/IllegalArgumentException;
        //  145    151    152    157    Ljava/lang/IllegalArgumentException;
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
    
    void setDrawerViewOffset(final View view, final float onScreen) {
        final DrawerLayout$LayoutParams drawerLayout$LayoutParams = (DrawerLayout$LayoutParams)view.getLayoutParams();
        try {
            if (onScreen == drawerLayout$LayoutParams.onScreen) {
                return;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        this.dispatchOnDrawerSlide(view, drawerLayout$LayoutParams.onScreen = onScreen);
    }
    
    void updateDrawerState(final int p0, final int p1, final View p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore          4
        //     3: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //     6: istore          5
        //     8: aload_0        
        //     9: getfield        android/support/v4/widget/DrawerLayout.mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
        //    12: invokevirtual   android/support/v4/widget/ViewDragHelper.getViewDragState:()I
        //    15: istore          6
        //    17: aload_0        
        //    18: getfield        android/support/v4/widget/DrawerLayout.mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
        //    21: invokevirtual   android/support/v4/widget/ViewDragHelper.getViewDragState:()I
        //    24: istore          7
        //    26: iload           6
        //    28: iconst_1       
        //    29: if_icmpeq       38
        //    32: iload           7
        //    34: iconst_1       
        //    35: if_icmpne       43
        //    38: iload           5
        //    40: ifeq            184
        //    43: iload           6
        //    45: iload           4
        //    47: if_icmpeq       57
        //    50: iload           7
        //    52: iload           4
        //    54: if_icmpne       62
        //    57: iload           5
        //    59: ifeq            65
        //    62: iconst_0       
        //    63: istore          4
        //    65: aload_3        
        //    66: ifnull          121
        //    69: iload_2        
        //    70: ifne            121
        //    73: aload_3        
        //    74: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //    77: checkcast       Landroid/support/v4/widget/DrawerLayout$LayoutParams;
        //    80: astore          11
        //    82: aload           11
        //    84: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.onScreen:F
        //    87: fstore          15
        //    89: fload           15
        //    91: fconst_0       
        //    92: fcmpl          
        //    93: ifne            106
        //    96: aload_0        
        //    97: aload_3        
        //    98: invokevirtual   android/support/v4/widget/DrawerLayout.dispatchOnDrawerClosed:(Landroid/view/View;)V
        //   101: iload           5
        //   103: ifeq            121
        //   106: aload           11
        //   108: getfield        android/support/v4/widget/DrawerLayout$LayoutParams.onScreen:F
        //   111: fconst_1       
        //   112: fcmpl          
        //   113: ifne            121
        //   116: aload_0        
        //   117: aload_3        
        //   118: invokevirtual   android/support/v4/widget/DrawerLayout.dispatchOnDrawerOpened:(Landroid/view/View;)V
        //   121: aload_0        
        //   122: getfield        android/support/v4/widget/DrawerLayout.mDrawerState:I
        //   125: istore          10
        //   127: iload           4
        //   129: iload           10
        //   131: if_icmpeq       158
        //   134: aload_0        
        //   135: iload           4
        //   137: putfield        android/support/v4/widget/DrawerLayout.mDrawerState:I
        //   140: aload_0        
        //   141: getfield        android/support/v4/widget/DrawerLayout.mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
        //   144: ifnull          158
        //   147: aload_0        
        //   148: getfield        android/support/v4/widget/DrawerLayout.mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
        //   151: iload           4
        //   153: invokeinterface android/support/v4/widget/DrawerLayout$DrawerListener.onDrawerStateChanged:(I)V
        //   158: return         
        //   159: astore          12
        //   161: aload           12
        //   163: athrow         
        //   164: astore          13
        //   166: aload           13
        //   168: athrow         
        //   169: astore          14
        //   171: aload           14
        //   173: athrow         
        //   174: astore          8
        //   176: aload           8
        //   178: athrow         
        //   179: astore          9
        //   181: aload           9
        //   183: athrow         
        //   184: iconst_1       
        //   185: istore          4
        //   187: goto            65
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  82     89     159    164    Ljava/lang/IllegalArgumentException;
        //  96     101    164    169    Ljava/lang/IllegalArgumentException;
        //  106    121    169    174    Ljava/lang/IllegalArgumentException;
        //  121    127    174    179    Ljava/lang/IllegalArgumentException;
        //  134    158    179    184    Ljava/lang/IllegalArgumentException;
        //  161    164    164    169    Ljava/lang/IllegalArgumentException;
        //  166    169    169    174    Ljava/lang/IllegalArgumentException;
        //  176    179    179    184    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 93, Size: 93
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
