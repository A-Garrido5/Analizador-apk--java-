// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class aa extends a
{
    private static final String[] z;
    final bf a;
    final String[] b;
    
    static {
        final String[] z2 = new String[17];
        String s = "K}R*~";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0457:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\f';
                        break;
                    }
                    case 0: {
                        c2 = '.';
                        break;
                    }
                    case 1: {
                        c2 = '\u000f';
                        break;
                    }
                    case 2: {
                        c2 = ' ';
                        break;
                    }
                    case 3: {
                        c2 = 'E';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\\jG,\u007fZ}A1eAa";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "DfD";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "EjY";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "]dE<";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "M`D ";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "]fG+mZzR ";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "ZvP ";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "BfS1";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "XnL0i";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "Gk";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "K}R*~\u000eaO!i\u000e|H*yBk\u0000-mXj\u0000+yCjR,o\u000elO!i\u000enT1~GmU1i\u0014/";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    s = "XnL0i";
                    n = 11;
                    n2 = 12;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    array = z2;
                    s = "CfS6e@h\u0000/eJ/O+,[|E7,@`D ";
                    n = 12;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "GkE+xG{Y";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    s = "Gk";
                    n = 14;
                    n2 = 15;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    array = z2;
                    s = "ZvP ,@`D ,]gO0`J/C*bZnI+,KwA&xBv\u0000t,LvT ";
                    n = 15;
                    continue;
                }
                case 15: {
                    break Label_0457;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    aa(final bf a, final String[] b) {
        this.a = a;
        this.b = b;
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
        //     4: aload_1        
        //     5: getstatic       com/whatsapp/protocol/aa.z:[Ljava/lang/String;
        //     8: bipush          8
        //    10: aaload         
        //    11: invokevirtual   com/whatsapp/protocol/c0.b:(Ljava/lang/String;)Lcom/whatsapp/protocol/c0;
        //    14: invokestatic    com/whatsapp/protocol/c0.a:(Lcom/whatsapp/protocol/c0;)Lcom/whatsapp/protocol/c0;
        //    17: astore          4
        //    19: new             Ljava/util/Vector;
        //    22: dup            
        //    23: aload_0        
        //    24: getfield        com/whatsapp/protocol/aa.b:[Ljava/lang/String;
        //    27: arraylength    
        //    28: invokespecial   java/util/Vector.<init>:(I)V
        //    31: astore          5
        //    33: new             Ljava/util/Hashtable;
        //    36: dup            
        //    37: aload_0        
        //    38: getfield        com/whatsapp/protocol/aa.b:[Ljava/lang/String;
        //    41: arraylength    
        //    42: invokespecial   java/util/Hashtable.<init>:(I)V
        //    45: astore          6
        //    47: aload           4
        //    49: getfield        com/whatsapp/protocol/c0.d:[Lcom/whatsapp/protocol/c0;
        //    52: ifnull          513
        //    55: iconst_0       
        //    56: istore          11
        //    58: iload           11
        //    60: aload           4
        //    62: getfield        com/whatsapp/protocol/c0.d:[Lcom/whatsapp/protocol/c0;
        //    65: arraylength    
        //    66: if_icmpge       513
        //    69: aload           4
        //    71: getfield        com/whatsapp/protocol/c0.d:[Lcom/whatsapp/protocol/c0;
        //    74: iload           11
        //    76: aaload         
        //    77: astore          12
        //    79: aload           12
        //    81: getstatic       com/whatsapp/protocol/aa.z:[Ljava/lang/String;
        //    84: iconst_2       
        //    85: aaload         
        //    86: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //    89: astore          13
        //    91: aload           13
        //    93: ifnonnull       115
        //    96: new             Lcom/whatsapp/protocol/cz;
        //    99: dup            
        //   100: getstatic       com/whatsapp/protocol/aa.z:[Ljava/lang/String;
        //   103: bipush          13
        //   105: aaload         
        //   106: invokespecial   com/whatsapp/protocol/cz.<init>:(Ljava/lang/String;)V
        //   109: athrow         
        //   110: astore          33
        //   112: aload           33
        //   114: athrow         
        //   115: aload           12
        //   117: getstatic       com/whatsapp/protocol/aa.z:[Ljava/lang/String;
        //   120: iconst_0       
        //   121: aaload         
        //   122: invokevirtual   com/whatsapp/protocol/c0.b:(Ljava/lang/String;)Lcom/whatsapp/protocol/c0;
        //   125: ifnull          175
        //   128: aload           12
        //   130: getstatic       com/whatsapp/protocol/aa.z:[Ljava/lang/String;
        //   133: iconst_5       
        //   134: aaload         
        //   135: invokevirtual   com/whatsapp/protocol/c0.d:(Ljava/lang/String;)Ljava/lang/String;
        //   138: astore          29
        //   140: new             Ljava/lang/Integer;
        //   143: dup            
        //   144: aload           29
        //   146: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   149: invokespecial   java/lang/Integer.<init>:(I)V
        //   152: astore          30
        //   154: aload           5
        //   156: aload           13
        //   158: invokevirtual   java/util/Vector.addElement:(Ljava/lang/Object;)V
        //   161: aload           6
        //   163: aload           13
        //   165: aload           30
        //   167: invokevirtual   java/util/Hashtable.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   170: pop            
        //   171: iload_3        
        //   172: ifeq            503
        //   175: aload           12
        //   177: getstatic       com/whatsapp/protocol/aa.z:[Ljava/lang/String;
        //   180: bipush          14
        //   182: aaload         
        //   183: invokevirtual   com/whatsapp/protocol/c0.b:(Ljava/lang/String;)Lcom/whatsapp/protocol/c0;
        //   186: invokestatic    com/whatsapp/protocol/c0.a:(Lcom/whatsapp/protocol/c0;)Lcom/whatsapp/protocol/c0;
        //   189: astore          14
        //   191: aload           12
        //   193: getstatic       com/whatsapp/protocol/aa.z:[Ljava/lang/String;
        //   196: iconst_1       
        //   197: aaload         
        //   198: invokevirtual   com/whatsapp/protocol/c0.b:(Ljava/lang/String;)Lcom/whatsapp/protocol/c0;
        //   201: invokestatic    com/whatsapp/protocol/c0.a:(Lcom/whatsapp/protocol/c0;)Lcom/whatsapp/protocol/c0;
        //   204: astore          15
        //   206: aload           12
        //   208: getstatic       com/whatsapp/protocol/aa.z:[Ljava/lang/String;
        //   211: bipush          7
        //   213: aaload         
        //   214: invokevirtual   com/whatsapp/protocol/c0.b:(Ljava/lang/String;)Lcom/whatsapp/protocol/c0;
        //   217: invokestatic    com/whatsapp/protocol/c0.a:(Lcom/whatsapp/protocol/c0;)Lcom/whatsapp/protocol/c0;
        //   220: astore          16
        //   222: aload           16
        //   224: getfield        com/whatsapp/protocol/c0.a:[B
        //   227: astore          19
        //   229: aload           19
        //   231: ifnull          244
        //   234: aload           16
        //   236: getfield        com/whatsapp/protocol/c0.a:[B
        //   239: arraylength    
        //   240: iconst_1       
        //   241: if_icmpeq       302
        //   244: new             Lcom/whatsapp/protocol/cz;
        //   247: dup            
        //   248: getstatic       com/whatsapp/protocol/aa.z:[Ljava/lang/String;
        //   251: bipush          16
        //   253: aaload         
        //   254: invokespecial   com/whatsapp/protocol/cz.<init>:(Ljava/lang/String;)V
        //   257: athrow         
        //   258: astore          18
        //   260: aload           18
        //   262: athrow         
        //   263: astore          32
        //   265: new             Lcom/whatsapp/protocol/cz;
        //   268: dup            
        //   269: new             Ljava/lang/StringBuilder;
        //   272: dup            
        //   273: invokespecial   java/lang/StringBuilder.<init>:()V
        //   276: getstatic       com/whatsapp/protocol/aa.z:[Ljava/lang/String;
        //   279: bipush          11
        //   281: aaload         
        //   282: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   285: aload           29
        //   287: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   290: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   293: invokespecial   com/whatsapp/protocol/cz.<init>:(Ljava/lang/String;)V
        //   296: athrow         
        //   297: astore          17
        //   299: aload           17
        //   301: athrow         
        //   302: aload           12
        //   304: getstatic       com/whatsapp/protocol/aa.z:[Ljava/lang/String;
        //   307: iconst_3       
        //   308: aaload         
        //   309: invokevirtual   com/whatsapp/protocol/c0.b:(Ljava/lang/String;)Lcom/whatsapp/protocol/c0;
        //   312: astore          20
        //   314: aload           20
        //   316: ifnull          375
        //   319: aload           20
        //   321: getstatic       com/whatsapp/protocol/aa.z:[Ljava/lang/String;
        //   324: bipush          10
        //   326: aaload         
        //   327: invokevirtual   com/whatsapp/protocol/c0.b:(Ljava/lang/String;)Lcom/whatsapp/protocol/c0;
        //   330: invokestatic    com/whatsapp/protocol/c0.a:(Lcom/whatsapp/protocol/c0;)Lcom/whatsapp/protocol/c0;
        //   333: astore          27
        //   335: aload           20
        //   337: getstatic       com/whatsapp/protocol/aa.z:[Ljava/lang/String;
        //   340: bipush          12
        //   342: aaload         
        //   343: invokevirtual   com/whatsapp/protocol/c0.b:(Ljava/lang/String;)Lcom/whatsapp/protocol/c0;
        //   346: invokestatic    com/whatsapp/protocol/c0.a:(Lcom/whatsapp/protocol/c0;)Lcom/whatsapp/protocol/c0;
        //   349: astore          28
        //   351: new             Lcom/whatsapp/protocol/b2;
        //   354: dup            
        //   355: aload           27
        //   357: getfield        com/whatsapp/protocol/c0.a:[B
        //   360: aload           28
        //   362: getfield        com/whatsapp/protocol/c0.a:[B
        //   365: aconst_null    
        //   366: invokespecial   com/whatsapp/protocol/b2.<init>:([B[B[B)V
        //   369: astore          21
        //   371: iload_3        
        //   372: ifeq            378
        //   375: aconst_null    
        //   376: astore          21
        //   378: aload           12
        //   380: getstatic       com/whatsapp/protocol/aa.z:[Ljava/lang/String;
        //   383: iconst_4       
        //   384: aaload         
        //   385: invokevirtual   com/whatsapp/protocol/c0.b:(Ljava/lang/String;)Lcom/whatsapp/protocol/c0;
        //   388: invokestatic    com/whatsapp/protocol/c0.a:(Lcom/whatsapp/protocol/c0;)Lcom/whatsapp/protocol/c0;
        //   391: astore          22
        //   393: aload           22
        //   395: getstatic       com/whatsapp/protocol/aa.z:[Ljava/lang/String;
        //   398: bipush          15
        //   400: aaload         
        //   401: invokevirtual   com/whatsapp/protocol/c0.b:(Ljava/lang/String;)Lcom/whatsapp/protocol/c0;
        //   404: invokestatic    com/whatsapp/protocol/c0.a:(Lcom/whatsapp/protocol/c0;)Lcom/whatsapp/protocol/c0;
        //   407: astore          23
        //   409: aload           22
        //   411: getstatic       com/whatsapp/protocol/aa.z:[Ljava/lang/String;
        //   414: bipush          9
        //   416: aaload         
        //   417: invokevirtual   com/whatsapp/protocol/c0.b:(Ljava/lang/String;)Lcom/whatsapp/protocol/c0;
        //   420: invokestatic    com/whatsapp/protocol/c0.a:(Lcom/whatsapp/protocol/c0;)Lcom/whatsapp/protocol/c0;
        //   423: astore          24
        //   425: aload           22
        //   427: getstatic       com/whatsapp/protocol/aa.z:[Ljava/lang/String;
        //   430: bipush          6
        //   432: aaload         
        //   433: invokevirtual   com/whatsapp/protocol/c0.b:(Ljava/lang/String;)Lcom/whatsapp/protocol/c0;
        //   436: invokestatic    com/whatsapp/protocol/c0.a:(Lcom/whatsapp/protocol/c0;)Lcom/whatsapp/protocol/c0;
        //   439: astore          25
        //   441: aload_0        
        //   442: getfield        com/whatsapp/protocol/aa.a:Lcom/whatsapp/protocol/bf;
        //   445: invokestatic    com/whatsapp/protocol/bf.c:(Lcom/whatsapp/protocol/bf;)Lcom/whatsapp/protocol/b3;
        //   448: aload           13
        //   450: aload           14
        //   452: getfield        com/whatsapp/protocol/c0.a:[B
        //   455: aload           15
        //   457: getfield        com/whatsapp/protocol/c0.a:[B
        //   460: aload           16
        //   462: getfield        com/whatsapp/protocol/c0.a:[B
        //   465: iconst_0       
        //   466: baload         
        //   467: aload           21
        //   469: new             Lcom/whatsapp/protocol/b2;
        //   472: dup            
        //   473: aload           23
        //   475: getfield        com/whatsapp/protocol/c0.a:[B
        //   478: aload           24
        //   480: getfield        com/whatsapp/protocol/c0.a:[B
        //   483: aload           25
        //   485: getfield        com/whatsapp/protocol/c0.a:[B
        //   488: invokespecial   com/whatsapp/protocol/b2.<init>:([B[B[B)V
        //   491: invokeinterface com/whatsapp/protocol/b3.a:(Ljava/lang/String;[B[BBLcom/whatsapp/protocol/b2;Lcom/whatsapp/protocol/b2;)V
        //   496: aload           5
        //   498: aload           13
        //   500: invokevirtual   java/util/Vector.addElement:(Ljava/lang/Object;)V
        //   503: iload           11
        //   505: iconst_1       
        //   506: iadd           
        //   507: istore          26
        //   509: iload_3        
        //   510: ifeq            640
        //   513: iconst_0       
        //   514: istore          7
        //   516: iload           7
        //   518: aload_0        
        //   519: getfield        com/whatsapp/protocol/aa.b:[Ljava/lang/String;
        //   522: arraylength    
        //   523: if_icmpge       622
        //   526: aload           5
        //   528: aload_0        
        //   529: getfield        com/whatsapp/protocol/aa.b:[Ljava/lang/String;
        //   532: iload           7
        //   534: aaload         
        //   535: invokevirtual   java/util/Vector.contains:(Ljava/lang/Object;)Z
        //   538: ifne            560
        //   541: aload_0        
        //   542: getfield        com/whatsapp/protocol/aa.a:Lcom/whatsapp/protocol/bf;
        //   545: invokestatic    com/whatsapp/protocol/bf.c:(Lcom/whatsapp/protocol/bf;)Lcom/whatsapp/protocol/b3;
        //   548: aload_0        
        //   549: getfield        com/whatsapp/protocol/aa.b:[Ljava/lang/String;
        //   552: iload           7
        //   554: aaload         
        //   555: invokeinterface com/whatsapp/protocol/b3.a:(Ljava/lang/String;)V
        //   560: aload           6
        //   562: aload_0        
        //   563: getfield        com/whatsapp/protocol/aa.b:[Ljava/lang/String;
        //   566: iload           7
        //   568: aaload         
        //   569: invokevirtual   java/util/Hashtable.containsKey:(Ljava/lang/Object;)Z
        //   572: ifeq            612
        //   575: aload_0        
        //   576: getfield        com/whatsapp/protocol/aa.a:Lcom/whatsapp/protocol/bf;
        //   579: invokestatic    com/whatsapp/protocol/bf.c:(Lcom/whatsapp/protocol/bf;)Lcom/whatsapp/protocol/b3;
        //   582: aload_0        
        //   583: getfield        com/whatsapp/protocol/aa.b:[Ljava/lang/String;
        //   586: iload           7
        //   588: aaload         
        //   589: aload           6
        //   591: aload_0        
        //   592: getfield        com/whatsapp/protocol/aa.b:[Ljava/lang/String;
        //   595: iload           7
        //   597: aaload         
        //   598: invokevirtual   java/util/Hashtable.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   601: checkcast       Ljava/lang/Integer;
        //   604: invokevirtual   java/lang/Integer.intValue:()I
        //   607: invokeinterface com/whatsapp/protocol/b3.a:(Ljava/lang/String;I)V
        //   612: iload           7
        //   614: iconst_1       
        //   615: iadd           
        //   616: istore          10
        //   618: iload_3        
        //   619: ifeq            633
        //   622: return         
        //   623: astore          8
        //   625: aload           8
        //   627: athrow         
        //   628: astore          9
        //   630: aload           9
        //   632: athrow         
        //   633: iload           10
        //   635: istore          7
        //   637: goto            516
        //   640: iload           26
        //   642: istore          11
        //   644: goto            58
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  96     110    110    115    Ljava/lang/NumberFormatException;
        //  140    154    263    297    Ljava/lang/NumberFormatException;
        //  222    229    297    302    Ljava/lang/NumberFormatException;
        //  234    244    258    263    Ljava/lang/NumberFormatException;
        //  244    258    258    263    Ljava/lang/NumberFormatException;
        //  299    302    258    263    Ljava/lang/NumberFormatException;
        //  526    560    623    628    Ljava/lang/NumberFormatException;
        //  560    612    628    633    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0244:
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
