// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class ta implements Runnable
{
    private static final String[] z;
    final _o a;
    final byte[] b;
    final byte[][] c;
    final byte[] d;
    final byte e;
    final byte[] f;
    
    static {
        final String[] z2 = new String[4];
        String s = "\u000f\u0003\u00040\u0012\u001a\u0017K,\u000f\u000b[\u00009\u0004N\u001f\u0002;\u0018\u001d\u000fK\u000f5/JK=\u0011\t\u0014\u00195\t\u0006\u0016K)\u0013\u0005\u0015\u0004+\u0013";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '}';
                        break;
                    }
                    case 0: {
                        c2 = 'n';
                        break;
                    }
                    case 1: {
                        c2 = '{';
                        break;
                    }
                    case 2: {
                        c2 = 'k';
                        break;
                    }
                    case 3: {
                        c2 = '\\';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u000f\u0003\u00040\u0012\u001a\u0017K,\u000f\u000b[\u00009\u0004N\u001f\u0002;\u0018\u001d\u000fK?\u0015\u000b\u0018\u0000|\r\u000f\b\u00189\u0019";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u000f\u0003\u00040\u0012\u001a\u0017K,\u000f\u000b[\u00009\u0004N\u001f\u0002;\u0018\u001d\u000fK?\u0015\u000b\u0018\u0000|\u001b\u000f\u0012\u00079\u0019";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "=3*m";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    ta(final _o a, final byte e, final byte[] d, final byte[] f, final byte[][] c, final byte[] b) {
        this.a = a;
        this.e = e;
        this.d = d;
        this.f = f;
        this.c = c;
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
        //     4: aload_0        
        //     5: getfield        com/whatsapp/ta.e:B
        //     8: iconst_5       
        //     9: if_icmpeq       23
        //    12: aload_0        
        //    13: getfield        com/whatsapp/ta.a:Lcom/whatsapp/_o;
        //    16: invokestatic    com/whatsapp/_o.a:(Lcom/whatsapp/_o;)V
        //    19: return         
        //    20: astore_2       
        //    21: aload_2        
        //    22: athrow         
        //    23: aload_0        
        //    24: getfield        com/whatsapp/ta.d:[B
        //    27: invokestatic    org/whispersystems/m.a:([B)I
        //    30: istore_3       
        //    31: iload_3        
        //    32: aload_0        
        //    33: getfield        com/whatsapp/ta.a:Lcom/whatsapp/_o;
        //    36: invokestatic    com/whatsapp/_o.b:(Lcom/whatsapp/_o;)Lcom/whatsapp/App;
        //    39: getfield        com/whatsapp/App.a2:Lcom/whatsapp/ha;
        //    42: invokevirtual   com/whatsapp/ha.b:()I
        //    45: if_icmpeq       61
        //    48: aload_0        
        //    49: getfield        com/whatsapp/ta.a:Lcom/whatsapp/_o;
        //    52: invokestatic    com/whatsapp/_o.a:(Lcom/whatsapp/_o;)V
        //    55: return         
        //    56: astore          4
        //    58: aload           4
        //    60: athrow         
        //    61: aload_0        
        //    62: getfield        com/whatsapp/ta.a:Lcom/whatsapp/_o;
        //    65: invokestatic    com/whatsapp/_o.b:(Lcom/whatsapp/_o;)Lcom/whatsapp/App;
        //    68: getfield        com/whatsapp/App.a2:Lcom/whatsapp/ha;
        //    71: invokevirtual   com/whatsapp/ha.a:()[B
        //    74: astore          5
        //    76: aload_0        
        //    77: getfield        com/whatsapp/ta.a:Lcom/whatsapp/_o;
        //    80: invokestatic    com/whatsapp/_o.b:(Lcom/whatsapp/_o;)Lcom/whatsapp/App;
        //    83: getfield        com/whatsapp/App.a2:Lcom/whatsapp/ha;
        //    86: invokevirtual   com/whatsapp/ha.g:()Lcom/whatsapp/it;
        //    89: invokevirtual   com/whatsapp/it.b:()Lcom/whatsapp/protocol/b2;
        //    92: astore          6
        //    94: aload           6
        //    96: getfield        com/whatsapp/protocol/b2.c:[B
        //    99: aload_0        
        //   100: getfield        com/whatsapp/ta.f:[B
        //   103: invokestatic    java/util/Arrays.equals:([B[B)Z
        //   106: ifne            122
        //   109: aload_0        
        //   110: getfield        com/whatsapp/ta.a:Lcom/whatsapp/_o;
        //   113: invokestatic    com/whatsapp/_o.a:(Lcom/whatsapp/_o;)V
        //   116: return         
        //   117: astore          7
        //   119: aload           7
        //   121: athrow         
        //   122: aload_0        
        //   123: getfield        com/whatsapp/ta.a:Lcom/whatsapp/_o;
        //   126: aload_0        
        //   127: getfield        com/whatsapp/ta.c:[[B
        //   130: invokestatic    com/whatsapp/_o.a:(Lcom/whatsapp/_o;[[B)[I
        //   133: astore          8
        //   135: aload_0        
        //   136: getfield        com/whatsapp/ta.a:Lcom/whatsapp/_o;
        //   139: invokestatic    com/whatsapp/_o.b:(Lcom/whatsapp/_o;)Lcom/whatsapp/App;
        //   142: getfield        com/whatsapp/App.a2:Lcom/whatsapp/ha;
        //   145: aload           8
        //   147: invokevirtual   com/whatsapp/ha.a:([I)[Lcom/whatsapp/protocol/b2;
        //   150: astore          9
        //   152: aload           9
        //   154: ifnull          176
        //   157: aload           9
        //   159: arraylength    
        //   160: istore          12
        //   162: aload_0        
        //   163: getfield        com/whatsapp/ta.c:[[B
        //   166: arraylength    
        //   167: istore          13
        //   169: iload           12
        //   171: iload           13
        //   173: if_icmpeq       194
        //   176: aload_0        
        //   177: getfield        com/whatsapp/ta.a:Lcom/whatsapp/_o;
        //   180: invokestatic    com/whatsapp/_o.a:(Lcom/whatsapp/_o;)V
        //   183: return         
        //   184: astore          10
        //   186: aload           10
        //   188: athrow         
        //   189: astore          11
        //   191: aload           11
        //   193: athrow         
        //   194: getstatic       com/whatsapp/ta.z:[Ljava/lang/String;
        //   197: iconst_3       
        //   198: aaload         
        //   199: invokestatic    java/security/MessageDigest.getInstance:(Ljava/lang/String;)Ljava/security/MessageDigest;
        //   202: astore          15
        //   204: aload           15
        //   206: aload           5
        //   208: invokevirtual   java/security/MessageDigest.update:([B)V
        //   211: aload           15
        //   213: aload           6
        //   215: getfield        com/whatsapp/protocol/b2.b:[B
        //   218: invokevirtual   java/security/MessageDigest.update:([B)V
        //   221: aload           15
        //   223: aload           6
        //   225: getfield        com/whatsapp/protocol/b2.a:[B
        //   228: invokevirtual   java/security/MessageDigest.update:([B)V
        //   231: aload           9
        //   233: arraylength    
        //   234: istore          16
        //   236: iconst_0       
        //   237: istore          17
        //   239: iload           17
        //   241: iload           16
        //   243: if_icmpge       266
        //   246: aload           15
        //   248: aload           9
        //   250: iload           17
        //   252: aaload         
        //   253: getfield        com/whatsapp/protocol/b2.b:[B
        //   256: invokevirtual   java/security/MessageDigest.update:([B)V
        //   259: iinc            17, 1
        //   262: iload_1        
        //   263: ifeq            239
        //   266: aload           15
        //   268: invokevirtual   java/security/MessageDigest.digest:()[B
        //   271: astore          18
        //   273: aload           18
        //   275: aload_0        
        //   276: getfield        com/whatsapp/ta.b:[B
        //   279: invokestatic    java/util/Arrays.equals:([B[B)Z
        //   282: istore          21
        //   284: iload           21
        //   286: ifne            308
        //   289: getstatic       com/whatsapp/ta.z:[Ljava/lang/String;
        //   292: iconst_2       
        //   293: aaload         
        //   294: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   297: aload_0        
        //   298: getfield        com/whatsapp/ta.a:Lcom/whatsapp/_o;
        //   301: invokestatic    com/whatsapp/_o.a:(Lcom/whatsapp/_o;)V
        //   304: iload_1        
        //   305: ifeq            19
        //   308: getstatic       com/whatsapp/ta.z:[Ljava/lang/String;
        //   311: iconst_1       
        //   312: aaload         
        //   313: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   316: return         
        //   317: astore          20
        //   319: aload           20
        //   321: athrow         
        //   322: astore          14
        //   324: getstatic       com/whatsapp/ta.z:[Ljava/lang/String;
        //   327: iconst_0       
        //   328: aaload         
        //   329: aload           14
        //   331: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   334: aload_0        
        //   335: getfield        com/whatsapp/ta.a:Lcom/whatsapp/_o;
        //   338: invokestatic    com/whatsapp/_o.a:(Lcom/whatsapp/_o;)V
        //   341: return         
        //   342: astore          19
        //   344: aload           19
        //   346: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                    
        //  -----  -----  -----  -----  ----------------------------------------
        //  4      19     20     23     Ljava/security/NoSuchAlgorithmException;
        //  31     55     56     61     Ljava/security/NoSuchAlgorithmException;
        //  94     116    117    122    Ljava/security/NoSuchAlgorithmException;
        //  157    169    189    194    Ljava/security/NoSuchAlgorithmException;
        //  176    183    184    189    Ljava/security/NoSuchAlgorithmException;
        //  191    194    184    189    Ljava/security/NoSuchAlgorithmException;
        //  194    204    322    342    Ljava/security/NoSuchAlgorithmException;
        //  273    284    342    347    Ljava/security/NoSuchAlgorithmException;
        //  289    304    317    322    Ljava/security/NoSuchAlgorithmException;
        //  308    316    317    322    Ljava/security/NoSuchAlgorithmException;
        //  344    347    317    322    Ljava/security/NoSuchAlgorithmException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0308:
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
