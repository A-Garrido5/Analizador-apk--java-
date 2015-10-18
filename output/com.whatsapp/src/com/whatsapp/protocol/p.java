// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

import java.util.Hashtable;

class p extends a
{
    private static final String[] z;
    final Hashtable a;
    final bf b;
    
    static {
        final String[] z2 = new String[9];
        String s = "gT@8";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0257:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0011';
                        break;
                    }
                    case 0: {
                        c2 = '\u0001';
                        break;
                    }
                    case 1: {
                        c2 = '5';
                        break;
                    }
                    case 2: {
                        c2 = ')';
                        break;
                    }
                    case 3: {
                        c2 = 'T';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "uLY1";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "5\u0005\u001d";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "5\u0005\u0018";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "bZM1";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "tFL&";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "5\u0005\u001a";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "rAH dr";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "k\\M";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    break Label_0257;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    p(final bf b, final Hashtable a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a(final int n) {
        bf.d(this.b).a(new Integer(n));
    }
    
    @Override
    public void a(final c0 p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/protocol/bi.O:I
        //     3: istore_3       
        //     4: aload_1        
        //     5: getstatic       com/whatsapp/protocol/p.z:[Ljava/lang/String;
        //     8: bipush          7
        //    10: aaload         
        //    11: invokevirtual   com/whatsapp/protocol/c0.b:(Ljava/lang/String;)Lcom/whatsapp/protocol/c0;
        //    14: astore          4
        //    16: aload           4
        //    18: ifnull          281
        //    21: aload           4
        //    23: getfield        com/whatsapp/protocol/c0.d:[Lcom/whatsapp/protocol/c0;
        //    26: astore          8
        //    28: iconst_0       
        //    29: istore          9
        //    31: aload           8
        //    33: ifnull          281
        //    36: iload           9
        //    38: aload           4
        //    40: getfield        com/whatsapp/protocol/c0.d:[Lcom/whatsapp/protocol/c0;
        //    43: arraylength    
        //    44: if_icmpge       281
        //    47: aload           4
        //    49: getfield        com/whatsapp/protocol/c0.d:[Lcom/whatsapp/protocol/c0;
        //    52: iload           9
        //    54: aaload         
        //    55: astore          10
        //    57: aload           10
        //    59: getstatic       com/whatsapp/protocol/p.z:[Ljava/lang/String;
        //    62: iconst_5       
        //    63: aaload         
        //    64: invokestatic    com/whatsapp/protocol/c0.b:(Lcom/whatsapp/protocol/c0;Ljava/lang/String;)V
        //    67: aload           10
        //    69: getstatic       com/whatsapp/protocol/p.z:[Ljava/lang/String;
        //    72: bipush          8
        //    74: aaload         
        //    75: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //    78: astore          11
        //    80: aload           10
        //    82: ldc             "t"
        //    84: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //    87: astore          12
        //    89: aload           12
        //    91: ifnonnull       349
        //    94: lconst_0       
        //    95: lstore          33
        //    97: lload           33
        //    99: ldc2_w          1000
        //   102: lmul           
        //   103: lstore          14
        //   105: aload           10
        //   107: getstatic       com/whatsapp/protocol/p.z:[Ljava/lang/String;
        //   110: iconst_4       
        //   111: aaload         
        //   112: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //   115: astore          16
        //   117: aload           10
        //   119: getstatic       com/whatsapp/protocol/p.z:[Ljava/lang/String;
        //   122: iconst_1       
        //   123: aaload         
        //   124: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //   127: astore          17
        //   129: aload           10
        //   131: invokevirtual   com/whatsapp/protocol/c0.a:()Ljava/lang/String;
        //   134: astore          18
        //   136: aload_0        
        //   137: getfield        com/whatsapp/protocol/p.a:Ljava/util/Hashtable;
        //   140: aload           11
        //   142: invokevirtual   java/util/Hashtable.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   145: pop            
        //   146: aload           17
        //   148: ifnull          256
        //   151: aload           17
        //   153: getstatic       com/whatsapp/protocol/p.z:[Ljava/lang/String;
        //   156: iconst_0       
        //   157: aaload         
        //   158: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   161: istore          27
        //   163: iload           27
        //   165: ifeq            256
        //   168: getstatic       com/whatsapp/protocol/p.z:[Ljava/lang/String;
        //   171: iconst_3       
        //   172: aaload         
        //   173: aload           16
        //   175: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   178: istore          28
        //   180: iload           28
        //   182: ifne            220
        //   185: getstatic       com/whatsapp/protocol/p.z:[Ljava/lang/String;
        //   188: bipush          6
        //   190: aaload         
        //   191: aload           16
        //   193: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   196: istore          29
        //   198: iload           29
        //   200: ifne            220
        //   203: getstatic       com/whatsapp/protocol/p.z:[Ljava/lang/String;
        //   206: iconst_2       
        //   207: aaload         
        //   208: aload           16
        //   210: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   213: istore          30
        //   215: iload           30
        //   217: ifeq            238
        //   220: aload_0        
        //   221: getfield        com/whatsapp/protocol/p.b:Lcom/whatsapp/protocol/bf;
        //   224: invokestatic    com/whatsapp/protocol/bf.d:(Lcom/whatsapp/protocol/bf;)Lcom/whatsapp/protocol/ct;
        //   227: aload           11
        //   229: invokeinterface com/whatsapp/protocol/ct.d:(Ljava/lang/String;)V
        //   234: iload_3        
        //   235: ifeq            274
        //   238: aload_0        
        //   239: getfield        com/whatsapp/protocol/p.b:Lcom/whatsapp/protocol/bf;
        //   242: invokestatic    com/whatsapp/protocol/bf.d:(Lcom/whatsapp/protocol/bf;)Lcom/whatsapp/protocol/ct;
        //   245: aload           11
        //   247: invokeinterface com/whatsapp/protocol/ct.f:(Ljava/lang/String;)V
        //   252: iload_3        
        //   253: ifeq            274
        //   256: aload_0        
        //   257: getfield        com/whatsapp/protocol/p.b:Lcom/whatsapp/protocol/bf;
        //   260: invokestatic    com/whatsapp/protocol/bf.d:(Lcom/whatsapp/protocol/bf;)Lcom/whatsapp/protocol/ct;
        //   263: aload           11
        //   265: lload           14
        //   267: aload           18
        //   269: invokeinterface com/whatsapp/protocol/ct.a:(Ljava/lang/String;JLjava/lang/String;)V
        //   274: iinc            9, 1
        //   277: iload_3        
        //   278: ifeq            36
        //   281: aload_0        
        //   282: getfield        com/whatsapp/protocol/p.a:Ljava/util/Hashtable;
        //   285: invokevirtual   java/util/Hashtable.keys:()Ljava/util/Enumeration;
        //   288: astore          5
        //   290: aload           5
        //   292: invokeinterface java/util/Enumeration.hasMoreElements:()Z
        //   297: ifeq            330
        //   300: aload           5
        //   302: invokeinterface java/util/Enumeration.nextElement:()Ljava/lang/Object;
        //   307: checkcast       Ljava/lang/String;
        //   310: astore          6
        //   312: aload_0        
        //   313: getfield        com/whatsapp/protocol/p.b:Lcom/whatsapp/protocol/bf;
        //   316: invokestatic    com/whatsapp/protocol/bf.d:(Lcom/whatsapp/protocol/bf;)Lcom/whatsapp/protocol/ct;
        //   319: aload           6
        //   321: invokeinterface com/whatsapp/protocol/ct.f:(Ljava/lang/String;)V
        //   326: iload_3        
        //   327: ifeq            290
        //   330: aload_0        
        //   331: getfield        com/whatsapp/protocol/p.b:Lcom/whatsapp/protocol/bf;
        //   334: invokestatic    com/whatsapp/protocol/bf.d:(Lcom/whatsapp/protocol/bf;)Lcom/whatsapp/protocol/ct;
        //   337: aconst_null    
        //   338: invokeinterface com/whatsapp/protocol/ct.a:(Ljava/lang/Integer;)V
        //   343: return         
        //   344: astore          7
        //   346: aload           7
        //   348: athrow         
        //   349: aload           12
        //   351: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   354: lstore          31
        //   356: lload           31
        //   358: lstore          33
        //   360: goto            97
        //   363: astore          13
        //   365: lconst_0       
        //   366: lstore          14
        //   368: goto            105
        //   371: astore          19
        //   373: aload           19
        //   375: athrow         
        //   376: astore          20
        //   378: aload           20
        //   380: athrow         
        //   381: astore          21
        //   383: aload           21
        //   385: athrow         
        //   386: astore          22
        //   388: aload           22
        //   390: athrow         
        //   391: astore          23
        //   393: aload           23
        //   395: athrow         
        //   396: astore          24
        //   398: aload           24
        //   400: athrow         
        //   401: astore          25
        //   403: aload           25
        //   405: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  21     28     344    349    Ljava/lang/NumberFormatException;
        //  136    146    371    376    Ljava/lang/NumberFormatException;
        //  151    163    376    381    Ljava/lang/NumberFormatException;
        //  168    180    381    386    Ljava/lang/NumberFormatException;
        //  185    198    386    391    Ljava/lang/NumberFormatException;
        //  203    215    391    396    Ljava/lang/NumberFormatException;
        //  220    234    396    401    Ljava/lang/NumberFormatException;
        //  238    252    401    406    Ljava/lang/NumberFormatException;
        //  256    274    401    406    Ljava/lang/NumberFormatException;
        //  349    356    363    371    Ljava/lang/NumberFormatException;
        //  373    376    376    381    Ljava/lang/NumberFormatException;
        //  378    381    381    386    Ljava/lang/NumberFormatException;
        //  383    386    386    391    Ljava/lang/NumberFormatException;
        //  388    391    391    396    Ljava/lang/NumberFormatException;
        //  393    396    396    401    Ljava/lang/NumberFormatException;
        //  398    401    401    406    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 186, Size: 186
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
