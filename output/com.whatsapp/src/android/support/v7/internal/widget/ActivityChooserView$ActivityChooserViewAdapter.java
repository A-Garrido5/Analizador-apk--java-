// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.view.View$MeasureSpec;
import android.view.ViewGroup;
import android.view.View;
import android.content.pm.ResolveInfo;
import android.widget.BaseAdapter;

class ActivityChooserView$ActivityChooserViewAdapter extends BaseAdapter
{
    private ActivityChooserModel mDataModel;
    private boolean mHighlightDefaultActivity;
    private int mMaxActivityCount;
    private boolean mShowDefaultActivity;
    private boolean mShowFooterView;
    final ActivityChooserView this$0;
    
    private ActivityChooserView$ActivityChooserViewAdapter(final ActivityChooserView this$0) {
        this.this$0 = this$0;
        this.mMaxActivityCount = 4;
    }
    
    ActivityChooserView$ActivityChooserViewAdapter(final ActivityChooserView activityChooserView, final ActivityChooserView$1 activityChooserView$1) {
        this(activityChooserView);
    }
    
    public int getActivityCount() {
        return this.mDataModel.getActivityCount();
    }
    
    public int getCount() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.mDataModel:Landroid/support/v7/internal/widget/ActivityChooserModel;
        //     4: invokevirtual   android/support/v7/internal/widget/ActivityChooserModel.getActivityCount:()I
        //     7: istore_1       
        //     8: aload_0        
        //     9: getfield        android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.mShowDefaultActivity:Z
        //    12: istore          4
        //    14: iload           4
        //    16: ifne            36
        //    19: aload_0        
        //    20: getfield        android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.mDataModel:Landroid/support/v7/internal/widget/ActivityChooserModel;
        //    23: invokevirtual   android/support/v7/internal/widget/ActivityChooserModel.getDefaultActivity:()Landroid/content/pm/ResolveInfo;
        //    26: astore          8
        //    28: aload           8
        //    30: ifnull          36
        //    33: iinc            1, -1
        //    36: iload_1        
        //    37: aload_0        
        //    38: getfield        android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.mMaxActivityCount:I
        //    41: invokestatic    java/lang/Math.min:(II)I
        //    44: istore          5
        //    46: aload_0        
        //    47: getfield        android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.mShowFooterView:Z
        //    50: istore          7
        //    52: iload           7
        //    54: ifeq            60
        //    57: iinc            5, 1
        //    60: iload           5
        //    62: ireturn        
        //    63: astore_2       
        //    64: aload_2        
        //    65: athrow         
        //    66: astore_3       
        //    67: aload_3        
        //    68: athrow         
        //    69: astore          6
        //    71: aload           6
        //    73: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  8      14     63     66     Ljava/lang/IllegalArgumentException;
        //  19     28     66     69     Ljava/lang/IllegalArgumentException;
        //  46     52     69     74     Ljava/lang/IllegalArgumentException;
        //  64     66     66     69     Ljava/lang/IllegalArgumentException;
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
    
    public ActivityChooserModel getDataModel() {
        return this.mDataModel;
    }
    
    public ResolveInfo getDefaultActivity() {
        return this.mDataModel.getDefaultActivity();
    }
    
    public int getHistorySize() {
        return this.mDataModel.getHistorySize();
    }
    
    public Object getItem(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: iload_1        
        //     2: invokevirtual   android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.getItemViewType:(I)I
        //     5: tableswitch {
        //                0: 38
        //                1: 36
        //          default: 28
        //        }
        //    28: new             Ljava/lang/IllegalArgumentException;
        //    31: dup            
        //    32: invokespecial   java/lang/IllegalArgumentException.<init>:()V
        //    35: athrow         
        //    36: aconst_null    
        //    37: areturn        
        //    38: aload_0        
        //    39: getfield        android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.mShowDefaultActivity:Z
        //    42: istore          4
        //    44: iload           4
        //    46: ifne            66
        //    49: aload_0        
        //    50: getfield        android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.mDataModel:Landroid/support/v7/internal/widget/ActivityChooserModel;
        //    53: invokevirtual   android/support/v7/internal/widget/ActivityChooserModel.getDefaultActivity:()Landroid/content/pm/ResolveInfo;
        //    56: astore          5
        //    58: aload           5
        //    60: ifnull          66
        //    63: iinc            1, 1
        //    66: aload_0        
        //    67: getfield        android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.mDataModel:Landroid/support/v7/internal/widget/ActivityChooserModel;
        //    70: iload_1        
        //    71: invokevirtual   android/support/v7/internal/widget/ActivityChooserModel.getActivity:(I)Landroid/content/pm/ResolveInfo;
        //    74: areturn        
        //    75: astore_2       
        //    76: aload_2        
        //    77: athrow         
        //    78: astore_3       
        //    79: aload_3        
        //    80: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  38     44     75     78     Ljava/lang/IllegalArgumentException;
        //  49     58     78     81     Ljava/lang/IllegalArgumentException;
        //  76     78     78     81     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0066:
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
    
    public long getItemId(final int n) {
        return n;
    }
    
    public int getItemViewType(final int n) {
        try {
            if (!this.mShowFooterView) {
                return 0;
            }
            final int n2 = n;
            final int n3 = -1;
            final ActivityChooserView$ActivityChooserViewAdapter activityChooserView$ActivityChooserViewAdapter = this;
            final int n4 = activityChooserView$ActivityChooserViewAdapter.getCount();
            final int n5 = n3 + n4;
            if (n2 == n5) {
                final boolean b = true;
                return b ? 1 : 0;
            }
            return 0;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            final int n2 = n;
            final int n3 = -1;
            final ActivityChooserView$ActivityChooserViewAdapter activityChooserView$ActivityChooserViewAdapter = this;
            final int n4 = activityChooserView$ActivityChooserViewAdapter.getCount();
            final int n5 = n3 + n4;
            if (n2 == n5) {
                final boolean b = true;
                return b ? 1 : 0;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        return 0;
    }
    
    public boolean getShowDefaultActivity() {
        return this.mShowDefaultActivity;
    }
    
    public View getView(final int p0, final View p1, final ViewGroup p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: iload_1        
        //     2: invokevirtual   android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.getItemViewType:(I)I
        //     5: tableswitch {
        //                0: 109
        //                1: 36
        //          default: 28
        //        }
        //    28: new             Ljava/lang/IllegalArgumentException;
        //    31: dup            
        //    32: invokespecial   java/lang/IllegalArgumentException.<init>:()V
        //    35: athrow         
        //    36: aload_2        
        //    37: ifnull          52
        //    40: aload_2        
        //    41: invokevirtual   android/view/View.getId:()I
        //    44: istore          18
        //    46: iload           18
        //    48: iconst_1       
        //    49: if_icmpeq       102
        //    52: aload_0        
        //    53: getfield        android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
        //    56: invokevirtual   android/support/v7/internal/widget/ActivityChooserView.getContext:()Landroid/content/Context;
        //    59: invokestatic    android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
        //    62: getstatic       android/support/v7/appcompat/R$layout.abc_activity_chooser_view_list_item:I
        //    65: aload_3        
        //    66: iconst_0       
        //    67: invokevirtual   android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //    70: astore_2       
        //    71: aload_2        
        //    72: iconst_1       
        //    73: invokevirtual   android/view/View.setId:(I)V
        //    76: aload_2        
        //    77: getstatic       android/support/v7/appcompat/R$id.title:I
        //    80: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    83: checkcast       Landroid/widget/TextView;
        //    86: aload_0        
        //    87: getfield        android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
        //    90: invokevirtual   android/support/v7/internal/widget/ActivityChooserView.getContext:()Landroid/content/Context;
        //    93: getstatic       android/support/v7/appcompat/R$string.abc_activity_chooser_view_see_all:I
        //    96: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //    99: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   102: aload_2        
        //   103: areturn        
        //   104: astore          17
        //   106: aload           17
        //   108: athrow         
        //   109: aload_2        
        //   110: ifnull          131
        //   113: aload_2        
        //   114: invokevirtual   android/view/View.getId:()I
        //   117: istore          15
        //   119: getstatic       android/support/v7/appcompat/R$id.list_item:I
        //   122: istore          16
        //   124: iload           15
        //   126: iload           16
        //   128: if_icmpeq       150
        //   131: aload_0        
        //   132: getfield        android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
        //   135: invokevirtual   android/support/v7/internal/widget/ActivityChooserView.getContext:()Landroid/content/Context;
        //   138: invokestatic    android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
        //   141: getstatic       android/support/v7/appcompat/R$layout.abc_activity_chooser_view_list_item:I
        //   144: aload_3        
        //   145: iconst_0       
        //   146: invokevirtual   android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //   149: astore_2       
        //   150: aload_0        
        //   151: getfield        android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
        //   154: invokevirtual   android/support/v7/internal/widget/ActivityChooserView.getContext:()Landroid/content/Context;
        //   157: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //   160: astore          4
        //   162: aload_2        
        //   163: getstatic       android/support/v7/appcompat/R$id.icon:I
        //   166: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   169: checkcast       Landroid/widget/ImageView;
        //   172: astore          5
        //   174: aload_0        
        //   175: iload_1        
        //   176: invokevirtual   android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.getItem:(I)Ljava/lang/Object;
        //   179: checkcast       Landroid/content/pm/ResolveInfo;
        //   182: astore          6
        //   184: aload           5
        //   186: aload           6
        //   188: aload           4
        //   190: invokevirtual   android/content/pm/ResolveInfo.loadIcon:(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;
        //   193: invokevirtual   android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   196: aload_2        
        //   197: getstatic       android/support/v7/appcompat/R$id.title:I
        //   200: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   203: checkcast       Landroid/widget/TextView;
        //   206: astore          7
        //   208: aload           7
        //   210: aload           6
        //   212: aload           4
        //   214: invokevirtual   android/content/pm/ResolveInfo.loadLabel:(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
        //   217: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   220: aload_0        
        //   221: getfield        android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.mShowDefaultActivity:Z
        //   224: istore          12
        //   226: iload           12
        //   228: ifeq            257
        //   231: iload_1        
        //   232: ifne            257
        //   235: aload_0        
        //   236: getfield        android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.mHighlightDefaultActivity:Z
        //   239: istore          13
        //   241: iload           13
        //   243: ifeq            257
        //   246: aload_2        
        //   247: iconst_1       
        //   248: invokestatic    android/support/v4/view/ViewCompat.setActivated:(Landroid/view/View;Z)V
        //   251: getstatic       android/support/v7/internal/widget/AdapterViewCompat.a:I
        //   254: ifeq            102
        //   257: aload_2        
        //   258: iconst_0       
        //   259: invokestatic    android/support/v4/view/ViewCompat.setActivated:(Landroid/view/View;Z)V
        //   262: aload_2        
        //   263: areturn        
        //   264: astore          11
        //   266: aload           11
        //   268: athrow         
        //   269: astore          14
        //   271: aload           14
        //   273: athrow         
        //   274: astore          8
        //   276: aload           8
        //   278: athrow         
        //   279: astore          9
        //   281: aload           9
        //   283: athrow         
        //   284: astore          10
        //   286: aload           10
        //   288: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  40     46     104    109    Ljava/lang/IllegalArgumentException;
        //  113    124    269    274    Ljava/lang/IllegalArgumentException;
        //  208    226    274    284    Ljava/lang/IllegalArgumentException;
        //  235    241    284    289    Ljava/lang/IllegalArgumentException;
        //  246    257    264    269    Ljava/lang/IllegalArgumentException;
        //  257    262    264    269    Ljava/lang/IllegalArgumentException;
        //  276    279    279    284    Ljava/lang/IllegalArgumentException;
        //  281    284    284    289    Ljava/lang/IllegalArgumentException;
        //  286    289    264    269    Ljava/lang/IllegalArgumentException;
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
    
    public int getViewTypeCount() {
        return 3;
    }
    
    public int measureContentWidth() {
        int max = 0;
        final int a = AdapterViewCompat.a;
        final int mMaxActivityCount = this.mMaxActivityCount;
        this.mMaxActivityCount = Integer.MAX_VALUE;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(0, 0);
        final int count = this.getCount();
        int i = 0;
        View view = null;
        while (i < count) {
            view = this.getView(i, view, null);
            view.measure(measureSpec, measureSpec2);
            max = Math.max(max, view.getMeasuredWidth());
            ++i;
            if (a != 0) {
                break;
            }
        }
        this.mMaxActivityCount = mMaxActivityCount;
        return max;
    }
    
    public void setMaxActivityCount(final int mMaxActivityCount) {
        try {
            if (this.mMaxActivityCount != mMaxActivityCount) {
                this.mMaxActivityCount = mMaxActivityCount;
                this.notifyDataSetChanged();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public void setShowDefaultActivity(final boolean p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.mShowDefaultActivity:Z
        //     4: istore          5
        //     6: iload           5
        //     8: iload_1        
        //     9: if_icmpne       20
        //    12: aload_0        
        //    13: getfield        android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.mHighlightDefaultActivity:Z
        //    16: iload_2        
        //    17: if_icmpeq       43
        //    20: aload_0        
        //    21: iload_1        
        //    22: putfield        android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.mShowDefaultActivity:Z
        //    25: aload_0        
        //    26: iload_2        
        //    27: putfield        android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.mHighlightDefaultActivity:Z
        //    30: aload_0        
        //    31: invokevirtual   android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.notifyDataSetChanged:()V
        //    34: return         
        //    35: astore_3       
        //    36: aload_3        
        //    37: athrow         
        //    38: astore          4
        //    40: aload           4
        //    42: athrow         
        //    43: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      6      35     38     Ljava/lang/IllegalArgumentException;
        //  12     20     38     43     Ljava/lang/IllegalArgumentException;
        //  20     34     38     43     Ljava/lang/IllegalArgumentException;
        //  36     38     38     43     Ljava/lang/IllegalArgumentException;
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
    
    public void setShowFooterView(final boolean mShowFooterView) {
        try {
            if (this.mShowFooterView != mShowFooterView) {
                this.mShowFooterView = mShowFooterView;
                this.notifyDataSetChanged();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
}
