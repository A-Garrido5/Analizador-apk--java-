// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.lang.reflect.Method;

public final class o
{
    private static final String[] z;
    private final Method a;
    private final Class b;
    private final fm c;
    private aM d;
    private final Method e;
    
    static {
        final String[] z2 = new String[4];
        final char[] charArray = ":c.ja\u0003d".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0004';
                    break;
                }
                case 0: {
                    c2 = 'L';
                    break;
                }
                case 1: {
                    c2 = '\u0002';
                    break;
                }
                case 2: {
                    c2 = 'B';
                    break;
                }
                case 3: {
                    c2 = '\u001f';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "+g6Ie w'[a?a0vt8m0".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '\u0004';
                    break;
                }
                case 0: {
                    c4 = 'L';
                    break;
                }
                case 1: {
                    c4 = '\u0002';
                    break;
                }
                case 2: {
                    c4 = 'B';
                    break;
                }
                case 3: {
                    c4 = '\u001f';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "\u000ec&?i)q1~c)F'ye9n6Vj?v#qg)\"$pvl".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '\u0004';
                    break;
                }
                case 0: {
                    c6 = 'L';
                    break;
                }
                case 1: {
                    c6 = '\u0002';
                    break;
                }
                case 2: {
                    c6 = 'B';
                    break;
                }
                case 3: {
                    c6 = '\u001f';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "+g6[a?a0vt8m07-la#sh)fb}a*m0z$%l6zv\"c.Vj%vj6".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '\u0004';
                    break;
                }
                case 0: {
                    c8 = 'L';
                    break;
                }
                case 1: {
                    c8 = '\u0002';
                    break;
                }
                case 2: {
                    c8 = 'B';
                    break;
                }
                case 3: {
                    c8 = '\u001f';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        z = z2;
    }
    
    private o(final aM p0, final Class p1, final fm p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: ldc             Lcom/google/fm;.class
        //     6: aload_2        
        //     7: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    10: ifeq            59
        //    13: aload_2        
        //    14: aload_3        
        //    15: invokevirtual   java/lang/Class.isInstance:(Ljava/lang/Object;)Z
        //    18: ifne            59
        //    21: new             Ljava/lang/IllegalArgumentException;
        //    24: dup            
        //    25: new             Ljava/lang/StringBuilder;
        //    28: dup            
        //    29: invokespecial   java/lang/StringBuilder.<init>:()V
        //    32: getstatic       com/google/o.z:[Ljava/lang/String;
        //    35: iconst_2       
        //    36: aaload         
        //    37: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    40: aload_2        
        //    41: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //    44: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    47: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    50: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    53: athrow         
        //    54: astore          7
        //    56: aload           7
        //    58: athrow         
        //    59: aload_0        
        //    60: aload_1        
        //    61: putfield        com/google/o.d:Lcom/google/aM;
        //    64: aload_0        
        //    65: aload_2        
        //    66: putfield        com/google/o.b:Ljava/lang/Class;
        //    69: aload_0        
        //    70: aload_3        
        //    71: putfield        com/google/o.c:Lcom/google/fm;
        //    74: ldc             Lcom/google/gp;.class
        //    76: aload_2        
        //    77: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    80: istore          6
        //    82: iload           6
        //    84: ifeq            132
        //    87: aload_0        
        //    88: aload_2        
        //    89: getstatic       com/google/o.z:[Ljava/lang/String;
        //    92: iconst_0       
        //    93: aaload         
        //    94: iconst_1       
        //    95: anewarray       Ljava/lang/Class;
        //    98: dup            
        //    99: iconst_0       
        //   100: ldc             Lcom/google/dV;.class
        //   102: aastore        
        //   103: invokestatic    com/google/dS.b:(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   106: putfield        com/google/o.e:Ljava/lang/reflect/Method;
        //   109: aload_0        
        //   110: aload_2        
        //   111: getstatic       com/google/o.z:[Ljava/lang/String;
        //   114: iconst_1       
        //   115: aaload         
        //   116: iconst_0       
        //   117: anewarray       Ljava/lang/Class;
        //   120: invokestatic    com/google/dS.b:(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   123: putfield        com/google/o.a:Ljava/lang/reflect/Method;
        //   126: getstatic       com/google/dt.b:Z
        //   129: ifeq            153
        //   132: aload_0        
        //   133: aconst_null    
        //   134: putfield        com/google/o.e:Ljava/lang/reflect/Method;
        //   137: aload_0        
        //   138: aconst_null    
        //   139: putfield        com/google/o.a:Ljava/lang/reflect/Method;
        //   142: return         
        //   143: astore          4
        //   145: aload           4
        //   147: athrow         
        //   148: astore          5
        //   150: aload           5
        //   152: athrow         
        //   153: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  13     54     54     59     Ljava/lang/IllegalArgumentException;
        //  59     82     143    148    Ljava/lang/IllegalArgumentException;
        //  87     132    148    153    Ljava/lang/IllegalArgumentException;
        //  132    142    148    153    Ljava/lang/IllegalArgumentException;
        //  145    148    148    153    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0132:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:692)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:529)
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
    
    o(final aM am, final Class clazz, final fm fm, final d6 d6) {
        this(am, clazz, fm);
    }
    
    static Object a(final o o, final Object o2) {
        return o.b(o2);
    }
    
    private Object a(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dt.b:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: invokevirtual   com/google/o.a:()Lcom/google/hg;
        //     8: astore_3       
        //     9: aload_3        
        //    10: invokevirtual   com/google/hg.b:()Z
        //    13: istore          6
        //    15: iload           6
        //    17: ifeq            116
        //    20: aload_3        
        //    21: invokevirtual   com/google/hg.n:()Lcom/google/hD;
        //    24: getstatic       com/google/hD.MESSAGE:Lcom/google/hD;
        //    27: if_acmpeq       48
        //    30: aload_3        
        //    31: invokevirtual   com/google/hg.n:()Lcom/google/hD;
        //    34: astore          10
        //    36: getstatic       com/google/hD.ENUM:Lcom/google/hD;
        //    39: astore          11
        //    41: aload           10
        //    43: aload           11
        //    45: if_acmpne       104
        //    48: new             Ljava/util/ArrayList;
        //    51: dup            
        //    52: invokespecial   java/util/ArrayList.<init>:()V
        //    55: astore          7
        //    57: aload_1        
        //    58: checkcast       Ljava/util/List;
        //    61: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    66: astore          8
        //    68: aload           8
        //    70: invokeinterface java/util/Iterator.hasNext:()Z
        //    75: ifeq            101
        //    78: aload           7
        //    80: aload_0        
        //    81: aload           8
        //    83: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    88: invokespecial   com/google/o.b:(Ljava/lang/Object;)Ljava/lang/Object;
        //    91: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    96: pop            
        //    97: iload_2        
        //    98: ifeq            68
        //   101: aload           7
        //   103: astore_1       
        //   104: aload_1        
        //   105: areturn        
        //   106: astore          4
        //   108: aload           4
        //   110: athrow         
        //   111: astore          5
        //   113: aload           5
        //   115: athrow         
        //   116: aload_0        
        //   117: aload_1        
        //   118: invokespecial   com/google/o.b:(Ljava/lang/Object;)Ljava/lang/Object;
        //   121: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  9      15     106    111    Ljava/lang/IllegalArgumentException;
        //  20     41     111    116    Ljava/lang/IllegalArgumentException;
        //  108    111    111    116    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0048:
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
    
    static Object b(final o o, final Object o2) {
        return o.a(o2);
    }
    
    private Object b(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   com/google/o.a:()Lcom/google/hg;
        //     4: astore_2       
        //     5: getstatic       com/google/p.a:[I
        //     8: aload_2        
        //     9: invokevirtual   com/google/hg.n:()Lcom/google/hD;
        //    12: invokevirtual   com/google/hD.ordinal:()I
        //    15: iaload         
        //    16: istore          5
        //    18: iload           5
        //    20: tableswitch {
        //                2: 46
        //                3: 93
        //          default: 44
        //        }
        //    44: aload_1        
        //    45: areturn        
        //    46: aload_0        
        //    47: getfield        com/google/o.b:Ljava/lang/Class;
        //    50: aload_1        
        //    51: invokevirtual   java/lang/Class.isInstance:(Ljava/lang/Object;)Z
        //    54: istore          8
        //    56: iload           8
        //    58: ifne            44
        //    61: aload_0        
        //    62: getfield        com/google/o.c:Lcom/google/fm;
        //    65: invokeinterface com/google/fm.newBuilderForType:()Lcom/google/a8;
        //    70: aload_1        
        //    71: checkcast       Lcom/google/fm;
        //    74: invokeinterface com/google/a8.mergeFrom:(Lcom/google/fm;)Lcom/google/a8;
        //    79: invokeinterface com/google/a8.build:()Lcom/google/fm;
        //    84: areturn        
        //    85: astore_3       
        //    86: aload_3        
        //    87: athrow         
        //    88: astore          4
        //    90: aload           4
        //    92: athrow         
        //    93: aload_0        
        //    94: getfield        com/google/o.e:Ljava/lang/reflect/Method;
        //    97: astore          6
        //    99: iconst_1       
        //   100: anewarray       Ljava/lang/Object;
        //   103: astore          7
        //   105: aload           7
        //   107: iconst_0       
        //   108: aload_1        
        //   109: checkcast       Lcom/google/dV;
        //   112: aastore        
        //   113: aload           6
        //   115: aconst_null    
        //   116: aload           7
        //   118: invokestatic    com/google/dS.a:(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   121: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  5      18     85     88     Ljava/lang/IllegalArgumentException;
        //  46     56     88     93     Ljava/lang/IllegalArgumentException;
        //  86     88     88     93     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0046:
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
    
    public hg a() {
        try {
            if (this.d == null) {
                throw new IllegalStateException(o.z[3]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return this.d.a();
    }
    
    public fm b() {
        return this.c;
    }
}
