// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.b2;

class a0q implements Runnable
{
    private static final String[] z;
    final String a;
    final b2 b;
    final byte c;
    final _o d;
    final byte[] e;
    final b2 f;
    final byte[] g;
    
    static {
        final String[] z2 = new String[3];
        String s = "7\u007fw\u000bZ7u!\u0019_9\u007fd\u000e\u0016.cdJ];h!\u0018S*ds\u0004S:1g\u0018Y31r\u000fD(tsJR+ch\u0004Q~as\u000f\u00165txJP;eb\u0002\u00168~sJ";
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
                        c2 = '6';
                        break;
                    }
                    case 0: {
                        c2 = '^';
                        break;
                    }
                    case 1: {
                        c2 = '\u0011';
                        break;
                    }
                    case 2: {
                        c2 = '\u0001';
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
                    s = "7\u007fw\u000bZ7u!\u0003R;\u007fu\u0003B'1j\u000fO~cd\u001eC,\u007fd\u000e\u00168cn\u0007\u0016-ts\u001cS,1e\u001fD7\u007ffJF,t!\u0001S'1g\u000fB=y!\fY,1k\u0003R~";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "7\u007fw\u000bZ7u!\u001aD;1j\u000fO~cd\u001eC,\u007fd\u000e\u00168cn\u0007\u0016-ts\u001cS,1e\u001fD7\u007ffJF,t!\u0001S'1g\u000fB=y!\fY,1";
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
    
    a0q(final _o d, final String a, final byte[] g, final byte c, final b2 b, final b2 f, final byte[] e) {
        this.d = d;
        this.a = a;
        this.g = g;
        this.c = c;
        this.b = b;
        this.f = f;
        this.e = e;
    }
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/a0q.a:Ljava/lang/String;
        //     4: invokestatic    com/whatsapp/ha.g:(Ljava/lang/String;)Lorg/whispersystems/V;
        //     7: astore_1       
        //     8: iconst_1       
        //     9: aload_0        
        //    10: getfield        com/whatsapp/a0q.g:[B
        //    13: arraylength    
        //    14: iadd           
        //    15: newarray        B
        //    17: astore          24
        //    19: aload           24
        //    21: iconst_0       
        //    22: aload_0        
        //    23: getfield        com/whatsapp/a0q.c:B
        //    26: bastore        
        //    27: aload_0        
        //    28: getfield        com/whatsapp/a0q.g:[B
        //    31: iconst_0       
        //    32: aload           24
        //    34: iconst_1       
        //    35: aload_0        
        //    36: getfield        com/whatsapp/a0q.g:[B
        //    39: arraylength    
        //    40: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //    43: new             Lorg/whispersystems/o;
        //    46: dup            
        //    47: aload           24
        //    49: iconst_0       
        //    50: invokespecial   org/whispersystems/o.<init>:([BI)V
        //    53: astore_3       
        //    54: new             Lorg/whispersystems/Q;
        //    57: dup            
        //    58: aload_0        
        //    59: getfield        com/whatsapp/a0q.d:Lcom/whatsapp/_o;
        //    62: invokestatic    com/whatsapp/_o.b:(Lcom/whatsapp/_o;)Lcom/whatsapp/App;
        //    65: getfield        com/whatsapp/App.a2:Lcom/whatsapp/ha;
        //    68: aload_0        
        //    69: getfield        com/whatsapp/a0q.d:Lcom/whatsapp/_o;
        //    72: invokestatic    com/whatsapp/_o.b:(Lcom/whatsapp/_o;)Lcom/whatsapp/App;
        //    75: getfield        com/whatsapp/App.a2:Lcom/whatsapp/ha;
        //    78: aload_0        
        //    79: getfield        com/whatsapp/a0q.d:Lcom/whatsapp/_o;
        //    82: invokestatic    com/whatsapp/_o.b:(Lcom/whatsapp/_o;)Lcom/whatsapp/App;
        //    85: getfield        com/whatsapp/App.a2:Lcom/whatsapp/ha;
        //    88: invokevirtual   com/whatsapp/ha.g:()Lcom/whatsapp/it;
        //    91: aload_0        
        //    92: getfield        com/whatsapp/a0q.d:Lcom/whatsapp/_o;
        //    95: invokestatic    com/whatsapp/_o.b:(Lcom/whatsapp/_o;)Lcom/whatsapp/App;
        //    98: getfield        com/whatsapp/App.a2:Lcom/whatsapp/ha;
        //   101: aload_1        
        //   102: invokespecial   org/whispersystems/Q.<init>:(Lorg/whispersystems/i;Lorg/whispersystems/M;Lorg/whispersystems/a4;Lorg/whispersystems/a5;Lorg/whispersystems/V;)V
        //   105: astore          4
        //   107: aload_0        
        //   108: getfield        com/whatsapp/a0q.b:Lcom/whatsapp/protocol/b2;
        //   111: ifnull          128
        //   114: aload_0        
        //   115: getfield        com/whatsapp/a0q.b:Lcom/whatsapp/protocol/b2;
        //   118: getfield        com/whatsapp/protocol/b2.b:[B
        //   121: astore          19
        //   123: aload           19
        //   125: ifnonnull       323
        //   128: aconst_null    
        //   129: astore          6
        //   131: iconst_1       
        //   132: aload_0        
        //   133: getfield        com/whatsapp/a0q.f:Lcom/whatsapp/protocol/b2;
        //   136: getfield        com/whatsapp/protocol/b2.b:[B
        //   139: arraylength    
        //   140: iadd           
        //   141: newarray        B
        //   143: astore          17
        //   145: aload           17
        //   147: iconst_0       
        //   148: aload_0        
        //   149: getfield        com/whatsapp/a0q.c:B
        //   152: bastore        
        //   153: aload_0        
        //   154: getfield        com/whatsapp/a0q.f:Lcom/whatsapp/protocol/b2;
        //   157: getfield        com/whatsapp/protocol/b2.b:[B
        //   160: iconst_0       
        //   161: aload           17
        //   163: iconst_1       
        //   164: aload_0        
        //   165: getfield        com/whatsapp/a0q.f:Lcom/whatsapp/protocol/b2;
        //   168: getfield        com/whatsapp/protocol/b2.b:[B
        //   171: arraylength    
        //   172: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   175: aload           17
        //   177: iconst_0       
        //   178: invokestatic    org/whispersystems/s.a:([BI)Lorg/whispersystems/ak;
        //   181: astore          18
        //   183: aload           18
        //   185: astore          8
        //   187: aload_0        
        //   188: getfield        com/whatsapp/a0q.e:[B
        //   191: invokestatic    org/whispersystems/m.a:([B)I
        //   194: istore          11
        //   196: aload_0        
        //   197: getfield        com/whatsapp/a0q.b:Lcom/whatsapp/protocol/b2;
        //   200: astore          13
        //   202: aload           13
        //   204: ifnonnull       498
        //   207: iconst_m1      
        //   208: istore          15
        //   210: aload           4
        //   212: new             Lorg/whispersystems/bP;
        //   215: dup            
        //   216: iload           11
        //   218: iconst_0       
        //   219: iload           15
        //   221: aload           6
        //   223: aload_0        
        //   224: getfield        com/whatsapp/a0q.f:Lcom/whatsapp/protocol/b2;
        //   227: getfield        com/whatsapp/protocol/b2.c:[B
        //   230: iconst_0       
        //   231: invokestatic    org/whispersystems/m.a:([BI)I
        //   234: aload           8
        //   236: aload_0        
        //   237: getfield        com/whatsapp/a0q.f:Lcom/whatsapp/protocol/b2;
        //   240: getfield        com/whatsapp/protocol/b2.a:[B
        //   243: aload_3        
        //   244: invokespecial   org/whispersystems/bP.<init>:(IIILorg/whispersystems/ak;ILorg/whispersystems/ak;[BLorg/whispersystems/o;)V
        //   247: invokevirtual   org/whispersystems/Q.a:(Lorg/whispersystems/bP;)V
        //   250: aload_0        
        //   251: getfield        com/whatsapp/a0q.d:Lcom/whatsapp/_o;
        //   254: invokestatic    com/whatsapp/_o.b:(Lcom/whatsapp/_o;)Lcom/whatsapp/App;
        //   257: invokevirtual   com/whatsapp/App.a5:()Landroid/os/Handler;
        //   260: new             Lcom/whatsapp/a2v;
        //   263: dup            
        //   264: aload_0        
        //   265: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   268: aload_0        
        //   269: getfield        com/whatsapp/a0q.a:Ljava/lang/String;
        //   272: invokevirtual   com/whatsapp/vy.p:(Ljava/lang/String;)Z
        //   275: invokespecial   com/whatsapp/a2v.<init>:(Lcom/whatsapp/a0q;Z)V
        //   278: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   281: pop            
        //   282: return         
        //   283: astore_2       
        //   284: new             Ljava/lang/StringBuilder;
        //   287: dup            
        //   288: invokespecial   java/lang/StringBuilder.<init>:()V
        //   291: getstatic       com/whatsapp/a0q.z:[Ljava/lang/String;
        //   294: iconst_1       
        //   295: aaload         
        //   296: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   299: aload_0        
        //   300: getfield        com/whatsapp/a0q.a:Ljava/lang/String;
        //   303: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   306: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   309: aload_2        
        //   310: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   313: aconst_null    
        //   314: astore_3       
        //   315: goto            54
        //   318: astore          5
        //   320: aload           5
        //   322: athrow         
        //   323: iconst_1       
        //   324: aload_0        
        //   325: getfield        com/whatsapp/a0q.b:Lcom/whatsapp/protocol/b2;
        //   328: getfield        com/whatsapp/protocol/b2.b:[B
        //   331: arraylength    
        //   332: iadd           
        //   333: newarray        B
        //   335: astore          22
        //   337: aload           22
        //   339: iconst_0       
        //   340: aload_0        
        //   341: getfield        com/whatsapp/a0q.c:B
        //   344: bastore        
        //   345: aload_0        
        //   346: getfield        com/whatsapp/a0q.b:Lcom/whatsapp/protocol/b2;
        //   349: getfield        com/whatsapp/protocol/b2.b:[B
        //   352: iconst_0       
        //   353: aload           22
        //   355: iconst_1       
        //   356: aload_0        
        //   357: getfield        com/whatsapp/a0q.b:Lcom/whatsapp/protocol/b2;
        //   360: getfield        com/whatsapp/protocol/b2.b:[B
        //   363: arraylength    
        //   364: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   367: aload           22
        //   369: iconst_0       
        //   370: invokestatic    org/whispersystems/s.a:([BI)Lorg/whispersystems/ak;
        //   373: astore          23
        //   375: aload           23
        //   377: astore          21
        //   379: aload           21
        //   381: astore          6
        //   383: goto            131
        //   386: astore          20
        //   388: new             Ljava/lang/StringBuilder;
        //   391: dup            
        //   392: invokespecial   java/lang/StringBuilder.<init>:()V
        //   395: getstatic       com/whatsapp/a0q.z:[Ljava/lang/String;
        //   398: iconst_2       
        //   399: aaload         
        //   400: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   403: aload_0        
        //   404: getfield        com/whatsapp/a0q.a:Ljava/lang/String;
        //   407: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   410: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   413: aload           20
        //   415: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   418: aconst_null    
        //   419: astore          21
        //   421: goto            379
        //   424: astore          7
        //   426: new             Ljava/lang/StringBuilder;
        //   429: dup            
        //   430: invokespecial   java/lang/StringBuilder.<init>:()V
        //   433: getstatic       com/whatsapp/a0q.z:[Ljava/lang/String;
        //   436: iconst_0       
        //   437: aaload         
        //   438: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   441: aload_0        
        //   442: getfield        com/whatsapp/a0q.a:Ljava/lang/String;
        //   445: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   448: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   451: aload           7
        //   453: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   456: aconst_null    
        //   457: astore          8
        //   459: goto            187
        //   462: astore          12
        //   464: aload           12
        //   466: athrow         
        //   467: astore          9
        //   469: aload           9
        //   471: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   474: aload_0        
        //   475: getfield        com/whatsapp/a0q.d:Lcom/whatsapp/_o;
        //   478: invokestatic    com/whatsapp/_o.b:(Lcom/whatsapp/_o;)Lcom/whatsapp/App;
        //   481: invokevirtual   com/whatsapp/App.a5:()Landroid/os/Handler;
        //   484: new             Lcom/whatsapp/a2v;
        //   487: dup            
        //   488: aload_0        
        //   489: iconst_0       
        //   490: invokespecial   com/whatsapp/a2v.<init>:(Lcom/whatsapp/a0q;Z)V
        //   493: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   496: pop            
        //   497: return         
        //   498: aload_0        
        //   499: getfield        com/whatsapp/a0q.b:Lcom/whatsapp/protocol/b2;
        //   502: getfield        com/whatsapp/protocol/b2.c:[B
        //   505: iconst_0       
        //   506: invokestatic    org/whispersystems/m.a:([BI)I
        //   509: istore          14
        //   511: iload           14
        //   513: istore          15
        //   515: goto            210
        //   518: astore          9
        //   520: goto            469
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                   
        //  -----  -----  -----  -----  -----------------------
        //  8      54     283    318    Lorg/whispersystems/aA;
        //  107    123    318    323    Lorg/whispersystems/aA;
        //  131    183    424    462    Lorg/whispersystems/aA;
        //  187    196    467    469    Lorg/whispersystems/aA;
        //  187    196    518    523    Lorg/whispersystems/au;
        //  196    202    462    467    Lorg/whispersystems/aA;
        //  196    202    518    523    Lorg/whispersystems/au;
        //  210    282    467    469    Lorg/whispersystems/aA;
        //  210    282    518    523    Lorg/whispersystems/au;
        //  323    375    386    424    Lorg/whispersystems/aA;
        //  464    467    467    469    Lorg/whispersystems/aA;
        //  464    467    518    523    Lorg/whispersystems/au;
        //  498    511    467    469    Lorg/whispersystems/aA;
        //  498    511    518    523    Lorg/whispersystems/au;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 255, Size: 255
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
