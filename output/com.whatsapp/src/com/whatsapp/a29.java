// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;

class a29 implements Runnable
{
    private static final String[] z;
    final String a;
    final a0x b;
    final bi c;
    
    static {
        final String[] z2 = new String[3];
        String s = "?\u0003zpTz\u0013{(";
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
                        c2 = '>';
                        break;
                    }
                    case 0: {
                        c2 = '\u001f';
                        break;
                    }
                    case 1: {
                        c2 = 'p';
                        break;
                    }
                    case 2: {
                        c2 = '\u000f';
                        break;
                    }
                    case 3: {
                        c2 = '\u0012';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "x\u0002`gN0\u0013}w_k\u0015/sY~\u0019a>\u001eu\u0019k(";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "q\u001f/\u007fMx";
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
    
    a29(final a0x b, final String a, final bi c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc2_w          300
        //     3: invokestatic    java/lang/Thread.sleep:(J)V
        //     6: new             Ljava/lang/StringBuilder;
        //     9: dup            
        //    10: invokespecial   java/lang/StringBuilder.<init>:()V
        //    13: getstatic       com/whatsapp/a29.z:[Ljava/lang/String;
        //    16: iconst_1       
        //    17: aaload         
        //    18: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    21: aload_0        
        //    22: getfield        com/whatsapp/a29.a:Ljava/lang/String;
        //    25: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    28: getstatic       com/whatsapp/a29.z:[Ljava/lang/String;
        //    31: iconst_0       
        //    32: aaload         
        //    33: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    36: astore_3       
        //    37: aload_0        
        //    38: getfield        com/whatsapp/a29.c:Lcom/whatsapp/protocol/bi;
        //    41: ifnonnull       100
        //    44: getstatic       com/whatsapp/a29.z:[Ljava/lang/String;
        //    47: iconst_2       
        //    48: aaload         
        //    49: astore          5
        //    51: aload_3        
        //    52: aload           5
        //    54: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    57: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    60: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    63: new             Lcom/whatsapp/n9;
        //    66: dup            
        //    67: aload_0        
        //    68: getfield        com/whatsapp/a29.a:Ljava/lang/String;
        //    71: aload_0        
        //    72: getfield        com/whatsapp/a29.c:Lcom/whatsapp/protocol/bi;
        //    75: invokevirtual   com/whatsapp/protocol/bi.c:()Ljava/lang/String;
        //    78: aload_0        
        //    79: getfield        com/whatsapp/a29.c:Lcom/whatsapp/protocol/bi;
        //    82: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //    85: checkcast       Ljava/util/Vector;
        //    88: bipush          13
        //    90: invokespecial   com/whatsapp/n9.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/util/Vector;I)V
        //    93: invokestatic    com/whatsapp/App.d:(Lcom/whatsapp/n9;)V
        //    96: return         
        //    97: astore_1       
        //    98: aload_1        
        //    99: athrow         
        //   100: aload_0        
        //   101: getfield        com/whatsapp/a29.c:Lcom/whatsapp/protocol/bi;
        //   104: invokevirtual   com/whatsapp/protocol/bi.c:()Ljava/lang/String;
        //   107: astore          4
        //   109: aload           4
        //   111: astore          5
        //   113: goto            51
        //   116: astore_2       
        //   117: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      51     97     100    Ljava/lang/InterruptedException;
        //  51     96     116    118    Ljava/lang/InterruptedException;
        //  98     100    116    118    Ljava/lang/InterruptedException;
        //  100    109    116    118    Ljava/lang/InterruptedException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0051:
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
