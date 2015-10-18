// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.view.Window$Callback;
import android.support.v7.internal.view.menu.MenuPresenter$Callback;
import android.view.Menu;
import android.support.v7.appcompat.R$id;
import android.os.Build$VERSION;
import android.content.res.Configuration;
import android.support.v4.view.ViewCompat;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.appcompat.R$attr;
import android.graphics.drawable.Drawable;
import android.support.v4.view.NestedScrollingParentHelper;
import android.support.v4.widget.ScrollerCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.graphics.Rect;
import android.support.v4.view.NestedScrollingParent;
import android.view.ViewGroup;

public class ActionBarOverlayLayout extends ViewGroup implements DecorContentParent, NestedScrollingParent
{
    static final int[] ATTRS;
    private static final String z;
    private final int ACTION_BAR_ANIMATE_DELAY;
    private ActionBarContainer mActionBarBottom;
    private int mActionBarHeight;
    private ActionBarContainer mActionBarTop;
    private ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback;
    private final Runnable mAddActionBarHideOffset;
    private boolean mAnimatingForFling;
    private final Rect mBaseContentInsets;
    private final Rect mBaseInnerInsets;
    private final ViewPropertyAnimatorListener mBottomAnimatorListener;
    private ContentFrameLayout mContent;
    private final Rect mContentInsets;
    private ViewPropertyAnimatorCompat mCurrentActionBarBottomAnimator;
    private ViewPropertyAnimatorCompat mCurrentActionBarTopAnimator;
    private DecorToolbar mDecorToolbar;
    private ScrollerCompat mFlingEstimator;
    private boolean mHasNonEmbeddedTabs;
    private boolean mHideOnContentScroll;
    private int mHideOnContentScrollReference;
    private boolean mIgnoreWindowContentOverlay;
    private final Rect mInnerInsets;
    private final Rect mLastBaseContentInsets;
    private final Rect mLastInnerInsets;
    private int mLastSystemUiVisibility;
    private boolean mOverlayMode;
    private final NestedScrollingParentHelper mParentHelper;
    private final Runnable mRemoveActionBarHideOffset;
    private final ViewPropertyAnimatorListener mTopAnimatorListener;
    private Drawable mWindowContentOverlay;
    private int mWindowVisibility;
    
    static {
        final char[] charArray = "!E@1+BIO}:BE\u000er:\u0001K\\6+\rKBt>\u0010\u0004Ac+BKH6".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '_';
                    break;
                }
                case 0: {
                    c2 = 'b';
                    break;
                }
                case 1: {
                    c2 = '$';
                    break;
                }
                case 2: {
                    c2 = '.';
                    break;
                }
                case 3: {
                    c2 = '\u0016';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
        ATTRS = new int[] { R$attr.actionBarSize, 16842841 };
    }
    
    public ActionBarOverlayLayout(final Context context) {
        this(context, null);
    }
    
    public ActionBarOverlayLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.mWindowVisibility = 0;
        this.mBaseContentInsets = new Rect();
        this.mLastBaseContentInsets = new Rect();
        this.mContentInsets = new Rect();
        this.mBaseInnerInsets = new Rect();
        this.mInnerInsets = new Rect();
        this.mLastInnerInsets = new Rect();
        this.ACTION_BAR_ANIMATE_DELAY = 600;
        this.mTopAnimatorListener = new ActionBarOverlayLayout$1(this);
        this.mBottomAnimatorListener = new ActionBarOverlayLayout$2(this);
        this.mRemoveActionBarHideOffset = new ActionBarOverlayLayout$3(this);
        this.mAddActionBarHideOffset = new ActionBarOverlayLayout$4(this);
        this.init(context);
        this.mParentHelper = new NestedScrollingParentHelper(this);
    }
    
    static ViewPropertyAnimatorCompat access$002(final ActionBarOverlayLayout actionBarOverlayLayout, final ViewPropertyAnimatorCompat mCurrentActionBarTopAnimator) {
        return actionBarOverlayLayout.mCurrentActionBarTopAnimator = mCurrentActionBarTopAnimator;
    }
    
    static boolean access$102(final ActionBarOverlayLayout actionBarOverlayLayout, final boolean mAnimatingForFling) {
        return actionBarOverlayLayout.mAnimatingForFling = mAnimatingForFling;
    }
    
    static ViewPropertyAnimatorCompat access$202(final ActionBarOverlayLayout actionBarOverlayLayout, final ViewPropertyAnimatorCompat mCurrentActionBarBottomAnimator) {
        return actionBarOverlayLayout.mCurrentActionBarBottomAnimator = mCurrentActionBarBottomAnimator;
    }
    
    static void access$300(final ActionBarOverlayLayout actionBarOverlayLayout) {
        actionBarOverlayLayout.haltActionBarHideOffsetAnimations();
    }
    
    static ViewPropertyAnimatorListener access$400(final ActionBarOverlayLayout actionBarOverlayLayout) {
        return actionBarOverlayLayout.mTopAnimatorListener;
    }
    
    static ActionBarContainer access$500(final ActionBarOverlayLayout actionBarOverlayLayout) {
        return actionBarOverlayLayout.mActionBarTop;
    }
    
    static ActionBarContainer access$600(final ActionBarOverlayLayout actionBarOverlayLayout) {
        return actionBarOverlayLayout.mActionBarBottom;
    }
    
    static ViewPropertyAnimatorListener access$700(final ActionBarOverlayLayout actionBarOverlayLayout) {
        return actionBarOverlayLayout.mBottomAnimatorListener;
    }
    
    private void addActionBarHideOffset() {
        this.haltActionBarHideOffsetAnimations();
        this.mAddActionBarHideOffset.run();
    }
    
    private boolean applyInsets(final View p0, final Rect p1, final boolean p2, final boolean p3, final boolean p4, final boolean p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //     4: checkcast       Landroid/support/v7/internal/widget/ActionBarOverlayLayout$LayoutParams;
        //     7: astore          7
        //     9: iconst_0       
        //    10: istore          8
        //    12: iload_3        
        //    13: ifeq            51
        //    16: aload           7
        //    18: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout$LayoutParams.leftMargin:I
        //    21: istore          19
        //    23: aload_2        
        //    24: getfield        android/graphics/Rect.left:I
        //    27: istore          20
        //    29: iconst_0       
        //    30: istore          8
        //    32: iload           19
        //    34: iload           20
        //    36: if_icmpeq       51
        //    39: aload           7
        //    41: aload_2        
        //    42: getfield        android/graphics/Rect.left:I
        //    45: putfield        android/support/v7/internal/widget/ActionBarOverlayLayout$LayoutParams.leftMargin:I
        //    48: iconst_1       
        //    49: istore          8
        //    51: iload           4
        //    53: ifeq            88
        //    56: aload           7
        //    58: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout$LayoutParams.topMargin:I
        //    61: istore          16
        //    63: aload_2        
        //    64: getfield        android/graphics/Rect.top:I
        //    67: istore          17
        //    69: iload           16
        //    71: iload           17
        //    73: if_icmpeq       88
        //    76: aload           7
        //    78: aload_2        
        //    79: getfield        android/graphics/Rect.top:I
        //    82: putfield        android/support/v7/internal/widget/ActionBarOverlayLayout$LayoutParams.topMargin:I
        //    85: iconst_1       
        //    86: istore          8
        //    88: iload           6
        //    90: ifeq            125
        //    93: aload           7
        //    95: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout$LayoutParams.rightMargin:I
        //    98: istore          13
        //   100: aload_2        
        //   101: getfield        android/graphics/Rect.right:I
        //   104: istore          14
        //   106: iload           13
        //   108: iload           14
        //   110: if_icmpeq       125
        //   113: aload           7
        //   115: aload_2        
        //   116: getfield        android/graphics/Rect.right:I
        //   119: putfield        android/support/v7/internal/widget/ActionBarOverlayLayout$LayoutParams.rightMargin:I
        //   122: iconst_1       
        //   123: istore          8
        //   125: iload           5
        //   127: ifeq            181
        //   130: aload           7
        //   132: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout$LayoutParams.bottomMargin:I
        //   135: istore          10
        //   137: aload_2        
        //   138: getfield        android/graphics/Rect.bottom:I
        //   141: istore          11
        //   143: iload           10
        //   145: iload           11
        //   147: if_icmpeq       181
        //   150: aload           7
        //   152: aload_2        
        //   153: getfield        android/graphics/Rect.bottom:I
        //   156: putfield        android/support/v7/internal/widget/ActionBarOverlayLayout$LayoutParams.bottomMargin:I
        //   159: iconst_1       
        //   160: ireturn        
        //   161: astore          18
        //   163: aload           18
        //   165: athrow         
        //   166: astore          15
        //   168: aload           15
        //   170: athrow         
        //   171: astore          12
        //   173: aload           12
        //   175: athrow         
        //   176: astore          9
        //   178: aload           9
        //   180: athrow         
        //   181: iload           8
        //   183: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  16     29     161    166    Ljava/lang/IllegalStateException;
        //  56     69     166    171    Ljava/lang/IllegalStateException;
        //  93     106    171    176    Ljava/lang/IllegalStateException;
        //  130    143    176    181    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 90, Size: 90
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
    
    private DecorToolbar getDecorToolbar(final View view) {
        try {
            if (view instanceof DecorToolbar) {
                return (DecorToolbar)view;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            if (view instanceof Toolbar) {
                return ((Toolbar)view).getWrapper();
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
        throw new IllegalStateException(ActionBarOverlayLayout.z + view.getClass().getSimpleName());
    }
    
    private void haltActionBarHideOffsetAnimations() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_0        
        //     2: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mRemoveActionBarHideOffset:Ljava/lang/Runnable;
        //     5: invokevirtual   android/support/v7/internal/widget/ActionBarOverlayLayout.removeCallbacks:(Ljava/lang/Runnable;)Z
        //     8: pop            
        //     9: aload_0        
        //    10: aload_0        
        //    11: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mAddActionBarHideOffset:Ljava/lang/Runnable;
        //    14: invokevirtual   android/support/v7/internal/widget/ActionBarOverlayLayout.removeCallbacks:(Ljava/lang/Runnable;)Z
        //    17: pop            
        //    18: aload_0        
        //    19: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mCurrentActionBarTopAnimator:Landroid/support/v4/view/ViewPropertyAnimatorCompat;
        //    22: ifnull          32
        //    25: aload_0        
        //    26: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mCurrentActionBarTopAnimator:Landroid/support/v4/view/ViewPropertyAnimatorCompat;
        //    29: invokevirtual   android/support/v4/view/ViewPropertyAnimatorCompat.cancel:()V
        //    32: aload_0        
        //    33: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mCurrentActionBarBottomAnimator:Landroid/support/v4/view/ViewPropertyAnimatorCompat;
        //    36: ifnull          46
        //    39: aload_0        
        //    40: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mCurrentActionBarBottomAnimator:Landroid/support/v4/view/ViewPropertyAnimatorCompat;
        //    43: invokevirtual   android/support/v4/view/ViewPropertyAnimatorCompat.cancel:()V
        //    46: return         
        //    47: astore_1       
        //    48: aload_1        
        //    49: athrow         
        //    50: astore          4
        //    52: aload           4
        //    54: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      32     47     50     Ljava/lang/IllegalStateException;
        //  32     46     50     55     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0032:
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
    
    private void init(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: aload_0        
        //     3: invokevirtual   android/support/v7/internal/widget/ActionBarOverlayLayout.getContext:()Landroid/content/Context;
        //     6: invokevirtual   android/content/Context.getTheme:()Landroid/content/res/Resources$Theme;
        //     9: getstatic       android/support/v7/internal/widget/ActionBarOverlayLayout.ATTRS:[I
        //    12: invokevirtual   android/content/res/Resources$Theme.obtainStyledAttributes:([I)Landroid/content/res/TypedArray;
        //    15: astore_3       
        //    16: aload_0        
        //    17: aload_3        
        //    18: iconst_0       
        //    19: iconst_0       
        //    20: invokevirtual   android/content/res/TypedArray.getDimensionPixelSize:(II)I
        //    23: putfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarHeight:I
        //    26: aload_0        
        //    27: aload_3        
        //    28: iconst_1       
        //    29: invokevirtual   android/content/res/TypedArray.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //    32: putfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mWindowContentOverlay:Landroid/graphics/drawable/Drawable;
        //    35: aload_0        
        //    36: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mWindowContentOverlay:Landroid/graphics/drawable/Drawable;
        //    39: astore          5
        //    41: aload           5
        //    43: ifnonnull       94
        //    46: iload_2        
        //    47: istore          6
        //    49: aload_0        
        //    50: iload           6
        //    52: invokevirtual   android/support/v7/internal/widget/ActionBarOverlayLayout.setWillNotDraw:(Z)V
        //    55: aload_3        
        //    56: invokevirtual   android/content/res/TypedArray.recycle:()V
        //    59: aload_1        
        //    60: invokevirtual   android/content/Context.getApplicationInfo:()Landroid/content/pm/ApplicationInfo;
        //    63: getfield        android/content/pm/ApplicationInfo.targetSdkVersion:I
        //    66: istore          8
        //    68: iload           8
        //    70: bipush          19
        //    72: if_icmpge       105
        //    75: aload_0        
        //    76: iload_2        
        //    77: putfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mIgnoreWindowContentOverlay:Z
        //    80: aload_0        
        //    81: aload_1        
        //    82: invokestatic    android/support/v4/widget/ScrollerCompat.create:(Landroid/content/Context;)Landroid/support/v4/widget/ScrollerCompat;
        //    85: putfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mFlingEstimator:Landroid/support/v4/widget/ScrollerCompat;
        //    88: return         
        //    89: astore          4
        //    91: aload           4
        //    93: athrow         
        //    94: iconst_0       
        //    95: istore          6
        //    97: goto            49
        //   100: astore          7
        //   102: aload           7
        //   104: athrow         
        //   105: iconst_0       
        //   106: istore_2       
        //   107: goto            75
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  16     41     89     94     Ljava/lang/IllegalStateException;
        //  49     68     100    105    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0049:
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
    
    private void postAddActionBarHideOffset() {
        this.haltActionBarHideOffsetAnimations();
        this.postDelayed(this.mAddActionBarHideOffset, 600L);
    }
    
    private void postRemoveActionBarHideOffset() {
        this.haltActionBarHideOffsetAnimations();
        this.postDelayed(this.mRemoveActionBarHideOffset, 600L);
    }
    
    private void removeActionBarHideOffset() {
        this.haltActionBarHideOffsetAnimations();
        this.mRemoveActionBarHideOffset.run();
    }
    
    private boolean shouldHideActionBarOnFling(final float n, final float n2) {
        this.mFlingEstimator.fling(0, 0, 0, (int)n2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        final int finalY = this.mFlingEstimator.getFinalY();
        try {
            final int height = this.mActionBarTop.getHeight();
            boolean b = false;
            if (finalY > height) {
                b = true;
            }
            return b;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public boolean canShowOverflowMenu() {
        this.pullChildren();
        return this.mDecorToolbar.canShowOverflowMenu();
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof ActionBarOverlayLayout$LayoutParams;
    }
    
    public void dismissPopups() {
        this.pullChildren();
        this.mDecorToolbar.dismissPopupMenus();
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
        //     6: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mWindowContentOverlay:Landroid/graphics/drawable/Drawable;
        //     9: astore          5
        //    11: aload           5
        //    13: ifnull          100
        //    16: aload_0        
        //    17: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mIgnoreWindowContentOverlay:Z
        //    20: istore          6
        //    22: iload           6
        //    24: ifne            100
        //    27: aload_0        
        //    28: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarTop:Landroid/support/v7/internal/widget/ActionBarContainer;
        //    31: invokevirtual   android/support/v7/internal/widget/ActionBarContainer.getVisibility:()I
        //    34: ifne            112
        //    37: aload_0        
        //    38: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarTop:Landroid/support/v7/internal/widget/ActionBarContainer;
        //    41: invokevirtual   android/support/v7/internal/widget/ActionBarContainer.getBottom:()I
        //    44: i2f            
        //    45: fstore          8
        //    47: aload_0        
        //    48: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarTop:Landroid/support/v7/internal/widget/ActionBarContainer;
        //    51: invokestatic    android/support/v4/view/ViewCompat.getTranslationY:(Landroid/view/View;)F
        //    54: fstore          9
        //    56: ldc_w           0.5
        //    59: fload           8
        //    61: fload           9
        //    63: fadd           
        //    64: fadd           
        //    65: f2i            
        //    66: istore          7
        //    68: aload_0        
        //    69: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mWindowContentOverlay:Landroid/graphics/drawable/Drawable;
        //    72: iconst_0       
        //    73: iload           7
        //    75: aload_0        
        //    76: invokevirtual   android/support/v7/internal/widget/ActionBarOverlayLayout.getWidth:()I
        //    79: iload           7
        //    81: aload_0        
        //    82: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mWindowContentOverlay:Landroid/graphics/drawable/Drawable;
        //    85: invokevirtual   android/graphics/drawable/Drawable.getIntrinsicHeight:()I
        //    88: iadd           
        //    89: invokevirtual   android/graphics/drawable/Drawable.setBounds:(IIII)V
        //    92: aload_0        
        //    93: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mWindowContentOverlay:Landroid/graphics/drawable/Drawable;
        //    96: aload_1        
        //    97: invokevirtual   android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
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
        //   112: iconst_0       
        //   113: istore          7
        //   115: goto            68
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      11     101    104    Ljava/lang/IllegalStateException;
        //  16     22     104    107    Ljava/lang/IllegalStateException;
        //  27     56     107    112    Ljava/lang/IllegalStateException;
        //  102    104    104    107    Ljava/lang/IllegalStateException;
        //  105    107    107    112    Ljava/lang/IllegalStateException;
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
    
    protected boolean fitSystemWindows(final Rect rect) {
        this.pullChildren();
        if ((0x100 & ViewCompat.getWindowSystemUiVisibility((View)this)) != 0x0) {}
        boolean applyInsets = this.applyInsets((View)this.mActionBarTop, rect, true, true, false, true);
        if (this.mActionBarBottom != null) {
            applyInsets |= this.applyInsets((View)this.mActionBarBottom, rect, true, false, true, true);
        }
        this.mBaseInnerInsets.set(rect);
        ViewUtils.computeFitSystemWindows((View)this, this.mBaseInnerInsets, this.mBaseContentInsets);
        if (!this.mLastBaseContentInsets.equals((Object)this.mBaseContentInsets)) {
            this.mLastBaseContentInsets.set(this.mBaseContentInsets);
            applyInsets = true;
        }
        if (!applyInsets) {
            return true;
        }
        try {
            this.requestLayout();
            return true;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    protected ActionBarOverlayLayout$LayoutParams generateDefaultLayoutParams() {
        return new ActionBarOverlayLayout$LayoutParams(-1, -1);
    }
    
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)this.generateDefaultLayoutParams();
    }
    
    public ActionBarOverlayLayout$LayoutParams generateLayoutParams(final AttributeSet set) {
        return new ActionBarOverlayLayout$LayoutParams(this.getContext(), set);
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)this.generateLayoutParams(set);
    }
    
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new ActionBarOverlayLayout$LayoutParams(viewGroup$LayoutParams);
    }
    
    public int getActionBarHideOffset() {
        try {
            if (this.mActionBarTop != null) {
                return -(int)ViewCompat.getTranslationY((View)this.mActionBarTop);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        return 0;
    }
    
    public int getNestedScrollAxes() {
        return this.mParentHelper.getNestedScrollAxes();
    }
    
    public boolean hideOverflowMenu() {
        this.pullChildren();
        return this.mDecorToolbar.hideOverflowMenu();
    }
    
    public void initFeature(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/internal/widget/AdapterViewCompat.a:I
        //     3: istore_2       
        //     4: aload_0        
        //     5: invokevirtual   android/support/v7/internal/widget/ActionBarOverlayLayout.pullChildren:()V
        //     8: iload_1        
        //     9: lookupswitch {
        //                2: 45
        //                5: 58
        //                9: 71
        //          default: 44
        //        }
        //    44: return         
        //    45: aload_0        
        //    46: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mDecorToolbar:Landroid/support/v7/internal/widget/DecorToolbar;
        //    49: invokeinterface android/support/v7/internal/widget/DecorToolbar.initProgress:()V
        //    54: iload_2        
        //    55: ifeq            44
        //    58: aload_0        
        //    59: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mDecorToolbar:Landroid/support/v7/internal/widget/DecorToolbar;
        //    62: invokeinterface android/support/v7/internal/widget/DecorToolbar.initIndeterminateProgress:()V
        //    67: iload_2        
        //    68: ifeq            44
        //    71: aload_0        
        //    72: iconst_1       
        //    73: invokevirtual   android/support/v7/internal/widget/ActionBarOverlayLayout.setOverlayMode:(Z)V
        //    76: return         
        //    77: astore          5
        //    79: aload           5
        //    81: athrow         
        //    82: astore_3       
        //    83: aload_3        
        //    84: athrow         
        //    85: astore          4
        //    87: aload           4
        //    89: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      8      82     85     Ljava/lang/IllegalStateException;
        //  45     54     85     90     Ljava/lang/IllegalStateException;
        //  58     67     77     82     Ljava/lang/IllegalStateException;
        //  71     76     77     82     Ljava/lang/IllegalStateException;
        //  83     85     85     90     Ljava/lang/IllegalStateException;
        //  87     90     77     82     Ljava/lang/IllegalStateException;
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
    
    public boolean isInOverlayMode() {
        return this.mOverlayMode;
    }
    
    public boolean isOverflowMenuShowPending() {
        this.pullChildren();
        return this.mDecorToolbar.isOverflowMenuShowPending();
    }
    
    public boolean isOverflowMenuShowing() {
        this.pullChildren();
        return this.mDecorToolbar.isOverflowMenuShowing();
    }
    
    protected void onConfigurationChanged(final Configuration configuration) {
        try {
            if (Build$VERSION.SDK_INT >= 8) {
                super.onConfigurationChanged(configuration);
            }
            this.init(this.getContext());
            ViewCompat.requestApplyInsets((View)this);
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.haltActionBarHideOffsetAnimations();
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final int a = AdapterViewCompat.a;
        final int childCount = this.getChildCount();
        final int paddingLeft = this.getPaddingLeft();
        final int n5 = n3 - n - this.getPaddingRight();
        final int paddingTop = this.getPaddingTop();
        final int n6 = n4 - n2 - this.getPaddingBottom();
        int n10;
        for (int i = 0; i < childCount; i = n10) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                final ActionBarOverlayLayout$LayoutParams actionBarOverlayLayout$LayoutParams = (ActionBarOverlayLayout$LayoutParams)child.getLayoutParams();
                final int measuredWidth = child.getMeasuredWidth();
                final int measuredHeight = child.getMeasuredHeight();
                final int n7 = paddingLeft + actionBarOverlayLayout$LayoutParams.leftMargin;
                int n9 = 0;
                Label_0143: {
                    if (child == this.mActionBarBottom) {
                        final int n8 = n6 - measuredHeight - actionBarOverlayLayout$LayoutParams.bottomMargin;
                        if (a == 0) {
                            n9 = n8;
                            break Label_0143;
                        }
                    }
                    n9 = paddingTop + actionBarOverlayLayout$LayoutParams.topMargin;
                }
                child.layout(n7, n9, n7 + measuredWidth, n9 + measuredHeight);
            }
            n10 = i + 1;
            if (a != 0) {
                break;
            }
        }
    }
    
    protected void onMeasure(final int p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/internal/widget/AdapterViewCompat.a:I
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokevirtual   android/support/v7/internal/widget/ActionBarOverlayLayout.pullChildren:()V
        //     8: aload_0        
        //     9: aload_0        
        //    10: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarTop:Landroid/support/v7/internal/widget/ActionBarContainer;
        //    13: iload_1        
        //    14: iconst_0       
        //    15: iload_2        
        //    16: iconst_0       
        //    17: invokevirtual   android/support/v7/internal/widget/ActionBarOverlayLayout.measureChildWithMargins:(Landroid/view/View;IIII)V
        //    20: aload_0        
        //    21: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarTop:Landroid/support/v7/internal/widget/ActionBarContainer;
        //    24: invokevirtual   android/support/v7/internal/widget/ActionBarContainer.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //    27: checkcast       Landroid/support/v7/internal/widget/ActionBarOverlayLayout$LayoutParams;
        //    30: astore          4
        //    32: iconst_0       
        //    33: aload_0        
        //    34: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarTop:Landroid/support/v7/internal/widget/ActionBarContainer;
        //    37: invokevirtual   android/support/v7/internal/widget/ActionBarContainer.getMeasuredWidth:()I
        //    40: aload           4
        //    42: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout$LayoutParams.leftMargin:I
        //    45: iadd           
        //    46: aload           4
        //    48: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout$LayoutParams.rightMargin:I
        //    51: iadd           
        //    52: invokestatic    java/lang/Math.max:(II)I
        //    55: istore          5
        //    57: iconst_0       
        //    58: aload_0        
        //    59: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarTop:Landroid/support/v7/internal/widget/ActionBarContainer;
        //    62: invokevirtual   android/support/v7/internal/widget/ActionBarContainer.getMeasuredHeight:()I
        //    65: aload           4
        //    67: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout$LayoutParams.topMargin:I
        //    70: iadd           
        //    71: aload           4
        //    73: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout$LayoutParams.bottomMargin:I
        //    76: iadd           
        //    77: invokestatic    java/lang/Math.max:(II)I
        //    80: istore          6
        //    82: iconst_0       
        //    83: aload_0        
        //    84: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarTop:Landroid/support/v7/internal/widget/ActionBarContainer;
        //    87: invokestatic    android/support/v4/view/ViewCompat.getMeasuredState:(Landroid/view/View;)I
        //    90: invokestatic    android/support/v7/internal/widget/ViewUtils.combineMeasuredStates:(II)I
        //    93: istore          7
        //    95: aload_0        
        //    96: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarBottom:Landroid/support/v7/internal/widget/ActionBarContainer;
        //    99: ifnull          742
        //   102: aload_0        
        //   103: aload_0        
        //   104: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarBottom:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   107: iload_1        
        //   108: iconst_0       
        //   109: iload_2        
        //   110: iconst_0       
        //   111: invokevirtual   android/support/v7/internal/widget/ActionBarOverlayLayout.measureChildWithMargins:(Landroid/view/View;IIII)V
        //   114: aload_0        
        //   115: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarBottom:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   118: invokevirtual   android/support/v7/internal/widget/ActionBarContainer.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   121: checkcast       Landroid/support/v7/internal/widget/ActionBarOverlayLayout$LayoutParams;
        //   124: astore          38
        //   126: iload           5
        //   128: aload_0        
        //   129: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarBottom:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   132: invokevirtual   android/support/v7/internal/widget/ActionBarContainer.getMeasuredWidth:()I
        //   135: aload           38
        //   137: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout$LayoutParams.leftMargin:I
        //   140: iadd           
        //   141: aload           38
        //   143: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout$LayoutParams.rightMargin:I
        //   146: iadd           
        //   147: invokestatic    java/lang/Math.max:(II)I
        //   150: istore          39
        //   152: iload           6
        //   154: aload_0        
        //   155: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarBottom:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   158: invokevirtual   android/support/v7/internal/widget/ActionBarContainer.getMeasuredHeight:()I
        //   161: aload           38
        //   163: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout$LayoutParams.topMargin:I
        //   166: iadd           
        //   167: aload           38
        //   169: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout$LayoutParams.bottomMargin:I
        //   172: iadd           
        //   173: invokestatic    java/lang/Math.max:(II)I
        //   176: istore          40
        //   178: iload           7
        //   180: aload_0        
        //   181: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarBottom:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   184: invokestatic    android/support/v4/view/ViewCompat.getMeasuredState:(Landroid/view/View;)I
        //   187: invokestatic    android/support/v7/internal/widget/ViewUtils.combineMeasuredStates:(II)I
        //   190: istore          10
        //   192: iload           39
        //   194: istore          9
        //   196: iload           40
        //   198: istore          8
        //   200: sipush          256
        //   203: aload_0        
        //   204: invokestatic    android/support/v4/view/ViewCompat.getWindowSystemUiVisibility:(Landroid/view/View;)I
        //   207: iand           
        //   208: ifeq            676
        //   211: iconst_1       
        //   212: istore          11
        //   214: iload           11
        //   216: ifeq            736
        //   219: aload_0        
        //   220: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarHeight:I
        //   223: istore          13
        //   225: aload_0        
        //   226: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mHasNonEmbeddedTabs:Z
        //   229: ifeq            298
        //   232: aload_0        
        //   233: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarTop:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   236: invokevirtual   android/support/v7/internal/widget/ActionBarContainer.getTabContainer:()Landroid/view/View;
        //   239: ifnull          251
        //   242: iload           13
        //   244: aload_0        
        //   245: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarHeight:I
        //   248: iadd           
        //   249: istore          13
        //   251: iload_3        
        //   252: ifeq            298
        //   255: getstatic       android/support/v7/app/AppCompatActivity.b:Z
        //   258: istore          36
        //   260: iload           36
        //   262: ifeq            687
        //   265: iconst_0       
        //   266: istore          37
        //   268: iload           37
        //   270: putstatic       android/support/v7/app/AppCompatActivity.b:Z
        //   273: iload           13
        //   275: istore          12
        //   277: aload_0        
        //   278: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarTop:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   281: invokevirtual   android/support/v7/internal/widget/ActionBarContainer.getVisibility:()I
        //   284: bipush          8
        //   286: if_icmpeq       729
        //   289: aload_0        
        //   290: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarTop:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   293: invokevirtual   android/support/v7/internal/widget/ActionBarContainer.getMeasuredHeight:()I
        //   296: istore          13
        //   298: aload_0        
        //   299: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mDecorToolbar:Landroid/support/v7/internal/widget/DecorToolbar;
        //   302: invokeinterface android/support/v7/internal/widget/DecorToolbar.isSplit:()Z
        //   307: istore          16
        //   309: iload           16
        //   311: ifeq            723
        //   314: aload_0        
        //   315: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarBottom:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   318: astore          34
        //   320: aload           34
        //   322: ifnull          723
        //   325: iload           11
        //   327: ifeq            340
        //   330: aload_0        
        //   331: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarHeight:I
        //   334: istore          17
        //   336: iload_3        
        //   337: ifeq            349
        //   340: aload_0        
        //   341: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarBottom:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   344: invokevirtual   android/support/v7/internal/widget/ActionBarContainer.getMeasuredHeight:()I
        //   347: istore          17
        //   349: aload_0        
        //   350: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mContentInsets:Landroid/graphics/Rect;
        //   353: aload_0        
        //   354: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mBaseContentInsets:Landroid/graphics/Rect;
        //   357: invokevirtual   android/graphics/Rect.set:(Landroid/graphics/Rect;)V
        //   360: aload_0        
        //   361: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mInnerInsets:Landroid/graphics/Rect;
        //   364: aload_0        
        //   365: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mBaseInnerInsets:Landroid/graphics/Rect;
        //   368: invokevirtual   android/graphics/Rect.set:(Landroid/graphics/Rect;)V
        //   371: aload_0        
        //   372: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mOverlayMode:Z
        //   375: istore          21
        //   377: iload           21
        //   379: ifne            429
        //   382: iload           11
        //   384: ifne            429
        //   387: aload_0        
        //   388: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mContentInsets:Landroid/graphics/Rect;
        //   391: astore          32
        //   393: aload           32
        //   395: iload           13
        //   397: aload           32
        //   399: getfield        android/graphics/Rect.top:I
        //   402: iadd           
        //   403: putfield        android/graphics/Rect.top:I
        //   406: aload_0        
        //   407: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mContentInsets:Landroid/graphics/Rect;
        //   410: astore          33
        //   412: aload           33
        //   414: iload           17
        //   416: aload           33
        //   418: getfield        android/graphics/Rect.bottom:I
        //   421: iadd           
        //   422: putfield        android/graphics/Rect.bottom:I
        //   425: iload_3        
        //   426: ifeq            467
        //   429: aload_0        
        //   430: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mInnerInsets:Landroid/graphics/Rect;
        //   433: astore          22
        //   435: aload           22
        //   437: iload           13
        //   439: aload           22
        //   441: getfield        android/graphics/Rect.top:I
        //   444: iadd           
        //   445: putfield        android/graphics/Rect.top:I
        //   448: aload_0        
        //   449: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mInnerInsets:Landroid/graphics/Rect;
        //   452: astore          23
        //   454: aload           23
        //   456: iload           17
        //   458: aload           23
        //   460: getfield        android/graphics/Rect.bottom:I
        //   463: iadd           
        //   464: putfield        android/graphics/Rect.bottom:I
        //   467: aload_0        
        //   468: aload_0        
        //   469: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mContent:Landroid/support/v7/internal/widget/ContentFrameLayout;
        //   472: aload_0        
        //   473: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mContentInsets:Landroid/graphics/Rect;
        //   476: iconst_1       
        //   477: iconst_1       
        //   478: iconst_1       
        //   479: iconst_1       
        //   480: invokespecial   android/support/v7/internal/widget/ActionBarOverlayLayout.applyInsets:(Landroid/view/View;Landroid/graphics/Rect;ZZZZ)Z
        //   483: pop            
        //   484: aload_0        
        //   485: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mLastInnerInsets:Landroid/graphics/Rect;
        //   488: aload_0        
        //   489: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mInnerInsets:Landroid/graphics/Rect;
        //   492: invokevirtual   android/graphics/Rect.equals:(Ljava/lang/Object;)Z
        //   495: ifne            520
        //   498: aload_0        
        //   499: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mLastInnerInsets:Landroid/graphics/Rect;
        //   502: aload_0        
        //   503: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mInnerInsets:Landroid/graphics/Rect;
        //   506: invokevirtual   android/graphics/Rect.set:(Landroid/graphics/Rect;)V
        //   509: aload_0        
        //   510: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mContent:Landroid/support/v7/internal/widget/ContentFrameLayout;
        //   513: aload_0        
        //   514: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mInnerInsets:Landroid/graphics/Rect;
        //   517: invokevirtual   android/support/v7/internal/widget/ContentFrameLayout.dispatchFitSystemWindows:(Landroid/graphics/Rect;)V
        //   520: aload_0        
        //   521: aload_0        
        //   522: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mContent:Landroid/support/v7/internal/widget/ContentFrameLayout;
        //   525: iload_1        
        //   526: iconst_0       
        //   527: iload_2        
        //   528: iconst_0       
        //   529: invokevirtual   android/support/v7/internal/widget/ActionBarOverlayLayout.measureChildWithMargins:(Landroid/view/View;IIII)V
        //   532: aload_0        
        //   533: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mContent:Landroid/support/v7/internal/widget/ContentFrameLayout;
        //   536: invokevirtual   android/support/v7/internal/widget/ContentFrameLayout.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   539: checkcast       Landroid/support/v7/internal/widget/ActionBarOverlayLayout$LayoutParams;
        //   542: astore          26
        //   544: iload           9
        //   546: aload_0        
        //   547: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mContent:Landroid/support/v7/internal/widget/ContentFrameLayout;
        //   550: invokevirtual   android/support/v7/internal/widget/ContentFrameLayout.getMeasuredWidth:()I
        //   553: aload           26
        //   555: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout$LayoutParams.leftMargin:I
        //   558: iadd           
        //   559: aload           26
        //   561: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout$LayoutParams.rightMargin:I
        //   564: iadd           
        //   565: invokestatic    java/lang/Math.max:(II)I
        //   568: istore          27
        //   570: iload           8
        //   572: aload_0        
        //   573: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mContent:Landroid/support/v7/internal/widget/ContentFrameLayout;
        //   576: invokevirtual   android/support/v7/internal/widget/ContentFrameLayout.getMeasuredHeight:()I
        //   579: aload           26
        //   581: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout$LayoutParams.topMargin:I
        //   584: iadd           
        //   585: aload           26
        //   587: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout$LayoutParams.bottomMargin:I
        //   590: iadd           
        //   591: invokestatic    java/lang/Math.max:(II)I
        //   594: istore          28
        //   596: iload           10
        //   598: aload_0        
        //   599: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mContent:Landroid/support/v7/internal/widget/ContentFrameLayout;
        //   602: invokestatic    android/support/v4/view/ViewCompat.getMeasuredState:(Landroid/view/View;)I
        //   605: invokestatic    android/support/v7/internal/widget/ViewUtils.combineMeasuredStates:(II)I
        //   608: istore          29
        //   610: iload           27
        //   612: aload_0        
        //   613: invokevirtual   android/support/v7/internal/widget/ActionBarOverlayLayout.getPaddingLeft:()I
        //   616: aload_0        
        //   617: invokevirtual   android/support/v7/internal/widget/ActionBarOverlayLayout.getPaddingRight:()I
        //   620: iadd           
        //   621: iadd           
        //   622: istore          30
        //   624: iload           28
        //   626: aload_0        
        //   627: invokevirtual   android/support/v7/internal/widget/ActionBarOverlayLayout.getPaddingTop:()I
        //   630: aload_0        
        //   631: invokevirtual   android/support/v7/internal/widget/ActionBarOverlayLayout.getPaddingBottom:()I
        //   634: iadd           
        //   635: iadd           
        //   636: aload_0        
        //   637: invokevirtual   android/support/v7/internal/widget/ActionBarOverlayLayout.getSuggestedMinimumHeight:()I
        //   640: invokestatic    java/lang/Math.max:(II)I
        //   643: istore          31
        //   645: aload_0        
        //   646: iload           30
        //   648: aload_0        
        //   649: invokevirtual   android/support/v7/internal/widget/ActionBarOverlayLayout.getSuggestedMinimumWidth:()I
        //   652: invokestatic    java/lang/Math.max:(II)I
        //   655: iload_1        
        //   656: iload           29
        //   658: invokestatic    android/support/v4/view/ViewCompat.resolveSizeAndState:(III)I
        //   661: iload           31
        //   663: iload_2        
        //   664: iload           29
        //   666: bipush          16
        //   668: ishl           
        //   669: invokestatic    android/support/v4/view/ViewCompat.resolveSizeAndState:(III)I
        //   672: invokevirtual   android/support/v7/internal/widget/ActionBarOverlayLayout.setMeasuredDimension:(II)V
        //   675: return         
        //   676: iconst_0       
        //   677: istore          11
        //   679: goto            214
        //   682: astore          35
        //   684: aload           35
        //   686: athrow         
        //   687: iconst_1       
        //   688: istore          37
        //   690: goto            268
        //   693: astore          14
        //   695: aload           14
        //   697: athrow         
        //   698: astore          15
        //   700: aload           15
        //   702: athrow         
        //   703: astore          18
        //   705: aload           18
        //   707: athrow         
        //   708: astore          19
        //   710: aload           19
        //   712: athrow         
        //   713: astore          20
        //   715: aload           20
        //   717: athrow         
        //   718: astore          24
        //   720: aload           24
        //   722: athrow         
        //   723: iconst_0       
        //   724: istore          17
        //   726: goto            349
        //   729: iload           12
        //   731: istore          13
        //   733: goto            298
        //   736: iconst_0       
        //   737: istore          12
        //   739: goto            277
        //   742: iload           6
        //   744: istore          8
        //   746: iload           5
        //   748: istore          9
        //   750: iload           7
        //   752: istore          10
        //   754: goto            200
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  255    260    682    687    Ljava/lang/IllegalStateException;
        //  298    309    693    698    Ljava/lang/IllegalStateException;
        //  314    320    698    703    Ljava/lang/IllegalStateException;
        //  349    377    703    713    Ljava/lang/IllegalStateException;
        //  387    425    713    718    Ljava/lang/IllegalStateException;
        //  429    467    713    718    Ljava/lang/IllegalStateException;
        //  467    520    718    723    Ljava/lang/IllegalStateException;
        //  695    698    698    703    Ljava/lang/IllegalStateException;
        //  705    708    708    713    Ljava/lang/IllegalStateException;
        //  710    713    713    718    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 367, Size: 367
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
    
    public boolean onNestedFling(final View p0, final float p1, final float p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mHideOnContentScroll:Z
        //     4: istore          7
        //     6: iload           7
        //     8: ifeq            16
        //    11: iload           4
        //    13: ifne            28
        //    16: iconst_0       
        //    17: ireturn        
        //    18: astore          5
        //    20: aload           5
        //    22: athrow         
        //    23: astore          6
        //    25: aload           6
        //    27: athrow         
        //    28: aload_0        
        //    29: fload_2        
        //    30: fload_3        
        //    31: invokespecial   android/support/v7/internal/widget/ActionBarOverlayLayout.shouldHideActionBarOnFling:(FF)Z
        //    34: istore          10
        //    36: iload           10
        //    38: ifeq            51
        //    41: aload_0        
        //    42: invokespecial   android/support/v7/internal/widget/ActionBarOverlayLayout.addActionBarHideOffset:()V
        //    45: getstatic       android/support/v7/internal/widget/AdapterViewCompat.a:I
        //    48: ifeq            55
        //    51: aload_0        
        //    52: invokespecial   android/support/v7/internal/widget/ActionBarOverlayLayout.removeActionBarHideOffset:()V
        //    55: aload_0        
        //    56: iconst_1       
        //    57: putfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mAnimatingForFling:Z
        //    60: iconst_1       
        //    61: ireturn        
        //    62: astore          8
        //    64: aload           8
        //    66: athrow         
        //    67: astore          9
        //    69: aload           9
        //    71: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      6      18     28     Ljava/lang/IllegalStateException;
        //  20     23     23     28     Ljava/lang/IllegalStateException;
        //  28     36     62     67     Ljava/lang/IllegalStateException;
        //  41     51     67     72     Ljava/lang/IllegalStateException;
        //  51     55     67     72     Ljava/lang/IllegalStateException;
        //  64     67     67     72     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0051:
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
    
    public boolean onNestedPreFling(final View view, final float n, final float n2) {
        return false;
    }
    
    public void onNestedPreScroll(final View view, final int n, final int n2, final int[] array) {
    }
    
    public void onNestedScroll(final View view, final int n, final int n2, final int n3, final int n4) {
        this.setActionBarHideOffset(this.mHideOnContentScrollReference += n2);
    }
    
    public void onNestedScrollAccepted(final View view, final View view2, final int n) {
        try {
            this.mParentHelper.onNestedScrollAccepted(view, view2, n);
            this.mHideOnContentScrollReference = this.getActionBarHideOffset();
            this.haltActionBarHideOffsetAnimations();
            if (this.mActionBarVisibilityCallback != null) {
                this.mActionBarVisibilityCallback.onContentScrollStarted();
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public boolean onStartNestedScroll(final View view, final View view2, final int n) {
        if ((n & 0x2) != 0x0) {
            try {
                if (this.mActionBarTop.getVisibility() != 0) {
                    return false;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            return this.mHideOnContentScroll;
        }
        return false;
    }
    
    public void onStopNestedScroll(final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mHideOnContentScroll:Z
        //     4: istore          6
        //     6: iload           6
        //     8: ifeq            58
        //    11: aload_0        
        //    12: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mAnimatingForFling:Z
        //    15: istore          8
        //    17: iload           8
        //    19: ifne            58
        //    22: aload_0        
        //    23: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mHideOnContentScrollReference:I
        //    26: istore          9
        //    28: aload_0        
        //    29: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarTop:Landroid/support/v7/internal/widget/ActionBarContainer;
        //    32: invokevirtual   android/support/v7/internal/widget/ActionBarContainer.getHeight:()I
        //    35: istore          10
        //    37: iload           9
        //    39: iload           10
        //    41: if_icmpgt       54
        //    44: aload_0        
        //    45: invokespecial   android/support/v7/internal/widget/ActionBarOverlayLayout.postRemoveActionBarHideOffset:()V
        //    48: getstatic       android/support/v7/internal/widget/AdapterViewCompat.a:I
        //    51: ifeq            58
        //    54: aload_0        
        //    55: invokespecial   android/support/v7/internal/widget/ActionBarOverlayLayout.postAddActionBarHideOffset:()V
        //    58: aload_0        
        //    59: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarVisibilityCallback:Landroid/support/v7/internal/widget/ActionBarOverlayLayout$ActionBarVisibilityCallback;
        //    62: ifnull          74
        //    65: aload_0        
        //    66: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarVisibilityCallback:Landroid/support/v7/internal/widget/ActionBarOverlayLayout$ActionBarVisibilityCallback;
        //    69: invokeinterface android/support/v7/internal/widget/ActionBarOverlayLayout$ActionBarVisibilityCallback.onContentScrollStopped:()V
        //    74: return         
        //    75: astore_2       
        //    76: aload_2        
        //    77: athrow         
        //    78: astore_3       
        //    79: aload_3        
        //    80: athrow         
        //    81: astore          4
        //    83: aload           4
        //    85: athrow         
        //    86: astore          5
        //    88: aload           5
        //    90: athrow         
        //    91: astore          7
        //    93: aload           7
        //    95: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      6      75     78     Ljava/lang/IllegalStateException;
        //  11     17     78     81     Ljava/lang/IllegalStateException;
        //  22     37     81     86     Ljava/lang/IllegalStateException;
        //  44     54     86     91     Ljava/lang/IllegalStateException;
        //  54     58     86     91     Ljava/lang/IllegalStateException;
        //  58     74     91     96     Ljava/lang/IllegalStateException;
        //  76     78     78     81     Ljava/lang/IllegalStateException;
        //  79     81     81     86     Ljava/lang/IllegalStateException;
        //  83     86     86     91     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 48, Size: 48
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
    
    public void onWindowSystemUiVisibilityChanged(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: getstatic       android/os/Build$VERSION.SDK_INT:I
        //     5: bipush          16
        //     7: if_icmplt       15
        //    10: aload_0        
        //    11: iload_1        
        //    12: invokespecial   android/view/ViewGroup.onWindowSystemUiVisibilityChanged:(I)V
        //    15: aload_0        
        //    16: invokevirtual   android/support/v7/internal/widget/ActionBarOverlayLayout.pullChildren:()V
        //    19: iload_1        
        //    20: aload_0        
        //    21: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mLastSystemUiVisibility:I
        //    24: ixor           
        //    25: istore          4
        //    27: aload_0        
        //    28: iload_1        
        //    29: putfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mLastSystemUiVisibility:I
        //    32: iload_1        
        //    33: iconst_4       
        //    34: iand           
        //    35: ifne            145
        //    38: iload_2        
        //    39: istore          6
        //    41: iload_1        
        //    42: sipush          256
        //    45: iand           
        //    46: ifeq            151
        //    49: iload_2        
        //    50: istore          7
        //    52: aload_0        
        //    53: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarVisibilityCallback:Landroid/support/v7/internal/widget/ActionBarOverlayLayout$ActionBarVisibilityCallback;
        //    56: astore          10
        //    58: aload           10
        //    60: ifnull          116
        //    63: aload_0        
        //    64: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarVisibilityCallback:Landroid/support/v7/internal/widget/ActionBarOverlayLayout$ActionBarVisibilityCallback;
        //    67: astore          12
        //    69: iload           7
        //    71: ifne            167
        //    74: aload           12
        //    76: iload_2        
        //    77: invokeinterface android/support/v7/internal/widget/ActionBarOverlayLayout$ActionBarVisibilityCallback.enableContentAnimations:(Z)V
        //    82: iload           6
        //    84: ifne            92
        //    87: iload           7
        //    89: ifne            107
        //    92: aload_0        
        //    93: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarVisibilityCallback:Landroid/support/v7/internal/widget/ActionBarOverlayLayout$ActionBarVisibilityCallback;
        //    96: invokeinterface android/support/v7/internal/widget/ActionBarOverlayLayout$ActionBarVisibilityCallback.showForSystem:()V
        //   101: getstatic       android/support/v7/internal/widget/AdapterViewCompat.a:I
        //   104: ifeq            116
        //   107: aload_0        
        //   108: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarVisibilityCallback:Landroid/support/v7/internal/widget/ActionBarOverlayLayout$ActionBarVisibilityCallback;
        //   111: invokeinterface android/support/v7/internal/widget/ActionBarOverlayLayout$ActionBarVisibilityCallback.hideForSystem:()V
        //   116: iload           4
        //   118: sipush          256
        //   121: iand           
        //   122: ifeq            136
        //   125: aload_0        
        //   126: getfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mActionBarVisibilityCallback:Landroid/support/v7/internal/widget/ActionBarOverlayLayout$ActionBarVisibilityCallback;
        //   129: ifnull          136
        //   132: aload_0        
        //   133: invokestatic    android/support/v4/view/ViewCompat.requestApplyInsets:(Landroid/view/View;)V
        //   136: return         
        //   137: astore_3       
        //   138: aload_3        
        //   139: athrow         
        //   140: astore          5
        //   142: aload           5
        //   144: athrow         
        //   145: iconst_0       
        //   146: istore          6
        //   148: goto            41
        //   151: iconst_0       
        //   152: istore          7
        //   154: goto            52
        //   157: astore          8
        //   159: aload           8
        //   161: athrow         
        //   162: astore          9
        //   164: aload           9
        //   166: athrow         
        //   167: iconst_0       
        //   168: istore_2       
        //   169: goto            74
        //   172: astore          13
        //   174: aload           13
        //   176: athrow         
        //   177: astore          14
        //   179: aload           14
        //   181: athrow         
        //   182: astore          15
        //   184: aload           15
        //   186: athrow         
        //   187: astore          11
        //   189: aload           11
        //   191: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  2      15     137    140    Ljava/lang/IllegalStateException;
        //  27     32     140    145    Ljava/lang/IllegalStateException;
        //  52     58     157    162    Ljava/lang/IllegalStateException;
        //  63     69     162    167    Ljava/lang/IllegalStateException;
        //  74     82     172    182    Ljava/lang/IllegalStateException;
        //  92     107    182    187    Ljava/lang/IllegalStateException;
        //  107    116    182    187    Ljava/lang/IllegalStateException;
        //  125    136    187    192    Ljava/lang/IllegalStateException;
        //  159    162    162    167    Ljava/lang/IllegalStateException;
        //  174    177    177    182    Ljava/lang/IllegalStateException;
        //  179    182    182    187    Ljava/lang/IllegalStateException;
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
    
    protected void onWindowVisibilityChanged(final int mWindowVisibility) {
        try {
            super.onWindowVisibilityChanged(mWindowVisibility);
            this.mWindowVisibility = mWindowVisibility;
            if (this.mActionBarVisibilityCallback != null) {
                this.mActionBarVisibilityCallback.onWindowVisibilityChanged(mWindowVisibility);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    void pullChildren() {
        try {
            if (this.mContent == null) {
                this.mContent = (ContentFrameLayout)this.findViewById(R$id.action_bar_activity_content);
                this.mActionBarTop = (ActionBarContainer)this.findViewById(R$id.action_bar_container);
                this.mDecorToolbar = this.getDecorToolbar(this.findViewById(R$id.action_bar));
                this.mActionBarBottom = (ActionBarContainer)this.findViewById(R$id.split_action_bar);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public void setActionBarHideOffset(final int n) {
        this.haltActionBarHideOffsetAnimations();
        final int height = this.mActionBarTop.getHeight();
        final int max = Math.max(0, Math.min(n, height));
        try {
            ViewCompat.setTranslationY((View)this.mActionBarTop, -max);
            if (this.mActionBarBottom != null && this.mActionBarBottom.getVisibility() != 8) {
                ViewCompat.setTranslationY((View)this.mActionBarBottom, (int)(max / height * this.mActionBarBottom.getHeight()));
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public void setActionBarVisibilityCallback(final ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback) {
        try {
            this.mActionBarVisibilityCallback = mActionBarVisibilityCallback;
            if (this.getWindowToken() != null) {
                this.mActionBarVisibilityCallback.onWindowVisibilityChanged(this.mWindowVisibility);
                if (this.mLastSystemUiVisibility != 0) {
                    this.onWindowSystemUiVisibilityChanged(this.mLastSystemUiVisibility);
                    ViewCompat.requestApplyInsets((View)this);
                }
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public void setHasNonEmbeddedTabs(final boolean mHasNonEmbeddedTabs) {
        this.mHasNonEmbeddedTabs = mHasNonEmbeddedTabs;
    }
    
    public void setHideOnContentScrollEnabled(final boolean b) {
        try {
            if (b == this.mHideOnContentScroll) {
                return;
            }
            final ActionBarOverlayLayout actionBarOverlayLayout = this;
            final boolean b2 = b;
            actionBarOverlayLayout.mHideOnContentScroll = b2;
            final boolean b3 = b;
            if (!b3) {
                final ActionBarOverlayLayout actionBarOverlayLayout2 = this;
                actionBarOverlayLayout2.haltActionBarHideOffsetAnimations();
                final ActionBarOverlayLayout actionBarOverlayLayout3 = this;
                final int n = 0;
                actionBarOverlayLayout3.setActionBarHideOffset(n);
            }
            return;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            final ActionBarOverlayLayout actionBarOverlayLayout = this;
            final boolean b2 = b;
            actionBarOverlayLayout.mHideOnContentScroll = b2;
            final boolean b3 = b;
            if (!b3) {
                final ActionBarOverlayLayout actionBarOverlayLayout2 = this;
                actionBarOverlayLayout2.haltActionBarHideOffsetAnimations();
                final ActionBarOverlayLayout actionBarOverlayLayout3 = this;
                final int n = 0;
                actionBarOverlayLayout3.setActionBarHideOffset(n);
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
    }
    
    public void setMenu(final Menu menu, final MenuPresenter$Callback menuPresenter$Callback) {
        this.pullChildren();
        this.mDecorToolbar.setMenu(menu, menuPresenter$Callback);
    }
    
    public void setMenuPrepared() {
        this.pullChildren();
        this.mDecorToolbar.setMenuPrepared();
    }
    
    public void setOverlayMode(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: iload_1        
        //     2: putfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mOverlayMode:Z
        //     5: iload_1        
        //     6: ifeq            44
        //     9: aload_0        
        //    10: invokevirtual   android/support/v7/internal/widget/ActionBarOverlayLayout.getContext:()Landroid/content/Context;
        //    13: invokevirtual   android/content/Context.getApplicationInfo:()Landroid/content/pm/ApplicationInfo;
        //    16: getfield        android/content/pm/ApplicationInfo.targetSdkVersion:I
        //    19: istore          5
        //    21: iload           5
        //    23: bipush          19
        //    25: if_icmpge       44
        //    28: iconst_1       
        //    29: istore          4
        //    31: aload_0        
        //    32: iload           4
        //    34: putfield        android/support/v7/internal/widget/ActionBarOverlayLayout.mIgnoreWindowContentOverlay:Z
        //    37: return         
        //    38: astore_2       
        //    39: aload_2        
        //    40: athrow         
        //    41: astore_3       
        //    42: aload_3        
        //    43: athrow         
        //    44: iconst_0       
        //    45: istore          4
        //    47: goto            31
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      5      38     41     Ljava/lang/IllegalStateException;
        //  9      21     41     44     Ljava/lang/IllegalStateException;
        //  39     41     41     44     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0031:
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
    
    public void setShowingForActionMode(final boolean b) {
    }
    
    public void setWindowCallback(final Window$Callback windowCallback) {
        this.pullChildren();
        this.mDecorToolbar.setWindowCallback(windowCallback);
    }
    
    public void setWindowTitle(final CharSequence windowTitle) {
        this.pullChildren();
        this.mDecorToolbar.setWindowTitle(windowTitle);
    }
    
    public boolean shouldDelayChildPressedState() {
        return false;
    }
    
    public boolean showOverflowMenu() {
        this.pullChildren();
        return this.mDecorToolbar.showOverflowMenu();
    }
}
