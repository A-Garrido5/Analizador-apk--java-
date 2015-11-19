// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.view.accessibility.AccessibilityNodeInfo;
import android.os.Build$VERSION;
import android.view.accessibility.AccessibilityEvent;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.internal.widget.ViewUtils;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

public class LinearLayoutCompat extends ViewGroup
{
    public static boolean a;
    private static final String[] z;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;
    
    static {
        final String[] z2 = new String[3];
        String s = "o*X1qBn\u001b6~\u000eFR7}Oxw8aA\u007fOyoG~Syq@n^!8BoH*8ZbZ78CHZ*}BcU<YBc\\7}JIS0tJCU=}V*S8k\u000e}^0\u007fF~\u001bg8\u001e&\u001b.pGiSyoAd\u001c-8YeI26\u000e*~0lFoIyjKgT/}\u000e~S<8YoR>pZ&\u001b6j\u000enT7?Z*H<l\u000egy8kKfR7}ofR>vKnx1qBnr7|Kr\u0015";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0018';
                        break;
                    }
                    case 0: {
                        c2 = '.';
                        break;
                    }
                    case 1: {
                        c2 = '\n';
                        break;
                    }
                    case 2: {
                        c2 = ';';
                        break;
                    }
                    case 3: {
                        c2 = 'Y';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "CHZ*}BcU<YBc\\7}JIS0tJCU=}V*T?8bcU<y\\FZ w[~\u001b*}Z*O68Od\u001b0vJoCylFkOyq]*T,l\u000ee]yzA\u007fU=k\u0000";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "CHZ*}BcU<YBc\\7}JIS0tJCU=}V*T?8bcU<y\\FZ w[~\u001b)wGdO*8Ze\u001b88xc^.8ZbZ-8Je^*v\t~\u001b2vA}\u001b1wY*O68IoOyqZy\u001b;y]oW0vK$";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public LinearLayoutCompat(final Context context) {
        this(context, null);
    }
    
    public LinearLayoutCompat(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public LinearLayoutCompat(final Context p0, final AttributeSet p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: aload_2        
        //     3: iload_3        
        //     4: invokespecial   android/view/ViewGroup.<init>:(Landroid/content/Context;Landroid/util/AttributeSet;I)V
        //     7: aload_0        
        //     8: iconst_1       
        //     9: putfield        android/support/v7/widget/LinearLayoutCompat.mBaselineAligned:Z
        //    12: aload_0        
        //    13: iconst_m1      
        //    14: putfield        android/support/v7/widget/LinearLayoutCompat.mBaselineAlignedChildIndex:I
        //    17: aload_0        
        //    18: iconst_0       
        //    19: putfield        android/support/v7/widget/LinearLayoutCompat.mBaselineChildTop:I
        //    22: aload_0        
        //    23: ldc             8388659
        //    25: putfield        android/support/v7/widget/LinearLayoutCompat.mGravity:I
        //    28: aload_1        
        //    29: aload_2        
        //    30: getstatic       android/support/v7/appcompat/R$styleable.LinearLayoutCompat:[I
        //    33: iload_3        
        //    34: iconst_0       
        //    35: invokestatic    android/support/v7/internal/widget/TintTypedArray.obtainStyledAttributes:(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/internal/widget/TintTypedArray;
        //    38: astore          4
        //    40: aload           4
        //    42: getstatic       android/support/v7/appcompat/R$styleable.LinearLayoutCompat_android_orientation:I
        //    45: iconst_m1      
        //    46: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getInt:(II)I
        //    49: istore          5
        //    51: iload           5
        //    53: iflt            62
        //    56: aload_0        
        //    57: iload           5
        //    59: invokevirtual   android/support/v7/widget/LinearLayoutCompat.setOrientation:(I)V
        //    62: aload           4
        //    64: getstatic       android/support/v7/appcompat/R$styleable.LinearLayoutCompat_android_gravity:I
        //    67: iconst_m1      
        //    68: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getInt:(II)I
        //    71: istore          6
        //    73: iload           6
        //    75: iflt            84
        //    78: aload_0        
        //    79: iload           6
        //    81: invokevirtual   android/support/v7/widget/LinearLayoutCompat.setGravity:(I)V
        //    84: aload           4
        //    86: getstatic       android/support/v7/appcompat/R$styleable.LinearLayoutCompat_android_baselineAligned:I
        //    89: iconst_1       
        //    90: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getBoolean:(IZ)Z
        //    93: istore          7
        //    95: iload           7
        //    97: ifne            106
        //   100: aload_0        
        //   101: iload           7
        //   103: invokevirtual   android/support/v7/widget/LinearLayoutCompat.setBaselineAligned:(Z)V
        //   106: aload_0        
        //   107: aload           4
        //   109: getstatic       android/support/v7/appcompat/R$styleable.LinearLayoutCompat_android_weightSum:I
        //   112: ldc             -1.0
        //   114: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getFloat:(IF)F
        //   117: putfield        android/support/v7/widget/LinearLayoutCompat.mWeightSum:F
        //   120: aload_0        
        //   121: aload           4
        //   123: getstatic       android/support/v7/appcompat/R$styleable.LinearLayoutCompat_android_baselineAlignedChildIndex:I
        //   126: iconst_m1      
        //   127: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getInt:(II)I
        //   130: putfield        android/support/v7/widget/LinearLayoutCompat.mBaselineAlignedChildIndex:I
        //   133: aload_0        
        //   134: aload           4
        //   136: getstatic       android/support/v7/appcompat/R$styleable.LinearLayoutCompat_measureWithLargestChild:I
        //   139: iconst_0       
        //   140: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getBoolean:(IZ)Z
        //   143: putfield        android/support/v7/widget/LinearLayoutCompat.mUseLargestChild:Z
        //   146: aload_0        
        //   147: aload           4
        //   149: getstatic       android/support/v7/appcompat/R$styleable.LinearLayoutCompat_divider:I
        //   152: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   155: invokevirtual   android/support/v7/widget/LinearLayoutCompat.setDividerDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   158: aload_0        
        //   159: aload           4
        //   161: getstatic       android/support/v7/appcompat/R$styleable.LinearLayoutCompat_showDividers:I
        //   164: iconst_0       
        //   165: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getInt:(II)I
        //   168: putfield        android/support/v7/widget/LinearLayoutCompat.mShowDividers:I
        //   171: aload_0        
        //   172: aload           4
        //   174: getstatic       android/support/v7/appcompat/R$styleable.LinearLayoutCompat_dividerPadding:I
        //   177: iconst_0       
        //   178: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getDimensionPixelSize:(II)I
        //   181: putfield        android/support/v7/widget/LinearLayoutCompat.mDividerPadding:I
        //   184: aload           4
        //   186: invokevirtual   android/support/v7/internal/widget/TintTypedArray.recycle:()V
        //   189: return         
        //   190: astore          10
        //   192: aload           10
        //   194: athrow         
        //   195: astore          9
        //   197: aload           9
        //   199: athrow         
        //   200: astore          8
        //   202: aload           8
        //   204: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  56     62     190    195    Ljava/lang/RuntimeException;
        //  78     84     195    200    Ljava/lang/RuntimeException;
        //  100    106    200    205    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 101, Size: 101
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
    
    private void forceUniformHeight(final int n, final int n2) {
        final boolean a = LinearLayoutCompat.a;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 1073741824);
        int n3;
        for (int i = 0; i < n; i = n3) {
            final View virtualChild = this.getVirtualChildAt(i);
            if (virtualChild.getVisibility() != 8) {
                final LinearLayoutCompat$LayoutParams linearLayoutCompat$LayoutParams = (LinearLayoutCompat$LayoutParams)virtualChild.getLayoutParams();
                if (linearLayoutCompat$LayoutParams.height == -1) {
                    final int width = linearLayoutCompat$LayoutParams.width;
                    linearLayoutCompat$LayoutParams.width = virtualChild.getMeasuredWidth();
                    this.measureChildWithMargins(virtualChild, n2, 0, measureSpec, 0);
                    linearLayoutCompat$LayoutParams.width = width;
                }
            }
            n3 = i + 1;
            if (a) {
                break;
            }
        }
    }
    
    private void forceUniformWidth(final int n, final int n2) {
        final boolean a = LinearLayoutCompat.a;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824);
        int n3;
        for (int i = 0; i < n; i = n3) {
            final View virtualChild = this.getVirtualChildAt(i);
            if (virtualChild.getVisibility() != 8) {
                final LinearLayoutCompat$LayoutParams linearLayoutCompat$LayoutParams = (LinearLayoutCompat$LayoutParams)virtualChild.getLayoutParams();
                if (linearLayoutCompat$LayoutParams.width == -1) {
                    final int height = linearLayoutCompat$LayoutParams.height;
                    linearLayoutCompat$LayoutParams.height = virtualChild.getMeasuredHeight();
                    this.measureChildWithMargins(virtualChild, measureSpec, 0, n2, 0);
                    linearLayoutCompat$LayoutParams.height = height;
                }
            }
            n3 = i + 1;
            if (a) {
                break;
            }
        }
    }
    
    private void setChildFrame(final View view, final int n, final int n2, final int n3, final int n4) {
        view.layout(n, n2, n + n3, n2 + n4);
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof LinearLayoutCompat$LayoutParams;
    }
    
    void drawDividersHorizontal(final Canvas canvas) {
        final boolean a = LinearLayoutCompat.a;
        final int virtualChildCount = this.getVirtualChildCount();
        final boolean layoutRtl = ViewUtils.isLayoutRtl((View)this);
        int n = 0;
        while (true) {
            int n4 = 0;
            Label_0127: {
                if (n >= virtualChildCount) {
                    break Label_0127;
                }
                final View virtualChild = this.getVirtualChildAt(n);
                Label_0117: {
                    if (virtualChild == null) {
                        break Label_0117;
                    }
                    while (true) {
                        while (true) {
                            int n2 = 0;
                            Label_0261: {
                                while (true) {
                                    int n5 = 0;
                                    Label_0247: {
                                        try {
                                            if (virtualChild.getVisibility() != 8 && this.hasDividerBeforeChildAt(n)) {
                                                final LinearLayoutCompat$LayoutParams linearLayoutCompat$LayoutParams = (LinearLayoutCompat$LayoutParams)virtualChild.getLayoutParams();
                                                if (layoutRtl) {
                                                    n2 = virtualChild.getRight() + linearLayoutCompat$LayoutParams.rightMargin;
                                                    if (!a) {
                                                        break Label_0261;
                                                    }
                                                }
                                                final int n3 = virtualChild.getLeft() - linearLayoutCompat$LayoutParams.leftMargin - this.mDividerWidth;
                                                this.drawVerticalDivider(canvas, n3);
                                            }
                                            n4 = n + 1;
                                            if (a) {
                                                if (this.hasDividerBeforeChildAt(virtualChildCount)) {
                                                    final View virtualChild2 = this.getVirtualChildAt(virtualChildCount - 1);
                                                    if (virtualChild2 == null) {
                                                        if (layoutRtl) {
                                                            final int paddingLeft = this.getPaddingLeft();
                                                            if (!a) {
                                                                break Label_0234;
                                                            }
                                                        }
                                                        final int paddingLeft = this.getWidth() - this.getPaddingRight() - this.mDividerWidth;
                                                        if (!a) {
                                                            break Label_0234;
                                                        }
                                                    }
                                                    final LinearLayoutCompat$LayoutParams linearLayoutCompat$LayoutParams2 = (LinearLayoutCompat$LayoutParams)virtualChild2.getLayoutParams();
                                                    if (layoutRtl) {
                                                        n5 = virtualChild2.getLeft() - linearLayoutCompat$LayoutParams2.leftMargin - this.mDividerWidth;
                                                        if (!a) {
                                                            break Label_0247;
                                                        }
                                                    }
                                                    final int paddingLeft = virtualChild2.getRight() + linearLayoutCompat$LayoutParams2.rightMargin;
                                                    this.drawVerticalDivider(canvas, paddingLeft);
                                                }
                                                return;
                                            }
                                            break;
                                        }
                                        catch (RuntimeException ex) {
                                            throw ex;
                                        }
                                    }
                                    final int paddingLeft = n5;
                                    continue;
                                }
                            }
                            final int n3 = n2;
                            continue;
                        }
                    }
                }
            }
            n = n4;
        }
    }
    
    void drawDividersVertical(final Canvas canvas) {
        final boolean a = LinearLayoutCompat.a;
        final int virtualChildCount = this.getVirtualChildCount();
        int n = 0;
        while (true) {
            int n2 = 0;
            Label_0095: {
                if (n >= virtualChildCount) {
                    break Label_0095;
                }
                final View virtualChild = this.getVirtualChildAt(n);
                Label_0085: {
                    if (virtualChild == null) {
                        break Label_0085;
                    }
                    try {
                        if (virtualChild.getVisibility() != 8 && this.hasDividerBeforeChildAt(n)) {
                            this.drawHorizontalDivider(canvas, virtualChild.getTop() - ((LinearLayoutCompat$LayoutParams)virtualChild.getLayoutParams()).topMargin - this.mDividerHeight);
                        }
                        n2 = n + 1;
                        if (a) {
                            if (this.hasDividerBeforeChildAt(virtualChildCount)) {
                                final View virtualChild2 = this.getVirtualChildAt(virtualChildCount - 1);
                                int n3 = 0;
                                Label_0160: {
                                    if (virtualChild2 == null) {
                                        n3 = this.getHeight() - this.getPaddingBottom() - this.mDividerHeight;
                                        if (!a) {
                                            break Label_0160;
                                        }
                                    }
                                    n3 = virtualChild2.getBottom() + ((LinearLayoutCompat$LayoutParams)virtualChild2.getLayoutParams()).bottomMargin;
                                }
                                this.drawHorizontalDivider(canvas, n3);
                            }
                            return;
                        }
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                }
            }
            n = n2;
        }
    }
    
    void drawHorizontalDivider(final Canvas canvas, final int n) {
        this.mDivider.setBounds(this.getPaddingLeft() + this.mDividerPadding, n, this.getWidth() - this.getPaddingRight() - this.mDividerPadding, n + this.mDividerHeight);
        this.mDivider.draw(canvas);
    }
    
    void drawVerticalDivider(final Canvas canvas, final int n) {
        this.mDivider.setBounds(n, this.getPaddingTop() + this.mDividerPadding, n + this.mDividerWidth, this.getHeight() - this.getPaddingBottom() - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }
    
    protected LinearLayoutCompat$LayoutParams generateDefaultLayoutParams() {
        try {
            if (this.mOrientation == 0) {
                return new LinearLayoutCompat$LayoutParams(-2, -2);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        try {
            if (this.mOrientation == 1) {
                return new LinearLayoutCompat$LayoutParams(-1, -2);
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        return null;
    }
    
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)this.generateDefaultLayoutParams();
    }
    
    public LinearLayoutCompat$LayoutParams generateLayoutParams(final AttributeSet set) {
        return new LinearLayoutCompat$LayoutParams(this.getContext(), set);
    }
    
    protected LinearLayoutCompat$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return new LinearLayoutCompat$LayoutParams(viewGroup$LayoutParams);
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)this.generateLayoutParams(set);
    }
    
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)this.generateLayoutParams(viewGroup$LayoutParams);
    }
    
    public int getBaseline() {
        View child;
        int baseline2;
        while (true) {
            int baseline = -1;
            try {
                if (this.mBaselineAlignedChildIndex < 0) {
                    baseline = super.getBaseline();
                    return baseline;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (this.getChildCount() <= this.mBaselineAlignedChildIndex) {
                    throw new RuntimeException(LinearLayoutCompat.z[1]);
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
            child = this.getChildAt(this.mBaselineAlignedChildIndex);
            baseline2 = child.getBaseline();
            if (baseline2 == baseline) {
                try {
                    if (this.mBaselineAlignedChildIndex != 0) {
                        throw new RuntimeException(LinearLayoutCompat.z[2]);
                    }
                    return baseline;
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
                break;
            }
            break;
        }
        int mBaselineChildTop = this.mBaselineChildTop;
        if (this.mOrientation == 1) {
            final int n = 0x70 & this.mGravity;
            if (n != 48) {
                Label_0209: {
                    switch (n) {
                        case 80: {
                            mBaselineChildTop = this.getBottom() - this.getTop() - this.getPaddingBottom() - this.mTotalLength;
                            if (LinearLayoutCompat.a) {
                                break Label_0209;
                            }
                            break;
                        }
                        case 16: {
                            final int n2 = mBaselineChildTop + (this.getBottom() - this.getTop() - this.getPaddingTop() - this.getPaddingBottom() - this.mTotalLength) / 2;
                            return baseline2 + (n2 + ((LinearLayoutCompat$LayoutParams)child.getLayoutParams()).topMargin);
                        }
                    }
                }
            }
        }
        final int n2 = mBaselineChildTop;
        return baseline2 + (n2 + ((LinearLayoutCompat$LayoutParams)child.getLayoutParams()).topMargin);
    }
    
    int getChildrenSkipCount(final View view, final int n) {
        return 0;
    }
    
    public int getDividerWidth() {
        return this.mDividerWidth;
    }
    
    int getLocationOffset(final View view) {
        return 0;
    }
    
    int getNextLocationOffset(final View view) {
        return 0;
    }
    
    View getVirtualChildAt(final int n) {
        return this.getChildAt(n);
    }
    
    int getVirtualChildCount() {
        return this.getChildCount();
    }
    
    protected boolean hasDividerBeforeChildAt(final int n) {
        boolean b = false;
        final boolean a = LinearLayoutCompat.a;
        if (n != 0) {
            Label_0065: {
                try {
                    if (n != this.getChildCount()) {
                        break Label_0065;
                    }
                    final int n2 = 4;
                    final LinearLayoutCompat linearLayoutCompat = this;
                    final int n3 = linearLayoutCompat.mShowDividers;
                    final int n4 = n2 & n3;
                    if (n4 == 0) {
                        return false;
                    }
                    return true;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final int n2 = 4;
                    final LinearLayoutCompat linearLayoutCompat = this;
                    final int n3 = linearLayoutCompat.mShowDividers;
                    final int n4 = n2 & n3;
                    if (n4 == 0) {
                        return false;
                    }
                    return true;
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            if ((0x2 & this.mShowDividers) != 0x0) {
                int i = n - 1;
                while (i >= 0) {
                    if (this.getChildAt(i).getVisibility() != 8) {
                        if (!a) {
                            return true;
                        }
                        b = true;
                    }
                    --i;
                    if (a) {
                        return b;
                    }
                }
                return b;
            }
            return false;
        }
        try {
            if ((this.mShowDividers & 0x1) != 0x0) {
                return true;
            }
        }
        catch (RuntimeException ex3) {
            throw ex3;
        }
        return false;
    }
    
    void layoutHorizontal(final int p0, final int p1, final int p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          5
        //     5: aload_0        
        //     6: invokestatic    android/support/v7/internal/widget/ViewUtils.isLayoutRtl:(Landroid/view/View;)Z
        //     9: istore          6
        //    11: aload_0        
        //    12: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getPaddingTop:()I
        //    15: istore          7
        //    17: iload           4
        //    19: iload_2        
        //    20: isub           
        //    21: istore          8
        //    23: iload           8
        //    25: aload_0        
        //    26: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getPaddingBottom:()I
        //    29: isub           
        //    30: istore          9
        //    32: iload           8
        //    34: iload           7
        //    36: isub           
        //    37: aload_0        
        //    38: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getPaddingBottom:()I
        //    41: isub           
        //    42: istore          10
        //    44: aload_0        
        //    45: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getVirtualChildCount:()I
        //    48: istore          11
        //    50: ldc_w           8388615
        //    53: aload_0        
        //    54: getfield        android/support/v7/widget/LinearLayoutCompat.mGravity:I
        //    57: iand           
        //    58: istore          12
        //    60: bipush          112
        //    62: aload_0        
        //    63: getfield        android/support/v7/widget/LinearLayoutCompat.mGravity:I
        //    66: iand           
        //    67: istore          13
        //    69: aload_0        
        //    70: getfield        android/support/v7/widget/LinearLayoutCompat.mBaselineAligned:Z
        //    73: istore          14
        //    75: aload_0        
        //    76: getfield        android/support/v7/widget/LinearLayoutCompat.mMaxAscent:[I
        //    79: astore          15
        //    81: aload_0        
        //    82: getfield        android/support/v7/widget/LinearLayoutCompat.mMaxDescent:[I
        //    85: astore          16
        //    87: iload           12
        //    89: aload_0        
        //    90: invokestatic    android/support/v4/view/ViewCompat.getLayoutDirection:(Landroid/view/View;)I
        //    93: invokestatic    android/support/v4/view/GravityCompat.getAbsoluteGravity:(II)I
        //    96: lookupswitch {
        //                1: 434
        //                5: 414
        //          default: 124
        //        }
        //   124: aload_0        
        //   125: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getPaddingLeft:()I
        //   128: istore          17
        //   130: iload           6
        //   132: ifeq            600
        //   135: iload           11
        //   137: iconst_1       
        //   138: isub           
        //   139: istore          37
        //   141: iconst_m1      
        //   142: istore          18
        //   144: iload           37
        //   146: istore          19
        //   148: iconst_0       
        //   149: istore          20
        //   151: iload           20
        //   153: iload           11
        //   155: if_icmpge       413
        //   158: iload           19
        //   160: iload           18
        //   162: iload           20
        //   164: imul           
        //   165: iadd           
        //   166: istore          21
        //   168: aload_0        
        //   169: iload           21
        //   171: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getVirtualChildAt:(I)Landroid/view/View;
        //   174: astore          22
        //   176: aload           22
        //   178: ifnonnull       197
        //   181: iload           17
        //   183: aload_0        
        //   184: iload           21
        //   186: invokevirtual   android/support/v7/widget/LinearLayoutCompat.measureNullChild:(I)I
        //   189: iadd           
        //   190: istore          17
        //   192: iload           5
        //   194: ifeq            593
        //   197: aload           22
        //   199: invokevirtual   android/view/View.getVisibility:()I
        //   202: istore          24
        //   204: iload           24
        //   206: bipush          8
        //   208: if_icmpeq       593
        //   211: aload           22
        //   213: invokevirtual   android/view/View.getMeasuredWidth:()I
        //   216: istore          26
        //   218: aload           22
        //   220: invokevirtual   android/view/View.getMeasuredHeight:()I
        //   223: istore          27
        //   225: aload           22
        //   227: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   230: checkcast       Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;
        //   233: astore          28
        //   235: iload           14
        //   237: ifeq            587
        //   240: aload           28
        //   242: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.height:I
        //   245: istore          36
        //   247: iload           36
        //   249: iconst_m1      
        //   250: if_icmpeq       587
        //   253: aload           22
        //   255: invokevirtual   android/view/View.getBaseline:()I
        //   258: istore          29
        //   260: aload           28
        //   262: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.gravity:I
        //   265: istore          30
        //   267: iload           30
        //   269: ifge            276
        //   272: iload           13
        //   274: istore          30
        //   276: iload           30
        //   278: bipush          112
        //   280: iand           
        //   281: lookupswitch {
        //               16: 502
        //               48: 469
        //               80: 531
        //          default: 316
        //        }
        //   316: iload           7
        //   318: istore          31
        //   320: aload_0        
        //   321: iload           21
        //   323: invokevirtual   android/support/v7/widget/LinearLayoutCompat.hasDividerBeforeChildAt:(I)Z
        //   326: ifeq            580
        //   329: iload           17
        //   331: aload_0        
        //   332: getfield        android/support/v7/widget/LinearLayoutCompat.mDividerWidth:I
        //   335: iadd           
        //   336: istore          33
        //   338: iload           33
        //   340: aload           28
        //   342: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.leftMargin:I
        //   345: iadd           
        //   346: istore          34
        //   348: aload_0        
        //   349: aload           22
        //   351: iload           34
        //   353: aload_0        
        //   354: aload           22
        //   356: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getLocationOffset:(Landroid/view/View;)I
        //   359: iadd           
        //   360: iload           31
        //   362: iload           26
        //   364: iload           27
        //   366: invokespecial   android/support/v7/widget/LinearLayoutCompat.setChildFrame:(Landroid/view/View;IIII)V
        //   369: iload           34
        //   371: iload           26
        //   373: aload           28
        //   375: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.rightMargin:I
        //   378: iadd           
        //   379: aload_0        
        //   380: aload           22
        //   382: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getNextLocationOffset:(Landroid/view/View;)I
        //   385: iadd           
        //   386: iadd           
        //   387: istore          17
        //   389: iload           20
        //   391: aload_0        
        //   392: aload           22
        //   394: iload           21
        //   396: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getChildrenSkipCount:(Landroid/view/View;I)I
        //   399: iadd           
        //   400: istore          25
        //   402: iload           25
        //   404: iconst_1       
        //   405: iadd           
        //   406: istore          20
        //   408: iload           5
        //   410: ifeq            151
        //   413: return         
        //   414: iload_3        
        //   415: aload_0        
        //   416: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getPaddingLeft:()I
        //   419: iadd           
        //   420: iload_1        
        //   421: isub           
        //   422: aload_0        
        //   423: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   426: isub           
        //   427: istore          17
        //   429: iload           5
        //   431: ifeq            130
        //   434: aload_0        
        //   435: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getPaddingLeft:()I
        //   438: iload_3        
        //   439: iload_1        
        //   440: isub           
        //   441: aload_0        
        //   442: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   445: isub           
        //   446: iconst_2       
        //   447: idiv           
        //   448: iadd           
        //   449: istore          17
        //   451: iload           5
        //   453: ifeq            130
        //   456: goto            124
        //   459: astore          23
        //   461: aload           23
        //   463: athrow         
        //   464: astore          35
        //   466: aload           35
        //   468: athrow         
        //   469: iload           7
        //   471: aload           28
        //   473: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.topMargin:I
        //   476: iadd           
        //   477: istore          31
        //   479: iload           29
        //   481: iconst_m1      
        //   482: if_icmpeq       320
        //   485: iload           31
        //   487: aload           15
        //   489: iconst_1       
        //   490: iaload         
        //   491: iload           29
        //   493: isub           
        //   494: iadd           
        //   495: istore          31
        //   497: iload           5
        //   499: ifeq            320
        //   502: iload           7
        //   504: iload           10
        //   506: iload           27
        //   508: isub           
        //   509: iconst_2       
        //   510: idiv           
        //   511: iadd           
        //   512: aload           28
        //   514: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.topMargin:I
        //   517: iadd           
        //   518: aload           28
        //   520: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.bottomMargin:I
        //   523: isub           
        //   524: istore          31
        //   526: iload           5
        //   528: ifeq            320
        //   531: iload           9
        //   533: iload           27
        //   535: isub           
        //   536: aload           28
        //   538: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.bottomMargin:I
        //   541: isub           
        //   542: istore          31
        //   544: iload           29
        //   546: iconst_m1      
        //   547: if_icmpeq       320
        //   550: aload           22
        //   552: invokevirtual   android/view/View.getMeasuredHeight:()I
        //   555: iload           29
        //   557: isub           
        //   558: istore          32
        //   560: iload           31
        //   562: aload           16
        //   564: iconst_2       
        //   565: iaload         
        //   566: iload           32
        //   568: isub           
        //   569: isub           
        //   570: istore          31
        //   572: iload           5
        //   574: ifeq            320
        //   577: goto            316
        //   580: iload           17
        //   582: istore          33
        //   584: goto            338
        //   587: iconst_m1      
        //   588: istore          29
        //   590: goto            260
        //   593: iload           20
        //   595: istore          25
        //   597: goto            402
        //   600: iconst_1       
        //   601: istore          18
        //   603: iconst_0       
        //   604: istore          19
        //   606: goto            148
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  197    204    459    464    Ljava/lang/RuntimeException;
        //  240    247    464    469    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0260:
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
    
    void layoutVertical(final int n, final int n2, final int n3, final int n4) {
        final boolean a = LinearLayoutCompat.a;
        final int paddingLeft = this.getPaddingLeft();
        final int n5 = n3 - n;
        final int n6 = n5 - this.getPaddingRight();
        final int n7 = n5 - paddingLeft - this.getPaddingRight();
        final int virtualChildCount = this.getVirtualChildCount();
        final int n8 = 0x70 & this.mGravity;
        final int n9 = 0x800007 & this.mGravity;
        while (true) {
            int n11 = 0;
        Label_0141_Outer:
            while (true) {
                int n13 = 0;
                while (true) {
                    Label_0105: {
                        Label_0336: {
                            switch (n8) {
                                case 80: {
                                    break Label_0336;
                                }
                                case 16: {
                                Label_0357:
                                    while (true) {
                                        break Label_0357;
                                    Label_0242_Outer:
                                        while (true) {
                                            while (true) {
                                            Label_0242:
                                                while (true) {
                                                    while (true) {
                                                        int measuredWidth = 0;
                                                        LinearLayoutCompat$LayoutParams linearLayoutCompat$LayoutParams = null;
                                                        Label_0417: {
                                                            Label_0388: {
                                                                try {
                                                                    final View virtualChild;
                                                                    if (virtualChild.getVisibility() == 8) {
                                                                        break Label_0141_Outer;
                                                                    }
                                                                    measuredWidth = virtualChild.getMeasuredWidth();
                                                                    final int measuredHeight = virtualChild.getMeasuredHeight();
                                                                    linearLayoutCompat$LayoutParams = (LinearLayoutCompat$LayoutParams)virtualChild.getLayoutParams();
                                                                    int gravity = linearLayoutCompat$LayoutParams.gravity;
                                                                    if (gravity < 0) {
                                                                        gravity = n9;
                                                                    }
                                                                    switch (0x7 & GravityCompat.getAbsoluteGravity(gravity, ViewCompat.getLayoutDirection((View)this))) {
                                                                        default: {
                                                                            final int n10 = paddingLeft + linearLayoutCompat$LayoutParams.leftMargin;
                                                                            if (!this.hasDividerBeforeChildAt(n11)) {
                                                                                break Label_0242;
                                                                            }
                                                                            final int n12 = n13 + this.mDividerHeight;
                                                                            final int n14 = n12 + linearLayoutCompat$LayoutParams.topMargin;
                                                                            this.setChildFrame(virtualChild, n10, n14 + this.getLocationOffset(virtualChild), measuredWidth, measuredHeight);
                                                                            n13 = n14 + (measuredHeight + linearLayoutCompat$LayoutParams.bottomMargin + this.getNextLocationOffset(virtualChild));
                                                                            final int n15 = n11 + this.getChildrenSkipCount(virtualChild, n11);
                                                                            n11 = n15 + 1;
                                                                            if (a) {
                                                                                return;
                                                                            }
                                                                            break Label_0105;
                                                                        }
                                                                        case 1: {
                                                                            break Label_0388;
                                                                        }
                                                                        case 5: {
                                                                            break Label_0417;
                                                                        }
                                                                    }
                                                                    // iftrue(Label_0098:, !a)
                                                                    while (true) {
                                                                        break Label_0336;
                                                                        final int paddingTop = this.getPaddingTop() + (n4 - n2 - this.mTotalLength) / 2;
                                                                        continue;
                                                                    }
                                                                    final int paddingTop = n4 + this.getPaddingTop() - n2 - this.mTotalLength;
                                                                    // iftrue(Label_0098:, !a)
                                                                    continue Label_0357;
                                                                }
                                                                catch (RuntimeException ex) {
                                                                    throw ex;
                                                                }
                                                            }
                                                            final int n10 = paddingLeft + (n7 - measuredWidth) / 2 + linearLayoutCompat$LayoutParams.leftMargin - linearLayoutCompat$LayoutParams.rightMargin;
                                                            if (!a) {
                                                                continue Label_0242;
                                                            }
                                                        }
                                                        final int n10 = n6 - measuredWidth - linearLayoutCompat$LayoutParams.rightMargin;
                                                        if (a) {
                                                            continue Label_0242_Outer;
                                                        }
                                                        break;
                                                    }
                                                    continue Label_0242;
                                                }
                                                final int n12 = n13;
                                                continue;
                                            }
                                        }
                                        break;
                                    }
                                    break;
                                }
                            }
                        }
                        final int paddingTop = this.getPaddingTop();
                        Label_0098: {
                            n11 = 0;
                        }
                        n13 = paddingTop;
                    }
                    if (n11 >= virtualChildCount) {
                        return;
                    }
                    final View virtualChild = this.getVirtualChildAt(n11);
                    if (virtualChild != null) {
                        continue;
                    }
                    break;
                }
                n13 += this.measureNullChild(n11);
                if (a) {
                    continue Label_0141_Outer;
                }
                break;
            }
            final int n15 = n11;
            continue;
        }
    }
    
    void measureChildBeforeLayout(final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
        this.measureChildWithMargins(view, n2, n3, n4, n5);
    }
    
    void measureHorizontal(final int p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_0        
        //     5: iconst_0       
        //     6: putfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //     9: iconst_0       
        //    10: istore          4
        //    12: iconst_0       
        //    13: istore          5
        //    15: iconst_0       
        //    16: istore          6
        //    18: iconst_0       
        //    19: istore          7
        //    21: iconst_1       
        //    22: istore          8
        //    24: fconst_0       
        //    25: fstore          9
        //    27: aload_0        
        //    28: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getVirtualChildCount:()I
        //    31: istore          10
        //    33: iload_1        
        //    34: invokestatic    android/view/View$MeasureSpec.getMode:(I)I
        //    37: istore          11
        //    39: iload_2        
        //    40: invokestatic    android/view/View$MeasureSpec.getMode:(I)I
        //    43: istore          12
        //    45: iconst_0       
        //    46: istore          13
        //    48: iconst_0       
        //    49: istore          14
        //    51: aload_0        
        //    52: getfield        android/support/v7/widget/LinearLayoutCompat.mMaxAscent:[I
        //    55: astore          17
        //    57: aload           17
        //    59: ifnull          69
        //    62: aload_0        
        //    63: getfield        android/support/v7/widget/LinearLayoutCompat.mMaxDescent:[I
        //    66: ifnonnull       83
        //    69: aload_0        
        //    70: iconst_4       
        //    71: newarray        I
        //    73: putfield        android/support/v7/widget/LinearLayoutCompat.mMaxAscent:[I
        //    76: aload_0        
        //    77: iconst_4       
        //    78: newarray        I
        //    80: putfield        android/support/v7/widget/LinearLayoutCompat.mMaxDescent:[I
        //    83: aload_0        
        //    84: getfield        android/support/v7/widget/LinearLayoutCompat.mMaxAscent:[I
        //    87: astore          18
        //    89: aload_0        
        //    90: getfield        android/support/v7/widget/LinearLayoutCompat.mMaxDescent:[I
        //    93: astore          19
        //    95: aload           18
        //    97: iconst_3       
        //    98: iconst_m1      
        //    99: iastore        
        //   100: aload           18
        //   102: iconst_2       
        //   103: iconst_m1      
        //   104: iastore        
        //   105: aload           18
        //   107: iconst_1       
        //   108: iconst_m1      
        //   109: iastore        
        //   110: aload           18
        //   112: iconst_0       
        //   113: iconst_m1      
        //   114: iastore        
        //   115: aload           19
        //   117: iconst_3       
        //   118: iconst_m1      
        //   119: iastore        
        //   120: aload           19
        //   122: iconst_2       
        //   123: iconst_m1      
        //   124: iastore        
        //   125: aload           19
        //   127: iconst_1       
        //   128: iconst_m1      
        //   129: iastore        
        //   130: aload           19
        //   132: iconst_0       
        //   133: iconst_m1      
        //   134: iastore        
        //   135: aload_0        
        //   136: getfield        android/support/v7/widget/LinearLayoutCompat.mBaselineAligned:Z
        //   139: istore          20
        //   141: aload_0        
        //   142: getfield        android/support/v7/widget/LinearLayoutCompat.mUseLargestChild:Z
        //   145: istore          21
        //   147: iload           11
        //   149: ldc             1073741824
        //   151: if_icmpne       2241
        //   154: iconst_1       
        //   155: istore          22
        //   157: ldc_w           -2147483648
        //   160: istore          23
        //   162: iconst_0       
        //   163: istore          24
        //   165: iload           24
        //   167: iload           10
        //   169: if_icmpge       2766
        //   172: aload_0        
        //   173: iload           24
        //   175: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getVirtualChildAt:(I)Landroid/view/View;
        //   178: astore          125
        //   180: aload           125
        //   182: ifnonnull       204
        //   185: aload_0        
        //   186: aload_0        
        //   187: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   190: aload_0        
        //   191: iload           24
        //   193: invokevirtual   android/support/v7/widget/LinearLayoutCompat.measureNullChild:(I)I
        //   196: iadd           
        //   197: putfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   200: iload_3        
        //   201: ifeq            2735
        //   204: aload           125
        //   206: invokevirtual   android/view/View.getVisibility:()I
        //   209: istore          127
        //   211: iload           127
        //   213: bipush          8
        //   215: if_icmpne       235
        //   218: iload           24
        //   220: aload_0        
        //   221: aload           125
        //   223: iload           24
        //   225: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getChildrenSkipCount:(Landroid/view/View;I)I
        //   228: iadd           
        //   229: istore          24
        //   231: iload_3        
        //   232: ifeq            2735
        //   235: iload           24
        //   237: istore          128
        //   239: aload_0        
        //   240: iload           128
        //   242: invokevirtual   android/support/v7/widget/LinearLayoutCompat.hasDividerBeforeChildAt:(I)Z
        //   245: ifeq            261
        //   248: aload_0        
        //   249: aload_0        
        //   250: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   253: aload_0        
        //   254: getfield        android/support/v7/widget/LinearLayoutCompat.mDividerWidth:I
        //   257: iadd           
        //   258: putfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   261: aload           125
        //   263: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   266: checkcast       Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;
        //   269: astore          130
        //   271: fload           9
        //   273: aload           130
        //   275: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.weight:F
        //   278: fadd           
        //   279: fstore          131
        //   281: iload           11
        //   283: ldc             1073741824
        //   285: if_icmpne       2728
        //   288: aload           130
        //   290: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.width:I
        //   293: istore          176
        //   295: iload           176
        //   297: ifne            2728
        //   300: aload           130
        //   302: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.weight:F
        //   305: fstore          177
        //   307: fload           177
        //   309: fconst_0       
        //   310: fcmpl          
        //   311: ifle            2728
        //   314: iload           22
        //   316: ifeq            343
        //   319: aload_0        
        //   320: aload_0        
        //   321: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   324: aload           130
        //   326: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.leftMargin:I
        //   329: aload           130
        //   331: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.rightMargin:I
        //   334: iadd           
        //   335: iadd           
        //   336: putfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   339: iload_3        
        //   340: ifeq            372
        //   343: aload_0        
        //   344: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   347: istore          178
        //   349: aload_0        
        //   350: iload           178
        //   352: iload           178
        //   354: aload           130
        //   356: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.leftMargin:I
        //   359: iadd           
        //   360: aload           130
        //   362: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.rightMargin:I
        //   365: iadd           
        //   366: invokestatic    java/lang/Math.max:(II)I
        //   369: putfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   372: iload           20
        //   374: ifeq            397
        //   377: iconst_0       
        //   378: iconst_0       
        //   379: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   382: istore          179
        //   384: aload           125
        //   386: iload           179
        //   388: iload           179
        //   390: invokevirtual   android/view/View.measure:(II)V
        //   393: iload_3        
        //   394: ifeq            2717
        //   397: iload_3        
        //   398: ifeq            2707
        //   401: iconst_1       
        //   402: istore          132
        //   404: ldc_w           -2147483648
        //   407: istore          133
        //   409: aload           130
        //   411: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.width:I
        //   414: ifne            441
        //   417: aload           130
        //   419: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.weight:F
        //   422: fstore          172
        //   424: fload           172
        //   426: fconst_0       
        //   427: fcmpl          
        //   428: ifle            441
        //   431: iconst_0       
        //   432: istore          133
        //   434: aload           130
        //   436: bipush          -2
        //   438: putfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.width:I
        //   441: iload           133
        //   443: istore          135
        //   445: fload           131
        //   447: fconst_0       
        //   448: fcmpl          
        //   449: ifne            2282
        //   452: aload_0        
        //   453: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   456: istore          136
        //   458: aload_0        
        //   459: aload           125
        //   461: iload           128
        //   463: iload_1        
        //   464: iload           136
        //   466: iload_2        
        //   467: iconst_0       
        //   468: invokevirtual   android/support/v7/widget/LinearLayoutCompat.measureChildBeforeLayout:(Landroid/view/View;IIIII)V
        //   471: iload           135
        //   473: ldc_w           -2147483648
        //   476: if_icmpeq       486
        //   479: aload           130
        //   481: iload           135
        //   483: putfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.width:I
        //   486: aload           125
        //   488: invokevirtual   android/view/View.getMeasuredWidth:()I
        //   491: istore          138
        //   493: iload           22
        //   495: ifeq            532
        //   498: aload_0        
        //   499: aload_0        
        //   500: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   503: iload           138
        //   505: aload           130
        //   507: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.leftMargin:I
        //   510: iadd           
        //   511: aload           130
        //   513: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.rightMargin:I
        //   516: iadd           
        //   517: aload_0        
        //   518: aload           125
        //   520: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getNextLocationOffset:(Landroid/view/View;)I
        //   523: iadd           
        //   524: iadd           
        //   525: putfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   528: iload_3        
        //   529: ifeq            571
        //   532: aload_0        
        //   533: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   536: istore          139
        //   538: aload_0        
        //   539: iload           139
        //   541: iload           139
        //   543: iload           138
        //   545: iadd           
        //   546: aload           130
        //   548: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.leftMargin:I
        //   551: iadd           
        //   552: aload           130
        //   554: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.rightMargin:I
        //   557: iadd           
        //   558: aload_0        
        //   559: aload           125
        //   561: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getNextLocationOffset:(Landroid/view/View;)I
        //   564: iadd           
        //   565: invokestatic    java/lang/Math.max:(II)I
        //   568: putfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   571: iload           21
        //   573: ifeq            2700
        //   576: iload           138
        //   578: iload           23
        //   580: invokestatic    java/lang/Math.max:(II)I
        //   583: istore          140
        //   585: iload           12
        //   587: ldc             1073741824
        //   589: if_icmpeq       2690
        //   592: aload           130
        //   594: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.height:I
        //   597: istore          169
        //   599: iload           169
        //   601: iconst_m1      
        //   602: if_icmpne       2690
        //   605: iconst_1       
        //   606: istore          141
        //   608: iconst_1       
        //   609: istore          142
        //   611: aload           130
        //   613: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.topMargin:I
        //   616: aload           130
        //   618: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.bottomMargin:I
        //   621: iadd           
        //   622: istore          143
        //   624: iload           143
        //   626: aload           125
        //   628: invokevirtual   android/view/View.getMeasuredHeight:()I
        //   631: iadd           
        //   632: istore          144
        //   634: aload           125
        //   636: invokestatic    android/support/v4/view/ViewCompat.getMeasuredState:(Landroid/view/View;)I
        //   639: istore          145
        //   641: iload           5
        //   643: iload           145
        //   645: invokestatic    android/support/v7/internal/widget/ViewUtils.combineMeasuredStates:(II)I
        //   648: istore          146
        //   650: iload           20
        //   652: ifeq            729
        //   655: aload           125
        //   657: invokevirtual   android/view/View.getBaseline:()I
        //   660: istore          164
        //   662: iload           164
        //   664: iconst_m1      
        //   665: if_icmpeq       729
        //   668: aload           130
        //   670: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.gravity:I
        //   673: ifge            2308
        //   676: aload_0        
        //   677: getfield        android/support/v7/widget/LinearLayoutCompat.mGravity:I
        //   680: istore          166
        //   682: bipush          -2
        //   684: iload           166
        //   686: bipush          112
        //   688: iand           
        //   689: iconst_4       
        //   690: ishr           
        //   691: iand           
        //   692: iconst_1       
        //   693: ishr           
        //   694: istore          167
        //   696: aload           18
        //   698: iload           167
        //   700: aload           18
        //   702: iload           167
        //   704: iaload         
        //   705: iload           164
        //   707: invokestatic    java/lang/Math.max:(II)I
        //   710: iastore        
        //   711: aload           19
        //   713: iload           167
        //   715: aload           19
        //   717: iload           167
        //   719: iaload         
        //   720: iload           144
        //   722: iload           164
        //   724: isub           
        //   725: invokestatic    java/lang/Math.max:(II)I
        //   728: iastore        
        //   729: iload           4
        //   731: iload           144
        //   733: invokestatic    java/lang/Math.max:(II)I
        //   736: istore          147
        //   738: iload           8
        //   740: ifeq            2323
        //   743: aload           130
        //   745: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.height:I
        //   748: istore          163
        //   750: iload           163
        //   752: iconst_m1      
        //   753: if_icmpne       2323
        //   756: iconst_1       
        //   757: istore          148
        //   759: aload           130
        //   761: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.weight:F
        //   764: fstore          151
        //   766: fload           151
        //   768: fconst_0       
        //   769: fcmpl          
        //   770: ifle            2683
        //   773: iload           142
        //   775: ifeq            2339
        //   778: iload           143
        //   780: istore          161
        //   782: iload           7
        //   784: iload           161
        //   786: invokestatic    java/lang/Math.max:(II)I
        //   789: istore          152
        //   791: iload_3        
        //   792: ifeq            2672
        //   795: iload           142
        //   797: ifeq            2346
        //   800: iload           6
        //   802: iload           143
        //   804: invokestatic    java/lang/Math.max:(II)I
        //   807: istore          153
        //   809: iload           152
        //   811: istore          154
        //   813: iload           153
        //   815: istore          155
        //   817: iload           154
        //   819: istore          156
        //   821: iload           128
        //   823: aload_0        
        //   824: aload           125
        //   826: iload           128
        //   828: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getChildrenSkipCount:(Landroid/view/View;I)I
        //   831: iadd           
        //   832: istore          157
        //   834: iload           140
        //   836: istore          23
        //   838: iload           141
        //   840: istore          13
        //   842: fload           131
        //   844: fstore          26
        //   846: iload           148
        //   848: istore          158
        //   850: iload           156
        //   852: istore          159
        //   854: iload           155
        //   856: istore          30
        //   858: iload           132
        //   860: istore          14
        //   862: iload           146
        //   864: istore          27
        //   866: iload           147
        //   868: istore          28
        //   870: iload           157
        //   872: iconst_1       
        //   873: iadd           
        //   874: istore          160
        //   876: iload_3        
        //   877: ifeq            2641
        //   880: iload           23
        //   882: istore          32
        //   884: iload           14
        //   886: istore          25
        //   888: iload           13
        //   890: istore          31
        //   892: iload           159
        //   894: istore          7
        //   896: iload           158
        //   898: istore          29
        //   900: aload_0        
        //   901: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   904: istore          35
        //   906: iload           35
        //   908: ifle            933
        //   911: aload_0        
        //   912: iload           10
        //   914: invokevirtual   android/support/v7/widget/LinearLayoutCompat.hasDividerBeforeChildAt:(I)Z
        //   917: ifeq            933
        //   920: aload_0        
        //   921: aload_0        
        //   922: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   925: aload_0        
        //   926: getfield        android/support/v7/widget/LinearLayoutCompat.mDividerWidth:I
        //   929: iadd           
        //   930: putfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   933: aload           18
        //   935: iconst_1       
        //   936: iaload         
        //   937: istore          39
        //   939: iload           39
        //   941: iconst_m1      
        //   942: if_icmpne       977
        //   945: aload           18
        //   947: iconst_0       
        //   948: iaload         
        //   949: istore          123
        //   951: iload           123
        //   953: iconst_m1      
        //   954: if_icmpne       977
        //   957: aload           18
        //   959: iconst_2       
        //   960: iaload         
        //   961: iconst_m1      
        //   962: if_icmpne       977
        //   965: aload           18
        //   967: iconst_3       
        //   968: iaload         
        //   969: istore          124
        //   971: iload           124
        //   973: iconst_m1      
        //   974: if_icmpeq       1035
        //   977: iload           28
        //   979: aload           18
        //   981: iconst_3       
        //   982: iaload         
        //   983: aload           18
        //   985: iconst_0       
        //   986: iaload         
        //   987: aload           18
        //   989: iconst_1       
        //   990: iaload         
        //   991: aload           18
        //   993: iconst_2       
        //   994: iaload         
        //   995: invokestatic    java/lang/Math.max:(II)I
        //   998: invokestatic    java/lang/Math.max:(II)I
        //  1001: invokestatic    java/lang/Math.max:(II)I
        //  1004: aload           19
        //  1006: iconst_3       
        //  1007: iaload         
        //  1008: aload           19
        //  1010: iconst_0       
        //  1011: iaload         
        //  1012: aload           19
        //  1014: iconst_1       
        //  1015: iaload         
        //  1016: aload           19
        //  1018: iconst_2       
        //  1019: iaload         
        //  1020: invokestatic    java/lang/Math.max:(II)I
        //  1023: invokestatic    java/lang/Math.max:(II)I
        //  1026: invokestatic    java/lang/Math.max:(II)I
        //  1029: iadd           
        //  1030: invokestatic    java/lang/Math.max:(II)I
        //  1033: istore          28
        //  1035: iload           21
        //  1037: ifeq            1234
        //  1040: iload           11
        //  1042: ldc_w           -2147483648
        //  1045: if_icmpeq       1053
        //  1048: iload           11
        //  1050: ifne            1234
        //  1053: aload_0        
        //  1054: iconst_0       
        //  1055: putfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //  1058: iconst_0       
        //  1059: istore          115
        //  1061: iload           115
        //  1063: iload           10
        //  1065: if_icmpge       1234
        //  1068: aload_0        
        //  1069: iload           115
        //  1071: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getVirtualChildAt:(I)Landroid/view/View;
        //  1074: astore          116
        //  1076: aload           116
        //  1078: ifnonnull       1100
        //  1081: aload_0        
        //  1082: aload_0        
        //  1083: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //  1086: aload_0        
        //  1087: iload           115
        //  1089: invokevirtual   android/support/v7/widget/LinearLayoutCompat.measureNullChild:(I)I
        //  1092: iadd           
        //  1093: putfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //  1096: iload_3        
        //  1097: ifeq            1227
        //  1100: aload           116
        //  1102: invokevirtual   android/view/View.getVisibility:()I
        //  1105: istore          118
        //  1107: iload           118
        //  1109: bipush          8
        //  1111: if_icmpne       1131
        //  1114: iload           115
        //  1116: aload_0        
        //  1117: aload           116
        //  1119: iload           115
        //  1121: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getChildrenSkipCount:(Landroid/view/View;I)I
        //  1124: iadd           
        //  1125: istore          115
        //  1127: iload_3        
        //  1128: ifeq            1227
        //  1131: iload           115
        //  1133: istore          119
        //  1135: aload           116
        //  1137: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //  1140: checkcast       Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;
        //  1143: astore          120
        //  1145: iload           22
        //  1147: ifeq            1184
        //  1150: aload_0        
        //  1151: aload_0        
        //  1152: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //  1155: iload           32
        //  1157: aload           120
        //  1159: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.leftMargin:I
        //  1162: iadd           
        //  1163: aload           120
        //  1165: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.rightMargin:I
        //  1168: iadd           
        //  1169: aload_0        
        //  1170: aload           116
        //  1172: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getNextLocationOffset:(Landroid/view/View;)I
        //  1175: iadd           
        //  1176: iadd           
        //  1177: putfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //  1180: iload_3        
        //  1181: ifeq            1223
        //  1184: aload_0        
        //  1185: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //  1188: istore          121
        //  1190: aload_0        
        //  1191: iload           121
        //  1193: iload           121
        //  1195: iload           32
        //  1197: iadd           
        //  1198: aload           120
        //  1200: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.leftMargin:I
        //  1203: iadd           
        //  1204: aload           120
        //  1206: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.rightMargin:I
        //  1209: iadd           
        //  1210: aload_0        
        //  1211: aload           116
        //  1213: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getNextLocationOffset:(Landroid/view/View;)I
        //  1216: iadd           
        //  1217: invokestatic    java/lang/Math.max:(II)I
        //  1220: putfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //  1223: iload           119
        //  1225: istore          115
        //  1227: iinc            115, 1
        //  1230: iload_3        
        //  1231: ifeq            1061
        //  1234: aload_0        
        //  1235: aload_0        
        //  1236: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //  1239: aload_0        
        //  1240: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getPaddingLeft:()I
        //  1243: aload_0        
        //  1244: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getPaddingRight:()I
        //  1247: iadd           
        //  1248: iadd           
        //  1249: putfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //  1252: aload_0        
        //  1253: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //  1256: aload_0        
        //  1257: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getSuggestedMinimumWidth:()I
        //  1260: invokestatic    java/lang/Math.max:(II)I
        //  1263: iload_1        
        //  1264: iconst_0       
        //  1265: invokestatic    android/support/v4/view/ViewCompat.resolveSizeAndState:(III)I
        //  1268: istore          40
        //  1270: ldc_w           16777215
        //  1273: iload           40
        //  1275: iand           
        //  1276: aload_0        
        //  1277: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //  1280: isub           
        //  1281: istore          41
        //  1283: iload           25
        //  1285: ifne            1300
        //  1288: iload           41
        //  1290: ifeq            2622
        //  1293: fload           26
        //  1295: fconst_0       
        //  1296: fcmpl          
        //  1297: ifle            2622
        //  1300: aload_0        
        //  1301: getfield        android/support/v7/widget/LinearLayoutCompat.mWeightSum:F
        //  1304: fconst_0       
        //  1305: fcmpl          
        //  1306: ifle            2393
        //  1309: aload_0        
        //  1310: getfield        android/support/v7/widget/LinearLayoutCompat.mWeightSum:F
        //  1313: fstore          43
        //  1315: aload           18
        //  1317: iconst_3       
        //  1318: iconst_m1      
        //  1319: iastore        
        //  1320: aload           18
        //  1322: iconst_2       
        //  1323: iconst_m1      
        //  1324: iastore        
        //  1325: aload           18
        //  1327: iconst_1       
        //  1328: iconst_m1      
        //  1329: iastore        
        //  1330: aload           18
        //  1332: iconst_0       
        //  1333: iconst_m1      
        //  1334: iastore        
        //  1335: aload           19
        //  1337: iconst_3       
        //  1338: iconst_m1      
        //  1339: iastore        
        //  1340: aload           19
        //  1342: iconst_2       
        //  1343: iconst_m1      
        //  1344: iastore        
        //  1345: aload           19
        //  1347: iconst_1       
        //  1348: iconst_m1      
        //  1349: iastore        
        //  1350: aload           19
        //  1352: iconst_0       
        //  1353: iconst_m1      
        //  1354: iastore        
        //  1355: iconst_m1      
        //  1356: istore          44
        //  1358: aload_0        
        //  1359: iconst_0       
        //  1360: putfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //  1363: iconst_0       
        //  1364: istore          45
        //  1366: iload           27
        //  1368: istore          46
        //  1370: iload           30
        //  1372: istore          47
        //  1374: iload           29
        //  1376: istore          48
        //  1378: fload           43
        //  1380: fstore          49
        //  1382: iload           45
        //  1384: iload           10
        //  1386: if_icmpge       2607
        //  1389: aload_0        
        //  1390: iload           45
        //  1392: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getVirtualChildAt:(I)Landroid/view/View;
        //  1395: astore          79
        //  1397: aload           79
        //  1399: ifnull          2584
        //  1402: aload           79
        //  1404: invokevirtual   android/view/View.getVisibility:()I
        //  1407: istore          84
        //  1409: iload           84
        //  1411: bipush          8
        //  1413: if_icmpne       1420
        //  1416: iload_3        
        //  1417: ifeq            2584
        //  1420: aload           79
        //  1422: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //  1425: checkcast       Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;
        //  1428: astore          85
        //  1430: aload           85
        //  1432: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.weight:F
        //  1435: fstore          86
        //  1437: fload           86
        //  1439: fconst_0       
        //  1440: fcmpl          
        //  1441: ifle            2569
        //  1444: fload           86
        //  1446: iload           41
        //  1448: i2f            
        //  1449: fmul           
        //  1450: fload           49
        //  1452: fdiv           
        //  1453: f2i            
        //  1454: istore          107
        //  1456: fload           49
        //  1458: fload           86
        //  1460: fsub           
        //  1461: fstore          108
        //  1463: iload           41
        //  1465: iload           107
        //  1467: isub           
        //  1468: istore          87
        //  1470: iload_2        
        //  1471: aload_0        
        //  1472: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getPaddingTop:()I
        //  1475: aload_0        
        //  1476: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getPaddingBottom:()I
        //  1479: iadd           
        //  1480: aload           85
        //  1482: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.topMargin:I
        //  1485: iadd           
        //  1486: aload           85
        //  1488: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.bottomMargin:I
        //  1491: iadd           
        //  1492: aload           85
        //  1494: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.height:I
        //  1497: invokestatic    android/support/v7/widget/LinearLayoutCompat.getChildMeasureSpec:(III)I
        //  1500: istore          109
        //  1502: aload           85
        //  1504: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.width:I
        //  1507: istore          111
        //  1509: iload           111
        //  1511: ifne            1521
        //  1514: iload           11
        //  1516: ldc             1073741824
        //  1518: if_icmpeq       1557
        //  1521: iload           107
        //  1523: aload           79
        //  1525: invokevirtual   android/view/View.getMeasuredWidth:()I
        //  1528: iadd           
        //  1529: istore          112
        //  1531: iload           112
        //  1533: ifge            1539
        //  1536: iconst_0       
        //  1537: istore          112
        //  1539: aload           79
        //  1541: iload           112
        //  1543: ldc             1073741824
        //  1545: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //  1548: iload           109
        //  1550: invokevirtual   android/view/View.measure:(II)V
        //  1553: iload_3        
        //  1554: ifeq            1576
        //  1557: iload           107
        //  1559: ifle            2420
        //  1562: aload           79
        //  1564: iload           107
        //  1566: ldc             1073741824
        //  1568: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //  1571: iload           109
        //  1573: invokevirtual   android/view/View.measure:(II)V
        //  1576: iload           46
        //  1578: ldc_w           -16777216
        //  1581: aload           79
        //  1583: invokestatic    android/support/v4/view/ViewCompat.getMeasuredState:(Landroid/view/View;)I
        //  1586: iand           
        //  1587: invokestatic    android/support/v7/internal/widget/ViewUtils.combineMeasuredStates:(II)I
        //  1590: istore          88
        //  1592: fload           108
        //  1594: fstore          89
        //  1596: iload           22
        //  1598: ifeq            1638
        //  1601: aload_0        
        //  1602: aload_0        
        //  1603: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //  1606: aload           79
        //  1608: invokevirtual   android/view/View.getMeasuredWidth:()I
        //  1611: aload           85
        //  1613: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.leftMargin:I
        //  1616: iadd           
        //  1617: aload           85
        //  1619: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.rightMargin:I
        //  1622: iadd           
        //  1623: aload_0        
        //  1624: aload           79
        //  1626: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getNextLocationOffset:(Landroid/view/View;)I
        //  1629: iadd           
        //  1630: iadd           
        //  1631: putfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //  1634: iload_3        
        //  1635: ifeq            1680
        //  1638: aload_0        
        //  1639: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //  1642: istore          90
        //  1644: aload_0        
        //  1645: iload           90
        //  1647: iload           90
        //  1649: aload           79
        //  1651: invokevirtual   android/view/View.getMeasuredWidth:()I
        //  1654: iadd           
        //  1655: aload           85
        //  1657: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.leftMargin:I
        //  1660: iadd           
        //  1661: aload           85
        //  1663: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.rightMargin:I
        //  1666: iadd           
        //  1667: aload_0        
        //  1668: aload           79
        //  1670: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getNextLocationOffset:(Landroid/view/View;)I
        //  1673: iadd           
        //  1674: invokestatic    java/lang/Math.max:(II)I
        //  1677: putfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //  1680: iload           12
        //  1682: ldc             1073741824
        //  1684: if_icmpeq       2436
        //  1687: aload           85
        //  1689: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.height:I
        //  1692: istore          105
        //  1694: iload           105
        //  1696: iconst_m1      
        //  1697: if_icmpne       2436
        //  1700: iconst_1       
        //  1701: istore          91
        //  1703: aload           85
        //  1705: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.topMargin:I
        //  1708: aload           85
        //  1710: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.bottomMargin:I
        //  1713: iadd           
        //  1714: istore          92
        //  1716: iload           92
        //  1718: aload           79
        //  1720: invokevirtual   android/view/View.getMeasuredHeight:()I
        //  1723: iadd           
        //  1724: istore          93
        //  1726: iload           44
        //  1728: iload           93
        //  1730: invokestatic    java/lang/Math.max:(II)I
        //  1733: istore          94
        //  1735: iload           91
        //  1737: ifeq            2442
        //  1740: iload           92
        //  1742: istore          95
        //  1744: iload           47
        //  1746: iload           95
        //  1748: invokestatic    java/lang/Math.max:(II)I
        //  1751: istore          96
        //  1753: iload           48
        //  1755: ifeq            2454
        //  1758: aload           85
        //  1760: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.height:I
        //  1763: istore          103
        //  1765: iload           103
        //  1767: iconst_m1      
        //  1768: if_icmpne       2454
        //  1771: iconst_1       
        //  1772: istore          97
        //  1774: iload           20
        //  1776: ifeq            1853
        //  1779: aload           79
        //  1781: invokevirtual   android/view/View.getBaseline:()I
        //  1784: istore          98
        //  1786: iload           98
        //  1788: iconst_m1      
        //  1789: if_icmpeq       1853
        //  1792: aload           85
        //  1794: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.gravity:I
        //  1797: ifge            2465
        //  1800: aload_0        
        //  1801: getfield        android/support/v7/widget/LinearLayoutCompat.mGravity:I
        //  1804: istore          100
        //  1806: bipush          -2
        //  1808: iload           100
        //  1810: bipush          112
        //  1812: iand           
        //  1813: iconst_4       
        //  1814: ishr           
        //  1815: iand           
        //  1816: iconst_1       
        //  1817: ishr           
        //  1818: istore          101
        //  1820: aload           18
        //  1822: iload           101
        //  1824: aload           18
        //  1826: iload           101
        //  1828: iaload         
        //  1829: iload           98
        //  1831: invokestatic    java/lang/Math.max:(II)I
        //  1834: iastore        
        //  1835: aload           19
        //  1837: iload           101
        //  1839: aload           19
        //  1841: iload           101
        //  1843: iaload         
        //  1844: iload           93
        //  1846: iload           98
        //  1848: isub           
        //  1849: invokestatic    java/lang/Math.max:(II)I
        //  1852: iastore        
        //  1853: iload           97
        //  1855: istore          50
        //  1857: iload           96
        //  1859: istore          51
        //  1861: iload           88
        //  1863: istore          46
        //  1865: iload           94
        //  1867: istore          52
        //  1869: fload           89
        //  1871: fstore          80
        //  1873: iload           87
        //  1875: istore          81
        //  1877: iload           45
        //  1879: iconst_1       
        //  1880: iadd           
        //  1881: istore          82
        //  1883: iload_3        
        //  1884: ifeq            2542
        //  1887: aload_0        
        //  1888: aload_0        
        //  1889: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //  1892: aload_0        
        //  1893: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getPaddingLeft:()I
        //  1896: aload_0        
        //  1897: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getPaddingRight:()I
        //  1900: iadd           
        //  1901: iadd           
        //  1902: putfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //  1905: aload           18
        //  1907: iconst_1       
        //  1908: iaload         
        //  1909: istore          56
        //  1911: iload           56
        //  1913: iconst_m1      
        //  1914: if_icmpne       1949
        //  1917: aload           18
        //  1919: iconst_0       
        //  1920: iaload         
        //  1921: istore          77
        //  1923: iload           77
        //  1925: iconst_m1      
        //  1926: if_icmpne       1949
        //  1929: aload           18
        //  1931: iconst_2       
        //  1932: iaload         
        //  1933: iconst_m1      
        //  1934: if_icmpne       1949
        //  1937: aload           18
        //  1939: iconst_3       
        //  1940: iaload         
        //  1941: istore          78
        //  1943: iload           78
        //  1945: iconst_m1      
        //  1946: if_icmpeq       2007
        //  1949: iload           52
        //  1951: aload           18
        //  1953: iconst_3       
        //  1954: iaload         
        //  1955: aload           18
        //  1957: iconst_0       
        //  1958: iaload         
        //  1959: aload           18
        //  1961: iconst_1       
        //  1962: iaload         
        //  1963: aload           18
        //  1965: iconst_2       
        //  1966: iaload         
        //  1967: invokestatic    java/lang/Math.max:(II)I
        //  1970: invokestatic    java/lang/Math.max:(II)I
        //  1973: invokestatic    java/lang/Math.max:(II)I
        //  1976: aload           19
        //  1978: iconst_3       
        //  1979: iaload         
        //  1980: aload           19
        //  1982: iconst_0       
        //  1983: iaload         
        //  1984: aload           19
        //  1986: iconst_1       
        //  1987: iaload         
        //  1988: aload           19
        //  1990: iconst_2       
        //  1991: iaload         
        //  1992: invokestatic    java/lang/Math.max:(II)I
        //  1995: invokestatic    java/lang/Math.max:(II)I
        //  1998: invokestatic    java/lang/Math.max:(II)I
        //  2001: iadd           
        //  2002: invokestatic    java/lang/Math.max:(II)I
        //  2005: istore          52
        //  2007: iload_3        
        //  2008: ifeq            2519
        //  2011: iload           50
        //  2013: istore          66
        //  2015: iload           51
        //  2017: istore          67
        //  2019: iload           66
        //  2021: istore          68
        //  2023: iload           67
        //  2025: iload           7
        //  2027: invokestatic    java/lang/Math.max:(II)I
        //  2030: istore          69
        //  2032: iload           21
        //  2034: ifeq            2133
        //  2037: iload           11
        //  2039: ldc             1073741824
        //  2041: if_icmpeq       2133
        //  2044: iconst_0       
        //  2045: istore          71
        //  2047: iload           71
        //  2049: iload           10
        //  2051: if_icmpge       2133
        //  2054: aload_0        
        //  2055: iload           71
        //  2057: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getVirtualChildAt:(I)Landroid/view/View;
        //  2060: astore          72
        //  2062: aload           72
        //  2064: ifnull          2123
        //  2067: aload           72
        //  2069: invokevirtual   android/view/View.getVisibility:()I
        //  2072: istore          75
        //  2074: iload           75
        //  2076: bipush          8
        //  2078: if_icmpne       2085
        //  2081: iload_3        
        //  2082: ifeq            2123
        //  2085: aload           72
        //  2087: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //  2090: checkcast       Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;
        //  2093: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.weight:F
        //  2096: fconst_0       
        //  2097: fcmpl          
        //  2098: ifle            2123
        //  2101: aload           72
        //  2103: iload           32
        //  2105: ldc             1073741824
        //  2107: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //  2110: aload           72
        //  2112: invokevirtual   android/view/View.getMeasuredHeight:()I
        //  2115: ldc             1073741824
        //  2117: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //  2120: invokevirtual   android/view/View.measure:(II)V
        //  2123: iload           71
        //  2125: iconst_1       
        //  2126: iadd           
        //  2127: istore          73
        //  2129: iload_3        
        //  2130: ifeq            2512
        //  2133: iload           69
        //  2135: istore          58
        //  2137: iload           68
        //  2139: istore          70
        //  2141: iload           52
        //  2143: istore          59
        //  2145: iload           46
        //  2147: istore          60
        //  2149: iload           70
        //  2151: istore          61
        //  2153: iload           61
        //  2155: ifne            2505
        //  2158: iload           12
        //  2160: ldc             1073741824
        //  2162: if_icmpeq       2505
        //  2165: iload           58
        //  2167: aload_0        
        //  2168: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getPaddingTop:()I
        //  2171: aload_0        
        //  2172: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getPaddingBottom:()I
        //  2175: iadd           
        //  2176: iadd           
        //  2177: aload_0        
        //  2178: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getSuggestedMinimumHeight:()I
        //  2181: invokestatic    java/lang/Math.max:(II)I
        //  2184: istore          62
        //  2186: iload           40
        //  2188: ldc_w           -16777216
        //  2191: iload           60
        //  2193: iand           
        //  2194: ior            
        //  2195: istore          63
        //  2197: iload           60
        //  2199: bipush          16
        //  2201: ishl           
        //  2202: istore          64
        //  2204: aload_0        
        //  2205: iload           63
        //  2207: iload           62
        //  2209: iload_2        
        //  2210: iload           64
        //  2212: invokestatic    android/support/v4/view/ViewCompat.resolveSizeAndState:(III)I
        //  2215: invokevirtual   android/support/v7/widget/LinearLayoutCompat.setMeasuredDimension:(II)V
        //  2218: iload           31
        //  2220: ifeq            2230
        //  2223: aload_0        
        //  2224: iload           10
        //  2226: iload_1        
        //  2227: invokespecial   android/support/v7/widget/LinearLayoutCompat.forceUniformHeight:(II)V
        //  2230: return         
        //  2231: astore          15
        //  2233: aload           15
        //  2235: athrow         
        //  2236: astore          16
        //  2238: aload           16
        //  2240: athrow         
        //  2241: iconst_0       
        //  2242: istore          22
        //  2244: goto            157
        //  2247: astore          126
        //  2249: aload           126
        //  2251: athrow         
        //  2252: astore          129
        //  2254: aload           129
        //  2256: athrow         
        //  2257: astore          173
        //  2259: aload           173
        //  2261: athrow         
        //  2262: astore          174
        //  2264: aload           174
        //  2266: athrow         
        //  2267: astore          175
        //  2269: aload           175
        //  2271: athrow         
        //  2272: astore          134
        //  2274: aload           134
        //  2276: athrow         
        //  2277: astore          171
        //  2279: aload           171
        //  2281: athrow         
        //  2282: iconst_0       
        //  2283: istore          136
        //  2285: goto            458
        //  2288: astore          137
        //  2290: aload           137
        //  2292: athrow         
        //  2293: astore          170
        //  2295: aload           170
        //  2297: athrow         
        //  2298: astore          168
        //  2300: aload           168
        //  2302: athrow         
        //  2303: astore          165
        //  2305: aload           165
        //  2307: athrow         
        //  2308: aload           130
        //  2310: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.gravity:I
        //  2313: istore          166
        //  2315: goto            682
        //  2318: astore          162
        //  2320: aload           162
        //  2322: athrow         
        //  2323: iconst_0       
        //  2324: istore          148
        //  2326: goto            759
        //  2329: astore          149
        //  2331: aload           149
        //  2333: athrow         
        //  2334: astore          150
        //  2336: aload           150
        //  2338: athrow         
        //  2339: iload           144
        //  2341: istore          161
        //  2343: goto            782
        //  2346: iload           144
        //  2348: istore          143
        //  2350: goto            800
        //  2353: astore          33
        //  2355: aload           33
        //  2357: athrow         
        //  2358: astore          34
        //  2360: aload           34
        //  2362: athrow         
        //  2363: astore          36
        //  2365: aload           36
        //  2367: athrow         
        //  2368: astore          37
        //  2370: aload           37
        //  2372: athrow         
        //  2373: astore          38
        //  2375: aload           38
        //  2377: athrow         
        //  2378: astore          117
        //  2380: aload           117
        //  2382: athrow         
        //  2383: astore          122
        //  2385: aload           122
        //  2387: athrow         
        //  2388: astore          42
        //  2390: aload           42
        //  2392: athrow         
        //  2393: fload           26
        //  2395: fstore          43
        //  2397: goto            1315
        //  2400: astore          83
        //  2402: aload           83
        //  2404: athrow         
        //  2405: astore          110
        //  2407: aload           110
        //  2409: athrow         
        //  2410: astore          113
        //  2412: aload           113
        //  2414: athrow         
        //  2415: astore          114
        //  2417: aload           114
        //  2419: athrow         
        //  2420: iconst_0       
        //  2421: istore          107
        //  2423: goto            1562
        //  2426: astore          106
        //  2428: aload           106
        //  2430: athrow         
        //  2431: astore          104
        //  2433: aload           104
        //  2435: athrow         
        //  2436: iconst_0       
        //  2437: istore          91
        //  2439: goto            1703
        //  2442: iload           93
        //  2444: istore          95
        //  2446: goto            1744
        //  2449: astore          102
        //  2451: aload           102
        //  2453: athrow         
        //  2454: iconst_0       
        //  2455: istore          97
        //  2457: goto            1774
        //  2460: astore          99
        //  2462: aload           99
        //  2464: athrow         
        //  2465: aload           85
        //  2467: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.gravity:I
        //  2470: istore          100
        //  2472: goto            1806
        //  2475: astore          53
        //  2477: aload           53
        //  2479: athrow         
        //  2480: astore          54
        //  2482: aload           54
        //  2484: athrow         
        //  2485: astore          55
        //  2487: aload           55
        //  2489: athrow         
        //  2490: astore          74
        //  2492: aload           74
        //  2494: athrow         
        //  2495: astore          76
        //  2497: aload           76
        //  2499: athrow         
        //  2500: astore          65
        //  2502: aload           65
        //  2504: athrow         
        //  2505: iload           59
        //  2507: istore          58
        //  2509: goto            2165
        //  2512: iload           73
        //  2514: istore          71
        //  2516: goto            2047
        //  2519: iload           50
        //  2521: istore          57
        //  2523: iload           51
        //  2525: istore          58
        //  2527: iload           52
        //  2529: istore          59
        //  2531: iload           46
        //  2533: istore          60
        //  2535: iload           57
        //  2537: istore          61
        //  2539: goto            2153
        //  2542: iload           82
        //  2544: istore          45
        //  2546: iload           81
        //  2548: istore          41
        //  2550: iload           51
        //  2552: istore          47
        //  2554: iload           52
        //  2556: istore          44
        //  2558: fload           80
        //  2560: fstore          49
        //  2562: iload           50
        //  2564: istore          48
        //  2566: goto            1382
        //  2569: iload           41
        //  2571: istore          87
        //  2573: iload           46
        //  2575: istore          88
        //  2577: fload           49
        //  2579: fstore          89
        //  2581: goto            1596
        //  2584: iload           48
        //  2586: istore          50
        //  2588: iload           47
        //  2590: istore          51
        //  2592: fload           49
        //  2594: fstore          80
        //  2596: iload           41
        //  2598: istore          81
        //  2600: iload           44
        //  2602: istore          52
        //  2604: goto            1877
        //  2607: iload           48
        //  2609: istore          50
        //  2611: iload           47
        //  2613: istore          51
        //  2615: iload           44
        //  2617: istore          52
        //  2619: goto            1887
        //  2622: iload           29
        //  2624: istore          68
        //  2626: iload           30
        //  2628: istore          67
        //  2630: iload           27
        //  2632: istore          46
        //  2634: iload           28
        //  2636: istore          52
        //  2638: goto            2023
        //  2641: iload           158
        //  2643: istore          8
        //  2645: iload           159
        //  2647: istore          7
        //  2649: iload           30
        //  2651: istore          6
        //  2653: iload           27
        //  2655: istore          5
        //  2657: iload           28
        //  2659: istore          4
        //  2661: fload           26
        //  2663: fstore          9
        //  2665: iload           160
        //  2667: istore          24
        //  2669: goto            165
        //  2672: iload           152
        //  2674: istore          156
        //  2676: iload           6
        //  2678: istore          155
        //  2680: goto            821
        //  2683: iload           7
        //  2685: istore          152
        //  2687: goto            795
        //  2690: iload           13
        //  2692: istore          141
        //  2694: iconst_0       
        //  2695: istore          142
        //  2697: goto            611
        //  2700: iload           23
        //  2702: istore          140
        //  2704: goto            585
        //  2707: iconst_1       
        //  2708: istore          132
        //  2710: iload           23
        //  2712: istore          140
        //  2714: goto            585
        //  2717: iload           23
        //  2719: istore          140
        //  2721: iload           14
        //  2723: istore          132
        //  2725: goto            585
        //  2728: iload           14
        //  2730: istore          132
        //  2732: goto            404
        //  2735: iload           24
        //  2737: istore          157
        //  2739: fload           9
        //  2741: fstore          26
        //  2743: iload           7
        //  2745: istore          159
        //  2747: iload           5
        //  2749: istore          27
        //  2751: iload           4
        //  2753: istore          28
        //  2755: iload           8
        //  2757: istore          158
        //  2759: iload           6
        //  2761: istore          30
        //  2763: goto            870
        //  2766: iload           14
        //  2768: istore          25
        //  2770: fload           9
        //  2772: fstore          26
        //  2774: iload           5
        //  2776: istore          27
        //  2778: iload           4
        //  2780: istore          28
        //  2782: iload           8
        //  2784: istore          29
        //  2786: iload           6
        //  2788: istore          30
        //  2790: iload           13
        //  2792: istore          31
        //  2794: iload           23
        //  2796: istore          32
        //  2798: goto            900
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  51     57     2231   2236   Ljava/lang/RuntimeException;
        //  62     69     2236   2241   Ljava/lang/RuntimeException;
        //  69     83     2236   2241   Ljava/lang/RuntimeException;
        //  185    200    2247   2252   Ljava/lang/RuntimeException;
        //  204    211    2247   2252   Ljava/lang/RuntimeException;
        //  239    261    2252   2257   Ljava/lang/RuntimeException;
        //  288    295    2257   2262   Ljava/lang/RuntimeException;
        //  300    307    2262   2267   Ljava/lang/RuntimeException;
        //  319    339    2267   2272   Ljava/lang/RuntimeException;
        //  409    424    2272   2277   Ljava/lang/RuntimeException;
        //  452    458    2277   2282   Ljava/lang/RuntimeException;
        //  458    471    2288   2293   Ljava/lang/RuntimeException;
        //  479    486    2288   2293   Ljava/lang/RuntimeException;
        //  498    528    2293   2298   Ljava/lang/RuntimeException;
        //  592    599    2298   2303   Ljava/lang/RuntimeException;
        //  668    682    2303   2308   Ljava/lang/RuntimeException;
        //  743    750    2318   2323   Ljava/lang/RuntimeException;
        //  759    766    2329   2339   Ljava/lang/RuntimeException;
        //  900    906    2353   2358   Ljava/lang/RuntimeException;
        //  911    933    2358   2363   Ljava/lang/RuntimeException;
        //  933    939    2363   2368   Ljava/lang/RuntimeException;
        //  945    951    2368   2373   Ljava/lang/RuntimeException;
        //  957    971    2373   2378   Ljava/lang/RuntimeException;
        //  1081   1096   2378   2383   Ljava/lang/RuntimeException;
        //  1100   1107   2378   2383   Ljava/lang/RuntimeException;
        //  1150   1180   2383   2388   Ljava/lang/RuntimeException;
        //  1300   1315   2388   2393   Ljava/lang/RuntimeException;
        //  1402   1409   2400   2405   Ljava/lang/RuntimeException;
        //  1502   1509   2405   2410   Ljava/lang/RuntimeException;
        //  1539   1553   2410   2420   Ljava/lang/RuntimeException;
        //  1601   1634   2426   2431   Ljava/lang/RuntimeException;
        //  1687   1694   2431   2436   Ljava/lang/RuntimeException;
        //  1758   1765   2449   2454   Ljava/lang/RuntimeException;
        //  1792   1806   2460   2465   Ljava/lang/RuntimeException;
        //  1887   1911   2475   2480   Ljava/lang/RuntimeException;
        //  1917   1923   2480   2485   Ljava/lang/RuntimeException;
        //  1929   1943   2485   2490   Ljava/lang/RuntimeException;
        //  2067   2074   2490   2495   Ljava/lang/RuntimeException;
        //  2101   2123   2495   2500   Ljava/lang/RuntimeException;
        //  2204   2218   2500   2505   Ljava/lang/RuntimeException;
        //  2223   2230   2500   2505   Ljava/lang/RuntimeException;
        //  2233   2236   2236   2241   Ljava/lang/RuntimeException;
        //  2259   2262   2262   2267   Ljava/lang/RuntimeException;
        //  2264   2267   2267   2272   Ljava/lang/RuntimeException;
        //  2331   2334   2334   2339   Ljava/lang/RuntimeException;
        //  2355   2358   2358   2363   Ljava/lang/RuntimeException;
        //  2365   2368   2368   2373   Ljava/lang/RuntimeException;
        //  2370   2373   2373   2378   Ljava/lang/RuntimeException;
        //  2412   2415   2415   2420   Ljava/lang/RuntimeException;
        //  2477   2480   2480   2485   Ljava/lang/RuntimeException;
        //  2482   2485   2485   2490   Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 1440, Size: 1440
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
    
    int measureNullChild(final int n) {
        return 0;
    }
    
    void measureVertical(final int p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_0        
        //     5: iconst_0       
        //     6: putfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //     9: iconst_0       
        //    10: istore          4
        //    12: iconst_0       
        //    13: istore          5
        //    15: iconst_0       
        //    16: istore          6
        //    18: iconst_0       
        //    19: istore          7
        //    21: iconst_1       
        //    22: istore          8
        //    24: fconst_0       
        //    25: fstore          9
        //    27: aload_0        
        //    28: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getVirtualChildCount:()I
        //    31: istore          10
        //    33: iload_1        
        //    34: invokestatic    android/view/View$MeasureSpec.getMode:(I)I
        //    37: istore          11
        //    39: iload_2        
        //    40: invokestatic    android/view/View$MeasureSpec.getMode:(I)I
        //    43: istore          12
        //    45: iconst_0       
        //    46: istore          13
        //    48: iconst_0       
        //    49: istore          14
        //    51: aload_0        
        //    52: getfield        android/support/v7/widget/LinearLayoutCompat.mBaselineAlignedChildIndex:I
        //    55: istore          15
        //    57: aload_0        
        //    58: getfield        android/support/v7/widget/LinearLayoutCompat.mUseLargestChild:Z
        //    61: istore          16
        //    63: ldc_w           -2147483648
        //    66: istore          17
        //    68: iconst_0       
        //    69: istore          18
        //    71: iload           18
        //    73: iload           10
        //    75: if_icmpge       2028
        //    78: aload_0        
        //    79: iload           18
        //    81: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getVirtualChildAt:(I)Landroid/view/View;
        //    84: astore          100
        //    86: aload           100
        //    88: ifnonnull       110
        //    91: aload_0        
        //    92: aload_0        
        //    93: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //    96: aload_0        
        //    97: iload           18
        //    99: invokevirtual   android/support/v7/widget/LinearLayoutCompat.measureNullChild:(I)I
        //   102: iadd           
        //   103: putfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   106: iload_3        
        //   107: ifeq            1997
        //   110: aload           100
        //   112: invokevirtual   android/view/View.getVisibility:()I
        //   115: istore          102
        //   117: iload           102
        //   119: bipush          8
        //   121: if_icmpne       141
        //   124: iload           18
        //   126: aload_0        
        //   127: aload           100
        //   129: iload           18
        //   131: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getChildrenSkipCount:(Landroid/view/View;I)I
        //   134: iadd           
        //   135: istore          18
        //   137: iload_3        
        //   138: ifeq            1997
        //   141: iload           18
        //   143: istore          103
        //   145: aload_0        
        //   146: iload           103
        //   148: invokevirtual   android/support/v7/widget/LinearLayoutCompat.hasDividerBeforeChildAt:(I)Z
        //   151: ifeq            167
        //   154: aload_0        
        //   155: aload_0        
        //   156: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   159: aload_0        
        //   160: getfield        android/support/v7/widget/LinearLayoutCompat.mDividerHeight:I
        //   163: iadd           
        //   164: putfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   167: aload           100
        //   169: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   172: checkcast       Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;
        //   175: astore          105
        //   177: fload           9
        //   179: aload           105
        //   181: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.weight:F
        //   184: fadd           
        //   185: fstore          106
        //   187: iload           12
        //   189: ldc             1073741824
        //   191: if_icmpne       1990
        //   194: aload           105
        //   196: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.height:I
        //   199: ifne            1990
        //   202: aload           105
        //   204: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.weight:F
        //   207: fstore          147
        //   209: fload           147
        //   211: fconst_0       
        //   212: fcmpl          
        //   213: ifle            1990
        //   216: aload_0        
        //   217: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   220: istore          148
        //   222: aload_0        
        //   223: iload           148
        //   225: iload           148
        //   227: aload           105
        //   229: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.topMargin:I
        //   232: iadd           
        //   233: aload           105
        //   235: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.bottomMargin:I
        //   238: iadd           
        //   239: invokestatic    java/lang/Math.max:(II)I
        //   242: putfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   245: iload_3        
        //   246: ifeq            1984
        //   249: iconst_1       
        //   250: istore          107
        //   252: ldc_w           -2147483648
        //   255: istore          108
        //   257: aload           105
        //   259: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.height:I
        //   262: ifne            289
        //   265: aload           105
        //   267: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.weight:F
        //   270: fstore          145
        //   272: fload           145
        //   274: fconst_0       
        //   275: fcmpl          
        //   276: ifle            289
        //   279: iconst_0       
        //   280: istore          108
        //   282: aload           105
        //   284: bipush          -2
        //   286: putfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.height:I
        //   289: iload           108
        //   291: istore          110
        //   293: fload           106
        //   295: fconst_0       
        //   296: fcmpl          
        //   297: ifne            480
        //   300: aload_0        
        //   301: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   304: istore          111
        //   306: aload_0        
        //   307: aload           100
        //   309: iload           103
        //   311: iload_1        
        //   312: iconst_0       
        //   313: iload_2        
        //   314: iload           111
        //   316: invokevirtual   android/support/v7/widget/LinearLayoutCompat.measureChildBeforeLayout:(Landroid/view/View;IIIII)V
        //   319: iload           110
        //   321: ldc_w           -2147483648
        //   324: if_icmpeq       334
        //   327: aload           105
        //   329: iload           110
        //   331: putfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.height:I
        //   334: aload           100
        //   336: invokevirtual   android/view/View.getMeasuredHeight:()I
        //   339: istore          113
        //   341: aload_0        
        //   342: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   345: istore          114
        //   347: aload_0        
        //   348: iload           114
        //   350: iload           114
        //   352: iload           113
        //   354: iadd           
        //   355: aload           105
        //   357: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.topMargin:I
        //   360: iadd           
        //   361: aload           105
        //   363: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.bottomMargin:I
        //   366: iadd           
        //   367: aload_0        
        //   368: aload           100
        //   370: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getNextLocationOffset:(Landroid/view/View;)I
        //   373: iadd           
        //   374: invokestatic    java/lang/Math.max:(II)I
        //   377: putfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   380: iload           16
        //   382: ifeq            1977
        //   385: iload           113
        //   387: iload           17
        //   389: invokestatic    java/lang/Math.max:(II)I
        //   392: istore          17
        //   394: iload           107
        //   396: istore          115
        //   398: iload           15
        //   400: iflt            420
        //   403: iload           15
        //   405: iload           103
        //   407: iconst_1       
        //   408: iadd           
        //   409: if_icmpne       420
        //   412: aload_0        
        //   413: aload_0        
        //   414: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   417: putfield        android/support/v7/widget/LinearLayoutCompat.mBaselineChildTop:I
        //   420: iload           103
        //   422: iload           15
        //   424: if_icmpge       496
        //   427: aload           105
        //   429: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.weight:F
        //   432: fconst_0       
        //   433: fcmpl          
        //   434: ifle            496
        //   437: new             Ljava/lang/RuntimeException;
        //   440: dup            
        //   441: getstatic       android/support/v7/widget/LinearLayoutCompat.z:[Ljava/lang/String;
        //   444: iconst_0       
        //   445: aaload         
        //   446: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   449: athrow         
        //   450: astore          142
        //   452: aload           142
        //   454: athrow         
        //   455: astore          101
        //   457: aload           101
        //   459: athrow         
        //   460: astore          104
        //   462: aload           104
        //   464: athrow         
        //   465: astore          146
        //   467: aload           146
        //   469: athrow         
        //   470: astore          109
        //   472: aload           109
        //   474: athrow         
        //   475: astore          144
        //   477: aload           144
        //   479: athrow         
        //   480: iconst_0       
        //   481: istore          111
        //   483: goto            306
        //   486: astore          112
        //   488: aload           112
        //   490: athrow         
        //   491: astore          143
        //   493: aload           143
        //   495: athrow         
        //   496: iload           11
        //   498: ldc             1073741824
        //   500: if_icmpeq       1967
        //   503: aload           105
        //   505: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.width:I
        //   508: istore          141
        //   510: iload           141
        //   512: iconst_m1      
        //   513: if_icmpne       1967
        //   516: iconst_1       
        //   517: istore          116
        //   519: iconst_1       
        //   520: istore          117
        //   522: aload           105
        //   524: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.leftMargin:I
        //   527: aload           105
        //   529: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.rightMargin:I
        //   532: iadd           
        //   533: istore          118
        //   535: iload           118
        //   537: aload           100
        //   539: invokevirtual   android/view/View.getMeasuredWidth:()I
        //   542: iadd           
        //   543: istore          119
        //   545: iload           4
        //   547: iload           119
        //   549: invokestatic    java/lang/Math.max:(II)I
        //   552: istore          120
        //   554: aload           100
        //   556: invokestatic    android/support/v4/view/ViewCompat.getMeasuredState:(Landroid/view/View;)I
        //   559: istore          121
        //   561: iload           5
        //   563: iload           121
        //   565: invokestatic    android/support/v7/internal/widget/ViewUtils.combineMeasuredStates:(II)I
        //   568: istore          122
        //   570: iload           8
        //   572: ifeq            1659
        //   575: aload           105
        //   577: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.width:I
        //   580: istore          139
        //   582: iload           139
        //   584: iconst_m1      
        //   585: if_icmpne       1659
        //   588: iconst_1       
        //   589: istore          123
        //   591: aload           105
        //   593: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.weight:F
        //   596: fstore          126
        //   598: fload           126
        //   600: fconst_0       
        //   601: fcmpl          
        //   602: ifle            1960
        //   605: iload           117
        //   607: ifeq            1675
        //   610: iload           118
        //   612: istore          137
        //   614: iload           7
        //   616: iload           137
        //   618: invokestatic    java/lang/Math.max:(II)I
        //   621: istore          127
        //   623: iload_3        
        //   624: ifeq            1949
        //   627: iload           117
        //   629: ifeq            1682
        //   632: iload           6
        //   634: iload           118
        //   636: invokestatic    java/lang/Math.max:(II)I
        //   639: istore          128
        //   641: iload           127
        //   643: istore          129
        //   645: iload           128
        //   647: istore          130
        //   649: iload           129
        //   651: istore          131
        //   653: iload           103
        //   655: aload_0        
        //   656: aload           100
        //   658: iload           103
        //   660: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getChildrenSkipCount:(Landroid/view/View;I)I
        //   663: iadd           
        //   664: istore          132
        //   666: iload           116
        //   668: istore          13
        //   670: fload           106
        //   672: fstore          20
        //   674: iload           130
        //   676: istore          6
        //   678: iload           120
        //   680: istore          22
        //   682: iload           123
        //   684: istore          133
        //   686: iload           122
        //   688: istore          21
        //   690: iload           115
        //   692: istore          14
        //   694: iload           131
        //   696: istore          134
        //   698: iload           17
        //   700: istore          135
        //   702: iload           132
        //   704: iconst_1       
        //   705: iadd           
        //   706: istore          136
        //   708: iload_3        
        //   709: ifeq            1918
        //   712: iload           135
        //   714: istore          17
        //   716: iload           14
        //   718: istore          19
        //   720: iload           13
        //   722: istore          25
        //   724: iload           134
        //   726: istore          7
        //   728: iload           133
        //   730: istore          24
        //   732: iload           6
        //   734: istore          23
        //   736: aload_0        
        //   737: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   740: istore          28
        //   742: iload           28
        //   744: ifle            769
        //   747: aload_0        
        //   748: iload           10
        //   750: invokevirtual   android/support/v7/widget/LinearLayoutCompat.hasDividerBeforeChildAt:(I)Z
        //   753: ifeq            769
        //   756: aload_0        
        //   757: aload_0        
        //   758: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   761: aload_0        
        //   762: getfield        android/support/v7/widget/LinearLayoutCompat.mDividerHeight:I
        //   765: iadd           
        //   766: putfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   769: iload           16
        //   771: ifeq            929
        //   774: iload           12
        //   776: ldc_w           -2147483648
        //   779: if_icmpeq       787
        //   782: iload           12
        //   784: ifne            929
        //   787: aload_0        
        //   788: iconst_0       
        //   789: putfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   792: iconst_0       
        //   793: istore          93
        //   795: iload           93
        //   797: iload           10
        //   799: if_icmpge       929
        //   802: aload_0        
        //   803: iload           93
        //   805: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getVirtualChildAt:(I)Landroid/view/View;
        //   808: astore          94
        //   810: aload           94
        //   812: ifnonnull       834
        //   815: aload_0        
        //   816: aload_0        
        //   817: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   820: aload_0        
        //   821: iload           93
        //   823: invokevirtual   android/support/v7/widget/LinearLayoutCompat.measureNullChild:(I)I
        //   826: iadd           
        //   827: putfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   830: iload_3        
        //   831: ifeq            922
        //   834: aload           94
        //   836: invokevirtual   android/view/View.getVisibility:()I
        //   839: istore          96
        //   841: iload           96
        //   843: bipush          8
        //   845: if_icmpne       865
        //   848: iload           93
        //   850: aload_0        
        //   851: aload           94
        //   853: iload           93
        //   855: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getChildrenSkipCount:(Landroid/view/View;I)I
        //   858: iadd           
        //   859: istore          93
        //   861: iload_3        
        //   862: ifeq            922
        //   865: iload           93
        //   867: istore          97
        //   869: aload           94
        //   871: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   874: checkcast       Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;
        //   877: astore          98
        //   879: aload_0        
        //   880: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   883: istore          99
        //   885: aload_0        
        //   886: iload           99
        //   888: iload           99
        //   890: iload           17
        //   892: iadd           
        //   893: aload           98
        //   895: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.topMargin:I
        //   898: iadd           
        //   899: aload           98
        //   901: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.bottomMargin:I
        //   904: iadd           
        //   905: aload_0        
        //   906: aload           94
        //   908: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getNextLocationOffset:(Landroid/view/View;)I
        //   911: iadd           
        //   912: invokestatic    java/lang/Math.max:(II)I
        //   915: putfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   918: iload           97
        //   920: istore          93
        //   922: iinc            93, 1
        //   925: iload_3        
        //   926: ifeq            795
        //   929: aload_0        
        //   930: aload_0        
        //   931: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   934: aload_0        
        //   935: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getPaddingTop:()I
        //   938: aload_0        
        //   939: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getPaddingBottom:()I
        //   942: iadd           
        //   943: iadd           
        //   944: putfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   947: aload_0        
        //   948: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   951: aload_0        
        //   952: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getSuggestedMinimumHeight:()I
        //   955: invokestatic    java/lang/Math.max:(II)I
        //   958: iload_2        
        //   959: iconst_0       
        //   960: invokestatic    android/support/v4/view/ViewCompat.resolveSizeAndState:(III)I
        //   963: istore          29
        //   965: ldc_w           16777215
        //   968: iload           29
        //   970: iand           
        //   971: aload_0        
        //   972: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //   975: isub           
        //   976: istore          30
        //   978: iload           19
        //   980: ifne            995
        //   983: iload           30
        //   985: ifeq            1899
        //   988: fload           20
        //   990: fconst_0       
        //   991: fcmpl          
        //   992: ifle            1899
        //   995: aload_0        
        //   996: getfield        android/support/v7/widget/LinearLayoutCompat.mWeightSum:F
        //   999: fconst_0       
        //  1000: fcmpl          
        //  1001: ifle            1709
        //  1004: aload_0        
        //  1005: getfield        android/support/v7/widget/LinearLayoutCompat.mWeightSum:F
        //  1008: fstore          32
        //  1010: aload_0        
        //  1011: iconst_0       
        //  1012: putfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //  1015: iconst_0       
        //  1016: istore          33
        //  1018: fload           32
        //  1020: fstore          34
        //  1022: iload           23
        //  1024: istore          35
        //  1026: iload           22
        //  1028: istore          36
        //  1030: iload           21
        //  1032: istore          37
        //  1034: iload           24
        //  1036: istore          38
        //  1038: iload           30
        //  1040: istore          39
        //  1042: iload           33
        //  1044: iload           10
        //  1046: if_icmpge       1884
        //  1049: aload_0        
        //  1050: iload           33
        //  1052: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getVirtualChildAt:(I)Landroid/view/View;
        //  1055: astore          60
        //  1057: aload           60
        //  1059: invokevirtual   android/view/View.getVisibility:()I
        //  1062: istore          62
        //  1064: iload           62
        //  1066: bipush          8
        //  1068: if_icmpne       1075
        //  1071: iload_3        
        //  1072: ifeq            1861
        //  1075: aload           60
        //  1077: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //  1080: checkcast       Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;
        //  1083: astore          63
        //  1085: aload           63
        //  1087: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.weight:F
        //  1090: fstore          64
        //  1092: fload           64
        //  1094: fconst_0       
        //  1095: fcmpl          
        //  1096: ifle            1846
        //  1099: fload           64
        //  1101: iload           39
        //  1103: i2f            
        //  1104: fmul           
        //  1105: fload           34
        //  1107: fdiv           
        //  1108: f2i            
        //  1109: istore          83
        //  1111: fload           34
        //  1113: fload           64
        //  1115: fsub           
        //  1116: fstore          84
        //  1118: iload           39
        //  1120: iload           83
        //  1122: isub           
        //  1123: istore          85
        //  1125: iload_1        
        //  1126: aload_0        
        //  1127: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getPaddingLeft:()I
        //  1130: aload_0        
        //  1131: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getPaddingRight:()I
        //  1134: iadd           
        //  1135: aload           63
        //  1137: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.leftMargin:I
        //  1140: iadd           
        //  1141: aload           63
        //  1143: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.rightMargin:I
        //  1146: iadd           
        //  1147: aload           63
        //  1149: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.width:I
        //  1152: invokestatic    android/support/v7/widget/LinearLayoutCompat.getChildMeasureSpec:(III)I
        //  1155: istore          86
        //  1157: aload           63
        //  1159: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.height:I
        //  1162: istore          88
        //  1164: iload           88
        //  1166: ifne            1176
        //  1169: iload           12
        //  1171: ldc             1073741824
        //  1173: if_icmpeq       1212
        //  1176: iload           83
        //  1178: aload           60
        //  1180: invokevirtual   android/view/View.getMeasuredHeight:()I
        //  1183: iadd           
        //  1184: istore          89
        //  1186: iload           89
        //  1188: ifge            1194
        //  1191: iconst_0       
        //  1192: istore          89
        //  1194: aload           60
        //  1196: iload           86
        //  1198: iload           89
        //  1200: ldc             1073741824
        //  1202: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //  1205: invokevirtual   android/view/View.measure:(II)V
        //  1208: iload_3        
        //  1209: ifeq            1231
        //  1212: iload           83
        //  1214: ifle            1736
        //  1217: aload           60
        //  1219: iload           86
        //  1221: iload           83
        //  1223: ldc             1073741824
        //  1225: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //  1228: invokevirtual   android/view/View.measure:(II)V
        //  1231: iload           37
        //  1233: sipush          -256
        //  1236: aload           60
        //  1238: invokestatic    android/support/v4/view/ViewCompat.getMeasuredState:(Landroid/view/View;)I
        //  1241: iand           
        //  1242: invokestatic    android/support/v7/internal/widget/ViewUtils.combineMeasuredStates:(II)I
        //  1245: istore          92
        //  1247: iload           85
        //  1249: istore          66
        //  1251: iload           92
        //  1253: istore          67
        //  1255: fload           84
        //  1257: fstore          65
        //  1259: aload           63
        //  1261: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.leftMargin:I
        //  1264: aload           63
        //  1266: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.rightMargin:I
        //  1269: iadd           
        //  1270: istore          68
        //  1272: iload           68
        //  1274: aload           60
        //  1276: invokevirtual   android/view/View.getMeasuredWidth:()I
        //  1279: iadd           
        //  1280: istore          69
        //  1282: iload           36
        //  1284: iload           69
        //  1286: invokestatic    java/lang/Math.max:(II)I
        //  1289: istore          70
        //  1291: iload           11
        //  1293: ldc             1073741824
        //  1295: if_icmpeq       1747
        //  1298: aload           63
        //  1300: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.width:I
        //  1303: istore          82
        //  1305: iload           82
        //  1307: iconst_m1      
        //  1308: if_icmpne       1747
        //  1311: iconst_1       
        //  1312: istore          71
        //  1314: iload           71
        //  1316: ifeq            1753
        //  1319: iload           68
        //  1321: istore          72
        //  1323: iload           35
        //  1325: iload           72
        //  1327: invokestatic    java/lang/Math.max:(II)I
        //  1330: istore          73
        //  1332: iload           38
        //  1334: ifeq            1765
        //  1337: aload           63
        //  1339: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.width:I
        //  1342: istore          80
        //  1344: iload           80
        //  1346: iconst_m1      
        //  1347: if_icmpne       1765
        //  1350: iconst_1       
        //  1351: istore          74
        //  1353: aload_0        
        //  1354: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //  1357: istore          75
        //  1359: aload_0        
        //  1360: iload           75
        //  1362: iload           75
        //  1364: aload           60
        //  1366: invokevirtual   android/view/View.getMeasuredHeight:()I
        //  1369: iadd           
        //  1370: aload           63
        //  1372: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.topMargin:I
        //  1375: iadd           
        //  1376: aload           63
        //  1378: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.bottomMargin:I
        //  1381: iadd           
        //  1382: aload_0        
        //  1383: aload           60
        //  1385: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getNextLocationOffset:(Landroid/view/View;)I
        //  1388: iadd           
        //  1389: invokestatic    java/lang/Math.max:(II)I
        //  1392: putfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //  1395: iload           66
        //  1397: istore          76
        //  1399: iload           74
        //  1401: istore          40
        //  1403: iload           67
        //  1405: istore          37
        //  1407: iload           70
        //  1409: istore          42
        //  1411: fload           65
        //  1413: fstore          77
        //  1415: iload           73
        //  1417: istore          41
        //  1419: iload           33
        //  1421: iconst_1       
        //  1422: iadd           
        //  1423: istore          78
        //  1425: iload_3        
        //  1426: ifeq            1819
        //  1429: aload_0        
        //  1430: aload_0        
        //  1431: getfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //  1434: aload_0        
        //  1435: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getPaddingTop:()I
        //  1438: aload_0        
        //  1439: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getPaddingBottom:()I
        //  1442: iadd           
        //  1443: iadd           
        //  1444: putfield        android/support/v7/widget/LinearLayoutCompat.mTotalLength:I
        //  1447: iload_3        
        //  1448: ifeq            1800
        //  1451: iload           40
        //  1453: istore          49
        //  1455: iload           41
        //  1457: istore          50
        //  1459: iload           49
        //  1461: istore          51
        //  1463: iload           50
        //  1465: iload           7
        //  1467: invokestatic    java/lang/Math.max:(II)I
        //  1470: istore          52
        //  1472: iload           16
        //  1474: ifeq            1573
        //  1477: iload           12
        //  1479: ldc             1073741824
        //  1481: if_icmpeq       1573
        //  1484: iconst_0       
        //  1485: istore          54
        //  1487: iload           54
        //  1489: iload           10
        //  1491: if_icmpge       1573
        //  1494: aload_0        
        //  1495: iload           54
        //  1497: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getVirtualChildAt:(I)Landroid/view/View;
        //  1500: astore          55
        //  1502: aload           55
        //  1504: ifnull          1563
        //  1507: aload           55
        //  1509: invokevirtual   android/view/View.getVisibility:()I
        //  1512: istore          58
        //  1514: iload           58
        //  1516: bipush          8
        //  1518: if_icmpne       1525
        //  1521: iload_3        
        //  1522: ifeq            1563
        //  1525: aload           55
        //  1527: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //  1530: checkcast       Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;
        //  1533: getfield        android/support/v7/widget/LinearLayoutCompat$LayoutParams.weight:F
        //  1536: fconst_0       
        //  1537: fcmpl          
        //  1538: ifle            1563
        //  1541: aload           55
        //  1543: aload           55
        //  1545: invokevirtual   android/view/View.getMeasuredWidth:()I
        //  1548: ldc             1073741824
        //  1550: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //  1553: iload           17
        //  1555: ldc             1073741824
        //  1557: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //  1560: invokevirtual   android/view/View.measure:(II)V
        //  1563: iload           54
        //  1565: iconst_1       
        //  1566: iadd           
        //  1567: istore          56
        //  1569: iload_3        
        //  1570: ifeq            1793
        //  1573: iload           52
        //  1575: istore          44
        //  1577: iload           51
        //  1579: istore          53
        //  1581: iload           42
        //  1583: istore          45
        //  1585: iload           53
        //  1587: istore          46
        //  1589: iload           46
        //  1591: ifne            1786
        //  1594: iload           11
        //  1596: ldc             1073741824
        //  1598: if_icmpeq       1786
        //  1601: iload           44
        //  1603: aload_0        
        //  1604: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getPaddingLeft:()I
        //  1607: aload_0        
        //  1608: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getPaddingRight:()I
        //  1611: iadd           
        //  1612: iadd           
        //  1613: aload_0        
        //  1614: invokevirtual   android/support/v7/widget/LinearLayoutCompat.getSuggestedMinimumWidth:()I
        //  1617: invokestatic    java/lang/Math.max:(II)I
        //  1620: istore          47
        //  1622: aload_0        
        //  1623: iload           47
        //  1625: iload_1        
        //  1626: iload           37
        //  1628: invokestatic    android/support/v4/view/ViewCompat.resolveSizeAndState:(III)I
        //  1631: iload           29
        //  1633: invokevirtual   android/support/v7/widget/LinearLayoutCompat.setMeasuredDimension:(II)V
        //  1636: iload           25
        //  1638: ifeq            1648
        //  1641: aload_0        
        //  1642: iload           10
        //  1644: iload_2        
        //  1645: invokespecial   android/support/v7/widget/LinearLayoutCompat.forceUniformWidth:(II)V
        //  1648: return         
        //  1649: astore          140
        //  1651: aload           140
        //  1653: athrow         
        //  1654: astore          138
        //  1656: aload           138
        //  1658: athrow         
        //  1659: iconst_0       
        //  1660: istore          123
        //  1662: goto            591
        //  1665: astore          124
        //  1667: aload           124
        //  1669: athrow         
        //  1670: astore          125
        //  1672: aload           125
        //  1674: athrow         
        //  1675: iload           119
        //  1677: istore          137
        //  1679: goto            614
        //  1682: iload           119
        //  1684: istore          118
        //  1686: goto            632
        //  1689: astore          26
        //  1691: aload           26
        //  1693: athrow         
        //  1694: astore          27
        //  1696: aload           27
        //  1698: athrow         
        //  1699: astore          95
        //  1701: aload           95
        //  1703: athrow         
        //  1704: astore          31
        //  1706: aload           31
        //  1708: athrow         
        //  1709: fload           20
        //  1711: fstore          32
        //  1713: goto            1010
        //  1716: astore          61
        //  1718: aload           61
        //  1720: athrow         
        //  1721: astore          87
        //  1723: aload           87
        //  1725: athrow         
        //  1726: astore          90
        //  1728: aload           90
        //  1730: athrow         
        //  1731: astore          91
        //  1733: aload           91
        //  1735: athrow         
        //  1736: iconst_0       
        //  1737: istore          83
        //  1739: goto            1217
        //  1742: astore          81
        //  1744: aload           81
        //  1746: athrow         
        //  1747: iconst_0       
        //  1748: istore          71
        //  1750: goto            1314
        //  1753: iload           69
        //  1755: istore          72
        //  1757: goto            1323
        //  1760: astore          79
        //  1762: aload           79
        //  1764: athrow         
        //  1765: iconst_0       
        //  1766: istore          74
        //  1768: goto            1353
        //  1771: astore          57
        //  1773: aload           57
        //  1775: athrow         
        //  1776: astore          59
        //  1778: aload           59
        //  1780: athrow         
        //  1781: astore          48
        //  1783: aload           48
        //  1785: athrow         
        //  1786: iload           45
        //  1788: istore          44
        //  1790: goto            1601
        //  1793: iload           56
        //  1795: istore          54
        //  1797: goto            1487
        //  1800: iload           40
        //  1802: istore          43
        //  1804: iload           41
        //  1806: istore          44
        //  1808: iload           42
        //  1810: istore          45
        //  1812: iload           43
        //  1814: istore          46
        //  1816: goto            1589
        //  1819: iload           78
        //  1821: istore          33
        //  1823: iload           40
        //  1825: istore          38
        //  1827: iload           41
        //  1829: istore          35
        //  1831: iload           42
        //  1833: istore          36
        //  1835: fload           77
        //  1837: fstore          34
        //  1839: iload           76
        //  1841: istore          39
        //  1843: goto            1042
        //  1846: fload           34
        //  1848: fstore          65
        //  1850: iload           39
        //  1852: istore          66
        //  1854: iload           37
        //  1856: istore          67
        //  1858: goto            1259
        //  1861: iload           39
        //  1863: istore          76
        //  1865: iload           38
        //  1867: istore          40
        //  1869: iload           35
        //  1871: istore          41
        //  1873: fload           34
        //  1875: fstore          77
        //  1877: iload           36
        //  1879: istore          42
        //  1881: goto            1419
        //  1884: iload           38
        //  1886: istore          40
        //  1888: iload           35
        //  1890: istore          41
        //  1892: iload           36
        //  1894: istore          42
        //  1896: goto            1429
        //  1899: iload           24
        //  1901: istore          51
        //  1903: iload           23
        //  1905: istore          50
        //  1907: iload           22
        //  1909: istore          42
        //  1911: iload           21
        //  1913: istore          37
        //  1915: goto            1463
        //  1918: iload           135
        //  1920: istore          17
        //  1922: iload           133
        //  1924: istore          8
        //  1926: iload           134
        //  1928: istore          7
        //  1930: iload           21
        //  1932: istore          5
        //  1934: iload           22
        //  1936: istore          4
        //  1938: iload           136
        //  1940: istore          18
        //  1942: fload           20
        //  1944: fstore          9
        //  1946: goto            71
        //  1949: iload           127
        //  1951: istore          131
        //  1953: iload           6
        //  1955: istore          130
        //  1957: goto            653
        //  1960: iload           7
        //  1962: istore          127
        //  1964: goto            627
        //  1967: iload           13
        //  1969: istore          116
        //  1971: iconst_0       
        //  1972: istore          117
        //  1974: goto            522
        //  1977: iload           107
        //  1979: istore          115
        //  1981: goto            398
        //  1984: iconst_1       
        //  1985: istore          115
        //  1987: goto            398
        //  1990: iload           14
        //  1992: istore          107
        //  1994: goto            252
        //  1997: iload           18
        //  1999: istore          132
        //  2001: fload           9
        //  2003: fstore          20
        //  2005: iload           8
        //  2007: istore          133
        //  2009: iload           5
        //  2011: istore          21
        //  2013: iload           4
        //  2015: istore          22
        //  2017: iload           17
        //  2019: istore          135
        //  2021: iload           7
        //  2023: istore          134
        //  2025: goto            702
        //  2028: iload           14
        //  2030: istore          19
        //  2032: fload           9
        //  2034: fstore          20
        //  2036: iload           5
        //  2038: istore          21
        //  2040: iload           4
        //  2042: istore          22
        //  2044: iload           6
        //  2046: istore          23
        //  2048: iload           8
        //  2050: istore          24
        //  2052: iload           13
        //  2054: istore          25
        //  2056: goto            736
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  91     106    455    460    Ljava/lang/RuntimeException;
        //  110    117    455    460    Ljava/lang/RuntimeException;
        //  145    167    460    465    Ljava/lang/RuntimeException;
        //  194    209    465    470    Ljava/lang/RuntimeException;
        //  257    272    470    475    Ljava/lang/RuntimeException;
        //  300    306    475    480    Ljava/lang/RuntimeException;
        //  306    319    486    491    Ljava/lang/RuntimeException;
        //  327    334    486    491    Ljava/lang/RuntimeException;
        //  412    420    491    496    Ljava/lang/RuntimeException;
        //  427    450    450    455    Ljava/lang/RuntimeException;
        //  503    510    1649   1654   Ljava/lang/RuntimeException;
        //  575    582    1654   1659   Ljava/lang/RuntimeException;
        //  591    598    1665   1675   Ljava/lang/RuntimeException;
        //  736    742    1689   1694   Ljava/lang/RuntimeException;
        //  747    769    1694   1699   Ljava/lang/RuntimeException;
        //  815    830    1699   1704   Ljava/lang/RuntimeException;
        //  834    841    1699   1704   Ljava/lang/RuntimeException;
        //  995    1010   1704   1709   Ljava/lang/RuntimeException;
        //  1057   1064   1716   1721   Ljava/lang/RuntimeException;
        //  1157   1164   1721   1726   Ljava/lang/RuntimeException;
        //  1194   1208   1726   1736   Ljava/lang/RuntimeException;
        //  1298   1305   1742   1747   Ljava/lang/RuntimeException;
        //  1337   1344   1760   1765   Ljava/lang/RuntimeException;
        //  1507   1514   1771   1776   Ljava/lang/RuntimeException;
        //  1541   1563   1776   1781   Ljava/lang/RuntimeException;
        //  1622   1636   1781   1786   Ljava/lang/RuntimeException;
        //  1641   1648   1781   1786   Ljava/lang/RuntimeException;
        //  1667   1670   1670   1675   Ljava/lang/RuntimeException;
        //  1691   1694   1694   1699   Ljava/lang/RuntimeException;
        //  1728   1731   1731   1736   Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 1017, Size: 1017
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
    
    protected void onDraw(final Canvas canvas) {
        while (true) {
            try {
                if (this.mDivider == null) {
                    return;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                Label_0036: {
                    if (this.mOrientation != 1) {
                        break Label_0036;
                    }
                    try {
                        this.drawDividersVertical(canvas);
                        if (LinearLayoutCompat.a) {
                            this.drawDividersHorizontal(canvas);
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
    }
    
    public void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        try {
            if (Build$VERSION.SDK_INT >= 14) {
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                accessibilityEvent.setClassName((CharSequence)LinearLayoutCompat.class.getName());
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
    }
    
    public void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        try {
            if (Build$VERSION.SDK_INT >= 14) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName((CharSequence)LinearLayoutCompat.class.getName());
            }
        }
        catch (RuntimeException ex) {
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
        //     1: getfield        android/support/v7/widget/LinearLayoutCompat.mOrientation:I
        //     4: istore          8
        //     6: iload           8
        //     8: iconst_1       
        //     9: if_icmpne       28
        //    12: aload_0        
        //    13: iload_2        
        //    14: iload_3        
        //    15: iload           4
        //    17: iload           5
        //    19: invokevirtual   android/support/v7/widget/LinearLayoutCompat.layoutVertical:(IIII)V
        //    22: getstatic       android/support/v7/widget/LinearLayoutCompat.a:Z
        //    25: ifeq            49
        //    28: aload_0        
        //    29: iload_2        
        //    30: iload_3        
        //    31: iload           4
        //    33: iload           5
        //    35: invokevirtual   android/support/v7/widget/LinearLayoutCompat.layoutHorizontal:(IIII)V
        //    38: return         
        //    39: astore          6
        //    41: aload           6
        //    43: athrow         
        //    44: astore          7
        //    46: aload           7
        //    48: athrow         
        //    49: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      6      39     44     Ljava/lang/RuntimeException;
        //  12     28     44     49     Ljava/lang/RuntimeException;
        //  28     38     44     49     Ljava/lang/RuntimeException;
        //  41     44     44     49     Ljava/lang/RuntimeException;
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
    
    protected void onMeasure(final int p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/widget/LinearLayoutCompat.mOrientation:I
        //     4: istore          5
        //     6: iload           5
        //     8: iconst_1       
        //     9: if_icmpne       24
        //    12: aload_0        
        //    13: iload_1        
        //    14: iload_2        
        //    15: invokevirtual   android/support/v7/widget/LinearLayoutCompat.measureVertical:(II)V
        //    18: getstatic       android/support/v7/widget/LinearLayoutCompat.a:Z
        //    21: ifeq            39
        //    24: aload_0        
        //    25: iload_1        
        //    26: iload_2        
        //    27: invokevirtual   android/support/v7/widget/LinearLayoutCompat.measureHorizontal:(II)V
        //    30: return         
        //    31: astore_3       
        //    32: aload_3        
        //    33: athrow         
        //    34: astore          4
        //    36: aload           4
        //    38: athrow         
        //    39: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      6      31     34     Ljava/lang/RuntimeException;
        //  12     24     34     39     Ljava/lang/RuntimeException;
        //  24     30     34     39     Ljava/lang/RuntimeException;
        //  32     34     34     39     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0024:
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
    
    public void setBaselineAligned(final boolean mBaselineAligned) {
        this.mBaselineAligned = mBaselineAligned;
    }
    
    public void setDividerDrawable(final Drawable p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/widget/LinearLayoutCompat.mDivider:Landroid/graphics/drawable/Drawable;
        //     4: astore_3       
        //     5: aload_1        
        //     6: aload_3        
        //     7: if_acmpne       14
        //    10: return         
        //    11: astore_2       
        //    12: aload_2        
        //    13: athrow         
        //    14: aload_0        
        //    15: aload_1        
        //    16: putfield        android/support/v7/widget/LinearLayoutCompat.mDivider:Landroid/graphics/drawable/Drawable;
        //    19: aload_1        
        //    20: ifnull          45
        //    23: aload_0        
        //    24: aload_1        
        //    25: invokevirtual   android/graphics/drawable/Drawable.getIntrinsicWidth:()I
        //    28: putfield        android/support/v7/widget/LinearLayoutCompat.mDividerWidth:I
        //    31: aload_0        
        //    32: aload_1        
        //    33: invokevirtual   android/graphics/drawable/Drawable.getIntrinsicHeight:()I
        //    36: putfield        android/support/v7/widget/LinearLayoutCompat.mDividerHeight:I
        //    39: getstatic       android/support/v7/widget/LinearLayoutCompat.a:Z
        //    42: ifeq            55
        //    45: aload_0        
        //    46: iconst_0       
        //    47: putfield        android/support/v7/widget/LinearLayoutCompat.mDividerWidth:I
        //    50: aload_0        
        //    51: iconst_0       
        //    52: putfield        android/support/v7/widget/LinearLayoutCompat.mDividerHeight:I
        //    55: iconst_0       
        //    56: istore          6
        //    58: aload_1        
        //    59: ifnonnull       65
        //    62: iconst_1       
        //    63: istore          6
        //    65: aload_0        
        //    66: iload           6
        //    68: invokevirtual   android/support/v7/widget/LinearLayoutCompat.setWillNotDraw:(Z)V
        //    71: aload_0        
        //    72: invokevirtual   android/support/v7/widget/LinearLayoutCompat.requestLayout:()V
        //    75: return         
        //    76: astore          4
        //    78: aload           4
        //    80: athrow         
        //    81: astore          5
        //    83: aload           5
        //    85: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      5      11     14     Ljava/lang/RuntimeException;
        //  14     19     76     81     Ljava/lang/RuntimeException;
        //  23     45     81     86     Ljava/lang/RuntimeException;
        //  45     55     81     86     Ljava/lang/RuntimeException;
        //  78     81     81     86     Ljava/lang/RuntimeException;
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
    
    public void setGravity(final int n) {
        while (true) {
            while (true) {
                Label_0054: {
                    try {
                        if (this.mGravity != n) {
                            if ((0x800007 & n) != 0x0) {
                                break Label_0054;
                            }
                            int mGravity = 0x800003 | n;
                            if ((mGravity & 0x70) == 0x0) {
                                mGravity |= 0x30;
                            }
                            this.mGravity = mGravity;
                            this.requestLayout();
                        }
                        return;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                }
                int mGravity = n;
                continue;
            }
        }
    }
    
    public void setMeasureWithLargestChildEnabled(final boolean mUseLargestChild) {
        this.mUseLargestChild = mUseLargestChild;
    }
    
    public void setOrientation(final int mOrientation) {
        try {
            if (this.mOrientation != mOrientation) {
                this.mOrientation = mOrientation;
                this.requestLayout();
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
    }
    
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
