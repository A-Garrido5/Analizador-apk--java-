// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

class bh implements Runnable
{
    private static final String[] z;
    final bq a;
    final GoogleDriveActivity b;
    
    static {
        final String[] z2 = new String[3];
        String s = "jIP^&h\u0000CT$d[KC)\"NPR1yH\u000fG<lNG_?aIGE\u007fkDNR\u007fkLK[5i\r";
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
                        c2 = 'P';
                        break;
                    }
                    case 0: {
                        c2 = '\r';
                        break;
                    }
                    case 1: {
                        c2 = '-';
                        break;
                    }
                    case 2: {
                        c2 = '\"';
                        break;
                    }
                    case 3: {
                        c2 = '7';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "jIP^&h\u0000CT$d[KC)\"NPR1yH\u000fG<lNG_?aIGE\u007fiDP\u00186lDNR4-";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "jIP^&h\u0000CT$d[KC)\"NPR1yH\u000fG<lNG_?aIGE\u007fkLK[5i\r";
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
    
    bh(final GoogleDriveActivity b, final bq a) {
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
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore_1       
        //     4: invokestatic    com/whatsapp/qf.i:()V
        //     7: aload_0        
        //     8: getfield        com/whatsapp/gdrive/bh.a:Lcom/whatsapp/gdrive/bq;
        //    11: invokevirtual   com/whatsapp/gdrive/bq.l:()Ljava/util/Set;
        //    14: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    19: astore_2       
        //    20: aload_2        
        //    21: invokeinterface java/util/Iterator.hasNext:()Z
        //    26: ifeq            185
        //    29: aload_2        
        //    30: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    35: checkcast       Ljava/lang/String;
        //    38: astore_3       
        //    39: new             Ljava/io/File;
        //    42: dup            
        //    43: getstatic       com/whatsapp/App.M:Ljava/io/File;
        //    46: aload_3        
        //    47: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    50: astore          4
        //    52: aload           4
        //    54: invokestatic    com/whatsapp/qf.a:(Ljava/io/File;)Z
        //    57: ifeq            181
        //    60: aload           4
        //    62: invokevirtual   java/io/File.exists:()Z
        //    65: istore          6
        //    67: iload           6
        //    69: ifne            181
        //    72: aload           4
        //    74: invokevirtual   java/io/File.getParentFile:()Ljava/io/File;
        //    77: astore          7
        //    79: aload           7
        //    81: invokevirtual   java/io/File.exists:()Z
        //    84: ifne            132
        //    87: aload           7
        //    89: invokevirtual   java/io/File.mkdirs:()Z
        //    92: istore          14
        //    94: iload           14
        //    96: ifne            132
        //    99: new             Ljava/lang/StringBuilder;
        //   102: dup            
        //   103: invokespecial   java/lang/StringBuilder.<init>:()V
        //   106: getstatic       com/whatsapp/gdrive/bh.z:[Ljava/lang/String;
        //   109: iconst_1       
        //   110: aaload         
        //   111: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   114: aload           4
        //   116: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   119: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   122: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   125: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   128: iload_1        
        //   129: ifeq            181
        //   132: aload           4
        //   134: invokevirtual   java/io/File.exists:()Z
        //   137: ifne            181
        //   140: aload           4
        //   142: invokevirtual   java/io/File.createNewFile:()Z
        //   145: istore          13
        //   147: iload           13
        //   149: ifne            181
        //   152: new             Ljava/lang/StringBuilder;
        //   155: dup            
        //   156: invokespecial   java/lang/StringBuilder.<init>:()V
        //   159: getstatic       com/whatsapp/gdrive/bh.z:[Ljava/lang/String;
        //   162: iconst_0       
        //   163: aaload         
        //   164: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   167: aload           4
        //   169: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   172: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   175: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   178: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   181: iload_1        
        //   182: ifeq            20
        //   185: return         
        //   186: astore          5
        //   188: aload           5
        //   190: athrow         
        //   191: astore          8
        //   193: aload           8
        //   195: athrow         
        //   196: astore          9
        //   198: aload           9
        //   200: athrow         
        //   201: astore          10
        //   203: aload           10
        //   205: athrow         
        //   206: astore          11
        //   208: aload           11
        //   210: athrow         
        //   211: astore          12
        //   213: new             Ljava/lang/StringBuilder;
        //   216: dup            
        //   217: invokespecial   java/lang/StringBuilder.<init>:()V
        //   220: getstatic       com/whatsapp/gdrive/bh.z:[Ljava/lang/String;
        //   223: iconst_2       
        //   224: aaload         
        //   225: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   228: aload           4
        //   230: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   233: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   236: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   239: aload           12
        //   241: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   244: goto            181
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  52     67     186    191    Ljava/io/IOException;
        //  79     94     191    196    Ljava/io/IOException;
        //  99     128    196    201    Ljava/io/IOException;
        //  132    147    201    206    Ljava/io/IOException;
        //  152    181    206    247    Ljava/io/IOException;
        //  193    196    196    201    Ljava/io/IOException;
        //  203    206    206    247    Ljava/io/IOException;
        //  208    211    211    247    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 107, Size: 107
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
