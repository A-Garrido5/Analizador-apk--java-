// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import java.io.File;

class ca implements Runnable
{
    private static final String[] z;
    final GoogleDriveService a;
    final String b;
    final File c;
    
    static {
        final String[] z2 = new String[3];
        String s = "6u2\u0013\u00074<3\u001f\u0003'x#\u001f^3p#\u0011\u0004!<&\u0013\u001d4";
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
                        c2 = 'q';
                        break;
                    }
                    case 0: {
                        c2 = 'Q';
                        break;
                    }
                    case 1: {
                        c2 = '\u0011';
                        break;
                    }
                    case 2: {
                        c2 = '@';
                        break;
                    }
                    case 3: {
                        c2 = 'z';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "6u2\u0013\u00074<3\u001f\u0003'x#\u001f^3p#\u0011\u0004!<&\u0013\u001d4";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "6u2\u0013\u00074<3\u001f\u0003'x#\u001f^3p#\u0011\u0004!<&\u0013\u001d41&\u001b\u0018=t$Z\u001e?1";
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
    
    ca(final GoogleDriveService a, final File c, final String b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_1       
        //     2: aload_0        
        //     3: getfield        com/whatsapp/gdrive/ca.a:Lcom/whatsapp/gdrive/GoogleDriveService;
        //     6: aload_0        
        //     7: getfield        com/whatsapp/gdrive/ca.c:Ljava/io/File;
        //    10: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //    13: aload_0        
        //    14: getfield        com/whatsapp/gdrive/ca.b:Ljava/lang/String;
        //    17: aconst_null    
        //    18: aconst_null    
        //    19: iconst_1       
        //    20: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Z
        //    23: istore          7
        //    25: iload           7
        //    27: istore          4
        //    29: aload_0        
        //    30: getfield        com/whatsapp/gdrive/ca.a:Lcom/whatsapp/gdrive/GoogleDriveService;
        //    33: iload           4
        //    35: aload_0        
        //    36: getfield        com/whatsapp/gdrive/ca.a:Lcom/whatsapp/gdrive/GoogleDriveService;
        //    39: invokestatic    com/whatsapp/gdrive/GoogleDriveService.b:(Lcom/whatsapp/gdrive/GoogleDriveService;)Z
        //    42: iand           
        //    43: invokestatic    com/whatsapp/gdrive/GoogleDriveService.a:(Lcom/whatsapp/gdrive/GoogleDriveService;Z)Z
        //    46: pop            
        //    47: aload_0        
        //    48: getfield        com/whatsapp/gdrive/ca.a:Lcom/whatsapp/gdrive/GoogleDriveService;
        //    51: invokestatic    com/whatsapp/gdrive/GoogleDriveService.a:(Lcom/whatsapp/gdrive/GoogleDriveService;)Ljava/util/concurrent/CountDownLatch;
        //    54: invokevirtual   java/util/concurrent/CountDownLatch.countDown:()V
        //    57: iload           4
        //    59: ifne            99
        //    62: invokestatic    com/whatsapp/gdrive/GoogleDriveService.O:()Z
        //    65: ifeq            99
        //    68: new             Ljava/lang/StringBuilder;
        //    71: dup            
        //    72: invokespecial   java/lang/StringBuilder.<init>:()V
        //    75: getstatic       com/whatsapp/gdrive/ca.z:[Ljava/lang/String;
        //    78: iconst_2       
        //    79: aaload         
        //    80: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    83: aload_0        
        //    84: getfield        com/whatsapp/gdrive/ca.c:Ljava/io/File;
        //    87: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //    90: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    93: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    96: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    99: return         
        //   100: astore          6
        //   102: iconst_0       
        //   103: istore          4
        //   105: getstatic       com/whatsapp/gdrive/ca.z:[Ljava/lang/String;
        //   108: iconst_0       
        //   109: aaload         
        //   110: aload           6
        //   112: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   115: aload_0        
        //   116: getfield        com/whatsapp/gdrive/ca.a:Lcom/whatsapp/gdrive/GoogleDriveService;
        //   119: invokestatic    com/whatsapp/gdrive/GoogleDriveService.a:(Lcom/whatsapp/gdrive/GoogleDriveService;)Ljava/util/concurrent/CountDownLatch;
        //   122: invokevirtual   java/util/concurrent/CountDownLatch.countDown:()V
        //   125: goto            57
        //   128: astore_3       
        //   129: getstatic       com/whatsapp/gdrive/ca.z:[Ljava/lang/String;
        //   132: iconst_1       
        //   133: aaload         
        //   134: aload_3        
        //   135: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   138: aload_0        
        //   139: getfield        com/whatsapp/gdrive/ca.a:Lcom/whatsapp/gdrive/GoogleDriveService;
        //   142: invokestatic    com/whatsapp/gdrive/GoogleDriveService.a:(Lcom/whatsapp/gdrive/GoogleDriveService;)Ljava/util/concurrent/CountDownLatch;
        //   145: invokevirtual   java/util/concurrent/CountDownLatch.countDown:()V
        //   148: iload_1        
        //   149: istore          4
        //   151: goto            57
        //   154: astore_2       
        //   155: aload_0        
        //   156: getfield        com/whatsapp/gdrive/ca.a:Lcom/whatsapp/gdrive/GoogleDriveService;
        //   159: invokestatic    com/whatsapp/gdrive/GoogleDriveService.a:(Lcom/whatsapp/gdrive/GoogleDriveService;)Ljava/util/concurrent/CountDownLatch;
        //   162: invokevirtual   java/util/concurrent/CountDownLatch.countDown:()V
        //   165: aload_2        
        //   166: athrow         
        //   167: astore          5
        //   169: aload           5
        //   171: athrow         
        //   172: astore_3       
        //   173: iload           4
        //   175: istore_1       
        //   176: goto            129
        //   179: astore          6
        //   181: goto            105
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  2      25     100    105    Lcom/whatsapp/gdrive/bc;
        //  2      25     128    129    Lcom/whatsapp/gdrive/b2;
        //  2      25     154    167    Any
        //  29     47     179    184    Lcom/whatsapp/gdrive/bc;
        //  29     47     172    179    Lcom/whatsapp/gdrive/b2;
        //  29     47     154    167    Any
        //  62     99     167    172    Lcom/whatsapp/gdrive/bc;
        //  105    115    154    167    Any
        //  129    138    154    167    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0057:
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
