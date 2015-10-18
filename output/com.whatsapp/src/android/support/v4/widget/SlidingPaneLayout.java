// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Build$VERSION;
import android.graphics.Rect;
import android.view.View;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import android.view.ViewGroup;

public class SlidingPaneLayout extends ViewGroup
{
    static final SlidingPaneLayout$SlidingPanelLayoutImpl IMPL;
    public static boolean a;
    private static final String[] z;
    private boolean mCanSlide;
    private int mCoveredFadeColor;
    private final ViewDragHelper mDragHelper;
    private boolean mFirstLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private boolean mIsUnableToDrag;
    private final int mOverhangSize;
    private SlidingPaneLayout$PanelSlideListener mPanelSlideListener;
    private int mParallaxBy;
    private float mParallaxOffset;
    private final ArrayList mPostedRunnables;
    private boolean mPreservedOpenState;
    private Drawable mShadowDrawableLeft;
    private Drawable mShadowDrawableRight;
    private float mSlideOffset;
    private int mSlideRange;
    private View mSlideableView;
    private int mSliderFadeColor;
    private final Rect mTmpRect;
    
    static {
        final String[] z2 = new String[7];
        String s = "-\u0018\u0003r1\u0011]\u0007`*\u0011]\u0004z-E\u001f\u000f5\f+.:P\u001a,;#P\u001d";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        int sdk_INT = 0;
    Label_0016:
        while (true) {
            while (true) {
                final char[] charArray = s.toCharArray();
                final int length = charArray.length;
                int n3 = 0;
            Label_0284_Outer:
                while (true) {
                    Label_0240: {
                        if (length > n3) {
                            break Label_0240;
                        }
                        final String intern = new String(charArray).intern();
                        switch (n) {
                            default: {
                                array[n2] = intern;
                                s = "2\u0014\u000ea1E\u0010\u001ff-E\u0015\u000bc<E\u001c\u00045<\u001d\u001c\tay\u0013\u001c\u0006`<E\u0012\u00185\u0014$))]\u00065<8P\u00171";
                                n2 = 1;
                                array = z2;
                                n = 0;
                                continue Label_0016;
                            }
                            case 0: {
                                array[n2] = intern;
                                s = "6\u0011\u0003q0\u000b\u001a:t7\u00001\u000bl6\u0010\t";
                                n2 = 2;
                                array = z2;
                                n = 1;
                                continue Label_0016;
                            }
                            case 1: {
                                array[n2] = intern;
                                s = "\n\u0013'p8\u0016\b\u0018pcE0\u0005g<E\t\u0002t7E\t\u001dzy\u0006\u0015\u0003y=E\u000b\u0003p.\u0016]\u000bg<E\u0013\u0005ay\u0016\b\u001ae6\u0017\t\u000fqw";
                                n2 = 3;
                                array = z2;
                                n = 2;
                                continue Label_0016;
                            }
                            case 2: {
                                array[n2] = intern;
                                s = "6\u0011\u0003q0\u000b\u001a:t7\u00001\u000bl6\u0010\t";
                                n2 = 4;
                                array = z2;
                                n = 3;
                                continue Label_0016;
                            }
                            case 3: {
                                array[n2] = intern;
                                n2 = 5;
                                array = z2;
                                s = "E\u000f\u000fa,\u0017\u0013\u000fqy\u000b\b\u0006yy\u0001\u000f\u000bb0\u000b\u001aJv8\u0006\u0015\u000f";
                                n = 4;
                                continue Label_0016;
                            }
                            case 4: {
                                array[n2] = intern;
                                n2 = 6;
                                s = "\u0001\u000f\u000bb\u001a\r\u0014\u0006qcE\u001e\u0002|5\u0001]\u001c|<\u0012]";
                                n = 5;
                                array = z2;
                                continue Label_0016;
                            }
                            case 5: {
                                array[n2] = intern;
                                z = z2;
                                sdk_INT = Build$VERSION.SDK_INT;
                                if (sdk_INT >= 17) {
                                    break;
                                }
                                break Label_0016;
                            }
                        }
                        try {
                            IMPL = new SlidingPaneLayout$SlidingPanelLayoutImplJBMR1();
                            return;
                            Label_0280: {
                                final char c = 'Y';
                            }
                            while (true) {
                                break Label_0284;
                                Label_0308:
                                char c = '}';
                                break Label_0284;
                                final char c2 = charArray[n3];
                                charArray[n3] = (char)(c ^ c2);
                                ++n3;
                                continue Label_0284_Outer;
                                Label_0322:
                                c = '\u0015';
                                continue;
                                Label_0301:
                                c = 'e';
                                continue;
                                Label_0315:
                                c = 'j';
                                continue;
                            }
                        }
                        // switch([Lcom.strobel.decompiler.ast.Label;@653383f8, n3 % 5)
                        catch (IllegalStateException ex) {
                            throw ex;
                        }
                    }
                    break Label_0016;
                }
            }
            break;
        }
        if (sdk_INT >= 16) {
            try {
                IMPL = new SlidingPaneLayout$SlidingPanelLayoutImplJB();
                return;
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
        IMPL = new SlidingPaneLayout$SlidingPanelLayoutImplBase();
    }
    
    public SlidingPaneLayout(final Context context) {
        this(context, null);
    }
    
    public SlidingPaneLayout(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public SlidingPaneLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.mSliderFadeColor = -858993460;
        this.mFirstLayout = true;
        this.mTmpRect = new Rect();
        this.mPostedRunnables = new ArrayList();
        final float density = context.getResources().getDisplayMetrics().density;
        this.mOverhangSize = (int)(0.5f + 32.0f * density);
        ViewConfiguration.get(context);
        this.setWillNotDraw(false);
        ViewCompat.setAccessibilityDelegate((View)this, new SlidingPaneLayout$AccessibilityDelegate(this));
        ViewCompat.setImportantForAccessibility((View)this, 1);
        (this.mDragHelper = ViewDragHelper.create(this, 0.5f, new SlidingPaneLayout$DragHelperCallback(this, null))).setMinVelocity(density * 400.0f);
    }
    
    static boolean access$100(final SlidingPaneLayout slidingPaneLayout) {
        return slidingPaneLayout.mIsUnableToDrag;
    }
    
    static void access$1000(final SlidingPaneLayout slidingPaneLayout, final View view) {
        slidingPaneLayout.invalidateChildRegion(view);
    }
    
    static ArrayList access$1100(final SlidingPaneLayout slidingPaneLayout) {
        return slidingPaneLayout.mPostedRunnables;
    }
    
    static ViewDragHelper access$200(final SlidingPaneLayout slidingPaneLayout) {
        return slidingPaneLayout.mDragHelper;
    }
    
    static float access$300(final SlidingPaneLayout slidingPaneLayout) {
        return slidingPaneLayout.mSlideOffset;
    }
    
    static View access$400(final SlidingPaneLayout slidingPaneLayout) {
        return slidingPaneLayout.mSlideableView;
    }
    
    static boolean access$502(final SlidingPaneLayout slidingPaneLayout, final boolean mPreservedOpenState) {
        return slidingPaneLayout.mPreservedOpenState = mPreservedOpenState;
    }
    
    static void access$600(final SlidingPaneLayout slidingPaneLayout, final int n) {
        slidingPaneLayout.onPanelDragged(n);
    }
    
    static boolean access$700(final SlidingPaneLayout slidingPaneLayout) {
        return slidingPaneLayout.isLayoutRtlSupport();
    }
    
    static int access$800(final SlidingPaneLayout slidingPaneLayout) {
        return slidingPaneLayout.mSlideRange;
    }
    
    private boolean closePane(final View p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v4/widget/SlidingPaneLayout.mFirstLayout:Z
        //     4: istore          5
        //     6: iload           5
        //     8: ifne            20
        //    11: aload_0        
        //    12: fconst_0       
        //    13: iload_2        
        //    14: invokevirtual   android/support/v4/widget/SlidingPaneLayout.smoothSlideTo:(FI)Z
        //    17: ifeq            35
        //    20: aload_0        
        //    21: iconst_0       
        //    22: putfield        android/support/v4/widget/SlidingPaneLayout.mPreservedOpenState:Z
        //    25: iconst_1       
        //    26: ireturn        
        //    27: astore_3       
        //    28: aload_3        
        //    29: athrow         
        //    30: astore          4
        //    32: aload           4
        //    34: athrow         
        //    35: iconst_0       
        //    36: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      6      27     30     Ljava/lang/IllegalStateException;
        //  11     20     30     35     Ljava/lang/IllegalStateException;
        //  20     25     30     35     Ljava/lang/IllegalStateException;
        //  28     30     30     35     Ljava/lang/IllegalStateException;
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
    
    private void dimChildView(final View p0, final float p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //     4: checkcast       Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
        //     7: astore          4
        //     9: fload_2        
        //    10: fconst_0       
        //    11: fcmpl          
        //    12: ifle            114
        //    15: iload_3        
        //    16: ifeq            114
        //    19: fload_2        
        //    20: ldc             -16777216
        //    22: iload_3        
        //    23: iand           
        //    24: bipush          24
        //    26: iushr          
        //    27: i2f            
        //    28: fmul           
        //    29: f2i            
        //    30: bipush          24
        //    32: ishl           
        //    33: ldc             16777215
        //    35: iload_3        
        //    36: iand           
        //    37: ior            
        //    38: istore          11
        //    40: aload           4
        //    42: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.dimPaint:Landroid/graphics/Paint;
        //    45: ifnonnull       60
        //    48: aload           4
        //    50: new             Landroid/graphics/Paint;
        //    53: dup            
        //    54: invokespecial   android/graphics/Paint.<init>:()V
        //    57: putfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.dimPaint:Landroid/graphics/Paint;
        //    60: aload           4
        //    62: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.dimPaint:Landroid/graphics/Paint;
        //    65: new             Landroid/graphics/PorterDuffColorFilter;
        //    68: dup            
        //    69: iload           11
        //    71: getstatic       android/graphics/PorterDuff$Mode.SRC_OVER:Landroid/graphics/PorterDuff$Mode;
        //    74: invokespecial   android/graphics/PorterDuffColorFilter.<init>:(ILandroid/graphics/PorterDuff$Mode;)V
        //    77: invokevirtual   android/graphics/Paint.setColorFilter:(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;
        //    80: pop            
        //    81: aload_1        
        //    82: invokestatic    android/support/v4/view/ViewCompat.getLayerType:(Landroid/view/View;)I
        //    85: iconst_2       
        //    86: if_icmpeq       99
        //    89: aload_1        
        //    90: iconst_2       
        //    91: aload           4
        //    93: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.dimPaint:Landroid/graphics/Paint;
        //    96: invokestatic    android/support/v4/view/ViewCompat.setLayerType:(Landroid/view/View;ILandroid/graphics/Paint;)V
        //    99: aload_0        
        //   100: aload_1        
        //   101: invokespecial   android/support/v4/widget/SlidingPaneLayout.invalidateChildRegion:(Landroid/view/View;)V
        //   104: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //   107: istore          16
        //   109: iload           16
        //   111: ifeq            170
        //   114: aload_1        
        //   115: invokestatic    android/support/v4/view/ViewCompat.getLayerType:(Landroid/view/View;)I
        //   118: istore          7
        //   120: iload           7
        //   122: ifeq            170
        //   125: aload           4
        //   127: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.dimPaint:Landroid/graphics/Paint;
        //   130: ifnull          143
        //   133: aload           4
        //   135: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.dimPaint:Landroid/graphics/Paint;
        //   138: aconst_null    
        //   139: invokevirtual   android/graphics/Paint.setColorFilter:(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;
        //   142: pop            
        //   143: new             Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;
        //   146: dup            
        //   147: aload_0        
        //   148: aload_1        
        //   149: invokespecial   android/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable.<init>:(Landroid/support/v4/widget/SlidingPaneLayout;Landroid/view/View;)V
        //   152: astore          8
        //   154: aload_0        
        //   155: getfield        android/support/v4/widget/SlidingPaneLayout.mPostedRunnables:Ljava/util/ArrayList;
        //   158: aload           8
        //   160: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   163: pop            
        //   164: aload_0        
        //   165: aload           8
        //   167: invokestatic    android/support/v4/view/ViewCompat.postOnAnimation:(Landroid/view/View;Ljava/lang/Runnable;)V
        //   170: return         
        //   171: astore          12
        //   173: aload           12
        //   175: athrow         
        //   176: astore          13
        //   178: aload           13
        //   180: athrow         
        //   181: astore          15
        //   183: aload           15
        //   185: athrow         
        //   186: astore          5
        //   188: aload           5
        //   190: athrow         
        //   191: astore          6
        //   193: aload           6
        //   195: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  40     60     171    176    Ljava/lang/IllegalStateException;
        //  60     99     176    181    Ljava/lang/IllegalStateException;
        //  99     109    181    186    Ljava/lang/IllegalStateException;
        //  114    120    186    191    Ljava/lang/IllegalStateException;
        //  125    143    191    196    Ljava/lang/IllegalStateException;
        //  183    186    186    191    Ljava/lang/IllegalStateException;
        //  188    191    191    196    Ljava/lang/IllegalStateException;
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
    
    private void invalidateChildRegion(final View view) {
        SlidingPaneLayout.IMPL.invalidateChildRegion(this, view);
    }
    
    private boolean isLayoutRtlSupport() {
        try {
            if (ViewCompat.getLayoutDirection((View)this) == 1) {
                return true;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        return false;
    }
    
    private void onPanelDragged(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v4/widget/SlidingPaneLayout.mSlideableView:Landroid/view/View;
        //     4: ifnonnull       16
        //     7: aload_0        
        //     8: fconst_0       
        //     9: putfield        android/support/v4/widget/SlidingPaneLayout.mSlideOffset:F
        //    12: return         
        //    13: astore_2       
        //    14: aload_2        
        //    15: athrow         
        //    16: aload_0        
        //    17: invokespecial   android/support/v4/widget/SlidingPaneLayout.isLayoutRtlSupport:()Z
        //    20: istore_3       
        //    21: aload_0        
        //    22: getfield        android/support/v4/widget/SlidingPaneLayout.mSlideableView:Landroid/view/View;
        //    25: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //    28: checkcast       Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
        //    31: astore          4
        //    33: aload_0        
        //    34: getfield        android/support/v4/widget/SlidingPaneLayout.mSlideableView:Landroid/view/View;
        //    37: invokevirtual   android/view/View.getWidth:()I
        //    40: istore          5
        //    42: iload_3        
        //    43: ifeq            60
        //    46: aload_0        
        //    47: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getWidth:()I
        //    50: istore          15
        //    52: iload           15
        //    54: iload_1        
        //    55: isub           
        //    56: iload           5
        //    58: isub           
        //    59: istore_1       
        //    60: iload_3        
        //    61: ifeq            165
        //    64: aload_0        
        //    65: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getPaddingRight:()I
        //    68: istore          13
        //    70: iload           13
        //    72: istore          6
        //    74: iload_3        
        //    75: ifeq            179
        //    78: aload           4
        //    80: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.rightMargin:I
        //    83: istore          7
        //    85: iload_1        
        //    86: iload           6
        //    88: iload           7
        //    90: iadd           
        //    91: isub           
        //    92: i2f            
        //    93: fstore          8
        //    95: aload_0        
        //    96: fload           8
        //    98: aload_0        
        //    99: getfield        android/support/v4/widget/SlidingPaneLayout.mSlideRange:I
        //   102: i2f            
        //   103: fdiv           
        //   104: putfield        android/support/v4/widget/SlidingPaneLayout.mSlideOffset:F
        //   107: aload_0        
        //   108: getfield        android/support/v4/widget/SlidingPaneLayout.mParallaxBy:I
        //   111: ifeq            122
        //   114: aload_0        
        //   115: aload_0        
        //   116: getfield        android/support/v4/widget/SlidingPaneLayout.mSlideOffset:F
        //   119: invokespecial   android/support/v4/widget/SlidingPaneLayout.parallaxOtherViews:(F)V
        //   122: aload           4
        //   124: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.dimWhenOffset:Z
        //   127: ifeq            146
        //   130: aload_0        
        //   131: aload_0        
        //   132: getfield        android/support/v4/widget/SlidingPaneLayout.mSlideableView:Landroid/view/View;
        //   135: aload_0        
        //   136: getfield        android/support/v4/widget/SlidingPaneLayout.mSlideOffset:F
        //   139: aload_0        
        //   140: getfield        android/support/v4/widget/SlidingPaneLayout.mSliderFadeColor:I
        //   143: invokespecial   android/support/v4/widget/SlidingPaneLayout.dimChildView:(Landroid/view/View;FI)V
        //   146: aload_0        
        //   147: aload_0        
        //   148: getfield        android/support/v4/widget/SlidingPaneLayout.mSlideableView:Landroid/view/View;
        //   151: invokevirtual   android/support/v4/widget/SlidingPaneLayout.dispatchOnPanelSlide:(Landroid/view/View;)V
        //   154: return         
        //   155: astore          14
        //   157: aload           14
        //   159: athrow         
        //   160: astore          12
        //   162: aload           12
        //   164: athrow         
        //   165: aload_0        
        //   166: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getPaddingLeft:()I
        //   169: istore          6
        //   171: goto            74
        //   174: astore          11
        //   176: aload           11
        //   178: athrow         
        //   179: aload           4
        //   181: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.leftMargin:I
        //   184: istore          7
        //   186: goto            85
        //   189: astore          9
        //   191: aload           9
        //   193: athrow         
        //   194: astore          10
        //   196: aload           10
        //   198: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      12     13     16     Ljava/lang/IllegalStateException;
        //  46     52     155    160    Ljava/lang/IllegalStateException;
        //  64     70     160    165    Ljava/lang/IllegalStateException;
        //  78     85     174    179    Ljava/lang/IllegalStateException;
        //  95     122    189    194    Ljava/lang/IllegalStateException;
        //  122    146    194    199    Ljava/lang/IllegalStateException;
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
    
    private boolean openPane(final View p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v4/widget/SlidingPaneLayout.mFirstLayout:Z
        //     4: istore          5
        //     6: iload           5
        //     8: ifne            20
        //    11: aload_0        
        //    12: fconst_1       
        //    13: iload_2        
        //    14: invokevirtual   android/support/v4/widget/SlidingPaneLayout.smoothSlideTo:(FI)Z
        //    17: ifeq            35
        //    20: aload_0        
        //    21: iconst_1       
        //    22: putfield        android/support/v4/widget/SlidingPaneLayout.mPreservedOpenState:Z
        //    25: iconst_1       
        //    26: ireturn        
        //    27: astore_3       
        //    28: aload_3        
        //    29: athrow         
        //    30: astore          4
        //    32: aload           4
        //    34: athrow         
        //    35: iconst_0       
        //    36: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      6      27     30     Ljava/lang/IllegalStateException;
        //  11     20     30     35     Ljava/lang/IllegalStateException;
        //  20     25     30     35     Ljava/lang/IllegalStateException;
        //  28     30     30     35     Ljava/lang/IllegalStateException;
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
    
    private void parallaxOtherViews(final float p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: invokespecial   android/support/v4/widget/SlidingPaneLayout.isLayoutRtlSupport:()Z
        //     8: istore_3       
        //     9: aload_0        
        //    10: getfield        android/support/v4/widget/SlidingPaneLayout.mSlideableView:Landroid/view/View;
        //    13: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //    16: checkcast       Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
        //    19: astore          4
        //    21: aload           4
        //    23: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.dimWhenOffset:Z
        //    26: istore          7
        //    28: iload           7
        //    30: ifeq            120
        //    33: iload_3        
        //    34: ifeq            110
        //    37: aload           4
        //    39: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.rightMargin:I
        //    42: istore          21
        //    44: iload           21
        //    46: ifgt            120
        //    49: iconst_1       
        //    50: istore          8
        //    52: aload_0        
        //    53: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getChildCount:()I
        //    56: istore          9
        //    58: iconst_0       
        //    59: istore          10
        //    61: iload           10
        //    63: iload           9
        //    65: if_icmpge       99
        //    68: aload_0        
        //    69: iload           10
        //    71: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getChildAt:(I)Landroid/view/View;
        //    74: astore          11
        //    76: aload_0        
        //    77: getfield        android/support/v4/widget/SlidingPaneLayout.mSlideableView:Landroid/view/View;
        //    80: astore          13
        //    82: aload           11
        //    84: aload           13
        //    86: if_acmpne       131
        //    89: iload           10
        //    91: iconst_1       
        //    92: iadd           
        //    93: istore          19
        //    95: iload_2        
        //    96: ifeq            239
        //    99: return         
        //   100: astore          5
        //   102: aload           5
        //   104: athrow         
        //   105: astore          6
        //   107: aload           6
        //   109: athrow         
        //   110: aload           4
        //   112: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.leftMargin:I
        //   115: istore          21
        //   117: goto            44
        //   120: iconst_0       
        //   121: istore          8
        //   123: goto            52
        //   126: astore          12
        //   128: aload           12
        //   130: athrow         
        //   131: fconst_1       
        //   132: aload_0        
        //   133: getfield        android/support/v4/widget/SlidingPaneLayout.mParallaxOffset:F
        //   136: fsub           
        //   137: aload_0        
        //   138: getfield        android/support/v4/widget/SlidingPaneLayout.mParallaxBy:I
        //   141: i2f            
        //   142: fmul           
        //   143: f2i            
        //   144: istore          14
        //   146: aload_0        
        //   147: fload_1        
        //   148: putfield        android/support/v4/widget/SlidingPaneLayout.mParallaxOffset:F
        //   151: iload           14
        //   153: fconst_1       
        //   154: fload_1        
        //   155: fsub           
        //   156: aload_0        
        //   157: getfield        android/support/v4/widget/SlidingPaneLayout.mParallaxBy:I
        //   160: i2f            
        //   161: fmul           
        //   162: f2i            
        //   163: isub           
        //   164: istore          15
        //   166: iload_3        
        //   167: ifeq            175
        //   170: iload           15
        //   172: ineg           
        //   173: istore          15
        //   175: aload           11
        //   177: iload           15
        //   179: invokevirtual   android/view/View.offsetLeftAndRight:(I)V
        //   182: iload           8
        //   184: ifeq            89
        //   187: iload_3        
        //   188: ifeq            228
        //   191: aload_0        
        //   192: getfield        android/support/v4/widget/SlidingPaneLayout.mParallaxOffset:F
        //   195: fstore          20
        //   197: fload           20
        //   199: fconst_1       
        //   200: fsub           
        //   201: fstore          18
        //   203: aload_0        
        //   204: aload           11
        //   206: fload           18
        //   208: aload_0        
        //   209: getfield        android/support/v4/widget/SlidingPaneLayout.mCoveredFadeColor:I
        //   212: invokespecial   android/support/v4/widget/SlidingPaneLayout.dimChildView:(Landroid/view/View;FI)V
        //   215: goto            89
        //   218: astore          16
        //   220: aload           16
        //   222: athrow         
        //   223: astore          17
        //   225: aload           17
        //   227: athrow         
        //   228: fconst_1       
        //   229: aload_0        
        //   230: getfield        android/support/v4/widget/SlidingPaneLayout.mParallaxOffset:F
        //   233: fsub           
        //   234: fstore          18
        //   236: goto            203
        //   239: iload           19
        //   241: istore          10
        //   243: goto            61
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  21     28     100    105    Ljava/lang/IllegalStateException;
        //  37     44     105    110    Ljava/lang/IllegalStateException;
        //  76     82     126    131    Ljava/lang/IllegalStateException;
        //  102    105    105    110    Ljava/lang/IllegalStateException;
        //  175    182    218    223    Ljava/lang/IllegalStateException;
        //  191    197    223    228    Ljava/lang/IllegalStateException;
        //  220    223    223    228    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 130, Size: 130
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
    
    private static boolean viewIsOpaque(final View view) {
        while (true) {
            try {
                if (ViewCompat.isOpaque(view)) {
                    return true;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                if (Build$VERSION.SDK_INT >= 18) {
                    return false;
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
            final Drawable background = view.getBackground();
            if (background != null) {
                try {
                    if (background.getOpacity() != -1) {
                        return false;
                    }
                    return true;
                }
                catch (IllegalStateException ex3) {
                    throw ex3;
                }
                break;
            }
            break;
        }
        return false;
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        try {
            if (!(viewGroup$LayoutParams instanceof SlidingPaneLayout$LayoutParams)) {
                return false;
            }
            final SlidingPaneLayout slidingPaneLayout = this;
            final ViewGroup$LayoutParams viewGroup$LayoutParams2 = viewGroup$LayoutParams;
            final boolean b = slidingPaneLayout.checkLayoutParams(viewGroup$LayoutParams2);
            if (b) {
                return true;
            }
            return false;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            final SlidingPaneLayout slidingPaneLayout = this;
            final ViewGroup$LayoutParams viewGroup$LayoutParams2 = viewGroup$LayoutParams;
            final boolean b = slidingPaneLayout.checkLayoutParams(viewGroup$LayoutParams2);
            if (b) {
                return true;
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
        return false;
    }
    
    public boolean closePane() {
        return this.closePane(this.mSlideableView, 0);
    }
    
    public void computeScroll() {
        Label_0034: {
            try {
                if (!this.mDragHelper.continueSettling(true)) {
                    return;
                }
                final SlidingPaneLayout slidingPaneLayout = this;
                final boolean b = slidingPaneLayout.mCanSlide;
                if (!b) {
                    final SlidingPaneLayout slidingPaneLayout2 = this;
                    final ViewDragHelper viewDragHelper = slidingPaneLayout2.mDragHelper;
                    viewDragHelper.abort();
                    return;
                }
                break Label_0034;
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                final SlidingPaneLayout slidingPaneLayout = this;
                final boolean b = slidingPaneLayout.mCanSlide;
                if (!b) {
                    final SlidingPaneLayout slidingPaneLayout2 = this;
                    final ViewDragHelper viewDragHelper = slidingPaneLayout2.mDragHelper;
                    viewDragHelper.abort();
                    return;
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
        ViewCompat.postInvalidateOnAnimation((View)this);
    }
    
    void dispatchOnPanelClosed(final View view) {
        try {
            if (this.mPanelSlideListener != null) {
                this.mPanelSlideListener.onPanelClosed(view);
            }
            this.sendAccessibilityEvent(32);
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    void dispatchOnPanelOpened(final View view) {
        try {
            if (this.mPanelSlideListener != null) {
                this.mPanelSlideListener.onPanelOpened(view);
            }
            this.sendAccessibilityEvent(32);
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    void dispatchOnPanelSlide(final View view) {
        try {
            if (this.mPanelSlideListener != null) {
                this.mPanelSlideListener.onPanelSlide(view, this.mSlideOffset);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public void draw(final Canvas canvas) {
        final boolean a = SlidingPaneLayout.a;
        super.draw(canvas);
        while (true) {
            Label_0026: {
                if (!this.isLayoutRtlSupport()) {
                    break Label_0026;
                }
                final Drawable mShadowDrawableRight = this.mShadowDrawableRight;
                if (a) {
                    break Label_0026;
                }
                final Drawable mShadowDrawableLeft = mShadowDrawableRight;
                View child;
                while (true) {
                    while (true) {
                        try {
                            if (this.getChildCount() > 1) {
                                child = this.getChildAt(1);
                                if (child == null || mShadowDrawableLeft == null) {
                                    return;
                                }
                                break;
                            }
                        }
                        catch (IllegalStateException ex) {
                            throw ex;
                        }
                        child = null;
                        continue;
                    }
                }
                final int top = child.getTop();
                final int bottom = child.getBottom();
                final int intrinsicWidth = mShadowDrawableLeft.getIntrinsicWidth();
                int left = 0;
                int n2 = 0;
                Label_0130: {
                    if (this.isLayoutRtlSupport()) {
                        final int right = child.getRight();
                        final int n = right + intrinsicWidth;
                        if (!a) {
                            left = n;
                            n2 = right;
                            break Label_0130;
                        }
                    }
                    left = child.getLeft();
                    n2 = left - intrinsicWidth;
                }
                mShadowDrawableLeft.setBounds(n2, top, left, bottom);
                mShadowDrawableLeft.draw(canvas);
                return;
            }
            final Drawable mShadowDrawableLeft = this.mShadowDrawableLeft;
            continue;
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
        //     5: aload_2        
        //     6: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //     9: checkcast       Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
        //    12: astore          6
        //    14: aload_1        
        //    15: iconst_2       
        //    16: invokevirtual   android/graphics/Canvas.save:(I)I
        //    19: istore          7
        //    21: aload_0        
        //    22: getfield        android/support/v4/widget/SlidingPaneLayout.mCanSlide:Z
        //    25: istore          13
        //    27: iload           13
        //    29: ifeq            137
        //    32: aload           6
        //    34: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.slideable:Z
        //    37: istore          24
        //    39: iload           24
        //    41: ifne            137
        //    44: aload_0        
        //    45: getfield        android/support/v4/widget/SlidingPaneLayout.mSlideableView:Landroid/view/View;
        //    48: astore          25
        //    50: aload           25
        //    52: ifnull          137
        //    55: aload_1        
        //    56: aload_0        
        //    57: getfield        android/support/v4/widget/SlidingPaneLayout.mTmpRect:Landroid/graphics/Rect;
        //    60: invokevirtual   android/graphics/Canvas.getClipBounds:(Landroid/graphics/Rect;)Z
        //    63: pop            
        //    64: aload_0        
        //    65: invokespecial   android/support/v4/widget/SlidingPaneLayout.isLayoutRtlSupport:()Z
        //    68: istore          27
        //    70: iload           27
        //    72: ifeq            104
        //    75: aload_0        
        //    76: getfield        android/support/v4/widget/SlidingPaneLayout.mTmpRect:Landroid/graphics/Rect;
        //    79: aload_0        
        //    80: getfield        android/support/v4/widget/SlidingPaneLayout.mTmpRect:Landroid/graphics/Rect;
        //    83: getfield        android/graphics/Rect.left:I
        //    86: aload_0        
        //    87: getfield        android/support/v4/widget/SlidingPaneLayout.mSlideableView:Landroid/view/View;
        //    90: invokevirtual   android/view/View.getRight:()I
        //    93: invokestatic    java/lang/Math.max:(II)I
        //    96: putfield        android/graphics/Rect.left:I
        //    99: iload           5
        //   101: ifeq            128
        //   104: aload_0        
        //   105: getfield        android/support/v4/widget/SlidingPaneLayout.mTmpRect:Landroid/graphics/Rect;
        //   108: aload_0        
        //   109: getfield        android/support/v4/widget/SlidingPaneLayout.mTmpRect:Landroid/graphics/Rect;
        //   112: getfield        android/graphics/Rect.right:I
        //   115: aload_0        
        //   116: getfield        android/support/v4/widget/SlidingPaneLayout.mSlideableView:Landroid/view/View;
        //   119: invokevirtual   android/view/View.getLeft:()I
        //   122: invokestatic    java/lang/Math.min:(II)I
        //   125: putfield        android/graphics/Rect.right:I
        //   128: aload_1        
        //   129: aload_0        
        //   130: getfield        android/support/v4/widget/SlidingPaneLayout.mTmpRect:Landroid/graphics/Rect;
        //   133: invokevirtual   android/graphics/Canvas.clipRect:(Landroid/graphics/Rect;)Z
        //   136: pop            
        //   137: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   140: bipush          11
        //   142: if_icmplt       159
        //   145: aload_0        
        //   146: aload_1        
        //   147: aload_2        
        //   148: lload_3        
        //   149: invokespecial   android/view/ViewGroup.drawChild:(Landroid/graphics/Canvas;Landroid/view/View;J)Z
        //   152: istore          23
        //   154: iload           5
        //   156: ifeq            368
        //   159: aload           6
        //   161: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.dimWhenOffset:Z
        //   164: istore          17
        //   166: iload           17
        //   168: ifeq            287
        //   171: aload_0        
        //   172: getfield        android/support/v4/widget/SlidingPaneLayout.mSlideOffset:F
        //   175: fstore          20
        //   177: fload           20
        //   179: fconst_0       
        //   180: fcmpl          
        //   181: ifle            287
        //   184: aload_2        
        //   185: invokevirtual   android/view/View.isDrawingCacheEnabled:()Z
        //   188: ifne            196
        //   191: aload_2        
        //   192: iconst_1       
        //   193: invokevirtual   android/view/View.setDrawingCacheEnabled:(Z)V
        //   196: aload_2        
        //   197: invokevirtual   android/view/View.getDrawingCache:()Landroid/graphics/Bitmap;
        //   200: astore          21
        //   202: aload           21
        //   204: ifnull          233
        //   207: aload_1        
        //   208: aload           21
        //   210: aload_2        
        //   211: invokevirtual   android/view/View.getLeft:()I
        //   214: i2f            
        //   215: aload_2        
        //   216: invokevirtual   android/view/View.getTop:()I
        //   219: i2f            
        //   220: aload           6
        //   222: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.dimPaint:Landroid/graphics/Paint;
        //   225: invokevirtual   android/graphics/Canvas.drawBitmap:(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
        //   228: iload           5
        //   230: ifeq            362
        //   233: getstatic       android/support/v4/widget/SlidingPaneLayout.z:[Ljava/lang/String;
        //   236: iconst_4       
        //   237: aaload         
        //   238: new             Ljava/lang/StringBuilder;
        //   241: dup            
        //   242: invokespecial   java/lang/StringBuilder.<init>:()V
        //   245: getstatic       android/support/v4/widget/SlidingPaneLayout.z:[Ljava/lang/String;
        //   248: bipush          6
        //   250: aaload         
        //   251: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   254: aload_2        
        //   255: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   258: getstatic       android/support/v4/widget/SlidingPaneLayout.z:[Ljava/lang/String;
        //   261: iconst_5       
        //   262: aaload         
        //   263: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   266: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   269: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   272: pop            
        //   273: aload_0        
        //   274: aload_1        
        //   275: aload_2        
        //   276: lload_3        
        //   277: invokespecial   android/view/ViewGroup.drawChild:(Landroid/graphics/Canvas;Landroid/view/View;J)Z
        //   280: istore          19
        //   282: iload           5
        //   284: ifeq            308
        //   287: aload_2        
        //   288: invokevirtual   android/view/View.isDrawingCacheEnabled:()Z
        //   291: ifeq            299
        //   294: aload_2        
        //   295: iconst_0       
        //   296: invokevirtual   android/view/View.setDrawingCacheEnabled:(Z)V
        //   299: aload_0        
        //   300: aload_1        
        //   301: aload_2        
        //   302: lload_3        
        //   303: invokespecial   android/view/ViewGroup.drawChild:(Landroid/graphics/Canvas;Landroid/view/View;J)Z
        //   306: istore          19
        //   308: aload_1        
        //   309: iload           7
        //   311: invokevirtual   android/graphics/Canvas.restoreToCount:(I)V
        //   314: iload           19
        //   316: ireturn        
        //   317: astore          8
        //   319: aload           8
        //   321: athrow         
        //   322: astore          9
        //   324: aload           9
        //   326: athrow         
        //   327: astore          10
        //   329: aload           10
        //   331: athrow         
        //   332: astore          11
        //   334: aload           11
        //   336: athrow         
        //   337: astore          12
        //   339: aload           12
        //   341: athrow         
        //   342: astore          14
        //   344: aload           14
        //   346: athrow         
        //   347: astore          15
        //   349: aload           15
        //   351: athrow         
        //   352: astore          16
        //   354: aload           16
        //   356: athrow         
        //   357: astore          18
        //   359: aload           18
        //   361: athrow         
        //   362: iconst_0       
        //   363: istore          19
        //   365: goto            282
        //   368: iload           23
        //   370: istore          19
        //   372: goto            308
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  21     27     317    322    Ljava/lang/IllegalStateException;
        //  32     39     322    327    Ljava/lang/IllegalStateException;
        //  44     50     327    332    Ljava/lang/IllegalStateException;
        //  55     70     332    337    Ljava/lang/IllegalStateException;
        //  75     99     337    342    Ljava/lang/IllegalStateException;
        //  104    128    337    342    Ljava/lang/IllegalStateException;
        //  159    166    342    347    Ljava/lang/IllegalStateException;
        //  171    177    347    352    Ljava/lang/IllegalStateException;
        //  184    196    352    357    Ljava/lang/IllegalStateException;
        //  287    299    357    362    Ljava/lang/IllegalStateException;
        //  319    322    322    327    Ljava/lang/IllegalStateException;
        //  324    327    327    332    Ljava/lang/IllegalStateException;
        //  329    332    332    337    Ljava/lang/IllegalStateException;
        //  334    337    337    342    Ljava/lang/IllegalStateException;
        //  344    347    347    352    Ljava/lang/IllegalStateException;
        //  349    352    352    357    Ljava/lang/IllegalStateException;
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
    
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new SlidingPaneLayout$LayoutParams();
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new SlidingPaneLayout$LayoutParams(this.getContext(), set);
    }
    
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        try {
            if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
                return (ViewGroup$LayoutParams)new SlidingPaneLayout$LayoutParams((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        return (ViewGroup$LayoutParams)new SlidingPaneLayout$LayoutParams(viewGroup$LayoutParams);
    }
    
    boolean isDimmed(final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnonnull       6
        //     4: iconst_0       
        //     5: ireturn        
        //     6: aload_1        
        //     7: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //    10: checkcast       Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
        //    13: astore_2       
        //    14: aload_0        
        //    15: getfield        android/support/v4/widget/SlidingPaneLayout.mCanSlide:Z
        //    18: istore          6
        //    20: iload           6
        //    22: ifeq            68
        //    25: aload_2        
        //    26: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.dimWhenOffset:Z
        //    29: istore          8
        //    31: iload           8
        //    33: ifeq            68
        //    36: aload_0        
        //    37: getfield        android/support/v4/widget/SlidingPaneLayout.mSlideOffset:F
        //    40: fstore          9
        //    42: fload           9
        //    44: fconst_0       
        //    45: fcmpl          
        //    46: ifle            68
        //    49: iconst_1       
        //    50: istore          7
        //    52: iload           7
        //    54: ireturn        
        //    55: astore_3       
        //    56: aload_3        
        //    57: athrow         
        //    58: astore          4
        //    60: aload           4
        //    62: athrow         
        //    63: astore          5
        //    65: aload           5
        //    67: athrow         
        //    68: iconst_0       
        //    69: istore          7
        //    71: goto            52
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  14     20     55     58     Ljava/lang/IllegalStateException;
        //  25     31     58     63     Ljava/lang/IllegalStateException;
        //  36     42     63     68     Ljava/lang/IllegalStateException;
        //  56     58     58     63     Ljava/lang/IllegalStateException;
        //  60     63     63     68     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 41, Size: 41
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
    
    public boolean isOpen() {
        try {
            if (!this.mCanSlide) {
                return true;
            }
            final SlidingPaneLayout slidingPaneLayout = this;
            final float n = slidingPaneLayout.mSlideOffset;
            final float n2 = 1.0f;
            final float n3 = fcmpl(n, n2);
            if (n3 == 0) {
                return true;
            }
            return false;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            final SlidingPaneLayout slidingPaneLayout = this;
            final float n = slidingPaneLayout.mSlideOffset;
            final float n2 = 1.0f;
            final float n3 = fcmpl(n, n2);
            if (n3 == 0) {
                return true;
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
        return false;
    }
    
    public boolean isSlideable() {
        return this.mCanSlide;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }
    
    protected void onDetachedFromWindow() {
        final boolean a = SlidingPaneLayout.a;
        super.onDetachedFromWindow();
        this.mFirstLayout = true;
        int n;
        for (int size = this.mPostedRunnables.size(), i = 0; i < size; i = n) {
            ((SlidingPaneLayout$DisableLayerRunnable)this.mPostedRunnables.get(i)).run();
            n = i + 1;
            if (a) {
                break;
            }
        }
        this.mPostedRunnables.clear();
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: invokestatic    android/support/v4/view/MotionEventCompat.getActionMasked:(Landroid/view/MotionEvent;)I
        //     4: istore_2       
        //     5: aload_0        
        //     6: getfield        android/support/v4/widget/SlidingPaneLayout.mCanSlide:Z
        //     9: istore          5
        //    11: iload           5
        //    13: ifne            79
        //    16: iload_2        
        //    17: ifne            79
        //    20: aload_0        
        //    21: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getChildCount:()I
        //    24: istore          24
        //    26: iload           24
        //    28: iconst_1       
        //    29: if_icmple       79
        //    32: aload_0        
        //    33: iconst_1       
        //    34: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getChildAt:(I)Landroid/view/View;
        //    37: astore          25
        //    39: aload           25
        //    41: ifnull          79
        //    44: aload_0        
        //    45: getfield        android/support/v4/widget/SlidingPaneLayout.mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
        //    48: aload           25
        //    50: aload_1        
        //    51: invokevirtual   android/view/MotionEvent.getX:()F
        //    54: f2i            
        //    55: aload_1        
        //    56: invokevirtual   android/view/MotionEvent.getY:()F
        //    59: f2i            
        //    60: invokevirtual   android/support/v4/widget/ViewDragHelper.isViewUnder:(Landroid/view/View;II)Z
        //    63: istore          27
        //    65: iload           27
        //    67: ifne            139
        //    70: iconst_1       
        //    71: istore          28
        //    73: aload_0        
        //    74: iload           28
        //    76: putfield        android/support/v4/widget/SlidingPaneLayout.mPreservedOpenState:Z
        //    79: aload_0        
        //    80: getfield        android/support/v4/widget/SlidingPaneLayout.mCanSlide:Z
        //    83: istore          9
        //    85: iload           9
        //    87: ifeq            105
        //    90: aload_0        
        //    91: getfield        android/support/v4/widget/SlidingPaneLayout.mIsUnableToDrag:Z
        //    94: istore          12
        //    96: iload           12
        //    98: ifeq            160
        //   101: iload_2        
        //   102: ifeq            160
        //   105: aload_0        
        //   106: getfield        android/support/v4/widget/SlidingPaneLayout.mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
        //   109: invokevirtual   android/support/v4/widget/ViewDragHelper.cancel:()V
        //   112: aload_0        
        //   113: aload_1        
        //   114: invokespecial   android/view/ViewGroup.onInterceptTouchEvent:(Landroid/view/MotionEvent;)Z
        //   117: istore          10
        //   119: iload           10
        //   121: istore          11
        //   123: iload           11
        //   125: ireturn        
        //   126: astore_3       
        //   127: aload_3        
        //   128: athrow         
        //   129: astore          4
        //   131: aload           4
        //   133: athrow         
        //   134: astore          26
        //   136: aload           26
        //   138: athrow         
        //   139: iconst_0       
        //   140: istore          28
        //   142: goto            73
        //   145: astore          6
        //   147: aload           6
        //   149: athrow         
        //   150: astore          7
        //   152: aload           7
        //   154: athrow         
        //   155: astore          8
        //   157: aload           8
        //   159: athrow         
        //   160: iload_2        
        //   161: iconst_3       
        //   162: if_icmpeq       170
        //   165: iload_2        
        //   166: iconst_1       
        //   167: if_icmpne       184
        //   170: aload_0        
        //   171: getfield        android/support/v4/widget/SlidingPaneLayout.mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
        //   174: invokevirtual   android/support/v4/widget/ViewDragHelper.cancel:()V
        //   177: iconst_0       
        //   178: ireturn        
        //   179: astore          13
        //   181: aload           13
        //   183: athrow         
        //   184: iload_2        
        //   185: tableswitch {
        //                0: 236
        //                1: 212
        //                2: 397
        //          default: 212
        //        }
        //   212: iconst_0       
        //   213: istore          14
        //   215: aload_0        
        //   216: getfield        android/support/v4/widget/SlidingPaneLayout.mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
        //   219: aload_1        
        //   220: invokevirtual   android/support/v4/widget/ViewDragHelper.shouldInterceptTouchEvent:(Landroid/view/MotionEvent;)Z
        //   223: ifne            234
        //   226: iconst_0       
        //   227: istore          11
        //   229: iload           14
        //   231: ifeq            123
        //   234: iconst_1       
        //   235: ireturn        
        //   236: aload_0        
        //   237: iconst_0       
        //   238: putfield        android/support/v4/widget/SlidingPaneLayout.mIsUnableToDrag:Z
        //   241: aload_1        
        //   242: invokevirtual   android/view/MotionEvent.getX:()F
        //   245: fstore          20
        //   247: aload_1        
        //   248: invokevirtual   android/view/MotionEvent.getY:()F
        //   251: fstore          21
        //   253: aload_0        
        //   254: fload           20
        //   256: putfield        android/support/v4/widget/SlidingPaneLayout.mInitialMotionX:F
        //   259: aload_0        
        //   260: fload           21
        //   262: putfield        android/support/v4/widget/SlidingPaneLayout.mInitialMotionY:F
        //   265: aload_0        
        //   266: getfield        android/support/v4/widget/SlidingPaneLayout.mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
        //   269: aload_0        
        //   270: getfield        android/support/v4/widget/SlidingPaneLayout.mSlideableView:Landroid/view/View;
        //   273: fload           20
        //   275: f2i            
        //   276: fload           21
        //   278: f2i            
        //   279: invokevirtual   android/support/v4/widget/ViewDragHelper.isViewUnder:(Landroid/view/View;II)Z
        //   282: ifeq            212
        //   285: aload_0        
        //   286: aload_0        
        //   287: getfield        android/support/v4/widget/SlidingPaneLayout.mSlideableView:Landroid/view/View;
        //   290: invokevirtual   android/support/v4/widget/SlidingPaneLayout.isDimmed:(Landroid/view/View;)Z
        //   293: istore          23
        //   295: iload           23
        //   297: ifeq            212
        //   300: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //   303: ifeq            391
        //   306: iconst_1       
        //   307: istore          14
        //   309: aload_1        
        //   310: invokevirtual   android/view/MotionEvent.getX:()F
        //   313: fstore          15
        //   315: aload_1        
        //   316: invokevirtual   android/view/MotionEvent.getY:()F
        //   319: fstore          16
        //   321: fload           15
        //   323: aload_0        
        //   324: getfield        android/support/v4/widget/SlidingPaneLayout.mInitialMotionX:F
        //   327: fsub           
        //   328: invokestatic    java/lang/Math.abs:(F)F
        //   331: fstore          17
        //   333: fload           16
        //   335: aload_0        
        //   336: getfield        android/support/v4/widget/SlidingPaneLayout.mInitialMotionY:F
        //   339: fsub           
        //   340: invokestatic    java/lang/Math.abs:(F)F
        //   343: fstore          18
        //   345: fload           17
        //   347: aload_0        
        //   348: getfield        android/support/v4/widget/SlidingPaneLayout.mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
        //   351: invokevirtual   android/support/v4/widget/ViewDragHelper.getTouchSlop:()I
        //   354: i2f            
        //   355: fcmpl          
        //   356: ifle            215
        //   359: fload           18
        //   361: fload           17
        //   363: fcmpl          
        //   364: ifle            215
        //   367: aload_0        
        //   368: getfield        android/support/v4/widget/SlidingPaneLayout.mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
        //   371: invokevirtual   android/support/v4/widget/ViewDragHelper.cancel:()V
        //   374: aload_0        
        //   375: iconst_1       
        //   376: putfield        android/support/v4/widget/SlidingPaneLayout.mIsUnableToDrag:Z
        //   379: iconst_0       
        //   380: ireturn        
        //   381: astore          19
        //   383: aload           19
        //   385: athrow         
        //   386: astore          22
        //   388: aload           22
        //   390: athrow         
        //   391: iconst_1       
        //   392: istore          14
        //   394: goto            215
        //   397: iconst_0       
        //   398: istore          14
        //   400: goto            309
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  5      11     126    129    Ljava/lang/IllegalStateException;
        //  20     26     129    134    Ljava/lang/IllegalStateException;
        //  44     65     134    139    Ljava/lang/IllegalStateException;
        //  79     85     145    150    Ljava/lang/IllegalStateException;
        //  90     96     150    155    Ljava/lang/IllegalStateException;
        //  105    119    155    160    Ljava/lang/IllegalStateException;
        //  127    129    129    134    Ljava/lang/IllegalStateException;
        //  147    150    150    155    Ljava/lang/IllegalStateException;
        //  152    155    155    160    Ljava/lang/IllegalStateException;
        //  170    177    179    184    Ljava/lang/IllegalStateException;
        //  253    295    386    391    Ljava/lang/IllegalStateException;
        //  367    379    381    386    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 198, Size: 198
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
        //     0: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //     3: istore          6
        //     5: aload_0        
        //     6: invokespecial   android/support/v4/widget/SlidingPaneLayout.isLayoutRtlSupport:()Z
        //     9: istore          7
        //    11: iload           7
        //    13: ifeq            29
        //    16: aload_0        
        //    17: getfield        android/support/v4/widget/SlidingPaneLayout.mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
        //    20: iconst_2       
        //    21: invokevirtual   android/support/v4/widget/ViewDragHelper.setEdgeTrackingEnabled:(I)V
        //    24: iload           6
        //    26: ifeq            37
        //    29: aload_0        
        //    30: getfield        android/support/v4/widget/SlidingPaneLayout.mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
        //    33: iconst_1       
        //    34: invokevirtual   android/support/v4/widget/ViewDragHelper.setEdgeTrackingEnabled:(I)V
        //    37: iload           4
        //    39: iload_2        
        //    40: isub           
        //    41: istore          9
        //    43: iload           7
        //    45: ifeq            598
        //    48: aload_0        
        //    49: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getPaddingRight:()I
        //    52: istore          60
        //    54: iload           60
        //    56: istore          10
        //    58: iload           7
        //    60: ifeq            612
        //    63: aload_0        
        //    64: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getPaddingLeft:()I
        //    67: istore          58
        //    69: iload           58
        //    71: istore          11
        //    73: aload_0        
        //    74: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getPaddingTop:()I
        //    77: istore          12
        //    79: aload_0        
        //    80: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getChildCount:()I
        //    83: istore          13
        //    85: aload_0        
        //    86: getfield        android/support/v4/widget/SlidingPaneLayout.mFirstLayout:Z
        //    89: istore          17
        //    91: iload           17
        //    93: ifeq            127
        //    96: aload_0        
        //    97: getfield        android/support/v4/widget/SlidingPaneLayout.mCanSlide:Z
        //   100: istore          54
        //   102: iload           54
        //   104: ifeq            636
        //   107: aload_0        
        //   108: getfield        android/support/v4/widget/SlidingPaneLayout.mPreservedOpenState:Z
        //   111: istore          56
        //   113: iload           56
        //   115: ifeq            636
        //   118: fconst_1       
        //   119: fstore          55
        //   121: aload_0        
        //   122: fload           55
        //   124: putfield        android/support/v4/widget/SlidingPaneLayout.mSlideOffset:F
        //   127: iconst_0       
        //   128: istore          18
        //   130: iload           10
        //   132: istore          19
        //   134: iload           10
        //   136: istore          20
        //   138: iload           18
        //   140: iload           13
        //   142: if_icmpge       467
        //   145: aload_0        
        //   146: iload           18
        //   148: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getChildAt:(I)Landroid/view/View;
        //   151: astore          28
        //   153: aload           28
        //   155: invokevirtual   android/view/View.getVisibility:()I
        //   158: istore          30
        //   160: iload           30
        //   162: bipush          8
        //   164: if_icmpne       172
        //   167: iload           6
        //   169: ifeq            735
        //   172: aload           28
        //   174: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   177: checkcast       Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
        //   180: astore          31
        //   182: aload           28
        //   184: invokevirtual   android/view/View.getMeasuredWidth:()I
        //   187: istore          32
        //   189: aload           31
        //   191: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.slideable:Z
        //   194: ifeq            336
        //   197: aload           31
        //   199: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.leftMargin:I
        //   202: aload           31
        //   204: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.rightMargin:I
        //   207: iadd           
        //   208: istore          43
        //   210: iload           19
        //   212: iload           9
        //   214: iload           11
        //   216: isub           
        //   217: aload_0        
        //   218: getfield        android/support/v4/widget/SlidingPaneLayout.mOverhangSize:I
        //   221: isub           
        //   222: invokestatic    java/lang/Math.min:(II)I
        //   225: iload           20
        //   227: isub           
        //   228: iload           43
        //   230: isub           
        //   231: istore          44
        //   233: aload_0        
        //   234: iload           44
        //   236: putfield        android/support/v4/widget/SlidingPaneLayout.mSlideRange:I
        //   239: iload           7
        //   241: ifeq            652
        //   244: aload           31
        //   246: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.rightMargin:I
        //   249: istore          46
        //   251: iload           44
        //   253: iload           20
        //   255: iload           46
        //   257: iadd           
        //   258: iadd           
        //   259: istore          47
        //   261: iload           32
        //   263: iconst_2       
        //   264: idiv           
        //   265: istore          49
        //   267: iload           47
        //   269: iload           49
        //   271: iadd           
        //   272: iload           9
        //   274: iload           11
        //   276: isub           
        //   277: if_icmple       667
        //   280: iconst_1       
        //   281: istore          50
        //   283: aload           31
        //   285: iload           50
        //   287: putfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.dimWhenOffset:Z
        //   290: iload           44
        //   292: i2f            
        //   293: aload_0        
        //   294: getfield        android/support/v4/widget/SlidingPaneLayout.mSlideOffset:F
        //   297: fmul           
        //   298: f2i            
        //   299: istore          51
        //   301: iload           20
        //   303: iload           46
        //   305: iload           51
        //   307: iadd           
        //   308: iadd           
        //   309: istore          36
        //   311: iload           51
        //   313: i2f            
        //   314: fstore          52
        //   316: aload_0        
        //   317: fload           52
        //   319: aload_0        
        //   320: getfield        android/support/v4/widget/SlidingPaneLayout.mSlideRange:I
        //   323: i2f            
        //   324: fdiv           
        //   325: putfield        android/support/v4/widget/SlidingPaneLayout.mSlideOffset:F
        //   328: iconst_0       
        //   329: istore          35
        //   331: iload           6
        //   333: ifeq            382
        //   336: aload_0        
        //   337: getfield        android/support/v4/widget/SlidingPaneLayout.mCanSlide:Z
        //   340: ifeq            729
        //   343: aload_0        
        //   344: getfield        android/support/v4/widget/SlidingPaneLayout.mParallaxBy:I
        //   347: istore          42
        //   349: iload           42
        //   351: ifeq            729
        //   354: fconst_1       
        //   355: aload_0        
        //   356: getfield        android/support/v4/widget/SlidingPaneLayout.mSlideOffset:F
        //   359: fsub           
        //   360: aload_0        
        //   361: getfield        android/support/v4/widget/SlidingPaneLayout.mParallaxBy:I
        //   364: i2f            
        //   365: fmul           
        //   366: f2i            
        //   367: istore          34
        //   369: iload           6
        //   371: ifeq            718
        //   374: iload           34
        //   376: istore          35
        //   378: iload           19
        //   380: istore          36
        //   382: iload           7
        //   384: ifeq            409
        //   387: iload           35
        //   389: iload           9
        //   391: iload           36
        //   393: isub           
        //   394: iadd           
        //   395: istore          38
        //   397: iload           38
        //   399: iload           32
        //   401: isub           
        //   402: istore          37
        //   404: iload           6
        //   406: ifeq            423
        //   409: iload           36
        //   411: iload           35
        //   413: isub           
        //   414: istore          37
        //   416: iload           37
        //   418: iload           32
        //   420: iadd           
        //   421: istore          38
        //   423: aload           28
        //   425: iload           37
        //   427: iload           12
        //   429: iload           38
        //   431: iload           12
        //   433: aload           28
        //   435: invokevirtual   android/view/View.getMeasuredHeight:()I
        //   438: iadd           
        //   439: invokevirtual   android/view/View.layout:(IIII)V
        //   442: iload           19
        //   444: aload           28
        //   446: invokevirtual   android/view/View.getWidth:()I
        //   449: iadd           
        //   450: istore          39
        //   452: iload           36
        //   454: istore          40
        //   456: iload           18
        //   458: iconst_1       
        //   459: iadd           
        //   460: istore          41
        //   462: iload           6
        //   464: ifeq            703
        //   467: aload_0        
        //   468: getfield        android/support/v4/widget/SlidingPaneLayout.mFirstLayout:Z
        //   471: istore          24
        //   473: iload           24
        //   475: ifeq            582
        //   478: aload_0        
        //   479: getfield        android/support/v4/widget/SlidingPaneLayout.mCanSlide:Z
        //   482: istore          25
        //   484: iload           25
        //   486: ifeq            541
        //   489: aload_0        
        //   490: getfield        android/support/v4/widget/SlidingPaneLayout.mParallaxBy:I
        //   493: ifeq            504
        //   496: aload_0        
        //   497: aload_0        
        //   498: getfield        android/support/v4/widget/SlidingPaneLayout.mSlideOffset:F
        //   501: invokespecial   android/support/v4/widget/SlidingPaneLayout.parallaxOtherViews:(F)V
        //   504: aload_0        
        //   505: getfield        android/support/v4/widget/SlidingPaneLayout.mSlideableView:Landroid/view/View;
        //   508: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   511: checkcast       Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
        //   514: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.dimWhenOffset:Z
        //   517: ifeq            574
        //   520: aload_0        
        //   521: aload_0        
        //   522: getfield        android/support/v4/widget/SlidingPaneLayout.mSlideableView:Landroid/view/View;
        //   525: aload_0        
        //   526: getfield        android/support/v4/widget/SlidingPaneLayout.mSlideOffset:F
        //   529: aload_0        
        //   530: getfield        android/support/v4/widget/SlidingPaneLayout.mSliderFadeColor:I
        //   533: invokespecial   android/support/v4/widget/SlidingPaneLayout.dimChildView:(Landroid/view/View;FI)V
        //   536: iload           6
        //   538: ifeq            574
        //   541: iconst_0       
        //   542: istore          26
        //   544: iload           26
        //   546: iload           13
        //   548: if_icmpge       574
        //   551: aload_0        
        //   552: aload_0        
        //   553: iload           26
        //   555: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getChildAt:(I)Landroid/view/View;
        //   558: fconst_0       
        //   559: aload_0        
        //   560: getfield        android/support/v4/widget/SlidingPaneLayout.mSliderFadeColor:I
        //   563: invokespecial   android/support/v4/widget/SlidingPaneLayout.dimChildView:(Landroid/view/View;FI)V
        //   566: iinc            26, 1
        //   569: iload           6
        //   571: ifeq            544
        //   574: aload_0        
        //   575: aload_0        
        //   576: getfield        android/support/v4/widget/SlidingPaneLayout.mSlideableView:Landroid/view/View;
        //   579: invokevirtual   android/support/v4/widget/SlidingPaneLayout.updateObscuredViewsVisibility:(Landroid/view/View;)V
        //   582: aload_0        
        //   583: iconst_0       
        //   584: putfield        android/support/v4/widget/SlidingPaneLayout.mFirstLayout:Z
        //   587: return         
        //   588: astore          8
        //   590: aload           8
        //   592: athrow         
        //   593: astore          59
        //   595: aload           59
        //   597: athrow         
        //   598: aload_0        
        //   599: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getPaddingLeft:()I
        //   602: istore          10
        //   604: goto            58
        //   607: astore          57
        //   609: aload           57
        //   611: athrow         
        //   612: aload_0        
        //   613: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getPaddingRight:()I
        //   616: istore          11
        //   618: goto            73
        //   621: astore          14
        //   623: aload           14
        //   625: athrow         
        //   626: astore          15
        //   628: aload           15
        //   630: athrow         
        //   631: astore          16
        //   633: aload           16
        //   635: athrow         
        //   636: fconst_0       
        //   637: fstore          55
        //   639: goto            121
        //   642: astore          29
        //   644: aload           29
        //   646: athrow         
        //   647: astore          45
        //   649: aload           45
        //   651: athrow         
        //   652: aload           31
        //   654: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.leftMargin:I
        //   657: istore          46
        //   659: goto            251
        //   662: astore          48
        //   664: aload           48
        //   666: athrow         
        //   667: iconst_0       
        //   668: istore          50
        //   670: goto            283
        //   673: astore          53
        //   675: aload           53
        //   677: athrow         
        //   678: astore          33
        //   680: aload           33
        //   682: athrow         
        //   683: astore          21
        //   685: aload           21
        //   687: athrow         
        //   688: astore          22
        //   690: aload           22
        //   692: athrow         
        //   693: astore          23
        //   695: aload           23
        //   697: athrow         
        //   698: astore          27
        //   700: aload           27
        //   702: athrow         
        //   703: iload           41
        //   705: istore          18
        //   707: iload           39
        //   709: istore          19
        //   711: iload           40
        //   713: istore          20
        //   715: goto            138
        //   718: iload           34
        //   720: istore          35
        //   722: iload           19
        //   724: istore          36
        //   726: goto            382
        //   729: iconst_0       
        //   730: istore          34
        //   732: goto            374
        //   735: iload           19
        //   737: istore          39
        //   739: iload           20
        //   741: istore          40
        //   743: goto            456
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  16     24     588    593    Ljava/lang/IllegalStateException;
        //  29     37     588    593    Ljava/lang/IllegalStateException;
        //  48     54     593    598    Ljava/lang/IllegalStateException;
        //  63     69     607    612    Ljava/lang/IllegalStateException;
        //  85     91     621    626    Ljava/lang/IllegalStateException;
        //  96     102    626    631    Ljava/lang/IllegalStateException;
        //  107    113    631    636    Ljava/lang/IllegalStateException;
        //  153    160    642    647    Ljava/lang/IllegalStateException;
        //  233    239    647    652    Ljava/lang/IllegalStateException;
        //  244    251    647    652    Ljava/lang/IllegalStateException;
        //  261    267    662    667    Ljava/lang/IllegalStateException;
        //  316    328    673    678    Ljava/lang/IllegalStateException;
        //  336    349    678    683    Ljava/lang/IllegalStateException;
        //  467    473    683    688    Ljava/lang/IllegalStateException;
        //  478    484    688    693    Ljava/lang/IllegalStateException;
        //  489    504    693    698    Ljava/lang/IllegalStateException;
        //  504    536    698    703    Ljava/lang/IllegalStateException;
        //  623    626    626    631    Ljava/lang/IllegalStateException;
        //  628    631    631    636    Ljava/lang/IllegalStateException;
        //  675    678    678    683    Ljava/lang/IllegalStateException;
        //  685    688    688    693    Ljava/lang/IllegalStateException;
        //  690    693    693    698    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 376, Size: 376
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
        //    10: iload_1        
        //    11: invokestatic    android/view/View$MeasureSpec.getSize:(I)I
        //    14: istore          5
        //    16: iload_2        
        //    17: invokestatic    android/view/View$MeasureSpec.getMode:(I)I
        //    20: istore          6
        //    22: iload_2        
        //    23: invokestatic    android/view/View$MeasureSpec.getSize:(I)I
        //    26: istore          7
        //    28: iload           4
        //    30: ldc_w           1073741824
        //    33: if_icmpeq       101
        //    36: aload_0        
        //    37: invokevirtual   android/support/v4/widget/SlidingPaneLayout.isInEditMode:()Z
        //    40: istore          101
        //    42: iload           101
        //    44: ifeq            78
        //    47: iload           4
        //    49: ldc_w           -2147483648
        //    52: if_icmpne       64
        //    55: ldc_w           1073741824
        //    58: istore          4
        //    60: iload_3        
        //    61: ifeq            159
        //    64: iload           4
        //    66: ifne            159
        //    69: sipush          300
        //    72: istore          5
        //    74: iload_3        
        //    75: ifeq            159
        //    78: new             Ljava/lang/IllegalStateException;
        //    81: dup            
        //    82: getstatic       android/support/v4/widget/SlidingPaneLayout.z:[Ljava/lang/String;
        //    85: iconst_1       
        //    86: aaload         
        //    87: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    90: athrow         
        //    91: astore          102
        //    93: aload           102
        //    95: athrow         
        //    96: astore          100
        //    98: aload           100
        //   100: athrow         
        //   101: iload           6
        //   103: ifne            159
        //   106: aload_0        
        //   107: invokevirtual   android/support/v4/widget/SlidingPaneLayout.isInEditMode:()Z
        //   110: istore          98
        //   112: iload           98
        //   114: ifeq            136
        //   117: iload           6
        //   119: ifne            159
        //   122: ldc_w           -2147483648
        //   125: istore          6
        //   127: sipush          300
        //   130: istore          7
        //   132: iload_3        
        //   133: ifeq            159
        //   136: new             Ljava/lang/IllegalStateException;
        //   139: dup            
        //   140: getstatic       android/support/v4/widget/SlidingPaneLayout.z:[Ljava/lang/String;
        //   143: iconst_0       
        //   144: aaload         
        //   145: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   148: athrow         
        //   149: astore          99
        //   151: aload           99
        //   153: athrow         
        //   154: astore          97
        //   156: aload           97
        //   158: athrow         
        //   159: iload           6
        //   161: istore          8
        //   163: iload           5
        //   165: istore          9
        //   167: iload           7
        //   169: istore          10
        //   171: iconst_m1      
        //   172: istore          11
        //   174: iconst_0       
        //   175: istore          12
        //   177: iload           8
        //   179: lookupswitch {
        //          -2147483648: 953
        //          1073741824: 935
        //          default: 204
        //        }
        //   204: iconst_0       
        //   205: istore          13
        //   207: iload           9
        //   209: aload_0        
        //   210: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getPaddingLeft:()I
        //   213: isub           
        //   214: aload_0        
        //   215: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getPaddingRight:()I
        //   218: isub           
        //   219: istore          14
        //   221: aload_0        
        //   222: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getChildCount:()I
        //   225: istore          15
        //   227: iload           15
        //   229: iconst_2       
        //   230: if_icmple       247
        //   233: getstatic       android/support/v4/widget/SlidingPaneLayout.z:[Ljava/lang/String;
        //   236: iconst_2       
        //   237: aaload         
        //   238: getstatic       android/support/v4/widget/SlidingPaneLayout.z:[Ljava/lang/String;
        //   241: iconst_3       
        //   242: aaload         
        //   243: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   246: pop            
        //   247: aload_0        
        //   248: aconst_null    
        //   249: putfield        android/support/v4/widget/SlidingPaneLayout.mSlideableView:Landroid/view/View;
        //   252: iconst_0       
        //   253: istore          16
        //   255: iload           14
        //   257: istore          17
        //   259: iload           12
        //   261: istore          18
        //   263: fconst_0       
        //   264: fstore          19
        //   266: iload           16
        //   268: iload           15
        //   270: if_icmpge       1440
        //   273: aload_0        
        //   274: iload           16
        //   276: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getChildAt:(I)Landroid/view/View;
        //   279: astore          69
        //   281: aload           69
        //   283: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   286: checkcast       Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
        //   289: astore          70
        //   291: aload           69
        //   293: invokevirtual   android/view/View.getVisibility:()I
        //   296: istore          73
        //   298: iload           73
        //   300: bipush          8
        //   302: if_icmpne       315
        //   305: aload           70
        //   307: iconst_0       
        //   308: putfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.dimWhenOffset:Z
        //   311: iload_3        
        //   312: ifeq            1425
        //   315: aload           70
        //   317: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.weight:F
        //   320: fstore          74
        //   322: fload           74
        //   324: fconst_0       
        //   325: fcmpl          
        //   326: ifle            990
        //   329: fload           19
        //   331: aload           70
        //   333: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.weight:F
        //   336: fadd           
        //   337: fstore          19
        //   339: aload           70
        //   341: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.width:I
        //   344: istore          94
        //   346: iload           94
        //   348: ifne            990
        //   351: iload           17
        //   353: istore          89
        //   355: fload           19
        //   357: fstore          90
        //   359: iload           13
        //   361: istore          91
        //   363: iload           16
        //   365: iconst_1       
        //   366: iadd           
        //   367: istore          92
        //   369: iload_3        
        //   370: ifeq            1380
        //   373: iload           91
        //   375: istore          22
        //   377: fload           90
        //   379: fstore          23
        //   381: iload           18
        //   383: istore          20
        //   385: iload           89
        //   387: istore          21
        //   389: iload           22
        //   391: ifne            401
        //   394: fload           23
        //   396: fconst_0       
        //   397: fcmpl          
        //   398: ifle            880
        //   401: iload           14
        //   403: aload_0        
        //   404: getfield        android/support/v4/widget/SlidingPaneLayout.mOverhangSize:I
        //   407: isub           
        //   408: istore          24
        //   410: iconst_0       
        //   411: istore          25
        //   413: iload           25
        //   415: iload           15
        //   417: if_icmpge       880
        //   420: aload_0        
        //   421: iload           25
        //   423: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getChildAt:(I)Landroid/view/View;
        //   426: astore          30
        //   428: aload           30
        //   430: invokevirtual   android/view/View.getVisibility:()I
        //   433: istore          32
        //   435: iload           32
        //   437: bipush          8
        //   439: if_icmpne       446
        //   442: iload_3        
        //   443: ifeq            870
        //   446: aload           30
        //   448: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   451: checkcast       Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
        //   454: astore          33
        //   456: aload           30
        //   458: invokevirtual   android/view/View.getVisibility:()I
        //   461: istore          38
        //   463: iload           38
        //   465: bipush          8
        //   467: if_icmpne       474
        //   470: iload_3        
        //   471: ifeq            870
        //   474: aload           33
        //   476: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.width:I
        //   479: istore          39
        //   481: iload           39
        //   483: ifne            1292
        //   486: aload           33
        //   488: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.weight:F
        //   491: fstore          68
        //   493: fload           68
        //   495: fconst_0       
        //   496: fcmpl          
        //   497: ifle            1292
        //   500: iconst_1       
        //   501: istore          40
        //   503: iload           40
        //   505: ifeq            1298
        //   508: iconst_0       
        //   509: istore          41
        //   511: iload           22
        //   513: ifeq            675
        //   516: aload_0        
        //   517: getfield        android/support/v4/widget/SlidingPaneLayout.mSlideableView:Landroid/view/View;
        //   520: astore          59
        //   522: aload           30
        //   524: aload           59
        //   526: if_acmpeq       675
        //   529: aload           33
        //   531: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.width:I
        //   534: istore          60
        //   536: iload           60
        //   538: ifge            870
        //   541: iload           41
        //   543: iload           24
        //   545: if_icmpgt       562
        //   548: aload           33
        //   550: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.weight:F
        //   553: fstore          67
        //   555: fload           67
        //   557: fconst_0       
        //   558: fcmpl          
        //   559: ifle            870
        //   562: iload           40
        //   564: ifeq            639
        //   567: aload           33
        //   569: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.height:I
        //   572: istore          64
        //   574: iload           64
        //   576: bipush          -2
        //   578: if_icmpne       595
        //   581: iload           11
        //   583: ldc_w           -2147483648
        //   586: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   589: istore          61
        //   591: iload_3        
        //   592: ifeq            652
        //   595: aload           33
        //   597: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.height:I
        //   600: istore          66
        //   602: iload           66
        //   604: iconst_m1      
        //   605: if_icmpne       622
        //   608: iload           11
        //   610: ldc_w           1073741824
        //   613: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   616: istore          61
        //   618: iload_3        
        //   619: ifeq            652
        //   622: aload           33
        //   624: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.height:I
        //   627: ldc_w           1073741824
        //   630: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   633: istore          61
        //   635: iload_3        
        //   636: ifeq            652
        //   639: aload           30
        //   641: invokevirtual   android/view/View.getMeasuredHeight:()I
        //   644: ldc_w           1073741824
        //   647: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   650: istore          61
        //   652: iload           24
        //   654: ldc_w           1073741824
        //   657: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   660: istore          62
        //   662: aload           30
        //   664: iload           62
        //   666: iload           61
        //   668: invokevirtual   android/view/View.measure:(II)V
        //   671: iload_3        
        //   672: ifeq            870
        //   675: aload           33
        //   677: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.weight:F
        //   680: fstore          44
        //   682: fload           44
        //   684: fconst_0       
        //   685: fcmpl          
        //   686: ifle            870
        //   689: aload           33
        //   691: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.width:I
        //   694: ifne            769
        //   697: aload           33
        //   699: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.height:I
        //   702: istore          51
        //   704: iload           51
        //   706: bipush          -2
        //   708: if_icmpne       725
        //   711: iload           11
        //   713: ldc_w           -2147483648
        //   716: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   719: istore          46
        //   721: iload_3        
        //   722: ifeq            782
        //   725: aload           33
        //   727: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.height:I
        //   730: istore          53
        //   732: iload           53
        //   734: iconst_m1      
        //   735: if_icmpne       752
        //   738: iload           11
        //   740: ldc_w           1073741824
        //   743: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   746: istore          46
        //   748: iload_3        
        //   749: ifeq            782
        //   752: aload           33
        //   754: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.height:I
        //   757: ldc_w           1073741824
        //   760: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   763: istore          46
        //   765: iload_3        
        //   766: ifeq            782
        //   769: aload           30
        //   771: invokevirtual   android/view/View.getMeasuredHeight:()I
        //   774: ldc_w           1073741824
        //   777: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   780: istore          46
        //   782: iload           22
        //   784: ifeq            833
        //   787: iload           14
        //   789: aload           33
        //   791: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.leftMargin:I
        //   794: aload           33
        //   796: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.rightMargin:I
        //   799: iadd           
        //   800: isub           
        //   801: istore          48
        //   803: iload           48
        //   805: ldc_w           1073741824
        //   808: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   811: istore          49
        //   813: iload           41
        //   815: iload           48
        //   817: if_icmpeq       829
        //   820: aload           30
        //   822: iload           49
        //   824: iload           46
        //   826: invokevirtual   android/view/View.measure:(II)V
        //   829: iload_3        
        //   830: ifeq            870
        //   833: iconst_0       
        //   834: iload           21
        //   836: invokestatic    java/lang/Math.max:(II)I
        //   839: istore          47
        //   841: aload           30
        //   843: iload           41
        //   845: aload           33
        //   847: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.weight:F
        //   850: iload           47
        //   852: i2f            
        //   853: fmul           
        //   854: fload           23
        //   856: fdiv           
        //   857: f2i            
        //   858: iadd           
        //   859: ldc_w           1073741824
        //   862: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   865: iload           46
        //   867: invokevirtual   android/view/View.measure:(II)V
        //   870: iload           25
        //   872: iconst_1       
        //   873: iadd           
        //   874: istore          45
        //   876: iload_3        
        //   877: ifeq            1373
        //   880: iload           20
        //   882: aload_0        
        //   883: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getPaddingTop:()I
        //   886: iadd           
        //   887: aload_0        
        //   888: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getPaddingBottom:()I
        //   891: iadd           
        //   892: istore          26
        //   894: aload_0        
        //   895: iload           9
        //   897: iload           26
        //   899: invokevirtual   android/support/v4/widget/SlidingPaneLayout.setMeasuredDimension:(II)V
        //   902: aload_0        
        //   903: iload           22
        //   905: putfield        android/support/v4/widget/SlidingPaneLayout.mCanSlide:Z
        //   908: aload_0        
        //   909: getfield        android/support/v4/widget/SlidingPaneLayout.mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
        //   912: invokevirtual   android/support/v4/widget/ViewDragHelper.getViewDragState:()I
        //   915: istore          29
        //   917: iload           29
        //   919: ifeq            934
        //   922: iload           22
        //   924: ifne            934
        //   927: aload_0        
        //   928: getfield        android/support/v4/widget/SlidingPaneLayout.mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
        //   931: invokevirtual   android/support/v4/widget/ViewDragHelper.abort:()V
        //   934: return         
        //   935: iload           10
        //   937: aload_0        
        //   938: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getPaddingTop:()I
        //   941: isub           
        //   942: aload_0        
        //   943: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getPaddingBottom:()I
        //   946: isub           
        //   947: istore          12
        //   949: iload_3        
        //   950: ifeq            1459
        //   953: iload           10
        //   955: aload_0        
        //   956: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getPaddingTop:()I
        //   959: isub           
        //   960: aload_0        
        //   961: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getPaddingBottom:()I
        //   964: isub           
        //   965: istore          11
        //   967: goto            204
        //   970: astore          95
        //   972: aload           95
        //   974: athrow         
        //   975: astore          71
        //   977: aload           71
        //   979: athrow         
        //   980: astore          72
        //   982: aload           72
        //   984: athrow         
        //   985: astore          93
        //   987: aload           93
        //   989: athrow         
        //   990: aload           70
        //   992: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.leftMargin:I
        //   995: aload           70
        //   997: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.rightMargin:I
        //  1000: iadd           
        //  1001: istore          75
        //  1003: aload           70
        //  1005: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.width:I
        //  1008: bipush          -2
        //  1010: if_icmpne       1030
        //  1013: iload           14
        //  1015: iload           75
        //  1017: isub           
        //  1018: ldc_w           -2147483648
        //  1021: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //  1024: istore          78
        //  1026: iload_3        
        //  1027: ifeq            1073
        //  1030: aload           70
        //  1032: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.width:I
        //  1035: istore          77
        //  1037: iload           77
        //  1039: iconst_m1      
        //  1040: if_icmpne       1060
        //  1043: iload           14
        //  1045: iload           75
        //  1047: isub           
        //  1048: ldc_w           1073741824
        //  1051: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //  1054: istore          78
        //  1056: iload_3        
        //  1057: ifeq            1073
        //  1060: aload           70
        //  1062: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.width:I
        //  1065: ldc_w           1073741824
        //  1068: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //  1071: istore          78
        //  1073: aload           70
        //  1075: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.height:I
        //  1078: bipush          -2
        //  1080: if_icmpne       1097
        //  1083: iload           11
        //  1085: ldc_w           -2147483648
        //  1088: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //  1091: istore          81
        //  1093: iload_3        
        //  1094: ifeq            1137
        //  1097: aload           70
        //  1099: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.height:I
        //  1102: istore          80
        //  1104: iload           80
        //  1106: iconst_m1      
        //  1107: if_icmpne       1124
        //  1110: iload           11
        //  1112: ldc_w           1073741824
        //  1115: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //  1118: istore          81
        //  1120: iload_3        
        //  1121: ifeq            1137
        //  1124: aload           70
        //  1126: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.height:I
        //  1129: ldc_w           1073741824
        //  1132: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //  1135: istore          81
        //  1137: aload           69
        //  1139: iload           78
        //  1141: iload           81
        //  1143: invokevirtual   android/view/View.measure:(II)V
        //  1146: aload           69
        //  1148: invokevirtual   android/view/View.getMeasuredWidth:()I
        //  1151: istore          82
        //  1153: aload           69
        //  1155: invokevirtual   android/view/View.getMeasuredHeight:()I
        //  1158: istore          83
        //  1160: iload           8
        //  1162: ldc_w           -2147483648
        //  1165: if_icmpne       1418
        //  1168: iload           83
        //  1170: iload           18
        //  1172: if_icmple       1418
        //  1175: iload           83
        //  1177: iload           11
        //  1179: invokestatic    java/lang/Math.min:(II)I
        //  1182: istore          84
        //  1184: iload           17
        //  1186: iload           82
        //  1188: isub           
        //  1189: istore          85
        //  1191: iload           85
        //  1193: ifge            1256
        //  1196: iconst_1       
        //  1197: istore          86
        //  1199: aload           70
        //  1201: iload           86
        //  1203: putfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.slideable:Z
        //  1206: iload           13
        //  1208: iload           86
        //  1210: ior            
        //  1211: istore          87
        //  1213: aload           70
        //  1215: getfield        android/support/v4/widget/SlidingPaneLayout$LayoutParams.slideable:Z
        //  1218: ifeq            1399
        //  1221: aload_0        
        //  1222: aload           69
        //  1224: putfield        android/support/v4/widget/SlidingPaneLayout.mSlideableView:Landroid/view/View;
        //  1227: iload           85
        //  1229: istore          89
        //  1231: iload           84
        //  1233: istore          18
        //  1235: fload           19
        //  1237: fstore          90
        //  1239: iload           87
        //  1241: istore          91
        //  1243: goto            363
        //  1246: astore          76
        //  1248: aload           76
        //  1250: athrow         
        //  1251: astore          79
        //  1253: aload           79
        //  1255: athrow         
        //  1256: iconst_0       
        //  1257: istore          86
        //  1259: goto            1199
        //  1262: astore          88
        //  1264: aload           88
        //  1266: athrow         
        //  1267: astore          31
        //  1269: aload           31
        //  1271: athrow         
        //  1272: astore          34
        //  1274: aload           34
        //  1276: athrow         
        //  1277: astore          35
        //  1279: aload           35
        //  1281: athrow         
        //  1282: astore          36
        //  1284: aload           36
        //  1286: athrow         
        //  1287: astore          37
        //  1289: aload           37
        //  1291: athrow         
        //  1292: iconst_0       
        //  1293: istore          40
        //  1295: goto            503
        //  1298: aload           30
        //  1300: invokevirtual   android/view/View.getMeasuredWidth:()I
        //  1303: istore          41
        //  1305: goto            511
        //  1308: astore          54
        //  1310: aload           54
        //  1312: athrow         
        //  1313: astore          55
        //  1315: aload           55
        //  1317: athrow         
        //  1318: astore          56
        //  1320: aload           56
        //  1322: athrow         
        //  1323: astore          57
        //  1325: aload           57
        //  1327: athrow         
        //  1328: astore          58
        //  1330: aload           58
        //  1332: athrow         
        //  1333: astore          65
        //  1335: aload           65
        //  1337: athrow         
        //  1338: astore          63
        //  1340: aload           63
        //  1342: athrow         
        //  1343: astore          42
        //  1345: aload           42
        //  1347: athrow         
        //  1348: astore          43
        //  1350: aload           43
        //  1352: athrow         
        //  1353: astore          52
        //  1355: aload           52
        //  1357: athrow         
        //  1358: astore          50
        //  1360: aload           50
        //  1362: athrow         
        //  1363: astore          27
        //  1365: aload           27
        //  1367: athrow         
        //  1368: astore          28
        //  1370: aload           28
        //  1372: athrow         
        //  1373: iload           45
        //  1375: istore          25
        //  1377: goto            413
        //  1380: iload           92
        //  1382: istore          16
        //  1384: iload           89
        //  1386: istore          17
        //  1388: iload           91
        //  1390: istore          13
        //  1392: fload           90
        //  1394: fstore          19
        //  1396: goto            266
        //  1399: iload           85
        //  1401: istore          89
        //  1403: iload           84
        //  1405: istore          18
        //  1407: fload           19
        //  1409: fstore          90
        //  1411: iload           87
        //  1413: istore          91
        //  1415: goto            363
        //  1418: iload           18
        //  1420: istore          84
        //  1422: goto            1184
        //  1425: iload           17
        //  1427: istore          89
        //  1429: fload           19
        //  1431: fstore          90
        //  1433: iload           13
        //  1435: istore          91
        //  1437: goto            363
        //  1440: iload           18
        //  1442: istore          20
        //  1444: iload           17
        //  1446: istore          21
        //  1448: iload           13
        //  1450: istore          22
        //  1452: fload           19
        //  1454: fstore          23
        //  1456: goto            389
        //  1459: iload           12
        //  1461: istore          11
        //  1463: goto            204
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  36     42     96     101    Ljava/lang/IllegalStateException;
        //  78     91     91     96     Ljava/lang/IllegalStateException;
        //  106    112    154    159    Ljava/lang/IllegalStateException;
        //  136    149    149    154    Ljava/lang/IllegalStateException;
        //  233    247    970    975    Ljava/lang/IllegalStateException;
        //  291    298    975    980    Ljava/lang/IllegalStateException;
        //  305    311    980    985    Ljava/lang/IllegalStateException;
        //  315    322    980    985    Ljava/lang/IllegalStateException;
        //  339    346    985    990    Ljava/lang/IllegalStateException;
        //  428    435    1267   1272   Ljava/lang/IllegalStateException;
        //  456    463    1272   1282   Ljava/lang/IllegalStateException;
        //  474    481    1282   1287   Ljava/lang/IllegalStateException;
        //  486    493    1287   1292   Ljava/lang/IllegalStateException;
        //  516    522    1308   1313   Ljava/lang/IllegalStateException;
        //  529    536    1313   1323   Ljava/lang/IllegalStateException;
        //  548    555    1323   1328   Ljava/lang/IllegalStateException;
        //  567    574    1328   1333   Ljava/lang/IllegalStateException;
        //  595    602    1333   1338   Ljava/lang/IllegalStateException;
        //  662    671    1338   1343   Ljava/lang/IllegalStateException;
        //  675    682    1343   1348   Ljava/lang/IllegalStateException;
        //  689    704    1348   1353   Ljava/lang/IllegalStateException;
        //  725    732    1353   1358   Ljava/lang/IllegalStateException;
        //  820    829    1358   1363   Ljava/lang/IllegalStateException;
        //  894    917    1363   1368   Ljava/lang/IllegalStateException;
        //  927    934    1368   1373   Ljava/lang/IllegalStateException;
        //  977    980    980    985    Ljava/lang/IllegalStateException;
        //  1030   1037   1246   1251   Ljava/lang/IllegalStateException;
        //  1097   1104   1251   1256   Ljava/lang/IllegalStateException;
        //  1213   1227   1262   1267   Ljava/lang/IllegalStateException;
        //  1274   1277   1277   1282   Ljava/lang/IllegalStateException;
        //  1279   1282   1282   1287   Ljava/lang/IllegalStateException;
        //  1284   1287   1287   1292   Ljava/lang/IllegalStateException;
        //  1310   1313   1313   1323   Ljava/lang/IllegalStateException;
        //  1315   1318   1318   1323   Ljava/lang/IllegalStateException;
        //  1320   1323   1323   1328   Ljava/lang/IllegalStateException;
        //  1325   1328   1328   1333   Ljava/lang/IllegalStateException;
        //  1340   1343   1343   1348   Ljava/lang/IllegalStateException;
        //  1345   1348   1348   1353   Ljava/lang/IllegalStateException;
        //  1365   1368   1368   1373   Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 693, Size: 693
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
    
    protected void onRestoreInstanceState(final Parcelable p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: checkcast       Landroid/support/v4/widget/SlidingPaneLayout$SavedState;
        //     4: astore_2       
        //     5: aload_0        
        //     6: aload_2        
        //     7: invokevirtual   android/support/v4/widget/SlidingPaneLayout$SavedState.getSuperState:()Landroid/os/Parcelable;
        //    10: invokespecial   android/view/ViewGroup.onRestoreInstanceState:(Landroid/os/Parcelable;)V
        //    13: aload_2        
        //    14: getfield        android/support/v4/widget/SlidingPaneLayout$SavedState.isOpen:Z
        //    17: istore          5
        //    19: iload           5
        //    21: ifeq            35
        //    24: aload_0        
        //    25: invokevirtual   android/support/v4/widget/SlidingPaneLayout.openPane:()Z
        //    28: pop            
        //    29: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //    32: ifeq            40
        //    35: aload_0        
        //    36: invokevirtual   android/support/v4/widget/SlidingPaneLayout.closePane:()Z
        //    39: pop            
        //    40: aload_0        
        //    41: aload_2        
        //    42: getfield        android/support/v4/widget/SlidingPaneLayout$SavedState.isOpen:Z
        //    45: putfield        android/support/v4/widget/SlidingPaneLayout.mPreservedOpenState:Z
        //    48: return         
        //    49: astore_3       
        //    50: aload_3        
        //    51: athrow         
        //    52: astore          4
        //    54: aload           4
        //    56: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  5      19     49     52     Ljava/lang/IllegalStateException;
        //  24     35     52     57     Ljava/lang/IllegalStateException;
        //  35     40     52     57     Ljava/lang/IllegalStateException;
        //  50     52     52     57     Ljava/lang/IllegalStateException;
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
    
    protected Parcelable onSaveInstanceState() {
        while (true) {
            final SlidingPaneLayout$SavedState slidingPaneLayout$SavedState = new SlidingPaneLayout$SavedState(super.onSaveInstanceState());
            while (true) {
                try {
                    if (this.isSlideable()) {
                        final boolean isOpen = this.isOpen();
                        slidingPaneLayout$SavedState.isOpen = isOpen;
                        return (Parcelable)slidingPaneLayout$SavedState;
                    }
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
                final boolean isOpen = this.mPreservedOpenState;
                continue;
            }
        }
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        try {
            super.onSizeChanged(n, n2, n3, n4);
            if (n != n3) {
                this.mFirstLayout = true;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        while (true) {
            try {
                if (!this.mCanSlide) {
                    return super.onTouchEvent(motionEvent);
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            this.mDragHelper.processTouchEvent(motionEvent);
            final int action = motionEvent.getAction();
            final boolean onTouchEvent = true;
            while (true) {
                switch (action & 0xFF) {
                    default: {
                        return onTouchEvent;
                    }
                    case 0: {
                        final float x = motionEvent.getX();
                        final float y = motionEvent.getY();
                        try {
                            this.mInitialMotionX = x;
                            this.mInitialMotionY = y;
                            if (!SlidingPaneLayout.a) {
                                return onTouchEvent;
                            }
                            if (!this.isDimmed(this.mSlideableView)) {
                                return onTouchEvent;
                            }
                            final float x2 = motionEvent.getX();
                            final float y2 = motionEvent.getY();
                            final float n = x2 - this.mInitialMotionX;
                            final float n2 = y2 - this.mInitialMotionY;
                            final int touchSlop = this.mDragHelper.getTouchSlop();
                            if (n * n + n2 * n2 >= touchSlop * touchSlop) {
                                return onTouchEvent;
                            }
                            try {
                                if (this.mDragHelper.isViewUnder(this.mSlideableView, (int)x2, (int)y2)) {
                                    this.closePane(this.mSlideableView, 0);
                                    return onTouchEvent;
                                }
                                return onTouchEvent;
                            }
                            catch (IllegalStateException ex2) {
                                throw ex2;
                            }
                        }
                        catch (IllegalStateException ex3) {
                            throw ex3;
                        }
                        break;
                    }
                    case 1: {
                        continue;
                    }
                }
                break;
            }
        }
    }
    
    public boolean openPane() {
        return this.openPane(this.mSlideableView, 0);
    }
    
    public void requestChildFocus(final View p0, final View p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: aload_2        
        //     3: invokespecial   android/view/ViewGroup.requestChildFocus:(Landroid/view/View;Landroid/view/View;)V
        //     6: aload_0        
        //     7: invokevirtual   android/support/v4/widget/SlidingPaneLayout.isInTouchMode:()Z
        //    10: istore          6
        //    12: iload           6
        //    14: ifne            49
        //    17: aload_0        
        //    18: getfield        android/support/v4/widget/SlidingPaneLayout.mCanSlide:Z
        //    21: istore          7
        //    23: iload           7
        //    25: ifne            49
        //    28: aload_0        
        //    29: getfield        android/support/v4/widget/SlidingPaneLayout.mSlideableView:Landroid/view/View;
        //    32: astore          8
        //    34: aload_1        
        //    35: aload           8
        //    37: if_acmpne       63
        //    40: iconst_1       
        //    41: istore          9
        //    43: aload_0        
        //    44: iload           9
        //    46: putfield        android/support/v4/widget/SlidingPaneLayout.mPreservedOpenState:Z
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
        //    63: iconst_0       
        //    64: istore          9
        //    66: goto            43
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      12     50     53     Ljava/lang/IllegalStateException;
        //  17     23     53     58     Ljava/lang/IllegalStateException;
        //  28     34     58     63     Ljava/lang/IllegalStateException;
        //  51     53     53     58     Ljava/lang/IllegalStateException;
        //  55     58     58     63     Ljava/lang/IllegalStateException;
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
    
    void setAllChildrenVisible() {
        int n = 0;
        final boolean a = SlidingPaneLayout.a;
        final int childCount = this.getChildCount();
        while (true) {
            if (n >= childCount) {
                return;
            }
            final View child = this.getChildAt(n);
            try {
                if (child.getVisibility() == 4) {
                    child.setVisibility(0);
                }
                ++n;
                if (a) {
                    return;
                }
                continue;
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
        }
    }
    
    boolean smoothSlideTo(final float n, final int n2) {
        try {
            if (!this.mCanSlide) {
                return false;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        final boolean layoutRtlSupport = this.isLayoutRtlSupport();
        final SlidingPaneLayout$LayoutParams slidingPaneLayout$LayoutParams = (SlidingPaneLayout$LayoutParams)this.mSlideableView.getLayoutParams();
        Label_0112: {
            if (layoutRtlSupport) {
                final int n3 = (int)(this.getWidth() - (this.getPaddingRight() + slidingPaneLayout$LayoutParams.rightMargin + n * this.mSlideRange + this.mSlideableView.getWidth()));
                if (!SlidingPaneLayout.a) {
                    final int n4 = n3;
                    break Label_0112;
                }
            }
            final int n4 = (int)(this.getPaddingLeft() + slidingPaneLayout$LayoutParams.leftMargin + n * this.mSlideRange);
            try {
                if (this.mDragHelper.smoothSlideViewTo(this.mSlideableView, n4, this.mSlideableView.getTop())) {
                    this.setAllChildrenVisible();
                    ViewCompat.postInvalidateOnAnimation((View)this);
                    return true;
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
        return false;
    }
    
    void updateObscuredViewsVisibility(final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: aload_0        
        //     5: invokespecial   android/support/v4/widget/SlidingPaneLayout.isLayoutRtlSupport:()Z
        //     8: istore_3       
        //     9: iload_3        
        //    10: ifeq            277
        //    13: aload_0        
        //    14: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getWidth:()I
        //    17: istore          28
        //    19: aload_0        
        //    20: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getPaddingRight:()I
        //    23: istore          29
        //    25: iload           28
        //    27: iload           29
        //    29: isub           
        //    30: istore          4
        //    32: iload_3        
        //    33: ifeq            291
        //    36: aload_0        
        //    37: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getPaddingLeft:()I
        //    40: istore          26
        //    42: iload           26
        //    44: istore          5
        //    46: aload_0        
        //    47: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getPaddingTop:()I
        //    50: istore          6
        //    52: aload_0        
        //    53: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getHeight:()I
        //    56: aload_0        
        //    57: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getPaddingBottom:()I
        //    60: isub           
        //    61: istore          7
        //    63: aload_1        
        //    64: ifnull          106
        //    67: aload_1        
        //    68: invokestatic    android/support/v4/widget/SlidingPaneLayout.viewIsOpaque:(Landroid/view/View;)Z
        //    71: istore          24
        //    73: iload           24
        //    75: ifeq            106
        //    78: aload_1        
        //    79: invokevirtual   android/view/View.getLeft:()I
        //    82: istore          11
        //    84: aload_1        
        //    85: invokevirtual   android/view/View.getRight:()I
        //    88: istore          10
        //    90: aload_1        
        //    91: invokevirtual   android/view/View.getTop:()I
        //    94: istore          9
        //    96: aload_1        
        //    97: invokevirtual   android/view/View.getBottom:()I
        //   100: istore          8
        //   102: iload_2        
        //   103: ifeq            118
        //   106: iconst_0       
        //   107: istore          8
        //   109: iconst_0       
        //   110: istore          9
        //   112: iconst_0       
        //   113: istore          10
        //   115: iconst_0       
        //   116: istore          11
        //   118: aload_0        
        //   119: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getChildCount:()I
        //   122: istore          12
        //   124: iconst_0       
        //   125: istore          13
        //   127: iload           13
        //   129: iload           12
        //   131: if_icmpge       271
        //   134: aload_0        
        //   135: iload           13
        //   137: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getChildAt:(I)Landroid/view/View;
        //   140: astore          14
        //   142: aload           14
        //   144: aload_1        
        //   145: if_acmpne       152
        //   148: iload_2        
        //   149: ifeq            271
        //   152: iload_3        
        //   153: ifeq            310
        //   156: iload           5
        //   158: istore          15
        //   160: iload           15
        //   162: aload           14
        //   164: invokevirtual   android/view/View.getLeft:()I
        //   167: invokestatic    java/lang/Math.max:(II)I
        //   170: istore          16
        //   172: iload           6
        //   174: aload           14
        //   176: invokevirtual   android/view/View.getTop:()I
        //   179: invokestatic    java/lang/Math.max:(II)I
        //   182: istore          17
        //   184: iload_3        
        //   185: ifeq            317
        //   188: iload           4
        //   190: istore          18
        //   192: iload           18
        //   194: aload           14
        //   196: invokevirtual   android/view/View.getRight:()I
        //   199: invokestatic    java/lang/Math.min:(II)I
        //   202: istore          19
        //   204: iload           7
        //   206: aload           14
        //   208: invokevirtual   android/view/View.getBottom:()I
        //   211: invokestatic    java/lang/Math.min:(II)I
        //   214: istore          20
        //   216: iload           16
        //   218: iload           11
        //   220: if_icmplt       251
        //   223: iload           17
        //   225: iload           9
        //   227: if_icmplt       251
        //   230: iload           19
        //   232: iload           10
        //   234: if_icmpgt       251
        //   237: iload           20
        //   239: iload           8
        //   241: if_icmpgt       251
        //   244: iconst_4       
        //   245: istore          21
        //   247: iload_2        
        //   248: ifeq            254
        //   251: iconst_0       
        //   252: istore          21
        //   254: aload           14
        //   256: iload           21
        //   258: invokevirtual   android/view/View.setVisibility:(I)V
        //   261: iload           13
        //   263: iconst_1       
        //   264: iadd           
        //   265: istore          22
        //   267: iload_2        
        //   268: ifeq            324
        //   271: return         
        //   272: astore          27
        //   274: aload           27
        //   276: athrow         
        //   277: aload_0        
        //   278: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getPaddingLeft:()I
        //   281: istore          4
        //   283: goto            32
        //   286: astore          25
        //   288: aload           25
        //   290: athrow         
        //   291: aload_0        
        //   292: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getWidth:()I
        //   295: aload_0        
        //   296: invokevirtual   android/support/v4/widget/SlidingPaneLayout.getPaddingRight:()I
        //   299: isub           
        //   300: istore          5
        //   302: goto            46
        //   305: astore          23
        //   307: aload           23
        //   309: athrow         
        //   310: iload           4
        //   312: istore          15
        //   314: goto            160
        //   317: iload           5
        //   319: istore          18
        //   321: goto            192
        //   324: iload           22
        //   326: istore          13
        //   328: goto            127
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  13     25     272    277    Ljava/lang/IllegalStateException;
        //  36     42     286    291    Ljava/lang/IllegalStateException;
        //  67     73     305    310    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 164, Size: 164
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
