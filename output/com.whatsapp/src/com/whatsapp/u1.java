// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

final class u1 extends Thread
{
    private static final String[] z;
    final arz a;
    
    static {
        final String[] z2 = new String[5];
        String s = ">\u0005(\u007f3?\u000f-r7\u0001";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'R';
                        break;
                    }
                    case 0: {
                        c2 = 's';
                        break;
                    }
                    case 1: {
                        c2 = '`';
                        break;
                    }
                    case 2: {
                        c2 = 'L';
                        break;
                    }
                    case 3: {
                        c2 = '\u0016';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "S\u0006>s7I";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u001e\u0005(\u007f3\u0012\u00158y6\u001c\u0017\"z=\u0012\u0004cr=\u0004\u000e y3\u0017@";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "S\u000e)s6I";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "\u001e\u0005(\u007f3\u0012\u00158y6\u001c\u0017\"z=\u0012\u0004cx=\u0000\u0010-u7S\u0014#b3\u001fZ";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    private u1(final arz a) {
        this.a = a;
        super(u1.z[0]);
    }
    
    u1(final arz arz, final ahp ahp) {
        this(arz);
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
        //     4: aload_0        
        //     5: getfield        com/whatsapp/u1.a:Lcom/whatsapp/arz;
        //     8: invokestatic    com/whatsapp/arz.a:(Lcom/whatsapp/arz;)Ljava/util/Stack;
        //    11: invokevirtual   java/util/Stack.size:()I
        //    14: ifne            42
        //    17: aload_0        
        //    18: getfield        com/whatsapp/u1.a:Lcom/whatsapp/arz;
        //    21: invokestatic    com/whatsapp/arz.a:(Lcom/whatsapp/arz;)Ljava/util/Stack;
        //    24: astore          33
        //    26: aload           33
        //    28: monitorenter   
        //    29: aload_0        
        //    30: getfield        com/whatsapp/u1.a:Lcom/whatsapp/arz;
        //    33: invokestatic    com/whatsapp/arz.a:(Lcom/whatsapp/arz;)Ljava/util/Stack;
        //    36: invokevirtual   java/lang/Object.wait:()V
        //    39: aload           33
        //    41: monitorexit    
        //    42: ldc2_w          1000
        //    45: invokestatic    java/lang/Thread.sleep:(J)V
        //    48: invokestatic    com/whatsapp/Voip.i:()V
        //    51: aload_0        
        //    52: getfield        com/whatsapp/u1.a:Lcom/whatsapp/arz;
        //    55: invokestatic    com/whatsapp/arz.a:(Lcom/whatsapp/arz;)Ljava/util/Stack;
        //    58: invokevirtual   java/util/Stack.size:()I
        //    61: ifeq            416
        //    64: aload_0        
        //    65: getfield        com/whatsapp/u1.a:Lcom/whatsapp/arz;
        //    68: invokestatic    com/whatsapp/arz.a:(Lcom/whatsapp/arz;)Ljava/util/Stack;
        //    71: astore          7
        //    73: aload           7
        //    75: monitorenter   
        //    76: aload_0        
        //    77: getfield        com/whatsapp/u1.a:Lcom/whatsapp/arz;
        //    80: invokestatic    com/whatsapp/arz.a:(Lcom/whatsapp/arz;)Ljava/util/Stack;
        //    83: invokevirtual   java/util/Stack.pop:()Ljava/lang/Object;
        //    86: checkcast       Lcom/whatsapp/protocol/bi;
        //    89: astore          9
        //    91: new             Ljava/lang/StringBuilder;
        //    94: dup            
        //    95: invokespecial   java/lang/StringBuilder.<init>:()V
        //    98: getstatic       com/whatsapp/u1.z:[Ljava/lang/String;
        //   101: iconst_2       
        //   102: aaload         
        //   103: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   106: aload           9
        //   108: getfield        com/whatsapp/protocol/bi.d:Ljava/lang/String;
        //   111: invokestatic    com/whatsapp/util/br.c:(Ljava/lang/String;)Ljava/lang/String;
        //   114: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   117: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   120: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   123: aload           7
        //   125: monitorexit    
        //   126: aload           9
        //   128: getfield        com/whatsapp/protocol/bi.I:B
        //   131: ifeq            544
        //   134: invokestatic    com/whatsapp/App.C:()J
        //   137: lstore          11
        //   139: invokestatic    com/whatsapp/App.T:()J
        //   142: lstore          13
        //   144: lconst_0       
        //   145: lstore          15
        //   147: aload           9
        //   149: getfield        com/whatsapp/protocol/bi.I:B
        //   152: iconst_3       
        //   153: if_icmpeq       182
        //   156: aload           9
        //   158: getfield        com/whatsapp/protocol/bi.I:B
        //   161: istore          31
        //   163: iload           31
        //   165: iconst_2       
        //   166: if_icmpne       219
        //   169: aload           9
        //   171: getfield        com/whatsapp/protocol/bi.E:I
        //   174: istore          32
        //   176: iload           32
        //   178: iconst_1       
        //   179: if_icmpeq       219
        //   182: sipush          1024
        //   185: sipush          1024
        //   188: getstatic       com/whatsapp/ym.k:I
        //   191: imul           
        //   192: imul           
        //   193: i2l            
        //   194: ldc2_w          134217728
        //   197: lload           13
        //   199: ldc2_w          10
        //   202: ldiv           
        //   203: invokestatic    java/lang/Math.min:(JJ)J
        //   206: invokestatic    java/lang/Math.max:(JJ)J
        //   209: lstore          19
        //   211: lload           19
        //   213: lstore          15
        //   215: iload_1        
        //   216: ifeq            261
        //   219: aload           9
        //   221: getfield        com/whatsapp/protocol/bi.I:B
        //   224: istore          30
        //   226: iload           30
        //   228: iconst_1       
        //   229: if_icmpne       261
        //   232: sipush          1024
        //   235: sipush          512
        //   238: getstatic       com/whatsapp/ym.k:I
        //   241: imul           
        //   242: imul           
        //   243: i2l            
        //   244: ldc2_w          33554432
        //   247: lload           13
        //   249: ldc2_w          20
        //   252: ldiv           
        //   253: invokestatic    java/lang/Math.min:(JJ)J
        //   256: invokestatic    java/lang/Math.max:(JJ)J
        //   259: lstore          15
        //   261: lload           11
        //   263: lload           15
        //   265: lcmp           
        //   266: ifle            350
        //   269: aload           9
        //   271: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   274: checkcast       Lcom/whatsapp/MediaData;
        //   277: astore          21
        //   279: aload           21
        //   281: getfield        com/whatsapp/MediaData.downloader:Lcom/whatsapp/ds;
        //   284: astore          22
        //   286: aload           22
        //   288: invokevirtual   com/whatsapp/ds.isCancelled:()Z
        //   291: ifne            346
        //   294: aload           22
        //   296: invokevirtual   com/whatsapp/ds.b:()Z
        //   299: istore          24
        //   301: iload           24
        //   303: ifeq            346
        //   306: aload           22
        //   308: iconst_0       
        //   309: anewarray       Ljava/lang/Void;
        //   312: invokevirtual   com/whatsapp/ds.a:([Ljava/lang/Void;)Lcom/whatsapp/u5;
        //   315: astore          25
        //   317: aload           22
        //   319: invokevirtual   com/whatsapp/ds.isCancelled:()Z
        //   322: ifne            346
        //   325: aload           21
        //   327: getfield        com/whatsapp/MediaData.downloader:Lcom/whatsapp/ds;
        //   330: astore          28
        //   332: aload           22
        //   334: aload           28
        //   336: if_acmpne       346
        //   339: aload           22
        //   341: aload           25
        //   343: invokevirtual   com/whatsapp/ds.a:(Lcom/whatsapp/u5;)V
        //   346: iload_1        
        //   347: ifeq            416
        //   350: new             Ljava/lang/StringBuilder;
        //   353: dup            
        //   354: invokespecial   java/lang/StringBuilder.<init>:()V
        //   357: getstatic       com/whatsapp/u1.z:[Ljava/lang/String;
        //   360: iconst_4       
        //   361: aaload         
        //   362: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   365: lload           13
        //   367: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   370: getstatic       com/whatsapp/u1.z:[Ljava/lang/String;
        //   373: iconst_1       
        //   374: aaload         
        //   375: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   378: lload           11
        //   380: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   383: getstatic       com/whatsapp/u1.z:[Ljava/lang/String;
        //   386: iconst_3       
        //   387: aaload         
        //   388: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   391: lload           15
        //   393: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   396: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   399: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   402: aload           9
        //   404: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   407: checkcast       Lcom/whatsapp/MediaData;
        //   410: getfield        com/whatsapp/MediaData.downloader:Lcom/whatsapp/ds;
        //   413: invokevirtual   com/whatsapp/ds.a:()V
        //   416: invokestatic    java/lang/Thread.interrupted:()Z
        //   419: istore          6
        //   421: iload           6
        //   423: ifeq            4
        //   426: return         
        //   427: astore          34
        //   429: aload           33
        //   431: monitorexit    
        //   432: aload           34
        //   434: athrow         
        //   435: astore_2       
        //   436: aload_0        
        //   437: getfield        com/whatsapp/u1.a:Lcom/whatsapp/arz;
        //   440: invokestatic    com/whatsapp/arz.a:(Lcom/whatsapp/arz;)Ljava/util/Stack;
        //   443: astore_3       
        //   444: aload_3        
        //   445: monitorenter   
        //   446: aload_0        
        //   447: getfield        com/whatsapp/u1.a:Lcom/whatsapp/arz;
        //   450: invokestatic    com/whatsapp/arz.a:(Lcom/whatsapp/arz;)Ljava/util/Stack;
        //   453: invokevirtual   java/util/Stack.isEmpty:()Z
        //   456: ifne            496
        //   459: aload_0        
        //   460: getfield        com/whatsapp/u1.a:Lcom/whatsapp/arz;
        //   463: invokestatic    com/whatsapp/arz.a:(Lcom/whatsapp/arz;)Ljava/util/Stack;
        //   466: invokevirtual   java/util/Stack.pop:()Ljava/lang/Object;
        //   469: checkcast       Lcom/whatsapp/protocol/bi;
        //   472: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   475: checkcast       Lcom/whatsapp/MediaData;
        //   478: astore          5
        //   480: aload           5
        //   482: iconst_0       
        //   483: putfield        com/whatsapp/MediaData.transferring:Z
        //   486: aload           5
        //   488: lconst_0       
        //   489: putfield        com/whatsapp/MediaData.progress:J
        //   492: iload_1        
        //   493: ifeq            446
        //   496: aload_3        
        //   497: monitorexit    
        //   498: return         
        //   499: astore          4
        //   501: aload_3        
        //   502: monitorexit    
        //   503: aload           4
        //   505: athrow         
        //   506: astore          8
        //   508: aload           7
        //   510: monitorexit    
        //   511: aload           8
        //   513: athrow         
        //   514: astore          17
        //   516: aload           17
        //   518: athrow         
        //   519: astore          18
        //   521: aload           18
        //   523: athrow         
        //   524: astore          29
        //   526: aload           29
        //   528: athrow         
        //   529: astore          23
        //   531: aload           23
        //   533: athrow         
        //   534: astore          26
        //   536: aload           26
        //   538: athrow         
        //   539: astore          27
        //   541: aload           27
        //   543: athrow         
        //   544: aload           9
        //   546: aload           9
        //   548: invokevirtual   com/whatsapp/protocol/bi.c:()Ljava/lang/String;
        //   551: invokestatic    com/whatsapp/a9t.a:(Ljava/lang/String;)[B
        //   554: putfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   557: aload           9
        //   559: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   562: ifnull          416
        //   565: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   568: aload           9
        //   570: invokevirtual   com/whatsapp/vy.a:(Lcom/whatsapp/protocol/bi;)V
        //   573: goto            416
        //   576: astore          10
        //   578: aload           10
        //   580: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      29     435    506    Ljava/lang/InterruptedException;
        //  29     42     427    435    Any
        //  42     76     435    506    Ljava/lang/InterruptedException;
        //  76     126    506    514    Any
        //  126    144    435    506    Ljava/lang/InterruptedException;
        //  147    163    514    519    Ljava/lang/InterruptedException;
        //  169    176    519    524    Ljava/lang/InterruptedException;
        //  182    211    435    506    Ljava/lang/InterruptedException;
        //  219    226    524    529    Ljava/lang/InterruptedException;
        //  232    261    435    506    Ljava/lang/InterruptedException;
        //  269    286    435    506    Ljava/lang/InterruptedException;
        //  286    301    529    534    Ljava/lang/InterruptedException;
        //  306    317    435    506    Ljava/lang/InterruptedException;
        //  317    332    534    539    Ljava/lang/InterruptedException;
        //  339    346    539    544    Ljava/lang/InterruptedException;
        //  350    416    435    506    Ljava/lang/InterruptedException;
        //  416    421    435    506    Ljava/lang/InterruptedException;
        //  429    432    427    435    Any
        //  432    435    435    506    Ljava/lang/InterruptedException;
        //  446    492    499    506    Any
        //  496    498    499    506    Any
        //  501    503    499    506    Any
        //  508    511    506    514    Any
        //  511    514    435    506    Ljava/lang/InterruptedException;
        //  516    519    519    524    Ljava/lang/InterruptedException;
        //  521    524    435    506    Ljava/lang/InterruptedException;
        //  526    529    435    506    Ljava/lang/InterruptedException;
        //  531    534    435    506    Ljava/lang/InterruptedException;
        //  536    539    539    544    Ljava/lang/InterruptedException;
        //  541    544    435    506    Ljava/lang/InterruptedException;
        //  544    573    576    581    Ljava/lang/InterruptedException;
        //  578    581    435    506    Ljava/lang/InterruptedException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 265, Size: 265
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
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
