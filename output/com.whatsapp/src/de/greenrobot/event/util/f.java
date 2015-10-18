// 
// Decompiled by Procyon v0.5.30
// 

package de.greenrobot.event.util;

class f implements Runnable
{
    private static final String[] z;
    final b a;
    final h b;
    
    static {
        final String[] z2 = new String[2];
        String s = "/g8e~\u000et=\"r\u0018v4rc\tz?8";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0017';
                        break;
                    }
                    case 0: {
                        c2 = '`';
                        break;
                    }
                    case 1: {
                        c2 = '\u0015';
                        break;
                    }
                    case 2: {
                        c2 = 'Q';
                        break;
                    }
                    case 3: {
                        c2 = '\u0002';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "#z$ns@{>v7\u0003g4cc\u000557c~\f`#g7\u0005c4lc";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    f(final h b, final b a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        de/greenrobot/event/util/f.a:Lde/greenrobot/event/util/b;
        //     4: invokeinterface de/greenrobot/event/util/b.a:()V
        //     9: return         
        //    10: astore_1       
        //    11: aload_0        
        //    12: getfield        de/greenrobot/event/util/f.b:Lde/greenrobot/event/util/h;
        //    15: invokestatic    de/greenrobot/event/util/h.b:(Lde/greenrobot/event/util/h;)Ljava/lang/reflect/Constructor;
        //    18: iconst_1       
        //    19: anewarray       Ljava/lang/Object;
        //    22: dup            
        //    23: iconst_0       
        //    24: aload_1        
        //    25: aastore        
        //    26: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        //    29: astore          4
        //    31: aload           4
        //    33: instanceof      Lde/greenrobot/event/util/m;
        //    36: ifeq            56
        //    39: aload           4
        //    41: checkcast       Lde/greenrobot/event/util/m;
        //    44: aload_0        
        //    45: getfield        de/greenrobot/event/util/f.b:Lde/greenrobot/event/util/h;
        //    48: invokestatic    de/greenrobot/event/util/h.c:(Lde/greenrobot/event/util/h;)Ljava/lang/Object;
        //    51: invokeinterface de/greenrobot/event/util/m.a:(Ljava/lang/Object;)V
        //    56: aload_0        
        //    57: getfield        de/greenrobot/event/util/f.b:Lde/greenrobot/event/util/h;
        //    60: invokestatic    de/greenrobot/event/util/h.a:(Lde/greenrobot/event/util/h;)Lde/greenrobot/event/m;
        //    63: aload           4
        //    65: invokevirtual   de/greenrobot/event/m.b:(Ljava/lang/Object;)V
        //    68: return         
        //    69: astore_2       
        //    70: getstatic       de/greenrobot/event/m.s:Ljava/lang/String;
        //    73: getstatic       de/greenrobot/event/util/f.z:[Ljava/lang/String;
        //    76: iconst_0       
        //    77: aaload         
        //    78: aload_1        
        //    79: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    82: pop            
        //    83: new             Ljava/lang/RuntimeException;
        //    86: dup            
        //    87: getstatic       de/greenrobot/event/util/f.z:[Ljava/lang/String;
        //    90: iconst_1       
        //    91: aaload         
        //    92: aload_2        
        //    93: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    96: athrow         
        //    97: astore          5
        //    99: aload           5
        //   101: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      9      10     102    Ljava/lang/Exception;
        //  11     31     69     97     Ljava/lang/Exception;
        //  31     56     97     102    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0056:
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
