// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class aw extends a
{
    private static final String[] z;
    final c2 a;
    final bf b;
    final Runnable c;
    
    static {
        final String[] z2 = new String[11];
        String s = "\u0019@a";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0307:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'D';
                        break;
                    }
                    case 0: {
                        c2 = 'j';
                        break;
                    }
                    case 1: {
                        c2 = '\u001f';
                        break;
                    }
                    case 2: {
                        c2 = '\u000e';
                        break;
                    }
                    case 3: {
                        c2 = 'G';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0019@z";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\rma24";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\rma24\u0019";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u0003{";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u000bio.(\u000b}b\"";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\tmk&0\u0005m";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0019jl-!\tk";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u001ef~\"";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u0006pm&0\u0003p`";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\tmk&0\u0003p`";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    break Label_0307;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    aw(final bf b, final Runnable c, final c2 a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public void a(final int n) {
        try {
            if (this.a != null) {
                this.a.a(n);
            }
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
    }
    
    @Override
    public void a(final c0 p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/protocol/bi.O:I
        //     3: istore_3       
        //     4: new             Ljava/util/Vector;
        //     7: dup            
        //     8: invokespecial   java/util/Vector.<init>:()V
        //    11: astore          4
        //    13: aload_1        
        //    14: getstatic       com/whatsapp/protocol/aw.z:[Ljava/lang/String;
        //    17: iconst_3       
        //    18: aaload         
        //    19: invokevirtual   com/whatsapp/protocol/c0.b:(Ljava/lang/String;)Lcom/whatsapp/protocol/c0;
        //    22: astore          5
        //    24: aload           5
        //    26: ifnull          334
        //    29: aload           5
        //    31: getstatic       com/whatsapp/protocol/aw.z:[Ljava/lang/String;
        //    34: iconst_2       
        //    35: aaload         
        //    36: invokevirtual   com/whatsapp/protocol/c0.a:(Ljava/lang/String;)Ljava/util/Vector;
        //    39: astore          7
        //    41: iconst_0       
        //    42: istore          8
        //    44: iload           8
        //    46: aload           7
        //    48: invokevirtual   java/util/Vector.size:()I
        //    51: if_icmpge       334
        //    54: aload           7
        //    56: iload           8
        //    58: invokevirtual   java/util/Vector.elementAt:(I)Ljava/lang/Object;
        //    61: checkcast       Lcom/whatsapp/protocol/c0;
        //    64: astore          9
        //    66: aload           9
        //    68: getstatic       com/whatsapp/protocol/aw.z:[Ljava/lang/String;
        //    71: iconst_4       
        //    72: aaload         
        //    73: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //    76: astore          10
        //    78: aload_0        
        //    79: getfield        com/whatsapp/protocol/aw.b:Lcom/whatsapp/protocol/bf;
        //    82: aload           10
        //    84: invokestatic    com/whatsapp/protocol/bf.a:(Lcom/whatsapp/protocol/bf;Ljava/lang/String;)Ljava/lang/String;
        //    87: astore          11
        //    89: aload           9
        //    91: getstatic       com/whatsapp/protocol/aw.z:[Ljava/lang/String;
        //    94: bipush          6
        //    96: aaload         
        //    97: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //   100: astore          12
        //   102: aload           9
        //   104: getstatic       com/whatsapp/protocol/aw.z:[Ljava/lang/String;
        //   107: bipush          10
        //   109: aaload         
        //   110: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //   113: astore          13
        //   115: lconst_0       
        //   116: lstore          14
        //   118: aload           13
        //   120: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   123: lstore          36
        //   125: lload           36
        //   127: ldc2_w          1000
        //   130: lmul           
        //   131: lstore          14
        //   133: aload           9
        //   135: getstatic       com/whatsapp/protocol/aw.z:[Ljava/lang/String;
        //   138: bipush          7
        //   140: aaload         
        //   141: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //   144: astore          17
        //   146: aload           9
        //   148: getstatic       com/whatsapp/protocol/aw.z:[Ljava/lang/String;
        //   151: iconst_1       
        //   152: aaload         
        //   153: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //   156: astore          18
        //   158: lconst_0       
        //   159: lstore          19
        //   161: aload           18
        //   163: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   166: lstore          34
        //   168: lload           34
        //   170: ldc2_w          1000
        //   173: lmul           
        //   174: lstore          19
        //   176: aload           9
        //   178: getstatic       com/whatsapp/protocol/aw.z:[Ljava/lang/String;
        //   181: iconst_0       
        //   182: aaload         
        //   183: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //   186: astore          22
        //   188: aload           9
        //   190: getstatic       com/whatsapp/protocol/aw.z:[Ljava/lang/String;
        //   193: bipush          8
        //   195: aaload         
        //   196: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //   199: astore          23
        //   201: lconst_0       
        //   202: lstore          24
        //   204: aload           9
        //   206: getstatic       com/whatsapp/protocol/aw.z:[Ljava/lang/String;
        //   209: bipush          9
        //   211: aaload         
        //   212: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //   215: astore          26
        //   217: aload           26
        //   219: ifnull          267
        //   222: aload           26
        //   224: getstatic       com/whatsapp/protocol/aw.z:[Ljava/lang/String;
        //   227: iconst_5       
        //   228: aaload         
        //   229: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   232: istore          30
        //   234: iload           30
        //   236: ifeq            248
        //   239: ldc2_w          -1
        //   242: lstore          24
        //   244: iload_3        
        //   245: ifeq            267
        //   248: lconst_0       
        //   249: ldc2_w          1000
        //   252: aload           13
        //   254: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   257: lmul           
        //   258: invokestatic    java/lang/Math.max:(JJ)J
        //   261: lstore          32
        //   263: lload           32
        //   265: lstore          24
        //   267: new             Ljava/util/Hashtable;
        //   270: dup            
        //   271: invokespecial   java/util/Hashtable.<init>:()V
        //   274: astore          27
        //   276: aload_0        
        //   277: getfield        com/whatsapp/protocol/aw.b:Lcom/whatsapp/protocol/bf;
        //   280: aload           9
        //   282: aload           27
        //   284: invokestatic    com/whatsapp/protocol/bf.a:(Lcom/whatsapp/protocol/bf;Lcom/whatsapp/protocol/c0;Ljava/util/Hashtable;)V
        //   287: aload_0        
        //   288: getfield        com/whatsapp/protocol/aw.b:Lcom/whatsapp/protocol/bf;
        //   291: invokestatic    com/whatsapp/protocol/bf.b:(Lcom/whatsapp/protocol/bf;)Lcom/whatsapp/protocol/cg;
        //   294: aload           11
        //   296: aload           12
        //   298: lload           14
        //   300: aload           17
        //   302: lload           19
        //   304: aload           22
        //   306: aload           23
        //   308: lload           24
        //   310: aload           27
        //   312: invokeinterface com/whatsapp/protocol/cg.b:(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;JLjava/util/Hashtable;)V
        //   317: aload           4
        //   319: aload           11
        //   321: invokevirtual   java/util/Vector.addElement:(Ljava/lang/Object;)V
        //   324: iload           8
        //   326: iconst_1       
        //   327: iadd           
        //   328: istore          28
        //   330: iload_3        
        //   331: ifeq            390
        //   334: aload_0        
        //   335: getfield        com/whatsapp/protocol/aw.b:Lcom/whatsapp/protocol/bf;
        //   338: invokestatic    com/whatsapp/protocol/bf.b:(Lcom/whatsapp/protocol/bf;)Lcom/whatsapp/protocol/cg;
        //   341: aload           4
        //   343: invokeinterface com/whatsapp/protocol/cg.a:(Ljava/util/Vector;)V
        //   348: aload_0        
        //   349: getfield        com/whatsapp/protocol/aw.c:Ljava/lang/Runnable;
        //   352: ifnull          364
        //   355: aload_0        
        //   356: getfield        com/whatsapp/protocol/aw.c:Ljava/lang/Runnable;
        //   359: invokeinterface java/lang/Runnable.run:()V
        //   364: return         
        //   365: astore          29
        //   367: aload           29
        //   369: athrow         
        //   370: astore          6
        //   372: aload           6
        //   374: athrow         
        //   375: astore          16
        //   377: goto            133
        //   380: astore          21
        //   382: goto            176
        //   385: astore          31
        //   387: goto            267
        //   390: iload           28
        //   392: istore          8
        //   394: goto            44
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  118    125    375    380    Ljava/lang/NumberFormatException;
        //  161    168    380    385    Ljava/lang/NumberFormatException;
        //  222    234    365    370    Ljava/lang/NumberFormatException;
        //  248    263    385    390    Ljava/lang/NumberFormatException;
        //  334    364    370    375    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 185, Size: 185
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
