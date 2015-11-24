// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class aj extends a
{
    private static final String[] z;
    final bf a;
    final String b;
    final String c;
    final String d;
    final String e;
    
    static {
        final String[] z2 = new String[6];
        String s = "]\n";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'p';
                        break;
                    }
                    case 0: {
                        c2 = '2';
                        break;
                    }
                    case 1: {
                        c2 = 'y';
                        break;
                    }
                    case 2: {
                        c2 = '\u0012';
                        break;
                    }
                    case 3: {
                        c2 = '*';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "P\u000b}]\u0003W\u000b";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "B\u0015s^\u0016]\u000b\u007f";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "F\u0010\u007fO\u001fG\r";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "A\u0000|I";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "F\u0000bO";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    aj(final bf a, final String d, final String e, final String c, final String b) {
        this.a = a;
        this.d = d;
        this.e = e;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public void a(final int n) {
        this.a.w.c(this.d, n);
    }
    
    @Override
    public void a(final c0 p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_3       
        //     2: aload_1        
        //     3: ifnull          184
        //     6: aload_1        
        //     7: getstatic       com/whatsapp/protocol/aj.z:[Ljava/lang/String;
        //    10: iconst_4       
        //    11: aaload         
        //    12: invokevirtual   com/whatsapp/protocol/c0.b:(Ljava/lang/String;)Lcom/whatsapp/protocol/c0;
        //    15: astore          8
        //    17: aload           8
        //    19: ifnull          184
        //    22: aload           8
        //    24: getstatic       com/whatsapp/protocol/aj.z:[Ljava/lang/String;
        //    27: iconst_2       
        //    28: aaload         
        //    29: invokevirtual   com/whatsapp/protocol/c0.b:(Ljava/lang/String;)Lcom/whatsapp/protocol/c0;
        //    32: astore          9
        //    34: aload           9
        //    36: ifnull          172
        //    39: aload           9
        //    41: getstatic       com/whatsapp/protocol/aj.z:[Ljava/lang/String;
        //    44: iconst_0       
        //    45: aaload         
        //    46: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //    49: astore          4
        //    51: aload           9
        //    53: getstatic       com/whatsapp/protocol/aj.z:[Ljava/lang/String;
        //    56: iload_3        
        //    57: aaload         
        //    58: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //    61: astore          5
        //    63: aload           9
        //    65: getstatic       com/whatsapp/protocol/aj.z:[Ljava/lang/String;
        //    68: iconst_5       
        //    69: aaload         
        //    70: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //    73: astore          12
        //    75: aload           12
        //    77: ifnull          166
        //    80: aload           12
        //    82: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    85: istore          14
        //    87: iload           14
        //    89: istore          6
        //    91: aload           8
        //    93: getstatic       com/whatsapp/protocol/aj.z:[Ljava/lang/String;
        //    96: iconst_3       
        //    97: aaload         
        //    98: invokevirtual   com/whatsapp/protocol/c0.b:(Ljava/lang/String;)Lcom/whatsapp/protocol/c0;
        //   101: astore          11
        //   103: aload           11
        //   105: ifnull          161
        //   108: iload_3        
        //   109: istore          7
        //   111: aload_0        
        //   112: getfield        com/whatsapp/protocol/aj.a:Lcom/whatsapp/protocol/bf;
        //   115: getfield        com/whatsapp/protocol/bf.w:Lcom/whatsapp/protocol/by;
        //   118: aload_0        
        //   119: getfield        com/whatsapp/protocol/aj.d:Ljava/lang/String;
        //   122: aload_0        
        //   123: getfield        com/whatsapp/protocol/aj.e:Ljava/lang/String;
        //   126: aload_0        
        //   127: getfield        com/whatsapp/protocol/aj.c:Ljava/lang/String;
        //   130: aload_0        
        //   131: getfield        com/whatsapp/protocol/aj.b:Ljava/lang/String;
        //   134: aload           4
        //   136: aload           5
        //   138: iload           6
        //   140: iload           7
        //   142: invokeinterface com/whatsapp/protocol/by.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V
        //   147: return         
        //   148: astore          13
        //   150: iconst_0       
        //   151: istore          6
        //   153: goto            91
        //   156: astore          10
        //   158: aload           10
        //   160: athrow         
        //   161: iconst_0       
        //   162: istore_3       
        //   163: goto            108
        //   166: iconst_0       
        //   167: istore          6
        //   169: goto            91
        //   172: aconst_null    
        //   173: astore          4
        //   175: aconst_null    
        //   176: astore          5
        //   178: iconst_0       
        //   179: istore          6
        //   181: goto            91
        //   184: aconst_null    
        //   185: astore          4
        //   187: aconst_null    
        //   188: astore          5
        //   190: iconst_0       
        //   191: istore          6
        //   193: iconst_0       
        //   194: istore          7
        //   196: goto            111
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  80     87     148    156    Ljava/lang/NumberFormatException;
        //  91     103    156    161    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0091:
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
