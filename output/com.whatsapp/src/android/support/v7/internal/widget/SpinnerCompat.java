// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.os.Parcelable;
import android.content.DialogInterface;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import android.graphics.drawable.Drawable;
import android.widget.SpinnerAdapter;
import android.view.ViewGroup;
import android.view.View;
import android.support.v7.appcompat.R$attr;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.ListPopupWindow$ForwardingListener;
import android.content.DialogInterface$OnClickListener;

class SpinnerCompat extends AbsSpinnerCompat implements DialogInterface$OnClickListener
{
    private static final String[] z;
    private boolean mDisableChildrenWhenDisabled;
    int mDropDownWidth;
    private ListPopupWindow$ForwardingListener mForwardingListener;
    private int mGravity;
    private SpinnerCompat$SpinnerPopup mPopup;
    private SpinnerCompat$DropDownAdapter mTempAdapter;
    private Rect mTempRect;
    private final TintManager mTintManager;
    
    static {
        final String[] z2 = new String[2];
        String s = "o9J=[U([\u001fvp5]\u0019yu/J\u0017[y.\u001e\u0011Tr2Q\u0006\u0015~9\u001e\u0007Fy8\u001e\u0005\\h4\u001e\u0013\u0015o,W\u001c[y.\u0010";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '5';
                        break;
                    }
                    case 0: {
                        c2 = '\u001c';
                        break;
                    }
                    case 1: {
                        c2 = '\\';
                        break;
                    }
                    case 2: {
                        c2 = '>';
                        break;
                    }
                    case 3: {
                        c2 = 'r';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "O,W\u001c[y.\u001e\u0013Q},J\u0017G<*W\u0017B<(G\u0002P<?Q\u0007[h|S\u0007Fh|\\\u0017\u0015-";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    SpinnerCompat(final Context context) {
        this(context, null);
    }
    
    SpinnerCompat(final Context context, final int n) {
        this(context, null, R$attr.spinnerStyle, n);
    }
    
    SpinnerCompat(final Context context, final AttributeSet set) {
        this(context, set, R$attr.spinnerStyle);
    }
    
    SpinnerCompat(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, -1);
    }
    
    SpinnerCompat(final Context p0, final AttributeSet p1, final int p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: aload_2        
        //     3: iload_3        
        //     4: invokespecial   android/support/v7/internal/widget/AbsSpinnerCompat.<init>:(Landroid/content/Context;Landroid/util/AttributeSet;I)V
        //     7: aload_0        
        //     8: new             Landroid/graphics/Rect;
        //    11: dup            
        //    12: invokespecial   android/graphics/Rect.<init>:()V
        //    15: putfield        android/support/v7/internal/widget/SpinnerCompat.mTempRect:Landroid/graphics/Rect;
        //    18: aload_1        
        //    19: aload_2        
        //    20: getstatic       android/support/v7/appcompat/R$styleable.Spinner:[I
        //    23: iload_3        
        //    24: iconst_0       
        //    25: invokestatic    android/support/v7/internal/widget/TintTypedArray.obtainStyledAttributes:(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/internal/widget/TintTypedArray;
        //    28: astore          5
        //    30: aload           5
        //    32: getstatic       android/support/v7/appcompat/R$styleable.Spinner_android_background:I
        //    35: invokevirtual   android/support/v7/internal/widget/TintTypedArray.hasValue:(I)Z
        //    38: ifeq            53
        //    41: aload_0        
        //    42: aload           5
        //    44: getstatic       android/support/v7/appcompat/R$styleable.Spinner_android_background:I
        //    47: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //    50: invokevirtual   android/support/v7/internal/widget/SpinnerCompat.setBackgroundDrawable:(Landroid/graphics/drawable/Drawable;)V
        //    53: iload           4
        //    55: iconst_m1      
        //    56: if_icmpne       70
        //    59: aload           5
        //    61: getstatic       android/support/v7/appcompat/R$styleable.Spinner_spinnerMode:I
        //    64: iconst_0       
        //    65: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getInt:(II)I
        //    68: istore          4
        //    70: iload           4
        //    72: tableswitch {
        //                0: 185
        //                1: 208
        //          default: 96
        //        }
        //    96: aload_0        
        //    97: aload           5
        //    99: getstatic       android/support/v7/appcompat/R$styleable.Spinner_android_gravity:I
        //   102: bipush          17
        //   104: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getInt:(II)I
        //   107: putfield        android/support/v7/internal/widget/SpinnerCompat.mGravity:I
        //   110: aload_0        
        //   111: getfield        android/support/v7/internal/widget/SpinnerCompat.mPopup:Landroid/support/v7/internal/widget/SpinnerCompat$SpinnerPopup;
        //   114: aload           5
        //   116: getstatic       android/support/v7/appcompat/R$styleable.Spinner_prompt:I
        //   119: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getString:(I)Ljava/lang/String;
        //   122: invokeinterface android/support/v7/internal/widget/SpinnerCompat$SpinnerPopup.setPromptText:(Ljava/lang/CharSequence;)V
        //   127: aload_0        
        //   128: aload           5
        //   130: getstatic       android/support/v7/appcompat/R$styleable.Spinner_disableChildrenWhenDisabled:I
        //   133: iconst_0       
        //   134: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getBoolean:(IZ)Z
        //   137: putfield        android/support/v7/internal/widget/SpinnerCompat.mDisableChildrenWhenDisabled:Z
        //   140: aload           5
        //   142: invokevirtual   android/support/v7/internal/widget/TintTypedArray.recycle:()V
        //   145: aload_0        
        //   146: getfield        android/support/v7/internal/widget/SpinnerCompat.mTempAdapter:Landroid/support/v7/internal/widget/SpinnerCompat$DropDownAdapter;
        //   149: ifnull          170
        //   152: aload_0        
        //   153: getfield        android/support/v7/internal/widget/SpinnerCompat.mPopup:Landroid/support/v7/internal/widget/SpinnerCompat$SpinnerPopup;
        //   156: aload_0        
        //   157: getfield        android/support/v7/internal/widget/SpinnerCompat.mTempAdapter:Landroid/support/v7/internal/widget/SpinnerCompat$DropDownAdapter;
        //   160: invokeinterface android/support/v7/internal/widget/SpinnerCompat$SpinnerPopup.setAdapter:(Landroid/widget/ListAdapter;)V
        //   165: aload_0        
        //   166: aconst_null    
        //   167: putfield        android/support/v7/internal/widget/SpinnerCompat.mTempAdapter:Landroid/support/v7/internal/widget/SpinnerCompat$DropDownAdapter;
        //   170: aload_0        
        //   171: aload           5
        //   173: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getTintManager:()Landroid/support/v7/internal/widget/TintManager;
        //   176: putfield        android/support/v7/internal/widget/SpinnerCompat.mTintManager:Landroid/support/v7/internal/widget/TintManager;
        //   179: return         
        //   180: astore          6
        //   182: aload           6
        //   184: athrow         
        //   185: aload_0        
        //   186: new             Landroid/support/v7/internal/widget/SpinnerCompat$DialogPopup;
        //   189: dup            
        //   190: aload_0        
        //   191: aconst_null    
        //   192: invokespecial   android/support/v7/internal/widget/SpinnerCompat$DialogPopup.<init>:(Landroid/support/v7/internal/widget/SpinnerCompat;Landroid/support/v7/internal/widget/SpinnerCompat$1;)V
        //   195: putfield        android/support/v7/internal/widget/SpinnerCompat.mPopup:Landroid/support/v7/internal/widget/SpinnerCompat$SpinnerPopup;
        //   198: getstatic       android/support/v7/internal/widget/AdapterViewCompat.a:I
        //   201: istore          10
        //   203: iload           10
        //   205: ifeq            96
        //   208: new             Landroid/support/v7/internal/widget/SpinnerCompat$DropdownPopup;
        //   211: dup            
        //   212: aload_0        
        //   213: aload_1        
        //   214: aload_2        
        //   215: iload_3        
        //   216: invokespecial   android/support/v7/internal/widget/SpinnerCompat$DropdownPopup.<init>:(Landroid/support/v7/internal/widget/SpinnerCompat;Landroid/content/Context;Landroid/util/AttributeSet;I)V
        //   219: astore          7
        //   221: aload_0        
        //   222: aload           5
        //   224: getstatic       android/support/v7/appcompat/R$styleable.Spinner_android_dropDownWidth:I
        //   227: bipush          -2
        //   229: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getLayoutDimension:(II)I
        //   232: putfield        android/support/v7/internal/widget/SpinnerCompat.mDropDownWidth:I
        //   235: aload           7
        //   237: aload           5
        //   239: getstatic       android/support/v7/appcompat/R$styleable.Spinner_android_popupBackground:I
        //   242: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   245: invokevirtual   android/support/v7/internal/widget/SpinnerCompat$DropdownPopup.setBackgroundDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   248: aload_0        
        //   249: aload           7
        //   251: putfield        android/support/v7/internal/widget/SpinnerCompat.mPopup:Landroid/support/v7/internal/widget/SpinnerCompat$SpinnerPopup;
        //   254: aload_0        
        //   255: new             Landroid/support/v7/internal/widget/SpinnerCompat$1;
        //   258: dup            
        //   259: aload_0        
        //   260: aload_0        
        //   261: aload           7
        //   263: invokespecial   android/support/v7/internal/widget/SpinnerCompat$1.<init>:(Landroid/support/v7/internal/widget/SpinnerCompat;Landroid/view/View;Landroid/support/v7/internal/widget/SpinnerCompat$DropdownPopup;)V
        //   266: putfield        android/support/v7/internal/widget/SpinnerCompat.mForwardingListener:Landroid/support/v7/widget/ListPopupWindow$ForwardingListener;
        //   269: goto            96
        //   272: astore          9
        //   274: aload           9
        //   276: athrow         
        //   277: astore          8
        //   279: aload           8
        //   281: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  30     53     180    185    Ljava/lang/IllegalArgumentException;
        //  96     170    277    282    Ljava/lang/IllegalArgumentException;
        //  185    203    272    277    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0096:
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
    
    static SpinnerCompat$SpinnerPopup access$100(final SpinnerCompat spinnerCompat) {
        return spinnerCompat.mPopup;
    }
    
    private View makeView(final int n, final boolean b) {
        if (!this.mDataChanged) {
            final View value = this.mRecycler.get(n);
            if (value != null) {
                try {
                    this.setUpChild(value, b);
                    return value;
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
        }
        final View view = this.mAdapter.getView(n, (View)null, (ViewGroup)this);
        this.setUpChild(view, b);
        return view;
    }
    
    private void setUpChild(final View p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //     4: astore_3       
        //     5: aload_3        
        //     6: ifnonnull       14
        //     9: aload_0        
        //    10: invokevirtual   android/support/v7/internal/widget/SpinnerCompat.generateDefaultLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //    13: astore_3       
        //    14: iload_2        
        //    15: ifeq            26
        //    18: aload_0        
        //    19: aload_1        
        //    20: iconst_0       
        //    21: aload_3        
        //    22: invokevirtual   android/support/v7/internal/widget/SpinnerCompat.addViewInLayout:(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z
        //    25: pop            
        //    26: aload_1        
        //    27: aload_0        
        //    28: invokevirtual   android/support/v7/internal/widget/SpinnerCompat.hasFocus:()Z
        //    31: invokevirtual   android/view/View.setSelected:(Z)V
        //    34: aload_0        
        //    35: getfield        android/support/v7/internal/widget/SpinnerCompat.mDisableChildrenWhenDisabled:Z
        //    38: ifeq            49
        //    41: aload_1        
        //    42: aload_0        
        //    43: invokevirtual   android/support/v7/internal/widget/SpinnerCompat.isEnabled:()Z
        //    46: invokevirtual   android/view/View.setEnabled:(Z)V
        //    49: aload_0        
        //    50: getfield        android/support/v7/internal/widget/SpinnerCompat.mHeightMeasureSpec:I
        //    53: aload_0        
        //    54: getfield        android/support/v7/internal/widget/SpinnerCompat.mSpinnerPadding:Landroid/graphics/Rect;
        //    57: getfield        android/graphics/Rect.top:I
        //    60: aload_0        
        //    61: getfield        android/support/v7/internal/widget/SpinnerCompat.mSpinnerPadding:Landroid/graphics/Rect;
        //    64: getfield        android/graphics/Rect.bottom:I
        //    67: iadd           
        //    68: aload_3        
        //    69: getfield        android/view/ViewGroup$LayoutParams.height:I
        //    72: invokestatic    android/view/ViewGroup.getChildMeasureSpec:(III)I
        //    75: istore          5
        //    77: aload_1        
        //    78: aload_0        
        //    79: getfield        android/support/v7/internal/widget/SpinnerCompat.mWidthMeasureSpec:I
        //    82: aload_0        
        //    83: getfield        android/support/v7/internal/widget/SpinnerCompat.mSpinnerPadding:Landroid/graphics/Rect;
        //    86: getfield        android/graphics/Rect.left:I
        //    89: aload_0        
        //    90: getfield        android/support/v7/internal/widget/SpinnerCompat.mSpinnerPadding:Landroid/graphics/Rect;
        //    93: getfield        android/graphics/Rect.right:I
        //    96: iadd           
        //    97: aload_3        
        //    98: getfield        android/view/ViewGroup$LayoutParams.width:I
        //   101: invokestatic    android/view/ViewGroup.getChildMeasureSpec:(III)I
        //   104: iload           5
        //   106: invokevirtual   android/view/View.measure:(II)V
        //   109: aload_0        
        //   110: getfield        android/support/v7/internal/widget/SpinnerCompat.mSpinnerPadding:Landroid/graphics/Rect;
        //   113: getfield        android/graphics/Rect.top:I
        //   116: aload_0        
        //   117: invokevirtual   android/support/v7/internal/widget/SpinnerCompat.getMeasuredHeight:()I
        //   120: aload_0        
        //   121: getfield        android/support/v7/internal/widget/SpinnerCompat.mSpinnerPadding:Landroid/graphics/Rect;
        //   124: getfield        android/graphics/Rect.bottom:I
        //   127: isub           
        //   128: aload_0        
        //   129: getfield        android/support/v7/internal/widget/SpinnerCompat.mSpinnerPadding:Landroid/graphics/Rect;
        //   132: getfield        android/graphics/Rect.top:I
        //   135: isub           
        //   136: aload_1        
        //   137: invokevirtual   android/view/View.getMeasuredHeight:()I
        //   140: isub           
        //   141: iconst_2       
        //   142: idiv           
        //   143: iadd           
        //   144: istore          6
        //   146: iload           6
        //   148: aload_1        
        //   149: invokevirtual   android/view/View.getMeasuredHeight:()I
        //   152: iadd           
        //   153: istore          7
        //   155: aload_1        
        //   156: iconst_0       
        //   157: iload           6
        //   159: iconst_0       
        //   160: aload_1        
        //   161: invokevirtual   android/view/View.getMeasuredWidth:()I
        //   164: iadd           
        //   165: iload           7
        //   167: invokevirtual   android/view/View.layout:(IIII)V
        //   170: return         
        //   171: astore          8
        //   173: aload           8
        //   175: athrow         
        //   176: astore          4
        //   178: aload           4
        //   180: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  18     26     171    176    Ljava/lang/IllegalArgumentException;
        //  26     49     176    181    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0026:
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
    
    public int getBaseline() {
        int n = -1;
        Label_0048: {
            if (this.getChildCount() <= 0) {
                break Label_0048;
            }
            View view = this.getChildAt(0);
            while (true) {
                if (view == null) {
                    return n;
                }
                final int baseline = view.getBaseline();
                if (baseline < 0) {
                    return n;
                }
                try {
                    n = view.getTop() + baseline;
                    return n;
                    try {
                        final SpinnerAdapter mAdapter = this.mAdapter;
                        view = null;
                        if (mAdapter == null) {
                            continue;
                        }
                        final int count = this.mAdapter.getCount();
                        view = null;
                        if (count > 0) {
                            view = this.makeView(0, false);
                            this.mRecycler.put(0, view);
                        }
                        continue;
                    }
                    catch (IllegalArgumentException ex) {
                        throw ex;
                    }
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
                break;
            }
        }
    }
    
    void layout(final int p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        android/support/v7/internal/widget/SpinnerCompat.mSpinnerPadding:Landroid/graphics/Rect;
        //     4: getfield        android/graphics/Rect.left:I
        //     7: istore_3       
        //     8: aload_0        
        //     9: invokevirtual   android/support/v7/internal/widget/SpinnerCompat.getRight:()I
        //    12: aload_0        
        //    13: invokevirtual   android/support/v7/internal/widget/SpinnerCompat.getLeft:()I
        //    16: isub           
        //    17: aload_0        
        //    18: getfield        android/support/v7/internal/widget/SpinnerCompat.mSpinnerPadding:Landroid/graphics/Rect;
        //    21: getfield        android/graphics/Rect.left:I
        //    24: isub           
        //    25: aload_0        
        //    26: getfield        android/support/v7/internal/widget/SpinnerCompat.mSpinnerPadding:Landroid/graphics/Rect;
        //    29: getfield        android/graphics/Rect.right:I
        //    32: isub           
        //    33: istore          4
        //    35: aload_0        
        //    36: getfield        android/support/v7/internal/widget/SpinnerCompat.mDataChanged:Z
        //    39: ifeq            46
        //    42: aload_0        
        //    43: invokevirtual   android/support/v7/internal/widget/SpinnerCompat.handleDataChanged:()V
        //    46: aload_0        
        //    47: getfield        android/support/v7/internal/widget/SpinnerCompat.mItemCount:I
        //    50: ifne            68
        //    53: aload_0        
        //    54: invokevirtual   android/support/v7/internal/widget/SpinnerCompat.resetList:()V
        //    57: return         
        //    58: astore          5
        //    60: aload           5
        //    62: athrow         
        //    63: astore          6
        //    65: aload           6
        //    67: athrow         
        //    68: aload_0        
        //    69: getfield        android/support/v7/internal/widget/SpinnerCompat.mNextSelectedPosition:I
        //    72: iflt            83
        //    75: aload_0        
        //    76: aload_0        
        //    77: getfield        android/support/v7/internal/widget/SpinnerCompat.mNextSelectedPosition:I
        //    80: invokevirtual   android/support/v7/internal/widget/SpinnerCompat.setSelectedPositionInt:(I)V
        //    83: aload_0        
        //    84: invokevirtual   android/support/v7/internal/widget/SpinnerCompat.recycleAllViews:()V
        //    87: aload_0        
        //    88: invokevirtual   android/support/v7/internal/widget/SpinnerCompat.removeAllViewsInLayout:()V
        //    91: aload_0        
        //    92: aload_0        
        //    93: getfield        android/support/v7/internal/widget/SpinnerCompat.mSelectedPosition:I
        //    96: putfield        android/support/v7/internal/widget/SpinnerCompat.mFirstPosition:I
        //    99: aload_0        
        //   100: getfield        android/support/v7/internal/widget/SpinnerCompat.mAdapter:Landroid/widget/SpinnerAdapter;
        //   103: ifnull          178
        //   106: aload_0        
        //   107: aload_0        
        //   108: getfield        android/support/v7/internal/widget/SpinnerCompat.mSelectedPosition:I
        //   111: iconst_1       
        //   112: invokespecial   android/support/v7/internal/widget/SpinnerCompat.makeView:(IZ)Landroid/view/View;
        //   115: astore          8
        //   117: aload           8
        //   119: invokevirtual   android/view/View.getMeasuredWidth:()I
        //   122: istore          9
        //   124: aload_0        
        //   125: invokestatic    android/support/v4/view/ViewCompat.getLayoutDirection:(Landroid/view/View;)I
        //   128: istore          10
        //   130: bipush          7
        //   132: aload_0        
        //   133: getfield        android/support/v7/internal/widget/SpinnerCompat.mGravity:I
        //   136: iload           10
        //   138: invokestatic    android/support/v4/view/GravityCompat.getAbsoluteGravity:(II)I
        //   141: iand           
        //   142: lookupswitch {
        //                1: 217
        //                5: 236
        //          default: 168
        //        }
        //   168: iload_3        
        //   169: istore          11
        //   171: aload           8
        //   173: iload           11
        //   175: invokevirtual   android/view/View.offsetLeftAndRight:(I)V
        //   178: aload_0        
        //   179: getfield        android/support/v7/internal/widget/SpinnerCompat.mRecycler:Landroid/support/v7/internal/widget/AbsSpinnerCompat$RecycleBin;
        //   182: invokevirtual   android/support/v7/internal/widget/AbsSpinnerCompat$RecycleBin.clear:()V
        //   185: aload_0        
        //   186: invokevirtual   android/support/v7/internal/widget/SpinnerCompat.invalidate:()V
        //   189: aload_0        
        //   190: invokevirtual   android/support/v7/internal/widget/SpinnerCompat.checkSelectionChanged:()V
        //   193: aload_0        
        //   194: iconst_0       
        //   195: putfield        android/support/v7/internal/widget/SpinnerCompat.mDataChanged:Z
        //   198: aload_0        
        //   199: iconst_0       
        //   200: putfield        android/support/v7/internal/widget/SpinnerCompat.mNeedSync:Z
        //   203: aload_0        
        //   204: aload_0        
        //   205: getfield        android/support/v7/internal/widget/SpinnerCompat.mSelectedPosition:I
        //   208: invokevirtual   android/support/v7/internal/widget/SpinnerCompat.setNextSelectedPositionInt:(I)V
        //   211: return         
        //   212: astore          7
        //   214: aload           7
        //   216: athrow         
        //   217: iload_3        
        //   218: iload           4
        //   220: iconst_2       
        //   221: idiv           
        //   222: iadd           
        //   223: iload           9
        //   225: iconst_2       
        //   226: idiv           
        //   227: isub           
        //   228: istore          11
        //   230: getstatic       android/support/v7/internal/widget/AdapterViewCompat.a:I
        //   233: ifeq            171
        //   236: iload_3        
        //   237: iload           4
        //   239: iadd           
        //   240: iload           9
        //   242: isub           
        //   243: istore          11
        //   245: goto            171
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  35     46     58     63     Ljava/lang/IllegalArgumentException;
        //  46     57     63     68     Ljava/lang/IllegalArgumentException;
        //  68     83     212    217    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0046:
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
    
    int measureContentWidth(final SpinnerAdapter spinnerAdapter, final Drawable drawable) {
        final int a = AdapterViewCompat.a;
        int n = 0;
        if (spinnerAdapter != null) {
            final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
            final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(0, 0);
            final int max = Math.max(0, this.getSelectedItemPosition());
            final int min = Math.min(spinnerAdapter.getCount(), max + 15);
            int max2 = Math.max(0, max - (15 - (min - max)));
            View view = null;
            int n2 = 0;
            int n3 = 0;
        Label_0107_Outer:
            while (true) {
                while (true) {
                    Label_0216: {
                        final int itemViewType;
                        final View view3;
                        int max3 = 0;
                        int n4 = 0;
                        Label_0234: {
                            Label_0179: {
                                if (max2 >= min) {
                                    n = n2;
                                    break Label_0179;
                                }
                                itemViewType = spinnerAdapter.getItemViewType(max2);
                                if (itemViewType == n3) {
                                    break Label_0216;
                                }
                                final View view2 = null;
                                view3 = spinnerAdapter.getView(max2, view2, (ViewGroup)this);
                                try {
                                    if (view3.getLayoutParams() == null) {
                                        view3.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
                                    }
                                    view3.measure(measureSpec, measureSpec2);
                                    max3 = Math.max(n2, view3.getMeasuredWidth());
                                    n4 = max2 + 1;
                                    if (a == 0) {
                                        break Label_0234;
                                    }
                                    n = max3;
                                    if (drawable != null) {
                                        drawable.getPadding(this.mTempRect);
                                        return n + (this.mTempRect.left + this.mTempRect.right);
                                    }
                                    break;
                                }
                                catch (IllegalArgumentException ex) {
                                    throw ex;
                                }
                            }
                            break Label_0216;
                        }
                        max2 = n4;
                        n2 = max3;
                        view = view3;
                        n3 = itemViewType;
                        continue Label_0107_Outer;
                    }
                    int itemViewType = n3;
                    final View view2 = view;
                    continue;
                }
            }
        }
        return n;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int selection) {
        this.setSelection(selection);
        dialogInterface.dismiss();
    }
    
    protected void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
            if (this.mPopup == null) {
                return;
            }
            final SpinnerCompat spinnerCompat = this;
            final SpinnerCompat$SpinnerPopup spinnerCompat$SpinnerPopup = spinnerCompat.mPopup;
            final boolean b = spinnerCompat$SpinnerPopup.isShowing();
            if (b) {
                final SpinnerCompat spinnerCompat2 = this;
                final SpinnerCompat$SpinnerPopup spinnerCompat$SpinnerPopup2 = spinnerCompat2.mPopup;
                spinnerCompat$SpinnerPopup2.dismiss();
            }
            return;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            final SpinnerCompat spinnerCompat = this;
            final SpinnerCompat$SpinnerPopup spinnerCompat$SpinnerPopup = spinnerCompat.mPopup;
            final boolean b = spinnerCompat$SpinnerPopup.isShowing();
            if (b) {
                final SpinnerCompat spinnerCompat2 = this;
                final SpinnerCompat$SpinnerPopup spinnerCompat$SpinnerPopup2 = spinnerCompat2.mPopup;
                spinnerCompat$SpinnerPopup2.dismiss();
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        this.mInLayout = true;
        this.layout(0, false);
        this.mInLayout = false;
    }
    
    @Override
    protected void onMeasure(final int n, final int n2) {
        try {
            super.onMeasure(n, n2);
            if (this.mPopup != null && View$MeasureSpec.getMode(n) == Integer.MIN_VALUE) {
                this.setMeasuredDimension(Math.min(Math.max(this.getMeasuredWidth(), this.measureContentWidth(this.getAdapter(), this.getBackground())), View$MeasureSpec.getSize(n)), this.getMeasuredHeight());
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    @Override
    public void onRestoreInstanceState(final Parcelable parcelable) {
        final SpinnerCompat$SavedState spinnerCompat$SavedState = (SpinnerCompat$SavedState)parcelable;
        super.onRestoreInstanceState(spinnerCompat$SavedState.getSuperState());
        if (spinnerCompat$SavedState.showDropdown) {
            final ViewTreeObserver viewTreeObserver = this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new SpinnerCompat$2(this));
            }
        }
    }
    
    @Override
    public Parcelable onSaveInstanceState() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Landroid/support/v7/internal/widget/SpinnerCompat$SavedState;
        //     3: dup            
        //     4: aload_0        
        //     5: invokespecial   android/support/v7/internal/widget/AbsSpinnerCompat.onSaveInstanceState:()Landroid/os/Parcelable;
        //     8: invokespecial   android/support/v7/internal/widget/SpinnerCompat$SavedState.<init>:(Landroid/os/Parcelable;)V
        //    11: astore_1       
        //    12: aload_0        
        //    13: getfield        android/support/v7/internal/widget/SpinnerCompat.mPopup:Landroid/support/v7/internal/widget/SpinnerCompat$SpinnerPopup;
        //    16: astore          4
        //    18: aload           4
        //    20: ifnull          56
        //    23: aload_0        
        //    24: getfield        android/support/v7/internal/widget/SpinnerCompat.mPopup:Landroid/support/v7/internal/widget/SpinnerCompat$SpinnerPopup;
        //    27: invokeinterface android/support/v7/internal/widget/SpinnerCompat$SpinnerPopup.isShowing:()Z
        //    32: istore          6
        //    34: iload           6
        //    36: ifeq            56
        //    39: iconst_1       
        //    40: istore          5
        //    42: aload_1        
        //    43: iload           5
        //    45: putfield        android/support/v7/internal/widget/SpinnerCompat$SavedState.showDropdown:Z
        //    48: aload_1        
        //    49: areturn        
        //    50: astore_2       
        //    51: aload_2        
        //    52: athrow         
        //    53: astore_3       
        //    54: aload_3        
        //    55: athrow         
        //    56: iconst_0       
        //    57: istore          5
        //    59: goto            42
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  12     18     50     53     Ljava/lang/IllegalArgumentException;
        //  23     34     53     56     Ljava/lang/IllegalArgumentException;
        //  51     53     53     56     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0042:
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
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        try {
            if (this.mForwardingListener == null) {
                return super.onTouchEvent(motionEvent);
            }
            final SpinnerCompat spinnerCompat = this;
            final ListPopupWindow$ForwardingListener listPopupWindow$ForwardingListener = spinnerCompat.mForwardingListener;
            final SpinnerCompat spinnerCompat2 = this;
            final MotionEvent motionEvent2 = motionEvent;
            final boolean b = listPopupWindow$ForwardingListener.onTouch((View)spinnerCompat2, motionEvent2);
            if (b) {
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            final SpinnerCompat spinnerCompat = this;
            final ListPopupWindow$ForwardingListener listPopupWindow$ForwardingListener = spinnerCompat.mForwardingListener;
            final SpinnerCompat spinnerCompat2 = this;
            final MotionEvent motionEvent2 = motionEvent;
            final boolean b = listPopupWindow$ForwardingListener.onTouch((View)spinnerCompat2, motionEvent2);
            if (b) {
                return true;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public boolean performClick() {
        boolean performClick = super.performClick();
        if (performClick) {
            return performClick;
        }
        performClick = true;
        try {
            if (!this.mPopup.isShowing()) {
                this.mPopup.show();
            }
            return performClick;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    @Override
    public void setAdapter(final SpinnerAdapter p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: invokespecial   android/support/v7/internal/widget/AbsSpinnerCompat.setAdapter:(Landroid/widget/SpinnerAdapter;)V
        //     5: aload_0        
        //     6: getfield        android/support/v7/internal/widget/SpinnerCompat.mRecycler:Landroid/support/v7/internal/widget/AbsSpinnerCompat$RecycleBin;
        //     9: invokevirtual   android/support/v7/internal/widget/AbsSpinnerCompat$RecycleBin.clear:()V
        //    12: aload_0        
        //    13: invokevirtual   android/support/v7/internal/widget/SpinnerCompat.getContext:()Landroid/content/Context;
        //    16: invokevirtual   android/content/Context.getApplicationInfo:()Landroid/content/pm/ApplicationInfo;
        //    19: getfield        android/content/pm/ApplicationInfo.targetSdkVersion:I
        //    22: bipush          21
        //    24: if_icmplt       59
        //    27: aload_1        
        //    28: ifnull          59
        //    31: aload_1        
        //    32: invokeinterface android/widget/SpinnerAdapter.getViewTypeCount:()I
        //    37: iconst_1       
        //    38: if_icmpeq       59
        //    41: new             Ljava/lang/IllegalArgumentException;
        //    44: dup            
        //    45: getstatic       android/support/v7/internal/widget/SpinnerCompat.z:[Ljava/lang/String;
        //    48: iconst_1       
        //    49: aaload         
        //    50: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    53: athrow         
        //    54: astore          5
        //    56: aload           5
        //    58: athrow         
        //    59: aload_0        
        //    60: getfield        android/support/v7/internal/widget/SpinnerCompat.mPopup:Landroid/support/v7/internal/widget/SpinnerCompat$SpinnerPopup;
        //    63: astore          4
        //    65: aload           4
        //    67: ifnull          93
        //    70: aload_0        
        //    71: getfield        android/support/v7/internal/widget/SpinnerCompat.mPopup:Landroid/support/v7/internal/widget/SpinnerCompat$SpinnerPopup;
        //    74: new             Landroid/support/v7/internal/widget/SpinnerCompat$DropDownAdapter;
        //    77: dup            
        //    78: aload_1        
        //    79: invokespecial   android/support/v7/internal/widget/SpinnerCompat$DropDownAdapter.<init>:(Landroid/widget/SpinnerAdapter;)V
        //    82: invokeinterface android/support/v7/internal/widget/SpinnerCompat$SpinnerPopup.setAdapter:(Landroid/widget/ListAdapter;)V
        //    87: getstatic       android/support/v7/internal/widget/AdapterViewCompat.a:I
        //    90: ifeq            112
        //    93: aload_0        
        //    94: new             Landroid/support/v7/internal/widget/SpinnerCompat$DropDownAdapter;
        //    97: dup            
        //    98: aload_1        
        //    99: invokespecial   android/support/v7/internal/widget/SpinnerCompat$DropDownAdapter.<init>:(Landroid/widget/SpinnerAdapter;)V
        //   102: putfield        android/support/v7/internal/widget/SpinnerCompat.mTempAdapter:Landroid/support/v7/internal/widget/SpinnerCompat$DropDownAdapter;
        //   105: return         
        //   106: astore_2       
        //   107: aload_2        
        //   108: athrow         
        //   109: astore_3       
        //   110: aload_3        
        //   111: athrow         
        //   112: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  31     54     54     59     Ljava/lang/IllegalArgumentException;
        //  59     65     106    109    Ljava/lang/IllegalArgumentException;
        //  70     93     109    112    Ljava/lang/IllegalArgumentException;
        //  93     105    109    112    Ljava/lang/IllegalArgumentException;
        //  107    109    109    112    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0093:
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
    
    public void setEnabled(final boolean b) {
        final int a = AdapterViewCompat.a;
        super.setEnabled(b);
        if (this.mDisableChildrenWhenDisabled) {
            final int childCount = this.getChildCount();
            int i = 0;
            while (i < childCount) {
                this.getChildAt(i).setEnabled(b);
                ++i;
                if (a != 0) {
                    break;
                }
            }
        }
    }
    
    public void setOnItemClickListener(final AdapterViewCompat$OnItemClickListener adapterViewCompat$OnItemClickListener) {
        throw new RuntimeException(SpinnerCompat.z[0]);
    }
    
    void setOnItemClickListenerInt(final AdapterViewCompat$OnItemClickListener onItemClickListener) {
        super.setOnItemClickListener(onItemClickListener);
    }
}
