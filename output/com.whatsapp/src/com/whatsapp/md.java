// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

final class md extends Thread
{
    private static final String z;
    final a9q a;
    
    static {
        final char[] charArray = "\u0013\u001d:|\u007f3\u0006\u0004`q$\u001d'\\v\"\u00175l".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u001e';
                    break;
                }
                case 0: {
                    c2 = 'P';
                    break;
                }
                case 1: {
                    c2 = 'r';
                    break;
                }
                case 2: {
                    c2 = 'T';
                    break;
                }
                case 3: {
                    c2 = '\b';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    md(final a9q a) {
        this.a = a;
        super(md.z);
    }
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/md.a:Lcom/whatsapp/a9q;
        //     4: invokestatic    com/whatsapp/a9q.b:(Lcom/whatsapp/a9q;)Lcom/whatsapp/a2r;
        //     7: invokestatic    com/whatsapp/a2r.a:(Lcom/whatsapp/a2r;)Ljava/util/Stack;
        //    10: invokevirtual   java/util/Stack.size:()I
        //    13: ifne            47
        //    16: aload_0        
        //    17: getfield        com/whatsapp/md.a:Lcom/whatsapp/a9q;
        //    20: invokestatic    com/whatsapp/a9q.b:(Lcom/whatsapp/a9q;)Lcom/whatsapp/a2r;
        //    23: invokestatic    com/whatsapp/a2r.a:(Lcom/whatsapp/a2r;)Ljava/util/Stack;
        //    26: astore          8
        //    28: aload           8
        //    30: monitorenter   
        //    31: aload_0        
        //    32: getfield        com/whatsapp/md.a:Lcom/whatsapp/a9q;
        //    35: invokestatic    com/whatsapp/a9q.b:(Lcom/whatsapp/a9q;)Lcom/whatsapp/a2r;
        //    38: invokestatic    com/whatsapp/a2r.a:(Lcom/whatsapp/a2r;)Ljava/util/Stack;
        //    41: invokevirtual   java/lang/Object.wait:()V
        //    44: aload           8
        //    46: monitorexit    
        //    47: aload_0        
        //    48: getfield        com/whatsapp/md.a:Lcom/whatsapp/a9q;
        //    51: invokestatic    com/whatsapp/a9q.b:(Lcom/whatsapp/a9q;)Lcom/whatsapp/a2r;
        //    54: invokestatic    com/whatsapp/a2r.a:(Lcom/whatsapp/a2r;)Ljava/util/Stack;
        //    57: invokevirtual   java/util/Stack.size:()I
        //    60: ifeq            198
        //    63: aload_0        
        //    64: getfield        com/whatsapp/md.a:Lcom/whatsapp/a9q;
        //    67: invokestatic    com/whatsapp/a9q.b:(Lcom/whatsapp/a9q;)Lcom/whatsapp/a2r;
        //    70: invokestatic    com/whatsapp/a2r.a:(Lcom/whatsapp/a2r;)Ljava/util/Stack;
        //    73: astore_3       
        //    74: aload_3        
        //    75: monitorenter   
        //    76: aload_0        
        //    77: getfield        com/whatsapp/md.a:Lcom/whatsapp/a9q;
        //    80: invokestatic    com/whatsapp/a9q.b:(Lcom/whatsapp/a9q;)Lcom/whatsapp/a2r;
        //    83: invokestatic    com/whatsapp/a2r.a:(Lcom/whatsapp/a2r;)Ljava/util/Stack;
        //    86: invokevirtual   java/util/Stack.pop:()Ljava/lang/Object;
        //    89: checkcast       Lcom/whatsapp/wn;
        //    92: astore          5
        //    94: aload_3        
        //    95: monitorexit    
        //    96: aload           5
        //    98: getfield        com/whatsapp/wn.a:Lcom/whatsapp/a_9;
        //   101: aload_0        
        //   102: getfield        com/whatsapp/md.a:Lcom/whatsapp/a9q;
        //   105: invokestatic    com/whatsapp/a9q.c:(Lcom/whatsapp/a9q;)I
        //   108: aload_0        
        //   109: getfield        com/whatsapp/md.a:Lcom/whatsapp/a9q;
        //   112: invokestatic    com/whatsapp/a9q.a:(Lcom/whatsapp/a9q;)F
        //   115: iconst_1       
        //   116: invokevirtual   com/whatsapp/a_9.a:(IFZ)Landroid/graphics/Bitmap;
        //   119: astore          6
        //   121: aload           5
        //   123: getfield        com/whatsapp/wn.b:Landroid/widget/ImageView;
        //   126: invokevirtual   android/widget/ImageView.getTag:()Ljava/lang/Object;
        //   129: aload           5
        //   131: getfield        com/whatsapp/wn.a:Lcom/whatsapp/a_9;
        //   134: aload_0        
        //   135: getfield        com/whatsapp/md.a:Lcom/whatsapp/a9q;
        //   138: invokestatic    com/whatsapp/a9q.c:(Lcom/whatsapp/a9q;)I
        //   141: aload_0        
        //   142: getfield        com/whatsapp/md.a:Lcom/whatsapp/a9q;
        //   145: invokestatic    com/whatsapp/a9q.a:(Lcom/whatsapp/a9q;)F
        //   148: invokevirtual   com/whatsapp/a_9.c:(IF)Ljava/lang/String;
        //   151: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   154: ifeq            198
        //   157: new             Lcom/whatsapp/ty;
        //   160: dup            
        //   161: aload_0        
        //   162: getfield        com/whatsapp/md.a:Lcom/whatsapp/a9q;
        //   165: aload           6
        //   167: aload           5
        //   169: getfield        com/whatsapp/wn.b:Landroid/widget/ImageView;
        //   172: aload           5
        //   174: getfield        com/whatsapp/wn.a:Lcom/whatsapp/a_9;
        //   177: invokespecial   com/whatsapp/ty.<init>:(Lcom/whatsapp/a9q;Landroid/graphics/Bitmap;Landroid/widget/ImageView;Lcom/whatsapp/a_9;)V
        //   180: astore          7
        //   182: aload           5
        //   184: getfield        com/whatsapp/wn.b:Landroid/widget/ImageView;
        //   187: invokevirtual   android/widget/ImageView.getContext:()Landroid/content/Context;
        //   190: checkcast       Landroid/app/Activity;
        //   193: aload           7
        //   195: invokevirtual   android/app/Activity.runOnUiThread:(Ljava/lang/Runnable;)V
        //   198: invokestatic    java/lang/Thread.interrupted:()Z
        //   201: istore_2       
        //   202: iload_2        
        //   203: ifeq            0
        //   206: return         
        //   207: astore          9
        //   209: aload           8
        //   211: monitorexit    
        //   212: aload           9
        //   214: athrow         
        //   215: astore_1       
        //   216: return         
        //   217: astore          4
        //   219: aload_3        
        //   220: monitorexit    
        //   221: aload           4
        //   223: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      31     215    217    Ljava/lang/InterruptedException;
        //  31     47     207    215    Any
        //  47     76     215    217    Ljava/lang/InterruptedException;
        //  76     96     217    224    Any
        //  96     198    215    217    Ljava/lang/InterruptedException;
        //  198    202    215    217    Ljava/lang/InterruptedException;
        //  209    212    207    215    Any
        //  212    215    215    217    Ljava/lang/InterruptedException;
        //  219    221    217    224    Any
        //  221    224    215    217    Ljava/lang/InterruptedException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0198:
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
