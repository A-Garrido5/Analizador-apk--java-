// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.view.View$MeasureSpec;
import android.view.ViewConfiguration;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityEvent;
import android.view.KeyEvent;
import android.view.FocusFinder;
import android.util.Log;
import android.view.SoundEffectConstants;
import android.view.ViewGroup$LayoutParams;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.view.View;
import android.content.res.Resources$NotFoundException;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.content.Context;
import android.view.VelocityTracker;
import android.graphics.Rect;
import java.lang.reflect.Method;
import android.widget.Scroller;
import android.os.Parcelable;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.EdgeEffectCompat;
import java.util.ArrayList;
import android.view.animation.Interpolator;
import java.util.Comparator;
import android.view.ViewGroup;

public class ViewPager extends ViewGroup
{
    private static final Comparator COMPARATOR;
    private static final int[] LAYOUT_ATTRS;
    public static int a;
    private static final Interpolator sInterpolator;
    private static final ViewPager$ViewPositionComparator sPositionComparator;
    private static final String[] z;
    private int mActivePointerId;
    private PagerAdapter mAdapter;
    private ViewPager$OnAdapterChangeListener mAdapterChangeListener;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    private int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private ViewPager$OnPageChangeListener mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsUnableToDrag;
    private final ArrayList mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffectCompat mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private ViewPager$PagerObserver mObserver;
    private int mOffscreenPageLimit;
    private ViewPager$OnPageChangeListener mOnPageChangeListener;
    private int mPageMargin;
    private ViewPager$PageTransformer mPageTransformer;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffectCompat mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private Method mSetChildrenDrawingOrderEnabled;
    private final ViewPager$ItemInfo mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    
    static {
        final String[] z2 = new String[19];
        String s = "\u0015OB`,FVLc`\u000e\u001bIjjTNA{e[\\\r{c\u0015";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0507:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\f';
                        break;
                    }
                    case 0: {
                        c2 = '5';
                        break;
                    }
                    case 1: {
                        c2 = ';';
                        break;
                    }
                    case 2: {
                        c2 = '-';
                        break;
                    }
                    case 3: {
                        c2 = '\u000f';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "g^\\ziFOHk,Z]K|oG^Ha,EZJj,YR@fx\u0015";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "cRHx\\T\\H}";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "ZU}nkPhN}cYWHk,QRI/bZO\rlmYW\r|yE^_l`TH^/eXKAjaPUYnx\\TC";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "ZU}nkPhN}cYWHk,QRI/bZO\rlmYW\r|yE^_l`TH^/eXKAjaPUYnx\\TC";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "aSH/mEKAfoTOD`b\u0012H\r_mR^_NhTKYj~\u0015XEnbR^I/x]^\rnhTKYj~\u0012H\rlc[OHaxF\u001bZfx]TX{,VZAce[\\\r_mR^_NhTKYj~\u0016UB{eSBinxThH{O]ZChiQ\u001a\rJtE^N{iQ\u001bLkmEOH},\\OHb,VTXax\u000f\u001b";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0015k_`nY^@nx\\X\rnhTKYj~\u000f\u001b";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0019\u001bK`y[_\u0017/";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u0015kLhiG\u001bNcmFH\u0017/";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u0015kLhiG\u001bDk6\u0015";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "vZCacA\u001bLkh\u0015KLhiG\u001bIjoZI\ryePL\rkyGRCh,YZT`yA";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "cRHx\\T\\H}";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    s = "pI_`~\u0015XEnbRRCh,VSDchG^C/hGZZfbR\u001bB}hPI";
                    n = 11;
                    n2 = 12;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    array = z2;
                    s = "F^YLd\\WI}i[\u007f_n{\\UJ@~Q^_JbTYAjh";
                    n = 12;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "vZC(x\u0015]Dah\u0015HH{O]RAk~PUi}mBRChCG_H}I[ZOciQ";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    s = "cRHx\\T\\H}";
                    n = 14;
                    n2 = 15;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    array = z2;
                    s = "TI_`{fX_``Y\u001bY}eP_\r{c\u0015]Dah\u0015]BlyF\u001bOn\u007fP_\r`b\u0015UBa!VSDch\u0015XX}~PUY/jZXX|iQ\u001b[fiB\u001b";
                    n = 15;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "cRHx\\T\\H}";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\u0015\u0006\u0013/";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    break Label_0507;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        LAYOUT_ATTRS = new int[] { 16842931 };
        COMPARATOR = new ViewPager$1();
        sInterpolator = (Interpolator)new ViewPager$2();
        sPositionComparator = new ViewPager$ViewPositionComparator();
    }
    
    public ViewPager(final Context context) {
        super(context);
        this.mItems = new ArrayList();
        this.mTempItem = new ViewPager$ItemInfo();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new ViewPager$3(this);
        this.mScrollState = 0;
        this.initViewPager();
    }
    
    public ViewPager(final Context context, final AttributeSet set) {
        super(context, set);
        this.mItems = new ArrayList();
        this.mTempItem = new ViewPager$ItemInfo();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new ViewPager$3(this);
        this.mScrollState = 0;
        this.initViewPager();
    }
    
    static void access$000(final ViewPager viewPager, final int scrollState) {
        viewPager.setScrollState(scrollState);
    }
    
    static PagerAdapter access$200(final ViewPager viewPager) {
        return viewPager.mAdapter;
    }
    
    static int access$300(final ViewPager viewPager) {
        return viewPager.mCurItem;
    }
    
    static int[] access$400() {
        return ViewPager.LAYOUT_ATTRS;
    }
    
    private void calculatePageOffsets(final ViewPager$ItemInfo p0, final int p1, final ViewPager$ItemInfo p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/view/ViewPager.a:I
        //     3: istore          4
        //     5: aload_0        
        //     6: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //     9: invokevirtual   android/support/v4/view/PagerAdapter.getCount:()I
        //    12: istore          5
        //    14: aload_0        
        //    15: invokespecial   android/support/v4/view/ViewPager.getClientWidth:()I
        //    18: istore          6
        //    20: iload           6
        //    22: ifle            818
        //    25: aload_0        
        //    26: getfield        android/support/v4/view/ViewPager.mPageMargin:I
        //    29: istore          63
        //    31: iload           63
        //    33: i2f            
        //    34: iload           6
        //    36: i2f            
        //    37: fdiv           
        //    38: fstore          7
        //    40: aload_3        
        //    41: ifnull          449
        //    44: aload_3        
        //    45: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //    48: istore          37
        //    50: iload           37
        //    52: aload_1        
        //    53: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //    56: if_icmpge       258
        //    59: iconst_0       
        //    60: istore          51
        //    62: fload           7
        //    64: aload_3        
        //    65: getfield        android/support/v4/view/ViewPager$ItemInfo.offset:F
        //    68: aload_3        
        //    69: getfield        android/support/v4/view/ViewPager$ItemInfo.widthFactor:F
        //    72: fadd           
        //    73: fadd           
        //    74: fstore          52
        //    76: iload           37
        //    78: iconst_1       
        //    79: iadd           
        //    80: istore          53
        //    82: iload           53
        //    84: aload_1        
        //    85: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //    88: if_icmpgt       253
        //    91: iload           51
        //    93: aload_0        
        //    94: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //    97: invokevirtual   java/util/ArrayList.size:()I
        //   100: if_icmpge       253
        //   103: aload_0        
        //   104: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   107: iload           51
        //   109: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   112: checkcast       Landroid/support/v4/view/ViewPager$ItemInfo;
        //   115: astore          54
        //   117: iload           53
        //   119: aload           54
        //   121: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   124: if_icmple       163
        //   127: iload           51
        //   129: iconst_m1      
        //   130: aload_0        
        //   131: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   134: invokevirtual   java/util/ArrayList.size:()I
        //   137: iadd           
        //   138: if_icmpge       163
        //   141: iinc            51, 1
        //   144: aload_0        
        //   145: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   148: iload           51
        //   150: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   153: checkcast       Landroid/support/v4/view/ViewPager$ItemInfo;
        //   156: astore          54
        //   158: iload           4
        //   160: ifeq            117
        //   163: iload           53
        //   165: istore          55
        //   167: aload           54
        //   169: astore          56
        //   171: iload           55
        //   173: istore          57
        //   175: fload           52
        //   177: fstore          58
        //   179: iload           51
        //   181: istore          59
        //   183: fload           58
        //   185: fstore          60
        //   187: iload           57
        //   189: aload           56
        //   191: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   194: if_icmpge       222
        //   197: fload           60
        //   199: fload           7
        //   201: aload_0        
        //   202: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //   205: iload           57
        //   207: invokevirtual   android/support/v4/view/PagerAdapter.getPageWidth:(I)F
        //   210: fadd           
        //   211: fadd           
        //   212: fstore          60
        //   214: iinc            57, 1
        //   217: iload           4
        //   219: ifeq            187
        //   222: aload           56
        //   224: fload           60
        //   226: putfield        android/support/v4/view/ViewPager$ItemInfo.offset:F
        //   229: fload           60
        //   231: fload           7
        //   233: aload           56
        //   235: getfield        android/support/v4/view/ViewPager$ItemInfo.widthFactor:F
        //   238: fadd           
        //   239: fadd           
        //   240: fstore          61
        //   242: iload           57
        //   244: iconst_1       
        //   245: iadd           
        //   246: istore          53
        //   248: iload           4
        //   250: ifeq            940
        //   253: iload           4
        //   255: ifeq            449
        //   258: aload_1        
        //   259: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   262: istore          39
        //   264: iload           37
        //   266: iload           39
        //   268: if_icmple       449
        //   271: iconst_m1      
        //   272: aload_0        
        //   273: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   276: invokevirtual   java/util/ArrayList.size:()I
        //   279: iadd           
        //   280: istore          40
        //   282: aload_3        
        //   283: getfield        android/support/v4/view/ViewPager$ItemInfo.offset:F
        //   286: fstore          41
        //   288: iload           37
        //   290: iconst_1       
        //   291: isub           
        //   292: istore          42
        //   294: iload           42
        //   296: aload_1        
        //   297: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   300: if_icmplt       449
        //   303: iload           40
        //   305: iflt            449
        //   308: aload_0        
        //   309: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   312: iload           40
        //   314: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   317: checkcast       Landroid/support/v4/view/ViewPager$ItemInfo;
        //   320: astore          43
        //   322: iload           42
        //   324: aload           43
        //   326: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   329: if_icmpge       359
        //   332: iload           40
        //   334: ifle            359
        //   337: iinc            40, -1
        //   340: aload_0        
        //   341: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   344: iload           40
        //   346: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   349: checkcast       Landroid/support/v4/view/ViewPager$ItemInfo;
        //   352: astore          43
        //   354: iload           4
        //   356: ifeq            322
        //   359: iload           42
        //   361: istore          44
        //   363: aload           43
        //   365: astore          45
        //   367: iload           44
        //   369: istore          46
        //   371: fload           41
        //   373: fstore          47
        //   375: iload           40
        //   377: istore          48
        //   379: fload           47
        //   381: fstore          49
        //   383: iload           46
        //   385: aload           45
        //   387: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   390: if_icmple       418
        //   393: fload           49
        //   395: fload           7
        //   397: aload_0        
        //   398: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //   401: iload           46
        //   403: invokevirtual   android/support/v4/view/PagerAdapter.getPageWidth:(I)F
        //   406: fadd           
        //   407: fsub           
        //   408: fstore          49
        //   410: iinc            46, -1
        //   413: iload           4
        //   415: ifeq            383
        //   418: fload           49
        //   420: fload           7
        //   422: aload           45
        //   424: getfield        android/support/v4/view/ViewPager$ItemInfo.widthFactor:F
        //   427: fadd           
        //   428: fsub           
        //   429: fstore          50
        //   431: aload           45
        //   433: fload           50
        //   435: putfield        android/support/v4/view/ViewPager$ItemInfo.offset:F
        //   438: iload           46
        //   440: iconst_1       
        //   441: isub           
        //   442: istore          42
        //   444: iload           4
        //   446: ifeq            929
        //   449: aload_0        
        //   450: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   453: invokevirtual   java/util/ArrayList.size:()I
        //   456: istore          8
        //   458: aload_1        
        //   459: getfield        android/support/v4/view/ViewPager$ItemInfo.offset:F
        //   462: fstore          9
        //   464: iconst_m1      
        //   465: aload_1        
        //   466: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   469: iadd           
        //   470: istore          10
        //   472: aload_1        
        //   473: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   476: ifne            834
        //   479: aload_1        
        //   480: getfield        android/support/v4/view/ViewPager$ItemInfo.offset:F
        //   483: fstore          12
        //   485: aload_0        
        //   486: fload           12
        //   488: putfield        android/support/v4/view/ViewPager.mFirstOffset:F
        //   491: aload_1        
        //   492: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   495: iload           5
        //   497: iconst_1       
        //   498: isub           
        //   499: if_icmpne       846
        //   502: aload_1        
        //   503: getfield        android/support/v4/view/ViewPager$ItemInfo.offset:F
        //   506: fstore          35
        //   508: aload_1        
        //   509: getfield        android/support/v4/view/ViewPager$ItemInfo.widthFactor:F
        //   512: fstore          36
        //   514: fload           35
        //   516: fload           36
        //   518: fadd           
        //   519: fconst_1       
        //   520: fsub           
        //   521: fstore          14
        //   523: aload_0        
        //   524: fload           14
        //   526: putfield        android/support/v4/view/ViewPager.mLastOffset:F
        //   529: iload_2        
        //   530: iconst_1       
        //   531: isub           
        //   532: istore          15
        //   534: iload           15
        //   536: iflt            650
        //   539: aload_0        
        //   540: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   543: iload           15
        //   545: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   548: checkcast       Landroid/support/v4/view/ViewPager$ItemInfo;
        //   551: astore          27
        //   553: fload           9
        //   555: fstore          28
        //   557: iload           10
        //   559: aload           27
        //   561: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   564: if_icmple       918
        //   567: aload_0        
        //   568: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //   571: astore          34
        //   573: iload           10
        //   575: iconst_1       
        //   576: isub           
        //   577: istore          29
        //   579: fload           28
        //   581: fload           7
        //   583: aload           34
        //   585: iload           10
        //   587: invokevirtual   android/support/v4/view/PagerAdapter.getPageWidth:(I)F
        //   590: fadd           
        //   591: fsub           
        //   592: fstore          30
        //   594: iload           4
        //   596: ifeq            907
        //   599: fload           30
        //   601: fload           7
        //   603: aload           27
        //   605: getfield        android/support/v4/view/ViewPager$ItemInfo.widthFactor:F
        //   608: fadd           
        //   609: fsub           
        //   610: fstore          31
        //   612: aload           27
        //   614: fload           31
        //   616: putfield        android/support/v4/view/ViewPager$ItemInfo.offset:F
        //   619: aload           27
        //   621: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   624: ifne            633
        //   627: aload_0        
        //   628: fload           31
        //   630: putfield        android/support/v4/view/ViewPager.mFirstOffset:F
        //   633: iload           15
        //   635: iconst_1       
        //   636: isub           
        //   637: istore          33
        //   639: iload           29
        //   641: iconst_1       
        //   642: isub           
        //   643: istore          10
        //   645: iload           4
        //   647: ifeq            896
        //   650: fload           7
        //   652: aload_1        
        //   653: getfield        android/support/v4/view/ViewPager$ItemInfo.offset:F
        //   656: aload_1        
        //   657: getfield        android/support/v4/view/ViewPager$ItemInfo.widthFactor:F
        //   660: fadd           
        //   661: fadd           
        //   662: fstore          16
        //   664: iconst_1       
        //   665: aload_1        
        //   666: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   669: iadd           
        //   670: istore          17
        //   672: iload_2        
        //   673: iconst_1       
        //   674: iadd           
        //   675: istore          18
        //   677: iload           18
        //   679: iload           8
        //   681: if_icmpge       807
        //   684: aload_0        
        //   685: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   688: iload           18
        //   690: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   693: checkcast       Landroid/support/v4/view/ViewPager$ItemInfo;
        //   696: astore          19
        //   698: fload           16
        //   700: fstore          20
        //   702: iload           17
        //   704: aload           19
        //   706: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   709: if_icmpge       885
        //   712: aload_0        
        //   713: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //   716: astore          26
        //   718: iload           17
        //   720: iconst_1       
        //   721: iadd           
        //   722: istore          21
        //   724: fload           20
        //   726: fload           7
        //   728: aload           26
        //   730: iload           17
        //   732: invokevirtual   android/support/v4/view/PagerAdapter.getPageWidth:(I)F
        //   735: fadd           
        //   736: fadd           
        //   737: fstore          22
        //   739: iload           4
        //   741: ifeq            874
        //   744: aload           19
        //   746: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   749: iload           5
        //   751: iconst_1       
        //   752: isub           
        //   753: if_icmpne       770
        //   756: aload_0        
        //   757: fload           22
        //   759: aload           19
        //   761: getfield        android/support/v4/view/ViewPager$ItemInfo.widthFactor:F
        //   764: fadd           
        //   765: fconst_1       
        //   766: fsub           
        //   767: putfield        android/support/v4/view/ViewPager.mLastOffset:F
        //   770: aload           19
        //   772: fload           22
        //   774: putfield        android/support/v4/view/ViewPager$ItemInfo.offset:F
        //   777: fload           22
        //   779: fload           7
        //   781: aload           19
        //   783: getfield        android/support/v4/view/ViewPager$ItemInfo.widthFactor:F
        //   786: fadd           
        //   787: fadd           
        //   788: fstore          24
        //   790: iload           18
        //   792: iconst_1       
        //   793: iadd           
        //   794: istore          25
        //   796: iload           21
        //   798: iconst_1       
        //   799: iadd           
        //   800: istore          17
        //   802: iload           4
        //   804: ifeq            863
        //   807: aload_0        
        //   808: iconst_0       
        //   809: putfield        android/support/v4/view/ViewPager.mNeedCalculatePageOffsets:Z
        //   812: return         
        //   813: astore          62
        //   815: aload           62
        //   817: athrow         
        //   818: fconst_0       
        //   819: fstore          7
        //   821: goto            40
        //   824: astore          38
        //   826: aload           38
        //   828: athrow         
        //   829: astore          11
        //   831: aload           11
        //   833: athrow         
        //   834: ldc             -3.4028235E38
        //   836: fstore          12
        //   838: goto            485
        //   841: astore          13
        //   843: aload           13
        //   845: athrow         
        //   846: ldc             3.4028235E38
        //   848: fstore          14
        //   850: goto            523
        //   853: astore          32
        //   855: aload           32
        //   857: athrow         
        //   858: astore          23
        //   860: aload           23
        //   862: athrow         
        //   863: iload           25
        //   865: istore          18
        //   867: fload           24
        //   869: fstore          16
        //   871: goto            677
        //   874: fload           22
        //   876: fstore          20
        //   878: iload           21
        //   880: istore          17
        //   882: goto            702
        //   885: iload           17
        //   887: istore          21
        //   889: fload           20
        //   891: fstore          22
        //   893: goto            744
        //   896: iload           33
        //   898: istore          15
        //   900: fload           31
        //   902: fstore          9
        //   904: goto            534
        //   907: fload           30
        //   909: fstore          28
        //   911: iload           29
        //   913: istore          10
        //   915: goto            557
        //   918: iload           10
        //   920: istore          29
        //   922: fload           28
        //   924: fstore          30
        //   926: goto            599
        //   929: iload           48
        //   931: istore          40
        //   933: fload           50
        //   935: fstore          41
        //   937: goto            294
        //   940: iload           59
        //   942: istore          51
        //   944: fload           61
        //   946: fstore          52
        //   948: goto            82
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  25     31     813    818    Landroid/content/res/Resources$NotFoundException;
        //  258    264    824    829    Landroid/content/res/Resources$NotFoundException;
        //  472    485    829    834    Landroid/content/res/Resources$NotFoundException;
        //  485    514    841    846    Landroid/content/res/Resources$NotFoundException;
        //  612    633    853    858    Landroid/content/res/Resources$NotFoundException;
        //  744    770    858    863    Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 471, Size: 471
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
    
    private void completeScroll(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/view/ViewPager.a:I
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        android/support/v4/view/ViewPager.mScrollState:I
        //     8: istore          4
        //    10: iload           4
        //    12: iconst_2       
        //    13: if_icmpne       201
        //    16: iconst_1       
        //    17: istore          5
        //    19: iload           5
        //    21: ifeq            102
        //    24: aload_0        
        //    25: iconst_0       
        //    26: invokespecial   android/support/v4/view/ViewPager.setScrollingCacheEnabled:(Z)V
        //    29: aload_0        
        //    30: getfield        android/support/v4/view/ViewPager.mScroller:Landroid/widget/Scroller;
        //    33: invokevirtual   android/widget/Scroller.abortAnimation:()V
        //    36: aload_0        
        //    37: invokevirtual   android/support/v4/view/ViewPager.getScrollX:()I
        //    40: istore          11
        //    42: aload_0        
        //    43: invokevirtual   android/support/v4/view/ViewPager.getScrollY:()I
        //    46: istore          12
        //    48: aload_0        
        //    49: getfield        android/support/v4/view/ViewPager.mScroller:Landroid/widget/Scroller;
        //    52: invokevirtual   android/widget/Scroller.getCurrX:()I
        //    55: istore          13
        //    57: aload_0        
        //    58: getfield        android/support/v4/view/ViewPager.mScroller:Landroid/widget/Scroller;
        //    61: invokevirtual   android/widget/Scroller.getCurrY:()I
        //    64: istore          14
        //    66: iload           11
        //    68: iload           13
        //    70: if_icmpne       80
        //    73: iload           12
        //    75: iload           14
        //    77: if_icmpeq       102
        //    80: aload_0        
        //    81: iload           13
        //    83: iload           14
        //    85: invokevirtual   android/support/v4/view/ViewPager.scrollTo:(II)V
        //    88: iload           13
        //    90: iload           11
        //    92: if_icmpeq       102
        //    95: aload_0        
        //    96: iload           13
        //    98: invokespecial   android/support/v4/view/ViewPager.pageScrolled:(I)Z
        //   101: pop            
        //   102: aload_0        
        //   103: iconst_0       
        //   104: putfield        android/support/v4/view/ViewPager.mPopulatePending:Z
        //   107: iconst_0       
        //   108: istore          6
        //   110: iload           5
        //   112: istore          7
        //   114: iload           6
        //   116: aload_0        
        //   117: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   120: invokevirtual   java/util/ArrayList.size:()I
        //   123: if_icmpge       167
        //   126: aload_0        
        //   127: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   130: iload           6
        //   132: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   135: checkcast       Landroid/support/v4/view/ViewPager$ItemInfo;
        //   138: astore          9
        //   140: aload           9
        //   142: getfield        android/support/v4/view/ViewPager$ItemInfo.scrolling:Z
        //   145: ifeq            157
        //   148: aload           9
        //   150: iconst_0       
        //   151: putfield        android/support/v4/view/ViewPager$ItemInfo.scrolling:Z
        //   154: iconst_1       
        //   155: istore          7
        //   157: iload           6
        //   159: iconst_1       
        //   160: iadd           
        //   161: istore          10
        //   163: iload_2        
        //   164: ifeq            217
        //   167: iload           7
        //   169: ifeq            197
        //   172: iload_1        
        //   173: ifeq            188
        //   176: aload_0        
        //   177: aload_0        
        //   178: getfield        android/support/v4/view/ViewPager.mEndScrollRunnable:Ljava/lang/Runnable;
        //   181: invokestatic    android/support/v4/view/ViewCompat.postOnAnimation:(Landroid/view/View;Ljava/lang/Runnable;)V
        //   184: iload_2        
        //   185: ifeq            197
        //   188: aload_0        
        //   189: getfield        android/support/v4/view/ViewPager.mEndScrollRunnable:Ljava/lang/Runnable;
        //   192: invokeinterface java/lang/Runnable.run:()V
        //   197: return         
        //   198: astore_3       
        //   199: aload_3        
        //   200: athrow         
        //   201: iconst_0       
        //   202: istore          5
        //   204: goto            19
        //   207: astore          15
        //   209: aload           15
        //   211: athrow         
        //   212: astore          8
        //   214: aload           8
        //   216: athrow         
        //   217: iload           10
        //   219: istore          6
        //   221: goto            114
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  4      10     198    201    Landroid/content/res/Resources$NotFoundException;
        //  80     88     207    212    Landroid/content/res/Resources$NotFoundException;
        //  95     102    207    212    Landroid/content/res/Resources$NotFoundException;
        //  176    184    212    217    Landroid/content/res/Resources$NotFoundException;
        //  188    197    212    217    Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 110, Size: 110
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
    
    private int determineTargetPage(final int p0, final float p1, final int p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iload           4
        //     2: invokestatic    java/lang/Math.abs:(I)I
        //     5: istore          8
        //     7: aload_0        
        //     8: getfield        android/support/v4/view/ViewPager.mFlingDistance:I
        //    11: istore          9
        //    13: iload           8
        //    15: iload           9
        //    17: if_icmple       56
        //    20: iload_3        
        //    21: invokestatic    java/lang/Math.abs:(I)I
        //    24: istore          16
        //    26: aload_0        
        //    27: getfield        android/support/v4/view/ViewPager.mMinimumVelocity:I
        //    30: istore          17
        //    32: iload           16
        //    34: iload           17
        //    36: if_icmple       56
        //    39: iload_3        
        //    40: ifle            165
        //    43: iload_1        
        //    44: istore          18
        //    46: getstatic       android/support/v4/view/ViewPager.a:I
        //    49: istore          20
        //    51: iload           20
        //    53: ifeq            191
        //    56: aload_0        
        //    57: getfield        android/support/v4/view/ViewPager.mCurItem:I
        //    60: istore          11
        //    62: iload_1        
        //    63: iload           11
        //    65: if_icmplt       183
        //    68: ldc_w           0.4
        //    71: fstore          12
        //    73: fload           12
        //    75: fload_2        
        //    76: iload_1        
        //    77: i2f            
        //    78: fadd           
        //    79: fadd           
        //    80: f2i            
        //    81: istore          13
        //    83: aload_0        
        //    84: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //    87: invokevirtual   java/util/ArrayList.size:()I
        //    90: ifle            147
        //    93: aload_0        
        //    94: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //    97: iconst_0       
        //    98: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   101: checkcast       Landroid/support/v4/view/ViewPager$ItemInfo;
        //   104: astore          14
        //   106: aload_0        
        //   107: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   110: iconst_m1      
        //   111: aload_0        
        //   112: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   115: invokevirtual   java/util/ArrayList.size:()I
        //   118: iadd           
        //   119: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   122: checkcast       Landroid/support/v4/view/ViewPager$ItemInfo;
        //   125: astore          15
        //   127: aload           14
        //   129: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   132: iload           13
        //   134: aload           15
        //   136: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   139: invokestatic    java/lang/Math.min:(II)I
        //   142: invokestatic    java/lang/Math.max:(II)I
        //   145: istore          13
        //   147: iload           13
        //   149: ireturn        
        //   150: astore          5
        //   152: aload           5
        //   154: athrow         
        //   155: astore          6
        //   157: aload           6
        //   159: athrow         
        //   160: astore          7
        //   162: aload           7
        //   164: athrow         
        //   165: iload_1        
        //   166: iconst_1       
        //   167: iadd           
        //   168: istore          18
        //   170: goto            46
        //   173: astore          19
        //   175: aload           19
        //   177: athrow         
        //   178: astore          10
        //   180: aload           10
        //   182: athrow         
        //   183: ldc_w           0.6
        //   186: fstore          12
        //   188: goto            73
        //   191: iload           18
        //   193: istore          13
        //   195: goto            83
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  0      13     150    155    Landroid/content/res/Resources$NotFoundException;
        //  20     32     155    165    Landroid/content/res/Resources$NotFoundException;
        //  46     51     173    178    Landroid/content/res/Resources$NotFoundException;
        //  56     62     178    183    Landroid/content/res/Resources$NotFoundException;
        //  152    155    155    165    Landroid/content/res/Resources$NotFoundException;
        //  157    160    160    165    Landroid/content/res/Resources$NotFoundException;
        //  175    178    178    183    Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 98, Size: 98
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
    
    private void enableLayers(final boolean b) {
        final int a = ViewPager.a;
        int n2;
        for (int childCount = this.getChildCount(), i = 0; i < childCount; i = n2) {
            int n;
            if (b) {
                n = 2;
            }
            else {
                n = 0;
            }
            ViewCompat.setLayerType(this.getChildAt(i), n, null);
            n2 = i + 1;
            if (a != 0) {
                break;
            }
        }
    }
    
    private void endDrag() {
        try {
            this.mIsBeingDragged = false;
            this.mIsUnableToDrag = false;
            if (this.mVelocityTracker != null) {
                this.mVelocityTracker.recycle();
                this.mVelocityTracker = null;
            }
        }
        catch (Resources$NotFoundException ex) {
            throw ex;
        }
    }
    
    private Rect getChildRectInPagerCoordinates(final Rect rect, final View view) {
        final int a = ViewPager.a;
        Rect rect2;
        if (rect == null) {
            rect2 = new Rect();
        }
        else {
            rect2 = rect;
        }
        if (view == null) {
            try {
                rect2.set(0, 0, 0, 0);
                return rect2;
            }
            catch (Resources$NotFoundException ex) {
                throw ex;
            }
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewParent viewParent = view.getParent();
        while (viewParent instanceof ViewGroup && viewParent != this) {
            final ViewPager viewPager = (ViewPager)viewParent;
            rect2.left += viewPager.getLeft();
            rect2.right += viewPager.getRight();
            rect2.top += viewPager.getTop();
            rect2.bottom += viewPager.getBottom();
            viewParent = viewPager.getParent();
            if (a != 0) {
                break;
            }
        }
        return rect2;
    }
    
    private int getClientWidth() {
        return this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight();
    }
    
    private ViewPager$ItemInfo infoForCurrentScrollPosition() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/view/ViewPager.a:I
        //     3: istore_1       
        //     4: aload_0        
        //     5: invokespecial   android/support/v4/view/ViewPager.getClientWidth:()I
        //     8: istore_2       
        //     9: iload_2        
        //    10: ifle            229
        //    13: aload_0        
        //    14: invokevirtual   android/support/v4/view/ViewPager.getScrollX:()I
        //    17: istore          27
        //    19: iload           27
        //    21: i2f            
        //    22: iload_2        
        //    23: i2f            
        //    24: fdiv           
        //    25: fstore_3       
        //    26: iload_2        
        //    27: ifle            239
        //    30: aload_0        
        //    31: getfield        android/support/v4/view/ViewPager.mPageMargin:I
        //    34: istore          25
        //    36: iload           25
        //    38: i2f            
        //    39: iload_2        
        //    40: i2f            
        //    41: fdiv           
        //    42: fstore          4
        //    44: fconst_0       
        //    45: fstore          5
        //    47: fconst_0       
        //    48: fstore          6
        //    50: iconst_m1      
        //    51: istore          7
        //    53: iconst_0       
        //    54: istore          8
        //    56: iconst_1       
        //    57: istore          9
        //    59: aconst_null    
        //    60: astore          10
        //    62: iload           8
        //    64: aload_0        
        //    65: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //    68: invokevirtual   java/util/ArrayList.size:()I
        //    71: if_icmpge       319
        //    74: aload_0        
        //    75: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //    78: iload           8
        //    80: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    83: checkcast       Landroid/support/v4/view/ViewPager$ItemInfo;
        //    86: astore          11
        //    88: iload           9
        //    90: ifne            308
        //    93: aload           11
        //    95: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //    98: istore          22
        //   100: iload           22
        //   102: iload           7
        //   104: iconst_1       
        //   105: iadd           
        //   106: if_icmpeq       308
        //   109: aload_0        
        //   110: getfield        android/support/v4/view/ViewPager.mTempItem:Landroid/support/v4/view/ViewPager$ItemInfo;
        //   113: astore          23
        //   115: aload           23
        //   117: fload           4
        //   119: fload           5
        //   121: fload           6
        //   123: fadd           
        //   124: fadd           
        //   125: putfield        android/support/v4/view/ViewPager$ItemInfo.offset:F
        //   128: aload           23
        //   130: iload           7
        //   132: iconst_1       
        //   133: iadd           
        //   134: putfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   137: aload           23
        //   139: aload_0        
        //   140: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //   143: aload           23
        //   145: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   148: invokevirtual   android/support/v4/view/PagerAdapter.getPageWidth:(I)F
        //   151: putfield        android/support/v4/view/ViewPager$ItemInfo.widthFactor:F
        //   154: iload           8
        //   156: iconst_1       
        //   157: isub           
        //   158: istore          12
        //   160: aload           23
        //   162: astore          13
        //   164: aload           13
        //   166: getfield        android/support/v4/view/ViewPager$ItemInfo.offset:F
        //   169: fstore          14
        //   171: fload           4
        //   173: fload           14
        //   175: aload           13
        //   177: getfield        android/support/v4/view/ViewPager$ItemInfo.widthFactor:F
        //   180: fadd           
        //   181: fadd           
        //   182: fstore          15
        //   184: iload           9
        //   186: ifne            196
        //   189: fload_3        
        //   190: fload           14
        //   192: fcmpl          
        //   193: iflt            255
        //   196: fload_3        
        //   197: fload           15
        //   199: fcmpg          
        //   200: iflt            221
        //   203: aload_0        
        //   204: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   207: invokevirtual   java/util/ArrayList.size:()I
        //   210: istore          17
        //   212: iload           12
        //   214: iload           17
        //   216: iconst_1       
        //   217: isub           
        //   218: if_icmpne       258
        //   221: aload           13
        //   223: areturn        
        //   224: astore          26
        //   226: aload           26
        //   228: athrow         
        //   229: fconst_0       
        //   230: fstore_3       
        //   231: goto            26
        //   234: astore          24
        //   236: aload           24
        //   238: athrow         
        //   239: fconst_0       
        //   240: fstore          4
        //   242: goto            44
        //   245: astore          21
        //   247: aload           21
        //   249: athrow         
        //   250: astore          16
        //   252: aload           16
        //   254: athrow         
        //   255: aload           10
        //   257: areturn        
        //   258: aload           13
        //   260: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   263: istore          18
        //   265: aload           13
        //   267: getfield        android/support/v4/view/ViewPager$ItemInfo.widthFactor:F
        //   270: fstore          19
        //   272: iload           12
        //   274: iconst_1       
        //   275: iadd           
        //   276: istore          20
        //   278: iload_1        
        //   279: ifne            221
        //   282: fload           14
        //   284: fstore          6
        //   286: iload           18
        //   288: istore          7
        //   290: fload           19
        //   292: fstore          5
        //   294: aload           13
        //   296: astore          10
        //   298: iload           20
        //   300: istore          8
        //   302: iconst_0       
        //   303: istore          9
        //   305: goto            62
        //   308: iload           8
        //   310: istore          12
        //   312: aload           11
        //   314: astore          13
        //   316: goto            164
        //   319: aload           10
        //   321: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  13     19     224    229    Landroid/content/res/Resources$NotFoundException;
        //  30     36     234    239    Landroid/content/res/Resources$NotFoundException;
        //  93     100    245    250    Landroid/content/res/Resources$NotFoundException;
        //  203    212    250    255    Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 171, Size: 171
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
    
    private boolean isGutterDrag(final float p0, final float p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v4/view/ViewPager.mGutterSize:I
        //     4: istore          7
        //     6: fload_1        
        //     7: iload           7
        //     9: i2f            
        //    10: fcmpg          
        //    11: ifge            20
        //    14: fload_2        
        //    15: fconst_0       
        //    16: fcmpl          
        //    17: ifgt            49
        //    20: aload_0        
        //    21: invokevirtual   android/support/v4/view/ViewPager.getWidth:()I
        //    24: istore          8
        //    26: aload_0        
        //    27: getfield        android/support/v4/view/ViewPager.mGutterSize:I
        //    30: istore          9
        //    32: fload_1        
        //    33: iload           8
        //    35: iload           9
        //    37: isub           
        //    38: i2f            
        //    39: fcmpl          
        //    40: ifle            69
        //    43: fload_2        
        //    44: fconst_0       
        //    45: fcmpg          
        //    46: ifge            69
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
        //    64: astore          6
        //    66: aload           6
        //    68: athrow         
        //    69: iconst_0       
        //    70: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  0      6      51     59     Landroid/content/res/Resources$NotFoundException;
        //  20     32     59     69     Landroid/content/res/Resources$NotFoundException;
        //  52     54     54     59     Landroid/content/res/Resources$NotFoundException;
        //  56     59     59     69     Landroid/content/res/Resources$NotFoundException;
        //  61     64     64     69     Landroid/content/res/Resources$NotFoundException;
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
    
    private void onSecondaryPointerUp(final MotionEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: invokestatic    android/support/v4/view/MotionEventCompat.getActionIndex:(Landroid/view/MotionEvent;)I
        //     4: istore_2       
        //     5: aload_1        
        //     6: iload_2        
        //     7: invokestatic    android/support/v4/view/MotionEventCompat.getPointerId:(Landroid/view/MotionEvent;I)I
        //    10: istore_3       
        //    11: aload_0        
        //    12: getfield        android/support/v4/view/ViewPager.mActivePointerId:I
        //    15: istore          6
        //    17: iload_3        
        //    18: iload           6
        //    20: if_icmpne       64
        //    23: iload_2        
        //    24: ifne            75
        //    27: iconst_1       
        //    28: istore          7
        //    30: aload_0        
        //    31: aload_1        
        //    32: iload           7
        //    34: invokestatic    android/support/v4/view/MotionEventCompat.getX:(Landroid/view/MotionEvent;I)F
        //    37: putfield        android/support/v4/view/ViewPager.mLastMotionX:F
        //    40: aload_0        
        //    41: aload_1        
        //    42: iload           7
        //    44: invokestatic    android/support/v4/view/MotionEventCompat.getPointerId:(Landroid/view/MotionEvent;I)I
        //    47: putfield        android/support/v4/view/ViewPager.mActivePointerId:I
        //    50: aload_0        
        //    51: getfield        android/support/v4/view/ViewPager.mVelocityTracker:Landroid/view/VelocityTracker;
        //    54: ifnull          64
        //    57: aload_0        
        //    58: getfield        android/support/v4/view/ViewPager.mVelocityTracker:Landroid/view/VelocityTracker;
        //    61: invokevirtual   android/view/VelocityTracker.clear:()V
        //    64: return         
        //    65: astore          4
        //    67: aload           4
        //    69: athrow         
        //    70: astore          5
        //    72: aload           5
        //    74: athrow         
        //    75: iconst_0       
        //    76: istore          7
        //    78: goto            30
        //    81: astore          8
        //    83: aload           8
        //    85: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  11     17     65     75     Landroid/content/res/Resources$NotFoundException;
        //  30     64     81     86     Landroid/content/res/Resources$NotFoundException;
        //  67     70     70     75     Landroid/content/res/Resources$NotFoundException;
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
    
    private boolean pageScrolled(final int n) {
        try {
            if (this.mItems.size() == 0) {
                try {
                    this.mCalledSuper = false;
                    this.onPageScrolled(0, 0.0f, 0);
                    final boolean mCalledSuper = this.mCalledSuper;
                    final boolean b = false;
                    if (!mCalledSuper) {
                        throw new IllegalStateException(ViewPager.z[4]);
                    }
                    return b;
                }
                catch (Resources$NotFoundException ex) {
                    throw ex;
                }
            }
        }
        catch (Resources$NotFoundException ex2) {
            throw ex2;
        }
        final ViewPager$ItemInfo infoForCurrentScrollPosition = this.infoForCurrentScrollPosition();
        final int clientWidth = this.getClientWidth();
        final int n2 = clientWidth + this.mPageMargin;
        final float n3 = this.mPageMargin / clientWidth;
        final int position = infoForCurrentScrollPosition.position;
        final float n4 = (n / clientWidth - infoForCurrentScrollPosition.offset) / (n3 + infoForCurrentScrollPosition.widthFactor);
        final int n5 = (int)(n4 * n2);
        try {
            this.mCalledSuper = false;
            this.onPageScrolled(position, n4, n5);
            if (!this.mCalledSuper) {
                throw new IllegalStateException(ViewPager.z[3]);
            }
        }
        catch (Resources$NotFoundException ex3) {
            throw ex3;
        }
        return true;
    }
    
    private boolean performDrag(final float mLastMotionX) {
        boolean b = true;
        final float n = this.mLastMotionX - mLastMotionX;
        this.mLastMotionX = mLastMotionX;
        final float n2 = n + this.getScrollX();
        final int clientWidth = this.getClientWidth();
        float n3 = clientWidth * this.mFirstOffset;
        final float n4 = clientWidth * this.mLastOffset;
        final ViewPager$ItemInfo viewPager$ItemInfo = this.mItems.get(0);
        final ViewPager$ItemInfo viewPager$ItemInfo2 = this.mItems.get(-1 + this.mItems.size());
        boolean b2;
        if (viewPager$ItemInfo.position != 0) {
            n3 = viewPager$ItemInfo.offset * clientWidth;
            b2 = false;
        }
        else {
            b2 = b;
        }
        float n5;
        if (viewPager$ItemInfo2.position != -1 + this.mAdapter.getCount()) {
            n5 = viewPager$ItemInfo2.offset * clientWidth;
            b = false;
        }
        else {
            n5 = n4;
        }
        Label_0190: {
            if (n2 >= n3) {
                n3 = n2;
                final boolean onPull = false;
                break Label_0190;
            }
            boolean onPull2 = false;
            if (b2) {
                onPull2 = this.mLeftEdge.onPull(Math.abs(n3 - n2) / clientWidth);
            }
            while (true) {
                while (true) {
                    try {
                        if (ViewPager.a != 0) {
                            boolean onPull = onPull2;
                            if (n3 > n5) {
                                if (b) {
                                    onPull = this.mRightEdge.onPull(Math.abs(n3 - n5) / clientWidth);
                                }
                                n3 = n5;
                            }
                            this.mLastMotionX += n3 - (int)n3;
                            this.scrollTo((int)n3, this.getScrollY());
                            this.pageScrolled((int)n3);
                            return onPull;
                        }
                    }
                    catch (Resources$NotFoundException ex) {
                        try {
                            throw ex;
                        }
                        catch (Resources$NotFoundException ex2) {
                            throw ex2;
                        }
                    }
                    boolean onPull = onPull2;
                    continue;
                }
            }
        }
    }
    
    private void recomputeScrollPosition(final int p0, final int p1, final int p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iload_2        
        //     1: ifle            140
        //     4: aload_0        
        //     5: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //     8: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //    11: istore          12
        //    13: iload           12
        //    15: ifne            140
        //    18: iload_3        
        //    19: iload_1        
        //    20: aload_0        
        //    21: invokevirtual   android/support/v4/view/ViewPager.getPaddingLeft:()I
        //    24: isub           
        //    25: aload_0        
        //    26: invokevirtual   android/support/v4/view/ViewPager.getPaddingRight:()I
        //    29: isub           
        //    30: iadd           
        //    31: istore          13
        //    33: iload           4
        //    35: iload_2        
        //    36: aload_0        
        //    37: invokevirtual   android/support/v4/view/ViewPager.getPaddingLeft:()I
        //    40: isub           
        //    41: aload_0        
        //    42: invokevirtual   android/support/v4/view/ViewPager.getPaddingRight:()I
        //    45: isub           
        //    46: iadd           
        //    47: istore          14
        //    49: aload_0        
        //    50: invokevirtual   android/support/v4/view/ViewPager.getScrollX:()I
        //    53: i2f            
        //    54: iload           14
        //    56: i2f            
        //    57: fdiv           
        //    58: iload           13
        //    60: i2f            
        //    61: fmul           
        //    62: f2i            
        //    63: istore          15
        //    65: aload_0        
        //    66: iload           15
        //    68: aload_0        
        //    69: invokevirtual   android/support/v4/view/ViewPager.getScrollY:()I
        //    72: invokevirtual   android/support/v4/view/ViewPager.scrollTo:(II)V
        //    75: aload_0        
        //    76: getfield        android/support/v4/view/ViewPager.mScroller:Landroid/widget/Scroller;
        //    79: invokevirtual   android/widget/Scroller.isFinished:()Z
        //    82: ifne            134
        //    85: aload_0        
        //    86: getfield        android/support/v4/view/ViewPager.mScroller:Landroid/widget/Scroller;
        //    89: invokevirtual   android/widget/Scroller.getDuration:()I
        //    92: aload_0        
        //    93: getfield        android/support/v4/view/ViewPager.mScroller:Landroid/widget/Scroller;
        //    96: invokevirtual   android/widget/Scroller.timePassed:()I
        //    99: isub           
        //   100: istore          16
        //   102: aload_0        
        //   103: aload_0        
        //   104: getfield        android/support/v4/view/ViewPager.mCurItem:I
        //   107: invokevirtual   android/support/v4/view/ViewPager.infoForPosition:(I)Landroid/support/v4/view/ViewPager$ItemInfo;
        //   110: astore          17
        //   112: aload_0        
        //   113: getfield        android/support/v4/view/ViewPager.mScroller:Landroid/widget/Scroller;
        //   116: iload           15
        //   118: iconst_0       
        //   119: aload           17
        //   121: getfield        android/support/v4/view/ViewPager$ItemInfo.offset:F
        //   124: iload_1        
        //   125: i2f            
        //   126: fmul           
        //   127: f2i            
        //   128: iconst_0       
        //   129: iload           16
        //   131: invokevirtual   android/widget/Scroller.startScroll:(IIIII)V
        //   134: getstatic       android/support/v4/view/ViewPager.a:I
        //   137: ifeq            215
        //   140: aload_0        
        //   141: aload_0        
        //   142: getfield        android/support/v4/view/ViewPager.mCurItem:I
        //   145: invokevirtual   android/support/v4/view/ViewPager.infoForPosition:(I)Landroid/support/v4/view/ViewPager$ItemInfo;
        //   148: astore          5
        //   150: aload           5
        //   152: ifnull          226
        //   155: aload           5
        //   157: getfield        android/support/v4/view/ViewPager$ItemInfo.offset:F
        //   160: aload_0        
        //   161: getfield        android/support/v4/view/ViewPager.mLastOffset:F
        //   164: invokestatic    java/lang/Math.min:(FF)F
        //   167: fstore          10
        //   169: fload           10
        //   171: fstore          6
        //   173: fload           6
        //   175: iload_1        
        //   176: aload_0        
        //   177: invokevirtual   android/support/v4/view/ViewPager.getPaddingLeft:()I
        //   180: isub           
        //   181: aload_0        
        //   182: invokevirtual   android/support/v4/view/ViewPager.getPaddingRight:()I
        //   185: isub           
        //   186: i2f            
        //   187: fmul           
        //   188: f2i            
        //   189: istore          7
        //   191: iload           7
        //   193: aload_0        
        //   194: invokevirtual   android/support/v4/view/ViewPager.getScrollX:()I
        //   197: if_icmpeq       215
        //   200: aload_0        
        //   201: iconst_0       
        //   202: invokespecial   android/support/v4/view/ViewPager.completeScroll:(Z)V
        //   205: aload_0        
        //   206: iload           7
        //   208: aload_0        
        //   209: invokevirtual   android/support/v4/view/ViewPager.getScrollY:()I
        //   212: invokevirtual   android/support/v4/view/ViewPager.scrollTo:(II)V
        //   215: return         
        //   216: astore          11
        //   218: aload           11
        //   220: athrow         
        //   221: astore          9
        //   223: aload           9
        //   225: athrow         
        //   226: fconst_0       
        //   227: fstore          6
        //   229: goto            173
        //   232: astore          8
        //   234: aload           8
        //   236: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  4      13     216    221    Landroid/content/res/Resources$NotFoundException;
        //  155    169    221    226    Landroid/content/res/Resources$NotFoundException;
        //  191    215    232    237    Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 128, Size: 128
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
    
    private void removeNonDecorViews() {
        final int a = ViewPager.a;
        int n = 0;
        while (true) {
            if (n >= this.getChildCount()) {
                return;
            }
            final ViewPager$LayoutParams viewPager$LayoutParams = (ViewPager$LayoutParams)this.getChildAt(n).getLayoutParams();
            int n2;
            try {
                if (!viewPager$LayoutParams.isDecor) {
                    this.removeViewAt(n);
                    --n;
                }
                n2 = n + 1;
                if (a != 0) {
                    return;
                }
            }
            catch (Resources$NotFoundException ex) {
                throw ex;
            }
            n = n2;
        }
    }
    
    private void requestParentDisallowInterceptTouchEvent(final boolean b) {
        final ViewParent parent = this.getParent();
        if (parent == null) {
            return;
        }
        try {
            parent.requestDisallowInterceptTouchEvent(b);
        }
        catch (Resources$NotFoundException ex) {
            throw ex;
        }
    }
    
    private void scrollToItem(final int p0, final boolean p1, final int p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: iload_1        
        //     2: invokevirtual   android/support/v4/view/ViewPager.infoForPosition:(I)Landroid/support/v4/view/ViewPager$ItemInfo;
        //     5: astore          5
        //     7: aload           5
        //     9: ifnull          209
        //    12: aload_0        
        //    13: invokespecial   android/support/v4/view/ViewPager.getClientWidth:()I
        //    16: i2f            
        //    17: aload_0        
        //    18: getfield        android/support/v4/view/ViewPager.mFirstOffset:F
        //    21: aload           5
        //    23: getfield        android/support/v4/view/ViewPager$ItemInfo.offset:F
        //    26: aload_0        
        //    27: getfield        android/support/v4/view/ViewPager.mLastOffset:F
        //    30: invokestatic    java/lang/Math.min:(FF)F
        //    33: invokestatic    java/lang/Math.max:(FF)F
        //    36: fmul           
        //    37: f2i            
        //    38: istore          6
        //    40: iload_2        
        //    41: ifeq            110
        //    44: aload_0        
        //    45: iload           6
        //    47: iconst_0       
        //    48: iload_3        
        //    49: invokevirtual   android/support/v4/view/ViewPager.smoothScrollTo:(III)V
        //    52: iload           4
        //    54: ifeq            74
        //    57: aload_0        
        //    58: getfield        android/support/v4/view/ViewPager.mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
        //    61: ifnull          74
        //    64: aload_0        
        //    65: getfield        android/support/v4/view/ViewPager.mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
        //    68: iload_1        
        //    69: invokeinterface android/support/v4/view/ViewPager$OnPageChangeListener.onPageSelected:(I)V
        //    74: iload           4
        //    76: ifeq            173
        //    79: aload_0        
        //    80: getfield        android/support/v4/view/ViewPager.mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
        //    83: astore          15
        //    85: aload           15
        //    87: ifnull          173
        //    90: aload_0        
        //    91: getfield        android/support/v4/view/ViewPager.mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
        //    94: iload_1        
        //    95: invokeinterface android/support/v4/view/ViewPager$OnPageChangeListener.onPageSelected:(I)V
        //   100: getstatic       android/support/v4/view/ViewPager.a:I
        //   103: istore          16
        //   105: iload           16
        //   107: ifeq            173
        //   110: iload           4
        //   112: ifeq            132
        //   115: aload_0        
        //   116: getfield        android/support/v4/view/ViewPager.mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
        //   119: ifnull          132
        //   122: aload_0        
        //   123: getfield        android/support/v4/view/ViewPager.mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
        //   126: iload_1        
        //   127: invokeinterface android/support/v4/view/ViewPager$OnPageChangeListener.onPageSelected:(I)V
        //   132: iload           4
        //   134: ifeq            154
        //   137: aload_0        
        //   138: getfield        android/support/v4/view/ViewPager.mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
        //   141: ifnull          154
        //   144: aload_0        
        //   145: getfield        android/support/v4/view/ViewPager.mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
        //   148: iload_1        
        //   149: invokeinterface android/support/v4/view/ViewPager$OnPageChangeListener.onPageSelected:(I)V
        //   154: aload_0        
        //   155: iconst_0       
        //   156: invokespecial   android/support/v4/view/ViewPager.completeScroll:(Z)V
        //   159: aload_0        
        //   160: iload           6
        //   162: iconst_0       
        //   163: invokevirtual   android/support/v4/view/ViewPager.scrollTo:(II)V
        //   166: aload_0        
        //   167: iload           6
        //   169: invokespecial   android/support/v4/view/ViewPager.pageScrolled:(I)Z
        //   172: pop            
        //   173: return         
        //   174: astore          10
        //   176: aload           10
        //   178: athrow         
        //   179: astore          11
        //   181: aload           11
        //   183: athrow         
        //   184: astore          12
        //   186: aload           12
        //   188: athrow         
        //   189: astore          13
        //   191: aload           13
        //   193: athrow         
        //   194: astore          14
        //   196: aload           14
        //   198: athrow         
        //   199: astore          9
        //   201: aload           9
        //   203: athrow         
        //   204: astore          8
        //   206: aload           8
        //   208: athrow         
        //   209: iconst_0       
        //   210: istore          6
        //   212: goto            40
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  44     52     174    179    Landroid/content/res/Resources$NotFoundException;
        //  57     74     179    184    Landroid/content/res/Resources$NotFoundException;
        //  79     85     184    189    Landroid/content/res/Resources$NotFoundException;
        //  90     105    189    199    Landroid/content/res/Resources$NotFoundException;
        //  115    132    199    204    Landroid/content/res/Resources$NotFoundException;
        //  137    154    204    209    Landroid/content/res/Resources$NotFoundException;
        //  176    179    179    184    Landroid/content/res/Resources$NotFoundException;
        //  186    189    189    199    Landroid/content/res/Resources$NotFoundException;
        //  191    194    194    199    Landroid/content/res/Resources$NotFoundException;
        //  196    199    199    204    Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 105, Size: 105
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
    
    private void setScrollState(final int mScrollState) {
        while (true) {
            try {
                if (this.mScrollState == mScrollState) {
                    return;
                }
            }
            catch (Resources$NotFoundException ex) {
                throw ex;
            }
            while (true) {
                while (true) {
                    Label_0076: {
                        try {
                            this.mScrollState = mScrollState;
                            if (this.mPageTransformer != null) {
                                if (mScrollState == 0) {
                                    break Label_0076;
                                }
                                final boolean b = true;
                                this.enableLayers(b);
                            }
                            try {
                                if (this.mOnPageChangeListener != null) {
                                    this.mOnPageChangeListener.onPageScrollStateChanged(mScrollState);
                                }
                                return;
                            }
                            catch (Resources$NotFoundException ex2) {
                                throw ex2;
                            }
                        }
                        catch (Resources$NotFoundException ex3) {
                            try {
                                throw ex3;
                            }
                            catch (Resources$NotFoundException ex4) {
                                throw ex4;
                            }
                        }
                    }
                    final boolean b = false;
                    continue;
                }
            }
        }
    }
    
    private void setScrollingCacheEnabled(final boolean mScrollingCacheEnabled) {
        try {
            if (this.mScrollingCacheEnabled != mScrollingCacheEnabled) {
                this.mScrollingCacheEnabled = mScrollingCacheEnabled;
            }
        }
        catch (Resources$NotFoundException ex) {
            throw ex;
        }
    }
    
    private void sortChildDrawingOrder() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/view/ViewPager.a:I
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        android/support/v4/view/ViewPager.mDrawingOrder:I
        //     8: istore          5
        //    10: iload           5
        //    12: ifeq            99
        //    15: aload_0        
        //    16: getfield        android/support/v4/view/ViewPager.mDrawingOrderedChildren:Ljava/util/ArrayList;
        //    19: astore          6
        //    21: aload           6
        //    23: ifnonnull       41
        //    26: aload_0        
        //    27: new             Ljava/util/ArrayList;
        //    30: dup            
        //    31: invokespecial   java/util/ArrayList.<init>:()V
        //    34: putfield        android/support/v4/view/ViewPager.mDrawingOrderedChildren:Ljava/util/ArrayList;
        //    37: iload_1        
        //    38: ifeq            48
        //    41: aload_0        
        //    42: getfield        android/support/v4/view/ViewPager.mDrawingOrderedChildren:Ljava/util/ArrayList;
        //    45: invokevirtual   java/util/ArrayList.clear:()V
        //    48: aload_0        
        //    49: invokevirtual   android/support/v4/view/ViewPager.getChildCount:()I
        //    52: istore          7
        //    54: iconst_0       
        //    55: istore          8
        //    57: iload           8
        //    59: iload           7
        //    61: if_icmpge       89
        //    64: aload_0        
        //    65: iload           8
        //    67: invokevirtual   android/support/v4/view/ViewPager.getChildAt:(I)Landroid/view/View;
        //    70: astore          9
        //    72: aload_0        
        //    73: getfield        android/support/v4/view/ViewPager.mDrawingOrderedChildren:Ljava/util/ArrayList;
        //    76: aload           9
        //    78: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    81: pop            
        //    82: iinc            8, 1
        //    85: iload_1        
        //    86: ifeq            57
        //    89: aload_0        
        //    90: getfield        android/support/v4/view/ViewPager.mDrawingOrderedChildren:Ljava/util/ArrayList;
        //    93: getstatic       android/support/v4/view/ViewPager.sPositionComparator:Landroid/support/v4/view/ViewPager$ViewPositionComparator;
        //    96: invokestatic    java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
        //    99: return         
        //   100: astore_2       
        //   101: aload_2        
        //   102: athrow         
        //   103: astore_3       
        //   104: aload_3        
        //   105: athrow         
        //   106: astore          4
        //   108: aload           4
        //   110: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  4      10     100    103    Landroid/content/res/Resources$NotFoundException;
        //  15     21     103    106    Landroid/content/res/Resources$NotFoundException;
        //  26     37     106    111    Landroid/content/res/Resources$NotFoundException;
        //  41     48     106    111    Landroid/content/res/Resources$NotFoundException;
        //  101    103    103    106    Landroid/content/res/Resources$NotFoundException;
        //  104    106    106    111    Landroid/content/res/Resources$NotFoundException;
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
    
    public void addFocusables(final ArrayList p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/view/ViewPager.a:I
        //     3: istore          4
        //     5: aload_1        
        //     6: invokevirtual   java/util/ArrayList.size:()I
        //     9: istore          5
        //    11: aload_0        
        //    12: invokevirtual   android/support/v4/view/ViewPager.getDescendantFocusability:()I
        //    15: istore          6
        //    17: iload           6
        //    19: ldc_w           393216
        //    22: if_icmpeq       94
        //    25: iconst_0       
        //    26: istore          17
        //    28: iload           17
        //    30: aload_0        
        //    31: invokevirtual   android/support/v4/view/ViewPager.getChildCount:()I
        //    34: if_icmpge       94
        //    37: aload_0        
        //    38: iload           17
        //    40: invokevirtual   android/support/v4/view/ViewPager.getChildAt:(I)Landroid/view/View;
        //    43: astore          18
        //    45: aload           18
        //    47: invokevirtual   android/view/View.getVisibility:()I
        //    50: ifne            86
        //    53: aload_0        
        //    54: aload           18
        //    56: invokevirtual   android/support/v4/view/ViewPager.infoForChild:(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
        //    59: astore          19
        //    61: aload           19
        //    63: ifnull          86
        //    66: aload           19
        //    68: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //    71: aload_0        
        //    72: getfield        android/support/v4/view/ViewPager.mCurItem:I
        //    75: if_icmpne       86
        //    78: aload           18
        //    80: aload_1        
        //    81: iload_2        
        //    82: iload_3        
        //    83: invokevirtual   android/view/View.addFocusables:(Ljava/util/ArrayList;II)V
        //    86: iinc            17, 1
        //    89: iload           4
        //    91: ifeq            28
        //    94: iload           6
        //    96: ldc_w           262144
        //    99: if_icmpne       115
        //   102: aload_1        
        //   103: invokevirtual   java/util/ArrayList.size:()I
        //   106: istore          16
        //   108: iload           5
        //   110: iload           16
        //   112: if_icmpne       126
        //   115: aload_0        
        //   116: invokevirtual   android/support/v4/view/ViewPager.isFocusable:()Z
        //   119: istore          8
        //   121: iload           8
        //   123: ifne            142
        //   126: return         
        //   127: astore          20
        //   129: aload           20
        //   131: athrow         
        //   132: astore          15
        //   134: aload           15
        //   136: athrow         
        //   137: astore          7
        //   139: aload           7
        //   141: athrow         
        //   142: iload_3        
        //   143: iconst_1       
        //   144: iand           
        //   145: iconst_1       
        //   146: if_icmpne       171
        //   149: aload_0        
        //   150: invokevirtual   android/support/v4/view/ViewPager.isInTouchMode:()Z
        //   153: istore          13
        //   155: iload           13
        //   157: ifeq            171
        //   160: aload_0        
        //   161: invokevirtual   android/support/v4/view/ViewPager.isFocusableInTouchMode:()Z
        //   164: istore          14
        //   166: iload           14
        //   168: ifeq            126
        //   171: aload_1        
        //   172: ifnull          126
        //   175: aload_1        
        //   176: aload_0        
        //   177: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   180: pop            
        //   181: return         
        //   182: astore          9
        //   184: aload           9
        //   186: athrow         
        //   187: astore          11
        //   189: aload           11
        //   191: athrow         
        //   192: astore          12
        //   194: aload           12
        //   196: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  66     86     127    132    Landroid/content/res/Resources$NotFoundException;
        //  102    108    132    137    Landroid/content/res/Resources$NotFoundException;
        //  115    121    137    142    Landroid/content/res/Resources$NotFoundException;
        //  134    137    137    142    Landroid/content/res/Resources$NotFoundException;
        //  149    155    187    192    Landroid/content/res/Resources$NotFoundException;
        //  160    166    192    197    Landroid/content/res/Resources$NotFoundException;
        //  175    181    182    187    Landroid/content/res/Resources$NotFoundException;
        //  189    192    192    197    Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 98, Size: 98
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
    
    ViewPager$ItemInfo addNewItem(final int p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   android/support/v4/view/ViewPager$ItemInfo.<init>:()V
        //     7: astore_3       
        //     8: aload_3        
        //     9: iload_1        
        //    10: putfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //    13: aload_3        
        //    14: aload_0        
        //    15: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //    18: aload_0        
        //    19: iload_1        
        //    20: invokevirtual   android/support/v4/view/PagerAdapter.instantiateItem:(Landroid/view/ViewGroup;I)Ljava/lang/Object;
        //    23: putfield        android/support/v4/view/ViewPager$ItemInfo.object:Ljava/lang/Object;
        //    26: aload_3        
        //    27: aload_0        
        //    28: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //    31: iload_1        
        //    32: invokevirtual   android/support/v4/view/PagerAdapter.getPageWidth:(I)F
        //    35: putfield        android/support/v4/view/ViewPager$ItemInfo.widthFactor:F
        //    38: iload_2        
        //    39: iflt            57
        //    42: aload_0        
        //    43: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //    46: invokevirtual   java/util/ArrayList.size:()I
        //    49: istore          8
        //    51: iload_2        
        //    52: iload           8
        //    54: if_icmplt       72
        //    57: aload_0        
        //    58: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //    61: aload_3        
        //    62: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    65: pop            
        //    66: getstatic       android/support/v4/view/ViewPager.a:I
        //    69: ifeq            81
        //    72: aload_0        
        //    73: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //    76: iload_2        
        //    77: aload_3        
        //    78: invokevirtual   java/util/ArrayList.add:(ILjava/lang/Object;)V
        //    81: aload_3        
        //    82: areturn        
        //    83: astore          4
        //    85: aload           4
        //    87: athrow         
        //    88: astore          5
        //    90: aload           5
        //    92: athrow         
        //    93: astore          6
        //    95: aload           6
        //    97: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  8      38     83     88     Landroid/content/res/Resources$NotFoundException;
        //  42     51     88     93     Landroid/content/res/Resources$NotFoundException;
        //  57     72     93     98     Landroid/content/res/Resources$NotFoundException;
        //  72     81     93     98     Landroid/content/res/Resources$NotFoundException;
        //  85     88     88     93     Landroid/content/res/Resources$NotFoundException;
        //  90     93     93     98     Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 52, Size: 52
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
    
    public void addTouchables(final ArrayList list) {
        final int a = ViewPager.a;
        int n = 0;
        while (true) {
            if (n >= this.getChildCount()) {
                return;
            }
            final View child = this.getChildAt(n);
            Label_0060: {
                if (child.getVisibility() != 0) {
                    break Label_0060;
                }
                final ViewPager$ItemInfo infoForChild = this.infoForChild(child);
                if (infoForChild == null) {
                    break Label_0060;
                }
                try {
                    if (infoForChild.position == this.mCurItem) {
                        child.addTouchables(list);
                    }
                    ++n;
                    if (a != 0) {
                        return;
                    }
                    continue;
                }
                catch (Resources$NotFoundException ex) {
                    throw ex;
                }
            }
        }
    }
    
    public void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        while (true) {
            Label_0125: {
                if (this.checkLayoutParams(viewGroup$LayoutParams)) {
                    break Label_0125;
                }
                final ViewGroup$LayoutParams generateLayoutParams = this.generateLayoutParams(viewGroup$LayoutParams);
                final ViewPager$LayoutParams viewPager$LayoutParams = (ViewPager$LayoutParams)generateLayoutParams;
                Label_0111: {
                    try {
                        viewPager$LayoutParams.isDecor |= (view instanceof ViewPager$Decor);
                        if (!this.mInLayout) {
                            break Label_0111;
                        }
                        if (viewPager$LayoutParams != null) {
                            try {
                                if (viewPager$LayoutParams.isDecor) {
                                    throw new IllegalStateException(ViewPager.z[10]);
                                }
                            }
                            catch (Resources$NotFoundException ex) {
                                throw ex;
                            }
                        }
                    }
                    catch (Resources$NotFoundException ex2) {
                        try {
                            throw ex2;
                        }
                        catch (Resources$NotFoundException ex3) {
                            throw ex3;
                        }
                    }
                    try {
                        viewPager$LayoutParams.needsMeasure = true;
                        this.addViewInLayout(view, n, generateLayoutParams);
                        if (ViewPager.a != 0) {
                            super.addView(view, n, generateLayoutParams);
                        }
                        return;
                    }
                    catch (Resources$NotFoundException ex4) {
                        throw ex4;
                    }
                }
            }
            final ViewGroup$LayoutParams generateLayoutParams = viewGroup$LayoutParams;
            continue;
        }
    }
    
    public boolean arrowScroll(final int n) {
        final int a = ViewPager.a;
        final View focus = this.findFocus();
    Label_0217:
        while (true) {
            boolean b2 = false;
            Label_0405: {
                boolean b;
                while (true) {
                    View view = null;
                    Label_0017: {
                        if (focus == this) {
                            view = null;
                            break Label_0017;
                        }
                        Label_0233: {
                            break Label_0233;
                            ViewParent viewParent;
                            StringBuilder sb;
                            ViewParent viewParent2;
                            int n2;
                            Block_19_Outer:Block_14_Outer:Label_0280_Outer:
                            while (true) {
                            Label_0280:
                                while (true) {
                                    try {
                                        this.playSoundEffect(SoundEffectConstants.getContantForFocusDirection(n));
                                        return b;
                                        // iftrue(Label_0280:, !viewParent instanceof ViewGroup)
                                        // iftrue(Label_0313:, a == 0)
                                        // iftrue(Label_0437:, a == 0)
                                        // iftrue(Label_0267:, viewParent != this)
                                        // iftrue(Label_0246:, a == 0)
                                        // iftrue(Label_0357:, !viewParent2 instanceof ViewGroup)
                                        // iftrue(Label_0431:, n2 != 0)
                                        // iftrue(Label_0431:, focus == null)
                                        while (true) {
                                        Block_18:
                                            while (true) {
                                                while (true) {
                                                Label_0267:
                                                    while (true) {
                                                        Block_15: {
                                                            Block_17: {
                                                                Label_0357: {
                                                                    while (true) {
                                                                        break Block_15;
                                                                        sb.append(ViewPager.z[18]).append(viewParent2.getClass().getSimpleName());
                                                                        viewParent2 = viewParent2.getParent();
                                                                        break Label_0357;
                                                                        viewParent = focus.getParent();
                                                                        n2 = 0;
                                                                        continue Block_19_Outer;
                                                                    }
                                                                    break Block_17;
                                                                }
                                                                Log.e(ViewPager.z[17], ViewPager.z[16] + sb.toString());
                                                                view = null;
                                                                break Label_0017;
                                                            }
                                                            n2 = 1;
                                                            break Label_0267;
                                                        }
                                                        continue Label_0280_Outer;
                                                    }
                                                    viewParent = viewParent.getParent();
                                                    break Label_0280;
                                                    continue Block_14_Outer;
                                                }
                                                break Block_18;
                                                continue Label_0280_Outer;
                                            }
                                            sb = new StringBuilder();
                                            sb.append(focus.getClass().getSimpleName());
                                            viewParent2 = focus.getParent();
                                            continue;
                                        }
                                    }
                                    catch (Resources$NotFoundException ex) {
                                        throw ex;
                                    }
                                    break Label_0405;
                                    Label_0437: {
                                        n2 = 1;
                                    }
                                    continue Label_0280;
                                }
                            }
                        }
                        Label_0431: {
                            view = focus;
                        }
                    }
                    final View nextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup)this, view, n);
                    if (nextFocus != null && nextFocus != view) {
                        if (n == 17) {
                            final int left = this.getChildRectInPagerCoordinates(this.mTempRect, nextFocus).left;
                            final int left2 = this.getChildRectInPagerCoordinates(this.mTempRect, view).left;
                            Label_0106: {
                                if (view != null && left >= left2) {
                                    b2 = this.pageLeft();
                                    if (a == 0) {
                                        break Label_0106;
                                    }
                                }
                                b2 = nextFocus.requestFocus();
                            }
                            if (a == 0) {
                                b = b2;
                                break Label_0217;
                            }
                        }
                        else {
                            b2 = false;
                        }
                        if (n != 66) {
                            break Label_0405;
                        }
                        final int left3 = this.getChildRectInPagerCoordinates(this.mTempRect, nextFocus).left;
                        final int left4 = this.getChildRectInPagerCoordinates(this.mTempRect, view).left;
                        Label_0175: {
                            if (view != null && left3 <= left4) {
                                b = this.pageRight();
                                if (a == 0) {
                                    break Label_0175;
                                }
                            }
                            b = nextFocus.requestFocus();
                        }
                        if (a == 0) {
                            break Label_0217;
                        }
                    }
                    else {
                        b = false;
                    }
                    if (n == 17 || n == 1) {
                        b = this.pageLeft();
                        if (a == 0) {
                            break Label_0217;
                        }
                    }
                    if (n == 66 || n == 2) {
                        b = this.pageRight();
                    }
                    if (b) {
                        continue;
                    }
                    break;
                }
                return b;
            }
            boolean b = b2;
            continue Label_0217;
        }
    }
    
    protected boolean canScroll(final View p0, final boolean p1, final int p2, final int p3, final int p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/view/ViewPager.a:I
        //     3: istore          6
        //     5: aload_1        
        //     6: instanceof      Landroid/view/ViewGroup;
        //     9: ifeq            216
        //    12: aload_1        
        //    13: checkcast       Landroid/view/ViewGroup;
        //    16: astore          10
        //    18: aload_1        
        //    19: invokevirtual   android/view/View.getScrollX:()I
        //    22: istore          11
        //    24: aload_1        
        //    25: invokevirtual   android/view/View.getScrollY:()I
        //    28: istore          12
        //    30: iconst_m1      
        //    31: aload           10
        //    33: invokevirtual   android/view/ViewGroup.getChildCount:()I
        //    36: iadd           
        //    37: istore          13
        //    39: iload           13
        //    41: iflt            216
        //    44: aload           10
        //    46: iload           13
        //    48: invokevirtual   android/view/ViewGroup.getChildAt:(I)Landroid/view/View;
        //    51: astore          14
        //    53: iload           4
        //    55: iload           11
        //    57: iadd           
        //    58: istore          15
        //    60: aload           14
        //    62: invokevirtual   android/view/View.getLeft:()I
        //    65: istore          21
        //    67: iload           15
        //    69: iload           21
        //    71: if_icmplt       205
        //    74: iload           4
        //    76: iload           11
        //    78: iadd           
        //    79: istore          23
        //    81: aload           14
        //    83: invokevirtual   android/view/View.getRight:()I
        //    86: istore          24
        //    88: iload           23
        //    90: iload           24
        //    92: if_icmpge       205
        //    95: iload           5
        //    97: iload           12
        //    99: iadd           
        //   100: istore          25
        //   102: aload           14
        //   104: invokevirtual   android/view/View.getTop:()I
        //   107: istore          26
        //   109: iload           25
        //   111: iload           26
        //   113: if_icmplt       205
        //   116: iload           5
        //   118: iload           12
        //   120: iadd           
        //   121: istore          27
        //   123: aload           14
        //   125: invokevirtual   android/view/View.getBottom:()I
        //   128: istore          28
        //   130: iload           27
        //   132: iload           28
        //   134: if_icmpge       205
        //   137: iload           4
        //   139: iload           11
        //   141: iadd           
        //   142: istore          29
        //   144: aload_0        
        //   145: aload           14
        //   147: iconst_1       
        //   148: iload_3        
        //   149: iload           29
        //   151: aload           14
        //   153: invokevirtual   android/view/View.getLeft:()I
        //   156: isub           
        //   157: iload           5
        //   159: iload           12
        //   161: iadd           
        //   162: aload           14
        //   164: invokevirtual   android/view/View.getTop:()I
        //   167: isub           
        //   168: invokevirtual   android/support/v4/view/ViewPager.canScroll:(Landroid/view/View;ZIII)Z
        //   171: istore          30
        //   173: iload           30
        //   175: ifeq            205
        //   178: iconst_1       
        //   179: ireturn        
        //   180: astore          16
        //   182: aload           16
        //   184: athrow         
        //   185: astore          17
        //   187: aload           17
        //   189: athrow         
        //   190: astore          18
        //   192: aload           18
        //   194: athrow         
        //   195: astore          19
        //   197: aload           19
        //   199: athrow         
        //   200: astore          20
        //   202: aload           20
        //   204: athrow         
        //   205: iload           13
        //   207: iconst_1       
        //   208: isub           
        //   209: istore          22
        //   211: iload           6
        //   213: ifeq            246
        //   216: iload_2        
        //   217: ifeq            244
        //   220: iload_3        
        //   221: ineg           
        //   222: istore          7
        //   224: aload_1        
        //   225: iload           7
        //   227: invokestatic    android/support/v4/view/ViewCompat.canScrollHorizontally:(Landroid/view/View;I)Z
        //   230: istore          9
        //   232: iload           9
        //   234: ifeq            244
        //   237: iconst_1       
        //   238: ireturn        
        //   239: astore          8
        //   241: aload           8
        //   243: athrow         
        //   244: iconst_0       
        //   245: ireturn        
        //   246: iload           22
        //   248: istore          13
        //   250: goto            39
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  60     67     180    185    Landroid/content/res/Resources$NotFoundException;
        //  81     88     185    190    Landroid/content/res/Resources$NotFoundException;
        //  102    109    190    195    Landroid/content/res/Resources$NotFoundException;
        //  123    130    195    200    Landroid/content/res/Resources$NotFoundException;
        //  144    173    200    205    Landroid/content/res/Resources$NotFoundException;
        //  182    185    185    190    Landroid/content/res/Resources$NotFoundException;
        //  187    190    190    195    Landroid/content/res/Resources$NotFoundException;
        //  192    195    195    200    Landroid/content/res/Resources$NotFoundException;
        //  197    200    200    205    Landroid/content/res/Resources$NotFoundException;
        //  224    232    239    244    Landroid/content/res/Resources$NotFoundException;
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
    
    public boolean canScrollHorizontally(final int n) {
        boolean b = false;
        int clientWidth = 0;
        int scrollX = 0;
        Block_4: {
            while (true) {
                b = true;
                try {
                    if (this.mAdapter == null) {
                        return false;
                    }
                }
                catch (Resources$NotFoundException ex) {
                    throw ex;
                }
                clientWidth = this.getClientWidth();
                scrollX = this.getScrollX();
                if (n < 0) {
                    break;
                }
                if (n > 0) {
                    break Block_4;
                }
                return false;
            }
            while (true) {
                final float n2 = clientWidth;
                try {
                    if (scrollX > (int)(n2 * this.mFirstOffset)) {
                        return b;
                    }
                }
                catch (Resources$NotFoundException ex2) {
                    throw ex2;
                }
                b = false;
                return b;
            }
        }
        while (true) {
            final float n3 = clientWidth;
            try {
                if (scrollX < (int)(n3 * this.mLastOffset)) {
                    return b;
                }
            }
            catch (Resources$NotFoundException ex3) {
                throw ex3;
            }
            b = false;
            return b;
        }
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        try {
            if (!(viewGroup$LayoutParams instanceof ViewPager$LayoutParams)) {
                return false;
            }
            final ViewPager viewPager = this;
            final ViewGroup$LayoutParams viewGroup$LayoutParams2 = viewGroup$LayoutParams;
            final boolean b = viewPager.checkLayoutParams(viewGroup$LayoutParams2);
            if (b) {
                return true;
            }
            return false;
        }
        catch (Resources$NotFoundException ex) {
            throw ex;
        }
        try {
            final ViewPager viewPager = this;
            final ViewGroup$LayoutParams viewGroup$LayoutParams2 = viewGroup$LayoutParams;
            final boolean b = viewPager.checkLayoutParams(viewGroup$LayoutParams2);
            if (b) {
                return true;
            }
        }
        catch (Resources$NotFoundException ex2) {
            throw ex2;
        }
        return false;
    }
    
    public void computeScroll() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v4/view/ViewPager.mScroller:Landroid/widget/Scroller;
        //     4: invokevirtual   android/widget/Scroller.isFinished:()Z
        //     7: ifne            108
        //    10: aload_0        
        //    11: getfield        android/support/v4/view/ViewPager.mScroller:Landroid/widget/Scroller;
        //    14: invokevirtual   android/widget/Scroller.computeScrollOffset:()Z
        //    17: istore_2       
        //    18: iload_2        
        //    19: ifeq            108
        //    22: aload_0        
        //    23: invokevirtual   android/support/v4/view/ViewPager.getScrollX:()I
        //    26: istore_3       
        //    27: aload_0        
        //    28: invokevirtual   android/support/v4/view/ViewPager.getScrollY:()I
        //    31: istore          4
        //    33: aload_0        
        //    34: getfield        android/support/v4/view/ViewPager.mScroller:Landroid/widget/Scroller;
        //    37: invokevirtual   android/widget/Scroller.getCurrX:()I
        //    40: istore          5
        //    42: aload_0        
        //    43: getfield        android/support/v4/view/ViewPager.mScroller:Landroid/widget/Scroller;
        //    46: invokevirtual   android/widget/Scroller.getCurrY:()I
        //    49: istore          6
        //    51: iload_3        
        //    52: iload           5
        //    54: if_icmpne       64
        //    57: iload           4
        //    59: iload           6
        //    61: if_icmpeq       95
        //    64: aload_0        
        //    65: iload           5
        //    67: iload           6
        //    69: invokevirtual   android/support/v4/view/ViewPager.scrollTo:(II)V
        //    72: aload_0        
        //    73: iload           5
        //    75: invokespecial   android/support/v4/view/ViewPager.pageScrolled:(I)Z
        //    78: ifne            95
        //    81: aload_0        
        //    82: getfield        android/support/v4/view/ViewPager.mScroller:Landroid/widget/Scroller;
        //    85: invokevirtual   android/widget/Scroller.abortAnimation:()V
        //    88: aload_0        
        //    89: iconst_0       
        //    90: iload           6
        //    92: invokevirtual   android/support/v4/view/ViewPager.scrollTo:(II)V
        //    95: aload_0        
        //    96: invokestatic    android/support/v4/view/ViewCompat.postInvalidateOnAnimation:(Landroid/view/View;)V
        //    99: return         
        //   100: astore_1       
        //   101: aload_1        
        //   102: athrow         
        //   103: astore          7
        //   105: aload           7
        //   107: athrow         
        //   108: aload_0        
        //   109: iconst_1       
        //   110: invokespecial   android/support/v4/view/ViewPager.completeScroll:(Z)V
        //   113: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  0      18     100    103    Landroid/content/res/Resources$NotFoundException;
        //  64     95     103    108    Landroid/content/res/Resources$NotFoundException;
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
    
    void dataSetChanged() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //     8: invokevirtual   android/support/v4/view/PagerAdapter.getCount:()I
        //    11: istore_2       
        //    12: aload_0        
        //    13: iload_2        
        //    14: putfield        android/support/v4/view/ViewPager.mExpectedAdapterCount:I
        //    17: aload_0        
        //    18: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //    21: invokevirtual   java/util/ArrayList.size:()I
        //    24: istore          5
        //    26: aload_0        
        //    27: getfield        android/support/v4/view/ViewPager.mOffscreenPageLimit:I
        //    30: istore          6
        //    32: iload           5
        //    34: iconst_1       
        //    35: iload           6
        //    37: iconst_2       
        //    38: imul           
        //    39: iadd           
        //    40: if_icmpge       408
        //    43: aload_0        
        //    44: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //    47: invokevirtual   java/util/ArrayList.size:()I
        //    50: istore          37
        //    52: iload           37
        //    54: iload_2        
        //    55: if_icmpge       408
        //    58: iconst_1       
        //    59: istore          7
        //    61: aload_0        
        //    62: getfield        android/support/v4/view/ViewPager.mCurItem:I
        //    65: istore          8
        //    67: iconst_0       
        //    68: istore          9
        //    70: iload           8
        //    72: istore          10
        //    74: iload           7
        //    76: istore          11
        //    78: iconst_0       
        //    79: istore          12
        //    81: iload           12
        //    83: aload_0        
        //    84: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //    87: invokevirtual   java/util/ArrayList.size:()I
        //    90: if_icmpge       535
        //    93: aload_0        
        //    94: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //    97: iload           12
        //    99: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   102: checkcast       Landroid/support/v4/view/ViewPager$ItemInfo;
        //   105: astore          22
        //   107: aload_0        
        //   108: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //   111: aload           22
        //   113: getfield        android/support/v4/view/ViewPager$ItemInfo.object:Ljava/lang/Object;
        //   116: invokevirtual   android/support/v4/view/PagerAdapter.getItemPosition:(Ljava/lang/Object;)I
        //   119: istore          23
        //   121: iload           23
        //   123: iconst_m1      
        //   124: if_icmpne       131
        //   127: iload_1        
        //   128: ifeq            516
        //   131: iload           23
        //   133: bipush          -2
        //   135: if_icmpne       497
        //   138: aload_0        
        //   139: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   142: iload           12
        //   144: invokevirtual   java/util/ArrayList.remove:(I)Ljava/lang/Object;
        //   147: pop            
        //   148: iload           12
        //   150: iconst_1       
        //   151: isub           
        //   152: istore          35
        //   154: iload           9
        //   156: ifne            170
        //   159: aload_0        
        //   160: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //   163: aload_0        
        //   164: invokevirtual   android/support/v4/view/PagerAdapter.startUpdate:(Landroid/view/ViewGroup;)V
        //   167: iconst_1       
        //   168: istore          9
        //   170: aload_0        
        //   171: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //   174: aload_0        
        //   175: aload           22
        //   177: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   180: aload           22
        //   182: getfield        android/support/v4/view/ViewPager$ItemInfo.object:Ljava/lang/Object;
        //   185: invokevirtual   android/support/v4/view/PagerAdapter.destroyItem:(Landroid/view/ViewGroup;ILjava/lang/Object;)V
        //   188: aload_0        
        //   189: getfield        android/support/v4/view/ViewPager.mCurItem:I
        //   192: aload           22
        //   194: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   197: if_icmpne       479
        //   200: iconst_0       
        //   201: aload_0        
        //   202: getfield        android/support/v4/view/ViewPager.mCurItem:I
        //   205: iload_2        
        //   206: iconst_1       
        //   207: isub           
        //   208: invokestatic    java/lang/Math.min:(II)I
        //   211: invokestatic    java/lang/Math.max:(II)I
        //   214: istore          10
        //   216: iload_1        
        //   217: ifeq            479
        //   220: iconst_1       
        //   221: istore          11
        //   223: iload           9
        //   225: istore          36
        //   227: iload           35
        //   229: istore          27
        //   231: iload           10
        //   233: istore          25
        //   235: iload           36
        //   237: istore          26
        //   239: aload           22
        //   241: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   244: iload           23
        //   246: if_icmpeq       460
        //   249: aload           22
        //   251: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   254: istore          31
        //   256: aload_0        
        //   257: getfield        android/support/v4/view/ViewPager.mCurItem:I
        //   260: istore          32
        //   262: iload           31
        //   264: iload           32
        //   266: if_icmpne       273
        //   269: iload           23
        //   271: istore          25
        //   273: aload           22
        //   275: iload           23
        //   277: putfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   280: iload           27
        //   282: istore          29
        //   284: iload           25
        //   286: istore          14
        //   288: iload           26
        //   290: istore          13
        //   292: iconst_1       
        //   293: istore          15
        //   295: iload           29
        //   297: iconst_1       
        //   298: iadd           
        //   299: istore          30
        //   301: iload_1        
        //   302: ifeq            441
        //   305: iload           13
        //   307: ifeq            318
        //   310: aload_0        
        //   311: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //   314: aload_0        
        //   315: invokevirtual   android/support/v4/view/PagerAdapter.finishUpdate:(Landroid/view/ViewGroup;)V
        //   318: aload_0        
        //   319: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   322: getstatic       android/support/v4/view/ViewPager.COMPARATOR:Ljava/util/Comparator;
        //   325: invokestatic    java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
        //   328: iload           15
        //   330: ifeq            399
        //   333: aload_0        
        //   334: invokevirtual   android/support/v4/view/ViewPager.getChildCount:()I
        //   337: istore          16
        //   339: iconst_0       
        //   340: istore          17
        //   342: iload           17
        //   344: iload           16
        //   346: if_icmpge       387
        //   349: aload_0        
        //   350: iload           17
        //   352: invokevirtual   android/support/v4/view/ViewPager.getChildAt:(I)Landroid/view/View;
        //   355: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   358: checkcast       Landroid/support/v4/view/ViewPager$LayoutParams;
        //   361: astore          18
        //   363: aload           18
        //   365: getfield        android/support/v4/view/ViewPager$LayoutParams.isDecor:Z
        //   368: ifne            377
        //   371: aload           18
        //   373: fconst_0       
        //   374: putfield        android/support/v4/view/ViewPager$LayoutParams.widthFactor:F
        //   377: iload           17
        //   379: iconst_1       
        //   380: iadd           
        //   381: istore          20
        //   383: iload_1        
        //   384: ifeq            434
        //   387: aload_0        
        //   388: iload           14
        //   390: iconst_0       
        //   391: iconst_1       
        //   392: invokevirtual   android/support/v4/view/ViewPager.setCurrentItemInternal:(IZZ)V
        //   395: aload_0        
        //   396: invokevirtual   android/support/v4/view/ViewPager.requestLayout:()V
        //   399: return         
        //   400: astore_3       
        //   401: aload_3        
        //   402: athrow         
        //   403: astore          4
        //   405: aload           4
        //   407: athrow         
        //   408: iconst_0       
        //   409: istore          7
        //   411: goto            61
        //   414: astore          33
        //   416: aload           33
        //   418: athrow         
        //   419: astore          28
        //   421: aload           28
        //   423: athrow         
        //   424: astore          21
        //   426: aload           21
        //   428: athrow         
        //   429: astore          19
        //   431: aload           19
        //   433: athrow         
        //   434: iload           20
        //   436: istore          17
        //   438: goto            342
        //   441: iload           15
        //   443: istore          11
        //   445: iload           14
        //   447: istore          10
        //   449: iload           13
        //   451: istore          9
        //   453: iload           30
        //   455: istore          12
        //   457: goto            81
        //   460: iload           27
        //   462: istore          29
        //   464: iload           25
        //   466: istore          14
        //   468: iload           26
        //   470: istore          13
        //   472: iload           11
        //   474: istore          15
        //   476: goto            295
        //   479: iload           35
        //   481: istore          29
        //   483: iload           9
        //   485: istore          13
        //   487: iload           10
        //   489: istore          14
        //   491: iconst_1       
        //   492: istore          15
        //   494: goto            295
        //   497: iload           12
        //   499: istore          24
        //   501: iload           10
        //   503: istore          25
        //   505: iload           9
        //   507: istore          26
        //   509: iload           24
        //   511: istore          27
        //   513: goto            239
        //   516: iload           12
        //   518: istore          29
        //   520: iload           9
        //   522: istore          13
        //   524: iload           10
        //   526: istore          14
        //   528: iload           11
        //   530: istore          15
        //   532: goto            295
        //   535: iload           9
        //   537: istore          13
        //   539: iload           10
        //   541: istore          14
        //   543: iload           11
        //   545: istore          15
        //   547: goto            305
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  12     32     400    403    Landroid/content/res/Resources$NotFoundException;
        //  43     52     403    408    Landroid/content/res/Resources$NotFoundException;
        //  138    148    414    419    Landroid/content/res/Resources$NotFoundException;
        //  239    262    419    424    Landroid/content/res/Resources$NotFoundException;
        //  310    318    424    429    Landroid/content/res/Resources$NotFoundException;
        //  363    377    429    434    Landroid/content/res/Resources$NotFoundException;
        //  401    403    403    408    Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 273, Size: 273
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
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        try {
            if (super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            final ViewPager viewPager = this;
            final KeyEvent keyEvent2 = keyEvent;
            final boolean b = viewPager.executeKeyEvent(keyEvent2);
            if (b) {
                return true;
            }
            return false;
        }
        catch (Resources$NotFoundException ex) {
            throw ex;
        }
        try {
            final ViewPager viewPager = this;
            final KeyEvent keyEvent2 = keyEvent;
            final boolean b = viewPager.executeKeyEvent(keyEvent2);
            if (b) {
                return true;
            }
        }
        catch (Resources$NotFoundException ex2) {
            throw ex2;
        }
        return false;
    }
    
    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        while (true) {
            final int i = ViewPager.a;
            try {
                if (accessibilityEvent.getEventType() == 4096) {
                    return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
                }
            }
            catch (Resources$NotFoundException ex) {
                throw ex;
            }
            final int childCount = this.getChildCount();
            int n = 0;
            do {
                final boolean dispatchPopulateAccessibilityEvent = false;
                if (n >= childCount) {
                    return dispatchPopulateAccessibilityEvent;
                }
                final View child = this.getChildAt(n);
                Label_0120: {
                    if (child.getVisibility() == 0) {
                        final ViewPager$ItemInfo infoForChild = this.infoForChild(child);
                        if (infoForChild != null) {
                            try {
                                if (infoForChild.position != this.mCurItem) {
                                    break Label_0120;
                                }
                                final View view = child;
                                final AccessibilityEvent accessibilityEvent2 = accessibilityEvent;
                                final boolean b = view.dispatchPopulateAccessibilityEvent(accessibilityEvent2);
                                if (b) {
                                    return true;
                                }
                                break Label_0120;
                            }
                            catch (Resources$NotFoundException ex2) {
                                throw ex2;
                            }
                            try {
                                final View view = child;
                                final AccessibilityEvent accessibilityEvent2 = accessibilityEvent;
                                final boolean b = view.dispatchPopulateAccessibilityEvent(accessibilityEvent2);
                                if (b) {
                                    return true;
                                }
                            }
                            catch (Resources$NotFoundException ex3) {
                                throw ex3;
                            }
                        }
                    }
                }
                ++n;
            } while (i == 0);
            break;
        }
        return false;
    }
    
    float distanceInfluenceForSnapDuration(final float n) {
        return (float)Math.sin((float)(0.4712389167638204 * (n - 0.5f)));
    }
    
    public void draw(final Canvas p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: invokespecial   android/view/ViewGroup.draw:(Landroid/graphics/Canvas;)V
        //     5: aload_0        
        //     6: invokestatic    android/support/v4/view/ViewCompat.getOverScrollMode:(Landroid/view/View;)I
        //     9: istore_2       
        //    10: iload_2        
        //    11: ifeq            51
        //    14: iconst_0       
        //    15: istore_3       
        //    16: iload_2        
        //    17: iconst_1       
        //    18: if_icmpne       251
        //    21: aload_0        
        //    22: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //    25: astore          8
        //    27: iconst_0       
        //    28: istore_3       
        //    29: aload           8
        //    31: ifnull          251
        //    34: aload_0        
        //    35: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //    38: invokevirtual   android/support/v4/view/PagerAdapter.getCount:()I
        //    41: istore          9
        //    43: iconst_0       
        //    44: istore_3       
        //    45: iload           9
        //    47: iconst_1       
        //    48: if_icmple       251
        //    51: aload_0        
        //    52: getfield        android/support/v4/view/ViewPager.mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
        //    55: invokevirtual   android/support/v4/widget/EdgeEffectCompat.isFinished:()Z
        //    58: istore          10
        //    60: iconst_0       
        //    61: istore_3       
        //    62: iload           10
        //    64: ifne            151
        //    67: aload_1        
        //    68: invokevirtual   android/graphics/Canvas.save:()I
        //    71: istore          14
        //    73: aload_0        
        //    74: invokevirtual   android/support/v4/view/ViewPager.getHeight:()I
        //    77: aload_0        
        //    78: invokevirtual   android/support/v4/view/ViewPager.getPaddingTop:()I
        //    81: isub           
        //    82: aload_0        
        //    83: invokevirtual   android/support/v4/view/ViewPager.getPaddingBottom:()I
        //    86: isub           
        //    87: istore          15
        //    89: aload_0        
        //    90: invokevirtual   android/support/v4/view/ViewPager.getWidth:()I
        //    93: istore          16
        //    95: aload_1        
        //    96: ldc_w           270.0
        //    99: invokevirtual   android/graphics/Canvas.rotate:(F)V
        //   102: aload_1        
        //   103: iload           15
        //   105: ineg           
        //   106: aload_0        
        //   107: invokevirtual   android/support/v4/view/ViewPager.getPaddingTop:()I
        //   110: iadd           
        //   111: i2f            
        //   112: aload_0        
        //   113: getfield        android/support/v4/view/ViewPager.mFirstOffset:F
        //   116: iload           16
        //   118: i2f            
        //   119: fmul           
        //   120: invokevirtual   android/graphics/Canvas.translate:(FF)V
        //   123: aload_0        
        //   124: getfield        android/support/v4/view/ViewPager.mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
        //   127: iload           15
        //   129: iload           16
        //   131: invokevirtual   android/support/v4/widget/EdgeEffectCompat.setSize:(II)V
        //   134: iconst_0       
        //   135: aload_0        
        //   136: getfield        android/support/v4/view/ViewPager.mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
        //   139: aload_1        
        //   140: invokevirtual   android/support/v4/widget/EdgeEffectCompat.draw:(Landroid/graphics/Canvas;)Z
        //   143: ior            
        //   144: istore_3       
        //   145: aload_1        
        //   146: iload           14
        //   148: invokevirtual   android/graphics/Canvas.restoreToCount:(I)V
        //   151: aload_0        
        //   152: getfield        android/support/v4/view/ViewPager.mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
        //   155: invokevirtual   android/support/v4/widget/EdgeEffectCompat.isFinished:()Z
        //   158: ifne            265
        //   161: aload_1        
        //   162: invokevirtual   android/graphics/Canvas.save:()I
        //   165: istore          11
        //   167: aload_0        
        //   168: invokevirtual   android/support/v4/view/ViewPager.getWidth:()I
        //   171: istore          12
        //   173: aload_0        
        //   174: invokevirtual   android/support/v4/view/ViewPager.getHeight:()I
        //   177: aload_0        
        //   178: invokevirtual   android/support/v4/view/ViewPager.getPaddingTop:()I
        //   181: isub           
        //   182: aload_0        
        //   183: invokevirtual   android/support/v4/view/ViewPager.getPaddingBottom:()I
        //   186: isub           
        //   187: istore          13
        //   189: aload_1        
        //   190: ldc_w           90.0
        //   193: invokevirtual   android/graphics/Canvas.rotate:(F)V
        //   196: aload_1        
        //   197: aload_0        
        //   198: invokevirtual   android/support/v4/view/ViewPager.getPaddingTop:()I
        //   201: ineg           
        //   202: i2f            
        //   203: fconst_1       
        //   204: aload_0        
        //   205: getfield        android/support/v4/view/ViewPager.mLastOffset:F
        //   208: fadd           
        //   209: fneg           
        //   210: iload           12
        //   212: i2f            
        //   213: fmul           
        //   214: invokevirtual   android/graphics/Canvas.translate:(FF)V
        //   217: aload_0        
        //   218: getfield        android/support/v4/view/ViewPager.mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
        //   221: iload           13
        //   223: iload           12
        //   225: invokevirtual   android/support/v4/widget/EdgeEffectCompat.setSize:(II)V
        //   228: iload_3        
        //   229: aload_0        
        //   230: getfield        android/support/v4/view/ViewPager.mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
        //   233: aload_1        
        //   234: invokevirtual   android/support/v4/widget/EdgeEffectCompat.draw:(Landroid/graphics/Canvas;)Z
        //   237: ior            
        //   238: istore_3       
        //   239: aload_1        
        //   240: iload           11
        //   242: invokevirtual   android/graphics/Canvas.restoreToCount:(I)V
        //   245: getstatic       android/support/v4/view/ViewPager.a:I
        //   248: ifeq            265
        //   251: aload_0        
        //   252: getfield        android/support/v4/view/ViewPager.mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
        //   255: invokevirtual   android/support/v4/widget/EdgeEffectCompat.finish:()V
        //   258: aload_0        
        //   259: getfield        android/support/v4/view/ViewPager.mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
        //   262: invokevirtual   android/support/v4/widget/EdgeEffectCompat.finish:()V
        //   265: iload_3        
        //   266: ifeq            273
        //   269: aload_0        
        //   270: invokestatic    android/support/v4/view/ViewCompat.postInvalidateOnAnimation:(Landroid/view/View;)V
        //   273: return         
        //   274: astore          6
        //   276: aload           6
        //   278: athrow         
        //   279: astore          7
        //   281: aload           7
        //   283: athrow         
        //   284: astore          4
        //   286: aload           4
        //   288: athrow         
        //   289: astore          5
        //   291: aload           5
        //   293: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  21     27     274    279    Landroid/content/res/Resources$NotFoundException;
        //  34     43     279    284    Landroid/content/res/Resources$NotFoundException;
        //  51     60     279    284    Landroid/content/res/Resources$NotFoundException;
        //  239    251    284    289    Landroid/content/res/Resources$NotFoundException;
        //  251    265    284    289    Landroid/content/res/Resources$NotFoundException;
        //  269    273    289    294    Landroid/content/res/Resources$NotFoundException;
        //  276    279    279    284    Landroid/content/res/Resources$NotFoundException;
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
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final Drawable mMarginDrawable = this.mMarginDrawable;
        if (mMarginDrawable == null) {
            return;
        }
        try {
            if (mMarginDrawable.isStateful()) {
                mMarginDrawable.setState(this.getDrawableState());
            }
        }
        catch (Resources$NotFoundException ex) {
            throw ex;
        }
    }
    
    public boolean executeKeyEvent(final KeyEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/view/ViewPager.a:I
        //     3: istore_2       
        //     4: aload_1        
        //     5: invokevirtual   android/view/KeyEvent.getAction:()I
        //     8: istore          4
        //    10: iconst_0       
        //    11: istore          5
        //    13: iload           4
        //    15: ifne            64
        //    18: aload_1        
        //    19: invokevirtual   android/view/KeyEvent.getKeyCode:()I
        //    22: istore          6
        //    24: iconst_0       
        //    25: istore          5
        //    27: iload           6
        //    29: lookupswitch {
        //               21: 70
        //               22: 82
        //               61: 94
        //          default: 64
        //        }
        //    64: iload           5
        //    66: ireturn        
        //    67: astore_3       
        //    68: aload_3        
        //    69: athrow         
        //    70: aload_0        
        //    71: bipush          17
        //    73: invokevirtual   android/support/v4/view/ViewPager.arrowScroll:(I)Z
        //    76: istore          5
        //    78: iload_2        
        //    79: ifeq            64
        //    82: aload_0        
        //    83: bipush          66
        //    85: invokevirtual   android/support/v4/view/ViewPager.arrowScroll:(I)Z
        //    88: istore          5
        //    90: iload_2        
        //    91: ifeq            64
        //    94: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    97: bipush          11
        //    99: if_icmplt       64
        //   102: aload_1        
        //   103: invokestatic    android/support/v4/view/KeyEventCompat.hasNoModifiers:(Landroid/view/KeyEvent;)Z
        //   106: istore          8
        //   108: iload           8
        //   110: ifeq            124
        //   113: aload_0        
        //   114: iconst_2       
        //   115: invokevirtual   android/support/v4/view/ViewPager.arrowScroll:(I)Z
        //   118: istore          5
        //   120: iload_2        
        //   121: ifeq            64
        //   124: aload_1        
        //   125: iconst_1       
        //   126: invokestatic    android/support/v4/view/KeyEventCompat.hasModifiers:(Landroid/view/KeyEvent;I)Z
        //   129: istore          10
        //   131: iload           10
        //   133: ifeq            64
        //   136: aload_0        
        //   137: iconst_1       
        //   138: invokevirtual   android/support/v4/view/ViewPager.arrowScroll:(I)Z
        //   141: ireturn        
        //   142: astore          7
        //   144: aload           7
        //   146: athrow         
        //   147: astore          9
        //   149: aload           9
        //   151: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  4      10     67     70     Landroid/content/res/Resources$NotFoundException;
        //  18     24     67     70     Landroid/content/res/Resources$NotFoundException;
        //  94     108    142    147    Landroid/content/res/Resources$NotFoundException;
        //  124    131    147    152    Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0124:
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
    
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return new ViewPager$LayoutParams();
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return new ViewPager$LayoutParams(this.getContext(), set);
    }
    
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return this.generateDefaultLayoutParams();
    }
    
    public PagerAdapter getAdapter() {
        return this.mAdapter;
    }
    
    protected int getChildDrawingOrder(final int n, int n2) {
        try {
            if (this.mDrawingOrder == 2) {
                n2 = n - 1 - n2;
            }
            return ((ViewPager$LayoutParams)this.mDrawingOrderedChildren.get(n2).getLayoutParams()).childIndex;
        }
        catch (Resources$NotFoundException ex) {
            throw ex;
        }
    }
    
    public int getCurrentItem() {
        return this.mCurItem;
    }
    
    ViewPager$ItemInfo infoForAnyChild(View view) {
        final int a = ViewPager.a;
        Label_0059: {
            View view2;
            while (true) {
                final ViewParent parent = view.getParent();
                if (parent == this) {
                    break Label_0059;
                }
                Label_0029: {
                    if (parent == null) {
                        break Label_0029;
                    }
                    try {
                        if (!(parent instanceof View)) {
                            return null;
                        }
                    }
                    catch (Resources$NotFoundException ex) {
                        throw ex;
                    }
                }
                view2 = (View)parent;
                if (a != 0) {
                    break;
                }
                view = view2;
            }
            return this.infoForChild(view2);
        }
        View view2 = view;
        return this.infoForChild(view2);
    }
    
    ViewPager$ItemInfo infoForChild(final View view) {
        final int a = ViewPager.a;
        int n;
        for (int i = 0; i < this.mItems.size(); i = n) {
            final ViewPager$ItemInfo viewPager$ItemInfo = this.mItems.get(i);
            try {
                if (this.mAdapter.isViewFromObject(view, viewPager$ItemInfo.object)) {
                    return viewPager$ItemInfo;
                }
            }
            catch (Resources$NotFoundException ex) {
                throw ex;
            }
            n = i + 1;
            if (a != 0) {
                break;
            }
        }
        return null;
    }
    
    ViewPager$ItemInfo infoForPosition(final int n) {
        final int a = ViewPager.a;
        int n2;
        for (int i = 0; i < this.mItems.size(); i = n2) {
            final ViewPager$ItemInfo viewPager$ItemInfo = this.mItems.get(i);
            try {
                if (viewPager$ItemInfo.position == n) {
                    return viewPager$ItemInfo;
                }
            }
            catch (Resources$NotFoundException ex) {
                throw ex;
            }
            n2 = i + 1;
            if (a != 0) {
                break;
            }
        }
        return null;
    }
    
    void initViewPager() {
        this.setWillNotDraw(false);
        this.setDescendantFocusability(262144);
        this.setFocusable(true);
        final Context context = this.getContext();
        this.mScroller = new Scroller(context, ViewPager.sInterpolator);
        final ViewConfiguration value = ViewConfiguration.get(context);
        final float density = context.getResources().getDisplayMetrics().density;
        try {
            this.mTouchSlop = ViewConfigurationCompat.getScaledPagingTouchSlop(value);
            this.mMinimumVelocity = (int)(400.0f * density);
            this.mMaximumVelocity = value.getScaledMaximumFlingVelocity();
            this.mLeftEdge = new EdgeEffectCompat(context);
            this.mRightEdge = new EdgeEffectCompat(context);
            this.mFlingDistance = (int)(25.0f * density);
            this.mCloseEnough = (int)(2.0f * density);
            this.mDefaultGutterSize = (int)(16.0f * density);
            ViewCompat.setAccessibilityDelegate((View)this, new ViewPager$MyAccessibilityDelegate(this));
            if (ViewCompat.getImportantForAccessibility((View)this) == 0) {
                ViewCompat.setImportantForAccessibility((View)this, 1);
            }
        }
        catch (Resources$NotFoundException ex) {
            throw ex;
        }
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }
    
    protected void onDetachedFromWindow() {
        this.removeCallbacks(this.mEndScrollRunnable);
        super.onDetachedFromWindow();
    }
    
    protected void onDraw(final Canvas p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/view/ViewPager.a:I
        //     3: istore_2       
        //     4: aload_0        
        //     5: aload_1        
        //     6: invokespecial   android/view/ViewGroup.onDraw:(Landroid/graphics/Canvas;)V
        //     9: aload_0        
        //    10: getfield        android/support/v4/view/ViewPager.mPageMargin:I
        //    13: istore          6
        //    15: iload           6
        //    17: ifle            353
        //    20: aload_0        
        //    21: getfield        android/support/v4/view/ViewPager.mMarginDrawable:Landroid/graphics/drawable/Drawable;
        //    24: astore          7
        //    26: aload           7
        //    28: ifnull          353
        //    31: aload_0        
        //    32: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //    35: invokevirtual   java/util/ArrayList.size:()I
        //    38: ifle            353
        //    41: aload_0        
        //    42: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //    45: astore          8
        //    47: aload           8
        //    49: ifnull          353
        //    52: aload_0        
        //    53: invokevirtual   android/support/v4/view/ViewPager.getScrollX:()I
        //    56: istore          9
        //    58: aload_0        
        //    59: invokevirtual   android/support/v4/view/ViewPager.getWidth:()I
        //    62: istore          10
        //    64: aload_0        
        //    65: getfield        android/support/v4/view/ViewPager.mPageMargin:I
        //    68: i2f            
        //    69: iload           10
        //    71: i2f            
        //    72: fdiv           
        //    73: fstore          11
        //    75: aload_0        
        //    76: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //    79: iconst_0       
        //    80: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    83: checkcast       Landroid/support/v4/view/ViewPager$ItemInfo;
        //    86: astore          12
        //    88: aload           12
        //    90: getfield        android/support/v4/view/ViewPager$ItemInfo.offset:F
        //    93: fstore          13
        //    95: aload_0        
        //    96: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //    99: invokevirtual   java/util/ArrayList.size:()I
        //   102: istore          14
        //   104: aload           12
        //   106: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   109: istore          15
        //   111: aload_0        
        //   112: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   115: iload           14
        //   117: iconst_1       
        //   118: isub           
        //   119: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   122: checkcast       Landroid/support/v4/view/ViewPager$ItemInfo;
        //   125: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   128: istore          16
        //   130: iconst_0       
        //   131: istore          17
        //   133: iload           15
        //   135: istore          18
        //   137: fload           13
        //   139: fstore          19
        //   141: iload           18
        //   143: iload           16
        //   145: if_icmpge       353
        //   148: iload           18
        //   150: aload           12
        //   152: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   155: if_icmple       190
        //   158: iload           17
        //   160: iload           14
        //   162: if_icmpge       190
        //   165: aload_0        
        //   166: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   169: astore          27
        //   171: iinc            17, 1
        //   174: aload           27
        //   176: iload           17
        //   178: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   181: checkcast       Landroid/support/v4/view/ViewPager$ItemInfo;
        //   184: astore          12
        //   186: iload_2        
        //   187: ifeq            148
        //   190: iload           18
        //   192: aload           12
        //   194: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   197: if_icmpne       237
        //   200: aload           12
        //   202: getfield        android/support/v4/view/ViewPager$ItemInfo.offset:F
        //   205: aload           12
        //   207: getfield        android/support/v4/view/ViewPager$ItemInfo.widthFactor:F
        //   210: fadd           
        //   211: iload           10
        //   213: i2f            
        //   214: fmul           
        //   215: fstore          26
        //   217: fload           11
        //   219: aload           12
        //   221: getfield        android/support/v4/view/ViewPager$ItemInfo.offset:F
        //   224: aload           12
        //   226: getfield        android/support/v4/view/ViewPager$ItemInfo.widthFactor:F
        //   229: fadd           
        //   230: fadd           
        //   231: fstore          19
        //   233: iload_2        
        //   234: ifeq            383
        //   237: aload_0        
        //   238: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //   241: iload           18
        //   243: invokevirtual   android/support/v4/view/PagerAdapter.getPageWidth:(I)F
        //   246: fstore          20
        //   248: fload           19
        //   250: fload           20
        //   252: fadd           
        //   253: iload           10
        //   255: i2f            
        //   256: fmul           
        //   257: fstore          21
        //   259: fload           19
        //   261: fload           20
        //   263: fload           11
        //   265: fadd           
        //   266: fadd           
        //   267: fstore          22
        //   269: fload           21
        //   271: fstore          23
        //   273: fload           23
        //   275: aload_0        
        //   276: getfield        android/support/v4/view/ViewPager.mPageMargin:I
        //   279: i2f            
        //   280: fadd           
        //   281: iload           9
        //   283: i2f            
        //   284: fcmpl          
        //   285: ifle            327
        //   288: aload_0        
        //   289: getfield        android/support/v4/view/ViewPager.mMarginDrawable:Landroid/graphics/drawable/Drawable;
        //   292: fload           23
        //   294: f2i            
        //   295: aload_0        
        //   296: getfield        android/support/v4/view/ViewPager.mTopPageBounds:I
        //   299: ldc_w           0.5
        //   302: fload           23
        //   304: aload_0        
        //   305: getfield        android/support/v4/view/ViewPager.mPageMargin:I
        //   308: i2f            
        //   309: fadd           
        //   310: fadd           
        //   311: f2i            
        //   312: aload_0        
        //   313: getfield        android/support/v4/view/ViewPager.mBottomPageBounds:I
        //   316: invokevirtual   android/graphics/drawable/Drawable.setBounds:(IIII)V
        //   319: aload_0        
        //   320: getfield        android/support/v4/view/ViewPager.mMarginDrawable:Landroid/graphics/drawable/Drawable;
        //   323: aload_1        
        //   324: invokevirtual   android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
        //   327: fload           23
        //   329: iload           9
        //   331: iload           10
        //   333: iadd           
        //   334: i2f            
        //   335: fcmpl          
        //   336: ifle            343
        //   339: iload_2        
        //   340: ifeq            353
        //   343: iload           18
        //   345: iconst_1       
        //   346: iadd           
        //   347: istore          25
        //   349: iload_2        
        //   350: ifeq            372
        //   353: return         
        //   354: astore_3       
        //   355: aload_3        
        //   356: athrow         
        //   357: astore          4
        //   359: aload           4
        //   361: athrow         
        //   362: astore          5
        //   364: aload           5
        //   366: athrow         
        //   367: astore          24
        //   369: aload           24
        //   371: athrow         
        //   372: iload           25
        //   374: istore          18
        //   376: fload           22
        //   378: fstore          19
        //   380: goto            141
        //   383: fload           19
        //   385: fstore          22
        //   387: fload           26
        //   389: fstore          23
        //   391: goto            273
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  4      15     354    357    Landroid/content/res/Resources$NotFoundException;
        //  20     26     357    362    Landroid/content/res/Resources$NotFoundException;
        //  31     47     362    367    Landroid/content/res/Resources$NotFoundException;
        //  273    327    367    372    Landroid/content/res/Resources$NotFoundException;
        //  355    357    357    362    Landroid/content/res/Resources$NotFoundException;
        //  359    362    362    367    Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 200, Size: 200
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
    
    public boolean onInterceptTouchEvent(final MotionEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: getstatic       android/support/v4/view/ViewPager.a:I
        //     5: istore_3       
        //     6: sipush          255
        //     9: aload_1        
        //    10: invokevirtual   android/view/MotionEvent.getAction:()I
        //    13: iand           
        //    14: istore          4
        //    16: iload           4
        //    18: iconst_3       
        //    19: if_icmpeq       28
        //    22: iload           4
        //    24: iload_2        
        //    25: if_icmpne       71
        //    28: aload_0        
        //    29: iconst_0       
        //    30: putfield        android/support/v4/view/ViewPager.mIsBeingDragged:Z
        //    33: aload_0        
        //    34: iconst_0       
        //    35: putfield        android/support/v4/view/ViewPager.mIsUnableToDrag:Z
        //    38: aload_0        
        //    39: iconst_m1      
        //    40: putfield        android/support/v4/view/ViewPager.mActivePointerId:I
        //    43: aload_0        
        //    44: getfield        android/support/v4/view/ViewPager.mVelocityTracker:Landroid/view/VelocityTracker;
        //    47: ifnull          62
        //    50: aload_0        
        //    51: getfield        android/support/v4/view/ViewPager.mVelocityTracker:Landroid/view/VelocityTracker;
        //    54: invokevirtual   android/view/VelocityTracker.recycle:()V
        //    57: aload_0        
        //    58: aconst_null    
        //    59: putfield        android/support/v4/view/ViewPager.mVelocityTracker:Landroid/view/VelocityTracker;
        //    62: iconst_0       
        //    63: istore_2       
        //    64: iload_2        
        //    65: ireturn        
        //    66: astore          5
        //    68: aload           5
        //    70: athrow         
        //    71: iload           4
        //    73: ifeq            110
        //    76: aload_0        
        //    77: getfield        android/support/v4/view/ViewPager.mIsBeingDragged:Z
        //    80: istore          45
        //    82: iload           45
        //    84: ifne            64
        //    87: aload_0        
        //    88: getfield        android/support/v4/view/ViewPager.mIsUnableToDrag:Z
        //    91: istore          47
        //    93: iload           47
        //    95: ifeq            110
        //    98: iconst_0       
        //    99: ireturn        
        //   100: astore          44
        //   102: aload           44
        //   104: athrow         
        //   105: astore          46
        //   107: aload           46
        //   109: athrow         
        //   110: iload           4
        //   112: lookupswitch {
        //                0: 464
        //                2: 175
        //                6: 616
        //          default: 148
        //        }
        //   148: aload_0        
        //   149: getfield        android/support/v4/view/ViewPager.mVelocityTracker:Landroid/view/VelocityTracker;
        //   152: ifnonnull       162
        //   155: aload_0        
        //   156: invokestatic    android/view/VelocityTracker.obtain:()Landroid/view/VelocityTracker;
        //   159: putfield        android/support/v4/view/ViewPager.mVelocityTracker:Landroid/view/VelocityTracker;
        //   162: aload_0        
        //   163: getfield        android/support/v4/view/ViewPager.mVelocityTracker:Landroid/view/VelocityTracker;
        //   166: aload_1        
        //   167: invokevirtual   android/view/VelocityTracker.addMovement:(Landroid/view/MotionEvent;)V
        //   170: aload_0        
        //   171: getfield        android/support/v4/view/ViewPager.mIsBeingDragged:Z
        //   174: ireturn        
        //   175: aload_0        
        //   176: getfield        android/support/v4/view/ViewPager.mActivePointerId:I
        //   179: istore          17
        //   181: iload           17
        //   183: iconst_m1      
        //   184: if_icmpne       191
        //   187: iload_3        
        //   188: ifeq            148
        //   191: aload_1        
        //   192: iload           17
        //   194: invokestatic    android/support/v4/view/MotionEventCompat.findPointerIndex:(Landroid/view/MotionEvent;I)I
        //   197: istore          18
        //   199: aload_1        
        //   200: iload           18
        //   202: invokestatic    android/support/v4/view/MotionEventCompat.getX:(Landroid/view/MotionEvent;I)F
        //   205: fstore          19
        //   207: fload           19
        //   209: aload_0        
        //   210: getfield        android/support/v4/view/ViewPager.mLastMotionX:F
        //   213: fsub           
        //   214: fstore          20
        //   216: fload           20
        //   218: invokestatic    java/lang/Math.abs:(F)F
        //   221: fstore          21
        //   223: aload_1        
        //   224: iload           18
        //   226: invokestatic    android/support/v4/view/MotionEventCompat.getY:(Landroid/view/MotionEvent;I)F
        //   229: fstore          22
        //   231: fload           22
        //   233: aload_0        
        //   234: getfield        android/support/v4/view/ViewPager.mInitialMotionY:F
        //   237: fsub           
        //   238: invokestatic    java/lang/Math.abs:(F)F
        //   241: fstore          23
        //   243: fload           20
        //   245: fconst_0       
        //   246: fcmpl          
        //   247: ifeq            326
        //   250: aload_0        
        //   251: aload_0        
        //   252: getfield        android/support/v4/view/ViewPager.mLastMotionX:F
        //   255: fload           20
        //   257: invokespecial   android/support/v4/view/ViewPager.isGutterDrag:(FF)Z
        //   260: istore          40
        //   262: iload           40
        //   264: ifne            326
        //   267: fload           20
        //   269: f2i            
        //   270: istore          41
        //   272: fload           19
        //   274: f2i            
        //   275: istore          42
        //   277: fload           22
        //   279: f2i            
        //   280: istore          43
        //   282: aload_0        
        //   283: aload_0        
        //   284: iconst_0       
        //   285: iload           41
        //   287: iload           42
        //   289: iload           43
        //   291: invokevirtual   android/support/v4/view/ViewPager.canScroll:(Landroid/view/View;ZIII)Z
        //   294: ifeq            326
        //   297: aload_0        
        //   298: fload           19
        //   300: putfield        android/support/v4/view/ViewPager.mLastMotionX:F
        //   303: aload_0        
        //   304: fload           22
        //   306: putfield        android/support/v4/view/ViewPager.mLastMotionY:F
        //   309: aload_0        
        //   310: iconst_1       
        //   311: putfield        android/support/v4/view/ViewPager.mIsUnableToDrag:Z
        //   314: iconst_0       
        //   315: ireturn        
        //   316: astore          38
        //   318: aload           38
        //   320: athrow         
        //   321: astore          39
        //   323: aload           39
        //   325: athrow         
        //   326: aload_0        
        //   327: getfield        android/support/v4/view/ViewPager.mTouchSlop:I
        //   330: istore          27
        //   332: fload           21
        //   334: iload           27
        //   336: i2f            
        //   337: fcmpl          
        //   338: ifle            416
        //   341: ldc_w           0.5
        //   344: fload           21
        //   346: fmul           
        //   347: fload           23
        //   349: fcmpl          
        //   350: ifle            416
        //   353: aload_0        
        //   354: iconst_1       
        //   355: putfield        android/support/v4/view/ViewPager.mIsBeingDragged:Z
        //   358: aload_0        
        //   359: iconst_1       
        //   360: invokespecial   android/support/v4/view/ViewPager.requestParentDisallowInterceptTouchEvent:(Z)V
        //   363: aload_0        
        //   364: iconst_1       
        //   365: invokespecial   android/support/v4/view/ViewPager.setScrollState:(I)V
        //   368: fload           20
        //   370: fconst_0       
        //   371: fcmpl          
        //   372: ifle            644
        //   375: aload_0        
        //   376: getfield        android/support/v4/view/ViewPager.mInitialMotionX:F
        //   379: fstore          34
        //   381: aload_0        
        //   382: getfield        android/support/v4/view/ViewPager.mTouchSlop:I
        //   385: istore          35
        //   387: fload           34
        //   389: iload           35
        //   391: i2f            
        //   392: fadd           
        //   393: fstore          36
        //   395: aload_0        
        //   396: fload           36
        //   398: putfield        android/support/v4/view/ViewPager.mLastMotionX:F
        //   401: aload_0        
        //   402: fload           22
        //   404: putfield        android/support/v4/view/ViewPager.mLastMotionY:F
        //   407: aload_0        
        //   408: iconst_1       
        //   409: invokespecial   android/support/v4/view/ViewPager.setScrollingCacheEnabled:(Z)V
        //   412: iload_3        
        //   413: ifeq            432
        //   416: fload           23
        //   418: aload_0        
        //   419: getfield        android/support/v4/view/ViewPager.mTouchSlop:I
        //   422: i2f            
        //   423: fcmpl          
        //   424: ifle            432
        //   427: aload_0        
        //   428: iconst_1       
        //   429: putfield        android/support/v4/view/ViewPager.mIsUnableToDrag:Z
        //   432: aload_0        
        //   433: getfield        android/support/v4/view/ViewPager.mIsBeingDragged:Z
        //   436: istore          32
        //   438: iload           32
        //   440: ifeq            148
        //   443: aload_0        
        //   444: fload           19
        //   446: invokespecial   android/support/v4/view/ViewPager.performDrag:(F)Z
        //   449: istore          33
        //   451: iload           33
        //   453: ifeq            148
        //   456: aload_0        
        //   457: invokestatic    android/support/v4/view/ViewCompat.postInvalidateOnAnimation:(Landroid/view/View;)V
        //   460: iload_3        
        //   461: ifeq            148
        //   464: aload_1        
        //   465: invokevirtual   android/view/MotionEvent.getX:()F
        //   468: fstore          11
        //   470: aload_0        
        //   471: fload           11
        //   473: putfield        android/support/v4/view/ViewPager.mInitialMotionX:F
        //   476: aload_0        
        //   477: fload           11
        //   479: putfield        android/support/v4/view/ViewPager.mLastMotionX:F
        //   482: aload_1        
        //   483: invokevirtual   android/view/MotionEvent.getY:()F
        //   486: fstore          12
        //   488: aload_0        
        //   489: fload           12
        //   491: putfield        android/support/v4/view/ViewPager.mInitialMotionY:F
        //   494: aload_0        
        //   495: fload           12
        //   497: putfield        android/support/v4/view/ViewPager.mLastMotionY:F
        //   500: aload_0        
        //   501: aload_1        
        //   502: iconst_0       
        //   503: invokestatic    android/support/v4/view/MotionEventCompat.getPointerId:(Landroid/view/MotionEvent;I)I
        //   506: putfield        android/support/v4/view/ViewPager.mActivePointerId:I
        //   509: aload_0        
        //   510: iconst_0       
        //   511: putfield        android/support/v4/view/ViewPager.mIsUnableToDrag:Z
        //   514: aload_0        
        //   515: getfield        android/support/v4/view/ViewPager.mScroller:Landroid/widget/Scroller;
        //   518: invokevirtual   android/widget/Scroller.computeScrollOffset:()Z
        //   521: pop            
        //   522: aload_0        
        //   523: getfield        android/support/v4/view/ViewPager.mScrollState:I
        //   526: istore          14
        //   528: iload           14
        //   530: iconst_2       
        //   531: if_icmpne       602
        //   534: aload_0        
        //   535: getfield        android/support/v4/view/ViewPager.mScroller:Landroid/widget/Scroller;
        //   538: invokevirtual   android/widget/Scroller.getFinalX:()I
        //   541: aload_0        
        //   542: getfield        android/support/v4/view/ViewPager.mScroller:Landroid/widget/Scroller;
        //   545: invokevirtual   android/widget/Scroller.getCurrX:()I
        //   548: isub           
        //   549: invokestatic    java/lang/Math.abs:(I)I
        //   552: istore          15
        //   554: aload_0        
        //   555: getfield        android/support/v4/view/ViewPager.mCloseEnough:I
        //   558: istore          16
        //   560: iload           15
        //   562: iload           16
        //   564: if_icmple       602
        //   567: aload_0        
        //   568: getfield        android/support/v4/view/ViewPager.mScroller:Landroid/widget/Scroller;
        //   571: invokevirtual   android/widget/Scroller.abortAnimation:()V
        //   574: aload_0        
        //   575: iconst_0       
        //   576: putfield        android/support/v4/view/ViewPager.mPopulatePending:Z
        //   579: aload_0        
        //   580: invokevirtual   android/support/v4/view/ViewPager.populate:()V
        //   583: aload_0        
        //   584: iconst_1       
        //   585: putfield        android/support/v4/view/ViewPager.mIsBeingDragged:Z
        //   588: aload_0        
        //   589: iconst_1       
        //   590: invokespecial   android/support/v4/view/ViewPager.requestParentDisallowInterceptTouchEvent:(Z)V
        //   593: aload_0        
        //   594: iconst_1       
        //   595: invokespecial   android/support/v4/view/ViewPager.setScrollState:(I)V
        //   598: iload_3        
        //   599: ifeq            148
        //   602: aload_0        
        //   603: iconst_0       
        //   604: invokespecial   android/support/v4/view/ViewPager.completeScroll:(Z)V
        //   607: aload_0        
        //   608: iconst_0       
        //   609: putfield        android/support/v4/view/ViewPager.mIsBeingDragged:Z
        //   612: iload_3        
        //   613: ifeq            148
        //   616: aload_0        
        //   617: aload_1        
        //   618: invokespecial   android/support/v4/view/ViewPager.onSecondaryPointerUp:(Landroid/view/MotionEvent;)V
        //   621: goto            148
        //   624: astore          6
        //   626: aload           6
        //   628: athrow         
        //   629: astore          24
        //   631: aload           24
        //   633: athrow         
        //   634: astore          25
        //   636: aload           25
        //   638: athrow         
        //   639: astore          26
        //   641: aload           26
        //   643: athrow         
        //   644: aload_0        
        //   645: getfield        android/support/v4/view/ViewPager.mInitialMotionX:F
        //   648: aload_0        
        //   649: getfield        android/support/v4/view/ViewPager.mTouchSlop:I
        //   652: i2f            
        //   653: fsub           
        //   654: fstore          36
        //   656: goto            395
        //   659: astore          37
        //   661: aload           37
        //   663: athrow         
        //   664: astore          28
        //   666: aload           28
        //   668: athrow         
        //   669: astore          29
        //   671: aload           29
        //   673: athrow         
        //   674: astore          30
        //   676: aload           30
        //   678: athrow         
        //   679: astore          31
        //   681: aload           31
        //   683: athrow         
        //   684: astore          8
        //   686: aload           8
        //   688: athrow         
        //   689: astore          9
        //   691: aload           9
        //   693: athrow         
        //   694: astore          10
        //   696: aload           10
        //   698: athrow         
        //   699: astore          7
        //   701: aload           7
        //   703: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  28     62     66     71     Landroid/content/res/Resources$NotFoundException;
        //  76     82     100    105    Landroid/content/res/Resources$NotFoundException;
        //  87     93     105    110    Landroid/content/res/Resources$NotFoundException;
        //  148    162    699    704    Landroid/content/res/Resources$NotFoundException;
        //  250    262    316    321    Landroid/content/res/Resources$NotFoundException;
        //  282    314    321    326    Landroid/content/res/Resources$NotFoundException;
        //  318    321    321    326    Landroid/content/res/Resources$NotFoundException;
        //  326    332    629    639    Landroid/content/res/Resources$NotFoundException;
        //  353    368    639    644    Landroid/content/res/Resources$NotFoundException;
        //  375    387    639    644    Landroid/content/res/Resources$NotFoundException;
        //  395    412    659    664    Landroid/content/res/Resources$NotFoundException;
        //  416    432    664    669    Landroid/content/res/Resources$NotFoundException;
        //  432    438    669    674    Landroid/content/res/Resources$NotFoundException;
        //  443    451    674    679    Landroid/content/res/Resources$NotFoundException;
        //  456    460    679    684    Landroid/content/res/Resources$NotFoundException;
        //  464    528    684    689    Landroid/content/res/Resources$NotFoundException;
        //  534    560    689    694    Landroid/content/res/Resources$NotFoundException;
        //  567    598    694    699    Landroid/content/res/Resources$NotFoundException;
        //  602    612    624    629    Landroid/content/res/Resources$NotFoundException;
        //  616    621    624    629    Landroid/content/res/Resources$NotFoundException;
        //  631    634    634    639    Landroid/content/res/Resources$NotFoundException;
        //  636    639    639    644    Landroid/content/res/Resources$NotFoundException;
        //  661    664    664    669    Landroid/content/res/Resources$NotFoundException;
        //  671    674    674    679    Landroid/content/res/Resources$NotFoundException;
        //  676    679    679    684    Landroid/content/res/Resources$NotFoundException;
        //  681    684    684    689    Landroid/content/res/Resources$NotFoundException;
        //  686    689    689    694    Landroid/content/res/Resources$NotFoundException;
        //  691    694    694    699    Landroid/content/res/Resources$NotFoundException;
        //  696    699    624    629    Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 357, Size: 357
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
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final int a = ViewPager.a;
        final int childCount = this.getChildCount();
        final int n5 = n3 - n;
        final int n6 = n4 - n2;
        int n7 = this.getPaddingLeft();
        int mTopPageBounds = this.getPaddingTop();
        int paddingRight = this.getPaddingRight();
        int paddingBottom = this.getPaddingBottom();
        final int scrollX = this.getScrollX();
        int n8 = 0;
        int i = 0;
        while (true) {
        Label_0399_Outer:
            while (i < childCount) {
                final View child = this.getChildAt(i);
            Label_0399:
                while (true) {
                    Label_0739: {
                        if (child.getVisibility() == 8) {
                            break Label_0739;
                        }
                        final ViewPager$LayoutParams viewPager$LayoutParams = (ViewPager$LayoutParams)child.getLayoutParams();
                        if (viewPager$LayoutParams.isDecor) {
                            final int n9 = 0x7 & viewPager$LayoutParams.gravity;
                            final int n10 = 0x70 & viewPager$LayoutParams.gravity;
                            while (true) {
                                int n13 = 0;
                                Label_0703: {
                                    Label_0202: {
                                        Label_0165: {
                                            switch (n9) {
                                                default: {
                                                    if (a != 0) {
                                                        break Label_0165;
                                                    }
                                                    final int n11 = n7;
                                                    final int n12 = n7;
                                                    break Label_0233;
                                                }
                                                case 3: {
                                                    n13 = n7 + child.getMeasuredWidth();
                                                    if (a != 0) {
                                                        break;
                                                    }
                                                    break Label_0703;
                                                }
                                                case 1: {
                                                    n13 = n7;
                                                    break;
                                                }
                                                case 5: {
                                                    n13 = n7;
                                                    break Label_0202;
                                                }
                                            }
                                        }
                                        n7 = Math.max((n5 - child.getMeasuredWidth()) / 2, n13);
                                        if (a == 0) {
                                            break Label_0703;
                                        }
                                    }
                                    final int n14 = n5 - paddingRight - child.getMeasuredWidth();
                                    paddingRight += child.getMeasuredWidth();
                                    final int n11 = n14;
                                    final int n12 = n13;
                                    while (true) {
                                        int n17 = 0;
                                        Label_0667: {
                                            Label_0310: {
                                                Label_0273: {
                                                    switch (n10) {
                                                        default: {
                                                            if (a != 0) {
                                                                break Label_0273;
                                                            }
                                                            final int n15 = paddingBottom;
                                                            final int n16 = mTopPageBounds;
                                                            break Label_0341;
                                                        }
                                                        case 48: {
                                                            n17 = mTopPageBounds + child.getMeasuredHeight();
                                                            if (a != 0) {
                                                                break;
                                                            }
                                                            break Label_0667;
                                                        }
                                                        case 16: {
                                                            n17 = mTopPageBounds;
                                                            break;
                                                        }
                                                        case 80: {
                                                            n17 = mTopPageBounds;
                                                            break Label_0310;
                                                        }
                                                    }
                                                }
                                                mTopPageBounds = Math.max((n6 - child.getMeasuredHeight()) / 2, n17);
                                                if (a == 0) {
                                                    break Label_0667;
                                                }
                                            }
                                            mTopPageBounds = n6 - paddingBottom - child.getMeasuredHeight();
                                            final int n18 = paddingBottom + child.getMeasuredHeight();
                                            final int n16 = n17;
                                            final int n15 = n18;
                                            final int n19 = n11 + scrollX;
                                            child.layout(n19, mTopPageBounds, n19 + child.getMeasuredWidth(), mTopPageBounds + child.getMeasuredHeight());
                                            final int n20 = n8 + 1;
                                            paddingBottom = n15;
                                            mTopPageBounds = n16;
                                            final int n21 = paddingRight;
                                            final int n22 = n20;
                                            final int n23 = n12;
                                            break Label_0399;
                                        }
                                        final int n16 = n17;
                                        final int n15 = paddingBottom;
                                        continue Label_0399_Outer;
                                    }
                                }
                                final int n11 = n7;
                                final int n12 = n13;
                                continue Label_0399_Outer;
                            }
                        }
                        break Label_0739;
                        final int n24 = i + 1;
                        int n21 = 0;
                        int n22 = 0;
                        int n23 = 0;
                        if (a == 0) {
                            i = n24;
                            paddingRight = n21;
                            n7 = n23;
                            n8 = n22;
                            continue Label_0399_Outer;
                        }
                        final int n25 = n22;
                        final int n26 = n21;
                        final int mDecorChildCount = n25;
                        final int n27 = n5 - n23 - n26;
                        int n28 = 0;
                        while (true) {
                            final int n30;
                            Label_0641: {
                                if (n28 < childCount) {
                                    final View child2 = this.getChildAt(n28);
                                    if (child2.getVisibility() != 8) {
                                        final ViewPager$LayoutParams viewPager$LayoutParams2 = (ViewPager$LayoutParams)child2.getLayoutParams();
                                        if (!viewPager$LayoutParams2.isDecor) {
                                            final ViewPager$ItemInfo infoForChild = this.infoForChild(child2);
                                            if (infoForChild != null) {
                                                final int n29 = n23 + (int)(n27 * infoForChild.offset);
                                                if (viewPager$LayoutParams2.needsMeasure) {
                                                    viewPager$LayoutParams2.needsMeasure = false;
                                                    child2.measure(View$MeasureSpec.makeMeasureSpec((int)(n27 * viewPager$LayoutParams2.widthFactor), 1073741824), View$MeasureSpec.makeMeasureSpec(n6 - mTopPageBounds - paddingBottom, 1073741824));
                                                }
                                                child2.layout(n29, mTopPageBounds, n29 + child2.getMeasuredWidth(), mTopPageBounds + child2.getMeasuredHeight());
                                            }
                                        }
                                    }
                                    n30 = n28 + 1;
                                    if (a == 0) {
                                        break Label_0641;
                                    }
                                }
                                try {
                                    this.mTopPageBounds = mTopPageBounds;
                                    this.mBottomPageBounds = n6 - paddingBottom;
                                    this.mDecorChildCount = mDecorChildCount;
                                    if (this.mFirstLayout) {
                                        this.scrollToItem(this.mCurItem, false, 0, false);
                                    }
                                    this.mFirstLayout = false;
                                    return;
                                }
                                catch (Resources$NotFoundException ex) {
                                    throw ex;
                                }
                            }
                            n28 = n30;
                        }
                    }
                    final int n22 = n8;
                    final int n23 = n7;
                    final int n21 = paddingRight;
                    continue Label_0399;
                }
            }
            final int n26 = paddingRight;
            final int n31 = n8;
            final int n23 = n7;
            final int mDecorChildCount = n31;
            continue;
        }
    }
    
    protected void onMeasure(final int p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/view/ViewPager.a:I
        //     3: istore_3       
        //     4: aload_0        
        //     5: iconst_0       
        //     6: iload_1        
        //     7: invokestatic    android/support/v4/view/ViewPager.getDefaultSize:(II)I
        //    10: iconst_0       
        //    11: iload_2        
        //    12: invokestatic    android/support/v4/view/ViewPager.getDefaultSize:(II)I
        //    15: invokevirtual   android/support/v4/view/ViewPager.setMeasuredDimension:(II)V
        //    18: aload_0        
        //    19: invokevirtual   android/support/v4/view/ViewPager.getMeasuredWidth:()I
        //    22: istore          4
        //    24: aload_0        
        //    25: iload           4
        //    27: bipush          10
        //    29: idiv           
        //    30: aload_0        
        //    31: getfield        android/support/v4/view/ViewPager.mDefaultGutterSize:I
        //    34: invokestatic    java/lang/Math.min:(II)I
        //    37: putfield        android/support/v4/view/ViewPager.mGutterSize:I
        //    40: iload           4
        //    42: aload_0        
        //    43: invokevirtual   android/support/v4/view/ViewPager.getPaddingLeft:()I
        //    46: isub           
        //    47: aload_0        
        //    48: invokevirtual   android/support/v4/view/ViewPager.getPaddingRight:()I
        //    51: isub           
        //    52: istore          5
        //    54: aload_0        
        //    55: invokevirtual   android/support/v4/view/ViewPager.getMeasuredHeight:()I
        //    58: aload_0        
        //    59: invokevirtual   android/support/v4/view/ViewPager.getPaddingTop:()I
        //    62: isub           
        //    63: aload_0        
        //    64: invokevirtual   android/support/v4/view/ViewPager.getPaddingBottom:()I
        //    67: isub           
        //    68: istore          6
        //    70: aload_0        
        //    71: invokevirtual   android/support/v4/view/ViewPager.getChildCount:()I
        //    74: istore          7
        //    76: iconst_0       
        //    77: istore          8
        //    79: iload           8
        //    81: iload           7
        //    83: if_icmpge       342
        //    86: aload_0        
        //    87: iload           8
        //    89: invokevirtual   android/support/v4/view/ViewPager.getChildAt:(I)Landroid/view/View;
        //    92: astore          16
        //    94: aload           16
        //    96: invokevirtual   android/view/View.getVisibility:()I
        //    99: bipush          8
        //   101: if_icmpeq       332
        //   104: aload           16
        //   106: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   109: checkcast       Landroid/support/v4/view/ViewPager$LayoutParams;
        //   112: astore          18
        //   114: aload           18
        //   116: ifnull          332
        //   119: aload           18
        //   121: getfield        android/support/v4/view/ViewPager$LayoutParams.isDecor:Z
        //   124: istore          20
        //   126: iload           20
        //   128: ifeq            332
        //   131: bipush          7
        //   133: aload           18
        //   135: getfield        android/support/v4/view/ViewPager$LayoutParams.gravity:I
        //   138: iand           
        //   139: istore          21
        //   141: bipush          112
        //   143: aload           18
        //   145: getfield        android/support/v4/view/ViewPager$LayoutParams.gravity:I
        //   148: iand           
        //   149: istore          22
        //   151: ldc_w           -2147483648
        //   154: istore          23
        //   156: ldc_w           -2147483648
        //   159: istore          24
        //   161: iload           22
        //   163: bipush          48
        //   165: if_icmpeq       175
        //   168: iload           22
        //   170: bipush          80
        //   172: if_icmpne       482
        //   175: iconst_1       
        //   176: istore          25
        //   178: iload           21
        //   180: iconst_3       
        //   181: if_icmpeq       190
        //   184: iload           21
        //   186: iconst_5       
        //   187: if_icmpne       488
        //   190: iconst_1       
        //   191: istore          26
        //   193: iload           25
        //   195: ifeq            207
        //   198: ldc_w           1073741824
        //   201: istore          23
        //   203: iload_3        
        //   204: ifeq            217
        //   207: iload           26
        //   209: ifeq            217
        //   212: ldc_w           1073741824
        //   215: istore          24
        //   217: aload           18
        //   219: getfield        android/support/v4/view/ViewPager$LayoutParams.width:I
        //   222: bipush          -2
        //   224: if_icmpeq       527
        //   227: ldc_w           1073741824
        //   230: istore          27
        //   232: aload           18
        //   234: getfield        android/support/v4/view/ViewPager$LayoutParams.width:I
        //   237: iconst_m1      
        //   238: if_icmpeq       520
        //   241: aload           18
        //   243: getfield        android/support/v4/view/ViewPager$LayoutParams.width:I
        //   246: istore          28
        //   248: aload           18
        //   250: getfield        android/support/v4/view/ViewPager$LayoutParams.height:I
        //   253: bipush          -2
        //   255: if_icmpeq       513
        //   258: ldc_w           1073741824
        //   261: istore          24
        //   263: aload           18
        //   265: getfield        android/support/v4/view/ViewPager$LayoutParams.height:I
        //   268: iconst_m1      
        //   269: if_icmpeq       513
        //   272: aload           18
        //   274: getfield        android/support/v4/view/ViewPager$LayoutParams.height:I
        //   277: istore          29
        //   279: aload           16
        //   281: iload           28
        //   283: iload           27
        //   285: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   288: iload           29
        //   290: iload           24
        //   292: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   295: invokevirtual   android/view/View.measure:(II)V
        //   298: iload           25
        //   300: ifeq            317
        //   303: iload           6
        //   305: aload           16
        //   307: invokevirtual   android/view/View.getMeasuredHeight:()I
        //   310: isub           
        //   311: istore          6
        //   313: iload_3        
        //   314: ifeq            332
        //   317: iload           26
        //   319: ifeq            332
        //   322: iload           5
        //   324: aload           16
        //   326: invokevirtual   android/view/View.getMeasuredWidth:()I
        //   329: isub           
        //   330: istore          5
        //   332: iload           8
        //   334: iconst_1       
        //   335: iadd           
        //   336: istore          17
        //   338: iload_3        
        //   339: ifeq            506
        //   342: aload_0        
        //   343: iload           5
        //   345: ldc_w           1073741824
        //   348: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   351: putfield        android/support/v4/view/ViewPager.mChildWidthMeasureSpec:I
        //   354: aload_0        
        //   355: iload           6
        //   357: ldc_w           1073741824
        //   360: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   363: putfield        android/support/v4/view/ViewPager.mChildHeightMeasureSpec:I
        //   366: aload_0        
        //   367: iconst_1       
        //   368: putfield        android/support/v4/view/ViewPager.mInLayout:Z
        //   371: aload_0        
        //   372: invokevirtual   android/support/v4/view/ViewPager.populate:()V
        //   375: aload_0        
        //   376: iconst_0       
        //   377: putfield        android/support/v4/view/ViewPager.mInLayout:Z
        //   380: aload_0        
        //   381: invokevirtual   android/support/v4/view/ViewPager.getChildCount:()I
        //   384: istore          9
        //   386: iconst_0       
        //   387: istore          10
        //   389: iload           10
        //   391: iload           9
        //   393: if_icmpge       476
        //   396: aload_0        
        //   397: iload           10
        //   399: invokevirtual   android/support/v4/view/ViewPager.getChildAt:(I)Landroid/view/View;
        //   402: astore          11
        //   404: aload           11
        //   406: invokevirtual   android/view/View.getVisibility:()I
        //   409: bipush          8
        //   411: if_icmpeq       466
        //   414: aload           11
        //   416: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   419: checkcast       Landroid/support/v4/view/ViewPager$LayoutParams;
        //   422: astore          13
        //   424: aload           13
        //   426: ifnull          441
        //   429: aload           13
        //   431: getfield        android/support/v4/view/ViewPager$LayoutParams.isDecor:Z
        //   434: istore          15
        //   436: iload           15
        //   438: ifne            466
        //   441: aload           11
        //   443: iload           5
        //   445: i2f            
        //   446: aload           13
        //   448: getfield        android/support/v4/view/ViewPager$LayoutParams.widthFactor:F
        //   451: fmul           
        //   452: f2i            
        //   453: ldc_w           1073741824
        //   456: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   459: aload_0        
        //   460: getfield        android/support/v4/view/ViewPager.mChildHeightMeasureSpec:I
        //   463: invokevirtual   android/view/View.measure:(II)V
        //   466: iload           10
        //   468: iconst_1       
        //   469: iadd           
        //   470: istore          12
        //   472: iload_3        
        //   473: ifeq            499
        //   476: return         
        //   477: astore          19
        //   479: aload           19
        //   481: athrow         
        //   482: iconst_0       
        //   483: istore          25
        //   485: goto            178
        //   488: iconst_0       
        //   489: istore          26
        //   491: goto            193
        //   494: astore          14
        //   496: aload           14
        //   498: athrow         
        //   499: iload           12
        //   501: istore          10
        //   503: goto            389
        //   506: iload           17
        //   508: istore          8
        //   510: goto            79
        //   513: iload           6
        //   515: istore          29
        //   517: goto            279
        //   520: iload           5
        //   522: istore          28
        //   524: goto            248
        //   527: iload           23
        //   529: istore          27
        //   531: iload           5
        //   533: istore          28
        //   535: goto            248
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  119    126    477    482    Landroid/content/res/Resources$NotFoundException;
        //  429    436    494    499    Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0441:
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
    
    protected void onPageScrolled(final int p0, final float p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/view/ViewPager.a:I
        //     3: istore          4
        //     5: aload_0        
        //     6: getfield        android/support/v4/view/ViewPager.mDecorChildCount:I
        //     9: ifle            101
        //    12: aload_0        
        //    13: invokevirtual   android/support/v4/view/ViewPager.getScrollX:()I
        //    16: istore          16
        //    18: aload_0        
        //    19: invokevirtual   android/support/v4/view/ViewPager.getPaddingLeft:()I
        //    22: istore          17
        //    24: aload_0        
        //    25: invokevirtual   android/support/v4/view/ViewPager.getPaddingRight:()I
        //    28: istore          18
        //    30: aload_0        
        //    31: invokevirtual   android/support/v4/view/ViewPager.getWidth:()I
        //    34: istore          19
        //    36: aload_0        
        //    37: invokevirtual   android/support/v4/view/ViewPager.getChildCount:()I
        //    40: istore          20
        //    42: iconst_0       
        //    43: istore          21
        //    45: iload           21
        //    47: iload           20
        //    49: if_icmpge       101
        //    52: aload_0        
        //    53: iload           21
        //    55: invokevirtual   android/support/v4/view/ViewPager.getChildAt:(I)Landroid/view/View;
        //    58: astore          22
        //    60: aload           22
        //    62: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //    65: checkcast       Landroid/support/v4/view/ViewPager$LayoutParams;
        //    68: astore          23
        //    70: aload           23
        //    72: getfield        android/support/v4/view/ViewPager$LayoutParams.isDecor:Z
        //    75: istore          25
        //    77: iload           25
        //    79: ifne            220
        //    82: iload           18
        //    84: istore          29
        //    86: iload           17
        //    88: istore          28
        //    90: iload           21
        //    92: iconst_1       
        //    93: iadd           
        //    94: istore          32
        //    96: iload           4
        //    98: ifeq            425
        //   101: aload_0        
        //   102: getfield        android/support/v4/view/ViewPager.mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
        //   105: ifnull          120
        //   108: aload_0        
        //   109: getfield        android/support/v4/view/ViewPager.mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
        //   112: iload_1        
        //   113: fload_2        
        //   114: iload_3        
        //   115: invokeinterface android/support/v4/view/ViewPager$OnPageChangeListener.onPageScrolled:(IFI)V
        //   120: aload_0        
        //   121: getfield        android/support/v4/view/ViewPager.mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
        //   124: ifnull          139
        //   127: aload_0        
        //   128: getfield        android/support/v4/view/ViewPager.mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
        //   131: iload_1        
        //   132: fload_2        
        //   133: iload_3        
        //   134: invokeinterface android/support/v4/view/ViewPager$OnPageChangeListener.onPageScrolled:(IFI)V
        //   139: aload_0        
        //   140: getfield        android/support/v4/view/ViewPager.mPageTransformer:Landroid/support/v4/view/ViewPager$PageTransformer;
        //   143: ifnull          209
        //   146: aload_0        
        //   147: invokevirtual   android/support/v4/view/ViewPager.getScrollX:()I
        //   150: istore          7
        //   152: aload_0        
        //   153: invokevirtual   android/support/v4/view/ViewPager.getChildCount:()I
        //   156: istore          8
        //   158: iconst_0       
        //   159: istore          9
        //   161: iload           9
        //   163: iload           8
        //   165: if_icmpge       209
        //   168: aload_0        
        //   169: iload           9
        //   171: invokevirtual   android/support/v4/view/ViewPager.getChildAt:(I)Landroid/view/View;
        //   174: astore          10
        //   176: aload           10
        //   178: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   181: checkcast       Landroid/support/v4/view/ViewPager$LayoutParams;
        //   184: astore          11
        //   186: aload           11
        //   188: getfield        android/support/v4/view/ViewPager$LayoutParams.isDecor:Z
        //   191: istore          13
        //   193: iload           13
        //   195: ifeq            385
        //   198: iload           9
        //   200: iconst_1       
        //   201: iadd           
        //   202: istore          15
        //   204: iload           4
        //   206: ifeq            418
        //   209: aload_0        
        //   210: iconst_1       
        //   211: putfield        android/support/v4/view/ViewPager.mCalledSuper:Z
        //   214: return         
        //   215: astore          24
        //   217: aload           24
        //   219: athrow         
        //   220: bipush          7
        //   222: aload           23
        //   224: getfield        android/support/v4/view/ViewPager$LayoutParams.gravity:I
        //   227: iand           
        //   228: tableswitch {
        //                2: 466
        //                3: 264
        //                4: 269
        //                5: 264
        //                6: 473
        //          default: 264
        //        }
        //   264: iload           4
        //   266: ifeq            455
        //   269: iload           17
        //   271: aload           22
        //   273: invokevirtual   android/view/View.getWidth:()I
        //   276: iadd           
        //   277: istore          26
        //   279: iload           4
        //   281: ifeq            440
        //   284: iload           19
        //   286: aload           22
        //   288: invokevirtual   android/view/View.getMeasuredWidth:()I
        //   291: isub           
        //   292: iconst_2       
        //   293: idiv           
        //   294: iload           26
        //   296: invokestatic    java/lang/Math.max:(II)I
        //   299: istore          17
        //   301: iload           4
        //   303: ifeq            440
        //   306: iload           19
        //   308: iload           18
        //   310: isub           
        //   311: aload           22
        //   313: invokevirtual   android/view/View.getMeasuredWidth:()I
        //   316: isub           
        //   317: istore          17
        //   319: iload           18
        //   321: aload           22
        //   323: invokevirtual   android/view/View.getMeasuredWidth:()I
        //   326: iadd           
        //   327: istore          27
        //   329: iload           26
        //   331: istore          28
        //   333: iload           27
        //   335: istore          29
        //   337: iload           17
        //   339: iload           16
        //   341: iadd           
        //   342: aload           22
        //   344: invokevirtual   android/view/View.getLeft:()I
        //   347: isub           
        //   348: istore          30
        //   350: iload           30
        //   352: ifeq            90
        //   355: aload           22
        //   357: iload           30
        //   359: invokevirtual   android/view/View.offsetLeftAndRight:(I)V
        //   362: goto            90
        //   365: astore          31
        //   367: aload           31
        //   369: athrow         
        //   370: astore          5
        //   372: aload           5
        //   374: athrow         
        //   375: astore          6
        //   377: aload           6
        //   379: athrow         
        //   380: astore          12
        //   382: aload           12
        //   384: athrow         
        //   385: aload           10
        //   387: invokevirtual   android/view/View.getLeft:()I
        //   390: iload           7
        //   392: isub           
        //   393: i2f            
        //   394: aload_0        
        //   395: invokespecial   android/support/v4/view/ViewPager.getClientWidth:()I
        //   398: i2f            
        //   399: fdiv           
        //   400: fstore          14
        //   402: aload_0        
        //   403: getfield        android/support/v4/view/ViewPager.mPageTransformer:Landroid/support/v4/view/ViewPager$PageTransformer;
        //   406: aload           10
        //   408: fload           14
        //   410: invokeinterface android/support/v4/view/ViewPager$PageTransformer.transformPage:(Landroid/view/View;F)V
        //   415: goto            198
        //   418: iload           15
        //   420: istore          9
        //   422: goto            161
        //   425: iload           32
        //   427: istore          21
        //   429: iload           28
        //   431: istore          17
        //   433: iload           29
        //   435: istore          18
        //   437: goto            45
        //   440: iload           18
        //   442: istore          33
        //   444: iload           26
        //   446: istore          28
        //   448: iload           33
        //   450: istore          29
        //   452: goto            337
        //   455: iload           18
        //   457: istore          29
        //   459: iload           17
        //   461: istore          28
        //   463: goto            337
        //   466: iload           17
        //   468: istore          26
        //   470: goto            284
        //   473: iload           17
        //   475: istore          26
        //   477: goto            306
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  70     77     215    220    Landroid/content/res/Resources$NotFoundException;
        //  101    120    370    375    Landroid/content/res/Resources$NotFoundException;
        //  120    139    375    380    Landroid/content/res/Resources$NotFoundException;
        //  186    193    380    385    Landroid/content/res/Resources$NotFoundException;
        //  355    362    365    370    Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 216, Size: 216
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
    
    protected boolean onRequestFocusInDescendants(final int n, final Rect rect) {
        int n2 = -1;
        final int a = ViewPager.a;
        int childCount = this.getChildCount();
        int i;
        if ((n & 0x2) == 0x0 || a != 0) {
            i = childCount - 1;
            childCount = n2;
        }
        else {
            n2 = 1;
            i = 0;
        }
        while (i != childCount) {
            final View child = this.getChildAt(i);
            Label_0111: {
                if (child.getVisibility() == 0) {
                    final ViewPager$ItemInfo infoForChild = this.infoForChild(child);
                    if (infoForChild != null) {
                        try {
                            if (infoForChild.position != this.mCurItem) {
                                break Label_0111;
                            }
                            final View view = child;
                            final int n3 = n;
                            final Rect rect2 = rect;
                            final boolean b = view.requestFocus(n3, rect2);
                            if (b) {
                                return true;
                            }
                            break Label_0111;
                        }
                        catch (Resources$NotFoundException ex) {
                            throw ex;
                        }
                        try {
                            final View view = child;
                            final int n3 = n;
                            final Rect rect2 = rect;
                            final boolean b = view.requestFocus(n3, rect2);
                            if (b) {
                                return true;
                            }
                        }
                        catch (Resources$NotFoundException ex2) {
                            throw ex2;
                        }
                    }
                }
            }
            i += n2;
            if (a != 0) {
                break;
            }
        }
        return false;
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        while (true) {
            try {
                if (!(parcelable instanceof ViewPager$SavedState)) {
                    super.onRestoreInstanceState(parcelable);
                    return;
                }
            }
            catch (Resources$NotFoundException ex) {
                throw ex;
            }
            final ViewPager$SavedState viewPager$SavedState = (ViewPager$SavedState)parcelable;
            try {
                super.onRestoreInstanceState(viewPager$SavedState.getSuperState());
                Label_0071: {
                    if (this.mAdapter == null) {
                        break Label_0071;
                    }
                    try {
                        this.mAdapter.restoreState(viewPager$SavedState.adapterState, viewPager$SavedState.loader);
                        this.setCurrentItemInternal(viewPager$SavedState.position, false, true);
                        if (ViewPager.a != 0) {
                            this.mRestoredCurItem = viewPager$SavedState.position;
                            this.mRestoredAdapterState = viewPager$SavedState.adapterState;
                            this.mRestoredClassLoader = viewPager$SavedState.loader;
                        }
                    }
                    catch (Resources$NotFoundException ex2) {
                        throw ex2;
                    }
                }
            }
            catch (Resources$NotFoundException ex3) {
                throw ex3;
            }
        }
    }
    
    public Parcelable onSaveInstanceState() {
        final ViewPager$SavedState viewPager$SavedState = new ViewPager$SavedState(super.onSaveInstanceState());
        try {
            viewPager$SavedState.position = this.mCurItem;
            if (this.mAdapter != null) {
                viewPager$SavedState.adapterState = this.mAdapter.saveState();
            }
            return (Parcelable)viewPager$SavedState;
        }
        catch (Resources$NotFoundException ex) {
            throw ex;
        }
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        try {
            super.onSizeChanged(n, n2, n3, n4);
            if (n != n3) {
                this.recomputeScrollPosition(n, n3, this.mPageMargin, this.mPageMargin);
            }
        }
        catch (Resources$NotFoundException ex) {
            throw ex;
        }
    }
    
    public boolean onTouchEvent(final MotionEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/view/ViewPager.a:I
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        android/support/v4/view/ViewPager.mFakeDragging:Z
        //     8: istore          4
        //    10: iload           4
        //    12: ifeq            24
        //    15: iconst_1       
        //    16: istore          11
        //    18: iload           11
        //    20: ireturn        
        //    21: astore_3       
        //    22: aload_3        
        //    23: athrow         
        //    24: aload_1        
        //    25: invokevirtual   android/view/MotionEvent.getAction:()I
        //    28: istore          7
        //    30: iload           7
        //    32: ifne            49
        //    35: aload_1        
        //    36: invokevirtual   android/view/MotionEvent.getEdgeFlags:()I
        //    39: istore          49
        //    41: iconst_0       
        //    42: istore          11
        //    44: iload           49
        //    46: ifne            18
        //    49: aload_0        
        //    50: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //    53: astore          10
        //    55: iconst_0       
        //    56: istore          11
        //    58: aload           10
        //    60: ifnull          18
        //    63: aload_0        
        //    64: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //    67: invokevirtual   android/support/v4/view/PagerAdapter.getCount:()I
        //    70: istore          12
        //    72: iconst_0       
        //    73: istore          11
        //    75: iload           12
        //    77: ifeq            18
        //    80: aload_0        
        //    81: getfield        android/support/v4/view/ViewPager.mVelocityTracker:Landroid/view/VelocityTracker;
        //    84: ifnonnull       94
        //    87: aload_0        
        //    88: invokestatic    android/view/VelocityTracker.obtain:()Landroid/view/VelocityTracker;
        //    91: putfield        android/support/v4/view/ViewPager.mVelocityTracker:Landroid/view/VelocityTracker;
        //    94: aload_0        
        //    95: getfield        android/support/v4/view/ViewPager.mVelocityTracker:Landroid/view/VelocityTracker;
        //    98: aload_1        
        //    99: invokevirtual   android/view/VelocityTracker.addMovement:(Landroid/view/MotionEvent;)V
        //   102: sipush          255
        //   105: aload_1        
        //   106: invokevirtual   android/view/MotionEvent.getAction:()I
        //   109: iand           
        //   110: istore          14
        //   112: iconst_0       
        //   113: istore          15
        //   115: iload           14
        //   117: tableswitch {
        //                0: 196
        //                1: 813
        //                2: 264
        //                3: 807
        //                4: 160
        //                5: 801
        //                6: 710
        //          default: 160
        //        }
        //   160: iload           15
        //   162: ifeq            169
        //   165: aload_0        
        //   166: invokestatic    android/support/v4/view/ViewCompat.postInvalidateOnAnimation:(Landroid/view/View;)V
        //   169: iconst_1       
        //   170: ireturn        
        //   171: astore          5
        //   173: aload           5
        //   175: athrow         
        //   176: astore          6
        //   178: aload           6
        //   180: athrow         
        //   181: astore          8
        //   183: aload           8
        //   185: athrow         
        //   186: astore          9
        //   188: aload           9
        //   190: athrow         
        //   191: astore          13
        //   193: aload           13
        //   195: athrow         
        //   196: aload_0        
        //   197: getfield        android/support/v4/view/ViewPager.mScroller:Landroid/widget/Scroller;
        //   200: invokevirtual   android/widget/Scroller.abortAnimation:()V
        //   203: aload_0        
        //   204: iconst_0       
        //   205: putfield        android/support/v4/view/ViewPager.mPopulatePending:Z
        //   208: aload_0        
        //   209: invokevirtual   android/support/v4/view/ViewPager.populate:()V
        //   212: aload_1        
        //   213: invokevirtual   android/view/MotionEvent.getX:()F
        //   216: fstore          47
        //   218: aload_0        
        //   219: fload           47
        //   221: putfield        android/support/v4/view/ViewPager.mInitialMotionX:F
        //   224: aload_0        
        //   225: fload           47
        //   227: putfield        android/support/v4/view/ViewPager.mLastMotionX:F
        //   230: aload_1        
        //   231: invokevirtual   android/view/MotionEvent.getY:()F
        //   234: fstore          48
        //   236: aload_0        
        //   237: fload           48
        //   239: putfield        android/support/v4/view/ViewPager.mInitialMotionY:F
        //   242: aload_0        
        //   243: fload           48
        //   245: putfield        android/support/v4/view/ViewPager.mLastMotionY:F
        //   248: aload_0        
        //   249: aload_1        
        //   250: iconst_0       
        //   251: invokestatic    android/support/v4/view/MotionEventCompat.getPointerId:(Landroid/view/MotionEvent;I)I
        //   254: putfield        android/support/v4/view/ViewPager.mActivePointerId:I
        //   257: iconst_0       
        //   258: istore          15
        //   260: iload_2        
        //   261: ifeq            160
        //   264: aload_0        
        //   265: getfield        android/support/v4/view/ViewPager.mIsBeingDragged:Z
        //   268: istore          31
        //   270: iload           31
        //   272: ifne            431
        //   275: aload_1        
        //   276: aload_0        
        //   277: getfield        android/support/v4/view/ViewPager.mActivePointerId:I
        //   280: invokestatic    android/support/v4/view/MotionEventCompat.findPointerIndex:(Landroid/view/MotionEvent;I)I
        //   283: istore          33
        //   285: aload_1        
        //   286: iload           33
        //   288: invokestatic    android/support/v4/view/MotionEventCompat.getX:(Landroid/view/MotionEvent;I)F
        //   291: fstore          34
        //   293: fload           34
        //   295: aload_0        
        //   296: getfield        android/support/v4/view/ViewPager.mLastMotionX:F
        //   299: fsub           
        //   300: invokestatic    java/lang/Math.abs:(F)F
        //   303: fstore          35
        //   305: aload_1        
        //   306: iload           33
        //   308: invokestatic    android/support/v4/view/MotionEventCompat.getY:(Landroid/view/MotionEvent;I)F
        //   311: fstore          36
        //   313: fload           36
        //   315: aload_0        
        //   316: getfield        android/support/v4/view/ViewPager.mLastMotionY:F
        //   319: fsub           
        //   320: invokestatic    java/lang/Math.abs:(F)F
        //   323: fstore          37
        //   325: aload_0        
        //   326: getfield        android/support/v4/view/ViewPager.mTouchSlop:I
        //   329: istore          41
        //   331: fload           35
        //   333: iload           41
        //   335: i2f            
        //   336: fcmpl          
        //   337: ifle            431
        //   340: fload           35
        //   342: fload           37
        //   344: fcmpl          
        //   345: ifle            431
        //   348: aload_0        
        //   349: iconst_1       
        //   350: putfield        android/support/v4/view/ViewPager.mIsBeingDragged:Z
        //   353: aload_0        
        //   354: iconst_1       
        //   355: invokespecial   android/support/v4/view/ViewPager.requestParentDisallowInterceptTouchEvent:(Z)V
        //   358: fload           34
        //   360: aload_0        
        //   361: getfield        android/support/v4/view/ViewPager.mInitialMotionX:F
        //   364: fsub           
        //   365: fconst_0       
        //   366: fcmpl          
        //   367: ifle            759
        //   370: aload_0        
        //   371: getfield        android/support/v4/view/ViewPager.mInitialMotionX:F
        //   374: fstore          45
        //   376: aload_0        
        //   377: getfield        android/support/v4/view/ViewPager.mTouchSlop:I
        //   380: istore          46
        //   382: fload           45
        //   384: iload           46
        //   386: i2f            
        //   387: fadd           
        //   388: fstore          42
        //   390: aload_0        
        //   391: fload           42
        //   393: putfield        android/support/v4/view/ViewPager.mLastMotionX:F
        //   396: aload_0        
        //   397: fload           36
        //   399: putfield        android/support/v4/view/ViewPager.mLastMotionY:F
        //   402: aload_0        
        //   403: iconst_1       
        //   404: invokespecial   android/support/v4/view/ViewPager.setScrollState:(I)V
        //   407: aload_0        
        //   408: iconst_1       
        //   409: invokespecial   android/support/v4/view/ViewPager.setScrollingCacheEnabled:(Z)V
        //   412: aload_0        
        //   413: invokevirtual   android/support/v4/view/ViewPager.getParent:()Landroid/view/ViewParent;
        //   416: astore          43
        //   418: aload           43
        //   420: ifnull          431
        //   423: aload           43
        //   425: iconst_1       
        //   426: invokeinterface android/view/ViewParent.requestDisallowInterceptTouchEvent:(Z)V
        //   431: aload_0        
        //   432: getfield        android/support/v4/view/ViewPager.mIsBeingDragged:Z
        //   435: istore          32
        //   437: iconst_0       
        //   438: istore          15
        //   440: iload           32
        //   442: ifeq            160
        //   445: iconst_0       
        //   446: aload_0        
        //   447: aload_1        
        //   448: aload_1        
        //   449: aload_0        
        //   450: getfield        android/support/v4/view/ViewPager.mActivePointerId:I
        //   453: invokestatic    android/support/v4/view/MotionEventCompat.findPointerIndex:(Landroid/view/MotionEvent;I)I
        //   456: invokestatic    android/support/v4/view/MotionEventCompat.getX:(Landroid/view/MotionEvent;I)F
        //   459: invokespecial   android/support/v4/view/ViewPager.performDrag:(F)Z
        //   462: ior            
        //   463: istore          16
        //   465: iload_2        
        //   466: ifeq            794
        //   469: aload_0        
        //   470: getfield        android/support/v4/view/ViewPager.mIsBeingDragged:Z
        //   473: istore          18
        //   475: iload           18
        //   477: ifeq            794
        //   480: aload_0        
        //   481: getfield        android/support/v4/view/ViewPager.mVelocityTracker:Landroid/view/VelocityTracker;
        //   484: astore          20
        //   486: aload           20
        //   488: sipush          1000
        //   491: aload_0        
        //   492: getfield        android/support/v4/view/ViewPager.mMaximumVelocity:I
        //   495: i2f            
        //   496: invokevirtual   android/view/VelocityTracker.computeCurrentVelocity:(IF)V
        //   499: aload           20
        //   501: aload_0        
        //   502: getfield        android/support/v4/view/ViewPager.mActivePointerId:I
        //   505: invokestatic    android/support/v4/view/VelocityTrackerCompat.getXVelocity:(Landroid/view/VelocityTracker;I)F
        //   508: f2i            
        //   509: istore          21
        //   511: aload_0        
        //   512: iconst_1       
        //   513: putfield        android/support/v4/view/ViewPager.mPopulatePending:Z
        //   516: aload_0        
        //   517: invokespecial   android/support/v4/view/ViewPager.getClientWidth:()I
        //   520: istore          22
        //   522: aload_0        
        //   523: invokevirtual   android/support/v4/view/ViewPager.getScrollX:()I
        //   526: istore          23
        //   528: aload_0        
        //   529: invokespecial   android/support/v4/view/ViewPager.infoForCurrentScrollPosition:()Landroid/support/v4/view/ViewPager$ItemInfo;
        //   532: astore          24
        //   534: aload_0        
        //   535: aload_0        
        //   536: aload           24
        //   538: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   541: iload           23
        //   543: i2f            
        //   544: iload           22
        //   546: i2f            
        //   547: fdiv           
        //   548: aload           24
        //   550: getfield        android/support/v4/view/ViewPager$ItemInfo.offset:F
        //   553: fsub           
        //   554: aload           24
        //   556: getfield        android/support/v4/view/ViewPager$ItemInfo.widthFactor:F
        //   559: fdiv           
        //   560: iload           21
        //   562: aload_1        
        //   563: aload_1        
        //   564: aload_0        
        //   565: getfield        android/support/v4/view/ViewPager.mActivePointerId:I
        //   568: invokestatic    android/support/v4/view/MotionEventCompat.findPointerIndex:(Landroid/view/MotionEvent;I)I
        //   571: invokestatic    android/support/v4/view/MotionEventCompat.getX:(Landroid/view/MotionEvent;I)F
        //   574: aload_0        
        //   575: getfield        android/support/v4/view/ViewPager.mInitialMotionX:F
        //   578: fsub           
        //   579: f2i            
        //   580: invokespecial   android/support/v4/view/ViewPager.determineTargetPage:(IFII)I
        //   583: iconst_1       
        //   584: iconst_1       
        //   585: iload           21
        //   587: invokevirtual   android/support/v4/view/ViewPager.setCurrentItemInternal:(IZZI)V
        //   590: aload_0        
        //   591: iconst_m1      
        //   592: putfield        android/support/v4/view/ViewPager.mActivePointerId:I
        //   595: aload_0        
        //   596: invokespecial   android/support/v4/view/ViewPager.endDrag:()V
        //   599: aload_0        
        //   600: getfield        android/support/v4/view/ViewPager.mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
        //   603: invokevirtual   android/support/v4/widget/EdgeEffectCompat.onRelease:()Z
        //   606: aload_0        
        //   607: getfield        android/support/v4/view/ViewPager.mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
        //   610: invokevirtual   android/support/v4/widget/EdgeEffectCompat.onRelease:()Z
        //   613: ior            
        //   614: istore          16
        //   616: iload_2        
        //   617: ifeq            794
        //   620: aload_0        
        //   621: getfield        android/support/v4/view/ViewPager.mIsBeingDragged:Z
        //   624: istore          26
        //   626: iload           26
        //   628: ifeq            794
        //   631: aload_0        
        //   632: aload_0        
        //   633: getfield        android/support/v4/view/ViewPager.mCurItem:I
        //   636: iconst_1       
        //   637: iconst_0       
        //   638: iconst_0       
        //   639: invokespecial   android/support/v4/view/ViewPager.scrollToItem:(IZIZ)V
        //   642: aload_0        
        //   643: iconst_m1      
        //   644: putfield        android/support/v4/view/ViewPager.mActivePointerId:I
        //   647: aload_0        
        //   648: invokespecial   android/support/v4/view/ViewPager.endDrag:()V
        //   651: aload_0        
        //   652: getfield        android/support/v4/view/ViewPager.mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
        //   655: invokevirtual   android/support/v4/widget/EdgeEffectCompat.onRelease:()Z
        //   658: aload_0        
        //   659: getfield        android/support/v4/view/ViewPager.mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
        //   662: invokevirtual   android/support/v4/widget/EdgeEffectCompat.onRelease:()Z
        //   665: ior            
        //   666: istore          16
        //   668: iload_2        
        //   669: ifeq            794
        //   672: aload_1        
        //   673: invokestatic    android/support/v4/view/MotionEventCompat.getActionIndex:(Landroid/view/MotionEvent;)I
        //   676: istore          27
        //   678: aload_1        
        //   679: iload           27
        //   681: invokestatic    android/support/v4/view/MotionEventCompat.getX:(Landroid/view/MotionEvent;I)F
        //   684: fstore          28
        //   686: aload_0        
        //   687: fload           28
        //   689: putfield        android/support/v4/view/ViewPager.mLastMotionX:F
        //   692: aload_0        
        //   693: aload_1        
        //   694: iload           27
        //   696: invokestatic    android/support/v4/view/MotionEventCompat.getPointerId:(Landroid/view/MotionEvent;I)I
        //   699: putfield        android/support/v4/view/ViewPager.mActivePointerId:I
        //   702: iload_2        
        //   703: ifeq            794
        //   706: iload           16
        //   708: istore          15
        //   710: aload_0        
        //   711: aload_1        
        //   712: invokespecial   android/support/v4/view/ViewPager.onSecondaryPointerUp:(Landroid/view/MotionEvent;)V
        //   715: aload_0        
        //   716: aload_1        
        //   717: aload_1        
        //   718: aload_0        
        //   719: getfield        android/support/v4/view/ViewPager.mActivePointerId:I
        //   722: invokestatic    android/support/v4/view/MotionEventCompat.findPointerIndex:(Landroid/view/MotionEvent;I)I
        //   725: invokestatic    android/support/v4/view/MotionEventCompat.getX:(Landroid/view/MotionEvent;I)F
        //   728: putfield        android/support/v4/view/ViewPager.mLastMotionX:F
        //   731: goto            160
        //   734: astore          29
        //   736: aload           29
        //   738: athrow         
        //   739: astore          30
        //   741: aload           30
        //   743: athrow         
        //   744: astore          38
        //   746: aload           38
        //   748: athrow         
        //   749: astore          39
        //   751: aload           39
        //   753: athrow         
        //   754: astore          40
        //   756: aload           40
        //   758: athrow         
        //   759: aload_0        
        //   760: getfield        android/support/v4/view/ViewPager.mInitialMotionX:F
        //   763: aload_0        
        //   764: getfield        android/support/v4/view/ViewPager.mTouchSlop:I
        //   767: i2f            
        //   768: fsub           
        //   769: fstore          42
        //   771: goto            390
        //   774: astore          44
        //   776: aload           44
        //   778: athrow         
        //   779: astore          17
        //   781: aload           17
        //   783: athrow         
        //   784: astore          25
        //   786: aload           25
        //   788: athrow         
        //   789: astore          19
        //   791: aload           19
        //   793: athrow         
        //   794: iload           16
        //   796: istore          15
        //   798: goto            160
        //   801: iconst_0       
        //   802: istore          16
        //   804: goto            672
        //   807: iconst_0       
        //   808: istore          16
        //   810: goto            620
        //   813: iconst_0       
        //   814: istore          16
        //   816: goto            469
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  4      10     21     24     Landroid/content/res/Resources$NotFoundException;
        //  24     30     171    176    Landroid/content/res/Resources$NotFoundException;
        //  35     41     176    181    Landroid/content/res/Resources$NotFoundException;
        //  49     55     181    186    Landroid/content/res/Resources$NotFoundException;
        //  63     72     186    191    Landroid/content/res/Resources$NotFoundException;
        //  80     94     191    196    Landroid/content/res/Resources$NotFoundException;
        //  165    169    789    794    Landroid/content/res/Resources$NotFoundException;
        //  173    176    176    181    Landroid/content/res/Resources$NotFoundException;
        //  183    186    186    191    Landroid/content/res/Resources$NotFoundException;
        //  196    257    739    744    Landroid/content/res/Resources$NotFoundException;
        //  264    270    739    744    Landroid/content/res/Resources$NotFoundException;
        //  325    331    744    754    Landroid/content/res/Resources$NotFoundException;
        //  348    382    754    759    Landroid/content/res/Resources$NotFoundException;
        //  423    431    774    779    Landroid/content/res/Resources$NotFoundException;
        //  469    475    779    784    Landroid/content/res/Resources$NotFoundException;
        //  620    626    784    789    Landroid/content/res/Resources$NotFoundException;
        //  686    702    734    739    Landroid/content/res/Resources$NotFoundException;
        //  710    731    734    739    Landroid/content/res/Resources$NotFoundException;
        //  746    749    749    754    Landroid/content/res/Resources$NotFoundException;
        //  751    754    754    759    Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 405, Size: 405
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
    
    boolean pageLeft() {
        try {
            if (this.mCurItem > 0) {
                this.setCurrentItem(-1 + this.mCurItem, true);
                return true;
            }
        }
        catch (Resources$NotFoundException ex) {
            throw ex;
        }
        return false;
    }
    
    boolean pageRight() {
        try {
            if (this.mAdapter == null) {
                return false;
            }
            final ViewPager viewPager = this;
            final int n = viewPager.mCurItem;
            final int n2 = -1;
            final ViewPager viewPager2 = this;
            final PagerAdapter pagerAdapter = viewPager2.mAdapter;
            final int n3 = pagerAdapter.getCount();
            final int n4 = n2 + n3;
            if (n < n4) {
                final ViewPager viewPager3 = this;
                final int n5 = 1;
                final ViewPager viewPager4 = this;
                final int n6 = viewPager4.mCurItem;
                final int n7 = n5 + n6;
                final boolean b = true;
                viewPager3.setCurrentItem(n7, b);
                return true;
            }
            return false;
        }
        catch (Resources$NotFoundException ex) {
            throw ex;
        }
        try {
            final ViewPager viewPager = this;
            final int n = viewPager.mCurItem;
            final int n2 = -1;
            final ViewPager viewPager2 = this;
            final PagerAdapter pagerAdapter = viewPager2.mAdapter;
            final int n3 = pagerAdapter.getCount();
            final int n4 = n2 + n3;
            if (n < n4) {
                final ViewPager viewPager3 = this;
                final int n5 = 1;
                final ViewPager viewPager4 = this;
                final int n6 = viewPager4.mCurItem;
                final int n7 = n5 + n6;
                final boolean b = true;
                viewPager3.setCurrentItem(n7, b);
                return true;
            }
        }
        catch (Resources$NotFoundException ex2) {
            throw ex2;
        }
        return false;
    }
    
    void populate() {
        this.populate(this.mCurItem);
    }
    
    void populate(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        android/support/v4/view/ViewPager.mCurItem:I
        //     8: iload_1        
        //     9: if_icmpeq       1677
        //    12: aload_0        
        //    13: getfield        android/support/v4/view/ViewPager.mCurItem:I
        //    16: istore          117
        //    18: iload           117
        //    20: iload_1        
        //    21: if_icmpge       71
        //    24: bipush          66
        //    26: istore          118
        //    28: aload_0        
        //    29: aload_0        
        //    30: getfield        android/support/v4/view/ViewPager.mCurItem:I
        //    33: invokevirtual   android/support/v4/view/ViewPager.infoForPosition:(I)Landroid/support/v4/view/ViewPager$ItemInfo;
        //    36: astore          119
        //    38: aload_0        
        //    39: iload_1        
        //    40: putfield        android/support/v4/view/ViewPager.mCurItem:I
        //    43: iload           118
        //    45: istore          5
        //    47: aload           119
        //    49: astore          6
        //    51: aload_0        
        //    52: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //    55: ifnonnull       83
        //    58: aload_0        
        //    59: invokespecial   android/support/v4/view/ViewPager.sortChildDrawingOrder:()V
        //    62: return         
        //    63: astore_3       
        //    64: aload_3        
        //    65: athrow         
        //    66: astore          4
        //    68: aload           4
        //    70: athrow         
        //    71: bipush          17
        //    73: istore          118
        //    75: goto            28
        //    78: astore          7
        //    80: aload           7
        //    82: athrow         
        //    83: aload_0        
        //    84: getfield        android/support/v4/view/ViewPager.mPopulatePending:Z
        //    87: ifeq            100
        //    90: aload_0        
        //    91: invokespecial   android/support/v4/view/ViewPager.sortChildDrawingOrder:()V
        //    94: return         
        //    95: astore          8
        //    97: aload           8
        //    99: athrow         
        //   100: aload_0        
        //   101: invokevirtual   android/support/v4/view/ViewPager.getWindowToken:()Landroid/os/IBinder;
        //   104: astore          10
        //   106: aload           10
        //   108: ifnull          62
        //   111: aload_0        
        //   112: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //   115: aload_0        
        //   116: invokevirtual   android/support/v4/view/PagerAdapter.startUpdate:(Landroid/view/ViewGroup;)V
        //   119: aload_0        
        //   120: getfield        android/support/v4/view/ViewPager.mOffscreenPageLimit:I
        //   123: istore          11
        //   125: iconst_0       
        //   126: aload_0        
        //   127: getfield        android/support/v4/view/ViewPager.mCurItem:I
        //   130: iload           11
        //   132: isub           
        //   133: invokestatic    java/lang/Math.max:(II)I
        //   136: istore          12
        //   138: aload_0        
        //   139: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //   142: invokevirtual   android/support/v4/view/PagerAdapter.getCount:()I
        //   145: istore          13
        //   147: iload           13
        //   149: iconst_1       
        //   150: isub           
        //   151: iload           11
        //   153: aload_0        
        //   154: getfield        android/support/v4/view/ViewPager.mCurItem:I
        //   157: iadd           
        //   158: invokestatic    java/lang/Math.min:(II)I
        //   161: istore          14
        //   163: iload           13
        //   165: aload_0        
        //   166: getfield        android/support/v4/view/ViewPager.mExpectedAdapterCount:I
        //   169: if_icmpeq       304
        //   172: aload_0        
        //   173: invokevirtual   android/support/v4/view/ViewPager.getResources:()Landroid/content/res/Resources;
        //   176: aload_0        
        //   177: invokevirtual   android/support/v4/view/ViewPager.getId:()I
        //   180: invokevirtual   android/content/res/Resources.getResourceName:(I)Ljava/lang/String;
        //   183: astore          116
        //   185: aload           116
        //   187: astore          115
        //   189: new             Ljava/lang/IllegalStateException;
        //   192: dup            
        //   193: new             Ljava/lang/StringBuilder;
        //   196: dup            
        //   197: invokespecial   java/lang/StringBuilder.<init>:()V
        //   200: getstatic       android/support/v4/view/ViewPager.z:[Ljava/lang/String;
        //   203: iconst_5       
        //   204: aaload         
        //   205: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   208: aload_0        
        //   209: getfield        android/support/v4/view/ViewPager.mExpectedAdapterCount:I
        //   212: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   215: getstatic       android/support/v4/view/ViewPager.z:[Ljava/lang/String;
        //   218: bipush          7
        //   220: aaload         
        //   221: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   224: iload           13
        //   226: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   229: getstatic       android/support/v4/view/ViewPager.z:[Ljava/lang/String;
        //   232: bipush          9
        //   234: aaload         
        //   235: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   238: aload           115
        //   240: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   243: getstatic       android/support/v4/view/ViewPager.z:[Ljava/lang/String;
        //   246: bipush          8
        //   248: aaload         
        //   249: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   252: aload_0        
        //   253: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   256: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   259: getstatic       android/support/v4/view/ViewPager.z:[Ljava/lang/String;
        //   262: bipush          6
        //   264: aaload         
        //   265: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   268: aload_0        
        //   269: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //   272: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   275: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   278: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   281: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   284: athrow         
        //   285: astore          9
        //   287: aload           9
        //   289: athrow         
        //   290: astore          114
        //   292: aload_0        
        //   293: invokevirtual   android/support/v4/view/ViewPager.getId:()I
        //   296: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //   299: astore          115
        //   301: goto            189
        //   304: iconst_0       
        //   305: istore          15
        //   307: iload           15
        //   309: aload_0        
        //   310: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   313: invokevirtual   java/util/ArrayList.size:()I
        //   316: if_icmpge       1671
        //   319: aload_0        
        //   320: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   323: iload           15
        //   325: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   328: checkcast       Landroid/support/v4/view/ViewPager$ItemInfo;
        //   331: astore          16
        //   333: aload           16
        //   335: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   338: aload_0        
        //   339: getfield        android/support/v4/view/ViewPager.mCurItem:I
        //   342: if_icmplt       1333
        //   345: aload           16
        //   347: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   350: istore          112
        //   352: aload_0        
        //   353: getfield        android/support/v4/view/ViewPager.mCurItem:I
        //   356: istore          113
        //   358: iload           112
        //   360: iload           113
        //   362: if_icmpne       1671
        //   365: aload           16
        //   367: ifnonnull       1664
        //   370: iload           13
        //   372: ifle            1664
        //   375: aload_0        
        //   376: aload_0        
        //   377: getfield        android/support/v4/view/ViewPager.mCurItem:I
        //   380: iload           15
        //   382: invokevirtual   android/support/v4/view/ViewPager.addNewItem:(II)Landroid/support/v4/view/ViewPager$ItemInfo;
        //   385: astore          17
        //   387: aload           17
        //   389: ifnull          1042
        //   392: iload           15
        //   394: iconst_1       
        //   395: isub           
        //   396: istore          47
        //   398: iload           47
        //   400: iflt            1344
        //   403: aload_0        
        //   404: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   407: iload           47
        //   409: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   412: checkcast       Landroid/support/v4/view/ViewPager$ItemInfo;
        //   415: astore          48
        //   417: aload_0        
        //   418: invokespecial   android/support/v4/view/ViewPager.getClientWidth:()I
        //   421: istore          49
        //   423: iload           49
        //   425: ifgt            1350
        //   428: fconst_0       
        //   429: fstore          50
        //   431: iconst_m1      
        //   432: aload_0        
        //   433: getfield        android/support/v4/view/ViewPager.mCurItem:I
        //   436: iadd           
        //   437: istore          51
        //   439: aload           48
        //   441: astore          52
        //   443: iload           15
        //   445: istore          53
        //   447: fconst_0       
        //   448: fstore          54
        //   450: iload           51
        //   452: istore          55
        //   454: iload           55
        //   456: iflt            713
        //   459: fload           54
        //   461: fload           50
        //   463: fcmpl          
        //   464: iflt            1649
        //   467: iload           55
        //   469: iload           12
        //   471: if_icmpge       1649
        //   474: aload           52
        //   476: ifnonnull       483
        //   479: iload_2        
        //   480: ifeq            713
        //   483: aload           52
        //   485: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   488: istore          103
        //   490: iload           55
        //   492: iload           103
        //   494: if_icmpne       1630
        //   497: aload           52
        //   499: getfield        android/support/v4/view/ViewPager$ItemInfo.scrolling:Z
        //   502: istore          105
        //   504: iload           105
        //   506: ifne            1630
        //   509: aload_0        
        //   510: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   513: iload           47
        //   515: invokevirtual   java/util/ArrayList.remove:(I)Ljava/lang/Object;
        //   518: pop            
        //   519: aload_0        
        //   520: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //   523: aload_0        
        //   524: iload           55
        //   526: aload           52
        //   528: getfield        android/support/v4/view/ViewPager$ItemInfo.object:Ljava/lang/Object;
        //   531: invokevirtual   android/support/v4/view/PagerAdapter.destroyItem:(Landroid/view/ViewGroup;ILjava/lang/Object;)V
        //   534: iload           47
        //   536: iconst_1       
        //   537: isub           
        //   538: istore          90
        //   540: iload           53
        //   542: iconst_1       
        //   543: isub           
        //   544: istore          80
        //   546: iload           90
        //   548: iflt            1387
        //   551: aload_0        
        //   552: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   555: iload           90
        //   557: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   560: checkcast       Landroid/support/v4/view/ViewPager$ItemInfo;
        //   563: astore          107
        //   565: iload_2        
        //   566: ifeq            1611
        //   569: aload           107
        //   571: astore          109
        //   573: iload           90
        //   575: istore          81
        //   577: aload           109
        //   579: astore          52
        //   581: aload           52
        //   583: ifnull          1596
        //   586: aload           52
        //   588: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   591: istore          95
        //   593: iload           55
        //   595: iload           95
        //   597: if_icmpne       1596
        //   600: fload           54
        //   602: aload           52
        //   604: getfield        android/support/v4/view/ViewPager$ItemInfo.widthFactor:F
        //   607: fadd           
        //   608: fstore          96
        //   610: iload           81
        //   612: iconst_1       
        //   613: isub           
        //   614: istore          84
        //   616: iload           84
        //   618: iflt            1403
        //   621: aload_0        
        //   622: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   625: iload           84
        //   627: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   630: checkcast       Landroid/support/v4/view/ViewPager$ItemInfo;
        //   633: astore          97
        //   635: iload_2        
        //   636: ifeq            1573
        //   639: fload           96
        //   641: fstore          83
        //   643: fload           83
        //   645: aload_0        
        //   646: iload           55
        //   648: iload           84
        //   650: iconst_1       
        //   651: iadd           
        //   652: invokevirtual   android/support/v4/view/ViewPager.addNewItem:(II)Landroid/support/v4/view/ViewPager$ItemInfo;
        //   655: getfield        android/support/v4/view/ViewPager$ItemInfo.widthFactor:F
        //   658: fadd           
        //   659: fstore          85
        //   661: iload           80
        //   663: iconst_1       
        //   664: iadd           
        //   665: istore          86
        //   667: iload           84
        //   669: iflt            1414
        //   672: aload_0        
        //   673: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   676: iload           84
        //   678: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   681: checkcast       Landroid/support/v4/view/ViewPager$ItemInfo;
        //   684: astore          87
        //   686: aload           87
        //   688: astore          88
        //   690: iload           86
        //   692: istore          53
        //   694: fload           85
        //   696: fstore          89
        //   698: iload           84
        //   700: istore          90
        //   702: aload           88
        //   704: astore          91
        //   706: iinc            55, -1
        //   709: iload_2        
        //   710: ifeq            1554
        //   713: iload           53
        //   715: istore          56
        //   717: aload           17
        //   719: getfield        android/support/v4/view/ViewPager$ItemInfo.widthFactor:F
        //   722: fstore          57
        //   724: iload           56
        //   726: iconst_1       
        //   727: iadd           
        //   728: istore          58
        //   730: fload           57
        //   732: fconst_2       
        //   733: fcmpg          
        //   734: ifge            1032
        //   737: iload           58
        //   739: aload_0        
        //   740: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   743: invokevirtual   java/util/ArrayList.size:()I
        //   746: if_icmpge       1425
        //   749: aload_0        
        //   750: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   753: iload           58
        //   755: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   758: checkcast       Landroid/support/v4/view/ViewPager$ItemInfo;
        //   761: astore          60
        //   763: iload           49
        //   765: ifgt            1431
        //   768: fconst_0       
        //   769: fstore          61
        //   771: iconst_1       
        //   772: aload_0        
        //   773: getfield        android/support/v4/view/ViewPager.mCurItem:I
        //   776: iadd           
        //   777: istore          62
        //   779: fload           57
        //   781: fstore          63
        //   783: iload           58
        //   785: istore          64
        //   787: iload           62
        //   789: istore          65
        //   791: iload           65
        //   793: iload           13
        //   795: if_icmpge       1032
        //   798: fload           63
        //   800: fload           61
        //   802: fcmpl          
        //   803: iflt            903
        //   806: iload           65
        //   808: iload           14
        //   810: if_icmple       903
        //   813: aload           60
        //   815: ifnonnull       822
        //   818: iload_2        
        //   819: ifeq            1032
        //   822: aload           60
        //   824: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   827: istore          76
        //   829: iload           65
        //   831: iload           76
        //   833: if_icmpne       1025
        //   836: aload           60
        //   838: getfield        android/support/v4/view/ViewPager$ItemInfo.scrolling:Z
        //   841: istore          77
        //   843: iload           77
        //   845: ifne            1025
        //   848: aload_0        
        //   849: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   852: iload           64
        //   854: invokevirtual   java/util/ArrayList.remove:(I)Ljava/lang/Object;
        //   857: pop            
        //   858: aload_0        
        //   859: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //   862: aload_0        
        //   863: iload           65
        //   865: aload           60
        //   867: getfield        android/support/v4/view/ViewPager$ItemInfo.object:Ljava/lang/Object;
        //   870: invokevirtual   android/support/v4/view/PagerAdapter.destroyItem:(Landroid/view/ViewGroup;ILjava/lang/Object;)V
        //   873: iload           64
        //   875: aload_0        
        //   876: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   879: invokevirtual   java/util/ArrayList.size:()I
        //   882: if_icmpge       1462
        //   885: aload_0        
        //   886: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   889: iload           64
        //   891: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   894: checkcast       Landroid/support/v4/view/ViewPager$ItemInfo;
        //   897: astore          60
        //   899: iload_2        
        //   900: ifeq            1025
        //   903: aload           60
        //   905: ifnull          965
        //   908: aload           60
        //   910: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //   913: istore          71
        //   915: iload           65
        //   917: iload           71
        //   919: if_icmpne       965
        //   922: fload           63
        //   924: aload           60
        //   926: getfield        android/support/v4/view/ViewPager$ItemInfo.widthFactor:F
        //   929: fadd           
        //   930: fstore          63
        //   932: iinc            64, 1
        //   935: iload           64
        //   937: aload_0        
        //   938: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   941: invokevirtual   java/util/ArrayList.size:()I
        //   944: if_icmpge       1478
        //   947: aload_0        
        //   948: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   951: iload           64
        //   953: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   956: checkcast       Landroid/support/v4/view/ViewPager$ItemInfo;
        //   959: astore          60
        //   961: iload_2        
        //   962: ifeq            1025
        //   965: fload           63
        //   967: fstore          66
        //   969: iload           64
        //   971: istore          67
        //   973: aload_0        
        //   974: iload           65
        //   976: iload           67
        //   978: invokevirtual   android/support/v4/view/ViewPager.addNewItem:(II)Landroid/support/v4/view/ViewPager$ItemInfo;
        //   981: astore          68
        //   983: iload           67
        //   985: iconst_1       
        //   986: iadd           
        //   987: istore          64
        //   989: fload           66
        //   991: aload           68
        //   993: getfield        android/support/v4/view/ViewPager$ItemInfo.widthFactor:F
        //   996: fadd           
        //   997: fstore          63
        //   999: iload           64
        //  1001: aload_0        
        //  1002: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //  1005: invokevirtual   java/util/ArrayList.size:()I
        //  1008: if_icmpge       1489
        //  1011: aload_0        
        //  1012: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //  1015: iload           64
        //  1017: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1020: checkcast       Landroid/support/v4/view/ViewPager$ItemInfo;
        //  1023: astore          60
        //  1025: iinc            65, 1
        //  1028: iload_2        
        //  1029: ifeq            791
        //  1032: aload_0        
        //  1033: aload           17
        //  1035: iload           56
        //  1037: aload           6
        //  1039: invokespecial   android/support/v4/view/ViewPager.calculatePageOffsets:(Landroid/support/v4/view/ViewPager$ItemInfo;ILandroid/support/v4/view/ViewPager$ItemInfo;)V
        //  1042: aload_0        
        //  1043: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //  1046: astore          19
        //  1048: aload_0        
        //  1049: getfield        android/support/v4/view/ViewPager.mCurItem:I
        //  1052: istore          20
        //  1054: aload           17
        //  1056: ifnull          1500
        //  1059: aload           17
        //  1061: getfield        android/support/v4/view/ViewPager$ItemInfo.object:Ljava/lang/Object;
        //  1064: astore          21
        //  1066: aload           19
        //  1068: aload_0        
        //  1069: iload           20
        //  1071: aload           21
        //  1073: invokevirtual   android/support/v4/view/PagerAdapter.setPrimaryItem:(Landroid/view/ViewGroup;ILjava/lang/Object;)V
        //  1076: aload_0        
        //  1077: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //  1080: aload_0        
        //  1081: invokevirtual   android/support/v4/view/PagerAdapter.finishUpdate:(Landroid/view/ViewGroup;)V
        //  1084: aload_0        
        //  1085: invokevirtual   android/support/v4/view/ViewPager.getChildCount:()I
        //  1088: istore          22
        //  1090: iconst_0       
        //  1091: istore          23
        //  1093: iload           23
        //  1095: iload           22
        //  1097: if_icmpge       1190
        //  1100: aload_0        
        //  1101: iload           23
        //  1103: invokevirtual   android/support/v4/view/ViewPager.getChildAt:(I)Landroid/view/View;
        //  1106: astore          40
        //  1108: aload           40
        //  1110: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //  1113: checkcast       Landroid/support/v4/view/ViewPager$LayoutParams;
        //  1116: astore          41
        //  1118: aload           41
        //  1120: iload           23
        //  1122: putfield        android/support/v4/view/ViewPager$LayoutParams.childIndex:I
        //  1125: aload           41
        //  1127: getfield        android/support/v4/view/ViewPager$LayoutParams.isDecor:Z
        //  1130: ifne            1180
        //  1133: aload           41
        //  1135: getfield        android/support/v4/view/ViewPager$LayoutParams.widthFactor:F
        //  1138: fstore          44
        //  1140: fload           44
        //  1142: fconst_0       
        //  1143: fcmpl          
        //  1144: ifne            1180
        //  1147: aload_0        
        //  1148: aload           40
        //  1150: invokevirtual   android/support/v4/view/ViewPager.infoForChild:(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
        //  1153: astore          45
        //  1155: aload           45
        //  1157: ifnull          1180
        //  1160: aload           41
        //  1162: aload           45
        //  1164: getfield        android/support/v4/view/ViewPager$ItemInfo.widthFactor:F
        //  1167: putfield        android/support/v4/view/ViewPager$LayoutParams.widthFactor:F
        //  1170: aload           41
        //  1172: aload           45
        //  1174: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //  1177: putfield        android/support/v4/view/ViewPager$LayoutParams.position:I
        //  1180: iload           23
        //  1182: iconst_1       
        //  1183: iadd           
        //  1184: istore          43
        //  1186: iload_2        
        //  1187: ifeq            1547
        //  1190: aload_0        
        //  1191: invokespecial   android/support/v4/view/ViewPager.sortChildDrawingOrder:()V
        //  1194: aload_0        
        //  1195: invokevirtual   android/support/v4/view/ViewPager.hasFocus:()Z
        //  1198: ifeq            62
        //  1201: aload_0        
        //  1202: invokevirtual   android/support/v4/view/ViewPager.findFocus:()Landroid/view/View;
        //  1205: astore          24
        //  1207: aload           24
        //  1209: ifnull          1521
        //  1212: aload_0        
        //  1213: aload           24
        //  1215: invokevirtual   android/support/v4/view/ViewPager.infoForAnyChild:(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
        //  1218: astore          39
        //  1220: aload           39
        //  1222: astore          25
        //  1224: aload           25
        //  1226: ifnull          1249
        //  1229: aload           25
        //  1231: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //  1234: istore          36
        //  1236: aload_0        
        //  1237: getfield        android/support/v4/view/ViewPager.mCurItem:I
        //  1240: istore          37
        //  1242: iload           36
        //  1244: iload           37
        //  1246: if_icmpeq       62
        //  1249: iconst_0       
        //  1250: istore          26
        //  1252: iload           26
        //  1254: aload_0        
        //  1255: invokevirtual   android/support/v4/view/ViewPager.getChildCount:()I
        //  1258: if_icmpge       62
        //  1261: aload_0        
        //  1262: iload           26
        //  1264: invokevirtual   android/support/v4/view/ViewPager.getChildAt:(I)Landroid/view/View;
        //  1267: astore          27
        //  1269: aload_0        
        //  1270: aload           27
        //  1272: invokevirtual   android/support/v4/view/ViewPager.infoForChild:(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
        //  1275: astore          28
        //  1277: aload           28
        //  1279: ifnull          1320
        //  1282: aload           28
        //  1284: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //  1287: istore          32
        //  1289: aload_0        
        //  1290: getfield        android/support/v4/view/ViewPager.mCurItem:I
        //  1293: istore          33
        //  1295: iload           32
        //  1297: iload           33
        //  1299: if_icmpne       1320
        //  1302: aload           27
        //  1304: iload           5
        //  1306: invokevirtual   android/view/View.requestFocus:(I)Z
        //  1309: istore          34
        //  1311: iload           34
        //  1313: ifeq            1320
        //  1316: iload_2        
        //  1317: ifeq            62
        //  1320: iinc            26, 1
        //  1323: iload_2        
        //  1324: ifeq            1252
        //  1327: return         
        //  1328: astore          111
        //  1330: aload           111
        //  1332: athrow         
        //  1333: iinc            15, 1
        //  1336: goto            307
        //  1339: astore          110
        //  1341: aload           110
        //  1343: athrow         
        //  1344: aconst_null    
        //  1345: astore          48
        //  1347: goto            417
        //  1350: fconst_2       
        //  1351: aload           17
        //  1353: getfield        android/support/v4/view/ViewPager$ItemInfo.widthFactor:F
        //  1356: fsub           
        //  1357: aload_0        
        //  1358: invokevirtual   android/support/v4/view/ViewPager.getPaddingLeft:()I
        //  1361: i2f            
        //  1362: iload           49
        //  1364: i2f            
        //  1365: fdiv           
        //  1366: fadd           
        //  1367: fstore          50
        //  1369: goto            431
        //  1372: astore          100
        //  1374: aload           100
        //  1376: athrow         
        //  1377: astore          101
        //  1379: aload           101
        //  1381: athrow         
        //  1382: astore          102
        //  1384: aload           102
        //  1386: athrow         
        //  1387: aconst_null    
        //  1388: astore          107
        //  1390: goto            565
        //  1393: astore          94
        //  1395: aload           94
        //  1397: athrow         
        //  1398: astore          99
        //  1400: aload           99
        //  1402: athrow         
        //  1403: aconst_null    
        //  1404: astore          97
        //  1406: goto            635
        //  1409: astore          93
        //  1411: aload           93
        //  1413: athrow         
        //  1414: aconst_null    
        //  1415: astore          87
        //  1417: goto            686
        //  1420: astore          59
        //  1422: aload           59
        //  1424: athrow         
        //  1425: aconst_null    
        //  1426: astore          60
        //  1428: goto            763
        //  1431: fconst_2       
        //  1432: aload_0        
        //  1433: invokevirtual   android/support/v4/view/ViewPager.getPaddingRight:()I
        //  1436: i2f            
        //  1437: iload           49
        //  1439: i2f            
        //  1440: fdiv           
        //  1441: fadd           
        //  1442: fstore          61
        //  1444: goto            771
        //  1447: astore          73
        //  1449: aload           73
        //  1451: athrow         
        //  1452: astore          74
        //  1454: aload           74
        //  1456: athrow         
        //  1457: astore          75
        //  1459: aload           75
        //  1461: athrow         
        //  1462: aconst_null    
        //  1463: astore          60
        //  1465: goto            899
        //  1468: astore          70
        //  1470: aload           70
        //  1472: athrow         
        //  1473: astore          72
        //  1475: aload           72
        //  1477: athrow         
        //  1478: aconst_null    
        //  1479: astore          60
        //  1481: goto            961
        //  1484: astore          69
        //  1486: aload           69
        //  1488: athrow         
        //  1489: aconst_null    
        //  1490: astore          60
        //  1492: goto            1025
        //  1495: astore          18
        //  1497: aload           18
        //  1499: athrow         
        //  1500: aconst_null    
        //  1501: astore          21
        //  1503: goto            1066
        //  1506: astore          42
        //  1508: aload           42
        //  1510: athrow         
        //  1511: astore          46
        //  1513: aload           46
        //  1515: athrow         
        //  1516: astore          38
        //  1518: aload           38
        //  1520: athrow         
        //  1521: aconst_null    
        //  1522: astore          25
        //  1524: goto            1224
        //  1527: astore          35
        //  1529: aload           35
        //  1531: athrow         
        //  1532: astore          29
        //  1534: aload           29
        //  1536: athrow         
        //  1537: astore          30
        //  1539: aload           30
        //  1541: athrow         
        //  1542: astore          31
        //  1544: aload           31
        //  1546: athrow         
        //  1547: iload           43
        //  1549: istore          23
        //  1551: goto            1093
        //  1554: aload           91
        //  1556: astore          92
        //  1558: fload           89
        //  1560: fstore          54
        //  1562: iload           90
        //  1564: istore          47
        //  1566: aload           92
        //  1568: astore          52
        //  1570: goto            454
        //  1573: aload           97
        //  1575: astore          98
        //  1577: iload           80
        //  1579: istore          53
        //  1581: fload           96
        //  1583: fstore          89
        //  1585: iload           84
        //  1587: istore          90
        //  1589: aload           98
        //  1591: astore          91
        //  1593: goto            706
        //  1596: iload           81
        //  1598: istore          82
        //  1600: fload           54
        //  1602: fstore          83
        //  1604: iload           82
        //  1606: istore          84
        //  1608: goto            643
        //  1611: aload           107
        //  1613: astore          108
        //  1615: iload           80
        //  1617: istore          53
        //  1619: fload           54
        //  1621: fstore          89
        //  1623: aload           108
        //  1625: astore          91
        //  1627: goto            706
        //  1630: aload           52
        //  1632: astore          104
        //  1634: iload           47
        //  1636: istore          90
        //  1638: fload           54
        //  1640: fstore          89
        //  1642: aload           104
        //  1644: astore          91
        //  1646: goto            706
        //  1649: iload           47
        //  1651: istore          79
        //  1653: iload           53
        //  1655: istore          80
        //  1657: iload           79
        //  1659: istore          81
        //  1661: goto            581
        //  1664: aload           16
        //  1666: astore          17
        //  1668: goto            387
        //  1671: aconst_null    
        //  1672: astore          16
        //  1674: goto            365
        //  1677: iconst_2       
        //  1678: istore          5
        //  1680: aconst_null    
        //  1681: astore          6
        //  1683: goto            51
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  4      18     63     71     Landroid/content/res/Resources$NotFoundException;
        //  51     62     78     83     Landroid/content/res/Resources$NotFoundException;
        //  64     66     66     71     Landroid/content/res/Resources$NotFoundException;
        //  83     94     95     100    Landroid/content/res/Resources$NotFoundException;
        //  100    106    285    290    Landroid/content/res/Resources$NotFoundException;
        //  172    185    290    304    Landroid/content/res/Resources$NotFoundException;
        //  333    358    1328   1333   Landroid/content/res/Resources$NotFoundException;
        //  403    417    1339   1344   Landroid/content/res/Resources$NotFoundException;
        //  483    490    1372   1377   Landroid/content/res/Resources$NotFoundException;
        //  497    504    1377   1382   Landroid/content/res/Resources$NotFoundException;
        //  509    534    1382   1387   Landroid/content/res/Resources$NotFoundException;
        //  551    565    1382   1387   Landroid/content/res/Resources$NotFoundException;
        //  586    593    1393   1398   Landroid/content/res/Resources$NotFoundException;
        //  621    635    1398   1403   Landroid/content/res/Resources$NotFoundException;
        //  672    686    1409   1414   Landroid/content/res/Resources$NotFoundException;
        //  737    763    1420   1425   Landroid/content/res/Resources$NotFoundException;
        //  822    829    1447   1452   Landroid/content/res/Resources$NotFoundException;
        //  836    843    1452   1457   Landroid/content/res/Resources$NotFoundException;
        //  848    899    1457   1462   Landroid/content/res/Resources$NotFoundException;
        //  908    915    1468   1473   Landroid/content/res/Resources$NotFoundException;
        //  935    961    1473   1478   Landroid/content/res/Resources$NotFoundException;
        //  999    1025   1484   1489   Landroid/content/res/Resources$NotFoundException;
        //  1042   1054   1495   1500   Landroid/content/res/Resources$NotFoundException;
        //  1059   1066   1495   1500   Landroid/content/res/Resources$NotFoundException;
        //  1118   1140   1506   1511   Landroid/content/res/Resources$NotFoundException;
        //  1160   1180   1511   1516   Landroid/content/res/Resources$NotFoundException;
        //  1212   1220   1516   1521   Landroid/content/res/Resources$NotFoundException;
        //  1229   1242   1527   1532   Landroid/content/res/Resources$NotFoundException;
        //  1282   1295   1532   1537   Landroid/content/res/Resources$NotFoundException;
        //  1302   1311   1537   1547   Landroid/content/res/Resources$NotFoundException;
        //  1374   1377   1377   1382   Landroid/content/res/Resources$NotFoundException;
        //  1379   1382   1382   1387   Landroid/content/res/Resources$NotFoundException;
        //  1449   1452   1452   1457   Landroid/content/res/Resources$NotFoundException;
        //  1454   1457   1457   1462   Landroid/content/res/Resources$NotFoundException;
        //  1534   1537   1537   1547   Landroid/content/res/Resources$NotFoundException;
        //  1539   1542   1542   1547   Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 819, Size: 819
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
    
    public void removeView(final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v4/view/ViewPager.mInLayout:Z
        //     4: istore          4
        //     6: iload           4
        //     8: ifeq            22
        //    11: aload_0        
        //    12: aload_1        
        //    13: invokevirtual   android/support/v4/view/ViewPager.removeViewInLayout:(Landroid/view/View;)V
        //    16: getstatic       android/support/v4/view/ViewPager.a:I
        //    19: ifeq            34
        //    22: aload_0        
        //    23: aload_1        
        //    24: invokespecial   android/view/ViewGroup.removeView:(Landroid/view/View;)V
        //    27: return         
        //    28: astore_2       
        //    29: aload_2        
        //    30: athrow         
        //    31: astore_3       
        //    32: aload_3        
        //    33: athrow         
        //    34: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  0      6      28     31     Landroid/content/res/Resources$NotFoundException;
        //  11     22     31     34     Landroid/content/res/Resources$NotFoundException;
        //  22     27     31     34     Landroid/content/res/Resources$NotFoundException;
        //  29     31     31     34     Landroid/content/res/Resources$NotFoundException;
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
    
    public void setAdapter(final PagerAdapter p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/view/ViewPager.a:I
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //     8: ifnull          117
        //    11: aload_0        
        //    12: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //    15: aload_0        
        //    16: getfield        android/support/v4/view/ViewPager.mObserver:Landroid/support/v4/view/ViewPager$PagerObserver;
        //    19: invokevirtual   android/support/v4/view/PagerAdapter.unregisterDataSetObserver:(Landroid/database/DataSetObserver;)V
        //    22: aload_0        
        //    23: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //    26: aload_0        
        //    27: invokevirtual   android/support/v4/view/PagerAdapter.startUpdate:(Landroid/view/ViewGroup;)V
        //    30: iconst_0       
        //    31: istore          16
        //    33: iload           16
        //    35: aload_0        
        //    36: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //    39: invokevirtual   java/util/ArrayList.size:()I
        //    42: if_icmpge       87
        //    45: aload_0        
        //    46: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //    49: iload           16
        //    51: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    54: checkcast       Landroid/support/v4/view/ViewPager$ItemInfo;
        //    57: astore          17
        //    59: aload_0        
        //    60: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //    63: aload_0        
        //    64: aload           17
        //    66: getfield        android/support/v4/view/ViewPager$ItemInfo.position:I
        //    69: aload           17
        //    71: getfield        android/support/v4/view/ViewPager$ItemInfo.object:Ljava/lang/Object;
        //    74: invokevirtual   android/support/v4/view/PagerAdapter.destroyItem:(Landroid/view/ViewGroup;ILjava/lang/Object;)V
        //    77: iload           16
        //    79: iconst_1       
        //    80: iadd           
        //    81: istore          18
        //    83: iload_2        
        //    84: ifeq            341
        //    87: aload_0        
        //    88: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //    91: aload_0        
        //    92: invokevirtual   android/support/v4/view/PagerAdapter.finishUpdate:(Landroid/view/ViewGroup;)V
        //    95: aload_0        
        //    96: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //    99: invokevirtual   java/util/ArrayList.clear:()V
        //   102: aload_0        
        //   103: invokespecial   android/support/v4/view/ViewPager.removeNonDecorViews:()V
        //   106: aload_0        
        //   107: iconst_0       
        //   108: putfield        android/support/v4/view/ViewPager.mCurItem:I
        //   111: aload_0        
        //   112: iconst_0       
        //   113: iconst_0       
        //   114: invokevirtual   android/support/v4/view/ViewPager.scrollTo:(II)V
        //   117: aload_0        
        //   118: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //   121: astore_3       
        //   122: aload_0        
        //   123: aload_1        
        //   124: putfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //   127: aload_0        
        //   128: iconst_0       
        //   129: putfield        android/support/v4/view/ViewPager.mExpectedAdapterCount:I
        //   132: aload_0        
        //   133: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //   136: astore          6
        //   138: aload           6
        //   140: ifnull          273
        //   143: aload_0        
        //   144: getfield        android/support/v4/view/ViewPager.mObserver:Landroid/support/v4/view/ViewPager$PagerObserver;
        //   147: ifnonnull       163
        //   150: aload_0        
        //   151: new             Landroid/support/v4/view/ViewPager$PagerObserver;
        //   154: dup            
        //   155: aload_0        
        //   156: aconst_null    
        //   157: invokespecial   android/support/v4/view/ViewPager$PagerObserver.<init>:(Landroid/support/v4/view/ViewPager;Landroid/support/v4/view/ViewPager$1;)V
        //   160: putfield        android/support/v4/view/ViewPager.mObserver:Landroid/support/v4/view/ViewPager$PagerObserver;
        //   163: aload_0        
        //   164: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //   167: aload_0        
        //   168: getfield        android/support/v4/view/ViewPager.mObserver:Landroid/support/v4/view/ViewPager$PagerObserver;
        //   171: invokevirtual   android/support/v4/view/PagerAdapter.registerDataSetObserver:(Landroid/database/DataSetObserver;)V
        //   174: aload_0        
        //   175: iconst_0       
        //   176: putfield        android/support/v4/view/ViewPager.mPopulatePending:Z
        //   179: aload_0        
        //   180: getfield        android/support/v4/view/ViewPager.mFirstLayout:Z
        //   183: istore          10
        //   185: aload_0        
        //   186: iconst_1       
        //   187: putfield        android/support/v4/view/ViewPager.mFirstLayout:Z
        //   190: aload_0        
        //   191: aload_0        
        //   192: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //   195: invokevirtual   android/support/v4/view/PagerAdapter.getCount:()I
        //   198: putfield        android/support/v4/view/ViewPager.mExpectedAdapterCount:I
        //   201: aload_0        
        //   202: getfield        android/support/v4/view/ViewPager.mRestoredCurItem:I
        //   205: istore          15
        //   207: iload           15
        //   209: iflt            256
        //   212: aload_0        
        //   213: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //   216: aload_0        
        //   217: getfield        android/support/v4/view/ViewPager.mRestoredAdapterState:Landroid/os/Parcelable;
        //   220: aload_0        
        //   221: getfield        android/support/v4/view/ViewPager.mRestoredClassLoader:Ljava/lang/ClassLoader;
        //   224: invokevirtual   android/support/v4/view/PagerAdapter.restoreState:(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
        //   227: aload_0        
        //   228: aload_0        
        //   229: getfield        android/support/v4/view/ViewPager.mRestoredCurItem:I
        //   232: iconst_0       
        //   233: iconst_1       
        //   234: invokevirtual   android/support/v4/view/ViewPager.setCurrentItemInternal:(IZZ)V
        //   237: aload_0        
        //   238: iconst_m1      
        //   239: putfield        android/support/v4/view/ViewPager.mRestoredCurItem:I
        //   242: aload_0        
        //   243: aconst_null    
        //   244: putfield        android/support/v4/view/ViewPager.mRestoredAdapterState:Landroid/os/Parcelable;
        //   247: aload_0        
        //   248: aconst_null    
        //   249: putfield        android/support/v4/view/ViewPager.mRestoredClassLoader:Ljava/lang/ClassLoader;
        //   252: iload_2        
        //   253: ifeq            273
        //   256: iload           10
        //   258: ifne            269
        //   261: aload_0        
        //   262: invokevirtual   android/support/v4/view/ViewPager.populate:()V
        //   265: iload_2        
        //   266: ifeq            273
        //   269: aload_0        
        //   270: invokevirtual   android/support/v4/view/ViewPager.requestLayout:()V
        //   273: aload_0        
        //   274: getfield        android/support/v4/view/ViewPager.mAdapterChangeListener:Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;
        //   277: astore          9
        //   279: aload           9
        //   281: ifnull          300
        //   284: aload_3        
        //   285: aload_1        
        //   286: if_acmpeq       300
        //   289: aload_0        
        //   290: getfield        android/support/v4/view/ViewPager.mAdapterChangeListener:Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;
        //   293: aload_3        
        //   294: aload_1        
        //   295: invokeinterface android/support/v4/view/ViewPager$OnAdapterChangeListener.onAdapterChanged:(Landroid/support/v4/view/PagerAdapter;Landroid/support/v4/view/PagerAdapter;)V
        //   300: return         
        //   301: astore          4
        //   303: aload           4
        //   305: athrow         
        //   306: astore          5
        //   308: aload           5
        //   310: athrow         
        //   311: astore          11
        //   313: aload           11
        //   315: athrow         
        //   316: astore          12
        //   318: aload           12
        //   320: athrow         
        //   321: astore          13
        //   323: aload           13
        //   325: athrow         
        //   326: astore          14
        //   328: aload           14
        //   330: athrow         
        //   331: astore          7
        //   333: aload           7
        //   335: athrow         
        //   336: astore          8
        //   338: aload           8
        //   340: athrow         
        //   341: iload           18
        //   343: istore          16
        //   345: goto            33
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  122    138    301    306    Landroid/content/res/Resources$NotFoundException;
        //  143    163    306    311    Landroid/content/res/Resources$NotFoundException;
        //  185    207    311    316    Landroid/content/res/Resources$NotFoundException;
        //  212    252    316    326    Landroid/content/res/Resources$NotFoundException;
        //  261    265    326    331    Landroid/content/res/Resources$NotFoundException;
        //  269    273    326    331    Landroid/content/res/Resources$NotFoundException;
        //  273    279    331    336    Landroid/content/res/Resources$NotFoundException;
        //  289    300    336    341    Landroid/content/res/Resources$NotFoundException;
        //  303    306    306    311    Landroid/content/res/Resources$NotFoundException;
        //  313    316    316    326    Landroid/content/res/Resources$NotFoundException;
        //  318    321    321    326    Landroid/content/res/Resources$NotFoundException;
        //  323    326    326    331    Landroid/content/res/Resources$NotFoundException;
        //  333    336    336    341    Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 178, Size: 178
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
    
    void setChildrenDrawingOrderEnabledCompat(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: iload           4
        //     7: bipush          7
        //     9: if_icmplt       86
        //    12: aload_0        
        //    13: getfield        android/support/v4/view/ViewPager.mSetChildrenDrawingOrderEnabled:Ljava/lang/reflect/Method;
        //    16: astore          5
        //    18: aload           5
        //    20: ifnonnull       57
        //    23: getstatic       android/support/v4/view/ViewPager.z:[Ljava/lang/String;
        //    26: bipush          13
        //    28: aaload         
        //    29: astore          13
        //    31: iconst_1       
        //    32: anewarray       Ljava/lang/Class;
        //    35: astore          14
        //    37: aload           14
        //    39: iconst_0       
        //    40: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //    43: aastore        
        //    44: aload_0        
        //    45: ldc             Landroid/view/ViewGroup;.class
        //    47: aload           13
        //    49: aload           14
        //    51: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    54: putfield        android/support/v4/view/ViewPager.mSetChildrenDrawingOrderEnabled:Ljava/lang/reflect/Method;
        //    57: aload_0        
        //    58: getfield        android/support/v4/view/ViewPager.mSetChildrenDrawingOrderEnabled:Ljava/lang/reflect/Method;
        //    61: astore          8
        //    63: iconst_1       
        //    64: anewarray       Ljava/lang/Object;
        //    67: astore          9
        //    69: aload           9
        //    71: iconst_0       
        //    72: iload_1        
        //    73: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    76: aastore        
        //    77: aload           8
        //    79: aload_0        
        //    80: aload           9
        //    82: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    85: pop            
        //    86: return         
        //    87: astore_2       
        //    88: aload_2        
        //    89: athrow         
        //    90: astore_3       
        //    91: aload_3        
        //    92: athrow         
        //    93: astore          11
        //    95: getstatic       android/support/v4/view/ViewPager.z:[Ljava/lang/String;
        //    98: bipush          11
        //   100: aaload         
        //   101: getstatic       android/support/v4/view/ViewPager.z:[Ljava/lang/String;
        //   104: bipush          14
        //   106: aaload         
        //   107: aload           11
        //   109: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   112: pop            
        //   113: goto            57
        //   116: astore          6
        //   118: getstatic       android/support/v4/view/ViewPager.z:[Ljava/lang/String;
        //   121: bipush          15
        //   123: aaload         
        //   124: getstatic       android/support/v4/view/ViewPager.z:[Ljava/lang/String;
        //   127: bipush          12
        //   129: aaload         
        //   130: aload           6
        //   132: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   135: pop            
        //   136: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  0      5      87     90     Ljava/lang/NoSuchMethodException;
        //  12     18     87     90     Ljava/lang/NoSuchMethodException;
        //  12     18     90     93     Landroid/content/res/Resources$NotFoundException;
        //  23     57     93     116    Ljava/lang/NoSuchMethodException;
        //  23     57     90     93     Landroid/content/res/Resources$NotFoundException;
        //  57     86     116    137    Ljava/lang/Exception;
        //  88     90     90     93     Landroid/content/res/Resources$NotFoundException;
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
    
    public void setCurrentItem(final int n) {
        while (true) {
            while (true) {
                try {
                    this.mPopulatePending = false;
                    if (!this.mFirstLayout) {
                        final boolean b = true;
                        this.setCurrentItemInternal(n, b, false);
                        return;
                    }
                }
                catch (Resources$NotFoundException ex) {
                    throw ex;
                }
                final boolean b = false;
                continue;
            }
        }
    }
    
    public void setCurrentItem(final int n, final boolean b) {
        this.setCurrentItemInternal(n, b, this.mPopulatePending = false);
    }
    
    void setCurrentItemInternal(final int n, final boolean b, final boolean b2) {
        this.setCurrentItemInternal(n, b, b2, 0);
    }
    
    void setCurrentItemInternal(final int p0, final boolean p1, final boolean p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          5
        //     5: aload_0        
        //     6: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //     9: astore          8
        //    11: aload           8
        //    13: ifnull          26
        //    16: aload_0        
        //    17: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //    20: invokevirtual   android/support/v4/view/PagerAdapter.getCount:()I
        //    23: ifgt            42
        //    26: aload_0        
        //    27: iconst_0       
        //    28: invokespecial   android/support/v4/view/ViewPager.setScrollingCacheEnabled:(Z)V
        //    31: return         
        //    32: astore          6
        //    34: aload           6
        //    36: athrow         
        //    37: astore          7
        //    39: aload           7
        //    41: athrow         
        //    42: iload_3        
        //    43: ifne            84
        //    46: aload_0        
        //    47: getfield        android/support/v4/view/ViewPager.mCurItem:I
        //    50: istore          29
        //    52: iload           29
        //    54: iload_1        
        //    55: if_icmpne       84
        //    58: aload_0        
        //    59: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //    62: invokevirtual   java/util/ArrayList.size:()I
        //    65: ifeq            84
        //    68: aload_0        
        //    69: iconst_0       
        //    70: invokespecial   android/support/v4/view/ViewPager.setScrollingCacheEnabled:(Z)V
        //    73: return         
        //    74: astore          28
        //    76: aload           28
        //    78: athrow         
        //    79: astore          27
        //    81: aload           27
        //    83: athrow         
        //    84: iload_1        
        //    85: ifge            368
        //    88: iload           5
        //    90: ifeq            362
        //    93: iconst_0       
        //    94: istore          9
        //    96: aload_0        
        //    97: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //   100: invokevirtual   android/support/v4/view/PagerAdapter.getCount:()I
        //   103: istore          11
        //   105: iload           9
        //   107: iload           11
        //   109: if_icmplt       355
        //   112: iconst_m1      
        //   113: aload_0        
        //   114: getfield        android/support/v4/view/ViewPager.mAdapter:Landroid/support/v4/view/PagerAdapter;
        //   117: invokevirtual   android/support/v4/view/PagerAdapter.getCount:()I
        //   120: iadd           
        //   121: istore          12
        //   123: aload_0        
        //   124: getfield        android/support/v4/view/ViewPager.mOffscreenPageLimit:I
        //   127: istore          13
        //   129: iload           12
        //   131: iload           13
        //   133: aload_0        
        //   134: getfield        android/support/v4/view/ViewPager.mCurItem:I
        //   137: iadd           
        //   138: if_icmpgt       157
        //   141: aload_0        
        //   142: getfield        android/support/v4/view/ViewPager.mCurItem:I
        //   145: istore          26
        //   147: iload           12
        //   149: iload           26
        //   151: iload           13
        //   153: isub           
        //   154: if_icmpge       199
        //   157: iconst_0       
        //   158: istore          15
        //   160: iload           15
        //   162: aload_0        
        //   163: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   166: invokevirtual   java/util/ArrayList.size:()I
        //   169: if_icmpge       199
        //   172: aload_0        
        //   173: getfield        android/support/v4/view/ViewPager.mItems:Ljava/util/ArrayList;
        //   176: iload           15
        //   178: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   181: checkcast       Landroid/support/v4/view/ViewPager$ItemInfo;
        //   184: iconst_1       
        //   185: putfield        android/support/v4/view/ViewPager$ItemInfo.scrolling:Z
        //   188: iload           15
        //   190: iconst_1       
        //   191: iadd           
        //   192: istore          25
        //   194: iload           5
        //   196: ifeq            348
        //   199: aload_0        
        //   200: getfield        android/support/v4/view/ViewPager.mCurItem:I
        //   203: istore          17
        //   205: iconst_0       
        //   206: istore          18
        //   208: iload           17
        //   210: iload           12
        //   212: if_icmpeq       218
        //   215: iconst_1       
        //   216: istore          18
        //   218: aload_0        
        //   219: getfield        android/support/v4/view/ViewPager.mFirstLayout:Z
        //   222: istore          22
        //   224: iload           22
        //   226: ifeq            290
        //   229: aload_0        
        //   230: iload           12
        //   232: putfield        android/support/v4/view/ViewPager.mCurItem:I
        //   235: iload           18
        //   237: ifeq            258
        //   240: aload_0        
        //   241: getfield        android/support/v4/view/ViewPager.mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
        //   244: ifnull          258
        //   247: aload_0        
        //   248: getfield        android/support/v4/view/ViewPager.mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
        //   251: iload           12
        //   253: invokeinterface android/support/v4/view/ViewPager$OnPageChangeListener.onPageSelected:(I)V
        //   258: iload           18
        //   260: ifeq            281
        //   263: aload_0        
        //   264: getfield        android/support/v4/view/ViewPager.mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
        //   267: ifnull          281
        //   270: aload_0        
        //   271: getfield        android/support/v4/view/ViewPager.mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
        //   274: iload           12
        //   276: invokeinterface android/support/v4/view/ViewPager$OnPageChangeListener.onPageSelected:(I)V
        //   281: aload_0        
        //   282: invokevirtual   android/support/v4/view/ViewPager.requestLayout:()V
        //   285: iload           5
        //   287: ifeq            374
        //   290: aload_0        
        //   291: iload           12
        //   293: invokevirtual   android/support/v4/view/ViewPager.populate:(I)V
        //   296: aload_0        
        //   297: iload           12
        //   299: iload_2        
        //   300: iload           4
        //   302: iload           18
        //   304: invokespecial   android/support/v4/view/ViewPager.scrollToItem:(IZIZ)V
        //   307: return         
        //   308: astore          23
        //   310: aload           23
        //   312: athrow         
        //   313: astore          10
        //   315: aload           10
        //   317: athrow         
        //   318: astore          14
        //   320: aload           14
        //   322: athrow         
        //   323: astore          16
        //   325: aload           16
        //   327: athrow         
        //   328: astore          19
        //   330: aload           19
        //   332: athrow         
        //   333: astore          20
        //   335: aload           20
        //   337: athrow         
        //   338: astore          21
        //   340: aload           21
        //   342: athrow         
        //   343: astore          24
        //   345: aload           24
        //   347: athrow         
        //   348: iload           25
        //   350: istore          15
        //   352: goto            160
        //   355: iload           9
        //   357: istore          12
        //   359: goto            123
        //   362: iconst_0       
        //   363: istore          12
        //   365: goto            123
        //   368: iload_1        
        //   369: istore          9
        //   371: goto            96
        //   374: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  5      11     32     37     Landroid/content/res/Resources$NotFoundException;
        //  16     26     37     42     Landroid/content/res/Resources$NotFoundException;
        //  26     31     37     42     Landroid/content/res/Resources$NotFoundException;
        //  34     37     37     42     Landroid/content/res/Resources$NotFoundException;
        //  46     52     79     84     Landroid/content/res/Resources$NotFoundException;
        //  58     73     74     79     Landroid/content/res/Resources$NotFoundException;
        //  81     84     74     79     Landroid/content/res/Resources$NotFoundException;
        //  96     105    313    318    Landroid/content/res/Resources$NotFoundException;
        //  129    147    318    323    Landroid/content/res/Resources$NotFoundException;
        //  199    205    323    328    Landroid/content/res/Resources$NotFoundException;
        //  218    224    328    333    Landroid/content/res/Resources$NotFoundException;
        //  229    235    333    338    Landroid/content/res/Resources$NotFoundException;
        //  240    258    338    343    Landroid/content/res/Resources$NotFoundException;
        //  263    281    343    348    Landroid/content/res/Resources$NotFoundException;
        //  281    285    308    313    Landroid/content/res/Resources$NotFoundException;
        //  290    307    308    313    Landroid/content/res/Resources$NotFoundException;
        //  330    333    333    338    Landroid/content/res/Resources$NotFoundException;
        //  335    338    338    343    Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 186, Size: 186
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
    
    ViewPager$OnPageChangeListener setInternalPageChangeListener(final ViewPager$OnPageChangeListener mInternalPageChangeListener) {
        final ViewPager$OnPageChangeListener mInternalPageChangeListener2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = mInternalPageChangeListener;
        return mInternalPageChangeListener2;
    }
    
    public void setOffscreenPageLimit(int mOffscreenPageLimit) {
        if (mOffscreenPageLimit < 1) {
            Log.w(ViewPager.z[2], ViewPager.z[1] + mOffscreenPageLimit + ViewPager.z[0] + 1);
            mOffscreenPageLimit = 1;
        }
        try {
            if (mOffscreenPageLimit != this.mOffscreenPageLimit) {
                this.mOffscreenPageLimit = mOffscreenPageLimit;
                this.populate();
            }
        }
        catch (Resources$NotFoundException ex) {
            throw ex;
        }
    }
    
    void setOnAdapterChangeListener(final ViewPager$OnAdapterChangeListener mAdapterChangeListener) {
        this.mAdapterChangeListener = mAdapterChangeListener;
    }
    
    public void setOnPageChangeListener(final ViewPager$OnPageChangeListener mOnPageChangeListener) {
        this.mOnPageChangeListener = mOnPageChangeListener;
    }
    
    public void setPageMargin(final int mPageMargin) {
        final int mPageMargin2 = this.mPageMargin;
        this.mPageMargin = mPageMargin;
        final int width = this.getWidth();
        this.recomputeScrollPosition(width, width, mPageMargin, mPageMargin2);
        this.requestLayout();
    }
    
    public void setPageTransformer(final boolean p0, final ViewPager$PageTransformer p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_3       
        //     2: getstatic       android/os/Build$VERSION.SDK_INT:I
        //     5: istore          6
        //     7: iload           6
        //     9: bipush          11
        //    11: if_icmplt       95
        //    14: aload_2        
        //    15: ifnull          106
        //    18: iload_3        
        //    19: istore          7
        //    21: aload_0        
        //    22: getfield        android/support/v4/view/ViewPager.mPageTransformer:Landroid/support/v4/view/ViewPager$PageTransformer;
        //    25: astore          9
        //    27: aload           9
        //    29: ifnull          117
        //    32: iload_3        
        //    33: istore          10
        //    35: iconst_0       
        //    36: istore          11
        //    38: iload           7
        //    40: iload           10
        //    42: if_icmpeq       48
        //    45: iload_3        
        //    46: istore          11
        //    48: aload_0        
        //    49: aload_2        
        //    50: putfield        android/support/v4/view/ViewPager.mPageTransformer:Landroid/support/v4/view/ViewPager$PageTransformer;
        //    53: aload_0        
        //    54: iload           7
        //    56: invokevirtual   android/support/v4/view/ViewPager.setChildrenDrawingOrderEnabledCompat:(Z)V
        //    59: iload           7
        //    61: ifeq            81
        //    64: iload_1        
        //    65: ifeq            70
        //    68: iconst_2       
        //    69: istore_3       
        //    70: aload_0        
        //    71: iload_3        
        //    72: putfield        android/support/v4/view/ViewPager.mDrawingOrder:I
        //    75: getstatic       android/support/v4/view/ViewPager.a:I
        //    78: ifeq            86
        //    81: aload_0        
        //    82: iconst_0       
        //    83: putfield        android/support/v4/view/ViewPager.mDrawingOrder:I
        //    86: iload           11
        //    88: ifeq            95
        //    91: aload_0        
        //    92: invokevirtual   android/support/v4/view/ViewPager.populate:()V
        //    95: return         
        //    96: astore          4
        //    98: aload           4
        //   100: athrow         
        //   101: astore          5
        //   103: aload           5
        //   105: athrow         
        //   106: iconst_0       
        //   107: istore          7
        //   109: goto            21
        //   112: astore          8
        //   114: aload           8
        //   116: athrow         
        //   117: iconst_0       
        //   118: istore          10
        //   120: goto            35
        //   123: astore          12
        //   125: aload           12
        //   127: athrow         
        //   128: astore          13
        //   130: aload           13
        //   132: athrow         
        //   133: astore          14
        //   135: aload           14
        //   137: athrow         
        //   138: astore          15
        //   140: aload           15
        //   142: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  2      7      96     106    Landroid/content/res/Resources$NotFoundException;
        //  21     27     112    117    Landroid/content/res/Resources$NotFoundException;
        //  48     59     123    133    Landroid/content/res/Resources$NotFoundException;
        //  70     81     133    138    Landroid/content/res/Resources$NotFoundException;
        //  81     86     133    138    Landroid/content/res/Resources$NotFoundException;
        //  91     95     138    143    Landroid/content/res/Resources$NotFoundException;
        //  98     101    101    106    Landroid/content/res/Resources$NotFoundException;
        //  125    128    128    133    Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 77, Size: 77
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
    
    void smoothScrollTo(final int n, final int n2, final int n3) {
        try {
            if (this.getChildCount() == 0) {
                this.setScrollingCacheEnabled(false);
                return;
            }
        }
        catch (Resources$NotFoundException ex) {
            throw ex;
        }
        final int scrollX = this.getScrollX();
        final int scrollY = this.getScrollY();
        final int n4 = n - scrollX;
        final int n5 = n2 - scrollY;
        if (n4 == 0 && n5 == 0) {
            try {
                this.completeScroll(false);
                this.populate();
                this.setScrollState(0);
                return;
            }
            catch (Resources$NotFoundException ex2) {
                throw ex2;
            }
        }
        this.setScrollingCacheEnabled(true);
        this.setScrollState(2);
        final int clientWidth = this.getClientWidth();
        final int n6 = clientWidth / 2;
        final float n7 = n6 + n6 * this.distanceInfluenceForSnapDuration(Math.min(1.0f, 1.0f * Math.abs(n4) / clientWidth));
        final int abs = Math.abs(n3);
        int n8 = 0;
        Label_0206: {
            if (abs > 0) {
                n8 = 4 * Math.round(1000.0f * Math.abs(n7 / abs));
                if (ViewPager.a == 0) {
                    break Label_0206;
                }
            }
            n8 = (int)(100.0f * (1.0f + Math.abs(n4) / (clientWidth * this.mAdapter.getPageWidth(this.mCurItem) + this.mPageMargin)));
        }
        this.mScroller.startScroll(scrollX, scrollY, n4, n5, Math.min(n8, 600));
        ViewCompat.postInvalidateOnAnimation((View)this);
    }
    
    protected boolean verifyDrawable(final Drawable drawable) {
        try {
            if (super.verifyDrawable(drawable)) {
                return true;
            }
            final Drawable drawable2 = drawable;
            final ViewPager viewPager = this;
            final Drawable drawable3 = viewPager.mMarginDrawable;
            if (drawable2 == drawable3) {
                return true;
            }
            return false;
        }
        catch (Resources$NotFoundException ex) {
            throw ex;
        }
        try {
            final Drawable drawable2 = drawable;
            final ViewPager viewPager = this;
            final Drawable drawable3 = viewPager.mMarginDrawable;
            if (drawable2 == drawable3) {
                return true;
            }
        }
        catch (Resources$NotFoundException ex2) {
            throw ex2;
        }
        return false;
    }
}
