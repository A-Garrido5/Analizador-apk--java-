// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class cj
{
    private int a;
    private int b;
    private gz c;
    private int d;
    
    gz a() {
        final gz c = this.c;
        try {
            if (c.e != null) {
                throw new IllegalStateException();
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        return c;
    }
    
    void a(final int n) {
        this.a = -1 + 2 * Integer.highestOneBit(n) - n;
        this.d = 0;
        this.b = 0;
        this.c = null;
    }
    
    void a(final gz p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: aload_1        
        //     5: aconst_null    
        //     6: putfield        com/google/gz.b:Lcom/google/gz;
        //     9: aload_1        
        //    10: aconst_null    
        //    11: putfield        com/google/gz.e:Lcom/google/gz;
        //    14: aload_1        
        //    15: aconst_null    
        //    16: putfield        com/google/gz.f:Lcom/google/gz;
        //    19: aload_1        
        //    20: iconst_1       
        //    21: putfield        com/google/gz.d:I
        //    24: aload_0        
        //    25: getfield        com/google/cj.a:I
        //    28: istore          5
        //    30: iload           5
        //    32: ifle            74
        //    35: iconst_1       
        //    36: aload_0        
        //    37: getfield        com/google/cj.d:I
        //    40: iand           
        //    41: ifne            74
        //    44: aload_0        
        //    45: iconst_1       
        //    46: aload_0        
        //    47: getfield        com/google/cj.d:I
        //    50: iadd           
        //    51: putfield        com/google/cj.d:I
        //    54: aload_0        
        //    55: iconst_m1      
        //    56: aload_0        
        //    57: getfield        com/google/cj.a:I
        //    60: iadd           
        //    61: putfield        com/google/cj.a:I
        //    64: aload_0        
        //    65: iconst_1       
        //    66: aload_0        
        //    67: getfield        com/google/cj.b:I
        //    70: iadd           
        //    71: putfield        com/google/cj.b:I
        //    74: aload_1        
        //    75: aload_0        
        //    76: getfield        com/google/cj.c:Lcom/google/gz;
        //    79: putfield        com/google/gz.e:Lcom/google/gz;
        //    82: aload_0        
        //    83: aload_1        
        //    84: putfield        com/google/cj.c:Lcom/google/gz;
        //    87: aload_0        
        //    88: iconst_1       
        //    89: aload_0        
        //    90: getfield        com/google/cj.d:I
        //    93: iadd           
        //    94: putfield        com/google/cj.d:I
        //    97: aload_0        
        //    98: getfield        com/google/cj.a:I
        //   101: istore          8
        //   103: iload           8
        //   105: ifle            147
        //   108: iconst_1       
        //   109: aload_0        
        //   110: getfield        com/google/cj.d:I
        //   113: iand           
        //   114: ifne            147
        //   117: aload_0        
        //   118: iconst_1       
        //   119: aload_0        
        //   120: getfield        com/google/cj.d:I
        //   123: iadd           
        //   124: putfield        com/google/cj.d:I
        //   127: aload_0        
        //   128: iconst_m1      
        //   129: aload_0        
        //   130: getfield        com/google/cj.a:I
        //   133: iadd           
        //   134: putfield        com/google/cj.a:I
        //   137: aload_0        
        //   138: iconst_1       
        //   139: aload_0        
        //   140: getfield        com/google/cj.b:I
        //   143: iadd           
        //   144: putfield        com/google/cj.b:I
        //   147: iconst_4       
        //   148: istore          9
        //   150: aload_0        
        //   151: getfield        com/google/cj.d:I
        //   154: iload           9
        //   156: iconst_1       
        //   157: isub           
        //   158: iand           
        //   159: iload           9
        //   161: iconst_1       
        //   162: isub           
        //   163: if_icmpne       356
        //   166: aload_0        
        //   167: getfield        com/google/cj.b:I
        //   170: ifne            271
        //   173: aload_0        
        //   174: getfield        com/google/cj.c:Lcom/google/gz;
        //   177: astore          14
        //   179: aload           14
        //   181: getfield        com/google/gz.e:Lcom/google/gz;
        //   184: astore          15
        //   186: aload           15
        //   188: getfield        com/google/gz.e:Lcom/google/gz;
        //   191: astore          16
        //   193: aload           15
        //   195: aload           16
        //   197: getfield        com/google/gz.e:Lcom/google/gz;
        //   200: putfield        com/google/gz.e:Lcom/google/gz;
        //   203: aload_0        
        //   204: aload           15
        //   206: putfield        com/google/cj.c:Lcom/google/gz;
        //   209: aload           15
        //   211: aload           16
        //   213: putfield        com/google/gz.f:Lcom/google/gz;
        //   216: aload           15
        //   218: aload           14
        //   220: putfield        com/google/gz.b:Lcom/google/gz;
        //   223: aload           15
        //   225: iconst_1       
        //   226: aload           14
        //   228: getfield        com/google/gz.d:I
        //   231: iadd           
        //   232: putfield        com/google/gz.d:I
        //   235: aload           16
        //   237: aload           15
        //   239: putfield        com/google/gz.e:Lcom/google/gz;
        //   242: aload           14
        //   244: aload           15
        //   246: putfield        com/google/gz.e:Lcom/google/gz;
        //   249: iload_2        
        //   250: ifeq            346
        //   253: getstatic       com/google/e_.a:Z
        //   256: istore          19
        //   258: iload           19
        //   260: ifeq            385
        //   263: iconst_0       
        //   264: istore          20
        //   266: iload           20
        //   268: putstatic       com/google/e_.a:Z
        //   271: aload_0        
        //   272: getfield        com/google/cj.b:I
        //   275: iconst_1       
        //   276: if_icmpne       333
        //   279: aload_0        
        //   280: getfield        com/google/cj.c:Lcom/google/gz;
        //   283: astore          11
        //   285: aload           11
        //   287: getfield        com/google/gz.e:Lcom/google/gz;
        //   290: astore          12
        //   292: aload_0        
        //   293: aload           12
        //   295: putfield        com/google/cj.c:Lcom/google/gz;
        //   298: aload           12
        //   300: aload           11
        //   302: putfield        com/google/gz.b:Lcom/google/gz;
        //   305: aload           12
        //   307: iconst_1       
        //   308: aload           11
        //   310: getfield        com/google/gz.d:I
        //   313: iadd           
        //   314: putfield        com/google/gz.d:I
        //   317: aload           11
        //   319: aload           12
        //   321: putfield        com/google/gz.e:Lcom/google/gz;
        //   324: aload_0        
        //   325: iconst_0       
        //   326: putfield        com/google/cj.b:I
        //   329: iload_2        
        //   330: ifeq            346
        //   333: aload_0        
        //   334: getfield        com/google/cj.b:I
        //   337: iconst_2       
        //   338: if_icmpne       346
        //   341: aload_0        
        //   342: iconst_0       
        //   343: putfield        com/google/cj.b:I
        //   346: iload           9
        //   348: iconst_2       
        //   349: imul           
        //   350: istore          9
        //   352: iload_2        
        //   353: ifeq            150
        //   356: return         
        //   357: astore_3       
        //   358: aload_3        
        //   359: athrow         
        //   360: astore          4
        //   362: aload           4
        //   364: athrow         
        //   365: astore          6
        //   367: aload           6
        //   369: athrow         
        //   370: astore          7
        //   372: aload           7
        //   374: athrow         
        //   375: astore          17
        //   377: aload           17
        //   379: athrow         
        //   380: astore          18
        //   382: aload           18
        //   384: athrow         
        //   385: iconst_1       
        //   386: istore          20
        //   388: goto            266
        //   391: astore          13
        //   393: aload           13
        //   395: athrow         
        //   396: astore          10
        //   398: aload           10
        //   400: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      30     357    360    Ljava/lang/IllegalStateException;
        //  35     74     360    365    Ljava/lang/IllegalStateException;
        //  74     103    365    370    Ljava/lang/IllegalStateException;
        //  108    147    370    375    Ljava/lang/IllegalStateException;
        //  193    249    375    380    Ljava/lang/IllegalStateException;
        //  253    258    380    385    Ljava/lang/IllegalStateException;
        //  292    329    391    396    Ljava/lang/IllegalStateException;
        //  333    346    396    401    Ljava/lang/IllegalStateException;
        //  358    360    360    365    Ljava/lang/IllegalStateException;
        //  367    370    370    375    Ljava/lang/IllegalStateException;
        //  377    380    380    385    Ljava/lang/IllegalStateException;
        //  393    396    396    401    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 213, Size: 213
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
