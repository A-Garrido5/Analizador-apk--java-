// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

final class e4 implements UncaughtExceptionHandler
{
    private static final String[] z;
    private final UncaughtExceptionHandler a;
    
    static {
        final String[] z2 = new String[3];
        String s = "JB\u0011\toz\f\u0004\u0004#|^\u0015\nwz\f\u0013\u0019blDP\u0018fqX\u0019\u0005fs\f\u0016\u0002oz";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0003';
                        break;
                    }
                    case 0: {
                        c2 = '\u001f';
                        break;
                    }
                    case 1: {
                        c2 = ',';
                        break;
                    }
                    case 2: {
                        c2 = 'p';
                        break;
                    }
                    case 3: {
                        c2 = 'k';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "zT\u0013\u000eskE\u001f\u0005,{C\u001e\u000e.hM\u0019\u001fjqK";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "Jb3*VXd$KFGo5;WVc>";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    e4() {
        this.a = Thread.getDefaultUncaughtExceptionHandler();
    }
    
    @Override
    public void uncaughtException(final Thread p0, final Throwable p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_3       
        //     4: getstatic       com/whatsapp/e4.z:[Ljava/lang/String;
        //     7: iconst_2       
        //     8: aaload         
        //     9: aload_2        
        //    10: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    13: invokestatic    com/whatsapp/App.aH:()Ljava/io/File;
        //    16: invokevirtual   java/io/File.createNewFile:()Z
        //    19: pop            
        //    20: invokestatic    com/whatsapp/App.aI:()V
        //    23: invokestatic    com/whatsapp/App.aK:()Ljava/lang/Object;
        //    26: astore          14
        //    28: aload           14
        //    30: monitorenter   
        //    31: getstatic       com/whatsapp/e4.z:[Ljava/lang/String;
        //    34: iconst_1       
        //    35: aaload         
        //    36: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    39: aload           14
        //    41: monitorexit    
        //    42: aload_2        
        //    43: instanceof      Lcom/whatsapp/protocol/b0;
        //    46: ifeq            87
        //    49: aload_2        
        //    50: checkcast       Lcom/whatsapp/protocol/b0;
        //    53: astore          12
        //    55: aload           12
        //    57: invokevirtual   com/whatsapp/protocol/b0.getMessage:()Ljava/lang/String;
        //    60: aload           12
        //    62: invokevirtual   com/whatsapp/protocol/b0.a:()Ljava/lang/Throwable;
        //    65: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    68: aload_0        
        //    69: getfield        com/whatsapp/e4.a:Ljava/lang/Thread$UncaughtExceptionHandler;
        //    72: aload_1        
        //    73: aload           12
        //    75: invokevirtual   com/whatsapp/protocol/b0.a:()Ljava/lang/Throwable;
        //    78: invokeinterface java/lang/Thread$UncaughtExceptionHandler.uncaughtException:(Ljava/lang/Thread;Ljava/lang/Throwable;)V
        //    83: iload_3        
        //    84: ifeq            98
        //    87: aload_0        
        //    88: getfield        com/whatsapp/e4.a:Ljava/lang/Thread$UncaughtExceptionHandler;
        //    91: aload_1        
        //    92: aload_2        
        //    93: invokeinterface java/lang/Thread$UncaughtExceptionHandler.uncaughtException:(Ljava/lang/Thread;Ljava/lang/Throwable;)V
        //    98: return         
        //    99: astore          15
        //   101: aload           14
        //   103: monitorexit    
        //   104: aload           15
        //   106: athrow         
        //   107: astore          10
        //   109: getstatic       com/whatsapp/e4.z:[Ljava/lang/String;
        //   112: iconst_0       
        //   113: aaload         
        //   114: aload           10
        //   116: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   119: goto            42
        //   122: astore          7
        //   124: aload_2        
        //   125: instanceof      Lcom/whatsapp/protocol/b0;
        //   128: ifeq            169
        //   131: aload_2        
        //   132: checkcast       Lcom/whatsapp/protocol/b0;
        //   135: astore          9
        //   137: aload           9
        //   139: invokevirtual   com/whatsapp/protocol/b0.getMessage:()Ljava/lang/String;
        //   142: aload           9
        //   144: invokevirtual   com/whatsapp/protocol/b0.a:()Ljava/lang/Throwable;
        //   147: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   150: aload_0        
        //   151: getfield        com/whatsapp/e4.a:Ljava/lang/Thread$UncaughtExceptionHandler;
        //   154: aload_1        
        //   155: aload           9
        //   157: invokevirtual   com/whatsapp/protocol/b0.a:()Ljava/lang/Throwable;
        //   160: invokeinterface java/lang/Thread$UncaughtExceptionHandler.uncaughtException:(Ljava/lang/Thread;Ljava/lang/Throwable;)V
        //   165: iload_3        
        //   166: ifeq            98
        //   169: aload_0        
        //   170: getfield        com/whatsapp/e4.a:Ljava/lang/Thread$UncaughtExceptionHandler;
        //   173: aload_1        
        //   174: aload_2        
        //   175: invokeinterface java/lang/Thread$UncaughtExceptionHandler.uncaughtException:(Ljava/lang/Thread;Ljava/lang/Throwable;)V
        //   180: return         
        //   181: astore          8
        //   183: aload           8
        //   185: athrow         
        //   186: astore          11
        //   188: aload           11
        //   190: athrow         
        //   191: astore          4
        //   193: aload_2        
        //   194: instanceof      Lcom/whatsapp/protocol/b0;
        //   197: ifeq            238
        //   200: aload_2        
        //   201: checkcast       Lcom/whatsapp/protocol/b0;
        //   204: astore          6
        //   206: aload           6
        //   208: invokevirtual   com/whatsapp/protocol/b0.getMessage:()Ljava/lang/String;
        //   211: aload           6
        //   213: invokevirtual   com/whatsapp/protocol/b0.a:()Ljava/lang/Throwable;
        //   216: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   219: aload_0        
        //   220: getfield        com/whatsapp/e4.a:Ljava/lang/Thread$UncaughtExceptionHandler;
        //   223: aload_1        
        //   224: aload           6
        //   226: invokevirtual   com/whatsapp/protocol/b0.a:()Ljava/lang/Throwable;
        //   229: invokeinterface java/lang/Thread$UncaughtExceptionHandler.uncaughtException:(Ljava/lang/Thread;Ljava/lang/Throwable;)V
        //   234: iload_3        
        //   235: ifeq            249
        //   238: aload_0        
        //   239: getfield        com/whatsapp/e4.a:Ljava/lang/Thread$UncaughtExceptionHandler;
        //   242: aload_1        
        //   243: aload_2        
        //   244: invokeinterface java/lang/Thread$UncaughtExceptionHandler.uncaughtException:(Ljava/lang/Thread;Ljava/lang/Throwable;)V
        //   249: aload           4
        //   251: athrow         
        //   252: astore          5
        //   254: aload           5
        //   256: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      13     122    186    Ljava/lang/Exception;
        //  4      13     191    257    Any
        //  13     31     107    122    Ljava/lang/Exception;
        //  13     31     191    257    Any
        //  31     42     99     107    Any
        //  55     83     186    191    Ljava/lang/Exception;
        //  87     98     186    191    Ljava/lang/Exception;
        //  101    104    99     107    Any
        //  104    107    107    122    Ljava/lang/Exception;
        //  104    107    191    257    Any
        //  109    119    122    186    Ljava/lang/Exception;
        //  109    119    191    257    Any
        //  137    165    181    186    Ljava/lang/Exception;
        //  169    180    181    186    Ljava/lang/Exception;
        //  206    234    252    257    Ljava/lang/Exception;
        //  238    249    252    257    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0087:
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
