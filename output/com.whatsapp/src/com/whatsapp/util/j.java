// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

class j extends Thread
{
    final b7 a;
    
    private j(final b7 a) {
        this.a = a;
    }
    
    j(final b7 b7, final c_ c_) {
        this(b7);
    }
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/util/j.a:Lcom/whatsapp/util/b7;
        //     4: invokestatic    com/whatsapp/util/b7.a:(Lcom/whatsapp/util/b7;)Lcom/whatsapp/util/bc;
        //     7: invokestatic    com/whatsapp/util/bc.a:(Lcom/whatsapp/util/bc;)Ljava/util/Stack;
        //    10: invokevirtual   java/util/Stack.size:()I
        //    13: ifne            47
        //    16: aload_0        
        //    17: getfield        com/whatsapp/util/j.a:Lcom/whatsapp/util/b7;
        //    20: invokestatic    com/whatsapp/util/b7.a:(Lcom/whatsapp/util/b7;)Lcom/whatsapp/util/bc;
        //    23: invokestatic    com/whatsapp/util/bc.a:(Lcom/whatsapp/util/bc;)Ljava/util/Stack;
        //    26: astore          12
        //    28: aload           12
        //    30: monitorenter   
        //    31: aload_0        
        //    32: getfield        com/whatsapp/util/j.a:Lcom/whatsapp/util/b7;
        //    35: invokestatic    com/whatsapp/util/b7.a:(Lcom/whatsapp/util/b7;)Lcom/whatsapp/util/bc;
        //    38: invokestatic    com/whatsapp/util/bc.a:(Lcom/whatsapp/util/bc;)Ljava/util/Stack;
        //    41: invokevirtual   java/lang/Object.wait:()V
        //    44: aload           12
        //    46: monitorexit    
        //    47: aload_0        
        //    48: getfield        com/whatsapp/util/j.a:Lcom/whatsapp/util/b7;
        //    51: invokestatic    com/whatsapp/util/b7.a:(Lcom/whatsapp/util/b7;)Lcom/whatsapp/util/bc;
        //    54: invokestatic    com/whatsapp/util/bc.a:(Lcom/whatsapp/util/bc;)Ljava/util/Stack;
        //    57: invokevirtual   java/util/Stack.size:()I
        //    60: ifeq            228
        //    63: aload_0        
        //    64: getfield        com/whatsapp/util/j.a:Lcom/whatsapp/util/b7;
        //    67: invokestatic    com/whatsapp/util/b7.a:(Lcom/whatsapp/util/b7;)Lcom/whatsapp/util/bc;
        //    70: invokestatic    com/whatsapp/util/bc.a:(Lcom/whatsapp/util/bc;)Ljava/util/Stack;
        //    73: astore_3       
        //    74: aload_3        
        //    75: monitorenter   
        //    76: aload_0        
        //    77: getfield        com/whatsapp/util/j.a:Lcom/whatsapp/util/b7;
        //    80: invokestatic    com/whatsapp/util/b7.a:(Lcom/whatsapp/util/b7;)Lcom/whatsapp/util/bc;
        //    83: invokestatic    com/whatsapp/util/bc.a:(Lcom/whatsapp/util/bc;)Ljava/util/Stack;
        //    86: invokevirtual   java/util/Stack.size:()I
        //    89: istore          5
        //    91: aconst_null    
        //    92: astore          6
        //    94: iload           5
        //    96: ifeq            117
        //    99: aload_0        
        //   100: getfield        com/whatsapp/util/j.a:Lcom/whatsapp/util/b7;
        //   103: invokestatic    com/whatsapp/util/b7.a:(Lcom/whatsapp/util/b7;)Lcom/whatsapp/util/bc;
        //   106: invokestatic    com/whatsapp/util/bc.a:(Lcom/whatsapp/util/bc;)Ljava/util/Stack;
        //   109: invokevirtual   java/util/Stack.pop:()Ljava/lang/Object;
        //   112: checkcast       Lcom/whatsapp/util/bn;
        //   115: astore          6
        //   117: aload_3        
        //   118: monitorexit    
        //   119: aload           6
        //   121: ifnull          228
        //   124: aload_0        
        //   125: getfield        com/whatsapp/util/j.a:Lcom/whatsapp/util/b7;
        //   128: aload           6
        //   130: invokestatic    com/whatsapp/util/b7.a:(Lcom/whatsapp/util/b7;Lcom/whatsapp/util/bn;)Landroid/graphics/Bitmap;
        //   133: astore          7
        //   135: aload_0        
        //   136: getfield        com/whatsapp/util/j.a:Lcom/whatsapp/util/b7;
        //   139: invokestatic    com/whatsapp/util/b7.c:(Lcom/whatsapp/util/b7;)Ljava/util/HashMap;
        //   142: astore          8
        //   144: aload           8
        //   146: monitorenter   
        //   147: aload_0        
        //   148: getfield        com/whatsapp/util/j.a:Lcom/whatsapp/util/b7;
        //   151: invokestatic    com/whatsapp/util/b7.c:(Lcom/whatsapp/util/b7;)Ljava/util/HashMap;
        //   154: aload           6
        //   156: getfield        com/whatsapp/util/bn.b:Ljava/lang/String;
        //   159: aload           7
        //   161: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   164: pop            
        //   165: aload           8
        //   167: monitorexit    
        //   168: aload           6
        //   170: getfield        com/whatsapp/util/bn.a:Landroid/widget/ImageView;
        //   173: invokevirtual   android/widget/ImageView.getTag:()Ljava/lang/Object;
        //   176: aload           6
        //   178: getfield        com/whatsapp/util/bn.b:Ljava/lang/String;
        //   181: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   184: ifeq            228
        //   187: new             Lcom/whatsapp/util/ap;
        //   190: dup            
        //   191: aload_0        
        //   192: getfield        com/whatsapp/util/j.a:Lcom/whatsapp/util/b7;
        //   195: aload           7
        //   197: aload           6
        //   199: getfield        com/whatsapp/util/bn.a:Landroid/widget/ImageView;
        //   202: aload           6
        //   204: getfield        com/whatsapp/util/bn.b:Ljava/lang/String;
        //   207: invokespecial   com/whatsapp/util/ap.<init>:(Lcom/whatsapp/util/b7;Landroid/graphics/Bitmap;Landroid/widget/ImageView;Ljava/lang/String;)V
        //   210: astore          11
        //   212: aload           6
        //   214: getfield        com/whatsapp/util/bn.a:Landroid/widget/ImageView;
        //   217: invokevirtual   android/widget/ImageView.getContext:()Landroid/content/Context;
        //   220: checkcast       Landroid/app/Activity;
        //   223: aload           11
        //   225: invokevirtual   android/app/Activity.runOnUiThread:(Ljava/lang/Runnable;)V
        //   228: invokestatic    java/lang/Thread.interrupted:()Z
        //   231: istore_2       
        //   232: iload_2        
        //   233: ifeq            0
        //   236: return         
        //   237: astore          13
        //   239: aload           12
        //   241: monitorexit    
        //   242: aload           13
        //   244: athrow         
        //   245: astore_1       
        //   246: return         
        //   247: astore          4
        //   249: aload_3        
        //   250: monitorexit    
        //   251: aload           4
        //   253: athrow         
        //   254: astore          9
        //   256: aload           8
        //   258: monitorexit    
        //   259: aload           9
        //   261: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      31     245    247    Ljava/lang/InterruptedException;
        //  31     47     237    245    Any
        //  47     76     245    247    Ljava/lang/InterruptedException;
        //  76     91     247    254    Any
        //  99     117    247    254    Any
        //  117    119    247    254    Any
        //  124    147    245    247    Ljava/lang/InterruptedException;
        //  147    168    254    262    Any
        //  168    228    245    247    Ljava/lang/InterruptedException;
        //  228    232    245    247    Ljava/lang/InterruptedException;
        //  239    242    237    245    Any
        //  242    245    245    247    Ljava/lang/InterruptedException;
        //  249    251    247    254    Any
        //  251    254    245    247    Ljava/lang/InterruptedException;
        //  256    259    254    262    Any
        //  259    262    245    247    Ljava/lang/InterruptedException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 121, Size: 121
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
}
