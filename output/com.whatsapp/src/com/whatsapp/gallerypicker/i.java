// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

class i implements Runnable
{
    final a_ a;
    
    private i(final a_ a) {
        this.a = a;
    }
    
    i(final a_ a_, final p p2) {
        this(a_);
    }
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gallerypicker/MediaGalleryBase.v:I
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/gallerypicker/i.a:Lcom/whatsapp/gallerypicker/a_;
        //     8: invokestatic    com/whatsapp/gallerypicker/a_.c:(Lcom/whatsapp/gallerypicker/a_;)Ljava/util/ArrayList;
        //    11: astore_2       
        //    12: aload_2        
        //    13: monitorenter   
        //    14: aload_0        
        //    15: getfield        com/whatsapp/gallerypicker/i.a:Lcom/whatsapp/gallerypicker/a_;
        //    18: invokestatic    com/whatsapp/gallerypicker/a_.a:(Lcom/whatsapp/gallerypicker/a_;)Z
        //    21: ifeq            30
        //    24: aload_2        
        //    25: monitorexit    
        //    26: iload_1        
        //    27: ifeq            198
        //    30: aload_0        
        //    31: getfield        com/whatsapp/gallerypicker/i.a:Lcom/whatsapp/gallerypicker/a_;
        //    34: invokestatic    com/whatsapp/gallerypicker/a_.c:(Lcom/whatsapp/gallerypicker/a_;)Ljava/util/ArrayList;
        //    37: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //    40: ifne            166
        //    43: aload_0        
        //    44: getfield        com/whatsapp/gallerypicker/i.a:Lcom/whatsapp/gallerypicker/a_;
        //    47: invokestatic    com/whatsapp/gallerypicker/a_.c:(Lcom/whatsapp/gallerypicker/a_;)Ljava/util/ArrayList;
        //    50: iconst_0       
        //    51: invokevirtual   java/util/ArrayList.remove:(I)Ljava/lang/Object;
        //    54: checkcast       Lcom/whatsapp/gallerypicker/z;
        //    57: astore          5
        //    59: aload_2        
        //    60: monitorexit    
        //    61: aload           5
        //    63: getfield        com/whatsapp/gallerypicker/z.a:Lcom/whatsapp/gallerypicker/b8;
        //    66: astore          6
        //    68: invokestatic    com/whatsapp/gallerypicker/a_.b:()Landroid/support/v4/util/LruCache;
        //    71: aload           6
        //    73: invokeinterface com/whatsapp/gallerypicker/b8.a:()Ljava/lang/String;
        //    78: invokevirtual   android/support/v4/util/LruCache.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    81: checkcast       Landroid/graphics/Bitmap;
        //    84: astore          7
        //    86: aload           7
        //    88: ifnonnull       191
        //    91: aload           5
        //    93: getfield        com/whatsapp/gallerypicker/z.a:Lcom/whatsapp/gallerypicker/b8;
        //    96: invokeinterface com/whatsapp/gallerypicker/b8.b:()Landroid/graphics/Bitmap;
        //   101: astore          13
        //   103: aload           13
        //   105: astore          8
        //   107: aload           8
        //   109: ifnull          4
        //   112: invokestatic    com/whatsapp/gallerypicker/a_.b:()Landroid/support/v4/util/LruCache;
        //   115: aload           5
        //   117: getfield        com/whatsapp/gallerypicker/z.a:Lcom/whatsapp/gallerypicker/b8;
        //   120: invokeinterface com/whatsapp/gallerypicker/b8.a:()Ljava/lang/String;
        //   125: aload           8
        //   127: invokevirtual   android/support/v4/util/LruCache.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   130: pop            
        //   131: aload           5
        //   133: getfield        com/whatsapp/gallerypicker/z.b:Lcom/whatsapp/gallerypicker/b5;
        //   136: astore          10
        //   138: aload_0        
        //   139: getfield        com/whatsapp/gallerypicker/i.a:Lcom/whatsapp/gallerypicker/a_;
        //   142: invokestatic    com/whatsapp/gallerypicker/a_.b:(Lcom/whatsapp/gallerypicker/a_;)Landroid/os/Handler;
        //   145: new             Lcom/whatsapp/gallerypicker/bn;
        //   148: dup            
        //   149: aload_0        
        //   150: aload           10
        //   152: aload           8
        //   154: aload           7
        //   156: invokespecial   com/whatsapp/gallerypicker/bn.<init>:(Lcom/whatsapp/gallerypicker/i;Lcom/whatsapp/gallerypicker/b5;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
        //   159: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   162: pop            
        //   163: goto            4
        //   166: aload_0        
        //   167: getfield        com/whatsapp/gallerypicker/i.a:Lcom/whatsapp/gallerypicker/a_;
        //   170: invokestatic    com/whatsapp/gallerypicker/a_.c:(Lcom/whatsapp/gallerypicker/a_;)Ljava/util/ArrayList;
        //   173: invokevirtual   java/lang/Object.wait:()V
        //   176: aload_2        
        //   177: monitorexit    
        //   178: goto            4
        //   181: astore_3       
        //   182: aload_2        
        //   183: monitorexit    
        //   184: aload_3        
        //   185: athrow         
        //   186: astore          12
        //   188: aload           12
        //   190: athrow         
        //   191: aload           7
        //   193: astore          8
        //   195: goto            107
        //   198: return         
        //   199: astore          4
        //   201: goto            176
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  14     26     181    186    Any
        //  30     61     181    186    Any
        //  91     103    186    191    Ljava/lang/InterruptedException;
        //  166    176    199    204    Ljava/lang/InterruptedException;
        //  166    176    181    186    Any
        //  176    178    181    186    Any
        //  182    184    181    186    Any
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
}
