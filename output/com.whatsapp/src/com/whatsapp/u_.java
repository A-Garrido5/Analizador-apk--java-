// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class u_ extends Thread
{
    private Object a;
    final VideoPreviewActivity b;
    private long c;
    
    u_(final VideoPreviewActivity b) {
        this.b = b;
        this.c = -1L;
        this.a = new Object();
    }
    
    public void a(final long c) {
        synchronized (this.a) {
            this.c = c;
            this.a.notifyAll();
        }
    }
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc2_w          -1
        //     3: lstore_1       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/u_.a:Ljava/lang/Object;
        //     8: astore          4
        //    10: aload           4
        //    12: monitorenter   
        //    13: aload_0        
        //    14: getfield        com/whatsapp/u_.c:J
        //    17: lload_1        
        //    18: lcmp           
        //    19: ifne            29
        //    22: aload_0        
        //    23: getfield        com/whatsapp/u_.a:Ljava/lang/Object;
        //    26: invokevirtual   java/lang/Object.wait:()V
        //    29: aload_0        
        //    30: getfield        com/whatsapp/u_.c:J
        //    33: lstore_1       
        //    34: aload           4
        //    36: monitorexit    
        //    37: aload_0        
        //    38: getfield        com/whatsapp/u_.b:Lcom/whatsapp/VideoPreviewActivity;
        //    41: invokestatic    com/whatsapp/VideoPreviewActivity.c:(Lcom/whatsapp/VideoPreviewActivity;)Lcom/whatsapp/VideoView;
        //    44: invokevirtual   com/whatsapp/VideoView.isPlaying:()Z
        //    47: ifne            4
        //    50: aload_0        
        //    51: getfield        com/whatsapp/u_.b:Lcom/whatsapp/VideoPreviewActivity;
        //    54: ldc2_w          1000
        //    57: lload_1        
        //    58: lmul           
        //    59: invokevirtual   com/whatsapp/VideoPreviewActivity.a:(J)Landroid/graphics/Bitmap;
        //    62: astore          6
        //    64: aload           6
        //    66: ifnull          4
        //    69: aload_0        
        //    70: getfield        com/whatsapp/u_.b:Lcom/whatsapp/VideoPreviewActivity;
        //    73: new             Lcom/whatsapp/tu;
        //    76: dup            
        //    77: aload_0        
        //    78: aload           6
        //    80: invokespecial   com/whatsapp/tu.<init>:(Lcom/whatsapp/u_;Landroid/graphics/Bitmap;)V
        //    83: invokevirtual   com/whatsapp/VideoPreviewActivity.runOnUiThread:(Ljava/lang/Runnable;)V
        //    86: goto            4
        //    89: astore          7
        //    91: aload           7
        //    93: athrow         
        //    94: astore_3       
        //    95: return         
        //    96: astore          5
        //    98: aload           4
        //   100: monitorexit    
        //   101: aload           5
        //   103: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      13     94     96     Ljava/lang/InterruptedException;
        //  13     29     96     104    Any
        //  29     37     96     104    Any
        //  37     64     94     96     Ljava/lang/InterruptedException;
        //  69     86     89     94     Ljava/lang/InterruptedException;
        //  91     94     94     96     Ljava/lang/InterruptedException;
        //  98     101    96     104    Any
        //  101    104    94     96     Ljava/lang/InterruptedException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0029:
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
