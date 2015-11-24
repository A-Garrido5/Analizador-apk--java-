// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.widget.AdapterView;
import android.view.View;
import android.widget.PopupWindow$OnDismissListener;
import android.view.View$OnLongClickListener;
import android.view.View$OnClickListener;
import android.widget.AdapterView$OnItemClickListener;

class ActivityChooserView$Callbacks implements AdapterView$OnItemClickListener, View$OnClickListener, View$OnLongClickListener, PopupWindow$OnDismissListener
{
    final ActivityChooserView this$0;
    
    private ActivityChooserView$Callbacks(final ActivityChooserView this$0) {
        this.this$0 = this$0;
    }
    
    ActivityChooserView$Callbacks(final ActivityChooserView activityChooserView, final ActivityChooserView$1 activityChooserView$1) {
        this(activityChooserView);
    }
    
    private void notifyOnDismissListener() {
        try {
            if (ActivityChooserView.access$1000(this.this$0) != null) {
                ActivityChooserView.access$1000(this.this$0).onDismiss();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public void onClick(final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/internal/widget/AdapterViewCompat.a:I
        //     3: istore_2       
        //     4: aload_1        
        //     5: aload_0        
        //     6: getfield        android/support/v7/internal/widget/ActivityChooserView$Callbacks.this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
        //     9: invokestatic    android/support/v7/internal/widget/ActivityChooserView.access$700:(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/widget/FrameLayout;
        //    12: if_acmpne       98
        //    15: aload_0        
        //    16: getfield        android/support/v7/internal/widget/ActivityChooserView$Callbacks.this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
        //    19: invokevirtual   android/support/v7/internal/widget/ActivityChooserView.dismissPopup:()Z
        //    22: pop            
        //    23: aload_0        
        //    24: getfield        android/support/v7/internal/widget/ActivityChooserView$Callbacks.this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
        //    27: invokestatic    android/support/v7/internal/widget/ActivityChooserView.access$000:(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
        //    30: invokevirtual   android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.getDefaultActivity:()Landroid/content/pm/ResolveInfo;
        //    33: astore          8
        //    35: aload_0        
        //    36: getfield        android/support/v7/internal/widget/ActivityChooserView$Callbacks.this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
        //    39: invokestatic    android/support/v7/internal/widget/ActivityChooserView.access$000:(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
        //    42: invokevirtual   android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.getDataModel:()Landroid/support/v7/internal/widget/ActivityChooserModel;
        //    45: aload           8
        //    47: invokevirtual   android/support/v7/internal/widget/ActivityChooserModel.getActivityIndex:(Landroid/content/pm/ResolveInfo;)I
        //    50: istore          9
        //    52: aload_0        
        //    53: getfield        android/support/v7/internal/widget/ActivityChooserView$Callbacks.this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
        //    56: invokestatic    android/support/v7/internal/widget/ActivityChooserView.access$000:(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
        //    59: invokevirtual   android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.getDataModel:()Landroid/support/v7/internal/widget/ActivityChooserModel;
        //    62: iload           9
        //    64: invokevirtual   android/support/v7/internal/widget/ActivityChooserModel.chooseActivity:(I)Landroid/content/Intent;
        //    67: astore          10
        //    69: aload           10
        //    71: ifnull          94
        //    74: aload           10
        //    76: ldc             524288
        //    78: invokevirtual   android/content/Intent.addFlags:(I)Landroid/content/Intent;
        //    81: pop            
        //    82: aload_0        
        //    83: getfield        android/support/v7/internal/widget/ActivityChooserView$Callbacks.this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
        //    86: invokevirtual   android/support/v7/internal/widget/ActivityChooserView.getContext:()Landroid/content/Context;
        //    89: aload           10
        //    91: invokevirtual   android/content/Context.startActivity:(Landroid/content/Intent;)V
        //    94: iload_2        
        //    95: ifeq            161
        //    98: aload_0        
        //    99: getfield        android/support/v7/internal/widget/ActivityChooserView$Callbacks.this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
        //   102: invokestatic    android/support/v7/internal/widget/ActivityChooserView.access$800:(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/widget/FrameLayout;
        //   105: astore          5
        //   107: aload_1        
        //   108: aload           5
        //   110: if_acmpne       140
        //   113: aload_0        
        //   114: getfield        android/support/v7/internal/widget/ActivityChooserView$Callbacks.this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
        //   117: iconst_0       
        //   118: invokestatic    android/support/v7/internal/widget/ActivityChooserView.access$602:(Landroid/support/v7/internal/widget/ActivityChooserView;Z)Z
        //   121: pop            
        //   122: aload_0        
        //   123: getfield        android/support/v7/internal/widget/ActivityChooserView$Callbacks.this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
        //   126: aload_0        
        //   127: getfield        android/support/v7/internal/widget/ActivityChooserView$Callbacks.this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
        //   130: invokestatic    android/support/v7/internal/widget/ActivityChooserView.access$900:(Landroid/support/v7/internal/widget/ActivityChooserView;)I
        //   133: invokestatic    android/support/v7/internal/widget/ActivityChooserView.access$500:(Landroid/support/v7/internal/widget/ActivityChooserView;I)V
        //   136: iload_2        
        //   137: ifeq            161
        //   140: new             Ljava/lang/IllegalArgumentException;
        //   143: dup            
        //   144: invokespecial   java/lang/IllegalArgumentException.<init>:()V
        //   147: athrow         
        //   148: astore          4
        //   150: aload           4
        //   152: athrow         
        //   153: astore          11
        //   155: aload           11
        //   157: athrow         
        //   158: astore_3       
        //   159: aload_3        
        //   160: athrow         
        //   161: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  74     94     153    158    Ljava/lang/IllegalArgumentException;
        //  98     107    158    161    Ljava/lang/IllegalArgumentException;
        //  113    136    148    153    Ljava/lang/IllegalArgumentException;
        //  140    148    148    153    Ljava/lang/IllegalArgumentException;
        //  159    161    148    153    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0098:
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
    
    public void onDismiss() {
        try {
            this.notifyOnDismissListener();
            if (this.this$0.mProvider != null) {
                this.this$0.mProvider.subUiVisibilityChanged(false);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public void onItemClick(final AdapterView p0, final View p1, final int p2, final long p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/internal/widget/AdapterViewCompat.a:I
        //     3: istore          6
        //     5: aload_1        
        //     6: invokevirtual   android/widget/AdapterView.getAdapter:()Landroid/widget/Adapter;
        //     9: checkcast       Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
        //    12: iload_3        
        //    13: invokevirtual   android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.getItemViewType:(I)I
        //    16: tableswitch {
        //                0: 67
        //                1: 53
        //          default: 40
        //        }
        //    40: new             Ljava/lang/IllegalArgumentException;
        //    43: dup            
        //    44: invokespecial   java/lang/IllegalArgumentException.<init>:()V
        //    47: athrow         
        //    48: astore          15
        //    50: aload           15
        //    52: athrow         
        //    53: aload_0        
        //    54: getfield        android/support/v7/internal/widget/ActivityChooserView$Callbacks.this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
        //    57: ldc             2147483647
        //    59: invokestatic    android/support/v7/internal/widget/ActivityChooserView.access$500:(Landroid/support/v7/internal/widget/ActivityChooserView;I)V
        //    62: iload           6
        //    64: ifeq            175
        //    67: aload_0        
        //    68: getfield        android/support/v7/internal/widget/ActivityChooserView$Callbacks.this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
        //    71: invokevirtual   android/support/v7/internal/widget/ActivityChooserView.dismissPopup:()Z
        //    74: pop            
        //    75: aload_0        
        //    76: getfield        android/support/v7/internal/widget/ActivityChooserView$Callbacks.this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
        //    79: invokestatic    android/support/v7/internal/widget/ActivityChooserView.access$600:(Landroid/support/v7/internal/widget/ActivityChooserView;)Z
        //    82: istore          12
        //    84: iload           12
        //    86: ifeq            112
        //    89: iload_3        
        //    90: ifle            175
        //    93: aload_0        
        //    94: getfield        android/support/v7/internal/widget/ActivityChooserView$Callbacks.this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
        //    97: invokestatic    android/support/v7/internal/widget/ActivityChooserView.access$000:(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
        //   100: invokevirtual   android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.getDataModel:()Landroid/support/v7/internal/widget/ActivityChooserModel;
        //   103: iload_3        
        //   104: invokevirtual   android/support/v7/internal/widget/ActivityChooserModel.setDefaultActivity:(I)V
        //   107: iload           6
        //   109: ifeq            175
        //   112: aload_0        
        //   113: getfield        android/support/v7/internal/widget/ActivityChooserView$Callbacks.this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
        //   116: invokestatic    android/support/v7/internal/widget/ActivityChooserView.access$000:(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
        //   119: invokevirtual   android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.getShowDefaultActivity:()Z
        //   122: istore          13
        //   124: iload           13
        //   126: ifeq            201
        //   129: aload_0        
        //   130: getfield        android/support/v7/internal/widget/ActivityChooserView$Callbacks.this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
        //   133: invokestatic    android/support/v7/internal/widget/ActivityChooserView.access$000:(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
        //   136: invokevirtual   android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.getDataModel:()Landroid/support/v7/internal/widget/ActivityChooserModel;
        //   139: iload_3        
        //   140: invokevirtual   android/support/v7/internal/widget/ActivityChooserModel.chooseActivity:(I)Landroid/content/Intent;
        //   143: astore          14
        //   145: aload           14
        //   147: ifnull          170
        //   150: aload           14
        //   152: ldc             524288
        //   154: invokevirtual   android/content/Intent.addFlags:(I)Landroid/content/Intent;
        //   157: pop            
        //   158: aload_0        
        //   159: getfield        android/support/v7/internal/widget/ActivityChooserView$Callbacks.this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
        //   162: invokevirtual   android/support/v7/internal/widget/ActivityChooserView.getContext:()Landroid/content/Context;
        //   165: aload           14
        //   167: invokevirtual   android/content/Context.startActivity:(Landroid/content/Intent;)V
        //   170: iload           6
        //   172: ifne            40
        //   175: return         
        //   176: astore          18
        //   178: aload           18
        //   180: athrow         
        //   181: astore          7
        //   183: aload           7
        //   185: athrow         
        //   186: astore          8
        //   188: aload           8
        //   190: athrow         
        //   191: astore          9
        //   193: aload           9
        //   195: athrow         
        //   196: astore          10
        //   198: aload           10
        //   200: athrow         
        //   201: iinc            3, 1
        //   204: goto            129
        //   207: astore          16
        //   209: aload           16
        //   211: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  40     48     48     53     Ljava/lang/IllegalArgumentException;
        //  53     62     176    181    Ljava/lang/IllegalArgumentException;
        //  67     84     181    191    Ljava/lang/IllegalArgumentException;
        //  93     107    191    196    Ljava/lang/IllegalArgumentException;
        //  112    124    196    201    Ljava/lang/IllegalArgumentException;
        //  150    170    207    212    Ljava/lang/IllegalArgumentException;
        //  178    181    181    191    Ljava/lang/IllegalArgumentException;
        //  183    186    186    191    Ljava/lang/IllegalArgumentException;
        //  188    191    191    196    Ljava/lang/IllegalArgumentException;
        //  193    196    196    201    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 89, Size: 89
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
    
    public boolean onLongClick(final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/internal/widget/ActivityChooserView$Callbacks.this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
        //     4: invokestatic    android/support/v7/internal/widget/ActivityChooserView.access$700:(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/widget/FrameLayout;
        //     7: astore          5
        //     9: aload_1        
        //    10: aload           5
        //    12: if_acmpne       61
        //    15: aload_0        
        //    16: getfield        android/support/v7/internal/widget/ActivityChooserView$Callbacks.this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
        //    19: invokestatic    android/support/v7/internal/widget/ActivityChooserView.access$000:(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
        //    22: invokevirtual   android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.getCount:()I
        //    25: istore          6
        //    27: iload           6
        //    29: ifle            80
        //    32: aload_0        
        //    33: getfield        android/support/v7/internal/widget/ActivityChooserView$Callbacks.this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
        //    36: iconst_1       
        //    37: invokestatic    android/support/v7/internal/widget/ActivityChooserView.access$602:(Landroid/support/v7/internal/widget/ActivityChooserView;Z)Z
        //    40: pop            
        //    41: aload_0        
        //    42: getfield        android/support/v7/internal/widget/ActivityChooserView$Callbacks.this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
        //    45: aload_0        
        //    46: getfield        android/support/v7/internal/widget/ActivityChooserView$Callbacks.this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
        //    49: invokestatic    android/support/v7/internal/widget/ActivityChooserView.access$900:(Landroid/support/v7/internal/widget/ActivityChooserView;)I
        //    52: invokestatic    android/support/v7/internal/widget/ActivityChooserView.access$500:(Landroid/support/v7/internal/widget/ActivityChooserView;I)V
        //    55: getstatic       android/support/v7/internal/widget/AdapterViewCompat.a:I
        //    58: ifeq            80
        //    61: new             Ljava/lang/IllegalArgumentException;
        //    64: dup            
        //    65: invokespecial   java/lang/IllegalArgumentException.<init>:()V
        //    68: athrow         
        //    69: astore          4
        //    71: aload           4
        //    73: athrow         
        //    74: astore_2       
        //    75: aload_2        
        //    76: athrow         
        //    77: astore_3       
        //    78: aload_3        
        //    79: athrow         
        //    80: iconst_1       
        //    81: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      9      74     77     Ljava/lang/IllegalArgumentException;
        //  15     27     77     80     Ljava/lang/IllegalArgumentException;
        //  32     61     69     74     Ljava/lang/IllegalArgumentException;
        //  61     69     69     74     Ljava/lang/IllegalArgumentException;
        //  75     77     77     80     Ljava/lang/IllegalArgumentException;
        //  78     80     69     74     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0061:
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
}
