// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.os.Parcelable;
import android.widget.FrameLayout$LayoutParams;
import android.support.v4.view.MotionEventCompat;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.ViewGroup$LayoutParams;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.util.TypedValue;
import android.content.res.TypedArray;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;
import android.view.VelocityTracker;
import android.graphics.Rect;
import android.support.v4.view.NestedScrollingParentHelper;
import android.view.View;
import android.support.v4.view.NestedScrollingChildHelper;
import android.support.v4.view.NestedScrollingChild;
import android.support.v4.view.NestedScrollingParent;
import android.widget.FrameLayout;

public class NestedScrollView extends FrameLayout implements NestedScrollingParent, NestedScrollingChild
{
    private static final NestedScrollView$AccessibilityDelegate ACCESSIBILITY_DELEGATE;
    private static final int[] SCROLLVIEW_STYLEABLE;
    private static final String[] z;
    private int mActivePointerId;
    private final NestedScrollingChildHelper mChildHelper;
    private View mChildToScrollTo;
    private EdgeEffectCompat mEdgeGlowBottom;
    private EdgeEffectCompat mEdgeGlowTop;
    private boolean mFillViewport;
    private boolean mIsBeingDragged;
    private boolean mIsLaidOut;
    private boolean mIsLayoutDirty;
    private int mLastMotionY;
    private long mLastScroll;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private int mNestedYOffset;
    private final NestedScrollingParentHelper mParentHelper;
    private NestedScrollView$SavedState mSavedState;
    private final int[] mScrollConsumed;
    private final int[] mScrollOffset;
    private ScrollerCompat mScroller;
    private boolean mSmoothScrollingEnabled;
    private final Rect mTempRect;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    private float mVerticalScrollFactor;
    
    static {
        final String[] z2 = new String[11];
        String s = "\u0015H>\bH*}%\u0002SfH-\t\u0004.D?\u0013\u0004)E \u001e\u0004)E)G@/Y)\u0004PfH$\u000eH\"";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0307:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '$';
                        break;
                    }
                    case 0: {
                        c2 = 'F';
                        break;
                    }
                    case 1: {
                        c2 = '+';
                        break;
                    }
                    case 2: {
                        c2 = 'L';
                        break;
                    }
                    case 3: {
                        c2 = 'g';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0015H>\bH*}%\u0002SfH-\t\u0004.D?\u0013\u0004)E \u001e\u0004)E)G@/Y)\u0004PfH$\u000eH\"";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0015H>\bH*}%\u0002SfH-\t\u0004.D?\u0013\u0004)E \u001e\u0004)E)G@/Y)\u0004PfH$\u000eH\"";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0015H>\bH*}%\u0002SfH-\t\u0004.D?\u0013\u0004)E \u001e\u0004)E)G@/Y)\u0004PfH$\u000eH\"";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "fB\"GK(\u007f#\u0012G.n:\u0002J2";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\bN?\u0013A\"x/\u0015K*G\u001a\u000eA1";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u000fE:\u0006H/Ol\u0017K/E8\u0002V\u000fOq";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u000fE:\u0006H/Ol\u0017K/E8\u0002V\u000fOq";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "fB\"GK(b\"\u0013A4H)\u0017P\u0012D9\u0004L\u0003])\tP";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\bN?\u0013A\"x/\u0015K*G\u001a\u000eA1";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0003S<\u0002G2N(GP.N!\u0002\u00042Dl\u0003A B\"\u0002\u0004*B?\u0013t4N*\u0002V4N(.P#F\u0004\u0002M!C8I";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    break Label_0307;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        ACCESSIBILITY_DELEGATE = new NestedScrollView$AccessibilityDelegate();
        SCROLLVIEW_STYLEABLE = new int[] { 16843130 };
    }
    
    public NestedScrollView(final Context context) {
        this(context, null);
    }
    
    public NestedScrollView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public NestedScrollView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.mTempRect = new Rect();
        this.mIsLayoutDirty = true;
        this.mIsLaidOut = false;
        this.mChildToScrollTo = null;
        this.mIsBeingDragged = false;
        this.mSmoothScrollingEnabled = true;
        this.mActivePointerId = -1;
        this.mScrollOffset = new int[2];
        this.mScrollConsumed = new int[2];
        this.initScrollView();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, NestedScrollView.SCROLLVIEW_STYLEABLE, n, 0);
        this.setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.mParentHelper = new NestedScrollingParentHelper((ViewGroup)this);
        this.mChildHelper = new NestedScrollingChildHelper((View)this);
        this.setNestedScrollingEnabled(true);
        ViewCompat.setAccessibilityDelegate((View)this, NestedScrollView.ACCESSIBILITY_DELEGATE);
    }
    
    static int access$000(final NestedScrollView nestedScrollView) {
        return nestedScrollView.getScrollRange();
    }
    
    private boolean canScroll() {
        final View child = this.getChildAt(0);
        boolean b = false;
        if (child == null) {
            return b;
        }
        final int height = child.getHeight();
        try {
            final int height2 = this.getHeight();
            final int n = height + this.getPaddingTop() + this.getPaddingBottom();
            b = false;
            if (height2 < n) {
                b = true;
            }
            return b;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    private static int clamp(int n, final int n2, final int n3) {
        if (n2 >= n3 || n < 0) {
            n = 0;
        }
        else if (n2 + n > n3) {
            return n3 - n2;
        }
        return n;
    }
    
    private void doScrollY(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iload_1        
        //     1: ifeq            40
        //     4: aload_0        
        //     5: getfield        android/support/v4/widget/NestedScrollView.mSmoothScrollingEnabled:Z
        //     8: istore          4
        //    10: iload           4
        //    12: ifeq            27
        //    15: aload_0        
        //    16: iconst_0       
        //    17: iload_1        
        //    18: invokevirtual   android/support/v4/widget/NestedScrollView.smoothScrollBy:(II)V
        //    21: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //    24: ifeq            40
        //    27: aload_0        
        //    28: iconst_0       
        //    29: iload_1        
        //    30: invokevirtual   android/support/v4/widget/NestedScrollView.scrollBy:(II)V
        //    33: return         
        //    34: astore_2       
        //    35: aload_2        
        //    36: athrow         
        //    37: astore_3       
        //    38: aload_3        
        //    39: athrow         
        //    40: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      10     34     37     Ljava/lang/IllegalStateException;
        //  15     27     37     40     Ljava/lang/IllegalStateException;
        //  27     33     37     40     Ljava/lang/IllegalStateException;
        //  35     37     37     40     Ljava/lang/IllegalStateException;
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
    
    private void endDrag() {
        try {
            this.mIsBeingDragged = false;
            this.recycleVelocityTracker();
            if (this.mEdgeGlowTop != null) {
                this.mEdgeGlowTop.onRelease();
                this.mEdgeGlowBottom.onRelease();
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    private void ensureGlows() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokestatic    android/support/v4/view/ViewCompat.getOverScrollMode:(Landroid/view/View;)I
        //     4: iconst_2       
        //     5: if_icmpeq       55
        //     8: aload_0        
        //     9: getfield        android/support/v4/widget/NestedScrollView.mEdgeGlowTop:Landroid/support/v4/widget/EdgeEffectCompat;
        //    12: astore_3       
        //    13: aload_3        
        //    14: ifnonnull       65
        //    17: aload_0        
        //    18: invokevirtual   android/support/v4/widget/NestedScrollView.getContext:()Landroid/content/Context;
        //    21: astore          4
        //    23: aload_0        
        //    24: new             Landroid/support/v4/widget/EdgeEffectCompat;
        //    27: dup            
        //    28: aload           4
        //    30: invokespecial   android/support/v4/widget/EdgeEffectCompat.<init>:(Landroid/content/Context;)V
        //    33: putfield        android/support/v4/widget/NestedScrollView.mEdgeGlowTop:Landroid/support/v4/widget/EdgeEffectCompat;
        //    36: aload_0        
        //    37: new             Landroid/support/v4/widget/EdgeEffectCompat;
        //    40: dup            
        //    41: aload           4
        //    43: invokespecial   android/support/v4/widget/EdgeEffectCompat.<init>:(Landroid/content/Context;)V
        //    46: putfield        android/support/v4/widget/NestedScrollView.mEdgeGlowBottom:Landroid/support/v4/widget/EdgeEffectCompat;
        //    49: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //    52: ifeq            65
        //    55: aload_0        
        //    56: aconst_null    
        //    57: putfield        android/support/v4/widget/NestedScrollView.mEdgeGlowTop:Landroid/support/v4/widget/EdgeEffectCompat;
        //    60: aload_0        
        //    61: aconst_null    
        //    62: putfield        android/support/v4/widget/NestedScrollView.mEdgeGlowBottom:Landroid/support/v4/widget/EdgeEffectCompat;
        //    65: return         
        //    66: astore_1       
        //    67: aload_1        
        //    68: athrow         
        //    69: astore_2       
        //    70: aload_2        
        //    71: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      13     66     69     Ljava/lang/IllegalStateException;
        //  23     55     69     72     Ljava/lang/IllegalStateException;
        //  55     65     69     72     Ljava/lang/IllegalStateException;
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
    
    private View findFocusableViewInBounds(final boolean p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //     3: istore          4
        //     5: aload_0        
        //     6: iconst_2       
        //     7: invokevirtual   android/support/v4/widget/NestedScrollView.getFocusables:(I)Ljava/util/ArrayList;
        //    10: astore          5
        //    12: aload           5
        //    14: invokeinterface java/util/List.size:()I
        //    19: istore          6
        //    21: iconst_0       
        //    22: istore          7
        //    24: iconst_0       
        //    25: istore          8
        //    27: aconst_null    
        //    28: astore          9
        //    30: iload           7
        //    32: iload           6
        //    34: if_icmpge       254
        //    37: aload           5
        //    39: iload           7
        //    41: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    46: checkcast       Landroid/view/View;
        //    49: astore          10
        //    51: aload           10
        //    53: invokevirtual   android/view/View.getTop:()I
        //    56: istore          11
        //    58: aload           10
        //    60: invokevirtual   android/view/View.getBottom:()I
        //    63: istore          12
        //    65: iload_2        
        //    66: iload           12
        //    68: if_icmpge       243
        //    71: iload           11
        //    73: iload_3        
        //    74: if_icmpge       243
        //    77: iload_2        
        //    78: iload           11
        //    80: if_icmpge       209
        //    83: iload           12
        //    85: iload_3        
        //    86: if_icmpge       209
        //    89: iconst_1       
        //    90: istore          13
        //    92: aload           9
        //    94: ifnonnull       236
        //    97: iload           4
        //    99: ifeq            195
        //   102: iload           13
        //   104: istore          8
        //   106: aload           10
        //   108: astore          15
        //   110: iload_1        
        //   111: ifeq            128
        //   114: aload           15
        //   116: invokevirtual   android/view/View.getTop:()I
        //   119: istore          22
        //   121: iload           11
        //   123: iload           22
        //   125: if_icmplt       146
        //   128: iload_1        
        //   129: ifne            230
        //   132: aload           15
        //   134: invokevirtual   android/view/View.getBottom:()I
        //   137: istore          19
        //   139: iload           12
        //   141: iload           19
        //   143: if_icmple       230
        //   146: iconst_1       
        //   147: istore          16
        //   149: iload           8
        //   151: ifeq            173
        //   154: iload           13
        //   156: ifeq            297
        //   159: iload           16
        //   161: ifeq            297
        //   164: iload           4
        //   166: ifeq            290
        //   169: aload           10
        //   171: astore          15
        //   173: iload           13
        //   175: ifeq            279
        //   178: iconst_1       
        //   179: istore          13
        //   181: iload           4
        //   183: ifeq            195
        //   186: aload           10
        //   188: astore          17
        //   190: iload           16
        //   192: ifeq            272
        //   195: iload           7
        //   197: iconst_1       
        //   198: iadd           
        //   199: istore          14
        //   201: iload           4
        //   203: ifeq            257
        //   206: aload           10
        //   208: areturn        
        //   209: iconst_0       
        //   210: istore          13
        //   212: goto            92
        //   215: astore          20
        //   217: aload           20
        //   219: athrow         
        //   220: astore          21
        //   222: aload           21
        //   224: athrow         
        //   225: astore          18
        //   227: aload           18
        //   229: athrow         
        //   230: iconst_0       
        //   231: istore          16
        //   233: goto            149
        //   236: aload           9
        //   238: astore          15
        //   240: goto            110
        //   243: iload           8
        //   245: istore          13
        //   247: aload           9
        //   249: astore          10
        //   251: goto            195
        //   254: aload           9
        //   256: areturn        
        //   257: iload           14
        //   259: istore          7
        //   261: iload           13
        //   263: istore          8
        //   265: aload           10
        //   267: astore          9
        //   269: goto            30
        //   272: aload           17
        //   274: astore          10
        //   276: goto            195
        //   279: iload           8
        //   281: istore          13
        //   283: aload           15
        //   285: astore          17
        //   287: goto            190
        //   290: iload           8
        //   292: istore          13
        //   294: goto            195
        //   297: iload           8
        //   299: istore          13
        //   301: aload           15
        //   303: astore          10
        //   305: goto            195
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  114    121    215    225    Ljava/lang/IllegalStateException;
        //  132    139    225    230    Ljava/lang/IllegalStateException;
        //  217    220    220    225    Ljava/lang/IllegalStateException;
        //  222    225    225    230    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0146:
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
    
    private void flingWithNestedDispatch(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   android/support/v4/widget/NestedScrollView.getScrollY:()I
        //     4: istore_2       
        //     5: iload_2        
        //     6: ifgt            13
        //     9: iload_1        
        //    10: ifle            83
        //    13: aload_0        
        //    14: invokespecial   android/support/v4/widget/NestedScrollView.getScrollRange:()I
        //    17: istore          5
        //    19: iload_2        
        //    20: iload           5
        //    22: if_icmplt       29
        //    25: iload_1        
        //    26: ifge            83
        //    29: iconst_1       
        //    30: istore          6
        //    32: iload_1        
        //    33: i2f            
        //    34: fstore          7
        //    36: aload_0        
        //    37: fconst_0       
        //    38: fload           7
        //    40: invokevirtual   android/support/v4/widget/NestedScrollView.dispatchNestedPreFling:(FF)Z
        //    43: istore          10
        //    45: iload           10
        //    47: ifne            74
        //    50: iload_1        
        //    51: i2f            
        //    52: fstore          11
        //    54: aload_0        
        //    55: fconst_0       
        //    56: fload           11
        //    58: iload           6
        //    60: invokevirtual   android/support/v4/widget/NestedScrollView.dispatchNestedFling:(FFZ)Z
        //    63: pop            
        //    64: iload           6
        //    66: ifeq            74
        //    69: aload_0        
        //    70: iload_1        
        //    71: invokevirtual   android/support/v4/widget/NestedScrollView.fling:(I)V
        //    74: return         
        //    75: astore_3       
        //    76: aload_3        
        //    77: athrow         
        //    78: astore          4
        //    80: aload           4
        //    82: athrow         
        //    83: iconst_0       
        //    84: istore          6
        //    86: goto            32
        //    89: astore          8
        //    91: aload           8
        //    93: athrow         
        //    94: astore          9
        //    96: aload           9
        //    98: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  13     19     75     83     Ljava/lang/IllegalStateException;
        //  36     45     89     94     Ljava/lang/IllegalStateException;
        //  54     64     94     99     Ljava/lang/IllegalStateException;
        //  69     74     94     99     Ljava/lang/IllegalStateException;
        //  76     78     78     83     Ljava/lang/IllegalStateException;
        //  91     94     94     99     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 57, Size: 57
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
    
    private int getScrollRange() {
        final int childCount = this.getChildCount();
        int max = 0;
        if (childCount > 0) {
            max = Math.max(0, this.getChildAt(0).getHeight() - (this.getHeight() - this.getPaddingBottom() - this.getPaddingTop()));
        }
        return max;
    }
    
    private float getVerticalScrollFactorCompat() {
        if (this.mVerticalScrollFactor == 0.0f) {
            final TypedValue typedValue = new TypedValue();
            final Context context = this.getContext();
            try {
                if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                    throw new IllegalStateException(NestedScrollView.z[10]);
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            this.mVerticalScrollFactor = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.mVerticalScrollFactor;
    }
    
    private boolean inChild(final int p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   android/support/v4/widget/NestedScrollView.getChildCount:()I
        //     4: istore_3       
        //     5: iconst_0       
        //     6: istore          4
        //     8: iload_3        
        //     9: ifle            106
        //    12: aload_0        
        //    13: invokevirtual   android/support/v4/widget/NestedScrollView.getScrollY:()I
        //    16: istore          5
        //    18: aload_0        
        //    19: iconst_0       
        //    20: invokevirtual   android/support/v4/widget/NestedScrollView.getChildAt:(I)Landroid/view/View;
        //    23: astore          6
        //    25: aload           6
        //    27: invokevirtual   android/view/View.getTop:()I
        //    30: istore          11
        //    32: iload           11
        //    34: iload           5
        //    36: isub           
        //    37: istore          12
        //    39: iconst_0       
        //    40: istore          4
        //    42: iload_2        
        //    43: iload           12
        //    45: if_icmplt       106
        //    48: aload           6
        //    50: invokevirtual   android/view/View.getBottom:()I
        //    53: istore          13
        //    55: iload           13
        //    57: iload           5
        //    59: isub           
        //    60: istore          14
        //    62: iconst_0       
        //    63: istore          4
        //    65: iload_2        
        //    66: iload           14
        //    68: if_icmpge       106
        //    71: aload           6
        //    73: invokevirtual   android/view/View.getLeft:()I
        //    76: istore          15
        //    78: iconst_0       
        //    79: istore          4
        //    81: iload_1        
        //    82: iload           15
        //    84: if_icmplt       106
        //    87: aload           6
        //    89: invokevirtual   android/view/View.getRight:()I
        //    92: istore          16
        //    94: iconst_0       
        //    95: istore          4
        //    97: iload_1        
        //    98: iload           16
        //   100: if_icmpge       106
        //   103: iconst_1       
        //   104: istore          4
        //   106: iload           4
        //   108: ireturn        
        //   109: astore          7
        //   111: aload           7
        //   113: athrow         
        //   114: astore          8
        //   116: aload           8
        //   118: athrow         
        //   119: astore          9
        //   121: aload           9
        //   123: athrow         
        //   124: astore          10
        //   126: aload           10
        //   128: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  25     32     109    114    Ljava/lang/IllegalStateException;
        //  48     55     114    119    Ljava/lang/IllegalStateException;
        //  71     78     119    124    Ljava/lang/IllegalStateException;
        //  87     94     124    129    Ljava/lang/IllegalStateException;
        //  111    114    114    119    Ljava/lang/IllegalStateException;
        //  116    119    119    124    Ljava/lang/IllegalStateException;
        //  121    124    124    129    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 70, Size: 70
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
    
    private void initOrResetVelocityTracker() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v4/widget/NestedScrollView.mVelocityTracker:Landroid/view/VelocityTracker;
        //     4: astore_3       
        //     5: aload_3        
        //     6: ifnonnull       22
        //     9: aload_0        
        //    10: invokestatic    android/view/VelocityTracker.obtain:()Landroid/view/VelocityTracker;
        //    13: putfield        android/support/v4/widget/NestedScrollView.mVelocityTracker:Landroid/view/VelocityTracker;
        //    16: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //    19: ifeq            36
        //    22: aload_0        
        //    23: getfield        android/support/v4/widget/NestedScrollView.mVelocityTracker:Landroid/view/VelocityTracker;
        //    26: invokevirtual   android/view/VelocityTracker.clear:()V
        //    29: return         
        //    30: astore_1       
        //    31: aload_1        
        //    32: athrow         
        //    33: astore_2       
        //    34: aload_2        
        //    35: athrow         
        //    36: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      5      30     33     Ljava/lang/IllegalStateException;
        //  9      22     33     36     Ljava/lang/IllegalStateException;
        //  22     29     33     36     Ljava/lang/IllegalStateException;
        //  31     33     33     36     Ljava/lang/IllegalStateException;
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
    
    private void initScrollView() {
        this.mScroller = new ScrollerCompat(this.getContext(), null);
        this.setFocusable(true);
        this.setDescendantFocusability(262144);
        this.setWillNotDraw(false);
        final ViewConfiguration value = ViewConfiguration.get(this.getContext());
        this.mTouchSlop = value.getScaledTouchSlop();
        this.mMinimumVelocity = value.getScaledMinimumFlingVelocity();
        this.mMaximumVelocity = value.getScaledMaximumFlingVelocity();
    }
    
    private void initVelocityTrackerIfNotExists() {
        try {
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    private boolean isOffScreen(final View view) {
        try {
            final boolean withinDeltaOfScreen = this.isWithinDeltaOfScreen(view, 0, this.getHeight());
            boolean b = false;
            if (!withinDeltaOfScreen) {
                b = true;
            }
            return b;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    private static boolean isViewDescendantOf(final View view, final View view2) {
        if (view == view2) {
            return true;
        }
        final ViewParent parent = view.getParent();
        try {
            if (!(parent instanceof ViewGroup)) {
                return false;
            }
            final ViewParent viewParent = parent;
            final View view3 = (View)viewParent;
            final View view4 = view2;
            final boolean b = isViewDescendantOf(view3, view4);
            if (b) {
                return true;
            }
            return false;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            final ViewParent viewParent = parent;
            final View view3 = (View)viewParent;
            final View view4 = view2;
            final boolean b = isViewDescendantOf(view3, view4);
            if (b) {
                return true;
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
        return false;
    }
    
    private boolean isWithinDeltaOfScreen(final View view, final int n, final int n2) {
        try {
            view.getDrawingRect(this.mTempRect);
            this.offsetDescendantRectToMyCoords(view, this.mTempRect);
            if (n + this.mTempRect.bottom < this.getScrollY()) {
                return false;
            }
            final NestedScrollView nestedScrollView = this;
            final Rect rect = nestedScrollView.mTempRect;
            final int n3 = rect.top;
            final int n4 = n;
            final int n5 = n3 - n4;
            final int n6 = n2;
            final NestedScrollView nestedScrollView2 = this;
            final int n7 = nestedScrollView2.getScrollY();
            final int n8 = n6 + n7;
            if (n5 <= n8) {
                return true;
            }
            return false;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            final NestedScrollView nestedScrollView = this;
            final Rect rect = nestedScrollView.mTempRect;
            final int n3 = rect.top;
            final int n4 = n;
            final int n5 = n3 - n4;
            final int n6 = n2;
            final NestedScrollView nestedScrollView2 = this;
            final int n7 = nestedScrollView2.getScrollY();
            final int n8 = n6 + n7;
            if (n5 <= n8) {
                return true;
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
        return false;
    }
    
    private void onSecondaryPointerUp(final MotionEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc_w           65280
        //     3: aload_1        
        //     4: invokevirtual   android/view/MotionEvent.getAction:()I
        //     7: iand           
        //     8: bipush          8
        //    10: ishr           
        //    11: istore_2       
        //    12: aload_1        
        //    13: iload_2        
        //    14: invokestatic    android/support/v4/view/MotionEventCompat.getPointerId:(Landroid/view/MotionEvent;I)I
        //    17: istore_3       
        //    18: aload_0        
        //    19: getfield        android/support/v4/widget/NestedScrollView.mActivePointerId:I
        //    22: istore          6
        //    24: iload_3        
        //    25: iload           6
        //    27: if_icmpne       72
        //    30: iload_2        
        //    31: ifne            83
        //    34: iconst_1       
        //    35: istore          7
        //    37: aload_0        
        //    38: aload_1        
        //    39: iload           7
        //    41: invokestatic    android/support/v4/view/MotionEventCompat.getY:(Landroid/view/MotionEvent;I)F
        //    44: f2i            
        //    45: putfield        android/support/v4/widget/NestedScrollView.mLastMotionY:I
        //    48: aload_0        
        //    49: aload_1        
        //    50: iload           7
        //    52: invokestatic    android/support/v4/view/MotionEventCompat.getPointerId:(Landroid/view/MotionEvent;I)I
        //    55: putfield        android/support/v4/widget/NestedScrollView.mActivePointerId:I
        //    58: aload_0        
        //    59: getfield        android/support/v4/widget/NestedScrollView.mVelocityTracker:Landroid/view/VelocityTracker;
        //    62: ifnull          72
        //    65: aload_0        
        //    66: getfield        android/support/v4/widget/NestedScrollView.mVelocityTracker:Landroid/view/VelocityTracker;
        //    69: invokevirtual   android/view/VelocityTracker.clear:()V
        //    72: return         
        //    73: astore          4
        //    75: aload           4
        //    77: athrow         
        //    78: astore          5
        //    80: aload           5
        //    82: athrow         
        //    83: iconst_0       
        //    84: istore          7
        //    86: goto            37
        //    89: astore          8
        //    91: aload           8
        //    93: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  18     24     73     83     Ljava/lang/IllegalStateException;
        //  37     72     89     94     Ljava/lang/IllegalStateException;
        //  75     78     78     83     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0037:
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
    
    private void recycleVelocityTracker() {
        try {
            if (this.mVelocityTracker != null) {
                this.mVelocityTracker.recycle();
                this.mVelocityTracker = null;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    private boolean scrollAndFocus(final int p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   android/support/v4/widget/NestedScrollView.getHeight:()I
        //     4: istore          4
        //     6: aload_0        
        //     7: invokevirtual   android/support/v4/widget/NestedScrollView.getScrollY:()I
        //    10: istore          5
        //    12: iload           5
        //    14: iload           4
        //    16: iadd           
        //    17: istore          6
        //    19: iload_1        
        //    20: bipush          33
        //    22: if_icmpne       107
        //    25: iconst_1       
        //    26: istore          7
        //    28: aload_0        
        //    29: iload           7
        //    31: iload_2        
        //    32: iload_3        
        //    33: invokespecial   android/support/v4/widget/NestedScrollView.findFocusableViewInBounds:(ZII)Landroid/view/View;
        //    36: astore          8
        //    38: aload           8
        //    40: ifnonnull       46
        //    43: aload_0        
        //    44: astore          8
        //    46: iload_2        
        //    47: iload           5
        //    49: if_icmplt       137
        //    52: iload_3        
        //    53: iload           6
        //    55: if_icmpgt       137
        //    58: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //    61: istore          15
        //    63: iconst_0       
        //    64: istore          9
        //    66: iload           15
        //    68: ifeq            88
        //    71: iload           7
        //    73: ifeq            123
        //    76: iload_2        
        //    77: iload           5
        //    79: isub           
        //    80: istore          10
        //    82: aload_0        
        //    83: iload           10
        //    85: invokespecial   android/support/v4/widget/NestedScrollView.doScrollY:(I)V
        //    88: aload           8
        //    90: aload_0        
        //    91: invokevirtual   android/support/v4/widget/NestedScrollView.findFocus:()Landroid/view/View;
        //    94: if_acmpeq       104
        //    97: aload           8
        //    99: iload_1        
        //   100: invokevirtual   android/view/View.requestFocus:(I)Z
        //   103: pop            
        //   104: iload           9
        //   106: ireturn        
        //   107: iconst_0       
        //   108: istore          7
        //   110: goto            28
        //   113: astore          13
        //   115: aload           13
        //   117: athrow         
        //   118: astore          14
        //   120: aload           14
        //   122: athrow         
        //   123: iload_3        
        //   124: iload           6
        //   126: isub           
        //   127: istore          10
        //   129: goto            82
        //   132: astore          11
        //   134: aload           11
        //   136: athrow         
        //   137: iconst_1       
        //   138: istore          9
        //   140: goto            71
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  58     63     113    123    Ljava/lang/IllegalStateException;
        //  88     104    132    137    Ljava/lang/IllegalStateException;
        //  115    118    118    123    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0088:
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
    
    private void scrollToChild(final View view) {
        view.getDrawingRect(this.mTempRect);
        this.offsetDescendantRectToMyCoords(view, this.mTempRect);
        final int computeScrollDeltaToGetChildRectOnScreen = this.computeScrollDeltaToGetChildRectOnScreen(this.mTempRect);
        if (computeScrollDeltaToGetChildRectOnScreen == 0) {
            return;
        }
        try {
            this.scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    private boolean scrollToChildRect(final Rect rect, final boolean b) {
        final int computeScrollDeltaToGetChildRectOnScreen = this.computeScrollDeltaToGetChildRectOnScreen(rect);
        boolean b2 = false;
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            b2 = true;
        }
        if (!b2) {
            return b2;
        }
        Label_0037: {
            if (!b) {
                break Label_0037;
            }
            try {
                this.scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
                if (SlidingPaneLayout.a) {
                    this.smoothScrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
                }
                return b2;
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
        }
    }
    
    public void addView(final View view) {
        try {
            if (this.getChildCount() > 0) {
                throw new IllegalStateException(NestedScrollView.z[2]);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        super.addView(view);
    }
    
    public void addView(final View view, final int n) {
        try {
            if (this.getChildCount() > 0) {
                throw new IllegalStateException(NestedScrollView.z[0]);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        super.addView(view, n);
    }
    
    public void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        try {
            if (this.getChildCount() > 0) {
                throw new IllegalStateException(NestedScrollView.z[3]);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        super.addView(view, n, viewGroup$LayoutParams);
    }
    
    public void addView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        try {
            if (this.getChildCount() > 0) {
                throw new IllegalStateException(NestedScrollView.z[1]);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        super.addView(view, viewGroup$LayoutParams);
    }
    
    public boolean arrowScroll(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: invokevirtual   android/support/v4/widget/NestedScrollView.findFocus:()Landroid/view/View;
        //     8: astore_3       
        //     9: aload_3        
        //    10: aload_0        
        //    11: if_acmpne       16
        //    14: aconst_null    
        //    15: astore_3       
        //    16: invokestatic    android/view/FocusFinder.getInstance:()Landroid/view/FocusFinder;
        //    19: aload_0        
        //    20: aload_3        
        //    21: iload_1        
        //    22: invokevirtual   android/view/FocusFinder.findNextFocus:(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
        //    25: astore          4
        //    27: aload_0        
        //    28: invokevirtual   android/support/v4/widget/NestedScrollView.getMaxScrollAmount:()I
        //    31: istore          5
        //    33: aload           4
        //    35: ifnull          99
        //    38: aload_0        
        //    39: aload           4
        //    41: iload           5
        //    43: aload_0        
        //    44: invokevirtual   android/support/v4/widget/NestedScrollView.getHeight:()I
        //    47: invokespecial   android/support/v4/widget/NestedScrollView.isWithinDeltaOfScreen:(Landroid/view/View;II)Z
        //    50: istore          18
        //    52: iload           18
        //    54: ifeq            99
        //    57: aload           4
        //    59: aload_0        
        //    60: getfield        android/support/v4/widget/NestedScrollView.mTempRect:Landroid/graphics/Rect;
        //    63: invokevirtual   android/view/View.getDrawingRect:(Landroid/graphics/Rect;)V
        //    66: aload_0        
        //    67: aload           4
        //    69: aload_0        
        //    70: getfield        android/support/v4/widget/NestedScrollView.mTempRect:Landroid/graphics/Rect;
        //    73: invokevirtual   android/support/v4/widget/NestedScrollView.offsetDescendantRectToMyCoords:(Landroid/view/View;Landroid/graphics/Rect;)V
        //    76: aload_0        
        //    77: aload_0        
        //    78: aload_0        
        //    79: getfield        android/support/v4/widget/NestedScrollView.mTempRect:Landroid/graphics/Rect;
        //    82: invokevirtual   android/support/v4/widget/NestedScrollView.computeScrollDeltaToGetChildRectOnScreen:(Landroid/graphics/Rect;)I
        //    85: invokespecial   android/support/v4/widget/NestedScrollView.doScrollY:(I)V
        //    88: aload           4
        //    90: iload_1        
        //    91: invokevirtual   android/view/View.requestFocus:(I)Z
        //    94: pop            
        //    95: iload_2        
        //    96: ifeq            224
        //    99: iload_1        
        //   100: bipush          33
        //   102: if_icmpne       286
        //   105: aload_0        
        //   106: invokevirtual   android/support/v4/widget/NestedScrollView.getScrollY:()I
        //   109: istore          16
        //   111: iload           16
        //   113: iload           5
        //   115: if_icmpge       286
        //   118: aload_0        
        //   119: invokevirtual   android/support/v4/widget/NestedScrollView.getScrollY:()I
        //   122: istore          6
        //   124: iload_2        
        //   125: ifeq            189
        //   128: iload_1        
        //   129: sipush          130
        //   132: if_icmpne       189
        //   135: aload_0        
        //   136: invokevirtual   android/support/v4/widget/NestedScrollView.getChildCount:()I
        //   139: istore          12
        //   141: iload           12
        //   143: ifle            189
        //   146: aload_0        
        //   147: iconst_0       
        //   148: invokevirtual   android/support/v4/widget/NestedScrollView.getChildAt:(I)Landroid/view/View;
        //   151: invokevirtual   android/view/View.getBottom:()I
        //   154: istore          13
        //   156: aload_0        
        //   157: invokevirtual   android/support/v4/widget/NestedScrollView.getScrollY:()I
        //   160: aload_0        
        //   161: invokevirtual   android/support/v4/widget/NestedScrollView.getHeight:()I
        //   164: iadd           
        //   165: aload_0        
        //   166: invokevirtual   android/support/v4/widget/NestedScrollView.getPaddingBottom:()I
        //   169: isub           
        //   170: istore          14
        //   172: iload           13
        //   174: iload           14
        //   176: isub           
        //   177: iload           5
        //   179: if_icmpge       189
        //   182: iload           13
        //   184: iload           14
        //   186: isub           
        //   187: istore          6
        //   189: iload           6
        //   191: ifne            211
        //   194: iconst_0       
        //   195: ireturn        
        //   196: astore          17
        //   198: aload           17
        //   200: athrow         
        //   201: astore          15
        //   203: aload           15
        //   205: athrow         
        //   206: astore          11
        //   208: aload           11
        //   210: athrow         
        //   211: iload_1        
        //   212: sipush          130
        //   215: if_icmpne       273
        //   218: aload_0        
        //   219: iload           6
        //   221: invokespecial   android/support/v4/widget/NestedScrollView.doScrollY:(I)V
        //   224: aload_3        
        //   225: ifnull          271
        //   228: aload_3        
        //   229: invokevirtual   android/view/View.isFocused:()Z
        //   232: ifeq            271
        //   235: aload_0        
        //   236: aload_3        
        //   237: invokespecial   android/support/v4/widget/NestedScrollView.isOffScreen:(Landroid/view/View;)Z
        //   240: istore          8
        //   242: iload           8
        //   244: ifeq            271
        //   247: aload_0        
        //   248: invokevirtual   android/support/v4/widget/NestedScrollView.getDescendantFocusability:()I
        //   251: istore          9
        //   253: aload_0        
        //   254: ldc_w           131072
        //   257: invokevirtual   android/support/v4/widget/NestedScrollView.setDescendantFocusability:(I)V
        //   260: aload_0        
        //   261: invokevirtual   android/support/v4/widget/NestedScrollView.requestFocus:()Z
        //   264: pop            
        //   265: aload_0        
        //   266: iload           9
        //   268: invokevirtual   android/support/v4/widget/NestedScrollView.setDescendantFocusability:(I)V
        //   271: iconst_1       
        //   272: ireturn        
        //   273: iload           6
        //   275: ineg           
        //   276: istore          6
        //   278: goto            218
        //   281: astore          7
        //   283: aload           7
        //   285: athrow         
        //   286: iload           5
        //   288: istore          6
        //   290: goto            128
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  38     52     196    201    Ljava/lang/IllegalStateException;
        //  105    111    201    206    Ljava/lang/IllegalStateException;
        //  135    141    206    211    Ljava/lang/IllegalStateException;
        //  228    242    281    286    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 150, Size: 150
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
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v4/widget/NestedScrollView.mScroller:Landroid/support/v4/widget/ScrollerCompat;
        //     4: invokevirtual   android/support/v4/widget/ScrollerCompat.computeScrollOffset:()Z
        //     7: ifeq            180
        //    10: aload_0        
        //    11: invokevirtual   android/support/v4/widget/NestedScrollView.getScrollX:()I
        //    14: istore_1       
        //    15: aload_0        
        //    16: invokevirtual   android/support/v4/widget/NestedScrollView.getScrollY:()I
        //    19: istore_2       
        //    20: aload_0        
        //    21: getfield        android/support/v4/widget/NestedScrollView.mScroller:Landroid/support/v4/widget/ScrollerCompat;
        //    24: invokevirtual   android/support/v4/widget/ScrollerCompat.getCurrX:()I
        //    27: istore_3       
        //    28: aload_0        
        //    29: getfield        android/support/v4/widget/NestedScrollView.mScroller:Landroid/support/v4/widget/ScrollerCompat;
        //    32: invokevirtual   android/support/v4/widget/ScrollerCompat.getCurrY:()I
        //    35: istore          4
        //    37: iload_1        
        //    38: iload_3        
        //    39: if_icmpne       48
        //    42: iload_2        
        //    43: iload           4
        //    45: if_icmpeq       180
        //    48: aload_0        
        //    49: invokespecial   android/support/v4/widget/NestedScrollView.getScrollRange:()I
        //    52: istore          5
        //    54: aload_0        
        //    55: invokestatic    android/support/v4/view/ViewCompat.getOverScrollMode:(Landroid/view/View;)I
        //    58: istore          6
        //    60: iload           6
        //    62: ifeq            76
        //    65: iload           6
        //    67: iconst_1       
        //    68: if_icmpne       181
        //    71: iload           5
        //    73: ifle            181
        //    76: iconst_1       
        //    77: istore          7
        //    79: iload_3        
        //    80: iload_1        
        //    81: isub           
        //    82: istore          8
        //    84: iload           4
        //    86: iload_2        
        //    87: isub           
        //    88: istore          9
        //    90: aload_0        
        //    91: iload           8
        //    93: iload           9
        //    95: iload_1        
        //    96: iload_2        
        //    97: iconst_0       
        //    98: iload           5
        //   100: iconst_0       
        //   101: iconst_0       
        //   102: iconst_0       
        //   103: invokevirtual   android/support/v4/widget/NestedScrollView.overScrollByCompat:(IIIIIIIIZ)Z
        //   106: pop            
        //   107: iload           7
        //   109: ifeq            180
        //   112: aload_0        
        //   113: invokespecial   android/support/v4/widget/NestedScrollView.ensureGlows:()V
        //   116: iload           4
        //   118: ifgt            151
        //   121: iload_2        
        //   122: ifle            151
        //   125: aload_0        
        //   126: getfield        android/support/v4/widget/NestedScrollView.mEdgeGlowTop:Landroid/support/v4/widget/EdgeEffectCompat;
        //   129: aload_0        
        //   130: getfield        android/support/v4/widget/NestedScrollView.mScroller:Landroid/support/v4/widget/ScrollerCompat;
        //   133: invokevirtual   android/support/v4/widget/ScrollerCompat.getCurrVelocity:()F
        //   136: f2i            
        //   137: invokevirtual   android/support/v4/widget/EdgeEffectCompat.onAbsorb:(I)Z
        //   140: pop            
        //   141: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //   144: istore          19
        //   146: iload           19
        //   148: ifeq            180
        //   151: iload           4
        //   153: iload           5
        //   155: if_icmplt       180
        //   158: iload_2        
        //   159: iload           5
        //   161: if_icmpge       180
        //   164: aload_0        
        //   165: getfield        android/support/v4/widget/NestedScrollView.mEdgeGlowBottom:Landroid/support/v4/widget/EdgeEffectCompat;
        //   168: aload_0        
        //   169: getfield        android/support/v4/widget/NestedScrollView.mScroller:Landroid/support/v4/widget/ScrollerCompat;
        //   172: invokevirtual   android/support/v4/widget/ScrollerCompat.getCurrVelocity:()F
        //   175: f2i            
        //   176: invokevirtual   android/support/v4/widget/EdgeEffectCompat.onAbsorb:(I)Z
        //   179: pop            
        //   180: return         
        //   181: iconst_0       
        //   182: istore          7
        //   184: goto            79
        //   187: astore          10
        //   189: aload           10
        //   191: athrow         
        //   192: astore          11
        //   194: aload           11
        //   196: athrow         
        //   197: astore          12
        //   199: aload           12
        //   201: athrow         
        //   202: astore          13
        //   204: aload           13
        //   206: athrow         
        //   207: astore          14
        //   209: aload           14
        //   211: athrow         
        //   212: astore          15
        //   214: aload           15
        //   216: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  90     107    187    192    Ljava/lang/IllegalStateException;
        //  112    116    192    202    Ljava/lang/IllegalStateException;
        //  125    146    202    212    Ljava/lang/IllegalStateException;
        //  164    180    212    217    Ljava/lang/IllegalStateException;
        //  189    192    192    202    Ljava/lang/IllegalStateException;
        //  194    197    197    202    Ljava/lang/IllegalStateException;
        //  199    202    202    212    Ljava/lang/IllegalStateException;
        //  204    207    207    212    Ljava/lang/IllegalStateException;
        //  209    212    212    217    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 115, Size: 115
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
    
    protected int computeScrollDeltaToGetChildRectOnScreen(final Rect p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: invokevirtual   android/support/v4/widget/NestedScrollView.getChildCount:()I
        //     8: istore          4
        //    10: iload           4
        //    12: ifne            20
        //    15: iconst_0       
        //    16: ireturn        
        //    17: astore_3       
        //    18: aload_3        
        //    19: athrow         
        //    20: aload_0        
        //    21: invokevirtual   android/support/v4/widget/NestedScrollView.getHeight:()I
        //    24: istore          5
        //    26: aload_0        
        //    27: invokevirtual   android/support/v4/widget/NestedScrollView.getScrollY:()I
        //    30: istore          6
        //    32: iload           6
        //    34: iload           5
        //    36: iadd           
        //    37: istore          7
        //    39: aload_0        
        //    40: invokevirtual   android/support/v4/widget/NestedScrollView.getVerticalFadingEdgeLength:()I
        //    43: istore          8
        //    45: aload_1        
        //    46: getfield        android/graphics/Rect.top:I
        //    49: ifle            59
        //    52: iload           6
        //    54: iload           8
        //    56: iadd           
        //    57: istore          6
        //    59: aload_1        
        //    60: getfield        android/graphics/Rect.bottom:I
        //    63: aload_0        
        //    64: iconst_0       
        //    65: invokevirtual   android/support/v4/widget/NestedScrollView.getChildAt:(I)Landroid/view/View;
        //    68: invokevirtual   android/view/View.getHeight:()I
        //    71: if_icmpge       81
        //    74: iload           7
        //    76: iload           8
        //    78: isub           
        //    79: istore          7
        //    81: aload_1        
        //    82: getfield        android/graphics/Rect.bottom:I
        //    85: istore          11
        //    87: iload           11
        //    89: iload           7
        //    91: if_icmple       276
        //    94: aload_1        
        //    95: getfield        android/graphics/Rect.top:I
        //    98: iload           6
        //   100: if_icmple       276
        //   103: aload_1        
        //   104: invokevirtual   android/graphics/Rect.height:()I
        //   107: istore          18
        //   109: iload           18
        //   111: iload           5
        //   113: if_icmple       270
        //   116: iconst_0       
        //   117: aload_1        
        //   118: getfield        android/graphics/Rect.top:I
        //   121: iload           6
        //   123: isub           
        //   124: iadd           
        //   125: istore          19
        //   127: iload_2        
        //   128: ifeq            143
        //   131: iload           19
        //   133: aload_1        
        //   134: getfield        android/graphics/Rect.bottom:I
        //   137: iload           7
        //   139: isub           
        //   140: iadd           
        //   141: istore          19
        //   143: iload           19
        //   145: aload_0        
        //   146: iconst_0       
        //   147: invokevirtual   android/support/v4/widget/NestedScrollView.getChildAt:(I)Landroid/view/View;
        //   150: invokevirtual   android/view/View.getBottom:()I
        //   153: iload           7
        //   155: isub           
        //   156: invokestatic    java/lang/Math.min:(II)I
        //   159: istore          12
        //   161: iload_2        
        //   162: ifeq            240
        //   165: aload_1        
        //   166: getfield        android/graphics/Rect.top:I
        //   169: istore          15
        //   171: iload           15
        //   173: iload           6
        //   175: if_icmpge       240
        //   178: aload_1        
        //   179: getfield        android/graphics/Rect.bottom:I
        //   182: iload           7
        //   184: if_icmpge       240
        //   187: aload_1        
        //   188: invokevirtual   android/graphics/Rect.height:()I
        //   191: istore          16
        //   193: iload           16
        //   195: iload           5
        //   197: if_icmple       263
        //   200: iload           12
        //   202: iload           7
        //   204: aload_1        
        //   205: getfield        android/graphics/Rect.bottom:I
        //   208: isub           
        //   209: isub           
        //   210: istore          17
        //   212: iload_2        
        //   213: ifeq            228
        //   216: iload           17
        //   218: iload           6
        //   220: aload_1        
        //   221: getfield        android/graphics/Rect.top:I
        //   224: isub           
        //   225: isub           
        //   226: istore          17
        //   228: iload           17
        //   230: aload_0        
        //   231: invokevirtual   android/support/v4/widget/NestedScrollView.getScrollY:()I
        //   234: ineg           
        //   235: invokestatic    java/lang/Math.max:(II)I
        //   238: istore          12
        //   240: iload           12
        //   242: ireturn        
        //   243: astore          9
        //   245: aload           9
        //   247: athrow         
        //   248: astore          10
        //   250: aload           10
        //   252: athrow         
        //   253: astore          13
        //   255: aload           13
        //   257: athrow         
        //   258: astore          14
        //   260: aload           14
        //   262: athrow         
        //   263: iload           12
        //   265: istore          17
        //   267: goto            216
        //   270: iconst_0       
        //   271: istore          19
        //   273: goto            131
        //   276: iconst_0       
        //   277: istore          12
        //   279: goto            165
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      10     17     20     Ljava/lang/IllegalStateException;
        //  81     87     243    248    Ljava/lang/IllegalStateException;
        //  94     109    248    253    Ljava/lang/IllegalStateException;
        //  165    171    253    258    Ljava/lang/IllegalStateException;
        //  178    193    258    263    Ljava/lang/IllegalStateException;
        //  245    248    248    253    Ljava/lang/IllegalStateException;
        //  255    258    258    263    Ljava/lang/IllegalStateException;
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
    
    protected int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }
    
    protected int computeVerticalScrollRange() {
        final int childCount = this.getChildCount();
        int n = this.getHeight() - this.getPaddingBottom() - this.getPaddingTop();
        if (childCount != 0) {
            final int bottom = this.getChildAt(0).getBottom();
            final int scrollY = this.getScrollY();
            final int max = Math.max(0, bottom - n);
            while (true) {
                Label_0090: {
                    if (scrollY >= 0) {
                        break Label_0090;
                    }
                    n = bottom - scrollY;
                    try {
                        if (!SlidingPaneLayout.a) {
                            return n;
                        }
                        if (scrollY > max) {
                            return n + (scrollY - max);
                        }
                        return n;
                    }
                    catch (IllegalStateException ex) {
                        throw ex;
                    }
                }
                n = bottom;
                continue;
            }
        }
        return n;
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        try {
            if (super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            final NestedScrollView nestedScrollView = this;
            final KeyEvent keyEvent2 = keyEvent;
            final boolean b = nestedScrollView.executeKeyEvent(keyEvent2);
            if (b) {
                return true;
            }
            return false;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            final NestedScrollView nestedScrollView = this;
            final KeyEvent keyEvent2 = keyEvent;
            final boolean b = nestedScrollView.executeKeyEvent(keyEvent2);
            if (b) {
                return true;
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
        return false;
    }
    
    public boolean dispatchNestedFling(final float n, final float n2, final boolean b) {
        return this.mChildHelper.dispatchNestedFling(n, n2, b);
    }
    
    public boolean dispatchNestedPreFling(final float n, final float n2) {
        return this.mChildHelper.dispatchNestedPreFling(n, n2);
    }
    
    public boolean dispatchNestedPreScroll(final int n, final int n2, final int[] array, final int[] array2) {
        return this.mChildHelper.dispatchNestedPreScroll(n, n2, array, array2);
    }
    
    public boolean dispatchNestedScroll(final int n, final int n2, final int n3, final int n4, final int[] array) {
        return this.mChildHelper.dispatchNestedScroll(n, n2, n3, n4, array);
    }
    
    public void draw(final Canvas p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: invokespecial   android/widget/FrameLayout.draw:(Landroid/graphics/Canvas;)V
        //     5: aload_0        
        //     6: getfield        android/support/v4/widget/NestedScrollView.mEdgeGlowTop:Landroid/support/v4/widget/EdgeEffectCompat;
        //     9: ifnull          206
        //    12: aload_0        
        //    13: invokevirtual   android/support/v4/widget/NestedScrollView.getScrollY:()I
        //    16: istore_2       
        //    17: aload_0        
        //    18: getfield        android/support/v4/widget/NestedScrollView.mEdgeGlowTop:Landroid/support/v4/widget/EdgeEffectCompat;
        //    21: invokevirtual   android/support/v4/widget/EdgeEffectCompat.isFinished:()Z
        //    24: ifne            98
        //    27: aload_1        
        //    28: invokevirtual   android/graphics/Canvas.save:()I
        //    31: istore          8
        //    33: aload_0        
        //    34: invokevirtual   android/support/v4/widget/NestedScrollView.getWidth:()I
        //    37: aload_0        
        //    38: invokevirtual   android/support/v4/widget/NestedScrollView.getPaddingLeft:()I
        //    41: isub           
        //    42: aload_0        
        //    43: invokevirtual   android/support/v4/widget/NestedScrollView.getPaddingRight:()I
        //    46: isub           
        //    47: istore          9
        //    49: aload_1        
        //    50: aload_0        
        //    51: invokevirtual   android/support/v4/widget/NestedScrollView.getPaddingLeft:()I
        //    54: i2f            
        //    55: iconst_0       
        //    56: iload_2        
        //    57: invokestatic    java/lang/Math.min:(II)I
        //    60: i2f            
        //    61: invokevirtual   android/graphics/Canvas.translate:(FF)V
        //    64: aload_0        
        //    65: getfield        android/support/v4/widget/NestedScrollView.mEdgeGlowTop:Landroid/support/v4/widget/EdgeEffectCompat;
        //    68: iload           9
        //    70: aload_0        
        //    71: invokevirtual   android/support/v4/widget/NestedScrollView.getHeight:()I
        //    74: invokevirtual   android/support/v4/widget/EdgeEffectCompat.setSize:(II)V
        //    77: aload_0        
        //    78: getfield        android/support/v4/widget/NestedScrollView.mEdgeGlowTop:Landroid/support/v4/widget/EdgeEffectCompat;
        //    81: aload_1        
        //    82: invokevirtual   android/support/v4/widget/EdgeEffectCompat.draw:(Landroid/graphics/Canvas;)Z
        //    85: ifeq            92
        //    88: aload_0        
        //    89: invokestatic    android/support/v4/view/ViewCompat.postInvalidateOnAnimation:(Landroid/view/View;)V
        //    92: aload_1        
        //    93: iload           8
        //    95: invokevirtual   android/graphics/Canvas.restoreToCount:(I)V
        //    98: aload_0        
        //    99: getfield        android/support/v4/widget/NestedScrollView.mEdgeGlowBottom:Landroid/support/v4/widget/EdgeEffectCompat;
        //   102: invokevirtual   android/support/v4/widget/EdgeEffectCompat.isFinished:()Z
        //   105: ifne            206
        //   108: aload_1        
        //   109: invokevirtual   android/graphics/Canvas.save:()I
        //   112: istore_3       
        //   113: aload_0        
        //   114: invokevirtual   android/support/v4/widget/NestedScrollView.getWidth:()I
        //   117: aload_0        
        //   118: invokevirtual   android/support/v4/widget/NestedScrollView.getPaddingLeft:()I
        //   121: isub           
        //   122: aload_0        
        //   123: invokevirtual   android/support/v4/widget/NestedScrollView.getPaddingRight:()I
        //   126: isub           
        //   127: istore          4
        //   129: aload_0        
        //   130: invokevirtual   android/support/v4/widget/NestedScrollView.getHeight:()I
        //   133: istore          5
        //   135: iload           4
        //   137: ineg           
        //   138: istore          6
        //   140: aload_1        
        //   141: iload           6
        //   143: aload_0        
        //   144: invokevirtual   android/support/v4/widget/NestedScrollView.getPaddingLeft:()I
        //   147: iadd           
        //   148: i2f            
        //   149: iload           5
        //   151: aload_0        
        //   152: invokespecial   android/support/v4/widget/NestedScrollView.getScrollRange:()I
        //   155: iload_2        
        //   156: invokestatic    java/lang/Math.max:(II)I
        //   159: iadd           
        //   160: i2f            
        //   161: invokevirtual   android/graphics/Canvas.translate:(FF)V
        //   164: aload_1        
        //   165: ldc_w           180.0
        //   168: iload           4
        //   170: i2f            
        //   171: fconst_0       
        //   172: invokevirtual   android/graphics/Canvas.rotate:(FFF)V
        //   175: aload_0        
        //   176: getfield        android/support/v4/widget/NestedScrollView.mEdgeGlowBottom:Landroid/support/v4/widget/EdgeEffectCompat;
        //   179: iload           4
        //   181: iload           5
        //   183: invokevirtual   android/support/v4/widget/EdgeEffectCompat.setSize:(II)V
        //   186: aload_0        
        //   187: getfield        android/support/v4/widget/NestedScrollView.mEdgeGlowBottom:Landroid/support/v4/widget/EdgeEffectCompat;
        //   190: aload_1        
        //   191: invokevirtual   android/support/v4/widget/EdgeEffectCompat.draw:(Landroid/graphics/Canvas;)Z
        //   194: ifeq            201
        //   197: aload_0        
        //   198: invokestatic    android/support/v4/view/ViewCompat.postInvalidateOnAnimation:(Landroid/view/View;)V
        //   201: aload_1        
        //   202: iload_3        
        //   203: invokevirtual   android/graphics/Canvas.restoreToCount:(I)V
        //   206: return         
        //   207: astore          10
        //   209: aload           10
        //   211: athrow         
        //   212: astore          7
        //   214: aload           7
        //   216: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  49     92     207    212    Ljava/lang/IllegalStateException;
        //  140    201    212    217    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0201:
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
    
    public boolean executeKeyEvent(final KeyEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: bipush          33
        //     2: istore_2       
        //     3: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //     6: istore_3       
        //     7: aload_0        
        //     8: getfield        android/support/v4/widget/NestedScrollView.mTempRect:Landroid/graphics/Rect;
        //    11: invokevirtual   android/graphics/Rect.setEmpty:()V
        //    14: aload_0        
        //    15: invokespecial   android/support/v4/widget/NestedScrollView.canScroll:()Z
        //    18: istore          6
        //    20: iload           6
        //    22: ifne            140
        //    25: aload_0        
        //    26: invokevirtual   android/support/v4/widget/NestedScrollView.isFocused:()Z
        //    29: istore          18
        //    31: iconst_0       
        //    32: istore          10
        //    34: iload           18
        //    36: ifeq            116
        //    39: aload_1        
        //    40: invokevirtual   android/view/KeyEvent.getKeyCode:()I
        //    43: istore          19
        //    45: iconst_0       
        //    46: istore          10
        //    48: iload           19
        //    50: iconst_4       
        //    51: if_icmpeq       116
        //    54: aload_0        
        //    55: invokevirtual   android/support/v4/widget/NestedScrollView.findFocus:()Landroid/view/View;
        //    58: astore          20
        //    60: aload           20
        //    62: aload_0        
        //    63: if_acmpne       69
        //    66: aconst_null    
        //    67: astore          20
        //    69: invokestatic    android/view/FocusFinder.getInstance:()Landroid/view/FocusFinder;
        //    72: aload_0        
        //    73: aload           20
        //    75: sipush          130
        //    78: invokevirtual   android/view/FocusFinder.findNextFocus:(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
        //    81: astore          21
        //    83: aload           21
        //    85: ifnull          134
        //    88: aload           21
        //    90: aload_0        
        //    91: if_acmpeq       134
        //    94: aload           21
        //    96: sipush          130
        //    99: invokevirtual   android/view/View.requestFocus:(I)Z
        //   102: istore          24
        //   104: iload           24
        //   106: ifeq            134
        //   109: iconst_1       
        //   110: istore          22
        //   112: iload           22
        //   114: istore          10
        //   116: iload           10
        //   118: ireturn        
        //   119: astore          4
        //   121: aload           4
        //   123: athrow         
        //   124: astore          5
        //   126: aload           5
        //   128: athrow         
        //   129: astore          23
        //   131: aload           23
        //   133: athrow         
        //   134: iconst_0       
        //   135: istore          22
        //   137: goto            112
        //   140: aload_1        
        //   141: invokevirtual   android/view/KeyEvent.getAction:()I
        //   144: istore          9
        //   146: iconst_0       
        //   147: istore          10
        //   149: iload           9
        //   151: ifne            116
        //   154: aload_1        
        //   155: invokevirtual   android/view/KeyEvent.getKeyCode:()I
        //   158: istore          11
        //   160: iconst_0       
        //   161: istore          10
        //   163: iload           11
        //   165: lookupswitch {
        //               19: 200
        //               20: 233
        //               62: 270
        //          default: 317
        //        }
        //   200: aload_1        
        //   201: invokevirtual   android/view/KeyEvent.isAltPressed:()Z
        //   204: istore          17
        //   206: iload           17
        //   208: ifne            222
        //   211: aload_0        
        //   212: iload_2        
        //   213: invokevirtual   android/support/v4/widget/NestedScrollView.arrowScroll:(I)Z
        //   216: istore          10
        //   218: iload_3        
        //   219: ifeq            116
        //   222: aload_0        
        //   223: iload_2        
        //   224: invokevirtual   android/support/v4/widget/NestedScrollView.fullScroll:(I)Z
        //   227: istore          10
        //   229: iload_3        
        //   230: ifeq            116
        //   233: aload_1        
        //   234: invokevirtual   android/view/KeyEvent.isAltPressed:()Z
        //   237: istore          16
        //   239: iload           16
        //   241: ifne            257
        //   244: aload_0        
        //   245: sipush          130
        //   248: invokevirtual   android/support/v4/widget/NestedScrollView.arrowScroll:(I)Z
        //   251: istore          10
        //   253: iload_3        
        //   254: ifeq            116
        //   257: aload_0        
        //   258: sipush          130
        //   261: invokevirtual   android/support/v4/widget/NestedScrollView.fullScroll:(I)Z
        //   264: istore          10
        //   266: iload_3        
        //   267: ifeq            116
        //   270: aload_1        
        //   271: invokevirtual   android/view/KeyEvent.isShiftPressed:()Z
        //   274: istore          13
        //   276: iload           13
        //   278: ifeq            310
        //   281: aload_0        
        //   282: iload_2        
        //   283: invokevirtual   android/support/v4/widget/NestedScrollView.pageScroll:(I)Z
        //   286: pop            
        //   287: iload           10
        //   289: ireturn        
        //   290: astore          7
        //   292: aload           7
        //   294: athrow         
        //   295: astore          8
        //   297: aload           8
        //   299: athrow         
        //   300: astore          15
        //   302: aload           15
        //   304: athrow         
        //   305: astore          12
        //   307: aload           12
        //   309: athrow         
        //   310: sipush          130
        //   313: istore_2       
        //   314: goto            281
        //   317: iconst_0       
        //   318: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  7      20     119    124    Ljava/lang/IllegalStateException;
        //  25     31     124    129    Ljava/lang/IllegalStateException;
        //  39     45     124    129    Ljava/lang/IllegalStateException;
        //  94     104    129    134    Ljava/lang/IllegalStateException;
        //  121    124    124    129    Ljava/lang/IllegalStateException;
        //  140    146    290    295    Ljava/lang/IllegalStateException;
        //  154    160    295    300    Ljava/lang/IllegalStateException;
        //  200    206    295    300    Ljava/lang/IllegalStateException;
        //  233    239    300    305    Ljava/lang/IllegalStateException;
        //  270    276    305    310    Ljava/lang/IllegalStateException;
        //  292    295    295    300    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 146, Size: 146
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
    
    public void fling(final int n) {
        if (this.getChildCount() > 0) {
            final int n2 = this.getHeight() - this.getPaddingBottom() - this.getPaddingTop();
            this.mScroller.fling(this.getScrollX(), this.getScrollY(), 0, n, 0, 0, 0, Math.max(0, this.getChildAt(0).getHeight() - n2), 0, n2 / 2);
            ViewCompat.postInvalidateOnAnimation((View)this);
        }
    }
    
    public boolean fullScroll(final int n) {
        int n2;
        if (n == 130) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final int height = this.getHeight();
        this.mTempRect.top = 0;
        this.mTempRect.bottom = height;
        if (n2 != 0) {
            final int childCount = this.getChildCount();
            if (childCount > 0) {
                this.mTempRect.bottom = this.getChildAt(childCount - 1).getBottom() + this.getPaddingBottom();
                this.mTempRect.top = this.mTempRect.bottom - height;
            }
        }
        return this.scrollAndFocus(n, this.mTempRect.top, this.mTempRect.bottom);
    }
    
    protected float getBottomFadingEdgeStrength() {
        try {
            if (this.getChildCount() == 0) {
                return 0.0f;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        final int verticalFadingEdgeLength = this.getVerticalFadingEdgeLength();
        final int n = this.getChildAt(0).getBottom() - this.getScrollY() - (this.getHeight() - this.getPaddingBottom());
        if (n < verticalFadingEdgeLength) {
            return n / verticalFadingEdgeLength;
        }
        return 1.0f;
    }
    
    public int getMaxScrollAmount() {
        return (int)(0.5f * this.getHeight());
    }
    
    public int getNestedScrollAxes() {
        return this.mParentHelper.getNestedScrollAxes();
    }
    
    protected float getTopFadingEdgeStrength() {
        try {
            if (this.getChildCount() == 0) {
                return 0.0f;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        final int verticalFadingEdgeLength = this.getVerticalFadingEdgeLength();
        final int scrollY = this.getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }
    
    public boolean hasNestedScrollingParent() {
        return this.mChildHelper.hasNestedScrollingParent();
    }
    
    public boolean isNestedScrollingEnabled() {
        return this.mChildHelper.isNestedScrollingEnabled();
    }
    
    protected void measureChild(final View view, final int n, final int n2) {
        view.measure(getChildMeasureSpec(n, this.getPaddingLeft() + this.getPaddingRight(), view.getLayoutParams().width), View$MeasureSpec.makeMeasureSpec(0, 0));
    }
    
    protected void measureChildWithMargins(final View view, final int n, final int n2, final int n3, final int n4) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        view.measure(getChildMeasureSpec(n, n2 + (this.getPaddingLeft() + this.getPaddingRight() + viewGroup$MarginLayoutParams.leftMargin + viewGroup$MarginLayoutParams.rightMargin), viewGroup$MarginLayoutParams.width), View$MeasureSpec.makeMeasureSpec(viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin, 0));
    }
    
    public void onAttachedToWindow() {
        this.mIsLaidOut = false;
    }
    
    public boolean onGenericMotionEvent(final MotionEvent motionEvent) {
        Label_0042: {
            try {
                if ((MotionEventCompat.getSource(motionEvent) & 0x2) == 0x0) {
                    return false;
                }
                final MotionEvent motionEvent2 = motionEvent;
                final int n = motionEvent2.getAction();
                switch (n) {
                    case 8: {
                        break Label_0042;
                    }
                    default: {
                        return false;
                    }
                }
            }
            catch (IllegalStateException ex) {
                try {
                    throw ex;
                }
                catch (IllegalStateException ex2) {
                    throw ex2;
                }
            }
            try {
                final MotionEvent motionEvent2 = motionEvent;
                final int n = motionEvent2.getAction();
                switch (n) {
                    case 8: {
                        break;
                    }
                    default: {
                        return false;
                    }
                }
            }
            catch (IllegalStateException ex5) {}
        }
        if (!this.mIsBeingDragged) {
            final float axisValue = MotionEventCompat.getAxisValue(motionEvent, 9);
            if (axisValue != 0.0f) {
                final int n2 = (int)(axisValue * this.getVerticalScrollFactorCompat());
                int scrollRange = this.getScrollRange();
                final int scrollY = this.getScrollY();
                int n3 = scrollY - n2;
                Label_0115: {
                    if (n3 >= 0) {
                        break Label_0115;
                    }
                    while (true) {
                        while (true) {
                            Label_0158: {
                                Label_0151: {
                                    try {
                                        if (!SlidingPaneLayout.a) {
                                            break Label_0158;
                                        }
                                        n3 = 0;
                                        if (n3 <= scrollRange) {
                                            break Label_0151;
                                        }
                                        if (scrollRange != scrollY) {
                                            final NestedScrollView nestedScrollView = this;
                                            final NestedScrollView nestedScrollView2 = this;
                                            final int n4 = nestedScrollView2.getScrollX();
                                            final int n5 = scrollRange;
                                            nestedScrollView.scrollTo(n4, n5);
                                            return true;
                                        }
                                        break;
                                    }
                                    catch (IllegalStateException ex3) {
                                        throw ex3;
                                    }
                                    try {
                                        final NestedScrollView nestedScrollView = this;
                                        final NestedScrollView nestedScrollView2 = this;
                                        final int n4 = nestedScrollView2.getScrollX();
                                        final int n5 = scrollRange;
                                        nestedScrollView.scrollTo(n4, n5);
                                        return true;
                                    }
                                    catch (IllegalStateException ex4) {
                                        throw ex4;
                                    }
                                }
                                scrollRange = n3;
                                continue;
                            }
                            scrollRange = 0;
                            continue;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //     5: istore_3       
        //     6: aload_1        
        //     7: invokevirtual   android/view/MotionEvent.getAction:()I
        //    10: istore          4
        //    12: iload           4
        //    14: iconst_2       
        //    15: if_icmpne       36
        //    18: aload_0        
        //    19: getfield        android/support/v4/widget/NestedScrollView.mIsBeingDragged:Z
        //    22: istore          28
        //    24: iload           28
        //    26: ifeq            36
        //    29: iload_2        
        //    30: ireturn        
        //    31: astore          27
        //    33: aload           27
        //    35: athrow         
        //    36: aload_0        
        //    37: invokevirtual   android/support/v4/widget/NestedScrollView.getScrollY:()I
        //    40: istore          7
        //    42: iload           7
        //    44: ifne            67
        //    47: aload_0        
        //    48: iconst_1       
        //    49: invokestatic    android/support/v4/view/ViewCompat.canScrollVertically:(Landroid/view/View;I)Z
        //    52: ifne            67
        //    55: iconst_0       
        //    56: ireturn        
        //    57: astore          5
        //    59: aload           5
        //    61: athrow         
        //    62: astore          6
        //    64: aload           6
        //    66: athrow         
        //    67: iload           4
        //    69: sipush          255
        //    72: iand           
        //    73: tableswitch {
        //                0: 292
        //                1: 386
        //                2: 121
        //                3: 386
        //                4: 116
        //                5: 116
        //                6: 408
        //          default: 116
        //        }
        //   116: aload_0        
        //   117: getfield        android/support/v4/widget/NestedScrollView.mIsBeingDragged:Z
        //   120: ireturn        
        //   121: aload_0        
        //   122: getfield        android/support/v4/widget/NestedScrollView.mActivePointerId:I
        //   125: istore          17
        //   127: iload           17
        //   129: iconst_m1      
        //   130: if_icmpne       137
        //   133: iload_3        
        //   134: ifeq            116
        //   137: aload_1        
        //   138: iload           17
        //   140: invokestatic    android/support/v4/view/MotionEventCompat.findPointerIndex:(Landroid/view/MotionEvent;I)I
        //   143: istore          18
        //   145: iload           18
        //   147: iconst_m1      
        //   148: if_icmpne       198
        //   151: getstatic       android/support/v4/widget/NestedScrollView.z:[Ljava/lang/String;
        //   154: bipush          9
        //   156: aaload         
        //   157: new             Ljava/lang/StringBuilder;
        //   160: dup            
        //   161: invokespecial   java/lang/StringBuilder.<init>:()V
        //   164: getstatic       android/support/v4/widget/NestedScrollView.z:[Ljava/lang/String;
        //   167: bipush          7
        //   169: aaload         
        //   170: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   173: iload           17
        //   175: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   178: getstatic       android/support/v4/widget/NestedScrollView.z:[Ljava/lang/String;
        //   181: bipush          8
        //   183: aaload         
        //   184: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   187: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   190: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   193: pop            
        //   194: iload_3        
        //   195: ifeq            116
        //   198: aload_1        
        //   199: iload           18
        //   201: invokestatic    android/support/v4/view/MotionEventCompat.getY:(Landroid/view/MotionEvent;I)F
        //   204: f2i            
        //   205: istore          19
        //   207: iload           19
        //   209: aload_0        
        //   210: getfield        android/support/v4/widget/NestedScrollView.mLastMotionY:I
        //   213: isub           
        //   214: invokestatic    java/lang/Math.abs:(I)I
        //   217: istore          20
        //   219: iload           20
        //   221: aload_0        
        //   222: getfield        android/support/v4/widget/NestedScrollView.mTouchSlop:I
        //   225: if_icmple       116
        //   228: aload_0        
        //   229: invokevirtual   android/support/v4/widget/NestedScrollView.getNestedScrollAxes:()I
        //   232: istore          22
        //   234: iload           22
        //   236: iconst_2       
        //   237: iand           
        //   238: ifne            116
        //   241: aload_0        
        //   242: iload_2        
        //   243: putfield        android/support/v4/widget/NestedScrollView.mIsBeingDragged:Z
        //   246: aload_0        
        //   247: iload           19
        //   249: putfield        android/support/v4/widget/NestedScrollView.mLastMotionY:I
        //   252: aload_0        
        //   253: invokespecial   android/support/v4/widget/NestedScrollView.initVelocityTrackerIfNotExists:()V
        //   256: aload_0        
        //   257: getfield        android/support/v4/widget/NestedScrollView.mVelocityTracker:Landroid/view/VelocityTracker;
        //   260: aload_1        
        //   261: invokevirtual   android/view/VelocityTracker.addMovement:(Landroid/view/MotionEvent;)V
        //   264: aload_0        
        //   265: iconst_0       
        //   266: putfield        android/support/v4/widget/NestedScrollView.mNestedYOffset:I
        //   269: aload_0        
        //   270: invokevirtual   android/support/v4/widget/NestedScrollView.getParent:()Landroid/view/ViewParent;
        //   273: astore          23
        //   275: aload           23
        //   277: ifnull          288
        //   280: aload           23
        //   282: iconst_1       
        //   283: invokeinterface android/view/ViewParent.requestDisallowInterceptTouchEvent:(Z)V
        //   288: iload_3        
        //   289: ifeq            116
        //   292: aload_1        
        //   293: invokevirtual   android/view/MotionEvent.getY:()F
        //   296: f2i            
        //   297: istore          9
        //   299: aload_0        
        //   300: aload_1        
        //   301: invokevirtual   android/view/MotionEvent.getX:()F
        //   304: f2i            
        //   305: iload           9
        //   307: invokespecial   android/support/v4/widget/NestedScrollView.inChild:(II)Z
        //   310: istore          13
        //   312: iload           13
        //   314: ifne            330
        //   317: aload_0        
        //   318: iconst_0       
        //   319: putfield        android/support/v4/widget/NestedScrollView.mIsBeingDragged:Z
        //   322: aload_0        
        //   323: invokespecial   android/support/v4/widget/NestedScrollView.recycleVelocityTracker:()V
        //   326: iload_3        
        //   327: ifeq            116
        //   330: aload_0        
        //   331: iload           9
        //   333: putfield        android/support/v4/widget/NestedScrollView.mLastMotionY:I
        //   336: aload_0        
        //   337: aload_1        
        //   338: iconst_0       
        //   339: invokestatic    android/support/v4/view/MotionEventCompat.getPointerId:(Landroid/view/MotionEvent;I)I
        //   342: putfield        android/support/v4/widget/NestedScrollView.mActivePointerId:I
        //   345: aload_0        
        //   346: invokespecial   android/support/v4/widget/NestedScrollView.initOrResetVelocityTracker:()V
        //   349: aload_0        
        //   350: getfield        android/support/v4/widget/NestedScrollView.mVelocityTracker:Landroid/view/VelocityTracker;
        //   353: aload_1        
        //   354: invokevirtual   android/view/VelocityTracker.addMovement:(Landroid/view/MotionEvent;)V
        //   357: aload_0        
        //   358: getfield        android/support/v4/widget/NestedScrollView.mScroller:Landroid/support/v4/widget/ScrollerCompat;
        //   361: invokevirtual   android/support/v4/widget/ScrollerCompat.isFinished:()Z
        //   364: istore          14
        //   366: iload           14
        //   368: ifne            451
        //   371: aload_0        
        //   372: iload_2        
        //   373: putfield        android/support/v4/widget/NestedScrollView.mIsBeingDragged:Z
        //   376: aload_0        
        //   377: iconst_2       
        //   378: invokevirtual   android/support/v4/widget/NestedScrollView.startNestedScroll:(I)Z
        //   381: pop            
        //   382: iload_3        
        //   383: ifeq            116
        //   386: aload_0        
        //   387: iconst_0       
        //   388: putfield        android/support/v4/widget/NestedScrollView.mIsBeingDragged:Z
        //   391: aload_0        
        //   392: iconst_m1      
        //   393: putfield        android/support/v4/widget/NestedScrollView.mActivePointerId:I
        //   396: aload_0        
        //   397: invokespecial   android/support/v4/widget/NestedScrollView.recycleVelocityTracker:()V
        //   400: aload_0        
        //   401: invokevirtual   android/support/v4/widget/NestedScrollView.stopNestedScroll:()V
        //   404: iload_3        
        //   405: ifeq            116
        //   408: aload_0        
        //   409: aload_1        
        //   410: invokespecial   android/support/v4/widget/NestedScrollView.onSecondaryPointerUp:(Landroid/view/MotionEvent;)V
        //   413: goto            116
        //   416: astore          8
        //   418: aload           8
        //   420: athrow         
        //   421: astore          25
        //   423: aload           25
        //   425: athrow         
        //   426: astore          21
        //   428: aload           21
        //   430: athrow         
        //   431: astore          24
        //   433: aload           24
        //   435: athrow         
        //   436: astore          10
        //   438: aload           10
        //   440: athrow         
        //   441: astore          11
        //   443: aload           11
        //   445: athrow         
        //   446: astore          12
        //   448: aload           12
        //   450: athrow         
        //   451: iconst_0       
        //   452: istore_2       
        //   453: goto            371
        //   456: astore          15
        //   458: aload           15
        //   460: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  18     24     31     36     Ljava/lang/IllegalStateException;
        //  36     42     57     62     Ljava/lang/IllegalStateException;
        //  47     55     62     67     Ljava/lang/IllegalStateException;
        //  59     62     62     67     Ljava/lang/IllegalStateException;
        //  151    194    421    426    Ljava/lang/IllegalStateException;
        //  219    234    426    431    Ljava/lang/IllegalStateException;
        //  280    288    431    436    Ljava/lang/IllegalStateException;
        //  299    312    436    441    Ljava/lang/IllegalStateException;
        //  317    326    441    446    Ljava/lang/IllegalStateException;
        //  330    366    446    451    Ljava/lang/IllegalStateException;
        //  371    382    456    461    Ljava/lang/IllegalStateException;
        //  386    404    416    421    Ljava/lang/IllegalStateException;
        //  408    413    416    421    Ljava/lang/IllegalStateException;
        //  438    441    441    446    Ljava/lang/IllegalStateException;
        //  443    446    446    451    Ljava/lang/IllegalStateException;
        //  458    461    416    421    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 219, Size: 219
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
    
    protected void onLayout(final boolean p0, final int p1, final int p2, final int p3, final int p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: iload_1        
        //     2: iload_2        
        //     3: iload_3        
        //     4: iload           4
        //     6: iload           5
        //     8: invokespecial   android/widget/FrameLayout.onLayout:(ZIIII)V
        //    11: aload_0        
        //    12: iconst_0       
        //    13: putfield        android/support/v4/widget/NestedScrollView.mIsLayoutDirty:Z
        //    16: aload_0        
        //    17: getfield        android/support/v4/widget/NestedScrollView.mChildToScrollTo:Landroid/view/View;
        //    20: astore          8
        //    22: aload           8
        //    24: ifnull          46
        //    27: aload_0        
        //    28: getfield        android/support/v4/widget/NestedScrollView.mChildToScrollTo:Landroid/view/View;
        //    31: aload_0        
        //    32: invokestatic    android/support/v4/widget/NestedScrollView.isViewDescendantOf:(Landroid/view/View;Landroid/view/View;)Z
        //    35: ifeq            46
        //    38: aload_0        
        //    39: aload_0        
        //    40: getfield        android/support/v4/widget/NestedScrollView.mChildToScrollTo:Landroid/view/View;
        //    43: invokespecial   android/support/v4/widget/NestedScrollView.scrollToChild:(Landroid/view/View;)V
        //    46: aload_0        
        //    47: aconst_null    
        //    48: putfield        android/support/v4/widget/NestedScrollView.mChildToScrollTo:Landroid/view/View;
        //    51: aload_0        
        //    52: getfield        android/support/v4/widget/NestedScrollView.mIsLaidOut:Z
        //    55: istore          11
        //    57: iload           11
        //    59: ifne            182
        //    62: aload_0        
        //    63: getfield        android/support/v4/widget/NestedScrollView.mSavedState:Landroid/support/v4/widget/NestedScrollView$SavedState;
        //    66: ifnull          89
        //    69: aload_0        
        //    70: aload_0        
        //    71: invokevirtual   android/support/v4/widget/NestedScrollView.getScrollX:()I
        //    74: aload_0        
        //    75: getfield        android/support/v4/widget/NestedScrollView.mSavedState:Landroid/support/v4/widget/NestedScrollView$SavedState;
        //    78: getfield        android/support/v4/widget/NestedScrollView$SavedState.scrollPosition:I
        //    81: invokevirtual   android/support/v4/widget/NestedScrollView.scrollTo:(II)V
        //    84: aload_0        
        //    85: aconst_null    
        //    86: putfield        android/support/v4/widget/NestedScrollView.mSavedState:Landroid/support/v4/widget/NestedScrollView$SavedState;
        //    89: aload_0        
        //    90: invokevirtual   android/support/v4/widget/NestedScrollView.getChildCount:()I
        //    93: ifle            225
        //    96: aload_0        
        //    97: iconst_0       
        //    98: invokevirtual   android/support/v4/widget/NestedScrollView.getChildAt:(I)Landroid/view/View;
        //   101: invokevirtual   android/view/View.getMeasuredHeight:()I
        //   104: istore          20
        //   106: iload           20
        //   108: istore          13
        //   110: iconst_0       
        //   111: iload           13
        //   113: iload           5
        //   115: iload_3        
        //   116: isub           
        //   117: aload_0        
        //   118: invokevirtual   android/support/v4/widget/NestedScrollView.getPaddingBottom:()I
        //   121: isub           
        //   122: aload_0        
        //   123: invokevirtual   android/support/v4/widget/NestedScrollView.getPaddingTop:()I
        //   126: isub           
        //   127: isub           
        //   128: invokestatic    java/lang/Math.max:(II)I
        //   131: istore          14
        //   133: aload_0        
        //   134: invokevirtual   android/support/v4/widget/NestedScrollView.getScrollY:()I
        //   137: istore          18
        //   139: iload           18
        //   141: iload           14
        //   143: if_icmple       166
        //   146: aload_0        
        //   147: aload_0        
        //   148: invokevirtual   android/support/v4/widget/NestedScrollView.getScrollX:()I
        //   151: iload           14
        //   153: invokevirtual   android/support/v4/widget/NestedScrollView.scrollTo:(II)V
        //   156: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //   159: istore          19
        //   161: iload           19
        //   163: ifeq            182
        //   166: aload_0        
        //   167: invokevirtual   android/support/v4/widget/NestedScrollView.getScrollY:()I
        //   170: ifge            182
        //   173: aload_0        
        //   174: aload_0        
        //   175: invokevirtual   android/support/v4/widget/NestedScrollView.getScrollX:()I
        //   178: iconst_0       
        //   179: invokevirtual   android/support/v4/widget/NestedScrollView.scrollTo:(II)V
        //   182: aload_0        
        //   183: aload_0        
        //   184: invokevirtual   android/support/v4/widget/NestedScrollView.getScrollX:()I
        //   187: aload_0        
        //   188: invokevirtual   android/support/v4/widget/NestedScrollView.getScrollY:()I
        //   191: invokevirtual   android/support/v4/widget/NestedScrollView.scrollTo:(II)V
        //   194: aload_0        
        //   195: iconst_1       
        //   196: putfield        android/support/v4/widget/NestedScrollView.mIsLaidOut:Z
        //   199: return         
        //   200: astore          6
        //   202: aload           6
        //   204: athrow         
        //   205: astore          7
        //   207: aload           7
        //   209: athrow         
        //   210: astore          9
        //   212: aload           9
        //   214: athrow         
        //   215: astore          10
        //   217: aload           10
        //   219: athrow         
        //   220: astore          12
        //   222: aload           12
        //   224: athrow         
        //   225: iconst_0       
        //   226: istore          13
        //   228: goto            110
        //   231: astore          15
        //   233: aload           15
        //   235: athrow         
        //   236: astore          16
        //   238: aload           16
        //   240: athrow         
        //   241: astore          17
        //   243: aload           17
        //   245: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      22     200    205    Ljava/lang/IllegalStateException;
        //  27     46     205    210    Ljava/lang/IllegalStateException;
        //  46     57     210    215    Ljava/lang/IllegalStateException;
        //  62     89     215    220    Ljava/lang/IllegalStateException;
        //  89     106    220    225    Ljava/lang/IllegalStateException;
        //  133    139    231    236    Ljava/lang/IllegalStateException;
        //  146    161    236    241    Ljava/lang/IllegalStateException;
        //  166    182    241    246    Ljava/lang/IllegalStateException;
        //  202    205    205    210    Ljava/lang/IllegalStateException;
        //  212    215    215    220    Ljava/lang/IllegalStateException;
        //  233    236    236    241    Ljava/lang/IllegalStateException;
        //  238    241    241    246    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 129, Size: 129
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
    
    protected void onMeasure(final int n, final int n2) {
        View child;
        int measuredHeight;
        while (true) {
            try {
                super.onMeasure(n, n2);
                if (!this.mFillViewport) {
                    return;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            if (View$MeasureSpec.getMode(n2) == 0 || this.getChildCount() <= 0) {
                return;
            }
            child = this.getChildAt(0);
            measuredHeight = this.getMeasuredHeight();
            if (child.getMeasuredHeight() < measuredHeight) {
                break;
            }
            return;
        }
        child.measure(getChildMeasureSpec(n, this.getPaddingLeft() + this.getPaddingRight(), ((FrameLayout$LayoutParams)child.getLayoutParams()).width), View$MeasureSpec.makeMeasureSpec(measuredHeight - this.getPaddingTop() - this.getPaddingBottom(), 1073741824));
    }
    
    public boolean onNestedFling(final View view, final float n, final float n2, final boolean b) {
        if (!b) {
            final int n3 = (int)n2;
            try {
                this.flingWithNestedDispatch(n3);
                return true;
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
        }
        return false;
    }
    
    public boolean onNestedPreFling(final View view, final float n, final float n2) {
        return false;
    }
    
    public void onNestedPreScroll(final View view, final int n, final int n2, final int[] array) {
    }
    
    public void onNestedScroll(final View view, final int n, final int n2, final int n3, final int n4) {
        final int scrollY = this.getScrollY();
        this.scrollBy(0, n4);
        final int n5 = this.getScrollY() - scrollY;
        this.dispatchNestedScroll(0, n5, 0, n4 - n5, null);
    }
    
    public void onNestedScrollAccepted(final View view, final View view2, final int n) {
        this.mParentHelper.onNestedScrollAccepted(view, view2, n);
        this.startNestedScroll(2);
    }
    
    protected void onOverScrolled(final int n, final int n2, final boolean b, final boolean b2) {
        super.scrollTo(n, n2);
    }
    
    protected boolean onRequestFocusInDescendants(final int p0, final Rect p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iload_1        
        //     1: iconst_2       
        //     2: if_icmpne       115
        //     5: sipush          130
        //     8: istore_3       
        //     9: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //    12: istore          11
        //    14: iload           11
        //    16: ifeq            109
        //    19: iload_3        
        //    20: iconst_1       
        //    21: if_icmpne       109
        //    24: bipush          33
        //    26: istore          4
        //    28: aload_2        
        //    29: ifnonnull       65
        //    32: invokestatic    android/view/FocusFinder.getInstance:()Landroid/view/FocusFinder;
        //    35: aload_0        
        //    36: aconst_null    
        //    37: iload           4
        //    39: invokevirtual   android/view/FocusFinder.findNextFocus:(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
        //    42: astore          9
        //    44: aload           9
        //    46: astore          5
        //    48: aload           5
        //    50: ifnonnull       80
        //    53: iconst_0       
        //    54: ireturn        
        //    55: astore          10
        //    57: aload           10
        //    59: athrow         
        //    60: astore          8
        //    62: aload           8
        //    64: athrow         
        //    65: invokestatic    android/view/FocusFinder.getInstance:()Landroid/view/FocusFinder;
        //    68: aload_0        
        //    69: aload_2        
        //    70: iload           4
        //    72: invokevirtual   android/view/FocusFinder.findNextFocusFromRect:(Landroid/view/ViewGroup;Landroid/graphics/Rect;I)Landroid/view/View;
        //    75: astore          5
        //    77: goto            48
        //    80: aload_0        
        //    81: aload           5
        //    83: invokespecial   android/support/v4/widget/NestedScrollView.isOffScreen:(Landroid/view/View;)Z
        //    86: istore          7
        //    88: iload           7
        //    90: ifeq            100
        //    93: iconst_0       
        //    94: ireturn        
        //    95: astore          6
        //    97: aload           6
        //    99: athrow         
        //   100: aload           5
        //   102: iload           4
        //   104: aload_2        
        //   105: invokevirtual   android/view/View.requestFocus:(ILandroid/graphics/Rect;)Z
        //   108: ireturn        
        //   109: iload_3        
        //   110: istore          4
        //   112: goto            28
        //   115: iload_1        
        //   116: istore_3       
        //   117: goto            19
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  9      14     55     60     Ljava/lang/IllegalStateException;
        //  32     44     60     65     Ljava/lang/IllegalStateException;
        //  80     88     95     100    Ljava/lang/IllegalStateException;
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
    
    protected void onRestoreInstanceState(final Parcelable parcelable) {
        final NestedScrollView$SavedState mSavedState = (NestedScrollView$SavedState)parcelable;
        super.onRestoreInstanceState(mSavedState.getSuperState());
        this.mSavedState = mSavedState;
        this.requestLayout();
    }
    
    protected Parcelable onSaveInstanceState() {
        final NestedScrollView$SavedState nestedScrollView$SavedState = new NestedScrollView$SavedState(super.onSaveInstanceState());
        nestedScrollView$SavedState.scrollPosition = this.getScrollY();
        return (Parcelable)nestedScrollView$SavedState;
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        final View focus = this.findFocus();
        if (focus != null && this != focus && this.isWithinDeltaOfScreen(focus, 0, n4)) {
            focus.getDrawingRect(this.mTempRect);
            this.offsetDescendantRectToMyCoords(focus, this.mTempRect);
            this.doScrollY(this.computeScrollDeltaToGetChildRectOnScreen(this.mTempRect));
        }
    }
    
    public boolean onStartNestedScroll(final View view, final View view2, final int n) {
        return (n & 0x2) != 0x0;
    }
    
    public void onStopNestedScroll(final View view) {
        this.stopNestedScroll();
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
        //     5: invokespecial   android/support/v4/widget/NestedScrollView.initVelocityTrackerIfNotExists:()V
        //     8: aload_1        
        //     9: invokestatic    android/view/MotionEvent.obtain:(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;
        //    12: astore_3       
        //    13: aload_1        
        //    14: invokestatic    android/support/v4/view/MotionEventCompat.getActionMasked:(Landroid/view/MotionEvent;)I
        //    17: istore          4
        //    19: iload           4
        //    21: ifne            29
        //    24: aload_0        
        //    25: iconst_0       
        //    26: putfield        android/support/v4/widget/NestedScrollView.mNestedYOffset:I
        //    29: aload_3        
        //    30: fconst_0       
        //    31: aload_0        
        //    32: getfield        android/support/v4/widget/NestedScrollView.mNestedYOffset:I
        //    35: i2f            
        //    36: invokevirtual   android/view/MotionEvent.offsetLocation:(FF)V
        //    39: iload           4
        //    41: tableswitch {
        //                0: 110
        //                1: 790
        //                2: 221
        //                3: 864
        //                4: 84
        //                5: 895
        //                6: 926
        //          default: 84
        //        }
        //    84: aload_0        
        //    85: getfield        android/support/v4/widget/NestedScrollView.mVelocityTracker:Landroid/view/VelocityTracker;
        //    88: ifnull          99
        //    91: aload_0        
        //    92: getfield        android/support/v4/widget/NestedScrollView.mVelocityTracker:Landroid/view/VelocityTracker;
        //    95: aload_3        
        //    96: invokevirtual   android/view/VelocityTracker.addMovement:(Landroid/view/MotionEvent;)V
        //    99: aload_3        
        //   100: invokevirtual   android/view/MotionEvent.recycle:()V
        //   103: iconst_1       
        //   104: ireturn        
        //   105: astore          64
        //   107: aload           64
        //   109: athrow         
        //   110: aload_0        
        //   111: invokevirtual   android/support/v4/widget/NestedScrollView.getChildCount:()I
        //   114: ifne            129
        //   117: iconst_0       
        //   118: ireturn        
        //   119: astore          5
        //   121: aload           5
        //   123: athrow         
        //   124: astore          6
        //   126: aload           6
        //   128: athrow         
        //   129: aload_0        
        //   130: getfield        android/support/v4/widget/NestedScrollView.mScroller:Landroid/support/v4/widget/ScrollerCompat;
        //   133: invokevirtual   android/support/v4/widget/ScrollerCompat.isFinished:()Z
        //   136: istore          58
        //   138: iload           58
        //   140: ifne            961
        //   143: iconst_1       
        //   144: istore          59
        //   146: aload_0        
        //   147: iload           59
        //   149: putfield        android/support/v4/widget/NestedScrollView.mIsBeingDragged:Z
        //   152: iload           59
        //   154: ifeq            176
        //   157: aload_0        
        //   158: invokevirtual   android/support/v4/widget/NestedScrollView.getParent:()Landroid/view/ViewParent;
        //   161: astore          62
        //   163: aload           62
        //   165: ifnull          176
        //   168: aload           62
        //   170: iconst_1       
        //   171: invokeinterface android/view/ViewParent.requestDisallowInterceptTouchEvent:(Z)V
        //   176: aload_0        
        //   177: getfield        android/support/v4/widget/NestedScrollView.mScroller:Landroid/support/v4/widget/ScrollerCompat;
        //   180: invokevirtual   android/support/v4/widget/ScrollerCompat.isFinished:()Z
        //   183: ifne            193
        //   186: aload_0        
        //   187: getfield        android/support/v4/widget/NestedScrollView.mScroller:Landroid/support/v4/widget/ScrollerCompat;
        //   190: invokevirtual   android/support/v4/widget/ScrollerCompat.abortAnimation:()V
        //   193: aload_0        
        //   194: aload_1        
        //   195: invokevirtual   android/view/MotionEvent.getY:()F
        //   198: f2i            
        //   199: putfield        android/support/v4/widget/NestedScrollView.mLastMotionY:I
        //   202: aload_0        
        //   203: aload_1        
        //   204: iconst_0       
        //   205: invokestatic    android/support/v4/view/MotionEventCompat.getPointerId:(Landroid/view/MotionEvent;I)I
        //   208: putfield        android/support/v4/widget/NestedScrollView.mActivePointerId:I
        //   211: aload_0        
        //   212: iconst_2       
        //   213: invokevirtual   android/support/v4/widget/NestedScrollView.startNestedScroll:(I)Z
        //   216: pop            
        //   217: iload_2        
        //   218: ifeq            84
        //   221: aload_1        
        //   222: aload_0        
        //   223: getfield        android/support/v4/widget/NestedScrollView.mActivePointerId:I
        //   226: invokestatic    android/support/v4/view/MotionEventCompat.findPointerIndex:(Landroid/view/MotionEvent;I)I
        //   229: istore          19
        //   231: iload           19
        //   233: iconst_m1      
        //   234: if_icmpne       284
        //   237: getstatic       android/support/v4/widget/NestedScrollView.z:[Ljava/lang/String;
        //   240: iconst_5       
        //   241: aaload         
        //   242: new             Ljava/lang/StringBuilder;
        //   245: dup            
        //   246: invokespecial   java/lang/StringBuilder.<init>:()V
        //   249: getstatic       android/support/v4/widget/NestedScrollView.z:[Ljava/lang/String;
        //   252: bipush          6
        //   254: aaload         
        //   255: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   258: aload_0        
        //   259: getfield        android/support/v4/widget/NestedScrollView.mActivePointerId:I
        //   262: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   265: getstatic       android/support/v4/widget/NestedScrollView.z:[Ljava/lang/String;
        //   268: iconst_4       
        //   269: aaload         
        //   270: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   273: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   276: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   279: pop            
        //   280: iload_2        
        //   281: ifeq            84
        //   284: aload_1        
        //   285: iload           19
        //   287: invokestatic    android/support/v4/view/MotionEventCompat.getY:(Landroid/view/MotionEvent;I)F
        //   290: f2i            
        //   291: istore          20
        //   293: aload_0        
        //   294: getfield        android/support/v4/widget/NestedScrollView.mLastMotionY:I
        //   297: iload           20
        //   299: isub           
        //   300: istore          21
        //   302: aload_0        
        //   303: iconst_0       
        //   304: iload           21
        //   306: aload_0        
        //   307: getfield        android/support/v4/widget/NestedScrollView.mScrollConsumed:[I
        //   310: aload_0        
        //   311: getfield        android/support/v4/widget/NestedScrollView.mScrollOffset:[I
        //   314: invokevirtual   android/support/v4/widget/NestedScrollView.dispatchNestedPreScroll:(II[I[I)Z
        //   317: ifeq            358
        //   320: iload           21
        //   322: aload_0        
        //   323: getfield        android/support/v4/widget/NestedScrollView.mScrollConsumed:[I
        //   326: iconst_1       
        //   327: iaload         
        //   328: isub           
        //   329: istore          21
        //   331: aload_3        
        //   332: fconst_0       
        //   333: aload_0        
        //   334: getfield        android/support/v4/widget/NestedScrollView.mScrollOffset:[I
        //   337: iconst_1       
        //   338: iaload         
        //   339: i2f            
        //   340: invokevirtual   android/view/MotionEvent.offsetLocation:(FF)V
        //   343: aload_0        
        //   344: aload_0        
        //   345: getfield        android/support/v4/widget/NestedScrollView.mNestedYOffset:I
        //   348: aload_0        
        //   349: getfield        android/support/v4/widget/NestedScrollView.mScrollOffset:[I
        //   352: iconst_1       
        //   353: iaload         
        //   354: iadd           
        //   355: putfield        android/support/v4/widget/NestedScrollView.mNestedYOffset:I
        //   358: aload_0        
        //   359: getfield        android/support/v4/widget/NestedScrollView.mIsBeingDragged:Z
        //   362: ifne            1083
        //   365: iload           21
        //   367: invokestatic    java/lang/Math.abs:(I)I
        //   370: istore          51
        //   372: aload_0        
        //   373: getfield        android/support/v4/widget/NestedScrollView.mTouchSlop:I
        //   376: istore          52
        //   378: iload           51
        //   380: iload           52
        //   382: if_icmple       1083
        //   385: aload_0        
        //   386: invokevirtual   android/support/v4/widget/NestedScrollView.getParent:()Landroid/view/ViewParent;
        //   389: astore          53
        //   391: aload           53
        //   393: ifnull          404
        //   396: aload           53
        //   398: iconst_1       
        //   399: invokeinterface android/view/ViewParent.requestDisallowInterceptTouchEvent:(Z)V
        //   404: aload_0        
        //   405: iconst_1       
        //   406: putfield        android/support/v4/widget/NestedScrollView.mIsBeingDragged:Z
        //   409: iload           21
        //   411: ifle            427
        //   414: iload           21
        //   416: aload_0        
        //   417: getfield        android/support/v4/widget/NestedScrollView.mTouchSlop:I
        //   420: isub           
        //   421: istore          21
        //   423: iload_2        
        //   424: ifeq            1083
        //   427: iload           21
        //   429: aload_0        
        //   430: getfield        android/support/v4/widget/NestedScrollView.mTouchSlop:I
        //   433: iadd           
        //   434: istore          23
        //   436: aload_0        
        //   437: getfield        android/support/v4/widget/NestedScrollView.mIsBeingDragged:Z
        //   440: ifeq            84
        //   443: aload_0        
        //   444: iload           20
        //   446: aload_0        
        //   447: getfield        android/support/v4/widget/NestedScrollView.mScrollOffset:[I
        //   450: iconst_1       
        //   451: iaload         
        //   452: isub           
        //   453: putfield        android/support/v4/widget/NestedScrollView.mLastMotionY:I
        //   456: aload_0        
        //   457: invokevirtual   android/support/v4/widget/NestedScrollView.getScrollY:()I
        //   460: istore          24
        //   462: aload_0        
        //   463: invokespecial   android/support/v4/widget/NestedScrollView.getScrollRange:()I
        //   466: istore          25
        //   468: aload_0        
        //   469: invokestatic    android/support/v4/view/ViewCompat.getOverScrollMode:(Landroid/view/View;)I
        //   472: istore          26
        //   474: iload           26
        //   476: ifeq            490
        //   479: iload           26
        //   481: iconst_1       
        //   482: if_icmpne       992
        //   485: iload           25
        //   487: ifle            992
        //   490: iconst_1       
        //   491: istore          27
        //   493: aload_0        
        //   494: iconst_0       
        //   495: iload           23
        //   497: iconst_0       
        //   498: aload_0        
        //   499: invokevirtual   android/support/v4/widget/NestedScrollView.getScrollY:()I
        //   502: iconst_0       
        //   503: iload           25
        //   505: iconst_0       
        //   506: iconst_0       
        //   507: iconst_1       
        //   508: invokevirtual   android/support/v4/widget/NestedScrollView.overScrollByCompat:(IIIIIIIIZ)Z
        //   511: istore          30
        //   513: iload           30
        //   515: ifeq            532
        //   518: aload_0        
        //   519: invokevirtual   android/support/v4/widget/NestedScrollView.hasNestedScrollingParent:()Z
        //   522: ifne            532
        //   525: aload_0        
        //   526: getfield        android/support/v4/widget/NestedScrollView.mVelocityTracker:Landroid/view/VelocityTracker;
        //   529: invokevirtual   android/view/VelocityTracker.clear:()V
        //   532: aload_0        
        //   533: invokevirtual   android/support/v4/widget/NestedScrollView.getScrollY:()I
        //   536: iload           24
        //   538: isub           
        //   539: istore          31
        //   541: iload           23
        //   543: iload           31
        //   545: isub           
        //   546: istore          32
        //   548: aload_0        
        //   549: iconst_0       
        //   550: iload           31
        //   552: iconst_0       
        //   553: iload           32
        //   555: aload_0        
        //   556: getfield        android/support/v4/widget/NestedScrollView.mScrollOffset:[I
        //   559: invokevirtual   android/support/v4/widget/NestedScrollView.dispatchNestedScroll:(IIII[I)Z
        //   562: istore          35
        //   564: iload           35
        //   566: ifeq            615
        //   569: aload_0        
        //   570: aload_0        
        //   571: getfield        android/support/v4/widget/NestedScrollView.mLastMotionY:I
        //   574: aload_0        
        //   575: getfield        android/support/v4/widget/NestedScrollView.mScrollOffset:[I
        //   578: iconst_1       
        //   579: iaload         
        //   580: isub           
        //   581: putfield        android/support/v4/widget/NestedScrollView.mLastMotionY:I
        //   584: aload_3        
        //   585: fconst_0       
        //   586: aload_0        
        //   587: getfield        android/support/v4/widget/NestedScrollView.mScrollOffset:[I
        //   590: iconst_1       
        //   591: iaload         
        //   592: i2f            
        //   593: invokevirtual   android/view/MotionEvent.offsetLocation:(FF)V
        //   596: aload_0        
        //   597: aload_0        
        //   598: getfield        android/support/v4/widget/NestedScrollView.mNestedYOffset:I
        //   601: aload_0        
        //   602: getfield        android/support/v4/widget/NestedScrollView.mScrollOffset:[I
        //   605: iconst_1       
        //   606: iaload         
        //   607: iadd           
        //   608: putfield        android/support/v4/widget/NestedScrollView.mNestedYOffset:I
        //   611: iload_2        
        //   612: ifeq            786
        //   615: iload           27
        //   617: ifeq            786
        //   620: aload_0        
        //   621: invokespecial   android/support/v4/widget/NestedScrollView.ensureGlows:()V
        //   624: iload           24
        //   626: iload           23
        //   628: iadd           
        //   629: istore          36
        //   631: iload           36
        //   633: ifge            691
        //   636: aload_0        
        //   637: getfield        android/support/v4/widget/NestedScrollView.mEdgeGlowTop:Landroid/support/v4/widget/EdgeEffectCompat;
        //   640: iload           23
        //   642: i2f            
        //   643: aload_0        
        //   644: invokevirtual   android/support/v4/widget/NestedScrollView.getHeight:()I
        //   647: i2f            
        //   648: fdiv           
        //   649: aload_1        
        //   650: iload           19
        //   652: invokestatic    android/support/v4/view/MotionEventCompat.getX:(Landroid/view/MotionEvent;I)F
        //   655: aload_0        
        //   656: invokevirtual   android/support/v4/widget/NestedScrollView.getWidth:()I
        //   659: i2f            
        //   660: fdiv           
        //   661: invokevirtual   android/support/v4/widget/EdgeEffectCompat.onPull:(FF)Z
        //   664: pop            
        //   665: aload_0        
        //   666: getfield        android/support/v4/widget/NestedScrollView.mEdgeGlowBottom:Landroid/support/v4/widget/EdgeEffectCompat;
        //   669: invokevirtual   android/support/v4/widget/EdgeEffectCompat.isFinished:()Z
        //   672: istore          49
        //   674: iload           49
        //   676: ifne            747
        //   679: aload_0        
        //   680: getfield        android/support/v4/widget/NestedScrollView.mEdgeGlowBottom:Landroid/support/v4/widget/EdgeEffectCompat;
        //   683: invokevirtual   android/support/v4/widget/EdgeEffectCompat.onRelease:()Z
        //   686: pop            
        //   687: iload_2        
        //   688: ifeq            747
        //   691: iload           36
        //   693: iload           25
        //   695: if_icmple       747
        //   698: aload_0        
        //   699: getfield        android/support/v4/widget/NestedScrollView.mEdgeGlowBottom:Landroid/support/v4/widget/EdgeEffectCompat;
        //   702: iload           23
        //   704: i2f            
        //   705: aload_0        
        //   706: invokevirtual   android/support/v4/widget/NestedScrollView.getHeight:()I
        //   709: i2f            
        //   710: fdiv           
        //   711: fconst_1       
        //   712: aload_1        
        //   713: iload           19
        //   715: invokestatic    android/support/v4/view/MotionEventCompat.getX:(Landroid/view/MotionEvent;I)F
        //   718: aload_0        
        //   719: invokevirtual   android/support/v4/widget/NestedScrollView.getWidth:()I
        //   722: i2f            
        //   723: fdiv           
        //   724: fsub           
        //   725: invokevirtual   android/support/v4/widget/EdgeEffectCompat.onPull:(FF)Z
        //   728: pop            
        //   729: aload_0        
        //   730: getfield        android/support/v4/widget/NestedScrollView.mEdgeGlowTop:Landroid/support/v4/widget/EdgeEffectCompat;
        //   733: invokevirtual   android/support/v4/widget/EdgeEffectCompat.isFinished:()Z
        //   736: ifne            747
        //   739: aload_0        
        //   740: getfield        android/support/v4/widget/NestedScrollView.mEdgeGlowTop:Landroid/support/v4/widget/EdgeEffectCompat;
        //   743: invokevirtual   android/support/v4/widget/EdgeEffectCompat.onRelease:()Z
        //   746: pop            
        //   747: aload_0        
        //   748: getfield        android/support/v4/widget/NestedScrollView.mEdgeGlowTop:Landroid/support/v4/widget/EdgeEffectCompat;
        //   751: astore          40
        //   753: aload           40
        //   755: ifnull          786
        //   758: aload_0        
        //   759: getfield        android/support/v4/widget/NestedScrollView.mEdgeGlowTop:Landroid/support/v4/widget/EdgeEffectCompat;
        //   762: invokevirtual   android/support/v4/widget/EdgeEffectCompat.isFinished:()Z
        //   765: istore          41
        //   767: iload           41
        //   769: ifeq            782
        //   772: aload_0        
        //   773: getfield        android/support/v4/widget/NestedScrollView.mEdgeGlowBottom:Landroid/support/v4/widget/EdgeEffectCompat;
        //   776: invokevirtual   android/support/v4/widget/EdgeEffectCompat.isFinished:()Z
        //   779: ifne            786
        //   782: aload_0        
        //   783: invokestatic    android/support/v4/view/ViewCompat.postInvalidateOnAnimation:(Landroid/view/View;)V
        //   786: iload_2        
        //   787: ifeq            84
        //   790: aload_0        
        //   791: getfield        android/support/v4/widget/NestedScrollView.mIsBeingDragged:Z
        //   794: istore          14
        //   796: iload           14
        //   798: ifeq            84
        //   801: aload_0        
        //   802: getfield        android/support/v4/widget/NestedScrollView.mVelocityTracker:Landroid/view/VelocityTracker;
        //   805: astore          15
        //   807: aload           15
        //   809: sipush          1000
        //   812: aload_0        
        //   813: getfield        android/support/v4/widget/NestedScrollView.mMaximumVelocity:I
        //   816: i2f            
        //   817: invokevirtual   android/view/VelocityTracker.computeCurrentVelocity:(IF)V
        //   820: aload           15
        //   822: aload_0        
        //   823: getfield        android/support/v4/widget/NestedScrollView.mActivePointerId:I
        //   826: invokestatic    android/support/v4/view/VelocityTrackerCompat.getYVelocity:(Landroid/view/VelocityTracker;I)F
        //   829: f2i            
        //   830: istore          16
        //   832: iload           16
        //   834: invokestatic    java/lang/Math.abs:(I)I
        //   837: aload_0        
        //   838: getfield        android/support/v4/widget/NestedScrollView.mMinimumVelocity:I
        //   841: if_icmple       851
        //   844: aload_0        
        //   845: iload           16
        //   847: ineg           
        //   848: invokespecial   android/support/v4/widget/NestedScrollView.flingWithNestedDispatch:(I)V
        //   851: aload_0        
        //   852: iconst_m1      
        //   853: putfield        android/support/v4/widget/NestedScrollView.mActivePointerId:I
        //   856: aload_0        
        //   857: invokespecial   android/support/v4/widget/NestedScrollView.endDrag:()V
        //   860: iload_2        
        //   861: ifeq            84
        //   864: aload_0        
        //   865: getfield        android/support/v4/widget/NestedScrollView.mIsBeingDragged:Z
        //   868: istore          12
        //   870: iload           12
        //   872: ifeq            84
        //   875: aload_0        
        //   876: invokevirtual   android/support/v4/widget/NestedScrollView.getChildCount:()I
        //   879: ifle            84
        //   882: aload_0        
        //   883: iconst_m1      
        //   884: putfield        android/support/v4/widget/NestedScrollView.mActivePointerId:I
        //   887: aload_0        
        //   888: invokespecial   android/support/v4/widget/NestedScrollView.endDrag:()V
        //   891: iload_2        
        //   892: ifeq            84
        //   895: aload_1        
        //   896: invokestatic    android/support/v4/view/MotionEventCompat.getActionIndex:(Landroid/view/MotionEvent;)I
        //   899: istore          9
        //   901: aload_0        
        //   902: aload_1        
        //   903: iload           9
        //   905: invokestatic    android/support/v4/view/MotionEventCompat.getY:(Landroid/view/MotionEvent;I)F
        //   908: f2i            
        //   909: putfield        android/support/v4/widget/NestedScrollView.mLastMotionY:I
        //   912: aload_0        
        //   913: aload_1        
        //   914: iload           9
        //   916: invokestatic    android/support/v4/view/MotionEventCompat.getPointerId:(Landroid/view/MotionEvent;I)I
        //   919: putfield        android/support/v4/widget/NestedScrollView.mActivePointerId:I
        //   922: iload_2        
        //   923: ifeq            84
        //   926: aload_0        
        //   927: aload_1        
        //   928: invokespecial   android/support/v4/widget/NestedScrollView.onSecondaryPointerUp:(Landroid/view/MotionEvent;)V
        //   931: aload_0        
        //   932: aload_1        
        //   933: aload_1        
        //   934: aload_0        
        //   935: getfield        android/support/v4/widget/NestedScrollView.mActivePointerId:I
        //   938: invokestatic    android/support/v4/view/MotionEventCompat.findPointerIndex:(Landroid/view/MotionEvent;I)I
        //   941: invokestatic    android/support/v4/view/MotionEventCompat.getY:(Landroid/view/MotionEvent;I)F
        //   944: f2i            
        //   945: putfield        android/support/v4/widget/NestedScrollView.mLastMotionY:I
        //   948: goto            84
        //   951: astore          7
        //   953: aload           7
        //   955: athrow         
        //   956: astore          57
        //   958: aload           57
        //   960: athrow         
        //   961: iconst_0       
        //   962: istore          59
        //   964: goto            146
        //   967: astore          63
        //   969: aload           63
        //   971: athrow         
        //   972: astore          60
        //   974: aload           60
        //   976: athrow         
        //   977: astore          55
        //   979: aload           55
        //   981: athrow         
        //   982: astore          22
        //   984: aload           22
        //   986: athrow         
        //   987: astore          54
        //   989: aload           54
        //   991: athrow         
        //   992: iconst_0       
        //   993: istore          27
        //   995: goto            493
        //   998: astore          28
        //  1000: aload           28
        //  1002: athrow         
        //  1003: astore          29
        //  1005: aload           29
        //  1007: athrow         
        //  1008: astore          33
        //  1010: aload           33
        //  1012: athrow         
        //  1013: astore          34
        //  1015: aload           34
        //  1017: athrow         
        //  1018: astore          45
        //  1020: aload           45
        //  1022: athrow         
        //  1023: astore          46
        //  1025: aload           46
        //  1027: athrow         
        //  1028: astore          47
        //  1030: aload           47
        //  1032: athrow         
        //  1033: astore          42
        //  1035: aload           42
        //  1037: athrow         
        //  1038: astore          37
        //  1040: aload           37
        //  1042: athrow         
        //  1043: astore          38
        //  1045: aload           38
        //  1047: athrow         
        //  1048: astore          39
        //  1050: aload           39
        //  1052: athrow         
        //  1053: astore          13
        //  1055: aload           13
        //  1057: athrow         
        //  1058: astore          17
        //  1060: aload           17
        //  1062: athrow         
        //  1063: astore          18
        //  1065: aload           18
        //  1067: athrow         
        //  1068: astore          10
        //  1070: aload           10
        //  1072: athrow         
        //  1073: astore          11
        //  1075: aload           11
        //  1077: athrow         
        //  1078: astore          8
        //  1080: aload           8
        //  1082: athrow         
        //  1083: iload           21
        //  1085: istore          23
        //  1087: goto            436
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  24     29     105    110    Ljava/lang/IllegalStateException;
        //  29     39     119    124    Ljava/lang/IllegalStateException;
        //  84     99     1078   1083   Ljava/lang/IllegalStateException;
        //  110    117    124    129    Ljava/lang/IllegalStateException;
        //  121    124    124    129    Ljava/lang/IllegalStateException;
        //  129    138    956    961    Ljava/lang/IllegalStateException;
        //  168    176    967    972    Ljava/lang/IllegalStateException;
        //  176    193    972    977    Ljava/lang/IllegalStateException;
        //  237    280    977    982    Ljava/lang/IllegalStateException;
        //  358    378    982    987    Ljava/lang/IllegalStateException;
        //  396    404    987    992    Ljava/lang/IllegalStateException;
        //  493    513    998    1003   Ljava/lang/IllegalStateException;
        //  518    532    1003   1008   Ljava/lang/IllegalStateException;
        //  548    564    1008   1013   Ljava/lang/IllegalStateException;
        //  569    611    1013   1018   Ljava/lang/IllegalStateException;
        //  636    674    1018   1023   Ljava/lang/IllegalStateException;
        //  679    687    1023   1033   Ljava/lang/IllegalStateException;
        //  698    747    1033   1038   Ljava/lang/IllegalStateException;
        //  747    753    1038   1043   Ljava/lang/IllegalStateException;
        //  758    767    1043   1048   Ljava/lang/IllegalStateException;
        //  772    782    1048   1053   Ljava/lang/IllegalStateException;
        //  782    786    1048   1053   Ljava/lang/IllegalStateException;
        //  790    796    1053   1058   Ljava/lang/IllegalStateException;
        //  832    851    1058   1063   Ljava/lang/IllegalStateException;
        //  851    860    1063   1068   Ljava/lang/IllegalStateException;
        //  864    870    1068   1073   Ljava/lang/IllegalStateException;
        //  875    891    1073   1078   Ljava/lang/IllegalStateException;
        //  901    922    951    956    Ljava/lang/IllegalStateException;
        //  926    948    951    956    Ljava/lang/IllegalStateException;
        //  1000   1003   1003   1008   Ljava/lang/IllegalStateException;
        //  1010   1013   1013   1018   Ljava/lang/IllegalStateException;
        //  1020   1023   1023   1033   Ljava/lang/IllegalStateException;
        //  1025   1028   1028   1033   Ljava/lang/IllegalStateException;
        //  1030   1033   1033   1038   Ljava/lang/IllegalStateException;
        //  1040   1043   1043   1048   Ljava/lang/IllegalStateException;
        //  1045   1048   1048   1053   Ljava/lang/IllegalStateException;
        //  1065   1068   1068   1073   Ljava/lang/IllegalStateException;
        //  1070   1073   1073   1078   Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 549, Size: 549
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
    
    boolean overScrollByCompat(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7, final boolean p8) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          10
        //     5: aload_0        
        //     6: invokestatic    android/support/v4/view/ViewCompat.getOverScrollMode:(Landroid/view/View;)I
        //     9: istore          11
        //    11: aload_0        
        //    12: invokevirtual   android/support/v4/widget/NestedScrollView.computeHorizontalScrollRange:()I
        //    15: istore          13
        //    17: aload_0        
        //    18: invokevirtual   android/support/v4/widget/NestedScrollView.computeHorizontalScrollExtent:()I
        //    21: istore          14
        //    23: iload           13
        //    25: iload           14
        //    27: if_icmple       227
        //    30: iconst_1       
        //    31: istore          15
        //    33: aload_0        
        //    34: invokevirtual   android/support/v4/widget/NestedScrollView.computeVerticalScrollRange:()I
        //    37: istore          17
        //    39: aload_0        
        //    40: invokevirtual   android/support/v4/widget/NestedScrollView.computeVerticalScrollExtent:()I
        //    43: istore          18
        //    45: iload           17
        //    47: iload           18
        //    49: if_icmple       238
        //    52: iconst_1       
        //    53: istore          19
        //    55: iload           11
        //    57: ifeq            71
        //    60: iload           11
        //    62: iconst_1       
        //    63: if_icmpne       244
        //    66: iload           15
        //    68: ifeq            244
        //    71: iconst_1       
        //    72: istore          20
        //    74: iload           11
        //    76: ifeq            90
        //    79: iload           11
        //    81: iconst_1       
        //    82: if_icmpne       250
        //    85: iload           19
        //    87: ifeq            250
        //    90: iconst_1       
        //    91: istore          21
        //    93: iload_3        
        //    94: iload_1        
        //    95: iadd           
        //    96: istore          22
        //    98: iload           20
        //   100: ifne            106
        //   103: iconst_0       
        //   104: istore          7
        //   106: iload           4
        //   108: iload_2        
        //   109: iadd           
        //   110: istore          23
        //   112: iload           21
        //   114: ifne            120
        //   117: iconst_0       
        //   118: istore          8
        //   120: iload           7
        //   122: ineg           
        //   123: istore          24
        //   125: iload           7
        //   127: iload           5
        //   129: iadd           
        //   130: istore          25
        //   132: iload           8
        //   134: ineg           
        //   135: istore          26
        //   137: iload           8
        //   139: iload           6
        //   141: iadd           
        //   142: istore          27
        //   144: iload           22
        //   146: iload           25
        //   148: if_icmple       289
        //   151: iconst_1       
        //   152: istore          28
        //   154: iload           10
        //   156: ifeq            278
        //   159: iload           25
        //   161: iload           24
        //   163: if_icmpge       278
        //   166: iconst_1       
        //   167: istore          29
        //   169: iload           23
        //   171: iload           27
        //   173: if_icmple       268
        //   176: iconst_1       
        //   177: istore          30
        //   179: iload           10
        //   181: ifeq            198
        //   184: iload           27
        //   186: iload           26
        //   188: if_icmpge       198
        //   191: iconst_1       
        //   192: istore          30
        //   194: iload           26
        //   196: istore          27
        //   198: aload_0        
        //   199: iload           24
        //   201: iload           27
        //   203: iload           29
        //   205: iload           30
        //   207: invokevirtual   android/support/v4/widget/NestedScrollView.onOverScrolled:(IIZZ)V
        //   210: iload           29
        //   212: ifne            220
        //   215: iload           30
        //   217: ifeq            266
        //   220: iconst_1       
        //   221: ireturn        
        //   222: astore          12
        //   224: aload           12
        //   226: athrow         
        //   227: iconst_0       
        //   228: istore          15
        //   230: goto            33
        //   233: astore          16
        //   235: aload           16
        //   237: athrow         
        //   238: iconst_0       
        //   239: istore          19
        //   241: goto            55
        //   244: iconst_0       
        //   245: istore          20
        //   247: goto            74
        //   250: iconst_0       
        //   251: istore          21
        //   253: goto            93
        //   256: astore          31
        //   258: aload           31
        //   260: athrow         
        //   261: astore          32
        //   263: aload           32
        //   265: athrow         
        //   266: iconst_0       
        //   267: ireturn        
        //   268: iload           23
        //   270: istore          27
        //   272: iconst_0       
        //   273: istore          30
        //   275: goto            184
        //   278: iload           25
        //   280: istore          24
        //   282: iload           28
        //   284: istore          29
        //   286: goto            169
        //   289: iload           22
        //   291: istore          25
        //   293: iconst_0       
        //   294: istore          28
        //   296: goto            159
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  11     23     222    227    Ljava/lang/IllegalStateException;
        //  33     45     233    238    Ljava/lang/IllegalStateException;
        //  198    210    256    266    Ljava/lang/IllegalStateException;
        //  258    261    261    266    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 154, Size: 154
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
    
    public boolean pageScroll(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_2       
        //     2: iload_1        
        //     3: sipush          130
        //     6: if_icmpne       11
        //     9: iconst_1       
        //    10: istore_2       
        //    11: aload_0        
        //    12: invokevirtual   android/support/v4/widget/NestedScrollView.getHeight:()I
        //    15: istore_3       
        //    16: iload_2        
        //    17: ifeq            95
        //    20: aload_0        
        //    21: getfield        android/support/v4/widget/NestedScrollView.mTempRect:Landroid/graphics/Rect;
        //    24: iload_3        
        //    25: aload_0        
        //    26: invokevirtual   android/support/v4/widget/NestedScrollView.getScrollY:()I
        //    29: iadd           
        //    30: putfield        android/graphics/Rect.top:I
        //    33: aload_0        
        //    34: invokevirtual   android/support/v4/widget/NestedScrollView.getChildCount:()I
        //    37: istore          5
        //    39: iload           5
        //    41: ifle            85
        //    44: aload_0        
        //    45: iload           5
        //    47: iconst_1       
        //    48: isub           
        //    49: invokevirtual   android/support/v4/widget/NestedScrollView.getChildAt:(I)Landroid/view/View;
        //    52: astore          8
        //    54: iload_3        
        //    55: aload_0        
        //    56: getfield        android/support/v4/widget/NestedScrollView.mTempRect:Landroid/graphics/Rect;
        //    59: getfield        android/graphics/Rect.top:I
        //    62: iadd           
        //    63: aload           8
        //    65: invokevirtual   android/view/View.getBottom:()I
        //    68: if_icmple       85
        //    71: aload_0        
        //    72: getfield        android/support/v4/widget/NestedScrollView.mTempRect:Landroid/graphics/Rect;
        //    75: aload           8
        //    77: invokevirtual   android/view/View.getBottom:()I
        //    80: iload_3        
        //    81: isub           
        //    82: putfield        android/graphics/Rect.top:I
        //    85: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //    88: istore          7
        //    90: iload           7
        //    92: ifeq            126
        //    95: aload_0        
        //    96: getfield        android/support/v4/widget/NestedScrollView.mTempRect:Landroid/graphics/Rect;
        //    99: aload_0        
        //   100: invokevirtual   android/support/v4/widget/NestedScrollView.getScrollY:()I
        //   103: iload_3        
        //   104: isub           
        //   105: putfield        android/graphics/Rect.top:I
        //   108: aload_0        
        //   109: getfield        android/support/v4/widget/NestedScrollView.mTempRect:Landroid/graphics/Rect;
        //   112: getfield        android/graphics/Rect.top:I
        //   115: ifge            126
        //   118: aload_0        
        //   119: getfield        android/support/v4/widget/NestedScrollView.mTempRect:Landroid/graphics/Rect;
        //   122: iconst_0       
        //   123: putfield        android/graphics/Rect.top:I
        //   126: aload_0        
        //   127: getfield        android/support/v4/widget/NestedScrollView.mTempRect:Landroid/graphics/Rect;
        //   130: iload_3        
        //   131: aload_0        
        //   132: getfield        android/support/v4/widget/NestedScrollView.mTempRect:Landroid/graphics/Rect;
        //   135: getfield        android/graphics/Rect.top:I
        //   138: iadd           
        //   139: putfield        android/graphics/Rect.bottom:I
        //   142: aload_0        
        //   143: iload_1        
        //   144: aload_0        
        //   145: getfield        android/support/v4/widget/NestedScrollView.mTempRect:Landroid/graphics/Rect;
        //   148: getfield        android/graphics/Rect.top:I
        //   151: aload_0        
        //   152: getfield        android/support/v4/widget/NestedScrollView.mTempRect:Landroid/graphics/Rect;
        //   155: getfield        android/graphics/Rect.bottom:I
        //   158: invokespecial   android/support/v4/widget/NestedScrollView.scrollAndFocus:(III)Z
        //   161: ireturn        
        //   162: astore          9
        //   164: aload           9
        //   166: athrow         
        //   167: astore          6
        //   169: aload           6
        //   171: athrow         
        //   172: astore          4
        //   174: aload           4
        //   176: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  54     85     162    167    Ljava/lang/IllegalStateException;
        //  85     90     167    172    Ljava/lang/IllegalStateException;
        //  95     126    172    177    Ljava/lang/IllegalStateException;
        //  169    172    172    177    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 91, Size: 91
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
    
    public void requestChildFocus(final View p0, final View p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v4/widget/NestedScrollView.mIsLayoutDirty:Z
        //     4: istore          5
        //     6: iload           5
        //     8: ifne            22
        //    11: aload_0        
        //    12: aload_2        
        //    13: invokespecial   android/support/v4/widget/NestedScrollView.scrollToChild:(Landroid/view/View;)V
        //    16: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //    19: ifeq            27
        //    22: aload_0        
        //    23: aload_2        
        //    24: putfield        android/support/v4/widget/NestedScrollView.mChildToScrollTo:Landroid/view/View;
        //    27: aload_0        
        //    28: aload_1        
        //    29: aload_2        
        //    30: invokespecial   android/widget/FrameLayout.requestChildFocus:(Landroid/view/View;Landroid/view/View;)V
        //    33: return         
        //    34: astore_3       
        //    35: aload_3        
        //    36: athrow         
        //    37: astore          4
        //    39: aload           4
        //    41: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      6      34     37     Ljava/lang/IllegalStateException;
        //  11     22     37     42     Ljava/lang/IllegalStateException;
        //  22     27     37     42     Ljava/lang/IllegalStateException;
        //  35     37     37     42     Ljava/lang/IllegalStateException;
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
    
    public boolean requestChildRectangleOnScreen(final View view, final Rect rect, final boolean b) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return this.scrollToChildRect(rect, b);
    }
    
    public void requestDisallowInterceptTouchEvent(final boolean b) {
        Label_0008: {
            if (!b) {
                break Label_0008;
            }
            try {
                this.recycleVelocityTracker();
                super.requestDisallowInterceptTouchEvent(b);
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
        }
    }
    
    public void requestLayout() {
        this.mIsLayoutDirty = true;
        super.requestLayout();
    }
    
    public void scrollTo(final int p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   android/support/v4/widget/NestedScrollView.getChildCount:()I
        //     4: ifle            102
        //     7: aload_0        
        //     8: iconst_0       
        //     9: invokevirtual   android/support/v4/widget/NestedScrollView.getChildAt:(I)Landroid/view/View;
        //    12: astore_3       
        //    13: iload_1        
        //    14: aload_0        
        //    15: invokevirtual   android/support/v4/widget/NestedScrollView.getWidth:()I
        //    18: aload_0        
        //    19: invokevirtual   android/support/v4/widget/NestedScrollView.getPaddingRight:()I
        //    22: isub           
        //    23: aload_0        
        //    24: invokevirtual   android/support/v4/widget/NestedScrollView.getPaddingLeft:()I
        //    27: isub           
        //    28: aload_3        
        //    29: invokevirtual   android/view/View.getWidth:()I
        //    32: invokestatic    android/support/v4/widget/NestedScrollView.clamp:(III)I
        //    35: istore          4
        //    37: iload_2        
        //    38: aload_0        
        //    39: invokevirtual   android/support/v4/widget/NestedScrollView.getHeight:()I
        //    42: aload_0        
        //    43: invokevirtual   android/support/v4/widget/NestedScrollView.getPaddingBottom:()I
        //    46: isub           
        //    47: aload_0        
        //    48: invokevirtual   android/support/v4/widget/NestedScrollView.getPaddingTop:()I
        //    51: isub           
        //    52: aload_3        
        //    53: invokevirtual   android/view/View.getHeight:()I
        //    56: invokestatic    android/support/v4/widget/NestedScrollView.clamp:(III)I
        //    59: istore          5
        //    61: aload_0        
        //    62: invokevirtual   android/support/v4/widget/NestedScrollView.getScrollX:()I
        //    65: istore          8
        //    67: iload           4
        //    69: iload           8
        //    71: if_icmpne       83
        //    74: iload           5
        //    76: aload_0        
        //    77: invokevirtual   android/support/v4/widget/NestedScrollView.getScrollY:()I
        //    80: if_icmpeq       102
        //    83: aload_0        
        //    84: iload           4
        //    86: iload           5
        //    88: invokespecial   android/widget/FrameLayout.scrollTo:(II)V
        //    91: return         
        //    92: astore          6
        //    94: aload           6
        //    96: athrow         
        //    97: astore          7
        //    99: aload           7
        //   101: athrow         
        //   102: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  61     67     92     97     Ljava/lang/IllegalStateException;
        //  74     83     97     102    Ljava/lang/IllegalStateException;
        //  83     91     97     102    Ljava/lang/IllegalStateException;
        //  94     97     97     102    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0083:
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
    
    public void setFillViewport(final boolean mFillViewport) {
        try {
            if (mFillViewport != this.mFillViewport) {
                this.mFillViewport = mFillViewport;
                this.requestLayout();
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public void setNestedScrollingEnabled(final boolean nestedScrollingEnabled) {
        this.mChildHelper.setNestedScrollingEnabled(nestedScrollingEnabled);
    }
    
    public boolean shouldDelayChildPressedState() {
        return true;
    }
    
    public final void smoothScrollBy(final int p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   android/support/v4/widget/NestedScrollView.getChildCount:()I
        //     4: istore          4
        //     6: iload           4
        //     8: ifne            15
        //    11: return         
        //    12: astore_3       
        //    13: aload_3        
        //    14: athrow         
        //    15: invokestatic    android/view/animation/AnimationUtils.currentAnimationTimeMillis:()J
        //    18: aload_0        
        //    19: getfield        android/support/v4/widget/NestedScrollView.mLastScroll:J
        //    22: lsub           
        //    23: ldc2_w          250
        //    26: lcmp           
        //    27: ifle            115
        //    30: aload_0        
        //    31: invokevirtual   android/support/v4/widget/NestedScrollView.getHeight:()I
        //    34: aload_0        
        //    35: invokevirtual   android/support/v4/widget/NestedScrollView.getPaddingBottom:()I
        //    38: isub           
        //    39: aload_0        
        //    40: invokevirtual   android/support/v4/widget/NestedScrollView.getPaddingTop:()I
        //    43: isub           
        //    44: istore          6
        //    46: iconst_0       
        //    47: aload_0        
        //    48: iconst_0       
        //    49: invokevirtual   android/support/v4/widget/NestedScrollView.getChildAt:(I)Landroid/view/View;
        //    52: invokevirtual   android/view/View.getHeight:()I
        //    55: iload           6
        //    57: isub           
        //    58: invokestatic    java/lang/Math.max:(II)I
        //    61: istore          7
        //    63: aload_0        
        //    64: invokevirtual   android/support/v4/widget/NestedScrollView.getScrollY:()I
        //    67: istore          8
        //    69: iconst_0       
        //    70: iload           8
        //    72: iload_2        
        //    73: iadd           
        //    74: iload           7
        //    76: invokestatic    java/lang/Math.min:(II)I
        //    79: invokestatic    java/lang/Math.max:(II)I
        //    82: iload           8
        //    84: isub           
        //    85: istore_2       
        //    86: aload_0        
        //    87: getfield        android/support/v4/widget/NestedScrollView.mScroller:Landroid/support/v4/widget/ScrollerCompat;
        //    90: aload_0        
        //    91: invokevirtual   android/support/v4/widget/NestedScrollView.getScrollX:()I
        //    94: iload           8
        //    96: iconst_0       
        //    97: iload_2        
        //    98: invokevirtual   android/support/v4/widget/ScrollerCompat.startScroll:(IIII)V
        //   101: aload_0        
        //   102: invokestatic    android/support/v4/view/ViewCompat.postInvalidateOnAnimation:(Landroid/view/View;)V
        //   105: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //   108: istore          10
        //   110: iload           10
        //   112: ifeq            138
        //   115: aload_0        
        //   116: getfield        android/support/v4/widget/NestedScrollView.mScroller:Landroid/support/v4/widget/ScrollerCompat;
        //   119: invokevirtual   android/support/v4/widget/ScrollerCompat.isFinished:()Z
        //   122: ifne            132
        //   125: aload_0        
        //   126: getfield        android/support/v4/widget/NestedScrollView.mScroller:Landroid/support/v4/widget/ScrollerCompat;
        //   129: invokevirtual   android/support/v4/widget/ScrollerCompat.abortAnimation:()V
        //   132: aload_0        
        //   133: iload_1        
        //   134: iload_2        
        //   135: invokevirtual   android/support/v4/widget/NestedScrollView.scrollBy:(II)V
        //   138: aload_0        
        //   139: invokestatic    android/view/animation/AnimationUtils.currentAnimationTimeMillis:()J
        //   142: putfield        android/support/v4/widget/NestedScrollView.mLastScroll:J
        //   145: return         
        //   146: astore          9
        //   148: aload           9
        //   150: athrow         
        //   151: astore          5
        //   153: aload           5
        //   155: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      6      12     15     Ljava/lang/IllegalStateException;
        //  86     110    146    151    Ljava/lang/IllegalStateException;
        //  115    132    151    156    Ljava/lang/IllegalStateException;
        //  148    151    151    156    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0115:
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
    
    public final void smoothScrollTo(final int n, final int n2) {
        this.smoothScrollBy(n - this.getScrollX(), n2 - this.getScrollY());
    }
    
    public boolean startNestedScroll(final int n) {
        return this.mChildHelper.startNestedScroll(n);
    }
    
    public void stopNestedScroll() {
        this.mChildHelper.stopNestedScroll();
    }
}
