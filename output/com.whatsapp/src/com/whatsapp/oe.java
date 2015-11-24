// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.cq;

class oe implements Runnable
{
    private static final String[] z;
    final p9 a;
    final String b;
    final String c;
    final int d;
    final cq e;
    
    static {
        final String[] z2 = new String[3];
        String s = "T\u0014QZ\u0001\u001e\u0016";
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
                        c2 = 'm';
                        break;
                    }
                    case 0: {
                        c2 = '{';
                        break;
                    }
                    case 1: {
                        c2 = 'r';
                        break;
                    }
                    case 2: {
                        c2 = '0';
                        break;
                    }
                    case 3: {
                        c2 = '3';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u001a\u0002@\u001c\u0015\u0016\u0002@\u001c\u001f\u001e\u0011F\u001c\u001a\u001e\u0010oB\u0018\u001e\u0000I\u001c\u001d\t\u0017FZ\b\fR";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\f\u0017R";
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
    
    oe(final p9 a, final cq e, final String b, final int d, final String c) {
        this.a = a;
        this.e = e;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_1       
        //     2: getstatic       com/whatsapp/App.I:Z
        //     5: istore_2       
        //     6: new             Lcom/whatsapp/protocol/cq;
        //     9: dup            
        //    10: invokespecial   com/whatsapp/protocol/cq.<init>:()V
        //    13: astore_3       
        //    14: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    17: aload_0        
        //    18: getfield        com/whatsapp/oe.e:Lcom/whatsapp/protocol/cq;
        //    21: getfield        com/whatsapp/protocol/cq.d:Ljava/lang/String;
        //    24: invokevirtual   com/whatsapp/wc.d:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //    27: astore          4
        //    29: aload           4
        //    31: ifnull          202
        //    34: aload           4
        //    36: invokevirtual   com/whatsapp/a_9.y:()Ljava/io/File;
        //    39: astore          5
        //    41: aload           4
        //    43: getfield        com/whatsapp/a_9.q:I
        //    46: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //    49: aload_0        
        //    50: getfield        com/whatsapp/oe.e:Lcom/whatsapp/protocol/cq;
        //    53: getfield        com/whatsapp/protocol/cq.r:Ljava/lang/String;
        //    56: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    59: ifeq            77
        //    62: aload_3        
        //    63: aload_0        
        //    64: getfield        com/whatsapp/oe.e:Lcom/whatsapp/protocol/cq;
        //    67: getfield        com/whatsapp/protocol/cq.r:Ljava/lang/String;
        //    70: putfield        com/whatsapp/protocol/cq.r:Ljava/lang/String;
        //    73: iload_2        
        //    74: ifeq            202
        //    77: aload           4
        //    79: getfield        com/whatsapp/a_9.q:I
        //    82: istore          8
        //    84: aconst_null    
        //    85: astore          9
        //    87: iload           8
        //    89: iconst_m1      
        //    90: if_icmpeq       196
        //    93: aload           5
        //    95: invokevirtual   java/io/File.exists:()Z
        //    98: istore          10
        //   100: aconst_null    
        //   101: astore          9
        //   103: iload           10
        //   105: ifeq            196
        //   108: new             Ljava/io/FileInputStream;
        //   111: dup            
        //   112: aload           5
        //   114: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   117: astore          11
        //   119: aload           5
        //   121: invokevirtual   java/io/File.length:()J
        //   124: l2i            
        //   125: newarray        B
        //   127: astore          15
        //   129: iload_1        
        //   130: aload           15
        //   132: arraylength    
        //   133: if_icmpge       170
        //   136: aload           11
        //   138: aload           15
        //   140: iload_1        
        //   141: aload           15
        //   143: arraylength    
        //   144: iload_1        
        //   145: isub           
        //   146: invokevirtual   java/io/FileInputStream.read:([BII)I
        //   149: istore          18
        //   151: iload           18
        //   153: iconst_m1      
        //   154: if_icmpne       161
        //   157: iload_2        
        //   158: ifeq            170
        //   161: iload_1        
        //   162: iload           18
        //   164: iadd           
        //   165: istore_1       
        //   166: iload_2        
        //   167: ifeq            129
        //   170: aload           11
        //   172: ifnull          180
        //   175: aload           11
        //   177: invokevirtual   java/io/FileInputStream.close:()V
        //   180: aload_3        
        //   181: aload           4
        //   183: getfield        com/whatsapp/a_9.q:I
        //   186: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   189: putfield        com/whatsapp/protocol/cq.r:Ljava/lang/String;
        //   192: aload           15
        //   194: astore          9
        //   196: aload_3        
        //   197: aload           9
        //   199: putfield        com/whatsapp/protocol/cq.o:[B
        //   202: aload_0        
        //   203: getfield        com/whatsapp/oe.b:Ljava/lang/String;
        //   206: aload_3        
        //   207: aload_0        
        //   208: getfield        com/whatsapp/oe.d:I
        //   211: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;Lcom/whatsapp/protocol/cq;I)V
        //   214: aload_0        
        //   215: getfield        com/whatsapp/oe.b:Ljava/lang/String;
        //   218: aload_0        
        //   219: getfield        com/whatsapp/oe.c:Ljava/lang/String;
        //   222: getstatic       com/whatsapp/oe.z:[Ljava/lang/String;
        //   225: iconst_2       
        //   226: aaload         
        //   227: invokestatic    com/whatsapp/App.b:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   230: return         
        //   231: astore          6
        //   233: aload           6
        //   235: athrow         
        //   236: astore          7
        //   238: aload           7
        //   240: athrow         
        //   241: astore          12
        //   243: aconst_null    
        //   244: astore          11
        //   246: new             Ljava/lang/StringBuilder;
        //   249: dup            
        //   250: invokespecial   java/lang/StringBuilder.<init>:()V
        //   253: getstatic       com/whatsapp/oe.z:[Ljava/lang/String;
        //   256: iconst_1       
        //   257: aaload         
        //   258: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   261: aload_0        
        //   262: getfield        com/whatsapp/oe.e:Lcom/whatsapp/protocol/cq;
        //   265: getfield        com/whatsapp/protocol/cq.d:Ljava/lang/String;
        //   268: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   271: getstatic       com/whatsapp/oe.z:[Ljava/lang/String;
        //   274: iconst_0       
        //   275: aaload         
        //   276: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   279: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   282: aload           12
        //   284: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   287: aload           11
        //   289: ifnull          349
        //   292: aload           11
        //   294: invokevirtual   java/io/FileInputStream.close:()V
        //   297: aconst_null    
        //   298: astore          15
        //   300: goto            180
        //   303: astore          16
        //   305: aconst_null    
        //   306: astore          15
        //   308: goto            180
        //   311: astore          13
        //   313: aconst_null    
        //   314: astore          11
        //   316: aload           11
        //   318: ifnull          326
        //   321: aload           11
        //   323: invokevirtual   java/io/FileInputStream.close:()V
        //   326: aload           13
        //   328: athrow         
        //   329: astore          17
        //   331: goto            180
        //   334: astore          14
        //   336: goto            326
        //   339: astore          13
        //   341: goto            316
        //   344: astore          12
        //   346: goto            246
        //   349: aconst_null    
        //   350: astore          15
        //   352: goto            180
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  41     73     231    236    Ljava/io/IOException;
        //  77     84     236    241    Ljava/io/IOException;
        //  93     100    236    241    Ljava/io/IOException;
        //  108    119    241    246    Ljava/io/IOException;
        //  108    119    311    316    Any
        //  119    129    344    349    Ljava/io/IOException;
        //  119    129    339    344    Any
        //  129    151    344    349    Ljava/io/IOException;
        //  129    151    339    344    Any
        //  175    180    329    334    Ljava/io/IOException;
        //  246    287    339    344    Any
        //  292    297    303    311    Ljava/io/IOException;
        //  321    326    334    339    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 170, Size: 170
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
