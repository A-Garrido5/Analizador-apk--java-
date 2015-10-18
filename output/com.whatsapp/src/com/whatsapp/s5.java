// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class s5 implements Runnable
{
    private static final String[] z;
    final ps a;
    
    static {
        final String[] z2 = new String[3];
        String s = "/\ne3v7\nx5<*\u0011m\"g/\ne3v7\nx5<*\u0011m\"g?\u0004e<v=";
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
                        c2 = '\u0013';
                        break;
                    }
                    case 0: {
                        c2 = 'Y';
                        break;
                    }
                    case 1: {
                        c2 = 'e';
                        break;
                    }
                    case 2: {
                        c2 = '\f';
                        break;
                    }
                    case 3: {
                        c2 = 'P';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "/\ne3v7\nx5<*\u0011m\"g/\ne3v7\nx5<*\u0011m\"g";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "/\ne3v7\nx5<*\u0011m\"g/\ne3v7\nx5<*\u000ee ";
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
    
    s5(final ps a) {
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
        //     1: getfield        com/whatsapp/s5.a:Lcom/whatsapp/ps;
        //     4: invokestatic    java/lang/System.currentTimeMillis:()J
        //     7: invokestatic    com/whatsapp/ps.a:(Lcom/whatsapp/ps;J)J
        //    10: pop2           
        //    11: aload_0        
        //    12: getfield        com/whatsapp/s5.a:Lcom/whatsapp/ps;
        //    15: invokestatic    com/whatsapp/ps.e:(Lcom/whatsapp/ps;)Lcom/whatsapp/od;
        //    18: ifnull          125
        //    21: getstatic       com/whatsapp/s5.z:[Ljava/lang/String;
        //    24: iconst_1       
        //    25: aaload         
        //    26: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    29: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    32: istore          6
        //    34: iload           6
        //    36: bipush          16
        //    38: if_icmplt       56
        //    41: invokestatic    com/whatsapp/ps.d:()Landroid/media/SoundPool;
        //    44: aload_0        
        //    45: getfield        com/whatsapp/s5.a:Lcom/whatsapp/ps;
        //    48: invokestatic    com/whatsapp/ps.d:(Lcom/whatsapp/ps;)I
        //    51: fconst_0       
        //    52: fconst_0       
        //    53: invokevirtual   android/media/SoundPool.setVolume:(IFF)V
        //    56: aload_0        
        //    57: getfield        com/whatsapp/s5.a:Lcom/whatsapp/ps;
        //    60: invokestatic    com/whatsapp/ps.e:(Lcom/whatsapp/ps;)Lcom/whatsapp/od;
        //    63: invokevirtual   com/whatsapp/od.d:()V
        //    66: aload_0        
        //    67: getfield        com/whatsapp/s5.a:Lcom/whatsapp/ps;
        //    70: invokestatic    com/whatsapp/ps.g:(Lcom/whatsapp/ps;)Landroid/os/Handler;
        //    73: iconst_0       
        //    74: invokevirtual   android/os/Handler.sendEmptyMessage:(I)Z
        //    77: pop            
        //    78: return         
        //    79: astore_1       
        //    80: aload_1        
        //    81: athrow         
        //    82: astore_2       
        //    83: aload_2        
        //    84: athrow         
        //    85: astore          7
        //    87: getstatic       com/whatsapp/s5.z:[Ljava/lang/String;
        //    90: iconst_0       
        //    91: aaload         
        //    92: aload           7
        //    94: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    97: aload_0        
        //    98: getfield        com/whatsapp/s5.a:Lcom/whatsapp/ps;
        //   101: iconst_0       
        //   102: invokevirtual   com/whatsapp/ps.b:(Z)V
        //   105: aload_0        
        //   106: getfield        com/whatsapp/s5.a:Lcom/whatsapp/ps;
        //   109: invokestatic    com/whatsapp/ps.j:(Lcom/whatsapp/ps;)Lcom/whatsapp/gu;
        //   112: ldc             2131231088
        //   114: invokeinterface com/whatsapp/gu.a:(I)V
        //   119: getstatic       com/whatsapp/App.I:Z
        //   122: ifeq            78
        //   125: getstatic       com/whatsapp/s5.z:[Ljava/lang/String;
        //   128: iconst_2       
        //   129: aaload         
        //   130: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   133: return         
        //   134: astore          5
        //   136: aload           5
        //   138: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      34     79     82     Ljava/lang/Exception;
        //  41     56     82     85     Ljava/lang/Exception;
        //  56     78     85     125    Ljava/lang/Exception;
        //  80     82     82     85     Ljava/lang/Exception;
        //  87     125    134    139    Ljava/lang/Exception;
        //  125    133    134    139    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 67, Size: 67
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
