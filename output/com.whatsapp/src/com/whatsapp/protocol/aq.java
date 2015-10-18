// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class aq extends a
{
    private static final String[] z;
    final bf a;
    
    static {
        final String[] z2 = new String[8];
        String s = "\u0003](";
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
                        c2 = '\r';
                        break;
                    }
                    case 0: {
                        c2 = 'p';
                        break;
                    }
                    case 1: {
                        c2 = '\u0002';
                        break;
                    }
                    case 2: {
                        c2 = 'G';
                        break;
                    }
                    case 3: {
                        c2 = 'g';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0013p\"\u0006y\u001fp";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0013p\"\u0006y\u0019m)";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0003w%\rh\u0013v";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u001cm$\u0006y\u0019m)";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u0003]3";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0011t&\u000ea\u0011`+\u0002";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0004{7\u0002";
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
    
    aq(final bf a) {
        this.a = a;
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
        //     7: getstatic       com/whatsapp/protocol/aq.z:[Ljava/lang/String;
        //    10: iconst_1       
        //    11: aaload         
        //    12: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //    15: astore          4
        //    17: aload_3        
        //    18: getstatic       com/whatsapp/protocol/aq.z:[Ljava/lang/String;
        //    21: iconst_2       
        //    22: aaload         
        //    23: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //    26: astore          5
        //    28: lconst_0       
        //    29: lstore          6
        //    31: aload           5
        //    33: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //    36: lstore          27
        //    38: lload           27
        //    40: ldc2_w          1000
        //    43: lmul           
        //    44: lstore          6
        //    46: aload_3        
        //    47: getstatic       com/whatsapp/protocol/aq.z:[Ljava/lang/String;
        //    50: iconst_3       
        //    51: aaload         
        //    52: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //    55: astore          9
        //    57: aload_3        
        //    58: getstatic       com/whatsapp/protocol/aq.z:[Ljava/lang/String;
        //    61: iconst_5       
        //    62: aaload         
        //    63: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //    66: astore          10
        //    68: lconst_0       
        //    69: lstore          11
        //    71: aload           10
        //    73: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //    76: lstore          25
        //    78: lload           25
        //    80: ldc2_w          1000
        //    83: lmul           
        //    84: lstore          11
        //    86: aload_3        
        //    87: getstatic       com/whatsapp/protocol/aq.z:[Ljava/lang/String;
        //    90: iconst_0       
        //    91: aaload         
        //    92: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //    95: astore          14
        //    97: aload_3        
        //    98: getstatic       com/whatsapp/protocol/aq.z:[Ljava/lang/String;
        //   101: bipush          7
        //   103: aaload         
        //   104: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //   107: astore          15
        //   109: aload_3        
        //   110: getstatic       com/whatsapp/protocol/aq.z:[Ljava/lang/String;
        //   113: iconst_4       
        //   114: aaload         
        //   115: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //   118: astore          16
        //   120: lconst_0       
        //   121: lstore          17
        //   123: aload           16
        //   125: ifnull          176
        //   128: aload           16
        //   130: getstatic       com/whatsapp/protocol/aq.z:[Ljava/lang/String;
        //   133: bipush          6
        //   135: aaload         
        //   136: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   139: istore          21
        //   141: iload           21
        //   143: ifeq            157
        //   146: ldc2_w          -1
        //   149: lstore          17
        //   151: getstatic       com/whatsapp/protocol/bi.O:I
        //   154: ifeq            176
        //   157: lconst_0       
        //   158: ldc2_w          1000
        //   161: aload           5
        //   163: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   166: lmul           
        //   167: invokestatic    java/lang/Math.max:(JJ)J
        //   170: lstore          23
        //   172: lload           23
        //   174: lstore          17
        //   176: new             Ljava/util/Hashtable;
        //   179: dup            
        //   180: invokespecial   java/util/Hashtable.<init>:()V
        //   183: astore          19
        //   185: aload_0        
        //   186: getfield        com/whatsapp/protocol/aq.a:Lcom/whatsapp/protocol/bf;
        //   189: aload_3        
        //   190: aload           19
        //   192: invokestatic    com/whatsapp/protocol/bf.a:(Lcom/whatsapp/protocol/bf;Lcom/whatsapp/protocol/c0;Ljava/util/Hashtable;)V
        //   195: aload_0        
        //   196: getfield        com/whatsapp/protocol/aq.a:Lcom/whatsapp/protocol/bf;
        //   199: invokestatic    com/whatsapp/protocol/bf.b:(Lcom/whatsapp/protocol/bf;)Lcom/whatsapp/protocol/cg;
        //   202: aload_2        
        //   203: aload           4
        //   205: lload           6
        //   207: aload           9
        //   209: lload           11
        //   211: aload           14
        //   213: aload           15
        //   215: lload           17
        //   217: aload           19
        //   219: invokeinterface com/whatsapp/protocol/cg.a:(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;JLjava/util/Hashtable;)V
        //   224: return         
        //   225: astore          20
        //   227: aload           20
        //   229: athrow         
        //   230: astore          8
        //   232: goto            46
        //   235: astore          13
        //   237: goto            86
        //   240: astore          22
        //   242: goto            176
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  31     38     230    235    Ljava/lang/NumberFormatException;
        //  71     78     235    240    Ljava/lang/NumberFormatException;
        //  128    141    225    230    Ljava/lang/NumberFormatException;
        //  157    172    240    245    Ljava/lang/NumberFormatException;
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
