// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.view.View$MeasureSpec;
import android.view.ViewParent;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Build$VERSION;
import java.lang.ref.WeakReference;
import android.widget.TextView;
import android.view.ViewGroup;

public class PagerTitleStrip extends ViewGroup implements ViewPager$Decor
{
    private static final int[] ATTRS;
    private static final PagerTitleStrip$PagerTitleStripImpl IMPL;
    private static final int[] TEXT_ATTRS;
    private static final String[] z;
    TextView mCurrText;
    private int mGravity;
    private int mLastKnownCurrentPage;
    private float mLastKnownPositionOffset;
    TextView mNextText;
    private int mNonPrimaryAlpha;
    private final PagerTitleStrip$PageListener mPageListener;
    ViewPager mPager;
    TextView mPrevText;
    private int mScaledTextSpacing;
    int mTextColor;
    private boolean mUpdatingPositions;
    private boolean mUpdatingText;
    private WeakReference mWatchingAdapter;
    
    static {
        final String[] z2 = new String[2];
        String s = ":T=X\u0017\u001aD/_B\u0005Dn[^\u0003InMYWD6MT\u0003\u00019ES\u0003I";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
    Label_0015:
        while (true) {
            while (true) {
                final char[] charArray = s.toCharArray();
                final int length = charArray.length;
                int n3 = 0;
                while (true) {
                    Label_0153: {
                        if (length > n3) {
                            break Label_0153;
                        }
                        final String intern = new String(charArray).intern();
                        switch (n) {
                            default: {
                                array[n2] = intern;
                                s = "'@)IE#H:@R$U<EGWL;_CWC+\fVWE'^R\u0014UnO_\u001eM*\fX\u0011\u0001/\fa\u001eD9|V\u0010D<\u0002";
                                n2 = 1;
                                array = z2;
                                n = 0;
                                continue Label_0015;
                            }
                            case 0: {
                                break;
                            }
                        }
                        array[n2] = intern;
                        z = z2;
                        try {
                            ATTRS = new int[] { 16842804, 16842901, 16842904, 16842927 };
                            TEXT_ATTRS = new int[] { 16843660 };
                            if (Build$VERSION.SDK_INT >= 14) {
                                IMPL = new PagerTitleStrip$PagerTitleStripImplIcs();
                                return;
                            }
                            break Label_0015;
                            char c = '\0';
                            Label_0224: {
                                c = '!';
                            }
                            // switch([Lcom.strobel.decompiler.ast.Label;@363417b7, n3 % 5)
                            final char c2;
                            Label_0200: {
                                break Label_0200;
                                Label_0196:
                                c = '7';
                                break Label_0200;
                                Label_0217:
                                c = 'w';
                                break Label_0200;
                                Label_0231:
                                c = 'N';
                                break Label_0200;
                                Label_0238:
                                c = ',';
                                break Label_0200;
                                c2 = charArray[n3];
                            }
                            charArray[n3] = (char)(c ^ c2);
                            ++n3;
                            continue;
                        }
                        catch (IllegalStateException ex) {
                            throw ex;
                        }
                    }
                    break Label_0015;
                }
            }
            break;
        }
        IMPL = new PagerTitleStrip$PagerTitleStripImplBase();
    }
    
    public PagerTitleStrip(final Context context) {
        this(context, null);
    }
    
    public PagerTitleStrip(final Context p0, final AttributeSet p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/view/ViewPager.a:I
        //     3: istore_3       
        //     4: aload_0        
        //     5: aload_1        
        //     6: aload_2        
        //     7: invokespecial   android/view/ViewGroup.<init>:(Landroid/content/Context;Landroid/util/AttributeSet;)V
        //    10: aload_0        
        //    11: iconst_m1      
        //    12: putfield        android/support/v4/view/PagerTitleStrip.mLastKnownCurrentPage:I
        //    15: aload_0        
        //    16: ldc             -1.0
        //    18: putfield        android/support/v4/view/PagerTitleStrip.mLastKnownPositionOffset:F
        //    21: aload_0        
        //    22: new             Landroid/support/v4/view/PagerTitleStrip$PageListener;
        //    25: dup            
        //    26: aload_0        
        //    27: aconst_null    
        //    28: invokespecial   android/support/v4/view/PagerTitleStrip$PageListener.<init>:(Landroid/support/v4/view/PagerTitleStrip;Landroid/support/v4/view/PagerTitleStrip$1;)V
        //    31: putfield        android/support/v4/view/PagerTitleStrip.mPageListener:Landroid/support/v4/view/PagerTitleStrip$PageListener;
        //    34: new             Landroid/widget/TextView;
        //    37: dup            
        //    38: aload_1        
        //    39: invokespecial   android/widget/TextView.<init>:(Landroid/content/Context;)V
        //    42: astore          4
        //    44: aload_0        
        //    45: aload           4
        //    47: putfield        android/support/v4/view/PagerTitleStrip.mPrevText:Landroid/widget/TextView;
        //    50: aload_0        
        //    51: aload           4
        //    53: invokevirtual   android/support/v4/view/PagerTitleStrip.addView:(Landroid/view/View;)V
        //    56: new             Landroid/widget/TextView;
        //    59: dup            
        //    60: aload_1        
        //    61: invokespecial   android/widget/TextView.<init>:(Landroid/content/Context;)V
        //    64: astore          5
        //    66: aload_0        
        //    67: aload           5
        //    69: putfield        android/support/v4/view/PagerTitleStrip.mCurrText:Landroid/widget/TextView;
        //    72: aload_0        
        //    73: aload           5
        //    75: invokevirtual   android/support/v4/view/PagerTitleStrip.addView:(Landroid/view/View;)V
        //    78: new             Landroid/widget/TextView;
        //    81: dup            
        //    82: aload_1        
        //    83: invokespecial   android/widget/TextView.<init>:(Landroid/content/Context;)V
        //    86: astore          6
        //    88: aload_0        
        //    89: aload           6
        //    91: putfield        android/support/v4/view/PagerTitleStrip.mNextText:Landroid/widget/TextView;
        //    94: aload_0        
        //    95: aload           6
        //    97: invokevirtual   android/support/v4/view/PagerTitleStrip.addView:(Landroid/view/View;)V
        //   100: aload_1        
        //   101: aload_2        
        //   102: getstatic       android/support/v4/view/PagerTitleStrip.ATTRS:[I
        //   105: invokevirtual   android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
        //   108: astore          7
        //   110: aload           7
        //   112: iconst_0       
        //   113: iconst_0       
        //   114: invokevirtual   android/content/res/TypedArray.getResourceId:(II)I
        //   117: istore          8
        //   119: iload           8
        //   121: ifeq            154
        //   124: aload_0        
        //   125: getfield        android/support/v4/view/PagerTitleStrip.mPrevText:Landroid/widget/TextView;
        //   128: aload_1        
        //   129: iload           8
        //   131: invokevirtual   android/widget/TextView.setTextAppearance:(Landroid/content/Context;I)V
        //   134: aload_0        
        //   135: getfield        android/support/v4/view/PagerTitleStrip.mCurrText:Landroid/widget/TextView;
        //   138: aload_1        
        //   139: iload           8
        //   141: invokevirtual   android/widget/TextView.setTextAppearance:(Landroid/content/Context;I)V
        //   144: aload_0        
        //   145: getfield        android/support/v4/view/PagerTitleStrip.mNextText:Landroid/widget/TextView;
        //   148: aload_1        
        //   149: iload           8
        //   151: invokevirtual   android/widget/TextView.setTextAppearance:(Landroid/content/Context;I)V
        //   154: aload           7
        //   156: iconst_1       
        //   157: iconst_0       
        //   158: invokevirtual   android/content/res/TypedArray.getDimensionPixelSize:(II)I
        //   161: istore          9
        //   163: iload           9
        //   165: ifeq            180
        //   168: iload           9
        //   170: i2f            
        //   171: fstore          16
        //   173: aload_0        
        //   174: iconst_0       
        //   175: fload           16
        //   177: invokevirtual   android/support/v4/view/PagerTitleStrip.setTextSize:(IF)V
        //   180: aload           7
        //   182: iconst_2       
        //   183: invokevirtual   android/content/res/TypedArray.hasValue:(I)Z
        //   186: ifeq            225
        //   189: aload           7
        //   191: iconst_2       
        //   192: iconst_0       
        //   193: invokevirtual   android/content/res/TypedArray.getColor:(II)I
        //   196: istore          15
        //   198: aload_0        
        //   199: getfield        android/support/v4/view/PagerTitleStrip.mPrevText:Landroid/widget/TextView;
        //   202: iload           15
        //   204: invokevirtual   android/widget/TextView.setTextColor:(I)V
        //   207: aload_0        
        //   208: getfield        android/support/v4/view/PagerTitleStrip.mCurrText:Landroid/widget/TextView;
        //   211: iload           15
        //   213: invokevirtual   android/widget/TextView.setTextColor:(I)V
        //   216: aload_0        
        //   217: getfield        android/support/v4/view/PagerTitleStrip.mNextText:Landroid/widget/TextView;
        //   220: iload           15
        //   222: invokevirtual   android/widget/TextView.setTextColor:(I)V
        //   225: aload_0        
        //   226: aload           7
        //   228: iconst_3       
        //   229: bipush          80
        //   231: invokevirtual   android/content/res/TypedArray.getInteger:(II)I
        //   234: putfield        android/support/v4/view/PagerTitleStrip.mGravity:I
        //   237: aload           7
        //   239: invokevirtual   android/content/res/TypedArray.recycle:()V
        //   242: aload_0        
        //   243: aload_0        
        //   244: getfield        android/support/v4/view/PagerTitleStrip.mCurrText:Landroid/widget/TextView;
        //   247: invokevirtual   android/widget/TextView.getTextColors:()Landroid/content/res/ColorStateList;
        //   250: invokevirtual   android/content/res/ColorStateList.getDefaultColor:()I
        //   253: putfield        android/support/v4/view/PagerTitleStrip.mTextColor:I
        //   256: aload_0        
        //   257: ldc             0.6
        //   259: invokevirtual   android/support/v4/view/PagerTitleStrip.setNonPrimaryAlpha:(F)V
        //   262: aload_0        
        //   263: getfield        android/support/v4/view/PagerTitleStrip.mPrevText:Landroid/widget/TextView;
        //   266: getstatic       android/text/TextUtils$TruncateAt.END:Landroid/text/TextUtils$TruncateAt;
        //   269: invokevirtual   android/widget/TextView.setEllipsize:(Landroid/text/TextUtils$TruncateAt;)V
        //   272: aload_0        
        //   273: getfield        android/support/v4/view/PagerTitleStrip.mCurrText:Landroid/widget/TextView;
        //   276: getstatic       android/text/TextUtils$TruncateAt.END:Landroid/text/TextUtils$TruncateAt;
        //   279: invokevirtual   android/widget/TextView.setEllipsize:(Landroid/text/TextUtils$TruncateAt;)V
        //   282: aload_0        
        //   283: getfield        android/support/v4/view/PagerTitleStrip.mNextText:Landroid/widget/TextView;
        //   286: getstatic       android/text/TextUtils$TruncateAt.END:Landroid/text/TextUtils$TruncateAt;
        //   289: invokevirtual   android/widget/TextView.setEllipsize:(Landroid/text/TextUtils$TruncateAt;)V
        //   292: iconst_0       
        //   293: istore          10
        //   295: iload           8
        //   297: ifeq            325
        //   300: aload_1        
        //   301: iload           8
        //   303: getstatic       android/support/v4/view/PagerTitleStrip.TEXT_ATTRS:[I
        //   306: invokevirtual   android/content/Context.obtainStyledAttributes:(I[I)Landroid/content/res/TypedArray;
        //   309: astore          14
        //   311: aload           14
        //   313: iconst_0       
        //   314: iconst_0       
        //   315: invokevirtual   android/content/res/TypedArray.getBoolean:(IZ)Z
        //   318: istore          10
        //   320: aload           14
        //   322: invokevirtual   android/content/res/TypedArray.recycle:()V
        //   325: iload           10
        //   327: ifeq            355
        //   330: aload_0        
        //   331: getfield        android/support/v4/view/PagerTitleStrip.mPrevText:Landroid/widget/TextView;
        //   334: invokestatic    android/support/v4/view/PagerTitleStrip.setSingleLineAllCaps:(Landroid/widget/TextView;)V
        //   337: aload_0        
        //   338: getfield        android/support/v4/view/PagerTitleStrip.mCurrText:Landroid/widget/TextView;
        //   341: invokestatic    android/support/v4/view/PagerTitleStrip.setSingleLineAllCaps:(Landroid/widget/TextView;)V
        //   344: aload_0        
        //   345: getfield        android/support/v4/view/PagerTitleStrip.mNextText:Landroid/widget/TextView;
        //   348: invokestatic    android/support/v4/view/PagerTitleStrip.setSingleLineAllCaps:(Landroid/widget/TextView;)V
        //   351: iload_3        
        //   352: ifeq            376
        //   355: aload_0        
        //   356: getfield        android/support/v4/view/PagerTitleStrip.mPrevText:Landroid/widget/TextView;
        //   359: invokevirtual   android/widget/TextView.setSingleLine:()V
        //   362: aload_0        
        //   363: getfield        android/support/v4/view/PagerTitleStrip.mCurrText:Landroid/widget/TextView;
        //   366: invokevirtual   android/widget/TextView.setSingleLine:()V
        //   369: aload_0        
        //   370: getfield        android/support/v4/view/PagerTitleStrip.mNextText:Landroid/widget/TextView;
        //   373: invokevirtual   android/widget/TextView.setSingleLine:()V
        //   376: ldc             16.0
        //   378: aload_1        
        //   379: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   382: invokevirtual   android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
        //   385: getfield        android/util/DisplayMetrics.density:F
        //   388: fmul           
        //   389: f2i            
        //   390: istore          12
        //   392: aload_0        
        //   393: iload           12
        //   395: putfield        android/support/v4/view/PagerTitleStrip.mScaledTextSpacing:I
        //   398: getstatic       android/support/v4/app/FragmentActivity.a:I
        //   401: ifeq            410
        //   404: iload_3        
        //   405: iconst_1       
        //   406: iadd           
        //   407: putstatic       android/support/v4/view/ViewPager.a:I
        //   410: return         
        //   411: astore          18
        //   413: aload           18
        //   415: athrow         
        //   416: astore          17
        //   418: aload           17
        //   420: athrow         
        //   421: astore          11
        //   423: aload           11
        //   425: athrow         
        //   426: astore          13
        //   428: aload           13
        //   430: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  124    154    411    416    Ljava/lang/IllegalStateException;
        //  173    180    416    421    Ljava/lang/IllegalStateException;
        //  330    351    421    426    Ljava/lang/IllegalStateException;
        //  355    376    421    426    Ljava/lang/IllegalStateException;
        //  392    410    426    431    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 211, Size: 211
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
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
    
    static float access$100(final PagerTitleStrip pagerTitleStrip) {
        return pagerTitleStrip.mLastKnownPositionOffset;
    }
    
    private static void setSingleLineAllCaps(final TextView singleLineAllCaps) {
        PagerTitleStrip.IMPL.setSingleLineAllCaps(singleLineAllCaps);
    }
    
    int getMinHeight() {
        final Drawable background = this.getBackground();
        int intrinsicHeight = 0;
        if (background != null) {
            intrinsicHeight = background.getIntrinsicHeight();
        }
        return intrinsicHeight;
    }
    
    public int getTextSpacing() {
        return this.mScaledTextSpacing;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        final ViewParent parent = this.getParent();
        try {
            if (!(parent instanceof ViewPager)) {
                throw new IllegalStateException(PagerTitleStrip.z[1]);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        while (true) {
            final ViewPager mPager = (ViewPager)parent;
            final PagerAdapter adapter = mPager.getAdapter();
            while (true) {
                try {
                    mPager.setInternalPageChangeListener(this.mPageListener);
                    mPager.setOnAdapterChangeListener(this.mPageListener);
                    this.mPager = mPager;
                    if (this.mWatchingAdapter != null) {
                        final PagerAdapter pagerAdapter = (PagerAdapter)this.mWatchingAdapter.get();
                        this.updateAdapter(pagerAdapter, adapter);
                        return;
                    }
                }
                catch (IllegalStateException ex2) {
                    throw ex2;
                }
                final PagerAdapter pagerAdapter = null;
                continue;
            }
        }
    }
    
    protected void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
            if (this.mPager != null) {
                this.updateAdapter(this.mPager.getAdapter(), null);
                this.mPager.setInternalPageChangeListener(null);
                this.mPager.setOnAdapterChangeListener(null);
                this.mPager = null;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    protected void onLayout(final boolean p0, final int p1, final int p2, final int p3, final int p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v4/view/PagerTitleStrip.mPager:Landroid/support/v4/view/ViewPager;
        //     4: astore          8
        //     6: aload           8
        //     8: ifnull          44
        //    11: aload_0        
        //    12: getfield        android/support/v4/view/PagerTitleStrip.mLastKnownPositionOffset:F
        //    15: fconst_0       
        //    16: fcmpl          
        //    17: istore          9
        //    19: fconst_0       
        //    20: fstore          10
        //    22: iload           9
        //    24: iflt            33
        //    27: aload_0        
        //    28: getfield        android/support/v4/view/PagerTitleStrip.mLastKnownPositionOffset:F
        //    31: fstore          10
        //    33: aload_0        
        //    34: aload_0        
        //    35: getfield        android/support/v4/view/PagerTitleStrip.mLastKnownCurrentPage:I
        //    38: fload           10
        //    40: iconst_1       
        //    41: invokevirtual   android/support/v4/view/PagerTitleStrip.updateTextPositions:(IFZ)V
        //    44: return         
        //    45: astore          6
        //    47: aload           6
        //    49: athrow         
        //    50: astore          7
        //    52: aload           7
        //    54: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      6      45     50     Ljava/lang/IllegalStateException;
        //  11     19     50     55     Ljava/lang/IllegalStateException;
        //  27     33     50     55     Ljava/lang/IllegalStateException;
        //  47     50     50     55     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0033:
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
    
    protected void onMeasure(final int n, final int n2) {
        final int mode = View$MeasureSpec.getMode(n);
        final int mode2 = View$MeasureSpec.getMode(n2);
        final int size = View$MeasureSpec.getSize(n);
        final int size2 = View$MeasureSpec.getSize(n2);
        if (mode != 1073741824) {
            try {
                throw new IllegalStateException(PagerTitleStrip.z[0]);
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
        }
        final int minHeight = this.getMinHeight();
        final int n3 = this.getPaddingTop() + this.getPaddingBottom();
        final int n4 = size2 - n3;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec((int)(0.8f * size), Integer.MIN_VALUE);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(n4, Integer.MIN_VALUE);
        try {
            this.mPrevText.measure(measureSpec, measureSpec2);
            this.mCurrText.measure(measureSpec, measureSpec2);
            this.mNextText.measure(measureSpec, measureSpec2);
            if (mode2 == 1073741824) {
                this.setMeasuredDimension(size, size2);
                if (ViewPager.a == 0) {
                    return;
                }
            }
            this.setMeasuredDimension(size, Math.max(minHeight, n3 + this.mCurrText.getMeasuredHeight()));
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
    }
    
    public void requestLayout() {
        try {
            if (!this.mUpdatingText) {
                super.requestLayout();
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public void setNonPrimaryAlpha(final float n) {
        this.mNonPrimaryAlpha = (0xFF & (int)(255.0f * n));
        final int n2 = this.mNonPrimaryAlpha << 24 | (0xFFFFFF & this.mTextColor);
        this.mPrevText.setTextColor(n2);
        this.mNextText.setTextColor(n2);
    }
    
    public void setTextSize(final int n, final float n2) {
        this.mPrevText.setTextSize(n, n2);
        this.mCurrText.setTextSize(n, n2);
        this.mNextText.setTextSize(n, n2);
    }
    
    public void setTextSpacing(final int mScaledTextSpacing) {
        this.mScaledTextSpacing = mScaledTextSpacing;
        this.requestLayout();
    }
    
    void updateAdapter(final PagerAdapter p0, final PagerAdapter p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnull          17
        //     4: aload_1        
        //     5: aload_0        
        //     6: getfield        android/support/v4/view/PagerTitleStrip.mPageListener:Landroid/support/v4/view/PagerTitleStrip$PageListener;
        //     9: invokevirtual   android/support/v4/view/PagerAdapter.unregisterDataSetObserver:(Landroid/database/DataSetObserver;)V
        //    12: aload_0        
        //    13: aconst_null    
        //    14: putfield        android/support/v4/view/PagerTitleStrip.mWatchingAdapter:Ljava/lang/ref/WeakReference;
        //    17: aload_2        
        //    18: ifnull          41
        //    21: aload_2        
        //    22: aload_0        
        //    23: getfield        android/support/v4/view/PagerTitleStrip.mPageListener:Landroid/support/v4/view/PagerTitleStrip$PageListener;
        //    26: invokevirtual   android/support/v4/view/PagerAdapter.registerDataSetObserver:(Landroid/database/DataSetObserver;)V
        //    29: aload_0        
        //    30: new             Ljava/lang/ref/WeakReference;
        //    33: dup            
        //    34: aload_2        
        //    35: invokespecial   java/lang/ref/WeakReference.<init>:(Ljava/lang/Object;)V
        //    38: putfield        android/support/v4/view/PagerTitleStrip.mWatchingAdapter:Ljava/lang/ref/WeakReference;
        //    41: aload_0        
        //    42: getfield        android/support/v4/view/PagerTitleStrip.mPager:Landroid/support/v4/view/ViewPager;
        //    45: ifnull          75
        //    48: aload_0        
        //    49: iconst_m1      
        //    50: putfield        android/support/v4/view/PagerTitleStrip.mLastKnownCurrentPage:I
        //    53: aload_0        
        //    54: ldc             -1.0
        //    56: putfield        android/support/v4/view/PagerTitleStrip.mLastKnownPositionOffset:F
        //    59: aload_0        
        //    60: aload_0        
        //    61: getfield        android/support/v4/view/PagerTitleStrip.mPager:Landroid/support/v4/view/ViewPager;
        //    64: invokevirtual   android/support/v4/view/ViewPager.getCurrentItem:()I
        //    67: aload_2        
        //    68: invokevirtual   android/support/v4/view/PagerTitleStrip.updateText:(ILandroid/support/v4/view/PagerAdapter;)V
        //    71: aload_0        
        //    72: invokevirtual   android/support/v4/view/PagerTitleStrip.requestLayout:()V
        //    75: return         
        //    76: astore          5
        //    78: aload           5
        //    80: athrow         
        //    81: astore          4
        //    83: aload           4
        //    85: athrow         
        //    86: astore_3       
        //    87: aload_3        
        //    88: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      17     76     81     Ljava/lang/IllegalStateException;
        //  21     41     81     86     Ljava/lang/IllegalStateException;
        //  41     75     86     89     Ljava/lang/IllegalStateException;
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
    
    void updateText(final int p0, final PagerAdapter p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnull          241
        //     4: aload_2        
        //     5: invokevirtual   android/support/v4/view/PagerAdapter.getCount:()I
        //     8: istore          18
        //    10: iload           18
        //    12: istore_3       
        //    13: aload_0        
        //    14: iconst_1       
        //    15: putfield        android/support/v4/view/PagerTitleStrip.mUpdatingText:Z
        //    18: iload_1        
        //    19: iconst_1       
        //    20: if_icmplt       267
        //    23: aload_2        
        //    24: ifnull          267
        //    27: aload_2        
        //    28: iload_1        
        //    29: iconst_1       
        //    30: isub           
        //    31: invokevirtual   android/support/v4/view/PagerAdapter.getPageTitle:(I)Ljava/lang/CharSequence;
        //    34: astore          4
        //    36: aload_0        
        //    37: getfield        android/support/v4/view/PagerTitleStrip.mPrevText:Landroid/widget/TextView;
        //    40: aload           4
        //    42: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    45: aload_0        
        //    46: getfield        android/support/v4/view/PagerTitleStrip.mCurrText:Landroid/widget/TextView;
        //    49: astore          7
        //    51: aload_2        
        //    52: ifnull          256
        //    55: iload_1        
        //    56: iload_3        
        //    57: if_icmpge       256
        //    60: aload_2        
        //    61: iload_1        
        //    62: invokevirtual   android/support/v4/view/PagerAdapter.getPageTitle:(I)Ljava/lang/CharSequence;
        //    65: astore          16
        //    67: aload           16
        //    69: astore          8
        //    71: aload           7
        //    73: aload           8
        //    75: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    78: iload_1        
        //    79: iconst_1       
        //    80: iadd           
        //    81: istore          9
        //    83: aconst_null    
        //    84: astore          10
        //    86: iload           9
        //    88: iload_3        
        //    89: if_icmpge       108
        //    92: aconst_null    
        //    93: astore          10
        //    95: aload_2        
        //    96: ifnull          108
        //    99: aload_2        
        //   100: iload_1        
        //   101: iconst_1       
        //   102: iadd           
        //   103: invokevirtual   android/support/v4/view/PagerAdapter.getPageTitle:(I)Ljava/lang/CharSequence;
        //   106: astore          10
        //   108: aload_0        
        //   109: getfield        android/support/v4/view/PagerTitleStrip.mNextText:Landroid/widget/TextView;
        //   112: aload           10
        //   114: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   117: aload_0        
        //   118: invokevirtual   android/support/v4/view/PagerTitleStrip.getWidth:()I
        //   121: aload_0        
        //   122: invokevirtual   android/support/v4/view/PagerTitleStrip.getPaddingLeft:()I
        //   125: isub           
        //   126: aload_0        
        //   127: invokevirtual   android/support/v4/view/PagerTitleStrip.getPaddingRight:()I
        //   130: isub           
        //   131: istore          11
        //   133: aload_0        
        //   134: invokevirtual   android/support/v4/view/PagerTitleStrip.getHeight:()I
        //   137: aload_0        
        //   138: invokevirtual   android/support/v4/view/PagerTitleStrip.getPaddingTop:()I
        //   141: isub           
        //   142: aload_0        
        //   143: invokevirtual   android/support/v4/view/PagerTitleStrip.getPaddingBottom:()I
        //   146: isub           
        //   147: istore          12
        //   149: ldc_w           0.8
        //   152: iload           11
        //   154: i2f            
        //   155: fmul           
        //   156: f2i            
        //   157: ldc_w           -2147483648
        //   160: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   163: istore          13
        //   165: iload           12
        //   167: ldc_w           -2147483648
        //   170: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   173: istore          14
        //   175: aload_0        
        //   176: getfield        android/support/v4/view/PagerTitleStrip.mPrevText:Landroid/widget/TextView;
        //   179: iload           13
        //   181: iload           14
        //   183: invokevirtual   android/widget/TextView.measure:(II)V
        //   186: aload_0        
        //   187: getfield        android/support/v4/view/PagerTitleStrip.mCurrText:Landroid/widget/TextView;
        //   190: iload           13
        //   192: iload           14
        //   194: invokevirtual   android/widget/TextView.measure:(II)V
        //   197: aload_0        
        //   198: getfield        android/support/v4/view/PagerTitleStrip.mNextText:Landroid/widget/TextView;
        //   201: iload           13
        //   203: iload           14
        //   205: invokevirtual   android/widget/TextView.measure:(II)V
        //   208: aload_0        
        //   209: iload_1        
        //   210: putfield        android/support/v4/view/PagerTitleStrip.mLastKnownCurrentPage:I
        //   213: aload_0        
        //   214: getfield        android/support/v4/view/PagerTitleStrip.mUpdatingPositions:Z
        //   217: ifne            230
        //   220: aload_0        
        //   221: iload_1        
        //   222: aload_0        
        //   223: getfield        android/support/v4/view/PagerTitleStrip.mLastKnownPositionOffset:F
        //   226: iconst_0       
        //   227: invokevirtual   android/support/v4/view/PagerTitleStrip.updateTextPositions:(IFZ)V
        //   230: aload_0        
        //   231: iconst_0       
        //   232: putfield        android/support/v4/view/PagerTitleStrip.mUpdatingText:Z
        //   235: return         
        //   236: astore          17
        //   238: aload           17
        //   240: athrow         
        //   241: iconst_0       
        //   242: istore_3       
        //   243: goto            13
        //   246: astore          5
        //   248: aload           5
        //   250: athrow         
        //   251: astore          6
        //   253: aload           6
        //   255: athrow         
        //   256: aconst_null    
        //   257: astore          8
        //   259: goto            71
        //   262: astore          15
        //   264: aload           15
        //   266: athrow         
        //   267: aconst_null    
        //   268: astore          4
        //   270: goto            36
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      10     236    241    Ljava/lang/IllegalStateException;
        //  36     51     246    251    Ljava/lang/IllegalStateException;
        //  60     67     251    256    Ljava/lang/IllegalStateException;
        //  175    230    262    267    Ljava/lang/IllegalStateException;
        //  248    251    251    256    Ljava/lang/IllegalStateException;
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
    
    void updateTextPositions(final int p0, final float p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: aload_0        
        //     6: getfield        android/support/v4/view/PagerTitleStrip.mLastKnownCurrentPage:I
        //     9: istore          9
        //    11: iload_1        
        //    12: iload           9
        //    14: if_icmpeq       34
        //    17: aload_0        
        //    18: iload_1        
        //    19: aload_0        
        //    20: getfield        android/support/v4/view/PagerTitleStrip.mPager:Landroid/support/v4/view/ViewPager;
        //    23: invokevirtual   android/support/v4/view/ViewPager.getAdapter:()Landroid/support/v4/view/PagerAdapter;
        //    26: invokevirtual   android/support/v4/view/PagerTitleStrip.updateText:(ILandroid/support/v4/view/PagerAdapter;)V
        //    29: iload           4
        //    31: ifeq            72
        //    34: iload_3        
        //    35: ifne            72
        //    38: aload_0        
        //    39: getfield        android/support/v4/view/PagerTitleStrip.mLastKnownPositionOffset:F
        //    42: fstore          44
        //    44: fload_2        
        //    45: fload           44
        //    47: fcmpl          
        //    48: ifne            72
        //    51: return         
        //    52: astore          5
        //    54: aload           5
        //    56: athrow         
        //    57: astore          6
        //    59: aload           6
        //    61: athrow         
        //    62: astore          7
        //    64: aload           7
        //    66: athrow         
        //    67: astore          8
        //    69: aload           8
        //    71: athrow         
        //    72: aload_0        
        //    73: iconst_1       
        //    74: putfield        android/support/v4/view/PagerTitleStrip.mUpdatingPositions:Z
        //    77: aload_0        
        //    78: getfield        android/support/v4/view/PagerTitleStrip.mPrevText:Landroid/widget/TextView;
        //    81: invokevirtual   android/widget/TextView.getMeasuredWidth:()I
        //    84: istore          10
        //    86: aload_0        
        //    87: getfield        android/support/v4/view/PagerTitleStrip.mCurrText:Landroid/widget/TextView;
        //    90: invokevirtual   android/widget/TextView.getMeasuredWidth:()I
        //    93: istore          11
        //    95: aload_0        
        //    96: getfield        android/support/v4/view/PagerTitleStrip.mNextText:Landroid/widget/TextView;
        //    99: invokevirtual   android/widget/TextView.getMeasuredWidth:()I
        //   102: istore          12
        //   104: iload           11
        //   106: iconst_2       
        //   107: idiv           
        //   108: istore          13
        //   110: aload_0        
        //   111: invokevirtual   android/support/v4/view/PagerTitleStrip.getWidth:()I
        //   114: istore          14
        //   116: aload_0        
        //   117: invokevirtual   android/support/v4/view/PagerTitleStrip.getHeight:()I
        //   120: istore          15
        //   122: aload_0        
        //   123: invokevirtual   android/support/v4/view/PagerTitleStrip.getPaddingLeft:()I
        //   126: istore          16
        //   128: aload_0        
        //   129: invokevirtual   android/support/v4/view/PagerTitleStrip.getPaddingRight:()I
        //   132: istore          17
        //   134: aload_0        
        //   135: invokevirtual   android/support/v4/view/PagerTitleStrip.getPaddingTop:()I
        //   138: istore          18
        //   140: aload_0        
        //   141: invokevirtual   android/support/v4/view/PagerTitleStrip.getPaddingBottom:()I
        //   144: istore          19
        //   146: iload           16
        //   148: iload           13
        //   150: iadd           
        //   151: istore          20
        //   153: iload           17
        //   155: iload           13
        //   157: iadd           
        //   158: istore          21
        //   160: iload           14
        //   162: iload           20
        //   164: isub           
        //   165: iload           21
        //   167: isub           
        //   168: istore          22
        //   170: ldc_w           0.5
        //   173: fload_2        
        //   174: fadd           
        //   175: fstore          23
        //   177: fload           23
        //   179: fconst_1       
        //   180: fcmpl          
        //   181: ifle            190
        //   184: fload           23
        //   186: fconst_1       
        //   187: fsub           
        //   188: fstore          23
        //   190: iload           14
        //   192: iload           21
        //   194: isub           
        //   195: fload           23
        //   197: iload           22
        //   199: i2f            
        //   200: fmul           
        //   201: f2i            
        //   202: isub           
        //   203: iload           11
        //   205: iconst_2       
        //   206: idiv           
        //   207: isub           
        //   208: istore          24
        //   210: iload           24
        //   212: iload           11
        //   214: iadd           
        //   215: istore          25
        //   217: aload_0        
        //   218: getfield        android/support/v4/view/PagerTitleStrip.mPrevText:Landroid/widget/TextView;
        //   221: invokevirtual   android/widget/TextView.getBaseline:()I
        //   224: istore          26
        //   226: aload_0        
        //   227: getfield        android/support/v4/view/PagerTitleStrip.mCurrText:Landroid/widget/TextView;
        //   230: invokevirtual   android/widget/TextView.getBaseline:()I
        //   233: istore          27
        //   235: aload_0        
        //   236: getfield        android/support/v4/view/PagerTitleStrip.mNextText:Landroid/widget/TextView;
        //   239: invokevirtual   android/widget/TextView.getBaseline:()I
        //   242: istore          28
        //   244: iload           26
        //   246: iload           27
        //   248: invokestatic    java/lang/Math.max:(II)I
        //   251: iload           28
        //   253: invokestatic    java/lang/Math.max:(II)I
        //   256: istore          29
        //   258: iload           29
        //   260: iload           26
        //   262: isub           
        //   263: istore          30
        //   265: iload           29
        //   267: iload           27
        //   269: isub           
        //   270: istore          31
        //   272: iload           29
        //   274: iload           28
        //   276: isub           
        //   277: istore          32
        //   279: iload           30
        //   281: aload_0        
        //   282: getfield        android/support/v4/view/PagerTitleStrip.mPrevText:Landroid/widget/TextView;
        //   285: invokevirtual   android/widget/TextView.getMeasuredHeight:()I
        //   288: iadd           
        //   289: istore          33
        //   291: iload           31
        //   293: aload_0        
        //   294: getfield        android/support/v4/view/PagerTitleStrip.mCurrText:Landroid/widget/TextView;
        //   297: invokevirtual   android/widget/TextView.getMeasuredHeight:()I
        //   300: iadd           
        //   301: istore          34
        //   303: iload           32
        //   305: aload_0        
        //   306: getfield        android/support/v4/view/PagerTitleStrip.mNextText:Landroid/widget/TextView;
        //   309: invokevirtual   android/widget/TextView.getMeasuredHeight:()I
        //   312: iadd           
        //   313: istore          35
        //   315: iload           33
        //   317: iload           34
        //   319: invokestatic    java/lang/Math.max:(II)I
        //   322: iload           35
        //   324: invokestatic    java/lang/Math.max:(II)I
        //   327: istore          36
        //   329: bipush          112
        //   331: aload_0        
        //   332: getfield        android/support/v4/view/PagerTitleStrip.mGravity:I
        //   335: iand           
        //   336: lookupswitch {
        //               16: 390
        //               80: 431
        //          default: 364
        //        }
        //   364: iload           18
        //   366: iload           30
        //   368: iadd           
        //   369: istore          38
        //   371: iload           18
        //   373: iload           31
        //   375: iadd           
        //   376: istore          39
        //   378: iload           18
        //   380: iload           32
        //   382: iadd           
        //   383: istore          40
        //   385: iload           4
        //   387: ifeq            462
        //   390: iload           15
        //   392: iload           18
        //   394: isub           
        //   395: iload           19
        //   397: isub           
        //   398: iload           36
        //   400: isub           
        //   401: iconst_2       
        //   402: idiv           
        //   403: istore          43
        //   405: iload           43
        //   407: iload           30
        //   409: iadd           
        //   410: istore          38
        //   412: iload           43
        //   414: iload           31
        //   416: iadd           
        //   417: istore          39
        //   419: iload           43
        //   421: iload           32
        //   423: iadd           
        //   424: istore          40
        //   426: iload           4
        //   428: ifeq            462
        //   431: iload           15
        //   433: iload           19
        //   435: isub           
        //   436: iload           36
        //   438: isub           
        //   439: istore          37
        //   441: iload           37
        //   443: iload           30
        //   445: iadd           
        //   446: istore          38
        //   448: iload           37
        //   450: iload           31
        //   452: iadd           
        //   453: istore          39
        //   455: iload           37
        //   457: iload           32
        //   459: iadd           
        //   460: istore          40
        //   462: aload_0        
        //   463: getfield        android/support/v4/view/PagerTitleStrip.mCurrText:Landroid/widget/TextView;
        //   466: iload           24
        //   468: iload           39
        //   470: iload           25
        //   472: iload           39
        //   474: aload_0        
        //   475: getfield        android/support/v4/view/PagerTitleStrip.mCurrText:Landroid/widget/TextView;
        //   478: invokevirtual   android/widget/TextView.getMeasuredHeight:()I
        //   481: iadd           
        //   482: invokevirtual   android/widget/TextView.layout:(IIII)V
        //   485: iload           16
        //   487: iload           24
        //   489: aload_0        
        //   490: getfield        android/support/v4/view/PagerTitleStrip.mScaledTextSpacing:I
        //   493: isub           
        //   494: iload           10
        //   496: isub           
        //   497: invokestatic    java/lang/Math.min:(II)I
        //   500: istore          41
        //   502: aload_0        
        //   503: getfield        android/support/v4/view/PagerTitleStrip.mPrevText:Landroid/widget/TextView;
        //   506: iload           41
        //   508: iload           38
        //   510: iload           10
        //   512: iload           41
        //   514: iadd           
        //   515: iload           38
        //   517: aload_0        
        //   518: getfield        android/support/v4/view/PagerTitleStrip.mPrevText:Landroid/widget/TextView;
        //   521: invokevirtual   android/widget/TextView.getMeasuredHeight:()I
        //   524: iadd           
        //   525: invokevirtual   android/widget/TextView.layout:(IIII)V
        //   528: iload           14
        //   530: iload           17
        //   532: isub           
        //   533: iload           12
        //   535: isub           
        //   536: iload           25
        //   538: aload_0        
        //   539: getfield        android/support/v4/view/PagerTitleStrip.mScaledTextSpacing:I
        //   542: iadd           
        //   543: invokestatic    java/lang/Math.max:(II)I
        //   546: istore          42
        //   548: aload_0        
        //   549: getfield        android/support/v4/view/PagerTitleStrip.mNextText:Landroid/widget/TextView;
        //   552: iload           42
        //   554: iload           40
        //   556: iload           42
        //   558: iload           12
        //   560: iadd           
        //   561: iload           40
        //   563: aload_0        
        //   564: getfield        android/support/v4/view/PagerTitleStrip.mNextText:Landroid/widget/TextView;
        //   567: invokevirtual   android/widget/TextView.getMeasuredHeight:()I
        //   570: iadd           
        //   571: invokevirtual   android/widget/TextView.layout:(IIII)V
        //   574: aload_0        
        //   575: fload_2        
        //   576: putfield        android/support/v4/view/PagerTitleStrip.mLastKnownPositionOffset:F
        //   579: aload_0        
        //   580: iconst_0       
        //   581: putfield        android/support/v4/view/PagerTitleStrip.mUpdatingPositions:Z
        //   584: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  5      11     52     57     Ljava/lang/IllegalStateException;
        //  17     29     57     67     Ljava/lang/IllegalStateException;
        //  38     44     67     72     Ljava/lang/IllegalStateException;
        //  54     57     57     67     Ljava/lang/IllegalStateException;
        //  59     62     62     67     Ljava/lang/IllegalStateException;
        //  64     67     67     72     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 298, Size: 298
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
