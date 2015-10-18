// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.ArrayList;
import java.util.List;

public abstract class fx extends fE implements a8
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        final char[] charArray = "{g.4\u000fPp3>B[g/ \u000bqgus\twl|<\u0004z{|>\u000fde9s\u0007sq/2\rsq|<\f6v46Jec16Jb{,6D".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'j';
                    break;
                }
                case 0: {
                    c2 = '\u0016';
                    break;
                }
                case 1: {
                    c2 = '\u0002';
                    break;
                }
                case 2: {
                    c2 = '\\';
                    break;
                }
                case 3: {
                    c2 = 'S';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "[g/ \u000bqgq'\u0013fg8s\u000fnv9=\u0019\u007fm2s\u0006wa76\u000e6f95\u000bcn(s\u0003xq(2\u0004ugfs".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'j';
                    break;
                }
                case 0: {
                    c4 = '\u0016';
                    break;
                }
                case 1: {
                    c4 = '\u0002';
                    break;
                }
                case 2: {
                    c4 = '\\';
                    break;
                }
                case 3: {
                    c4 = 'S';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        z = z2;
    }
    
    protected static F a(final fm fm) {
        return new F(a((cT)fm));
    }
    
    private static String a(final String p0, final hg p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: aload_0        
        //     5: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //     8: astore_3       
        //     9: aload_1        
        //    10: invokevirtual   com/google/hg.e:()Z
        //    13: istore          6
        //    15: iload           6
        //    17: ifeq            45
        //    20: aload_3        
        //    21: bipush          40
        //    23: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    26: aload_1        
        //    27: invokevirtual   com/google/hg.a:()Ljava/lang/String;
        //    30: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    33: bipush          41
        //    35: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    38: pop            
        //    39: getstatic       com/google/dt.b:Z
        //    42: ifeq            54
        //    45: aload_3        
        //    46: aload_1        
        //    47: invokevirtual   com/google/hg.c:()Ljava/lang/String;
        //    50: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    53: pop            
        //    54: iload_2        
        //    55: iconst_m1      
        //    56: if_icmpeq       75
        //    59: aload_3        
        //    60: bipush          91
        //    62: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    65: iload_2        
        //    66: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    69: bipush          93
        //    71: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    74: pop            
        //    75: aload_3        
        //    76: bipush          46
        //    78: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    81: pop            
        //    82: aload_3        
        //    83: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    86: areturn        
        //    87: astore          4
        //    89: aload           4
        //    91: athrow         
        //    92: astore          5
        //    94: aload           5
        //    96: athrow         
        //    97: astore          9
        //    99: aload           9
        //   101: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  9      15     87     92     Ljava/lang/IllegalArgumentException;
        //  20     45     92     97     Ljava/lang/IllegalArgumentException;
        //  45     54     92     97     Ljava/lang/IllegalArgumentException;
        //  59     75     97     102    Ljava/lang/IllegalArgumentException;
        //  89     92     92     97     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 53, Size: 53
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
    
    private static List a(final cT ct) {
        final ArrayList list = new ArrayList();
        a(ct, "", list);
        return list;
    }
    
    private static void a(final a8 a8, final bB bb, final hg hg, final a8 a9) {
        final fm b = b(a8, bb, hg);
        if (b == null) {
            return;
        }
        try {
            a9.mergeFrom(b);
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    private static void a(final a8 a8, final bB bb, final hg hg, final Object o) {
        Label_0019: {
            if (a8 == null) {
                break Label_0019;
            }
            try {
                a8.b(hg, o);
                if (dt.b) {
                    bb.c(hg, o);
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
    }
    
    private static void a(final cL p0, final aY p1, final fu p2, final bl p3, final a8 p4, final bB p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dt.b:Z
        //     3: istore          6
        //     5: aconst_null    
        //     6: astore          7
        //     8: iconst_0       
        //     9: istore          8
        //    11: aconst_null    
        //    12: astore          9
        //    14: aload_0        
        //    15: invokevirtual   com/google/cL.a:()I
        //    18: istore          10
        //    20: iload           10
        //    22: ifne            30
        //    25: iload           6
        //    27: ifeq            189
        //    30: getstatic       com/google/cp.d:I
        //    33: istore          12
        //    35: iload           10
        //    37: iload           12
        //    39: if_icmpne       81
        //    42: aload_0        
        //    43: invokevirtual   com/google/cL.l:()I
        //    46: istore          8
        //    48: iload           8
        //    50: ifeq            184
        //    53: aload_2        
        //    54: instanceof      Lcom/google/fU;
        //    57: istore          28
        //    59: iload           28
        //    61: ifeq            184
        //    64: aload_2        
        //    65: checkcast       Lcom/google/fU;
        //    68: aload_3        
        //    69: iload           8
        //    71: invokevirtual   com/google/fU.a:(Lcom/google/bl;I)Lcom/google/cu;
        //    74: astore          9
        //    76: iload           6
        //    78: ifeq            184
        //    81: getstatic       com/google/cp.c:I
        //    84: istore          16
        //    86: iload           10
        //    88: iload           16
        //    90: if_icmpne       166
        //    93: iload           8
        //    95: ifeq            155
        //    98: aload           9
        //   100: ifnull          155
        //   103: invokestatic    com/google/fu.a:()Z
        //   106: istore          26
        //   108: iload           26
        //   110: ifeq            155
        //   113: aload_0        
        //   114: aload           9
        //   116: aload_2        
        //   117: aload           4
        //   119: aload           5
        //   121: invokestatic    com/google/fx.a:(Lcom/google/cL;Lcom/google/cu;Lcom/google/fu;Lcom/google/a8;Lcom/google/bB;)V
        //   124: aconst_null    
        //   125: astore          7
        //   127: goto            14
        //   130: astore          11
        //   132: aload           11
        //   134: athrow         
        //   135: astore          27
        //   137: aload           27
        //   139: athrow         
        //   140: astore          13
        //   142: aload           13
        //   144: athrow         
        //   145: astore          14
        //   147: aload           14
        //   149: athrow         
        //   150: astore          15
        //   152: aload           15
        //   154: athrow         
        //   155: aload_0        
        //   156: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   159: astore          7
        //   161: iload           6
        //   163: ifeq            184
        //   166: aload_0        
        //   167: iload           10
        //   169: invokevirtual   com/google/cL.d:(I)Z
        //   172: istore          19
        //   174: iload           19
        //   176: ifne            184
        //   179: iload           6
        //   181: ifeq            189
        //   184: iload           6
        //   186: ifeq            14
        //   189: aload_0        
        //   190: getstatic       com/google/cp.a:I
        //   193: invokevirtual   com/google/cL.g:(I)V
        //   196: aload           7
        //   198: ifnull          251
        //   201: iload           8
        //   203: ifeq            251
        //   206: aload           9
        //   208: ifnull          228
        //   211: aload           7
        //   213: aload           9
        //   215: aload_2        
        //   216: aload           4
        //   218: aload           5
        //   220: invokestatic    com/google/fx.a:(Lcom/google/hv;Lcom/google/cu;Lcom/google/fu;Lcom/google/a8;Lcom/google/bB;)V
        //   223: iload           6
        //   225: ifeq            251
        //   228: aload           7
        //   230: ifnull          251
        //   233: aload_1        
        //   234: iload           8
        //   236: invokestatic    com/google/am.c:()Lcom/google/ea;
        //   239: aload           7
        //   241: invokevirtual   com/google/ea.a:(Lcom/google/hv;)Lcom/google/ea;
        //   244: invokevirtual   com/google/ea.b:()Lcom/google/am;
        //   247: invokevirtual   com/google/aY.a:(ILcom/google/am;)Lcom/google/aY;
        //   250: pop            
        //   251: return         
        //   252: astore          17
        //   254: aload           17
        //   256: athrow         
        //   257: astore          18
        //   259: aload           18
        //   261: athrow         
        //   262: astore          20
        //   264: aload           20
        //   266: athrow         
        //   267: astore          21
        //   269: aload           21
        //   271: athrow         
        //   272: astore          22
        //   274: aload           22
        //   276: athrow         
        //   277: astore          23
        //   279: aload           23
        //   281: athrow         
        //   282: astore          24
        //   284: aload           24
        //   286: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  30     35     130    135    Ljava/lang/IllegalArgumentException;
        //  53     59     135    140    Ljava/lang/IllegalArgumentException;
        //  81     86     140    150    Ljava/lang/IllegalArgumentException;
        //  103    108    150    155    Ljava/lang/IllegalArgumentException;
        //  142    145    145    150    Ljava/lang/IllegalArgumentException;
        //  147    150    150    155    Ljava/lang/IllegalArgumentException;
        //  166    174    252    262    Ljava/lang/IllegalArgumentException;
        //  189    196    262    277    Ljava/lang/IllegalArgumentException;
        //  211    223    277    282    Ljava/lang/IllegalArgumentException;
        //  233    251    282    287    Ljava/lang/IllegalArgumentException;
        //  254    257    257    262    Ljava/lang/IllegalArgumentException;
        //  264    267    267    277    Ljava/lang/IllegalArgumentException;
        //  269    272    272    277    Ljava/lang/IllegalArgumentException;
        //  274    277    277    282    Ljava/lang/IllegalArgumentException;
        //  279    282    282    287    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 139, Size: 139
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
    
    private static void a(final cL cl, final cu cu, final fu fu, final a8 a8, final bB bb) {
        final hg a9 = cu.a;
        Label_0079: {
            if (!a(a8, bb, a9)) {
                break Label_0079;
            }
            final a8 builder = b(a8, bb, a9).toBuilder();
            cl.a(builder, fu);
            fm buildPartial = builder.buildPartial();
            while (true) {
                Label_0069: {
                    if (a8 == null) {
                        break Label_0069;
                    }
                    try {
                        a8.a(a9, buildPartial);
                        if (dt.b) {
                            bb.a(a9, buildPartial);
                        }
                        return;
                        buildPartial = (fm)cl.a(cu.b.getParserForType(), fu);
                        continue;
                    }
                    catch (IllegalArgumentException ex) {
                        throw ex;
                    }
                }
                break;
            }
        }
    }
    
    private static void a(final cT p0, final String p1, final List p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dt.b:Z
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokeinterface com/google/cT.getDescriptorForType:()Lcom/google/bl;
        //    10: invokevirtual   com/google/bl.f:()Ljava/util/List;
        //    13: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    18: astore          4
        //    20: aload           4
        //    22: invokeinterface java/util/Iterator.hasNext:()Z
        //    27: ifeq            98
        //    30: aload           4
        //    32: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    37: checkcast       Lcom/google/hg;
        //    40: astore          16
        //    42: aload           16
        //    44: invokevirtual   com/google/hg.o:()Z
        //    47: istore          19
        //    49: iload           19
        //    51: ifeq            94
        //    54: aload_0        
        //    55: aload           16
        //    57: invokeinterface com/google/cT.b:(Lcom/google/hg;)Z
        //    62: ifne            94
        //    65: aload_2        
        //    66: new             Ljava/lang/StringBuilder;
        //    69: dup            
        //    70: invokespecial   java/lang/StringBuilder.<init>:()V
        //    73: aload_1        
        //    74: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    77: aload           16
        //    79: invokevirtual   com/google/hg.c:()Ljava/lang/String;
        //    82: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    85: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    88: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    93: pop            
        //    94: iload_3        
        //    95: ifeq            20
        //    98: aload_0        
        //    99: invokeinterface com/google/cT.a:()Ljava/util/Map;
        //   104: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   109: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   114: astore          5
        //   116: aload           5
        //   118: invokeinterface java/util/Iterator.hasNext:()Z
        //   123: ifeq            278
        //   126: aload           5
        //   128: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   133: checkcast       Ljava/util/Map$Entry;
        //   136: astore          6
        //   138: aload           6
        //   140: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   145: checkcast       Lcom/google/hg;
        //   148: astore          7
        //   150: aload           6
        //   152: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   157: astore          8
        //   159: aload           7
        //   161: invokevirtual   com/google/hg.n:()Lcom/google/hD;
        //   164: getstatic       com/google/hD.MESSAGE:Lcom/google/hD;
        //   167: if_acmpne       274
        //   170: aload           7
        //   172: invokevirtual   com/google/hg.b:()Z
        //   175: istore          10
        //   177: iload           10
        //   179: ifeq            247
        //   182: iconst_0       
        //   183: istore          12
        //   185: aload           8
        //   187: checkcast       Ljava/util/List;
        //   190: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   195: astore          13
        //   197: aload           13
        //   199: invokeinterface java/util/Iterator.hasNext:()Z
        //   204: ifeq            243
        //   207: aload           13
        //   209: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   214: checkcast       Lcom/google/cT;
        //   217: astore          14
        //   219: iload           12
        //   221: iconst_1       
        //   222: iadd           
        //   223: istore          15
        //   225: aload           14
        //   227: aload_1        
        //   228: aload           7
        //   230: iload           12
        //   232: invokestatic    com/google/fx.a:(Ljava/lang/String;Lcom/google/hg;I)Ljava/lang/String;
        //   235: aload_2        
        //   236: invokestatic    com/google/fx.a:(Lcom/google/cT;Ljava/lang/String;Ljava/util/List;)V
        //   239: iload_3        
        //   240: ifeq            299
        //   243: iload_3        
        //   244: ifeq            274
        //   247: aload_0        
        //   248: aload           7
        //   250: invokeinterface com/google/cT.b:(Lcom/google/hg;)Z
        //   255: ifeq            274
        //   258: aload           8
        //   260: checkcast       Lcom/google/cT;
        //   263: aload_1        
        //   264: aload           7
        //   266: iconst_m1      
        //   267: invokestatic    com/google/fx.a:(Ljava/lang/String;Lcom/google/hg;I)Ljava/lang/String;
        //   270: aload_2        
        //   271: invokestatic    com/google/fx.a:(Lcom/google/cT;Ljava/lang/String;Ljava/util/List;)V
        //   274: iload_3        
        //   275: ifeq            116
        //   278: return         
        //   279: astore          17
        //   281: aload           17
        //   283: athrow         
        //   284: astore          18
        //   286: aload           18
        //   288: athrow         
        //   289: astore          9
        //   291: aload           9
        //   293: athrow         
        //   294: astore          11
        //   296: aload           11
        //   298: athrow         
        //   299: iload           15
        //   301: istore          12
        //   303: goto            197
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  42     49     279    284    Ljava/lang/IllegalArgumentException;
        //  54     94     284    289    Ljava/lang/IllegalArgumentException;
        //  159    177    289    294    Ljava/lang/IllegalArgumentException;
        //  247    274    294    299    Ljava/lang/IllegalArgumentException;
        //  281    284    284    289    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 123, Size: 123
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
    
    private static void a(final hv p0, final cu p1, final fu p2, final a8 p3, final bB p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dt.b:Z
        //     3: istore          5
        //     5: aload_1        
        //     6: getfield        com/google/cu.a:Lcom/google/hg;
        //     9: astore          6
        //    11: aload_3        
        //    12: aload           4
        //    14: aload           6
        //    16: invokestatic    com/google/fx.a:(Lcom/google/a8;Lcom/google/bB;Lcom/google/hg;)Z
        //    19: istore          7
        //    21: iload           7
        //    23: ifne            36
        //    26: invokestatic    com/google/fu.a:()Z
        //    29: istore          19
        //    31: iload           19
        //    33: ifeq            90
        //    36: iload           7
        //    38: ifeq            170
        //    41: aload_3        
        //    42: aload           4
        //    44: aload           6
        //    46: invokestatic    com/google/fx.b:(Lcom/google/a8;Lcom/google/bB;Lcom/google/hg;)Lcom/google/fm;
        //    49: invokeinterface com/google/fm.toBuilder:()Lcom/google/a8;
        //    54: astore          16
        //    56: aload           16
        //    58: aload_0        
        //    59: aload_2        
        //    60: invokeinterface com/google/a8.a:(Lcom/google/hv;Lcom/google/fu;)Lcom/google/a8;
        //    65: pop            
        //    66: aload           16
        //    68: invokeinterface com/google/a8.buildPartial:()Lcom/google/fm;
        //    73: astore          8
        //    75: aload_3        
        //    76: aload           4
        //    78: aload           6
        //    80: aload           8
        //    82: invokestatic    com/google/fx.b:(Lcom/google/a8;Lcom/google/bB;Lcom/google/hg;Ljava/lang/Object;)V
        //    85: iload           5
        //    87: ifeq            164
        //    90: new             Lcom/google/cQ;
        //    93: dup            
        //    94: aload_1        
        //    95: getfield        com/google/cu.b:Lcom/google/fm;
        //    98: aload_2        
        //    99: aload_0        
        //   100: invokespecial   com/google/cQ.<init>:(Lcom/google/ci;Lcom/google/fu;Lcom/google/hv;)V
        //   103: astore          9
        //   105: aload_3        
        //   106: ifnull          155
        //   109: aload_3        
        //   110: instanceof      Lcom/google/gq;
        //   113: istore          13
        //   115: iload           13
        //   117: ifeq            136
        //   120: aload_3        
        //   121: aload           6
        //   123: aload           9
        //   125: invokeinterface com/google/a8.a:(Lcom/google/hg;Ljava/lang/Object;)Lcom/google/a8;
        //   130: pop            
        //   131: iload           5
        //   133: ifeq            164
        //   136: aload_3        
        //   137: aload           6
        //   139: aload           9
        //   141: invokevirtual   com/google/cQ.c:()Lcom/google/ci;
        //   144: invokeinterface com/google/a8.a:(Lcom/google/hg;Ljava/lang/Object;)Lcom/google/a8;
        //   149: pop            
        //   150: iload           5
        //   152: ifeq            164
        //   155: aload           4
        //   157: aload           6
        //   159: aload           9
        //   161: invokevirtual   com/google/bB.a:(Lcom/google/aK;Ljava/lang/Object;)V
        //   164: return         
        //   165: astore          18
        //   167: aload           18
        //   169: athrow         
        //   170: aload_1        
        //   171: getfield        com/google/cu.b:Lcom/google/fm;
        //   174: invokeinterface com/google/fm.getParserForType:()Lcom/google/du;
        //   179: aload_0        
        //   180: aload_2        
        //   181: invokeinterface com/google/du.b:(Lcom/google/hv;Lcom/google/fu;)Ljava/lang/Object;
        //   186: checkcast       Lcom/google/fm;
        //   189: astore          8
        //   191: goto            75
        //   194: astore          11
        //   196: aload           11
        //   198: athrow         
        //   199: astore          12
        //   201: aload           12
        //   203: athrow         
        //   204: astore          10
        //   206: aload           10
        //   208: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  26     31     165    170    Ljava/lang/IllegalArgumentException;
        //  109    115    194    199    Ljava/lang/IllegalArgumentException;
        //  120    131    199    204    Ljava/lang/IllegalArgumentException;
        //  136    150    204    209    Ljava/lang/IllegalArgumentException;
        //  155    164    204    209    Ljava/lang/IllegalArgumentException;
        //  196    199    199    204    Ljava/lang/IllegalArgumentException;
        //  201    204    204    209    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 95, Size: 95
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
    
    private static boolean a(final a8 a8, final bB bb, final hg hg) {
        if (a8 != null) {
            try {
                return a8.b(hg);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        return bb.a(hg);
    }
    
    static boolean a(final cL p0, final aY p1, final fu p2, final bl p3, final a8 p4, final bB p5, final int p6) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dt.b:Z
        //     3: istore          7
        //     5: aload_3        
        //     6: invokevirtual   com/google/bl.e:()Lcom/google/d_;
        //     9: invokevirtual   com/google/d_.a:()Z
        //    12: istore          10
        //    14: iload           10
        //    16: ifeq            50
        //    19: iload           6
        //    21: getstatic       com/google/cp.b:I
        //    24: if_icmpne       50
        //    27: aload_0        
        //    28: aload_1        
        //    29: aload_2        
        //    30: aload_3        
        //    31: aload           4
        //    33: aload           5
        //    35: invokestatic    com/google/fx.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;Lcom/google/bl;Lcom/google/a8;Lcom/google/bB;)V
        //    38: iconst_1       
        //    39: ireturn        
        //    40: astore          8
        //    42: aload           8
        //    44: athrow         
        //    45: astore          9
        //    47: aload           9
        //    49: athrow         
        //    50: iload           6
        //    52: invokestatic    com/google/cp.a:(I)I
        //    55: istore          11
        //    57: iload           6
        //    59: invokestatic    com/google/cp.b:(I)I
        //    62: istore          12
        //    64: aload_3        
        //    65: iload           12
        //    67: invokevirtual   com/google/bl.b:(I)Z
        //    70: ifeq            308
        //    73: aload_2        
        //    74: instanceof      Lcom/google/fU;
        //    77: istore          45
        //    79: iload           45
        //    81: ifeq            303
        //    84: aload_2        
        //    85: checkcast       Lcom/google/fU;
        //    88: aload_3        
        //    89: iload           12
        //    91: invokevirtual   com/google/fU.a:(Lcom/google/bl;I)Lcom/google/cu;
        //    94: astore          46
        //    96: aload           46
        //    98: ifnonnull       106
        //   101: iload           7
        //   103: ifeq            180
        //   106: aload           46
        //   108: getfield        com/google/cu.a:Lcom/google/hg;
        //   111: astore          47
        //   113: aload           46
        //   115: getfield        com/google/cu.b:Lcom/google/fm;
        //   118: astore          48
        //   120: aload           48
        //   122: ifnonnull       186
        //   125: aload           47
        //   127: invokevirtual   com/google/hg.n:()Lcom/google/hD;
        //   130: getstatic       com/google/hD.MESSAGE:Lcom/google/hD;
        //   133: if_acmpne       186
        //   136: new             Ljava/lang/IllegalStateException;
        //   139: dup            
        //   140: new             Ljava/lang/StringBuilder;
        //   143: dup            
        //   144: invokespecial   java/lang/StringBuilder.<init>:()V
        //   147: getstatic       com/google/fx.z:[Ljava/lang/String;
        //   150: iconst_1       
        //   151: aaload         
        //   152: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   155: aload           47
        //   157: invokevirtual   com/google/hg.a:()Ljava/lang/String;
        //   160: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   163: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   166: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   169: athrow         
        //   170: astore          49
        //   172: aload           49
        //   174: athrow         
        //   175: astore          13
        //   177: aload           13
        //   179: athrow         
        //   180: aconst_null    
        //   181: astore          47
        //   183: aconst_null    
        //   184: astore          48
        //   186: aload           48
        //   188: astore          14
        //   190: aload           47
        //   192: astore          15
        //   194: iconst_0       
        //   195: istore          16
        //   197: aload           15
        //   199: ifnonnull       213
        //   202: iconst_1       
        //   203: istore          16
        //   205: iconst_0       
        //   206: istore          19
        //   208: iload           7
        //   210: ifeq            286
        //   213: aload           15
        //   215: invokevirtual   com/google/hg.e:()Lcom/google/el;
        //   218: iconst_0       
        //   219: invokestatic    com/google/bB.a:(Lcom/google/el;Z)I
        //   222: istore          18
        //   224: iload           11
        //   226: iload           18
        //   228: if_icmpne       239
        //   231: iconst_0       
        //   232: istore          19
        //   234: iload           7
        //   236: ifeq            286
        //   239: aload           15
        //   241: invokevirtual   com/google/hg.j:()Z
        //   244: istore          42
        //   246: iconst_0       
        //   247: istore          19
        //   249: iload           42
        //   251: ifeq            283
        //   254: aload           15
        //   256: invokevirtual   com/google/hg.e:()Lcom/google/el;
        //   259: iconst_1       
        //   260: invokestatic    com/google/bB.a:(Lcom/google/el;Z)I
        //   263: istore          43
        //   265: iconst_0       
        //   266: istore          19
        //   268: iload           11
        //   270: iload           43
        //   272: if_icmpne       283
        //   275: iconst_1       
        //   276: istore          19
        //   278: iload           7
        //   280: ifeq            286
        //   283: iconst_1       
        //   284: istore          16
        //   286: iload           16
        //   288: ifeq            350
        //   291: aload_1        
        //   292: iload           6
        //   294: aload_0        
        //   295: invokevirtual   com/google/aY.a:(ILcom/google/cL;)Z
        //   298: istore          40
        //   300: iload           40
        //   302: ireturn        
        //   303: iload           7
        //   305: ifeq            792
        //   308: aload           4
        //   310: ifnull          326
        //   313: aload_3        
        //   314: iload           12
        //   316: invokevirtual   com/google/bl.a:(I)Lcom/google/hg;
        //   319: astore          44
        //   321: iload           7
        //   323: ifeq            782
        //   326: aconst_null    
        //   327: astore          14
        //   329: aconst_null    
        //   330: astore          15
        //   332: goto            194
        //   335: astore          17
        //   337: aload           17
        //   339: athrow         
        //   340: astore          41
        //   342: aload           41
        //   344: athrow         
        //   345: astore          39
        //   347: aload           39
        //   349: athrow         
        //   350: iload           19
        //   352: ifeq            474
        //   355: aload_0        
        //   356: aload_0        
        //   357: invokevirtual   com/google/cL.i:()I
        //   360: invokevirtual   com/google/cL.c:(I)I
        //   363: istore          33
        //   365: aload           15
        //   367: invokevirtual   com/google/hg.e:()Lcom/google/el;
        //   370: getstatic       com/google/el.ENUM:Lcom/google/el;
        //   373: if_acmpne       433
        //   376: aload_0        
        //   377: invokevirtual   com/google/cL.s:()I
        //   380: istore          35
        //   382: iload           35
        //   384: ifle            463
        //   387: aload_0        
        //   388: invokevirtual   com/google/cL.g:()I
        //   391: istore          37
        //   393: aload           15
        //   395: invokevirtual   com/google/hg.i:()Lcom/google/E;
        //   398: iload           37
        //   400: invokevirtual   com/google/E.a:(I)Lcom/google/dV;
        //   403: astore          38
        //   405: aload           38
        //   407: ifnonnull       417
        //   410: iconst_1       
        //   411: ireturn        
        //   412: astore          34
        //   414: aload           34
        //   416: athrow         
        //   417: aload           4
        //   419: aload           5
        //   421: aload           15
        //   423: aload           38
        //   425: invokestatic    com/google/fx.a:(Lcom/google/a8;Lcom/google/bB;Lcom/google/hg;Ljava/lang/Object;)V
        //   428: iload           7
        //   430: ifeq            376
        //   433: aload_0        
        //   434: invokevirtual   com/google/cL.s:()I
        //   437: ifle            463
        //   440: aload           4
        //   442: aload           5
        //   444: aload           15
        //   446: aload_0        
        //   447: aload           15
        //   449: invokevirtual   com/google/hg.e:()Lcom/google/el;
        //   452: invokestatic    com/google/bB.a:(Lcom/google/cL;Lcom/google/el;)Ljava/lang/Object;
        //   455: invokestatic    com/google/fx.a:(Lcom/google/a8;Lcom/google/bB;Lcom/google/hg;Ljava/lang/Object;)V
        //   458: iload           7
        //   460: ifeq            433
        //   463: aload_0        
        //   464: iload           33
        //   466: invokevirtual   com/google/cL.a:(I)V
        //   469: iload           7
        //   471: ifeq            566
        //   474: getstatic       com/google/bX.a:[I
        //   477: aload           15
        //   479: invokevirtual   com/google/hg.d:()Lcom/google/bq;
        //   482: invokevirtual   com/google/bq.ordinal:()I
        //   485: iaload         
        //   486: istore          21
        //   488: iload           21
        //   490: tableswitch {
        //                2: 578
        //                3: 653
        //                4: 723
        //          default: 516
        //        }
        //   516: aload_0        
        //   517: aload           15
        //   519: invokevirtual   com/google/hg.e:()Lcom/google/el;
        //   522: invokestatic    com/google/bB.a:(Lcom/google/cL;Lcom/google/el;)Ljava/lang/Object;
        //   525: astore          23
        //   527: aload           15
        //   529: invokevirtual   com/google/hg.b:()Z
        //   532: istore          28
        //   534: iload           28
        //   536: ifeq            555
        //   539: aload           4
        //   541: aload           5
        //   543: aload           15
        //   545: aload           23
        //   547: invokestatic    com/google/fx.a:(Lcom/google/a8;Lcom/google/bB;Lcom/google/hg;Ljava/lang/Object;)V
        //   550: iload           7
        //   552: ifeq            566
        //   555: aload           4
        //   557: aload           5
        //   559: aload           15
        //   561: aload           23
        //   563: invokestatic    com/google/fx.b:(Lcom/google/a8;Lcom/google/bB;Lcom/google/hg;Ljava/lang/Object;)V
        //   566: iconst_1       
        //   567: ireturn        
        //   568: astore          36
        //   570: aload           36
        //   572: athrow         
        //   573: astore          20
        //   575: aload           20
        //   577: athrow         
        //   578: aload           14
        //   580: ifnull          597
        //   583: aload           14
        //   585: invokeinterface com/google/fm.newBuilderForType:()Lcom/google/a8;
        //   590: astore          31
        //   592: iload           7
        //   594: ifeq            608
        //   597: aload           4
        //   599: aload           15
        //   601: invokeinterface com/google/a8.a:(Lcom/google/hg;)Lcom/google/a8;
        //   606: astore          31
        //   608: aload           15
        //   610: invokevirtual   com/google/hg.b:()Z
        //   613: ifne            627
        //   616: aload           4
        //   618: aload           5
        //   620: aload           15
        //   622: aload           31
        //   624: invokestatic    com/google/fx.a:(Lcom/google/a8;Lcom/google/bB;Lcom/google/hg;Lcom/google/a8;)V
        //   627: aload_0        
        //   628: aload           15
        //   630: invokevirtual   com/google/hg.c:()I
        //   633: aload           31
        //   635: aload_2        
        //   636: invokevirtual   com/google/cL.a:(ILcom/google/aJ;Lcom/google/fu;)V
        //   639: aload           31
        //   641: invokeinterface com/google/a8.buildPartial:()Lcom/google/fm;
        //   646: astore          23
        //   648: iload           7
        //   650: ifeq            527
        //   653: aload           14
        //   655: ifnull          672
        //   658: aload           14
        //   660: invokeinterface com/google/fm.newBuilderForType:()Lcom/google/a8;
        //   665: astore          29
        //   667: iload           7
        //   669: ifeq            683
        //   672: aload           4
        //   674: aload           15
        //   676: invokeinterface com/google/a8.a:(Lcom/google/hg;)Lcom/google/a8;
        //   681: astore          29
        //   683: aload           15
        //   685: invokevirtual   com/google/hg.b:()Z
        //   688: ifne            702
        //   691: aload           4
        //   693: aload           5
        //   695: aload           15
        //   697: aload           29
        //   699: invokestatic    com/google/fx.a:(Lcom/google/a8;Lcom/google/bB;Lcom/google/hg;Lcom/google/a8;)V
        //   702: aload_0        
        //   703: aload           29
        //   705: aload_2        
        //   706: invokevirtual   com/google/cL.a:(Lcom/google/aJ;Lcom/google/fu;)V
        //   709: aload           29
        //   711: invokeinterface com/google/a8.buildPartial:()Lcom/google/fm;
        //   716: astore          23
        //   718: iload           7
        //   720: ifeq            527
        //   723: aload_0        
        //   724: invokevirtual   com/google/cL.g:()I
        //   727: istore          22
        //   729: aload           15
        //   731: invokevirtual   com/google/hg.i:()Lcom/google/E;
        //   734: iload           22
        //   736: invokevirtual   com/google/E.a:(I)Lcom/google/dV;
        //   739: astore          23
        //   741: aload           23
        //   743: ifnonnull       527
        //   746: aload_1        
        //   747: iload           12
        //   749: iload           22
        //   751: invokevirtual   com/google/aY.a:(II)Lcom/google/aY;
        //   754: pop            
        //   755: iconst_1       
        //   756: ireturn        
        //   757: astore          32
        //   759: aload           32
        //   761: athrow         
        //   762: astore          30
        //   764: aload           30
        //   766: athrow         
        //   767: astore          24
        //   769: aload           24
        //   771: athrow         
        //   772: astore          26
        //   774: aload           26
        //   776: athrow         
        //   777: astore          27
        //   779: aload           27
        //   781: athrow         
        //   782: aload           44
        //   784: astore          15
        //   786: aconst_null    
        //   787: astore          14
        //   789: goto            194
        //   792: aconst_null    
        //   793: astore          14
        //   795: aconst_null    
        //   796: astore          15
        //   798: goto            194
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  5      14     40     45     Ljava/lang/IllegalArgumentException;
        //  19     38     45     50     Ljava/lang/IllegalArgumentException;
        //  42     45     45     50     Ljava/lang/IllegalArgumentException;
        //  64     79     175    180    Ljava/lang/IllegalArgumentException;
        //  125    170    170    175    Ljava/lang/IllegalArgumentException;
        //  213    224    335    340    Ljava/lang/IllegalArgumentException;
        //  239    246    340    345    Ljava/lang/IllegalArgumentException;
        //  254    265    340    345    Ljava/lang/IllegalArgumentException;
        //  291    300    345    350    Ljava/lang/IllegalArgumentException;
        //  365    376    412    417    Ljava/lang/IllegalArgumentException;
        //  376    382    412    417    Ljava/lang/IllegalArgumentException;
        //  463    469    568    573    Ljava/lang/IllegalArgumentException;
        //  474    488    573    578    Ljava/lang/IllegalArgumentException;
        //  527    534    772    777    Ljava/lang/IllegalArgumentException;
        //  539    550    777    782    Ljava/lang/IllegalArgumentException;
        //  555    566    777    782    Ljava/lang/IllegalArgumentException;
        //  570    573    573    578    Ljava/lang/IllegalArgumentException;
        //  608    627    757    762    Ljava/lang/IllegalArgumentException;
        //  683    702    762    767    Ljava/lang/IllegalArgumentException;
        //  746    755    767    772    Ljava/lang/IllegalArgumentException;
        //  774    777    777    782    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 364, Size: 364
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
    
    private static fm b(final a8 a8, final bB bb, final hg hg) {
        if (a8 != null) {
            try {
                return (fm)a8.a(hg);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        return (fm)bb.c(hg);
    }
    
    private static void b(final a8 a8, final bB bb, final hg hg, final Object o) {
        Label_0019: {
            if (a8 == null) {
                break Label_0019;
            }
            try {
                a8.a(hg, o);
                if (dt.b) {
                    bb.a(hg, o);
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
    }
    
    @Override
    public a8 a(final hv hv, final fu fu) {
        return this.a(hv, fu);
    }
    
    @Override
    public aJ a(final byte[] array) {
        return this.a(array);
    }
    
    @Override
    public fE a(final cL cl) {
        return this.a(cl);
    }
    
    @Override
    public fE a(final hv hv, final fu fu) {
        return this.a(hv, fu);
    }
    
    @Override
    public fE a(final byte[] array) {
        return this.a(array);
    }
    
    @Override
    public fE a(final byte[] array, final int n, final int n2) {
        return this.a(array, n, n2);
    }
    
    @Override
    public fx a(final cL cl) {
        return this.mergeFrom(cl, (fu)fU.a());
    }
    
    @Override
    public fx a(final ce ce) {
        this.a(ce.b(this.getUnknownFields()).a(ce).g());
        return this;
    }
    
    @Override
    public fx a(final hv hv, final fu fu) {
        return (fx)super.a(hv, fu);
    }
    
    @Override
    public fx a(final byte[] array) {
        return (fx)super.a(array);
    }
    
    @Override
    public fx a(final byte[] array, final int n, final int n2) {
        return (fx)super.a(array, n, n2);
    }
    
    @Override
    public fE clone() {
        return this.clone();
    }
    
    @Override
    public abstract fx clone();
    
    @Override
    public Object clone() {
        return this.clone();
    }
    
    @Override
    public a8 mergeFrom(final fm fm) {
        return this.mergeFrom(fm);
    }
    
    @Override
    public aJ mergeFrom(final cL cl, final fu fu) {
        return this.mergeFrom(cl, fu);
    }
    
    @Override
    public fE mergeFrom(final cL cl, final fu fu) {
        return this.mergeFrom(cl, fu);
    }
    
    @Override
    public fx mergeFrom(final cL cl, final fu fu) {
        final boolean b = dt.b;
        final aY b2 = ce.b(this.getUnknownFields());
        while (true) {
            final int a = cl.a();
            Label_0058: {
                if (a == 0) {
                    if (!b) {
                        break Label_0058;
                    }
                }
                try {
                    if ((!a(cl, b2, fu, this.getDescriptorForType(), this, null, a) && !b) || b) {
                        this.a(b2.g());
                        return this;
                    }
                    continue;
                }
                catch (IllegalArgumentException ex) {
                    try {
                        throw ex;
                    }
                    catch (IllegalArgumentException ex2) {
                        throw ex2;
                    }
                }
            }
        }
    }
    
    @Override
    public fx mergeFrom(final fm p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dt.b:Z
        //     3: istore_2       
        //     4: aload_1        
        //     5: invokeinterface com/google/fm.getDescriptorForType:()Lcom/google/bl;
        //    10: aload_0        
        //    11: invokevirtual   com/google/fx.getDescriptorForType:()Lcom/google/bl;
        //    14: if_acmpeq       33
        //    17: new             Ljava/lang/IllegalArgumentException;
        //    20: dup            
        //    21: getstatic       com/google/fx.z:[Ljava/lang/String;
        //    24: iconst_0       
        //    25: aaload         
        //    26: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    29: athrow         
        //    30: astore_3       
        //    31: aload_3        
        //    32: athrow         
        //    33: aload_1        
        //    34: invokeinterface com/google/fm.a:()Ljava/util/Map;
        //    39: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //    44: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    49: astore          4
        //    51: aload           4
        //    53: invokeinterface java/util/Iterator.hasNext:()Z
        //    58: ifeq            269
        //    61: aload           4
        //    63: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    68: checkcast       Ljava/util/Map$Entry;
        //    71: astore          6
        //    73: aload           6
        //    75: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //    80: checkcast       Lcom/google/hg;
        //    83: astore          7
        //    85: aload           7
        //    87: invokevirtual   com/google/hg.b:()Z
        //    90: ifeq            142
        //    93: aload           6
        //    95: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   100: checkcast       Ljava/util/List;
        //   103: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   108: astore          19
        //   110: aload           19
        //   112: invokeinterface java/util/Iterator.hasNext:()Z
        //   117: ifeq            138
        //   120: aload_0        
        //   121: aload           7
        //   123: aload           19
        //   125: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   130: invokevirtual   com/google/fx.b:(Lcom/google/hg;Ljava/lang/Object;)Lcom/google/a8;
        //   133: pop            
        //   134: iload_2        
        //   135: ifeq            110
        //   138: iload_2        
        //   139: ifeq            265
        //   142: aload           7
        //   144: invokevirtual   com/google/hg.n:()Lcom/google/hD;
        //   147: astore          9
        //   149: getstatic       com/google/hD.MESSAGE:Lcom/google/hD;
        //   152: astore          10
        //   154: aload           9
        //   156: aload           10
        //   158: if_acmpne       251
        //   161: aload_0        
        //   162: aload           7
        //   164: invokevirtual   com/google/fx.a:(Lcom/google/hg;)Ljava/lang/Object;
        //   167: checkcast       Lcom/google/fm;
        //   170: astore          13
        //   172: aload           13
        //   174: invokeinterface com/google/fm.getDefaultInstanceForType:()Lcom/google/fm;
        //   179: astore          16
        //   181: aload           13
        //   183: aload           16
        //   185: if_acmpne       206
        //   188: aload_0        
        //   189: aload           7
        //   191: aload           6
        //   193: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   198: invokevirtual   com/google/fx.a:(Lcom/google/hg;Ljava/lang/Object;)Lcom/google/a8;
        //   201: pop            
        //   202: iload_2        
        //   203: ifeq            247
        //   206: aload_0        
        //   207: aload           7
        //   209: aload           13
        //   211: invokeinterface com/google/fm.newBuilderForType:()Lcom/google/a8;
        //   216: aload           13
        //   218: invokeinterface com/google/a8.mergeFrom:(Lcom/google/fm;)Lcom/google/a8;
        //   223: aload           6
        //   225: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   230: checkcast       Lcom/google/fm;
        //   233: invokeinterface com/google/a8.mergeFrom:(Lcom/google/fm;)Lcom/google/a8;
        //   238: invokeinterface com/google/a8.build:()Lcom/google/fm;
        //   243: invokevirtual   com/google/fx.a:(Lcom/google/hg;Ljava/lang/Object;)Lcom/google/a8;
        //   246: pop            
        //   247: iload_2        
        //   248: ifeq            265
        //   251: aload_0        
        //   252: aload           7
        //   254: aload           6
        //   256: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   261: invokevirtual   com/google/fx.a:(Lcom/google/hg;Ljava/lang/Object;)Lcom/google/a8;
        //   264: pop            
        //   265: iload_2        
        //   266: ifeq            51
        //   269: aload_0        
        //   270: aload_1        
        //   271: invokeinterface com/google/fm.getUnknownFields:()Lcom/google/ce;
        //   276: invokevirtual   com/google/fx.a:(Lcom/google/ce;)Lcom/google/fx;
        //   279: pop            
        //   280: aload_0        
        //   281: areturn        
        //   282: astore          8
        //   284: aload           8
        //   286: athrow         
        //   287: astore          14
        //   289: aload           14
        //   291: athrow         
        //   292: astore          15
        //   294: aload           15
        //   296: athrow         
        //   297: astore          11
        //   299: aload           11
        //   301: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      30     30     33     Ljava/lang/IllegalArgumentException;
        //  142    154    282    287    Ljava/lang/IllegalArgumentException;
        //  172    181    287    292    Ljava/lang/IllegalArgumentException;
        //  188    202    292    297    Ljava/lang/IllegalArgumentException;
        //  206    247    292    297    Ljava/lang/IllegalArgumentException;
        //  251    265    297    302    Ljava/lang/IllegalArgumentException;
        //  289    292    292    297    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 123, Size: 123
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
