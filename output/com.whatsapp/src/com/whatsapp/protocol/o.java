// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class o extends a
{
    private static final String[] z;
    final cw a;
    final bf b;
    
    static {
        final String[] z2 = new String[8];
        String s = "Xwg3";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0232:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\b';
                        break;
                    }
                    case 0: {
                        c2 = ';';
                        break;
                    }
                    case 1: {
                        c2 = '\u0018';
                        break;
                    }
                    case 2: {
                        c2 = '\u0003';
                        break;
                    }
                    case 3: {
                        c2 = 'V';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u000f(7";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Nkf$";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "Oas3";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "]yj:";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u000f(0";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "Hlb\"}H";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u000f(2";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    break Label_0232;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    o(final bf b, final cw a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a(final int n) {
        this.a.a(n);
    }
    
    @Override
    public void a(final c0 p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: lconst_0       
        //     1: lstore_3       
        //     2: getstatic       com/whatsapp/protocol/bi.O:I
        //     5: istore          5
        //     7: aload_1        
        //     8: getstatic       com/whatsapp/protocol/o.z:[Ljava/lang/String;
        //    11: bipush          6
        //    13: aaload         
        //    14: invokevirtual   com/whatsapp/protocol/c0.b:(Ljava/lang/String;)Lcom/whatsapp/protocol/c0;
        //    17: astore          6
        //    19: aload           6
        //    21: ifnull          239
        //    24: aload           6
        //    26: getfield        com/whatsapp/protocol/c0.d:[Lcom/whatsapp/protocol/c0;
        //    29: astore          10
        //    31: aload           10
        //    33: ifnull          239
        //    36: aload           6
        //    38: getfield        com/whatsapp/protocol/c0.d:[Lcom/whatsapp/protocol/c0;
        //    41: arraylength    
        //    42: istore          11
        //    44: iload           11
        //    46: iconst_1       
        //    47: if_icmpne       239
        //    50: aload           6
        //    52: getfield        com/whatsapp/protocol/c0.d:[Lcom/whatsapp/protocol/c0;
        //    55: iconst_0       
        //    56: aaload         
        //    57: astore          12
        //    59: aload           12
        //    61: getstatic       com/whatsapp/protocol/o.z:[Ljava/lang/String;
        //    64: iconst_2       
        //    65: aaload         
        //    66: invokestatic    com/whatsapp/protocol/c0.b:(Lcom/whatsapp/protocol/c0;Ljava/lang/String;)V
        //    69: aload           12
        //    71: ldc             "t"
        //    73: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //    76: astore          13
        //    78: aload           13
        //    80: ifnonnull       259
        //    83: lload_3        
        //    84: ldc2_w          1000
        //    87: lmul           
        //    88: lstore_3       
        //    89: aload           12
        //    91: getstatic       com/whatsapp/protocol/o.z:[Ljava/lang/String;
        //    94: iconst_0       
        //    95: aaload         
        //    96: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //    99: astore          15
        //   101: aload           12
        //   103: getstatic       com/whatsapp/protocol/o.z:[Ljava/lang/String;
        //   106: iconst_3       
        //   107: aaload         
        //   108: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //   111: astore          16
        //   113: aload           12
        //   115: invokevirtual   com/whatsapp/protocol/c0.a:()Ljava/lang/String;
        //   118: astore          17
        //   120: aload           16
        //   122: ifnull          222
        //   125: aload           16
        //   127: getstatic       com/whatsapp/protocol/o.z:[Ljava/lang/String;
        //   130: iconst_4       
        //   131: aaload         
        //   132: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   135: istore          24
        //   137: iload           24
        //   139: ifeq            222
        //   142: getstatic       com/whatsapp/protocol/o.z:[Ljava/lang/String;
        //   145: bipush          7
        //   147: aaload         
        //   148: aload           15
        //   150: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   153: istore          25
        //   155: iload           25
        //   157: ifne            194
        //   160: getstatic       com/whatsapp/protocol/o.z:[Ljava/lang/String;
        //   163: iconst_5       
        //   164: aaload         
        //   165: aload           15
        //   167: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   170: istore          26
        //   172: iload           26
        //   174: ifne            194
        //   177: getstatic       com/whatsapp/protocol/o.z:[Ljava/lang/String;
        //   180: iconst_1       
        //   181: aaload         
        //   182: aload           15
        //   184: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   187: istore          27
        //   189: iload           27
        //   191: ifeq            208
        //   194: aload_0        
        //   195: getfield        com/whatsapp/protocol/o.a:Lcom/whatsapp/protocol/cw;
        //   198: invokeinterface com/whatsapp/protocol/cw.b:()V
        //   203: iload           5
        //   205: ifeq            234
        //   208: aload_0        
        //   209: getfield        com/whatsapp/protocol/o.a:Lcom/whatsapp/protocol/cw;
        //   212: invokeinterface com/whatsapp/protocol/cw.a:()V
        //   217: iload           5
        //   219: ifeq            234
        //   222: aload_0        
        //   223: getfield        com/whatsapp/protocol/o.a:Lcom/whatsapp/protocol/cw;
        //   226: lload_3        
        //   227: aload           17
        //   229: invokeinterface com/whatsapp/protocol/cw.a:(JLjava/lang/String;)V
        //   234: iload           5
        //   236: ifeq            248
        //   239: aload_0        
        //   240: getfield        com/whatsapp/protocol/o.a:Lcom/whatsapp/protocol/cw;
        //   243: invokeinterface com/whatsapp/protocol/cw.a:()V
        //   248: return         
        //   249: astore          8
        //   251: aload           8
        //   253: athrow         
        //   254: astore          9
        //   256: aload           9
        //   258: athrow         
        //   259: aload           13
        //   261: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   264: lstore          28
        //   266: lload           28
        //   268: lstore_3       
        //   269: goto            83
        //   272: astore          19
        //   274: aload           19
        //   276: athrow         
        //   277: astore          20
        //   279: aload           20
        //   281: athrow         
        //   282: astore          21
        //   284: aload           21
        //   286: athrow         
        //   287: astore          22
        //   289: aload           22
        //   291: athrow         
        //   292: astore          23
        //   294: aload           23
        //   296: athrow         
        //   297: astore          18
        //   299: aload           18
        //   301: athrow         
        //   302: astore          7
        //   304: aload           7
        //   306: athrow         
        //   307: astore          14
        //   309: goto            89
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  24     31     249    254    Ljava/lang/NumberFormatException;
        //  36     44     254    259    Ljava/lang/NumberFormatException;
        //  125    137    272    277    Ljava/lang/NumberFormatException;
        //  142    155    277    282    Ljava/lang/NumberFormatException;
        //  160    172    282    287    Ljava/lang/NumberFormatException;
        //  177    189    287    292    Ljava/lang/NumberFormatException;
        //  194    203    292    297    Ljava/lang/NumberFormatException;
        //  208    217    297    302    Ljava/lang/NumberFormatException;
        //  222    234    297    302    Ljava/lang/NumberFormatException;
        //  239    248    302    307    Ljava/lang/NumberFormatException;
        //  251    254    254    259    Ljava/lang/NumberFormatException;
        //  259    266    307    312    Ljava/lang/NumberFormatException;
        //  274    277    277    282    Ljava/lang/NumberFormatException;
        //  279    282    282    287    Ljava/lang/NumberFormatException;
        //  284    287    287    292    Ljava/lang/NumberFormatException;
        //  289    292    292    297    Ljava/lang/NumberFormatException;
        //  294    297    297    302    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 149, Size: 149
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
