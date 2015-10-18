// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.concurrent;

import java.util.concurrent.Callable;

class c implements Runnable
{
    final /* synthetic */ ObservablePromise a;
    final /* synthetic */ Callable b;
    final /* synthetic */ d c;
    final /* synthetic */ b d;
    
    c(final b d, final ObservablePromise a, final Callable b, final d c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/twitter/util/concurrent/c.a:Lcom/twitter/util/concurrent/ObservablePromise;
        //     4: invokevirtual   com/twitter/util/concurrent/ObservablePromise.isCancelled:()Z
        //     7: ifne            59
        //    10: aload_0        
        //    11: getfield        com/twitter/util/concurrent/c.b:Ljava/util/concurrent/Callable;
        //    14: invokeinterface java/util/concurrent/Callable.call:()Ljava/lang/Object;
        //    19: astore          4
        //    21: aload           4
        //    23: astore_2       
        //    24: aload_0        
        //    25: getfield        com/twitter/util/concurrent/c.a:Lcom/twitter/util/concurrent/ObservablePromise;
        //    28: aload_2        
        //    29: invokevirtual   com/twitter/util/concurrent/ObservablePromise.set:(Ljava/lang/Object;)V
        //    32: aload_0        
        //    33: getfield        com/twitter/util/concurrent/c.a:Lcom/twitter/util/concurrent/ObservablePromise;
        //    36: invokevirtual   com/twitter/util/concurrent/ObservablePromise.isCancelled:()Z
        //    39: ifeq            59
        //    42: aload_0        
        //    43: getfield        com/twitter/util/concurrent/c.c:Lcom/twitter/util/concurrent/d;
        //    46: ifnull          59
        //    49: aload_0        
        //    50: getfield        com/twitter/util/concurrent/c.c:Lcom/twitter/util/concurrent/d;
        //    53: aload_2        
        //    54: invokeinterface com/twitter/util/concurrent/d.a:(Ljava/lang/Object;)V
        //    59: return         
        //    60: astore_1       
        //    61: aconst_null    
        //    62: astore_2       
        //    63: aload_1        
        //    64: astore_3       
        //    65: aload_0        
        //    66: getfield        com/twitter/util/concurrent/c.a:Lcom/twitter/util/concurrent/ObservablePromise;
        //    69: aload_3        
        //    70: invokevirtual   com/twitter/util/concurrent/ObservablePromise.setException:(Ljava/lang/Throwable;)V
        //    73: goto            32
        //    76: astore_3       
        //    77: goto            65
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  10     21     60     65     Ljava/lang/Exception;
        //  24     32     76     80     Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0032:
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
