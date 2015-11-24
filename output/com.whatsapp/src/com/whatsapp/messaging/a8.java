// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import com.whatsapp.protocol.bf;

final class a8 extends Thread
{
    private static final String[] z;
    private final bc a;
    private final bf b;
    
    static {
        final String[] z2 = new String[12];
        String s = "$\u0000TLw\u00041]Zw\u0017\u0001";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0332:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0012';
                        break;
                    }
                    case 0: {
                        c2 = 'v';
                        break;
                    }
                    case 1: {
                        c2 = 'e';
                        break;
                    }
                    case 2: {
                        c2 = '5';
                        break;
                    }
                    case 3: {
                        c2 = '(';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u000e\bEX=\u0004\u0000TLw\u0004JVG`\u0004\u0010E\\?\u0005\u0011GMs\u001bHPZ`\u0019\u0017\u001a[f\u0017\u000bOI2";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u000e\bEX=\u0004\u0000TLw\u0004JYGu\u0019\u0010A";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u000e\bEX=\u0004\u0000TLw\u0004JPZ`\u0019\u0017";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u000e\bEX=\u0004\u0000TLw\u0004JPZ`\u0019\u0017";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u000e\bEX=\u0004\u0000TLw\u0004JPZ`\u0019\u0017";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u000e\bEX=\u0004\u0000TLw\u0004JPZ`\u0019\u0017";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u000e\bEX=\u0004\u0000TLw\u0004JYGu\u0019\u0010A";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u000e\bEX=\u0004\u0000TLw\u0004JYGu\u0019\u0010A";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u000e\bEX=\u0004\u0000TLw\u0004J\\G?\u0013\u0017GG`";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u000e\bEX=\u0004\u0000TLw\u0004JYGu\u0019\u0010A";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u000e\bEX=\u0004\u0000TLw\u0004JVG`\u0004\u0010E\\?\u0005\u0011GMs\u001bHPZ`\u0019\u0017";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    break Label_0332;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public a8(final bc a, final bf b) {
        super(a8.z[0]);
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
        //     0: getstatic       com/whatsapp/messaging/e.a:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/messaging/a8.b:Lcom/whatsapp/protocol/bf;
        //     8: invokevirtual   com/whatsapp/protocol/bf.n:()Z
        //    11: istore          9
        //    13: iload           9
        //    15: ifne            4
        //    18: getstatic       com/whatsapp/messaging/a8.z:[Ljava/lang/String;
        //    21: bipush          8
        //    23: aaload         
        //    24: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    27: aload_0        
        //    28: getfield        com/whatsapp/messaging/a8.a:Lcom/whatsapp/messaging/bc;
        //    31: invokeinterface com/whatsapp/messaging/bc.c:()V
        //    36: return         
        //    37: astore          6
        //    39: aload           6
        //    41: athrow         
        //    42: astore          7
        //    44: getstatic       com/whatsapp/messaging/a8.z:[Ljava/lang/String;
        //    47: bipush          9
        //    49: aaload         
        //    50: aload           7
        //    52: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    55: getstatic       com/whatsapp/messaging/a8.z:[Ljava/lang/String;
        //    58: iconst_5       
        //    59: aaload         
        //    60: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    63: aload_0        
        //    64: getfield        com/whatsapp/messaging/a8.a:Lcom/whatsapp/messaging/bc;
        //    67: invokeinterface com/whatsapp/messaging/bc.b:()V
        //    72: iload_1        
        //    73: ifeq            36
        //    76: getstatic       com/whatsapp/messaging/a8.z:[Ljava/lang/String;
        //    79: bipush          10
        //    81: aaload         
        //    82: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    85: aload_0        
        //    86: getfield        com/whatsapp/messaging/a8.a:Lcom/whatsapp/messaging/bc;
        //    89: invokeinterface com/whatsapp/messaging/bc.c:()V
        //    94: return         
        //    95: astore          8
        //    97: aload           8
        //    99: athrow         
        //   100: astore          10
        //   102: aload           10
        //   104: athrow         
        //   105: astore          4
        //   107: new             Ljava/lang/StringBuilder;
        //   110: dup            
        //   111: invokespecial   java/lang/StringBuilder.<init>:()V
        //   114: getstatic       com/whatsapp/messaging/a8.z:[Ljava/lang/String;
        //   117: iconst_1       
        //   118: aaload         
        //   119: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   122: aload           4
        //   124: invokevirtual   com/whatsapp/protocol/cz.a:()Ljava/lang/String;
        //   127: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   130: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   133: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   136: getstatic       com/whatsapp/messaging/a8.z:[Ljava/lang/String;
        //   139: bipush          11
        //   141: aaload         
        //   142: aload           4
        //   144: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   147: getstatic       com/whatsapp/messaging/a8.z:[Ljava/lang/String;
        //   150: bipush          6
        //   152: aaload         
        //   153: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   156: aload_0        
        //   157: getfield        com/whatsapp/messaging/a8.a:Lcom/whatsapp/messaging/bc;
        //   160: invokeinterface com/whatsapp/messaging/bc.b:()V
        //   165: iload_1        
        //   166: ifeq            36
        //   169: getstatic       com/whatsapp/messaging/a8.z:[Ljava/lang/String;
        //   172: iconst_2       
        //   173: aaload         
        //   174: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   177: aload_0        
        //   178: getfield        com/whatsapp/messaging/a8.a:Lcom/whatsapp/messaging/bc;
        //   181: invokeinterface com/whatsapp/messaging/bc.c:()V
        //   186: return         
        //   187: astore          5
        //   189: aload           5
        //   191: athrow         
        //   192: astore_2       
        //   193: getstatic       com/whatsapp/messaging/a8.z:[Ljava/lang/String;
        //   196: iconst_3       
        //   197: aaload         
        //   198: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   201: aload_0        
        //   202: getfield        com/whatsapp/messaging/a8.a:Lcom/whatsapp/messaging/bc;
        //   205: invokeinterface com/whatsapp/messaging/bc.b:()V
        //   210: iload_1        
        //   211: ifeq            232
        //   214: getstatic       com/whatsapp/messaging/a8.z:[Ljava/lang/String;
        //   217: bipush          7
        //   219: aaload         
        //   220: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   223: aload_0        
        //   224: getfield        com/whatsapp/messaging/a8.a:Lcom/whatsapp/messaging/bc;
        //   227: invokeinterface com/whatsapp/messaging/bc.c:()V
        //   232: aload_2        
        //   233: athrow         
        //   234: astore_3       
        //   235: aload_3        
        //   236: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  4      13     37     100    Ljava/io/IOException;
        //  4      13     105    192    Lcom/whatsapp/protocol/cz;
        //  4      13     192    237    Any
        //  18     36     100    105    Ljava/io/IOException;
        //  39     42     42     100    Ljava/io/IOException;
        //  39     42     105    192    Lcom/whatsapp/protocol/cz;
        //  39     42     192    237    Any
        //  44     55     192    237    Any
        //  55     72     95     100    Ljava/io/IOException;
        //  76     94     95     100    Ljava/io/IOException;
        //  107    147    192    237    Any
        //  147    165    187    192    Ljava/io/IOException;
        //  169    186    187    192    Ljava/io/IOException;
        //  193    210    234    237    Ljava/io/IOException;
        //  214    232    234    237    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:3035)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
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
