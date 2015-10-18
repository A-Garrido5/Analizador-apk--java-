// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Parcelable;
import android.graphics.Canvas;
import android.widget.ImageButton;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;
import android.graphics.Paint$Style;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import java.util.Locale;
import android.widget.LinearLayout$LayoutParams;
import android.support.v4.view.ViewPager$OnPageChangeListener;
import android.graphics.Typeface;
import android.widget.LinearLayout;
import android.support.v4.view.ViewPager;
import android.widget.HorizontalScrollView;

public class PagerSlidingTabStrip extends HorizontalScrollView
{
    private static final String E;
    private static final int[] v;
    private ViewPager A;
    private LinearLayout B;
    private int C;
    private Typeface D;
    private boolean a;
    private int b;
    private int c;
    private float d;
    private int e;
    public ViewPager$OnPageChangeListener f;
    private LinearLayout$LayoutParams g;
    private int h;
    private final is i;
    private int j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private int o;
    private Locale p;
    private int q;
    private int r;
    private int s;
    private int t;
    private LinearLayout$LayoutParams u;
    private int w;
    private Paint x;
    private int y;
    private Paint z;
    
    static {
        final char[] charArray = "\u000f\u0019\u001d[*8\u0017\u001d^Z=\u001f\u001d_Z7\u001f\f\f\u00128\u0006\u001d\f\u001b=\u0011\bX\u001f+P\u0011B\t-\u0011\u0016O\u001fw".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'z';
                    break;
                }
                case 0: {
                    c2 = 'Y';
                    break;
                }
                case 1: {
                    c2 = 'p';
                    break;
                }
                case 2: {
                    c2 = 'x';
                    break;
                }
                case 3: {
                    c2 = ',';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        E = new String(charArray).intern();
        v = new int[] { 16842901, 16842904 };
    }
    
    public PagerSlidingTabStrip(final Context context) {
        this(context, null);
    }
    
    public PagerSlidingTabStrip(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public PagerSlidingTabStrip(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.i = new is(this, null);
        this.C = 0;
        this.d = 0.0f;
        this.j = -10066330;
        this.h = 436207616;
        this.r = 436207616;
        this.n = false;
        this.a = true;
        this.l = 52;
        this.t = 8;
        this.k = 2;
        this.e = 12;
        this.s = 24;
        this.c = 1;
        this.b = 12;
        this.w = -10066330;
        this.D = null;
        this.y = 1;
        this.q = 0;
        this.o = 2130837607;
        this.setFillViewport(true);
        this.setWillNotDraw(false);
        (this.B = new LinearLayout(context)).setOrientation(0);
        this.B.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        this.addView((View)this.B);
        final DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        this.l = (int)TypedValue.applyDimension(1, (float)this.l, displayMetrics);
        this.t = (int)TypedValue.applyDimension(1, (float)this.t, displayMetrics);
        this.k = (int)TypedValue.applyDimension(1, (float)this.k, displayMetrics);
        this.e = (int)TypedValue.applyDimension(1, (float)this.e, displayMetrics);
        this.s = (int)TypedValue.applyDimension(1, (float)this.s, displayMetrics);
        this.c = (int)TypedValue.applyDimension(1, (float)this.c, displayMetrics);
        this.b = (int)TypedValue.applyDimension(2, (float)this.b, displayMetrics);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, PagerSlidingTabStrip.v);
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, this.b);
        this.w = obtainStyledAttributes.getColor(1, this.w);
        obtainStyledAttributes.recycle();
        final TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(set, aqy.PagerSlidingTabStrip);
        try {
            this.j = obtainStyledAttributes2.getColor(0, this.j);
            this.h = obtainStyledAttributes2.getColor(1, this.h);
            this.r = obtainStyledAttributes2.getColor(2, this.r);
            this.t = obtainStyledAttributes2.getDimensionPixelSize(3, this.t);
            this.k = obtainStyledAttributes2.getDimensionPixelSize(4, this.k);
            this.e = obtainStyledAttributes2.getDimensionPixelSize(5, this.e);
            this.s = obtainStyledAttributes2.getDimensionPixelSize(6, this.s);
            this.o = obtainStyledAttributes2.getResourceId(8, this.o);
            this.n = obtainStyledAttributes2.getBoolean(9, this.n);
            this.l = obtainStyledAttributes2.getDimensionPixelSize(7, this.l);
            this.a = obtainStyledAttributes2.getBoolean(10, this.a);
            obtainStyledAttributes2.recycle();
            (this.z = new Paint()).setAntiAlias(true);
            this.z.setStyle(Paint$Style.FILL);
            (this.x = new Paint()).setAntiAlias(true);
            this.x.setStrokeWidth((float)this.c);
            this.g = new LinearLayout$LayoutParams(-2, -1);
            this.u = new LinearLayout$LayoutParams(0, -1, 1.0f);
            if (this.p == null) {
                this.p = this.getResources().getConfiguration().locale;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    static float a(final PagerSlidingTabStrip pagerSlidingTabStrip, final float d) {
        return pagerSlidingTabStrip.d = d;
    }
    
    static int a(final PagerSlidingTabStrip pagerSlidingTabStrip, final int c) {
        return pagerSlidingTabStrip.C = c;
    }
    
    static ViewPager a(final PagerSlidingTabStrip pagerSlidingTabStrip) {
        return pagerSlidingTabStrip.A;
    }
    
    private void a(final int n, final int n2) {
        while (true) {
            try {
                if (this.m == 0) {
                    return;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            int q = n2 + this.B.getChildAt(n).getLeft();
            if (n > 0 || n2 > 0) {
                q -= this.l;
            }
            try {
                if (q != this.q) {
                    this.scrollTo(this.q = q, 0);
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
    }
    
    private void a(final int n, final View view) {
        while (true) {
            while (true) {
                try {
                    view.setFocusable(true);
                    view.setOnClickListener((View$OnClickListener)new p0(this, n));
                    view.setPadding(this.s, 0, this.s, 0);
                    final LinearLayout b = this.B;
                    if (this.n) {
                        final LinearLayout$LayoutParams linearLayout$LayoutParams = this.u;
                        b.addView(view, n, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
                        return;
                    }
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
                final LinearLayout$LayoutParams linearLayout$LayoutParams = this.g;
                continue;
            }
        }
    }
    
    private void a(final int n, final String text) {
        final TextView textView = new TextView(this.getContext());
        textView.setText((CharSequence)text);
        textView.setGravity(17);
        textView.setSingleLine();
        this.a(n, (View)textView);
    }
    
    static void a(final PagerSlidingTabStrip pagerSlidingTabStrip, final int n, final int n2) {
        pagerSlidingTabStrip.a(n, n2);
    }
    
    static int b(final PagerSlidingTabStrip pagerSlidingTabStrip) {
        return pagerSlidingTabStrip.C;
    }
    
    private void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: iconst_0       
        //     5: istore_2       
        //     6: iload_2        
        //     7: aload_0        
        //     8: getfield        com/whatsapp/PagerSlidingTabStrip.m:I
        //    11: if_icmpge       141
        //    14: aload_0        
        //    15: getfield        com/whatsapp/PagerSlidingTabStrip.B:Landroid/widget/LinearLayout;
        //    18: iload_2        
        //    19: invokevirtual   android/widget/LinearLayout.getChildAt:(I)Landroid/view/View;
        //    22: astore_3       
        //    23: aload_3        
        //    24: aload_0        
        //    25: getfield        com/whatsapp/PagerSlidingTabStrip.o:I
        //    28: invokevirtual   android/view/View.setBackgroundResource:(I)V
        //    31: aload_3        
        //    32: instanceof      Landroid/widget/TextView;
        //    35: ifeq            132
        //    38: aload_3        
        //    39: checkcast       Landroid/widget/TextView;
        //    42: astore          5
        //    44: aload           5
        //    46: iconst_0       
        //    47: aload_0        
        //    48: getfield        com/whatsapp/PagerSlidingTabStrip.b:I
        //    51: i2f            
        //    52: invokevirtual   android/widget/TextView.setTextSize:(IF)V
        //    55: aload           5
        //    57: aload_0        
        //    58: getfield        com/whatsapp/PagerSlidingTabStrip.D:Landroid/graphics/Typeface;
        //    61: aload_0        
        //    62: getfield        com/whatsapp/PagerSlidingTabStrip.y:I
        //    65: invokevirtual   android/widget/TextView.setTypeface:(Landroid/graphics/Typeface;I)V
        //    68: aload           5
        //    70: aload_0        
        //    71: getfield        com/whatsapp/PagerSlidingTabStrip.w:I
        //    74: invokevirtual   android/widget/TextView.setTextColor:(I)V
        //    77: aload_0        
        //    78: getfield        com/whatsapp/PagerSlidingTabStrip.a:Z
        //    81: istore          9
        //    83: iload           9
        //    85: ifeq            132
        //    88: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    91: istore          10
        //    93: iload           10
        //    95: bipush          14
        //    97: if_icmplt       110
        //   100: aload           5
        //   102: iconst_1       
        //   103: invokevirtual   android/widget/TextView.setAllCaps:(Z)V
        //   106: iload_1        
        //   107: ifeq            132
        //   110: aload           5
        //   112: aload           5
        //   114: invokevirtual   android/widget/TextView.getText:()Ljava/lang/CharSequence;
        //   117: invokeinterface java/lang/CharSequence.toString:()Ljava/lang/String;
        //   122: aload_0        
        //   123: getfield        com/whatsapp/PagerSlidingTabStrip.p:Ljava/util/Locale;
        //   126: invokevirtual   java/lang/String.toUpperCase:(Ljava/util/Locale;)Ljava/lang/String;
        //   129: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   132: iload_2        
        //   133: iconst_1       
        //   134: iadd           
        //   135: istore          4
        //   137: iload_1        
        //   138: ifeq            157
        //   141: return         
        //   142: astore          6
        //   144: aload           6
        //   146: athrow         
        //   147: astore          7
        //   149: aload           7
        //   151: athrow         
        //   152: astore          8
        //   154: aload           8
        //   156: athrow         
        //   157: iload           4
        //   159: istore_2       
        //   160: goto            6
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  44     83     142    147    Ljava/lang/IllegalStateException;
        //  88     93     147    152    Ljava/lang/IllegalStateException;
        //  100    106    152    157    Ljava/lang/IllegalStateException;
        //  110    132    152    157    Ljava/lang/IllegalStateException;
        //  144    147    147    152    Ljava/lang/IllegalStateException;
        //  149    152    152    157    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 81, Size: 81
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
    
    private void b(final int n, final int imageResource) {
        final ImageButton imageButton = new ImageButton(this.getContext());
        imageButton.setImageResource(imageResource);
        this.a(n, (View)imageButton);
    }
    
    static LinearLayout c(final PagerSlidingTabStrip pagerSlidingTabStrip) {
        return pagerSlidingTabStrip.B;
    }
    
    public void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/PagerSlidingTabStrip.B:Landroid/widget/LinearLayout;
        //     8: invokevirtual   android/widget/LinearLayout.removeAllViews:()V
        //    11: aload_0        
        //    12: aload_0        
        //    13: getfield        com/whatsapp/PagerSlidingTabStrip.A:Landroid/support/v4/view/ViewPager;
        //    16: invokevirtual   android/support/v4/view/ViewPager.getAdapter:()Landroid/support/v4/view/PagerAdapter;
        //    19: invokevirtual   android/support/v4/view/PagerAdapter.getCount:()I
        //    22: putfield        com/whatsapp/PagerSlidingTabStrip.m:I
        //    25: iconst_0       
        //    26: istore_2       
        //    27: iload_2        
        //    28: aload_0        
        //    29: getfield        com/whatsapp/PagerSlidingTabStrip.m:I
        //    32: if_icmpge       149
        //    35: aload_0        
        //    36: getfield        com/whatsapp/PagerSlidingTabStrip.A:Landroid/support/v4/view/ViewPager;
        //    39: invokevirtual   android/support/v4/view/ViewPager.getAdapter:()Landroid/support/v4/view/PagerAdapter;
        //    42: instanceof      Lcom/whatsapp/hh;
        //    45: istore          7
        //    47: iload           7
        //    49: ifeq            77
        //    52: aload_0        
        //    53: iload_2        
        //    54: aload_0        
        //    55: getfield        com/whatsapp/PagerSlidingTabStrip.A:Landroid/support/v4/view/ViewPager;
        //    58: invokevirtual   android/support/v4/view/ViewPager.getAdapter:()Landroid/support/v4/view/PagerAdapter;
        //    61: checkcast       Lcom/whatsapp/hh;
        //    64: iload_2        
        //    65: invokeinterface com/whatsapp/hh.a:(I)Landroid/view/View;
        //    70: invokespecial   com/whatsapp/PagerSlidingTabStrip.a:(ILandroid/view/View;)V
        //    73: iload_1        
        //    74: ifeq            140
        //    77: aload_0        
        //    78: getfield        com/whatsapp/PagerSlidingTabStrip.A:Landroid/support/v4/view/ViewPager;
        //    81: invokevirtual   android/support/v4/view/ViewPager.getAdapter:()Landroid/support/v4/view/PagerAdapter;
        //    84: instanceof      Lcom/whatsapp/y7;
        //    87: istore          8
        //    89: iload           8
        //    91: ifeq            119
        //    94: aload_0        
        //    95: iload_2        
        //    96: aload_0        
        //    97: getfield        com/whatsapp/PagerSlidingTabStrip.A:Landroid/support/v4/view/ViewPager;
        //   100: invokevirtual   android/support/v4/view/ViewPager.getAdapter:()Landroid/support/v4/view/PagerAdapter;
        //   103: checkcast       Lcom/whatsapp/y7;
        //   106: iload_2        
        //   107: invokeinterface com/whatsapp/y7.a:(I)I
        //   112: invokespecial   com/whatsapp/PagerSlidingTabStrip.b:(II)V
        //   115: iload_1        
        //   116: ifeq            140
        //   119: aload_0        
        //   120: iload_2        
        //   121: aload_0        
        //   122: getfield        com/whatsapp/PagerSlidingTabStrip.A:Landroid/support/v4/view/ViewPager;
        //   125: invokevirtual   android/support/v4/view/ViewPager.getAdapter:()Landroid/support/v4/view/PagerAdapter;
        //   128: iload_2        
        //   129: invokevirtual   android/support/v4/view/PagerAdapter.getPageTitle:(I)Ljava/lang/CharSequence;
        //   132: invokeinterface java/lang/CharSequence.toString:()Ljava/lang/String;
        //   137: invokespecial   com/whatsapp/PagerSlidingTabStrip.a:(ILjava/lang/String;)V
        //   140: iload_2        
        //   141: iconst_1       
        //   142: iadd           
        //   143: istore          9
        //   145: iload_1        
        //   146: ifeq            187
        //   149: aload_0        
        //   150: invokespecial   com/whatsapp/PagerSlidingTabStrip.b:()V
        //   153: aload_0        
        //   154: invokevirtual   com/whatsapp/PagerSlidingTabStrip.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
        //   157: new             Lcom/whatsapp/q_;
        //   160: dup            
        //   161: aload_0        
        //   162: invokespecial   com/whatsapp/q_.<init>:(Lcom/whatsapp/PagerSlidingTabStrip;)V
        //   165: invokevirtual   android/view/ViewTreeObserver.addOnGlobalLayoutListener:(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
        //   168: return         
        //   169: astore_3       
        //   170: aload_3        
        //   171: athrow         
        //   172: astore          4
        //   174: aload           4
        //   176: athrow         
        //   177: astore          5
        //   179: aload           5
        //   181: athrow         
        //   182: astore          6
        //   184: aload           6
        //   186: athrow         
        //   187: iload           9
        //   189: istore_2       
        //   190: goto            27
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  35     47     169    172    Ljava/lang/IllegalStateException;
        //  52     73     172    177    Ljava/lang/IllegalStateException;
        //  77     89     177    182    Ljava/lang/IllegalStateException;
        //  94     115    182    187    Ljava/lang/IllegalStateException;
        //  119    140    182    187    Ljava/lang/IllegalStateException;
        //  170    172    172    177    Ljava/lang/IllegalStateException;
        //  174    177    177    182    Ljava/lang/IllegalStateException;
        //  179    182    182    187    Ljava/lang/IllegalStateException;
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
    
    protected void onDraw(final Canvas canvas) {
        final boolean i = App.I;
        Label_0036: {
            try {
                super.onDraw(canvas);
                if (this.isInEditMode()) {
                    return;
                }
                final PagerSlidingTabStrip pagerSlidingTabStrip = this;
                final int n = pagerSlidingTabStrip.m;
                if (n == 0) {
                    return;
                }
                break Label_0036;
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                final PagerSlidingTabStrip pagerSlidingTabStrip = this;
                final int n = pagerSlidingTabStrip.m;
                if (n == 0) {
                    return;
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
        final int height = this.getHeight();
        this.z.setColor(this.j);
        final View child = this.B.getChildAt(this.C);
        float n2 = child.getLeft();
        float n3 = child.getRight();
        try {
            if (this.d > 0.0f && this.C < this.m - 1) {
                final View child2 = this.B.getChildAt(1 + this.C);
                final float n4 = child2.getLeft();
                final float n5 = child2.getRight();
                n2 = n4 * this.d + n2 * (1.0f - this.d);
                n3 = n5 * this.d + n3 * (1.0f - this.d);
            }
            canvas.drawRect(n2, (float)(height - this.t), n3, (float)height, this.z);
            this.z.setColor(this.h);
            canvas.drawRect(0.0f, (float)(height - this.k), (float)this.B.getWidth(), (float)height, this.z);
            this.x.setColor(this.r);
            int n6;
            for (int j = 0; j < -1 + this.m; j = n6) {
                final View child3 = this.B.getChildAt(j);
                canvas.drawLine((float)child3.getRight(), (float)this.e, (float)child3.getRight(), (float)(height - this.e), this.x);
                n6 = j + 1;
                if (i) {
                    break;
                }
            }
        }
        catch (IllegalStateException ex3) {
            throw ex3;
        }
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        final c c = (c)parcelable;
        super.onRestoreInstanceState(c.getSuperState());
        this.C = c.a;
        this.requestLayout();
    }
    
    public Parcelable onSaveInstanceState() {
        final c c = new c(super.onSaveInstanceState());
        c.a = this.C;
        return (Parcelable)c;
    }
    
    public void setOnPageChangeListener(final ViewPager$OnPageChangeListener f) {
        this.f = f;
    }
    
    public void setTextColorResource(final int n) {
        this.w = this.getResources().getColor(n);
        this.b();
    }
    
    public void setViewPager(final ViewPager a) {
        try {
            this.A = a;
            if (a.getAdapter() == null) {
                throw new IllegalStateException(PagerSlidingTabStrip.E);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        a.setOnPageChangeListener(this.i);
        this.a();
    }
}
