// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.content.res.Resources;
import com.twitter.library.api.ActivitySummary;
import android.view.View$OnClickListener;
import android.view.View;

public class fz
{
    public final View a;
    public final TweetStatView b;
    public final TweetStatView c;
    public final TweetStatView d;
    
    public fz(final View a, final View$OnClickListener onClickListener) {
        this.a = a;
        final TweetStatView b = (TweetStatView)a.findViewById(2131887259);
        b.setOnClickListener(onClickListener);
        this.b = b;
        final TweetStatView c = (TweetStatView)a.findViewById(2131887258);
        c.setOnClickListener(onClickListener);
        this.c = c;
        final TweetStatView d = (TweetStatView)a.findViewById(2131887257);
        d.setOnClickListener(onClickListener);
        this.d = d;
    }
    
    private void a(final TweetStatView tweetStatView, final String value, final String name) {
        if (ActivitySummary.a(value)) {
            tweetStatView.setValue(value);
            tweetStatView.setName(name);
            tweetStatView.setVisibility(0);
            return;
        }
        tweetStatView.setVisibility(8);
    }
    
    public void a(final Resources resources, final ActivitySummary activitySummary, final int n) {
        this.a(resources, activitySummary, n, false);
    }
    
    public void a(final Resources p0, final ActivitySummary p1, final int p2, final Boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/twitter/library/experiments/RelatedTweetsExperimentHelper.f:()Lcom/twitter/library/experiments/RelatedTweetsExperimentHelper$DesignTreatment;
        //     3: astore          5
        //     5: iload_3        
        //     6: ifle            177
        //     9: aload           5
        //    11: getstatic       com/twitter/library/experiments/RelatedTweetsExperimentHelper$DesignTreatment.b:Lcom/twitter/library/experiments/RelatedTweetsExperimentHelper$DesignTreatment;
        //    14: if_acmpne       177
        //    17: aload_0        
        //    18: getfield        com/twitter/android/widget/fz.a:Landroid/view/View;
        //    21: iconst_0       
        //    22: invokevirtual   android/view/View.setVisibility:(I)V
        //    25: aload           4
        //    27: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    30: ifeq            33
        //    33: aload           4
        //    35: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    38: ifeq            222
        //    41: ldc             2131427342
        //    43: istore          6
        //    45: aload           4
        //    47: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    50: ifeq            229
        //    53: ldc             2131427340
        //    55: istore          7
        //    57: aload           4
        //    59: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    62: ifeq            236
        //    65: ldc             2131297440
        //    67: istore          8
        //    69: aload_2        
        //    70: ifnull          145
        //    73: aload_2        
        //    74: getfield        com/twitter/library/api/ActivitySummary.b:Ljava/lang/String;
        //    77: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    80: istore          12
        //    82: iload           12
        //    84: ifle            243
        //    87: aload_0        
        //    88: aload_0        
        //    89: getfield        com/twitter/android/widget/fz.b:Lcom/twitter/android/widget/TweetStatView;
        //    92: aload_1        
        //    93: iload           12
        //    95: invokestatic    com/twitter/library/util/aj.b:(Landroid/content/res/Resources;I)Ljava/lang/String;
        //    98: aload_1        
        //    99: iload           6
        //   101: iload           12
        //   103: invokevirtual   android/content/res/Resources.getQuantityString:(II)Ljava/lang/String;
        //   106: invokespecial   com/twitter/android/widget/fz.a:(Lcom/twitter/android/widget/TweetStatView;Ljava/lang/String;Ljava/lang/String;)V
        //   109: aload_2        
        //   110: getfield        com/twitter/library/api/ActivitySummary.a:Ljava/lang/String;
        //   113: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   116: istore          11
        //   118: iload           11
        //   120: ifle            279
        //   123: aload_0        
        //   124: aload_0        
        //   125: getfield        com/twitter/android/widget/fz.c:Lcom/twitter/android/widget/TweetStatView;
        //   128: aload_1        
        //   129: iload           11
        //   131: invokestatic    com/twitter/library/util/aj.b:(Landroid/content/res/Resources;I)Ljava/lang/String;
        //   134: aload_1        
        //   135: iload           7
        //   137: iload           11
        //   139: invokevirtual   android/content/res/Resources.getQuantityString:(II)Ljava/lang/String;
        //   142: invokespecial   com/twitter/android/widget/fz.a:(Lcom/twitter/android/widget/TweetStatView;Ljava/lang/String;Ljava/lang/String;)V
        //   145: iload_3        
        //   146: ifle            315
        //   149: aload           5
        //   151: getstatic       com/twitter/library/experiments/RelatedTweetsExperimentHelper$DesignTreatment.b:Lcom/twitter/library/experiments/RelatedTweetsExperimentHelper$DesignTreatment;
        //   154: if_acmpne       315
        //   157: aload_0        
        //   158: aload_0        
        //   159: getfield        com/twitter/android/widget/fz.d:Lcom/twitter/android/widget/TweetStatView;
        //   162: aload_1        
        //   163: iload_3        
        //   164: invokestatic    com/twitter/library/util/aj.a:(Landroid/content/res/Resources;I)Ljava/lang/String;
        //   167: aload_1        
        //   168: iload           8
        //   170: invokevirtual   android/content/res/Resources.getString:(I)Ljava/lang/String;
        //   173: invokespecial   com/twitter/android/widget/fz.a:(Lcom/twitter/android/widget/TweetStatView;Ljava/lang/String;Ljava/lang/String;)V
        //   176: return         
        //   177: aload_2        
        //   178: ifnull          25
        //   181: aload_2        
        //   182: getfield        com/twitter/library/api/ActivitySummary.b:Ljava/lang/String;
        //   185: invokestatic    com/twitter/library/api/ActivitySummary.a:(Ljava/lang/String;)Z
        //   188: ifne            211
        //   191: aload_2        
        //   192: getfield        com/twitter/library/api/ActivitySummary.a:Ljava/lang/String;
        //   195: invokestatic    com/twitter/library/api/ActivitySummary.a:(Ljava/lang/String;)Z
        //   198: ifne            211
        //   201: aload_0        
        //   202: getfield        com/twitter/android/widget/fz.a:Landroid/view/View;
        //   205: bipush          8
        //   207: invokevirtual   android/view/View.setVisibility:(I)V
        //   210: return         
        //   211: aload_0        
        //   212: getfield        com/twitter/android/widget/fz.a:Landroid/view/View;
        //   215: iconst_0       
        //   216: invokevirtual   android/view/View.setVisibility:(I)V
        //   219: goto            25
        //   222: ldc             2131427362
        //   224: istore          6
        //   226: goto            45
        //   229: ldc             2131427360
        //   231: istore          7
        //   233: goto            57
        //   236: ldc             2131297890
        //   238: istore          8
        //   240: goto            69
        //   243: aload_0        
        //   244: getfield        com/twitter/android/widget/fz.b:Lcom/twitter/android/widget/TweetStatView;
        //   247: bipush          8
        //   249: invokevirtual   com/twitter/android/widget/TweetStatView.setVisibility:(I)V
        //   252: goto            109
        //   255: astore          9
        //   257: aload_0        
        //   258: aload_0        
        //   259: getfield        com/twitter/android/widget/fz.b:Lcom/twitter/android/widget/TweetStatView;
        //   262: aload_2        
        //   263: getfield        com/twitter/library/api/ActivitySummary.b:Ljava/lang/String;
        //   266: aload_1        
        //   267: iload           6
        //   269: iconst_0       
        //   270: invokevirtual   android/content/res/Resources.getQuantityString:(II)Ljava/lang/String;
        //   273: invokespecial   com/twitter/android/widget/fz.a:(Lcom/twitter/android/widget/TweetStatView;Ljava/lang/String;Ljava/lang/String;)V
        //   276: goto            109
        //   279: aload_0        
        //   280: getfield        com/twitter/android/widget/fz.c:Lcom/twitter/android/widget/TweetStatView;
        //   283: bipush          8
        //   285: invokevirtual   com/twitter/android/widget/TweetStatView.setVisibility:(I)V
        //   288: goto            145
        //   291: astore          10
        //   293: aload_0        
        //   294: aload_0        
        //   295: getfield        com/twitter/android/widget/fz.c:Lcom/twitter/android/widget/TweetStatView;
        //   298: aload_2        
        //   299: getfield        com/twitter/library/api/ActivitySummary.a:Ljava/lang/String;
        //   302: aload_1        
        //   303: iload           7
        //   305: iconst_0       
        //   306: invokevirtual   android/content/res/Resources.getQuantityString:(II)Ljava/lang/String;
        //   309: invokespecial   com/twitter/android/widget/fz.a:(Lcom/twitter/android/widget/TweetStatView;Ljava/lang/String;Ljava/lang/String;)V
        //   312: goto            145
        //   315: aload_0        
        //   316: getfield        com/twitter/android/widget/fz.d:Lcom/twitter/android/widget/TweetStatView;
        //   319: bipush          8
        //   321: invokevirtual   com/twitter/android/widget/TweetStatView.setVisibility:(I)V
        //   324: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  73     82     255    279    Ljava/lang/NumberFormatException;
        //  87     109    255    279    Ljava/lang/NumberFormatException;
        //  109    118    291    315    Ljava/lang/NumberFormatException;
        //  123    145    291    315    Ljava/lang/NumberFormatException;
        //  243    252    255    279    Ljava/lang/NumberFormatException;
        //  279    288    291    315    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0109:
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
