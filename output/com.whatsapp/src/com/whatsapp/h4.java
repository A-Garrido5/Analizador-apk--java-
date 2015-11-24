// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class h4 implements Runnable
{
    private static final String[] z;
    final a_9 a;
    final wc b;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u0014!L\u001e\u000f\u0014:}\u0007\u000f\u0019/E\u000f\u001cX-J\u000f\r\u001c\u0011C\u0004\n(/F\u000e1\u0014!L\u001e\u000f\u0014:}\u001e\u0006\u0005+C\u000eA\u00047L\t1\u0016\"P\u000f\u000f\u00137}\u000f\u0000\u0013+F";
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
                        c2 = 'n';
                        break;
                    }
                    case 0: {
                        c2 = 'w';
                        break;
                    }
                    case 1: {
                        c2 = 'N';
                        break;
                    }
                    case 2: {
                        c2 = '\"';
                        break;
                    }
                    case 3: {
                        c2 = 'j';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0014!L\u001e\u000f\u0014:}\u0007\u000f\u0019/E\u000f\u001cX-J\u000f\r\u001c\u0011C\u0004\n(/F\u000e1\u0014!L\u001e\u000f\u0014:}\u001e\u0006\u0005+C\u000eA\u00047L\t1\u0016\"P\u000f\u000f\u00137}\u000f\u0000\u0013+F";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\u0014!L\u001e\u000f\u0014:}\u0007\u000f\u0019/E\u000f\u001cX-J\u000f\r\u001c\u0011C\u0004\n(/F\u000e1\u0014!L\u001e\u000f\u0014:}\u001e\u0006\u0005+C\u000eA\u00047L\t1\u0016\"P\u000f\u000f\u00137}\u000f\u0000\u0013+F";
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
    
    h4(final wc b, final a_9 a) {
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
        //     0: aload_0        
        //     1: getfield        com/whatsapp/h4.a:Lcom/whatsapp/a_9;
        //     4: invokestatic    com/whatsapp/contact/f.a:(Lcom/whatsapp/a_9;)Z
        //     7: pop            
        //     8: new             Ljava/util/ArrayList;
        //    11: dup            
        //    12: invokespecial   java/util/ArrayList.<init>:()V
        //    15: astore          5
        //    17: aload           5
        //    19: aload_0        
        //    20: getfield        com/whatsapp/h4.a:Lcom/whatsapp/a_9;
        //    23: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    26: pop            
        //    27: aload_0        
        //    28: getfield        com/whatsapp/h4.a:Lcom/whatsapp/a_9;
        //    31: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    34: ifnull          73
        //    37: aload_0        
        //    38: getfield        com/whatsapp/h4.b:Lcom/whatsapp/wc;
        //    41: invokestatic    com/whatsapp/wc.a:(Lcom/whatsapp/wc;)Lcom/whatsapp/v6;
        //    44: aload_0        
        //    45: getfield        com/whatsapp/h4.a:Lcom/whatsapp/a_9;
        //    48: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    51: invokevirtual   com/whatsapp/v6.a:(Ljava/lang/String;)Z
        //    54: istore          12
        //    56: iload           12
        //    58: ifne            73
        //    61: aload_0        
        //    62: getfield        com/whatsapp/h4.b:Lcom/whatsapp/wc;
        //    65: invokestatic    com/whatsapp/wc.a:(Lcom/whatsapp/wc;)Lcom/whatsapp/v6;
        //    68: aload           5
        //    70: invokevirtual   com/whatsapp/v6.e:(Ljava/util/Collection;)V
        //    73: aload_0        
        //    74: getfield        com/whatsapp/h4.a:Lcom/whatsapp/a_9;
        //    77: getfield        com/whatsapp/a_9.b:Z
        //    80: ifeq            111
        //    83: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    86: aload_0        
        //    87: getfield        com/whatsapp/h4.a:Lcom/whatsapp/a_9;
        //    90: invokestatic    com/whatsapp/accountsync/PerformSyncManager.a:(Landroid/content/Context;Lcom/whatsapp/a_9;)V
        //    93: getstatic       com/whatsapp/App.av:Landroid/os/Handler;
        //    96: iconst_1       
        //    97: invokevirtual   android/os/Handler.sendEmptyMessage:(I)Z
        //   100: pop            
        //   101: aload_0        
        //   102: getfield        com/whatsapp/h4.a:Lcom/whatsapp/a_9;
        //   105: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   108: invokestatic    com/whatsapp/Conversation.i:(Ljava/lang/String;)V
        //   111: invokestatic    com/whatsapp/contact/f.d:()Z
        //   114: ifne            125
        //   117: getstatic       com/whatsapp/h4.z:[Ljava/lang/String;
        //   120: iconst_2       
        //   121: aaload         
        //   122: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   125: return         
        //   126: astore          6
        //   128: aload           6
        //   130: athrow         
        //   131: astore          7
        //   133: aload           7
        //   135: athrow         
        //   136: astore_3       
        //   137: aload_3        
        //   138: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   141: invokestatic    com/whatsapp/contact/f.d:()Z
        //   144: ifne            125
        //   147: getstatic       com/whatsapp/h4.z:[Ljava/lang/String;
        //   150: iconst_1       
        //   151: aaload         
        //   152: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   155: return         
        //   156: astore          9
        //   158: aload           9
        //   160: athrow         
        //   161: astore_1       
        //   162: invokestatic    com/whatsapp/contact/f.d:()Z
        //   165: ifne            176
        //   168: getstatic       com/whatsapp/h4.z:[Ljava/lang/String;
        //   171: iconst_0       
        //   172: aaload         
        //   173: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   176: aload_1        
        //   177: athrow         
        //   178: astore          10
        //   180: aload           10
        //   182: athrow         
        //   183: astore_2       
        //   184: aload_2        
        //   185: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      17     136    156    Ljava/lang/Exception;
        //  0      17     161    178    Any
        //  17     56     126    131    Ljava/lang/Exception;
        //  17     56     161    178    Any
        //  61     73     131    136    Ljava/lang/Exception;
        //  61     73     161    178    Any
        //  73     111    156    161    Ljava/lang/Exception;
        //  73     111    161    178    Any
        //  111    125    178    183    Ljava/lang/Exception;
        //  128    131    131    136    Ljava/lang/Exception;
        //  128    131    161    178    Any
        //  133    136    136    156    Ljava/lang/Exception;
        //  133    136    161    178    Any
        //  137    141    161    178    Any
        //  158    161    136    156    Ljava/lang/Exception;
        //  158    161    161    178    Any
        //  162    176    183    186    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 89, Size: 89
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
