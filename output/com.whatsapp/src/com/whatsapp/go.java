// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class go implements Runnable
{
    private static final String[] z;
    final m7 a;
    private long b;
    private long c;
    
    static {
        final String[] z2 = new String[2];
        String s = "W\u007fDhWWd\u0005sTGuXjSF?ErU\\qD{S\u001bfOnE]\u007fD!";
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
                        c2 = '6';
                        break;
                    }
                    case 0: {
                        c2 = '4';
                        break;
                    }
                    case 1: {
                        c2 = '\u0010';
                        break;
                    }
                    case 2: {
                        c2 = '*';
                        break;
                    }
                    case 3: {
                        c2 = '\u001c';
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
                    s = "\u0014cKjSP-";
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
    
    go(final m7 a) {
        this.a = a;
        this.b = 5000L;
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
        //     4: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //     7: invokevirtual   com/whatsapp/wc.h:()I
        //    10: istore_2       
        //    11: aload_0        
        //    12: getfield        com/whatsapp/go.a:Lcom/whatsapp/m7;
        //    15: invokevirtual   com/whatsapp/m7.a:()I
        //    18: istore_3       
        //    19: new             Ljava/lang/StringBuilder;
        //    22: dup            
        //    23: invokespecial   java/lang/StringBuilder.<init>:()V
        //    26: getstatic       com/whatsapp/go.z:[Ljava/lang/String;
        //    29: iconst_0       
        //    30: aaload         
        //    31: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    34: iload_2        
        //    35: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    38: getstatic       com/whatsapp/go.z:[Ljava/lang/String;
        //    41: iconst_1       
        //    42: aaload         
        //    43: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    46: iload_3        
        //    47: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    50: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    53: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    56: iload_3        
        //    57: iload_2        
        //    58: if_icmpne       67
        //    61: return         
        //    62: astore          4
        //    64: aload           4
        //    66: athrow         
        //    67: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    70: invokevirtual   com/whatsapp/App.a5:()Landroid/os/Handler;
        //    73: aload_0        
        //    74: getfield        com/whatsapp/go.a:Lcom/whatsapp/m7;
        //    77: invokestatic    com/whatsapp/m7.a:(Lcom/whatsapp/m7;)Ljava/lang/Runnable;
        //    80: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //    83: pop            
        //    84: invokestatic    java/lang/System.currentTimeMillis:()J
        //    87: aload_0        
        //    88: getfield        com/whatsapp/go.c:J
        //    91: lsub           
        //    92: aload_0        
        //    93: getfield        com/whatsapp/go.b:J
        //    96: lcmp           
        //    97: ifle            111
        //   100: aload_0        
        //   101: ldc2_w          5000
        //   104: putfield        com/whatsapp/go.b:J
        //   107: iload_1        
        //   108: ifeq            129
        //   111: aload_0        
        //   112: ldc2_w          2
        //   115: aload_0        
        //   116: getfield        com/whatsapp/go.b:J
        //   119: lmul           
        //   120: ldc2_w          120000
        //   123: invokestatic    java/lang/Math.min:(JJ)J
        //   126: putfield        com/whatsapp/go.b:J
        //   129: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   132: astore          9
        //   134: invokestatic    com/whatsapp/App.p:()Z
        //   137: ifeq            244
        //   140: getstatic       com/whatsapp/contact/h.INTERACTIVE_DELTA:Lcom/whatsapp/contact/h;
        //   143: astore          10
        //   145: aload           9
        //   147: aload           10
        //   149: invokestatic    com/whatsapp/contact/f.d:(Landroid/content/Context;Lcom/whatsapp/contact/h;)Lcom/whatsapp/contact/k;
        //   152: astore          11
        //   154: aload           11
        //   156: invokevirtual   com/whatsapp/contact/k.isFailure:()Z
        //   159: ifeq            174
        //   162: aload_0        
        //   163: getfield        com/whatsapp/go.a:Lcom/whatsapp/m7;
        //   166: iconst_0       
        //   167: invokevirtual   com/whatsapp/m7.b:(Z)V
        //   170: iload_1        
        //   171: ifeq            194
        //   174: aload           11
        //   176: invokevirtual   com/whatsapp/contact/k.isSuccess:()Z
        //   179: istore          15
        //   181: iload           15
        //   183: ifeq            194
        //   186: aload_0        
        //   187: getfield        com/whatsapp/go.a:Lcom/whatsapp/m7;
        //   190: iconst_0       
        //   191: invokevirtual   com/whatsapp/m7.c:(Z)V
        //   194: aload_0        
        //   195: getfield        com/whatsapp/go.b:J
        //   198: invokestatic    java/lang/Thread.sleep:(J)V
        //   201: aload_0        
        //   202: invokestatic    java/lang/System.currentTimeMillis:()J
        //   205: putfield        com/whatsapp/go.c:J
        //   208: aload           11
        //   210: getstatic       com/whatsapp/contact/k.IN_PROGRESS:Lcom/whatsapp/contact/k;
        //   213: if_acmpne       61
        //   216: aload_0        
        //   217: getfield        com/whatsapp/go.a:Lcom/whatsapp/m7;
        //   220: invokestatic    com/whatsapp/m7.b:(Lcom/whatsapp/m7;)V
        //   223: return         
        //   224: astore          17
        //   226: aload           17
        //   228: athrow         
        //   229: astore          5
        //   231: aload           5
        //   233: athrow         
        //   234: astore          6
        //   236: aload           6
        //   238: athrow         
        //   239: astore          8
        //   241: aload           8
        //   243: athrow         
        //   244: getstatic       com/whatsapp/contact/h.BACKGROUND_DELTA:Lcom/whatsapp/contact/h;
        //   247: astore          10
        //   249: goto            145
        //   252: astore          12
        //   254: aload           12
        //   256: athrow         
        //   257: astore          13
        //   259: aload           13
        //   261: athrow         
        //   262: astore          14
        //   264: aload           14
        //   266: athrow         
        //   267: astore          16
        //   269: goto            201
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  19     56     62     67     Ljava/lang/InterruptedException;
        //  67     107    229    234    Ljava/lang/InterruptedException;
        //  111    129    234    239    Ljava/lang/InterruptedException;
        //  129    145    239    244    Ljava/lang/InterruptedException;
        //  154    170    252    257    Ljava/lang/InterruptedException;
        //  174    181    257    262    Ljava/lang/InterruptedException;
        //  186    194    262    267    Ljava/lang/InterruptedException;
        //  194    201    267    272    Ljava/lang/InterruptedException;
        //  201    223    224    229    Ljava/lang/InterruptedException;
        //  231    234    234    239    Ljava/lang/InterruptedException;
        //  254    257    257    262    Ljava/lang/InterruptedException;
        //  259    262    262    267    Ljava/lang/InterruptedException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 128, Size: 128
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
