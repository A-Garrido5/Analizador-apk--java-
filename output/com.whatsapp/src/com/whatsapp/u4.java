// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.cq;

class u4 implements Runnable
{
    private static final String[] z;
    final int a;
    final String b;
    final cq c;
    final p9 d;
    final String e;
    
    static {
        final String[] z2 = new String[2];
        String s = "!&\u001b";
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
                        c2 = '`';
                        break;
                    }
                    case 0: {
                        c2 = 'V';
                        break;
                    }
                    case 1: {
                        c2 = 'C';
                        break;
                    }
                    case 2: {
                        c2 = 'y';
                        break;
                    }
                    case 3: {
                        c2 = ']';
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
                    s = "73\tr\u0018;3\tr\u00123 \u000fr\u00173!&,\u001531\u0000r\u0007$,\f-@";
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
    
    u4(final p9 d, final cq c, final String e, final int a, final String b) {
        this.d = d;
        this.c = c;
        this.e = e;
        this.a = a;
        this.b = b;
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
        //     4: new             Lcom/whatsapp/protocol/cq;
        //     7: dup            
        //     8: invokespecial   com/whatsapp/protocol/cq.<init>:()V
        //    11: astore_2       
        //    12: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    15: aload_0        
        //    16: getfield        com/whatsapp/u4.c:Lcom/whatsapp/protocol/cq;
        //    19: getfield        com/whatsapp/protocol/cq.d:Ljava/lang/String;
        //    22: invokevirtual   com/whatsapp/wc.d:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //    25: astore_3       
        //    26: aload_3        
        //    27: ifnull          60
        //    30: aload_3        
        //    31: invokevirtual   com/whatsapp/a_9.m:()Z
        //    34: istore          10
        //    36: iload           10
        //    38: ifeq            60
        //    41: aload_2        
        //    42: aload_3        
        //    43: invokevirtual   com/whatsapp/a_9.i:()Ljava/lang/String;
        //    46: putfield        com/whatsapp/protocol/cq.d:Ljava/lang/String;
        //    49: aload_2        
        //    50: aload_3        
        //    51: getfield        com/whatsapp/a_9.m:Ljava/lang/String;
        //    54: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //    57: putfield        com/whatsapp/protocol/cq.f:J
        //    60: aload_3        
        //    61: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    64: invokestatic    com/whatsapp/adc.a:(Ljava/lang/String;)Lcom/whatsapp/atf;
        //    67: invokevirtual   com/whatsapp/atf.k:()Ljava/util/Collection;
        //    70: astore          4
        //    72: aload_2        
        //    73: new             Ljava/util/Vector;
        //    76: dup            
        //    77: aload           4
        //    79: invokeinterface java/util/Collection.size:()I
        //    84: invokespecial   java/util/Vector.<init>:(I)V
        //    87: putfield        com/whatsapp/protocol/cq.c:Ljava/util/Vector;
        //    90: aload           4
        //    92: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //    97: astore          5
        //    99: aload           5
        //   101: invokeinterface java/util/Iterator.hasNext:()Z
        //   106: ifeq            164
        //   109: aload           5
        //   111: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   116: checkcast       Lcom/whatsapp/wh;
        //   119: astore          6
        //   121: new             Lcom/whatsapp/protocol/cq;
        //   124: dup            
        //   125: invokespecial   com/whatsapp/protocol/cq.<init>:()V
        //   128: astore          7
        //   130: aload           7
        //   132: aload           6
        //   134: getfield        com/whatsapp/wh.c:Ljava/lang/String;
        //   137: putfield        com/whatsapp/protocol/cq.d:Ljava/lang/String;
        //   140: aload           7
        //   142: aload           6
        //   144: getfield        com/whatsapp/wh.b:Z
        //   147: putfield        com/whatsapp/protocol/cq.a:Z
        //   150: aload_2        
        //   151: getfield        com/whatsapp/protocol/cq.c:Ljava/util/Vector;
        //   154: aload           7
        //   156: invokevirtual   java/util/Vector.add:(Ljava/lang/Object;)Z
        //   159: pop            
        //   160: iload_1        
        //   161: ifeq            99
        //   164: aload_0        
        //   165: getfield        com/whatsapp/u4.e:Ljava/lang/String;
        //   168: aload_2        
        //   169: aload_0        
        //   170: getfield        com/whatsapp/u4.a:I
        //   173: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;Lcom/whatsapp/protocol/cq;I)V
        //   176: aload_0        
        //   177: getfield        com/whatsapp/u4.e:Ljava/lang/String;
        //   180: aload_0        
        //   181: getfield        com/whatsapp/u4.b:Ljava/lang/String;
        //   184: getstatic       com/whatsapp/u4.z:[Ljava/lang/String;
        //   187: iconst_0       
        //   188: aaload         
        //   189: invokestatic    com/whatsapp/App.b:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   192: return         
        //   193: astore          9
        //   195: aload           9
        //   197: athrow         
        //   198: astore          11
        //   200: new             Ljava/lang/StringBuilder;
        //   203: dup            
        //   204: invokespecial   java/lang/StringBuilder.<init>:()V
        //   207: getstatic       com/whatsapp/u4.z:[Ljava/lang/String;
        //   210: iconst_1       
        //   211: aaload         
        //   212: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   215: aload_3        
        //   216: getfield        com/whatsapp/a_9.m:Ljava/lang/String;
        //   219: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   222: ldc             " "
        //   224: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   227: aload           11
        //   229: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   232: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   235: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   238: goto            60
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  30     36     193    198    Ljava/lang/NumberFormatException;
        //  49     60     198    241    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0060:
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
