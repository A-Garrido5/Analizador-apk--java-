// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android;

import com.crashlytics.android.internal.bc;

final class ah extends bc
{
    private final float a;
    private /* synthetic */ af b;
    
    ah(final af b, final float a) {
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //     3: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //     6: ldc             "Crashlytics"
        //     8: new             Ljava/lang/StringBuilder;
        //    11: dup            
        //    12: ldc             "Starting report processing in "
        //    14: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    17: aload_0        
        //    18: getfield        com/crashlytics/android/ah.a:F
        //    21: invokevirtual   java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
        //    24: ldc             " second(s)..."
        //    26: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    29: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    32: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //    37: aload_0        
        //    38: getfield        com/crashlytics/android/ah.a:F
        //    41: fstore_3       
        //    42: fload_3        
        //    43: fconst_0       
        //    44: fcmpl          
        //    45: ifle            59
        //    48: ldc             1000.0
        //    50: aload_0        
        //    51: getfield        com/crashlytics/android/ah.a:F
        //    54: fmul           
        //    55: f2l            
        //    56: invokestatic    java/lang/Thread.sleep:(J)V
        //    59: invokestatic    com/crashlytics/android/d.a:()Lcom/crashlytics/android/d;
        //    62: astore          4
        //    64: aload           4
        //    66: invokevirtual   com/crashlytics/android/d.o:()Lcom/crashlytics/android/bc;
        //    69: astore          5
        //    71: aload_0        
        //    72: getfield        com/crashlytics/android/ah.b:Lcom/crashlytics/android/af;
        //    75: invokevirtual   com/crashlytics/android/af.a:()Ljava/util/List;
        //    78: astore          6
        //    80: aload           5
        //    82: invokevirtual   com/crashlytics/android/bc.a:()Z
        //    85: ifne            199
        //    88: aload           6
        //    90: invokeinterface java/util/List.isEmpty:()Z
        //    95: ifne            439
        //    98: aload           4
        //   100: invokevirtual   com/crashlytics/android/d.s:()Z
        //   103: ifne            439
        //   106: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   109: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   112: ldc             "Crashlytics"
        //   114: new             Ljava/lang/StringBuilder;
        //   117: dup            
        //   118: ldc             "User declined to send. Removing "
        //   120: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   123: aload           6
        //   125: invokeinterface java/util/List.size:()I
        //   130: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   133: ldc             " Report(s)."
        //   135: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   138: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   141: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   146: aload           6
        //   148: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   153: astore          18
        //   155: aload           18
        //   157: invokeinterface java/util/Iterator.hasNext:()Z
        //   162: ifeq            199
        //   165: aload           18
        //   167: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   172: checkcast       Lcom/crashlytics/android/ad;
        //   175: invokevirtual   com/crashlytics/android/ad.a:()Z
        //   178: pop            
        //   179: goto            155
        //   182: astore_1       
        //   183: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   186: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   189: ldc             "Crashlytics"
        //   191: ldc             "An unexpected error occurred while attempting to upload crash reports."
        //   193: aload_1        
        //   194: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   199: aload_0        
        //   200: getfield        com/crashlytics/android/ah.b:Lcom/crashlytics/android/af;
        //   203: aconst_null    
        //   204: invokestatic    com/crashlytics/android/af.a:(Lcom/crashlytics/android/af;Ljava/lang/Thread;)Ljava/lang/Thread;
        //   207: pop            
        //   208: return         
        //   209: astore          20
        //   211: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   214: invokevirtual   java/lang/Thread.interrupt:()V
        //   217: goto            199
        //   220: aload           6
        //   222: invokeinterface java/util/List.isEmpty:()Z
        //   227: ifne            199
        //   230: invokestatic    com/crashlytics/android/d.a:()Lcom/crashlytics/android/d;
        //   233: invokevirtual   com/crashlytics/android/d.o:()Lcom/crashlytics/android/bc;
        //   236: invokevirtual   com/crashlytics/android/bc.a:()Z
        //   239: ifne            199
        //   242: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   245: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   248: ldc             "Crashlytics"
        //   250: new             Ljava/lang/StringBuilder;
        //   253: dup            
        //   254: ldc             "Attempting to send "
        //   256: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   259: aload           6
        //   261: invokeinterface java/util/List.size:()I
        //   266: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   269: ldc             " report(s)"
        //   271: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   274: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   277: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   282: aload           6
        //   284: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   289: astore          8
        //   291: aload           8
        //   293: invokeinterface java/util/Iterator.hasNext:()Z
        //   298: ifeq            326
        //   301: aload           8
        //   303: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   308: checkcast       Lcom/crashlytics/android/ad;
        //   311: astore          16
        //   313: aload_0        
        //   314: getfield        com/crashlytics/android/ah.b:Lcom/crashlytics/android/af;
        //   317: aload           16
        //   319: invokevirtual   com/crashlytics/android/af.a:(Lcom/crashlytics/android/ad;)Z
        //   322: pop            
        //   323: goto            291
        //   326: aload_0        
        //   327: getfield        com/crashlytics/android/ah.b:Lcom/crashlytics/android/af;
        //   330: invokevirtual   com/crashlytics/android/af.a:()Ljava/util/List;
        //   333: astore          6
        //   335: aload           6
        //   337: invokeinterface java/util/List.isEmpty:()Z
        //   342: ifne            220
        //   345: invokestatic    com/crashlytics/android/af.b:()[S
        //   348: astore          9
        //   350: iload           7
        //   352: iconst_1       
        //   353: iadd           
        //   354: istore          10
        //   356: aload           9
        //   358: iload           7
        //   360: iconst_m1      
        //   361: invokestatic    com/crashlytics/android/af.b:()[S
        //   364: arraylength    
        //   365: iadd           
        //   366: invokestatic    java/lang/Math.min:(II)I
        //   369: saload         
        //   370: i2l            
        //   371: lstore          11
        //   373: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   376: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   379: ldc             "Crashlytics"
        //   381: new             Ljava/lang/StringBuilder;
        //   384: dup            
        //   385: ldc             "Report submisson: scheduling delayed retry in "
        //   387: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   390: lload           11
        //   392: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   395: ldc             " seconds"
        //   397: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   400: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   403: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   408: lload           11
        //   410: ldc2_w          1000
        //   413: lmul           
        //   414: lstore          13
        //   416: lload           13
        //   418: invokestatic    java/lang/Thread.sleep:(J)V
        //   421: iload           10
        //   423: istore          7
        //   425: goto            220
        //   428: astore          15
        //   430: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   433: invokevirtual   java/lang/Thread.interrupt:()V
        //   436: goto            199
        //   439: iconst_0       
        //   440: istore          7
        //   442: goto            220
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      42     182    199    Ljava/lang/Exception;
        //  48     59     209    220    Ljava/lang/InterruptedException;
        //  48     59     182    199    Ljava/lang/Exception;
        //  59     155    182    199    Ljava/lang/Exception;
        //  155    179    182    199    Ljava/lang/Exception;
        //  211    217    182    199    Ljava/lang/Exception;
        //  220    291    182    199    Ljava/lang/Exception;
        //  291    323    182    199    Ljava/lang/Exception;
        //  326    350    182    199    Ljava/lang/Exception;
        //  356    408    182    199    Ljava/lang/Exception;
        //  416    421    428    439    Ljava/lang/InterruptedException;
        //  416    421    182    199    Ljava/lang/Exception;
        //  430    436    182    199    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0059:
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
