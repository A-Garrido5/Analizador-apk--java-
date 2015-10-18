// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.view.accessibility.AccessibilityEvent;
import android.support.v7.view.ActionMode;
import android.view.ViewGroup$LayoutParams;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.view.animation.Interpolator;
import android.view.animation.DecelerateInterpolator;
import android.support.v4.view.ViewCompat;
import android.view.ViewGroup$MarginLayoutParams;
import android.support.v7.appcompat.R$layout;
import android.support.v7.appcompat.R$styleable;
import android.support.v7.appcompat.R$attr;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.view.ViewPropertyAnimatorCompatSet;
import android.view.View;
import android.support.v4.view.ViewPropertyAnimatorListener;

public class ActionBarContextView extends AbsActionBarView implements ViewPropertyAnimatorListener
{
    private static final String[] z;
    private boolean mAnimateInOnLayout;
    private int mAnimationMode;
    private View mClose;
    private int mCloseItemLayout;
    private ViewPropertyAnimatorCompatSet mCurrentAnimation;
    private View mCustomView;
    private Drawable mSplitBackground;
    private CharSequence mSubtitle;
    private int mSubtitleStyleRes;
    private TextView mSubtitleView;
    private CharSequence mTitle;
    private LinearLayout mTitleLayout;
    private boolean mTitleOptional;
    private int mTitleStyleRes;
    private TextView mTitleView;
    
    static {
        final String[] z2 = new String[4];
        String s = "e:\f&l*7\u00011l'<M=? =M";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'L';
                        break;
                    }
                    case 0: {
                        c2 = 'E';
                        break;
                    }
                    case 1: {
                        c2 = 'Y';
                        break;
                    }
                    case 2: {
                        c2 = 'm';
                        break;
                    }
                    case 3: {
                        c2 = 'H';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "20\u0019 l$7\t:#,=W$-<6\u0018<\u0013-<\u0004/$1dO?>$)2+#+-\b&8g";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "20\u0019 l$7\t:#,=W$-<6\u0018<\u001320\t<$x{\u0000)8&128-7<\u0003<neq\u0002:l#0\u0001$\u001358\u001f-\"1p";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "e:\f&l*7\u00011l'<M=? =M";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public ActionBarContextView(final Context context) {
        this(context, null);
    }
    
    public ActionBarContextView(final Context context, final AttributeSet set) {
        this(context, set, R$attr.actionModeStyle);
    }
    
    public ActionBarContextView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, set, R$styleable.ActionMode, n, 0);
        this.setBackgroundDrawable(obtainStyledAttributes.getDrawable(R$styleable.ActionMode_background));
        this.mTitleStyleRes = obtainStyledAttributes.getResourceId(R$styleable.ActionMode_titleTextStyle, 0);
        this.mSubtitleStyleRes = obtainStyledAttributes.getResourceId(R$styleable.ActionMode_subtitleTextStyle, 0);
        this.mContentHeight = obtainStyledAttributes.getLayoutDimension(R$styleable.ActionMode_height, 0);
        this.mSplitBackground = obtainStyledAttributes.getDrawable(R$styleable.ActionMode_backgroundSplit);
        this.mCloseItemLayout = obtainStyledAttributes.getResourceId(R$styleable.ActionMode_closeItemLayout, R$layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }
    
    private void finishAnimation() {
        final ViewPropertyAnimatorCompatSet mCurrentAnimation = this.mCurrentAnimation;
        if (mCurrentAnimation == null) {
            return;
        }
        try {
            this.mCurrentAnimation = null;
            mCurrentAnimation.cancel();
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    private void initTitle() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_1       
        //     2: aload_0        
        //     3: getfield        android/support/v7/internal/widget/ActionBarContextView.mTitleLayout:Landroid/widget/LinearLayout;
        //     6: ifnonnull       123
        //     9: aload_0        
        //    10: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.getContext:()Landroid/content/Context;
        //    13: invokestatic    android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
        //    16: astore          15
        //    18: aload           15
        //    20: getstatic       android/support/v7/appcompat/R$layout.abc_action_bar_title_item:I
        //    23: aload_0        
        //    24: invokevirtual   android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;)Landroid/view/View;
        //    27: pop            
        //    28: aload_0        
        //    29: aload_0        
        //    30: iconst_m1      
        //    31: aload_0        
        //    32: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.getChildCount:()I
        //    35: iadd           
        //    36: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.getChildAt:(I)Landroid/view/View;
        //    39: checkcast       Landroid/widget/LinearLayout;
        //    42: putfield        android/support/v7/internal/widget/ActionBarContextView.mTitleLayout:Landroid/widget/LinearLayout;
        //    45: aload_0        
        //    46: aload_0        
        //    47: getfield        android/support/v7/internal/widget/ActionBarContextView.mTitleLayout:Landroid/widget/LinearLayout;
        //    50: getstatic       android/support/v7/appcompat/R$id.action_bar_title:I
        //    53: invokevirtual   android/widget/LinearLayout.findViewById:(I)Landroid/view/View;
        //    56: checkcast       Landroid/widget/TextView;
        //    59: putfield        android/support/v7/internal/widget/ActionBarContextView.mTitleView:Landroid/widget/TextView;
        //    62: aload_0        
        //    63: aload_0        
        //    64: getfield        android/support/v7/internal/widget/ActionBarContextView.mTitleLayout:Landroid/widget/LinearLayout;
        //    67: getstatic       android/support/v7/appcompat/R$id.action_bar_subtitle:I
        //    70: invokevirtual   android/widget/LinearLayout.findViewById:(I)Landroid/view/View;
        //    73: checkcast       Landroid/widget/TextView;
        //    76: putfield        android/support/v7/internal/widget/ActionBarContextView.mSubtitleView:Landroid/widget/TextView;
        //    79: aload_0        
        //    80: getfield        android/support/v7/internal/widget/ActionBarContextView.mTitleStyleRes:I
        //    83: ifeq            101
        //    86: aload_0        
        //    87: getfield        android/support/v7/internal/widget/ActionBarContextView.mTitleView:Landroid/widget/TextView;
        //    90: aload_0        
        //    91: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.getContext:()Landroid/content/Context;
        //    94: aload_0        
        //    95: getfield        android/support/v7/internal/widget/ActionBarContextView.mTitleStyleRes:I
        //    98: invokevirtual   android/widget/TextView.setTextAppearance:(Landroid/content/Context;I)V
        //   101: aload_0        
        //   102: getfield        android/support/v7/internal/widget/ActionBarContextView.mSubtitleStyleRes:I
        //   105: ifeq            123
        //   108: aload_0        
        //   109: getfield        android/support/v7/internal/widget/ActionBarContextView.mSubtitleView:Landroid/widget/TextView;
        //   112: aload_0        
        //   113: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.getContext:()Landroid/content/Context;
        //   116: aload_0        
        //   117: getfield        android/support/v7/internal/widget/ActionBarContextView.mSubtitleStyleRes:I
        //   120: invokevirtual   android/widget/TextView.setTextAppearance:(Landroid/content/Context;I)V
        //   123: aload_0        
        //   124: getfield        android/support/v7/internal/widget/ActionBarContextView.mTitleView:Landroid/widget/TextView;
        //   127: aload_0        
        //   128: getfield        android/support/v7/internal/widget/ActionBarContextView.mTitle:Ljava/lang/CharSequence;
        //   131: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   134: aload_0        
        //   135: getfield        android/support/v7/internal/widget/ActionBarContextView.mSubtitleView:Landroid/widget/TextView;
        //   138: aload_0        
        //   139: getfield        android/support/v7/internal/widget/ActionBarContextView.mSubtitle:Ljava/lang/CharSequence;
        //   142: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   145: aload_0        
        //   146: getfield        android/support/v7/internal/widget/ActionBarContextView.mTitle:Ljava/lang/CharSequence;
        //   149: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   152: istore_3       
        //   153: iload_3        
        //   154: ifne            254
        //   157: iload_1        
        //   158: istore          4
        //   160: aload_0        
        //   161: getfield        android/support/v7/internal/widget/ActionBarContextView.mSubtitle:Ljava/lang/CharSequence;
        //   164: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   167: istore          6
        //   169: iload           6
        //   171: ifne            265
        //   174: aload_0        
        //   175: getfield        android/support/v7/internal/widget/ActionBarContextView.mSubtitleView:Landroid/widget/TextView;
        //   178: astore          8
        //   180: iload_1        
        //   181: ifeq            275
        //   184: iconst_0       
        //   185: istore          9
        //   187: aload           8
        //   189: iload           9
        //   191: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   194: aload_0        
        //   195: getfield        android/support/v7/internal/widget/ActionBarContextView.mTitleLayout:Landroid/widget/LinearLayout;
        //   198: astore          12
        //   200: iconst_0       
        //   201: istore          13
        //   203: iload           4
        //   205: ifne            215
        //   208: iconst_0       
        //   209: istore          13
        //   211: iload_1        
        //   212: ifeq            292
        //   215: aload           12
        //   217: iload           13
        //   219: invokevirtual   android/widget/LinearLayout.setVisibility:(I)V
        //   222: aload_0        
        //   223: getfield        android/support/v7/internal/widget/ActionBarContextView.mTitleLayout:Landroid/widget/LinearLayout;
        //   226: invokevirtual   android/widget/LinearLayout.getParent:()Landroid/view/ViewParent;
        //   229: ifnonnull       240
        //   232: aload_0        
        //   233: aload_0        
        //   234: getfield        android/support/v7/internal/widget/ActionBarContextView.mTitleLayout:Landroid/widget/LinearLayout;
        //   237: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.addView:(Landroid/view/View;)V
        //   240: return         
        //   241: astore          16
        //   243: aload           16
        //   245: athrow         
        //   246: astore          18
        //   248: aload           18
        //   250: athrow         
        //   251: astore_2       
        //   252: aload_2        
        //   253: athrow         
        //   254: iconst_0       
        //   255: istore          4
        //   257: goto            160
        //   260: astore          5
        //   262: aload           5
        //   264: athrow         
        //   265: iconst_0       
        //   266: istore_1       
        //   267: goto            174
        //   270: astore          7
        //   272: aload           7
        //   274: athrow         
        //   275: bipush          8
        //   277: istore          9
        //   279: goto            187
        //   282: astore          10
        //   284: aload           10
        //   286: athrow         
        //   287: astore          11
        //   289: aload           11
        //   291: athrow         
        //   292: bipush          8
        //   294: istore          13
        //   296: goto            215
        //   299: astore          14
        //   301: aload           14
        //   303: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  18     101    241    246    Ljava/lang/IllegalStateException;
        //  101    123    246    251    Ljava/lang/IllegalStateException;
        //  123    153    251    254    Ljava/lang/IllegalStateException;
        //  160    169    260    265    Ljava/lang/IllegalStateException;
        //  174    180    270    275    Ljava/lang/IllegalStateException;
        //  187    200    282    292    Ljava/lang/IllegalStateException;
        //  215    240    299    304    Ljava/lang/IllegalStateException;
        //  284    287    287    292    Ljava/lang/IllegalStateException;
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
    
    private ViewPropertyAnimatorCompatSet makeInAnimation() {
        final int a = AdapterViewCompat.a;
        ViewCompat.setTranslationX(this.mClose, -this.mClose.getWidth() - ((ViewGroup$MarginLayoutParams)this.mClose.getLayoutParams()).leftMargin);
        final ViewPropertyAnimatorCompat translationX = ViewCompat.animate(this.mClose).translationX(0.0f);
        translationX.setDuration(200L);
        translationX.setListener(this);
        translationX.setInterpolator((Interpolator)new DecelerateInterpolator());
        final ViewPropertyAnimatorCompatSet set = new ViewPropertyAnimatorCompatSet();
        set.play(translationX);
        if (this.mMenuView != null) {
            final int childCount = this.mMenuView.getChildCount();
            if (childCount > 0) {
                int i = childCount - 1;
                int n = 0;
                while (i >= 0) {
                    final View child = this.mMenuView.getChildAt(i);
                    ViewCompat.setScaleY(child, 0.0f);
                    final ViewPropertyAnimatorCompat scaleY = ViewCompat.animate(child).scaleY(1.0f);
                    scaleY.setDuration(300L);
                    set.play(scaleY);
                    --i;
                    ++n;
                    if (a != 0) {
                        break;
                    }
                }
            }
        }
        return set;
    }
    
    private ViewPropertyAnimatorCompatSet makeOutAnimation() {
        final int a = AdapterViewCompat.a;
        final ViewPropertyAnimatorCompat translationX = ViewCompat.animate(this.mClose).translationX(-this.mClose.getWidth() - ((ViewGroup$MarginLayoutParams)this.mClose.getLayoutParams()).leftMargin);
        translationX.setDuration(200L);
        translationX.setListener(this);
        translationX.setInterpolator((Interpolator)new DecelerateInterpolator());
        final ViewPropertyAnimatorCompatSet set = new ViewPropertyAnimatorCompatSet();
        set.play(translationX);
        if (this.mMenuView == null || this.mMenuView.getChildCount() > 0) {}
        return set;
    }
    
    @Override
    public void animateToVisibility(final int n) {
        super.animateToVisibility(n);
    }
    
    public void closeMode() {
        try {
            if (this.mAnimationMode == 2) {
                return;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            if (this.mClose == null) {
                this.killMode();
                return;
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
        this.finishAnimation();
        this.mAnimationMode = 2;
        (this.mCurrentAnimation = this.makeOutAnimation()).start();
    }
    
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new ViewGroup$MarginLayoutParams(-1, -2);
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new ViewGroup$MarginLayoutParams(this.getContext(), set);
    }
    
    public CharSequence getSubtitle() {
        return this.mSubtitle;
    }
    
    public CharSequence getTitle() {
        return this.mTitle;
    }
    
    public void initForMode(final ActionMode p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/internal/widget/AdapterViewCompat.a:I
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        android/support/v7/internal/widget/ActionBarContextView.mClose:Landroid/view/View;
        //     8: ifnonnull       47
        //    11: aload_0        
        //    12: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.getContext:()Landroid/content/Context;
        //    15: invokestatic    android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
        //    18: astore          11
        //    20: aload_0        
        //    21: aload           11
        //    23: aload_0        
        //    24: getfield        android/support/v7/internal/widget/ActionBarContextView.mCloseItemLayout:I
        //    27: aload_0        
        //    28: iconst_0       
        //    29: invokevirtual   android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //    32: putfield        android/support/v7/internal/widget/ActionBarContextView.mClose:Landroid/view/View;
        //    35: aload_0        
        //    36: aload_0        
        //    37: getfield        android/support/v7/internal/widget/ActionBarContextView.mClose:Landroid/view/View;
        //    40: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.addView:(Landroid/view/View;)V
        //    43: iload_2        
        //    44: ifeq            65
        //    47: aload_0        
        //    48: getfield        android/support/v7/internal/widget/ActionBarContextView.mClose:Landroid/view/View;
        //    51: invokevirtual   android/view/View.getParent:()Landroid/view/ViewParent;
        //    54: ifnonnull       65
        //    57: aload_0        
        //    58: aload_0        
        //    59: getfield        android/support/v7/internal/widget/ActionBarContextView.mClose:Landroid/view/View;
        //    62: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.addView:(Landroid/view/View;)V
        //    65: aload_0        
        //    66: getfield        android/support/v7/internal/widget/ActionBarContextView.mClose:Landroid/view/View;
        //    69: getstatic       android/support/v7/appcompat/R$id.action_mode_close_button:I
        //    72: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    75: new             Landroid/support/v7/internal/widget/ActionBarContextView$1;
        //    78: dup            
        //    79: aload_0        
        //    80: aload_1        
        //    81: invokespecial   android/support/v7/internal/widget/ActionBarContextView$1.<init>:(Landroid/support/v7/internal/widget/ActionBarContextView;Landroid/support/v7/view/ActionMode;)V
        //    84: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    87: aload_1        
        //    88: invokevirtual   android/support/v7/view/ActionMode.getMenu:()Landroid/view/Menu;
        //    91: checkcast       Landroid/support/v7/internal/view/menu/MenuBuilder;
        //    94: astore          4
        //    96: aload_0        
        //    97: getfield        android/support/v7/internal/widget/ActionBarContextView.mActionMenuPresenter:Landroid/support/v7/widget/ActionMenuPresenter;
        //   100: ifnull          111
        //   103: aload_0        
        //   104: getfield        android/support/v7/internal/widget/ActionBarContextView.mActionMenuPresenter:Landroid/support/v7/widget/ActionMenuPresenter;
        //   107: invokevirtual   android/support/v7/widget/ActionMenuPresenter.dismissPopupMenus:()Z
        //   110: pop            
        //   111: aload_0        
        //   112: new             Landroid/support/v7/widget/ActionMenuPresenter;
        //   115: dup            
        //   116: aload_0        
        //   117: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.getContext:()Landroid/content/Context;
        //   120: invokespecial   android/support/v7/widget/ActionMenuPresenter.<init>:(Landroid/content/Context;)V
        //   123: putfield        android/support/v7/internal/widget/ActionBarContextView.mActionMenuPresenter:Landroid/support/v7/widget/ActionMenuPresenter;
        //   126: aload_0        
        //   127: getfield        android/support/v7/internal/widget/ActionBarContextView.mActionMenuPresenter:Landroid/support/v7/widget/ActionMenuPresenter;
        //   130: iconst_1       
        //   131: invokevirtual   android/support/v7/widget/ActionMenuPresenter.setReserveOverflow:(Z)V
        //   134: new             Landroid/view/ViewGroup$LayoutParams;
        //   137: dup            
        //   138: bipush          -2
        //   140: iconst_m1      
        //   141: invokespecial   android/view/ViewGroup$LayoutParams.<init>:(II)V
        //   144: astore          6
        //   146: aload_0        
        //   147: getfield        android/support/v7/internal/widget/ActionBarContextView.mSplitActionBar:Z
        //   150: istore          9
        //   152: iload           9
        //   154: ifne            207
        //   157: aload           4
        //   159: aload_0        
        //   160: getfield        android/support/v7/internal/widget/ActionBarContextView.mActionMenuPresenter:Landroid/support/v7/widget/ActionMenuPresenter;
        //   163: aload_0        
        //   164: getfield        android/support/v7/internal/widget/ActionBarContextView.mPopupContext:Landroid/content/Context;
        //   167: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.addMenuPresenter:(Landroid/support/v7/internal/view/menu/MenuPresenter;Landroid/content/Context;)V
        //   170: aload_0        
        //   171: aload_0        
        //   172: getfield        android/support/v7/internal/widget/ActionBarContextView.mActionMenuPresenter:Landroid/support/v7/widget/ActionMenuPresenter;
        //   175: aload_0        
        //   176: invokevirtual   android/support/v7/widget/ActionMenuPresenter.getMenuView:(Landroid/view/ViewGroup;)Landroid/support/v7/internal/view/menu/MenuView;
        //   179: checkcast       Landroid/support/v7/widget/ActionMenuView;
        //   182: putfield        android/support/v7/internal/widget/ActionBarContextView.mMenuView:Landroid/support/v7/widget/ActionMenuView;
        //   185: aload_0        
        //   186: getfield        android/support/v7/internal/widget/ActionBarContextView.mMenuView:Landroid/support/v7/widget/ActionMenuView;
        //   189: aconst_null    
        //   190: invokevirtual   android/support/v7/widget/ActionMenuView.setBackgroundDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   193: aload_0        
        //   194: aload_0        
        //   195: getfield        android/support/v7/internal/widget/ActionBarContextView.mMenuView:Landroid/support/v7/widget/ActionMenuView;
        //   198: aload           6
        //   200: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.addView:(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
        //   203: iload_2        
        //   204: ifeq            305
        //   207: aload_0        
        //   208: getfield        android/support/v7/internal/widget/ActionBarContextView.mActionMenuPresenter:Landroid/support/v7/widget/ActionMenuPresenter;
        //   211: aload_0        
        //   212: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.getContext:()Landroid/content/Context;
        //   215: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   218: invokevirtual   android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
        //   221: getfield        android/util/DisplayMetrics.widthPixels:I
        //   224: iconst_1       
        //   225: invokevirtual   android/support/v7/widget/ActionMenuPresenter.setWidthLimit:(IZ)V
        //   228: aload_0        
        //   229: getfield        android/support/v7/internal/widget/ActionBarContextView.mActionMenuPresenter:Landroid/support/v7/widget/ActionMenuPresenter;
        //   232: ldc_w           2147483647
        //   235: invokevirtual   android/support/v7/widget/ActionMenuPresenter.setItemLimit:(I)V
        //   238: aload           6
        //   240: iconst_m1      
        //   241: putfield        android/view/ViewGroup$LayoutParams.width:I
        //   244: aload           6
        //   246: aload_0        
        //   247: getfield        android/support/v7/internal/widget/ActionBarContextView.mContentHeight:I
        //   250: putfield        android/view/ViewGroup$LayoutParams.height:I
        //   253: aload           4
        //   255: aload_0        
        //   256: getfield        android/support/v7/internal/widget/ActionBarContextView.mActionMenuPresenter:Landroid/support/v7/widget/ActionMenuPresenter;
        //   259: aload_0        
        //   260: getfield        android/support/v7/internal/widget/ActionBarContextView.mPopupContext:Landroid/content/Context;
        //   263: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.addMenuPresenter:(Landroid/support/v7/internal/view/menu/MenuPresenter;Landroid/content/Context;)V
        //   266: aload_0        
        //   267: aload_0        
        //   268: getfield        android/support/v7/internal/widget/ActionBarContextView.mActionMenuPresenter:Landroid/support/v7/widget/ActionMenuPresenter;
        //   271: aload_0        
        //   272: invokevirtual   android/support/v7/widget/ActionMenuPresenter.getMenuView:(Landroid/view/ViewGroup;)Landroid/support/v7/internal/view/menu/MenuView;
        //   275: checkcast       Landroid/support/v7/widget/ActionMenuView;
        //   278: putfield        android/support/v7/internal/widget/ActionBarContextView.mMenuView:Landroid/support/v7/widget/ActionMenuView;
        //   281: aload_0        
        //   282: getfield        android/support/v7/internal/widget/ActionBarContextView.mMenuView:Landroid/support/v7/widget/ActionMenuView;
        //   285: aload_0        
        //   286: getfield        android/support/v7/internal/widget/ActionBarContextView.mSplitBackground:Landroid/graphics/drawable/Drawable;
        //   289: invokevirtual   android/support/v7/widget/ActionMenuView.setBackgroundDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   292: aload_0        
        //   293: getfield        android/support/v7/internal/widget/ActionBarContextView.mSplitView:Landroid/view/ViewGroup;
        //   296: aload_0        
        //   297: getfield        android/support/v7/internal/widget/ActionBarContextView.mMenuView:Landroid/support/v7/widget/ActionMenuView;
        //   300: aload           6
        //   302: invokevirtual   android/view/ViewGroup.addView:(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
        //   305: aload_0        
        //   306: iconst_1       
        //   307: putfield        android/support/v7/internal/widget/ActionBarContextView.mAnimateInOnLayout:Z
        //   310: return         
        //   311: astore          12
        //   313: aload           12
        //   315: athrow         
        //   316: astore_3       
        //   317: aload_3        
        //   318: athrow         
        //   319: astore          5
        //   321: aload           5
        //   323: athrow         
        //   324: astore          7
        //   326: aload           7
        //   328: athrow         
        //   329: astore          8
        //   331: aload           8
        //   333: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  20     43     311    316    Ljava/lang/IllegalStateException;
        //  47     65     316    319    Ljava/lang/IllegalStateException;
        //  96     111    319    324    Ljava/lang/IllegalStateException;
        //  146    152    324    329    Ljava/lang/IllegalStateException;
        //  157    203    329    334    Ljava/lang/IllegalStateException;
        //  207    305    329    334    Ljava/lang/IllegalStateException;
        //  313    316    316    319    Ljava/lang/IllegalStateException;
        //  326    329    329    334    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 161, Size: 161
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
    
    public boolean isTitleOptional() {
        return this.mTitleOptional;
    }
    
    public void killMode() {
        try {
            this.finishAnimation();
            this.removeAllViews();
            if (this.mSplitView != null) {
                this.mSplitView.removeView((View)this.mMenuView);
            }
            this.mCustomView = null;
            this.mMenuView = null;
            this.mAnimateInOnLayout = false;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    @Override
    public void onAnimationCancel(final View view) {
    }
    
    @Override
    public void onAnimationEnd(final View view) {
        try {
            if (this.mAnimationMode == 2) {
                this.killMode();
            }
            this.mAnimationMode = 0;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    @Override
    public void onAnimationStart(final View view) {
    }
    
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
            if (this.mActionMenuPresenter != null) {
                this.mActionMenuPresenter.hideOverflowMenu();
                this.mActionMenuPresenter.hideSubMenus();
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public void onInitializeAccessibilityEvent(final AccessibilityEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/os/Build$VERSION.SDK_INT:I
        //     3: istore          5
        //     5: iload           5
        //     7: bipush          14
        //     9: if_icmplt       71
        //    12: aload_1        
        //    13: invokevirtual   android/view/accessibility/AccessibilityEvent.getEventType:()I
        //    16: istore          6
        //    18: iload           6
        //    20: bipush          32
        //    22: if_icmpne       66
        //    25: aload_1        
        //    26: aload_0        
        //    27: invokevirtual   android/view/accessibility/AccessibilityEvent.setSource:(Landroid/view/View;)V
        //    30: aload_1        
        //    31: aload_0        
        //    32: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    35: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //    38: invokevirtual   android/view/accessibility/AccessibilityEvent.setClassName:(Ljava/lang/CharSequence;)V
        //    41: aload_1        
        //    42: aload_0        
        //    43: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.getContext:()Landroid/content/Context;
        //    46: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    49: invokevirtual   android/view/accessibility/AccessibilityEvent.setPackageName:(Ljava/lang/CharSequence;)V
        //    52: aload_1        
        //    53: aload_0        
        //    54: getfield        android/support/v7/internal/widget/ActionBarContextView.mTitle:Ljava/lang/CharSequence;
        //    57: invokevirtual   android/view/accessibility/AccessibilityEvent.setContentDescription:(Ljava/lang/CharSequence;)V
        //    60: getstatic       android/support/v7/internal/widget/AdapterViewCompat.a:I
        //    63: ifeq            71
        //    66: aload_0        
        //    67: aload_1        
        //    68: invokespecial   android/support/v7/internal/widget/AbsActionBarView.onInitializeAccessibilityEvent:(Landroid/view/accessibility/AccessibilityEvent;)V
        //    71: return         
        //    72: astore_2       
        //    73: aload_2        
        //    74: athrow         
        //    75: astore_3       
        //    76: aload_3        
        //    77: athrow         
        //    78: astore          4
        //    80: aload           4
        //    82: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      5      72     75     Ljava/lang/IllegalStateException;
        //  12     18     75     78     Ljava/lang/IllegalStateException;
        //  25     66     78     83     Ljava/lang/IllegalStateException;
        //  66     71     78     83     Ljava/lang/IllegalStateException;
        //  73     75     75     78     Ljava/lang/IllegalStateException;
        //  76     78     78     83     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 43, Size: 43
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
        //     1: invokestatic    android/support/v7/internal/widget/ViewUtils.isLayoutRtl:(Landroid/view/View;)Z
        //     4: istore          6
        //     6: iload           6
        //     8: ifeq            336
        //    11: iload           4
        //    13: iload_2        
        //    14: isub           
        //    15: istore          35
        //    17: aload_0        
        //    18: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.getPaddingRight:()I
        //    21: istore          37
        //    23: iload           35
        //    25: iload           37
        //    27: isub           
        //    28: istore          7
        //    30: aload_0        
        //    31: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.getPaddingTop:()I
        //    34: istore          8
        //    36: iload           5
        //    38: iload_3        
        //    39: isub           
        //    40: aload_0        
        //    41: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.getPaddingTop:()I
        //    44: isub           
        //    45: aload_0        
        //    46: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.getPaddingBottom:()I
        //    49: isub           
        //    50: istore          9
        //    52: aload_0        
        //    53: getfield        android/support/v7/internal/widget/ActionBarContextView.mClose:Landroid/view/View;
        //    56: ifnull          430
        //    59: aload_0        
        //    60: getfield        android/support/v7/internal/widget/ActionBarContextView.mClose:Landroid/view/View;
        //    63: invokevirtual   android/view/View.getVisibility:()I
        //    66: istore          26
        //    68: iload           26
        //    70: bipush          8
        //    72: if_icmpeq       430
        //    75: aload_0        
        //    76: getfield        android/support/v7/internal/widget/ActionBarContextView.mClose:Landroid/view/View;
        //    79: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //    82: checkcast       Landroid/view/ViewGroup$MarginLayoutParams;
        //    85: astore          27
        //    87: iload           6
        //    89: ifeq            355
        //    92: aload           27
        //    94: getfield        android/view/ViewGroup$MarginLayoutParams.rightMargin:I
        //    97: istore          28
        //    99: iload           6
        //   101: ifeq            370
        //   104: aload           27
        //   106: getfield        android/view/ViewGroup$MarginLayoutParams.leftMargin:I
        //   109: istore          33
        //   111: iload           33
        //   113: istore          29
        //   115: iload           7
        //   117: iload           28
        //   119: iload           6
        //   121: invokestatic    android/support/v7/internal/widget/ActionBarContextView.next:(IIZ)I
        //   124: istore          30
        //   126: iload           30
        //   128: aload_0        
        //   129: aload_0        
        //   130: getfield        android/support/v7/internal/widget/ActionBarContextView.mClose:Landroid/view/View;
        //   133: iload           30
        //   135: iload           8
        //   137: iload           9
        //   139: iload           6
        //   141: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.positionChild:(Landroid/view/View;IIIZ)I
        //   144: iadd           
        //   145: iload           29
        //   147: iload           6
        //   149: invokestatic    android/support/v7/internal/widget/ActionBarContextView.next:(IIZ)I
        //   152: istore          7
        //   154: aload_0        
        //   155: getfield        android/support/v7/internal/widget/ActionBarContextView.mAnimateInOnLayout:Z
        //   158: ifeq            430
        //   161: aload_0        
        //   162: iconst_1       
        //   163: putfield        android/support/v7/internal/widget/ActionBarContextView.mAnimationMode:I
        //   166: aload_0        
        //   167: aload_0        
        //   168: invokespecial   android/support/v7/internal/widget/ActionBarContextView.makeInAnimation:()Landroid/support/v7/internal/view/ViewPropertyAnimatorCompatSet;
        //   171: putfield        android/support/v7/internal/widget/ActionBarContextView.mCurrentAnimation:Landroid/support/v7/internal/view/ViewPropertyAnimatorCompatSet;
        //   174: aload_0        
        //   175: getfield        android/support/v7/internal/widget/ActionBarContextView.mCurrentAnimation:Landroid/support/v7/internal/view/ViewPropertyAnimatorCompatSet;
        //   178: invokevirtual   android/support/v7/internal/view/ViewPropertyAnimatorCompatSet.start:()V
        //   181: aload_0        
        //   182: iconst_0       
        //   183: putfield        android/support/v7/internal/widget/ActionBarContextView.mAnimateInOnLayout:Z
        //   186: iload           7
        //   188: istore          11
        //   190: aload_0        
        //   191: getfield        android/support/v7/internal/widget/ActionBarContextView.mTitleLayout:Landroid/widget/LinearLayout;
        //   194: astore          14
        //   196: aload           14
        //   198: ifnull          245
        //   201: aload_0        
        //   202: getfield        android/support/v7/internal/widget/ActionBarContextView.mCustomView:Landroid/view/View;
        //   205: ifnonnull       245
        //   208: aload_0        
        //   209: getfield        android/support/v7/internal/widget/ActionBarContextView.mTitleLayout:Landroid/widget/LinearLayout;
        //   212: invokevirtual   android/widget/LinearLayout.getVisibility:()I
        //   215: istore          25
        //   217: iload           25
        //   219: bipush          8
        //   221: if_icmpeq       245
        //   224: iload           11
        //   226: aload_0        
        //   227: aload_0        
        //   228: getfield        android/support/v7/internal/widget/ActionBarContextView.mTitleLayout:Landroid/widget/LinearLayout;
        //   231: iload           11
        //   233: iload           8
        //   235: iload           9
        //   237: iload           6
        //   239: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.positionChild:(Landroid/view/View;IIIZ)I
        //   242: iadd           
        //   243: istore          11
        //   245: aload_0        
        //   246: getfield        android/support/v7/internal/widget/ActionBarContextView.mCustomView:Landroid/view/View;
        //   249: ifnull          272
        //   252: iload           11
        //   254: aload_0        
        //   255: aload_0        
        //   256: getfield        android/support/v7/internal/widget/ActionBarContextView.mCustomView:Landroid/view/View;
        //   259: iload           11
        //   261: iload           8
        //   263: iload           9
        //   265: iload           6
        //   267: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.positionChild:(Landroid/view/View;IIIZ)I
        //   270: iadd           
        //   271: pop            
        //   272: iload           6
        //   274: ifeq            400
        //   277: aload_0        
        //   278: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.getPaddingLeft:()I
        //   281: istore          23
        //   283: iload           23
        //   285: istore          15
        //   287: aload_0        
        //   288: getfield        android/support/v7/internal/widget/ActionBarContextView.mMenuView:Landroid/support/v7/widget/ActionMenuView;
        //   291: astore          18
        //   293: aload           18
        //   295: ifnull          330
        //   298: aload_0        
        //   299: getfield        android/support/v7/internal/widget/ActionBarContextView.mMenuView:Landroid/support/v7/widget/ActionMenuView;
        //   302: astore          19
        //   304: iload           6
        //   306: ifne            424
        //   309: iconst_1       
        //   310: istore          20
        //   312: iload           15
        //   314: aload_0        
        //   315: aload           19
        //   317: iload           15
        //   319: iload           8
        //   321: iload           9
        //   323: iload           20
        //   325: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.positionChild:(Landroid/view/View;IIIZ)I
        //   328: iadd           
        //   329: pop            
        //   330: return         
        //   331: astore          36
        //   333: aload           36
        //   335: athrow         
        //   336: aload_0        
        //   337: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.getPaddingLeft:()I
        //   340: istore          7
        //   342: goto            30
        //   345: astore          10
        //   347: aload           10
        //   349: athrow         
        //   350: astore          34
        //   352: aload           34
        //   354: athrow         
        //   355: aload           27
        //   357: getfield        android/view/ViewGroup$MarginLayoutParams.leftMargin:I
        //   360: istore          28
        //   362: goto            99
        //   365: astore          32
        //   367: aload           32
        //   369: athrow         
        //   370: aload           27
        //   372: getfield        android/view/ViewGroup$MarginLayoutParams.rightMargin:I
        //   375: istore          29
        //   377: goto            115
        //   380: astore          31
        //   382: aload           31
        //   384: athrow         
        //   385: astore          12
        //   387: aload           12
        //   389: athrow         
        //   390: astore          13
        //   392: aload           13
        //   394: athrow         
        //   395: astore          22
        //   397: aload           22
        //   399: athrow         
        //   400: iload           4
        //   402: iload_2        
        //   403: isub           
        //   404: aload_0        
        //   405: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.getPaddingRight:()I
        //   408: isub           
        //   409: istore          15
        //   411: goto            287
        //   414: astore          16
        //   416: aload           16
        //   418: athrow         
        //   419: astore          17
        //   421: aload           17
        //   423: athrow         
        //   424: iconst_0       
        //   425: istore          20
        //   427: goto            312
        //   430: iload           7
        //   432: istore          11
        //   434: goto            190
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  17     23     331    336    Ljava/lang/IllegalStateException;
        //  52     68     345    350    Ljava/lang/IllegalStateException;
        //  92     99     350    355    Ljava/lang/IllegalStateException;
        //  104    111    365    370    Ljava/lang/IllegalStateException;
        //  154    186    380    385    Ljava/lang/IllegalStateException;
        //  190    196    385    390    Ljava/lang/IllegalStateException;
        //  201    217    390    395    Ljava/lang/IllegalStateException;
        //  277    283    395    400    Ljava/lang/IllegalStateException;
        //  287    293    414    419    Ljava/lang/IllegalStateException;
        //  298    304    419    424    Ljava/lang/IllegalStateException;
        //  387    390    390    395    Ljava/lang/IllegalStateException;
        //  416    419    419    424    Ljava/lang/IllegalStateException;
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
    
    protected void onMeasure(final int p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/internal/widget/AdapterViewCompat.a:I
        //     3: istore_3       
        //     4: iload_1        
        //     5: invokestatic    android/view/View$MeasureSpec.getMode:(I)I
        //     8: ldc_w           1073741824
        //    11: if_icmpeq       63
        //    14: new             Ljava/lang/IllegalStateException;
        //    17: dup            
        //    18: new             Ljava/lang/StringBuilder;
        //    21: dup            
        //    22: invokespecial   java/lang/StringBuilder.<init>:()V
        //    25: aload_0        
        //    26: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    29: invokevirtual   java/lang/Class.getSimpleName:()Ljava/lang/String;
        //    32: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    35: getstatic       android/support/v7/internal/widget/ActionBarContextView.z:[Ljava/lang/String;
        //    38: iconst_3       
        //    39: aaload         
        //    40: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    43: getstatic       android/support/v7/internal/widget/ActionBarContextView.z:[Ljava/lang/String;
        //    46: iconst_2       
        //    47: aaload         
        //    48: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    51: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    54: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    57: athrow         
        //    58: astore          45
        //    60: aload           45
        //    62: athrow         
        //    63: iload_2        
        //    64: invokestatic    android/view/View$MeasureSpec.getMode:(I)I
        //    67: ifne            119
        //    70: new             Ljava/lang/IllegalStateException;
        //    73: dup            
        //    74: new             Ljava/lang/StringBuilder;
        //    77: dup            
        //    78: invokespecial   java/lang/StringBuilder.<init>:()V
        //    81: aload_0        
        //    82: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    85: invokevirtual   java/lang/Class.getSimpleName:()Ljava/lang/String;
        //    88: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    91: getstatic       android/support/v7/internal/widget/ActionBarContextView.z:[Ljava/lang/String;
        //    94: iconst_0       
        //    95: aaload         
        //    96: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    99: getstatic       android/support/v7/internal/widget/ActionBarContextView.z:[Ljava/lang/String;
        //   102: iconst_1       
        //   103: aaload         
        //   104: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   107: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   110: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   113: athrow         
        //   114: astore          44
        //   116: aload           44
        //   118: athrow         
        //   119: iload_1        
        //   120: invokestatic    android/view/View$MeasureSpec.getSize:(I)I
        //   123: istore          4
        //   125: aload_0        
        //   126: getfield        android/support/v7/internal/widget/ActionBarContextView.mContentHeight:I
        //   129: ifle            603
        //   132: aload_0        
        //   133: getfield        android/support/v7/internal/widget/ActionBarContextView.mContentHeight:I
        //   136: istore          43
        //   138: iload           43
        //   140: istore          6
        //   142: aload_0        
        //   143: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.getPaddingTop:()I
        //   146: aload_0        
        //   147: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.getPaddingBottom:()I
        //   150: iadd           
        //   151: istore          7
        //   153: iload           4
        //   155: aload_0        
        //   156: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.getPaddingLeft:()I
        //   159: isub           
        //   160: aload_0        
        //   161: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.getPaddingRight:()I
        //   164: isub           
        //   165: istore          8
        //   167: iload           6
        //   169: iload           7
        //   171: isub           
        //   172: istore          9
        //   174: iload           9
        //   176: ldc_w           -2147483648
        //   179: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   182: istore          10
        //   184: aload_0        
        //   185: getfield        android/support/v7/internal/widget/ActionBarContextView.mClose:Landroid/view/View;
        //   188: ifnull          234
        //   191: aload_0        
        //   192: aload_0        
        //   193: getfield        android/support/v7/internal/widget/ActionBarContextView.mClose:Landroid/view/View;
        //   196: iload           8
        //   198: iload           10
        //   200: iconst_0       
        //   201: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.measureChildView:(Landroid/view/View;III)I
        //   204: istore          41
        //   206: aload_0        
        //   207: getfield        android/support/v7/internal/widget/ActionBarContextView.mClose:Landroid/view/View;
        //   210: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   213: checkcast       Landroid/view/ViewGroup$MarginLayoutParams;
        //   216: astore          42
        //   218: iload           41
        //   220: aload           42
        //   222: getfield        android/view/ViewGroup$MarginLayoutParams.leftMargin:I
        //   225: aload           42
        //   227: getfield        android/view/ViewGroup$MarginLayoutParams.rightMargin:I
        //   230: iadd           
        //   231: isub           
        //   232: istore          8
        //   234: aload_0        
        //   235: getfield        android/support/v7/internal/widget/ActionBarContextView.mMenuView:Landroid/support/v7/widget/ActionMenuView;
        //   238: ifnull          271
        //   241: aload_0        
        //   242: getfield        android/support/v7/internal/widget/ActionBarContextView.mMenuView:Landroid/support/v7/widget/ActionMenuView;
        //   245: invokevirtual   android/support/v7/widget/ActionMenuView.getParent:()Landroid/view/ViewParent;
        //   248: astore          40
        //   250: aload           40
        //   252: aload_0        
        //   253: if_acmpne       271
        //   256: aload_0        
        //   257: aload_0        
        //   258: getfield        android/support/v7/internal/widget/ActionBarContextView.mMenuView:Landroid/support/v7/widget/ActionMenuView;
        //   261: iload           8
        //   263: iload           10
        //   265: iconst_0       
        //   266: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.measureChildView:(Landroid/view/View;III)I
        //   269: istore          8
        //   271: aload_0        
        //   272: getfield        android/support/v7/internal/widget/ActionBarContextView.mTitleLayout:Landroid/widget/LinearLayout;
        //   275: astore          14
        //   277: aload           14
        //   279: ifnull          393
        //   282: aload_0        
        //   283: getfield        android/support/v7/internal/widget/ActionBarContextView.mCustomView:Landroid/view/View;
        //   286: ifnonnull       393
        //   289: aload_0        
        //   290: getfield        android/support/v7/internal/widget/ActionBarContextView.mTitleOptional:Z
        //   293: istore          32
        //   295: iload           32
        //   297: ifeq            378
        //   300: iconst_0       
        //   301: iconst_0       
        //   302: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   305: istore          33
        //   307: aload_0        
        //   308: getfield        android/support/v7/internal/widget/ActionBarContextView.mTitleLayout:Landroid/widget/LinearLayout;
        //   311: iload           33
        //   313: iload           10
        //   315: invokevirtual   android/widget/LinearLayout.measure:(II)V
        //   318: aload_0        
        //   319: getfield        android/support/v7/internal/widget/ActionBarContextView.mTitleLayout:Landroid/widget/LinearLayout;
        //   322: invokevirtual   android/widget/LinearLayout.getMeasuredWidth:()I
        //   325: istore          34
        //   327: iload           34
        //   329: iload           8
        //   331: if_icmpgt       627
        //   334: iconst_1       
        //   335: istore          35
        //   337: iload           35
        //   339: ifeq            700
        //   342: iload           8
        //   344: iload           34
        //   346: isub           
        //   347: istore          36
        //   349: aload_0        
        //   350: getfield        android/support/v7/internal/widget/ActionBarContextView.mTitleLayout:Landroid/widget/LinearLayout;
        //   353: astore          38
        //   355: iload           35
        //   357: ifeq            638
        //   360: iconst_0       
        //   361: istore          39
        //   363: aload           38
        //   365: iload           39
        //   367: invokevirtual   android/widget/LinearLayout.setVisibility:(I)V
        //   370: iload_3        
        //   371: ifeq            693
        //   374: iload           36
        //   376: istore          8
        //   378: aload_0        
        //   379: aload_0        
        //   380: getfield        android/support/v7/internal/widget/ActionBarContextView.mTitleLayout:Landroid/widget/LinearLayout;
        //   383: iload           8
        //   385: iload           10
        //   387: iconst_0       
        //   388: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.measureChildView:(Landroid/view/View;III)I
        //   391: istore          8
        //   393: aload_0        
        //   394: getfield        android/support/v7/internal/widget/ActionBarContextView.mCustomView:Landroid/view/View;
        //   397: ifnull          516
        //   400: aload_0        
        //   401: getfield        android/support/v7/internal/widget/ActionBarContextView.mCustomView:Landroid/view/View;
        //   404: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   407: astore          21
        //   409: aload           21
        //   411: getfield        android/view/ViewGroup$LayoutParams.width:I
        //   414: istore          23
        //   416: iload           23
        //   418: bipush          -2
        //   420: if_icmpeq       650
        //   423: ldc_w           1073741824
        //   426: istore          24
        //   428: aload           21
        //   430: getfield        android/view/ViewGroup$LayoutParams.width:I
        //   433: iflt            452
        //   436: aload           21
        //   438: getfield        android/view/ViewGroup$LayoutParams.width:I
        //   441: iload           8
        //   443: invokestatic    java/lang/Math.min:(II)I
        //   446: istore          31
        //   448: iload           31
        //   450: istore          8
        //   452: aload           21
        //   454: getfield        android/view/ViewGroup$LayoutParams.height:I
        //   457: istore          27
        //   459: iload           27
        //   461: bipush          -2
        //   463: if_icmpeq       668
        //   466: ldc_w           1073741824
        //   469: istore          28
        //   471: aload           21
        //   473: getfield        android/view/ViewGroup$LayoutParams.height:I
        //   476: iflt            495
        //   479: aload           21
        //   481: getfield        android/view/ViewGroup$LayoutParams.height:I
        //   484: iload           9
        //   486: invokestatic    java/lang/Math.min:(II)I
        //   489: istore          30
        //   491: iload           30
        //   493: istore          9
        //   495: aload_0        
        //   496: getfield        android/support/v7/internal/widget/ActionBarContextView.mCustomView:Landroid/view/View;
        //   499: iload           8
        //   501: iload           24
        //   503: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   506: iload           9
        //   508: iload           28
        //   510: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   513: invokevirtual   android/view/View.measure:(II)V
        //   516: aload_0        
        //   517: getfield        android/support/v7/internal/widget/ActionBarContextView.mContentHeight:I
        //   520: ifgt            589
        //   523: aload_0        
        //   524: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.getChildCount:()I
        //   527: istore          16
        //   529: iconst_0       
        //   530: istore          17
        //   532: iconst_0       
        //   533: istore          18
        //   535: iload           17
        //   537: iload           16
        //   539: if_icmpge       577
        //   542: iload           7
        //   544: aload_0        
        //   545: iload           17
        //   547: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.getChildAt:(I)Landroid/view/View;
        //   550: invokevirtual   android/view/View.getMeasuredHeight:()I
        //   553: iadd           
        //   554: istore          19
        //   556: iload           19
        //   558: iload           18
        //   560: if_icmple       567
        //   563: iload           19
        //   565: istore          18
        //   567: iload           17
        //   569: iconst_1       
        //   570: iadd           
        //   571: istore          20
        //   573: iload_3        
        //   574: ifeq            686
        //   577: aload_0        
        //   578: iload           4
        //   580: iload           18
        //   582: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.setMeasuredDimension:(II)V
        //   585: iload_3        
        //   586: ifeq            597
        //   589: aload_0        
        //   590: iload           4
        //   592: iload           6
        //   594: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.setMeasuredDimension:(II)V
        //   597: return         
        //   598: astore          5
        //   600: aload           5
        //   602: athrow         
        //   603: iload_2        
        //   604: invokestatic    android/view/View$MeasureSpec.getSize:(I)I
        //   607: istore          6
        //   609: goto            142
        //   612: astore          11
        //   614: aload           11
        //   616: athrow         
        //   617: astore          12
        //   619: aload           12
        //   621: athrow         
        //   622: astore          13
        //   624: aload           13
        //   626: athrow         
        //   627: iconst_0       
        //   628: istore          35
        //   630: goto            337
        //   633: astore          37
        //   635: aload           37
        //   637: athrow         
        //   638: bipush          8
        //   640: istore          39
        //   642: goto            363
        //   645: astore          22
        //   647: aload           22
        //   649: athrow         
        //   650: ldc_w           -2147483648
        //   653: istore          24
        //   655: goto            428
        //   658: astore          25
        //   660: aload           25
        //   662: athrow         
        //   663: astore          26
        //   665: aload           26
        //   667: athrow         
        //   668: ldc_w           -2147483648
        //   671: istore          28
        //   673: goto            471
        //   676: astore          29
        //   678: aload           29
        //   680: athrow         
        //   681: astore          15
        //   683: aload           15
        //   685: athrow         
        //   686: iload           20
        //   688: istore          17
        //   690: goto            535
        //   693: iload           36
        //   695: istore          8
        //   697: goto            393
        //   700: iload           8
        //   702: istore          36
        //   704: goto            349
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  14     58     58     63     Ljava/lang/IllegalStateException;
        //  70     114    114    119    Ljava/lang/IllegalStateException;
        //  125    138    598    603    Ljava/lang/IllegalStateException;
        //  234    250    612    617    Ljava/lang/IllegalStateException;
        //  271    277    617    622    Ljava/lang/IllegalStateException;
        //  282    295    622    627    Ljava/lang/IllegalStateException;
        //  349    355    633    638    Ljava/lang/IllegalStateException;
        //  409    416    645    650    Ljava/lang/IllegalStateException;
        //  428    448    658    663    Ljava/lang/IllegalStateException;
        //  452    459    663    668    Ljava/lang/IllegalStateException;
        //  471    491    676    681    Ljava/lang/IllegalStateException;
        //  577    585    681    686    Ljava/lang/IllegalStateException;
        //  589    597    681    686    Ljava/lang/IllegalStateException;
        //  619    622    622    627    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 338, Size: 338
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
    public void setContentHeight(final int mContentHeight) {
        this.mContentHeight = mContentHeight;
    }
    
    public void setCustomView(final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/internal/widget/ActionBarContextView.mCustomView:Landroid/view/View;
        //     4: ifnull          15
        //     7: aload_0        
        //     8: aload_0        
        //     9: getfield        android/support/v7/internal/widget/ActionBarContextView.mCustomView:Landroid/view/View;
        //    12: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.removeView:(Landroid/view/View;)V
        //    15: aload_0        
        //    16: aload_1        
        //    17: putfield        android/support/v7/internal/widget/ActionBarContextView.mCustomView:Landroid/view/View;
        //    20: aload_0        
        //    21: getfield        android/support/v7/internal/widget/ActionBarContextView.mTitleLayout:Landroid/widget/LinearLayout;
        //    24: ifnull          40
        //    27: aload_0        
        //    28: aload_0        
        //    29: getfield        android/support/v7/internal/widget/ActionBarContextView.mTitleLayout:Landroid/widget/LinearLayout;
        //    32: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.removeView:(Landroid/view/View;)V
        //    35: aload_0        
        //    36: aconst_null    
        //    37: putfield        android/support/v7/internal/widget/ActionBarContextView.mTitleLayout:Landroid/widget/LinearLayout;
        //    40: aload_1        
        //    41: ifnull          49
        //    44: aload_0        
        //    45: aload_1        
        //    46: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.addView:(Landroid/view/View;)V
        //    49: aload_0        
        //    50: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.requestLayout:()V
        //    53: return         
        //    54: astore_2       
        //    55: aload_2        
        //    56: athrow         
        //    57: astore_3       
        //    58: aload_3        
        //    59: athrow         
        //    60: astore          4
        //    62: aload           4
        //    64: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      15     54     57     Ljava/lang/IllegalStateException;
        //  15     40     57     60     Ljava/lang/IllegalStateException;
        //  44     49     60     65     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 37, Size: 37
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
    
    public void setSubtitle(final CharSequence mSubtitle) {
        this.mSubtitle = mSubtitle;
        this.initTitle();
    }
    
    public void setTitle(final CharSequence mTitle) {
        this.mTitle = mTitle;
        this.initTitle();
    }
    
    public void setTitleOptional(final boolean mTitleOptional) {
        try {
            if (mTitleOptional != this.mTitleOptional) {
                this.requestLayout();
            }
            this.mTitleOptional = mTitleOptional;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public boolean shouldDelayChildPressedState() {
        return false;
    }
    
    public boolean showOverflowMenu() {
        try {
            if (this.mActionMenuPresenter != null) {
                return this.mActionMenuPresenter.showOverflowMenu();
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        return false;
    }
}
