// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class z extends a
{
    private static final String[] z;
    final c2 a;
    final bf b;
    final bl c;
    
    static {
        final String[] z2 = new String[10];
        String s = "[l\u0006\u001c/Wl";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0282:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '[';
                        break;
                    }
                    case 0: {
                        c2 = '8';
                        break;
                    }
                    case 1: {
                        c2 = '\u001e';
                        break;
                    }
                    case 2: {
                        c2 = 'c';
                        break;
                    }
                    case 3: {
                        c2 = '}';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Qz";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "KA\f";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "[l\u0006\u001c/Qq\r";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "_l\f\b+";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "_l\f\b+";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "Kk\u0001\u0017>[j";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "KA\u0017";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "Lg\u0013\u0018";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "Qp\u0017\u0018)V\u007f\u000fP(]l\u0015\u0018)\u0015{\u0011\u000f4J";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    break Label_0282;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    z(final bf b, final bl c, final c2 a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public void a(final int p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/protocol/z.a:Lcom/whatsapp/protocol/c2;
        //     4: astore          6
        //     6: aload           6
        //     8: ifnull          53
        //    11: iload_1        
        //    12: sipush          500
        //    15: if_icmpne       43
        //    18: aload_2        
        //    19: ifnull          43
        //    22: aload_2        
        //    23: getstatic       com/whatsapp/protocol/z.z:[Ljava/lang/String;
        //    26: bipush          9
        //    28: aaload         
        //    29: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    32: istore          7
        //    34: iload           7
        //    36: ifeq            43
        //    39: sipush          -500
        //    42: istore_1       
        //    43: aload_0        
        //    44: getfield        com/whatsapp/protocol/z.a:Lcom/whatsapp/protocol/c2;
        //    47: iload_1        
        //    48: invokeinterface com/whatsapp/protocol/c2.a:(I)V
        //    53: return         
        //    54: astore_3       
        //    55: aload_3        
        //    56: athrow         
        //    57: astore          4
        //    59: aload           4
        //    61: athrow         
        //    62: astore          5
        //    64: aload           5
        //    66: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      6      54     62     Ljava/lang/NumberFormatException;
        //  22     34     62     67     Ljava/lang/NumberFormatException;
        //  55     57     57     62     Ljava/lang/NumberFormatException;
        //  59     62     62     67     Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0043:
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
    
    @Override
    public void a(final c0 p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: iconst_0       
        //     2: invokevirtual   com/whatsapp/protocol/c0.a:(I)Lcom/whatsapp/protocol/c0;
        //     5: astore_3       
        //     6: aload_3        
        //     7: getstatic       com/whatsapp/protocol/z.z:[Ljava/lang/String;
        //    10: iconst_4       
        //    11: aaload         
        //    12: invokestatic    com/whatsapp/protocol/c0.b:(Lcom/whatsapp/protocol/c0;Ljava/lang/String;)V
        //    15: aload_3        
        //    16: getstatic       com/whatsapp/protocol/z.z:[Ljava/lang/String;
        //    19: iconst_1       
        //    20: aaload         
        //    21: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //    24: astore          4
        //    26: aload_0        
        //    27: getfield        com/whatsapp/protocol/z.b:Lcom/whatsapp/protocol/bf;
        //    30: aload           4
        //    32: invokestatic    com/whatsapp/protocol/bf.a:(Lcom/whatsapp/protocol/bf;Ljava/lang/String;)Ljava/lang/String;
        //    35: astore          5
        //    37: aload_3        
        //    38: getstatic       com/whatsapp/protocol/z.z:[Ljava/lang/String;
        //    41: iconst_0       
        //    42: aaload         
        //    43: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //    46: astore          6
        //    48: aload_3        
        //    49: getstatic       com/whatsapp/protocol/z.z:[Ljava/lang/String;
        //    52: iconst_3       
        //    53: aaload         
        //    54: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //    57: astore          7
        //    59: lconst_0       
        //    60: lstore          8
        //    62: aload           7
        //    64: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //    67: lstore          23
        //    69: lload           23
        //    71: ldc2_w          1000
        //    74: lmul           
        //    75: lstore          8
        //    77: aload_3        
        //    78: getstatic       com/whatsapp/protocol/z.z:[Ljava/lang/String;
        //    81: bipush          6
        //    83: aaload         
        //    84: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //    87: astore          11
        //    89: aload_3        
        //    90: getstatic       com/whatsapp/protocol/z.z:[Ljava/lang/String;
        //    93: bipush          7
        //    95: aaload         
        //    96: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //    99: astore          12
        //   101: lconst_0       
        //   102: lstore          13
        //   104: aload           12
        //   106: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   109: lstore          21
        //   111: lload           21
        //   113: ldc2_w          1000
        //   116: lmul           
        //   117: lstore          13
        //   119: aload_3        
        //   120: getstatic       com/whatsapp/protocol/z.z:[Ljava/lang/String;
        //   123: iconst_2       
        //   124: aaload         
        //   125: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //   128: astore          16
        //   130: aload_3        
        //   131: getstatic       com/whatsapp/protocol/z.z:[Ljava/lang/String;
        //   134: bipush          8
        //   136: aaload         
        //   137: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //   140: astore          17
        //   142: new             Ljava/util/Hashtable;
        //   145: dup            
        //   146: invokespecial   java/util/Hashtable.<init>:()V
        //   149: astore          18
        //   151: new             Ljava/util/Hashtable;
        //   154: dup            
        //   155: invokespecial   java/util/Hashtable.<init>:()V
        //   158: astore          19
        //   160: aload_0        
        //   161: getfield        com/whatsapp/protocol/z.b:Lcom/whatsapp/protocol/bf;
        //   164: aload_1        
        //   165: aload           18
        //   167: aload           19
        //   169: getstatic       com/whatsapp/protocol/z.z:[Ljava/lang/String;
        //   172: iconst_5       
        //   173: aaload         
        //   174: invokestatic    com/whatsapp/protocol/bf.a:(Lcom/whatsapp/protocol/bf;Lcom/whatsapp/protocol/c0;Ljava/util/Hashtable;Ljava/util/Hashtable;Ljava/lang/String;)V
        //   177: aload_0        
        //   178: getfield        com/whatsapp/protocol/z.b:Lcom/whatsapp/protocol/bf;
        //   181: invokestatic    com/whatsapp/protocol/bf.b:(Lcom/whatsapp/protocol/bf;)Lcom/whatsapp/protocol/cg;
        //   184: aload           5
        //   186: aload           6
        //   188: lload           8
        //   190: aload           11
        //   192: lload           13
        //   194: aload           16
        //   196: aload           17
        //   198: aload           18
        //   200: aload           19
        //   202: invokeinterface com/whatsapp/protocol/cg.a:(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/Hashtable;Ljava/util/Hashtable;)V
        //   207: aload_0        
        //   208: getfield        com/whatsapp/protocol/z.c:Lcom/whatsapp/protocol/bl;
        //   211: ifnull          225
        //   214: aload_0        
        //   215: getfield        com/whatsapp/protocol/z.c:Lcom/whatsapp/protocol/bl;
        //   218: aload           5
        //   220: invokeinterface com/whatsapp/protocol/bl.a:(Ljava/lang/String;)V
        //   225: return         
        //   226: astore          20
        //   228: aload           20
        //   230: athrow         
        //   231: astore          10
        //   233: goto            77
        //   236: astore          15
        //   238: goto            119
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  62     69     231    236    Ljava/lang/NumberFormatException;
        //  104    111    236    241    Ljava/lang/NumberFormatException;
        //  160    225    226    231    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0119:
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
