// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import java.util.concurrent.Callable;

public abstract class ac implements Callable
{
    protected abstract void a();
    
    protected abstract Object b();
    
    @Override
    public Object call() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_1       
        //     2: aload_0        
        //     3: invokevirtual   com/crashlytics/android/internal/ac.b:()Ljava/lang/Object;
        //     6: astore          6
        //     8: aload_0        
        //     9: invokevirtual   com/crashlytics/android/internal/ac.a:()V
        //    12: aload           6
        //    14: areturn        
        //    15: astore          7
        //    17: new             Lcom/crashlytics/android/internal/aD;
        //    20: dup            
        //    21: aload           7
        //    23: invokespecial   com/crashlytics/android/internal/aD.<init>:(Ljava/io/IOException;)V
        //    26: athrow         
        //    27: astore          5
        //    29: aload           5
        //    31: athrow         
        //    32: astore_2       
        //    33: aload_0        
        //    34: invokevirtual   com/crashlytics/android/internal/ac.a:()V
        //    37: aload_2        
        //    38: athrow         
        //    39: astore          4
        //    41: new             Lcom/crashlytics/android/internal/aD;
        //    44: dup            
        //    45: aload           4
        //    47: invokespecial   com/crashlytics/android/internal/aD.<init>:(Ljava/io/IOException;)V
        //    50: athrow         
        //    51: astore_3       
        //    52: iload_1        
        //    53: ifne            37
        //    56: new             Lcom/crashlytics/android/internal/aD;
        //    59: dup            
        //    60: aload_3        
        //    61: invokespecial   com/crashlytics/android/internal/aD.<init>:(Ljava/io/IOException;)V
        //    64: athrow         
        //    65: astore_2       
        //    66: iconst_0       
        //    67: istore_1       
        //    68: goto            33
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                 
        //  -----  -----  -----  -----  -------------------------------------
        //  2      8      27     32     Lcom/crashlytics/android/internal/aD;
        //  2      8      39     51     Ljava/io/IOException;
        //  2      8      65     71     Any
        //  8      12     15     27     Ljava/io/IOException;
        //  29     32     32     33     Any
        //  33     37     51     65     Ljava/io/IOException;
        //  41     51     32     33     Any
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
}
