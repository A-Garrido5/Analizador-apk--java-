// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class qa extends Thread
{
    final x1 a;
    final boolean b;
    
    qa(final x1 a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: iconst_0       
        //     5: istore_2       
        //     6: aload_0        
        //     7: getfield        com/whatsapp/qa.b:Z
        //    10: ifne            55
        //    13: getstatic       com/whatsapp/adc.e:Z
        //    16: istore          8
        //    18: iload           8
        //    20: ifeq            55
        //    23: iload_2        
        //    24: ldc             45000
        //    26: if_icmpge       55
        //    29: iinc_w          2, 200
        //    35: ldc2_w          200
        //    38: invokestatic    java/lang/Thread.sleep:(J)V
        //    41: goto            6
        //    44: astore          9
        //    46: aload           9
        //    48: invokevirtual   java/lang/InterruptedException.printStackTrace:()V
        //    51: iload_1        
        //    52: ifeq            6
        //    55: iload_2        
        //    56: ldc             45000
        //    58: if_icmpge       72
        //    61: aload_0        
        //    62: getfield        com/whatsapp/qa.b:Z
        //    65: istore          7
        //    67: iload           7
        //    69: ifeq            81
        //    72: getstatic       com/whatsapp/adc.e:Z
        //    75: ifeq            81
        //    78: invokestatic    com/whatsapp/adc.e:()V
        //    81: return         
        //    82: astore_3       
        //    83: aload_3        
        //    84: athrow         
        //    85: astore          4
        //    87: aload           4
        //    89: athrow         
        //    90: astore          6
        //    92: aload           6
        //    94: athrow         
        //    95: astore          5
        //    97: aload           5
        //    99: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  6      18     82     90     Ljava/lang/InterruptedException;
        //  35     41     44     55     Ljava/lang/InterruptedException;
        //  61     67     90     95     Ljava/lang/InterruptedException;
        //  72     81     95     100    Ljava/lang/InterruptedException;
        //  83     85     85     90     Ljava/lang/InterruptedException;
        //  92     95     95     100    Ljava/lang/InterruptedException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 47, Size: 47
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
